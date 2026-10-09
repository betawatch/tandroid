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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.wi1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nd(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        CharSequence replaceTags;
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.wu0 wu0Var;
        int i12 = this.a;
        int i13 = 3;
        int i14 = 0;
        int i15 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                od odVar = (od) obj;
                ci.d4 d4Var = odVar.d1;
                if (odVar.b1 != i15) {
                    odVar.setTimer(i15);
                    Utilities.Callback callback = odVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        replaceTags = LocaleController.getString(odVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        d4Var.h = odVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.e0 = AndroidUtilities.dp(0);
                        d4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(odVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        d4Var.h = odVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.e0 = AndroidUtilities.dp(0);
                        d4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(odVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i15, new Object[0]));
                        d4Var.p(true);
                        d4Var.h = ci.d4.a(replaceTags, d4Var.getTextPaint());
                        d4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        d4Var.e0 = AndroidUtilities.dp(2);
                        d4Var.d0 = 0.0f;
                    }
                    d4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), odVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (odVar instanceof org.telegram.ui.ct0 ? -1.0f : 1.0f));
                    d4Var.s(replaceTags);
                    ck0 ck0Var = new ck0(i15 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    ck0Var.start();
                    d4Var.j(ck0Var);
                    d4Var.u();
                    odVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(odVar.p1);
                    odVar.invalidate();
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                gg ggVar = chatActivityEnterView.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView.d5 == null) {
                        ggVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 2:
                gn gnVar = (gn) obj;
                hn hnVar = gnVar.P;
                if (i15 == gnVar.O && hnVar.w.isShown()) {
                    hnVar.w.e(1, true);
                    break;
                }
                break;
            case 3:
                a00 a00Var = (a00) obj;
                if (a00Var.P1) {
                    az azVar = a00Var.t1;
                    if (azVar != null && azVar.k()) {
                        try {
                            a00Var.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    a00Var.Q1 = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new nd(a00Var, max, i13), max);
                    break;
                }
                break;
            case 4:
                ((qb0) obj).b.run(Integer.valueOf(i15));
                break;
            case 5:
                rg0 rg0Var = (rg0) obj;
                org.telegram.ui.ju0 ju0Var = rg0Var.a;
                TextView textView = ju0Var.e;
                ci.bb bbVar = ju0Var.h;
                RadialProgressView radialProgressView = ju0Var.n;
                TextView textView2 = ju0Var.d;
                textView.setVisibility(8);
                ju0Var.f.setVisibility(8);
                LinearLayout linearLayout = ju0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new qg0(rg0Var, i14));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new qg0(rg0Var, 1));
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
                        textView.setOnClickListener(new b90(rg0Var, 6));
                        break;
                    } else {
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                        break;
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                    break;
                }
            case 6:
                ak0 ak0Var = (ak0) obj;
                ak0Var.V0 = false;
                if (ak0Var.W0) {
                    ak0Var.C(true);
                    break;
                } else {
                    ak0Var.a1 = i15;
                    ak0Var.I();
                    ak0Var.x();
                    break;
                }
            case 7:
                ((bw0) obj).d1(i15);
                break;
            case 8:
                ((uu0) obj).h.scrollBy(0, i15);
                break;
            case 9:
                bw0 bw0Var = ((tt0) obj).a;
                org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
                if (n2Var != null) {
                    if (bw0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = bw0.d0(i15, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(bw0Var.d1.id);
                        TLRPC.ChatFull chatFull = bw0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = bw0.d0(i15, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = bw0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(bw0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    bw0Var.v1(true);
                    break;
                }
                break;
            case 10:
                ((yx0) obj).k0(i15, 0);
                break;
            case 11:
                m51 m51Var = (m51) obj;
                m51Var.V();
                m51Var.g0 = i15;
                b51.J(m51Var.f0);
                m51Var.W();
                break;
            case 12:
                ((n91) obj).v.x0(i15);
                break;
            case 13:
                ha1 ha1Var = (ha1) obj;
                k81 k81Var = ha1Var.a;
                if (i15 == -1) {
                    if (k81Var.y()) {
                        k81Var.B();
                        ha1Var.n();
                    }
                    ha1Var.J = false;
                    break;
                } else if (i15 == 1) {
                    if (ha1Var.K) {
                        ha1Var.K = false;
                        k81Var.C();
                        break;
                    }
                } else if (i15 != -3 && i15 == -2 && k81Var.y()) {
                    ha1Var.K = true;
                    k81Var.B();
                    ha1Var.n();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    g60Var.y3 = Integer.valueOf(i15);
                }
                ad adVar = new ad(g60Var.topBulletinContainer, new ai.a1());
                Resources resources = g60Var.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                adVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.g60.h1(i15)).k(g60Var.o1());
                break;
            case 15:
                org.telegram.ui.g60 g60Var2 = ((org.telegram.ui.j50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    g60Var2.y3 = Integer.valueOf(i15);
                }
                ad adVar2 = new ad(g60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = g60Var2.getContext().getResources();
                if (i15 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                adVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.g60.h1(i15)).k(g60Var2.o1());
                break;
            case 16:
                org.telegram.ui.c70 c70Var = (org.telegram.ui.c70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = c70Var.n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = c70Var.n.getChildAt(i16);
                    c70Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(c70Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / c70Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 17:
                org.telegram.ui.hd0 hd0Var = (org.telegram.ui.hd0) obj;
                hd0Var.Y.h1(0, -AndroidUtilities.dp(i15));
                hd0Var.z0(false);
                break;
            case 18:
                ((org.telegram.ui.fe0) obj).a.f[i15].l(1.0f);
                break;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i15);
                break;
            case 20:
                ((org.telegram.ui.il0) obj).run(Integer.valueOf(i15));
                break;
            case 21:
                ((org.telegram.ui.np0) obj).e.p0.I.D(1 - i15);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i17 = i15 + 1;
                if (i17 < 6 && (wu0Var = photoViewer.e0) != null) {
                    wu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new nd(photoViewer, i17, 22), 100L);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i15, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 24:
                org.telegram.ui.x01 x01Var = (org.telegram.ui.x01) obj;
                org.telegram.ui.y01 y01Var = x01Var.h;
                NotificationCenter notificationCenter = y01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = y01Var.e;
                int i18 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i18);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    of.f.s(x01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i18);
                profileActivity2.e5(false, false);
                break;
            case 25:
                org.telegram.ui.n21 n21Var = (org.telegram.ui.n21) obj;
                AndroidUtilities.hideKeyboard(n21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = n21Var.a;
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
            case 26:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj;
                s4.p0 layoutManager = d31Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = d31Var.R ? i15 > d31Var.L ? Math.min(i15 + 1, d31Var.b.d.size() - 1) : Math.max(i15 - 1, 0) : i15;
                    org.telegram.ui.a31 a31Var = d31Var.c;
                    a31Var.a = min2;
                    layoutManager.w0(a31Var);
                }
                d31Var.L = i15;
                break;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.u81 u81Var = sessionsActivity.a;
                if (u81Var != null) {
                    u81Var.l();
                    break;
                }
                break;
            case 28:
                wi1 wi1Var = (wi1) obj;
                wi1Var.F.setSignalBarCount(i15);
                if (i15 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = wi1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    wi1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.c3 c3Var2 = wi1Var.v;
                    if (c3Var2.V != 2) {
                        c3Var2.V = 2;
                        c3Var2.c();
                        ValueAnimator valueAnimator = c3Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            c3Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(c3Var2.H, 0);
                        c3Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var2, 0));
                        c3Var2.O.setDuration(500L);
                        c3Var2.O.start();
                    }
                    wi1Var.F.c(false);
                    break;
                }
            default:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                HashSet hashSet = k0Var.A;
                hashSet.remove(Integer.valueOf(i15));
                if (hashSet.isEmpty()) {
                    k0Var.P();
                    break;
                }
                break;
        }
    }
}
