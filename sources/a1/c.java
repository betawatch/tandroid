package a1;

import ai.a0;
import ai.d2;
import ai.ec;
import ai.g0;
import ai.k7;
import ai.kc;
import ai.l1;
import ai.m1;
import ai.n1;
import ai.p8;
import ai.s3;
import ai.u9;
import ai.va;
import ai.w0;
import ai.wa;
import ai.y1;
import ai.yb;
import ai.zb;
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
import bi.u;
import bi.y;
import ci.bc;
import ci.cb;
import ci.e6;
import ci.eb;
import ci.f7;
import ci.ga;
import ci.gb;
import ci.j7;
import ci.ka;
import ci.l8;
import ci.lc;
import ci.nb;
import ci.o1;
import ci.q3;
import ci.r;
import ci.v3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.z;
import h2.i;
import h2.j;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.kx;
import org.telegram.ui.ty;
import pg.u1;
import r0.k1;
import r0.n;
import s4.n0;
import vh.k;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, i, gm0, Utilities.Callback2Return, fm0, a2, u9, ec, k, n, sl0, Utilities.Callback5, u1, CameraController.VideoTakeCallback, Continuation, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public k1 M0(View view, k1 k1Var) {
        kc kcVar = (kc) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kcVar.v.getLayoutParams();
        marginLayoutParams.topMargin = kcVar.c ? 0 : k1Var.d();
        marginLayoutParams.bottomMargin = kcVar.c ? k1Var.a.f(2).d : k1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        yb ybVar = kcVar.s;
        if (ybVar != null) {
            ybVar.requestLayout();
        }
        zb zbVar = kcVar.v;
        if (zbVar != null) {
            zbVar.requestLayout();
        }
        return k1.b;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.sl0
    public void a() {
        ((o1) this.b).invalidate();
    }

    @Override // ai.u9
    public void b(boolean z10) {
        k7 k7Var = (k7) this.b;
        if (k7Var != null) {
            k7Var.c();
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        long j3;
        int i11;
        int i12;
        int i13;
        s3 s3Var = (s3) this.b;
        w0 w0Var = s3Var.c;
        ArrayList arrayList = s3Var.r;
        n1 n1Var = ((l1) view).f;
        int i14 = s3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= n1Var.f.size()) {
                break;
            }
            m1 m1Var = (m1) n1Var.f.get(i16);
            long j10 = m1Var.g;
            if (j10 > 0 && currentTime - m1Var.d <= g0.b(i14, (int) j10, 0)) {
                hashSet.add(Integer.valueOf(m1Var.a));
            }
            i16++;
        }
        d2 d2Var = s3Var.P;
        long j11 = d2Var != null ? d2Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            m1 m1Var2 = (m1) arrayList.get(i17);
            if (m1Var2.b || !m1Var2.e || m1Var2.g >= j11) {
                if (hashSet.contains(Integer.valueOf(m1Var2.a))) {
                    j3 = j11;
                    if (s3Var.w != n1Var.b || (i13 = s3Var.x) == 0 || m1Var2.a < i13) {
                        i11 = m1Var2.a;
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
                m1 m1Var3 = (m1) arrayList.get(i15);
                if (m1Var3.b || !m1Var3.e || m1Var3.g >= j3) {
                    if (hashSet.contains(Integer.valueOf(m1Var3.a))) {
                        i12 = m1Var3.a;
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
        s3Var.w = n1Var.b;
        s3Var.x = i12;
        s3Var.y = true;
        n0 itemAnimator = w0Var.getItemAnimator();
        w0Var.setItemAnimator(null);
        s3Var.d.i1(i18, w0Var.getHeight() / 2, true);
        s3Var.e.m(i18);
        w0Var.setItemAnimator(itemAnimator);
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
    @Override // org.telegram.ui.Components.gm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i10, final View view) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        long j3;
        fr frVar;
        boolean z11;
        boolean z12;
        p80 p80Var;
        int i18;
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 2:
                final kx kxVar = (kx) this.b;
                if (kxVar.N == 0.0f && kxVar.n0 == 0.0f) {
                    final long j10 = ((a0) view).E;
                    ty tyVar = kxVar.O0;
                    i11 = ((n2) tyVar).currentAccount;
                    MediaDataController.getInstance(i11).loadHints(true);
                    p80 H = p80.H(tyVar, view);
                    H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    H.W(i6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), tyVar.getThemedColor(i6.d6)));
                    H.a0(0.0f, AndroidUtilities.dp(8.0f));
                    tyVar.L0 = H;
                    if (!UserObject.isService(j10)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i12 = ((n2) tyVar).currentAccount;
                        if (j10 != UserConfig.getInstance(i12).getClientUserId()) {
                            final TLRPC.User user = tyVar.getMessagesController().getUser(Long.valueOf(j10));
                            TLRPC.Chat chat = tyVar.getMessagesController().getChat(Long.valueOf(-j10));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, 0L);
                            i13 = ((n2) tyVar).currentAccount;
                            boolean c02 = NotificationsCustomSettingsActivity.c0(i13, j10);
                            i14 = ((n2) tyVar).currentAccount;
                            boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                            i15 = ((n2) tyVar).currentAccount;
                            boolean isPremium = UserConfig.getInstance(i15).isPremium();
                            i16 = ((n2) tyVar).currentAccount;
                            boolean J = MessagesController.getInstance(i16).getStoriesController().J(j10);
                            i17 = ((n2) tyVar).currentAccount;
                            boolean F = MessagesController.getInstance(i17).getStoriesController().F(j10);
                            if (premiumFeaturesBlocked || j10 <= 0 || isPremium) {
                                z10 = false;
                            } else {
                                z10 = false;
                                Drawable drawable = kxVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = kxVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        j3 = 0;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(tyVar.getThemedColor(i6.F8), PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        j3 = 0;
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    frVar = new fr(drawable2, drawable);
                                    fr frVar2 = frVar;
                                    if (j10 < j3 && tyVar.U3().j(j10)) {
                                        final int i19 = 4;
                                        tyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), i6.F8, i6.E8, new Runnable() { // from class: org.telegram.ui.gx
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i20;
                                                switch (i19) {
                                                    case 0:
                                                        kxVar.O0.presentFragment(zn.W9(j10));
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        ty tyVar2 = kxVar.O0;
                                                        i20 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                        MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                        long j11 = j10;
                                                        mediaDataController.removePeer(j11);
                                                        tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                        break;
                                                    case 4:
                                                        kxVar.O0.E0.j(j10);
                                                        break;
                                                    case 5:
                                                        kxVar.O0.presentFragment(zn.W9(j10));
                                                        break;
                                                    default:
                                                        kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (user != null && !user.contact) {
                                        i18 = ((n2) tyVar).currentAccount;
                                        if (MediaDataController.getInstance(i18).containsTopPeer(j10)) {
                                            z11 = true;
                                            p80 p80Var2 = tyVar.L0;
                                            final int i20 = 5;
                                            p80Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.gx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i20) {
                                                        case 0:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ty tyVar2 = kxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            kxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        default:
                                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3 ? true : z10);
                                            final int i21 = 6;
                                            p80Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.gx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i21) {
                                                        case 0:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ty tyVar2 = kxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            kxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        default:
                                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3 ? true : z10);
                                            final int i22 = 0;
                                            p80Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.gx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i22) {
                                                        case 0:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ty tyVar2 = kxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            kxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        default:
                                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 < j3 ? true : z10);
                                            final int i23 = 0;
                                            p80Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i24;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i23;
                                                    TLRPC.User user2 = user;
                                                    long j11 = j10;
                                                    String str = sharedPrefKey;
                                                    kx kxVar2 = kxVar;
                                                    switch (i26) {
                                                        case 0:
                                                            ty tyVar2 = kxVar2.O0;
                                                            i24 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            tyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.ad.a0(tyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            ty tyVar3 = kxVar2.O0;
                                                            i25 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            tyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.ad.a0(tyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, (c02 || j10 <= j3) ? z10 : true);
                                            p80Var2.E();
                                            final int i24 = 1;
                                            p80Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i24;
                                                    TLRPC.User user2 = user;
                                                    long j11 = j10;
                                                    String str = sharedPrefKey;
                                                    kx kxVar2 = kxVar;
                                                    switch (i26) {
                                                        case 0:
                                                            ty tyVar2 = kxVar2.O0;
                                                            i242 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            tyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.ad.a0(tyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            ty tyVar3 = kxVar2.O0;
                                                            i25 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            tyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.ad.a0(tyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, (!c02 || j10 <= j3) ? z10 : true);
                                            p80Var2.E();
                                            final int i25 = 0;
                                            p80Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.ix
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.e6 e6Var;
                                                    int i26;
                                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                                    switch (i25) {
                                                        case 0:
                                                            kx kxVar2 = kxVar;
                                                            ty tyVar2 = kxVar2.O0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i26 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof ai.a0) {
                                                                        tyVar2.E0.i((ai.a0) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = kxVar2.getContext();
                                                            e6Var = ((org.telegram.ui.ActionBar.n2) tyVar2).resourceProvider;
                                                            ai.y7 y7Var = new ai.y7(context, 0.0f, 1, e6Var);
                                                            y7Var.e = new jx(kxVar2, view2, 1);
                                                            tyVar2.showDialog(y7Var);
                                                            break;
                                                        default:
                                                            kx kxVar3 = kxVar;
                                                            Context context2 = kxVar3.getContext();
                                                            ty tyVar3 = kxVar3.O0;
                                                            e6Var2 = ((org.telegram.ui.ActionBar.n2) tyVar3).resourceProvider;
                                                            ai.y7 y7Var2 = new ai.y7(context2, 0.0f, 1, e6Var2);
                                                            y7Var2.e = new jx(kxVar3, view, 0);
                                                            tyVar3.showDialog(y7Var2);
                                                            break;
                                                    }
                                                }
                                            }, (premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F) ? true : z10);
                                            p80Var2.E();
                                            z12 = (!premiumFeaturesBlocked || j10 <= j3 || isPremium || !J || F) ? z10 : true;
                                            int i26 = R.drawable.msg_stories_stealth2;
                                            String string = LocaleController.getString(R.string.ViewAnonymously);
                                            final int i27 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.ix
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.e6 e6Var;
                                                    int i262;
                                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                                    switch (i27) {
                                                        case 0:
                                                            kx kxVar2 = kxVar;
                                                            ty tyVar2 = kxVar2.O0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i262 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof ai.a0) {
                                                                        tyVar2.E0.i((ai.a0) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = kxVar2.getContext();
                                                            e6Var = ((org.telegram.ui.ActionBar.n2) tyVar2).resourceProvider;
                                                            ai.y7 y7Var = new ai.y7(context, 0.0f, 1, e6Var);
                                                            y7Var.e = new jx(kxVar2, view2, 1);
                                                            tyVar2.showDialog(y7Var);
                                                            break;
                                                        default:
                                                            kx kxVar3 = kxVar;
                                                            Context context2 = kxVar3.getContext();
                                                            ty tyVar3 = kxVar3.O0;
                                                            e6Var2 = ((org.telegram.ui.ActionBar.n2) tyVar3).resourceProvider;
                                                            ai.y7 y7Var2 = new ai.y7(context2, 0.0f, 1, e6Var2);
                                                            y7Var2.e = new jx(kxVar3, view, 0);
                                                            tyVar3.showDialog(y7Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z12) {
                                                p80Var2.b(i26, frVar2, string, i6.F8, i6.E8, runnable);
                                                p80Var = p80Var2;
                                            } else {
                                                p80Var = p80Var2;
                                            }
                                            p80Var.E();
                                            final int i28 = 1;
                                            p80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.gx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i28) {
                                                        case 0:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ty tyVar2 = kxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            kxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        default:
                                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, (!z11 || tyVar.b4()) ? z10 : true);
                                            p80Var.E();
                                            final int i29 = 2;
                                            p80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.gx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i29) {
                                                        case 0:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ty tyVar2 = kxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            kxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        default:
                                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, (z11 && tyVar.b4()) ? true : z10);
                                            p80Var.E();
                                            final int i30 = 3;
                                            p80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.gx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i30) {
                                                        case 0:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ty tyVar2 = kxVar.O0;
                                                            i202 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j11 = j10;
                                                            mediaDataController.removePeer(j11);
                                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            kxVar.O0.E0.j(j10);
                                                            break;
                                                        case 5:
                                                            kxVar.O0.presentFragment(zn.W9(j10));
                                                            break;
                                                        default:
                                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z11);
                                        }
                                    }
                                    z11 = z10;
                                    p80 p80Var22 = tyVar.L0;
                                    final int i202 = 5;
                                    p80Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.gx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i202) {
                                                case 0:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ty tyVar2 = kxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    kxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                default:
                                                    kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3 ? true : z10);
                                    final int i212 = 6;
                                    p80Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.gx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i212) {
                                                case 0:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ty tyVar2 = kxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    kxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                default:
                                                    kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3 ? true : z10);
                                    if (j10 < j3) {
                                    }
                                    final int i222 = 0;
                                    p80Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.gx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i222) {
                                                case 0:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ty tyVar2 = kxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    kxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                default:
                                                    kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 < j3 ? true : z10);
                                    final int i232 = 0;
                                    p80Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i252;
                                            int i262 = i232;
                                            TLRPC.User user2 = user;
                                            long j11 = j10;
                                            String str = sharedPrefKey;
                                            kx kxVar2 = kxVar;
                                            switch (i262) {
                                                case 0:
                                                    ty tyVar2 = kxVar2.O0;
                                                    i242 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    tyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.ad.a0(tyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    ty tyVar3 = kxVar2.O0;
                                                    i252 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    tyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.ad.a0(tyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, (c02 || j10 <= j3) ? z10 : true);
                                    p80Var22.E();
                                    final int i242 = 1;
                                    p80Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            String trim;
                                            int i252;
                                            int i262 = i242;
                                            TLRPC.User user2 = user;
                                            long j11 = j10;
                                            String str = sharedPrefKey;
                                            kx kxVar2 = kxVar;
                                            switch (i262) {
                                                case 0:
                                                    ty tyVar2 = kxVar2.O0;
                                                    i2422 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    tyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.ad.a0(tyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    ty tyVar3 = kxVar2.O0;
                                                    i252 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    tyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.ad.a0(tyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, (!c02 || j10 <= j3) ? z10 : true);
                                    p80Var22.E();
                                    final int i252 = 0;
                                    p80Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.ix
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.e6 e6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.e6 e6Var2;
                                            switch (i252) {
                                                case 0:
                                                    kx kxVar2 = kxVar;
                                                    ty tyVar2 = kxVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof ai.a0) {
                                                                tyVar2.E0.i((ai.a0) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = kxVar2.getContext();
                                                    e6Var = ((org.telegram.ui.ActionBar.n2) tyVar2).resourceProvider;
                                                    ai.y7 y7Var = new ai.y7(context, 0.0f, 1, e6Var);
                                                    y7Var.e = new jx(kxVar2, view2, 1);
                                                    tyVar2.showDialog(y7Var);
                                                    break;
                                                default:
                                                    kx kxVar3 = kxVar;
                                                    Context context2 = kxVar3.getContext();
                                                    ty tyVar3 = kxVar3.O0;
                                                    e6Var2 = ((org.telegram.ui.ActionBar.n2) tyVar3).resourceProvider;
                                                    ai.y7 y7Var2 = new ai.y7(context2, 0.0f, 1, e6Var2);
                                                    y7Var2.e = new jx(kxVar3, view, 0);
                                                    tyVar3.showDialog(y7Var2);
                                                    break;
                                            }
                                        }
                                    }, (premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F) ? true : z10);
                                    p80Var22.E();
                                    if (premiumFeaturesBlocked) {
                                    }
                                    int i262 = R.drawable.msg_stories_stealth2;
                                    String string2 = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i272 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.ix
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.e6 e6Var;
                                            int i2622;
                                            org.telegram.ui.ActionBar.e6 e6Var2;
                                            switch (i272) {
                                                case 0:
                                                    kx kxVar2 = kxVar;
                                                    ty tyVar2 = kxVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i2622 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof ai.a0) {
                                                                tyVar2.E0.i((ai.a0) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = kxVar2.getContext();
                                                    e6Var = ((org.telegram.ui.ActionBar.n2) tyVar2).resourceProvider;
                                                    ai.y7 y7Var = new ai.y7(context, 0.0f, 1, e6Var);
                                                    y7Var.e = new jx(kxVar2, view2, 1);
                                                    tyVar2.showDialog(y7Var);
                                                    break;
                                                default:
                                                    kx kxVar3 = kxVar;
                                                    Context context2 = kxVar3.getContext();
                                                    ty tyVar3 = kxVar3.O0;
                                                    e6Var2 = ((org.telegram.ui.ActionBar.n2) tyVar3).resourceProvider;
                                                    ai.y7 y7Var2 = new ai.y7(context2, 0.0f, 1, e6Var2);
                                                    y7Var2.e = new jx(kxVar3, view, 0);
                                                    tyVar3.showDialog(y7Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                    }
                                    p80Var.E();
                                    final int i282 = 1;
                                    p80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.gx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i282) {
                                                case 0:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ty tyVar2 = kxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    kxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                default:
                                                    kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, (!z11 || tyVar.b4()) ? z10 : true);
                                    p80Var.E();
                                    final int i292 = 2;
                                    p80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.gx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i292) {
                                                case 0:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ty tyVar2 = kxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    kxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                default:
                                                    kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, (z11 && tyVar.b4()) ? true : z10);
                                    p80Var.E();
                                    final int i302 = 3;
                                    p80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.gx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i302) {
                                                case 0:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ty tyVar2 = kxVar.O0;
                                                    i2022 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    kxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    kxVar.O0.presentFragment(zn.W9(j10));
                                                    break;
                                                default:
                                                    kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11);
                                }
                            }
                            j3 = 0;
                            frVar = null;
                            fr frVar22 = frVar;
                            if (j10 < j3) {
                                final int i192 = 4;
                                tyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), i6.F8, i6.E8, new Runnable() { // from class: org.telegram.ui.gx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2022;
                                        switch (i192) {
                                            case 0:
                                                kxVar.O0.presentFragment(zn.W9(j10));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                                break;
                                            case 3:
                                                ty tyVar2 = kxVar.O0;
                                                i2022 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                kxVar.O0.E0.j(j10);
                                                break;
                                            case 5:
                                                kxVar.O0.presentFragment(zn.W9(j10));
                                                break;
                                            default:
                                                kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null) {
                                i18 = ((n2) tyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j10)) {
                                }
                            }
                            z11 = z10;
                            p80 p80Var222 = tyVar.L0;
                            final int i2022 = 5;
                            p80Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2022) {
                                        case 0:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 3:
                                            ty tyVar2 = kxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            kxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        default:
                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3 ? true : z10);
                            final int i2122 = 6;
                            p80Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2122) {
                                        case 0:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 3:
                                            ty tyVar2 = kxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            kxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        default:
                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3 ? true : z10);
                            if (j10 < j3) {
                            }
                            final int i2222 = 0;
                            p80Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2222) {
                                        case 0:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 3:
                                            ty tyVar2 = kxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            kxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        default:
                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 < j3 ? true : z10);
                            final int i2322 = 0;
                            p80Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2322;
                                    TLRPC.User user2 = user;
                                    long j11 = j10;
                                    String str = sharedPrefKey;
                                    kx kxVar2 = kxVar;
                                    switch (i2622) {
                                        case 0:
                                            ty tyVar2 = kxVar2.O0;
                                            i2422 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            tyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.ad.a0(tyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            ty tyVar3 = kxVar2.O0;
                                            i2522 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            tyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.ad.a0(tyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, (c02 || j10 <= j3) ? z10 : true);
                            p80Var222.E();
                            final int i2422 = 1;
                            p80Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2422;
                                    TLRPC.User user2 = user;
                                    long j11 = j10;
                                    String str = sharedPrefKey;
                                    kx kxVar2 = kxVar;
                                    switch (i2622) {
                                        case 0:
                                            ty tyVar2 = kxVar2.O0;
                                            i24222 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            tyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.ad.a0(tyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            ty tyVar3 = kxVar2.O0;
                                            i2522 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            tyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.ad.a0(tyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, (!c02 || j10 <= j3) ? z10 : true);
                            p80Var222.E();
                            final int i2522 = 0;
                            p80Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.ix
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.e6 e6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                    switch (i2522) {
                                        case 0:
                                            kx kxVar2 = kxVar;
                                            ty tyVar2 = kxVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof ai.a0) {
                                                        tyVar2.E0.i((ai.a0) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = kxVar2.getContext();
                                            e6Var = ((org.telegram.ui.ActionBar.n2) tyVar2).resourceProvider;
                                            ai.y7 y7Var = new ai.y7(context, 0.0f, 1, e6Var);
                                            y7Var.e = new jx(kxVar2, view2, 1);
                                            tyVar2.showDialog(y7Var);
                                            break;
                                        default:
                                            kx kxVar3 = kxVar;
                                            Context context2 = kxVar3.getContext();
                                            ty tyVar3 = kxVar3.O0;
                                            e6Var2 = ((org.telegram.ui.ActionBar.n2) tyVar3).resourceProvider;
                                            ai.y7 y7Var2 = new ai.y7(context2, 0.0f, 1, e6Var2);
                                            y7Var2.e = new jx(kxVar3, view, 0);
                                            tyVar3.showDialog(y7Var2);
                                            break;
                                    }
                                }
                            }, (premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F) ? true : z10);
                            p80Var222.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i2622 = R.drawable.msg_stories_stealth2;
                            String string22 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i2722 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.ix
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.e6 e6Var;
                                    int i26222;
                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                    switch (i2722) {
                                        case 0:
                                            kx kxVar2 = kxVar;
                                            ty tyVar2 = kxVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i26222 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof ai.a0) {
                                                        tyVar2.E0.i((ai.a0) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = kxVar2.getContext();
                                            e6Var = ((org.telegram.ui.ActionBar.n2) tyVar2).resourceProvider;
                                            ai.y7 y7Var = new ai.y7(context, 0.0f, 1, e6Var);
                                            y7Var.e = new jx(kxVar2, view2, 1);
                                            tyVar2.showDialog(y7Var);
                                            break;
                                        default:
                                            kx kxVar3 = kxVar;
                                            Context context2 = kxVar3.getContext();
                                            ty tyVar3 = kxVar3.O0;
                                            e6Var2 = ((org.telegram.ui.ActionBar.n2) tyVar3).resourceProvider;
                                            ai.y7 y7Var2 = new ai.y7(context2, 0.0f, 1, e6Var2);
                                            y7Var2.e = new jx(kxVar3, view, 0);
                                            tyVar3.showDialog(y7Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            p80Var.E();
                            final int i2822 = 1;
                            p80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2822) {
                                        case 0:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 3:
                                            ty tyVar2 = kxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            kxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        default:
                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, (!z11 || tyVar.b4()) ? z10 : true);
                            p80Var.E();
                            final int i2922 = 2;
                            p80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2922) {
                                        case 0:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 3:
                                            ty tyVar2 = kxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            kxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        default:
                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, (z11 && tyVar.b4()) ? true : z10);
                            p80Var.E();
                            final int i3022 = 3;
                            p80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i3022) {
                                        case 0:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new gw(kxVar.O0, j10, !r2.b4(), 0), 200L);
                                            break;
                                        case 3:
                                            ty tyVar2 = kxVar.O0;
                                            i20222 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            tyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            kxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            kxVar.O0.presentFragment(zn.W9(j10));
                                            break;
                                        default:
                                            kxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11);
                        } else if (tyVar.N3) {
                            p80 p80Var3 = tyVar.L0;
                            int i31 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i32 = i6.F8;
                            int i33 = i6.E8;
                            final int i34 = 0;
                            p80Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.fx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i34) {
                                        case 0:
                                            kxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            ty tyVar2 = kxVar.O0;
                                            i35 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            tyVar2.presentFragment(new org.telegram.ui.Components.db0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            ty tyVar3 = kxVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            tyVar3.presentFragment(new org.telegram.ui.Components.db0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 1;
                            tyVar.L0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.fx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i36;
                                    switch (i35) {
                                        case 0:
                                            kxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            ty tyVar2 = kxVar.O0;
                                            i352 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            tyVar2.presentFragment(new org.telegram.ui.Components.db0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            ty tyVar3 = kxVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            tyVar3.presentFragment(new org.telegram.ui.Components.db0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i36 = 2;
                            tyVar.L0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.fx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i362;
                                    switch (i36) {
                                        case 0:
                                            kxVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            ty tyVar2 = kxVar.O0;
                                            i352 = ((org.telegram.ui.ActionBar.n2) tyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            tyVar2.presentFragment(new org.telegram.ui.Components.db0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            ty tyVar3 = kxVar.O0;
                                            i362 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            tyVar3.presentFragment(new org.telegram.ui.Components.db0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z10 = false;
                        } else {
                            kx kxVar2 = tyVar.E0;
                            if (kxVar2 != null) {
                                kxVar2.o();
                            }
                        }
                        p80 p80Var4 = tyVar.L0;
                        p80Var4.i = 3;
                        p80Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        p80Var4.Z();
                        return z10;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            case 12:
                qs0 qs0Var = ((u) this.b).W;
                if (qs0Var.G.C1 || !(view instanceof t7)) {
                    return false;
                }
                MessageObject messageObject = ((t7) view).getMessageObject();
                if (qs0Var.c(messageObject)) {
                    qs0Var.g(messageObject);
                } else {
                    qs0Var.e(messageObject);
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

    @Override // pg.u1
    public void e() {
        nb nbVar = (nb) this.b;
        TextView textView = nbVar.o1;
        boolean a2 = nbVar.D0.a();
        ImageView imageView = nbVar.n1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 5:
                ((Runnable) this.b).run();
                break;
            case 14:
                lc lcVar = ((bc) ((r) this.b)).S1;
                ci.zb zbVar = lcVar.X0;
                if (zbVar != null) {
                    zbVar.s(null, null, true);
                }
                nb nbVar = lcVar.v1;
                if (nbVar != null) {
                    nbVar.p0();
                }
                bc bcVar = lcVar.c1;
                if (bcVar != null) {
                    bcVar.setHasRoundVideo(false);
                }
                l8 l8Var = lcVar.K1;
                if (l8Var != null) {
                    File file = l8Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        lcVar.K1.o0 = null;
                    }
                    if (lcVar.K1.p0 != null) {
                        try {
                            new File(lcVar.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        lcVar.K1.p0 = null;
                        break;
                    }
                }
                break;
            case 19:
                ((e6) this.b).a.p2.s();
                break;
            default:
                ((ei.e) this.b).run();
                break;
        }
    }

    @Override // ai.ec
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // h2.i
    public void h(j jVar) {
        a4.k kVar = (a4.k) this.b;
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        kVar.b.add(jVar2);
    }

    @Override // vh.k
    public void l(vh.g gVar, float f7, float f10) {
        wa waVar = (wa) this.b;
        if (waVar.v.x) {
            return;
        }
        gVar.q = new va(waVar, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = waVar.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vh.g) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 23:
                c0.b((Intent) this.b);
                break;
            case 24:
                ((e0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        gb gbVar = (gb) this.b;
        lc lcVar = gbVar.a;
        j7 j7Var = lcVar.O0;
        int i10 = lcVar.c;
        if (j7Var != null) {
            j7Var.g(true);
        }
        if (lcVar.p0()) {
            lcVar.s.d();
        }
        if (lcVar.G1 == null || lcVar.B0 == null) {
            return;
        }
        lcVar.Q1 = false;
        lcVar.R1 = false;
        f7 f7Var = lcVar.C0;
        if (f7Var != null) {
            f7Var.c(false);
        }
        if (j3 <= 800) {
            lcVar.g(false, true);
            lcVar.c0(false);
            lcVar.J0.b(false, true);
            j7 j7Var2 = lcVar.O0;
            if (j7Var2 != null) {
                j7Var2.g(true);
            }
            try {
                lcVar.G1.delete();
                lcVar.G1 = null;
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
        lcVar.h0(false, true);
        l8 o9 = l8.o(lcVar.G1, str, j3);
        o9.J0 = lcVar.v0;
        o9.K0 = lcVar.w0;
        o9.B();
        lcVar.g(false, true);
        lcVar.c0(false);
        lcVar.J0.b(false, true);
        j7 j7Var3 = lcVar.O0;
        if (j7Var3 != null) {
            j7Var3.g(true);
        }
        if (!lcVar.A0.j()) {
            lcVar.K1 = o9;
            ga.a(i10, o9);
            lcVar.L1 = false;
            int videoWidth = lcVar.B0.getVideoWidth();
            int videoHeight = lcVar.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                l8 l8Var = lcVar.K1;
                l8Var.k0 = videoWidth;
                l8Var.l0 = videoHeight;
                l8Var.A();
            }
            lcVar.K(new eb(gbVar, 3), 0L);
            return;
        }
        lcVar.G1 = null;
        o9.P = 1.0f;
        if (lcVar.A0.l(o9)) {
            l8 a2 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
            lcVar.K1 = a2;
            ga.a(i10, a2);
            lcVar.L1 = false;
            int videoWidth2 = lcVar.B0.getVideoWidth();
            int videoHeight2 = lcVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                l8 l8Var2 = lcVar.K1;
                l8Var2.k0 = videoWidth2;
                l8Var2.l0 = videoHeight2;
                l8Var2.A();
            }
        }
        lcVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((b) this.b).invoke(obj);
                return;
            case 13:
                ((b1.f) this.b).invoke(obj);
                return;
            case 21:
                z zVar = (z) obj;
                if (!((FirebaseMessaging) this.b).e.q() || zVar.h.a() == null) {
                    return;
                }
                synchronized (zVar) {
                    z10 = zVar.g;
                }
                if (z10) {
                    return;
                }
                zVar.h(0L);
                return;
            case 26:
                ((b1.f) this.b).invoke(obj);
                return;
            default:
                ((e1.b) this.b).invoke(obj);
                return;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cb cbVar = (cb) this.b;
        p61 p61Var = (p61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = p61Var.d;
        l8 l8Var = (l8) p61Var.G;
        cbVar.c(false, true);
        lc lcVar = cbVar.O;
        if (l8Var == lcVar.K1 || lcVar.X1) {
            return;
        }
        lcVar.d1.setSelected(i10);
        lcVar.X1 = true;
        p8 p8Var = new p8(lcVar, i10, 6);
        nb nbVar = lcVar.v1;
        l8 l8Var2 = lcVar.K1;
        if (nbVar == null || l8Var2 == null) {
            p8Var.run();
            return;
        }
        if (!nbVar.t0()) {
            p8Var.run();
            return;
        }
        l8Var2.f();
        boolean t02 = nbVar.t0();
        boolean z10 = nbVar.O0.getPainting().E;
        Utilities.searchQueue.postRunnable(new ka(lcVar, nbVar, l8Var2.i0, l8Var2.j0, l8Var2, z10, t02, p8Var, 0));
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
                return ai.o1.a((ai.o1) this.b, (Long) obj2);
            default:
                qs0 qs0Var = (qs0) this.b;
                if (((Integer) obj).intValue() == -1) {
                    new y(qs0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(qs0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }
}
