package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class iv0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] d2 = {0, 1, 2, 4};
    public static final sr0 e2 = new sr0(0);
    public final NumberTextView A0;
    public int A1;
    public final ga B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.i2 D0;
    public final tt0 D1;
    public final int E;
    public final ArrayList E0;
    public s40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.f6 F1;
    public final org.telegram.ui.ActionBar.l G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final mt0 H;
    public final ArrayList H0;
    public boolean H1;
    public final cv0 I;
    public final xs0 I0;
    public final AnimationNotificationsLocker I1;
    public final wu0 J;
    public final us0 J0;
    public my J1;
    public final vu0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final vu0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final vu0 M;
    public final br0 M0;
    public int M1;
    public final ou0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final vt0 O;
    public float O0;
    public final SparseArray O1;
    public final st0 P;
    public final qs P0;
    public long P1;
    public final qt0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final ru0 R;
    public final ts0 R0;
    public int R1;
    public final tu0 S;
    public final int S0;
    public final et0 S1;
    public final nt0 T;
    public final Paint T0;
    public zh.a5 T1;
    public final vr0 U;
    public boolean U0;
    public float U1;
    public final wr0 V;
    public boolean V0;
    public boolean V1;
    public final cs0 W;
    public yg.p0 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean a;
    public final rt0 a0;
    public int a1;
    public int a2;
    public boolean b;
    public final s4.y b0;
    public boolean b1;
    public int b2;
    public boolean c;
    public final pt0 c0;
    public long c1;
    public final nh c2;
    public boolean d;
    public final fv0 d0;
    public TLRPC.ChatFull d1;
    public int e;
    public final ur0 e0;
    public TLRPC.UserFull e1;
    public int f;
    public final fv0 f0;
    public AnimatorSet f1;
    public final du0 g0;
    public boolean g1;
    public float h;
    public final du0 h0;
    public boolean h1;
    public final du0 i0;
    public boolean i1;
    public final yt0 j0;
    public final long j1;
    public final au0[] k0;
    public boolean k1;
    public final org.telegram.ui.ActionBar.w0 l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.w0 m0;
    public final int[] m1;
    public float n;
    public final org.telegram.ui.ActionBar.w0 n0;
    public float n1;
    public float o0;
    public boolean o1;
    public float p0;
    public int p1;
    public final TextView q0;
    public int q1;
    public boolean r;
    public final ImageView r0;
    public final hs0 r1;
    public int s;
    public final kj0 s0;
    public float s1;
    public final org.telegram.ui.ActionBar.w0 t0;
    public final xu0[] t1;
    public final org.telegram.ui.ActionBar.w0 u0;
    public final av0 u1;
    public int v;
    public final org.telegram.ui.ActionBar.w0 v0;
    public final org.telegram.ui.ActionBar.p2 v1;
    public int w;
    public final org.telegram.ui.ActionBar.w0 w0;
    public int w1;
    public final Rect x;
    public int x0;
    public boolean x1;
    public final a10 y;
    public final Drawable y0;
    public boolean y1;
    public boolean z0;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0b3d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c45 A[EDGE_INSN: B:169:0x0c45->B:170:0x0c45 BREAK  A[LOOP:3: B:140:0x0913->B:166:0x0b3d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0e1e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0290 A[EDGE_INSN: B:47:0x0290->B:48:0x0290 BREAK  A[LOOP:0: B:29:0x022f->B:42:0x0289], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ac A[LOOP:2: B:74:0x03aa->B:75:0x03ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03cd  */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.graphics.drawable.Drawable, org.telegram.ui.ActionBar.f6, s4.m0] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iv0(Context context, long j3, av0 av0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.p2 p2Var, tt0 tt0Var, int i13, org.telegram.ui.ActionBar.f6 f6Var, zg.a aVar) {
        super(context);
        char c10;
        TLRPC.ProfileTab profileTab;
        int i14;
        xu0[] xu0VarArr;
        int i15;
        us0 us0Var;
        int i16;
        int i17;
        ru0 ru0Var;
        float f7;
        Context context2;
        org.telegram.ui.ActionBar.w0 w0Var;
        ?? r10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        iv0 iv0Var;
        int i18;
        int i19;
        int i20;
        au0[] au0VarArr;
        View view;
        boolean N;
        iv0 iv0Var2;
        cs0 cs0Var;
        int i21;
        int i22;
        es0 es0Var;
        zt0 zt0Var;
        zt0 zt0Var2;
        zt0 zt0Var3;
        zt0 zt0Var4;
        zt0 zt0Var5;
        zt0 zt0Var6;
        zt0 zt0Var7;
        zt0 zt0Var8;
        zt0 zt0Var9;
        zt0 zt0Var10;
        zt0 zt0Var11;
        zt0 zt0Var12;
        zt0 zt0Var13;
        zt0 zt0Var14;
        zt0 zt0Var15;
        a10 a10Var;
        a10 a10Var2;
        a10 a10Var3;
        a10 a10Var4;
        jx0 jx0Var;
        jx0 jx0Var2;
        jx0 jx0Var3;
        jx0 jx0Var4;
        jx0 jx0Var5;
        jx0 jx0Var6;
        jx0 jx0Var7;
        jx0 jx0Var8;
        jx0 jx0Var9;
        jx0 jx0Var10;
        a10 a10Var5;
        zt0 zt0Var16;
        jx0 jx0Var11;
        zt0 zt0Var17;
        zt0 zt0Var18;
        au0 au0Var;
        es0 es0Var2;
        zt0 zt0Var19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        iv0 iv0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        iv0Var3.x = new Rect();
        iv0Var3.k0 = new au0[2];
        iv0Var3.E0 = new ArrayList(10);
        iv0Var3.F0 = new ArrayList(10);
        iv0Var3.G0 = new ArrayList(10);
        iv0Var3.H0 = new ArrayList(10);
        iv0Var3.M0 = new br0(iv0Var3, 2);
        iv0Var3.N0 = new ArrayList();
        iv0Var3.T0 = new Paint();
        iv0Var3.Z0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        iv0Var3.k1 = false;
        iv0Var3.l1 = false;
        iv0Var3.m1 = new int[]{3, 3};
        iv0Var3.r1 = new hs0(iv0Var3);
        iv0Var3.s1 = -5.0f;
        iv0Var3.t1 = new xu0[9];
        iv0Var3.I1 = new AnimationNotificationsLocker();
        iv0Var3.O1 = new SparseArray();
        iv0Var3.R1 = -1;
        iv0Var3.S1 = new et0(iv0Var3);
        iv0Var3.U1 = 0.0f;
        iv0Var3.Y1 = new HashMap();
        iv0Var3.Z1 = new HashMap();
        eh.c cVar = new eh.c();
        cVar.a(iv0Var3.h0(org.telegram.ui.ActionBar.j6.d6));
        zg.a aVar2 = aVar == null ? new zg.a(cVar) : aVar;
        iv0Var3.E = i13;
        iv0Var3.F1 = f6Var;
        a10 a10Var6 = new a10(context);
        iv0Var3.y = a10Var6;
        a10Var6.setIsSingleCell(true);
        TLRPC.User user = p2Var.getMessagesController().getUser(Long.valueOf(j3));
        iv0Var3.u1 = av0Var;
        iv0Var3.D1 = tt0Var;
        int[] iArr = av0Var.c;
        long j10 = av0Var.s;
        iv0Var3.F = j10;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j10 == 0 ? i10 : 0, iArr[7], iArr[8]};
        iv0Var3.X0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                c10 = 5;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    iv0Var3.Y0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    iv0Var3.Y0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    iv0Var3.Y0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || iv0Var3.v0()))) {
                    iv0Var3.Y0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[1];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            iv0Var3.Y0 = 1;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[c10]) == i23 || i27 > 0)) {
                        iv0Var3.Y0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        iv0Var3.Y0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        iv0Var3.Y0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        iv0Var3.Y0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || iv0Var3.v0())) {
                        iv0Var3.Y0 = iv0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i11 == -1 || j10 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = iv0Var3.X0;
                                if (i30 >= iArr3.length) {
                                    break;
                                }
                                int i31 = iArr3[i30];
                                if (i31 == i29 || i31 > 0) {
                                    break;
                                }
                                i30++;
                                i29 = -1;
                            }
                            iv0Var3.Y0 = i30;
                        } else {
                            iv0Var3.Y0 = i11;
                        }
                    } else {
                        iv0Var3.Y0 = 14;
                    }
                } else {
                    iv0Var3.Y0 = 14;
                }
                iv0Var3.M0(i11);
                iv0Var3.d1 = chatFull2;
                iv0Var3.e1 = userFull;
                if (chatFull2 != null) {
                    iv0Var3.c1 = -chatFull2.migrated_from_chat_id;
                }
                iv0Var3.j1 = j3;
                i14 = 0;
                while (true) {
                    xu0VarArr = iv0Var3.t1;
                    if (i14 < xu0VarArr.length) {
                        break;
                    }
                    xu0VarArr[i14] = new xu0();
                    iv0Var3.t1[i14].j[0] = DialogObject.isEncryptedDialog(iv0Var3.j1) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    iv0Var3.t1[i14].j[1] = Integer.MAX_VALUE;
                    iv0Var3.R(i14);
                    if (iv0Var3.c1 != 0 && iv0Var3.d1 != null && iv0Var3.t1[i14].b[1].size() == 0) {
                        xu0 xu0Var = iv0Var3.t1[i14];
                        xu0Var.j[1] = iv0Var3.d1.migrated_from_max_id;
                        xu0Var.i[1] = false;
                    }
                    i14++;
                }
                iv0Var3.v1 = p2Var;
                iv0Var3.G = p2Var.getActionBar();
                iv0Var3.m1[0] = iv0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : iv0Var3.S0();
                iv0Var3.m1[1] = iv0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : iv0Var3.S0();
                iv0Var3.G1 = p2Var.getNotificationCenter().createObserversGroup(iv0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i15 = 0; i15 < 10; i15++) {
                    if (i11 == 4) {
                        ss0 ss0Var = new ss0(iv0Var3, context);
                        ss0Var.T.c();
                        iv0Var3.G0.add(ss0Var);
                    }
                }
                iv0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                iv0Var3.V0 = false;
                iv0Var3.W0 = null;
                us0Var = iv0Var3.J0;
                if (us0Var != null) {
                    us0Var.g(false);
                }
                iv0Var3.U0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                iv0Var3.y0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(iv0Var3.h0(org.telegram.ui.ActionBar.j6.b7), PorterDuff.Mode.MULTIPLY));
                xs0 xs0Var = iv0Var3.I0;
                int currentTabId = xs0Var == null ? xs0Var.getCurrentTabId() : i11;
                xs0 xs0Var2 = new xs0(iv0Var3, context, iv0Var3.F1);
                i16 = iv0Var3.Y0;
                if (i16 != -1) {
                    xs0Var2.setInitialTabId(i16);
                    iv0Var3.Y0 = -1;
                }
                xs0Var2.b0 = 320L;
                int i32 = org.telegram.ui.ActionBar.j6.Fh;
                int i33 = org.telegram.ui.ActionBar.j6.Eh;
                xs0Var2.L = i32;
                xs0Var2.M = i33;
                xs0Var2.e();
                xs0Var2.setUseMinimalWidth(true);
                xs0Var2.setDelegate(new zs0(iv0Var3));
                iv0Var3.I0 = xs0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    iv0Var3.Z0[i17].clear();
                }
                iv0Var3.a1 = 0;
                iv0Var3.N0.clear();
                ru0Var = iv0Var3.R;
                if (ru0Var != null) {
                    ru0Var.w.clear();
                }
                if (!(iv0Var3 instanceof i40)) {
                    org.telegram.ui.ActionBar.z n10 = iv0Var3.G.n();
                    n10.addOnLayoutChangeListener(new ys0(iv0Var3));
                    if (iv0Var3.j1 == iv0Var3.v1.getUserConfig().getClientUserId() && (iv0Var3.v1 instanceof la0) && iv0Var3.D()) {
                        iv0Var3.m0 = n10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.w0 a2 = n10.a(0, 0);
                    a2.F();
                    a2.H = new ft0(iv0Var3);
                    iv0Var3.n0 = a2;
                    a2.setTranslationY(AndroidUtilities.dp(10.0f));
                    us0 us0Var2 = iv0Var3.J0;
                    a2.setSearchFieldHint(LocaleController.getString((us0Var2 != null && us0Var2.a() && iv0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a2.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a2.setVisibility(iv0Var3.v0() ? 8 : 4);
                }
                ImageView imageView = new ImageView(context);
                iv0Var3.r0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!iv0Var3.q0() || iv0Var3.t0()) {
                    f7 = 2.0f;
                } else {
                    iv0Var3.G.addView(imageView, w7.a6.e(48, 56, 85));
                    kj0 kj0Var = new kj0(context);
                    iv0Var3.s0 = kj0Var;
                    kj0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    kj0Var.e(R.raw.options_to_search, 24, 24);
                    kj0Var.getAnimatedDrawable().F *= 2.0f;
                    kj0Var.getAnimatedDrawable().h = true;
                    f7 = 2.0f;
                    kj0Var.setColorFilter(new PorterDuffColorFilter(iv0Var3.h0(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
                    kj0Var.setVisibility(8);
                    iv0Var3.G.addView(kj0Var, w7.a6.e(48, 56, 85));
                }
                context2 = context;
                imageView.setOnClickListener(new lt0(iv0Var3, j3, f6Var, context));
                w0Var = iv0Var3.n0;
                if (w0Var != null) {
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    int i34 = org.telegram.ui.ActionBar.j6.G6;
                    searchField.setTextColor(iv0Var3.h0(i34));
                    searchField.setHintTextColor(iv0Var3.h0(org.telegram.ui.ActionBar.j6.Si));
                    searchField.setCursorColor(iv0Var3.h0(i34));
                }
                iv0Var3.x0 = 0;
                org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var3.v1;
                aw0 aw0Var = (p2Var2 == null && (p2Var2.getFragmentView() instanceof aw0)) ? (aw0) iv0Var3.v1.getFragmentView() : null;
                ga gaVar = new ga(context2, aw0Var);
                iv0Var3.B0 = gaVar;
                gaVar.setBackgroundColor(iv0Var3.h0(org.telegram.ui.ActionBar.j6.a7));
                gaVar.setAlpha(0.0f);
                gaVar.setClickable(true);
                gaVar.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                iv0Var3.C0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(true);
                iv0Var3.D0 = i2Var;
                imageView2.setImageDrawable(i2Var);
                int i35 = org.telegram.ui.ActionBar.j6.y8;
                i2Var.a(iv0Var3.h0(i35));
                int i36 = org.telegram.ui.ActionBar.j6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.e0(iv0Var3.h0(i36), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                gaVar.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                iv0Var3.N0.add(imageView2);
                imageView2.setOnClickListener(new dr0(iv0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                iv0Var3.A0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(iv0Var3.h0(i35));
                gaVar.addView(numberTextView, w7.a6.m(1.0f, 0, -1, 18, 0, 0));
                iv0Var3.N0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(iv0Var3.j1)) {
                    if (!iv0Var3.v0()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context2, iv0Var3.h0(i36), iv0Var3.h0(i35), false);
                        iv0Var3.u0 = w0Var2;
                        w0Var2.setIcon(R.drawable.msg_message);
                        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        w0Var2.setDuplicateParentStateEnabled(false);
                        gaVar.addView(w0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        iv0Var3.N0.add(w0Var2);
                        w0Var2.setOnClickListener(new dr0(iv0Var3, 1));
                        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context2, iv0Var3.h0(i36), iv0Var3.h0(i35), false);
                        iv0Var3.t0 = w0Var3;
                        w0Var3.setIcon(R.drawable.msg_forward);
                        w0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        w0Var3.setDuplicateParentStateEnabled(false);
                        gaVar.addView(w0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        iv0Var3.N0.add(w0Var3);
                        w0Var3.setOnClickListener(new dr0(iv0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context2, iv0Var3.h0(i36), iv0Var3.h0(i35), false);
                    iv0Var3.v0 = w0Var4;
                    w0Var4.setIcon(R.drawable.msg_pin);
                    w0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    w0Var4.setDuplicateParentStateEnabled(false);
                    w0Var4.setVisibility(8);
                    gaVar.addView(w0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    iv0Var3.N0.add(w0Var4);
                    w0Var4.setOnClickListener(new dr0(iv0Var3, 3));
                    org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context2, iv0Var3.h0(i36), iv0Var3.h0(i35), false);
                    iv0Var3.w0 = w0Var5;
                    w0Var5.setIcon(R.drawable.msg_unpin);
                    w0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    w0Var5.setDuplicateParentStateEnabled(false);
                    w0Var5.setVisibility(8);
                    gaVar.addView(w0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    iv0Var3.N0.add(w0Var5);
                    w0Var5.setOnClickListener(new dr0(iv0Var3, 4));
                    iv0Var3.p1();
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = new org.telegram.ui.ActionBar.w0(context2, iv0Var3.h0(i36), iv0Var3.h0(i35), false);
                iv0Var3.l0 = w0Var6;
                w0Var6.setIcon(R.drawable.msg_delete);
                w0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                w0Var6.setDuplicateParentStateEnabled(false);
                gaVar.addView(w0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                iv0Var3.N0.add(w0Var6);
                w0Var6.setOnClickListener(new dr0(iv0Var3, 5));
                iv0Var3.H = new mt0(iv0Var3, context2);
                iv0Var3.I = new cv0(iv0Var3, context2);
                iv0Var3.K = new vu0(iv0Var3, context2, 1);
                iv0Var3.L = new vu0(iv0Var3, context2, 2);
                iv0Var3.M = new vu0(iv0Var3, context2, 4);
                iv0Var3.N = new ou0(iv0Var3, context2, iv0Var3.v1.getCurrentAccount(), iv0Var3.v1.getResourceProvider());
                iv0Var3.O = new vt0(iv0Var3, context2);
                iv0Var3.g0 = new du0(iv0Var3, context2, 1);
                iv0Var3.h0 = new du0(iv0Var3, context2, 4);
                iv0Var3.i0 = new du0(iv0Var3, context2, 3);
                iv0Var3.j0 = new yt0(iv0Var3, context2);
                iv0Var3.P = new st0(iv0Var3, context2);
                iv0Var3.Q = new qt0(iv0Var3, context2);
                iv0Var3.R = new ru0(iv0Var3, context2);
                iv0Var3.S = new tu0(iv0Var3, context2);
                if (!iv0Var3.v0() && !iv0Var3.l0() && iv0Var3.F == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", iv0Var3.v1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    nt0 nt0Var = new nt0(iv0Var3, context2, iv0Var3.v1.getParentLayout(), bundle);
                    iv0Var3.T = nt0Var;
                    long j11 = iv0Var3.j1;
                    org.telegram.ui.fo foVar = nt0Var.a;
                    foVar.d4 = j11;
                    foVar.Pa = true;
                    nt0Var.setClipToOutline(true);
                    nt0Var.setOutlineProvider(new ot0());
                }
                rt0 rt0Var = new rt0(iv0Var3, context2);
                iv0Var3.a0 = rt0Var;
                if (iv0Var3.F == 0) {
                    rt0Var.e = arrayList;
                    rt0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                iv0Var3.c0 = new pt0(iv0Var3, context2);
                iv0Var3.b0 = new s4.y(new tr0(iv0Var3));
                iv0Var3.d0 = new fv0(iv0Var3, context2, false);
                iv0Var3.e0 = new ur0(iv0Var3, context2);
                iv0Var3.f0 = new fv0(iv0Var3, context2, true);
                iv0Var3.J = new wu0(iv0Var3, context2);
                if (!iv0Var3.r0()) {
                    iv0Var3.U = new vr0(iv0Var3, context2, iv0Var3.v1, iv0Var3.j1);
                } else if (iv0Var3.v1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    iv0Var3.q0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i37 = org.telegram.ui.ActionBar.j6.Oh;
                    textView.setTextColor(iv0Var3.h0(i37));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.l1(0.15f, iv0Var3.h0(i37)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    iv0Var3.G.addView(textView, w7.a6.e(-2, 56, 85));
                    textView.setOnClickListener(new dr0(iv0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.p2 p2Var3 = iv0Var3.v1;
                    r10 = 0;
                    f6Var2 = f6Var;
                    wr0 wr0Var = new wr0(p2Var3.getCurrentAccount(), ((ProfileActivity) iv0Var3.v1).a(), context2, p2Var3, f6Var2, iv0Var3);
                    context2 = context2;
                    iv0 iv0Var4 = iv0Var3;
                    iv0Var4.V = wr0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    qs qsVar = iv0Var4.P0;
                    wr0Var.setPaddingTop(dp + (qsVar != null ? (int) qsVar.c(0.0f) : 0));
                    iv0Var4.W = new cs0(iv0Var4, context2, aw0Var, iv0Var4.getStoriesController().B(iv0Var4.j1, true), new as0(iv0Var4, context2, p2Var, f6Var2));
                    iv0Var = iv0Var4;
                    iv0Var.setWillNotDraw(false);
                    i18 = 0;
                    i19 = -1;
                    i20 = 0;
                    while (true) {
                        au0VarArr = iv0Var.k0;
                        if (i20 >= au0VarArr.length) {
                            break;
                        }
                        if (i20 == 0 && (au0Var = au0VarArr[i20]) != null && (es0Var2 = au0Var.x) != null) {
                            i19 = es0Var2.L0();
                            if (i19 != iv0Var.k0[i20].x.B() - 1) {
                                zt0Var19 = iv0Var.k0[i20].h;
                                fl0 fl0Var = (fl0) zt0Var19.K(i19);
                                if (fl0Var != null) {
                                    i18 = fl0Var.a.getTop();
                                } else {
                                    i19 = -1;
                                }
                            } else {
                                i21 = i18;
                                i22 = -1;
                                ds0 ds0Var = new ds0(iv0Var, context2);
                                iv0Var.addView(ds0Var, w7.a6.d(-1, -1.0f, 51, 0.0f, iv0Var.B0(), 0.0f, 0.0f));
                                if (i20 == 1) {
                                    ds0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                iv0Var.k0[i20] = ds0Var;
                                es0Var = new es0(iv0Var, ds0Var);
                                ds0Var.x = es0Var;
                                es0Var.z1(new fs0(iv0Var, ds0Var));
                                iv0Var.k0[i20].d = new s4.j();
                                iv0Var.k0[i20].d.n(280L);
                                iv0Var.k0[i20].d.o(wr.h);
                                au0 au0Var2 = iv0Var.k0[i20];
                                au0Var2.d.m = false;
                                au0Var2.h = new gs0(iv0Var, context2, ds0Var, es0Var);
                                zt0Var = iv0Var.k0[i20].h;
                                zt0Var.setFastScrollEnabled(1);
                                zt0Var2 = iv0Var.k0[i20].h;
                                zt0Var2.setScrollingTouchSlop(1);
                                zt0Var3 = iv0Var.k0[i20].h;
                                zt0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f7));
                                zt0Var4 = iv0Var.k0[i20].h;
                                zt0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                zt0Var5 = iv0Var.k0[i20].h;
                                zt0Var5.setItemAnimator(r10);
                                zt0Var6 = iv0Var.k0[i20].h;
                                zt0Var6.setClipToPadding(false);
                                zt0Var7 = iv0Var.k0[i20].h;
                                zt0Var7.setSectionsType(2);
                                zt0Var8 = iv0Var.k0[i20].h;
                                zt0Var8.setLayoutManager(es0Var);
                                au0 au0Var3 = iv0Var.k0[i20];
                                zt0Var9 = au0Var3.h;
                                au0Var3.addView(zt0Var9, w7.a6.c(-1.0f, -1));
                                iv0Var.k0[i20].r = new zt0(context2, r10);
                                au0 au0Var4 = iv0Var.k0[i20];
                                zt0 zt0Var20 = au0Var4.r;
                                is0 is0Var = new is0(iv0Var);
                                au0Var4.s = is0Var;
                                zt0Var20.setLayoutManager(is0Var);
                                au0 au0Var5 = iv0Var.k0[i20];
                                au0Var5.addView(au0Var5.r, w7.a6.c(-1.0f, -1));
                                iv0Var.k0[i20].r.setVisibility(8);
                                iv0Var.k0[i20].r.i(new js0(ds0Var));
                                zt0Var10 = iv0Var.k0[i20].h;
                                zt0Var10.i(new ks0(iv0Var, ds0Var));
                                zt0Var11 = iv0Var.k0[i20].h;
                                zt0Var11.setOnItemClickListener(new org.telegram.ui.ze(iv0Var, ds0Var, context2, j3, f6Var2, 1));
                                zt0Var12 = iv0Var.k0[i20].h;
                                zt0Var12.setOnScrollListener(new ms0(iv0Var, ds0Var, es0Var));
                                zt0Var13 = iv0Var.k0[i20].h;
                                zt0Var13.setOnItemLongClickListener(new ns0(iv0Var, ds0Var));
                                if (i20 == 0 && i22 != -1) {
                                    es0Var.h1(i22, i21);
                                }
                                zt0Var14 = iv0Var.k0[i20].h;
                                iv0Var.k0[i20].y = new os0(context2, zt0Var14);
                                iv0Var.k0[i20].y.setVisibility(8);
                                zt0Var15 = iv0Var.k0[i20].h;
                                zt0Var15.D0(iv0Var.k0[i20].y, w7.a6.c(-1.0f, -1));
                                iv0Var.k0[i20].v = new ps0(iv0Var, context2, ds0Var);
                                a10Var = iv0Var.k0[i20].v;
                                a10Var.g();
                                a10Var2 = iv0Var.k0[i20].v;
                                a10Var2.setClipToOutline(true);
                                a10Var3 = iv0Var.k0[i20].v;
                                a10Var3.setOutlineProvider(new qs0());
                                if (i20 == 0) {
                                    iv0Var.k0[i20].setVisibility(8);
                                }
                                au0 au0Var6 = iv0Var.k0[i20];
                                a10Var4 = au0Var6.v;
                                au0Var6.w = new rs0(iv0Var, context2, a10Var4);
                                jx0Var = iv0Var.k0[i20].w;
                                jx0Var.d(8, false);
                                jx0Var2 = iv0Var.k0[i20].w;
                                jx0Var2.setAnimateLayoutChange(true);
                                au0 au0Var7 = iv0Var.k0[i20];
                                jx0Var3 = au0Var7.w;
                                au0Var7.addView(jx0Var3, w7.a6.c(-1.0f, -1));
                                jx0Var4 = iv0Var.k0[i20].w;
                                jx0Var4.setOnTouchListener(new ai.h(23));
                                jx0Var5 = iv0Var.k0[i20].w;
                                jx0Var5.e(true, false);
                                jx0Var6 = iv0Var.k0[i20].w;
                                jx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                jx0Var7 = iv0Var.k0[i20].w;
                                jx0Var7.f.setVisibility(8);
                                jx0Var8 = iv0Var.k0[i20].w;
                                jx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                jx0Var9 = iv0Var.k0[i20].w;
                                jx0Var9.f.setVisibility(8);
                                jx0Var10 = iv0Var.k0[i20].w;
                                a10Var5 = iv0Var.k0[i20].v;
                                jx0Var10.addView(a10Var5, w7.a6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                                zt0Var16 = iv0Var.k0[i20].h;
                                jx0Var11 = iv0Var.k0[i20].w;
                                zt0Var16.setEmptyView(jx0Var11);
                                zt0Var17 = iv0Var.k0[i20].h;
                                zt0Var17.l1(0, true);
                                au0[] au0VarArr2 = iv0Var.k0;
                                au0 au0Var8 = au0VarArr2[i20];
                                zt0Var18 = au0VarArr2[i20].h;
                                au0Var8.E = new yk0(zt0Var18, iv0Var.k0[i20].x);
                                i20++;
                                f6Var2 = f6Var;
                                i18 = i21;
                                i19 = i22;
                            }
                        }
                        i21 = i18;
                        i22 = i19;
                        ds0 ds0Var2 = new ds0(iv0Var, context2);
                        iv0Var.addView(ds0Var2, w7.a6.d(-1, -1.0f, 51, 0.0f, iv0Var.B0(), 0.0f, 0.0f));
                        if (i20 == 1) {
                        }
                        iv0Var.k0[i20] = ds0Var2;
                        es0Var = new es0(iv0Var, ds0Var2);
                        ds0Var2.x = es0Var;
                        es0Var.z1(new fs0(iv0Var, ds0Var2));
                        iv0Var.k0[i20].d = new s4.j();
                        iv0Var.k0[i20].d.n(280L);
                        iv0Var.k0[i20].d.o(wr.h);
                        au0 au0Var22 = iv0Var.k0[i20];
                        au0Var22.d.m = false;
                        au0Var22.h = new gs0(iv0Var, context2, ds0Var2, es0Var);
                        zt0Var = iv0Var.k0[i20].h;
                        zt0Var.setFastScrollEnabled(1);
                        zt0Var2 = iv0Var.k0[i20].h;
                        zt0Var2.setScrollingTouchSlop(1);
                        zt0Var3 = iv0Var.k0[i20].h;
                        zt0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f7));
                        zt0Var4 = iv0Var.k0[i20].h;
                        zt0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        zt0Var5 = iv0Var.k0[i20].h;
                        zt0Var5.setItemAnimator(r10);
                        zt0Var6 = iv0Var.k0[i20].h;
                        zt0Var6.setClipToPadding(false);
                        zt0Var7 = iv0Var.k0[i20].h;
                        zt0Var7.setSectionsType(2);
                        zt0Var8 = iv0Var.k0[i20].h;
                        zt0Var8.setLayoutManager(es0Var);
                        au0 au0Var32 = iv0Var.k0[i20];
                        zt0Var9 = au0Var32.h;
                        au0Var32.addView(zt0Var9, w7.a6.c(-1.0f, -1));
                        iv0Var.k0[i20].r = new zt0(context2, r10);
                        au0 au0Var42 = iv0Var.k0[i20];
                        zt0 zt0Var202 = au0Var42.r;
                        is0 is0Var2 = new is0(iv0Var);
                        au0Var42.s = is0Var2;
                        zt0Var202.setLayoutManager(is0Var2);
                        au0 au0Var52 = iv0Var.k0[i20];
                        au0Var52.addView(au0Var52.r, w7.a6.c(-1.0f, -1));
                        iv0Var.k0[i20].r.setVisibility(8);
                        iv0Var.k0[i20].r.i(new js0(ds0Var2));
                        zt0Var10 = iv0Var.k0[i20].h;
                        zt0Var10.i(new ks0(iv0Var, ds0Var2));
                        zt0Var11 = iv0Var.k0[i20].h;
                        zt0Var11.setOnItemClickListener(new org.telegram.ui.ze(iv0Var, ds0Var2, context2, j3, f6Var2, 1));
                        zt0Var12 = iv0Var.k0[i20].h;
                        zt0Var12.setOnScrollListener(new ms0(iv0Var, ds0Var2, es0Var));
                        zt0Var13 = iv0Var.k0[i20].h;
                        zt0Var13.setOnItemLongClickListener(new ns0(iv0Var, ds0Var2));
                        if (i20 == 0) {
                            es0Var.h1(i22, i21);
                        }
                        zt0Var14 = iv0Var.k0[i20].h;
                        iv0Var.k0[i20].y = new os0(context2, zt0Var14);
                        iv0Var.k0[i20].y.setVisibility(8);
                        zt0Var15 = iv0Var.k0[i20].h;
                        zt0Var15.D0(iv0Var.k0[i20].y, w7.a6.c(-1.0f, -1));
                        iv0Var.k0[i20].v = new ps0(iv0Var, context2, ds0Var2);
                        a10Var = iv0Var.k0[i20].v;
                        a10Var.g();
                        a10Var2 = iv0Var.k0[i20].v;
                        a10Var2.setClipToOutline(true);
                        a10Var3 = iv0Var.k0[i20].v;
                        a10Var3.setOutlineProvider(new qs0());
                        if (i20 == 0) {
                        }
                        au0 au0Var62 = iv0Var.k0[i20];
                        a10Var4 = au0Var62.v;
                        au0Var62.w = new rs0(iv0Var, context2, a10Var4);
                        jx0Var = iv0Var.k0[i20].w;
                        jx0Var.d(8, false);
                        jx0Var2 = iv0Var.k0[i20].w;
                        jx0Var2.setAnimateLayoutChange(true);
                        au0 au0Var72 = iv0Var.k0[i20];
                        jx0Var3 = au0Var72.w;
                        au0Var72.addView(jx0Var3, w7.a6.c(-1.0f, -1));
                        jx0Var4 = iv0Var.k0[i20].w;
                        jx0Var4.setOnTouchListener(new ai.h(23));
                        jx0Var5 = iv0Var.k0[i20].w;
                        jx0Var5.e(true, false);
                        jx0Var6 = iv0Var.k0[i20].w;
                        jx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        jx0Var7 = iv0Var.k0[i20].w;
                        jx0Var7.f.setVisibility(8);
                        jx0Var8 = iv0Var.k0[i20].w;
                        jx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        jx0Var9 = iv0Var.k0[i20].w;
                        jx0Var9.f.setVisibility(8);
                        jx0Var10 = iv0Var.k0[i20].w;
                        a10Var5 = iv0Var.k0[i20].v;
                        jx0Var10.addView(a10Var5, w7.a6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                        zt0Var16 = iv0Var.k0[i20].h;
                        jx0Var11 = iv0Var.k0[i20].w;
                        zt0Var16.setEmptyView(jx0Var11);
                        zt0Var17 = iv0Var.k0[i20].h;
                        zt0Var17.l1(0, true);
                        au0[] au0VarArr22 = iv0Var.k0;
                        au0 au0Var82 = au0VarArr22[i20];
                        zt0Var18 = au0VarArr22[i20].h;
                        au0Var82.E = new yk0(zt0Var18, iv0Var.k0[i20].x);
                        i20++;
                        f6Var2 = f6Var;
                        i18 = i21;
                        i19 = i22;
                    }
                    view = iv0Var.W;
                    if (view != null) {
                        iv0Var.addView(view, w7.a6.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    org.telegram.ui.Cells.w0 w0Var7 = new org.telegram.ui.Cells.w0(context2);
                    iv0Var.K0 = w0Var7;
                    w0Var7.T((int) (System.currentTimeMillis() / 1000), false, false);
                    w0Var7.setAlpha(0.0f);
                    w0Var7.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
                    w0Var7.setTranslationY(-AndroidUtilities.dp(48.0f));
                    iv0Var.addView(w0Var7, w7.a6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    N = iv0Var.N();
                    iv0Var2 = iv0Var;
                    if (!N) {
                        qs qsVar2 = new qs(context2);
                        iv0Var.P0 = qsVar2;
                        qsVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        bh.d b10 = aVar2.b(qsVar2, dh.c.n(f6Var));
                        b10.p(AndroidUtilities.dp(24.0f));
                        b10.o(AndroidUtilities.dp(7.0f));
                        qsVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        iv0Var.Q0 = frameLayout;
                        qsVar2.addView(frameLayout);
                        qsVar2.i(frameLayout, true, false);
                        qsVar2.setOnAnimatedHeightChangedListener(new br0(iv0Var, 0));
                        ts0 ts0Var = new ts0(iv0Var, context2, p2Var, this, f6Var);
                        iv0Var.R0 = ts0Var;
                        frameLayout.addView(ts0Var);
                        qsVar2.setCallFragmentContextView(ts0Var);
                        iv0Var.addView(qsVar2, w7.a6.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                        ts0Var.setDelegate(new cr0(iv0Var));
                        bh.d b11 = aVar2.b(iv0Var.I0, dh.c.n(f6Var));
                        b11.p(AndroidUtilities.dp(18.0f));
                        b11.o(AndroidUtilities.dp(6.666f));
                        iv0Var.I0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        iv0Var.I0.setClipToPadding(false);
                        iv0Var.I0.setBackground(r10);
                        iv0Var.I0.setBlurredBackground(b11);
                        iv0Var.I0.setOpen(false);
                        iv0Var.addView(iv0Var.I0, w7.a6.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                        Context context3 = iv0Var.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var4 = iv0Var.v1;
                        iv0 iv0Var5 = iv0Var;
                        us0 us0Var3 = new us0(p2Var4.getCurrentAccount(), iv0Var.l0() ? 0L : iv0Var.j1, context3, p2Var4, f6Var, iv0Var5);
                        iv0 iv0Var6 = iv0Var5;
                        iv0Var6.J0 = us0Var3;
                        us0Var3.d(aVar2, dh.c.n(f6Var));
                        us0Var3.setShown(0.0f);
                        iv0Var6.addView(us0Var3, w7.a6.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        iv0Var6.addView(iv0Var6.B0, w7.a6.e(-1, 48, 51));
                        iv0Var2 = iv0Var6;
                    }
                    iv0Var2.v1(false);
                    iv0Var2.m1(false);
                    if (iv0Var2.X0[0] >= 0) {
                        iv0Var2.z0(false);
                    }
                    cs0Var = iv0Var2.W;
                    if (cs0Var != null && i12 > 0) {
                        cs0Var.setInitialTabId(i12);
                    }
                    iv0Var2.c2 = new nh(iv0Var2, 2);
                }
                f6Var2 = f6Var;
                r10 = 0;
                iv0Var = iv0Var3;
                iv0Var.setWillNotDraw(false);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    au0VarArr = iv0Var.k0;
                    if (i20 >= au0VarArr.length) {
                    }
                    au0 au0Var622 = iv0Var.k0[i20];
                    a10Var4 = au0Var622.v;
                    au0Var622.w = new rs0(iv0Var, context2, a10Var4);
                    jx0Var = iv0Var.k0[i20].w;
                    jx0Var.d(8, false);
                    jx0Var2 = iv0Var.k0[i20].w;
                    jx0Var2.setAnimateLayoutChange(true);
                    au0 au0Var722 = iv0Var.k0[i20];
                    jx0Var3 = au0Var722.w;
                    au0Var722.addView(jx0Var3, w7.a6.c(-1.0f, -1));
                    jx0Var4 = iv0Var.k0[i20].w;
                    jx0Var4.setOnTouchListener(new ai.h(23));
                    jx0Var5 = iv0Var.k0[i20].w;
                    jx0Var5.e(true, false);
                    jx0Var6 = iv0Var.k0[i20].w;
                    jx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    jx0Var7 = iv0Var.k0[i20].w;
                    jx0Var7.f.setVisibility(8);
                    jx0Var8 = iv0Var.k0[i20].w;
                    jx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    jx0Var9 = iv0Var.k0[i20].w;
                    jx0Var9.f.setVisibility(8);
                    jx0Var10 = iv0Var.k0[i20].w;
                    a10Var5 = iv0Var.k0[i20].v;
                    jx0Var10.addView(a10Var5, w7.a6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    zt0Var16 = iv0Var.k0[i20].h;
                    jx0Var11 = iv0Var.k0[i20].w;
                    zt0Var16.setEmptyView(jx0Var11);
                    zt0Var17 = iv0Var.k0[i20].h;
                    zt0Var17.l1(0, true);
                    au0[] au0VarArr222 = iv0Var.k0;
                    au0 au0Var822 = au0VarArr222[i20];
                    zt0Var18 = au0VarArr222[i20].h;
                    au0Var822.E = new yk0(zt0Var18, iv0Var.k0[i20].x);
                    i20++;
                    f6Var2 = f6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = iv0Var.W;
                if (view != null) {
                }
                org.telegram.ui.Cells.w0 w0Var72 = new org.telegram.ui.Cells.w0(context2);
                iv0Var.K0 = w0Var72;
                w0Var72.T((int) (System.currentTimeMillis() / 1000), false, false);
                w0Var72.setAlpha(0.0f);
                w0Var72.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
                w0Var72.setTranslationY(-AndroidUtilities.dp(48.0f));
                iv0Var.addView(w0Var72, w7.a6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                N = iv0Var.N();
                iv0Var2 = iv0Var;
                if (!N) {
                }
                iv0Var2.v1(false);
                iv0Var2.m1(false);
                if (iv0Var2.X0[0] >= 0) {
                }
                cs0Var = iv0Var2.W;
                if (cs0Var != null) {
                    cs0Var.setInitialTabId(i12);
                }
                iv0Var2.c2 = new nh(iv0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        c10 = 5;
        if (i11 != 14) {
        }
        iv0Var3.Y0 = i11;
        iv0Var3.M0(i11);
        iv0Var3.d1 = chatFull2;
        iv0Var3.e1 = userFull;
        if (chatFull2 != null) {
        }
        iv0Var3.j1 = j3;
        i14 = 0;
        while (true) {
            xu0VarArr = iv0Var3.t1;
            if (i14 < xu0VarArr.length) {
            }
            i14++;
        }
        iv0Var3.v1 = p2Var;
        iv0Var3.G = p2Var.getActionBar();
        iv0Var3.m1[0] = iv0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : iv0Var3.S0();
        iv0Var3.m1[1] = iv0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : iv0Var3.S0();
        iv0Var3.G1 = p2Var.getNotificationCenter().createObserversGroup(iv0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i15 < 10) {
        }
        iv0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        iv0Var3.V0 = false;
        iv0Var3.W0 = null;
        us0Var = iv0Var3.J0;
        if (us0Var != null) {
        }
        iv0Var3.U0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        iv0Var3.y0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(iv0Var3.h0(org.telegram.ui.ActionBar.j6.b7), PorterDuff.Mode.MULTIPLY));
        xs0 xs0Var3 = iv0Var3.I0;
        if (xs0Var3 == null) {
        }
        xs0 xs0Var22 = new xs0(iv0Var3, context, iv0Var3.F1);
        i16 = iv0Var3.Y0;
        if (i16 != -1) {
        }
        xs0Var22.b0 = 320L;
        int i322 = org.telegram.ui.ActionBar.j6.Fh;
        int i332 = org.telegram.ui.ActionBar.j6.Eh;
        xs0Var22.L = i322;
        xs0Var22.M = i332;
        xs0Var22.e();
        xs0Var22.setUseMinimalWidth(true);
        xs0Var22.setDelegate(new zs0(iv0Var3));
        iv0Var3.I0 = xs0Var22;
        while (i17 >= 0) {
        }
        iv0Var3.a1 = 0;
        iv0Var3.N0.clear();
        ru0Var = iv0Var3.R;
        if (ru0Var != null) {
        }
        if (!(iv0Var3 instanceof i40)) {
        }
        ImageView imageView3 = new ImageView(context);
        iv0Var3.r0 = imageView3;
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView3.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView3.setVisibility(4);
        if (iv0Var3.q0()) {
        }
        f7 = 2.0f;
        context2 = context;
        imageView3.setOnClickListener(new lt0(iv0Var3, j3, f6Var, context));
        w0Var = iv0Var3.n0;
        if (w0Var != null) {
        }
        iv0Var3.x0 = 0;
        org.telegram.ui.ActionBar.p2 p2Var22 = iv0Var3.v1;
        if (p2Var22 == null) {
        }
        ga gaVar2 = new ga(context2, aw0Var);
        iv0Var3.B0 = gaVar2;
        gaVar2.setBackgroundColor(iv0Var3.h0(org.telegram.ui.ActionBar.j6.a7));
        gaVar2.setAlpha(0.0f);
        gaVar2.setClickable(true);
        gaVar2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        iv0Var3.C0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.i2 i2Var2 = new org.telegram.ui.ActionBar.i2(true);
        iv0Var3.D0 = i2Var2;
        imageView22.setImageDrawable(i2Var2);
        int i352 = org.telegram.ui.ActionBar.j6.y8;
        i2Var2.a(iv0Var3.h0(i352));
        int i362 = org.telegram.ui.ActionBar.j6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.j6.e0(iv0Var3.h0(i362), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        gaVar2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        iv0Var3.N0.add(imageView22);
        imageView22.setOnClickListener(new dr0(iv0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        iv0Var3.A0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(iv0Var3.h0(i352));
        gaVar2.addView(numberTextView2, w7.a6.m(1.0f, 0, -1, 18, 0, 0));
        iv0Var3.N0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(iv0Var3.j1)) {
        }
        org.telegram.ui.ActionBar.w0 w0Var62 = new org.telegram.ui.ActionBar.w0(context2, iv0Var3.h0(i362), iv0Var3.h0(i352), false);
        iv0Var3.l0 = w0Var62;
        w0Var62.setIcon(R.drawable.msg_delete);
        w0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        w0Var62.setDuplicateParentStateEnabled(false);
        gaVar2.addView(w0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        iv0Var3.N0.add(w0Var62);
        w0Var62.setOnClickListener(new dr0(iv0Var3, 5));
        iv0Var3.H = new mt0(iv0Var3, context2);
        iv0Var3.I = new cv0(iv0Var3, context2);
        iv0Var3.K = new vu0(iv0Var3, context2, 1);
        iv0Var3.L = new vu0(iv0Var3, context2, 2);
        iv0Var3.M = new vu0(iv0Var3, context2, 4);
        iv0Var3.N = new ou0(iv0Var3, context2, iv0Var3.v1.getCurrentAccount(), iv0Var3.v1.getResourceProvider());
        iv0Var3.O = new vt0(iv0Var3, context2);
        iv0Var3.g0 = new du0(iv0Var3, context2, 1);
        iv0Var3.h0 = new du0(iv0Var3, context2, 4);
        iv0Var3.i0 = new du0(iv0Var3, context2, 3);
        iv0Var3.j0 = new yt0(iv0Var3, context2);
        iv0Var3.P = new st0(iv0Var3, context2);
        iv0Var3.Q = new qt0(iv0Var3, context2);
        iv0Var3.R = new ru0(iv0Var3, context2);
        iv0Var3.S = new tu0(iv0Var3, context2);
        if (!iv0Var3.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", iv0Var3.v1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            nt0 nt0Var2 = new nt0(iv0Var3, context2, iv0Var3.v1.getParentLayout(), bundle2);
            iv0Var3.T = nt0Var2;
            long j112 = iv0Var3.j1;
            org.telegram.ui.fo foVar2 = nt0Var2.a;
            foVar2.d4 = j112;
            foVar2.Pa = true;
            nt0Var2.setClipToOutline(true);
            nt0Var2.setOutlineProvider(new ot0());
        }
        rt0 rt0Var2 = new rt0(iv0Var3, context2);
        iv0Var3.a0 = rt0Var2;
        if (iv0Var3.F == 0) {
        }
        iv0Var3.c0 = new pt0(iv0Var3, context2);
        iv0Var3.b0 = new s4.y(new tr0(iv0Var3));
        iv0Var3.d0 = new fv0(iv0Var3, context2, false);
        iv0Var3.e0 = new ur0(iv0Var3, context2);
        iv0Var3.f0 = new fv0(iv0Var3, context2, true);
        iv0Var3.J = new wu0(iv0Var3, context2);
        if (!iv0Var3.r0()) {
        }
        f6Var2 = f6Var;
        r10 = 0;
        iv0Var = iv0Var3;
        iv0Var.setWillNotDraw(false);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            au0VarArr = iv0Var.k0;
            if (i20 >= au0VarArr.length) {
            }
            au0 au0Var6222 = iv0Var.k0[i20];
            a10Var4 = au0Var6222.v;
            au0Var6222.w = new rs0(iv0Var, context2, a10Var4);
            jx0Var = iv0Var.k0[i20].w;
            jx0Var.d(8, false);
            jx0Var2 = iv0Var.k0[i20].w;
            jx0Var2.setAnimateLayoutChange(true);
            au0 au0Var7222 = iv0Var.k0[i20];
            jx0Var3 = au0Var7222.w;
            au0Var7222.addView(jx0Var3, w7.a6.c(-1.0f, -1));
            jx0Var4 = iv0Var.k0[i20].w;
            jx0Var4.setOnTouchListener(new ai.h(23));
            jx0Var5 = iv0Var.k0[i20].w;
            jx0Var5.e(true, false);
            jx0Var6 = iv0Var.k0[i20].w;
            jx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            jx0Var7 = iv0Var.k0[i20].w;
            jx0Var7.f.setVisibility(8);
            jx0Var8 = iv0Var.k0[i20].w;
            jx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            jx0Var9 = iv0Var.k0[i20].w;
            jx0Var9.f.setVisibility(8);
            jx0Var10 = iv0Var.k0[i20].w;
            a10Var5 = iv0Var.k0[i20].v;
            jx0Var10.addView(a10Var5, w7.a6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            zt0Var16 = iv0Var.k0[i20].h;
            jx0Var11 = iv0Var.k0[i20].w;
            zt0Var16.setEmptyView(jx0Var11);
            zt0Var17 = iv0Var.k0[i20].h;
            zt0Var17.l1(0, true);
            au0[] au0VarArr2222 = iv0Var.k0;
            au0 au0Var8222 = au0VarArr2222[i20];
            zt0Var18 = au0VarArr2222[i20].h;
            au0Var8222.E = new yk0(zt0Var18, iv0Var.k0[i20].x);
            i20++;
            f6Var2 = f6Var;
            i18 = i21;
            i19 = i22;
        }
        view = iv0Var.W;
        if (view != null) {
        }
        org.telegram.ui.Cells.w0 w0Var722 = new org.telegram.ui.Cells.w0(context2);
        iv0Var.K0 = w0Var722;
        w0Var722.T((int) (System.currentTimeMillis() / 1000), false, false);
        w0Var722.setAlpha(0.0f);
        w0Var722.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
        w0Var722.setTranslationY(-AndroidUtilities.dp(48.0f));
        iv0Var.addView(w0Var722, w7.a6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        N = iv0Var.N();
        iv0Var2 = iv0Var;
        if (!N) {
        }
        iv0Var2.v1(false);
        iv0Var2.m1(false);
        if (iv0Var2.X0[0] >= 0) {
        }
        cs0Var = iv0Var2.W;
        if (cs0Var != null) {
        }
        iv0Var2.c2 = new nh(iv0Var2, 2);
    }

    public static ut0 M(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        ut0 ut0Var = new ut0(context, f6Var);
        TextView textView = ut0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ut0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ut0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ut0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ut0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ut0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ut0Var;
        }
        ImageView imageView = ut0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return ut0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return ut0Var;
    }

    public static TLRPC.ProfileTab d0(int i10, boolean z10) {
        if (i10 != 8 && i10 != 14 && !z10) {
            return null;
        }
        if (i10 == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i10 == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i10 == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i10 == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i10 == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i10 == 5) {
            return new TLRPC.TL_profileTabGifs();
        }
        if (i10 == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i10 != 14) {
            return null;
        }
        return new TLRPC.TL_profileTabGifts();
    }

    public static int e0(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        return profileTab instanceof TLRPC.TL_profileTabGifs ? 5 : -1;
    }

    public static void g(iv0 iv0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        my myVar = new my(iv0Var, i10, storyItem, 8);
        zh.i5 storiesController = iv0Var.getStoriesController();
        long j3 = iv0Var.j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j3, arrayList);
        wc.a0(iv0Var.v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), myVar).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zh.i5 getStoriesController() {
        return MessagesController.getInstance(this.v1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(iv0 iv0Var, TL_stories.StoryItem storyItem) {
        iv0Var.getStoriesController().o0(iv0Var.j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        wc.a0(iv0Var.v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(iv0 iv0Var, long j3, int i10, String str) {
        zh.w4 B = iv0Var.getStoriesController().B(j3, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((zh.b5) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(iv0 iv0Var, TL_stories.StoryItem storyItem, zh.b5 b5Var) {
        iv0Var.getStoriesController().c(b5Var.a, iv0Var.j1, storyItem);
        AndroidUtilities.runOnUIThread(new yo0(4, iv0Var, b5Var), 100L);
    }

    public static void m(iv0 iv0Var, HashSet hashSet, TL_stories.StoryItem storyItem, w70 w70Var, zh.b5 b5Var) {
        String formatString;
        long j3 = iv0Var.j1;
        if (hashSet.contains(Integer.valueOf(b5Var.a))) {
            iv0Var.getStoriesController().c(b5Var.a, j3, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, b5Var.b);
        } else {
            zh.i5 storiesController = iv0Var.getStoriesController();
            int i10 = b5Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j3, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, b5Var.b);
        }
        wc.a0(iv0Var.v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        w70Var.u();
    }

    public static void n(iv0 iv0Var, long j3, int i10) {
        zh.w4 B = iv0Var.getStoriesController().B(j3, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        zh.b5 b5Var = (zh.b5) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = b5Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.u7) {
            return ((org.telegram.ui.Cells.u7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            return ((org.telegram.ui.Cells.l7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            return ((org.telegram.ui.Cells.k7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        return i10 == 8 || i10 == 9 || w0(i10);
    }

    public static void q(au0 au0Var, xu0[] xu0VarArr, boolean z10) {
        yo0 yo0Var;
        if (!z10) {
            if (au0Var.G == null || (yo0Var = au0Var.H) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(yo0Var);
            au0Var.H.run();
            au0Var.H = null;
            au0Var.G = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || au0Var.G != null || au0Var.I || au0Var.h.getFastScroll() == null || !au0Var.h.getFastScroll().a0 || au0Var.h.getFastScroll().getVisibility() != 0 || xu0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        au0Var.I = true;
        Context context = au0Var.getContext();
        zq0 zq0Var = new zq0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.j6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        zq0Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qf, false)));
        zq0Var.addView(textView, w7.a6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        yq0 yq0Var = new yq0(context);
        yq0Var.a = new Random();
        Paint paint = new Paint(1);
        yq0Var.b = paint;
        Paint paint2 = new Paint(1);
        yq0Var.c = paint2;
        yq0Var.f = 1.0f;
        yq0Var.h = 0.0f;
        paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        Paint paint3 = new Paint();
        yq0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        yq0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        zq0Var.addView(yq0Var, w7.a6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        au0Var.G = zq0Var;
        au0Var.addView(zq0Var, w7.a6.c(-2.0f, -2));
        au0Var.G.setAlpha(0.0f);
        au0Var.G.setScaleX(0.8f);
        au0Var.G.setScaleY(0.8f);
        au0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        au0Var.invalidate();
        yo0 yo0Var2 = new yo0(3, au0Var, zq0Var);
        au0Var.H = yo0Var2;
        AndroidUtilities.runOnUIThread(yo0Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(iv0 iv0Var) {
        iv0 iv0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j3 = iv0Var.j1;
        xu0[] xu0VarArr = iv0Var.t1;
        au0 W = iv0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                iv0Var.H1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                iv0Var2 = iv0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new fg.k0((FrameLayout) iv0Var2, view, (View) W, (Object) bitmap2, 3)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new q70(W, 20)).setDuration(200L).start();
                av0 av0Var = iv0Var2.u1;
                int[] iArr = av0Var.c;
                arrayList = av0Var.n[0].a;
                xu0 xu0Var = xu0VarArr[0];
                int[] iArr2 = xu0Var.f;
                iArr2[1] = 0;
                i10 = xu0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                xu0Var.h = false;
                iv0Var2.y0(0, !DialogObject.isEncryptedDialog(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                iv0Var2.z0(false);
                iv0Var2.D1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    xu0 xu0Var2 = xu0VarArr[0];
                    int i12 = xu0Var2.q;
                    if (i12 == 0) {
                        xu0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            xu0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        xu0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        iv0Var2 = iv0Var;
        av0 av0Var2 = iv0Var2.u1;
        int[] iArr3 = av0Var2.c;
        arrayList = av0Var2.n[0].a;
        xu0 xu0Var3 = xu0VarArr[0];
        int[] iArr22 = xu0Var3.f;
        iArr22[1] = 0;
        i10 = xu0Var3.q;
        if (i10 != 0) {
        }
        xu0Var3.h = false;
        iv0Var2.y0(0, !DialogObject.isEncryptedDialog(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        iv0Var2.z0(false);
        iv0Var2.D1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j3);
        while (i11 < arrayList.size()) {
        }
    }

    public static void t(iv0 iv0Var, int i10, boolean z10) {
        au0[] au0VarArr = iv0Var.k0;
        if (au0VarArr[0].F == i10) {
            return;
        }
        au0 au0Var = au0VarArr[1];
        au0Var.F = i10;
        au0Var.setVisibility(0);
        iv0Var.k0();
        iv0Var.m1(true);
        iv0Var.h1 = z10;
        iv0Var.L0();
        iv0Var.A(!iv0Var.s0(i10), true);
        iv0Var.q1(true);
    }

    public static int u(iv0 iv0Var, s4.h0 h0Var) {
        if (h0Var == iv0Var.c0) {
            return 8;
        }
        if (h0Var == iv0Var.e0) {
            return 9;
        }
        for (hv0 hv0Var : iv0Var.Y1.values()) {
            if (hv0Var.c == h0Var) {
                return hv0Var.a;
            }
        }
        return -1;
    }

    public static int v(iv0 iv0Var, s4.h0 h0Var) {
        if (h0Var == iv0Var.d0) {
            return 8;
        }
        if (h0Var == iv0Var.f0) {
            return 9;
        }
        for (hv0 hv0Var : iv0Var.Y1.values()) {
            if (hv0Var.d == h0Var) {
                return hv0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        kj0 kj0Var = this.s0;
        if (kj0Var == null || this.V1 == z10) {
            return;
        }
        this.V1 = z10;
        if (z10 || kj0Var.getAnimatedDrawable().b0 >= 20) {
            kj0Var.getAnimatedDrawable().P(this.V1 ? 50 : 100);
        } else {
            kj0Var.getAnimatedDrawable().P(0);
        }
        if (z11) {
            kj0Var.getAnimatedDrawable().start();
        } else {
            kj0Var.getAnimatedDrawable().M(kj0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i10) {
        int i11;
        xu0[] xu0VarArr = this.t1;
        if (i10 == 0) {
            int i12 = xu0VarArr[0].q;
            i11 = i12 == 1 ? 6 : i12 == 2 ? 7 : 0;
        } else {
            i11 = i10 == 1 ? 1 : i10 == 2 ? 2 : i10 == 4 ? 4 : i10 == 5 ? 5 : 3;
        }
        xu0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.p2 p2Var = this.v1;
        p2Var.getMediaDataController().loadMedia(this.j1, 50, 0, xu0VarArr[i10].k, i11, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i10].p, null, null);
    }

    public final void B(int i10) {
        int i11;
        au0 W = W(this.p1);
        this.s = -1;
        if (W != null) {
            W.h.B0();
            this.q1 = i10;
            W.r.setVisibility(0);
            if (p0(this.p1)) {
                W.r.setAdapter(l1(this.p1));
            } else {
                W.r.setAdapter(this.I);
            }
            zt0 zt0Var = W.r;
            int paddingLeft = zt0Var.getPaddingLeft();
            zt0 zt0Var2 = W.r;
            int Z = Z(W.F);
            zt0Var2.d3 = Z;
            int paddingRight = W.r.getPaddingRight();
            zt0 zt0Var3 = W.r;
            int Y = Y(v0());
            zt0Var3.e3 = Y;
            zt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i10);
            W.r.a0();
            int i12 = 0;
            while (true) {
                au0[] au0VarArr = this.k0;
                if (i12 >= au0VarArr.length) {
                    break;
                }
                au0 au0Var = au0VarArr[i12];
                if (au0Var != null && ((i11 = au0Var.F) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(au0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.o1 = true;
            if (this.p1 == 0) {
                this.t1[0].g(true);
            }
            this.n1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new ws0(this, W, i13));
            ofFloat.addListener(new di.b3(this, p0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(wr.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public int B0() {
        return 0;
    }

    public final boolean C() {
        boolean r02 = r0();
        long j3 = this.j1;
        org.telegram.ui.ActionBar.p2 p2Var = this.v1;
        if (!r02) {
            return v0() || (p2Var != null && p2Var.getMessagesController().getStoriesController().h(j3));
        }
        TLRPC.User user = MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j3));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10, View view) {
        boolean z10;
        vr0 vr0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        TLRPC.User user2;
        int i11 = 3;
        ru0 ru0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.p2 p2Var = this.v1;
        final int i12 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.e1 != null && p2Var.getMessagesController().isUserNoForwards(this.e1)) {
                    s40 s40Var = this.E1;
                    if (s40Var != null) {
                        s40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.d1 != null) {
                    TLRPC.Chat chat2 = p2Var.getMessagesController().getChat(Long.valueOf(this.d1.id));
                    if (p2Var.getMessagesController().isChatNoForwards(chat2)) {
                        s40 s40Var2 = this.E1;
                        if (s40Var2 != null) {
                            s40Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.E1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    s40 s40Var3 = this.E1;
                    if (s40Var3 != null) {
                        s40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.wy wyVar = new org.telegram.ui.wy(bundle);
                wyVar.C2 = new cr0(this);
                p2Var.presentFragment(wyVar);
                return;
            }
            if (i10 == 102) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() != 1) {
                    return;
                }
                MessageObject messageObject = (MessageObject) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                Bundle bundle2 = new Bundle();
                long dialogId = messageObject.getDialogId();
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                } else if (DialogObject.isUserDialog(dialogId)) {
                    bundle2.putLong("user_id", dialogId);
                } else {
                    TLRPC.Chat chat3 = p2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat3 != null && chat3.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat3.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.eo eoVar = new org.telegram.ui.eo(bundle2);
                eoVar.L7 = messageObject.getId();
                long j3 = this.F;
                if (j3 != 0) {
                    mg.d.a(eoVar, MessagesStorage.TopicKey.of(dialogId, j3));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                p2Var.presentFragment(eoVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    pt0 pt0Var = this.c0;
                    if (pt0Var == null || pt0Var.s == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < sparseArrayArr[0].size(); i13++) {
                        arrayList.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i13)).getId()));
                    }
                    T0(arrayList, i10 == 103);
                    L(false);
                    return;
                }
                SavedMessagesController savedMessagesController = p2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i14 = 0; i14 < savedMessagesController.allDialogs.size(); i14++) {
                    long j10 = savedMessagesController.allDialogs.get(i14).dialogId;
                    if (ru0Var.w.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    z10 = true;
                    int i15 = 0;
                    while (true) {
                        au0[] au0VarArr = this.k0;
                        if (i15 >= au0VarArr.length) {
                            break;
                        }
                        au0 au0Var = au0VarArr[i15];
                        if (au0Var.F == 11) {
                            au0Var.x.h1(0, 0);
                            break;
                        }
                        i15++;
                    }
                } else {
                    z10 = true;
                    p2Var.showDialog(new qg.k0(33, p2Var.getCurrentAccount(), getContext(), p2Var, null));
                }
                L(z10);
                return;
            }
            return;
        }
        boolean p02 = p0(getSelectedTab());
        org.telegram.ui.ActionBar.f6 f6Var = this.F1;
        if (p02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!r0() || (vr0Var = this.U) == null || vr0Var.getCurrentList() == null) {
                    final ArrayList arrayList3 = new ArrayList();
                    for (int i16 = 0; i16 < sparseArrayArr[0].size(); i16++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i16)).storyItem;
                        if (storyItem != null) {
                            arrayList3.add(storyItem);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, f6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.R = string;
                    d2Var.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.Components.jr0
                        public final /* synthetic */ iv0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.c2
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i17) {
                            switch (i12) {
                                case 0:
                                    iv0 iv0Var = this.b;
                                    org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var.v1;
                                    zh.i5 storiesController = p2Var2.getMessagesController().getStoriesController();
                                    long j11 = iv0Var.j1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j11, arrayList4);
                                    wc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    iv0Var.L(false);
                                    break;
                                default:
                                    iv0 iv0Var2 = this.b;
                                    iv0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i18 >= arrayList5.size()) {
                                            iv0Var2.L(true);
                                            break;
                                        } else {
                                            iv0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i18)).longValue());
                                            i18++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(4));
                    d2Var.show();
                    d2Var.h();
                    return;
                }
                zh.s4 currentList = vr0Var.getCurrentList();
                ArrayList arrayList4 = new ArrayList();
                for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                    TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                    if (storyItem2 != null) {
                        arrayList4.add(storyItem2.media);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, f6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                d2Var2.R = string2;
                d2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, currentList, arrayList4, 29));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new gp0(i11));
                d2Var2.show();
                d2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j11 = this.j1;
            if (DialogObject.isEncryptedDialog(j11)) {
                encryptedChat = org.telegram.messenger.a2.m(p2Var.getMessagesController(), j11);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j11)) {
                user = p2Var.getMessagesController().getUser(Long.valueOf(j11));
                chat = null;
                encryptedChat = null;
            } else {
                chat = p2Var.getMessagesController().getChat(Long.valueOf(-j11));
                user = null;
                encryptedChat = null;
            }
            d5.z(p2Var, user, chat, encryptedChat, null, this.c1, null, this.Z0, null, 0, 0, null, new br0(this, r10 ? 1 : 0), null, this.F1);
            return;
        }
        SavedMessagesController savedMessagesController2 = p2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i18 = 0; i18 < savedMessagesController2.allDialogs.size(); i18++) {
            long j12 = savedMessagesController2.allDialogs.get(i18).dialogId;
            if (ru0Var.w.contains(Long.valueOf(j12))) {
                arrayList5.add(Long.valueOf(j12));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z11 = false;
        } else {
            Long l4 = (Long) arrayList5.get(0);
            long longValue = l4.longValue();
            z11 = longValue == p2Var.getUserConfig().getClientUserId();
            if (longValue < 0) {
                TLRPC.Chat chat4 = p2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat4 != null) {
                    str = chat4.title;
                }
            } else if (longValue >= 0 && (user2 = p2Var.getMessagesController().getUser(l4)) != null) {
                str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, f6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
        d2Var3.R = formatString;
        d2Var3.T = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i19 = r10 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.Components.jr0
            public final /* synthetic */ iv0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i172) {
                switch (i19) {
                    case 0:
                        iv0 iv0Var = this.b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var.v1;
                        zh.i5 storiesController = p2Var2.getMessagesController().getStoriesController();
                        long j112 = iv0Var.j1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j112, arrayList42);
                        wc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        iv0Var.L(false);
                        break;
                    default:
                        iv0 iv0Var2 = this.b;
                        iv0Var2.getClass();
                        int i182 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i182 >= arrayList52.size()) {
                                iv0Var2.L(true);
                                break;
                            } else {
                                iv0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i182)).longValue());
                                i182++;
                            }
                        }
                }
            }
        });
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        p2Var.showDialog(d2Var3);
        TextView textView = (TextView) d2Var3.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof i40);
    }

    public final boolean E() {
        au0 au0Var;
        au0[] au0VarArr = this.k0;
        if (au0VarArr == null || (au0Var = au0VarArr[0]) == null) {
            return false;
        }
        if (this.k1 && p0(au0Var.F)) {
            return false;
        }
        boolean p02 = p0(au0VarArr[0].F);
        int i10 = this.m1[p02 ? 1 : 0];
        return i10 != X(p02 ? 1 : 0, i10, false);
    }

    public final void F() {
        xs0 xs0Var = this.I0;
        if (xs0Var.d(xs0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = xs0Var.getFirstTabId();
        xs0Var.setInitialTabId(firstTabId);
        this.k0[0].F = firstTabId;
        m1(false);
    }

    public final void F0() {
        zh.a5 a5Var;
        zh.a5 a5Var2;
        this.G1.removeAllObservers();
        pt0 pt0Var = this.c0;
        if (pt0Var != null && (a5Var2 = pt0Var.s) != null && a5Var2 != null) {
            a5Var2.z(pt0Var.v);
        }
        ur0 ur0Var = this.e0;
        if (ur0Var != null && (a5Var = ur0Var.s) != null && a5Var != null) {
            a5Var.z(ur0Var.v);
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            gv0 gv0Var = ((hv0) it.next()).c;
            zh.a5 a5Var3 = gv0Var.s;
            if (a5Var3 != null && a5Var3 != null) {
                a5Var3.z(gv0Var.v);
            }
        }
    }

    public final void G(au0 au0Var, vl0 vl0Var, s4.c0 c0Var) {
        int i10;
        int i11;
        s4.c1 K;
        zh.a5 a5Var;
        if (this.o1 || this.J1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (vl0Var.getFastScroll() == null || !vl0Var.getFastScroll().n || currentTimeMillis - au0Var.a >= 300) {
            au0Var.a = currentTimeMillis;
            if ((this.V0 && this.U0 && au0Var.F != 11) || au0Var.F == 7) {
                return;
            }
            int L0 = c0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(c0Var.N0() - L0) + 1;
            int h = vl0Var.getAdapter() == null ? 0 : vl0Var.getAdapter().h();
            int i12 = au0Var.F;
            int[] iArr = this.m1;
            xu0[] xu0VarArr = this.t1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                h = xu0VarArr[i12].d() + xu0VarArr[i12].a.size();
                xu0 xu0Var = xu0VarArr[i12];
                if (xu0Var.h && xu0Var.e.size() > 2 && au0Var.F == 0 && xu0VarArr[i12].a.size() != 0) {
                    float f7 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((vl0Var.getMeasuredHeight() / (vl0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((fu0) xu0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((fu0) xu0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < xu0VarArr[i12].m && xu0VarArr[0].m - i10 > measuredHeight)) {
                        my myVar = new my(this, i12, vl0Var, 10);
                        this.J1 = myVar;
                        AndroidUtilities.runOnUIThread(myVar);
                        return;
                    }
                }
            }
            int i13 = au0Var.F;
            if (i13 == 7) {
                return;
            }
            if (p0(i13)) {
                fv0 k12 = k1(au0Var.F);
                if (k12 == null || (a5Var = k12.s) == null || L0 + abs <= a5Var.i() - iArr[1]) {
                    return;
                }
                k12.P();
                return;
            }
            int i14 = au0Var.F;
            if (i14 == 6) {
                if (abs > 0) {
                    st0 st0Var = this.P;
                    boolean z10 = st0Var.h;
                    ArrayList arrayList = st0Var.d;
                    if (z10 || st0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    st0.E(st0Var, ((TLRPC.Chat) hc.b.i(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.p2 p2Var = this.v1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < au0Var.h.getChildCount(); i16++) {
                    View childAt = au0Var.h.getChildAt(i16);
                    au0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                s4.h0 adapter = au0Var.h.getAdapter();
                tu0 tu0Var = this.S;
                if (adapter != tu0Var) {
                    if (i15 + 1 >= p2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        p2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < tu0Var.h.size() + tu0Var.e.size() || tu0Var.s || tu0Var.r) {
                        return;
                    }
                    tu0Var.r = true;
                    tu0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > h - i17 || xu0VarArr[i18].o) {
                xu0 xu0Var2 = xu0VarArr[i18];
                if (!xu0Var2.g) {
                    if (i14 == 0) {
                        int i19 = xu0VarArr[0].q;
                        i11 = i19 == 1 ? 6 : i19 == 2 ? 7 : 0;
                    } else {
                        i11 = i14 == 1 ? 1 : i14 == 2 ? 2 : i14 == 4 ? 4 : i14 == 5 ? 5 : i14 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = xu0Var2.i;
                    if (!zArr[0]) {
                        xu0Var2.g = true;
                        p2Var.getMediaDataController().loadMedia(this.j1, 50, xu0VarArr[i18].j[0], 0, i11, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i18].p, null, null);
                    } else if (this.c1 != 0 && !zArr[1]) {
                        xu0Var2.g = true;
                        p2Var.getMediaDataController().loadMedia(this.c1, 50, xu0VarArr[i18].j[1], 0, i11, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i18].p, null, null);
                    }
                }
            }
            int i20 = xu0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.H.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                xu0 xu0Var3 = xu0VarArr[i18];
                if (!xu0Var3.g && !xu0Var3.l && !xu0Var3.o) {
                    A0(au0Var.F);
                }
            }
            au0 au0Var2 = this.k0[0];
            if (au0Var2.h == vl0Var) {
                int i21 = au0Var2.F;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = vl0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.v7;
                    org.telegram.ui.Cells.w0 w0Var = this.K0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.e2) {
                            w0Var.T(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
                        MessageObject messageObject = v7Var.e <= 0 ? null : v7Var.b[0];
                        if (messageObject != null) {
                            w0Var.T(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public final void G0(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null || this.o1) {
            return;
        }
        cs0 cs0Var = this.W;
        if (cs0Var == null || !cs0Var.w) {
            int i12 = 0;
            i12 = 0;
            String str2 = null;
            if (this.C1) {
                int i13 = 8;
                if (i11 == 8 && !C()) {
                    return;
                }
                char c10 = messageObject.getDialogId() == this.j1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.Z0;
                if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c10].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.a1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.a1++;
                    }
                }
                D0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    b1(false);
                } else {
                    this.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.l0.setVisibility(this.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = this.u0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.t0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    u1();
                }
                this.b1 = false;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.v7) {
                    ((org.telegram.ui.Cells.v7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.u7) {
                    ((org.telegram.ui.Cells.u7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                hs0 hs0Var = this.r1;
                xu0[] xu0VarArr = this.t1;
                org.telegram.ui.ActionBar.p2 p2Var = this.v1;
                if (i11 == 0) {
                    xu0 xu0Var = xu0VarArr[i11];
                    int i14 = i10 - xu0Var.m;
                    if (i14 >= 0 && i14 < xu0Var.a.size()) {
                        PhotoViewer.t1().K2(null, p2Var, null);
                        PhotoViewer.t1().a2(xu0VarArr[i11].a, i14, this.j1, this.c1, this.F, hs0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().K2(null, p2Var, null);
                    int indexOf = xu0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().a2(org.telegram.messenger.a2.l(messageObject), 0, 0L, 0L, 0L, hs0Var);
                    } else {
                        PhotoViewer.t1().a2(xu0VarArr[i11].a, indexOf, this.j1, this.c1, this.F, hs0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.l7) {
                        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (l7Var.G) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, p2Var, null);
                                int indexOf2 = xu0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().a2(org.telegram.messenger.a2.l(messageObject), 0, 0L, 0L, 0L, hs0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().a2(xu0VarArr[i11].a, indexOf2, this.j1, this.c1, this.F, hs0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, p2Var.getParentActivity(), p2Var);
                        } else if (l7Var.F) {
                            p2Var.getFileLoader().cancelLoadFile(document);
                            l7Var.f(true);
                        } else {
                            MessageObject message = l7Var.getMessage();
                            message.putInDownloadsStore = true;
                            p2Var.getFileLoader().loadFile(document, message, 0, 0);
                            l7Var.f(true);
                        }
                    }
                } else if (i11 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.G1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                                    p2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                zu.J(p2Var, messageObject, this.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.o7) view).E;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            R0(str);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (p0(i11)) {
                    fv0 k12 = k1(i11);
                    zh.a5 a5Var = k12 != null ? k12.s : null;
                    if (a5Var == null) {
                        return;
                    }
                    zh.u7 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    zh.s5 a2 = zh.s5.a(this.k0[0].h);
                    a2.e = new pv(a5Var, 18);
                    if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).s1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a2.s += i12;
                    orCreateStoryViewer.C(context, id2, a5Var, a2);
                }
            }
            p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        vr0 vr0Var;
        au0[] au0VarArr = this.k0;
        int i10 = au0VarArr[0].F;
        if (i10 == 13 && (vr0Var = this.U) != null) {
            View currentView = vr0Var.n.getCurrentView();
            if (currentView instanceof ai.a0) {
                ai.a0 a0Var = (ai.a0) currentView;
                ai.r rVar = a0Var.v;
                ai.o oVar = a0Var.f;
                if (a0Var.a != null && a0Var.getParent() != null) {
                    if (!a0Var.b || a0Var.K) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (a0Var.L && !a0Var.K && motionEvent.getPointerCount() == 2) {
                                a0Var.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                a0Var.Q = 1.0f;
                                a0Var.N = motionEvent.getPointerId(0);
                                a0Var.O = motionEvent.getPointerId(1);
                                oVar.I0(false);
                                oVar.cancelLongPress();
                                oVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) a0Var.getParent();
                                a0Var.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - a0Var.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - a0Var.getY());
                                int i11 = a0Var.U;
                                Rect rect = a0Var.V;
                                a0Var.S = -1;
                                int i12 = y3 + oVar.X2;
                                for (int i13 = 0; i13 < oVar.getChildCount(); i13++) {
                                    View childAt = oVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
                                        a0Var.S = RecyclerView.S(childAt);
                                        a0Var.T = childAt.getTop();
                                    }
                                }
                                a0Var.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) a0Var.getParent()).getY()) - a0Var.getY() > 0.0f) {
                                    a0Var.L = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (a0Var.K || a0Var.M)) {
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                                if (a0Var.N == motionEvent.getPointerId(i16)) {
                                    i14 = i16;
                                }
                                if (a0Var.O == motionEvent.getPointerId(i16)) {
                                    i15 = i16;
                                }
                            }
                            if (i14 == -1 || i15 == -1) {
                                a0Var.L = false;
                                a0Var.M = false;
                                a0Var.K = false;
                                a0Var.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / a0Var.P;
                            a0Var.Q = hypot;
                            if (!a0Var.K && (hypot > 1.01f || hypot < 0.99f)) {
                                a0Var.K = true;
                                boolean z10 = hypot > 1.0f;
                                a0Var.R = z10;
                                a0Var.b(z10);
                            }
                            if (a0Var.K) {
                                boolean z11 = a0Var.R;
                                if ((!z11 || a0Var.Q >= 1.0f) && (z11 || a0Var.Q <= 1.0f)) {
                                    a0Var.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.a2.y(2.0f, a0Var.Q, 1.0f, 1.0f) : (1.0f - a0Var.Q) / 0.5f));
                                } else {
                                    a0Var.c = 0.0f;
                                }
                                float f7 = a0Var.c;
                                if (f7 == 1.0f || f7 == 0.0f) {
                                    if (f7 == 1.0f) {
                                        int i17 = a0Var.e;
                                        int ceil = (((int) Math.ceil(a0Var.S / a0Var.e)) * i17) + ((int) ((a0Var.W.G.z1 / (oVar.getMeasuredWidth() - ((int) (oVar.getMeasuredWidth() / a0Var.e)))) * (i17 - 1)));
                                        if (ceil >= rVar.h()) {
                                            ceil = rVar.h() - 1;
                                        }
                                        a0Var.S = ceil;
                                    }
                                    a0Var.a();
                                    if (a0Var.c == 0.0f) {
                                        a0Var.R = !a0Var.R;
                                    }
                                    a0Var.b(a0Var.R);
                                    a0Var.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                oVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((a0Var.N == motionEvent.getPointerId(0) && a0Var.O == motionEvent.getPointerId(1)) || (a0Var.N == motionEvent.getPointerId(1) && a0Var.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && a0Var.K) {
                            a0Var.M = false;
                            a0Var.L = false;
                            a0Var.K = false;
                            a0Var.a();
                        }
                        return a0Var.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.o1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        au0VarArr[0].h.I0(false);
                        au0VarArr[0].h.cancelLongPress();
                        au0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - au0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - au0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y10 + au0VarArr[0].h.X2;
                        if (getY() != 0.0f && this.E == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < au0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = au0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                au0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.s == -1) {
                            this.s = (int) (((this.m1[p0(au0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / au0VarArr[0].h.getMeasuredWidth(), 0.0f))) + au0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - au0VarArr[0].getY() > 0.0f) {
                            this.b = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.a || this.c)) {
                    int i21 = -1;
                    int i22 = -1;
                    for (int i23 = 0; i23 < motionEvent.getPointerCount(); i23++) {
                        if (this.e == motionEvent.getPointerId(i23)) {
                            i21 = i23;
                        }
                        if (this.f == motionEvent.getPointerId(i23)) {
                            i22 = i23;
                        }
                    }
                    if (i21 == -1 || i22 == -1) {
                        this.b = false;
                        this.c = false;
                        this.a = false;
                        T();
                        return false;
                    }
                    float hypot2 = ((float) Math.hypot(motionEvent.getX(i22) - motionEvent.getX(i21), motionEvent.getY(i22) - motionEvent.getY(i21))) / this.h;
                    this.n = hypot2;
                    if (!this.a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                        this.a = true;
                        boolean z12 = hypot2 > 1.0f;
                        this.r = z12;
                        e1(z12);
                    }
                    if (this.a) {
                        boolean z13 = this.r;
                        if ((!z13 || this.n >= 1.0f) && (z13 || this.n <= 1.0f)) {
                            this.n1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.a2.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.n1 = 0.0f;
                        }
                        float f10 = this.n1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            s4.h0 k12 = p0(this.p1) ? k1(this.p1) : this.H;
                            if (this.n1 == 1.0f) {
                                int i24 = this.q1;
                                int ceil2 = (((int) Math.ceil(this.s / this.q1)) * i24) + ((int) ((this.z1 / (au0VarArr[0].h.getMeasuredWidth() - ((int) (au0VarArr[0].h.getMeasuredWidth() / this.q1)))) * (i24 - 1)));
                                if (ceil2 >= k12.h()) {
                                    ceil2 = k12.h() - 1;
                                }
                                this.s = ceil2;
                            }
                            T();
                            if (this.n1 == 0.0f) {
                                this.r = !this.r;
                            }
                            e1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        au0VarArr[0].h.invalidate();
                        au0 au0Var = au0VarArr[0];
                        if (au0Var.G != null) {
                            au0Var.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.a) {
                    this.c = false;
                    this.b = false;
                    this.a = false;
                    T();
                }
                return this.a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z10) {
        cs0 cs0Var;
        final TL_stories.StoryItem storyItem;
        pt0 pt0Var;
        zh.a5 a5Var;
        final int i11 = 0;
        if (!this.C1) {
            org.telegram.ui.ActionBar.p2 p2Var = this.v1;
            if (p2Var.getParentActivity() != null && messageObject != null && ((cs0Var = this.W) == null || !cs0Var.w)) {
                AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
                long j3 = this.j1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(w0(getClosestTab()) || getClosestTab() == 8) || this.C1)) {
                    char c10 = messageObject.getDialogId() == j3 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.Z0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.a1++;
                    }
                    this.l0.setVisibility(this.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = this.u0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.t0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        w0Var2.setVisibility(i12);
                    }
                    this.A0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.N0;
                        if (i14 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i14);
                        AndroidUtilities.clearDrawableAnimation(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i14++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.b1 = false;
                    if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.v7) {
                        ((org.telegram.ui.Cells.v7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) view).i(true, true);
                    }
                    if (!this.C1) {
                        b1(true);
                    }
                    D0(sparseArrayArr[0]);
                    p1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                    u7Var.k(u7Var.n, u7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean w02 = w0(getClosestTab());
                    w70 I = w70.I(p2Var, view);
                    w70 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(I, 25), false);
                    J.k();
                    w70.f(J, getStoriesController().B(j3, true), hashSet, true, new gf(this, storyItem2, I, 21), new gg.u1(this, hashSet, storyItem2, I, 7));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new di.p2(I, J, 9), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new di.q(this, messageObject, view, i10, 23), false);
                    final int i15 = 3;
                    if (w02) {
                        int h12 = h1(getClosestTab());
                        String w10 = getStoriesController().w(h12, j3);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new zd(this, h12, 6), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new di.q(this, h12, storyItem, w10, 24), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (pt0Var = this.c0) != null && (a5Var = pt0Var.s) != null) {
                            if (a5Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.er0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                iv0 iv0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iv0Var.getContext(), 0, iv0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kr0(iv0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(5));
                                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                                d2Var.show();
                                                d2Var.h();
                                                break;
                                            case 1:
                                                iv0 iv0Var2 = this;
                                                iv0Var2.getClass();
                                                iv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                iv0 iv0Var3 = this;
                                                iv0Var3.getClass();
                                                iv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                iv0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.er0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                iv0 iv0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iv0Var.getContext(), 0, iv0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kr0(iv0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(5));
                                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                                d2Var.show();
                                                d2Var.h();
                                                break;
                                            case 1:
                                                iv0 iv0Var2 = this;
                                                iv0Var2.getClass();
                                                iv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                iv0 iv0Var3 = this;
                                                iv0Var3.getClass();
                                                iv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                iv0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.er0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        iv0 iv0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iv0Var.getContext(), 0, iv0Var.F1);
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kr0(iv0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(5));
                                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                        d2Var.show();
                                        d2Var.h();
                                        break;
                                    case 1:
                                        iv0 iv0Var2 = this;
                                        iv0Var2.getClass();
                                        iv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        iv0 iv0Var3 = this;
                                        iv0Var3.getClass();
                                        iv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        iv0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.er0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    iv0 iv0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iv0Var.getContext(), 0, iv0Var.F1);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kr0(iv0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(5));
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                    d2Var.show();
                                    d2Var.h();
                                    break;
                                case 1:
                                    iv0 iv0Var2 = this;
                                    iv0Var2.getClass();
                                    iv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    iv0 iv0Var3 = this;
                                    iv0Var3.getClass();
                                    iv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    iv0.h(this, storyItem);
                                    break;
                            }
                        }
                    }, true);
                    I.i = 3;
                    I.u = true;
                    I.v = true;
                    I.L = true;
                    I.M = 3;
                    Point point = AndroidUtilities.displaySize;
                    Point point2 = AndroidUtilities.displaySize;
                    int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                    I.N = min;
                    I.O = (min * 4) / 3;
                    I.t = true;
                    I.P = true;
                    I.W = true;
                    I.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void I() {
        float abs;
        au0[] au0VarArr = this.k0;
        au0 au0Var = au0VarArr[0];
        if (au0Var == null || au0VarArr[1] == null) {
            return;
        }
        float f7 = 0.0f;
        cs0 cs0Var = this.W;
        if (cs0Var != null) {
            char c10 = (!p0(au0Var.F) || au0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (au0VarArr[1].getVisibility() == 0 ? (!p0(au0VarArr[1].F) || au0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                cs0Var.setTranslationX(c10 != 0 ? 0.0f : au0VarArr[0].getMeasuredWidth());
            } else {
                cs0Var.setTranslationX(au0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(cs0Var.getTranslationX()) / cs0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < au0VarArr.length; i10++) {
                if (au0VarArr[i10].getVisibility() == 0) {
                    gs0 gs0Var = au0VarArr[i10].h;
                    View childAt = gs0Var.getChildCount() == 0 ? null : gs0Var.getChildAt(0);
                    f10 += Utilities.clamp01(1.0f - (au0VarArr[i10].getTranslationX() / au0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - gs0Var.getPaddingTop() : gs0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f10) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            cs0Var.setAlpha(clamp01);
            cs0Var.setScaleX(lerp);
            cs0Var.setScaleY(lerp);
            cs0Var.setTranslationY(this.K1 + f10);
            f7 = abs;
        }
        K();
        if (this.U1 != f7) {
            this.U1 = f7;
            o0();
            invalidate();
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J() {
        AnimatorSet animatorSet;
        if (!this.g1) {
            return false;
        }
        boolean z10 = this.i1;
        au0[] au0VarArr = this.k0;
        if (!z10) {
            if (Math.abs(au0VarArr[1].getTranslationX()) < 1.0f) {
                au0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.h1 ? -1 : 1));
                au0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.f1;
                if (animatorSet != null) {
                }
                this.g1 = false;
            }
            M0(getTabProgress());
            return this.g1;
        }
        if (Math.abs(au0VarArr[0].getTranslationX()) < 1.0f) {
            au0VarArr[0].setTranslationX(0.0f);
            au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth() * (this.h1 ? 1 : -1));
            animatorSet = this.f1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f1 = null;
            }
            this.g1 = false;
        }
        M0(getTabProgress());
        return this.g1;
    }

    public final void J0(float f7) {
        au0[] au0VarArr = this.k0;
        if (f7 != 1.0f || au0VarArr[1].getVisibility() == 0) {
            if (this.h1) {
                au0VarArr[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth() - (au0VarArr[0].getMeasuredWidth() * f7));
            } else {
                au0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f7);
                au0VarArr[1].setTranslationX((au0VarArr[0].getMeasuredWidth() * f7) - au0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f7);
            this.p0 = a02;
            this.r0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.w0 w0Var = this.n0;
            if (w0Var == null || D()) {
                this.o0 = b0(f7);
                t1();
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            q1(false);
            if (f7 == 1.0f) {
                au0 au0Var = au0VarArr[0];
                au0VarArr[0] = au0VarArr[1];
                au0VarArr[1] = au0Var;
                au0Var.setVisibility(8);
                if (w0Var != null && this.x0 == 2) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                this.x0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        qs qsVar = this.P0;
        if (qsVar != null) {
            cs0 cs0Var = this.W;
            float f7 = 0.0f;
            if (cs0Var != null) {
                f7 = 0.0f + (cs0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(cs0Var.getTranslationX() / cs0Var.getMeasuredWidth())));
            }
            qsVar.setTranslationY(this.K1 + f7);
        }
    }

    public final boolean L(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.C1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.Z0;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.a1 = 0;
        D0(sparseArrayArr[0]);
        vr0 vr0Var = this.U;
        if (vr0Var != null) {
            vr0Var.h();
            vr0Var.j();
        }
        b1(false);
        r1(z10);
        ru0 ru0Var = this.R;
        if (ru0Var != null) {
            ru0Var.w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10 = v0() || q0();
        dv0 dv0Var = this.e0.w;
        if (dv0Var != null) {
            dv0Var.b(z10 && getClosestTab() == 9);
        }
        dv0 dv0Var2 = this.c0.w;
        if (dv0Var2 != null) {
            dv0Var2.b(z10 && getClosestTab() == 8);
        }
        for (hv0 hv0Var : this.Y1.values()) {
            gv0 gv0Var = hv0Var.c;
            if (gv0Var.s != null) {
                gv0Var.w.b(z10 && getClosestTab() == hv0Var.a);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.n0;
        if (w0Var != null) {
            us0 us0Var = this.J0;
            w0Var.setSearchFieldHint(LocaleController.getString((us0Var != null && us0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f7) {
        E0();
    }

    public boolean N() {
        return this instanceof i40;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        au0[] au0VarArr = this.k0;
        motionEvent.offsetLocation(x10 - au0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - au0VarArr[0].getY()) - au0VarArr[0].h.getFastScroll().getY());
        return au0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10) {
        new org.telegram.ui.z71(p2Var, j3, this.m1[1], new sc(this, j3, i10)).show();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10) {
        d5.v0(p2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j3))), LocaleController.getString(R.string.Delete), true, new org.telegram.messenger.t5(this, j3, i10, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i10 >= au0VarArr.length) {
                return;
            }
            au0 au0Var = au0VarArr[i10];
            if (au0Var != null && au0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < au0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = au0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + au0VarArr[i10].h.X2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + au0VarArr[i10].getX(), childAt.getY() + au0VarArr[i10].h.getY() + au0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof xv0)) {
                            arrayList.add((xv0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i10++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10) {
        String w10 = getStoriesController().w(i10, j3);
        Context context = p2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        j2.c cVar = new j2.c(this, j3, i10);
        Pattern pattern = d5.a;
        d5.R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, cVar);
    }

    public final boolean R(int i10) {
        xu0[] xu0VarArr = this.u1.n;
        if (xu0VarArr == null) {
            return false;
        }
        xu0[] xu0VarArr2 = this.t1;
        if (i10 == 0) {
            xu0 xu0Var = xu0VarArr2[i10];
            if (!xu0Var.h) {
                int[] iArr = xu0Var.f;
                int[] iArr2 = xu0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = xu0VarArr2[i10].f;
            int[] iArr4 = xu0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        xu0VarArr2[i10].a.addAll(xu0VarArr[i10].a);
        xu0VarArr2[i10].c.addAll(xu0VarArr[i10].c);
        for (Map.Entry entry : xu0VarArr[i10].d.entrySet()) {
            xu0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            xu0VarArr2[i10].b[i11] = xu0VarArr[i10].b[i11].clone();
            xu0 xu0Var2 = xu0VarArr2[i10];
            int[] iArr5 = xu0Var2.j;
            xu0 xu0Var3 = xu0VarArr[i10];
            iArr5[i11] = xu0Var3.j[i11];
            xu0Var2.i[i11] = xu0Var3.i[i11];
        }
        xu0VarArr2[i10].e.addAll(xu0VarArr[i10].e);
        return !xu0VarArr[i10].a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.p2 p2Var = this.v1;
        if (shouldShowUrlInAlert) {
            d5.q0(p2Var, str, true, true);
        } else {
            nf.f.s(p2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, vl0 vl0Var, boolean z10) {
        ArrayList arrayList = this.t1[i10].e;
        int L0 = ((s4.c0) vl0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            fu0 fu0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((fu0) arrayList.get(i11)).b) {
                        fu0Var = (fu0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (fu0Var == null) {
                    fu0Var = (fu0) hc.b.i(1, arrayList);
                }
            }
            if (fu0Var != null) {
                y0(i10, fu0Var.d, fu0Var.b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        au0[] au0VarArr;
        au0 au0Var;
        int i10;
        s4.h0 adapter;
        if (this.o1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                au0VarArr = this.k0;
                if (i12 >= au0VarArr.length) {
                    au0Var = null;
                    break;
                }
                au0Var = au0VarArr[i12];
                if (au0Var.F == this.p1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (au0Var != null) {
                boolean p02 = p0(au0Var.F);
                float f7 = this.n1;
                xu0[] xu0VarArr = this.t1;
                if (f7 != 1.0f) {
                    if (f7 == 0.0f) {
                        this.o1 = false;
                        if (this.p1 == 0) {
                            xu0VarArr[0].g(false);
                        }
                        au0Var.r.setVisibility(8);
                        au0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f7 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new ws0(this, au0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.gj(this, z10, p02 ? 1 : 0, au0Var));
                    ofFloat.setInterpolator(wr.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.o1 = false;
                int i13 = this.q1;
                int[] iArr = this.m1;
                iArr[p02 ? 1 : 0] = i13;
                if (!p02) {
                    SharedConfig.setMediaColumnsCount(i13);
                } else if (c0(au0Var.F) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.q1);
                }
                for (int i14 = 0; i14 < au0VarArr.length; i14++) {
                    au0 au0Var2 = au0VarArr[i14];
                    if (au0Var2 != null && au0Var2.h != null && (((i10 = au0Var2.F) == 0 || p0(i10)) && (adapter = au0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            xu0VarArr[0].g(false);
                        }
                        au0VarArr[i14].r.setVisibility(8);
                        au0VarArr[i14].x.y1(iArr[p02 ? 1 : 0]);
                        au0VarArr[i14].h.a0();
                        au0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(au0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    X0();
                    return;
                }
                while (i11 < au0VarArr.length) {
                    au0 au0Var3 = au0VarArr[i11];
                    if (au0Var3.F == this.p1) {
                        View m10 = au0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        au0 au0Var4 = au0VarArr[i11];
                        au0Var4.x.h1(this.s, (-au0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        pt0 pt0Var = this.c0;
        if (pt0Var == null || pt0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.v1;
        if (z10 && arrayList.size() > p2Var.getMessagesController().storiesPinnedToTopCountMax) {
            wc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        zh.a5 a5Var = pt0Var.s;
        int i10 = a5Var.c;
        ArrayList arrayList2 = a5Var.g;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        boolean z11 = true;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            num.getClass();
            if (z10 && !arrayList3.contains(num)) {
                arrayList3.add(0, num);
            } else if (!z10 && arrayList3.contains(num)) {
                arrayList3.remove(num);
            }
        }
        boolean z12 = arrayList3.size() > MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (!z12) {
            boolean z13 = arrayList2.size() != arrayList3.size();
            if (!z13) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i11) != arrayList3.get(i11)) {
                        z13 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (z13) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                a5Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(a5Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new bi.g1(20));
            }
            z11 = z12;
        }
        if (z11) {
            wc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            wc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            wc.a0(p2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
        }
    }

    public final void U(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                this.A0.setTextSize(20);
            } else {
                this.A0.setTextSize(18);
            }
        }
        if (i10 == 0) {
            this.H.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z10) {
        au0 au0Var;
        vr0 vr0Var;
        int closestTab = getClosestTab();
        xs0 xs0Var = this.I0;
        int i10 = -1;
        int i11 = xs0Var.O.get(xs0Var.n + (z10 ? 1 : -1), -1);
        cs0 cs0Var = this.W;
        if (cs0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                u81 u81Var = cs0Var.n;
                i10 = u81Var.b0.get(u81Var.F + (z10 ? 1 : -1), -1);
            } else if (w0(i11) || i11 == 8) {
                i10 = cs0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = i1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.n0;
            if (w0Var == null || D()) {
                this.o0 = b0(0.0f);
                s1(0.0f);
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                au0[] au0VarArr = this.k0;
                au0 au0Var2 = au0VarArr[0];
                if (au0Var2 != null && au0Var2.F == 13 && (vr0Var = this.U) != null) {
                    ai.c cVar = vr0Var.n;
                    if (!z10) {
                    }
                }
                au0 au0Var3 = au0VarArr[0];
                wr0 wr0Var = this.V;
                if (au0Var3 != null && au0Var3.F == 14 && wr0Var != null) {
                    wh.v1 v1Var = wr0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (au0Var = au0VarArr[0]) == null || au0Var.F != 13) && ((wr0Var == null || !wr0Var.g()) && (cs0Var == null || !cs0Var.w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.y1 = false;
                    this.x1 = true;
                    N0(true);
                    this.z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    xs0Var.setEnabled(false);
                    au0 au0Var4 = au0VarArr[1];
                    au0Var4.F = i11;
                    au0Var4.setVisibility(0);
                    this.h1 = z10;
                    m1(true);
                    if (z10) {
                        au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth());
                    } else {
                        au0VarArr[1].setTranslationX(-au0VarArr[0].getMeasuredWidth());
                    }
                    M0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String V(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        vr0 vr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (vr0Var = this.U) != null) {
            return vr0Var.getBotPreviewsSubtitle();
        }
        pt0 pt0Var = this.c0;
        if (pt0Var == null || pt0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < pt0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) pt0Var.s.i.get(i12);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i11++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i10++;
                    }
                }
            }
        }
        if (i10 == 0 && i11 == 0) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            sb2.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
        }
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
        }
        return sb2.toString();
    }

    public final au0 W(int i10) {
        int i11 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i11 >= au0VarArr.length) {
                return null;
            }
            au0 au0Var = au0VarArr[i11];
            if (au0Var != null && au0Var.F == i10) {
                return au0Var;
            }
            i11++;
        }
    }

    public final void W0(s4.h0 h0Var) {
        if (h0Var instanceof cv0) {
            ArrayList arrayList = this.E0;
            ArrayList arrayList2 = this.F0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (h0Var == this.M) {
            ArrayList arrayList3 = this.G0;
            ArrayList arrayList4 = this.H0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        ou0 ou0Var = this.N;
        if (h0Var == ou0Var) {
            ou0Var.r = null;
        }
    }

    public final int X(int i10, int i11, boolean z10) {
        int i12 = i11 + (!z10 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z10 ? 9 : 6;
        }
        return Utilities.clamp(i12, 9, (this.k1 && i10 == 1) ? 1 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i11 >= au0VarArr.length) {
                return;
            }
            gs0 gs0Var = au0VarArr[i11].h;
            if (gs0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < gs0Var.getChildCount(); i14++) {
                    View childAt = gs0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                        int messageId = u7Var.getMessageId();
                        i13 = u7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.l7) {
                        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                        int id2 = l7Var.getMessage().getId();
                        i13 = l7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                        i12 = k7Var.getMessage().getId();
                        i13 = k7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = au0VarArr[i11].F;
                    int i16 = -1;
                    if (p0(i15)) {
                        fv0 k12 = k1(i15);
                        if (k12 != null && k12.s != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= k12.s.i.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) k12.s.i.get(i17)).getId()) {
                                    i16 = i17;
                                    break;
                                }
                                i17++;
                            }
                        }
                        i10 = i16;
                    } else if (i15 >= 0) {
                        xu0[] xu0VarArr = this.t1;
                        if (i15 < xu0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= xu0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) xu0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = xu0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((s4.c0) gs0Var.getLayoutManager()).h1(i10, (-au0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.o1) {
                            au0 au0Var = au0VarArr[i11];
                            au0Var.s.h1(i10, (-au0Var.h.getPaddingTop()) + i13);
                        }
                    }
                }
            }
            i11++;
        }
    }

    public final int Y(boolean z10) {
        return this.X1 + (z10 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void Y0(int i10) {
        xs0 xs0Var;
        if (this.L1 || (xs0Var = this.I0) == null) {
            return;
        }
        xs0Var.h(null, i10, xs0Var.P.get(i10));
    }

    public final int Z(int i10) {
        int dp = AndroidUtilities.dp(54.0f) + this.b2;
        cs0 cs0Var = this.W;
        return dp + ((int) ((cs0Var == null || !(w0(i10) || i10 == 8)) ? 0.0f : cs0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f7, int i10) {
        xs0 xs0Var = this.I0;
        if (xs0Var != null) {
            xs0Var.j(f7, w0(i10) ? 8 : i10);
        }
        cs0 cs0Var = this.W;
        if (cs0Var != null) {
            u81 u81Var = cs0Var.n;
            if (w0(i10)) {
                u81Var.f(f7, h1(i10));
            } else if (i10 == 8) {
                u81Var.f(f7, 0);
            }
        }
    }

    public final float a0(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        au0[] au0VarArr = this.k0;
        au0 au0Var = au0VarArr[1];
        wr0 wr0Var = this.V;
        if (au0Var != null && ((i12 = au0Var.F) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = au0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && wr0Var != null)))) {
            f10 = 0.0f + f7;
        }
        au0 au0Var2 = au0VarArr[0];
        return (au0Var2 == null || !((i10 = au0Var2.F) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = au0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && wr0Var != null)))) ? f10 : (1.0f - f7) + f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i10 >= au0VarArr.length) {
                if (this.F == 0) {
                    rt0 rt0Var = this.a0;
                    rt0Var.d = chatFull;
                    rt0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < au0VarArr.length; i11++) {
                    au0 au0Var = au0VarArr[i11];
                    if (au0Var.F == 7 && au0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(au0VarArr[i11].h);
                    }
                }
                return;
            }
            au0 au0Var2 = au0VarArr[i10];
            if (au0Var2.F == 7 && au0Var2.h.getAdapter() != null && au0VarArr[i10].h.getAdapter().h() != 0 && this.v1.getMessagesController().getStoriesController().j.size() > 0) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    public final float b0(float f7) {
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        au0[] au0VarArr = this.k0;
        au0 au0Var = au0VarArr[1];
        if (au0Var != null && s0(au0Var.F) && au0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        au0 au0Var2 = au0VarArr[0];
        return (au0Var2 == null || !s0(au0Var2.F) || au0VarArr[0].F == 11) ? f10 : (1.0f - f7) + f10;
    }

    public void b1(boolean z10) {
        if (this.C1 == z10) {
            return;
        }
        this.C1 = z10;
        AnimatorSet animatorSet = this.N1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ga gaVar = this.B0;
        if (z10) {
            gaVar.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(gaVar, (Property<ga, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.N1.setDuration(180L);
        this.N1.addListener(new yo(15, this, z10));
        this.N1.start();
        if (z10) {
            u1();
        }
    }

    public final int c0(int i10) {
        fv0 k12;
        zh.a5 a5Var;
        if (!p0(i10) || (k12 = k1(i10)) == null || (a5Var = k12.s) == null) {
            return 0;
        }
        return a5Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(int i10, boolean z10) {
        int i11;
        au0 W;
        if (z10 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z10 && p0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.j1);
        bundle.putLong("topic_id", this.F);
        xu0[] xu0VarArr = this.t1;
        if (z10 && (W = W(0)) != null) {
            ArrayList arrayList = xu0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                fu0 fu0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((fu0) arrayList.get(i12)).b) {
                            fu0Var = (fu0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (fu0Var == null) {
                        fu0Var = (fu0) hc.b.i(1, arrayList);
                    }
                }
                if (fu0Var != null) {
                    i11 = fu0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.h8 h8Var = new org.telegram.ui.h8(xu0VarArr[0].q, i11, bundle);
                    h8Var.M = new l2.g(this, 11);
                    this.v1.presentFragment(h8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.h8 h8Var2 = new org.telegram.ui.h8(xu0VarArr[0].q, i11, bundle);
        h8Var2.M = new l2.g(this, 11);
        this.v1.presentFragment(h8Var2);
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        cs0 cs0Var = this.W;
        if (h12 != i10) {
            if (cs0Var != null) {
                cs0Var.n.d(i10, cs0Var.s.i(i10));
                return;
            }
            return;
        }
        cs0Var.setReorderingAlbums(true);
        hv0 i12 = i1(i10);
        au0 W = W(i12.a);
        if (W == null) {
            return;
        }
        gs0 gs0Var = W.h;
        for (int i11 = 0; i11 < gs0Var.getChildCount(); i11++) {
            View childAt = gs0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u7) {
                ((org.telegram.ui.Cells.u7) childAt).l(true, true);
            }
        }
        gv0 gv0Var = i12.c;
        if (gv0Var != null && !gv0Var.x) {
            gv0Var.x = true;
        }
        q1(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x048d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v34 */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gs0 gs0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        ul0 ul0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        gs0 gs0Var2;
        int i16;
        int i17;
        gs0 gs0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        ul0 ul0Var2 = this.O;
        ul0 ul0Var3 = this.M;
        wu0 wu0Var = this.J;
        ul0 ul0Var4 = this.L;
        ul0 ul0Var5 = this.K;
        org.telegram.ui.ActionBar.p2 p2Var = this.v1;
        ou0 ou0Var = this.N;
        mt0 mt0Var = this.H;
        long j3 = this.j1;
        au0[] au0VarArr = this.k0;
        xu0[] xu0VarArr = this.t1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != p2Var.getClassGuid() || intValue2 != xu0VarArr[intValue3].p) {
                if (this.u1 == null || !xu0VarArr[intValue3].a.isEmpty() || xu0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    ul0Var2 = mt0Var;
                } else if (intValue3 == 1) {
                    ul0Var2 = ul0Var5;
                } else if (intValue3 == 2) {
                    ul0Var2 = ul0Var4;
                } else if (intValue3 == 3) {
                    ul0Var2 = wu0Var;
                } else if (intValue3 == 4) {
                    ul0Var2 = ul0Var3;
                } else if (intValue3 != 5) {
                    ul0Var2 = intValue3 == 15 ? ou0Var : null;
                }
                if (ul0Var2 != null) {
                    for (int i19 = 0; i19 < au0VarArr.length; i19++) {
                        au0 au0Var = au0VarArr[i19];
                        if (au0Var != null && (gs0Var2 = au0Var.h) != null && gs0Var2.getAdapter() == ul0Var2) {
                            au0VarArr[i19].h.B0();
                        }
                    }
                    ul0Var2.l();
                }
                this.b1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
            int i20 = longValue == j3 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                xu0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                ul0Var2 = mt0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                ul0Var2 = ul0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                ul0Var2 = ul0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                ul0Var2 = wu0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                ul0Var2 = ul0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                ul0Var2 = ou0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                ul0Var2 = null;
            }
            int size2 = xu0VarArr[i16].a.size();
            if (ul0Var2 != null) {
                i17 = ul0Var2.h();
                if (ul0Var2 instanceof rl0) {
                    ((rl0) ul0Var2).L();
                }
            } else {
                i17 = 0;
            }
            xu0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (xu0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        xu0 xu0Var = xu0VarArr[i16];
                        int i21 = xu0Var.m - r13;
                        xu0Var.m = i21;
                        if (i21 < 0) {
                            xu0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                xu0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                xu0 xu0Var2 = xu0VarArr[i16];
                if (xu0Var2.l) {
                    xu0Var2.m = 0;
                }
            } else {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (xu0VarArr[i16].a(messageObject3, i20, false, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        xu0 xu0Var3 = xu0VarArr[i16];
                        int i23 = xu0Var3.n - 1;
                        xu0Var3.n = i23;
                        if (i23 < 0) {
                            xu0Var3.n = 0;
                        }
                    }
                }
                xu0 xu0Var4 = xu0VarArr[i16];
                if (xu0Var4.o && xu0Var4.a.size() > 0) {
                    xu0 xu0Var5 = xu0VarArr[i16];
                    xu0Var5.k = ((MessageObject) xu0Var5.a.get(0)).getId();
                }
                xu0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                xu0 xu0Var6 = xu0VarArr[i16];
                if (xu0Var6.i[i20]) {
                    int size4 = xu0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += xu0VarArr[i16].m;
                    }
                    xu0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                xu0 xu0Var7 = xu0VarArr[i16];
                if (xu0Var7.i[i20] && this.c1 != 0) {
                    xu0Var7.g = true;
                    p2Var.getMediaDataController().loadMedia(this.c1, 50, xu0VarArr[i16].j[1], 0, i16, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (ul0Var2 != null) {
                zt0 zt0Var = null;
                for (int i25 = 0; i25 < au0VarArr.length; i25++) {
                    au0 au0Var2 = au0VarArr[i25];
                    if (au0Var2 != null && (gs0Var3 = au0Var2.h) != null && gs0Var3.getAdapter() == ul0Var2) {
                        zt0 zt0Var2 = au0VarArr[i25].h;
                        zt0Var2.B0();
                        zt0Var = zt0Var2;
                    }
                }
                int h = ul0Var2.h();
                if (ul0Var2 != mt0Var) {
                    try {
                        ul0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (mt0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(zt0Var);
                } else {
                    mt0Var.l();
                }
                if (!xu0VarArr[i24].a.isEmpty() || xu0VarArr[i24].g) {
                    if (zt0Var != null && (ul0Var2 == mt0Var || h >= i17)) {
                        z(zt0Var, i17, sparseBooleanArray);
                    }
                } else if (zt0Var != null) {
                    z(zt0Var, i17, sparseBooleanArray);
                }
                if (zt0Var != null && !xu0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (au0VarArr[i26].F == 0) {
                                ((s4.c0) zt0Var.getLayoutManager()).h1(mt0Var.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            xu0 xu0Var8 = xu0VarArr[i24];
            if (xu0Var8.o) {
                if (xu0Var8.a.size() == 0) {
                    A0(i24);
                } else {
                    xu0VarArr[i24].o = false;
                }
            }
            this.b1 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j3) ? p2Var.getMessagesController().getChat(Long.valueOf(-j3)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (longValue2 == 0 && this.c1 != 0) {
                    i14 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i27 = -1;
                    i15 = 0;
                    z12 = false;
                    while (i15 < size) {
                        mt0 mt0Var2 = mt0Var;
                        int i28 = 0;
                        while (i28 < xu0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (xu0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        mt0Var = mt0Var2;
                    }
                    mt0 mt0Var3 = mt0Var;
                    if (z12) {
                        this.b1 = true;
                        if (mt0Var3 != null) {
                            mt0Var3.l();
                        }
                        if (ul0Var5 != null) {
                            ul0Var5.l();
                        }
                        if (ul0Var4 != null) {
                            ul0Var4.l();
                        }
                        if (wu0Var != null) {
                            wu0Var.X(false);
                        }
                        if (ul0Var3 != null) {
                            ul0Var3.l();
                        }
                        if (ou0Var != null) {
                            ou0Var.l();
                        }
                        if (ul0Var2 != null) {
                            ul0Var2.l();
                        }
                        if (i27 == 0 || i27 == 1 || i27 == 2 || i27 == 4) {
                            z0(true);
                        }
                    }
                    W(i27);
                    return;
                }
                if (longValue2 != chat.id) {
                    return;
                }
            } else if (longValue2 != 0) {
                return;
            }
            i14 = 0;
            ArrayList arrayList22 = (ArrayList) objArr[0];
            size = arrayList22.size();
            int i272 = -1;
            i15 = 0;
            z12 = false;
            while (i15 < size) {
            }
            mt0 mt0Var32 = mt0Var;
            if (z12) {
            }
            W(i272);
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j3) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j3);
                int i29 = 0;
                boolean z13 = false;
                while (i29 < arrayList4.size()) {
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i29);
                    ArrayList arrayList5 = arrayList4;
                    if (MessageObject.getMedia(messageObject4.messageOwner) == null || messageObject4.needDrawBluredPreview()) {
                        i13 = i29;
                    } else {
                        int mediaType = MediaDataController.getMediaType(messageObject4.messageOwner);
                        i13 = i29;
                        if (mediaType == -1) {
                            return;
                        }
                        xu0 xu0Var9 = xu0VarArr[mediaType];
                        if (xu0Var9.l) {
                            z11 = z13;
                            if (xu0Var9.a(messageObject4, messageObject4.getDialogId() == j3 ? 0 : 1, true, isEncryptedDialog2)) {
                                this.X0[mediaType] = 1;
                                z10 = true;
                                i29 = i13 + 1;
                                z13 = z10;
                                arrayList4 = arrayList5;
                            }
                            z10 = z11;
                            i29 = i13 + 1;
                            z13 = z10;
                            arrayList4 = arrayList5;
                        }
                    }
                    z11 = z13;
                    z10 = z11;
                    i29 = i13 + 1;
                    z13 = z10;
                    arrayList4 = arrayList5;
                }
                boolean z14 = z13;
                int i30 = 1;
                if (z14) {
                    this.b1 = true;
                    int i31 = 0;
                    while (i31 < au0VarArr.length) {
                        int i32 = au0VarArr[i31].F;
                        if (i32 == 0) {
                            ul0Var = mt0Var;
                        } else if (i32 == i30) {
                            ul0Var = ul0Var5;
                        } else if (i32 == 2) {
                            ul0Var = ul0Var4;
                        } else if (i32 == 3) {
                            ul0Var = wu0Var;
                        } else {
                            if (i32 == 4) {
                                ul0Var = ul0Var3;
                            } else if (i32 == 5) {
                                ul0Var = ul0Var2;
                            } else {
                                ul0Var = i32 == 15 ? ou0Var : null;
                                if (ul0Var != null) {
                                    ul0Var.h();
                                    mt0Var.l();
                                    ul0Var5.l();
                                    ul0Var4.l();
                                    wu0Var.X(false);
                                    ul0Var3.l();
                                    ou0Var.l();
                                    ul0Var2.l();
                                }
                                i31++;
                                i30 = 1;
                            }
                            if (ul0Var != null) {
                            }
                            i31++;
                            i30 = 1;
                        }
                        if (ul0Var != null) {
                        }
                        i31++;
                        i30 = 1;
                    }
                    v1(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l4 = (Long) objArr[3];
            if (l4.longValue() == j3 || l4.longValue() == this.c1) {
                int i33 = l4.longValue() == j3 ? 0 : 1;
                for (xu0 xu0Var10 : xu0VarArr) {
                    xu0Var10.f(i33, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                for (int i34 = 0; i34 < au0VarArr.length; i34++) {
                    int childCount = au0VarArr[i34].h.getChildCount();
                    for (int i35 = 0; i35 < childCount; i35++) {
                        View childAt = au0VarArr[i34].h.getChildAt(i35);
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                            if (k7Var.getMessage() != null) {
                                k7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i36 = 0; i36 < au0VarArr.length; i36++) {
                au0 au0Var3 = au0VarArr[i36];
                if (au0Var3 != null && (gs0Var = au0Var3.h) != null) {
                    int childCount2 = gs0Var.getChildCount();
                    for (int i37 = 0; i37 < childCount2; i37++) {
                        View childAt2 = au0VarArr[i36].h.getChildAt(i37);
                        if (childAt2 instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) childAt2;
                            if (k7Var2.getMessage() != null) {
                                k7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            zh.a5 a5Var = (zh.a5) objArr[0];
            pt0 pt0Var = this.c0;
            if (pt0Var == null || a5Var != pt0Var.s) {
                ur0 ur0Var = this.e0;
                if (ur0Var == null || a5Var != ur0Var.s) {
                    Iterator it = this.Y1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        hv0 hv0Var = (hv0) it.next();
                        if (hv0Var.c.s == a5Var) {
                            i12 = hv0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            au0 W = W(i12);
            if (W != null) {
                if (W.b != (a5Var.g() > 0)) {
                    W.b = a5Var.g() > 0;
                    o1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof s4.c0) {
                    vl0 vl0Var = W.h;
                    G(W, vl0Var, (s4.c0) vl0Var.getLayoutManager());
                }
            }
            tt0 tt0Var = this.D1;
            if (tt0Var != null) {
                tt0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (au0 au0Var4 : au0VarArr) {
                if (au0Var4 != null && au0Var4.h != null && p0(au0Var4.F)) {
                    if (!r0() || au0Var4.h.getAdapter() == null) {
                        for (int i38 = 0; i38 < au0Var4.h.getChildCount(); i38++) {
                            View childAt3 = au0Var4.h.getChildAt(i38);
                            if (childAt3 instanceof org.telegram.ui.Cells.u7) {
                                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt3;
                                n6 n6Var = u7Var.N;
                                if (!u7Var.d0 || (messageObject = u7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    u7Var.L = false;
                                    n6Var.q("", false, true);
                                } else {
                                    int i39 = storyViews.views_count;
                                    u7Var.L = i39 > 0;
                                    n6Var.q(AndroidUtilities.formatWholeNumber(i39, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(au0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j3) {
                this.Q.E(true);
                v1(true);
                F();
                return;
            }
            return;
        }
        int i40 = NotificationCenter.savedMessagesDialogsUpdate;
        ru0 ru0Var = this.R;
        if (i10 == i40) {
            if (j3 == 0 || j3 == p2Var.getUserConfig().getClientUserId()) {
                ru0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            ru0Var.F(true);
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j3) {
                v1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatRanks) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j3 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            rt0 rt0Var = this.a0;
            if (rt0Var != null) {
                TLRPC.ChatFull chatFull = rt0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i41 = 0; i41 < rt0Var.d.participants.participants.size(); i41++) {
                        rt0Var.d.participants.participants.get(i41).setRank(longValue4, str);
                    }
                }
                for (au0 au0Var5 : au0VarArr) {
                    if (au0Var5.F == 7) {
                        AndroidUtilities.updateVisibleRows(au0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didUpdatePollResults) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i42 = 0; i42 < au0VarArr.length; i42++) {
                if (au0VarArr[i42].h.getAdapter() == ou0Var) {
                    gs0 gs0Var4 = au0VarArr[i42].h;
                    ArrayList arrayList6 = ou0Var.n;
                    for (int i43 = 0; i43 < arrayList6.size(); i43++) {
                        MessageObject messageObject5 = (MessageObject) arrayList6.get(i43);
                        if (messageObject5 != null && messageObject5.getPollId() == longValue5) {
                            TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                                ou0Var.m(i43);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xs0 xs0Var = this.I0;
        if (xs0Var != null) {
            canvas.save();
            canvas.translate(xs0Var.getX(), xs0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        ts0 ts0Var = this.R0;
        if (ts0Var != null) {
            int i10 = ts0Var.T;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(ts0Var.getX(), ts0Var.getY());
                ts0Var.setDrawOverlay(true);
                ts0Var.draw(canvas);
                ts0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        if (view != this.R0 || this.P0 != null) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        au0[] au0VarArr = this.k0;
        float top = au0VarArr[0].getTop();
        cs0 cs0Var = this.W;
        if (cs0Var != null && ((i10 = au0VarArr[0].F) == 8 || w0(i10))) {
            top -= cs0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        org.telegram.ui.ActionBar.p2 p2Var = this.v1;
        if (p2Var != null && p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            zh.u7 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
            Context context = p2Var.getContext();
            long dialogId = r2Var.getDialogId();
            zh.s5 a2 = zh.s5.a((vl0) r2Var.getParent());
            a2.s += ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(boolean z10) {
        au0[] au0VarArr;
        au0 au0Var;
        if (this.o1) {
            return;
        }
        int i10 = 0;
        while (true) {
            au0VarArr = this.k0;
            if (i10 >= au0VarArr.length) {
                au0Var = null;
                break;
            }
            int i11 = au0VarArr[i10].F;
            if (i11 == 0 || p0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (au0Var != null) {
            int i12 = au0Var.F;
            this.p1 = i12;
            boolean p02 = p0(i12);
            int[] iArr = this.m1;
            int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], z10);
            this.q1 = X;
            if (X != iArr[p02 ? 1 : 0]) {
                if (this.k1 && p0(this.p1)) {
                    return;
                }
                au0Var.r.setVisibility(0);
                if (p0(this.p1)) {
                    au0Var.r.setAdapter(l1(this.p1));
                } else {
                    au0Var.r.setAdapter(this.I);
                }
                zt0 zt0Var = au0Var.r;
                zt0Var.setPadding(zt0Var.getPaddingLeft(), Z(this.p1), au0Var.r.getPaddingRight(), Y(v0()));
                au0Var.s.y1(X);
                au0Var.r.a0();
                au0Var.s.O = new vs0(this, au0Var, 0);
                AndroidUtilities.updateVisibleRows(au0Var.h);
                this.o1 = true;
                if (this.p1 == 0) {
                    this.t1[0].g(true);
                }
                this.n1 = 0.0f;
                if (this.s < 0) {
                    X0();
                    return;
                }
                for (au0 au0Var2 : au0VarArr) {
                    if (au0Var2.F == this.p1) {
                        au0Var2.s.h1(this.s, this.v - au0Var2.r.getPaddingTop());
                    }
                }
            }
        }
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i11 >= au0VarArr.length) {
                break;
            }
            au0 au0Var = au0VarArr[i11];
            if (au0Var != null) {
                int i13 = au0Var.F;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = au0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void f1() {
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i10 >= au0VarArr.length) {
                return;
            }
            int childCount = au0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = au0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
                    if (i10 == 0) {
                        photoImage.setAllowStartAnimation(true);
                        photoImage.startAnimation();
                    } else {
                        photoImage.setAllowStartAnimation(false);
                        photoImage.stopAnimation();
                    }
                }
            }
            i10++;
        }
    }

    public final float g0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i11 >= au0VarArr.length) {
                return f7;
            }
            au0 au0Var = au0VarArr[i11];
            if (au0Var != null) {
                int i12 = au0Var.F;
                if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                    f7 = (1.0f - Math.abs(au0VarArr[i11].getTranslationX() / getWidth())) + f7;
                }
            }
            i11++;
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float f7;
        float f10;
        float measuredWidth;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.S0);
        int i10 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f7 = 0.0f;
            f10 = 0.0f;
        } else {
            f7 = this.B1.getXVelocity();
            f10 = this.B1.getYVelocity();
            if (!this.x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                U0(motionEvent, f7 < 0.0f);
            }
        }
        if (this.x1) {
            au0[] au0VarArr = this.k0;
            float x10 = au0VarArr[0].getX();
            this.f1 = new AnimatorSet();
            this.i1 = Math.abs(x10) < ((float) au0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new q70(this, 19));
            boolean z10 = this.i1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(au0VarArr[0], (Property<au0, Float>) property, 0.0f), ObjectAnimator.ofFloat(au0VarArr[1], (Property<au0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(au0VarArr[0], (Property<au0, Float>) property, 0.0f), ObjectAnimator.ofFloat(au0VarArr[1], (Property<au0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = au0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(au0VarArr[0], (Property<au0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(au0VarArr[1], (Property<au0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(au0VarArr[0], (Property<au0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(au0VarArr[1], (Property<au0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.f1.setInterpolator(e2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.f1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.f1.addListener(new at0(this, i10));
            this.f1.start();
            this.g1 = true;
            this.x1 = false;
            L0();
        } else {
            this.y1 = false;
            this.G.setEnabled(true);
            this.I0.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.B1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.B1 = null;
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.Z0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        au0 au0Var;
        au0 au0Var2;
        zh.a5 a5Var;
        zh.a5 a5Var2;
        float f7 = 1.0f;
        au0[] au0VarArr = this.k0;
        if (au0VarArr == null || (au0Var = au0VarArr[0]) == null || (au0Var2 = au0VarArr[1]) == null || au0Var.w == null || au0Var2.w == null) {
            return 1.0f;
        }
        int i10 = au0Var.F;
        int i11 = au0Var2.F;
        boolean z10 = w0(i10) || i10 == 8;
        boolean z11 = w0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - au0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - au0VarArr[1].w.getVisibilityFactor();
        fv0 k12 = k1(au0VarArr[0].F);
        if (i10 == 8 || (k12 != null && (a5Var2 = k12.s) != null && a5Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        fv0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (a5Var = k13.s) == null || a5Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(au0VarArr[0].getTranslationX() / au0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        au0[] au0VarArr = this.k0;
        au0 au0Var = au0VarArr[1];
        if (au0Var != null && au0Var.getVisibility() == 0) {
            if (this.g1 && !this.i1) {
                return au0VarArr[1].F;
            }
            if (Math.abs(au0VarArr[1].getTranslationX()) < au0VarArr[1].getMeasuredWidth() / 2.0f) {
                return au0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public vl0 getCurrentListView() {
        nt0 nt0Var;
        au0 au0Var = this.k0[0];
        int i10 = au0Var.F;
        return i10 == 13 ? this.U.getCurrentListView() : i10 == 14 ? this.V.getCurrentListView() : (i10 != 12 || (nt0Var = this.T) == null) ? au0Var.h : nt0Var.a.x0;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.t1[0].q;
    }

    public TextView getSaveItem() {
        return this.q0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.n0;
    }

    public kj0 getSearchOptionsItem() {
        return this.s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        cs0 cs0Var = this.W;
        if (cs0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = cs0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? i1(currentAlbumId).a : currentTabId;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    @Deprecated
    public float getTabProgress() {
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i10 >= au0VarArr.length) {
                return f7;
            }
            au0 au0Var = au0VarArr[i10];
            if (au0Var != null) {
                f7 = ((1.0f - Math.abs(au0Var.getTranslationX() / getWidth())) * au0Var.F) + f7;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.l0;
        kj0 iconView = w0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.j6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.u0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.t0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 1, null, null, null, null, i12));
        xs0 xs0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.wc;
        org.telegram.ui.Cells.w0 w0Var4 = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var4, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var4, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hh));
        ts0 ts0Var = this.R0;
        if (ts0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A7));
        }
        final int i14 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i14 >= au0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6() { // from class: org.telegram.ui.Components.qr0
                @Override // org.telegram.ui.ActionBar.k6
                public final void b() {
                    au0[] au0VarArr2 = iv0.this.k0;
                    int i15 = i14;
                    gs0 gs0Var = au0VarArr2[i15].h;
                    if (gs0Var != null) {
                        int childCount = gs0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = au0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.v7) {
                                org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    v7Var.a[i17].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                                ((org.telegram.ui.Cells.j6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.bb) {
                                ((org.telegram.ui.Cells.bb) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.k6
                public final /* synthetic */ void a(float f7) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
            ps0 ps0Var = au0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.j6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(ps0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].w, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
            int i16 = org.telegram.ui.ActionBar.j6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.j6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, -1, k6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, -1, k6Var, org.telegram.ui.ActionBar.j6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.r0;
            int i19 = org.telegram.ui.ActionBar.j6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.U7));
            int i20 = org.telegram.ui.ActionBar.j6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{ut0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
            int i21 = org.telegram.ui.ActionBar.j6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.j6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.j6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.j6.f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.j6.g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.p7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.p7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.p7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.j6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.v7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.v7.class}, null, null, k6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.v7.class}, null, null, k6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, null, null, new Drawable[]{this.y0}, null, org.telegram.ui.ActionBar.j6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].w.e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.F1;
        return f6Var != null ? f6Var.F0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        hv0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.b;
    }

    public final boolean i0() {
        return this.v1.getConnectionsManager().getConnectionState() == 3;
    }

    public final hv0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        hv0 hv0Var = (hv0) hashMap.get(valueOf);
        if (hv0Var != null) {
            return hv0Var;
        }
        hv0 hv0Var2 = new hv0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), hv0Var2);
        this.Z1.put(Integer.valueOf(hv0Var2.a), Integer.valueOf(i10));
        return hv0Var2;
    }

    public final boolean j0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.Z0;
                if (i11 >= sparseArrayArr[i10].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i10].keyAt(i11)));
                i11++;
            }
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (messageObject = (MessageObject) sparseArrayArr[i10].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    public final hv0 j1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (hv0) this.Y1.get(num);
    }

    public final void k0() {
        AndroidUtilities.cancelRunOnUIThread(this.M0);
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        if (w0Var.getTag() == null) {
            return;
        }
        w0Var.setTag(null);
        AnimatorSet animatorSet = this.L0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.L0.playTogether(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.Cells.w0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.Cells.w0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.O0));
        this.L0.setInterpolator(wr.g);
        this.L0.addListener(new at0(this, 0));
        this.L0.start();
    }

    public final fv0 k1(int i10) {
        hv0 j12;
        if (i10 == 8) {
            return this.c0;
        }
        if (i10 == 9) {
            return this.e0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.c;
    }

    public boolean l0() {
        return false;
    }

    public final fv0 l1(int i10) {
        hv0 j12;
        if (i10 == 8) {
            return this.d0;
        }
        if (i10 == 9) {
            return this.f0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof i40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [org.telegram.ui.Components.vl0, org.telegram.ui.Components.zt0, s4.m0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    public final void m1(boolean z10) {
        au0[] au0VarArr;
        au0[] au0VarArr2;
        s4.u0 u0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        xu0[] xu0VarArr;
        String str;
        ?? r52;
        int i10;
        boolean z15;
        boolean z16;
        int i11;
        boolean z17;
        s4.u0 u0Var2;
        int i12;
        int i13;
        boolean z18;
        wr0 wr0Var = this.V;
        if (wr0Var != null) {
            wr0Var.i();
        }
        int i14 = 0;
        while (true) {
            au0VarArr = this.k0;
            if (i14 >= au0VarArr.length) {
                break;
            }
            au0VarArr[i14].h.B0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) au0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        s4.h0 adapter = au0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.c0;
        s4.y yVar = this.b0;
        if (adapter == h0Var) {
            yVar.d(null);
        }
        boolean z19 = this.V0;
        tt0 tt0Var = this.D1;
        ou0 ou0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = this.n0;
        int i15 = 100;
        if (z19 && this.U0) {
            au0 au0Var = au0VarArr[z10 ? 1 : 0];
            if (au0Var.f == null) {
                au0Var.f = new s4.u0();
            }
            au0 au0Var2 = au0VarArr[z10 ? 1 : 0];
            u0Var2 = au0Var2.f;
            tu0 tu0Var = this.S;
            yt0 yt0Var = this.j0;
            du0 du0Var = this.h0;
            du0 du0Var2 = this.i0;
            du0 du0Var3 = this.g0;
            if (z10) {
                int i16 = au0Var2.F;
                if (i16 == 0 || i16 == 2 || i16 == 5 || i16 == 6 || (i16 == 7 && !tt0Var.T())) {
                    this.V0 = false;
                    us0 us0Var = this.J0;
                    if (us0Var != null) {
                        us0Var.g(false);
                    }
                    this.U0 = false;
                    m1(true);
                    return;
                }
                String obj = w0Var != null ? w0Var.getSearchField().getText().toString() : "";
                int i17 = au0VarArr[z10 ? 1 : 0].F;
                if (i17 == 1) {
                    if (du0Var3 != null) {
                        du0Var3.G(obj, false);
                        if (adapter != du0Var3) {
                            W0(adapter);
                            au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var3);
                        }
                    }
                } else if (i17 == 3) {
                    if (du0Var2 != null) {
                        du0Var2.G(obj, false);
                        if (adapter != du0Var2) {
                            W0(adapter);
                            au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var2);
                        }
                    }
                } else if (i17 == 4) {
                    if (du0Var != null) {
                        du0Var.G(obj, false);
                        if (adapter != du0Var) {
                            W0(adapter);
                            au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var);
                        }
                    }
                } else if (i17 == 7) {
                    if (yt0Var != null) {
                        yt0Var.F(obj, false);
                        if (adapter != yt0Var) {
                            W0(adapter);
                            au0VarArr[z10 ? 1 : 0].h.setAdapter(yt0Var);
                        }
                    }
                } else if (i17 == 11) {
                    if (tu0Var != null) {
                        tu0Var.E(this.W0, obj);
                        if (adapter != tu0Var) {
                            W0(adapter);
                            au0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var);
                        }
                    }
                } else if (i17 == 15 && ou0Var != null && adapter != ou0Var) {
                    W0(adapter);
                    gs0 gs0Var = au0VarArr[z10 ? 1 : 0].h;
                    ou0Var.r = gs0Var;
                    gs0Var.setAdapter(ou0Var);
                }
            } else if (au0Var2.h != null) {
                int i18 = au0Var2.F;
                if (i18 == 1) {
                    if (adapter != du0Var3) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var3);
                    }
                    du0Var3.l();
                } else if (i18 == 3) {
                    if (adapter != du0Var2) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var2);
                    }
                    du0Var2.l();
                } else if (i18 == 4) {
                    if (adapter != du0Var) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var);
                    }
                    du0Var.l();
                } else if (i18 == 7) {
                    if (adapter != yt0Var) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(yt0Var);
                    }
                    yt0Var.l();
                } else if (i18 == 11) {
                    if (adapter != tu0Var) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var);
                    }
                    tu0Var.l();
                }
            }
            au0VarArr2 = au0VarArr;
            z17 = false;
            z16 = false;
            i11 = 100;
        } else {
            au0 au0Var3 = au0VarArr[z10 ? 1 : 0];
            if (au0Var3.e == null) {
                au0Var3.e = new s4.u0();
            }
            au0 au0Var4 = au0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var3 = au0Var4.e;
            au0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = au0VarArr[z10 ? 1 : 0].F;
            if (i19 == 8 || w0(i19)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            gs0 gs0Var2 = au0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = gs0Var2.getPaddingLeft();
            au0 au0Var5 = au0VarArr[z10 ? 1 : 0];
            gs0 gs0Var3 = au0Var5.h;
            int Z = Z(au0Var5.F);
            gs0Var3.d3 = Z;
            int paddingRight = au0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            au0VarArr2 = au0VarArr;
            gs0 gs0Var4 = au0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            gs0Var4.e3 = Y;
            gs0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i20 = au0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.m1;
            s4.h0 h0Var2 = this.K;
            View view = this.U;
            nt0 nt0Var = this.T;
            ru0 ru0Var = this.R;
            st0 st0Var = this.P;
            xu0[] xu0VarArr2 = this.t1;
            if (i20 == 0) {
                s4.h0 h0Var3 = this.H;
                if (adapter != h0Var3) {
                    W0(adapter);
                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i21 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                xu0 xu0Var = xu0VarArr2[0];
                boolean z20 = xu0Var.h && !xu0Var.e.isEmpty();
                i15 = iArr[0];
                au0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.y0);
                xu0 xu0Var2 = xu0VarArr2[0];
                if (xu0Var2.x == null) {
                    xu0Var2.x = new s4.u0();
                }
                z13 = z20;
                u0Var = xu0VarArr2[0].x;
                z11 = false;
            } else {
                if (i20 == 1) {
                    xu0 xu0Var3 = xu0VarArr2[1];
                    z12 = xu0Var3.h && !xu0Var3.e.isEmpty();
                    if (adapter != h0Var2) {
                        W0(adapter);
                        au0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i20 == 2) {
                    xu0 xu0Var4 = xu0VarArr2[2];
                    z12 = xu0Var4.h && !xu0Var4.e.isEmpty();
                    if (adapter != this.L) {
                        W0(adapter);
                        au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                    }
                } else {
                    if (i20 == 3) {
                        if (adapter != this.J) {
                            W0(adapter);
                            au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i20 == 4) {
                        xu0 xu0Var5 = xu0VarArr2[4];
                        z12 = xu0Var5.h && !xu0Var5.e.isEmpty();
                        if (adapter != this.M) {
                            W0(adapter);
                            au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i20 == 5) {
                            if (adapter != this.O) {
                                W0(adapter);
                                au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i20 == 15) {
                            if (adapter != ou0Var) {
                                W0(adapter);
                                gs0 gs0Var5 = au0VarArr2[z10 ? 1 : 0].h;
                                ou0Var.r = gs0Var5;
                                gs0Var5.setAdapter(ou0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != st0Var) {
                                W0(adapter);
                                au0VarArr2[z10 ? 1 : 0].h.setAdapter(st0Var);
                            }
                        } else if (i20 == 7) {
                            if (adapter != this.a0) {
                                W0(adapter);
                                au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.a0);
                            }
                        } else if (p0(i20)) {
                            s4.h0 k12 = k1(au0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != k12) {
                                W0(adapter);
                                au0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                au0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            au0 au0Var6 = au0VarArr2[z10 ? 1 : 0];
                            if (au0Var6.F != 9) {
                                yVar.d(au0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = au0VarArr2[z10 ? 1 : 0].F;
                            if (i22 == 10) {
                                if (adapter != this.Q) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i22 == 11) {
                                if (adapter != ru0Var) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(ru0Var);
                                    s4.y yVar2 = ru0Var.v;
                                    gs0 gs0Var6 = au0VarArr2[z10 ? 1 : 0].h;
                                    ru0Var.s = gs0Var6;
                                    yVar2.d(gs0Var6);
                                }
                                u0Var = ru0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (nt0Var.getParent() != au0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(nt0Var);
                                    au0VarArr2[z10 ? 1 : 0].addView(nt0Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != au0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    au0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (wr0Var != null && wr0Var.getParent() != au0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(wr0Var);
                                    au0VarArr2[z10 ? 1 : 0].addView(wr0Var);
                                    au0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        u0Var = u0Var3;
                        z11 = false;
                        z13 = false;
                    }
                    u0Var = u0Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                u0Var = u0Var3;
                z11 = true;
            }
            int i23 = au0VarArr2[z10 ? 1 : 0].F;
            boolean z21 = i23 == 0 || p0(i23);
            s4.u0 u0Var4 = u0Var;
            au0VarArr2[z10 ? 1 : 0].v.setLayoutParams(w7.a6.d(-1, -1.0f, 119, z21 ? 0.0f : 12.0f, (z21 ? 8 : 12) + 48, z21 ? 0.0f : 12.0f, z21 ? 0.0f : 12.0f));
            if (z11) {
                au0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                gs0 gs0Var7 = au0VarArr2[z10 ? 1 : 0].h;
                gs0Var7.getClass();
                gs0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, gs0Var7.p2));
                gs0Var7.I2 = null;
                gs0Var7.L2 = 0.0f;
                gs0Var7.M2 = null;
                gs0Var7.N2 = null;
                gs0Var7.J2 = null;
                hl0 hl0Var = gs0Var7.H2;
                if (hl0Var != null) {
                    gs0Var7.p0(hl0Var);
                    gs0Var7.H2 = null;
                }
            }
            au0 au0Var7 = au0VarArr2[z10 ? 1 : 0];
            int i24 = au0Var7.F;
            org.telegram.ui.ActionBar.p2 p2Var = this.v1;
            if (i24 == 15) {
                z14 = z13;
                xu0VarArr = xu0VarArr2;
                str = "";
                au0Var7.setBackground(bi.e8.e(au0Var7.getBackground(), p2Var.getCurrentAccount(), this.j1, org.telegram.ui.ActionBar.j6.I.q()));
                au0VarArr2[z10 ? 1 : 0].setOutlineProvider(new bi.g(13));
                au0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                xu0VarArr = xu0VarArr2;
                str = "";
                au0Var7.setClipToOutline(false);
                r52 = 0;
                au0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            au0 au0Var8 = au0VarArr2[z10 ? 1 : 0];
            if (au0Var8.F == 11) {
                au0Var8.h.setItemAnimator(au0Var8.d);
            } else {
                au0Var8.h.setItemAnimator(r52);
                if (ru0Var != null && au0VarArr2[z10 ? 1 : 0].h == ru0Var.s) {
                    s4.y yVar3 = ru0Var.v;
                    ru0Var.s = r52;
                    yVar3.d(r52);
                }
            }
            if (nt0Var != null && au0VarArr2[z10 ? 1 : 0].F != 12 && nt0Var.getParent() == au0VarArr2[z10 ? 1 : 0]) {
                nt0Var.a.onRemoveFromParent();
                au0VarArr2[z10 ? 1 : 0].removeView(nt0Var);
            }
            if (view != null && au0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                au0 au0Var9 = au0VarArr2[z10 ? 1 : 0];
                if (parent == au0Var9) {
                    au0Var9.removeView(view);
                }
            }
            if (wr0Var != null && au0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = wr0Var.getParent();
                au0 au0Var10 = au0VarArr2[z10 ? 1 : 0];
                if (parent2 == au0Var10) {
                    au0Var10.removeView(wr0Var);
                }
            }
            int i25 = au0VarArr2[z10 ? 1 : 0].F;
            if (i25 != 0 && i25 != 11 && !p0(i25) && (i12 = au0VarArr2[z10 ? 1 : 0].F) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || tt0Var.T()) && (i13 = au0VarArr2[z10 ? 1 : 0].F) != 10 && i13 != 13 && i13 != 14)) {
                if (!z10) {
                    z18 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.x0 = 0;
                                this.o0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                w0Var.setVisibility(v0() ? 8 : 4);
                                this.o0 = 0.0f;
                            }
                        }
                        q1(z18);
                    }
                } else if (w0Var == null || w0Var.getVisibility() != 4 || this.G.n0) {
                    z18 = false;
                    this.x0 = 0;
                    this.o0 = 1.0f;
                } else {
                    if (D()) {
                        this.x0 = 1;
                        w0Var.setVisibility(0);
                    } else {
                        w0Var.setVisibility(v0() ? 8 : 4);
                    }
                    float f7 = z10 ? 1.0f : 0.0f;
                    this.o0 = b0(f7);
                    s1(1.0f - f7);
                    z18 = false;
                }
                q1(z18);
            } else if (z10) {
                this.x0 = 2;
            } else {
                this.x0 = 0;
                if (w0Var != null) {
                    w0Var.setVisibility((v0() || this.V0) ? 8 : 4);
                }
            }
            int i26 = au0VarArr2[z10 ? 1 : 0].F;
            if (i26 == 6) {
                if (!st0Var.e && !st0Var.h && st0Var.d.isEmpty()) {
                    st0.E(st0Var, 0L);
                }
            } else if (i26 != 7) {
                if (p0(i26)) {
                    fv0 k13 = k1(au0VarArr2[z10 ? 1 : 0].F);
                    if (k13 != null) {
                        zh.a5 a5Var = k13.s;
                        k13.P();
                        au0VarArr2[z10 ? 1 : 0].w.e(a5Var != null && (a5Var.k() || (i0() && a5Var.g() > 0)), z10);
                        z15 = (a5Var == null || a5Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z15 = z14;
                    }
                    z14 = z15;
                } else {
                    int i27 = au0VarArr2[z10 ? 1 : 0].F;
                    if (i27 != 10 && i27 != 11 && i27 != 12 && i27 != 13 && i27 != 14) {
                        if (i27 == 15) {
                            i27 = 8;
                        }
                        xu0 xu0Var6 = xu0VarArr[i27];
                        if (!xu0Var6.g && !xu0Var6.i[0] && xu0Var6.a.isEmpty()) {
                            xu0VarArr[i27].g = true;
                            h0Var2.l();
                            if (i27 == 0) {
                                int i28 = xu0VarArr[0].q;
                                if (i28 == 1) {
                                    i10 = 6;
                                } else if (i28 == 2) {
                                    i10 = 7;
                                }
                                p2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i10, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i10].p, null, null);
                            }
                            i10 = i27;
                            p2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i10, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i10].p, null, null);
                        }
                    }
                }
            }
            int i29 = au0VarArr2[z10 ? 1 : 0].F;
            if (i29 == 8 || w0(i29)) {
                au0 au0Var11 = au0VarArr2[z10 ? 1 : 0];
                rs0 rs0Var = au0Var11.w;
                boolean w02 = w0(au0Var11.F);
                int h12 = h1(au0VarArr2[z10 ? 1 : 0].F);
                w9 w9Var = rs0Var.b;
                bi.d dVar = rs0Var.f;
                w9Var.setVisibility((w02 || u0() || r0()) ? 8 : 0);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    rs0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (w02) {
                    rs0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    rs0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    rs0Var.d.setText(LocaleController.getString(!t0() ? v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    rs0Var.e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                }
                dVar.setOnClickListener(new fr0(this, w02, h12, 0));
            } else {
                au0 au0Var12 = au0VarArr2[z10 ? 1 : 0];
                if (au0Var12.F == 9) {
                    if (u0()) {
                        au0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        au0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        au0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        au0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        au0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        au0VarArr2[z10 ? 1 : 0].w.f.h(w());
                    }
                    au0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    au0VarArr2[z10 ? 1 : 0].w.e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                    au0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new dr0(this, 7));
                } else {
                    au0Var12.w.b.setVisibility(0);
                    au0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    au0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                    au0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    au0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z16 = false;
            au0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i11 = i15;
            z17 = z14;
            u0Var2 = u0Var4;
        }
        au0 au0Var13 = au0VarArr2[z10 ? 1 : 0];
        au0Var13.b = z17;
        o1(au0Var13, z16);
        au0VarArr2[z10 ? 1 : 0].x.y1(i11);
        au0VarArr2[z10 ? 1 : 0].h.a0();
        if (u0Var2 != null) {
            au0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var2);
            au0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(u0Var2);
        }
        if (this.x0 == 2) {
            org.telegram.ui.ActionBar.l lVar = this.G;
            if (lVar.n0) {
                this.z0 = true;
                lVar.h(true);
                this.x0 = 0;
                this.o0 = 0.0f;
                if (w0Var != null) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        for (au0 au0Var : this.k0) {
            gs0 gs0Var = au0Var.h;
            Objects.requireNonNull(gs0Var);
            au0Var.n = new zg.k(gs0Var, viewGroup, new iw(gs0Var, 4));
        }
        wr0 wr0Var = this.V;
        if (wr0Var != null) {
            wr0Var.S = viewGroup;
            wr0Var.R = new bi.a9(wr0Var, 1);
        }
    }

    public final void n1() {
        mt0 mt0Var = this.H;
        if (mt0Var != null) {
            mt0Var.l();
        }
        vu0 vu0Var = this.K;
        if (vu0Var != null) {
            vu0Var.l();
        }
        vu0 vu0Var2 = this.L;
        if (vu0Var2 != null) {
            vu0Var2.l();
        }
        wu0 wu0Var = this.J;
        if (wu0Var != null) {
            wu0Var.X(false);
        }
        vu0 vu0Var3 = this.M;
        if (vu0Var3 != null) {
            vu0Var3.l();
        }
        ou0 ou0Var = this.N;
        if (ou0Var != null) {
            ou0Var.l();
        }
        vt0 vt0Var = this.O;
        if (vt0Var != null) {
            vt0Var.l();
        }
        pt0 pt0Var = this.c0;
        if (pt0Var != null) {
            pt0Var.l();
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            ((hv0) it.next()).c.l();
        }
    }

    public final void o1(au0 au0Var, boolean z10) {
        boolean z11 = au0Var.b && this.d;
        cl0 fastScroll = au0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = au0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            au0Var.c.cancel();
        }
        if (!z10) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z11 ? 0 : 8);
            fastScroll.setTag(z11 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z11 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<cl0, Float>) property, fastScroll.getAlpha(), 1.0f);
            au0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<cl0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new yo(fastScroll));
        au0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i10 >= au0VarArr.length) {
                return;
            }
            gs0 gs0Var = au0VarArr[i10].h;
            if (gs0Var != null) {
                gs0Var.getViewTreeObserver().addOnPreDrawListener(new dt0(this, i10, 0));
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return J() || this.I0.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        tt0 tt0Var = this.D1;
        int height = tt0Var.f() != null ? tt0Var.f().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i10;
            } else if (childAt instanceof au0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                gs0 gs0Var = ((au0) childAt).h;
                gs0Var.setPadding(0, gs0Var.Y2, 0, gs0Var.Z2);
            } else {
                i12 = i10;
                i13 = i11;
                measureChildWithMargins(childAt, i12, 0, i13, 0);
                i14++;
                i10 = i12;
                i11 = i13;
            }
            i13 = i11;
            i14++;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.L1) {
            org.telegram.ui.ActionBar.p2 p2Var = this.v1;
            if (p2Var.getParentLayout() != null && !((ActionBarLayout) p2Var.getParentLayout()).j() && !J() && !this.a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    s40 s40Var = this.E1;
                    if (s40Var != null) {
                        s40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.x1 && !this.y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.w1 = motionEvent.getPointerId(0);
                    this.y1 = true;
                    this.z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.w1) {
                    int x10 = (int) (motionEvent.getX() - this.z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z11 = this.x1;
                    au0[] au0VarArr = this.k0;
                    if (z11 && (((z10 = this.h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!U0(motionEvent, x10 < 0)) {
                            this.y1 = true;
                            this.x1 = false;
                            N0(false);
                            au0VarArr[0].setTranslationX(0.0f);
                            au0VarArr[1].setTranslationX(this.h1 ? au0VarArr[0].getMeasuredWidth() : -au0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, au0VarArr[1].F);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.y1 || this.x1) {
                        if (this.x1) {
                            au0VarArr[0].setTranslationX(x10);
                            if (this.h1) {
                                au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                au0VarArr[1].setTranslationX(x10 - au0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / au0VarArr[0].getMeasuredWidth();
                            if (D()) {
                                this.o0 = b0(abs2);
                                s1(abs2);
                                float a02 = a0(abs2);
                                this.p0 = a02;
                                this.r0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
                            } else {
                                this.o0 = 0.0f;
                            }
                            q1(false);
                            Z0(abs2, au0VarArr[1].F);
                            M0(getTabProgress());
                            L0();
                        }
                    } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                        U0(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.x1;
            }
        }
        return false;
    }

    public final void p1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.t0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = this.v1.getMessagesController().isPeerNoForwards(this.j1) || j0();
        w0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && w0Var.getBackground() != null) {
            w0Var.setBackground(null);
        } else {
            if (z10 || w0Var.getBackground() != null) {
                return;
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(h0(org.telegram.ui.ActionBar.j6.z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        wr0 wr0Var;
        cs0 cs0Var;
        kj0 kj0Var = this.s0;
        if (kj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((wr0Var = this.V) == null || !wr0Var.g()) && ((cs0Var = this.W) == null || !cs0Var.w))) {
            f7 = Utilities.clamp(this.o0 + this.p0, 1.0f, 0.0f);
        }
        kj0Var.setAlpha(f7);
        if (z10) {
            A(a0(1.0f) > 0.5f, true);
        } else if (this.x0 == 2) {
            A(this.p0 > 0.1f, true);
        } else {
            A(this.o0 < 0.1f, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j3 = this.j1;
        return j3 > 0 && (user = MessagesController.getInstance(this.v1.getCurrentAccount()).getUser(Long.valueOf(j3))) != null && user.bot;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i10 >= au0VarArr.length) {
                return;
            }
            int childCount = au0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = au0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.u7) {
                    ((org.telegram.ui.Cells.u7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) childAt).V(false, z10);
                }
            }
            i10++;
        }
    }

    public final boolean s0(int i10) {
        return i10 == 7 ? this.D1.T() : (t0() || i10 == 0 || p0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14) ? false : true;
    }

    public final void s1(float f7) {
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var == null) {
            return;
        }
        au0[] au0VarArr = this.k0;
        au0 au0Var = au0VarArr[1];
        float f10 = 0.0f;
        if (au0Var != null && au0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        au0 au0Var2 = au0VarArr[0];
        if (au0Var2 != null && au0Var2.F == 11) {
            f10 += 1.0f - f7;
        }
        w0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        w0Var.setScaleX(f11);
        w0Var.setScaleY(f11);
        w0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.d1;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.d1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.c1 == 0) {
                this.c1 = -j3;
                int i10 = 0;
                while (true) {
                    xu0[] xu0VarArr = this.t1;
                    if (i10 >= xu0VarArr.length) {
                        break;
                    }
                    if (xu0VarArr[i10].b[1].size() == 0) {
                        xu0 xu0Var = xu0VarArr[i10];
                        xu0Var.j[1] = this.d1.migrated_from_max_id;
                        xu0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.d1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        xs0 xs0Var = this.I0;
        if (xs0Var != null) {
            xs0Var.setInitialTabId(q0() ? 9 : 8);
        }
        v1(true);
        m1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.X0[6] = i10;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(s40 s40Var) {
        this.E1 = s40Var;
    }

    public void setMergeDialogId(long j3) {
        this.c1 = j3;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.X0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            } else {
                i10++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        v1(true);
        F();
        if (iArr2[0] >= 0) {
            z0(false);
        }
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.K1 = i11;
        int i14 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i14 >= au0VarArr.length) {
                break;
            }
            au0VarArr[i14].setTranslationY(this.K1);
            i14++;
        }
        if (this.P0 != null) {
            K();
        } else {
            ts0 ts0Var = this.R0;
            if (ts0Var != null) {
                ts0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.O0 = i11;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        w0Var.setTranslationY((w0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.O0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.X1 != i10) {
            this.X1 = i10;
            au0[] au0VarArr = this.k0;
            if (au0VarArr != null) {
                for (au0 au0Var : au0VarArr) {
                    if (au0Var != null) {
                        gs0 gs0Var = au0Var.h;
                        int paddingLeft = gs0Var.getPaddingLeft();
                        gs0 gs0Var2 = au0Var.h;
                        int i11 = gs0Var2.Y2;
                        int paddingRight = gs0Var2.getPaddingRight();
                        gs0 gs0Var3 = au0Var.h;
                        int Y = Y(v0());
                        gs0Var3.e3 = Y;
                        gs0Var.setPadding(paddingLeft, i11, paddingRight, Y);
                    }
                }
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i10 >= au0VarArr.length) {
                return;
            }
            o1(au0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.e1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.e1 = userFull;
        v1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        Y0(8);
    }

    public void setVisibleHeight(int i10) {
        this.M1 = i10;
        int i11 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i11 >= au0VarArr.length) {
                break;
            }
            float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(au0VarArr[i11].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            au0VarArr[i11].w.setTranslationY(f7);
            au0VarArr[i11].v.setTranslationY(-f7);
            i11++;
        }
        vr0 vr0Var = this.U;
        if (vr0Var != null) {
            vr0Var.setVisibleHeight(i10);
        }
        wr0 wr0Var = this.V;
        if (wr0Var != null) {
            wr0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var == null) {
            return;
        }
        au0 au0Var = this.k0[1];
        boolean z10 = au0Var != null && au0Var.F == 11;
        if (z10) {
            w0Var.setVisibility(0);
        }
        w0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new ai.j(28, this, z10)).setDuration(420L).setInterpolator(wr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        zh.a5 a5Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.w0 w0Var = this.w0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.v0;
        if (r02) {
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            if (w0Var != null) {
                w0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            if (w0Var != null) {
                w0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (w0(getClosestTab())) {
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                }
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.Z0;
            if (i10 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i10);
            pt0 pt0Var = this.c0;
            if (pt0Var != null && (a5Var = pt0Var.s) != null && !a5Var.m(messageObject.getId())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (w0Var2 != null) {
            w0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (w0Var != null) {
            w0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public boolean v0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e5, code lost:
    
        if ((r36[8] <= 0) == r8.d(15)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e7, code lost:
    
        r4 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01ea, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01fb, code lost:
    
        if ((r36[4] <= 0) == r8.d(4)) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v1(boolean z10) {
        char c10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i10;
        boolean z11;
        int i11;
        boolean v02;
        int[] iArr;
        boolean z12;
        boolean z13;
        xs0 xs0Var;
        int selectedTab;
        boolean z14;
        boolean z15;
        long j3;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        Integer num;
        xs0 xs0Var2;
        boolean z16;
        int i12;
        int size;
        int i13;
        Boolean bool;
        String string;
        String str;
        String str2;
        wr0 wr0Var;
        char c11;
        int i14;
        Object obj;
        Object obj2;
        Object obj3;
        int i15;
        int i16;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        av0 av0Var;
        xs0 xs0Var3 = this.I0;
        if (xs0Var3 == null) {
            return;
        }
        boolean z17 = !this.D1.p() ? false : z10;
        boolean z18 = (this.T == null || (av0Var = this.u1) == null || !av0Var.f) ? false : true;
        org.telegram.ui.ActionBar.p2 p2Var = this.v1;
        long j10 = this.j1;
        if (j10 <= 0 || p2Var == null) {
            c10 = 4;
            user = null;
        } else {
            c10 = 4;
            user = p2Var.getMessagesController().getUser(Long.valueOf(j10));
        }
        boolean z19 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z20 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.e1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z19) ? false : true;
        boolean z21 = (DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && (((userFull = this.e1) != null && userFull.stories_pinned_available) || (((chatFull = this.d1) != null && chatFull.stories_pinned_available) || v0())) && m0();
        wr0 wr0Var2 = this.V;
        boolean z22 = wr0Var2 != null && (((userFull3 = this.e1) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.d1) != null && chatFull3.stargifts_count > 0));
        boolean z23 = z20;
        TLRPC.ChatFull chatFull4 = this.d1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.e1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z17;
                int i17 = this.Q1 == xs0Var3.n0 ? 1 : 0;
                int i18 = (!z21 || z23) == xs0Var3.d(8) ? i17 + 1 : i17;
                if (z19 != xs0Var3.d(13)) {
                    i18++;
                }
                int i19 = i18;
                i10 = t0() == xs0Var3.d(8) ? i19 + 1 : i19;
                if (z22 == xs0Var3.d(14)) {
                    i10++;
                } else if (wr0Var2 != null && z22) {
                    z11 = z18;
                    i11 = 14;
                    if (this.P1 != wr0Var2.getLastEmojisHash()) {
                        i10++;
                    }
                    v02 = v0();
                    rt0 rt0Var = this.a0;
                    boolean z25 = z22;
                    int[] iArr2 = this.X0;
                    if (v02) {
                        iArr = iArr2;
                        z12 = false;
                        z13 = false;
                    } else {
                        iArr = iArr2;
                        int i20 = i10;
                        int i21 = (rt0Var.d == null) == xs0Var3.d(7) ? i20 + 1 : i20;
                        int i22 = (iArr[0] <= 0) == xs0Var3.d(0) ? i21 + 1 : i21;
                        int i23 = (iArr[1] <= 0) == xs0Var3.d(1) ? i22 + 1 : i22;
                        if (DialogObject.isEncryptedDialog(j10)) {
                            i15 = i23;
                        } else {
                            int i24 = i23;
                            int i25 = (iArr[3] <= 0) == xs0Var3.d(3) ? i24 + 1 : i24;
                            i15 = (iArr[c10] <= 0) == xs0Var3.d(4) ? i25 + 1 : i25;
                        }
                        int i26 = i16;
                        int i27 = (iArr[2] <= 0) == xs0Var3.d(2) ? i26 + 1 : i26;
                        int i28 = (iArr[5] <= 0) == xs0Var3.d(5) ? i27 + 1 : i27;
                        int i29 = (iArr[6] <= 0) == xs0Var3.d(6) ? i28 + 1 : i28;
                        boolean z26 = !this.Q.d.isEmpty();
                        int i30 = i29;
                        i10 = z26 != xs0Var3.d(10) ? i30 + 1 : i30;
                        z12 = l0() && !p2Var.getMessagesController().getSavedMessagesController().unsupported && p2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                        z13 = z26;
                        if (z12 != xs0Var3.d(11)) {
                            i10++;
                        }
                        if (z11 != xs0Var3.d(12)) {
                            i10++;
                        }
                    }
                    if (i10 > 0) {
                        if (z24) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.setOrdering(0);
                            z14 = z12;
                            transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(2));
                            z15 = z11;
                            j3 = j10;
                            transitionSet.setDuration(200L);
                            TransitionManager.beginDelayedTransition(xs0Var3.getTabsContainer(), transitionSet);
                            xs0Var3.U = xs0Var3.v;
                            xs0Var3.V = xs0Var3.w;
                        } else {
                            z14 = z12;
                            z15 = z11;
                            j3 = j10;
                        }
                        SparseArray g10 = xs0Var3.g();
                        if (i10 > 3) {
                            g10 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (t0()) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            xs0Var3.b0 = 420L;
                        }
                        if (z23) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        } else if ((DialogObject.isUserDialog(j3) || DialogObject.isChatDialog(j3)) && !DialogObject.isEncryptedDialog(j3) && ((((userFull2 = this.e1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.d1) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                            if (q0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                xs0Var3.b0 = 420L;
                            } else {
                                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                                if (v0()) {
                                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                }
                            }
                        }
                        if (z25) {
                            Integer valueOf = Integer.valueOf(i11);
                            String string2 = LocaleController.getString(R.string.ProfileGifts);
                            HashMap hashMap = wh.q2.T;
                            xh.n5 n5Var = wr0Var2.d;
                            if (n5Var == null) {
                                wr0Var = wr0Var2;
                                num = 0;
                                xs0Var2 = xs0Var3;
                                z16 = z15;
                                str2 = string2;
                                obj = "";
                            } else {
                                z16 = z15;
                                ArrayList arrayList2 = n5Var.l;
                                str2 = string2;
                                num = 0;
                                xs0Var2 = xs0Var3;
                                Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(wr0Var2.c));
                                if (!arrayList2.isEmpty()) {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList3 = new ArrayList();
                                    int i31 = 0;
                                    while (true) {
                                        wr0Var = wr0Var2;
                                        if (arrayList3.size() >= 3 || i31 >= arrayList2.size()) {
                                            break;
                                        }
                                        TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList2.get(i31)).gift.getDocument();
                                        if (document == null) {
                                            i14 = i31;
                                        } else {
                                            i14 = i31;
                                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                                hashSet.add(Long.valueOf(document.id));
                                                arrayList3.add(document);
                                            }
                                        }
                                        i31 = i14 + 1;
                                        wr0Var2 = wr0Var;
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                        int i32 = 0;
                                        while (i32 < arrayList3.size()) {
                                            TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i32);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                            spannableStringBuilder2.setSpan(new y5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                            i32++;
                                            arrayList3 = arrayList3;
                                        }
                                        c11 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj3 = spannableStringBuilder;
                                        CharSequence[] charSequenceArr = new CharSequence[2];
                                        charSequenceArr[c11] = str2;
                                        charSequenceArr[1] = obj3;
                                        arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr)));
                                        this.P1 = wr0Var.getLastEmojisHash();
                                    }
                                } else if (!n5Var.i || (obj2 = (CharSequence) hashMap.get(pair)) == null) {
                                    wr0Var = wr0Var2;
                                } else {
                                    wr0Var = wr0Var2;
                                    obj = obj2;
                                }
                                obj = "";
                            }
                            c11 = 0;
                            obj3 = obj;
                            CharSequence[] charSequenceArr2 = new CharSequence[2];
                            charSequenceArr2[c11] = str2;
                            charSequenceArr2[1] = obj3;
                            arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr2)));
                            this.P1 = wr0Var.getLastEmojisHash();
                        } else {
                            num = 0;
                            xs0Var2 = xs0Var3;
                            z16 = z15;
                        }
                        if (z19) {
                            arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        }
                        if (!v0()) {
                            if (z14) {
                                arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                            }
                            if (rt0Var.d != null) {
                                arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && rt0Var.d == null) {
                                    arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTabFull2)));
                                } else {
                                    arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                                }
                            }
                            if (z16) {
                                arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                                MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                            }
                            if (iArr[1] > 0) {
                                arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                            }
                            if (!DialogObject.isEncryptedDialog(j3)) {
                                if (iArr[3] > 0) {
                                    arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                                }
                                if (iArr[4] > 0) {
                                    arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                                }
                                if (iArr[8] > 0) {
                                    arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                                }
                            } else if (iArr[4] > 0) {
                                arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                            }
                            if (iArr[2] > 0) {
                                arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                            }
                            if (iArr[5] > 0) {
                                arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                            }
                            if (iArr[6] > 0) {
                                arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                            }
                            if (z13) {
                                arrayList.add(new Pair(10, LocaleController.getString(j10 > 0 ? R.string.SimilarBotsTab : R.string.SimilarChannelsTab)));
                            }
                        }
                        xs0Var = xs0Var2;
                        if (xs0Var.n0) {
                            boolean z27 = this.d1 instanceof TLRPC.TL_channelFull;
                            for (int i33 = 0; i33 < 15; i33++) {
                                if (d0(i33, z27) != null) {
                                    Integer valueOf2 = Integer.valueOf(i33);
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 >= arrayList.size()) {
                                            bool = Boolean.FALSE;
                                            break;
                                        } else {
                                            if (((Pair) arrayList.get(i34)).first == valueOf2) {
                                                bool = Boolean.TRUE;
                                                break;
                                            }
                                            i34++;
                                        }
                                    }
                                    if (!bool.booleanValue()) {
                                        Integer valueOf3 = Integer.valueOf(i33);
                                        if (i33 == 0) {
                                            string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                        } else if (i33 == 1) {
                                            string = LocaleController.getString(R.string.SharedFilesTab2);
                                        } else if (i33 == 2) {
                                            string = LocaleController.getString(R.string.SharedVoiceTab2);
                                        } else if (i33 == 3) {
                                            string = LocaleController.getString(R.string.SharedLinksTab2);
                                        } else if (i33 == 4) {
                                            string = LocaleController.getString(R.string.SharedMusicTab2);
                                        } else if (i33 == 5) {
                                            string = LocaleController.getString(R.string.SharedGIFsTab2);
                                        } else if (i33 == 8) {
                                            string = LocaleController.getString(R.string.ProfileStories);
                                        } else if (i33 != 14) {
                                            str = null;
                                            arrayList.add(new Pair(valueOf3, str));
                                        } else {
                                            string = LocaleController.getString(R.string.ProfileGifts);
                                        }
                                        str = string;
                                        arrayList.add(new Pair(valueOf3, str));
                                    }
                                }
                            }
                        }
                        if (profileTab != null) {
                            int e02 = e0(profileTab);
                            int i35 = 0;
                            while (true) {
                                if (i35 >= arrayList.size()) {
                                    i35 = -1;
                                    break;
                                } else if (((Integer) ((Pair) arrayList.get(i35)).first).intValue() == e02) {
                                    break;
                                } else {
                                    i35++;
                                }
                            }
                            if (i35 >= 0) {
                                i12 = 0;
                                arrayList.add(0, (Pair) arrayList.remove(i35));
                                if (!arrayList.isEmpty()) {
                                    this.R1 = ((Integer) ((Pair) arrayList.get(i12)).first).intValue();
                                }
                                size = arrayList.size();
                                i13 = 0;
                                while (i13 < size) {
                                    Object obj4 = arrayList.get(i13);
                                    i13++;
                                    Pair pair2 = (Pair) obj4;
                                    if (!xs0Var.d(((Integer) pair2.first).intValue())) {
                                        xs0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, g10);
                                    }
                                }
                            }
                        }
                        i12 = 0;
                        if (!arrayList.isEmpty()) {
                        }
                        size = arrayList.size();
                        i13 = 0;
                        while (i13 < size) {
                        }
                    } else {
                        xs0Var = xs0Var3;
                    }
                    selectedTab = getSelectedTab();
                    if (selectedTab >= 0) {
                        this.k0[0].F = selectedTab;
                    }
                    this.Q1 = xs0Var.n0;
                    xs0Var.c();
                    L0();
                    I();
                }
                z11 = z18;
                i11 = 14;
                v02 = v0();
                rt0 rt0Var2 = this.a0;
                boolean z252 = z22;
                int[] iArr22 = this.X0;
                if (v02) {
                }
                if (i10 > 0) {
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                }
                this.Q1 = xs0Var.n0;
                xs0Var.c();
                L0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z17;
        if (this.Q1 == xs0Var3.n0) {
        }
        int i172 = this.Q1 == xs0Var3.n0 ? 1 : 0;
        if ((!z21 || z23) == xs0Var3.d(8)) {
        }
        if (z19 != xs0Var3.d(13)) {
        }
        int i192 = i18;
        if (t0() == xs0Var3.d(8)) {
        }
        if (z22 == xs0Var3.d(14)) {
        }
        z11 = z18;
        i11 = 14;
        v02 = v0();
        rt0 rt0Var22 = this.a0;
        boolean z2522 = z22;
        int[] iArr222 = this.X0;
        if (v02) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.Q1 = xs0Var.n0;
        xs0Var.c();
        L0();
        I();
    }

    public final SpannableStringBuilder w() {
        if (this.W1 == null) {
            this.W1 = new SpannableStringBuilder();
            if (r0()) {
                this.W1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.W1.append((CharSequence) "c");
                this.W1.setSpan(new uq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        au0[] au0VarArr = this.k0;
        au0 au0Var = au0VarArr[0];
        if (au0Var == null) {
            return null;
        }
        int i10 = au0Var.F;
        this.p1 = i10;
        boolean p02 = p0(i10);
        int[] iArr = this.m1;
        int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], true);
        if (view != null && X == X(p02 ? 1 : 0, X, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[p02 ? 1 : 0] != X) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!p02) {
                SharedConfig.setMediaColumnsCount(X);
            } else if (c0(au0VarArr[0].F) >= 5 || w0(au0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, true));
    }

    public final void x(w70 w70Var, org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10) {
        String publicUsername = j3 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j3))) : ChatObject.getPublicUsername(MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(-j3)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a4.a.z(sb2, MessagesController.getInstance(p2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        w70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new gf(this, sb2.toString(), p2Var, 22), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.C1)) {
            return false;
        }
        wr0 wr0Var = this.V;
        if (wr0Var != null && wr0Var.g()) {
            return false;
        }
        cs0 cs0Var = this.W;
        return ((cs0Var != null && cs0Var.w) || this.o1 || this.g1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        au0[] au0VarArr = this.k0;
        au0 au0Var = au0VarArr[0];
        if (au0Var == null) {
            return null;
        }
        if (this.k1 && p0(au0Var.F)) {
            return null;
        }
        int i10 = au0VarArr[0].F;
        this.p1 = i10;
        boolean p02 = p0(i10);
        int[] iArr = this.m1;
        int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], false);
        if (view2 != null && X == X(p02 ? 1 : 0, X, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[p02 ? 1 : 0] != X) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!p02) {
                SharedConfig.setMediaColumnsCount(X);
            } else if (c0(au0VarArr[0].F) >= 5 || w0(au0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        if (r3 != X(r0 ? 1 : 0, r3, true)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(w70 w70Var) {
        au0 au0Var;
        int x10 = w70Var.x();
        final int i10 = 0;
        w70Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.mr0
            public final /* synthetic */ iv0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        iv0 iv0Var = this.b;
                        iv0Var.getClass();
                        View[] viewArr = r2;
                        iv0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        iv0 iv0Var2 = this.b;
                        iv0Var2.getClass();
                        View[] viewArr2 = r2;
                        iv0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        w70Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.mr0
            public final /* synthetic */ iv0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        iv0 iv0Var = this.b;
                        iv0Var.getClass();
                        View[] viewArr = r2;
                        iv0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        iv0 iv0Var2 = this.b;
                        iv0Var2.getClass();
                        View[] viewArr2 = r2;
                        iv0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {w70Var.w(x10), w70Var.w(x10 + 1)};
        au0[] au0VarArr = this.k0;
        if (au0VarArr != null && (au0Var = au0VarArr[0]) != null) {
            boolean p02 = p0(au0Var.F);
            int i12 = this.m1[p02 ? 1 : 0];
        }
        viewArr[0].setEnabled(false);
        viewArr[0].setAlpha(0.5f);
        if (E()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    public final void y0(int i10, int i11, int i12, boolean z10) {
        xu0[] xu0VarArr = this.t1;
        xu0VarArr[i10].a.clear();
        xu0VarArr[i10].b[0].clear();
        xu0VarArr[i10].b[1].clear();
        xu0 xu0Var = xu0VarArr[i10];
        xu0Var.j[0] = i11;
        xu0Var.i[0] = false;
        xu0Var.l = false;
        xu0Var.m = i12;
        xu0Var.n = (xu0Var.e() - i12) - 1;
        xu0 xu0Var2 = xu0VarArr[i10];
        if (xu0Var2.n < 0) {
            xu0Var2.n = 0;
        }
        xu0Var2.k = i11;
        xu0Var2.o = true;
        xu0Var2.g = false;
        xu0Var2.p++;
        au0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            au0[] au0VarArr = this.k0;
            if (i13 >= au0VarArr.length) {
                return;
            }
            au0 au0Var = au0VarArr[i13];
            if (au0Var.F == i10) {
                au0Var.x.h1(Math.min(xu0VarArr[i10].e() - 1, xu0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void z(zt0 zt0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = zt0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zt0Var.getChildAt(i11);
            if (childAt instanceof a10) {
                view = childAt;
            }
        }
        if (view != null) {
            zt0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new ct0(this, zt0Var, sparseBooleanArray, (a10) view, i10));
    }

    public final void z0(boolean z10) {
        long j3 = this.F;
        if (j3 != 0 || t0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = d2[i10];
            xu0[] xu0VarArr = this.t1;
            if (xu0VarArr[i11].h && !z10) {
                return;
            }
            long j10 = this.j1;
            if (DialogObject.isEncryptedDialog(j10)) {
                return;
            }
            xu0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = xu0VarArr[i11].q;
                if (i12 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i12 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i11 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i11 == 2) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_getSearchResultsPositions.limit = 100;
            org.telegram.ui.ActionBar.p2 p2Var = this.v1;
            tL_messages_getSearchResultsPositions.peer = p2Var.getMessagesController().getInputPeer(j10);
            if (j3 != 0 && p2Var.getUserConfig().getClientUserId() == j10) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = p2Var.getMessagesController().getInputPeer(j3);
            }
            final int i13 = xu0VarArr[i11].p;
            ConnectionsManager.getInstance(p2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(p2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.ar0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new ir0(iv0.this, tL_error, i13, i11, tLObject, 0));
                }
            }), p2Var.getClassGuid());
        }
    }

    public void D0(SparseArray sparseArray) {
    }

    public void E0() {
    }

    public void K0(boolean z10) {
    }

    public void N0(boolean z10) {
    }

    public int V0(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(org.telegram.ui.Cells.r2 r2Var) {
    }

    public void o0() {
    }
}
