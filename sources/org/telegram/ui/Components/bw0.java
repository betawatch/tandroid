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
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class bw0 extends FrameLayout implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.l2 {
    public static final int[] p2 = {0, 1, 2, 4};
    public static final rs0 q2 = new rs0(0);
    public final Drawable A0;
    public boolean A1;
    public boolean B0;
    public int B1;
    public final NumberTextView C0;
    public int C1;
    public final LinearLayout D0;
    public VelocityTracker D1;
    public final int E;
    public final ImageView E0;
    public boolean E1;
    public final long F;
    public final org.telegram.ui.ActionBar.j2 F0;
    public final nu0 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public t40 G1;
    public final org.telegram.ui.ActionBar.r5 H;
    public final ArrayList H0;
    public final org.telegram.ui.ActionBar.u6 H1;
    public final org.telegram.ui.ActionBar.y5 I;
    public final ArrayList I0;
    public final hh.c I1;
    public final fu0 J;
    public final ArrayList J0;
    public final NotificationCenter.ObserversGroup J1;
    public final vv0 K;
    public final vt0 K0;
    public boolean K1;
    public final pv0 L;
    public final st0 L0;
    public final AnimationNotificationsLocker L1;
    public final ov0 M;
    public final org.telegram.ui.Cells.v0 M0;
    public org.telegram.ui.g4 M1;
    public final ov0 N;
    public AnimatorSet N0;
    public int N1;
    public final ov0 O;
    public final wr0 O0;
    public boolean O1;
    public final jv0 P;
    public final ArrayList P0;
    public int P1;
    public final pu0 Q;
    public float Q0;
    public AnimatorSet Q1;
    public final mu0 R;
    public final ws R0;
    public final SparseArray R1;
    public final ku0 S;
    public final FrameLayout S0;
    public long S1;
    public final mv0 T;
    public final qt0 T0;
    public boolean T1;
    public final nv0 U;
    public final int U0;
    public int U1;
    public final gu0 V;
    public final Paint V0;
    public final cu0 V1;
    public final vs0 W;
    public boolean W0;
    public di.z6 W1;
    public boolean X0;
    public float X1;
    public bh.x0 Y0;
    public boolean Y1;
    public final int[] Z0;
    public SpannableStringBuilder Z1;
    public boolean a;
    public final ws0 a0;
    public int a1;
    public int a2;
    public boolean b;
    public final at0 b0;
    public final SparseArray[] b1;
    public boolean b2;
    public boolean c;
    public final lu0 c0;
    public int c1;
    public int c2;
    public boolean d;
    public final s4.z d0;
    public boolean d1;
    public int d2;
    public int e;
    public final iu0 e0;
    public long e1;
    public int e2;
    public int f;
    public final yv0 f0;
    public TLRPC.ChatFull f1;
    public int f2;
    public final us0 g0;
    public TLRPC.UserFull g1;
    public oi.q g2;
    public float h;
    public final yv0 h0;
    public AnimatorSet h1;
    public float h2;
    public final xu0 i0;
    public boolean i1;
    public final RectF i2;
    public final xu0 j0;
    public boolean j1;
    public final HashMap j2;
    public final xu0 k0;
    public boolean k1;
    public final HashMap k2;
    public final su0 l0;
    public final long l1;
    public int l2;
    public final uu0[] m0;
    public boolean m1;
    public int m2;
    public float n;
    public final org.telegram.ui.ActionBar.w0 n0;
    public boolean n1;
    public int n2;
    public final org.telegram.ui.ActionBar.w0 o0;
    public final int[] o1;
    public int o2;
    public final org.telegram.ui.ActionBar.w0 p0;
    public float p1;
    public float q0;
    public boolean q1;
    public boolean r;
    public float r0;
    public int r1;
    public int s;
    public final TextView s0;
    public int s1;
    public final ImageView t0;
    public final gt0 t1;
    public final bk0 u0;
    public float u1;
    public int v;
    public final org.telegram.ui.ActionBar.w0 v0;
    public final qv0[] v1;
    public int w;
    public final org.telegram.ui.ActionBar.w0 w0;
    public final tv0 w1;
    public final Rect x;
    public final org.telegram.ui.ActionBar.w0 x0;
    public final org.telegram.ui.ActionBar.r2 x1;
    public final c10 y;
    public final org.telegram.ui.ActionBar.w0 y0;
    public int y1;
    public int z0;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a9c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0d9c  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [ch.b] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.view.ViewGroup, java.lang.Object, org.telegram.ui.Components.bw0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.Components.bw0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.ViewGroup, org.telegram.ui.Components.bw0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v29, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.j6, org.telegram.ui.Components.ws] */
    /* JADX WARN: Type inference failed for: r2v35, types: [android.view.View, org.telegram.ui.Components.po0, org.telegram.ui.Components.st0] */
    /* JADX WARN: Type inference failed for: r4v37, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bw0(Context context, long j10, tv0 tv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.r2 r2Var, nu0 nu0Var, int i13, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(context);
        int i14;
        TLRPC.ProfileTab profileTab;
        float f7;
        int i15;
        bw0 bw0Var;
        boolean z10;
        bw0 bw0Var2;
        ?? r82;
        ?? r12;
        at0 at0Var;
        int i16;
        ct0 ct0Var;
        tu0 tu0Var;
        tu0 tu0Var2;
        tu0 tu0Var3;
        tu0 tu0Var4;
        tu0 tu0Var5;
        tu0 tu0Var6;
        tu0 tu0Var7;
        tu0 tu0Var8;
        tu0 tu0Var9;
        tu0 tu0Var10;
        tu0 tu0Var11;
        int i17;
        tu0 tu0Var12;
        tu0 tu0Var13;
        tu0 tu0Var14;
        tu0 tu0Var15;
        fy0 fy0Var;
        fy0 fy0Var2;
        fy0 fy0Var3;
        fy0 fy0Var4;
        fy0 fy0Var5;
        fy0 fy0Var6;
        fy0 fy0Var7;
        fy0 fy0Var8;
        fy0 fy0Var9;
        fy0 fy0Var10;
        tu0 tu0Var16;
        fy0 fy0Var11;
        tu0 tu0Var17;
        tu0 tu0Var18;
        uu0 uu0Var;
        ct0 ct0Var2;
        tu0 tu0Var19;
        org.telegram.ui.ActionBar.w0 a2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        TL_bots.BotInfo botInfo;
        bw0 bw0Var3 = this;
        Context context2 = context;
        TLRPC.ChatFull chatFull2 = chatFull;
        org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
        bw0Var3.x = new Rect();
        bw0Var3.m0 = new uu0[2];
        bw0Var3.G0 = new ArrayList(10);
        bw0Var3.H0 = new ArrayList(10);
        bw0Var3.I0 = new ArrayList(10);
        bw0Var3.J0 = new ArrayList(10);
        bw0Var3.O0 = new wr0(bw0Var3, 13);
        bw0Var3.P0 = new ArrayList();
        bw0Var3.V0 = new Paint();
        bw0Var3.b1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        bw0Var3.m1 = false;
        bw0Var3.n1 = false;
        bw0Var3.o1 = new int[]{3, 3};
        bw0Var3.t1 = new gt0(bw0Var3);
        bw0Var3.u1 = -5.0f;
        bw0Var3.v1 = new qv0[9];
        bw0Var3.L1 = new AnimationNotificationsLocker();
        bw0Var3.R1 = new SparseArray();
        bw0Var3.U1 = -1;
        bw0Var3.V1 = new cu0(bw0Var3);
        bw0Var3.X1 = 0.0f;
        bw0Var3.f2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        bw0Var3.i2 = new RectF();
        bw0Var3.j2 = new HashMap();
        bw0Var3.k2 = new HashMap();
        hh.c cVar = new hh.c();
        bw0Var3.I1 = cVar;
        cVar.a(bw0Var3.p0(org.telegram.ui.ActionBar.y6.d6));
        ?? bVar2 = bVar == null ? new ch.b(cVar) : bVar;
        bw0Var3.E = i13;
        bw0Var3.H1 = u6Var2;
        c10 c10Var = new c10(context2, null);
        bw0Var3.y = c10Var;
        c10Var.setIsSingleCell(true);
        TLRPC.User user = r2Var.getMessagesController().getUser(Long.valueOf(j10));
        bw0Var3.w1 = tv0Var;
        bw0Var3.F1 = nu0Var;
        int[] iArr = tv0Var.c;
        long j11 = tv0Var.s;
        bw0Var3.F = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i10 : 0, iArr[7], iArr[8]};
        bw0Var3.Z0 = iArr2;
        if (userFull != null) {
            i14 = 5;
            profileTab = userFull.main_tab;
        } else {
            i14 = 5;
            profileTab = chatFull2 != null ? chatFull2.main_tab : null;
        }
        if (i11 == 14 || i11 == 10 || i11 == 11 || i11 == 6) {
            bw0Var3.a1 = i11;
        } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
            bw0Var3.a1 = 13;
        } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
            bw0Var3.a1 = 8;
        } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || bw0Var3.D0()))) {
            bw0Var3.a1 = 8;
        } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
            if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                int i23 = iArr2[1];
                i18 = -1;
                if (i23 == -1 || i23 > 0) {
                    bw0Var3.a1 = 1;
                }
            } else {
                i18 = -1;
            }
            if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i22 = iArr2[i14]) == i18 || i22 > 0)) {
                bw0Var3.a1 = i14;
            } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i21 = iArr2[3]) == i18 || i21 > 0)) {
                bw0Var3.a1 = 3;
            } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i20 = iArr2[4]) == i18 || i20 > 0)) {
                bw0Var3.a1 = 4;
            } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i19 = iArr2[2]) == i18 || i19 > 0)) {
                bw0Var3.a1 = 2;
            } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || bw0Var3.D0())) {
                bw0Var3.a1 = bw0Var3.getInitialTab();
            } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                int i24 = -1;
                if (i11 == -1 || j11 != 0) {
                    int i25 = 0;
                    while (true) {
                        int[] iArr3 = bw0Var3.Z0;
                        if (i25 >= iArr3.length) {
                            break;
                        }
                        int i26 = iArr3[i25];
                        if (i26 == i24 || i26 > 0) {
                            break;
                        }
                        i25++;
                        i24 = -1;
                    }
                    bw0Var3.a1 = i25;
                } else {
                    bw0Var3.a1 = i11;
                }
            } else {
                bw0Var3.a1 = 14;
            }
        } else {
            bw0Var3.a1 = 14;
        }
        bw0Var3.T0(i11);
        bw0Var3.f1 = chatFull2;
        bw0Var3.g1 = userFull;
        if (chatFull2 != null) {
            bw0Var3.e1 = -chatFull2.migrated_from_chat_id;
        }
        long j12 = j10;
        bw0Var3.l1 = j12;
        int i27 = 0;
        while (true) {
            qv0[] qv0VarArr = bw0Var3.v1;
            if (i27 >= qv0VarArr.length) {
                break;
            }
            qv0VarArr[i27] = new qv0();
            bw0Var3.v1[i27].j[0] = DialogObject.isEncryptedDialog(bw0Var3.l1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
            bw0Var3.v1[i27].j[1] = Integer.MAX_VALUE;
            bw0Var3.X(i27);
            if (bw0Var3.e1 != 0 && bw0Var3.f1 != null && bw0Var3.v1[i27].b[1].size() == 0) {
                qv0 qv0Var = bw0Var3.v1[i27];
                qv0Var.j[1] = bw0Var3.f1.migrated_from_max_id;
                qv0Var.i[1] = false;
            }
            i27++;
        }
        bw0Var3.x1 = r2Var;
        bw0Var3.G = r2Var.getActionBar();
        bw0Var3.H = r2Var.getSimpleActionBar();
        bw0Var3.o1[0] = bw0Var3.Y0() <= 0 ? SharedConfig.mediaColumnsCount : bw0Var3.Y0();
        bw0Var3.o1[1] = bw0Var3.Y0() <= 0 ? SharedConfig.storiesColumnsCount : bw0Var3.Y0();
        bw0Var3.J1 = r2Var.getNotificationCenter().createObserversGroup(bw0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        for (int i28 = 0; i28 < 10; i28++) {
            if (i11 == 4) {
                rt0 rt0Var = new rt0(bw0Var3, context2);
                rt0Var.T.c();
                bw0Var3.I0.add(rt0Var);
            }
        }
        bw0Var3.U0 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        bw0Var3.X0 = false;
        bw0Var3.Y0 = null;
        st0 st0Var = bw0Var3.L0;
        if (st0Var != null) {
            st0Var.g(false);
        }
        bw0Var3.W0 = false;
        Drawable drawable = context2.getResources().getDrawable(R.drawable.photos_header_shadow);
        bw0Var3.A0 = drawable;
        org.telegram.ui.ActionBar.f7.y(bw0Var3, drawable, org.telegram.ui.ActionBar.y6.b7, u6Var2, PorterDuff.Mode.MULTIPLY);
        vt0 vt0Var = bw0Var3.K0;
        int currentTabId = vt0Var != null ? vt0Var.getCurrentTabId() : i11;
        vt0 vt0Var2 = new vt0(bw0Var3, context2, bw0Var3.H1);
        int i29 = bw0Var3.a1;
        if (i29 != -1) {
            vt0Var2.setInitialTabId(i29);
            bw0Var3.a1 = -1;
        }
        vt0Var2.b0 = 320L;
        int i30 = org.telegram.ui.ActionBar.y6.a;
        int i31 = org.telegram.ui.ActionBar.y6.Fh;
        int i32 = org.telegram.ui.ActionBar.y6.Eh;
        int i33 = org.telegram.ui.ActionBar.y6.a;
        vt0Var2.L = i31;
        vt0Var2.M = i32;
        vt0Var2.updateColors();
        vt0Var2.setUseMinimalWidth(true);
        vt0Var2.setDelegate(new wt0(bw0Var3));
        bw0Var3.K0 = vt0Var2;
        for (int i34 = 1; i34 >= 0; i34--) {
            bw0Var3.b1[i34].clear();
        }
        bw0Var3.c1 = 0;
        bw0Var3.P0.clear();
        mv0 mv0Var = bw0Var3.T;
        if (mv0Var != null) {
            mv0Var.w.clear();
        }
        if (!(bw0Var3 instanceof j40)) {
            org.telegram.ui.ActionBar.r5 r5Var = bw0Var3.H;
            if (r5Var != null) {
                org.telegram.ui.ActionBar.x5 j13 = r5Var.j();
                a2 = j13.a(0, R.drawable.outline_header_search);
                if (!bw0Var3.x0() && !bw0Var3.B0()) {
                    org.telegram.ui.ActionBar.y5 a10 = j13.a(0, R.drawable.ic_ab_other);
                    bw0Var3.I = a10;
                    a10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    a10.Y(false, false);
                }
            } else {
                org.telegram.ui.ActionBar.z l4 = bw0Var3.G.l();
                l4.addOnLayoutChangeListener(new xt0(bw0Var3));
                if (bw0Var3.l1 == bw0Var3.x1.getUserConfig().getClientUserId() && (bw0Var3.x1 instanceof ua0) && bw0Var3.G()) {
                    bw0Var3.o0 = l4.a(11, R.drawable.outline_header_search);
                }
                a2 = l4.a(0, 0);
            }
            org.telegram.ui.ActionBar.w0 J = a2.M().J(new eu0(bw0Var3));
            bw0Var3.p0 = J;
            st0 st0Var2 = bw0Var3.L0;
            J.setSearchFieldHint(LocaleController.getString((st0Var2 != null && st0Var2.a() && bw0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
            J.setContentDescription(LocaleController.getString("Search", R.string.Search));
            if (bw0Var3.H != null) {
                ((org.telegram.ui.ActionBar.y5) J).Y(false, false);
            } else {
                J.setTranslationY(AndroidUtilities.dp(10.0f));
                bw0Var3.setSearchItemVisibility(bw0Var3.D0() ? 8 : 4);
            }
        }
        ImageView imageView = new ImageView(context2);
        bw0Var3.t0 = imageView;
        imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView.setVisibility(4);
        if (bw0Var3.H != null || bw0Var3.x0() || bw0Var3.B0()) {
            f7 = 2.0f;
        } else {
            bw0Var3.G.addView(imageView, kb1.i(48, 56, 85));
            bk0 bk0Var = new bk0(context2);
            bw0Var3.u0 = bk0Var;
            bk0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            f7 = 2.0f;
            bk0Var.f(R.raw.options_to_search, 24, 24, null);
            bk0Var.getAnimatedDrawable().F *= 2.0f;
            bk0Var.getAnimatedDrawable().h = true;
            org.telegram.ui.ActionBar.f7.t(bk0Var, org.telegram.ui.ActionBar.y6.y8, u6Var2, PorterDuff.Mode.SRC_IN);
            bk0Var.setVisibility(8);
            bw0Var3.G.addView(bk0Var, kb1.i(48, 56, 85));
        }
        imageView.setOnClickListener(new vr0(bw0Var3, 0));
        org.telegram.ui.ActionBar.y5 y5Var = bw0Var3.I;
        if (y5Var != null) {
            y5Var.setOnClickListener(new vr0(bw0Var3, 1));
        }
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var3.p0;
        if (w0Var != null && bw0Var3.H == null) {
            EditTextBoldCursor searchField = w0Var.getSearchField();
            int i35 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(searchField, i35, u6Var2);
            org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Si, u6Var2);
            org.telegram.ui.ActionBar.f7.w(searchField, i35, u6Var2);
        }
        bw0Var3.z0 = 0;
        ?? linearLayout = new LinearLayout(context2);
        bw0Var3.D0 = linearLayout;
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        linearLayout.setVisibility(4);
        ImageView imageView2 = new ImageView(context2);
        bw0Var3.E0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(true);
        bw0Var3.F0 = j2Var;
        imageView2.setImageDrawable(j2Var);
        int i36 = org.telegram.ui.ActionBar.y6.y8;
        j2Var.a(bw0Var3.p0(i36));
        int i37 = org.telegram.ui.ActionBar.y6.z8;
        org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.f0(bw0Var3.p0(i37), 1), null, org.telegram.ui.ActionBar.f7.N(i37), u6Var2);
        imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        bw0Var3.P0.add(imageView2);
        imageView2.setOnClickListener(new vr0(bw0Var3, 2));
        NumberTextView numberTextView = new NumberTextView(context2);
        bw0Var3.C0 = numberTextView;
        numberTextView.setTextSize(18);
        numberTextView.setTypeface(AndroidUtilities.bold());
        numberTextView.setTextColor(bw0Var3.p0(i36));
        linearLayout.addView(numberTextView, kb1.q(1.0f, 0, -1, 18, 0, 0));
        bw0Var3.P0.add(numberTextView);
        if (!DialogObject.isEncryptedDialog(bw0Var3.l1)) {
            if (!bw0Var3.D0()) {
                bw0Var3.w0 = bw0Var3.T(context2, 102, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage));
                bw0Var3.v0 = bw0Var3.T(context2, 100, R.drawable.msg_forward, LocaleController.getString(R.string.Forward));
            }
            org.telegram.ui.ActionBar.w0 T = bw0Var3.T(context2, 103, R.drawable.msg_pin, LocaleController.getString(R.string.PinMessage));
            bw0Var3.x0 = T;
            T.setVisibility(8);
            org.telegram.ui.ActionBar.w0 T2 = bw0Var3.T(context2, 104, R.drawable.msg_unpin, LocaleController.getString(R.string.UnpinMessage));
            bw0Var3.y0 = T2;
            T2.setVisibility(8);
            bw0Var3.A1();
        }
        bw0Var3.n0 = bw0Var3.T(context2, 101, R.drawable.msg_delete, LocaleController.getString("Delete", R.string.Delete));
        bw0Var3.J = new fu0(bw0Var3, context2);
        bw0Var3.K = new vv0(bw0Var3, context2);
        bw0Var3.M = new ov0(bw0Var3, context2, 1);
        bw0Var3.N = new ov0(bw0Var3, context2, 2);
        bw0Var3.O = new ov0(bw0Var3, context2, 4);
        bw0Var3.P = new jv0(bw0Var3, context2, bw0Var3.x1.getCurrentAccount(), bw0Var3.x1.getResourceProvider());
        bw0Var3.Q = new pu0(bw0Var3, context2);
        bw0Var3.i0 = new xu0(bw0Var3, context2, 1);
        bw0Var3.j0 = new xu0(bw0Var3, context2, 4);
        bw0Var3.k0 = new xu0(bw0Var3, context2, 3);
        bw0Var3.l0 = new su0(bw0Var3, context2);
        bw0Var3.R = new mu0(bw0Var3, context2);
        bw0Var3.S = new ku0(bw0Var3, context2);
        bw0Var3.T = new mv0(bw0Var3, context2);
        bw0Var3.U = new nv0(bw0Var3, context2);
        if (!bw0Var3.D0() && !bw0Var3.u0() && bw0Var3.F == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", bw0Var3.x1.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 3);
            gu0 gu0Var = new gu0(bw0Var3, context2, bw0Var3.x1.getParentLayout(), bundle);
            bw0Var3.V = gu0Var;
            long j14 = bw0Var3.l1;
            org.telegram.ui.xn xnVar = gu0Var.a;
            xnVar.p4 = j14;
            xnVar.gb = true;
            gu0Var.setClipToOutline(true);
            gu0Var.setOutlineProvider(new hu0());
        }
        lu0 lu0Var = new lu0(bw0Var3, context2);
        bw0Var3.c0 = lu0Var;
        if (bw0Var3.F == 0) {
            lu0Var.e = arrayList;
            lu0Var.d = currentTabId != 7 ? null : chatFull2;
        }
        bw0Var3.e0 = new iu0(bw0Var3, context2);
        bw0Var3.d0 = new s4.z(new ju0(bw0Var3));
        bw0Var3.f0 = new yv0(bw0Var3, context2, false);
        bw0Var3.g0 = new us0(bw0Var3, context2);
        bw0Var3.h0 = new yv0(bw0Var3, context2, true);
        bw0Var3.L = new pv0(bw0Var3, context2);
        float f10 = 48.0f;
        if (bw0Var3.y0()) {
            bw0Var3.W = new vs0(bw0Var3, context2, bw0Var3.x1, bw0Var3.l1);
            z10 = false;
            i15 = 1;
            bw0Var2 = bw0Var3;
        } else {
            if (bw0Var3.x1 instanceof ProfileActivity) {
                TextView textView = new TextView(context2);
                bw0Var3.s0 = textView;
                textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                textView.setTypeface(AndroidUtilities.bold());
                int i38 = org.telegram.ui.ActionBar.y6.Oh;
                org.telegram.ui.ActionBar.f7.V(textView, i38, u6Var2);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(17);
                org.telegram.ui.ActionBar.f7.R(textView, org.telegram.ui.ActionBar.y6.f0(org.telegram.ui.ActionBar.y6.o1(0.15f, bw0Var3.p0(i38)), 3), null, org.telegram.ui.ActionBar.f7.L(0.15f, i38), u6Var2);
                textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                bw0Var3.G.addView(textView, kb1.i(-2, 56, 85));
                textView.setOnClickListener(new vr0(bw0Var3, 3));
                textView.setVisibility(8);
                textView.setAlpha(0.0f);
                textView.setScaleX(0.4f);
                textView.setScaleY(0.4f);
                org.telegram.ui.ActionBar.r2 r2Var2 = bw0Var3.x1;
                i15 = 1;
                ws0 ws0Var = new ws0(r2Var2.getCurrentAccount(), ((ProfileActivity) bw0Var3.x1).a(), context2, r2Var2, u6Var2, bw0Var3);
                context2 = context2;
                bw0 bw0Var4 = bw0Var3;
                bw0Var4.a0 = ws0Var;
                int dp = AndroidUtilities.dp(48.0f);
                ws wsVar = bw0Var4.R0;
                ws0Var.setPaddingTop(dp + (wsVar != null ? (int) wsVar.c(0.0f) : 0));
                bw0Var4.b0 = new at0(bw0Var4, context2, bw0Var4.getStoriesController().B(bw0Var4.l1, true), new zs0(bw0Var4, context2, r2Var, u6Var2));
                bw0Var = bw0Var4;
            } else {
                i15 = 1;
                bw0Var = bw0Var3;
            }
            z10 = false;
            bw0Var2 = bw0Var;
        }
        bw0Var2.setWillNotDraw(z10);
        int i39 = 0;
        int i40 = -1;
        int i41 = 0;
        while (true) {
            uu0[] uu0VarArr = bw0Var2.m0;
            if (i41 >= uu0VarArr.length) {
                break;
            }
            if (i41 == 0 && (uu0Var = uu0VarArr[i41]) != null && (ct0Var2 = uu0Var.w) != null) {
                i40 = ct0Var2.L0();
                if (i40 != bw0Var2.m0[i41].w.B() - i15) {
                    tu0Var19 = bw0Var2.m0[i41].h;
                    wl0 wl0Var = (wl0) tu0Var19.K(i40);
                    if (wl0Var != null) {
                        i39 = wl0Var.a.getTop();
                    } else {
                        i40 = -1;
                    }
                } else {
                    i16 = i39;
                    i40 = -1;
                    bt0 bt0Var = new bt0(bw0Var2, context2);
                    bw0Var2.addView(bt0Var, kb1.h(-1, -1.0f, 51, 0.0f, bw0Var2.J0(), 0.0f, 0.0f));
                    if (i41 == i15) {
                        bt0Var.setTranslationX(AndroidUtilities.displaySize.x);
                    }
                    bw0Var2.m0[i41] = bt0Var;
                    bt0Var.N = u6Var2;
                    uu0 uu0Var2 = bw0Var2.m0[i41];
                    ct0Var = new ct0(bw0Var2, bt0Var);
                    uu0Var2.w = ct0Var;
                    ct0Var.A1(new dt0(bw0Var2, bt0Var));
                    bw0Var2.m0[i41].d = new s4.l();
                    float f11 = f10;
                    bw0Var2.m0[i41].d.n(280L);
                    bw0Var2.m0[i41].d.o(ds.h);
                    uu0 uu0Var3 = bw0Var2.m0[i41];
                    uu0Var3.d.m = false;
                    uu0Var3.h = new et0(bw0Var2, context2, bt0Var, ct0Var);
                    tu0Var = bw0Var2.m0[i41].h;
                    tu0Var.setFastScrollEnabled(i15);
                    tu0Var2 = bw0Var2.m0[i41].h;
                    tu0Var2.setScrollingTouchSlop(i15);
                    tu0Var3 = bw0Var2.m0[i41].h;
                    tu0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f7));
                    tu0Var4 = bw0Var2.m0[i41].h;
                    tu0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                    tu0Var5 = bw0Var2.m0[i41].h;
                    tu0Var5.setItemAnimator(null);
                    tu0Var6 = bw0Var2.m0[i41].h;
                    tu0Var6.setClipToPadding(false);
                    tu0Var7 = bw0Var2.m0[i41].h;
                    tu0Var7.setSectionsType(2);
                    tu0Var8 = bw0Var2.m0[i41].h;
                    tu0Var8.setLayoutManager(ct0Var);
                    uu0 uu0Var4 = bw0Var2.m0[i41];
                    tu0Var9 = uu0Var4.h;
                    uu0Var4.addView(tu0Var9, kb1.g(-1.0f, -1));
                    bw0Var2.m0[i41].n = new tu0(context2, null);
                    uu0 uu0Var5 = bw0Var2.m0[i41];
                    tu0 tu0Var20 = uu0Var5.n;
                    ft0 ft0Var = new ft0(bw0Var2);
                    uu0Var5.r = ft0Var;
                    tu0Var20.setLayoutManager(ft0Var);
                    uu0 uu0Var6 = bw0Var2.m0[i41];
                    uu0Var6.addView(uu0Var6.n, kb1.g(-1.0f, -1));
                    bw0Var2.m0[i41].n.setVisibility(8);
                    bw0Var2.m0[i41].n.i(new ht0(bt0Var));
                    tu0Var10 = bw0Var2.m0[i41].h;
                    tu0Var10.i(new it0(bw0Var2, bt0Var));
                    tu0Var11 = bw0Var2.m0[i41].h;
                    i17 = i40;
                    tu0Var11.setOnItemClickListener(new bi.m4(bw0Var2, bt0Var, context2, j12, u6Var2, 2));
                    tu0Var12 = bw0Var2.m0[i41].h;
                    tu0Var12.setOnScrollListener(new kt0(bw0Var2, bt0Var, ct0Var));
                    tu0Var13 = bw0Var2.m0[i41].h;
                    tu0Var13.setOnItemLongClickListener(new lt0(bw0Var2, bt0Var));
                    if (i41 == 0 && i17 != -1) {
                        ct0Var.h1(i17, i16);
                    }
                    tu0Var14 = bw0Var2.m0[i41].h;
                    bw0Var2.m0[i41].x = new mt0(context2, tu0Var14);
                    bw0Var2.m0[i41].x.setVisibility(8);
                    tu0Var15 = bw0Var2.m0[i41].h;
                    mt0 mt0Var = bw0Var2.m0[i41].x;
                    FrameLayout.LayoutParams g7 = kb1.g(-1.0f, -1);
                    if (tu0Var15.b1 == null) {
                        tu0Var15.b1 = new bh.r(tu0Var15, tu0Var15.getContext(), 20);
                    }
                    tu0Var15.b1.addView(mt0Var, g7);
                    bw0Var2.m0[i41].s = new nt0(bw0Var2, context2, bt0Var);
                    bw0Var2.m0[i41].s.w = false;
                    bw0Var2.m0[i41].s.setClipToOutline(true);
                    bw0Var2.m0[i41].s.setOutlineProvider(new ot0());
                    if (i41 == 0) {
                        bw0Var2.m0[i41].setVisibility(8);
                    }
                    uu0 uu0Var7 = bw0Var2.m0[i41];
                    uu0Var7.v = new pt0(bw0Var2, context2, uu0Var7.s);
                    fy0Var = bw0Var2.m0[i41].v;
                    fy0Var.d(8, false);
                    fy0Var2 = bw0Var2.m0[i41].v;
                    fy0Var2.setAnimateLayoutChange(true);
                    uu0 uu0Var8 = bw0Var2.m0[i41];
                    fy0Var3 = uu0Var8.v;
                    uu0Var8.addView(fy0Var3, kb1.g(-1.0f, -1));
                    fy0Var4 = bw0Var2.m0[i41].v;
                    fy0Var4.setOnTouchListener(new ei.d(23));
                    fy0Var5 = bw0Var2.m0[i41].v;
                    fy0Var5.e(true, false);
                    fy0Var6 = bw0Var2.m0[i41].v;
                    fy0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    fy0Var7 = bw0Var2.m0[i41].v;
                    fy0Var7.f.setVisibility(8);
                    fy0Var8 = bw0Var2.m0[i41].v;
                    fy0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    fy0Var9 = bw0Var2.m0[i41].v;
                    fy0Var9.f.setVisibility(8);
                    fy0Var10 = bw0Var2.m0[i41].v;
                    fy0Var10.addView(bw0Var2.m0[i41].s, kb1.h(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    tu0Var16 = bw0Var2.m0[i41].h;
                    fy0Var11 = bw0Var2.m0[i41].v;
                    tu0Var16.setEmptyView(fy0Var11);
                    tu0Var17 = bw0Var2.m0[i41].h;
                    tu0Var17.r1(0, true);
                    uu0[] uu0VarArr2 = bw0Var2.m0;
                    uu0 uu0Var9 = uu0VarArr2[i41];
                    tu0Var18 = uu0VarArr2[i41].h;
                    uu0Var9.y = new ql0(tu0Var18, bw0Var2.m0[i41].w);
                    i41++;
                    j12 = j10;
                    f10 = f11;
                    u6Var2 = u6Var;
                    i40 = i17;
                    i39 = i16;
                    i15 = 1;
                }
            }
            i16 = i39;
            bt0 bt0Var2 = new bt0(bw0Var2, context2);
            bw0Var2.addView(bt0Var2, kb1.h(-1, -1.0f, 51, 0.0f, bw0Var2.J0(), 0.0f, 0.0f));
            if (i41 == i15) {
            }
            bw0Var2.m0[i41] = bt0Var2;
            bt0Var2.N = u6Var2;
            uu0 uu0Var22 = bw0Var2.m0[i41];
            ct0Var = new ct0(bw0Var2, bt0Var2);
            uu0Var22.w = ct0Var;
            ct0Var.A1(new dt0(bw0Var2, bt0Var2));
            bw0Var2.m0[i41].d = new s4.l();
            float f112 = f10;
            bw0Var2.m0[i41].d.n(280L);
            bw0Var2.m0[i41].d.o(ds.h);
            uu0 uu0Var32 = bw0Var2.m0[i41];
            uu0Var32.d.m = false;
            uu0Var32.h = new et0(bw0Var2, context2, bt0Var2, ct0Var);
            tu0Var = bw0Var2.m0[i41].h;
            tu0Var.setFastScrollEnabled(i15);
            tu0Var2 = bw0Var2.m0[i41].h;
            tu0Var2.setScrollingTouchSlop(i15);
            tu0Var3 = bw0Var2.m0[i41].h;
            tu0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f7));
            tu0Var4 = bw0Var2.m0[i41].h;
            tu0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
            tu0Var5 = bw0Var2.m0[i41].h;
            tu0Var5.setItemAnimator(null);
            tu0Var6 = bw0Var2.m0[i41].h;
            tu0Var6.setClipToPadding(false);
            tu0Var7 = bw0Var2.m0[i41].h;
            tu0Var7.setSectionsType(2);
            tu0Var8 = bw0Var2.m0[i41].h;
            tu0Var8.setLayoutManager(ct0Var);
            uu0 uu0Var42 = bw0Var2.m0[i41];
            tu0Var9 = uu0Var42.h;
            uu0Var42.addView(tu0Var9, kb1.g(-1.0f, -1));
            bw0Var2.m0[i41].n = new tu0(context2, null);
            uu0 uu0Var52 = bw0Var2.m0[i41];
            tu0 tu0Var202 = uu0Var52.n;
            ft0 ft0Var2 = new ft0(bw0Var2);
            uu0Var52.r = ft0Var2;
            tu0Var202.setLayoutManager(ft0Var2);
            uu0 uu0Var62 = bw0Var2.m0[i41];
            uu0Var62.addView(uu0Var62.n, kb1.g(-1.0f, -1));
            bw0Var2.m0[i41].n.setVisibility(8);
            bw0Var2.m0[i41].n.i(new ht0(bt0Var2));
            tu0Var10 = bw0Var2.m0[i41].h;
            tu0Var10.i(new it0(bw0Var2, bt0Var2));
            tu0Var11 = bw0Var2.m0[i41].h;
            i17 = i40;
            tu0Var11.setOnItemClickListener(new bi.m4(bw0Var2, bt0Var2, context2, j12, u6Var2, 2));
            tu0Var12 = bw0Var2.m0[i41].h;
            tu0Var12.setOnScrollListener(new kt0(bw0Var2, bt0Var2, ct0Var));
            tu0Var13 = bw0Var2.m0[i41].h;
            tu0Var13.setOnItemLongClickListener(new lt0(bw0Var2, bt0Var2));
            if (i41 == 0) {
                ct0Var.h1(i17, i16);
            }
            tu0Var14 = bw0Var2.m0[i41].h;
            bw0Var2.m0[i41].x = new mt0(context2, tu0Var14);
            bw0Var2.m0[i41].x.setVisibility(8);
            tu0Var15 = bw0Var2.m0[i41].h;
            mt0 mt0Var2 = bw0Var2.m0[i41].x;
            FrameLayout.LayoutParams g72 = kb1.g(-1.0f, -1);
            if (tu0Var15.b1 == null) {
            }
            tu0Var15.b1.addView(mt0Var2, g72);
            bw0Var2.m0[i41].s = new nt0(bw0Var2, context2, bt0Var2);
            bw0Var2.m0[i41].s.w = false;
            bw0Var2.m0[i41].s.setClipToOutline(true);
            bw0Var2.m0[i41].s.setOutlineProvider(new ot0());
            if (i41 == 0) {
            }
            uu0 uu0Var72 = bw0Var2.m0[i41];
            uu0Var72.v = new pt0(bw0Var2, context2, uu0Var72.s);
            fy0Var = bw0Var2.m0[i41].v;
            fy0Var.d(8, false);
            fy0Var2 = bw0Var2.m0[i41].v;
            fy0Var2.setAnimateLayoutChange(true);
            uu0 uu0Var82 = bw0Var2.m0[i41];
            fy0Var3 = uu0Var82.v;
            uu0Var82.addView(fy0Var3, kb1.g(-1.0f, -1));
            fy0Var4 = bw0Var2.m0[i41].v;
            fy0Var4.setOnTouchListener(new ei.d(23));
            fy0Var5 = bw0Var2.m0[i41].v;
            fy0Var5.e(true, false);
            fy0Var6 = bw0Var2.m0[i41].v;
            fy0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            fy0Var7 = bw0Var2.m0[i41].v;
            fy0Var7.f.setVisibility(8);
            fy0Var8 = bw0Var2.m0[i41].v;
            fy0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            fy0Var9 = bw0Var2.m0[i41].v;
            fy0Var9.f.setVisibility(8);
            fy0Var10 = bw0Var2.m0[i41].v;
            fy0Var10.addView(bw0Var2.m0[i41].s, kb1.h(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            tu0Var16 = bw0Var2.m0[i41].h;
            fy0Var11 = bw0Var2.m0[i41].v;
            tu0Var16.setEmptyView(fy0Var11);
            tu0Var17 = bw0Var2.m0[i41].h;
            tu0Var17.r1(0, true);
            uu0[] uu0VarArr22 = bw0Var2.m0;
            uu0 uu0Var92 = uu0VarArr22[i41];
            tu0Var18 = uu0VarArr22[i41].h;
            uu0Var92.y = new ql0(tu0Var18, bw0Var2.m0[i41].w);
            i41++;
            j12 = j10;
            f10 = f112;
            u6Var2 = u6Var;
            i40 = i17;
            i39 = i16;
            i15 = 1;
        }
        float f12 = f10;
        at0 at0Var2 = bw0Var2.b0;
        if (at0Var2 != null) {
            bw0Var2.addView(at0Var2, kb1.h(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context2);
        bw0Var2.M0 = v0Var;
        v0Var.W((int) (System.currentTimeMillis() / 1000), false, false);
        v0Var.setAlpha(0.0f);
        int i42 = org.telegram.ui.ActionBar.y6.wc;
        int i43 = org.telegram.ui.ActionBar.y6.kd;
        v0Var.T0 = i42;
        v0Var.U0 = i43;
        v0Var.setTranslationY(-AndroidUtilities.dp(f12));
        bw0Var2.addView(v0Var, kb1.h(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        boolean V = bw0Var2.V();
        boolean z11 = bw0Var2;
        if (!V) {
            fh.e m10 = bw0Var2.H != null ? gh.c.m(u6Var) : gh.c.o(u6Var);
            ?? wsVar2 = new ws(context2);
            bw0Var2.R0 = wsVar2;
            wsVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            eh.d b10 = bVar2.b(wsVar2, m10);
            b10.x(AndroidUtilities.dp(24.0f));
            b10.w(AndroidUtilities.dp(7.0f));
            wsVar2.setBlurredBackground(b10);
            FrameLayout frameLayout = new FrameLayout(context2);
            bw0Var2.S0 = frameLayout;
            wsVar2.addView(frameLayout);
            wsVar2.i(frameLayout, true, false);
            wsVar2.setOnAnimatedHeightChangedListener(new wr0(bw0Var2, 0));
            qt0 qt0Var = new qt0(bw0Var2, context2, r2Var, this, u6Var);
            bw0Var2.T0 = qt0Var;
            frameLayout.addView(qt0Var);
            wsVar2.setCallFragmentContextView(qt0Var);
            bw0Var2.addView((View) wsVar2, kb1.h(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
            qt0Var.setDelegate(new xr0(bw0Var2));
            eh.d b11 = bVar2.b(bw0Var2.K0, m10);
            org.telegram.messenger.wh.s(b11, AndroidUtilities.dp(18.0f), 6.666f);
            bw0Var2.K0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
            bw0Var2.K0.setClipToPadding(false);
            bw0Var2.K0.setBackground(null);
            bw0Var2.K0.setBlurredBackground(b11);
            bw0Var2.K0.setOpen(false);
            bw0Var2.addView(bw0Var2.K0, kb1.h(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
            Context context3 = bw0Var2.getContext();
            org.telegram.ui.ActionBar.r2 r2Var3 = bw0Var2.x1;
            bw0 bw0Var5 = bw0Var2;
            ?? st0Var3 = new st0(r2Var3.getCurrentAccount(), bw0Var2.u0() ? 0L : bw0Var2.l1, context3, r2Var3, u6Var, bw0Var5);
            ?? r13 = bw0Var5;
            r13.L0 = st0Var3;
            st0Var3.d(bVar2, m10);
            st0Var3.setShown(0.0f);
            r13.addView(st0Var3, kb1.h(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.r5 r5Var2 = r13.H;
            z11 = r13;
            if (r5Var2 == null) {
                eh.d b12 = bVar2.b(r13.D0, m10);
                org.telegram.messenger.wh.s(b12, AndroidUtilities.dp(18.0f), 6.666f);
                r13.D0.setBackground(b12);
                r82 = 0;
                r13.D0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                r13.addView(r13.D0, kb1.i(-1, 50, 51));
                r12 = r13;
                r12.J1(r82);
                r12.v1(r82);
                r12.O(r82);
                if (r12.Z0[r82] >= 0) {
                    r12.H0(r82);
                }
                at0Var = r12.b0;
                if (at0Var != null || i12 <= 0) {
                }
                at0Var.setInitialTabId(i12);
                return;
            }
        }
        r82 = 0;
        r12 = z11;
        r12.J1(r82);
        r12.v1(r82);
        r12.O(r82);
        if (r12.Z0[r82] >= 0) {
        }
        at0Var = r12.b0;
        if (at0Var != null) {
        }
    }

    public static boolean E0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public static ou0 U(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        ou0 ou0Var = new ou0(context, u6Var);
        TextView textView = ou0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ou0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ou0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ou0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ou0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ou0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ou0Var;
        }
        ImageView imageView = ou0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return ou0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return ou0Var;
    }

    public static void g(bw0 bw0Var, TL_stories.StoryItem storyItem, di.a7 a7Var) {
        bw0Var.getStoriesController().c(a7Var.a, bw0Var.l1, storyItem);
        AndroidUtilities.runOnUIThread(new u90(18, bw0Var, a7Var), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public di.h7 getStoriesController() {
        return MessagesController.getInstance(this.x1.getCurrentAccount()).getStoriesController();
    }

    public static void j(bw0 bw0Var, long j10, int i10, String str) {
        di.v6 B = bw0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((di.a7) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j1(int i10, View view) {
        if (view == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.topMargin != i10) {
            marginLayoutParams.topMargin = i10;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void k(bw0 bw0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(bw0Var, i10, storyItem, 16);
        di.h7 storiesController = bw0Var.getStoriesController();
        long j10 = bw0Var.l1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i10, j10, arrayList);
        wc.b0(bw0Var.x1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), g4Var).j();
    }

    public static TLRPC.ProfileTab l0(int i10, boolean z10) {
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

    public static void m(bw0 bw0Var, long j10, int i10) {
        di.v6 B = bw0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        di.a7 a7Var = (di.a7) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = a7Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int m0(TLRPC.ProfileTab profileTab) {
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

    public static /* synthetic */ void n(bw0 bw0Var, TL_stories.StoryItem storyItem) {
        bw0Var.getStoriesController().r0(bw0Var.l1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        wc.b0(bw0Var.x1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void p(bw0 bw0Var, HashSet hashSet, TL_stories.StoryItem storyItem, l80 l80Var, di.a7 a7Var) {
        String formatString;
        long j10 = bw0Var.l1;
        if (hashSet.contains(Integer.valueOf(a7Var.a))) {
            bw0Var.getStoriesController().c(a7Var.a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, a7Var.b);
        } else {
            di.h7 storiesController = bw0Var.getStoriesController();
            int i10 = a7Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, a7Var.b);
        }
        wc.b0(bw0Var.x1).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        l80Var.u();
    }

    public static int r(View view) {
        if (view instanceof org.telegram.ui.Cells.w7) {
            return ((org.telegram.ui.Cells.w7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            return ((org.telegram.ui.Cells.o7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            return ((org.telegram.ui.Cells.n7) view).getMessage().getId();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.r5 r5Var = this.H;
        if (r5Var != null) {
            r5Var.setEnabled(z10);
        } else {
            this.G.setEnabled(z10);
        }
    }

    private void setPageOverscan(tu0 tu0Var) {
        if (!this.b2 || tu0Var == null) {
            return;
        }
        tu0Var.j3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tu0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            int i10 = marginLayoutParams.topMargin;
            int i11 = -this.d2;
            if (i10 == i11 && marginLayoutParams.bottomMargin == (-this.e2)) {
                return;
            }
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = -this.e2;
            tu0Var.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchItemVisibility(int i10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.p0;
        if (w0Var == null) {
            return;
        }
        if (this.H != null) {
            O(true);
        } else {
            w0Var.setVisibility(i10);
        }
    }

    public static void t(uu0 uu0Var, qv0[] qv0VarArr, boolean z10) {
        u90 u90Var;
        if (!z10) {
            if (uu0Var.F == null || (u90Var = uu0Var.G) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(u90Var);
            uu0Var.G.run();
            uu0Var.G = null;
            uu0Var.F = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || uu0Var.F != null || uu0Var.H || uu0Var.h.getFastScroll() == null || !uu0Var.h.getFastScroll().a0 || uu0Var.h.getFastScroll().getVisibility() != 0 || qv0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        uu0Var.H = true;
        Context context = uu0Var.getContext();
        tr0 tr0Var = new tr0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.y6.pf;
        org.telegram.ui.ActionBar.f7.V(textView, i10, null);
        int dp = AndroidUtilities.dp(6.0f);
        int i11 = org.telegram.ui.ActionBar.y6.qf;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        tr0Var.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(tr0Var, c02, N, null, null);
        tr0Var.addView(textView, kb1.h(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        sr0 sr0Var = new sr0(context);
        sr0Var.a = new Random();
        Paint paint = new Paint(1);
        sr0Var.b = paint;
        Paint paint2 = new Paint(1);
        sr0Var.c = paint2;
        sr0Var.f = 1.0f;
        sr0Var.h = 0.0f;
        paint.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        Paint paint3 = new Paint();
        sr0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        sr0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        tr0Var.addView(sr0Var, kb1.h(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        uu0Var.F = tr0Var;
        uu0Var.addView(tr0Var, kb1.g(-2.0f, -2));
        uu0Var.F.setAlpha(0.0f);
        uu0Var.F.setScaleX(0.8f);
        uu0Var.F.setScaleY(0.8f);
        uu0Var.F.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        uu0Var.invalidate();
        u90 u90Var2 = new u90(16, uu0Var, tr0Var);
        uu0Var.G = u90Var2;
        AndroidUtilities.runOnUIThread(u90Var2, 4000L);
    }

    public static void u(bw0 bw0Var, int i10, boolean z10) {
        uu0[] uu0VarArr = bw0Var.m0;
        if (uu0VarArr[0].E == i10) {
            return;
        }
        uu0 uu0Var = uu0VarArr[1];
        uu0Var.E = i10;
        uu0Var.setVisibility(0);
        bw0Var.t0();
        bw0Var.v1(true);
        bw0Var.j1 = z10;
        bw0Var.S0();
        bw0Var.D(!bw0Var.A0(i10));
        bw0Var.C1(true);
    }

    public static int w(bw0 bw0Var, s4.h0 h0Var) {
        if (h0Var == bw0Var.e0) {
            return 8;
        }
        if (h0Var == bw0Var.g0) {
            return 9;
        }
        for (aw0 aw0Var : bw0Var.j2.values()) {
            if (aw0Var.c == h0Var) {
                return aw0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return i10 == 8 || i10 == 9 || E0(i10);
    }

    public static int x(bw0 bw0Var, s4.h0 h0Var) {
        if (h0Var == bw0Var.f0) {
            return 8;
        }
        if (h0Var == bw0Var.h0) {
            return 9;
        }
        for (aw0 aw0Var : bw0Var.j2.values()) {
            if (aw0Var.d == h0Var) {
                return aw0Var.a;
            }
        }
        return -1;
    }

    public final void A(zu0 zu0Var, org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        String publicUsername = j10 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(r2Var.getCurrentAccount()).getUser(Long.valueOf(j10))) : ChatObject.getPublicUsername(MessagesController.getInstance(r2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        c3.h0.r(sb2, MessagesController.getInstance(r2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        zu0Var.Z(R.drawable.media_share, new kg(this, sb2.toString(), r2Var, 22), LocaleController.getString(R.string.StoriesAlbumMenuShareLink), false, true);
    }

    public final boolean A0(int i10) {
        return i10 == 7 ? this.F1.U() : (B0() || i10 == 0 || w0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14 || i10 == 15) ? false : true;
    }

    public final void A1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.v0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = this.x1.getMessagesController().isPeerNoForwards(this.l1) || r0();
        w0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && w0Var.getBackground() != null) {
            w0Var.setBackground(null);
            return;
        }
        if (z10 || w0Var.getBackground() != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.z8;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(p0(i10), 5, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        w0Var.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(w0Var, g02, null, N, this.H1);
    }

    public final void B(zu0 zu0Var) {
        final View[] viewArr = new View[2];
        final int i10 = 0;
        viewArr[0] = zu0Var.Z(R.drawable.msg_zoomin, new Runnable(this) { // from class: org.telegram.ui.Components.ls0
            public final /* synthetic */ bw0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        bw0 bw0Var = this.b;
                        bw0Var.getClass();
                        View[] viewArr2 = viewArr;
                        bw0Var.K1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        bw0 bw0Var2 = this.b;
                        bw0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        bw0Var2.L1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, LocaleController.getString(R.string.MediaZoomIn), false, false);
        final int i11 = 1;
        viewArr[1] = zu0Var.Z(R.drawable.msg_zoomout, new Runnable(this) { // from class: org.telegram.ui.Components.ls0
            public final /* synthetic */ bw0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        bw0 bw0Var = this.b;
                        bw0Var.getClass();
                        View[] viewArr2 = viewArr;
                        bw0Var.K1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        bw0 bw0Var2 = this.b;
                        bw0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        bw0Var2.L1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, LocaleController.getString(R.string.MediaZoomOut), false, false);
        View view = viewArr[0];
        if (view != null) {
            view.setEnabled(H());
            viewArr[0].setAlpha(H() ? 1.0f : 0.5f);
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            view2.setEnabled(I());
            viewArr[1].setAlpha(I() ? 1.0f : 0.5f);
        }
    }

    public boolean B0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void B1() {
        ws0 ws0Var = this.a0;
        if (ws0Var != null) {
            int dp = AndroidUtilities.dp(48.0f) + this.c2;
            ws wsVar = this.R0;
            ws0Var.setPaddingTop(dp + (wsVar != null ? (int) wsVar.c(AndroidUtilities.dp(7.0f)) : 0));
        }
    }

    public final void C(tu0 tu0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = tu0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tu0Var.getChildAt(i11);
            if (childAt instanceof c10) {
                view = childAt;
            }
        }
        if (view != null) {
            tu0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new au0(this, tu0Var, sparseBooleanArray, (c10) view, i10));
    }

    public boolean C0() {
        return false;
    }

    public final void C1(boolean z10) {
        ws0 ws0Var;
        at0 at0Var;
        O(true);
        bk0 bk0Var = this.u0;
        if (bk0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.X0 && (((ws0Var = this.a0) == null || !ws0Var.g()) && ((at0Var = this.b0) == null || !at0Var.f))) {
            f7 = Utilities.clamp(this.q0 + this.r0, 1.0f, 0.0f);
        }
        bk0Var.setAlpha(f7);
        if (z10) {
            D(h0(1.0f) > 0.5f);
        } else if (this.z0 == 2) {
            D(this.r0 > 0.1f);
        } else {
            D(this.q0 < 0.1f);
        }
    }

    public final void D(boolean z10) {
        bk0 bk0Var = this.u0;
        if (bk0Var == null || this.Y1 == z10) {
            return;
        }
        this.Y1 = z10;
        if (z10 || bk0Var.getAnimatedDrawable().a0 >= 20) {
            bk0Var.getAnimatedDrawable().P(this.Y1 ? 50 : 100);
        } else {
            bk0Var.getAnimatedDrawable().P(0);
        }
        bk0Var.getAnimatedDrawable().start();
    }

    public boolean D0() {
        return false;
    }

    public final void D1(uu0 uu0Var) {
        boolean b12 = uu0Var.h.b1();
        if (b12) {
            uu0Var.h.setSectionsDrawBackground(this.b2);
        }
        uu0Var.setDrawPageBackground((!this.b2 || b12 || uu0Var.E == 15) ? false : true);
        if (uu0Var.E != 15) {
            uu0Var.setClipToOutline(false);
            uu0Var.setBackground(null);
            uu0Var.setWallpaper(null);
            return;
        }
        Drawable drawable = uu0Var.O;
        if (drawable == null) {
            drawable = uu0Var.getBackground();
        }
        Drawable e = fi.o6.e(drawable, this.x1.getCurrentAccount(), this.l1, org.telegram.ui.ActionBar.y6.I.q());
        if (this.b2) {
            uu0Var.setBackground(null);
            uu0Var.setClipToOutline(false);
            uu0Var.setWallpaper(e);
        } else {
            uu0Var.setWallpaper(null);
            uu0Var.setBackground(e);
            uu0Var.setOutlineProvider(new ag.v0(18));
            uu0Var.setClipToOutline(true);
        }
    }

    public final void E(int i10) {
        int i11;
        uu0 d02 = d0(this.r1);
        this.s = -1;
        if (d02 != null) {
            d02.h.C0();
            this.s1 = i10;
            d02.n.setVisibility(0);
            if (w0(this.r1)) {
                d02.n.setAdapter(u1(this.r1));
            } else {
                d02.n.setAdapter(this.K);
            }
            tu0 tu0Var = d02.n;
            int paddingLeft = tu0Var.getPaddingLeft();
            tu0 tu0Var2 = d02.n;
            int g02 = g0(d02.E);
            tu0Var2.h3 = g02;
            int paddingRight = d02.n.getPaddingRight();
            tu0 tu0Var3 = d02.n;
            int f02 = f0(D0());
            tu0Var3.i3 = f02;
            tu0Var.setPadding(paddingLeft, g02, paddingRight, f02);
            d02.r.z1(i10);
            d02.n.a0();
            int i12 = 0;
            while (true) {
                uu0[] uu0VarArr = this.m0;
                if (i12 >= uu0VarArr.length) {
                    break;
                }
                uu0 uu0Var = uu0VarArr[i12];
                if (uu0Var != null && ((i11 = uu0Var.E) == 0 || w0(i11))) {
                    AndroidUtilities.updateVisibleRows(uu0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.q1 = true;
            if (this.r1 == 0) {
                this.v1[0].g(true);
            }
            this.p1 = 0.0f;
            d1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L1.lock();
            ofFloat.addUpdateListener(new ut0(this, d02, i13));
            ofFloat.addListener(new hi.b3(this, w0(d02.E) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(ds.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final void E1(uu0 uu0Var) {
        int i10 = uu0Var.E;
        boolean z10 = i10 == 0 || w0(i10);
        FrameLayout.LayoutParams h = kb1.h(-1, -1.0f, 119, z10 ? 0.0f : 12.0f, (z10 ? 8 : 12) + 48, z10 ? 0.0f : 12.0f, z10 ? 0.0f : 12.0f);
        h.topMargin = k0(uu0Var.E) + h.topMargin;
        ViewGroup.LayoutParams layoutParams = uu0Var.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == h.leftMargin && layoutParams2.topMargin == h.topMargin && layoutParams2.rightMargin == h.rightMargin && layoutParams2.bottomMargin == h.bottomMargin && layoutParams2.gravity == h.gravity) {
                return;
            }
        }
        uu0Var.s.setLayoutParams(h);
    }

    public final boolean F() {
        boolean y02 = y0();
        long j10 = this.l1;
        org.telegram.ui.ActionBar.r2 r2Var = this.x1;
        if (!y02) {
            return D0() || (r2Var != null && r2Var.getMessagesController().getStoriesController().h(j10));
        }
        TLRPC.User user = MessagesController.getInstance(r2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final boolean F0() {
        if (F() && ((getClosestTab() == 8 || getClosestTab() == 13 || E0(getClosestTab())) && this.E1)) {
            return false;
        }
        ws0 ws0Var = this.a0;
        if (ws0Var != null && ws0Var.g()) {
            return false;
        }
        at0 at0Var = this.b0;
        return ((at0Var != null && at0Var.f) || this.q1 || this.i1) ? false : true;
    }

    public final void F1(boolean z10) {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            int childCount = uu0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = uu0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                    ((org.telegram.ui.Cells.w7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.r7) {
                    ((org.telegram.ui.Cells.r7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.d2) {
                    ((org.telegram.ui.Cells.d2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) childAt).U(false, z10);
                }
            }
            i10++;
        }
    }

    public boolean G() {
        return !(this instanceof j40);
    }

    public final void G0(int i10, int i11, int i12, boolean z10) {
        qv0[] qv0VarArr = this.v1;
        qv0VarArr[i10].a.clear();
        qv0VarArr[i10].b[0].clear();
        qv0VarArr[i10].b[1].clear();
        qv0 qv0Var = qv0VarArr[i10];
        qv0Var.j[0] = i11;
        qv0Var.i[0] = false;
        qv0Var.l = false;
        qv0Var.m = i12;
        qv0Var.n = (qv0Var.e() - i12) - 1;
        qv0 qv0Var2 = qv0VarArr[i10];
        if (qv0Var2.n < 0) {
            qv0Var2.n = 0;
        }
        qv0Var2.k = i11;
        qv0Var2.o = true;
        qv0Var2.g = false;
        qv0Var2.p++;
        uu0 d02 = d0(i10);
        if (d02 != null && d02.h.getAdapter() != null) {
            d02.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i13 >= uu0VarArr.length) {
                return;
            }
            uu0 uu0Var = uu0VarArr[i13];
            if (uu0Var.E == i10) {
                uu0Var.w.h1(Math.min(qv0VarArr[i10].e() - 1, qv0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void G1(float f7) {
        org.telegram.ui.ActionBar.w0 w0Var = this.o0;
        if (w0Var == null) {
            return;
        }
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[1];
        float f10 = 0.0f;
        if (uu0Var != null && uu0Var.E == 11) {
            f10 = 0.0f + f7;
        }
        uu0 uu0Var2 = uu0VarArr[0];
        if (uu0Var2 != null && uu0Var2.E == 11) {
            f10 += 1.0f - f7;
        }
        w0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        w0Var.setScaleX(f11);
        w0Var.setScaleY(f11);
        w0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
    }

    public final boolean H() {
        uu0 uu0Var;
        uu0[] uu0VarArr = this.m0;
        if (uu0VarArr != null && (uu0Var = uu0VarArr[0]) != null) {
            boolean w02 = w0(uu0Var.E);
            int i10 = this.o1[w02 ? 1 : 0];
            if (i10 != e0(w02 ? 1 : 0, i10, true)) {
                return true;
            }
        }
        return false;
    }

    public final void H0(boolean z10) {
        long j10 = this.F;
        if (j10 != 0 || B0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = p2[i10];
            qv0[] qv0VarArr = this.v1;
            if (qv0VarArr[i11].h && !z10) {
                return;
            }
            long j11 = this.l1;
            if (DialogObject.isEncryptedDialog(j11)) {
                return;
            }
            qv0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = qv0VarArr[i11].q;
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
            org.telegram.ui.ActionBar.r2 r2Var = this.x1;
            tL_messages_getSearchResultsPositions.peer = r2Var.getMessagesController().getInputPeer(j11);
            if (j10 != 0 && r2Var.getUserConfig().getClientUserId() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = r2Var.getMessagesController().getInputPeer(j10);
            }
            final int i13 = qv0VarArr[i11].p;
            ConnectionsManager.getInstance(r2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(r2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.ur0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new bs0(bw0.this, tL_error, i13, i11, tLObject, 0));
                }
            }), r2Var.getClassGuid());
        }
    }

    public final void H1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.o0;
        if (w0Var == null) {
            return;
        }
        uu0 uu0Var = this.m0[1];
        boolean z10 = uu0Var != null && uu0Var.E == 11;
        if (z10) {
            w0Var.setVisibility(0);
        }
        w0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new d60(3, this, z10)).setDuration(420L).setInterpolator(ds.h).start();
    }

    public final boolean I() {
        uu0 uu0Var;
        uu0[] uu0VarArr = this.m0;
        if (uu0VarArr == null || (uu0Var = uu0VarArr[0]) == null) {
            return false;
        }
        if (this.m1 && w0(uu0Var.E)) {
            return false;
        }
        boolean w02 = w0(uu0VarArr[0].E);
        int i10 = this.o1[w02 ? 1 : 0];
        return i10 != e0(w02 ? 1 : 0, i10, false);
    }

    public final void I0(int i10) {
        int i11;
        int i12 = 2;
        qv0[] qv0VarArr = this.v1;
        if (i10 == 0) {
            int i13 = qv0VarArr[0].q;
            if (i13 == 1) {
                i12 = 6;
            } else if (i13 == 2) {
                i12 = 7;
            } else {
                i11 = 0;
            }
            i11 = i12;
        } else if (i10 == 1) {
            i11 = 1;
        } else {
            if (i10 != 2) {
                i12 = 4;
                if (i10 != 4) {
                    i12 = 5;
                    if (i10 != 5) {
                        i12 = 3;
                    }
                }
            }
            i11 = i12;
        }
        qv0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.r2 r2Var = this.x1;
        r2Var.getMediaDataController().loadMedia(this.l1, 50, 0, qv0VarArr[i10].k, i11, this.F, 1, r2Var.getClassGuid(), qv0VarArr[i10].p, null, null);
    }

    public final void I1() {
        boolean z10;
        di.z6 z6Var;
        boolean y02 = y0();
        org.telegram.ui.ActionBar.w0 w0Var = this.y0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.x0;
        if (y02) {
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
            if (E0(getClosestTab())) {
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
            SparseArray[] sparseArrayArr = this.b1;
            if (i10 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i10);
            iu0 iu0Var = this.e0;
            if (iu0Var != null && (z6Var = iu0Var.s) != null && !z6Var.m(messageObject.getId())) {
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

    public final void J(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        vs0 vs0Var;
        gu0 gu0Var;
        ws0 ws0Var;
        uu0[] uu0VarArr = this.m0;
        int length = uu0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            uu0 uu0Var = uu0VarArr[i10];
            if (uu0Var != null && uu0Var.getVisibility() == 0) {
                if (uu0Var.O != null) {
                    RectF rectF2 = this.i2;
                    if (jh.k.c(uu0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        uu0Var.e(canvas);
                        canvas.restore();
                    }
                }
                if (uu0Var.E == 14 && (ws0Var = this.a0) != null && ws0Var.getParent() == uu0Var) {
                    for (View view : ws0Var.h.getViewPages()) {
                        if ((view instanceof zh.m2) && view.getVisibility() == 0) {
                            zh.h2 h2Var = ((zh.m2) view).f;
                            ih.d.a(h2Var, canvas, rectF, h2Var, viewGroup);
                        }
                    }
                } else {
                    nm0 currentListView = (uu0Var.E == 12 && (gu0Var = this.V) != null && gu0Var.getParent() == uu0Var) ? gu0Var.a.x0 : (uu0Var.E == 13 && (vs0Var = this.W) != null && vs0Var.getParent() == uu0Var) ? vs0Var.getCurrentListView() : uu0Var.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        ih.d.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public int J0() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f2, code lost:
    
        if ((r9[8] <= 0) == r8.d(15)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f4, code lost:
    
        r6 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x01f7, code lost:
    
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0209, code lost:
    
        if ((r9[4] <= 0) == r8.d(4)) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J1(boolean z10) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i11;
        boolean D0;
        boolean z11;
        boolean z12;
        boolean z13;
        int selectedTab;
        int[] iArr;
        boolean z14;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        SparseArray sparseArray;
        Integer num;
        boolean z15;
        boolean z16;
        int i12;
        boolean z17;
        int i13;
        int size;
        int i14;
        SparseArray sparseArray2;
        int i15;
        Boolean bool;
        String string;
        ws0 ws0Var;
        char c10;
        boolean z18;
        Object obj;
        boolean z19;
        int i16;
        int i17;
        boolean z20;
        int i18;
        int i19;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        tv0 tv0Var;
        vt0 vt0Var = this.K0;
        if (vt0Var == null) {
            return;
        }
        boolean z21 = !this.F1.q() ? false : z10;
        boolean z22 = (this.V == null || (tv0Var = this.w1) == null || !tv0Var.f) ? false : true;
        long j10 = this.l1;
        int i20 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.r2 r2Var = this.x1;
        if (i20 <= 0 || r2Var == null) {
            i10 = 1;
            user = null;
        } else {
            i10 = 1;
            user = r2Var.getMessagesController().getUser(Long.valueOf(j10));
        }
        boolean z23 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i10 : false;
        int i21 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.g1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z23) ? 0 : i10;
        int i22 = ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && (((userFull = this.g1) != null && userFull.stories_pinned_available) || (((chatFull = this.f1) != null && chatFull.stories_pinned_available) || D0())) && v0()) ? i10 : 0;
        ws0 ws0Var2 = this.a0;
        int i23 = i21;
        boolean z24 = (ws0Var2 == null || (((userFull3 = this.g1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.f1) == null || chatFull3.stargifts_count <= 0))) ? false : i10;
        int i24 = i22;
        TLRPC.ChatFull chatFull4 = this.f1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.g1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z25 = z21;
                int i25 = this.T1 == vt0Var.n0 ? i10 : 0;
                boolean z26 = (i24 == 0 || i23 != 0) ? i10 : false;
                int i26 = i25;
                i11 = z26 == vt0Var.d(8) ? i26 + 1 : i26;
                if (z23 != vt0Var.d(13)) {
                    i11++;
                }
                if (B0() != vt0Var.d(8)) {
                    i11++;
                }
                if (z24 == vt0Var.d(14) || (ws0Var2 != null && z24 && this.S1 != ws0Var2.getLastEmojisHash())) {
                    i11++;
                }
                D0 = D0();
                int i27 = 14;
                lu0 lu0Var = this.c0;
                int[] iArr2 = this.Z0;
                if (D0) {
                    z11 = z24;
                    int i28 = i11;
                    int i29 = (lu0Var.d == null ? i10 : false) == vt0Var.d(7) ? i28 + 1 : i28;
                    if (iArr2[0] <= 0) {
                        z19 = i10;
                        i16 = 0;
                    } else {
                        z19 = false;
                        i16 = 0;
                    }
                    int i30 = i29;
                    int i31 = z19 == vt0Var.d(i16) ? i30 + 1 : i30;
                    if (iArr2[i10] <= 0) {
                        z20 = i10;
                        i17 = z20;
                    } else {
                        i17 = i10;
                        z20 = false;
                    }
                    int i32 = i31;
                    int i33 = z20 == vt0Var.d(i17) ? i32 + 1 : i32;
                    if (DialogObject.isEncryptedDialog(j10)) {
                        i18 = i33;
                    } else {
                        int i34 = i33;
                        int i35 = (iArr2[3] <= 0) == vt0Var.d(3) ? i34 + 1 : i34;
                        i18 = (iArr2[4] <= 0) == vt0Var.d(4) ? i35 + 1 : i35;
                    }
                    int i36 = i19;
                    int i37 = (iArr2[2] <= 0) == vt0Var.d(2) ? i36 + 1 : i36;
                    int i38 = (iArr2[5] <= 0) == vt0Var.d(5) ? i37 + 1 : i37;
                    int i39 = (iArr2[6] <= 0) == vt0Var.d(6) ? i38 + 1 : i38;
                    boolean z27 = !this.S.d.isEmpty();
                    int i40 = i39;
                    i11 = z27 != vt0Var.d(10) ? i40 + 1 : i40;
                    z12 = u0() && !r2Var.getMessagesController().getSavedMessagesController().unsupported && r2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                    z13 = z27;
                    if (z12 != vt0Var.d(11)) {
                        i11++;
                    }
                    if (z22 != vt0Var.d(12)) {
                        i11++;
                    }
                } else {
                    z11 = z24;
                    z12 = false;
                    z13 = false;
                }
                if (i11 > 0) {
                    if (z25) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        iArr = iArr2;
                        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(2));
                        z14 = z22;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(vt0Var.getTabsContainer(), transitionSet);
                        vt0Var.U = vt0Var.v;
                        vt0Var.V = vt0Var.w;
                    } else {
                        iArr = iArr2;
                        z14 = z22;
                    }
                    SparseArray f7 = vt0Var.f();
                    if (i11 > 3) {
                        f7 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (B0()) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        vt0Var.b0 = 420L;
                    }
                    if (i23 != 0) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                    } else if ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && ((((userFull2 = this.g1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.f1) != null && chatFull2.stories_pinned_available) || D0())) && v0())) {
                        if (x0()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            vt0Var.b0 = 420L;
                        } else {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            if (D0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            }
                        }
                    }
                    if (z11) {
                        String string2 = LocaleController.getString(R.string.ProfileGifts);
                        HashMap hashMap = zh.r2.V;
                        bi.t9 t9Var = ws0Var2.d;
                        Object obj2 = "";
                        if (t9Var == null) {
                            ws0Var = ws0Var2;
                            sparseArray = f7;
                            num = 4;
                            z15 = z23;
                            z16 = z12;
                            i12 = i20;
                        } else {
                            z15 = z23;
                            ArrayList arrayList2 = t9Var.l;
                            z16 = z12;
                            i12 = i20;
                            sparseArray = f7;
                            num = 4;
                            Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(ws0Var2.c));
                            if (!arrayList2.isEmpty()) {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                int i41 = 0;
                                while (true) {
                                    ws0Var = ws0Var2;
                                    if (arrayList3.size() >= 3 || i41 >= arrayList2.size()) {
                                        break;
                                    }
                                    TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList2.get(i41)).gift.getDocument();
                                    if (document == null) {
                                        z18 = z14;
                                    } else {
                                        z18 = z14;
                                        if (!hashSet.contains(Long.valueOf(document.id))) {
                                            hashSet.add(Long.valueOf(document.id));
                                            arrayList3.add(document);
                                        }
                                    }
                                    i41++;
                                    ws0Var2 = ws0Var;
                                    z14 = z18;
                                }
                                z17 = z14;
                                if (!arrayList3.isEmpty()) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                    for (int i42 = 0; i42 < arrayList3.size(); i42++) {
                                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i42);
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                        spannableStringBuilder2.setSpan(new c6(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                    }
                                    c10 = 0;
                                    hashMap.put(pair, spannableStringBuilder);
                                    obj2 = spannableStringBuilder;
                                    CharSequence[] charSequenceArr = new CharSequence[2];
                                    charSequenceArr[c10] = string2;
                                    charSequenceArr[1] = obj2;
                                    arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                    this.S1 = ws0Var.getLastEmojisHash();
                                }
                                c10 = 0;
                                CharSequence[] charSequenceArr2 = new CharSequence[2];
                                charSequenceArr2[c10] = string2;
                                charSequenceArr2[1] = obj2;
                                arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                                this.S1 = ws0Var.getLastEmojisHash();
                            } else if (!t9Var.i || (obj = (CharSequence) hashMap.get(pair)) == null) {
                                ws0Var = ws0Var2;
                            } else {
                                ws0Var = ws0Var2;
                                obj2 = obj;
                            }
                        }
                        z17 = z14;
                        c10 = 0;
                        CharSequence[] charSequenceArr22 = new CharSequence[2];
                        charSequenceArr22[c10] = string2;
                        charSequenceArr22[1] = obj2;
                        arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr22)));
                        this.S1 = ws0Var.getLastEmojisHash();
                    } else {
                        sparseArray = f7;
                        num = 4;
                        z15 = z23;
                        z16 = z12;
                        i12 = i20;
                        z17 = z14;
                    }
                    if (z15) {
                        arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                    }
                    if (!D0()) {
                        if (z16) {
                            arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                        }
                        if (lu0Var.d != null) {
                            arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                        }
                        if (iArr[0] > 0) {
                            if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && lu0Var.d == null) {
                                arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTabFull2)));
                            } else {
                                arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                            }
                        }
                        if (z17) {
                            arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                            MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                        }
                        if (iArr[1] > 0) {
                            arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                        }
                        if (DialogObject.isEncryptedDialog(j10)) {
                            Integer num2 = num;
                            if (iArr[4] > 0) {
                                arrayList.add(new Pair(num2, LocaleController.getString(R.string.SharedMusicTab2)));
                            }
                        } else {
                            if (iArr[3] > 0) {
                                arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                            }
                            if (iArr[4] > 0) {
                                arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMusicTab2)));
                            }
                            if (iArr[8] > 0) {
                                arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                            }
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
                            arrayList.add(new Pair(10, LocaleController.getString(i12 > 0 ? R.string.SimilarBotsTab : R.string.SimilarChannelsTab)));
                        }
                    }
                    if (vt0Var.n0) {
                        boolean z02 = z0();
                        int i43 = 0;
                        while (i43 < 15) {
                            if (l0(i43, z02) != null) {
                                Integer valueOf = Integer.valueOf(i43);
                                int i44 = 0;
                                while (true) {
                                    if (i44 >= arrayList.size()) {
                                        bool = Boolean.FALSE;
                                        break;
                                    } else {
                                        if (((Pair) arrayList.get(i44)).first == valueOf) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        i44++;
                                    }
                                }
                                if (!bool.booleanValue()) {
                                    Integer valueOf2 = Integer.valueOf(i43);
                                    if (i43 == 0) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                    } else if (i43 == 1) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedFilesTab2);
                                    } else if (i43 == 2) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedVoiceTab2);
                                    } else if (i43 == 3) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedLinksTab2);
                                    } else if (i43 == 4) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedMusicTab2);
                                    } else if (i43 == 5) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedGIFsTab2);
                                    } else if (i43 != 8) {
                                        i15 = i27;
                                        string = i43 != i15 ? null : LocaleController.getString(R.string.ProfileGifts);
                                    } else {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.ProfileStories);
                                    }
                                    arrayList.add(new Pair(valueOf2, string));
                                    i43++;
                                    i27 = i15;
                                }
                            }
                            i15 = i27;
                            i43++;
                            i27 = i15;
                        }
                    }
                    if (profileTab != null) {
                        int m0 = m0(profileTab);
                        int i45 = 0;
                        while (true) {
                            if (i45 >= arrayList.size()) {
                                i45 = -1;
                                break;
                            } else if (((Integer) ((Pair) arrayList.get(i45)).first).intValue() == m0) {
                                break;
                            } else {
                                i45++;
                            }
                        }
                        if (i45 >= 0) {
                            i13 = 0;
                            arrayList.add(0, (Pair) arrayList.remove(i45));
                            if (!arrayList.isEmpty()) {
                                this.U1 = ((Integer) ((Pair) arrayList.get(i13)).first).intValue();
                            }
                            size = arrayList.size();
                            i14 = 0;
                            while (i14 < size) {
                                Object obj3 = arrayList.get(i14);
                                i14++;
                                Pair pair2 = (Pair) obj3;
                                if (vt0Var.d(((Integer) pair2.first).intValue())) {
                                    sparseArray2 = sparseArray;
                                } else {
                                    sparseArray2 = sparseArray;
                                    vt0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, sparseArray2);
                                }
                                sparseArray = sparseArray2;
                            }
                        }
                    }
                    i13 = 0;
                    if (!arrayList.isEmpty()) {
                    }
                    size = arrayList.size();
                    i14 = 0;
                    while (i14 < size) {
                    }
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                    this.m0[0].E = selectedTab;
                }
                this.T1 = vt0Var.n0;
                vt0Var.c();
                S0();
                P();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z252 = z21;
        if (this.T1 == vt0Var.n0) {
        }
        if (i24 == 0) {
        }
        int i262 = i25;
        if (z26 == vt0Var.d(8)) {
        }
        if (z23 != vt0Var.d(13)) {
        }
        if (B0() != vt0Var.d(8)) {
        }
        if (z24 == vt0Var.d(14)) {
        }
        i11++;
        D0 = D0();
        int i272 = 14;
        lu0 lu0Var2 = this.c0;
        int[] iArr22 = this.Z0;
        if (D0) {
        }
        if (i11 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.T1 = vt0Var.n0;
        vt0Var.c();
        S0();
        P();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        bw0 bw0Var;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        uu0 d02 = d0(0);
        if (d02 != null && d02.getMeasuredHeight() > 0 && d02.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(d02.getMeasuredWidth(), d02.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.K1 = true;
                d02.h.draw(new Canvas(bitmap2));
                View view = new View(d02.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                d02.addView(view);
                bw0Var = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new ig.k0((FrameLayout) bw0Var, view, (View) d02, (Object) bitmap2, 3)).start();
                d02.h.setAlpha(0.0f);
                d02.h.animate().alpha(1.0f).setUpdateListener(new f80(d02, 21)).setDuration(200L).start();
                tv0 tv0Var = bw0Var.w1;
                int[] iArr = tv0Var.c;
                arrayList = tv0Var.n[0].a;
                qv0[] qv0VarArr = bw0Var.v1;
                qv0 qv0Var = qv0VarArr[0];
                int[] iArr2 = qv0Var.f;
                iArr2[1] = 0;
                i10 = qv0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                qv0Var.h = false;
                long j10 = bw0Var.l1;
                G0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                H0(false);
                bw0Var.F1.S();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    qv0 qv0Var2 = qv0VarArr[0];
                    int i12 = qv0Var2.q;
                    if (i12 == 0) {
                        qv0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            qv0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        qv0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        bw0Var = this;
        tv0 tv0Var2 = bw0Var.w1;
        int[] iArr3 = tv0Var2.c;
        arrayList = tv0Var2.n[0].a;
        qv0[] qv0VarArr2 = bw0Var.v1;
        qv0 qv0Var3 = qv0VarArr2[0];
        int[] iArr22 = qv0Var3.f;
        iArr22[1] = 0;
        i10 = qv0Var3.q;
        if (i10 != 0) {
        }
        qv0Var3.h = false;
        long j102 = bw0Var.l1;
        G0(0, !DialogObject.isEncryptedDialog(j102) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        H0(false);
        bw0Var.F1.S();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j102);
        while (i11 < arrayList.size()) {
        }
    }

    public final Boolean K1(View view, View view2) {
        if (this.q1) {
            return null;
        }
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var == null) {
            return null;
        }
        int i10 = uu0Var.E;
        this.r1 = i10;
        boolean w02 = w0(i10);
        int[] iArr = this.o1;
        int e02 = e0(w02 ? 1 : 0, iArr[w02 ? 1 : 0], true);
        if (view != null && e02 == e0(w02 ? 1 : 0, e02, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[w02 ? 1 : 0] != e02) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!w02) {
                SharedConfig.setMediaColumnsCount(e02);
            } else if (j0(uu0VarArr[0].E) >= 5 || E0(uu0VarArr[0].E)) {
                SharedConfig.setStoriesColumnsCount(e02);
            }
            E(e02);
        }
        return Boolean.valueOf(e02 != e0(w02 ? 1 : 0, e02, true));
    }

    public final void L() {
        vt0 vt0Var = this.K0;
        if (vt0Var.d(vt0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = vt0Var.getFirstTabId();
        vt0Var.setInitialTabId(firstTabId);
        this.m0[0].E = firstTabId;
        v1(false);
    }

    public final Boolean L1(View view, View view2) {
        if (this.q1) {
            return null;
        }
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var == null) {
            return null;
        }
        if (this.m1 && w0(uu0Var.E)) {
            return null;
        }
        int i10 = uu0VarArr[0].E;
        this.r1 = i10;
        boolean w02 = w0(i10);
        int[] iArr = this.o1;
        int e02 = e0(w02 ? 1 : 0, iArr[w02 ? 1 : 0], false);
        if (view2 != null && e02 == e0(w02 ? 1 : 0, e02, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[w02 ? 1 : 0] != e02) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!w02) {
                SharedConfig.setMediaColumnsCount(e02);
            } else if (j0(uu0VarArr[0].E) >= 5 || E0(uu0VarArr[0].E)) {
                SharedConfig.setStoriesColumnsCount(e02);
            }
            E(e02);
        }
        return Boolean.valueOf(e02 != e0(w02 ? 1 : 0, e02, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(uu0 uu0Var, nm0 nm0Var, s4.c0 c0Var) {
        int i10;
        int i11;
        boolean[] zArr;
        s4.e1 K;
        di.z6 z6Var;
        if (this.q1 || this.M1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (nm0Var.getFastScroll() == null || !nm0Var.getFastScroll().n || currentTimeMillis - uu0Var.a >= 300) {
            uu0Var.a = currentTimeMillis;
            if (this.X0 && this.W0 && uu0Var.E != 11) {
                return;
            }
            int i12 = 7;
            if (uu0Var.E == 7) {
                return;
            }
            int L0 = c0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(c0Var.N0() - L0) + 1;
            int h = nm0Var.getAdapter() == null ? 0 : nm0Var.getAdapter().h();
            int i13 = uu0Var.E;
            int[] iArr = this.o1;
            qv0[] qv0VarArr = this.v1;
            if (i13 == 0 || i13 == 1 || i13 == 2 || i13 == 4) {
                h = qv0VarArr[i13].d() + qv0VarArr[i13].a.size();
                qv0 qv0Var = qv0VarArr[i13];
                if (qv0Var.h && qv0Var.e.size() > 2 && uu0Var.E == 0 && qv0VarArr[i13].a.size() != 0) {
                    float f7 = i13 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((nm0Var.getMeasuredHeight() / (nm0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((av0) qv0VarArr[i13].e.get(1)).b) {
                        measuredHeight = ((av0) qv0VarArr[i13].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < qv0VarArr[i13].m && qv0VarArr[0].m - i10 > measuredHeight)) {
                        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(this, i13, nm0Var, 17);
                        this.M1 = g4Var;
                        AndroidUtilities.runOnUIThread(g4Var);
                        return;
                    }
                }
            }
            int i14 = uu0Var.E;
            if (i14 == 7) {
                return;
            }
            if (w0(i14)) {
                yv0 t12 = t1(uu0Var.E);
                if (t12 == null || (z6Var = t12.s) == null || L0 + abs <= z6Var.i() - iArr[1]) {
                    return;
                }
                t12.P();
                return;
            }
            int i15 = uu0Var.E;
            if (i15 == 6) {
                if (abs > 0) {
                    mu0 mu0Var = this.R;
                    boolean z10 = mu0Var.h;
                    ArrayList arrayList = mu0Var.d;
                    if (z10 || mu0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    mu0.E(mu0Var, ((TLRPC.Chat) ic.a.g(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.r2 r2Var = this.x1;
            if (i15 == 11) {
                int i16 = -1;
                for (int i17 = 0; i17 < uu0Var.h.getChildCount(); i17++) {
                    View childAt = uu0Var.h.getChildAt(i17);
                    uu0Var.h.getClass();
                    i16 = Math.max(RecyclerView.R(childAt), i16);
                }
                s4.h0 adapter = uu0Var.h.getAdapter();
                nv0 nv0Var = this.U;
                if (adapter != nv0Var) {
                    if (i16 + 1 >= r2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        r2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i16 + 1 < nv0Var.h.size() + nv0Var.e.size() || nv0Var.s || nv0Var.r) {
                        return;
                    }
                    nv0Var.r = true;
                    nv0Var.F();
                    return;
                }
            }
            if (i15 == 10 || i15 == 12 || i15 == 13 || i15 == 14) {
                return;
            }
            int i18 = i15 == 0 ? 3 : i15 == 5 ? 10 : 6;
            int i19 = i15 == 15 ? 8 : i15;
            if (abs + L0 > h - i18 || qv0VarArr[i19].o) {
                qv0 qv0Var2 = qv0VarArr[i19];
                if (!qv0Var2.g) {
                    if (i15 == 0) {
                        int i20 = qv0VarArr[0].q;
                        if (i20 == 1) {
                            i11 = 6;
                        } else {
                            if (i20 != 2) {
                                i11 = 0;
                            }
                            i11 = i12;
                        }
                        zArr = qv0Var2.i;
                        if (zArr[0]) {
                            qv0Var2.g = true;
                            r2Var.getMediaDataController().loadMedia(this.l1, 50, qv0VarArr[i19].j[0], 0, i11, this.F, 1, r2Var.getClassGuid(), qv0VarArr[i19].p, null, null);
                        } else if (this.e1 != 0 && !zArr[1]) {
                            qv0Var2.g = true;
                            r2Var.getMediaDataController().loadMedia(this.e1, 50, qv0VarArr[i19].j[1], 0, i11, this.F, 1, r2Var.getClassGuid(), qv0VarArr[i19].p, null, null);
                        }
                    } else {
                        if (i15 == 1) {
                            i11 = 1;
                        } else if (i15 == 2) {
                            i11 = 2;
                        } else {
                            i12 = 4;
                            if (i15 != 4) {
                                i11 = i15 == 5 ? 5 : i15 == 15 ? 8 : 3;
                            }
                            i11 = i12;
                        }
                        zArr = qv0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i21 = qv0VarArr[i19].m;
            if (i19 == 0) {
                i21 = this.J.L(0);
            }
            if (L0 - i21 < i18 + 1) {
                qv0 qv0Var3 = qv0VarArr[i19];
                if (!qv0Var3.g && !qv0Var3.l && !qv0Var3.o) {
                    I0(uu0Var.E);
                }
            }
            uu0 uu0Var2 = this.m0[0];
            if (uu0Var2.h == nm0Var) {
                int i22 = uu0Var2.E;
                if ((i22 != 0 && i22 != 5) || L0 == -1 || (K = nm0Var.K(L0)) == null) {
                    return;
                }
                int i23 = K.f;
                if (i23 == 0 || i23 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.x7;
                    org.telegram.ui.Cells.v0 v0Var = this.M0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.d2) {
                            v0Var.W(((org.telegram.ui.Cells.d2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                        MessageObject messageObject = x7Var.e <= 0 ? null : x7Var.b[0];
                        if (messageObject != null) {
                            v0Var.W(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public final void M0() {
        di.z6 z6Var;
        di.z6 z6Var2;
        this.J1.removeAllObservers();
        iu0 iu0Var = this.e0;
        if (iu0Var != null && (z6Var2 = iu0Var.s) != null && z6Var2 != null) {
            z6Var2.z(iu0Var.v);
        }
        us0 us0Var = this.g0;
        if (us0Var != null && (z6Var = us0Var.s) != null && z6Var != null) {
            z6Var.z(us0Var.v);
        }
        Iterator it = this.j2.values().iterator();
        while (it.hasNext()) {
            zv0 zv0Var = ((aw0) it.next()).c;
            di.z6 z6Var3 = zv0Var.s;
            if (z6Var3 != null && z6Var3 != null) {
                z6Var3.z(zv0Var.v);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N(MotionEvent motionEvent) {
        vs0 vs0Var;
        uu0[] uu0VarArr = this.m0;
        int i10 = uu0VarArr[0].E;
        if (i10 == 13 && (vs0Var = this.W) != null) {
            View currentView = vs0Var.n.getCurrentView();
            if (currentView instanceof ei.r) {
                ei.r rVar = (ei.r) currentView;
                ei.l lVar = rVar.v;
                ei.i iVar = rVar.f;
                if (rVar.a != null && rVar.getParent() != null) {
                    if (!rVar.b || rVar.K) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (rVar.L && !rVar.K && motionEvent.getPointerCount() == 2) {
                                rVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                rVar.Q = 1.0f;
                                rVar.N = motionEvent.getPointerId(0);
                                rVar.O = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) rVar.getParent();
                                rVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - rVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - rVar.getY());
                                int i11 = rVar.U;
                                Rect rect = rVar.V;
                                rVar.S = -1;
                                int top = y3 - iVar.getTop();
                                for (int i12 = 0; i12 < iVar.getChildCount(); i12++) {
                                    View childAt = iVar.getChildAt(i12);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, top)) {
                                        rVar.S = RecyclerView.S(childAt);
                                        rVar.T = childAt.getTop();
                                    }
                                }
                                rVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) rVar.getParent()).getY()) - rVar.getY() > 0.0f) {
                                    rVar.L = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (rVar.K || rVar.M)) {
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = 0; i15 < motionEvent.getPointerCount(); i15++) {
                                if (rVar.N == motionEvent.getPointerId(i15)) {
                                    i13 = i15;
                                }
                                if (rVar.O == motionEvent.getPointerId(i15)) {
                                    i14 = i15;
                                }
                            }
                            if (i13 == -1 || i14 == -1) {
                                rVar.L = false;
                                rVar.M = false;
                                rVar.K = false;
                                rVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i14) - motionEvent.getX(i13), motionEvent.getY(i14) - motionEvent.getY(i13))) / rVar.P;
                            rVar.Q = hypot;
                            if (!rVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                rVar.K = true;
                                boolean z10 = hypot > 1.0f;
                                rVar.R = z10;
                                rVar.b(z10);
                            }
                            if (rVar.K) {
                                boolean z11 = rVar.R;
                                if ((!z11 || rVar.Q >= 1.0f) && (z11 || rVar.Q <= 1.0f)) {
                                    rVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.t.y(2.0f, rVar.Q, 1.0f, 1.0f) : (1.0f - rVar.Q) / 0.5f));
                                } else {
                                    rVar.c = 0.0f;
                                }
                                float f7 = rVar.c;
                                if (f7 == 1.0f || f7 == 0.0f) {
                                    if (f7 == 1.0f) {
                                        int i16 = rVar.e;
                                        int ceil = (((int) Math.ceil(rVar.S / rVar.e)) * i16) + ((int) ((rVar.W.G.B1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i16 - 1)));
                                        if (ceil >= lVar.h()) {
                                            ceil = lVar.h() - 1;
                                        }
                                        rVar.S = ceil;
                                    }
                                    rVar.a();
                                    if (rVar.c == 0.0f) {
                                        rVar.R = !rVar.R;
                                    }
                                    rVar.b(rVar.R);
                                    rVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                iVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rVar.N == motionEvent.getPointerId(0) && rVar.O == motionEvent.getPointerId(1)) || (rVar.N == motionEvent.getPointerId(1) && rVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && rVar.K) {
                            rVar.M = false;
                            rVar.L = false;
                            rVar.K = false;
                            rVar.a();
                        }
                        return rVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || w0(i10)) && getParent() != null) {
            if (!this.q1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        uu0VarArr[0].h.I0(false);
                        uu0VarArr[0].h.cancelLongPress();
                        uu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - uu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - uu0VarArr[0].getY());
                        int i17 = this.w;
                        this.s = -1;
                        int top2 = y10 - uu0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.E == 1) {
                            top2 = 0;
                        }
                        for (int i18 = 0; i18 < uu0VarArr[0].h.getChildCount(); i18++) {
                            View childAt2 = uu0VarArr[0].h.getChildAt(i18);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i17, top2)) {
                                uu0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.F1.U() && this.s == -1) {
                            this.s = (int) (((this.o1[w0(uu0VarArr[0].E) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i17 / uu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + uu0VarArr[0].w.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - uu0VarArr[0].getY() > this.c2) {
                            this.b = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.a || this.c)) {
                    int i19 = -1;
                    int i20 = -1;
                    for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                        if (this.e == motionEvent.getPointerId(i21)) {
                            i19 = i21;
                        }
                        if (this.f == motionEvent.getPointerId(i21)) {
                            i20 = i21;
                        }
                    }
                    if (i19 == -1 || i20 == -1) {
                        this.b = false;
                        this.c = false;
                        this.a = false;
                        a0();
                        return false;
                    }
                    float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                    this.n = hypot2;
                    if (!this.a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                        this.a = true;
                        boolean z12 = hypot2 > 1.0f;
                        this.r = z12;
                        n1(z12);
                    }
                    if (this.a) {
                        boolean z13 = this.r;
                        if ((!z13 || this.n >= 1.0f) && (z13 || this.n <= 1.0f)) {
                            this.p1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.t.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.p1 = 0.0f;
                        }
                        float f10 = this.p1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            s4.h0 t12 = w0(this.r1) ? t1(this.r1) : this.J;
                            if (this.p1 == 1.0f) {
                                int i22 = this.s1;
                                int ceil2 = (((int) Math.ceil(this.s / this.s1)) * i22) + ((int) ((this.B1 / (uu0VarArr[0].h.getMeasuredWidth() - ((int) (uu0VarArr[0].h.getMeasuredWidth() / this.s1)))) * (i22 - 1)));
                                if (ceil2 >= t12.h()) {
                                    ceil2 = t12.h() - 1;
                                }
                                this.s = ceil2;
                            }
                            a0();
                            if (this.p1 == 0.0f) {
                                this.r = !this.r;
                            }
                            n1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        uu0VarArr[0].h.invalidate();
                        uu0 uu0Var = uu0VarArr[0];
                        if (uu0Var.F != null) {
                            uu0Var.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.a) {
                    this.c = false;
                    this.b = false;
                    this.a = false;
                    a0();
                }
                return this.a;
            }
            return true;
        }
        return false;
    }

    public final void N0(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null || this.q1) {
            return;
        }
        at0 at0Var = this.b0;
        if (at0Var == null || !at0Var.f) {
            int i12 = 0;
            i12 = 0;
            String str2 = null;
            if (this.E1) {
                int i13 = 8;
                if (i11 == 8 && !F()) {
                    return;
                }
                char c10 = messageObject.getDialogId() == this.l1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.b1;
                if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c10].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.c1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.c1++;
                    }
                }
                K0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    k1(false);
                } else {
                    i1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.n0.setVisibility(this.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = this.w0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.v0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    I1();
                }
                this.d1 = false;
                if (view instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.x7) {
                    ((org.telegram.ui.Cells.x7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.r7) {
                    ((org.telegram.ui.Cells.r7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    ((org.telegram.ui.Cells.d2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.w7) {
                    ((org.telegram.ui.Cells.w7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                gt0 gt0Var = this.t1;
                qv0[] qv0VarArr = this.v1;
                org.telegram.ui.ActionBar.r2 r2Var = this.x1;
                if (i11 == 0) {
                    qv0 qv0Var = qv0VarArr[i11];
                    int i14 = i10 - qv0Var.m;
                    if (i14 >= 0 && i14 < qv0Var.a.size()) {
                        PhotoViewer.v1().N2(null, r2Var, null);
                        PhotoViewer.v1().e2(qv0VarArr[i11].a, i14, this.l1, this.e1, this.F, gt0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.v1().N2(null, r2Var, null);
                    int indexOf = qv0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.v1().e2(org.telegram.messenger.t.l(messageObject), 0, 0L, 0L, 0L, gt0Var);
                    } else {
                        PhotoViewer.v1().e2(qv0VarArr[i11].a, indexOf, this.l1, this.e1, this.F, gt0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.o7) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (o7Var.G) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.v1().N2(null, r2Var, null);
                                int indexOf2 = qv0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.v1().e2(org.telegram.messenger.t.l(messageObject), 0, 0L, 0L, 0L, gt0Var);
                                    return;
                                } else {
                                    PhotoViewer.v1().e2(qv0VarArr[i11].a, indexOf2, this.l1, this.e1, this.F, gt0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, r2Var.getParentActivity(), r2Var);
                        } else if (o7Var.F) {
                            r2Var.getFileLoader().cancelLoadFile(document);
                            o7Var.f(true);
                        } else {
                            MessageObject message = o7Var.getMessage();
                            message.putInDownloadsStore = true;
                            r2Var.getFileLoader().loadFile(document, message, 0, 0);
                            o7Var.f(true);
                        }
                    }
                } else if (i11 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.I1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                                    r2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                dv.I(r2Var, messageObject, this.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.r7) view).E;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            X0(str);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (w0(i11)) {
                    yv0 t12 = t1(i11);
                    di.z6 z6Var = t12 != null ? t12.s : null;
                    if (z6Var == null) {
                        return;
                    }
                    di.y9 orCreateStoryViewer = r2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    di.q7 a2 = di.q7.a(this.m0[0].h);
                    a2.e = new tv(z6Var, 21);
                    if ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).s1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a2.s += i12;
                    orCreateStoryViewer.D(context, id2, z6Var, a2);
                }
            }
            A1();
        }
    }

    public final void O(boolean z10) {
        if (this.H == null) {
            return;
        }
        int closestTab = getClosestTab();
        boolean z11 = false;
        org.telegram.ui.ActionBar.w0 w0Var = this.p0;
        if (w0Var != null) {
            ((org.telegram.ui.ActionBar.y5) w0Var).Y(G() && (A0(closestTab) || (closestTab == 11 && u0())), z10);
        }
        org.telegram.ui.ActionBar.y5 y5Var = this.I;
        if (y5Var != null) {
            if (G() && !x0() && s0(closestTab)) {
                z11 = true;
            }
            y5Var.Y(z11, z10);
        }
    }

    public final boolean O0(MessageObject messageObject, View view, int i10, boolean z10) {
        at0 at0Var;
        final TL_stories.StoryItem storyItem;
        iu0 iu0Var;
        di.z6 z6Var;
        final int i11 = 0;
        if (!this.E1) {
            org.telegram.ui.ActionBar.r2 r2Var = this.x1;
            if (r2Var.getParentActivity() != null && messageObject != null && ((at0Var = this.b0) == null || !at0Var.f)) {
                AndroidUtilities.hideKeyboard(r2Var.getParentActivity().getCurrentFocus());
                long j10 = this.l1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(E0(getClosestTab()) || getClosestTab() == 8) || this.E1)) {
                    char c10 = messageObject.getDialogId() == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.b1;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.c1++;
                    }
                    this.n0.setVisibility(this.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = this.w0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.v0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        w0Var2.setVisibility(i12);
                    }
                    i1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.P0;
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
                    this.d1 = false;
                    if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.x7) {
                        ((org.telegram.ui.Cells.x7) view).b(i10, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.d2) {
                        ((org.telegram.ui.Cells.d2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.w7) {
                        ((org.telegram.ui.Cells.w7) view).i(true, true);
                    }
                    if (!this.E1) {
                        k1(true);
                    }
                    K0(sparseArrayArr[0]);
                    A1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                    w7Var.k(w7Var.n, w7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean E0 = E0(getClosestTab());
                    l80 I = l80.I(r2Var, view);
                    l80 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.bu0(I, 26), false);
                    J.k();
                    l80.f(J, getStoriesController().B(j10, true), hashSet, true, new kg(this, storyItem2, I, 21), new di.y2(this, hashSet, storyItem2, I, 10));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new hi.o2(I, J, 9), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.h1(this, messageObject, view, i10, 29), false);
                    final int i15 = 3;
                    if (E0) {
                        int q12 = q1(getClosestTab());
                        String w10 = getStoriesController().w(q12, j10);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new zr0(this, q12, i11), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new as0(this, q12, storyItem, w10, 0), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (iu0Var = this.e0) != null && (z6Var = iu0Var.s) != null) {
                            if (z6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.yr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                bw0 bw0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.H1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks0(bw0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(19));
                                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                                e2Var.show();
                                                e2Var.i();
                                                break;
                                            case 1:
                                                bw0 bw0Var2 = this;
                                                bw0Var2.getClass();
                                                bw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                bw0 bw0Var3 = this;
                                                bw0Var3.getClass();
                                                bw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                bw0.n(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.yr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                bw0 bw0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.H1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks0(bw0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(19));
                                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                                e2Var.show();
                                                e2Var.i();
                                                break;
                                            case 1:
                                                bw0 bw0Var2 = this;
                                                bw0Var2.getClass();
                                                bw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                bw0 bw0Var3 = this;
                                                bw0Var3.getClass();
                                                bw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                bw0.n(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.yr0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        bw0 bw0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.H1);
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks0(bw0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(19));
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                        e2Var.show();
                                        e2Var.i();
                                        break;
                                    case 1:
                                        bw0 bw0Var2 = this;
                                        bw0Var2.getClass();
                                        bw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        bw0 bw0Var3 = this;
                                        bw0Var3.getClass();
                                        bw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        bw0.n(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.yr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    bw0 bw0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.H1);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks0(bw0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(19));
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                    e2Var.show();
                                    e2Var.i();
                                    break;
                                case 1:
                                    bw0 bw0Var2 = this;
                                    bw0Var2.getClass();
                                    bw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    bw0 bw0Var3 = this;
                                    bw0Var3.getClass();
                                    bw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    bw0.n(this, storyItem);
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

    public final void P() {
        float abs;
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var == null || uu0VarArr[1] == null) {
            return;
        }
        float f7 = 0.0f;
        at0 at0Var = this.b0;
        if (at0Var != null) {
            char c10 = (!w0(uu0Var.E) || uu0VarArr[0].E == 9) ? (char) 0 : (char) 1;
            if (c10 == (uu0VarArr[1].getVisibility() == 0 ? (!w0(uu0VarArr[1].E) || uu0VarArr[1].E == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                at0Var.setTranslationX(c10 != 0 ? 0.0f : uu0VarArr[0].getMeasuredWidth());
            } else {
                at0Var.setTranslationX(uu0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(at0Var.getTranslationX()) / at0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < uu0VarArr.length; i10++) {
                if (uu0VarArr[i10].getVisibility() == 0) {
                    et0 et0Var = uu0VarArr[i10].h;
                    View childAt = et0Var.getChildCount() == 0 ? null : et0Var.getChildAt(0);
                    f10 += Utilities.clamp01(1.0f - (uu0VarArr[i10].getTranslationX() / uu0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - et0Var.getPaddingTop() : et0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f10) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            at0Var.setAlpha(clamp01);
            at0Var.setScaleX(lerp);
            at0Var.setScaleY(lerp);
            at0Var.setTranslationY(this.N1 + f10);
            f7 = abs;
        }
        R();
        if (this.X1 != f7) {
            this.X1 = f7;
            invalidate();
        }
    }

    public boolean P0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q() {
        AnimatorSet animatorSet;
        if (!this.i1) {
            return false;
        }
        boolean z10 = this.k1;
        uu0[] uu0VarArr = this.m0;
        if (!z10) {
            if (Math.abs(uu0VarArr[1].getTranslationX()) < 1.0f) {
                uu0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.j1 ? -1 : 1));
                uu0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.h1;
                if (animatorSet != null) {
                }
                this.i1 = false;
            }
            T0(getTabProgress());
            return this.i1;
        }
        if (Math.abs(uu0VarArr[0].getTranslationX()) < 1.0f) {
            uu0VarArr[0].setTranslationX(0.0f);
            uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() * (this.j1 ? 1 : -1));
            animatorSet = this.h1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.h1 = null;
            }
            this.i1 = false;
        }
        T0(getTabProgress());
        return this.i1;
    }

    public final void Q0(float f7) {
        uu0[] uu0VarArr = this.m0;
        if (f7 != 1.0f || uu0VarArr[1].getVisibility() == 0) {
            if (this.j1) {
                uu0VarArr[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() - (uu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                uu0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f7);
                uu0VarArr[1].setTranslationX((uu0VarArr[0].getMeasuredWidth() * f7) - uu0VarArr[0].getMeasuredWidth());
            }
            T0(getTabProgress());
            float h02 = h0(f7);
            this.r0 = h02;
            this.t0.setVisibility((h02 == 0.0f || !G() || x0()) ? 4 : 0);
            org.telegram.ui.ActionBar.w0 w0Var = this.p0;
            if (w0Var == null || G()) {
                this.q0 = i0(f7);
                H1();
            } else {
                setSearchItemVisibility(D0() ? 8 : 4);
                this.q0 = 0.0f;
            }
            C1(false);
            if (f7 == 1.0f) {
                uu0 uu0Var = uu0VarArr[0];
                uu0VarArr[0] = uu0VarArr[1];
                uu0VarArr[1] = uu0Var;
                uu0Var.setVisibility(8);
                if (w0Var != null && this.z0 == 2) {
                    setSearchItemVisibility(D0() ? 8 : 4);
                }
                this.z0 = 0;
                o1();
            }
        }
    }

    public final void R() {
        ws wsVar = this.R0;
        if (wsVar != null) {
            at0 at0Var = this.b0;
            float f7 = 0.0f;
            if (at0Var != null) {
                f7 = 0.0f + (at0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(at0Var.getTranslationX() / at0Var.getMeasuredWidth())));
            }
            wsVar.setTranslationY(this.N1 + f7);
        }
    }

    public final boolean S(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.E1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.b1;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.c1 = 0;
        K0(sparseArrayArr[0]);
        vs0 vs0Var = this.W;
        if (vs0Var != null) {
            vs0Var.h();
            vs0Var.j();
        }
        k1(false);
        F1(z10);
        mv0 mv0Var = this.T;
        if (mv0Var != null) {
            mv0Var.w.clear();
        }
        return true;
    }

    public void S0() {
        boolean z10 = D0() || x0();
        wv0 wv0Var = this.g0.w;
        if (wv0Var != null) {
            wv0Var.b(z10 && getClosestTab() == 9);
        }
        wv0 wv0Var2 = this.e0.w;
        if (wv0Var2 != null) {
            wv0Var2.b(z10 && getClosestTab() == 8);
        }
        for (aw0 aw0Var : this.j2.values()) {
            zv0 zv0Var = aw0Var.c;
            if (zv0Var.s != null) {
                zv0Var.w.b(z10 && getClosestTab() == aw0Var.a);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.p0;
        if (w0Var != null) {
            st0 st0Var = this.L0;
            w0Var.setSearchFieldHint(LocaleController.getString((st0Var != null && st0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        P();
        O(true);
    }

    public final org.telegram.ui.ActionBar.w0 T(Context context, int i10, int i11, String str) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.ActionBar.r5 r5Var = this.H;
        if (r5Var != null) {
            w0Var = r5Var.h().a(i10, i11);
        } else {
            int i12 = org.telegram.ui.ActionBar.y6.z8;
            int p02 = p0(i12);
            int i13 = org.telegram.ui.ActionBar.y6.y8;
            org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, p02, p0(i13), false, null);
            w0Var2.setIcon(i11);
            w0Var2.setDuplicateParentStateEnabled(false);
            this.D0.addView(w0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            this.P0.add(w0Var2);
            bk0 iconView = w0Var2.getIconView();
            org.telegram.ui.ActionBar.u6 u6Var = this.H1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.f7.t(w0Var2.getIconView(), i13, u6Var, PorterDuff.Mode.SRC_IN);
            }
            if (w0Var2.getBackground() != null) {
                Drawable background = w0Var2.getBackground();
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                w0Var2.setBackground(background);
                org.telegram.ui.ActionBar.f7.k(w0Var2, background, null, N, u6Var);
            }
            w0Var = w0Var2;
        }
        w0Var.setContentDescription(str);
        w0Var.setOnClickListener(new ai.w(this, i10, 19));
        return w0Var;
    }

    public void T0(float f7) {
        L0();
    }

    public final void U0(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        new org.telegram.ui.s61(r2Var, j10, this.o1[1], new bi.f4(this, j10, i10)).show();
    }

    public boolean V() {
        return this instanceof j40;
    }

    public final void V0(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        g5.u0(r2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new bi.ga(this, j10, i10, 8));
    }

    public final boolean W(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x9 = (-view.getX()) - getX();
        uu0[] uu0VarArr = this.m0;
        motionEvent.offsetLocation(x9 - uu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - uu0VarArr[0].getY()) - uu0VarArr[0].h.getFastScroll().getY());
        return uu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void W0(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        String w10 = getStoriesController().w(i10, j10);
        Context context = r2Var.getContext();
        org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
        j2.c cVar = new j2.c(this, j10, i10, 6);
        Pattern pattern = g5.a;
        g5.Q(context, r2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, cVar);
    }

    public final boolean X(int i10) {
        qv0[] qv0VarArr = this.w1.n;
        if (qv0VarArr == null) {
            return false;
        }
        qv0[] qv0VarArr2 = this.v1;
        if (i10 == 0) {
            qv0 qv0Var = qv0VarArr2[i10];
            if (!qv0Var.h) {
                int[] iArr = qv0Var.f;
                int[] iArr2 = qv0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = qv0VarArr2[i10].f;
            int[] iArr4 = qv0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        qv0VarArr2[i10].a.addAll(qv0VarArr[i10].a);
        qv0VarArr2[i10].c.addAll(qv0VarArr[i10].c);
        for (Map.Entry entry : qv0VarArr[i10].d.entrySet()) {
            qv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            qv0VarArr2[i10].b[i11] = qv0VarArr[i10].b[i11].clone();
            qv0 qv0Var2 = qv0VarArr2[i10];
            int[] iArr5 = qv0Var2.j;
            qv0 qv0Var3 = qv0VarArr[i10];
            iArr5[i11] = qv0Var3.j[i11];
            qv0Var2.i[i11] = qv0Var3.i[i11];
        }
        qv0VarArr2[i10].e.addAll(qv0VarArr[i10].e);
        return !qv0VarArr[i10].a.isEmpty();
    }

    public final void X0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.r2 r2Var = this.x1;
        if (shouldShowUrlInAlert) {
            g5.p0(r2Var, str, true, true);
        } else {
            qf.d.r(r2Var.getParentActivity(), str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0371  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(int i10, zu0 zu0Var) {
        zu0 zu0Var2;
        zu0 zu0Var3;
        boolean z10;
        di.z6 z6Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        vs0 vs0Var;
        vs0 vs0Var2;
        int i11;
        boolean z11;
        org.telegram.ui.ActionBar.g1 g1Var;
        zu0 zu0Var4;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        aw0 s12;
        boolean w02 = w0(i10);
        org.telegram.ui.ActionBar.r2 r2Var = this.x1;
        int currentAccount = r2Var.getCurrentAccount();
        MessagesController messagesController = MessagesController.getInstance(currentAccount);
        long j10 = this.l1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        boolean i12 = getStoriesController().i(j10);
        int i13 = 3;
        int i14 = 4;
        final int i15 = 1;
        if (E0(i10) && i12 && (s12 = s1(i10)) != null) {
            int i16 = s12.b;
            zu0Var.Z(R.drawable.menu_add_stories, new zr0(this, i16, i15), LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
            A(zu0Var, r2Var, this.l1, i16);
            zu0Var.Z(R.drawable.tabs_reorder, new zr0(this, i16, i13), LocaleController.getString(R.string.StoriesAlbumMenuReorder), false, true);
            zu0Var.Z(R.drawable.msg_delete, new zr0(this, i16, i14), LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), true, true);
            zu0Var.v();
            B(zu0Var);
            return true;
        }
        int i17 = 11;
        int i18 = 2;
        final int i19 = 0;
        if (i10 == 14) {
            ws0 ws0Var = this.a0;
            if (ws0Var != null) {
                zh.m2 currentPage = ws0Var.getCurrentPage();
                bi.t9 t9Var = currentPage == null ? null : currentPage.e;
                if (t9Var != null) {
                    long j11 = ws0Var.c;
                    int i20 = ws0Var.b;
                    boolean canUserDoAction = j11 == UserConfig.getInstance(i20).getClientUserId() ? true : j11 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i20).getChat(Long.valueOf(-j11)), 5);
                    Runnable[] runnableArr = new Runnable[1];
                    if (t9Var.c) {
                        z11 = false;
                        g1Var = null;
                    } else {
                        g1Var = zu0Var.Z(R.drawable.menu_sort_value, new u90(17, t9Var, runnableArr), LocaleController.getString(R.string.Gift2FilterSortByValue), false, false);
                        z11 = true;
                    }
                    if (ws0Var.b()) {
                        zu0Var.Z(R.drawable.menu_folder_add, new wr0(this, 10), LocaleController.getString(R.string.Gift2NewCollection), false, true);
                        z11 = true;
                    }
                    if (ws0Var.e.h()) {
                        if (!t9Var.i().isEmpty() || currentPage.d) {
                            zu0Var.Z(R.drawable.tabs_reorder, new wr0(this, i17), LocaleController.getString(R.string.Gift2Reorder), false, true);
                            zu0Var4 = zu0Var;
                        } else {
                            zu0Var4 = zu0Var;
                        }
                        z11 = true;
                    } else {
                        zu0Var4 = zu0Var;
                    }
                    if (z11) {
                        zu0Var4.v();
                    }
                    org.telegram.ui.ActionBar.g1 x9 = zu0Var4.x(LocaleController.getString(R.string.Gift2FilterUnlimited));
                    org.telegram.ui.ActionBar.g1 x10 = zu0Var4.x(LocaleController.getString(R.string.Gift2FilterLimited));
                    org.telegram.ui.ActionBar.g1 x11 = zu0Var4.x(LocaleController.getString(R.string.Gift2FilterUpgradable));
                    org.telegram.ui.ActionBar.g1 x12 = zu0Var4.x(LocaleController.getString(R.string.Gift2FilterUnique));
                    if (canUserDoAction) {
                        zu0Var4.v();
                        g1Var2 = zu0Var4.x(LocaleController.getString(R.string.Gift2FilterDisplayed));
                        g1Var3 = zu0Var4.x(LocaleController.getString(R.string.Gift2FilterHidden));
                    } else {
                        g1Var2 = null;
                        g1Var3 = null;
                    }
                    bi.t9 t9Var2 = t9Var;
                    org.telegram.messenger.bk bkVar = new org.telegram.messenger.bk(g1Var, t9Var2, x9, x10, x11, x12, canUserDoAction, g1Var2, g1Var3, 3);
                    org.telegram.ui.ActionBar.g1 g1Var4 = g1Var2;
                    org.telegram.ui.ActionBar.g1 g1Var5 = g1Var3;
                    runnableArr[0] = bkVar;
                    bkVar.run();
                    zh.r2.j(x9, t9Var2, runnableArr[0], 1);
                    zh.r2.j(x10, t9Var2, runnableArr[0], 2);
                    zh.r2.j(x11, t9Var2, runnableArr[0], 4);
                    zh.r2.j(x12, t9Var2, runnableArr[0], 8);
                    if (canUserDoAction) {
                        zh.r2.j(g1Var4, t9Var2, runnableArr[0], 256);
                        zh.r2.j(g1Var5, t9Var2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i10 == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && (vs0Var = this.W) != null) {
            int itemsCount = vs0Var.getItemsCount();
            if (itemsCount < r2Var.getMessagesController().botPreviewMediasMax) {
                i11 = 5;
                vs0Var2 = vs0Var;
                zu0Var.Z(R.drawable.msg_addbot, new wr0(this, 3), LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
            } else {
                vs0Var2 = vs0Var;
                i11 = 5;
            }
            if (itemsCount > 1 && !vs0Var2.d()) {
                zu0Var.Z(R.drawable.tabs_reorder, new wr0(this, 4), LocaleController.getString(R.string.ProfileBotReorder), false, true);
            }
            if (itemsCount > 0) {
                zu0Var.Z(R.drawable.msg_select, new wr0(this, i11), LocaleController.getString(vs0Var2.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), false, true);
            }
            if (!TextUtils.isEmpty(vs0Var2.getCurrentLang())) {
                zu0Var.Z(R.drawable.msg_delete, new wr0(this, 6), LocaleController.formatString(R.string.ProfileBotRemoveLang, g51.N(vs0Var2.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i10 == 11) {
                zu0Var.Z(R.drawable.msg_discussion, new wr0(this, 7), LocaleController.getString(R.string.SavedViewAsMessages), false, true);
                zu0Var.v();
                zu0Var.Z(R.drawable.msg_home, new wr0(this, 8), LocaleController.getString(R.string.AddShortcut), false, true);
                zu0Var.Z(R.drawable.msg_delete, new wr0(this, 9), LocaleController.getString(R.string.DeleteAll), false, true);
                return true;
            }
            if ((i10 == 8 || E0(i10)) && i12) {
                zu0Var2 = zu0Var;
                zu0Var2.Z(R.drawable.menu_album_add, new wr0(this, i15), LocaleController.getString(R.string.StoriesAlbumAddAlbum), false, true);
                zu0Var2.v();
            } else {
                zu0Var2 = zu0Var;
            }
            B(zu0Var2);
            if (!DialogObject.isEncryptedDialog(j10) && (user == null || !user.bot)) {
                zu0Var2.Z(R.drawable.msg_calendar2, new zr0(this, i10, i18), LocaleController.getString(R.string.Calendar), false, true);
                if (this.f1 == null || D0() || (chat = MessagesController.getInstance(currentAccount).getChat(Long.valueOf(this.f1.id))) == null || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    zu0Var3 = zu0Var;
                } else {
                    zu0Var3 = zu0Var;
                    zu0Var3.Z(R.drawable.msg_archive, new wr0(this, i18), LocaleController.getString(R.string.OpenChannelArchiveStories), false, true);
                }
                qv0[] qv0VarArr = this.v1;
                if (!w02) {
                    qv0 qv0Var = qv0VarArr[0];
                    if (!qv0Var.w || !qv0Var.v) {
                        boolean[] zArr = qv0Var.i;
                        if (zArr[0] && zArr[1] && qv0Var.l) {
                            z10 = false;
                            if (z10) {
                                zu0Var3.v();
                                final org.telegram.ui.ActionBar.g1 x13 = zu0Var3.x(LocaleController.getString(R.string.MediaShowPhotos));
                                final org.telegram.ui.ActionBar.g1 x14 = zu0Var3.x(LocaleController.getString(R.string.MediaShowVideos));
                                if (!w02) {
                                    int i21 = qv0VarArr[0].q;
                                    x13.setChecked(i21 == 0 || i21 == 1);
                                    int i22 = qv0VarArr[0].q;
                                    x14.setChecked(i22 == 0 || i22 == 2);
                                    x13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hs0
                                        public final /* synthetic */ bw0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i19) {
                                                case 0:
                                                    final int i23 = 1;
                                                    final bw0 bw0Var = this.b;
                                                    final org.telegram.ui.ActionBar.g1 g1Var6 = x13;
                                                    final org.telegram.ui.ActionBar.g1 g1Var7 = x14;
                                                    bw0Var.w1(g1Var6, g1Var7, new Runnable() { // from class: org.telegram.ui.Components.ms0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i23) {
                                                                case 0:
                                                                    bw0 bw0Var2 = bw0Var;
                                                                    bw0Var2.v1[0].q = (g1Var6.getCheckView().a.q && g1Var7.getCheckView().a.q) ? 0 : 1;
                                                                    bw0Var2.K();
                                                                    break;
                                                                default:
                                                                    bw0 bw0Var3 = bw0Var;
                                                                    bw0Var3.v1[0].q = (g1Var6.getCheckView().a.q && g1Var7.getCheckView().a.q) ? 0 : 2;
                                                                    bw0Var3.K();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i24 = 0;
                                                    final bw0 bw0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.g1 g1Var8 = x14;
                                                    final org.telegram.ui.ActionBar.g1 g1Var9 = x13;
                                                    bw0Var2.w1(g1Var9, g1Var8, new Runnable() { // from class: org.telegram.ui.Components.ms0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i24) {
                                                                case 0:
                                                                    bw0 bw0Var22 = bw0Var2;
                                                                    bw0Var22.v1[0].q = (g1Var8.getCheckView().a.q && g1Var9.getCheckView().a.q) ? 0 : 1;
                                                                    bw0Var22.K();
                                                                    break;
                                                                default:
                                                                    bw0 bw0Var3 = bw0Var2;
                                                                    bw0Var3.v1[0].q = (g1Var8.getCheckView().a.q && g1Var9.getCheckView().a.q) ? 0 : 2;
                                                                    bw0Var3.K();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    x14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hs0
                                        public final /* synthetic */ bw0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i15) {
                                                case 0:
                                                    final int i23 = 1;
                                                    final bw0 bw0Var = this.b;
                                                    final org.telegram.ui.ActionBar.g1 g1Var6 = x14;
                                                    final org.telegram.ui.ActionBar.g1 g1Var7 = x13;
                                                    bw0Var.w1(g1Var6, g1Var7, new Runnable() { // from class: org.telegram.ui.Components.ms0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i23) {
                                                                case 0:
                                                                    bw0 bw0Var22 = bw0Var;
                                                                    bw0Var22.v1[0].q = (g1Var6.getCheckView().a.q && g1Var7.getCheckView().a.q) ? 0 : 1;
                                                                    bw0Var22.K();
                                                                    break;
                                                                default:
                                                                    bw0 bw0Var3 = bw0Var;
                                                                    bw0Var3.v1[0].q = (g1Var6.getCheckView().a.q && g1Var7.getCheckView().a.q) ? 0 : 2;
                                                                    bw0Var3.K();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i24 = 0;
                                                    final bw0 bw0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.g1 g1Var8 = x13;
                                                    final org.telegram.ui.ActionBar.g1 g1Var9 = x14;
                                                    bw0Var2.w1(g1Var9, g1Var8, new Runnable() { // from class: org.telegram.ui.Components.ms0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i24) {
                                                                case 0:
                                                                    bw0 bw0Var22 = bw0Var2;
                                                                    bw0Var22.v1[0].q = (g1Var8.getCheckView().a.q && g1Var9.getCheckView().a.q) ? 0 : 1;
                                                                    bw0Var22.K();
                                                                    break;
                                                                default:
                                                                    bw0 bw0Var3 = bw0Var2;
                                                                    bw0Var3.v1[0].q = (g1Var8.getCheckView().a.q && g1Var9.getCheckView().a.q) ? 0 : 2;
                                                                    bw0Var3.K();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    return true;
                                }
                                final yv0 t12 = t1(i10);
                                if (t12 != null && (z6Var = t12.s) != null) {
                                    x13.setChecked(z6Var.n);
                                    x14.setChecked(t12.s.o);
                                }
                                final int i23 = 0;
                                x13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gs0
                                    public final /* synthetic */ bw0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i23) {
                                            case 0:
                                                final int i24 = 1;
                                                final yv0 yv0Var = t12;
                                                final org.telegram.ui.ActionBar.g1 g1Var6 = x13;
                                                final org.telegram.ui.ActionBar.g1 g1Var7 = x14;
                                                this.b.w1(g1Var6, g1Var7, new Runnable() { // from class: org.telegram.ui.Components.is0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        di.z6 z6Var2;
                                                        di.z6 z6Var3;
                                                        switch (i24) {
                                                            case 0:
                                                                yv0 yv0Var2 = yv0Var;
                                                                if (yv0Var2 != null && (z6Var2 = yv0Var2.s) != null) {
                                                                    boolean z12 = g1Var6.getCheckView().a.q;
                                                                    boolean z13 = g1Var7.getCheckView().a.q;
                                                                    z6Var2.n = z12;
                                                                    z6Var2.o = z13;
                                                                    z6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                yv0 yv0Var3 = yv0Var;
                                                                if (yv0Var3 != null && (z6Var3 = yv0Var3.s) != null) {
                                                                    boolean z14 = g1Var6.getCheckView().a.q;
                                                                    boolean z15 = g1Var7.getCheckView().a.q;
                                                                    z6Var3.n = z14;
                                                                    z6Var3.o = z15;
                                                                    z6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i25 = 0;
                                                final yv0 yv0Var2 = t12;
                                                final org.telegram.ui.ActionBar.g1 g1Var8 = x14;
                                                final org.telegram.ui.ActionBar.g1 g1Var9 = x13;
                                                this.b.w1(g1Var9, g1Var8, new Runnable() { // from class: org.telegram.ui.Components.is0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        di.z6 z6Var2;
                                                        di.z6 z6Var3;
                                                        switch (i25) {
                                                            case 0:
                                                                yv0 yv0Var22 = yv0Var2;
                                                                if (yv0Var22 != null && (z6Var2 = yv0Var22.s) != null) {
                                                                    boolean z12 = g1Var8.getCheckView().a.q;
                                                                    boolean z13 = g1Var9.getCheckView().a.q;
                                                                    z6Var2.n = z12;
                                                                    z6Var2.o = z13;
                                                                    z6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                yv0 yv0Var3 = yv0Var2;
                                                                if (yv0Var3 != null && (z6Var3 = yv0Var3.s) != null) {
                                                                    boolean z14 = g1Var8.getCheckView().a.q;
                                                                    boolean z15 = g1Var9.getCheckView().a.q;
                                                                    z6Var3.n = z14;
                                                                    z6Var3.o = z15;
                                                                    z6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                        }
                                    }
                                });
                                final int i24 = 1;
                                x14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gs0
                                    public final /* synthetic */ bw0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i24) {
                                            case 0:
                                                final int i242 = 1;
                                                final yv0 yv0Var = t12;
                                                final org.telegram.ui.ActionBar.g1 g1Var6 = x14;
                                                final org.telegram.ui.ActionBar.g1 g1Var7 = x13;
                                                this.b.w1(g1Var6, g1Var7, new Runnable() { // from class: org.telegram.ui.Components.is0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        di.z6 z6Var2;
                                                        di.z6 z6Var3;
                                                        switch (i242) {
                                                            case 0:
                                                                yv0 yv0Var22 = yv0Var;
                                                                if (yv0Var22 != null && (z6Var2 = yv0Var22.s) != null) {
                                                                    boolean z12 = g1Var6.getCheckView().a.q;
                                                                    boolean z13 = g1Var7.getCheckView().a.q;
                                                                    z6Var2.n = z12;
                                                                    z6Var2.o = z13;
                                                                    z6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                yv0 yv0Var3 = yv0Var;
                                                                if (yv0Var3 != null && (z6Var3 = yv0Var3.s) != null) {
                                                                    boolean z14 = g1Var6.getCheckView().a.q;
                                                                    boolean z15 = g1Var7.getCheckView().a.q;
                                                                    z6Var3.n = z14;
                                                                    z6Var3.o = z15;
                                                                    z6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i25 = 0;
                                                final yv0 yv0Var2 = t12;
                                                final org.telegram.ui.ActionBar.g1 g1Var8 = x13;
                                                final org.telegram.ui.ActionBar.g1 g1Var9 = x14;
                                                this.b.w1(g1Var9, g1Var8, new Runnable() { // from class: org.telegram.ui.Components.is0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        di.z6 z6Var2;
                                                        di.z6 z6Var3;
                                                        switch (i25) {
                                                            case 0:
                                                                yv0 yv0Var22 = yv0Var2;
                                                                if (yv0Var22 != null && (z6Var2 = yv0Var22.s) != null) {
                                                                    boolean z12 = g1Var8.getCheckView().a.q;
                                                                    boolean z13 = g1Var9.getCheckView().a.q;
                                                                    z6Var2.n = z12;
                                                                    z6Var2.o = z13;
                                                                    z6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                yv0 yv0Var3 = yv0Var2;
                                                                if (yv0Var3 != null && (z6Var3 = yv0Var3.s) != null) {
                                                                    boolean z14 = g1Var8.getCheckView().a.q;
                                                                    boolean z15 = g1Var9.getCheckView().a.q;
                                                                    z6Var3.n = z14;
                                                                    z6Var3.o = z15;
                                                                    z6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                        }
                    }
                }
                z10 = true;
                if (z10) {
                }
            }
        }
        return true;
    }

    public int Y0() {
        return -1;
    }

    public final void Z(int i10, nm0 nm0Var, boolean z10) {
        ArrayList arrayList = this.v1[i10].e;
        int L0 = ((s4.c0) nm0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            av0 av0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((av0) arrayList.get(i11)).b) {
                        av0Var = (av0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (av0Var == null) {
                    av0Var = (av0) ic.a.g(1, arrayList);
                }
            }
            if (av0Var != null) {
                G0(i10, av0Var.d, av0Var.b + 1, z10);
            }
        }
    }

    public final void Z0(ArrayList arrayList, boolean z10) {
        iu0 iu0Var = this.e0;
        if (iu0Var == null || iu0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.x1;
        if (z10 && arrayList.size() > r2Var.getMessagesController().storiesPinnedToTopCountMax) {
            wc.b0(r2Var).R(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", r2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        di.z6 z6Var = iu0Var.s;
        int i10 = z6Var.c;
        ArrayList arrayList2 = z6Var.g;
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
                z6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(z6Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new di.d6(2));
            }
            z11 = z12;
        }
        if (z11) {
            wc.b0(r2Var).R(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", r2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            wc.b0(r2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            wc.b0(r2Var).R(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
        }
    }

    public final void a0() {
        uu0[] uu0VarArr;
        uu0 uu0Var;
        int i10;
        s4.h0 adapter;
        if (this.q1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                uu0VarArr = this.m0;
                if (i12 >= uu0VarArr.length) {
                    uu0Var = null;
                    break;
                }
                uu0Var = uu0VarArr[i12];
                if (uu0Var.E == this.r1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (uu0Var != null) {
                boolean w02 = w0(uu0Var.E);
                float f7 = this.p1;
                qv0[] qv0VarArr = this.v1;
                if (f7 != 1.0f) {
                    if (f7 == 0.0f) {
                        this.q1 = false;
                        if (this.r1 == 0) {
                            qv0VarArr[0].g(false);
                        }
                        uu0Var.n.setVisibility(8);
                        uu0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f7 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new ut0(this, uu0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.zi(this, z10, w02 ? 1 : 0, uu0Var));
                    ofFloat.setInterpolator(ds.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.q1 = false;
                int i13 = this.s1;
                int[] iArr = this.o1;
                iArr[w02 ? 1 : 0] = i13;
                if (!w02) {
                    SharedConfig.setMediaColumnsCount(i13);
                } else if (j0(uu0Var.E) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.s1);
                }
                for (int i14 = 0; i14 < uu0VarArr.length; i14++) {
                    uu0 uu0Var2 = uu0VarArr[i14];
                    if (uu0Var2 != null && uu0Var2.h != null && (((i10 = uu0Var2.E) == 0 || w0(i10)) && (adapter = uu0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            qv0VarArr[0].g(false);
                        }
                        uu0VarArr[i14].n.setVisibility(8);
                        uu0VarArr[i14].w.z1(iArr[w02 ? 1 : 0]);
                        uu0VarArr[i14].h.a0();
                        uu0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(uu0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    d1();
                    return;
                }
                while (i11 < uu0VarArr.length) {
                    uu0 uu0Var3 = uu0VarArr[i11];
                    if (uu0Var3.E == this.r1) {
                        View m10 = uu0Var3.r.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        uu0 uu0Var4 = uu0VarArr[i11];
                        uu0Var4.w.h1(this.s, (-uu0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final boolean a1(MotionEvent motionEvent, boolean z10) {
        uu0 uu0Var;
        vs0 vs0Var;
        int closestTab = getClosestTab();
        vt0 vt0Var = this.K0;
        int i10 = -1;
        int i11 = vt0Var.O.get(vt0Var.n + (z10 ? 1 : -1), -1);
        at0 at0Var = this.b0;
        if (at0Var != null) {
            if (E0(closestTab) || closestTab == 8) {
                u91 u91Var = at0Var.b;
                i10 = u91Var.b0.get(u91Var.F + (z10 ? 1 : -1), -1);
            } else if (E0(i11) || i11 == 8) {
                i10 = at0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = r1(i10).a;
            }
        }
        if (i11 >= 0) {
            if (this.p0 == null || G()) {
                this.q0 = i0(0.0f);
                G1(0.0f);
            } else {
                setSearchItemVisibility(D0() ? 8 : 4);
                this.q0 = 0.0f;
            }
            if ((!this.X0 || getSelectedTab() != 11) && (!F() || !this.E1 || (getClosestTab() != 8 && !E0(getClosestTab())))) {
                uu0[] uu0VarArr = this.m0;
                uu0 uu0Var2 = uu0VarArr[0];
                if (uu0Var2 != null && uu0Var2.E == 13 && (vs0Var = this.W) != null) {
                    ei.a aVar = vs0Var.n;
                    if (!z10) {
                    }
                }
                uu0 uu0Var3 = uu0VarArr[0];
                ws0 ws0Var = this.a0;
                if (uu0Var3 != null && uu0Var3.E == 14 && ws0Var != null) {
                    zh.v1 v1Var = ws0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.E1 || (uu0Var = uu0VarArr[0]) == null || uu0Var.E != 13) && ((ws0Var == null || !ws0Var.g()) && (at0Var == null || !at0Var.f))) {
                    C1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    t0();
                    this.A1 = false;
                    this.z1 = true;
                    this.B1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    vt0Var.setEnabled(false);
                    uu0 uu0Var4 = uu0VarArr[1];
                    uu0Var4.E = i11;
                    uu0Var4.setVisibility(0);
                    this.j1 = z10;
                    v1(true);
                    if (z10) {
                        uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth());
                    } else {
                        uu0VarArr[1].setTranslationX(-uu0VarArr[0].getMeasuredWidth());
                    }
                    T0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ih));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.wc));
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return false;
    }

    public final void b0(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                this.C0.setTextSize(20);
            } else {
                this.C0.setTextSize(18);
            }
        }
        if (i10 == 0) {
            this.J.l();
        }
    }

    public final String c0(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        vs0 vs0Var;
        if (!y0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (vs0Var = this.W) != null) {
            return vs0Var.getBotPreviewsSubtitle();
        }
        iu0 iu0Var = this.e0;
        if (iu0Var == null || iu0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < iu0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) iu0Var.s.i.get(i12);
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

    public final void c1(s4.h0 h0Var) {
        if (h0Var instanceof vv0) {
            ArrayList arrayList = this.G0;
            ArrayList arrayList2 = this.H0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (h0Var == this.O) {
            ArrayList arrayList3 = this.I0;
            ArrayList arrayList4 = this.J0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        jv0 jv0Var = this.P;
        if (h0Var == jv0Var) {
            jv0Var.r = null;
        }
    }

    public final uu0 d0(int i10) {
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 >= uu0VarArr.length) {
                return null;
            }
            uu0 uu0Var = uu0VarArr[i11];
            if (uu0Var != null && uu0Var.E == i10) {
                return uu0Var;
            }
            i11++;
        }
    }

    public final void d1() {
        int i10;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 >= uu0VarArr.length) {
                return;
            }
            et0 et0Var = uu0VarArr[i11].h;
            if (et0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < et0Var.getChildCount(); i14++) {
                    View childAt = et0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.w7) {
                        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                        int messageId = w7Var.getMessageId();
                        i13 = w7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.o7) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                        int id2 = o7Var.getMessage().getId();
                        i13 = o7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.n7) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                        i12 = n7Var.getMessage().getId();
                        i13 = n7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = uu0VarArr[i11].E;
                    int i16 = -1;
                    if (w0(i15)) {
                        yv0 t12 = t1(i15);
                        if (t12 != null && t12.s != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= t12.s.i.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) t12.s.i.get(i17)).getId()) {
                                    i16 = i17;
                                    break;
                                }
                                i17++;
                            }
                        }
                        i10 = i16;
                    } else if (i15 >= 0) {
                        qv0[] qv0VarArr = this.v1;
                        if (i15 < qv0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= qv0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) qv0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = qv0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((s4.c0) et0Var.getLayoutManager()).h1(i10, (-uu0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.q1) {
                            uu0 uu0Var = uu0VarArr[i11];
                            uu0Var.r.h1(i10, (-uu0Var.h.getPaddingTop()) + i13);
                        }
                    }
                }
            }
            i11++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v34 */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        et0 et0Var;
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
        et0 et0Var2;
        int i16;
        int i17;
        et0 et0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        s4.h0 h0Var2 = this.Q;
        s4.h0 h0Var3 = this.O;
        pv0 pv0Var = this.L;
        s4.h0 h0Var4 = this.N;
        s4.h0 h0Var5 = this.M;
        org.telegram.ui.ActionBar.r2 r2Var = this.x1;
        jv0 jv0Var = this.P;
        fu0 fu0Var = this.J;
        long j10 = this.l1;
        uu0[] uu0VarArr = this.m0;
        qv0[] qv0VarArr = this.v1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != r2Var.getClassGuid() || intValue2 != qv0VarArr[intValue3].p) {
                if (this.w1 == null || !qv0VarArr[intValue3].a.isEmpty() || qv0VarArr[intValue3].o || !X(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    h0Var2 = fu0Var;
                } else if (intValue3 == 1) {
                    h0Var2 = h0Var5;
                } else if (intValue3 == 2) {
                    h0Var2 = h0Var4;
                } else if (intValue3 == 3) {
                    h0Var2 = pv0Var;
                } else if (intValue3 == 4) {
                    h0Var2 = h0Var3;
                } else if (intValue3 != 5) {
                    h0Var2 = intValue3 == 15 ? jv0Var : null;
                }
                if (h0Var2 != null) {
                    for (int i19 = 0; i19 < uu0VarArr.length; i19++) {
                        uu0 uu0Var = uu0VarArr[i19];
                        if (uu0Var != null && (et0Var2 = uu0Var.h) != null && et0Var2.getAdapter() == h0Var2) {
                            uu0VarArr[i19].h.C0();
                        }
                    }
                    h0Var2.l();
                }
                this.d1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
            int i20 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                qv0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                h0Var2 = fu0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                h0Var2 = h0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                h0Var2 = h0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                h0Var2 = pv0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                h0Var2 = h0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                h0Var2 = jv0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                h0Var2 = null;
            }
            int size2 = qv0VarArr[i16].a.size();
            if (h0Var2 != null) {
                i17 = h0Var2.h();
                if (h0Var2 instanceof im0) {
                    ((im0) h0Var2).L();
                }
            } else {
                i17 = 0;
            }
            qv0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (qv0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        qv0 qv0Var = qv0VarArr[i16];
                        int i21 = qv0Var.m - r13;
                        qv0Var.m = i21;
                        if (i21 < 0) {
                            qv0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                qv0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                qv0 qv0Var2 = qv0VarArr[i16];
                if (qv0Var2.l) {
                    qv0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (qv0VarArr[i16].a(messageObject3, i20, r12, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        qv0 qv0Var3 = qv0VarArr[i16];
                        int i23 = qv0Var3.n - 1;
                        qv0Var3.n = i23;
                        if (i23 < 0) {
                            qv0Var3.n = r12;
                        }
                    }
                    i22++;
                    r12 = 0;
                }
                qv0 qv0Var4 = qv0VarArr[i16];
                if (qv0Var4.o && qv0Var4.a.size() > 0) {
                    qv0 qv0Var5 = qv0VarArr[i16];
                    qv0Var5.k = ((MessageObject) qv0Var5.a.get(0)).getId();
                }
                qv0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                qv0 qv0Var6 = qv0VarArr[i16];
                if (qv0Var6.i[i20]) {
                    int size4 = qv0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += qv0VarArr[i16].m;
                    }
                    qv0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                qv0 qv0Var7 = qv0VarArr[i16];
                if (qv0Var7.i[i20] && this.e1 != 0) {
                    qv0Var7.g = true;
                    r2Var.getMediaDataController().loadMedia(this.e1, 50, qv0VarArr[i16].j[1], 0, i16, this.F, 1, r2Var.getClassGuid(), qv0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (h0Var2 != null) {
                tu0 tu0Var = null;
                for (int i25 = 0; i25 < uu0VarArr.length; i25++) {
                    uu0 uu0Var2 = uu0VarArr[i25];
                    if (uu0Var2 != null && (et0Var3 = uu0Var2.h) != null && et0Var3.getAdapter() == h0Var2) {
                        tu0 tu0Var2 = uu0VarArr[i25].h;
                        tu0Var2.C0();
                        tu0Var = tu0Var2;
                    }
                }
                int h = h0Var2.h();
                if (h0Var2 != fu0Var) {
                    try {
                        h0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (fu0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(tu0Var);
                } else {
                    fu0Var.l();
                }
                if (!qv0VarArr[i24].a.isEmpty() || qv0VarArr[i24].g) {
                    if (tu0Var != null && (h0Var2 == fu0Var || h >= i17)) {
                        C(tu0Var, i17, sparseBooleanArray);
                    }
                } else if (tu0Var != null) {
                    C(tu0Var, i17, sparseBooleanArray);
                }
                if (tu0Var != null && !qv0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (uu0VarArr[i26].E == 0) {
                                ((s4.c0) tu0Var.getLayoutManager()).h1(fu0Var.L(0), 0);
                            }
                        }
                    } else {
                        d1();
                    }
                }
            }
            qv0 qv0Var8 = qv0VarArr[i24];
            if (qv0Var8.o) {
                if (qv0Var8.a.size() == 0) {
                    I0(i24);
                } else {
                    qv0VarArr[i24].o = false;
                }
            }
            this.d1 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j10) ? r2Var.getMessagesController().getChat(Long.valueOf(-j10)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (longValue2 == 0 && this.e1 != 0) {
                    i14 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i27 = -1;
                    i15 = 0;
                    z12 = false;
                    while (i15 < size) {
                        fu0 fu0Var2 = fu0Var;
                        int i28 = 0;
                        while (i28 < qv0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (qv0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        fu0Var = fu0Var2;
                    }
                    fu0 fu0Var3 = fu0Var;
                    if (z12) {
                        this.d1 = true;
                        if (fu0Var3 != null) {
                            fu0Var3.l();
                        }
                        if (h0Var5 != null) {
                            h0Var5.l();
                        }
                        if (h0Var4 != null) {
                            h0Var4.l();
                        }
                        if (pv0Var != null) {
                            pv0Var.X(false);
                        }
                        if (h0Var3 != null) {
                            h0Var3.l();
                        }
                        if (jv0Var != null) {
                            jv0Var.l();
                        }
                        if (h0Var2 != null) {
                            h0Var2.l();
                        }
                        if (i27 == 0 || i27 == 1 || i27 == 2 || i27 == 4) {
                            H0(true);
                        }
                    }
                    d0(i27);
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
            fu0 fu0Var32 = fu0Var;
            if (z12) {
            }
            d0(i272);
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j10) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
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
                        qv0 qv0Var9 = qv0VarArr[mediaType];
                        if (qv0Var9.l) {
                            z11 = z13;
                            if (qv0Var9.a(messageObject4, messageObject4.getDialogId() == j10 ? 0 : 1, true, isEncryptedDialog2)) {
                                this.Z0[mediaType] = 1;
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
                boolean z15 = true;
                if (z14) {
                    this.d1 = true;
                    int i30 = 0;
                    while (i30 < uu0VarArr.length) {
                        int i31 = uu0VarArr[i30].E;
                        if (i31 == 0) {
                            h0Var = fu0Var;
                        } else if (i31 == z15) {
                            h0Var = h0Var5;
                        } else if (i31 == 2) {
                            h0Var = h0Var4;
                        } else if (i31 == 3) {
                            h0Var = pv0Var;
                        } else {
                            if (i31 == 4) {
                                h0Var = h0Var3;
                            } else if (i31 == 5) {
                                h0Var = h0Var2;
                            } else {
                                h0Var = i31 == 15 ? jv0Var : null;
                                if (h0Var != null) {
                                    h0Var.h();
                                    fu0Var.l();
                                    h0Var5.l();
                                    h0Var4.l();
                                    pv0Var.X(false);
                                    h0Var3.l();
                                    jv0Var.l();
                                    h0Var2.l();
                                }
                                i30++;
                                z15 = true;
                            }
                            if (h0Var != null) {
                            }
                            i30++;
                            z15 = true;
                        }
                        if (h0Var != null) {
                        }
                        i30++;
                        z15 = true;
                    }
                    J1(z15);
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
            if (l4.longValue() == j10 || l4.longValue() == this.e1) {
                int i32 = l4.longValue() == j10 ? 0 : 1;
                for (qv0 qv0Var10 : qv0VarArr) {
                    qv0Var10.f(i32, num.intValue(), num2.intValue());
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
                for (int i33 = 0; i33 < uu0VarArr.length; i33++) {
                    int childCount = uu0VarArr[i33].h.getChildCount();
                    for (int i34 = 0; i34 < childCount; i34++) {
                        View childAt = uu0VarArr[i33].h.getChildAt(i34);
                        if (childAt instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                            if (n7Var.getMessage() != null) {
                                n7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i35 = 0; i35 < uu0VarArr.length; i35++) {
                uu0 uu0Var3 = uu0VarArr[i35];
                if (uu0Var3 != null && (et0Var = uu0Var3.h) != null) {
                    int childCount2 = et0Var.getChildCount();
                    for (int i36 = 0; i36 < childCount2; i36++) {
                        View childAt2 = uu0VarArr[i35].h.getChildAt(i36);
                        if (childAt2 instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var2 = (org.telegram.ui.Cells.n7) childAt2;
                            if (n7Var2.getMessage() != null) {
                                n7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            di.z6 z6Var = (di.z6) objArr[0];
            iu0 iu0Var = this.e0;
            if (iu0Var == null || z6Var != iu0Var.s) {
                us0 us0Var = this.g0;
                if (us0Var == null || z6Var != us0Var.s) {
                    Iterator it = this.j2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        aw0 aw0Var = (aw0) it.next();
                        if (aw0Var.c.s == z6Var) {
                            i12 = aw0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            uu0 d02 = d0(i12);
            if (d02 != null) {
                if (d02.b != (z6Var.g() > 0)) {
                    d02.b = z6Var.g() > 0;
                    z1(d02, true);
                }
            }
            if (d02 != null) {
                AndroidUtilities.notifyDataSetChanged(d02.h);
                if (d02.h.getLayoutManager() instanceof s4.c0) {
                    nm0 nm0Var = d02.h;
                    M(d02, nm0Var, (s4.c0) nm0Var.getLayoutManager());
                }
            }
            nu0 nu0Var = this.F1;
            if (nu0Var != null) {
                nu0Var.S();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (uu0 uu0Var4 : uu0VarArr) {
                if (uu0Var4 != null && uu0Var4.h != null && w0(uu0Var4.E)) {
                    if (!y0() || uu0Var4.h.getAdapter() == null) {
                        for (int i37 = 0; i37 < uu0Var4.h.getChildCount(); i37++) {
                            View childAt3 = uu0Var4.h.getChildAt(i37);
                            if (childAt3 instanceof org.telegram.ui.Cells.w7) {
                                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt3;
                                r6 r6Var = w7Var.N;
                                if (!w7Var.d0 || (messageObject = w7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    w7Var.L = false;
                                    r6Var.t("", false, true);
                                } else {
                                    int i38 = storyViews.views_count;
                                    w7Var.L = i38 > 0;
                                    r6Var.t(AndroidUtilities.formatWholeNumber(i38, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(uu0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.S.E(true);
                J1(true);
                L();
                return;
            }
            return;
        }
        int i39 = NotificationCenter.savedMessagesDialogsUpdate;
        mv0 mv0Var = this.T;
        if (i10 == i39) {
            if (j10 == 0 || j10 == r2Var.getUserConfig().getClientUserId()) {
                mv0Var.F(true);
                J1(true);
                L();
                S0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            mv0Var.F(true);
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                J1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatRanks) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j10 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            lu0 lu0Var = this.c0;
            if (lu0Var != null) {
                TLRPC.ChatFull chatFull = lu0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i40 = 0; i40 < lu0Var.d.participants.participants.size(); i40++) {
                        lu0Var.d.participants.participants.get(i40).setRank(longValue4, str);
                    }
                }
                for (uu0 uu0Var5 : uu0VarArr) {
                    if (uu0Var5.E == 7) {
                        AndroidUtilities.updateVisibleRows(uu0Var5.h);
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
            for (int i41 = 0; i41 < uu0VarArr.length; i41++) {
                if (uu0VarArr[i41].h.getAdapter() == jv0Var) {
                    et0 et0Var4 = uu0VarArr[i41].h;
                    ArrayList arrayList6 = jv0Var.n;
                    for (int i42 = 0; i42 < arrayList6.size(); i42++) {
                        MessageObject messageObject5 = (MessageObject) arrayList6.get(i42);
                        if (messageObject5 != null && messageObject5.getPollId() == longValue5) {
                            TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                                jv0Var.m(i42);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vt0 vt0Var = this.K0;
        if (vt0Var != null) {
            canvas.save();
            canvas.translate(vt0Var.getX(), vt0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        qt0 qt0Var = this.T0;
        if (qt0Var != null) {
            int i10 = qt0Var.U;
            if ((i10 == 3 || i10 == 1) && this.R0 == null) {
                canvas.save();
                canvas.translate(qt0Var.getX(), qt0Var.getY());
                qt0Var.setDrawOverlay(true);
                qt0Var.draw(canvas);
                qt0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (this.b2 && (view instanceof uu0) && this.f2 < this.d2) {
            canvas.save();
            canvas.clipRect(0, -this.f2, getWidth(), getHeight() + this.e2);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        if (view != this.T0 || this.R0 != null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        uu0[] uu0VarArr = this.m0;
        float top = uu0VarArr[0].getTop();
        at0 at0Var = this.b0;
        if (at0Var != null && ((i10 = uu0VarArr[0].E) == 8 || E0(i10))) {
            top -= at0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(org.telegram.ui.Cells.p2 p2Var) {
        org.telegram.ui.ActionBar.r2 r2Var = this.x1;
        if (r2Var != null && r2Var.getMessagesController().getStoriesController().K(p2Var.getDialogId())) {
            r2Var.getOrCreateStoryViewer().getClass();
            di.y9 orCreateStoryViewer = r2Var.getOrCreateStoryViewer();
            Context context = r2Var.getContext();
            long dialogId = p2Var.getDialogId();
            di.q7 a2 = di.q7.a((nm0) p2Var.getParent());
            a2.s += ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.E(context, dialogId, a2);
        }
    }

    public final int e0(int i10, int i11, boolean z10) {
        int i12 = i11 + (!z10 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z10 ? 9 : 6;
        }
        return Utilities.clamp(i12, 9, (this.m1 && i10 == 1) ? 1 : 2);
    }

    public final void e1(int i10) {
        vt0 vt0Var;
        if (this.O1 || (vt0Var = this.K0) == null) {
            return;
        }
        vt0Var.g(null, i10, vt0Var.P.get(i10));
    }

    public final int f0(boolean z10) {
        return this.a2 + this.e2 + (z10 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void f1(float f7, int i10) {
        vt0 vt0Var = this.K0;
        if (vt0Var != null) {
            vt0Var.i(f7, E0(i10) ? 8 : i10);
        }
        at0 at0Var = this.b0;
        if (at0Var != null) {
            u91 u91Var = at0Var.b;
            if (E0(i10)) {
                u91Var.f(f7, q1(i10));
            } else if (i10 == 8) {
                u91Var.f(f7, 0);
            }
        }
    }

    public final int g0(int i10) {
        return k0(i10) + AndroidUtilities.dp(54.0f) + this.c2 + this.d2 + this.m2 + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void g1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 >= uu0VarArr.length) {
                if (this.F == 0) {
                    lu0 lu0Var = this.c0;
                    lu0Var.d = chatFull;
                    lu0Var.e = arrayList;
                }
                J1(true);
                for (int i11 = 0; i11 < uu0VarArr.length; i11++) {
                    uu0 uu0Var = uu0VarArr[i11];
                    if (uu0Var.E == 7 && uu0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(uu0VarArr[i11].h);
                    }
                }
                return;
            }
            uu0 uu0Var2 = uu0VarArr[i10];
            if (uu0Var2.E == 7 && uu0Var2.h.getAdapter() != null && uu0VarArr[i10].h.getAdapter().h() != 0 && this.x1.getMessagesController().getStoriesController().j.size() > 0) {
                return;
            } else {
                i10++;
            }
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.b1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        uu0 uu0Var;
        uu0 uu0Var2;
        di.z6 z6Var;
        di.z6 z6Var2;
        float f7 = 1.0f;
        uu0[] uu0VarArr = this.m0;
        if (uu0VarArr == null || (uu0Var = uu0VarArr[0]) == null || (uu0Var2 = uu0VarArr[1]) == null || uu0Var.v == null || uu0Var2.v == null) {
            return 1.0f;
        }
        int i10 = uu0Var.E;
        int i11 = uu0Var2.E;
        boolean z10 = E0(i10) || i10 == 8;
        boolean z11 = E0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - uu0VarArr[0].v.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - uu0VarArr[1].v.getVisibilityFactor();
        yv0 t12 = t1(uu0VarArr[0].E);
        if (i10 == 8 || (t12 != null && (z6Var2 = t12.s) != null && z6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        yv0 t13 = t1(i11);
        if (i11 != 8 && (t13 == null || (z6Var = t13.s) == null || z6Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(uu0VarArr[0].getTranslationX() / uu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[1];
        if (uu0Var != null && uu0Var.getVisibility() == 0) {
            if (this.i1 && !this.k1) {
                return uu0VarArr[1].E;
            }
            if (Math.abs(uu0VarArr[1].getTranslationX()) < uu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return uu0VarArr[1].E;
            }
        }
        return getSelectedTab();
    }

    public nm0 getCurrentListView() {
        gu0 gu0Var;
        uu0 uu0Var = this.m0[0];
        int i10 = uu0Var.E;
        return i10 == 13 ? this.W.getCurrentListView() : i10 == 14 ? this.a0.getCurrentListView() : (i10 != 12 || (gu0Var = this.V) == null) ? uu0Var.h : gu0Var.a.x0;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.v1[0].q;
    }

    public TextView getSaveItem() {
        return this.s0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.p0;
    }

    public bk0 getSearchOptionsItem() {
        return this.u0;
    }

    public int getSelectedTab() {
        int currentTabId = this.K0.getCurrentTabId();
        at0 at0Var = this.b0;
        if (at0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = at0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? r1(currentAlbumId).a : currentTabId;
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
            uu0[] uu0VarArr = this.m0;
            if (i10 >= uu0VarArr.length) {
                return f7;
            }
            uu0 uu0Var = uu0VarArr[i10];
            if (uu0Var != null) {
                f7 = ((1.0f - Math.abs(uu0Var.getTranslationX() / getWidth())) * uu0Var.E) + f7;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.C0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.z6));
        int i10 = org.telegram.ui.ActionBar.y6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.n0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.w0;
        if (w0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.v0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        Drawable[] drawableArr = {this.F0};
        int i11 = org.telegram.ui.ActionBar.y6.y8;
        ImageView imageView = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.D0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Gh));
        vt0 vt0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(vt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(vt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(vt0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Hh));
        qt0 qt0Var = this.T0;
        if (qt0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(qt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(qt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(qt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(qt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A7));
        }
        final int i12 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i12 >= uu0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.g7 g7Var = new org.telegram.ui.ActionBar.g7() { // from class: org.telegram.ui.Components.js0
                @Override // org.telegram.ui.ActionBar.g7
                public final void b() {
                    uu0[] uu0VarArr2 = bw0.this.m0;
                    int i13 = i12;
                    et0 et0Var = uu0VarArr2[i13].h;
                    if (et0Var != null) {
                        int childCount = et0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = uu0VarArr2[i13].h.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.x7) {
                                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) childAt;
                                for (int i15 = 0; i15 < 6; i15++) {
                                    x7Var.a[i15].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                                ((org.telegram.ui.Cells.m6) childAt).t(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                                ((org.telegram.ui.Cells.ab) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.g7
                public final /* synthetic */ void a(float f7) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].v, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
            int i13 = org.telegram.ui.ActionBar.y6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.n6));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.U7));
            int i14 = org.telegram.ui.ActionBar.y6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
            int i15 = org.telegram.ui.ActionBar.y6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.x7.class}, (Paint) null, (Drawable[]) null, g7Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.x7.class}, (Paint) null, (Drawable[]) null, g7Var, i15));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.d2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Lh));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.d2.class}, (Paint) null, (Drawable[]) null, g7Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.d2.class}, (Paint) null, (Drawable[]) null, g7Var, i15));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.A0}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].v.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].v.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.y6));
            i12++;
        }
    }

    public final float h0(float f7) {
        float f10 = 0.0f;
        if (x0()) {
            return 0.0f;
        }
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[1];
        if (uu0Var != null && s0(uu0Var.E)) {
            f10 = 0.0f + f7;
        }
        uu0 uu0Var2 = uu0VarArr[0];
        return (uu0Var2 == null || !s0(uu0Var2.E)) ? f10 : (1.0f - f7) + f10;
    }

    public final void h1(int i10, int i11, int i12, int i13) {
        this.b2 = true;
        this.c2 = i10;
        this.d2 = i11;
        this.e2 = i12;
        this.a2 = i13;
        j1(i10, this.K0);
        j1(i10, this.D0);
        j1(AndroidUtilities.dp(34.0f) + i10, this.R0);
        j1(AndroidUtilities.dp(52.0f) + i10, this.M0);
        j1(AndroidUtilities.dp(4.0f) + i10, this.L0);
        j1(AndroidUtilities.dp(48.0f) + i10, this.b0);
        ws0 ws0Var = this.a0;
        if (ws0Var != null) {
            if (ws0Var.L != i11 || ws0Var.M != i12) {
                ws0Var.L = i11;
                ws0Var.M = i12;
                ws0Var.n();
            }
            B1();
        }
        for (uu0 uu0Var : this.m0) {
            if (uu0Var != null) {
                uu0Var.setClipChildren(false);
                D1(uu0Var);
                setPageOverscan(uu0Var.h);
                setPageOverscan(uu0Var.n);
                int paddingTop = uu0Var.h.getPaddingTop();
                et0 et0Var = uu0Var.h;
                int paddingLeft = et0Var.getPaddingLeft();
                et0 et0Var2 = uu0Var.h;
                int g02 = g0(uu0Var.E);
                et0Var2.h3 = g02;
                int paddingRight = uu0Var.h.getPaddingRight();
                et0 et0Var3 = uu0Var.h;
                int f02 = f0(D0());
                et0Var3.i3 = f02;
                et0Var.setPadding(paddingLeft, g02, paddingRight, f02);
                int paddingTop2 = paddingTop - uu0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    AndroidUtilities.doOnLayout(uu0Var.h, new fs0(uu0Var, paddingTop2, 1));
                }
                uu0Var.v.setPadding(0, i10, 0, i13);
                gu0 gu0Var = this.V;
                if (gu0Var != null && gu0Var.getParent() == uu0Var) {
                    j1(AndroidUtilities.dp(56.0f) + i10, gu0Var);
                }
                vs0 vs0Var = this.W;
                if (vs0Var != null && vs0Var.getParent() == uu0Var) {
                    j1(i10, vs0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final float i0(float f7) {
        float f10 = 0.0f;
        if (x0()) {
            return 0.0f;
        }
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[1];
        if (uu0Var != null && A0(uu0Var.E) && uu0VarArr[1].E != 11) {
            f10 = 0.0f + f7;
        }
        uu0 uu0Var2 = uu0VarArr[0];
        return (uu0Var2 == null || !A0(uu0Var2.E) || uu0VarArr[0].E == 11) ? f10 : (1.0f - f7) + f10;
    }

    public final void i1(int i10, boolean z10) {
        this.C0.a(i10, z10);
        org.telegram.ui.ActionBar.r5 r5Var = this.H;
        if (r5Var != null) {
            r5Var.t(i10, z10);
        }
    }

    public final int j0(int i10) {
        yv0 t12;
        di.z6 z6Var;
        if (!w0(i10) || (t12 = t1(i10)) == null || (z6Var = t12.s) == null) {
            return 0;
        }
        return z6Var.g();
    }

    public final int k0(int i10) {
        at0 at0Var = this.b0;
        return (int) ((at0Var == null || !(E0(i10) || i10 == 8)) ? 0.0f : at0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f));
    }

    public void k1(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        this.E1 = z10;
        org.telegram.ui.ActionBar.r5 r5Var = this.H;
        if (r5Var != null) {
            if (z10) {
                I1();
                r5Var.x();
            } else {
                r5Var.n();
            }
            O(true);
            return;
        }
        AnimatorSet animatorSet = this.Q1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        LinearLayout linearLayout = this.D0;
        if (z10) {
            linearLayout.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.Q1.setDuration(180L);
        this.Q1.addListener(new org.telegram.ui.lo(20, this, z10));
        this.Q1.start();
        if (z10) {
            I1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l1(int i10, boolean z10) {
        int i11;
        uu0 d02;
        if (z10 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z10 && w0(i10) && j0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.l1);
        bundle.putLong("topic_id", this.F);
        qv0[] qv0VarArr = this.v1;
        if (z10 && (d02 = d0(0)) != null) {
            ArrayList arrayList = qv0VarArr[0].e;
            int L0 = d02.w.L0();
            if (L0 >= 0) {
                av0 av0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((av0) arrayList.get(i12)).b) {
                            av0Var = (av0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (av0Var == null) {
                        av0Var = (av0) ic.a.g(1, arrayList);
                    }
                }
                if (av0Var != null) {
                    i11 = av0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.n8 n8Var = new org.telegram.ui.n8(qv0VarArr[0].q, i11, bundle);
                    n8Var.M = new li.h5(this);
                    this.x1.presentFragment(n8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.n8 n8Var2 = new org.telegram.ui.n8(qv0VarArr[0].q, i11, bundle);
        n8Var2.M = new li.h5(this);
        this.x1.presentFragment(n8Var2);
    }

    public final void m1(int i10) {
        int q12 = q1(getClosestTab());
        at0 at0Var = this.b0;
        if (q12 != i10) {
            if (at0Var != null) {
                at0Var.b.d(i10, at0Var.d.i(i10));
                return;
            }
            return;
        }
        at0Var.setReorderingAlbums(true);
        aw0 r12 = r1(i10);
        uu0 d02 = d0(r12.a);
        if (d02 == null) {
            return;
        }
        et0 et0Var = d02.h;
        for (int i11 = 0; i11 < et0Var.getChildCount(); i11++) {
            View childAt = et0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.w7) {
                ((org.telegram.ui.Cells.w7) childAt).l(true, true);
            }
        }
        zv0 zv0Var = r12.c;
        if (zv0Var != null && !zv0Var.x) {
            zv0Var.x = true;
        }
        C1(true);
    }

    public final float n0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 >= uu0VarArr.length) {
                break;
            }
            uu0 uu0Var = uu0VarArr[i11];
            if (uu0Var != null) {
                int i13 = uu0Var.E;
                if ((z10 && i10 == 8 && E0(i13)) || i13 == i10) {
                    i12++;
                    width = uu0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n1(boolean z10) {
        uu0[] uu0VarArr;
        uu0 uu0Var;
        if (this.q1) {
            return;
        }
        int i10 = 0;
        while (true) {
            uu0VarArr = this.m0;
            if (i10 >= uu0VarArr.length) {
                uu0Var = null;
                break;
            }
            int i11 = uu0VarArr[i10].E;
            if (i11 == 0 || w0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (uu0Var != null) {
            int i12 = uu0Var.E;
            this.r1 = i12;
            boolean w02 = w0(i12);
            int[] iArr = this.o1;
            int e02 = e0(w02 ? 1 : 0, iArr[w02 ? 1 : 0], z10);
            this.s1 = e02;
            if (e02 != iArr[w02 ? 1 : 0]) {
                if (this.m1 && w0(this.r1)) {
                    return;
                }
                uu0Var.n.setVisibility(0);
                if (w0(this.r1)) {
                    uu0Var.n.setAdapter(u1(this.r1));
                } else {
                    uu0Var.n.setAdapter(this.K);
                }
                tu0 tu0Var = uu0Var.n;
                tu0Var.setPadding(tu0Var.getPaddingLeft(), g0(this.r1), uu0Var.n.getPaddingRight(), f0(D0()));
                uu0Var.r.z1(e02);
                uu0Var.n.a0();
                uu0Var.r.O = new tt0(this, uu0Var, 0);
                AndroidUtilities.updateVisibleRows(uu0Var.h);
                this.q1 = true;
                if (this.r1 == 0) {
                    this.v1[0].g(true);
                }
                this.p1 = 0.0f;
                if (this.s < 0) {
                    d1();
                    return;
                }
                for (uu0 uu0Var2 : uu0VarArr) {
                    if (uu0Var2.E == this.r1) {
                        uu0Var2.r.h1(this.s, this.v - uu0Var2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    public final float o0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 >= uu0VarArr.length) {
                return f7;
            }
            uu0 uu0Var = uu0VarArr[i11];
            if (uu0Var != null) {
                int i12 = uu0Var.E;
                if ((z10 && i10 == 8 && E0(i12)) || i12 == i10) {
                    f7 = (1.0f - Math.abs(uu0VarArr[i11].getTranslationX() / getWidth())) + f7;
                }
            }
            i11++;
        }
    }

    public final void o1() {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            int childCount = uu0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = uu0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.d2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) childAt).getPhotoImage();
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

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            et0 et0Var = uu0VarArr[i10].h;
            if (et0Var != null) {
                et0Var.getViewTreeObserver().addOnPreDrawListener(new bu0(this, i10, 0));
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return Q() || this.K0.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        nu0 nu0Var = this.F1;
        int height = nu0Var.f() != null ? nu0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof uu0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                et0 et0Var = ((uu0) childAt).h;
                et0Var.setPadding(0, et0Var.f3, 0, et0Var.g3);
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
        if (!this.O1) {
            org.telegram.ui.ActionBar.r2 r2Var = this.x1;
            if (r2Var.getParentLayout() != null && !((ActionBarLayout) r2Var.getParentLayout()).i() && !Q() && !this.a) {
                if (motionEvent != null) {
                    if (this.D1 == null) {
                        this.D1 = VelocityTracker.obtain();
                    }
                    this.D1.addMovement(motionEvent);
                    t40 t40Var = this.G1;
                    if (t40Var != null) {
                        t40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.z1 && !this.A1) {
                    if (motionEvent.getY() >= AndroidUtilities.dp(90.0f) + this.c2) {
                        this.y1 = motionEvent.getPointerId(0);
                        this.A1 = true;
                        this.B1 = (int) motionEvent.getX();
                        this.C1 = (int) motionEvent.getY();
                        this.D1.clear();
                        return this.z1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.y1) {
                    int x9 = (int) (motionEvent.getX() - this.B1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.C1);
                    boolean z11 = this.z1;
                    uu0[] uu0VarArr = this.m0;
                    if (z11 && (((z10 = this.j1) && x9 > 0) || (!z10 && x9 < 0))) {
                        if (!a1(motionEvent, x9 < 0)) {
                            this.A1 = true;
                            this.z1 = false;
                            uu0VarArr[0].setTranslationX(0.0f);
                            uu0VarArr[1].setTranslationX(this.j1 ? uu0VarArr[0].getMeasuredWidth() : -uu0VarArr[0].getMeasuredWidth());
                            f1(0.0f, uu0VarArr[1].E);
                            T0(getTabProgress());
                        }
                    }
                    if (!this.A1 || this.z1) {
                        if (this.z1) {
                            uu0VarArr[0].setTranslationX(x9);
                            if (this.j1) {
                                uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() + x9);
                            } else {
                                uu0VarArr[1].setTranslationX(x9 - uu0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x9) / uu0VarArr[0].getMeasuredWidth();
                            if (G()) {
                                this.q0 = i0(abs2);
                                G1(abs2);
                                float h02 = h0(abs2);
                                this.r0 = h02;
                                this.t0.setVisibility((h02 == 0.0f || !G() || x0()) ? 4 : 0);
                            } else {
                                this.q0 = 0.0f;
                            }
                            C1(false);
                            f1(abs2, uu0VarArr[1].E);
                            T0(getTabProgress());
                            S0();
                        }
                    } else if (Math.abs(x9) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x9) > abs) {
                        a1(motionEvent, x9 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.y1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    p1(motionEvent);
                }
                return this.z1;
            }
        }
        return false;
    }

    public final int p0(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.H1;
        return u6Var != null ? u6Var.g(i10) : org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public final void p1(MotionEvent motionEvent) {
        float f7;
        float f10;
        float measuredWidth;
        VelocityTracker velocityTracker = this.D1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.U0);
        int i10 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f7 = 0.0f;
            f10 = 0.0f;
        } else {
            f7 = this.D1.getXVelocity();
            f10 = this.D1.getYVelocity();
            if (!this.z1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                a1(motionEvent, f7 < 0.0f);
            }
        }
        if (this.z1) {
            uu0[] uu0VarArr = this.m0;
            float x9 = uu0VarArr[0].getX();
            this.h1 = new AnimatorSet();
            this.k1 = Math.abs(x9) < ((float) uu0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new f80(this, 20));
            boolean z10 = this.k1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x9);
                if (this.j1) {
                    this.h1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], (Property<uu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(uu0VarArr[1], (Property<uu0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.h1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], (Property<uu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(uu0VarArr[1], (Property<uu0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = uu0VarArr[0].getMeasuredWidth() - Math.abs(x9);
                if (this.j1) {
                    this.h1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], (Property<uu0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(uu0VarArr[1], (Property<uu0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.h1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], (Property<uu0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(uu0VarArr[1], (Property<uu0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.h1.setInterpolator(q2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.h1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.h1.addListener(new yt0(this, i10));
            this.h1.start();
            this.i1 = true;
            this.z1 = false;
            S0();
        } else {
            this.A1 = false;
            setHeaderEnabled(true);
            this.K0.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.D1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.D1 = null;
        }
    }

    public final boolean q0() {
        return this.x1.getConnectionsManager().getConnectionState() == 3;
    }

    public final int q1(int i10) {
        aw0 s12 = s1(i10);
        if (s12 == null) {
            return -1;
        }
        return s12.b;
    }

    public final boolean r0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.b1;
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

    public final aw0 r1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.j2;
        aw0 aw0Var = (aw0) hashMap.get(valueOf);
        if (aw0Var != null) {
            return aw0Var;
        }
        aw0 aw0Var2 = new aw0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), aw0Var2);
        this.k2.put(Integer.valueOf(aw0Var2.a), Integer.valueOf(i10));
        return aw0Var2;
    }

    public final boolean s0(int i10) {
        if (i10 == 0) {
            return true;
        }
        if (((i10 == 8 || E0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || i10 == 9 || i10 == 11 || i10 == 13) {
            return true;
        }
        return i10 == 14 && this.a0 != null;
    }

    public final aw0 s1(int i10) {
        Integer num = (Integer) this.k2.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (aw0) this.j2.get(num);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.f1;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.f1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.e1 == 0) {
                this.e1 = -j10;
                int i10 = 0;
                while (true) {
                    qv0[] qv0VarArr = this.v1;
                    if (i10 >= qv0VarArr.length) {
                        break;
                    }
                    if (qv0VarArr[i10].b[1].size() == 0) {
                        qv0 qv0Var = qv0VarArr[i10];
                        qv0Var.j[1] = this.f1.migrated_from_max_id;
                        qv0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        vt0 vt0Var = this.K0;
        if (vt0Var != null) {
            vt0Var.setInitialTabId(x0() ? 9 : 8);
        }
        J1(true);
        v1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.Z0[6] = i10;
        }
        J1(true);
        L();
    }

    public void setForwardRestrictedHint(t40 t40Var) {
        this.G1 = t40Var;
    }

    public void setMergeDialogId(long j10) {
        this.e1 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.Z0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            } else {
                i10++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        J1(true);
        L();
        if (iArr2[0] >= 0) {
            H0(false);
        }
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.N1 = i11;
        int i14 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i14 >= uu0VarArr.length) {
                break;
            }
            uu0VarArr[i14].setTranslationY(this.N1);
            i14++;
        }
        if (this.R0 != null) {
            R();
        } else {
            qt0 qt0Var = this.T0;
            if (qt0Var != null) {
                qt0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.Q0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.M0;
        v0Var.setTranslationY((v0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.Q0);
    }

    public void setPagesGlassEngine(oi.q qVar) {
        this.g2 = qVar;
        ws0 ws0Var = this.a0;
        if (ws0Var != null) {
            ws0Var.setGlassEngine(qVar);
        }
        for (uu0 uu0Var : this.m0) {
            if (uu0Var != null) {
                uu0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(uu0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.a2 != i10) {
            this.a2 = i10;
            uu0[] uu0VarArr = this.m0;
            if (uu0VarArr != null) {
                for (uu0 uu0Var : uu0VarArr) {
                    if (uu0Var != null) {
                        et0 et0Var = uu0Var.h;
                        int paddingLeft = et0Var.getPaddingLeft();
                        et0 et0Var2 = uu0Var.h;
                        int i11 = et0Var2.f3;
                        int paddingRight = et0Var2.getPaddingRight();
                        et0 et0Var3 = uu0Var.h;
                        int f02 = f0(D0());
                        et0Var3.i3 = f02;
                        et0Var.setPadding(paddingLeft, i11, paddingRight, f02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i10) {
        if (this.f2 != i10) {
            this.f2 = i10;
            invalidate();
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            z1(uu0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.g1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.g1 = userFull;
        J1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        e1(8);
    }

    public void setVisibleHeight(int i10) {
        this.P1 = i10;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 >= uu0VarArr.length) {
                break;
            }
            float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(uu0VarArr[i11].E == 8 ? 280.0f : 120.0f)))) / 2.0f;
            uu0VarArr[i11].v.setTranslationY(f7);
            uu0VarArr[i11].s.setTranslationY(-f7);
            i11++;
        }
        vs0 vs0Var = this.W;
        if (vs0Var != null) {
            vs0Var.setVisibleHeight(i10);
        }
        ws0 ws0Var = this.a0;
        if (ws0Var != null) {
            ws0Var.setVisibleHeight(i10);
        }
    }

    public final void t0() {
        AndroidUtilities.cancelRunOnUIThread(this.O0);
        org.telegram.ui.Cells.v0 v0Var = this.M0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.N0.playTogether(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.Q0));
        this.N0.setInterpolator(ds.g);
        this.N0.addListener(new yt0(this, 0));
        this.N0.start();
    }

    public final yv0 t1(int i10) {
        aw0 s12;
        if (i10 == 8) {
            return this.e0;
        }
        if (i10 == 9) {
            return this.g0;
        }
        if (!E0(i10) || (s12 = s1(i10)) == null) {
            return null;
        }
        return s12.c;
    }

    public boolean u0() {
        return false;
    }

    public final yv0 u1(int i10) {
        aw0 s12;
        if (i10 == 8) {
            return this.f0;
        }
        if (i10 == 9) {
            return this.h0;
        }
        if (!E0(i10) || (s12 = s1(i10)) == null) {
            return null;
        }
        return s12.d;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.I1.a(p0(org.telegram.ui.ActionBar.y6.d6));
            org.telegram.ui.ActionBar.j2 j2Var = this.F0;
            if (j2Var != null) {
                j2Var.a(p0(org.telegram.ui.ActionBar.y6.y8));
            }
            NumberTextView numberTextView = this.C0;
            if (numberTextView != null) {
                numberTextView.setTextColor(p0(org.telegram.ui.ActionBar.y6.y8));
            }
            x1();
            invalidate();
            for (uu0 uu0Var : this.m0) {
                if (uu0Var != null && uu0Var.L) {
                    uu0Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean v0() {
        return !(this instanceof j40);
    }

    public final void v1(boolean z10) {
        uu0[] uu0VarArr;
        uu0[] uu0VarArr2;
        org.telegram.ui.ActionBar.w0 w0Var;
        s4.w0 w0Var2;
        boolean z11;
        boolean z12;
        boolean z13;
        s4.w0 w0Var3;
        int i10;
        int i11;
        int i12;
        boolean z14;
        s4.w0 w0Var4;
        int i13;
        int i14;
        boolean z15;
        s4.w0 w0Var5;
        ws0 ws0Var = this.a0;
        if (ws0Var != null) {
            ws0Var.i();
        }
        int i15 = 0;
        while (true) {
            uu0VarArr = this.m0;
            if (i15 >= uu0VarArr.length) {
                break;
            }
            uu0VarArr[i15].h.C0();
            i15++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uu0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(J0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        s4.h0 adapter = uu0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.e0;
        s4.z zVar = this.d0;
        if (adapter == h0Var) {
            zVar.h(null);
        }
        boolean z16 = this.X0;
        nu0 nu0Var = this.F1;
        org.telegram.ui.ActionBar.k kVar = this.G;
        org.telegram.ui.ActionBar.w0 w0Var6 = this.p0;
        jv0 jv0Var = this.P;
        int i16 = 100;
        if (z16 && this.W0) {
            uu0 uu0Var = uu0VarArr[z10 ? 1 : 0];
            if (uu0Var.f == null) {
                uu0Var.f = new s4.w0();
            }
            uu0 uu0Var2 = uu0VarArr[z10 ? 1 : 0];
            s4.w0 w0Var7 = uu0Var2.f;
            nv0 nv0Var = this.U;
            su0 su0Var = this.l0;
            xu0 xu0Var = this.j0;
            xu0 xu0Var2 = this.k0;
            xu0 xu0Var3 = this.i0;
            if (z10) {
                int i17 = uu0Var2.E;
                if (i17 != 0) {
                    w0Var5 = w0Var7;
                    if (i17 != 2 && i17 != 5 && i17 != 6 && (i17 != 7 || nu0Var.U())) {
                        String obj = w0Var6 != null ? w0Var6.getSearchField().getText().toString() : "";
                        int i18 = uu0VarArr[z10 ? 1 : 0].E;
                        if (i18 == 1) {
                            if (xu0Var3 != null) {
                                xu0Var3.G(obj, false);
                                if (adapter != xu0Var3) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var3);
                                }
                            }
                        } else if (i18 == 3) {
                            if (xu0Var2 != null) {
                                xu0Var2.G(obj, false);
                                if (adapter != xu0Var2) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var2);
                                }
                            }
                        } else if (i18 == 4) {
                            if (xu0Var != null) {
                                xu0Var.G(obj, false);
                                if (adapter != xu0Var) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var);
                                }
                            }
                        } else if (i18 == 7) {
                            if (su0Var != null) {
                                su0Var.F(obj, false);
                                if (adapter != su0Var) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(su0Var);
                                }
                            }
                        } else if (i18 == 11) {
                            if (nv0Var != null) {
                                nv0Var.E(this.Y0, obj);
                                if (adapter != nv0Var) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(nv0Var);
                                }
                            }
                        } else if (i18 == 15 && jv0Var != null && adapter != jv0Var) {
                            c1(adapter);
                            et0 et0Var = uu0VarArr[z10 ? 1 : 0].h;
                            jv0Var.r = et0Var;
                            et0Var.setAdapter(jv0Var);
                        }
                    }
                }
                this.X0 = false;
                st0 st0Var = this.L0;
                if (st0Var != null) {
                    st0Var.g(false);
                }
                this.W0 = false;
                v1(true);
                return;
            }
            w0Var5 = w0Var7;
            if (uu0Var2.h != null) {
                int i19 = uu0Var2.E;
                if (i19 == 1) {
                    if (adapter != xu0Var3) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var3);
                    }
                    xu0Var3.l();
                } else if (i19 == 3) {
                    if (adapter != xu0Var2) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var2);
                    }
                    xu0Var2.l();
                } else if (i19 == 4) {
                    if (adapter != xu0Var) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var);
                    }
                    xu0Var.l();
                } else if (i19 == 7) {
                    if (adapter != su0Var) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(su0Var);
                    }
                    su0Var.l();
                } else if (i19 == 11) {
                    if (adapter != nv0Var) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(nv0Var);
                    }
                    nv0Var.l();
                }
            }
            uu0VarArr2 = uu0VarArr;
            w0Var = w0Var6;
            w0Var4 = w0Var5;
            z14 = false;
            i10 = 4;
            z13 = false;
            i12 = 8;
        } else {
            uu0 uu0Var3 = uu0VarArr[z10 ? 1 : 0];
            if (uu0Var3.e == null) {
                uu0Var3.e = new s4.w0();
            }
            uu0 uu0Var4 = uu0VarArr[z10 ? 1 : 0];
            s4.w0 w0Var8 = uu0Var4.e;
            uu0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i20 = uu0VarArr[z10 ? 1 : 0].E;
            if (i20 == 8 || E0(i20)) {
                layoutParams.topMargin = AndroidUtilities.dp(J0());
            }
            et0 et0Var2 = uu0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = et0Var2.getPaddingLeft();
            uu0 uu0Var5 = uu0VarArr[z10 ? 1 : 0];
            uu0VarArr2 = uu0VarArr;
            et0 et0Var3 = uu0Var5.h;
            int g02 = g0(uu0Var5.E);
            et0Var3.h3 = g02;
            int paddingRight = uu0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            et0 et0Var4 = uu0VarArr2[z10 ? 1 : 0].h;
            w0Var = w0Var6;
            int f02 = f0(D0());
            et0Var4.i3 = f02;
            et0Var2.setPadding(paddingLeft, g02, paddingRight, f02);
            int i21 = uu0VarArr2[z10 ? 1 : 0].E;
            int[] iArr = this.o1;
            s4.h0 h0Var2 = this.M;
            View view = this.W;
            mv0 mv0Var = this.T;
            mu0 mu0Var = this.R;
            gu0 gu0Var = this.V;
            qv0[] qv0VarArr = this.v1;
            if (i21 == 0) {
                s4.h0 h0Var3 = this.J;
                if (adapter != h0Var3) {
                    c1(adapter);
                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i22 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i22;
                layoutParams.leftMargin = i22;
                qv0 qv0Var = qv0VarArr[0];
                boolean z17 = qv0Var.h && !qv0Var.e.isEmpty();
                i16 = iArr[0];
                uu0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.A0);
                qv0 qv0Var2 = qv0VarArr[0];
                if (qv0Var2.x == null) {
                    qv0Var2.x = new s4.w0();
                }
                w0Var2 = qv0VarArr[0].x;
                z13 = z17;
                z11 = false;
            } else {
                if (i21 == 1) {
                    qv0 qv0Var3 = qv0VarArr[1];
                    z12 = qv0Var3.h && !qv0Var3.e.isEmpty();
                    if (adapter != h0Var2) {
                        c1(adapter);
                        uu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i21 == 2) {
                    qv0 qv0Var4 = qv0VarArr[2];
                    z12 = qv0Var4.h && !qv0Var4.e.isEmpty();
                    s4.h0 h0Var4 = this.N;
                    if (adapter != h0Var4) {
                        c1(adapter);
                        uu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var4);
                    }
                } else {
                    if (i21 == 3) {
                        if (adapter != this.L) {
                            c1(adapter);
                            uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                        }
                    } else if (i21 == 4) {
                        qv0 qv0Var5 = qv0VarArr[4];
                        z12 = qv0Var5.h && !qv0Var5.e.isEmpty();
                        if (adapter != this.O) {
                            c1(adapter);
                            uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                        }
                    } else {
                        if (i21 == 5) {
                            if (adapter != this.Q) {
                                c1(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                            }
                        } else if (i21 == 15) {
                            if (adapter != jv0Var) {
                                c1(adapter);
                                et0 et0Var5 = uu0VarArr2[z10 ? 1 : 0].h;
                                jv0Var.r = et0Var5;
                                et0Var5.setAdapter(jv0Var);
                            }
                        } else if (i21 == 6) {
                            if (adapter != mu0Var) {
                                c1(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(mu0Var);
                            }
                        } else if (i21 == 7) {
                            if (adapter != this.c0) {
                                c1(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.c0);
                            }
                        } else if (w0(i21)) {
                            s4.h0 t12 = t1(uu0VarArr2[z10 ? 1 : 0].E);
                            if (adapter != t12) {
                                c1(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(t12);
                                uu0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            uu0 uu0Var6 = uu0VarArr2[z10 ? 1 : 0];
                            if (uu0Var6.E != 9) {
                                zVar.h(uu0Var6.h);
                            }
                            i16 = iArr[1];
                        } else {
                            int i23 = uu0VarArr2[z10 ? 1 : 0].E;
                            if (i23 == 10) {
                                if (adapter != this.S) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.S);
                                }
                            } else if (i23 == 11) {
                                if (adapter != mv0Var) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(mv0Var);
                                    s4.z zVar2 = mv0Var.v;
                                    et0 et0Var6 = uu0VarArr2[z10 ? 1 : 0].h;
                                    mv0Var.s = et0Var6;
                                    zVar2.h(et0Var6);
                                }
                                w0Var2 = mv0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i23 == 12) {
                                if (adapter != null) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gu0Var.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(gu0Var);
                                    uu0VarArr2[z10 ? 1 : 0].addView(gu0Var, kb1.h(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    j1(AndroidUtilities.dp(56.0f) + this.c2, gu0Var);
                                }
                            } else if (i23 == 13) {
                                if (adapter != null) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    uu0VarArr2[z10 ? 1 : 0].addView(view);
                                    j1(this.c2, view);
                                }
                            } else if (i23 == 14) {
                                if (adapter != null) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (ws0Var != null && ws0Var.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(ws0Var);
                                    uu0VarArr2[z10 ? 1 : 0].addView(ws0Var);
                                    uu0VarArr2[z10 ? 1 : 0].v.setVisibility(4);
                                }
                            }
                        }
                        w0Var2 = w0Var8;
                        z11 = false;
                        z13 = false;
                    }
                    w0Var2 = w0Var8;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                w0Var2 = w0Var8;
                z11 = true;
            }
            E1(uu0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                uu0VarArr2[z10 ? 1 : 0].h.setSections(false);
                w0Var3 = w0Var2;
            } else {
                et0 et0Var7 = uu0VarArr2[z10 ? 1 : 0].h;
                et0Var7.getClass();
                w0Var3 = w0Var2;
                org.telegram.ui.ActionBar.f7.m(et0Var7, 20, org.telegram.ui.ActionBar.y6.i6, et0Var7.n2);
                et0Var7.U2 = false;
                et0Var7.H2 = null;
                et0Var7.I2 = null;
                et0Var7.L2 = 0.0f;
                et0Var7.M2 = null;
                et0Var7.N2 = null;
                et0Var7.J2 = null;
                et0Var7.setSectionsRounding(false);
                yl0 yl0Var = et0Var7.G2;
                if (yl0Var != null) {
                    et0Var7.q0(yl0Var);
                    et0Var7.G2 = null;
                }
                ea eaVar = et0Var7.S2;
                if (eaVar != null) {
                    et0Var7.q0(eaVar);
                    et0Var7.S2 = null;
                }
            }
            D1(uu0VarArr2[z10 ? 1 : 0]);
            uu0 uu0Var7 = uu0VarArr2[z10 ? 1 : 0];
            if (uu0Var7.E == 11) {
                uu0Var7.h.setItemAnimator(uu0Var7.d);
            } else {
                uu0Var7.h.setItemAnimator(null);
                if (mv0Var != null && uu0VarArr2[z10 ? 1 : 0].h == mv0Var.s) {
                    s4.z zVar3 = mv0Var.v;
                    mv0Var.s = null;
                    zVar3.h(null);
                }
            }
            if (gu0Var != null && uu0VarArr2[z10 ? 1 : 0].E != 12 && gu0Var.getParent() == uu0VarArr2[z10 ? 1 : 0]) {
                gu0Var.a.onRemoveFromParent();
                uu0VarArr2[z10 ? 1 : 0].removeView(gu0Var);
            }
            if (view != null && uu0VarArr2[z10 ? 1 : 0].E != 13) {
                ViewParent parent = view.getParent();
                uu0 uu0Var8 = uu0VarArr2[z10 ? 1 : 0];
                if (parent == uu0Var8) {
                    uu0Var8.removeView(view);
                }
            }
            if (ws0Var != null && uu0VarArr2[z10 ? 1 : 0].E != 14) {
                ViewParent parent2 = ws0Var.getParent();
                uu0 uu0Var9 = uu0VarArr2[z10 ? 1 : 0];
                if (parent2 == uu0Var9) {
                    uu0Var9.removeView(ws0Var);
                }
            }
            int i24 = uu0VarArr2[z10 ? 1 : 0].E;
            if (i24 == 0 || i24 == 11 || w0(i24) || (i13 = uu0VarArr2[z10 ? 1 : 0].E) == 2 || i13 == 5 || i13 == 6 || ((i13 == 7 && !nu0Var.U()) || (i14 = uu0VarArr2[z10 ? 1 : 0].E) == 10 || i14 == 13 || i14 == 14)) {
                i10 = 4;
                if (z10) {
                    this.z0 = 2;
                } else {
                    this.z0 = 0;
                    if (w0Var != null) {
                        setSearchItemVisibility((D0() || this.X0) ? 8 : 4);
                    }
                }
            } else {
                if (z10) {
                    if (w0Var != null && w0Var.getVisibility() == 4) {
                        org.telegram.ui.ActionBar.r5 r5Var = this.H;
                        if (!(r5Var != null ? r5Var.F : kVar.n0)) {
                            if (G()) {
                                this.z0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                setSearchItemVisibility(D0() ? 8 : 4);
                            }
                            float f7 = z10 ? 1.0f : 0.0f;
                            this.q0 = i0(f7);
                            G1(1.0f - f7);
                            z15 = false;
                        }
                    }
                    z15 = false;
                    this.z0 = 0;
                    this.q0 = 1.0f;
                } else {
                    z15 = false;
                    if (w0Var != null) {
                        i10 = 4;
                        if (w0Var.getVisibility() == 4) {
                            if (G()) {
                                this.z0 = 0;
                                this.q0 = 1.0f;
                                setSearchItemVisibility(0);
                            } else {
                                setSearchItemVisibility(D0() ? 8 : 4);
                                this.q0 = 0.0f;
                            }
                        }
                        C1(z15);
                    }
                }
                i10 = 4;
                C1(z15);
            }
            int i25 = uu0VarArr2[z10 ? 1 : 0].E;
            if (i25 == 6) {
                if (!mu0Var.e && !mu0Var.h && mu0Var.d.isEmpty()) {
                    mu0.E(mu0Var, 0L);
                }
            } else if (i25 != 7) {
                if (w0(i25)) {
                    yv0 t13 = t1(uu0VarArr2[z10 ? 1 : 0].E);
                    if (t13 != null) {
                        di.z6 z6Var = t13.s;
                        t13.P();
                        uu0VarArr2[z10 ? 1 : 0].v.e(z6Var != null && (z6Var.k() || (q0() && z6Var.g() > 0)), z10);
                        z13 = (z6Var == null || z6Var.g() <= 0 || B0()) ? false : true;
                    }
                } else {
                    int i26 = uu0VarArr2[z10 ? 1 : 0].E;
                    if (i26 != 10 && i26 != 11 && i26 != 12 && i26 != 13 && i26 != 14) {
                        if (i26 == 15) {
                            i26 = 8;
                        }
                        qv0 qv0Var6 = qv0VarArr[i26];
                        if (!qv0Var6.g && !qv0Var6.i[0] && qv0Var6.a.isEmpty()) {
                            qv0VarArr[i26].g = true;
                            h0Var2.l();
                            if (i26 == 0) {
                                int i27 = qv0VarArr[0].q;
                                if (i27 == 1) {
                                    i11 = 6;
                                } else if (i27 == 2) {
                                    i11 = 7;
                                }
                                this.x1.getMediaDataController().loadMedia(this.l1, 50, 0, 0, i11, this.F, 1, this.x1.getClassGuid(), qv0VarArr[i11].p, null, null);
                            }
                            i11 = i26;
                            this.x1.getMediaDataController().loadMedia(this.l1, 50, 0, 0, i11, this.F, 1, this.x1.getClassGuid(), qv0VarArr[i11].p, null, null);
                        }
                    }
                }
            }
            int i28 = uu0VarArr2[z10 ? 1 : 0].E;
            if (i28 == 8 || E0(i28)) {
                uu0 uu0Var10 = uu0VarArr2[z10 ? 1 : 0];
                pt0 pt0Var = uu0Var10.v;
                boolean E0 = E0(uu0Var10.E);
                int q12 = q1(uu0VarArr2[z10 ? 1 : 0].E);
                y9 y9Var = pt0Var.b;
                fi.d dVar = pt0Var.f;
                y9Var.setVisibility((E0 || C0() || y0()) ? 8 : 0);
                if (E0) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), false);
                    i12 = 8;
                } else if (C0()) {
                    i12 = 8;
                    dVar.setVisibility(8);
                } else {
                    i12 = 8;
                    pt0Var.setStickerType(11);
                    dVar.setVisibility(!B0() ? 0 : 8);
                    dVar.h(z(), false);
                }
                if (E0) {
                    pt0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    pt0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    pt0Var.d.setText(LocaleController.getString(!B0() ? D0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    pt0Var.e.setText(D0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : "");
                }
                dVar.setOnClickListener(new cs0(this, E0, q12, 0));
            } else {
                uu0 uu0Var11 = uu0VarArr2[z10 ? 1 : 0];
                if (uu0Var11.E == 9) {
                    if (C0()) {
                        uu0VarArr2[z10 ? 1 : 0].v.b.setVisibility(8);
                        uu0VarArr2[z10 ? 1 : 0].v.f.setVisibility(8);
                    } else {
                        uu0VarArr2[z10 ? 1 : 0].v.b.setVisibility(0);
                        uu0VarArr2[z10 ? 1 : 0].v.setStickerType(11);
                        uu0VarArr2[z10 ? 1 : 0].v.f.setVisibility(0);
                        uu0VarArr2[z10 ? 1 : 0].v.f.h(z(), false);
                    }
                    uu0VarArr2[z10 ? 1 : 0].v.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    uu0VarArr2[z10 ? 1 : 0].v.e.setText(D0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : "");
                    uu0VarArr2[z10 ? 1 : 0].v.f.setOnClickListener(new vr0(this, 4));
                    i12 = 8;
                } else {
                    uu0Var11.v.b.setVisibility(0);
                    uu0VarArr2[z10 ? 1 : 0].v.setStickerType(1);
                    uu0VarArr2[z10 ? 1 : 0].v.d.setText(LocaleController.getString(R.string.NoResult));
                    uu0VarArr2[z10 ? 1 : 0].v.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    i12 = 8;
                    uu0VarArr2[z10 ? 1 : 0].v.f.setVisibility(8);
                }
            }
            z14 = false;
            uu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            w0Var4 = w0Var3;
        }
        int i29 = i16;
        uu0 uu0Var12 = uu0VarArr2[z10 ? 1 : 0];
        uu0Var12.b = z13;
        z1(uu0Var12, z14);
        uu0VarArr2[z10 ? 1 : 0].w.z1(i29);
        uu0VarArr2[z10 ? 1 : 0].h.a0();
        if (w0Var4 != null) {
            uu0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(w0Var4);
            uu0VarArr2[z10 ? 1 : 0].n.setRecycledViewPool(w0Var4);
        }
        if (this.z0 == 2) {
            org.telegram.ui.ActionBar.r5 r5Var2 = this.H;
            if (r5Var2 != null ? r5Var2.F : kVar.n0) {
                this.B0 = true;
                if (r5Var2 != null) {
                    r5Var2.f(true);
                } else {
                    kVar.g(true);
                }
                this.z0 = 0;
                this.q0 = 0.0f;
                if (w0Var != null) {
                    setSearchItemVisibility(D0() ? i12 : i10);
                }
                C1(false);
            }
        }
    }

    public final void w1(org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, Runnable runnable) {
        if (this.K1) {
            return;
        }
        if (g1Var2.getCheckView().a.q || !g1Var.getCheckView().a.q) {
            g1Var.setChecked(!g1Var.getCheckView().a.q);
            runnable.run();
        } else {
            float f7 = -this.u1;
            this.u1 = f7;
            AndroidUtilities.shakeViewSpring(g1Var, f7);
        }
    }

    public boolean x0() {
        return false;
    }

    public final void x1() {
        if (this.H != null) {
            return;
        }
        try {
            int p02 = p0(org.telegram.ui.ActionBar.y6.y8);
            int p03 = p0(org.telegram.ui.ActionBar.y6.z8);
            if (p02 == this.n2 && p03 == this.o2) {
                return;
            }
            this.n2 = p02;
            this.o2 = p03;
            org.telegram.ui.ActionBar.w0[] w0VarArr = {this.w0, this.v0, this.x0, this.y0, this.n0};
            for (int i10 = 0; i10 < 5; i10++) {
                org.telegram.ui.ActionBar.w0 w0Var = w0VarArr[i10];
                if (w0Var != null) {
                    w0Var.setIconColor(p02);
                    if (w0Var.getBackground() != null) {
                        org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), p03, true);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void y(View view) {
        uu0[] uu0VarArr = this.m0;
        addView(view, Math.max(indexOfChild(uu0VarArr[0]), indexOfChild(uu0VarArr[1])) + 1, kb1.i(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean y0() {
        TLRPC.User user;
        long j10 = this.l1;
        return j10 > 0 && (user = MessagesController.getInstance(this.x1.getCurrentAccount()).getUser(Long.valueOf(j10))) != null && user.bot;
    }

    public final void y1() {
        fu0 fu0Var = this.J;
        if (fu0Var != null) {
            fu0Var.l();
        }
        ov0 ov0Var = this.M;
        if (ov0Var != null) {
            ov0Var.l();
        }
        ov0 ov0Var2 = this.N;
        if (ov0Var2 != null) {
            ov0Var2.l();
        }
        pv0 pv0Var = this.L;
        if (pv0Var != null) {
            pv0Var.X(false);
        }
        ov0 ov0Var3 = this.O;
        if (ov0Var3 != null) {
            ov0Var3.l();
        }
        jv0 jv0Var = this.P;
        if (jv0Var != null) {
            jv0Var.l();
        }
        pu0 pu0Var = this.Q;
        if (pu0Var != null) {
            pu0Var.l();
        }
        iu0 iu0Var = this.e0;
        if (iu0Var != null) {
            iu0Var.l();
        }
        Iterator it = this.j2.values().iterator();
        while (it.hasNext()) {
            ((aw0) it.next()).c.l();
        }
    }

    public final SpannableStringBuilder z() {
        if (this.Z1 == null) {
            this.Z1 = new SpannableStringBuilder();
            if (y0()) {
                this.Z1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.Z1.append((CharSequence) "c");
                this.Z1.setSpan(new zq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.Z1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.Z1;
    }

    public final boolean z0() {
        org.telegram.ui.ActionBar.r2 r2Var;
        if (this.f1 == null || (r2Var = this.x1) == null) {
            return false;
        }
        return ChatObject.isChannelAndNotMegaGroup(r2Var.getMessagesController().getChat(Long.valueOf(this.f1.id)));
    }

    public final void z1(uu0 uu0Var, boolean z10) {
        boolean z11 = uu0Var.b && this.d;
        tl0 fastScroll = uu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = uu0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            uu0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<tl0, Float>) property, fastScroll.getAlpha(), 1.0f);
            uu0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<tl0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new org.telegram.ui.lo(fastScroll));
        uu0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public void L0() {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void c() {
    }

    public void K0(SparseArray sparseArray) {
    }

    public void R0(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
    }

    public int b1(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void f(org.telegram.ui.Cells.p2 p2Var) {
    }
}
