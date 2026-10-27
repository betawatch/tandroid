package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h2(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence replaceTags;
        int i10;
        int i11;
        org.telegram.ui.ku0 ku0Var;
        int i12 = this.a;
        int i13 = 0;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new x1((MessagesStorage.BooleanCallback) obj, i14), 250L);
                break;
            case 1:
                aa0 aa0Var = (aa0) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i15).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < privacyRules.size()) {
                            if (privacyRules.get(i16) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i16) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i16) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i16++;
                            }
                        }
                    }
                }
                aa0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new m1(privacyRules, i13)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 2:
                ((r8) obj).b(i15);
                break;
            case 3:
                jd jdVar = (jd) obj;
                fi.v3 v3Var = jdVar.d1;
                if (jdVar.b1 != i15) {
                    jdVar.setTimer(i15);
                    Utilities.Callback callback = jdVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        replaceTags = LocaleController.getString(jdVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        v3Var.h = jdVar.getMeasuredWidth();
                        v3Var.p(false);
                        v3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        v3Var.e0 = AndroidUtilities.dp(0);
                        v3Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(jdVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        v3Var.h = jdVar.getMeasuredWidth();
                        v3Var.p(false);
                        v3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        v3Var.e0 = AndroidUtilities.dp(0);
                        v3Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(jdVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i15, new Object[0]));
                        v3Var.p(true);
                        v3Var.h = fi.v3.a(replaceTags, v3Var.getTextPaint());
                        v3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        v3Var.e0 = AndroidUtilities.dp(2);
                        v3Var.d0 = 0.0f;
                    }
                    v3Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), jdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (jdVar instanceof org.telegram.ui.rs0 ? -1.0f : 1.0f));
                    v3Var.s(replaceTags);
                    yj0 yj0Var = new yj0(i15 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yj0Var.start();
                    v3Var.j(yj0Var);
                    v3Var.u();
                    jdVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(jdVar.p1);
                    jdVar.invalidate();
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.h5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.t(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 5:
                bn bnVar = (bn) obj;
                cn cnVar = bnVar.P;
                if (i15 == bnVar.O && cnVar.w.isShown()) {
                    cnVar.w.d(1, true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    k3Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i15);
                    U.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 7:
                sz szVar = (sz) obj;
                if (szVar.P1) {
                    ty tyVar = szVar.t1;
                    if (tyVar != null && tyVar.k()) {
                        try {
                            szVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    szVar.Q1 = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new h2(szVar, max, 7), max);
                    break;
                }
                break;
            case 8:
                ((ib0) obj).b.run(Integer.valueOf(i15));
                break;
            case 9:
                mg0 mg0Var = (mg0) obj;
                org.telegram.ui.xt0 xt0Var = mg0Var.a;
                TextView textView = xt0Var.e;
                bi.cc ccVar = xt0Var.h;
                RadialProgressView radialProgressView = xt0Var.n;
                TextView textView2 = xt0Var.d;
                textView.setVisibility(8);
                xt0Var.f.setVisibility(8);
                LinearLayout linearLayout = xt0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new lg0(mg0Var, i13));
                }
                if (ccVar.getAlpha() == 1.0f) {
                    ccVar.animate().cancel();
                    ccVar.animate().alpha(0.0f).setDuration(150L).setListener(new lg0(mg0Var, 1));
                }
                if (i15 != 2) {
                    int i17 = 5;
                    if (i15 != 5) {
                        if (i15 != 150) {
                            if (i15 == 100) {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                break;
                            } else if (i15 != 101) {
                            }
                        }
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                        textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new x80(mg0Var, i17));
                        break;
                    } else {
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                        break;
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                    break;
                }
            case 10:
                wj0 wj0Var = (wj0) obj;
                wj0Var.V0 = false;
                if (wj0Var.W0) {
                    wj0Var.C(true);
                    break;
                } else {
                    wj0Var.a1 = i15;
                    wj0Var.I();
                    wj0Var.x();
                    break;
                }
            case 11:
                s51 s51Var = (s51) obj;
                s51Var.U();
                s51Var.g0 = i15;
                g51.R(s51Var.f0);
                s51Var.V();
                break;
            case 12:
                ((u91) obj).v.y0(i15);
                break;
            case 13:
                na1 na1Var = (na1) obj;
                t81 t81Var = na1Var.a;
                if (i15 == -1) {
                    if (t81Var.y()) {
                        t81Var.B();
                        na1Var.n();
                    }
                    na1Var.J = false;
                    break;
                } else if (i15 == 1) {
                    if (na1Var.K) {
                        na1Var.K = false;
                        t81Var.C();
                        break;
                    }
                } else if (i15 != -3 && i15 == -2 && t81Var.y()) {
                    na1Var.K = true;
                    t81Var.B();
                    na1Var.n();
                    break;
                }
                break;
            case 14:
                try {
                    ((dc1) obj).g(i15);
                    break;
                } catch (Exception unused2) {
                    return;
                }
            case 15:
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    x50Var.y3 = Integer.valueOf(i15);
                }
                wc wcVar = new wc(x50Var.topBulletinContainer, new di.k0());
                Resources resources = x50Var.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                wcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.x50.g1(i15)).k(x50Var.n1());
                break;
            case 16:
                org.telegram.ui.x50 x50Var2 = ((org.telegram.ui.a50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    x50Var2.y3 = Integer.valueOf(i15);
                }
                wc wcVar2 = new wc(x50Var2.topBulletinContainer, new di.k0());
                Resources resources2 = x50Var2.getContext().getResources();
                if (i15 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                wcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.x50.g1(i15)).k(x50Var2.n1());
                break;
            case 17:
                org.telegram.ui.t60 t60Var = (org.telegram.ui.t60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = t60Var.n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = t60Var.n.getChildAt(i18);
                    t60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(t60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / t60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 18:
                org.telegram.ui.p70 p70Var = (org.telegram.ui.p70) obj;
                int i19 = R.drawable.intro_powerful_mask;
                int i20 = org.telegram.ui.p70.y;
                p70Var.b(i19, 17, i15, true);
                p70Var.d();
                p70Var.c(p70Var.v, 23, true);
                p70Var.f();
                Intro.setBackgroundColor(i15);
                break;
            case 19:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) obj;
                rc0Var.Y.h1(0, -AndroidUtilities.dp(i15));
                rc0Var.B0(false);
                break;
            case 20:
                ((org.telegram.ui.qd0) obj).a.f[i15].l(1.0f);
                break;
            case 21:
                org.telegram.ui.zj0 zj0Var = (org.telegram.ui.zj0) ((bi.e5) obj).c;
                zj0Var.l0(i15, true);
                if (i15 == 0) {
                    zj0Var.k0();
                    break;
                }
                break;
            case 22:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i15);
                break;
            case 23:
                ((org.telegram.ui.bl0) obj).run(Integer.valueOf(i15));
                break;
            case 24:
                ((org.telegram.ui.gp0) obj).e.p0.I.E(1 - i15);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i21 = i15 + 1;
                if (i21 < 6 && (ku0Var = photoViewer.e0) != null) {
                    ku0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new h2(photoViewer, i21, 25), 100L);
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i22 = ProfileActivity.R6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string2;
                e2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i15, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 27:
                org.telegram.ui.k01 k01Var = (org.telegram.ui.k01) obj;
                org.telegram.ui.l01 l01Var = k01Var.h;
                NotificationCenter notificationCenter = l01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = l01Var.e;
                int i23 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i23);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    qf.d.r(k01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addWeakObserver(profileActivity2, i23);
                profileActivity2.p5(false, false);
                break;
            case 28:
                org.telegram.ui.d21 d21Var = (org.telegram.ui.d21) obj;
                AndroidUtilities.hideKeyboard(d21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = d21Var.a;
                    if (i13 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i13 != 0 && ((i15 != 3 || i13 != 4) && ((i15 != 2 || (i13 != 4 && i13 != 1)) && (i15 != 1 || (i13 != 1 && i13 != 2 && i13 != 3))))) {
                            editTextBoldCursorArr[i13].setText((CharSequence) null);
                        }
                        i13++;
                    }
                }
                break;
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f.remove(i15);
                sessionsActivity.n0();
                org.telegram.ui.p71 p71Var = sessionsActivity.a;
                if (p71Var != null) {
                    p71Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
