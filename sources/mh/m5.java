package mh;

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
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.hx;
import org.telegram.ui.ko0;
import org.telegram.ui.py;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements Utilities.Callback5, ko0, kl0, Utilities.Callback2Return, jl0, org.telegram.ui.ActionBar.c2, oh.b7, oh.c9, jh.o, r0.o, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, yk0, dg.g2, CameraController.VideoTakeCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        oh.i9 i9Var = (oh.i9) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        marginLayoutParams.topMargin = i9Var.c ? 0 : m1Var.d();
        marginLayoutParams.bottomMargin = i9Var.c ? m1Var.a.f(2).d : m1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        oh.w8 w8Var = i9Var.s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        oh.x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
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
                eh.w wVar = (eh.w) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        wVar.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    wVar.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                lh.i5 i5Var = (lh.i5) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        i5Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    i5Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // oh.b7
    public void b(boolean z4) {
        oh.d5 d5Var = (oh.d5) this.b;
        if (d5Var != null) {
            d5Var.c();
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        long j10;
        int i11;
        int i12;
        int i13;
        oh.h2 h2Var = (oh.h2) this.b;
        d1 d1Var = h2Var.c;
        ArrayList arrayList = h2Var.r;
        oh.u0 u0Var = ((oh.s0) view).f;
        int i14 = h2Var.K;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= u0Var.f.size()) {
                break;
            }
            oh.t0 t0Var = (oh.t0) u0Var.f.get(i16);
            long j11 = t0Var.g;
            if (j11 > 0 && currentTime - t0Var.d <= oh.s.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(t0Var.a));
            }
            i16++;
        }
        oh.e1 e1Var = h2Var.M;
        long j12 = e1Var != null ? e1Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            oh.t0 t0Var2 = (oh.t0) arrayList.get(i17);
            if (t0Var2.b || !t0Var2.e || t0Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(t0Var2.a))) {
                    j10 = j12;
                    if (h2Var.w != u0Var.b || (i13 = h2Var.x) == 0 || t0Var2.a < i13) {
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
                oh.t0 t0Var3 = (oh.t0) arrayList.get(i15);
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
        h2Var.w = u0Var.b;
        h2Var.x = i12;
        h2Var.y = true;
        f2.u0 itemAnimator = d1Var.getItemAnimator();
        d1Var.setItemAnimator(null);
        h2Var.d.i1(i18, d1Var.getHeight() / 2, true);
        h2Var.e.m(i18);
        d1Var.setItemAnimator(itemAnimator);
    }

    @Override // org.telegram.ui.Components.yk0
    public void d() {
        ((qh.d1) this.b).invalidate();
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 16:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z4);
                return lambda$readParams$02;
        }
    }

    @Override // dg.g2
    public void e() {
        qh.e9 e9Var = (qh.e9) this.b;
        TextView textView = e9Var.l1;
        boolean a2 = e9Var.A0.a();
        ImageView imageView = e9Var.k1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
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
    @Override // org.telegram.ui.Components.kl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(int i10, final View view) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10;
        boolean z4;
        pq pqVar;
        boolean z10;
        boolean z11;
        q70 q70Var;
        int i18;
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 6:
                final hx hxVar = (hx) this.b;
                if (hxVar.K == 0.0f && hxVar.k0 == 0.0f) {
                    final long j11 = ((oh.o) view).B;
                    py pyVar = hxVar.L0;
                    i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                    MediaDataController.getInstance(i11).loadHints(true);
                    q70 H = q70.H(pyVar, view);
                    H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    H.W(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
                    H.a0(0.0f, AndroidUtilities.dp(8.0f));
                    pyVar.I0 = H;
                    if (!UserObject.isService(j11)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i12 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                        if (j11 != UserConfig.getInstance(i12).getClientUserId()) {
                            final TLRPC.User user = pyVar.getMessagesController().getUser(Long.valueOf(j11));
                            TLRPC.Chat chat = pyVar.getMessagesController().getChat(Long.valueOf(-j11));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, 0L);
                            i13 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                            boolean c02 = NotificationsCustomSettingsActivity.c0(i13, j11);
                            i14 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                            boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                            i15 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                            boolean isPremium = UserConfig.getInstance(i15).isPremium();
                            i16 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                            boolean J = MessagesController.getInstance(i16).getStoriesController().J(j11);
                            i17 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                            boolean F = MessagesController.getInstance(i17).getStoriesController().F(j11);
                            if (premiumFeaturesBlocked || j11 <= 0 || isPremium) {
                                j10 = 0;
                                z4 = false;
                            } else {
                                z4 = false;
                                Drawable drawable = hxVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = hxVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        j10 = 0;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.F8), PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        j10 = 0;
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    pqVar = new pq(drawable2, drawable);
                                    pq pqVar2 = pqVar;
                                    if (j11 < j10 && pyVar.X3().j(j11)) {
                                        final int i19 = 4;
                                        pyVar.I0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new Runnable() { // from class: org.telegram.ui.dx
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i20;
                                                switch (i19) {
                                                    case 0:
                                                        hxVar.L0.presentFragment(xn.R9(j11));
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        py pyVar2 = hxVar.L0;
                                                        i20 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                        MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                        long j12 = j11;
                                                        mediaDataController.removePeer(j12);
                                                        pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                        break;
                                                    case 4:
                                                        hxVar.L0.B0.j(j11);
                                                        break;
                                                    case 5:
                                                        hxVar.L0.presentFragment(xn.R9(j11));
                                                        break;
                                                    default:
                                                        hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (user != null && !user.contact) {
                                        i18 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                        if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                            z10 = true;
                                            q70 q70Var2 = pyVar.I0;
                                            final int i20 = 5;
                                            q70Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.dx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i20) {
                                                        case 0:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            py pyVar2 = hxVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            hxVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        default:
                                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i21 = 6;
                                            q70Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.dx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i21) {
                                                        case 0:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            py pyVar2 = hxVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            hxVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        default:
                                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i22 = 0;
                                            q70Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.dx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i22) {
                                                        case 0:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            py pyVar2 = hxVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            hxVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        default:
                                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 < j10);
                                            final int i23 = 0;
                                            q70Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ex
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i24;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i23;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    hx hxVar2 = hxVar;
                                                    switch (i26) {
                                                        case 0:
                                                            py pyVar2 = hxVar2.L0;
                                                            i24 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            pyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.qc.a0(pyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            py pyVar3 = hxVar2.L0;
                                                            i25 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            pyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.qc.a0(pyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !c02 && j11 > j10);
                                            q70Var2.E();
                                            final int i24 = 1;
                                            q70Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ex
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    String trim;
                                                    int i25;
                                                    int i26 = i24;
                                                    TLRPC.User user2 = user;
                                                    long j12 = j11;
                                                    String str = sharedPrefKey;
                                                    hx hxVar2 = hxVar;
                                                    switch (i26) {
                                                        case 0:
                                                            py pyVar2 = hxVar2.L0;
                                                            i242 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                            pyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.qc.a0(pyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            py pyVar3 = hxVar2.L0;
                                                            i25 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                                            MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                            pyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                            trim = user2 != null ? user2.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.qc.a0(pyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, c02 && j11 > j10);
                                            q70Var2.E();
                                            final int i25 = 0;
                                            q70Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.fx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.g6 g6Var;
                                                    int i26;
                                                    org.telegram.ui.ActionBar.g6 g6Var2;
                                                    switch (i25) {
                                                        case 0:
                                                            hx hxVar2 = hxVar;
                                                            py pyVar2 = hxVar2.L0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i26 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof oh.o) {
                                                                        pyVar2.B0.i((oh.o) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = hxVar2.getContext();
                                                            g6Var = ((org.telegram.ui.ActionBar.p2) pyVar2).resourceProvider;
                                                            oh.r5 r5Var = new oh.r5(context, 0.0f, 1, g6Var);
                                                            r5Var.e = new gx(hxVar2, view2, 1);
                                                            pyVar2.showDialog(r5Var);
                                                            break;
                                                        default:
                                                            hx hxVar3 = hxVar;
                                                            Context context2 = hxVar3.getContext();
                                                            py pyVar3 = hxVar3.L0;
                                                            g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar3).resourceProvider;
                                                            oh.r5 r5Var2 = new oh.r5(context2, 0.0f, 1, g6Var2);
                                                            r5Var2.e = new gx(hxVar3, view, 0);
                                                            pyVar3.showDialog(r5Var2);
                                                            break;
                                                    }
                                                }
                                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                            q70Var2.E();
                                            z11 = premiumFeaturesBlocked && j11 > j10 && !isPremium && J && !F;
                                            int i26 = R.drawable.msg_stories_stealth2;
                                            String string = LocaleController.getString(R.string.ViewAnonymously);
                                            final int i27 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.fx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.g6 g6Var;
                                                    int i262;
                                                    org.telegram.ui.ActionBar.g6 g6Var2;
                                                    switch (i27) {
                                                        case 0:
                                                            hx hxVar2 = hxVar;
                                                            py pyVar2 = hxVar2.L0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i262 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof oh.o) {
                                                                        pyVar2.B0.i((oh.o) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = hxVar2.getContext();
                                                            g6Var = ((org.telegram.ui.ActionBar.p2) pyVar2).resourceProvider;
                                                            oh.r5 r5Var = new oh.r5(context, 0.0f, 1, g6Var);
                                                            r5Var.e = new gx(hxVar2, view2, 1);
                                                            pyVar2.showDialog(r5Var);
                                                            break;
                                                        default:
                                                            hx hxVar3 = hxVar;
                                                            Context context2 = hxVar3.getContext();
                                                            py pyVar3 = hxVar3.L0;
                                                            g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar3).resourceProvider;
                                                            oh.r5 r5Var2 = new oh.r5(context2, 0.0f, 1, g6Var2);
                                                            r5Var2.e = new gx(hxVar3, view, 0);
                                                            pyVar3.showDialog(r5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z11) {
                                                q70Var2.b(i26, pqVar2, string, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, runnable);
                                                q70Var = q70Var2;
                                            } else {
                                                q70Var = q70Var2;
                                            }
                                            q70Var.E();
                                            final int i28 = 1;
                                            q70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.dx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i28) {
                                                        case 0:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            py pyVar2 = hxVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            hxVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        default:
                                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10 && !pyVar.e4());
                                            q70Var.E();
                                            final int i29 = 2;
                                            q70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.dx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i29) {
                                                        case 0:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            py pyVar2 = hxVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            hxVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        default:
                                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10 && pyVar.e4());
                                            q70Var.E();
                                            final int i30 = 3;
                                            q70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.dx
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i202;
                                                    switch (i30) {
                                                        case 0:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        case 1:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            py pyVar2 = hxVar.L0;
                                                            i202 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                            MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                            long j12 = j11;
                                                            mediaDataController.removePeer(j12);
                                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            hxVar.L0.B0.j(j11);
                                                            break;
                                                        case 5:
                                                            hxVar.L0.presentFragment(xn.R9(j11));
                                                            break;
                                                        default:
                                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10);
                                        }
                                    }
                                    z10 = false;
                                    q70 q70Var22 = pyVar.I0;
                                    final int i202 = 5;
                                    q70Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.dx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i202) {
                                                case 0:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    py pyVar2 = hxVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    hxVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                default:
                                                    hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    final int i212 = 6;
                                    q70Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.dx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i212) {
                                                case 0:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    py pyVar2 = hxVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    hxVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                default:
                                                    hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    if (j11 < j10) {
                                    }
                                    final int i222 = 0;
                                    q70Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.dx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i222) {
                                                case 0:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    py pyVar2 = hxVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    hxVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                default:
                                                    hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 < j10);
                                    final int i232 = 0;
                                    q70Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ex
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i252;
                                            int i262 = i232;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            hx hxVar2 = hxVar;
                                            switch (i262) {
                                                case 0:
                                                    py pyVar2 = hxVar2.L0;
                                                    i242 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    pyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.qc.a0(pyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    py pyVar3 = hxVar2.L0;
                                                    i252 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    pyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.qc.a0(pyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !c02 && j11 > j10);
                                    q70Var22.E();
                                    final int i242 = 1;
                                    q70Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ex
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            String trim;
                                            int i252;
                                            int i262 = i242;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            hx hxVar2 = hxVar;
                                            switch (i262) {
                                                case 0:
                                                    py pyVar2 = hxVar2.L0;
                                                    i2422 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    pyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.qc.a0(pyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    py pyVar3 = hxVar2.L0;
                                                    i252 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    pyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.qc.a0(pyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, c02 && j11 > j10);
                                    q70Var22.E();
                                    final int i252 = 0;
                                    q70Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.fx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.g6 g6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.g6 g6Var2;
                                            switch (i252) {
                                                case 0:
                                                    hx hxVar2 = hxVar;
                                                    py pyVar2 = hxVar2.L0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof oh.o) {
                                                                pyVar2.B0.i((oh.o) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = hxVar2.getContext();
                                                    g6Var = ((org.telegram.ui.ActionBar.p2) pyVar2).resourceProvider;
                                                    oh.r5 r5Var = new oh.r5(context, 0.0f, 1, g6Var);
                                                    r5Var.e = new gx(hxVar2, view2, 1);
                                                    pyVar2.showDialog(r5Var);
                                                    break;
                                                default:
                                                    hx hxVar3 = hxVar;
                                                    Context context2 = hxVar3.getContext();
                                                    py pyVar3 = hxVar3.L0;
                                                    g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar3).resourceProvider;
                                                    oh.r5 r5Var2 = new oh.r5(context2, 0.0f, 1, g6Var2);
                                                    r5Var2.e = new gx(hxVar3, view, 0);
                                                    pyVar3.showDialog(r5Var2);
                                                    break;
                                            }
                                        }
                                    }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                                    q70Var22.E();
                                    if (premiumFeaturesBlocked) {
                                    }
                                    int i262 = R.drawable.msg_stories_stealth2;
                                    String string2 = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i272 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.fx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.g6 g6Var;
                                            int i2622;
                                            org.telegram.ui.ActionBar.g6 g6Var2;
                                            switch (i272) {
                                                case 0:
                                                    hx hxVar2 = hxVar;
                                                    py pyVar2 = hxVar2.L0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i2622 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof oh.o) {
                                                                pyVar2.B0.i((oh.o) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = hxVar2.getContext();
                                                    g6Var = ((org.telegram.ui.ActionBar.p2) pyVar2).resourceProvider;
                                                    oh.r5 r5Var = new oh.r5(context, 0.0f, 1, g6Var);
                                                    r5Var.e = new gx(hxVar2, view2, 1);
                                                    pyVar2.showDialog(r5Var);
                                                    break;
                                                default:
                                                    hx hxVar3 = hxVar;
                                                    Context context2 = hxVar3.getContext();
                                                    py pyVar3 = hxVar3.L0;
                                                    g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar3).resourceProvider;
                                                    oh.r5 r5Var2 = new oh.r5(context2, 0.0f, 1, g6Var2);
                                                    r5Var2.e = new gx(hxVar3, view, 0);
                                                    pyVar3.showDialog(r5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z11) {
                                    }
                                    q70Var.E();
                                    final int i282 = 1;
                                    q70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.dx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i282) {
                                                case 0:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    py pyVar2 = hxVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    hxVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                default:
                                                    hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10 && !pyVar.e4());
                                    q70Var.E();
                                    final int i292 = 2;
                                    q70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.dx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i292) {
                                                case 0:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    py pyVar2 = hxVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    hxVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                default:
                                                    hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10 && pyVar.e4());
                                    q70Var.E();
                                    final int i302 = 3;
                                    q70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.dx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2022;
                                            switch (i302) {
                                                case 0:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    py pyVar2 = hxVar.L0;
                                                    i2022 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                    break;
                                                case 4:
                                                    hxVar.L0.B0.j(j11);
                                                    break;
                                                case 5:
                                                    hxVar.L0.presentFragment(xn.R9(j11));
                                                    break;
                                                default:
                                                    hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10);
                                } else {
                                    j10 = 0;
                                }
                            }
                            pqVar = null;
                            pq pqVar22 = pqVar;
                            if (j11 < j10) {
                                final int i192 = 4;
                                pyVar.I0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new Runnable() { // from class: org.telegram.ui.dx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2022;
                                        switch (i192) {
                                            case 0:
                                                hxVar.L0.presentFragment(xn.R9(j11));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                py pyVar2 = hxVar.L0;
                                                i2022 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                                long j12 = j11;
                                                mediaDataController.removePeer(j12);
                                                pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                                break;
                                            case 4:
                                                hxVar.L0.B0.j(j11);
                                                break;
                                            case 5:
                                                hxVar.L0.presentFragment(xn.R9(j11));
                                                break;
                                            default:
                                                hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null) {
                                i18 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                }
                            }
                            z10 = false;
                            q70 q70Var222 = pyVar.I0;
                            final int i2022 = 5;
                            q70Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2022) {
                                        case 0:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            py pyVar2 = hxVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            hxVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        default:
                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            final int i2122 = 6;
                            q70Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2122) {
                                        case 0:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            py pyVar2 = hxVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            hxVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        default:
                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            if (j11 < j10) {
                            }
                            final int i2222 = 0;
                            q70Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2222) {
                                        case 0:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            py pyVar2 = hxVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            hxVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        default:
                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, j11 < j10);
                            final int i2322 = 0;
                            q70Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.ex
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2322;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    hx hxVar2 = hxVar;
                                    switch (i2622) {
                                        case 0:
                                            py pyVar2 = hxVar2.L0;
                                            i2422 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            pyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.qc.a0(pyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            py pyVar3 = hxVar2.L0;
                                            i2522 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            pyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.qc.a0(pyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c02 && j11 > j10);
                            q70Var222.E();
                            final int i2422 = 1;
                            q70Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.ex
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    String trim;
                                    int i2522;
                                    int i2622 = i2422;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    hx hxVar2 = hxVar;
                                    switch (i2622) {
                                        case 0:
                                            py pyVar2 = hxVar2.L0;
                                            i24222 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            pyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.qc.a0(pyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            py pyVar3 = hxVar2.L0;
                                            i2522 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            pyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.qc.a0(pyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c02 && j11 > j10);
                            q70Var222.E();
                            final int i2522 = 0;
                            q70Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.fx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.g6 g6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.g6 g6Var2;
                                    switch (i2522) {
                                        case 0:
                                            hx hxVar2 = hxVar;
                                            py pyVar2 = hxVar2.L0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof oh.o) {
                                                        pyVar2.B0.i((oh.o) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = hxVar2.getContext();
                                            g6Var = ((org.telegram.ui.ActionBar.p2) pyVar2).resourceProvider;
                                            oh.r5 r5Var = new oh.r5(context, 0.0f, 1, g6Var);
                                            r5Var.e = new gx(hxVar2, view2, 1);
                                            pyVar2.showDialog(r5Var);
                                            break;
                                        default:
                                            hx hxVar3 = hxVar;
                                            Context context2 = hxVar3.getContext();
                                            py pyVar3 = hxVar3.L0;
                                            g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar3).resourceProvider;
                                            oh.r5 r5Var2 = new oh.r5(context2, 0.0f, 1, g6Var2);
                                            r5Var2.e = new gx(hxVar3, view, 0);
                                            pyVar3.showDialog(r5Var2);
                                            break;
                                    }
                                }
                            }, premiumFeaturesBlocked && j11 > j10 && isPremium && J && !F);
                            q70Var222.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i2622 = R.drawable.msg_stories_stealth2;
                            String string22 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i2722 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.fx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.g6 g6Var;
                                    int i26222;
                                    org.telegram.ui.ActionBar.g6 g6Var2;
                                    switch (i2722) {
                                        case 0:
                                            hx hxVar2 = hxVar;
                                            py pyVar2 = hxVar2.L0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i26222 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof oh.o) {
                                                        pyVar2.B0.i((oh.o) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = hxVar2.getContext();
                                            g6Var = ((org.telegram.ui.ActionBar.p2) pyVar2).resourceProvider;
                                            oh.r5 r5Var = new oh.r5(context, 0.0f, 1, g6Var);
                                            r5Var.e = new gx(hxVar2, view2, 1);
                                            pyVar2.showDialog(r5Var);
                                            break;
                                        default:
                                            hx hxVar3 = hxVar;
                                            Context context2 = hxVar3.getContext();
                                            py pyVar3 = hxVar3.L0;
                                            g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar3).resourceProvider;
                                            oh.r5 r5Var2 = new oh.r5(context2, 0.0f, 1, g6Var2);
                                            r5Var2.e = new gx(hxVar3, view, 0);
                                            pyVar3.showDialog(r5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z11) {
                            }
                            q70Var.E();
                            final int i2822 = 1;
                            q70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2822) {
                                        case 0:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            py pyVar2 = hxVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            hxVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        default:
                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z10 && !pyVar.e4());
                            q70Var.E();
                            final int i2922 = 2;
                            q70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i2922) {
                                        case 0:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            py pyVar2 = hxVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            hxVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        default:
                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z10 && pyVar.e4());
                            q70Var.E();
                            final int i3022 = 3;
                            q70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.dx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i20222;
                                    switch (i3022) {
                                        case 0:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new dw(hxVar.L0, j11, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            py pyVar2 = hxVar.L0;
                                            i20222 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            pyVar2.getMessagesController().getStoriesController().i0(j12, true, false);
                                            break;
                                        case 4:
                                            hxVar.L0.B0.j(j11);
                                            break;
                                        case 5:
                                            hxVar.L0.presentFragment(xn.R9(j11));
                                            break;
                                        default:
                                            hxVar.L0.presentFragment(ProfileActivity.m4(j11));
                                            break;
                                    }
                                }
                            }, z10);
                        } else if (pyVar.L3) {
                            q70 q70Var3 = pyVar.I0;
                            int i31 = R.drawable.msg_stories_add;
                            String string3 = LocaleController.getString(R.string.AddStory);
                            int i32 = org.telegram.ui.ActionBar.k6.F8;
                            int i33 = org.telegram.ui.ActionBar.k6.E8;
                            final int i34 = 0;
                            q70Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.cx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i34) {
                                        case 0:
                                            hxVar.L0.B0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            py pyVar2 = hxVar.L0;
                                            i35 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            pyVar2.presentFragment(new org.telegram.ui.Components.fa0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            py pyVar3 = hxVar.L0;
                                            i36 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            pyVar3.presentFragment(new org.telegram.ui.Components.fa0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 1;
                            pyVar.I0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.cx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i36;
                                    switch (i35) {
                                        case 0:
                                            hxVar.L0.B0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            py pyVar2 = hxVar.L0;
                                            i352 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            pyVar2.presentFragment(new org.telegram.ui.Components.fa0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            py pyVar3 = hxVar.L0;
                                            i36 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            pyVar3.presentFragment(new org.telegram.ui.Components.fa0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i36 = 2;
                            pyVar.I0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.cx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i352;
                                    int i362;
                                    switch (i36) {
                                        case 0:
                                            hxVar.L0.B0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            py pyVar2 = hxVar.L0;
                                            i352 = ((org.telegram.ui.ActionBar.p2) pyVar2).currentAccount;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            pyVar2.presentFragment(new org.telegram.ui.Components.fa0(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            py pyVar3 = hxVar.L0;
                                            i362 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            pyVar3.presentFragment(new org.telegram.ui.Components.fa0(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z4 = false;
                        } else {
                            hx hxVar2 = pyVar.B0;
                            if (hxVar2 != null) {
                                hxVar2.n();
                            }
                        }
                        q70 q70Var4 = pyVar.I0;
                        q70Var4.i = 3;
                        q70Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        q70Var4.Z();
                        return z4;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            case 22:
                nr0 nr0Var = ((ph.l) this.b).T;
                if (nr0Var.D.z1 || !(view instanceof org.telegram.ui.Cells.r7)) {
                    return false;
                }
                MessageObject messageObject = ((org.telegram.ui.Cells.r7) view).getMessageObject();
                if (nr0Var.c(messageObject)) {
                    nr0Var.g(messageObject);
                } else {
                    nr0Var.e(messageObject);
                }
                return true;
            default:
                qh.z2 z2Var = (qh.z2) this.b;
                ArrayList arrayList = z2Var.V;
                ArrayList arrayList2 = z2Var.e0;
                if (i10 >= 2 && z2Var.T != null && (view instanceof qh.w2)) {
                    int i37 = i10 - 2;
                    if (!z2Var.W) {
                        if (z2Var.a0) {
                            if (i37 < 0 || i37 >= arrayList.size()) {
                                i37 -= arrayList.size();
                            }
                        }
                        if (i37 >= 0) {
                            photoEntry = (MediaController.PhotoEntry) z2Var.c0.get(i37);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(photoEntry)) {
                                }
                                AndroidUtilities.updateVisibleRows(z2Var.d);
                                z2Var.j();
                                return true;
                            }
                        }
                    } else if (i37 != 0) {
                        i37 = i10 - 3;
                        if (i37 >= 0 && i37 < z2Var.c0.size()) {
                            photoEntry = (MediaController.PhotoEntry) z2Var.c0.get(i37);
                            if (arrayList2.isEmpty() && !z2Var.N) {
                                if (!arrayList2.contains(photoEntry)) {
                                    arrayList2.remove(photoEntry);
                                } else {
                                    if (arrayList2.size() + 1 > z2Var.O) {
                                        int i38 = -z2Var.K;
                                        z2Var.K = i38;
                                        AndroidUtilities.shakeViewSpring(view, i38);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        return true;
                                    }
                                    arrayList2.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(z2Var.d);
                                z2Var.j();
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }

    @Override // oh.c9
    public void g(float f10, Canvas canvas, RectF rectF, boolean z4) {
        Path path = (Path) this.b;
        if (z4) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 9:
                ((Runnable) this.b).run();
                break;
            case 20:
                ((org.telegram.ui.web.z) this.b).run();
                break;
            case 23:
                qh.ba baVar = ((qh.q9) ((qh.p) this.b)).P1;
                qh.p9 p9Var = baVar.U0;
                if (p9Var != null) {
                    p9Var.s(null, null, true);
                }
                qh.e9 e9Var = baVar.s1;
                if (e9Var != null) {
                    e9Var.q0();
                }
                qh.q9 q9Var = baVar.Z0;
                if (q9Var != null) {
                    q9Var.setHasRoundVideo(false);
                }
                qh.r6 r6Var = baVar.H1;
                if (r6Var != null) {
                    File file = r6Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        baVar.H1.o0 = null;
                    }
                    if (baVar.H1.p0 != null) {
                        try {
                            new File(baVar.H1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        baVar.H1.p0 = null;
                        break;
                    }
                }
                break;
            default:
                ((qh.q4) this.b).a.m2.r();
                break;
        }
    }

    @Override // jh.o
    public void o(jh.k kVar, float f10, float f11) {
        oh.y7 y7Var = (oh.y7) this.b;
        if (y7Var.v.x) {
            return;
        }
        kVar.q = new oh.x7(y7Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = y7Var.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((jh.k) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        qh.x8 x8Var = (qh.x8) this.b;
        qh.ba baVar = x8Var.a;
        qh.q5 q5Var = baVar.L0;
        int i10 = baVar.c;
        if (q5Var != null) {
            q5Var.g(true);
        }
        if (baVar.q0()) {
            baVar.s.d();
        }
        if (baVar.D1 == null || baVar.y0 == null) {
            return;
        }
        baVar.N1 = false;
        baVar.O1 = false;
        qh.m5 m5Var = baVar.z0;
        if (m5Var != null) {
            m5Var.c(false);
        }
        if (j10 <= 800) {
            baVar.h(false, true);
            baVar.d0(false);
            baVar.G0.b(false, true);
            qh.q5 q5Var2 = baVar.L0;
            if (q5Var2 != null) {
                q5Var2.g(true);
            }
            try {
                baVar.D1.delete();
                baVar.D1 = null;
            } catch (Exception e6) {
                FileLog.e(e6);
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
        baVar.i0(false, true);
        qh.r6 o10 = qh.r6.o(baVar.D1, str, j10);
        o10.J0 = baVar.s0;
        o10.K0 = baVar.t0;
        o10.B();
        baVar.h(false, true);
        baVar.d0(false);
        baVar.G0.b(false, true);
        qh.q5 q5Var3 = baVar.L0;
        if (q5Var3 != null) {
            q5Var3.g(true);
        }
        if (!baVar.x0.j()) {
            baVar.H1 = o10;
            qh.e8.a(i10, o10);
            baVar.I1 = false;
            int videoWidth = baVar.y0.getVideoWidth();
            int videoHeight = baVar.y0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                qh.r6 r6Var = baVar.H1;
                r6Var.k0 = videoWidth;
                r6Var.l0 = videoHeight;
                r6Var.A();
            }
            baVar.L(new qh.v8(x8Var, 3), 0L);
            return;
        }
        baVar.D1 = null;
        o10.P = 1.0f;
        if (baVar.x0.l(o10)) {
            qh.r6 a2 = qh.r6.a(baVar.x0.getLayout(), baVar.x0.getContent());
            baVar.H1 = a2;
            qh.e8.a(i10, a2);
            baVar.I1 = false;
            int videoWidth2 = baVar.y0.getVideoWidth();
            int videoHeight2 = baVar.y0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                qh.r6 r6Var2 = baVar.H1;
                r6Var2.k0 = videoWidth2;
                r6Var2.l0 = videoHeight2;
                r6Var2.A();
            }
        }
        baVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                t7.b((t7) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            case 4:
                ga gaVar = (ga) this.b;
                h51 h51Var = (h51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                gaVar.getClass();
                if (h51Var.G instanceof TL_stars.StarsTransaction) {
                    ja.h1(gaVar.getContext(), false, 0L, gaVar.c, (TL_stars.StarsTransaction) h51Var.G, gaVar.b);
                    break;
                }
                break;
            default:
                qh.t8 t8Var = (qh.t8) this.b;
                h51 h51Var2 = (h51) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = h51Var2.d;
                qh.r6 r6Var = (qh.r6) h51Var2.G;
                t8Var.c(false, true);
                qh.ba baVar = t8Var.L;
                if (r6Var != baVar.H1 && !baVar.U1) {
                    baVar.a1.setSelected(i10);
                    baVar.U1 = true;
                    qh.d8 d8Var = new qh.d8(baVar, i10, 1);
                    qh.e9 e9Var = baVar.s1;
                    qh.r6 r6Var2 = baVar.H1;
                    if (e9Var != null && r6Var2 != null) {
                        if (!e9Var.u0()) {
                            d8Var.run();
                            break;
                        } else {
                            r6Var2.f();
                            boolean u02 = e9Var.u0();
                            boolean z4 = e9Var.L0.getPainting().E;
                            Utilities.searchQueue.postRunnable(new qh.i8(baVar, e9Var, r6Var2.i0, r6Var2.j0, r6Var2, z4, u02, d8Var, 0));
                            break;
                        }
                    } else {
                        d8Var.run();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                return oh.v0.a((oh.v0) this.b, (Long) obj2);
            default:
                nr0 nr0Var = (nr0) this.b;
                if (((Integer) obj).intValue() == -1) {
                    new ph.o(nr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new org.telegram.ui.web.d1(nr0Var, 2)).show();
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
        AndroidUtilities.runOnUIThread(new q51(7, uVar, bitmap));
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
