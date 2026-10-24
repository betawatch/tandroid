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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class xv0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.m2 {
    public static final int[] g2 = {0, 1, 2, 4};
    public static final js0 h2 = new js0(0);
    public final NumberTextView A0;
    public int A1;
    public final ha B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.h2 D0;
    public final ju0 D1;
    public final int E;
    public final ArrayList E0;
    public r40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.g6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final gh.c G1;
    public final cu0 H;
    public final ArrayList H0;
    public final NotificationCenter.ObserversGroup H1;
    public final rv0 I;
    public final nt0 I0;
    public boolean I1;
    public final lv0 J;
    public final kt0 J0;
    public final AnimationNotificationsLocker J1;
    public final kv0 K;
    public final org.telegram.ui.Cells.v0 K0;
    public org.telegram.ui.h4 K1;
    public final kv0 L;
    public AnimatorSet L0;
    public int L1;
    public final kv0 M;
    public final rr0 M0;
    public boolean M1;
    public final ev0 N;
    public final ArrayList N0;
    public int N1;
    public final lu0 O;
    public float O0;
    public AnimatorSet O1;
    public final iu0 P;
    public final us P0;
    public final SparseArray P1;
    public final gu0 Q;
    public final FrameLayout Q0;
    public long Q1;
    public final hv0 R;
    public final jt0 R0;
    public boolean R1;
    public final iv0 S;
    public final int S0;
    public int S1;
    public final du0 T;
    public final Paint T0;
    public final ut0 T1;
    public final ms0 U;
    public boolean U0;
    public ci.z6 U1;
    public final ns0 V;
    public boolean V0;
    public float V1;
    public final ss0 W;
    public ah.i1 W0;
    public boolean W1;
    public final int[] X0;
    public SpannableStringBuilder X1;
    public int Y0;
    public int Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean a;
    public final hu0 a0;
    public int a1;
    public final HashMap a2;
    public boolean b;
    public final s4.y b0;
    public boolean b1;
    public int b2;
    public boolean c;
    public final fu0 c0;
    public long c1;
    public int c2;
    public boolean d;
    public final uv0 d0;
    public TLRPC.ChatFull d1;
    public final kh d2;
    public int e;
    public final ls0 e0;
    public TLRPC.UserFull e1;
    public int e2;
    public int f;
    public final uv0 f0;
    public AnimatorSet f1;
    public int f2;
    public final tu0 g0;
    public boolean g1;
    public float h;
    public final tu0 h0;
    public boolean h1;
    public final tu0 i0;
    public boolean i1;
    public final ou0 j0;
    public final long j1;
    public final qu0[] k0;
    public boolean k1;
    public final org.telegram.ui.ActionBar.u0 l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.u0 m0;
    public final int[] m1;
    public float n;
    public final org.telegram.ui.ActionBar.u0 n0;
    public float n1;
    public float o0;
    public boolean o1;
    public float p0;
    public int p1;
    public final TextView q0;
    public int q1;
    public boolean r;
    public final ImageView r0;
    public final xs0 r1;
    public int s;
    public final bk0 s0;
    public float s1;
    public final org.telegram.ui.ActionBar.u0 t0;
    public final mv0[] t1;
    public final org.telegram.ui.ActionBar.u0 u0;
    public final pv0 u1;
    public int v;
    public final org.telegram.ui.ActionBar.u0 v0;
    public final org.telegram.ui.ActionBar.o2 v1;
    public int w;
    public final org.telegram.ui.ActionBar.u0 w0;
    public int w1;
    public final Rect x;
    public int x0;
    public boolean x1;
    public final b10 y;
    public final Drawable y0;
    public boolean y1;
    public boolean z0;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0b41 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0c43 A[EDGE_INSN: B:168:0x0c43->B:169:0x0c43 BREAK  A[LOOP:3: B:139:0x091a->B:165:0x0b41], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0caa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029c A[EDGE_INSN: B:47:0x029c->B:48:0x029c BREAK  A[LOOP:0: B:29:0x023f->B:42:0x0297], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b3 A[LOOP:2: B:74:0x03b1->B:75:0x03b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xv0(Context context, long j10, pv0 pv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.o2 o2Var, ju0 ju0Var, int i13, org.telegram.ui.ActionBar.g6 g6Var, bh.b bVar) {
        super(context);
        int i14;
        TLRPC.ProfileTab profileTab;
        int i15;
        mv0[] mv0VarArr;
        int i16;
        kt0 kt0Var;
        int i17;
        int i18;
        hv0 hv0Var;
        ImageView imageView;
        org.telegram.ui.ActionBar.g6 g6Var2;
        Context context2;
        org.telegram.ui.ActionBar.u0 u0Var;
        float f7;
        xv0 xv0Var;
        int i19;
        int i20;
        int i21;
        qu0[] qu0VarArr;
        View view;
        boolean O;
        xv0 xv0Var2;
        ss0 ss0Var;
        int i22;
        int i23;
        us0 us0Var;
        pu0 pu0Var;
        pu0 pu0Var2;
        pu0 pu0Var3;
        pu0 pu0Var4;
        pu0 pu0Var5;
        pu0 pu0Var6;
        pu0 pu0Var7;
        pu0 pu0Var8;
        pu0 pu0Var9;
        pu0 pu0Var10;
        pu0 pu0Var11;
        pu0 pu0Var12;
        pu0 pu0Var13;
        pu0 pu0Var14;
        pu0 pu0Var15;
        wx0 wx0Var;
        wx0 wx0Var2;
        wx0 wx0Var3;
        wx0 wx0Var4;
        wx0 wx0Var5;
        wx0 wx0Var6;
        wx0 wx0Var7;
        wx0 wx0Var8;
        wx0 wx0Var9;
        wx0 wx0Var10;
        pu0 pu0Var16;
        wx0 wx0Var11;
        pu0 pu0Var17;
        pu0 pu0Var18;
        qu0 qu0Var;
        us0 us0Var2;
        pu0 pu0Var19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        TL_bots.BotInfo botInfo;
        xv0 xv0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        xv0Var3.x = new Rect();
        xv0Var3.k0 = new qu0[2];
        xv0Var3.E0 = new ArrayList(10);
        xv0Var3.F0 = new ArrayList(10);
        xv0Var3.G0 = new ArrayList(10);
        xv0Var3.H0 = new ArrayList(10);
        xv0Var3.M0 = new rr0(xv0Var3, 2);
        xv0Var3.N0 = new ArrayList();
        xv0Var3.T0 = new Paint();
        xv0Var3.Z0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        xv0Var3.k1 = false;
        xv0Var3.l1 = false;
        xv0Var3.m1 = new int[]{3, 3};
        xv0Var3.r1 = new xs0(xv0Var3);
        xv0Var3.s1 = -5.0f;
        xv0Var3.t1 = new mv0[9];
        xv0Var3.J1 = new AnimationNotificationsLocker();
        xv0Var3.P1 = new SparseArray();
        xv0Var3.S1 = -1;
        xv0Var3.T1 = new ut0(xv0Var3);
        xv0Var3.V1 = 0.0f;
        xv0Var3.Z1 = new HashMap();
        xv0Var3.a2 = new HashMap();
        gh.c cVar = new gh.c();
        xv0Var3.G1 = cVar;
        cVar.a(xv0Var3.j0(org.telegram.ui.ActionBar.k6.d6));
        bh.b bVar2 = bVar == null ? new bh.b(cVar) : bVar;
        xv0Var3.E = i13;
        xv0Var3.F1 = g6Var;
        b10 b10Var = new b10(context);
        xv0Var3.y = b10Var;
        b10Var.setIsSingleCell(true);
        TLRPC.User user = o2Var.getMessagesController().getUser(Long.valueOf(j10));
        xv0Var3.u1 = pv0Var;
        xv0Var3.D1 = ju0Var;
        int[] iArr = pv0Var.c;
        long j11 = pv0Var.s;
        xv0Var3.F = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i10 : 0, iArr[7], iArr[8]};
        xv0Var3.X0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i14 = 1;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    xv0Var3.Y0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    xv0Var3.Y0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    xv0Var3.Y0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || xv0Var3.y0()))) {
                    xv0Var3.Y0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i29 = iArr2[i14];
                        i24 = -1;
                        if (i29 == -1 || i29 > 0) {
                            xv0Var3.Y0 = i14;
                        }
                    } else {
                        i24 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i28 = iArr2[5]) == i24 || i28 > 0)) {
                        xv0Var3.Y0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i27 = iArr2[3]) == i24 || i27 > 0)) {
                        xv0Var3.Y0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i26 = iArr2[4]) == i24 || i26 > 0)) {
                        xv0Var3.Y0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i25 = iArr2[2]) == i24 || i25 > 0)) {
                        xv0Var3.Y0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || xv0Var3.y0())) {
                        xv0Var3.Y0 = xv0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i30 = -1;
                        if (i11 == -1 || j11 != 0) {
                            int i31 = 0;
                            while (true) {
                                int[] iArr3 = xv0Var3.X0;
                                if (i31 >= iArr3.length) {
                                    break;
                                }
                                int i32 = iArr3[i31];
                                if (i32 == i30 || i32 > 0) {
                                    break;
                                }
                                i31++;
                                i30 = -1;
                            }
                            xv0Var3.Y0 = i31;
                        } else {
                            xv0Var3.Y0 = i11;
                        }
                    } else {
                        xv0Var3.Y0 = 14;
                    }
                } else {
                    xv0Var3.Y0 = 14;
                }
                xv0Var3.P0(i11);
                xv0Var3.d1 = chatFull2;
                xv0Var3.e1 = userFull;
                if (chatFull2 != null) {
                    xv0Var3.c1 = -chatFull2.migrated_from_chat_id;
                }
                xv0Var3.j1 = j10;
                i15 = 0;
                while (true) {
                    mv0VarArr = xv0Var3.t1;
                    if (i15 < mv0VarArr.length) {
                        break;
                    }
                    mv0VarArr[i15] = new mv0();
                    xv0Var3.t1[i15].j[0] = DialogObject.isEncryptedDialog(xv0Var3.j1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    xv0Var3.t1[i15].j[1] = Integer.MAX_VALUE;
                    xv0Var3.S(i15);
                    if (xv0Var3.c1 != 0 && xv0Var3.d1 != null && xv0Var3.t1[i15].b[1].size() == 0) {
                        mv0 mv0Var = xv0Var3.t1[i15];
                        mv0Var.j[1] = xv0Var3.d1.migrated_from_max_id;
                        mv0Var.i[1] = false;
                    }
                    i15++;
                }
                xv0Var3.v1 = o2Var;
                xv0Var3.G = o2Var.getActionBar();
                xv0Var3.m1[0] = xv0Var3.V0() > 0 ? SharedConfig.mediaColumnsCount : xv0Var3.V0();
                xv0Var3.m1[1] = xv0Var3.V0() > 0 ? SharedConfig.storiesColumnsCount : xv0Var3.V0();
                xv0Var3.H1 = o2Var.getNotificationCenter().createObserversGroup(xv0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i16 = 0; i16 < 10; i16++) {
                    if (i11 == 4) {
                        it0 it0Var = new it0(xv0Var3, context);
                        it0Var.T.c();
                        xv0Var3.G0.add(it0Var);
                    }
                }
                xv0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                xv0Var3.V0 = false;
                xv0Var3.W0 = null;
                kt0Var = xv0Var3.J0;
                if (kt0Var != null) {
                    kt0Var.g(false);
                }
                xv0Var3.U0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                xv0Var3.y0 = drawable;
                org.telegram.ui.ActionBar.r6.z(xv0Var3, drawable, org.telegram.ui.ActionBar.k6.b7, g6Var, PorterDuff.Mode.MULTIPLY);
                nt0 nt0Var = xv0Var3.I0;
                int currentTabId = nt0Var == null ? nt0Var.getCurrentTabId() : i11;
                nt0 nt0Var2 = new nt0(xv0Var3, context, xv0Var3.F1);
                i17 = xv0Var3.Y0;
                if (i17 != -1) {
                    nt0Var2.setInitialTabId(i17);
                    xv0Var3.Y0 = -1;
                }
                nt0Var2.b0 = 320L;
                int i33 = org.telegram.ui.ActionBar.k6.a;
                int i34 = org.telegram.ui.ActionBar.k6.Fh;
                int i35 = org.telegram.ui.ActionBar.k6.Eh;
                int i36 = org.telegram.ui.ActionBar.k6.a;
                nt0Var2.L = i34;
                nt0Var2.M = i35;
                nt0Var2.updateColors();
                nt0Var2.setUseMinimalWidth(true);
                nt0Var2.setDelegate(new pt0(xv0Var3));
                xv0Var3.I0 = nt0Var2;
                for (i18 = 1; i18 >= 0; i18--) {
                    xv0Var3.Z0[i18].clear();
                }
                xv0Var3.a1 = 0;
                xv0Var3.N0.clear();
                hv0Var = xv0Var3.R;
                if (hv0Var != null) {
                    hv0Var.w.clear();
                }
                if (!(xv0Var3 instanceof h40)) {
                    org.telegram.ui.ActionBar.y m10 = xv0Var3.G.m();
                    m10.addOnLayoutChangeListener(new ot0(xv0Var3));
                    if (xv0Var3.j1 == xv0Var3.v1.getUserConfig().getClientUserId() && (xv0Var3.v1 instanceof xa0) && xv0Var3.E()) {
                        xv0Var3.m0 = m10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.u0 a2 = m10.a(0, 0);
                    a2.F();
                    a2.H = new vt0(xv0Var3);
                    xv0Var3.n0 = a2;
                    a2.setTranslationY(AndroidUtilities.dp(10.0f));
                    kt0 kt0Var2 = xv0Var3.J0;
                    a2.setSearchFieldHint(LocaleController.getString((kt0Var2 != null && kt0Var2.a() && xv0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a2.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a2.setVisibility(xv0Var3.y0() ? 8 : 4);
                }
                imageView = new ImageView(context);
                xv0Var3.r0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!xv0Var3.s0() && !xv0Var3.w0()) {
                    xv0Var3.G.addView(imageView, w7.z5.e(48, 56, 85));
                    bk0 bk0Var = new bk0(context);
                    xv0Var3.s0 = bk0Var;
                    bk0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    bk0Var.e(R.raw.options_to_search, 24, 24);
                    bk0Var.getAnimatedDrawable().F *= 2.0f;
                    bk0Var.getAnimatedDrawable().h = true;
                    org.telegram.ui.ActionBar.r6.t(bk0Var, org.telegram.ui.ActionBar.k6.y8, g6Var, PorterDuff.Mode.SRC_IN);
                    bk0Var.setVisibility(8);
                    xv0Var3.G.addView(bk0Var, w7.z5.e(48, 56, 85));
                }
                g6Var2 = g6Var;
                context2 = context;
                imageView.setOnClickListener(new bu0(xv0Var3, j10, g6Var2, context));
                u0Var = xv0Var3.n0;
                if (u0Var != null) {
                    EditTextBoldCursor searchField = u0Var.getSearchField();
                    int i37 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.W(searchField, i37, g6Var2);
                    org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Si, g6Var2);
                    org.telegram.ui.ActionBar.r6.x(searchField, i37, g6Var2);
                }
                xv0Var3.x0 = 0;
                org.telegram.ui.ActionBar.o2 o2Var2 = xv0Var3.v1;
                ow0 ow0Var = (o2Var2 == null && (o2Var2.getFragmentView() instanceof ow0)) ? (ow0) xv0Var3.v1.getFragmentView() : null;
                ha haVar = new ha(context2, ow0Var);
                xv0Var3.B0 = haVar;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, haVar, g6Var2);
                haVar.setAlpha(0.0f);
                haVar.setClickable(true);
                haVar.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                xv0Var3.C0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
                xv0Var3.D0 = h2Var;
                imageView2.setImageDrawable(h2Var);
                int i38 = org.telegram.ui.ActionBar.k6.y8;
                h2Var.a(xv0Var3.j0(i38));
                int i39 = org.telegram.ui.ActionBar.k6.z8;
                org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.f0(xv0Var3.j0(i39), 1), null, org.telegram.ui.ActionBar.r6.O(i39), g6Var2);
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                haVar.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                xv0Var3.N0.add(imageView2);
                imageView2.setOnClickListener(new tr0(xv0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                xv0Var3.A0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(xv0Var3.j0(i38));
                haVar.addView(numberTextView, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
                xv0Var3.N0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(xv0Var3.j1)) {
                    if (!xv0Var3.y0()) {
                        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context2, xv0Var3.j0(i39), xv0Var3.j0(i38), false);
                        xv0Var3.u0 = u0Var2;
                        u0Var2.setIcon(R.drawable.msg_message);
                        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        u0Var2.setDuplicateParentStateEnabled(false);
                        haVar.addView(u0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        xv0Var3.N0.add(u0Var2);
                        u0Var2.setOnClickListener(new tr0(xv0Var3, 1));
                        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context2, xv0Var3.j0(i39), xv0Var3.j0(i38), false);
                        xv0Var3.t0 = u0Var3;
                        u0Var3.setIcon(R.drawable.msg_forward);
                        u0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        u0Var3.setDuplicateParentStateEnabled(false);
                        haVar.addView(u0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        xv0Var3.N0.add(u0Var3);
                        u0Var3.setOnClickListener(new tr0(xv0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context2, xv0Var3.j0(i39), xv0Var3.j0(i38), false);
                    xv0Var3.v0 = u0Var4;
                    u0Var4.setIcon(R.drawable.msg_pin);
                    u0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    u0Var4.setDuplicateParentStateEnabled(false);
                    u0Var4.setVisibility(8);
                    haVar.addView(u0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    xv0Var3.N0.add(u0Var4);
                    u0Var4.setOnClickListener(new tr0(xv0Var3, 3));
                    org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context2, xv0Var3.j0(i39), xv0Var3.j0(i38), false);
                    xv0Var3.w0 = u0Var5;
                    u0Var5.setIcon(R.drawable.msg_unpin);
                    u0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    u0Var5.setDuplicateParentStateEnabled(false);
                    u0Var5.setVisibility(8);
                    haVar.addView(u0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    xv0Var3.N0.add(u0Var5);
                    u0Var5.setOnClickListener(new tr0(xv0Var3, 4));
                    xv0Var3.t1();
                }
                org.telegram.ui.ActionBar.u0 u0Var6 = new org.telegram.ui.ActionBar.u0(context2, xv0Var3.j0(i39), xv0Var3.j0(i38), false);
                xv0Var3.l0 = u0Var6;
                u0Var6.setIcon(R.drawable.msg_delete);
                u0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                u0Var6.setDuplicateParentStateEnabled(false);
                haVar.addView(u0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                xv0Var3.N0.add(u0Var6);
                u0Var6.setOnClickListener(new tr0(xv0Var3, 5));
                xv0Var3.C(xv0Var3.u0);
                xv0Var3.C(xv0Var3.t0);
                xv0Var3.C(xv0Var3.v0);
                xv0Var3.C(xv0Var3.w0);
                xv0Var3.C(u0Var6);
                xv0Var3.H = new cu0(xv0Var3, context2);
                xv0Var3.I = new rv0(xv0Var3, context2);
                xv0Var3.K = new kv0(xv0Var3, context2, 1);
                xv0Var3.L = new kv0(xv0Var3, context2, 2);
                xv0Var3.M = new kv0(xv0Var3, context2, 4);
                xv0Var3.N = new ev0(xv0Var3, context2, xv0Var3.v1.getCurrentAccount(), xv0Var3.v1.getResourceProvider());
                xv0Var3.O = new lu0(xv0Var3, context2);
                xv0Var3.g0 = new tu0(xv0Var3, context2, 1);
                xv0Var3.h0 = new tu0(xv0Var3, context2, 4);
                xv0Var3.i0 = new tu0(xv0Var3, context2, 3);
                xv0Var3.j0 = new ou0(xv0Var3, context2);
                xv0Var3.P = new iu0(xv0Var3, context2);
                xv0Var3.Q = new gu0(xv0Var3, context2);
                xv0Var3.R = new hv0(xv0Var3, context2);
                xv0Var3.S = new iv0(xv0Var3, context2);
                if (!xv0Var3.y0() && !xv0Var3.n0() && xv0Var3.F == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", xv0Var3.v1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    du0 du0Var = new du0(xv0Var3, context2, xv0Var3.v1.getParentLayout(), bundle);
                    xv0Var3.T = du0Var;
                    long j12 = xv0Var3.j1;
                    org.telegram.ui.tn tnVar = du0Var.a;
                    tnVar.p4 = j12;
                    tnVar.cb = true;
                    du0Var.setClipToOutline(true);
                    du0Var.setOutlineProvider(new eu0());
                }
                hu0 hu0Var = new hu0(xv0Var3, context2);
                xv0Var3.a0 = hu0Var;
                if (xv0Var3.F == 0) {
                    hu0Var.e = arrayList;
                    hu0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                xv0Var3.c0 = new fu0(xv0Var3, context2);
                xv0Var3.b0 = new s4.y(new ks0(xv0Var3));
                xv0Var3.d0 = new uv0(xv0Var3, context2, false);
                xv0Var3.e0 = new ls0(xv0Var3, context2);
                xv0Var3.f0 = new uv0(xv0Var3, context2, true);
                xv0Var3.J = new lv0(xv0Var3, context2);
                f7 = 48.0f;
                if (xv0Var3.t0()) {
                    boolean z10 = xv0Var3.v1 instanceof ProfileActivity;
                    xv0Var = xv0Var3;
                    if (z10) {
                        TextView textView = new TextView(context2);
                        xv0Var3.q0 = textView;
                        textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                        textView.setTypeface(AndroidUtilities.bold());
                        int i40 = org.telegram.ui.ActionBar.k6.Oh;
                        org.telegram.ui.ActionBar.r6.W(textView, i40, g6Var2);
                        textView.setTextSize(1, 15.0f);
                        textView.setGravity(17);
                        org.telegram.ui.ActionBar.r6.S(textView, org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.o1(0.15f, xv0Var3.j0(i40)), 3), null, org.telegram.ui.ActionBar.r6.M(0.15f, i40), g6Var2);
                        textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                        xv0Var3.G.addView(textView, w7.z5.e(-2, 56, 85));
                        textView.setOnClickListener(new tr0(xv0Var3, 6));
                        textView.setVisibility(8);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(0.4f);
                        textView.setScaleY(0.4f);
                        org.telegram.ui.ActionBar.o2 o2Var3 = xv0Var3.v1;
                        ns0 ns0Var = new ns0(o2Var3.getCurrentAccount(), ((ProfileActivity) xv0Var3.v1).a(), context2, o2Var3, g6Var2, xv0Var3);
                        context2 = context2;
                        g6Var2 = g6Var2;
                        xv0 xv0Var4 = xv0Var3;
                        xv0Var4.V = ns0Var;
                        int dp = AndroidUtilities.dp(48.0f);
                        us usVar = xv0Var4.P0;
                        ns0Var.setPaddingTop(dp + (usVar != null ? (int) usVar.c(0.0f) : 0));
                        xv0Var4.W = new ss0(xv0Var4, context2, ow0Var, xv0Var4.getStoriesController().B(xv0Var4.j1, true), new rs0(xv0Var4, context2, o2Var, g6Var2));
                        xv0Var = xv0Var4;
                    }
                } else {
                    xv0Var3.U = new ms0(xv0Var3, context2, xv0Var3.v1, xv0Var3.j1);
                    xv0Var = xv0Var3;
                }
                xv0Var.setWillNotDraw(false);
                i19 = 0;
                i20 = -1;
                i21 = 0;
                while (true) {
                    qu0VarArr = xv0Var.k0;
                    if (i21 < qu0VarArr.length) {
                        break;
                    }
                    if (i21 == 0 && (qu0Var = qu0VarArr[i21]) != null && (us0Var2 = qu0Var.x) != null) {
                        i20 = us0Var2.L0();
                        if (i20 != xv0Var.k0[i21].x.B() - 1) {
                            pu0Var19 = xv0Var.k0[i21].h;
                            wl0 wl0Var = (wl0) pu0Var19.K(i20);
                            if (wl0Var != null) {
                                i19 = wl0Var.a.getTop();
                            } else {
                                i20 = -1;
                            }
                        } else {
                            i22 = i19;
                            i23 = -1;
                            ts0 ts0Var = new ts0(xv0Var, context2);
                            xv0Var.addView(ts0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, xv0Var.E0(), 0.0f, 0.0f));
                            if (i21 == 1) {
                                ts0Var.setTranslationX(AndroidUtilities.displaySize.x);
                            }
                            xv0Var.k0[i21] = ts0Var;
                            us0Var = new us0(xv0Var, ts0Var);
                            ts0Var.x = us0Var;
                            us0Var.z1(new vs0(xv0Var, ts0Var));
                            xv0Var.k0[i21].d = new s4.k();
                            xv0Var.k0[i21].d.n(280L);
                            xv0Var.k0[i21].d.o(bs.h);
                            qu0 qu0Var2 = xv0Var.k0[i21];
                            qu0Var2.d.m = false;
                            qu0Var2.h = new ws0(xv0Var, context2, ts0Var, us0Var);
                            pu0Var = xv0Var.k0[i21].h;
                            pu0Var.setFastScrollEnabled(1);
                            pu0Var2 = xv0Var.k0[i21].h;
                            pu0Var2.setScrollingTouchSlop(1);
                            pu0Var3 = xv0Var.k0[i21].h;
                            pu0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                            pu0Var4 = xv0Var.k0[i21].h;
                            pu0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                            pu0Var5 = xv0Var.k0[i21].h;
                            pu0Var5.setItemAnimator(null);
                            pu0Var6 = xv0Var.k0[i21].h;
                            pu0Var6.setClipToPadding(false);
                            pu0Var7 = xv0Var.k0[i21].h;
                            pu0Var7.setSectionsType(2);
                            pu0Var8 = xv0Var.k0[i21].h;
                            pu0Var8.setLayoutManager(us0Var);
                            qu0 qu0Var3 = xv0Var.k0[i21];
                            pu0Var9 = qu0Var3.h;
                            qu0Var3.addView(pu0Var9, w7.z5.c(-1.0f, -1));
                            xv0Var.k0[i21].r = new pu0(context2);
                            qu0 qu0Var4 = xv0Var.k0[i21];
                            pu0 pu0Var20 = qu0Var4.r;
                            ys0 ys0Var = new ys0(xv0Var);
                            qu0Var4.s = ys0Var;
                            pu0Var20.setLayoutManager(ys0Var);
                            qu0 qu0Var5 = xv0Var.k0[i21];
                            qu0Var5.addView(qu0Var5.r, w7.z5.c(-1.0f, -1));
                            xv0Var.k0[i21].r.setVisibility(8);
                            xv0Var.k0[i21].r.i(new zs0(ts0Var));
                            pu0Var10 = xv0Var.k0[i21].h;
                            pu0Var10.i(new at0(xv0Var, ts0Var));
                            pu0Var11 = xv0Var.k0[i21].h;
                            float f10 = f7;
                            pu0Var11.setOnItemClickListener(new ai.r4(xv0Var, ts0Var, context2, j10, g6Var2, 2));
                            pu0Var12 = xv0Var.k0[i21].h;
                            pu0Var12.setOnScrollListener(new ct0(xv0Var, ts0Var, us0Var));
                            pu0Var13 = xv0Var.k0[i21].h;
                            pu0Var13.setOnItemLongClickListener(new dt0(xv0Var, ts0Var));
                            if (i21 == 0 && i23 != -1) {
                                us0Var.h1(i23, i22);
                            }
                            pu0Var14 = xv0Var.k0[i21].h;
                            xv0Var.k0[i21].y = new et0(context2, pu0Var14);
                            xv0Var.k0[i21].y.setVisibility(8);
                            pu0Var15 = xv0Var.k0[i21].h;
                            pu0Var15.D0(xv0Var.k0[i21].y, w7.z5.c(-1.0f, -1));
                            xv0Var.k0[i21].v = new ft0(xv0Var, context2, ts0Var);
                            xv0Var.k0[i21].v.f();
                            xv0Var.k0[i21].v.setClipToOutline(true);
                            xv0Var.k0[i21].v.setOutlineProvider(new gt0());
                            if (i21 == 0) {
                                xv0Var.k0[i21].setVisibility(8);
                            }
                            qu0 qu0Var6 = xv0Var.k0[i21];
                            qu0Var6.w = new ht0(xv0Var, context2, qu0Var6.v);
                            wx0Var = xv0Var.k0[i21].w;
                            wx0Var.d(8, false);
                            wx0Var2 = xv0Var.k0[i21].w;
                            wx0Var2.setAnimateLayoutChange(true);
                            qu0 qu0Var7 = xv0Var.k0[i21];
                            wx0Var3 = qu0Var7.w;
                            qu0Var7.addView(wx0Var3, w7.z5.c(-1.0f, -1));
                            wx0Var4 = xv0Var.k0[i21].w;
                            wx0Var4.setOnTouchListener(new di.d(23));
                            wx0Var5 = xv0Var.k0[i21].w;
                            wx0Var5.e(true, false);
                            wx0Var6 = xv0Var.k0[i21].w;
                            wx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                            wx0Var7 = xv0Var.k0[i21].w;
                            wx0Var7.f.setVisibility(8);
                            wx0Var8 = xv0Var.k0[i21].w;
                            wx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                            wx0Var9 = xv0Var.k0[i21].w;
                            wx0Var9.f.setVisibility(8);
                            wx0Var10 = xv0Var.k0[i21].w;
                            wx0Var10.addView(xv0Var.k0[i21].v, w7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                            pu0Var16 = xv0Var.k0[i21].h;
                            wx0Var11 = xv0Var.k0[i21].w;
                            pu0Var16.setEmptyView(wx0Var11);
                            pu0Var17 = xv0Var.k0[i21].h;
                            pu0Var17.q1(0, true);
                            qu0[] qu0VarArr2 = xv0Var.k0;
                            qu0 qu0Var8 = qu0VarArr2[i21];
                            pu0Var18 = qu0VarArr2[i21].h;
                            qu0Var8.E = new pl0(pu0Var18, xv0Var.k0[i21].x);
                            i21++;
                            f7 = f10;
                            g6Var2 = g6Var;
                            i19 = i22;
                            i20 = i23;
                        }
                    }
                    i22 = i19;
                    i23 = i20;
                    ts0 ts0Var2 = new ts0(xv0Var, context2);
                    xv0Var.addView(ts0Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, xv0Var.E0(), 0.0f, 0.0f));
                    if (i21 == 1) {
                    }
                    xv0Var.k0[i21] = ts0Var2;
                    us0Var = new us0(xv0Var, ts0Var2);
                    ts0Var2.x = us0Var;
                    us0Var.z1(new vs0(xv0Var, ts0Var2));
                    xv0Var.k0[i21].d = new s4.k();
                    xv0Var.k0[i21].d.n(280L);
                    xv0Var.k0[i21].d.o(bs.h);
                    qu0 qu0Var22 = xv0Var.k0[i21];
                    qu0Var22.d.m = false;
                    qu0Var22.h = new ws0(xv0Var, context2, ts0Var2, us0Var);
                    pu0Var = xv0Var.k0[i21].h;
                    pu0Var.setFastScrollEnabled(1);
                    pu0Var2 = xv0Var.k0[i21].h;
                    pu0Var2.setScrollingTouchSlop(1);
                    pu0Var3 = xv0Var.k0[i21].h;
                    pu0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                    pu0Var4 = xv0Var.k0[i21].h;
                    pu0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                    pu0Var5 = xv0Var.k0[i21].h;
                    pu0Var5.setItemAnimator(null);
                    pu0Var6 = xv0Var.k0[i21].h;
                    pu0Var6.setClipToPadding(false);
                    pu0Var7 = xv0Var.k0[i21].h;
                    pu0Var7.setSectionsType(2);
                    pu0Var8 = xv0Var.k0[i21].h;
                    pu0Var8.setLayoutManager(us0Var);
                    qu0 qu0Var32 = xv0Var.k0[i21];
                    pu0Var9 = qu0Var32.h;
                    qu0Var32.addView(pu0Var9, w7.z5.c(-1.0f, -1));
                    xv0Var.k0[i21].r = new pu0(context2);
                    qu0 qu0Var42 = xv0Var.k0[i21];
                    pu0 pu0Var202 = qu0Var42.r;
                    ys0 ys0Var2 = new ys0(xv0Var);
                    qu0Var42.s = ys0Var2;
                    pu0Var202.setLayoutManager(ys0Var2);
                    qu0 qu0Var52 = xv0Var.k0[i21];
                    qu0Var52.addView(qu0Var52.r, w7.z5.c(-1.0f, -1));
                    xv0Var.k0[i21].r.setVisibility(8);
                    xv0Var.k0[i21].r.i(new zs0(ts0Var2));
                    pu0Var10 = xv0Var.k0[i21].h;
                    pu0Var10.i(new at0(xv0Var, ts0Var2));
                    pu0Var11 = xv0Var.k0[i21].h;
                    float f102 = f7;
                    pu0Var11.setOnItemClickListener(new ai.r4(xv0Var, ts0Var2, context2, j10, g6Var2, 2));
                    pu0Var12 = xv0Var.k0[i21].h;
                    pu0Var12.setOnScrollListener(new ct0(xv0Var, ts0Var2, us0Var));
                    pu0Var13 = xv0Var.k0[i21].h;
                    pu0Var13.setOnItemLongClickListener(new dt0(xv0Var, ts0Var2));
                    if (i21 == 0) {
                        us0Var.h1(i23, i22);
                    }
                    pu0Var14 = xv0Var.k0[i21].h;
                    xv0Var.k0[i21].y = new et0(context2, pu0Var14);
                    xv0Var.k0[i21].y.setVisibility(8);
                    pu0Var15 = xv0Var.k0[i21].h;
                    pu0Var15.D0(xv0Var.k0[i21].y, w7.z5.c(-1.0f, -1));
                    xv0Var.k0[i21].v = new ft0(xv0Var, context2, ts0Var2);
                    xv0Var.k0[i21].v.f();
                    xv0Var.k0[i21].v.setClipToOutline(true);
                    xv0Var.k0[i21].v.setOutlineProvider(new gt0());
                    if (i21 == 0) {
                    }
                    qu0 qu0Var62 = xv0Var.k0[i21];
                    qu0Var62.w = new ht0(xv0Var, context2, qu0Var62.v);
                    wx0Var = xv0Var.k0[i21].w;
                    wx0Var.d(8, false);
                    wx0Var2 = xv0Var.k0[i21].w;
                    wx0Var2.setAnimateLayoutChange(true);
                    qu0 qu0Var72 = xv0Var.k0[i21];
                    wx0Var3 = qu0Var72.w;
                    qu0Var72.addView(wx0Var3, w7.z5.c(-1.0f, -1));
                    wx0Var4 = xv0Var.k0[i21].w;
                    wx0Var4.setOnTouchListener(new di.d(23));
                    wx0Var5 = xv0Var.k0[i21].w;
                    wx0Var5.e(true, false);
                    wx0Var6 = xv0Var.k0[i21].w;
                    wx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    wx0Var7 = xv0Var.k0[i21].w;
                    wx0Var7.f.setVisibility(8);
                    wx0Var8 = xv0Var.k0[i21].w;
                    wx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    wx0Var9 = xv0Var.k0[i21].w;
                    wx0Var9.f.setVisibility(8);
                    wx0Var10 = xv0Var.k0[i21].w;
                    wx0Var10.addView(xv0Var.k0[i21].v, w7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    pu0Var16 = xv0Var.k0[i21].h;
                    wx0Var11 = xv0Var.k0[i21].w;
                    pu0Var16.setEmptyView(wx0Var11);
                    pu0Var17 = xv0Var.k0[i21].h;
                    pu0Var17.q1(0, true);
                    qu0[] qu0VarArr22 = xv0Var.k0;
                    qu0 qu0Var82 = qu0VarArr22[i21];
                    pu0Var18 = qu0VarArr22[i21].h;
                    qu0Var82.E = new pl0(pu0Var18, xv0Var.k0[i21].x);
                    i21++;
                    f7 = f102;
                    g6Var2 = g6Var;
                    i19 = i22;
                    i20 = i23;
                }
                float f11 = f7;
                view = xv0Var.W;
                if (view != null) {
                    xv0Var.addView(view, w7.z5.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                }
                org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context2);
                xv0Var.K0 = v0Var;
                v0Var.W((int) (System.currentTimeMillis() / 1000), false, false);
                v0Var.setAlpha(0.0f);
                v0Var.Y(org.telegram.ui.ActionBar.k6.wc, org.telegram.ui.ActionBar.k6.kd);
                v0Var.setTranslationY(-AndroidUtilities.dp(f11));
                xv0Var.addView(v0Var, w7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                O = xv0Var.O();
                xv0Var2 = xv0Var;
                if (!O) {
                    us usVar2 = new us(context2);
                    xv0Var.P0 = usVar2;
                    usVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                    dh.d b10 = bVar2.b(usVar2, fh.c.n(g6Var));
                    b10.q(AndroidUtilities.dp(24.0f));
                    b10.p(AndroidUtilities.dp(7.0f));
                    usVar2.setBlurredBackground(b10);
                    FrameLayout frameLayout = new FrameLayout(context2);
                    xv0Var.Q0 = frameLayout;
                    usVar2.addView(frameLayout);
                    usVar2.i(frameLayout, true, false);
                    usVar2.setOnAnimatedHeightChangedListener(new rr0(xv0Var, 0));
                    jt0 jt0Var = new jt0(xv0Var, context2, o2Var, this, g6Var);
                    xv0Var.R0 = jt0Var;
                    frameLayout.addView(jt0Var);
                    usVar2.setCallFragmentContextView(jt0Var);
                    xv0Var.addView(usVar2, w7.z5.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                    jt0Var.setDelegate(new sr0(xv0Var));
                    dh.d b11 = bVar2.b(xv0Var.I0, fh.c.n(g6Var));
                    b11.q(AndroidUtilities.dp(18.0f));
                    b11.p(AndroidUtilities.dp(6.666f));
                    xv0Var.I0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    xv0Var.I0.setClipToPadding(false);
                    xv0Var.I0.setBackground(null);
                    xv0Var.I0.setBlurredBackground(b11);
                    xv0Var.I0.setOpen(false);
                    xv0Var.addView(xv0Var.I0, w7.z5.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                    Context context3 = xv0Var.getContext();
                    org.telegram.ui.ActionBar.o2 o2Var4 = xv0Var.v1;
                    xv0 xv0Var5 = xv0Var;
                    kt0 kt0Var3 = new kt0(o2Var4.getCurrentAccount(), xv0Var.n0() ? 0L : xv0Var.j1, context3, o2Var4, g6Var, xv0Var5);
                    xv0 xv0Var6 = xv0Var5;
                    xv0Var6.J0 = kt0Var3;
                    kt0Var3.d(bVar2, fh.c.n(g6Var));
                    kt0Var3.setShown(0.0f);
                    xv0Var6.addView(kt0Var3, w7.z5.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                    xv0Var6.addView(xv0Var6.B0, w7.z5.e(-1, 48, 51));
                    xv0Var2 = xv0Var6;
                }
                xv0Var2.A1(false);
                xv0Var2.p1(false);
                if (xv0Var2.X0[0] >= 0) {
                    xv0Var2.C0(false);
                }
                ss0Var = xv0Var2.W;
                if (ss0Var != null && i12 > 0) {
                    ss0Var.setInitialTabId(i12);
                }
                xv0Var2.d2 = new kh(xv0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        i14 = 1;
        if (i11 != 14) {
        }
        xv0Var3.Y0 = i11;
        xv0Var3.P0(i11);
        xv0Var3.d1 = chatFull2;
        xv0Var3.e1 = userFull;
        if (chatFull2 != null) {
        }
        xv0Var3.j1 = j10;
        i15 = 0;
        while (true) {
            mv0VarArr = xv0Var3.t1;
            if (i15 < mv0VarArr.length) {
            }
            i15++;
        }
        xv0Var3.v1 = o2Var;
        xv0Var3.G = o2Var.getActionBar();
        xv0Var3.m1[0] = xv0Var3.V0() > 0 ? SharedConfig.mediaColumnsCount : xv0Var3.V0();
        xv0Var3.m1[1] = xv0Var3.V0() > 0 ? SharedConfig.storiesColumnsCount : xv0Var3.V0();
        xv0Var3.H1 = o2Var.getNotificationCenter().createObserversGroup(xv0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i16 < 10) {
        }
        xv0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        xv0Var3.V0 = false;
        xv0Var3.W0 = null;
        kt0Var = xv0Var3.J0;
        if (kt0Var != null) {
        }
        xv0Var3.U0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        xv0Var3.y0 = drawable2;
        org.telegram.ui.ActionBar.r6.z(xv0Var3, drawable2, org.telegram.ui.ActionBar.k6.b7, g6Var, PorterDuff.Mode.MULTIPLY);
        nt0 nt0Var3 = xv0Var3.I0;
        if (nt0Var3 == null) {
        }
        nt0 nt0Var22 = new nt0(xv0Var3, context, xv0Var3.F1);
        i17 = xv0Var3.Y0;
        if (i17 != -1) {
        }
        nt0Var22.b0 = 320L;
        int i332 = org.telegram.ui.ActionBar.k6.a;
        int i342 = org.telegram.ui.ActionBar.k6.Fh;
        int i352 = org.telegram.ui.ActionBar.k6.Eh;
        int i362 = org.telegram.ui.ActionBar.k6.a;
        nt0Var22.L = i342;
        nt0Var22.M = i352;
        nt0Var22.updateColors();
        nt0Var22.setUseMinimalWidth(true);
        nt0Var22.setDelegate(new pt0(xv0Var3));
        xv0Var3.I0 = nt0Var22;
        while (i18 >= 0) {
        }
        xv0Var3.a1 = 0;
        xv0Var3.N0.clear();
        hv0Var = xv0Var3.R;
        if (hv0Var != null) {
        }
        if (!(xv0Var3 instanceof h40)) {
        }
        imageView = new ImageView(context);
        xv0Var3.r0 = imageView;
        imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView.setVisibility(4);
        if (!xv0Var3.s0()) {
            xv0Var3.G.addView(imageView, w7.z5.e(48, 56, 85));
            bk0 bk0Var2 = new bk0(context);
            xv0Var3.s0 = bk0Var2;
            bk0Var2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            bk0Var2.e(R.raw.options_to_search, 24, 24);
            bk0Var2.getAnimatedDrawable().F *= 2.0f;
            bk0Var2.getAnimatedDrawable().h = true;
            org.telegram.ui.ActionBar.r6.t(bk0Var2, org.telegram.ui.ActionBar.k6.y8, g6Var, PorterDuff.Mode.SRC_IN);
            bk0Var2.setVisibility(8);
            xv0Var3.G.addView(bk0Var2, w7.z5.e(48, 56, 85));
        }
        g6Var2 = g6Var;
        context2 = context;
        imageView.setOnClickListener(new bu0(xv0Var3, j10, g6Var2, context));
        u0Var = xv0Var3.n0;
        if (u0Var != null) {
        }
        xv0Var3.x0 = 0;
        org.telegram.ui.ActionBar.o2 o2Var22 = xv0Var3.v1;
        if (o2Var22 == null) {
        }
        ha haVar2 = new ha(context2, ow0Var);
        xv0Var3.B0 = haVar2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, haVar2, g6Var2);
        haVar2.setAlpha(0.0f);
        haVar2.setClickable(true);
        haVar2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        xv0Var3.C0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.h2 h2Var2 = new org.telegram.ui.ActionBar.h2(true);
        xv0Var3.D0 = h2Var2;
        imageView22.setImageDrawable(h2Var2);
        int i382 = org.telegram.ui.ActionBar.k6.y8;
        h2Var2.a(xv0Var3.j0(i382));
        int i392 = org.telegram.ui.ActionBar.k6.z8;
        org.telegram.ui.ActionBar.r6.S(imageView22, org.telegram.ui.ActionBar.k6.f0(xv0Var3.j0(i392), 1), null, org.telegram.ui.ActionBar.r6.O(i392), g6Var2);
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        haVar2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        xv0Var3.N0.add(imageView22);
        imageView22.setOnClickListener(new tr0(xv0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        xv0Var3.A0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(xv0Var3.j0(i382));
        haVar2.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
        xv0Var3.N0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(xv0Var3.j1)) {
        }
        org.telegram.ui.ActionBar.u0 u0Var62 = new org.telegram.ui.ActionBar.u0(context2, xv0Var3.j0(i392), xv0Var3.j0(i382), false);
        xv0Var3.l0 = u0Var62;
        u0Var62.setIcon(R.drawable.msg_delete);
        u0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        u0Var62.setDuplicateParentStateEnabled(false);
        haVar2.addView(u0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        xv0Var3.N0.add(u0Var62);
        u0Var62.setOnClickListener(new tr0(xv0Var3, 5));
        xv0Var3.C(xv0Var3.u0);
        xv0Var3.C(xv0Var3.t0);
        xv0Var3.C(xv0Var3.v0);
        xv0Var3.C(xv0Var3.w0);
        xv0Var3.C(u0Var62);
        xv0Var3.H = new cu0(xv0Var3, context2);
        xv0Var3.I = new rv0(xv0Var3, context2);
        xv0Var3.K = new kv0(xv0Var3, context2, 1);
        xv0Var3.L = new kv0(xv0Var3, context2, 2);
        xv0Var3.M = new kv0(xv0Var3, context2, 4);
        xv0Var3.N = new ev0(xv0Var3, context2, xv0Var3.v1.getCurrentAccount(), xv0Var3.v1.getResourceProvider());
        xv0Var3.O = new lu0(xv0Var3, context2);
        xv0Var3.g0 = new tu0(xv0Var3, context2, 1);
        xv0Var3.h0 = new tu0(xv0Var3, context2, 4);
        xv0Var3.i0 = new tu0(xv0Var3, context2, 3);
        xv0Var3.j0 = new ou0(xv0Var3, context2);
        xv0Var3.P = new iu0(xv0Var3, context2);
        xv0Var3.Q = new gu0(xv0Var3, context2);
        xv0Var3.R = new hv0(xv0Var3, context2);
        xv0Var3.S = new iv0(xv0Var3, context2);
        if (!xv0Var3.y0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", xv0Var3.v1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            du0 du0Var2 = new du0(xv0Var3, context2, xv0Var3.v1.getParentLayout(), bundle2);
            xv0Var3.T = du0Var2;
            long j122 = xv0Var3.j1;
            org.telegram.ui.tn tnVar2 = du0Var2.a;
            tnVar2.p4 = j122;
            tnVar2.cb = true;
            du0Var2.setClipToOutline(true);
            du0Var2.setOutlineProvider(new eu0());
        }
        hu0 hu0Var2 = new hu0(xv0Var3, context2);
        xv0Var3.a0 = hu0Var2;
        if (xv0Var3.F == 0) {
        }
        xv0Var3.c0 = new fu0(xv0Var3, context2);
        xv0Var3.b0 = new s4.y(new ks0(xv0Var3));
        xv0Var3.d0 = new uv0(xv0Var3, context2, false);
        xv0Var3.e0 = new ls0(xv0Var3, context2);
        xv0Var3.f0 = new uv0(xv0Var3, context2, true);
        xv0Var3.J = new lv0(xv0Var3, context2);
        f7 = 48.0f;
        if (xv0Var3.t0()) {
        }
        xv0Var.setWillNotDraw(false);
        i19 = 0;
        i20 = -1;
        i21 = 0;
        while (true) {
            qu0VarArr = xv0Var.k0;
            if (i21 < qu0VarArr.length) {
            }
            qu0 qu0Var622 = xv0Var.k0[i21];
            qu0Var622.w = new ht0(xv0Var, context2, qu0Var622.v);
            wx0Var = xv0Var.k0[i21].w;
            wx0Var.d(8, false);
            wx0Var2 = xv0Var.k0[i21].w;
            wx0Var2.setAnimateLayoutChange(true);
            qu0 qu0Var722 = xv0Var.k0[i21];
            wx0Var3 = qu0Var722.w;
            qu0Var722.addView(wx0Var3, w7.z5.c(-1.0f, -1));
            wx0Var4 = xv0Var.k0[i21].w;
            wx0Var4.setOnTouchListener(new di.d(23));
            wx0Var5 = xv0Var.k0[i21].w;
            wx0Var5.e(true, false);
            wx0Var6 = xv0Var.k0[i21].w;
            wx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            wx0Var7 = xv0Var.k0[i21].w;
            wx0Var7.f.setVisibility(8);
            wx0Var8 = xv0Var.k0[i21].w;
            wx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            wx0Var9 = xv0Var.k0[i21].w;
            wx0Var9.f.setVisibility(8);
            wx0Var10 = xv0Var.k0[i21].w;
            wx0Var10.addView(xv0Var.k0[i21].v, w7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            pu0Var16 = xv0Var.k0[i21].h;
            wx0Var11 = xv0Var.k0[i21].w;
            pu0Var16.setEmptyView(wx0Var11);
            pu0Var17 = xv0Var.k0[i21].h;
            pu0Var17.q1(0, true);
            qu0[] qu0VarArr222 = xv0Var.k0;
            qu0 qu0Var822 = qu0VarArr222[i21];
            pu0Var18 = qu0VarArr222[i21].h;
            qu0Var822.E = new pl0(pu0Var18, xv0Var.k0[i21].x);
            i21++;
            f7 = f102;
            g6Var2 = g6Var;
            i19 = i22;
            i20 = i23;
        }
        float f112 = f7;
        view = xv0Var.W;
        if (view != null) {
        }
        org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(context2);
        xv0Var.K0 = v0Var2;
        v0Var2.W((int) (System.currentTimeMillis() / 1000), false, false);
        v0Var2.setAlpha(0.0f);
        v0Var2.Y(org.telegram.ui.ActionBar.k6.wc, org.telegram.ui.ActionBar.k6.kd);
        v0Var2.setTranslationY(-AndroidUtilities.dp(f112));
        xv0Var.addView(v0Var2, w7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        O = xv0Var.O();
        xv0Var2 = xv0Var;
        if (!O) {
        }
        xv0Var2.A1(false);
        xv0Var2.p1(false);
        if (xv0Var2.X0[0] >= 0) {
        }
        ss0Var = xv0Var2.W;
        if (ss0Var != null) {
            ss0Var.setInitialTabId(i12);
        }
        xv0Var2.d2 = new kh(xv0Var2, 2);
    }

    public static ku0 N(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        ku0 ku0Var = new ku0(context, g6Var);
        TextView textView = ku0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ku0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ku0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ku0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ku0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ku0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ku0Var;
        }
        ImageView imageView = ku0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return ku0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return ku0Var;
    }

    public static TLRPC.ProfileTab f0(int i10, boolean z10) {
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

    public static void g(xv0 xv0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(xv0Var, i10, storyItem, 16);
        ci.h7 storiesController = xv0Var.getStoriesController();
        long j10 = xv0Var.j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        xc.a0(xv0Var.v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), h4Var).j();
    }

    public static int g0(TLRPC.ProfileTab profileTab) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public ci.h7 getStoriesController() {
        return MessagesController.getInstance(this.v1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(xv0 xv0Var, TL_stories.StoryItem storyItem) {
        xv0Var.getStoriesController().o0(xv0Var.j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        xc.a0(xv0Var.v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(xv0 xv0Var, long j10, int i10, String str) {
        ci.v6 B = xv0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ci.a7) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(xv0 xv0Var, TL_stories.StoryItem storyItem, ci.a7 a7Var) {
        xv0Var.getStoriesController().c(a7Var.a, xv0Var.j1, storyItem);
        AndroidUtilities.runOnUIThread(new ko0(7, xv0Var, a7Var), 100L);
    }

    public static void m(xv0 xv0Var, HashSet hashSet, TL_stories.StoryItem storyItem, j80 j80Var, ci.a7 a7Var) {
        String formatString;
        long j10 = xv0Var.j1;
        if (hashSet.contains(Integer.valueOf(a7Var.a))) {
            xv0Var.getStoriesController().c(a7Var.a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, a7Var.b);
        } else {
            ci.h7 storiesController = xv0Var.getStoriesController();
            int i10 = a7Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, a7Var.b);
        }
        xc.a0(xv0Var.v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        j80Var.u();
    }

    public static void n(xv0 xv0Var, long j10, int i10) {
        ci.v6 B = xv0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ci.a7 a7Var = (ci.a7) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = a7Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(xv0 xv0Var, s4.g0 g0Var) {
        if (g0Var == xv0Var.d0) {
            return 8;
        }
        if (g0Var == xv0Var.f0) {
            return 9;
        }
        for (wv0 wv0Var : xv0Var.Z1.values()) {
            if (wv0Var.d == g0Var) {
                return wv0Var.a;
            }
        }
        return -1;
    }

    public static int q(View view) {
        if (view instanceof org.telegram.ui.Cells.s7) {
            return ((org.telegram.ui.Cells.s7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            return ((org.telegram.ui.Cells.k7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            return ((org.telegram.ui.Cells.j7) view).getMessage().getId();
        }
        return 0;
    }

    public static void r(qu0 qu0Var, mv0[] mv0VarArr, boolean z10) {
        ko0 ko0Var;
        if (!z10) {
            if (qu0Var.G == null || (ko0Var = qu0Var.H) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(ko0Var);
            qu0Var.H.run();
            qu0Var.H = null;
            qu0Var.G = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || qu0Var.G != null || qu0Var.I || qu0Var.h.getFastScroll() == null || !qu0Var.h.getFastScroll().a0 || qu0Var.h.getFastScroll().getVisibility() != 0 || mv0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        qu0Var.I = true;
        Context context = qu0Var.getContext();
        pr0 pr0Var = new pr0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.k6.pf;
        org.telegram.ui.ActionBar.r6.W(textView, i10, null);
        int dp = AndroidUtilities.dp(6.0f);
        int i11 = org.telegram.ui.ActionBar.k6.qf;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        pr0Var.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(pr0Var, c02, O, null, null);
        pr0Var.addView(textView, w7.z5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        or0 or0Var = new or0(context);
        or0Var.a = new Random();
        Paint paint = new Paint(1);
        or0Var.b = paint;
        Paint paint2 = new Paint(1);
        or0Var.c = paint2;
        or0Var.f = 1.0f;
        or0Var.h = 0.0f;
        paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        Paint paint3 = new Paint();
        or0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        or0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        pr0Var.addView(or0Var, w7.z5.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        qu0Var.G = pr0Var;
        qu0Var.addView(pr0Var, w7.z5.c(-2.0f, -2));
        qu0Var.G.setAlpha(0.0f);
        qu0Var.G.setScaleX(0.8f);
        qu0Var.G.setScaleY(0.8f);
        qu0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        qu0Var.invalidate();
        ko0 ko0Var2 = new ko0(6, qu0Var, pr0Var);
        qu0Var.H = ko0Var2;
        AndroidUtilities.runOnUIThread(ko0Var2, 4000L);
    }

    public static boolean r0(int i10) {
        return i10 == 8 || i10 == 9 || z0(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(xv0 xv0Var) {
        xv0 xv0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j10 = xv0Var.j1;
        mv0[] mv0VarArr = xv0Var.t1;
        qu0 X = xv0Var.X(0);
        if (X != null && X.getMeasuredHeight() > 0 && X.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(X.getMeasuredWidth(), X.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                xv0Var.I1 = true;
                X.h.draw(new Canvas(bitmap2));
                View view = new View(X.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                X.addView(view);
                xv0Var2 = xv0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new hg.j0((FrameLayout) xv0Var2, view, (View) X, (Object) bitmap2, 3)).start();
                X.h.setAlpha(0.0f);
                X.h.animate().alpha(1.0f).setUpdateListener(new d80(X, 21)).setDuration(200L).start();
                pv0 pv0Var = xv0Var2.u1;
                int[] iArr = pv0Var.c;
                arrayList = pv0Var.n[0].a;
                mv0 mv0Var = mv0VarArr[0];
                int[] iArr2 = mv0Var.f;
                iArr2[1] = 0;
                i10 = mv0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                mv0Var.h = false;
                xv0Var2.B0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                xv0Var2.C0(false);
                xv0Var2.D1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    mv0 mv0Var2 = mv0VarArr[0];
                    int i12 = mv0Var2.q;
                    if (i12 == 0) {
                        mv0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            mv0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        mv0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        xv0Var2 = xv0Var;
        pv0 pv0Var2 = xv0Var2.u1;
        int[] iArr3 = pv0Var2.c;
        arrayList = pv0Var2.n[0].a;
        mv0 mv0Var3 = mv0VarArr[0];
        int[] iArr22 = mv0Var3.f;
        iArr22[1] = 0;
        i10 = mv0Var3.q;
        if (i10 != 0) {
        }
        mv0Var3.h = false;
        xv0Var2.B0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        xv0Var2.C0(false);
        xv0Var2.D1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
        while (i11 < arrayList.size()) {
        }
    }

    public static void u(xv0 xv0Var, int i10, boolean z10) {
        qu0[] qu0VarArr = xv0Var.k0;
        if (qu0VarArr[0].F == i10) {
            return;
        }
        qu0 qu0Var = qu0VarArr[1];
        qu0Var.F = i10;
        qu0Var.setVisibility(0);
        xv0Var.m0();
        xv0Var.p1(true);
        xv0Var.h1 = z10;
        xv0Var.O0();
        xv0Var.A(!xv0Var.v0(i10), true);
        xv0Var.u1(true);
    }

    public static int v(xv0 xv0Var, s4.g0 g0Var) {
        if (g0Var == xv0Var.c0) {
            return 8;
        }
        if (g0Var == xv0Var.e0) {
            return 9;
        }
        for (wv0 wv0Var : xv0Var.Z1.values()) {
            if (wv0Var.c == g0Var) {
                return wv0Var.a;
            }
        }
        return -1;
    }

    public static boolean z0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        bk0 bk0Var = this.s0;
        if (bk0Var == null || this.W1 == z10) {
            return;
        }
        this.W1 = z10;
        if (z10 || bk0Var.getAnimatedDrawable().a0 >= 20) {
            bk0Var.getAnimatedDrawable().P(this.W1 ? 50 : 100);
        } else {
            bk0Var.getAnimatedDrawable().P(0);
        }
        if (z11) {
            bk0Var.getAnimatedDrawable().start();
        } else {
            bk0Var.getAnimatedDrawable().M(bk0Var.getAnimatedDrawable().f);
        }
    }

    public final boolean A0() {
        if (D() && ((getClosestTab() == 8 || getClosestTab() == 13 || z0(getClosestTab())) && this.C1)) {
            return false;
        }
        ns0 ns0Var = this.V;
        if (ns0Var != null && ns0Var.g()) {
            return false;
        }
        ss0 ss0Var = this.W;
        return ((ss0Var != null && ss0Var.w) || this.o1 || this.g1) ? false : true;
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
    public void A1(boolean z10) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i11;
        boolean y02;
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
        ns0 ns0Var;
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
        pv0 pv0Var;
        nt0 nt0Var = this.I0;
        if (nt0Var == null) {
            return;
        }
        boolean z21 = !this.D1.r() ? false : z10;
        boolean z22 = (this.T == null || (pv0Var = this.u1) == null || !pv0Var.f) ? false : true;
        long j10 = this.j1;
        int i20 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (i20 <= 0 || o2Var == null) {
            i10 = 1;
            user = null;
        } else {
            i10 = 1;
            user = o2Var.getMessagesController().getUser(Long.valueOf(j10));
        }
        boolean z23 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i10 : false;
        int i21 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.e1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z23) ? 0 : i10;
        int i22 = ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && (((userFull = this.e1) != null && userFull.stories_pinned_available) || (((chatFull = this.d1) != null && chatFull.stories_pinned_available) || y0())) && o0()) ? i10 : 0;
        ns0 ns0Var2 = this.V;
        int i23 = i21;
        boolean z24 = (ns0Var2 == null || (((userFull3 = this.e1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.d1) == null || chatFull3.stargifts_count <= 0))) ? false : i10;
        int i24 = i22;
        TLRPC.ChatFull chatFull4 = this.d1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.e1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z25 = z21;
                int i25 = this.R1 == nt0Var.n0 ? i10 : 0;
                boolean z26 = (i24 == 0 || i23 != 0) ? i10 : false;
                int i26 = i25;
                i11 = z26 == nt0Var.d(8) ? i26 + 1 : i26;
                if (z23 != nt0Var.d(13)) {
                    i11++;
                }
                if (w0() != nt0Var.d(8)) {
                    i11++;
                }
                if (z24 == nt0Var.d(14) || (ns0Var2 != null && z24 && this.Q1 != ns0Var2.getLastEmojisHash())) {
                    i11++;
                }
                y02 = y0();
                int i27 = 14;
                hu0 hu0Var = this.a0;
                int[] iArr2 = this.X0;
                if (y02) {
                    z11 = z24;
                    int i28 = i11;
                    int i29 = (hu0Var.d == null ? i10 : false) == nt0Var.d(7) ? i28 + 1 : i28;
                    if (iArr2[0] <= 0) {
                        z19 = i10;
                        i16 = 0;
                    } else {
                        z19 = false;
                        i16 = 0;
                    }
                    int i30 = i29;
                    int i31 = z19 == nt0Var.d(i16) ? i30 + 1 : i30;
                    if (iArr2[i10] <= 0) {
                        z20 = i10;
                        i17 = z20;
                    } else {
                        i17 = i10;
                        z20 = false;
                    }
                    int i32 = i31;
                    int i33 = z20 == nt0Var.d(i17) ? i32 + 1 : i32;
                    if (DialogObject.isEncryptedDialog(j10)) {
                        i18 = i33;
                    } else {
                        int i34 = i33;
                        int i35 = (iArr2[3] <= 0) == nt0Var.d(3) ? i34 + 1 : i34;
                        i18 = (iArr2[4] <= 0) == nt0Var.d(4) ? i35 + 1 : i35;
                    }
                    int i36 = i19;
                    int i37 = (iArr2[2] <= 0) == nt0Var.d(2) ? i36 + 1 : i36;
                    int i38 = (iArr2[5] <= 0) == nt0Var.d(5) ? i37 + 1 : i37;
                    int i39 = (iArr2[6] <= 0) == nt0Var.d(6) ? i38 + 1 : i38;
                    boolean z27 = !this.Q.d.isEmpty();
                    int i40 = i39;
                    i11 = z27 != nt0Var.d(10) ? i40 + 1 : i40;
                    z12 = n0() && !o2Var.getMessagesController().getSavedMessagesController().unsupported && o2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                    z13 = z27;
                    if (z12 != nt0Var.d(11)) {
                        i11++;
                    }
                    if (z22 != nt0Var.d(12)) {
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
                        transitionSet.addTransition(new org.telegram.ui.ActionBar.m0(2));
                        z14 = z22;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(nt0Var.getTabsContainer(), transitionSet);
                        nt0Var.U = nt0Var.v;
                        nt0Var.V = nt0Var.w;
                    } else {
                        iArr = iArr2;
                        z14 = z22;
                    }
                    SparseArray f7 = nt0Var.f();
                    if (i11 > 3) {
                        f7 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (w0()) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        nt0Var.b0 = 420L;
                    }
                    if (i23 != 0) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                    } else if ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && ((((userFull2 = this.e1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.d1) != null && chatFull2.stories_pinned_available) || y0())) && o0())) {
                        if (s0()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            nt0Var.b0 = 420L;
                        } else {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            if (y0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            }
                        }
                    }
                    if (z11) {
                        String string2 = LocaleController.getString(R.string.ProfileGifts);
                        HashMap hashMap = yh.p2.U;
                        ai.y9 y9Var = ns0Var2.d;
                        Object obj2 = "";
                        if (y9Var == null) {
                            ns0Var = ns0Var2;
                            sparseArray = f7;
                            num = 4;
                            z15 = z23;
                            z16 = z12;
                            i12 = i20;
                        } else {
                            z15 = z23;
                            ArrayList arrayList2 = y9Var.l;
                            z16 = z12;
                            i12 = i20;
                            sparseArray = f7;
                            num = 4;
                            Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(ns0Var2.c));
                            if (!arrayList2.isEmpty()) {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                int i41 = 0;
                                while (true) {
                                    ns0Var = ns0Var2;
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
                                    ns0Var2 = ns0Var;
                                    z14 = z18;
                                }
                                z17 = z14;
                                if (!arrayList3.isEmpty()) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                    for (int i42 = 0; i42 < arrayList3.size(); i42++) {
                                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i42);
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                        spannableStringBuilder2.setSpan(new a6(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                    }
                                    c10 = 0;
                                    hashMap.put(pair, spannableStringBuilder);
                                    obj2 = spannableStringBuilder;
                                    CharSequence[] charSequenceArr = new CharSequence[2];
                                    charSequenceArr[c10] = string2;
                                    charSequenceArr[1] = obj2;
                                    arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                    this.Q1 = ns0Var.getLastEmojisHash();
                                }
                                c10 = 0;
                                CharSequence[] charSequenceArr2 = new CharSequence[2];
                                charSequenceArr2[c10] = string2;
                                charSequenceArr2[1] = obj2;
                                arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                                this.Q1 = ns0Var.getLastEmojisHash();
                            } else if (!y9Var.i || (obj = (CharSequence) hashMap.get(pair)) == null) {
                                ns0Var = ns0Var2;
                            } else {
                                ns0Var = ns0Var2;
                                obj2 = obj;
                            }
                        }
                        z17 = z14;
                        c10 = 0;
                        CharSequence[] charSequenceArr22 = new CharSequence[2];
                        charSequenceArr22[c10] = string2;
                        charSequenceArr22[1] = obj2;
                        arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr22)));
                        this.Q1 = ns0Var.getLastEmojisHash();
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
                    if (!y0()) {
                        if (z16) {
                            arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                        }
                        if (hu0Var.d != null) {
                            arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                        }
                        if (iArr[0] > 0) {
                            if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && hu0Var.d == null) {
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
                    if (nt0Var.n0) {
                        boolean u02 = u0();
                        int i43 = 0;
                        while (i43 < 15) {
                            if (f0(i43, u02) != null) {
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
                        int g02 = g0(profileTab);
                        int i45 = 0;
                        while (true) {
                            if (i45 >= arrayList.size()) {
                                i45 = -1;
                                break;
                            } else if (((Integer) ((Pair) arrayList.get(i45)).first).intValue() == g02) {
                                break;
                            } else {
                                i45++;
                            }
                        }
                        if (i45 >= 0) {
                            i13 = 0;
                            arrayList.add(0, (Pair) arrayList.remove(i45));
                            if (!arrayList.isEmpty()) {
                                this.S1 = ((Integer) ((Pair) arrayList.get(i13)).first).intValue();
                            }
                            size = arrayList.size();
                            i14 = 0;
                            while (i14 < size) {
                                Object obj3 = arrayList.get(i14);
                                i14++;
                                Pair pair2 = (Pair) obj3;
                                if (nt0Var.d(((Integer) pair2.first).intValue())) {
                                    sparseArray2 = sparseArray;
                                } else {
                                    sparseArray2 = sparseArray;
                                    nt0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, sparseArray2);
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
                    this.k0[0].F = selectedTab;
                }
                this.R1 = nt0Var.n0;
                nt0Var.c();
                O0();
                J();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z252 = z21;
        if (this.R1 == nt0Var.n0) {
        }
        if (i24 == 0) {
        }
        int i262 = i25;
        if (z26 == nt0Var.d(8)) {
        }
        if (z23 != nt0Var.d(13)) {
        }
        if (w0() != nt0Var.d(8)) {
        }
        if (z24 == nt0Var.d(14)) {
        }
        i11++;
        y02 = y0();
        int i272 = 14;
        hu0 hu0Var2 = this.a0;
        int[] iArr22 = this.X0;
        if (y02) {
        }
        if (i11 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.R1 = nt0Var.n0;
        nt0Var.c();
        O0();
        J();
    }

    public final void B(int i10) {
        int i11;
        qu0 X = X(this.p1);
        this.s = -1;
        if (X != null) {
            X.h.B0();
            this.q1 = i10;
            X.r.setVisibility(0);
            if (r0(this.p1)) {
                X.r.setAdapter(o1(this.p1));
            } else {
                X.r.setAdapter(this.I);
            }
            pu0 pu0Var = X.r;
            int paddingLeft = pu0Var.getPaddingLeft();
            pu0 pu0Var2 = X.r;
            int a02 = a0(X.F);
            pu0Var2.e3 = a02;
            int paddingRight = X.r.getPaddingRight();
            pu0 pu0Var3 = X.r;
            int Z = Z(y0());
            pu0Var3.f3 = Z;
            pu0Var.setPadding(paddingLeft, a02, paddingRight, Z);
            X.s.y1(i10);
            X.r.a0();
            int i12 = 0;
            while (true) {
                qu0[] qu0VarArr = this.k0;
                if (i12 >= qu0VarArr.length) {
                    break;
                }
                qu0 qu0Var = qu0VarArr[i12];
                if (qu0Var != null && ((i11 = qu0Var.F) == 0 || r0(i11))) {
                    AndroidUtilities.updateVisibleRows(qu0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.o1 = true;
            if (this.p1 == 0) {
                this.t1[0].g(true);
            }
            this.n1 = 0.0f;
            a1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J1.lock();
            ofFloat.addUpdateListener(new mt0(this, X, i13));
            ofFloat.addListener(new gi.s2(this, r0(X.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(bs.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final void B0(int i10, int i11, int i12, boolean z10) {
        mv0[] mv0VarArr = this.t1;
        mv0VarArr[i10].a.clear();
        mv0VarArr[i10].b[0].clear();
        mv0VarArr[i10].b[1].clear();
        mv0 mv0Var = mv0VarArr[i10];
        mv0Var.j[0] = i11;
        mv0Var.i[0] = false;
        mv0Var.l = false;
        mv0Var.m = i12;
        mv0Var.n = (mv0Var.e() - i12) - 1;
        mv0 mv0Var2 = mv0VarArr[i10];
        if (mv0Var2.n < 0) {
            mv0Var2.n = 0;
        }
        mv0Var2.k = i11;
        mv0Var2.o = true;
        mv0Var2.g = false;
        mv0Var2.p++;
        qu0 X = X(i10);
        if (X != null && X.h.getAdapter() != null) {
            X.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i13 >= qu0VarArr.length) {
                return;
            }
            qu0 qu0Var = qu0VarArr[i13];
            if (qu0Var.F == i10) {
                qu0Var.x.h1(Math.min(mv0VarArr[i10].e() - 1, mv0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final Boolean B1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        qu0[] qu0VarArr = this.k0;
        qu0 qu0Var = qu0VarArr[0];
        if (qu0Var == null) {
            return null;
        }
        int i10 = qu0Var.F;
        this.p1 = i10;
        boolean r02 = r0(i10);
        int[] iArr = this.m1;
        int Y = Y(r02 ? 1 : 0, iArr[r02 ? 1 : 0], true);
        if (view != null && Y == Y(r02 ? 1 : 0, Y, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[r02 ? 1 : 0] != Y) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!r02) {
                SharedConfig.setMediaColumnsCount(Y);
            } else if (d0(qu0VarArr[0].F) >= 5 || z0(qu0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(Y);
            }
            B(Y);
        }
        return Boolean.valueOf(Y != Y(r02 ? 1 : 0, Y, true));
    }

    public final void C(org.telegram.ui.ActionBar.u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        bk0 iconView = u0Var.getIconView();
        org.telegram.ui.ActionBar.g6 g6Var = this.F1;
        if (iconView != null) {
            org.telegram.ui.ActionBar.r6.t(u0Var.getIconView(), org.telegram.ui.ActionBar.k6.y8, g6Var, PorterDuff.Mode.SRC_IN);
        }
        if (u0Var.getBackground() != null) {
            Drawable background = u0Var.getBackground();
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.z8);
            u0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(u0Var, background, null, O, g6Var);
        }
    }

    public final void C0(boolean z10) {
        long j10 = this.F;
        if (j10 != 0 || w0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = g2[i10];
            mv0[] mv0VarArr = this.t1;
            if (mv0VarArr[i11].h && !z10) {
                return;
            }
            long j11 = this.j1;
            if (DialogObject.isEncryptedDialog(j11)) {
                return;
            }
            mv0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = mv0VarArr[i11].q;
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
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            tL_messages_getSearchResultsPositions.peer = o2Var.getMessagesController().getInputPeer(j11);
            if (j10 != 0 && o2Var.getUserConfig().getClientUserId() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = o2Var.getMessagesController().getInputPeer(j10);
            }
            final int i13 = mv0VarArr[i11].p;
            ConnectionsManager.getInstance(o2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(o2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.qr0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new yr0(xv0.this, tL_error, i13, i11, tLObject, 0));
                }
            }), o2Var.getClassGuid());
        }
    }

    public final Boolean C1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        qu0[] qu0VarArr = this.k0;
        qu0 qu0Var = qu0VarArr[0];
        if (qu0Var == null) {
            return null;
        }
        if (this.k1 && r0(qu0Var.F)) {
            return null;
        }
        int i10 = qu0VarArr[0].F;
        this.p1 = i10;
        boolean r02 = r0(i10);
        int[] iArr = this.m1;
        int Y = Y(r02 ? 1 : 0, iArr[r02 ? 1 : 0], false);
        if (view2 != null && Y == Y(r02 ? 1 : 0, Y, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[r02 ? 1 : 0] != Y) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!r02) {
                SharedConfig.setMediaColumnsCount(Y);
            } else if (d0(qu0VarArr[0].F) >= 5 || z0(qu0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(Y);
            }
            B(Y);
        }
        return Boolean.valueOf(Y != Y(r02 ? 1 : 0, Y, false));
    }

    public final boolean D() {
        boolean t02 = t0();
        long j10 = this.j1;
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (!t02) {
            return y0() || (o2Var != null && o2Var.getMessagesController().getStoriesController().h(j10));
        }
        TLRPC.User user = MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void D0(int i10) {
        int i11;
        int i12 = 2;
        mv0[] mv0VarArr = this.t1;
        if (i10 == 0) {
            int i13 = mv0VarArr[0].q;
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
        mv0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        o2Var.getMediaDataController().loadMedia(this.j1, 50, 0, mv0VarArr[i10].k, i11, this.F, 1, o2Var.getClassGuid(), mv0VarArr[i10].p, null, null);
    }

    public boolean E() {
        return !(this instanceof h40);
    }

    public int E0() {
        return 0;
    }

    public final boolean F() {
        qu0 qu0Var;
        qu0[] qu0VarArr = this.k0;
        if (qu0VarArr == null || (qu0Var = qu0VarArr[0]) == null) {
            return false;
        }
        if (this.k1 && r0(qu0Var.F)) {
            return false;
        }
        boolean r02 = r0(qu0VarArr[0].F);
        int i10 = this.m1[r02 ? 1 : 0];
        return i10 != Y(r02 ? 1 : 0, i10, false);
    }

    public final void F0(int i10, View view) {
        boolean z10;
        ms0 ms0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        int i11 = 3;
        hv0 hv0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        final int i12 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.e1 != null && o2Var.getMessagesController().isUserNoForwards(this.e1)) {
                    r40 r40Var = this.E1;
                    if (r40Var != null) {
                        r40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.d1 != null) {
                    TLRPC.Chat chat2 = o2Var.getMessagesController().getChat(Long.valueOf(this.d1.id));
                    if (o2Var.getMessagesController().isChatNoForwards(chat2)) {
                        r40 r40Var2 = this.E1;
                        if (r40Var2 != null) {
                            r40Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.E1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (l0()) {
                    r40 r40Var3 = this.E1;
                    if (r40Var3 != null) {
                        r40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.ey eyVar = new org.telegram.ui.ey(bundle);
                eyVar.C2 = new sr0(this);
                o2Var.presentFragment(eyVar);
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
                    TLRPC.Chat chat3 = o2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat3 != null && chat3.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat3.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.sn snVar = new org.telegram.ui.sn(bundle2);
                snVar.X7 = messageObject.getId();
                long j10 = this.F;
                if (j10 != 0) {
                    og.d.a(snVar, MessagesStorage.TopicKey.of(dialogId, j10));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                o2Var.presentFragment(snVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    fu0 fu0Var = this.c0;
                    if (fu0Var == null || fu0Var.s == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < sparseArrayArr[0].size(); i13++) {
                        arrayList.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i13)).getId()));
                    }
                    W0(arrayList, i10 == 103);
                    M(false);
                    return;
                }
                SavedMessagesController savedMessagesController = o2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i14 = 0; i14 < savedMessagesController.allDialogs.size(); i14++) {
                    long j11 = savedMessagesController.allDialogs.get(i14).dialogId;
                    if (hv0Var.w.contains(Long.valueOf(j11))) {
                        arrayList2.add(Long.valueOf(j11));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    z10 = true;
                    int i15 = 0;
                    while (true) {
                        qu0[] qu0VarArr = this.k0;
                        if (i15 >= qu0VarArr.length) {
                            break;
                        }
                        qu0 qu0Var = qu0VarArr[i15];
                        if (qu0Var.F == 11) {
                            qu0Var.x.h1(0, 0);
                            break;
                        }
                        i15++;
                    }
                } else {
                    z10 = true;
                    o2Var.showDialog(new sg.j0(33, o2Var.getCurrentAccount(), getContext(), o2Var, null));
                }
                M(z10);
                return;
            }
            return;
        }
        boolean r02 = r0(getSelectedTab());
        org.telegram.ui.ActionBar.g6 g6Var = this.F1;
        if (r02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!t0() || (ms0Var = this.U) == null || ms0Var.getCurrentList() == null) {
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
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, g6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.Components.as0
                        public final /* synthetic */ xv0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.z1
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i17) {
                            switch (i12) {
                                case 0:
                                    xv0 xv0Var = this.b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = xv0Var.v1;
                                    ci.h7 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j12 = xv0Var.j1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j12, arrayList4);
                                    xc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    xv0Var.M(false);
                                    break;
                                default:
                                    xv0 xv0Var2 = this.b;
                                    xv0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i18 >= arrayList5.size()) {
                                            xv0Var2.M(true);
                                            break;
                                        } else {
                                            xv0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i18)).longValue());
                                            i18++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(17));
                    c2Var.show();
                    c2Var.i();
                    return;
                }
                ci.s6 currentList = ms0Var.getCurrentList();
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
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, g6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.R = string2;
                c2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new ry(this, currentList, arrayList4, i11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new ud0(16));
                c2Var2.show();
                c2Var2.i();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j12 = this.j1;
            if (DialogObject.isEncryptedDialog(j12)) {
                encryptedChat = org.telegram.messenger.v0.l(o2Var.getMessagesController(), j12);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j12)) {
                user = o2Var.getMessagesController().getUser(Long.valueOf(j12));
                chat = null;
                encryptedChat = null;
            } else {
                chat = o2Var.getMessagesController().getChat(Long.valueOf(-j12));
                user = null;
                encryptedChat = null;
            }
            f5.z(o2Var, user, chat, encryptedChat, null, this.c1, null, this.Z0, null, 0, 0, null, new rr0(this, r10 ? 1 : 0), null, this.F1);
            return;
        }
        SavedMessagesController savedMessagesController2 = o2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i18 = 0; i18 < savedMessagesController2.allDialogs.size(); i18++) {
            long j13 = savedMessagesController2.allDialogs.get(i18).dialogId;
            if (hv0Var.w.contains(Long.valueOf(j13))) {
                arrayList5.add(Long.valueOf(j13));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z11 = false;
        } else {
            Long l4 = (Long) arrayList5.get(0);
            long longValue = l4.longValue();
            boolean z12 = longValue == o2Var.getUserConfig().getClientUserId();
            z11 = z12;
            if (longValue < 0) {
                TLRPC.Chat chat4 = o2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                z11 = z12;
                if (chat4 != null) {
                    str = chat4.title;
                    z11 = z12;
                }
            } else if (longValue >= 0) {
                TLRPC.User user2 = o2Var.getMessagesController().getUser(l4);
                z11 = z12;
                if (user2 != null) {
                    if (UserObject.isAnonymous(user2)) {
                        str = LocaleController.getString(R.string.AnonymousForward);
                        z11 = z12;
                    } else {
                        str = UserObject.getUserName(user2);
                        z11 = z12;
                    }
                }
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, g6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
        c2Var3.R = formatString;
        c2Var3.T = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i19 = r10 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.Components.as0
            public final /* synthetic */ xv0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i172) {
                switch (i19) {
                    case 0:
                        xv0 xv0Var = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = xv0Var.v1;
                        ci.h7 storiesController = o2Var2.getMessagesController().getStoriesController();
                        long j122 = xv0Var.j1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j122, arrayList42);
                        xc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        xv0Var.M(false);
                        break;
                    default:
                        xv0 xv0Var2 = this.b;
                        xv0Var2.getClass();
                        int i182 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i182 >= arrayList52.size()) {
                                xv0Var2.M(true);
                                break;
                            } else {
                                xv0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i182)).longValue());
                                i182++;
                            }
                        }
                }
            }
        });
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        o2Var.showDialog(c2Var3);
        TextView textView = (TextView) c2Var3.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public final void G() {
        nt0 nt0Var = this.I0;
        if (nt0Var.d(nt0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = nt0Var.getFirstTabId();
        nt0Var.setInitialTabId(firstTabId);
        this.k0[0].F = firstTabId;
        p1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(qu0 qu0Var, mm0 mm0Var, s4.b0 b0Var) {
        int i10;
        int i11;
        boolean[] zArr;
        s4.b1 K;
        ci.z6 z6Var;
        if (this.o1 || this.K1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (mm0Var.getFastScroll() == null || !mm0Var.getFastScroll().n || currentTimeMillis - qu0Var.a >= 300) {
            qu0Var.a = currentTimeMillis;
            if (this.V0 && this.U0 && qu0Var.F != 11) {
                return;
            }
            int i12 = 7;
            if (qu0Var.F == 7) {
                return;
            }
            int L0 = b0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(b0Var.N0() - L0) + 1;
            int h = mm0Var.getAdapter() == null ? 0 : mm0Var.getAdapter().h();
            int i13 = qu0Var.F;
            int[] iArr = this.m1;
            mv0[] mv0VarArr = this.t1;
            if (i13 == 0 || i13 == 1 || i13 == 2 || i13 == 4) {
                h = mv0VarArr[i13].d() + mv0VarArr[i13].a.size();
                mv0 mv0Var = mv0VarArr[i13];
                if (mv0Var.h && mv0Var.e.size() > 2 && qu0Var.F == 0 && mv0VarArr[i13].a.size() != 0) {
                    float f7 = i13 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((mm0Var.getMeasuredHeight() / (mm0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((vu0) mv0VarArr[i13].e.get(1)).b) {
                        measuredHeight = ((vu0) mv0VarArr[i13].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < mv0VarArr[i13].m && mv0VarArr[0].m - i10 > measuredHeight)) {
                        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(this, i13, mm0Var, 18);
                        this.K1 = h4Var;
                        AndroidUtilities.runOnUIThread(h4Var);
                        return;
                    }
                }
            }
            int i14 = qu0Var.F;
            if (i14 == 7) {
                return;
            }
            if (r0(i14)) {
                uv0 n12 = n1(qu0Var.F);
                if (n12 == null || (z6Var = n12.s) == null || L0 + abs <= z6Var.i() - iArr[1]) {
                    return;
                }
                n12.P();
                return;
            }
            int i15 = qu0Var.F;
            if (i15 == 6) {
                if (abs > 0) {
                    iu0 iu0Var = this.P;
                    boolean z10 = iu0Var.h;
                    ArrayList arrayList = iu0Var.d;
                    if (z10 || iu0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    iu0.E(iu0Var, ((TLRPC.Chat) i2.o1.i(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            if (i15 == 11) {
                int i16 = -1;
                for (int i17 = 0; i17 < qu0Var.h.getChildCount(); i17++) {
                    View childAt = qu0Var.h.getChildAt(i17);
                    qu0Var.h.getClass();
                    i16 = Math.max(RecyclerView.R(childAt), i16);
                }
                s4.g0 adapter = qu0Var.h.getAdapter();
                iv0 iv0Var = this.S;
                if (adapter != iv0Var) {
                    if (i16 + 1 >= o2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        o2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i16 + 1 < iv0Var.h.size() + iv0Var.e.size() || iv0Var.s || iv0Var.r) {
                        return;
                    }
                    iv0Var.r = true;
                    iv0Var.F();
                    return;
                }
            }
            if (i15 == 10 || i15 == 12 || i15 == 13 || i15 == 14) {
                return;
            }
            int i18 = i15 == 0 ? 3 : i15 == 5 ? 10 : 6;
            int i19 = i15 == 15 ? 8 : i15;
            if (abs + L0 > h - i18 || mv0VarArr[i19].o) {
                mv0 mv0Var2 = mv0VarArr[i19];
                if (!mv0Var2.g) {
                    if (i15 == 0) {
                        int i20 = mv0VarArr[0].q;
                        if (i20 == 1) {
                            i11 = 6;
                        } else {
                            if (i20 != 2) {
                                i11 = 0;
                            }
                            i11 = i12;
                        }
                        zArr = mv0Var2.i;
                        if (zArr[0]) {
                            mv0Var2.g = true;
                            o2Var.getMediaDataController().loadMedia(this.j1, 50, mv0VarArr[i19].j[0], 0, i11, this.F, 1, o2Var.getClassGuid(), mv0VarArr[i19].p, null, null);
                        } else if (this.c1 != 0 && !zArr[1]) {
                            mv0Var2.g = true;
                            o2Var.getMediaDataController().loadMedia(this.c1, 50, mv0VarArr[i19].j[1], 0, i11, this.F, 1, o2Var.getClassGuid(), mv0VarArr[i19].p, null, null);
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
                        zArr = mv0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i21 = mv0VarArr[i19].m;
            if (i19 == 0) {
                i21 = this.H.L(0);
            }
            if (L0 - i21 < i18 + 1) {
                mv0 mv0Var3 = mv0VarArr[i19];
                if (!mv0Var3.g && !mv0Var3.l && !mv0Var3.o) {
                    D0(qu0Var.F);
                }
            }
            qu0 qu0Var2 = this.k0[0];
            if (qu0Var2.h == mm0Var) {
                int i22 = qu0Var2.F;
                if ((i22 != 0 && i22 != 5) || L0 == -1 || (K = mm0Var.K(L0)) == null) {
                    return;
                }
                int i23 = K.f;
                if (i23 == 0 || i23 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.t7;
                    org.telegram.ui.Cells.v0 v0Var = this.K0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.e2) {
                            v0Var.W(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        MessageObject messageObject = t7Var.e <= 0 ? null : t7Var.b[0];
                        if (messageObject != null) {
                            v0Var.W(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean I(MotionEvent motionEvent) {
        ms0 ms0Var;
        qu0[] qu0VarArr = this.k0;
        int i10 = qu0VarArr[0].F;
        if (i10 == 13 && (ms0Var = this.U) != null) {
            View currentView = ms0Var.n.getCurrentView();
            if (currentView instanceof di.r) {
                di.r rVar = (di.r) currentView;
                di.l lVar = rVar.v;
                di.i iVar = rVar.f;
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
                                int i12 = y3 + iVar.Y2;
                                for (int i13 = 0; i13 < iVar.getChildCount(); i13++) {
                                    View childAt = iVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
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
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                                if (rVar.N == motionEvent.getPointerId(i16)) {
                                    i14 = i16;
                                }
                                if (rVar.O == motionEvent.getPointerId(i16)) {
                                    i15 = i16;
                                }
                            }
                            if (i14 == -1 || i15 == -1) {
                                rVar.L = false;
                                rVar.M = false;
                                rVar.K = false;
                                rVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / rVar.P;
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
                                    rVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.v0.y(2.0f, rVar.Q, 1.0f, 1.0f) : (1.0f - rVar.Q) / 0.5f));
                                } else {
                                    rVar.c = 0.0f;
                                }
                                float f7 = rVar.c;
                                if (f7 == 1.0f || f7 == 0.0f) {
                                    if (f7 == 1.0f) {
                                        int i17 = rVar.e;
                                        int ceil = (((int) Math.ceil(rVar.S / rVar.e)) * i17) + ((int) ((rVar.W.G.z1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i17 - 1)));
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
        if ((i10 == 0 || r0(i10)) && getParent() != null) {
            if (!this.o1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        qu0VarArr[0].h.I0(false);
                        qu0VarArr[0].h.cancelLongPress();
                        qu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - qu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - qu0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y10 + qu0VarArr[0].h.Y2;
                        if (getY() != 0.0f && this.E == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < qu0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = qu0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                qu0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.s == -1) {
                            this.s = (int) (((this.m1[r0(qu0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / qu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + qu0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - qu0VarArr[0].getY() > 0.0f) {
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
                        U();
                        return false;
                    }
                    float hypot2 = ((float) Math.hypot(motionEvent.getX(i22) - motionEvent.getX(i21), motionEvent.getY(i22) - motionEvent.getY(i21))) / this.h;
                    this.n = hypot2;
                    if (!this.a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                        this.a = true;
                        boolean z12 = hypot2 > 1.0f;
                        this.r = z12;
                        h1(z12);
                    }
                    if (this.a) {
                        boolean z13 = this.r;
                        if ((!z13 || this.n >= 1.0f) && (z13 || this.n <= 1.0f)) {
                            this.n1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.v0.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.n1 = 0.0f;
                        }
                        float f10 = this.n1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            s4.g0 n12 = r0(this.p1) ? n1(this.p1) : this.H;
                            if (this.n1 == 1.0f) {
                                int i24 = this.q1;
                                int ceil2 = (((int) Math.ceil(this.s / this.q1)) * i24) + ((int) ((this.z1 / (qu0VarArr[0].h.getMeasuredWidth() - ((int) (qu0VarArr[0].h.getMeasuredWidth() / this.q1)))) * (i24 - 1)));
                                if (ceil2 >= n12.h()) {
                                    ceil2 = n12.h() - 1;
                                }
                                this.s = ceil2;
                            }
                            U();
                            if (this.n1 == 0.0f) {
                                this.r = !this.r;
                            }
                            h1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        qu0VarArr[0].h.invalidate();
                        qu0 qu0Var = qu0VarArr[0];
                        if (qu0Var.G != null) {
                            qu0Var.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.a) {
                    this.c = false;
                    this.b = false;
                    this.a = false;
                    U();
                }
                return this.a;
            }
            return true;
        }
        return false;
    }

    public final void I0() {
        ci.z6 z6Var;
        ci.z6 z6Var2;
        this.H1.removeAllObservers();
        fu0 fu0Var = this.c0;
        if (fu0Var != null && (z6Var2 = fu0Var.s) != null && z6Var2 != null) {
            z6Var2.z(fu0Var.v);
        }
        ls0 ls0Var = this.e0;
        if (ls0Var != null && (z6Var = ls0Var.s) != null && z6Var != null) {
            z6Var.z(ls0Var.v);
        }
        Iterator it = this.Z1.values().iterator();
        while (it.hasNext()) {
            vv0 vv0Var = ((wv0) it.next()).c;
            ci.z6 z6Var3 = vv0Var.s;
            if (z6Var3 != null && z6Var3 != null) {
                z6Var3.z(vv0Var.v);
            }
        }
    }

    public final void J() {
        float abs;
        qu0[] qu0VarArr = this.k0;
        qu0 qu0Var = qu0VarArr[0];
        if (qu0Var == null || qu0VarArr[1] == null) {
            return;
        }
        float f7 = 0.0f;
        ss0 ss0Var = this.W;
        if (ss0Var != null) {
            char c10 = (!r0(qu0Var.F) || qu0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (qu0VarArr[1].getVisibility() == 0 ? (!r0(qu0VarArr[1].F) || qu0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                ss0Var.setTranslationX(c10 != 0 ? 0.0f : qu0VarArr[0].getMeasuredWidth());
            } else {
                ss0Var.setTranslationX(qu0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(ss0Var.getTranslationX()) / ss0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < qu0VarArr.length; i10++) {
                if (qu0VarArr[i10].getVisibility() == 0) {
                    ws0 ws0Var = qu0VarArr[i10].h;
                    View childAt = ws0Var.getChildCount() == 0 ? null : ws0Var.getChildAt(0);
                    f10 += Utilities.clamp01(1.0f - (qu0VarArr[i10].getTranslationX() / qu0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - ws0Var.getPaddingTop() : ws0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f10) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            ss0Var.setAlpha(clamp01);
            ss0Var.setScaleX(lerp);
            ss0Var.setScaleY(lerp);
            ss0Var.setTranslationY(this.L1 + f10);
            f7 = abs;
        }
        L();
        if (this.V1 != f7) {
            this.V1 = f7;
            q0();
            invalidate();
        }
    }

    public final void J0(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null || this.o1) {
            return;
        }
        ss0 ss0Var = this.W;
        if (ss0Var == null || !ss0Var.w) {
            int i12 = 0;
            i12 = 0;
            String str2 = null;
            if (this.C1) {
                int i13 = 8;
                if (i11 == 8 && !D()) {
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
                G0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    e1(false);
                } else {
                    this.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.l0.setVisibility(this.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.u0 u0Var = this.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.t0;
                    if (u0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        u0Var2.setVisibility(i13);
                    }
                    z1();
                }
                this.b1 = false;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.s7) {
                    ((org.telegram.ui.Cells.s7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                xs0 xs0Var = this.r1;
                mv0[] mv0VarArr = this.t1;
                org.telegram.ui.ActionBar.o2 o2Var = this.v1;
                if (i11 == 0) {
                    mv0 mv0Var = mv0VarArr[i11];
                    int i14 = i10 - mv0Var.m;
                    if (i14 >= 0 && i14 < mv0Var.a.size()) {
                        PhotoViewer.u1().M2(null, o2Var, null);
                        PhotoViewer.u1().d2(mv0VarArr[i11].a, i14, this.j1, this.c1, this.F, xs0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.u1().M2(null, o2Var, null);
                    int indexOf = mv0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.u1().d2(org.telegram.messenger.v0.k(messageObject), 0, 0L, 0L, 0L, xs0Var);
                    } else {
                        PhotoViewer.u1().d2(mv0VarArr[i11].a, indexOf, this.j1, this.c1, this.F, xs0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (k7Var.G) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.u1().M2(null, o2Var, null);
                                int indexOf2 = mv0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.u1().d2(org.telegram.messenger.v0.k(messageObject), 0, 0L, 0L, 0L, xs0Var);
                                    return;
                                } else {
                                    PhotoViewer.u1().d2(mv0VarArr[i11].a, indexOf2, this.j1, this.c1, this.F, xs0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, o2Var.getParentActivity(), o2Var);
                        } else if (k7Var.F) {
                            o2Var.getFileLoader().cancelLoadFile(document);
                            k7Var.f(true);
                        } else {
                            MessageObject message = k7Var.getMessage();
                            message.putInDownloadsStore = true;
                            o2Var.getFileLoader().loadFile(document, message, 0, 0);
                            k7Var.f(true);
                        }
                    }
                } else if (i11 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.J1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.J1.P().l(messageObject) == null) {
                                    o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                cv.I(o2Var, messageObject, this.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            U0(str);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (r0(i11)) {
                    uv0 n12 = n1(i11);
                    ci.z6 z6Var = n12 != null ? n12.s : null;
                    if (z6Var == null) {
                        return;
                    }
                    ci.z9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    ci.q7 a2 = ci.q7.a(this.k0[0].h);
                    a2.e = new tv(z6Var, 19);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).t1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a2.s += i12;
                    orCreateStoryViewer.C(context, id2, z6Var, a2);
                }
            }
            t1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K() {
        AnimatorSet animatorSet;
        if (!this.g1) {
            return false;
        }
        boolean z10 = this.i1;
        qu0[] qu0VarArr = this.k0;
        if (!z10) {
            if (Math.abs(qu0VarArr[1].getTranslationX()) < 1.0f) {
                qu0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.h1 ? -1 : 1));
                qu0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.f1;
                if (animatorSet != null) {
                }
                this.g1 = false;
            }
            P0(getTabProgress());
            return this.g1;
        }
        if (Math.abs(qu0VarArr[0].getTranslationX()) < 1.0f) {
            qu0VarArr[0].setTranslationX(0.0f);
            qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth() * (this.h1 ? 1 : -1));
            animatorSet = this.f1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f1 = null;
            }
            this.g1 = false;
        }
        P0(getTabProgress());
        return this.g1;
    }

    public final boolean K0(MessageObject messageObject, View view, int i10, boolean z10) {
        ss0 ss0Var;
        final TL_stories.StoryItem storyItem;
        fu0 fu0Var;
        ci.z6 z6Var;
        final int i11 = 0;
        if (!this.C1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            if (o2Var.getParentActivity() != null && messageObject != null && ((ss0Var = this.W) == null || !ss0Var.w)) {
                AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
                long j10 = this.j1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(z0(getClosestTab()) || getClosestTab() == 8) || this.C1)) {
                    char c10 = messageObject.getDialogId() == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.Z0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.a1++;
                    }
                    this.l0.setVisibility(this.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.u0 u0Var = this.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.t0;
                    if (u0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        u0Var2.setVisibility(i12);
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
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).b(i10, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).i(true, true);
                    }
                    if (!this.C1) {
                        e1(true);
                    }
                    G0(sparseArrayArr[0]);
                    t1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.s7) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                    s7Var.k(s7Var.n, s7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean z02 = z0(getClosestTab());
                    j80 I = j80.I(o2Var, view);
                    j80 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.vt0(I, 26), false);
                    J.k();
                    j80.f(J, getStoriesController().B(j10, true), hashSet, true, new lg(this, storyItem2, I, 20), new ci.y2(this, hashSet, storyItem2, I, 10));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new gi.g2(I, J, 9), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.db(this, messageObject, view, i10, 26), false);
                    final int i15 = 3;
                    if (z02) {
                        int k12 = k1(getClosestTab());
                        String w9 = getStoriesController().w(k12, j10);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new d2(this, k12, 11), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ai.db(this, k12, storyItem, w9, 27), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (fu0Var = this.c0) != null && (z6Var = fu0Var.s) != null) {
                            if (z6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.ur0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                xv0 xv0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xv0Var.getContext(), 0, xv0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(xv0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(18));
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.show();
                                                c2Var.i();
                                                break;
                                            case 1:
                                                xv0 xv0Var2 = this;
                                                xv0Var2.getClass();
                                                xv0Var2.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                xv0 xv0Var3 = this;
                                                xv0Var3.getClass();
                                                xv0Var3.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                xv0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.ur0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                xv0 xv0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xv0Var.getContext(), 0, xv0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(xv0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(18));
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.show();
                                                c2Var.i();
                                                break;
                                            case 1:
                                                xv0 xv0Var2 = this;
                                                xv0Var2.getClass();
                                                xv0Var2.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                xv0 xv0Var3 = this;
                                                xv0Var3.getClass();
                                                xv0Var3.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                xv0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.ur0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        xv0 xv0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xv0Var.getContext(), 0, xv0Var.F1);
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(xv0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(18));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.show();
                                        c2Var.i();
                                        break;
                                    case 1:
                                        xv0 xv0Var2 = this;
                                        xv0Var2.getClass();
                                        xv0Var2.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        xv0 xv0Var3 = this;
                                        xv0Var3.getClass();
                                        xv0Var3.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        xv0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.ur0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    xv0 xv0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xv0Var.getContext(), 0, xv0Var.F1);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(xv0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(18));
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.show();
                                    c2Var.i();
                                    break;
                                case 1:
                                    xv0 xv0Var2 = this;
                                    xv0Var2.getClass();
                                    xv0Var2.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    xv0 xv0Var3 = this;
                                    xv0Var3.getClass();
                                    xv0Var3.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    xv0.h(this, storyItem);
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

    public final void L() {
        us usVar = this.P0;
        if (usVar != null) {
            ss0 ss0Var = this.W;
            float f7 = 0.0f;
            if (ss0Var != null) {
                f7 = 0.0f + (ss0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ss0Var.getTranslationX() / ss0Var.getMeasuredWidth())));
            }
            usVar.setTranslationY(this.L1 + f7);
        }
    }

    public boolean L0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean M(boolean z10) {
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
        G0(sparseArrayArr[0]);
        ms0 ms0Var = this.U;
        if (ms0Var != null) {
            ms0Var.h();
            ms0Var.j();
        }
        e1(false);
        w1(z10);
        hv0 hv0Var = this.R;
        if (hv0Var != null) {
            hv0Var.w.clear();
        }
        return true;
    }

    public final void M0(float f7) {
        qu0[] qu0VarArr = this.k0;
        if (f7 != 1.0f || qu0VarArr[1].getVisibility() == 0) {
            if (this.h1) {
                qu0VarArr[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth() - (qu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qu0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f7);
                qu0VarArr[1].setTranslationX((qu0VarArr[0].getMeasuredWidth() * f7) - qu0VarArr[0].getMeasuredWidth());
            }
            P0(getTabProgress());
            float b02 = b0(f7);
            this.p0 = b02;
            this.r0.setVisibility((b02 == 0.0f || !E() || s0()) ? 4 : 0);
            org.telegram.ui.ActionBar.u0 u0Var = this.n0;
            if (u0Var == null || E()) {
                this.o0 = c0(f7);
                y1();
            } else {
                u0Var.setVisibility(y0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            u1(false);
            if (f7 == 1.0f) {
                qu0 qu0Var = qu0VarArr[0];
                qu0VarArr[0] = qu0VarArr[1];
                qu0VarArr[1] = qu0Var;
                qu0Var.setVisibility(8);
                if (u0Var != null && this.x0 == 2) {
                    u0Var.setVisibility(y0() ? 8 : 4);
                }
                this.x0 = 0;
                i1();
            }
        }
    }

    public boolean O() {
        return this instanceof h40;
    }

    public void O0() {
        boolean z10 = y0() || s0();
        sv0 sv0Var = this.e0.w;
        if (sv0Var != null) {
            sv0Var.b(z10 && getClosestTab() == 9);
        }
        sv0 sv0Var2 = this.c0.w;
        if (sv0Var2 != null) {
            sv0Var2.b(z10 && getClosestTab() == 8);
        }
        for (wv0 wv0Var : this.Z1.values()) {
            vv0 vv0Var = wv0Var.c;
            if (vv0Var.s != null) {
                vv0Var.w.b(z10 && getClosestTab() == wv0Var.a);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.n0;
        if (u0Var != null) {
            kt0 kt0Var = this.J0;
            u0Var.setSearchFieldHint(LocaleController.getString((kt0Var != null && kt0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        J();
    }

    public final boolean P(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        qu0[] qu0VarArr = this.k0;
        motionEvent.offsetLocation(x10 - qu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - qu0VarArr[0].getY()) - qu0VarArr[0].h.getFastScroll().getY());
        return qu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void P0(float f7) {
        H0();
    }

    public void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i10 >= qu0VarArr.length) {
                return;
            }
            qu0 qu0Var = qu0VarArr[i10];
            if (qu0Var != null && qu0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < qu0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = qu0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + qu0VarArr[i10].h.Y2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + qu0VarArr[i10].getX(), childAt.getY() + qu0VarArr[i10].h.getY() + qu0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof lw0)) {
                            arrayList.add((lw0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i10++;
        }
    }

    public final void R0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        new org.telegram.ui.o61(o2Var, j10, this.m1[1], new ai.k4(this, j10, i10)).show();
    }

    public final boolean S(int i10) {
        mv0[] mv0VarArr = this.u1.n;
        if (mv0VarArr == null) {
            return false;
        }
        mv0[] mv0VarArr2 = this.t1;
        if (i10 == 0) {
            mv0 mv0Var = mv0VarArr2[i10];
            if (!mv0Var.h) {
                int[] iArr = mv0Var.f;
                int[] iArr2 = mv0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = mv0VarArr2[i10].f;
            int[] iArr4 = mv0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        mv0VarArr2[i10].a.addAll(mv0VarArr[i10].a);
        mv0VarArr2[i10].c.addAll(mv0VarArr[i10].c);
        for (Map.Entry entry : mv0VarArr[i10].d.entrySet()) {
            mv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            mv0VarArr2[i10].b[i11] = mv0VarArr[i10].b[i11].clone();
            mv0 mv0Var2 = mv0VarArr2[i10];
            int[] iArr5 = mv0Var2.j;
            mv0 mv0Var3 = mv0VarArr[i10];
            iArr5[i11] = mv0Var3.j[i11];
            mv0Var2.i[i11] = mv0Var3.i[i11];
        }
        mv0VarArr2[i10].e.addAll(mv0VarArr[i10].e);
        return !mv0VarArr[i10].a.isEmpty();
    }

    public final void S0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        f5.v0(o2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new ai.ac(this, j10, i10, 8));
    }

    public final void T(int i10, mm0 mm0Var, boolean z10) {
        ArrayList arrayList = this.t1[i10].e;
        int L0 = ((s4.b0) mm0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            vu0 vu0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((vu0) arrayList.get(i11)).b) {
                        vu0Var = (vu0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (vu0Var == null) {
                    vu0Var = (vu0) i2.o1.i(1, arrayList);
                }
            }
            if (vu0Var != null) {
                B0(i10, vu0Var.d, vu0Var.b + 1, z10);
            }
        }
    }

    public final void T0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        String w9 = getStoriesController().w(i10, j10);
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = o2Var.getResourceProvider();
        j2.c cVar = new j2.c(this, j10, i10, 6);
        Pattern pattern = f5.a;
        f5.R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w9, 12, LocaleController.getString(R.string.Rename), resourceProvider, cVar);
    }

    public final void U() {
        qu0[] qu0VarArr;
        qu0 qu0Var;
        int i10;
        s4.g0 adapter;
        if (this.o1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                qu0VarArr = this.k0;
                if (i12 >= qu0VarArr.length) {
                    qu0Var = null;
                    break;
                }
                qu0Var = qu0VarArr[i12];
                if (qu0Var.F == this.p1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (qu0Var != null) {
                boolean r02 = r0(qu0Var.F);
                float f7 = this.n1;
                mv0[] mv0VarArr = this.t1;
                if (f7 != 1.0f) {
                    if (f7 == 0.0f) {
                        this.o1 = false;
                        if (this.p1 == 0) {
                            mv0VarArr[0].g(false);
                        }
                        qu0Var.r.setVisibility(8);
                        qu0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f7 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new mt0(this, qu0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.vi(this, z10, r02 ? 1 : 0, qu0Var));
                    ofFloat.setInterpolator(bs.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.o1 = false;
                int i13 = this.q1;
                int[] iArr = this.m1;
                iArr[r02 ? 1 : 0] = i13;
                if (!r02) {
                    SharedConfig.setMediaColumnsCount(i13);
                } else if (d0(qu0Var.F) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.q1);
                }
                for (int i14 = 0; i14 < qu0VarArr.length; i14++) {
                    qu0 qu0Var2 = qu0VarArr[i14];
                    if (qu0Var2 != null && qu0Var2.h != null && (((i10 = qu0Var2.F) == 0 || r0(i10)) && (adapter = qu0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            mv0VarArr[0].g(false);
                        }
                        qu0VarArr[i14].r.setVisibility(8);
                        qu0VarArr[i14].x.y1(iArr[r02 ? 1 : 0]);
                        qu0VarArr[i14].h.a0();
                        qu0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qu0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    a1();
                    return;
                }
                while (i11 < qu0VarArr.length) {
                    qu0 qu0Var3 = qu0VarArr[i11];
                    if (qu0Var3.F == this.p1) {
                        View m10 = qu0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        qu0 qu0Var4 = qu0VarArr[i11];
                        qu0Var4.x.h1(this.s, (-qu0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void U0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (shouldShowUrlInAlert) {
            f5.q0(o2Var, str, true, true);
        } else {
            pf.d.r(o2Var.getParentActivity(), str);
        }
    }

    public final void V(int i10) {
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

    public int V0() {
        return -1;
    }

    public final String W(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        ms0 ms0Var;
        if (!t0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (ms0Var = this.U) != null) {
            return ms0Var.getBotPreviewsSubtitle();
        }
        fu0 fu0Var = this.c0;
        if (fu0Var == null || fu0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < fu0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) fu0Var.s.i.get(i12);
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

    public final void W0(ArrayList arrayList, boolean z10) {
        fu0 fu0Var = this.c0;
        if (fu0Var == null || fu0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (z10 && arrayList.size() > o2Var.getMessagesController().storiesPinnedToTopCountMax) {
            xc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        ci.z6 z6Var = fu0Var.s;
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
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ci.d6(2));
            }
            z11 = z12;
        }
        if (z11) {
            xc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            xc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            xc.a0(o2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
        }
    }

    public final qu0 X(int i10) {
        int i11 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i11 >= qu0VarArr.length) {
                return null;
            }
            qu0 qu0Var = qu0VarArr[i11];
            if (qu0Var != null && qu0Var.F == i10) {
                return qu0Var;
            }
            i11++;
        }
    }

    public final boolean X0(MotionEvent motionEvent, boolean z10) {
        qu0 qu0Var;
        ms0 ms0Var;
        int closestTab = getClosestTab();
        nt0 nt0Var = this.I0;
        int i10 = -1;
        int i11 = nt0Var.O.get(nt0Var.n + (z10 ? 1 : -1), -1);
        ss0 ss0Var = this.W;
        if (ss0Var != null) {
            if (z0(closestTab) || closestTab == 8) {
                k91 k91Var = ss0Var.n;
                i10 = k91Var.b0.get(k91Var.F + (z10 ? 1 : -1), -1);
            } else if (z0(i11) || i11 == 8) {
                i10 = ss0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = l1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.u0 u0Var = this.n0;
            if (u0Var == null || E()) {
                this.o0 = c0(0.0f);
                x1(0.0f);
            } else {
                u0Var.setVisibility(y0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!D() || !this.C1 || (getClosestTab() != 8 && !z0(getClosestTab())))) {
                qu0[] qu0VarArr = this.k0;
                qu0 qu0Var2 = qu0VarArr[0];
                if (qu0Var2 != null && qu0Var2.F == 13 && (ms0Var = this.U) != null) {
                    di.a aVar = ms0Var.n;
                    if (!z10) {
                    }
                }
                qu0 qu0Var3 = qu0VarArr[0];
                ns0 ns0Var = this.V;
                if (qu0Var3 != null && qu0Var3.F == 14 && ns0Var != null) {
                    yh.u1 u1Var = ns0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (qu0Var = qu0VarArr[0]) == null || qu0Var.F != 13) && ((ns0Var == null || !ns0Var.g()) && (ss0Var == null || !ss0Var.w))) {
                    u1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m0();
                    this.y1 = false;
                    this.x1 = true;
                    Q0(true);
                    this.z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    nt0Var.setEnabled(false);
                    qu0 qu0Var4 = qu0VarArr[1];
                    qu0Var4.F = i11;
                    qu0Var4.setVisibility(0);
                    this.h1 = z10;
                    p1(true);
                    if (z10) {
                        qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth());
                    } else {
                        qu0VarArr[1].setTranslationX(-qu0VarArr[0].getMeasuredWidth());
                    }
                    P0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int Y(int i10, int i11, boolean z10) {
        int i12 = i11 + (!z10 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z10 ? 9 : 6;
        }
        return Utilities.clamp(i12, 9, (this.k1 && i10 == 1) ? 1 : 2);
    }

    public final int Z(boolean z10) {
        return this.Y1 + (z10 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void Z0(s4.g0 g0Var) {
        if (g0Var instanceof rv0) {
            ArrayList arrayList = this.E0;
            ArrayList arrayList2 = this.F0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (g0Var == this.M) {
            ArrayList arrayList3 = this.G0;
            ArrayList arrayList4 = this.H0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        ev0 ev0Var = this.N;
        if (g0Var == ev0Var) {
            ev0Var.r = null;
        }
    }

    public final int a0(int i10) {
        return e0(i10) + AndroidUtilities.dp(54.0f) + this.c2 + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void a1() {
        int i10;
        int i11 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i11 >= qu0VarArr.length) {
                return;
            }
            ws0 ws0Var = qu0VarArr[i11].h;
            if (ws0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < ws0Var.getChildCount(); i14++) {
                    View childAt = ws0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                        int messageId = s7Var.getMessageId();
                        i13 = s7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                        int id2 = k7Var.getMessage().getId();
                        i13 = k7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                        i12 = j7Var.getMessage().getId();
                        i13 = j7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = qu0VarArr[i11].F;
                    int i16 = -1;
                    if (r0(i15)) {
                        uv0 n12 = n1(i15);
                        if (n12 != null && n12.s != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= n12.s.i.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) n12.s.i.get(i17)).getId()) {
                                    i16 = i17;
                                    break;
                                }
                                i17++;
                            }
                        }
                        i10 = i16;
                    } else if (i15 >= 0) {
                        mv0[] mv0VarArr = this.t1;
                        if (i15 < mv0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= mv0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) mv0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = mv0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((s4.b0) ws0Var.getLayoutManager()).h1(i10, (-qu0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.o1) {
                            qu0 qu0Var = qu0VarArr[i11];
                            qu0Var.s.h1(i10, (-qu0Var.h.getPaddingTop()) + i13);
                        }
                    }
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ih));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wc));
    }

    @Override // org.telegram.ui.Cells.m2
    public final boolean b() {
        return false;
    }

    public final float b0(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (s0()) {
            return 0.0f;
        }
        qu0[] qu0VarArr = this.k0;
        qu0 qu0Var = qu0VarArr[1];
        ns0 ns0Var = this.V;
        if (qu0Var != null && ((i12 = qu0Var.F) == 0 || (((i12 == 8 || z0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = qu0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && ns0Var != null)))) {
            f10 = 0.0f + f7;
        }
        qu0 qu0Var2 = qu0VarArr[0];
        return (qu0Var2 == null || !((i10 = qu0Var2.F) == 0 || (((i10 == 8 || z0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = qu0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && ns0Var != null)))) ? f10 : (1.0f - f7) + f10;
    }

    public final void b1(int i10) {
        nt0 nt0Var;
        if (this.M1 || (nt0Var = this.I0) == null) {
            return;
        }
        nt0Var.g(null, i10, nt0Var.P.get(i10));
    }

    public final float c0(float f7) {
        float f10 = 0.0f;
        if (s0()) {
            return 0.0f;
        }
        qu0[] qu0VarArr = this.k0;
        qu0 qu0Var = qu0VarArr[1];
        if (qu0Var != null && v0(qu0Var.F) && qu0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        qu0 qu0Var2 = qu0VarArr[0];
        return (qu0Var2 == null || !v0(qu0Var2.F) || qu0VarArr[0].F == 11) ? f10 : (1.0f - f7) + f10;
    }

    public final void c1(float f7, int i10) {
        nt0 nt0Var = this.I0;
        if (nt0Var != null) {
            nt0Var.i(f7, z0(i10) ? 8 : i10);
        }
        ss0 ss0Var = this.W;
        if (ss0Var != null) {
            k91 k91Var = ss0Var.n;
            if (z0(i10)) {
                k91Var.f(f7, k1(i10));
            } else if (i10 == 8) {
                k91Var.f(f7, 0);
            }
        }
    }

    public final int d0(int i10) {
        uv0 n12;
        ci.z6 z6Var;
        if (!r0(i10) || (n12 = n1(i10)) == null || (z6Var = n12.s) == null) {
            return 0;
        }
        return z6Var.g();
    }

    public final void d1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i10 >= qu0VarArr.length) {
                if (this.F == 0) {
                    hu0 hu0Var = this.a0;
                    hu0Var.d = chatFull;
                    hu0Var.e = arrayList;
                }
                A1(true);
                for (int i11 = 0; i11 < qu0VarArr.length; i11++) {
                    qu0 qu0Var = qu0VarArr[i11];
                    if (qu0Var.F == 7 && qu0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(qu0VarArr[i11].h);
                    }
                }
                return;
            }
            qu0 qu0Var2 = qu0VarArr[i10];
            if (qu0Var2.F == 7 && qu0Var2.h.getAdapter() != null && qu0VarArr[i10].h.getAdapter().h() != 0 && this.v1.getMessagesController().getStoriesController().j.size() > 0) {
                return;
            } else {
                i10++;
            }
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
        ws0 ws0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        s4.g0 g0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        ws0 ws0Var2;
        int i16;
        int i17;
        ws0 ws0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        s4.g0 g0Var2 = this.O;
        s4.g0 g0Var3 = this.M;
        lv0 lv0Var = this.J;
        s4.g0 g0Var4 = this.L;
        s4.g0 g0Var5 = this.K;
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        ev0 ev0Var = this.N;
        cu0 cu0Var = this.H;
        long j10 = this.j1;
        qu0[] qu0VarArr = this.k0;
        mv0[] mv0VarArr = this.t1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != o2Var.getClassGuid() || intValue2 != mv0VarArr[intValue3].p) {
                if (this.u1 == null || !mv0VarArr[intValue3].a.isEmpty() || mv0VarArr[intValue3].o || !S(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    g0Var2 = cu0Var;
                } else if (intValue3 == 1) {
                    g0Var2 = g0Var5;
                } else if (intValue3 == 2) {
                    g0Var2 = g0Var4;
                } else if (intValue3 == 3) {
                    g0Var2 = lv0Var;
                } else if (intValue3 == 4) {
                    g0Var2 = g0Var3;
                } else if (intValue3 != 5) {
                    g0Var2 = intValue3 == 15 ? ev0Var : null;
                }
                if (g0Var2 != null) {
                    for (int i19 = 0; i19 < qu0VarArr.length; i19++) {
                        qu0 qu0Var = qu0VarArr[i19];
                        if (qu0Var != null && (ws0Var2 = qu0Var.h) != null && ws0Var2.getAdapter() == g0Var2) {
                            qu0VarArr[i19].h.B0();
                        }
                    }
                    g0Var2.l();
                }
                this.b1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
            int i20 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                mv0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                g0Var2 = cu0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                g0Var2 = g0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                g0Var2 = g0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                g0Var2 = lv0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                g0Var2 = g0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                g0Var2 = ev0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                g0Var2 = null;
            }
            int size2 = mv0VarArr[i16].a.size();
            if (g0Var2 != null) {
                i17 = g0Var2.h();
                if (g0Var2 instanceof im0) {
                    ((im0) g0Var2).L();
                }
            } else {
                i17 = 0;
            }
            mv0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (mv0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        mv0 mv0Var = mv0VarArr[i16];
                        int i21 = mv0Var.m - r13;
                        mv0Var.m = i21;
                        if (i21 < 0) {
                            mv0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                mv0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                mv0 mv0Var2 = mv0VarArr[i16];
                if (mv0Var2.l) {
                    mv0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (mv0VarArr[i16].a(messageObject3, i20, r12, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        mv0 mv0Var3 = mv0VarArr[i16];
                        int i23 = mv0Var3.n - 1;
                        mv0Var3.n = i23;
                        if (i23 < 0) {
                            mv0Var3.n = r12;
                        }
                    }
                    i22++;
                    r12 = 0;
                }
                mv0 mv0Var4 = mv0VarArr[i16];
                if (mv0Var4.o && mv0Var4.a.size() > 0) {
                    mv0 mv0Var5 = mv0VarArr[i16];
                    mv0Var5.k = ((MessageObject) mv0Var5.a.get(0)).getId();
                }
                mv0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                mv0 mv0Var6 = mv0VarArr[i16];
                if (mv0Var6.i[i20]) {
                    int size4 = mv0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += mv0VarArr[i16].m;
                    }
                    mv0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                mv0 mv0Var7 = mv0VarArr[i16];
                if (mv0Var7.i[i20] && this.c1 != 0) {
                    mv0Var7.g = true;
                    o2Var.getMediaDataController().loadMedia(this.c1, 50, mv0VarArr[i16].j[1], 0, i16, this.F, 1, o2Var.getClassGuid(), mv0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (g0Var2 != null) {
                pu0 pu0Var = null;
                for (int i25 = 0; i25 < qu0VarArr.length; i25++) {
                    qu0 qu0Var2 = qu0VarArr[i25];
                    if (qu0Var2 != null && (ws0Var3 = qu0Var2.h) != null && ws0Var3.getAdapter() == g0Var2) {
                        pu0 pu0Var2 = qu0VarArr[i25].h;
                        pu0Var2.B0();
                        pu0Var = pu0Var2;
                    }
                }
                int h = g0Var2.h();
                if (g0Var2 != cu0Var) {
                    try {
                        g0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (cu0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(pu0Var);
                } else {
                    cu0Var.l();
                }
                if (!mv0VarArr[i24].a.isEmpty() || mv0VarArr[i24].g) {
                    if (pu0Var != null && (g0Var2 == cu0Var || h >= i17)) {
                        z(pu0Var, i17, sparseBooleanArray);
                    }
                } else if (pu0Var != null) {
                    z(pu0Var, i17, sparseBooleanArray);
                }
                if (pu0Var != null && !mv0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (qu0VarArr[i26].F == 0) {
                                ((s4.b0) pu0Var.getLayoutManager()).h1(cu0Var.L(0), 0);
                            }
                        }
                    } else {
                        a1();
                    }
                }
            }
            mv0 mv0Var8 = mv0VarArr[i24];
            if (mv0Var8.o) {
                if (mv0Var8.a.size() == 0) {
                    D0(i24);
                } else {
                    mv0VarArr[i24].o = false;
                }
            }
            this.b1 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j10) ? o2Var.getMessagesController().getChat(Long.valueOf(-j10)) : null;
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
                        cu0 cu0Var2 = cu0Var;
                        int i28 = 0;
                        while (i28 < mv0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (mv0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        cu0Var = cu0Var2;
                    }
                    cu0 cu0Var3 = cu0Var;
                    if (z12) {
                        this.b1 = true;
                        if (cu0Var3 != null) {
                            cu0Var3.l();
                        }
                        if (g0Var5 != null) {
                            g0Var5.l();
                        }
                        if (g0Var4 != null) {
                            g0Var4.l();
                        }
                        if (lv0Var != null) {
                            lv0Var.X(false);
                        }
                        if (g0Var3 != null) {
                            g0Var3.l();
                        }
                        if (ev0Var != null) {
                            ev0Var.l();
                        }
                        if (g0Var2 != null) {
                            g0Var2.l();
                        }
                        if (i27 == 0 || i27 == 1 || i27 == 2 || i27 == 4) {
                            C0(true);
                        }
                    }
                    X(i27);
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
            cu0 cu0Var32 = cu0Var;
            if (z12) {
            }
            X(i272);
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
                        mv0 mv0Var9 = mv0VarArr[mediaType];
                        if (mv0Var9.l) {
                            z11 = z13;
                            if (mv0Var9.a(messageObject4, messageObject4.getDialogId() == j10 ? 0 : 1, true, isEncryptedDialog2)) {
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
                boolean z15 = true;
                if (z14) {
                    this.b1 = true;
                    int i30 = 0;
                    while (i30 < qu0VarArr.length) {
                        int i31 = qu0VarArr[i30].F;
                        if (i31 == 0) {
                            g0Var = cu0Var;
                        } else if (i31 == z15) {
                            g0Var = g0Var5;
                        } else if (i31 == 2) {
                            g0Var = g0Var4;
                        } else if (i31 == 3) {
                            g0Var = lv0Var;
                        } else {
                            if (i31 == 4) {
                                g0Var = g0Var3;
                            } else if (i31 == 5) {
                                g0Var = g0Var2;
                            } else {
                                g0Var = i31 == 15 ? ev0Var : null;
                                if (g0Var != null) {
                                    g0Var.h();
                                    cu0Var.l();
                                    g0Var5.l();
                                    g0Var4.l();
                                    lv0Var.X(false);
                                    g0Var3.l();
                                    ev0Var.l();
                                    g0Var2.l();
                                }
                                i30++;
                                z15 = true;
                            }
                            if (g0Var != null) {
                            }
                            i30++;
                            z15 = true;
                        }
                        if (g0Var != null) {
                        }
                        i30++;
                        z15 = true;
                    }
                    A1(z15);
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
            if (l4.longValue() == j10 || l4.longValue() == this.c1) {
                int i32 = l4.longValue() == j10 ? 0 : 1;
                for (mv0 mv0Var10 : mv0VarArr) {
                    mv0Var10.f(i32, num.intValue(), num2.intValue());
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
                for (int i33 = 0; i33 < qu0VarArr.length; i33++) {
                    int childCount = qu0VarArr[i33].h.getChildCount();
                    for (int i34 = 0; i34 < childCount; i34++) {
                        View childAt = qu0VarArr[i33].h.getChildAt(i34);
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                            if (j7Var.getMessage() != null) {
                                j7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i35 = 0; i35 < qu0VarArr.length; i35++) {
                qu0 qu0Var3 = qu0VarArr[i35];
                if (qu0Var3 != null && (ws0Var = qu0Var3.h) != null) {
                    int childCount2 = ws0Var.getChildCount();
                    for (int i36 = 0; i36 < childCount2; i36++) {
                        View childAt2 = qu0VarArr[i35].h.getChildAt(i36);
                        if (childAt2 instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) childAt2;
                            if (j7Var2.getMessage() != null) {
                                j7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            ci.z6 z6Var = (ci.z6) objArr[0];
            fu0 fu0Var = this.c0;
            if (fu0Var == null || z6Var != fu0Var.s) {
                ls0 ls0Var = this.e0;
                if (ls0Var == null || z6Var != ls0Var.s) {
                    Iterator it = this.Z1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        wv0 wv0Var = (wv0) it.next();
                        if (wv0Var.c.s == z6Var) {
                            i12 = wv0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            qu0 X = X(i12);
            if (X != null) {
                if (X.b != (z6Var.g() > 0)) {
                    X.b = z6Var.g() > 0;
                    s1(X, true);
                }
            }
            if (X != null) {
                AndroidUtilities.notifyDataSetChanged(X.h);
                if (X.h.getLayoutManager() instanceof s4.b0) {
                    mm0 mm0Var = X.h;
                    H(X, mm0Var, (s4.b0) mm0Var.getLayoutManager());
                }
            }
            ju0 ju0Var = this.D1;
            if (ju0Var != null) {
                ju0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (qu0 qu0Var4 : qu0VarArr) {
                if (qu0Var4 != null && qu0Var4.h != null && r0(qu0Var4.F)) {
                    if (!t0() || qu0Var4.h.getAdapter() == null) {
                        for (int i37 = 0; i37 < qu0Var4.h.getChildCount(); i37++) {
                            View childAt3 = qu0Var4.h.getChildAt(i37);
                            if (childAt3 instanceof org.telegram.ui.Cells.s7) {
                                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt3;
                                p6 p6Var = s7Var.N;
                                if (!s7Var.d0 || (messageObject = s7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    s7Var.L = false;
                                    p6Var.t("", false, true);
                                } else {
                                    int i38 = storyViews.views_count;
                                    s7Var.L = i38 > 0;
                                    p6Var.t(AndroidUtilities.formatWholeNumber(i38, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(qu0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.Q.E(true);
                A1(true);
                G();
                return;
            }
            return;
        }
        int i39 = NotificationCenter.savedMessagesDialogsUpdate;
        hv0 hv0Var = this.R;
        if (i10 == i39) {
            if (j10 == 0 || j10 == o2Var.getUserConfig().getClientUserId()) {
                hv0Var.F(true);
                A1(true);
                G();
                O0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            hv0Var.F(true);
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                A1(true);
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
            hu0 hu0Var = this.a0;
            if (hu0Var != null) {
                TLRPC.ChatFull chatFull = hu0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i40 = 0; i40 < hu0Var.d.participants.participants.size(); i40++) {
                        hu0Var.d.participants.participants.get(i40).setRank(longValue4, str);
                    }
                }
                for (qu0 qu0Var5 : qu0VarArr) {
                    if (qu0Var5.F == 7) {
                        AndroidUtilities.updateVisibleRows(qu0Var5.h);
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
            for (int i41 = 0; i41 < qu0VarArr.length; i41++) {
                if (qu0VarArr[i41].h.getAdapter() == ev0Var) {
                    ws0 ws0Var4 = qu0VarArr[i41].h;
                    ArrayList arrayList6 = ev0Var.n;
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
                                ev0Var.m(i42);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        nt0 nt0Var = this.I0;
        if (nt0Var != null) {
            canvas.save();
            canvas.translate(nt0Var.getX(), nt0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        jt0 jt0Var = this.R0;
        if (jt0Var != null) {
            int i10 = jt0Var.U;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(jt0Var.getX(), jt0Var.getY());
                jt0Var.setDrawOverlay(true);
                jt0Var.draw(canvas);
                jt0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view != this.R0 || this.P0 != null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        qu0[] qu0VarArr = this.k0;
        float top = qu0VarArr[0].getTop();
        ss0 ss0Var = this.W;
        if (ss0Var != null && ((i10 = qu0VarArr[0].F) == 8 || z0(i10))) {
            top -= ss0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.m2
    public final void e(org.telegram.ui.Cells.q2 q2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (o2Var != null && o2Var.getMessagesController().getStoriesController().I(q2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            ci.z9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
            Context context = o2Var.getContext();
            long dialogId = q2Var.getDialogId();
            ci.q7 a2 = ci.q7.a((mm0) q2Var.getParent());
            a2.s += ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).t1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final int e0(int i10) {
        ss0 ss0Var = this.W;
        return (int) ((ss0Var == null || !(z0(i10) || i10 == 8)) ? 0.0f : ss0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f));
    }

    public void e1(boolean z10) {
        if (this.C1 == z10) {
            return;
        }
        this.C1 = z10;
        AnimatorSet animatorSet = this.O1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ha haVar = this.B0;
        if (z10) {
            haVar.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.O1.setDuration(180L);
        this.O1.addListener(new org.telegram.ui.ho(20, this, z10));
        this.O1.start();
        if (z10) {
            z1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(int i10, boolean z10) {
        int i11;
        qu0 X;
        if (z10 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z10 && r0(i10) && d0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.j1);
        bundle.putLong("topic_id", this.F);
        mv0[] mv0VarArr = this.t1;
        if (z10 && (X = X(0)) != null) {
            ArrayList arrayList = mv0VarArr[0].e;
            int L0 = X.x.L0();
            if (L0 >= 0) {
                vu0 vu0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((vu0) arrayList.get(i12)).b) {
                            vu0Var = (vu0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (vu0Var == null) {
                        vu0Var = (vu0) i2.o1.i(1, arrayList);
                    }
                }
                if (vu0Var != null) {
                    i11 = vu0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.k8 k8Var = new org.telegram.ui.k8(mv0VarArr[0].q, i11, bundle);
                    k8Var.M = new le.b(this, 12);
                    this.v1.presentFragment(k8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.k8 k8Var2 = new org.telegram.ui.k8(mv0VarArr[0].q, i11, bundle);
        k8Var2.M = new le.b(this, 12);
        this.v1.presentFragment(k8Var2);
    }

    public final void g1(int i10) {
        int k12 = k1(getClosestTab());
        ss0 ss0Var = this.W;
        if (k12 != i10) {
            if (ss0Var != null) {
                ss0Var.n.d(i10, ss0Var.s.i(i10));
                return;
            }
            return;
        }
        ss0Var.setReorderingAlbums(true);
        wv0 l1 = l1(i10);
        qu0 X = X(l1.a);
        if (X == null) {
            return;
        }
        ws0 ws0Var = X.h;
        for (int i11 = 0; i11 < ws0Var.getChildCount(); i11++) {
            View childAt = ws0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s7) {
                ((org.telegram.ui.Cells.s7) childAt).l(true, true);
            }
        }
        vv0 vv0Var = l1.c;
        if (vv0Var != null && !vv0Var.x) {
            vv0Var.x = true;
        }
        u1(true);
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.Z0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        qu0 qu0Var;
        qu0 qu0Var2;
        ci.z6 z6Var;
        ci.z6 z6Var2;
        float f7 = 1.0f;
        qu0[] qu0VarArr = this.k0;
        if (qu0VarArr == null || (qu0Var = qu0VarArr[0]) == null || (qu0Var2 = qu0VarArr[1]) == null || qu0Var.w == null || qu0Var2.w == null) {
            return 1.0f;
        }
        int i10 = qu0Var.F;
        int i11 = qu0Var2.F;
        boolean z10 = z0(i10) || i10 == 8;
        boolean z11 = z0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - qu0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - qu0VarArr[1].w.getVisibilityFactor();
        uv0 n12 = n1(qu0VarArr[0].F);
        if (i10 == 8 || (n12 != null && (z6Var2 = n12.s) != null && z6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        uv0 n13 = n1(i11);
        if (i11 != 8 && (n13 == null || (z6Var = n13.s) == null || z6Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(qu0VarArr[0].getTranslationX() / qu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        qu0[] qu0VarArr = this.k0;
        qu0 qu0Var = qu0VarArr[1];
        if (qu0Var != null && qu0Var.getVisibility() == 0) {
            if (this.g1 && !this.i1) {
                return qu0VarArr[1].F;
            }
            if (Math.abs(qu0VarArr[1].getTranslationX()) < qu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return qu0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public mm0 getCurrentListView() {
        du0 du0Var;
        qu0 qu0Var = this.k0[0];
        int i10 = qu0Var.F;
        return i10 == 13 ? this.U.getCurrentListView() : i10 == 14 ? this.V.getCurrentListView() : (i10 != 12 || (du0Var = this.T) == null) ? qu0Var.h : du0Var.a.x0;
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

    public org.telegram.ui.ActionBar.u0 getSearchItem() {
        return this.n0;
    }

    public bk0 getSearchOptionsItem() {
        return this.s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        ss0 ss0Var = this.W;
        if (ss0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = ss0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? l1(currentAlbumId).a : currentTabId;
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
            qu0[] qu0VarArr = this.k0;
            if (i10 >= qu0VarArr.length) {
                return f7;
            }
            qu0 qu0Var = qu0VarArr[i10];
            if (qu0Var != null) {
                f7 = ((1.0f - Math.abs(qu0Var.getTranslationX() / getWidth())) * qu0Var.F) + f7;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z6));
        int i10 = org.telegram.ui.ActionBar.k6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.l0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.u0;
        if (u0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = this.t0;
        if (u0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        Drawable[] drawableArr = {this.D0};
        int i11 = org.telegram.ui.ActionBar.k6.y8;
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.B0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        int i12 = org.telegram.ui.ActionBar.k6.Gh;
        nt0 nt0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(nt0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(nt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(nt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(nt0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hh));
        jt0 jt0Var = this.R0;
        if (jt0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(jt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(jt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(jt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(jt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A7));
        }
        final int i13 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i13 >= qu0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.s6 s6Var = new org.telegram.ui.ActionBar.s6() { // from class: org.telegram.ui.Components.hs0
                @Override // org.telegram.ui.ActionBar.s6
                public final void b() {
                    qu0[] qu0VarArr2 = xv0.this.k0;
                    int i14 = i13;
                    ws0 ws0Var = qu0VarArr2[i14].h;
                    if (ws0Var != null) {
                        int childCount = ws0Var.getChildCount();
                        for (int i15 = 0; i15 < childCount; i15++) {
                            View childAt = qu0VarArr2[i14].h.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.t7) {
                                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                                for (int i16 = 0; i16 < 6; i16++) {
                                    t7Var.a[i16].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                                ((org.telegram.ui.Cells.i6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.wa) {
                                ((org.telegram.ui.Cells.wa) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.s6
                public final /* synthetic */ void a(float f7) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
            int i14 = org.telegram.ui.ActionBar.k6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.n6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.U7));
            int i15 = org.telegram.ui.ActionBar.k6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
            int i16 = org.telegram.ui.ActionBar.k6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, s6Var, i15));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, s6Var, i16));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Lh));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, (Paint) null, (Drawable[]) null, s6Var, i15));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, (Paint) null, (Drawable[]) null, s6Var, i16));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
            i13++;
        }
    }

    public final float h0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i11 >= qu0VarArr.length) {
                break;
            }
            qu0 qu0Var = qu0VarArr[i11];
            if (qu0Var != null) {
                int i13 = qu0Var.F;
                if ((z10 && i10 == 8 && z0(i13)) || i13 == i10) {
                    i12++;
                    width = qu0VarArr[i11].getTranslationX();
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
    public final void h1(boolean z10) {
        qu0[] qu0VarArr;
        qu0 qu0Var;
        if (this.o1) {
            return;
        }
        int i10 = 0;
        while (true) {
            qu0VarArr = this.k0;
            if (i10 >= qu0VarArr.length) {
                qu0Var = null;
                break;
            }
            int i11 = qu0VarArr[i10].F;
            if (i11 == 0 || r0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (qu0Var != null) {
            int i12 = qu0Var.F;
            this.p1 = i12;
            boolean r02 = r0(i12);
            int[] iArr = this.m1;
            int Y = Y(r02 ? 1 : 0, iArr[r02 ? 1 : 0], z10);
            this.q1 = Y;
            if (Y != iArr[r02 ? 1 : 0]) {
                if (this.k1 && r0(this.p1)) {
                    return;
                }
                qu0Var.r.setVisibility(0);
                if (r0(this.p1)) {
                    qu0Var.r.setAdapter(o1(this.p1));
                } else {
                    qu0Var.r.setAdapter(this.I);
                }
                pu0 pu0Var = qu0Var.r;
                pu0Var.setPadding(pu0Var.getPaddingLeft(), a0(this.p1), qu0Var.r.getPaddingRight(), Z(y0()));
                qu0Var.s.y1(Y);
                qu0Var.r.a0();
                qu0Var.s.O = new lt0(this, qu0Var, 0);
                AndroidUtilities.updateVisibleRows(qu0Var.h);
                this.o1 = true;
                if (this.p1 == 0) {
                    this.t1[0].g(true);
                }
                this.n1 = 0.0f;
                if (this.s < 0) {
                    a1();
                    return;
                }
                for (qu0 qu0Var2 : qu0VarArr) {
                    if (qu0Var2.F == this.p1) {
                        qu0Var2.s.h1(this.s, this.v - qu0Var2.r.getPaddingTop());
                    }
                }
            }
        }
    }

    public final float i0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i11 >= qu0VarArr.length) {
                return f7;
            }
            qu0 qu0Var = qu0VarArr[i11];
            if (qu0Var != null) {
                int i12 = qu0Var.F;
                if ((z10 && i10 == 8 && z0(i12)) || i12 == i10) {
                    f7 = (1.0f - Math.abs(qu0VarArr[i11].getTranslationX() / getWidth())) + f7;
                }
            }
            i11++;
        }
    }

    public final void i1() {
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i10 >= qu0VarArr.length) {
                return;
            }
            int childCount = qu0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = qu0VarArr[i10].h.getChildAt(i11);
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

    public final int j0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.F1;
        return g6Var != null ? g6Var.g(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    public final void j1(MotionEvent motionEvent) {
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
                X0(motionEvent, f7 < 0.0f);
            }
        }
        if (this.x1) {
            qu0[] qu0VarArr = this.k0;
            float x10 = qu0VarArr[0].getX();
            this.f1 = new AnimatorSet();
            this.i1 = Math.abs(x10) < ((float) qu0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new d80(this, 20));
            boolean z10 = this.i1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(qu0VarArr[0], (Property<qu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(qu0VarArr[1], (Property<qu0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(qu0VarArr[0], (Property<qu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(qu0VarArr[1], (Property<qu0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = qu0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(qu0VarArr[0], (Property<qu0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(qu0VarArr[1], (Property<qu0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(qu0VarArr[0], (Property<qu0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(qu0VarArr[1], (Property<qu0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.f1.setInterpolator(h2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.f1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.f1.addListener(new qt0(this, i10));
            this.f1.start();
            this.g1 = true;
            this.x1 = false;
            O0();
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

    public final boolean k0() {
        return this.v1.getConnectionsManager().getConnectionState() == 3;
    }

    public final int k1(int i10) {
        wv0 m12 = m1(i10);
        if (m12 == null) {
            return -1;
        }
        return m12.b;
    }

    public final boolean l0() {
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

    public final wv0 l1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Z1;
        wv0 wv0Var = (wv0) hashMap.get(valueOf);
        if (wv0Var != null) {
            return wv0Var;
        }
        wv0 wv0Var2 = new wv0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), wv0Var2);
        this.a2.put(Integer.valueOf(wv0Var2.a), Integer.valueOf(i10));
        return wv0Var2;
    }

    public final void m0() {
        AndroidUtilities.cancelRunOnUIThread(this.M0);
        org.telegram.ui.Cells.v0 v0Var = this.K0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.L0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.L0.playTogether(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.O0));
        this.L0.setInterpolator(bs.g);
        this.L0.addListener(new qt0(this, 0));
        this.L0.start();
    }

    public final wv0 m1(int i10) {
        Integer num = (Integer) this.a2.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (wv0) this.Z1.get(num);
    }

    public boolean n0() {
        return false;
    }

    public final uv0 n1(int i10) {
        wv0 m12;
        if (i10 == 8) {
            return this.c0;
        }
        if (i10 == 9) {
            return this.e0;
        }
        if (!z0(i10) || (m12 = m1(i10)) == null) {
            return null;
        }
        return m12.c;
    }

    public boolean o0() {
        return !(this instanceof h40);
    }

    public final uv0 o1(int i10) {
        wv0 m12;
        if (i10 == 8) {
            return this.d0;
        }
        if (i10 == 9) {
            return this.f0;
        }
        if (!z0(i10) || (m12 = m1(i10)) == null) {
            return null;
        }
        return m12.d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i10 >= qu0VarArr.length) {
                return;
            }
            ws0 ws0Var = qu0VarArr[i10].h;
            if (ws0Var != null) {
                ws0Var.getViewTreeObserver().addOnPreDrawListener(new tt0(this, i10, 0));
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return K() || this.I0.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        ju0 ju0Var = this.D1;
        int height = ju0Var.f() != null ? ju0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof qu0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                ws0 ws0Var = ((qu0) childAt).h;
                ws0Var.setPadding(0, ws0Var.Z2, 0, ws0Var.a3);
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
        if (!this.M1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            if (o2Var.getParentLayout() != null && !((ActionBarLayout) o2Var.getParentLayout()).i() && !K() && !this.a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    r40 r40Var = this.E1;
                    if (r40Var != null) {
                        r40Var.b(true);
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
                    qu0[] qu0VarArr = this.k0;
                    if (z11 && (((z10 = this.h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!X0(motionEvent, x10 < 0)) {
                            this.y1 = true;
                            this.x1 = false;
                            Q0(false);
                            qu0VarArr[0].setTranslationX(0.0f);
                            qu0VarArr[1].setTranslationX(this.h1 ? qu0VarArr[0].getMeasuredWidth() : -qu0VarArr[0].getMeasuredWidth());
                            c1(0.0f, qu0VarArr[1].F);
                            P0(getTabProgress());
                        }
                    }
                    if (!this.y1 || this.x1) {
                        if (this.x1) {
                            qu0VarArr[0].setTranslationX(x10);
                            if (this.h1) {
                                qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                qu0VarArr[1].setTranslationX(x10 - qu0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / qu0VarArr[0].getMeasuredWidth();
                            if (E()) {
                                this.o0 = c0(abs2);
                                x1(abs2);
                                float b02 = b0(abs2);
                                this.p0 = b02;
                                this.r0.setVisibility((b02 == 0.0f || !E() || s0()) ? 4 : 0);
                            } else {
                                this.o0 = 0.0f;
                            }
                            u1(false);
                            c1(abs2, qu0VarArr[1].F);
                            P0(getTabProgress());
                            O0();
                        }
                    } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                        X0(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    j1(motionEvent);
                }
                return this.x1;
            }
        }
        return false;
    }

    public final void p0(ViewGroup viewGroup) {
        for (qu0 qu0Var : this.k0) {
            ws0 ws0Var = qu0Var.h;
            Objects.requireNonNull(ws0Var);
            qu0Var.n = new bh.l(ws0Var, viewGroup, new fq0(ws0Var, 1));
        }
        ns0 ns0Var = this.V;
        if (ns0Var != null) {
            ns0Var.T = viewGroup;
            ns0Var.S = new ei.m7(ns0Var, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07e6  */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45, types: [org.telegram.ui.Components.mm0, org.telegram.ui.Components.pu0, s4.l0] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p1(boolean z10) {
        qu0[] qu0VarArr;
        qu0[] qu0VarArr2;
        s4.t0 t0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        s4.t0 t0Var2;
        boolean z14;
        String str;
        s4.g0 g0Var;
        ?? r52;
        int i10;
        int i11;
        boolean z15;
        int i12;
        boolean z02;
        int i13;
        boolean z16;
        s4.t0 t0Var3;
        int i14;
        int i15;
        boolean z17;
        ns0 ns0Var = this.V;
        if (ns0Var != null) {
            ns0Var.i();
        }
        int i16 = 0;
        while (true) {
            qu0VarArr = this.k0;
            if (i16 >= qu0VarArr.length) {
                break;
            }
            qu0VarArr[i16].h.B0();
            i16++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qu0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(E0());
        s4.g0 adapter = qu0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.g0 g0Var2 = this.c0;
        s4.y yVar = this.b0;
        if (adapter == g0Var2) {
            yVar.d(null);
        }
        boolean z18 = this.V0;
        ju0 ju0Var = this.D1;
        ev0 ev0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = this.n0;
        int i17 = 100;
        if (z18 && this.U0) {
            qu0 qu0Var = qu0VarArr[z10 ? 1 : 0];
            if (qu0Var.f == null) {
                qu0Var.f = new s4.t0();
            }
            qu0 qu0Var2 = qu0VarArr[z10 ? 1 : 0];
            t0Var3 = qu0Var2.f;
            iv0 iv0Var = this.S;
            ou0 ou0Var = this.j0;
            tu0 tu0Var = this.h0;
            tu0 tu0Var2 = this.i0;
            tu0 tu0Var3 = this.g0;
            if (z10) {
                int i18 = qu0Var2.F;
                if (i18 == 0 || i18 == 2 || i18 == 5 || i18 == 6 || (i18 == 7 && !ju0Var.T())) {
                    this.V0 = false;
                    kt0 kt0Var = this.J0;
                    if (kt0Var != null) {
                        kt0Var.g(false);
                    }
                    this.U0 = false;
                    p1(true);
                    return;
                }
                String obj = u0Var != null ? u0Var.getSearchField().getText().toString() : "";
                int i19 = qu0VarArr[z10 ? 1 : 0].F;
                if (i19 == 1) {
                    if (tu0Var3 != null) {
                        tu0Var3.G(obj, false);
                        if (adapter != tu0Var3) {
                            Z0(adapter);
                            qu0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var3);
                        }
                    }
                } else if (i19 == 3) {
                    if (tu0Var2 != null) {
                        tu0Var2.G(obj, false);
                        if (adapter != tu0Var2) {
                            Z0(adapter);
                            qu0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var2);
                        }
                    }
                } else if (i19 == 4) {
                    if (tu0Var != null) {
                        tu0Var.G(obj, false);
                        if (adapter != tu0Var) {
                            Z0(adapter);
                            qu0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var);
                        }
                    }
                } else if (i19 == 7) {
                    if (ou0Var != null) {
                        ou0Var.F(obj, false);
                        if (adapter != ou0Var) {
                            Z0(adapter);
                            qu0VarArr[z10 ? 1 : 0].h.setAdapter(ou0Var);
                        }
                    }
                } else if (i19 == 11) {
                    if (iv0Var != null) {
                        iv0Var.E(this.W0, obj);
                        if (adapter != iv0Var) {
                            Z0(adapter);
                            qu0VarArr[z10 ? 1 : 0].h.setAdapter(iv0Var);
                        }
                    }
                } else if (i19 == 15 && ev0Var != null && adapter != ev0Var) {
                    Z0(adapter);
                    ws0 ws0Var = qu0VarArr[z10 ? 1 : 0].h;
                    ev0Var.r = ws0Var;
                    ws0Var.setAdapter(ev0Var);
                }
            } else if (qu0Var2.h != null) {
                int i20 = qu0Var2.F;
                if (i20 == 1) {
                    if (adapter != tu0Var3) {
                        Z0(adapter);
                        qu0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var3);
                    }
                    tu0Var3.l();
                } else if (i20 == 3) {
                    if (adapter != tu0Var2) {
                        Z0(adapter);
                        qu0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var2);
                    }
                    tu0Var2.l();
                } else if (i20 == 4) {
                    if (adapter != tu0Var) {
                        Z0(adapter);
                        qu0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var);
                    }
                    tu0Var.l();
                } else if (i20 == 7) {
                    if (adapter != ou0Var) {
                        Z0(adapter);
                        qu0VarArr[z10 ? 1 : 0].h.setAdapter(ou0Var);
                    }
                    ou0Var.l();
                } else if (i20 == 11) {
                    if (adapter != iv0Var) {
                        Z0(adapter);
                        qu0VarArr[z10 ? 1 : 0].h.setAdapter(iv0Var);
                    }
                    iv0Var.l();
                }
            }
            qu0VarArr2 = qu0VarArr;
            i10 = 4;
            z15 = false;
            z16 = false;
            i13 = 8;
        } else {
            qu0 qu0Var3 = qu0VarArr[z10 ? 1 : 0];
            if (qu0Var3.e == null) {
                qu0Var3.e = new s4.t0();
            }
            qu0 qu0Var4 = qu0VarArr[z10 ? 1 : 0];
            s4.t0 t0Var4 = qu0Var4.e;
            qu0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i21 = qu0VarArr[z10 ? 1 : 0].F;
            if (i21 == 8 || z0(i21)) {
                layoutParams.topMargin = AndroidUtilities.dp(E0());
            }
            ws0 ws0Var2 = qu0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = ws0Var2.getPaddingLeft();
            qu0 qu0Var5 = qu0VarArr[z10 ? 1 : 0];
            ws0 ws0Var3 = qu0Var5.h;
            int a02 = a0(qu0Var5.F);
            ws0Var3.e3 = a02;
            int paddingRight = qu0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            qu0VarArr2 = qu0VarArr;
            ws0 ws0Var4 = qu0VarArr2[z10 ? 1 : 0].h;
            int Z = Z(y0());
            ws0Var4.f3 = Z;
            ws0Var2.setPadding(paddingLeft, a02, paddingRight, Z);
            int i22 = qu0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.m1;
            s4.g0 g0Var3 = this.K;
            View view = this.U;
            du0 du0Var = this.T;
            hv0 hv0Var = this.R;
            iu0 iu0Var = this.P;
            mv0[] mv0VarArr = this.t1;
            if (i22 == 0) {
                s4.g0 g0Var4 = this.H;
                if (adapter != g0Var4) {
                    Z0(adapter);
                    qu0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var4);
                }
                int i23 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i23;
                layoutParams.leftMargin = i23;
                mv0 mv0Var = mv0VarArr[0];
                boolean z19 = mv0Var.h && !mv0Var.e.isEmpty();
                i17 = iArr[0];
                qu0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.y0);
                mv0 mv0Var2 = mv0VarArr[0];
                if (mv0Var2.x == null) {
                    mv0Var2.x = new s4.t0();
                }
                z13 = z19;
                t0Var = mv0VarArr[0].x;
                z11 = false;
            } else {
                if (i22 == 1) {
                    mv0 mv0Var3 = mv0VarArr[1];
                    z12 = mv0Var3.h && !mv0Var3.e.isEmpty();
                    if (adapter != g0Var3) {
                        Z0(adapter);
                        qu0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var3);
                    }
                } else if (i22 == 2) {
                    mv0 mv0Var4 = mv0VarArr[2];
                    z12 = mv0Var4.h && !mv0Var4.e.isEmpty();
                    s4.g0 g0Var5 = this.L;
                    if (adapter != g0Var5) {
                        Z0(adapter);
                        qu0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var5);
                    }
                } else {
                    if (i22 == 3) {
                        if (adapter != this.J) {
                            Z0(adapter);
                            qu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i22 == 4) {
                        mv0 mv0Var5 = mv0VarArr[4];
                        z12 = mv0Var5.h && !mv0Var5.e.isEmpty();
                        if (adapter != this.M) {
                            Z0(adapter);
                            qu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i22 == 5) {
                            if (adapter != this.O) {
                                Z0(adapter);
                                qu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i22 == 15) {
                            if (adapter != ev0Var) {
                                Z0(adapter);
                                ws0 ws0Var5 = qu0VarArr2[z10 ? 1 : 0].h;
                                ev0Var.r = ws0Var5;
                                ws0Var5.setAdapter(ev0Var);
                            }
                        } else if (i22 == 6) {
                            if (adapter != iu0Var) {
                                Z0(adapter);
                                qu0VarArr2[z10 ? 1 : 0].h.setAdapter(iu0Var);
                            }
                        } else if (i22 == 7) {
                            if (adapter != this.a0) {
                                Z0(adapter);
                                qu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.a0);
                            }
                        } else if (r0(i22)) {
                            s4.g0 n12 = n1(qu0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != n12) {
                                Z0(adapter);
                                qu0VarArr2[z10 ? 1 : 0].h.setAdapter(n12);
                                qu0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            qu0 qu0Var6 = qu0VarArr2[z10 ? 1 : 0];
                            if (qu0Var6.F != 9) {
                                yVar.d(qu0Var6.h);
                            }
                            i17 = iArr[1];
                        } else {
                            int i24 = qu0VarArr2[z10 ? 1 : 0].F;
                            if (i24 == 10) {
                                if (adapter != this.Q) {
                                    Z0(adapter);
                                    qu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i24 == 11) {
                                if (adapter != hv0Var) {
                                    Z0(adapter);
                                    qu0VarArr2[z10 ? 1 : 0].h.setAdapter(hv0Var);
                                    s4.y yVar2 = hv0Var.v;
                                    ws0 ws0Var6 = qu0VarArr2[z10 ? 1 : 0].h;
                                    hv0Var.s = ws0Var6;
                                    yVar2.d(ws0Var6);
                                }
                                t0Var = hv0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i24 == 12) {
                                if (adapter != null) {
                                    Z0(adapter);
                                    qu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (du0Var.getParent() != qu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(du0Var);
                                    qu0VarArr2[z10 ? 1 : 0].addView(du0Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i24 == 13) {
                                if (adapter != null) {
                                    Z0(adapter);
                                    qu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != qu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    qu0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i24 == 14) {
                                if (adapter != null) {
                                    Z0(adapter);
                                    qu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (ns0Var != null && ns0Var.getParent() != qu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(ns0Var);
                                    qu0VarArr2[z10 ? 1 : 0].addView(ns0Var);
                                    qu0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        t0Var = t0Var4;
                        z11 = false;
                        z13 = false;
                    }
                    t0Var = t0Var4;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                t0Var = t0Var4;
                z11 = true;
            }
            v1(qu0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                qu0VarArr2[z10 ? 1 : 0].h.setSections(false);
                t0Var2 = t0Var;
            } else {
                ws0 ws0Var7 = qu0VarArr2[z10 ? 1 : 0].h;
                ws0Var7.getClass();
                t0Var2 = t0Var;
                org.telegram.ui.ActionBar.r6.m(ws0Var7, 20, org.telegram.ui.ActionBar.k6.i6, ws0Var7.n2);
                ws0Var7.H2 = null;
                ws0Var7.K2 = 0.0f;
                ws0Var7.L2 = null;
                ws0Var7.M2 = null;
                ws0Var7.I2 = null;
                ws0Var7.setSectionsRounding(false);
                yl0 yl0Var = ws0Var7.G2;
                if (yl0Var != null) {
                    ws0Var7.p0(yl0Var);
                    ws0Var7.G2 = null;
                }
            }
            qu0 qu0Var7 = qu0VarArr2[z10 ? 1 : 0];
            int i25 = qu0Var7.F;
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            if (i25 == 15) {
                z14 = z13;
                str = "";
                g0Var = g0Var3;
                qu0Var7.setBackground(ei.r6.e(qu0Var7.getBackground(), o2Var.getCurrentAccount(), this.j1, org.telegram.ui.ActionBar.k6.I.q()));
                qu0VarArr2[z10 ? 1 : 0].setOutlineProvider(new ci.n1(16));
                qu0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                str = "";
                g0Var = g0Var3;
                qu0Var7.setClipToOutline(false);
                r52 = 0;
                qu0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            qu0 qu0Var8 = qu0VarArr2[z10 ? 1 : 0];
            if (qu0Var8.F == 11) {
                qu0Var8.h.setItemAnimator(qu0Var8.d);
            } else {
                qu0Var8.h.setItemAnimator(r52);
                if (hv0Var != null && qu0VarArr2[z10 ? 1 : 0].h == hv0Var.s) {
                    s4.y yVar3 = hv0Var.v;
                    hv0Var.s = r52;
                    yVar3.d(r52);
                }
            }
            if (du0Var != null && qu0VarArr2[z10 ? 1 : 0].F != 12 && du0Var.getParent() == qu0VarArr2[z10 ? 1 : 0]) {
                du0Var.a.onRemoveFromParent();
                qu0VarArr2[z10 ? 1 : 0].removeView(du0Var);
            }
            if (view != null && qu0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                qu0 qu0Var9 = qu0VarArr2[z10 ? 1 : 0];
                if (parent == qu0Var9) {
                    qu0Var9.removeView(view);
                }
            }
            if (ns0Var != null && qu0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = ns0Var.getParent();
                qu0 qu0Var10 = qu0VarArr2[z10 ? 1 : 0];
                if (parent2 == qu0Var10) {
                    qu0Var10.removeView(ns0Var);
                }
            }
            int i26 = qu0VarArr2[z10 ? 1 : 0].F;
            if (i26 == 0 || i26 == 11 || r0(i26) || (i14 = qu0VarArr2[z10 ? 1 : 0].F) == 2 || i14 == 5 || i14 == 6 || ((i14 == 7 && !ju0Var.T()) || (i15 = qu0VarArr2[z10 ? 1 : 0].F) == 10 || i15 == 13 || i15 == 14)) {
                i10 = 4;
                if (z10) {
                    this.x0 = 2;
                } else {
                    this.x0 = 0;
                    if (u0Var != null) {
                        u0Var.setVisibility((y0() || this.V0) ? 8 : 4);
                    }
                }
            } else if (!z10) {
                z17 = false;
                if (u0Var != null) {
                    i10 = 4;
                    if (u0Var.getVisibility() == 4) {
                        if (E()) {
                            this.x0 = 0;
                            this.o0 = 1.0f;
                            u0Var.setVisibility(0);
                        } else {
                            u0Var.setVisibility(y0() ? 8 : 4);
                            this.o0 = 0.0f;
                        }
                    }
                    u1(z17);
                }
                i10 = 4;
                u1(z17);
            } else if (u0Var == null || u0Var.getVisibility() != 4 || this.G.n0) {
                z17 = false;
                this.x0 = 0;
                this.o0 = 1.0f;
                i10 = 4;
                u1(z17);
            } else {
                if (E()) {
                    this.x0 = 1;
                    u0Var.setVisibility(0);
                } else {
                    u0Var.setVisibility(y0() ? 8 : 4);
                }
                float f7 = z10 ? 1.0f : 0.0f;
                this.o0 = c0(f7);
                x1(1.0f - f7);
                i10 = 4;
                z17 = false;
                u1(z17);
            }
            int i27 = qu0VarArr2[z10 ? 1 : 0].F;
            if (i27 == 6) {
                if (!iu0Var.e && !iu0Var.h && iu0Var.d.isEmpty()) {
                    iu0.E(iu0Var, 0L);
                }
            } else if (i27 != 7) {
                if (r0(i27)) {
                    uv0 n13 = n1(qu0VarArr2[z10 ? 1 : 0].F);
                    if (n13 != null) {
                        ci.z6 z6Var = n13.s;
                        n13.P();
                        qu0VarArr2[z10 ? 1 : 0].w.e(z6Var != null && (z6Var.k() || (k0() && z6Var.g() > 0)), z10);
                        z15 = (z6Var == null || z6Var.g() <= 0 || w0()) ? false : true;
                        i12 = qu0VarArr2[z10 ? 1 : 0].F;
                        if (i12 != 8 || z0(i12)) {
                            qu0 qu0Var11 = qu0VarArr2[z10 ? 1 : 0];
                            ht0 ht0Var = qu0Var11.w;
                            z02 = z0(qu0Var11.F);
                            int k12 = k1(qu0VarArr2[z10 ? 1 : 0].F);
                            w9 w9Var = ht0Var.b;
                            ei.d dVar = ht0Var.f;
                            w9Var.setVisibility((!z02 || x0() || t0()) ? 8 : 0);
                            if (!z02) {
                                dVar.setVisibility(0);
                                dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), false);
                                i13 = 8;
                            } else if (x0()) {
                                i13 = 8;
                                dVar.setVisibility(8);
                            } else {
                                i13 = 8;
                                ht0Var.setStickerType(11);
                                dVar.setVisibility(!w0() ? 0 : 8);
                                dVar.h(w(), false);
                            }
                            if (z02) {
                                ht0Var.d.setText(LocaleController.getString(!w0() ? y0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                                ht0Var.e.setText(y0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                            } else {
                                ht0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                                ht0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                            }
                            dVar.setOnClickListener(new vr0(this, z02, k12, 0));
                        } else {
                            qu0 qu0Var12 = qu0VarArr2[z10 ? 1 : 0];
                            if (qu0Var12.F == 9) {
                                if (x0()) {
                                    qu0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                                    qu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                                } else {
                                    qu0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                                    qu0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                                    qu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                                    qu0VarArr2[z10 ? 1 : 0].w.f.h(w(), false);
                                }
                                qu0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                                qu0VarArr2[z10 ? 1 : 0].w.e.setText(y0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                                qu0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new tr0(this, 7));
                                i13 = 8;
                            } else {
                                qu0Var12.w.b.setVisibility(0);
                                qu0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                                qu0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                                qu0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                i13 = 8;
                                qu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                            }
                        }
                        z16 = false;
                        qu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
                        t0Var3 = t0Var2;
                    }
                } else {
                    int i28 = qu0VarArr2[z10 ? 1 : 0].F;
                    if (i28 != 10 && i28 != 11 && i28 != 12 && i28 != 13 && i28 != 14) {
                        if (i28 == 15) {
                            i28 = 8;
                        }
                        mv0 mv0Var6 = mv0VarArr[i28];
                        if (!mv0Var6.g && !mv0Var6.i[0] && mv0Var6.a.isEmpty()) {
                            mv0VarArr[i28].g = true;
                            g0Var.l();
                            if (i28 == 0) {
                                int i29 = mv0VarArr[0].q;
                                if (i29 == 1) {
                                    i11 = 6;
                                } else if (i29 == 2) {
                                    i11 = 7;
                                }
                                o2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i11, this.F, 1, o2Var.getClassGuid(), mv0VarArr[i11].p, null, null);
                            }
                            i11 = i28;
                            o2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i11, this.F, 1, o2Var.getClassGuid(), mv0VarArr[i11].p, null, null);
                        }
                    }
                }
            }
            z15 = z14;
            i12 = qu0VarArr2[z10 ? 1 : 0].F;
            if (i12 != 8) {
            }
            qu0 qu0Var112 = qu0VarArr2[z10 ? 1 : 0];
            ht0 ht0Var2 = qu0Var112.w;
            z02 = z0(qu0Var112.F);
            int k122 = k1(qu0VarArr2[z10 ? 1 : 0].F);
            w9 w9Var2 = ht0Var2.b;
            ei.d dVar2 = ht0Var2.f;
            w9Var2.setVisibility((!z02 || x0() || t0()) ? 8 : 0);
            if (!z02) {
            }
            if (z02) {
            }
            dVar2.setOnClickListener(new vr0(this, z02, k122, 0));
            z16 = false;
            qu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            t0Var3 = t0Var2;
        }
        int i30 = i17;
        qu0 qu0Var13 = qu0VarArr2[z10 ? 1 : 0];
        qu0Var13.b = z15;
        s1(qu0Var13, z16);
        qu0VarArr2[z10 ? 1 : 0].x.y1(i30);
        qu0VarArr2[z10 ? 1 : 0].h.a0();
        if (t0Var3 != null) {
            qu0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(t0Var3);
            qu0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(t0Var3);
        }
        if (this.x0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.G;
            if (kVar.n0) {
                this.z0 = true;
                kVar.g(true);
                this.x0 = 0;
                this.o0 = 0.0f;
                if (u0Var != null) {
                    u0Var.setVisibility(y0() ? i13 : i10);
                }
                u1(false);
            }
        }
    }

    public final void q1() {
        try {
            int j02 = j0(org.telegram.ui.ActionBar.k6.y8);
            int j03 = j0(org.telegram.ui.ActionBar.k6.z8);
            if (j02 == this.e2 && j03 == this.f2) {
                return;
            }
            this.e2 = j02;
            this.f2 = j03;
            org.telegram.ui.ActionBar.u0[] u0VarArr = {this.u0, this.t0, this.v0, this.w0, this.l0};
            for (int i10 = 0; i10 < 5; i10++) {
                org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i10];
                if (u0Var != null) {
                    u0Var.setIconColor(j02);
                    if (u0Var.getBackground() != null) {
                        org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), j03, true);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void r1() {
        cu0 cu0Var = this.H;
        if (cu0Var != null) {
            cu0Var.l();
        }
        kv0 kv0Var = this.K;
        if (kv0Var != null) {
            kv0Var.l();
        }
        kv0 kv0Var2 = this.L;
        if (kv0Var2 != null) {
            kv0Var2.l();
        }
        lv0 lv0Var = this.J;
        if (lv0Var != null) {
            lv0Var.X(false);
        }
        kv0 kv0Var3 = this.M;
        if (kv0Var3 != null) {
            kv0Var3.l();
        }
        ev0 ev0Var = this.N;
        if (ev0Var != null) {
            ev0Var.l();
        }
        lu0 lu0Var = this.O;
        if (lu0Var != null) {
            lu0Var.l();
        }
        fu0 fu0Var = this.c0;
        if (fu0Var != null) {
            fu0Var.l();
        }
        Iterator it = this.Z1.values().iterator();
        while (it.hasNext()) {
            ((wv0) it.next()).c.l();
        }
    }

    public boolean s0() {
        return false;
    }

    public final void s1(qu0 qu0Var, boolean z10) {
        boolean z11 = qu0Var.b && this.d;
        tl0 fastScroll = qu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = qu0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            qu0Var.c.cancel();
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
            qu0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<tl0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new org.telegram.ui.ho(fastScroll));
        qu0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.d1;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.d1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.c1 == 0) {
                this.c1 = -j10;
                int i10 = 0;
                while (true) {
                    mv0[] mv0VarArr = this.t1;
                    if (i10 >= mv0VarArr.length) {
                        break;
                    }
                    if (mv0VarArr[i10].b[1].size() == 0) {
                        mv0 mv0Var = mv0VarArr[i10];
                        mv0Var.j[1] = this.d1.migrated_from_max_id;
                        mv0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.d1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        nt0 nt0Var = this.I0;
        if (nt0Var != null) {
            nt0Var.setInitialTabId(s0() ? 9 : 8);
        }
        A1(true);
        p1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.X0[6] = i10;
        }
        A1(true);
        G();
    }

    public void setForwardRestrictedHint(r40 r40Var) {
        this.E1 = r40Var;
    }

    public void setMergeDialogId(long j10) {
        this.c1 = j10;
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
        A1(true);
        G();
        if (iArr2[0] >= 0) {
            C0(false);
        }
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.L1 = i11;
        int i14 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i14 >= qu0VarArr.length) {
                break;
            }
            qu0VarArr[i14].setTranslationY(this.L1);
            i14++;
        }
        if (this.P0 != null) {
            L();
        } else {
            jt0 jt0Var = this.R0;
            if (jt0Var != null) {
                jt0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.O0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.K0;
        v0Var.setTranslationY((v0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.O0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.Y1 != i10) {
            this.Y1 = i10;
            qu0[] qu0VarArr = this.k0;
            if (qu0VarArr != null) {
                for (qu0 qu0Var : qu0VarArr) {
                    if (qu0Var != null) {
                        ws0 ws0Var = qu0Var.h;
                        int paddingLeft = ws0Var.getPaddingLeft();
                        ws0 ws0Var2 = qu0Var.h;
                        int i11 = ws0Var2.Z2;
                        int paddingRight = ws0Var2.getPaddingRight();
                        ws0 ws0Var3 = qu0Var.h;
                        int Z = Z(y0());
                        ws0Var3.f3 = Z;
                        ws0Var.setPadding(paddingLeft, i11, paddingRight, Z);
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
            qu0[] qu0VarArr = this.k0;
            if (i10 >= qu0VarArr.length) {
                return;
            }
            s1(qu0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.e1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.e1 = userFull;
        A1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        b1(8);
    }

    public void setVisibleHeight(int i10) {
        this.N1 = i10;
        int i11 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i11 >= qu0VarArr.length) {
                break;
            }
            float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(qu0VarArr[i11].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            qu0VarArr[i11].w.setTranslationY(f7);
            qu0VarArr[i11].v.setTranslationY(-f7);
            i11++;
        }
        ms0 ms0Var = this.U;
        if (ms0Var != null) {
            ms0Var.setVisibleHeight(i10);
        }
        ns0 ns0Var = this.V;
        if (ns0Var != null) {
            ns0Var.setVisibleHeight(i10);
        }
    }

    public final boolean t0() {
        TLRPC.User user;
        long j10 = this.j1;
        return j10 > 0 && (user = MessagesController.getInstance(this.v1.getCurrentAccount()).getUser(Long.valueOf(j10))) != null && user.bot;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.u0 u0Var = this.t0;
        if (u0Var == null) {
            return;
        }
        boolean z10 = this.v1.getMessagesController().isPeerNoForwards(this.j1) || l0();
        u0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && u0Var.getBackground() != null) {
            u0Var.setBackground(null);
            return;
        }
        if (z10 || u0Var.getBackground() != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.z8;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(j0(i10), 5, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        u0Var.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(u0Var, g02, null, O, this.F1);
    }

    public final boolean u0() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (this.d1 == null || (o2Var = this.v1) == null) {
            return false;
        }
        return ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(this.d1.id)));
    }

    public final void u1(boolean z10) {
        ns0 ns0Var;
        ss0 ss0Var;
        bk0 bk0Var = this.s0;
        if (bk0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((ns0Var = this.V) == null || !ns0Var.g()) && ((ss0Var = this.W) == null || !ss0Var.w))) {
            f7 = Utilities.clamp(this.o0 + this.p0, 1.0f, 0.0f);
        }
        bk0Var.setAlpha(f7);
        if (z10) {
            A(b0(1.0f) > 0.5f, true);
        } else if (this.x0 == 2) {
            A(this.p0 > 0.1f, true);
        } else {
            A(this.o0 < 0.1f, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.G1.a(j0(org.telegram.ui.ActionBar.k6.d6));
            org.telegram.ui.ActionBar.h2 h2Var = this.D0;
            if (h2Var != null) {
                h2Var.a(j0(org.telegram.ui.ActionBar.k6.y8));
            }
            NumberTextView numberTextView = this.A0;
            if (numberTextView != null) {
                numberTextView.setTextColor(j0(org.telegram.ui.ActionBar.k6.y8));
            }
            q1();
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean v0(int i10) {
        return i10 == 7 ? this.D1.T() : (w0() || i10 == 0 || r0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14) ? false : true;
    }

    public final void v1(qu0 qu0Var) {
        int i10 = qu0Var.F;
        boolean z10 = i10 == 0 || r0(i10);
        FrameLayout.LayoutParams d = w7.z5.d(-1, -1.0f, 119, z10 ? 0.0f : 12.0f, (z10 ? 8 : 12) + 48, z10 ? 0.0f : 12.0f, z10 ? 0.0f : 12.0f);
        d.topMargin = e0(qu0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = qu0Var.v.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        qu0Var.v.setLayoutParams(d);
    }

    public final SpannableStringBuilder w() {
        if (this.X1 == null) {
            this.X1 = new SpannableStringBuilder();
            if (t0()) {
                this.X1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.X1.append((CharSequence) "c");
                this.X1.setSpan(new xq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.X1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.X1;
    }

    public boolean w0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void w1(boolean z10) {
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.k0;
            if (i10 >= qu0VarArr.length) {
                return;
            }
            int childCount = qu0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = qu0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.s7) {
                    ((org.telegram.ui.Cells.s7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) childAt).U(false, z10);
                }
            }
            i10++;
        }
    }

    public final void x(j80 j80Var, org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        String publicUsername = j10 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10))) : ChatObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a1.g.A(sb2, MessagesController.getInstance(o2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        j80Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new lg(this, sb2.toString(), o2Var, 21), false);
    }

    public boolean x0() {
        return false;
    }

    public final void x1(float f7) {
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        qu0[] qu0VarArr = this.k0;
        qu0 qu0Var = qu0VarArr[1];
        float f10 = 0.0f;
        if (qu0Var != null && qu0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        qu0 qu0Var2 = qu0VarArr[0];
        if (qu0Var2 != null && qu0Var2.F == 11) {
            f10 += 1.0f - f7;
        }
        u0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        u0Var.setScaleX(f11);
        u0Var.setScaleY(f11);
        u0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        if (r3 != Y(r0 ? 1 : 0, r3, true)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(j80 j80Var) {
        qu0 qu0Var;
        int x10 = j80Var.x();
        final int i10 = 0;
        j80Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.ds0
            public final /* synthetic */ xv0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        xv0 xv0Var = this.b;
                        xv0Var.getClass();
                        View[] viewArr = r2;
                        xv0Var.B1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        xv0 xv0Var2 = this.b;
                        xv0Var2.getClass();
                        View[] viewArr2 = r2;
                        xv0Var2.C1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        j80Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.ds0
            public final /* synthetic */ xv0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        xv0 xv0Var = this.b;
                        xv0Var.getClass();
                        View[] viewArr = r2;
                        xv0Var.B1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        xv0 xv0Var2 = this.b;
                        xv0Var2.getClass();
                        View[] viewArr2 = r2;
                        xv0Var2.C1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {j80Var.w(x10), j80Var.w(x10 + 1)};
        qu0[] qu0VarArr = this.k0;
        if (qu0VarArr != null && (qu0Var = qu0VarArr[0]) != null) {
            boolean r02 = r0(qu0Var.F);
            int i12 = this.m1[r02 ? 1 : 0];
        }
        viewArr[0].setEnabled(false);
        viewArr[0].setAlpha(0.5f);
        if (F()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    public boolean y0() {
        return false;
    }

    public final void y1() {
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        qu0 qu0Var = this.k0[1];
        boolean z10 = qu0Var != null && qu0Var.F == 11;
        if (z10) {
            u0Var.setVisibility(0);
        }
        u0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new b60(3, this, z10)).setDuration(420L).setInterpolator(bs.h).start();
    }

    public final void z(pu0 pu0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = pu0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = pu0Var.getChildAt(i11);
            if (childAt instanceof b10) {
                view = childAt;
            }
        }
        if (view != null) {
            pu0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new st0(this, pu0Var, sparseBooleanArray, (b10) view, i10));
    }

    public final void z1() {
        boolean z10;
        ci.z6 z6Var;
        boolean t02 = t0();
        org.telegram.ui.ActionBar.u0 u0Var = this.w0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.v0;
        if (t02) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (z0(getClosestTab())) {
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                }
                if (u0Var != null) {
                    u0Var.setVisibility(8);
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
            fu0 fu0Var = this.c0;
            if (fu0Var != null && (z6Var = fu0Var.s) != null && !z6Var.m(messageObject.getId())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (u0Var2 != null) {
            u0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (u0Var != null) {
            u0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public void G0(SparseArray sparseArray) {
    }

    public void H0() {
    }

    public void N0(boolean z10) {
    }

    public void Q0(boolean z10) {
    }

    public int Y0(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.m2
    public final void a(org.telegram.ui.Cells.q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void d(org.telegram.ui.Cells.q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void f(org.telegram.ui.Cells.q2 q2Var) {
    }

    public void q0() {
    }
}
