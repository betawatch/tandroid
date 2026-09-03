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
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class im implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ im(Object obj, int i10, int i11) {
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
        org.telegram.ui.iu0 iu0Var;
        int i12 = this.a;
        int i13 = 0;
        int i14 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                om omVar = (om) obj;
                pm pmVar = omVar.M;
                if (i14 == omVar.L && pmVar.w.isShown()) {
                    pmVar.w.e(1, true);
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
                    AndroidUtilities.runOnUIThread(new im(mzVar, max, 1), max);
                    break;
                }
                break;
            case 2:
                ((sa0) obj).b.run(Integer.valueOf(i14));
                break;
            case 3:
                wf0 wf0Var = (wf0) obj;
                org.telegram.ui.ut0 ut0Var = wf0Var.a;
                TextView textView = ut0Var.e;
                fg.h0 h0Var = ut0Var.h;
                RadialProgressView radialProgressView = ut0Var.n;
                TextView textView2 = ut0Var.d;
                textView.setVisibility(8);
                ut0Var.f.setVisibility(8);
                LinearLayout linearLayout = ut0Var.c;
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
                ((yu0) obj).d1(i14);
                break;
            case 6:
                ((qt0) obj).h.scrollBy(0, i14);
                break;
            case 7:
                yu0 yu0Var = ((ps0) obj).a;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
                if (p2Var != null) {
                    if (yu0Var.a1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = yu0.d0(i14, true);
                        tL_channels_setMainProfileTab.channel = p2Var.getMessagesController().getInputChannel(yu0Var.a1.id);
                        TLRPC.ChatFull chatFull = yu0Var.a1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = yu0.d0(i14, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = yu0Var.b1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            p2Var.getMessagesStorage().updateUserInfo(yu0Var.b1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    p2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    yu0Var.v1(true);
                    break;
                }
                break;
            case 8:
                ((xw0) obj).k0(i14, 0);
                break;
            case 9:
                g41 g41Var = (g41) obj;
                g41Var.U();
                g41Var.d0 = i14;
                v31.H(g41Var.c0);
                g41Var.V();
                break;
            case 10:
                ((k81) obj).v.x0(i14);
                break;
            case 11:
                e91 e91Var = (e91) obj;
                j71 j71Var = e91Var.a;
                if (i14 == -1) {
                    if (j71Var.y()) {
                        j71Var.B();
                        e91Var.n();
                    }
                    e91Var.G = false;
                    break;
                } else if (i14 == 1) {
                    if (e91Var.H) {
                        e91Var.H = false;
                        j71Var.C();
                        break;
                    }
                } else if (i14 != -3 && i14 == -2 && j71Var.y()) {
                    e91Var.H = true;
                    j71Var.B();
                    e91Var.n();
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
                ((org.telegram.ui.ap0) obj).e.m0.F.D(1 - i14);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                int i16 = i14 + 1;
                if (i16 < 6 && (iu0Var = photoViewer.b0) != null) {
                    iu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new im(photoViewer, i16, 20), 100L);
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
                org.telegram.ui.m01 m01Var = (org.telegram.ui.m01) obj;
                org.telegram.ui.n01 n01Var = m01Var.h;
                NotificationCenter notificationCenter = n01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = n01Var.e;
                int i17 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i17);
                if (i14 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    af.g.s(m01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i14 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i17);
                profileActivity2.e5(false, false);
                break;
            case 23:
                org.telegram.ui.d21 d21Var = (org.telegram.ui.d21) obj;
                AndroidUtilities.hideKeyboard(d21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = d21Var.a;
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
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) obj;
                f2.w0 layoutManager = t21Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = t21Var.O ? i14 > t21Var.I ? Math.min(i14 + 1, t21Var.b.d.size() - 1) : Math.max(i14 - 1, 0) : i14;
                    org.telegram.ui.q21 q21Var = t21Var.c;
                    q21Var.a = min2;
                    layoutManager.w0(q21Var);
                }
                t21Var.I = i14;
                break;
            case 25:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i14);
                sessionsActivity.m0();
                org.telegram.ui.h81 h81Var = sessionsActivity.a;
                if (h81Var != null) {
                    h81Var.l();
                    break;
                }
                break;
            case 26:
                ii1 ii1Var = (ii1) obj;
                ii1Var.C.setSignalBarCount(i14);
                if (i14 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = ii1Var.v;
                    if (d3Var.S != 3) {
                        d3Var.S = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.E, 255);
                        d3Var.L = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.L.setDuration(500L);
                        d3Var.L.start();
                    }
                    ii1Var.C.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.d3 d3Var2 = ii1Var.v;
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
                    ii1Var.C.c(false);
                    break;
                }
            case 27:
                ((qh.m) obj).run(Integer.valueOf(i14));
                break;
            case 28:
                ((Utilities.Callback) obj).run(Integer.valueOf(i14));
                break;
            default:
                ((qh.x1) obj).p0(i14);
                break;
        }
    }
}
