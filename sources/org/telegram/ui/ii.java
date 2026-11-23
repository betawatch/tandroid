package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ii(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        float f10;
        CharSequence W2;
        float f11;
        qq0 qq0Var;
        int i10 = this.a;
        int i11 = R.drawable.msg_voice_speaker;
        int i12 = 0;
        int i13 = 1;
        int i14 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                bn bnVar = ((hi) obj).g;
                if (bnVar.ac == i14) {
                    bnVar.pb();
                    break;
                }
                break;
            case 1:
                bn bnVar2 = ((pl) obj).x0;
                bnVar2.C0.h1(i14, bnVar2.O4);
                break;
            case 2:
                i7 = ((org.telegram.ui.ActionBar.g2) ((mm) obj).a).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(i14, true);
                break;
            case 3:
                org.telegram.messenger.ls.f(i14).k(4, new Object[0]);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2((org.telegram.messenger.mr) obj, 1), 250L);
                break;
            case 4:
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) obj;
                ArrayList v = org.telegram.messenger.i5.r(i14).v(11);
                String str = null;
                String N0 = org.telegram.messenger.hd.N0(2131751229, null);
                if (v != null && !v.isEmpty()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < v.size()) {
                            if (v.get(i15) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                N0 = org.telegram.messenger.hd.N0(2131751229, str);
                            } else {
                                if ((v.get(i15) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i15) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str = null;
                                    N0 = org.telegram.messenger.hd.N0(2131751230, null);
                                } else {
                                    str = null;
                                }
                                i15++;
                            }
                        }
                    }
                }
                m80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(N0, new org.telegram.ui.Components.o1(i12, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                break;
            case 5:
                ((org.telegram.messenger.qe) obj).u(i14);
                break;
            case 6:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                hi.l3 l3Var = ycVar.d1;
                if (ycVar.b1 != i14) {
                    ycVar.setTimer(i14);
                    org.telegram.messenger.y10 y10Var = ycVar.r1;
                    if (y10Var != null) {
                        y10Var.a(Integer.valueOf(i14));
                    }
                    if (i14 == 0) {
                        W2 = org.telegram.messenger.hd.N0(ycVar.q1 ? 2131743885 : 2131743890, null);
                        l3Var.h = ycVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f0 = org.telegram.messenger.g0.L(0);
                        l3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                        f10 = 1.0f;
                    } else if (i14 == Integer.MAX_VALUE) {
                        W2 = org.telegram.messenger.hd.N0(ycVar.q1 ? 2131743884 : 2131743889, null);
                        l3Var.h = ycVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f0 = org.telegram.messenger.g0.L(0);
                        f10 = 1.0f;
                        l3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else {
                        f10 = 1.0f;
                        if (i14 > 0) {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i14, ycVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                            l3Var.r(true);
                            l3Var.h = hi.l3.a(W2, l3Var.getTextPaint());
                            l3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                            l3Var.f0 = org.telegram.messenger.g0.L(2);
                            l3Var.e0 = 0.0f;
                        }
                    }
                    l3Var.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), ycVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f)) * (ycVar instanceof bp0 ? -1.0f : f10));
                    l3Var.v(W2);
                    org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(i14 > 0 ? R.raw.fire_on : R.raw.fire_off, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    oh0Var.start();
                    l3Var.m(oh0Var);
                    l3Var.x();
                    ycVar.o1 = false;
                    org.telegram.messenger.g0.r(ycVar.p1);
                    ycVar.invalidate();
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i14 == 0) {
                    chatActivityEnterView.q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                org.telegram.ui.Components.fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null) {
                    if (chatActivityEnterView.e7 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.d2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.w4) {
                        chatActivityEnterView.w4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                org.telegram.ui.Components.ng ngVar = chatActivityEnterView.P3;
                if (ngVar != null) {
                    ngVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 8:
                ((ji.f) obj).a(Integer.valueOf(i14));
                break;
            case 9:
                ((ji.f) obj).a(Integer.valueOf(i14));
                break;
            case 10:
                org.telegram.ui.Components.qm qmVar = (org.telegram.ui.Components.qm) obj;
                org.telegram.ui.Components.rm rmVar = qmVar.Q;
                if (i14 == qmVar.P && rmVar.x.isShown()) {
                    rmVar.x.d(1, true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    w2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i14);
                    T.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.ty tyVar = (org.telegram.ui.Components.ty) obj;
                if (tyVar.Q1) {
                    org.telegram.ui.Components.tx txVar = tyVar.u1;
                    if (txVar != null && txVar.k()) {
                        try {
                            tyVar.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    tyVar.R1 = true;
                    int max = Math.max(50, i14 - 100);
                    org.telegram.messenger.g0.h3(new ii(tyVar, max, 12), max);
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Components.w90) obj).b.a(Integer.valueOf(i14));
                break;
            case 14:
                org.telegram.ui.Components.ke0 ke0Var = (org.telegram.ui.Components.ke0) obj;
                dq0 dq0Var = ke0Var.a;
                TextView textView = dq0Var.e;
                bi.m3 m3Var = dq0Var.h;
                RadialProgressView radialProgressView = dq0Var.n;
                TextView textView2 = dq0Var.d;
                textView.setVisibility(8);
                dq0Var.f.setVisibility(8);
                LinearLayout linearLayout = dq0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    f11 = 1.0f;
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                } else {
                    f11 = 1.0f;
                }
                if (radialProgressView.getAlpha() == f11) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.je0(ke0Var, i12));
                }
                if (m3Var.getAlpha() == 1.0f) {
                    m3Var.animate().cancel();
                    m3Var.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.je0(ke0Var, i13));
                }
                if (i14 != 2) {
                    if (i14 != 5) {
                        if (i14 != 150) {
                            if (i14 == 100) {
                                textView2.setText(org.telegram.messenger.hd.N0(2131742565, null));
                                break;
                            } else if (i14 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.hd.N0(2131742566, null));
                        textView.setText(org.telegram.messenger.hd.N0(2131742564, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new org.telegram.ui.Components.j70(ke0Var, 6));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.hd.N0(2131742568, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.hd.N0(2131742567, null));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.mh0 mh0Var = (org.telegram.ui.Components.mh0) obj;
                mh0Var.W0 = false;
                if (mh0Var.X0) {
                    mh0Var.C(true);
                    break;
                } else {
                    mh0Var.b1 = i14;
                    mh0Var.I();
                    mh0Var.x();
                    break;
                }
            case 16:
                org.telegram.ui.Components.m31 m31Var = (org.telegram.ui.Components.m31) obj;
                m31Var.f1();
                m31Var.c2 = i14;
                org.telegram.ui.Components.b31.U0(m31Var.b2);
                m31Var.g1();
                break;
            case 17:
                ((org.telegram.ui.Components.i71) obj).w.y0(i14);
                break;
            case 18:
                org.telegram.ui.Components.z71 z71Var = (org.telegram.ui.Components.z71) obj;
                org.telegram.ui.Components.i61 i61Var = z71Var.a;
                if (i14 == -1) {
                    if (i61Var.d0()) {
                        i61Var.g0();
                        z71Var.n();
                    }
                    z71Var.K = false;
                    break;
                } else if (i14 == 1) {
                    if (z71Var.L) {
                        z71Var.L = false;
                        i61Var.h0();
                        break;
                    }
                } else if (i14 != -3 && i14 == -2 && i61Var.d0()) {
                    z71Var.L = true;
                    i61Var.g0();
                    z71Var.n();
                    break;
                }
                break;
            case 19:
                f40 f40Var = (f40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i14);
                    f40Var.x5 = Integer.valueOf(i14);
                }
                org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(f40Var.F, new fi.h0());
                Resources resources = f40Var.getContext().getResources();
                if (i14 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i14 != 0) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                lcVar.M(resources.getDrawable(i11).mutate(), f40.k1(i14)).k(f40Var.r1());
                break;
            case 20:
                f40 f40Var2 = ((k30) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i14);
                    f40Var2.x5 = Integer.valueOf(i14);
                }
                org.telegram.ui.Components.lc lcVar2 = new org.telegram.ui.Components.lc(f40Var2.F, new fi.h0());
                Resources resources2 = f40Var2.getContext().getResources();
                if (i14 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i14 != 0) {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                lcVar2.M(resources2.getDrawable(i11).mutate(), f40.k1(i14)).k(f40Var2.r1());
                break;
            case 21:
                z40 z40Var = (z40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = z40Var.n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = z40Var.n.getChildAt(i16);
                    z40Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i14) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(z40Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / z40Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 22:
                u50 u50Var = (u50) obj;
                int i17 = u50.E;
                u50Var.a(R.drawable.intro_powerful_mask, 17, i14, true);
                u50Var.c();
                u50Var.b(u50Var.w, 23, true);
                u50Var.d();
                Intro.a(i14);
                break;
            case 23:
                qa0 qa0Var = (qa0) obj;
                qa0Var.V.h1(0, -org.telegram.messenger.g0.L(i14));
                qa0Var.N0(false);
                break;
            case 24:
                ((pb0) obj).a.f[i14].D(1.0f);
                break;
            case 25:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i14);
                break;
            case 26:
                ((di0) obj).a(Integer.valueOf(i14));
                break;
            case 27:
                ((yl0) obj).e.q0.J.A(1 - i14);
                break;
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                int i18 = i14 + 1;
                if (i18 < 6 && (qq0Var = photoViewer.f0) != null) {
                    qq0Var.invalidate();
                    org.telegram.messenger.g0.h3(new ii(photoViewer, i18, 28), 100L);
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String N02 = org.telegram.messenger.hd.N0(2131746451, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N02;
                t1Var.U = org.telegram.messenger.hd.N0(2131746452, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ai.v1(profileActivity, i14, 20));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ ii(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
