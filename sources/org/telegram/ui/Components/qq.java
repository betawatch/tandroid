package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.be1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qq(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.as0 as0Var;
        CharSequence text;
        int i12 = this.a;
        int i13 = 17;
        int i14 = 3;
        int i15 = 1;
        int i16 = 0;
        int i17 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    z2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i17);
                    T.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 1:
                vy vyVar = (vy) obj;
                if (vyVar.P1) {
                    vx vxVar = vyVar.t1;
                    if (vxVar != null && vxVar.k()) {
                        try {
                            vyVar.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    vyVar.Q1 = true;
                    int max = Math.max(50, i17 - 100);
                    org.telegram.messenger.i0.h3(new qq(vyVar, max, i15), max);
                    break;
                }
                break;
            case 2:
                ((z90) obj).b.a(Integer.valueOf(i17));
                break;
            case 3:
                ue0 ue0Var = (ue0) obj;
                org.telegram.ui.mr0 mr0Var = ue0Var.a;
                TextView textView = mr0Var.e;
                bi.t0 t0Var = mr0Var.h;
                RadialProgressView radialProgressView = mr0Var.n;
                TextView textView2 = mr0Var.d;
                textView.setVisibility(8);
                mr0Var.f.setVisibility(8);
                LinearLayout linearLayout = mr0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new te0(ue0Var, i16));
                }
                if (t0Var.getAlpha() == 1.0f) {
                    t0Var.animate().cancel();
                    t0Var.animate().alpha(0.0f).setDuration(150L).setListener(new te0(ue0Var, i15));
                }
                if (i17 != 2) {
                    if (i17 != 5) {
                        if (i17 != 150) {
                            if (i17 == 100) {
                                textView2.setText(org.telegram.messenger.cd.L0(2131742856, null));
                                break;
                            } else if (i17 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.cd.L0(2131742857, null));
                        textView.setText(org.telegram.messenger.cd.L0(2131742855, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new db0(ue0Var, 4));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.cd.L0(2131742859, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.cd.L0(2131742858, null));
                    break;
                }
                break;
            case 4:
                zh0 zh0Var = (zh0) obj;
                zh0Var.V0 = false;
                if (zh0Var.W0) {
                    zh0Var.C(true);
                    break;
                } else {
                    zh0Var.a1 = i17;
                    zh0Var.I();
                    zh0Var.x();
                    break;
                }
            case 5:
                x31 x31Var = (x31) obj;
                x31Var.e1();
                x31Var.Y1 = i17;
                m31.S0(x31Var.X1);
                x31Var.f1();
                break;
            case 6:
                ((v71) obj).w.y0(i17);
                break;
            case 7:
                m81 m81Var = (m81) obj;
                u61 u61Var = m81Var.a;
                if (i17 == -1) {
                    if (u61Var.d0()) {
                        u61Var.g0();
                        m81Var.n();
                    }
                    m81Var.J = false;
                    break;
                } else if (i17 == 1) {
                    if (m81Var.K) {
                        m81Var.K = false;
                        u61Var.h0();
                        break;
                    }
                } else if (i17 != -3 && i17 == -2 && u61Var.d0()) {
                    m81Var.K = true;
                    u61Var.g0();
                    m81Var.n();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.b50 b50Var = (org.telegram.ui.b50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    b50Var.p5 = Integer.valueOf(i17);
                }
                cc ccVar = new cc(b50Var.E, new ro0());
                Resources resources = b50Var.getContext().getResources();
                if (i17 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i17 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ccVar.M(resources.getDrawable(i10).mutate(), org.telegram.ui.b50.i1(i17)).k(b50Var.p1());
                break;
            case 9:
                org.telegram.ui.b50 b50Var2 = ((org.telegram.ui.f40) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    b50Var2.p5 = Integer.valueOf(i17);
                }
                cc ccVar2 = new cc(b50Var2.E, new ro0());
                Resources resources2 = b50Var2.getContext().getResources();
                if (i17 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i17 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ccVar2.M(resources2.getDrawable(i11).mutate(), org.telegram.ui.b50.i1(i17)).k(b50Var2.p1());
                break;
            case 10:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = v50Var.n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = v50Var.n.getChildAt(i18);
                    v50Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(v50Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / v50Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 11:
                org.telegram.ui.r60 r60Var = (org.telegram.ui.r60) obj;
                int i19 = org.telegram.ui.r60.D;
                r60Var.a(R.drawable.intro_powerful_mask, 17, i17, true);
                r60Var.c();
                r60Var.b(r60Var.w, 23, true);
                r60Var.d();
                Intro.a(i17);
                break;
            case 12:
                org.telegram.ui.yb0 yb0Var = (org.telegram.ui.yb0) obj;
                yb0Var.W.h1(0, -org.telegram.messenger.i0.L(i17));
                yb0Var.O0(false);
                break;
            case 13:
                ((org.telegram.ui.wc0) obj).a.f[i17].C(1.0f);
                break;
            case 14:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.g(i17);
                break;
            case 15:
                ((org.telegram.ui.gj0) obj).a(Integer.valueOf(i17));
                break;
            case 16:
                ((org.telegram.ui.gn0) obj).e.p0.I.E(1 - i17);
                break;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i17 + 1;
                if (i20 < 6 && (as0Var = photoViewer.e0) != null) {
                    as0Var.invalidate();
                    org.telegram.messenger.i0.h3(new qq(photoViewer, i20, i13), 100L);
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.R6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                String L0 = org.telegram.messenger.cd.L0(2131746662, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131746663, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new i2.q(profileActivity, i17, 19));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 19:
                org.telegram.ui.wx0 wx0Var = (org.telegram.ui.wx0) obj;
                ProfileActivity profileActivity2 = wx0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, org.telegram.messenger.zs.s1);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().h4(0L, "PREMIUM_GRACE");
                    gf.f.r(wx0Var.getContext(), profileActivity2.getMessagesController().M5);
                } else {
                    profileActivity2.getMessagesController().h4(0L, i17 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, org.telegram.messenger.zs.s1);
                profileActivity2.C5(false, false);
                break;
            case 20:
                org.telegram.ui.jz0 jz0Var = (org.telegram.ui.jz0) obj;
                org.telegram.messenger.i0.v1(jz0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = jz0Var.a;
                    if (i16 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i16 != 0 && ((i17 != 3 || i16 != 4) && ((i17 != 2 || (i16 != 4 && i16 != 1)) && (i17 != 1 || (i16 != 1 && i16 != 2 && i16 != 3))))) {
                            editTextBoldCursorArr[i16].setText((CharSequence) null);
                        }
                        i16++;
                    }
                }
                break;
            case 21:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f.remove(i17);
                sessionsActivity.q0();
                org.telegram.ui.p41 p41Var = sessionsActivity.a;
                if (p41Var != null) {
                    p41Var.f();
                    break;
                }
                break;
            case 22:
                be1 be1Var = (be1) obj;
                be1Var.F.setSignalBarCount(i17);
                if (i17 <= 1) {
                    org.telegram.ui.Components.voip.j2 j2Var = be1Var.w;
                    if (j2Var.V != 3) {
                        j2Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(j2Var.H, org.telegram.messenger.zs.e4);
                        j2Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.g2(j2Var, 2));
                        j2Var.O.setDuration(500L);
                        j2Var.O.start();
                    }
                    be1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.j2 j2Var2 = be1Var.w;
                    if (j2Var2.V != 2) {
                        j2Var2.V = 2;
                        j2Var2.c();
                        ValueAnimator valueAnimator = j2Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            j2Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(j2Var2.H, 0);
                        j2Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.g2(j2Var2, 0));
                        j2Var2.O.setDuration(500L);
                        j2Var2.O.start();
                    }
                    be1Var.F.c(false);
                    break;
                }
            case 23:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                HashSet hashSet = k0Var.E;
                hashSet.remove(Integer.valueOf(i17));
                if (hashSet.isEmpty()) {
                    k0Var.S();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i17);
                org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i17);
                org.telegram.ui.Wallet.z zVar = new org.telegram.ui.Wallet.z(f7, (org.telegram.ui.f70) obj, x10);
                f7.b(zVar, org.telegram.messenger.zs.a4);
                org.telegram.messenger.i0.h3(zVar, 10000L);
                if (x10.e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                zVar.a();
                break;
            case 25:
                org.telegram.messenger.zs.f(i17).n((org.telegram.ui.Wallet.g2) obj, org.telegram.messenger.zs.a4);
                break;
            case 26:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0(c6Var, i17, org.telegram.ui.Wallet.c6.h(c6Var.R, i17), i14));
                break;
            case 27:
                org.telegram.ui.Wallet.a7 a7Var = (org.telegram.ui.Wallet.a7) obj;
                if (a7Var.r && !a7Var.y && i17 == a7Var.k0) {
                    a7Var.postDelayed(a7Var.l0, 500L);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Wallet.k8 k8Var = (org.telegram.ui.Wallet.k8) obj;
                ArrayList arrayList = k8Var.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) k8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i17 < arrayList.size() && i16 < split.length) {
                            ((org.telegram.ui.Wallet.ra) arrayList.get(i17)).setText(split[i16]);
                            i17++;
                            i16++;
                        }
                        k8Var.c0();
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.ba baVar = (org.telegram.ui.Wallet.ba) obj;
                if (!baVar.r && i17 == baVar.J) {
                    baVar.L = false;
                    baVar.a.f3.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qq(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
