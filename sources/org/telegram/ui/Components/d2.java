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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d2(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence replaceTags;
        int i10;
        int i11;
        org.telegram.ui.eu0 eu0Var;
        int i12 = this.a;
        int i13 = 1;
        int i14 = 0;
        int i15 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new t1((MessagesStorage.BooleanCallback) obj, i13), 250L);
                break;
            case 1:
                y90 y90Var = (y90) obj;
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
                y90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new n1(privacyRules, i14)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
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
                    x3Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), kdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (kdVar instanceof org.telegram.ui.ls0 ? -1.0f : 1.0f));
                    x3Var.s(replaceTags);
                    yj0 yj0Var = new yj0(i15 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yj0Var.start();
                    x3Var.j(yj0Var);
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
                    ogVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 5:
                an anVar = (an) obj;
                bn bnVar = anVar.P;
                if (i15 == anVar.O && bnVar.w.isShown()) {
                    bnVar.w.d(1, true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    h3Var.dismiss();
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
                    AndroidUtilities.runOnUIThread(new d2(tzVar, max, 7), max);
                    break;
                }
                break;
            case 8:
                ((kb0) obj).b.run(Integer.valueOf(i15));
                break;
            case 9:
                og0 og0Var = (og0) obj;
                org.telegram.ui.rt0 rt0Var = og0Var.a;
                TextView textView = rt0Var.e;
                ai.jc jcVar = rt0Var.h;
                RadialProgressView radialProgressView = rt0Var.n;
                TextView textView2 = rt0Var.d;
                textView.setVisibility(8);
                rt0Var.f.setVisibility(8);
                LinearLayout linearLayout = rt0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new ng0(og0Var, i14));
                }
                if (jcVar.getAlpha() == 1.0f) {
                    jcVar.animate().cancel();
                    jcVar.animate().alpha(0.0f).setDuration(150L).setListener(new ng0(og0Var, 1));
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
                        textView.setOnClickListener(new v80(og0Var, 6));
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
                ((xv0) obj).g1(i15);
                break;
            case 12:
                ((ux0) obj).k0(i15, 0);
                break;
            case 13:
                k51 k51Var = (k51) obj;
                k51Var.U();
                k51Var.g0 = i15;
                y41.R(k51Var.f0);
                k51Var.V();
                break;
            case 14:
                ((k91) obj).v.x0(i15);
                break;
            case 15:
                da1 da1Var = (da1) obj;
                j81 j81Var = da1Var.a;
                if (i15 == -1) {
                    if (j81Var.y()) {
                        j81Var.B();
                        da1Var.n();
                    }
                    da1Var.J = false;
                    break;
                } else if (i15 == 1) {
                    if (da1Var.K) {
                        da1Var.K = false;
                        j81Var.C();
                        break;
                    }
                } else if (i15 != -3 && i15 == -2 && j81Var.y()) {
                    da1Var.K = true;
                    j81Var.B();
                    da1Var.n();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    u50Var.y3 = Integer.valueOf(i15);
                }
                xc xcVar = new xc(u50Var.topBulletinContainer, new ci.k0());
                Resources resources = u50Var.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.u50.g1(i15)).k(u50Var.n1());
                break;
            case 17:
                org.telegram.ui.u50 u50Var2 = ((org.telegram.ui.w40) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    u50Var2.y3 = Integer.valueOf(i15);
                }
                xc xcVar2 = new xc(u50Var2.topBulletinContainer, new ci.k0());
                Resources resources2 = u50Var2.getContext().getResources();
                if (i15 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.u50.g1(i15)).k(u50Var2.n1());
                break;
            case 18:
                org.telegram.ui.p60 p60Var = (org.telegram.ui.p60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = p60Var.n.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = p60Var.n.getChildAt(i17);
                    p60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(p60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / p60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 19:
                org.telegram.ui.l70 l70Var = (org.telegram.ui.l70) obj;
                int i18 = R.drawable.intro_powerful_mask;
                int i19 = org.telegram.ui.l70.y;
                l70Var.b(i18, 17, i15, true);
                l70Var.d();
                l70Var.c(l70Var.v, 23, true);
                l70Var.f();
                Intro.setBackgroundColor(i15);
                break;
            case 20:
                org.telegram.ui.sc0 sc0Var = (org.telegram.ui.sc0) obj;
                sc0Var.Y.h1(0, -AndroidUtilities.dp(i15));
                sc0Var.A0(false);
                break;
            case 21:
                ((org.telegram.ui.rd0) obj).a.f[i15].l(1.0f);
                break;
            case 22:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i15);
                break;
            case 23:
                ((org.telegram.ui.tk0) obj).run(Integer.valueOf(i15));
                break;
            case 24:
                ((org.telegram.ui.yo0) obj).e.p0.I.D(1 - i15);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i15 + 1;
                if (i20 < 6 && (eu0Var = photoViewer.e0) != null) {
                    eu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new d2(photoViewer, i20, 25), 100L);
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string2;
                c2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i15, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 27:
                org.telegram.ui.e01 e01Var = (org.telegram.ui.e01) obj;
                org.telegram.ui.f01 f01Var = e01Var.h;
                NotificationCenter notificationCenter = f01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = f01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.r(e01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i21);
                profileActivity2.i5(false, false);
                break;
            case 28:
                org.telegram.ui.w11 w11Var = (org.telegram.ui.w11) obj;
                AndroidUtilities.hideKeyboard(w11Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = w11Var.a;
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
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.l71 l71Var = sessionsActivity.a;
                if (l71Var != null) {
                    l71Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
