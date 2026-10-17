package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import org.telegram.ui.jh1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e2(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence replaceTags;
        int i10;
        int i11;
        org.telegram.ui.du0 du0Var;
        int i12 = this.a;
        int i13 = 1;
        int i14 = 0;
        int i15 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new u1((MessagesStorage.BooleanCallback) obj, i13), 250L);
                break;
            case 1:
                x90 x90Var = (x90) obj;
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
                x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new n1(privacyRules, i14)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 2:
                ((p8) obj).b(i15);
                break;
            case 3:
                kd kdVar = (kd) obj;
                ei.x3 x3Var = kdVar.d1;
                if (kdVar.b1 != i15) {
                    kdVar.setTimer(i15);
                    Utilities.Callback callback = kdVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        replaceTags = LocaleController.getString(kdVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        x3Var.h = kdVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.e0 = AndroidUtilities.dp(0);
                        x3Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(kdVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        x3Var.h = kdVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.e0 = AndroidUtilities.dp(0);
                        x3Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(kdVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i15, new Object[0]));
                        x3Var.p(true);
                        x3Var.h = ei.x3.a(replaceTags, x3Var.getTextPaint());
                        x3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        x3Var.e0 = AndroidUtilities.dp(2);
                        x3Var.d0 = 0.0f;
                    }
                    x3Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), kdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (kdVar instanceof org.telegram.ui.ks0 ? -1.0f : 1.0f));
                    x3Var.s(replaceTags);
                    uj0 uj0Var = new uj0(i15 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    uj0Var.start();
                    x3Var.j(uj0Var);
                    x3Var.u();
                    kdVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(kdVar.p1);
                    kdVar.invalidate();
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
                    if (chatActivityEnterView.d5 == null) {
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
                    ogVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 5:
                an anVar = (an) obj;
                bn bnVar = anVar.P;
                if (i15 == anVar.O && bnVar.w.isShown()) {
                    bnVar.w.e(1, true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    f3Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i15);
                    U.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 7:
                tz tzVar = (tz) obj;
                if (tzVar.P1) {
                    uy uyVar = tzVar.t1;
                    if (uyVar != null && uyVar.k()) {
                        try {
                            tzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    tzVar.Q1 = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new e2(tzVar, max, 7), max);
                    break;
                }
                break;
            case 8:
                ((jb0) obj).b.run(Integer.valueOf(i15));
                break;
            case 9:
                jg0 jg0Var = (jg0) obj;
                org.telegram.ui.qt0 qt0Var = jg0Var.a;
                TextView textView = qt0Var.e;
                ai.hc hcVar = qt0Var.h;
                RadialProgressView radialProgressView = qt0Var.n;
                TextView textView2 = qt0Var.d;
                textView.setVisibility(8);
                qt0Var.f.setVisibility(8);
                LinearLayout linearLayout = qt0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new ig0(jg0Var, i14));
                }
                if (hcVar.getAlpha() == 1.0f) {
                    hcVar.animate().cancel();
                    hcVar.animate().alpha(0.0f).setDuration(150L).setListener(new ig0(jg0Var, 1));
                }
                if (i15 != 2) {
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
                        textView.setOnClickListener(new u80(jg0Var, 6));
                        break;
                    } else {
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                        break;
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                    break;
                }
                break;
            case 10:
                sj0 sj0Var = (sj0) obj;
                sj0Var.V0 = false;
                if (sj0Var.W0) {
                    sj0Var.C(true);
                    break;
                } else {
                    sj0Var.a1 = i15;
                    sj0Var.I();
                    sj0Var.x();
                    break;
                }
            case 11:
                ((sv0) obj).f1(i15);
                break;
            case 12:
                ((px0) obj).k0(i15, 0);
                break;
            case 13:
                c51 c51Var = (c51) obj;
                c51Var.V();
                c51Var.g0 = i15;
                r41.J(c51Var.f0);
                c51Var.W();
                break;
            case 14:
                ((b91) obj).v.x0(i15);
                break;
            case 15:
                u91 u91Var = (u91) obj;
                a81 a81Var = u91Var.a;
                if (i15 == -1) {
                    if (a81Var.y()) {
                        a81Var.B();
                        u91Var.n();
                    }
                    u91Var.J = false;
                    break;
                } else if (i15 == 1) {
                    if (u91Var.K) {
                        u91Var.K = false;
                        a81Var.C();
                        break;
                    }
                } else if (i15 != -3 && i15 == -2 && a81Var.y()) {
                    u91Var.K = true;
                    a81Var.B();
                    u91Var.n();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    s50Var.y3 = Integer.valueOf(i15);
                }
                xc xcVar = new xc(s50Var.topBulletinContainer, new ci.k0());
                Resources resources = s50Var.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.s50.h1(i15)).k(s50Var.o1());
                break;
            case 17:
                org.telegram.ui.s50 s50Var2 = ((org.telegram.ui.v40) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    s50Var2.y3 = Integer.valueOf(i15);
                }
                xc xcVar2 = new xc(s50Var2.topBulletinContainer, new ci.k0());
                Resources resources2 = s50Var2.getContext().getResources();
                if (i15 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.s50.h1(i15)).k(s50Var2.o1());
                break;
            case 18:
                org.telegram.ui.n60 n60Var = (org.telegram.ui.n60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = n60Var.n.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = n60Var.n.getChildAt(i17);
                    n60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(n60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / n60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 19:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) obj;
                pc0Var.Y.h1(0, -AndroidUtilities.dp(i15));
                pc0Var.z0(false);
                break;
            case 20:
                ((org.telegram.ui.od0) obj).a.f[i15].l(1.0f);
                break;
            case 21:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i15);
                break;
            case 22:
                ((org.telegram.ui.sk0) obj).run(Integer.valueOf(i15));
                break;
            case 23:
                ((org.telegram.ui.wo0) obj).e.p0.I.D(1 - i15);
                break;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i18 = i15 + 1;
                if (i18 < 6 && (du0Var = photoViewer.e0) != null) {
                    du0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new e2(photoViewer, i18, 24), 100L);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string2;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.q(profileActivity, i15, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 26:
                org.telegram.ui.c01 c01Var = (org.telegram.ui.c01) obj;
                org.telegram.ui.d01 d01Var = c01Var.h;
                NotificationCenter notificationCenter = d01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = d01Var.e;
                int i19 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i19);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.r(c01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i19);
                profileActivity2.e5(false, false);
                break;
            case 27:
                org.telegram.ui.u11 u11Var = (org.telegram.ui.u11) obj;
                AndroidUtilities.hideKeyboard(u11Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = u11Var.a;
                    if (i14 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i14 != 0 && ((i15 != 3 || i14 != 4) && ((i15 != 2 || (i14 != 4 && i14 != 1)) && (i15 != 1 || (i14 != 1 && i14 != 2 && i14 != 3))))) {
                            editTextBoldCursorArr[i14].setText((CharSequence) null);
                        }
                        i14++;
                    }
                }
                break;
            case 28:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.j71 j71Var = sessionsActivity.a;
                if (j71Var != null) {
                    j71Var.l();
                    break;
                }
                break;
            default:
                jh1 jh1Var = (jh1) obj;
                jh1Var.F.setSignalBarCount(i15);
                if (i15 <= 1) {
                    org.telegram.ui.Components.voip.a3 a3Var = jh1Var.v;
                    if (a3Var.V != 3) {
                        a3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(a3Var.H, 255);
                        a3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var, 2));
                        a3Var.O.setDuration(500L);
                        a3Var.O.start();
                    }
                    jh1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.a3 a3Var2 = jh1Var.v;
                    if (a3Var2.V != 2) {
                        a3Var2.V = 2;
                        a3Var2.c();
                        ValueAnimator valueAnimator = a3Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            a3Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(a3Var2.H, 0);
                        a3Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var2, 0));
                        a3Var2.O.setDuration(500L);
                        a3Var2.O.start();
                    }
                    jh1Var.F.c(false);
                    break;
                }
        }
    }

    public /* synthetic */ e2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
