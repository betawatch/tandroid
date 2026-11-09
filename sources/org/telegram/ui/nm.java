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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nm implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ cn a;

    public nm(cn cnVar) {
        this.a = cnVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        cn cnVar = this.a;
        if (cnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        q4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
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
            cnVar.presentFragment(new cn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, cnVar.getParentActivity(), cnVar.getResourceProvider());
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, cnVar.getResourceProvider());
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(cnVar.getParentActivity(), false, false);
        z0Var.j(org.telegram.messenger.id.M0(2131747811, null), R.drawable.msg_channel, null);
        z0Var.setMinimumWidth(org.telegram.messenger.qs.q2);
        z0Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(cnVar.getParentActivity(), false, false);
        z0Var2.j(org.telegram.messenger.id.M0(2131746662, null), R.drawable.msg_addbot, null);
        z0Var2.setMinimumWidth(org.telegram.messenger.qs.q2);
        z0Var2.setOnClickListener(new z(this, (TLRPC.Chat) tLObject, q1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        cn cnVar2 = new cn(bundle);
        cnVar2.ea = true;
        cnVar.presentFragmentAsPreviewWithMenu(cnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        cnVar.s7();
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
        cn cnVar = this.a;
        if (i7 != 16) {
            cnVar.Y7(q1Var, true, false, f10, f11, messageObject.I3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i10 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = cnVar.f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = cnVar.q8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.y1.m(user, J4, i10, cnVar.getParentActivity(), cnVar.getMessagesController().b2(cnVar.f.id), cnVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(cnVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i10 < size) {
            TLRPC.Peer peer = arrayList.get(i10);
            i10++;
            hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, cnVar.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = cnVar.getMessagesController().P6;
        u1Var.setOnCancelListener(new bi.g0(this, cnVar.getConnectionsManager().sendRequest(getgroupcall, new bi.r8(this, u1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
        u1Var.r(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z10 = (z9 || !vf.c.i(str, false, false)) ? z9 : true;
        cn cnVar = this.a;
        vf.b bVar = cnVar.cc;
        if (bVar != null) {
            bVar.a(true);
        }
        cnVar.cc = q1Var.getMessageObject() == null ? null : new jm(this, q1Var);
        if (z10 || vf.c.g(parse, false, null)) {
            vf.c.s(cnVar.getParentActivity(), parse, true, true, false, cnVar.cc, null, false, true, false, false);
        } else {
            org.telegram.ui.Components.v4.o0(cnVar, str, true, true, true, !z10, cnVar.cc, webPage, cnVar.za);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar = this.a;
        if (!cnVar.getMessagesController().S4()) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, cnVar.getParentActivity(), null);
            u1Var.r(200L);
            cnVar.getMessagesController().R0(new y(this, u1Var, q1Var, 6));
        } else {
            if (q1Var.getMessageObject() != null) {
                q1Var.getMessageObject().r2 = Boolean.FALSE;
            }
            q1Var.H3();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar;
        int i7;
        if (q1Var.getMessageObject() == null || (i7 = (cnVar = this.a).Yb) == 0 || i7 != q1Var.getMessageObject().e1() || cnVar.Zb != 1) {
            return null;
        }
        return cnVar.ac;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject;
        if (q1Var == null || (messageObject = q1Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int e12 = messageObject.e1();
        cn cnVar = this.a;
        if (cnVar.Yb == e12 && cnVar.Zb == 7) {
            return;
        }
        TLRPC.InputPeer j12 = cnVar.getMessagesController().j1(org.telegram.messenger.ij.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = j12;
        getrichmessage.id = e12;
        vf.b bVar = cnVar.cc;
        if (bVar != null) {
            bVar.a(true);
            cnVar.cc = null;
        }
        int[] iArr = new int[1];
        ji jiVar = new ji(cnVar, e12, q1Var, 2);
        jiVar.b = new rf(5, cnVar, iArr);
        cnVar.cc = jiVar;
        jiVar.d();
        iArr[0] = cnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new bi.t3(cnVar, jiVar, iArr, q1Var, messageObject, 3));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            cn cnVar = this.a;
            org.telegram.ui.Components.wt.N0(cnVar, ijVar, cnVar.bb, str2, str3, str4, str, i7, i10, -1, cnVar.U9());
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
        sz0 sz0Var;
        if (ijVar.S4() || ijVar.g4()) {
            uz0 uz0Var = this.a.ua;
            if (uz0Var == null || uz0Var.b0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!ijVar.P3()) {
                            org.telegram.ui.Components.hc.a0(this.a).w(R.drawable.tooltip_sound, org.telegram.messenger.id.M0(2131743513, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.ua = new uz0(this.a.getParentActivity());
                uz0 uz0Var2 = this.a.ua;
                ie Kb = !ijVar.P3() ? this.a.Kb(ijVar, true) : null;
                bi.d3 a52 = !ijVar.P3() ? cn.a5(this.a, ijVar) : null;
                Context context = uz0Var2.a;
                bi.x5 x5Var = uz0Var2.c;
                uz0Var2.X = Kb;
                uz0Var2.Y = a52;
                sz0 sz0Var2 = uz0Var2.N;
                if (sz0Var2 != null) {
                    x5Var.removeView(sz0Var2);
                    uz0Var2.N = null;
                }
                uz0Var2.O = q1Var;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                uz0Var2.M = messageObject;
                uz0Var2.S = messageObject != null && messageObject.h4();
                org.telegram.ui.Cells.q1 q1Var2 = uz0Var2.O;
                uz0Var2.L = q1Var2 != null ? q1Var2.getResourcesProvider() : null;
                if (uz0Var2.O != null) {
                    uz0Var2.T = 0.0f;
                    uz0Var2.U = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        uz0Var2.T = view.getY() + uz0Var2.T;
                        uz0Var2.U = view.getY() + uz0Var2.U;
                    }
                    int width = uz0Var2.O.getWidth();
                    int height = uz0Var2.O.getHeight();
                    if (uz0Var2.S) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.q.y));
                    }
                    uz0Var2.K = height - uz0Var2.O.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.p);
                    j3 = 0;
                    int i10 = height;
                    viewGroup = x5Var;
                    sz0 sz0Var3 = new sz0(uz0Var2, uz0Var2.getContext(), org.telegram.messenger.p10.s0, uz0Var2.O.getResourcesProvider(), width, i10);
                    uz0Var2.N = sz0Var3;
                    uz0Var2.O.u0(sz0Var3);
                    uz0Var2.N.s0(uz0Var2.O);
                    uz0Var2.N.setDelegate(new pb.b(19));
                    sz0 sz0Var4 = uz0Var2.N;
                    org.telegram.messenger.ij ijVar2 = uz0Var2.M;
                    org.telegram.messenger.dj currentMessagesGroup = uz0Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = uz0Var2.O;
                    sz0Var4.w3(ijVar2, currentMessagesGroup, q1Var3.F, q1Var3.E, false, false);
                    if (!uz0Var2.S) {
                        org.telegram.ui.Components.c8 c8Var = new org.telegram.ui.Components.c8();
                        uz0Var2.V = c8Var;
                        sz0 sz0Var5 = uz0Var2.N;
                        c8Var.i = sz0Var5;
                        sz0Var5.vc = c8Var;
                        if (sz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.qm0 seekBarWaveform = uz0Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = uz0Var2.s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    uz0Var2.H = false;
                    viewGroup.addView(uz0Var2.N, new FrameLayout.LayoutParams(uz0Var2.O.getWidth(), i10, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    viewGroup = x5Var;
                    i7 = 360;
                }
                TextureView textureView = uz0Var2.P;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    uz0Var2.P = null;
                }
                if (uz0Var2.S) {
                    uz0Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    uz0Var2.P = textureView2;
                    viewGroup.addView(textureView2, 0, c8.ha.c(i7, i7));
                }
                org.telegram.ui.Components.u51 u51Var = MediaController.B().i0;
                if (u51Var != null) {
                    u51Var.g0();
                }
                org.telegram.ui.Components.u51 u51Var2 = uz0Var2.x;
                if (u51Var2 != null) {
                    u51Var2.g0();
                    uz0Var2.x.m0();
                    uz0Var2.x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = uz0Var2.O;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(uz0Var2.O.getMessageObject().I1);
                    File I = org.telegram.messenger.w7.I(uz0Var2.O.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(uz0Var2.O.getMessageObject().I1);
                        I = org.telegram.messenger.w7.M(uz0Var2.O.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && uz0Var2.O.getMessageObject().k.attachPath != null) {
                        I = new File(uz0Var2.O.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.u51 u51Var3 = new org.telegram.ui.Components.u51();
                        uz0Var2.x = u51Var3;
                        u51Var3.J = new tz0(uz0Var2);
                        if (uz0Var2.V != null) {
                            u51Var3.K = new tz0(uz0Var2);
                        }
                        if (uz0Var2.S) {
                            u51Var3.A0(uz0Var2.P);
                        }
                        uz0Var2.x.j0(Uri.fromFile(I), "other");
                        uz0Var2.x.h0();
                        org.telegram.ui.Components.js jsVar = uz0Var2.E;
                        if (jsVar != null) {
                            jsVar.s = uz0Var2.x;
                            jsVar.a();
                        }
                    }
                    cn cnVar = this.a;
                    cnVar.showDialog(cnVar.ua);
                    return false;
                }
                fi.m3 m3Var = uz0Var2.y;
                if (m3Var != null) {
                    viewGroup.removeView(m3Var);
                    uz0Var2.y = null;
                }
                org.telegram.messenger.ij ijVar3 = uz0Var2.M;
                boolean z9 = ijVar3 != null && ijVar3.P3();
                org.telegram.messenger.ij ijVar4 = uz0Var2.M;
                if (ijVar4 != null && org.telegram.messenger.ij.B0(ijVar4.k) != org.telegram.messenger.p10.i(uz0Var2.M.I1).e()) {
                    fi.m3 m3Var2 = new fi.m3(context, 3);
                    uz0Var2.y = m3Var2;
                    m3Var2.r(true);
                    if (z9) {
                        long B0 = org.telegram.messenger.ij.B0(uz0Var2.M.k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User a22 = org.telegram.messenger.qp.s1(uz0Var2.M.I1).a2(Long.valueOf(B0));
                            if (a22 != null) {
                                str = org.telegram.messenger.t10.j(a22, true);
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(uz0Var2.M.I1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        uz0Var2.y.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, uz0Var2.S ? 2131743590 : 2131743514, str)));
                    } else {
                        uz0Var2.y.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(uz0Var2.S ? 2131743591 : 2131743515, null)));
                    }
                    uz0Var2.y.s(12.0f);
                    uz0Var2.y.setPadding(org.telegram.messenger.g0.L((z9 || uz0Var2.O.F) ? 0.0f : 6.0f), 0, 0, 0);
                    if (uz0Var2.S) {
                        uz0Var2.y.p(0.5f, 0.0f);
                        uz0Var2.y.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        uz0Var2.y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        uz0Var2.y.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    uz0Var2.y.v(14.0f);
                    fi.m3 m3Var3 = uz0Var2.y;
                    m3Var3.h = fi.m3.a(m3Var3.getText(), uz0Var2.y.getTextPaint());
                    if (uz0Var2.S) {
                        viewGroup.addView(uz0Var2.y, c8.ha.d((int) ((uz0Var2.O.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((uz0Var2.O.getHeight() + uz0Var2.K) / org.telegram.messenger.g0.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(uz0Var2.y, c8.ha.d((int) ((uz0Var2.O.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, ((((uz0Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + uz0Var2.O.getBoundsLeft()) / org.telegram.messenger.g0.p) + 1.0f, ((-75.0f) - ((uz0Var2.O.getHeight() / org.telegram.messenger.g0.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    uz0Var2.y.w();
                }
                TextView textView = uz0Var2.D;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    uz0Var2.D = null;
                }
                TextView textView2 = new TextView(context);
                uz0Var2.D = textView2;
                textView2.setTextColor(-1);
                uz0Var2.D.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    uz0Var2.D.setBackground(org.telegram.ui.ActionBar.l6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    uz0Var2.D.setBackground(org.telegram.ui.ActionBar.l6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                uz0Var2.D.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.ka.a(uz0Var2.D);
                uz0Var2.D.setText(org.telegram.messenger.id.M0(z9 ? 2131743519 : 2131743516, null));
                uz0Var2.D.setOnClickListener(new qz0(uz0Var2, 1));
                viewGroup.addView(uz0Var2.D, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z9 && (sz0Var = uz0Var2.N) != null && sz0Var.getMessageObject() != null && uz0Var2.N.getMessageObject().k != null) {
                    uz0Var2.N.getMessageObject().k.media_unread = false;
                    uz0Var2.N.invalidate();
                }
                cn cnVar2 = this.a;
                cnVar2.showDialog(cnVar2.ua);
                return false;
            }
        } else {
            if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
                boolean S = MediaController.B().S(ijVar);
                MediaController.B().r0(S ? this.a.h8(ijVar, false) : null, false);
                return S;
            }
            if (ijVar.I3()) {
                MediaController B = MediaController.B();
                ArrayList L = this.a.C0.L();
                cn cnVar3 = this.a;
                return B.o0(L, ijVar, cnVar3.b7, true ^ cnVar3.C0.N, null, cnVar3.v4 ? cnVar3.b() : 0L);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F1() {
        org.telegram.ui.ActionBar.g6 g6Var;
        cn cnVar = this.a;
        if (cnVar.l1 == null || cnVar.getParentActivity() == null) {
            return;
        }
        Context context = cnVar.l1.getContext();
        g6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
        vy0.d1(context, cnVar, false, g6Var, null);
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
        cn cnVar = this.a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    cnVar.Y7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i11 == 4) {
                        cnVar.f2.n(messageObject.Y1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                boolean A = org.telegram.messenger.t3.A(i7, cnVar.e, 24);
                if (A) {
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    org.telegram.messenger.t3.A(i10, cnVar.e, 5);
                }
                aa.d0 d0Var = new aa.d0(this, message, A, messageObject, 28);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                cnVar.v7(d0Var, cg.a.l(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long o4 = org.telegram.messenger.m5.o(message.from_id);
        org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(20, this, message);
        Pattern pattern = org.telegram.ui.Components.v4.a;
        Activity parentActivity = cnVar.getParentActivity();
        int i12 = 0;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(0, parentActivity, null);
        String M0 = org.telegram.messenger.id.M0(2131744387, null);
        org.telegram.ui.ActionBar.u1 u1Var = w1Var.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744386, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).B1(o4, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        org.telegram.ui.ActionBar.s6.U(editText, org.telegram.ui.ActionBar.l6.G6, null);
        editText.setHint(org.telegram.messenger.id.M0(2131744385, null));
        org.telegram.ui.ActionBar.s6.D(editText, org.telegram.ui.ActionBar.l6.H6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.l6.U(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.m4(parentActivity)});
        editText.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        w1Var.o(frameLayout);
        w1Var.k(org.telegram.messenger.id.M0(2131751604, null), new ni.c(26, kVar, editText));
        w1Var.h(org.telegram.messenger.id.M0(2131752589, null), null);
        u1Var.N = new org.telegram.ui.Components.i1(editText, i12);
        frameLayout.addView(editText, c8.ha.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.xf(editText, 3), 100L);
        cnVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.g6(true);
        cn cnVar = this.a;
        cnVar.getMessagesStorage().X1(org.telegram.messenger.ij.B0(messageObject.k), messageObject.k);
        cnVar.getMessagesController().s7.h(messageObject, true, false);
        e(q1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar = this.a;
        cnVar.Sa.k(q1Var, cnVar, true);
        cnVar.z0.I0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ji jiVar;
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
                        TLRPC.TL_message R7 = cn.R7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            R7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            R7.attachPath = message.attachPath;
                        }
                        R7.media = tL_messageExtendedMedia.media;
                        R7.noforwards = true;
                        arrayList.add(new org.telegram.messenger.ij(messageObject.I1, R7, false, true));
                    }
                }
                if (i10 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer p12 = PhotoViewer.p1();
                cn cnVar = this.a;
                p12.H2(null, cnVar, cnVar.za);
                PhotoViewer.p1().Z1(arrayList, i10, this.a.a(), 0L, 0L, this.a.cb);
                return;
            }
            return;
        }
        cn cnVar2 = this.a;
        vf.b bVar = cnVar2.cc;
        if (bVar != null) {
            bVar.a(true);
            cnVar2.cc = null;
        }
        if (q1Var.getMessageObject() == null) {
            cnVar2.cc = null;
            jiVar = null;
        } else {
            jiVar = new ji(cnVar2, q1Var.getMessageObject().e1(), q1Var, 1);
            cnVar2.cc = jiVar;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) this.a).currentAccount;
        bi.ea y10 = bi.ea.y(i7, false);
        Objects.requireNonNull(jiVar);
        dh dhVar = new dh(jiVar, 8);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.g6 I = bi.ea.I();
        if (messageObject != null && context != null) {
            long B0 = org.telegram.messenger.ij.B0(messageObject.k);
            int e12 = messageObject.e1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = org.telegram.messenger.qp.s1(y10.a).j1(B0);
            tL_inputInvoiceMessage.msg_id = e12;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = hi.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            m0Var = new bg.m0(y10, ConnectionsManager.getInstance(y10.a).sendRequest(tL_payments_getPaymentForm, new bi.g2(y10, messageObject, tL_inputInvoiceMessage, dhVar, 2)), 1);
        }
        if (m0Var != null) {
            jiVar.b = m0Var;
            jiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.hc b10;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        cn cnVar = this.a;
        if (!isEmpty) {
            vf.c.t(cnVar.getParentActivity(), "https://" + cnVar.getMessagesController().U2 + "/nft/" + str);
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        ug.f1 f1Var = new ug.f1(cnVar, i7, user, null, null, cnVar.za);
        q1Var.getLocationOnScreen(new int[2]);
        f1Var.n2 = q1Var.getNameStatusX();
        f1Var.o2 = q1Var.getNameStatusY();
        f1Var.r2 = q1Var.getScaleX();
        f1Var.p2 = q1Var.getLeft();
        f1Var.q2 = q1Var.getTop();
        f1Var.s2 = q1Var;
        int e10 = org.telegram.messenger.t10.e(user);
        if (e10 < 7) {
            f1Var.m2 = Integer.valueOf(cnVar.getThemedColor(org.telegram.ui.ActionBar.l6.r8[e10]));
        } else {
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(i10).q4;
            org.telegram.messenger.fp d = gpVar != null ? gpVar.d(e10) : null;
            f1Var.m2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        org.telegram.ui.Components.g5 g5Var = q1Var.pa;
        if (g5Var != null && (g5Var.f[0] instanceof org.telegram.ui.Components.i5)) {
            f1Var.r2 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(cnVar.getParentActivity());
                org.telegram.messenger.rz d2 = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.l6.m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.hc.b(document);
                    if (d2 != null) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    str2 = "160_160_g";
                } else {
                    if (d2 != null && org.telegram.messenger.ij.K2(document, false)) {
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
                if (org.telegram.messenger.ij.C4(document)) {
                    Integer num = f1Var.m2;
                    l9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : cnVar.getThemedColor(org.telegram.ui.ActionBar.l6.v6), PorterDuff.Mode.SRC_IN));
                    f1Var.u2 = org.telegram.messenger.ij.i1(document);
                } else {
                    f1Var.u2 = org.telegram.messenger.ij.i1(document);
                }
                f1Var.t2 = l9Var;
                f1Var.w2 = true;
            }
        }
        cnVar.showDialog(f1Var);
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
        cn cnVar = this.a;
        TLRPC.Chat chat = cnVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
        long j10 = cnVar.e.id;
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
        bs0 bs0Var;
        TLRPC.PollAnswer pollAnswer2;
        bs0 bs0Var2;
        xr0 xr0Var;
        dh.c cVar;
        org.telegram.messenger.ij ijVar;
        TLRPC.ChatFull chatFull;
        boolean z9;
        boolean z10;
        boolean z11;
        bs0 bs0Var3;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.Components.l60 l60Var;
        cn cnVar;
        boolean z12;
        ne neVar;
        int size;
        int i7;
        ViewGroup viewGroup;
        bs0 bs0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull N0;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z14;
        byte[] bArr;
        xr0 xr0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        bs0 bs0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        String str;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        String str2;
        boolean z16;
        sh.o oVar;
        String str3;
        boolean z17;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        cn cnVar2 = this.a;
        if (cnVar2.getParentActivity() != null && cnVar2.getParentActivity() != null) {
            fi.m3 m3Var = cnVar2.L1;
            if (m3Var != null && m3Var.V) {
                m3Var.f(true);
            }
            bl blVar = cnVar2.P1;
            if (blVar != null && blVar.V) {
                blVar.f(true);
            }
            org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
                cnVar2.t5 = primaryMessageObject;
                cnVar2.u5 = null;
                bs0 bs0Var6 = new bs0(cnVar2.getParentActivity(), cnVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                bs0Var6.L = q1Var;
                bs0Var6.P = bArr3;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                bs0Var6.H = messageObject;
                bs0Var6.I = messageObject != null && messageObject.P3();
                org.telegram.ui.Cells.q1 q1Var2 = bs0Var6.L;
                xr0 xr0Var3 = bs0Var6.d;
                if (q1Var2 != null) {
                    bs0Var6.M = cnVar2.N9 - org.telegram.messenger.g0.L(4.0f);
                    bs0Var6.N = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        bs0Var6.M = view.getY() + bs0Var6.M;
                        bs0Var6.N = view.getY() + bs0Var6.N;
                    }
                    int width = bs0Var6.L.getWidth();
                    int height = bs0Var6.L.getHeight();
                    bs0Var6.L.getHeight();
                    zr0 zr0Var = new zr0(bs0Var6, bs0Var6.getContext(), org.telegram.messenger.p10.s0, bs0Var6.L.getResourcesProvider(), bArr3, width, height);
                    bs0Var = bs0Var6;
                    bs0Var.J = zr0Var;
                    bs0Var.L.r0(zr0Var);
                    bs0Var.J.s0(bs0Var.L);
                    bs0Var.J.setDelegate(new w7.s(18, false));
                    zr0 zr0Var2 = bs0Var.J;
                    org.telegram.messenger.ij ijVar3 = bs0Var.H;
                    org.telegram.messenger.dj currentMessagesGroup = bs0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = bs0Var.L;
                    zr0Var2.w3(ijVar3, currentMessagesGroup, q1Var3.F, q1Var3.E, q1Var3.G, false);
                    zr0 zr0Var3 = bs0Var.J;
                    zr0Var3.d6 = bArr3;
                    xr0Var3.addView(zr0Var3, new FrameLayout.LayoutParams(bs0Var.L.getWidth(), height, 51));
                    as0 as0Var = new as0(bs0Var.getContext(), org.telegram.messenger.p10.s0, bs0Var.L.getResourcesProvider(), width, height, 0);
                    bs0Var.K = as0Var;
                    bs0Var.L.u0(as0Var);
                    bs0Var.L.r0(bs0Var.K);
                    bs0Var.K.s0(bs0Var.L);
                    bs0Var.K.setDelegate(new sa.d(18));
                    as0 as0Var2 = bs0Var.K;
                    org.telegram.messenger.ij ijVar4 = bs0Var.H;
                    org.telegram.messenger.dj currentMessagesGroup2 = bs0Var.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = bs0Var.L;
                    as0Var2.w3(ijVar4, currentMessagesGroup2, q1Var4.F, q1Var4.E, q1Var4.G, false);
                    xr0Var3.addView(bs0Var.K, new FrameLayout.LayoutParams(bs0Var.L.getWidth(), height, 51));
                } else {
                    bs0Var = bs0Var6;
                }
                fi.g1 g1Var = bs0Var.f;
                g1Var.bringToFront();
                xr0 xr0Var4 = bs0Var.e;
                xr0Var4.bringToFront();
                bs0Var.n.bringToFront();
                g1Var.w(false);
                Context context = bs0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.g6 g6Var = bs0Var.b;
                org.telegram.ui.Components.l60 G = org.telegram.ui.Components.l60.G(xr0Var3, g6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.ij.m1(bs0Var.H);
                bs0Var.V = org.telegram.messenger.ij.W4(tL_messageMediaPoll4);
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
                dh.c cVar2 = bs0Var.G;
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
                        xr0Var2 = xr0Var3;
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
                            xr0 xr0Var5 = xr0Var3;
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
                                xr0Var3 = xr0Var5;
                                i11 = i12;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                xr0Var3 = xr0Var5;
                                i11 = i12;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        xr0Var2 = xr0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !org.telegram.messenger.ij.A(tL_messageMediaPoll)) {
                        bs0Var5 = bs0Var;
                        arrayList = arrayList3;
                        ijVar = primaryMessageObject;
                        xr0Var = xr0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        sh.o oVar2 = new sh.o(cnVar2.getCurrentAccount(), context, g6Var);
                        org.telegram.ui.Components.l60 J = G.J();
                        J.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        gh.a k10 = c8.g0.k(g6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            oVar = oVar2;
                            str3 = null;
                            z17 = false;
                            fh.g c10 = cVar2.c(view3, null, false);
                            c10.p(k10);
                            view3.setBackground(c10);
                        } else {
                            oVar = oVar2;
                            str3 = null;
                            z17 = false;
                        }
                        J.c(R.drawable.ic_ab_back, org.telegram.messenger.id.M0(2131753756, str3), new iq0(G, 27), z17);
                        J.k();
                        long B0 = org.telegram.messenger.ij.B0(bs0Var.H.k);
                        int e12 = bs0Var.H.e1();
                        int i16 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.fx fxVar = new org.telegram.ui.Components.fx(19, bs0Var, cnVar2);
                        bs0Var5 = bs0Var;
                        ijVar = primaryMessageObject;
                        arrayList = arrayList3;
                        xr0Var = xr0Var2;
                        sh.o oVar3 = oVar;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a10 = oVar3.a(cnVar2, B0, e12, bArr5, i16, fxVar);
                        cnVar2 = cnVar2;
                        bArr2 = bArr5;
                        J.q(a10);
                        oVar3.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
                        oVar3.setText(org.telegram.messenger.id.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        oVar3.a.d(pollAnswerVoters.recent_voters, false);
                        oVar3.setLayoutParams(c8.ha.o(-1, 48));
                        int i17 = org.telegram.ui.ActionBar.l6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.x0(null, i17, false), 12, 0);
                        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i17);
                        oVar3.setBackground(a02);
                        org.telegram.ui.ActionBar.s6.j(oVar3, a02, null, M, null);
                        oVar3.setOnClickListener(new hk0(3, G, J));
                        G.q(oVar3);
                        G.k();
                    }
                    if (!z18) {
                        bs0Var2 = bs0Var5;
                        pollAnswer3 = pollAnswer2;
                        str = null;
                    } else if (z15) {
                        str = null;
                        CharSequence M0 = org.telegram.messenger.id.M0(2131743824, null);
                        bs0Var2 = bs0Var5;
                        cn cnVar3 = cnVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable ur0Var = new ur0(bs0Var2, z14, cnVar3, arrayList, pollAnswer6);
                        cnVar2 = cnVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(R.drawable.msg_unvote, M0, ur0Var, false);
                    } else {
                        bs0Var2 = bs0Var5;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        str = null;
                        if (sh.h.a(bs0Var2.H) == 0) {
                            G.c(R.drawable.msg_select, org.telegram.messenger.id.M0(2131747156, null), new ur0(bs0Var2, z14, pollAnswer3, cnVar2, arrayList6), false);
                        }
                    }
                    if (cnVar2.T6()) {
                        G.c(R.drawable.menu_reply, org.telegram.messenger.id.M0(2131747170, str), new oc0(bs0Var2, cnVar2, pollAnswer3, 23), false);
                    }
                    if (org.telegram.messenger.ij.B0(bs0Var2.H.k) >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        str2 = null;
                        z16 = false;
                    } else {
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(bs0Var2.H.I1);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String r10 = org.telegram.messenger.m5.r(s12.e2(org.telegram.messenger.ij.B0(bs0Var2.H.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(s12.U2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r10)) {
                            r10 = "c/" + (-org.telegram.messenger.ij.B0(bs0Var2.H.k));
                        }
                        sb2.append(r10);
                        sb2.append("/");
                        sb2.append(bs0Var2.H.e1());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        String sb3 = sb2.toString();
                        str2 = null;
                        z16 = false;
                        G.c(R.drawable.msg_link, org.telegram.messenger.id.M0(2131751762, null), new sn0(7, bs0Var2, sb3), false);
                    }
                    G.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751767, str2), new sn0(8, bs0Var2, pollAnswer3), z16);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        long e10 = org.telegram.messenger.p10.i(bs0Var2.H.I1).e();
                        cVar = cVar2;
                        long currentTime = ConnectionsManager.getInstance(bs0Var2.H.I1).getCurrentTime();
                        cn cnVar4 = cnVar2;
                        long M1 = org.telegram.messenger.qp.s1(bs0Var2.H.I1).x7.K.M1(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!org.telegram.messenger.ij.l3(bs0Var2.H.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (o4 == e10 && currentTime < M1))) {
                                G.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751598, null), new sn0(9, bs0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject e22 = org.telegram.messenger.qp.s1(bs0Var2.H.I1).e2(o4);
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131747181, org.telegram.messenger.m5.u(e22), org.telegram.messenger.id.x(pollAnswer3.date, true)));
                        cnVar2 = cnVar4;
                        ga0 ga0Var = new ga0(bs0Var2, o4, cnVar2, 1);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i18 = org.telegram.ui.ActionBar.l6.i6;
                        org.telegram.ui.ActionBar.g6 g6Var2 = G.d;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i18, g6Var2), 0, 12);
                        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i18);
                        frameLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.s6.j(frameLayout, a03, null, M2, g6Var2);
                        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context2);
                        l9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
                        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                        w8Var.l(e22);
                        l9Var.e(e22, w8Var);
                        frameLayout.addView(l9Var, c8.ha.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.j5, g6Var2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(W2);
                        textView.setMaxWidth(org.telegram.messenger.g0.L(150.0f));
                        textView.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.lk(15, G, ga0Var));
                        G.r(frameLayout, c8.ha.o(-1, -2));
                    } else {
                        cVar = cVar2;
                    }
                } else {
                    bs0Var2 = bs0Var;
                    xr0Var = xr0Var3;
                    cVar = cVar2;
                    ijVar = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                G.Q(cVar, c8.g0.k(g6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                bs0Var2.R = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                bs0Var2.R.setPivotY(0.0f);
                xr0Var4.addView(bs0Var2.R, c8.ha.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                cnVar2.F8(ijVar, arrayList7, arrayList8, arrayList9);
                ne neVar2 = new ne(cnVar2, 9);
                org.telegram.messenger.ij ijVar5 = bs0Var2.H;
                ArrayList arrayList10 = cnVar2.getMediaDataController().n;
                boolean z20 = (cnVar2.z() || cnVar2.c() || cnVar2.f != null || !ijVar5.w2() || (org.telegram.messenger.t3.T(cnVar2.e) && !cnVar2.e.megagroup) || org.telegram.messenger.t3.p0(cnVar2.e) || arrayList10.isEmpty() || !ijVar5.k.reactions.can_see_list || ijVar5.l4()) ? false : true;
                boolean z21 = !ijVar5.k3() ? ijVar5.l4() || cnVar2.f4 == 5 || cnVar2.z() || cnVar2.c() || !ijVar5.d4() || ((((chatFull = cnVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.t3.T(cnVar2.e)) && cnVar2.f == null && !org.telegram.messenger.t3.p0(cnVar2.e))) || arrayList10.isEmpty()) : (N0 = cnVar2.getMessagesController().N0(-ijVar5.Z0())) != null && (cnVar2.z() || cnVar2.f4 == 5 || cnVar2.c() || !ijVar5.d4() || (((N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !N0.paid_reactions_available) || arrayList10.isEmpty()));
                if (!z20 && !cnVar2.c() && cnVar2.e != null && ijVar5.P3() && ijVar5.q4() && !ijVar5.Y2() && !ijVar5.o4() && !ijVar5.n4() && !ijVar5.k.media_unread && !ijVar5.F4() && ConnectionsManager.getInstance(cnVar2.getCurrentAccount()).getCurrentTime() - ijVar5.k.date < cnVar2.getMessagesController().q3 && ((org.telegram.messenger.t3.n0(cnVar2.e) || !org.telegram.messenger.t3.T(cnVar2.e)) && (chatFull2 = cnVar2.p8) != null && chatFull2.participants_count <= cnVar2.getMessagesController().p3 && !(ijVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                    if (cnVar2.f4 != 3 && ijVar5.z() && !org.telegram.messenger.t3.p0(cnVar2.e)) {
                        z9 = true;
                        if (cnVar2.e != null && !ijVar5.N3() && org.telegram.messenger.t3.p0(cnVar2.e) && org.telegram.messenger.t3.A(cnVar2.getCurrentAccount(), cnVar2.e, 24)) {
                            int i19 = ((-cnVar2.e.linked_monoforum_id) > ijVar5.Z0() ? 1 : ((-cnVar2.e.linked_monoforum_id) == ijVar5.Z0() ? 0 : -1));
                        }
                        if (!z20 && cnVar2.e == null && cnVar2.h == null && (user = cnVar2.f) != null && !org.telegram.messenger.t10.B(user) && !org.telegram.messenger.t10.z(cnVar2.f) && !org.telegram.messenger.t10.s(cnVar2.f)) {
                            user2 = cnVar2.f;
                            if (!user2.bot && !org.telegram.messenger.t10.A(user2.id) && (((userFull = cnVar2.q8) == null || !userFull.read_dates_private) && !cnVar2.c() && ijVar5.P3() && ijVar5.q4() && !ijVar5.Y2() && !ijVar5.o4() && !ijVar5.n4() && !ijVar5.k.media_unread && !ijVar5.F4() && cnVar2.getConnectionsManager().getCurrentTime() - ijVar5.k.date < cnVar2.getMessagesController().r3 && !(ijVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z10 = true;
                                TLRPC.User user3 = cnVar2.f;
                                boolean z22 = ((user3 == null && (org.telegram.messenger.t10.z(user3) || org.telegram.messenger.t10.s(cnVar2.f))) || cnVar2.c() || !ijVar5.X2() || (ijVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                z11 = z9;
                                org.telegram.ui.Components.l60 G2 = org.telegram.ui.Components.l60.G(xr0Var, cnVar2.getResourceProvider(), null, !z20 || z9);
                                if (z11) {
                                    bs0Var3 = bs0Var2;
                                    ijVar2 = ijVar5;
                                    l60Var = G2;
                                    cnVar = cnVar2;
                                    z12 = z21;
                                    neVar = neVar2;
                                    if (z10) {
                                        l60Var.r(new org.telegram.ui.Components.oa0(bs0Var3.getContext(), 0, ijVar2, new sr0(bs0Var3, 1), bs0Var3.b), c8.ha.o(-1, 36));
                                        l60Var.k();
                                    } else if (z22) {
                                        l60Var.r(new org.telegram.ui.Components.oa0(bs0Var3.getContext(), 1, ijVar2, new sr0(bs0Var3, 2), bs0Var3.b), c8.ha.o(-1, 36));
                                        l60Var.k();
                                    }
                                } else {
                                    lf0 lf0Var = new lf0(bs0Var2.getContext(), cnVar2.getCurrentAccount(), ijVar5, cnVar2.e);
                                    FrameLayout frameLayout2 = new FrameLayout(bs0Var2.getContext());
                                    frameLayout2.addView(lf0Var, c8.ha.c(36.0f, -1));
                                    org.telegram.ui.Components.l60 J2 = G2.J();
                                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, bs0Var2.getContext(), bs0Var2.b, true, false);
                                    z0Var.setItemHeight(44);
                                    bs0 bs0Var7 = bs0Var2;
                                    z0Var.j(org.telegram.messenger.id.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                                    ijVar2 = ijVar5;
                                    z0Var.getTextView().setPadding(org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                                    FrameLayout frameLayout3 = new FrameLayout(bs0Var7.getContext());
                                    LinearLayout linearLayout = new LinearLayout(bs0Var7.getContext());
                                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, linearLayout, g6Var);
                                    linearLayout.setOrientation(1);
                                    cn cnVar5 = cnVar2;
                                    org.telegram.ui.Components.qj0 a11 = lf0Var.a();
                                    frameLayout3.addView(z0Var);
                                    linearLayout.addView(frameLayout3);
                                    z12 = z21;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(bs0Var7.getContext(), g6Var), c8.ha.o(-1, 8));
                                    frameLayout3.setOnClickListener(new vr0(G2, 0));
                                    neVar = neVar2;
                                    wr0 wr0Var = new wr0(bs0Var7, lf0Var, cnVar5, a11, linearLayout, G2, J2);
                                    cnVar = cnVar5;
                                    bs0Var3 = bs0Var7;
                                    l60Var = G2;
                                    lf0Var.setOnClickListener(wr0Var);
                                    linearLayout.addView(a11, c8.ha.o(-1, -2));
                                    J2.q(linearLayout);
                                    l60Var.q(frameLayout2);
                                    l60Var.k();
                                }
                                size = arrayList7.size();
                                for (i7 = 0; i7 < size; i7++) {
                                    l60Var.c(((Integer) arrayList7.get(i7)).intValue(), (CharSequence) arrayList8.get(i7), new f10(bs0Var3, neVar, ((Integer) arrayList9.get(i7)).intValue(), 7), false);
                                }
                                l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                                l60Var.Q(cVar, c8.g0.k(g6Var), false);
                                l60Var.Y();
                                ViewGroup viewGroup3 = l60Var.A;
                                bs0Var3.T = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                bs0Var3.T.setPivotY(0.0f);
                                xr0Var4.addView(bs0Var3.T, c8.ha.e(-2, -2, 51));
                                viewGroup = bs0Var3.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    int i20 = 5;
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ni0(bs0Var3, i20));
                                    bs0Var3.T.setOnTouchListener(new d0(bs0Var3, i20));
                                }
                                if (z12) {
                                    bs0Var4 = bs0Var3;
                                    z13 = true;
                                } else {
                                    bs0 bs0Var8 = bs0Var3;
                                    cn cnVar6 = cnVar;
                                    org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0((cnVar.getUserConfig().e() > cnVar.a() ? 1 : (cnVar.getUserConfig().e() == cnVar.a() ? 0 : -1)) == 0 ? 3 : 0, cnVar.getCurrentAccount(), bs0Var3.getContext(), cnVar6, bs0Var3.b);
                                    ji0Var.a = true;
                                    float f10 = 22;
                                    ji0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.id.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.id.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                                    bs0Var4 = bs0Var8;
                                    org.telegram.messenger.ij ijVar6 = ijVar2;
                                    ji0Var.setDelegate(new ui.e(bs0Var4, cnVar6, ijVar6, ji0Var, 9));
                                    bs0Var4.Q = ji0Var;
                                    xr0Var4.addView(ji0Var, c8.ha.e(-2, (int) ((ji0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                                    z13 = true;
                                    ji0Var.p(ijVar6, cnVar6.p8, true);
                                    bs0Var4.Q.setTransitionProgress(1.0f);
                                }
                                bs0Var4.e();
                                bs0Var4.e0 = new vl(this, 0);
                                bs0Var4.show();
                                return z13;
                            }
                        }
                        z10 = false;
                        TLRPC.User user32 = cnVar2.f;
                        if (user32 == null) {
                        }
                        z11 = z9;
                        org.telegram.ui.Components.l60 G22 = org.telegram.ui.Components.l60.G(xr0Var, cnVar2.getResourceProvider(), null, !z20 || z9);
                        if (z11) {
                        }
                        size = arrayList7.size();
                        while (i7 < size) {
                        }
                        l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        l60Var.Q(cVar, c8.g0.k(g6Var), false);
                        l60Var.Y();
                        ViewGroup viewGroup32 = l60Var.A;
                        bs0Var3.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        bs0Var3.T.setPivotY(0.0f);
                        xr0Var4.addView(bs0Var3.T, c8.ha.e(-2, -2, 51));
                        viewGroup = bs0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        bs0Var4.e();
                        bs0Var4.e0 = new vl(this, 0);
                        bs0Var4.show();
                        return z13;
                    }
                }
                z9 = false;
                if (cnVar2.e != null) {
                    int i192 = ((-cnVar2.e.linked_monoforum_id) > ijVar5.Z0() ? 1 : ((-cnVar2.e.linked_monoforum_id) == ijVar5.Z0() ? 0 : -1));
                }
                if (!z20) {
                    user2 = cnVar2.f;
                    if (!user2.bot) {
                        z10 = true;
                        TLRPC.User user322 = cnVar2.f;
                        if (user322 == null) {
                        }
                        z11 = z9;
                        org.telegram.ui.Components.l60 G222 = org.telegram.ui.Components.l60.G(xr0Var, cnVar2.getResourceProvider(), null, !z20 || z9);
                        if (z11) {
                        }
                        size = arrayList7.size();
                        while (i7 < size) {
                        }
                        l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        l60Var.Q(cVar, c8.g0.k(g6Var), false);
                        l60Var.Y();
                        ViewGroup viewGroup322 = l60Var.A;
                        bs0Var3.T = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        bs0Var3.T.setPivotY(0.0f);
                        xr0Var4.addView(bs0Var3.T, c8.ha.e(-2, -2, 51));
                        viewGroup = bs0Var3.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z12) {
                        }
                        bs0Var4.e();
                        bs0Var4.e0 = new vl(this, 0);
                        bs0Var4.show();
                        return z13;
                    }
                }
                z10 = false;
                TLRPC.User user3222 = cnVar2.f;
                if (user3222 == null) {
                }
                z11 = z9;
                org.telegram.ui.Components.l60 G2222 = org.telegram.ui.Components.l60.G(xr0Var, cnVar2.getResourceProvider(), null, !z20 || z9);
                if (z11) {
                }
                size = arrayList7.size();
                while (i7 < size) {
                }
                l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                l60Var.Q(cVar, c8.g0.k(g6Var), false);
                l60Var.Y();
                ViewGroup viewGroup3222 = l60Var.A;
                bs0Var3.T = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                bs0Var3.T.setPivotY(0.0f);
                xr0Var4.addView(bs0Var3.T, c8.ha.e(-2, -2, 51));
                viewGroup = bs0Var3.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                bs0Var4.e();
                bs0Var4.e0 = new vl(this, 0);
                bs0Var4.show();
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
        cn cnVar = this.a;
        if (cnVar.getParentLayout() == null || !a0(q1Var)) {
            return;
        }
        boolean J3 = org.telegram.messenger.ij.J3(document);
        q1Var.setScrimBlockBounds(rectF);
        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(cnVar, q1Var);
        H.c(R.drawable.msg_download, org.telegram.messenger.id.M0(J3 ? 2131745911 : 2131745931, null), new o1(this, q1Var, document, 26), false);
        H.p = new zl(q1Var, rectF, 0);
        H.Z();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        bi.d3 d3Var;
        org.telegram.messenger.dj djVar;
        int i10;
        cn cnVar = this.a;
        wh.i iVar = cnVar.sa;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        wh.h hVar = (wh.h) hashMap.get(wh.i.b(q1Var));
        org.telegram.ui.Components.cc ccVar = null;
        org.telegram.messenger.ij ijVar = hVar != null ? hVar.E : null;
        wh.h hVar2 = (wh.h) cnVar.sa.a.get(wh.i.b(q1Var));
        long j3 = (hVar2 == null || (i10 = hVar2.R) == -1) ? 0L : hVar2.x[i10].d;
        if (ijVar != null && j3 != 0) {
            Activity parentActivity = cnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            if (!org.telegram.ui.Components.v4.h(parentActivity, i7, j3, false)) {
                ArrayList arrayList = (ijVar.c1() == 0 || (djVar = (org.telegram.messenger.dj) cnVar.N6.f(ijVar.c1())) == null) ? null : djVar.d;
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
                ccVar = org.telegram.ui.Components.hc.v(cnVar.getParentActivity(), cnVar, null, 1, j10, 1, cnVar.getThemedColor(org.telegram.ui.ActionBar.l6.tj), cnVar.getThemedColor(org.telegram.ui.ActionBar.l6.vj), 5000, false, d3Var);
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
            viewTreeObserver.addOnPreDrawListener(new mw(2, hVar3, viewTreeObserver));
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
        if (messageObject == null || ((messageObject.o4() && !messageObject.Y2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            o10Var.run();
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = this.a;
            f2Var.getSendMessagesHelper().v(messageObject, messageObject.k.rich_message, null, f2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        cn cnVar = this.a;
        cnVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, cnVar);
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
        this.a.k8(characterStyle, z9, q1Var.getMessageObject(), q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final hr0 N1() {
        return this.a.Ra;
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
                    cn cnVar = this.a;
                    boolean z10 = !cnVar.Oc && messageObject.e1() == cnVar.Nc;
                    if (!z9) {
                        return z10;
                    }
                    if (z10 && System.currentTimeMillis() - cnVar.Pc > 1000) {
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
        if (org.telegram.messenger.ij.L4(ijVar.k)) {
            this.a.Kb(ijVar, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P0(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar = this.a;
        cnVar.getNotificationCenter().k(org.telegram.messenger.qs.n3, Long.valueOf(cnVar.j6), q1Var);
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
        boolean l32 = org.telegram.messenger.ij.l3(q1Var.getMessageObject().k);
        cn cnVar = this.a;
        if (l32) {
            TLRPC.Message message = q1Var.getMessageObject().k;
            long o4 = org.telegram.messenger.m5.o(message != null ? message.from_id : null);
            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar);
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            a02.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744087, org.telegram.messenger.m5.l(i10, o4)))).k(true);
            return false;
        }
        if (!q1Var.getMessageObject().q()) {
            TLRPC.Message message2 = q1Var.getMessageObject().k;
            long o10 = org.telegram.messenger.m5.o(message2 != null ? message2.from_id : null);
            org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(cnVar);
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            a03.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744088, org.telegram.messenger.m5.l(i7, o10)))).k(true);
            return false;
        }
        if (!cnVar.getUserConfig().q()) {
            org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131744064, null), new vl(this, 9))).k(true);
            return false;
        }
        final long M = org.telegram.messenger.t3.M(cnVar.e, cnVar.p8, true);
        final org.telegram.messenger.gz sendMessagesHelper = cnVar.getSendMessagesHelper();
        final org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.ij.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.H.put(Integer.valueOf(hash), Boolean.valueOf(z9));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
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
                    final int e12 = ijVar.e1();
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
                            int i12 = e12;
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
                                } catch (Exception e13) {
                                    e = e13;
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
                                            ij.Z5(yrVar.currentAccount, j13, (TLRPC.TL_messageMediaToDo) messageMedia2, i13, z11, i14);
                                            sQLitePreparedStatement = yrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e14) {
                                            e = e14;
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
                                            ij.q5(TLdeserialize);
                                            TLdeserialize.serializeToStream(nativeByteBuffer);
                                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                            sQLitePreparedStatement.bindInteger(2, i12);
                                            sQLitePreparedStatement.bindLong(3, j11);
                                            sQLitePreparedStatement.step();
                                            sQLitePreparedStatement.dispose();
                                            nativeByteBuffer.reuse();
                                        } catch (Exception e15) {
                                            e = e15;
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
                            } catch (Exception e16) {
                                e = e16;
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
                                } catch (Exception e17) {
                                    e = e17;
                                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                                } catch (Throwable th6) {
                                    th = th6;
                                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                                }
                            } catch (Exception e18) {
                                e = e18;
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
                                } catch (Exception e19) {
                                    e = e19;
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
                                    ij.Z5(yrVar.currentAccount, j13, (TLRPC.TL_messageMediaToDo) messageMedia, i13, z11, i14);
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
                                                } catch (Exception e20) {
                                                    e = e20;
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
                                            } catch (Exception e21) {
                                                e = e21;
                                                sQLitePreparedStatement2 = executeFast;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                sQLitePreparedStatement2 = executeFast;
                                            }
                                        } catch (Exception e22) {
                                            e = e22;
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
        String N0 = org.telegram.messenger.id.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(N0)) {
            N0 = org.telegram.messenger.id.M0(2131746594, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        org.telegram.messenger.ij.d(spannableStringBuilder, false);
        org.telegram.messenger.dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        cn cnVar = this.a;
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
                        int childCount = cnVar.z0.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = cnVar.z0.getChildAt(i10);
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
        cnVar.pc(messageObject, spannableStringBuilder, 1);
        q1Var.G3(1, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q1(long j3) {
        TLRPC.ChatFull N0;
        cn cnVar = this.a;
        TLRPC.Chat chat = cnVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
        long j10 = cnVar.e.id;
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
        cn cnVar = this.a;
        return cnVar.m6[1].size() + cnVar.m6[0].size() > 0;
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
        cn cnVar = this.a;
        if (!d && !z9) {
            kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if ((kVar.w() || cnVar.X9()) && !cnVar.s9.z(q1Var.getMessageObject())) {
                cn.k2(cnVar, q1Var, !q1Var.B2(f10), f10, f11);
                return;
            }
            return;
        }
        if (org.telegram.messenger.t10.z(cnVar.f)) {
            r(q1Var);
            return;
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        if (messageObject.f4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.k5.o(null, 2131744606, org.telegram.ui.Components.hc.a0(cnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = org.telegram.messenger.m5.o(message3.reply_to.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 3;
            di.s7.b(storyItem, cnVar.f);
            cnVar.getOrCreateStoryViewer().L(cnVar.getParentActivity(), storyItem, di.i7.a(cnVar.z0));
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
            long j10 = cnVar.j6;
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
                        M0 = j3 >= 0 ? cnVar.getMessagesController().M0(Long.valueOf(-j3)) : null;
                        if (j3 != Long.MAX_VALUE) {
                            boolean z11 = z10;
                            if (j3 == cnVar.j6 || M0 == null || org.telegram.messenger.t3.t0(M0) || (!M0.left && !M0.kicked)) {
                                if (((j3 == cnVar.j6 && (!org.telegram.messenger.t3.c0(cnVar.e) || !z11)) || j3 == Long.MAX_VALUE) && (cnVar.f4 != 3 || ((ijVar = messageObject.C) != null && ijVar.P1() == cnVar.b()))) {
                                    int i10 = cnVar.f4;
                                    if (i10 == 2 || i10 == 1) {
                                        cnVar.l9.T0(i7);
                                        cnVar.finishFragment();
                                        return;
                                    }
                                    if (bArr != 0) {
                                        cnVar.h8 = bArr;
                                    } else if (num != null) {
                                        cnVar.g8 = num;
                                    } else {
                                        TLRPC.Message message5 = messageObject.k;
                                        if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                            cnVar.d8 = true;
                                            cnVar.f8 = messageReplyHeader5.quote_text;
                                            cnVar.i8 = r9;
                                            cnVar.c8 = true;
                                        }
                                    }
                                    bi.ub ubVar = new bi.ub(this, i7, messageObject, num, bArr, 12);
                                    if (!cnVar.C0.N) {
                                        ubVar.run();
                                        return;
                                    }
                                    cnVar.F3 = false;
                                    cnVar.Qb(false, true, false);
                                    cnVar.md(cnVar.getMediaDataController().c0(), cnVar.getMediaDataController().e1, cnVar.getMediaDataController().j0());
                                    org.telegram.messenger.g0.i3(ubVar, 80L);
                                    return;
                                }
                                Integer num2 = num;
                                byte[] bArr3 = bArr;
                                if (LaunchActivity.G1 != null) {
                                    vf.b bVar = cnVar.cc;
                                    if (bVar != null) {
                                        bVar.a(false);
                                        cnVar.cc = null;
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    final j0 j0Var = new j0(this, messageObject, q1Var);
                                    cnVar.cc = j0Var;
                                    int e12 = messageObject.e1();
                                    ArrayList arrayList = launchActivity.d0;
                                    if (j3 < 0 && (M02 = org.telegram.messenger.qp.s1(launchActivity.O).M0(Long.valueOf(-j3))) != null && org.telegram.messenger.t3.c0(M02)) {
                                        j0Var.d();
                                        final int i11 = 0;
                                        launchActivity.l0(j3, Integer.valueOf(i7), str3, num2, bArr3, new Runnable() { // from class: org.telegram.ui.e70
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
                                        }, e12, r9);
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
                                            launchActivity.l0(j3, Integer.valueOf(i7), str5, num2, bArr3, new Runnable() { // from class: org.telegram.ui.e70
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
                                            }, e12, i12);
                                            return;
                                        }
                                        bundle.putLong("chat_id", j11);
                                    }
                                    bundle.putInt("message_id", i7);
                                    org.telegram.ui.ActionBar.f2 f2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList) : null;
                                    if (f2Var == null || org.telegram.messenger.qp.s1(launchActivity.O).E(bundle, f2Var, null, null)) {
                                        org.telegram.messenger.g0.h3(new d70(launchActivity, bundle, bArr3, i7, num2, str5, i12, j3, j0Var, f2Var));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        message2 = messageObject.k;
                        if (message2 != null || (messageReplyHeader4 = message2.reply_to) == null || TextUtils.isEmpty(messageReplyHeader4.quote_text) || !messageObject.a1 || messageObject.b1 || messageObject.P5()) {
                            TLRPC.Message message6 = messageObject.k;
                            org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.error, 36, org.telegram.messenger.id.M0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746432 : 2131746433 : 2131746431 : (M0 == null && M0.megagroup) ? 2131746256 : !org.telegram.messenger.t3.T(M0) ? 2131746257 : 2131746258, null)).k(true);
                        } else {
                            messageObject.b1 = true;
                            cnVar.Xc(messageObject, true);
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
                org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.error, 36, org.telegram.messenger.id.M0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746432 : 2131746433 : 2131746431 : (M0 == null && M0.megagroup) ? 2131746256 : !org.telegram.messenger.t3.T(M0) ? 2131746257 : 2131746258, null)).k(true);
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
            org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.error, 36, org.telegram.messenger.id.M0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746432 : 2131746433 : 2131746431 : (M0 == null && M0.megagroup) ? 2131746256 : !org.telegram.messenger.t3.T(M0) ? 2131746257 : 2131746258, null)).k(true);
        }
        num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        str = null;
        str2 = str;
        bArr = str;
        long j102 = cnVar.j6;
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
        org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.error, 36, org.telegram.messenger.id.M0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746432 : 2131746433 : 2131746431 : (M0 == null && M0.megagroup) ? 2131746256 : !org.telegram.messenger.t3.T(M0) ? 2131746257 : 2131746258, null)).k(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        org.telegram.messenger.ij messageObject;
        TLRPC.Message message;
        if (q1Var == null) {
            return false;
        }
        cn cnVar = this.a;
        if (cnVar.getParentActivity() == null) {
            return false;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        if (!org.telegram.messenger.qp.s1(i7).s4() || (messageObject = q1Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.J2 || message.translatedRichMessage == null) {
            return messageObject.u(cnVar.e);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x081e A[LOOP:2: B:230:0x081c->B:231:0x081e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x048d  */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        e81 e81Var;
        TLRPC.TodoItem todoItem2;
        final int i7;
        TLRPC.TodoCompletion todoCompletion;
        e81 e81Var2;
        org.telegram.messenger.ij ijVar;
        String str;
        boolean z9;
        final ?? r10;
        e81 e81Var3;
        int i10;
        org.telegram.messenger.ij ijVar2;
        boolean z10;
        TLRPC.ChatFull chatFull;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        ArrayList arrayList2;
        cn cnVar;
        org.telegram.ui.Components.l60 l60Var;
        org.telegram.messenger.ij ijVar3;
        boolean z14;
        dh.c cVar;
        h81 h81Var;
        ne neVar;
        int size;
        int i11;
        ViewGroup viewGroup;
        h81 h81Var2;
        boolean z15;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull N0;
        String str2;
        boolean z16;
        final int i12;
        String str3;
        Calendar calendar;
        int i13;
        int i14;
        int i15;
        final cn cnVar2 = this.a;
        if (cnVar2.getParentActivity() != null && cnVar2.getParentActivity() != null) {
            fi.m3 m3Var = cnVar2.L1;
            if (m3Var != null && m3Var.V) {
                m3Var.f(true);
            }
            bl blVar = cnVar2.P1;
            if (blVar != null && blVar.V) {
                blVar.f(true);
            }
            org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m12 instanceof TLRPC.TL_messageMediaToDo)) {
                cnVar2.t5 = primaryMessageObject;
                cnVar2.u5 = null;
                final h81 h81Var3 = new h81(cnVar2.getParentActivity(), cnVar2.getResourceProvider());
                final int i16 = todoItem.id;
                h81Var3.K = q1Var;
                h81Var3.O = i16;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                h81Var3.G = messageObject;
                h81Var3.H = messageObject != null && messageObject.P3();
                org.telegram.ui.Cells.q1 q1Var2 = h81Var3.K;
                e81 e81Var4 = h81Var3.c;
                if (q1Var2 != null) {
                    h81Var3.L = cnVar2.N9 - org.telegram.messenger.g0.L(4.0f);
                    h81Var3.M = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        h81Var3.L = view.getY() + h81Var3.L;
                        h81Var3.M = view.getY() + h81Var3.M;
                    }
                    int width = h81Var3.K.getWidth();
                    int height = h81Var3.K.getHeight();
                    h81Var3.K.getHeight();
                    e81Var = e81Var4;
                    f81 f81Var = new f81(h81Var3, h81Var3.getContext(), org.telegram.messenger.p10.s0, h81Var3.K.getResourcesProvider(), i16, width, height);
                    h81Var3.I = f81Var;
                    h81Var3.K.r0(f81Var);
                    h81Var3.I.s0(h81Var3.K);
                    h81Var3.I.setDelegate(new g81(h81Var3));
                    f81 f81Var2 = h81Var3.I;
                    org.telegram.messenger.ij ijVar4 = h81Var3.G;
                    org.telegram.messenger.dj currentMessagesGroup = h81Var3.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = h81Var3.K;
                    f81Var2.w3(ijVar4, currentMessagesGroup, q1Var3.F, q1Var3.E, q1Var3.G, false);
                    e81Var.addView(h81Var3.I, new FrameLayout.LayoutParams(h81Var3.K.getWidth(), height, 51));
                    as0 as0Var = new as0(h81Var3.getContext(), org.telegram.messenger.p10.s0, h81Var3.K.getResourcesProvider(), width, height, 1);
                    h81Var3.J = as0Var;
                    h81Var3.K.u0(as0Var);
                    h81Var3.K.r0(h81Var3.J);
                    h81Var3.J.s0(h81Var3.K);
                    h81Var3.J.setDelegate(new w7.s(19, false));
                    as0 as0Var2 = h81Var3.J;
                    org.telegram.messenger.ij ijVar5 = h81Var3.G;
                    org.telegram.messenger.dj currentMessagesGroup2 = h81Var3.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = h81Var3.K;
                    as0Var2.w3(ijVar5, currentMessagesGroup2, q1Var4.F, q1Var4.E, q1Var4.G, false);
                    e81Var.addView(h81Var3.J, new FrameLayout.LayoutParams(h81Var3.K.getWidth(), height, 51));
                } else {
                    e81Var = e81Var4;
                }
                fi.g1 g1Var = h81Var3.e;
                g1Var.bringToFront();
                e81 e81Var5 = h81Var3.d;
                e81Var5.bringToFront();
                h81Var3.h.bringToFront();
                g1Var.w(false);
                org.telegram.ui.ActionBar.g6 g6Var = h81Var3.a;
                org.telegram.ui.Components.l60 F = org.telegram.ui.Components.l60.F(e81Var, g6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) org.telegram.messenger.ij.m1(h81Var3.G);
                int i17 = 0;
                while (true) {
                    if (i17 >= tL_messageMediaToDo.todo.list.size()) {
                        todoItem2 = null;
                        i7 = -1;
                        break;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i17).id == i16) {
                        todoItem2 = tL_messageMediaToDo.todo.list.get(i17);
                        i7 = i17;
                        break;
                    }
                    i17++;
                }
                int i18 = 0;
                while (true) {
                    if (i18 >= tL_messageMediaToDo.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo.completions.get(i18).id == i16) {
                        todoCompletion = tL_messageMediaToDo.completions.get(i18);
                        break;
                    }
                    i18++;
                }
                if (!h81Var3.G.q()) {
                    e81Var2 = e81Var;
                    ijVar = primaryMessageObject;
                    str = null;
                    z9 = false;
                } else if (todoCompletion != null) {
                    long j3 = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        e81Var2 = e81Var;
                    } catch (Exception e10) {
                        e = e10;
                        e81Var2 = e81Var;
                    }
                    try {
                        i13 = calendar.get(6);
                        i14 = calendar.get(1);
                        calendar.setTimeInMillis(j3);
                        i15 = calendar.get(6);
                        ijVar = primaryMessageObject;
                    } catch (Exception e11) {
                        e = e11;
                        ijVar = primaryMessageObject;
                        i12 = 1;
                        org.telegram.messenger.a8.g(e, true);
                        str3 = "LOC_ERR";
                        F.p(14, -1, str3);
                        F.k();
                        str = null;
                        z9 = false;
                        F.c(R.drawable.msg_cancel, org.telegram.messenger.id.M0(2131744052, null), new Runnable() { // from class: org.telegram.ui.b81
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i19 = i12;
                                int i20 = i16;
                                cn cnVar3 = cnVar2;
                                h81 h81Var4 = h81Var3;
                                switch (i19) {
                                    case 0:
                                        rr0 rr0Var = new rr0(cnVar3);
                                        rr0Var.u0(org.telegram.messenger.ij.m1(h81Var4.G), false, i20);
                                        rr0Var.e0 = new nk0(19, h81Var4, cnVar3);
                                        cnVar3.presentFragment(rr0Var);
                                        h81Var4.c(false);
                                        break;
                                    case 1:
                                        if (cnVar3.c()) {
                                            Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                        } else {
                                            f81 f81Var3 = h81Var4.I;
                                            f81Var3.M3(f81Var3.b2(i20), false);
                                        }
                                        h81Var4.c(true);
                                        break;
                                    default:
                                        if (cnVar3.c()) {
                                            Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                        } else {
                                            f81 f81Var4 = h81Var4.I;
                                            f81Var4.M3(f81Var4.b2(i20), false);
                                        }
                                        h81Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i19 = 5;
                        if (todoItem2 != null) {
                        }
                        if (h81Var3.G.u(cnVar2.e)) {
                        }
                        e81Var3 = e81Var2;
                        i10 = 51;
                        F.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        gh.e k10 = c8.g0.k(g6Var);
                        dh.c cVar2 = h81Var3.F;
                        F.Q(cVar2, k10, r10);
                        F.Y();
                        ViewGroup viewGroup2 = F.A;
                        h81Var3.Q = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        h81Var3.Q.setPivotY(0.0f);
                        e81Var5.addView(h81Var3.Q, c8.ha.e(-2, -2, i10));
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        cnVar2.F8(ijVar, arrayList3, arrayList4, arrayList5);
                        ne neVar2 = new ne(cnVar2, 10);
                        ijVar2 = h81Var3.G;
                        ArrayList arrayList6 = cnVar2.getMediaDataController().n;
                        if (cnVar2.z()) {
                        }
                        if (ijVar2.k3()) {
                        }
                        if (!z10) {
                        }
                        if (cnVar2.e == null) {
                        }
                        z12 = z11;
                        if (!z10) {
                        }
                        z13 = false;
                        TLRPC.User user3 = cnVar2.f;
                        if (user3 == null) {
                        }
                        org.telegram.ui.Components.l60 G = org.telegram.ui.Components.l60.G(e81Var3, cnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        size = arrayList3.size();
                        while (i11 < size) {
                        }
                        l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        l60Var.Q(cVar, c8.g0.k(g6Var), false);
                        l60Var.Y();
                        ViewGroup viewGroup3 = l60Var.A;
                        h81Var.S = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        h81Var.S.setPivotY(0.0f);
                        e81Var5.addView(h81Var.S, c8.ha.e(-2, -2, 51));
                        viewGroup = h81Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        h81Var2.e();
                        h81Var2.c0 = new vl(this, 5);
                        h81Var2.show();
                        return z15;
                    }
                    try {
                        int i20 = calendar.get(1);
                        str3 = (i15 == i13 && i14 == i20) ? org.telegram.messenger.id.a0(null, null, 2131744081, org.telegram.messenger.id.E0().p0().format(new Date(j3))) : (i15 + 1 == i13 && i14 == i20) ? org.telegram.messenger.id.a0(null, null, 2131744080, org.telegram.messenger.id.E0().p0().format(new Date(j3))) : Math.abs(System.currentTimeMillis() - j3) < 31536000000L ? org.telegram.messenger.id.a0(null, null, 2131744082, org.telegram.messenger.id.E0().q0().format(new Date(j3)), org.telegram.messenger.id.E0().p0().format(new Date(j3))) : org.telegram.messenger.id.a0(null, null, 2131744082, org.telegram.messenger.id.E0().C0().format(new Date(j3)), org.telegram.messenger.id.E0().p0().format(new Date(j3)));
                        i12 = 1;
                    } catch (Exception e12) {
                        e = e12;
                        i12 = 1;
                        org.telegram.messenger.a8.g(e, true);
                        str3 = "LOC_ERR";
                        F.p(14, -1, str3);
                        F.k();
                        str = null;
                        z9 = false;
                        F.c(R.drawable.msg_cancel, org.telegram.messenger.id.M0(2131744052, null), new Runnable() { // from class: org.telegram.ui.b81
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i192 = i12;
                                int i202 = i16;
                                cn cnVar3 = cnVar2;
                                h81 h81Var4 = h81Var3;
                                switch (i192) {
                                    case 0:
                                        rr0 rr0Var = new rr0(cnVar3);
                                        rr0Var.u0(org.telegram.messenger.ij.m1(h81Var4.G), false, i202);
                                        rr0Var.e0 = new nk0(19, h81Var4, cnVar3);
                                        cnVar3.presentFragment(rr0Var);
                                        h81Var4.c(false);
                                        break;
                                    case 1:
                                        if (cnVar3.c()) {
                                            Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                        } else {
                                            f81 f81Var3 = h81Var4.I;
                                            f81Var3.M3(f81Var3.b2(i202), false);
                                        }
                                        h81Var4.c(true);
                                        break;
                                    default:
                                        if (cnVar3.c()) {
                                            Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                        } else {
                                            f81 f81Var4 = h81Var4.I;
                                            f81Var4.M3(f81Var4.b2(i202), false);
                                        }
                                        h81Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i192 = 5;
                        if (todoItem2 != null) {
                        }
                        if (h81Var3.G.u(cnVar2.e)) {
                        }
                        e81Var3 = e81Var2;
                        i10 = 51;
                        F.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        gh.e k102 = c8.g0.k(g6Var);
                        dh.c cVar22 = h81Var3.F;
                        F.Q(cVar22, k102, r10);
                        F.Y();
                        ViewGroup viewGroup22 = F.A;
                        h81Var3.Q = viewGroup22;
                        viewGroup22.setPivotX(0.0f);
                        h81Var3.Q.setPivotY(0.0f);
                        e81Var5.addView(h81Var3.Q, c8.ha.e(-2, -2, i10));
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        cnVar2.F8(ijVar, arrayList32, arrayList42, arrayList52);
                        ne neVar22 = new ne(cnVar2, 10);
                        ijVar2 = h81Var3.G;
                        ArrayList arrayList62 = cnVar2.getMediaDataController().n;
                        if (cnVar2.z()) {
                        }
                        if (ijVar2.k3()) {
                        }
                        if (!z10) {
                        }
                        if (cnVar2.e == null) {
                        }
                        z12 = z11;
                        if (!z10) {
                        }
                        z13 = false;
                        TLRPC.User user32 = cnVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.l60 G2 = org.telegram.ui.Components.l60.G(e81Var3, cnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        size = arrayList32.size();
                        while (i11 < size) {
                        }
                        l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        l60Var.Q(cVar, c8.g0.k(g6Var), false);
                        l60Var.Y();
                        ViewGroup viewGroup32 = l60Var.A;
                        h81Var.S = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        h81Var.S.setPivotY(0.0f);
                        e81Var5.addView(h81Var.S, c8.ha.e(-2, -2, 51));
                        viewGroup = h81Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        h81Var2.e();
                        h81Var2.c0 = new vl(this, 5);
                        h81Var2.show();
                        return z15;
                    }
                    F.p(14, -1, str3);
                    F.k();
                    str = null;
                    z9 = false;
                    F.c(R.drawable.msg_cancel, org.telegram.messenger.id.M0(2131744052, null), new Runnable() { // from class: org.telegram.ui.b81
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i1922 = i12;
                            int i202 = i16;
                            cn cnVar3 = cnVar2;
                            h81 h81Var4 = h81Var3;
                            switch (i1922) {
                                case 0:
                                    rr0 rr0Var = new rr0(cnVar3);
                                    rr0Var.u0(org.telegram.messenger.ij.m1(h81Var4.G), false, i202);
                                    rr0Var.e0 = new nk0(19, h81Var4, cnVar3);
                                    cnVar3.presentFragment(rr0Var);
                                    h81Var4.c(false);
                                    break;
                                case 1:
                                    if (cnVar3.c()) {
                                        Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                    } else {
                                        f81 f81Var3 = h81Var4.I;
                                        f81Var3.M3(f81Var3.b2(i202), false);
                                    }
                                    h81Var4.c(true);
                                    break;
                                default:
                                    if (cnVar3.c()) {
                                        Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                    } else {
                                        f81 f81Var4 = h81Var4.I;
                                        f81Var4.M3(f81Var4.b2(i202), false);
                                    }
                                    h81Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    e81Var2 = e81Var;
                    ijVar = primaryMessageObject;
                    str = null;
                    z9 = false;
                    final int i21 = 2;
                    F.c(R.drawable.msg_select, org.telegram.messenger.id.M0(2131744089, null), new Runnable() { // from class: org.telegram.ui.b81
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i1922 = i21;
                            int i202 = i16;
                            cn cnVar3 = cnVar2;
                            h81 h81Var4 = h81Var3;
                            switch (i1922) {
                                case 0:
                                    rr0 rr0Var = new rr0(cnVar3);
                                    rr0Var.u0(org.telegram.messenger.ij.m1(h81Var4.G), false, i202);
                                    rr0Var.e0 = new nk0(19, h81Var4, cnVar3);
                                    cnVar3.presentFragment(rr0Var);
                                    h81Var4.c(false);
                                    break;
                                case 1:
                                    if (cnVar3.c()) {
                                        Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                    } else {
                                        f81 f81Var3 = h81Var4.I;
                                        f81Var3.M3(f81Var3.b2(i202), false);
                                    }
                                    h81Var4.c(true);
                                    break;
                                default:
                                    if (cnVar3.c()) {
                                        Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                    } else {
                                        f81 f81Var4 = h81Var4.I;
                                        f81Var4.M3(f81Var4.b2(i202), false);
                                    }
                                    h81Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                int i1922 = 5;
                if (todoItem2 != null) {
                    F.c(R.drawable.menu_reply, org.telegram.messenger.id.M0(2131744073, str), new v21(h81Var3, cnVar2, todoItem2, i1922), z9);
                    if (org.telegram.messenger.ij.B0(h81Var3.G.k) < 0) {
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(h81Var3.G.I1);
                        String r11 = org.telegram.messenger.m5.r(s12.e2(org.telegram.messenger.ij.B0(h81Var3.G.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(s12.U2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r11)) {
                            r11 = "c/" + (-org.telegram.messenger.ij.B0(h81Var3.G.k));
                        }
                        sb2.append(r11);
                        sb2.append("/");
                        sb2.append(h81Var3.G.e1());
                        sb2.append("?task=");
                        sb2.append(todoItem2.id);
                        String sb3 = sb2.toString();
                        str2 = null;
                        z16 = false;
                        F.c(R.drawable.msg_link, org.telegram.messenger.id.M0(2131751762, null), new ax0(18, h81Var3, sb3), false);
                    } else {
                        str2 = null;
                        z16 = false;
                    }
                    F.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751767, str2), new ax0(19, h81Var3, todoItem2), z16);
                    r10 = z16;
                } else {
                    r10 = z9;
                }
                if (h81Var3.G.u(cnVar2.e)) {
                    F.c(R.drawable.msg_edit, org.telegram.messenger.id.M0(2131744076, null), new Runnable() { // from class: org.telegram.ui.b81
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i19222 = r10;
                            int i202 = i7;
                            cn cnVar3 = cnVar2;
                            h81 h81Var4 = h81Var3;
                            switch (i19222) {
                                case 0:
                                    rr0 rr0Var = new rr0(cnVar3);
                                    rr0Var.u0(org.telegram.messenger.ij.m1(h81Var4.G), false, i202);
                                    rr0Var.e0 = new nk0(19, h81Var4, cnVar3);
                                    cnVar3.presentFragment(rr0Var);
                                    h81Var4.c(false);
                                    break;
                                case 1:
                                    if (cnVar3.c()) {
                                        Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                    } else {
                                        f81 f81Var3 = h81Var4.I;
                                        f81Var3.M3(f81Var3.b2(i202), false);
                                    }
                                    h81Var4.c(true);
                                    break;
                                default:
                                    if (cnVar3.c()) {
                                        Toast.makeText(h81Var4.getContext(), org.telegram.messenger.id.M0(2131748493, null), 1).show();
                                    } else {
                                        f81 f81Var4 = h81Var4.I;
                                        f81Var4.M3(f81Var4.b2(i202), false);
                                    }
                                    h81Var4.c(true);
                                    break;
                            }
                        }
                    }, r10);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        e81Var3 = e81Var2;
                        i10 = 51;
                        F.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131744077, null), new org.telegram.ui.Components.qp0(h81Var3, tL_messageMediaToDo, i16, cnVar2, 16), r10);
                        F.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        gh.e k1022 = c8.g0.k(g6Var);
                        dh.c cVar222 = h81Var3.F;
                        F.Q(cVar222, k1022, r10);
                        F.Y();
                        ViewGroup viewGroup222 = F.A;
                        h81Var3.Q = viewGroup222;
                        viewGroup222.setPivotX(0.0f);
                        h81Var3.Q.setPivotY(0.0f);
                        e81Var5.addView(h81Var3.Q, c8.ha.e(-2, -2, i10));
                        ArrayList arrayList322 = new ArrayList();
                        ArrayList arrayList422 = new ArrayList();
                        ArrayList arrayList522 = new ArrayList();
                        cnVar2.F8(ijVar, arrayList322, arrayList422, arrayList522);
                        ne neVar222 = new ne(cnVar2, 10);
                        ijVar2 = h81Var3.G;
                        ArrayList arrayList622 = cnVar2.getMediaDataController().n;
                        z10 = cnVar2.z() && !cnVar2.c() && cnVar2.f == null && ijVar2.w2() && !((org.telegram.messenger.t3.T(cnVar2.e) && !cnVar2.e.megagroup) || org.telegram.messenger.t3.p0(cnVar2.e) || arrayList622.isEmpty() || !ijVar2.k.reactions.can_see_list || ijVar2.l4());
                        boolean z17 = ijVar2.k3() ? !(ijVar2.l4() || cnVar2.f4 == 5 || cnVar2.z() || cnVar2.c() || !ijVar2.d4() || ((((chatFull = cnVar2.p8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.t3.T(cnVar2.e)) && cnVar2.f == null && !org.telegram.messenger.t3.p0(cnVar2.e))) || arrayList622.isEmpty())) : !((N0 = cnVar2.getMessagesController().N0(-ijVar2.Z0())) != null && (cnVar2.z() || cnVar2.f4 == 5 || cnVar2.c() || !ijVar2.d4() || (((N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !N0.paid_reactions_available) || arrayList622.isEmpty())));
                        z11 = (!z10 || cnVar2.c() || cnVar2.e == null || !ijVar2.P3() || !ijVar2.q4() || ijVar2.Y2() || ijVar2.o4() || ijVar2.n4() || ijVar2.k.media_unread || ijVar2.F4() || ConnectionsManager.getInstance(cnVar2.getCurrentAccount()).getCurrentTime() - ijVar2.k.date >= cnVar2.getMessagesController().q3 || (!org.telegram.messenger.t3.n0(cnVar2.e) && org.telegram.messenger.t3.T(cnVar2.e)) || (chatFull2 = cnVar2.p8) == null || chatFull2.participants_count > cnVar2.getMessagesController().p3 || (ijVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || cnVar2.f4 == 3 || !ijVar2.z() || org.telegram.messenger.t3.p0(cnVar2.e)) ? false : true;
                        if (cnVar2.e == null && !ijVar2.N3() && org.telegram.messenger.t3.p0(cnVar2.e)) {
                            z12 = z11;
                            if (org.telegram.messenger.t3.A(cnVar2.getCurrentAccount(), cnVar2.e, 24)) {
                                int i22 = ((-cnVar2.e.linked_monoforum_id) > ijVar2.Z0() ? 1 : ((-cnVar2.e.linked_monoforum_id) == ijVar2.Z0() ? 0 : -1));
                            }
                        } else {
                            z12 = z11;
                        }
                        if (!z10 && cnVar2.e == null && cnVar2.h == null && (user = cnVar2.f) != null && !org.telegram.messenger.t10.B(user) && !org.telegram.messenger.t10.z(cnVar2.f) && !org.telegram.messenger.t10.s(cnVar2.f)) {
                            user2 = cnVar2.f;
                            if (!user2.bot && !org.telegram.messenger.t10.A(user2.id) && (((userFull = cnVar2.q8) == null || !userFull.read_dates_private) && !cnVar2.c() && ijVar2.P3() && ijVar2.q4() && !ijVar2.Y2() && !ijVar2.o4() && !ijVar2.n4() && !ijVar2.k.media_unread && !ijVar2.F4() && cnVar2.getConnectionsManager().getCurrentTime() - ijVar2.k.date < cnVar2.getMessagesController().r3 && !(ijVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z13 = true;
                                TLRPC.User user322 = cnVar2.f;
                                boolean z18 = ((user322 == null && (org.telegram.messenger.t10.z(user322) || org.telegram.messenger.t10.s(cnVar2.f))) || cnVar2.c() || !ijVar2.X2() || (ijVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.l60 G22 = org.telegram.ui.Components.l60.G(e81Var3, cnVar2.getResourceProvider(), null, !z10 || z12);
                                if (z12) {
                                    arrayList = arrayList422;
                                    arrayList2 = arrayList522;
                                    cnVar = cnVar2;
                                    l60Var = G22;
                                    ijVar3 = ijVar2;
                                    z14 = z17;
                                    cVar = cVar222;
                                    h81Var = h81Var3;
                                    neVar = neVar222;
                                    if (z13) {
                                        l60Var.r(new org.telegram.ui.Components.oa0(h81Var.getContext(), 0, ijVar3, new a81(h81Var, 0), h81Var.a), c8.ha.o(-1, 36));
                                        l60Var.k();
                                    } else if (z18) {
                                        l60Var.r(new org.telegram.ui.Components.oa0(h81Var.getContext(), 1, ijVar3, new a81(h81Var, 2), h81Var.a), c8.ha.o(-1, 36));
                                        l60Var.k();
                                    }
                                } else {
                                    lf0 lf0Var = new lf0(h81Var3.getContext(), cnVar2.getCurrentAccount(), ijVar2, cnVar2.e);
                                    FrameLayout frameLayout = new FrameLayout(h81Var3.getContext());
                                    frameLayout.addView(lf0Var, c8.ha.c(36.0f, -1));
                                    ijVar3 = ijVar2;
                                    org.telegram.ui.Components.l60 J = G22.J();
                                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, h81Var3.getContext(), h81Var3.a, true, false);
                                    z0Var.setItemHeight(44);
                                    z0Var.j(org.telegram.messenger.id.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                                    z0Var.getTextView().setPadding(org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                                    FrameLayout frameLayout2 = new FrameLayout(h81Var3.getContext());
                                    LinearLayout linearLayout = new LinearLayout(h81Var3.getContext());
                                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, linearLayout, g6Var);
                                    linearLayout.setOrientation(1);
                                    cnVar = cnVar2;
                                    org.telegram.ui.Components.qj0 a10 = lf0Var.a();
                                    frameLayout2.addView(z0Var);
                                    linearLayout.addView(frameLayout2);
                                    z14 = z17;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(h81Var3.getContext(), g6Var), c8.ha.o(-1, 8));
                                    frameLayout2.setOnClickListener(new vr0(G22, 1));
                                    arrayList2 = arrayList522;
                                    arrayList = arrayList422;
                                    cVar = cVar222;
                                    d81 d81Var = new d81(h81Var3, lf0Var, cnVar, a10, linearLayout, G22, J);
                                    l60Var = G22;
                                    h81Var = h81Var3;
                                    lf0Var.setOnClickListener(d81Var);
                                    linearLayout.addView(a10, c8.ha.o(-1, -2));
                                    J.q(linearLayout);
                                    l60Var.q(frameLayout);
                                    l60Var.k();
                                    neVar = neVar222;
                                }
                                size = arrayList322.size();
                                for (i11 = 0; i11 < size; i11++) {
                                    l60Var.c(((Integer) arrayList322.get(i11)).intValue(), (CharSequence) arrayList.get(i11), new f10(h81Var, neVar, ((Integer) arrayList2.get(i11)).intValue(), 12), false);
                                }
                                l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                                l60Var.Q(cVar, c8.g0.k(g6Var), false);
                                l60Var.Y();
                                ViewGroup viewGroup322 = l60Var.A;
                                h81Var.S = viewGroup322;
                                viewGroup322.setPivotX(0.0f);
                                h81Var.S.setPivotY(0.0f);
                                e81Var5.addView(h81Var.S, c8.ha.e(-2, -2, 51));
                                viewGroup = h81Var.S;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ni0(h81Var, 20));
                                    h81Var.S.setOnTouchListener(new d0(h81Var, 7));
                                }
                                if (z14) {
                                    h81Var2 = h81Var;
                                    z15 = true;
                                } else {
                                    cn cnVar3 = cnVar;
                                    org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0((cnVar.getUserConfig().e() > cnVar.a() ? 1 : (cnVar.getUserConfig().e() == cnVar.a() ? 0 : -1)) == 0 ? 3 : 0, cnVar3.getCurrentAccount(), h81Var.getContext(), cnVar3, h81Var.a);
                                    ji0Var.a = true;
                                    float f10 = 22;
                                    ji0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.id.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.id.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                                    h81Var2 = h81Var;
                                    org.telegram.messenger.ij ijVar6 = ijVar3;
                                    ji0Var.setDelegate(new ui.e(h81Var2, cnVar3, ijVar6, ji0Var, 11));
                                    h81Var2.P = ji0Var;
                                    e81Var5.addView(ji0Var, c8.ha.e(-2, (int) ((ji0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                                    z15 = true;
                                    ji0Var.p(ijVar6, cnVar3.p8, true);
                                    h81Var2.P.setTransitionProgress(1.0f);
                                }
                                h81Var2.e();
                                h81Var2.c0 = new vl(this, 5);
                                h81Var2.show();
                                return z15;
                            }
                        }
                        z13 = false;
                        TLRPC.User user3222 = cnVar2.f;
                        if (user3222 == null) {
                        }
                        org.telegram.ui.Components.l60 G222 = org.telegram.ui.Components.l60.G(e81Var3, cnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        size = arrayList322.size();
                        while (i11 < size) {
                        }
                        l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        l60Var.Q(cVar, c8.g0.k(g6Var), false);
                        l60Var.Y();
                        ViewGroup viewGroup3222 = l60Var.A;
                        h81Var.S = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        h81Var.S.setPivotY(0.0f);
                        e81Var5.addView(h81Var.S, c8.ha.e(-2, -2, 51));
                        viewGroup = h81Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        h81Var2.e();
                        h81Var2.c0 = new vl(this, 5);
                        h81Var2.show();
                        return z15;
                    }
                }
                e81Var3 = e81Var2;
                i10 = 51;
                F.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                gh.e k10222 = c8.g0.k(g6Var);
                dh.c cVar2222 = h81Var3.F;
                F.Q(cVar2222, k10222, r10);
                F.Y();
                ViewGroup viewGroup2222 = F.A;
                h81Var3.Q = viewGroup2222;
                viewGroup2222.setPivotX(0.0f);
                h81Var3.Q.setPivotY(0.0f);
                e81Var5.addView(h81Var3.Q, c8.ha.e(-2, -2, i10));
                ArrayList arrayList3222 = new ArrayList();
                ArrayList arrayList4222 = new ArrayList();
                ArrayList arrayList5222 = new ArrayList();
                cnVar2.F8(ijVar, arrayList3222, arrayList4222, arrayList5222);
                ne neVar2222 = new ne(cnVar2, 10);
                ijVar2 = h81Var3.G;
                ArrayList arrayList6222 = cnVar2.getMediaDataController().n;
                if (cnVar2.z()) {
                }
                if (ijVar2.k3()) {
                }
                if (!z10) {
                }
                if (cnVar2.e == null) {
                }
                z12 = z11;
                if (!z10) {
                    user2 = cnVar2.f;
                    if (!user2.bot) {
                        z13 = true;
                        TLRPC.User user32222 = cnVar2.f;
                        if (user32222 == null) {
                        }
                        org.telegram.ui.Components.l60 G2222 = org.telegram.ui.Components.l60.G(e81Var3, cnVar2.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                        }
                        size = arrayList3222.size();
                        while (i11 < size) {
                        }
                        l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                        l60Var.Q(cVar, c8.g0.k(g6Var), false);
                        l60Var.Y();
                        ViewGroup viewGroup32222 = l60Var.A;
                        h81Var.S = viewGroup32222;
                        viewGroup32222.setPivotX(0.0f);
                        h81Var.S.setPivotY(0.0f);
                        e81Var5.addView(h81Var.S, c8.ha.e(-2, -2, 51));
                        viewGroup = h81Var.S;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z14) {
                        }
                        h81Var2.e();
                        h81Var2.c0 = new vl(this, 5);
                        h81Var2.show();
                        return z15;
                    }
                }
                z13 = false;
                TLRPC.User user322222 = cnVar2.f;
                if (user322222 == null) {
                }
                org.telegram.ui.Components.l60 G22222 = org.telegram.ui.Components.l60.G(e81Var3, cnVar2.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                size = arrayList3222.size();
                while (i11 < size) {
                }
                l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var)));
                l60Var.Q(cVar, c8.g0.k(g6Var), false);
                l60Var.Y();
                ViewGroup viewGroup322222 = l60Var.A;
                h81Var.S = viewGroup322222;
                viewGroup322222.setPivotX(0.0f);
                h81Var.S.setPivotY(0.0f);
                e81Var5.addView(h81Var.S, c8.ha.e(-2, -2, 51));
                viewGroup = h81Var.S;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z14) {
                }
                h81Var2.e();
                h81Var2.c0 = new vl(this, 5);
                h81Var2.show();
                return z15;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean T() {
        cn cnVar = this.a;
        return org.telegram.messenger.t10.z(cnVar.f) || org.telegram.messenger.t10.B(cnVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.ij messageObject;
        if (chat == null) {
            return;
        }
        cn cnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar.w() || cnVar.X9()) {
            cn.k2(cnVar, q1Var, true, f10, f11);
            return;
        }
        if (z9 || !chat.signature_profiles || (messageObject = q1Var.getMessageObject()) == null || org.telegram.messenger.ij.B0(messageObject.k) == 1271266957) {
            i(q1Var, chat, i7, z9);
        } else {
            cnVar.Pa(org.telegram.messenger.m5.o(messageObject.k.from_id));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.nm] */
    @Override // org.telegram.ui.Cells.l1
    public final void U1(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        cn cnVar = this.a;
        if (!org.telegram.messenger.g0.E1(cnVar.getParentActivity()) || (chat = cnVar.e) == null || currentUser == null || org.telegram.messenger.t3.V(chat)) {
            return;
        }
        org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
        long j3 = cnVar.e.id;
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
        ll llVar;
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        cn cnVar = this.a;
        return (B0 == 1271266957 || ((llVar = cnVar.C0) != null && llVar.N)) && cnVar.f4 != 7;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        if (f2Var.getMessagesController().E(j10, f2Var, q1Var.getMessageObject(), null)) {
            f2Var.presentFragment(new cn(j10));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final int X() {
        return this.a.f4;
    }

    @Override // org.telegram.ui.Cells.l1
    public final jh.a Z() {
        return this.a.sc;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Z0() {
        cn cnVar = this.a;
        cnVar.g8();
        UndoView undoView = cnVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, cnVar.j6, null);
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        cn cnVar = this.a;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            CharSequence fieldText = sjVar.getFieldText();
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
                cnVar.Z.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.i3(new vl(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var == null ? null : q1Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        cn cnVar = this.a;
        return (cnVar.f4 == 1 || cnVar.V9() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        cn cnVar = this.a;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            CharSequence fieldText = sjVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(rf.b.r(org.telegram.messenger.t10.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.f41("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            cnVar.Z.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.i3(new vl(this, 7), 200L);
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
        wj wjVar;
        vj vjVar;
        final int i11 = 0;
        if (!f()) {
            return false;
        }
        cn cnVar = this.a;
        final int i12 = 1;
        ?? r22 = (cnVar.e == null || ((wjVar = cnVar.c1) != null && wjVar.getVisibility() == 0) || ((vjVar = cnVar.S) != null && vjVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = cnVar.e;
        ?? r42 = (chat == null || !(cnVar.r4 == 0 || cnVar.v4) || (org.telegram.messenger.t3.T(chat) && !cnVar.e.megagroup)) ? 0 : 1;
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
        TLRPC.UserFull b22 = cnVar.getMessagesController().b2(user.id);
        if (b22 != null) {
            b10 = w4.c(user, b22, c5VarArr);
            if (!ab.q.i(b10)) {
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        }
        if (ab.q.i(b10)) {
            ab.q.o().C((ViewGroup) cnVar.fragmentView, cnVar.za, b10, new a7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(cnVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.id.M0(2131747786, null), new Runnable(this) { // from class: org.telegram.ui.wl
            public final /* synthetic */ nm b;

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
                        this.b.a.Oa(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, org.telegram.messenger.id.M0(2131745601, null), new o1(this, q1Var, user, 24), false);
        H.l(R.drawable.msg_mention, org.telegram.messenger.id.M0(2131748609, null), new Runnable(this) { // from class: org.telegram.ui.wl
            public final /* synthetic */ nm b;

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
                        this.b.a.Oa(user);
                        break;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, org.telegram.messenger.id.M0(2131753758, null), new Runnable(this) { // from class: org.telegram.ui.wl
            public final /* synthetic */ nm b;

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
                        this.b.a.Oa(user);
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
        cn cnVar = this.a;
        if (cnVar.W9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (cnVar.getParentActivity() != null) {
            if (cnVar.c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                sj sjVar = cnVar.Z;
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
                ii iiVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                vf.b bVar = cnVar.cc;
                if (bVar != null) {
                    bVar.a(true);
                    cnVar.cc = null;
                }
                if (str == null || q1Var.getMessageObject() == null) {
                    cnVar.cc = null;
                } else {
                    ii iiVar2 = new ii(cnVar, q1Var.getMessageObject().e1(), str, q1Var, 1);
                    cnVar.cc = iiVar2;
                    iiVar = iiVar2;
                }
                sjVar.Z(keyboardButtonProto, messageObject, messageObject2, iiVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.ij messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            cn cnVar = this.a;
            if (cnVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.w2 != null && (richMessage = message.rich_message) != null) {
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
                    p12.H2(null, cnVar, null);
                    return p12.c2(null, null, null, null, null, null, null, indexOf, new tl(cnVar, arrayList), null, 0L, 0L, 0L, true, new sl(richMessage, arrayList, messageObject), null);
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
        org.telegram.ui.ActionBar.g6 g6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        cn cnVar = this.a;
        cnVar.getUserConfig().f();
        if (!org.telegram.messenger.g0.E1(cnVar.getParentActivity()) || (chat = cnVar.e) == null || currentUser == null || org.telegram.messenger.t3.V(chat)) {
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
                z9 = channelParticipant.promoted_by == cnVar.getUserConfig().e();
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
                    z10 = channelParticipant2.promoted_by == cnVar.getUserConfig().e();
                } else {
                    z10 = false;
                    z12 = false;
                }
                str2 = channelParticipant2.rank;
                z11 = z10;
                boolean z14 = z12;
                boolean z15 = z13;
                Activity parentActivity = cnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                long j3 = -cnVar.e.id;
                g6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                org.telegram.ui.Components.fy0.b(parentActivity, i7, j3, currentUser, str2, z14, z15, z11, g6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (org.telegram.messenger.t3.T(cnVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    cnVar.getMessagesController();
                    tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(cnVar.e);
                    tL_channels_getParticipant.participant = cnVar.getMessagesController().j1(currentUser.id);
                    cnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.p5(11, this, q1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z9 = false;
                z13 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z9 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == cnVar.getUserConfig().e();
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
        Activity parentActivity2 = cnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        long j32 = -cnVar.e.id;
        g6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
        org.telegram.ui.Components.fy0.b(parentActivity2, i7, j32, currentUser, str2, z142, z152, z11, g6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void c2(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Yc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z9;
        cn cnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar2.w() || cnVar.X9()) {
            return false;
        }
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
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
        cn cnVar = this.a;
        try {
            if (i7 == 0) {
                cnVar.w7();
                ok okVar = cnVar.N3;
                if (okVar == null) {
                    return;
                }
                okVar.l(0L, 84, null, new vl(this, i14));
                cnVar.N3.performHapticFeedback(3, 2);
                return;
            }
            if (i7 == 1) {
                String x10 = org.telegram.messenger.id.x(cnVar.getMessagesController().u4, true);
                if (cnVar.getMessagesController().u4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(org.telegram.ui.Components.t11.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(org.telegram.ui.Components.t11.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.hc.a0(cnVar).G(R.raw.transcribe, 6, X2).k(true);
                cnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.id.x(cnVar.getMessagesController().u4, true);
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(cnVar.getMessagesController().s4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i7 == 2 ? org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131743968, null), new vl(this, i13)) : cnVar.getMessagesController().u4 <= 0 ? "" : org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131743967, x11), new vl(this, i12)));
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
        fj fjVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.K1 = true;
        cn cnVar = this.a;
        cj cjVar = cnVar.z0;
        if (cjVar != null && (fjVar = cnVar.B0) != null && fjVar.y < 0) {
            for (int childCount = cjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = cnVar.z0.getChildAt(childCount);
                cnVar.z0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = cnVar.g9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = cnVar.g9(childAt);
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
                fj fjVar2 = cnVar.B0;
                cnVar.z0.getClass();
                fjVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) cnVar.N9), false);
            } else {
                cnVar.B0.h1(i7, i10);
            }
        }
        cnVar.b1 = z10;
        cnVar.Yc(primaryMessageObject, false);
        cnVar.b1 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e0() {
        return this.a.f4 == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e2() {
        this.a.N9();
    }

    public final boolean f() {
        cn cnVar = this.a;
        if (org.telegram.messenger.t10.B(cnVar.f)) {
            return true;
        }
        TLRPC.Chat chat = cnVar.e;
        if (chat != null) {
            return !org.telegram.messenger.t3.T(chat) || cnVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        this.a.m8(q1Var, reactionCount, z9, f10, f11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        this.a.Y7(q1Var, true, false, f10, f11, false, false, false);
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
        cn cnVar = this.a;
        if (i7 == 19) {
            vf.b bVar = cnVar.cc;
            if (bVar != null) {
                bVar.a(true);
            }
            final gm gmVar = q1Var.getMessageObject() != null ? new gm(this, q1Var, 2) : null;
            cnVar.cc = gmVar;
            final Activity parentActivity = cnVar.getParentActivity();
            final org.telegram.ui.ActionBar.g6 resourceProvider = cnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            gmVar.d();
            gmVar.b = new wg.c(atomicBoolean, 0);
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
            wg.r.d(messageObject, new org.telegram.messenger.c20(atomicBoolean, gmVar, z9, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: wg.d
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ vf.b b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ g6 g;

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
                    g6 g6Var = this.g;
                    if (z10) {
                        h.d(z11, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, g6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        h.e(z11, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, g6Var);
                    }
                }
            }, new wg.e(atomicBoolean, gmVar, 0));
            return;
        }
        if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z10 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.r();
            vf.c.t(cnVar.getParentActivity(), org.telegram.messenger.r2.g);
            return;
        }
        if (i7 == 84) {
            cnVar.Va(q1Var);
            return;
        }
        if (i7 == 80) {
            org.telegram.ui.Cells.o8 o8Var = org.telegram.ui.Components.re0.I1;
            if (cnVar.getParentActivity() == null) {
                return;
            }
            cnVar.showDialog(new org.telegram.ui.Components.re0(cnVar.getContext(), cnVar.getCurrentAccount(), messageObject, cnVar.getResourceProvider()));
            return;
        }
        if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(messageObject) == null) {
                cnVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i14 = 5;
        if (i7 == 5) {
            long j10 = messageObject.k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
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
                cnVar.presentFragment(new ProfileActivity(bundle, null));
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
                cnVar.showDialog(new org.telegram.ui.Components.bd0(cnVar, null, user2, null, file, pf.b.d(str, false), str3, str4, cnVar.za));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 30) {
            cnVar.presentFragment(new cn(a8.p0.j(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i7 == 31) {
            long j11 = messageObject.k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                user = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.X1)) {
                    b10 = messageObject.X1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str5 = org.telegram.messenger.ij.n1(messageObject.k).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? pf.b.c().b(str5) : org.telegram.messenger.id.M0(2131747832, null);
                } else {
                    b10 = org.telegram.messenger.k5.i(new StringBuilder("+"), user.phone, pf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                cnVar.presentFragment(new pr(bundle2));
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
            vf.b bVar2 = cnVar.cc;
            if (bVar2 != null) {
                bVar2.a(true);
            }
            int i15 = 3;
            cnVar.cc = q1Var.getMessageObject() != null ? new gm(this, q1Var, i15) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                if (org.telegram.messenger.ui.b0(i10).p0(group) == null) {
                    cnVar.cc.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    cnVar.cc.b = new bg.m0(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new fi.d3(i15, this, z11)), 28);
                    return;
                }
            }
            vf.c.s(cnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, cnVar.cc, null, false, true, false, false);
            return;
        }
        if (messageObject.r4()) {
            cnVar.la(messageObject, false, false);
            if (messageObject.R0 != null) {
                vf.b bVar3 = cnVar.cc;
                if (bVar3 != null) {
                    bVar3.a(true);
                }
                cnVar.cc = q1Var.getMessageObject() != null ? new gm(this, q1Var, 4) : null;
                vf.c.s(cnVar.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, cnVar.cc, null, false, cnVar.getMessagesController().d6, false, false);
                return;
            }
            return;
        }
        TLRPC.WebPage W1 = messageObject.W1();
        if (W1 == null && (message = messageObject.k) != null && (messageMedia2 = message.media) != null) {
            W1 = messageMedia2.webpage;
        }
        if (W1 == null) {
            return;
        }
        if (W1.attributes != null) {
            for (int i16 = 0; i16 < W1.attributes.size(); i16++) {
                if ((W1.attributes.get(i16) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) W1.attributes.get(i16)).storyItem) != null) {
                    storyItem.dialogId = org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    cnVar.getOrCreateStoryViewer().L(cnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, di.i7.a(cnVar.z0));
                    return;
                }
            }
        }
        if (cnVar.Ga(W1.url, q1Var, null, messageObject.e1(), 2)) {
            return;
        }
        vf.b bVar4 = cnVar.cc;
        if (bVar4 != null) {
            bVar4.a(true);
        }
        cnVar.cc = q1Var.getMessageObject() != null ? new gm(this, q1Var, i14) : null;
        vf.c.s(cnVar.getParentActivity(), Uri.parse(W1.url), true, true, false, cnVar.cc, null, false, true, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean g2(int i7) {
        boolean z9;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        if (i7 != 16 && i7 != R.id.acc_action_small_button && i7 != R.id.acc_action_msg_options) {
            return false;
        }
        cn cnVar = this.a;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
        if (!z9 || !cnVar.ea) {
            return !d();
        }
        q4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
            ((ActionBarLayout) q4Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        cn cnVar;
        int i7;
        if (q1Var.getMessageObject() == null || (i7 = (cnVar = this.a).Yb) == 0 || i7 != q1Var.getMessageObject().e1() || cnVar.Zb != 3) {
            return null;
        }
        return cnVar.bc;
    }

    @Override // org.telegram.ui.Cells.l1
    public final int h0(org.telegram.ui.Cells.q1 q1Var) {
        sh.c cVar;
        cn cnVar = this.a;
        if (!cnVar.cd.f || (cVar = cnVar.id) == null || cVar.n != q1Var || cVar.a.getWidth() <= 0) {
            return 0;
        }
        return cnVar.id.a.getHeight();
    }

    public final void i(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, boolean z9) {
        cn cnVar = this.a;
        TLRPC.Chat chat2 = cnVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            wi wiVar = cnVar.o1;
            if (wiVar != null && i7 == 0) {
                wiVar.e(false, false);
                return;
            } else {
                if (q1Var.getMessageObject() != null) {
                    cnVar.l(i7, q1Var.getMessageObject().e1(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || cnVar.ea()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            ji jiVar = null;
            if (z9) {
                vf.b bVar = cnVar.cc;
                if (bVar != null) {
                    bVar.a(true);
                    cnVar.cc = null;
                }
                if (q1Var == null || q1Var.getMessageObject() == null) {
                    cnVar.cc = null;
                } else {
                    ji jiVar2 = new ji(cnVar, q1Var.getMessageObject().e1(), q1Var, 0);
                    cnVar.cc = jiVar2;
                    jiVar = jiVar2;
                }
            }
            if (cnVar.getMessagesController().E(bundle, cnVar, q1Var.getMessageObject(), jiVar)) {
                ji jiVar3 = jiVar;
                cn cnVar2 = new cn(bundle);
                if (jiVar3 == null || i7 == 0) {
                    cnVar.presentFragment(cnVar2);
                } else {
                    org.telegram.messenger.g0.i3(new bi.ub(this, jiVar3, chat, i7, cnVar2, 11), 5000L);
                    jiVar3.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        cn cnVar = this.a;
        if (cnVar.getParentActivity() == null) {
            return;
        }
        if (cnVar.sa == null) {
            wh.i iVar = new wh.i(cnVar.getParentActivity());
            cnVar.sa = iVar;
            cnVar.l1.addView(iVar, c8.ha.e(-1, -1, 48));
        }
        wh.i iVar2 = cnVar.sa;
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
        wh.h hVar = new wh.h(iVar2, q1Var, arrayList5, new u9.f(23, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i2() {
        cn cnVar = this.a;
        if (!cnVar.getUserConfig().q()) {
            org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.id.H(',', "UnlockSimilarChannelsPremium", cnVar.getMessagesController().x4), new vl(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", cnVar.j6);
        bundle.putInt("start_from", 10);
        cnVar.presentFragment(new org.telegram.ui.Components.v80(bundle, cnVar.o1.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a10 = sh.h.a(messageObject);
        boolean a11 = c8.zc.a(a10, 7);
        cn cnVar = this.a;
        if (a11) {
            org.telegram.ui.Components.hc.a0(cnVar).Q(R.raw.e_hand_2, 36, sh.h.b(a10, messageObject)).j();
            return;
        }
        if (i7 < 0 && !arrayList.isEmpty()) {
            cnVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
            q1Var.a0(true);
            return;
        }
        if (cnVar.getParentActivity() == null) {
            return;
        }
        if (cnVar.B2 == null) {
            int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
            if (indexOfChild == -1) {
                return;
            }
            fi.m3 E6 = cnVar.E6(250.0f, 3, indexOfChild + 1, false);
            cnVar.B2 = E6;
            E6.u0 = 0.0f;
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
                float y10 = ((q1Var.getY() + p1Var.b) - org.telegram.messenger.g0.L(4.0f)) - cnVar.N9;
                cnVar.E2 = org.telegram.messenger.g0.L(13.3f) + p1Var.a;
                int D = org.telegram.messenger.camera.q.D(6.0f, p1Var.b, i11);
                cnVar.F2 = D;
                if (y10 > 0.0f) {
                    i10 = cnVar.E2;
                    i11 = D;
                    f10 = 0.0f;
                    break;
                }
                i12++;
                f10 = y10;
            }
            if (f10 != 0.0f) {
                cnVar.z0.w0(0, (int) f10, null);
                cnVar.D2 = q1Var;
                return;
            }
        }
        cn.q2(cnVar, q1Var, i7, i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        wh.h hVar;
        wh.i iVar = this.a.sa;
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
        cn cnVar = this.a;
        fi.m3 m3Var = cnVar.O1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (cnVar.getParentActivity() == null || (messageObject = q1Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.id.E0().y);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str = R0.country;
        }
        fi.m3 m3Var2 = new fi.m3(cnVar.getParentActivity(), 3);
        m3Var2.r(true);
        m3Var2.K = Layout.Alignment.ALIGN_NORMAL;
        m3Var2.d = -1L;
        m3Var2.T = true;
        m3Var2.e = true;
        m3Var2.s(12.0f);
        cnVar.O1 = m3Var2;
        m3Var2.q0 = new rf(17, this, m3Var2);
        m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750848, str)));
        cnVar.O1.l(cnVar.K);
        cnVar.l1.addView(cnVar.O1, c8.ha.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        cnVar.l1.post(new l2.z(this, q1Var, i10, i7, 12));
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
        cn cnVar = this.a;
        if (cnVar.X9()) {
            return false;
        }
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
        return !z9;
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.j9 k2() {
        return this.a.s9;
    }

    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.f2 f2Var = this.a;
            if (f2Var.getMessagesController().E(bundle, f2Var, q1Var.getMessageObject(), null)) {
                f2Var.presentFragment(new cn(bundle));
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
        cn cnVar = this.a;
        wj wjVar = cnVar.c1;
        if (wjVar == null || wjVar.getVisibility() != 0) {
            vj vjVar = cnVar.S;
            if ((vjVar == null || vjVar.getVisibility() != 0) && cnVar.Z != null && str != null && str.length() > 0) {
                cnVar.Z.setFieldText("@" + str + " ");
                cnVar.Z.H0();
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m12 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            B1(q1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        cn cnVar = this.a;
        if (geoPoint != null) {
            if (org.telegram.messenger.g0.J1(cnVar)) {
                km kmVar = new km(3);
                g6Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                kmVar.setResourceProvider(g6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = cnVar.getMessagesController().z1(cnVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                kmVar.P0 = false;
                kmVar.G0(new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message, false, false));
                cnVar.presentFragment(kmVar);
                return;
            }
            return;
        }
        if (org.telegram.messenger.ij.N2(messageMedia.document)) {
            ms.p().v(cnVar.getParentActivity());
            ms.p().u(new lm(this, tL_messageMediaPoll, pollAnswer, q1Var));
            ms p10 = ms.p();
            TLRPC.Document document4 = messageMedia.document;
            int i17 = org.telegram.messenger.ij.H2(document4) ? 2 : 0;
            org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
            g6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
            p10.s(document4, null, "", null, null, i17, false, messageObject2, g6Var, org.telegram.messenger.qs.e3);
            return;
        }
        if (org.telegram.messenger.ij.J3(messageMedia.document)) {
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
            TLRPC.TL_message R7 = cn.R7(message);
            R7.media = messageMedia;
            R7.attachPath = sh.e.c(i7, message);
            ArrayList arrayList = new ArrayList();
            i16 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i16, R7, false, true);
            ijVar2.k0 = i7 == -3;
            arrayList.add(ijVar2);
            if (MediaController.B().I(messageObject)) {
                MediaController.B().q(false, true, false, false);
            }
            MediaController.B().o0(arrayList, ijVar2, 0L, true, null, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !org.telegram.messenger.ij.K4(document5)) {
            i14 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            sh.a aVar = new sh.a(i14, messageObject, document6, sh.e.c(i7, messageObject.k));
            if (aVar.g) {
                org.telegram.messenger.w7.G(i14).f(document6);
                aVar.a();
                q1Var.Z();
                return;
            }
            if (!aVar.f) {
                org.telegram.messenger.w7.G(i14).W(document6, messageObject, 2, 0);
                aVar.a();
                q1Var.Z();
                return;
            }
            TLRPC.Message message2 = messageObject.k;
            TLRPC.TL_message R72 = cn.R7(message2);
            R72.media = messageMedia;
            R72.attachPath = sh.e.c(i7, message2);
            i15 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            mm mmVar = new mm(i15, R72, false, true);
            if (org.telegram.messenger.ij.y(messageMedia.document)) {
                PhotoViewer.p1().H2(null, cnVar, cnVar.za);
                PhotoViewer p12 = PhotoViewer.p1();
                int i18 = mmVar.D;
                p12.d2(mmVar, cnVar, i18 != 0 ? cnVar.j6 : 0L, i18 != 0 ? cnVar.b7 : 0L, i18 != 0 ? cnVar.b() : 0L, cnVar.bb);
                return;
            }
            try {
                org.telegram.messenger.g0.u2(mmVar, cnVar.getParentActivity(), cnVar.za, false);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                cnVar.M6(mmVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.ij.K4(document3))) {
            i10 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message R73 = cn.R7(message3);
            R73.media = messageMedia3;
            R73.attachPath = sh.e.c(-2, message3);
            i13 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            arrayList3.add(new dm(i13, R73, false, true));
            arrayList2.add(-2);
        } else {
            i10 = -1;
        }
        if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.ij.K4(document2))) {
            if (messageMedia2 == messageMedia) {
                i10 = arrayList3.size();
            }
            TLRPC.TL_message R74 = cn.R7(message3);
            R74.media = messageMedia2;
            R74.attachPath = sh.e.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            R74.message = pollResults2.solution;
            R74.entities = pollResults2.solution_entities;
            i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            arrayList3.add(new em(i12, R74, false, true));
            arrayList2.add(-3);
        }
        cg.d.b(tL_messageMediaPoll.poll, cnVar.getUserConfig().e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.ij.K4(document))) {
                if (pollAnswer2.unshuffled_index == i7) {
                    i10 = arrayList3.size();
                }
                TLRPC.TL_message R75 = cn.R7(message3);
                R75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                R75.message = tL_textWithEntities2.text;
                R75.entities = tL_textWithEntities2.entities;
                R75.attachPath = sh.e.c(pollAnswer2.unshuffled_index, message3);
                i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                arrayList3.add(new fm(i11, R75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.q0 = arrayList2;
        PhotoViewer.p1().H2(null, cnVar, cnVar.za);
        PhotoViewer.p1().Z1(arrayList3, i10, cnVar.a(), 0L, 0L, cnVar.cb);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean n0(org.telegram.ui.Components.r5 r5Var) {
        TLRPC.InputStickerSet i12;
        int i7;
        cn cnVar = this.a;
        if (!cnVar.getMessagesController().D3() && r5Var != null && !r5Var.standard) {
            long documentId = r5Var.getDocumentId();
            TLRPC.Document document = r5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                document = org.telegram.ui.Components.i5.e(i7, documentId);
            }
            if (document != null && (i12 = org.telegram.messenger.ij.i1(document)) != null) {
                org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).m0(i12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i12);
                org.telegram.ui.Components.ru ruVar = new org.telegram.ui.Components.ru(cnVar, cnVar.getParentActivity(), cnVar.za, arrayList);
                org.telegram.ui.Components.ju juVar = ruVar.m1;
                juVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(juVar);
                juVar.w = imageReceiver;
                if (juVar.d) {
                    imageReceiver.P();
                }
                juVar.x = true;
                juVar.y.e(true, 1.0f);
                juVar.w.r0(org.telegram.messenger.hc.b(document), "140_140", org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.l6.m6, 0.2f, true), 0L, null, null, 0);
                juVar.w.E0(7);
                ImageReceiver imageReceiver2 = juVar.w;
                imageReceiver2.u0 = true;
                imageReceiver2.t0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = juVar.w;
                imageReceiver3.w0 = true;
                imageReceiver3.H0(juVar);
                boolean U9 = cnVar.U9();
                ruVar.h0 = U9;
                ruVar.n = U9;
                cnVar.showDialog(ruVar);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean n1() {
        cn cnVar = this.a;
        return cnVar.l1.getMeasuredWidth() > cnVar.l1.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
        float L;
        if (q1Var.getMessageObject().y3()) {
            Z0();
            return;
        }
        cn cnVar = this.a;
        if (cnVar.z3 || cnVar.z0 == null || cnVar.getParentActivity() == null || cnVar.fragmentView == null) {
            return;
        }
        if (cnVar.I2 == null) {
            int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
            if (indexOfChild == -1) {
                return;
            }
            fi.m3 E6 = cnVar.E6(250.0f, 3, indexOfChild + 1, false);
            cnVar.I2 = E6;
            E6.u(org.telegram.messenger.id.M0(2131749329, null));
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        TLRPC.User currentUser = q1Var.getCurrentUser();
        if (currentUser == null || currentUser.id != 0) {
            float L2 = org.telegram.messenger.g0.L(22.0f);
            L = (messageObject.P3() || !q1Var.j9 || q1Var.U8 == null) ? L2 : org.telegram.messenger.g0.L(20.0f) + L2;
        } else {
            L = (q1Var.getMeasuredHeight() - Math.max(0, q1Var.getBottom() - ((View) q1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
        }
        if (cnVar.v9(q1Var, L) <= org.telegram.messenger.g0.L(80.0f)) {
            return;
        }
        cnVar.I2.x(cnVar.u9(q1Var, q1Var.getForwardNameCenterX()), cnVar.v9(q1Var, L) - org.telegram.messenger.g0.L(4.0f), true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p() {
        this.a.l1.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        cn cnVar = this.a;
        cnVar.Y7(q1Var, false, false, f10, f11, true, false, false);
        cnVar.z0.getClass();
        cn.l2(cnVar, RecyclerView.R(q1Var));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        cn cnVar = this.a;
        return cnVar.Yb != 0 && q1Var.getMessageObject() != null && cnVar.Yb == q1Var.getMessageObject().e1() && cnVar.Zb == i7;
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
        cn cnVar = this.a;
        TLRPC.User user2 = cnVar.f;
        if (user2 != null && user2.id == user.id) {
            i10 = 1;
        }
        profileActivity.j5(i10);
        Activity parentActivity = cnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        org.telegram.messenger.g0.l3(parentActivity, i7);
        cnVar.presentFragment(profileActivity);
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
        cn cnVar = this.a;
        if (cnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.n11 n11Var = cnVar.f2;
        boolean z9 = true;
        if (n11Var != null && cnVar.r4 == 0 && (q1Var.k6 || q1Var.l6)) {
            n11Var.n(q1Var.getMessageObject().Y1(), true);
            return;
        }
        if (cnVar.getMessagesController().v2()) {
            i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            b.b(i12);
            return;
        }
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            sjVar.L();
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        int i13 = cnVar.f4;
        if (i13 == 2) {
            cnVar.l9.T0(messageObject.e1());
            cnVar.finishFragment();
            return;
        }
        if (i13 == 3 || ((i13 == 7 && cnVar.c4 == 2) || !((!org.telegram.messenger.t10.z(cnVar.f) && !org.telegram.messenger.t10.B(cnVar.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (org.telegram.messenger.t10.z(cnVar.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i7 = messageReplyHeader.reply_to_top_id) != 0) {
                cnVar.Ca(messageReplyHeader.reply_to_peer_id.channel_id, null, i7, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (cnVar.f4 == 7 && cnVar.c4 == 2) {
                cnVar.Ha(messageObject);
                return;
            } else {
                cnVar.Ia(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.c1() == 0 || (djVar = (org.telegram.messenger.dj) cnVar.N6.f(messageObject.c1())) == null) ? null : djVar.d;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.k5.k(messageObject);
        }
        if (cnVar.getMessagesController().W4()) {
            int i14 = messageObject.I1;
            if (!messageObject.r4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i11 = messageObject.D) != 17 && i11 != 12)) {
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
                    cnVar.showDialog(new hm(this, cnVar.getParentActivity(), cnVar, arrayList, org.telegram.messenger.t3.T(cnVar.e), z10, cnVar.za, z10, messageObject));
                    Activity parentActivity = cnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i10);
                    cnVar.fragmentView.requestLayout();
                }
            }
        }
        z9 = false;
        boolean z102 = z9;
        cnVar.showDialog(new hm(this, cnVar.getParentActivity(), cnVar, arrayList, org.telegram.messenger.t3.T(cnVar.e), z102, cnVar.za, z102, messageObject));
        Activity parentActivity2 = cnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        org.telegram.messenger.g0.l3(parentActivity2, i10);
        cnVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r1(org.telegram.ui.Cells.q1 q1Var) {
        cn.f5(this.a, q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        cn cnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        boolean z9 = true;
        if (kVar.w() || cnVar.X9()) {
            cn.k2(cnVar, q1Var, true, f10, f11);
            return;
        }
        if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().r4()) {
            g1(q1Var, 10);
            return;
        }
        if (!org.telegram.messenger.t3.c0(cnVar.e) && !cnVar.ea()) {
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
        this.a.Ec();
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
        cn cnVar;
        boolean z10;
        cn cnVar2;
        File file;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i10;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        int i11 = messageObject.D;
        int i12 = 2;
        cn cnVar3 = this.a;
        if (i11 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia2.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 2;
            di.s7.b(storyItem, cnVar3.f);
            cnVar3.getOrCreateStoryViewer().L(cnVar3.getParentActivity(), messageObject.k.media.storyItem, di.i7.a(cnVar3.z0));
            return;
        }
        int i13 = 1;
        if (org.telegram.messenger.ij.L4(messageObject.k)) {
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar3).currentAccount;
            if (org.telegram.messenger.z5.q(i10).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.n4()) {
            cnVar3.Y7(q1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject.o4()) {
            return;
        }
        int i14 = 0;
        if (z9 && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            org.telegram.messenger.g0.K0(str, false);
            if (cnVar3.Ga(str, q1Var, null, messageObject.e1(), 2)) {
                return;
            }
            vf.b bVar = cnVar3.cc;
            if (bVar != null) {
                bVar.a(true);
            }
            cnVar3.cc = q1Var.getMessageObject() != null ? new gm(this, q1Var, i14) : null;
            vf.c.s(cnVar3.getParentActivity(), Uri.parse(str), true, false, false, cnVar3.cc, null, false, true, false, false);
            return;
        }
        if (messageObject.T2()) {
            xl xlVar = new xl(this, messageObject, i14);
            TLRPC.MessageMedia n1 = org.telegram.messenger.ij.n1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(n1) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                xlVar.run();
                return;
            }
            org.telegram.messenger.qp messagesController = cnVar3.getMessagesController();
            int i15 = 5;
            y yVar = new y(this, messageObject, xlVar, i15);
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
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(1), new org.telegram.messenger.fl(messagesController, i15));
            return;
        }
        if ((messageObject.G2() && (!messageObject.F2() || (cnVar3.Sa.e.containsKey(kx.p(org.telegram.messenger.ij.U(messageObject.F0()))) && cnVar3.f != null))) || messageObject.W3()) {
            cnVar3.pb(q1Var);
            cnVar3.Sa.k(q1Var, cnVar3, true);
            cnVar3.z0.I0(false);
            return;
        }
        int i16 = 6;
        if (messageObject.m5()) {
            ie Kb = cnVar3.Kb(messageObject, false);
            bi.d3 a52 = cn.a5(cnVar3, messageObject);
            q1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = cnVar3.getParentActivity();
            int i17 = org.telegram.messenger.p10.s0;
            f12.a = i17;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.d = i17;
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.e1 = new org.telegram.ui.Components.xk0(parentActivity, null);
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
                f12.e.setOnApplyWindowInsetsListener(new hz0(f12, 0));
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
                f12.F.D(1090519039, false);
                f12.F.E(-1, false);
                f12.F.setBackButtonImage(R.drawable.ic_ab_back);
                f12.F.setTitleRightMargin(org.telegram.messenger.g0.L(70.0f));
                f12.e.addView(f12.F, c8.ha.c(-2.0f, -1));
                f12.F.setActionBarMenuOnItemClick(new pt0(f12, 9));
                fi.m3 m3Var = new fi.m3(parentActivity, 1);
                f12.r = m3Var;
                m3Var.o(1.0f, -26.0f);
                f12.r.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                f12.e.addView(f12.r, c8.ha.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                nz0 nz0Var = new nz0(f12, parentActivity);
                f12.n = nz0Var;
                f12.e.addView(nz0Var, c8.ha.d(org.telegram.messenger.qs.E1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                yr0 yr0Var = new yr0(f12, i13);
                f12.S = new oz0(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.R = view2;
                view2.setBackgroundColor(2130706432);
                f12.S.addView(f12.R, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(f12.e.getContext());
                f12.Q = l5Var;
                l5Var.setTextColor(-1);
                f12.Q.setGravity(53);
                f12.Q.setTextSize(14);
                f12.Q.setImportantForAccessibility(2);
                f12.S.addView(f12.Q, c8.ha.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                n00 n00Var = new n00(8, parentActivity, f12);
                f12.P = n00Var;
                org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(n00Var);
                f12.O = w51Var;
                w51Var.z = org.telegram.messenger.g0.L(2.0f);
                org.telegram.ui.Components.w51 w51Var2 = f12.O;
                w51Var2.k = 872415231;
                w51Var2.l = 872415231;
                w51Var2.m = -1;
                w51Var2.n = -1;
                w51Var2.A = 1509949439;
                w51Var2.j = yr0Var;
                f12.S.addView(f12.P);
                f12.e.addView(f12.S, c8.ha.e(-1, 48, 80));
                wo0 wo0Var = new wo0(null, new di.b());
                f12.W = wo0Var;
                wo0Var.j0 = true;
                wo0Var.h0 = false;
                nq0 nq0Var = new nq0(f12.e.getContext());
                f12.X = nq0Var;
                nq0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.iz0
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new mq0(parentActivity, secretMediaViewer.Y, secretMediaViewer.W, new a5(secretMediaViewer, 23), new vd0(secretMediaViewer, 2));
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
                imageView.setBackground(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(64.0f), 1711276032));
                org.telegram.ui.Components.ie0 ie0Var = new org.telegram.ui.Components.ie0(28);
                f12.U = ie0Var;
                ie0Var.setCallback(f12.T);
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
            SecretMediaViewer.f().h(messageObject, cnVar3.bb, Kb, a52);
            return;
        }
        if (org.telegram.messenger.ij.H2(messageObject.F0()) && org.telegram.messenger.ij.i1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(org.telegram.messenger.ij.i1(messageObject.F0()));
            org.telegram.ui.Components.ru ruVar = new org.telegram.ui.Components.ru(cnVar3, cnVar3.getParentActivity(), cnVar3.za, arrayList3);
            boolean U9 = cnVar3.U9();
            ruVar.h0 = U9;
            ruVar.n = U9;
            cnVar3.showDialog(ruVar);
            return;
        }
        if (org.telegram.messenger.ij.j1(messageObject.k) != null) {
            org.telegram.ui.Components.zv0 zv0Var = new org.telegram.ui.Components.zv0(cnVar3.getParentActivity(), cnVar3, org.telegram.messenger.ij.j1(messageObject.k), null, (cnVar3.c1.getVisibility() == 0 || !((chat = cnVar3.e) == null || org.telegram.messenger.t3.t(chat))) ? null : cnVar3.Z, cnVar3.za);
            boolean U92 = cnVar3.U9();
            zv0Var.h0 = U92;
            zv0Var.n = U92;
            cnVar3.showDialog(zv0Var);
            return;
        }
        if (org.telegram.messenger.ij.L4(messageObject.k) || (i7 = messageObject.D) == 1 || ((i7 == 0 && !messageObject.a5()) || org.telegram.messenger.ij.t3(messageObject.k))) {
            if (messageObject.r4()) {
                if (org.telegram.messenger.ij.t3(messageObject.k) || org.telegram.messenger.ij.S3(messageObject.k)) {
                    cnVar3.la(messageObject, true, false);
                    if (messageObject.R0 != null) {
                        vf.b bVar2 = cnVar3.cc;
                        if (bVar2 != null) {
                            bVar2.a(true);
                        }
                        cnVar3.cc = q1Var.getMessageObject() == null ? null : new gm(this, q1Var, i13);
                        vf.c.s(cnVar3.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, cnVar3.cc, null, false, cnVar3.getMessagesController().d6, false, false);
                        return;
                    }
                    return;
                }
                if (org.telegram.messenger.ij.L4(messageObject.k)) {
                    cnVar3.la(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.g2() > 0 && !messageObject.h3) {
                messageObject.c0 = (float) (messageObject.g2() / messageObject.L0());
            }
            cnVar3.Ja(q1Var, messageObject);
            return;
        }
        int i18 = messageObject.D;
        if (i18 == 3) {
            cnVar3.Kb(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    org.telegram.messenger.w7 fileLoader = cnVar3.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.w7.M(message2, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity2 = cnVar3.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity2, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                cnVar3.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                cnVar3.M6(messageObject);
                return;
            }
        }
        if (i18 == 4) {
            if (org.telegram.messenger.g0.J1(cnVar3)) {
                if (!messageObject.C3()) {
                    ra0 ra0Var = new ra0(cnVar3.h != null ? 0 : 3);
                    ra0Var.G0 = cnVar3;
                    ra0Var.G0(messageObject);
                    cnVar3.presentFragment(ra0Var);
                    return;
                }
                TLRPC.Chat chat2 = cnVar3.e;
                if (chat2 != null && !org.telegram.messenger.t3.n(chat2) && !cnVar3.e.megagroup) {
                    i12 = 6;
                }
                ra0 ra0Var2 = new ra0(i12);
                ra0Var2.G0 = cnVar3;
                ra0Var2.G0(messageObject);
                cnVar3.presentFragment(ra0Var2);
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
                org.telegram.messenger.w7 fileLoader2 = cnVar3.getFileLoader();
                TLRPC.Message message3 = messageObject.k;
                fileLoader2.getClass();
                File M = org.telegram.messenger.w7.M(message3, false, true);
                if (M.exists()) {
                    file = M;
                }
            }
            org.telegram.ui.ActionBar.k6 v = org.telegram.ui.ActionBar.l6.v(file, messageObject.I0(), null, true);
            if (v != null) {
                cnVar3.presentFragment(new w71(v));
                return;
            }
            cnVar3.L4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer.p1().H2(null, cnVar3, cnVar3.za);
            PhotoViewer p12 = PhotoViewer.p1();
            int i19 = messageObject.D;
            p12.d2(messageObject, cnVar3, i19 != 0 ? cnVar3.j6 : 0L, i19 != 0 ? cnVar3.b7 : 0L, i19 != 0 ? cnVar3.b() : 0L, cnVar3.bb);
            cnVar = cnVar3;
            z10 = true;
        } else {
            cnVar = cnVar3;
            z10 = false;
        }
        Pattern pattern = org.telegram.ui.Components.o80.a;
        String Q0 = messageObject.Q0();
        if (!"md".equalsIgnoreCase(Q0) && !"mkd".equalsIgnoreCase(Q0) && !"mdwn".equalsIgnoreCase(Q0) && !"mkdn".equalsIgnoreCase(Q0) && !"mdown".equalsIgnoreCase(Q0) && !"markdown".equalsIgnoreCase(Q0)) {
            String t12 = messageObject.t1();
            if (t12 != null) {
                String lowerCase = t12.toLowerCase();
                if (!lowerCase.startsWith("text/markdown")) {
                    if (!lowerCase.startsWith("text/x-markdown")) {
                    }
                }
            }
            if (!org.telegram.ui.Components.o80.j(messageObject)) {
                cnVar2 = cnVar;
                if (z10) {
                    try {
                        org.telegram.messenger.g0.u2(messageObject, cnVar2.getParentActivity(), cnVar2.za, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        cnVar2.M6(messageObject);
                        return;
                    }
                }
                return;
            }
        }
        if (cnVar.getParentActivity() == null) {
            cnVar2 = cnVar;
        } else {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, cnVar.getParentActivity(), cnVar.za);
            u1Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            u1Var.setOnCancelListener(new ig(0, zArr));
            u1Var.r(150L);
            cn cnVar4 = cnVar;
            m6 m6Var = new m6(cnVar4, messageObject, u1Var, zArr, 7);
            cnVar2 = cnVar4;
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
        wj wjVar;
        vj vjVar;
        if (!f()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.t3.K(chat, false));
        cn cnVar = this.a;
        int i13 = (isEmpty || cnVar.e == null || ((wjVar = cnVar.c1) != null && wjVar.getVisibility() == 0) || ((vjVar = cnVar.S) != null && vjVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = cnVar.e;
        int i14 = (chat2 == null || !(cnVar.r4 == 0 || cnVar.v4) || (org.telegram.messenger.t3.T(chat2) && !cnVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = cnVar.e;
        int i15 = (chat3 == null || chat3.id != chat.id || cnVar.ea()) ? 1 : 0;
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
        TLRPC.ChatFull N0 = cnVar.getMessagesController().N0(chat.id);
        if (N0 != null) {
            w4Var = w4.a(chat, N0, c5VarArr);
            i11 = i13;
            i12 = i14;
            z9 = true;
            str = null;
            z10 = i15;
        } else {
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
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
            ab.q.o().C((ViewGroup) cnVar.fragmentView, cnVar.za, w4Var, new a7(this, chat, q1Var, 7));
            return z9;
        }
        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(cnVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.id.M0(2131747786, str), new yl(this, chat, 0), false);
        boolean z11 = chat.broadcast;
        H.l(z11 ? R.drawable.msg_channel : R.drawable.msg_discussion, org.telegram.messenger.id.M0(z11 ? 2131747811 : 2131747799, str), new o1(this, q1Var, chat, 25), z10);
        H.l(R.drawable.msg_mention, org.telegram.messenger.id.M0(2131748609, str), new yl(this, chat, z9 ? 1 : 0), i11);
        H.l(R.drawable.msg_search, org.telegram.messenger.id.M0(2131753758, str), new yl(this, chat, 2), i12);
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
        fj fjVar;
        org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.a3 = !primaryMessageObject.a3;
        primaryMessageObject.K1 = true;
        cn cnVar = this.a;
        cj cjVar = cnVar.z0;
        if (cjVar != null && (fjVar = cnVar.B0) != null && fjVar.y < 0) {
            for (int childCount = cjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = cnVar.z0.getChildAt(childCount);
                cnVar.z0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = cnVar.g9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = cnVar.g9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        cnVar.Yc(primaryMessageObject, false);
        fi.m3 m3Var = cnVar.O1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (i7 < 0 || q1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        cnVar.B0.h1(i7, i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        cn cnVar = this.a;
        if (cnVar.W9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (cnVar.getParentActivity() != null) {
            if (cnVar.c1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        cnVar.Ba(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) cnVar.getParentActivity(), (org.telegram.ui.ActionBar.g6) cnVar.za, false);
                v2Var.N();
                v2Var.O = str;
                v2Var.P = false;
                v2Var.Q = true;
                CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131751767, null)};
                og.j jVar = new og.j(3, cnVar, str);
                v2Var.L = charSequenceArr;
                v2Var.K = jVar;
                cnVar.showDialog(v2Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean w1() {
        cn cnVar = this.a;
        return cnVar.l1.getKeyboardHeight() + cnVar.Ja >= org.telegram.messenger.g0.L(20.0f);
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
                cn cnVar = this.a;
                cnVar.Ca(cnVar.e.id, ijVar, ijVar.e1(), j10, i10, 0, null);
            }
        }
        messageObject = q1Var.getMessageObject();
        org.telegram.messenger.ij ijVar2 = messageObject;
        messageReplies = ijVar2.k.replies;
        if (messageReplies == null) {
        }
        int i102 = i7;
        long j102 = j3;
        cn cnVar2 = this.a;
        cnVar2.Ca(cnVar2.e.id, ijVar2, ijVar2.e1(), j102, i102, 0, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean x0(org.telegram.messenger.ij ijVar) {
        return !this.a.s.containsKey(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        boolean z9 = q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        cn cnVar = this.a;
        if (z9) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().k.media).channels.get(i7).longValue();
            if (cnVar.j6 != j3) {
                cnVar.presentFragment(cn.ta(j3));
            } else {
                cnVar.o1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            cnVar.presentFragment(ProfileActivity.D4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().k.media).winners.get(i7).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final String y(long j3) {
        TLRPC.Peer peer;
        String C0;
        cn cnVar = this.a;
        if (org.telegram.messenger.t10.u(cnVar.f)) {
            return null;
        }
        TLRPC.Chat chat = cnVar.e;
        if (chat != null && !org.telegram.messenger.t3.V(chat) && (C0 = cnVar.getMessagesController().C0(cnVar.e.id, j3)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = cnVar.q4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j3 || peer.channel_id == j3 || peer.chat_id == j3)) {
            return null;
        }
        return org.telegram.messenger.id.M0(2131744020, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
        sh.c cVar = this.a.id;
        if (cVar == null || cVar.n != q1Var) {
            return;
        }
        cVar.x.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        cn cnVar = this.a;
        cnVar.t5 = messageObject;
        cnVar.B9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.Y5();
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
        cn cnVar = this.a;
        if (cnVar.z3 || org.telegram.messenger.iz.A0 || cnVar.z0 == null || cnVar.getParentActivity() == null || cnVar.fragmentView == null) {
            return;
        }
        fi.m3 m3Var = cnVar.H2;
        if (m3Var == null || !m3Var.V) {
            if (m3Var == null) {
                int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
                if (indexOfChild == -1) {
                    return;
                }
                fi.m3 E6 = cnVar.E6(250.0f, 3, indexOfChild + 1, false);
                cnVar.H2 = E6;
                E6.d = 10000L;
                E6.m(cnVar.getParentActivity().getResources().getDrawable(R.drawable.tooltip_sound).mutate());
                cnVar.H2.u(org.telegram.messenger.id.M0(2131753762, null));
            }
            int childCount = cnVar.z0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = cnVar.z0.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.ij.L4(messageObject.k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !cnVar.H2.V) {
                    ImageReceiver photoImage = q1Var.getPhotoImage();
                    float v92 = cnVar.v9(q1Var, photoImage.L0);
                    float f10 = photoImage.N0;
                    View view = (View) q1Var.getParent();
                    float v93 = cnVar.v9(q1Var, -q1Var.getTop());
                    if (v92 <= org.telegram.messenger.g0.L(80.0f)) {
                        continue;
                    } else if ((v92 + f10) - v93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                        cnVar.Jb = q1Var;
                        fi.m3 m3Var2 = cnVar.H2;
                        m3Var2.q0 = new af(cnVar, 23);
                        m3Var2.x(cnVar.u9(q1Var, q1Var.getNoSoundIconCenterX()), v92, true);
                        org.telegram.messenger.iz.D(true);
                        return;
                    }
                }
            }
        }
    }
}
