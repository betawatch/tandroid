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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ws0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs, org.telegram.ui.Cells.p2, nj0 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final qp0 u2 = new qp0(0);
    public static final int v2 = org.telegram.messenger.g0.L(7.0f);
    public static final int w2 = org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f);
    public int A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final iz E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final int F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final org.telegram.ui.ActionBar.w1 G0;
    public final lr0 G1;
    public final org.telegram.ui.ActionBar.k H;
    public final ArrayList H0;
    public gi.l3 H1;
    public final org.telegram.ui.ActionBar.y4 I;
    public final ArrayList I0;
    public final org.telegram.ui.ActionBar.e6 I1;
    public final org.telegram.ui.ActionBar.f5 J;
    public final ArrayList J0;
    public final si.c J1;
    public final dr0 K;
    public final ArrayList K0;
    public final za.p K1;
    public final qs0 L;
    public final tq0 L0;
    public boolean L1;
    public final ks0 M;
    public final qq0 M0;
    public final g2.g M1;
    public final js0 N;
    public final org.telegram.ui.Cells.t0 N0;
    public org.telegram.ui.f4 N1;
    public final js0 O;
    public AnimatorSet O0;
    public int O1;
    public final js0 P;
    public final uo0 P0;
    public boolean P1;
    public final fs0 Q;
    public final ArrayList Q0;
    public int Q1;
    public final mr0 R;
    public float R0;
    public AnimatorSet R1;
    public final kr0 S;
    public final pr S0;
    public final SparseArray S1;
    public final ir0 T;
    public final FrameLayout T0;
    public long T1;
    public final hs0 U;
    public final oq0 U0;
    public boolean U1;
    public final is0 V;
    public final int V0;
    public int V1;
    public final er0 W;
    public final Paint W0;
    public final ar0 W1;
    public boolean X0;
    public ei.r6 X1;
    public boolean Y0;
    public float Y1;
    public dh.n0 Z0;
    public boolean Z1;
    public boolean a;
    public final tp0 a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final vp0 b0;
    public int b1;
    public int b2;
    public boolean c;
    public final yp0 c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final jr0 d0;
    public int d1;
    public int d2;
    public int e;
    public final u4.y e0;
    public boolean e1;
    public int e2;
    public int f;
    public final gr0 f0;
    public long f1;
    public int f2;
    public final ts0 g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final rp0 h0;
    public TLRPC.UserFull h1;
    public pi.q h2;
    public final ts0 i0;
    public AnimatorSet i1;
    public float i2;
    public final tr0 j0;
    public boolean j1;
    public final RectF j2;
    public final tr0 k0;
    public boolean k1;
    public Runnable k2;
    public final tr0 l0;
    public boolean l1;
    public int l2;
    public final pr0 m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final rr0[] n0;
    public boolean n1;
    public final HashMap n2;
    public final org.telegram.ui.ActionBar.q0 o0;
    public boolean o1;
    public int o2;
    public final org.telegram.ui.ActionBar.q0 p0;
    public final int[] p1;
    public int p2;
    public final org.telegram.ui.ActionBar.q0 q0;
    public float q1;
    public boolean q2;
    public boolean r;
    public float r0;
    public boolean r1;
    public int r2;
    public int s;
    public float s0;
    public int s1;
    public int s2;
    public final TextView t0;
    public int t1;
    public final ImageView u0;
    public final eq0 u1;
    public final fh0 v0;
    public float v1;
    public int w;
    public final org.telegram.ui.ActionBar.q0 w0;
    public final ls0[] w1;
    public int x;
    public final org.telegram.ui.ActionBar.q0 x0;
    public final os0 x1;
    public final Rect y;
    public final org.telegram.ui.ActionBar.q0 y0;
    public final org.telegram.ui.ActionBar.d2 y1;
    public final org.telegram.ui.ActionBar.q0 z0;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0239, code lost:
    
        r1.b1 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a9b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0ba2 A[EDGE_INSN: B:172:0x0ba2->B:173:0x0ba2 BREAK  A[LOOP:3: B:139:0x085e->B:168:0x0a9b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c38  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0db8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ae A[EDGE_INSN: B:48:0x02ae->B:49:0x02ae BREAK  A[LOOP:0: B:30:0x0253->B:43:0x02a9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03bf A[LOOP:2: B:75:0x03bd->B:76:0x03bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e1  */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ws0(Context context, long j10, os0 os0Var, int i3, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, org.telegram.ui.ActionBar.d2 d2Var, lr0 lr0Var, int i12, org.telegram.ui.ActionBar.e6 e6Var, eh.c cVar) {
        super(context);
        int i13;
        TLRPC.ProfileTab profileTab;
        long j11;
        int i14;
        ls0[] ls0VarArr;
        int i15;
        qq0 qq0Var;
        int i16;
        int i17;
        hs0 hs0Var;
        float f10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        float f11;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.e6 e6Var3;
        eh.c cVar2;
        boolean z10;
        eh.c cVar3;
        int i18;
        int i19;
        int i20;
        rr0[] rr0VarArr;
        View view;
        ?? r9;
        ws0 ws0Var;
        yp0 yp0Var;
        boolean z11;
        qr0 qr0Var;
        int i21;
        int i22;
        aq0 aq0Var;
        qr0 qr0Var2;
        qr0 qr0Var3;
        qr0 qr0Var4;
        qr0 qr0Var5;
        qr0 qr0Var6;
        qr0 qr0Var7;
        qr0 qr0Var8;
        qr0 qr0Var9;
        qr0 qr0Var10;
        qr0 qr0Var11;
        qr0 qr0Var12;
        qr0 qr0Var13;
        qr0 qr0Var14;
        qr0 qr0Var15;
        qr0 qr0Var16;
        zu0 zu0Var;
        zu0 zu0Var2;
        zu0 zu0Var3;
        zu0 zu0Var4;
        zu0 zu0Var5;
        zu0 zu0Var6;
        zu0 zu0Var7;
        zu0 zu0Var8;
        zu0 zu0Var9;
        zu0 zu0Var10;
        qr0 qr0Var17;
        zu0 zu0Var11;
        qr0 qr0Var18;
        qr0 qr0Var19;
        rr0 rr0Var;
        aq0 aq0Var2;
        qr0 qr0Var20;
        org.telegram.ui.ActionBar.q0 a10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        ws0 ws0Var2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        ws0Var2.y = new Rect();
        ws0Var2.n0 = new rr0[2];
        ws0Var2.H0 = new ArrayList(10);
        ws0Var2.I0 = new ArrayList(10);
        ws0Var2.J0 = new ArrayList(10);
        ws0Var2.K0 = new ArrayList(10);
        ws0Var2.P0 = new uo0(ws0Var2, 0);
        ws0Var2.Q0 = new ArrayList();
        ws0Var2.W0 = new Paint();
        ws0Var2.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        ws0Var2.n1 = false;
        ws0Var2.o1 = false;
        ws0Var2.p1 = new int[]{3, 3};
        ws0Var2.u1 = new eq0(ws0Var2);
        ws0Var2.v1 = -5.0f;
        ws0Var2.w1 = new ls0[9];
        ws0Var2.M1 = new g2.g(1);
        ws0Var2.S1 = new SparseArray();
        ws0Var2.V1 = -1;
        ws0Var2.W1 = new ar0(ws0Var2);
        ws0Var2.Y1 = 0.0f;
        ws0Var2.g2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ws0Var2.j2 = new RectF();
        ws0Var2.l2 = -1;
        ws0Var2.m2 = new HashMap();
        ws0Var2.n2 = new HashMap();
        ws0Var2.q2 = true;
        si.c cVar4 = new si.c();
        ws0Var2.J1 = cVar4;
        cVar4.a(ws0Var2.s0(org.telegram.ui.ActionBar.k6.d6));
        eh.c cVar5 = cVar == null ? new eh.c(cVar4, cVar4, cVar4) : cVar;
        ws0Var2.F = i12;
        ws0Var2.I1 = e6Var;
        iz izVar = new iz(context);
        ws0Var2.E = izVar;
        izVar.setIsSingleCell(true);
        TLRPC.User a22 = d2Var.getMessagesController().a2(Long.valueOf(j10));
        ws0Var2.x1 = os0Var;
        ws0Var2.G1 = lr0Var;
        int[] iArr = os0Var.c;
        long j12 = os0Var.s;
        ws0Var2.G = j12;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j12 == 0 ? i3 : 0, iArr[7], iArr[8]};
        ws0Var2.a1 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i13 = 1;
                profileTab = null;
                if (i10 != 14 || i10 == 10 || i10 == 11 || i10 == 6) {
                    ws0Var2.b1 = i10;
                } else if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    ws0Var2.b1 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    ws0Var2.b1 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || ws0Var2.H0()))) {
                    ws0Var2.b1 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[i13];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            ws0Var2.b1 = i13;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[5]) == i23 || i27 > 0)) {
                        ws0Var2.b1 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        ws0Var2.b1 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        ws0Var2.b1 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        ws0Var2.b1 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || ws0Var2.H0())) {
                        ws0Var2.b1 = ws0Var2.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i10 == -1 || j12 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = ws0Var2.a1;
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
                        } else {
                            ws0Var2.b1 = i10;
                        }
                    } else {
                        ws0Var2.b1 = 14;
                    }
                } else {
                    ws0Var2.b1 = 14;
                }
                ws0Var2.X0(i10);
                ws0Var2.g1 = chatFull2;
                ws0Var2.h1 = userFull;
                if (chatFull2 != null) {
                    ws0Var2.f1 = -chatFull2.migrated_from_chat_id;
                }
                j11 = j10;
                ws0Var2.m1 = j11;
                i14 = 0;
                while (true) {
                    ls0VarArr = ws0Var2.w1;
                    if (i14 < ls0VarArr.length) {
                        break;
                    }
                    ls0VarArr[i14] = new ls0();
                    ws0Var2.w1[i14].j[0] = org.telegram.messenger.m5.C(ws0Var2.m1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    ws0Var2.w1[i14].j[1] = Integer.MAX_VALUE;
                    ws0Var2.a0(i14);
                    if (ws0Var2.f1 != 0 && ws0Var2.g1 != null && ws0Var2.w1[i14].b[1].size() == 0) {
                        ls0 ls0Var = ws0Var2.w1[i14];
                        ls0Var.j[1] = ws0Var2.g1.migrated_from_max_id;
                        ls0Var.i[1] = false;
                    }
                    i14++;
                }
                ws0Var2.y1 = d2Var;
                ws0Var2.H = d2Var.getActionBar();
                ws0Var2.I = d2Var.getSimpleActionBar();
                ws0Var2.p1[0] = ws0Var2.c1() > 0 ? org.telegram.messenger.az.t1 : ws0Var2.c1();
                ws0Var2.p1[1] = ws0Var2.c1() > 0 ? org.telegram.messenger.az.u1 : ws0Var2.c1();
                org.telegram.messenger.hs notificationCenter = d2Var.getNotificationCenter();
                notificationCenter.getClass();
                za.p pVar = new za.p(notificationCenter, ws0Var2);
                pVar.b(org.telegram.messenger.hs.V);
                pVar.b(org.telegram.messenger.hs.w);
                pVar.b(1);
                pVar.b(org.telegram.messenger.hs.K);
                pVar.b(org.telegram.messenger.hs.f2);
                pVar.b(org.telegram.messenger.hs.g2);
                pVar.b(org.telegram.messenger.hs.h2);
                pVar.b(org.telegram.messenger.hs.x5);
                pVar.b(org.telegram.messenger.hs.v5);
                pVar.b(org.telegram.messenger.hs.f3);
                pVar.b(org.telegram.messenger.hs.g3);
                pVar.b(org.telegram.messenger.hs.s);
                pVar.b(org.telegram.messenger.hs.G3);
                pVar.b(org.telegram.messenger.hs.W3);
                pVar.b(org.telegram.messenger.hs.f1);
                ws0Var2.K1 = pVar;
                for (i15 = 0; i15 < 10; i15++) {
                    if (i10 == 4) {
                        pq0 pq0Var = new pq0(ws0Var2, context);
                        pq0Var.U.c();
                        ws0Var2.J0.add(pq0Var);
                    }
                }
                ws0Var2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                ws0Var2.Y0 = false;
                ws0Var2.Z0 = null;
                qq0Var = ws0Var2.M0;
                if (qq0Var != null) {
                    qq0Var.g(false);
                }
                ws0Var2.X0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                ws0Var2.B0 = drawable;
                org.telegram.ui.ActionBar.r6.y(ws0Var2, drawable, org.telegram.ui.ActionBar.k6.b7, e6Var, PorterDuff.Mode.MULTIPLY);
                tq0 tq0Var = ws0Var2.L0;
                int currentTabId = tq0Var == null ? tq0Var.getCurrentTabId() : i10;
                tq0 tq0Var2 = new tq0(ws0Var2, context, ws0Var2.I1);
                i16 = ws0Var2.b1;
                if (i16 != -1) {
                    tq0Var2.setInitialTabId(i16);
                    ws0Var2.b1 = -1;
                }
                tq0Var2.c0 = 320L;
                int i32 = org.telegram.ui.ActionBar.k6.a;
                int i33 = org.telegram.ui.ActionBar.k6.ti;
                int i34 = org.telegram.ui.ActionBar.k6.si;
                int i35 = org.telegram.ui.ActionBar.k6.a;
                tq0Var2.M = i33;
                tq0Var2.N = i34;
                tq0Var2.updateColors();
                tq0Var2.setUseMinimalWidth(true);
                tq0Var2.setDelegate(new uq0(ws0Var2));
                ws0Var2.L0 = tq0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    ws0Var2.c1[i17].clear();
                }
                ws0Var2.d1 = 0;
                ws0Var2.Q0.clear();
                hs0Var = ws0Var2.U;
                if (hs0Var != null) {
                    hs0Var.x.clear();
                }
                if (ws0Var2 instanceof k20) {
                    org.telegram.ui.ActionBar.y4 y4Var = ws0Var2.I;
                    if (y4Var != null) {
                        org.telegram.ui.ActionBar.e5 o10 = y4Var.o();
                        a10 = o10.b(0, R.drawable.outline_header_search);
                        if (!ws0Var2.A0() && !ws0Var2.F0()) {
                            org.telegram.ui.ActionBar.f5 b10 = o10.b(0, R.drawable.ic_ab_other);
                            ws0Var2.J = b10;
                            b10.setContentDescription(org.telegram.messenger.bd.L0(2131754839));
                            b10.Y(false, false);
                        }
                        f10 = 10.0f;
                    } else {
                        org.telegram.ui.ActionBar.x q10 = ws0Var2.H.q();
                        q10.addOnLayoutChangeListener(new vq0(ws0Var2));
                        f10 = 10.0f;
                        if (ws0Var2.m1 == ws0Var2.y1.getUserConfig().e() && (ws0Var2.y1 instanceof r80) && ws0Var2.I()) {
                            ws0Var2.p0 = q10.a(11, R.drawable.outline_header_search);
                        }
                        a10 = q10.a(0, 0);
                    }
                    org.telegram.ui.ActionBar.q0 J = a10.M().J(new cr0(ws0Var2));
                    ws0Var2.q0 = J;
                    qq0 qq0Var2 = ws0Var2.M0;
                    J.setSearchFieldHint(org.telegram.messenger.bd.L0((qq0Var2 != null && qq0Var2.a() && ws0Var2.getSelectedTab() == 11) ? 2131745878 : 2131745846));
                    J.setContentDescription(org.telegram.messenger.bd.M0(2131745846, "Search"));
                    if (ws0Var2.I != null) {
                        ((org.telegram.ui.ActionBar.f5) J).Y(false, false);
                    } else {
                        J.setTranslationY(org.telegram.messenger.g0.L(f10));
                        ws0Var2.setSearchItemVisibility(ws0Var2.H0() ? 8 : 4);
                    }
                } else {
                    f10 = 10.0f;
                }
                ImageView imageView = new ImageView(context);
                ws0Var2.u0 = imageView;
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754839, "AccDescrMoreOptions"));
                imageView.setTranslationY(org.telegram.messenger.g0.L(f10));
                imageView.setVisibility(4);
                if (ws0Var2.I == null || ws0Var2.A0() || ws0Var2.F0()) {
                    e6Var2 = e6Var;
                    f11 = 2.0f;
                } else {
                    ws0Var2.H.addView(imageView, b8.mf.e(48, 56, 85));
                    fh0 fh0Var = new fh0(context);
                    ws0Var2.v0 = fh0Var;
                    fh0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    fh0Var.e(R.raw.options_to_search, 24, 24);
                    f11 = 2.0f;
                    fh0Var.getAnimatedDrawable().G *= 2.0f;
                    fh0Var.getAnimatedDrawable().h = true;
                    e6Var2 = e6Var;
                    org.telegram.ui.ActionBar.r6.t(fh0Var, org.telegram.ui.ActionBar.k6.y8, e6Var2, PorterDuff.Mode.SRC_IN);
                    fh0Var.setVisibility(8);
                    ws0Var2.H.addView(fh0Var, b8.mf.e(48, 56, 85));
                }
                imageView.setOnClickListener(new vo0(ws0Var2, 0));
                f5Var = ws0Var2.J;
                if (f5Var != null) {
                    f5Var.setOnClickListener(new vo0(ws0Var2, 1));
                }
                q0Var = ws0Var2.q0;
                if (q0Var != null && ws0Var2.I == null) {
                    EditTextBoldCursor searchField = q0Var.getSearchField();
                    int i36 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(searchField, i36, e6Var2);
                    org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Gj, e6Var2);
                    org.telegram.ui.ActionBar.r6.w(searchField, i36, e6Var2);
                }
                ws0Var2.A0 = 0;
                LinearLayout linearLayout = new LinearLayout(context);
                ws0Var2.E0 = linearLayout;
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                linearLayout.setVisibility(4);
                ImageView imageView2 = new ImageView(context);
                ws0Var2.F0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(true);
                ws0Var2.G0 = w1Var;
                imageView2.setImageDrawable(w1Var);
                int i37 = org.telegram.ui.ActionBar.k6.y8;
                w1Var.a(ws0Var2.s0(i37));
                int i38 = org.telegram.ui.ActionBar.k6.z8;
                org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.g0(ws0Var2.s0(i38), 1), null, org.telegram.ui.ActionBar.r6.N(i38), e6Var2);
                imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131752041, "Close"));
                linearLayout.addView(imageView2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
                ws0Var2.Q0.add(imageView2);
                imageView2.setOnClickListener(new vo0(ws0Var2, 2));
                NumberTextView numberTextView = new NumberTextView(context);
                ws0Var2.D0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(org.telegram.messenger.g0.o());
                numberTextView.setTextColor(ws0Var2.s0(i37));
                linearLayout.addView(numberTextView, b8.mf.m(1.0f, 0, -1, 18, 0, 0));
                ws0Var2.Q0.add(numberTextView);
                if (!org.telegram.messenger.m5.C(ws0Var2.m1)) {
                    if (!ws0Var2.H0()) {
                        ws0Var2.x0 = ws0Var2.W(context, org.telegram.messenger.hs.n1, R.drawable.msg_message, org.telegram.messenger.bd.L0(2131754877));
                        ws0Var2.w0 = ws0Var2.W(context, 100, R.drawable.msg_forward, org.telegram.messenger.bd.L0(2131750588));
                    }
                    org.telegram.ui.ActionBar.q0 W = ws0Var2.W(context, org.telegram.messenger.hs.o1, R.drawable.msg_pin, org.telegram.messenger.bd.L0(2131747253));
                    ws0Var2.y0 = W;
                    W.setVisibility(8);
                    org.telegram.ui.ActionBar.q0 W2 = ws0Var2.W(context, org.telegram.messenger.hs.p1, R.drawable.msg_unpin, org.telegram.messenger.bd.L0(2131743854));
                    ws0Var2.z0 = W2;
                    W2.setVisibility(8);
                    ws0Var2.E1();
                }
                ws0Var2.o0 = ws0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, "Delete"));
                ws0Var2.K = new dr0(ws0Var2, context);
                ws0Var2.L = new qs0(ws0Var2, context);
                ws0Var2.N = new js0(ws0Var2, context, 1);
                ws0Var2.O = new js0(ws0Var2, context, 2);
                ws0Var2.P = new js0(ws0Var2, context, 4);
                ws0Var2.Q = new fs0(ws0Var2, context, ws0Var2.y1.getCurrentAccount(), ws0Var2.y1.getResourceProvider());
                ws0Var2.R = new mr0(ws0Var2, context);
                ws0Var2.j0 = new tr0(ws0Var2, context, 1);
                ws0Var2.k0 = new tr0(ws0Var2, context, 4);
                ws0Var2.l0 = new tr0(ws0Var2, context, 3);
                ws0Var2.m0 = new pr0(ws0Var2, context);
                ws0Var2.S = new kr0(ws0Var2, context);
                ws0Var2.T = new ir0(ws0Var2, context);
                ws0Var2.U = new hs0(ws0Var2, context);
                ws0Var2.V = new is0(ws0Var2, context);
                if (!ws0Var2.H0() && !ws0Var2.x0() && ws0Var2.G == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", ws0Var2.y1.getUserConfig().e());
                    bundle.putInt("chatMode", 3);
                    er0 er0Var = new er0(ws0Var2, context, ws0Var2.y1.getParentLayout(), bundle);
                    ws0Var2.W = er0Var;
                    long j13 = ws0Var2.m1;
                    org.telegram.ui.xm xmVar = er0Var.a;
                    xmVar.s4 = j13;
                    xmVar.kb = true;
                    er0Var.setClipToOutline(true);
                    er0Var.setOutlineProvider(new fr0());
                }
                jr0 jr0Var = new jr0(ws0Var2, context);
                ws0Var2.d0 = jr0Var;
                if (ws0Var2.G == 0) {
                    jr0Var.e = arrayList;
                    jr0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                ws0Var2.f0 = new gr0(ws0Var2, context);
                ws0Var2.e0 = new u4.y(new hr0(ws0Var2));
                ws0Var2.g0 = new ts0(ws0Var2, context, false);
                ws0Var2.h0 = new rp0(ws0Var2, context);
                ws0Var2.i0 = new ts0(ws0Var2, context, true);
                ws0Var2.M = new ks0(ws0Var2, context);
                if (ws0Var2.B0()) {
                    if (ws0Var2.y1 instanceof ProfileActivity) {
                        TextView textView = new TextView(context);
                        ws0Var2.t0 = textView;
                        textView.setText(org.telegram.messenger.bd.L0(2131745956).toUpperCase());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        int i39 = org.telegram.ui.ActionBar.k6.Ci;
                        org.telegram.ui.ActionBar.r6.V(textView, i39, e6Var2);
                        textView.setTextSize(1, 15.0f);
                        textView.setGravity(17);
                        org.telegram.ui.ActionBar.r6.R(textView, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.r1(0.15f, ws0Var2.s0(i39)), 3), null, org.telegram.ui.ActionBar.r6.L(0.15f, i39), e6Var2);
                        textView.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
                        ws0Var2.H.addView(textView, b8.mf.e(-2, 56, 85));
                        textView.setOnClickListener(new vo0(ws0Var2, 3));
                        textView.setVisibility(8);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(0.4f);
                        textView.setScaleY(0.4f);
                        org.telegram.ui.ActionBar.d2 d2Var2 = ws0Var2.y1;
                        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
                        eh.c cVar6 = cVar5;
                        e6Var3 = e6Var4;
                        ws0Var2.b0 = new vp0(ws0Var2, d2Var2, context, d2Var2.getCurrentAccount(), ((ProfileActivity) ws0Var2.y1).a(), e6Var4, cVar6);
                        ws0Var2.F1();
                        ws0Var2.c0 = new yp0(ws0Var2, context, ws0Var2.getStoriesController().B(ws0Var2.m1, true), new xp0(ws0Var2, context, d2Var, e6Var3));
                        cVar2 = cVar6;
                    } else {
                        e6Var3 = e6Var2;
                        cVar2 = cVar5;
                    }
                    z10 = false;
                    cVar3 = cVar2;
                } else {
                    ws0Var2.a0 = new tp0(ws0Var2, context, ws0Var2.y1, ws0Var2.m1);
                    e6Var3 = e6Var2;
                    cVar3 = cVar5;
                    z10 = false;
                }
                ws0Var2.setWillNotDraw(z10);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    rr0VarArr = ws0Var2.n0;
                    if (i20 < rr0VarArr.length) {
                        break;
                    }
                    if (i20 == 0 && (rr0Var = rr0VarArr[i20]) != null && (aq0Var2 = rr0Var.x) != null) {
                        i19 = aq0Var2.L0();
                        if (i19 != ws0Var2.n0[i20].x.B() - 1) {
                            qr0Var20 = ws0Var2.n0[i20].h;
                            bj0 bj0Var = (bj0) qr0Var20.K(i19);
                            if (bj0Var != null) {
                                i18 = bj0Var.a.getTop();
                            } else {
                                i19 = -1;
                            }
                        } else {
                            i21 = i18;
                            i22 = -1;
                            zp0 zp0Var = new zp0(ws0Var2, context);
                            ws0Var2.addView(zp0Var, b8.mf.d(-1, -1.0f, 51, 0.0f, ws0Var2.N0(), 0.0f, 0.0f));
                            if (i20 == 1) {
                                zp0Var.setTranslationX(org.telegram.messenger.g0.q.x);
                            }
                            ws0Var2.n0[i20] = zp0Var;
                            zp0Var.O = e6Var3;
                            rr0 rr0Var2 = ws0Var2.n0[i20];
                            aq0Var = new aq0(ws0Var2, zp0Var);
                            rr0Var2.x = aq0Var;
                            aq0Var.z1(new bq0(ws0Var2, zp0Var));
                            ws0Var2.n0[i20].d = new u4.k();
                            ws0Var2.n0[i20].d.n(280L);
                            ws0Var2.n0[i20].d.o(xq.h);
                            rr0 rr0Var3 = ws0Var2.n0[i20];
                            rr0Var3.d.m = false;
                            rr0Var3.h = new cq0(ws0Var2, context, zp0Var, aq0Var);
                            qr0Var2 = ws0Var2.n0[i20].h;
                            qr0Var2.setFastScrollEnabled(1);
                            qr0Var3 = ws0Var2.n0[i20].h;
                            qr0Var3.setScrollingTouchSlop(1);
                            qr0Var4 = ws0Var2.n0[i20].h;
                            qr0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                            qr0Var5 = ws0Var2.n0[i20].h;
                            qr0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                            qr0Var6 = ws0Var2.n0[i20].h;
                            qr0Var6.setItemAnimator(null);
                            qr0Var7 = ws0Var2.n0[i20].h;
                            qr0Var7.setClipToPadding(false);
                            qr0Var8 = ws0Var2.n0[i20].h;
                            qr0Var8.setSectionsType(2);
                            qr0Var9 = ws0Var2.n0[i20].h;
                            qr0Var9.setLayoutManager(aq0Var);
                            rr0 rr0Var4 = ws0Var2.n0[i20];
                            qr0Var10 = rr0Var4.h;
                            rr0Var4.addView(qr0Var10, b8.mf.c(-1.0f, -1));
                            ws0Var2.n0[i20].n = new qr0(context, null);
                            rr0 rr0Var5 = ws0Var2.n0[i20];
                            qr0 qr0Var21 = rr0Var5.n;
                            dq0 dq0Var = new dq0(ws0Var2);
                            rr0Var5.r = dq0Var;
                            qr0Var21.setLayoutManager(dq0Var);
                            rr0 rr0Var6 = ws0Var2.n0[i20];
                            rr0Var6.addView(rr0Var6.n, b8.mf.c(-1.0f, -1));
                            ws0Var2.n0[i20].n.setVisibility(8);
                            ws0Var2.n0[i20].n.i(new fq0(zp0Var));
                            qr0Var11 = ws0Var2.n0[i20].h;
                            qr0Var11.i(new gq0(ws0Var2, zp0Var));
                            qr0Var12 = ws0Var2.n0[i20].h;
                            qr0Var12.setOnItemClickListener(new ci.x3(ws0Var2, zp0Var, context, j11, e6Var3, 2));
                            qr0Var13 = ws0Var2.n0[i20].h;
                            qr0Var13.setOnScrollListener(new iq0(ws0Var2, zp0Var, aq0Var));
                            qr0Var14 = ws0Var2.n0[i20].h;
                            qr0Var14.setOnItemLongClickListener(new jq0(ws0Var2, zp0Var));
                            if (i20 == 0 && i22 != -1) {
                                aq0Var.h1(i22, i21);
                            }
                            qr0Var15 = ws0Var2.n0[i20].h;
                            ws0Var2.n0[i20].y = new kq0(context, qr0Var15);
                            ws0Var2.n0[i20].y.setVisibility(8);
                            qr0Var16 = ws0Var2.n0[i20].h;
                            kq0 kq0Var = ws0Var2.n0[i20].y;
                            FrameLayout.LayoutParams c2 = b8.mf.c(-1.0f, -1);
                            if (qr0Var16.c1 != null) {
                                qr0Var16.c1 = new ai.o2(24, qr0Var16.getContext(), qr0Var16);
                            }
                            qr0Var16.c1.addView(kq0Var, c2);
                            ws0Var2.n0[i20].s = new lq0(ws0Var2, context, zp0Var);
                            ws0Var2.n0[i20].s.x = false;
                            ws0Var2.n0[i20].s.setClipToOutline(true);
                            ws0Var2.n0[i20].s.setOutlineProvider(new mq0());
                            if (i20 == 0) {
                                ws0Var2.n0[i20].setVisibility(8);
                            }
                            rr0 rr0Var7 = ws0Var2.n0[i20];
                            rr0Var7.w = new nq0(ws0Var2, context, rr0Var7.s);
                            zu0Var = ws0Var2.n0[i20].w;
                            zu0Var.d(8, false);
                            zu0Var2 = ws0Var2.n0[i20].w;
                            zu0Var2.setAnimateLayoutChange(true);
                            rr0 rr0Var8 = ws0Var2.n0[i20];
                            zu0Var3 = rr0Var8.w;
                            rr0Var8.addView(zu0Var3, b8.mf.c(-1.0f, -1));
                            zu0Var4 = ws0Var2.n0[i20].w;
                            zu0Var4.setOnTouchListener(new fi.a(23));
                            zu0Var5 = ws0Var2.n0[i20].w;
                            zu0Var5.e(true, false);
                            zu0Var6 = ws0Var2.n0[i20].w;
                            zu0Var6.d.setText(org.telegram.messenger.bd.M0(2131748175, "NoResult"));
                            zu0Var7 = ws0Var2.n0[i20].w;
                            zu0Var7.f.setVisibility(8);
                            zu0Var8 = ws0Var2.n0[i20].w;
                            zu0Var8.e.setText(org.telegram.messenger.bd.L0(2131745817));
                            zu0Var9 = ws0Var2.n0[i20].w;
                            zu0Var9.f.setVisibility(8);
                            zu0Var10 = ws0Var2.n0[i20].w;
                            zu0Var10.addView(ws0Var2.n0[i20].s, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                            qr0Var17 = ws0Var2.n0[i20].h;
                            zu0Var11 = ws0Var2.n0[i20].w;
                            qr0Var17.setEmptyView(zu0Var11);
                            qr0Var18 = ws0Var2.n0[i20].h;
                            qr0Var18.o1(0, true);
                            rr0[] rr0VarArr2 = ws0Var2.n0;
                            rr0 rr0Var9 = rr0VarArr2[i20];
                            qr0Var19 = rr0VarArr2[i20].h;
                            rr0Var9.E = new vi0(qr0Var19, ws0Var2.n0[i20].x);
                            i20++;
                            j11 = j10;
                            e6Var3 = e6Var;
                            i18 = i21;
                            i19 = i22;
                        }
                    }
                    i21 = i18;
                    i22 = i19;
                    zp0 zp0Var2 = new zp0(ws0Var2, context);
                    ws0Var2.addView(zp0Var2, b8.mf.d(-1, -1.0f, 51, 0.0f, ws0Var2.N0(), 0.0f, 0.0f));
                    if (i20 == 1) {
                    }
                    ws0Var2.n0[i20] = zp0Var2;
                    zp0Var2.O = e6Var3;
                    rr0 rr0Var22 = ws0Var2.n0[i20];
                    aq0Var = new aq0(ws0Var2, zp0Var2);
                    rr0Var22.x = aq0Var;
                    aq0Var.z1(new bq0(ws0Var2, zp0Var2));
                    ws0Var2.n0[i20].d = new u4.k();
                    ws0Var2.n0[i20].d.n(280L);
                    ws0Var2.n0[i20].d.o(xq.h);
                    rr0 rr0Var32 = ws0Var2.n0[i20];
                    rr0Var32.d.m = false;
                    rr0Var32.h = new cq0(ws0Var2, context, zp0Var2, aq0Var);
                    qr0Var2 = ws0Var2.n0[i20].h;
                    qr0Var2.setFastScrollEnabled(1);
                    qr0Var3 = ws0Var2.n0[i20].h;
                    qr0Var3.setScrollingTouchSlop(1);
                    qr0Var4 = ws0Var2.n0[i20].h;
                    qr0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                    qr0Var5 = ws0Var2.n0[i20].h;
                    qr0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                    qr0Var6 = ws0Var2.n0[i20].h;
                    qr0Var6.setItemAnimator(null);
                    qr0Var7 = ws0Var2.n0[i20].h;
                    qr0Var7.setClipToPadding(false);
                    qr0Var8 = ws0Var2.n0[i20].h;
                    qr0Var8.setSectionsType(2);
                    qr0Var9 = ws0Var2.n0[i20].h;
                    qr0Var9.setLayoutManager(aq0Var);
                    rr0 rr0Var42 = ws0Var2.n0[i20];
                    qr0Var10 = rr0Var42.h;
                    rr0Var42.addView(qr0Var10, b8.mf.c(-1.0f, -1));
                    ws0Var2.n0[i20].n = new qr0(context, null);
                    rr0 rr0Var52 = ws0Var2.n0[i20];
                    qr0 qr0Var212 = rr0Var52.n;
                    dq0 dq0Var2 = new dq0(ws0Var2);
                    rr0Var52.r = dq0Var2;
                    qr0Var212.setLayoutManager(dq0Var2);
                    rr0 rr0Var62 = ws0Var2.n0[i20];
                    rr0Var62.addView(rr0Var62.n, b8.mf.c(-1.0f, -1));
                    ws0Var2.n0[i20].n.setVisibility(8);
                    ws0Var2.n0[i20].n.i(new fq0(zp0Var2));
                    qr0Var11 = ws0Var2.n0[i20].h;
                    qr0Var11.i(new gq0(ws0Var2, zp0Var2));
                    qr0Var12 = ws0Var2.n0[i20].h;
                    qr0Var12.setOnItemClickListener(new ci.x3(ws0Var2, zp0Var2, context, j11, e6Var3, 2));
                    qr0Var13 = ws0Var2.n0[i20].h;
                    qr0Var13.setOnScrollListener(new iq0(ws0Var2, zp0Var2, aq0Var));
                    qr0Var14 = ws0Var2.n0[i20].h;
                    qr0Var14.setOnItemLongClickListener(new jq0(ws0Var2, zp0Var2));
                    if (i20 == 0) {
                        aq0Var.h1(i22, i21);
                    }
                    qr0Var15 = ws0Var2.n0[i20].h;
                    ws0Var2.n0[i20].y = new kq0(context, qr0Var15);
                    ws0Var2.n0[i20].y.setVisibility(8);
                    qr0Var16 = ws0Var2.n0[i20].h;
                    kq0 kq0Var2 = ws0Var2.n0[i20].y;
                    FrameLayout.LayoutParams c22 = b8.mf.c(-1.0f, -1);
                    if (qr0Var16.c1 != null) {
                    }
                    qr0Var16.c1.addView(kq0Var2, c22);
                    ws0Var2.n0[i20].s = new lq0(ws0Var2, context, zp0Var2);
                    ws0Var2.n0[i20].s.x = false;
                    ws0Var2.n0[i20].s.setClipToOutline(true);
                    ws0Var2.n0[i20].s.setOutlineProvider(new mq0());
                    if (i20 == 0) {
                    }
                    rr0 rr0Var72 = ws0Var2.n0[i20];
                    rr0Var72.w = new nq0(ws0Var2, context, rr0Var72.s);
                    zu0Var = ws0Var2.n0[i20].w;
                    zu0Var.d(8, false);
                    zu0Var2 = ws0Var2.n0[i20].w;
                    zu0Var2.setAnimateLayoutChange(true);
                    rr0 rr0Var82 = ws0Var2.n0[i20];
                    zu0Var3 = rr0Var82.w;
                    rr0Var82.addView(zu0Var3, b8.mf.c(-1.0f, -1));
                    zu0Var4 = ws0Var2.n0[i20].w;
                    zu0Var4.setOnTouchListener(new fi.a(23));
                    zu0Var5 = ws0Var2.n0[i20].w;
                    zu0Var5.e(true, false);
                    zu0Var6 = ws0Var2.n0[i20].w;
                    zu0Var6.d.setText(org.telegram.messenger.bd.M0(2131748175, "NoResult"));
                    zu0Var7 = ws0Var2.n0[i20].w;
                    zu0Var7.f.setVisibility(8);
                    zu0Var8 = ws0Var2.n0[i20].w;
                    zu0Var8.e.setText(org.telegram.messenger.bd.L0(2131745817));
                    zu0Var9 = ws0Var2.n0[i20].w;
                    zu0Var9.f.setVisibility(8);
                    zu0Var10 = ws0Var2.n0[i20].w;
                    zu0Var10.addView(ws0Var2.n0[i20].s, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                    qr0Var17 = ws0Var2.n0[i20].h;
                    zu0Var11 = ws0Var2.n0[i20].w;
                    qr0Var17.setEmptyView(zu0Var11);
                    qr0Var18 = ws0Var2.n0[i20].h;
                    qr0Var18.o1(0, true);
                    rr0[] rr0VarArr22 = ws0Var2.n0;
                    rr0 rr0Var92 = rr0VarArr22[i20];
                    qr0Var19 = rr0VarArr22[i20].h;
                    rr0Var92.E = new vi0(qr0Var19, ws0Var2.n0[i20].x);
                    i20++;
                    j11 = j10;
                    e6Var3 = e6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = ws0Var2.c0;
                if (view != null) {
                    ws0Var2.addView(view, b8.mf.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                }
                org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
                ws0Var2.N0 = t0Var;
                t0Var.e0((int) (System.currentTimeMillis() / 1000), false, false);
                t0Var.setAlpha(0.0f);
                t0Var.g0(org.telegram.ui.ActionBar.k6.kd, org.telegram.ui.ActionBar.k6.Yd);
                t0Var.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
                ws0Var2.addView(t0Var, b8.mf.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                for (rr0 rr0Var10 : ws0Var2.n0) {
                    qr0Var = rr0Var10.h;
                    yi0 fastScroll = qr0Var.getFastScroll();
                    if (fastScroll != null) {
                        fastScroll.a(cVar3, ws0Var2.I != null ? b8.cd.m(e6Var) : b8.cd.o(e6Var));
                    }
                }
                if (ws0Var2.Y()) {
                    hh.e m10 = ws0Var2.I != null ? b8.cd.m(e6Var) : b8.cd.o(e6Var);
                    pr prVar = new pr(context);
                    ws0Var2.S0 = prVar;
                    int L = org.telegram.messenger.g0.L(11.0f);
                    int i40 = w2;
                    prVar.setPadding(L, i40, org.telegram.messenger.g0.L(11.0f), i40);
                    gh.g b11 = cVar3.b(prVar, m10);
                    b11.r(org.telegram.messenger.g0.L(24.0f));
                    b11.q(org.telegram.messenger.g0.L(7.0f));
                    prVar.setBlurredBackground(b11);
                    FrameLayout frameLayout = new FrameLayout(context);
                    ws0Var2.T0 = frameLayout;
                    prVar.addView(frameLayout);
                    prVar.i(frameLayout, true, false);
                    prVar.setOnAnimatedHeightChangedListener(new uo0(ws0Var2, 1));
                    oq0 oq0Var = new oq0(ws0Var2, context, d2Var, this, e6Var);
                    ws0Var2.U0 = oq0Var;
                    frameLayout.addView(oq0Var);
                    prVar.setCallFragmentContextView(oq0Var);
                    ws0Var2.addView(prVar, b8.mf.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
                    oq0Var.setDelegate(new wo0(ws0Var2));
                    gh.g b12 = cVar3.b(ws0Var2.L0, m10);
                    org.telegram.messenger.camera.q.p(b12, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    ws0Var2.L0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    ws0Var2.L0.setClipToPadding(false);
                    ws0Var2.L0.setBackground(null);
                    ws0Var2.L0.setBlurredBackground(b12);
                    ws0Var2.L0.setOpen(false);
                    ws0Var2.addView(ws0Var2.L0, b8.mf.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
                    Context context2 = ws0Var2.getContext();
                    org.telegram.ui.ActionBar.d2 d2Var3 = ws0Var2.y1;
                    qq0 qq0Var3 = new qq0(ws0Var2, context2, d2Var3, d2Var3.getCurrentAccount(), ws0Var2.x0() ? 0L : ws0Var2.m1, e6Var);
                    ws0 ws0Var3 = ws0Var2;
                    ws0Var3.M0 = qq0Var3;
                    qq0Var3.d(cVar3, m10);
                    qq0Var3.setShown(0.0f);
                    ws0Var3.addView(qq0Var3, b8.mf.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                    if (ws0Var3.I == null) {
                        gh.g b13 = cVar3.b(ws0Var3.E0, m10);
                        org.telegram.messenger.camera.q.p(b13, org.telegram.messenger.g0.L(18.0f), 6.666f);
                        ws0Var3.E0.setBackground(b13);
                        z11 = false;
                        ws0Var3.E0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        ws0Var3.addView(ws0Var3.E0, b8.mf.e(-1, 50, 51));
                    } else {
                        z11 = false;
                    }
                    ws0Var3.G();
                    ws0Var = ws0Var3;
                    r9 = z11;
                } else {
                    r9 = 0;
                    ws0Var = ws0Var2;
                }
                ws0Var.N1(r9);
                ws0Var.z1(r9);
                ws0Var.Q();
                if (ws0Var.a1[r9] >= 0) {
                    ws0Var.L0(r9);
                }
                yp0Var = ws0Var.c0;
                if (yp0Var != null || i11 <= 0) {
                }
                yp0Var.setInitialTabId(i11);
                return;
            }
            profileTab = chatFull2.main_tab;
        }
        i13 = 1;
        if (i10 != 14) {
        }
        ws0Var2.b1 = i10;
        ws0Var2.X0(i10);
        ws0Var2.g1 = chatFull2;
        ws0Var2.h1 = userFull;
        if (chatFull2 != null) {
        }
        j11 = j10;
        ws0Var2.m1 = j11;
        i14 = 0;
        while (true) {
            ls0VarArr = ws0Var2.w1;
            if (i14 < ls0VarArr.length) {
            }
            i14++;
        }
        ws0Var2.y1 = d2Var;
        ws0Var2.H = d2Var.getActionBar();
        ws0Var2.I = d2Var.getSimpleActionBar();
        ws0Var2.p1[0] = ws0Var2.c1() > 0 ? org.telegram.messenger.az.t1 : ws0Var2.c1();
        ws0Var2.p1[1] = ws0Var2.c1() > 0 ? org.telegram.messenger.az.u1 : ws0Var2.c1();
        org.telegram.messenger.hs notificationCenter2 = d2Var.getNotificationCenter();
        notificationCenter2.getClass();
        za.p pVar2 = new za.p(notificationCenter2, ws0Var2);
        pVar2.b(org.telegram.messenger.hs.V);
        pVar2.b(org.telegram.messenger.hs.w);
        pVar2.b(1);
        pVar2.b(org.telegram.messenger.hs.K);
        pVar2.b(org.telegram.messenger.hs.f2);
        pVar2.b(org.telegram.messenger.hs.g2);
        pVar2.b(org.telegram.messenger.hs.h2);
        pVar2.b(org.telegram.messenger.hs.x5);
        pVar2.b(org.telegram.messenger.hs.v5);
        pVar2.b(org.telegram.messenger.hs.f3);
        pVar2.b(org.telegram.messenger.hs.g3);
        pVar2.b(org.telegram.messenger.hs.s);
        pVar2.b(org.telegram.messenger.hs.G3);
        pVar2.b(org.telegram.messenger.hs.W3);
        pVar2.b(org.telegram.messenger.hs.f1);
        ws0Var2.K1 = pVar2;
        while (i15 < 10) {
        }
        ws0Var2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        ws0Var2.Y0 = false;
        ws0Var2.Z0 = null;
        qq0Var = ws0Var2.M0;
        if (qq0Var != null) {
        }
        ws0Var2.X0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        ws0Var2.B0 = drawable2;
        org.telegram.ui.ActionBar.r6.y(ws0Var2, drawable2, org.telegram.ui.ActionBar.k6.b7, e6Var, PorterDuff.Mode.MULTIPLY);
        tq0 tq0Var3 = ws0Var2.L0;
        if (tq0Var3 == null) {
        }
        tq0 tq0Var22 = new tq0(ws0Var2, context, ws0Var2.I1);
        i16 = ws0Var2.b1;
        if (i16 != -1) {
        }
        tq0Var22.c0 = 320L;
        int i322 = org.telegram.ui.ActionBar.k6.a;
        int i332 = org.telegram.ui.ActionBar.k6.ti;
        int i342 = org.telegram.ui.ActionBar.k6.si;
        int i352 = org.telegram.ui.ActionBar.k6.a;
        tq0Var22.M = i332;
        tq0Var22.N = i342;
        tq0Var22.updateColors();
        tq0Var22.setUseMinimalWidth(true);
        tq0Var22.setDelegate(new uq0(ws0Var2));
        ws0Var2.L0 = tq0Var22;
        while (i17 >= 0) {
        }
        ws0Var2.d1 = 0;
        ws0Var2.Q0.clear();
        hs0Var = ws0Var2.U;
        if (hs0Var != null) {
        }
        if (ws0Var2 instanceof k20) {
        }
        ImageView imageView3 = new ImageView(context);
        ws0Var2.u0 = imageView3;
        imageView3.setContentDescription(org.telegram.messenger.bd.M0(2131754839, "AccDescrMoreOptions"));
        imageView3.setTranslationY(org.telegram.messenger.g0.L(f10));
        imageView3.setVisibility(4);
        if (ws0Var2.I == null) {
        }
        e6Var2 = e6Var;
        f11 = 2.0f;
        imageView3.setOnClickListener(new vo0(ws0Var2, 0));
        f5Var = ws0Var2.J;
        if (f5Var != null) {
        }
        q0Var = ws0Var2.q0;
        if (q0Var != null) {
            EditTextBoldCursor searchField2 = q0Var.getSearchField();
            int i362 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(searchField2, i362, e6Var2);
            org.telegram.ui.ActionBar.r6.E(searchField2, org.telegram.ui.ActionBar.k6.Gj, e6Var2);
            org.telegram.ui.ActionBar.r6.w(searchField2, i362, e6Var2);
        }
        ws0Var2.A0 = 0;
        LinearLayout linearLayout2 = new LinearLayout(context);
        ws0Var2.E0 = linearLayout2;
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setClickable(true);
        linearLayout2.setVisibility(4);
        ImageView imageView22 = new ImageView(context);
        ws0Var2.F0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.w1 w1Var2 = new org.telegram.ui.ActionBar.w1(true);
        ws0Var2.G0 = w1Var2;
        imageView22.setImageDrawable(w1Var2);
        int i372 = org.telegram.ui.ActionBar.k6.y8;
        w1Var2.a(ws0Var2.s0(i372));
        int i382 = org.telegram.ui.ActionBar.k6.z8;
        org.telegram.ui.ActionBar.r6.R(imageView22, org.telegram.ui.ActionBar.k6.g0(ws0Var2.s0(i382), 1), null, org.telegram.ui.ActionBar.r6.N(i382), e6Var2);
        imageView22.setContentDescription(org.telegram.messenger.bd.M0(2131752041, "Close"));
        linearLayout2.addView(imageView22, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        ws0Var2.Q0.add(imageView22);
        imageView22.setOnClickListener(new vo0(ws0Var2, 2));
        NumberTextView numberTextView2 = new NumberTextView(context);
        ws0Var2.D0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(org.telegram.messenger.g0.o());
        numberTextView2.setTextColor(ws0Var2.s0(i372));
        linearLayout2.addView(numberTextView2, b8.mf.m(1.0f, 0, -1, 18, 0, 0));
        ws0Var2.Q0.add(numberTextView2);
        if (!org.telegram.messenger.m5.C(ws0Var2.m1)) {
        }
        ws0Var2.o0 = ws0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, "Delete"));
        ws0Var2.K = new dr0(ws0Var2, context);
        ws0Var2.L = new qs0(ws0Var2, context);
        ws0Var2.N = new js0(ws0Var2, context, 1);
        ws0Var2.O = new js0(ws0Var2, context, 2);
        ws0Var2.P = new js0(ws0Var2, context, 4);
        ws0Var2.Q = new fs0(ws0Var2, context, ws0Var2.y1.getCurrentAccount(), ws0Var2.y1.getResourceProvider());
        ws0Var2.R = new mr0(ws0Var2, context);
        ws0Var2.j0 = new tr0(ws0Var2, context, 1);
        ws0Var2.k0 = new tr0(ws0Var2, context, 4);
        ws0Var2.l0 = new tr0(ws0Var2, context, 3);
        ws0Var2.m0 = new pr0(ws0Var2, context);
        ws0Var2.S = new kr0(ws0Var2, context);
        ws0Var2.T = new ir0(ws0Var2, context);
        ws0Var2.U = new hs0(ws0Var2, context);
        ws0Var2.V = new is0(ws0Var2, context);
        if (!ws0Var2.H0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", ws0Var2.y1.getUserConfig().e());
            bundle2.putInt("chatMode", 3);
            er0 er0Var2 = new er0(ws0Var2, context, ws0Var2.y1.getParentLayout(), bundle2);
            ws0Var2.W = er0Var2;
            long j132 = ws0Var2.m1;
            org.telegram.ui.xm xmVar2 = er0Var2.a;
            xmVar2.s4 = j132;
            xmVar2.kb = true;
            er0Var2.setClipToOutline(true);
            er0Var2.setOutlineProvider(new fr0());
        }
        jr0 jr0Var2 = new jr0(ws0Var2, context);
        ws0Var2.d0 = jr0Var2;
        if (ws0Var2.G == 0) {
        }
        ws0Var2.f0 = new gr0(ws0Var2, context);
        ws0Var2.e0 = new u4.y(new hr0(ws0Var2));
        ws0Var2.g0 = new ts0(ws0Var2, context, false);
        ws0Var2.h0 = new rp0(ws0Var2, context);
        ws0Var2.i0 = new ts0(ws0Var2, context, true);
        ws0Var2.M = new ks0(ws0Var2, context);
        if (ws0Var2.B0()) {
        }
        ws0Var2.setWillNotDraw(z10);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            rr0VarArr = ws0Var2.n0;
            if (i20 < rr0VarArr.length) {
            }
            rr0 rr0Var722 = ws0Var2.n0[i20];
            rr0Var722.w = new nq0(ws0Var2, context, rr0Var722.s);
            zu0Var = ws0Var2.n0[i20].w;
            zu0Var.d(8, false);
            zu0Var2 = ws0Var2.n0[i20].w;
            zu0Var2.setAnimateLayoutChange(true);
            rr0 rr0Var822 = ws0Var2.n0[i20];
            zu0Var3 = rr0Var822.w;
            rr0Var822.addView(zu0Var3, b8.mf.c(-1.0f, -1));
            zu0Var4 = ws0Var2.n0[i20].w;
            zu0Var4.setOnTouchListener(new fi.a(23));
            zu0Var5 = ws0Var2.n0[i20].w;
            zu0Var5.e(true, false);
            zu0Var6 = ws0Var2.n0[i20].w;
            zu0Var6.d.setText(org.telegram.messenger.bd.M0(2131748175, "NoResult"));
            zu0Var7 = ws0Var2.n0[i20].w;
            zu0Var7.f.setVisibility(8);
            zu0Var8 = ws0Var2.n0[i20].w;
            zu0Var8.e.setText(org.telegram.messenger.bd.L0(2131745817));
            zu0Var9 = ws0Var2.n0[i20].w;
            zu0Var9.f.setVisibility(8);
            zu0Var10 = ws0Var2.n0[i20].w;
            zu0Var10.addView(ws0Var2.n0[i20].s, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 12.0f, 60.0f, 12.0f, 12.0f));
            qr0Var17 = ws0Var2.n0[i20].h;
            zu0Var11 = ws0Var2.n0[i20].w;
            qr0Var17.setEmptyView(zu0Var11);
            qr0Var18 = ws0Var2.n0[i20].h;
            qr0Var18.o1(0, true);
            rr0[] rr0VarArr222 = ws0Var2.n0;
            rr0 rr0Var922 = rr0VarArr222[i20];
            qr0Var19 = rr0VarArr222[i20].h;
            rr0Var922.E = new vi0(qr0Var19, ws0Var2.n0[i20].x);
            i20++;
            j11 = j10;
            e6Var3 = e6Var;
            i18 = i21;
            i19 = i22;
        }
        view = ws0Var2.c0;
        if (view != null) {
        }
        org.telegram.ui.Cells.t0 t0Var2 = new org.telegram.ui.Cells.t0(context);
        ws0Var2.N0 = t0Var2;
        t0Var2.e0((int) (System.currentTimeMillis() / 1000), false, false);
        t0Var2.setAlpha(0.0f);
        t0Var2.g0(org.telegram.ui.ActionBar.k6.kd, org.telegram.ui.ActionBar.k6.Yd);
        t0Var2.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
        ws0Var2.addView(t0Var2, b8.mf.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        while (r4 < r2) {
        }
        if (ws0Var2.Y()) {
        }
        ws0Var.N1(r9);
        ws0Var.z1(r9);
        ws0Var.Q();
        if (ws0Var.a1[r9] >= 0) {
        }
        yp0Var = ws0Var.c0;
        if (yp0Var != null) {
        }
    }

    public static boolean I0(int i3) {
        return (i3 & (-65536)) == 65536;
    }

    public static p3 X(int i3, long j10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        p3 p3Var = new p3(context, e6Var);
        ImageView imageView = (ImageView) p3Var.d;
        TextView textView = (TextView) p3Var.c;
        if (i3 == 0) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748204, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748206, null));
            return p3Var;
        }
        if (i3 == 1) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748165, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748166, null));
            return p3Var;
        }
        if (i3 == 2) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748160, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748161, null));
            return p3Var;
        }
        if (i3 == 3) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748162, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748163, null));
            return p3Var;
        }
        if (i3 == 4) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748167, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748168, null));
            return p3Var;
        }
        if (i3 == 5) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748164, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748216, null));
            return p3Var;
        }
        if (i3 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.bd.M0(2131748214, null));
            return p3Var;
        }
        if (i3 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return p3Var;
    }

    public static void a(ws0 ws0Var, TL_stories.StoryItem storyItem, ei.s6 s6Var) {
        ws0Var.getStoriesController().c(s6Var.a, ws0Var.m1, storyItem);
        org.telegram.messenger.g0.i3(new j50(18, ws0Var, s6Var), 100L);
    }

    public static void d(ws0 ws0Var, int i3, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(ws0Var, i3, storyItem, 16);
        ei.z6 storiesController = ws0Var.getStoriesController();
        long j10 = ws0Var.m1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i3, j10, arrayList);
        fc.a0(ws0Var.y1).K(R.raw.chats_archived, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.bd.M0(2131743895, null), f4Var).j();
    }

    public static void e(ws0 ws0Var, long j10, int i3) {
        ei.n6 B = ws0Var.getStoriesController().B(j10, true);
        int i10 = B.a;
        int c2 = B.c(i3);
        if (c2 == -1) {
            return;
        }
        ei.s6 s6Var = (ei.s6) B.h.remove(c2);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.hp.s1(i10).j1(B.b);
        tL_deleteAlbum.album_id = s6Var.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(ws0 ws0Var, long j10, int i3, String str) {
        ei.n6 B = ws0Var.getStoriesController().B(j10, true);
        int i10 = B.a;
        int c2 = B.c(i3);
        if (c2 == -1) {
            return;
        }
        ((ei.s6) B.h.get(c2)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.hp.s1(i10).j1(B.b);
        tL_updateAlbum.album_id = i3;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getPlaylistTopicId() {
        if (org.telegram.messenger.t3.b0(this.y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ei.z6 getStoriesController() {
        return org.telegram.messenger.hp.s1(this.y1.getCurrentAccount()).P1();
    }

    public static /* synthetic */ void h(ws0 ws0Var, TL_stories.StoryItem storyItem) {
        ws0Var.getStoriesController().r0(ws0Var.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        fc.a0(ws0Var.y1).G(R.raw.chats_archived, 5000, org.telegram.messenger.bd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(ws0 ws0Var, HashSet hashSet, TL_stories.StoryItem storyItem, f60 f60Var, ei.s6 s6Var) {
        String a02;
        long j10 = ws0Var.m1;
        if (hashSet.contains(Integer.valueOf(s6Var.a))) {
            ws0Var.getStoriesController().c(s6Var.a, j10, storyItem);
            a02 = org.telegram.messenger.bd.a0(null, null, 2131744741, s6Var.b);
        } else {
            ei.z6 storiesController = ws0Var.getStoriesController();
            int i3 = s6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i3, j10, arrayList);
            a02 = org.telegram.messenger.bd.a0(null, null, 2131744504, s6Var.b);
        }
        fc.a0(ws0Var.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.X2(a02)).j();
        f60Var.u();
    }

    public static void n1(int i3, View view) {
        if (view == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.topMargin != i3) {
            marginLayoutParams.topMargin = i3;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static int o(View view) {
        if (view instanceof org.telegram.ui.Cells.n7) {
            return ((org.telegram.ui.Cells.n7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            return ((org.telegram.ui.Cells.g7) view).getMessage().f1();
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            return ((org.telegram.ui.Cells.f7) view).getMessage().f1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab o0(int i3, boolean z10) {
        if (i3 != 8 && i3 != 14 && !z10) {
            return null;
        }
        if (i3 == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i3 == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i3 == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i3 == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i3 == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i3 == 5) {
            return new TLRPC.TL_profileTabGifs();
        }
        if (i3 == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i3 != 14) {
            return null;
        }
        return new TLRPC.TL_profileTabGifts();
    }

    public static int p0(TLRPC.ProfileTab profileTab) {
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

    public static void s(rr0 rr0Var, ls0[] ls0VarArr, boolean z10) {
        j50 j50Var;
        if (!z10) {
            if (rr0Var.G == null || (j50Var = rr0Var.H) == null) {
                return;
            }
            org.telegram.messenger.g0.r(j50Var);
            rr0Var.H.run();
            rr0Var.H = null;
            rr0Var.G = null;
            return;
        }
        if (org.telegram.messenger.az.v1 <= 0 || rr0Var.G != null || rr0Var.I || rr0Var.h.getFastScroll() == null || !rr0Var.h.getFastScroll().b0 || rr0Var.h.getFastScroll().getVisibility() != 0 || ls0VarArr[0].e() < 50) {
            return;
        }
        int i3 = org.telegram.messenger.az.v1;
        int i10 = i3 - 1;
        if (i3 != i10) {
            org.telegram.messenger.az.v1 = i10;
            org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.az.v1).apply();
        }
        rr0Var.I = true;
        Context context = rr0Var.getContext();
        ai.d2 d2Var = new ai.d2(context, 20);
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131745418, null));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i11 = org.telegram.ui.ActionBar.k6.dg;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i12 = org.telegram.ui.ActionBar.k6.eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        d2Var.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(d2Var, d02, N, null, null);
        d2Var.addView(textView, b8.mf.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        so0 so0Var = new so0(context);
        so0Var.a = new Random();
        Paint paint = new Paint(1);
        so0Var.b = paint;
        Paint paint2 = new Paint(1);
        so0Var.c = paint2;
        so0Var.f = 1.0f;
        so0Var.h = 0.0f;
        paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        Paint paint3 = new Paint();
        so0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        so0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d2Var.addView(so0Var, b8.mf.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        rr0Var.G = d2Var;
        rr0Var.addView(d2Var, b8.mf.c(-2.0f, -2));
        rr0Var.G.setAlpha(0.0f);
        rr0Var.G.setScaleX(0.8f);
        rr0Var.G.setScaleY(0.8f);
        rr0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        rr0Var.invalidate();
        j50 j50Var2 = new j50(19, rr0Var, d2Var);
        rr0Var.H = j50Var2;
        org.telegram.messenger.g0.i3(j50Var2, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        if (y4Var != null) {
            y4Var.setEnabled(z10);
        } else {
            this.H.setEnabled(z10);
        }
    }

    private void setPageOverscan(qr0 qr0Var) {
        if (!this.c2 || qr0Var == null) {
            return;
        }
        qr0Var.j3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qr0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            int i3 = marginLayoutParams.topMargin;
            int i10 = -this.e2;
            if (i3 == i10 && marginLayoutParams.bottomMargin == (-this.f2)) {
                return;
            }
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -this.f2;
            qr0Var.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchItemVisibility(int i3) {
        org.telegram.ui.ActionBar.q0 q0Var = this.q0;
        if (q0Var == null) {
            return;
        }
        if (this.I != null) {
            R(true, true);
        } else {
            q0Var.setVisibility(i3);
        }
    }

    public static void t(ws0 ws0Var, int i3, boolean z10) {
        rr0[] rr0VarArr = ws0Var.n0;
        if (rr0VarArr[0].F == i3) {
            return;
        }
        rr0 rr0Var = rr0VarArr[1];
        rr0Var.F = i3;
        rr0Var.setVisibility(0);
        ws0Var.w0();
        ws0Var.z1(true);
        ws0Var.k1 = z10;
        ws0Var.W0();
        ws0Var.E(!ws0Var.E0(i3));
        ws0Var.G1(true);
    }

    public static int x(ws0 ws0Var, u4.h0 h0Var) {
        if (h0Var == ws0Var.f0) {
            return 8;
        }
        if (h0Var == ws0Var.h0) {
            return 9;
        }
        for (vs0 vs0Var : ws0Var.m2.values()) {
            if (vs0Var.c == h0Var) {
                return vs0Var.a;
            }
        }
        return -1;
    }

    public static int y(ws0 ws0Var, u4.h0 h0Var) {
        if (h0Var == ws0Var.g0) {
            return 8;
        }
        if (h0Var == ws0Var.i0) {
            return 9;
        }
        for (vs0 vs0Var : ws0Var.m2.values()) {
            if (vs0Var.d == h0Var) {
                return vs0Var.a;
            }
        }
        return -1;
    }

    public static boolean z0(int i3) {
        return i3 == 8 || i3 == 9 || I0(i3);
    }

    public final SpannableStringBuilder A() {
        if (this.a2 == null) {
            this.a2 = new SpannableStringBuilder();
            if (B0()) {
                this.a2.append((CharSequence) org.telegram.messenger.bd.M0(2131746710, null));
            } else {
                this.a2.append((CharSequence) "c");
                this.a2.setSpan(new wp(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(2131744819, null));
            }
        }
        return this.a2;
    }

    public boolean A0() {
        return false;
    }

    public final void A1(org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (y0Var2.getCheckView().a.q || !y0Var.getCheckView().a.q) {
            y0Var.setChecked(!y0Var.getCheckView().a.q);
            runnable.run();
        } else {
            float f10 = -this.v1;
            this.v1 = f10;
            org.telegram.messenger.g0.G3(f10, y0Var, null);
        }
    }

    public final void B(vr0 vr0Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3) {
        String n4 = j10 > 0 ? org.telegram.messenger.l10.n(org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).a2(Long.valueOf(j10))) : org.telegram.messenger.t3.K(org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).M0(Long.valueOf(-j10)), false);
        if (n4 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.recaptcha.internal.a.s(sb2, org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).V2, "/", n4, "/a/");
        sb2.append(i3);
        vr0Var.n(R.drawable.media_share, new e7(this, sb2.toString(), d2Var, 24), org.telegram.messenger.bd.M0(2131744798, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User a22;
        long j10 = this.m1;
        return j10 > 0 && (a22 = org.telegram.messenger.hp.s1(this.y1.getCurrentAccount()).a2(Long.valueOf(j10))) != null && a22.bot;
    }

    public final void B1() {
        if (this.I != null) {
            return;
        }
        try {
            int s02 = s0(org.telegram.ui.ActionBar.k6.y8);
            int s03 = s0(org.telegram.ui.ActionBar.k6.z8);
            if (s02 == this.r2 && s03 == this.s2) {
                return;
            }
            this.r2 = s02;
            this.s2 = s03;
            org.telegram.ui.ActionBar.q0[] q0VarArr = {this.x0, this.w0, this.y0, this.z0, this.o0};
            for (int i3 = 0; i3 < 5; i3++) {
                org.telegram.ui.ActionBar.q0 q0Var = q0VarArr[i3];
                if (q0Var != null) {
                    q0Var.setIconColor(s02);
                    if (q0Var.getBackground() != null) {
                        org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), s03, true);
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void C(vr0 vr0Var) {
        final View[] viewArr = new View[2];
        final int i3 = 0;
        viewArr[0] = vr0Var.n(R.drawable.msg_zoomin, new Runnable(this) { // from class: org.telegram.ui.Components.jp0
            public final /* synthetic */ ws0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        ws0 ws0Var = this.b;
                        ws0Var.getClass();
                        View[] viewArr2 = viewArr;
                        ws0Var.O1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        ws0 ws0Var2 = this.b;
                        ws0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        ws0Var2.P1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.bd.M0(2131748658, null), false, false);
        final int i10 = 1;
        viewArr[1] = vr0Var.n(R.drawable.msg_zoomout, new Runnable(this) { // from class: org.telegram.ui.Components.jp0
            public final /* synthetic */ ws0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ws0 ws0Var = this.b;
                        ws0Var.getClass();
                        View[] viewArr2 = viewArr;
                        ws0Var.O1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        ws0 ws0Var2 = this.b;
                        ws0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        ws0Var2.P1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.bd.M0(2131748657, null), false, false);
        View view = viewArr[0];
        if (view != null) {
            view.setEnabled(J());
            viewArr[0].setAlpha(J() ? 1.0f : 0.5f);
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            view2.setEnabled(K());
            viewArr[1].setAlpha(K() ? 1.0f : 0.5f);
        }
    }

    public final boolean C0() {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (this.g1 == null || (d2Var = this.y1) == null) {
            return false;
        }
        return org.telegram.messenger.t3.V(d2Var.getMessagesController().M0(Long.valueOf(this.g1.id)));
    }

    public final void C1() {
        if (D0()) {
            post(new uo0(this, 13));
            return;
        }
        dr0 dr0Var = this.K;
        if (dr0Var != null) {
            dr0Var.f();
        }
        js0 js0Var = this.N;
        if (js0Var != null) {
            js0Var.f();
        }
        js0 js0Var2 = this.O;
        if (js0Var2 != null) {
            js0Var2.f();
        }
        ks0 ks0Var = this.M;
        if (ks0Var != null) {
            ks0Var.X(false);
        }
        js0 js0Var3 = this.P;
        if (js0Var3 != null) {
            js0Var3.f();
        }
        fs0 fs0Var = this.Q;
        if (fs0Var != null) {
            fs0Var.f();
        }
        mr0 mr0Var = this.R;
        if (mr0Var != null) {
            mr0Var.f();
        }
        gr0 gr0Var = this.f0;
        if (gr0Var != null) {
            gr0Var.f();
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ((vs0) it.next()).c.f();
        }
    }

    public final void D(qr0 qr0Var, int i3, SparseBooleanArray sparseBooleanArray) {
        int childCount = qr0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qr0Var.getChildAt(i10);
            if (childAt instanceof iz) {
                view = childAt;
            }
        }
        if (view != null) {
            qr0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new yq0(this, qr0Var, sparseBooleanArray, (iz) view, i3));
    }

    public final boolean D0() {
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i3 >= rr0VarArr.length) {
                return false;
            }
            rr0 rr0Var = rr0VarArr[i3];
            if (rr0Var != null) {
                cq0 cq0Var = rr0Var.h;
                if (cq0Var != null && cq0Var.c0()) {
                    return true;
                }
                qr0 qr0Var = rr0VarArr[i3].n;
                if (qr0Var != null && qr0Var.c0()) {
                    return true;
                }
            }
            i3++;
        }
    }

    public final void D1(rr0 rr0Var, boolean z10) {
        boolean z11 = rr0Var.b && this.d;
        yi0 fastScroll = rr0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = rr0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            rr0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<yi0, Float>) property, fastScroll.getAlpha(), 1.0f);
            rr0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<yi0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new s9(fastScroll));
        rr0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public final void E(boolean z10) {
        fh0 fh0Var = this.v0;
        if (fh0Var == null || this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z10 || fh0Var.getAnimatedDrawable().b0 >= 20) {
            fh0Var.getAnimatedDrawable().P(this.Z1 ? 50 : 100);
        } else {
            fh0Var.getAnimatedDrawable().P(0);
        }
        fh0Var.getAnimatedDrawable().start();
    }

    public final boolean E0(int i3) {
        return i3 == 7 ? this.G1.X() : (F0() || i3 == 0 || z0(i3) || i3 == 2 || i3 == 5 || i3 == 6 || i3 == 11 || i3 == 10 || i3 == 13 || i3 == 14 || i3 == 15) ? false : true;
    }

    public final void E1() {
        org.telegram.ui.ActionBar.q0 q0Var = this.w0;
        if (q0Var == null) {
            return;
        }
        boolean z10 = this.y1.getMessagesController().A2(this.m1) || u0();
        q0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && q0Var.getBackground() != null) {
            q0Var.setBackground(null);
            return;
        }
        if (z10 || q0Var.getBackground() != null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(s0(i3), 5, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        q0Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(q0Var, h02, null, N, this.I1);
    }

    public final void F(int i3) {
        int i10;
        rr0 g02 = g0(this.s1);
        this.s = -1;
        if (g02 != null) {
            g02.h.C0();
            this.t1 = i3;
            g02.n.setVisibility(0);
            if (z0(this.s1)) {
                g02.n.setAdapter(y1(this.s1));
            } else {
                g02.n.setAdapter(this.L);
            }
            qr0 qr0Var = g02.n;
            int paddingLeft = qr0Var.getPaddingLeft();
            qr0 qr0Var2 = g02.n;
            int j02 = j0(g02.F);
            qr0Var2.h3 = j02;
            int paddingRight = g02.n.getPaddingRight();
            qr0 qr0Var3 = g02.n;
            int i02 = i0(H0());
            qr0Var3.i3 = i02;
            qr0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.r.y1(i3);
            g02.n.a0();
            int i11 = 0;
            while (true) {
                rr0[] rr0VarArr = this.n0;
                if (i11 >= rr0VarArr.length) {
                    break;
                }
                rr0 rr0Var = rr0VarArr[i11];
                if (rr0Var != null && ((i10 = rr0Var.F) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.b4(rr0VarArr[i11].h);
                }
                i11++;
            }
            int i12 = 1;
            this.r1 = true;
            if (this.s1 == 0) {
                this.w1[0].g(true);
            }
            this.q1 = 0.0f;
            h1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new sq0(this, g02, i12));
            ofFloat.addListener(new ii.p2(this, z0(g02.F) ? 1 : 0, i3, 2));
            ofFloat.setInterpolator(xq.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public boolean F0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void F1() {
        vp0 vp0Var = this.b0;
        if (vp0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.d2;
            pr prVar = this.S0;
            vp0Var.setPaddingTop(L + (prVar != null ? (int) prVar.c(org.telegram.messenger.g0.L(7.0f)) : 0));
        }
    }

    public final void G() {
        int i3 = this.d2;
        int i10 = this.p2;
        n1((org.telegram.messenger.g0.L(6.666f) + i3) - w2, this.S0);
        int i11 = i3 + i10;
        n1(i11, this.L0);
        n1(i11, this.E0);
        n1(org.telegram.messenger.g0.L(52.0f) + i3 + i10, this.N0);
        n1(org.telegram.messenger.g0.L(4.0f) + i3 + i10, this.M0);
        n1(org.telegram.messenger.g0.L(48.0f) + i3 + i10, this.c0);
        if (this.l2 != i10) {
            this.l2 = i10;
            Runnable runnable = this.k2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean G0() {
        return false;
    }

    public final void G1(boolean z10) {
        vp0 vp0Var;
        yp0 yp0Var;
        R(true, true);
        fh0 fh0Var = this.v0;
        if (fh0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.Y0 && (((vp0Var = this.b0) == null || !vp0Var.g()) && ((yp0Var = this.c0) == null || !yp0Var.f))) {
            f10 = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        fh0Var.setAlpha(f10);
        if (z10) {
            E(k0(1.0f) > 0.5f);
        } else if (this.A0 == 2) {
            E(this.s0 > 0.1f);
        } else {
            E(this.r0 < 0.1f);
        }
    }

    public final boolean H() {
        boolean B0 = B0();
        long j10 = this.m1;
        org.telegram.ui.ActionBar.d2 d2Var = this.y1;
        if (B0) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).a2(Long.valueOf(j10));
            return a22 != null && a22.bot && a22.bot_can_edit;
        }
        if (H0()) {
            return true;
        }
        return d2Var != null && d2Var.getMessagesController().P1().h(j10);
    }

    public boolean H0() {
        return false;
    }

    public final void H1(rr0 rr0Var) {
        boolean b12 = rr0Var.h.b1();
        if (b12) {
            rr0Var.h.setSectionsDrawBackground(this.c2);
        }
        rr0Var.setDrawPageBackground((!this.c2 || b12 || rr0Var.F == 15) ? false : true);
        if (rr0Var.F != 15) {
            rr0Var.setClipToOutline(false);
            rr0Var.setBackground(null);
            rr0Var.setWallpaper(null);
            return;
        }
        Drawable drawable = rr0Var.P;
        if (drawable == null) {
            drawable = rr0Var.getBackground();
        }
        Drawable e10 = gi.y5.e(drawable, this.y1.getCurrentAccount(), this.m1, org.telegram.ui.ActionBar.k6.I.q());
        if (this.c2) {
            rr0Var.setBackground(null);
            rr0Var.setClipToOutline(false);
            rr0Var.setWallpaper(e10);
        } else {
            rr0Var.setWallpaper(null);
            rr0Var.setBackground(e10);
            rr0Var.setOutlineProvider(new cg.p0(18));
            rr0Var.setClipToOutline(true);
        }
    }

    public boolean I() {
        return !(this instanceof k20);
    }

    public final void I1(rr0 rr0Var) {
        int i3 = rr0Var.F;
        boolean z10 = i3 == 0 || z0(i3);
        FrameLayout.LayoutParams d = b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, z10 ? 0.0f : 12.0f, (z10 ? 8 : 12) + 48, z10 ? 0.0f : 12.0f, z10 ? 0.0f : 12.0f);
        d.topMargin = n0(rr0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = rr0Var.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        rr0Var.s.setLayoutParams(d);
    }

    public final boolean J() {
        rr0 rr0Var;
        rr0[] rr0VarArr = this.n0;
        if (rr0VarArr != null && (rr0Var = rr0VarArr[0]) != null) {
            boolean z02 = z0(rr0Var.F);
            int i3 = this.p1[z02 ? 1 : 0];
            if (i3 != h0(z02 ? 1 : 0, i3, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J0() {
        if (H() && ((getClosestTab() == 8 || getClosestTab() == 13 || I0(getClosestTab())) && this.F1)) {
            return false;
        }
        vp0 vp0Var = this.b0;
        if (vp0Var != null && vp0Var.g()) {
            return false;
        }
        yp0 yp0Var = this.c0;
        return ((yp0Var != null && yp0Var.f) || this.r1 || this.j1) ? false : true;
    }

    public final void J1(boolean z10) {
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i3 >= rr0VarArr.length) {
                return;
            }
            int childCount = rr0VarArr[i3].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = rr0VarArr[i3].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ((org.telegram.ui.Cells.h2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) childAt).c0(false, z10);
                }
            }
            i3++;
        }
    }

    public final boolean K() {
        rr0 rr0Var;
        rr0[] rr0VarArr = this.n0;
        if (rr0VarArr == null || (rr0Var = rr0VarArr[0]) == null) {
            return false;
        }
        if (this.n1 && z0(rr0Var.F)) {
            return false;
        }
        boolean z02 = z0(rr0VarArr[0].F);
        int i3 = this.p1[z02 ? 1 : 0];
        return i3 != h0(z02 ? 1 : 0, i3, false);
    }

    public final void K0(int i3, int i10, int i11, boolean z10) {
        ls0[] ls0VarArr = this.w1;
        ls0VarArr[i3].a.clear();
        ls0VarArr[i3].b[0].clear();
        ls0VarArr[i3].b[1].clear();
        ls0 ls0Var = ls0VarArr[i3];
        ls0Var.j[0] = i10;
        ls0Var.i[0] = false;
        ls0Var.l = false;
        ls0Var.m = i11;
        ls0Var.n = (ls0Var.e() - i11) - 1;
        ls0 ls0Var2 = ls0VarArr[i3];
        if (ls0Var2.n < 0) {
            ls0Var2.n = 0;
        }
        ls0Var2.k = i10;
        ls0Var2.o = true;
        ls0Var2.g = false;
        ls0Var2.p++;
        rr0 g02 = g0(i3);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (!z10) {
            return;
        }
        int i12 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i12 >= rr0VarArr.length) {
                return;
            }
            rr0 rr0Var = rr0VarArr[i12];
            if (rr0Var.F == i3) {
                rr0Var.x.h1(Math.min(ls0VarArr[i3].e() - 1, ls0VarArr[i3].m), 0);
            }
            i12++;
        }
    }

    public final void K1(float f10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.p0;
        if (q0Var == null) {
            return;
        }
        rr0[] rr0VarArr = this.n0;
        rr0 rr0Var = rr0VarArr[1];
        float f11 = 0.0f;
        if (rr0Var != null && rr0Var.F == 11) {
            f11 = 0.0f + f10;
        }
        rr0 rr0Var2 = rr0VarArr[0];
        if (rr0Var2 != null && rr0Var2.F == 11) {
            f11 += 1.0f - f10;
        }
        q0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        q0Var.setScaleX(f12);
        q0Var.setScaleY(f12);
        q0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        tp0 tp0Var;
        er0 er0Var;
        vp0 vp0Var;
        rr0[] rr0VarArr = this.n0;
        int length = rr0VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            rr0 rr0Var = rr0VarArr[i3];
            if (rr0Var != null && rr0Var.getVisibility() == 0) {
                if (rr0Var.P != null) {
                    RectF rectF2 = this.j2;
                    if (kh.k.c(rr0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        rr0Var.g(canvas);
                        canvas.restore();
                    }
                }
                if (rr0Var.F == 14 && (vp0Var = this.b0) != null && vp0Var.getParent() == rr0Var) {
                    for (View view : vp0Var.h.getViewPages()) {
                        if ((view instanceof ai.o4) && view.getVisibility() == 0) {
                            ai.h4 h4Var = ((ai.o4) view).f;
                            jh.d.a(h4Var, canvas, rectF, h4Var, viewGroup);
                        }
                    }
                } else {
                    tj0 currentListView = (rr0Var.F == 12 && (er0Var = this.W) != null && er0Var.getParent() == rr0Var) ? er0Var.a.A0 : (rr0Var.F == 13 && (tp0Var = this.a0) != null && tp0Var.getParent() == rr0Var) ? tp0Var.getCurrentListView() : rr0Var.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        jh.d.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(boolean z10) {
        long j10 = this.G;
        if (j10 != 0 || F0()) {
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            int i10 = t2[i3];
            ls0[] ls0VarArr = this.w1;
            if (ls0VarArr[i10].h && !z10) {
                return;
            }
            long j11 = this.m1;
            if (org.telegram.messenger.m5.C(j11)) {
                return;
            }
            ls0VarArr[i10].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i10 == 0) {
                int i11 = ls0VarArr[i10].q;
                if (i11 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i11 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i10 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i10 == 2) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_getSearchResultsPositions.limit = 100;
            org.telegram.ui.ActionBar.d2 d2Var = this.y1;
            tL_messages_getSearchResultsPositions.peer = d2Var.getMessagesController().j1(j11);
            if (j10 != 0 && d2Var.getUserConfig().e() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = d2Var.getMessagesController().j1(j10);
            }
            ConnectionsManager.getInstance(d2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(d2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.zd(this, ls0VarArr[i10].p, i10, 2)), d2Var.getClassGuid());
        }
    }

    public final void L1() {
        org.telegram.ui.ActionBar.q0 q0Var = this.p0;
        if (q0Var == null) {
            return;
        }
        rr0 rr0Var = this.n0[1];
        boolean z10 = rr0Var != null && rr0Var.F == 11;
        if (z10) {
            q0Var.setVisibility(0);
        }
        q0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new ci.e1(29, this, z10)).setDuration(420L).setInterpolator(xq.h).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        ws0 ws0Var;
        ArrayList arrayList;
        int i3;
        int i10;
        Bitmap bitmap;
        rr0 g02 = g0(0);
        if (g02 != null && g02.getMeasuredHeight() > 0 && g02.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(g02.getMeasuredWidth(), g02.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.L1 = true;
                g02.h.draw(new Canvas(bitmap2));
                View view = new View(g02.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                g02.addView(view);
                ws0Var = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new kg.g0((FrameLayout) ws0Var, view, (View) g02, (Object) bitmap2, 3)).start();
                g02.h.setAlpha(0.0f);
                g02.h.animate().alpha(1.0f).setUpdateListener(new y50(g02, 20)).setDuration(200L).start();
                os0 os0Var = ws0Var.x1;
                int[] iArr = os0Var.c;
                arrayList = os0Var.n[0].a;
                ls0[] ls0VarArr = ws0Var.w1;
                ls0 ls0Var = ls0VarArr[0];
                int[] iArr2 = ls0Var.f;
                iArr2[1] = 0;
                i3 = ls0Var.q;
                if (i3 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i3 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                ls0Var.h = false;
                long j10 = ws0Var.m1;
                K0(0, !org.telegram.messenger.m5.C(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                L0(false);
                ws0Var.G1.V();
                boolean C = org.telegram.messenger.m5.C(j10);
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i10);
                    ls0 ls0Var2 = ls0VarArr[0];
                    int i11 = ls0Var2.q;
                    if (i11 == 0) {
                        ls0Var2.a(ziVar, 0, false, C);
                    } else if (i11 == 1) {
                        if (org.telegram.messenger.zi.T3(ziVar.k)) {
                            ls0VarArr[0].a(ziVar, 0, false, C);
                        }
                    } else if (!org.telegram.messenger.zi.T3(ziVar.k)) {
                        ls0VarArr[0].a(ziVar, 0, false, C);
                    }
                }
            }
        }
        ws0Var = this;
        os0 os0Var2 = ws0Var.x1;
        int[] iArr3 = os0Var2.c;
        arrayList = os0Var2.n[0].a;
        ls0[] ls0VarArr2 = ws0Var.w1;
        ls0 ls0Var3 = ls0VarArr2[0];
        int[] iArr22 = ls0Var3.f;
        iArr22[1] = 0;
        i3 = ls0Var3.q;
        if (i3 != 0) {
        }
        ls0Var3.h = false;
        long j102 = ws0Var.m1;
        K0(0, !org.telegram.messenger.m5.C(j102) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        L0(false);
        ws0Var.G1.V();
        boolean C2 = org.telegram.messenger.m5.C(j102);
        while (i10 < arrayList.size()) {
        }
    }

    public final void M0(int i3) {
        int i10;
        int i11 = 2;
        ls0[] ls0VarArr = this.w1;
        if (i3 == 0) {
            int i12 = ls0VarArr[0].q;
            if (i12 == 1) {
                i11 = 6;
            } else if (i12 == 2) {
                i11 = 7;
            } else {
                i10 = 0;
            }
            i10 = i11;
        } else if (i3 == 1) {
            i10 = 1;
        } else {
            if (i3 != 2) {
                i11 = 4;
                if (i3 != 4) {
                    i11 = 5;
                    if (i3 != 5) {
                        i11 = 3;
                    }
                }
            }
            i10 = i11;
        }
        ls0VarArr[i3].g = true;
        org.telegram.ui.ActionBar.d2 d2Var = this.y1;
        d2Var.getMediaDataController().N0(this.m1, 50, 0, ls0VarArr[i3].k, i10, this.G, 1, d2Var.getClassGuid(), ls0VarArr[i3].p, null, null);
    }

    public final void M1() {
        boolean z10;
        ei.r6 r6Var;
        boolean B0 = B0();
        org.telegram.ui.ActionBar.q0 q0Var = this.z0;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.y0;
        if (B0) {
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            if (q0Var != null) {
                q0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            if (q0Var != null) {
                q0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (I0(getClosestTab())) {
                if (q0Var2 != null) {
                    q0Var2.setVisibility(8);
                }
                if (q0Var != null) {
                    q0Var.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.c1;
            if (i3 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[0].valueAt(i3);
            gr0 gr0Var = this.f0;
            if (gr0Var != null && (r6Var = gr0Var.s) != null && !r6Var.m(ziVar.f1())) {
                z10 = true;
                break;
            }
            i3++;
        }
        if (q0Var2 != null) {
            q0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (q0Var != null) {
            q0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void N() {
        tq0 tq0Var = this.L0;
        if (tq0Var.d(tq0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = tq0Var.getFirstTabId();
        tq0Var.setInitialTabId(firstTabId);
        this.n0[0].F = firstTabId;
        z1(false);
    }

    public int N0() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f2, code lost:
    
        if ((r9[8] <= 0) == r8.d(15)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f4, code lost:
    
        r6 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01f7, code lost:
    
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0209, code lost:
    
        if ((r9[4] <= 0) == r8.d(4)) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N1(boolean z10) {
        int i3;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i10;
        boolean H0;
        boolean z11;
        boolean z12;
        boolean z13;
        int selectedTab;
        int[] iArr;
        boolean z14;
        boolean z15;
        boolean z16;
        String str;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        jr0 jr0Var;
        int i11;
        boolean z17;
        int i12;
        int size;
        int i13;
        Boolean bool;
        String M0;
        String str2;
        String M02;
        String str3;
        String str4;
        String str5;
        String str6;
        vp0 vp0Var;
        char c2;
        int i14;
        int i15;
        ArrayList arrayList;
        int i16;
        Object obj;
        boolean z18;
        int i17;
        int i18;
        boolean z19;
        int i19;
        int i20;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        os0 os0Var;
        tq0 tq0Var = this.L0;
        if (tq0Var == null) {
            return;
        }
        boolean z20 = !this.G1.t() ? false : z10;
        boolean z21 = (this.W == null || (os0Var = this.x1) == null || !os0Var.f) ? false : true;
        long j10 = this.m1;
        int i21 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.d2 d2Var = this.y1;
        if (i21 <= 0 || d2Var == null) {
            i3 = 1;
            user = null;
        } else {
            i3 = 1;
            user = d2Var.getMessagesController().a2(Long.valueOf(j10));
        }
        boolean z22 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i3 : false;
        int i22 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.h1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z22) ? 0 : i3;
        int i23 = ((org.telegram.messenger.m5.E(j10) || org.telegram.messenger.m5.z(j10)) && !org.telegram.messenger.m5.C(j10) && (((userFull = this.h1) != null && userFull.stories_pinned_available) || (((chatFull = this.g1) != null && chatFull.stories_pinned_available) || H0())) && y0()) ? i3 : 0;
        vp0 vp0Var2 = this.b0;
        int i24 = i22;
        boolean z23 = (vp0Var2 == null || (((userFull3 = this.h1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.g1) == null || chatFull3.stargifts_count <= 0))) ? false : i3;
        int i25 = i23;
        TLRPC.ChatFull chatFull4 = this.g1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.h1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z20;
                int i26 = this.U1 == tq0Var.o0 ? i3 : 0;
                boolean z25 = (i25 == 0 || i24 != 0) ? i3 : false;
                int i27 = i26;
                i10 = z25 == tq0Var.d(8) ? i27 + 1 : i27;
                if (z22 != tq0Var.d(13)) {
                    i10++;
                }
                if (F0() != tq0Var.d(8)) {
                    i10++;
                }
                if (z23 == tq0Var.d(14) || (vp0Var2 != null && z23 && this.T1 != vp0Var2.getLastEmojisHash())) {
                    i10++;
                }
                H0 = H0();
                int i28 = 14;
                jr0 jr0Var2 = this.d0;
                int[] iArr2 = this.a1;
                if (H0) {
                    z11 = z23;
                    int i29 = i10;
                    int i30 = (jr0Var2.d == null ? i3 : false) == tq0Var.d(7) ? i29 + 1 : i29;
                    if (iArr2[0] <= 0) {
                        z18 = i3;
                        i17 = 0;
                    } else {
                        z18 = false;
                        i17 = 0;
                    }
                    int i31 = i30;
                    int i32 = z18 == tq0Var.d(i17) ? i31 + 1 : i31;
                    if (iArr2[i3] <= 0) {
                        z19 = i3;
                        i18 = z19;
                    } else {
                        i18 = i3;
                        z19 = false;
                    }
                    int i33 = i32;
                    int i34 = z19 == tq0Var.d(i18) ? i33 + 1 : i33;
                    if (org.telegram.messenger.m5.C(j10)) {
                        i19 = i34;
                    } else {
                        int i35 = i34;
                        int i36 = (iArr2[3] <= 0) == tq0Var.d(3) ? i35 + 1 : i35;
                        i19 = (iArr2[4] <= 0) == tq0Var.d(4) ? i36 + 1 : i36;
                    }
                    int i37 = i20;
                    int i38 = (iArr2[2] <= 0) == tq0Var.d(2) ? i37 + 1 : i37;
                    int i39 = (iArr2[5] <= 0) == tq0Var.d(5) ? i38 + 1 : i38;
                    int i40 = (iArr2[6] <= 0) == tq0Var.d(6) ? i39 + 1 : i39;
                    boolean z26 = !this.T.d.isEmpty();
                    int i41 = i40;
                    i10 = z26 != tq0Var.d(10) ? i41 + 1 : i41;
                    z12 = x0() && !d2Var.getMessagesController().G1().b && d2Var.getMessagesController().G1().e();
                    z13 = z26;
                    if (z12 != tq0Var.d(11)) {
                        i10++;
                    }
                    if (z21 != tq0Var.d(12)) {
                        i10++;
                    }
                } else {
                    z11 = z23;
                    z12 = false;
                    z13 = false;
                }
                if (i10 > 0) {
                    if (z24) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        iArr = iArr2;
                        transitionSet.addTransition(new org.telegram.ui.ActionBar.h0(2));
                        z14 = z21;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(tq0Var.getTabsContainer(), transitionSet);
                        tq0Var.V = tq0Var.w;
                        tq0Var.W = tq0Var.x;
                    } else {
                        iArr = iArr2;
                        z14 = z21;
                    }
                    SparseArray f10 = tq0Var.f();
                    if (i10 > 3) {
                        f10 = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (F0()) {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                        arrayList2.add(new Pair(8, org.telegram.messenger.bd.M0(2131746643, null)));
                        tq0Var.c0 = 420L;
                    } else {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                    }
                    if (i24 != 0) {
                        arrayList2.add(new Pair(8, org.telegram.messenger.bd.M0(2131746700, str)));
                    } else if ((org.telegram.messenger.m5.E(j10) || org.telegram.messenger.m5.z(j10)) && !org.telegram.messenger.m5.C(j10) && ((((userFull2 = this.h1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.g1) != null && chatFull2.stories_pinned_available) || H0())) && y0())) {
                        if (A0()) {
                            arrayList2.add(new Pair(9, org.telegram.messenger.bd.M0(2131746733, null)));
                            jr0Var = jr0Var2;
                            tq0Var.c0 = 420L;
                        } else {
                            jr0Var = jr0Var2;
                            arrayList2.add(new Pair(8, org.telegram.messenger.bd.M0(2131746643, null)));
                            if (H0()) {
                                arrayList2.add(new Pair(9, org.telegram.messenger.bd.M0(2131746733, null)));
                            }
                        }
                        if (z11) {
                            i11 = i21;
                            z17 = z14;
                        } else {
                            String M03 = org.telegram.messenger.bd.M0(2131746684, null);
                            HashMap hashMap = ai.u4.V;
                            ci.v8 v8Var = vp0Var2.d;
                            Object obj2 = "";
                            if (v8Var == null) {
                                vp0Var = vp0Var2;
                                str6 = M03;
                                i11 = i21;
                                z17 = z14;
                            } else {
                                ArrayList arrayList3 = v8Var.l;
                                str6 = M03;
                                i11 = i21;
                                z17 = z14;
                                Pair pair = new Pair(Integer.valueOf(org.telegram.messenger.h10.t0), Long.valueOf(vp0Var2.c));
                                if (arrayList3.isEmpty()) {
                                    if (v8Var.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
                                        obj2 = obj;
                                    }
                                    vp0Var = vp0Var2;
                                } else {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList4 = new ArrayList();
                                    int i42 = 0;
                                    while (true) {
                                        vp0Var = vp0Var2;
                                        if (arrayList4.size() >= 3 || i42 >= arrayList3.size()) {
                                            break;
                                        }
                                        TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList3.get(i42)).gift.getDocument();
                                        if (document == null) {
                                            i16 = i42;
                                        } else {
                                            i16 = i42;
                                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                                hashSet.add(Long.valueOf(document.id));
                                                arrayList4.add(document);
                                            }
                                        }
                                        i42 = i16 + 1;
                                        vp0Var2 = vp0Var;
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                        int i43 = 0;
                                        while (i43 < arrayList4.size()) {
                                            TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i43);
                                            String str7 = "😀";
                                            if (document2 == null) {
                                                i15 = i43;
                                                arrayList = arrayList4;
                                            } else {
                                                i15 = i43;
                                                arrayList = arrayList4;
                                                TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeCustomEmoji.class, document2.attributes);
                                                if (tL_documentAttributeCustomEmoji == null || TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt)) {
                                                    TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = (TLRPC.TL_documentAttributeSticker) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeSticker.class, document2.attributes);
                                                    if (tL_documentAttributeSticker != null && !TextUtils.isEmpty(tL_documentAttributeSticker.alt)) {
                                                        str7 = tL_documentAttributeSticker.alt;
                                                    }
                                                } else {
                                                    str7 = tL_documentAttributeCustomEmoji.alt;
                                                }
                                            }
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                                            spannableStringBuilder2.setSpan(new p5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                            i43 = i15 + 1;
                                            arrayList4 = arrayList;
                                        }
                                        c2 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj2 = spannableStringBuilder;
                                        i14 = 2;
                                        CharSequence[] charSequenceArr = new CharSequence[i14];
                                        charSequenceArr[c2] = str6;
                                        charSequenceArr[1] = obj2;
                                        arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                        this.T1 = vp0Var.getLastEmojisHash();
                                    }
                                }
                            }
                            i14 = 2;
                            c2 = 0;
                            CharSequence[] charSequenceArr2 = new CharSequence[i14];
                            charSequenceArr2[c2] = str6;
                            charSequenceArr2[1] = obj2;
                            arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                            this.T1 = vp0Var.getLastEmojisHash();
                        }
                        if (z15) {
                            arrayList2.add(new Pair(13, org.telegram.messenger.bd.M0(2131746700, null)));
                        }
                        int i44 = 2131745412;
                        if (!H0()) {
                            if (z16) {
                                str3 = null;
                                arrayList2.add(new Pair(11, org.telegram.messenger.bd.M0(2131745917, null)));
                            } else {
                                str3 = null;
                            }
                            jr0 jr0Var3 = jr0Var;
                            if (jr0Var3.d != null) {
                                arrayList2.add(new Pair(7, org.telegram.messenger.bd.M0(2131749437, str3)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && jr0Var3.d == null) {
                                    arrayList2.add(new Pair(0, org.telegram.messenger.bd.M0(2131745416, null)));
                                } else {
                                    str4 = null;
                                    arrayList2.add(new Pair(0, org.telegram.messenger.bd.M0(2131745417, null)));
                                    if (z17) {
                                        arrayList2.add(new Pair(12, org.telegram.messenger.bd.M0(2131745903, str4)));
                                        org.telegram.messenger.hp.e1().edit().putInt("savedhint", 3).apply();
                                    }
                                    if (iArr[1] <= 0) {
                                        str5 = null;
                                        arrayList2.add(new Pair(1, org.telegram.messenger.bd.M0(2131745424, null)));
                                    } else {
                                        str5 = null;
                                    }
                                    if (org.telegram.messenger.m5.C(j10)) {
                                        if (iArr[3] > 0) {
                                            arrayList2.add(new Pair(3, org.telegram.messenger.bd.M0(2131745420, str5)));
                                        }
                                        if (iArr[4] > 0) {
                                            arrayList2.add(new Pair(4, org.telegram.messenger.bd.M0(2131745415, str5)));
                                        }
                                        if (iArr[8] > 0) {
                                            arrayList2.add(new Pair(15, org.telegram.messenger.bd.M0(2131745413, str5)));
                                        }
                                    } else if (iArr[4] > 0) {
                                        arrayList2.add(new Pair(4, org.telegram.messenger.bd.M0(2131745415, str5)));
                                    }
                                    if (iArr[2] > 0) {
                                        arrayList2.add(new Pair(2, org.telegram.messenger.bd.M0(2131745412, str5)));
                                    }
                                    if (iArr[5] > 0) {
                                        arrayList2.add(new Pair(5, org.telegram.messenger.bd.M0(2131745423, str5)));
                                    }
                                    if (iArr[6] > 0) {
                                        arrayList2.add(new Pair(6, org.telegram.messenger.bd.M0(2131745422, str5)));
                                    }
                                    if (z13) {
                                        arrayList2.add(new Pair(10, org.telegram.messenger.bd.M0(i11 > 0 ? 2131745328 : 2131745324, null)));
                                    }
                                }
                            }
                            str4 = null;
                            if (z17) {
                            }
                            if (iArr[1] <= 0) {
                            }
                            if (org.telegram.messenger.m5.C(j10)) {
                            }
                            if (iArr[2] > 0) {
                            }
                            if (iArr[5] > 0) {
                            }
                            if (iArr[6] > 0) {
                            }
                            if (z13) {
                            }
                        }
                        if (tq0Var.o0) {
                            boolean C0 = C0();
                            int i45 = 0;
                            while (i45 < 15) {
                                if (o0(i45, C0) != null) {
                                    Integer valueOf = Integer.valueOf(i45);
                                    int i46 = 0;
                                    while (true) {
                                        if (i46 >= arrayList2.size()) {
                                            bool = Boolean.FALSE;
                                            break;
                                        } else {
                                            if (((Pair) arrayList2.get(i46)).first == valueOf) {
                                                bool = Boolean.TRUE;
                                                break;
                                            }
                                            i46++;
                                        }
                                    }
                                    if (!bool.booleanValue()) {
                                        Integer valueOf2 = Integer.valueOf(i45);
                                        if (i45 == 0) {
                                            M0 = org.telegram.messenger.bd.M0(2131745416, null);
                                        } else if (i45 == 1) {
                                            M0 = org.telegram.messenger.bd.M0(2131745424, null);
                                        } else if (i45 == 2) {
                                            M0 = org.telegram.messenger.bd.M0(i44, null);
                                        } else if (i45 == 3) {
                                            M0 = org.telegram.messenger.bd.M0(2131745420, null);
                                        } else if (i45 == 4) {
                                            M0 = org.telegram.messenger.bd.M0(2131745415, null);
                                        } else if (i45 != 5) {
                                            if (i45 == 8) {
                                                M02 = org.telegram.messenger.bd.M0(2131746643, null);
                                            } else if (i45 != i28) {
                                                str2 = null;
                                                arrayList2.add(new Pair(valueOf2, str2));
                                                i45++;
                                                i44 = 2131745412;
                                                i28 = 14;
                                            } else {
                                                M02 = org.telegram.messenger.bd.M0(2131746684, null);
                                            }
                                            str2 = M02;
                                            arrayList2.add(new Pair(valueOf2, str2));
                                            i45++;
                                            i44 = 2131745412;
                                            i28 = 14;
                                        } else {
                                            M0 = org.telegram.messenger.bd.M0(2131745423, null);
                                        }
                                        str2 = M0;
                                        arrayList2.add(new Pair(valueOf2, str2));
                                        i45++;
                                        i44 = 2131745412;
                                        i28 = 14;
                                    }
                                }
                                i45++;
                                i44 = 2131745412;
                                i28 = 14;
                            }
                        }
                        if (profileTab != null) {
                            int p02 = p0(profileTab);
                            int i47 = 0;
                            while (true) {
                                if (i47 >= arrayList2.size()) {
                                    i47 = -1;
                                    break;
                                } else if (((Integer) ((Pair) arrayList2.get(i47)).first).intValue() == p02) {
                                    break;
                                } else {
                                    i47++;
                                }
                            }
                            if (i47 >= 0) {
                                i12 = 0;
                                arrayList2.add(0, (Pair) arrayList2.remove(i47));
                                if (!arrayList2.isEmpty()) {
                                    this.V1 = ((Integer) ((Pair) arrayList2.get(i12)).first).intValue();
                                }
                                size = arrayList2.size();
                                i13 = 0;
                                while (i13 < size) {
                                    Object obj3 = arrayList2.get(i13);
                                    i13++;
                                    Pair pair2 = (Pair) obj3;
                                    if (!tq0Var.d(((Integer) pair2.first).intValue())) {
                                        tq0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, f10);
                                    }
                                }
                            }
                        }
                        i12 = 0;
                        if (!arrayList2.isEmpty()) {
                        }
                        size = arrayList2.size();
                        i13 = 0;
                        while (i13 < size) {
                        }
                    }
                    jr0Var = jr0Var2;
                    if (z11) {
                    }
                    if (z15) {
                    }
                    int i442 = 2131745412;
                    if (!H0()) {
                    }
                    if (tq0Var.o0) {
                    }
                    if (profileTab != null) {
                    }
                    i12 = 0;
                    if (!arrayList2.isEmpty()) {
                    }
                    size = arrayList2.size();
                    i13 = 0;
                    while (i13 < size) {
                    }
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                    this.n0[0].F = selectedTab;
                }
                this.U1 = tq0Var.o0;
                tq0Var.c();
                W0();
                S();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z20;
        if (this.U1 == tq0Var.o0) {
        }
        if (i25 == 0) {
        }
        int i272 = i26;
        if (z25 == tq0Var.d(8)) {
        }
        if (z22 != tq0Var.d(13)) {
        }
        if (F0() != tq0Var.d(8)) {
        }
        if (z23 == tq0Var.d(14)) {
        }
        i10++;
        H0 = H0();
        int i282 = 14;
        jr0 jr0Var22 = this.d0;
        int[] iArr22 = this.a1;
        if (H0) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.U1 = tq0Var.o0;
        tq0Var.c();
        W0();
        S();
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(rr0 rr0Var, tj0 tj0Var, u4.b0 b0Var) {
        int i3;
        int i10;
        boolean[] zArr;
        u4.d1 K;
        ei.r6 r6Var;
        if (this.r1 || this.N1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (tj0Var.getFastScroll() == null || !tj0Var.getFastScroll().n || currentTimeMillis - rr0Var.a >= 300) {
            rr0Var.a = currentTimeMillis;
            if (this.Y0 && this.X0 && rr0Var.F != 11) {
                return;
            }
            int i11 = 7;
            if (rr0Var.F == 7) {
                return;
            }
            int L0 = b0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(b0Var.N0() - L0) + 1;
            int b10 = tj0Var.getAdapter() == null ? 0 : tj0Var.getAdapter().b();
            int i12 = rr0Var.F;
            int[] iArr = this.p1;
            ls0[] ls0VarArr = this.w1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                b10 = ls0VarArr[i12].d() + ls0VarArr[i12].a.size();
                ls0 ls0Var = ls0VarArr[i12];
                if (ls0Var.h && ls0Var.e.size() > 2 && rr0Var.F == 0 && ls0VarArr[i12].a.size() != 0) {
                    float f10 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((tj0Var.getMeasuredHeight() / (tj0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((wr0) ls0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((wr0) ls0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > b10 && L0 - b10 > measuredHeight) || ((i3 = L0 + abs) < ls0VarArr[i12].m && ls0VarArr[0].m - i3 > measuredHeight)) {
                        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(this, i12, tj0Var, 17);
                        this.N1 = f4Var;
                        org.telegram.messenger.g0.h3(f4Var);
                        return;
                    }
                }
            }
            int i13 = rr0Var.F;
            if (i13 == 7) {
                return;
            }
            if (z0(i13)) {
                ts0 x12 = x1(rr0Var.F);
                if (x12 == null || (r6Var = x12.s) == null || L0 + abs <= r6Var.i() - iArr[1]) {
                    return;
                }
                x12.P();
                return;
            }
            int i14 = rr0Var.F;
            if (i14 == 6) {
                if (abs > 0) {
                    kr0 kr0Var = this.S;
                    boolean z10 = kr0Var.h;
                    ArrayList arrayList = kr0Var.d;
                    if (z10 || kr0Var.e || arrayList.isEmpty() || L0 + abs < b10 - 5) {
                        return;
                    }
                    kr0.E(kr0Var, ((TLRPC.Chat) k2.p1.h(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = this.y1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < rr0Var.h.getChildCount(); i16++) {
                    View childAt = rr0Var.h.getChildAt(i16);
                    rr0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                u4.h0 adapter = rr0Var.h.getAdapter();
                is0 is0Var = this.V;
                if (adapter != is0Var) {
                    if (i15 + 1 >= d2Var.getMessagesController().G1().i.size()) {
                        d2Var.getMessagesController().G1().g(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < is0Var.h.size() + is0Var.e.size() || is0Var.s || is0Var.r) {
                        return;
                    }
                    is0Var.r = true;
                    is0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > b10 - i17 || ls0VarArr[i18].o) {
                ls0 ls0Var2 = ls0VarArr[i18];
                if (!ls0Var2.g) {
                    if (i14 == 0) {
                        int i19 = ls0VarArr[0].q;
                        if (i19 == 1) {
                            i10 = 6;
                        } else {
                            if (i19 != 2) {
                                i10 = 0;
                            }
                            i10 = i11;
                        }
                        zArr = ls0Var2.i;
                        if (zArr[0]) {
                            ls0Var2.g = true;
                            d2Var.getMediaDataController().N0(this.m1, 50, ls0VarArr[i18].j[0], 0, i10, this.G, 1, d2Var.getClassGuid(), ls0VarArr[i18].p, null, null);
                        } else if (this.f1 != 0 && !zArr[1]) {
                            ls0Var2.g = true;
                            d2Var.getMediaDataController().N0(this.f1, 50, ls0VarArr[i18].j[1], 0, i10, this.G, 1, d2Var.getClassGuid(), ls0VarArr[i18].p, null, null);
                        }
                    } else {
                        if (i14 == 1) {
                            i10 = 1;
                        } else if (i14 == 2) {
                            i10 = 2;
                        } else {
                            i11 = 4;
                            if (i14 != 4) {
                                i10 = i14 == 5 ? 5 : i14 == 15 ? 8 : 3;
                            }
                            i10 = i11;
                        }
                        zArr = ls0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i20 = ls0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.K.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                ls0 ls0Var3 = ls0VarArr[i18];
                if (!ls0Var3.g && !ls0Var3.l && !ls0Var3.o) {
                    M0(rr0Var.F);
                }
            }
            rr0 rr0Var2 = this.n0[0];
            if (rr0Var2.h == tj0Var) {
                int i21 = rr0Var2.F;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = tj0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.o7;
                    org.telegram.ui.Cells.t0 t0Var = this.N0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.h2) {
                            t0Var.e0(((org.telegram.ui.Cells.h2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        org.telegram.messenger.zi ziVar = o7Var.e <= 0 ? null : o7Var.b[0];
                        if (ziVar != null) {
                            t0Var.e0(ziVar.k.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public final Boolean O1(View view, View view2) {
        if (this.r1) {
            return null;
        }
        rr0[] rr0VarArr = this.n0;
        rr0 rr0Var = rr0VarArr[0];
        if (rr0Var == null) {
            return null;
        }
        int i3 = rr0Var.F;
        this.s1 = i3;
        boolean z02 = z0(i3);
        int[] iArr = this.p1;
        int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], true);
        if (view != null && h02 == h0(z02 ? 1 : 0, h02, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[z02 ? 1 : 0] != h02) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!z02) {
                org.telegram.messenger.az.B(h02);
            } else if (m0(rr0VarArr[0].F) >= 5 || I0(rr0VarArr[0].F)) {
                org.telegram.messenger.az.F(h02);
            }
            F(h02);
        }
        return Boolean.valueOf(h02 != h0(z02 ? 1 : 0, h02, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean P(MotionEvent motionEvent) {
        tp0 tp0Var;
        rr0[] rr0VarArr = this.n0;
        int i3 = rr0VarArr[0].F;
        if (i3 == 13 && (tp0Var = this.a0) != null) {
            View currentView = tp0Var.n.getCurrentView();
            if (currentView instanceof fi.m) {
                fi.m mVar = (fi.m) currentView;
                fi.h hVar = mVar.w;
                fi.e eVar = mVar.f;
                if (mVar.a != null && mVar.getParent() != null) {
                    if (!mVar.b || mVar.L) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (mVar.M && !mVar.L && motionEvent.getPointerCount() == 2) {
                                mVar.Q = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                mVar.R = 1.0f;
                                mVar.O = motionEvent.getPointerId(0);
                                mVar.P = motionEvent.getPointerId(1);
                                eVar.I0(false);
                                eVar.cancelLongPress();
                                eVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) mVar.getParent();
                                mVar.V = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - mVar.getX());
                                int y9 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - mVar.getY());
                                int i10 = mVar.V;
                                Rect rect = mVar.W;
                                mVar.T = -1;
                                int top = y9 - eVar.getTop();
                                for (int i11 = 0; i11 < eVar.getChildCount(); i11++) {
                                    View childAt = eVar.getChildAt(i11);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i10, top)) {
                                        mVar.T = RecyclerView.S(childAt);
                                        mVar.U = childAt.getTop();
                                    }
                                }
                                mVar.N = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) mVar.getParent()).getY()) - mVar.getY() > 0.0f) {
                                    mVar.M = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (mVar.L || mVar.N)) {
                            int i12 = -1;
                            int i13 = -1;
                            for (int i14 = 0; i14 < motionEvent.getPointerCount(); i14++) {
                                if (mVar.O == motionEvent.getPointerId(i14)) {
                                    i12 = i14;
                                }
                                if (mVar.P == motionEvent.getPointerId(i14)) {
                                    i13 = i14;
                                }
                            }
                            if (i12 == -1 || i13 == -1) {
                                mVar.M = false;
                                mVar.N = false;
                                mVar.L = false;
                                mVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i13) - motionEvent.getX(i12), motionEvent.getY(i13) - motionEvent.getY(i12))) / mVar.Q;
                            mVar.R = hypot;
                            if (!mVar.L && (hypot > 1.01f || hypot < 0.99f)) {
                                mVar.L = true;
                                boolean z10 = hypot > 1.0f;
                                mVar.S = z10;
                                mVar.b(z10);
                            }
                            if (mVar.L) {
                                boolean z11 = mVar.S;
                                if ((!z11 || mVar.R >= 1.0f) && (z11 || mVar.R <= 1.0f)) {
                                    mVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.k5.y(2.0f, mVar.R, 1.0f, 1.0f) : (1.0f - mVar.R) / 0.5f));
                                } else {
                                    mVar.c = 0.0f;
                                }
                                float f10 = mVar.c;
                                if (f10 == 1.0f || f10 == 0.0f) {
                                    if (f10 == 1.0f) {
                                        int i15 = mVar.e;
                                        int ceil = (((int) Math.ceil(mVar.T / mVar.e)) * i15) + ((int) ((mVar.a0.H.C1 / (eVar.getMeasuredWidth() - ((int) (eVar.getMeasuredWidth() / mVar.e)))) * (i15 - 1)));
                                        if (ceil >= hVar.b()) {
                                            ceil = hVar.b() - 1;
                                        }
                                        mVar.T = ceil;
                                    }
                                    mVar.a();
                                    if (mVar.c == 0.0f) {
                                        mVar.S = !mVar.S;
                                    }
                                    mVar.b(mVar.S);
                                    mVar.Q = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                eVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((mVar.O == motionEvent.getPointerId(0) && mVar.P == motionEvent.getPointerId(1)) || (mVar.O == motionEvent.getPointerId(1) && mVar.P == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && mVar.L) {
                            mVar.N = false;
                            mVar.M = false;
                            mVar.L = false;
                            mVar.a();
                        }
                        return mVar.L;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i3 == 0 || z0(i3)) && getParent() != null) {
            if (!this.r1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        rr0VarArr[0].h.I0(false);
                        rr0VarArr[0].h.cancelLongPress();
                        rr0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - rr0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - rr0VarArr[0].getY());
                        int i16 = this.x;
                        this.s = -1;
                        int top2 = y10 - rr0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F == 1) {
                            top2 = 0;
                        }
                        for (int i17 = 0; i17 < rr0VarArr[0].h.getChildCount(); i17++) {
                            View childAt2 = rr0VarArr[0].h.getChildAt(i17);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i16, top2)) {
                                rr0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.G1.X() && this.s == -1) {
                            this.s = (int) (((this.p1[z0(rr0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i16 / rr0VarArr[0].h.getMeasuredWidth(), 0.0f))) + rr0VarArr[0].x.L0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - rr0VarArr[0].getY() > this.d2) {
                            this.b = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.a || this.c)) {
                    int i18 = -1;
                    int i19 = -1;
                    for (int i20 = 0; i20 < motionEvent.getPointerCount(); i20++) {
                        if (this.e == motionEvent.getPointerId(i20)) {
                            i18 = i20;
                        }
                        if (this.f == motionEvent.getPointerId(i20)) {
                            i19 = i20;
                        }
                    }
                    if (i18 == -1 || i19 == -1) {
                        this.b = false;
                        this.c = false;
                        this.a = false;
                        d0();
                        return false;
                    }
                    float hypot2 = ((float) Math.hypot(motionEvent.getX(i19) - motionEvent.getX(i18), motionEvent.getY(i19) - motionEvent.getY(i18))) / this.h;
                    this.n = hypot2;
                    if (!this.a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                        this.a = true;
                        boolean z12 = hypot2 > 1.0f;
                        this.r = z12;
                        r1(z12);
                    }
                    if (this.a) {
                        boolean z13 = this.r;
                        if ((!z13 || this.n >= 1.0f) && (z13 || this.n <= 1.0f)) {
                            this.q1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.k5.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.q1 = 0.0f;
                        }
                        float f11 = this.q1;
                        if (f11 == 1.0f || f11 == 0.0f) {
                            u4.h0 x12 = z0(this.s1) ? x1(this.s1) : this.K;
                            if (this.q1 == 1.0f) {
                                int i21 = this.t1;
                                int ceil2 = (((int) Math.ceil(this.s / this.t1)) * i21) + ((int) ((this.C1 / (rr0VarArr[0].h.getMeasuredWidth() - ((int) (rr0VarArr[0].h.getMeasuredWidth() / this.t1)))) * (i21 - 1)));
                                if (ceil2 >= x12.b()) {
                                    ceil2 = x12.b() - 1;
                                }
                                this.s = ceil2;
                            }
                            d0();
                            if (this.q1 == 0.0f) {
                                this.r = !this.r;
                            }
                            r1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        rr0VarArr[0].h.invalidate();
                        rr0 rr0Var = rr0VarArr[0];
                        if (rr0Var.G != null) {
                            rr0Var.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.a) {
                    this.c = false;
                    this.b = false;
                    this.a = false;
                    d0();
                }
                return this.a;
            }
            return true;
        }
        return false;
    }

    public final Boolean P1(View view, View view2) {
        if (this.r1) {
            return null;
        }
        rr0[] rr0VarArr = this.n0;
        rr0 rr0Var = rr0VarArr[0];
        if (rr0Var == null) {
            return null;
        }
        if (this.n1 && z0(rr0Var.F)) {
            return null;
        }
        int i3 = rr0VarArr[0].F;
        this.s1 = i3;
        boolean z02 = z0(i3);
        int[] iArr = this.p1;
        int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], false);
        if (view2 != null && h02 == h0(z02 ? 1 : 0, h02, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[z02 ? 1 : 0] != h02) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!z02) {
                org.telegram.messenger.az.B(h02);
            } else if (m0(rr0VarArr[0].F) >= 5 || I0(rr0VarArr[0].F)) {
                org.telegram.messenger.az.F(h02);
            }
            F(h02);
        }
        return Boolean.valueOf(h02 != h0(z02 ? 1 : 0, h02, false));
    }

    public final void Q() {
        R(false, false);
    }

    public final void Q0() {
        ei.r6 r6Var;
        ei.r6 r6Var2;
        this.K1.a();
        gr0 gr0Var = this.f0;
        if (gr0Var != null && (r6Var2 = gr0Var.s) != null && r6Var2 != null) {
            r6Var2.z(gr0Var.w);
        }
        rp0 rp0Var = this.h0;
        if (rp0Var != null && (r6Var = rp0Var.s) != null && r6Var != null) {
            r6Var.z(rp0Var.w);
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            us0 us0Var = ((vs0) it.next()).c;
            ei.r6 r6Var3 = us0Var.s;
            if (r6Var3 != null && r6Var3 != null) {
                r6Var3.z(us0Var.w);
            }
        }
    }

    public final void R(boolean z10, boolean z11) {
        if (this.I == null) {
            return;
        }
        int closestTab = getClosestTab();
        boolean z12 = false;
        org.telegram.ui.ActionBar.q0 q0Var = this.q0;
        if (q0Var != null) {
            ((org.telegram.ui.ActionBar.f5) q0Var).Y(this.q2 && I() && (E0(closestTab) || (closestTab == 11 && x0())), z10);
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.J;
        if (f5Var != null) {
            if (this.q2 && I() && !A0() && v0(closestTab)) {
                z12 = true;
            }
            f5Var.Y(z12, z11);
        }
    }

    public final void R0(int i3, View view, org.telegram.messenger.zi ziVar, int i10) {
        String str;
        if (ziVar == null || this.r1) {
            return;
        }
        yp0 yp0Var = this.c0;
        if (yp0Var == null || !yp0Var.f) {
            int i11 = 0;
            i11 = 0;
            String str2 = null;
            if (this.F1) {
                int i12 = 8;
                if (i10 == 8 && !H()) {
                    return;
                }
                char c2 = org.telegram.messenger.zi.B0(ziVar.k) == this.m1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.c1;
                if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                    sparseArrayArr[c2].remove(ziVar.f1());
                    if (!ziVar.s(null, false)) {
                        this.d1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c2].put(ziVar.f1(), ziVar);
                    if (!ziVar.s(null, false)) {
                        this.d1++;
                    }
                }
                O0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    o1(false);
                } else {
                    m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.o0.setVisibility(this.d1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.q0 q0Var = this.x0;
                    if (q0Var != null) {
                        q0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.w0;
                    if (q0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        q0Var2.setVisibility(i12);
                    }
                    M1();
                }
                this.e1 = false;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).b(sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) view).b(0, sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).f(sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).e(sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    ((org.telegram.ui.Cells.h2) view).c(sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) view).i(sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0, true);
                }
            } else {
                eq0 eq0Var = this.u1;
                ls0[] ls0VarArr = this.w1;
                org.telegram.ui.ActionBar.d2 d2Var = this.y1;
                if (i10 == 0) {
                    ls0 ls0Var = ls0VarArr[i10];
                    int i13 = i3 - ls0Var.m;
                    if (i13 >= 0 && i13 < ls0Var.a.size()) {
                        PhotoViewer.v1().N2(null, d2Var, null);
                        PhotoViewer.v1().e2(ls0VarArr[i10].a, i13, this.m1, this.f1, this.G, eq0Var);
                    }
                } else if (i10 == 2 || i10 == 4) {
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                    }
                } else if (i10 == 5) {
                    PhotoViewer.v1().N2(null, d2Var, null);
                    int indexOf = ls0VarArr[i10].a.indexOf(ziVar);
                    if (indexOf < 0) {
                        PhotoViewer.v1().e2(org.telegram.messenger.k5.k(ziVar), 0, 0L, 0L, 0L, eq0Var);
                    } else {
                        PhotoViewer.v1().e2(ls0VarArr[i10].a, indexOf, this.m1, this.f1, this.G, eq0Var);
                    }
                } else if (i10 == 1) {
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        TLRPC.Document F0 = ziVar.F0();
                        if (g7Var.H) {
                            if (ziVar.x()) {
                                PhotoViewer.v1().N2(null, d2Var, null);
                                int indexOf2 = ls0VarArr[i10].a.indexOf(ziVar);
                                if (indexOf2 < 0) {
                                    PhotoViewer.v1().e2(org.telegram.messenger.k5.k(ziVar), 0, 0L, 0L, 0L, eq0Var);
                                    return;
                                } else {
                                    PhotoViewer.v1().e2(ls0VarArr[i10].a, indexOf2, this.m1, this.f1, this.G, eq0Var);
                                    return;
                                }
                            }
                            org.telegram.messenger.g0.s2(ziVar, d2Var.getParentActivity(), d2Var);
                        } else if (g7Var.G) {
                            d2Var.getFileLoader().f(F0);
                            g7Var.f(true);
                        } else {
                            org.telegram.messenger.zi message = g7Var.getMessage();
                            message.P = true;
                            d2Var.getFileLoader().X(F0, message, 0, 0);
                            g7Var.f(true);
                        }
                    }
                } else if (i10 == 3) {
                    try {
                        TLRPC.WebPage webPage = org.telegram.messenger.zi.o1(ziVar.k) != null ? org.telegram.messenger.zi.o1(ziVar.k).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.K1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(ziVar) == null) {
                                    d2Var.createArticleViewer(false).L(ziVar, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                ut.K0(d2Var, ziVar, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.j7) view).F;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            b1(str);
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (z0(i10)) {
                    ts0 x12 = x1(i10);
                    ei.r6 r6Var = x12 != null ? x12.s : null;
                    if (r6Var == null) {
                        return;
                    }
                    ei.r9 orCreateStoryViewer = d2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int f12 = ziVar.f1();
                    ei.i7 a10 = ei.i7.a(this.n0[0].h);
                    a10.e = new zw(r6Var, 19);
                    if ((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).s1) {
                        i11 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a10.s += i11;
                    orCreateStoryViewer.Q(context, f12, r6Var, a10);
                }
            }
            E1();
        }
    }

    public final void S() {
        float abs;
        rr0[] rr0VarArr = this.n0;
        rr0 rr0Var = rr0VarArr[0];
        if (rr0Var == null || rr0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        yp0 yp0Var = this.c0;
        if (yp0Var != null) {
            char c2 = (!z0(rr0Var.F) || rr0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c2 == (rr0VarArr[1].getVisibility() == 0 ? (!z0(rr0VarArr[1].F) || rr0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c2)) {
                abs = c2 != 0 ? 1.0f : 0.0f;
                yp0Var.setTranslationX(c2 != 0 ? 0.0f : rr0VarArr[0].getMeasuredWidth());
            } else {
                yp0Var.setTranslationX(rr0VarArr[c2 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(yp0Var.getTranslationX()) / yp0Var.getMeasuredWidth());
            }
            float f11 = 0.0f;
            for (int i3 = 0; i3 < rr0VarArr.length; i3++) {
                if (rr0VarArr[i3].getVisibility() == 0) {
                    cq0 cq0Var = rr0VarArr[i3].h;
                    View childAt = cq0Var.getChildCount() == 0 ? null : cq0Var.getChildAt(0);
                    f11 += Utilities.l(1.0f - (rr0VarArr[i3].getTranslationX() / rr0VarArr[i3].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - cq0Var.getPaddingTop() : cq0Var.getChildCount() == 0 ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
            }
            float l10 = Utilities.l(1.0f - ((-f11) / org.telegram.messenger.g0.N(48.0f)));
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
            yp0Var.setAlpha(l10);
            yp0Var.setScaleX(T1);
            yp0Var.setScaleY(T1);
            yp0Var.setTranslationY(this.O1 + f11);
            f10 = abs;
        }
        U();
        if (this.Y1 != f10) {
            this.Y1 = f10;
            invalidate();
        }
    }

    public final boolean S0(org.telegram.messenger.zi ziVar, View view, int i3, boolean z10) {
        yp0 yp0Var;
        final TL_stories.StoryItem storyItem;
        gr0 gr0Var;
        ei.r6 r6Var;
        final int i10 = 0;
        if (!this.F1) {
            org.telegram.ui.ActionBar.d2 d2Var = this.y1;
            if (d2Var.getParentActivity() != null && ziVar != null && ((yp0Var = this.c0) == null || !yp0Var.f)) {
                org.telegram.messenger.g0.v1(d2Var.getParentActivity().getCurrentFocus());
                long j10 = this.m1;
                int i11 = 8;
                final int i12 = 1;
                if (!z10 || (!(I0(getClosestTab()) || getClosestTab() == 8) || this.F1)) {
                    char c2 = org.telegram.messenger.zi.B0(ziVar.k) == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c2].put(ziVar.f1(), ziVar);
                    if (!ziVar.s(null, false)) {
                        this.d1++;
                    }
                    this.o0.setVisibility(this.d1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.q0 q0Var = this.x0;
                    if (q0Var != null) {
                        q0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.w0;
                    if (q0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i11 = 0;
                        }
                        q0Var2.setVisibility(i11);
                    }
                    m1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.Q0;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i13);
                        org.telegram.messenger.g0.y(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i13++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.e1 = false;
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).b(i3, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).i(true, true);
                    }
                    if (!this.F1) {
                        o1(true);
                    }
                    O0(sparseArrayArr[0]);
                    E1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.n7) {
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                    n7Var.k(n7Var.n, n7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = ziVar.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean I0 = I0(getClosestTab());
                    f60 I = f60.I(d2Var, view);
                    f60 J = I.J();
                    J.c(R.drawable.ic_ab_back, org.telegram.messenger.bd.M0(2131753756, null), new org.telegram.ui.xp0(I, 27), false);
                    J.k();
                    f60.f(J, getStoriesController().B(j10, true), hashSet, true, new e7((Object) this, (Object) storyItem2, (Object) I, 23), new ai.v1(this, hashSet, storyItem2, I, 11));
                    I.c(R.drawable.menu_album_add, org.telegram.messenger.bd.M0(2131744815, null), new ai.y3(I, J, 10), false);
                    I.k();
                    I.c(R.drawable.msg_select, org.telegram.messenger.bd.M0(2131744799, null), new bi.q0(this, ziVar, view, i3, 29), false);
                    final int i14 = 3;
                    if (I0) {
                        int u12 = u1(getClosestTab());
                        String w10 = getStoriesController().w(u12, j10);
                        I.c(R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131744800, null), new yo0(this, u12, i10), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, org.telegram.messenger.bd.M0(2131744801, null), new zo0(this, u12, storyItem, w10, 0), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (gr0Var = this.f0) != null && (r6Var = gr0Var.s) != null) {
                            if (r6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, org.telegram.messenger.bd.M0(2131744797, null), new Runnable() { // from class: org.telegram.ui.Components.xo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        ws0 ws0Var = this;
                                        switch (i15) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), ws0Var.I1);
                                                String M0 = org.telegram.messenger.bd.M0(2131751488, null);
                                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                                s1Var.S = M0;
                                                s1Var.U = org.telegram.messenger.bd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hp0(ws0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(8));
                                                s1Var.show();
                                                s1Var.i();
                                                break;
                                            case 1:
                                                ws0Var.getClass();
                                                ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                ws0Var.getClass();
                                                ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                ws0.h(ws0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i15 = 2;
                                I.c(R.drawable.chats_pin, org.telegram.messenger.bd.M0(2131744802, null), new Runnable() { // from class: org.telegram.ui.Components.xo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i152 = i15;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        ws0 ws0Var = this;
                                        switch (i152) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), ws0Var.I1);
                                                String M0 = org.telegram.messenger.bd.M0(2131751488, null);
                                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                                s1Var.S = M0;
                                                s1Var.U = org.telegram.messenger.bd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hp0(ws0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(8));
                                                s1Var.show();
                                                s1Var.i();
                                                break;
                                            case 1:
                                                ws0Var.getClass();
                                                ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                ws0Var.getClass();
                                                ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                ws0.h(ws0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, org.telegram.messenger.bd.M0(2131744807, null), new Runnable() { // from class: org.telegram.ui.Components.xo0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i152 = i14;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                ws0 ws0Var = this;
                                switch (i152) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), ws0Var.I1);
                                        String M0 = org.telegram.messenger.bd.M0(2131751488, null);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                        s1Var.S = M0;
                                        s1Var.U = org.telegram.messenger.bd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hp0(ws0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(8));
                                        s1Var.show();
                                        s1Var.i();
                                        break;
                                    case 1:
                                        ws0Var.getClass();
                                        ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        ws0Var.getClass();
                                        ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        ws0.h(ws0Var, storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, null), new Runnable() { // from class: org.telegram.ui.Components.xo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i152 = i10;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            ws0 ws0Var = this;
                            switch (i152) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), ws0Var.I1);
                                    String M0 = org.telegram.messenger.bd.M0(2131751488, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M0;
                                    s1Var.U = org.telegram.messenger.bd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hp0(ws0Var, storyItem3));
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(8));
                                    s1Var.show();
                                    s1Var.i();
                                    break;
                                case 1:
                                    ws0Var.getClass();
                                    ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    ws0Var.getClass();
                                    ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    ws0.h(ws0Var, storyItem3);
                                    break;
                            }
                        }
                    }, true);
                    I.i = 3;
                    I.u = true;
                    I.v = true;
                    I.L = true;
                    I.M = 3;
                    Point point = org.telegram.messenger.g0.q;
                    int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T() {
        AnimatorSet animatorSet;
        if (!this.j1) {
            return false;
        }
        boolean z10 = this.l1;
        rr0[] rr0VarArr = this.n0;
        if (!z10) {
            if (Math.abs(rr0VarArr[1].getTranslationX()) < 1.0f) {
                rr0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.k1 ? -1 : 1));
                rr0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.i1;
                if (animatorSet != null) {
                }
                this.j1 = false;
            }
            X0(getTabProgress());
            return this.j1;
        }
        if (Math.abs(rr0VarArr[0].getTranslationX()) < 1.0f) {
            rr0VarArr[0].setTranslationX(0.0f);
            rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth() * (this.k1 ? 1 : -1));
            animatorSet = this.i1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.i1 = null;
            }
            this.j1 = false;
        }
        X0(getTabProgress());
        return this.j1;
    }

    public boolean T0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final void U() {
        pr prVar = this.S0;
        if (prVar != null) {
            prVar.setTranslationY(this.O1);
        }
    }

    public final void U0(float f10) {
        rr0[] rr0VarArr = this.n0;
        if (f10 != 1.0f || rr0VarArr[1].getVisibility() == 0) {
            if (this.k1) {
                rr0VarArr[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth() - (rr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                rr0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f10);
                rr0VarArr[1].setTranslationX((rr0VarArr[0].getMeasuredWidth() * f10) - rr0VarArr[0].getMeasuredWidth());
            }
            X0(getTabProgress());
            float k02 = k0(f10);
            this.s0 = k02;
            this.u0.setVisibility((k02 == 0.0f || !I() || A0()) ? 4 : 0);
            org.telegram.ui.ActionBar.q0 q0Var = this.q0;
            if (q0Var == null || I()) {
                this.r0 = l0(f10);
                L1();
            } else {
                setSearchItemVisibility(H0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            G1(false);
            if (f10 == 1.0f) {
                rr0 rr0Var = rr0VarArr[0];
                rr0VarArr[0] = rr0VarArr[1];
                rr0VarArr[1] = rr0Var;
                rr0Var.setVisibility(8);
                if (q0Var != null && this.A0 == 2) {
                    setSearchItemVisibility(H0() ? 8 : 4);
                }
                this.A0 = 0;
                s1();
            }
        }
    }

    public final boolean V(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.F1) {
            return false;
        }
        int i3 = 1;
        while (true) {
            sparseArrayArr = this.c1;
            if (i3 < 0) {
                break;
            }
            sparseArrayArr[i3].clear();
            i3--;
        }
        this.d1 = 0;
        O0(sparseArrayArr[0]);
        tp0 tp0Var = this.a0;
        if (tp0Var != null) {
            tp0Var.h();
            tp0Var.j();
        }
        o1(false);
        J1(z10);
        hs0 hs0Var = this.U;
        if (hs0Var != null) {
            hs0Var.x.clear();
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.q0 W(Context context, int i3, int i10, String str) {
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        if (y4Var != null) {
            q0Var = y4Var.l().b(i3, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.k6.y8;
            org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, s02, s0(i12), false, null);
            q0Var2.setIcon(i10);
            q0Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(q0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.Q0.add(q0Var2);
            fh0 iconView = q0Var2.getIconView();
            org.telegram.ui.ActionBar.e6 e6Var = this.I1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.r6.t(q0Var2.getIconView(), i12, e6Var, PorterDuff.Mode.SRC_IN);
            }
            if (q0Var2.getBackground() != null) {
                Drawable background = q0Var2.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                q0Var2.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(q0Var2, background, null, N, e6Var);
            }
            q0Var = q0Var2;
        }
        q0Var.setContentDescription(str);
        q0Var.setOnClickListener(new bi.q(this, i3, 18));
        return q0Var;
    }

    public void W0() {
        boolean z10 = H0() || A0();
        rs0 rs0Var = this.h0.x;
        if (rs0Var != null) {
            rs0Var.b(z10 && getClosestTab() == 9);
        }
        rs0 rs0Var2 = this.f0.x;
        if (rs0Var2 != null) {
            rs0Var2.b(z10 && getClosestTab() == 8);
        }
        for (vs0 vs0Var : this.m2.values()) {
            us0 us0Var = vs0Var.c;
            if (us0Var.s != null) {
                us0Var.x.b(z10 && getClosestTab() == vs0Var.a);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.q0;
        if (q0Var != null) {
            qq0 qq0Var = this.M0;
            q0Var.setSearchFieldHint(org.telegram.messenger.bd.M0((qq0Var != null && qq0Var.a() && getSelectedTab() == 11) ? 2131745878 : 2131745846, null));
        }
        S();
        R(true, true);
    }

    public void X0(float f10) {
        P0();
    }

    public boolean Y() {
        return this instanceof k20;
    }

    public final void Y0(org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3) {
        new org.telegram.ui.s11(d2Var, j10, this.p1[1], new ci.q3(this, j10, i3)).show();
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        rr0[] rr0VarArr = this.n0;
        motionEvent.offsetLocation(x10 - rr0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - rr0VarArr[0].getY()) - rr0VarArr[0].h.getFastScroll().getY());
        return rr0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void Z0(org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3) {
        t4.u0(d2Var, org.telegram.messenger.bd.M0(2131751599, null), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744805, getStoriesController().w(i3, j10))), org.telegram.messenger.bd.M0(2131751599, null), true, new ci.i9(this, j10, i3, 8));
    }

    public final boolean a0(int i3) {
        ls0[] ls0VarArr = this.x1.n;
        if (ls0VarArr == null) {
            return false;
        }
        ls0[] ls0VarArr2 = this.w1;
        if (i3 == 0) {
            ls0 ls0Var = ls0VarArr2[i3];
            if (!ls0Var.h) {
                int[] iArr = ls0Var.f;
                int[] iArr2 = ls0VarArr[i3].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ls0VarArr2[i3].f;
            int[] iArr4 = ls0VarArr[i3].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ls0VarArr2[i3].a.addAll(ls0VarArr[i3].a);
        ls0VarArr2[i3].c.addAll(ls0VarArr[i3].c);
        for (Map.Entry entry : ls0VarArr[i3].d.entrySet()) {
            ls0VarArr2[i3].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            ls0VarArr2[i3].b[i10] = ls0VarArr[i3].b[i10].clone();
            ls0 ls0Var2 = ls0VarArr2[i3];
            int[] iArr5 = ls0Var2.j;
            ls0 ls0Var3 = ls0VarArr[i3];
            iArr5[i10] = ls0Var3.j[i10];
            ls0Var2.i[i10] = ls0Var3.i[i10];
        }
        ls0VarArr2[i3].e.addAll(ls0VarArr[i3].e);
        return !ls0VarArr[i3].a.isEmpty();
    }

    public final void a1(org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3) {
        String w10 = getStoriesController().w(i3, j10);
        Context context = d2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
        b4.o oVar = new b4.o(this, j10, i3, 7);
        Pattern pattern = t4.a;
        t4.Q(context, d2Var, org.telegram.messenger.bd.M0(2131744792, null), org.telegram.messenger.bd.M0(2131744791, null), org.telegram.messenger.bd.M0(2131744790, null), w10, 12, org.telegram.messenger.bd.M0(2131746286, null), resourceProvider, oVar);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.kd));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(int i3, vr0 vr0Var) {
        String str;
        vr0 vr0Var2;
        vr0 vr0Var3;
        boolean z10;
        ei.r6 r6Var;
        TLRPC.Chat M0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        tp0 tp0Var;
        tp0 tp0Var2;
        int i10;
        org.telegram.ui.ActionBar.y0 y0Var;
        boolean z11;
        vr0 vr0Var4;
        org.telegram.ui.ActionBar.y0 y0Var2;
        org.telegram.ui.ActionBar.y0 y0Var3;
        vs0 w12;
        boolean z02 = z0(i3);
        org.telegram.ui.ActionBar.d2 d2Var = this.y1;
        int currentAccount = d2Var.getCurrentAccount();
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(currentAccount);
        long j10 = this.m1;
        TLRPC.User a22 = s12.a2(Long.valueOf(j10));
        boolean i11 = getStoriesController().i(j10);
        int i12 = 3;
        int i13 = 4;
        final int i14 = 1;
        if (I0(i3) && i11 && (w12 = w1(i3)) != null) {
            int i15 = w12.b;
            vr0Var.n(R.drawable.menu_add_stories, new yo0(this, i15, i14), org.telegram.messenger.bd.M0(2131744808, null), false, true);
            B(vr0Var, d2Var, this.m1, i15);
            vr0Var.n(R.drawable.tabs_reorder, new yo0(this, i15, i12), org.telegram.messenger.bd.M0(2131744800, null), false, true);
            vr0Var.n(R.drawable.msg_delete, new yo0(this, i15, i13), org.telegram.messenger.bd.M0(2131744806, null), true, true);
            vr0Var.e();
            C(vr0Var);
            return true;
        }
        int i16 = 5;
        final int i17 = 0;
        if (i3 == 14) {
            vp0 vp0Var = this.b0;
            if (vp0Var != null) {
                ai.o4 currentPage = vp0Var.getCurrentPage();
                ci.v8 v8Var = currentPage == null ? null : currentPage.e;
                if (v8Var != null) {
                    long j11 = vp0Var.c;
                    int i18 = vp0Var.b;
                    boolean w10 = j11 == org.telegram.messenger.h10.i(i18).e() ? true : j11 >= 0 ? false : org.telegram.messenger.t3.w(5, org.telegram.messenger.hp.s1(i18).M0(Long.valueOf(-j11)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (v8Var.c) {
                        i10 = 11;
                        y0Var = null;
                        z11 = false;
                    } else {
                        i10 = 11;
                        y0Var = vr0Var.n(R.drawable.menu_sort_value, new j50(20, v8Var, runnableArr), org.telegram.messenger.bd.M0(2131750205, null), false, false);
                        z11 = true;
                    }
                    if (vp0Var.b()) {
                        vr0Var.n(R.drawable.menu_folder_add, new uo0(this, i10), org.telegram.messenger.bd.M0(2131750106, null), false, true);
                        z11 = true;
                    }
                    if (vp0Var.e.h()) {
                        if (!v8Var.i().isEmpty() || currentPage.d) {
                            vr0Var.n(R.drawable.tabs_reorder, new uo0(this, 12), org.telegram.messenger.bd.M0(2131750041, null), false, true);
                            vr0Var4 = vr0Var;
                        } else {
                            vr0Var4 = vr0Var;
                        }
                        z11 = true;
                    } else {
                        vr0Var4 = vr0Var;
                    }
                    if (z11) {
                        vr0Var4.e();
                    }
                    org.telegram.ui.ActionBar.y0 h = vr0Var4.h(org.telegram.messenger.bd.M0(2131750203, null));
                    org.telegram.ui.ActionBar.y0 h7 = vr0Var4.h(org.telegram.messenger.bd.M0(2131750207, null));
                    org.telegram.ui.ActionBar.y0 h10 = vr0Var4.h(org.telegram.messenger.bd.M0(2131750202, null));
                    org.telegram.ui.ActionBar.y0 h11 = vr0Var4.h(org.telegram.messenger.bd.M0(2131750204, null));
                    if (w10) {
                        vr0Var4.e();
                        org.telegram.ui.ActionBar.y0 h12 = vr0Var4.h(org.telegram.messenger.bd.M0(2131750209, null));
                        y0Var3 = vr0Var4.h(org.telegram.messenger.bd.M0(2131750208, null));
                        y0Var2 = h12;
                    } else {
                        y0Var2 = null;
                        y0Var3 = null;
                    }
                    ci.v8 v8Var2 = v8Var;
                    ai.k6 k6Var = new ai.k6(y0Var, v8Var2, h, h7, h10, h11, w10, y0Var2, y0Var3);
                    org.telegram.ui.ActionBar.y0 y0Var4 = y0Var2;
                    org.telegram.ui.ActionBar.y0 y0Var5 = y0Var3;
                    runnableArr[0] = k6Var;
                    k6Var.run();
                    ai.u4.j(h, v8Var2, runnableArr[0], 1);
                    ai.u4.j(h7, v8Var2, runnableArr[0], 2);
                    ai.u4.j(h10, v8Var2, runnableArr[0], 4);
                    ai.u4.j(h11, v8Var2, runnableArr[0], 8);
                    if (w10) {
                        ai.u4.j(y0Var4, v8Var2, runnableArr[0], 256);
                        ai.u4.j(y0Var5, v8Var2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i3 == 13 && a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit && (tp0Var = this.a0) != null) {
            int itemsCount = tp0Var.getItemsCount();
            if (itemsCount < d2Var.getMessagesController().T5) {
                tp0Var2 = tp0Var;
                vr0Var.n(R.drawable.msg_addbot, new uo0(this, 4), org.telegram.messenger.bd.M0(2131746723, null), false, true);
            } else {
                tp0Var2 = tp0Var;
            }
            if (itemsCount > 1 && !tp0Var2.d()) {
                vr0Var.n(R.drawable.tabs_reorder, new uo0(this, i16), org.telegram.messenger.bd.M0(2131746698, null), false, true);
            }
            if (itemsCount > 0) {
                vr0Var.n(R.drawable.msg_select, new uo0(this, 6), org.telegram.messenger.bd.M0(tp0Var2.d() ? 2131746696 : 2131746697, null), false, true);
            }
            if (!TextUtils.isEmpty(tp0Var2.getCurrentLang())) {
                vr0Var.n(R.drawable.msg_delete, new uo0(this, 7), org.telegram.messenger.bd.a0(null, null, 2131746699, f21.O0(tp0Var2.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i3 == 11) {
                vr0Var.n(R.drawable.msg_discussion, new uo0(this, 8), org.telegram.messenger.bd.M0(2131745874, null), false, true);
                vr0Var.e();
                vr0Var.n(R.drawable.msg_home, new uo0(this, 9), org.telegram.messenger.bd.M0(2131754390, null), false, true);
                vr0Var.n(R.drawable.msg_delete, new uo0(this, 10), org.telegram.messenger.bd.M0(2131751591, null), false, true);
                return true;
            }
            if ((i3 == 8 || I0(i3)) && i11) {
                str = null;
                vr0Var2 = vr0Var;
                vr0Var2.n(R.drawable.menu_album_add, new uo0(this, 2), org.telegram.messenger.bd.M0(2131744817, null), false, true);
                vr0Var2.e();
            } else {
                vr0Var2 = vr0Var;
                str = null;
            }
            C(vr0Var2);
            if (!org.telegram.messenger.m5.C(j10) && (a22 == null || !a22.bot)) {
                vr0Var2.n(R.drawable.msg_calendar2, new yo0(this, i3, 2), org.telegram.messenger.bd.M0(2131752642, str), false, true);
                if (this.g1 == null || H0() || (M0 = org.telegram.messenger.hp.s1(currentAccount).M0(Long.valueOf(this.g1.id))) == null || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    vr0Var3 = vr0Var;
                } else {
                    vr0Var3 = vr0Var;
                    vr0Var3.n(R.drawable.msg_archive, new uo0(this, 3), org.telegram.messenger.bd.M0(2131747818, str), false, true);
                }
                ls0[] ls0VarArr = this.w1;
                if (!z02) {
                    ls0 ls0Var = ls0VarArr[0];
                    if (!ls0Var.w || !ls0Var.v) {
                        boolean[] zArr = ls0Var.i;
                        if (zArr[0] && zArr[1] && ls0Var.l) {
                            z10 = false;
                            if (z10) {
                                vr0Var3.e();
                                final org.telegram.ui.ActionBar.y0 h13 = vr0Var3.h(org.telegram.messenger.bd.M0(2131748661, str));
                                final org.telegram.ui.ActionBar.y0 h14 = vr0Var3.h(org.telegram.messenger.bd.M0(2131748660, str));
                                if (!z02) {
                                    int i19 = ls0VarArr[0].q;
                                    h13.setChecked(i19 == 0 || i19 == 1);
                                    int i20 = ls0VarArr[0].q;
                                    h14.setChecked(i20 == 0 || i20 == 2);
                                    h13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fp0
                                        public final /* synthetic */ ws0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i17) {
                                                case 0:
                                                    final int i21 = 1;
                                                    final ws0 ws0Var = this.b;
                                                    final org.telegram.ui.ActionBar.y0 y0Var6 = h13;
                                                    final org.telegram.ui.ActionBar.y0 y0Var7 = h14;
                                                    ws0Var.A1(y0Var6, y0Var7, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i21) {
                                                                case 0:
                                                                    ws0 ws0Var2 = ws0Var;
                                                                    ws0Var2.w1[0].q = (y0Var6.getCheckView().a.q && y0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    ws0Var2.M();
                                                                    break;
                                                                default:
                                                                    ws0 ws0Var3 = ws0Var;
                                                                    ws0Var3.w1[0].q = (y0Var6.getCheckView().a.q && y0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    ws0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i22 = 0;
                                                    final ws0 ws0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.y0 y0Var8 = h14;
                                                    final org.telegram.ui.ActionBar.y0 y0Var9 = h13;
                                                    ws0Var2.A1(y0Var9, y0Var8, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    ws0 ws0Var22 = ws0Var2;
                                                                    ws0Var22.w1[0].q = (y0Var8.getCheckView().a.q && y0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    ws0Var22.M();
                                                                    break;
                                                                default:
                                                                    ws0 ws0Var3 = ws0Var2;
                                                                    ws0Var3.w1[0].q = (y0Var8.getCheckView().a.q && y0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    ws0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    h14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fp0
                                        public final /* synthetic */ ws0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i14) {
                                                case 0:
                                                    final int i21 = 1;
                                                    final ws0 ws0Var = this.b;
                                                    final org.telegram.ui.ActionBar.y0 y0Var6 = h14;
                                                    final org.telegram.ui.ActionBar.y0 y0Var7 = h13;
                                                    ws0Var.A1(y0Var6, y0Var7, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i21) {
                                                                case 0:
                                                                    ws0 ws0Var22 = ws0Var;
                                                                    ws0Var22.w1[0].q = (y0Var6.getCheckView().a.q && y0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    ws0Var22.M();
                                                                    break;
                                                                default:
                                                                    ws0 ws0Var3 = ws0Var;
                                                                    ws0Var3.w1[0].q = (y0Var6.getCheckView().a.q && y0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    ws0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i22 = 0;
                                                    final ws0 ws0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.y0 y0Var8 = h13;
                                                    final org.telegram.ui.ActionBar.y0 y0Var9 = h14;
                                                    ws0Var2.A1(y0Var9, y0Var8, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    ws0 ws0Var22 = ws0Var2;
                                                                    ws0Var22.w1[0].q = (y0Var8.getCheckView().a.q && y0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    ws0Var22.M();
                                                                    break;
                                                                default:
                                                                    ws0 ws0Var3 = ws0Var2;
                                                                    ws0Var3.w1[0].q = (y0Var8.getCheckView().a.q && y0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    ws0Var3.M();
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
                                final ts0 x12 = x1(i3);
                                if (x12 != null && (r6Var = x12.s) != null) {
                                    h13.setChecked(r6Var.n);
                                    h14.setChecked(x12.s.o);
                                }
                                final int i21 = 0;
                                h13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ep0
                                    public final /* synthetic */ ws0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i21) {
                                            case 0:
                                                final int i22 = 1;
                                                final ts0 ts0Var = x12;
                                                final org.telegram.ui.ActionBar.y0 y0Var6 = h13;
                                                final org.telegram.ui.ActionBar.y0 y0Var7 = h14;
                                                this.b.A1(y0Var6, y0Var7, new Runnable() { // from class: org.telegram.ui.Components.gp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ei.r6 r6Var2;
                                                        ei.r6 r6Var3;
                                                        switch (i22) {
                                                            case 0:
                                                                ts0 ts0Var2 = ts0Var;
                                                                if (ts0Var2 != null && (r6Var2 = ts0Var2.s) != null) {
                                                                    boolean z12 = y0Var6.getCheckView().a.q;
                                                                    boolean z13 = y0Var7.getCheckView().a.q;
                                                                    r6Var2.n = z12;
                                                                    r6Var2.o = z13;
                                                                    r6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                ts0 ts0Var3 = ts0Var;
                                                                if (ts0Var3 != null && (r6Var3 = ts0Var3.s) != null) {
                                                                    boolean z14 = y0Var6.getCheckView().a.q;
                                                                    boolean z15 = y0Var7.getCheckView().a.q;
                                                                    r6Var3.n = z14;
                                                                    r6Var3.o = z15;
                                                                    r6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i23 = 0;
                                                final ts0 ts0Var2 = x12;
                                                final org.telegram.ui.ActionBar.y0 y0Var8 = h14;
                                                final org.telegram.ui.ActionBar.y0 y0Var9 = h13;
                                                this.b.A1(y0Var9, y0Var8, new Runnable() { // from class: org.telegram.ui.Components.gp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ei.r6 r6Var2;
                                                        ei.r6 r6Var3;
                                                        switch (i23) {
                                                            case 0:
                                                                ts0 ts0Var22 = ts0Var2;
                                                                if (ts0Var22 != null && (r6Var2 = ts0Var22.s) != null) {
                                                                    boolean z12 = y0Var8.getCheckView().a.q;
                                                                    boolean z13 = y0Var9.getCheckView().a.q;
                                                                    r6Var2.n = z12;
                                                                    r6Var2.o = z13;
                                                                    r6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                ts0 ts0Var3 = ts0Var2;
                                                                if (ts0Var3 != null && (r6Var3 = ts0Var3.s) != null) {
                                                                    boolean z14 = y0Var8.getCheckView().a.q;
                                                                    boolean z15 = y0Var9.getCheckView().a.q;
                                                                    r6Var3.n = z14;
                                                                    r6Var3.o = z15;
                                                                    r6Var3.d(true);
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
                                final int i22 = 1;
                                h14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ep0
                                    public final /* synthetic */ ws0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i22) {
                                            case 0:
                                                final int i222 = 1;
                                                final ts0 ts0Var = x12;
                                                final org.telegram.ui.ActionBar.y0 y0Var6 = h14;
                                                final org.telegram.ui.ActionBar.y0 y0Var7 = h13;
                                                this.b.A1(y0Var6, y0Var7, new Runnable() { // from class: org.telegram.ui.Components.gp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ei.r6 r6Var2;
                                                        ei.r6 r6Var3;
                                                        switch (i222) {
                                                            case 0:
                                                                ts0 ts0Var22 = ts0Var;
                                                                if (ts0Var22 != null && (r6Var2 = ts0Var22.s) != null) {
                                                                    boolean z12 = y0Var6.getCheckView().a.q;
                                                                    boolean z13 = y0Var7.getCheckView().a.q;
                                                                    r6Var2.n = z12;
                                                                    r6Var2.o = z13;
                                                                    r6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                ts0 ts0Var3 = ts0Var;
                                                                if (ts0Var3 != null && (r6Var3 = ts0Var3.s) != null) {
                                                                    boolean z14 = y0Var6.getCheckView().a.q;
                                                                    boolean z15 = y0Var7.getCheckView().a.q;
                                                                    r6Var3.n = z14;
                                                                    r6Var3.o = z15;
                                                                    r6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i23 = 0;
                                                final ts0 ts0Var2 = x12;
                                                final org.telegram.ui.ActionBar.y0 y0Var8 = h13;
                                                final org.telegram.ui.ActionBar.y0 y0Var9 = h14;
                                                this.b.A1(y0Var9, y0Var8, new Runnable() { // from class: org.telegram.ui.Components.gp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ei.r6 r6Var2;
                                                        ei.r6 r6Var3;
                                                        switch (i23) {
                                                            case 0:
                                                                ts0 ts0Var22 = ts0Var2;
                                                                if (ts0Var22 != null && (r6Var2 = ts0Var22.s) != null) {
                                                                    boolean z12 = y0Var8.getCheckView().a.q;
                                                                    boolean z13 = y0Var9.getCheckView().a.q;
                                                                    r6Var2.n = z12;
                                                                    r6Var2.o = z13;
                                                                    r6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                ts0 ts0Var3 = ts0Var2;
                                                                if (ts0Var3 != null && (r6Var3 = ts0Var3.s) != null) {
                                                                    boolean z14 = y0Var8.getCheckView().a.q;
                                                                    boolean z15 = y0Var9.getCheckView().a.q;
                                                                    r6Var3.n = z14;
                                                                    r6Var3.o = z15;
                                                                    r6Var3.d(true);
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

    public final void b1(String str) {
        boolean J3 = org.telegram.messenger.g0.J3(str);
        org.telegram.ui.ActionBar.d2 d2Var = this.y1;
        if (J3) {
            t4.p0(d2Var, str, true, true);
        } else {
            sf.c.t(d2Var.getParentActivity(), str);
        }
    }

    public final void c0(int i3, tj0 tj0Var, boolean z10) {
        ArrayList arrayList = this.w1[i3].e;
        int L0 = ((u4.b0) tj0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            wr0 wr0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((wr0) arrayList.get(i10)).b) {
                        wr0Var = (wr0) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (wr0Var == null) {
                    wr0Var = (wr0) k2.p1.h(1, arrayList);
                }
            }
            if (wr0Var != null) {
                K0(i3, wr0Var.d, wr0Var.b + 1, z10);
            }
        }
    }

    public int c1() {
        return -1;
    }

    public final void d0() {
        rr0[] rr0VarArr;
        rr0 rr0Var;
        int i3;
        u4.h0 adapter;
        if (this.r1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                rr0VarArr = this.n0;
                if (i11 >= rr0VarArr.length) {
                    rr0Var = null;
                    break;
                }
                rr0Var = rr0VarArr[i11];
                if (rr0Var.F == this.s1) {
                    break;
                } else {
                    i11++;
                }
            }
            if (rr0Var != null) {
                boolean z02 = z0(rr0Var.F);
                float f10 = this.q1;
                ls0[] ls0VarArr = this.w1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.r1 = false;
                        if (this.s1 == 0) {
                            ls0VarArr[0].g(false);
                        }
                        rr0Var.n.setVisibility(8);
                        rr0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f10 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new sq0(this, rr0Var, i10));
                    ofFloat.addListener(new org.telegram.ui.fi(this, z10, z02 ? 1 : 0, rr0Var));
                    ofFloat.setInterpolator(xq.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.r1 = false;
                int i12 = this.t1;
                int[] iArr = this.p1;
                iArr[z02 ? 1 : 0] = i12;
                if (!z02) {
                    org.telegram.messenger.az.B(i12);
                } else if (m0(rr0Var.F) >= 5) {
                    org.telegram.messenger.az.F(this.t1);
                }
                for (int i13 = 0; i13 < rr0VarArr.length; i13++) {
                    rr0 rr0Var2 = rr0VarArr[i13];
                    if (rr0Var2 != null && rr0Var2.h != null && (((i3 = rr0Var2.F) == 0 || z0(i3)) && (adapter = rr0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            ls0VarArr[0].g(false);
                        }
                        rr0VarArr[i13].n.setVisibility(8);
                        rr0VarArr[i13].x.y1(iArr[z02 ? 1 : 0]);
                        rr0VarArr[i13].h.a0();
                        rr0VarArr[i13].h.invalidate();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.b4(rr0VarArr[i13].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    h1();
                    return;
                }
                while (i10 < rr0VarArr.length) {
                    rr0 rr0Var3 = rr0VarArr[i10];
                    if (rr0Var3.F == this.s1) {
                        View m10 = rr0Var3.r.m(this.s);
                        if (m10 != null) {
                            this.w = m10.getTop();
                        }
                        rr0 rr0Var4 = rr0VarArr[i10];
                        rr0Var4.x.h1(this.s, (-rr0Var4.h.getPaddingTop()) + this.w);
                    }
                    i10++;
                }
            }
        }
    }

    public final void d1(ArrayList arrayList, boolean z10) {
        gr0 gr0Var = this.f0;
        if (gr0Var == null || gr0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.y1;
        if (z10 && arrayList.size() > d2Var.getMessagesController().N5) {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.G(d2Var.getMessagesController().N5, "StoriesPinLimit", new Object[0]), fc.a0(d2Var), R.raw.chats_infotip, 36);
            return;
        }
        ei.r6 r6Var = gr0Var.s;
        int i3 = r6Var.c;
        ArrayList arrayList2 = r6Var.g;
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
        boolean z12 = arrayList3.size() > org.telegram.messenger.hp.s1(i3).N5;
        if (!z12) {
            boolean z13 = arrayList2.size() != arrayList3.size();
            if (!z13) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i10) != arrayList3.get(i10)) {
                        z13 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (z13) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                r6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = org.telegram.messenger.hp.s1(i3).j1(r6Var.d);
                ConnectionsManager.getInstance(i3).sendRequest(tL_togglePinnedToTop, new ei.u5(2));
            }
            z11 = z12;
        }
        if (z11) {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.G(d2Var.getMessagesController().N5, "StoriesPinLimit", new Object[0]), fc.a0(d2Var), R.raw.chats_infotip, 36);
        } else if (z10) {
            fc.a0(d2Var).I(R.raw.ic_pin, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.bd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), fc.a0(d2Var), R.raw.ic_unpin, 36);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v33 */
    @Override // org.telegram.messenger.cs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        cq0 cq0Var;
        org.telegram.messenger.zi ziVar;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i11;
        sj0 sj0Var;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int size;
        int i14;
        boolean z12;
        cq0 cq0Var2;
        int i15;
        int i16;
        cq0 cq0Var3;
        int i17 = org.telegram.messenger.hs.V;
        sj0 sj0Var2 = this.R;
        sj0 sj0Var3 = this.P;
        ks0 ks0Var = this.M;
        sj0 sj0Var4 = this.O;
        sj0 sj0Var5 = this.N;
        org.telegram.ui.ActionBar.d2 d2Var = this.y1;
        fs0 fs0Var = this.Q;
        dr0 dr0Var = this.K;
        long j10 = this.m1;
        rr0[] rr0VarArr = this.n0;
        ls0[] ls0VarArr = this.w1;
        if (i3 == i17) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != d2Var.getClassGuid() || intValue2 != ls0VarArr[intValue3].p) {
                if (this.x1 == null || !ls0VarArr[intValue3].a.isEmpty() || ls0VarArr[intValue3].o || !a0(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    sj0Var2 = dr0Var;
                } else if (intValue3 == 1) {
                    sj0Var2 = sj0Var5;
                } else if (intValue3 == 2) {
                    sj0Var2 = sj0Var4;
                } else if (intValue3 == 3) {
                    sj0Var2 = ks0Var;
                } else if (intValue3 == 4) {
                    sj0Var2 = sj0Var3;
                } else if (intValue3 != 5) {
                    sj0Var2 = intValue3 == 15 ? fs0Var : null;
                }
                if (sj0Var2 != null) {
                    for (int i18 = 0; i18 < rr0VarArr.length; i18++) {
                        rr0 rr0Var = rr0VarArr[i18];
                        if (rr0Var != null && (cq0Var2 = rr0Var.h) != null && cq0Var2.getAdapter() == sj0Var2) {
                            rr0VarArr[i18].h.C0();
                        }
                    }
                    sj0Var2.f();
                }
                this.e1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean C = org.telegram.messenger.m5.C(j10);
            int i19 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                ls0VarArr[intValue3].f[i19] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i15 = intValue3;
                sj0Var2 = dr0Var;
            } else if (intValue3 == 1) {
                i15 = intValue3;
                sj0Var2 = sj0Var5;
            } else if (intValue3 == 2) {
                i15 = intValue3;
                sj0Var2 = sj0Var4;
            } else if (intValue3 == 3) {
                i15 = intValue3;
                sj0Var2 = ks0Var;
            } else if (intValue3 == 4) {
                i15 = intValue3;
                sj0Var2 = sj0Var3;
            } else if (intValue3 == 5) {
                i15 = intValue3;
            } else if (intValue3 == 15) {
                sj0Var2 = fs0Var;
                i15 = 8;
            } else {
                i15 = intValue3;
                sj0Var2 = null;
            }
            int size2 = ls0VarArr[i15].a.size();
            if (sj0Var2 != null) {
                i16 = sj0Var2.b();
                if (sj0Var2 instanceof oj0) {
                    ((oj0) sj0Var2).L();
                }
            } else {
                i16 = 0;
            }
            ls0VarArr[i15].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(size3);
                    if (ls0VarArr[i15].a(ziVar2, i19, r13, C)) {
                        sparseBooleanArray.put(ziVar2.f1(), r13);
                        ls0 ls0Var = ls0VarArr[i15];
                        int i20 = ls0Var.m - r13;
                        ls0Var.m = i20;
                        if (i20 < 0) {
                            ls0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                ls0VarArr[i15].l = ((Boolean) objArr[5]).booleanValue();
                ls0 ls0Var2 = ls0VarArr[i15];
                if (ls0Var2.l) {
                    ls0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(i21);
                    if (ls0VarArr[i15].a(ziVar3, i19, r12, C)) {
                        sparseBooleanArray.put(ziVar3.f1(), true);
                        ls0 ls0Var3 = ls0VarArr[i15];
                        int i22 = ls0Var3.n - 1;
                        ls0Var3.n = i22;
                        if (i22 < 0) {
                            ls0Var3.n = r12;
                        }
                    }
                    i21++;
                    r12 = 0;
                }
                ls0 ls0Var4 = ls0VarArr[i15];
                if (ls0Var4.o && ls0Var4.a.size() > 0) {
                    ls0 ls0Var5 = ls0VarArr[i15];
                    ls0Var5.k = ((org.telegram.messenger.zi) ls0Var5.a.get(0)).f1();
                }
                ls0VarArr[i15].i[i19] = ((Boolean) objArr[5]).booleanValue();
                ls0 ls0Var6 = ls0VarArr[i15];
                if (ls0Var6.i[i19]) {
                    int size4 = ls0Var6.b[i19].size();
                    if (i19 == 0) {
                        size4 += ls0VarArr[i15].m;
                    }
                    ls0VarArr[i15].f[i19] = size4;
                }
            }
            if (!booleanValue && i19 == 0) {
                ls0 ls0Var7 = ls0VarArr[i15];
                if (ls0Var7.i[i19] && this.f1 != 0) {
                    ls0Var7.g = true;
                    d2Var.getMediaDataController().N0(this.f1, 50, ls0VarArr[i15].j[1], 0, i15, this.G, 1, d2Var.getClassGuid(), ls0VarArr[i15].p, null, null);
                }
            }
            int i23 = i15;
            if (sj0Var2 != null) {
                qr0 qr0Var = null;
                for (int i24 = 0; i24 < rr0VarArr.length; i24++) {
                    rr0 rr0Var2 = rr0VarArr[i24];
                    if (rr0Var2 != null && (cq0Var3 = rr0Var2.h) != null && cq0Var3.getAdapter() == sj0Var2) {
                        qr0 qr0Var2 = rr0VarArr[i24].h;
                        qr0Var2.C0();
                        qr0Var = qr0Var2;
                    }
                }
                int b10 = sj0Var2.b();
                if (sj0Var2 != dr0Var) {
                    try {
                        sj0Var2.f();
                    } catch (Throwable unused) {
                    }
                } else if (dr0Var.b() == i16) {
                    org.telegram.messenger.g0.b4(qr0Var);
                } else {
                    dr0Var.f();
                }
                if (!ls0VarArr[i23].a.isEmpty() || ls0VarArr[i23].g) {
                    if (qr0Var != null && (sj0Var2 == dr0Var || b10 >= i16)) {
                        D(qr0Var, i16, sparseBooleanArray);
                    }
                } else if (qr0Var != null) {
                    D(qr0Var, i16, sparseBooleanArray);
                }
                if (qr0Var != null && !ls0VarArr[i23].o) {
                    if (size2 == 0) {
                        for (int i25 = 0; i25 < 2; i25++) {
                            if (rr0VarArr[i25].F == 0) {
                                ((u4.b0) qr0Var.getLayoutManager()).h1(dr0Var.L(0), 0);
                            }
                        }
                    } else {
                        h1();
                    }
                }
            }
            ls0 ls0Var8 = ls0VarArr[i23];
            if (ls0Var8.o) {
                if (ls0Var8.a.size() == 0) {
                    M0(i23);
                } else {
                    ls0VarArr[i23].o = false;
                }
            }
            this.e1 = true;
            return;
        }
        if (i3 == org.telegram.messenger.hs.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat M0 = org.telegram.messenger.m5.z(j10) ? d2Var.getMessagesController().M0(Long.valueOf(-j10)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (org.telegram.messenger.t3.T(M0)) {
                if (longValue2 == 0 && this.f1 != 0) {
                    i13 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i26 = -1;
                    i14 = 0;
                    z12 = false;
                    while (i14 < size) {
                        dr0 dr0Var2 = dr0Var;
                        int i27 = 0;
                        while (i27 < ls0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (ls0VarArr[i27].b(((Integer) arrayList2.get(i14)).intValue(), i13) != null) {
                                i26 = i27;
                                z12 = true;
                            }
                            i27++;
                            arrayList2 = arrayList3;
                        }
                        i14++;
                        dr0Var = dr0Var2;
                    }
                    dr0 dr0Var3 = dr0Var;
                    if (z12) {
                        this.e1 = true;
                        if (dr0Var3 != null) {
                            dr0Var3.f();
                        }
                        if (sj0Var5 != null) {
                            sj0Var5.f();
                        }
                        if (sj0Var4 != null) {
                            sj0Var4.f();
                        }
                        if (ks0Var != null) {
                            ks0Var.X(false);
                        }
                        if (sj0Var3 != null) {
                            sj0Var3.f();
                        }
                        if (fs0Var != null) {
                            fs0Var.f();
                        }
                        if (sj0Var2 != null) {
                            sj0Var2.f();
                        }
                        if (i26 == 0 || i26 == 1 || i26 == 2 || i26 == 4) {
                            L0(true);
                        }
                    }
                    g0(i26);
                    return;
                }
                if (longValue2 != M0.id) {
                    return;
                }
            } else if (longValue2 != 0) {
                return;
            }
            i13 = 0;
            ArrayList arrayList22 = (ArrayList) objArr[0];
            size = arrayList22.size();
            int i262 = -1;
            i14 = 0;
            z12 = false;
            while (i14 < size) {
            }
            dr0 dr0Var32 = dr0Var;
            if (z12) {
            }
            g0(i262);
            return;
        }
        if (i3 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j10) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean C2 = org.telegram.messenger.m5.C(j10);
                int i28 = 0;
                boolean z13 = false;
                while (i28 < arrayList4.size()) {
                    org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) arrayList4.get(i28);
                    ArrayList arrayList5 = arrayList4;
                    if (org.telegram.messenger.zi.o1(ziVar4.k) == null || ziVar4.n5()) {
                        i12 = i28;
                    } else {
                        int f02 = org.telegram.messenger.li.f0(ziVar4.k);
                        i12 = i28;
                        if (f02 == -1) {
                            return;
                        }
                        ls0 ls0Var9 = ls0VarArr[f02];
                        if (ls0Var9.l) {
                            z11 = z13;
                            if (ls0Var9.a(ziVar4, org.telegram.messenger.zi.B0(ziVar4.k) == j10 ? 0 : 1, true, C2)) {
                                this.a1[f02] = 1;
                                z10 = true;
                                i28 = i12 + 1;
                                z13 = z10;
                                arrayList4 = arrayList5;
                            }
                            z10 = z11;
                            i28 = i12 + 1;
                            z13 = z10;
                            arrayList4 = arrayList5;
                        }
                    }
                    z11 = z13;
                    z10 = z11;
                    i28 = i12 + 1;
                    z13 = z10;
                    arrayList4 = arrayList5;
                }
                boolean z14 = z13;
                boolean z15 = true;
                if (z14) {
                    this.e1 = true;
                    int i29 = 0;
                    while (i29 < rr0VarArr.length) {
                        int i30 = rr0VarArr[i29].F;
                        if (i30 == 0) {
                            sj0Var = dr0Var;
                        } else if (i30 == z15) {
                            sj0Var = sj0Var5;
                        } else if (i30 == 2) {
                            sj0Var = sj0Var4;
                        } else if (i30 == 3) {
                            sj0Var = ks0Var;
                        } else {
                            if (i30 == 4) {
                                sj0Var = sj0Var3;
                            } else if (i30 == 5) {
                                sj0Var = sj0Var2;
                            } else {
                                sj0Var = i30 == 15 ? fs0Var : null;
                                if (sj0Var != null) {
                                    sj0Var.b();
                                    dr0Var.f();
                                    sj0Var5.f();
                                    sj0Var4.f();
                                    ks0Var.X(false);
                                    sj0Var3.f();
                                    fs0Var.f();
                                    sj0Var2.f();
                                }
                                i29++;
                                z15 = true;
                            }
                            if (sj0Var != null) {
                            }
                            i29++;
                            z15 = true;
                        }
                        if (sj0Var != null) {
                        }
                        i29++;
                        z15 = true;
                    }
                    N1(z15);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.K) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l10 = (Long) objArr[3];
            if (l10.longValue() == j10 || l10.longValue() == this.f1) {
                int i31 = l10.longValue() == j10 ? 0 : 1;
                for (ls0 ls0Var10 : ls0VarArr) {
                    ls0Var10.f(i31, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i32 = org.telegram.messenger.hs.h2;
        int i33 = org.telegram.messenger.hs.f2;
        int i34 = org.telegram.messenger.hs.g2;
        if (i3 == i32 || i3 == i34 || i3 == i33) {
            if (i3 != i33 && i3 != i34) {
                if (((org.telegram.messenger.zi) objArr[0]).T != 0) {
                    return;
                }
                for (int i35 = 0; i35 < rr0VarArr.length; i35++) {
                    int childCount = rr0VarArr[i35].h.getChildCount();
                    for (int i36 = 0; i36 < childCount; i36++) {
                        View childAt = rr0VarArr[i35].h.getChildAt(i36);
                        if (childAt instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                            if (f7Var.getMessage() != null) {
                                f7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i37 = 0; i37 < rr0VarArr.length; i37++) {
                rr0 rr0Var3 = rr0VarArr[i37];
                if (rr0Var3 != null && (cq0Var = rr0Var3.h) != null) {
                    int childCount2 = cq0Var.getChildCount();
                    for (int i38 = 0; i38 < childCount2; i38++) {
                        View childAt2 = rr0VarArr[i37].h.getChildAt(i38);
                        if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                            if (f7Var2.getMessage() != null) {
                                f7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.x5) {
            ei.r6 r6Var = (ei.r6) objArr[0];
            gr0 gr0Var = this.f0;
            if (gr0Var == null || r6Var != gr0Var.s) {
                rp0 rp0Var = this.h0;
                if (rp0Var == null || r6Var != rp0Var.s) {
                    Iterator it = this.m2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        vs0 vs0Var = (vs0) it.next();
                        if (vs0Var.c.s == r6Var) {
                            i11 = vs0Var.a;
                            break;
                        }
                    }
                } else {
                    i11 = 9;
                }
            } else {
                i11 = 8;
            }
            rr0 g02 = g0(i11);
            if (g02 != null) {
                if (g02.b != (r6Var.g() > 0)) {
                    g02.b = r6Var.g() > 0;
                    D1(g02, true);
                }
            }
            if (g02 != null) {
                org.telegram.messenger.g0.r2(g02.h);
                if (g02.h.getLayoutManager() instanceof u4.b0) {
                    tj0 tj0Var = g02.h;
                    O(g02, tj0Var, (u4.b0) tj0Var.getLayoutManager());
                }
            }
            lr0 lr0Var = this.G1;
            if (lr0Var != null) {
                lr0Var.V();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.v5) {
            for (rr0 rr0Var4 : rr0VarArr) {
                if (rr0Var4 != null && rr0Var4.h != null && z0(rr0Var4.F)) {
                    if (!B0() || rr0Var4.h.getAdapter() == null) {
                        for (int i39 = 0; i39 < rr0Var4.h.getChildCount(); i39++) {
                            View childAt3 = rr0Var4.h.getChildAt(i39);
                            if (childAt3 instanceof org.telegram.ui.Cells.n7) {
                                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt3;
                                g6 g6Var = n7Var.O;
                                if (!n7Var.e0 || (ziVar = n7Var.n) == null || (storyItem = ziVar.l) == null || (storyViews = storyItem.views) == null) {
                                    n7Var.M = false;
                                    g6Var.t("", false, true);
                                } else {
                                    int i40 = storyViews.views_count;
                                    n7Var.M = i40 > 0;
                                    g6Var.t(org.telegram.messenger.g0.o0(i40, 0), true, true);
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.r2(rr0Var4.h);
                    }
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.f3) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.T.E(true);
                N1(true);
                N();
                return;
            }
            return;
        }
        int i41 = org.telegram.messenger.hs.g3;
        hs0 hs0Var = this.U;
        if (i3 == i41) {
            if (j10 == 0 || j10 == d2Var.getUserConfig().e()) {
                hs0Var.F(true);
                N1(true);
                N();
                W0();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.s) {
            hs0Var.F(true);
            return;
        }
        if (i3 == org.telegram.messenger.hs.G3) {
            if (((Long) objArr[0]).longValue() == j10) {
                N1(true);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.W3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j10 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            jr0 jr0Var = this.d0;
            if (jr0Var != null) {
                TLRPC.ChatFull chatFull = jr0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i42 = 0; i42 < jr0Var.d.participants.participants.size(); i42++) {
                        jr0Var.d.participants.participants.get(i42).setRank(longValue4, str);
                    }
                }
                for (rr0 rr0Var5 : rr0VarArr) {
                    if (rr0Var5.F == 7) {
                        org.telegram.messenger.g0.b4(rr0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.f1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i43 = 0; i43 < rr0VarArr.length; i43++) {
                if (rr0VarArr[i43].h.getAdapter() == fs0Var) {
                    cq0 cq0Var4 = rr0VarArr[i43].h;
                    ArrayList arrayList6 = fs0Var.n;
                    for (int i44 = 0; i44 < arrayList6.size(); i44++) {
                        org.telegram.messenger.zi ziVar5 = (org.telegram.messenger.zi) arrayList6.get(i44);
                        if (ziVar5 != null && ziVar5.E1() == longValue5) {
                            TLRPC.MessageMedia messageMedia = ziVar5.k.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                org.telegram.messenger.zi.e6(tL_messageMediaPoll, pollResults);
                                fs0Var.g(i44);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tq0 tq0Var = this.L0;
        if (tq0Var != null) {
            canvas.save();
            canvas.translate(tq0Var.getX(), tq0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        oq0 oq0Var = this.U0;
        if (oq0Var != null) {
            int i3 = oq0Var.V;
            if ((i3 == 3 || i3 == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(oq0Var.getX(), oq0Var.getY());
                oq0Var.setDrawOverlay(true);
                oq0Var.draw(canvas);
                oq0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i3;
        if (this.c2 && (view instanceof rr0) && this.g2 < this.e2) {
            canvas.save();
            canvas.clipRect(0, -this.g2, getWidth(), getHeight() + this.f2);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        if (view != this.U0 || this.S0 != null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        rr0[] rr0VarArr = this.n0;
        float top = rr0VarArr[0].getTop();
        yp0 yp0Var = this.c0;
        if (yp0Var != null && ((i3 = rr0VarArr[0].F) == 8 || I0(i3))) {
            top -= yp0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + org.telegram.messenger.g0.L(12.0f));
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    public final void e0(int i3) {
        ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i3 == 0) {
            if (org.telegram.messenger.g0.Q1() || org.telegram.messenger.t0.b.getResources().getConfiguration().orientation != 2) {
                this.D0.setTextSize(20);
            } else {
                this.D0.setTextSize(18);
            }
        }
        if (i3 == 0) {
            this.K.f();
        }
    }

    public final boolean e1(MotionEvent motionEvent, boolean z10) {
        rr0 rr0Var;
        tp0 tp0Var;
        int closestTab = getClosestTab();
        tq0 tq0Var = this.L0;
        int i3 = -1;
        int i10 = tq0Var.P.get(tq0Var.n + (z10 ? 1 : -1), -1);
        yp0 yp0Var = this.c0;
        if (yp0Var != null) {
            if (I0(closestTab) || closestTab == 8) {
                m61 m61Var = yp0Var.b;
                i3 = m61Var.c0.get(m61Var.G + (z10 ? 1 : -1), -1);
            } else if (I0(i10) || i10 == 8) {
                i3 = yp0Var.getCurrentAlbumId();
            }
            if (i3 == 0) {
                i10 = 8;
            } else if (i3 > 0) {
                i10 = v1(i3).a;
            }
        }
        if (i10 >= 0) {
            if (this.q0 == null || I()) {
                this.r0 = l0(0.0f);
                K1(0.0f);
            } else {
                setSearchItemVisibility(H0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!H() || !this.F1 || (getClosestTab() != 8 && !I0(getClosestTab())))) {
                rr0[] rr0VarArr = this.n0;
                rr0 rr0Var2 = rr0VarArr[0];
                if (rr0Var2 != null && rr0Var2.F == 13 && (tp0Var = this.a0) != null) {
                    ai.q3 q3Var = tp0Var.n;
                    if (!z10) {
                    }
                }
                rr0 rr0Var3 = rr0VarArr[0];
                vp0 vp0Var = this.b0;
                if (rr0Var3 != null && rr0Var3.F == 14 && vp0Var != null) {
                    ai.q3 q3Var2 = vp0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.F1 || (rr0Var = rr0VarArr[0]) == null || rr0Var.F != 13) && ((vp0Var == null || !vp0Var.g()) && (yp0Var == null || !yp0Var.f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    tq0Var.setEnabled(false);
                    rr0 rr0Var4 = rr0VarArr[1];
                    rr0Var4.F = i10;
                    rr0Var4.setVisibility(0);
                    this.k1 = z10;
                    z1(true);
                    if (z10) {
                        rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth());
                    } else {
                        rr0VarArr[1].setTranslationX(-rr0VarArr[0].getMeasuredWidth());
                    }
                    X0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String f0(boolean z10) {
        int i3;
        int i10;
        TLRPC.MessageMedia messageMedia;
        tp0 tp0Var;
        if (!B0()) {
            return org.telegram.messenger.bd.M0(2131753014, null);
        }
        if (z10 && (tp0Var = this.a0) != null) {
            return tp0Var.getBotPreviewsSubtitle();
        }
        gr0 gr0Var = this.f0;
        if (gr0Var == null || gr0Var.s == null) {
            i3 = 0;
            i10 = 0;
        } else {
            i3 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < gr0Var.s.i.size(); i11++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) gr0Var.s.i.get(i11);
                TL_stories.StoryItem storyItem = ziVar.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.zi.L4(messageMedia.document)) {
                        i10++;
                    } else if (ziVar.l.media.photo != null) {
                        i3++;
                    }
                }
            }
        }
        if (i3 == 0 && i10 == 0) {
            return org.telegram.messenger.bd.M0(2131753014, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i3 > 0) {
            sb2.append(org.telegram.messenger.bd.G(i3, "Images", new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.bd.G(i10, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final rr0 g0(int i3) {
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i10 >= rr0VarArr.length) {
                return null;
            }
            rr0 rr0Var = rr0VarArr[i10];
            if (rr0Var != null && rr0Var.F == i3) {
                return rr0Var;
            }
            i10++;
        }
    }

    public final void g1(u4.h0 h0Var) {
        if (h0Var instanceof qs0) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (h0Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        fs0 fs0Var = this.Q;
        if (h0Var == fs0Var) {
            fs0Var.r = null;
        }
    }

    public SparseArray<org.telegram.messenger.zi> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        rr0 rr0Var;
        rr0 rr0Var2;
        ei.r6 r6Var;
        ei.r6 r6Var2;
        float f10 = 1.0f;
        rr0[] rr0VarArr = this.n0;
        if (rr0VarArr == null || (rr0Var = rr0VarArr[0]) == null || (rr0Var2 = rr0VarArr[1]) == null || rr0Var.w == null || rr0Var2.w == null) {
            return 1.0f;
        }
        int i3 = rr0Var.F;
        int i10 = rr0Var2.F;
        boolean z10 = I0(i3) || i3 == 8;
        boolean z11 = I0(i10) || i10 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - rr0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - rr0VarArr[1].w.getVisibilityFactor();
        ts0 x12 = x1(rr0VarArr[0].F);
        if (i3 == 8 || (x12 != null && (r6Var2 = x12.s) != null && r6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        ts0 x13 = x1(i10);
        if (i10 != 8 && (x13 == null || (r6Var = x13.s) == null || r6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(rr0VarArr[0].getTranslationX() / rr0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        rr0[] rr0VarArr = this.n0;
        rr0 rr0Var = rr0VarArr[1];
        if (rr0Var != null && rr0Var.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return rr0VarArr[1].F;
            }
            if (Math.abs(rr0VarArr[1].getTranslationX()) < rr0VarArr[1].getMeasuredWidth() / 2.0f) {
                return rr0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public tj0 getCurrentListView() {
        er0 er0Var;
        rr0 rr0Var = this.n0[0];
        int i3 = rr0Var.F;
        return i3 == 13 ? this.a0.getCurrentListView() : i3 == 14 ? this.b0.getCurrentListView() : (i3 != 12 || (er0Var = this.W) == null) ? rr0Var.h : er0Var.a.A0;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.w1[0].q;
    }

    public TextView getSaveItem() {
        return this.t0;
    }

    public org.telegram.ui.ActionBar.q0 getSearchItem() {
        return this.q0;
    }

    public fh0 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        yp0 yp0Var = this.c0;
        if (yp0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = yp0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? v1(currentAlbumId).a : currentTabId;
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
        float f10 = 0.0f;
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i3 >= rr0VarArr.length) {
                return f10;
            }
            rr0 rr0Var = rr0VarArr[i3];
            if (rr0Var != null) {
                f10 = ((1.0f - Math.abs(rr0Var.getTranslationX() / getWidth())) * rr0Var.F) + f10;
            }
            i3++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z6));
        int i3 = org.telegram.ui.ActionBar.k6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.ActionBar.q0 q0Var = this.x0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.w0;
        if (q0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        Drawable[] drawableArr = {this.G0};
        int i10 = org.telegram.ui.ActionBar.k6.y8;
        ImageView imageView = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ui));
        tq0 tq0Var = this.L0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.si));
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.vi));
        oq0 oq0Var = this.U0;
        if (oq0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A7));
        }
        final int i11 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i11 >= rr0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.s6 s6Var = new org.telegram.ui.ActionBar.s6() { // from class: org.telegram.ui.Components.kp0
                @Override // org.telegram.ui.ActionBar.s6
                public final void b() {
                    rr0[] rr0VarArr2 = ws0.this.n0;
                    int i12 = i11;
                    cq0 cq0Var = rr0VarArr2[i12].h;
                    if (cq0Var != null) {
                        int childCount = cq0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = rr0VarArr2[i12].h.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.o7) {
                                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                                for (int i14 = 0; i14 < 6; i14++) {
                                    o7Var.a[i14].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                                ((org.telegram.ui.Cells.f6) childAt).y(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.s6
                public final /* synthetic */ void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
            int i12 = org.telegram.ui.ActionBar.k6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.n6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.U7));
            int i13 = org.telegram.ui.ActionBar.k6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
            int i14 = org.telegram.ui.ActionBar.k6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.o7.class}, (Paint) null, (Drawable[]) null, s6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.o7.class}, (Paint) null, (Drawable[]) null, s6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, s6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, s6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
            i11++;
        }
    }

    public int getTopPanelShift() {
        return this.p2;
    }

    public final int h0(int i3, int i10, boolean z10) {
        int i11 = i10 + (!z10 ? 1 : -1);
        if (i11 > 6) {
            i11 = !z10 ? 9 : 6;
        }
        return Utilities.j(i11, 9, (this.n1 && i3 == 1) ? 1 : 2);
    }

    public final void h1() {
        int i3;
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i10 >= rr0VarArr.length) {
                return;
            }
            cq0 cq0Var = rr0VarArr[i10].h;
            if (cq0Var != null) {
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < cq0Var.getChildCount(); i13++) {
                    View childAt = cq0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.n7) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                        int messageId = n7Var.getMessageId();
                        i12 = n7Var.getTop();
                        i11 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        int f12 = g7Var.getMessage().f1();
                        i12 = g7Var.getTop();
                        i11 = f12;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        i11 = f7Var.getMessage().f1();
                        i12 = f7Var.getTop();
                    }
                    if (i11 != 0) {
                        break;
                    }
                }
                if (i11 != 0) {
                    int i14 = rr0VarArr[i10].F;
                    int i15 = -1;
                    if (z0(i14)) {
                        ts0 x12 = x1(i14);
                        if (x12 != null && x12.s != null) {
                            int i16 = 0;
                            while (true) {
                                if (i16 >= x12.s.i.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.zi) x12.s.i.get(i16)).f1()) {
                                    i15 = i16;
                                    break;
                                }
                                i16++;
                            }
                        }
                        i3 = i15;
                    } else if (i14 >= 0) {
                        ls0[] ls0VarArr = this.w1;
                        if (i14 < ls0VarArr.length) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= ls0VarArr[i14].a.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.zi) ls0VarArr[i14].a.get(i17)).f1()) {
                                    i15 = i17;
                                    break;
                                }
                                i17++;
                            }
                            i3 = ls0VarArr[i14].m + i15;
                        }
                    }
                    if (i15 >= 0) {
                        ((u4.b0) cq0Var.getLayoutManager()).h1(i3, (-rr0VarArr[i10].h.getPaddingTop()) + i12);
                        if (this.r1) {
                            rr0 rr0Var = rr0VarArr[i10];
                            rr0Var.r.h1(i3, (-rr0Var.h.getPaddingTop()) + i12);
                        }
                    }
                }
            }
            i10++;
        }
    }

    public final int i0(boolean z10) {
        return this.b2 + this.f2 + (z10 ? org.telegram.messenger.g0.L(52.0f) : 0);
    }

    public final void i1(int i3) {
        tq0 tq0Var;
        if (this.P1 || (tq0Var = this.L0) == null) {
            return;
        }
        tq0Var.g(null, i3, tq0Var.Q.get(i3));
    }

    public final int j0(int i3) {
        return n0(i3) + org.telegram.messenger.g0.L(54.0f) + this.d2 + this.e2 + this.p2 + (i3 == 9 ? org.telegram.messenger.g0.L(64.0f) : 0);
    }

    public final void j1(float f10, int i3) {
        tq0 tq0Var = this.L0;
        if (tq0Var != null) {
            tq0Var.i(f10, I0(i3) ? 8 : i3);
        }
        yp0 yp0Var = this.c0;
        if (yp0Var != null) {
            m61 m61Var = yp0Var.b;
            if (I0(i3)) {
                m61Var.f(f10, u1(i3));
            } else if (i3 == 8) {
                m61Var.f(f10, 0);
            }
        }
    }

    public final float k0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        rr0[] rr0VarArr = this.n0;
        rr0 rr0Var = rr0VarArr[1];
        if (rr0Var != null && v0(rr0Var.F)) {
            f11 = 0.0f + f10;
        }
        rr0 rr0Var2 = rr0VarArr[0];
        return (rr0Var2 == null || !v0(rr0Var2.F)) ? f11 : (1.0f - f10) + f11;
    }

    public final void k1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i3 >= rr0VarArr.length) {
                if (this.G == 0) {
                    jr0 jr0Var = this.d0;
                    jr0Var.d = chatFull;
                    jr0Var.e = arrayList;
                }
                N1(true);
                for (int i10 = 0; i10 < rr0VarArr.length; i10++) {
                    rr0 rr0Var = rr0VarArr[i10];
                    if (rr0Var.F == 7 && rr0Var.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(rr0VarArr[i10].h);
                    }
                }
                return;
            }
            rr0 rr0Var2 = rr0VarArr[i3];
            if (rr0Var2.F == 7 && rr0Var2.h.getAdapter() != null && rr0VarArr[i3].h.getAdapter().b() != 0 && this.y1.getMessagesController().P1().j.size() > 0) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        rr0[] rr0VarArr = this.n0;
        rr0 rr0Var = rr0VarArr[1];
        if (rr0Var != null && E0(rr0Var.F) && rr0VarArr[1].F != 11) {
            f11 = 0.0f + f10;
        }
        rr0 rr0Var2 = rr0VarArr[0];
        return (rr0Var2 == null || !E0(rr0Var2.F) || rr0VarArr[0].F == 11) ? f11 : (1.0f - f10) + f11;
    }

    public final void l1(int i3, int i10, int i11, int i12) {
        this.c2 = true;
        this.d2 = i3;
        this.e2 = i10;
        this.f2 = i11;
        this.b2 = i12;
        G();
        vp0 vp0Var = this.b0;
        if (vp0Var != null) {
            if (vp0Var.M != i10 || vp0Var.N != i11) {
                vp0Var.M = i10;
                vp0Var.N = i11;
                vp0Var.setClipChildren(i10 == 0 && i11 == 0);
                vp0Var.h.setClipChildren(i10 == 0 && i11 == 0);
                vp0Var.n();
            }
            F1();
        }
        for (rr0 rr0Var : this.n0) {
            if (rr0Var != null) {
                rr0Var.setClipChildren(false);
                H1(rr0Var);
                setPageOverscan(rr0Var.h);
                setPageOverscan(rr0Var.n);
                int paddingTop = rr0Var.h.getPaddingTop();
                cq0 cq0Var = rr0Var.h;
                int paddingLeft = cq0Var.getPaddingLeft();
                cq0 cq0Var2 = rr0Var.h;
                int j02 = j0(rr0Var.F);
                cq0Var2.h3 = j02;
                int paddingRight = rr0Var.h.getPaddingRight();
                cq0 cq0Var3 = rr0Var.h;
                int i02 = i0(H0());
                cq0Var3.i3 = i02;
                cq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - rr0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(rr0Var.h, new dp0(rr0Var, paddingTop2, 1));
                }
                rr0Var.w.setPadding(0, i3, 0, i12);
                er0 er0Var = this.W;
                if (er0Var != null && er0Var.getParent() == rr0Var) {
                    n1(org.telegram.messenger.g0.L(56.0f) + i3, er0Var);
                }
                tp0 tp0Var = this.a0;
                if (tp0Var != null && tp0Var.getParent() == rr0Var) {
                    n1(i3, tp0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return false;
    }

    public final int m0(int i3) {
        ts0 x12;
        ei.r6 r6Var;
        if (!z0(i3) || (x12 = x1(i3)) == null || (r6Var = x12.s) == null) {
            return 0;
        }
        return r6Var.g();
    }

    public final void m1(int i3, boolean z10) {
        this.D0.a(i3, z10);
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        if (y4Var != null) {
            y4Var.x(i3, z10);
        }
    }

    public final int n0(int i3) {
        yp0 yp0Var = this.c0;
        return (int) ((yp0Var == null || !(I0(i3) || i3 == 8)) ? 0.0f : yp0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f));
    }

    public void o1(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        this.F1 = z10;
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        if (y4Var != null) {
            if (z10) {
                M1();
                y4Var.B();
            } else {
                y4Var.r();
            }
            R(true, true);
            return;
        }
        AnimatorSet animatorSet = this.R1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        LinearLayout linearLayout = this.E0;
        if (z10) {
            linearLayout.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.R1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.R1.setDuration(180L);
        this.R1.addListener(new s9(19, this, z10));
        this.R1.start();
        if (z10) {
            M1();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i3 >= rr0VarArr.length) {
                return;
            }
            cq0 cq0Var = rr0VarArr[i3].h;
            if (cq0Var != null) {
                cq0Var.getViewTreeObserver().addOnPreDrawListener(new zq0(this, i3, 0));
            }
            i3++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return T() || this.L0.I || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        lr0 lr0Var = this.G1;
        int height = lr0Var.f() != null ? lr0Var.f().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i3;
            } else if (childAt instanceof rr0) {
                i11 = i3;
                measureChildWithMargins(childAt, i11, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                cq0 cq0Var = ((rr0) childAt).h;
                cq0Var.setPadding(0, cq0Var.f3, 0, cq0Var.g3);
            } else {
                i11 = i3;
                i12 = i10;
                measureChildWithMargins(childAt, i11, 0, i12, 0);
                i13++;
                i3 = i11;
                i10 = i12;
            }
            i12 = i10;
            i13++;
            i3 = i11;
            i10 = i12;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.P1) {
            org.telegram.ui.ActionBar.d2 d2Var = this.y1;
            if (d2Var.getParentLayout() != null && !((ActionBarLayout) d2Var.getParentLayout()).i() && !T() && !this.a) {
                if (motionEvent != null) {
                    if (this.E1 == null) {
                        this.E1 = VelocityTracker.obtain();
                    }
                    this.E1.addMovement(motionEvent);
                    gi.l3 l3Var = this.H1;
                    if (l3Var != null) {
                        l3Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= org.telegram.messenger.g0.L(90.0f) + this.d2) {
                        this.z1 = motionEvent.getPointerId(0);
                        this.B1 = true;
                        this.C1 = (int) motionEvent.getX();
                        this.D1 = (int) motionEvent.getY();
                        this.E1.clear();
                        return this.A1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.z1) {
                    int x10 = (int) (motionEvent.getX() - this.C1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.D1);
                    boolean z11 = this.A1;
                    rr0[] rr0VarArr = this.n0;
                    if (z11 && (((z10 = this.k1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!e1(motionEvent, x10 < 0)) {
                            this.B1 = true;
                            this.A1 = false;
                            rr0VarArr[0].setTranslationX(0.0f);
                            rr0VarArr[1].setTranslationX(this.k1 ? rr0VarArr[0].getMeasuredWidth() : -rr0VarArr[0].getMeasuredWidth());
                            j1(0.0f, rr0VarArr[1].F);
                            X0(getTabProgress());
                        }
                    }
                    if (!this.B1 || this.A1) {
                        if (this.A1) {
                            rr0VarArr[0].setTranslationX(x10);
                            if (this.k1) {
                                rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                rr0VarArr[1].setTranslationX(x10 - rr0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / rr0VarArr[0].getMeasuredWidth();
                            if (I()) {
                                this.r0 = l0(abs2);
                                K1(abs2);
                                float k02 = k0(abs2);
                                this.s0 = k02;
                                this.u0.setVisibility((k02 == 0.0f || !I() || A0()) ? 4 : 0);
                            } else {
                                this.r0 = 0.0f;
                            }
                            G1(false);
                            j1(abs2, rr0VarArr[1].F);
                            X0(getTabProgress());
                            W0();
                        }
                    } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                        e1(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    t1(motionEvent);
                }
                return this.A1;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p1(int i3, boolean z10) {
        int i10;
        rr0 g02;
        if (z10 && getY() != 0.0f && this.F == 1) {
            return;
        }
        if (z10 && z0(i3) && m0(i3) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.m1);
        bundle.putLong("topic_id", this.G);
        ls0[] ls0VarArr = this.w1;
        if (z10 && (g02 = g0(0)) != null) {
            ArrayList arrayList = ls0VarArr[0].e;
            int L0 = g02.x.L0();
            if (L0 >= 0) {
                wr0 wr0Var = null;
                if (arrayList != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((wr0) arrayList.get(i11)).b) {
                            wr0Var = (wr0) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (wr0Var == null) {
                        wr0Var = (wr0) k2.p1.h(1, arrayList);
                    }
                }
                if (wr0Var != null) {
                    i10 = wr0Var.c;
                    if (i3 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i3 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.i8 i8Var = new org.telegram.ui.i8(ls0VarArr[0].q, i10, bundle);
                    i8Var.N = new nh(this, 5);
                    this.y1.presentFragment(i8Var);
                }
            }
        }
        i10 = 0;
        if (i3 != 9) {
        }
        org.telegram.ui.i8 i8Var2 = new org.telegram.ui.i8(ls0VarArr[0].q, i10, bundle);
        i8Var2.N = new nh(this, 5);
        this.y1.presentFragment(i8Var2);
    }

    public final float q0(int i3, boolean z10) {
        float width = getWidth();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i10 >= rr0VarArr.length) {
                break;
            }
            rr0 rr0Var = rr0VarArr[i10];
            if (rr0Var != null) {
                int i12 = rr0Var.F;
                if ((z10 && i3 == 8 && I0(i12)) || i12 == i3) {
                    i11++;
                    width = rr0VarArr[i10].getTranslationX();
                }
            }
            i10++;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void q1(int i3) {
        int u12 = u1(getClosestTab());
        yp0 yp0Var = this.c0;
        if (u12 != i3) {
            if (yp0Var != null) {
                yp0Var.b.d(i3, yp0Var.d.i(i3));
                return;
            }
            return;
        }
        yp0Var.setReorderingAlbums(true);
        vs0 v12 = v1(i3);
        rr0 g02 = g0(v12.a);
        if (g02 == null) {
            return;
        }
        cq0 cq0Var = g02.h;
        for (int i10 = 0; i10 < cq0Var.getChildCount(); i10++) {
            View childAt = cq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.n7) {
                ((org.telegram.ui.Cells.n7) childAt).l(true, true);
            }
        }
        us0 us0Var = v12.c;
        if (us0Var != null && !us0Var.y) {
            us0Var.y = true;
        }
        G1(true);
    }

    public final float r0(int i3, boolean z10) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i10 >= rr0VarArr.length) {
                return f10;
            }
            rr0 rr0Var = rr0VarArr[i10];
            if (rr0Var != null) {
                int i11 = rr0Var.F;
                if ((z10 && i3 == 8 && I0(i11)) || i11 == i3) {
                    f10 = (1.0f - Math.abs(rr0VarArr[i10].getTranslationX() / getWidth())) + f10;
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1(boolean z10) {
        rr0[] rr0VarArr;
        rr0 rr0Var;
        if (this.r1) {
            return;
        }
        int i3 = 0;
        while (true) {
            rr0VarArr = this.n0;
            if (i3 >= rr0VarArr.length) {
                rr0Var = null;
                break;
            }
            int i10 = rr0VarArr[i3].F;
            if (i10 == 0 || z0(i10)) {
                break;
            } else {
                i3++;
            }
        }
        if (rr0Var != null) {
            int i11 = rr0Var.F;
            this.s1 = i11;
            boolean z02 = z0(i11);
            int[] iArr = this.p1;
            int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], z10);
            this.t1 = h02;
            if (h02 != iArr[z02 ? 1 : 0]) {
                if (this.n1 && z0(this.s1)) {
                    return;
                }
                rr0Var.n.setVisibility(0);
                if (z0(this.s1)) {
                    rr0Var.n.setAdapter(y1(this.s1));
                } else {
                    rr0Var.n.setAdapter(this.L);
                }
                qr0 qr0Var = rr0Var.n;
                qr0Var.setPadding(qr0Var.getPaddingLeft(), j0(this.s1), rr0Var.n.getPaddingRight(), i0(H0()));
                rr0Var.r.y1(h02);
                rr0Var.n.a0();
                rr0Var.r.O = new rq0(this, rr0Var, 0);
                org.telegram.messenger.g0.b4(rr0Var.h);
                this.r1 = true;
                if (this.s1 == 0) {
                    this.w1[0].g(true);
                }
                this.q1 = 0.0f;
                if (this.s < 0) {
                    h1();
                    return;
                }
                for (rr0 rr0Var2 : rr0VarArr) {
                    if (rr0Var2.F == this.s1) {
                        rr0Var2.r.h1(this.s, this.w - rr0Var2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    public final int s0(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.I1;
        return e6Var != null ? e6Var.h(i3) : org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    public final void s1() {
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i3 >= rr0VarArr.length) {
                return;
            }
            int childCount = rr0VarArr[i3].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = rr0VarArr[i3].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                    if (i3 == 0) {
                        photoImage.u0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.u0 = false;
                        photoImage.Q0();
                    }
                }
            }
            i3++;
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.g1;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.g1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f1 == 0) {
                this.f1 = -j10;
                int i3 = 0;
                while (true) {
                    ls0[] ls0VarArr = this.w1;
                    if (i3 >= ls0VarArr.length) {
                        break;
                    }
                    if (ls0VarArr[i3].b[1].size() == 0) {
                        ls0 ls0Var = ls0VarArr[i3];
                        ls0Var.j[1] = this.g1.migrated_from_max_id;
                        ls0Var.i[1] = false;
                    }
                    i3++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        tq0 tq0Var = this.L0;
        if (tq0Var != null) {
            tq0Var.setInitialTabId(A0() ? 9 : 8);
        }
        N1(true);
        z1(false);
    }

    public void setCommonGroupsCount(int i3) {
        if (this.G == 0) {
            this.a1[6] = i3;
        }
        N1(true);
        N();
    }

    public void setForwardRestrictedHint(gi.l3 l3Var) {
        this.H1 = l3Var;
    }

    public void setMergeDialogId(long j10) {
        this.f1 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i3 = 0;
        while (true) {
            iArr2 = this.a1;
            if (i3 > 6 || iArr2[i3] >= 0) {
                break;
            } else {
                i3++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        N1(true);
        N();
        if (iArr2[0] >= 0) {
            L0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.k2 = runnable;
    }

    @Override // android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.O1 = i10;
        int i13 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i13 >= rr0VarArr.length) {
                break;
            }
            rr0VarArr[i13].setTranslationY(this.O1);
            i13++;
        }
        if (this.S0 != null) {
            U();
        } else {
            oq0 oq0Var = this.U0;
            if (oq0Var != null) {
                oq0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.R0 = i10;
        org.telegram.ui.Cells.t0 t0Var = this.N0;
        t0Var.setTranslationY((t0Var.getTag() == null ? -org.telegram.messenger.g0.L(48.0f) : 0) + this.R0);
    }

    public void setPagesGlassEngine(pi.q qVar) {
        this.h2 = qVar;
        vp0 vp0Var = this.b0;
        if (vp0Var != null) {
            vp0Var.setGlassEngine(qVar);
        }
        for (rr0 rr0Var : this.n0) {
            if (rr0Var != null) {
                rr0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(rr0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i3) {
        if (this.b2 != i3) {
            this.b2 = i3;
            rr0[] rr0VarArr = this.n0;
            if (rr0VarArr != null) {
                for (rr0 rr0Var : rr0VarArr) {
                    if (rr0Var != null) {
                        cq0 cq0Var = rr0Var.h;
                        int paddingLeft = cq0Var.getPaddingLeft();
                        cq0 cq0Var2 = rr0Var.h;
                        int i10 = cq0Var2.f3;
                        int paddingRight = cq0Var2.getPaddingRight();
                        cq0 cq0Var3 = rr0Var.h;
                        int i02 = i0(H0());
                        cq0Var3.i3 = i02;
                        cq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i3) {
        if (this.g2 != i3) {
            this.g2 = i3;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i3 >= rr0VarArr.length) {
                return;
            }
            D1(rr0VarArr[i3], true);
            i3++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.h1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.h1 = userFull;
        N1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        i1(8);
    }

    public void setVisibleHeight(int i3) {
        this.Q1 = i3;
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.n0;
            if (i10 >= rr0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i3, org.telegram.messenger.g0.L(rr0VarArr[i10].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            rr0VarArr[i10].w.setTranslationY(f10);
            rr0VarArr[i10].s.setTranslationY(-f10);
            i10++;
        }
        tp0 tp0Var = this.a0;
        if (tp0Var != null) {
            tp0Var.setVisibleHeight(i3);
        }
        vp0 vp0Var = this.b0;
        if (vp0Var != null) {
            vp0Var.setVisibleHeight(i3);
        }
    }

    public final boolean t0() {
        return this.y1.getConnectionsManager().getConnectionState() == 3;
    }

    public final void t1(MotionEvent motionEvent) {
        float f10;
        float f11;
        float measuredWidth;
        VelocityTracker velocityTracker = this.E1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(1000, this.V0);
        int i3 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            f10 = this.E1.getXVelocity();
            f11 = this.E1.getYVelocity();
            if (!this.A1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                e1(motionEvent, f10 < 0.0f);
            }
        }
        if (this.A1) {
            rr0[] rr0VarArr = this.n0;
            float x10 = rr0VarArr[0].getX();
            this.i1 = new AnimatorSet();
            this.l1 = Math.abs(x10) < ((float) rr0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new y50(this, 19));
            boolean z10 = this.l1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.k1) {
                    this.i1.playTogether(ObjectAnimator.ofFloat(rr0VarArr[0], (Property<rr0, Float>) property, 0.0f), ObjectAnimator.ofFloat(rr0VarArr[1], (Property<rr0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.i1.playTogether(ObjectAnimator.ofFloat(rr0VarArr[0], (Property<rr0, Float>) property, 0.0f), ObjectAnimator.ofFloat(rr0VarArr[1], (Property<rr0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = rr0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.k1) {
                    this.i1.playTogether(ObjectAnimator.ofFloat(rr0VarArr[0], (Property<rr0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(rr0VarArr[1], (Property<rr0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.i1.playTogether(ObjectAnimator.ofFloat(rr0VarArr[0], (Property<rr0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(rr0VarArr[1], (Property<rr0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.i1.setInterpolator(u2);
            int measuredWidth2 = getMeasuredWidth();
            float f12 = measuredWidth2 / 2;
            float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
            this.i1.setDuration(Math.max(org.telegram.messenger.hs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.i1.addListener(new wq0(this, i3));
            this.i1.start();
            this.j1 = true;
            this.A1 = false;
            W0();
        } else {
            this.B1 = false;
            setHeaderEnabled(true);
            this.L0.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.E1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.E1 = null;
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.ui.ActionBar.d2 d2Var = this.y1;
        if (d2Var != null && d2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            d2Var.getOrCreateStoryViewer().getClass();
            ei.r9 orCreateStoryViewer = d2Var.getOrCreateStoryViewer();
            Context context = d2Var.getContext();
            long dialogId = t2Var.getDialogId();
            ei.i7 a10 = ei.i7.a((tj0) t2Var.getParent());
            a10.s += ((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).s1) ? org.telegram.messenger.g0.L(68.0f) : 0;
            orCreateStoryViewer.R(context, dialogId, a10);
        }
    }

    public final boolean u0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.zi ziVar;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i3 = 1; i3 >= 0; i3--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.c1;
                if (i10 >= sparseArrayArr[i3].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i3].keyAt(i10)));
                i10++;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (ziVar = (org.telegram.messenger.zi) sparseArrayArr[i3].get(num.intValue())) != null && (message = ziVar.k) != null && message.noforwards) {
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

    public final int u1(int i3) {
        vs0 w12 = w1(i3);
        if (w12 == null) {
            return -1;
        }
        return w12.b;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.J1.a(s0(org.telegram.ui.ActionBar.k6.d6));
            org.telegram.ui.ActionBar.w1 w1Var = this.G0;
            if (w1Var != null) {
                w1Var.a(s0(org.telegram.ui.ActionBar.k6.y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.k6.y8));
            }
            B1();
            invalidate();
            for (rr0 rr0Var : this.n0) {
                if (rr0Var != null && rr0Var.M) {
                    rr0Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean v0(int i3) {
        if (i3 == 0) {
            return true;
        }
        if (((i3 == 8 || I0(i3)) && TextUtils.isEmpty(getStoriesHashtag())) || i3 == 9 || i3 == 11 || i3 == 13) {
            return true;
        }
        return i3 == 14 && this.b0 != null;
    }

    public final vs0 v1(int i3) {
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = this.m2;
        vs0 vs0Var = (vs0) hashMap.get(valueOf);
        if (vs0Var != null) {
            return vs0Var;
        }
        vs0 vs0Var2 = new vs0(this, getContext(), i3);
        hashMap.put(Integer.valueOf(i3), vs0Var2);
        this.n2.put(Integer.valueOf(vs0Var2.a), Integer.valueOf(i3));
        return vs0Var2;
    }

    public final void w0() {
        org.telegram.messenger.g0.r(this.P0);
        org.telegram.ui.Cells.t0 t0Var = this.N0;
        if (t0Var.getTag() == null) {
            return;
        }
        t0Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.Cells.t0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.Cells.t0, Float>) View.TRANSLATION_Y, (-org.telegram.messenger.g0.L(48.0f)) + this.R0));
        this.O0.setInterpolator(xq.g);
        this.O0.addListener(new wq0(this, 0));
        this.O0.start();
    }

    public final vs0 w1(int i3) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i3));
        if (num == null) {
            return null;
        }
        return (vs0) this.m2.get(num);
    }

    public boolean x0() {
        return false;
    }

    public final ts0 x1(int i3) {
        vs0 w12;
        if (i3 == 8) {
            return this.f0;
        }
        if (i3 == 9) {
            return this.h0;
        }
        if (!I0(i3) || (w12 = w1(i3)) == null) {
            return null;
        }
        return w12.c;
    }

    public boolean y0() {
        return !(this instanceof k20);
    }

    public final ts0 y1(int i3) {
        vs0 w12;
        if (i3 == 8) {
            return this.g0;
        }
        if (i3 == 9) {
            return this.i0;
        }
        if (!I0(i3) || (w12 = w1(i3)) == null) {
            return null;
        }
        return w12.d;
    }

    public final void z(View view) {
        rr0[] rr0VarArr = this.n0;
        addView(view, Math.max(indexOfChild(rr0VarArr[0]), indexOfChild(rr0VarArr[1])) + 1, b8.mf.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final void z1(boolean z10) {
        rr0[] rr0VarArr;
        rr0[] rr0VarArr2;
        org.telegram.ui.ActionBar.q0 q0Var;
        u4.v0 v0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        u4.v0 v0Var2;
        int i3;
        int i10;
        int i11;
        boolean z14;
        u4.v0 v0Var3;
        int i12;
        int i13;
        boolean z15;
        u4.v0 v0Var4;
        vp0 vp0Var = this.b0;
        if (vp0Var != null) {
            vp0Var.i();
        }
        int i14 = 0;
        while (true) {
            rr0VarArr = this.n0;
            if (i14 >= rr0VarArr.length) {
                break;
            }
            rr0VarArr[i14].h.C0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rr0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(N0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        u4.h0 adapter = rr0VarArr[z10 ? 1 : 0].h.getAdapter();
        u4.h0 h0Var = this.f0;
        u4.y yVar = this.e0;
        if (adapter == h0Var) {
            yVar.h(null);
        }
        boolean z16 = this.Y0;
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        lr0 lr0Var = this.G1;
        org.telegram.ui.ActionBar.k kVar = this.H;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.q0;
        fs0 fs0Var = this.Q;
        int i15 = 100;
        if (z16 && this.X0) {
            rr0 rr0Var = rr0VarArr[z10 ? 1 : 0];
            if (rr0Var.f == null) {
                rr0Var.f = new u4.v0();
            }
            rr0 rr0Var2 = rr0VarArr[z10 ? 1 : 0];
            u4.v0 v0Var5 = rr0Var2.f;
            is0 is0Var = this.V;
            pr0 pr0Var = this.m0;
            tr0 tr0Var = this.k0;
            tr0 tr0Var2 = this.l0;
            tr0 tr0Var3 = this.j0;
            if (z10) {
                int i16 = rr0Var2.F;
                if (i16 != 0) {
                    v0Var4 = v0Var5;
                    if (i16 != 2 && i16 != 5 && i16 != 6 && (i16 != 7 || lr0Var.X())) {
                        String obj = q0Var2 != null ? q0Var2.getSearchField().getText().toString() : "";
                        int i17 = rr0VarArr[z10 ? 1 : 0].F;
                        if (i17 == 1) {
                            if (tr0Var3 != null) {
                                tr0Var3.G(obj, false);
                                if (adapter != tr0Var3) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var3);
                                }
                            }
                        } else if (i17 == 3) {
                            if (tr0Var2 != null) {
                                tr0Var2.G(obj, false);
                                if (adapter != tr0Var2) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var2);
                                }
                            }
                        } else if (i17 == 4) {
                            if (tr0Var != null) {
                                tr0Var.G(obj, false);
                                if (adapter != tr0Var) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var);
                                }
                            }
                        } else if (i17 == 7) {
                            if (pr0Var != null) {
                                pr0Var.F(obj, false);
                                if (adapter != pr0Var) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(pr0Var);
                                }
                            }
                        } else if (i17 == 11) {
                            if (is0Var != null) {
                                is0Var.E(this.Z0, obj);
                                if (adapter != is0Var) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(is0Var);
                                }
                            }
                        } else if (i17 == 15 && fs0Var != null && adapter != fs0Var) {
                            g1(adapter);
                            cq0 cq0Var = rr0VarArr[z10 ? 1 : 0].h;
                            fs0Var.r = cq0Var;
                            cq0Var.setAdapter(fs0Var);
                        }
                    }
                }
                this.Y0 = false;
                qq0 qq0Var = this.M0;
                if (qq0Var != null) {
                    qq0Var.g(false);
                }
                this.X0 = false;
                z1(true);
                return;
            }
            v0Var4 = v0Var5;
            if (rr0Var2.h != null) {
                int i18 = rr0Var2.F;
                if (i18 == 1) {
                    if (adapter != tr0Var3) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var3);
                    }
                    tr0Var3.f();
                } else if (i18 == 3) {
                    if (adapter != tr0Var2) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var2);
                    }
                    tr0Var2.f();
                } else if (i18 == 4) {
                    if (adapter != tr0Var) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var);
                    }
                    tr0Var.f();
                } else if (i18 == 7) {
                    if (adapter != pr0Var) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(pr0Var);
                    }
                    pr0Var.f();
                } else if (i18 == 11) {
                    if (adapter != is0Var) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(is0Var);
                    }
                    is0Var.f();
                }
            }
            rr0VarArr2 = rr0VarArr;
            q0Var = q0Var2;
            v0Var3 = v0Var4;
            i10 = 4;
            z13 = false;
            z14 = false;
            i11 = 8;
        } else {
            rr0 rr0Var3 = rr0VarArr[z10 ? 1 : 0];
            if (rr0Var3.e == null) {
                rr0Var3.e = new u4.v0();
            }
            rr0 rr0Var4 = rr0VarArr[z10 ? 1 : 0];
            u4.v0 v0Var6 = rr0Var4.e;
            rr0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = rr0VarArr[z10 ? 1 : 0].F;
            if (i19 == 8 || I0(i19)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(N0());
            }
            cq0 cq0Var2 = rr0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = cq0Var2.getPaddingLeft();
            rr0 rr0Var5 = rr0VarArr[z10 ? 1 : 0];
            rr0VarArr2 = rr0VarArr;
            cq0 cq0Var3 = rr0Var5.h;
            int j02 = j0(rr0Var5.F);
            cq0Var3.h3 = j02;
            int paddingRight = rr0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            cq0 cq0Var4 = rr0VarArr2[z10 ? 1 : 0].h;
            q0Var = q0Var2;
            int i02 = i0(H0());
            cq0Var4.i3 = i02;
            cq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i20 = rr0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.p1;
            u4.h0 h0Var2 = this.N;
            View view = this.a0;
            hs0 hs0Var = this.U;
            kr0 kr0Var = this.S;
            er0 er0Var = this.W;
            ls0[] ls0VarArr = this.w1;
            if (i20 == 0) {
                u4.h0 h0Var3 = this.K;
                if (adapter != h0Var3) {
                    g1(adapter);
                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i21 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                ls0 ls0Var = ls0VarArr[0];
                boolean z17 = ls0Var.h && !ls0Var.e.isEmpty();
                i15 = iArr[0];
                rr0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                ls0 ls0Var2 = ls0VarArr[0];
                if (ls0Var2.x == null) {
                    ls0Var2.x = new u4.v0();
                }
                v0Var = ls0VarArr[0].x;
                z13 = z17;
                z11 = false;
            } else {
                if (i20 == 1) {
                    ls0 ls0Var3 = ls0VarArr[1];
                    z12 = ls0Var3.h && !ls0Var3.e.isEmpty();
                    if (adapter != h0Var2) {
                        g1(adapter);
                        rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i20 == 2) {
                    ls0 ls0Var4 = ls0VarArr[2];
                    z12 = ls0Var4.h && !ls0Var4.e.isEmpty();
                    u4.h0 h0Var4 = this.O;
                    if (adapter != h0Var4) {
                        g1(adapter);
                        rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var4);
                    }
                } else {
                    if (i20 == 3) {
                        u4.h0 h0Var5 = this.M;
                        if (adapter != h0Var5) {
                            g1(adapter);
                            rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var5);
                        }
                    } else if (i20 == 4) {
                        ls0 ls0Var5 = ls0VarArr[4];
                        z12 = ls0Var5.h && !ls0Var5.e.isEmpty();
                        u4.h0 h0Var6 = this.P;
                        if (adapter != h0Var6) {
                            g1(adapter);
                            rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var6);
                        }
                    } else {
                        if (i20 == 5) {
                            u4.h0 h0Var7 = this.R;
                            if (adapter != h0Var7) {
                                g1(adapter);
                                rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var7);
                            }
                        } else if (i20 == 15) {
                            if (adapter != fs0Var) {
                                g1(adapter);
                                cq0 cq0Var5 = rr0VarArr2[z10 ? 1 : 0].h;
                                fs0Var.r = cq0Var5;
                                cq0Var5.setAdapter(fs0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != kr0Var) {
                                g1(adapter);
                                rr0VarArr2[z10 ? 1 : 0].h.setAdapter(kr0Var);
                            }
                        } else if (i20 == 7) {
                            u4.h0 h0Var8 = this.d0;
                            if (adapter != h0Var8) {
                                g1(adapter);
                                rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var8);
                            }
                        } else if (z0(i20)) {
                            u4.h0 x12 = x1(rr0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != x12) {
                                g1(adapter);
                                rr0VarArr2[z10 ? 1 : 0].h.setAdapter(x12);
                                rr0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            rr0 rr0Var6 = rr0VarArr2[z10 ? 1 : 0];
                            if (rr0Var6.F != 9) {
                                yVar.h(rr0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = rr0VarArr2[z10 ? 1 : 0].F;
                            if (i22 == 10) {
                                u4.h0 h0Var9 = this.T;
                                if (adapter != h0Var9) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var9);
                                }
                            } else if (i22 == 11) {
                                if (adapter != hs0Var) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(hs0Var);
                                    u4.y yVar2 = hs0Var.w;
                                    cq0 cq0Var6 = rr0VarArr2[z10 ? 1 : 0].h;
                                    hs0Var.s = cq0Var6;
                                    yVar2.h(cq0Var6);
                                }
                                v0Var = hs0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (er0Var.getParent() != rr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(er0Var);
                                    rr0VarArr2[z10 ? 1 : 0].addView(er0Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    n1(org.telegram.messenger.g0.L(56.0f) + this.d2, er0Var);
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != rr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    rr0VarArr2[z10 ? 1 : 0].addView(view);
                                    n1(this.d2, view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vp0Var != null && vp0Var.getParent() != rr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(vp0Var);
                                    rr0VarArr2[z10 ? 1 : 0].addView(vp0Var);
                                    rr0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        v0Var = v0Var6;
                        z11 = false;
                        z13 = false;
                    }
                    v0Var = v0Var6;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                v0Var = v0Var6;
                z11 = true;
            }
            I1(rr0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                rr0VarArr2[z10 ? 1 : 0].h.setSections(false);
                v0Var2 = v0Var;
            } else {
                cq0 cq0Var7 = rr0VarArr2[z10 ? 1 : 0].h;
                cq0Var7.getClass();
                v0Var2 = v0Var;
                org.telegram.ui.ActionBar.r6.m(cq0Var7, 20, org.telegram.ui.ActionBar.k6.i6, cq0Var7.o2);
                cq0Var7.U2 = false;
                cq0Var7.I2 = null;
                cq0Var7.J2 = null;
                cq0Var7.M2 = 0.0f;
                cq0Var7.N2 = null;
                cq0Var7.O2 = null;
                cq0Var7.K2 = null;
                dj0 dj0Var = cq0Var7.H2;
                if (dj0Var != null) {
                    cq0Var7.q0(dj0Var);
                    cq0Var7.H2 = null;
                }
                p9 p9Var = cq0Var7.S2;
                if (p9Var != null) {
                    cq0Var7.q0(p9Var);
                    cq0Var7.S2 = null;
                }
            }
            H1(rr0VarArr2[z10 ? 1 : 0]);
            rr0 rr0Var7 = rr0VarArr2[z10 ? 1 : 0];
            if (rr0Var7.F == 11) {
                rr0Var7.h.setItemAnimator(rr0Var7.d);
            } else {
                rr0Var7.h.setItemAnimator(null);
                if (hs0Var != null && rr0VarArr2[z10 ? 1 : 0].h == hs0Var.s) {
                    u4.y yVar3 = hs0Var.w;
                    hs0Var.s = null;
                    yVar3.h(null);
                }
            }
            if (er0Var != null && rr0VarArr2[z10 ? 1 : 0].F != 12 && er0Var.getParent() == rr0VarArr2[z10 ? 1 : 0]) {
                er0Var.a.onRemoveFromParent();
                rr0VarArr2[z10 ? 1 : 0].removeView(er0Var);
            }
            if (view != null && rr0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                rr0 rr0Var8 = rr0VarArr2[z10 ? 1 : 0];
                if (parent == rr0Var8) {
                    rr0Var8.removeView(view);
                }
            }
            if (vp0Var != null && rr0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = vp0Var.getParent();
                rr0 rr0Var9 = rr0VarArr2[z10 ? 1 : 0];
                if (parent2 == rr0Var9) {
                    rr0Var9.removeView(vp0Var);
                }
            }
            int i23 = rr0VarArr2[z10 ? 1 : 0].F;
            if (i23 != 0 && i23 != 11 && !z0(i23) && (i12 = rr0VarArr2[z10 ? 1 : 0].F) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || lr0Var.X()) && (i13 = rr0VarArr2[z10 ? 1 : 0].F) != 10 && i13 != 13 && i13 != 14)) {
                if (z10) {
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (!(y4Var != null ? y4Var.G : kVar.o0)) {
                            if (I()) {
                                this.A0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                setSearchItemVisibility(H0() ? 8 : 4);
                            }
                            float f10 = z10 ? 1.0f : 0.0f;
                            this.r0 = l0(f10);
                            K1(1.0f - f10);
                            z15 = false;
                        }
                    }
                    z15 = false;
                    this.A0 = 0;
                    this.r0 = 1.0f;
                } else {
                    z15 = false;
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (I()) {
                            this.A0 = 0;
                            this.r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            setSearchItemVisibility(H0() ? 8 : 4);
                            this.r0 = 0.0f;
                        }
                    }
                }
                G1(z15);
            } else if (z10) {
                this.A0 = 2;
            } else {
                this.A0 = 0;
                if (q0Var != null) {
                    setSearchItemVisibility((H0() || this.Y0) ? 8 : 4);
                }
            }
            int i24 = rr0VarArr2[z10 ? 1 : 0].F;
            if (i24 == 6) {
                if (!kr0Var.e && !kr0Var.h && kr0Var.d.isEmpty()) {
                    kr0.E(kr0Var, 0L);
                }
            } else if (i24 != 7) {
                if (z0(i24)) {
                    ts0 x13 = x1(rr0VarArr2[z10 ? 1 : 0].F);
                    if (x13 != null) {
                        ei.r6 r6Var = x13.s;
                        x13.P();
                        rr0VarArr2[z10 ? 1 : 0].w.e(r6Var != null && (r6Var.k() || (t0() && r6Var.g() > 0)), z10);
                        z13 = (r6Var == null || r6Var.g() <= 0 || F0()) ? false : true;
                    }
                } else {
                    int i25 = rr0VarArr2[z10 ? 1 : 0].F;
                    if (i25 != 10 && i25 != 11 && i25 != 12 && i25 != 13 && i25 != 14) {
                        if (i25 == 15) {
                            i25 = 8;
                        }
                        ls0 ls0Var6 = ls0VarArr[i25];
                        if (!ls0Var6.g && !ls0Var6.i[0] && ls0Var6.a.isEmpty()) {
                            ls0VarArr[i25].g = true;
                            h0Var2.f();
                            if (i25 == 0) {
                                int i26 = ls0VarArr[0].q;
                                if (i26 == 1) {
                                    i3 = 6;
                                } else if (i26 == 2) {
                                    i3 = 7;
                                }
                                org.telegram.ui.ActionBar.d2 d2Var = this.y1;
                                d2Var.getMediaDataController().N0(this.m1, 50, 0, 0, i3, this.G, 1, d2Var.getClassGuid(), ls0VarArr[i3].p, null, null);
                            }
                            i3 = i25;
                            org.telegram.ui.ActionBar.d2 d2Var2 = this.y1;
                            d2Var2.getMediaDataController().N0(this.m1, 50, 0, 0, i3, this.G, 1, d2Var2.getClassGuid(), ls0VarArr[i3].p, null, null);
                        }
                    }
                }
            }
            int i27 = rr0VarArr2[z10 ? 1 : 0].F;
            if (i27 == 8 || I0(i27)) {
                i10 = 4;
                rr0 rr0Var10 = rr0VarArr2[z10 ? 1 : 0];
                nq0 nq0Var = rr0Var10.w;
                boolean I0 = I0(rr0Var10.F);
                int u12 = u1(rr0VarArr2[z10 ? 1 : 0].F);
                k9 k9Var = nq0Var.b;
                gi.d dVar = nq0Var.f;
                k9Var.setVisibility((I0 || G0() || B0()) ? 8 : 0);
                if (I0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.bd.M0(2131744815, null), false);
                    i11 = 8;
                } else if (G0()) {
                    i11 = 8;
                    dVar.setVisibility(8);
                } else {
                    i11 = 8;
                    nq0Var.setStickerType(11);
                    dVar.setVisibility(!F0() ? 0 : 8);
                    dVar.h(A(), false);
                }
                if (I0) {
                    nq0Var.d.setText(org.telegram.messenger.bd.M0(2131744793, null));
                    nq0Var.e.setText(org.telegram.messenger.bd.M0(2131744794, null));
                } else {
                    nq0Var.d.setText(org.telegram.messenger.bd.M0(!F0() ? H0() ? 2131748184 : 2131748155 : 2131748212, null));
                    nq0Var.e.setText(H0() ? org.telegram.messenger.bd.M0(2131748156, null) : "");
                }
                dVar.setOnClickListener(new ai.n3(this, I0, u12, 1));
            } else {
                rr0 rr0Var11 = rr0VarArr2[z10 ? 1 : 0];
                if (rr0Var11.F == 9) {
                    if (G0()) {
                        rr0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        rr0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        rr0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        rr0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        rr0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        rr0VarArr2[z10 ? 1 : 0].w.f.h(A(), false);
                    }
                    rr0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.bd.M0(2131748254, null));
                    rr0VarArr2[z10 ? 1 : 0].w.e.setText(H0() ? org.telegram.messenger.bd.M0(2131748255, null) : "");
                    i10 = 4;
                    rr0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new vo0(this, i10));
                    i11 = 8;
                } else {
                    i10 = 4;
                    rr0Var11.w.b.setVisibility(0);
                    rr0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    rr0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
                    rr0VarArr2[z10 ? 1 : 0].w.e.setText(org.telegram.messenger.bd.M0(2131745817, null));
                    i11 = 8;
                    rr0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z14 = false;
            rr0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            v0Var3 = v0Var2;
        }
        int i28 = i15;
        rr0 rr0Var12 = rr0VarArr2[z10 ? 1 : 0];
        rr0Var12.b = z13;
        D1(rr0Var12, z14);
        rr0VarArr2[z10 ? 1 : 0].x.y1(i28);
        rr0VarArr2[z10 ? 1 : 0].h.a0();
        if (v0Var3 != null) {
            rr0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(v0Var3);
            rr0VarArr2[z10 ? 1 : 0].n.setRecycledViewPool(v0Var3);
        }
        if (this.A0 == 2) {
            if (y4Var != null ? y4Var.G : kVar.o0) {
                this.C0 = true;
                if (y4Var != null) {
                    y4Var.j(true);
                } else {
                    kVar.l(true);
                }
                this.A0 = 0;
                this.r0 = 0.0f;
                if (q0Var != null) {
                    setSearchItemVisibility(H0() ? i11 : i10);
                }
                G1(false);
            }
        }
    }

    public void O0(SparseArray sparseArray) {
    }

    public void V0(boolean z10) {
    }

    public int f1(int i3) {
        return i3;
    }

    @Override // org.telegram.ui.Cells.p2
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void w(org.telegram.ui.Cells.t2 t2Var) {
    }

    public void P0() {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
    }
}
