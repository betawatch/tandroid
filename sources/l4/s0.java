package l4;

import ag.m2;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import lh.a7;
import lh.b5;
import lh.c9;
import lh.f2;
import lh.i9;
import lh.w8;
import lh.x7;
import lh.x8;
import lh.y7;
import nh.aa;
import nh.ca;
import nh.f9;
import nh.gb;
import nh.i5;
import nh.j3;
import nh.j6;
import nh.j9;
import nh.ja;
import nh.n1;
import nh.n3;
import nh.o6;
import nh.o7;
import nh.va;
import nh.wa;
import nh.y9;
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
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.fy;
import org.telegram.ui.web.t1;
import org.telegram.ui.xw;
import org.telegram.ui.yu0;
import org.webrtc.GlGenericDrawer;
import ph.x3;
import sf.u1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements bl0, Utilities.Callback2Return, al0, b2, a7, c9, gh.o, r0.o, nk0, Utilities.Callback5, m2, CameraController.VideoTakeCallback, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, o3.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i9 i9Var = (i9) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
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

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        ((n1) this.b).invalidate();
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        long j10;
        int i11;
        int i12;
        int i13;
        f2 f2Var = (f2) this.b;
        jh.e1 e1Var = f2Var.c;
        ArrayList arrayList = f2Var.r;
        lh.t0 t0Var = ((lh.r0) view).f;
        int i14 = f2Var.J;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= t0Var.f.size()) {
                break;
            }
            lh.s0 s0Var = (lh.s0) t0Var.f.get(i16);
            long j11 = s0Var.g;
            if (j11 > 0 && currentTime - s0Var.d <= lh.s.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(s0Var.a));
            }
            i16++;
        }
        lh.d1 d1Var = f2Var.L;
        long j12 = d1Var != null ? d1Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            lh.s0 s0Var2 = (lh.s0) arrayList.get(i17);
            if (s0Var2.b || !s0Var2.e || s0Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(s0Var2.a))) {
                    j10 = j12;
                    if (f2Var.w != t0Var.b || (i13 = f2Var.x) == 0 || s0Var2.a < i13) {
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
                lh.s0 s0Var3 = (lh.s0) arrayList.get(i15);
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
        f2Var.w = t0Var.b;
        f2Var.x = i12;
        f2Var.y = true;
        f2.u0 itemAnimator = e1Var.getItemAnimator();
        e1Var.setItemAnimator(null);
        f2Var.d.i1(i18, e1Var.getHeight() / 2, true);
        f2Var.e.m(i18);
        e1Var.setItemAnimator(itemAnimator);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
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
    @Override // org.telegram.ui.Components.bl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(int i10, final View view) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10;
        boolean z10;
        jq jqVar;
        boolean z11;
        boolean z12;
        j70 j70Var;
        int i18;
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 1:
                final xw xwVar = (xw) this.b;
                if (xwVar.J == 0.0f && xwVar.j0 == 0.0f) {
                    final long j11 = ((lh.o) view).A;
                    fy fyVar = xwVar.K0;
                    i11 = ((o2) fyVar).currentAccount;
                    MediaDataController.getInstance(i11).loadHints(true);
                    j70 H = j70.H(fyVar, view);
                    H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    H.W(g6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), fyVar.getThemedColor(g6.d6)));
                    H.a0(0.0f, AndroidUtilities.dp(8.0f));
                    fyVar.H0 = H;
                    if (!UserObject.isService(j11)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i12 = ((o2) fyVar).currentAccount;
                        if (j11 != UserConfig.getInstance(i12).getClientUserId()) {
                            final TLRPC.User user = fyVar.getMessagesController().getUser(Long.valueOf(j11));
                            TLRPC.Chat chat = fyVar.getMessagesController().getChat(Long.valueOf(-j11));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, 0L);
                            i13 = ((o2) fyVar).currentAccount;
                            boolean c02 = NotificationsCustomSettingsActivity.c0(i13, j11);
                            i14 = ((o2) fyVar).currentAccount;
                            boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                            i15 = ((o2) fyVar).currentAccount;
                            boolean isPremium = UserConfig.getInstance(i15).isPremium();
                            i16 = ((o2) fyVar).currentAccount;
                            boolean J = MessagesController.getInstance(i16).getStoriesController().J(j11);
                            i17 = ((o2) fyVar).currentAccount;
                            boolean F = MessagesController.getInstance(i17).getStoriesController().F(j11);
                            if (premiumFeaturesBlocked || j11 <= 0 || isPremium) {
                                j10 = 0;
                                z10 = false;
                            } else {
                                z10 = false;
                                Drawable drawable = xwVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = xwVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        j10 = 0;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(fyVar.getThemedColor(g6.F8), PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        j10 = 0;
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    jqVar = new jq(drawable2, drawable);
                                    jq jqVar2 = jqVar;
                                    if (j11 < j10 && fyVar.X3().j(j11)) {
                                        final int i19 = 4;
                                        fyVar.H0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), g6.F8, g6.E8, new Runnable() { // from class: org.telegram.ui.tw
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i20;
                                                switch (i19) {
                                                    case 0:
                                                        xwVar.K0.presentFragment(tn.R9(j11));
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        fy fyVar2 = xwVar.K0;
                                                        i20 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                        MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                        long j12 = j11;
                                                        mediaDataController.removePeer(j12);
                                                        fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                        break;
                                                    case 4:
                                                        xwVar.K0.A0.j(j11);
                                                        break;
                                                    case 5:
                                                        xwVar.K0.presentFragment(tn.R9(j11));
                                                        break;
                                                    default:
                                                        xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (user != null && !user.contact) {
                                        i18 = ((o2) fyVar).currentAccount;
                                        if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                            z11 = true;
                                            j70 j70Var2 = fyVar.H0;
                                            final int i20 = 5;
                                            j70Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.tw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i20) {
                                                        case 0:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            fy fyVar2 = xwVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            xwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        default:
                                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i21 = 6;
                                            j70Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.tw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i21) {
                                                        case 0:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            fy fyVar2 = xwVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            xwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        default:
                                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i22 = 0;
                                            j70Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.tw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i22) {
                                                        case 0:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            fy fyVar2 = xwVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            xwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        default:
                                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 < j10);
                                            final int i23 = 0;
                                            j70Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i24;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i23;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    xw xwVar2 = xwVar;
                                                    switch (i26) {
                                                        case 0:
                                                            fy fyVar2 = xwVar2.K0;
                                                            i24 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            fyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.tc.a0(fyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            fy fyVar3 = xwVar2.K0;
                                                            i25 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            fyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.tc.a0(fyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !c02 && j11 > j10);
                                            j70Var2.E();
                                            final int i24 = 1;
                                            j70Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.uw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i24;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    xw xwVar2 = xwVar;
                                                    switch (i26) {
                                                        case 0:
                                                            fy fyVar2 = xwVar2.K0;
                                                            i242 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            fyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.tc.a0(fyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            fy fyVar3 = xwVar2.K0;
                                                            i25 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            fyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.tc.a0(fyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, c02 && j11 > j10);
                                            j70Var2.E();
                                            final int i25 = 0;
                                            j70Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.vw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.c6 c6Var;
                                                    int i26;
                                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                                    switch (i25) {
                                                        case 0:
                                                            xw xwVar2 = xwVar;
                                                            fy fyVar2 = xwVar2.K0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i26 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof lh.o) {
                                                                        fyVar2.A0.i((lh.o) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = xwVar2.getContext();
                                                            c6Var = ((org.telegram.ui.ActionBar.o2) fyVar2).resourceProvider;
                                                            lh.q5 q5Var = new lh.q5(context, 0.0f, 1, c6Var);
                                                            q5Var.e = new ww(xwVar2, view2, 1);
                                                            fyVar2.showDialog(q5Var);
                                                            break;
                                                        default:
                                                            xw xwVar3 = xwVar;
                                                            Context context2 = xwVar3.getContext();
                                                            fy fyVar3 = xwVar3.K0;
                                                            c6Var2 = ((org.telegram.ui.ActionBar.o2) fyVar3).resourceProvider;
                                                            lh.q5 q5Var2 = new lh.q5(context2, 0.0f, 1, c6Var2);
                                                            q5Var2.e = new ww(xwVar3, view, 0);
                                                            fyVar3.showDialog(q5Var2);
                                                            break;
                                                    }
                                                }
                                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                            j70Var2.E();
                                            z12 = premiumFeaturesBlocked && j11 > j10 && !isPremium && J && !F;
                                            int i26 = R.drawable.msg_stories_stealth2;
                                            String string = LocaleController.getString(R.string.ViewAnonymously);
                                            final int i27 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.vw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.c6 c6Var;
                                                    int i262;
                                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                                    switch (i27) {
                                                        case 0:
                                                            xw xwVar2 = xwVar;
                                                            fy fyVar2 = xwVar2.K0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i262 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof lh.o) {
                                                                        fyVar2.A0.i((lh.o) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = xwVar2.getContext();
                                                            c6Var = ((org.telegram.ui.ActionBar.o2) fyVar2).resourceProvider;
                                                            lh.q5 q5Var = new lh.q5(context, 0.0f, 1, c6Var);
                                                            q5Var.e = new ww(xwVar2, view2, 1);
                                                            fyVar2.showDialog(q5Var);
                                                            break;
                                                        default:
                                                            xw xwVar3 = xwVar;
                                                            Context context2 = xwVar3.getContext();
                                                            fy fyVar3 = xwVar3.K0;
                                                            c6Var2 = ((org.telegram.ui.ActionBar.o2) fyVar3).resourceProvider;
                                                            lh.q5 q5Var2 = new lh.q5(context2, 0.0f, 1, c6Var2);
                                                            q5Var2.e = new ww(xwVar3, view, 0);
                                                            fyVar3.showDialog(q5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z12) {
                                                j70Var2.b(i26, jqVar2, string, g6.F8, g6.E8, runnable);
                                                j70Var = j70Var2;
                                            } else {
                                                j70Var = j70Var2;
                                            }
                                            j70Var.E();
                                            final int i28 = 1;
                                            j70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.tw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i28) {
                                                        case 0:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            fy fyVar2 = xwVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            xwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        default:
                                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11 && !fyVar.e4());
                                            j70Var.E();
                                            final int i29 = 2;
                                            j70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.tw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i29) {
                                                        case 0:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            fy fyVar2 = xwVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            xwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        default:
                                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11 && fyVar.e4());
                                            j70Var.E();
                                            final int i30 = 3;
                                            j70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.tw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i30) {
                                                        case 0:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            fy fyVar2 = xwVar.K0;
                                                            i202 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            xwVar.K0.A0.j(j11);
                                                            break;
                                                        case 5:
                                                            xwVar.K0.presentFragment(tn.R9(j11));
                                                            break;
                                                        default:
                                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z11);
                                        }
                                    }
                                    z11 = false;
                                    j70 j70Var22 = fyVar.H0;
                                    final int i202 = 5;
                                    j70Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.tw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i202) {
                                                case 0:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    fy fyVar2 = xwVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    xwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                default:
                                                    xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    final int i212 = 6;
                                    j70Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.tw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i212) {
                                                case 0:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    fy fyVar2 = xwVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    xwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                default:
                                                    xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    if (j11 < j10) {
                                    }
                                    final int i222 = 0;
                                    j70Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.tw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i222) {
                                                case 0:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    fy fyVar2 = xwVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    xwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                default:
                                                    xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 < j10);
                                    final int i232 = 0;
                                    j70Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i252;
                                            int i262 = i232;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            xw xwVar2 = xwVar;
                                            switch (i262) {
                                                case 0:
                                                    fy fyVar2 = xwVar2.K0;
                                                    i242 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    fyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.tc.a0(fyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    fy fyVar3 = xwVar2.K0;
                                                    i252 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    fyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.tc.a0(fyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !c02 && j11 > j10);
                                    j70Var22.E();
                                    final int i242 = 1;
                                    j70Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.uw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            String trim;
                                            int i252;
                                            int i262 = i242;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            xw xwVar2 = xwVar;
                                            switch (i262) {
                                                case 0:
                                                    fy fyVar2 = xwVar2.K0;
                                                    i2422 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    fyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.tc.a0(fyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    fy fyVar3 = xwVar2.K0;
                                                    i252 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    fyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.tc.a0(fyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, c02 && j11 > j10);
                                    j70Var22.E();
                                    final int i252 = 0;
                                    j70Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.vw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.c6 c6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.c6 c6Var2;
                                            switch (i252) {
                                                case 0:
                                                    xw xwVar2 = xwVar;
                                                    fy fyVar2 = xwVar2.K0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof lh.o) {
                                                                fyVar2.A0.i((lh.o) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = xwVar2.getContext();
                                                    c6Var = ((org.telegram.ui.ActionBar.o2) fyVar2).resourceProvider;
                                                    lh.q5 q5Var = new lh.q5(context, 0.0f, 1, c6Var);
                                                    q5Var.e = new ww(xwVar2, view2, 1);
                                                    fyVar2.showDialog(q5Var);
                                                    break;
                                                default:
                                                    xw xwVar3 = xwVar;
                                                    Context context2 = xwVar3.getContext();
                                                    fy fyVar3 = xwVar3.K0;
                                                    c6Var2 = ((org.telegram.ui.ActionBar.o2) fyVar3).resourceProvider;
                                                    lh.q5 q5Var2 = new lh.q5(context2, 0.0f, 1, c6Var2);
                                                    q5Var2.e = new ww(xwVar3, view, 0);
                                                    fyVar3.showDialog(q5Var2);
                                                    break;
                                            }
                                        }
                                    }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                    j70Var22.E();
                                    if (premiumFeaturesBlocked) {
                                    }
                                    int i262 = R.drawable.msg_stories_stealth2;
                                    String string2 = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i272 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.vw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.c6 c6Var;
                                            int i2622;
                                            org.telegram.ui.ActionBar.c6 c6Var2;
                                            switch (i272) {
                                                case 0:
                                                    xw xwVar2 = xwVar;
                                                    fy fyVar2 = xwVar2.K0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i2622 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof lh.o) {
                                                                fyVar2.A0.i((lh.o) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = xwVar2.getContext();
                                                    c6Var = ((org.telegram.ui.ActionBar.o2) fyVar2).resourceProvider;
                                                    lh.q5 q5Var = new lh.q5(context, 0.0f, 1, c6Var);
                                                    q5Var.e = new ww(xwVar2, view2, 1);
                                                    fyVar2.showDialog(q5Var);
                                                    break;
                                                default:
                                                    xw xwVar3 = xwVar;
                                                    Context context2 = xwVar3.getContext();
                                                    fy fyVar3 = xwVar3.K0;
                                                    c6Var2 = ((org.telegram.ui.ActionBar.o2) fyVar3).resourceProvider;
                                                    lh.q5 q5Var2 = new lh.q5(context2, 0.0f, 1, c6Var2);
                                                    q5Var2.e = new ww(xwVar3, view, 0);
                                                    fyVar3.showDialog(q5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                    }
                                    j70Var.E();
                                    final int i282 = 1;
                                    j70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.tw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i282) {
                                                case 0:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    fy fyVar2 = xwVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    xwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                default:
                                                    xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11 && !fyVar.e4());
                                    j70Var.E();
                                    final int i292 = 2;
                                    j70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.tw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i292) {
                                                case 0:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    fy fyVar2 = xwVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    xwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                default:
                                                    xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11 && fyVar.e4());
                                    j70Var.E();
                                    final int i302 = 3;
                                    j70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.tw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i302) {
                                                case 0:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    fy fyVar2 = xwVar.K0;
                                                    i2022 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    xwVar.K0.A0.j(j11);
                                                    break;
                                                case 5:
                                                    xwVar.K0.presentFragment(tn.R9(j11));
                                                    break;
                                                default:
                                                    xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11);
                                } else {
                                    j10 = 0;
                                }
                            }
                            jqVar = null;
                            jq jqVar22 = jqVar;
                            if (j11 < j10) {
                                final int i192 = 4;
                                fyVar.H0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), g6.F8, g6.E8, new Runnable() { // from class: org.telegram.ui.tw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2022;
                                        switch (i192) {
                                            case 0:
                                                xwVar.K0.presentFragment(tn.R9(j11));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                fy fyVar2 = xwVar.K0;
                                                i2022 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                long j12 = j11;
                                                mediaDataController.removePeer(j12);
                                                fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                break;
                                            case 4:
                                                xwVar.K0.A0.j(j11);
                                                break;
                                            case 5:
                                                xwVar.K0.presentFragment(tn.R9(j11));
                                                break;
                                            default:
                                                xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null) {
                                i18 = ((o2) fyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                }
                            }
                            z11 = false;
                            j70 j70Var222 = fyVar.H0;
                            final int i2022 = 5;
                            j70Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2022) {
                                        case 0:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            fy fyVar2 = xwVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            xwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        default:
                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            final int i2122 = 6;
                            j70Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2122) {
                                        case 0:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            fy fyVar2 = xwVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            xwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        default:
                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            if (j11 < j10) {
                            }
                            final int i2222 = 0;
                            j70Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2222) {
                                        case 0:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            fy fyVar2 = xwVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            xwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        default:
                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 < j10);
                            final int i2322 = 0;
                            j70Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.uw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2322;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    xw xwVar2 = xwVar;
                                    switch (i2622) {
                                        case 0:
                                            fy fyVar2 = xwVar2.K0;
                                            i2422 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            fyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.tc.a0(fyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            fy fyVar3 = xwVar2.K0;
                                            i2522 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            fyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.tc.a0(fyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c02 && j11 > j10);
                            j70Var222.E();
                            final int i2422 = 1;
                            j70Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.uw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2422;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    xw xwVar2 = xwVar;
                                    switch (i2622) {
                                        case 0:
                                            fy fyVar2 = xwVar2.K0;
                                            i24222 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            fyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.tc.a0(fyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            fy fyVar3 = xwVar2.K0;
                                            i2522 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            fyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.tc.a0(fyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c02 && j11 > j10);
                            j70Var222.E();
                            final int i2522 = 0;
                            j70Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.vw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.c6 c6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                    switch (i2522) {
                                        case 0:
                                            xw xwVar2 = xwVar;
                                            fy fyVar2 = xwVar2.K0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof lh.o) {
                                                        fyVar2.A0.i((lh.o) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = xwVar2.getContext();
                                            c6Var = ((org.telegram.ui.ActionBar.o2) fyVar2).resourceProvider;
                                            lh.q5 q5Var = new lh.q5(context, 0.0f, 1, c6Var);
                                            q5Var.e = new ww(xwVar2, view2, 1);
                                            fyVar2.showDialog(q5Var);
                                            break;
                                        default:
                                            xw xwVar3 = xwVar;
                                            Context context2 = xwVar3.getContext();
                                            fy fyVar3 = xwVar3.K0;
                                            c6Var2 = ((org.telegram.ui.ActionBar.o2) fyVar3).resourceProvider;
                                            lh.q5 q5Var2 = new lh.q5(context2, 0.0f, 1, c6Var2);
                                            q5Var2.e = new ww(xwVar3, view, 0);
                                            fyVar3.showDialog(q5Var2);
                                            break;
                                    }
                                }
                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                            j70Var222.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i2622 = R.drawable.msg_stories_stealth2;
                            String string22 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i2722 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.vw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.c6 c6Var;
                                    int i26222;
                                    org.telegram.ui.ActionBar.c6 c6Var2;
                                    switch (i2722) {
                                        case 0:
                                            xw xwVar2 = xwVar;
                                            fy fyVar2 = xwVar2.K0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i26222 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof lh.o) {
                                                        fyVar2.A0.i((lh.o) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = xwVar2.getContext();
                                            c6Var = ((org.telegram.ui.ActionBar.o2) fyVar2).resourceProvider;
                                            lh.q5 q5Var = new lh.q5(context, 0.0f, 1, c6Var);
                                            q5Var.e = new ww(xwVar2, view2, 1);
                                            fyVar2.showDialog(q5Var);
                                            break;
                                        default:
                                            xw xwVar3 = xwVar;
                                            Context context2 = xwVar3.getContext();
                                            fy fyVar3 = xwVar3.K0;
                                            c6Var2 = ((org.telegram.ui.ActionBar.o2) fyVar3).resourceProvider;
                                            lh.q5 q5Var2 = new lh.q5(context2, 0.0f, 1, c6Var2);
                                            q5Var2.e = new ww(xwVar3, view, 0);
                                            fyVar3.showDialog(q5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            j70Var.E();
                            final int i2822 = 1;
                            j70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2822) {
                                        case 0:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            fy fyVar2 = xwVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            xwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        default:
                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11 && !fyVar.e4());
                            j70Var.E();
                            final int i2922 = 2;
                            j70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2922) {
                                        case 0:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            fy fyVar2 = xwVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            xwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        default:
                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11 && fyVar.e4());
                            j70Var.E();
                            final int i3022 = 3;
                            j70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.tw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i3022) {
                                        case 0:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new uv(xwVar.K0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            fy fyVar2 = xwVar.K0;
                                            i20222 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            fyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            xwVar.K0.A0.j(j11);
                                            break;
                                        case 5:
                                            xwVar.K0.presentFragment(tn.R9(j11));
                                            break;
                                        default:
                                            xwVar.K0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z11);
                        } else if (fyVar.K3) {
                            j70 j70Var3 = fyVar.H0;
                            int i31 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i32 = g6.F8;
                            int i33 = g6.E8;
                            final int i34 = 0;
                            j70Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.sw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i34) {
                                        case 0:
                                            xwVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            fy fyVar2 = xwVar.K0;
                                            i35 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            fyVar2.presentFragment(new org.telegram.ui.Components.y90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            fy fyVar3 = xwVar.K0;
                                            i36 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            fyVar3.presentFragment(new org.telegram.ui.Components.y90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 1;
                            fyVar.H0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.sw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i36;
                                    switch (i35) {
                                        case 0:
                                            xwVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            fy fyVar2 = xwVar.K0;
                                            i352 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            fyVar2.presentFragment(new org.telegram.ui.Components.y90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            fy fyVar3 = xwVar.K0;
                                            i36 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            fyVar3.presentFragment(new org.telegram.ui.Components.y90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i36 = 2;
                            fyVar.H0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.sw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i362;
                                    switch (i36) {
                                        case 0:
                                            xwVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            fy fyVar2 = xwVar.K0;
                                            i352 = ((org.telegram.ui.ActionBar.o2) fyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            fyVar2.presentFragment(new org.telegram.ui.Components.y90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            fy fyVar3 = xwVar.K0;
                                            i362 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            fyVar3.presentFragment(new org.telegram.ui.Components.y90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z10 = false;
                        } else {
                            xw xwVar2 = fyVar.A0;
                            if (xwVar2 != null) {
                                xwVar2.n();
                            }
                        }
                        j70 j70Var4 = fyVar.H0;
                        j70Var4.i = 3;
                        j70Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        j70Var4.Z();
                        return z10;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            case 11:
                fr0 fr0Var = ((mh.r) this.b).S;
                if (fr0Var.C.y1 || !(view instanceof p7)) {
                    return false;
                }
                MessageObject messageObject = ((p7) view).getMessageObject();
                if (fr0Var.c(messageObject)) {
                    fr0Var.g(messageObject);
                } else {
                    fr0Var.e(messageObject);
                }
                return true;
            default:
                n3 n3Var = (n3) this.b;
                ArrayList arrayList = n3Var.U;
                ArrayList arrayList2 = n3Var.d0;
                if (i10 >= 2 && n3Var.S != null && (view instanceof j3)) {
                    int i37 = i10 - 2;
                    if (!n3Var.V) {
                        if (n3Var.W) {
                            if (i37 < 0 || i37 >= arrayList.size()) {
                                i37 -= arrayList.size();
                            }
                        }
                        if (i37 >= 0) {
                            photoEntry = (MediaController.PhotoEntry) n3Var.b0.get(i37);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(photoEntry)) {
                                }
                                AndroidUtilities.updateVisibleRows(n3Var.d);
                                n3Var.j();
                                return true;
                            }
                        }
                    } else if (i37 != 0) {
                        i37 = i10 - 3;
                        if (i37 >= 0 && i37 < n3Var.b0.size()) {
                            photoEntry = (MediaController.PhotoEntry) n3Var.b0.get(i37);
                            if (arrayList2.isEmpty() && !n3Var.M) {
                                if (!arrayList2.contains(photoEntry)) {
                                    arrayList2.remove(photoEntry);
                                } else {
                                    if (arrayList2.size() + 1 > n3Var.N) {
                                        int i38 = -n3Var.J;
                                        n3Var.J = i38;
                                        AndroidUtilities.shakeViewSpring(view, i38);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        return true;
                                    }
                                    arrayList2.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(n3Var.d);
                                n3Var.j();
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }

    @Override // lh.a7
    public void d(boolean z10) {
        b5 b5Var = (b5) this.b;
        if (b5Var != null) {
            b5Var.c();
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 19:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override // ag.m2
    public void e() {
        ja jaVar = (ja) this.b;
        TextView textView = jaVar.k1;
        boolean a2 = jaVar.z0.a();
        ImageView imageView = jaVar.j1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // lh.c9
    public void f(float f9, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f9, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 4:
                ((Runnable) this.b).run();
                break;
            case 12:
                gb gbVar = ((wa) ((nh.r) this.b)).O1;
                va vaVar = gbVar.T0;
                if (vaVar != null) {
                    vaVar.s(null, null, true);
                }
                ja jaVar = gbVar.r1;
                if (jaVar != null) {
                    jaVar.q0();
                }
                wa waVar = gbVar.Y0;
                if (waVar != null) {
                    waVar.setHasRoundVideo(false);
                }
                o7 o7Var = gbVar.G1;
                if (o7Var != null) {
                    File file = o7Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        gbVar.G1.o0 = null;
                    }
                    if (gbVar.G1.p0 != null) {
                        try {
                            new File(gbVar.G1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        gbVar.G1.p0 = null;
                        break;
                    }
                }
                break;
            case 17:
                ((i5) this.b).a.l2.r();
                break;
            case 23:
                ((org.telegram.ui.web.a0) this.b).run();
                break;
            case 24:
                ((ph.d) this.b).run();
                break;
            default:
                ph.j jVar = (ph.j) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().getInputUser(jVar.L);
                updatestarrefprogram.commission_permille = 0;
                c2 c2Var2 = new c2(jVar.getParentActivity(), 3, null);
                c2Var2.q(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ph.b(jVar, c2Var2, 0));
                break;
        }
    }

    @Override // o3.c
    public long l(long j10) {
        return ((FlacStreamMetadata) this.b).getSampleNumber(j10);
    }

    @Override // gh.o
    public void m(gh.k kVar, float f9, float f10) {
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
            ((gh.k) obj).j(f9, f10, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        ca caVar = (ca) this.b;
        gb gbVar = caVar.a;
        o6 o6Var = gbVar.K0;
        int i10 = gbVar.c;
        if (o6Var != null) {
            o6Var.g(true);
        }
        if (gbVar.q0()) {
            gbVar.s.d();
        }
        if (gbVar.C1 == null || gbVar.x0 == null) {
            return;
        }
        gbVar.M1 = false;
        gbVar.N1 = false;
        j6 j6Var = gbVar.y0;
        if (j6Var != null) {
            j6Var.c(false);
        }
        if (j10 <= 800) {
            gbVar.h(false, true);
            gbVar.d0(false);
            gbVar.F0.b(false, true);
            o6 o6Var2 = gbVar.K0;
            if (o6Var2 != null) {
                o6Var2.g(true);
            }
            try {
                gbVar.C1.delete();
                gbVar.C1 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            }
            return;
        }
        gbVar.i0(false, true);
        o7 o10 = o7.o(gbVar.C1, str, j10);
        o10.J0 = gbVar.r0;
        o10.K0 = gbVar.s0;
        o10.B();
        gbVar.h(false, true);
        gbVar.d0(false);
        gbVar.F0.b(false, true);
        o6 o6Var3 = gbVar.K0;
        if (o6Var3 != null) {
            o6Var3.g(true);
        }
        if (!gbVar.w0.j()) {
            gbVar.G1 = o10;
            f9.a(i10, o10);
            gbVar.H1 = false;
            int videoWidth = gbVar.x0.getVideoWidth();
            int videoHeight = gbVar.x0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                o7 o7Var = gbVar.G1;
                o7Var.k0 = videoWidth;
                o7Var.l0 = videoHeight;
                o7Var.A();
            }
            gbVar.L(new aa(caVar, 3), 0L);
            return;
        }
        gbVar.C1 = null;
        o10.P = 1.0f;
        if (gbVar.w0.l(o10)) {
            o7 a2 = o7.a(gbVar.w0.getLayout(), gbVar.w0.getContent());
            gbVar.G1 = a2;
            f9.a(i10, a2);
            gbVar.H1 = false;
            int videoWidth2 = gbVar.x0.getVideoWidth();
            int videoHeight2 = gbVar.x0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                o7 o7Var2 = gbVar.G1;
                o7Var2.k0 = videoWidth2;
                o7Var2.l0 = videoHeight2;
                o7Var2.A();
            }
        }
        gbVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 15:
                y9 y9Var = (y9) this.b;
                w41 w41Var = (w41) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = w41Var.d;
                o7 o7Var = (o7) w41Var.G;
                y9Var.c(false, true);
                gb gbVar = y9Var.K;
                if (o7Var != gbVar.G1 && !gbVar.T1) {
                    gbVar.Z0.setSelected(i11);
                    gbVar.T1 = true;
                    bg.f fVar = new bg.f(gbVar, i11, 14);
                    ja jaVar = gbVar.r1;
                    o7 o7Var2 = gbVar.G1;
                    if (jaVar != null && o7Var2 != null) {
                        if (jaVar.u0()) {
                            o7Var2.f();
                            Utilities.searchQueue.postRunnable(new j9(gbVar, jaVar, o7Var2.i0, o7Var2.j0, o7Var2, jaVar.K0.getPainting().E, jaVar.u0(), fVar, 0));
                            break;
                        } else {
                            fVar.run();
                            break;
                        }
                    } else {
                        fVar.run();
                        break;
                    }
                }
                break;
            case 26:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((x3) this.b).V((w41) obj);
                break;
            case 28:
                sf.x0 x0Var = (sf.x0) this.b;
                w41 w41Var2 = (w41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = w41Var2.d;
                if (i12 == -1) {
                    boolean z10 = !x0Var.e;
                    x0Var.e = z10;
                    ((q8) view).setChecked(z10);
                    x0Var.a.U2.N(true);
                    x0Var.Y(true);
                    break;
                } else if (i12 == -2) {
                    u1 u1Var = new u1(null);
                    u1Var.n = x0Var.r;
                    u1Var.c = new yu0(19, x0Var, view);
                    x0Var.presentFragment(u1Var);
                    break;
                } else if (w41Var2.a == 5 && i12 >= 0 && i12 < x0Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i13 = (w41Var2.d + 6) % 7;
                        int i14 = 0;
                        for (int i15 = 0; i15 < x0Var.h[i13].size(); i15++) {
                            if (((sf.w0) x0Var.h[i13].get(i15)).b > i14) {
                                i14 = ((sf.w0) x0Var.h[i13].get(i15)).b;
                            }
                        }
                        int max = Math.max(0, i14 - 1439);
                        int i16 = (w41Var2.d + 1) % 7;
                        int i17 = 1440;
                        for (int i18 = 0; i18 < x0Var.h[i16].size(); i18++) {
                            if (((sf.w0) x0Var.h[i16].get(i18)).a < i17) {
                                i17 = ((sf.w0) x0Var.h[i16].get(i18)).a;
                            }
                        }
                        int i19 = i17 + 1439;
                        CharSequence charSequence = w41Var2.l;
                        ArrayList arrayList = x0Var.h[w41Var2.d];
                        int i20 = 0;
                        for (int i21 = 0; i21 < 7; i21++) {
                            ArrayList arrayList2 = x0Var.h[i21];
                            if (arrayList2 != null) {
                                i20 = Math.max(1, arrayList2.size()) + i20;
                            }
                        }
                        sf.z0 z0Var = new sf.z0(charSequence, arrayList, max, i19, 28 - i20);
                        z0Var.f = new t1(x0Var, 19);
                        z0Var.h = new org.telegram.ui.web.y(29, x0Var, w41Var2);
                        x0Var.presentFragment(z0Var);
                        break;
                    } else {
                        if (x0Var.h[w41Var2.d].isEmpty()) {
                            ((h5) view).setChecked(true);
                            x0Var.h[w41Var2.d].add(new sf.w0(0, 1439));
                            x0Var.X(w41Var2.d);
                        } else {
                            x0Var.h[w41Var2.d].clear();
                            ((h5) view).setChecked(false);
                        }
                        ((h5) view).setValue(sf.x0.a0(x0Var.h[w41Var2.d]));
                        x0Var.Y(true);
                        break;
                    }
                }
                break;
            default:
                final sf.z0 z0Var2 = (sf.z0) this.b;
                w41 w41Var3 = (w41) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = z0Var2.c;
                int i23 = z0Var2.d;
                ArrayList arrayList3 = z0Var2.b;
                int i24 = w41Var3.d;
                if (i24 == -1) {
                    z0Var2.r = !z0Var2.r;
                    arrayList3.clear();
                    if (z0Var2.r) {
                        arrayList3.add(new sf.w0(0, 1439));
                    }
                    q8 q8Var = (q8) view2;
                    boolean z11 = z0Var2.r;
                    w41Var3.e = z11;
                    q8Var.setChecked(z11);
                    boolean z12 = z0Var2.r;
                    q8Var.b(g6.w0(null, z12 ? g6.f6 : g6.e6, false), z12);
                    z0Var2.n.U2.N(true);
                    t1 t1Var = z0Var2.f;
                    if (t1Var != null) {
                        t1Var.run();
                        break;
                    }
                } else if (i24 == -2) {
                    if (arrayList3.isEmpty() || z0Var2.U()) {
                        if (z0Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new sf.w0(clamp, Utilities.clamp(1200, i23, clamp + 1)));
                    } else {
                        int i25 = ((sf.w0) j7.l1.i(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new sf.w0(clamp2, Utilities.clamp((i25 + 1560) / 2, i23, clamp2 + 1)));
                    }
                    t1 t1Var2 = z0Var2.f;
                    if (t1Var2 != null) {
                        t1Var2.run();
                    }
                    z0Var2.n.U2.N(true);
                    break;
                } else if (w41Var3.a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    sf.w0 w0Var = i26 >= 0 ? (sf.w0) arrayList3.get(i26) : null;
                    final sf.w0 w0Var2 = (sf.w0) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    sf.w0 w0Var3 = i27 < arrayList3.size() ? (sf.w0) arrayList3.get(i27) : null;
                    int i28 = w41Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = z0Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = w0Var2.a;
                        if (w0Var != null) {
                            i22 = w0Var.b + 1;
                        }
                        final int i30 = 0;
                        c5.X(parentActivity, string, i29, i22, w0Var2.b - 1, new Utilities.Callback() { // from class: sf.y0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i30) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        m8 m8Var = (m8) view2;
                                        int intValue = num.intValue();
                                        w0Var2.a = intValue;
                                        m8Var.u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.n.U2.N(true);
                                        }
                                        org.telegram.ui.web.t1 t1Var3 = z0Var3.f;
                                        if (t1Var3 != null) {
                                            t1Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        m8 m8Var2 = (m8) view2;
                                        int intValue2 = num.intValue();
                                        w0Var2.b = intValue2;
                                        m8Var2.u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.n.U2.N(true);
                                        }
                                        org.telegram.ui.web.t1 t1Var4 = z0Var4.f;
                                        if (t1Var4 != null) {
                                            t1Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = z0Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i31 = w0Var2.b;
                        int i32 = w0Var2.a + 1;
                        if (w0Var3 != null) {
                            i23 = w0Var3.a - 1;
                        }
                        final int i33 = 1;
                        c5.X(parentActivity2, string2, i31, i32, i23, new Utilities.Callback() { // from class: sf.y0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i33) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        m8 m8Var = (m8) view2;
                                        int intValue = num.intValue();
                                        w0Var2.a = intValue;
                                        m8Var.u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.n.U2.N(true);
                                        }
                                        org.telegram.ui.web.t1 t1Var3 = z0Var3.f;
                                        if (t1Var3 != null) {
                                            t1Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        m8 m8Var2 = (m8) view2;
                                        int intValue2 = num.intValue();
                                        w0Var2.b = intValue2;
                                        m8Var2.u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.n.U2.N(true);
                                        }
                                        org.telegram.ui.web.t1 t1Var4 = z0Var4.f;
                                        if (t1Var4 != null) {
                                            t1Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new sf.w0(0, 1439));
                        }
                        z0Var2.n.U2.N(true);
                        t1 t1Var3 = z0Var2.f;
                        if (t1Var3 != null) {
                            t1Var3.run();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return lh.u0.a((lh.u0) this.b, (Long) obj2);
            default:
                fr0 fr0Var = (fr0) this.b;
                if (((Integer) obj).intValue() == -1) {
                    new mh.u(fr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ag.i0(fr0Var, 28)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(0, uVar, bitmap));
    }
}
