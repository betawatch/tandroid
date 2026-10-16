package a1;

import a6.m;
import ab.e0;
import ab.f0;
import android.content.Context;
import android.content.Intent;
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
import android.widget.ImageView;
import android.widget.TextView;
import bi.d1;
import bi.e1;
import bi.ea;
import bi.f1;
import bi.f9;
import bi.fa;
import bi.g1;
import bi.gb;
import bi.h3;
import bi.hb;
import bi.mb;
import bi.o0;
import bi.sb;
import bi.t1;
import bi.u;
import bi.v6;
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
import di.ac;
import di.bb;
import di.d6;
import di.db;
import di.e7;
import di.fb;
import di.i7;
import di.ja;
import di.k8;
import di.kc;
import di.o1;
import di.q3;
import di.r;
import di.v3;
import di.yb;
import e9.l1;
import e9.q1;
import e9.s;
import h2.i;
import h2.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.px;
import org.telegram.ui.yy;
import qg.s1;
import r0.n;
import s4.l0;
import wh.k;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, i, i5.e, cm0, Utilities.Callback2Return, bm0, z1, f9, mb, k, n, Continuation, OnCompleteListener, ol0, Utilities.Callback5, s1, CameraController.VideoTakeCallback, l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        sb sbVar = (sb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sbVar.v.getLayoutParams();
        marginLayoutParams.topMargin = sbVar.c ? 0 : l1Var.d();
        marginLayoutParams.bottomMargin = sbVar.c ? l1Var.a.f(2).d : l1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        gb gbVar = sbVar.s;
        if (gbVar != null) {
            gbVar.requestLayout();
        }
        hb hbVar = sbVar.v;
        if (hbVar != null) {
            hbVar.requestLayout();
        }
        return r0.l1.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0331 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b7  */
    @Override // org.telegram.ui.Components.cm0
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
        boolean z10;
        long j10;
        cr crVar;
        boolean z11;
        boolean z12;
        l80 l80Var;
        int i18;
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 3:
                final px pxVar = (px) this.b;
                if (pxVar.N == 0.0f && pxVar.n0 == 0.0f) {
                    final long j11 = ((u) view).E;
                    yy yyVar = pxVar.O0;
                    i11 = ((m2) yyVar).currentAccount;
                    MediaDataController.getInstance(i11).loadHints(true);
                    l80 H = l80.H(yyVar, view);
                    H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    H.W(g6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), yyVar.getThemedColor(g6.d6)));
                    H.a0(0.0f, AndroidUtilities.dp(8.0f));
                    yyVar.L0 = H;
                    if (!UserObject.isService(j11)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i12 = ((m2) yyVar).currentAccount;
                        if (j11 != UserConfig.getInstance(i12).getClientUserId()) {
                            final TLRPC.User user = yyVar.getMessagesController().getUser(Long.valueOf(j11));
                            TLRPC.Chat chat = yyVar.getMessagesController().getChat(Long.valueOf(-j11));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, 0L);
                            i13 = ((m2) yyVar).currentAccount;
                            boolean c02 = NotificationsCustomSettingsActivity.c0(i13, j11);
                            i14 = ((m2) yyVar).currentAccount;
                            boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                            i15 = ((m2) yyVar).currentAccount;
                            boolean isPremium = UserConfig.getInstance(i15).isPremium();
                            i16 = ((m2) yyVar).currentAccount;
                            boolean J = MessagesController.getInstance(i16).getStoriesController().J(j11);
                            i17 = ((m2) yyVar).currentAccount;
                            boolean F = MessagesController.getInstance(i17).getStoriesController().F(j11);
                            if (premiumFeaturesBlocked || j11 <= 0 || isPremium) {
                                z10 = false;
                            } else {
                                z10 = false;
                                Drawable drawable = pxVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = pxVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        j10 = 0;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(yyVar.getThemedColor(g6.F8), PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        j10 = 0;
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    crVar = new cr(drawable2, drawable);
                                    cr crVar2 = crVar;
                                    if (j11 < j10 && yyVar.V3().j(j11)) {
                                        final int i19 = 4;
                                        yyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), g6.F8, g6.E8, new Runnable() { // from class: org.telegram.ui.lx
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i20;
                                                switch (i19) {
                                                    case 0:
                                                        pxVar.O0.presentFragment(fo.W9(j11));
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        yy yyVar2 = pxVar.O0;
                                                        i20 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                        MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                        long j12 = j11;
                                                        mediaDataController.removePeer(j12);
                                                        yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                        break;
                                                    case 4:
                                                        pxVar.O0.E0.j(j11);
                                                        break;
                                                    case 5:
                                                        pxVar.O0.presentFragment(fo.W9(j11));
                                                        break;
                                                    default:
                                                        pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (user != null && !user.contact) {
                                        i18 = ((m2) yyVar).currentAccount;
                                        if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                            z11 = true;
                                            l80 l80Var2 = yyVar.L0;
                                            final int i20 = 5;
                                            l80Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.lx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i20) {
                                                        case 0:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yy yyVar2 = pxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            pxVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        default:
                                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10 ? true : z10);
                                            final int i21 = 6;
                                            l80Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.lx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i21) {
                                                        case 0:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yy yyVar2 = pxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            pxVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        default:
                                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10 ? true : z10);
                                            final int i22 = 0;
                                            l80Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.lx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i22) {
                                                        case 0:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yy yyVar2 = pxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            pxVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        default:
                                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 < j10 ? true : z10);
                                            final int i23 = 0;
                                            l80Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.mx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i24;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i23;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    px pxVar2 = pxVar;
                                                    switch (i26) {
                                                        case 0:
                                                            yy yyVar2 = pxVar2.O0;
                                                            i24 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            yyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.zc.a0(yyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            yy yyVar3 = pxVar2.O0;
                                                            i25 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            yyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.zc.a0(yyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, (c02 || j11 <= j10) ? z10 : true);
                                            l80Var2.E();
                                            final int i24 = 1;
                                            l80Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.mx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i24;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    px pxVar2 = pxVar;
                                                    switch (i26) {
                                                        case 0:
                                                            yy yyVar2 = pxVar2.O0;
                                                            i242 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            yyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.zc.a0(yyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            yy yyVar3 = pxVar2.O0;
                                                            i25 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            yyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.zc.a0(yyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, (!c02 || j11 <= j10) ? z10 : true);
                                            l80Var2.E();
                                            final int i25 = 0;
                                            l80Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.nx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.c6 c6Var;
                                                    int i26;
                                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                                    switch (i25) {
                                                        case 0:
                                                            px pxVar2 = pxVar;
                                                            yy yyVar2 = pxVar2.O0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i26 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof bi.u) {
                                                                        yyVar2.E0.i((bi.u) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = pxVar2.getContext();
                                                            c6Var = ((org.telegram.ui.ActionBar.m2) yyVar2).resourceProvider;
                                                            bi.j7 j7Var = new bi.j7(context, 0.0f, 1, c6Var);
                                                            j7Var.e = new ox(pxVar2, view2, 1);
                                                            yyVar2.showDialog(j7Var);
                                                            break;
                                                        default:
                                                            px pxVar3 = pxVar;
                                                            Context context2 = pxVar3.getContext();
                                                            yy yyVar3 = pxVar3.O0;
                                                            c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar3).resourceProvider;
                                                            bi.j7 j7Var2 = new bi.j7(context2, 0.0f, 1, c6Var2);
                                                            j7Var2.e = new ox(pxVar3, view, 0);
                                                            yyVar3.showDialog(j7Var2);
                                                            break;
                                                    }
                                                }
                                            }, (premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F) ? true : z10);
                                            l80Var2.E();
                                            z12 = (!premiumFeaturesBlocked || j11 <= j10 || isPremium || !J || F) ? z10 : true;
                                            int i26 = R.drawable.msg_stories_stealth2;
                                            String string = LocaleController.getString(R.string.ViewAnonymously);
                                            final int i27 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.nx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.c6 c6Var;
                                                    int i262;
                                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                                    switch (i27) {
                                                        case 0:
                                                            px pxVar2 = pxVar;
                                                            yy yyVar2 = pxVar2.O0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i262 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof bi.u) {
                                                                        yyVar2.E0.i((bi.u) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = pxVar2.getContext();
                                                            c6Var = ((org.telegram.ui.ActionBar.m2) yyVar2).resourceProvider;
                                                            bi.j7 j7Var = new bi.j7(context, 0.0f, 1, c6Var);
                                                            j7Var.e = new ox(pxVar2, view2, 1);
                                                            yyVar2.showDialog(j7Var);
                                                            break;
                                                        default:
                                                            px pxVar3 = pxVar;
                                                            Context context2 = pxVar3.getContext();
                                                            yy yyVar3 = pxVar3.O0;
                                                            c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar3).resourceProvider;
                                                            bi.j7 j7Var2 = new bi.j7(context2, 0.0f, 1, c6Var2);
                                                            j7Var2.e = new ox(pxVar3, view, 0);
                                                            yyVar3.showDialog(j7Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z12) {
                                                l80Var2.b(i26, crVar2, string, g6.F8, g6.E8, runnable);
                                                l80Var = l80Var2;
                                            } else {
                                                l80Var = l80Var2;
                                            }
                                            l80Var.E();
                                            final int i28 = 1;
                                            l80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.lx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i28) {
                                                        case 0:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yy yyVar2 = pxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            pxVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        default:
                                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, (!z11 || yyVar.c4()) ? z10 : true);
                                            l80Var.E();
                                            final int i29 = 2;
                                            l80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.lx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i29) {
                                                        case 0:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yy yyVar2 = pxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            pxVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        default:
                                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, (z11 && yyVar.c4()) ? true : z10);
                                            l80Var.E();
                                            final int i30 = 3;
                                            l80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.lx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i30) {
                                                        case 0:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yy yyVar2 = pxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            pxVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            pxVar.O0.presentFragment(fo.W9(j11));
                                                            break;
                                                        default:
                                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11);
                                        }
                                    }
                                    z11 = z10;
                                    l80 l80Var22 = yyVar.L0;
                                    final int i202 = 5;
                                    l80Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.lx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i202) {
                                                case 0:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yy yyVar2 = pxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    pxVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                default:
                                                    pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10 ? true : z10);
                                    final int i212 = 6;
                                    l80Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.lx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i212) {
                                                case 0:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yy yyVar2 = pxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    pxVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                default:
                                                    pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10 ? true : z10);
                                    if (j11 < j10) {
                                    }
                                    final int i222 = 0;
                                    l80Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.lx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i222) {
                                                case 0:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yy yyVar2 = pxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    pxVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                default:
                                                    pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 < j10 ? true : z10);
                                    final int i232 = 0;
                                    l80Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.mx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i252;
                                            int i262 = i232;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            px pxVar2 = pxVar;
                                            switch (i262) {
                                                case 0:
                                                    yy yyVar2 = pxVar2.O0;
                                                    i242 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    yyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.zc.a0(yyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    yy yyVar3 = pxVar2.O0;
                                                    i252 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    yyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.zc.a0(yyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, (c02 || j11 <= j10) ? z10 : true);
                                    l80Var22.E();
                                    final int i242 = 1;
                                    l80Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.mx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            String trim;
                                            int i252;
                                            int i262 = i242;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            px pxVar2 = pxVar;
                                            switch (i262) {
                                                case 0:
                                                    yy yyVar2 = pxVar2.O0;
                                                    i2422 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    yyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.zc.a0(yyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    yy yyVar3 = pxVar2.O0;
                                                    i252 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    yyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.zc.a0(yyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, (!c02 || j11 <= j10) ? z10 : true);
                                    l80Var22.E();
                                    final int i252 = 0;
                                    l80Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.nx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.c6 c6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.c6 c6Var2;
                                            switch (i252) {
                                                case 0:
                                                    px pxVar2 = pxVar;
                                                    yy yyVar2 = pxVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof bi.u) {
                                                                yyVar2.E0.i((bi.u) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = pxVar2.getContext();
                                                    c6Var = ((org.telegram.ui.ActionBar.m2) yyVar2).resourceProvider;
                                                    bi.j7 j7Var = new bi.j7(context, 0.0f, 1, c6Var);
                                                    j7Var.e = new ox(pxVar2, view2, 1);
                                                    yyVar2.showDialog(j7Var);
                                                    break;
                                                default:
                                                    px pxVar3 = pxVar;
                                                    Context context2 = pxVar3.getContext();
                                                    yy yyVar3 = pxVar3.O0;
                                                    c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar3).resourceProvider;
                                                    bi.j7 j7Var2 = new bi.j7(context2, 0.0f, 1, c6Var2);
                                                    j7Var2.e = new ox(pxVar3, view, 0);
                                                    yyVar3.showDialog(j7Var2);
                                                    break;
                                            }
                                        }
                                    }, (premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F) ? true : z10);
                                    l80Var22.E();
                                    if (premiumFeaturesBlocked) {
                                    }
                                    int i262 = R.drawable.msg_stories_stealth2;
                                    String string2 = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i272 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.nx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.c6 c6Var;
                                            int i2622;
                                            org.telegram.ui.ActionBar.c6 c6Var2;
                                            switch (i272) {
                                                case 0:
                                                    px pxVar2 = pxVar;
                                                    yy yyVar2 = pxVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i2622 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof bi.u) {
                                                                yyVar2.E0.i((bi.u) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = pxVar2.getContext();
                                                    c6Var = ((org.telegram.ui.ActionBar.m2) yyVar2).resourceProvider;
                                                    bi.j7 j7Var = new bi.j7(context, 0.0f, 1, c6Var);
                                                    j7Var.e = new ox(pxVar2, view2, 1);
                                                    yyVar2.showDialog(j7Var);
                                                    break;
                                                default:
                                                    px pxVar3 = pxVar;
                                                    Context context2 = pxVar3.getContext();
                                                    yy yyVar3 = pxVar3.O0;
                                                    c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar3).resourceProvider;
                                                    bi.j7 j7Var2 = new bi.j7(context2, 0.0f, 1, c6Var2);
                                                    j7Var2.e = new ox(pxVar3, view, 0);
                                                    yyVar3.showDialog(j7Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                    }
                                    l80Var.E();
                                    final int i282 = 1;
                                    l80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.lx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i282) {
                                                case 0:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yy yyVar2 = pxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    pxVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                default:
                                                    pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, (!z11 || yyVar.c4()) ? z10 : true);
                                    l80Var.E();
                                    final int i292 = 2;
                                    l80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.lx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i292) {
                                                case 0:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yy yyVar2 = pxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    pxVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                default:
                                                    pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, (z11 && yyVar.c4()) ? true : z10);
                                    l80Var.E();
                                    final int i302 = 3;
                                    l80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.lx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i302) {
                                                case 0:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yy yyVar2 = pxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    pxVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    pxVar.O0.presentFragment(fo.W9(j11));
                                                    break;
                                                default:
                                                    pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11);
                                }
                            }
                            j10 = 0;
                            crVar = null;
                            cr crVar22 = crVar;
                            if (j11 < j10) {
                                final int i192 = 4;
                                yyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), g6.F8, g6.E8, new Runnable() { // from class: org.telegram.ui.lx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2022;
                                        switch (i192) {
                                            case 0:
                                                pxVar.O0.presentFragment(fo.W9(j11));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                                break;
                                            case 3:
                                                yy yyVar2 = pxVar.O0;
                                                i2022 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                long j12 = j11;
                                                mediaDataController.removePeer(j12);
                                                yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                break;
                                            case 4:
                                                pxVar.O0.E0.j(j11);
                                                break;
                                            case 5:
                                                pxVar.O0.presentFragment(fo.W9(j11));
                                                break;
                                            default:
                                                pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null) {
                                i18 = ((m2) yyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                }
                            }
                            z11 = z10;
                            l80 l80Var222 = yyVar.L0;
                            final int i2022 = 5;
                            l80Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.lx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2022) {
                                        case 0:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 3:
                                            yy yyVar2 = pxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            pxVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        default:
                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10 ? true : z10);
                            final int i2122 = 6;
                            l80Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.lx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2122) {
                                        case 0:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 3:
                                            yy yyVar2 = pxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            pxVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        default:
                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10 ? true : z10);
                            if (j11 < j10) {
                            }
                            final int i2222 = 0;
                            l80Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.lx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2222) {
                                        case 0:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 3:
                                            yy yyVar2 = pxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            pxVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        default:
                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 < j10 ? true : z10);
                            final int i2322 = 0;
                            l80Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.mx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2322;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    px pxVar2 = pxVar;
                                    switch (i2622) {
                                        case 0:
                                            yy yyVar2 = pxVar2.O0;
                                            i2422 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            yyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.zc.a0(yyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            yy yyVar3 = pxVar2.O0;
                                            i2522 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            yyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.zc.a0(yyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, (c02 || j11 <= j10) ? z10 : true);
                            l80Var222.E();
                            final int i2422 = 1;
                            l80Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.mx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2422;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    px pxVar2 = pxVar;
                                    switch (i2622) {
                                        case 0:
                                            yy yyVar2 = pxVar2.O0;
                                            i24222 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            yyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.zc.a0(yyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            yy yyVar3 = pxVar2.O0;
                                            i2522 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            yyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.zc.a0(yyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, (!c02 || j11 <= j10) ? z10 : true);
                            l80Var222.E();
                            final int i2522 = 0;
                            l80Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.nx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.c6 c6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                    switch (i2522) {
                                        case 0:
                                            px pxVar2 = pxVar;
                                            yy yyVar2 = pxVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof bi.u) {
                                                        yyVar2.E0.i((bi.u) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = pxVar2.getContext();
                                            c6Var = ((org.telegram.ui.ActionBar.m2) yyVar2).resourceProvider;
                                            bi.j7 j7Var = new bi.j7(context, 0.0f, 1, c6Var);
                                            j7Var.e = new ox(pxVar2, view2, 1);
                                            yyVar2.showDialog(j7Var);
                                            break;
                                        default:
                                            px pxVar3 = pxVar;
                                            Context context2 = pxVar3.getContext();
                                            yy yyVar3 = pxVar3.O0;
                                            c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar3).resourceProvider;
                                            bi.j7 j7Var2 = new bi.j7(context2, 0.0f, 1, c6Var2);
                                            j7Var2.e = new ox(pxVar3, view, 0);
                                            yyVar3.showDialog(j7Var2);
                                            break;
                                    }
                                }
                            }, (premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F) ? true : z10);
                            l80Var222.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i2622 = R.drawable.msg_stories_stealth2;
                            String string22 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i2722 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.nx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.c6 c6Var;
                                    int i26222;
                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                    switch (i2722) {
                                        case 0:
                                            px pxVar2 = pxVar;
                                            yy yyVar2 = pxVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i26222 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof bi.u) {
                                                        yyVar2.E0.i((bi.u) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = pxVar2.getContext();
                                            c6Var = ((org.telegram.ui.ActionBar.m2) yyVar2).resourceProvider;
                                            bi.j7 j7Var = new bi.j7(context, 0.0f, 1, c6Var);
                                            j7Var.e = new ox(pxVar2, view2, 1);
                                            yyVar2.showDialog(j7Var);
                                            break;
                                        default:
                                            px pxVar3 = pxVar;
                                            Context context2 = pxVar3.getContext();
                                            yy yyVar3 = pxVar3.O0;
                                            c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar3).resourceProvider;
                                            bi.j7 j7Var2 = new bi.j7(context2, 0.0f, 1, c6Var2);
                                            j7Var2.e = new ox(pxVar3, view, 0);
                                            yyVar3.showDialog(j7Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            l80Var.E();
                            final int i2822 = 1;
                            l80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.lx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2822) {
                                        case 0:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 3:
                                            yy yyVar2 = pxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            pxVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        default:
                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, (!z11 || yyVar.c4()) ? z10 : true);
                            l80Var.E();
                            final int i2922 = 2;
                            l80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.lx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2922) {
                                        case 0:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 3:
                                            yy yyVar2 = pxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            pxVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        default:
                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, (z11 && yyVar.c4()) ? true : z10);
                            l80Var.E();
                            final int i3022 = 3;
                            l80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.lx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i3022) {
                                        case 0:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new lw(pxVar.O0, j11, !r2.c4(), 0), 200L);
                                            break;
                                        case 3:
                                            yy yyVar2 = pxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            yyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            pxVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            pxVar.O0.presentFragment(fo.W9(j11));
                                            break;
                                        default:
                                            pxVar.O0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11);
                        } else if (yyVar.O3) {
                            l80 l80Var3 = yyVar.L0;
                            int i31 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i32 = g6.F8;
                            int i33 = g6.E8;
                            final int i34 = 0;
                            l80Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.kx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i34) {
                                        case 0:
                                            pxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            yy yyVar2 = pxVar.O0;
                                            i35 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            yyVar2.presentFragment(new org.telegram.ui.Components.cb0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            yy yyVar3 = pxVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            yyVar3.presentFragment(new org.telegram.ui.Components.cb0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 1;
                            yyVar.L0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.kx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i36;
                                    switch (i35) {
                                        case 0:
                                            pxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            yy yyVar2 = pxVar.O0;
                                            i352 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            yyVar2.presentFragment(new org.telegram.ui.Components.cb0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            yy yyVar3 = pxVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            yyVar3.presentFragment(new org.telegram.ui.Components.cb0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i36 = 2;
                            yyVar.L0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.kx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i362;
                                    switch (i36) {
                                        case 0:
                                            pxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            yy yyVar2 = pxVar.O0;
                                            i352 = ((org.telegram.ui.ActionBar.m2) yyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            yyVar2.presentFragment(new org.telegram.ui.Components.cb0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            yy yyVar3 = pxVar.O0;
                                            i362 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            yyVar3.presentFragment(new org.telegram.ui.Components.cb0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z10 = false;
                        } else {
                            px pxVar2 = yyVar.E0;
                            if (pxVar2 != null) {
                                pxVar2.n();
                            }
                        }
                        l80 l80Var4 = yyVar.L0;
                        l80Var4.i = 3;
                        l80Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        l80Var4.Z();
                        return z10;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            case 14:
                ms0 ms0Var = ((t) this.b).W;
                if (ms0Var.G.C1 || !(view instanceof t7)) {
                    return false;
                }
                MessageObject messageObject = ((t7) view).getMessageObject();
                if (ms0Var.c(messageObject)) {
                    ms0Var.g(messageObject);
                } else {
                    ms0Var.e(messageObject);
                }
                return true;
            default:
                v3 v3Var = (v3) this.b;
                ArrayList arrayList = v3Var.b0;
                ArrayList arrayList2 = v3Var.h0;
                if (i10 >= 2 && v3Var.W != null && (view instanceof q3)) {
                    int i37 = i10 - 2;
                    if (!v3Var.c0) {
                        if (v3Var.d0) {
                            if (i37 < 0 || i37 >= arrayList.size()) {
                                i37 -= arrayList.size();
                            }
                        }
                        if (i37 >= 0) {
                            photoEntry = (MediaController.PhotoEntry) v3Var.f0.get(i37);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(photoEntry)) {
                                }
                                AndroidUtilities.updateVisibleRows(v3Var.d);
                                v3Var.j();
                                return true;
                            }
                        }
                    } else if (i37 != 0) {
                        i37 = i10 - 3;
                        if (i37 >= 0 && i37 < v3Var.f0.size()) {
                            photoEntry = (MediaController.PhotoEntry) v3Var.f0.get(i37);
                            if (arrayList2.isEmpty() && !v3Var.Q) {
                                if (!arrayList2.contains(photoEntry)) {
                                    arrayList2.remove(photoEntry);
                                } else {
                                    if (arrayList2.size() + 1 > v3Var.R) {
                                        int i38 = -v3Var.N;
                                        v3Var.N = i38;
                                        AndroidUtilities.shakeViewSpring(view, i38);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        return true;
                                    }
                                    arrayList2.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(v3Var.d);
                                v3Var.j();
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }

    @Override // i5.e
    public Object apply(Object obj) {
        ((m) this.b).getClass();
        String b12 = f0.b.b1((e0) obj);
        kotlin.jvm.internal.i.d(b12, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(b12));
        byte[] bytes = b12.getBytes(zd.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // bi.f9
    public void b(boolean z10) {
        v6 v6Var = (v6) this.b;
        if (v6Var != null) {
            v6Var.c();
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public void c() {
        ((o1) this.b).invalidate();
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        long j10;
        int i11;
        int i12;
        int i13;
        h3 h3Var = (h3) this.b;
        o0 o0Var = h3Var.c;
        ArrayList arrayList = h3Var.r;
        f1 f1Var = ((d1) view).f;
        int i14 = h3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= f1Var.f.size()) {
                break;
            }
            e1 e1Var = (e1) f1Var.f.get(i16);
            long j11 = e1Var.g;
            if (j11 > 0 && currentTime - e1Var.d <= z.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(e1Var.a));
            }
            i16++;
        }
        t1 t1Var = h3Var.P;
        long j12 = t1Var != null ? t1Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            e1 e1Var2 = (e1) arrayList.get(i17);
            if (e1Var2.b || !e1Var2.e || e1Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(e1Var2.a))) {
                    j10 = j12;
                    if (h3Var.w != f1Var.b || (i13 = h3Var.x) == 0 || e1Var2.a < i13) {
                        i11 = e1Var2.a;
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
                e1 e1Var3 = (e1) arrayList.get(i15);
                if (e1Var3.b || !e1Var3.e || e1Var3.g >= j10) {
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
        h3Var.w = f1Var.b;
        h3Var.x = i12;
        h3Var.y = true;
        l0 itemAnimator = o0Var.getItemAnimator();
        o0Var.setItemAnimator(null);
        h3Var.d.i1(i18, o0Var.getHeight() / 2, true);
        h3Var.e.m(i18);
        o0Var.setItemAnimator(itemAnimator);
    }

    @Override // qg.s1
    public void e() {
        di.mb mbVar = (di.mb) this.b;
        TextView textView = mbVar.o1;
        boolean a2 = mbVar.D0.a();
        ImageView imageView = mbVar.n1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // bi.mb
    public void f(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 6:
                ((Runnable) this.b).run();
                break;
            case 21:
                kc kcVar = ((ac) ((r) this.b)).S1;
                yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.s(null, null, true);
                }
                di.mb mbVar = kcVar.v1;
                if (mbVar != null) {
                    mbVar.p0();
                }
                ac acVar = kcVar.c1;
                if (acVar != null) {
                    acVar.setHasRoundVideo(false);
                }
                k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    File file = k8Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        kcVar.K1.o0 = null;
                    }
                    if (kcVar.K1.p0 != null) {
                        try {
                            new File(kcVar.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        kcVar.K1.p0 = null;
                        break;
                    }
                }
                break;
            default:
                ((d6) this.b).a.p2.s();
                break;
        }
    }

    @Override // h2.i
    public void h(j jVar) {
        a4.k kVar = (a4.k) this.b;
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        kVar.b.add(jVar2);
    }

    @Override // e9.l1
    public Object k(Object obj, Object obj2) {
        return s.x((List) ((Collection) obj2), new n4.s(14, ((q1) this.b).f, obj));
    }

    @Override // wh.k
    public void o(wh.g gVar, float f7, float f10) {
        fa faVar = (fa) this.b;
        if (faVar.v.x) {
            return;
        }
        gVar.q = new ea(faVar, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = faVar.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 17:
                b0.b((Intent) this.b);
                break;
            case 18:
                ((d0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        fb fbVar = (fb) this.b;
        kc kcVar = fbVar.a;
        i7 i7Var = kcVar.O0;
        int i10 = kcVar.c;
        if (i7Var != null) {
            i7Var.g(true);
        }
        if (kcVar.p0()) {
            kcVar.s.d();
        }
        if (kcVar.G1 == null || kcVar.B0 == null) {
            return;
        }
        kcVar.Q1 = false;
        kcVar.R1 = false;
        e7 e7Var = kcVar.C0;
        if (e7Var != null) {
            e7Var.c(false);
        }
        if (j10 <= 800) {
            kcVar.g(false, true);
            kcVar.c0(false);
            kcVar.J0.b(false, true);
            i7 i7Var2 = kcVar.O0;
            if (i7Var2 != null) {
                i7Var2.g(true);
            }
            try {
                kcVar.G1.delete();
                kcVar.G1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            return;
        }
        kcVar.h0(false, true);
        k8 o10 = k8.o(kcVar.G1, str, j10);
        o10.J0 = kcVar.v0;
        o10.K0 = kcVar.w0;
        o10.B();
        kcVar.g(false, true);
        kcVar.c0(false);
        kcVar.J0.b(false, true);
        i7 i7Var3 = kcVar.O0;
        if (i7Var3 != null) {
            i7Var3.g(true);
        }
        if (!kcVar.A0.j()) {
            kcVar.K1 = o10;
            di.fa.a(i10, o10);
            kcVar.L1 = false;
            int videoWidth = kcVar.B0.getVideoWidth();
            int videoHeight = kcVar.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                k8 k8Var = kcVar.K1;
                k8Var.k0 = videoWidth;
                k8Var.l0 = videoHeight;
                k8Var.A();
            }
            kcVar.K(new db(fbVar, 3), 0L);
            return;
        }
        kcVar.G1 = null;
        o10.P = 1.0f;
        if (kcVar.A0.l(o10)) {
            k8 a2 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
            kcVar.K1 = a2;
            di.fa.a(i10, a2);
            kcVar.L1 = false;
            int videoWidth2 = kcVar.B0.getVideoWidth();
            int videoHeight2 = kcVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                k8 k8Var2 = kcVar.K1;
                k8Var2.k0 = videoWidth2;
                k8Var2.l0 = videoHeight2;
                k8Var2.A();
            }
        }
        kcVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((b) this.b).invoke(obj);
                return;
            case 12:
                ((b1.f) this.b).invoke(obj);
                return;
            case 15:
                y yVar = (y) obj;
                if (!((FirebaseMessaging) this.b).e.q() || yVar.h.a() == null) {
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
            case 20:
                ((b1.f) this.b).invoke(obj);
                return;
            default:
                ((e1.b) this.b).invoke(obj);
                return;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        bb bbVar = (bb) this.b;
        m61 m61Var = (m61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = m61Var.d;
        k8 k8Var = (k8) m61Var.G;
        bbVar.c(false, true);
        kc kcVar = bbVar.O;
        if (k8Var == kcVar.K1 || kcVar.X1) {
            return;
        }
        kcVar.d1.setSelected(i10);
        kcVar.X1 = true;
        ah.g gVar = new ah.g(kcVar, i10, 7);
        di.mb mbVar = kcVar.v1;
        k8 k8Var2 = kcVar.K1;
        if (mbVar == null || k8Var2 == null) {
            gVar.run();
            return;
        }
        if (!mbVar.t0()) {
            gVar.run();
            return;
        }
        k8Var2.f();
        boolean t02 = mbVar.t0();
        boolean z10 = mbVar.O0.getPainting().E;
        Utilities.searchQueue.postRunnable(new ja(kcVar, mbVar, k8Var2.i0, k8Var2.j0, k8Var2, z10, t02, gVar, 0));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((com.google.firebase.messaging.m) this.b).getClass();
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
            case 4:
                return g1.a((g1) this.b, (Long) obj2);
            default:
                ms0 ms0Var = (ms0) this.b;
                if (((Integer) obj).intValue() == -1) {
                    new x(ms0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new bi.o1(ms0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
