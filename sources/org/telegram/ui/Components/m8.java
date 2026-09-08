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
import org.telegram.ui.ui1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m8(Object obj, int i10, int i11) {
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
        org.telegram.ui.uu0 uu0Var;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 0;
        int i15 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                ((q8) obj).b(i15);
                break;
            case 1:
                ld ldVar = (ld) obj;
                di.f4 f4Var = ldVar.d1;
                if (ldVar.b1 != i15) {
                    ldVar.setTimer(i15);
                    Utilities.Callback callback = ldVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        replaceTags = LocaleController.getString(ldVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        f4Var.h = ldVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.e0 = AndroidUtilities.dp(0);
                        f4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(ldVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        f4Var.h = ldVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.e0 = AndroidUtilities.dp(0);
                        f4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(ldVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i15, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = di.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.e0 = AndroidUtilities.dp(2);
                        f4Var.d0 = 0.0f;
                    }
                    f4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), ldVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (ldVar instanceof org.telegram.ui.bt0 ? -1.0f : 1.0f));
                    f4Var.s(replaceTags);
                    xi0 xi0Var = new xi0(i15 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    xi0Var.start();
                    f4Var.j(xi0Var);
                    f4Var.u();
                    ldVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(ldVar.p1);
                    ldVar.invalidate();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    if (chatActivityEnterView.c5 == null) {
                        egVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 3:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (i15 == pmVar.O && qmVar.w.isShown()) {
                    qmVar.w.e(1, true);
                    break;
                }
                break;
            case 4:
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
                    AndroidUtilities.runOnUIThread(new m8(kzVar, max, i13), max);
                    break;
                }
                break;
            case 5:
                ((pa0) obj).b.run(Integer.valueOf(i15));
                break;
            case 6:
                pf0 pf0Var = (pf0) obj;
                org.telegram.ui.hu0 hu0Var = pf0Var.a;
                TextView textView = hu0Var.e;
                di.eb ebVar = hu0Var.h;
                RadialProgressView radialProgressView = hu0Var.n;
                TextView textView2 = hu0Var.d;
                textView.setVisibility(8);
                hu0Var.f.setVisibility(8);
                LinearLayout linearLayout = hu0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, i14));
                }
                if (ebVar.getAlpha() == 1.0f) {
                    ebVar.animate().cancel();
                    ebVar.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, 1));
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
                        textView.setOnClickListener(new x70(pf0Var, 7));
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
            case 7:
                vi0 vi0Var = (vi0) obj;
                vi0Var.V0 = false;
                if (vi0Var.W0) {
                    vi0Var.A(true);
                    break;
                } else {
                    vi0Var.a1 = i15;
                    vi0Var.G();
                    vi0Var.v();
                    break;
                }
            case 8:
                ((xu0) obj).d1(i15);
                break;
            case 9:
                ((qt0) obj).h.scrollBy(0, i15);
                break;
            case 10:
                xu0 xu0Var = ((ps0) obj).a;
                org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
                if (n2Var != null) {
                    if (xu0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xu0.d0(i15, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(xu0Var.d1.id);
                        TLRPC.ChatFull chatFull = xu0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = xu0.d0(i15, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = xu0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(xu0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xu0Var.v1(true);
                    break;
                }
                break;
            case 11:
                ((vw0) obj).k0(i15, 0);
                break;
            case 12:
                f41 f41Var = (f41) obj;
                f41Var.U();
                f41Var.g0 = i15;
                u31.I(f41Var.f0);
                f41Var.V();
                break;
            case 13:
                ((h81) obj).v.x0(i15);
                break;
            case 14:
                b91 b91Var = (b91) obj;
                g71 g71Var = b91Var.a;
                if (i15 == -1) {
                    if (g71Var.y()) {
                        g71Var.B();
                        b91Var.n();
                    }
                    b91Var.J = false;
                    break;
                } else if (i15 == 1) {
                    if (b91Var.K) {
                        b91Var.K = false;
                        g71Var.C();
                        break;
                    }
                } else if (i15 != -3 && i15 == -2 && g71Var.y()) {
                    b91Var.K = true;
                    g71Var.B();
                    b91Var.n();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    j60Var.y3 = Integer.valueOf(i15);
                }
                yc ycVar = new yc(j60Var.topBulletinContainer, new bi.s0());
                Resources resources = j60Var.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ycVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.j60.g1(i15)).k(j60Var.n1());
                break;
            case 16:
                org.telegram.ui.j60 j60Var2 = ((org.telegram.ui.m50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    j60Var2.y3 = Integer.valueOf(i15);
                }
                yc ycVar2 = new yc(j60Var2.topBulletinContainer, new bi.s0());
                Resources resources2 = j60Var2.getContext().getResources();
                if (i15 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ycVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.j60.g1(i15)).k(j60Var2.n1());
                break;
            case 17:
                org.telegram.ui.f70 f70Var = (org.telegram.ui.f70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = f70Var.n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = f70Var.n.getChildAt(i16);
                    f70Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(f70Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / f70Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 18:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) obj;
                id0Var.Y.h1(0, -AndroidUtilities.dp(i15));
                id0Var.A0(false);
                break;
            case 19:
                ((org.telegram.ui.ge0) obj).a.f[i15].l(1.0f);
                break;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i15);
                break;
            case 21:
                ((org.telegram.ui.il0) obj).run(Integer.valueOf(i15));
                break;
            case 22:
                ((org.telegram.ui.op0) obj).e.p0.I.D(1 - i15);
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                int i17 = i15 + 1;
                if (i17 < 6 && (uu0Var = photoViewer.e0) != null) {
                    uu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new m8(photoViewer, i17, 23), 100L);
                    break;
                }
                break;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.t(profileActivity, i15, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 25:
                org.telegram.ui.z01 z01Var = (org.telegram.ui.z01) obj;
                org.telegram.ui.a11 a11Var = z01Var.h;
                NotificationCenter notificationCenter = a11Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = a11Var.e;
                int i18 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i18);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    of.f.s(z01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i18);
                profileActivity2.e5(false, false);
                break;
            case 26:
                org.telegram.ui.q21 q21Var = (org.telegram.ui.q21) obj;
                AndroidUtilities.hideKeyboard(q21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = q21Var.a;
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
            case 27:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj;
                s4.o0 layoutManager = f31Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = f31Var.R ? i15 > f31Var.L ? Math.min(i15 + 1, f31Var.b.d.size() - 1) : Math.max(i15 - 1, 0) : i15;
                    org.telegram.ui.c31 c31Var = f31Var.c;
                    c31Var.a = min2;
                    layoutManager.w0(c31Var);
                }
                f31Var.L = i15;
                break;
            case 28:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.t81 t81Var = sessionsActivity.a;
                if (t81Var != null) {
                    t81Var.l();
                    break;
                }
                break;
            default:
                ui1 ui1Var = (ui1) obj;
                ui1Var.F.setSignalBarCount(i15);
                if (i15 <= 1) {
                    org.telegram.ui.Components.voip.a3 a3Var = ui1Var.v;
                    if (a3Var.V != 3) {
                        a3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(a3Var.H, 255);
                        a3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var, 2));
                        a3Var.O.setDuration(500L);
                        a3Var.O.start();
                    }
                    ui1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.a3 a3Var2 = ui1Var.v;
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
                    ui1Var.F.c(false);
                    break;
                }
        }
    }
}
