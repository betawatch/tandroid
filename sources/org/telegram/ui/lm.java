package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lm implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ an a;

    public lm(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        an anVar = this.a;
        if (anVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        q4Var = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
            if (((ActionBarLayout) q4Var2).y()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z10 = tLObject instanceof TLRPC.Chat;
        if (z10) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        if (!z9 || !z10) {
            anVar.presentFragment(new an(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, anVar.getParentActivity(), anVar.getResourceProvider());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, anVar.getResourceProvider());
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(anVar.getParentActivity(), false, false);
        z0Var.j(org.telegram.messenger.hd.M0(2131747810, null), R.drawable.msg_channel, null);
        z0Var.setMinimumWidth(org.telegram.messenger.qs.q2);
        z0Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(anVar.getParentActivity(), false, false);
        z0Var2.j(org.telegram.messenger.hd.M0(2131746661, null), R.drawable.msg_addbot, null);
        z0Var2.setMinimumWidth(org.telegram.messenger.qs.q2);
        z0Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, q1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        an anVar2 = new an(bundle);
        anVar2.ca = true;
        anVar.presentFragmentAsPreviewWithMenu(anVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        anVar.r7();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A1(org.telegram.messenger.ij ijVar) {
        this.a.s.put(ijVar, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        int i7 = messageObject.D;
        an anVar = this.a;
        if (i7 != 16) {
            anVar.X7(q1Var, true, false, f10, f11, messageObject.J3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i10 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = anVar.f;
            if (user != null) {
                boolean K4 = messageObject.K4();
                TLRPC.UserFull userFull = anVar.q8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.y1.m(user, K4, i10, anVar.getParentActivity(), anVar.getMessagesController().b2(anVar.f.id), anVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(anVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i10 < size) {
            TLRPC.Peer peer = arrayList.get(i10);
            i10++;
            hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.f1();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, anVar.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = anVar.getMessagesController().P6;
        u1Var.setOnCancelListener(new bi.g0(this, anVar.getConnectionsManager().sendRequest(getgroupcall, new bi.r8(this, u1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
        u1Var.r(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z10 = (z9 || !vf.c.i(str, false, false)) ? z9 : true;
        an anVar = this.a;
        vf.b bVar = anVar.ac;
        if (bVar != null) {
            bVar.a(true);
        }
        anVar.ac = q1Var.getMessageObject() == null ? null : new hm(this, q1Var);
        if (z10 || vf.c.g(parse, false, null)) {
            vf.c.s(anVar.getParentActivity(), parse, true, true, false, anVar.ac, null, false, true, false, false);
        } else {
            org.telegram.ui.Components.v4.o0(anVar, str, true, true, true, !z10, anVar.ac, webPage, anVar.xa);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.a;
        if (!anVar.getMessagesController().S4()) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, anVar.getParentActivity(), null);
            u1Var.r(200L);
            anVar.getMessagesController().R0(new y(this, u1Var, q1Var, 6));
        } else {
            if (q1Var.getMessageObject() != null) {
                q1Var.getMessageObject().r2 = Boolean.FALSE;
            }
            q1Var.G3();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        an anVar;
        int i7;
        if (q1Var.getMessageObject() == null || (i7 = (anVar = this.a).Wb) == 0 || i7 != q1Var.getMessageObject().f1() || anVar.Xb != 1) {
            return null;
        }
        return anVar.Yb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject;
        if (q1Var == null || (messageObject = q1Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int f12 = messageObject.f1();
        an anVar = this.a;
        if (anVar.Wb == f12 && anVar.Xb == 7) {
            return;
        }
        TLRPC.InputPeer j12 = anVar.getMessagesController().j1(org.telegram.messenger.ij.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = j12;
        getrichmessage.id = f12;
        vf.b bVar = anVar.ac;
        if (bVar != null) {
            bVar.a(true);
            anVar.ac = null;
        }
        int[] iArr = new int[1];
        hi hiVar = new hi(anVar, f12, q1Var, 2);
        hiVar.b = new qf(5, anVar, iArr);
        anVar.ac = hiVar;
        hiVar.d();
        iArr[0] = anVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new bi.t3(anVar, hiVar, iArr, q1Var, messageObject, 3));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            an anVar = this.a;
            org.telegram.ui.Components.vt.N0(anVar, ijVar, anVar.Za, str2, str3, str4, str, i7, i10, -1, anVar.T9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
        e(q1Var, z9, true, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        long j3;
        ViewGroup viewGroup;
        int i7;
        pz0 pz0Var;
        if (ijVar.T4() || ijVar.h4()) {
            rz0 rz0Var = this.a.sa;
            if (rz0Var == null || rz0Var.b0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!ijVar.Q3()) {
                            org.telegram.ui.Components.hc.a0(this.a).w(R.drawable.tooltip_sound, org.telegram.messenger.hd.M0(2131743514, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.sa = new rz0(this.a.getParentActivity());
                rz0 rz0Var2 = this.a.sa;
                ie Hb = !ijVar.Q3() ? this.a.Hb(ijVar, true) : null;
                bi.d3 Z4 = !ijVar.Q3() ? an.Z4(this.a, ijVar) : null;
                Context context = rz0Var2.a;
                bi.x5 x5Var = rz0Var2.c;
                rz0Var2.X = Hb;
                rz0Var2.Y = Z4;
                pz0 pz0Var2 = rz0Var2.N;
                if (pz0Var2 != null) {
                    x5Var.removeView(pz0Var2);
                    rz0Var2.N = null;
                }
                rz0Var2.O = q1Var;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                rz0Var2.M = messageObject;
                rz0Var2.S = messageObject != null && messageObject.i4();
                org.telegram.ui.Cells.q1 q1Var2 = rz0Var2.O;
                rz0Var2.L = q1Var2 != null ? q1Var2.getResourcesProvider() : null;
                if (rz0Var2.O != null) {
                    rz0Var2.T = 0.0f;
                    rz0Var2.U = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        rz0Var2.T = view.getY() + rz0Var2.T;
                        rz0Var2.U = view.getY() + rz0Var2.U;
                    }
                    int width = rz0Var2.O.getWidth();
                    int height = rz0Var2.O.getHeight();
                    if (rz0Var2.S) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.q.y));
                    }
                    rz0Var2.K = height - rz0Var2.O.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.p);
                    j3 = 0;
                    int i10 = height;
                    viewGroup = x5Var;
                    pz0 pz0Var3 = new pz0(rz0Var2, rz0Var2.getContext(), org.telegram.messenger.p10.s0, rz0Var2.O.getResourcesProvider(), width, i10);
                    rz0Var2.N = pz0Var3;
                    rz0Var2.O.u0(pz0Var3);
                    rz0Var2.N.s0(rz0Var2.O);
                    rz0Var2.N.setDelegate(new pb.b(19));
                    pz0 pz0Var4 = rz0Var2.N;
                    org.telegram.messenger.ij ijVar2 = rz0Var2.M;
                    org.telegram.messenger.dj currentMessagesGroup = rz0Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = rz0Var2.O;
                    pz0Var4.v3(ijVar2, currentMessagesGroup, q1Var3.F, q1Var3.E, false, false);
                    if (!rz0Var2.S) {
                        org.telegram.ui.Components.c8 c8Var = new org.telegram.ui.Components.c8();
                        rz0Var2.V = c8Var;
                        pz0 pz0Var5 = rz0Var2.N;
                        c8Var.i = pz0Var5;
                        pz0Var5.uc = c8Var;
                        if (pz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.pm0 seekBarWaveform = rz0Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = rz0Var2.s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    rz0Var2.H = false;
                    viewGroup.addView(rz0Var2.N, new FrameLayout.LayoutParams(rz0Var2.O.getWidth(), i10, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    viewGroup = x5Var;
                    i7 = 360;
                }
                TextureView textureView = rz0Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    rz0Var2.P = null;
                }
                if (rz0Var2.S) {
                    rz0Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    rz0Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, c8.ha.c(i7, i7));
                }
                org.telegram.ui.Components.n51 n51Var = MediaController.B().i0;
                if (n51Var != null) {
                    n51Var.g0();
                }
                org.telegram.ui.Components.n51 n51Var2 = rz0Var2.x;
                if (n51Var2 != null) {
                    n51Var2.g0();
                    rz0Var2.x.m0();
                    rz0Var2.x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = rz0Var2.O;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(rz0Var2.O.getMessageObject().I1);
                    File I = org.telegram.messenger.w7.I(rz0Var2.O.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(rz0Var2.O.getMessageObject().I1);
                        I = org.telegram.messenger.w7.N(rz0Var2.O.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && rz0Var2.O.getMessageObject().k.attachPath != null) {
                        I = new File(rz0Var2.O.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.n51 n51Var3 = new org.telegram.ui.Components.n51();
                        rz0Var2.x = n51Var3;
                        n51Var3.J = new qz0(rz0Var2);
                        if (rz0Var2.V != null) {
                            n51Var3.K = new qz0(rz0Var2);
                        }
                        if (rz0Var2.S) {
                            n51Var3.A0(rz0Var2.P);
                        }
                        rz0Var2.x.j0(Uri.fromFile(I), "other");
                        rz0Var2.x.h0();
                        org.telegram.ui.Components.js jsVar = rz0Var2.E;
                        if (jsVar != null) {
                            jsVar.s = rz0Var2.x;
                            jsVar.a();
                        }
                    }
                    an anVar = this.a;
                    anVar.showDialog(anVar.sa);
                    return false;
                }
                fi.m3 m3Var = rz0Var2.y;
                if (m3Var != null) {
                    viewGroup.removeView(m3Var);
                    rz0Var2.y = null;
                }
                org.telegram.messenger.ij ijVar3 = rz0Var2.M;
                boolean z9 = ijVar3 != null && ijVar3.Q3();
                org.telegram.messenger.ij ijVar4 = rz0Var2.M;
                if (ijVar4 != null && org.telegram.messenger.ij.B0(ijVar4.k) != org.telegram.messenger.p10.i(rz0Var2.M.I1).e()) {
                    fi.m3 m3Var2 = new fi.m3(context, 3);
                    rz0Var2.y = m3Var2;
                    m3Var2.r(true);
                    if (z9) {
                        long B0 = org.telegram.messenger.ij.B0(rz0Var2.M.k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User a22 = org.telegram.messenger.qp.s1(rz0Var2.M.I1).a2(Long.valueOf(B0));
                            if (a22 != null) {
                                str = org.telegram.messenger.t10.j(a22, true);
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(rz0Var2.M.I1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        rz0Var2.y.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, rz0Var2.S ? 2131743591 : 2131743515, str)));
                    } else {
                        rz0Var2.y.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(rz0Var2.S ? 2131743592 : 2131743516, null)));
                    }
                    rz0Var2.y.s(12.0f);
                    rz0Var2.y.setPadding(org.telegram.messenger.g0.L((z9 || rz0Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (rz0Var2.S) {
                        rz0Var2.y.p(0.5f, 0.0f);
                        rz0Var2.y.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        rz0Var2.y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        rz0Var2.y.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    rz0Var2.y.v(14.0f);
                    fi.m3 m3Var3 = rz0Var2.y;
                    m3Var3.h = fi.m3.a(m3Var3.getText(), rz0Var2.y.getTextPaint());
                    if (rz0Var2.S) {
                        viewGroup.addView(rz0Var2.y, c8.ha.d((int) ((rz0Var2.O.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((rz0Var2.O.getHeight() + rz0Var2.K) / org.telegram.messenger.g0.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(rz0Var2.y, c8.ha.d((int) ((rz0Var2.O.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, ((((rz0Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + rz0Var2.O.getBoundsLeft()) / org.telegram.messenger.g0.p) + 1.0f, ((-75.0f) - ((rz0Var2.O.getHeight() / org.telegram.messenger.g0.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    rz0Var2.y.w();
                }
                TextView textView = rz0Var2.D;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    rz0Var2.D = null;
                }
                TextView textView2 = new TextView(context);
                rz0Var2.D = textView2;
                textView2.setTextColor(-1);
                rz0Var2.D.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    rz0Var2.D.setBackground(org.telegram.ui.ActionBar.k6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    rz0Var2.D.setBackground(org.telegram.ui.ActionBar.k6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                rz0Var2.D.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.ka.a(rz0Var2.D);
                rz0Var2.D.setText(org.telegram.messenger.hd.M0(z9 ? 2131743520 : 2131743517, null));
                rz0Var2.D.setOnClickListener(new nz0(rz0Var2, 1));
                viewGroup.addView(rz0Var2.D, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z9 && (pz0Var = rz0Var2.N) != null && pz0Var.getMessageObject() != null && rz0Var2.N.getMessageObject().k != null) {
                    rz0Var2.N.getMessageObject().k.media_unread = false;
                    rz0Var2.N.invalidate();
                }
                an anVar2 = this.a;
                anVar2.showDialog(anVar2.sa);
                return false;
            }
        } else {
            if (org.telegram.messenger.ij.S4(ijVar.k) || ijVar.i4()) {
                boolean S = MediaController.B().S(ijVar);
                MediaController.B().r0(S ? this.a.g8(ijVar, false) : null, false);
                return S;
            }
            if (ijVar.J3()) {
                MediaController B = MediaController.B();
                ArrayList L = this.a.C0.L();
                an anVar3 = this.a;
                return B.o0(L, ijVar, anVar3.b7, true ^ anVar3.C0.N, null, anVar3.v4 ? anVar3.b() : 0L);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F1() {
        org.telegram.ui.ActionBar.f6 f6Var;
        an anVar = this.a;
        if (anVar.l1 == null || anVar.getParentActivity() == null) {
            return;
        }
        Context context = anVar.l1.getContext();
        f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
        sy0.d1(context, anVar, false, f6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
        TLRPC.Message message;
        int i7;
        int i10;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.k) == null) {
            return;
        }
        int i11 = o2Var.a;
        an anVar = this.a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    anVar.X7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i11 == 4) {
                        anVar.f2.n(messageObject.Z1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                boolean A = org.telegram.messenger.t3.A(i7, anVar.e, 24);
                if (A) {
                    i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    org.telegram.messenger.t3.A(i10, anVar.e, 5);
                }
                aa.d0 d0Var = new aa.d0(this, message, A, messageObject, 28);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                anVar.u7(d0Var, cg.a.l(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long o4 = org.telegram.messenger.m5.o(message.from_id);
        org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(20, this, message);
        Pattern pattern = org.telegram.ui.Components.v4.a;
        Activity parentActivity = anVar.getParentActivity();
        int i12 = 0;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(0, parentActivity, null);
        String M0 = org.telegram.messenger.hd.M0(2131744388, null);
        org.telegram.ui.ActionBar.u1 u1Var = w1Var.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744387, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).B1(o4, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, null);
        editText.setHint(org.telegram.messenger.hd.M0(2131744386, null));
        org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.H6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.k6.U(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.m4(parentActivity)});
        editText.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        w1Var.o(frameLayout);
        w1Var.k(org.telegram.messenger.hd.M0(2131751605, null), new ni.c(26, kVar, editText));
        w1Var.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        u1Var.N = new org.telegram.ui.Components.i1(editText, i12);
        frameLayout.addView(editText, c8.ha.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.xf(editText, 3), 100L);
        anVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.h6(true);
        an anVar = this.a;
        anVar.getMessagesStorage().X1(org.telegram.messenger.ij.B0(messageObject.k), messageObject.k);
        anVar.getMessagesController().s7.h(messageObject, true, false);
        e(q1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.a;
        anVar.Qa.k(q1Var, anVar, true);
        anVar.z0.I0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        hi hiVar;
        int i7;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        bg.m0 m0Var = null;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.k;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int i10 = -1;
                for (int i11 = 0; i11 < tL_messageMediaPaidMedia.extended_media.size(); i11++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i11);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            i10 = arrayList.size();
                        }
                        TLRPC.TL_message Q7 = an.Q7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            Q7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            Q7.attachPath = message.attachPath;
                        }
                        Q7.media = tL_messageExtendedMedia.media;
                        Q7.noforwards = true;
                        arrayList.add(new org.telegram.messenger.ij(messageObject.I1, Q7, false, true));
                    }
                }
                if (i10 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer p12 = PhotoViewer.p1();
                an anVar = this.a;
                p12.H2(null, anVar, anVar.xa);
                PhotoViewer.p1().Z1(arrayList, i10, this.a.a(), 0L, 0L, this.a.ab);
                return;
            }
            return;
        }
        an anVar2 = this.a;
        vf.b bVar = anVar2.ac;
        if (bVar != null) {
            bVar.a(true);
            anVar2.ac = null;
        }
        if (q1Var.getMessageObject() == null) {
            anVar2.ac = null;
            hiVar = null;
        } else {
            hiVar = new hi(anVar2, q1Var.getMessageObject().f1(), q1Var, 1);
            anVar2.ac = hiVar;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) this.a).currentAccount;
        bi.ea y10 = bi.ea.y(i7, false);
        Objects.requireNonNull(hiVar);
        bh bhVar = new bh(hiVar, 8);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.f6 I = bi.ea.I();
        if (messageObject != null && context != null) {
            long B0 = org.telegram.messenger.ij.B0(messageObject.k);
            int f12 = messageObject.f1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = org.telegram.messenger.qp.s1(y10.a).j1(B0);
            tL_inputInvoiceMessage.msg_id = f12;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = hi.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            m0Var = new bg.m0(y10, ConnectionsManager.getInstance(y10.a).sendRequest(tL_payments_getPaymentForm, new bi.g2(y10, messageObject, tL_inputInvoiceMessage, bhVar, 2)), 1);
        }
        if (m0Var != null) {
            hiVar.b = m0Var;
            hiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.hc b10;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        an anVar = this.a;
        if (!isEmpty) {
            vf.c.t(anVar.getParentActivity(), "https://" + anVar.getMessagesController().U2 + "/nft/" + str);
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        ug.f1 f1Var = new ug.f1(anVar, i7, user, null, null, anVar.xa);
        q1Var.getLocationOnScreen(new int[2]);
        f1Var.n2 = q1Var.getNameStatusX();
        f1Var.o2 = q1Var.getNameStatusY();
        f1Var.r2 = q1Var.getScaleX();
        f1Var.p2 = q1Var.getLeft();
        f1Var.q2 = q1Var.getTop();
        f1Var.s2 = q1Var;
        int e10 = org.telegram.messenger.t10.e(user);
        if (e10 < 7) {
            f1Var.m2 = Integer.valueOf(anVar.getThemedColor(org.telegram.ui.ActionBar.k6.r8[e10]));
        } else {
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(i10).q4;
            org.telegram.messenger.fp d = gpVar != null ? gpVar.d(e10) : null;
            f1Var.m2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        org.telegram.ui.Components.g5 g5Var = q1Var.pa;
        if (g5Var != null && (g5Var.f[0] instanceof org.telegram.ui.Components.i5)) {
            f1Var.r2 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(anVar.getParentActivity());
                org.telegram.messenger.rz d2 = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.hc.b(document);
                    if (d2 != null) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    str2 = "160_160_g";
                } else {
                    if (d2 != null && org.telegram.messenger.ij.L2(document, false)) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    b10 = org.telegram.messenger.hc.b(document);
                    str2 = "160_160";
                }
                org.telegram.messenger.hc hcVar = b10;
                String str3 = str2;
                l9Var.setLayerNum(7);
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                l9Var.m(hcVar, str3, org.telegram.messenger.hc.c(w10, document), "140_140", d2, document);
                if (org.telegram.messenger.ij.D4(document)) {
                    Integer num = f1Var.m2;
                    l9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : anVar.getThemedColor(org.telegram.ui.ActionBar.k6.v6), PorterDuff.Mode.SRC_IN));
                    f1Var.u2 = org.telegram.messenger.ij.j1(document);
                } else {
                    f1Var.u2 = org.telegram.messenger.ij.j1(document);
                }
                f1Var.t2 = l9Var;
                f1Var.w2 = true;
            }
        }
        anVar.showDialog(f1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J(org.telegram.messenger.fj fjVar) {
        StaticLayout staticLayout = fjVar.e;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = fjVar.e.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ni.j(fjVar.K, charSequence, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.camera.q.r(null, 2131752022, org.telegram.ui.Components.hc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean J0(long j3) {
        TLRPC.ChatFull N0;
        an anVar = this.a;
        TLRPC.Chat chat = anVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.qp messagesController = anVar.getMessagesController();
        long j10 = anVar.e.id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (messagesController.getUserConfig().e() == j3 && M0 != null && M0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.x1.f(j10);
        if (hVar == null && (N0 = messagesController.N0(j10)) != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j3)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0881 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09d4 A[LOOP:3: B:253:0x09d2->B:254:0x09d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0974  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        yr0 yr0Var;
        TLRPC.PollAnswer pollAnswer2;
        yr0 yr0Var2;
        ur0 ur0Var;
        dh.c cVar;
        org.telegram.messenger.ij ijVar;
        TLRPC.ChatFull chatFull;
        boolean z9;
        boolean z10;
        boolean z11;
        yr0 yr0Var3;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.Components.k60 k60Var;
        an anVar;
        boolean z12;
        ne neVar;
        int size;
        int i7;
        ViewGroup viewGroup;
        yr0 yr0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull N0;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z14;
        byte[] bArr;
        ur0 ur0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        yr0 yr0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        String str;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        String str2;
        boolean z16;
        sh.n nVar;
        String str3;
        boolean z17;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        an anVar2 = this.a;
        if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
            fi.m3 m3Var = anVar2.L1;
            if (m3Var != null && m3Var.V) {
                m3Var.f(true);
            }
            zk zkVar = anVar2.P1;
            if (zkVar != null && zkVar.V) {
                zkVar.f(true);
            }
            org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia n1 = org.telegram.messenger.ij.n1(primaryMessageObject);
            if (primaryMessageObject != null && (n1 instanceof TLRPC.TL_messageMediaPoll)) {
                anVar2.t5 = primaryMessageObject;
                anVar2.u5 = null;
                yr0 yr0Var6 = new yr0(anVar2.getParentActivity(), anVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                yr0Var6.L = q1Var;
                yr0Var6.P = bArr3;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                yr0Var6.H = messageObject;
                yr0Var6.I = messageObject != null && messageObject.Q3();
                org.telegram.ui.Cells.q1 q1Var2 = yr0Var6.L;
                ur0 ur0Var3 = yr0Var6.d;
                if (q1Var2 != null) {
                    yr0Var6.M = anVar2.L9 - org.telegram.messenger.g0.L(4.0f);
                    yr0Var6.N = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        yr0Var6.M = view.getY() + yr0Var6.M;
                        yr0Var6.N = view.getY() + yr0Var6.N;
                    }
                    int width = yr0Var6.L.getWidth();
                    int height = yr0Var6.L.getHeight();
                    yr0Var6.L.getHeight();
                    wr0 wr0Var = new wr0(yr0Var6, yr0Var6.getContext(), org.telegram.messenger.p10.s0, yr0Var6.L.getResourcesProvider(), bArr3, width, height);
                    yr0Var = yr0Var6;
                    yr0Var.J = wr0Var;
                    yr0Var.L.r0(wr0Var);
                    yr0Var.J.s0(yr0Var.L);
                    yr0Var.J.setDelegate(new w7.s(18, false));
                    wr0 wr0Var2 = yr0Var.J;
                    org.telegram.messenger.ij ijVar3 = yr0Var.H;
                    org.telegram.messenger.dj currentMessagesGroup = yr0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = yr0Var.L;
                    wr0Var2.v3(ijVar3, currentMessagesGroup, q1Var3.F, q1Var3.E, q1Var3.G, false);
                    wr0 wr0Var3 = yr0Var.J;
                    wr0Var3.d6 = bArr3;
                    ur0Var3.addView(wr0Var3, new FrameLayout.LayoutParams(yr0Var.L.getWidth(), height, 51));
                    xr0 xr0Var = new xr0(yr0Var.getContext(), org.telegram.messenger.p10.s0, yr0Var.L.getResourcesProvider(), width, height, 0);
                    yr0Var.K = xr0Var;
                    yr0Var.L.u0(xr0Var);
                    yr0Var.L.r0(yr0Var.K);
                    yr0Var.K.s0(yr0Var.L);
                    yr0Var.K.setDelegate(new sa.d(18));
                    xr0 xr0Var2 = yr0Var.K;
                    org.telegram.messenger.ij ijVar4 = yr0Var.H;
                    org.telegram.messenger.dj currentMessagesGroup2 = yr0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = yr0Var.L;
                    xr0Var2.v3(ijVar4, currentMessagesGroup2, q1Var4.F, q1Var4.E, q1Var4.G, false);
                    ur0Var3.addView(yr0Var.K, new FrameLayout.LayoutParams(yr0Var.L.getWidth(), height, 51));
                } else {
                    yr0Var = yr0Var6;
                }
                fi.g1 g1Var = yr0Var.f;
                g1Var.bringToFront();
                ur0 ur0Var4 = yr0Var.e;
                ur0Var4.bringToFront();
                yr0Var.n.bringToFront();
                g1Var.w(false);
                Context context = yr0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.f6 f6Var = yr0Var.b;
                org.telegram.ui.Components.k60 G = org.telegram.ui.Components.k60.G(ur0Var3, f6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.ij.n1(yr0Var.H);
                yr0Var.V = org.telegram.messenger.ij.X4(tL_messageMediaPoll4);
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_messageMediaPoll4.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll4.poll.answers.get(i10).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll4.poll.answers.get(i10);
                        break;
                    }
                    i10++;
                }
                dh.c cVar2 = yr0Var.G;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z18 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z19 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z14 = z19;
                        bArr = bArr3;
                        ur0Var2 = ur0Var3;
                        pollAnswerVoters = null;
                        z15 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z14 = z19;
                        int i11 = 0;
                        z15 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i11 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i11);
                            int i12 = i11 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            ur0 ur0Var5 = ur0Var3;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z15 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList4 = tL_messageMediaPoll4.poll.answers;
                                int size3 = arrayList4.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll4;
                                int i13 = 0;
                                while (i13 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList4.get(i13);
                                    int i14 = i13 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList5 = arrayList4;
                                    int i15 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    arrayList4 = arrayList5;
                                    i13 = i14;
                                    size3 = i15;
                                }
                                ur0Var3 = ur0Var5;
                                i11 = i12;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                ur0Var3 = ur0Var5;
                                i11 = i12;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        ur0Var2 = ur0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !org.telegram.messenger.ij.A(tL_messageMediaPoll)) {
                        yr0Var5 = yr0Var;
                        arrayList = arrayList3;
                        ijVar = primaryMessageObject;
                        ur0Var = ur0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        sh.n nVar2 = new sh.n(anVar2.getCurrentAccount(), context, f6Var);
                        org.telegram.ui.Components.k60 J = G.J();
                        J.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                        gh.a k10 = c8.g0.k(f6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            nVar = nVar2;
                            str3 = null;
                            z17 = false;
                            fh.g c10 = cVar2.c(view3, null, false);
                            c10.p(k10);
                            view3.setBackground(c10);
                        } else {
                            nVar = nVar2;
                            str3 = null;
                            z17 = false;
                        }
                        J.c(R.drawable.ic_ab_back, org.telegram.messenger.hd.M0(2131753756, str3), new fq0(G, 27), z17);
                        J.k();
                        long B0 = org.telegram.messenger.ij.B0(yr0Var.H.k);
                        int f12 = yr0Var.H.f1();
                        int i16 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.ex exVar = new org.telegram.ui.Components.ex(19, yr0Var, anVar2);
                        yr0Var5 = yr0Var;
                        ijVar = primaryMessageObject;
                        arrayList = arrayList3;
                        ur0Var = ur0Var2;
                        sh.n nVar3 = nVar;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a10 = nVar3.a(anVar2, B0, f12, bArr5, i16, exVar);
                        anVar2 = anVar2;
                        bArr2 = bArr5;
                        J.q(a10);
                        nVar3.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
                        nVar3.setText(org.telegram.messenger.hd.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        nVar3.a.d(pollAnswerVoters.recent_voters, false);
                        nVar3.setLayoutParams(c8.ha.o(-1, 48));
                        int i17 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 12, 0);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
                        nVar3.setBackground(a02);
                        org.telegram.ui.ActionBar.r6.k(nVar3, a02, null, N, null);
                        nVar3.setOnClickListener(new fk0(3, G, J));
                        G.q(nVar3);
                        G.k();
                    }
                    if (!z18) {
                        yr0Var2 = yr0Var5;
                        pollAnswer3 = pollAnswer2;
                        str = null;
                    } else if (z15) {
                        str = null;
                        CharSequence M0 = org.telegram.messenger.hd.M0(2131743825, null);
                        yr0Var2 = yr0Var5;
                        an anVar3 = anVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable rr0Var = new rr0(yr0Var2, z14, anVar3, arrayList, pollAnswer6);
                        anVar2 = anVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(R.drawable.msg_unvote, M0, rr0Var, false);
                    } else {
                        yr0Var2 = yr0Var5;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        str = null;
                        if (sh.g.a(yr0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, org.telegram.messenger.hd.M0(2131747155, null), new rr0(yr0Var2, z14, pollAnswer3, anVar2, arrayList6), false);
                        }
                    }
                    if (anVar2.S6()) {
                        G.c(R.drawable.menu_reply, org.telegram.messenger.hd.M0(2131747169, str), new mc0(yr0Var2, anVar2, pollAnswer3, 23), false);
                    }
                    if (org.telegram.messenger.ij.B0(yr0Var2.H.k) >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        str2 = null;
                        z16 = false;
                    } else {
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(yr0Var2.H.I1);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String r10 = org.telegram.messenger.m5.r(s12.e2(org.telegram.messenger.ij.B0(yr0Var2.H.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(s12.U2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r10)) {
                            r10 = "c/" + (-org.telegram.messenger.ij.B0(yr0Var2.H.k));
                        }
                        sb2.append(r10);
                        sb2.append("/");
                        sb2.append(yr0Var2.H.f1());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        String sb3 = sb2.toString();
                        str2 = null;
                        z16 = false;
                        G.c(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131751762, null), new qn0(7, yr0Var2, sb3), false);
                    }
                    G.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, str2), new qn0(8, yr0Var2, pollAnswer3), z16);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        long e10 = org.telegram.messenger.p10.i(yr0Var2.H.I1).e();
                        cVar = cVar2;
                        long currentTime = ConnectionsManager.getInstance(yr0Var2.H.I1).getCurrentTime();
                        an anVar4 = anVar2;
                        long M1 = org.telegram.messenger.qp.s1(yr0Var2.H.I1).x7.K.M1(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!org.telegram.messenger.ij.m3(yr0Var2.H.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (o4 == e10 && currentTime < M1))) {
                                G.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751599, null), new qn0(9, yr0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject e22 = org.telegram.messenger.qp.s1(yr0Var2.H.I1).e2(o4);
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131747180, org.telegram.messenger.m5.u(e22), org.telegram.messenger.hd.x(pollAnswer3.date, true)));
                        anVar2 = anVar4;
                        ea0 ea0Var = new ea0(yr0Var2, o4, anVar2, 1);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i18 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.ActionBar.f6 f6Var2 = G.d;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i18, f6Var2), 0, 12);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
                        frameLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, a03, null, N2, f6Var2);
                        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context2);
                        l9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
                        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                        w8Var.l(e22);
                        l9Var.e(e22, w8Var);
                        frameLayout.addView(l9Var, c8.ha.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(W2);
                        textView.setMaxWidth(org.telegram.messenger.g0.L(150.0f));
                        textView.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.lk(15, G, ea0Var));
                        G.r(frameLayout, c8.ha.o(-1, -2));
                    } else {
                        cVar = cVar2;
                    }
                } else {
                    yr0Var2 = yr0Var;
                    ur0Var = ur0Var3;
                    cVar = cVar2;
                    ijVar = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                G.Q(cVar, c8.g0.k(f6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                yr0Var2.R = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                yr0Var2.R.setPivotY(0.0f);
                ur0Var4.addView(yr0Var2.R, c8.ha.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                anVar2.E8(ijVar, arrayList7, arrayList8, arrayList9);
                ne neVar2 = new ne(anVar2, 9);
                org.telegram.messenger.ij ijVar5 = yr0Var2.H;
                ArrayList arrayList10 = anVar2.getMediaDataController().n;
                boolean z20 = (anVar2.z() || anVar2.c() || anVar2.f != null || !ijVar5.x2() || (org.telegram.messenger.t3.T(anVar2.e) && !anVar2.e.megagroup) || org.telegram.messenger.t3.p0(anVar2.e) || arrayList10.isEmpty() || !ijVar5.k.reactions.can_see_list || ijVar5.m4()) ? false : true;
                boolean z21 = !ijVar5.l3() ? ijVar5.m4() || anVar2.f4 == 5 || anVar2.z() || anVar2.c() || !ijVar5.e4() || ((((chatFull = anVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.t3.T(anVar2.e)) && anVar2.f == null && !org.telegram.messenger.t3.p0(anVar2.e))) || arrayList10.isEmpty()) : (N0 = anVar2.getMessagesController().N0(-ijVar5.Z0())) != null && (anVar2.z() || anVar2.f4 == 5 || anVar2.c() || !ijVar5.e4() || (((N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !N0.paid_reactions_available) || arrayList10.isEmpty()));
                if (!z20 && !anVar2.c() && anVar2.e != null && ijVar5.Q3() && ijVar5.r4() && !ijVar5.Z2() && !ijVar5.p4() && !ijVar5.o4() && !ijVar5.k.media_unread && !ijVar5.G4() && ConnectionsManager.getInstance(anVar2.getCurrentAccount()).getCurrentTime() - ijVar5.k.date < anVar2.getMessagesController().q3 && ((org.telegram.messenger.t3.n0(anVar2.e) || !org.telegram.messenger.t3.T(anVar2.e)) && (chatFull2 = anVar2.p8) != null && chatFull2.participants_count <= anVar2.getMessagesController().p3 && !(ijVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                    if (anVar2.f4 != 3 && ijVar5.z() && !org.telegram.messenger.t3.p0(anVar2.e)) {
                        z9 = true;
                        if (anVar2.e != null && !ijVar5.O3() && org.telegram.messenger.t3.p0(anVar2.e) && org.telegram.messenger.t3.A(anVar2.getCurrentAccount(), anVar2.e, 24)) {
                            int i19 = ((-anVar2.e.linked_monoforum_id) > ijVar5.Z0() ? 1 : ((-anVar2.e.linked_monoforum_id) == ijVar5.Z0() ? 0 : -1));
                        }
                        if (!z20 && anVar2.e == null && anVar2.h == null && (user = anVar2.f) != null && !org.telegram.messenger.t10.B(user) && !org.telegram.messenger.t10.z(anVar2.f) && !org.telegram.messenger.t10.s(anVar2.f)) {
                            user2 = anVar2.f;
                            if (!user2.bot && !org.telegram.messenger.t10.A(user2.id) && (((userFull = anVar2.q8) == null || !userFull.read_dates_private) && !anVar2.c() && ijVar5.Q3() && ijVar5.r4() && !ijVar5.Z2() && !ijVar5.p4() && !ijVar5.o4() && !ijVar5.k.media_unread && !ijVar5.G4() && anVar2.getConnectionsManager().getCurrentTime() - ijVar5.k.date < anVar2.getMessagesController().r3 && !(ijVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z10 = true;
                                TLRPC.User user3 = anVar2.f;
                                boolean z22 = ((user3 == null && (org.telegram.messenger.t10.z(user3) || org.telegram.messenger.t10.s(anVar2.f))) || anVar2.c() || !ijVar5.Y2() || (ijVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                z11 = z9;
                                org.telegram.ui.Components.k60 G2 = org.telegram.ui.Components.k60.G(ur0Var, anVar2.getResourceProvider(), null, !z20 || z9);
                                if (z11) {
                                    yr0Var3 = yr0Var2;
                                    ijVar2 = ijVar5;
                                    k60Var = G2;
                                    anVar = anVar2;
                                    z12 = z21;
                                    neVar = neVar2;
                                    if (z10) {
                                        k60Var.r(new org.telegram.ui.Components.na0(yr0Var3.getContext(), 0, ijVar2, new pr0(yr0Var3, 1), yr0Var3.b), c8.ha.o(-1, 36));
                                        k60Var.k();
                                    } else if (z22) {
                                        k60Var.r(new org.telegram.ui.Components.na0(yr0Var3.getContext(), 1, ijVar2, new pr0(yr0Var3, 2), yr0Var3.b), c8.ha.o(-1, 36));
                                        k60Var.k();
                                    }
                                } else {
                                    jf0 jf0Var = new jf0(yr0Var2.getContext(), anVar2.getCurrentAccount(), ijVar5, anVar2.e);
                                    FrameLayout frameLayout2 = new FrameLayout(yr0Var2.getContext());
                                    frameLayout2.addView(jf0Var, c8.ha.c(36.0f, -1));
                                    org.telegram.ui.Components.k60 J2 = G2.J();
                                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, yr0Var2.getContext(), yr0Var2.b, true, false);
                                    z0Var.setItemHeight(44);
                                    yr0 yr0Var7 = yr0Var2;
                                    z0Var.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                                    ijVar2 = ijVar5;
                                    z0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                                    FrameLayout frameLayout3 = new FrameLayout(yr0Var7.getContext());
                                    LinearLayout linearLayout = new LinearLayout(yr0Var7.getContext());
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, linearLayout, f6Var);
                                    linearLayout.setOrientation(1);
                                    an anVar5 = anVar2;
                                    org.telegram.ui.Components.pj0 a11 = jf0Var.a();
                                    frameLayout3.addView(z0Var);
                                    linearLayout.addView(frameLayout3);
                                    z12 = z21;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(yr0Var7.getContext(), f6Var), c8.ha.o(-1, 8));
                                    frameLayout3.setOnClickListener(new sr0(G2, 0));
                                    neVar = neVar2;
                                    tr0 tr0Var = new tr0(yr0Var7, jf0Var, anVar5, a11, linearLayout, G2, J2);
                                    anVar = anVar5;
                                    yr0Var3 = yr0Var7;
                                    k60Var = G2;
                                    jf0Var.setOnClickListener(tr0Var);
                                    linearLayout.addView(a11, c8.ha.o(-1, -2));
                                    J2.q(linearLayout);
                                    k60Var.q(frameLayout2);
                                    k60Var.k();
                                }
                                size = arrayList7.size();
                                for (i7 = 0; i7 < size; i7++) {
                                    k60Var.c(((Integer) arrayList7.get(i7)).intValue(), (CharSequence) arrayList8.get(i7), new d10(yr0Var3, neVar, ((Integer) arrayList9.get(i7)).intValue(), 7), false);
                                }
                                k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                                k60Var.Q(cVar, c8.g0.k(f6Var), false);
                                k60Var.Y();
                                ViewGroup viewGroup3 = k60Var.A;
                                yr0Var3.T = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                yr0Var3.T.setPivotY(0.0f);
                                ur0Var4.addView(yr0Var3.T, c8.ha.e(-2, -2, 51));
                                viewGroup = yr0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    int i20 = 5;
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new li0(yr0Var3, i20));
                                    yr0Var3.T.setOnTouchListener(new d0(yr0Var3, i20));
                                }
                                if (z12) {
                                    yr0Var4 = yr0Var3;
                                    z13 = true;
                                } else {
                                    yr0 yr0Var8 = yr0Var3;
                                    an anVar6 = anVar;
                                    org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0((anVar.getUserConfig().e() > anVar.a() ? 1 : (anVar.getUserConfig().e() == anVar.a() ? 0 : -1)) == 0 ? 3 : 0, anVar.getCurrentAccount(), yr0Var3.getContext(), anVar6, yr0Var3.b);
                                    ii0Var.a = true;
                                    float f10 = 22;
                                    ii0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                                    yr0Var4 = yr0Var8;
                                    org.telegram.messenger.ij ijVar6 = ijVar2;
                                    ii0Var.setDelegate(new ui.e(yr0Var4, anVar6, ijVar6, ii0Var, 9));
                                    yr0Var4.Q = ii0Var;
                                    ur0Var4.addView(ii0Var, c8.ha.e(-2, (int) ((ii0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                                    z13 = true;
                                    ii0Var.p(ijVar6, anVar6.p8, true);
                                    yr0Var4.Q.setTransitionProgress(1.0f);
                                }
                                yr0Var4.e();
                                yr0Var4.e0 = new tl(this, 0);
                                yr0Var4.show();
                                return z13;
                            }
                        }
                        z10 = false;
                        TLRPC.User user32 = anVar2.f;
                        if (user32 == null) {
                        }
                        z11 = z9;
                        org.telegram.ui.Components.k60 G22 = org.telegram.ui.Components.k60.G(ur0Var, anVar2.getResourceProvider(), null, !z20 || z9);
                        if (z11) {
                        }
                        size = arrayList7.size();
                        while (i7 < size) {
                        }
                        k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                        k60Var.Q(cVar, c8.g0.k(f6Var), false);
                        k60Var.Y();
                        ViewGroup viewGroup32 = k60Var.A;
                        yr0Var3.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        yr0Var3.T.setPivotY(0.0f);
                        ur0Var4.addView(yr0Var3.T, c8.ha.e(-2, -2, 51));
                        viewGroup = yr0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        yr0Var4.e();
                        yr0Var4.e0 = new tl(this, 0);
                        yr0Var4.show();
                        return z13;
                    }
                }
                z9 = false;
                if (anVar2.e != null) {
                    int i192 = ((-anVar2.e.linked_monoforum_id) > ijVar5.Z0() ? 1 : ((-anVar2.e.linked_monoforum_id) == ijVar5.Z0() ? 0 : -1));
                }
                if (!z20) {
                    user2 = anVar2.f;
                    if (!user2.bot) {
                        z10 = true;
                        TLRPC.User user322 = anVar2.f;
                        if (user322 == null) {
                        }
                        z11 = z9;
                        org.telegram.ui.Components.k60 G222 = org.telegram.ui.Components.k60.G(ur0Var, anVar2.getResourceProvider(), null, !z20 || z9);
                        if (z11) {
                        }
                        size = arrayList7.size();
                        while (i7 < size) {
                        }
                        k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                        k60Var.Q(cVar, c8.g0.k(f6Var), false);
                        k60Var.Y();
                        ViewGroup viewGroup322 = k60Var.A;
                        yr0Var3.T = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        yr0Var3.T.setPivotY(0.0f);
                        ur0Var4.addView(yr0Var3.T, c8.ha.e(-2, -2, 51));
                        viewGroup = yr0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        yr0Var4.e();
                        yr0Var4.e0 = new tl(this, 0);
                        yr0Var4.show();
                        return z13;
                    }
                }
                z10 = false;
                TLRPC.User user3222 = anVar2.f;
                if (user3222 == null) {
                }
                z11 = z9;
                org.telegram.ui.Components.k60 G2222 = org.telegram.ui.Components.k60.G(ur0Var, anVar2.getResourceProvider(), null, !z20 || z9);
                if (z11) {
                }
                size = arrayList7.size();
                while (i7 < size) {
                }
                k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                k60Var.Q(cVar, c8.g0.k(f6Var), false);
                k60Var.Y();
                ViewGroup viewGroup3222 = k60Var.A;
                yr0Var3.T = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                yr0Var3.T.setPivotY(0.0f);
                ur0Var4.addView(yr0Var3.T, c8.ha.e(-2, -2, 51));
                viewGroup = yr0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                yr0Var4.e();
                yr0Var4.e0 = new tl(this, 0);
                yr0Var4.show();
                return z13;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
        if (q1Var == null || document == null) {
            return;
        }
        an anVar = this.a;
        if (anVar.getParentLayout() == null || !a0(q1Var)) {
            return;
        }
        boolean K3 = org.telegram.messenger.ij.K3(document);
        q1Var.setScrimBlockBounds(rectF);
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(anVar, q1Var);
        H.c(R.drawable.msg_download, org.telegram.messenger.hd.M0(K3 ? 2131745912 : 2131745932, null), new o1(this, q1Var, document, 26), false);
        H.p = new xl(q1Var, rectF, 0);
        H.Z();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        bi.d3 d3Var;
        org.telegram.messenger.dj djVar;
        int i10;
        an anVar = this.a;
        wh.i iVar = anVar.qa;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        wh.h hVar = (wh.h) hashMap.get(wh.i.b(q1Var));
        org.telegram.ui.Components.cc ccVar = null;
        org.telegram.messenger.ij ijVar = hVar != null ? hVar.E : null;
        wh.h hVar2 = (wh.h) anVar.qa.a.get(wh.i.b(q1Var));
        long j3 = (hVar2 == null || (i10 = hVar2.R) == -1) ? 0L : hVar2.x[i10].d;
        if (ijVar != null && j3 != 0) {
            Activity parentActivity = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            if (!org.telegram.ui.Components.v4.h(parentActivity, i7, j3, false)) {
                ArrayList arrayList = (ijVar.d1() == 0 || (djVar = (org.telegram.messenger.dj) anVar.N6.f(ijVar.d1())) == null) ? null : djVar.d;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.k5.k(ijVar);
                }
                boolean z9 = j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n;
                long j10 = j3;
                bi.d3 d3Var2 = new bi.d3(this, arrayList, j10, 17);
                if (z9) {
                    d3Var2.run();
                    d3Var = null;
                } else {
                    d3Var = d3Var2;
                }
                ccVar = org.telegram.ui.Components.hc.v(anVar.getParentActivity(), anVar, null, 1, j10, 1, anVar.getThemedColor(org.telegram.ui.ActionBar.k6.tj), anVar.getThemedColor(org.telegram.ui.ActionBar.k6.vj), 5000, false, d3Var);
                ccVar.k = true;
                ccVar.k(ccVar.e instanceof org.telegram.ui.Components.nb);
            }
        }
        wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(q1Var));
        if (hVar3 != null) {
            if (ccVar == null) {
                hVar3.R = -1;
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.gb gbVar = ccVar.e;
            if (!(gbVar instanceof org.telegram.ui.Components.kb)) {
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) gbVar;
            hVar3.W = kbVar;
            kbVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new kw(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o10 o10Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            o10Var.run();
            return;
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null || ((messageObject.p4() && !messageObject.Z2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            o10Var.run();
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = this.a;
            f2Var.getSendMessagesHelper().v(messageObject, messageObject.k.rich_message, null, f2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        an anVar = this.a;
        anVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, anVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        this.a.j8(characterStyle, z9, q1Var.getMessageObject(), q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final er0 N1() {
        return this.a.Pa;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        org.telegram.messenger.ij messageObject;
        org.telegram.messenger.dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.ij) arrayList.get(0);
                if (messageObject != null) {
                    an anVar = this.a;
                    boolean z10 = !anVar.Mc && messageObject.f1() == anVar.Lc;
                    if (!z9) {
                        return z10;
                    }
                    if (z10 && System.currentTimeMillis() - anVar.Nc > 1000) {
                        return true;
                    }
                }
                return false;
            }
        }
        messageObject = q1Var.getMessageObject();
        if (messageObject != null) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P(org.telegram.messenger.ij ijVar) {
        if (org.telegram.messenger.ij.M4(ijVar.k)) {
            this.a.Hb(ijVar, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P0(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.a;
        anVar.getNotificationCenter().k(org.telegram.messenger.qs.n3, Long.valueOf(anVar.j6), q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ni.j(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.camera.q.r(null, 2131752022, org.telegram.ui.Components.hc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z9) {
        int i7;
        int i10;
        boolean m32 = org.telegram.messenger.ij.m3(q1Var.getMessageObject().k);
        an anVar = this.a;
        if (m32) {
            long o4 = org.telegram.messenger.m5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar);
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            a02.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744088, org.telegram.messenger.m5.l(i10, o4)))).k(true);
            return false;
        }
        if (!q1Var.getMessageObject().q()) {
            long o10 = org.telegram.messenger.m5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(anVar);
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            a03.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744089, org.telegram.messenger.m5.l(i7, o10)))).k(true);
            return false;
        }
        if (!anVar.getUserConfig().q()) {
            org.telegram.ui.Components.hc.a0(anVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131744065, null), new tl(this, 9))).k(true);
            return false;
        }
        final long M = org.telegram.messenger.t3.M(anVar.e, anVar.p8, true);
        final org.telegram.messenger.gz sendMessagesHelper = anVar.getSendMessagesHelper();
        final org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.ij.B0(messageObject.k)), Integer.valueOf(messageObject.f1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.H.put(Integer.valueOf(hash), Boolean.valueOf(z9));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.f1();
        tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().j1(org.telegram.messenger.ij.B0(messageObject.k));
        if (z9) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: org.telegram.messenger.qy
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gz gzVar = gz.this;
                final boolean z10 = z9;
                if (tL_error == null) {
                    final yr messagesStorage = gzVar.getMessagesStorage();
                    ij ijVar = messageObject;
                    final long B0 = ij.B0(ijVar.k);
                    final int f12 = ijVar.f1();
                    final int i11 = todoItem.id;
                    final long e10 = messagesStorage.getUserConfig().e();
                    final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                    p5 p5Var = messagesStorage.a;
                    final long j3 = M;
                    p5Var.c(new Runnable() { // from class: org.telegram.messenger.fr
                        /* JADX WARN: Removed duplicated region for block: B:106:0x00e3  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x00ea  */
                        /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
                        /* JADX WARN: Removed duplicated region for block: B:115:0x01cf  */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x01c4 A[ORIG_RETURN, RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
                        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
                        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:70:0x01bb  */
                        /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            SQLitePreparedStatement sQLitePreparedStatement;
                            long j10;
                            String str;
                            SQLiteCursor sQLiteCursor;
                            SQLitePreparedStatement sQLitePreparedStatement2;
                            SQLiteCursor queryFinalized;
                            NativeByteBuffer byteBufferValue;
                            TLRPC.MessageMedia messageMedia;
                            NativeByteBuffer byteBufferValue2;
                            yr yrVar = yr.this;
                            long j11 = B0;
                            int i12 = f12;
                            long j12 = e10;
                            long j13 = j3;
                            int i13 = i11;
                            boolean z11 = z10;
                            int i14 = currentTime;
                            SQLiteCursor sQLiteCursor2 = null;
                            try {
                                try {
                                    try {
                                        sQLiteCursor = yrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j11 + " AND mid = " + i12, new Object[0]);
                                    } catch (Exception e11) {
                                        e = e11;
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j10 = j12;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor = null;
                                        try {
                                            a8.g(e, true);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                                sQLiteCursor = null;
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                                sQLitePreparedStatement = null;
                                            }
                                            if (yrVar.u0(5, j11)) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteCursor2 = sQLiteCursor;
                                            if (sQLiteCursor2 != null) {
                                                sQLiteCursor2.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    j10 = j12;
                                    str = "SELECT data FROM messages_topics WHERE uid = ";
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = null;
                            }
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue2 = sQLiteCursor.byteBufferValue(0)) == null) {
                                    str = "SELECT data FROM messages_topics WHERE uid = ";
                                    j10 = j12;
                                } else {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                    TLdeserialize.readAttachPath(byteBufferValue2, j12);
                                    byteBufferValue2.reuse();
                                    sQLiteCursor.dispose();
                                    TLRPC.MessageMedia messageMedia2 = TLdeserialize.media;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j10 = j12;
                                        try {
                                            ij.a6(yrVar.currentAccount, j13, (TLRPC.TL_messageMediaToDo) messageMedia2, i13, z11, i14);
                                            sQLitePreparedStatement = yrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e13) {
                                            e = e13;
                                            sQLitePreparedStatement = null;
                                            sQLiteCursor = null;
                                            a8.g(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (yrVar.u0(5, j11)) {
                                            }
                                        }
                                        try {
                                            sQLitePreparedStatement.requery();
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                            ij.r5(TLdeserialize);
                                            TLdeserialize.serializeToStream(nativeByteBuffer);
                                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                            sQLitePreparedStatement.bindInteger(2, i12);
                                            sQLitePreparedStatement.bindLong(3, j11);
                                            sQLitePreparedStatement.step();
                                            sQLitePreparedStatement.dispose();
                                            nativeByteBuffer.reuse();
                                        } catch (Exception e14) {
                                            e = e14;
                                            sQLiteCursor = null;
                                            a8.g(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (yrVar.u0(5, j11)) {
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j10 = j12;
                                    }
                                    sQLiteCursor = null;
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    sQLiteCursor = null;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                str = "SELECT data FROM messages_topics WHERE uid = ";
                                j10 = j12;
                                sQLitePreparedStatement = null;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLitePreparedStatement = null;
                                sQLiteCursor2 = sQLiteCursor;
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                            sQLitePreparedStatement = null;
                            if (yrVar.u0(5, j11)) {
                                return;
                            }
                            try {
                                queryFinalized = yrVar.b.queryFinalized(str + j11 + " AND mid = " + i12, new Object[0]);
                                try {
                                } catch (Exception e16) {
                                    e = e16;
                                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                                } catch (Throwable th6) {
                                    th = th6;
                                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                                }
                            } catch (Exception e17) {
                                e = e17;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                sQLiteCursor2 = sQLiteCursor;
                            }
                            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                            } else {
                                TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                try {
                                    TLdeserialize2.readAttachPath(byteBufferValue, j10);
                                    byteBufferValue.reuse();
                                    messageMedia = TLdeserialize2.media;
                                } catch (Exception e18) {
                                    e = e18;
                                    sQLiteCursor2 = queryFinalized;
                                    a8.g(e, true);
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (sQLitePreparedStatement2 == null) {
                                        return;
                                    }
                                    sQLitePreparedStatement2.dispose();
                                } catch (Throwable th8) {
                                    th = th8;
                                    sQLiteCursor2 = queryFinalized;
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    throw th;
                                }
                                if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                    ij.a6(yrVar.currentAccount, j13, (TLRPC.TL_messageMediaToDo) messageMedia, i13, z11, i14);
                                    queryFinalized.dispose();
                                    try {
                                        try {
                                            SQLitePreparedStatement executeFast = yrVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                            try {
                                                executeFast.requery();
                                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                                TLdeserialize2.serializeToStream(nativeByteBuffer2);
                                                executeFast.bindByteBuffer(1, nativeByteBuffer2);
                                                executeFast.bindInteger(2, i12);
                                                executeFast.bindLong(3, j11);
                                                executeFast.step();
                                                executeFast.dispose();
                                                try {
                                                    nativeByteBuffer2.reuse();
                                                    sQLitePreparedStatement2 = null;
                                                    if (sQLiteCursor2 != null) {
                                                        sQLiteCursor2.dispose();
                                                    }
                                                    if (sQLitePreparedStatement2 == null) {
                                                        return;
                                                    }
                                                } catch (Exception e19) {
                                                    e = e19;
                                                    sQLitePreparedStatement2 = null;
                                                    a8.g(e, true);
                                                    if (sQLiteCursor2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement2 == null) {
                                                    }
                                                    sQLitePreparedStatement2.dispose();
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    sQLitePreparedStatement2 = null;
                                                    if (sQLiteCursor2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e20) {
                                                e = e20;
                                                sQLitePreparedStatement2 = executeFast;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                sQLitePreparedStatement2 = executeFast;
                                            }
                                        } catch (Exception e21) {
                                            e = e21;
                                        }
                                        sQLitePreparedStatement2.dispose();
                                    } catch (Throwable th11) {
                                        th = th11;
                                    }
                                }
                            }
                            sQLiteCursor2 = queryFinalized;
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement2 == null) {
                            }
                            sQLitePreparedStatement2.dispose();
                        }
                    });
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                g0.h3(new bi.c9(gzVar, hash, z10, 3));
            }
        });
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String N0 = org.telegram.messenger.hd.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(N0)) {
            N0 = org.telegram.messenger.hd.M0(2131746593, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        org.telegram.messenger.ij.d(spannableStringBuilder, false);
        org.telegram.messenger.dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        an anVar = this.a;
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.e;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                if ((((org.telegram.messenger.aj) arrayList.get(i7)).l & 1) != 0) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) currentMessagesGroup.d.get(i7);
                    if (ijVar != messageObject) {
                        int childCount = anVar.z0.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = anVar.z0.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                if (ijVar.T(q1Var2.getMessageObject())) {
                                    q1Var = q1Var2;
                                }
                            }
                        }
                        messageObject = ijVar;
                    }
                } else {
                    i7++;
                }
            }
        }
        anVar.mc(messageObject, spannableStringBuilder, 1);
        q1Var.F3(1, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q1(long j3) {
        TLRPC.ChatFull N0;
        an anVar = this.a;
        TLRPC.Chat chat = anVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.qp messagesController = anVar.getMessagesController();
        long j10 = anVar.e.id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        a0.h hVar = (a0.h) messagesController.x1.f(j10);
        if (hVar == null && (N0 = messagesController.N0(j10)) != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                }
            }
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j3);
        if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R() {
        an anVar = this.a;
        return anVar.m6[1].size() + anVar.m6[0].size() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0103, code lost:
    
        if (org.telegram.messenger.m5.o(r5) != r8.j6) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
        Integer num;
        String str;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str2;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        byte[] bArr2;
        TLRPC.Message message;
        String str3;
        long j3;
        boolean z10;
        TLRPC.Chat M0;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        TLRPC.Chat M02;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        org.telegram.messenger.ij ijVar;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean d = d();
        an anVar = this.a;
        if (!d && !z9) {
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if ((kVar.v() || anVar.W9()) && !anVar.q9.z(q1Var.getMessageObject())) {
                an.j2(anVar, q1Var, !q1Var.B2(f10), f10, f11);
                return;
            }
            return;
        }
        if (org.telegram.messenger.t10.z(anVar.f)) {
            r(q1Var);
            return;
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        if (messageObject.g4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.k5.o(null, 2131744607, org.telegram.ui.Components.hc.a0(anVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = org.telegram.messenger.m5.o(message3.reply_to.peer);
            storyItem.messageId = messageObject.f1();
            storyItem.messageType = 3;
            di.r7.b(storyItem, anVar.f);
            anVar.getOrCreateStoryViewer().L(anVar.getParentActivity(), storyItem, di.h7.a(anVar.z0));
            return;
        }
        TLRPC.Message message4 = messageObject.k;
        if (message4 == null || (messageReplyHeader7 = message4.reply_to) == null || (messageReplyHeader7.flags & 2048) == 0) {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr2 = messageReplyHeader2.poll_option) != null) {
                num = null;
                str2 = null;
                bArr = bArr2;
            } else if (message4 == null || (messageReplyHeader = message4.reply_to) == null || !messageReplyHeader.quote) {
                num = null;
                str = null;
            } else {
                String str4 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                num = null;
                str2 = str4;
                bArr = 0;
            }
            long j10 = anVar.j6;
            message = messageObject.k;
            if (message == null && (messageReplyHeader6 = message.reply_to) != null) {
                TLRPC.Peer peer = messageReplyHeader6.reply_to_peer_id;
                if (peer == null) {
                    str3 = str2;
                    TLRPC.MessageFwdHeader messageFwdHeader = messageReplyHeader6.reply_from;
                    if (messageFwdHeader != null) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 != null) {
                            if (!(peer2 instanceof TLRPC.TL_peerUser)) {
                                j10 = org.telegram.messenger.m5.o(peer2);
                            }
                            j3 = Long.MAX_VALUE;
                        } else {
                            TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                            if (peer3 != null) {
                                j10 = org.telegram.messenger.m5.o(peer3);
                            }
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } else {
                    if (!(peer instanceof TLRPC.TL_peerUser)) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        z10 = true;
                        j3 = o4;
                        str3 = str2;
                        M0 = j3 >= 0 ? anVar.getMessagesController().M0(Long.valueOf(-j3)) : null;
                        if (j3 != Long.MAX_VALUE) {
                            boolean z11 = z10;
                            if (j3 == anVar.j6 || M0 == null || org.telegram.messenger.t3.t0(M0) || (!M0.left && !M0.kicked)) {
                                if (((j3 == anVar.j6 && (!org.telegram.messenger.t3.c0(anVar.e) || !z11)) || j3 == Long.MAX_VALUE) && (anVar.f4 != 3 || ((ijVar = messageObject.C) != null && ijVar.Q1() == anVar.b()))) {
                                    int i10 = anVar.f4;
                                    if (i10 == 2 || i10 == 1) {
                                        anVar.j9.T0(i7);
                                        anVar.finishFragment();
                                        return;
                                    }
                                    if (bArr != 0) {
                                        anVar.h8 = bArr;
                                    } else if (num != null) {
                                        anVar.g8 = num;
                                    } else {
                                        TLRPC.Message message5 = messageObject.k;
                                        if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                            anVar.d8 = true;
                                            anVar.f8 = messageReplyHeader5.quote_text;
                                            anVar.i8 = r9;
                                            anVar.c8 = true;
                                        }
                                    }
                                    bi.ub ubVar = new bi.ub(this, i7, messageObject, num, bArr, 12);
                                    if (!anVar.C0.N) {
                                        ubVar.run();
                                        return;
                                    }
                                    anVar.F3 = false;
                                    anVar.Nb(false, true, false);
                                    anVar.jd(anVar.getMediaDataController().c0(), anVar.getMediaDataController().e1, anVar.getMediaDataController().j0());
                                    org.telegram.messenger.g0.i3(ubVar, 80L);
                                    return;
                                }
                                Integer num2 = num;
                                byte[] bArr3 = bArr;
                                if (LaunchActivity.G1 != null) {
                                    vf.b bVar = anVar.ac;
                                    if (bVar != null) {
                                        bVar.a(false);
                                        anVar.ac = null;
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    final j0 j0Var = new j0(this, messageObject, q1Var);
                                    anVar.ac = j0Var;
                                    int f12 = messageObject.f1();
                                    ArrayList arrayList = launchActivity.d0;
                                    if (j3 < 0 && (M02 = org.telegram.messenger.qp.s1(launchActivity.O).M0(Long.valueOf(-j3))) != null && org.telegram.messenger.t3.c0(M02)) {
                                        j0Var.d();
                                        final int i11 = 0;
                                        launchActivity.l0(j3, Integer.valueOf(i7), str3, num2, bArr3, new Runnable() { // from class: org.telegram.ui.c70
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i12 = i11;
                                                j0 j0Var2 = j0Var;
                                                switch (i12) {
                                                    case 0:
                                                        String str5 = LaunchActivity.B1;
                                                        j0Var2.c(false);
                                                        break;
                                                    default:
                                                        String str6 = LaunchActivity.B1;
                                                        j0Var2.c(false);
                                                        break;
                                                }
                                            }
                                        }, f12, r9);
                                        return;
                                    }
                                    String str5 = str3;
                                    int i12 = r9;
                                    j0Var.d();
                                    Bundle bundle = new Bundle();
                                    if (j3 >= 0) {
                                        bundle.putLong("user_id", j3);
                                    } else {
                                        long j11 = -j3;
                                        TLRPC.Chat M03 = org.telegram.messenger.qp.s1(launchActivity.O).M0(Long.valueOf(j11));
                                        if (M03 != null && M03.forum) {
                                            final int i13 = 1;
                                            launchActivity.l0(j3, Integer.valueOf(i7), str5, num2, bArr3, new Runnable() { // from class: org.telegram.ui.c70
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i122 = i13;
                                                    j0 j0Var2 = j0Var;
                                                    switch (i122) {
                                                        case 0:
                                                            String str52 = LaunchActivity.B1;
                                                            j0Var2.c(false);
                                                            break;
                                                        default:
                                                            String str6 = LaunchActivity.B1;
                                                            j0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, f12, i12);
                                            return;
                                        }
                                        bundle.putLong("chat_id", j11);
                                    }
                                    bundle.putInt("message_id", i7);
                                    org.telegram.ui.ActionBar.f2 f2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList) : null;
                                    if (f2Var == null || org.telegram.messenger.qp.s1(launchActivity.O).E(bundle, f2Var, null, null)) {
                                        org.telegram.messenger.g0.h3(new b70(launchActivity, bundle, bArr3, i7, num2, str5, i12, j3, j0Var, f2Var));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        message2 = messageObject.k;
                        if (message2 != null || (messageReplyHeader4 = message2.reply_to) == null || TextUtils.isEmpty(messageReplyHeader4.quote_text) || !messageObject.a1 || messageObject.b1 || messageObject.Q5()) {
                            TLRPC.Message message6 = messageObject.k;
                            org.telegram.ui.Components.hc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746431 : 2131746432 : 2131746430 : (M0 == null && M0.megagroup) ? 2131746257 : !org.telegram.messenger.t3.T(M0) ? 2131746258 : 2131746259, null)).k(true);
                        } else {
                            messageObject.b1 = true;
                            anVar.Uc(messageObject, true);
                            return;
                        }
                    }
                    str3 = str2;
                }
                z10 = false;
                if (j3 >= 0) {
                }
                if (j3 != Long.MAX_VALUE) {
                }
                message2 = messageObject.k;
                if (message2 != null) {
                }
                TLRPC.Message message62 = messageObject.k;
                org.telegram.ui.Components.hc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746431 : 2131746432 : 2131746430 : (M0 == null && M0.megagroup) ? 2131746257 : !org.telegram.messenger.t3.T(M0) ? 2131746258 : 2131746259, null)).k(true);
            }
            str3 = str2;
            j3 = j10;
            z10 = false;
            if (j3 >= 0) {
            }
            if (j3 != Long.MAX_VALUE) {
            }
            message2 = messageObject.k;
            if (message2 != null) {
            }
            TLRPC.Message message622 = messageObject.k;
            org.telegram.ui.Components.hc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746431 : 2131746432 : 2131746430 : (M0 == null && M0.megagroup) ? 2131746257 : !org.telegram.messenger.t3.T(M0) ? 2131746258 : 2131746259, null)).k(true);
        }
        num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        str = null;
        str2 = str;
        bArr = str;
        long j102 = anVar.j6;
        message = messageObject.k;
        if (message == null) {
        }
        str3 = str2;
        j3 = j102;
        z10 = false;
        if (j3 >= 0) {
        }
        if (j3 != Long.MAX_VALUE) {
        }
        message2 = messageObject.k;
        if (message2 != null) {
        }
        TLRPC.Message message6222 = messageObject.k;
        org.telegram.ui.Components.hc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746431 : 2131746432 : 2131746430 : (M0 == null && M0.megagroup) ? 2131746257 : !org.telegram.messenger.t3.T(M0) ? 2131746258 : 2131746259, null)).k(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        org.telegram.messenger.ij messageObject;
        TLRPC.Message message;
        if (q1Var == null) {
            return false;
        }
        an anVar = this.a;
        if (anVar.getParentActivity() == null) {
            return false;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        if (!org.telegram.messenger.qp.s1(i7).s4() || (messageObject = q1Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.J2 || message.translatedRichMessage == null) {
            return messageObject.u(anVar.e);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0504, code lost:
    
        if (r0.paid_reactions_available != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x050a, code lost:
    
        if (r10.isEmpty() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x053b, code lost:
    
        if (r0.paid_reactions_available != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0557, code lost:
    
        if (r10.isEmpty() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0545, code lost:
    
        if (org.telegram.messenger.t3.T(r6.e) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0551, code lost:
    
        if (org.telegram.messenger.t3.p0(r6.e) != false) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0828 A[LOOP:2: B:229:0x0826->B:230:0x0828, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d3  */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        c81 c81Var;
        TLRPC.TodoItem todoItem2;
        final int i7;
        TLRPC.TodoCompletion todoCompletion;
        org.telegram.messenger.ij ijVar;
        String str;
        boolean z9;
        boolean z10;
        c81 c81Var2;
        int i10;
        org.telegram.messenger.ij ijVar2;
        boolean z11;
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        boolean z14;
        ne neVar;
        org.telegram.ui.Components.k60 k60Var;
        f81 f81Var;
        boolean z15;
        ArrayList arrayList2;
        an anVar;
        ArrayList arrayList3;
        dh.c cVar;
        org.telegram.messenger.ij ijVar3;
        int size;
        int i11;
        ViewGroup viewGroup;
        f81 f81Var2;
        boolean z16;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        String str2;
        boolean z17;
        final int i12;
        String str3;
        Calendar calendar;
        final an anVar2 = this.a;
        if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
            fi.m3 m3Var = anVar2.L1;
            if (m3Var != null && m3Var.V) {
                m3Var.f(true);
            }
            zk zkVar = anVar2.P1;
            if (zkVar != null && zkVar.V) {
                zkVar.f(true);
            }
            org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia n1 = org.telegram.messenger.ij.n1(primaryMessageObject);
            if (primaryMessageObject != null && (n1 instanceof TLRPC.TL_messageMediaToDo)) {
                anVar2.t5 = primaryMessageObject;
                anVar2.u5 = null;
                final f81 f81Var3 = new f81(anVar2.getParentActivity(), anVar2.getResourceProvider());
                final int i13 = todoItem.id;
                f81Var3.K = q1Var;
                f81Var3.O = i13;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                f81Var3.G = messageObject;
                f81Var3.H = messageObject != null && messageObject.Q3();
                org.telegram.ui.Cells.q1 q1Var2 = f81Var3.K;
                c81 c81Var3 = f81Var3.c;
                if (q1Var2 != null) {
                    f81Var3.L = anVar2.L9 - org.telegram.messenger.g0.L(4.0f);
                    f81Var3.M = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        f81Var3.L = view.getY() + f81Var3.L;
                        f81Var3.M = view.getY() + f81Var3.M;
                    }
                    int width = f81Var3.K.getWidth();
                    int height = f81Var3.K.getHeight();
                    f81Var3.K.getHeight();
                    d81 d81Var = new d81(f81Var3, f81Var3.getContext(), org.telegram.messenger.p10.s0, f81Var3.K.getResourcesProvider(), i13, width, height);
                    f81Var3.I = d81Var;
                    f81Var3.K.r0(d81Var);
                    f81Var3.I.s0(f81Var3.K);
                    f81Var3.I.setDelegate(new e81(f81Var3));
                    d81 d81Var2 = f81Var3.I;
                    org.telegram.messenger.ij ijVar4 = f81Var3.G;
                    org.telegram.messenger.dj currentMessagesGroup = f81Var3.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = f81Var3.K;
                    d81Var2.v3(ijVar4, currentMessagesGroup, q1Var3.F, q1Var3.E, q1Var3.G, false);
                    c81Var3.addView(f81Var3.I, new FrameLayout.LayoutParams(f81Var3.K.getWidth(), height, 51));
                    xr0 xr0Var = new xr0(f81Var3.getContext(), org.telegram.messenger.p10.s0, f81Var3.K.getResourcesProvider(), width, height, 1);
                    f81Var3.J = xr0Var;
                    f81Var3.K.u0(xr0Var);
                    f81Var3.K.r0(f81Var3.J);
                    f81Var3.J.s0(f81Var3.K);
                    f81Var3.J.setDelegate(new w7.s(19, false));
                    xr0 xr0Var2 = f81Var3.J;
                    org.telegram.messenger.ij ijVar5 = f81Var3.G;
                    org.telegram.messenger.dj currentMessagesGroup2 = f81Var3.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = f81Var3.K;
                    xr0Var2.v3(ijVar5, currentMessagesGroup2, q1Var4.F, q1Var4.E, q1Var4.G, false);
                    c81Var3.addView(f81Var3.J, new FrameLayout.LayoutParams(f81Var3.K.getWidth(), height, 51));
                }
                fi.g1 g1Var = f81Var3.e;
                g1Var.bringToFront();
                c81 c81Var4 = f81Var3.d;
                c81Var4.bringToFront();
                f81Var3.h.bringToFront();
                g1Var.w(false);
                org.telegram.ui.ActionBar.f6 f6Var = f81Var3.a;
                org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(c81Var3, f6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) org.telegram.messenger.ij.n1(f81Var3.G);
                int i14 = 0;
                while (true) {
                    c81Var = c81Var3;
                    if (i14 >= tL_messageMediaToDo.todo.list.size()) {
                        todoItem2 = null;
                        i7 = -1;
                        break;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i14).id == i13) {
                        todoItem2 = tL_messageMediaToDo.todo.list.get(i14);
                        i7 = i14;
                        break;
                    }
                    i14++;
                    c81Var3 = c81Var;
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= tL_messageMediaToDo.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo.completions.get(i15).id == i13) {
                        todoCompletion = tL_messageMediaToDo.completions.get(i15);
                        break;
                    }
                    i15++;
                }
                if (!f81Var3.G.q()) {
                    ijVar = primaryMessageObject;
                    str = null;
                    z9 = false;
                } else {
                    if (todoCompletion == null) {
                        ijVar = primaryMessageObject;
                        str = null;
                        z10 = false;
                        final int i16 = 2;
                        F.c(R.drawable.msg_select, org.telegram.messenger.hd.M0(2131744090, null), new Runnable() { // from class: org.telegram.ui.z71
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i17 = i16;
                                int i18 = i13;
                                an anVar3 = anVar2;
                                f81 f81Var4 = f81Var3;
                                switch (i17) {
                                    case 0:
                                        or0 or0Var = new or0(anVar3);
                                        or0Var.u0(org.telegram.messenger.ij.n1(f81Var4.G), false, i18);
                                        or0Var.e0 = new lk0(19, f81Var4, anVar3);
                                        anVar3.presentFragment(or0Var);
                                        f81Var4.c(false);
                                        break;
                                    case 1:
                                        if (anVar3.c()) {
                                            Toast.makeText(f81Var4.getContext(), org.telegram.messenger.hd.M0(2131748492, null), 1).show();
                                        } else {
                                            d81 d81Var3 = f81Var4.I;
                                            d81Var3.L3(d81Var3.b2(i18), false);
                                        }
                                        f81Var4.c(true);
                                        break;
                                    default:
                                        if (anVar3.c()) {
                                            Toast.makeText(f81Var4.getContext(), org.telegram.messenger.hd.M0(2131748492, null), 1).show();
                                        } else {
                                            d81 d81Var4 = f81Var4.I;
                                            d81Var4.L3(d81Var4.b2(i18), false);
                                        }
                                        f81Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i17 = 5;
                        final ?? r10 = z10;
                        if (todoItem2 != null) {
                            F.c(R.drawable.menu_reply, org.telegram.messenger.hd.M0(2131744074, str), new t21(f81Var3, anVar2, todoItem2, i17), z10);
                            if (org.telegram.messenger.ij.B0(f81Var3.G.k) < 0) {
                                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(f81Var3.G.I1);
                                String r11 = org.telegram.messenger.m5.r(s12.e2(org.telegram.messenger.ij.B0(f81Var3.G.k)));
                                StringBuilder sb2 = new StringBuilder("https://");
                                sb2.append(s12.U2);
                                sb2.append("/");
                                if (TextUtils.isEmpty(r11)) {
                                    r11 = "c/" + (-org.telegram.messenger.ij.B0(f81Var3.G.k));
                                }
                                sb2.append(r11);
                                sb2.append("/");
                                sb2.append(f81Var3.G.f1());
                                sb2.append("?task=");
                                sb2.append(todoItem2.id);
                                String sb3 = sb2.toString();
                                str2 = null;
                                z17 = false;
                                F.c(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131751762, null), new by0(17, f81Var3, sb3), false);
                            } else {
                                str2 = null;
                                z17 = false;
                            }
                            F.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, str2), new by0(18, f81Var3, todoItem2), z17);
                            r10 = z17;
                        }
                        if (f81Var3.G.u(anVar2.e)) {
                            F.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131744077, null), new Runnable() { // from class: org.telegram.ui.z71
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i172 = r10;
                                    int i18 = i7;
                                    an anVar3 = anVar2;
                                    f81 f81Var4 = f81Var3;
                                    switch (i172) {
                                        case 0:
                                            or0 or0Var = new or0(anVar3);
                                            or0Var.u0(org.telegram.messenger.ij.n1(f81Var4.G), false, i18);
                                            or0Var.e0 = new lk0(19, f81Var4, anVar3);
                                            anVar3.presentFragment(or0Var);
                                            f81Var4.c(false);
                                            break;
                                        case 1:
                                            if (anVar3.c()) {
                                                Toast.makeText(f81Var4.getContext(), org.telegram.messenger.hd.M0(2131748492, null), 1).show();
                                            } else {
                                                d81 d81Var3 = f81Var4.I;
                                                d81Var3.L3(d81Var3.b2(i18), false);
                                            }
                                            f81Var4.c(true);
                                            break;
                                        default:
                                            if (anVar3.c()) {
                                                Toast.makeText(f81Var4.getContext(), org.telegram.messenger.hd.M0(2131748492, null), 1).show();
                                            } else {
                                                d81 d81Var4 = f81Var4.I;
                                                d81Var4.L3(d81Var4.b2(i18), false);
                                            }
                                            f81Var4.c(true);
                                            break;
                                    }
                                }
                            }, r10);
                            if (tL_messageMediaToDo.todo.list.size() > 1) {
                                c81Var2 = c81Var;
                                i10 = 51;
                                F.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131744078, null), new org.telegram.ui.Components.pp0(f81Var3, tL_messageMediaToDo, i13, anVar2, 16), r10);
                                F.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                                gh.e k10 = c8.g0.k(f6Var);
                                dh.c cVar2 = f81Var3.F;
                                F.Q(cVar2, k10, r10);
                                F.Y();
                                ViewGroup viewGroup2 = F.A;
                                f81Var3.Q = viewGroup2;
                                viewGroup2.setPivotX(0.0f);
                                f81Var3.Q.setPivotY(0.0f);
                                c81Var4.addView(f81Var3.Q, c8.ha.e(-2, -2, i10));
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = new ArrayList();
                                ArrayList arrayList6 = new ArrayList();
                                anVar2.E8(ijVar, arrayList4, arrayList5, arrayList6);
                                ne neVar2 = new ne(anVar2, 10);
                                ijVar2 = f81Var3.G;
                                ArrayList arrayList7 = anVar2.getMediaDataController().n;
                                z11 = anVar2.z() && !anVar2.c() && anVar2.f == null && ijVar2.x2() && !((org.telegram.messenger.t3.T(anVar2.e) && !anVar2.e.megagroup) || org.telegram.messenger.t3.p0(anVar2.e) || arrayList7.isEmpty() || !ijVar2.k.reactions.can_see_list || ijVar2.m4());
                                if (ijVar2.l3()) {
                                    arrayList = arrayList4;
                                    if (!ijVar2.m4()) {
                                        if (anVar2.f4 != 5) {
                                            if (!anVar2.z()) {
                                                if (!anVar2.c()) {
                                                    if (ijVar2.e4()) {
                                                        TLRPC.ChatFull chatFull2 = anVar2.p8;
                                                        if (chatFull2 != null) {
                                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                            }
                                                        }
                                                        if (chatFull2 == null) {
                                                        }
                                                        if (anVar2.f == null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z12 = false;
                                } else {
                                    arrayList = arrayList4;
                                    TLRPC.ChatFull N0 = anVar2.getMessagesController().N0(-ijVar2.Z0());
                                    if (N0 != null) {
                                        if (!anVar2.z()) {
                                            if (anVar2.f4 != 5) {
                                                if (!anVar2.c()) {
                                                    if (ijVar2.e4()) {
                                                        if (N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z12 = false;
                                    }
                                    z12 = true;
                                }
                                boolean z18 = (!z11 || anVar2.c() || anVar2.e == null || !ijVar2.Q3() || !ijVar2.r4() || ijVar2.Z2() || ijVar2.p4() || ijVar2.o4() || ijVar2.k.media_unread || ijVar2.G4() || ConnectionsManager.getInstance(anVar2.getCurrentAccount()).getCurrentTime() - ijVar2.k.date >= anVar2.getMessagesController().q3 || (!org.telegram.messenger.t3.n0(anVar2.e) && org.telegram.messenger.t3.T(anVar2.e)) || (chatFull = anVar2.p8) == null || chatFull.participants_count > anVar2.getMessagesController().p3 || (ijVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || anVar2.f4 == 3 || !ijVar2.z() || org.telegram.messenger.t3.p0(anVar2.e)) ? false : true;
                                if (anVar2.e != null && !ijVar2.O3() && org.telegram.messenger.t3.p0(anVar2.e) && org.telegram.messenger.t3.A(anVar2.getCurrentAccount(), anVar2.e, 24)) {
                                    int i18 = ((-anVar2.e.linked_monoforum_id) > ijVar2.Z0() ? 1 : ((-anVar2.e.linked_monoforum_id) == ijVar2.Z0() ? 0 : -1));
                                }
                                if (!z11 && anVar2.e == null && anVar2.h == null && (user = anVar2.f) != null && !org.telegram.messenger.t10.B(user) && !org.telegram.messenger.t10.z(anVar2.f) && !org.telegram.messenger.t10.s(anVar2.f)) {
                                    user2 = anVar2.f;
                                    if (!user2.bot && !org.telegram.messenger.t10.A(user2.id) && (((userFull = anVar2.q8) == null || !userFull.read_dates_private) && !anVar2.c() && ijVar2.Q3() && ijVar2.r4() && !ijVar2.Z2() && !ijVar2.p4() && !ijVar2.o4() && !ijVar2.k.media_unread && !ijVar2.G4() && anVar2.getConnectionsManager().getCurrentTime() - ijVar2.k.date < anVar2.getMessagesController().r3 && !(ijVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                        z13 = true;
                                        TLRPC.User user3 = anVar2.f;
                                        boolean z19 = ((user3 == null && (org.telegram.messenger.t10.z(user3) || org.telegram.messenger.t10.s(anVar2.f))) || anVar2.c() || !ijVar2.Y2() || (ijVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                        z14 = z18;
                                        org.telegram.ui.Components.k60 G = org.telegram.ui.Components.k60.G(c81Var2, anVar2.getResourceProvider(), null, !z11 || z18);
                                        if (z14) {
                                            neVar = neVar2;
                                            k60Var = G;
                                            f81Var = f81Var3;
                                            z15 = z12;
                                            arrayList2 = arrayList5;
                                            anVar = anVar2;
                                            arrayList3 = arrayList6;
                                            cVar = cVar2;
                                            if (z13) {
                                                ijVar3 = ijVar2;
                                                k60Var.r(new org.telegram.ui.Components.na0(f81Var.getContext(), 0, ijVar3, new y71(f81Var, 0), f81Var.a), c8.ha.o(-1, 36));
                                                k60Var.k();
                                            } else {
                                                ijVar3 = ijVar2;
                                                if (z19) {
                                                    k60Var.r(new org.telegram.ui.Components.na0(f81Var.getContext(), 1, ijVar3, new y71(f81Var, 2), f81Var.a), c8.ha.o(-1, 36));
                                                    k60Var.k();
                                                }
                                            }
                                        } else {
                                            jf0 jf0Var = new jf0(f81Var3.getContext(), anVar2.getCurrentAccount(), ijVar2, anVar2.e);
                                            FrameLayout frameLayout = new FrameLayout(f81Var3.getContext());
                                            frameLayout.addView(jf0Var, c8.ha.c(36.0f, -1));
                                            org.telegram.ui.Components.k60 J = G.J();
                                            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, f81Var3.getContext(), f81Var3.a, true, false);
                                            z0Var.setItemHeight(44);
                                            z15 = z12;
                                            z0Var.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                                            z0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                                            FrameLayout frameLayout2 = new FrameLayout(f81Var3.getContext());
                                            LinearLayout linearLayout = new LinearLayout(f81Var3.getContext());
                                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, linearLayout, f6Var);
                                            linearLayout.setOrientation(1);
                                            anVar = anVar2;
                                            org.telegram.ui.Components.pj0 a10 = jf0Var.a();
                                            frameLayout2.addView(z0Var);
                                            linearLayout.addView(frameLayout2);
                                            linearLayout.addView(new org.telegram.ui.ActionBar.d1(f81Var3.getContext(), f6Var), c8.ha.o(-1, 8));
                                            frameLayout2.setOnClickListener(new sr0(G, 1));
                                            arrayList2 = arrayList5;
                                            b81 b81Var = new b81(f81Var3, jf0Var, anVar, a10, linearLayout, G, J);
                                            k60Var = G;
                                            f81Var = f81Var3;
                                            jf0Var.setOnClickListener(b81Var);
                                            linearLayout.addView(a10, c8.ha.o(-1, -2));
                                            J.q(linearLayout);
                                            k60Var.q(frameLayout);
                                            k60Var.k();
                                            ijVar3 = ijVar2;
                                            arrayList3 = arrayList6;
                                            cVar = cVar2;
                                            neVar = neVar2;
                                        }
                                        size = arrayList.size();
                                        i11 = 0;
                                        while (i11 < size) {
                                            k60Var.c(((Integer) arrayList.get(i11)).intValue(), (CharSequence) arrayList2.get(i11), new d10(f81Var, neVar, ((Integer) arrayList3.get(i11)).intValue(), 12), false);
                                            i11++;
                                            arrayList2 = arrayList2;
                                        }
                                        k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                                        k60Var.Q(cVar, c8.g0.k(f6Var), false);
                                        k60Var.Y();
                                        ViewGroup viewGroup3 = k60Var.A;
                                        f81Var.S = viewGroup3;
                                        viewGroup3.setPivotX(0.0f);
                                        f81Var.S.setPivotY(0.0f);
                                        c81Var4.addView(f81Var.S, c8.ha.e(-2, -2, 51));
                                        viewGroup = f81Var.S;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new li0(f81Var, 20));
                                            f81Var.S.setOnTouchListener(new d0(f81Var, 7));
                                        }
                                        if (z15) {
                                            f81Var2 = f81Var;
                                            z16 = true;
                                        } else {
                                            an anVar3 = anVar;
                                            org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0((anVar.getUserConfig().e() > anVar.a() ? 1 : (anVar.getUserConfig().e() == anVar.a() ? 0 : -1)) == 0 ? 3 : 0, anVar3.getCurrentAccount(), f81Var.getContext(), anVar3, f81Var.a);
                                            ii0Var.a = true;
                                            float f10 = 22;
                                            ii0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                                            f81Var2 = f81Var;
                                            org.telegram.messenger.ij ijVar6 = ijVar3;
                                            ii0Var.setDelegate(new ui.e(f81Var2, anVar3, ijVar6, ii0Var, 11));
                                            f81Var2.P = ii0Var;
                                            c81Var4.addView(ii0Var, c8.ha.e(-2, (int) ((ii0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                                            z16 = true;
                                            ii0Var.p(ijVar6, anVar3.p8, true);
                                            f81Var2.P.setTransitionProgress(1.0f);
                                        }
                                        f81Var2.e();
                                        f81Var2.c0 = new tl(this, 5);
                                        f81Var2.show();
                                        return z16;
                                    }
                                }
                                z13 = false;
                                TLRPC.User user32 = anVar2.f;
                                if (user32 == null) {
                                }
                                z14 = z18;
                                org.telegram.ui.Components.k60 G2 = org.telegram.ui.Components.k60.G(c81Var2, anVar2.getResourceProvider(), null, !z11 || z18);
                                if (z14) {
                                }
                                size = arrayList.size();
                                i11 = 0;
                                while (i11 < size) {
                                }
                                k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                                k60Var.Q(cVar, c8.g0.k(f6Var), false);
                                k60Var.Y();
                                ViewGroup viewGroup32 = k60Var.A;
                                f81Var.S = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                f81Var.S.setPivotY(0.0f);
                                c81Var4.addView(f81Var.S, c8.ha.e(-2, -2, 51));
                                viewGroup = f81Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z15) {
                                }
                                f81Var2.e();
                                f81Var2.c0 = new tl(this, 5);
                                f81Var2.show();
                                return z16;
                            }
                        }
                        c81Var2 = c81Var;
                        i10 = 51;
                        F.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                        gh.e k102 = c8.g0.k(f6Var);
                        dh.c cVar22 = f81Var3.F;
                        F.Q(cVar22, k102, r10);
                        F.Y();
                        ViewGroup viewGroup22 = F.A;
                        f81Var3.Q = viewGroup22;
                        viewGroup22.setPivotX(0.0f);
                        f81Var3.Q.setPivotY(0.0f);
                        c81Var4.addView(f81Var3.Q, c8.ha.e(-2, -2, i10));
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        ArrayList arrayList62 = new ArrayList();
                        anVar2.E8(ijVar, arrayList42, arrayList52, arrayList62);
                        ne neVar22 = new ne(anVar2, 10);
                        ijVar2 = f81Var3.G;
                        ArrayList arrayList72 = anVar2.getMediaDataController().n;
                        if (anVar2.z()) {
                        }
                        if (ijVar2.l3()) {
                        }
                        if (!z11) {
                        }
                        if (anVar2.e != null) {
                            int i182 = ((-anVar2.e.linked_monoforum_id) > ijVar2.Z0() ? 1 : ((-anVar2.e.linked_monoforum_id) == ijVar2.Z0() ? 0 : -1));
                        }
                        if (!z11) {
                            user2 = anVar2.f;
                            if (!user2.bot) {
                                z13 = true;
                                TLRPC.User user322 = anVar2.f;
                                if (user322 == null) {
                                }
                                z14 = z18;
                                org.telegram.ui.Components.k60 G22 = org.telegram.ui.Components.k60.G(c81Var2, anVar2.getResourceProvider(), null, !z11 || z18);
                                if (z14) {
                                }
                                size = arrayList.size();
                                i11 = 0;
                                while (i11 < size) {
                                }
                                k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                                k60Var.Q(cVar, c8.g0.k(f6Var), false);
                                k60Var.Y();
                                ViewGroup viewGroup322 = k60Var.A;
                                f81Var.S = viewGroup322;
                                viewGroup322.setPivotX(0.0f);
                                f81Var.S.setPivotY(0.0f);
                                c81Var4.addView(f81Var.S, c8.ha.e(-2, -2, 51));
                                viewGroup = f81Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z15) {
                                }
                                f81Var2.e();
                                f81Var2.c0 = new tl(this, 5);
                                f81Var2.show();
                                return z16;
                            }
                        }
                        z13 = false;
                        TLRPC.User user3222 = anVar2.f;
                        if (user3222 == null) {
                        }
                        z14 = z18;
                        org.telegram.ui.Components.k60 G222 = org.telegram.ui.Components.k60.G(c81Var2, anVar2.getResourceProvider(), null, !z11 || z18);
                        if (z14) {
                        }
                        size = arrayList.size();
                        i11 = 0;
                        while (i11 < size) {
                        }
                        k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                        k60Var.Q(cVar, c8.g0.k(f6Var), false);
                        k60Var.Y();
                        ViewGroup viewGroup3222 = k60Var.A;
                        f81Var.S = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        f81Var.S.setPivotY(0.0f);
                        c81Var4.addView(f81Var.S, c8.ha.e(-2, -2, 51));
                        viewGroup = f81Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        f81Var2.e();
                        f81Var2.c0 = new tl(this, 5);
                        f81Var2.show();
                        return z16;
                    }
                    long j3 = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        ijVar = primaryMessageObject;
                    } catch (Exception e10) {
                        e = e10;
                        ijVar = primaryMessageObject;
                    }
                    try {
                        int i19 = calendar.get(6);
                        int i20 = calendar.get(1);
                        calendar.setTimeInMillis(j3);
                        int i21 = calendar.get(6);
                        int i22 = calendar.get(1);
                        str3 = (i21 == i19 && i20 == i22) ? org.telegram.messenger.hd.a0(null, null, 2131744082, org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : (i21 + 1 == i19 && i20 == i22) ? org.telegram.messenger.hd.a0(null, null, 2131744081, org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : Math.abs(System.currentTimeMillis() - j3) < 31536000000L ? org.telegram.messenger.hd.a0(null, null, 2131744083, org.telegram.messenger.hd.E0().q0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : org.telegram.messenger.hd.a0(null, null, 2131744083, org.telegram.messenger.hd.E0().C0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3)));
                        i12 = 1;
                    } catch (Exception e11) {
                        e = e11;
                        i12 = 1;
                        org.telegram.messenger.a8.g(e, true);
                        str3 = "LOC_ERR";
                        F.p(14, -1, str3);
                        F.k();
                        str = null;
                        z9 = false;
                        F.c(R.drawable.msg_cancel, org.telegram.messenger.hd.M0(2131744053, null), new Runnable() { // from class: org.telegram.ui.z71
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i172 = i12;
                                int i183 = i13;
                                an anVar32 = anVar2;
                                f81 f81Var4 = f81Var3;
                                switch (i172) {
                                    case 0:
                                        or0 or0Var = new or0(anVar32);
                                        or0Var.u0(org.telegram.messenger.ij.n1(f81Var4.G), false, i183);
                                        or0Var.e0 = new lk0(19, f81Var4, anVar32);
                                        anVar32.presentFragment(or0Var);
                                        f81Var4.c(false);
                                        break;
                                    case 1:
                                        if (anVar32.c()) {
                                            Toast.makeText(f81Var4.getContext(), org.telegram.messenger.hd.M0(2131748492, null), 1).show();
                                        } else {
                                            d81 d81Var3 = f81Var4.I;
                                            d81Var3.L3(d81Var3.b2(i183), false);
                                        }
                                        f81Var4.c(true);
                                        break;
                                    default:
                                        if (anVar32.c()) {
                                            Toast.makeText(f81Var4.getContext(), org.telegram.messenger.hd.M0(2131748492, null), 1).show();
                                        } else {
                                            d81 d81Var4 = f81Var4.I;
                                            d81Var4.L3(d81Var4.b2(i183), false);
                                        }
                                        f81Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        z10 = z9;
                        int i172 = 5;
                        final int r102 = z10;
                        if (todoItem2 != null) {
                        }
                        if (f81Var3.G.u(anVar2.e)) {
                        }
                        c81Var2 = c81Var;
                        i10 = 51;
                        F.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                        gh.e k1022 = c8.g0.k(f6Var);
                        dh.c cVar222 = f81Var3.F;
                        F.Q(cVar222, k1022, r102);
                        F.Y();
                        ViewGroup viewGroup222 = F.A;
                        f81Var3.Q = viewGroup222;
                        viewGroup222.setPivotX(0.0f);
                        f81Var3.Q.setPivotY(0.0f);
                        c81Var4.addView(f81Var3.Q, c8.ha.e(-2, -2, i10));
                        ArrayList arrayList422 = new ArrayList();
                        ArrayList arrayList522 = new ArrayList();
                        ArrayList arrayList622 = new ArrayList();
                        anVar2.E8(ijVar, arrayList422, arrayList522, arrayList622);
                        ne neVar222 = new ne(anVar2, 10);
                        ijVar2 = f81Var3.G;
                        ArrayList arrayList722 = anVar2.getMediaDataController().n;
                        if (anVar2.z()) {
                        }
                        if (ijVar2.l3()) {
                        }
                        if (!z11) {
                        }
                        if (anVar2.e != null) {
                        }
                        if (!z11) {
                        }
                        z13 = false;
                        TLRPC.User user32222 = anVar2.f;
                        if (user32222 == null) {
                        }
                        z14 = z18;
                        org.telegram.ui.Components.k60 G2222 = org.telegram.ui.Components.k60.G(c81Var2, anVar2.getResourceProvider(), null, !z11 || z18);
                        if (z14) {
                        }
                        size = arrayList.size();
                        i11 = 0;
                        while (i11 < size) {
                        }
                        k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                        k60Var.Q(cVar, c8.g0.k(f6Var), false);
                        k60Var.Y();
                        ViewGroup viewGroup32222 = k60Var.A;
                        f81Var.S = viewGroup32222;
                        viewGroup32222.setPivotX(0.0f);
                        f81Var.S.setPivotY(0.0f);
                        c81Var4.addView(f81Var.S, c8.ha.e(-2, -2, 51));
                        viewGroup = f81Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        f81Var2.e();
                        f81Var2.c0 = new tl(this, 5);
                        f81Var2.show();
                        return z16;
                    }
                    F.p(14, -1, str3);
                    F.k();
                    str = null;
                    z9 = false;
                    F.c(R.drawable.msg_cancel, org.telegram.messenger.hd.M0(2131744053, null), new Runnable() { // from class: org.telegram.ui.z71
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i1722 = i12;
                            int i183 = i13;
                            an anVar32 = anVar2;
                            f81 f81Var4 = f81Var3;
                            switch (i1722) {
                                case 0:
                                    or0 or0Var = new or0(anVar32);
                                    or0Var.u0(org.telegram.messenger.ij.n1(f81Var4.G), false, i183);
                                    or0Var.e0 = new lk0(19, f81Var4, anVar32);
                                    anVar32.presentFragment(or0Var);
                                    f81Var4.c(false);
                                    break;
                                case 1:
                                    if (anVar32.c()) {
                                        Toast.makeText(f81Var4.getContext(), org.telegram.messenger.hd.M0(2131748492, null), 1).show();
                                    } else {
                                        d81 d81Var3 = f81Var4.I;
                                        d81Var3.L3(d81Var3.b2(i183), false);
                                    }
                                    f81Var4.c(true);
                                    break;
                                default:
                                    if (anVar32.c()) {
                                        Toast.makeText(f81Var4.getContext(), org.telegram.messenger.hd.M0(2131748492, null), 1).show();
                                    } else {
                                        d81 d81Var4 = f81Var4.I;
                                        d81Var4.L3(d81Var4.b2(i183), false);
                                    }
                                    f81Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                z10 = z9;
                int i1722 = 5;
                final int r1022 = z10;
                if (todoItem2 != null) {
                }
                if (f81Var3.G.u(anVar2.e)) {
                }
                c81Var2 = c81Var;
                i10 = 51;
                F.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                gh.e k10222 = c8.g0.k(f6Var);
                dh.c cVar2222 = f81Var3.F;
                F.Q(cVar2222, k10222, r1022);
                F.Y();
                ViewGroup viewGroup2222 = F.A;
                f81Var3.Q = viewGroup2222;
                viewGroup2222.setPivotX(0.0f);
                f81Var3.Q.setPivotY(0.0f);
                c81Var4.addView(f81Var3.Q, c8.ha.e(-2, -2, i10));
                ArrayList arrayList4222 = new ArrayList();
                ArrayList arrayList5222 = new ArrayList();
                ArrayList arrayList6222 = new ArrayList();
                anVar2.E8(ijVar, arrayList4222, arrayList5222, arrayList6222);
                ne neVar2222 = new ne(anVar2, 10);
                ijVar2 = f81Var3.G;
                ArrayList arrayList7222 = anVar2.getMediaDataController().n;
                if (anVar2.z()) {
                }
                if (ijVar2.l3()) {
                }
                if (!z11) {
                }
                if (anVar2.e != null) {
                }
                if (!z11) {
                }
                z13 = false;
                TLRPC.User user322222 = anVar2.f;
                if (user322222 == null) {
                }
                z14 = z18;
                org.telegram.ui.Components.k60 G22222 = org.telegram.ui.Components.k60.G(c81Var2, anVar2.getResourceProvider(), null, !z11 || z18);
                if (z14) {
                }
                size = arrayList.size();
                i11 = 0;
                while (i11 < size) {
                }
                k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var)));
                k60Var.Q(cVar, c8.g0.k(f6Var), false);
                k60Var.Y();
                ViewGroup viewGroup322222 = k60Var.A;
                f81Var.S = viewGroup322222;
                viewGroup322222.setPivotX(0.0f);
                f81Var.S.setPivotY(0.0f);
                c81Var4.addView(f81Var.S, c8.ha.e(-2, -2, 51));
                viewGroup = f81Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z15) {
                }
                f81Var2.e();
                f81Var2.c0 = new tl(this, 5);
                f81Var2.show();
                return z16;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean T() {
        an anVar = this.a;
        return org.telegram.messenger.t10.z(anVar.f) || org.telegram.messenger.t10.B(anVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.ij messageObject;
        if (chat == null) {
            return;
        }
        an anVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar.v() || anVar.W9()) {
            an.j2(anVar, q1Var, true, f10, f11);
            return;
        }
        if (z9 || !chat.signature_profiles || (messageObject = q1Var.getMessageObject()) == null || org.telegram.messenger.ij.B0(messageObject.k) == 1271266957) {
            i(q1Var, chat, i7, z9);
        } else {
            anVar.Na(org.telegram.messenger.m5.o(messageObject.k.from_id));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.lm] */
    @Override // org.telegram.ui.Cells.l1
    public final void U1(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        an anVar = this.a;
        if (!org.telegram.messenger.g0.E1(anVar.getParentActivity()) || (chat = anVar.e) == null || currentUser == null || org.telegram.messenger.t3.V(chat)) {
            return;
        }
        org.telegram.messenger.qp messagesController = anVar.getMessagesController();
        long j3 = anVar.e.id;
        long j10 = currentUser.id;
        a0.h hVar = (a0.h) messagesController.x1.f(j3);
        if (hVar == null && (N0 = messagesController.N0(j3)) != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j10) {
                    break;
                }
            }
        }
        chatParticipant = (TLObject) hVar.f(j10);
        c(q1Var, chatParticipant);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
        e(q1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean W0(org.telegram.messenger.ij ijVar) {
        jl jlVar;
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        an anVar = this.a;
        return (B0 == 1271266957 || ((jlVar = anVar.C0) != null && jlVar.N)) && anVar.f4 != 7;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        if (f2Var.getMessagesController().E(j10, f2Var, q1Var.getMessageObject(), null)) {
            f2Var.presentFragment(new an(j10));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final int X() {
        return this.a.f4;
    }

    @Override // org.telegram.ui.Cells.l1
    public final jh.a Z() {
        return this.a.qc;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Z0() {
        an anVar = this.a;
        anVar.f8();
        UndoView undoView = anVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, anVar.j6, null);
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        an anVar = this.a;
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            CharSequence fieldText = qjVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = org.telegram.messenger.t3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                anVar.Z.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.i3(new tl(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var == null ? null : q1Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        an anVar = this.a;
        return (anVar.f4 == 1 || anVar.U9() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        an anVar = this.a;
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            CharSequence fieldText = qjVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String n10 = org.telegram.messenger.t10.n(user);
            if (n10 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) n10).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(rf.b.q(org.telegram.messenger.t10.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.y31("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            anVar.Z.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.i3(new tl(this, 7), 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.l1
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        char c10;
        int i7;
        w4 b10;
        int i10;
        uj ujVar;
        tj tjVar;
        final int i11 = 0;
        if (!f()) {
            return false;
        }
        an anVar = this.a;
        final int i12 = 1;
        ?? r22 = (anVar.e == null || ((ujVar = anVar.c1) != null && ujVar.getVisibility() == 0) || ((tjVar = anVar.S) != null && tjVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = anVar.e;
        ?? r42 = (chat == null || !(anVar.r4 == 0 || anVar.v4) || (org.telegram.messenger.t3.T(chat) && !anVar.e.megagroup)) ? 0 : 1;
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        final int i13 = 2;
        if (r22 != 0) {
            c5VarArr[2] = c5.n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.r;
        }
        TLRPC.UserFull b22 = anVar.getMessagesController().b2(user.id);
        if (b22 != null) {
            b10 = w4.c(user, b22, c5VarArr);
            if (!ab.q.i(b10)) {
                i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        }
        if (ab.q.i(b10)) {
            ab.q.o().C((ViewGroup) anVar.fragmentView, anVar.xa, b10, new a7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(anVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.hd.M0(2131747785, null), new Runnable(this) { // from class: org.telegram.ui.ul
            public final /* synthetic */ lm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.q(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Ma(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, org.telegram.messenger.hd.M0(2131745602, null), new o1(this, q1Var, user, 24), false);
        H.l(R.drawable.msg_mention, org.telegram.messenger.hd.M0(2131748608, null), new Runnable(this) { // from class: org.telegram.ui.ul
            public final /* synthetic */ lm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.q(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Ma(user);
                        break;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, org.telegram.messenger.hd.M0(2131753758, null), new Runnable(this) { // from class: org.telegram.ui.ul
            public final /* synthetic */ lm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.q(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Ma(user);
                        break;
                }
            }
        }, r42);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        an anVar = this.a;
        if (anVar.V9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (anVar.getParentActivity() != null) {
            if (anVar.c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                qj qjVar = anVar.Z;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
                gi giVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                vf.b bVar = anVar.ac;
                if (bVar != null) {
                    bVar.a(true);
                    anVar.ac = null;
                }
                if (str == null || q1Var.getMessageObject() == null) {
                    anVar.ac = null;
                } else {
                    gi giVar2 = new gi(anVar, q1Var.getMessageObject().f1(), str, q1Var, 1);
                    anVar.ac = giVar2;
                    giVar = giVar2;
                }
                qjVar.Z(keyboardButtonProto, messageObject, messageObject2, giVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.ij messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            an anVar = this.a;
            if (anVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.w2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.w2.g;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    org.telegram.messenger.fu fuVar = (org.telegram.messenger.fu) arrayList2.get(i7);
                    if (fuVar instanceof org.telegram.messenger.su) {
                        arrayList.add(((org.telegram.messenger.su) fuVar).q0);
                    } else if (fuVar instanceof org.telegram.messenger.ev) {
                        arrayList.add(((org.telegram.messenger.ev) fuVar).q0);
                    } else if (fuVar instanceof org.telegram.messenger.ku) {
                        ArrayList arrayList3 = ((org.telegram.messenger.ku) fuVar).X;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.yt) obj).b);
                        }
                    } else if (fuVar instanceof org.telegram.messenger.wu) {
                        ArrayList arrayList4 = ((org.telegram.messenger.wu) fuVar).X;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.yt) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.H2(null, anVar, null);
                    return p12.c2(null, null, null, null, null, null, null, indexOf, new rl(anVar, arrayList), null, 0L, 0L, 0L, true, new ql(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    public final void c(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z9;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        an anVar = this.a;
        anVar.getUserConfig().f();
        if (!org.telegram.messenger.g0.E1(anVar.getParentActivity()) || (chat = anVar.e) == null || currentUser == null || org.telegram.messenger.t3.V(chat)) {
            return;
        }
        boolean z12 = true;
        boolean z13 = false;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z9 = false;
                z13 = true;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z9 = channelParticipant.promoted_by == anVar.getUserConfig().e();
            } else {
                z9 = false;
                z12 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z13 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z10 = channelParticipant2.promoted_by == anVar.getUserConfig().e();
                } else {
                    z10 = false;
                    z12 = false;
                }
                str2 = channelParticipant2.rank;
                z11 = z10;
                boolean z14 = z12;
                boolean z15 = z13;
                Activity parentActivity = anVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                long j3 = -anVar.e.id;
                f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                org.telegram.ui.Components.dy0.b(parentActivity, i7, j3, currentUser, str2, z14, z15, z11, f6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (org.telegram.messenger.t3.T(anVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    anVar.getMessagesController();
                    tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(anVar.e);
                    tL_channels_getParticipant.participant = anVar.getMessagesController().j1(currentUser.id);
                    anVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.p5(11, this, q1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z9 = false;
                z13 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z9 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == anVar.getUserConfig().e();
            } else {
                z9 = false;
                z12 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z11 = z9;
        str2 = str;
        boolean z142 = z12;
        boolean z152 = z13;
        Activity parentActivity2 = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        long j32 = -anVar.e.id;
        f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
        org.telegram.ui.Components.dy0.b(parentActivity2, i7, j32, currentUser, str2, z142, z152, z11, f6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void c2(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Vc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z9;
        an anVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar2.v() || anVar.W9()) {
            return false;
        }
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        return !z9;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void d0(int i7) {
        int i10;
        SpannableStringBuilder X2;
        int i11;
        int i12 = 3;
        int i13 = 2;
        int i14 = 1;
        an anVar = this.a;
        try {
            if (i7 == 0) {
                anVar.v7();
                mk mkVar = anVar.N3;
                if (mkVar == null) {
                    return;
                }
                mkVar.l(0L, 84, null, new tl(this, i14));
                anVar.N3.performHapticFeedback(3, 2);
                return;
            }
            if (i7 == 1) {
                String x10 = org.telegram.messenger.hd.x(anVar.getMessagesController().u4, true);
                if (anVar.getMessagesController().u4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(org.telegram.ui.Components.m11.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(org.telegram.ui.Components.m11.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.hc.a0(anVar).G(R.raw.transcribe, 6, X2).k(true);
                anVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.hd.x(anVar.getMessagesController().u4, true);
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(anVar.getMessagesController().s4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i7 == 2 ? org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131743969, null), new tl(this, i13)) : anVar.getMessagesController().u4 <= 0 ? "" : org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131743968, x11), new tl(this, i12)));
                a02.getClass();
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(a02.W(), a02.c);
                kbVar.c(R.raw.transcribe, 36, 36, new String[0]);
                if (append != null) {
                    String charSequence = append.toString();
                    int i15 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i15 >= 6) {
                            append.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i15++;
                    }
                }
                kbVar.b.setText(append);
                kbVar.b.setSingleLine(false);
                kbVar.b.setMaxLines(6);
                a02.b(kbVar, 7000).k(true);
                org.telegram.messenger.p2.D.a();
            }
        } catch (Exception unused) {
        }
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10, boolean z11) {
        org.telegram.messenger.ij primaryMessageObject;
        int i7;
        int i10;
        dj djVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.K1 = true;
        an anVar = this.a;
        aj ajVar = anVar.z0;
        if (ajVar != null && (djVar = anVar.B0) != null && djVar.y < 0) {
            for (int childCount = ajVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = anVar.z0.getChildAt(childCount);
                anVar.z0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = anVar.f9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = anVar.f9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        if (z9 && i7 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z11) {
                dj djVar2 = anVar.B0;
                anVar.z0.getClass();
                djVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) anVar.L9), false);
            } else {
                anVar.B0.h1(i7, i10);
            }
        }
        anVar.b1 = z10;
        anVar.Vc(primaryMessageObject, false);
        anVar.b1 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e0() {
        return this.a.f4 == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e2() {
        this.a.M9();
    }

    public final boolean f() {
        an anVar = this.a;
        if (org.telegram.messenger.t10.B(anVar.f)) {
            return true;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat != null) {
            return !org.telegram.messenger.t3.T(chat) || anVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        this.a.l8(q1Var, reactionCount, z9, f10, f11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        this.a.X7(q1Var, true, false, f10, f11, false, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String b10;
        int i12;
        TLRPC.User user2;
        int i13;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        File file = null;
        an anVar = this.a;
        if (i7 == 19) {
            vf.b bVar = anVar.ac;
            if (bVar != null) {
                bVar.a(true);
            }
            final em emVar = q1Var.getMessageObject() != null ? new em(this, q1Var, 2) : null;
            anVar.ac = emVar;
            final Activity parentActivity = anVar.getParentActivity();
            final org.telegram.ui.ActionBar.f6 resourceProvider = anVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            emVar.d();
            emVar.b = new wg.c(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b11 = wg.h.b(messageObject);
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(-messageObject.Z0()));
            final boolean z9 = M0 != null && org.telegram.messenger.t3.V(M0);
            final long j3 = messageObject.k.date * 1000;
            wg.s.d(messageObject, new org.telegram.messenger.c20(atomicBoolean, emVar, z9, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: wg.d
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ vf.b b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ f6 g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.a.get()) {
                        return;
                    }
                    this.b.b();
                    boolean z10 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z11 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Context context = this.f;
                    f6 f6Var = this.g;
                    if (z10) {
                        h.d(z11, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        h.e(z11, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, f6Var);
                    }
                }
            }, new wg.e(atomicBoolean, emVar, 0));
            return;
        }
        if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z10 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.r();
            vf.c.t(anVar.getParentActivity(), org.telegram.messenger.r2.g);
            return;
        }
        if (i7 == 84) {
            anVar.Ta(q1Var);
            return;
        }
        if (i7 == 80) {
            org.telegram.ui.Cells.o8 o8Var = org.telegram.ui.Components.qe0.I1;
            if (anVar.getParentActivity() == null) {
                return;
            }
            anVar.showDialog(new org.telegram.ui.Components.qe0(anVar.getContext(), anVar.getCurrentAccount(), messageObject, anVar.getResourceProvider()));
            return;
        }
        if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(messageObject) == null) {
                anVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i14 = 5;
        if (i7 == 5) {
            long j10 = messageObject.k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                user2 = org.telegram.messenger.qp.s1(i13).a2(Long.valueOf(j10));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                anVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File g12 = org.telegram.messenger.g0.g1();
                    g12.mkdirs();
                    file = new File(g12, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                anVar.showDialog(new org.telegram.ui.Components.ad0(anVar, null, user2, null, file, pf.b.d(str, false), str3, str4, anVar.xa));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 30) {
            anVar.presentFragment(new an(a8.p0.j(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i7 == 31) {
            long j11 = messageObject.k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                user = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.X1)) {
                    b10 = messageObject.X1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str5 = org.telegram.messenger.ij.o1(messageObject.k).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? pf.b.c().b(str5) : org.telegram.messenger.hd.M0(2131747831, null);
                } else {
                    b10 = org.telegram.messenger.k5.i(new StringBuilder("+"), user.phone, pf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                anVar.presentFragment(new nr(bundle2));
                return;
            }
            return;
        }
        if (i7 == 23 || i7 == 24) {
            boolean z11 = i7 == 24;
            TLRPC.Message message2 = messageObject.k;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            vf.b bVar2 = anVar.ac;
            if (bVar2 != null) {
                bVar2.a(true);
            }
            int i15 = 3;
            anVar.ac = q1Var.getMessageObject() != null ? new em(this, q1Var, i15) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                if (org.telegram.messenger.ui.b0(i10).p0(group) == null) {
                    anVar.ac.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    anVar.ac.b = new bg.m0(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new fi.d3(i15, this, z11)), 28);
                    return;
                }
            }
            vf.c.s(anVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, anVar.ac, null, false, true, false, false);
            return;
        }
        if (messageObject.s4()) {
            anVar.ja(messageObject, false, false);
            if (messageObject.R0 != null) {
                vf.b bVar3 = anVar.ac;
                if (bVar3 != null) {
                    bVar3.a(true);
                }
                anVar.ac = q1Var.getMessageObject() != null ? new em(this, q1Var, 4) : null;
                vf.c.s(anVar.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, anVar.ac, null, false, anVar.getMessagesController().d6, false, false);
                return;
            }
            return;
        }
        TLRPC.WebPage X1 = messageObject.X1();
        if (X1 == null && (message = messageObject.k) != null && (messageMedia2 = message.media) != null) {
            X1 = messageMedia2.webpage;
        }
        if (X1 == null) {
            return;
        }
        if (X1.attributes != null) {
            for (int i16 = 0; i16 < X1.attributes.size(); i16++) {
                if ((X1.attributes.get(i16) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) X1.attributes.get(i16)).storyItem) != null) {
                    storyItem.dialogId = org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.f1();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    anVar.getOrCreateStoryViewer().L(anVar.getParentActivity(), tL_webPageAttributeStory.storyItem, di.h7.a(anVar.z0));
                    return;
                }
            }
        }
        if (anVar.Ea(X1.url, q1Var, null, messageObject.f1(), 2)) {
            return;
        }
        vf.b bVar4 = anVar.ac;
        if (bVar4 != null) {
            bVar4.a(true);
        }
        anVar.ac = q1Var.getMessageObject() != null ? new em(this, q1Var, i14) : null;
        vf.c.s(anVar.getParentActivity(), Uri.parse(X1.url), true, true, false, anVar.ac, null, false, true, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean g2(int i7) {
        boolean z9;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        if (i7 != 16 && i7 != R.id.acc_action_small_button && i7 != R.id.acc_action_msg_options) {
            return false;
        }
        an anVar = this.a;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        if (!z9 || !anVar.ca) {
            return !d();
        }
        q4Var = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
            ((ActionBarLayout) q4Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        an anVar;
        int i7;
        if (q1Var.getMessageObject() == null || (i7 = (anVar = this.a).Wb) == 0 || i7 != q1Var.getMessageObject().f1() || anVar.Xb != 3) {
            return null;
        }
        return anVar.Zb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final int h0(org.telegram.ui.Cells.q1 q1Var) {
        sh.b bVar;
        an anVar = this.a;
        if (!anVar.ad.f || (bVar = anVar.gd) == null || bVar.n != q1Var || bVar.a.getWidth() <= 0) {
            return 0;
        }
        return anVar.gd.a.getHeight();
    }

    public final void i(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, boolean z9) {
        an anVar = this.a;
        TLRPC.Chat chat2 = anVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            ui uiVar = anVar.o1;
            if (uiVar != null && i7 == 0) {
                uiVar.e(false, false);
                return;
            } else {
                if (q1Var.getMessageObject() != null) {
                    anVar.l(i7, q1Var.getMessageObject().f1(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || anVar.da()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            hi hiVar = null;
            if (z9) {
                vf.b bVar = anVar.ac;
                if (bVar != null) {
                    bVar.a(true);
                    anVar.ac = null;
                }
                if (q1Var == null || q1Var.getMessageObject() == null) {
                    anVar.ac = null;
                } else {
                    hi hiVar2 = new hi(anVar, q1Var.getMessageObject().f1(), q1Var, 0);
                    anVar.ac = hiVar2;
                    hiVar = hiVar2;
                }
            }
            if (anVar.getMessagesController().E(bundle, anVar, q1Var.getMessageObject(), hiVar)) {
                hi hiVar3 = hiVar;
                an anVar2 = new an(bundle);
                if (hiVar3 == null || i7 == 0) {
                    anVar.presentFragment(anVar2);
                } else {
                    org.telegram.messenger.g0.i3(new bi.ub(this, hiVar3, chat, i7, anVar2, 11), 5000L);
                    hiVar3.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        an anVar = this.a;
        if (anVar.getParentActivity() == null) {
            return;
        }
        if (anVar.qa == null) {
            wh.i iVar = new wh.i(anVar.getParentActivity());
            anVar.qa = iVar;
            anVar.l1.addView(iVar, c8.ha.e(-1, -1, 48));
        }
        wh.i iVar2 = anVar.qa;
        HashMap hashMap = iVar2.a;
        ArrayList arrayList = iVar2.c;
        arrayList.clear();
        int i7 = iVar2.d;
        org.telegram.messenger.p10 i10 = org.telegram.messenger.p10.i(i7);
        long j3 = i10.n;
        arrayList.add(Long.valueOf(j3));
        if (i10.V) {
            ArrayList arrayList2 = org.telegram.messenger.ui.b0(i7).i1;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                long j10 = tL_topPeer.peer.user_id;
                if (j10 != 0) {
                    int i12 = size;
                    if (org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j10));
                    }
                    size = i12;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = org.telegram.messenger.qp.s1(i7).y;
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j11 = dialog.id;
                if (j11 != j3 && !org.telegram.messenger.m5.C(j11)) {
                    if (org.telegram.messenger.m5.E(dialog.id)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(dialog.id));
                        if (a22 != null && !org.telegram.messenger.t10.t(a22) && !org.telegram.messenger.t10.x(a22) && !org.telegram.messenger.t10.A(a22.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-dialog.id));
                        if (M0 != null && !M0.forum && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList3);
        String b10 = wh.i.b(q1Var);
        if (b10 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            Long l10 = (Long) obj2;
            if (hashSet.add(l10) && org.telegram.messenger.m5.E(l10.longValue())) {
                arrayList5.add(l10);
            }
        }
        wh.h hVar = new wh.h(iVar2, q1Var, arrayList5, new ti.p(27, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i2() {
        an anVar = this.a;
        if (!anVar.getUserConfig().q()) {
            org.telegram.ui.Components.hc.a0(anVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.hd.H(',', "UnlockSimilarChannelsPremium", anVar.getMessagesController().x4), new tl(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", anVar.j6);
        bundle.putInt("start_from", 10);
        anVar.presentFragment(new org.telegram.ui.Components.u80(bundle, anVar.o1.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a10 = sh.g.a(messageObject);
        boolean a11 = c8.yc.a(a10, 7);
        an anVar = this.a;
        if (a11) {
            org.telegram.ui.Components.hc.a0(anVar).Q(R.raw.e_hand_2, 36, sh.g.b(a10, messageObject)).j();
            return;
        }
        if (i7 < 0 && !arrayList.isEmpty()) {
            anVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
            q1Var.a0(true);
            return;
        }
        if (anVar.getParentActivity() == null) {
            return;
        }
        if (anVar.B2 == null) {
            int indexOfChild = anVar.l1.indexOfChild(anVar.T);
            if (indexOfChild == -1) {
                return;
            }
            fi.m3 D6 = anVar.D6(250.0f, 3, indexOfChild + 1, false);
            anVar.B2 = D6;
            D6.u0 = 0.0f;
        }
        if (arrayList.isEmpty() && i7 < 0) {
            ArrayList<org.telegram.ui.Cells.p1> pollButtons = q1Var.getPollButtons();
            int size = pollButtons.size();
            int i12 = 0;
            float f10 = 0.0f;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i12);
                float y10 = ((q1Var.getY() + p1Var.b) - org.telegram.messenger.g0.L(4.0f)) - anVar.L9;
                anVar.E2 = org.telegram.messenger.g0.L(13.3f) + p1Var.a;
                int D = org.telegram.messenger.camera.q.D(6.0f, p1Var.b, i11);
                anVar.F2 = D;
                if (y10 > 0.0f) {
                    i10 = anVar.E2;
                    i11 = D;
                    f10 = 0.0f;
                    break;
                }
                i12++;
                f10 = y10;
            }
            if (f10 != 0.0f) {
                anVar.z0.w0(0, (int) f10, null);
                anVar.D2 = q1Var;
                return;
            }
        }
        an.p2(anVar, q1Var, i7, i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        wh.h hVar;
        wh.i iVar = this.a.qa;
        if (iVar == null || (hVar = (wh.h) iVar.a.get(wh.i.b(q1Var))) == null) {
            return;
        }
        wh.d[] dVarArr = hVar.x;
        RectF rectF = hVar.r;
        if (hVar.M) {
            float f12 = (f10 - rectF.left) + hVar.U;
            float f13 = (f11 - rectF.top) + hVar.V;
            int i7 = wh.g.a;
            int b10 = (((float) (-org.telegram.messenger.g0.L((float) 37))) >= f13 || f13 >= rectF.height()) ? -1 : c8.j9.b((int) Math.floor((f12 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(wh.g.a + 11)), 0, dVarArr.length - 1);
            if (hVar.R == b10) {
                return;
            }
            hVar.a.performHapticFeedback(3, 1);
            hVar.R = b10;
            int i10 = 0;
            while (i10 < dVarArr.length) {
                wh.d dVar = dVarArr[i10];
                boolean z9 = b10 == i10;
                if (dVar.p != z9) {
                    ValueAnimator valueAnimator = dVar.n;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dVar.p = z9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.o, z9 ? 1.0f : 0.0f);
                    dVar.n = ofFloat;
                    ofFloat.setDuration(180L);
                    dVar.n.addUpdateListener(dVar);
                    dVar.n.setInterpolator(wh.f.a);
                    dVar.n.start();
                }
                wh.d dVar2 = dVarArr[i10];
                boolean z10 = b10 == i10 || b10 == -1;
                if (dVar2.m != z10) {
                    ValueAnimator valueAnimator2 = dVar2.k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dVar2.m = z10;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dVar2.l, z10 ? 1.0f : 0.0f);
                    dVar2.k = ofFloat2;
                    ofFloat2.setDuration(180L);
                    dVar2.k.addUpdateListener(dVar2);
                    dVar2.k.setInterpolator(wh.f.a);
                    dVar2.k.start();
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        org.telegram.messenger.ij messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        an anVar = this.a;
        fi.m3 m3Var = anVar.O1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (anVar.getParentActivity() == null || (messageObject = q1Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.hd.E0().y);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str = R0.country;
        }
        fi.m3 m3Var2 = new fi.m3(anVar.getParentActivity(), 3);
        m3Var2.r(true);
        m3Var2.K = Layout.Alignment.ALIGN_NORMAL;
        m3Var2.d = -1L;
        m3Var2.T = true;
        m3Var2.e = true;
        m3Var2.s(12.0f);
        anVar.O1 = m3Var2;
        m3Var2.q0 = new qf(17, this, m3Var2);
        m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750849, str)));
        anVar.O1.l(anVar.K);
        anVar.l1.addView(anVar.O1, c8.ha.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        anVar.l1.post(new l2.a0(this, q1Var, i10, i7, 12));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k() {
        org.telegram.messenger.t0.u();
        boolean z9 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.a.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean k0() {
        boolean z9;
        an anVar = this.a;
        if (anVar.W9()) {
            return false;
        }
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        return !z9;
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.j9 k2() {
        return this.a.q9;
    }

    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.f2 f2Var = this.a;
            if (f2Var.getMessagesController().E(bundle, f2Var, q1Var.getMessageObject(), null)) {
                f2Var.presentFragment(new an(bundle));
            }
        }
    }

    public final void m(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m0(String str) {
        an anVar = this.a;
        uj ujVar = anVar.c1;
        if (ujVar == null || ujVar.getVisibility() != 0) {
            tj tjVar = anVar.S;
            if ((tjVar == null || tjVar.getVisibility() != 0) && anVar.Z != null && str != null && str.length() > 0) {
                anVar.Z.setFieldText("@" + str + " ");
                anVar.Z.H0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10;
        TLRPC.Document document;
        int i11;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i12;
        TLRPC.Document document3;
        int i13;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia n1 = org.telegram.messenger.ij.n1(messageObject);
        if (messageMedia == null || messageObject == null || !(n1 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n1;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            B1(q1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        an anVar = this.a;
        if (geoPoint != null) {
            if (org.telegram.messenger.g0.J1(anVar)) {
                im imVar = new im(3);
                f6Var2 = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                imVar.setResourceProvider(f6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = anVar.getMessagesController().z1(anVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                imVar.P0 = false;
                imVar.G0(new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message, false, false));
                anVar.presentFragment(imVar);
                return;
            }
            return;
        }
        if (org.telegram.messenger.ij.O2(messageMedia.document)) {
            ks.p().v(anVar.getParentActivity());
            ks.p().u(new jm(this, tL_messageMediaPoll, pollAnswer, q1Var));
            ks p10 = ks.p();
            TLRPC.Document document4 = messageMedia.document;
            int i17 = org.telegram.messenger.ij.I2(document4) ? 2 : 0;
            org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
            f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
            p10.s(document4, null, "", null, null, i17, false, messageObject2, f6Var, org.telegram.messenger.qs.e3);
            return;
        }
        if (org.telegram.messenger.ij.K3(messageMedia.document)) {
            org.telegram.messenger.ij ijVar = MediaController.B().u0;
            if (MediaController.B().I(messageObject) && ijVar != null) {
                if (ijVar.k0 == (i7 == -3)) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(ijVar);
                        return;
                    } else {
                        MediaController.B().R(ijVar, true);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.k;
            TLRPC.TL_message Q7 = an.Q7(message);
            Q7.media = messageMedia;
            Q7.attachPath = sh.d.c(i7, message);
            ArrayList arrayList = new ArrayList();
            i16 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i16, Q7, false, true);
            ijVar2.k0 = i7 == -3;
            arrayList.add(ijVar2);
            if (MediaController.B().I(messageObject)) {
                MediaController.B().q(false, true, false, false);
            }
            MediaController.B().o0(arrayList, ijVar2, 0L, true, null, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !org.telegram.messenger.ij.L4(document5)) {
            i14 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            sh.a aVar = new sh.a(i14, messageObject, document6, sh.d.c(i7, messageObject.k));
            if (aVar.g) {
                org.telegram.messenger.w7.G(i14).f(document6);
                aVar.a();
                q1Var.Z();
                return;
            }
            if (!aVar.f) {
                org.telegram.messenger.w7.G(i14).X(document6, messageObject, 2, 0);
                aVar.a();
                q1Var.Z();
                return;
            }
            TLRPC.Message message2 = messageObject.k;
            TLRPC.TL_message Q72 = an.Q7(message2);
            Q72.media = messageMedia;
            Q72.attachPath = sh.d.c(i7, message2);
            i15 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            km kmVar = new km(i15, Q72, false, true);
            if (org.telegram.messenger.ij.y(messageMedia.document)) {
                PhotoViewer.p1().H2(null, anVar, anVar.xa);
                PhotoViewer p12 = PhotoViewer.p1();
                int i18 = kmVar.D;
                p12.d2(kmVar, anVar, i18 != 0 ? anVar.j6 : 0L, i18 != 0 ? anVar.b7 : 0L, i18 != 0 ? anVar.b() : 0L, anVar.Za);
                return;
            }
            try {
                org.telegram.messenger.g0.u2(kmVar, anVar.getParentActivity(), anVar.xa, false);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                anVar.L6(kmVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.ij.L4(document3))) {
            i10 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message Q73 = an.Q7(message3);
            Q73.media = messageMedia3;
            Q73.attachPath = sh.d.c(-2, message3);
            i13 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            arrayList3.add(new bm(i13, Q73, false, true));
            arrayList2.add(-2);
        } else {
            i10 = -1;
        }
        if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.ij.L4(document2))) {
            if (messageMedia2 == messageMedia) {
                i10 = arrayList3.size();
            }
            TLRPC.TL_message Q74 = an.Q7(message3);
            Q74.media = messageMedia2;
            Q74.attachPath = sh.d.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            Q74.message = pollResults2.solution;
            Q74.entities = pollResults2.solution_entities;
            i12 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            arrayList3.add(new cm(i12, Q74, false, true));
            arrayList2.add(-3);
        }
        cg.d.b(tL_messageMediaPoll.poll, anVar.getUserConfig().e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.ij.L4(document))) {
                if (pollAnswer2.unshuffled_index == i7) {
                    i10 = arrayList3.size();
                }
                TLRPC.TL_message Q75 = an.Q7(message3);
                Q75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                Q75.message = tL_textWithEntities2.text;
                Q75.entities = tL_textWithEntities2.entities;
                Q75.attachPath = sh.d.c(pollAnswer2.unshuffled_index, message3);
                i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                arrayList3.add(new dm(i11, Q75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.q0 = arrayList2;
        PhotoViewer.p1().H2(null, anVar, anVar.xa);
        PhotoViewer.p1().Z1(arrayList3, i10, anVar.a(), 0L, 0L, anVar.ab);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean n0(org.telegram.ui.Components.r5 r5Var) {
        TLRPC.InputStickerSet j12;
        int i7;
        an anVar = this.a;
        if (!anVar.getMessagesController().D3() && r5Var != null && !r5Var.standard) {
            long documentId = r5Var.getDocumentId();
            TLRPC.Document document = r5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                document = org.telegram.ui.Components.i5.e(i7, documentId);
            }
            if (document != null && (j12 = org.telegram.messenger.ij.j1(document)) != null) {
                org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).m0(j12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(j12);
                org.telegram.ui.Components.qu quVar = new org.telegram.ui.Components.qu(anVar, anVar.getParentActivity(), anVar.xa, arrayList);
                org.telegram.ui.Components.iu iuVar = quVar.m1;
                iuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(iuVar);
                iuVar.w = imageReceiver;
                if (iuVar.d) {
                    imageReceiver.P();
                }
                iuVar.x = true;
                iuVar.y.e(true, 1.0f);
                iuVar.w.r0(org.telegram.messenger.hc.b(document), "140_140", org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, true), 0L, null, null, 0);
                iuVar.w.E0(7);
                ImageReceiver imageReceiver2 = iuVar.w;
                imageReceiver2.u0 = true;
                imageReceiver2.t0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = iuVar.w;
                imageReceiver3.w0 = true;
                imageReceiver3.H0(iuVar);
                boolean T9 = anVar.T9();
                quVar.h0 = T9;
                quVar.n = T9;
                anVar.showDialog(quVar);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean n1() {
        an anVar = this.a;
        return anVar.l1.getMeasuredWidth() > anVar.l1.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
        float L;
        if (q1Var.getMessageObject().z3()) {
            Z0();
            return;
        }
        an anVar = this.a;
        if (anVar.z3 || anVar.z0 == null || anVar.getParentActivity() == null || anVar.fragmentView == null) {
            return;
        }
        if (anVar.I2 == null) {
            int indexOfChild = anVar.l1.indexOfChild(anVar.T);
            if (indexOfChild == -1) {
                return;
            }
            fi.m3 D6 = anVar.D6(250.0f, 3, indexOfChild + 1, false);
            anVar.I2 = D6;
            D6.u(org.telegram.messenger.hd.M0(2131749328, null));
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        TLRPC.User currentUser = q1Var.getCurrentUser();
        if (currentUser == null || currentUser.id != 0) {
            float L2 = org.telegram.messenger.g0.L(22.0f);
            L = (messageObject.Q3() || !q1Var.j9 || q1Var.U8 == null) ? L2 : org.telegram.messenger.g0.L(20.0f) + L2;
        } else {
            L = (q1Var.getMeasuredHeight() - Math.max(0, q1Var.getBottom() - ((View) q1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
        }
        if (anVar.u9(q1Var, L) <= org.telegram.messenger.g0.L(80.0f)) {
            return;
        }
        anVar.I2.x(anVar.t9(q1Var, q1Var.getForwardNameCenterX()), anVar.u9(q1Var, L) - org.telegram.messenger.g0.L(4.0f), true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p() {
        this.a.l1.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        an anVar = this.a;
        anVar.X7(q1Var, false, false, f10, f11, true, false, false);
        anVar.z0.getClass();
        an.k2(anVar, RecyclerView.R(q1Var));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        an anVar = this.a;
        return anVar.Wb != 0 && q1Var.getMessageObject() != null && anVar.Wb == q1Var.getMessageObject().f1() && anVar.Xb == i7;
    }

    public final void q(TLRPC.User user, boolean z9) {
        int i7;
        if (user == null || user.id == 489000) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i10 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z9 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("expandPhoto", z9);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        an anVar = this.a;
        TLRPC.User user2 = anVar.f;
        if (user2 != null && user2.id == user.id) {
            i10 = 1;
        }
        profileActivity.g5(i10);
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        org.telegram.messenger.g0.l3(parentActivity, i7);
        anVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
        e(q1Var, z9, false, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
    
        if (org.telegram.messenger.t3.t0(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i7;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        TLRPC.Message message2;
        int i11;
        TLRPC.Peer peer;
        org.telegram.messenger.dj djVar;
        int i12;
        an anVar = this.a;
        if (anVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.g11 g11Var = anVar.f2;
        boolean z9 = true;
        if (g11Var != null && anVar.r4 == 0 && (q1Var.k6 || q1Var.l6)) {
            g11Var.n(q1Var.getMessageObject().Z1(), true);
            return;
        }
        if (anVar.getMessagesController().v2()) {
            i12 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            b.b(i12);
            return;
        }
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            qjVar.L();
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        int i13 = anVar.f4;
        if (i13 == 2) {
            anVar.j9.T0(messageObject.f1());
            anVar.finishFragment();
            return;
        }
        if (i13 == 3 || ((i13 == 7 && anVar.c4 == 2) || !((!org.telegram.messenger.t10.z(anVar.f) && !org.telegram.messenger.t10.B(anVar.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (org.telegram.messenger.t10.z(anVar.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i7 = messageReplyHeader.reply_to_top_id) != 0) {
                anVar.Aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i7, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (anVar.f4 == 7 && anVar.c4 == 2) {
                anVar.Fa(messageObject);
                return;
            } else {
                anVar.Ga(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.d1() == 0 || (djVar = (org.telegram.messenger.dj) anVar.N6.f(messageObject.d1())) == null) ? null : djVar.d;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.k5.k(messageObject);
        }
        if (anVar.getMessagesController().W4()) {
            int i14 = messageObject.I1;
            if (!messageObject.s4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i11 = messageObject.D) != 17 && i11 != 12)) {
                long B0 = org.telegram.messenger.ij.B0(message2);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i14).M0(Long.valueOf(-B0));
                if (M0 == null || !M0.noforwards) {
                    if (B0 >= 0 || !org.telegram.messenger.t3.V(M0)) {
                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.k.fwd_from;
                        if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                            long o4 = org.telegram.messenger.m5.o(peer);
                            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i14).M0(Long.valueOf(-o4));
                            if (o4 < 0) {
                                if (M02 != null) {
                                }
                                if (org.telegram.messenger.t3.V(M02)) {
                                }
                            }
                        }
                    }
                    boolean z10 = z9;
                    anVar.showDialog(new fm(this, anVar.getParentActivity(), anVar, arrayList, org.telegram.messenger.t3.T(anVar.e), z10, anVar.xa, z10, messageObject));
                    Activity parentActivity = anVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i10);
                    anVar.fragmentView.requestLayout();
                }
            }
        }
        z9 = false;
        boolean z102 = z9;
        anVar.showDialog(new fm(this, anVar.getParentActivity(), anVar, arrayList, org.telegram.messenger.t3.T(anVar.e), z102, anVar.xa, z102, messageObject));
        Activity parentActivity2 = anVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        org.telegram.messenger.g0.l3(parentActivity2, i10);
        anVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r1(org.telegram.ui.Cells.q1 q1Var) {
        an.e5(this.a, q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        boolean z9 = true;
        if (kVar.v() || anVar.W9()) {
            an.j2(anVar, q1Var, true, f10, f11);
            return;
        }
        if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().s4()) {
            g1(q1Var, 10);
            return;
        }
        if (!org.telegram.messenger.t3.c0(anVar.e) && !anVar.da()) {
            z9 = false;
        }
        q(user, z9);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        e(q1Var, z9, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u() {
        this.a.Bc();
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x061c, code lost:
    
        if (r0.exists() != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x06e1, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L225;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x072f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z9) {
        int i7;
        an anVar;
        boolean z10;
        an anVar2;
        File file;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i10;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        int i11 = messageObject.D;
        int i12 = 2;
        an anVar3 = this.a;
        if (i11 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia2.peer);
            storyItem.messageId = messageObject.f1();
            storyItem.messageType = 2;
            di.r7.b(storyItem, anVar3.f);
            anVar3.getOrCreateStoryViewer().L(anVar3.getParentActivity(), messageObject.k.media.storyItem, di.h7.a(anVar3.z0));
            return;
        }
        int i13 = 1;
        if (org.telegram.messenger.ij.M4(messageObject.k)) {
            i10 = ((org.telegram.ui.ActionBar.f2) anVar3).currentAccount;
            if (org.telegram.messenger.z5.q(i10).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.o4()) {
            anVar3.X7(q1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject.p4()) {
            return;
        }
        int i14 = 0;
        if (z9 && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            org.telegram.messenger.g0.K0(str, false);
            if (anVar3.Ea(str, q1Var, null, messageObject.f1(), 2)) {
                return;
            }
            vf.b bVar = anVar3.ac;
            if (bVar != null) {
                bVar.a(true);
            }
            anVar3.ac = q1Var.getMessageObject() != null ? new em(this, q1Var, i14) : null;
            vf.c.s(anVar3.getParentActivity(), Uri.parse(str), true, false, false, anVar3.ac, null, false, true, false, false);
            return;
        }
        if (messageObject.U2()) {
            vl vlVar = new vl(this, messageObject, i14);
            TLRPC.MessageMedia o12 = org.telegram.messenger.ij.o1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(o12) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(o12) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                vlVar.run();
                return;
            }
            org.telegram.messenger.qp messagesController = anVar3.getMessagesController();
            int i15 = 5;
            y yVar = new y(this, messageObject, vlVar, i15);
            TLRPC.EmojiGameInfo emojiGameInfo = messagesController.w8;
            if (emojiGameInfo != null) {
                yVar.a(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
                return;
            }
            ArrayList arrayList = messagesController.v8;
            if (arrayList != null) {
                arrayList.add(yVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            messagesController.v8 = arrayList2;
            arrayList2.add(yVar);
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(1), new org.telegram.messenger.gl(messagesController, i15));
            return;
        }
        if ((messageObject.H2() && (!messageObject.G2() || (anVar3.Qa.e.containsKey(ix.p(org.telegram.messenger.ij.U(messageObject.F0()))) && anVar3.f != null))) || messageObject.X3()) {
            anVar3.mb(q1Var);
            anVar3.Qa.k(q1Var, anVar3, true);
            anVar3.z0.I0(false);
            return;
        }
        int i16 = 6;
        if (messageObject.n5()) {
            ie Hb = anVar3.Hb(messageObject, false);
            bi.d3 Z4 = an.Z4(anVar3, messageObject);
            q1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = anVar3.getParentActivity();
            int i17 = org.telegram.messenger.p10.s0;
            f12.a = i17;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.d = i17;
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.e1 = new org.telegram.ui.Components.wk0(parentActivity, null);
                k0 k0Var = new k0(22, parentActivity, f12);
                f12.d = k0Var;
                k0Var.setBackgroundDrawable(f12.j0);
                f12.d.setFocusable(true);
                f12.d.setFocusableInTouchMode(true);
                f12.d.setClipChildren(false);
                f12.d.setClipToPadding(false);
                f12.e = new bi.x5(f12, parentActivity);
                View view = new View(parentActivity);
                f12.f = view;
                view.setBackgroundColor(2130706432);
                f12.e.addView(f12.f, c8.ha.e(-1, -2, 80));
                f12.e.setFocusable(false);
                f12.d.addView(f12.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f12.e.setLayoutParams(layoutParams);
                f12.e.setFitsSystemWindows(true);
                f12.e.setOnApplyWindowInsetsListener(new ez0(f12, 0));
                f12.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f12.e.getContext(), f12);
                f12.J0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f12);
                org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(i16, parentActivity, f12);
                f12.F = r7Var;
                r7Var.setTitleColor(-1);
                f12.F.setSubtitleColor(-1);
                f12.F.setBackgroundColor(2130706432);
                f12.F.setOccupyStatusBar(true);
                f12.F.C(1090519039, false);
                f12.F.D(-1, false);
                f12.F.setBackButtonImage(R.drawable.ic_ab_back);
                f12.F.setTitleRightMargin(org.telegram.messenger.g0.L(70.0f));
                f12.e.addView(f12.F, c8.ha.c(-2.0f, -1));
                f12.F.setActionBarMenuOnItemClick(new mt0(f12, 9));
                fi.m3 m3Var = new fi.m3(parentActivity, 1);
                f12.r = m3Var;
                m3Var.o(1.0f, -26.0f);
                f12.r.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                f12.e.addView(f12.r, c8.ha.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                kz0 kz0Var = new kz0(f12, parentActivity);
                f12.n = kz0Var;
                f12.e.addView(kz0Var, c8.ha.d(org.telegram.messenger.qs.E1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                vr0 vr0Var = new vr0(f12, i13);
                f12.S = new lz0(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.R = view2;
                view2.setBackgroundColor(2130706432);
                f12.S.addView(f12.R, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(f12.e.getContext());
                f12.Q = k5Var;
                k5Var.setTextColor(-1);
                f12.Q.setGravity(53);
                f12.Q.setTextSize(14);
                f12.Q.setImportantForAccessibility(2);
                f12.S.addView(f12.Q, c8.ha.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                l00 l00Var = new l00(8, parentActivity, f12);
                f12.P = l00Var;
                org.telegram.ui.Components.q51 q51Var = new org.telegram.ui.Components.q51(l00Var);
                f12.O = q51Var;
                q51Var.z = org.telegram.messenger.g0.L(2.0f);
                org.telegram.ui.Components.q51 q51Var2 = f12.O;
                q51Var2.k = 872415231;
                q51Var2.l = 872415231;
                q51Var2.m = -1;
                q51Var2.n = -1;
                q51Var2.A = 1509949439;
                q51Var2.j = vr0Var;
                f12.S.addView(f12.P);
                f12.e.addView(f12.S, c8.ha.e(-1, 48, 80));
                to0 to0Var = new to0(null, new di.b());
                f12.W = to0Var;
                to0Var.j0 = true;
                to0Var.h0 = false;
                kq0 kq0Var = new kq0(f12.e.getContext());
                f12.X = kq0Var;
                kq0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.fz0
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new jq0(parentActivity, secretMediaViewer.Y, secretMediaViewer.W, new a5(secretMediaViewer, 23), new td0(secretMediaViewer, 2));
                    }
                });
                f12.X.setVisibility(4);
                if (!f12.u1) {
                    f12.u1 = true;
                    f12.X.setLayerType(2, null);
                    f12.X.getCurrentView().setLayerType(2, null);
                    f12.X.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f12.T = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(64.0f), 1711276032));
                org.telegram.ui.Components.he0 he0Var = new org.telegram.ui.Components.he0(28);
                f12.U = he0Var;
                he0Var.setCallback(f12.T);
                f12.T.setImageDrawable(f12.U);
                f12.T.setScaleType(ImageView.ScaleType.CENTER);
                f12.T.setScaleX(0.6f);
                f12.T.setScaleY(0.6f);
                f12.T.setAlpha(0.0f);
                f12.T.setPivotX(org.telegram.messenger.g0.L(32.0f));
                f12.T.setPivotY(org.telegram.messenger.g0.L(32.0f));
                f12.e.addView(f12.T, c8.ha.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                f12.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                org.telegram.messenger.g0.h2();
                imageReceiver.H0(f12.e);
                imageReceiver.U0 = true;
                org.telegram.ui.Cells.u9 n10 = f12.W.n(f12.d.getContext());
                if (n10 != null) {
                    org.telegram.messenger.g0.E2(n10);
                    f12.e.addView(n10);
                }
                f12.W.S(f12.e);
                f12.W.i0 = true;
            }
            SecretMediaViewer.f().h(messageObject, anVar3.Za, Hb, Z4);
            return;
        }
        if (org.telegram.messenger.ij.I2(messageObject.F0()) && org.telegram.messenger.ij.j1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(org.telegram.messenger.ij.j1(messageObject.F0()));
            org.telegram.ui.Components.qu quVar = new org.telegram.ui.Components.qu(anVar3, anVar3.getParentActivity(), anVar3.xa, arrayList3);
            boolean T9 = anVar3.T9();
            quVar.h0 = T9;
            quVar.n = T9;
            anVar3.showDialog(quVar);
            return;
        }
        if (org.telegram.messenger.ij.k1(messageObject.k) != null) {
            org.telegram.ui.Components.yv0 yv0Var = new org.telegram.ui.Components.yv0(anVar3.getParentActivity(), anVar3, org.telegram.messenger.ij.k1(messageObject.k), null, (anVar3.c1.getVisibility() == 0 || !((chat = anVar3.e) == null || org.telegram.messenger.t3.t(chat))) ? null : anVar3.Z, anVar3.xa);
            boolean T92 = anVar3.T9();
            yv0Var.h0 = T92;
            yv0Var.n = T92;
            anVar3.showDialog(yv0Var);
            return;
        }
        if (org.telegram.messenger.ij.M4(messageObject.k) || (i7 = messageObject.D) == 1 || ((i7 == 0 && !messageObject.b5()) || org.telegram.messenger.ij.u3(messageObject.k))) {
            if (messageObject.s4()) {
                if (org.telegram.messenger.ij.u3(messageObject.k) || org.telegram.messenger.ij.T3(messageObject.k)) {
                    anVar3.ja(messageObject, true, false);
                    if (messageObject.R0 != null) {
                        vf.b bVar2 = anVar3.ac;
                        if (bVar2 != null) {
                            bVar2.a(true);
                        }
                        anVar3.ac = q1Var.getMessageObject() == null ? null : new em(this, q1Var, i13);
                        vf.c.s(anVar3.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, anVar3.ac, null, false, anVar3.getMessagesController().d6, false, false);
                        return;
                    }
                    return;
                }
                if (org.telegram.messenger.ij.M4(messageObject.k)) {
                    anVar3.ja(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.h2() > 0 && !messageObject.h3) {
                messageObject.c0 = (float) (messageObject.h2() / messageObject.L0());
            }
            anVar3.Ha(q1Var, messageObject);
            return;
        }
        int i18 = messageObject.D;
        if (i18 == 3) {
            anVar3.Hb(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    org.telegram.messenger.w7 fileLoader = anVar3.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.w7.N(message2, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity2 = anVar3.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity2, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                anVar3.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                anVar3.L6(messageObject);
                return;
            }
        }
        if (i18 == 4) {
            if (org.telegram.messenger.g0.J1(anVar3)) {
                if (!messageObject.D3()) {
                    pa0 pa0Var = new pa0(anVar3.h != null ? 0 : 3);
                    pa0Var.G0 = anVar3;
                    pa0Var.G0(messageObject);
                    anVar3.presentFragment(pa0Var);
                    return;
                }
                TLRPC.Chat chat2 = anVar3.e;
                if (chat2 != null && !org.telegram.messenger.t3.n(chat2) && !anVar3.e.megagroup) {
                    i12 = 6;
                }
                pa0 pa0Var2 = new pa0(i12);
                pa0Var2.G0 = anVar3;
                pa0Var2.G0(messageObject);
                anVar3.presentFragment(pa0Var2);
                return;
            }
            return;
        }
        if (i18 != 9 && i18 != 0) {
            return;
        }
        if (messageObject.I0().toLowerCase().endsWith("attheme")) {
            String str3 = messageObject.k.attachPath;
            if (str3 != null && str3.length() != 0) {
                file = new File(messageObject.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7 fileLoader2 = anVar3.getFileLoader();
                TLRPC.Message message3 = messageObject.k;
                fileLoader2.getClass();
                File N = org.telegram.messenger.w7.N(message3, false, true);
                if (N.exists()) {
                    file = N;
                }
            }
            org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, messageObject.I0(), null, true);
            if (v != null) {
                anVar3.presentFragment(new u71(v));
                return;
            }
            anVar3.L4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer.p1().H2(null, anVar3, anVar3.xa);
            PhotoViewer p12 = PhotoViewer.p1();
            int i19 = messageObject.D;
            p12.d2(messageObject, anVar3, i19 != 0 ? anVar3.j6 : 0L, i19 != 0 ? anVar3.b7 : 0L, i19 != 0 ? anVar3.b() : 0L, anVar3.Za);
            anVar = anVar3;
            z10 = true;
        } else {
            anVar = anVar3;
            z10 = false;
        }
        Pattern pattern = org.telegram.ui.Components.n80.a;
        String Q0 = messageObject.Q0();
        if (!"md".equalsIgnoreCase(Q0) && !"mkd".equalsIgnoreCase(Q0) && !"mdwn".equalsIgnoreCase(Q0) && !"mkdn".equalsIgnoreCase(Q0) && !"mdown".equalsIgnoreCase(Q0) && !"markdown".equalsIgnoreCase(Q0)) {
            String u12 = messageObject.u1();
            if (u12 != null) {
                String lowerCase = u12.toLowerCase();
                if (!lowerCase.startsWith("text/markdown")) {
                    if (!lowerCase.startsWith("text/x-markdown")) {
                    }
                }
            }
            if (!org.telegram.ui.Components.n80.j(messageObject)) {
                anVar2 = anVar;
                if (z10) {
                    try {
                        org.telegram.messenger.g0.u2(messageObject, anVar2.getParentActivity(), anVar2.xa, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        anVar2.L6(messageObject);
                        return;
                    }
                }
                return;
            }
        }
        if (anVar.getParentActivity() == null) {
            anVar2 = anVar;
        } else {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, anVar.getParentActivity(), anVar.xa);
            u1Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            u1Var.setOnCancelListener(new ig(0, zArr));
            u1Var.r(150L);
            an anVar4 = anVar;
            m6 m6Var = new m6(anVar4, messageObject, u1Var, zArr, 7);
            anVar2 = anVar4;
            messageObject = messageObject;
            new Thread(m6Var).start();
        }
        z10 = true;
        if (z10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        int i7;
        int i10;
        boolean z9;
        int i11;
        int i12;
        String str;
        boolean z10;
        w4 w4Var;
        uj ujVar;
        tj tjVar;
        if (!f()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.t3.K(chat, false));
        an anVar = this.a;
        int i13 = (isEmpty || anVar.e == null || ((ujVar = anVar.c1) != null && ujVar.getVisibility() == 0) || ((tjVar = anVar.S) != null && tjVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = anVar.e;
        int i14 = (chat2 == null || !(anVar.r4 == 0 || anVar.v4) || (org.telegram.messenger.t3.T(chat2) && !anVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = anVar.e;
        int i15 = (chat3 == null || chat3.id != chat.id || anVar.da()) ? 1 : 0;
        c5[] c5VarArr = new c5[i15 + 1 + i13 + i14];
        c5VarArr[0] = c5.d;
        if (i15 != 0) {
            c5VarArr[1] = chat.broadcast ? c5.e : c5.f;
            i7 = 2;
        } else {
            i7 = 1;
        }
        if (i13 != 0) {
            c5VarArr[i7] = c5.n;
            i7++;
        }
        if (i14 != 0) {
            c5VarArr[i7] = c5.r;
        }
        TLRPC.ChatFull N0 = anVar.getMessagesController().N0(chat.id);
        if (N0 != null) {
            w4Var = w4.a(chat, N0, c5VarArr);
            i11 = i13;
            i12 = i14;
            z9 = true;
            str = null;
            z10 = i15;
        } else {
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 0, chat);
            org.telegram.messenger.hc m11 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 1, chat);
            String str2 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z9 = true;
            i11 = i13;
            i12 = i14;
            str = null;
            z10 = i15;
            w4Var = new w4(m10, m11, null, str2, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, c5VarArr, new v4(i10, org.telegram.messenger.qs.T, chat));
        }
        if (ab.q.i(w4Var)) {
            ab.q.o().C((ViewGroup) anVar.fragmentView, anVar.xa, w4Var, new a7(this, chat, q1Var, 7));
            return z9;
        }
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(anVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.hd.M0(2131747785, str), new wl(this, chat, 0), false);
        boolean z11 = chat.broadcast;
        H.l(z11 ? R.drawable.msg_channel : R.drawable.msg_discussion, org.telegram.messenger.hd.M0(z11 ? 2131747810 : 2131747798, str), new o1(this, q1Var, chat, 25), z10);
        H.l(R.drawable.msg_mention, org.telegram.messenger.hd.M0(2131748608, str), new wl(this, chat, z9 ? 1 : 0), i11);
        H.l(R.drawable.msg_search, org.telegram.messenger.hd.M0(2131753758, str), new wl(this, chat, 2), i12);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void v(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        int i10;
        dj djVar;
        org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.a3 = !primaryMessageObject.a3;
        primaryMessageObject.K1 = true;
        an anVar = this.a;
        aj ajVar = anVar.z0;
        if (ajVar != null && (djVar = anVar.B0) != null && djVar.y < 0) {
            for (int childCount = ajVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = anVar.z0.getChildAt(childCount);
                anVar.z0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = anVar.f9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = anVar.f9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        anVar.Vc(primaryMessageObject, false);
        fi.m3 m3Var = anVar.O1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (i7 < 0 || q1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        anVar.B0.h1(i7, i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        an anVar = this.a;
        if (anVar.V9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (anVar.getParentActivity() != null) {
            if (anVar.c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        anVar.za(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
                        try {
                            q1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) anVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) anVar.xa, false);
                v2Var.N();
                v2Var.O = str;
                v2Var.P = false;
                v2Var.Q = true;
                CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131751767, null)};
                og.j jVar = new og.j(3, anVar, str);
                v2Var.L = charSequenceArr;
                v2Var.K = jVar;
                anVar.showDialog(v2Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean w1() {
        an anVar = this.a;
        return anVar.l1.getKeyboardHeight() + anVar.Ha >= org.telegram.messenger.g0.L(20.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject;
        TLRPC.MessageReplies messageReplies;
        int i7;
        long j3;
        org.telegram.messenger.dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.ij) arrayList.get(0);
                org.telegram.messenger.ij ijVar = messageObject;
                messageReplies = ijVar.k.replies;
                if (messageReplies == null) {
                    i7 = messageReplies.read_max_id;
                    j3 = messageReplies.channel_id;
                } else {
                    i7 = -1;
                    j3 = 0;
                }
                int i10 = i7;
                long j10 = j3;
                an anVar = this.a;
                anVar.Aa(anVar.e.id, ijVar, ijVar.f1(), j10, i10, 0, null);
            }
        }
        messageObject = q1Var.getMessageObject();
        org.telegram.messenger.ij ijVar2 = messageObject;
        messageReplies = ijVar2.k.replies;
        if (messageReplies == null) {
        }
        int i102 = i7;
        long j102 = j3;
        an anVar2 = this.a;
        anVar2.Aa(anVar2.e.id, ijVar2, ijVar2.f1(), j102, i102, 0, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean x0(org.telegram.messenger.ij ijVar) {
        return !this.a.s.containsKey(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        boolean z9 = q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        an anVar = this.a;
        if (z9) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().k.media).channels.get(i7).longValue();
            if (anVar.j6 != j3) {
                anVar.presentFragment(an.ra(j3));
            } else {
                anVar.o1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            anVar.presentFragment(ProfileActivity.A4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().k.media).winners.get(i7).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final String y(long j3) {
        TLRPC.Peer peer;
        String C0;
        an anVar = this.a;
        if (org.telegram.messenger.t10.u(anVar.f)) {
            return null;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat != null && !org.telegram.messenger.t3.V(chat) && (C0 = anVar.getMessagesController().C0(anVar.e.id, j3)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = anVar.q4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j3 || peer.channel_id == j3 || peer.chat_id == j3)) {
            return null;
        }
        return org.telegram.messenger.hd.M0(2131744021, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
        sh.b bVar = this.a.gd;
        if (bVar == null || bVar.n != q1Var) {
            return;
        }
        bVar.x.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        an anVar = this.a;
        anVar.t5 = messageObject;
        anVar.A9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.Z5();
        messageObject.K1 = true;
        q1Var.G1();
        q1Var.requestLayout();
        this.a.C0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Components.v5 m10;
        an anVar = this.a;
        if (anVar.z3 || org.telegram.messenger.iz.A0 || anVar.z0 == null || anVar.getParentActivity() == null || anVar.fragmentView == null) {
            return;
        }
        fi.m3 m3Var = anVar.H2;
        if (m3Var == null || !m3Var.V) {
            if (m3Var == null) {
                int indexOfChild = anVar.l1.indexOfChild(anVar.T);
                if (indexOfChild == -1) {
                    return;
                }
                fi.m3 D6 = anVar.D6(250.0f, 3, indexOfChild + 1, false);
                anVar.H2 = D6;
                D6.d = 10000L;
                D6.m(anVar.getParentActivity().getResources().getDrawable(R.drawable.tooltip_sound).mutate());
                anVar.H2.u(org.telegram.messenger.hd.M0(2131753762, null));
            }
            int childCount = anVar.z0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = anVar.z0.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.ij.M4(messageObject.k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !anVar.H2.V) {
                    ImageReceiver photoImage = q1Var.getPhotoImage();
                    float u92 = anVar.u9(q1Var, photoImage.L0);
                    float f10 = photoImage.N0;
                    View view = (View) q1Var.getParent();
                    float u93 = anVar.u9(q1Var, -q1Var.getTop());
                    if (u92 <= org.telegram.messenger.g0.L(80.0f)) {
                        continue;
                    } else if ((u92 + f10) - u93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                        anVar.Hb = q1Var;
                        fi.m3 m3Var2 = anVar.H2;
                        m3Var2.q0 = new af(anVar, 23);
                        m3Var2.x(anVar.t9(q1Var, q1Var.getNoSoundIconCenterX()), u92, true);
                        org.telegram.messenger.iz.D(true);
                        return;
                    }
                }
            }
        }
    }
}
