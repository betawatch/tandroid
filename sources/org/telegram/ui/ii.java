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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                i7 = ((org.telegram.ui.ActionBar.h2) ((mm) obj).a).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(i14, true);
                break;
            case 3:
                org.telegram.messenger.ks.f(i14).k(4, new Object[0]);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.z1((org.telegram.messenger.lr) obj, 1), 250L);
                break;
            case 4:
                org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) obj;
                ArrayList v = org.telegram.messenger.i5.r(i14).v(11);
                String str = null;
                String M0 = org.telegram.messenger.gd.M0(2131751230, null);
                if (v != null && !v.isEmpty()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < v.size()) {
                            if (v.get(i15) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.gd.M0(2131751230, str);
                            } else {
                                if ((v.get(i15) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i15) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str = null;
                                    M0 = org.telegram.messenger.gd.M0(2131751231, null);
                                } else {
                                    str = null;
                                }
                                i15++;
                            }
                        }
                    }
                }
                k80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(M0, new org.telegram.ui.Components.n1(i12, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                break;
            case 5:
                ((org.telegram.messenger.pe) obj).u(i14);
                break;
            case 6:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                hi.m3 m3Var = ycVar.d1;
                if (ycVar.b1 != i14) {
                    ycVar.setTimer(i14);
                    org.telegram.messenger.x10 x10Var = ycVar.r1;
                    if (x10Var != null) {
                        x10Var.a(Integer.valueOf(i14));
                    }
                    if (i14 == 0) {
                        W2 = org.telegram.messenger.gd.M0(ycVar.q1 ? 2131743893 : 2131743898, null);
                        m3Var.h = ycVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.f0 = org.telegram.messenger.g0.L(0);
                        m3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                        f10 = 1.0f;
                    } else if (i14 == Integer.MAX_VALUE) {
                        W2 = org.telegram.messenger.gd.M0(ycVar.q1 ? 2131743892 : 2131743897, null);
                        m3Var.h = ycVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.f0 = org.telegram.messenger.g0.L(0);
                        f10 = 1.0f;
                        m3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else {
                        f10 = 1.0f;
                        if (i14 > 0) {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i14, ycVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                            m3Var.r(true);
                            m3Var.h = hi.m3.a(W2, m3Var.getTextPaint());
                            m3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                            m3Var.f0 = org.telegram.messenger.g0.L(2);
                            m3Var.e0 = 0.0f;
                        }
                    }
                    m3Var.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), ycVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f)) * (ycVar instanceof bp0 ? -1.0f : f10));
                    m3Var.v(W2);
                    org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(i14 > 0 ? R.raw.fire_on : R.raw.fire_off, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    mh0Var.start();
                    m3Var.m(mh0Var);
                    m3Var.x();
                    ycVar.o1 = false;
                    org.telegram.messenger.g0.r(ycVar.p1);
                    ycVar.invalidate();
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i14 == 0) {
                    chatActivityEnterView.o3 = 0;
                }
                chatActivityEnterView.W0 = null;
                org.telegram.ui.Components.cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    if (chatActivityEnterView.c7 == null) {
                        cgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.b2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.u4) {
                        chatActivityEnterView.u4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                org.telegram.ui.Components.kg kgVar = chatActivityEnterView.N3;
                if (kgVar != null) {
                    kgVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 8:
                ((ji.g) obj).a(Integer.valueOf(i14));
                break;
            case 9:
                ((ji.g) obj).a(Integer.valueOf(i14));
                break;
            case 10:
                org.telegram.ui.Components.om omVar = (org.telegram.ui.Components.om) obj;
                org.telegram.ui.Components.pm pmVar = omVar.Q;
                if (i14 == omVar.P && pmVar.x.isShown()) {
                    pmVar.x.d(1, true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    x2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i14);
                    T.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.ry ryVar = (org.telegram.ui.Components.ry) obj;
                if (ryVar.Q1) {
                    org.telegram.ui.Components.rx rxVar = ryVar.u1;
                    if (rxVar != null && rxVar.k()) {
                        try {
                            ryVar.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    ryVar.R1 = true;
                    int max = Math.max(50, i14 - 100);
                    org.telegram.messenger.g0.h3(new ii(ryVar, max, 12), max);
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Components.u90) obj).b.a(Integer.valueOf(i14));
                break;
            case 14:
                org.telegram.ui.Components.je0 je0Var = (org.telegram.ui.Components.je0) obj;
                dq0 dq0Var = je0Var.a;
                TextView textView = dq0Var.e;
                bi.i3 i3Var = dq0Var.h;
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
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.ie0(je0Var, i12));
                }
                if (i3Var.getAlpha() == 1.0f) {
                    i3Var.animate().cancel();
                    i3Var.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.ie0(je0Var, i13));
                }
                if (i14 != 2) {
                    if (i14 != 5) {
                        if (i14 != 150) {
                            if (i14 == 100) {
                                textView2.setText(org.telegram.messenger.gd.M0(2131742573, null));
                                break;
                            } else if (i14 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.gd.M0(2131742574, null));
                        textView.setText(org.telegram.messenger.gd.M0(2131742572, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new org.telegram.ui.Components.h70(je0Var, 6));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.gd.M0(2131742576, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.gd.M0(2131742575, null));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.kh0 kh0Var = (org.telegram.ui.Components.kh0) obj;
                kh0Var.W0 = false;
                if (kh0Var.X0) {
                    kh0Var.C(true);
                    break;
                } else {
                    kh0Var.b1 = i14;
                    kh0Var.I();
                    kh0Var.x();
                    break;
                }
            case 16:
                org.telegram.ui.Components.k31 k31Var = (org.telegram.ui.Components.k31) obj;
                k31Var.f1();
                k31Var.c2 = i14;
                org.telegram.ui.Components.y21.U0(k31Var.b2);
                k31Var.g1();
                break;
            case 17:
                ((org.telegram.ui.Components.f71) obj).w.y0(i14);
                break;
            case 18:
                org.telegram.ui.Components.w71 w71Var = (org.telegram.ui.Components.w71) obj;
                org.telegram.ui.Components.f61 f61Var = w71Var.a;
                if (i14 == -1) {
                    if (f61Var.d0()) {
                        f61Var.g0();
                        w71Var.n();
                    }
                    w71Var.K = false;
                    break;
                } else if (i14 == 1) {
                    if (w71Var.L) {
                        w71Var.L = false;
                        f61Var.h0();
                        break;
                    }
                } else if (i14 != -3 && i14 == -2 && f61Var.d0()) {
                    w71Var.L = true;
                    f61Var.g0();
                    w71Var.n();
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
                pa0 pa0Var = (pa0) obj;
                pa0Var.V.h1(0, -org.telegram.messenger.g0.L(i14));
                pa0Var.N0(false);
                break;
            case 24:
                ((ob0) obj).a.f[i14].D(1.0f);
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
                String M02 = org.telegram.messenger.gd.M0(2131746452, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M02;
                u1Var.U = org.telegram.messenger.gd.M0(2131746453, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ai.s1(profileActivity, i14, 20));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
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
