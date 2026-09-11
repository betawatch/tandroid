package a1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import b5.h;
import bi.ba;
import bi.c9;
import bi.ca;
import bi.d1;
import bi.db;
import bi.e1;
import bi.e3;
import bi.eb;
import bi.f1;
import bi.g1;
import bi.jb;
import bi.o0;
import bi.o1;
import bi.pb;
import bi.r6;
import bi.t1;
import bi.u;
import bi.z;
import ci.t;
import ci.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.y;
import di.b7;
import di.dc;
import di.f6;
import di.fb;
import di.fc;
import di.h7;
import di.hb;
import di.ja;
import di.l7;
import di.na;
import di.o8;
import di.p1;
import di.pc;
import di.r;
import di.rb;
import di.s3;
import di.x3;
import fg.k;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.lx;
import org.telegram.ui.uy;
import qg.s1;
import r0.l1;
import r0.n;
import s4.m0;
import wh.l;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, bl0, Utilities.Callback2Return, al0, a2, c9, jb, l, n, Continuation, OnCompleteListener, nk0, Utilities.Callback5, s1, CameraController.VideoTakeCallback, a5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public l1 T0(View view, l1 l1Var) {
        pb pbVar = (pb) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pbVar.v.getLayoutParams();
        marginLayoutParams.topMargin = pbVar.c ? 0 : l1Var.d();
        marginLayoutParams.bottomMargin = pbVar.c ? l1Var.a.f(2).d : l1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        db dbVar = pbVar.s;
        if (dbVar != null) {
            dbVar.requestLayout();
        }
        eb ebVar = pbVar.v;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
        return l1.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b7  */
    @Override // org.telegram.ui.Components.bl0
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
        long j3;
        boolean z10;
        oq oqVar;
        boolean z11;
        boolean z12;
        n70 n70Var;
        int i18;
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 2:
                final lx lxVar = (lx) this.b;
                if (lxVar.N == 0.0f && lxVar.n0 == 0.0f) {
                    final long j10 = ((u) view).E;
                    uy uyVar = lxVar.O0;
                    i11 = ((n2) uyVar).currentAccount;
                    MediaDataController.getInstance(i11).loadHints(true);
                    n70 H = n70.H(uyVar, view);
                    H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    H.W(j6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), uyVar.getThemedColor(j6.d6)));
                    H.a0(0.0f, AndroidUtilities.dp(8.0f));
                    uyVar.L0 = H;
                    if (!UserObject.isService(j10)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i12 = ((n2) uyVar).currentAccount;
                        if (j10 != UserConfig.getInstance(i12).getClientUserId()) {
                            final TLRPC.User user = uyVar.getMessagesController().getUser(Long.valueOf(j10));
                            TLRPC.Chat chat = uyVar.getMessagesController().getChat(Long.valueOf(-j10));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, 0L);
                            i13 = ((n2) uyVar).currentAccount;
                            boolean c02 = NotificationsCustomSettingsActivity.c0(i13, j10);
                            i14 = ((n2) uyVar).currentAccount;
                            boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                            i15 = ((n2) uyVar).currentAccount;
                            boolean isPremium = UserConfig.getInstance(i15).isPremium();
                            i16 = ((n2) uyVar).currentAccount;
                            boolean J = MessagesController.getInstance(i16).getStoriesController().J(j10);
                            i17 = ((n2) uyVar).currentAccount;
                            boolean F = MessagesController.getInstance(i17).getStoriesController().F(j10);
                            if (premiumFeaturesBlocked || j10 <= 0 || isPremium) {
                                j3 = 0;
                                z10 = false;
                            } else {
                                z10 = false;
                                Drawable drawable = lxVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = lxVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        j3 = 0;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(uyVar.getThemedColor(j6.F8), PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        j3 = 0;
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    oqVar = new oq(drawable2, drawable);
                                    oq oqVar2 = oqVar;
                                    if (j10 < j3 && uyVar.X3().j(j10)) {
                                        final int i19 = 4;
                                        uyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), j6.F8, j6.E8, new Runnable() { // from class: org.telegram.ui.hx
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i20;
                                                switch (i19) {
                                                    case 0:
                                                        lxVar.O0.presentFragment(co.R9(j10));
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        uy uyVar2 = lxVar.O0;
                                                        i20 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                        MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                        long j11 = j10;
                                                        mediaDataController.removePeer(j11);
                                                        uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                        break;
                                                    case 4:
                                                        lxVar.O0.E0.j(j10);
                                                        break;
                                                    case 5:
                                                        lxVar.O0.presentFragment(co.R9(j10));
                                                        break;
                                                    default:
                                                        lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (user != null && !user.contact) {
                                        i18 = ((n2) uyVar).currentAccount;
                                        if (MediaDataController.getInstance(i18).containsTopPeer(j10)) {
                                            z11 = true;
                                            n70 n70Var2 = uyVar.L0;
                                            final int i20 = 5;
                                            n70Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i20) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            uy uyVar2 = lxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            lxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i21 = 6;
                                            n70Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i21) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            uy uyVar2 = lxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            lxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i22 = 0;
                                            n70Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i22) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            uy uyVar2 = lxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            lxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 < j3);
                                            final int i23 = 0;
                                            n70Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ix
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i24;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i23;
                                                    TLRPC.User user2 = user;
                                                    long j11 = j10;
                                                    String str = sharedPrefKey;
                                                    lx lxVar2 = lxVar;
                                                    switch (i26) {
                                                        case 0:
                                                            uy uyVar2 = lxVar2.O0;
                                                            i24 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            uyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.yc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            uy uyVar3 = lxVar2.O0;
                                                            i25 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            uyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.yc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !c02 && j10 > j3);
                                            n70Var2.E();
                                            final int i24 = 1;
                                            n70Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ix
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i24;
                                                    TLRPC.User user2 = user;
                                                    long j11 = j10;
                                                    String str = sharedPrefKey;
                                                    lx lxVar2 = lxVar;
                                                    switch (i26) {
                                                        case 0:
                                                            uy uyVar2 = lxVar2.O0;
                                                            i242 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            uyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.yc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            uy uyVar3 = lxVar2.O0;
                                                            i25 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            uyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.yc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, c02 && j10 > j3);
                                            n70Var2.E();
                                            final int i25 = 0;
                                            n70Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.jx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.f6 f6Var;
                                                    int i26;
                                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                                    switch (i25) {
                                                        case 0:
                                                            lx lxVar2 = lxVar;
                                                            uy uyVar2 = lxVar2.O0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i26 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof bi.u) {
                                                                        uyVar2.E0.i((bi.u) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = lxVar2.getContext();
                                                            f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                                            bi.f7 f7Var = new bi.f7(context, 0.0f, 1, f6Var);
                                                            f7Var.e = new kx(lxVar2, view2, 1);
                                                            uyVar2.showDialog(f7Var);
                                                            break;
                                                        default:
                                                            lx lxVar3 = lxVar;
                                                            Context context2 = lxVar3.getContext();
                                                            uy uyVar3 = lxVar3.O0;
                                                            f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                                            bi.f7 f7Var2 = new bi.f7(context2, 0.0f, 1, f6Var2);
                                                            f7Var2.e = new kx(lxVar3, view, 0);
                                                            uyVar3.showDialog(f7Var2);
                                                            break;
                                                    }
                                                }
                                            }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                                            n70Var2.E();
                                            z12 = premiumFeaturesBlocked && j10 > j3 && !isPremium && J && !F;
                                            int i26 = R.drawable.msg_stories_stealth2;
                                            String string = LocaleController.getString(R.string.ViewAnonymously);
                                            final int i27 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.jx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.f6 f6Var;
                                                    int i262;
                                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                                    switch (i27) {
                                                        case 0:
                                                            lx lxVar2 = lxVar;
                                                            uy uyVar2 = lxVar2.O0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i262 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof bi.u) {
                                                                        uyVar2.E0.i((bi.u) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = lxVar2.getContext();
                                                            f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                                            bi.f7 f7Var = new bi.f7(context, 0.0f, 1, f6Var);
                                                            f7Var.e = new kx(lxVar2, view2, 1);
                                                            uyVar2.showDialog(f7Var);
                                                            break;
                                                        default:
                                                            lx lxVar3 = lxVar;
                                                            Context context2 = lxVar3.getContext();
                                                            uy uyVar3 = lxVar3.O0;
                                                            f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                                            bi.f7 f7Var2 = new bi.f7(context2, 0.0f, 1, f6Var2);
                                                            f7Var2.e = new kx(lxVar3, view, 0);
                                                            uyVar3.showDialog(f7Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z12) {
                                                n70Var2.b(i26, oqVar2, string, j6.F8, j6.E8, runnable);
                                                n70Var = n70Var2;
                                            } else {
                                                n70Var = n70Var2;
                                            }
                                            n70Var.E();
                                            final int i28 = 1;
                                            n70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i28) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            uy uyVar2 = lxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            lxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z11 && !uyVar.e4());
                                            n70Var.E();
                                            final int i29 = 2;
                                            n70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i29) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            uy uyVar2 = lxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            lxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z11 && uyVar.e4());
                                            n70Var.E();
                                            final int i30 = 3;
                                            n70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i30) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            uy uyVar2 = lxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            lxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            lxVar.O0.presentFragment(co.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z11);
                                        }
                                    }
                                    z11 = false;
                                    n70 n70Var22 = uyVar.L0;
                                    final int i202 = 5;
                                    n70Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i202) {
                                                case 0:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    uy uyVar2 = lxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    lxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i212 = 6;
                                    n70Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i212) {
                                                case 0:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    uy uyVar2 = lxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    lxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    if (j10 < j3) {
                                    }
                                    final int i222 = 0;
                                    n70Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i222) {
                                                case 0:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    uy uyVar2 = lxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    lxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 < j3);
                                    final int i232 = 0;
                                    n70Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ix
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i252;
                                            int i262 = i232;
                                            TLRPC.User user2 = user;
                                            long j11 = j10;
                                            String str = sharedPrefKey;
                                            lx lxVar2 = lxVar;
                                            switch (i262) {
                                                case 0:
                                                    uy uyVar2 = lxVar2.O0;
                                                    i242 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    uyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.yc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    uy uyVar3 = lxVar2.O0;
                                                    i252 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    uyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.yc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !c02 && j10 > j3);
                                    n70Var22.E();
                                    final int i242 = 1;
                                    n70Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ix
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            String trim;
                                            int i252;
                                            int i262 = i242;
                                            TLRPC.User user2 = user;
                                            long j11 = j10;
                                            String str = sharedPrefKey;
                                            lx lxVar2 = lxVar;
                                            switch (i262) {
                                                case 0:
                                                    uy uyVar2 = lxVar2.O0;
                                                    i2422 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    uyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.yc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    uy uyVar3 = lxVar2.O0;
                                                    i252 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    uyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.yc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, c02 && j10 > j3);
                                    n70Var22.E();
                                    final int i252 = 0;
                                    n70Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.jx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.f6 f6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.f6 f6Var2;
                                            switch (i252) {
                                                case 0:
                                                    lx lxVar2 = lxVar;
                                                    uy uyVar2 = lxVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof bi.u) {
                                                                uyVar2.E0.i((bi.u) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = lxVar2.getContext();
                                                    f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                                    bi.f7 f7Var = new bi.f7(context, 0.0f, 1, f6Var);
                                                    f7Var.e = new kx(lxVar2, view2, 1);
                                                    uyVar2.showDialog(f7Var);
                                                    break;
                                                default:
                                                    lx lxVar3 = lxVar;
                                                    Context context2 = lxVar3.getContext();
                                                    uy uyVar3 = lxVar3.O0;
                                                    f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                                    bi.f7 f7Var2 = new bi.f7(context2, 0.0f, 1, f6Var2);
                                                    f7Var2.e = new kx(lxVar3, view, 0);
                                                    uyVar3.showDialog(f7Var2);
                                                    break;
                                            }
                                        }
                                    }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                                    n70Var22.E();
                                    if (premiumFeaturesBlocked) {
                                    }
                                    int i262 = R.drawable.msg_stories_stealth2;
                                    String string2 = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i272 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.jx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.f6 f6Var;
                                            int i2622;
                                            org.telegram.ui.ActionBar.f6 f6Var2;
                                            switch (i272) {
                                                case 0:
                                                    lx lxVar2 = lxVar;
                                                    uy uyVar2 = lxVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i2622 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof bi.u) {
                                                                uyVar2.E0.i((bi.u) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = lxVar2.getContext();
                                                    f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                                    bi.f7 f7Var = new bi.f7(context, 0.0f, 1, f6Var);
                                                    f7Var.e = new kx(lxVar2, view2, 1);
                                                    uyVar2.showDialog(f7Var);
                                                    break;
                                                default:
                                                    lx lxVar3 = lxVar;
                                                    Context context2 = lxVar3.getContext();
                                                    uy uyVar3 = lxVar3.O0;
                                                    f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                                    bi.f7 f7Var2 = new bi.f7(context2, 0.0f, 1, f6Var2);
                                                    f7Var2.e = new kx(lxVar3, view, 0);
                                                    uyVar3.showDialog(f7Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                    }
                                    n70Var.E();
                                    final int i282 = 1;
                                    n70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i282) {
                                                case 0:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    uy uyVar2 = lxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    lxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11 && !uyVar.e4());
                                    n70Var.E();
                                    final int i292 = 2;
                                    n70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i292) {
                                                case 0:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    uy uyVar2 = lxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    lxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11 && uyVar.e4());
                                    n70Var.E();
                                    final int i302 = 3;
                                    n70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i302) {
                                                case 0:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    uy uyVar2 = lxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    lxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    lxVar.O0.presentFragment(co.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11);
                                } else {
                                    j3 = 0;
                                }
                            }
                            oqVar = null;
                            oq oqVar22 = oqVar;
                            if (j10 < j3) {
                                final int i192 = 4;
                                uyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), j6.F8, j6.E8, new Runnable() { // from class: org.telegram.ui.hx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2022;
                                        switch (i192) {
                                            case 0:
                                                lxVar.O0.presentFragment(co.R9(j10));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                uy uyVar2 = lxVar.O0;
                                                i2022 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                lxVar.O0.E0.j(j10);
                                                break;
                                            case 5:
                                                lxVar.O0.presentFragment(co.R9(j10));
                                                break;
                                            default:
                                                lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null) {
                                i18 = ((n2) uyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j10)) {
                                }
                            }
                            z11 = false;
                            n70 n70Var222 = uyVar.L0;
                            final int i2022 = 5;
                            n70Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2022) {
                                        case 0:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            uy uyVar2 = lxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            lxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i2122 = 6;
                            n70Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2122) {
                                        case 0:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            uy uyVar2 = lxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            lxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            if (j10 < j3) {
                            }
                            final int i2222 = 0;
                            n70Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2222) {
                                        case 0:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            uy uyVar2 = lxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            lxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 < j3);
                            final int i2322 = 0;
                            n70Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ix
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2322;
                                    TLRPC.User user2 = user;
                                    long j11 = j10;
                                    String str = sharedPrefKey;
                                    lx lxVar2 = lxVar;
                                    switch (i2622) {
                                        case 0:
                                            uy uyVar2 = lxVar2.O0;
                                            i2422 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            uyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.yc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            uy uyVar3 = lxVar2.O0;
                                            i2522 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            uyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.yc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c02 && j10 > j3);
                            n70Var222.E();
                            final int i2422 = 1;
                            n70Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ix
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2422;
                                    TLRPC.User user2 = user;
                                    long j11 = j10;
                                    String str = sharedPrefKey;
                                    lx lxVar2 = lxVar;
                                    switch (i2622) {
                                        case 0:
                                            uy uyVar2 = lxVar2.O0;
                                            i24222 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            uyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.yc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            uy uyVar3 = lxVar2.O0;
                                            i2522 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            uyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.yc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c02 && j10 > j3);
                            n70Var222.E();
                            final int i2522 = 0;
                            n70Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.jx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    switch (i2522) {
                                        case 0:
                                            lx lxVar2 = lxVar;
                                            uy uyVar2 = lxVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof bi.u) {
                                                        uyVar2.E0.i((bi.u) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = lxVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                            bi.f7 f7Var = new bi.f7(context, 0.0f, 1, f6Var);
                                            f7Var.e = new kx(lxVar2, view2, 1);
                                            uyVar2.showDialog(f7Var);
                                            break;
                                        default:
                                            lx lxVar3 = lxVar;
                                            Context context2 = lxVar3.getContext();
                                            uy uyVar3 = lxVar3.O0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                            bi.f7 f7Var2 = new bi.f7(context2, 0.0f, 1, f6Var2);
                                            f7Var2.e = new kx(lxVar3, view, 0);
                                            uyVar3.showDialog(f7Var2);
                                            break;
                                    }
                                }
                            }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                            n70Var222.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i2622 = R.drawable.msg_stories_stealth2;
                            String string22 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i2722 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.jx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    int i26222;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    switch (i2722) {
                                        case 0:
                                            lx lxVar2 = lxVar;
                                            uy uyVar2 = lxVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i26222 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof bi.u) {
                                                        uyVar2.E0.i((bi.u) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = lxVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                            bi.f7 f7Var = new bi.f7(context, 0.0f, 1, f6Var);
                                            f7Var.e = new kx(lxVar2, view2, 1);
                                            uyVar2.showDialog(f7Var);
                                            break;
                                        default:
                                            lx lxVar3 = lxVar;
                                            Context context2 = lxVar3.getContext();
                                            uy uyVar3 = lxVar3.O0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                            bi.f7 f7Var2 = new bi.f7(context2, 0.0f, 1, f6Var2);
                                            f7Var2.e = new kx(lxVar3, view, 0);
                                            uyVar3.showDialog(f7Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            n70Var.E();
                            final int i2822 = 1;
                            n70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2822) {
                                        case 0:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            uy uyVar2 = lxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            lxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11 && !uyVar.e4());
                            n70Var.E();
                            final int i2922 = 2;
                            n70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2922) {
                                        case 0:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            uy uyVar2 = lxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            lxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11 && uyVar.e4());
                            n70Var.E();
                            final int i3022 = 3;
                            n70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i3022) {
                                        case 0:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new iw(lxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            uy uyVar2 = lxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            uyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            lxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            lxVar.O0.presentFragment(co.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11);
                        } else if (uyVar.O3) {
                            n70 n70Var3 = uyVar.L0;
                            int i31 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i32 = j6.F8;
                            int i33 = j6.E8;
                            final int i34 = 0;
                            n70Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i34) {
                                        case 0:
                                            lxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            uy uyVar2 = lxVar.O0;
                                            i35 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            uyVar2.presentFragment(new org.telegram.ui.Components.ca0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            uy uyVar3 = lxVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            uyVar3.presentFragment(new org.telegram.ui.Components.ca0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 1;
                            uyVar.L0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i36;
                                    switch (i35) {
                                        case 0:
                                            lxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            uy uyVar2 = lxVar.O0;
                                            i352 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            uyVar2.presentFragment(new org.telegram.ui.Components.ca0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            uy uyVar3 = lxVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            uyVar3.presentFragment(new org.telegram.ui.Components.ca0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i36 = 2;
                            uyVar.L0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i362;
                                    switch (i36) {
                                        case 0:
                                            lxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            uy uyVar2 = lxVar.O0;
                                            i352 = ((org.telegram.ui.ActionBar.n2) uyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            uyVar2.presentFragment(new org.telegram.ui.Components.ca0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            uy uyVar3 = lxVar.O0;
                                            i362 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            uyVar3.presentFragment(new org.telegram.ui.Components.ca0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z10 = false;
                        } else {
                            lx lxVar2 = uyVar.E0;
                            if (lxVar2 != null) {
                                lxVar2.n();
                            }
                        }
                        n70 n70Var4 = uyVar.L0;
                        n70Var4.i = 3;
                        n70Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        n70Var4.Z();
                        return z10;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            case 13:
                lr0 lr0Var = ((t) this.b).W;
                if (lr0Var.G.C1 || !(view instanceof t7)) {
                    return false;
                }
                MessageObject messageObject = ((t7) view).getMessageObject();
                if (lr0Var.c(messageObject)) {
                    lr0Var.g(messageObject);
                } else {
                    lr0Var.e(messageObject);
                }
                return true;
            default:
                x3 x3Var = (x3) this.b;
                ArrayList arrayList = x3Var.b0;
                ArrayList arrayList2 = x3Var.h0;
                if (i10 >= 2 && x3Var.W != null && (view instanceof s3)) {
                    int i37 = i10 - 2;
                    if (!x3Var.c0) {
                        if (x3Var.d0) {
                            if (i37 < 0 || i37 >= arrayList.size()) {
                                i37 -= arrayList.size();
                            }
                        }
                        if (i37 >= 0) {
                            photoEntry = (MediaController.PhotoEntry) x3Var.f0.get(i37);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(photoEntry)) {
                                }
                                AndroidUtilities.updateVisibleRows(x3Var.d);
                                x3Var.j();
                                return true;
                            }
                        }
                    } else if (i37 != 0) {
                        i37 = i10 - 3;
                        if (i37 >= 0 && i37 < x3Var.f0.size()) {
                            photoEntry = (MediaController.PhotoEntry) x3Var.f0.get(i37);
                            if (arrayList2.isEmpty() && !x3Var.Q) {
                                if (!arrayList2.contains(photoEntry)) {
                                    arrayList2.remove(photoEntry);
                                } else {
                                    if (arrayList2.size() + 1 > x3Var.R) {
                                        int i38 = -x3Var.N;
                                        x3Var.N = i38;
                                        AndroidUtilities.shakeViewSpring(view, i38);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        return true;
                                    }
                                    arrayList2.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(x3Var.d);
                                x3Var.j();
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public void b() {
        ((p1) this.b).invalidate();
    }

    @Override // a5.b
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, h hVar) {
        h hVar2;
        k kVar = (k) this.b;
        if (webView == kVar.m && z10 && kVar.d.equals(uri.toString())) {
            int i10 = aVar.b;
            if (i10 == 0) {
                aVar.d(0);
                kVar.g((String) aVar.c, hVar);
                return;
            }
            if (i10 == 1) {
                synchronized (kVar.a) {
                    if (!kVar.p && (hVar2 = kVar.n) != null && hVar2 == hVar) {
                        aVar.d(1);
                        byte[] bArr = (byte[]) aVar.d;
                        Objects.requireNonNull(bArr);
                        kVar.i.execute(new b7(22, kVar, bArr));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        long j3;
        int i11;
        int i12;
        int i13;
        e3 e3Var = (e3) this.b;
        o0 o0Var = e3Var.c;
        ArrayList arrayList = e3Var.r;
        f1 f1Var = ((d1) view).f;
        int i14 = e3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= f1Var.f.size()) {
                break;
            }
            e1 e1Var = (e1) f1Var.f.get(i16);
            long j10 = e1Var.g;
            if (j10 > 0 && currentTime - e1Var.d <= z.b(i14, (int) j10, 0)) {
                hashSet.add(Integer.valueOf(e1Var.a));
            }
            i16++;
        }
        t1 t1Var = e3Var.P;
        long j11 = t1Var != null ? t1Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            e1 e1Var2 = (e1) arrayList.get(i17);
            if (e1Var2.b || !e1Var2.e || e1Var2.g >= j11) {
                if (hashSet.contains(Integer.valueOf(e1Var2.a))) {
                    j3 = j11;
                    if (e3Var.w != f1Var.b || (i13 = e3Var.x) == 0 || e1Var2.a < i13) {
                        i11 = e1Var2.a;
                        break;
                    }
                } else {
                    j3 = j11;
                }
                i18++;
            } else {
                j3 = j11;
            }
            i17++;
            j11 = j3;
        }
        j3 = j11;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
                e1 e1Var3 = (e1) arrayList.get(i15);
                if (e1Var3.b || !e1Var3.e || e1Var3.g >= j3) {
                    if (hashSet.contains(Integer.valueOf(e1Var3.a))) {
                        i12 = e1Var3.a;
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
        e3Var.w = f1Var.b;
        e3Var.x = i12;
        e3Var.y = true;
        m0 itemAnimator = o0Var.getItemAnimator();
        o0Var.setItemAnimator(null);
        e3Var.d.i1(i18, o0Var.getHeight() / 2, true);
        e3Var.e.m(i18);
        o0Var.setItemAnimator(itemAnimator);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // bi.c9
    public void e(boolean z10) {
        r6 r6Var = (r6) this.b;
        if (r6Var != null) {
            r6Var.c();
        }
    }

    @Override // qg.s1
    public void f() {
        rb rbVar = (rb) this.b;
        TextView textView = rbVar.o1;
        boolean a2 = rbVar.D0.a();
        ImageView imageView = rbVar.n1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 5:
                ((Runnable) this.b).run();
                break;
            case 20:
                pc pcVar = ((fc) ((r) this.b)).S1;
                dc dcVar = pcVar.X0;
                if (dcVar != null) {
                    dcVar.s(null, null, true);
                }
                rb rbVar = pcVar.v1;
                if (rbVar != null) {
                    rbVar.q0();
                }
                fc fcVar = pcVar.c1;
                if (fcVar != null) {
                    fcVar.setHasRoundVideo(false);
                }
                o8 o8Var = pcVar.K1;
                if (o8Var != null) {
                    File file = o8Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        pcVar.K1.o0 = null;
                    }
                    if (pcVar.K1.p0 != null) {
                        try {
                            new File(pcVar.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        pcVar.K1.p0 = null;
                        break;
                    }
                }
                break;
            default:
                ((f6) this.b).a.p2.r();
                break;
        }
    }

    @Override // bi.jb
    public void h(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // wh.l
    public void o(wh.h hVar, float f7, float f10) {
        ca caVar = (ca) this.b;
        if (caVar.v.x) {
            return;
        }
        hVar.q = new ba(caVar, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = caVar.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.h) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 16:
                b0.b((Intent) this.b);
                break;
            case 17:
                ((d0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        di.jb jbVar = (di.jb) this.b;
        pc pcVar = jbVar.a;
        l7 l7Var = pcVar.O0;
        int i10 = pcVar.c;
        if (l7Var != null) {
            l7Var.g(true);
        }
        if (pcVar.q0()) {
            pcVar.s.d();
        }
        if (pcVar.G1 == null || pcVar.B0 == null) {
            return;
        }
        pcVar.Q1 = false;
        pcVar.R1 = false;
        h7 h7Var = pcVar.C0;
        if (h7Var != null) {
            h7Var.c(false);
        }
        if (j3 <= 800) {
            pcVar.h(false, true);
            pcVar.d0(false);
            pcVar.J0.b(false, true);
            l7 l7Var2 = pcVar.O0;
            if (l7Var2 != null) {
                l7Var2.g(true);
            }
            try {
                pcVar.G1.delete();
                pcVar.G1 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        pcVar.i0(false, true);
        o8 o9 = o8.o(pcVar.G1, str, j3);
        o9.J0 = pcVar.v0;
        o9.K0 = pcVar.w0;
        o9.B();
        pcVar.h(false, true);
        pcVar.d0(false);
        pcVar.J0.b(false, true);
        l7 l7Var3 = pcVar.O0;
        if (l7Var3 != null) {
            l7Var3.g(true);
        }
        if (!pcVar.A0.j()) {
            pcVar.K1 = o9;
            ja.a(i10, o9);
            pcVar.L1 = false;
            int videoWidth = pcVar.B0.getVideoWidth();
            int videoHeight = pcVar.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                o8 o8Var = pcVar.K1;
                o8Var.k0 = videoWidth;
                o8Var.l0 = videoHeight;
                o8Var.A();
            }
            pcVar.L(new hb(jbVar, 3), 0L);
            return;
        }
        pcVar.G1 = null;
        o9.P = 1.0f;
        if (pcVar.A0.l(o9)) {
            o8 a2 = o8.a(pcVar.A0.getLayout(), pcVar.A0.getContent());
            pcVar.K1 = a2;
            ja.a(i10, a2);
            pcVar.L1 = false;
            int videoWidth2 = pcVar.B0.getVideoWidth();
            int videoHeight2 = pcVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                o8 o8Var2 = pcVar.K1;
                o8Var2.k0 = videoWidth2;
                o8Var2.l0 = videoHeight2;
                o8Var2.A();
            }
        }
        pcVar.m0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                return;
            case 11:
                ((b1.f) this.b).invoke(obj);
                return;
            case 14:
                y yVar = (y) obj;
                if (!((FirebaseMessaging) this.b).e.n() || yVar.h.a() == null) {
                    return;
                }
                synchronized (yVar) {
                    z10 = yVar.g;
                }
                if (z10) {
                    return;
                }
                yVar.h(0L);
                return;
            case 19:
                ((b1.f) this.b).invoke(obj);
                return;
            case 27:
                ((e1.b) this.b).invoke(obj);
                return;
            default:
                ((e1.b) this.b).invoke(obj);
                return;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fb fbVar = (fb) this.b;
        h51 h51Var = (h51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = h51Var.d;
        o8 o8Var = (o8) h51Var.G;
        fbVar.c(false, true);
        pc pcVar = fbVar.O;
        if (o8Var == pcVar.K1 || pcVar.X1) {
            return;
        }
        pcVar.d1.setSelected(i10);
        pcVar.X1 = true;
        ah.g gVar = new ah.g(pcVar, i10, 7);
        rb rbVar = pcVar.v1;
        o8 o8Var2 = pcVar.K1;
        if (rbVar == null || o8Var2 == null) {
            gVar.run();
            return;
        }
        if (!rbVar.u0()) {
            gVar.run();
            return;
        }
        o8Var2.f();
        boolean u02 = rbVar.u0();
        boolean z10 = rbVar.O0.getPainting().E;
        Utilities.searchQueue.postRunnable(new na(pcVar, rbVar, o8Var2.i0, o8Var2.j0, o8Var2, z10, u02, gVar, 0));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((com.google.firebase.messaging.n) this.b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                return g1.a((g1) this.b, (Long) obj2);
            default:
                lr0 lr0Var = (lr0) this.b;
                if (((Integer) obj).intValue() == -1) {
                    new x(lr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new o1(lr0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
