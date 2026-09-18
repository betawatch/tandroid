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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x2(int i10, l90 l90Var) {
        this.a = 0;
        this.b = i10;
        this.c = l90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        CharSequence replaceTags;
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.vu0 vu0Var;
        int i12 = this.a;
        int i13 = 5;
        int i14 = 0;
        int i15 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                l90 l90Var = (l90) obj;
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
                l90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new m1(privacyRules, i14)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 1:
                ((o8) obj).b(i15);
                break;
            case 2:
                kd kdVar = (kd) obj;
                ci.f4 f4Var = kdVar.d1;
                if (kdVar.b1 != i15) {
                    kdVar.setTimer(i15);
                    Utilities.Callback callback = kdVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        replaceTags = LocaleController.getString(kdVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        f4Var.h = kdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.e0 = AndroidUtilities.dp(0);
                        f4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(kdVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        f4Var.h = kdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.e0 = AndroidUtilities.dp(0);
                        f4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(kdVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i15, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = ci.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.e0 = AndroidUtilities.dp(2);
                        f4Var.d0 = 0.0f;
                    }
                    f4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), kdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (kdVar instanceof org.telegram.ui.ct0 ? -1.0f : 1.0f));
                    f4Var.s(replaceTags);
                    ij0 ij0Var = new ij0(i15 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    ij0Var.start();
                    f4Var.j(ij0Var);
                    f4Var.u();
                    kdVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(kdVar.p1);
                    kdVar.invalidate();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.c5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 4:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (i15 == pmVar.O && qmVar.w.isShown()) {
                    qmVar.w.e(1, true);
                    break;
                }
                break;
            case 5:
                kz kzVar = (kz) obj;
                if (kzVar.P1) {
                    ly lyVar = kzVar.t1;
                    if (lyVar != null && lyVar.k()) {
                        try {
                            kzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.Q1 = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new x2(kzVar, max, i13), max);
                    break;
                }
                break;
            case 6:
                ((xa0) obj).b.run(Integer.valueOf(i15));
                break;
            case 7:
                yf0 yf0Var = (yf0) obj;
                org.telegram.ui.iu0 iu0Var = yf0Var.a;
                TextView textView = iu0Var.e;
                ci.eb ebVar = iu0Var.h;
                RadialProgressView radialProgressView = iu0Var.n;
                TextView textView2 = iu0Var.d;
                textView.setVisibility(8);
                iu0Var.f.setVisibility(8);
                LinearLayout linearLayout = iu0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new xf0(yf0Var, i14));
                }
                if (ebVar.getAlpha() == 1.0f) {
                    ebVar.animate().cancel();
                    ebVar.animate().alpha(0.0f).setDuration(150L).setListener(new xf0(yf0Var, 1));
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
                        textView.setOnClickListener(new g80(yf0Var, 7));
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
            case 8:
                gj0 gj0Var = (gj0) obj;
                gj0Var.V0 = false;
                if (gj0Var.W0) {
                    gj0Var.C(true);
                    break;
                } else {
                    gj0Var.a1 = i15;
                    gj0Var.I();
                    gj0Var.x();
                    break;
                }
            case 9:
                ((kv0) obj).d1(i15);
                break;
            case 10:
                ((du0) obj).h.scrollBy(0, i15);
                break;
            case 11:
                kv0 kv0Var = ((ct0) obj).a;
                org.telegram.ui.ActionBar.n2 n2Var = kv0Var.v1;
                if (n2Var != null) {
                    if (kv0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = kv0.d0(i15, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(kv0Var.d1.id);
                        TLRPC.ChatFull chatFull = kv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = kv0.d0(i15, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = kv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(kv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    kv0Var.v1(true);
                    break;
                }
                break;
            case 12:
                ((ix0) obj).l0(i15, 0);
                break;
            case 13:
                v41 v41Var = (v41) obj;
                v41Var.U();
                v41Var.g0 = i15;
                k41.I(v41Var.f0);
                v41Var.V();
                break;
            case 14:
                ((w81) obj).v.y0(i15);
                break;
            case 15:
                q91 q91Var = (q91) obj;
                u71 u71Var = q91Var.a;
                if (i15 == -1) {
                    if (u71Var.y()) {
                        u71Var.B();
                        q91Var.n();
                    }
                    q91Var.J = false;
                    break;
                } else if (i15 == 1) {
                    if (q91Var.K) {
                        q91Var.K = false;
                        u71Var.C();
                        break;
                    }
                } else if (i15 != -3 && i15 == -2 && u71Var.y()) {
                    q91Var.K = true;
                    u71Var.B();
                    q91Var.n();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    i60Var.y3 = Integer.valueOf(i15);
                }
                xc xcVar = new xc(i60Var.topBulletinContainer, new ai.a1());
                Resources resources = i60Var.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.i60.g1(i15)).k(i60Var.n1());
                break;
            case 17:
                org.telegram.ui.i60 i60Var2 = ((org.telegram.ui.l50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    i60Var2.y3 = Integer.valueOf(i15);
                }
                xc xcVar2 = new xc(i60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = i60Var2.getContext().getResources();
                if (i15 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.i60.g1(i15)).k(i60Var2.n1());
                break;
            case 18:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = e70Var.n.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = e70Var.n.getChildAt(i17);
                    e70Var.n.getClass();
                    if (RecyclerView.S(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(e70Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e70Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 19:
                org.telegram.ui.jd0 jd0Var = (org.telegram.ui.jd0) obj;
                jd0Var.Y.h1(0, -AndroidUtilities.dp(i15));
                jd0Var.A0(false);
                break;
            case 20:
                ((org.telegram.ui.he0) obj).a.f[i15].l(1.0f);
                break;
            case 21:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i15);
                break;
            case 22:
                ((org.telegram.ui.il0) obj).run(Integer.valueOf(i15));
                break;
            case 23:
                ((org.telegram.ui.pp0) obj).e.p0.I.E(1 - i15);
                break;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i18 = i15 + 1;
                if (i18 < 6 && (vu0Var = photoViewer.e0) != null) {
                    vu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new x2(photoViewer, i18, 24), 100L);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string2;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i15, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 26:
                org.telegram.ui.y01 y01Var = (org.telegram.ui.y01) obj;
                org.telegram.ui.z01 z01Var = y01Var.h;
                NotificationCenter notificationCenter = z01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = z01Var.e;
                int i19 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i19);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(y01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i19);
                profileActivity2.e5(false, false);
                break;
            case 27:
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) obj;
                AndroidUtilities.hideKeyboard(o21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = o21Var.a;
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
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj;
                s4.o0 layoutManager = d31Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = d31Var.R ? i15 > d31Var.L ? Math.min(i15 + 1, d31Var.b.d.size() - 1) : Math.max(i15 - 1, 0) : i15;
                    org.telegram.ui.a31 a31Var = d31Var.c;
                    a31Var.a = min2;
                    layoutManager.w0(a31Var);
                }
                d31Var.L = i15;
                break;
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.p81 p81Var = sessionsActivity.a;
                if (p81Var != null) {
                    p81Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
