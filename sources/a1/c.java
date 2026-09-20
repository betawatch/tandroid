package a1;

import a4.k;
import ai.a0;
import ai.d2;
import ai.dc;
import ai.g0;
import ai.i7;
import ai.jc;
import ai.m1;
import ai.n1;
import ai.n8;
import ai.o1;
import ai.r3;
import ai.t9;
import ai.ua;
import ai.va;
import ai.w0;
import ai.xb;
import ai.y1;
import ai.yb;
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
import ci.cc;
import ci.ec;
import ci.f6;
import ci.fb;
import ci.h7;
import ci.hb;
import ci.ja;
import ci.jb;
import ci.l7;
import ci.na;
import ci.o8;
import ci.oc;
import ci.p1;
import ci.qb;
import ci.r;
import ci.s3;
import ci.x3;
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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.lx;
import org.telegram.ui.uy;
import pg.u1;
import r0.l1;
import r0.n;
import s4.m0;
import vh.h;
import vh.l;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, i, ll0, Utilities.Callback2Return, kl0, a2, t9, dc, l, n, xk0, Utilities.Callback5, u1, CameraController.VideoTakeCallback, Continuation, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public l1 P0(View view, l1 l1Var) {
        jc jcVar = (jc) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jcVar.v.getLayoutParams();
        marginLayoutParams.topMargin = jcVar.c ? 0 : l1Var.d();
        marginLayoutParams.bottomMargin = jcVar.c ? l1Var.a.f(2).d : l1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        xb xbVar = jcVar.s;
        if (xbVar != null) {
            xbVar.requestLayout();
        }
        yb ybVar = jcVar.v;
        if (ybVar != null) {
            ybVar.requestLayout();
        }
        return l1.b;
    }

    @Override // org.telegram.ui.Components.xk0
    public void a() {
        ((p1) this.b).invalidate();
    }

    @Override // ai.t9
    public void b(boolean z10) {
        i7 i7Var = (i7) this.b;
        if (i7Var != null) {
            i7Var.c();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        long j3;
        int i11;
        int i12;
        int i13;
        r3 r3Var = (r3) this.b;
        w0 w0Var = r3Var.c;
        ArrayList arrayList = r3Var.r;
        n1 n1Var = ((ai.l1) view).f;
        int i14 = r3Var.N;
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
        d2 d2Var = r3Var.P;
        long j11 = d2Var != null ? d2Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            m1 m1Var2 = (m1) arrayList.get(i17);
            if (m1Var2.b || !m1Var2.e || m1Var2.g >= j11) {
                if (hashSet.contains(Integer.valueOf(m1Var2.a))) {
                    j3 = j11;
                    if (r3Var.w != n1Var.b || (i13 = r3Var.x) == 0 || m1Var2.a < i13) {
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
        r3Var.w = n1Var.b;
        r3Var.x = i12;
        r3Var.y = true;
        m0 itemAnimator = w0Var.getItemAnimator();
        w0Var.setItemAnimator(null);
        r3Var.d.i1(i18, w0Var.getHeight() / 2, true);
        r3Var.e.m(i18);
        w0Var.setItemAnimator(itemAnimator);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean c1(View view) {
        return false;
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
    @Override // org.telegram.ui.Components.ll0
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
        long j3;
        boolean z10;
        pq pqVar;
        boolean z11;
        boolean z12;
        v70 v70Var;
        int i18;
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 2:
                final lx lxVar = (lx) this.b;
                if (lxVar.N == 0.0f && lxVar.n0 == 0.0f) {
                    final long j10 = ((a0) view).E;
                    uy uyVar = lxVar.O0;
                    i11 = ((n2) uyVar).currentAccount;
                    MediaDataController.getInstance(i11).loadHints(true);
                    v70 H = v70.H(uyVar, view);
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
                                    pqVar = new pq(drawable2, drawable);
                                    pq pqVar2 = pqVar;
                                    if (j10 < j3 && uyVar.X3().j(j10)) {
                                        final int i19 = 4;
                                        uyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), j6.F8, j6.E8, new Runnable() { // from class: org.telegram.ui.hx
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i20;
                                                switch (i19) {
                                                    case 0:
                                                        lxVar.O0.presentFragment(zn.R9(j10));
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
                                                        lxVar.O0.presentFragment(zn.R9(j10));
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
                                            v70 v70Var2 = uyVar.L0;
                                            final int i20 = 5;
                                            v70Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i20) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                                            lxVar.O0.presentFragment(zn.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i21 = 6;
                                            v70Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i21) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                                            lxVar.O0.presentFragment(zn.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i22 = 0;
                                            v70Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i22) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                                            lxVar.O0.presentFragment(zn.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 < j3);
                                            final int i23 = 0;
                                            v70Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ix
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
                                                            org.telegram.ui.Components.xc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
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
                                                            org.telegram.ui.Components.xc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !c02 && j10 > j3);
                                            v70Var2.E();
                                            final int i24 = 1;
                                            v70Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ix
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
                                                            org.telegram.ui.Components.xc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
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
                                                            org.telegram.ui.Components.xc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, c02 && j10 > j3);
                                            v70Var2.E();
                                            final int i25 = 0;
                                            v70Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.jx
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
                                                                    if (view2 instanceof ai.a0) {
                                                                        uyVar2.E0.i((ai.a0) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = lxVar2.getContext();
                                                            f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                                            ai.w7 w7Var = new ai.w7(context, 0.0f, 1, f6Var);
                                                            w7Var.e = new kx(lxVar2, view2, 1);
                                                            uyVar2.showDialog(w7Var);
                                                            break;
                                                        default:
                                                            lx lxVar3 = lxVar;
                                                            Context context2 = lxVar3.getContext();
                                                            uy uyVar3 = lxVar3.O0;
                                                            f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                                            ai.w7 w7Var2 = new ai.w7(context2, 0.0f, 1, f6Var2);
                                                            w7Var2.e = new kx(lxVar3, view, 0);
                                                            uyVar3.showDialog(w7Var2);
                                                            break;
                                                    }
                                                }
                                            }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                                            v70Var2.E();
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
                                                                    if (view2 instanceof ai.a0) {
                                                                        uyVar2.E0.i((ai.a0) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = lxVar2.getContext();
                                                            f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                                            ai.w7 w7Var = new ai.w7(context, 0.0f, 1, f6Var);
                                                            w7Var.e = new kx(lxVar2, view2, 1);
                                                            uyVar2.showDialog(w7Var);
                                                            break;
                                                        default:
                                                            lx lxVar3 = lxVar;
                                                            Context context2 = lxVar3.getContext();
                                                            uy uyVar3 = lxVar3.O0;
                                                            f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                                            ai.w7 w7Var2 = new ai.w7(context2, 0.0f, 1, f6Var2);
                                                            w7Var2.e = new kx(lxVar3, view, 0);
                                                            uyVar3.showDialog(w7Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z12) {
                                                v70Var2.b(i26, pqVar2, string, j6.F8, j6.E8, runnable);
                                                v70Var = v70Var2;
                                            } else {
                                                v70Var = v70Var2;
                                            }
                                            v70Var.E();
                                            final int i28 = 1;
                                            v70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i28) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                                            lxVar.O0.presentFragment(zn.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z11 && !uyVar.e4());
                                            v70Var.E();
                                            final int i29 = 2;
                                            v70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i29) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                                            lxVar.O0.presentFragment(zn.R9(j10));
                                                            break;
                                                        default:
                                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z11 && uyVar.e4());
                                            v70Var.E();
                                            final int i30 = 3;
                                            v70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.hx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i30) {
                                                        case 0:
                                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                    v70 v70Var22 = uyVar.L0;
                                    final int i202 = 5;
                                    v70Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i202) {
                                                case 0:
                                                    lxVar.O0.presentFragment(zn.R9(j10));
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
                                                    lxVar.O0.presentFragment(zn.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i212 = 6;
                                    v70Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i212) {
                                                case 0:
                                                    lxVar.O0.presentFragment(zn.R9(j10));
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
                                                    lxVar.O0.presentFragment(zn.R9(j10));
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
                                    v70Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i222) {
                                                case 0:
                                                    lxVar.O0.presentFragment(zn.R9(j10));
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
                                                    lxVar.O0.presentFragment(zn.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 < j3);
                                    final int i232 = 0;
                                    v70Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ix
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
                                                    org.telegram.ui.Components.xc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
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
                                                    org.telegram.ui.Components.xc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !c02 && j10 > j3);
                                    v70Var22.E();
                                    final int i242 = 1;
                                    v70Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ix
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
                                                    org.telegram.ui.Components.xc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
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
                                                    org.telegram.ui.Components.xc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, c02 && j10 > j3);
                                    v70Var22.E();
                                    final int i252 = 0;
                                    v70Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.jx
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
                                                            if (view2 instanceof ai.a0) {
                                                                uyVar2.E0.i((ai.a0) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = lxVar2.getContext();
                                                    f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                                    ai.w7 w7Var = new ai.w7(context, 0.0f, 1, f6Var);
                                                    w7Var.e = new kx(lxVar2, view2, 1);
                                                    uyVar2.showDialog(w7Var);
                                                    break;
                                                default:
                                                    lx lxVar3 = lxVar;
                                                    Context context2 = lxVar3.getContext();
                                                    uy uyVar3 = lxVar3.O0;
                                                    f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                                    ai.w7 w7Var2 = new ai.w7(context2, 0.0f, 1, f6Var2);
                                                    w7Var2.e = new kx(lxVar3, view, 0);
                                                    uyVar3.showDialog(w7Var2);
                                                    break;
                                            }
                                        }
                                    }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                                    v70Var22.E();
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
                                                            if (view2 instanceof ai.a0) {
                                                                uyVar2.E0.i((ai.a0) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = lxVar2.getContext();
                                                    f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                                    ai.w7 w7Var = new ai.w7(context, 0.0f, 1, f6Var);
                                                    w7Var.e = new kx(lxVar2, view2, 1);
                                                    uyVar2.showDialog(w7Var);
                                                    break;
                                                default:
                                                    lx lxVar3 = lxVar;
                                                    Context context2 = lxVar3.getContext();
                                                    uy uyVar3 = lxVar3.O0;
                                                    f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                                    ai.w7 w7Var2 = new ai.w7(context2, 0.0f, 1, f6Var2);
                                                    w7Var2.e = new kx(lxVar3, view, 0);
                                                    uyVar3.showDialog(w7Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                    }
                                    v70Var.E();
                                    final int i282 = 1;
                                    v70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i282) {
                                                case 0:
                                                    lxVar.O0.presentFragment(zn.R9(j10));
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
                                                    lxVar.O0.presentFragment(zn.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11 && !uyVar.e4());
                                    v70Var.E();
                                    final int i292 = 2;
                                    v70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i292) {
                                                case 0:
                                                    lxVar.O0.presentFragment(zn.R9(j10));
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
                                                    lxVar.O0.presentFragment(zn.R9(j10));
                                                    break;
                                                default:
                                                    lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11 && uyVar.e4());
                                    v70Var.E();
                                    final int i302 = 3;
                                    v70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.hx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i302) {
                                                case 0:
                                                    lxVar.O0.presentFragment(zn.R9(j10));
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
                                                    lxVar.O0.presentFragment(zn.R9(j10));
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
                            pqVar = null;
                            pq pqVar22 = pqVar;
                            if (j10 < j3) {
                                final int i192 = 4;
                                uyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), j6.F8, j6.E8, new Runnable() { // from class: org.telegram.ui.hx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2022;
                                        switch (i192) {
                                            case 0:
                                                lxVar.O0.presentFragment(zn.R9(j10));
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
                                                lxVar.O0.presentFragment(zn.R9(j10));
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
                            v70 v70Var222 = uyVar.L0;
                            final int i2022 = 5;
                            v70Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2022) {
                                        case 0:
                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                            lxVar.O0.presentFragment(zn.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i2122 = 6;
                            v70Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2122) {
                                        case 0:
                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                            v70Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2222) {
                                        case 0:
                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                            lxVar.O0.presentFragment(zn.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 < j3);
                            final int i2322 = 0;
                            v70Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ix
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
                                            org.telegram.ui.Components.xc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
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
                                            org.telegram.ui.Components.xc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c02 && j10 > j3);
                            v70Var222.E();
                            final int i2422 = 1;
                            v70Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ix
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
                                            org.telegram.ui.Components.xc.a0(uyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
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
                                            org.telegram.ui.Components.xc.a0(uyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c02 && j10 > j3);
                            v70Var222.E();
                            final int i2522 = 0;
                            v70Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.jx
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
                                                    if (view2 instanceof ai.a0) {
                                                        uyVar2.E0.i((ai.a0) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = lxVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                            ai.w7 w7Var = new ai.w7(context, 0.0f, 1, f6Var);
                                            w7Var.e = new kx(lxVar2, view2, 1);
                                            uyVar2.showDialog(w7Var);
                                            break;
                                        default:
                                            lx lxVar3 = lxVar;
                                            Context context2 = lxVar3.getContext();
                                            uy uyVar3 = lxVar3.O0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                            ai.w7 w7Var2 = new ai.w7(context2, 0.0f, 1, f6Var2);
                                            w7Var2.e = new kx(lxVar3, view, 0);
                                            uyVar3.showDialog(w7Var2);
                                            break;
                                    }
                                }
                            }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                            v70Var222.E();
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
                                                    if (view2 instanceof ai.a0) {
                                                        uyVar2.E0.i((ai.a0) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = lxVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.n2) uyVar2).resourceProvider;
                                            ai.w7 w7Var = new ai.w7(context, 0.0f, 1, f6Var);
                                            w7Var.e = new kx(lxVar2, view2, 1);
                                            uyVar2.showDialog(w7Var);
                                            break;
                                        default:
                                            lx lxVar3 = lxVar;
                                            Context context2 = lxVar3.getContext();
                                            uy uyVar3 = lxVar3.O0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar3).resourceProvider;
                                            ai.w7 w7Var2 = new ai.w7(context2, 0.0f, 1, f6Var2);
                                            w7Var2.e = new kx(lxVar3, view, 0);
                                            uyVar3.showDialog(w7Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            v70Var.E();
                            final int i2822 = 1;
                            v70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2822) {
                                        case 0:
                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                            lxVar.O0.presentFragment(zn.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11 && !uyVar.e4());
                            v70Var.E();
                            final int i2922 = 2;
                            v70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2922) {
                                        case 0:
                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                            lxVar.O0.presentFragment(zn.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11 && uyVar.e4());
                            v70Var.E();
                            final int i3022 = 3;
                            v70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.hx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i3022) {
                                        case 0:
                                            lxVar.O0.presentFragment(zn.R9(j10));
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
                                            lxVar.O0.presentFragment(zn.R9(j10));
                                            break;
                                        default:
                                            lxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11);
                        } else if (uyVar.N3) {
                            v70 v70Var3 = uyVar.L0;
                            int i31 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i32 = j6.F8;
                            int i33 = j6.E8;
                            final int i34 = 0;
                            v70Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.gx
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
                                            uyVar2.presentFragment(new org.telegram.ui.Components.ja0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            uy uyVar3 = lxVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            uyVar3.presentFragment(new org.telegram.ui.Components.ja0(bundle2, null));
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
                                            uyVar2.presentFragment(new org.telegram.ui.Components.ja0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            uy uyVar3 = lxVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            uyVar3.presentFragment(new org.telegram.ui.Components.ja0(bundle2, null));
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
                                            uyVar2.presentFragment(new org.telegram.ui.Components.ja0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            uy uyVar3 = lxVar.O0;
                                            i362 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            uyVar3.presentFragment(new org.telegram.ui.Components.ja0(bundle2, null));
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
                        v70 v70Var4 = uyVar.L0;
                        v70Var4.i = 3;
                        v70Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        v70Var4.Z();
                        return z10;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            case 12:
                xr0 xr0Var = ((u) this.b).W;
                if (xr0Var.G.C1 || !(view instanceof u7)) {
                    return false;
                }
                MessageObject messageObject = ((u7) view).getMessageObject();
                if (xr0Var.c(messageObject)) {
                    xr0Var.g(messageObject);
                } else {
                    xr0Var.e(messageObject);
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

    @Override // pg.u1
    public void e() {
        qb qbVar = (qb) this.b;
        TextView textView = qbVar.o1;
        boolean a2 = qbVar.D0.a();
        ImageView imageView = qbVar.n1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // ai.dc
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

    @Override // h2.i
    public void g(j jVar) {
        a4.l lVar = (a4.l) this.b;
        k kVar = (k) jVar;
        kVar.clear();
        lVar.b.add(kVar);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(b2 b2Var, int i10) {
        switch (this.a) {
            case 5:
                ((Runnable) this.b).run();
                break;
            case 14:
                oc ocVar = ((ec) ((r) this.b)).S1;
                cc ccVar = ocVar.X0;
                if (ccVar != null) {
                    ccVar.s(null, null, true);
                }
                qb qbVar = ocVar.v1;
                if (qbVar != null) {
                    qbVar.q0();
                }
                ec ecVar = ocVar.c1;
                if (ecVar != null) {
                    ecVar.setHasRoundVideo(false);
                }
                o8 o8Var = ocVar.K1;
                if (o8Var != null) {
                    File file = o8Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        ocVar.K1.o0 = null;
                    }
                    if (ocVar.K1.p0 != null) {
                        try {
                            new File(ocVar.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        ocVar.K1.p0 = null;
                        break;
                    }
                }
                break;
            case 19:
                ((f6) this.b).a.p2.r();
                break;
            case 28:
                ((ei.e) this.b).run();
                break;
            default:
                ei.l lVar = (ei.l) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
                updatestarrefprogram.commission_permille = 0;
                b2 b2Var2 = new b2(lVar.getParentActivity(), 3, null);
                b2Var2.q(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, b2Var2, 0));
                break;
        }
    }

    @Override // vh.l
    public void l(h hVar, float f7, float f10) {
        va vaVar = (va) this.b;
        if (vaVar.v.x) {
            return;
        }
        hVar.q = new ua(vaVar, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = vaVar.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h) obj).j(f7, f10, sqrt, false);
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
        jb jbVar = (jb) this.b;
        oc ocVar = jbVar.a;
        l7 l7Var = ocVar.O0;
        int i10 = ocVar.c;
        if (l7Var != null) {
            l7Var.g(true);
        }
        if (ocVar.q0()) {
            ocVar.s.d();
        }
        if (ocVar.G1 == null || ocVar.B0 == null) {
            return;
        }
        ocVar.Q1 = false;
        ocVar.R1 = false;
        h7 h7Var = ocVar.C0;
        if (h7Var != null) {
            h7Var.c(false);
        }
        if (j3 <= 800) {
            ocVar.h(false, true);
            ocVar.d0(false);
            ocVar.J0.b(false, true);
            l7 l7Var2 = ocVar.O0;
            if (l7Var2 != null) {
                l7Var2.g(true);
            }
            try {
                ocVar.G1.delete();
                ocVar.G1 = null;
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
        ocVar.i0(false, true);
        o8 o9 = o8.o(ocVar.G1, str, j3);
        o9.J0 = ocVar.v0;
        o9.K0 = ocVar.w0;
        o9.B();
        ocVar.h(false, true);
        ocVar.d0(false);
        ocVar.J0.b(false, true);
        l7 l7Var3 = ocVar.O0;
        if (l7Var3 != null) {
            l7Var3.g(true);
        }
        if (!ocVar.A0.j()) {
            ocVar.K1 = o9;
            ja.a(i10, o9);
            ocVar.L1 = false;
            int videoWidth = ocVar.B0.getVideoWidth();
            int videoHeight = ocVar.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                o8 o8Var = ocVar.K1;
                o8Var.k0 = videoWidth;
                o8Var.l0 = videoHeight;
                o8Var.A();
            }
            ocVar.L(new hb(jbVar, 3), 0L);
            return;
        }
        ocVar.G1 = null;
        o9.P = 1.0f;
        if (ocVar.A0.l(o9)) {
            o8 a2 = o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
            ocVar.K1 = a2;
            ja.a(i10, a2);
            ocVar.L1 = false;
            int videoWidth2 = ocVar.B0.getVideoWidth();
            int videoHeight2 = ocVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                o8 o8Var2 = ocVar.K1;
                o8Var2.k0 = videoWidth2;
                o8Var2.l0 = videoHeight2;
                o8Var2.A();
            }
        }
        ocVar.m0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                return;
            case 13:
                ((b1.f) this.b).invoke(obj);
                return;
            case 21:
                z zVar = (z) obj;
                if (!((FirebaseMessaging) this.b).e.n() || zVar.h.a() == null) {
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
        fb fbVar = (fb) this.b;
        w51 w51Var = (w51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = w51Var.d;
        o8 o8Var = (o8) w51Var.G;
        fbVar.c(false, true);
        oc ocVar = fbVar.O;
        if (o8Var == ocVar.K1 || ocVar.X1) {
            return;
        }
        ocVar.d1.setSelected(i10);
        ocVar.X1 = true;
        n8 n8Var = new n8(ocVar, i10, 6);
        qb qbVar = ocVar.v1;
        o8 o8Var2 = ocVar.K1;
        if (qbVar == null || o8Var2 == null) {
            n8Var.run();
            return;
        }
        if (!qbVar.u0()) {
            n8Var.run();
            return;
        }
        o8Var2.f();
        boolean u02 = qbVar.u0();
        boolean z10 = qbVar.O0.getPainting().E;
        Utilities.searchQueue.postRunnable(new na(ocVar, qbVar, o8Var2.i0, o8Var2.j0, o8Var2, z10, u02, n8Var, 0));
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
                return o1.a((o1) this.b, (Long) obj2);
            default:
                xr0 xr0Var = (xr0) this.b;
                if (((Integer) obj).intValue() == -1) {
                    new y(xr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(xr0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
