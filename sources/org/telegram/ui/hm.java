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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hm implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ wm a;

    public hm(wm wmVar) {
        this.a = wmVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        wm wmVar = this.a;
        if (wmVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
            if (((ActionBarLayout) q4Var2).y()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z11 = tLObject instanceof TLRPC.Chat;
        if (z11) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        if (!z10 || !z11) {
            wmVar.presentFragment(new wm(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, wmVar.getParentActivity(), wmVar.getResourceProvider());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, wmVar.getResourceProvider());
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(wmVar.getParentActivity(), false, false);
        y0Var.j(org.telegram.messenger.bd.M0(2131747819, null), R.drawable.msg_channel, null);
        y0Var.setMinimumWidth(org.telegram.messenger.hs.q2);
        y0Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(wmVar.getParentActivity(), false, false);
        y0Var2.j(org.telegram.messenger.bd.M0(2131746670, null), R.drawable.msg_addbot, null);
        y0Var2.setMinimumWidth(org.telegram.messenger.hs.q2);
        y0Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, q1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
        wm wmVar2 = new wm(bundle);
        wmVar2.da = true;
        wmVar.presentFragmentAsPreviewWithMenu(wmVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        wmVar.r7();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        wm wmVar = this.a;
        wmVar.u5 = messageObject;
        wmVar.A9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.Z5();
        messageObject.K1 = true;
        q1Var.G1();
        q1Var.requestLayout();
        this.a.D0.R(messageObject, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        int i3 = messageObject.D;
        wm wmVar = this.a;
        if (i3 != 16) {
            wmVar.X7(q1Var, true, false, f10, f11, messageObject.J3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i10 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = wmVar.f;
            if (user != null) {
                boolean K4 = messageObject.K4();
                TLRPC.UserFull userFull = wmVar.r8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.n1.m(user, K4, i10, wmVar.getParentActivity(), wmVar.getMessagesController().b2(wmVar.f.id), wmVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(wmVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i10 < size) {
            TLRPC.Peer peer = arrayList.get(i10);
            i10++;
            hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.f1();
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, wmVar.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = wmVar.getMessagesController().P6;
        s1Var.setOnCancelListener(new ci.b0(this, wmVar.getConnectionsManager().sendRequest(getgroupcall, new ci.s7(this, s1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
        s1Var.r(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar = this.a;
        if (!wmVar.getMessagesController().S4()) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, wmVar.getParentActivity(), null);
            s1Var.r(200L);
            wmVar.getMessagesController().R0(new z(this, s1Var, q1Var, 6));
        } else {
            if (q1Var.getMessageObject() != null) {
                q1Var.getMessageObject().r2 = Boolean.FALSE;
            }
            q1Var.F3();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C1(org.telegram.messenger.zi ziVar) {
        this.a.s.put(ziVar, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject;
        if (q1Var == null || (messageObject = q1Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int f12 = messageObject.f1();
        wm wmVar = this.a;
        if (wmVar.Xb == f12 && wmVar.Yb == 7) {
            return;
        }
        TLRPC.InputPeer j12 = wmVar.getMessagesController().j1(org.telegram.messenger.zi.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = j12;
        getrichmessage.id = f12;
        sf.b bVar = wmVar.bc;
        if (bVar != null) {
            bVar.a(true);
            wmVar.bc = null;
        }
        int[] iArr = new int[1];
        di diVar = new di(wmVar, f12, q1Var, 2);
        diVar.b = new sc(10, wmVar, iArr);
        wmVar.bc = diVar;
        diVar.d();
        iArr[0] = wmVar.getConnectionsManager().sendRequestTyped(getrichmessage, new c3.b(1), new ci.g3(wmVar, diVar, iArr, q1Var, messageObject, 3));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        f(q1Var, z10, true, z11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !sf.c.i(str, false, false)) ? z10 : true;
        wm wmVar = this.a;
        sf.b bVar = wmVar.bc;
        if (bVar != null) {
            bVar.a(true);
        }
        wmVar.bc = q1Var.getMessageObject() == null ? null : new dm(this, q1Var);
        if (z11 || sf.c.g(parse, false, null)) {
            sf.c.s(wmVar.getParentActivity(), parse, true, true, false, wmVar.bc, null, false, true, false, false);
        } else {
            org.telegram.ui.Components.t4.q0(wmVar, str, true, true, true, !z11, wmVar.bc, webPage, wmVar.ya);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.h6(true);
        wm wmVar = this.a;
        wmVar.getMessagesStorage().X1(org.telegram.messenger.zi.B0(messageObject.k), messageObject.k);
        wmVar.getMessagesController().s7.h(messageObject, true, false);
        f(q1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle G1(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar;
        int i3;
        if (q1Var.getMessageObject() == null || (i3 = (wmVar = this.a).Xb) == 0 || i3 != q1Var.getMessageObject().f1() || wmVar.Yb != 1) {
            return null;
        }
        return wmVar.Zb;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
        TLRPC.Message message;
        int i3;
        int i10;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.k) == null) {
            return;
        }
        int i11 = o2Var.a;
        int i12 = 24;
        wm wmVar = this.a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    wmVar.X7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i11 == 4) {
                        wmVar.g2.n(messageObject.Z1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                boolean A = org.telegram.messenger.t3.A(i3, wmVar.e, 24);
                if (A) {
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    org.telegram.messenger.t3.A(i10, wmVar.e, 5);
                }
                ci.u8 u8Var = new ci.u8(this, message, A, messageObject, 28);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                wmVar.u7(u8Var, dg.a.l(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long o10 = org.telegram.messenger.m5.o(message.from_id);
        mi.f fVar = new mi.f(i12, this, message);
        Pattern pattern = org.telegram.ui.Components.t4.a;
        Activity parentActivity = wmVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(0, parentActivity, null);
        String M0 = org.telegram.messenger.bd.M0(2131744397, null);
        org.telegram.ui.ActionBar.s1 s1Var = u1Var.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744396, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).B1(o10, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, null);
        editText.setHint(org.telegram.messenger.bd.M0(2131744395, null));
        org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.H6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.k6.U(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        int i14 = 6;
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.k4(parentActivity)});
        editText.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        u1Var.o(frameLayout);
        u1Var.k(org.telegram.messenger.bd.M0(2131751605, null), new jo(i14, fVar, editText));
        u1Var.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        s1Var.O = new org.telegram.ui.Components.h1(editText, i13);
        frameLayout.addView(editText, b8.mf.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.vf(editText, 3), 100L);
        wmVar.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H1(org.telegram.messenger.zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        try {
            wm wmVar = this.a;
            org.telegram.ui.Components.ut.K0(wmVar, ziVar, wmVar.ab, str2, str3, str4, str, i3, i10, -1, wmVar.T9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar = this.a;
        wmVar.Ra.k(q1Var, wmVar, true);
        wmVar.A0.I0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean I1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar) {
        long j10;
        ViewGroup viewGroup;
        int i3;
        gz0 gz0Var;
        if (ziVar.T4() || ziVar.h4()) {
            iz0 iz0Var = this.a.ta;
            if (iz0Var == null || iz0Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!ziVar.Q3()) {
                            org.telegram.ui.Components.fc.a0(this.a).w(R.drawable.tooltip_sound, org.telegram.messenger.bd.M0(2131743523, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.ta = new iz0(this.a.getParentActivity());
                iz0 iz0Var2 = this.a.ta;
                ge Hb = !ziVar.Q3() ? this.a.Hb(ziVar, true) : null;
                ai.r1 Z4 = !ziVar.Q3() ? wm.Z4(this.a, ziVar) : null;
                Context context = iz0Var2.a;
                ai.c0 c0Var = iz0Var2.c;
                iz0Var2.Y = Hb;
                iz0Var2.Z = Z4;
                gz0 gz0Var2 = iz0Var2.O;
                if (gz0Var2 != null) {
                    c0Var.removeView(gz0Var2);
                    iz0Var2.O = null;
                }
                iz0Var2.P = q1Var;
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                iz0Var2.N = messageObject;
                iz0Var2.T = messageObject != null && messageObject.i4();
                org.telegram.ui.Cells.q1 q1Var2 = iz0Var2.P;
                iz0Var2.M = q1Var2 != null ? q1Var2.getResourcesProvider() : null;
                if (iz0Var2.P != null) {
                    iz0Var2.U = 0.0f;
                    iz0Var2.V = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        iz0Var2.U = view.getY() + iz0Var2.U;
                        iz0Var2.V = view.getY() + iz0Var2.V;
                    }
                    int width = iz0Var2.P.getWidth();
                    int height = iz0Var2.P.getHeight();
                    if (iz0Var2.T) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.q.y));
                    }
                    iz0Var2.L = height - iz0Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.p);
                    j10 = 0;
                    int i10 = height;
                    viewGroup = c0Var;
                    gz0 gz0Var3 = new gz0(iz0Var2, iz0Var2.getContext(), org.telegram.messenger.h10.t0, iz0Var2.P.getResourcesProvider(), width, i10);
                    iz0Var2.O = gz0Var3;
                    iz0Var2.P.t0(gz0Var3);
                    iz0Var2.O.s0(iz0Var2.P);
                    iz0Var2.O.setDelegate(new nb.a(19));
                    gz0 gz0Var4 = iz0Var2.O;
                    org.telegram.messenger.zi ziVar2 = iz0Var2.N;
                    org.telegram.messenger.ui currentMessagesGroup = iz0Var2.P.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = iz0Var2.P;
                    gz0Var4.u3(ziVar2, currentMessagesGroup, q1Var3.G, q1Var3.F, false, false);
                    if (!iz0Var2.T) {
                        org.telegram.ui.Components.a8 a8Var = new org.telegram.ui.Components.a8();
                        iz0Var2.W = a8Var;
                        gz0 gz0Var5 = iz0Var2.O;
                        a8Var.i = gz0Var5;
                        gz0Var5.uc = a8Var;
                        if (gz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.sm0 seekBarWaveform = iz0Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = iz0Var2.s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    iz0Var2.I = false;
                    viewGroup.addView(iz0Var2.O, new FrameLayout.LayoutParams(iz0Var2.P.getWidth(), i10, 17));
                    i3 = ceil;
                } else {
                    j10 = 0;
                    viewGroup = c0Var;
                    i3 = 360;
                }
                TextureView textureView = iz0Var2.Q;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    iz0Var2.Q = null;
                }
                if (iz0Var2.T) {
                    iz0Var2.R = false;
                    TextureView textureView2 = new TextureView(context);
                    iz0Var2.Q = textureView2;
                    viewGroup.addView(textureView2, 0, b8.mf.c(i3, i3));
                }
                org.telegram.ui.Components.m51 m51Var = MediaController.B().j0;
                if (m51Var != null) {
                    m51Var.g0();
                }
                org.telegram.ui.Components.m51 m51Var2 = iz0Var2.x;
                if (m51Var2 != null) {
                    m51Var2.g0();
                    iz0Var2.x.m0();
                    iz0Var2.x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = iz0Var2.P;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(iz0Var2.P.getMessageObject().I1);
                    File I = org.telegram.messenger.w7.I(iz0Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(iz0Var2.P.getMessageObject().I1);
                        I = org.telegram.messenger.w7.N(iz0Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && iz0Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(iz0Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.m51 m51Var3 = new org.telegram.ui.Components.m51();
                        iz0Var2.x = m51Var3;
                        m51Var3.K = new hz0(iz0Var2);
                        if (iz0Var2.W != null) {
                            m51Var3.L = new hz0(iz0Var2);
                        }
                        if (iz0Var2.T) {
                            m51Var3.A0(iz0Var2.Q);
                        }
                        iz0Var2.x.j0(Uri.fromFile(I), "other");
                        iz0Var2.x.h0();
                        org.telegram.ui.Components.js jsVar = iz0Var2.F;
                        if (jsVar != null) {
                            jsVar.s = iz0Var2.x;
                            jsVar.a();
                        }
                    }
                    wm wmVar = this.a;
                    wmVar.showDialog(wmVar.ta);
                    return false;
                }
                gi.l3 l3Var = iz0Var2.y;
                if (l3Var != null) {
                    viewGroup.removeView(l3Var);
                    iz0Var2.y = null;
                }
                org.telegram.messenger.zi ziVar3 = iz0Var2.N;
                boolean z10 = ziVar3 != null && ziVar3.Q3();
                org.telegram.messenger.zi ziVar4 = iz0Var2.N;
                if (ziVar4 != null && org.telegram.messenger.zi.B0(ziVar4.k) != org.telegram.messenger.h10.i(iz0Var2.N.I1).e()) {
                    gi.l3 l3Var2 = new gi.l3(context, 3);
                    iz0Var2.y = l3Var2;
                    l3Var2.r(true);
                    if (z10) {
                        long B0 = org.telegram.messenger.zi.B0(iz0Var2.N.k);
                        String str = "";
                        if (B0 > j10) {
                            TLRPC.User a22 = org.telegram.messenger.hp.s1(iz0Var2.N.I1).a2(Long.valueOf(B0));
                            if (a22 != null) {
                                str = org.telegram.messenger.l10.j(a22, true);
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(iz0Var2.N.I1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        iz0Var2.y.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, iz0Var2.T ? 2131743600 : 2131743524, str)));
                    } else {
                        iz0Var2.y.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(iz0Var2.T ? 2131743601 : 2131743525, null)));
                    }
                    iz0Var2.y.s(12.0f);
                    iz0Var2.y.setPadding(org.telegram.messenger.g0.L((z10 || iz0Var2.P.G) ? 0.0f : 6.0f), 0, 0, 0);
                    if (iz0Var2.T) {
                        iz0Var2.y.p(0.5f, 0.0f);
                        iz0Var2.y.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        iz0Var2.y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        iz0Var2.y.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    iz0Var2.y.v(14.0f);
                    gi.l3 l3Var3 = iz0Var2.y;
                    l3Var3.h = gi.l3.a(l3Var3.getText(), iz0Var2.y.getTextPaint());
                    if (iz0Var2.T) {
                        viewGroup.addView(iz0Var2.y, b8.mf.d((int) ((iz0Var2.P.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((iz0Var2.P.getHeight() + iz0Var2.L) / org.telegram.messenger.g0.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(iz0Var2.y, b8.mf.d((int) ((iz0Var2.P.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, ((((iz0Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + iz0Var2.P.getBoundsLeft()) / org.telegram.messenger.g0.p) + 1.0f, ((-75.0f) - ((iz0Var2.P.getHeight() / org.telegram.messenger.g0.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    iz0Var2.y.w();
                }
                TextView textView = iz0Var2.E;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    iz0Var2.E = null;
                }
                TextView textView2 = new TextView(context);
                iz0Var2.E = textView2;
                textView2.setTextColor(-1);
                iz0Var2.E.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    iz0Var2.E.setBackground(org.telegram.ui.ActionBar.k6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    iz0Var2.E.setBackground(org.telegram.ui.ActionBar.k6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                iz0Var2.E.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                b8.pf.a(iz0Var2.E);
                iz0Var2.E.setText(org.telegram.messenger.bd.M0(z10 ? 2131743529 : 2131743526, null));
                iz0Var2.E.setOnClickListener(new ez0(iz0Var2, 1));
                viewGroup.addView(iz0Var2.E, b8.mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (gz0Var = iz0Var2.O) != null && gz0Var.getMessageObject() != null && iz0Var2.O.getMessageObject().k != null) {
                    iz0Var2.O.getMessageObject().k.media_unread = false;
                    iz0Var2.O.invalidate();
                }
                wm wmVar2 = this.a;
                wmVar2.showDialog(wmVar2.ta);
                return false;
            }
        } else {
            if (org.telegram.messenger.zi.S4(ziVar.k) || ziVar.i4()) {
                boolean S = MediaController.B().S(ziVar);
                MediaController.B().r0(S ? this.a.g8(ziVar, false) : null, false);
                return S;
            }
            if (ziVar.J3()) {
                MediaController B = MediaController.B();
                ArrayList L = this.a.D0.L();
                wm wmVar3 = this.a;
                return B.o0(L, ziVar, wmVar3.c7, true ^ wmVar3.D0.O, null, wmVar3.w4 ? wmVar3.b() : 0L);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J(org.telegram.messenger.wi wiVar) {
        StaticLayout staticLayout = wiVar.e;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = wiVar.e.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new oi.h(wiVar.L, charSequence, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.camera.q.r(null, 2131752022, org.telegram.ui.Components.fc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean J0(long j10) {
        TLRPC.ChatFull N0;
        wm wmVar = this.a;
        TLRPC.Chat chat = wmVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
        long j11 = wmVar.e.id;
        if (j11 == j10) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j11));
        if (messagesController.getUserConfig().e() == j10 && M0 != null && M0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.y1.f(j11);
        if (hVar == null && (N0 = messagesController.N0(j11)) != null && N0.participants != null) {
            for (int i3 = 0; i3 < N0.participants.participants.size(); i3++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i3);
                if (chatParticipant.user_id == j10) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j10)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
        if (q1Var == null || document == null) {
            return;
        }
        wm wmVar = this.a;
        if (wmVar.getParentLayout() == null || !b0(q1Var)) {
            return;
        }
        boolean K3 = org.telegram.messenger.zi.K3(document);
        q1Var.setScrimBlockBounds(rectF);
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(wmVar, q1Var);
        H.c(R.drawable.msg_download, org.telegram.messenger.bd.M0(K3 ? 2131745921 : 2131745941, null), new p1(this, q1Var, document, 26), false);
        H.p = new tl(q1Var, rectF, 0);
        H.Z();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
        int i3;
        ai.r1 r1Var;
        org.telegram.messenger.ui uiVar;
        int i10;
        wm wmVar = this.a;
        xh.j jVar = wmVar.ra;
        if (jVar == null) {
            return;
        }
        HashMap hashMap = jVar.a;
        xh.h hVar = (xh.h) hashMap.get(xh.j.b(q1Var));
        org.telegram.ui.Components.ac acVar = null;
        org.telegram.messenger.zi ziVar = hVar != null ? hVar.F : null;
        xh.h hVar2 = (xh.h) wmVar.ra.a.get(xh.j.b(q1Var));
        long j10 = (hVar2 == null || (i10 = hVar2.S) == -1) ? 0L : hVar2.x[i10].d;
        if (ziVar != null && j10 != 0) {
            Activity parentActivity = wmVar.getParentActivity();
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            if (!org.telegram.ui.Components.t4.h(parentActivity, i3, j10, false)) {
                ArrayList arrayList = (ziVar.d1() == 0 || (uiVar = (org.telegram.messenger.ui) wmVar.O6.f(ziVar.d1())) == null) ? null : uiVar.d;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.k5.k(ziVar);
                }
                boolean z10 = j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n;
                long j11 = j10;
                ai.r1 r1Var2 = new ai.r1(this, arrayList, j11, 18);
                if (z10) {
                    r1Var2.run();
                    r1Var = null;
                } else {
                    r1Var = r1Var2;
                }
                acVar = org.telegram.ui.Components.fc.v(wmVar.getParentActivity(), wmVar, null, 1, j11, 1, wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.tj), wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.vj), 5000, false, r1Var);
                acVar.k = true;
                acVar.k(acVar.e instanceof org.telegram.ui.Components.lb);
            }
        }
        xh.h hVar3 = (xh.h) hashMap.get(xh.j.b(q1Var));
        if (hVar3 != null) {
            if (acVar == null) {
                hVar3.S = -1;
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.fb fbVar = acVar.e;
            if (!(fbVar instanceof org.telegram.ui.Components.ib)) {
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) fbVar;
            hVar3.X = ibVar;
            ibVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = hVar3.X.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new hw(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K1() {
        org.telegram.ui.ActionBar.e6 e6Var;
        wm wmVar = this.a;
        if (wmVar.m1 == null || wmVar.getParentActivity() == null) {
            return;
        }
        Context context = wmVar.m1.getContext();
        e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
        iy0.d1(context, wmVar, false, e6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        wm wmVar = this.a;
        wmVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, wmVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        di diVar;
        int i3;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        cg.l0 l0Var = null;
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
                        TLRPC.TL_message Q7 = wm.Q7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            Q7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            Q7.attachPath = message.attachPath;
                        }
                        Q7.media = tL_messageExtendedMedia.media;
                        Q7.noforwards = true;
                        arrayList.add(new org.telegram.messenger.zi(messageObject.I1, Q7, false, true));
                    }
                }
                if (i10 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer v12 = PhotoViewer.v1();
                wm wmVar = this.a;
                v12.N2(null, wmVar, wmVar.ya);
                PhotoViewer.v1().e2(arrayList, i10, this.a.a(), 0L, 0L, this.a.bb);
                return;
            }
            return;
        }
        wm wmVar2 = this.a;
        sf.b bVar = wmVar2.bc;
        if (bVar != null) {
            bVar.a(true);
            wmVar2.bc = null;
        }
        if (q1Var.getMessageObject() == null) {
            wmVar2.bc = null;
            diVar = null;
        } else {
            diVar = new di(wmVar2, q1Var.getMessageObject().f1(), q1Var, 1);
            wmVar2.bc = diVar;
        }
        i3 = ((org.telegram.ui.ActionBar.d2) this.a).currentAccount;
        ci.e9 y9 = ci.e9.y(i3, false);
        Objects.requireNonNull(diVar);
        xg xgVar = new xg(diVar, 8);
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.e6 I = ci.e9.I();
        if (messageObject != null && context != null) {
            long B0 = org.telegram.messenger.zi.B0(messageObject.k);
            int f12 = messageObject.f1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = org.telegram.messenger.hp.s1(y9.a).j1(B0);
            tL_inputInvoiceMessage.msg_id = f12;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ii.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            l0Var = new cg.l0(y9, ConnectionsManager.getInstance(y9.a).sendRequest(tL_payments_getPaymentForm, new ai.q1(y9, messageObject, tL_inputInvoiceMessage, xgVar, 3)), 1);
        }
        if (l0Var != null) {
            diVar.b = l0Var;
            diVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.j8(characterStyle, z10, q1Var.getMessageObject(), q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i3;
        int i10;
        org.telegram.messenger.ac b10;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        wm wmVar = this.a;
        if (!isEmpty) {
            sf.c.t(wmVar.getParentActivity(), "https://" + wmVar.getMessagesController().V2 + "/nft/" + str);
            return;
        }
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        vg.h1 h1Var = new vg.h1(wmVar, i3, user, null, null, wmVar.ya);
        q1Var.getLocationOnScreen(new int[2]);
        h1Var.o2 = q1Var.getNameStatusX();
        h1Var.p2 = q1Var.getNameStatusY();
        h1Var.s2 = q1Var.getScaleX();
        h1Var.q2 = q1Var.getLeft();
        h1Var.r2 = q1Var.getTop();
        h1Var.t2 = q1Var;
        int e10 = org.telegram.messenger.l10.e(user);
        if (e10 < 7) {
            h1Var.n2 = Integer.valueOf(wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.r8[e10]));
        } else {
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(i10).q4;
            org.telegram.messenger.wo d = xoVar != null ? xoVar.d(e10) : null;
            h1Var.n2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        org.telegram.ui.Components.e5 e5Var = q1Var.pa;
        if (e5Var != null && (e5Var.f[0] instanceof org.telegram.ui.Components.g5)) {
            h1Var.s2 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(wmVar.getParentActivity());
                org.telegram.messenger.jz d10 = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.ac.b(document);
                    if (d10 != null) {
                        d10.e = 512;
                        d10.f = 512;
                    }
                    str2 = "160_160_g";
                } else {
                    if (d10 != null && org.telegram.messenger.zi.L2(document, false)) {
                        d10.e = 512;
                        d10.f = 512;
                    }
                    b10 = org.telegram.messenger.ac.b(document);
                    str2 = "160_160";
                }
                org.telegram.messenger.ac acVar = b10;
                String str3 = str2;
                k9Var.setLayerNum(7);
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                k9Var.m(acVar, str3, org.telegram.messenger.ac.c(w10, document), "140_140", d10, document);
                if (org.telegram.messenger.zi.D4(document)) {
                    Integer num = h1Var.n2;
                    k9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.v6), PorterDuff.Mode.SRC_IN));
                    h1Var.v2 = org.telegram.messenger.zi.j1(document);
                } else {
                    h1Var.v2 = org.telegram.messenger.zi.j1(document);
                }
                h1Var.u2 = k9Var;
                h1Var.x2 = true;
            }
        }
        wmVar.showDialog(h1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P(org.telegram.messenger.zi ziVar) {
        if (org.telegram.messenger.zi.M4(ziVar.k)) {
            this.a.Hb(ziVar, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        org.telegram.messenger.zi messageObject;
        org.telegram.messenger.ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.zi) arrayList.get(0);
                if (messageObject != null) {
                    wm wmVar = this.a;
                    boolean z11 = !wmVar.Nc && messageObject.f1() == wmVar.Mc;
                    if (!z10) {
                        return z11;
                    }
                    if (z11 && System.currentTimeMillis() - wmVar.Oc > 1000) {
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

    /* JADX WARN: Code restructure failed: missing block: B:311:0x06b6, code lost:
    
        if (r7.paid_reactions_available != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x06bc, code lost:
    
        if (r4.isEmpty() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06ec, code lost:
    
        if (r7.paid_reactions_available != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0708, code lost:
    
        if (r4.isEmpty() != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06f6, code lost:
    
        if (org.telegram.messenger.t3.T(r5.e) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0702, code lost:
    
        if (org.telegram.messenger.t3.p0(r5.e) != false) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:245:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09d0 A[LOOP:3: B:254:0x09ce->B:255:0x09d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x096f  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        pr0 pr0Var;
        TLRPC.PollAnswer pollAnswer2;
        pr0 pr0Var2;
        lr0 lr0Var;
        lr0 lr0Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.f60 f60Var;
        pr0 pr0Var3;
        org.telegram.messenger.zi ziVar;
        wm wmVar;
        boolean z12;
        ArrayList arrayList;
        int size;
        int i3;
        ViewGroup viewGroup;
        pr0 pr0Var4;
        boolean z13;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z14;
        byte[] bArr;
        lr0 lr0Var3;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z15;
        pr0 pr0Var5;
        ArrayList arrayList2;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        String str;
        boolean z16;
        wm wmVar2;
        String str2;
        boolean z17;
        String str3;
        th.n nVar;
        String str4;
        boolean z18;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        wm wmVar3 = this.a;
        if (wmVar3.getParentActivity() != null && wmVar3.getParentActivity() != null) {
            gi.l3 l3Var = wmVar3.M1;
            if (l3Var != null && l3Var.W) {
                l3Var.f(true);
            }
            vk vkVar = wmVar3.Q1;
            if (vkVar != null && vkVar.W) {
                vkVar.f(true);
            }
            org.telegram.messenger.zi primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia n12 = org.telegram.messenger.zi.n1(primaryMessageObject);
            if (primaryMessageObject != null && (n12 instanceof TLRPC.TL_messageMediaPoll)) {
                wmVar3.u5 = primaryMessageObject;
                wmVar3.v5 = null;
                pr0 pr0Var6 = new pr0(wmVar3.getParentActivity(), wmVar3.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                pr0Var6.M = q1Var;
                pr0Var6.Q = bArr3;
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                pr0Var6.I = messageObject;
                pr0Var6.J = messageObject != null && messageObject.Q3();
                org.telegram.ui.Cells.q1 q1Var2 = pr0Var6.M;
                lr0 lr0Var4 = pr0Var6.d;
                if (q1Var2 != null) {
                    pr0Var6.N = wmVar3.M9 - org.telegram.messenger.g0.L(4.0f);
                    pr0Var6.O = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        pr0Var6.N = view.getY() + pr0Var6.N;
                        pr0Var6.O = view.getY() + pr0Var6.O;
                    }
                    int width = pr0Var6.M.getWidth();
                    int height = pr0Var6.M.getHeight();
                    pr0Var6.M.getHeight();
                    nr0 nr0Var = new nr0(pr0Var6, pr0Var6.getContext(), org.telegram.messenger.h10.t0, pr0Var6.M.getResourcesProvider(), bArr3, width, height);
                    pr0Var = pr0Var6;
                    pr0Var.K = nr0Var;
                    pr0Var.M.r0(nr0Var);
                    pr0Var.K.s0(pr0Var.M);
                    pr0Var.K.setDelegate(new kb.a(19));
                    nr0 nr0Var2 = pr0Var.K;
                    org.telegram.messenger.zi ziVar2 = pr0Var.I;
                    org.telegram.messenger.ui currentMessagesGroup = pr0Var.M.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = pr0Var.M;
                    nr0Var2.u3(ziVar2, currentMessagesGroup, q1Var3.G, q1Var3.F, q1Var3.H, false);
                    nr0 nr0Var3 = pr0Var.K;
                    nr0Var3.d6 = bArr3;
                    lr0Var4.addView(nr0Var3, new FrameLayout.LayoutParams(pr0Var.M.getWidth(), height, 51));
                    or0 or0Var = new or0(pr0Var.getContext(), org.telegram.messenger.h10.t0, pr0Var.M.getResourcesProvider(), width, height, 0);
                    pr0Var.L = or0Var;
                    pr0Var.M.t0(or0Var);
                    pr0Var.M.r0(pr0Var.L);
                    pr0Var.L.s0(pr0Var.M);
                    pr0Var.L.setDelegate(new v7.s(18));
                    or0 or0Var2 = pr0Var.L;
                    org.telegram.messenger.zi ziVar3 = pr0Var.I;
                    org.telegram.messenger.ui currentMessagesGroup2 = pr0Var.M.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = pr0Var.M;
                    or0Var2.u3(ziVar3, currentMessagesGroup2, q1Var4.G, q1Var4.F, q1Var4.H, false);
                    lr0Var4.addView(pr0Var.L, new FrameLayout.LayoutParams(pr0Var.M.getWidth(), height, 51));
                } else {
                    pr0Var = pr0Var6;
                }
                gi.g1 g1Var = pr0Var.f;
                g1Var.bringToFront();
                lr0 lr0Var5 = pr0Var.e;
                lr0Var5.bringToFront();
                pr0Var.n.bringToFront();
                g1Var.u(false);
                Context context = pr0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.e6 e6Var = pr0Var.b;
                org.telegram.ui.Components.f60 G = org.telegram.ui.Components.f60.G(lr0Var4, e6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.zi.n1(pr0Var.I);
                pr0Var.W = org.telegram.messenger.zi.X4(tL_messageMediaPoll3);
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_messageMediaPoll3.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll3.poll.answers.get(i10).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll3.poll.answers.get(i10);
                        break;
                    }
                    i10++;
                }
                eh.c cVar = pr0Var.H;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll3.poll;
                    boolean z19 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z20 = poll.multiple_choice;
                    ArrayList arrayList4 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll3.results;
                    if (pollResults == null || (arrayList3 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        z14 = z20;
                        bArr = bArr3;
                        lr0Var3 = lr0Var4;
                        pollAnswerVoters = null;
                        z15 = false;
                    } else {
                        int size2 = arrayList3.size();
                        z14 = z20;
                        int i11 = 0;
                        z15 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i11 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList3.get(i11);
                            int i12 = i11 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            lr0 lr0Var6 = lr0Var4;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z15 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList5 = tL_messageMediaPoll3.poll.answers;
                                int size3 = arrayList5.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = tL_messageMediaPoll3;
                                int i13 = 0;
                                while (i13 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList5.get(i13);
                                    int i14 = i13 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList6 = arrayList5;
                                    int i15 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList4.add(pollAnswer5);
                                    }
                                    arrayList5 = arrayList6;
                                    i13 = i14;
                                    size3 = i15;
                                }
                                lr0Var4 = lr0Var6;
                                i11 = i12;
                                bArr3 = bArr4;
                                tL_messageMediaPoll3 = tL_messageMediaPoll4;
                            } else {
                                lr0Var4 = lr0Var6;
                                i11 = i12;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll3;
                        bArr = bArr3;
                        lr0Var3 = lr0Var4;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !org.telegram.messenger.zi.A(tL_messageMediaPoll)) {
                        pr0Var5 = pr0Var;
                        arrayList2 = arrayList4;
                        lr0Var = lr0Var3;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        th.n nVar2 = new th.n(wmVar3.getCurrentAccount(), context, e6Var);
                        org.telegram.ui.Components.f60 J = G.J();
                        J.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                        hh.a k10 = b8.cd.k(e6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            nVar = nVar2;
                            str4 = null;
                            z18 = false;
                            gh.g c2 = cVar.c(view3, null, false);
                            c2.p(k10);
                            view3.setBackground(c2);
                        } else {
                            nVar = nVar2;
                            str4 = null;
                            z18 = false;
                        }
                        J.c(R.drawable.ic_ab_back, org.telegram.messenger.bd.M0(2131753756, str4), new xp0(G, 27), z18);
                        J.k();
                        long B0 = org.telegram.messenger.zi.B0(pr0Var.I.k);
                        int f12 = pr0Var.I.f1();
                        int i16 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.ei eiVar = new org.telegram.ui.Components.ei(22, pr0Var, wmVar3);
                        pr0Var5 = pr0Var;
                        arrayList2 = arrayList4;
                        lr0Var = lr0Var3;
                        th.n nVar3 = nVar;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        byte[] bArr5 = bArr;
                        View a10 = nVar3.a(wmVar3, B0, f12, bArr5, i16, eiVar);
                        wmVar3 = wmVar3;
                        bArr2 = bArr5;
                        J.q(a10);
                        nVar3.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
                        nVar3.setText(org.telegram.messenger.bd.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        nVar3.a.d(pollAnswerVoters.recent_voters, false);
                        nVar3.setLayoutParams(b8.mf.o(-1, 48));
                        int i17 = org.telegram.ui.ActionBar.k6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 12, 0);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
                        nVar3.setBackground(a02);
                        org.telegram.ui.ActionBar.r6.k(nVar3, a02, null, N, null);
                        nVar3.setOnClickListener(new hb0(9, G, J));
                        G.q(nVar3);
                        G.k();
                    }
                    if (!z19) {
                        pollAnswer3 = pollAnswer2;
                        pr0Var2 = pr0Var5;
                        str = null;
                        z16 = false;
                    } else if (z15) {
                        str = null;
                        CharSequence M0 = org.telegram.messenger.bd.M0(2131743834, null);
                        wm wmVar4 = wmVar3;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        pr0Var2 = pr0Var5;
                        Runnable ir0Var = new ir0(pr0Var2, z14, wmVar4, arrayList2, pollAnswer6);
                        wmVar3 = wmVar4;
                        pollAnswer3 = pollAnswer6;
                        z16 = false;
                        G.c(R.drawable.msg_unvote, M0, ir0Var, false);
                    } else {
                        pollAnswer3 = pollAnswer2;
                        pr0Var2 = pr0Var5;
                        ArrayList arrayList7 = arrayList2;
                        str = null;
                        z16 = false;
                        if (th.g.a(pr0Var2.I) == 0) {
                            G.c(R.drawable.msg_select, org.telegram.messenger.bd.M0(2131747164, null), new ir0(pr0Var2, z14, pollAnswer3, wmVar3, arrayList7), false);
                        }
                    }
                    if (wmVar3.S6()) {
                        G.c(R.drawable.menu_reply, org.telegram.messenger.bd.M0(2131747178, str), new hc0(pr0Var2, wmVar3, pollAnswer3, 24), z16);
                    }
                    if (org.telegram.messenger.zi.B0(pr0Var2.I.k) >= 0 || pollAnswer3.option == null) {
                        wmVar2 = wmVar3;
                        str2 = null;
                        z17 = false;
                    } else {
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(pr0Var2.I.I1);
                        wmVar2 = wmVar3;
                        String r5 = org.telegram.messenger.m5.r(s12.e2(org.telegram.messenger.zi.B0(pr0Var2.I.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(s12.V2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r5)) {
                            StringBuilder sb3 = new StringBuilder("c/");
                            str3 = "/";
                            sb3.append(-org.telegram.messenger.zi.B0(pr0Var2.I.k));
                            r5 = sb3.toString();
                        } else {
                            str3 = "/";
                        }
                        sb2.append(r5);
                        sb2.append(str3);
                        sb2.append(pr0Var2.I.f1());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        str2 = null;
                        z17 = false;
                        G.c(R.drawable.msg_link, org.telegram.messenger.bd.M0(2131751762, null), new hk0(12, pr0Var2, sb2.toString()), false);
                    }
                    G.c(R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131751767, str2), new hk0(13, pr0Var2, pollAnswer3), z17);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long o10 = org.telegram.messenger.m5.o(peer);
                        long e10 = org.telegram.messenger.h10.i(pr0Var2.I.I1).e();
                        long currentTime = ConnectionsManager.getInstance(pr0Var2.I.I1).getCurrentTime();
                        long g22 = org.telegram.messenger.hp.s1(pr0Var2.I.I1).x7.K.g2(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!org.telegram.messenger.zi.m3(pr0Var2.I.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll2.poll;
                            if (!poll2.closed && (poll2.creator || (o10 == e10 && currentTime < g22))) {
                                G.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, null), new hk0(14, pr0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject e22 = org.telegram.messenger.hp.s1(pr0Var2.I.I1).e2(o10);
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131747189, org.telegram.messenger.m5.u(e22), org.telegram.messenger.bd.x(pollAnswer3.date, true)));
                        wmVar3 = wmVar2;
                        z70 z70Var = new z70(pr0Var2, o10, wmVar3, 2);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i18 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.ActionBar.e6 e6Var2 = G.d;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i18, e6Var2), 0, 12);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
                        frameLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, a03, null, N2, e6Var2);
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
                        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                        u8Var.l(e22);
                        k9Var.e(e22, u8Var);
                        frameLayout.addView(k9Var, b8.mf.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(W2);
                        textView.setMaxWidth(org.telegram.messenger.g0.L(150.0f));
                        textView.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.q2(21, G, z70Var));
                        G.r(frameLayout, b8.mf.o(-1, -2));
                    } else {
                        wmVar3 = wmVar2;
                    }
                } else {
                    pr0Var2 = pr0Var;
                    lr0Var = lr0Var4;
                }
                G.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                G.Q(cVar, b8.cd.k(e6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                pr0Var2.S = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                pr0Var2.S.setPivotY(0.0f);
                lr0Var5.addView(pr0Var2.S, b8.mf.e(-2, -2, 51));
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                wmVar3.E8(primaryMessageObject, arrayList8, arrayList9, arrayList10);
                le leVar = new le(wmVar3, 9);
                org.telegram.messenger.zi ziVar4 = pr0Var2.I;
                ArrayList arrayList11 = wmVar3.getMediaDataController().n;
                boolean z21 = (wmVar3.z() || wmVar3.c() || wmVar3.f != null || !ziVar4.x2() || (org.telegram.messenger.t3.T(wmVar3.e) && !wmVar3.e.megagroup) || org.telegram.messenger.t3.p0(wmVar3.e) || arrayList11.isEmpty() || !ziVar4.k.reactions.can_see_list || ziVar4.m4()) ? false : true;
                if (ziVar4.l3()) {
                    lr0Var2 = lr0Var5;
                    TLRPC.ChatFull N0 = wmVar3.getMessagesController().N0(-ziVar4.Z0());
                    if (N0 != null) {
                        if (!wmVar3.z()) {
                            if (wmVar3.g4 != 5) {
                                if (!wmVar3.c()) {
                                    if (ziVar4.e4()) {
                                        if (N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                        }
                                    }
                                }
                            }
                        }
                        z10 = false;
                    }
                    z10 = true;
                } else {
                    lr0Var2 = lr0Var5;
                    if (!ziVar4.m4()) {
                        if (wmVar3.g4 != 5) {
                            if (!wmVar3.z()) {
                                if (!wmVar3.c()) {
                                    if (ziVar4.e4()) {
                                        TLRPC.ChatFull chatFull2 = wmVar3.q8;
                                        if (chatFull2 != null) {
                                            if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                            }
                                        }
                                        if (chatFull2 == null) {
                                        }
                                        if (wmVar3.f == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                boolean z22 = z10;
                boolean z23 = (z21 || wmVar3.c() || wmVar3.e == null || !ziVar4.Q3() || !ziVar4.r4() || ziVar4.Z2() || ziVar4.p4() || ziVar4.o4() || ziVar4.k.media_unread || ziVar4.G4() || ConnectionsManager.getInstance(wmVar3.getCurrentAccount()).getCurrentTime() - ziVar4.k.date >= wmVar3.getMessagesController().r3 || (!org.telegram.messenger.t3.n0(wmVar3.e) && org.telegram.messenger.t3.T(wmVar3.e)) || (chatFull = wmVar3.q8) == null || chatFull.participants_count > wmVar3.getMessagesController().q3 || (ziVar4.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || wmVar3.g4 == 3 || !ziVar4.z() || org.telegram.messenger.t3.p0(wmVar3.e)) ? false : true;
                if (wmVar3.e != null && !ziVar4.O3() && org.telegram.messenger.t3.p0(wmVar3.e)) {
                    if (org.telegram.messenger.t3.A(wmVar3.getCurrentAccount(), wmVar3.e, 24)) {
                        int i19 = ((-wmVar3.e.linked_monoforum_id) > ziVar4.Z0() ? 1 : ((-wmVar3.e.linked_monoforum_id) == ziVar4.Z0() ? 0 : -1));
                    }
                }
                if (!z21 && wmVar3.e == null && wmVar3.h == null && (user = wmVar3.f) != null && !org.telegram.messenger.l10.B(user) && !org.telegram.messenger.l10.z(wmVar3.f) && !org.telegram.messenger.l10.s(wmVar3.f)) {
                    TLRPC.User user2 = wmVar3.f;
                    if (!user2.bot && !org.telegram.messenger.l10.A(user2.id) && (((userFull = wmVar3.r8) == null || !userFull.read_dates_private) && !wmVar3.c() && ziVar4.Q3() && ziVar4.r4() && !ziVar4.Z2() && !ziVar4.p4() && !ziVar4.o4() && !ziVar4.k.media_unread && !ziVar4.G4() && wmVar3.getConnectionsManager().getCurrentTime() - ziVar4.k.date < wmVar3.getMessagesController().s3 && !(ziVar4.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z11 = true;
                        TLRPC.User user3 = wmVar3.f;
                        boolean z24 = ((user3 == null && (org.telegram.messenger.l10.z(user3) || org.telegram.messenger.l10.s(wmVar3.f))) || wmVar3.c() || !ziVar4.Y2() || (ziVar4.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        org.telegram.ui.Components.f60 G2 = org.telegram.ui.Components.f60.G(lr0Var, wmVar3.getResourceProvider(), null, !z21 || z23);
                        if (z23) {
                            pr0 pr0Var7 = pr0Var2;
                            f60Var = G2;
                            pr0Var3 = pr0Var7;
                            ziVar = ziVar4;
                            wmVar = wmVar3;
                            z12 = z22;
                            arrayList = arrayList10;
                            if (z11) {
                                f60Var.r(new org.telegram.ui.Components.ia0(pr0Var3.getContext(), 0, ziVar, new gr0(pr0Var3, 1), pr0Var3.b), b8.mf.o(-1, 36));
                                f60Var.k();
                            } else if (z24) {
                                f60Var.r(new org.telegram.ui.Components.ia0(pr0Var3.getContext(), 1, ziVar, new gr0(pr0Var3, 2), pr0Var3.b), b8.mf.o(-1, 36));
                                f60Var.k();
                            }
                        } else {
                            df0 df0Var = new df0(pr0Var2.getContext(), wmVar3.getCurrentAccount(), ziVar4, wmVar3.e);
                            FrameLayout frameLayout2 = new FrameLayout(pr0Var2.getContext());
                            frameLayout2.addView(df0Var, b8.mf.c(36.0f, -1));
                            org.telegram.ui.Components.f60 J2 = G2.J();
                            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, pr0Var2.getContext(), pr0Var2.b, true, false);
                            y0Var.setItemHeight(44);
                            pr0 pr0Var8 = pr0Var2;
                            y0Var.j(org.telegram.messenger.bd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                            ziVar = ziVar4;
                            y0Var.getTextView().setPadding(org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(pr0Var8.getContext());
                            LinearLayout linearLayout = new LinearLayout(pr0Var8.getContext());
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, linearLayout, e6Var);
                            linearLayout.setOrientation(1);
                            wm wmVar5 = wmVar3;
                            org.telegram.ui.Components.tj0 a11 = df0Var.a();
                            frameLayout3.addView(y0Var);
                            linearLayout.addView(frameLayout3);
                            z12 = z22;
                            linearLayout.addView(new org.telegram.ui.ActionBar.c1(pr0Var8.getContext(), e6Var), b8.mf.o(-1, 8));
                            frameLayout3.setOnClickListener(new jr0(G2, 0));
                            arrayList = arrayList10;
                            kr0 kr0Var = new kr0(pr0Var8, df0Var, wmVar5, a11, linearLayout, G2, J2);
                            wmVar = wmVar5;
                            pr0Var3 = pr0Var8;
                            f60Var = G2;
                            df0Var.setOnClickListener(kr0Var);
                            linearLayout.addView(a11, b8.mf.o(-1, -2));
                            J2.q(linearLayout);
                            f60Var.q(frameLayout2);
                            f60Var.k();
                        }
                        size = arrayList8.size();
                        for (i3 = 0; i3 < size; i3++) {
                            f60Var.c(((Integer) arrayList8.get(i3)).intValue(), (CharSequence) arrayList9.get(i3), new rw(pr0Var3, leVar, ((Integer) arrayList.get(i3)).intValue(), 8), false);
                        }
                        f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                        f60Var.Q(cVar, b8.cd.k(e6Var), false);
                        f60Var.Y();
                        ViewGroup viewGroup3 = f60Var.A;
                        pr0Var3.U = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        pr0Var3.U.setPivotY(0.0f);
                        ViewGroup viewGroup4 = lr0Var2;
                        viewGroup4.addView(pr0Var3.U, b8.mf.e(-2, -2, 51));
                        viewGroup = pr0Var3.U;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ci0(pr0Var3, 6));
                            pr0Var3.U.setOnTouchListener(new e0(pr0Var3, 5));
                        }
                        if (z12) {
                            pr0Var4 = pr0Var3;
                            z13 = true;
                        } else {
                            pr0 pr0Var9 = pr0Var3;
                            wm wmVar6 = wmVar;
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0((wmVar.getUserConfig().e() > wmVar.a() ? 1 : (wmVar.getUserConfig().e() == wmVar.a() ? 0 : -1)) == 0 ? 3 : 0, wmVar.getCurrentAccount(), pr0Var3.getContext(), wmVar6, pr0Var3.b);
                            li0Var.a = true;
                            float f10 = 22;
                            li0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.bd.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.bd.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                            pr0Var4 = pr0Var9;
                            org.telegram.messenger.zi ziVar5 = ziVar;
                            li0Var.setDelegate(new ui.f(pr0Var4, wmVar6, ziVar5, li0Var, 10));
                            pr0Var4.R = li0Var;
                            viewGroup4.addView(li0Var, b8.mf.e(-2, (int) ((li0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                            z13 = true;
                            li0Var.p(ziVar5, wmVar6.q8, true);
                            pr0Var4.R.setTransitionProgress(1.0f);
                        }
                        pr0Var4.e();
                        pr0Var4.f0 = new pl(this, 0);
                        pr0Var4.show();
                        return z13;
                    }
                }
                z11 = false;
                TLRPC.User user32 = wmVar3.f;
                if (user32 == null) {
                }
                org.telegram.ui.Components.f60 G22 = org.telegram.ui.Components.f60.G(lr0Var, wmVar3.getResourceProvider(), null, !z21 || z23);
                if (z23) {
                }
                size = arrayList8.size();
                while (i3 < size) {
                }
                f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                f60Var.Q(cVar, b8.cd.k(e6Var), false);
                f60Var.Y();
                ViewGroup viewGroup32 = f60Var.A;
                pr0Var3.U = viewGroup32;
                viewGroup32.setPivotX(0.0f);
                pr0Var3.U.setPivotY(0.0f);
                ViewGroup viewGroup42 = lr0Var2;
                viewGroup42.addView(pr0Var3.U, b8.mf.e(-2, -2, 51));
                viewGroup = pr0Var3.U;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z12) {
                }
                pr0Var4.e();
                pr0Var4.f0 = new pl(this, 0);
                pr0Var4.show();
                return z13;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        int i3;
        int i10;
        boolean m32 = org.telegram.messenger.zi.m3(q1Var.getMessageObject().k);
        wm wmVar = this.a;
        if (m32) {
            long o10 = org.telegram.messenger.m5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar);
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            a02.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744097, org.telegram.messenger.m5.l(i10, o10)))).k(true);
            return false;
        }
        if (!q1Var.getMessageObject().q()) {
            long o11 = org.telegram.messenger.m5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(wmVar);
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            a03.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744098, org.telegram.messenger.m5.l(i3, o11)))).k(true);
            return false;
        }
        if (!wmVar.getUserConfig().q()) {
            org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131744074, null), new pl(this, 9))).k(true);
            return false;
        }
        final long M = org.telegram.messenger.t3.M(wmVar.e, wmVar.q8, true);
        final org.telegram.messenger.yy sendMessagesHelper = wmVar.getSendMessagesHelper();
        final org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.zi.B0(messageObject.k)), Integer.valueOf(messageObject.f1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z10));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.f1();
        tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().j1(org.telegram.messenger.zi.B0(messageObject.k));
        if (z10) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: org.telegram.messenger.iy
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                yy yyVar = yy.this;
                final boolean z11 = z10;
                if (tL_error == null) {
                    final qr messagesStorage = yyVar.getMessagesStorage();
                    zi ziVar = messageObject;
                    final long B0 = zi.B0(ziVar.k);
                    final int f12 = ziVar.f1();
                    final int i11 = todoItem.id;
                    final long e10 = messagesStorage.getUserConfig().e();
                    final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                    p5 p5Var = messagesStorage.a;
                    final long j10 = M;
                    p5Var.c(new Runnable() { // from class: org.telegram.messenger.xq
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
                            long j11;
                            String str;
                            SQLiteCursor sQLiteCursor;
                            SQLitePreparedStatement sQLitePreparedStatement2;
                            SQLiteCursor queryFinalized;
                            NativeByteBuffer byteBufferValue;
                            TLRPC.MessageMedia messageMedia;
                            NativeByteBuffer byteBufferValue2;
                            qr qrVar = qr.this;
                            long j12 = B0;
                            int i12 = f12;
                            long j13 = e10;
                            long j14 = j10;
                            int i13 = i11;
                            boolean z12 = z11;
                            int i14 = currentTime;
                            SQLiteCursor sQLiteCursor2 = null;
                            try {
                                try {
                                    try {
                                        sQLiteCursor = qrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j12 + " AND mid = " + i12, new Object[0]);
                                    } catch (Exception e11) {
                                        e = e11;
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j11 = j13;
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
                                            if (qrVar.u0(5, j12)) {
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
                                    j11 = j13;
                                    str = "SELECT data FROM messages_topics WHERE uid = ";
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = null;
                            }
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue2 = sQLiteCursor.byteBufferValue(0)) == null) {
                                    str = "SELECT data FROM messages_topics WHERE uid = ";
                                    j11 = j13;
                                } else {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                    TLdeserialize.readAttachPath(byteBufferValue2, j13);
                                    byteBufferValue2.reuse();
                                    sQLiteCursor.dispose();
                                    TLRPC.MessageMedia messageMedia2 = TLdeserialize.media;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j11 = j13;
                                        try {
                                            zi.a6(qrVar.currentAccount, j14, (TLRPC.TL_messageMediaToDo) messageMedia2, i13, z12, i14);
                                            sQLitePreparedStatement = qrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e13) {
                                            e = e13;
                                            sQLitePreparedStatement = null;
                                            sQLiteCursor = null;
                                            a8.g(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (qrVar.u0(5, j12)) {
                                            }
                                        }
                                        try {
                                            sQLitePreparedStatement.requery();
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                            zi.r5(TLdeserialize);
                                            TLdeserialize.serializeToStream(nativeByteBuffer);
                                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                            sQLitePreparedStatement.bindInteger(2, i12);
                                            sQLitePreparedStatement.bindLong(3, j12);
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
                                            if (qrVar.u0(5, j12)) {
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
                                        j11 = j13;
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
                                j11 = j13;
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
                            if (qrVar.u0(5, j12)) {
                                return;
                            }
                            try {
                                queryFinalized = qrVar.b.queryFinalized(str + j12 + " AND mid = " + i12, new Object[0]);
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
                                    TLdeserialize2.readAttachPath(byteBufferValue, j11);
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
                                    zi.a6(qrVar.currentAccount, j14, (TLRPC.TL_messageMediaToDo) messageMedia, i13, z12, i14);
                                    queryFinalized.dispose();
                                    try {
                                        try {
                                            SQLitePreparedStatement executeFast = qrVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                            try {
                                                executeFast.requery();
                                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                                TLdeserialize2.serializeToStream(nativeByteBuffer2);
                                                executeFast.bindByteBuffer(1, nativeByteBuffer2);
                                                executeFast.bindInteger(2, i12);
                                                executeFast.bindLong(3, j12);
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
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                g0.h3(new ci.c8(yyVar, hash, z11, 3));
            }
        });
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q0(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar = this.a;
        wmVar.getNotificationCenter().k(org.telegram.messenger.hs.n3, Long.valueOf(wmVar.k6), q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.g10 g10Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            g10Var.run();
            return;
        }
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject == null || ((messageObject.p4() && !messageObject.Z2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            g10Var.run();
        } else {
            org.telegram.ui.ActionBar.d2 d2Var = this.a;
            d2Var.getSendMessagesHelper().v(messageObject, messageObject.k.rich_message, null, d2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R() {
        wm wmVar = this.a;
        return wmVar.n6[1].size() + wmVar.n6[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        int i3;
        org.telegram.messenger.zi messageObject;
        TLRPC.Message message;
        if (q1Var == null) {
            return false;
        }
        wm wmVar = this.a;
        if (wmVar.getParentActivity() == null) {
            return false;
        }
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        if (!org.telegram.messenger.hp.s1(i3).s4() || (messageObject = q1Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.J2 || message.translatedRichMessage == null) {
            return messageObject.u(wmVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String N0 = org.telegram.messenger.bd.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(N0)) {
            N0 = org.telegram.messenger.bd.M0(2131746602, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        org.telegram.messenger.zi.d(spannableStringBuilder, false);
        org.telegram.messenger.ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        wm wmVar = this.a;
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.e;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if ((((org.telegram.messenger.ri) arrayList.get(i3)).l & 1) != 0) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) currentMessagesGroup.d.get(i3);
                    if (ziVar != messageObject) {
                        int childCount = wmVar.A0.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = wmVar.A0.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                if (ziVar.T(q1Var2.getMessageObject())) {
                                    q1Var = q1Var2;
                                }
                            }
                        }
                        messageObject = ziVar;
                    }
                } else {
                    i3++;
                }
            }
        }
        wmVar.mc(messageObject, spannableStringBuilder, 1);
        q1Var.E3(1, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final vq0 S1() {
        return this.a.Qa;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean T() {
        wm wmVar = this.a;
        return org.telegram.messenger.l10.z(wmVar.f) || org.telegram.messenger.l10.B(wmVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.zi messageObject;
        if (chat == null) {
            return;
        }
        wm wmVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar.v() || wmVar.W9()) {
            wm.j2(wmVar, q1Var, true, f10, f11);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = q1Var.getMessageObject()) == null || org.telegram.messenger.zi.B0(messageObject.k) == 1271266957) {
            k(q1Var, chat, i3, z10);
        } else {
            wmVar.Na(org.telegram.messenger.m5.o(messageObject.k.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new oi.h(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.camera.q.r(null, 2131752022, org.telegram.ui.Components.fc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
        f(q1Var, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V1(long j10) {
        TLRPC.ChatFull N0;
        wm wmVar = this.a;
        TLRPC.Chat chat = wmVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
        long j11 = wmVar.e.id;
        if (j11 == j10) {
            messagesController.getClass();
            return true;
        }
        a0.h hVar = (a0.h) messagesController.y1.f(j11);
        if (hVar == null && (N0 = messagesController.N0(j11)) != null && N0.participants != null) {
            for (int i3 = 0; i3 < N0.participants.participants.size(); i3++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i3);
                if (chatParticipant.user_id == j10) {
                    return (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                }
            }
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j10);
        if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0103, code lost:
    
        if (org.telegram.messenger.m5.o(r5) != r8.k6) goto L66;
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
    public final void W1(org.telegram.ui.Cells.q1 q1Var, int i3, float f10, float f11, boolean z10) {
        Integer num;
        String str;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str2;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        byte[] bArr2;
        TLRPC.Message message;
        String str3;
        long j10;
        boolean z11;
        TLRPC.Chat M0;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        TLRPC.Chat M02;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        org.telegram.messenger.zi ziVar;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean c2 = c();
        wm wmVar = this.a;
        if (!c2 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if ((kVar.v() || wmVar.W9()) && !wmVar.r9.z(q1Var.getMessageObject())) {
                wm.j2(wmVar, q1Var, !q1Var.A2(f10), f10, f11);
                return;
            }
            return;
        }
        if (org.telegram.messenger.l10.z(wmVar.f)) {
            s(q1Var);
            return;
        }
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        if (messageObject.g4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.k5.o(null, 2131744616, org.telegram.ui.Components.fc.a0(wmVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = org.telegram.messenger.m5.o(message3.reply_to.peer);
            storyItem.messageId = messageObject.f1();
            storyItem.messageType = 3;
            ei.s7.b(storyItem, wmVar.f);
            wmVar.getOrCreateStoryViewer().T(wmVar.getParentActivity(), storyItem, ei.i7.a(wmVar.A0));
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
            long j11 = wmVar.k6;
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
                                j11 = org.telegram.messenger.m5.o(peer2);
                            }
                            j10 = Long.MAX_VALUE;
                        } else {
                            TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                            if (peer3 != null) {
                                j11 = org.telegram.messenger.m5.o(peer3);
                            }
                            j10 = Long.MAX_VALUE;
                        }
                    }
                } else {
                    if (!(peer instanceof TLRPC.TL_peerUser)) {
                        long o10 = org.telegram.messenger.m5.o(peer);
                        z11 = true;
                        j10 = o10;
                        str3 = str2;
                        M0 = j10 >= 0 ? wmVar.getMessagesController().M0(Long.valueOf(-j10)) : null;
                        if (j10 != Long.MAX_VALUE) {
                            boolean z12 = z11;
                            if (j10 == wmVar.k6 || M0 == null || org.telegram.messenger.t3.t0(M0) || (!M0.left && !M0.kicked)) {
                                if (((j10 == wmVar.k6 && (!org.telegram.messenger.t3.c0(wmVar.e) || !z12)) || j10 == Long.MAX_VALUE) && (wmVar.g4 != 3 || ((ziVar = messageObject.C) != null && ziVar.Q1() == wmVar.b()))) {
                                    int i10 = wmVar.g4;
                                    if (i10 == 2 || i10 == 1) {
                                        wmVar.k9.T0(i3);
                                        wmVar.finishFragment();
                                        return;
                                    }
                                    if (bArr != 0) {
                                        wmVar.i8 = bArr;
                                    } else if (num != null) {
                                        wmVar.h8 = num;
                                    } else {
                                        TLRPC.Message message5 = messageObject.k;
                                        if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                            wmVar.e8 = true;
                                            wmVar.g8 = messageReplyHeader5.quote_text;
                                            wmVar.j8 = r9;
                                            wmVar.d8 = true;
                                        }
                                    }
                                    ai.p1 p1Var = new ai.p1(this, i3, messageObject, num, bArr, 14);
                                    if (!wmVar.D0.O) {
                                        p1Var.run();
                                        return;
                                    }
                                    wmVar.G3 = false;
                                    wmVar.Nb(false, true, false);
                                    wmVar.jd(wmVar.getMediaDataController().c0(), wmVar.getMediaDataController().f1, wmVar.getMediaDataController().j0());
                                    org.telegram.messenger.g0.i3(p1Var, 80L);
                                    return;
                                }
                                Integer num2 = num;
                                byte[] bArr3 = bArr;
                                if (LaunchActivity.K1 != null) {
                                    sf.b bVar = wmVar.bc;
                                    if (bVar != null) {
                                        bVar.a(false);
                                        wmVar.bc = null;
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    final k0 k0Var = new k0(this, messageObject, q1Var);
                                    wmVar.bc = k0Var;
                                    int f12 = messageObject.f1();
                                    ArrayList arrayList = launchActivity.e0;
                                    if (j10 < 0 && (M02 = org.telegram.messenger.hp.s1(launchActivity.P).M0(Long.valueOf(-j10))) != null && org.telegram.messenger.t3.c0(M02)) {
                                        k0Var.d();
                                        final int i11 = 0;
                                        launchActivity.l0(j10, Integer.valueOf(i3), str3, num2, bArr3, new Runnable() { // from class: org.telegram.ui.w60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i12 = i11;
                                                k0 k0Var2 = k0Var;
                                                switch (i12) {
                                                    case 0:
                                                        String str5 = LaunchActivity.E1;
                                                        k0Var2.c(false);
                                                        break;
                                                    default:
                                                        String str6 = LaunchActivity.E1;
                                                        k0Var2.c(false);
                                                        break;
                                                }
                                            }
                                        }, f12, r9);
                                        return;
                                    }
                                    String str5 = str3;
                                    int i12 = r9;
                                    k0Var.d();
                                    Bundle bundle = new Bundle();
                                    if (j10 >= 0) {
                                        bundle.putLong("user_id", j10);
                                    } else {
                                        long j12 = -j10;
                                        TLRPC.Chat M03 = org.telegram.messenger.hp.s1(launchActivity.P).M0(Long.valueOf(j12));
                                        if (M03 != null && M03.forum) {
                                            final int i13 = 1;
                                            launchActivity.l0(j10, Integer.valueOf(i3), str5, num2, bArr3, new Runnable() { // from class: org.telegram.ui.w60
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i122 = i13;
                                                    k0 k0Var2 = k0Var;
                                                    switch (i122) {
                                                        case 0:
                                                            String str52 = LaunchActivity.E1;
                                                            k0Var2.c(false);
                                                            break;
                                                        default:
                                                            String str6 = LaunchActivity.E1;
                                                            k0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, f12, i12);
                                            return;
                                        }
                                        bundle.putLong("chat_id", j12);
                                    }
                                    bundle.putInt("message_id", i3);
                                    org.telegram.ui.ActionBar.d2 d2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList) : null;
                                    if (d2Var == null || org.telegram.messenger.hp.s1(launchActivity.P).E(bundle, d2Var, null, null)) {
                                        org.telegram.messenger.g0.h3(new v60(launchActivity, bundle, bArr3, i3, num2, str5, i12, j10, k0Var, d2Var));
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
                            org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.error, 36, org.telegram.messenger.bd.M0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746440 : 2131746441 : 2131746439 : (M0 == null && M0.megagroup) ? 2131746266 : !org.telegram.messenger.t3.T(M0) ? 2131746267 : 2131746268, null)).k(true);
                        } else {
                            messageObject.b1 = true;
                            wmVar.Uc(messageObject, true);
                            return;
                        }
                    }
                    str3 = str2;
                }
                z11 = false;
                if (j10 >= 0) {
                }
                if (j10 != Long.MAX_VALUE) {
                }
                message2 = messageObject.k;
                if (message2 != null) {
                }
                TLRPC.Message message62 = messageObject.k;
                org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.error, 36, org.telegram.messenger.bd.M0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746440 : 2131746441 : 2131746439 : (M0 == null && M0.megagroup) ? 2131746266 : !org.telegram.messenger.t3.T(M0) ? 2131746267 : 2131746268, null)).k(true);
            }
            str3 = str2;
            j10 = j11;
            z11 = false;
            if (j10 >= 0) {
            }
            if (j10 != Long.MAX_VALUE) {
            }
            message2 = messageObject.k;
            if (message2 != null) {
            }
            TLRPC.Message message622 = messageObject.k;
            org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.error, 36, org.telegram.messenger.bd.M0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746440 : 2131746441 : 2131746439 : (M0 == null && M0.megagroup) ? 2131746266 : !org.telegram.messenger.t3.T(M0) ? 2131746267 : 2131746268, null)).k(true);
        }
        num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        str = null;
        str2 = str;
        bArr = str;
        long j112 = wmVar.k6;
        message = messageObject.k;
        if (message == null) {
        }
        str3 = str2;
        j10 = j112;
        z11 = false;
        if (j10 >= 0) {
        }
        if (j10 != Long.MAX_VALUE) {
        }
        message2 = messageObject.k;
        if (message2 != null) {
        }
        TLRPC.Message message6222 = messageObject.k;
        org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.error, 36, org.telegram.messenger.bd.M0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746440 : 2131746441 : 2131746439 : (M0 == null && M0.megagroup) ? 2131746266 : !org.telegram.messenger.t3.T(M0) ? 2131746267 : 2131746268, null)).k(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final int X() {
        return this.a.g4;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean X0(org.telegram.messenger.zi ziVar) {
        fl flVar;
        long B0 = org.telegram.messenger.zi.B0(ziVar.k);
        wm wmVar = this.a;
        return (B0 == 1271266957 || ((flVar = wmVar.D0) != null && flVar.O)) && wmVar.g4 != 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0501, code lost:
    
        if (r11.paid_reactions_available != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0507, code lost:
    
        if (r0.isEmpty() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0538, code lost:
    
        if (r11.paid_reactions_available != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0554, code lost:
    
        if (r0.isEmpty() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0542, code lost:
    
        if (org.telegram.messenger.t3.T(r6.e) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x054e, code lost:
    
        if (org.telegram.messenger.t3.p0(r6.e) != false) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x081e A[LOOP:2: B:227:0x081c->B:228:0x081e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04d0  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v45 */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        t71 t71Var;
        TLRPC.TodoItem todoItem2;
        final int i3;
        TLRPC.TodoCompletion todoCompletion;
        org.telegram.messenger.zi ziVar;
        boolean z10;
        String str;
        char c2;
        final ?? r11;
        t71 t71Var2;
        int i10;
        org.telegram.messenger.zi ziVar2;
        boolean z11;
        t71 t71Var3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.messenger.zi ziVar3;
        ArrayList arrayList;
        wm wmVar;
        ArrayList arrayList2;
        org.telegram.ui.Components.f60 f60Var;
        le leVar;
        eh.c cVar;
        w71 w71Var;
        int size;
        int i11;
        ViewGroup viewGroup;
        w71 w71Var2;
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
        int i13;
        int i14;
        final wm wmVar2 = this.a;
        if (wmVar2.getParentActivity() != null && wmVar2.getParentActivity() != null) {
            gi.l3 l3Var = wmVar2.M1;
            if (l3Var != null && l3Var.W) {
                l3Var.f(true);
            }
            vk vkVar = wmVar2.Q1;
            if (vkVar != null && vkVar.W) {
                vkVar.f(true);
            }
            org.telegram.messenger.zi primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia n12 = org.telegram.messenger.zi.n1(primaryMessageObject);
            if (primaryMessageObject != null && (n12 instanceof TLRPC.TL_messageMediaToDo)) {
                wmVar2.u5 = primaryMessageObject;
                wmVar2.v5 = null;
                final w71 w71Var3 = new w71(wmVar2.getParentActivity(), wmVar2.getResourceProvider());
                final int i15 = todoItem.id;
                w71Var3.L = q1Var;
                w71Var3.P = i15;
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                w71Var3.H = messageObject;
                w71Var3.I = messageObject != null && messageObject.Q3();
                org.telegram.ui.Cells.q1 q1Var2 = w71Var3.L;
                t71 t71Var4 = w71Var3.c;
                if (q1Var2 != null) {
                    w71Var3.M = wmVar2.M9 - org.telegram.messenger.g0.L(4.0f);
                    w71Var3.N = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        w71Var3.M = view.getY() + w71Var3.M;
                        w71Var3.N = view.getY() + w71Var3.N;
                    }
                    int width = w71Var3.L.getWidth();
                    int height = w71Var3.L.getHeight();
                    w71Var3.L.getHeight();
                    u71 u71Var = new u71(w71Var3, w71Var3.getContext(), org.telegram.messenger.h10.t0, w71Var3.L.getResourcesProvider(), i15, width, height);
                    w71Var3.J = u71Var;
                    w71Var3.L.r0(u71Var);
                    w71Var3.J.s0(w71Var3.L);
                    w71Var3.J.setDelegate(new v71(w71Var3));
                    u71 u71Var2 = w71Var3.J;
                    org.telegram.messenger.zi ziVar4 = w71Var3.H;
                    org.telegram.messenger.ui currentMessagesGroup = w71Var3.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = w71Var3.L;
                    u71Var2.u3(ziVar4, currentMessagesGroup, q1Var3.G, q1Var3.F, q1Var3.H, false);
                    t71Var4.addView(w71Var3.J, new FrameLayout.LayoutParams(w71Var3.L.getWidth(), height, 51));
                    or0 or0Var = new or0(w71Var3.getContext(), org.telegram.messenger.h10.t0, w71Var3.L.getResourcesProvider(), width, height, 1);
                    w71Var3.K = or0Var;
                    w71Var3.L.t0(or0Var);
                    w71Var3.L.r0(w71Var3.K);
                    w71Var3.K.s0(w71Var3.L);
                    w71Var3.K.setDelegate(new kb.a(20));
                    or0 or0Var2 = w71Var3.K;
                    org.telegram.messenger.zi ziVar5 = w71Var3.H;
                    org.telegram.messenger.ui currentMessagesGroup2 = w71Var3.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = w71Var3.L;
                    or0Var2.u3(ziVar5, currentMessagesGroup2, q1Var4.G, q1Var4.F, q1Var4.H, false);
                    t71Var4.addView(w71Var3.K, new FrameLayout.LayoutParams(w71Var3.L.getWidth(), height, 51));
                }
                gi.g1 g1Var = w71Var3.e;
                g1Var.bringToFront();
                t71 t71Var5 = w71Var3.d;
                t71Var5.bringToFront();
                w71Var3.h.bringToFront();
                g1Var.u(false);
                org.telegram.ui.ActionBar.e6 e6Var = w71Var3.a;
                org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F(t71Var4, e6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) org.telegram.messenger.zi.n1(w71Var3.H);
                int i16 = 0;
                while (true) {
                    t71Var = t71Var4;
                    if (i16 >= tL_messageMediaToDo.todo.list.size()) {
                        todoItem2 = null;
                        i3 = -1;
                        break;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i16).id == i15) {
                        todoItem2 = tL_messageMediaToDo.todo.list.get(i16);
                        i3 = i16;
                        break;
                    }
                    i16++;
                    t71Var4 = t71Var;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= tL_messageMediaToDo.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo.completions.get(i17).id == i15) {
                        todoCompletion = tL_messageMediaToDo.completions.get(i17);
                        break;
                    }
                    i17++;
                }
                if (!w71Var3.H.q()) {
                    ziVar = primaryMessageObject;
                    z10 = false;
                    str = null;
                    c2 = 65535;
                } else if (todoCompletion != null) {
                    long j10 = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        i13 = calendar.get(6);
                        i14 = calendar.get(1);
                        calendar.setTimeInMillis(j10);
                        ziVar = primaryMessageObject;
                    } catch (Exception e10) {
                        e = e10;
                        ziVar = primaryMessageObject;
                    }
                    try {
                        int i18 = calendar.get(6);
                        int i19 = calendar.get(1);
                        str3 = (i18 == i13 && i14 == i19) ? org.telegram.messenger.bd.a0(null, null, 2131744091, org.telegram.messenger.bd.E0().p0().format(new Date(j10))) : (i18 + 1 == i13 && i14 == i19) ? org.telegram.messenger.bd.a0(null, null, 2131744090, org.telegram.messenger.bd.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.bd.a0(null, null, 2131744092, org.telegram.messenger.bd.E0().q0().format(new Date(j10)), org.telegram.messenger.bd.E0().p0().format(new Date(j10))) : org.telegram.messenger.bd.a0(null, null, 2131744092, org.telegram.messenger.bd.E0().C0().format(new Date(j10)), org.telegram.messenger.bd.E0().p0().format(new Date(j10)));
                        i12 = 1;
                    } catch (Exception e11) {
                        e = e11;
                        i12 = 1;
                        org.telegram.messenger.a8.g(e, true);
                        str3 = "LOC_ERR";
                        c2 = 65535;
                        F.p(14, -1, str3);
                        F.k();
                        str = null;
                        z10 = false;
                        F.c(R.drawable.msg_cancel, org.telegram.messenger.bd.M0(2131744062, null), new Runnable() { // from class: org.telegram.ui.q71
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i20 = i12;
                                int i21 = i15;
                                wm wmVar3 = wmVar2;
                                w71 w71Var4 = w71Var3;
                                switch (i20) {
                                    case 0:
                                        fr0 fr0Var = new fr0(wmVar3);
                                        fr0Var.u0(org.telegram.messenger.zi.n1(w71Var4.H), false, i21);
                                        fr0Var.f0 = new rb0(27, w71Var4, wmVar3);
                                        wmVar3.presentFragment(fr0Var);
                                        w71Var4.c(false);
                                        break;
                                    case 1:
                                        if (wmVar3.c()) {
                                            Toast.makeText(w71Var4.getContext(), org.telegram.messenger.bd.M0(2131748501, null), 1).show();
                                        } else {
                                            u71 u71Var3 = w71Var4.J;
                                            u71Var3.K3(u71Var3.b2(i21), false);
                                        }
                                        w71Var4.c(true);
                                        break;
                                    default:
                                        if (wmVar3.c()) {
                                            Toast.makeText(w71Var4.getContext(), org.telegram.messenger.bd.M0(2131748501, null), 1).show();
                                        } else {
                                            u71 u71Var4 = w71Var4.J;
                                            u71Var4.K3(u71Var4.b2(i21), false);
                                        }
                                        w71Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i20 = 22;
                        if (todoItem2 == null) {
                        }
                        if (w71Var3.H.u(wmVar2.e)) {
                        }
                        t71Var2 = t71Var;
                        i10 = 51;
                        F.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                        hh.e k10 = b8.cd.k(e6Var);
                        eh.c cVar2 = w71Var3.G;
                        F.Q(cVar2, k10, r11);
                        F.Y();
                        ViewGroup viewGroup2 = F.A;
                        w71Var3.R = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        w71Var3.R.setPivotY(0.0f);
                        t71Var5.addView(w71Var3.R, b8.mf.e(-2, -2, i10));
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        wmVar2.E8(ziVar, arrayList3, arrayList4, arrayList5);
                        le leVar2 = new le(wmVar2, 10);
                        ziVar2 = w71Var3.H;
                        ArrayList arrayList6 = wmVar2.getMediaDataController().n;
                        if (wmVar2.z()) {
                        }
                        if (ziVar2.l3()) {
                        }
                        if (!z11) {
                        }
                        if (wmVar2.e != null) {
                        }
                        if (!z11) {
                        }
                        z14 = false;
                        TLRPC.User user3 = wmVar2.f;
                        if (user3 == null) {
                        }
                        org.telegram.ui.Components.f60 G = org.telegram.ui.Components.f60.G(t71Var2, wmVar2.getResourceProvider(), null, !z11 || z13);
                        if (z13) {
                        }
                        size = arrayList3.size();
                        while (i11 < size) {
                        }
                        f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                        f60Var.Q(cVar, b8.cd.k(e6Var), false);
                        f60Var.Y();
                        ViewGroup viewGroup3 = f60Var.A;
                        w71Var.T = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        w71Var.T.setPivotY(0.0f);
                        ViewGroup viewGroup4 = t71Var3;
                        viewGroup4.addView(w71Var.T, b8.mf.e(-2, -2, 51));
                        viewGroup = w71Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        w71Var2.e();
                        w71Var2.d0 = new pl(this, 5);
                        w71Var2.show();
                        return z16;
                    }
                    c2 = 65535;
                    F.p(14, -1, str3);
                    F.k();
                    str = null;
                    z10 = false;
                    F.c(R.drawable.msg_cancel, org.telegram.messenger.bd.M0(2131744062, null), new Runnable() { // from class: org.telegram.ui.q71
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i202 = i12;
                            int i21 = i15;
                            wm wmVar3 = wmVar2;
                            w71 w71Var4 = w71Var3;
                            switch (i202) {
                                case 0:
                                    fr0 fr0Var = new fr0(wmVar3);
                                    fr0Var.u0(org.telegram.messenger.zi.n1(w71Var4.H), false, i21);
                                    fr0Var.f0 = new rb0(27, w71Var4, wmVar3);
                                    wmVar3.presentFragment(fr0Var);
                                    w71Var4.c(false);
                                    break;
                                case 1:
                                    if (wmVar3.c()) {
                                        Toast.makeText(w71Var4.getContext(), org.telegram.messenger.bd.M0(2131748501, null), 1).show();
                                    } else {
                                        u71 u71Var3 = w71Var4.J;
                                        u71Var3.K3(u71Var3.b2(i21), false);
                                    }
                                    w71Var4.c(true);
                                    break;
                                default:
                                    if (wmVar3.c()) {
                                        Toast.makeText(w71Var4.getContext(), org.telegram.messenger.bd.M0(2131748501, null), 1).show();
                                    } else {
                                        u71 u71Var4 = w71Var4.J;
                                        u71Var4.K3(u71Var4.b2(i21), false);
                                    }
                                    w71Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    ziVar = primaryMessageObject;
                    z10 = false;
                    str = null;
                    c2 = 65535;
                    final int i21 = 2;
                    F.c(R.drawable.msg_select, org.telegram.messenger.bd.M0(2131744099, null), new Runnable() { // from class: org.telegram.ui.q71
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i202 = i21;
                            int i212 = i15;
                            wm wmVar3 = wmVar2;
                            w71 w71Var4 = w71Var3;
                            switch (i202) {
                                case 0:
                                    fr0 fr0Var = new fr0(wmVar3);
                                    fr0Var.u0(org.telegram.messenger.zi.n1(w71Var4.H), false, i212);
                                    fr0Var.f0 = new rb0(27, w71Var4, wmVar3);
                                    wmVar3.presentFragment(fr0Var);
                                    w71Var4.c(false);
                                    break;
                                case 1:
                                    if (wmVar3.c()) {
                                        Toast.makeText(w71Var4.getContext(), org.telegram.messenger.bd.M0(2131748501, null), 1).show();
                                    } else {
                                        u71 u71Var3 = w71Var4.J;
                                        u71Var3.K3(u71Var3.b2(i212), false);
                                    }
                                    w71Var4.c(true);
                                    break;
                                default:
                                    if (wmVar3.c()) {
                                        Toast.makeText(w71Var4.getContext(), org.telegram.messenger.bd.M0(2131748501, null), 1).show();
                                    } else {
                                        u71 u71Var4 = w71Var4.J;
                                        u71Var4.K3(u71Var4.b2(i212), false);
                                    }
                                    w71Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                int i202 = 22;
                if (todoItem2 == null) {
                    F.c(R.drawable.menu_reply, org.telegram.messenger.bd.M0(2131744083, str), new wy0(w71Var3, wmVar2, todoItem2, 6), z10);
                    if (org.telegram.messenger.zi.B0(w71Var3.H.k) < 0) {
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(w71Var3.H.I1);
                        String r5 = org.telegram.messenger.m5.r(s12.e2(org.telegram.messenger.zi.B0(w71Var3.H.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(s12.V2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r5)) {
                            r5 = "c/" + (-org.telegram.messenger.zi.B0(w71Var3.H.k));
                        }
                        sb2.append(r5);
                        sb2.append("/");
                        sb2.append(w71Var3.H.f1());
                        sb2.append("?task=");
                        sb2.append(todoItem2.id);
                        String sb3 = sb2.toString();
                        str2 = null;
                        z17 = false;
                        F.c(R.drawable.msg_link, org.telegram.messenger.bd.M0(2131751762, null), new qv0(i202, w71Var3, sb3), false);
                    } else {
                        str2 = null;
                        z17 = false;
                    }
                    F.c(R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131751767, str2), new qv0(23, w71Var3, todoItem2), z17);
                    r11 = z17;
                } else {
                    r11 = z10;
                }
                if (w71Var3.H.u(wmVar2.e)) {
                    F.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131744086, null), new Runnable() { // from class: org.telegram.ui.q71
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2022 = r11;
                            int i212 = i3;
                            wm wmVar3 = wmVar2;
                            w71 w71Var4 = w71Var3;
                            switch (i2022) {
                                case 0:
                                    fr0 fr0Var = new fr0(wmVar3);
                                    fr0Var.u0(org.telegram.messenger.zi.n1(w71Var4.H), false, i212);
                                    fr0Var.f0 = new rb0(27, w71Var4, wmVar3);
                                    wmVar3.presentFragment(fr0Var);
                                    w71Var4.c(false);
                                    break;
                                case 1:
                                    if (wmVar3.c()) {
                                        Toast.makeText(w71Var4.getContext(), org.telegram.messenger.bd.M0(2131748501, null), 1).show();
                                    } else {
                                        u71 u71Var3 = w71Var4.J;
                                        u71Var3.K3(u71Var3.b2(i212), false);
                                    }
                                    w71Var4.c(true);
                                    break;
                                default:
                                    if (wmVar3.c()) {
                                        Toast.makeText(w71Var4.getContext(), org.telegram.messenger.bd.M0(2131748501, null), 1).show();
                                    } else {
                                        u71 u71Var4 = w71Var4.J;
                                        u71Var4.K3(u71Var4.b2(i212), false);
                                    }
                                    w71Var4.c(true);
                                    break;
                            }
                        }
                    }, r11);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        t71Var2 = t71Var;
                        i10 = 51;
                        F.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131744087, null), new org.telegram.ui.Components.zo0(w71Var3, tL_messageMediaToDo, i15, wmVar2, 17), r11);
                        F.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                        hh.e k102 = b8.cd.k(e6Var);
                        eh.c cVar22 = w71Var3.G;
                        F.Q(cVar22, k102, r11);
                        F.Y();
                        ViewGroup viewGroup22 = F.A;
                        w71Var3.R = viewGroup22;
                        viewGroup22.setPivotX(0.0f);
                        w71Var3.R.setPivotY(0.0f);
                        t71Var5.addView(w71Var3.R, b8.mf.e(-2, -2, i10));
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        wmVar2.E8(ziVar, arrayList32, arrayList42, arrayList52);
                        le leVar22 = new le(wmVar2, 10);
                        ziVar2 = w71Var3.H;
                        ArrayList arrayList62 = wmVar2.getMediaDataController().n;
                        z11 = wmVar2.z() && !wmVar2.c() && wmVar2.f == null && ziVar2.x2() && !((org.telegram.messenger.t3.T(wmVar2.e) && !wmVar2.e.megagroup) || org.telegram.messenger.t3.p0(wmVar2.e) || arrayList62.isEmpty() || !ziVar2.k.reactions.can_see_list || ziVar2.m4());
                        if (ziVar2.l3()) {
                            t71Var3 = t71Var5;
                            TLRPC.ChatFull N0 = wmVar2.getMessagesController().N0(-ziVar2.Z0());
                            if (N0 != null) {
                                if (!wmVar2.z()) {
                                    if (wmVar2.g4 != 5) {
                                        if (!wmVar2.c()) {
                                            if (ziVar2.e4()) {
                                                if (N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z12 = false;
                            }
                            z12 = true;
                        } else {
                            t71Var3 = t71Var5;
                            if (!ziVar2.m4()) {
                                if (wmVar2.g4 != 5) {
                                    if (!wmVar2.z()) {
                                        if (!wmVar2.c()) {
                                            if (ziVar2.e4()) {
                                                TLRPC.ChatFull chatFull2 = wmVar2.q8;
                                                if (chatFull2 != null) {
                                                    if (chatFull2.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    }
                                                }
                                                if (chatFull2 == null) {
                                                }
                                                if (wmVar2.f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z12 = false;
                        }
                        z13 = (!z11 || wmVar2.c() || wmVar2.e == null || !ziVar2.Q3() || !ziVar2.r4() || ziVar2.Z2() || ziVar2.p4() || ziVar2.o4() || ziVar2.k.media_unread || ziVar2.G4() || ConnectionsManager.getInstance(wmVar2.getCurrentAccount()).getCurrentTime() - ziVar2.k.date >= wmVar2.getMessagesController().r3 || (!org.telegram.messenger.t3.n0(wmVar2.e) && org.telegram.messenger.t3.T(wmVar2.e)) || (chatFull = wmVar2.q8) == null || chatFull.participants_count > wmVar2.getMessagesController().q3 || (ziVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || wmVar2.g4 == 3 || !ziVar2.z() || org.telegram.messenger.t3.p0(wmVar2.e)) ? false : true;
                        if (wmVar2.e != null && !ziVar2.O3() && org.telegram.messenger.t3.p0(wmVar2.e) && org.telegram.messenger.t3.A(wmVar2.getCurrentAccount(), wmVar2.e, 24)) {
                            int i22 = ((-wmVar2.e.linked_monoforum_id) > ziVar2.Z0() ? 1 : ((-wmVar2.e.linked_monoforum_id) == ziVar2.Z0() ? 0 : -1));
                        }
                        if (!z11 && wmVar2.e == null && wmVar2.h == null && (user = wmVar2.f) != null && !org.telegram.messenger.l10.B(user) && !org.telegram.messenger.l10.z(wmVar2.f) && !org.telegram.messenger.l10.s(wmVar2.f)) {
                            user2 = wmVar2.f;
                            if (!user2.bot && !org.telegram.messenger.l10.A(user2.id) && (((userFull = wmVar2.r8) == null || !userFull.read_dates_private) && !wmVar2.c() && ziVar2.Q3() && ziVar2.r4() && !ziVar2.Z2() && !ziVar2.p4() && !ziVar2.o4() && !ziVar2.k.media_unread && !ziVar2.G4() && wmVar2.getConnectionsManager().getCurrentTime() - ziVar2.k.date < wmVar2.getMessagesController().s3 && !(ziVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z14 = true;
                                TLRPC.User user32 = wmVar2.f;
                                boolean z18 = ((user32 == null && (org.telegram.messenger.l10.z(user32) || org.telegram.messenger.l10.s(wmVar2.f))) || wmVar2.c() || !ziVar2.Y2() || (ziVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.f60 G2 = org.telegram.ui.Components.f60.G(t71Var2, wmVar2.getResourceProvider(), null, !z11 || z13);
                                if (z13) {
                                    df0 df0Var = new df0(w71Var3.getContext(), wmVar2.getCurrentAccount(), ziVar2, wmVar2.e);
                                    FrameLayout frameLayout = new FrameLayout(w71Var3.getContext());
                                    frameLayout.addView(df0Var, b8.mf.c(36.0f, -1));
                                    org.telegram.ui.Components.f60 J = G2.J();
                                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, w71Var3.getContext(), w71Var3.a, true, false);
                                    y0Var.setItemHeight(44);
                                    z15 = z12;
                                    y0Var.j(org.telegram.messenger.bd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                                    ziVar3 = ziVar2;
                                    y0Var.getTextView().setPadding(org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                                    FrameLayout frameLayout2 = new FrameLayout(w71Var3.getContext());
                                    LinearLayout linearLayout = new LinearLayout(w71Var3.getContext());
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, linearLayout, e6Var);
                                    linearLayout.setOrientation(1);
                                    wmVar = wmVar2;
                                    org.telegram.ui.Components.tj0 a10 = df0Var.a();
                                    frameLayout2.addView(y0Var);
                                    linearLayout.addView(frameLayout2);
                                    linearLayout.addView(new org.telegram.ui.ActionBar.c1(w71Var3.getContext(), e6Var), b8.mf.o(-1, 8));
                                    frameLayout2.setOnClickListener(new jr0(G2, 1));
                                    arrayList2 = arrayList52;
                                    arrayList = arrayList42;
                                    s71 s71Var = new s71(w71Var3, df0Var, wmVar, a10, linearLayout, G2, J);
                                    f60Var = G2;
                                    w71Var = w71Var3;
                                    df0Var.setOnClickListener(s71Var);
                                    linearLayout.addView(a10, b8.mf.o(-1, -2));
                                    J.q(linearLayout);
                                    f60Var.q(frameLayout);
                                    f60Var.k();
                                    leVar = leVar22;
                                    cVar = cVar22;
                                } else {
                                    z15 = z12;
                                    ziVar3 = ziVar2;
                                    arrayList = arrayList42;
                                    wmVar = wmVar2;
                                    arrayList2 = arrayList52;
                                    f60Var = G2;
                                    leVar = leVar22;
                                    cVar = cVar22;
                                    w71Var = w71Var3;
                                    if (z14) {
                                        f60Var.r(new org.telegram.ui.Components.ia0(w71Var.getContext(), 0, ziVar3, new p71(w71Var, 0), w71Var.a), b8.mf.o(-1, 36));
                                        f60Var.k();
                                    } else if (z18) {
                                        f60Var.r(new org.telegram.ui.Components.ia0(w71Var.getContext(), 1, ziVar3, new p71(w71Var, 2), w71Var.a), b8.mf.o(-1, 36));
                                        f60Var.k();
                                    }
                                }
                                size = arrayList32.size();
                                for (i11 = 0; i11 < size; i11++) {
                                    f60Var.c(((Integer) arrayList32.get(i11)).intValue(), (CharSequence) arrayList.get(i11), new rw(w71Var, leVar, ((Integer) arrayList2.get(i11)).intValue(), 13), false);
                                }
                                f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                                f60Var.Q(cVar, b8.cd.k(e6Var), false);
                                f60Var.Y();
                                ViewGroup viewGroup32 = f60Var.A;
                                w71Var.T = viewGroup32;
                                viewGroup32.setPivotX(0.0f);
                                w71Var.T.setPivotY(0.0f);
                                ViewGroup viewGroup42 = t71Var3;
                                viewGroup42.addView(w71Var.T, b8.mf.e(-2, -2, 51));
                                viewGroup = w71Var.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ci0(w71Var, 21));
                                    w71Var.T.setOnTouchListener(new e0(w71Var, 7));
                                }
                                if (z15) {
                                    wm wmVar3 = wmVar;
                                    org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0((wmVar.getUserConfig().e() > wmVar.a() ? 1 : (wmVar.getUserConfig().e() == wmVar.a() ? 0 : -1)) == 0 ? 3 : 0, wmVar3.getCurrentAccount(), w71Var.getContext(), wmVar3, w71Var.a);
                                    li0Var.a = true;
                                    float f10 = 22;
                                    li0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.bd.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.bd.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                                    w71Var2 = w71Var;
                                    org.telegram.messenger.zi ziVar6 = ziVar3;
                                    li0Var.setDelegate(new ui.f(w71Var2, wmVar3, ziVar6, li0Var, 12));
                                    w71Var2.Q = li0Var;
                                    viewGroup42.addView(li0Var, b8.mf.e(-2, (int) ((li0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                                    z16 = true;
                                    li0Var.p(ziVar6, wmVar3.q8, true);
                                    w71Var2.Q.setTransitionProgress(1.0f);
                                } else {
                                    w71Var2 = w71Var;
                                    z16 = true;
                                }
                                w71Var2.e();
                                w71Var2.d0 = new pl(this, 5);
                                w71Var2.show();
                                return z16;
                            }
                        }
                        z14 = false;
                        TLRPC.User user322 = wmVar2.f;
                        if (user322 == null) {
                        }
                        org.telegram.ui.Components.f60 G22 = org.telegram.ui.Components.f60.G(t71Var2, wmVar2.getResourceProvider(), null, !z11 || z13);
                        if (z13) {
                        }
                        size = arrayList32.size();
                        while (i11 < size) {
                        }
                        f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                        f60Var.Q(cVar, b8.cd.k(e6Var), false);
                        f60Var.Y();
                        ViewGroup viewGroup322 = f60Var.A;
                        w71Var.T = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        w71Var.T.setPivotY(0.0f);
                        ViewGroup viewGroup422 = t71Var3;
                        viewGroup422.addView(w71Var.T, b8.mf.e(-2, -2, 51));
                        viewGroup = w71Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        w71Var2.e();
                        w71Var2.d0 = new pl(this, 5);
                        w71Var2.show();
                        return z16;
                    }
                }
                t71Var2 = t71Var;
                i10 = 51;
                F.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                hh.e k1022 = b8.cd.k(e6Var);
                eh.c cVar222 = w71Var3.G;
                F.Q(cVar222, k1022, r11);
                F.Y();
                ViewGroup viewGroup222 = F.A;
                w71Var3.R = viewGroup222;
                viewGroup222.setPivotX(0.0f);
                w71Var3.R.setPivotY(0.0f);
                t71Var5.addView(w71Var3.R, b8.mf.e(-2, -2, i10));
                ArrayList arrayList322 = new ArrayList();
                ArrayList arrayList422 = new ArrayList();
                ArrayList arrayList522 = new ArrayList();
                wmVar2.E8(ziVar, arrayList322, arrayList422, arrayList522);
                le leVar222 = new le(wmVar2, 10);
                ziVar2 = w71Var3.H;
                ArrayList arrayList622 = wmVar2.getMediaDataController().n;
                if (wmVar2.z()) {
                }
                if (ziVar2.l3()) {
                }
                if (!z11) {
                }
                if (wmVar2.e != null) {
                    int i222 = ((-wmVar2.e.linked_monoforum_id) > ziVar2.Z0() ? 1 : ((-wmVar2.e.linked_monoforum_id) == ziVar2.Z0() ? 0 : -1));
                }
                if (!z11) {
                    user2 = wmVar2.f;
                    if (!user2.bot) {
                        z14 = true;
                        TLRPC.User user3222 = wmVar2.f;
                        if (user3222 == null) {
                        }
                        org.telegram.ui.Components.f60 G222 = org.telegram.ui.Components.f60.G(t71Var2, wmVar2.getResourceProvider(), null, !z11 || z13);
                        if (z13) {
                        }
                        size = arrayList322.size();
                        while (i11 < size) {
                        }
                        f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                        f60Var.Q(cVar, b8.cd.k(e6Var), false);
                        f60Var.Y();
                        ViewGroup viewGroup3222 = f60Var.A;
                        w71Var.T = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        w71Var.T.setPivotY(0.0f);
                        ViewGroup viewGroup4222 = t71Var3;
                        viewGroup4222.addView(w71Var.T, b8.mf.e(-2, -2, 51));
                        viewGroup = w71Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        w71Var2.e();
                        w71Var2.d0 = new pl(this, 5);
                        w71Var2.show();
                        return z16;
                    }
                }
                z14 = false;
                TLRPC.User user32222 = wmVar2.f;
                if (user32222 == null) {
                }
                org.telegram.ui.Components.f60 G2222 = org.telegram.ui.Components.f60.G(t71Var2, wmVar2.getResourceProvider(), null, !z11 || z13);
                if (z13) {
                }
                size = arrayList322.size();
                while (i11 < size) {
                }
                f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var)));
                f60Var.Q(cVar, b8.cd.k(e6Var), false);
                f60Var.Y();
                ViewGroup viewGroup32222 = f60Var.A;
                w71Var.T = viewGroup32222;
                viewGroup32222.setPivotX(0.0f);
                w71Var.T.setPivotY(0.0f);
                ViewGroup viewGroup42222 = t71Var3;
                viewGroup42222.addView(w71Var.T, b8.mf.e(-2, -2, 51));
                viewGroup = w71Var.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z15) {
                }
                w71Var2.e();
                w71Var2.d0 = new pl(this, 5);
                w71Var2.show();
                return z16;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final kh.a Z() {
        return this.a.rc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.hm] */
    @Override // org.telegram.ui.Cells.l1
    public final void Z1(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        wm wmVar = this.a;
        if (!org.telegram.messenger.g0.E1(wmVar.getParentActivity()) || (chat = wmVar.e) == null || currentUser == null || org.telegram.messenger.t3.V(chat)) {
            return;
        }
        org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
        long j10 = wmVar.e.id;
        long j11 = currentUser.id;
        a0.h hVar = (a0.h) messagesController.y1.f(j10);
        if (hVar == null && (N0 = messagesController.N0(j10)) != null && N0.participants != null) {
            for (int i3 = 0; i3 < N0.participants.participants.size(); i3++) {
                chatParticipant = N0.participants.participants.get(i3);
                if (chatParticipant.user_id == j11) {
                    break;
                }
            }
        }
        chatParticipant = (TLObject) hVar.f(j11);
        e(q1Var, chatParticipant);
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        wm wmVar = this.a;
        mj mjVar = wmVar.a0;
        if (mjVar != null) {
            CharSequence fieldText = mjVar.getFieldText();
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
                wmVar.a0.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.i3(new pl(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void a2(org.telegram.ui.Cells.q1 q1Var, long j10) {
        Bundle j11 = a1.g.j(j10, "user_id");
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var.getMessagesController().E(j11, d2Var, q1Var.getMessageObject(), null)) {
            d2Var.presentFragment(new wm(j11));
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        wm wmVar = this.a;
        mj mjVar = wmVar.a0;
        if (mjVar != null) {
            CharSequence fieldText = mjVar.getFieldText();
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
            String n4 = org.telegram.messenger.l10.n(user);
            if (n4 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) n4).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(t4.c.q(org.telegram.messenger.l10.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.y31("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            wmVar.a0.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.i3(new pl(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var == null ? null : q1Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        wm wmVar = this.a;
        return (wmVar.g4 == 1 || wmVar.U9() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        wm wmVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar2.v() || wmVar.W9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void c1() {
        wm wmVar = this.a;
        wmVar.f8();
        UndoView undoView = wmVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, wmVar.k6, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.l1
    public final boolean d0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        char c2;
        int i3;
        y4 b10;
        int i10;
        qj qjVar;
        pj pjVar;
        final int i11 = 0;
        if (!h()) {
            return false;
        }
        wm wmVar = this.a;
        final int i12 = 1;
        ?? r22 = (wmVar.e == null || ((qjVar = wmVar.d1) != null && qjVar.getVisibility() == 0) || ((pjVar = wmVar.T) != null && pjVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = wmVar.e;
        ?? r42 = (chat == null || !(wmVar.s4 == 0 || wmVar.w4) || (org.telegram.messenger.t3.T(chat) && !wmVar.e.megagroup)) ? 0 : 1;
        e5[] e5VarArr = new e5[r22 + 2 + r42];
        e5VarArr[0] = e5.d;
        e5VarArr[1] = e5.h;
        final int i13 = 2;
        if (r22 != 0) {
            e5VarArr[2] = e5.n;
            c2 = 3;
        } else {
            c2 = 2;
        }
        if (r42 != 0) {
            e5VarArr[c2] = e5.r;
        }
        TLRPC.UserFull b22 = wmVar.getMessagesController().b2(user.id);
        if (b22 != null) {
            b10 = y4.c(user, b22, e5VarArr);
            if (!b4.n.i(b10)) {
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                b10 = y4.b(user, i10, e5VarArr);
            }
        } else {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            b10 = y4.b(user, i3, e5VarArr);
        }
        if (b4.n.i(b10)) {
            b4.n.p().C((ViewGroup) wmVar.fragmentView, wmVar.ya, b10, new b7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(wmVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.bd.M0(2131747794, null), new Runnable(this) { // from class: org.telegram.ui.ql
            public final /* synthetic */ hm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.o(user, false);
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
        H.c(R.drawable.msg_discussion, org.telegram.messenger.bd.M0(2131745611, null), new p1(this, q1Var, user, 24), false);
        H.l(R.drawable.msg_mention, org.telegram.messenger.bd.M0(2131748617, null), new Runnable(this) { // from class: org.telegram.ui.ql
            public final /* synthetic */ hm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.o(user, false);
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
        H.l(R.drawable.msg_search, org.telegram.messenger.bd.M0(2131753758, null), new Runnable(this) { // from class: org.telegram.ui.ql
            public final /* synthetic */ hm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.o(user, false);
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
    public final void d1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wm wmVar = this.a;
        if (wmVar.V9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (wmVar.getParentActivity() != null) {
            if (wmVar.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                mj mjVar = wmVar.a0;
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                org.telegram.messenger.zi messageObject2 = q1Var.getMessageObject();
                ci ciVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                sf.b bVar = wmVar.bc;
                if (bVar != null) {
                    bVar.a(true);
                    wmVar.bc = null;
                }
                if (str == null || q1Var.getMessageObject() == null) {
                    wmVar.bc = null;
                } else {
                    ci ciVar2 = new ci(wmVar, q1Var.getMessageObject().f1(), str, q1Var, 1);
                    wmVar.bc = ciVar2;
                    ciVar = ciVar2;
                }
                mjVar.Z(keyboardButtonProto, messageObject, messageObject2, ciVar);
            }
        }
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        wm wmVar = this.a;
        wmVar.getUserConfig().f();
        if (!org.telegram.messenger.g0.E1(wmVar.getParentActivity()) || (chat = wmVar.e) == null || currentUser == null || org.telegram.messenger.t3.V(chat)) {
            return;
        }
        boolean z13 = true;
        boolean z14 = false;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z10 = channelParticipant.promoted_by == wmVar.getUserConfig().e();
            } else {
                z10 = false;
                z13 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z11 = channelParticipant2.promoted_by == wmVar.getUserConfig().e();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = wmVar.getParentActivity();
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                long j10 = -wmVar.e.id;
                e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                org.telegram.ui.Components.dy0.b(parentActivity, i3, j10, currentUser, str2, z15, z16, z12, e6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (org.telegram.messenger.t3.T(wmVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    wmVar.getMessagesController();
                    tL_channels_getParticipant.channel = org.telegram.messenger.hp.i1(wmVar.e);
                    tL_channels_getParticipant.participant = wmVar.getMessagesController().j1(currentUser.id);
                    wmVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new c3.b(1), new ai.q4(12, this, q1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == wmVar.getUserConfig().e();
            } else {
                z10 = false;
                z13 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z12 = z10;
        str2 = str;
        boolean z152 = z13;
        boolean z162 = z14;
        Activity parentActivity2 = wmVar.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        long j102 = -wmVar.e.id;
        e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
        org.telegram.ui.Components.dy0.b(parentActivity2, i3, j102, currentUser, str2, z152, z162, z12, e6Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e0(int i3) {
        int i10;
        SpannableStringBuilder X2;
        int i11;
        int i12 = 3;
        int i13 = 2;
        int i14 = 1;
        wm wmVar = this.a;
        try {
            if (i3 == 0) {
                wmVar.v7();
                ik ikVar = wmVar.O3;
                if (ikVar == null) {
                    return;
                }
                ikVar.l(0L, 84, null, new pl(this, i14));
                wmVar.O3.performHapticFeedback(3, 2);
                return;
            }
            if (i3 == 1) {
                String x10 = org.telegram.messenger.bd.x(wmVar.getMessagesController().u4, true);
                if (wmVar.getMessagesController().u4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(org.telegram.ui.Components.m11.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(org.telegram.ui.Components.m11.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.fc.a0(wmVar).G(R.raw.transcribe, 6, X2).k(true);
                wmVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i3 == 2 || i3 == 3) {
                String x11 = org.telegram.messenger.bd.x(wmVar.getMessagesController().u4, true);
                org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(wmVar.getMessagesController().s4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i3 == 2 ? org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131743978, null), new pl(this, i13)) : wmVar.getMessagesController().u4 <= 0 ? "" : org.telegram.messenger.g0.U2(org.telegram.messenger.bd.a0(null, null, 2131743977, x11), new pl(this, i12)));
                a02.getClass();
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(a02.W(), a02.c);
                ibVar.c(R.raw.transcribe, 36, 36, new String[0]);
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
                ibVar.b.setText(append);
                ibVar.b.setSingleLine(false);
                ibVar.b.setMaxLines(6);
                a02.b(ibVar, 7000).k(true);
                org.telegram.messenger.p2.E.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.zi messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            wm wmVar = this.a;
            if (wmVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.w2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.w2.g;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    org.telegram.messenger.xt xtVar = (org.telegram.messenger.xt) arrayList2.get(i3);
                    if (xtVar instanceof org.telegram.messenger.ku) {
                        arrayList.add(((org.telegram.messenger.ku) xtVar).r0);
                    } else if (xtVar instanceof org.telegram.messenger.wu) {
                        arrayList.add(((org.telegram.messenger.wu) xtVar).r0);
                    } else if (xtVar instanceof org.telegram.messenger.cu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.cu) xtVar).Y;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.qt) obj).b);
                        }
                    } else if (xtVar instanceof org.telegram.messenger.ou) {
                        ArrayList arrayList4 = ((org.telegram.messenger.ou) xtVar).Y;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.qt) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.N2(null, wmVar, null);
                    return v12.h2(null, null, null, null, null, null, null, indexOf, new nl(wmVar, arrayList), null, 0L, 0L, 0L, true, new ml(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    public final void f(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.zi primaryMessageObject;
        int i3;
        int i10;
        zi ziVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.K1 = true;
        wm wmVar = this.a;
        wi wiVar = wmVar.A0;
        if (wiVar != null && (ziVar = wmVar.C0) != null && ziVar.y < 0) {
            for (int childCount = wiVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = wmVar.A0.getChildAt(childCount);
                wmVar.A0.getClass();
                i3 = RecyclerView.R(childAt);
                if (i3 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = wmVar.f9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = wmVar.f9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i3 = -1;
        i10 = 0;
        if (z10 && i3 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                zi ziVar2 = wmVar.C0;
                wmVar.A0.getClass();
                ziVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) wmVar.M9), false);
            } else {
                wmVar.C0.h1(i3, i10);
            }
        }
        wmVar.c1 = z11;
        wmVar.Vc(primaryMessageObject, false);
        wmVar.c1 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f0() {
        return this.a.g4 == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f1(org.telegram.ui.Cells.q1 q1Var, int i3) {
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
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        File file = null;
        wm wmVar = this.a;
        if (i3 == 19) {
            sf.b bVar = wmVar.bc;
            if (bVar != null) {
                bVar.a(true);
            }
            final am amVar = q1Var.getMessageObject() != null ? new am(this, q1Var, 2) : null;
            wmVar.bc = amVar;
            final Activity parentActivity = wmVar.getParentActivity();
            final org.telegram.ui.ActionBar.e6 resourceProvider = wmVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            amVar.d();
            amVar.b = new xg.e(atomicBoolean, 0);
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
            final String b11 = xg.j.b(messageObject);
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(-messageObject.Z0()));
            final boolean z10 = M0 != null && org.telegram.messenger.t3.V(M0);
            final long j10 = messageObject.k.date * 1000;
            xg.s.d(messageObject, new org.telegram.messenger.u10(atomicBoolean, amVar, z10, b11, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: xg.f
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ sf.b b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ e6 g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.a.get()) {
                        return;
                    }
                    this.b.b();
                    boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z12 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Context context = this.f;
                    e6 e6Var = this.g;
                    if (z11) {
                        j.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        j.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                    }
                }
            }, new xg.g(atomicBoolean, amVar, 0));
            return;
        }
        if (i3 == 21) {
            org.telegram.messenger.t0.u();
            boolean z11 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.r();
            sf.c.t(wmVar.getParentActivity(), org.telegram.messenger.r2.g);
            return;
        }
        if (i3 == 84) {
            wmVar.Ta(q1Var);
            return;
        }
        if (i3 == 80) {
            org.telegram.ui.Cells.n8 n8Var = org.telegram.ui.Components.se0.J1;
            if (wmVar.getParentActivity() == null) {
                return;
            }
            wmVar.showDialog(new org.telegram.ui.Components.se0(wmVar.getContext(), wmVar.getCurrentAccount(), messageObject, wmVar.getResourceProvider()));
            return;
        }
        if (i3 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.K1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(messageObject) == null) {
                wmVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i14 = 5;
        if (i3 == 5) {
            long j11 = messageObject.k.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                user2 = org.telegram.messenger.hp.s1(i13).a2(Long.valueOf(j11));
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
                wmVar.presentFragment(new ProfileActivity(bundle, null));
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
                wmVar.showDialog(new org.telegram.ui.Components.vc0(wmVar, null, user2, null, file, mf.b.d(str, false), str3, str4, wmVar.ya));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i3 == 30) {
            wmVar.presentFragment(new wm(a1.g.j(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i3 == 31) {
            long j12 = messageObject.k.media.user_id;
            if (j12 != 0) {
                i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                user = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(j12));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.X1)) {
                    b10 = messageObject.X1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str5 = org.telegram.messenger.zi.o1(messageObject.k).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? mf.b.c().b(str5) : org.telegram.messenger.bd.M0(2131747840, null);
                } else {
                    b10 = org.telegram.messenger.k5.i(new StringBuilder("+"), user.phone, mf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                wmVar.presentFragment(new lr(bundle2));
                return;
            }
            return;
        }
        if (i3 == 23 || i3 == 24) {
            boolean z12 = i3 == 24;
            TLRPC.Message message2 = messageObject.k;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            sf.b bVar2 = wmVar.bc;
            if (bVar2 != null) {
                bVar2.a(true);
            }
            int i15 = 3;
            wmVar.bc = q1Var.getMessageObject() != null ? new am(this, q1Var, i15) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                if (org.telegram.messenger.li.b0(i10).p0(group) == null) {
                    wmVar.bc.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    wmVar.bc.b = new cg.l0(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new gi.b3(i15, this, z12)), 28);
                    return;
                }
            }
            sf.c.s(wmVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, wmVar.bc, null, false, true, false, false);
            return;
        }
        if (messageObject.s4()) {
            wmVar.ja(messageObject, false, false);
            if (messageObject.R0 != null) {
                sf.b bVar3 = wmVar.bc;
                if (bVar3 != null) {
                    bVar3.a(true);
                }
                wmVar.bc = q1Var.getMessageObject() != null ? new am(this, q1Var, 4) : null;
                sf.c.s(wmVar.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, wmVar.bc, null, false, wmVar.getMessagesController().d6, false, false);
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
                    wmVar.getOrCreateStoryViewer().T(wmVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ei.i7.a(wmVar.A0));
                    return;
                }
            }
        }
        if (wmVar.Ea(X1.url, q1Var, null, messageObject.f1(), 2)) {
            return;
        }
        sf.b bVar4 = wmVar.bc;
        if (bVar4 != null) {
            bVar4.a(true);
        }
        wmVar.bc = q1Var.getMessageObject() != null ? new am(this, q1Var, i14) : null;
        sf.c.s(wmVar.getParentActivity(), Uri.parse(X1.url), true, true, false, wmVar.bc, null, false, true, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f2(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Vc(primaryMessageObject, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final String g(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar;
        int i3;
        if (q1Var.getMessageObject() == null || (i3 = (wmVar = this.a).Xb) == 0 || i3 != q1Var.getMessageObject().f1() || wmVar.Yb != 3) {
            return null;
        }
        return wmVar.ac;
    }

    public final boolean h() {
        wm wmVar = this.a;
        if (org.telegram.messenger.l10.B(wmVar.f)) {
            return true;
        }
        TLRPC.Chat chat = wmVar.e;
        if (chat != null) {
            return !org.telegram.messenger.t3.T(chat) || wmVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        this.a.X7(q1Var, true, false, f10, f11, false, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void h2() {
        this.a.M9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a10 = th.g.a(messageObject);
        boolean a11 = x7.u.a(a10, 7);
        wm wmVar = this.a;
        if (a11) {
            org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.e_hand_2, 36, th.g.b(a10, messageObject)).j();
            return;
        }
        if (i3 < 0 && !arrayList.isEmpty()) {
            wmVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
            q1Var.a0(true);
            return;
        }
        if (wmVar.getParentActivity() == null) {
            return;
        }
        if (wmVar.C2 == null) {
            int indexOfChild = wmVar.m1.indexOfChild(wmVar.U);
            if (indexOfChild == -1) {
                return;
            }
            gi.l3 D6 = wmVar.D6(250.0f, 3, indexOfChild + 1, false);
            wmVar.C2 = D6;
            D6.v0 = 0.0f;
        }
        if (arrayList.isEmpty() && i3 < 0) {
            ArrayList<org.telegram.ui.Cells.p1> pollButtons = q1Var.getPollButtons();
            int size = pollButtons.size();
            int i12 = 0;
            float f10 = 0.0f;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i12);
                float y9 = ((q1Var.getY() + p1Var.b) - org.telegram.messenger.g0.L(4.0f)) - wmVar.M9;
                wmVar.F2 = org.telegram.messenger.g0.L(13.3f) + p1Var.a;
                int D = org.telegram.messenger.camera.q.D(6.0f, p1Var.b, i11);
                wmVar.G2 = D;
                if (y9 > 0.0f) {
                    i10 = wmVar.F2;
                    i11 = D;
                    f10 = 0.0f;
                    break;
                }
                i12++;
                f10 = y9;
            }
            if (f10 != 0.0f) {
                wmVar.A0.w0(0, (int) f10, null);
                wmVar.E2 = q1Var;
                return;
            }
        }
        wm.p2(wmVar, q1Var, i3, i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        xh.h hVar;
        xh.j jVar = this.a.ra;
        if (jVar == null || (hVar = (xh.h) jVar.a.get(xh.j.b(q1Var))) == null) {
            return;
        }
        xh.d[] dVarArr = hVar.x;
        RectF rectF = hVar.r;
        if (hVar.N) {
            float f12 = (f10 - rectF.left) + hVar.V;
            float f13 = (f11 - rectF.top) + hVar.W;
            int i3 = xh.g.a;
            int b10 = (((float) (-org.telegram.messenger.g0.L((float) 37))) >= f13 || f13 >= rectF.height()) ? -1 : b8.be.b((int) Math.floor((f12 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(xh.g.a + 11)), 0, dVarArr.length - 1);
            if (hVar.S == b10) {
                return;
            }
            hVar.a.performHapticFeedback(3, 1);
            hVar.S = b10;
            int i10 = 0;
            while (i10 < dVarArr.length) {
                xh.d dVar = dVarArr[i10];
                boolean z10 = b10 == i10;
                if (dVar.p != z10) {
                    ValueAnimator valueAnimator = dVar.n;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dVar.p = z10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.o, z10 ? 1.0f : 0.0f);
                    dVar.n = ofFloat;
                    ofFloat.setDuration(180L);
                    dVar.n.addUpdateListener(dVar);
                    dVar.n.setInterpolator(xh.f.a);
                    dVar.n.start();
                }
                xh.d dVar2 = dVarArr[i10];
                boolean z11 = b10 == i10 || b10 == -1;
                if (dVar2.m != z11) {
                    ValueAnimator valueAnimator2 = dVar2.k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dVar2.m = z11;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dVar2.l, z11 ? 1.0f : 0.0f);
                    dVar2.k = ofFloat2;
                    ofFloat2.setDuration(180L);
                    dVar2.k.addUpdateListener(dVar2);
                    dVar2.k.setInterpolator(xh.f.a);
                    dVar2.k.start();
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.a.l8(q1Var, reactionCount, z10, f10, f11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        sf.c.t(this.a.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public final int j0(org.telegram.ui.Cells.q1 q1Var) {
        th.b bVar;
        wm wmVar = this.a;
        if (!wmVar.bd.f || (bVar = wmVar.hd) == null || bVar.n != q1Var || bVar.a.getWidth() <= 0) {
            return 0;
        }
        return wmVar.hd.a.getHeight();
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, boolean z10) {
        wm wmVar = this.a;
        TLRPC.Chat chat2 = wmVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            qi qiVar = wmVar.p1;
            if (qiVar != null && i3 == 0) {
                qiVar.e(false, false);
                return;
            } else {
                if (q1Var.getMessageObject() != null) {
                    wmVar.l(i3, q1Var.getMessageObject().f1(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || wmVar.da()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i3 != 0) {
                bundle.putInt("message_id", i3);
            }
            di diVar = null;
            if (z10) {
                sf.b bVar = wmVar.bc;
                if (bVar != null) {
                    bVar.a(true);
                    wmVar.bc = null;
                }
                if (q1Var == null || q1Var.getMessageObject() == null) {
                    wmVar.bc = null;
                } else {
                    di diVar2 = new di(wmVar, q1Var.getMessageObject().f1(), q1Var, 0);
                    wmVar.bc = diVar2;
                    diVar = diVar2;
                }
            }
            if (wmVar.getMessagesController().E(bundle, wmVar, q1Var.getMessageObject(), diVar)) {
                di diVar3 = diVar;
                wm wmVar2 = new wm(bundle);
                if (diVar3 == null || i3 == 0) {
                    wmVar.presentFragment(wmVar2);
                } else {
                    org.telegram.messenger.g0.i3(new ai.p1(this, diVar3, chat, i3, wmVar2, 13), 5000L);
                    diVar3.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        wm wmVar = this.a;
        if (wmVar.getParentActivity() == null) {
            return;
        }
        if (wmVar.ra == null) {
            xh.j jVar = new xh.j(wmVar.getParentActivity());
            wmVar.ra = jVar;
            wmVar.m1.addView(jVar, b8.mf.e(-1, -1, 48));
        }
        xh.j jVar2 = wmVar.ra;
        HashMap hashMap = jVar2.a;
        ArrayList arrayList = jVar2.c;
        arrayList.clear();
        int i3 = jVar2.d;
        org.telegram.messenger.h10 i10 = org.telegram.messenger.h10.i(i3);
        long j10 = i10.n;
        arrayList.add(Long.valueOf(j10));
        if (i10.W) {
            ArrayList arrayList2 = org.telegram.messenger.li.b0(i3).j1;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                long j11 = tL_topPeer.peer.user_id;
                if (j11 != 0) {
                    int i12 = size;
                    if (org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j11));
                    }
                    size = i12;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = org.telegram.messenger.hp.s1(i3).y;
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j12 = dialog.id;
                if (j12 != j10 && !org.telegram.messenger.m5.C(j12)) {
                    if (org.telegram.messenger.m5.E(dialog.id)) {
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(dialog.id));
                        if (a22 != null && !org.telegram.messenger.l10.t(a22) && !org.telegram.messenger.l10.x(a22) && !org.telegram.messenger.l10.A(a22.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-dialog.id));
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
        String b10 = xh.j.b(q1Var);
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
        xh.h hVar = new xh.h(jVar2, q1Var, arrayList5, new xh.i(0, jVar2, b10));
        hVar.setBounds(0, 0, jVar2.getMeasuredWidth(), jVar2.getMeasuredHeight());
        hVar.setCallback(jVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.d2 d2Var = this.a;
            if (d2Var.getMessagesController().E(bundle, d2Var, q1Var.getMessageObject(), null)) {
                d2Var.presentFragment(new wm(bundle));
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
    public final boolean m0() {
        boolean z10;
        wm wmVar = this.a;
        if (wmVar.W9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean m2(int i3) {
        boolean z10;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        if (i3 != 16 && i3 != R.id.acc_action_small_button && i3 != R.id.acc_action_msg_options) {
            return false;
        }
        wm wmVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        if (!z10 || !wmVar.da) {
            return !c();
        }
        q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
            ((ActionBarLayout) q4Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia n12 = org.telegram.messenger.zi.n1(messageObject);
        if (messageMedia == null || messageObject == null || !(n12 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            E1(q1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        wm wmVar = this.a;
        if (geoPoint != null) {
            if (org.telegram.messenger.g0.J1(wmVar)) {
                em emVar = new em(3);
                e6Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                emVar.setResourceProvider(e6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = wmVar.getMessagesController().z1(wmVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                emVar.Q0 = false;
                emVar.G0(new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_message, false, false));
                wmVar.presentFragment(emVar);
                return;
            }
            return;
        }
        if (org.telegram.messenger.zi.O2(messageMedia.document)) {
            is.p().v(wmVar.getParentActivity());
            is.p().u(new fm(this, tL_messageMediaPoll, pollAnswer, q1Var));
            is p10 = is.p();
            TLRPC.Document document4 = messageMedia.document;
            int i17 = org.telegram.messenger.zi.I2(document4) ? 2 : 0;
            org.telegram.messenger.zi messageObject2 = q1Var.getMessageObject();
            e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
            p10.s(document4, null, "", null, null, i17, false, messageObject2, e6Var, org.telegram.messenger.hs.e3);
            return;
        }
        if (org.telegram.messenger.zi.K3(messageMedia.document)) {
            org.telegram.messenger.zi ziVar = MediaController.B().v0;
            if (MediaController.B().I(messageObject) && ziVar != null) {
                if (ziVar.k0 == (i3 == -3)) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(ziVar);
                        return;
                    } else {
                        MediaController.B().R(ziVar, true);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.k;
            TLRPC.TL_message Q7 = wm.Q7(message);
            Q7.media = messageMedia;
            Q7.attachPath = th.d.c(i3, message);
            ArrayList arrayList = new ArrayList();
            i16 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i16, Q7, false, true);
            ziVar2.k0 = i3 == -3;
            arrayList.add(ziVar2);
            if (MediaController.B().I(messageObject)) {
                MediaController.B().q(false, true, false, false);
            }
            MediaController.B().o0(arrayList, ziVar2, 0L, true, null, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !org.telegram.messenger.zi.L4(document5)) {
            i14 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            th.a aVar = new th.a(i14, messageObject, document6, th.d.c(i3, messageObject.k));
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
            TLRPC.TL_message Q72 = wm.Q7(message2);
            Q72.media = messageMedia;
            Q72.attachPath = th.d.c(i3, message2);
            i15 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            gm gmVar = new gm(i15, Q72, false, true);
            if (org.telegram.messenger.zi.y(messageMedia.document)) {
                PhotoViewer.v1().N2(null, wmVar, wmVar.ya);
                PhotoViewer v12 = PhotoViewer.v1();
                int i18 = gmVar.D;
                v12.i2(gmVar, wmVar, i18 != 0 ? wmVar.k6 : 0L, i18 != 0 ? wmVar.c7 : 0L, i18 != 0 ? wmVar.b() : 0L, wmVar.ab);
                return;
            }
            try {
                org.telegram.messenger.g0.u2(gmVar, wmVar.getParentActivity(), wmVar.ya, false);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                wmVar.L6(gmVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.zi.L4(document3))) {
            i10 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message Q73 = wm.Q7(message3);
            Q73.media = messageMedia3;
            Q73.attachPath = th.d.c(-2, message3);
            i13 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            arrayList3.add(new xl(i13, Q73, false, true));
            arrayList2.add(-2);
        } else {
            i10 = -1;
        }
        if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.zi.L4(document2))) {
            if (messageMedia2 == messageMedia) {
                i10 = arrayList3.size();
            }
            TLRPC.TL_message Q74 = wm.Q7(message3);
            Q74.media = messageMedia2;
            Q74.attachPath = th.d.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            Q74.message = pollResults2.solution;
            Q74.entities = pollResults2.solution_entities;
            i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            arrayList3.add(new yl(i12, Q74, false, true));
            arrayList2.add(-3);
        }
        dg.d.b(tL_messageMediaPoll.poll, wmVar.getUserConfig().e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.zi.L4(document))) {
                if (pollAnswer2.unshuffled_index == i3) {
                    i10 = arrayList3.size();
                }
                TLRPC.TL_message Q75 = wm.Q7(message3);
                Q75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                Q75.message = tL_textWithEntities2.text;
                Q75.entities = tL_textWithEntities2.entities;
                Q75.attachPath = th.d.c(pollAnswer2.unshuffled_index, message3);
                i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                arrayList3.add(new zl(i11, Q75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.q0 = arrayList2;
        PhotoViewer.v1().N2(null, wmVar, wmVar.ya);
        PhotoViewer.v1().e2(arrayList3, i10, wmVar.a(), 0L, 0L, wmVar.bb);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
        wm wmVar = this.a;
        qj qjVar = wmVar.d1;
        if (qjVar == null || qjVar.getVisibility() != 0) {
            pj pjVar = wmVar.T;
            if ((pjVar == null || pjVar.getVisibility() != 0) && wmVar.a0 != null && str != null && str.length() > 0) {
                wmVar.a0.setFieldText("@" + str + " ");
                wmVar.a0.G0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean n1() {
        wm wmVar = this.a;
        return wmVar.m1.getMeasuredWidth() > wmVar.m1.getMeasuredHeight();
    }

    public final void o(TLRPC.User user, boolean z10) {
        int i3;
        if (user == null || user.id == 489000) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i10 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("expandPhoto", z10);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        wm wmVar = this.a;
        TLRPC.User user2 = wmVar.f;
        if (user2 != null && user2.id == user.id) {
            i10 = 1;
        }
        profileActivity.g5(i10);
        Activity parentActivity = wmVar.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        org.telegram.messenger.g0.l3(parentActivity, i3);
        wmVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean o0(org.telegram.ui.Components.p5 p5Var) {
        TLRPC.InputStickerSet j12;
        int i3;
        wm wmVar = this.a;
        if (!wmVar.getMessagesController().D3() && p5Var != null && !p5Var.standard) {
            long documentId = p5Var.getDocumentId();
            TLRPC.Document document = p5Var.document;
            if (document == null) {
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                document = org.telegram.ui.Components.g5.e(i3, documentId);
            }
            if (document != null && (j12 = org.telegram.messenger.zi.j1(document)) != null) {
                org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).m0(j12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(j12);
                org.telegram.ui.Components.pu puVar = new org.telegram.ui.Components.pu(wmVar, wmVar.getParentActivity(), wmVar.ya, arrayList);
                org.telegram.ui.Components.hu huVar = puVar.n1;
                huVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(huVar);
                huVar.w = imageReceiver;
                if (huVar.d) {
                    imageReceiver.P();
                }
                huVar.x = true;
                huVar.y.e(true, 1.0f);
                huVar.w.r0(org.telegram.messenger.ac.b(document), "140_140", org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, true), 0L, null, null, 0);
                huVar.w.E0(7);
                ImageReceiver imageReceiver2 = huVar.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = huVar.w;
                imageReceiver3.x0 = true;
                imageReceiver3.H0(huVar);
                boolean T9 = wmVar.T9();
                puVar.i0 = T9;
                puVar.n = T9;
                wmVar.showDialog(puVar);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o2() {
        wm wmVar = this.a;
        if (!wmVar.getUserConfig().q()) {
            org.telegram.ui.Components.fc.a0(wmVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.bd.H(',', "UnlockSimilarChannelsPremium", wmVar.getMessagesController().x4), new pl(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", wmVar.k6);
        bundle.putInt("start_from", 10);
        wmVar.presentFragment(new org.telegram.ui.Components.r80(bundle, wmVar.p1.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p(org.telegram.ui.Cells.q1 q1Var) {
        float L;
        if (q1Var.getMessageObject().z3()) {
            c1();
            return;
        }
        wm wmVar = this.a;
        if (wmVar.A3 || wmVar.A0 == null || wmVar.getParentActivity() == null || wmVar.fragmentView == null) {
            return;
        }
        if (wmVar.J2 == null) {
            int indexOfChild = wmVar.m1.indexOfChild(wmVar.U);
            if (indexOfChild == -1) {
                return;
            }
            gi.l3 D6 = wmVar.D6(250.0f, 3, indexOfChild + 1, false);
            wmVar.J2 = D6;
            D6.u(org.telegram.messenger.bd.M0(2131749337, null));
        }
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
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
        if (wmVar.u9(q1Var, L) <= org.telegram.messenger.g0.L(80.0f)) {
            return;
        }
        wmVar.J2.x(wmVar.t9(q1Var, q1Var.getForwardNameCenterX()), wmVar.u9(q1Var, L) - org.telegram.messenger.g0.L(4.0f), true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        wm wmVar = this.a;
        wmVar.X7(q1Var, false, false, f10, f11, true, false, false);
        wmVar.A0.getClass();
        wm.k2(wmVar, RecyclerView.R(q1Var));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        wm wmVar = this.a;
        return wmVar.Xb != 0 && q1Var.getMessageObject() != null && wmVar.Xb == q1Var.getMessageObject().f1() && wmVar.Yb == i3;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p2(org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
        org.telegram.messenger.zi messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        wm wmVar = this.a;
        gi.l3 l3Var = wmVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (wmVar.getParentActivity() == null || (messageObject = q1Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.bd.E0().y);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str = R0.country;
        }
        gi.l3 l3Var2 = new gi.l3(wmVar.getParentActivity(), 3);
        l3Var2.r(true);
        l3Var2.L = Layout.Alignment.ALIGN_NORMAL;
        l3Var2.d = -1L;
        l3Var2.U = true;
        l3Var2.e = true;
        l3Var2.s(12.0f);
        wmVar.P1 = l3Var2;
        l3Var2.r0 = new sc(22, this, l3Var2);
        l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750849, str)));
        wmVar.P1.l(wmVar.L);
        wmVar.m1.addView(wmVar.P1, b8.mf.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        wmVar.m1.post(new k2.a0(this, q1Var, i10, i3, 12));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q() {
        this.a.m1.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.i9 q2() {
        return this.a.r9;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        f(q1Var, z10, false, z11);
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
    public final void s(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i3;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        TLRPC.Message message2;
        int i11;
        TLRPC.Peer peer;
        org.telegram.messenger.ui uiVar;
        int i12;
        wm wmVar = this.a;
        if (wmVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.g11 g11Var = wmVar.g2;
        boolean z10 = true;
        if (g11Var != null && wmVar.s4 == 0 && (q1Var.k6 || q1Var.l6)) {
            g11Var.n(q1Var.getMessageObject().Z1(), true);
            return;
        }
        if (wmVar.getMessagesController().v2()) {
            i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            b.b(i12);
            return;
        }
        mj mjVar = wmVar.a0;
        if (mjVar != null) {
            mjVar.L();
        }
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        int i13 = wmVar.g4;
        if (i13 == 2) {
            wmVar.k9.T0(messageObject.f1());
            wmVar.finishFragment();
            return;
        }
        if (i13 == 3 || ((i13 == 7 && wmVar.d4 == 2) || !((!org.telegram.messenger.l10.z(wmVar.f) && !org.telegram.messenger.l10.B(wmVar.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (org.telegram.messenger.l10.z(wmVar.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i3 = messageReplyHeader.reply_to_top_id) != 0) {
                wmVar.Aa(messageReplyHeader.reply_to_peer_id.channel_id, null, i3, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (wmVar.g4 == 7 && wmVar.d4 == 2) {
                wmVar.Fa(messageObject);
                return;
            } else {
                wmVar.Ga(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.d1() == 0 || (uiVar = (org.telegram.messenger.ui) wmVar.O6.f(messageObject.d1())) == null) ? null : uiVar.d;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.k5.k(messageObject);
        }
        if (wmVar.getMessagesController().W4()) {
            int i14 = messageObject.I1;
            if (!messageObject.s4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i11 = messageObject.D) != 17 && i11 != 12)) {
                long B0 = org.telegram.messenger.zi.B0(message2);
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i14).M0(Long.valueOf(-B0));
                if (M0 == null || !M0.noforwards) {
                    if (B0 >= 0 || !org.telegram.messenger.t3.V(M0)) {
                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.k.fwd_from;
                        if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                            long o10 = org.telegram.messenger.m5.o(peer);
                            TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i14).M0(Long.valueOf(-o10));
                            if (o10 < 0) {
                                if (M02 != null) {
                                }
                                if (org.telegram.messenger.t3.V(M02)) {
                                }
                            }
                        }
                    }
                    boolean z11 = z10;
                    wmVar.showDialog(new bm(this, wmVar.getParentActivity(), wmVar, arrayList, org.telegram.messenger.t3.T(wmVar.e), z11, wmVar.ya, z11, messageObject));
                    Activity parentActivity = wmVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i10);
                    wmVar.fragmentView.requestLayout();
                }
            }
        }
        z10 = false;
        boolean z112 = z10;
        wmVar.showDialog(new bm(this, wmVar.getParentActivity(), wmVar, arrayList, org.telegram.messenger.t3.T(wmVar.e), z112, wmVar.ya, z112, messageObject));
        Activity parentActivity2 = wmVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        org.telegram.messenger.g0.l3(parentActivity2, i10);
        wmVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        boolean z10 = true;
        if (kVar.v() || wmVar.W9()) {
            wm.j2(wmVar, q1Var, true, f10, f11);
            return;
        }
        if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().s4()) {
            f1(q1Var, 10);
            return;
        }
        if (!org.telegram.messenger.t3.c0(wmVar.e) && !wmVar.da()) {
            z10 = false;
        }
        o(user, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x061f, code lost:
    
        if (r0.exists() != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x06e4, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L226;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0733 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
        int i3;
        wm wmVar;
        boolean z11;
        wm wmVar2;
        File file;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i10;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        int i11 = messageObject.D;
        wm wmVar3 = this.a;
        if (i11 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia2.peer);
            storyItem.messageId = messageObject.f1();
            storyItem.messageType = 2;
            ei.s7.b(storyItem, wmVar3.f);
            wmVar3.getOrCreateStoryViewer().T(wmVar3.getParentActivity(), messageObject.k.media.storyItem, ei.i7.a(wmVar3.A0));
            return;
        }
        int i12 = 1;
        if (org.telegram.messenger.zi.M4(messageObject.k)) {
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar3).currentAccount;
            if (org.telegram.messenger.z5.q(i10).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.o4()) {
            wmVar3.X7(q1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject.p4()) {
            return;
        }
        int i13 = 0;
        if (z10 && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            org.telegram.messenger.g0.K0(str, false);
            if (wmVar3.Ea(str, q1Var, null, messageObject.f1(), 2)) {
                return;
            }
            sf.b bVar = wmVar3.bc;
            if (bVar != null) {
                bVar.a(true);
            }
            wmVar3.bc = q1Var.getMessageObject() != null ? new am(this, q1Var, i13) : null;
            sf.c.s(wmVar3.getParentActivity(), Uri.parse(str), true, false, false, wmVar3.bc, null, false, true, false, false);
            return;
        }
        if (messageObject.U2()) {
            rl rlVar = new rl(this, messageObject, i13);
            TLRPC.MessageMedia o12 = org.telegram.messenger.zi.o1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(o12) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(o12) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                rlVar.run();
                return;
            }
            org.telegram.messenger.hp messagesController = wmVar3.getMessagesController();
            int i14 = 5;
            z zVar = new z(this, messageObject, rlVar, i14);
            TLRPC.EmojiGameInfo emojiGameInfo = messagesController.w8;
            if (emojiGameInfo != null) {
                zVar.a(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
                return;
            }
            ArrayList arrayList = messagesController.v8;
            if (arrayList != null) {
                arrayList.add(zVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            messagesController.v8 = arrayList2;
            arrayList2.add(zVar);
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new c3.b(i12), new org.telegram.messenger.wk(messagesController, i14));
            return;
        }
        if ((messageObject.H2() && (!messageObject.G2() || (wmVar3.Ra.e.containsKey(fx.p(org.telegram.messenger.zi.U(messageObject.F0()))) && wmVar3.f != null))) || messageObject.X3()) {
            wmVar3.mb(q1Var);
            wmVar3.Ra.k(q1Var, wmVar3, true);
            wmVar3.A0.I0(false);
            return;
        }
        int i15 = 6;
        if (messageObject.n5()) {
            ge Hb = wmVar3.Hb(messageObject, false);
            ai.r1 Z4 = wm.Z4(wmVar3, messageObject);
            q1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = wmVar3.getParentActivity();
            int i16 = org.telegram.messenger.h10.t0;
            f12.a = i16;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.d = i16;
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.f1 = new org.telegram.ui.Components.al0(parentActivity, null);
                l0 l0Var = new l0(22, parentActivity, f12);
                f12.d = l0Var;
                l0Var.setBackgroundDrawable(f12.k0);
                f12.d.setFocusable(true);
                f12.d.setFocusableInTouchMode(true);
                f12.d.setClipChildren(false);
                f12.d.setClipToPadding(false);
                f12.e = new ai.c0(f12, parentActivity);
                View view = new View(parentActivity);
                f12.f = view;
                view.setBackgroundColor(2130706432);
                f12.e.addView(f12.f, b8.mf.e(-1, -2, 80));
                f12.e.setFocusable(false);
                f12.d.addView(f12.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f12.e.setLayoutParams(layoutParams);
                f12.e.setFitsSystemWindows(true);
                f12.e.setOnApplyWindowInsetsListener(new uy0(f12, 0));
                f12.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f12.e.getContext(), f12);
                f12.K0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f12);
                org.telegram.ui.Components.p7 p7Var = new org.telegram.ui.Components.p7(i15, parentActivity, f12);
                f12.G = p7Var;
                p7Var.setTitleColor(-1);
                f12.G.setSubtitleColor(-1);
                f12.G.setBackgroundColor(2130706432);
                f12.G.setOccupyStatusBar(true);
                f12.G.C(1090519039, false);
                f12.G.D(-1, false);
                f12.G.setBackButtonImage(R.drawable.ic_ab_back);
                f12.G.setTitleRightMargin(org.telegram.messenger.g0.L(70.0f));
                f12.e.addView(f12.G, b8.mf.c(-2.0f, -1));
                int i17 = 10;
                f12.G.setActionBarMenuOnItemClick(new vs0(f12, i17));
                gi.l3 l3Var = new gi.l3(parentActivity, 1);
                f12.r = l3Var;
                l3Var.o(1.0f, -26.0f);
                f12.r.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                f12.e.addView(f12.r, b8.mf.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                bz0 bz0Var = new bz0(f12, parentActivity);
                f12.n = bz0Var;
                f12.e.addView(bz0Var, b8.mf.d(org.telegram.messenger.hs.E1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                mr0 mr0Var = new mr0(f12, i12);
                f12.T = new cz0(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.S = view2;
                view2.setBackgroundColor(2130706432);
                f12.T.addView(f12.S, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(f12.e.getContext());
                f12.R = k5Var;
                k5Var.setTextColor(-1);
                f12.R.setGravity(53);
                f12.R.setTextSize(14);
                f12.R.setImportantForAccessibility(2);
                f12.T.addView(f12.R, b8.mf.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(i17, parentActivity, f12);
                f12.Q = r0Var;
                org.telegram.ui.Components.o51 o51Var = new org.telegram.ui.Components.o51(r0Var);
                f12.P = o51Var;
                o51Var.z = org.telegram.messenger.g0.L(2.0f);
                org.telegram.ui.Components.o51 o51Var2 = f12.P;
                o51Var2.k = 872415231;
                o51Var2.l = 872415231;
                o51Var2.m = -1;
                o51Var2.n = -1;
                o51Var2.A = 1509949439;
                o51Var2.j = mr0Var;
                f12.T.addView(f12.Q);
                f12.e.addView(f12.T, b8.mf.e(-1, 48, 80));
                lo0 lo0Var = new lo0(null, new ei.b());
                f12.X = lo0Var;
                lo0Var.j0 = true;
                lo0Var.h0 = false;
                cq0 cq0Var = new cq0(f12.e.getContext());
                f12.Y = cq0Var;
                cq0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.vy0
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new bq0(parentActivity, secretMediaViewer.Z, secretMediaViewer.X, new c5(secretMediaViewer, 22), new qd0(secretMediaViewer, 2));
                    }
                });
                f12.Y.setVisibility(4);
                if (!f12.v1) {
                    f12.v1 = true;
                    f12.Y.setLayerType(2, null);
                    f12.Y.getCurrentView().setLayerType(2, null);
                    f12.Y.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f12.U = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(64.0f), 1711276032));
                org.telegram.ui.Components.je0 je0Var = new org.telegram.ui.Components.je0(28);
                f12.V = je0Var;
                je0Var.setCallback(f12.U);
                f12.U.setImageDrawable(f12.V);
                f12.U.setScaleType(ImageView.ScaleType.CENTER);
                f12.U.setScaleX(0.6f);
                f12.U.setScaleY(0.6f);
                f12.U.setAlpha(0.0f);
                f12.U.setPivotX(org.telegram.messenger.g0.L(32.0f));
                f12.U.setPivotY(org.telegram.messenger.g0.L(32.0f));
                f12.e.addView(f12.U, b8.mf.e(64, 64, 17));
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
                imageReceiver.V0 = true;
                org.telegram.ui.Cells.t9 n4 = f12.X.n(f12.d.getContext());
                if (n4 != null) {
                    org.telegram.messenger.g0.E2(n4);
                    f12.e.addView(n4);
                }
                f12.X.S(f12.e);
                f12.X.i0 = true;
            }
            SecretMediaViewer.f().h(messageObject, wmVar3.ab, Hb, Z4);
            return;
        }
        if (org.telegram.messenger.zi.I2(messageObject.F0()) && org.telegram.messenger.zi.j1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(org.telegram.messenger.zi.j1(messageObject.F0()));
            org.telegram.ui.Components.pu puVar = new org.telegram.ui.Components.pu(wmVar3, wmVar3.getParentActivity(), wmVar3.ya, arrayList3);
            boolean T9 = wmVar3.T9();
            puVar.i0 = T9;
            puVar.n = T9;
            wmVar3.showDialog(puVar);
            return;
        }
        if (org.telegram.messenger.zi.k1(messageObject.k) != null) {
            org.telegram.ui.Components.xv0 xv0Var = new org.telegram.ui.Components.xv0(wmVar3.getParentActivity(), wmVar3, org.telegram.messenger.zi.k1(messageObject.k), null, (wmVar3.d1.getVisibility() == 0 || !((chat = wmVar3.e) == null || org.telegram.messenger.t3.t(chat))) ? null : wmVar3.a0, wmVar3.ya);
            boolean T92 = wmVar3.T9();
            xv0Var.i0 = T92;
            xv0Var.n = T92;
            wmVar3.showDialog(xv0Var);
            return;
        }
        if (org.telegram.messenger.zi.M4(messageObject.k) || (i3 = messageObject.D) == 1 || ((i3 == 0 && !messageObject.b5()) || org.telegram.messenger.zi.u3(messageObject.k))) {
            if (messageObject.s4()) {
                if (org.telegram.messenger.zi.u3(messageObject.k) || org.telegram.messenger.zi.T3(messageObject.k)) {
                    wmVar3.ja(messageObject, true, false);
                    if (messageObject.R0 != null) {
                        sf.b bVar2 = wmVar3.bc;
                        if (bVar2 != null) {
                            bVar2.a(true);
                        }
                        wmVar3.bc = q1Var.getMessageObject() == null ? null : new am(this, q1Var, i12);
                        sf.c.s(wmVar3.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, wmVar3.bc, null, false, wmVar3.getMessagesController().d6, false, false);
                        return;
                    }
                    return;
                }
                if (org.telegram.messenger.zi.M4(messageObject.k)) {
                    wmVar3.ja(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.h2() > 0 && !messageObject.h3) {
                messageObject.c0 = (float) (messageObject.h2() / messageObject.L0());
            }
            wmVar3.Ha(q1Var, messageObject);
            return;
        }
        int i18 = messageObject.D;
        if (i18 == 3) {
            wmVar3.Hb(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    org.telegram.messenger.w7 fileLoader = wmVar3.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.w7.N(message2, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity2 = wmVar3.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity2, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                wmVar3.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                wmVar3.L6(messageObject);
                return;
            }
        }
        if (i18 == 4) {
            if (org.telegram.messenger.g0.J1(wmVar3)) {
                if (!messageObject.D3()) {
                    la0 la0Var = new la0(wmVar3.h != null ? 0 : 3);
                    la0Var.H0 = wmVar3;
                    la0Var.G0(messageObject);
                    wmVar3.presentFragment(la0Var);
                    return;
                }
                TLRPC.Chat chat2 = wmVar3.e;
                la0 la0Var2 = new la0((chat2 == null || org.telegram.messenger.t3.n(chat2) || wmVar3.e.megagroup) ? 2 : 6);
                la0Var2.H0 = wmVar3;
                la0Var2.G0(messageObject);
                wmVar3.presentFragment(la0Var2);
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
                org.telegram.messenger.w7 fileLoader2 = wmVar3.getFileLoader();
                TLRPC.Message message3 = messageObject.k;
                fileLoader2.getClass();
                File N = org.telegram.messenger.w7.N(message3, false, true);
                if (N.exists()) {
                    file = N;
                }
            }
            org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, messageObject.I0(), null, true);
            if (v != null) {
                wmVar3.presentFragment(new l71(v));
                return;
            }
            wmVar3.M4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer.v1().N2(null, wmVar3, wmVar3.ya);
            PhotoViewer v12 = PhotoViewer.v1();
            int i19 = messageObject.D;
            v12.i2(messageObject, wmVar3, i19 != 0 ? wmVar3.k6 : 0L, i19 != 0 ? wmVar3.c7 : 0L, i19 != 0 ? wmVar3.b() : 0L, wmVar3.ab);
            wmVar = wmVar3;
            z11 = true;
        } else {
            wmVar = wmVar3;
            z11 = false;
        }
        Pattern pattern = org.telegram.ui.Components.k80.a;
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
            if (!org.telegram.ui.Components.k80.j(messageObject)) {
                wmVar2 = wmVar;
                if (z11) {
                    try {
                        org.telegram.messenger.g0.u2(messageObject, wmVar2.getParentActivity(), wmVar2.ya, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        wmVar2.L6(messageObject);
                        return;
                    }
                }
                return;
            }
        }
        if (wmVar.getParentActivity() == null) {
            wmVar2 = wmVar;
        } else {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, wmVar.getParentActivity(), wmVar.ya);
            s1Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            s1Var.setOnCancelListener(new eg(0, zArr));
            s1Var.r(150L);
            wm wmVar4 = wmVar;
            o4.b1 b1Var = new o4.b1(wmVar4, messageObject, s1Var, zArr, 13);
            wmVar2 = wmVar4;
            messageObject = messageObject;
            new Thread(b1Var).start();
        }
        z11 = true;
        if (z11) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t1(org.telegram.ui.Cells.q1 q1Var) {
        wm.e5(this.a, q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        f(q1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void v() {
        this.a.Bc();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void w(org.telegram.ui.Cells.q1 q1Var) {
        int i3;
        int i10;
        zi ziVar;
        org.telegram.messenger.zi primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.a3 = !primaryMessageObject.a3;
        primaryMessageObject.K1 = true;
        wm wmVar = this.a;
        wi wiVar = wmVar.A0;
        if (wiVar != null && (ziVar = wmVar.C0) != null && ziVar.y < 0) {
            for (int childCount = wiVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = wmVar.A0.getChildAt(childCount);
                wmVar.A0.getClass();
                i3 = RecyclerView.R(childAt);
                if (i3 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = wmVar.f9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = wmVar.f9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i3 = -1;
        i10 = 0;
        wmVar.Vc(primaryMessageObject, false);
        gi.l3 l3Var = wmVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (i3 < 0 || q1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        wmVar.C0.h1(i3, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final boolean w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        int i3;
        int i10;
        boolean z10;
        int i11;
        int i12;
        String str;
        boolean z11;
        y4 y4Var;
        qj qjVar;
        pj pjVar;
        if (!h()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.t3.K(chat, false));
        wm wmVar = this.a;
        int i13 = (isEmpty || wmVar.e == null || ((qjVar = wmVar.d1) != null && qjVar.getVisibility() == 0) || ((pjVar = wmVar.T) != null && pjVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = wmVar.e;
        int i14 = (chat2 == null || !(wmVar.s4 == 0 || wmVar.w4) || (org.telegram.messenger.t3.T(chat2) && !wmVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = wmVar.e;
        int i15 = (chat3 == null || chat3.id != chat.id || wmVar.da()) ? 1 : 0;
        e5[] e5VarArr = new e5[i15 + 1 + i13 + i14];
        e5VarArr[0] = e5.d;
        if (i15 != 0) {
            e5VarArr[1] = chat.broadcast ? e5.e : e5.f;
            i3 = 2;
        } else {
            i3 = 1;
        }
        if (i13 != 0) {
            e5VarArr[i3] = e5.n;
            i3++;
        }
        if (i14 != 0) {
            e5VarArr[i3] = e5.r;
        }
        TLRPC.ChatFull N0 = wmVar.getMessagesController().N0(chat.id);
        if (N0 != null) {
            y4Var = y4.a(chat, N0, e5VarArr);
            i11 = i13;
            i12 = i14;
            z10 = true;
            str = null;
            z11 = i15;
        } else {
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 0, chat);
            org.telegram.messenger.ac m11 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 1, chat);
            String str2 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z10 = true;
            i11 = i13;
            i12 = i14;
            str = null;
            z11 = i15;
            y4Var = new y4(m10, m11, null, str2, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, e5VarArr, new x4(i10, org.telegram.messenger.hs.T, chat));
        }
        if (b4.n.i(y4Var)) {
            b4.n.p().C((ViewGroup) wmVar.fragmentView, wmVar.ya, y4Var, new b7(this, chat, q1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(wmVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.bd.M0(2131747794, str), new sl(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, org.telegram.messenger.bd.M0(z12 ? 2131747819 : 2131747807, str), new p1(this, q1Var, chat, 25), z11);
        H.l(R.drawable.msg_mention, org.telegram.messenger.bd.M0(2131748617, str), new sl(this, chat, z10 ? 1 : 0), i11);
        H.l(R.drawable.msg_search, org.telegram.messenger.bd.M0(2131753758, str), new sl(this, chat, 2), i12);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean x0(org.telegram.messenger.zi ziVar) {
        return !this.a.s.containsKey(ziVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wm wmVar = this.a;
        if (wmVar.V9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (wmVar.getParentActivity() != null) {
            if (wmVar.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        wmVar.za(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
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
                org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) wmVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) wmVar.ya, false);
                t2Var.N();
                t2Var.P = str;
                t2Var.Q = false;
                t2Var.R = true;
                CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131751767, null)};
                u uVar = new u(2, wmVar, str);
                t2Var.M = charSequenceArr;
                t2Var.L = uVar;
                wmVar.showDialog(t2Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject;
        TLRPC.MessageReplies messageReplies;
        int i3;
        long j10;
        org.telegram.messenger.ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.zi) arrayList.get(0);
                org.telegram.messenger.zi ziVar = messageObject;
                messageReplies = ziVar.k.replies;
                if (messageReplies == null) {
                    i3 = messageReplies.read_max_id;
                    j10 = messageReplies.channel_id;
                } else {
                    i3 = -1;
                    j10 = 0;
                }
                int i10 = i3;
                long j11 = j10;
                wm wmVar = this.a;
                wmVar.Aa(wmVar.e.id, ziVar, ziVar.f1(), j11, i10, 0, null);
            }
        }
        messageObject = q1Var.getMessageObject();
        org.telegram.messenger.zi ziVar2 = messageObject;
        messageReplies = ziVar2.k.replies;
        if (messageReplies == null) {
        }
        int i102 = i3;
        long j112 = j10;
        wm wmVar2 = this.a;
        wmVar2.Aa(wmVar2.e.id, ziVar2, ziVar2.f1(), j112, i102, 0, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
        th.b bVar = this.a.hd;
        if (bVar == null || bVar.n != q1Var) {
            return;
        }
        bVar.x.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean y1() {
        wm wmVar = this.a;
        return wmVar.m1.getKeyboardHeight() + wmVar.Ia >= org.telegram.messenger.g0.L(20.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final String z(long j10) {
        TLRPC.Peer peer;
        String C0;
        wm wmVar = this.a;
        if (org.telegram.messenger.l10.u(wmVar.f)) {
            return null;
        }
        TLRPC.Chat chat = wmVar.e;
        if (chat != null && !org.telegram.messenger.t3.V(chat) && (C0 = wmVar.getMessagesController().C0(wmVar.e.id, j10)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = wmVar.r4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j10 || peer.channel_id == j10 || peer.chat_id == j10)) {
            return null;
        }
        return org.telegram.messenger.bd.M0(2131744030, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Components.t5 m10;
        wm wmVar = this.a;
        if (wmVar.A3 || org.telegram.messenger.az.A0 || wmVar.A0 == null || wmVar.getParentActivity() == null || wmVar.fragmentView == null) {
            return;
        }
        gi.l3 l3Var = wmVar.I2;
        if (l3Var == null || !l3Var.W) {
            if (l3Var == null) {
                int indexOfChild = wmVar.m1.indexOfChild(wmVar.U);
                if (indexOfChild == -1) {
                    return;
                }
                gi.l3 D6 = wmVar.D6(250.0f, 3, indexOfChild + 1, false);
                wmVar.I2 = D6;
                D6.d = 10000L;
                D6.m(wmVar.getParentActivity().getResources().getDrawable(R.drawable.tooltip_sound).mutate());
                wmVar.I2.u(org.telegram.messenger.bd.M0(2131753762, null));
            }
            int childCount = wmVar.A0.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = wmVar.A0.getChildAt(i3);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.zi.M4(messageObject.k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !wmVar.I2.W) {
                    ImageReceiver photoImage = q1Var.getPhotoImage();
                    float u92 = wmVar.u9(q1Var, photoImage.M0);
                    float f10 = photoImage.O0;
                    View view = (View) q1Var.getParent();
                    float u93 = wmVar.u9(q1Var, -q1Var.getTop());
                    if (u92 <= org.telegram.messenger.g0.L(80.0f)) {
                        continue;
                    } else if ((u92 + f10) - u93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                        wmVar.Ib = q1Var;
                        gi.l3 l3Var2 = wmVar.I2;
                        l3Var2.r0 = new xe(wmVar, 23);
                        l3Var2.x(wmVar.t9(q1Var, q1Var.getNoSoundIconCenterX()), u92, true);
                        org.telegram.messenger.az.D(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        boolean z10 = q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        wm wmVar = this.a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().k.media).channels.get(i3).longValue();
            if (wmVar.k6 != j10) {
                wmVar.presentFragment(wm.ra(j10));
            } else {
                wmVar.p1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            wmVar.presentFragment(ProfileActivity.A4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().k.media).winners.get(i3).longValue()));
        }
    }
}
