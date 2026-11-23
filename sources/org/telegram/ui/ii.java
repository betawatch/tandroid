package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        CharSequence W2;
        int i10 = this.a;
        int i11 = R.drawable.msg_voice_phone;
        int i12 = 0;
        int i13 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                bn bnVar = ((gi) obj).g;
                if (bnVar.ac == i13) {
                    bnVar.pb();
                    break;
                }
                break;
            case 1:
                bn bnVar2 = ((hi) obj).g;
                if (bnVar2.ac == i13) {
                    bnVar2.pb();
                    break;
                }
                break;
            case 2:
                bn bnVar3 = ((hi) obj).g;
                if (bnVar3.ac == i13) {
                    bnVar3.pb();
                    break;
                }
                break;
            case 3:
                bn bnVar4 = ((pl) obj).x0;
                bnVar4.C0.h1(i13, bnVar4.O4);
                break;
            case 4:
                i7 = ((org.telegram.ui.ActionBar.g2) ((mm) obj).a).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(i13, true);
                break;
            case 5:
                org.telegram.messenger.ks.f(i13).k(4, new Object[0]);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.z1((org.telegram.messenger.lr) obj, 1), 250L);
                break;
            case 6:
                org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) obj;
                ArrayList v = org.telegram.messenger.i5.r(i13).v(11);
                String str = null;
                String N0 = org.telegram.messenger.gd.N0(2131751229, null);
                if (v != null && !v.isEmpty()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < v.size()) {
                            if (v.get(i14) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                N0 = org.telegram.messenger.gd.N0(2131751229, str);
                            } else {
                                if ((v.get(i14) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i14) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str = null;
                                    N0 = org.telegram.messenger.gd.N0(2131751230, null);
                                } else {
                                    str = null;
                                }
                                i14++;
                            }
                        }
                    }
                }
                j80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(N0, new org.telegram.ui.Components.n1(i12, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                break;
            case 7:
                ((org.telegram.messenger.pe) obj).u(i13);
                break;
            case 8:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                hi.u3 u3Var = ycVar.d1;
                if (ycVar.b1 != i13) {
                    ycVar.setTimer(i13);
                    org.telegram.messenger.w10 w10Var = ycVar.r1;
                    if (w10Var != null) {
                        w10Var.a(Integer.valueOf(i13));
                    }
                    if (i13 == 0) {
                        W2 = org.telegram.messenger.gd.N0(ycVar.q1 ? 2131743883 : 2131743888, null);
                        u3Var.h = ycVar.getMeasuredWidth();
                        u3Var.r(false);
                        u3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        u3Var.f0 = org.telegram.messenger.g0.L(0);
                        u3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i13 == Integer.MAX_VALUE) {
                        W2 = org.telegram.messenger.gd.N0(ycVar.q1 ? 2131743882 : 2131743887, null);
                        u3Var.h = ycVar.getMeasuredWidth();
                        u3Var.r(false);
                        u3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        u3Var.f0 = org.telegram.messenger.g0.L(0);
                        u3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i13 > 0) {
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i13, ycVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                        u3Var.r(true);
                        u3Var.h = hi.u3.a(W2, u3Var.getTextPaint());
                        u3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                        u3Var.f0 = org.telegram.messenger.g0.L(2);
                        u3Var.e0 = 0.0f;
                    }
                    u3Var.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), ycVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f)) * (ycVar instanceof ap0 ? -1.0f : 1.0f));
                    u3Var.v(W2);
                    org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(i13 > 0 ? R.raw.fire_on : R.raw.fire_off, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    nh0Var.start();
                    u3Var.m(nh0Var);
                    u3Var.x();
                    ycVar.o1 = false;
                    org.telegram.messenger.g0.r(ycVar.p1);
                    ycVar.invalidate();
                    break;
                }
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i13 == 0) {
                    chatActivityEnterView.q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    if (chatActivityEnterView.e7 == null) {
                        egVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.d2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.w4) {
                        chatActivityEnterView.w4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                org.telegram.ui.Components.mg mgVar = chatActivityEnterView.P3;
                if (mgVar != null) {
                    mgVar.u(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 10:
                ((ji.g) obj).a(Integer.valueOf(i13));
                break;
            case 11:
                ((ji.g) obj).a(Integer.valueOf(i13));
                break;
            case 12:
                org.telegram.ui.Components.om omVar = (org.telegram.ui.Components.om) obj;
                org.telegram.ui.Components.pm pmVar = omVar.Q;
                if (i13 == omVar.P && pmVar.x.isShown()) {
                    pmVar.x.d(1, true);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    w2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i13);
                    T.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.qy qyVar = (org.telegram.ui.Components.qy) obj;
                if (qyVar.Q1) {
                    org.telegram.ui.Components.qx qxVar = qyVar.u1;
                    if (qxVar != null && qxVar.k()) {
                        try {
                            qyVar.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    qyVar.R1 = true;
                    int max = Math.max(50, i13 - 100);
                    org.telegram.messenger.g0.h3(new ii(qyVar, max, 14), max);
                    break;
                }
                break;
            case 15:
                ((org.telegram.ui.Components.t90) obj).b.a(Integer.valueOf(i13));
                break;
            case 16:
                org.telegram.ui.Components.je0 je0Var = (org.telegram.ui.Components.je0) obj;
                dq0 dq0Var = je0Var.a;
                TextView textView = dq0Var.e;
                bi.o3 o3Var = dq0Var.h;
                RadialProgressView radialProgressView = dq0Var.n;
                TextView textView2 = dq0Var.d;
                textView.setVisibility(8);
                dq0Var.f.setVisibility(8);
                LinearLayout linearLayout = dq0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.ie0(je0Var, i12));
                }
                if (o3Var.getAlpha() == 1.0f) {
                    o3Var.animate().cancel();
                    o3Var.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.ie0(je0Var, 1));
                }
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 150) {
                            if (i13 == 100) {
                                textView2.setText(org.telegram.messenger.gd.N0(2131742560, null));
                                break;
                            } else if (i13 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.gd.N0(2131742561, null));
                        textView.setText(org.telegram.messenger.gd.N0(2131742559, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new org.telegram.ui.Components.g70(je0Var, 6));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.gd.N0(2131742563, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.gd.N0(2131742562, null));
                    break;
                }
            case 17:
                org.telegram.ui.Components.lh0 lh0Var = (org.telegram.ui.Components.lh0) obj;
                lh0Var.W0 = false;
                if (lh0Var.X0) {
                    lh0Var.C(true);
                    break;
                } else {
                    lh0Var.b1 = i13;
                    lh0Var.I();
                    lh0Var.x();
                    break;
                }
            case 18:
                org.telegram.ui.Components.l31 l31Var = (org.telegram.ui.Components.l31) obj;
                l31Var.f1();
                l31Var.c2 = i13;
                org.telegram.ui.Components.a31.U0(l31Var.b2);
                l31Var.g1();
                break;
            case 19:
                ((org.telegram.ui.Components.j71) obj).w.y0(i13);
                break;
            case 20:
                org.telegram.ui.Components.a81 a81Var = (org.telegram.ui.Components.a81) obj;
                org.telegram.ui.Components.h61 h61Var = a81Var.a;
                if (i13 == -1) {
                    if (h61Var.d0()) {
                        h61Var.g0();
                        a81Var.n();
                    }
                    a81Var.K = false;
                    break;
                } else if (i13 == 1) {
                    if (a81Var.L) {
                        a81Var.L = false;
                        h61Var.h0();
                        break;
                    }
                } else if (i13 != -3 && i13 == -2 && h61Var.d0()) {
                    a81Var.L = true;
                    h61Var.g0();
                    a81Var.n();
                    break;
                }
                break;
            case 21:
                e40 e40Var = (e40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i13);
                    e40Var.x5 = Integer.valueOf(i13);
                }
                org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(e40Var.F, new fi.h0());
                Resources resources = e40Var.getContext().getResources();
                if (i13 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i13 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i11 = R.drawable.msg_voice_headphones;
                    }
                }
                kcVar.M(resources.getDrawable(i11).mutate(), e40.k1(i13)).k(e40Var.r1());
                break;
            case 22:
                e40 e40Var2 = ((j30) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i13);
                    e40Var2.x5 = Integer.valueOf(i13);
                }
                org.telegram.ui.Components.kc kcVar2 = new org.telegram.ui.Components.kc(e40Var2.F, new fi.h0());
                Resources resources2 = e40Var2.getContext().getResources();
                if (i13 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i13 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i11 = R.drawable.msg_voice_headphones;
                    }
                }
                kcVar2.M(resources2.getDrawable(i11).mutate(), e40.k1(i13)).k(e40Var2.r1());
                break;
            case 23:
                y40 y40Var = (y40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = y40Var.n.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = y40Var.n.getChildAt(i15);
                    y40Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i13) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(y40Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / y40Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 24:
                u50 u50Var = (u50) obj;
                int i16 = u50.E;
                u50Var.a(R.drawable.intro_powerful_mask, 17, i13, true);
                u50Var.c();
                u50Var.b(u50Var.w, 23, true);
                u50Var.d();
                Intro.a(i13);
                break;
            case 25:
                pa0 pa0Var = (pa0) obj;
                pa0Var.V.h1(0, -org.telegram.messenger.g0.L(i13));
                pa0Var.N0(false);
                break;
            case 26:
                ((ob0) obj).a.f[i13].D(1.0f);
                break;
            case 27:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i13);
                break;
            case 28:
                ((bi0) obj).a(Integer.valueOf(i13));
                break;
            default:
                ((wl0) obj).e.q0.J.C(1 - i13);
                break;
        }
    }

    public /* synthetic */ ii(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
