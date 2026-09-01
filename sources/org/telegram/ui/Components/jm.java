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
import org.telegram.ui.ci1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jm(Object obj, int i10, int i11) {
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
        org.telegram.ui.du0 du0Var;
        int i12 = this.a;
        int i13 = 0;
        int i14 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.M;
                if (i14 == pmVar.L && qmVar.w.isShown()) {
                    qmVar.w.e(1, true);
                    break;
                }
                break;
            case 1:
                mz mzVar = (mz) obj;
                if (mzVar.M1) {
                    my myVar = mzVar.q1;
                    if (myVar != null && myVar.k()) {
                        try {
                            mzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    mzVar.N1 = true;
                    int max = Math.max(50, i14 - 100);
                    AndroidUtilities.runOnUIThread(new jm(mzVar, max, 1), max);
                    break;
                }
                break;
            case 2:
                ((sa0) obj).b.run(Integer.valueOf(i14));
                break;
            case 3:
                wf0 wf0Var = (wf0) obj;
                org.telegram.ui.pt0 pt0Var = wf0Var.a;
                TextView textView = pt0Var.e;
                fg.h0 h0Var = pt0Var.h;
                RadialProgressView radialProgressView = pt0Var.n;
                TextView textView2 = pt0Var.d;
                textView.setVisibility(8);
                pt0Var.f.setVisibility(8);
                LinearLayout linearLayout = pt0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new vf0(wf0Var, i13));
                }
                if (h0Var.getAlpha() == 1.0f) {
                    h0Var.animate().cancel();
                    h0Var.animate().alpha(0.0f).setDuration(150L).setListener(new vf0(wf0Var, 1));
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
                        textView.setOnClickListener(new b80(wf0Var, 7));
                        break;
                    } else {
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                        break;
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                    break;
                }
            case 4:
                ej0 ej0Var = (ej0) obj;
                ej0Var.S0 = false;
                if (ej0Var.T0) {
                    ej0Var.A(true);
                    break;
                } else {
                    ej0Var.X0 = i14;
                    ej0Var.G();
                    ej0Var.v();
                    break;
                }
            case 5:
                ((zu0) obj).d1(i14);
                break;
            case 6:
                ((rt0) obj).h.scrollBy(0, i14);
                break;
            case 7:
                zu0 zu0Var = ((qs0) obj).a;
                org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
                if (p2Var != null) {
                    if (zu0Var.a1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = zu0.d0(i14, true);
                        tL_channels_setMainProfileTab.channel = p2Var.getMessagesController().getInputChannel(zu0Var.a1.id);
                        TLRPC.ChatFull chatFull = zu0Var.a1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = zu0.d0(i14, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = zu0Var.b1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            p2Var.getMessagesStorage().updateUserInfo(zu0Var.b1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    p2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    zu0Var.v1(true);
                    break;
                }
                break;
            case 8:
                ((yw0) obj).k0(i14, 0);
                break;
            case 9:
                h41 h41Var = (h41) obj;
                h41Var.U();
                h41Var.d0 = i14;
                w31.H(h41Var.c0);
                h41Var.V();
                break;
            case 10:
                ((l81) obj).v.x0(i14);
                break;
            case 11:
                f91 f91Var = (f91) obj;
                k71 k71Var = f91Var.a;
                if (i14 == -1) {
                    if (k71Var.y()) {
                        k71Var.B();
                        f91Var.n();
                    }
                    f91Var.G = false;
                    break;
                } else if (i14 == 1) {
                    if (f91Var.H) {
                        f91Var.H = false;
                        k71Var.C();
                        break;
                    }
                } else if (i14 != -3 && i14 == -2 && k71Var.y()) {
                    f91Var.H = true;
                    k71Var.B();
                    f91Var.n();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i14);
                    d60Var.v3 = Integer.valueOf(i14);
                }
                qc qcVar = new qc(d60Var.topBulletinContainer, new oh.h0());
                Resources resources = d60Var.getContext().getResources();
                if (i14 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i14 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                qcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.d60.g1(i14)).k(d60Var.n1());
                break;
            case 13:
                org.telegram.ui.d60 d60Var2 = ((org.telegram.ui.h50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i14);
                    d60Var2.v3 = Integer.valueOf(i14);
                }
                qc qcVar2 = new qc(d60Var2.topBulletinContainer, new oh.h0());
                Resources resources2 = d60Var2.getContext().getResources();
                if (i14 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i14 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                qcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.d60.g1(i14)).k(d60Var2.n1());
                break;
            case 14:
                org.telegram.ui.z60 z60Var = (org.telegram.ui.z60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = z60Var.n.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = z60Var.n.getChildAt(i15);
                    z60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i14) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(z60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / z60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 15:
                org.telegram.ui.bd0 bd0Var = (org.telegram.ui.bd0) obj;
                bd0Var.V.h1(0, -AndroidUtilities.dp(i14));
                bd0Var.A0(false);
                break;
            case 16:
                ((org.telegram.ui.zd0) obj).a.f[i14].l(1.0f);
                break;
            case 17:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.S = true;
                notificationsSettingsActivity.c.m(i14);
                break;
            case 18:
                ((org.telegram.ui.wk0) obj).run(Integer.valueOf(i14));
                break;
            case 19:
                ((org.telegram.ui.xo0) obj).e.g0.y.D(1 - i14);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                int i16 = i14 + 1;
                if (i16 < 6 && (du0Var = photoViewer.b0) != null) {
                    du0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new jm(photoViewer, i16, 20), 100L);
                    break;
                }
                break;
            case 21:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.w0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hg.m2(profileActivity, i14, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 22:
                org.telegram.ui.h01 h01Var = (org.telegram.ui.h01) obj;
                org.telegram.ui.i01 i01Var = h01Var.h;
                NotificationCenter notificationCenter = i01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = i01Var.e;
                int i17 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i17);
                if (i14 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    af.g.s(h01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i14 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i17);
                profileActivity2.e5(false, false);
                break;
            case 23:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) obj;
                AndroidUtilities.hideKeyboard(z11Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = z11Var.a;
                    if (i13 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i13 != 0 && ((i14 != 3 || i13 != 4) && ((i14 != 2 || (i13 != 4 && i13 != 1)) && (i14 != 1 || (i13 != 1 && i13 != 2 && i13 != 3))))) {
                            editTextBoldCursorArr[i13].setText((CharSequence) null);
                        }
                        i13++;
                    }
                }
                break;
            case 24:
                org.telegram.ui.n21 n21Var = (org.telegram.ui.n21) obj;
                f2.w0 layoutManager = n21Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = n21Var.O ? i14 > n21Var.I ? Math.min(i14 + 1, n21Var.b.d.size() - 1) : Math.max(i14 - 1, 0) : i14;
                    org.telegram.ui.k21 k21Var = n21Var.c;
                    k21Var.a = min2;
                    layoutManager.w0(k21Var);
                }
                n21Var.I = i14;
                break;
            case 25:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i14);
                sessionsActivity.m0();
                org.telegram.ui.b81 b81Var = sessionsActivity.a;
                if (b81Var != null) {
                    b81Var.l();
                    break;
                }
                break;
            case 26:
                ci1 ci1Var = (ci1) obj;
                ci1Var.C.setSignalBarCount(i14);
                if (i14 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = ci1Var.v;
                    if (d3Var.S != 3) {
                        d3Var.S = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.E, 255);
                        d3Var.L = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.L.setDuration(500L);
                        d3Var.L.start();
                    }
                    ci1Var.C.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.d3 d3Var2 = ci1Var.v;
                    if (d3Var2.S != 2) {
                        d3Var2.S = 2;
                        d3Var2.c();
                        ValueAnimator valueAnimator = d3Var2.L;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            d3Var2.L.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(d3Var2.E, 0);
                        d3Var2.L = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var2, 0));
                        d3Var2.L.setDuration(500L);
                        d3Var2.L.start();
                    }
                    ci1Var.C.c(false);
                    break;
                }
            case 27:
                ((qh.m) obj).run(Integer.valueOf(i14));
                break;
            case 28:
                ((Utilities.Callback) obj).run(Integer.valueOf(i14));
                break;
            default:
                ((qh.y1) obj).p0(i14);
                break;
        }
    }
}
