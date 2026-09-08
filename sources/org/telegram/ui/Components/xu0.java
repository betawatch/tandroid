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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class xu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] d2 = {0, 1, 2, 4};
    public static final ir0 e2 = new ir0(0);
    public final NumberTextView A0;
    public int A1;
    public final ha B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.g2 D0;
    public final jt0 D1;
    public final int E;
    public final ArrayList E0;
    public i40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.f6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final ct0 H;
    public final ArrayList H0;
    public boolean H1;
    public final ru0 I;
    public final ns0 I0;
    public final AnimationNotificationsLocker I1;
    public final lu0 J;
    public final ks0 J0;
    public org.telegram.ui.dm J1;
    public final ku0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final ku0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final ku0 M;
    public final qq0 M0;
    public int M1;
    public final eu0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final lt0 O;
    public float O0;
    public final SparseArray O1;
    public final it0 P;
    public final js P0;
    public long P1;
    public final gt0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final hu0 R;
    public final js0 R0;
    public int R1;
    public final iu0 S;
    public final int S0;
    public final us0 S1;
    public final dt0 T;
    public final Paint T0;
    public bi.l8 T1;
    public final lr0 U;
    public boolean U0;
    public float U1;
    public final nr0 V;
    public boolean V0;
    public boolean V1;
    public final sr0 W;
    public ah.j1 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean a;
    public final ht0 a0;
    public int a1;
    public int a2;
    public boolean b;
    public final s4.y b0;
    public boolean b1;
    public int b2;
    public boolean c;
    public final ft0 c0;
    public long c1;
    public final lh c2;
    public boolean d;
    public final uu0 d0;
    public TLRPC.ChatFull d1;
    public int e;
    public final kr0 e0;
    public TLRPC.UserFull e1;
    public int f;
    public final uu0 f0;
    public AnimatorSet f1;
    public final tt0 g0;
    public boolean g1;
    public float h;
    public final tt0 h0;
    public boolean h1;
    public final tt0 i0;
    public boolean i1;
    public final ot0 j0;
    public final long j1;
    public final qt0[] k0;
    public boolean k1;
    public final org.telegram.ui.ActionBar.v0 l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.v0 m0;
    public final int[] m1;
    public float n;
    public final org.telegram.ui.ActionBar.v0 n0;
    public float n1;
    public float o0;
    public boolean o1;
    public float p0;
    public int p1;
    public final TextView q0;
    public int q1;
    public boolean r;
    public final ImageView r0;
    public final xr0 r1;
    public int s;
    public final aj0 s0;
    public float s1;
    public final org.telegram.ui.ActionBar.v0 t0;
    public final mu0[] t1;
    public final org.telegram.ui.ActionBar.v0 u0;
    public final pu0 u1;
    public int v;
    public final org.telegram.ui.ActionBar.v0 v0;
    public final org.telegram.ui.ActionBar.n2 v1;
    public int w;
    public final org.telegram.ui.ActionBar.v0 w0;
    public int w1;
    public final Rect x;
    public int x0;
    public boolean x1;
    public final t00 y;
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
    public xu0(Context context, long j3, pu0 pu0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.n2 n2Var, jt0 jt0Var, int i13, org.telegram.ui.ActionBar.f6 f6Var, bh.b bVar) {
        super(context);
        char c10;
        TLRPC.ProfileTab profileTab;
        int i14;
        mu0[] mu0VarArr;
        int i15;
        ks0 ks0Var;
        int i16;
        int i17;
        hu0 hu0Var;
        float f7;
        Context context2;
        org.telegram.ui.ActionBar.v0 v0Var;
        ?? r10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        xu0 xu0Var;
        int i18;
        int i19;
        int i20;
        qt0[] qt0VarArr;
        View view;
        boolean N;
        xu0 xu0Var2;
        sr0 sr0Var;
        int i21;
        int i22;
        ur0 ur0Var;
        pt0 pt0Var;
        pt0 pt0Var2;
        pt0 pt0Var3;
        pt0 pt0Var4;
        pt0 pt0Var5;
        pt0 pt0Var6;
        pt0 pt0Var7;
        pt0 pt0Var8;
        pt0 pt0Var9;
        pt0 pt0Var10;
        pt0 pt0Var11;
        pt0 pt0Var12;
        pt0 pt0Var13;
        pt0 pt0Var14;
        pt0 pt0Var15;
        t00 t00Var;
        t00 t00Var2;
        t00 t00Var3;
        t00 t00Var4;
        xw0 xw0Var;
        xw0 xw0Var2;
        xw0 xw0Var3;
        xw0 xw0Var4;
        xw0 xw0Var5;
        xw0 xw0Var6;
        xw0 xw0Var7;
        xw0 xw0Var8;
        xw0 xw0Var9;
        xw0 xw0Var10;
        t00 t00Var5;
        pt0 pt0Var16;
        xw0 xw0Var11;
        pt0 pt0Var17;
        pt0 pt0Var18;
        qt0 qt0Var;
        ur0 ur0Var2;
        pt0 pt0Var19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        xu0 xu0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        xu0Var3.x = new Rect();
        xu0Var3.k0 = new qt0[2];
        xu0Var3.E0 = new ArrayList(10);
        xu0Var3.F0 = new ArrayList(10);
        xu0Var3.G0 = new ArrayList(10);
        xu0Var3.H0 = new ArrayList(10);
        xu0Var3.M0 = new qq0(xu0Var3, 2);
        xu0Var3.N0 = new ArrayList();
        xu0Var3.T0 = new Paint();
        xu0Var3.Z0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        xu0Var3.k1 = false;
        xu0Var3.l1 = false;
        xu0Var3.m1 = new int[]{3, 3};
        xu0Var3.r1 = new xr0(xu0Var3);
        xu0Var3.s1 = -5.0f;
        xu0Var3.t1 = new mu0[9];
        xu0Var3.I1 = new AnimationNotificationsLocker();
        xu0Var3.O1 = new SparseArray();
        xu0Var3.R1 = -1;
        xu0Var3.S1 = new us0(xu0Var3);
        xu0Var3.U1 = 0.0f;
        xu0Var3.Y1 = new HashMap();
        xu0Var3.Z1 = new HashMap();
        gh.c cVar = new gh.c();
        cVar.a(xu0Var3.h0(org.telegram.ui.ActionBar.j6.d6));
        bh.b bVar2 = bVar == null ? new bh.b(cVar) : bVar;
        xu0Var3.E = i13;
        xu0Var3.F1 = f6Var;
        t00 t00Var6 = new t00(context);
        xu0Var3.y = t00Var6;
        t00Var6.setIsSingleCell(true);
        TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(j3));
        xu0Var3.u1 = pu0Var;
        xu0Var3.D1 = jt0Var;
        int[] iArr = pu0Var.c;
        long j10 = pu0Var.s;
        xu0Var3.F = j10;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j10 == 0 ? i10 : 0, iArr[7], iArr[8]};
        xu0Var3.X0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                c10 = 5;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    xu0Var3.Y0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    xu0Var3.Y0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    xu0Var3.Y0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || xu0Var3.v0()))) {
                    xu0Var3.Y0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[1];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            xu0Var3.Y0 = 1;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[c10]) == i23 || i27 > 0)) {
                        xu0Var3.Y0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        xu0Var3.Y0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        xu0Var3.Y0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        xu0Var3.Y0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || xu0Var3.v0())) {
                        xu0Var3.Y0 = xu0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i11 == -1 || j10 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = xu0Var3.X0;
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
                            xu0Var3.Y0 = i30;
                        } else {
                            xu0Var3.Y0 = i11;
                        }
                    } else {
                        xu0Var3.Y0 = 14;
                    }
                } else {
                    xu0Var3.Y0 = 14;
                }
                xu0Var3.M0(i11);
                xu0Var3.d1 = chatFull2;
                xu0Var3.e1 = userFull;
                if (chatFull2 != null) {
                    xu0Var3.c1 = -chatFull2.migrated_from_chat_id;
                }
                xu0Var3.j1 = j3;
                i14 = 0;
                while (true) {
                    mu0VarArr = xu0Var3.t1;
                    if (i14 < mu0VarArr.length) {
                        break;
                    }
                    mu0VarArr[i14] = new mu0();
                    xu0Var3.t1[i14].j[0] = DialogObject.isEncryptedDialog(xu0Var3.j1) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    xu0Var3.t1[i14].j[1] = Integer.MAX_VALUE;
                    xu0Var3.R(i14);
                    if (xu0Var3.c1 != 0 && xu0Var3.d1 != null && xu0Var3.t1[i14].b[1].size() == 0) {
                        mu0 mu0Var = xu0Var3.t1[i14];
                        mu0Var.j[1] = xu0Var3.d1.migrated_from_max_id;
                        mu0Var.i[1] = false;
                    }
                    i14++;
                }
                xu0Var3.v1 = n2Var;
                xu0Var3.G = n2Var.getActionBar();
                xu0Var3.m1[0] = xu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : xu0Var3.S0();
                xu0Var3.m1[1] = xu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : xu0Var3.S0();
                xu0Var3.G1 = n2Var.getNotificationCenter().createObserversGroup(xu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i15 = 0; i15 < 10; i15++) {
                    if (i11 == 4) {
                        is0 is0Var = new is0(xu0Var3, context);
                        is0Var.T.c();
                        xu0Var3.G0.add(is0Var);
                    }
                }
                xu0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                xu0Var3.V0 = false;
                xu0Var3.W0 = null;
                ks0Var = xu0Var3.J0;
                if (ks0Var != null) {
                    ks0Var.g(false);
                }
                xu0Var3.U0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                xu0Var3.y0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(xu0Var3.h0(org.telegram.ui.ActionBar.j6.b7), PorterDuff.Mode.MULTIPLY));
                ns0 ns0Var = xu0Var3.I0;
                int currentTabId = ns0Var == null ? ns0Var.getCurrentTabId() : i11;
                ns0 ns0Var2 = new ns0(xu0Var3, context, xu0Var3.F1);
                i16 = xu0Var3.Y0;
                if (i16 != -1) {
                    ns0Var2.setInitialTabId(i16);
                    xu0Var3.Y0 = -1;
                }
                ns0Var2.b0 = 320L;
                int i32 = org.telegram.ui.ActionBar.j6.Fh;
                int i33 = org.telegram.ui.ActionBar.j6.Eh;
                ns0Var2.L = i32;
                ns0Var2.M = i33;
                ns0Var2.d();
                ns0Var2.setUseMinimalWidth(true);
                ns0Var2.setDelegate(new ps0(xu0Var3));
                xu0Var3.I0 = ns0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    xu0Var3.Z0[i17].clear();
                }
                xu0Var3.a1 = 0;
                xu0Var3.N0.clear();
                hu0Var = xu0Var3.R;
                if (hu0Var != null) {
                    hu0Var.w.clear();
                }
                if (!(xu0Var3 instanceof y30)) {
                    org.telegram.ui.ActionBar.z n10 = xu0Var3.G.n();
                    n10.addOnLayoutChangeListener(new os0(xu0Var3));
                    if (xu0Var3.j1 == xu0Var3.v1.getUserConfig().getClientUserId() && (xu0Var3.v1 instanceof ca0) && xu0Var3.D()) {
                        xu0Var3.m0 = n10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.v0 a2 = n10.a(0, 0);
                    a2.F();
                    a2.H = new vs0(xu0Var3);
                    xu0Var3.n0 = a2;
                    a2.setTranslationY(AndroidUtilities.dp(10.0f));
                    ks0 ks0Var2 = xu0Var3.J0;
                    a2.setSearchFieldHint(LocaleController.getString((ks0Var2 != null && ks0Var2.a() && xu0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a2.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a2.setVisibility(xu0Var3.v0() ? 8 : 4);
                }
                ImageView imageView = new ImageView(context);
                xu0Var3.r0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!xu0Var3.q0() || xu0Var3.t0()) {
                    f7 = 2.0f;
                } else {
                    xu0Var3.G.addView(imageView, w7.x5.e(48, 56, 85));
                    aj0 aj0Var = new aj0(context);
                    xu0Var3.s0 = aj0Var;
                    aj0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    aj0Var.e(R.raw.options_to_search, 24, 24);
                    aj0Var.getAnimatedDrawable().F *= 2.0f;
                    aj0Var.getAnimatedDrawable().h = true;
                    f7 = 2.0f;
                    aj0Var.setColorFilter(new PorterDuffColorFilter(xu0Var3.h0(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
                    aj0Var.setVisibility(8);
                    xu0Var3.G.addView(aj0Var, w7.x5.e(48, 56, 85));
                }
                context2 = context;
                imageView.setOnClickListener(new bt0(xu0Var3, j3, f6Var, context));
                v0Var = xu0Var3.n0;
                if (v0Var != null) {
                    EditTextBoldCursor searchField = v0Var.getSearchField();
                    int i34 = org.telegram.ui.ActionBar.j6.G6;
                    searchField.setTextColor(xu0Var3.h0(i34));
                    searchField.setHintTextColor(xu0Var3.h0(org.telegram.ui.ActionBar.j6.Si));
                    searchField.setCursorColor(xu0Var3.h0(i34));
                }
                xu0Var3.x0 = 0;
                org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var3.v1;
                ov0 ov0Var = (n2Var2 == null && (n2Var2.getFragmentView() instanceof ov0)) ? (ov0) xu0Var3.v1.getFragmentView() : null;
                ha haVar = new ha(context2, ov0Var);
                xu0Var3.B0 = haVar;
                haVar.setBackgroundColor(xu0Var3.h0(org.telegram.ui.ActionBar.j6.a7));
                haVar.setAlpha(0.0f);
                haVar.setClickable(true);
                haVar.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                xu0Var3.C0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                xu0Var3.D0 = g2Var;
                imageView2.setImageDrawable(g2Var);
                int i35 = org.telegram.ui.ActionBar.j6.y8;
                g2Var.a(xu0Var3.h0(i35));
                int i36 = org.telegram.ui.ActionBar.j6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.e0(xu0Var3.h0(i36), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                haVar.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                xu0Var3.N0.add(imageView2);
                imageView2.setOnClickListener(new sq0(xu0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                xu0Var3.A0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(xu0Var3.h0(i35));
                haVar.addView(numberTextView, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
                xu0Var3.N0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(xu0Var3.j1)) {
                    if (!xu0Var3.v0()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context2, xu0Var3.h0(i36), xu0Var3.h0(i35), false);
                        xu0Var3.u0 = v0Var2;
                        v0Var2.setIcon(R.drawable.msg_message);
                        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        v0Var2.setDuplicateParentStateEnabled(false);
                        haVar.addView(v0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        xu0Var3.N0.add(v0Var2);
                        v0Var2.setOnClickListener(new sq0(xu0Var3, 1));
                        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context2, xu0Var3.h0(i36), xu0Var3.h0(i35), false);
                        xu0Var3.t0 = v0Var3;
                        v0Var3.setIcon(R.drawable.msg_forward);
                        v0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        v0Var3.setDuplicateParentStateEnabled(false);
                        haVar.addView(v0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        xu0Var3.N0.add(v0Var3);
                        v0Var3.setOnClickListener(new sq0(xu0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context2, xu0Var3.h0(i36), xu0Var3.h0(i35), false);
                    xu0Var3.v0 = v0Var4;
                    v0Var4.setIcon(R.drawable.msg_pin);
                    v0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    v0Var4.setDuplicateParentStateEnabled(false);
                    v0Var4.setVisibility(8);
                    haVar.addView(v0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    xu0Var3.N0.add(v0Var4);
                    v0Var4.setOnClickListener(new sq0(xu0Var3, 3));
                    org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context2, xu0Var3.h0(i36), xu0Var3.h0(i35), false);
                    xu0Var3.w0 = v0Var5;
                    v0Var5.setIcon(R.drawable.msg_unpin);
                    v0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    v0Var5.setDuplicateParentStateEnabled(false);
                    v0Var5.setVisibility(8);
                    haVar.addView(v0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    xu0Var3.N0.add(v0Var5);
                    v0Var5.setOnClickListener(new sq0(xu0Var3, 4));
                    xu0Var3.p1();
                }
                org.telegram.ui.ActionBar.v0 v0Var6 = new org.telegram.ui.ActionBar.v0(context2, xu0Var3.h0(i36), xu0Var3.h0(i35), false);
                xu0Var3.l0 = v0Var6;
                v0Var6.setIcon(R.drawable.msg_delete);
                v0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                v0Var6.setDuplicateParentStateEnabled(false);
                haVar.addView(v0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                xu0Var3.N0.add(v0Var6);
                v0Var6.setOnClickListener(new sq0(xu0Var3, 5));
                xu0Var3.H = new ct0(xu0Var3, context2);
                xu0Var3.I = new ru0(xu0Var3, context2);
                xu0Var3.K = new ku0(xu0Var3, context2, 1);
                xu0Var3.L = new ku0(xu0Var3, context2, 2);
                xu0Var3.M = new ku0(xu0Var3, context2, 4);
                xu0Var3.N = new eu0(xu0Var3, context2, xu0Var3.v1.getCurrentAccount(), xu0Var3.v1.getResourceProvider());
                xu0Var3.O = new lt0(xu0Var3, context2);
                xu0Var3.g0 = new tt0(xu0Var3, context2, 1);
                xu0Var3.h0 = new tt0(xu0Var3, context2, 4);
                xu0Var3.i0 = new tt0(xu0Var3, context2, 3);
                xu0Var3.j0 = new ot0(xu0Var3, context2);
                xu0Var3.P = new it0(xu0Var3, context2);
                xu0Var3.Q = new gt0(xu0Var3, context2);
                xu0Var3.R = new hu0(xu0Var3, context2);
                xu0Var3.S = new iu0(xu0Var3, context2);
                if (!xu0Var3.v0() && !xu0Var3.l0() && xu0Var3.F == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", xu0Var3.v1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    dt0 dt0Var = new dt0(xu0Var3, context2, xu0Var3.v1.getParentLayout(), bundle);
                    xu0Var3.T = dt0Var;
                    long j11 = xu0Var3.j1;
                    org.telegram.ui.eo eoVar = dt0Var.a;
                    eoVar.d4 = j11;
                    eoVar.Pa = true;
                    dt0Var.setClipToOutline(true);
                    dt0Var.setOutlineProvider(new et0());
                }
                ht0 ht0Var = new ht0(xu0Var3, context2);
                xu0Var3.a0 = ht0Var;
                if (xu0Var3.F == 0) {
                    ht0Var.e = arrayList;
                    ht0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                xu0Var3.c0 = new ft0(xu0Var3, context2);
                xu0Var3.b0 = new s4.y(new jr0(xu0Var3));
                xu0Var3.d0 = new uu0(xu0Var3, context2, false);
                xu0Var3.e0 = new kr0(xu0Var3, context2);
                xu0Var3.f0 = new uu0(xu0Var3, context2, true);
                xu0Var3.J = new lu0(xu0Var3, context2);
                if (!xu0Var3.r0()) {
                    xu0Var3.U = new lr0(xu0Var3, context2, xu0Var3.v1, xu0Var3.j1);
                } else if (xu0Var3.v1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    xu0Var3.q0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i37 = org.telegram.ui.ActionBar.j6.Oh;
                    textView.setTextColor(xu0Var3.h0(i37));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.l1(0.15f, xu0Var3.h0(i37)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    xu0Var3.G.addView(textView, w7.x5.e(-2, 56, 85));
                    textView.setOnClickListener(new sq0(xu0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.n2 n2Var3 = xu0Var3.v1;
                    r10 = 0;
                    f6Var2 = f6Var;
                    nr0 nr0Var = new nr0(n2Var3.getCurrentAccount(), ((ProfileActivity) xu0Var3.v1).a(), context2, n2Var3, f6Var2, xu0Var3);
                    context2 = context2;
                    xu0 xu0Var4 = xu0Var3;
                    xu0Var4.V = nr0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    js jsVar = xu0Var4.P0;
                    nr0Var.setPaddingTop(dp + (jsVar != null ? (int) jsVar.c(0.0f) : 0));
                    xu0Var4.W = new sr0(xu0Var4, context2, ov0Var, xu0Var4.getStoriesController().B(xu0Var4.j1, true), new rr0(xu0Var4, context2, n2Var, f6Var2));
                    xu0Var = xu0Var4;
                    xu0Var.setWillNotDraw(false);
                    i18 = 0;
                    i19 = -1;
                    i20 = 0;
                    while (true) {
                        qt0VarArr = xu0Var.k0;
                        if (i20 >= qt0VarArr.length) {
                            break;
                        }
                        if (i20 == 0 && (qt0Var = qt0VarArr[i20]) != null && (ur0Var2 = qt0Var.x) != null) {
                            i19 = ur0Var2.L0();
                            if (i19 != xu0Var.k0[i20].x.B() - 1) {
                                pt0Var19 = xu0Var.k0[i20].h;
                                vk0 vk0Var = (vk0) pt0Var19.K(i19);
                                if (vk0Var != null) {
                                    i18 = vk0Var.a.getTop();
                                } else {
                                    i19 = -1;
                                }
                            } else {
                                i21 = i18;
                                i22 = -1;
                                tr0 tr0Var = new tr0(xu0Var, context2);
                                xu0Var.addView(tr0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, xu0Var.B0(), 0.0f, 0.0f));
                                if (i20 == 1) {
                                    tr0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                xu0Var.k0[i20] = tr0Var;
                                ur0Var = new ur0(xu0Var, tr0Var);
                                tr0Var.x = ur0Var;
                                ur0Var.z1(new vr0(xu0Var, tr0Var));
                                xu0Var.k0[i20].d = new s4.j();
                                xu0Var.k0[i20].d.n(280L);
                                xu0Var.k0[i20].d.o(pr.h);
                                qt0 qt0Var2 = xu0Var.k0[i20];
                                qt0Var2.d.m = false;
                                qt0Var2.h = new wr0(xu0Var, context2, tr0Var, ur0Var);
                                pt0Var = xu0Var.k0[i20].h;
                                pt0Var.setFastScrollEnabled(1);
                                pt0Var2 = xu0Var.k0[i20].h;
                                pt0Var2.setScrollingTouchSlop(1);
                                pt0Var3 = xu0Var.k0[i20].h;
                                pt0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f7));
                                pt0Var4 = xu0Var.k0[i20].h;
                                pt0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                pt0Var5 = xu0Var.k0[i20].h;
                                pt0Var5.setItemAnimator(r10);
                                pt0Var6 = xu0Var.k0[i20].h;
                                pt0Var6.setClipToPadding(false);
                                pt0Var7 = xu0Var.k0[i20].h;
                                pt0Var7.setSectionsType(2);
                                pt0Var8 = xu0Var.k0[i20].h;
                                pt0Var8.setLayoutManager(ur0Var);
                                qt0 qt0Var3 = xu0Var.k0[i20];
                                pt0Var9 = qt0Var3.h;
                                qt0Var3.addView(pt0Var9, w7.x5.c(-1.0f, -1));
                                xu0Var.k0[i20].r = new pt0(context2, r10);
                                qt0 qt0Var4 = xu0Var.k0[i20];
                                pt0 pt0Var20 = qt0Var4.r;
                                yr0 yr0Var = new yr0(xu0Var);
                                qt0Var4.s = yr0Var;
                                pt0Var20.setLayoutManager(yr0Var);
                                qt0 qt0Var5 = xu0Var.k0[i20];
                                qt0Var5.addView(qt0Var5.r, w7.x5.c(-1.0f, -1));
                                xu0Var.k0[i20].r.setVisibility(8);
                                xu0Var.k0[i20].r.i(new zr0(tr0Var));
                                pt0Var10 = xu0Var.k0[i20].h;
                                pt0Var10.i(new as0(xu0Var, tr0Var));
                                pt0Var11 = xu0Var.k0[i20].h;
                                pt0Var11.setOnItemClickListener(new org.telegram.ui.xe(xu0Var, tr0Var, context2, j3, f6Var2, 1));
                                pt0Var12 = xu0Var.k0[i20].h;
                                pt0Var12.setOnScrollListener(new cs0(xu0Var, tr0Var, ur0Var));
                                pt0Var13 = xu0Var.k0[i20].h;
                                pt0Var13.setOnItemLongClickListener(new ds0(xu0Var, tr0Var));
                                if (i20 == 0 && i22 != -1) {
                                    ur0Var.h1(i22, i21);
                                }
                                pt0Var14 = xu0Var.k0[i20].h;
                                xu0Var.k0[i20].y = new es0(context2, pt0Var14);
                                xu0Var.k0[i20].y.setVisibility(8);
                                pt0Var15 = xu0Var.k0[i20].h;
                                pt0Var15.D0(xu0Var.k0[i20].y, w7.x5.c(-1.0f, -1));
                                xu0Var.k0[i20].v = new fs0(xu0Var, context2, tr0Var);
                                t00Var = xu0Var.k0[i20].v;
                                t00Var.g();
                                t00Var2 = xu0Var.k0[i20].v;
                                t00Var2.setClipToOutline(true);
                                t00Var3 = xu0Var.k0[i20].v;
                                t00Var3.setOutlineProvider(new gs0());
                                if (i20 == 0) {
                                    xu0Var.k0[i20].setVisibility(8);
                                }
                                qt0 qt0Var6 = xu0Var.k0[i20];
                                t00Var4 = qt0Var6.v;
                                qt0Var6.w = new hs0(xu0Var, context2, t00Var4);
                                xw0Var = xu0Var.k0[i20].w;
                                xw0Var.d(8, false);
                                xw0Var2 = xu0Var.k0[i20].w;
                                xw0Var2.setAnimateLayoutChange(true);
                                qt0 qt0Var7 = xu0Var.k0[i20];
                                xw0Var3 = qt0Var7.w;
                                qt0Var7.addView(xw0Var3, w7.x5.c(-1.0f, -1));
                                xw0Var4 = xu0Var.k0[i20].w;
                                xw0Var4.setOnTouchListener(new ci.d(23));
                                xw0Var5 = xu0Var.k0[i20].w;
                                xw0Var5.e(true, false);
                                xw0Var6 = xu0Var.k0[i20].w;
                                xw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                xw0Var7 = xu0Var.k0[i20].w;
                                xw0Var7.f.setVisibility(8);
                                xw0Var8 = xu0Var.k0[i20].w;
                                xw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                xw0Var9 = xu0Var.k0[i20].w;
                                xw0Var9.f.setVisibility(8);
                                xw0Var10 = xu0Var.k0[i20].w;
                                t00Var5 = xu0Var.k0[i20].v;
                                xw0Var10.addView(t00Var5, w7.x5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                                pt0Var16 = xu0Var.k0[i20].h;
                                xw0Var11 = xu0Var.k0[i20].w;
                                pt0Var16.setEmptyView(xw0Var11);
                                pt0Var17 = xu0Var.k0[i20].h;
                                pt0Var17.l1(0, true);
                                qt0[] qt0VarArr2 = xu0Var.k0;
                                qt0 qt0Var8 = qt0VarArr2[i20];
                                pt0Var18 = qt0VarArr2[i20].h;
                                qt0Var8.E = new ok0(pt0Var18, xu0Var.k0[i20].x);
                                i20++;
                                f6Var2 = f6Var;
                                i18 = i21;
                                i19 = i22;
                            }
                        }
                        i21 = i18;
                        i22 = i19;
                        tr0 tr0Var2 = new tr0(xu0Var, context2);
                        xu0Var.addView(tr0Var2, w7.x5.d(-1, -1.0f, 51, 0.0f, xu0Var.B0(), 0.0f, 0.0f));
                        if (i20 == 1) {
                        }
                        xu0Var.k0[i20] = tr0Var2;
                        ur0Var = new ur0(xu0Var, tr0Var2);
                        tr0Var2.x = ur0Var;
                        ur0Var.z1(new vr0(xu0Var, tr0Var2));
                        xu0Var.k0[i20].d = new s4.j();
                        xu0Var.k0[i20].d.n(280L);
                        xu0Var.k0[i20].d.o(pr.h);
                        qt0 qt0Var22 = xu0Var.k0[i20];
                        qt0Var22.d.m = false;
                        qt0Var22.h = new wr0(xu0Var, context2, tr0Var2, ur0Var);
                        pt0Var = xu0Var.k0[i20].h;
                        pt0Var.setFastScrollEnabled(1);
                        pt0Var2 = xu0Var.k0[i20].h;
                        pt0Var2.setScrollingTouchSlop(1);
                        pt0Var3 = xu0Var.k0[i20].h;
                        pt0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f7));
                        pt0Var4 = xu0Var.k0[i20].h;
                        pt0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        pt0Var5 = xu0Var.k0[i20].h;
                        pt0Var5.setItemAnimator(r10);
                        pt0Var6 = xu0Var.k0[i20].h;
                        pt0Var6.setClipToPadding(false);
                        pt0Var7 = xu0Var.k0[i20].h;
                        pt0Var7.setSectionsType(2);
                        pt0Var8 = xu0Var.k0[i20].h;
                        pt0Var8.setLayoutManager(ur0Var);
                        qt0 qt0Var32 = xu0Var.k0[i20];
                        pt0Var9 = qt0Var32.h;
                        qt0Var32.addView(pt0Var9, w7.x5.c(-1.0f, -1));
                        xu0Var.k0[i20].r = new pt0(context2, r10);
                        qt0 qt0Var42 = xu0Var.k0[i20];
                        pt0 pt0Var202 = qt0Var42.r;
                        yr0 yr0Var2 = new yr0(xu0Var);
                        qt0Var42.s = yr0Var2;
                        pt0Var202.setLayoutManager(yr0Var2);
                        qt0 qt0Var52 = xu0Var.k0[i20];
                        qt0Var52.addView(qt0Var52.r, w7.x5.c(-1.0f, -1));
                        xu0Var.k0[i20].r.setVisibility(8);
                        xu0Var.k0[i20].r.i(new zr0(tr0Var2));
                        pt0Var10 = xu0Var.k0[i20].h;
                        pt0Var10.i(new as0(xu0Var, tr0Var2));
                        pt0Var11 = xu0Var.k0[i20].h;
                        pt0Var11.setOnItemClickListener(new org.telegram.ui.xe(xu0Var, tr0Var2, context2, j3, f6Var2, 1));
                        pt0Var12 = xu0Var.k0[i20].h;
                        pt0Var12.setOnScrollListener(new cs0(xu0Var, tr0Var2, ur0Var));
                        pt0Var13 = xu0Var.k0[i20].h;
                        pt0Var13.setOnItemLongClickListener(new ds0(xu0Var, tr0Var2));
                        if (i20 == 0) {
                            ur0Var.h1(i22, i21);
                        }
                        pt0Var14 = xu0Var.k0[i20].h;
                        xu0Var.k0[i20].y = new es0(context2, pt0Var14);
                        xu0Var.k0[i20].y.setVisibility(8);
                        pt0Var15 = xu0Var.k0[i20].h;
                        pt0Var15.D0(xu0Var.k0[i20].y, w7.x5.c(-1.0f, -1));
                        xu0Var.k0[i20].v = new fs0(xu0Var, context2, tr0Var2);
                        t00Var = xu0Var.k0[i20].v;
                        t00Var.g();
                        t00Var2 = xu0Var.k0[i20].v;
                        t00Var2.setClipToOutline(true);
                        t00Var3 = xu0Var.k0[i20].v;
                        t00Var3.setOutlineProvider(new gs0());
                        if (i20 == 0) {
                        }
                        qt0 qt0Var62 = xu0Var.k0[i20];
                        t00Var4 = qt0Var62.v;
                        qt0Var62.w = new hs0(xu0Var, context2, t00Var4);
                        xw0Var = xu0Var.k0[i20].w;
                        xw0Var.d(8, false);
                        xw0Var2 = xu0Var.k0[i20].w;
                        xw0Var2.setAnimateLayoutChange(true);
                        qt0 qt0Var72 = xu0Var.k0[i20];
                        xw0Var3 = qt0Var72.w;
                        qt0Var72.addView(xw0Var3, w7.x5.c(-1.0f, -1));
                        xw0Var4 = xu0Var.k0[i20].w;
                        xw0Var4.setOnTouchListener(new ci.d(23));
                        xw0Var5 = xu0Var.k0[i20].w;
                        xw0Var5.e(true, false);
                        xw0Var6 = xu0Var.k0[i20].w;
                        xw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        xw0Var7 = xu0Var.k0[i20].w;
                        xw0Var7.f.setVisibility(8);
                        xw0Var8 = xu0Var.k0[i20].w;
                        xw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        xw0Var9 = xu0Var.k0[i20].w;
                        xw0Var9.f.setVisibility(8);
                        xw0Var10 = xu0Var.k0[i20].w;
                        t00Var5 = xu0Var.k0[i20].v;
                        xw0Var10.addView(t00Var5, w7.x5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                        pt0Var16 = xu0Var.k0[i20].h;
                        xw0Var11 = xu0Var.k0[i20].w;
                        pt0Var16.setEmptyView(xw0Var11);
                        pt0Var17 = xu0Var.k0[i20].h;
                        pt0Var17.l1(0, true);
                        qt0[] qt0VarArr22 = xu0Var.k0;
                        qt0 qt0Var82 = qt0VarArr22[i20];
                        pt0Var18 = qt0VarArr22[i20].h;
                        qt0Var82.E = new ok0(pt0Var18, xu0Var.k0[i20].x);
                        i20++;
                        f6Var2 = f6Var;
                        i18 = i21;
                        i19 = i22;
                    }
                    view = xu0Var.W;
                    if (view != null) {
                        xu0Var.addView(view, w7.x5.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context2);
                    xu0Var.K0 = w0Var;
                    w0Var.T((int) (System.currentTimeMillis() / 1000), false, false);
                    w0Var.setAlpha(0.0f);
                    w0Var.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
                    w0Var.setTranslationY(-AndroidUtilities.dp(48.0f));
                    xu0Var.addView(w0Var, w7.x5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    N = xu0Var.N();
                    xu0Var2 = xu0Var;
                    if (!N) {
                        js jsVar2 = new js(context2);
                        xu0Var.P0 = jsVar2;
                        jsVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        dh.d b10 = bVar2.b(jsVar2, fh.b.n(f6Var));
                        b10.p(AndroidUtilities.dp(24.0f));
                        b10.o(AndroidUtilities.dp(7.0f));
                        jsVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        xu0Var.Q0 = frameLayout;
                        jsVar2.addView(frameLayout);
                        jsVar2.i(frameLayout, true, false);
                        jsVar2.setOnAnimatedHeightChangedListener(new qq0(xu0Var, 0));
                        js0 js0Var = new js0(xu0Var, context2, n2Var, this, f6Var);
                        xu0Var.R0 = js0Var;
                        frameLayout.addView(js0Var);
                        jsVar2.setCallFragmentContextView(js0Var);
                        xu0Var.addView(jsVar2, w7.x5.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                        js0Var.setDelegate(new rq0(xu0Var));
                        dh.d b11 = bVar2.b(xu0Var.I0, fh.b.n(f6Var));
                        b11.p(AndroidUtilities.dp(18.0f));
                        b11.o(AndroidUtilities.dp(6.666f));
                        xu0Var.I0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        xu0Var.I0.setClipToPadding(false);
                        xu0Var.I0.setBackground(r10);
                        xu0Var.I0.setBlurredBackground(b11);
                        xu0Var.I0.setOpen(false);
                        xu0Var.addView(xu0Var.I0, w7.x5.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                        Context context3 = xu0Var.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var4 = xu0Var.v1;
                        xu0 xu0Var5 = xu0Var;
                        ks0 ks0Var3 = new ks0(n2Var4.getCurrentAccount(), xu0Var.l0() ? 0L : xu0Var.j1, context3, n2Var4, f6Var, xu0Var5);
                        xu0 xu0Var6 = xu0Var5;
                        xu0Var6.J0 = ks0Var3;
                        ks0Var3.d(bVar2, fh.b.n(f6Var));
                        ks0Var3.setShown(0.0f);
                        xu0Var6.addView(ks0Var3, w7.x5.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        xu0Var6.addView(xu0Var6.B0, w7.x5.e(-1, 48, 51));
                        xu0Var2 = xu0Var6;
                    }
                    xu0Var2.v1(false);
                    xu0Var2.m1(false);
                    if (xu0Var2.X0[0] >= 0) {
                        xu0Var2.z0(false);
                    }
                    sr0Var = xu0Var2.W;
                    if (sr0Var != null && i12 > 0) {
                        sr0Var.setInitialTabId(i12);
                    }
                    xu0Var2.c2 = new lh(xu0Var2, 2);
                }
                f6Var2 = f6Var;
                r10 = 0;
                xu0Var = xu0Var3;
                xu0Var.setWillNotDraw(false);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    qt0VarArr = xu0Var.k0;
                    if (i20 >= qt0VarArr.length) {
                    }
                    qt0 qt0Var622 = xu0Var.k0[i20];
                    t00Var4 = qt0Var622.v;
                    qt0Var622.w = new hs0(xu0Var, context2, t00Var4);
                    xw0Var = xu0Var.k0[i20].w;
                    xw0Var.d(8, false);
                    xw0Var2 = xu0Var.k0[i20].w;
                    xw0Var2.setAnimateLayoutChange(true);
                    qt0 qt0Var722 = xu0Var.k0[i20];
                    xw0Var3 = qt0Var722.w;
                    qt0Var722.addView(xw0Var3, w7.x5.c(-1.0f, -1));
                    xw0Var4 = xu0Var.k0[i20].w;
                    xw0Var4.setOnTouchListener(new ci.d(23));
                    xw0Var5 = xu0Var.k0[i20].w;
                    xw0Var5.e(true, false);
                    xw0Var6 = xu0Var.k0[i20].w;
                    xw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    xw0Var7 = xu0Var.k0[i20].w;
                    xw0Var7.f.setVisibility(8);
                    xw0Var8 = xu0Var.k0[i20].w;
                    xw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    xw0Var9 = xu0Var.k0[i20].w;
                    xw0Var9.f.setVisibility(8);
                    xw0Var10 = xu0Var.k0[i20].w;
                    t00Var5 = xu0Var.k0[i20].v;
                    xw0Var10.addView(t00Var5, w7.x5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    pt0Var16 = xu0Var.k0[i20].h;
                    xw0Var11 = xu0Var.k0[i20].w;
                    pt0Var16.setEmptyView(xw0Var11);
                    pt0Var17 = xu0Var.k0[i20].h;
                    pt0Var17.l1(0, true);
                    qt0[] qt0VarArr222 = xu0Var.k0;
                    qt0 qt0Var822 = qt0VarArr222[i20];
                    pt0Var18 = qt0VarArr222[i20].h;
                    qt0Var822.E = new ok0(pt0Var18, xu0Var.k0[i20].x);
                    i20++;
                    f6Var2 = f6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = xu0Var.W;
                if (view != null) {
                }
                org.telegram.ui.Cells.w0 w0Var2 = new org.telegram.ui.Cells.w0(context2);
                xu0Var.K0 = w0Var2;
                w0Var2.T((int) (System.currentTimeMillis() / 1000), false, false);
                w0Var2.setAlpha(0.0f);
                w0Var2.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
                w0Var2.setTranslationY(-AndroidUtilities.dp(48.0f));
                xu0Var.addView(w0Var2, w7.x5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                N = xu0Var.N();
                xu0Var2 = xu0Var;
                if (!N) {
                }
                xu0Var2.v1(false);
                xu0Var2.m1(false);
                if (xu0Var2.X0[0] >= 0) {
                }
                sr0Var = xu0Var2.W;
                if (sr0Var != null) {
                    sr0Var.setInitialTabId(i12);
                }
                xu0Var2.c2 = new lh(xu0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        c10 = 5;
        if (i11 != 14) {
        }
        xu0Var3.Y0 = i11;
        xu0Var3.M0(i11);
        xu0Var3.d1 = chatFull2;
        xu0Var3.e1 = userFull;
        if (chatFull2 != null) {
        }
        xu0Var3.j1 = j3;
        i14 = 0;
        while (true) {
            mu0VarArr = xu0Var3.t1;
            if (i14 < mu0VarArr.length) {
            }
            i14++;
        }
        xu0Var3.v1 = n2Var;
        xu0Var3.G = n2Var.getActionBar();
        xu0Var3.m1[0] = xu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : xu0Var3.S0();
        xu0Var3.m1[1] = xu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : xu0Var3.S0();
        xu0Var3.G1 = n2Var.getNotificationCenter().createObserversGroup(xu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i15 < 10) {
        }
        xu0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        xu0Var3.V0 = false;
        xu0Var3.W0 = null;
        ks0Var = xu0Var3.J0;
        if (ks0Var != null) {
        }
        xu0Var3.U0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        xu0Var3.y0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(xu0Var3.h0(org.telegram.ui.ActionBar.j6.b7), PorterDuff.Mode.MULTIPLY));
        ns0 ns0Var3 = xu0Var3.I0;
        if (ns0Var3 == null) {
        }
        ns0 ns0Var22 = new ns0(xu0Var3, context, xu0Var3.F1);
        i16 = xu0Var3.Y0;
        if (i16 != -1) {
        }
        ns0Var22.b0 = 320L;
        int i322 = org.telegram.ui.ActionBar.j6.Fh;
        int i332 = org.telegram.ui.ActionBar.j6.Eh;
        ns0Var22.L = i322;
        ns0Var22.M = i332;
        ns0Var22.d();
        ns0Var22.setUseMinimalWidth(true);
        ns0Var22.setDelegate(new ps0(xu0Var3));
        xu0Var3.I0 = ns0Var22;
        while (i17 >= 0) {
        }
        xu0Var3.a1 = 0;
        xu0Var3.N0.clear();
        hu0Var = xu0Var3.R;
        if (hu0Var != null) {
        }
        if (!(xu0Var3 instanceof y30)) {
        }
        ImageView imageView3 = new ImageView(context);
        xu0Var3.r0 = imageView3;
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView3.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView3.setVisibility(4);
        if (xu0Var3.q0()) {
        }
        f7 = 2.0f;
        context2 = context;
        imageView3.setOnClickListener(new bt0(xu0Var3, j3, f6Var, context));
        v0Var = xu0Var3.n0;
        if (v0Var != null) {
        }
        xu0Var3.x0 = 0;
        org.telegram.ui.ActionBar.n2 n2Var22 = xu0Var3.v1;
        if (n2Var22 == null) {
        }
        ha haVar2 = new ha(context2, ov0Var);
        xu0Var3.B0 = haVar2;
        haVar2.setBackgroundColor(xu0Var3.h0(org.telegram.ui.ActionBar.j6.a7));
        haVar2.setAlpha(0.0f);
        haVar2.setClickable(true);
        haVar2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        xu0Var3.C0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var2 = new org.telegram.ui.ActionBar.g2(true);
        xu0Var3.D0 = g2Var2;
        imageView22.setImageDrawable(g2Var2);
        int i352 = org.telegram.ui.ActionBar.j6.y8;
        g2Var2.a(xu0Var3.h0(i352));
        int i362 = org.telegram.ui.ActionBar.j6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.j6.e0(xu0Var3.h0(i362), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        haVar2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        xu0Var3.N0.add(imageView22);
        imageView22.setOnClickListener(new sq0(xu0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        xu0Var3.A0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(xu0Var3.h0(i352));
        haVar2.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
        xu0Var3.N0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(xu0Var3.j1)) {
        }
        org.telegram.ui.ActionBar.v0 v0Var62 = new org.telegram.ui.ActionBar.v0(context2, xu0Var3.h0(i362), xu0Var3.h0(i352), false);
        xu0Var3.l0 = v0Var62;
        v0Var62.setIcon(R.drawable.msg_delete);
        v0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        v0Var62.setDuplicateParentStateEnabled(false);
        haVar2.addView(v0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        xu0Var3.N0.add(v0Var62);
        v0Var62.setOnClickListener(new sq0(xu0Var3, 5));
        xu0Var3.H = new ct0(xu0Var3, context2);
        xu0Var3.I = new ru0(xu0Var3, context2);
        xu0Var3.K = new ku0(xu0Var3, context2, 1);
        xu0Var3.L = new ku0(xu0Var3, context2, 2);
        xu0Var3.M = new ku0(xu0Var3, context2, 4);
        xu0Var3.N = new eu0(xu0Var3, context2, xu0Var3.v1.getCurrentAccount(), xu0Var3.v1.getResourceProvider());
        xu0Var3.O = new lt0(xu0Var3, context2);
        xu0Var3.g0 = new tt0(xu0Var3, context2, 1);
        xu0Var3.h0 = new tt0(xu0Var3, context2, 4);
        xu0Var3.i0 = new tt0(xu0Var3, context2, 3);
        xu0Var3.j0 = new ot0(xu0Var3, context2);
        xu0Var3.P = new it0(xu0Var3, context2);
        xu0Var3.Q = new gt0(xu0Var3, context2);
        xu0Var3.R = new hu0(xu0Var3, context2);
        xu0Var3.S = new iu0(xu0Var3, context2);
        if (!xu0Var3.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", xu0Var3.v1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            dt0 dt0Var2 = new dt0(xu0Var3, context2, xu0Var3.v1.getParentLayout(), bundle2);
            xu0Var3.T = dt0Var2;
            long j112 = xu0Var3.j1;
            org.telegram.ui.eo eoVar2 = dt0Var2.a;
            eoVar2.d4 = j112;
            eoVar2.Pa = true;
            dt0Var2.setClipToOutline(true);
            dt0Var2.setOutlineProvider(new et0());
        }
        ht0 ht0Var2 = new ht0(xu0Var3, context2);
        xu0Var3.a0 = ht0Var2;
        if (xu0Var3.F == 0) {
        }
        xu0Var3.c0 = new ft0(xu0Var3, context2);
        xu0Var3.b0 = new s4.y(new jr0(xu0Var3));
        xu0Var3.d0 = new uu0(xu0Var3, context2, false);
        xu0Var3.e0 = new kr0(xu0Var3, context2);
        xu0Var3.f0 = new uu0(xu0Var3, context2, true);
        xu0Var3.J = new lu0(xu0Var3, context2);
        if (!xu0Var3.r0()) {
        }
        f6Var2 = f6Var;
        r10 = 0;
        xu0Var = xu0Var3;
        xu0Var.setWillNotDraw(false);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            qt0VarArr = xu0Var.k0;
            if (i20 >= qt0VarArr.length) {
            }
            qt0 qt0Var6222 = xu0Var.k0[i20];
            t00Var4 = qt0Var6222.v;
            qt0Var6222.w = new hs0(xu0Var, context2, t00Var4);
            xw0Var = xu0Var.k0[i20].w;
            xw0Var.d(8, false);
            xw0Var2 = xu0Var.k0[i20].w;
            xw0Var2.setAnimateLayoutChange(true);
            qt0 qt0Var7222 = xu0Var.k0[i20];
            xw0Var3 = qt0Var7222.w;
            qt0Var7222.addView(xw0Var3, w7.x5.c(-1.0f, -1));
            xw0Var4 = xu0Var.k0[i20].w;
            xw0Var4.setOnTouchListener(new ci.d(23));
            xw0Var5 = xu0Var.k0[i20].w;
            xw0Var5.e(true, false);
            xw0Var6 = xu0Var.k0[i20].w;
            xw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            xw0Var7 = xu0Var.k0[i20].w;
            xw0Var7.f.setVisibility(8);
            xw0Var8 = xu0Var.k0[i20].w;
            xw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            xw0Var9 = xu0Var.k0[i20].w;
            xw0Var9.f.setVisibility(8);
            xw0Var10 = xu0Var.k0[i20].w;
            t00Var5 = xu0Var.k0[i20].v;
            xw0Var10.addView(t00Var5, w7.x5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            pt0Var16 = xu0Var.k0[i20].h;
            xw0Var11 = xu0Var.k0[i20].w;
            pt0Var16.setEmptyView(xw0Var11);
            pt0Var17 = xu0Var.k0[i20].h;
            pt0Var17.l1(0, true);
            qt0[] qt0VarArr2222 = xu0Var.k0;
            qt0 qt0Var8222 = qt0VarArr2222[i20];
            pt0Var18 = qt0VarArr2222[i20].h;
            qt0Var8222.E = new ok0(pt0Var18, xu0Var.k0[i20].x);
            i20++;
            f6Var2 = f6Var;
            i18 = i21;
            i19 = i22;
        }
        view = xu0Var.W;
        if (view != null) {
        }
        org.telegram.ui.Cells.w0 w0Var22 = new org.telegram.ui.Cells.w0(context2);
        xu0Var.K0 = w0Var22;
        w0Var22.T((int) (System.currentTimeMillis() / 1000), false, false);
        w0Var22.setAlpha(0.0f);
        w0Var22.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
        w0Var22.setTranslationY(-AndroidUtilities.dp(48.0f));
        xu0Var.addView(w0Var22, w7.x5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        N = xu0Var.N();
        xu0Var2 = xu0Var;
        if (!N) {
        }
        xu0Var2.v1(false);
        xu0Var2.m1(false);
        if (xu0Var2.X0[0] >= 0) {
        }
        sr0Var = xu0Var2.W;
        if (sr0Var != null) {
        }
        xu0Var2.c2 = new lh(xu0Var2, 2);
    }

    public static kt0 M(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        kt0 kt0Var = new kt0(context, f6Var);
        TextView textView = kt0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return kt0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return kt0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return kt0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return kt0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return kt0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return kt0Var;
        }
        ImageView imageView = kt0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return kt0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return kt0Var;
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

    public static void g(xu0 xu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.dm dmVar = new org.telegram.ui.dm(xu0Var, i10, storyItem, 11);
        bi.u8 storiesController = xu0Var.getStoriesController();
        long j3 = xu0Var.j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j3, arrayList);
        yc.a0(xu0Var.v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), dmVar).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bi.u8 getStoriesController() {
        return MessagesController.getInstance(this.v1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(xu0 xu0Var, TL_stories.StoryItem storyItem) {
        xu0Var.getStoriesController().o0(xu0Var.j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        yc.a0(xu0Var.v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(xu0 xu0Var, long j3, int i10, String str) {
        bi.f8 B = xu0Var.getStoriesController().B(j3, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((bi.m8) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(xu0 xu0Var, TL_stories.StoryItem storyItem, bi.m8 m8Var) {
        xu0Var.getStoriesController().c(m8Var.a, xu0Var.j1, storyItem);
        AndroidUtilities.runOnUIThread(new jn0(7, xu0Var, m8Var), 100L);
    }

    public static void m(xu0 xu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, n70 n70Var, bi.m8 m8Var) {
        String formatString;
        long j3 = xu0Var.j1;
        if (hashSet.contains(Integer.valueOf(m8Var.a))) {
            xu0Var.getStoriesController().c(m8Var.a, j3, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, m8Var.b);
        } else {
            bi.u8 storiesController = xu0Var.getStoriesController();
            int i10 = m8Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j3, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, m8Var.b);
        }
        yc.a0(xu0Var.v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        n70Var.u();
    }

    public static void n(xu0 xu0Var, long j3, int i10) {
        bi.f8 B = xu0Var.getStoriesController().B(j3, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        bi.m8 m8Var = (bi.m8) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = m8Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.t7) {
            return ((org.telegram.ui.Cells.t7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            return ((org.telegram.ui.Cells.j7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        return i10 == 8 || i10 == 9 || w0(i10);
    }

    public static void q(qt0 qt0Var, mu0[] mu0VarArr, boolean z10) {
        jn0 jn0Var;
        if (!z10) {
            if (qt0Var.G == null || (jn0Var = qt0Var.H) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(jn0Var);
            qt0Var.H.run();
            qt0Var.H = null;
            qt0Var.G = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || qt0Var.G != null || qt0Var.I || qt0Var.h.getFastScroll() == null || !qt0Var.h.getFastScroll().a0 || qt0Var.h.getFastScroll().getVisibility() != 0 || mu0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        qt0Var.I = true;
        Context context = qt0Var.getContext();
        oq0 oq0Var = new oq0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.j6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        oq0Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qf, false)));
        oq0Var.addView(textView, w7.x5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        nq0 nq0Var = new nq0(context);
        nq0Var.a = new Random();
        Paint paint = new Paint(1);
        nq0Var.b = paint;
        Paint paint2 = new Paint(1);
        nq0Var.c = paint2;
        nq0Var.f = 1.0f;
        nq0Var.h = 0.0f;
        paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        Paint paint3 = new Paint();
        nq0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        nq0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        oq0Var.addView(nq0Var, w7.x5.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        qt0Var.G = oq0Var;
        qt0Var.addView(oq0Var, w7.x5.c(-2.0f, -2));
        qt0Var.G.setAlpha(0.0f);
        qt0Var.G.setScaleX(0.8f);
        qt0Var.G.setScaleY(0.8f);
        qt0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        qt0Var.invalidate();
        jn0 jn0Var2 = new jn0(6, qt0Var, oq0Var);
        qt0Var.H = jn0Var2;
        AndroidUtilities.runOnUIThread(jn0Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(xu0 xu0Var) {
        xu0 xu0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j3 = xu0Var.j1;
        mu0[] mu0VarArr = xu0Var.t1;
        qt0 W = xu0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e7) {
                FileLog.e(e7);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                xu0Var.H1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                xu0Var2 = xu0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new hg.k0((FrameLayout) xu0Var2, view, (View) W, (Object) bitmap2, 3)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new h70(W, 20)).setDuration(200L).start();
                pu0 pu0Var = xu0Var2.u1;
                int[] iArr = pu0Var.c;
                arrayList = pu0Var.n[0].a;
                mu0 mu0Var = mu0VarArr[0];
                int[] iArr2 = mu0Var.f;
                iArr2[1] = 0;
                i10 = mu0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                mu0Var.h = false;
                xu0Var2.y0(0, !DialogObject.isEncryptedDialog(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                xu0Var2.z0(false);
                xu0Var2.D1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    mu0 mu0Var2 = mu0VarArr[0];
                    int i12 = mu0Var2.q;
                    if (i12 == 0) {
                        mu0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            mu0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        mu0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        xu0Var2 = xu0Var;
        pu0 pu0Var2 = xu0Var2.u1;
        int[] iArr3 = pu0Var2.c;
        arrayList = pu0Var2.n[0].a;
        mu0 mu0Var3 = mu0VarArr[0];
        int[] iArr22 = mu0Var3.f;
        iArr22[1] = 0;
        i10 = mu0Var3.q;
        if (i10 != 0) {
        }
        mu0Var3.h = false;
        xu0Var2.y0(0, !DialogObject.isEncryptedDialog(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        xu0Var2.z0(false);
        xu0Var2.D1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j3);
        while (i11 < arrayList.size()) {
        }
    }

    public static void t(xu0 xu0Var, int i10, boolean z10) {
        qt0[] qt0VarArr = xu0Var.k0;
        if (qt0VarArr[0].F == i10) {
            return;
        }
        qt0 qt0Var = qt0VarArr[1];
        qt0Var.F = i10;
        qt0Var.setVisibility(0);
        xu0Var.k0();
        xu0Var.m1(true);
        xu0Var.h1 = z10;
        xu0Var.L0();
        xu0Var.A(!xu0Var.s0(i10), true);
        xu0Var.q1(true);
    }

    public static int u(xu0 xu0Var, s4.h0 h0Var) {
        if (h0Var == xu0Var.c0) {
            return 8;
        }
        if (h0Var == xu0Var.e0) {
            return 9;
        }
        for (wu0 wu0Var : xu0Var.Y1.values()) {
            if (wu0Var.c == h0Var) {
                return wu0Var.a;
            }
        }
        return -1;
    }

    public static int v(xu0 xu0Var, s4.h0 h0Var) {
        if (h0Var == xu0Var.d0) {
            return 8;
        }
        if (h0Var == xu0Var.f0) {
            return 9;
        }
        for (wu0 wu0Var : xu0Var.Y1.values()) {
            if (wu0Var.d == h0Var) {
                return wu0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        aj0 aj0Var = this.s0;
        if (aj0Var == null || this.V1 == z10) {
            return;
        }
        this.V1 = z10;
        if (z10 || aj0Var.getAnimatedDrawable().b0 >= 20) {
            aj0Var.getAnimatedDrawable().N(this.V1 ? 50 : 100);
        } else {
            aj0Var.getAnimatedDrawable().N(0);
        }
        if (z11) {
            aj0Var.getAnimatedDrawable().start();
        } else {
            aj0Var.getAnimatedDrawable().K(aj0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i10) {
        int i11;
        mu0[] mu0VarArr = this.t1;
        if (i10 == 0) {
            int i12 = mu0VarArr[0].q;
            i11 = i12 == 1 ? 6 : i12 == 2 ? 7 : 0;
        } else {
            i11 = i10 == 1 ? 1 : i10 == 2 ? 2 : i10 == 4 ? 4 : i10 == 5 ? 5 : 3;
        }
        mu0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, mu0VarArr[i10].k, i11, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i10].p, null, null);
    }

    public final void B(int i10) {
        int i11;
        qt0 W = W(this.p1);
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
            pt0 pt0Var = W.r;
            int paddingLeft = pt0Var.getPaddingLeft();
            pt0 pt0Var2 = W.r;
            int Z = Z(W.F);
            pt0Var2.d3 = Z;
            int paddingRight = W.r.getPaddingRight();
            pt0 pt0Var3 = W.r;
            int Y = Y(v0());
            pt0Var3.e3 = Y;
            pt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i10);
            W.r.a0();
            int i12 = 0;
            while (true) {
                qt0[] qt0VarArr = this.k0;
                if (i12 >= qt0VarArr.length) {
                    break;
                }
                qt0 qt0Var = qt0VarArr[i12];
                if (qt0Var != null && ((i11 = qt0Var.F) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(qt0VarArr[i12].h);
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
            ofFloat.addUpdateListener(new ms0(this, W, i13));
            ofFloat.addListener(new fi.y2(this, p0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(pr.f);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (!r02) {
            return v0() || (n2Var != null && n2Var.getMessagesController().getStoriesController().h(j3));
        }
        TLRPC.User user = MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j3));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10, View view) {
        boolean z10;
        lr0 lr0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        TLRPC.User user2;
        int i11 = 3;
        hu0 hu0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        final int i12 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.e1 != null && n2Var.getMessagesController().isUserNoForwards(this.e1)) {
                    i40 i40Var = this.E1;
                    if (i40Var != null) {
                        i40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.d1 != null) {
                    TLRPC.Chat chat2 = n2Var.getMessagesController().getChat(Long.valueOf(this.d1.id));
                    if (n2Var.getMessagesController().isChatNoForwards(chat2)) {
                        i40 i40Var2 = this.E1;
                        if (i40Var2 != null) {
                            i40Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.E1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    i40 i40Var3 = this.E1;
                    if (i40Var3 != null) {
                        i40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.uy uyVar = new org.telegram.ui.uy(bundle);
                uyVar.C2 = new rq0(this);
                n2Var.presentFragment(uyVar);
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
                    TLRPC.Chat chat3 = n2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat3 != null && chat3.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat3.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.co coVar = new org.telegram.ui.co(bundle2);
                coVar.L7 = messageObject.getId();
                long j3 = this.F;
                if (j3 != 0) {
                    og.d.a(coVar, MessagesStorage.TopicKey.of(dialogId, j3));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                n2Var.presentFragment(coVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    ft0 ft0Var = this.c0;
                    if (ft0Var == null || ft0Var.s == null) {
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
                SavedMessagesController savedMessagesController = n2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i14 = 0; i14 < savedMessagesController.allDialogs.size(); i14++) {
                    long j10 = savedMessagesController.allDialogs.get(i14).dialogId;
                    if (hu0Var.w.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    z10 = true;
                    int i15 = 0;
                    while (true) {
                        qt0[] qt0VarArr = this.k0;
                        if (i15 >= qt0VarArr.length) {
                            break;
                        }
                        qt0 qt0Var = qt0VarArr[i15];
                        if (qt0Var.F == 11) {
                            qt0Var.x.h1(0, 0);
                            break;
                        }
                        i15++;
                    }
                } else {
                    z10 = true;
                    n2Var.showDialog(new sg.k0(33, n2Var.getCurrentAccount(), getContext(), n2Var, null));
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
                if (!r0() || (lr0Var = this.U) == null || lr0Var.getCurrentList() == null) {
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.yq0
                        public final /* synthetic */ xu0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.a2
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                            switch (i12) {
                                case 0:
                                    xu0 xu0Var = this.b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var.v1;
                                    bi.u8 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j11 = xu0Var.j1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j11, arrayList4);
                                    yc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    xu0Var.L(false);
                                    break;
                                default:
                                    xu0 xu0Var2 = this.b;
                                    xu0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i18 >= arrayList5.size()) {
                                            xu0Var2.L(true);
                                            break;
                                        } else {
                                            xu0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i18)).longValue());
                                            i18++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(i11));
                    b2Var.show();
                    b2Var.h();
                    return;
                }
                bi.b8 currentList = lr0Var.getCurrentList();
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
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = string2;
                b2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new s50(this, currentList, arrayList4, r10 ? 1 : 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new wo0(2));
                b2Var2.show();
                b2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j11 = this.j1;
            if (DialogObject.isEncryptedDialog(j11)) {
                encryptedChat = org.telegram.messenger.w1.m(n2Var.getMessagesController(), j11);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j11)) {
                user = n2Var.getMessagesController().getUser(Long.valueOf(j11));
                chat = null;
                encryptedChat = null;
            } else {
                chat = n2Var.getMessagesController().getChat(Long.valueOf(-j11));
                user = null;
                encryptedChat = null;
            }
            e5.z(n2Var, user, chat, encryptedChat, null, this.c1, null, this.Z0, null, 0, 0, null, new qq0(this, r10 ? 1 : 0), null, this.F1);
            return;
        }
        SavedMessagesController savedMessagesController2 = n2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i18 = 0; i18 < savedMessagesController2.allDialogs.size(); i18++) {
            long j12 = savedMessagesController2.allDialogs.get(i18).dialogId;
            if (hu0Var.w.contains(Long.valueOf(j12))) {
                arrayList5.add(Long.valueOf(j12));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z11 = false;
        } else {
            Long l4 = (Long) arrayList5.get(0);
            long longValue = l4.longValue();
            z11 = longValue == n2Var.getUserConfig().getClientUserId();
            if (longValue < 0) {
                TLRPC.Chat chat4 = n2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat4 != null) {
                    str = chat4.title;
                }
            } else if (longValue >= 0 && (user2 = n2Var.getMessagesController().getUser(l4)) != null) {
                str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, f6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
        b2Var3.R = formatString;
        b2Var3.T = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i19 = r10 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.yq0
            public final /* synthetic */ xu0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i172) {
                switch (i19) {
                    case 0:
                        xu0 xu0Var = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var.v1;
                        bi.u8 storiesController = n2Var2.getMessagesController().getStoriesController();
                        long j112 = xu0Var.j1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j112, arrayList42);
                        yc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        xu0Var.L(false);
                        break;
                    default:
                        xu0 xu0Var2 = this.b;
                        xu0Var2.getClass();
                        int i182 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i182 >= arrayList52.size()) {
                                xu0Var2.L(true);
                                break;
                            } else {
                                xu0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i182)).longValue());
                                i182++;
                            }
                        }
                }
            }
        });
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var3);
        TextView textView = (TextView) b2Var3.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof y30);
    }

    public final boolean E() {
        qt0 qt0Var;
        qt0[] qt0VarArr = this.k0;
        if (qt0VarArr == null || (qt0Var = qt0VarArr[0]) == null) {
            return false;
        }
        if (this.k1 && p0(qt0Var.F)) {
            return false;
        }
        boolean p02 = p0(qt0VarArr[0].F);
        int i10 = this.m1[p02 ? 1 : 0];
        return i10 != X(p02 ? 1 : 0, i10, false);
    }

    public final void F() {
        ns0 ns0Var = this.I0;
        if (ns0Var.e(ns0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = ns0Var.getFirstTabId();
        ns0Var.setInitialTabId(firstTabId);
        this.k0[0].F = firstTabId;
        m1(false);
    }

    public final void F0() {
        bi.l8 l8Var;
        bi.l8 l8Var2;
        this.G1.removeAllObservers();
        ft0 ft0Var = this.c0;
        if (ft0Var != null && (l8Var2 = ft0Var.s) != null && l8Var2 != null) {
            l8Var2.z(ft0Var.v);
        }
        kr0 kr0Var = this.e0;
        if (kr0Var != null && (l8Var = kr0Var.s) != null && l8Var != null) {
            l8Var.z(kr0Var.v);
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            vu0 vu0Var = ((wu0) it.next()).c;
            bi.l8 l8Var3 = vu0Var.s;
            if (l8Var3 != null && l8Var3 != null) {
                l8Var3.z(vu0Var.v);
            }
        }
    }

    public final void G(qt0 qt0Var, ll0 ll0Var, s4.c0 c0Var) {
        int i10;
        int i11;
        s4.c1 K;
        bi.l8 l8Var;
        if (this.o1 || this.J1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (ll0Var.getFastScroll() == null || !ll0Var.getFastScroll().n || currentTimeMillis - qt0Var.a >= 300) {
            qt0Var.a = currentTimeMillis;
            if ((this.V0 && this.U0 && qt0Var.F != 11) || qt0Var.F == 7) {
                return;
            }
            int L0 = c0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(c0Var.N0() - L0) + 1;
            int h = ll0Var.getAdapter() == null ? 0 : ll0Var.getAdapter().h();
            int i12 = qt0Var.F;
            int[] iArr = this.m1;
            mu0[] mu0VarArr = this.t1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                h = mu0VarArr[i12].d() + mu0VarArr[i12].a.size();
                mu0 mu0Var = mu0VarArr[i12];
                if (mu0Var.h && mu0Var.e.size() > 2 && qt0Var.F == 0 && mu0VarArr[i12].a.size() != 0) {
                    float f7 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((ll0Var.getMeasuredHeight() / (ll0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((vt0) mu0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((vt0) mu0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < mu0VarArr[i12].m && mu0VarArr[0].m - i10 > measuredHeight)) {
                        org.telegram.ui.dm dmVar = new org.telegram.ui.dm(this, i12, ll0Var, 13);
                        this.J1 = dmVar;
                        AndroidUtilities.runOnUIThread(dmVar);
                        return;
                    }
                }
            }
            int i13 = qt0Var.F;
            if (i13 == 7) {
                return;
            }
            if (p0(i13)) {
                uu0 k12 = k1(qt0Var.F);
                if (k12 == null || (l8Var = k12.s) == null || L0 + abs <= l8Var.i() - iArr[1]) {
                    return;
                }
                k12.P();
                return;
            }
            int i14 = qt0Var.F;
            if (i14 == 6) {
                if (abs > 0) {
                    it0 it0Var = this.P;
                    boolean z10 = it0Var.h;
                    ArrayList arrayList = it0Var.d;
                    if (z10 || it0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    it0.E(it0Var, ((TLRPC.Chat) i2.g.h(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < qt0Var.h.getChildCount(); i16++) {
                    View childAt = qt0Var.h.getChildAt(i16);
                    qt0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                s4.h0 adapter = qt0Var.h.getAdapter();
                iu0 iu0Var = this.S;
                if (adapter != iu0Var) {
                    if (i15 + 1 >= n2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        n2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < iu0Var.h.size() + iu0Var.e.size() || iu0Var.s || iu0Var.r) {
                        return;
                    }
                    iu0Var.r = true;
                    iu0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > h - i17 || mu0VarArr[i18].o) {
                mu0 mu0Var2 = mu0VarArr[i18];
                if (!mu0Var2.g) {
                    if (i14 == 0) {
                        int i19 = mu0VarArr[0].q;
                        i11 = i19 == 1 ? 6 : i19 == 2 ? 7 : 0;
                    } else {
                        i11 = i14 == 1 ? 1 : i14 == 2 ? 2 : i14 == 4 ? 4 : i14 == 5 ? 5 : i14 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = mu0Var2.i;
                    if (!zArr[0]) {
                        mu0Var2.g = true;
                        n2Var.getMediaDataController().loadMedia(this.j1, 50, mu0VarArr[i18].j[0], 0, i11, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i18].p, null, null);
                    } else if (this.c1 != 0 && !zArr[1]) {
                        mu0Var2.g = true;
                        n2Var.getMediaDataController().loadMedia(this.c1, 50, mu0VarArr[i18].j[1], 0, i11, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i18].p, null, null);
                    }
                }
            }
            int i20 = mu0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.H.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                mu0 mu0Var3 = mu0VarArr[i18];
                if (!mu0Var3.g && !mu0Var3.l && !mu0Var3.o) {
                    A0(qt0Var.F);
                }
            }
            qt0 qt0Var2 = this.k0[0];
            if (qt0Var2.h == ll0Var) {
                int i21 = qt0Var2.F;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = ll0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.u7;
                    org.telegram.ui.Cells.w0 w0Var = this.K0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.e2) {
                            w0Var.T(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        MessageObject messageObject = u7Var.e <= 0 ? null : u7Var.b[0];
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
        sr0 sr0Var = this.W;
        if (sr0Var == null || !sr0Var.w) {
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
                    org.telegram.ui.ActionBar.v0 v0Var = this.u0;
                    if (v0Var != null) {
                        v0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.t0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        v0Var2.setVisibility(i13);
                    }
                    u1();
                }
                this.b1 = false;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.u7) {
                    ((org.telegram.ui.Cells.u7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                xr0 xr0Var = this.r1;
                mu0[] mu0VarArr = this.t1;
                org.telegram.ui.ActionBar.n2 n2Var = this.v1;
                if (i11 == 0) {
                    mu0 mu0Var = mu0VarArr[i11];
                    int i14 = i10 - mu0Var.m;
                    if (i14 >= 0 && i14 < mu0Var.a.size()) {
                        PhotoViewer.t1().K2(null, n2Var, null);
                        PhotoViewer.t1().a2(mu0VarArr[i11].a, i14, this.j1, this.c1, this.F, xr0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    int indexOf = mu0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().a2(org.telegram.messenger.w1.l(messageObject), 0, 0L, 0L, 0L, xr0Var);
                    } else {
                        PhotoViewer.t1().a2(mu0VarArr[i11].a, indexOf, this.j1, this.c1, this.F, xr0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (j7Var.G) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, n2Var, null);
                                int indexOf2 = mu0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().a2(org.telegram.messenger.w1.l(messageObject), 0, 0L, 0L, 0L, xr0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().a2(mu0VarArr[i11].a, indexOf2, this.j1, this.c1, this.F, xr0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, n2Var.getParentActivity(), n2Var);
                        } else if (j7Var.F) {
                            n2Var.getFileLoader().cancelLoadFile(document);
                            j7Var.f(true);
                        } else {
                            MessageObject message = j7Var.getMessage();
                            message.putInDownloadsStore = true;
                            n2Var.getFileLoader().loadFile(document, message, 0, 0);
                            j7Var.f(true);
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
                                    n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                tu.J(n2Var, messageObject, this.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.n7) view).E;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            R0(str);
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else if (p0(i11)) {
                    uu0 k12 = k1(i11);
                    bi.l8 l8Var = k12 != null ? k12.s : null;
                    if (l8Var == null) {
                        return;
                    }
                    bi.pb orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    bi.d9 a2 = bi.d9.a(this.k0[0].h);
                    a2.e = new kv(l8Var, 18);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a2.s += i12;
                    orCreateStoryViewer.C(context, id2, l8Var, a2);
                }
            }
            p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        lr0 lr0Var;
        qt0[] qt0VarArr = this.k0;
        int i10 = qt0VarArr[0].F;
        if (i10 == 13 && (lr0Var = this.U) != null) {
            View currentView = lr0Var.n.getCurrentView();
            if (currentView instanceof ci.t) {
                ci.t tVar = (ci.t) currentView;
                ci.l lVar = tVar.v;
                ci.i iVar = tVar.f;
                if (tVar.a != null && tVar.getParent() != null) {
                    if (!tVar.b || tVar.K) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (tVar.L && !tVar.K && motionEvent.getPointerCount() == 2) {
                                tVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                tVar.Q = 1.0f;
                                tVar.N = motionEvent.getPointerId(0);
                                tVar.O = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) tVar.getParent();
                                tVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - tVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - tVar.getY());
                                int i11 = tVar.U;
                                Rect rect = tVar.V;
                                tVar.S = -1;
                                int i12 = y3 + iVar.X2;
                                for (int i13 = 0; i13 < iVar.getChildCount(); i13++) {
                                    View childAt = iVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
                                        tVar.S = RecyclerView.S(childAt);
                                        tVar.T = childAt.getTop();
                                    }
                                }
                                tVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) tVar.getParent()).getY()) - tVar.getY() > 0.0f) {
                                    tVar.L = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (tVar.K || tVar.M)) {
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                                if (tVar.N == motionEvent.getPointerId(i16)) {
                                    i14 = i16;
                                }
                                if (tVar.O == motionEvent.getPointerId(i16)) {
                                    i15 = i16;
                                }
                            }
                            if (i14 == -1 || i15 == -1) {
                                tVar.L = false;
                                tVar.M = false;
                                tVar.K = false;
                                tVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / tVar.P;
                            tVar.Q = hypot;
                            if (!tVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                tVar.K = true;
                                boolean z10 = hypot > 1.0f;
                                tVar.R = z10;
                                tVar.b(z10);
                            }
                            if (tVar.K) {
                                boolean z11 = tVar.R;
                                if ((!z11 || tVar.Q >= 1.0f) && (z11 || tVar.Q <= 1.0f)) {
                                    tVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.w1.y(2.0f, tVar.Q, 1.0f, 1.0f) : (1.0f - tVar.Q) / 0.5f));
                                } else {
                                    tVar.c = 0.0f;
                                }
                                float f7 = tVar.c;
                                if (f7 == 1.0f || f7 == 0.0f) {
                                    if (f7 == 1.0f) {
                                        int i17 = tVar.e;
                                        int ceil = (((int) Math.ceil(tVar.S / tVar.e)) * i17) + ((int) ((tVar.W.G.z1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / tVar.e)))) * (i17 - 1)));
                                        if (ceil >= lVar.h()) {
                                            ceil = lVar.h() - 1;
                                        }
                                        tVar.S = ceil;
                                    }
                                    tVar.a();
                                    if (tVar.c == 0.0f) {
                                        tVar.R = !tVar.R;
                                    }
                                    tVar.b(tVar.R);
                                    tVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                iVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((tVar.N == motionEvent.getPointerId(0) && tVar.O == motionEvent.getPointerId(1)) || (tVar.N == motionEvent.getPointerId(1) && tVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && tVar.K) {
                            tVar.M = false;
                            tVar.L = false;
                            tVar.K = false;
                            tVar.a();
                        }
                        return tVar.K;
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
                        qt0VarArr[0].h.I0(false);
                        qt0VarArr[0].h.cancelLongPress();
                        qt0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - qt0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - qt0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y10 + qt0VarArr[0].h.X2;
                        if (getY() != 0.0f && this.E == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < qt0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = qt0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                qt0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.s == -1) {
                            this.s = (int) (((this.m1[p0(qt0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / qt0VarArr[0].h.getMeasuredWidth(), 0.0f))) + qt0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - qt0VarArr[0].getY() > 0.0f) {
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
                            this.n1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.w1.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.n1 = 0.0f;
                        }
                        float f10 = this.n1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            s4.h0 k12 = p0(this.p1) ? k1(this.p1) : this.H;
                            if (this.n1 == 1.0f) {
                                int i24 = this.q1;
                                int ceil2 = (((int) Math.ceil(this.s / this.q1)) * i24) + ((int) ((this.z1 / (qt0VarArr[0].h.getMeasuredWidth() - ((int) (qt0VarArr[0].h.getMeasuredWidth() / this.q1)))) * (i24 - 1)));
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
                        qt0VarArr[0].h.invalidate();
                        qt0 qt0Var = qt0VarArr[0];
                        if (qt0Var.G != null) {
                            qt0Var.invalidate();
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
        sr0 sr0Var;
        final TL_stories.StoryItem storyItem;
        ft0 ft0Var;
        bi.l8 l8Var;
        final int i11 = 0;
        if (!this.C1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (n2Var.getParentActivity() != null && messageObject != null && ((sr0Var = this.W) == null || !sr0Var.w)) {
                AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
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
                    org.telegram.ui.ActionBar.v0 v0Var = this.u0;
                    if (v0Var != null) {
                        v0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.t0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        v0Var2.setVisibility(i12);
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
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).i(true, true);
                    }
                    if (!this.C1) {
                        b1(true);
                    }
                    D0(sparseArrayArr[0]);
                    p1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                    t7Var.k(t7Var.n, t7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean w02 = w0(getClosestTab());
                    n70 I = n70.I(n2Var, view);
                    n70 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.lu0(I, 25), false);
                    J.k();
                    n70.f(J, getStoriesController().B(j3, true), hashSet, true, new org.telegram.ui.ActionBar.p(this, storyItem2, I, 29), new bi.r3(this, hashSet, storyItem2, I, 9));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new fi.m2(I, J, 9), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new bi.k8(this, messageObject, view, i10, 23), false);
                    final int i15 = 3;
                    if (w02) {
                        int h12 = h1(getClosestTab());
                        String w10 = getStoriesController().w(h12, j3);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new m8(this, h12, i12), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new bi.k8(this, h12, storyItem, w10, 24), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (ft0Var = this.c0) != null && (l8Var = ft0Var.s) != null) {
                            if (l8Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.tq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                xu0 xu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xu0Var.getContext(), 0, xu0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zq0(xu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(4));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                xu0 xu0Var2 = this;
                                                xu0Var2.getClass();
                                                xu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                xu0 xu0Var3 = this;
                                                xu0Var3.getClass();
                                                xu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                xu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.tq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                xu0 xu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xu0Var.getContext(), 0, xu0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zq0(xu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(4));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                xu0 xu0Var2 = this;
                                                xu0Var2.getClass();
                                                xu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                xu0 xu0Var3 = this;
                                                xu0Var3.getClass();
                                                xu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                xu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.tq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        xu0 xu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xu0Var.getContext(), 0, xu0Var.F1);
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zq0(xu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(4));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.show();
                                        b2Var.h();
                                        break;
                                    case 1:
                                        xu0 xu0Var2 = this;
                                        xu0Var2.getClass();
                                        xu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        xu0 xu0Var3 = this;
                                        xu0Var3.getClass();
                                        xu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        xu0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.tq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    xu0 xu0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xu0Var.getContext(), 0, xu0Var.F1);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zq0(xu0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(4));
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                    b2Var.show();
                                    b2Var.h();
                                    break;
                                case 1:
                                    xu0 xu0Var2 = this;
                                    xu0Var2.getClass();
                                    xu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    xu0 xu0Var3 = this;
                                    xu0Var3.getClass();
                                    xu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    xu0.h(this, storyItem);
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
        qt0[] qt0VarArr = this.k0;
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var == null || qt0VarArr[1] == null) {
            return;
        }
        float f7 = 0.0f;
        sr0 sr0Var = this.W;
        if (sr0Var != null) {
            char c10 = (!p0(qt0Var.F) || qt0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (qt0VarArr[1].getVisibility() == 0 ? (!p0(qt0VarArr[1].F) || qt0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                sr0Var.setTranslationX(c10 != 0 ? 0.0f : qt0VarArr[0].getMeasuredWidth());
            } else {
                sr0Var.setTranslationX(qt0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(sr0Var.getTranslationX()) / sr0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < qt0VarArr.length; i10++) {
                if (qt0VarArr[i10].getVisibility() == 0) {
                    wr0 wr0Var = qt0VarArr[i10].h;
                    View childAt = wr0Var.getChildCount() == 0 ? null : wr0Var.getChildAt(0);
                    f10 += Utilities.clamp01(1.0f - (qt0VarArr[i10].getTranslationX() / qt0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - wr0Var.getPaddingTop() : wr0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f10) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            sr0Var.setAlpha(clamp01);
            sr0Var.setScaleX(lerp);
            sr0Var.setScaleY(lerp);
            sr0Var.setTranslationY(this.K1 + f10);
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
        qt0[] qt0VarArr = this.k0;
        if (!z10) {
            if (Math.abs(qt0VarArr[1].getTranslationX()) < 1.0f) {
                qt0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.h1 ? -1 : 1));
                qt0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.f1;
                if (animatorSet != null) {
                }
                this.g1 = false;
            }
            M0(getTabProgress());
            return this.g1;
        }
        if (Math.abs(qt0VarArr[0].getTranslationX()) < 1.0f) {
            qt0VarArr[0].setTranslationX(0.0f);
            qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() * (this.h1 ? 1 : -1));
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
        qt0[] qt0VarArr = this.k0;
        if (f7 != 1.0f || qt0VarArr[1].getVisibility() == 0) {
            if (this.h1) {
                qt0VarArr[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() - (qt0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qt0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f7);
                qt0VarArr[1].setTranslationX((qt0VarArr[0].getMeasuredWidth() * f7) - qt0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f7);
            this.p0 = a02;
            this.r0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.v0 v0Var = this.n0;
            if (v0Var == null || D()) {
                this.o0 = b0(f7);
                t1();
            } else {
                v0Var.setVisibility(v0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            q1(false);
            if (f7 == 1.0f) {
                qt0 qt0Var = qt0VarArr[0];
                qt0VarArr[0] = qt0VarArr[1];
                qt0VarArr[1] = qt0Var;
                qt0Var.setVisibility(8);
                if (v0Var != null && this.x0 == 2) {
                    v0Var.setVisibility(v0() ? 8 : 4);
                }
                this.x0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        js jsVar = this.P0;
        if (jsVar != null) {
            sr0 sr0Var = this.W;
            float f7 = 0.0f;
            if (sr0Var != null) {
                f7 = 0.0f + (sr0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(sr0Var.getTranslationX() / sr0Var.getMeasuredWidth())));
            }
            jsVar.setTranslationY(this.K1 + f7);
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
        lr0 lr0Var = this.U;
        if (lr0Var != null) {
            lr0Var.h();
            lr0Var.j();
        }
        b1(false);
        r1(z10);
        hu0 hu0Var = this.R;
        if (hu0Var != null) {
            hu0Var.w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10 = v0() || q0();
        su0 su0Var = this.e0.w;
        if (su0Var != null) {
            su0Var.b(z10 && getClosestTab() == 9);
        }
        su0 su0Var2 = this.c0.w;
        if (su0Var2 != null) {
            su0Var2.b(z10 && getClosestTab() == 8);
        }
        for (wu0 wu0Var : this.Y1.values()) {
            vu0 vu0Var = wu0Var.c;
            if (vu0Var.s != null) {
                vu0Var.w.b(z10 && getClosestTab() == wu0Var.a);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.n0;
        if (v0Var != null) {
            ks0 ks0Var = this.J0;
            v0Var.setSearchFieldHint(LocaleController.getString((ks0Var != null && ks0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f7) {
        E0();
    }

    public boolean N() {
        return this instanceof y30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        qt0[] qt0VarArr = this.k0;
        motionEvent.offsetLocation(x10 - qt0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - qt0VarArr[0].getY()) - qt0VarArr[0].h.getFastScroll().getY());
        return qt0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        new org.telegram.ui.w71(n2Var, j3, this.m1[1], new tc(this, j3, i10)).show();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        e5.v0(n2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j3))), LocaleController.getString(R.string.Delete), true, new bi.h7(this, j3, i10, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.k0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            qt0 qt0Var = qt0VarArr[i10];
            if (qt0Var != null && qt0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < qt0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = qt0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + qt0VarArr[i10].h.X2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + qt0VarArr[i10].getX(), childAt.getY() + qt0VarArr[i10].h.getY() + qt0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof lv0)) {
                            arrayList.add((lv0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i10++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        String w10 = getStoriesController().w(i10, j3);
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = n2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j3, i10);
        Pattern pattern = e5.a;
        e5.R(context, n2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        mu0[] mu0VarArr = this.u1.n;
        if (mu0VarArr == null) {
            return false;
        }
        mu0[] mu0VarArr2 = this.t1;
        if (i10 == 0) {
            mu0 mu0Var = mu0VarArr2[i10];
            if (!mu0Var.h) {
                int[] iArr = mu0Var.f;
                int[] iArr2 = mu0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = mu0VarArr2[i10].f;
            int[] iArr4 = mu0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        mu0VarArr2[i10].a.addAll(mu0VarArr[i10].a);
        mu0VarArr2[i10].c.addAll(mu0VarArr[i10].c);
        for (Map.Entry entry : mu0VarArr[i10].d.entrySet()) {
            mu0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            mu0VarArr2[i10].b[i11] = mu0VarArr[i10].b[i11].clone();
            mu0 mu0Var2 = mu0VarArr2[i10];
            int[] iArr5 = mu0Var2.j;
            mu0 mu0Var3 = mu0VarArr[i10];
            iArr5[i11] = mu0Var3.j[i11];
            mu0Var2.i[i11] = mu0Var3.i[i11];
        }
        mu0VarArr2[i10].e.addAll(mu0VarArr[i10].e);
        return !mu0VarArr[i10].a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (shouldShowUrlInAlert) {
            e5.q0(n2Var, str, true, true);
        } else {
            of.f.s(n2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, ll0 ll0Var, boolean z10) {
        ArrayList arrayList = this.t1[i10].e;
        int L0 = ((s4.c0) ll0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            vt0 vt0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((vt0) arrayList.get(i11)).b) {
                        vt0Var = (vt0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (vt0Var == null) {
                    vt0Var = (vt0) i2.g.h(1, arrayList);
                }
            }
            if (vt0Var != null) {
                y0(i10, vt0Var.d, vt0Var.b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        qt0[] qt0VarArr;
        qt0 qt0Var;
        int i10;
        s4.h0 adapter;
        if (this.o1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                qt0VarArr = this.k0;
                if (i12 >= qt0VarArr.length) {
                    qt0Var = null;
                    break;
                }
                qt0Var = qt0VarArr[i12];
                if (qt0Var.F == this.p1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (qt0Var != null) {
                boolean p02 = p0(qt0Var.F);
                float f7 = this.n1;
                mu0[] mu0VarArr = this.t1;
                if (f7 != 1.0f) {
                    if (f7 == 0.0f) {
                        this.o1 = false;
                        if (this.p1 == 0) {
                            mu0VarArr[0].g(false);
                        }
                        qt0Var.r.setVisibility(8);
                        qt0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f7 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new ms0(this, qt0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.ej(this, z10, p02 ? 1 : 0, qt0Var));
                    ofFloat.setInterpolator(pr.f);
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
                } else if (c0(qt0Var.F) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.q1);
                }
                for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                    qt0 qt0Var2 = qt0VarArr[i14];
                    if (qt0Var2 != null && qt0Var2.h != null && (((i10 = qt0Var2.F) == 0 || p0(i10)) && (adapter = qt0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            mu0VarArr[0].g(false);
                        }
                        qt0VarArr[i14].r.setVisibility(8);
                        qt0VarArr[i14].x.y1(iArr[p02 ? 1 : 0]);
                        qt0VarArr[i14].h.a0();
                        qt0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qt0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    X0();
                    return;
                }
                while (i11 < qt0VarArr.length) {
                    qt0 qt0Var3 = qt0VarArr[i11];
                    if (qt0Var3.F == this.p1) {
                        View m10 = qt0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        qt0 qt0Var4 = qt0VarArr[i11];
                        qt0Var4.x.h1(this.s, (-qt0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        ft0 ft0Var = this.c0;
        if (ft0Var == null || ft0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (z10 && arrayList.size() > n2Var.getMessagesController().storiesPinnedToTopCountMax) {
            yc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        bi.l8 l8Var = ft0Var.s;
        int i10 = l8Var.c;
        ArrayList arrayList2 = l8Var.g;
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
                l8Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(l8Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new bi.c7(2));
            }
            z11 = z12;
        }
        if (z11) {
            yc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            yc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            yc.a0(n2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
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
        qt0 qt0Var;
        lr0 lr0Var;
        int closestTab = getClosestTab();
        ns0 ns0Var = this.I0;
        int i10 = -1;
        int i11 = ns0Var.O.get(ns0Var.n + (z10 ? 1 : -1), -1);
        sr0 sr0Var = this.W;
        if (sr0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                h81 h81Var = sr0Var.n;
                i10 = h81Var.b0.get(h81Var.F + (z10 ? 1 : -1), -1);
            } else if (w0(i11) || i11 == 8) {
                i10 = sr0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = i1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.v0 v0Var = this.n0;
            if (v0Var == null || D()) {
                this.o0 = b0(0.0f);
                s1(0.0f);
            } else {
                v0Var.setVisibility(v0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                qt0[] qt0VarArr = this.k0;
                qt0 qt0Var2 = qt0VarArr[0];
                if (qt0Var2 != null && qt0Var2.F == 13 && (lr0Var = this.U) != null) {
                    ci.a aVar = lr0Var.n;
                    if (!z10) {
                    }
                }
                qt0 qt0Var3 = qt0VarArr[0];
                nr0 nr0Var = this.V;
                if (qt0Var3 != null && qt0Var3.F == 14 && nr0Var != null) {
                    yh.v1 v1Var = nr0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (qt0Var = qt0VarArr[0]) == null || qt0Var.F != 13) && ((nr0Var == null || !nr0Var.g()) && (sr0Var == null || !sr0Var.w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.y1 = false;
                    this.x1 = true;
                    N0(true);
                    this.z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    ns0Var.setEnabled(false);
                    qt0 qt0Var4 = qt0VarArr[1];
                    qt0Var4.F = i11;
                    qt0Var4.setVisibility(0);
                    this.h1 = z10;
                    m1(true);
                    if (z10) {
                        qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth());
                    } else {
                        qt0VarArr[1].setTranslationX(-qt0VarArr[0].getMeasuredWidth());
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
        lr0 lr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (lr0Var = this.U) != null) {
            return lr0Var.getBotPreviewsSubtitle();
        }
        ft0 ft0Var = this.c0;
        if (ft0Var == null || ft0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < ft0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) ft0Var.s.i.get(i12);
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

    public final qt0 W(int i10) {
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.k0;
            if (i11 >= qt0VarArr.length) {
                return null;
            }
            qt0 qt0Var = qt0VarArr[i11];
            if (qt0Var != null && qt0Var.F == i10) {
                return qt0Var;
            }
            i11++;
        }
    }

    public final void W0(s4.h0 h0Var) {
        if (h0Var instanceof ru0) {
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
        eu0 eu0Var = this.N;
        if (h0Var == eu0Var) {
            eu0Var.r = null;
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
            qt0[] qt0VarArr = this.k0;
            if (i11 >= qt0VarArr.length) {
                return;
            }
            wr0 wr0Var = qt0VarArr[i11].h;
            if (wr0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < wr0Var.getChildCount(); i14++) {
                    View childAt = wr0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                        int messageId = t7Var.getMessageId();
                        i13 = t7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                        int id2 = j7Var.getMessage().getId();
                        i13 = j7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                        i12 = i7Var.getMessage().getId();
                        i13 = i7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = qt0VarArr[i11].F;
                    int i16 = -1;
                    if (p0(i15)) {
                        uu0 k12 = k1(i15);
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
                        mu0[] mu0VarArr = this.t1;
                        if (i15 < mu0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= mu0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) mu0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = mu0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((s4.c0) wr0Var.getLayoutManager()).h1(i10, (-qt0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.o1) {
                            qt0 qt0Var = qt0VarArr[i11];
                            qt0Var.s.h1(i10, (-qt0Var.h.getPaddingTop()) + i13);
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
        ns0 ns0Var;
        if (this.L1 || (ns0Var = this.I0) == null) {
            return;
        }
        ns0Var.h(null, i10, ns0Var.P.get(i10));
    }

    public final int Z(int i10) {
        int dp = AndroidUtilities.dp(54.0f) + this.b2;
        sr0 sr0Var = this.W;
        return dp + ((int) ((sr0Var == null || !(w0(i10) || i10 == 8)) ? 0.0f : sr0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f7, int i10) {
        ns0 ns0Var = this.I0;
        if (ns0Var != null) {
            ns0Var.j(f7, w0(i10) ? 8 : i10);
        }
        sr0 sr0Var = this.W;
        if (sr0Var != null) {
            h81 h81Var = sr0Var.n;
            if (w0(i10)) {
                h81Var.f(f7, h1(i10));
            } else if (i10 == 8) {
                h81Var.f(f7, 0);
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
        qt0[] qt0VarArr = this.k0;
        qt0 qt0Var = qt0VarArr[1];
        nr0 nr0Var = this.V;
        if (qt0Var != null && ((i12 = qt0Var.F) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = qt0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && nr0Var != null)))) {
            f10 = 0.0f + f7;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        return (qt0Var2 == null || !((i10 = qt0Var2.F) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = qt0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && nr0Var != null)))) ? f10 : (1.0f - f7) + f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.k0;
            if (i10 >= qt0VarArr.length) {
                if (this.F == 0) {
                    ht0 ht0Var = this.a0;
                    ht0Var.d = chatFull;
                    ht0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < qt0VarArr.length; i11++) {
                    qt0 qt0Var = qt0VarArr[i11];
                    if (qt0Var.F == 7 && qt0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(qt0VarArr[i11].h);
                    }
                }
                return;
            }
            qt0 qt0Var2 = qt0VarArr[i10];
            if (qt0Var2.F == 7 && qt0Var2.h.getAdapter() != null && qt0VarArr[i10].h.getAdapter().h() != 0 && this.v1.getMessagesController().getStoriesController().j.size() > 0) {
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
        qt0[] qt0VarArr = this.k0;
        qt0 qt0Var = qt0VarArr[1];
        if (qt0Var != null && s0(qt0Var.F) && qt0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        return (qt0Var2 == null || !s0(qt0Var2.F) || qt0VarArr[0].F == 11) ? f10 : (1.0f - f7) + f10;
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
        ha haVar = this.B0;
        if (z10) {
            haVar.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.N1.setDuration(180L);
        this.N1.addListener(new org.telegram.ui.to(20, this, z10));
        this.N1.start();
        if (z10) {
            u1();
        }
    }

    public final int c0(int i10) {
        uu0 k12;
        bi.l8 l8Var;
        if (!p0(i10) || (k12 = k1(i10)) == null || (l8Var = k12.s) == null) {
            return 0;
        }
        return l8Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(int i10, boolean z10) {
        int i11;
        qt0 W;
        if (z10 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z10 && p0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.j1);
        bundle.putLong("topic_id", this.F);
        mu0[] mu0VarArr = this.t1;
        if (z10 && (W = W(0)) != null) {
            ArrayList arrayList = mu0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                vt0 vt0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((vt0) arrayList.get(i12)).b) {
                            vt0Var = (vt0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (vt0Var == null) {
                        vt0Var = (vt0) i2.g.h(1, arrayList);
                    }
                }
                if (vt0Var != null) {
                    i11 = vt0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.h8 h8Var = new org.telegram.ui.h8(mu0VarArr[0].q, i11, bundle);
                    h8Var.M = new l.d(this, 16);
                    this.v1.presentFragment(h8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.h8 h8Var2 = new org.telegram.ui.h8(mu0VarArr[0].q, i11, bundle);
        h8Var2.M = new l.d(this, 16);
        this.v1.presentFragment(h8Var2);
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        sr0 sr0Var = this.W;
        if (h12 != i10) {
            if (sr0Var != null) {
                sr0Var.n.d(i10, sr0Var.s.i(i10));
                return;
            }
            return;
        }
        sr0Var.setReorderingAlbums(true);
        wu0 i12 = i1(i10);
        qt0 W = W(i12.a);
        if (W == null) {
            return;
        }
        wr0 wr0Var = W.h;
        for (int i11 = 0; i11 < wr0Var.getChildCount(); i11++) {
            View childAt = wr0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t7) {
                ((org.telegram.ui.Cells.t7) childAt).l(true, true);
            }
        }
        vu0 vu0Var = i12.c;
        if (vu0Var != null && !vu0Var.x) {
            vu0Var.x = true;
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
        wr0 wr0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        s4.h0 h0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        wr0 wr0Var2;
        int i16;
        int i17;
        wr0 wr0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        s4.h0 h0Var2 = this.O;
        s4.h0 h0Var3 = this.M;
        lu0 lu0Var = this.J;
        s4.h0 h0Var4 = this.L;
        s4.h0 h0Var5 = this.K;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        eu0 eu0Var = this.N;
        ct0 ct0Var = this.H;
        long j3 = this.j1;
        qt0[] qt0VarArr = this.k0;
        mu0[] mu0VarArr = this.t1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != n2Var.getClassGuid() || intValue2 != mu0VarArr[intValue3].p) {
                if (this.u1 == null || !mu0VarArr[intValue3].a.isEmpty() || mu0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    h0Var2 = ct0Var;
                } else if (intValue3 == 1) {
                    h0Var2 = h0Var5;
                } else if (intValue3 == 2) {
                    h0Var2 = h0Var4;
                } else if (intValue3 == 3) {
                    h0Var2 = lu0Var;
                } else if (intValue3 == 4) {
                    h0Var2 = h0Var3;
                } else if (intValue3 != 5) {
                    h0Var2 = intValue3 == 15 ? eu0Var : null;
                }
                if (h0Var2 != null) {
                    for (int i19 = 0; i19 < qt0VarArr.length; i19++) {
                        qt0 qt0Var = qt0VarArr[i19];
                        if (qt0Var != null && (wr0Var2 = qt0Var.h) != null && wr0Var2.getAdapter() == h0Var2) {
                            qt0VarArr[i19].h.B0();
                        }
                    }
                    h0Var2.l();
                }
                this.b1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
            int i20 = longValue == j3 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                mu0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                h0Var2 = ct0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                h0Var2 = h0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                h0Var2 = h0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                h0Var2 = lu0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                h0Var2 = h0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                h0Var2 = eu0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                h0Var2 = null;
            }
            int size2 = mu0VarArr[i16].a.size();
            if (h0Var2 != null) {
                i17 = h0Var2.h();
                if (h0Var2 instanceof hl0) {
                    ((hl0) h0Var2).L();
                }
            } else {
                i17 = 0;
            }
            mu0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (mu0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        mu0 mu0Var = mu0VarArr[i16];
                        int i21 = mu0Var.m - r13;
                        mu0Var.m = i21;
                        if (i21 < 0) {
                            mu0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                mu0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                mu0 mu0Var2 = mu0VarArr[i16];
                if (mu0Var2.l) {
                    mu0Var2.m = 0;
                }
            } else {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (mu0VarArr[i16].a(messageObject3, i20, false, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        mu0 mu0Var3 = mu0VarArr[i16];
                        int i23 = mu0Var3.n - 1;
                        mu0Var3.n = i23;
                        if (i23 < 0) {
                            mu0Var3.n = 0;
                        }
                    }
                }
                mu0 mu0Var4 = mu0VarArr[i16];
                if (mu0Var4.o && mu0Var4.a.size() > 0) {
                    mu0 mu0Var5 = mu0VarArr[i16];
                    mu0Var5.k = ((MessageObject) mu0Var5.a.get(0)).getId();
                }
                mu0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                mu0 mu0Var6 = mu0VarArr[i16];
                if (mu0Var6.i[i20]) {
                    int size4 = mu0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += mu0VarArr[i16].m;
                    }
                    mu0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                mu0 mu0Var7 = mu0VarArr[i16];
                if (mu0Var7.i[i20] && this.c1 != 0) {
                    mu0Var7.g = true;
                    n2Var.getMediaDataController().loadMedia(this.c1, 50, mu0VarArr[i16].j[1], 0, i16, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (h0Var2 != null) {
                pt0 pt0Var = null;
                for (int i25 = 0; i25 < qt0VarArr.length; i25++) {
                    qt0 qt0Var2 = qt0VarArr[i25];
                    if (qt0Var2 != null && (wr0Var3 = qt0Var2.h) != null && wr0Var3.getAdapter() == h0Var2) {
                        pt0 pt0Var2 = qt0VarArr[i25].h;
                        pt0Var2.B0();
                        pt0Var = pt0Var2;
                    }
                }
                int h = h0Var2.h();
                if (h0Var2 != ct0Var) {
                    try {
                        h0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (ct0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(pt0Var);
                } else {
                    ct0Var.l();
                }
                if (!mu0VarArr[i24].a.isEmpty() || mu0VarArr[i24].g) {
                    if (pt0Var != null && (h0Var2 == ct0Var || h >= i17)) {
                        z(pt0Var, i17, sparseBooleanArray);
                    }
                } else if (pt0Var != null) {
                    z(pt0Var, i17, sparseBooleanArray);
                }
                if (pt0Var != null && !mu0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (qt0VarArr[i26].F == 0) {
                                ((s4.c0) pt0Var.getLayoutManager()).h1(ct0Var.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            mu0 mu0Var8 = mu0VarArr[i24];
            if (mu0Var8.o) {
                if (mu0Var8.a.size() == 0) {
                    A0(i24);
                } else {
                    mu0VarArr[i24].o = false;
                }
            }
            this.b1 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j3) ? n2Var.getMessagesController().getChat(Long.valueOf(-j3)) : null;
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
                        ct0 ct0Var2 = ct0Var;
                        int i28 = 0;
                        while (i28 < mu0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (mu0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        ct0Var = ct0Var2;
                    }
                    ct0 ct0Var3 = ct0Var;
                    if (z12) {
                        this.b1 = true;
                        if (ct0Var3 != null) {
                            ct0Var3.l();
                        }
                        if (h0Var5 != null) {
                            h0Var5.l();
                        }
                        if (h0Var4 != null) {
                            h0Var4.l();
                        }
                        if (lu0Var != null) {
                            lu0Var.X(false);
                        }
                        if (h0Var3 != null) {
                            h0Var3.l();
                        }
                        if (eu0Var != null) {
                            eu0Var.l();
                        }
                        if (h0Var2 != null) {
                            h0Var2.l();
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
            ct0 ct0Var32 = ct0Var;
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
                        mu0 mu0Var9 = mu0VarArr[mediaType];
                        if (mu0Var9.l) {
                            z11 = z13;
                            if (mu0Var9.a(messageObject4, messageObject4.getDialogId() == j3 ? 0 : 1, true, isEncryptedDialog2)) {
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
                    while (i31 < qt0VarArr.length) {
                        int i32 = qt0VarArr[i31].F;
                        if (i32 == 0) {
                            h0Var = ct0Var;
                        } else if (i32 == i30) {
                            h0Var = h0Var5;
                        } else if (i32 == 2) {
                            h0Var = h0Var4;
                        } else if (i32 == 3) {
                            h0Var = lu0Var;
                        } else {
                            if (i32 == 4) {
                                h0Var = h0Var3;
                            } else if (i32 == 5) {
                                h0Var = h0Var2;
                            } else {
                                h0Var = i32 == 15 ? eu0Var : null;
                                if (h0Var != null) {
                                    h0Var.h();
                                    ct0Var.l();
                                    h0Var5.l();
                                    h0Var4.l();
                                    lu0Var.X(false);
                                    h0Var3.l();
                                    eu0Var.l();
                                    h0Var2.l();
                                }
                                i31++;
                                i30 = 1;
                            }
                            if (h0Var != null) {
                            }
                            i31++;
                            i30 = 1;
                        }
                        if (h0Var != null) {
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
                for (mu0 mu0Var10 : mu0VarArr) {
                    mu0Var10.f(i33, num.intValue(), num2.intValue());
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
                for (int i34 = 0; i34 < qt0VarArr.length; i34++) {
                    int childCount = qt0VarArr[i34].h.getChildCount();
                    for (int i35 = 0; i35 < childCount; i35++) {
                        View childAt = qt0VarArr[i34].h.getChildAt(i35);
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                            if (i7Var.getMessage() != null) {
                                i7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i36 = 0; i36 < qt0VarArr.length; i36++) {
                qt0 qt0Var3 = qt0VarArr[i36];
                if (qt0Var3 != null && (wr0Var = qt0Var3.h) != null) {
                    int childCount2 = wr0Var.getChildCount();
                    for (int i37 = 0; i37 < childCount2; i37++) {
                        View childAt2 = qt0VarArr[i36].h.getChildAt(i37);
                        if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) childAt2;
                            if (i7Var2.getMessage() != null) {
                                i7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            bi.l8 l8Var = (bi.l8) objArr[0];
            ft0 ft0Var = this.c0;
            if (ft0Var == null || l8Var != ft0Var.s) {
                kr0 kr0Var = this.e0;
                if (kr0Var == null || l8Var != kr0Var.s) {
                    Iterator it = this.Y1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        wu0 wu0Var = (wu0) it.next();
                        if (wu0Var.c.s == l8Var) {
                            i12 = wu0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            qt0 W = W(i12);
            if (W != null) {
                if (W.b != (l8Var.g() > 0)) {
                    W.b = l8Var.g() > 0;
                    o1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof s4.c0) {
                    ll0 ll0Var = W.h;
                    G(W, ll0Var, (s4.c0) ll0Var.getLayoutManager());
                }
            }
            jt0 jt0Var = this.D1;
            if (jt0Var != null) {
                jt0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (qt0 qt0Var4 : qt0VarArr) {
                if (qt0Var4 != null && qt0Var4.h != null && p0(qt0Var4.F)) {
                    if (!r0() || qt0Var4.h.getAdapter() == null) {
                        for (int i38 = 0; i38 < qt0Var4.h.getChildCount(); i38++) {
                            View childAt3 = qt0Var4.h.getChildAt(i38);
                            if (childAt3 instanceof org.telegram.ui.Cells.t7) {
                                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt3;
                                p6 p6Var = t7Var.N;
                                if (!t7Var.d0 || (messageObject = t7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    t7Var.L = false;
                                    p6Var.q("", false, true);
                                } else {
                                    int i39 = storyViews.views_count;
                                    t7Var.L = i39 > 0;
                                    p6Var.q(AndroidUtilities.formatWholeNumber(i39, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(qt0Var4.h);
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
        hu0 hu0Var = this.R;
        if (i10 == i40) {
            if (j3 == 0 || j3 == n2Var.getUserConfig().getClientUserId()) {
                hu0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            hu0Var.F(true);
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
            ht0 ht0Var = this.a0;
            if (ht0Var != null) {
                TLRPC.ChatFull chatFull = ht0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i41 = 0; i41 < ht0Var.d.participants.participants.size(); i41++) {
                        ht0Var.d.participants.participants.get(i41).setRank(longValue4, str);
                    }
                }
                for (qt0 qt0Var5 : qt0VarArr) {
                    if (qt0Var5.F == 7) {
                        AndroidUtilities.updateVisibleRows(qt0Var5.h);
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
            for (int i42 = 0; i42 < qt0VarArr.length; i42++) {
                if (qt0VarArr[i42].h.getAdapter() == eu0Var) {
                    wr0 wr0Var4 = qt0VarArr[i42].h;
                    ArrayList arrayList6 = eu0Var.n;
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
                                eu0Var.m(i43);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ns0 ns0Var = this.I0;
        if (ns0Var != null) {
            canvas.save();
            canvas.translate(ns0Var.getX(), ns0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        js0 js0Var = this.R0;
        if (js0Var != null) {
            int i10 = js0Var.T;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(js0Var.getX(), js0Var.getY());
                js0Var.setDrawOverlay(true);
                js0Var.draw(canvas);
                js0Var.setDrawOverlay(false);
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
        qt0[] qt0VarArr = this.k0;
        float top = qt0VarArr[0].getTop();
        sr0 sr0Var = this.W;
        if (sr0Var != null && ((i10 = qt0VarArr[0].F) == 8 || w0(i10))) {
            top -= sr0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (n2Var != null && n2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            bi.pb orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
            Context context = n2Var.getContext();
            long dialogId = r2Var.getDialogId();
            bi.d9 a2 = bi.d9.a((ll0) r2Var.getParent());
            a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
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
        qt0[] qt0VarArr;
        qt0 qt0Var;
        if (this.o1) {
            return;
        }
        int i10 = 0;
        while (true) {
            qt0VarArr = this.k0;
            if (i10 >= qt0VarArr.length) {
                qt0Var = null;
                break;
            }
            int i11 = qt0VarArr[i10].F;
            if (i11 == 0 || p0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (qt0Var != null) {
            int i12 = qt0Var.F;
            this.p1 = i12;
            boolean p02 = p0(i12);
            int[] iArr = this.m1;
            int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], z10);
            this.q1 = X;
            if (X != iArr[p02 ? 1 : 0]) {
                if (this.k1 && p0(this.p1)) {
                    return;
                }
                qt0Var.r.setVisibility(0);
                if (p0(this.p1)) {
                    qt0Var.r.setAdapter(l1(this.p1));
                } else {
                    qt0Var.r.setAdapter(this.I);
                }
                pt0 pt0Var = qt0Var.r;
                pt0Var.setPadding(pt0Var.getPaddingLeft(), Z(this.p1), qt0Var.r.getPaddingRight(), Y(v0()));
                qt0Var.s.y1(X);
                qt0Var.r.a0();
                qt0Var.s.O = new ls0(this, qt0Var, 0);
                AndroidUtilities.updateVisibleRows(qt0Var.h);
                this.o1 = true;
                if (this.p1 == 0) {
                    this.t1[0].g(true);
                }
                this.n1 = 0.0f;
                if (this.s < 0) {
                    X0();
                    return;
                }
                for (qt0 qt0Var2 : qt0VarArr) {
                    if (qt0Var2.F == this.p1) {
                        qt0Var2.s.h1(this.s, this.v - qt0Var2.r.getPaddingTop());
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
            qt0[] qt0VarArr = this.k0;
            if (i11 >= qt0VarArr.length) {
                break;
            }
            qt0 qt0Var = qt0VarArr[i11];
            if (qt0Var != null) {
                int i13 = qt0Var.F;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = qt0VarArr[i11].getTranslationX();
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
            qt0[] qt0VarArr = this.k0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            int childCount = qt0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = qt0VarArr[i10].h.getChildAt(i11);
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
            qt0[] qt0VarArr = this.k0;
            if (i11 >= qt0VarArr.length) {
                return f7;
            }
            qt0 qt0Var = qt0VarArr[i11];
            if (qt0Var != null) {
                int i12 = qt0Var.F;
                if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                    f7 = (1.0f - Math.abs(qt0VarArr[i11].getTranslationX() / getWidth())) + f7;
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
            qt0[] qt0VarArr = this.k0;
            float x10 = qt0VarArr[0].getX();
            this.f1 = new AnimatorSet();
            this.i1 = Math.abs(x10) < ((float) qt0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h70(this, 19));
            boolean z10 = this.i1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], (Property<qt0, Float>) property, 0.0f), ObjectAnimator.ofFloat(qt0VarArr[1], (Property<qt0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], (Property<qt0, Float>) property, 0.0f), ObjectAnimator.ofFloat(qt0VarArr[1], (Property<qt0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = qt0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], (Property<qt0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(qt0VarArr[1], (Property<qt0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], (Property<qt0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(qt0VarArr[1], (Property<qt0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.f1.setInterpolator(e2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.f1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.f1.addListener(new qs0(this, i10));
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
        qt0 qt0Var;
        qt0 qt0Var2;
        bi.l8 l8Var;
        bi.l8 l8Var2;
        float f7 = 1.0f;
        qt0[] qt0VarArr = this.k0;
        if (qt0VarArr == null || (qt0Var = qt0VarArr[0]) == null || (qt0Var2 = qt0VarArr[1]) == null || qt0Var.w == null || qt0Var2.w == null) {
            return 1.0f;
        }
        int i10 = qt0Var.F;
        int i11 = qt0Var2.F;
        boolean z10 = w0(i10) || i10 == 8;
        boolean z11 = w0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - qt0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - qt0VarArr[1].w.getVisibilityFactor();
        uu0 k12 = k1(qt0VarArr[0].F);
        if (i10 == 8 || (k12 != null && (l8Var2 = k12.s) != null && l8Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        uu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (l8Var = k13.s) == null || l8Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(qt0VarArr[0].getTranslationX() / qt0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        qt0[] qt0VarArr = this.k0;
        qt0 qt0Var = qt0VarArr[1];
        if (qt0Var != null && qt0Var.getVisibility() == 0) {
            if (this.g1 && !this.i1) {
                return qt0VarArr[1].F;
            }
            if (Math.abs(qt0VarArr[1].getTranslationX()) < qt0VarArr[1].getMeasuredWidth() / 2.0f) {
                return qt0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public ll0 getCurrentListView() {
        dt0 dt0Var;
        qt0 qt0Var = this.k0[0];
        int i10 = qt0Var.F;
        return i10 == 13 ? this.U.getCurrentListView() : i10 == 14 ? this.V.getCurrentListView() : (i10 != 12 || (dt0Var = this.T) == null) ? qt0Var.h : dt0Var.a.x0;
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

    public org.telegram.ui.ActionBar.v0 getSearchItem() {
        return this.n0;
    }

    public aj0 getSearchOptionsItem() {
        return this.s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        sr0 sr0Var = this.W;
        if (sr0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = sr0Var.getCurrentAlbumId();
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
            qt0[] qt0VarArr = this.k0;
            if (i10 >= qt0VarArr.length) {
                return f7;
            }
            qt0 qt0Var = qt0VarArr[i10];
            if (qt0Var != null) {
                f7 = ((1.0f - Math.abs(qt0Var.getTranslationX() / getWidth())) * qt0Var.F) + f7;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.z6));
        org.telegram.ui.ActionBar.v0 v0Var = this.l0;
        aj0 iconView = v0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.j6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.u0;
        if (v0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.t0;
        if (v0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 1, null, null, null, null, i12));
        ns0 ns0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.wc;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hh));
        js0 js0Var = this.R0;
        if (js0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A7));
        }
        final int i14 = 0;
        while (true) {
            qt0[] qt0VarArr = this.k0;
            if (i14 >= qt0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6() { // from class: org.telegram.ui.Components.gr0
                @Override // org.telegram.ui.ActionBar.k6
                public final void b() {
                    qt0[] qt0VarArr2 = xu0.this.k0;
                    int i15 = i14;
                    wr0 wr0Var = qt0VarArr2[i15].h;
                    if (wr0Var != null) {
                        int childCount = wr0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = qt0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.u7) {
                                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    u7Var.a[i17].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                ((org.telegram.ui.Cells.h6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.za) {
                                ((org.telegram.ui.Cells.za) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.k6
                public final /* synthetic */ void a(float f7) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
            fs0 fs0Var = qt0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.j6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(fs0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].w, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
            int i16 = org.telegram.ui.ActionBar.j6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.j6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, k6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, k6Var, org.telegram.ui.ActionBar.j6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.r0;
            int i19 = org.telegram.ui.ActionBar.j6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.U7));
            int i20 = org.telegram.ui.ActionBar.j6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{kt0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
            int i21 = org.telegram.ui.ActionBar.j6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.j6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.j6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.j6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, k6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, k6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, null, null, new Drawable[]{this.y0}, null, org.telegram.ui.ActionBar.j6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].w.e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.F1;
        return f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        wu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.b;
    }

    public final boolean i0() {
        return this.v1.getConnectionsManager().getConnectionState() == 3;
    }

    public final wu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        wu0 wu0Var = (wu0) hashMap.get(valueOf);
        if (wu0Var != null) {
            return wu0Var;
        }
        wu0 wu0Var2 = new wu0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), wu0Var2);
        this.Z1.put(Integer.valueOf(wu0Var2.a), Integer.valueOf(i10));
        return wu0Var2;
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

    public final wu0 j1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (wu0) this.Y1.get(num);
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
        this.L0.setInterpolator(pr.g);
        this.L0.addListener(new qs0(this, 0));
        this.L0.start();
    }

    public final uu0 k1(int i10) {
        wu0 j12;
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

    public final uu0 l1(int i10) {
        wu0 j12;
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
        return !(this instanceof y30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [org.telegram.ui.Components.ll0, org.telegram.ui.Components.pt0, s4.m0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    public final void m1(boolean z10) {
        qt0[] qt0VarArr;
        qt0[] qt0VarArr2;
        s4.u0 u0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        mu0[] mu0VarArr;
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
        nr0 nr0Var = this.V;
        if (nr0Var != null) {
            nr0Var.i();
        }
        int i14 = 0;
        while (true) {
            qt0VarArr = this.k0;
            if (i14 >= qt0VarArr.length) {
                break;
            }
            qt0VarArr[i14].h.B0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qt0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        s4.h0 adapter = qt0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.c0;
        s4.y yVar = this.b0;
        if (adapter == h0Var) {
            yVar.d(null);
        }
        boolean z19 = this.V0;
        jt0 jt0Var = this.D1;
        eu0 eu0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = this.n0;
        int i15 = 100;
        if (z19 && this.U0) {
            qt0 qt0Var = qt0VarArr[z10 ? 1 : 0];
            if (qt0Var.f == null) {
                qt0Var.f = new s4.u0();
            }
            qt0 qt0Var2 = qt0VarArr[z10 ? 1 : 0];
            u0Var2 = qt0Var2.f;
            iu0 iu0Var = this.S;
            ot0 ot0Var = this.j0;
            tt0 tt0Var = this.h0;
            tt0 tt0Var2 = this.i0;
            tt0 tt0Var3 = this.g0;
            if (z10) {
                int i16 = qt0Var2.F;
                if (i16 == 0 || i16 == 2 || i16 == 5 || i16 == 6 || (i16 == 7 && !jt0Var.T())) {
                    this.V0 = false;
                    ks0 ks0Var = this.J0;
                    if (ks0Var != null) {
                        ks0Var.g(false);
                    }
                    this.U0 = false;
                    m1(true);
                    return;
                }
                String obj = v0Var != null ? v0Var.getSearchField().getText().toString() : "";
                int i17 = qt0VarArr[z10 ? 1 : 0].F;
                if (i17 == 1) {
                    if (tt0Var3 != null) {
                        tt0Var3.G(obj, false);
                        if (adapter != tt0Var3) {
                            W0(adapter);
                            qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var3);
                        }
                    }
                } else if (i17 == 3) {
                    if (tt0Var2 != null) {
                        tt0Var2.G(obj, false);
                        if (adapter != tt0Var2) {
                            W0(adapter);
                            qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var2);
                        }
                    }
                } else if (i17 == 4) {
                    if (tt0Var != null) {
                        tt0Var.G(obj, false);
                        if (adapter != tt0Var) {
                            W0(adapter);
                            qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var);
                        }
                    }
                } else if (i17 == 7) {
                    if (ot0Var != null) {
                        ot0Var.F(obj, false);
                        if (adapter != ot0Var) {
                            W0(adapter);
                            qt0VarArr[z10 ? 1 : 0].h.setAdapter(ot0Var);
                        }
                    }
                } else if (i17 == 11) {
                    if (iu0Var != null) {
                        iu0Var.E(this.W0, obj);
                        if (adapter != iu0Var) {
                            W0(adapter);
                            qt0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var);
                        }
                    }
                } else if (i17 == 15 && eu0Var != null && adapter != eu0Var) {
                    W0(adapter);
                    wr0 wr0Var = qt0VarArr[z10 ? 1 : 0].h;
                    eu0Var.r = wr0Var;
                    wr0Var.setAdapter(eu0Var);
                }
            } else if (qt0Var2.h != null) {
                int i18 = qt0Var2.F;
                if (i18 == 1) {
                    if (adapter != tt0Var3) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var3);
                    }
                    tt0Var3.l();
                } else if (i18 == 3) {
                    if (adapter != tt0Var2) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var2);
                    }
                    tt0Var2.l();
                } else if (i18 == 4) {
                    if (adapter != tt0Var) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var);
                    }
                    tt0Var.l();
                } else if (i18 == 7) {
                    if (adapter != ot0Var) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(ot0Var);
                    }
                    ot0Var.l();
                } else if (i18 == 11) {
                    if (adapter != iu0Var) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var);
                    }
                    iu0Var.l();
                }
            }
            qt0VarArr2 = qt0VarArr;
            z17 = false;
            z16 = false;
            i11 = 100;
        } else {
            qt0 qt0Var3 = qt0VarArr[z10 ? 1 : 0];
            if (qt0Var3.e == null) {
                qt0Var3.e = new s4.u0();
            }
            qt0 qt0Var4 = qt0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var3 = qt0Var4.e;
            qt0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = qt0VarArr[z10 ? 1 : 0].F;
            if (i19 == 8 || w0(i19)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            wr0 wr0Var2 = qt0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = wr0Var2.getPaddingLeft();
            qt0 qt0Var5 = qt0VarArr[z10 ? 1 : 0];
            wr0 wr0Var3 = qt0Var5.h;
            int Z = Z(qt0Var5.F);
            wr0Var3.d3 = Z;
            int paddingRight = qt0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            qt0VarArr2 = qt0VarArr;
            wr0 wr0Var4 = qt0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            wr0Var4.e3 = Y;
            wr0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i20 = qt0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.m1;
            s4.h0 h0Var2 = this.K;
            View view = this.U;
            dt0 dt0Var = this.T;
            hu0 hu0Var = this.R;
            it0 it0Var = this.P;
            mu0[] mu0VarArr2 = this.t1;
            if (i20 == 0) {
                s4.h0 h0Var3 = this.H;
                if (adapter != h0Var3) {
                    W0(adapter);
                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i21 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                mu0 mu0Var = mu0VarArr2[0];
                boolean z20 = mu0Var.h && !mu0Var.e.isEmpty();
                i15 = iArr[0];
                qt0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.y0);
                mu0 mu0Var2 = mu0VarArr2[0];
                if (mu0Var2.x == null) {
                    mu0Var2.x = new s4.u0();
                }
                z13 = z20;
                u0Var = mu0VarArr2[0].x;
                z11 = false;
            } else {
                if (i20 == 1) {
                    mu0 mu0Var3 = mu0VarArr2[1];
                    z12 = mu0Var3.h && !mu0Var3.e.isEmpty();
                    if (adapter != h0Var2) {
                        W0(adapter);
                        qt0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i20 == 2) {
                    mu0 mu0Var4 = mu0VarArr2[2];
                    z12 = mu0Var4.h && !mu0Var4.e.isEmpty();
                    if (adapter != this.L) {
                        W0(adapter);
                        qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                    }
                } else {
                    if (i20 == 3) {
                        if (adapter != this.J) {
                            W0(adapter);
                            qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i20 == 4) {
                        mu0 mu0Var5 = mu0VarArr2[4];
                        z12 = mu0Var5.h && !mu0Var5.e.isEmpty();
                        if (adapter != this.M) {
                            W0(adapter);
                            qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i20 == 5) {
                            if (adapter != this.O) {
                                W0(adapter);
                                qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i20 == 15) {
                            if (adapter != eu0Var) {
                                W0(adapter);
                                wr0 wr0Var5 = qt0VarArr2[z10 ? 1 : 0].h;
                                eu0Var.r = wr0Var5;
                                wr0Var5.setAdapter(eu0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != it0Var) {
                                W0(adapter);
                                qt0VarArr2[z10 ? 1 : 0].h.setAdapter(it0Var);
                            }
                        } else if (i20 == 7) {
                            if (adapter != this.a0) {
                                W0(adapter);
                                qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.a0);
                            }
                        } else if (p0(i20)) {
                            s4.h0 k12 = k1(qt0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != k12) {
                                W0(adapter);
                                qt0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                qt0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            qt0 qt0Var6 = qt0VarArr2[z10 ? 1 : 0];
                            if (qt0Var6.F != 9) {
                                yVar.d(qt0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = qt0VarArr2[z10 ? 1 : 0].F;
                            if (i22 == 10) {
                                if (adapter != this.Q) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i22 == 11) {
                                if (adapter != hu0Var) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(hu0Var);
                                    s4.y yVar2 = hu0Var.v;
                                    wr0 wr0Var6 = qt0VarArr2[z10 ? 1 : 0].h;
                                    hu0Var.s = wr0Var6;
                                    yVar2.d(wr0Var6);
                                }
                                u0Var = hu0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (dt0Var.getParent() != qt0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(dt0Var);
                                    qt0VarArr2[z10 ? 1 : 0].addView(dt0Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != qt0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    qt0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (nr0Var != null && nr0Var.getParent() != qt0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(nr0Var);
                                    qt0VarArr2[z10 ? 1 : 0].addView(nr0Var);
                                    qt0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
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
            int i23 = qt0VarArr2[z10 ? 1 : 0].F;
            boolean z21 = i23 == 0 || p0(i23);
            s4.u0 u0Var4 = u0Var;
            qt0VarArr2[z10 ? 1 : 0].v.setLayoutParams(w7.x5.d(-1, -1.0f, 119, z21 ? 0.0f : 12.0f, (z21 ? 8 : 12) + 48, z21 ? 0.0f : 12.0f, z21 ? 0.0f : 12.0f));
            if (z11) {
                qt0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                wr0 wr0Var7 = qt0VarArr2[z10 ? 1 : 0].h;
                wr0Var7.getClass();
                wr0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, wr0Var7.p2));
                wr0Var7.I2 = null;
                wr0Var7.L2 = 0.0f;
                wr0Var7.M2 = null;
                wr0Var7.N2 = null;
                wr0Var7.J2 = null;
                xk0 xk0Var = wr0Var7.H2;
                if (xk0Var != null) {
                    wr0Var7.p0(xk0Var);
                    wr0Var7.H2 = null;
                }
            }
            qt0 qt0Var7 = qt0VarArr2[z10 ? 1 : 0];
            int i24 = qt0Var7.F;
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (i24 == 15) {
                z14 = z13;
                mu0VarArr = mu0VarArr2;
                str = "";
                qt0Var7.setBackground(di.d7.e(qt0Var7.getBackground(), n2Var.getCurrentAccount(), this.j1, org.telegram.ui.ActionBar.j6.I.q()));
                qt0VarArr2[z10 ? 1 : 0].setOutlineProvider(new bi.z1(14));
                qt0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                mu0VarArr = mu0VarArr2;
                str = "";
                qt0Var7.setClipToOutline(false);
                r52 = 0;
                qt0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            qt0 qt0Var8 = qt0VarArr2[z10 ? 1 : 0];
            if (qt0Var8.F == 11) {
                qt0Var8.h.setItemAnimator(qt0Var8.d);
            } else {
                qt0Var8.h.setItemAnimator(r52);
                if (hu0Var != null && qt0VarArr2[z10 ? 1 : 0].h == hu0Var.s) {
                    s4.y yVar3 = hu0Var.v;
                    hu0Var.s = r52;
                    yVar3.d(r52);
                }
            }
            if (dt0Var != null && qt0VarArr2[z10 ? 1 : 0].F != 12 && dt0Var.getParent() == qt0VarArr2[z10 ? 1 : 0]) {
                dt0Var.a.onRemoveFromParent();
                qt0VarArr2[z10 ? 1 : 0].removeView(dt0Var);
            }
            if (view != null && qt0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                qt0 qt0Var9 = qt0VarArr2[z10 ? 1 : 0];
                if (parent == qt0Var9) {
                    qt0Var9.removeView(view);
                }
            }
            if (nr0Var != null && qt0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = nr0Var.getParent();
                qt0 qt0Var10 = qt0VarArr2[z10 ? 1 : 0];
                if (parent2 == qt0Var10) {
                    qt0Var10.removeView(nr0Var);
                }
            }
            int i25 = qt0VarArr2[z10 ? 1 : 0].F;
            if (i25 != 0 && i25 != 11 && !p0(i25) && (i12 = qt0VarArr2[z10 ? 1 : 0].F) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || jt0Var.T()) && (i13 = qt0VarArr2[z10 ? 1 : 0].F) != 10 && i13 != 13 && i13 != 14)) {
                if (!z10) {
                    z18 = false;
                    if (v0Var != null) {
                        if (v0Var.getVisibility() == 4) {
                            if (D()) {
                                this.x0 = 0;
                                this.o0 = 1.0f;
                                v0Var.setVisibility(0);
                            } else {
                                v0Var.setVisibility(v0() ? 8 : 4);
                                this.o0 = 0.0f;
                            }
                        }
                        q1(z18);
                    }
                } else if (v0Var == null || v0Var.getVisibility() != 4 || this.G.n0) {
                    z18 = false;
                    this.x0 = 0;
                    this.o0 = 1.0f;
                } else {
                    if (D()) {
                        this.x0 = 1;
                        v0Var.setVisibility(0);
                    } else {
                        v0Var.setVisibility(v0() ? 8 : 4);
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
                if (v0Var != null) {
                    v0Var.setVisibility((v0() || this.V0) ? 8 : 4);
                }
            }
            int i26 = qt0VarArr2[z10 ? 1 : 0].F;
            if (i26 == 6) {
                if (!it0Var.e && !it0Var.h && it0Var.d.isEmpty()) {
                    it0.E(it0Var, 0L);
                }
            } else if (i26 != 7) {
                if (p0(i26)) {
                    uu0 k13 = k1(qt0VarArr2[z10 ? 1 : 0].F);
                    if (k13 != null) {
                        bi.l8 l8Var = k13.s;
                        k13.P();
                        qt0VarArr2[z10 ? 1 : 0].w.e(l8Var != null && (l8Var.k() || (i0() && l8Var.g() > 0)), z10);
                        z15 = (l8Var == null || l8Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z15 = z14;
                    }
                    z14 = z15;
                } else {
                    int i27 = qt0VarArr2[z10 ? 1 : 0].F;
                    if (i27 != 10 && i27 != 11 && i27 != 12 && i27 != 13 && i27 != 14) {
                        if (i27 == 15) {
                            i27 = 8;
                        }
                        mu0 mu0Var6 = mu0VarArr[i27];
                        if (!mu0Var6.g && !mu0Var6.i[0] && mu0Var6.a.isEmpty()) {
                            mu0VarArr[i27].g = true;
                            h0Var2.l();
                            if (i27 == 0) {
                                int i28 = mu0VarArr[0].q;
                                if (i28 == 1) {
                                    i10 = 6;
                                } else if (i28 == 2) {
                                    i10 = 7;
                                }
                                n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i10, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i10].p, null, null);
                            }
                            i10 = i27;
                            n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i10, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i10].p, null, null);
                        }
                    }
                }
            }
            int i29 = qt0VarArr2[z10 ? 1 : 0].F;
            if (i29 == 8 || w0(i29)) {
                qt0 qt0Var11 = qt0VarArr2[z10 ? 1 : 0];
                hs0 hs0Var = qt0Var11.w;
                boolean w02 = w0(qt0Var11.F);
                int h12 = h1(qt0VarArr2[z10 ? 1 : 0].F);
                x9 x9Var = hs0Var.b;
                di.d dVar = hs0Var.f;
                x9Var.setVisibility((w02 || u0() || r0()) ? 8 : 0);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    hs0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (w02) {
                    hs0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    hs0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    hs0Var.d.setText(LocaleController.getString(!t0() ? v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    hs0Var.e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                }
                dVar.setOnClickListener(new uq0(this, w02, h12, 0));
            } else {
                qt0 qt0Var12 = qt0VarArr2[z10 ? 1 : 0];
                if (qt0Var12.F == 9) {
                    if (u0()) {
                        qt0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        qt0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        qt0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        qt0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        qt0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        qt0VarArr2[z10 ? 1 : 0].w.f.h(w());
                    }
                    qt0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    qt0VarArr2[z10 ? 1 : 0].w.e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                    qt0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new sq0(this, 7));
                } else {
                    qt0Var12.w.b.setVisibility(0);
                    qt0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    qt0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                    qt0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    qt0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z16 = false;
            qt0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i11 = i15;
            z17 = z14;
            u0Var2 = u0Var4;
        }
        qt0 qt0Var13 = qt0VarArr2[z10 ? 1 : 0];
        qt0Var13.b = z17;
        o1(qt0Var13, z16);
        qt0VarArr2[z10 ? 1 : 0].x.y1(i11);
        qt0VarArr2[z10 ? 1 : 0].h.a0();
        if (u0Var2 != null) {
            qt0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var2);
            qt0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(u0Var2);
        }
        if (this.x0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.G;
            if (kVar.n0) {
                this.z0 = true;
                kVar.h(true);
                this.x0 = 0;
                this.o0 = 0.0f;
                if (v0Var != null) {
                    v0Var.setVisibility(v0() ? 8 : 4);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        for (qt0 qt0Var : this.k0) {
            wr0 wr0Var = qt0Var.h;
            Objects.requireNonNull(wr0Var);
            qt0Var.n = new bh.l(wr0Var, viewGroup, new dw(wr0Var, 4));
        }
        nr0 nr0Var = this.V;
        if (nr0Var != null) {
            nr0Var.S = viewGroup;
            nr0Var.R = new di.z7(nr0Var, 1);
        }
    }

    public final void n1() {
        ct0 ct0Var = this.H;
        if (ct0Var != null) {
            ct0Var.l();
        }
        ku0 ku0Var = this.K;
        if (ku0Var != null) {
            ku0Var.l();
        }
        ku0 ku0Var2 = this.L;
        if (ku0Var2 != null) {
            ku0Var2.l();
        }
        lu0 lu0Var = this.J;
        if (lu0Var != null) {
            lu0Var.X(false);
        }
        ku0 ku0Var3 = this.M;
        if (ku0Var3 != null) {
            ku0Var3.l();
        }
        eu0 eu0Var = this.N;
        if (eu0Var != null) {
            eu0Var.l();
        }
        lt0 lt0Var = this.O;
        if (lt0Var != null) {
            lt0Var.l();
        }
        ft0 ft0Var = this.c0;
        if (ft0Var != null) {
            ft0Var.l();
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            ((wu0) it.next()).c.l();
        }
    }

    public final void o1(qt0 qt0Var, boolean z10) {
        boolean z11 = qt0Var.b && this.d;
        sk0 fastScroll = qt0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = qt0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            qt0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<sk0, Float>) property, fastScroll.getAlpha(), 1.0f);
            qt0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<sk0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new org.telegram.ui.to(fastScroll));
        qt0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.k0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            wr0 wr0Var = qt0VarArr[i10].h;
            if (wr0Var != null) {
                wr0Var.getViewTreeObserver().addOnPreDrawListener(new ts0(this, i10, 0));
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
        jt0 jt0Var = this.D1;
        int height = jt0Var.f() != null ? jt0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof qt0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                wr0 wr0Var = ((qt0) childAt).h;
                wr0Var.setPadding(0, wr0Var.Y2, 0, wr0Var.Z2);
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
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (n2Var.getParentLayout() != null && !((ActionBarLayout) n2Var.getParentLayout()).j() && !J() && !this.a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    i40 i40Var = this.E1;
                    if (i40Var != null) {
                        i40Var.b(true);
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
                    qt0[] qt0VarArr = this.k0;
                    if (z11 && (((z10 = this.h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!U0(motionEvent, x10 < 0)) {
                            this.y1 = true;
                            this.x1 = false;
                            N0(false);
                            qt0VarArr[0].setTranslationX(0.0f);
                            qt0VarArr[1].setTranslationX(this.h1 ? qt0VarArr[0].getMeasuredWidth() : -qt0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, qt0VarArr[1].F);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.y1 || this.x1) {
                        if (this.x1) {
                            qt0VarArr[0].setTranslationX(x10);
                            if (this.h1) {
                                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                qt0VarArr[1].setTranslationX(x10 - qt0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / qt0VarArr[0].getMeasuredWidth();
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
                            Z0(abs2, qt0VarArr[1].F);
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
        org.telegram.ui.ActionBar.v0 v0Var = this.t0;
        if (v0Var == null) {
            return;
        }
        boolean z10 = this.v1.getMessagesController().isPeerNoForwards(this.j1) || j0();
        v0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && v0Var.getBackground() != null) {
            v0Var.setBackground(null);
        } else {
            if (z10 || v0Var.getBackground() != null) {
                return;
            }
            v0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(h0(org.telegram.ui.ActionBar.j6.z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        nr0 nr0Var;
        sr0 sr0Var;
        aj0 aj0Var = this.s0;
        if (aj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((nr0Var = this.V) == null || !nr0Var.g()) && ((sr0Var = this.W) == null || !sr0Var.w))) {
            f7 = Utilities.clamp(this.o0 + this.p0, 1.0f, 0.0f);
        }
        aj0Var.setAlpha(f7);
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
            qt0[] qt0VarArr = this.k0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            int childCount = qt0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = qt0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).e(false, z10);
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
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        if (v0Var == null) {
            return;
        }
        qt0[] qt0VarArr = this.k0;
        qt0 qt0Var = qt0VarArr[1];
        float f10 = 0.0f;
        if (qt0Var != null && qt0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        if (qt0Var2 != null && qt0Var2.F == 11) {
            f10 += 1.0f - f7;
        }
        v0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        v0Var.setScaleX(f11);
        v0Var.setScaleY(f11);
        v0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
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
                    mu0[] mu0VarArr = this.t1;
                    if (i10 >= mu0VarArr.length) {
                        break;
                    }
                    if (mu0VarArr[i10].b[1].size() == 0) {
                        mu0 mu0Var = mu0VarArr[i10];
                        mu0Var.j[1] = this.d1.migrated_from_max_id;
                        mu0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.d1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        ns0 ns0Var = this.I0;
        if (ns0Var != null) {
            ns0Var.setInitialTabId(q0() ? 9 : 8);
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

    public void setForwardRestrictedHint(i40 i40Var) {
        this.E1 = i40Var;
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
            qt0[] qt0VarArr = this.k0;
            if (i14 >= qt0VarArr.length) {
                break;
            }
            qt0VarArr[i14].setTranslationY(this.K1);
            i14++;
        }
        if (this.P0 != null) {
            K();
        } else {
            js0 js0Var = this.R0;
            if (js0Var != null) {
                js0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.O0 = i11;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        w0Var.setTranslationY((w0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.O0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.X1 != i10) {
            this.X1 = i10;
            qt0[] qt0VarArr = this.k0;
            if (qt0VarArr != null) {
                for (qt0 qt0Var : qt0VarArr) {
                    if (qt0Var != null) {
                        wr0 wr0Var = qt0Var.h;
                        int paddingLeft = wr0Var.getPaddingLeft();
                        wr0 wr0Var2 = qt0Var.h;
                        int i11 = wr0Var2.Y2;
                        int paddingRight = wr0Var2.getPaddingRight();
                        wr0 wr0Var3 = qt0Var.h;
                        int Y = Y(v0());
                        wr0Var3.e3 = Y;
                        wr0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
            qt0[] qt0VarArr = this.k0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            o1(qt0VarArr[i10], true);
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
            qt0[] qt0VarArr = this.k0;
            if (i11 >= qt0VarArr.length) {
                break;
            }
            float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(qt0VarArr[i11].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            qt0VarArr[i11].w.setTranslationY(f7);
            qt0VarArr[i11].v.setTranslationY(-f7);
            i11++;
        }
        lr0 lr0Var = this.U;
        if (lr0Var != null) {
            lr0Var.setVisibleHeight(i10);
        }
        nr0 nr0Var = this.V;
        if (nr0Var != null) {
            nr0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        if (v0Var == null) {
            return;
        }
        qt0 qt0Var = this.k0[1];
        boolean z10 = qt0Var != null && qt0Var.F == 11;
        if (z10) {
            v0Var.setVisibility(0);
        }
        v0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new ah.u(29, this, z10)).setDuration(420L).setInterpolator(pr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        bi.l8 l8Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.v0 v0Var = this.w0;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.v0;
        if (r02) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (w0(getClosestTab())) {
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                }
                if (v0Var != null) {
                    v0Var.setVisibility(8);
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
            ft0 ft0Var = this.c0;
            if (ft0Var != null && (l8Var = ft0Var.s) != null && !l8Var.m(messageObject.getId())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (v0Var2 != null) {
            v0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (v0Var != null) {
            v0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public boolean v0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e5, code lost:
    
        if ((r36[8] <= 0) == r8.e(15)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e7, code lost:
    
        r4 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01ea, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01fb, code lost:
    
        if ((r36[4] <= 0) == r8.e(4)) goto L176;
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
        ns0 ns0Var;
        int selectedTab;
        boolean z14;
        boolean z15;
        long j3;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        Integer num;
        ns0 ns0Var2;
        boolean z16;
        int i12;
        int size;
        int i13;
        Boolean bool;
        String string;
        String str;
        String str2;
        nr0 nr0Var;
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
        pu0 pu0Var;
        ns0 ns0Var3 = this.I0;
        if (ns0Var3 == null) {
            return;
        }
        boolean z17 = !this.D1.p() ? false : z10;
        boolean z18 = (this.T == null || (pu0Var = this.u1) == null || !pu0Var.f) ? false : true;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        long j10 = this.j1;
        if (j10 <= 0 || n2Var == null) {
            c10 = 4;
            user = null;
        } else {
            c10 = 4;
            user = n2Var.getMessagesController().getUser(Long.valueOf(j10));
        }
        boolean z19 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z20 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.e1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z19) ? false : true;
        boolean z21 = (DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && (((userFull = this.e1) != null && userFull.stories_pinned_available) || (((chatFull = this.d1) != null && chatFull.stories_pinned_available) || v0())) && m0();
        nr0 nr0Var2 = this.V;
        boolean z22 = nr0Var2 != null && (((userFull3 = this.e1) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.d1) != null && chatFull3.stargifts_count > 0));
        boolean z23 = z20;
        TLRPC.ChatFull chatFull4 = this.d1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.e1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z17;
                int i17 = this.Q1 == ns0Var3.n0 ? 1 : 0;
                int i18 = (!z21 || z23) == ns0Var3.e(8) ? i17 + 1 : i17;
                if (z19 != ns0Var3.e(13)) {
                    i18++;
                }
                int i19 = i18;
                i10 = t0() == ns0Var3.e(8) ? i19 + 1 : i19;
                if (z22 == ns0Var3.e(14)) {
                    i10++;
                } else if (nr0Var2 != null && z22) {
                    z11 = z18;
                    i11 = 14;
                    if (this.P1 != nr0Var2.getLastEmojisHash()) {
                        i10++;
                    }
                    v02 = v0();
                    ht0 ht0Var = this.a0;
                    boolean z25 = z22;
                    int[] iArr2 = this.X0;
                    if (v02) {
                        iArr = iArr2;
                        z12 = false;
                        z13 = false;
                    } else {
                        iArr = iArr2;
                        int i20 = i10;
                        int i21 = (ht0Var.d == null) == ns0Var3.e(7) ? i20 + 1 : i20;
                        int i22 = (iArr[0] <= 0) == ns0Var3.e(0) ? i21 + 1 : i21;
                        int i23 = (iArr[1] <= 0) == ns0Var3.e(1) ? i22 + 1 : i22;
                        if (DialogObject.isEncryptedDialog(j10)) {
                            i15 = i23;
                        } else {
                            int i24 = i23;
                            int i25 = (iArr[3] <= 0) == ns0Var3.e(3) ? i24 + 1 : i24;
                            i15 = (iArr[c10] <= 0) == ns0Var3.e(4) ? i25 + 1 : i25;
                        }
                        int i26 = i16;
                        int i27 = (iArr[2] <= 0) == ns0Var3.e(2) ? i26 + 1 : i26;
                        int i28 = (iArr[5] <= 0) == ns0Var3.e(5) ? i27 + 1 : i27;
                        int i29 = (iArr[6] <= 0) == ns0Var3.e(6) ? i28 + 1 : i28;
                        boolean z26 = !this.Q.d.isEmpty();
                        int i30 = i29;
                        i10 = z26 != ns0Var3.e(10) ? i30 + 1 : i30;
                        z12 = l0() && !n2Var.getMessagesController().getSavedMessagesController().unsupported && n2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                        z13 = z26;
                        if (z12 != ns0Var3.e(11)) {
                            i10++;
                        }
                        if (z11 != ns0Var3.e(12)) {
                            i10++;
                        }
                    }
                    if (i10 > 0) {
                        if (z24) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.setOrdering(0);
                            z14 = z12;
                            transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(2));
                            z15 = z11;
                            j3 = j10;
                            transitionSet.setDuration(200L);
                            TransitionManager.beginDelayedTransition(ns0Var3.getTabsContainer(), transitionSet);
                            ns0Var3.U = ns0Var3.v;
                            ns0Var3.V = ns0Var3.w;
                        } else {
                            z14 = z12;
                            z15 = z11;
                            j3 = j10;
                        }
                        SparseArray g10 = ns0Var3.g();
                        if (i10 > 3) {
                            g10 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (t0()) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            ns0Var3.b0 = 420L;
                        }
                        if (z23) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        } else if ((DialogObject.isUserDialog(j3) || DialogObject.isChatDialog(j3)) && !DialogObject.isEncryptedDialog(j3) && ((((userFull2 = this.e1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.d1) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                            if (q0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                ns0Var3.b0 = 420L;
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
                            HashMap hashMap = yh.q2.T;
                            zh.j5 j5Var = nr0Var2.d;
                            if (j5Var == null) {
                                nr0Var = nr0Var2;
                                num = 0;
                                ns0Var2 = ns0Var3;
                                z16 = z15;
                                str2 = string2;
                                obj = "";
                            } else {
                                z16 = z15;
                                ArrayList arrayList2 = j5Var.l;
                                str2 = string2;
                                num = 0;
                                ns0Var2 = ns0Var3;
                                Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(nr0Var2.c));
                                if (!arrayList2.isEmpty()) {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList3 = new ArrayList();
                                    int i31 = 0;
                                    while (true) {
                                        nr0Var = nr0Var2;
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
                                        nr0Var2 = nr0Var;
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                        int i32 = 0;
                                        while (i32 < arrayList3.size()) {
                                            TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i32);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                            spannableStringBuilder2.setSpan(new z5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
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
                                        this.P1 = nr0Var.getLastEmojisHash();
                                    }
                                } else if (!j5Var.i || (obj2 = (CharSequence) hashMap.get(pair)) == null) {
                                    nr0Var = nr0Var2;
                                } else {
                                    nr0Var = nr0Var2;
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
                            this.P1 = nr0Var.getLastEmojisHash();
                        } else {
                            num = 0;
                            ns0Var2 = ns0Var3;
                            z16 = z15;
                        }
                        if (z19) {
                            arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        }
                        if (!v0()) {
                            if (z14) {
                                arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                            }
                            if (ht0Var.d != null) {
                                arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && ht0Var.d == null) {
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
                        ns0Var = ns0Var2;
                        if (ns0Var.n0) {
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
                                    if (!ns0Var.e(((Integer) pair2.first).intValue())) {
                                        ns0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, g10);
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
                        ns0Var = ns0Var3;
                    }
                    selectedTab = getSelectedTab();
                    if (selectedTab >= 0) {
                        this.k0[0].F = selectedTab;
                    }
                    this.Q1 = ns0Var.n0;
                    ns0Var.c();
                    L0();
                    I();
                }
                z11 = z18;
                i11 = 14;
                v02 = v0();
                ht0 ht0Var2 = this.a0;
                boolean z252 = z22;
                int[] iArr22 = this.X0;
                if (v02) {
                }
                if (i10 > 0) {
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                }
                this.Q1 = ns0Var.n0;
                ns0Var.c();
                L0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z17;
        if (this.Q1 == ns0Var3.n0) {
        }
        int i172 = this.Q1 == ns0Var3.n0 ? 1 : 0;
        if ((!z21 || z23) == ns0Var3.e(8)) {
        }
        if (z19 != ns0Var3.e(13)) {
        }
        int i192 = i18;
        if (t0() == ns0Var3.e(8)) {
        }
        if (z22 == ns0Var3.e(14)) {
        }
        z11 = z18;
        i11 = 14;
        v02 = v0();
        ht0 ht0Var22 = this.a0;
        boolean z2522 = z22;
        int[] iArr222 = this.X0;
        if (v02) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.Q1 = ns0Var.n0;
        ns0Var.c();
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
                this.W1.setSpan(new nq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        qt0[] qt0VarArr = this.k0;
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var == null) {
            return null;
        }
        int i10 = qt0Var.F;
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
            } else if (c0(qt0VarArr[0].F) >= 5 || w0(qt0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, true));
    }

    public final void x(n70 n70Var, org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        String publicUsername = j3 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j3))) : ChatObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a4.a.z(sb2, MessagesController.getInstance(n2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        n70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new er0(this, sb2.toString(), n2Var, 0), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.C1)) {
            return false;
        }
        nr0 nr0Var = this.V;
        if (nr0Var != null && nr0Var.g()) {
            return false;
        }
        sr0 sr0Var = this.W;
        return ((sr0Var != null && sr0Var.w) || this.o1 || this.g1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        qt0[] qt0VarArr = this.k0;
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var == null) {
            return null;
        }
        if (this.k1 && p0(qt0Var.F)) {
            return null;
        }
        int i10 = qt0VarArr[0].F;
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
            } else if (c0(qt0VarArr[0].F) >= 5 || w0(qt0VarArr[0].F)) {
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
    public final void y(n70 n70Var) {
        qt0 qt0Var;
        int x10 = n70Var.x();
        final int i10 = 0;
        n70Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.br0
            public final /* synthetic */ xu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        xu0 xu0Var = this.b;
                        xu0Var.getClass();
                        View[] viewArr = r2;
                        xu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        xu0 xu0Var2 = this.b;
                        xu0Var2.getClass();
                        View[] viewArr2 = r2;
                        xu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        n70Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.br0
            public final /* synthetic */ xu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        xu0 xu0Var = this.b;
                        xu0Var.getClass();
                        View[] viewArr = r2;
                        xu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        xu0 xu0Var2 = this.b;
                        xu0Var2.getClass();
                        View[] viewArr2 = r2;
                        xu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {n70Var.w(x10), n70Var.w(x10 + 1)};
        qt0[] qt0VarArr = this.k0;
        if (qt0VarArr != null && (qt0Var = qt0VarArr[0]) != null) {
            boolean p02 = p0(qt0Var.F);
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
        mu0[] mu0VarArr = this.t1;
        mu0VarArr[i10].a.clear();
        mu0VarArr[i10].b[0].clear();
        mu0VarArr[i10].b[1].clear();
        mu0 mu0Var = mu0VarArr[i10];
        mu0Var.j[0] = i11;
        mu0Var.i[0] = false;
        mu0Var.l = false;
        mu0Var.m = i12;
        mu0Var.n = (mu0Var.e() - i12) - 1;
        mu0 mu0Var2 = mu0VarArr[i10];
        if (mu0Var2.n < 0) {
            mu0Var2.n = 0;
        }
        mu0Var2.k = i11;
        mu0Var2.o = true;
        mu0Var2.g = false;
        mu0Var2.p++;
        qt0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            qt0[] qt0VarArr = this.k0;
            if (i13 >= qt0VarArr.length) {
                return;
            }
            qt0 qt0Var = qt0VarArr[i13];
            if (qt0Var.F == i10) {
                qt0Var.x.h1(Math.min(mu0VarArr[i10].e() - 1, mu0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void z(pt0 pt0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = pt0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = pt0Var.getChildAt(i11);
            if (childAt instanceof t00) {
                view = childAt;
            }
        }
        if (view != null) {
            pt0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new ss0(this, pt0Var, sparseBooleanArray, (t00) view, i10));
    }

    public final void z0(boolean z10) {
        long j3 = this.F;
        if (j3 != 0 || t0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = d2[i10];
            mu0[] mu0VarArr = this.t1;
            if (mu0VarArr[i11].h && !z10) {
                return;
            }
            long j10 = this.j1;
            if (DialogObject.isEncryptedDialog(j10)) {
                return;
            }
            mu0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = mu0VarArr[i11].q;
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
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            tL_messages_getSearchResultsPositions.peer = n2Var.getMessagesController().getInputPeer(j10);
            if (j3 != 0 && n2Var.getUserConfig().getClientUserId() == j10) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = n2Var.getMessagesController().getInputPeer(j3);
            }
            final int i13 = mu0VarArr[i11].p;
            ConnectionsManager.getInstance(n2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(n2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.pq0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new xq0(xu0.this, tL_error, i13, i11, tLObject, 0));
                }
            }), n2Var.getClassGuid());
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
