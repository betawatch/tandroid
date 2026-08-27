package h3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import gh.p5;
import hh.k5;
import hh.la;
import hh.oa;
import hh.u7;
import hh.v4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import jh.a7;
import jh.b5;
import jh.c9;
import jh.i9;
import jh.w8;
import jh.x7;
import jh.x8;
import jh.y7;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.co0;
import org.telegram.ui.gy;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements d5.k, x4, org.telegram.ui.ActionBar.a2, gf.p, ud.b, Utilities.Callback5, co0, t2.e, rk0, Utilities.Callback2Return, qk0, a7, c9, eh.o, r0.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(i3.a aVar, j4.p pVar, j4.x xVar, IOException iOException, boolean z10) {
        this.a = 14;
        this.b = xVar;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        hh.t0 t0Var = (hh.t0) this.b;
        if (z10) {
            long j10 = i10;
            if (t0Var.E != j10) {
                t0Var.E = j10;
                t0Var.r.setText(hh.t0.p(j10));
            }
            t0Var.n(true);
        }
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i9 i9Var = (i9) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        marginLayoutParams.topMargin = i9Var.c ? 0 : m1Var.d();
        marginLayoutParams.bottomMargin = i9Var.c ? m1Var.a.f(2).d : m1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        w8 w8Var = i9Var.s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02da  */
    @Override // org.telegram.ui.Components.rk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i10, final View view) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10;
        boolean z10;
        dq dqVar;
        boolean z11;
        boolean z12;
        b70 b70Var;
        int i18;
        switch (this.a) {
            case 19:
                final yw ywVar = (yw) this.b;
                if (ywVar.J == 0.0f && ywVar.j0 == 0.0f) {
                    final long j11 = ((jh.o) view).A;
                    gy gyVar = ywVar.K0;
                    i11 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                    MediaDataController.getInstance(i11).loadHints(true);
                    b70 H = b70.H(gyVar, view);
                    H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    H.W(g6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), gyVar.getThemedColor(g6.d6)));
                    H.a0(0.0f, AndroidUtilities.dp(8.0f));
                    gyVar.H0 = H;
                    if (!UserObject.isService(j11)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i12 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                        if (j11 != UserConfig.getInstance(i12).getClientUserId()) {
                            final TLRPC.User user = gyVar.getMessagesController().getUser(Long.valueOf(j11));
                            TLRPC.Chat chat = gyVar.getMessagesController().getChat(Long.valueOf(-j11));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, 0L);
                            i13 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                            boolean c02 = NotificationsCustomSettingsActivity.c0(i13, j11);
                            i14 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                            boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                            i15 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                            boolean isPremium = UserConfig.getInstance(i15).isPremium();
                            i16 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                            boolean J = MessagesController.getInstance(i16).getStoriesController().J(j11);
                            i17 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                            boolean F = MessagesController.getInstance(i17).getStoriesController().F(j11);
                            if (premiumFeaturesBlocked || j11 <= 0 || isPremium) {
                                j10 = 0;
                                z10 = false;
                            } else {
                                z10 = false;
                                Drawable drawable = ywVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = ywVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        j10 = 0;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(gyVar.getThemedColor(g6.F8), PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        j10 = 0;
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    dqVar = new dq(drawable2, drawable);
                                    dq dqVar2 = dqVar;
                                    if (j11 < j10 && gyVar.X3().j(j11)) {
                                        final int i19 = 4;
                                        gyVar.H0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), g6.F8, g6.E8, new Runnable() { // from class: org.telegram.ui.uw
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i20;
                                                switch (i19) {
                                                    case 0:
                                                        ywVar.K0.presentFragment(rn.R9(j11));
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        gy gyVar2 = ywVar.K0;
                                                        i20 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                        MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                        long j12 = j11;
                                                        mediaDataController.removePeer(j12);
                                                        gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                        break;
                                                    case 4:
                                                        ywVar.K0.A0.j(j11);
                                                        break;
                                                    case 5:
                                                        ywVar.K0.presentFragment(rn.R9(j11));
                                                        break;
                                                    default:
                                                        ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (user != null && !user.contact) {
                                        i18 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                        if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                            z11 = true;
                                            b70 b70Var2 = gyVar.H0;
                                            final int i20 = 5;
                                            b70Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i20) {
                                                        case 0:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            gy gyVar2 = ywVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ywVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        default:
                                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i21 = 6;
                                            b70Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i21) {
                                                        case 0:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            gy gyVar2 = ywVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ywVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        default:
                                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i22 = 0;
                                            b70Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i22) {
                                                        case 0:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            gy gyVar2 = ywVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ywVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        default:
                                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 < j10);
                                            final int i23 = 0;
                                            b70Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.vw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i24;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i23;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    yw ywVar2 = ywVar;
                                                    switch (i26) {
                                                        case 0:
                                                            gy gyVar2 = ywVar2.K0;
                                                            i24 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            gyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            gy gyVar3 = ywVar2.K0;
                                                            i25 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            gyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !c02 && j11 > j10);
                                            b70Var2.E();
                                            final int i24 = 1;
                                            b70Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.vw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i24;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    yw ywVar2 = ywVar;
                                                    switch (i26) {
                                                        case 0:
                                                            gy gyVar2 = ywVar2.K0;
                                                            i242 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            gyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            gy gyVar3 = ywVar2.K0;
                                                            i25 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            gyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, c02 && j11 > j10);
                                            b70Var2.E();
                                            final int i25 = 0;
                                            b70Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.ww
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.c6 c6Var;
                                                    int i26;
                                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                                    switch (i25) {
                                                        case 0:
                                                            yw ywVar2 = ywVar;
                                                            gy gyVar2 = ywVar2.K0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i26 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof jh.o) {
                                                                        gyVar2.A0.i((jh.o) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = ywVar2.getContext();
                                                            c6Var = ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider;
                                                            jh.o5 o5Var = new jh.o5(context, 0.0f, 1, c6Var);
                                                            o5Var.e = new xw(ywVar2, view2, 1);
                                                            gyVar2.showDialog(o5Var);
                                                            break;
                                                        default:
                                                            yw ywVar3 = ywVar;
                                                            Context context2 = ywVar3.getContext();
                                                            gy gyVar3 = ywVar3.K0;
                                                            c6Var2 = ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider;
                                                            jh.o5 o5Var2 = new jh.o5(context2, 0.0f, 1, c6Var2);
                                                            o5Var2.e = new xw(ywVar3, view, 0);
                                                            gyVar3.showDialog(o5Var2);
                                                            break;
                                                    }
                                                }
                                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                            b70Var2.E();
                                            z12 = premiumFeaturesBlocked && j11 > j10 && !isPremium && J && !F;
                                            int i26 = R.drawable.msg_stories_stealth2;
                                            String string = LocaleController.getString(R.string.ViewAnonymously);
                                            final int i27 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.ww
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.c6 c6Var;
                                                    int i262;
                                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                                    switch (i27) {
                                                        case 0:
                                                            yw ywVar2 = ywVar;
                                                            gy gyVar2 = ywVar2.K0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i262 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof jh.o) {
                                                                        gyVar2.A0.i((jh.o) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = ywVar2.getContext();
                                                            c6Var = ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider;
                                                            jh.o5 o5Var = new jh.o5(context, 0.0f, 1, c6Var);
                                                            o5Var.e = new xw(ywVar2, view2, 1);
                                                            gyVar2.showDialog(o5Var);
                                                            break;
                                                        default:
                                                            yw ywVar3 = ywVar;
                                                            Context context2 = ywVar3.getContext();
                                                            gy gyVar3 = ywVar3.K0;
                                                            c6Var2 = ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider;
                                                            jh.o5 o5Var2 = new jh.o5(context2, 0.0f, 1, c6Var2);
                                                            o5Var2.e = new xw(ywVar3, view, 0);
                                                            gyVar3.showDialog(o5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z12) {
                                                b70Var2.b(i26, dqVar2, string, g6.F8, g6.E8, runnable);
                                                b70Var = b70Var2;
                                            } else {
                                                b70Var = b70Var2;
                                            }
                                            b70Var.E();
                                            final int i28 = 1;
                                            b70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i28) {
                                                        case 0:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            gy gyVar2 = ywVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ywVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        default:
                                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11 && !gyVar.e4());
                                            b70Var.E();
                                            final int i29 = 2;
                                            b70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i29) {
                                                        case 0:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            gy gyVar2 = ywVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ywVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        default:
                                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11 && gyVar.e4());
                                            b70Var.E();
                                            final int i30 = 3;
                                            b70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i30) {
                                                        case 0:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            gy gyVar2 = ywVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ywVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            ywVar.K0.presentFragment(rn.R9(j11));
                                                            break;
                                                        default:
                                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11);
                                        }
                                    }
                                    z11 = false;
                                    b70 b70Var22 = gyVar.H0;
                                    final int i202 = 5;
                                    b70Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i202) {
                                                case 0:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    gy gyVar2 = ywVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ywVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                default:
                                                    ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    final int i212 = 6;
                                    b70Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i212) {
                                                case 0:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    gy gyVar2 = ywVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ywVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                default:
                                                    ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    if (j11 < j10) {
                                    }
                                    final int i222 = 0;
                                    b70Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i222) {
                                                case 0:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    gy gyVar2 = ywVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ywVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                default:
                                                    ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 < j10);
                                    final int i232 = 0;
                                    b70Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.vw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i252;
                                            int i262 = i232;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            yw ywVar2 = ywVar;
                                            switch (i262) {
                                                case 0:
                                                    gy gyVar2 = ywVar2.K0;
                                                    i242 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    gyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    gy gyVar3 = ywVar2.K0;
                                                    i252 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    gyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !c02 && j11 > j10);
                                    b70Var22.E();
                                    final int i242 = 1;
                                    b70Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.vw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            String trim;
                                            int i252;
                                            int i262 = i242;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            yw ywVar2 = ywVar;
                                            switch (i262) {
                                                case 0:
                                                    gy gyVar2 = ywVar2.K0;
                                                    i2422 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    gyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    gy gyVar3 = ywVar2.K0;
                                                    i252 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    gyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, c02 && j11 > j10);
                                    b70Var22.E();
                                    final int i252 = 0;
                                    b70Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.ww
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.c6 c6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.c6 c6Var2;
                                            switch (i252) {
                                                case 0:
                                                    yw ywVar2 = ywVar;
                                                    gy gyVar2 = ywVar2.K0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof jh.o) {
                                                                gyVar2.A0.i((jh.o) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = ywVar2.getContext();
                                                    c6Var = ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider;
                                                    jh.o5 o5Var = new jh.o5(context, 0.0f, 1, c6Var);
                                                    o5Var.e = new xw(ywVar2, view2, 1);
                                                    gyVar2.showDialog(o5Var);
                                                    break;
                                                default:
                                                    yw ywVar3 = ywVar;
                                                    Context context2 = ywVar3.getContext();
                                                    gy gyVar3 = ywVar3.K0;
                                                    c6Var2 = ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider;
                                                    jh.o5 o5Var2 = new jh.o5(context2, 0.0f, 1, c6Var2);
                                                    o5Var2.e = new xw(ywVar3, view, 0);
                                                    gyVar3.showDialog(o5Var2);
                                                    break;
                                            }
                                        }
                                    }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                    b70Var22.E();
                                    if (premiumFeaturesBlocked) {
                                    }
                                    int i262 = R.drawable.msg_stories_stealth2;
                                    String string2 = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i272 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.ww
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.c6 c6Var;
                                            int i2622;
                                            org.telegram.ui.ActionBar.c6 c6Var2;
                                            switch (i272) {
                                                case 0:
                                                    yw ywVar2 = ywVar;
                                                    gy gyVar2 = ywVar2.K0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i2622 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof jh.o) {
                                                                gyVar2.A0.i((jh.o) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = ywVar2.getContext();
                                                    c6Var = ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider;
                                                    jh.o5 o5Var = new jh.o5(context, 0.0f, 1, c6Var);
                                                    o5Var.e = new xw(ywVar2, view2, 1);
                                                    gyVar2.showDialog(o5Var);
                                                    break;
                                                default:
                                                    yw ywVar3 = ywVar;
                                                    Context context2 = ywVar3.getContext();
                                                    gy gyVar3 = ywVar3.K0;
                                                    c6Var2 = ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider;
                                                    jh.o5 o5Var2 = new jh.o5(context2, 0.0f, 1, c6Var2);
                                                    o5Var2.e = new xw(ywVar3, view, 0);
                                                    gyVar3.showDialog(o5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                    }
                                    b70Var.E();
                                    final int i282 = 1;
                                    b70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i282) {
                                                case 0:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    gy gyVar2 = ywVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ywVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                default:
                                                    ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11 && !gyVar.e4());
                                    b70Var.E();
                                    final int i292 = 2;
                                    b70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i292) {
                                                case 0:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    gy gyVar2 = ywVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ywVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                default:
                                                    ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11 && gyVar.e4());
                                    b70Var.E();
                                    final int i302 = 3;
                                    b70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i302) {
                                                case 0:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    gy gyVar2 = ywVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ywVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    ywVar.K0.presentFragment(rn.R9(j11));
                                                    break;
                                                default:
                                                    ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11);
                                } else {
                                    j10 = 0;
                                }
                            }
                            dqVar = null;
                            dq dqVar22 = dqVar;
                            if (j11 < j10) {
                                final int i192 = 4;
                                gyVar.H0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), g6.F8, g6.E8, new Runnable() { // from class: org.telegram.ui.uw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2022;
                                        switch (i192) {
                                            case 0:
                                                ywVar.K0.presentFragment(rn.R9(j11));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                gy gyVar2 = ywVar.K0;
                                                i2022 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                long j12 = j11;
                                                mediaDataController.removePeer(j12);
                                                gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                break;
                                            case 4:
                                                ywVar.K0.A0.j(j11);
                                                break;
                                            case 5:
                                                ywVar.K0.presentFragment(rn.R9(j11));
                                                break;
                                            default:
                                                ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null) {
                                i18 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                }
                            }
                            z11 = false;
                            b70 b70Var222 = gyVar.H0;
                            final int i2022 = 5;
                            b70Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.uw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2022) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar2 = ywVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            final int i2122 = 6;
                            b70Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.uw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2122) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar2 = ywVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            if (j11 < j10) {
                            }
                            final int i2222 = 0;
                            b70Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.uw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2222) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar2 = ywVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 < j10);
                            final int i2322 = 0;
                            b70Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.vw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2322;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    yw ywVar2 = ywVar;
                                    switch (i2622) {
                                        case 0:
                                            gy gyVar2 = ywVar2.K0;
                                            i2422 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            gyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            gy gyVar3 = ywVar2.K0;
                                            i2522 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            gyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c02 && j11 > j10);
                            b70Var222.E();
                            final int i2422 = 1;
                            b70Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.vw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2422;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    yw ywVar2 = ywVar;
                                    switch (i2622) {
                                        case 0:
                                            gy gyVar2 = ywVar2.K0;
                                            i24222 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            gyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            gy gyVar3 = ywVar2.K0;
                                            i2522 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            gyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c02 && j11 > j10);
                            b70Var222.E();
                            final int i2522 = 0;
                            b70Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.ww
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.c6 c6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                    switch (i2522) {
                                        case 0:
                                            yw ywVar2 = ywVar;
                                            gy gyVar2 = ywVar2.K0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof jh.o) {
                                                        gyVar2.A0.i((jh.o) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = ywVar2.getContext();
                                            c6Var = ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider;
                                            jh.o5 o5Var = new jh.o5(context, 0.0f, 1, c6Var);
                                            o5Var.e = new xw(ywVar2, view2, 1);
                                            gyVar2.showDialog(o5Var);
                                            break;
                                        default:
                                            yw ywVar3 = ywVar;
                                            Context context2 = ywVar3.getContext();
                                            gy gyVar3 = ywVar3.K0;
                                            c6Var2 = ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider;
                                            jh.o5 o5Var2 = new jh.o5(context2, 0.0f, 1, c6Var2);
                                            o5Var2.e = new xw(ywVar3, view, 0);
                                            gyVar3.showDialog(o5Var2);
                                            break;
                                    }
                                }
                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                            b70Var222.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i2622 = R.drawable.msg_stories_stealth2;
                            String string22 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i2722 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.ww
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.c6 c6Var;
                                    int i26222;
                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                    switch (i2722) {
                                        case 0:
                                            yw ywVar2 = ywVar;
                                            gy gyVar2 = ywVar2.K0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i26222 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof jh.o) {
                                                        gyVar2.A0.i((jh.o) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = ywVar2.getContext();
                                            c6Var = ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider;
                                            jh.o5 o5Var = new jh.o5(context, 0.0f, 1, c6Var);
                                            o5Var.e = new xw(ywVar2, view2, 1);
                                            gyVar2.showDialog(o5Var);
                                            break;
                                        default:
                                            yw ywVar3 = ywVar;
                                            Context context2 = ywVar3.getContext();
                                            gy gyVar3 = ywVar3.K0;
                                            c6Var2 = ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider;
                                            jh.o5 o5Var2 = new jh.o5(context2, 0.0f, 1, c6Var2);
                                            o5Var2.e = new xw(ywVar3, view, 0);
                                            gyVar3.showDialog(o5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            b70Var.E();
                            final int i2822 = 1;
                            b70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.uw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2822) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar2 = ywVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11 && !gyVar.e4());
                            b70Var.E();
                            final int i2922 = 2;
                            b70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.uw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2922) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar2 = ywVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11 && gyVar.e4());
                            b70Var.E();
                            final int i3022 = 3;
                            b70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.uw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i3022) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new wv(ywVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar2 = ywVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            gyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j11));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11);
                        } else if (gyVar.K3) {
                            b70 b70Var3 = gyVar.H0;
                            int i31 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i32 = g6.F8;
                            int i33 = g6.E8;
                            final int i34 = 0;
                            b70Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i34) {
                                        case 0:
                                            ywVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            gy gyVar2 = ywVar.K0;
                                            i35 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            gyVar2.presentFragment(new org.telegram.ui.Components.o90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            gy gyVar3 = ywVar.K0;
                                            i36 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            gyVar3.presentFragment(new org.telegram.ui.Components.o90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 1;
                            gyVar.H0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i36;
                                    switch (i35) {
                                        case 0:
                                            ywVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            gy gyVar2 = ywVar.K0;
                                            i352 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            gyVar2.presentFragment(new org.telegram.ui.Components.o90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            gy gyVar3 = ywVar.K0;
                                            i36 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            gyVar3.presentFragment(new org.telegram.ui.Components.o90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i36 = 2;
                            gyVar.H0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i362;
                                    switch (i36) {
                                        case 0:
                                            ywVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            gy gyVar2 = ywVar.K0;
                                            i352 = ((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            gyVar2.presentFragment(new org.telegram.ui.Components.o90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            gy gyVar3 = ywVar.K0;
                                            i362 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            gyVar3.presentFragment(new org.telegram.ui.Components.o90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z10 = false;
                        } else {
                            yw ywVar2 = gyVar.A0;
                            if (ywVar2 != null) {
                                ywVar2.n();
                            }
                        }
                        b70 b70Var4 = gyVar.H0;
                        b70Var4.i = 3;
                        b70Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        b70Var4.Z();
                        return z10;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            default:
                vq0 vq0Var = ((kh.r) this.b).S;
                if (vq0Var.C.y1 || !(view instanceof o7)) {
                    return false;
                }
                MessageObject messageObject = ((o7) view).getMessageObject();
                if (vq0Var.c(messageObject)) {
                    vq0Var.g(messageObject);
                } else {
                    vq0Var.e(messageObject);
                }
                return true;
        }
    }

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        ((ae.b) this.b).getClass();
        String h = ia.g0.b.h((ia.f0) obj);
        kotlin.jvm.internal.j.d(h, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(h));
        byte[] bytes = h.getBytes(gd.a.a);
        kotlin.jvm.internal.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // org.telegram.ui.co0
    public void b(int i10) {
        switch (this.a) {
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        callback2.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    callback2.run(Boolean.TRUE, null);
                    break;
                }
                break;
            case 11:
                cg.u0 u0Var = (cg.u0) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        u0Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    u0Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                p5 p5Var = (p5) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        p5Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    p5Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        long j10;
        int i11;
        int i12;
        int i13;
        jh.g2 g2Var = (jh.g2) this.b;
        hh.f1 f1Var = g2Var.c;
        ArrayList arrayList = g2Var.r;
        jh.t0 t0Var = ((jh.r0) view).f;
        int i14 = g2Var.J;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= t0Var.f.size()) {
                break;
            }
            jh.s0 s0Var = (jh.s0) t0Var.f.get(i16);
            long j11 = s0Var.g;
            if (j11 > 0 && currentTime - s0Var.d <= jh.s.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(s0Var.a));
            }
            i16++;
        }
        jh.d1 d1Var = g2Var.L;
        long j12 = d1Var != null ? d1Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            jh.s0 s0Var2 = (jh.s0) arrayList.get(i17);
            if (s0Var2.b || !s0Var2.e || s0Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(s0Var2.a))) {
                    j10 = j12;
                    if (g2Var.w != t0Var.b || (i13 = g2Var.x) == 0 || s0Var2.a < i13) {
                        i11 = s0Var2.a;
                        break;
                    }
                } else {
                    j10 = j12;
                }
                i18++;
            } else {
                j10 = j12;
            }
            i17++;
            j12 = j10;
        }
        j10 = j12;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
                jh.s0 s0Var3 = (jh.s0) arrayList.get(i15);
                if (s0Var3.b || !s0Var3.e || s0Var3.g >= j10) {
                    if (hashSet.contains(Integer.valueOf(s0Var3.a))) {
                        i12 = s0Var3.a;
                        i18 = i19;
                        break;
                    }
                    i19++;
                }
                i15++;
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        g2Var.w = t0Var.b;
        g2Var.x = i12;
        g2Var.y = true;
        f2.v0 itemAnimator = f1Var.getItemAnimator();
        f1Var.setItemAnimator(null);
        g2Var.d.i1(i18, f1Var.getHeight() / 2, true);
        g2Var.e.m(i18);
        f1Var.setItemAnimator(itemAnimator);
    }

    @Override // jh.c9
    public void d(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // jh.a7
    public void e(boolean z10) {
        b5 b5Var = (b5) this.b;
        if (b5Var != null) {
            b5Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                ((Utilities.Callback) this.b).run(b2Var.g(i10, true, true));
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // gf.p
    public void g(long j10) {
        ((v4) this.b).h();
    }

    @Override // eh.o
    public void i(eh.k kVar, float f10, float f11) {
        y7 y7Var = (y7) this.b;
        if (y7Var.v.x) {
            return;
        }
        kVar.q = new x7(y7Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = y7Var.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((eh.k) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // d5.k
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((a2) obj).onAudioAttributesChanged((j3.e) this.b);
                break;
            case 1:
                ((a2) obj).onCues((r4.d) this.b);
                break;
            case 2:
                ((a2) obj).onMediaMetadataChanged(((h0) this.b).a.O);
                break;
            case 3:
                ((a2) obj).onMetadata((z3.c) this.b);
                break;
            case 4:
                ((a2) obj).onDeviceInfoChanged((m) this.b);
                break;
            case 14:
                ((i3.b) obj).b((j4.x) this.b);
                break;
            case 15:
                ((i3.b) obj).a((v1) this.b);
                break;
            default:
                ((i3.b) obj).h((k3.f) this.b);
                break;
        }
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        View view = ((k5) this.b).b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        switch (this.a) {
            case 20:
                return jh.u0.a((jh.u0) this.b, (Long) obj2);
            default:
                vq0 vq0Var = (vq0) this.b;
                if (((Integer) obj).intValue() != -1) {
                    return Boolean.FALSE;
                }
                new kh.u(vq0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ag.n0(vq0Var, 23)).show();
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ x(i3.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ x(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 9:
                u7.b((u7) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            default:
                la laVar = (la) this.b;
                n41 n41Var = (n41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                laVar.getClass();
                if (n41Var.G instanceof TL_stars.StarsTransaction) {
                    oa.h1(laVar.getContext(), false, 0L, laVar.c, (TL_stars.StarsTransaction) n41Var.G, laVar.b);
                    break;
                }
                break;
        }
    }

    @Override // ud.b
    public /* synthetic */ void A(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
