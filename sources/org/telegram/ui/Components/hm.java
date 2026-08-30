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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
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
import org.telegram.ui.ai1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hm(int i10, ArrayList arrayList) {
        this.a = 29;
        this.b = i10;
        this.c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        uf0 uf0Var;
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.bu0 bu0Var;
        int i12 = this.a;
        int i13 = 0;
        Object obj = this.c;
        int i14 = this.b;
        switch (i12) {
            case 0:
                nm nmVar = (nm) obj;
                om omVar = nmVar.M;
                if (i14 == nmVar.L && omVar.w.isShown()) {
                    omVar.w.e(1, true);
                    break;
                }
                break;
            case 1:
                kz kzVar = (kz) obj;
                if (kzVar.M1) {
                    ky kyVar = kzVar.q1;
                    if (kyVar != null && kyVar.k()) {
                        try {
                            kzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.N1 = true;
                    int max = Math.max(50, i14 - 100);
                    AndroidUtilities.runOnUIThread(new hm(kzVar, max, 1), max);
                    break;
                }
                break;
            case 2:
                ((qa0) obj).b.run(Integer.valueOf(i14));
                break;
            case 3:
                uf0 uf0Var2 = (uf0) obj;
                org.telegram.ui.nt0 nt0Var = uf0Var2.a;
                TextView textView = nt0Var.e;
                eg.h0 h0Var = nt0Var.h;
                RadialProgressView radialProgressView = nt0Var.n;
                TextView textView2 = nt0Var.d;
                textView.setVisibility(8);
                nt0Var.f.setVisibility(8);
                LinearLayout linearLayout = nt0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    uf0Var = uf0Var2;
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new tf0(uf0Var, i13));
                } else {
                    uf0Var = uf0Var2;
                }
                if (h0Var.getAlpha() == 1.0f) {
                    h0Var.animate().cancel();
                    h0Var.animate().alpha(0.0f).setDuration(150L).setListener(new tf0(uf0Var, 1));
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
                        textView.setOnClickListener(new z70(uf0Var, 7));
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
                cj0 cj0Var = (cj0) obj;
                cj0Var.S0 = false;
                if (cj0Var.T0) {
                    cj0Var.A(true);
                    break;
                } else {
                    cj0Var.X0 = i14;
                    cj0Var.G();
                    cj0Var.v();
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
                i71 i71Var = e91Var.a;
                if (i14 == -1) {
                    if (i71Var.y()) {
                        i71Var.B();
                        e91Var.n();
                    }
                    e91Var.G = false;
                    break;
                } else if (i14 == 1) {
                    if (e91Var.H) {
                        e91Var.H = false;
                        i71Var.C();
                        break;
                    }
                } else if (i14 != -3 && i14 == -2 && i71Var.y()) {
                    e91Var.H = true;
                    i71Var.B();
                    e91Var.n();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.c60 c60Var = (org.telegram.ui.c60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i14);
                    c60Var.v3 = Integer.valueOf(i14);
                }
                qc qcVar = new qc(c60Var.topBulletinContainer, new nh.i0());
                Resources resources = c60Var.getContext().getResources();
                if (i14 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i14 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                qcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.c60.g1(i14)).k(c60Var.n1());
                break;
            case 13:
                org.telegram.ui.c60 c60Var2 = ((org.telegram.ui.g50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i14);
                    c60Var2.v3 = Integer.valueOf(i14);
                }
                qc qcVar2 = new qc(c60Var2.topBulletinContainer, new nh.i0());
                Resources resources2 = c60Var2.getContext().getResources();
                if (i14 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i14 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                qcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.c60.g1(i14)).k(c60Var2.n1());
                break;
            case 14:
                org.telegram.ui.y60 y60Var = (org.telegram.ui.y60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = y60Var.n.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = y60Var.n.getChildAt(i15);
                    y60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i14) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(y60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / y60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 15:
                org.telegram.ui.ad0 ad0Var = (org.telegram.ui.ad0) obj;
                ad0Var.V.h1(0, -AndroidUtilities.dp(i14));
                ad0Var.A0(false);
                break;
            case 16:
                ((org.telegram.ui.yd0) obj).a.f[i14].l(1.0f);
                break;
            case 17:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.S = true;
                notificationsSettingsActivity.c.m(i14);
                break;
            case 18:
                ((org.telegram.ui.uk0) obj).run(Integer.valueOf(i14));
                break;
            case 19:
                ((org.telegram.ui.vo0) obj).e.g0.y.D(1 - i14);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                int i16 = i14 + 1;
                if (i16 < 6 && (bu0Var = photoViewer.b0) != null) {
                    bu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new hm(photoViewer, i16, 20), 100L);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gg.m2(profileActivity, i14, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 22:
                org.telegram.ui.f01 f01Var = (org.telegram.ui.f01) obj;
                org.telegram.ui.g01 g01Var = f01Var.h;
                NotificationCenter notificationCenter = g01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = g01Var.e;
                int i17 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i17);
                if (i14 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    af.g.s(f01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i14 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i17);
                profileActivity2.e5(false, false);
                break;
            case 23:
                org.telegram.ui.l21 l21Var = (org.telegram.ui.l21) obj;
                f2.v0 layoutManager = l21Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = l21Var.O ? i14 > l21Var.I ? Math.min(i14 + 1, l21Var.b.d.size() - 1) : Math.max(i14 - 1, 0) : i14;
                    org.telegram.ui.i21 i21Var = l21Var.c;
                    i21Var.a = min2;
                    layoutManager.w0(i21Var);
                }
                l21Var.I = i14;
                break;
            case 24:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i14);
                sessionsActivity.m0();
                org.telegram.ui.a81 a81Var = sessionsActivity.a;
                if (a81Var != null) {
                    a81Var.l();
                    break;
                }
                break;
            case 25:
                ai1 ai1Var = (ai1) obj;
                ai1Var.C.setSignalBarCount(i14);
                if (i14 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = ai1Var.v;
                    if (c3Var.S != 3) {
                        c3Var.S = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.E, 255);
                        c3Var.L = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.L.setDuration(500L);
                        c3Var.L.start();
                    }
                    ai1Var.C.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.c3 c3Var2 = ai1Var.v;
                    if (c3Var2.S != 2) {
                        c3Var2.S = 2;
                        c3Var2.c();
                        ValueAnimator valueAnimator = c3Var2.L;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            c3Var2.L.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(c3Var2.E, 0);
                        c3Var2.L = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var2, 0));
                        c3Var2.L.setDuration(500L);
                        c3Var2.L.start();
                    }
                    ai1Var.C.c(false);
                    break;
                }
            case 26:
                ((ph.m) obj).run(Integer.valueOf(i14));
                break;
            case 27:
                ((Utilities.Callback) obj).run(Integer.valueOf(i14));
                break;
            case 28:
                ((ph.y1) obj).p0(i14);
                break;
            default:
                MessagesController.getInstance(i14).putUsers((ArrayList) obj, true);
                break;
        }
    }

    public /* synthetic */ hm(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
