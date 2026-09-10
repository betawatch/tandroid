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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zd(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.wu0 wu0Var;
        int i12 = this.a;
        int i13 = 5;
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        int i17 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i17 == 0) {
                    chatActivityEnterView.z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.c5 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                qg qgVar = chatActivityEnterView.Y2;
                if (qgVar != null) {
                    qgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 1:
                wm wmVar = (wm) obj;
                xm xmVar = wmVar.P;
                if (i17 == wmVar.O && xmVar.w.isShown()) {
                    xmVar.w.e(1, true);
                    break;
                }
                break;
            case 2:
                rz rzVar = (rz) obj;
                if (rzVar.P1) {
                    sy syVar = rzVar.t1;
                    if (syVar != null && syVar.k()) {
                        try {
                            rzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    rzVar.Q1 = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new zd(rzVar, max, 2), max);
                    break;
                }
                break;
            case 3:
                ((ya0) obj).b.run(Integer.valueOf(i17));
                break;
            case 4:
                yf0 yf0Var = (yf0) obj;
                org.telegram.ui.hu0 hu0Var = yf0Var.a;
                TextView textView = hu0Var.e;
                bi.nc ncVar = hu0Var.h;
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
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new xf0(yf0Var, i16));
                }
                if (ncVar.getAlpha() == 1.0f) {
                    ncVar.animate().cancel();
                    ncVar.animate().alpha(0.0f).setDuration(150L).setListener(new xf0(yf0Var, i15));
                }
                if (i17 != 2) {
                    if (i17 != 5) {
                        if (i17 != 150) {
                            if (i17 == 100) {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                break;
                            } else if (i17 != 101) {
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
            case 5:
                fj0 fj0Var = (fj0) obj;
                fj0Var.V0 = false;
                if (fj0Var.W0) {
                    fj0Var.C(true);
                    break;
                } else {
                    fj0Var.a1 = i17;
                    fj0Var.I();
                    fj0Var.x();
                    break;
                }
            case 6:
                ((iv0) obj).d1(i17);
                break;
            case 7:
                ((au0) obj).h.scrollBy(0, i17);
                break;
            case 8:
                iv0 iv0Var = ((zs0) obj).a;
                org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
                if (p2Var != null) {
                    if (iv0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = iv0.d0(i17, true);
                        tL_channels_setMainProfileTab.channel = p2Var.getMessagesController().getInputChannel(iv0Var.d1.id);
                        TLRPC.ChatFull chatFull = iv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = iv0.d0(i17, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = iv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            p2Var.getMessagesStorage().updateUserInfo(iv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    p2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    iv0Var.v1(true);
                    break;
                }
                break;
            case 9:
                ((hx0) obj).k0(i17, 0);
                break;
            case 10:
                t41 t41Var = (t41) obj;
                t41Var.U();
                t41Var.g0 = i17;
                i41.I(t41Var.f0);
                t41Var.V();
                break;
            case 11:
                ((u81) obj).v.x0(i17);
                break;
            case 12:
                o91 o91Var = (o91) obj;
                t71 t71Var = o91Var.a;
                if (i17 == -1) {
                    if (t71Var.y()) {
                        t71Var.B();
                        o91Var.n();
                    }
                    o91Var.J = false;
                    break;
                } else if (i17 == 1) {
                    if (o91Var.K) {
                        o91Var.K = false;
                        t71Var.C();
                        break;
                    }
                } else if (i17 != -3 && i17 == -2 && t71Var.y()) {
                    o91Var.K = true;
                    t71Var.B();
                    o91Var.n();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    j60Var.y3 = Integer.valueOf(i17);
                }
                wc wcVar = new wc(j60Var.topBulletinContainer, new bq0());
                Resources resources = j60Var.getContext().getResources();
                if (i17 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i17 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                wcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.j60.g1(i17)).k(j60Var.n1());
                break;
            case 14:
                org.telegram.ui.j60 j60Var2 = ((org.telegram.ui.m50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    j60Var2.y3 = Integer.valueOf(i17);
                }
                wc wcVar2 = new wc(j60Var2.topBulletinContainer, new bq0());
                Resources resources2 = j60Var2.getContext().getResources();
                if (i17 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i17 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                wcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.j60.g1(i17)).k(j60Var2.n1());
                break;
            case 15:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = e70Var.n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = e70Var.n.getChildAt(i18);
                    e70Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
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
            case 16:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) obj;
                id0Var.Y.h1(0, -AndroidUtilities.dp(i17));
                id0Var.A0(false);
                break;
            case 17:
                ((org.telegram.ui.ge0) obj).a.f[i17].l(1.0f);
                break;
            case 18:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i17);
                break;
            case 19:
                ((org.telegram.ui.hl0) obj).run(Integer.valueOf(i17));
                break;
            case 20:
                ((org.telegram.ui.np0) obj).e.p0.I.D(1 - i17);
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                int i19 = i17 + 1;
                if (i19 < 6 && (wu0Var = photoViewer.e0) != null) {
                    wu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new zd(photoViewer, i19, 21), 100L);
                    break;
                }
                break;
            case 22:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
                d2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i17, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 23:
                org.telegram.ui.e11 e11Var = (org.telegram.ui.e11) obj;
                org.telegram.ui.f11 f11Var = e11Var.h;
                NotificationCenter notificationCenter = f11Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = f11Var.e;
                int i20 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i20);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(e11Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i17 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i20);
                profileActivity2.e5(false, false);
                break;
            case 24:
                org.telegram.ui.u21 u21Var = (org.telegram.ui.u21) obj;
                AndroidUtilities.hideKeyboard(u21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = u21Var.a;
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
            case 25:
                org.telegram.ui.j31 j31Var = (org.telegram.ui.j31) obj;
                s4.o0 layoutManager = j31Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = j31Var.R ? i17 > j31Var.L ? Math.min(i17 + 1, j31Var.b.d.size() - 1) : Math.max(i17 - 1, 0) : i17;
                    org.telegram.ui.g31 g31Var = j31Var.c;
                    g31Var.a = min2;
                    layoutManager.w0(g31Var);
                }
                j31Var.L = i17;
                break;
            case 26:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i17);
                sessionsActivity.m0();
                org.telegram.ui.v81 v81Var = sessionsActivity.a;
                if (v81Var != null) {
                    v81Var.l();
                    break;
                }
                break;
            case 27:
                zi1 zi1Var = (zi1) obj;
                zi1Var.F.setSignalBarCount(i17);
                if (i17 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = zi1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    zi1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.c3 c3Var2 = zi1Var.v;
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
                    zi1Var.F.c(false);
                    break;
                }
            case 28:
                pg.j jVar = (pg.j) obj;
                jVar.L = i17;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = jVar.P;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.Q;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(wr.f);
                jVar.P.addUpdateListener(new pg.f(jVar, i13));
                jVar.P.addListener(new pg.g(jVar, i14));
                jVar.P.start();
                break;
            default:
                org.telegram.ui.zt0 zt0Var = (org.telegram.ui.zt0) obj;
                og.v1 v1Var = zt0Var.K1;
                zt0Var.s0(v1Var, null);
                og.x0.e(i17).j(v1Var.c);
                break;
        }
    }
}
