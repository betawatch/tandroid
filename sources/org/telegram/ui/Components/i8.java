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
import org.telegram.ui.oh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i8(Object obj, int i10, int i11) {
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
        org.telegram.ui.rt0 rt0Var;
        int i12 = this.a;
        int i13 = 0;
        int i14 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                ((m8) obj).b(i14);
                break;
            case 1:
                ed edVar = (ed) obj;
                nh.t3 t3Var = edVar.Z0;
                if (edVar.X0 != i14) {
                    edVar.setTimer(i14);
                    Utilities.Callback callback = edVar.n1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i14));
                    }
                    if (i14 == 0) {
                        replaceTags = LocaleController.getString(edVar.m1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        t3Var.h = edVar.getMeasuredWidth();
                        t3Var.q(false);
                        t3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        t3Var.a0 = AndroidUtilities.dp(0);
                        t3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i14 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(edVar.m1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        t3Var.h = edVar.getMeasuredWidth();
                        t3Var.q(false);
                        t3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        t3Var.a0 = AndroidUtilities.dp(0);
                        t3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i14 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(edVar.m1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i14, new Object[0]));
                        t3Var.q(true);
                        t3Var.h = nh.t3.a(replaceTags, t3Var.getTextPaint());
                        t3Var.l(12.0f, 7.0f, 11.0f, 7.0f);
                        t3Var.a0 = AndroidUtilities.dp(2);
                        t3Var.W = 0.0f;
                    }
                    t3Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), edVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (edVar instanceof org.telegram.ui.yr0 ? -1.0f : 1.0f));
                    t3Var.t(replaceTags);
                    int i15 = i14 > 0 ? R.raw.fire_on : R.raw.fire_off;
                    xi0 xi0Var = new xi0(i15, AndroidUtilities.dp(34.0f), j7.l1.k(i15, ""), AndroidUtilities.dp(34.0f));
                    xi0Var.start();
                    t3Var.k(xi0Var);
                    t3Var.v();
                    edVar.k1 = false;
                    AndroidUtilities.cancelRunOnUIThread(edVar.l1);
                    edVar.invalidate();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i14 == 0) {
                    chatActivityEnterView.v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                xf xfVar = chatActivityEnterView.Q0;
                if (xfVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        xfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.i1.removeView(chatActivityEnterView.Q0);
                    if (chatActivityEnterView.B3) {
                        chatActivityEnterView.B3 = false;
                        chatActivityEnterView.Q0 = null;
                    }
                }
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.v(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 3:
                km kmVar = (km) obj;
                lm lmVar = kmVar.L;
                if (i14 == kmVar.K && lmVar.w.isShown()) {
                    lmVar.w.e(1, true);
                    break;
                }
                break;
            case 4:
                fz fzVar = (fz) obj;
                if (fzVar.L1) {
                    fy fyVar = fzVar.p1;
                    if (fyVar != null && fyVar.k()) {
                        try {
                            fzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fzVar.M1 = true;
                    int max = Math.max(50, i14 - 100);
                    AndroidUtilities.runOnUIThread(new i8(fzVar, max, 4), max);
                    break;
                }
                break;
            case 5:
                ((la0) obj).b.run(Integer.valueOf(i14));
                break;
            case 6:
                lf0 lf0Var = (lf0) obj;
                org.telegram.ui.et0 et0Var = lf0Var.a;
                TextView textView = et0Var.e;
                cg.h0 h0Var = et0Var.h;
                RadialProgressView radialProgressView = et0Var.n;
                TextView textView2 = et0Var.d;
                textView.setVisibility(8);
                et0Var.f.setVisibility(8);
                LinearLayout linearLayout = et0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new kf0(lf0Var, i13));
                }
                if (h0Var.getAlpha() == 1.0f) {
                    h0Var.animate().cancel();
                    h0Var.animate().alpha(0.0f).setDuration(150L).setListener(new kf0(lf0Var, 1));
                }
                if (i14 != 2) {
                    if (i14 != 5) {
                        if (i14 != 150) {
                            if (i14 == 100) {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                break;
                            } else if (i14 != 101) {
                            }
                        }
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                        textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new u70(lf0Var, 7));
                        break;
                    } else {
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                        break;
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                    break;
                }
            case 7:
                ti0 ti0Var = (ti0) obj;
                ti0Var.R0 = false;
                if (ti0Var.S0) {
                    ti0Var.A(true);
                    break;
                } else {
                    ti0Var.W0 = i14;
                    ti0Var.G();
                    ti0Var.v();
                    break;
                }
            case 8:
                ((qu0) obj).d1(i14);
                break;
            case 9:
                ((it0) obj).h.scrollBy(0, i14);
                break;
            case 10:
                qu0 qu0Var = ((hs0) obj).a;
                org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
                if (o2Var != null) {
                    if (qu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = qu0.d0(i14, true);
                        tL_channels_setMainProfileTab.channel = o2Var.getMessagesController().getInputChannel(qu0Var.Z0.id);
                        TLRPC.ChatFull chatFull = qu0Var.Z0;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = qu0.d0(i14, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = qu0Var.a1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            o2Var.getMessagesStorage().updateUserInfo(qu0Var.a1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    o2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    qu0Var.v1(true);
                    break;
                }
                break;
            case 11:
                ((ow0) obj).k0(i14, 0);
                break;
            case 12:
                v31 v31Var = (v31) obj;
                v31Var.U();
                v31Var.c0 = i14;
                k31.H(v31Var.b0);
                v31Var.V();
                break;
            case 13:
                ((y71) obj).v.x0(i14);
                break;
            case 14:
                s81 s81Var = (s81) obj;
                x61 x61Var = s81Var.a;
                if (i14 == -1) {
                    if (x61Var.z()) {
                        x61Var.C();
                        s81Var.n();
                    }
                    s81Var.F = false;
                    break;
                } else if (i14 == 1) {
                    if (s81Var.G) {
                        s81Var.G = false;
                        x61Var.D();
                        break;
                    }
                } else if (i14 != -3 && i14 == -2 && x61Var.z()) {
                    s81Var.G = true;
                    x61Var.C();
                    s81Var.n();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i14);
                    r50Var.u3 = Integer.valueOf(i14);
                }
                tc tcVar = new tc(r50Var.topBulletinContainer, new lh.h0());
                Resources resources = r50Var.getContext().getResources();
                if (i14 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i14 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                tcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.r50.g1(i14)).k(r50Var.n1());
                break;
            case 16:
                org.telegram.ui.r50 r50Var2 = ((org.telegram.ui.u40) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i14);
                    r50Var2.u3 = Integer.valueOf(i14);
                }
                tc tcVar2 = new tc(r50Var2.topBulletinContainer, new lh.h0());
                Resources resources2 = r50Var2.getContext().getResources();
                if (i14 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i14 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                tcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.r50.g1(i14)).k(r50Var2.n1());
                break;
            case 17:
                org.telegram.ui.m60 m60Var = (org.telegram.ui.m60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = m60Var.n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = m60Var.n.getChildAt(i16);
                    m60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i14) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(m60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / m60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 18:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) obj;
                rc0Var.U.h1(0, -AndroidUtilities.dp(i14));
                rc0Var.A0(false);
                break;
            case 19:
                ((org.telegram.ui.pd0) obj).a.f[i14].l(1.0f);
                break;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.R = true;
                notificationsSettingsActivity.c.m(i14);
                break;
            case 21:
                ((org.telegram.ui.mk0) obj).run(Integer.valueOf(i14));
                break;
            case 22:
                ((org.telegram.ui.no0) obj).e.f0.y.D(1 - i14);
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                int i17 = i14 + 1;
                if (i17 < 6 && (rt0Var = photoViewer.a0) != null) {
                    rt0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new i8(photoViewer, i17, 23), 100L);
                    break;
                }
                break;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new eg.n2(profileActivity, i14, 16));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 25:
                org.telegram.ui.uz0 uz0Var = (org.telegram.ui.uz0) obj;
                org.telegram.ui.vz0 vz0Var = uz0Var.h;
                NotificationCenter notificationCenter = vz0Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = vz0Var.e;
                int i18 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i18);
                if (i14 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    ye.d.s(uz0Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i14 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i18);
                profileActivity2.e5(false, false);
                break;
            case 26:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) obj;
                f2.w0 layoutManager = z11Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = z11Var.N ? i14 > z11Var.H ? Math.min(i14 + 1, z11Var.b.d.size() - 1) : Math.max(i14 - 1, 0) : i14;
                    org.telegram.ui.w11 w11Var = z11Var.c;
                    w11Var.a = min2;
                    layoutManager.w0(w11Var);
                }
                z11Var.H = i14;
                break;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i14);
                sessionsActivity.m0();
                org.telegram.ui.n71 n71Var = sessionsActivity.a;
                if (n71Var != null) {
                    n71Var.l();
                    break;
                }
                break;
            case 28:
                oh1 oh1Var = (oh1) obj;
                oh1Var.B.setSignalBarCount(i14);
                if (i14 <= 1) {
                    org.telegram.ui.Components.voip.e3 e3Var = oh1Var.v;
                    if (e3Var.R != 3) {
                        e3Var.R = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(e3Var.D, 255);
                        e3Var.K = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.c3(e3Var, 2));
                        e3Var.K.setDuration(500L);
                        e3Var.K.start();
                    }
                    oh1Var.B.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.e3 e3Var2 = oh1Var.v;
                    if (e3Var2.R != 2) {
                        e3Var2.R = 2;
                        e3Var2.c();
                        ValueAnimator valueAnimator = e3Var2.K;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            e3Var2.K.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(e3Var2.D, 0);
                        e3Var2.K = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.c3(e3Var2, 0));
                        e3Var2.K.setDuration(500L);
                        e3Var2.K.start();
                    }
                    oh1Var.B.c(false);
                    break;
                }
            default:
                ((rf.a0) obj).m(i14);
                break;
        }
    }
}
