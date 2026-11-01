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
import org.telegram.ui.zd1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        org.telegram.ui.zr0 zr0Var;
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
                org.telegram.ui.lr0 lr0Var = ue0Var.a;
                TextView textView = lr0Var.e;
                bi.t0 t0Var = lr0Var.h;
                RadialProgressView radialProgressView = lr0Var.n;
                TextView textView2 = lr0Var.d;
                textView.setVisibility(8);
                lr0Var.f.setVisibility(8);
                LinearLayout linearLayout = lr0Var.c;
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
                                textView2.setText(org.telegram.messenger.dd.L0(2131742856, null));
                                break;
                            } else if (i17 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.dd.L0(2131742857, null));
                        textView.setText(org.telegram.messenger.dd.L0(2131742855, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new db0(ue0Var, 4));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.dd.L0(2131742859, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.dd.L0(2131742858, null));
                    break;
                }
                break;
            case 4:
                ai0 ai0Var = (ai0) obj;
                ai0Var.V0 = false;
                if (ai0Var.W0) {
                    ai0Var.C(true);
                    break;
                } else {
                    ai0Var.a1 = i17;
                    ai0Var.I();
                    ai0Var.x();
                    break;
                }
            case 5:
                y31 y31Var = (y31) obj;
                y31Var.e1();
                y31Var.Y1 = i17;
                n31.S0(y31Var.X1);
                y31Var.f1();
                break;
            case 6:
                ((w71) obj).w.y0(i17);
                break;
            case 7:
                n81 n81Var = (n81) obj;
                v61 v61Var = n81Var.a;
                if (i17 == -1) {
                    if (v61Var.d0()) {
                        v61Var.g0();
                        n81Var.n();
                    }
                    n81Var.J = false;
                    break;
                } else if (i17 == 1) {
                    if (n81Var.K) {
                        n81Var.K = false;
                        v61Var.h0();
                        break;
                    }
                } else if (i17 != -3 && i17 == -2 && v61Var.d0()) {
                    n81Var.K = true;
                    v61Var.g0();
                    n81Var.n();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.a50 a50Var = (org.telegram.ui.a50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    a50Var.p5 = Integer.valueOf(i17);
                }
                cc ccVar = new cc(a50Var.E, new so0());
                Resources resources = a50Var.getContext().getResources();
                if (i17 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i17 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ccVar.M(resources.getDrawable(i10).mutate(), org.telegram.ui.a50.i1(i17)).k(a50Var.p1());
                break;
            case 9:
                org.telegram.ui.a50 a50Var2 = ((org.telegram.ui.e40) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    a50Var2.p5 = Integer.valueOf(i17);
                }
                cc ccVar2 = new cc(a50Var2.E, new so0());
                Resources resources2 = a50Var2.getContext().getResources();
                if (i17 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i17 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ccVar2.M(resources2.getDrawable(i11).mutate(), org.telegram.ui.a50.i1(i17)).k(a50Var2.p1());
                break;
            case 10:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = u50Var.n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = u50Var.n.getChildAt(i18);
                    u50Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(u50Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / u50Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 11:
                org.telegram.ui.q60 q60Var = (org.telegram.ui.q60) obj;
                int i19 = org.telegram.ui.q60.D;
                q60Var.a(R.drawable.intro_powerful_mask, 17, i17, true);
                q60Var.c();
                q60Var.b(q60Var.w, 23, true);
                q60Var.d();
                Intro.a(i17);
                break;
            case 12:
                org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) obj;
                xb0Var.W.h1(0, -org.telegram.messenger.i0.L(i17));
                xb0Var.P0(false);
                break;
            case 13:
                ((org.telegram.ui.vc0) obj).a.f[i17].C(1.0f);
                break;
            case 14:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.g(i17);
                break;
            case 15:
                ((org.telegram.ui.ej0) obj).a(Integer.valueOf(i17));
                break;
            case 16:
                ((org.telegram.ui.en0) obj).e.p0.I.E(1 - i17);
                break;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i17 + 1;
                if (i20 < 6 && (zr0Var = photoViewer.e0) != null) {
                    zr0Var.invalidate();
                    org.telegram.messenger.i0.h3(new qq(photoViewer, i20, i13), 100L);
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                String L0 = org.telegram.messenger.dd.L0(2131746662, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131746663, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new i2.q(profileActivity, i17, 19));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 19:
                org.telegram.ui.vx0 vx0Var = (org.telegram.ui.vx0) obj;
                ProfileActivity profileActivity2 = vx0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, org.telegram.messenger.at.s1);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().h4(0L, "PREMIUM_GRACE");
                    gf.f.r(vx0Var.getContext(), profileActivity2.getMessagesController().M5);
                } else {
                    profileActivity2.getMessagesController().h4(0L, i17 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, org.telegram.messenger.at.s1);
                profileActivity2.D5(false, false);
                break;
            case 20:
                org.telegram.ui.iz0 iz0Var = (org.telegram.ui.iz0) obj;
                org.telegram.messenger.i0.v1(iz0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = iz0Var.a;
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
                sessionsActivity.r0();
                org.telegram.ui.n41 n41Var = sessionsActivity.a;
                if (n41Var != null) {
                    n41Var.f();
                    break;
                }
                break;
            case 22:
                zd1 zd1Var = (zd1) obj;
                zd1Var.F.setSignalBarCount(i17);
                if (i17 <= 1) {
                    org.telegram.ui.Components.voip.k2 k2Var = zd1Var.w;
                    if (k2Var.V != 3) {
                        k2Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(k2Var.H, org.telegram.messenger.at.e4);
                        k2Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.h2(k2Var, 2));
                        k2Var.O.setDuration(500L);
                        k2Var.O.start();
                    }
                    zd1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.k2 k2Var2 = zd1Var.w;
                    if (k2Var2.V != 2) {
                        k2Var2.V = 2;
                        k2Var2.c();
                        ValueAnimator valueAnimator = k2Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            k2Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(k2Var2.H, 0);
                        k2Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.h2(k2Var2, 0));
                        k2Var2.O.setDuration(500L);
                        k2Var2.O.start();
                    }
                    zd1Var.F.c(false);
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
                org.telegram.messenger.at f7 = org.telegram.messenger.at.f(i17);
                org.telegram.ui.Wallet.z zVar = new org.telegram.ui.Wallet.z(f7, (org.telegram.ui.if0) obj, x10);
                f7.b(zVar, org.telegram.messenger.at.a4);
                org.telegram.messenger.i0.h3(zVar, 10000L);
                if (x10.e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                zVar.a();
                break;
            case 25:
                org.telegram.messenger.at.f(i17).n((org.telegram.ui.Wallet.g2) obj, org.telegram.messenger.at.a4);
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
                        k8Var.d0();
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
