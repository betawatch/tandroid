package gh;

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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.dy;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements org.telegram.ui.ActionBar.b2, ff.p, td.b, Utilities.Callback5, bo0, d5.k, t2.e, ok0, Utilities.Callback2Return, nk0, ih.d7, ih.g9, dh.q, r0.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(i3.a aVar, j4.q qVar, j4.y yVar, IOException iOException, boolean z10) {
        this.a = 15;
        this.b = yVar;
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        View view = ((m5) this.b).b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).J();
        } else {
            view.invalidate();
        }
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        ih.m9 m9Var = (ih.m9) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m9Var.v.getLayoutParams();
        marginLayoutParams.topMargin = m9Var.c ? 0 : m1Var.d();
        marginLayoutParams.bottomMargin = m9Var.c ? m1Var.a.f(2).d : m1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        ih.a9 a9Var = m9Var.s;
        if (a9Var != null) {
            a9Var.requestLayout();
        }
        ih.b9 b9Var = m9Var.v;
        if (b9Var != null) {
            b9Var.requestLayout();
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
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i9, final View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        boolean z10;
        fq fqVar;
        boolean z11;
        boolean z12;
        x60 x60Var;
        int i17;
        switch (this.a) {
            case 18:
                final vw vwVar = (vw) this.b;
                if (vwVar.J == 0.0f && vwVar.j0 == 0.0f) {
                    final long j11 = ((ih.q) view).A;
                    dy dyVar = vwVar.K0;
                    i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                    MediaDataController.getInstance(i10).loadHints(true);
                    x60 H = x60.H(dyVar, view);
                    H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    H.W(org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6)));
                    H.a0(0.0f, AndroidUtilities.dp(8.0f));
                    dyVar.H0 = H;
                    if (!UserObject.isService(j11)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i11 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        if (j11 != UserConfig.getInstance(i11).getClientUserId()) {
                            final TLRPC.User user = dyVar.getMessagesController().getUser(Long.valueOf(j11));
                            TLRPC.Chat chat = dyVar.getMessagesController().getChat(Long.valueOf(-j11));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, 0L);
                            i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                            boolean b02 = NotificationsCustomSettingsActivity.b0(i12, j11);
                            i13 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                            boolean premiumFeaturesBlocked = MessagesController.getInstance(i13).premiumFeaturesBlocked();
                            i14 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                            boolean isPremium = UserConfig.getInstance(i14).isPremium();
                            i15 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                            boolean J = MessagesController.getInstance(i15).getStoriesController().J(j11);
                            i16 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                            boolean F = MessagesController.getInstance(i16).getStoriesController().F(j11);
                            if (premiumFeaturesBlocked || j11 <= 0 || isPremium) {
                                j10 = 0;
                                z10 = false;
                            } else {
                                z10 = false;
                                Drawable drawable = vwVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = vwVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        j10 = 0;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.F8), PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        j10 = 0;
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    fqVar = new fq(drawable2, drawable);
                                    fq fqVar2 = fqVar;
                                    if (j11 < j10 && dyVar.X3().j(j11)) {
                                        final int i18 = 4;
                                        dyVar.H0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), org.telegram.ui.ActionBar.f6.F8, org.telegram.ui.ActionBar.f6.E8, new Runnable() { // from class: org.telegram.ui.rw
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i19;
                                                switch (i18) {
                                                    case 0:
                                                        vwVar.K0.presentFragment(qn.R9(j11));
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        dy dyVar2 = vwVar.K0;
                                                        i19 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                        MediaDataController mediaDataController = MediaDataController.getInstance(i19);
                                                        long j12 = j11;
                                                        mediaDataController.removePeer(j12);
                                                        dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                        break;
                                                    case 4:
                                                        vwVar.K0.A0.j(j11);
                                                        break;
                                                    case 5:
                                                        vwVar.K0.presentFragment(qn.R9(j11));
                                                        break;
                                                    default:
                                                        vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (user != null && !user.contact) {
                                        i17 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                        if (MediaDataController.getInstance(i17).containsTopPeer(j11)) {
                                            z11 = true;
                                            x60 x60Var2 = dyVar.H0;
                                            final int i19 = 5;
                                            x60Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.rw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i192;
                                                    switch (i19) {
                                                        case 0:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            dy dyVar2 = vwVar.K0;
                                                            i192 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i192);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            vwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        default:
                                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i20 = 6;
                                            x60Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.rw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i192;
                                                    switch (i20) {
                                                        case 0:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            dy dyVar2 = vwVar.K0;
                                                            i192 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i192);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            vwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        default:
                                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i21 = 0;
                                            x60Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.rw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i192;
                                                    switch (i21) {
                                                        case 0:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            dy dyVar2 = vwVar.K0;
                                                            i192 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i192);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            vwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        default:
                                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 < j10);
                                            final int i22 = 0;
                                            x60Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.sw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i23;
                                                    String trim;
                                                    int i24;
                                                    int i25 = i22;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    vw vwVar2 = vwVar;
                                                    switch (i25) {
                                                        case 0:
                                                            dy dyVar2 = vwVar2.K0;
                                                            i23 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i23).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            dyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.oc.a0(dyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            dy dyVar3 = vwVar2.K0;
                                                            i24 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            dyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.oc.a0(dyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !b02 && j11 > j10);
                                            x60Var2.E();
                                            final int i23 = 1;
                                            x60Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.sw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i232;
                                                    String trim;
                                                    int i24;
                                                    int i25 = i23;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    vw vwVar2 = vwVar;
                                                    switch (i25) {
                                                        case 0:
                                                            dy dyVar2 = vwVar2.K0;
                                                            i232 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i232).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            dyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.oc.a0(dyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            dy dyVar3 = vwVar2.K0;
                                                            i24 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            dyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.oc.a0(dyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, b02 && j11 > j10);
                                            x60Var2.E();
                                            final int i24 = 0;
                                            x60Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.tw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.b6 b6Var;
                                                    int i25;
                                                    org.telegram.ui.ActionBar.b6 b6Var2;
                                                    switch (i24) {
                                                        case 0:
                                                            vw vwVar2 = vwVar;
                                                            dy dyVar2 = vwVar2.K0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i25 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i25).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof ih.q) {
                                                                        dyVar2.A0.i((ih.q) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = vwVar2.getContext();
                                                            b6Var = ((org.telegram.ui.ActionBar.o2) dyVar2).resourceProvider;
                                                            ih.s5 s5Var = new ih.s5(context, 0.0f, 1, b6Var);
                                                            s5Var.e = new uw(vwVar2, view2, 1);
                                                            dyVar2.showDialog(s5Var);
                                                            break;
                                                        default:
                                                            vw vwVar3 = vwVar;
                                                            Context context2 = vwVar3.getContext();
                                                            dy dyVar3 = vwVar3.K0;
                                                            b6Var2 = ((org.telegram.ui.ActionBar.o2) dyVar3).resourceProvider;
                                                            ih.s5 s5Var2 = new ih.s5(context2, 0.0f, 1, b6Var2);
                                                            s5Var2.e = new uw(vwVar3, view, 0);
                                                            dyVar3.showDialog(s5Var2);
                                                            break;
                                                    }
                                                }
                                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                            x60Var2.E();
                                            z12 = premiumFeaturesBlocked && j11 > j10 && !isPremium && J && !F;
                                            int i25 = R.drawable.msg_stories_stealth2;
                                            String string = LocaleController.getString(R.string.ViewAnonymously);
                                            final int i26 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.tw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.b6 b6Var;
                                                    int i252;
                                                    org.telegram.ui.ActionBar.b6 b6Var2;
                                                    switch (i26) {
                                                        case 0:
                                                            vw vwVar2 = vwVar;
                                                            dy dyVar2 = vwVar2.K0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i252 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i252).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof ih.q) {
                                                                        dyVar2.A0.i((ih.q) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = vwVar2.getContext();
                                                            b6Var = ((org.telegram.ui.ActionBar.o2) dyVar2).resourceProvider;
                                                            ih.s5 s5Var = new ih.s5(context, 0.0f, 1, b6Var);
                                                            s5Var.e = new uw(vwVar2, view2, 1);
                                                            dyVar2.showDialog(s5Var);
                                                            break;
                                                        default:
                                                            vw vwVar3 = vwVar;
                                                            Context context2 = vwVar3.getContext();
                                                            dy dyVar3 = vwVar3.K0;
                                                            b6Var2 = ((org.telegram.ui.ActionBar.o2) dyVar3).resourceProvider;
                                                            ih.s5 s5Var2 = new ih.s5(context2, 0.0f, 1, b6Var2);
                                                            s5Var2.e = new uw(vwVar3, view, 0);
                                                            dyVar3.showDialog(s5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z12) {
                                                x60Var2.b(i25, fqVar2, string, org.telegram.ui.ActionBar.f6.F8, org.telegram.ui.ActionBar.f6.E8, runnable);
                                                x60Var = x60Var2;
                                            } else {
                                                x60Var = x60Var2;
                                            }
                                            x60Var.E();
                                            final int i27 = 1;
                                            x60Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.rw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i192;
                                                    switch (i27) {
                                                        case 0:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            dy dyVar2 = vwVar.K0;
                                                            i192 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i192);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            vwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        default:
                                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11 && !dyVar.e4());
                                            x60Var.E();
                                            final int i28 = 2;
                                            x60Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.rw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i192;
                                                    switch (i28) {
                                                        case 0:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            dy dyVar2 = vwVar.K0;
                                                            i192 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i192);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            vwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        default:
                                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11 && dyVar.e4());
                                            x60Var.E();
                                            final int i29 = 3;
                                            x60Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.rw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i192;
                                                    switch (i29) {
                                                        case 0:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            dy dyVar2 = vwVar.K0;
                                                            i192 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i192);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            vwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            vwVar.K0.presentFragment(qn.R9(j11));
                                                            break;
                                                        default:
                                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11);
                                        }
                                    }
                                    z11 = false;
                                    x60 x60Var22 = dyVar.H0;
                                    final int i192 = 5;
                                    x60Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.rw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i1922;
                                            switch (i192) {
                                                case 0:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    dy dyVar2 = vwVar.K0;
                                                    i1922 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i1922);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    vwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                default:
                                                    vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    final int i202 = 6;
                                    x60Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.rw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i1922;
                                            switch (i202) {
                                                case 0:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    dy dyVar2 = vwVar.K0;
                                                    i1922 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i1922);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    vwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                default:
                                                    vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    if (j11 < j10) {
                                    }
                                    final int i212 = 0;
                                    x60Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.rw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i1922;
                                            switch (i212) {
                                                case 0:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    dy dyVar2 = vwVar.K0;
                                                    i1922 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i1922);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    vwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                default:
                                                    vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 < j10);
                                    final int i222 = 0;
                                    x60Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.sw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i232;
                                            String trim;
                                            int i242;
                                            int i252 = i222;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            vw vwVar2 = vwVar;
                                            switch (i252) {
                                                case 0:
                                                    dy dyVar2 = vwVar2.K0;
                                                    i232 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i232).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    dyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.oc.a0(dyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    dy dyVar3 = vwVar2.K0;
                                                    i242 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    dyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.oc.a0(dyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !b02 && j11 > j10);
                                    x60Var22.E();
                                    final int i232 = 1;
                                    x60Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.sw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2322;
                                            String trim;
                                            int i242;
                                            int i252 = i232;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            vw vwVar2 = vwVar;
                                            switch (i252) {
                                                case 0:
                                                    dy dyVar2 = vwVar2.K0;
                                                    i2322 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i2322).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    dyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.oc.a0(dyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    dy dyVar3 = vwVar2.K0;
                                                    i242 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    dyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.oc.a0(dyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, b02 && j11 > j10);
                                    x60Var22.E();
                                    final int i242 = 0;
                                    x60Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.tw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.b6 b6Var;
                                            int i252;
                                            org.telegram.ui.ActionBar.b6 b6Var2;
                                            switch (i242) {
                                                case 0:
                                                    vw vwVar2 = vwVar;
                                                    dy dyVar2 = vwVar2.K0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i252 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i252).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof ih.q) {
                                                                dyVar2.A0.i((ih.q) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = vwVar2.getContext();
                                                    b6Var = ((org.telegram.ui.ActionBar.o2) dyVar2).resourceProvider;
                                                    ih.s5 s5Var = new ih.s5(context, 0.0f, 1, b6Var);
                                                    s5Var.e = new uw(vwVar2, view2, 1);
                                                    dyVar2.showDialog(s5Var);
                                                    break;
                                                default:
                                                    vw vwVar3 = vwVar;
                                                    Context context2 = vwVar3.getContext();
                                                    dy dyVar3 = vwVar3.K0;
                                                    b6Var2 = ((org.telegram.ui.ActionBar.o2) dyVar3).resourceProvider;
                                                    ih.s5 s5Var2 = new ih.s5(context2, 0.0f, 1, b6Var2);
                                                    s5Var2.e = new uw(vwVar3, view, 0);
                                                    dyVar3.showDialog(s5Var2);
                                                    break;
                                            }
                                        }
                                    }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                    x60Var22.E();
                                    if (premiumFeaturesBlocked) {
                                    }
                                    int i252 = R.drawable.msg_stories_stealth2;
                                    String string2 = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i262 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.tw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.b6 b6Var;
                                            int i2522;
                                            org.telegram.ui.ActionBar.b6 b6Var2;
                                            switch (i262) {
                                                case 0:
                                                    vw vwVar2 = vwVar;
                                                    dy dyVar2 = vwVar2.K0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i2522 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i2522).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof ih.q) {
                                                                dyVar2.A0.i((ih.q) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = vwVar2.getContext();
                                                    b6Var = ((org.telegram.ui.ActionBar.o2) dyVar2).resourceProvider;
                                                    ih.s5 s5Var = new ih.s5(context, 0.0f, 1, b6Var);
                                                    s5Var.e = new uw(vwVar2, view2, 1);
                                                    dyVar2.showDialog(s5Var);
                                                    break;
                                                default:
                                                    vw vwVar3 = vwVar;
                                                    Context context2 = vwVar3.getContext();
                                                    dy dyVar3 = vwVar3.K0;
                                                    b6Var2 = ((org.telegram.ui.ActionBar.o2) dyVar3).resourceProvider;
                                                    ih.s5 s5Var2 = new ih.s5(context2, 0.0f, 1, b6Var2);
                                                    s5Var2.e = new uw(vwVar3, view, 0);
                                                    dyVar3.showDialog(s5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                    }
                                    x60Var.E();
                                    final int i272 = 1;
                                    x60Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.rw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i1922;
                                            switch (i272) {
                                                case 0:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    dy dyVar2 = vwVar.K0;
                                                    i1922 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i1922);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    vwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                default:
                                                    vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11 && !dyVar.e4());
                                    x60Var.E();
                                    final int i282 = 2;
                                    x60Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.rw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i1922;
                                            switch (i282) {
                                                case 0:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    dy dyVar2 = vwVar.K0;
                                                    i1922 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i1922);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    vwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                default:
                                                    vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11 && dyVar.e4());
                                    x60Var.E();
                                    final int i292 = 3;
                                    x60Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.rw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i1922;
                                            switch (i292) {
                                                case 0:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    dy dyVar2 = vwVar.K0;
                                                    i1922 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i1922);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    vwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    vwVar.K0.presentFragment(qn.R9(j11));
                                                    break;
                                                default:
                                                    vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11);
                                } else {
                                    j10 = 0;
                                }
                            }
                            fqVar = null;
                            fq fqVar22 = fqVar;
                            if (j11 < j10) {
                                final int i182 = 4;
                                dyVar.H0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), org.telegram.ui.ActionBar.f6.F8, org.telegram.ui.ActionBar.f6.E8, new Runnable() { // from class: org.telegram.ui.rw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i1922;
                                        switch (i182) {
                                            case 0:
                                                vwVar.K0.presentFragment(qn.R9(j11));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                dy dyVar2 = vwVar.K0;
                                                i1922 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i1922);
                                                long j12 = j11;
                                                mediaDataController.removePeer(j12);
                                                dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                break;
                                            case 4:
                                                vwVar.K0.A0.j(j11);
                                                break;
                                            case 5:
                                                vwVar.K0.presentFragment(qn.R9(j11));
                                                break;
                                            default:
                                                vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null) {
                                i17 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                if (MediaDataController.getInstance(i17).containsTopPeer(j11)) {
                                }
                            }
                            z11 = false;
                            x60 x60Var222 = dyVar.H0;
                            final int i1922 = 5;
                            x60Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.rw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19222;
                                    switch (i1922) {
                                        case 0:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            dy dyVar2 = vwVar.K0;
                                            i19222 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i19222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            vwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        default:
                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            final int i2022 = 6;
                            x60Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.rw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19222;
                                    switch (i2022) {
                                        case 0:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            dy dyVar2 = vwVar.K0;
                                            i19222 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i19222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            vwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        default:
                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            if (j11 < j10) {
                            }
                            final int i2122 = 0;
                            x60Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.rw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19222;
                                    switch (i2122) {
                                        case 0:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            dy dyVar2 = vwVar.K0;
                                            i19222 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i19222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            vwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        default:
                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 < j10);
                            final int i2222 = 0;
                            x60Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.sw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2322;
                                    String trim;
                                    int i2422;
                                    int i2522 = i2222;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    vw vwVar2 = vwVar;
                                    switch (i2522) {
                                        case 0:
                                            dy dyVar2 = vwVar2.K0;
                                            i2322 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2322).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            dyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.oc.a0(dyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            dy dyVar3 = vwVar2.K0;
                                            i2422 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            dyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.oc.a0(dyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !b02 && j11 > j10);
                            x60Var222.E();
                            final int i2322 = 1;
                            x60Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.sw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i23222;
                                    String trim;
                                    int i2422;
                                    int i2522 = i2322;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    vw vwVar2 = vwVar;
                                    switch (i2522) {
                                        case 0:
                                            dy dyVar2 = vwVar2.K0;
                                            i23222 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i23222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            dyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.oc.a0(dyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            dy dyVar3 = vwVar2.K0;
                                            i2422 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            dyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.oc.a0(dyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, b02 && j11 > j10);
                            x60Var222.E();
                            final int i2422 = 0;
                            x60Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.b6 b6Var;
                                    int i2522;
                                    org.telegram.ui.ActionBar.b6 b6Var2;
                                    switch (i2422) {
                                        case 0:
                                            vw vwVar2 = vwVar;
                                            dy dyVar2 = vwVar2.K0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2522 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2522).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof ih.q) {
                                                        dyVar2.A0.i((ih.q) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = vwVar2.getContext();
                                            b6Var = ((org.telegram.ui.ActionBar.o2) dyVar2).resourceProvider;
                                            ih.s5 s5Var = new ih.s5(context, 0.0f, 1, b6Var);
                                            s5Var.e = new uw(vwVar2, view2, 1);
                                            dyVar2.showDialog(s5Var);
                                            break;
                                        default:
                                            vw vwVar3 = vwVar;
                                            Context context2 = vwVar3.getContext();
                                            dy dyVar3 = vwVar3.K0;
                                            b6Var2 = ((org.telegram.ui.ActionBar.o2) dyVar3).resourceProvider;
                                            ih.s5 s5Var2 = new ih.s5(context2, 0.0f, 1, b6Var2);
                                            s5Var2.e = new uw(vwVar3, view, 0);
                                            dyVar3.showDialog(s5Var2);
                                            break;
                                    }
                                }
                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                            x60Var222.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i2522 = R.drawable.msg_stories_stealth2;
                            String string22 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i2622 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.b6 b6Var;
                                    int i25222;
                                    org.telegram.ui.ActionBar.b6 b6Var2;
                                    switch (i2622) {
                                        case 0:
                                            vw vwVar2 = vwVar;
                                            dy dyVar2 = vwVar2.K0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i25222 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i25222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof ih.q) {
                                                        dyVar2.A0.i((ih.q) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = vwVar2.getContext();
                                            b6Var = ((org.telegram.ui.ActionBar.o2) dyVar2).resourceProvider;
                                            ih.s5 s5Var = new ih.s5(context, 0.0f, 1, b6Var);
                                            s5Var.e = new uw(vwVar2, view2, 1);
                                            dyVar2.showDialog(s5Var);
                                            break;
                                        default:
                                            vw vwVar3 = vwVar;
                                            Context context2 = vwVar3.getContext();
                                            dy dyVar3 = vwVar3.K0;
                                            b6Var2 = ((org.telegram.ui.ActionBar.o2) dyVar3).resourceProvider;
                                            ih.s5 s5Var2 = new ih.s5(context2, 0.0f, 1, b6Var2);
                                            s5Var2.e = new uw(vwVar3, view, 0);
                                            dyVar3.showDialog(s5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            x60Var.E();
                            final int i2722 = 1;
                            x60Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.rw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19222;
                                    switch (i2722) {
                                        case 0:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            dy dyVar2 = vwVar.K0;
                                            i19222 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i19222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            vwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        default:
                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11 && !dyVar.e4());
                            x60Var.E();
                            final int i2822 = 2;
                            x60Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.rw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19222;
                                    switch (i2822) {
                                        case 0:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            dy dyVar2 = vwVar.K0;
                                            i19222 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i19222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            vwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        default:
                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11 && dyVar.e4());
                            x60Var.E();
                            final int i2922 = 3;
                            x60Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.rw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i19222;
                                    switch (i2922) {
                                        case 0:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(vwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            dy dyVar2 = vwVar.K0;
                                            i19222 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i19222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            dyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            vwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            vwVar.K0.presentFragment(qn.R9(j11));
                                            break;
                                        default:
                                            vwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11);
                        } else if (dyVar.K3) {
                            x60 x60Var3 = dyVar.H0;
                            int i30 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i31 = org.telegram.ui.ActionBar.f6.F8;
                            int i32 = org.telegram.ui.ActionBar.f6.E8;
                            final int i33 = 0;
                            x60Var3.b(i30, null, string3, i31, i32, new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i34;
                                    int i35;
                                    switch (i33) {
                                        case 0:
                                            vwVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            dy dyVar2 = vwVar.K0;
                                            i34 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i34).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            dyVar2.presentFragment(new org.telegram.ui.Components.k90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            dy dyVar3 = vwVar.K0;
                                            i35 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            dyVar3.presentFragment(new org.telegram.ui.Components.k90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i34 = 1;
                            dyVar.H0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i31, i32, new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i342;
                                    int i35;
                                    switch (i34) {
                                        case 0:
                                            vwVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            dy dyVar2 = vwVar.K0;
                                            i342 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i342).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            dyVar2.presentFragment(new org.telegram.ui.Components.k90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            dy dyVar3 = vwVar.K0;
                                            i35 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            dyVar3.presentFragment(new org.telegram.ui.Components.k90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 2;
                            dyVar.H0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i31, i32, new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i342;
                                    int i352;
                                    switch (i35) {
                                        case 0:
                                            vwVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            dy dyVar2 = vwVar.K0;
                                            i342 = ((org.telegram.ui.ActionBar.o2) dyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i342).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            dyVar2.presentFragment(new org.telegram.ui.Components.k90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            dy dyVar3 = vwVar.K0;
                                            i352 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            dyVar3.presentFragment(new org.telegram.ui.Components.k90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z10 = false;
                        } else {
                            vw vwVar2 = dyVar.A0;
                            if (vwVar2 != null) {
                                vwVar2.n();
                            }
                        }
                        x60 x60Var4 = dyVar.H0;
                        x60Var4.i = 3;
                        x60Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        x60Var4.Z();
                        return z10;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            default:
                uq0 uq0Var = ((jh.q) this.b).S;
                if (uq0Var.C.y1 || !(view instanceof org.telegram.ui.Cells.r7)) {
                    return false;
                }
                MessageObject messageObject = ((org.telegram.ui.Cells.r7) view).getMessageObject();
                if (uq0Var.c(messageObject)) {
                    uq0Var.g(messageObject);
                } else {
                    uq0Var.e(messageObject);
                }
                return true;
        }
    }

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        ((android.support.v4.media.c) this.b).getClass();
        String u10 = ha.f0.b.u((ha.e0) obj);
        kotlin.jvm.internal.i.d(u10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(u10));
        byte[] bytes = u10.getBytes(fd.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // org.telegram.ui.bo0
    public void b(int i9) {
        switch (this.a) {
            case 4:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                if (i9 != 1) {
                    if (i9 != 3) {
                        callback2.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    callback2.run(Boolean.TRUE, null);
                    break;
                }
                break;
            case 5:
                bg.y0 y0Var = (bg.y0) this.b;
                if (i9 != 1) {
                    if (i9 != 3) {
                        y0Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    y0Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                fh.w5 w5Var = (fh.w5) this.b;
                if (i9 != 1) {
                    if (i9 != 3) {
                        w5Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    w5Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        long j10;
        int i10;
        int i11;
        int i12;
        ih.h2 h2Var = (ih.h2) this.b;
        f1 f1Var = h2Var.c;
        ArrayList arrayList = h2Var.r;
        ih.v0 v0Var = ((ih.t0) view).f;
        int i13 = h2Var.J;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= v0Var.f.size()) {
                break;
            }
            ih.u0 u0Var = (ih.u0) v0Var.f.get(i15);
            long j11 = u0Var.g;
            if (j11 > 0 && currentTime - u0Var.d <= ih.u.b(i13, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(u0Var.a));
            }
            i15++;
        }
        ih.f1 f1Var2 = h2Var.L;
        long j12 = f1Var2 != null ? f1Var2.j() : 0L;
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            ih.u0 u0Var2 = (ih.u0) arrayList.get(i16);
            if (u0Var2.b || !u0Var2.e || u0Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(u0Var2.a))) {
                    j10 = j12;
                    if (h2Var.w != v0Var.b || (i12 = h2Var.x) == 0 || u0Var2.a < i12) {
                        i10 = u0Var2.a;
                        break;
                    }
                } else {
                    j10 = j12;
                }
                i17++;
            } else {
                j10 = j12;
            }
            i16++;
            j12 = j10;
        }
        j10 = j12;
        i10 = -1;
        if (i10 < 0) {
            int i18 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    i17 = i18;
                    i11 = -1;
                    break;
                }
                ih.u0 u0Var3 = (ih.u0) arrayList.get(i14);
                if (u0Var3.b || !u0Var3.e || u0Var3.g >= j10) {
                    if (hashSet.contains(Integer.valueOf(u0Var3.a))) {
                        i11 = u0Var3.a;
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                i14++;
            }
        } else {
            i11 = i10;
        }
        if (i11 < 0) {
            return;
        }
        h2Var.w = v0Var.b;
        h2Var.x = i11;
        h2Var.y = true;
        f2.w0 itemAnimator = f1Var.getItemAnimator();
        f1Var.setItemAnimator(null);
        h2Var.d.i1(i17, f1Var.getHeight() / 2, true);
        h2Var.e.m(i17);
        f1Var.setItemAnimator(itemAnimator);
    }

    @Override // ih.d7
    public void d(boolean z10) {
        ih.f5 f5Var = (ih.f5) this.b;
        if (f5Var != null) {
            f5Var.c();
        }
    }

    @Override // dh.q
    public void e(dh.l lVar, float f10, float f11) {
        ih.c8 c8Var = (ih.c8) this.b;
        if (c8Var.v.x) {
            return;
        }
        lVar.q = new ih.b8(c8Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = c8Var.i;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((dh.l) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                ((Utilities.Callback) this.b).run(c2Var.g(i9, true, true));
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // ih.g9
    public void g(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // ff.p
    public void h(long j10) {
        ((x4) this.b).h();
    }

    @Override // d5.k
    public void invoke(Object obj) {
        switch (this.a) {
            case 8:
                ((h3.a2) obj).onMediaMetadataChanged((h3.h1) this.b);
                break;
            case 9:
                ((h3.a2) obj).onAudioAttributesChanged((j3.e) this.b);
                break;
            case 10:
                ((h3.a2) obj).onCues((r4.c) this.b);
                break;
            case 11:
                ((h3.a2) obj).onMediaMetadataChanged(((h3.h0) this.b).a.O);
                break;
            case 12:
                ((h3.a2) obj).onMetadata((z3.c) this.b);
                break;
            case 13:
                ((h3.a2) obj).onDeviceInfoChanged((h3.m) this.b);
                break;
            case 14:
            default:
                ((i3.b) obj).h((k3.f) this.b);
                break;
            case 15:
                ((i3.b) obj).b((j4.y) this.b);
                break;
            case 16:
                ((i3.b) obj).a((h3.v1) this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        switch (this.a) {
            case 19:
                return ih.w0.a((ih.w0) this.b, (Long) obj2);
            default:
                uq0 uq0Var = (uq0) this.b;
                if (((Integer) obj).intValue() != -1) {
                    return Boolean.FALSE;
                }
                new jh.t(uq0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new bg.i(uq0Var, 21)).show();
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ i3(i3.a aVar, Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    public /* synthetic */ i3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 3:
                v7.b((v7) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            default:
                la laVar = (la) this.b;
                l41 l41Var = (l41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                laVar.getClass();
                if (l41Var.G instanceof TL_stars.StarsTransaction) {
                    oa.h1(laVar.getContext(), false, 0L, laVar.c, (TL_stars.StarsTransaction) l41Var.G, laVar.b);
                    break;
                }
                break;
        }
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
