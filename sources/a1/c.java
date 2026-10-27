package a1;

import a4.l;
import ag.s;
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
import bb.e0;
import bb.f0;
import bi.ad;
import bi.ca;
import bi.dd;
import bi.g1;
import bi.j7;
import bi.lc;
import bi.q6;
import bi.x;
import bi.y;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.w;
import com.google.firebase.messaging.z;
import di.h1;
import di.m2;
import di.m8;
import di.m9;
import di.n8;
import di.n9;
import di.p7;
import di.q;
import di.s5;
import di.s9;
import di.u;
import di.u0;
import di.w0;
import di.x0;
import di.y9;
import h2.i;
import h2.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.u61;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.ey;
import org.telegram.ui.qo0;
import org.telegram.ui.sw;
import r0.k1;
import r0.n;
import s4.m0;
import xh.k;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, i, j5.e, Utilities.Callback5, e5, b2, s, oe.d, qo0, Continuation, OnCompleteListener, cm0, Utilities.Callback2Return, bm0, p7, s9, k, n {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        View view = ((j7) this.b).b;
        if (view instanceof v0) {
            ((v0) view).M();
        } else {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        g1 g1Var = (g1) this.b;
        if (z10) {
            long j10 = i10;
            if (g1Var.I != j10) {
                g1Var.I = j10;
                g1Var.r.setText(g1.o(j10));
            }
            g1Var.n(true);
        }
    }

    @Override // r0.n
    public k1 P0(View view, k1 k1Var) {
        y9 y9Var = (y9) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) y9Var.v.getLayoutParams();
        marginLayoutParams.topMargin = y9Var.c ? 0 : k1Var.d();
        marginLayoutParams.bottomMargin = y9Var.c ? k1Var.a.f(2).d : k1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.a;
        marginLayoutParams.rightMargin = defaultWindowInsets.c;
        m9 m9Var = y9Var.s;
        if (m9Var != null) {
            m9Var.requestLayout();
        }
        n9 n9Var = y9Var.v;
        if (n9Var != null) {
            n9Var.requestLayout();
        }
        return k1.b;
    }

    @Override // org.telegram.ui.qo0
    public void a(int i10) {
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
                r1 r1Var = (r1) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        r1Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    r1Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                lc lcVar = (lc) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        lcVar.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    lcVar.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // j5.e
    public Object apply(Object obj) {
        ((l) this.b).getClass();
        String c10 = f0.b.c((e0) obj);
        kotlin.jvm.internal.i.d(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(c10));
        byte[] bytes = c10.getBytes(ae.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // di.p7
    public void b(boolean z10) {
        s5 s5Var = (s5) this.b;
        if (s5Var != null) {
            s5Var.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0212  */
    @Override // org.telegram.ui.Components.cm0
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
        boolean z10;
        long j10;
        ar arVar;
        boolean z11;
        boolean z12;
        l80 l80Var;
        int i18;
        final sw swVar = (sw) this.b;
        if (swVar.N == 0.0f && swVar.n0 == 0.0f) {
            final long j11 = ((q) view).E;
            ey eyVar = swVar.O0;
            i11 = ((r2) eyVar).currentAccount;
            MediaDataController.getInstance(i11).loadHints(true);
            l80 H = l80.H(eyVar, view);
            H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
            H.W(y6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), eyVar.getThemedColor(y6.d6)));
            H.a0(0.0f, AndroidUtilities.dp(8.0f));
            eyVar.L0 = H;
            if (!UserObject.isService(j11)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i12 = ((r2) eyVar).currentAccount;
                if (j11 != UserConfig.getInstance(i12).getClientUserId()) {
                    final TLRPC.User user = eyVar.getMessagesController().getUser(Long.valueOf(j11));
                    TLRPC.Chat chat = eyVar.getMessagesController().getChat(Long.valueOf(-j11));
                    final String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, 0L);
                    i13 = ((r2) eyVar).currentAccount;
                    boolean d02 = NotificationsCustomSettingsActivity.d0(i13, j11);
                    i14 = ((r2) eyVar).currentAccount;
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                    i15 = ((r2) eyVar).currentAccount;
                    boolean isPremium = UserConfig.getInstance(i15).isPremium();
                    i16 = ((r2) eyVar).currentAccount;
                    boolean L = MessagesController.getInstance(i16).getStoriesController().L(j11);
                    i17 = ((r2) eyVar).currentAccount;
                    boolean H2 = MessagesController.getInstance(i17).getStoriesController().H(j11);
                    if (premiumFeaturesBlocked || j11 <= 0 || isPremium) {
                        z10 = false;
                    } else {
                        z10 = false;
                        Drawable drawable = swVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                        if (drawable != null) {
                            Drawable drawable2 = swVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                            if (drawable2 != null) {
                                j10 = 0;
                                f7.y(swVar, drawable2, y6.F8, eyVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            } else {
                                j10 = 0;
                            }
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                            arVar = new ar(drawable2, drawable);
                            ar arVar2 = arVar;
                            if (j11 < j10 && eyVar.f4().j(j11)) {
                                final int i19 = 4;
                                eyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), y6.F8, y6.E8, new Runnable() { // from class: org.telegram.ui.ow
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i20;
                                        switch (i19) {
                                            case 0:
                                                swVar.O0.presentFragment(wn.ea(j11));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                break;
                                            case 3:
                                                ey eyVar2 = swVar.O0;
                                                i20 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                long j12 = j11;
                                                mediaDataController.removePeer(j12);
                                                eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                                break;
                                            case 4:
                                                swVar.O0.E0.j(j11);
                                                break;
                                            case 5:
                                                swVar.O0.presentFragment(wn.ea(j11));
                                                break;
                                            default:
                                                swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null && !user.contact) {
                                i18 = ((r2) eyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                                    z11 = true;
                                    l80 l80Var2 = eyVar.L0;
                                    final int i20 = 5;
                                    l80Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.ow
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i20) {
                                                case 0:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ey eyVar2 = swVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    swVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                default:
                                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10 ? true : z10);
                                    final int i21 = 6;
                                    l80Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.ow
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i21) {
                                                case 0:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ey eyVar2 = swVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    swVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                default:
                                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10 ? true : z10);
                                    final int i22 = 0;
                                    l80Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.ow
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i22) {
                                                case 0:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ey eyVar2 = swVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    swVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                default:
                                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 < j10 ? true : z10);
                                    final int i23 = 0;
                                    l80Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.pw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i24;
                                            String trim;
                                            int i25;
                                            int i26 = i23;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            sw swVar2 = swVar;
                                            switch (i26) {
                                                case 0:
                                                    ey eyVar2 = swVar2.O0;
                                                    i24 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    eyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.wc.b0(eyVar2).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    ey eyVar3 = swVar2.O0;
                                                    i25 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    eyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.wc.b0(eyVar3).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, (d02 || j11 <= j10) ? z10 : true);
                                    l80Var2.E();
                                    final int i24 = 1;
                                    l80Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.pw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i25;
                                            int i26 = i24;
                                            TLRPC.User user2 = user;
                                            long j12 = j11;
                                            String str = sharedPrefKey;
                                            sw swVar2 = swVar;
                                            switch (i26) {
                                                case 0:
                                                    ey eyVar2 = swVar2.O0;
                                                    i242 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    eyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.wc.b0(eyVar2).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    ey eyVar3 = swVar2.O0;
                                                    i25 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    eyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.wc.b0(eyVar3).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, (!d02 || j11 <= j10) ? z10 : true);
                                    l80Var2.E();
                                    final int i25 = 0;
                                    l80Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.qw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.u6 u6Var;
                                            int i26;
                                            org.telegram.ui.ActionBar.u6 u6Var2;
                                            switch (i25) {
                                                case 0:
                                                    sw swVar2 = swVar;
                                                    ey eyVar2 = swVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i26 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof di.q) {
                                                                eyVar2.E0.i((di.q) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = swVar2.getContext();
                                                    u6Var = ((org.telegram.ui.ActionBar.r2) eyVar2).resourceProvider;
                                                    di.f6 f6Var = new di.f6(context, 0.0f, 1, u6Var);
                                                    f6Var.e = new rw(swVar2, view2, 1);
                                                    eyVar2.showDialog(f6Var);
                                                    break;
                                                default:
                                                    sw swVar3 = swVar;
                                                    Context context2 = swVar3.getContext();
                                                    ey eyVar3 = swVar3.O0;
                                                    u6Var2 = ((org.telegram.ui.ActionBar.r2) eyVar3).resourceProvider;
                                                    di.f6 f6Var2 = new di.f6(context2, 0.0f, 1, u6Var2);
                                                    f6Var2.e = new rw(swVar3, view, 0);
                                                    eyVar3.showDialog(f6Var2);
                                                    break;
                                            }
                                        }
                                    }, (premiumFeaturesBlocked && j11 > j10 && isPremium && L && !H2) ? true : z10);
                                    l80Var2.E();
                                    z12 = (!premiumFeaturesBlocked || j11 <= j10 || isPremium || !L || H2) ? z10 : true;
                                    int i26 = R.drawable.msg_stories_stealth2;
                                    String string = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i27 = 1;
                                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.qw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.u6 u6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.u6 u6Var2;
                                            switch (i27) {
                                                case 0:
                                                    sw swVar2 = swVar;
                                                    ey eyVar2 = swVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof di.q) {
                                                                eyVar2.E0.i((di.q) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = swVar2.getContext();
                                                    u6Var = ((org.telegram.ui.ActionBar.r2) eyVar2).resourceProvider;
                                                    di.f6 f6Var = new di.f6(context, 0.0f, 1, u6Var);
                                                    f6Var.e = new rw(swVar2, view2, 1);
                                                    eyVar2.showDialog(f6Var);
                                                    break;
                                                default:
                                                    sw swVar3 = swVar;
                                                    Context context2 = swVar3.getContext();
                                                    ey eyVar3 = swVar3.O0;
                                                    u6Var2 = ((org.telegram.ui.ActionBar.r2) eyVar3).resourceProvider;
                                                    di.f6 f6Var2 = new di.f6(context2, 0.0f, 1, u6Var2);
                                                    f6Var2.e = new rw(swVar3, view, 0);
                                                    eyVar3.showDialog(f6Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                        l80Var2.b(i26, arVar2, string, y6.F8, y6.E8, runnable);
                                        l80Var = l80Var2;
                                    } else {
                                        l80Var = l80Var2;
                                    }
                                    l80Var.E();
                                    final int i28 = 1;
                                    l80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.ow
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i28) {
                                                case 0:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ey eyVar2 = swVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    swVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                default:
                                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                                    break;
                                            }
                                        }
                                    }, (!z11 || eyVar.m4()) ? z10 : true);
                                    l80Var.E();
                                    final int i29 = 2;
                                    l80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.ow
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i29) {
                                                case 0:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ey eyVar2 = swVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    swVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                default:
                                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                                    break;
                                            }
                                        }
                                    }, (z11 && eyVar.m4()) ? true : z10);
                                    l80Var.E();
                                    final int i30 = 3;
                                    l80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.ow
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i30) {
                                                case 0:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ey eyVar2 = swVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j12 = j11;
                                                    mediaDataController.removePeer(j12);
                                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    swVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    swVar.O0.presentFragment(wn.ea(j11));
                                                    break;
                                                default:
                                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                                    break;
                                            }
                                        }
                                    }, z11);
                                }
                            }
                            z11 = z10;
                            l80 l80Var22 = eyVar.L0;
                            final int i202 = 5;
                            l80Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.ow
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i202) {
                                        case 0:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 3:
                                            ey eyVar2 = swVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                            break;
                                        case 4:
                                            swVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        default:
                                            swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10 ? true : z10);
                            final int i212 = 6;
                            l80Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.ow
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i212) {
                                        case 0:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 3:
                                            ey eyVar2 = swVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                            break;
                                        case 4:
                                            swVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        default:
                                            swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10 ? true : z10);
                            if (j11 < j10) {
                            }
                            final int i222 = 0;
                            l80Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.ow
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i222) {
                                        case 0:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 3:
                                            ey eyVar2 = swVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                            break;
                                        case 4:
                                            swVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        default:
                                            swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                            break;
                                    }
                                }
                            }, j11 < j10 ? true : z10);
                            final int i232 = 0;
                            l80Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.pw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i242;
                                    String trim;
                                    int i252;
                                    int i262 = i232;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    sw swVar2 = swVar;
                                    switch (i262) {
                                        case 0:
                                            ey eyVar2 = swVar2.O0;
                                            i242 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            eyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.wc.b0(eyVar2).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            ey eyVar3 = swVar2.O0;
                                            i252 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            eyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.wc.b0(eyVar3).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, (d02 || j11 <= j10) ? z10 : true);
                            l80Var22.E();
                            final int i242 = 1;
                            l80Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.pw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i252;
                                    int i262 = i242;
                                    TLRPC.User user2 = user;
                                    long j12 = j11;
                                    String str = sharedPrefKey;
                                    sw swVar2 = swVar;
                                    switch (i262) {
                                        case 0:
                                            ey eyVar2 = swVar2.O0;
                                            i2422 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            eyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.wc.b0(eyVar2).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            ey eyVar3 = swVar2.O0;
                                            i252 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            eyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.wc.b0(eyVar3).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, (!d02 || j11 <= j10) ? z10 : true);
                            l80Var22.E();
                            final int i252 = 0;
                            l80Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.u6 u6Var;
                                    int i262;
                                    org.telegram.ui.ActionBar.u6 u6Var2;
                                    switch (i252) {
                                        case 0:
                                            sw swVar2 = swVar;
                                            ey eyVar2 = swVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i262 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof di.q) {
                                                        eyVar2.E0.i((di.q) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = swVar2.getContext();
                                            u6Var = ((org.telegram.ui.ActionBar.r2) eyVar2).resourceProvider;
                                            di.f6 f6Var = new di.f6(context, 0.0f, 1, u6Var);
                                            f6Var.e = new rw(swVar2, view2, 1);
                                            eyVar2.showDialog(f6Var);
                                            break;
                                        default:
                                            sw swVar3 = swVar;
                                            Context context2 = swVar3.getContext();
                                            ey eyVar3 = swVar3.O0;
                                            u6Var2 = ((org.telegram.ui.ActionBar.r2) eyVar3).resourceProvider;
                                            di.f6 f6Var2 = new di.f6(context2, 0.0f, 1, u6Var2);
                                            f6Var2.e = new rw(swVar3, view, 0);
                                            eyVar3.showDialog(f6Var2);
                                            break;
                                    }
                                }
                            }, (premiumFeaturesBlocked && j11 > j10 && isPremium && L && !H2) ? true : z10);
                            l80Var22.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i262 = R.drawable.msg_stories_stealth2;
                            String string2 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i272 = 1;
                            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.u6 u6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.u6 u6Var2;
                                    switch (i272) {
                                        case 0:
                                            sw swVar2 = swVar;
                                            ey eyVar2 = swVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof di.q) {
                                                        eyVar2.E0.i((di.q) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = swVar2.getContext();
                                            u6Var = ((org.telegram.ui.ActionBar.r2) eyVar2).resourceProvider;
                                            di.f6 f6Var = new di.f6(context, 0.0f, 1, u6Var);
                                            f6Var.e = new rw(swVar2, view2, 1);
                                            eyVar2.showDialog(f6Var);
                                            break;
                                        default:
                                            sw swVar3 = swVar;
                                            Context context2 = swVar3.getContext();
                                            ey eyVar3 = swVar3.O0;
                                            u6Var2 = ((org.telegram.ui.ActionBar.r2) eyVar3).resourceProvider;
                                            di.f6 f6Var2 = new di.f6(context2, 0.0f, 1, u6Var2);
                                            f6Var2.e = new rw(swVar3, view, 0);
                                            eyVar3.showDialog(f6Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            l80Var.E();
                            final int i282 = 1;
                            l80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.ow
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i282) {
                                        case 0:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 3:
                                            ey eyVar2 = swVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                            break;
                                        case 4:
                                            swVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        default:
                                            swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                            break;
                                    }
                                }
                            }, (!z11 || eyVar.m4()) ? z10 : true);
                            l80Var.E();
                            final int i292 = 2;
                            l80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.ow
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i292) {
                                        case 0:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 3:
                                            ey eyVar2 = swVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                            break;
                                        case 4:
                                            swVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        default:
                                            swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                            break;
                                    }
                                }
                            }, (z11 && eyVar.m4()) ? true : z10);
                            l80Var.E();
                            final int i302 = 3;
                            l80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.ow
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i302) {
                                        case 0:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                            break;
                                        case 3:
                                            ey eyVar2 = swVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j12 = j11;
                                            mediaDataController.removePeer(j12);
                                            eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                            break;
                                        case 4:
                                            swVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            swVar.O0.presentFragment(wn.ea(j11));
                                            break;
                                        default:
                                            swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                            break;
                                    }
                                }
                            }, z11);
                        }
                    }
                    j10 = 0;
                    arVar = null;
                    ar arVar22 = arVar;
                    if (j11 < j10) {
                        final int i192 = 4;
                        eyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), y6.F8, y6.E8, new Runnable() { // from class: org.telegram.ui.ow
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2022;
                                switch (i192) {
                                    case 0:
                                        swVar.O0.presentFragment(wn.ea(j11));
                                        break;
                                    case 1:
                                        AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                        break;
                                    case 2:
                                        AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                        break;
                                    case 3:
                                        ey eyVar2 = swVar.O0;
                                        i2022 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                        MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                        long j12 = j11;
                                        mediaDataController.removePeer(j12);
                                        eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                        break;
                                    case 4:
                                        swVar.O0.E0.j(j11);
                                        break;
                                    case 5:
                                        swVar.O0.presentFragment(wn.ea(j11));
                                        break;
                                    default:
                                        swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                        break;
                                }
                            }
                        });
                    }
                    if (user != null) {
                        i18 = ((r2) eyVar).currentAccount;
                        if (MediaDataController.getInstance(i18).containsTopPeer(j11)) {
                        }
                    }
                    z11 = z10;
                    l80 l80Var222 = eyVar.L0;
                    final int i2022 = 5;
                    l80Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.ow
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2022) {
                                case 0:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 3:
                                    ey eyVar2 = swVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j12 = j11;
                                    mediaDataController.removePeer(j12);
                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                    break;
                                case 4:
                                    swVar.O0.E0.j(j11);
                                    break;
                                case 5:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                default:
                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                    break;
                            }
                        }
                    }, j11 > j10 ? true : z10);
                    final int i2122 = 6;
                    l80Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.ow
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2122) {
                                case 0:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 3:
                                    ey eyVar2 = swVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j12 = j11;
                                    mediaDataController.removePeer(j12);
                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                    break;
                                case 4:
                                    swVar.O0.E0.j(j11);
                                    break;
                                case 5:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                default:
                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                    break;
                            }
                        }
                    }, j11 > j10 ? true : z10);
                    if (j11 < j10) {
                    }
                    final int i2222 = 0;
                    l80Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.ow
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2222) {
                                case 0:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 3:
                                    ey eyVar2 = swVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j12 = j11;
                                    mediaDataController.removePeer(j12);
                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                    break;
                                case 4:
                                    swVar.O0.E0.j(j11);
                                    break;
                                case 5:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                default:
                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                    break;
                            }
                        }
                    }, j11 < j10 ? true : z10);
                    final int i2322 = 0;
                    l80Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.pw
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2422;
                            String trim;
                            int i2522;
                            int i2622 = i2322;
                            TLRPC.User user2 = user;
                            long j12 = j11;
                            String str = sharedPrefKey;
                            sw swVar2 = swVar;
                            switch (i2622) {
                                case 0:
                                    ey eyVar2 = swVar2.O0;
                                    i2422 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                    eyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                    trim = user2 != null ? user2.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    org.telegram.ui.Components.wc.b0(eyVar2).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                    break;
                                default:
                                    ey eyVar3 = swVar2.O0;
                                    i2522 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                    MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                    eyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                    trim = user2 != null ? user2.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    org.telegram.ui.Components.wc.b0(eyVar3).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, (d02 || j11 <= j10) ? z10 : true);
                    l80Var222.E();
                    final int i2422 = 1;
                    l80Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.pw
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i24222;
                            String trim;
                            int i2522;
                            int i2622 = i2422;
                            TLRPC.User user2 = user;
                            long j12 = j11;
                            String str = sharedPrefKey;
                            sw swVar2 = swVar;
                            switch (i2622) {
                                case 0:
                                    ey eyVar2 = swVar2.O0;
                                    i24222 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                    eyVar2.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                    trim = user2 != null ? user2.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    org.telegram.ui.Components.wc.b0(eyVar2).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                    break;
                                default:
                                    ey eyVar3 = swVar2.O0;
                                    i2522 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                    MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                    eyVar3.getNotificationsController().updateServerNotificationsSettings(j12, 0L);
                                    trim = user2 != null ? user2.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    org.telegram.ui.Components.wc.b0(eyVar3).W(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, (!d02 || j11 <= j10) ? z10 : true);
                    l80Var222.E();
                    final int i2522 = 0;
                    l80Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.qw
                        @Override // java.lang.Runnable
                        public final void run() {
                            org.telegram.ui.ActionBar.u6 u6Var;
                            int i2622;
                            org.telegram.ui.ActionBar.u6 u6Var2;
                            switch (i2522) {
                                case 0:
                                    sw swVar2 = swVar;
                                    ey eyVar2 = swVar2.O0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                    View view2 = view;
                                    if (tL_storiesStealthMode != null) {
                                        i2622 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof di.q) {
                                                eyVar2.E0.i((di.q) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = swVar2.getContext();
                                    u6Var = ((org.telegram.ui.ActionBar.r2) eyVar2).resourceProvider;
                                    di.f6 f6Var = new di.f6(context, 0.0f, 1, u6Var);
                                    f6Var.e = new rw(swVar2, view2, 1);
                                    eyVar2.showDialog(f6Var);
                                    break;
                                default:
                                    sw swVar3 = swVar;
                                    Context context2 = swVar3.getContext();
                                    ey eyVar3 = swVar3.O0;
                                    u6Var2 = ((org.telegram.ui.ActionBar.r2) eyVar3).resourceProvider;
                                    di.f6 f6Var2 = new di.f6(context2, 0.0f, 1, u6Var2);
                                    f6Var2.e = new rw(swVar3, view, 0);
                                    eyVar3.showDialog(f6Var2);
                                    break;
                            }
                        }
                    }, (premiumFeaturesBlocked && j11 > j10 && isPremium && L && !H2) ? true : z10);
                    l80Var222.E();
                    if (premiumFeaturesBlocked) {
                    }
                    int i2622 = R.drawable.msg_stories_stealth2;
                    String string22 = LocaleController.getString(R.string.ViewAnonymously);
                    final int i2722 = 1;
                    Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.qw
                        @Override // java.lang.Runnable
                        public final void run() {
                            org.telegram.ui.ActionBar.u6 u6Var;
                            int i26222;
                            org.telegram.ui.ActionBar.u6 u6Var2;
                            switch (i2722) {
                                case 0:
                                    sw swVar2 = swVar;
                                    ey eyVar2 = swVar2.O0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                    View view2 = view;
                                    if (tL_storiesStealthMode != null) {
                                        i26222 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                        if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof di.q) {
                                                eyVar2.E0.i((di.q) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = swVar2.getContext();
                                    u6Var = ((org.telegram.ui.ActionBar.r2) eyVar2).resourceProvider;
                                    di.f6 f6Var = new di.f6(context, 0.0f, 1, u6Var);
                                    f6Var.e = new rw(swVar2, view2, 1);
                                    eyVar2.showDialog(f6Var);
                                    break;
                                default:
                                    sw swVar3 = swVar;
                                    Context context2 = swVar3.getContext();
                                    ey eyVar3 = swVar3.O0;
                                    u6Var2 = ((org.telegram.ui.ActionBar.r2) eyVar3).resourceProvider;
                                    di.f6 f6Var2 = new di.f6(context2, 0.0f, 1, u6Var2);
                                    f6Var2.e = new rw(swVar3, view, 0);
                                    eyVar3.showDialog(f6Var2);
                                    break;
                            }
                        }
                    };
                    if (z12) {
                    }
                    l80Var.E();
                    final int i2822 = 1;
                    l80Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.ow
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2822) {
                                case 0:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 3:
                                    ey eyVar2 = swVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j12 = j11;
                                    mediaDataController.removePeer(j12);
                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                    break;
                                case 4:
                                    swVar.O0.E0.j(j11);
                                    break;
                                case 5:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                default:
                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                    break;
                            }
                        }
                    }, (!z11 || eyVar.m4()) ? z10 : true);
                    l80Var.E();
                    final int i2922 = 2;
                    l80Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.ow
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2922) {
                                case 0:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 3:
                                    ey eyVar2 = swVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j12 = j11;
                                    mediaDataController.removePeer(j12);
                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                    break;
                                case 4:
                                    swVar.O0.E0.j(j11);
                                    break;
                                case 5:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                default:
                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                    break;
                            }
                        }
                    }, (z11 && eyVar.m4()) ? true : z10);
                    l80Var.E();
                    final int i3022 = 3;
                    l80Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.ow
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i3022) {
                                case 0:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new tv(swVar.O0, j11, !r2.m4(), 0), 200L);
                                    break;
                                case 3:
                                    ey eyVar2 = swVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j12 = j11;
                                    mediaDataController.removePeer(j12);
                                    eyVar2.getMessagesController().getStoriesController().l0(j12, true, false);
                                    break;
                                case 4:
                                    swVar.O0.E0.j(j11);
                                    break;
                                case 5:
                                    swVar.O0.presentFragment(wn.ea(j11));
                                    break;
                                default:
                                    swVar.O0.presentFragment(ProfileActivity.t4(j11));
                                    break;
                            }
                        }
                    }, z11);
                } else if (eyVar.O3) {
                    l80 l80Var3 = eyVar.L0;
                    int i31 = R.drawable.msg_stories_add;
                    String string3 = LocaleController.getString(R.string.AddStory);
                    int i32 = y6.F8;
                    int i33 = y6.E8;
                    final int i34 = 0;
                    l80Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.nw
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i35;
                            int i36;
                            switch (i34) {
                                case 0:
                                    swVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    ey eyVar2 = swVar.O0;
                                    i35 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    eyVar2.presentFragment(new org.telegram.ui.Components.ua0(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    ey eyVar3 = swVar.O0;
                                    i36 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                    bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    eyVar3.presentFragment(new org.telegram.ui.Components.ua0(bundle2, null));
                                    break;
                            }
                        }
                    });
                    final int i35 = 1;
                    eyVar.L0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.nw
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i352;
                            int i36;
                            switch (i35) {
                                case 0:
                                    swVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    ey eyVar2 = swVar.O0;
                                    i352 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    eyVar2.presentFragment(new org.telegram.ui.Components.ua0(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    ey eyVar3 = swVar.O0;
                                    i36 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                    bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    eyVar3.presentFragment(new org.telegram.ui.Components.ua0(bundle2, null));
                                    break;
                            }
                        }
                    });
                    final int i36 = 2;
                    eyVar.L0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.nw
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i352;
                            int i362;
                            switch (i36) {
                                case 0:
                                    swVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    ey eyVar2 = swVar.O0;
                                    i352 = ((org.telegram.ui.ActionBar.r2) eyVar2).currentAccount;
                                    bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    eyVar2.presentFragment(new org.telegram.ui.Components.ua0(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    ey eyVar3 = swVar.O0;
                                    i362 = ((org.telegram.ui.ActionBar.r2) eyVar3).currentAccount;
                                    bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    eyVar3.presentFragment(new org.telegram.ui.Components.ua0(bundle2, null));
                                    break;
                            }
                        }
                    });
                    z10 = false;
                } else {
                    sw swVar2 = eyVar.E0;
                    if (swVar2 != null) {
                        swVar2.n();
                    }
                }
                l80 l80Var4 = eyVar.L0;
                l80Var4.i = 3;
                l80Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                l80Var4.Z();
                return z10;
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // di.s9
    public void d(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        long j10;
        int i11;
        int i12;
        int i13;
        m2 m2Var = (m2) this.b;
        bi.r1 r1Var = m2Var.c;
        ArrayList arrayList = m2Var.r;
        w0 w0Var = ((u0) view).f;
        int i14 = m2Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= w0Var.f.size()) {
                break;
            }
            di.v0 v0Var = (di.v0) w0Var.f.get(i16);
            long j11 = v0Var.g;
            if (j11 > 0 && currentTime - v0Var.d <= u.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(v0Var.a));
            }
            i16++;
        }
        h1 h1Var = m2Var.P;
        long j12 = h1Var != null ? h1Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            di.v0 v0Var2 = (di.v0) arrayList.get(i17);
            if (v0Var2.b || !v0Var2.e || v0Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(v0Var2.a))) {
                    j10 = j12;
                    if (m2Var.w != w0Var.b || (i13 = m2Var.x) == 0 || v0Var2.a < i13) {
                        i11 = v0Var2.a;
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
                di.v0 v0Var3 = (di.v0) arrayList.get(i15);
                if (v0Var3.b || !v0Var3.e || v0Var3.g >= j10) {
                    if (hashSet.contains(Integer.valueOf(v0Var3.a))) {
                        i12 = v0Var3.a;
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
        m2Var.w = w0Var.b;
        m2Var.x = i12;
        m2Var.y = true;
        m0 itemAnimator = r1Var.getItemAnimator();
        r1Var.setItemAnimator(null);
        m2Var.d.i1(i18, r1Var.getHeight() / 2, true);
        m2Var.e.m(i18);
        r1Var.setItemAnimator(itemAnimator);
    }

    @Override // ag.s
    public void f(long j10) {
        ((q6) this.b).h();
    }

    @Override // h2.i
    public void g(j jVar) {
        a4.k kVar = (a4.k) this.b;
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        kVar.b.add(jVar2);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 6:
                ((Utilities.Callback) this.b).run(e2Var.h(i10, true, true));
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }

    @Override // xh.k
    public void o(xh.g gVar, float f7, float f10) {
        n8 n8Var = (n8) this.b;
        if (n8Var.v.x) {
            return;
        }
        gVar.q = new m8(n8Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = n8Var.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((xh.g) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 17:
                z.b((Intent) this.b);
                break;
            case 18:
                ((b0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((b) this.b).invoke(obj);
                return;
            case 14:
                ((b1.f) this.b).invoke(obj);
                return;
            case 15:
                w wVar = (w) obj;
                if (!((FirebaseMessaging) this.b).e.q() || wVar.h.a() == null) {
                    return;
                }
                synchronized (wVar) {
                    z10 = wVar.g;
                }
                if (z10) {
                    return;
                }
                wVar.h(0L);
                return;
            default:
                ((b1.f) this.b).invoke(obj);
                return;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return x0.a((x0) this.b, (Long) obj2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((aa.m0) this.b).getClass();
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

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        u6 u6Var;
        switch (this.a) {
            case 4:
                x xVar = (x) this.b;
                u61 u61Var = (u61) obj;
                y yVar = xVar.r;
                if (!(u61Var.G instanceof TL_stars.StarsTransaction)) {
                    if (xVar.h) {
                        xVar.h = false;
                        xVar.a();
                        break;
                    }
                } else {
                    Context context = xVar.getContext();
                    long j10 = yVar.b;
                    i10 = ((r2) yVar).currentAccount;
                    TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) u61Var.G;
                    u6Var = ((r2) yVar).resourceProvider;
                    dd.g1(context, true, j10, i10, starsTransaction, u6Var);
                    break;
                }
                break;
            case 9:
                ca.b((ca) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            default:
                ad adVar = (ad) this.b;
                u61 u61Var2 = (u61) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                adVar.getClass();
                if (u61Var2.G instanceof TL_stars.StarsTransaction) {
                    dd.g1(adVar.getContext(), false, 0L, adVar.c, (TL_stars.StarsTransaction) u61Var2.G, adVar.b);
                    break;
                }
                break;
        }
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
