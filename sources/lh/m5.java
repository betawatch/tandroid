package lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ix;
import org.telegram.ui.ko0;
import org.telegram.ui.qy;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements Utilities.Callback5, ko0, jl0, Utilities.Callback2Return, il0, org.telegram.ui.ActionBar.c2, nh.b7, nh.c9, ih.o, r0.o, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.j1, n2.a, xk0, cg.h2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        nh.i9 i9Var = (nh.i9) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        marginLayoutParams.topMargin = i9Var.c ? 0 : m1Var.d();
        marginLayoutParams.bottomMargin = i9Var.c ? m1Var.a.f(2).d : m1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        nh.w8 w8Var = i9Var.s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        nh.x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ko0
    public void a(int i10) {
        switch (this.a) {
            case 1:
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
            case 2:
                dh.v vVar = (dh.v) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        vVar.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    vVar.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                kh.h5 h5Var = (kh.h5) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        h5Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    h5Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // nh.b7
    public void b(boolean z4) {
        nh.c5 c5Var = (nh.c5) this.b;
        if (c5Var != null) {
            c5Var.c();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        long j10;
        int i11;
        int i12;
        int i13;
        nh.g2 g2Var = (nh.g2) this.b;
        e1 e1Var = g2Var.c;
        ArrayList arrayList = g2Var.r;
        nh.u0 u0Var = ((nh.s0) view).f;
        int i14 = g2Var.K;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= u0Var.f.size()) {
                break;
            }
            nh.t0 t0Var = (nh.t0) u0Var.f.get(i16);
            long j11 = t0Var.g;
            if (j11 > 0 && currentTime - t0Var.d <= nh.t.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(t0Var.a));
            }
            i16++;
        }
        nh.e1 e1Var2 = g2Var.M;
        long j12 = e1Var2 != null ? e1Var2.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            nh.t0 t0Var2 = (nh.t0) arrayList.get(i17);
            if (t0Var2.b || !t0Var2.e || t0Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(t0Var2.a))) {
                    j10 = j12;
                    if (g2Var.w != u0Var.b || (i13 = g2Var.x) == 0 || t0Var2.a < i13) {
                        i11 = t0Var2.a;
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
                nh.t0 t0Var3 = (nh.t0) arrayList.get(i15);
                if (t0Var3.b || !t0Var3.e || t0Var3.g >= j10) {
                    if (hashSet.contains(Integer.valueOf(t0Var3.a))) {
                        i12 = t0Var3.a;
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
        g2Var.w = u0Var.b;
        g2Var.x = i12;
        g2Var.y = true;
        f2.t0 itemAnimator = e1Var.getItemAnimator();
        e1Var.setItemAnimator(null);
        g2Var.d.i1(i18, e1Var.getHeight() / 2, true);
        g2Var.e.m(i18);
        e1Var.setItemAnimator(itemAnimator);
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
    @Override // org.telegram.ui.Components.jl0
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
        long j10;
        boolean z4;
        mq mqVar;
        boolean z10;
        boolean z11;
        p70 p70Var;
        int i18;
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 5:
                final ix ixVar = (ix) this.b;
                if (ixVar.K == 0.0f && ixVar.k0 == 0.0f) {
                    final long j11 = ((nh.p) view).B;
                    qy qyVar = ixVar.L0;
                    i11 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                    MediaDataController.getInstance(i11).loadHints(true);
                    p70 H = p70.H(qyVar, view);
                    H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    H.W(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
                    H.a0(0.0f, AndroidUtilities.dp(8.0f));
                    qyVar.I0 = H;
                    if (!UserObject.isService(j11)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i12 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                        if (j11 != UserConfig.getInstance(i12).getClientUserId()) {
                            final TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(j11));
                            TLRPC.Chat chat = qyVar.getMessagesController().getChat(Long.valueOf(-j11));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, 0L);
                            i13 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                            boolean c02 = NotificationsCustomSettingsActivity.c0(i13, j11);
                            i14 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                            boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                            i15 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                            boolean isPremium = UserConfig.getInstance(i15).isPremium();
                            i16 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                            boolean J = MessagesController.getInstance(i16).getStoriesController().J(j11);
                            i17 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                            boolean F = MessagesController.getInstance(i17).getStoriesController().F(j11);
                            if (premiumFeaturesBlocked || j11 <= 0 || isPremium) {
                                j10 = 0;
                                z4 = false;
                            } else {
                                z4 = false;
                                Drawable drawable = ixVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = ixVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        j10 = 0;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8), PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        j10 = 0;
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    mqVar = new mq(drawable2, drawable);
                                    mq mqVar2 = mqVar;
                                    if (j11 < j10 && qyVar.X3().j(j11)) {
                                        final int i19 = 4;
                                        qyVar.I0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new Runnable() { // from class: org.telegram.ui.ex
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i20;
                                                switch (i19) {
                                                    case 0:
                                                        ixVar.L0.presentFragment(zn.R9(j11));
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        qy qyVar2 = ixVar.L0;
                                                        i20 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                        MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                        long j12 = j11;
                                                        mediaDataController.removePeer(j12);
                                                        qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                        break;
                                                    case 4:
                                                        ixVar.L0.B0.j(j11);
                                                        break;
                                                    case 5:
                                                        ixVar.L0.presentFragment(zn.R9(j11));
                                                        break;
                                                    default:
                                                        ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (user != null && !user.contact) {
                                        i18 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                        if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                            z10 = true;
                                            p70 p70Var2 = qyVar.I0;
                                            final int i20 = 5;
                                            p70Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.ex
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i20) {
                                                        case 0:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            qy qyVar2 = ixVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ixVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        default:
                                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i21 = 6;
                                            p70Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.ex
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i21) {
                                                        case 0:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            qy qyVar2 = ixVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ixVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        default:
                                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i22 = 0;
                                            p70Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.ex
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i22) {
                                                        case 0:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            qy qyVar2 = ixVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ixVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        default:
                                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 < j10);
                                            final int i23 = 0;
                                            p70Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.fx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i24;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i23;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    ix ixVar2 = ixVar;
                                                    switch (i26) {
                                                        case 0:
                                                            qy qyVar2 = ixVar2.L0;
                                                            i24 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            qyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.qc.a0(qyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            qy qyVar3 = ixVar2.L0;
                                                            i25 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            qyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.qc.a0(qyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !c02 && j11 > j10);
                                            p70Var2.E();
                                            final int i24 = 1;
                                            p70Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.fx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i24;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    ix ixVar2 = ixVar;
                                                    switch (i26) {
                                                        case 0:
                                                            qy qyVar2 = ixVar2.L0;
                                                            i242 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            qyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.qc.a0(qyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            qy qyVar3 = ixVar2.L0;
                                                            i25 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            qyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.qc.a0(qyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, c02 && j11 > j10);
                                            p70Var2.E();
                                            final int i25 = 0;
                                            p70Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.gx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.f6 f6Var;
                                                    int i26;
                                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                                    switch (i25) {
                                                        case 0:
                                                            ix ixVar2 = ixVar;
                                                            qy qyVar2 = ixVar2.L0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i26 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof nh.p) {
                                                                        qyVar2.B0.i((nh.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = ixVar2.getContext();
                                                            f6Var = ((org.telegram.ui.ActionBar.p2) qyVar2).resourceProvider;
                                                            nh.r5 r5Var = new nh.r5(context, 0.0f, 1, f6Var);
                                                            r5Var.e = new hx(ixVar2, view2, 1);
                                                            qyVar2.showDialog(r5Var);
                                                            break;
                                                        default:
                                                            ix ixVar3 = ixVar;
                                                            Context context2 = ixVar3.getContext();
                                                            qy qyVar3 = ixVar3.L0;
                                                            f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar3).resourceProvider;
                                                            nh.r5 r5Var2 = new nh.r5(context2, 0.0f, 1, f6Var2);
                                                            r5Var2.e = new hx(ixVar3, view, 0);
                                                            qyVar3.showDialog(r5Var2);
                                                            break;
                                                    }
                                                }
                                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                            p70Var2.E();
                                            z11 = premiumFeaturesBlocked && j11 > j10 && !isPremium && J && !F;
                                            int i26 = R.drawable.msg_stories_stealth2;
                                            String string = LocaleController.getString(R.string.ViewAnonymously);
                                            final int i27 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.gx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.f6 f6Var;
                                                    int i262;
                                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                                    switch (i27) {
                                                        case 0:
                                                            ix ixVar2 = ixVar;
                                                            qy qyVar2 = ixVar2.L0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i262 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof nh.p) {
                                                                        qyVar2.B0.i((nh.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = ixVar2.getContext();
                                                            f6Var = ((org.telegram.ui.ActionBar.p2) qyVar2).resourceProvider;
                                                            nh.r5 r5Var = new nh.r5(context, 0.0f, 1, f6Var);
                                                            r5Var.e = new hx(ixVar2, view2, 1);
                                                            qyVar2.showDialog(r5Var);
                                                            break;
                                                        default:
                                                            ix ixVar3 = ixVar;
                                                            Context context2 = ixVar3.getContext();
                                                            qy qyVar3 = ixVar3.L0;
                                                            f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar3).resourceProvider;
                                                            nh.r5 r5Var2 = new nh.r5(context2, 0.0f, 1, f6Var2);
                                                            r5Var2.e = new hx(ixVar3, view, 0);
                                                            qyVar3.showDialog(r5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z11) {
                                                p70Var2.b(i26, mqVar2, string, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, runnable);
                                                p70Var = p70Var2;
                                            } else {
                                                p70Var = p70Var2;
                                            }
                                            p70Var.E();
                                            final int i28 = 1;
                                            p70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.ex
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i28) {
                                                        case 0:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            qy qyVar2 = ixVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ixVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        default:
                                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10 && !qyVar.e4());
                                            p70Var.E();
                                            final int i29 = 2;
                                            p70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.ex
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i29) {
                                                        case 0:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            qy qyVar2 = ixVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ixVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        default:
                                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10 && qyVar.e4());
                                            p70Var.E();
                                            final int i30 = 3;
                                            p70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.ex
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i30) {
                                                        case 0:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            qy qyVar2 = ixVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            ixVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            ixVar.L0.presentFragment(zn.R9(j11));
                                                            break;
                                                        default:
                                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10);
                                        }
                                    }
                                    z10 = false;
                                    p70 p70Var22 = qyVar.I0;
                                    final int i202 = 5;
                                    p70Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.ex
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i202) {
                                                case 0:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    qy qyVar2 = ixVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ixVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                default:
                                                    ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    final int i212 = 6;
                                    p70Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.ex
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i212) {
                                                case 0:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    qy qyVar2 = ixVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ixVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                default:
                                                    ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    if (j11 < j10) {
                                    }
                                    final int i222 = 0;
                                    p70Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.ex
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i222) {
                                                case 0:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    qy qyVar2 = ixVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ixVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                default:
                                                    ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 < j10);
                                    final int i232 = 0;
                                    p70Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.fx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i252;
                                            int i262 = i232;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            ix ixVar2 = ixVar;
                                            switch (i262) {
                                                case 0:
                                                    qy qyVar2 = ixVar2.L0;
                                                    i242 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    qyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.qc.a0(qyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    qy qyVar3 = ixVar2.L0;
                                                    i252 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    qyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.qc.a0(qyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !c02 && j11 > j10);
                                    p70Var22.E();
                                    final int i242 = 1;
                                    p70Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.fx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            String trim;
                                            int i252;
                                            int i262 = i242;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            ix ixVar2 = ixVar;
                                            switch (i262) {
                                                case 0:
                                                    qy qyVar2 = ixVar2.L0;
                                                    i2422 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    qyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.qc.a0(qyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    qy qyVar3 = ixVar2.L0;
                                                    i252 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    qyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.qc.a0(qyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, c02 && j11 > j10);
                                    p70Var22.E();
                                    final int i252 = 0;
                                    p70Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.gx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.f6 f6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.f6 f6Var2;
                                            switch (i252) {
                                                case 0:
                                                    ix ixVar2 = ixVar;
                                                    qy qyVar2 = ixVar2.L0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof nh.p) {
                                                                qyVar2.B0.i((nh.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = ixVar2.getContext();
                                                    f6Var = ((org.telegram.ui.ActionBar.p2) qyVar2).resourceProvider;
                                                    nh.r5 r5Var = new nh.r5(context, 0.0f, 1, f6Var);
                                                    r5Var.e = new hx(ixVar2, view2, 1);
                                                    qyVar2.showDialog(r5Var);
                                                    break;
                                                default:
                                                    ix ixVar3 = ixVar;
                                                    Context context2 = ixVar3.getContext();
                                                    qy qyVar3 = ixVar3.L0;
                                                    f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar3).resourceProvider;
                                                    nh.r5 r5Var2 = new nh.r5(context2, 0.0f, 1, f6Var2);
                                                    r5Var2.e = new hx(ixVar3, view, 0);
                                                    qyVar3.showDialog(r5Var2);
                                                    break;
                                            }
                                        }
                                    }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                    p70Var22.E();
                                    if (premiumFeaturesBlocked) {
                                    }
                                    int i262 = R.drawable.msg_stories_stealth2;
                                    String string2 = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i272 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.gx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.f6 f6Var;
                                            int i2622;
                                            org.telegram.ui.ActionBar.f6 f6Var2;
                                            switch (i272) {
                                                case 0:
                                                    ix ixVar2 = ixVar;
                                                    qy qyVar2 = ixVar2.L0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i2622 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof nh.p) {
                                                                qyVar2.B0.i((nh.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = ixVar2.getContext();
                                                    f6Var = ((org.telegram.ui.ActionBar.p2) qyVar2).resourceProvider;
                                                    nh.r5 r5Var = new nh.r5(context, 0.0f, 1, f6Var);
                                                    r5Var.e = new hx(ixVar2, view2, 1);
                                                    qyVar2.showDialog(r5Var);
                                                    break;
                                                default:
                                                    ix ixVar3 = ixVar;
                                                    Context context2 = ixVar3.getContext();
                                                    qy qyVar3 = ixVar3.L0;
                                                    f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar3).resourceProvider;
                                                    nh.r5 r5Var2 = new nh.r5(context2, 0.0f, 1, f6Var2);
                                                    r5Var2.e = new hx(ixVar3, view, 0);
                                                    qyVar3.showDialog(r5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z11) {
                                    }
                                    p70Var.E();
                                    final int i282 = 1;
                                    p70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.ex
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i282) {
                                                case 0:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    qy qyVar2 = ixVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ixVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                default:
                                                    ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10 && !qyVar.e4());
                                    p70Var.E();
                                    final int i292 = 2;
                                    p70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.ex
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i292) {
                                                case 0:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    qy qyVar2 = ixVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ixVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                default:
                                                    ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10 && qyVar.e4());
                                    p70Var.E();
                                    final int i302 = 3;
                                    p70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.ex
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i302) {
                                                case 0:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    qy qyVar2 = ixVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    ixVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    ixVar.L0.presentFragment(zn.R9(j11));
                                                    break;
                                                default:
                                                    ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10);
                                } else {
                                    j10 = 0;
                                }
                            }
                            mqVar = null;
                            mq mqVar22 = mqVar;
                            if (j11 < j10) {
                                final int i192 = 4;
                                qyVar.I0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new Runnable() { // from class: org.telegram.ui.ex
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2022;
                                        switch (i192) {
                                            case 0:
                                                ixVar.L0.presentFragment(zn.R9(j11));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                qy qyVar2 = ixVar.L0;
                                                i2022 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                long j12 = j11;
                                                mediaDataController.removePeer(j12);
                                                qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                break;
                                            case 4:
                                                ixVar.L0.B0.j(j11);
                                                break;
                                            case 5:
                                                ixVar.L0.presentFragment(zn.R9(j11));
                                                break;
                                            default:
                                                ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null) {
                                i18 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                }
                            }
                            z10 = false;
                            p70 p70Var222 = qyVar.I0;
                            final int i2022 = 5;
                            p70Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.ex
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2022) {
                                        case 0:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            qy qyVar2 = ixVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ixVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        default:
                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            final int i2122 = 6;
                            p70Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.ex
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2122) {
                                        case 0:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            qy qyVar2 = ixVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ixVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        default:
                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            if (j11 < j10) {
                            }
                            final int i2222 = 0;
                            p70Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.ex
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2222) {
                                        case 0:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            qy qyVar2 = ixVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ixVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        default:
                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 < j10);
                            final int i2322 = 0;
                            p70Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.fx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2322;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    ix ixVar2 = ixVar;
                                    switch (i2622) {
                                        case 0:
                                            qy qyVar2 = ixVar2.L0;
                                            i2422 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            qyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.qc.a0(qyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            qy qyVar3 = ixVar2.L0;
                                            i2522 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            qyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.qc.a0(qyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c02 && j11 > j10);
                            p70Var222.E();
                            final int i2422 = 1;
                            p70Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.fx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2422;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    ix ixVar2 = ixVar;
                                    switch (i2622) {
                                        case 0:
                                            qy qyVar2 = ixVar2.L0;
                                            i24222 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            qyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.qc.a0(qyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            qy qyVar3 = ixVar2.L0;
                                            i2522 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            qyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.qc.a0(qyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c02 && j11 > j10);
                            p70Var222.E();
                            final int i2522 = 0;
                            p70Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    switch (i2522) {
                                        case 0:
                                            ix ixVar2 = ixVar;
                                            qy qyVar2 = ixVar2.L0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof nh.p) {
                                                        qyVar2.B0.i((nh.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = ixVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.p2) qyVar2).resourceProvider;
                                            nh.r5 r5Var = new nh.r5(context, 0.0f, 1, f6Var);
                                            r5Var.e = new hx(ixVar2, view2, 1);
                                            qyVar2.showDialog(r5Var);
                                            break;
                                        default:
                                            ix ixVar3 = ixVar;
                                            Context context2 = ixVar3.getContext();
                                            qy qyVar3 = ixVar3.L0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar3).resourceProvider;
                                            nh.r5 r5Var2 = new nh.r5(context2, 0.0f, 1, f6Var2);
                                            r5Var2.e = new hx(ixVar3, view, 0);
                                            qyVar3.showDialog(r5Var2);
                                            break;
                                    }
                                }
                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                            p70Var222.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i2622 = R.drawable.msg_stories_stealth2;
                            String string22 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i2722 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.gx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    int i26222;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    switch (i2722) {
                                        case 0:
                                            ix ixVar2 = ixVar;
                                            qy qyVar2 = ixVar2.L0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i26222 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof nh.p) {
                                                        qyVar2.B0.i((nh.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = ixVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.p2) qyVar2).resourceProvider;
                                            nh.r5 r5Var = new nh.r5(context, 0.0f, 1, f6Var);
                                            r5Var.e = new hx(ixVar2, view2, 1);
                                            qyVar2.showDialog(r5Var);
                                            break;
                                        default:
                                            ix ixVar3 = ixVar;
                                            Context context2 = ixVar3.getContext();
                                            qy qyVar3 = ixVar3.L0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar3).resourceProvider;
                                            nh.r5 r5Var2 = new nh.r5(context2, 0.0f, 1, f6Var2);
                                            r5Var2.e = new hx(ixVar3, view, 0);
                                            qyVar3.showDialog(r5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z11) {
                            }
                            p70Var.E();
                            final int i2822 = 1;
                            p70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.ex
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2822) {
                                        case 0:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            qy qyVar2 = ixVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ixVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        default:
                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z10 && !qyVar.e4());
                            p70Var.E();
                            final int i2922 = 2;
                            p70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.ex
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2922) {
                                        case 0:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            qy qyVar2 = ixVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ixVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        default:
                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z10 && qyVar.e4());
                            p70Var.E();
                            final int i3022 = 3;
                            p70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.ex
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i3022) {
                                        case 0:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new ew(ixVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            qy qyVar2 = ixVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            qyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            ixVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            ixVar.L0.presentFragment(zn.R9(j11));
                                            break;
                                        default:
                                            ixVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z10);
                        } else if (qyVar.L3) {
                            p70 p70Var3 = qyVar.I0;
                            int i31 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i32 = org.telegram.ui.ActionBar.j6.F8;
                            int i33 = org.telegram.ui.ActionBar.j6.E8;
                            final int i34 = 0;
                            p70Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i34) {
                                        case 0:
                                            ixVar.L0.B0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            qy qyVar2 = ixVar.L0;
                                            i35 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            qyVar2.presentFragment(new org.telegram.ui.Components.ea0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            qy qyVar3 = ixVar.L0;
                                            i36 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            qyVar3.presentFragment(new org.telegram.ui.Components.ea0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 1;
                            qyVar.I0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i36;
                                    switch (i35) {
                                        case 0:
                                            ixVar.L0.B0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            qy qyVar2 = ixVar.L0;
                                            i352 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            qyVar2.presentFragment(new org.telegram.ui.Components.ea0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            qy qyVar3 = ixVar.L0;
                                            i36 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            qyVar3.presentFragment(new org.telegram.ui.Components.ea0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i36 = 2;
                            qyVar.I0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i362;
                                    switch (i36) {
                                        case 0:
                                            ixVar.L0.B0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            qy qyVar2 = ixVar.L0;
                                            i352 = ((org.telegram.ui.ActionBar.p2) qyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            qyVar2.presentFragment(new org.telegram.ui.Components.ea0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            qy qyVar3 = ixVar.L0;
                                            i362 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            qyVar3.presentFragment(new org.telegram.ui.Components.ea0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z4 = false;
                        } else {
                            ix ixVar2 = qyVar.B0;
                            if (ixVar2 != null) {
                                ixVar2.n();
                            }
                        }
                        p70 p70Var4 = qyVar.I0;
                        p70Var4.i = 3;
                        p70Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        p70Var4.Z();
                        return z4;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            case 16:
                nr0 nr0Var = ((oh.r) this.b).T;
                if (nr0Var.D.z1 || !(view instanceof org.telegram.ui.Cells.q7)) {
                    return false;
                }
                MessageObject messageObject = ((org.telegram.ui.Cells.q7) view).getMessageObject();
                if (nr0Var.c(messageObject)) {
                    nr0Var.g(messageObject);
                } else {
                    nr0Var.e(messageObject);
                }
                return true;
            default:
                ph.a3 a3Var = (ph.a3) this.b;
                ArrayList arrayList = a3Var.V;
                ArrayList arrayList2 = a3Var.e0;
                if (i10 >= 2 && a3Var.T != null && (view instanceof ph.x2)) {
                    int i37 = i10 - 2;
                    if (!a3Var.W) {
                        if (a3Var.a0) {
                            if (i37 < 0 || i37 >= arrayList.size()) {
                                i37 -= arrayList.size();
                            }
                        }
                        if (i37 >= 0) {
                            photoEntry = (MediaController.PhotoEntry) a3Var.c0.get(i37);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(photoEntry)) {
                                }
                                AndroidUtilities.updateVisibleRows(a3Var.d);
                                a3Var.j();
                                return true;
                            }
                        }
                    } else if (i37 != 0) {
                        i37 = i10 - 3;
                        if (i37 >= 0 && i37 < a3Var.c0.size()) {
                            photoEntry = (MediaController.PhotoEntry) a3Var.c0.get(i37);
                            if (arrayList2.isEmpty() && !a3Var.N) {
                                if (!arrayList2.contains(photoEntry)) {
                                    arrayList2.remove(photoEntry);
                                } else {
                                    if (arrayList2.size() + 1 > a3Var.O) {
                                        int i38 = -a3Var.K;
                                        a3Var.K = i38;
                                        AndroidUtilities.shakeViewSpring(view, i38);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        return true;
                                    }
                                    arrayList2.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(a3Var.d);
                                a3Var.j();
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 18:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$02;
        }
    }

    @Override // org.telegram.ui.Components.xk0
    public void e() {
        ((ph.d1) this.b).invalidate();
    }

    @Override // nh.c9
    public void f(float f10, Canvas canvas, RectF rectF, boolean z4) {
        Path path = (Path) this.b;
        if (z4) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // cg.h2
    public void g() {
        ph.h9 h9Var = (ph.h9) this.b;
        TextView textView = h9Var.l1;
        boolean a2 = h9Var.A0.a();
        ImageView imageView = h9Var.k1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // n2.a
    public void i(WebView webView, b4.e0 e0Var, Uri uri, boolean z4, o2.f fVar) {
        org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.b;
        org.telegram.ui.web.c1 c1Var = y0Var.N;
        if (webView != y0Var || c1Var == null) {
            return;
        }
        if (webView != c1Var.a || e0Var.b != 0) {
            c1Var.h("onBotWebMessage ignored: invalid source or payload");
            return;
        }
        String l10 = org.telegram.ui.web.c1.l(uri == null ? null : uri.toString());
        if (c1Var.q0 && (TextUtils.isEmpty(c1Var.C0) || !TextUtils.equals(c1Var.C0, l10) || !TextUtils.equals(c1Var.C0, c1Var.getOriginHost()))) {
            c1Var.h("onBotWebMessage ignored: untrusted origin");
            return;
        }
        nh.j7 g10 = c1Var.g();
        try {
            e0Var.e(0);
            String str = (String) e0Var.c;
            if (str != null && str.length() <= 1048576) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("eventType");
                if (!string.isEmpty() && string.length() <= 128) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0(c1Var, webView, g10, string, jSONObject.optString("eventData", null), 2));
                    return;
                }
                c1Var.h("onBotWebMessage ignored: invalid event type");
                return;
            }
            c1Var.h("onBotWebMessage ignored: invalid payload length");
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 8:
                ((Runnable) this.b).run();
                break;
            case 23:
                ((org.telegram.ui.web.b0) this.b).run();
                break;
            case 24:
                ph.da daVar = ((ph.t9) ((ph.p) this.b)).P1;
                ph.s9 s9Var = daVar.U0;
                if (s9Var != null) {
                    s9Var.s(null, null, true);
                }
                ph.h9 h9Var = daVar.s1;
                if (h9Var != null) {
                    h9Var.q0();
                }
                ph.t9 t9Var = daVar.Z0;
                if (t9Var != null) {
                    t9Var.setHasRoundVideo(false);
                }
                ph.t6 t6Var = daVar.H1;
                if (t6Var != null) {
                    File file = t6Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        daVar.H1.o0 = null;
                    }
                    if (daVar.H1.p0 != null) {
                        try {
                            new File(daVar.H1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        daVar.H1.p0 = null;
                        break;
                    }
                }
                break;
            default:
                ((ph.r4) this.b).a.m2.r();
                break;
        }
    }

    @Override // ih.o
    public void o(ih.k kVar, float f10, float f11) {
        nh.y7 y7Var = (nh.y7) this.b;
        if (y7Var.v.x) {
            return;
        }
        kVar.q = new nh.x7(y7Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = y7Var.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ih.k) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                t7.b((t7) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            case 4:
                ga gaVar = (ga) this.b;
                i51 i51Var = (i51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                gaVar.getClass();
                if (i51Var.G instanceof TL_stars.StarsTransaction) {
                    ja.h1(gaVar.getContext(), false, 0L, gaVar.c, (TL_stars.StarsTransaction) i51Var.G, gaVar.b);
                    break;
                }
                break;
            default:
                ph.v8 v8Var = (ph.v8) this.b;
                i51 i51Var2 = (i51) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = i51Var2.d;
                ph.t6 t6Var = (ph.t6) i51Var2.G;
                v8Var.c(false, true);
                ph.da daVar = v8Var.L;
                if (t6Var != daVar.H1 && !daVar.U1) {
                    daVar.a1.setSelected(i10);
                    daVar.U1 = true;
                    ph.i8 i8Var = new ph.i8(daVar, i10, 0);
                    ph.h9 h9Var = daVar.s1;
                    ph.t6 t6Var2 = daVar.H1;
                    if (h9Var != null && t6Var2 != null) {
                        if (!h9Var.u0()) {
                            i8Var.run();
                            break;
                        } else {
                            t6Var2.f();
                            boolean u02 = h9Var.u0();
                            boolean z4 = h9Var.L0.getPainting().E;
                            Utilities.searchQueue.postRunnable(new ph.k8(daVar, h9Var, t6Var2.i0, t6Var2.j0, t6Var2, z4, u02, i8Var, 0));
                            break;
                        }
                    } else {
                        i8Var.run();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        switch (this.a) {
            case 6:
                return nh.v0.a((nh.v0) this.b, (Long) obj2);
            default:
                nr0 nr0Var = (nr0) this.b;
                if (((Integer) obj).intValue() == -1) {
                    new oh.u(nr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new cg.h0(nr0Var, 28)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new k41(8, tVar, bitmap));
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
