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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class zs0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.ls, org.telegram.ui.Cells.p2, kj0 {
    public static final int[] s2 = {0, 1, 2, 4};
    public static final rp0 t2 = new rp0(0);
    public static final int u2 = org.telegram.messenger.g0.L(7.0f);
    public static final int v2 = org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f);
    public final Drawable A0;
    public boolean A1;
    public boolean B0;
    public int B1;
    public final NumberTextView C0;
    public int C1;
    public final mz D;
    public final LinearLayout D0;
    public VelocityTracker D1;
    public final int E;
    public final ImageView E0;
    public boolean E1;
    public final long F;
    public final org.telegram.ui.ActionBar.y1 F0;
    public final or0 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public fi.m3 G1;
    public final org.telegram.ui.ActionBar.y4 H;
    public final ArrayList H0;
    public final org.telegram.ui.ActionBar.g6 H1;
    public final org.telegram.ui.ActionBar.f5 I;
    public final ArrayList I0;
    public final ri.c I1;
    public final fr0 J;
    public final ArrayList J0;
    public final ab.b0 J1;
    public final ts0 K;
    public final vq0 K0;
    public boolean K1;
    public final ns0 L;
    public final sq0 L0;
    public final h2.f L1;
    public final ms0 M;
    public final org.telegram.ui.Cells.t0 M0;
    public org.telegram.ui.q8 M1;
    public final ms0 N;
    public AnimatorSet N0;
    public int N1;
    public final ms0 O;
    public final to0 O0;
    public boolean O1;
    public final is0 P;
    public final ArrayList P0;
    public int P1;
    public final pr0 Q;
    public float Q0;
    public AnimatorSet Q1;
    public final nr0 R;
    public final pr R0;
    public final SparseArray R1;
    public final lr0 S;
    public final FrameLayout S0;
    public long S1;
    public final ks0 T;
    public final rq0 T0;
    public boolean T1;
    public final ls0 U;
    public final int U0;
    public int U1;
    public final gr0 V;
    public final Paint V0;
    public final cr0 V1;
    public final tp0 W;
    public boolean W0;
    public di.r6 W1;
    public boolean X0;
    public float X1;
    public ch.o0 Y0;
    public boolean Y1;
    public final int[] Z0;
    public SpannableStringBuilder Z1;
    public boolean a;
    public final vp0 a0;
    public int a1;
    public int a2;
    public boolean b;
    public final zp0 b0;
    public final SparseArray[] b1;
    public boolean b2;
    public boolean c;
    public final mr0 c0;
    public int c1;
    public int c2;
    public boolean d;
    public final v4.y d0;
    public boolean d1;
    public int d2;
    public int e;
    public final ir0 e0;
    public long e1;
    public int e2;
    public int f;
    public final ws0 f0;
    public TLRPC.ChatFull f1;
    public int f2;
    public final sp0 g0;
    public TLRPC.UserFull g1;
    public oi.q g2;
    public float h;
    public final ws0 h0;
    public AnimatorSet h1;
    public float h2;
    public final wr0 i0;
    public boolean i1;
    public final RectF i2;
    public final wr0 j0;
    public boolean j1;
    public Runnable j2;
    public final wr0 k0;
    public boolean k1;
    public int k2;
    public final sr0 l0;
    public final long l1;
    public final HashMap l2;
    public final ur0[] m0;
    public boolean m1;
    public final HashMap m2;
    public float n;
    public final org.telegram.ui.ActionBar.r0 n0;
    public boolean n1;
    public int n2;
    public final org.telegram.ui.ActionBar.r0 o0;
    public final int[] o1;
    public int o2;
    public final org.telegram.ui.ActionBar.r0 p0;
    public float p1;
    public boolean p2;
    public float q0;
    public boolean q1;
    public int q2;
    public boolean r;
    public float r0;
    public int r1;
    public int r2;
    public int s;
    public final TextView s0;
    public int s1;
    public final ImageView t0;
    public final fq0 t1;
    public final dh0 u0;
    public float u1;
    public final org.telegram.ui.ActionBar.r0 v0;
    public final os0[] v1;
    public int w;
    public final org.telegram.ui.ActionBar.r0 w0;
    public final rs0 w1;
    public int x;
    public final org.telegram.ui.ActionBar.r0 x0;
    public final org.telegram.ui.ActionBar.f2 x1;
    public final Rect y;
    public final org.telegram.ui.ActionBar.r0 y0;
    public int y1;
    public int z0;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0239, code lost:
    
        r1.a1 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0ab5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0bbc A[EDGE_INSN: B:171:0x0bbc->B:172:0x0bbc BREAK  A[LOOP:3: B:139:0x0866->B:168:0x0ab5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02c7  */
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
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zs0(Context context, long j3, rs0 rs0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, org.telegram.ui.ActionBar.f2 f2Var, or0 or0Var, int i12, org.telegram.ui.ActionBar.g6 g6Var, dh.c cVar) {
        super(context);
        int i13;
        TLRPC.ProfileTab profileTab;
        long j10;
        int i14;
        os0[] os0VarArr;
        int i15;
        sq0 sq0Var;
        int i16;
        int i17;
        ks0 ks0Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.g6 g6Var3;
        dh.c cVar2;
        boolean z9;
        dh.c cVar3;
        int i18;
        int i19;
        int i20;
        ur0[] ur0VarArr;
        View view;
        ?? r92;
        zs0 zs0Var;
        zp0 zp0Var;
        boolean z10;
        tr0 tr0Var;
        int i21;
        int i22;
        bq0 bq0Var;
        tr0 tr0Var2;
        tr0 tr0Var3;
        tr0 tr0Var4;
        tr0 tr0Var5;
        tr0 tr0Var6;
        tr0 tr0Var7;
        tr0 tr0Var8;
        tr0 tr0Var9;
        tr0 tr0Var10;
        tr0 tr0Var11;
        tr0 tr0Var12;
        tr0 tr0Var13;
        tr0 tr0Var14;
        tr0 tr0Var15;
        tr0 tr0Var16;
        cv0 cv0Var;
        cv0 cv0Var2;
        cv0 cv0Var3;
        cv0 cv0Var4;
        cv0 cv0Var5;
        cv0 cv0Var6;
        cv0 cv0Var7;
        cv0 cv0Var8;
        cv0 cv0Var9;
        cv0 cv0Var10;
        tr0 tr0Var17;
        cv0 cv0Var11;
        tr0 tr0Var18;
        tr0 tr0Var19;
        ur0 ur0Var;
        bq0 bq0Var2;
        tr0 tr0Var20;
        org.telegram.ui.ActionBar.r0 a10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        zs0 zs0Var2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        zs0Var2.y = new Rect();
        zs0Var2.m0 = new ur0[2];
        zs0Var2.G0 = new ArrayList(10);
        zs0Var2.H0 = new ArrayList(10);
        zs0Var2.I0 = new ArrayList(10);
        zs0Var2.J0 = new ArrayList(10);
        zs0Var2.O0 = new to0(zs0Var2, 0);
        zs0Var2.P0 = new ArrayList();
        zs0Var2.V0 = new Paint();
        zs0Var2.b1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        zs0Var2.m1 = false;
        zs0Var2.n1 = false;
        zs0Var2.o1 = new int[]{3, 3};
        zs0Var2.t1 = new fq0(zs0Var2);
        zs0Var2.u1 = -5.0f;
        zs0Var2.v1 = new os0[9];
        zs0Var2.L1 = new h2.f(1);
        zs0Var2.R1 = new SparseArray();
        zs0Var2.U1 = -1;
        zs0Var2.V1 = new cr0(zs0Var2);
        zs0Var2.X1 = 0.0f;
        zs0Var2.f2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        zs0Var2.i2 = new RectF();
        zs0Var2.k2 = -1;
        zs0Var2.l2 = new HashMap();
        zs0Var2.m2 = new HashMap();
        zs0Var2.p2 = true;
        ri.c cVar4 = new ri.c();
        zs0Var2.I1 = cVar4;
        cVar4.a(zs0Var2.s0(org.telegram.ui.ActionBar.l6.d6));
        dh.c cVar5 = cVar == null ? new dh.c(cVar4) : cVar;
        zs0Var2.E = i12;
        zs0Var2.H1 = g6Var;
        mz mzVar = new mz(context);
        zs0Var2.D = mzVar;
        mzVar.setIsSingleCell(true);
        TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(j3));
        zs0Var2.w1 = rs0Var;
        zs0Var2.F1 = or0Var;
        int[] iArr = rs0Var.c;
        long j11 = rs0Var.s;
        zs0Var2.F = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i7 : 0, iArr[7], iArr[8]};
        zs0Var2.Z0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i13 = 1;
                profileTab = null;
                if (i10 != 14 || i10 == 10 || i10 == 11 || i10 == 6) {
                    zs0Var2.a1 = i10;
                } else if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    zs0Var2.a1 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    zs0Var2.a1 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || zs0Var2.I0()))) {
                    zs0Var2.a1 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[i13];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            zs0Var2.a1 = i13;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[5]) == i23 || i27 > 0)) {
                        zs0Var2.a1 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        zs0Var2.a1 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        zs0Var2.a1 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        zs0Var2.a1 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || zs0Var2.I0())) {
                        zs0Var2.a1 = zs0Var2.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i10 == -1 || j11 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = zs0Var2.Z0;
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
                            zs0Var2.a1 = i10;
                        }
                    } else {
                        zs0Var2.a1 = 14;
                    }
                } else {
                    zs0Var2.a1 = 14;
                }
                zs0Var2.Z0(i10);
                zs0Var2.f1 = chatFull2;
                zs0Var2.g1 = userFull;
                if (chatFull2 != null) {
                    zs0Var2.e1 = -chatFull2.migrated_from_chat_id;
                }
                j10 = j3;
                zs0Var2.l1 = j10;
                i14 = 0;
                while (true) {
                    os0VarArr = zs0Var2.v1;
                    if (i14 < os0VarArr.length) {
                        break;
                    }
                    os0VarArr[i14] = new os0();
                    zs0Var2.v1[i14].j[0] = org.telegram.messenger.m5.C(zs0Var2.l1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    zs0Var2.v1[i14].j[1] = Integer.MAX_VALUE;
                    zs0Var2.a0(i14);
                    if (zs0Var2.e1 != 0 && zs0Var2.f1 != null && zs0Var2.v1[i14].b[1].size() == 0) {
                        os0 os0Var = zs0Var2.v1[i14];
                        os0Var.j[1] = zs0Var2.f1.migrated_from_max_id;
                        os0Var.i[1] = false;
                    }
                    i14++;
                }
                zs0Var2.x1 = f2Var;
                zs0Var2.G = f2Var.getActionBar();
                zs0Var2.H = f2Var.getSimpleActionBar();
                zs0Var2.o1[0] = zs0Var2.e1() > 0 ? org.telegram.messenger.iz.t1 : zs0Var2.e1();
                zs0Var2.o1[1] = zs0Var2.e1() > 0 ? org.telegram.messenger.iz.u1 : zs0Var2.e1();
                org.telegram.messenger.qs notificationCenter = f2Var.getNotificationCenter();
                notificationCenter.getClass();
                ab.b0 b0Var = new ab.b0(notificationCenter, zs0Var2);
                b0Var.c(org.telegram.messenger.qs.V);
                b0Var.c(org.telegram.messenger.qs.w);
                b0Var.c(1);
                b0Var.c(org.telegram.messenger.qs.K);
                b0Var.c(org.telegram.messenger.qs.f2);
                b0Var.c(org.telegram.messenger.qs.g2);
                b0Var.c(org.telegram.messenger.qs.h2);
                b0Var.c(org.telegram.messenger.qs.x5);
                b0Var.c(org.telegram.messenger.qs.v5);
                b0Var.c(org.telegram.messenger.qs.f3);
                b0Var.c(org.telegram.messenger.qs.g3);
                b0Var.c(org.telegram.messenger.qs.s);
                b0Var.c(org.telegram.messenger.qs.G3);
                b0Var.c(org.telegram.messenger.qs.W3);
                b0Var.c(org.telegram.messenger.qs.f1);
                zs0Var2.J1 = b0Var;
                for (i15 = 0; i15 < 10; i15++) {
                    if (i10 == 4) {
                        qq0 qq0Var = new qq0(zs0Var2, context);
                        qq0Var.T.c();
                        zs0Var2.I0.add(qq0Var);
                    }
                }
                zs0Var2.U0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                zs0Var2.X0 = false;
                zs0Var2.Y0 = null;
                sq0Var = zs0Var2.L0;
                if (sq0Var != null) {
                    sq0Var.g(false);
                }
                zs0Var2.W0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                zs0Var2.A0 = drawable;
                org.telegram.ui.ActionBar.s6.x(zs0Var2, drawable, org.telegram.ui.ActionBar.l6.b7, g6Var, PorterDuff.Mode.MULTIPLY);
                vq0 vq0Var = zs0Var2.K0;
                int currentTabId = vq0Var == null ? vq0Var.getCurrentTabId() : i10;
                vq0 vq0Var2 = new vq0(zs0Var2, context, zs0Var2.H1);
                i16 = zs0Var2.a1;
                if (i16 != -1) {
                    vq0Var2.setInitialTabId(i16);
                    zs0Var2.a1 = -1;
                }
                vq0Var2.b0 = 320L;
                int i32 = org.telegram.ui.ActionBar.l6.a;
                int i33 = org.telegram.ui.ActionBar.l6.ti;
                int i34 = org.telegram.ui.ActionBar.l6.si;
                int i35 = org.telegram.ui.ActionBar.l6.a;
                vq0Var2.L = i33;
                vq0Var2.M = i34;
                vq0Var2.updateColors();
                vq0Var2.setUseMinimalWidth(true);
                vq0Var2.setDelegate(new xq0(zs0Var2));
                zs0Var2.K0 = vq0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    zs0Var2.b1[i17].clear();
                }
                zs0Var2.c1 = 0;
                zs0Var2.P0.clear();
                ks0Var = zs0Var2.T;
                if (ks0Var != null) {
                    ks0Var.x.clear();
                }
                if (zs0Var2 instanceof p20) {
                    org.telegram.ui.ActionBar.y4 y4Var = zs0Var2.H;
                    if (y4Var != null) {
                        org.telegram.ui.ActionBar.e5 p10 = y4Var.p();
                        a10 = p10.b(0, R.drawable.outline_header_search);
                        if (!zs0Var2.A0() && !zs0Var2.G0()) {
                            org.telegram.ui.ActionBar.f5 b10 = p10.b(0, R.drawable.ic_ab_other);
                            zs0Var2.I = b10;
                            b10.setContentDescription(org.telegram.messenger.id.L0(2131754839));
                            b10.Y(false, false);
                        }
                        f10 = 10.0f;
                    } else {
                        org.telegram.ui.ActionBar.y r10 = zs0Var2.G.r();
                        r10.addOnLayoutChangeListener(new wq0(zs0Var2));
                        f10 = 10.0f;
                        if (zs0Var2.l1 == zs0Var2.x1.getUserConfig().e() && (zs0Var2.x1 instanceof v80) && zs0Var2.I()) {
                            zs0Var2.o0 = r10.a(11, R.drawable.outline_header_search);
                        }
                        a10 = r10.a(0, 0);
                    }
                    org.telegram.ui.ActionBar.r0 J = a10.M().J(new dr0(zs0Var2));
                    zs0Var2.p0 = J;
                    sq0 sq0Var2 = zs0Var2.L0;
                    J.setSearchFieldHint(org.telegram.messenger.id.L0((sq0Var2 != null && sq0Var2.a() && zs0Var2.getSelectedTab() == 11) ? 2131745868 : 2131745836));
                    J.setContentDescription(org.telegram.messenger.id.M0(2131745836, "Search"));
                    if (zs0Var2.H != null) {
                        ((org.telegram.ui.ActionBar.f5) J).Y(false, false);
                    } else {
                        J.setTranslationY(org.telegram.messenger.g0.L(f10));
                        zs0Var2.setSearchItemVisibility(zs0Var2.I0() ? 8 : 4);
                    }
                } else {
                    f10 = 10.0f;
                }
                ImageView imageView = new ImageView(context);
                zs0Var2.t0 = imageView;
                imageView.setContentDescription(org.telegram.messenger.id.M0(2131754839, "AccDescrMoreOptions"));
                imageView.setTranslationY(org.telegram.messenger.g0.L(f10));
                imageView.setVisibility(4);
                if (zs0Var2.H == null || zs0Var2.A0() || zs0Var2.G0()) {
                    f11 = 2.0f;
                    g6Var2 = g6Var;
                } else {
                    zs0Var2.G.addView(imageView, c8.ha.e(48, 56, 85));
                    dh0 dh0Var = new dh0(context);
                    zs0Var2.u0 = dh0Var;
                    dh0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    dh0Var.e(R.raw.options_to_search, 24, 24);
                    dh0Var.getAnimatedDrawable().F *= 2.0f;
                    dh0Var.getAnimatedDrawable().h = true;
                    f11 = 2.0f;
                    g6Var2 = g6Var;
                    org.telegram.ui.ActionBar.s6.s(dh0Var, org.telegram.ui.ActionBar.l6.y8, g6Var2, PorterDuff.Mode.SRC_IN);
                    dh0Var.setVisibility(8);
                    zs0Var2.G.addView(dh0Var, c8.ha.e(48, 56, 85));
                }
                imageView.setOnClickListener(new uo0(zs0Var2, 0));
                f5Var = zs0Var2.I;
                if (f5Var != null) {
                    f5Var.setOnClickListener(new uo0(zs0Var2, 1));
                }
                r0Var = zs0Var2.p0;
                if (r0Var != null && zs0Var2.H == null) {
                    EditTextBoldCursor searchField = r0Var.getSearchField();
                    int i36 = org.telegram.ui.ActionBar.l6.G6;
                    org.telegram.ui.ActionBar.s6.U(searchField, i36, g6Var2);
                    org.telegram.ui.ActionBar.s6.D(searchField, org.telegram.ui.ActionBar.l6.Gj, g6Var2);
                    org.telegram.ui.ActionBar.s6.v(searchField, i36, g6Var2);
                }
                zs0Var2.z0 = 0;
                LinearLayout linearLayout = new LinearLayout(context);
                zs0Var2.D0 = linearLayout;
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                linearLayout.setVisibility(4);
                ImageView imageView2 = new ImageView(context);
                zs0Var2.E0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(true);
                zs0Var2.F0 = y1Var;
                imageView2.setImageDrawable(y1Var);
                int i37 = org.telegram.ui.ActionBar.l6.y8;
                y1Var.a(zs0Var2.s0(i37));
                int i38 = org.telegram.ui.ActionBar.l6.z8;
                org.telegram.ui.ActionBar.s6.Q(imageView2, org.telegram.ui.ActionBar.l6.g0(zs0Var2.s0(i38), 1), null, org.telegram.ui.ActionBar.s6.M(i38), g6Var2);
                imageView2.setContentDescription(org.telegram.messenger.id.M0(2131752041, "Close"));
                linearLayout.addView(imageView2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
                zs0Var2.P0.add(imageView2);
                imageView2.setOnClickListener(new uo0(zs0Var2, 2));
                NumberTextView numberTextView = new NumberTextView(context);
                zs0Var2.C0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(org.telegram.messenger.g0.o());
                numberTextView.setTextColor(zs0Var2.s0(i37));
                linearLayout.addView(numberTextView, c8.ha.m(1.0f, 0, -1, 18, 0, 0));
                zs0Var2.P0.add(numberTextView);
                if (!org.telegram.messenger.m5.C(zs0Var2.l1)) {
                    if (!zs0Var2.I0()) {
                        zs0Var2.w0 = zs0Var2.W(context, org.telegram.messenger.qs.n1, R.drawable.msg_message, org.telegram.messenger.id.L0(2131754877));
                        zs0Var2.v0 = zs0Var2.W(context, 100, R.drawable.msg_forward, org.telegram.messenger.id.L0(2131750587));
                    }
                    org.telegram.ui.ActionBar.r0 W = zs0Var2.W(context, org.telegram.messenger.qs.o1, R.drawable.msg_pin, org.telegram.messenger.id.L0(2131747245));
                    zs0Var2.x0 = W;
                    W.setVisibility(8);
                    org.telegram.ui.ActionBar.r0 W2 = zs0Var2.W(context, org.telegram.messenger.qs.p1, R.drawable.msg_unpin, org.telegram.messenger.id.L0(2131743844));
                    zs0Var2.y0 = W2;
                    W2.setVisibility(8);
                    zs0Var2.G1();
                }
                zs0Var2.n0 = zs0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751598, "Delete"));
                zs0Var2.J = new fr0(zs0Var2, context);
                zs0Var2.K = new ts0(zs0Var2, context);
                zs0Var2.M = new ms0(zs0Var2, context, 1);
                zs0Var2.N = new ms0(zs0Var2, context, 2);
                zs0Var2.O = new ms0(zs0Var2, context, 4);
                zs0Var2.P = new is0(zs0Var2, context, zs0Var2.x1.getCurrentAccount(), zs0Var2.x1.getResourceProvider());
                zs0Var2.Q = new pr0(zs0Var2, context);
                zs0Var2.i0 = new wr0(zs0Var2, context, 1);
                zs0Var2.j0 = new wr0(zs0Var2, context, 4);
                zs0Var2.k0 = new wr0(zs0Var2, context, 3);
                zs0Var2.l0 = new sr0(zs0Var2, context);
                zs0Var2.R = new nr0(zs0Var2, context);
                zs0Var2.S = new lr0(zs0Var2, context);
                zs0Var2.T = new ks0(zs0Var2, context);
                zs0Var2.U = new ls0(zs0Var2, context);
                if (!zs0Var2.I0() && !zs0Var2.x0() && zs0Var2.F == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", zs0Var2.x1.getUserConfig().e());
                    bundle.putInt("chatMode", 3);
                    gr0 gr0Var = new gr0(zs0Var2, context, zs0Var2.x1.getParentLayout(), bundle);
                    zs0Var2.V = gr0Var;
                    long j12 = zs0Var2.l1;
                    org.telegram.ui.dn dnVar = gr0Var.a;
                    dnVar.r4 = j12;
                    dnVar.lb = true;
                    gr0Var.setClipToOutline(true);
                    gr0Var.setOutlineProvider(new hr0());
                }
                mr0 mr0Var = new mr0(zs0Var2, context);
                zs0Var2.c0 = mr0Var;
                if (zs0Var2.F == 0) {
                    mr0Var.e = arrayList;
                    mr0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                zs0Var2.e0 = new ir0(zs0Var2, context);
                zs0Var2.d0 = new v4.y(new jr0(zs0Var2));
                zs0Var2.f0 = new ws0(zs0Var2, context, false);
                zs0Var2.g0 = new sp0(zs0Var2, context);
                zs0Var2.h0 = new ws0(zs0Var2, context, true);
                zs0Var2.L = new ns0(zs0Var2, context);
                if (zs0Var2.B0()) {
                    if (zs0Var2.x1 instanceof ProfileActivity) {
                        TextView textView = new TextView(context);
                        zs0Var2.s0 = textView;
                        textView.setText(org.telegram.messenger.id.L0(2131745946).toUpperCase());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        int i39 = org.telegram.ui.ActionBar.l6.Ci;
                        org.telegram.ui.ActionBar.s6.U(textView, i39, g6Var2);
                        textView.setTextSize(1, 15.0f);
                        textView.setGravity(17);
                        org.telegram.ui.ActionBar.s6.Q(textView, org.telegram.ui.ActionBar.l6.g0(org.telegram.ui.ActionBar.l6.r1(0.15f, zs0Var2.s0(i39)), 3), null, org.telegram.ui.ActionBar.s6.K(0.15f, i39), g6Var2);
                        textView.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
                        ViewGroup viewGroup = zs0Var2.H;
                        (viewGroup == null ? zs0Var2.G : viewGroup).addView(textView, c8.ha.e(-2, 56, 85));
                        textView.setOnClickListener(new uo0(zs0Var2, 3));
                        textView.setVisibility(8);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(0.4f);
                        textView.setScaleY(0.4f);
                        org.telegram.ui.ActionBar.f2 f2Var2 = zs0Var2.x1;
                        org.telegram.ui.ActionBar.g6 g6Var4 = g6Var2;
                        dh.c cVar6 = cVar5;
                        g6Var3 = g6Var4;
                        zs0Var2.a0 = new vp0(zs0Var2, f2Var2, context, f2Var2.getCurrentAccount(), ((ProfileActivity) zs0Var2.x1).a(), g6Var4, cVar6);
                        zs0Var2.H1();
                        zs0Var2.b0 = new zp0(zs0Var2, context, zs0Var2.getStoriesController().B(zs0Var2.l1, true), new yp0(zs0Var2, context, f2Var, g6Var3));
                        cVar2 = cVar6;
                    } else {
                        g6Var3 = g6Var2;
                        cVar2 = cVar5;
                    }
                    z9 = false;
                    cVar3 = cVar2;
                } else {
                    zs0Var2.W = new tp0(zs0Var2, context, zs0Var2.x1, zs0Var2.l1);
                    g6Var3 = g6Var2;
                    cVar3 = cVar5;
                    z9 = false;
                }
                zs0Var2.setWillNotDraw(z9);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    ur0VarArr = zs0Var2.m0;
                    if (i20 < ur0VarArr.length) {
                        break;
                    }
                    if (i20 == 0 && (ur0Var = ur0VarArr[i20]) != null && (bq0Var2 = ur0Var.x) != null) {
                        i19 = bq0Var2.L0();
                        if (i19 != zs0Var2.m0[i20].x.B() - 1) {
                            tr0Var20 = zs0Var2.m0[i20].h;
                            yi0 yi0Var = (yi0) tr0Var20.K(i19);
                            if (yi0Var != null) {
                                i18 = yi0Var.a.getTop();
                            } else {
                                i19 = -1;
                            }
                        } else {
                            i21 = i18;
                            i22 = -1;
                            aq0 aq0Var = new aq0(zs0Var2, context);
                            zs0Var2.addView(aq0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, zs0Var2.O0(), 0.0f, 0.0f));
                            if (i20 == 1) {
                                aq0Var.setTranslationX(org.telegram.messenger.g0.q.x);
                            }
                            zs0Var2.m0[i20] = aq0Var;
                            aq0Var.N = g6Var3;
                            ur0 ur0Var2 = zs0Var2.m0[i20];
                            bq0Var = new bq0(zs0Var2, aq0Var);
                            ur0Var2.x = bq0Var;
                            bq0Var.z1(new cq0(zs0Var2, aq0Var));
                            zs0Var2.m0[i20].d = new v4.k();
                            zs0Var2.m0[i20].d.n(280L);
                            zs0Var2.m0[i20].d.o(xq.h);
                            ur0 ur0Var3 = zs0Var2.m0[i20];
                            ur0Var3.d.m = false;
                            ur0Var3.h = new dq0(zs0Var2, context, g6Var3, aq0Var, bq0Var);
                            tr0Var2 = zs0Var2.m0[i20].h;
                            tr0Var2.setFastScrollEnabled(1);
                            tr0Var3 = zs0Var2.m0[i20].h;
                            tr0Var3.setScrollingTouchSlop(1);
                            tr0Var4 = zs0Var2.m0[i20].h;
                            tr0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                            tr0Var5 = zs0Var2.m0[i20].h;
                            tr0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                            tr0Var6 = zs0Var2.m0[i20].h;
                            tr0Var6.setItemAnimator(null);
                            tr0Var7 = zs0Var2.m0[i20].h;
                            tr0Var7.setClipToPadding(false);
                            tr0Var8 = zs0Var2.m0[i20].h;
                            tr0Var8.setSectionsType(2);
                            tr0Var9 = zs0Var2.m0[i20].h;
                            tr0Var9.setLayoutManager(bq0Var);
                            ur0 ur0Var4 = zs0Var2.m0[i20];
                            tr0Var10 = ur0Var4.h;
                            ur0Var4.addView(tr0Var10, c8.ha.c(-1.0f, -1));
                            zs0Var2.m0[i20].n = new tr0(context, null);
                            ur0 ur0Var5 = zs0Var2.m0[i20];
                            tr0 tr0Var21 = ur0Var5.n;
                            eq0 eq0Var = new eq0(zs0Var2);
                            ur0Var5.r = eq0Var;
                            tr0Var21.setLayoutManager(eq0Var);
                            ur0 ur0Var6 = zs0Var2.m0[i20];
                            ur0Var6.addView(ur0Var6.n, c8.ha.c(-1.0f, -1));
                            zs0Var2.m0[i20].n.setVisibility(8);
                            zs0Var2.m0[i20].n.i(new gq0(aq0Var));
                            tr0Var11 = zs0Var2.m0[i20].h;
                            tr0Var11.i(new hq0(zs0Var2, aq0Var));
                            tr0Var12 = zs0Var2.m0[i20].h;
                            tr0Var12.setOnItemClickListener(new bi.n4(zs0Var2, aq0Var, context, j10, g6Var, 2));
                            tr0Var13 = zs0Var2.m0[i20].h;
                            tr0Var13.setOnScrollListener(new kq0(zs0Var2, aq0Var, bq0Var));
                            tr0Var14 = zs0Var2.m0[i20].h;
                            tr0Var14.setOnItemLongClickListener(new lq0(zs0Var2, aq0Var));
                            if (i20 == 0 && i22 != -1) {
                                bq0Var.h1(i22, i21);
                            }
                            tr0Var15 = zs0Var2.m0[i20].h;
                            zs0Var2.m0[i20].y = new mq0(context, tr0Var15);
                            zs0Var2.m0[i20].y.setVisibility(8);
                            tr0Var16 = zs0Var2.m0[i20].h;
                            mq0 mq0Var = zs0Var2.m0[i20].y;
                            FrameLayout.LayoutParams c10 = c8.ha.c(-1.0f, -1);
                            if (tr0Var16.b1 == null) {
                                tr0Var16.b1 = new bi.e5(22, tr0Var16.getContext(), tr0Var16);
                            }
                            tr0Var16.b1.addView(mq0Var, c10);
                            zs0Var2.m0[i20].s = new nq0(zs0Var2, context, aq0Var);
                            zs0Var2.m0[i20].s.f();
                            zs0Var2.m0[i20].s.setClipToOutline(true);
                            zs0Var2.m0[i20].s.setOutlineProvider(new oq0());
                            if (i20 == 0) {
                                zs0Var2.m0[i20].setVisibility(8);
                            }
                            ur0 ur0Var7 = zs0Var2.m0[i20];
                            ur0Var7.w = new pq0(zs0Var2, context, ur0Var7.s);
                            cv0Var = zs0Var2.m0[i20].w;
                            cv0Var.d(8, false);
                            cv0Var2 = zs0Var2.m0[i20].w;
                            cv0Var2.setAnimateLayoutChange(true);
                            ur0 ur0Var8 = zs0Var2.m0[i20];
                            cv0Var3 = ur0Var8.w;
                            ur0Var8.addView(cv0Var3, c8.ha.c(-1.0f, -1));
                            cv0Var4 = zs0Var2.m0[i20].w;
                            cv0Var4.setOnTouchListener(new ei.b(23));
                            cv0Var5 = zs0Var2.m0[i20].w;
                            cv0Var5.e(true, false);
                            cv0Var6 = zs0Var2.m0[i20].w;
                            cv0Var6.d.setText(org.telegram.messenger.id.M0(2131748167, "NoResult"));
                            cv0Var7 = zs0Var2.m0[i20].w;
                            cv0Var7.f.setVisibility(8);
                            cv0Var8 = zs0Var2.m0[i20].w;
                            cv0Var8.e.setText(org.telegram.messenger.id.L0(2131745807));
                            cv0Var9 = zs0Var2.m0[i20].w;
                            cv0Var9.f.setVisibility(8);
                            cv0Var10 = zs0Var2.m0[i20].w;
                            cv0Var10.addView(zs0Var2.m0[i20].s, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                            tr0Var17 = zs0Var2.m0[i20].h;
                            cv0Var11 = zs0Var2.m0[i20].w;
                            tr0Var17.setEmptyView(cv0Var11);
                            tr0Var18 = zs0Var2.m0[i20].h;
                            tr0Var18.o1(0, true);
                            ur0[] ur0VarArr2 = zs0Var2.m0;
                            ur0 ur0Var9 = ur0VarArr2[i20];
                            tr0Var19 = ur0VarArr2[i20].h;
                            ur0Var9.D = new si0(tr0Var19, zs0Var2.m0[i20].x);
                            i20++;
                            j10 = j3;
                            g6Var3 = g6Var;
                            i18 = i21;
                            i19 = i22;
                        }
                    }
                    i21 = i18;
                    i22 = i19;
                    aq0 aq0Var2 = new aq0(zs0Var2, context);
                    zs0Var2.addView(aq0Var2, c8.ha.d(-1, -1.0f, 51, 0.0f, zs0Var2.O0(), 0.0f, 0.0f));
                    if (i20 == 1) {
                    }
                    zs0Var2.m0[i20] = aq0Var2;
                    aq0Var2.N = g6Var3;
                    ur0 ur0Var22 = zs0Var2.m0[i20];
                    bq0Var = new bq0(zs0Var2, aq0Var2);
                    ur0Var22.x = bq0Var;
                    bq0Var.z1(new cq0(zs0Var2, aq0Var2));
                    zs0Var2.m0[i20].d = new v4.k();
                    zs0Var2.m0[i20].d.n(280L);
                    zs0Var2.m0[i20].d.o(xq.h);
                    ur0 ur0Var32 = zs0Var2.m0[i20];
                    ur0Var32.d.m = false;
                    ur0Var32.h = new dq0(zs0Var2, context, g6Var3, aq0Var2, bq0Var);
                    tr0Var2 = zs0Var2.m0[i20].h;
                    tr0Var2.setFastScrollEnabled(1);
                    tr0Var3 = zs0Var2.m0[i20].h;
                    tr0Var3.setScrollingTouchSlop(1);
                    tr0Var4 = zs0Var2.m0[i20].h;
                    tr0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                    tr0Var5 = zs0Var2.m0[i20].h;
                    tr0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                    tr0Var6 = zs0Var2.m0[i20].h;
                    tr0Var6.setItemAnimator(null);
                    tr0Var7 = zs0Var2.m0[i20].h;
                    tr0Var7.setClipToPadding(false);
                    tr0Var8 = zs0Var2.m0[i20].h;
                    tr0Var8.setSectionsType(2);
                    tr0Var9 = zs0Var2.m0[i20].h;
                    tr0Var9.setLayoutManager(bq0Var);
                    ur0 ur0Var42 = zs0Var2.m0[i20];
                    tr0Var10 = ur0Var42.h;
                    ur0Var42.addView(tr0Var10, c8.ha.c(-1.0f, -1));
                    zs0Var2.m0[i20].n = new tr0(context, null);
                    ur0 ur0Var52 = zs0Var2.m0[i20];
                    tr0 tr0Var212 = ur0Var52.n;
                    eq0 eq0Var2 = new eq0(zs0Var2);
                    ur0Var52.r = eq0Var2;
                    tr0Var212.setLayoutManager(eq0Var2);
                    ur0 ur0Var62 = zs0Var2.m0[i20];
                    ur0Var62.addView(ur0Var62.n, c8.ha.c(-1.0f, -1));
                    zs0Var2.m0[i20].n.setVisibility(8);
                    zs0Var2.m0[i20].n.i(new gq0(aq0Var2));
                    tr0Var11 = zs0Var2.m0[i20].h;
                    tr0Var11.i(new hq0(zs0Var2, aq0Var2));
                    tr0Var12 = zs0Var2.m0[i20].h;
                    tr0Var12.setOnItemClickListener(new bi.n4(zs0Var2, aq0Var2, context, j10, g6Var, 2));
                    tr0Var13 = zs0Var2.m0[i20].h;
                    tr0Var13.setOnScrollListener(new kq0(zs0Var2, aq0Var2, bq0Var));
                    tr0Var14 = zs0Var2.m0[i20].h;
                    tr0Var14.setOnItemLongClickListener(new lq0(zs0Var2, aq0Var2));
                    if (i20 == 0) {
                        bq0Var.h1(i22, i21);
                    }
                    tr0Var15 = zs0Var2.m0[i20].h;
                    zs0Var2.m0[i20].y = new mq0(context, tr0Var15);
                    zs0Var2.m0[i20].y.setVisibility(8);
                    tr0Var16 = zs0Var2.m0[i20].h;
                    mq0 mq0Var2 = zs0Var2.m0[i20].y;
                    FrameLayout.LayoutParams c102 = c8.ha.c(-1.0f, -1);
                    if (tr0Var16.b1 == null) {
                    }
                    tr0Var16.b1.addView(mq0Var2, c102);
                    zs0Var2.m0[i20].s = new nq0(zs0Var2, context, aq0Var2);
                    zs0Var2.m0[i20].s.f();
                    zs0Var2.m0[i20].s.setClipToOutline(true);
                    zs0Var2.m0[i20].s.setOutlineProvider(new oq0());
                    if (i20 == 0) {
                    }
                    ur0 ur0Var72 = zs0Var2.m0[i20];
                    ur0Var72.w = new pq0(zs0Var2, context, ur0Var72.s);
                    cv0Var = zs0Var2.m0[i20].w;
                    cv0Var.d(8, false);
                    cv0Var2 = zs0Var2.m0[i20].w;
                    cv0Var2.setAnimateLayoutChange(true);
                    ur0 ur0Var82 = zs0Var2.m0[i20];
                    cv0Var3 = ur0Var82.w;
                    ur0Var82.addView(cv0Var3, c8.ha.c(-1.0f, -1));
                    cv0Var4 = zs0Var2.m0[i20].w;
                    cv0Var4.setOnTouchListener(new ei.b(23));
                    cv0Var5 = zs0Var2.m0[i20].w;
                    cv0Var5.e(true, false);
                    cv0Var6 = zs0Var2.m0[i20].w;
                    cv0Var6.d.setText(org.telegram.messenger.id.M0(2131748167, "NoResult"));
                    cv0Var7 = zs0Var2.m0[i20].w;
                    cv0Var7.f.setVisibility(8);
                    cv0Var8 = zs0Var2.m0[i20].w;
                    cv0Var8.e.setText(org.telegram.messenger.id.L0(2131745807));
                    cv0Var9 = zs0Var2.m0[i20].w;
                    cv0Var9.f.setVisibility(8);
                    cv0Var10 = zs0Var2.m0[i20].w;
                    cv0Var10.addView(zs0Var2.m0[i20].s, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                    tr0Var17 = zs0Var2.m0[i20].h;
                    cv0Var11 = zs0Var2.m0[i20].w;
                    tr0Var17.setEmptyView(cv0Var11);
                    tr0Var18 = zs0Var2.m0[i20].h;
                    tr0Var18.o1(0, true);
                    ur0[] ur0VarArr22 = zs0Var2.m0;
                    ur0 ur0Var92 = ur0VarArr22[i20];
                    tr0Var19 = ur0VarArr22[i20].h;
                    ur0Var92.D = new si0(tr0Var19, zs0Var2.m0[i20].x);
                    i20++;
                    j10 = j3;
                    g6Var3 = g6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = zs0Var2.b0;
                if (view != null) {
                    zs0Var2.addView(view, c8.ha.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                }
                org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
                zs0Var2.M0 = t0Var;
                t0Var.e0((int) (System.currentTimeMillis() / 1000), false, false);
                t0Var.setAlpha(0.0f);
                t0Var.h0(org.telegram.ui.ActionBar.l6.kd, org.telegram.ui.ActionBar.l6.Yd);
                t0Var.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
                zs0Var2.addView(t0Var, c8.ha.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                for (ur0 ur0Var10 : zs0Var2.m0) {
                    tr0Var = ur0Var10.h;
                    vi0 fastScroll = tr0Var.getFastScroll();
                    if (fastScroll != null) {
                        fastScroll.a(cVar3, zs0Var2.H != null ? c8.g0.l(g6Var) : c8.g0.n(g6Var));
                    }
                }
                if (zs0Var2.Y()) {
                    gh.e l10 = zs0Var2.H != null ? c8.g0.l(g6Var) : c8.g0.n(g6Var);
                    pr prVar = new pr(context);
                    zs0Var2.R0 = prVar;
                    int L = org.telegram.messenger.g0.L(11.0f);
                    int i40 = v2;
                    prVar.setPadding(L, i40, org.telegram.messenger.g0.L(11.0f), i40);
                    fh.g b11 = cVar3.b(prVar, l10);
                    b11.r(org.telegram.messenger.g0.L(24.0f));
                    b11.q(org.telegram.messenger.g0.L(7.0f));
                    prVar.setBlurredBackground(b11);
                    FrameLayout frameLayout = new FrameLayout(context);
                    zs0Var2.S0 = frameLayout;
                    prVar.addView(frameLayout);
                    prVar.i(frameLayout, true, false);
                    prVar.setOnAnimatedHeightChangedListener(new to0(zs0Var2, 1));
                    rq0 rq0Var = new rq0(zs0Var2, context, f2Var, this, g6Var);
                    zs0Var2.T0 = rq0Var;
                    frameLayout.addView(rq0Var);
                    prVar.setCallFragmentContextView(rq0Var);
                    zs0Var2.addView(prVar, c8.ha.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
                    rq0Var.setDelegate(new vo0(zs0Var2));
                    fh.g b12 = cVar3.b(zs0Var2.K0, l10);
                    org.telegram.messenger.camera.q.p(b12, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    zs0Var2.K0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    zs0Var2.K0.setClipToPadding(false);
                    zs0Var2.K0.setBackground(null);
                    zs0Var2.K0.setBlurredBackground(b12);
                    zs0Var2.K0.setOpen(false);
                    zs0Var2.addView(zs0Var2.K0, c8.ha.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
                    Context context2 = zs0Var2.getContext();
                    org.telegram.ui.ActionBar.f2 f2Var3 = zs0Var2.x1;
                    sq0 sq0Var3 = new sq0(zs0Var2, context2, f2Var3, f2Var3.getCurrentAccount(), zs0Var2.x0() ? 0L : zs0Var2.l1, g6Var);
                    zs0 zs0Var3 = zs0Var2;
                    zs0Var3.L0 = sq0Var3;
                    sq0Var3.d(cVar3, l10);
                    sq0Var3.setShown(0.0f);
                    zs0Var3.addView(sq0Var3, c8.ha.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                    if (zs0Var3.H == null) {
                        fh.g b13 = cVar3.b(zs0Var3.D0, l10);
                        org.telegram.messenger.camera.q.p(b13, org.telegram.messenger.g0.L(18.0f), 6.666f);
                        zs0Var3.D0.setBackground(b13);
                        z10 = false;
                        zs0Var3.D0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        zs0Var3.addView(zs0Var3.D0, c8.ha.e(-1, 50, 51));
                    } else {
                        z10 = false;
                    }
                    zs0Var3.G();
                    zs0Var = zs0Var3;
                    r92 = z10;
                } else {
                    r92 = 0;
                    zs0Var = zs0Var2;
                }
                zs0Var.P1(r92);
                zs0Var.B1(r92);
                zs0Var.Q();
                if (zs0Var.Z0[r92] >= 0) {
                    zs0Var.M0(r92);
                }
                zp0Var = zs0Var.b0;
                if (zp0Var != null || i11 <= 0) {
                }
                zp0Var.setInitialTabId(i11);
                return;
            }
            profileTab = chatFull2.main_tab;
        }
        i13 = 1;
        if (i10 != 14) {
        }
        zs0Var2.a1 = i10;
        zs0Var2.Z0(i10);
        zs0Var2.f1 = chatFull2;
        zs0Var2.g1 = userFull;
        if (chatFull2 != null) {
        }
        j10 = j3;
        zs0Var2.l1 = j10;
        i14 = 0;
        while (true) {
            os0VarArr = zs0Var2.v1;
            if (i14 < os0VarArr.length) {
            }
            i14++;
        }
        zs0Var2.x1 = f2Var;
        zs0Var2.G = f2Var.getActionBar();
        zs0Var2.H = f2Var.getSimpleActionBar();
        zs0Var2.o1[0] = zs0Var2.e1() > 0 ? org.telegram.messenger.iz.t1 : zs0Var2.e1();
        zs0Var2.o1[1] = zs0Var2.e1() > 0 ? org.telegram.messenger.iz.u1 : zs0Var2.e1();
        org.telegram.messenger.qs notificationCenter2 = f2Var.getNotificationCenter();
        notificationCenter2.getClass();
        ab.b0 b0Var2 = new ab.b0(notificationCenter2, zs0Var2);
        b0Var2.c(org.telegram.messenger.qs.V);
        b0Var2.c(org.telegram.messenger.qs.w);
        b0Var2.c(1);
        b0Var2.c(org.telegram.messenger.qs.K);
        b0Var2.c(org.telegram.messenger.qs.f2);
        b0Var2.c(org.telegram.messenger.qs.g2);
        b0Var2.c(org.telegram.messenger.qs.h2);
        b0Var2.c(org.telegram.messenger.qs.x5);
        b0Var2.c(org.telegram.messenger.qs.v5);
        b0Var2.c(org.telegram.messenger.qs.f3);
        b0Var2.c(org.telegram.messenger.qs.g3);
        b0Var2.c(org.telegram.messenger.qs.s);
        b0Var2.c(org.telegram.messenger.qs.G3);
        b0Var2.c(org.telegram.messenger.qs.W3);
        b0Var2.c(org.telegram.messenger.qs.f1);
        zs0Var2.J1 = b0Var2;
        while (i15 < 10) {
        }
        zs0Var2.U0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zs0Var2.X0 = false;
        zs0Var2.Y0 = null;
        sq0Var = zs0Var2.L0;
        if (sq0Var != null) {
        }
        zs0Var2.W0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        zs0Var2.A0 = drawable2;
        org.telegram.ui.ActionBar.s6.x(zs0Var2, drawable2, org.telegram.ui.ActionBar.l6.b7, g6Var, PorterDuff.Mode.MULTIPLY);
        vq0 vq0Var3 = zs0Var2.K0;
        if (vq0Var3 == null) {
        }
        vq0 vq0Var22 = new vq0(zs0Var2, context, zs0Var2.H1);
        i16 = zs0Var2.a1;
        if (i16 != -1) {
        }
        vq0Var22.b0 = 320L;
        int i322 = org.telegram.ui.ActionBar.l6.a;
        int i332 = org.telegram.ui.ActionBar.l6.ti;
        int i342 = org.telegram.ui.ActionBar.l6.si;
        int i352 = org.telegram.ui.ActionBar.l6.a;
        vq0Var22.L = i332;
        vq0Var22.M = i342;
        vq0Var22.updateColors();
        vq0Var22.setUseMinimalWidth(true);
        vq0Var22.setDelegate(new xq0(zs0Var2));
        zs0Var2.K0 = vq0Var22;
        while (i17 >= 0) {
        }
        zs0Var2.c1 = 0;
        zs0Var2.P0.clear();
        ks0Var = zs0Var2.T;
        if (ks0Var != null) {
        }
        if (zs0Var2 instanceof p20) {
        }
        ImageView imageView3 = new ImageView(context);
        zs0Var2.t0 = imageView3;
        imageView3.setContentDescription(org.telegram.messenger.id.M0(2131754839, "AccDescrMoreOptions"));
        imageView3.setTranslationY(org.telegram.messenger.g0.L(f10));
        imageView3.setVisibility(4);
        if (zs0Var2.H == null) {
        }
        f11 = 2.0f;
        g6Var2 = g6Var;
        imageView3.setOnClickListener(new uo0(zs0Var2, 0));
        f5Var = zs0Var2.I;
        if (f5Var != null) {
        }
        r0Var = zs0Var2.p0;
        if (r0Var != null) {
            EditTextBoldCursor searchField2 = r0Var.getSearchField();
            int i362 = org.telegram.ui.ActionBar.l6.G6;
            org.telegram.ui.ActionBar.s6.U(searchField2, i362, g6Var2);
            org.telegram.ui.ActionBar.s6.D(searchField2, org.telegram.ui.ActionBar.l6.Gj, g6Var2);
            org.telegram.ui.ActionBar.s6.v(searchField2, i362, g6Var2);
        }
        zs0Var2.z0 = 0;
        LinearLayout linearLayout2 = new LinearLayout(context);
        zs0Var2.D0 = linearLayout2;
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setClickable(true);
        linearLayout2.setVisibility(4);
        ImageView imageView22 = new ImageView(context);
        zs0Var2.E0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.y1 y1Var2 = new org.telegram.ui.ActionBar.y1(true);
        zs0Var2.F0 = y1Var2;
        imageView22.setImageDrawable(y1Var2);
        int i372 = org.telegram.ui.ActionBar.l6.y8;
        y1Var2.a(zs0Var2.s0(i372));
        int i382 = org.telegram.ui.ActionBar.l6.z8;
        org.telegram.ui.ActionBar.s6.Q(imageView22, org.telegram.ui.ActionBar.l6.g0(zs0Var2.s0(i382), 1), null, org.telegram.ui.ActionBar.s6.M(i382), g6Var2);
        imageView22.setContentDescription(org.telegram.messenger.id.M0(2131752041, "Close"));
        linearLayout2.addView(imageView22, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        zs0Var2.P0.add(imageView22);
        imageView22.setOnClickListener(new uo0(zs0Var2, 2));
        NumberTextView numberTextView2 = new NumberTextView(context);
        zs0Var2.C0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(org.telegram.messenger.g0.o());
        numberTextView2.setTextColor(zs0Var2.s0(i372));
        linearLayout2.addView(numberTextView2, c8.ha.m(1.0f, 0, -1, 18, 0, 0));
        zs0Var2.P0.add(numberTextView2);
        if (!org.telegram.messenger.m5.C(zs0Var2.l1)) {
        }
        zs0Var2.n0 = zs0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751598, "Delete"));
        zs0Var2.J = new fr0(zs0Var2, context);
        zs0Var2.K = new ts0(zs0Var2, context);
        zs0Var2.M = new ms0(zs0Var2, context, 1);
        zs0Var2.N = new ms0(zs0Var2, context, 2);
        zs0Var2.O = new ms0(zs0Var2, context, 4);
        zs0Var2.P = new is0(zs0Var2, context, zs0Var2.x1.getCurrentAccount(), zs0Var2.x1.getResourceProvider());
        zs0Var2.Q = new pr0(zs0Var2, context);
        zs0Var2.i0 = new wr0(zs0Var2, context, 1);
        zs0Var2.j0 = new wr0(zs0Var2, context, 4);
        zs0Var2.k0 = new wr0(zs0Var2, context, 3);
        zs0Var2.l0 = new sr0(zs0Var2, context);
        zs0Var2.R = new nr0(zs0Var2, context);
        zs0Var2.S = new lr0(zs0Var2, context);
        zs0Var2.T = new ks0(zs0Var2, context);
        zs0Var2.U = new ls0(zs0Var2, context);
        if (!zs0Var2.I0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", zs0Var2.x1.getUserConfig().e());
            bundle2.putInt("chatMode", 3);
            gr0 gr0Var2 = new gr0(zs0Var2, context, zs0Var2.x1.getParentLayout(), bundle2);
            zs0Var2.V = gr0Var2;
            long j122 = zs0Var2.l1;
            org.telegram.ui.dn dnVar2 = gr0Var2.a;
            dnVar2.r4 = j122;
            dnVar2.lb = true;
            gr0Var2.setClipToOutline(true);
            gr0Var2.setOutlineProvider(new hr0());
        }
        mr0 mr0Var2 = new mr0(zs0Var2, context);
        zs0Var2.c0 = mr0Var2;
        if (zs0Var2.F == 0) {
        }
        zs0Var2.e0 = new ir0(zs0Var2, context);
        zs0Var2.d0 = new v4.y(new jr0(zs0Var2));
        zs0Var2.f0 = new ws0(zs0Var2, context, false);
        zs0Var2.g0 = new sp0(zs0Var2, context);
        zs0Var2.h0 = new ws0(zs0Var2, context, true);
        zs0Var2.L = new ns0(zs0Var2, context);
        if (zs0Var2.B0()) {
        }
        zs0Var2.setWillNotDraw(z9);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            ur0VarArr = zs0Var2.m0;
            if (i20 < ur0VarArr.length) {
            }
            ur0 ur0Var722 = zs0Var2.m0[i20];
            ur0Var722.w = new pq0(zs0Var2, context, ur0Var722.s);
            cv0Var = zs0Var2.m0[i20].w;
            cv0Var.d(8, false);
            cv0Var2 = zs0Var2.m0[i20].w;
            cv0Var2.setAnimateLayoutChange(true);
            ur0 ur0Var822 = zs0Var2.m0[i20];
            cv0Var3 = ur0Var822.w;
            ur0Var822.addView(cv0Var3, c8.ha.c(-1.0f, -1));
            cv0Var4 = zs0Var2.m0[i20].w;
            cv0Var4.setOnTouchListener(new ei.b(23));
            cv0Var5 = zs0Var2.m0[i20].w;
            cv0Var5.e(true, false);
            cv0Var6 = zs0Var2.m0[i20].w;
            cv0Var6.d.setText(org.telegram.messenger.id.M0(2131748167, "NoResult"));
            cv0Var7 = zs0Var2.m0[i20].w;
            cv0Var7.f.setVisibility(8);
            cv0Var8 = zs0Var2.m0[i20].w;
            cv0Var8.e.setText(org.telegram.messenger.id.L0(2131745807));
            cv0Var9 = zs0Var2.m0[i20].w;
            cv0Var9.f.setVisibility(8);
            cv0Var10 = zs0Var2.m0[i20].w;
            cv0Var10.addView(zs0Var2.m0[i20].s, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 12.0f, 60.0f, 12.0f, 12.0f));
            tr0Var17 = zs0Var2.m0[i20].h;
            cv0Var11 = zs0Var2.m0[i20].w;
            tr0Var17.setEmptyView(cv0Var11);
            tr0Var18 = zs0Var2.m0[i20].h;
            tr0Var18.o1(0, true);
            ur0[] ur0VarArr222 = zs0Var2.m0;
            ur0 ur0Var922 = ur0VarArr222[i20];
            tr0Var19 = ur0VarArr222[i20].h;
            ur0Var922.D = new si0(tr0Var19, zs0Var2.m0[i20].x);
            i20++;
            j10 = j3;
            g6Var3 = g6Var;
            i18 = i21;
            i19 = i22;
        }
        view = zs0Var2.b0;
        if (view != null) {
        }
        org.telegram.ui.Cells.t0 t0Var2 = new org.telegram.ui.Cells.t0(context);
        zs0Var2.M0 = t0Var2;
        t0Var2.e0((int) (System.currentTimeMillis() / 1000), false, false);
        t0Var2.setAlpha(0.0f);
        t0Var2.h0(org.telegram.ui.ActionBar.l6.kd, org.telegram.ui.ActionBar.l6.Yd);
        t0Var2.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
        zs0Var2.addView(t0Var2, c8.ha.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        while (r4 < r2) {
        }
        if (zs0Var2.Y()) {
        }
        zs0Var.P1(r92);
        zs0Var.B1(r92);
        zs0Var.Q();
        if (zs0Var.Z0[r92] >= 0) {
        }
        zp0Var = zs0Var.b0;
        if (zp0Var != null) {
        }
    }

    public static boolean J0(int i7) {
        return (i7 & (-65536)) == 65536;
    }

    public static r3 X(int i7, long j3, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        r3 r3Var = new r3(context, g6Var);
        ImageView imageView = (ImageView) r3Var.d;
        TextView textView = (TextView) r3Var.c;
        if (i7 == 0) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.id.M0(2131748196, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.id.M0(2131748198, null));
            return r3Var;
        }
        if (i7 == 1) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.id.M0(2131748157, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.id.M0(2131748158, null));
            return r3Var;
        }
        if (i7 == 2) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.id.M0(2131748152, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.id.M0(2131748153, null));
            return r3Var;
        }
        if (i7 == 3) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.id.M0(2131748154, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.id.M0(2131748155, null));
            return r3Var;
        }
        if (i7 == 4) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.id.M0(2131748159, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.id.M0(2131748160, null));
            return r3Var;
        }
        if (i7 == 5) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.id.M0(2131748156, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.id.M0(2131748208, null));
            return r3Var;
        }
        if (i7 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.id.M0(2131748206, null));
            return r3Var;
        }
        if (i7 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return r3Var;
    }

    public static void a(zs0 zs0Var, TL_stories.StoryItem storyItem, di.s6 s6Var) {
        zs0Var.getStoriesController().c(s6Var.a, zs0Var.l1, storyItem);
        org.telegram.messenger.g0.i3(new w80(13, zs0Var, s6Var), 100L);
    }

    public static void d(zs0 zs0Var, int i7, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(zs0Var, i7, storyItem, 15);
        di.z6 storiesController = zs0Var.getStoriesController();
        long j3 = zs0Var.l1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i7, j3, arrayList);
        hc.a0(zs0Var.x1).K(R.raw.chats_archived, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.id.M0(2131743885, null), q8Var).j();
    }

    public static void e(zs0 zs0Var, long j3, int i7) {
        di.n6 B = zs0Var.getStoriesController().B(j3, true);
        int i10 = B.a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        di.s6 s6Var = (di.s6) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.qp.s1(i10).j1(B.b);
        tL_deleteAlbum.album_id = s6Var.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(zs0 zs0Var, long j3, int i7, String str) {
        di.n6 B = zs0Var.getStoriesController().B(j3, true);
        int i10 = B.a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        ((di.s6) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.qp.s1(i10).j1(B.b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getPlaylistTopicId() {
        if (org.telegram.messenger.t3.b0(this.x1.getCurrentAccount(), this.l1)) {
            return this.F;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public di.z6 getStoriesController() {
        return org.telegram.messenger.qp.s1(this.x1.getCurrentAccount()).P1();
    }

    public static /* synthetic */ void h(zs0 zs0Var, TL_stories.StoryItem storyItem) {
        zs0Var.getStoriesController().r0(zs0Var.l1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        hc.a0(zs0Var.x1).G(R.raw.chats_archived, 5000, org.telegram.messenger.id.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(zs0 zs0Var, HashSet hashSet, TL_stories.StoryItem storyItem, l60 l60Var, di.s6 s6Var) {
        String a02;
        long j3 = zs0Var.l1;
        if (hashSet.contains(Integer.valueOf(s6Var.a))) {
            zs0Var.getStoriesController().c(s6Var.a, j3, storyItem);
            a02 = org.telegram.messenger.id.a0(null, null, 2131744731, s6Var.b);
        } else {
            di.z6 storiesController = zs0Var.getStoriesController();
            int i7 = s6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i7, j3, arrayList);
            a02 = org.telegram.messenger.id.a0(null, null, 2131744494, s6Var.b);
        }
        hc.a0(zs0Var.x1).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.X2(a02)).j();
        l60Var.u();
    }

    public static int o(View view) {
        if (view instanceof org.telegram.ui.Cells.o7) {
            return ((org.telegram.ui.Cells.o7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            return ((org.telegram.ui.Cells.h7) view).getMessage().e1();
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            return ((org.telegram.ui.Cells.g7) view).getMessage().e1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab o0(int i7, boolean z9) {
        if (i7 != 8 && i7 != 14 && !z9) {
            return null;
        }
        if (i7 == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i7 == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i7 == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i7 == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i7 == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i7 == 5) {
            return new TLRPC.TL_profileTabGifs();
        }
        if (i7 == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i7 != 14) {
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

    public static void p1(int i7, View view) {
        if (view == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.topMargin != i7) {
            marginLayoutParams.topMargin = i7;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void s(ur0 ur0Var, os0[] os0VarArr, boolean z9) {
        w80 w80Var;
        if (!z9) {
            if (ur0Var.F == null || (w80Var = ur0Var.G) == null) {
                return;
            }
            org.telegram.messenger.g0.r(w80Var);
            ur0Var.G.run();
            ur0Var.G = null;
            ur0Var.F = null;
            return;
        }
        if (org.telegram.messenger.iz.v1 <= 0 || ur0Var.F != null || ur0Var.H || ur0Var.h.getFastScroll() == null || !ur0Var.h.getFastScroll().a0 || ur0Var.h.getFastScroll().getVisibility() != 0 || os0VarArr[0].e() < 50) {
            return;
        }
        int i7 = org.telegram.messenger.iz.v1;
        int i10 = i7 - 1;
        if (i7 != i10) {
            org.telegram.messenger.iz.v1 = i10;
            org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.iz.v1).apply();
        }
        ur0Var.H = true;
        Context context = ur0Var.getContext();
        di.b4 b4Var = new di.b4(context, 18);
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131745408, null));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i11 = org.telegram.ui.ActionBar.l6.dg;
        org.telegram.ui.ActionBar.s6.U(textView, i11, null);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i12 = org.telegram.ui.ActionBar.l6.eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i12);
        b4Var.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(b4Var, d02, M, null, null);
        b4Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        ro0 ro0Var = new ro0(context);
        ro0Var.a = new Random();
        Paint paint = new Paint(1);
        ro0Var.b = paint;
        Paint paint2 = new Paint(1);
        ro0Var.c = paint2;
        ro0Var.f = 1.0f;
        ro0Var.h = 0.0f;
        paint.setColor(i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i11, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, i11, false));
        Paint paint3 = new Paint();
        ro0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        ro0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        b4Var.addView(ro0Var, c8.ha.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        ur0Var.F = b4Var;
        ur0Var.addView(b4Var, c8.ha.c(-2.0f, -2));
        ur0Var.F.setAlpha(0.0f);
        ur0Var.F.setScaleX(0.8f);
        ur0Var.F.setScaleY(0.8f);
        ur0Var.F.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        ur0Var.invalidate();
        w80 w80Var2 = new w80(14, ur0Var, b4Var);
        ur0Var.G = w80Var2;
        org.telegram.messenger.g0.i3(w80Var2, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z9) {
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        if (y4Var != null) {
            y4Var.setEnabled(z9);
        } else {
            this.G.setEnabled(z9);
        }
    }

    private void setPageOverscan(tr0 tr0Var) {
        if (!this.b2 || tr0Var == null) {
            return;
        }
        tr0Var.i3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tr0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            int i7 = marginLayoutParams.topMargin;
            int i10 = -this.d2;
            if (i7 == i10 && marginLayoutParams.bottomMargin == (-this.e2)) {
                return;
            }
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -this.e2;
            tr0Var.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchItemVisibility(int i7) {
        org.telegram.ui.ActionBar.r0 r0Var = this.p0;
        if (r0Var == null) {
            return;
        }
        if (this.H != null) {
            R(true, true);
        } else {
            r0Var.setVisibility(i7);
        }
    }

    public static void t(zs0 zs0Var, int i7, boolean z9) {
        ur0[] ur0VarArr = zs0Var.m0;
        if (ur0VarArr[0].E == i7) {
            return;
        }
        ur0 ur0Var = ur0VarArr[1];
        ur0Var.E = i7;
        ur0Var.setVisibility(0);
        zs0Var.w0();
        zs0Var.B1(true);
        zs0Var.j1 = z9;
        zs0Var.Y0();
        zs0Var.E(!zs0Var.F0(i7));
        zs0Var.I1(true);
    }

    public static int x(zs0 zs0Var, v4.g0 g0Var) {
        if (g0Var == zs0Var.e0) {
            return 8;
        }
        if (g0Var == zs0Var.g0) {
            return 9;
        }
        for (ys0 ys0Var : zs0Var.l2.values()) {
            if (ys0Var.c == g0Var) {
                return ys0Var.a;
            }
        }
        return -1;
    }

    public static int y(zs0 zs0Var, v4.g0 g0Var) {
        if (g0Var == zs0Var.f0) {
            return 8;
        }
        if (g0Var == zs0Var.h0) {
            return 9;
        }
        for (ys0 ys0Var : zs0Var.l2.values()) {
            if (ys0Var.d == g0Var) {
                return ys0Var.a;
            }
        }
        return -1;
    }

    public static boolean z0(int i7) {
        return i7 == 8 || i7 == 9 || J0(i7);
    }

    public final SpannableStringBuilder A() {
        if (this.Z1 == null) {
            this.Z1 = new SpannableStringBuilder();
            if (B0()) {
                this.Z1.append((CharSequence) org.telegram.messenger.id.M0(2131746702, null));
            } else {
                this.Z1.append((CharSequence) "c");
                this.Z1.setSpan(new wp(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.Z1.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.id.M0(2131744809, null));
            }
        }
        return this.Z1;
    }

    public boolean A0() {
        return false;
    }

    public final ws0 A1(int i7) {
        ys0 y12;
        if (i7 == 8) {
            return this.f0;
        }
        if (i7 == 9) {
            return this.h0;
        }
        if (!J0(i7) || (y12 = y1(i7)) == null) {
            return null;
        }
        return y12.d;
    }

    public final void B(yr0 yr0Var, org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7) {
        String n10 = j3 > 0 ? org.telegram.messenger.t10.n(org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).a2(Long.valueOf(j3))) : org.telegram.messenger.t3.K(org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).M0(Long.valueOf(-j3)), false);
        if (n10 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.recaptcha.internal.a.s(sb2, org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).U2, "/", n10, "/a/");
        sb2.append(i7);
        yr0Var.b0(R.drawable.media_share, new ng(this, sb2.toString(), f2Var, 20), org.telegram.messenger.id.M0(2131744788, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User a22;
        long j3 = this.l1;
        return j3 > 0 && (a22 = org.telegram.messenger.qp.s1(this.x1.getCurrentAccount()).a2(Long.valueOf(j3))) != null && a22.bot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B1(boolean z9) {
        ur0[] ur0VarArr;
        ur0[] ur0VarArr2;
        org.telegram.ui.ActionBar.r0 r0Var;
        v4.u0 u0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        v4.u0 u0Var2;
        int i7;
        int i10;
        int i11;
        boolean z13;
        v4.u0 u0Var3;
        int i12;
        int i13;
        boolean z14;
        v4.u0 u0Var4;
        vp0 vp0Var = this.a0;
        if (vp0Var != null) {
            vp0Var.i();
        }
        int i14 = 0;
        while (true) {
            ur0VarArr = this.m0;
            if (i14 >= ur0VarArr.length) {
                break;
            }
            ur0VarArr[i14].h.C0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ur0VarArr[z9 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        v4.g0 adapter = ur0VarArr[z9 ? 1 : 0].h.getAdapter();
        v4.g0 g0Var = this.e0;
        v4.y yVar = this.d0;
        if (adapter == g0Var) {
            yVar.h(null);
        }
        boolean z15 = this.X0;
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        or0 or0Var = this.F1;
        org.telegram.ui.ActionBar.k kVar = this.G;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.p0;
        is0 is0Var = this.P;
        int i15 = 100;
        if (z15 && this.W0) {
            ur0 ur0Var = ur0VarArr[z9 ? 1 : 0];
            if (ur0Var.f == null) {
                ur0Var.f = new v4.u0();
            }
            ur0 ur0Var2 = ur0VarArr[z9 ? 1 : 0];
            v4.u0 u0Var5 = ur0Var2.f;
            ls0 ls0Var = this.U;
            sr0 sr0Var = this.l0;
            wr0 wr0Var = this.j0;
            wr0 wr0Var2 = this.k0;
            wr0 wr0Var3 = this.i0;
            if (z9) {
                int i16 = ur0Var2.E;
                if (i16 != 0) {
                    u0Var4 = u0Var5;
                    if (i16 != 2 && i16 != 5 && i16 != 6 && (i16 != 7 || or0Var.X())) {
                        String obj = r0Var2 != null ? r0Var2.getSearchField().getText().toString() : "";
                        int i17 = ur0VarArr[z9 ? 1 : 0].E;
                        if (i17 == 1) {
                            if (wr0Var3 != null) {
                                wr0Var3.G(obj, false);
                                if (adapter != wr0Var3) {
                                    i1(adapter);
                                    ur0VarArr[z9 ? 1 : 0].h.setAdapter(wr0Var3);
                                }
                            }
                        } else if (i17 == 3) {
                            if (wr0Var2 != null) {
                                wr0Var2.G(obj, false);
                                if (adapter != wr0Var2) {
                                    i1(adapter);
                                    ur0VarArr[z9 ? 1 : 0].h.setAdapter(wr0Var2);
                                }
                            }
                        } else if (i17 == 4) {
                            if (wr0Var != null) {
                                wr0Var.G(obj, false);
                                if (adapter != wr0Var) {
                                    i1(adapter);
                                    ur0VarArr[z9 ? 1 : 0].h.setAdapter(wr0Var);
                                }
                            }
                        } else if (i17 == 7) {
                            if (sr0Var != null) {
                                sr0Var.F(obj, false);
                                if (adapter != sr0Var) {
                                    i1(adapter);
                                    ur0VarArr[z9 ? 1 : 0].h.setAdapter(sr0Var);
                                }
                            }
                        } else if (i17 == 11) {
                            if (ls0Var != null) {
                                ls0Var.E(this.Y0, obj);
                                if (adapter != ls0Var) {
                                    i1(adapter);
                                    ur0VarArr[z9 ? 1 : 0].h.setAdapter(ls0Var);
                                }
                            }
                        } else if (i17 == 15 && is0Var != null && adapter != is0Var) {
                            i1(adapter);
                            dq0 dq0Var = ur0VarArr[z9 ? 1 : 0].h;
                            is0Var.r = dq0Var;
                            dq0Var.setAdapter(is0Var);
                        }
                    }
                }
                this.X0 = false;
                sq0 sq0Var = this.L0;
                if (sq0Var != null) {
                    sq0Var.g(false);
                }
                this.W0 = false;
                B1(true);
                return;
            }
            u0Var4 = u0Var5;
            if (ur0Var2.h != null) {
                int i18 = ur0Var2.E;
                if (i18 == 1) {
                    if (adapter != wr0Var3) {
                        i1(adapter);
                        ur0VarArr[z9 ? 1 : 0].h.setAdapter(wr0Var3);
                    }
                    wr0Var3.f();
                } else if (i18 == 3) {
                    if (adapter != wr0Var2) {
                        i1(adapter);
                        ur0VarArr[z9 ? 1 : 0].h.setAdapter(wr0Var2);
                    }
                    wr0Var2.f();
                } else if (i18 == 4) {
                    if (adapter != wr0Var) {
                        i1(adapter);
                        ur0VarArr[z9 ? 1 : 0].h.setAdapter(wr0Var);
                    }
                    wr0Var.f();
                } else if (i18 == 7) {
                    if (adapter != sr0Var) {
                        i1(adapter);
                        ur0VarArr[z9 ? 1 : 0].h.setAdapter(sr0Var);
                    }
                    sr0Var.f();
                } else if (i18 == 11) {
                    if (adapter != ls0Var) {
                        i1(adapter);
                        ur0VarArr[z9 ? 1 : 0].h.setAdapter(ls0Var);
                    }
                    ls0Var.f();
                }
            }
            ur0VarArr2 = ur0VarArr;
            r0Var = r0Var2;
            u0Var3 = u0Var4;
            i10 = 4;
            z12 = false;
            z13 = false;
            i11 = 8;
        } else {
            ur0 ur0Var3 = ur0VarArr[z9 ? 1 : 0];
            if (ur0Var3.e == null) {
                ur0Var3.e = new v4.u0();
            }
            ur0 ur0Var4 = ur0VarArr[z9 ? 1 : 0];
            v4.u0 u0Var6 = ur0Var4.e;
            ur0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = ur0VarArr[z9 ? 1 : 0].E;
            if (i19 == 8 || J0(i19)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
            }
            dq0 dq0Var2 = ur0VarArr[z9 ? 1 : 0].h;
            int paddingLeft = dq0Var2.getPaddingLeft();
            ur0 ur0Var5 = ur0VarArr[z9 ? 1 : 0];
            ur0VarArr2 = ur0VarArr;
            dq0 dq0Var3 = ur0Var5.h;
            int j02 = j0(ur0Var5.E);
            dq0Var3.g3 = j02;
            int paddingRight = ur0VarArr2[z9 ? 1 : 0].h.getPaddingRight();
            dq0 dq0Var4 = ur0VarArr2[z9 ? 1 : 0].h;
            r0Var = r0Var2;
            int i02 = i0(I0());
            dq0Var4.h3 = i02;
            dq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i20 = ur0VarArr2[z9 ? 1 : 0].E;
            int[] iArr = this.o1;
            v4.g0 g0Var2 = this.M;
            View view = this.W;
            ks0 ks0Var = this.T;
            nr0 nr0Var = this.R;
            gr0 gr0Var = this.V;
            os0[] os0VarArr = this.v1;
            if (i20 == 0) {
                v4.g0 g0Var3 = this.J;
                if (adapter != g0Var3) {
                    i1(adapter);
                    ur0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var3);
                }
                int i21 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                os0 os0Var = os0VarArr[0];
                boolean z16 = os0Var.h && !os0Var.e.isEmpty();
                i15 = iArr[0];
                ur0VarArr2[z9 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.A0);
                os0 os0Var2 = os0VarArr[0];
                if (os0Var2.x == null) {
                    os0Var2.x = new v4.u0();
                }
                u0Var = os0VarArr[0].x;
                z12 = z16;
                z10 = false;
            } else {
                if (i20 == 1) {
                    os0 os0Var3 = os0VarArr[1];
                    z11 = os0Var3.h && !os0Var3.e.isEmpty();
                    if (adapter != g0Var2) {
                        i1(adapter);
                        ur0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var2);
                    }
                } else if (i20 == 2) {
                    os0 os0Var4 = os0VarArr[2];
                    z11 = os0Var4.h && !os0Var4.e.isEmpty();
                    v4.g0 g0Var4 = this.N;
                    if (adapter != g0Var4) {
                        i1(adapter);
                        ur0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var4);
                    }
                } else {
                    if (i20 == 3) {
                        v4.g0 g0Var5 = this.L;
                        if (adapter != g0Var5) {
                            i1(adapter);
                            ur0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var5);
                        }
                    } else if (i20 == 4) {
                        os0 os0Var5 = os0VarArr[4];
                        z11 = os0Var5.h && !os0Var5.e.isEmpty();
                        v4.g0 g0Var6 = this.O;
                        if (adapter != g0Var6) {
                            i1(adapter);
                            ur0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var6);
                        }
                    } else {
                        if (i20 == 5) {
                            v4.g0 g0Var7 = this.Q;
                            if (adapter != g0Var7) {
                                i1(adapter);
                                ur0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var7);
                            }
                        } else if (i20 == 15) {
                            if (adapter != is0Var) {
                                i1(adapter);
                                dq0 dq0Var5 = ur0VarArr2[z9 ? 1 : 0].h;
                                is0Var.r = dq0Var5;
                                dq0Var5.setAdapter(is0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != nr0Var) {
                                i1(adapter);
                                ur0VarArr2[z9 ? 1 : 0].h.setAdapter(nr0Var);
                            }
                        } else if (i20 == 7) {
                            v4.g0 g0Var8 = this.c0;
                            if (adapter != g0Var8) {
                                i1(adapter);
                                ur0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var8);
                            }
                        } else if (z0(i20)) {
                            v4.g0 z17 = z1(ur0VarArr2[z9 ? 1 : 0].E);
                            if (adapter != z17) {
                                i1(adapter);
                                ur0VarArr2[z9 ? 1 : 0].h.setAdapter(z17);
                                ur0VarArr2[z9 ? 1 : 0].h.getClass();
                            }
                            ur0 ur0Var6 = ur0VarArr2[z9 ? 1 : 0];
                            if (ur0Var6.E != 9) {
                                yVar.h(ur0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = ur0VarArr2[z9 ? 1 : 0].E;
                            if (i22 == 10) {
                                v4.g0 g0Var9 = this.S;
                                if (adapter != g0Var9) {
                                    i1(adapter);
                                    ur0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var9);
                                }
                            } else if (i22 == 11) {
                                if (adapter != ks0Var) {
                                    i1(adapter);
                                    ur0VarArr2[z9 ? 1 : 0].h.setAdapter(ks0Var);
                                    v4.y yVar2 = ks0Var.w;
                                    dq0 dq0Var6 = ur0VarArr2[z9 ? 1 : 0].h;
                                    ks0Var.s = dq0Var6;
                                    yVar2.h(dq0Var6);
                                }
                                u0Var = ks0Var.r;
                                z10 = true;
                                z12 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ur0VarArr2[z9 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gr0Var.getParent() != ur0VarArr2[z9 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(gr0Var);
                                    ur0VarArr2[z9 ? 1 : 0].addView(gr0Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    p1(org.telegram.messenger.g0.L(56.0f) + this.c2, gr0Var);
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ur0VarArr2[z9 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != ur0VarArr2[z9 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    ur0VarArr2[z9 ? 1 : 0].addView(view);
                                    p1(this.c2, view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ur0VarArr2[z9 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vp0Var != null && vp0Var.getParent() != ur0VarArr2[z9 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(vp0Var);
                                    ur0VarArr2[z9 ? 1 : 0].addView(vp0Var);
                                    ur0VarArr2[z9 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        u0Var = u0Var6;
                        z10 = false;
                        z12 = false;
                    }
                    u0Var = u0Var6;
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                u0Var = u0Var6;
                z10 = true;
            }
            K1(ur0VarArr2[z9 ? 1 : 0]);
            if (z10) {
                ur0VarArr2[z9 ? 1 : 0].h.setSections(false);
                u0Var2 = u0Var;
            } else {
                dq0 dq0Var7 = ur0VarArr2[z9 ? 1 : 0].h;
                dq0Var7.getClass();
                u0Var2 = u0Var;
                org.telegram.ui.ActionBar.s6.l(dq0Var7, 20, org.telegram.ui.ActionBar.l6.i6, dq0Var7.n2);
                dq0Var7.T2 = false;
                dq0Var7.H2 = null;
                dq0Var7.I2 = null;
                dq0Var7.L2 = 0.0f;
                dq0Var7.M2 = null;
                dq0Var7.N2 = null;
                dq0Var7.J2 = null;
                aj0 aj0Var = dq0Var7.G2;
                if (aj0Var != null) {
                    dq0Var7.q0(aj0Var);
                    dq0Var7.G2 = null;
                }
                q9 q9Var = dq0Var7.R2;
                if (q9Var != null) {
                    dq0Var7.q0(q9Var);
                    dq0Var7.R2 = null;
                }
            }
            J1(ur0VarArr2[z9 ? 1 : 0]);
            ur0 ur0Var7 = ur0VarArr2[z9 ? 1 : 0];
            if (ur0Var7.E == 11) {
                ur0Var7.h.setItemAnimator(ur0Var7.d);
            } else {
                ur0Var7.h.setItemAnimator(null);
                if (ks0Var != null && ur0VarArr2[z9 ? 1 : 0].h == ks0Var.s) {
                    v4.y yVar3 = ks0Var.w;
                    ks0Var.s = null;
                    yVar3.h(null);
                }
            }
            if (gr0Var != null && ur0VarArr2[z9 ? 1 : 0].E != 12 && gr0Var.getParent() == ur0VarArr2[z9 ? 1 : 0]) {
                gr0Var.a.onRemoveFromParent();
                ur0VarArr2[z9 ? 1 : 0].removeView(gr0Var);
            }
            if (view != null && ur0VarArr2[z9 ? 1 : 0].E != 13) {
                ViewParent parent = view.getParent();
                ur0 ur0Var8 = ur0VarArr2[z9 ? 1 : 0];
                if (parent == ur0Var8) {
                    ur0Var8.removeView(view);
                }
            }
            if (vp0Var != null && ur0VarArr2[z9 ? 1 : 0].E != 14) {
                ViewParent parent2 = vp0Var.getParent();
                ur0 ur0Var9 = ur0VarArr2[z9 ? 1 : 0];
                if (parent2 == ur0Var9) {
                    ur0Var9.removeView(vp0Var);
                }
            }
            int i23 = ur0VarArr2[z9 ? 1 : 0].E;
            if (i23 != 0 && i23 != 11 && !z0(i23) && (i12 = ur0VarArr2[z9 ? 1 : 0].E) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || or0Var.X()) && (i13 = ur0VarArr2[z9 ? 1 : 0].E) != 10 && i13 != 13 && i13 != 14)) {
                if (z9) {
                    if (r0Var != null && r0Var.getVisibility() == 4) {
                        if (!(y4Var != null ? y4Var.F : kVar.n0)) {
                            if (I()) {
                                this.z0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                setSearchItemVisibility(I0() ? 8 : 4);
                            }
                            float f10 = z9 ? 1.0f : 0.0f;
                            this.q0 = l0(f10);
                            M1(1.0f - f10);
                            z14 = false;
                        }
                    }
                    z14 = false;
                    this.z0 = 0;
                    this.q0 = 1.0f;
                } else {
                    z14 = false;
                    if (r0Var != null && r0Var.getVisibility() == 4) {
                        if (I()) {
                            this.z0 = 0;
                            this.q0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            setSearchItemVisibility(I0() ? 8 : 4);
                            this.q0 = 0.0f;
                        }
                    }
                }
                I1(z14);
            } else if (z9) {
                this.z0 = 2;
            } else {
                this.z0 = 0;
                if (r0Var != null) {
                    setSearchItemVisibility((I0() || this.X0) ? 8 : 4);
                }
            }
            int i24 = ur0VarArr2[z9 ? 1 : 0].E;
            if (i24 == 6) {
                if (!nr0Var.e && !nr0Var.h && nr0Var.d.isEmpty()) {
                    nr0Var.E(0L);
                }
            } else if (i24 != 7) {
                if (z0(i24)) {
                    ws0 z18 = z1(ur0VarArr2[z9 ? 1 : 0].E);
                    if (z18 != null) {
                        di.r6 r6Var = z18.s;
                        z18.P();
                        ur0VarArr2[z9 ? 1 : 0].w.e(r6Var != null && (r6Var.k() || (t0() && r6Var.g() > 0)), z9);
                        z12 = (r6Var == null || r6Var.g() <= 0 || G0()) ? false : true;
                    }
                } else {
                    int i25 = ur0VarArr2[z9 ? 1 : 0].E;
                    if (i25 != 10 && i25 != 11 && i25 != 12 && i25 != 13 && i25 != 14) {
                        if (i25 == 15) {
                            i25 = 8;
                        }
                        os0 os0Var6 = os0VarArr[i25];
                        if (!os0Var6.g && !os0Var6.i[0] && os0Var6.a.isEmpty()) {
                            os0VarArr[i25].g = true;
                            g0Var2.f();
                            if (i25 == 0) {
                                int i26 = os0VarArr[0].q;
                                if (i26 == 1) {
                                    i7 = 6;
                                } else if (i26 == 2) {
                                    i7 = 7;
                                }
                                org.telegram.ui.ActionBar.f2 f2Var = this.x1;
                                f2Var.getMediaDataController().N0(this.l1, 50, 0, 0, i7, this.F, 1, f2Var.getClassGuid(), os0VarArr[i7].p, null, null);
                            }
                            i7 = i25;
                            org.telegram.ui.ActionBar.f2 f2Var2 = this.x1;
                            f2Var2.getMediaDataController().N0(this.l1, 50, 0, 0, i7, this.F, 1, f2Var2.getClassGuid(), os0VarArr[i7].p, null, null);
                        }
                    }
                }
            }
            int i27 = ur0VarArr2[z9 ? 1 : 0].E;
            if (i27 == 8 || J0(i27)) {
                i10 = 4;
                ur0 ur0Var10 = ur0VarArr2[z9 ? 1 : 0];
                pq0 pq0Var = ur0Var10.w;
                boolean J0 = J0(ur0Var10.E);
                int w12 = w1(ur0VarArr2[z9 ? 1 : 0].E);
                l9 l9Var = pq0Var.b;
                fi.d dVar = pq0Var.f;
                l9Var.setVisibility((J0 || H0() || B0()) ? 8 : 0);
                if (J0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.id.M0(2131744805, null), false);
                    i11 = 8;
                } else if (H0()) {
                    i11 = 8;
                    dVar.setVisibility(8);
                } else {
                    i11 = 8;
                    pq0Var.setStickerType(11);
                    dVar.setVisibility(!G0() ? 0 : 8);
                    dVar.h(A(), false);
                }
                if (J0) {
                    pq0Var.d.setText(org.telegram.messenger.id.M0(2131744783, null));
                    pq0Var.e.setText(org.telegram.messenger.id.M0(2131744784, null));
                } else {
                    pq0Var.d.setText(org.telegram.messenger.id.M0(!G0() ? I0() ? 2131748176 : 2131748147 : 2131748204, null));
                    pq0Var.e.setText(I0() ? org.telegram.messenger.id.M0(2131748148, null) : "");
                }
                z13 = false;
                dVar.setOnClickListener(new zo0(this, J0, w12, 0 == true ? 1 : 0));
            } else {
                ur0 ur0Var11 = ur0VarArr2[z9 ? 1 : 0];
                if (ur0Var11.E == 9) {
                    if (H0()) {
                        ur0VarArr2[z9 ? 1 : 0].w.b.setVisibility(8);
                        ur0VarArr2[z9 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        ur0VarArr2[z9 ? 1 : 0].w.b.setVisibility(0);
                        ur0VarArr2[z9 ? 1 : 0].w.setStickerType(11);
                        ur0VarArr2[z9 ? 1 : 0].w.f.setVisibility(0);
                        ur0VarArr2[z9 ? 1 : 0].w.f.h(A(), false);
                    }
                    ur0VarArr2[z9 ? 1 : 0].w.d.setText(org.telegram.messenger.id.M0(2131748246, null));
                    ur0VarArr2[z9 ? 1 : 0].w.e.setText(I0() ? org.telegram.messenger.id.M0(2131748247, null) : "");
                    i10 = 4;
                    ur0VarArr2[z9 ? 1 : 0].w.f.setOnClickListener(new uo0(this, i10));
                    z13 = false;
                    i11 = 8;
                } else {
                    i10 = 4;
                    ur0Var11.w.b.setVisibility(0);
                    ur0VarArr2[z9 ? 1 : 0].w.setStickerType(1);
                    ur0VarArr2[z9 ? 1 : 0].w.d.setText(org.telegram.messenger.id.M0(2131748167, null));
                    ur0VarArr2[z9 ? 1 : 0].w.e.setText(org.telegram.messenger.id.M0(2131745807, null));
                    i11 = 8;
                    ur0VarArr2[z9 ? 1 : 0].w.f.setVisibility(8);
                    z13 = false;
                }
            }
            ur0VarArr2[z9 ? 1 : 0].h.setVisibility(z13 ? 1 : 0);
            u0Var3 = u0Var2;
        }
        int i28 = i15;
        ur0 ur0Var12 = ur0VarArr2[z9 ? 1 : 0];
        ur0Var12.b = z12;
        F1(ur0Var12, z13);
        ur0VarArr2[z9 ? 1 : 0].x.y1(i28);
        ur0VarArr2[z9 ? 1 : 0].h.a0();
        if (u0Var3 != null) {
            ur0VarArr2[z9 ? 1 : 0].h.setRecycledViewPool(u0Var3);
            ur0VarArr2[z9 ? 1 : 0].n.setRecycledViewPool(u0Var3);
        }
        if (this.z0 == 2) {
            if (y4Var != null ? y4Var.F : kVar.n0) {
                this.B0 = true;
                if (y4Var != null) {
                    y4Var.k(true);
                } else {
                    kVar.m(true);
                }
                this.z0 = 0;
                this.q0 = 0.0f;
                if (r0Var != null) {
                    setSearchItemVisibility(I0() ? i11 : i10);
                }
                I1(false);
            }
        }
    }

    public final void C(yr0 yr0Var) {
        final View[] viewArr = new View[2];
        final int i7 = 0;
        viewArr[0] = yr0Var.b0(R.drawable.msg_zoomin, new Runnable(this) { // from class: org.telegram.ui.Components.jp0
            public final /* synthetic */ zs0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        zs0 zs0Var = this.b;
                        zs0Var.getClass();
                        View[] viewArr2 = viewArr;
                        zs0Var.Q1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        zs0 zs0Var2 = this.b;
                        zs0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        zs0Var2.R1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.id.M0(2131748650, null), false, false);
        final int i10 = 1;
        viewArr[1] = yr0Var.b0(R.drawable.msg_zoomout, new Runnable(this) { // from class: org.telegram.ui.Components.jp0
            public final /* synthetic */ zs0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        zs0 zs0Var = this.b;
                        zs0Var.getClass();
                        View[] viewArr2 = viewArr;
                        zs0Var.Q1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        zs0 zs0Var2 = this.b;
                        zs0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        zs0Var2.R1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.id.M0(2131748649, null), false, false);
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
        org.telegram.ui.ActionBar.f2 f2Var;
        if (this.f1 == null || (f2Var = this.x1) == null) {
            return false;
        }
        return org.telegram.messenger.t3.V(f2Var.getMessagesController().M0(Long.valueOf(this.f1.id)));
    }

    public final void C1(org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, Runnable runnable) {
        if (this.K1) {
            return;
        }
        if (z0Var2.getCheckView().a.q || !z0Var.getCheckView().a.q) {
            z0Var.setChecked(!z0Var.getCheckView().a.q);
            runnable.run();
        } else {
            float f10 = -this.u1;
            this.u1 = f10;
            org.telegram.messenger.g0.G3(f10, z0Var, null);
        }
    }

    public final void D(tr0 tr0Var, int i7, SparseBooleanArray sparseBooleanArray) {
        int childCount = tr0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tr0Var.getChildAt(i10);
            if (childAt instanceof mz) {
                view = childAt;
            }
        }
        if (view != null) {
            tr0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new ar0(this, tr0Var, sparseBooleanArray, (mz) view, i7));
    }

    public final boolean D0() {
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i7 >= ur0VarArr.length) {
                return false;
            }
            ur0 ur0Var = ur0VarArr[i7];
            if (ur0Var != null) {
                dq0 dq0Var = ur0Var.h;
                if (dq0Var != null && dq0Var.c0()) {
                    return true;
                }
                tr0 tr0Var = ur0VarArr[i7].n;
                if (tr0Var != null && tr0Var.c0()) {
                    return true;
                }
            }
            i7++;
        }
    }

    public final void D1() {
        if (this.H != null) {
            return;
        }
        try {
            int s02 = s0(org.telegram.ui.ActionBar.l6.y8);
            int s03 = s0(org.telegram.ui.ActionBar.l6.z8);
            if (s02 == this.q2 && s03 == this.r2) {
                return;
            }
            this.q2 = s02;
            this.r2 = s03;
            org.telegram.ui.ActionBar.r0[] r0VarArr = {this.w0, this.v0, this.x0, this.y0, this.n0};
            for (int i7 = 0; i7 < 5; i7++) {
                org.telegram.ui.ActionBar.r0 r0Var = r0VarArr[i7];
                if (r0Var != null) {
                    r0Var.setIconColor(s02);
                    if (r0Var.getBackground() != null) {
                        org.telegram.ui.ActionBar.l6.H1(r0Var.getBackground(), s03, true);
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void E(boolean z9) {
        dh0 dh0Var = this.u0;
        if (dh0Var == null || this.Y1 == z9) {
            return;
        }
        this.Y1 = z9;
        if (z9 || dh0Var.getAnimatedDrawable().a0 >= 20) {
            dh0Var.getAnimatedDrawable().P(this.Y1 ? 50 : 100);
        } else {
            dh0Var.getAnimatedDrawable().P(0);
        }
        dh0Var.getAnimatedDrawable().start();
    }

    public final boolean E0() {
        vp0 vp0Var = this.a0;
        if (vp0Var != null && vp0Var.g()) {
            return true;
        }
        zp0 zp0Var = this.b0;
        return zp0Var != null && zp0Var.f;
    }

    public final void E1() {
        if (D0()) {
            post(new to0(this, 13));
            return;
        }
        fr0 fr0Var = this.J;
        if (fr0Var != null) {
            fr0Var.f();
        }
        ms0 ms0Var = this.M;
        if (ms0Var != null) {
            ms0Var.f();
        }
        ms0 ms0Var2 = this.N;
        if (ms0Var2 != null) {
            ms0Var2.f();
        }
        ns0 ns0Var = this.L;
        if (ns0Var != null) {
            ns0Var.X(false);
        }
        ms0 ms0Var3 = this.O;
        if (ms0Var3 != null) {
            ms0Var3.f();
        }
        is0 is0Var = this.P;
        if (is0Var != null) {
            is0Var.f();
        }
        pr0 pr0Var = this.Q;
        if (pr0Var != null) {
            pr0Var.f();
        }
        ir0 ir0Var = this.e0;
        if (ir0Var != null) {
            ir0Var.f();
        }
        Iterator it = this.l2.values().iterator();
        while (it.hasNext()) {
            ((ys0) it.next()).c.f();
        }
    }

    public final void F(int i7) {
        int i10;
        ur0 g02 = g0(this.r1);
        this.s = -1;
        if (g02 != null) {
            g02.h.C0();
            this.s1 = i7;
            g02.n.setVisibility(0);
            if (z0(this.r1)) {
                g02.n.setAdapter(A1(this.r1));
            } else {
                g02.n.setAdapter(this.K);
            }
            tr0 tr0Var = g02.n;
            int paddingLeft = tr0Var.getPaddingLeft();
            tr0 tr0Var2 = g02.n;
            int j02 = j0(g02.E);
            tr0Var2.g3 = j02;
            int paddingRight = g02.n.getPaddingRight();
            tr0 tr0Var3 = g02.n;
            int i02 = i0(I0());
            tr0Var3.h3 = i02;
            tr0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.r.y1(i7);
            g02.n.a0();
            int i11 = 0;
            while (true) {
                ur0[] ur0VarArr = this.m0;
                if (i11 >= ur0VarArr.length) {
                    break;
                }
                ur0 ur0Var = ur0VarArr[i11];
                if (ur0Var != null && ((i10 = ur0Var.E) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.b4(ur0VarArr[i11].h);
                }
                i11++;
            }
            int i12 = 1;
            this.q1 = true;
            if (this.r1 == 0) {
                this.v1[0].g(true);
            }
            this.p1 = 0.0f;
            j1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L1.d();
            ofFloat.addUpdateListener(new uq0(this, g02, i12));
            ofFloat.addListener(new hi.p2(this, z0(g02.E) ? 1 : 0, i7, 2));
            ofFloat.setInterpolator(xq.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean F0(int i7) {
        return i7 == 7 ? this.F1.X() : (G0() || i7 == 0 || z0(i7) || i7 == 2 || i7 == 5 || i7 == 6 || i7 == 11 || i7 == 10 || i7 == 13 || i7 == 14 || i7 == 15) ? false : true;
    }

    public final void F1(ur0 ur0Var, boolean z9) {
        boolean z10 = ur0Var.b && this.d;
        vi0 fastScroll = ur0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = ur0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ur0Var.c.cancel();
        }
        if (!z9) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z10 ? 0 : 8);
            fastScroll.setTag(z10 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z10 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<vi0, Float>) property, fastScroll.getAlpha(), 1.0f);
            ur0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z10 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<vi0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new t9(fastScroll));
        ur0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public final void G() {
        int i7 = this.c2;
        int i10 = this.o2;
        p1((org.telegram.messenger.g0.L(6.666f) + i7) - v2, this.R0);
        int i11 = i7 + i10;
        p1(i11, this.K0);
        p1(i11, this.D0);
        p1(org.telegram.messenger.g0.L(52.0f) + i7 + i10, this.M0);
        p1(org.telegram.messenger.g0.L(4.0f) + i7 + i10, this.L0);
        p1(org.telegram.messenger.g0.L(48.0f) + i7 + i10, this.b0);
        if (this.k2 != i10) {
            this.k2 = i10;
            Runnable runnable = this.j2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean G0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void G1() {
        org.telegram.ui.ActionBar.r0 r0Var = this.v0;
        if (r0Var == null) {
            return;
        }
        boolean z9 = this.x1.getMessagesController().A2(this.l1) || u0();
        r0Var.setAlpha(z9 ? 0.5f : 1.0f);
        if (z9 && r0Var.getBackground() != null) {
            r0Var.setBackground(null);
            return;
        }
        if (z9 || r0Var.getBackground() != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.l6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(s0(i7), 5, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        r0Var.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(r0Var, h02, null, M, this.H1);
    }

    public final boolean H() {
        boolean B0 = B0();
        long j3 = this.l1;
        org.telegram.ui.ActionBar.f2 f2Var = this.x1;
        if (B0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).a2(Long.valueOf(j3));
            return a22 != null && a22.bot && a22.bot_can_edit;
        }
        if (I0()) {
            return true;
        }
        return f2Var != null && f2Var.getMessagesController().P1().h(j3);
    }

    public boolean H0() {
        return false;
    }

    public final void H1() {
        vp0 vp0Var = this.a0;
        if (vp0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.c2;
            pr prVar = this.R0;
            vp0Var.setPaddingTop(L + (prVar != null ? (int) prVar.c(org.telegram.messenger.g0.L(7.0f)) : 0));
        }
    }

    public boolean I() {
        return !(this instanceof p20);
    }

    public boolean I0() {
        return false;
    }

    public final void I1(boolean z9) {
        vp0 vp0Var;
        zp0 zp0Var;
        R(true, true);
        dh0 dh0Var = this.u0;
        if (dh0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.X0 && (((vp0Var = this.a0) == null || !vp0Var.g()) && ((zp0Var = this.b0) == null || !zp0Var.f))) {
            f10 = Utilities.i(this.q0 + this.r0, 1.0f, 0.0f);
        }
        dh0Var.setAlpha(f10);
        if (z9) {
            E(k0(1.0f) > 0.5f);
        } else if (this.z0 == 2) {
            E(this.r0 > 0.1f);
        } else {
            E(this.q0 < 0.1f);
        }
    }

    public final boolean J() {
        ur0 ur0Var;
        ur0[] ur0VarArr = this.m0;
        if (ur0VarArr != null && (ur0Var = ur0VarArr[0]) != null) {
            boolean z02 = z0(ur0Var.E);
            int i7 = this.o1[z02 ? 1 : 0];
            if (i7 != h0(z02 ? 1 : 0, i7, true)) {
                return true;
            }
        }
        return false;
    }

    public final void J1(ur0 ur0Var) {
        boolean b12 = ur0Var.h.b1();
        if (b12) {
            ur0Var.h.setSectionsDrawBackground(this.b2);
        }
        ur0Var.setDrawPageBackground((!this.b2 || b12 || ur0Var.E == 15) ? false : true);
        if (ur0Var.E != 15) {
            ur0Var.setClipToOutline(false);
            ur0Var.setBackground(null);
            ur0Var.setWallpaper(null);
            return;
        }
        Drawable drawable = ur0Var.O;
        if (drawable == null) {
            drawable = ur0Var.getBackground();
        }
        Drawable e10 = fi.y5.e(drawable, this.x1.getCurrentAccount(), this.l1, org.telegram.ui.ActionBar.l6.I.q());
        if (this.b2) {
            ur0Var.setBackground(null);
            ur0Var.setClipToOutline(false);
            ur0Var.setWallpaper(e10);
        } else {
            ur0Var.setWallpaper(null);
            ur0Var.setBackground(e10);
            ur0Var.setOutlineProvider(new bg.q0(15));
            ur0Var.setClipToOutline(true);
        }
    }

    public final boolean K() {
        ur0 ur0Var;
        ur0[] ur0VarArr = this.m0;
        if (ur0VarArr == null || (ur0Var = ur0VarArr[0]) == null) {
            return false;
        }
        if (this.m1 && z0(ur0Var.E)) {
            return false;
        }
        boolean z02 = z0(ur0VarArr[0].E);
        int i7 = this.o1[z02 ? 1 : 0];
        return i7 != h0(z02 ? 1 : 0, i7, false);
    }

    public final boolean K0() {
        if (H() && ((getClosestTab() == 8 || getClosestTab() == 13 || J0(getClosestTab())) && this.E1)) {
            return false;
        }
        vp0 vp0Var = this.a0;
        if (vp0Var != null && vp0Var.g()) {
            return false;
        }
        zp0 zp0Var = this.b0;
        return ((zp0Var != null && zp0Var.f) || this.q1 || this.i1) ? false : true;
    }

    public final void K1(ur0 ur0Var) {
        int i7 = ur0Var.E;
        boolean z9 = i7 == 0 || z0(i7);
        FrameLayout.LayoutParams d = c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, z9 ? 0.0f : 12.0f, (z9 ? 8 : 12) + 48, z9 ? 0.0f : 12.0f, z9 ? 0.0f : 12.0f);
        d.topMargin = n0(ur0Var.E) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = ur0Var.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        ur0Var.s.setLayoutParams(d);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        tp0 tp0Var;
        gr0 gr0Var;
        vp0 vp0Var;
        ur0[] ur0VarArr = this.m0;
        int length = ur0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            ur0 ur0Var = ur0VarArr[i7];
            if (ur0Var != null && ur0Var.getVisibility() == 0) {
                if (ur0Var.O != null) {
                    RectF rectF2 = this.i2;
                    if (jh.k.c(ur0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        ur0Var.h(canvas);
                        canvas.restore();
                    }
                }
                if (ur0Var.E == 14 && (vp0Var = this.a0) != null && vp0Var.getParent() == ur0Var) {
                    for (View view : vp0Var.h.getViewPages()) {
                        if ((view instanceof zh.z1) && view.getVisibility() == 0) {
                            fi.w3 w3Var = ((zh.z1) view).f;
                            ih.d.a(w3Var, canvas, rectF, w3Var, viewGroup);
                        }
                    }
                } else {
                    qj0 currentListView = (ur0Var.E == 12 && (gr0Var = this.V) != null && gr0Var.getParent() == ur0Var) ? gr0Var.a.z0 : (ur0Var.E == 13 && (tp0Var = this.W) != null && tp0Var.getParent() == ur0Var) ? tp0Var.getCurrentListView() : ur0Var.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        ih.d.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(int i7, int i10, int i11, boolean z9) {
        os0[] os0VarArr = this.v1;
        os0VarArr[i7].a.clear();
        os0VarArr[i7].b[0].clear();
        os0VarArr[i7].b[1].clear();
        os0 os0Var = os0VarArr[i7];
        os0Var.j[0] = i10;
        os0Var.i[0] = false;
        os0Var.l = false;
        os0Var.m = i11;
        os0Var.n = (os0Var.e() - i11) - 1;
        os0 os0Var2 = os0VarArr[i7];
        if (os0Var2.n < 0) {
            os0Var2.n = 0;
        }
        os0Var2.k = i10;
        os0Var2.o = true;
        os0Var2.g = false;
        os0Var2.p++;
        ur0 g02 = g0(i7);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (!z9) {
            return;
        }
        int i12 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i12 >= ur0VarArr.length) {
                return;
            }
            ur0 ur0Var = ur0VarArr[i12];
            if (ur0Var.E == i7) {
                ur0Var.x.h1(Math.min(os0VarArr[i7].e() - 1, os0VarArr[i7].m), 0);
            }
            i12++;
        }
    }

    public final void L1(boolean z9) {
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i7 >= ur0VarArr.length) {
                return;
            }
            int childCount = ur0VarArr[i7].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ur0VarArr[i7].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) childAt).b(false, z9);
                } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) childAt).i(false, z9);
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) childAt).f(false, z9);
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) childAt).e(false, z9);
                } else if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ((org.telegram.ui.Cells.h2) childAt).c(false, z9);
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) childAt).c0(false, z9);
                }
            }
            i7++;
        }
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
        zs0 zs0Var;
        ArrayList arrayList;
        int i7;
        int i10;
        Bitmap bitmap;
        ur0 g02 = g0(0);
        if (g02 != null && g02.getMeasuredHeight() > 0 && g02.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(g02.getMeasuredWidth(), g02.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.K1 = true;
                g02.h.draw(new Canvas(bitmap2));
                View view = new View(g02.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                g02.addView(view);
                zs0Var = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new jg.j0((FrameLayout) zs0Var, view, (View) g02, (Object) bitmap2, 3)).start();
                g02.h.setAlpha(0.0f);
                g02.h.animate().alpha(1.0f).setUpdateListener(new d60(g02, 19)).setDuration(200L).start();
                rs0 rs0Var = zs0Var.w1;
                int[] iArr = rs0Var.c;
                arrayList = rs0Var.n[0].a;
                os0[] os0VarArr = zs0Var.v1;
                os0 os0Var = os0VarArr[0];
                int[] iArr2 = os0Var.f;
                iArr2[1] = 0;
                i7 = os0Var.q;
                if (i7 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i7 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                os0Var.h = false;
                long j3 = zs0Var.l1;
                L0(0, !org.telegram.messenger.m5.C(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                M0(false);
                zs0Var.F1.V();
                boolean C = org.telegram.messenger.m5.C(j3);
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
                    os0 os0Var2 = os0VarArr[0];
                    int i11 = os0Var2.q;
                    if (i11 == 0) {
                        os0Var2.a(ijVar, 0, false, C);
                    } else if (i11 == 1) {
                        if (org.telegram.messenger.ij.S3(ijVar.k)) {
                            os0VarArr[0].a(ijVar, 0, false, C);
                        }
                    } else if (!org.telegram.messenger.ij.S3(ijVar.k)) {
                        os0VarArr[0].a(ijVar, 0, false, C);
                    }
                }
            }
        }
        zs0Var = this;
        rs0 rs0Var2 = zs0Var.w1;
        int[] iArr3 = rs0Var2.c;
        arrayList = rs0Var2.n[0].a;
        os0[] os0VarArr2 = zs0Var.v1;
        os0 os0Var3 = os0VarArr2[0];
        int[] iArr22 = os0Var3.f;
        iArr22[1] = 0;
        i7 = os0Var3.q;
        if (i7 != 0) {
        }
        os0Var3.h = false;
        long j32 = zs0Var.l1;
        L0(0, !org.telegram.messenger.m5.C(j32) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        M0(false);
        zs0Var.F1.V();
        boolean C2 = org.telegram.messenger.m5.C(j32);
        while (i10 < arrayList.size()) {
        }
    }

    public final void M0(boolean z9) {
        long j3 = this.F;
        if (j3 != 0 || G0()) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            int i10 = s2[i7];
            os0[] os0VarArr = this.v1;
            if (os0VarArr[i10].h && !z9) {
                return;
            }
            long j10 = this.l1;
            if (org.telegram.messenger.m5.C(j10)) {
                return;
            }
            os0VarArr[i10].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i10 == 0) {
                int i11 = os0VarArr[i10].q;
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
            org.telegram.ui.ActionBar.f2 f2Var = this.x1;
            tL_messages_getSearchResultsPositions.peer = f2Var.getMessagesController().j1(j10);
            if (j3 != 0 && f2Var.getUserConfig().e() == j10) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = f2Var.getMessagesController().j1(j3);
            }
            ConnectionsManager.getInstance(f2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(f2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.fe(this, os0VarArr[i10].p, i10, 2)), f2Var.getClassGuid());
        }
    }

    public final void M1(float f10) {
        org.telegram.ui.ActionBar.r0 r0Var = this.o0;
        if (r0Var == null) {
            return;
        }
        ur0[] ur0VarArr = this.m0;
        ur0 ur0Var = ur0VarArr[1];
        float f11 = 0.0f;
        if (ur0Var != null && ur0Var.E == 11) {
            f11 = 0.0f + f10;
        }
        ur0 ur0Var2 = ur0VarArr[0];
        if (ur0Var2 != null && ur0Var2.E == 11) {
            f11 += 1.0f - f10;
        }
        r0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        r0Var.setScaleX(f12);
        r0Var.setScaleY(f12);
        r0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
    }

    public final void N() {
        vq0 vq0Var = this.K0;
        if (vq0Var.d(vq0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = vq0Var.getFirstTabId();
        vq0Var.setInitialTabId(firstTabId);
        this.m0[0].E = firstTabId;
        B1(false);
    }

    public final void N0(int i7) {
        int i10;
        int i11 = 2;
        os0[] os0VarArr = this.v1;
        if (i7 == 0) {
            int i12 = os0VarArr[0].q;
            if (i12 == 1) {
                i11 = 6;
            } else if (i12 == 2) {
                i11 = 7;
            } else {
                i10 = 0;
            }
            i10 = i11;
        } else if (i7 == 1) {
            i10 = 1;
        } else {
            if (i7 != 2) {
                i11 = 4;
                if (i7 != 4) {
                    i11 = 5;
                    if (i7 != 5) {
                        i11 = 3;
                    }
                }
            }
            i10 = i11;
        }
        os0VarArr[i7].g = true;
        org.telegram.ui.ActionBar.f2 f2Var = this.x1;
        f2Var.getMediaDataController().N0(this.l1, 50, 0, os0VarArr[i7].k, i10, this.F, 1, f2Var.getClassGuid(), os0VarArr[i7].p, null, null);
    }

    public final void N1() {
        org.telegram.ui.ActionBar.r0 r0Var = this.o0;
        if (r0Var == null) {
            return;
        }
        ur0 ur0Var = this.m0[1];
        boolean z9 = ur0Var != null && ur0Var.E == 11;
        if (z9) {
            r0Var.setVisibility(0);
        }
        r0Var.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.85f).scaleY(z9 ? 1.0f : 0.85f).withEndAction(new bi.k1(29, this, z9)).setDuration(420L).setInterpolator(xq.h).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(ur0 ur0Var, qj0 qj0Var, v4.b0 b0Var) {
        int i7;
        int i10;
        boolean[] zArr;
        v4.d1 K;
        di.r6 r6Var;
        if (this.q1 || this.M1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (qj0Var.getFastScroll() == null || !qj0Var.getFastScroll().n || currentTimeMillis - ur0Var.a >= 300) {
            ur0Var.a = currentTimeMillis;
            if (this.X0 && this.W0 && ur0Var.E != 11) {
                return;
            }
            int i11 = 7;
            if (ur0Var.E == 7) {
                return;
            }
            int L0 = b0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(b0Var.N0() - L0) + 1;
            int b10 = qj0Var.getAdapter() == null ? 0 : qj0Var.getAdapter().b();
            int i12 = ur0Var.E;
            int[] iArr = this.o1;
            os0[] os0VarArr = this.v1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                b10 = os0VarArr[i12].d() + os0VarArr[i12].a.size();
                os0 os0Var = os0VarArr[i12];
                if (os0Var.h && os0Var.e.size() > 2 && ur0Var.E == 0 && os0VarArr[i12].a.size() != 0) {
                    float f10 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((qj0Var.getMeasuredHeight() / (qj0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((zr0) os0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((zr0) os0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > b10 && L0 - b10 > measuredHeight) || ((i7 = L0 + abs) < os0VarArr[i12].m && os0VarArr[0].m - i7 > measuredHeight)) {
                        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(this, i12, qj0Var, 16);
                        this.M1 = q8Var;
                        org.telegram.messenger.g0.h3(q8Var);
                        return;
                    }
                }
            }
            int i13 = ur0Var.E;
            if (i13 == 7) {
                return;
            }
            if (z0(i13)) {
                ws0 z12 = z1(ur0Var.E);
                if (z12 == null || (r6Var = z12.s) == null || L0 + abs <= r6Var.i() - iArr[1]) {
                    return;
                }
                z12.P();
                return;
            }
            int i14 = ur0Var.E;
            if (i14 == 6) {
                if (abs > 0) {
                    nr0 nr0Var = this.R;
                    boolean z9 = nr0Var.h;
                    ArrayList arrayList = nr0Var.d;
                    if (z9 || nr0Var.e || arrayList.isEmpty() || L0 + abs < b10 - 5) {
                        return;
                    }
                    nr0Var.E(((TLRPC.Chat) jg.g.i(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.f2 f2Var = this.x1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < ur0Var.h.getChildCount(); i16++) {
                    View childAt = ur0Var.h.getChildAt(i16);
                    ur0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                v4.g0 adapter = ur0Var.h.getAdapter();
                ls0 ls0Var = this.U;
                if (adapter != ls0Var) {
                    if (i15 + 1 >= f2Var.getMessagesController().G1().i.size()) {
                        f2Var.getMessagesController().G1().g(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < ls0Var.h.size() + ls0Var.e.size() || ls0Var.s || ls0Var.r) {
                        return;
                    }
                    ls0Var.r = true;
                    ls0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > b10 - i17 || os0VarArr[i18].o) {
                os0 os0Var2 = os0VarArr[i18];
                if (!os0Var2.g) {
                    if (i14 == 0) {
                        int i19 = os0VarArr[0].q;
                        if (i19 == 1) {
                            i10 = 6;
                        } else {
                            if (i19 != 2) {
                                i10 = 0;
                            }
                            i10 = i11;
                        }
                        zArr = os0Var2.i;
                        if (zArr[0]) {
                            os0Var2.g = true;
                            f2Var.getMediaDataController().N0(this.l1, 50, os0VarArr[i18].j[0], 0, i10, this.F, 1, f2Var.getClassGuid(), os0VarArr[i18].p, null, null);
                        } else if (this.e1 != 0 && !zArr[1]) {
                            os0Var2.g = true;
                            f2Var.getMediaDataController().N0(this.e1, 50, os0VarArr[i18].j[1], 0, i10, this.F, 1, f2Var.getClassGuid(), os0VarArr[i18].p, null, null);
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
                        zArr = os0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i20 = os0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.J.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                os0 os0Var3 = os0VarArr[i18];
                if (!os0Var3.g && !os0Var3.l && !os0Var3.o) {
                    N0(ur0Var.E);
                }
            }
            ur0 ur0Var2 = this.m0[0];
            if (ur0Var2.h == qj0Var) {
                int i21 = ur0Var2.E;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = qj0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z10 = view instanceof org.telegram.ui.Cells.p7;
                    org.telegram.ui.Cells.t0 t0Var = this.M0;
                    if (!z10) {
                        if (view instanceof org.telegram.ui.Cells.h2) {
                            t0Var.e0(((org.telegram.ui.Cells.h2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        org.telegram.messenger.ij ijVar = p7Var.e <= 0 ? null : p7Var.b[0];
                        if (ijVar != null) {
                            t0Var.e0(ijVar.k.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public int O0() {
        return 0;
    }

    public final void O1() {
        boolean z9;
        di.r6 r6Var;
        boolean B0 = B0();
        org.telegram.ui.ActionBar.r0 r0Var = this.y0;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.x0;
        if (B0) {
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            if (r0Var != null) {
                r0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            if (r0Var != null) {
                r0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (J0(getClosestTab())) {
                if (r0Var2 != null) {
                    r0Var2.setVisibility(8);
                }
                if (r0Var != null) {
                    r0Var.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.b1;
            if (i7 >= sparseArrayArr[0].size()) {
                z9 = false;
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[0].valueAt(i7);
            ir0 ir0Var = this.e0;
            if (ir0Var != null && (r6Var = ir0Var.s) != null && !r6Var.m(ijVar.e1())) {
                z9 = true;
                break;
            }
            i7++;
        }
        if (r0Var2 != null) {
            r0Var2.setVisibility(z9 ? 0 : 8);
        }
        if (r0Var != null) {
            r0Var.setVisibility(z9 ? 8 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean P(MotionEvent motionEvent) {
        tp0 tp0Var;
        ur0[] ur0VarArr = this.m0;
        int i7 = ur0VarArr[0].E;
        if (i7 == 13 && (tp0Var = this.W) != null) {
            View currentView = tp0Var.n.getCurrentView();
            if (currentView instanceof ei.n) {
                ei.n nVar = (ei.n) currentView;
                ei.i iVar = nVar.w;
                ei.f fVar = nVar.f;
                if (nVar.a != null && nVar.getParent() != null) {
                    if (!nVar.b || nVar.K) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (nVar.L && !nVar.K && motionEvent.getPointerCount() == 2) {
                                nVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                nVar.Q = 1.0f;
                                nVar.N = motionEvent.getPointerId(0);
                                nVar.O = motionEvent.getPointerId(1);
                                fVar.I0(false);
                                fVar.cancelLongPress();
                                fVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) nVar.getParent();
                                nVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - nVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - nVar.getY());
                                int i10 = nVar.U;
                                Rect rect = nVar.V;
                                nVar.S = -1;
                                int top = y10 - fVar.getTop();
                                for (int i11 = 0; i11 < fVar.getChildCount(); i11++) {
                                    View childAt = fVar.getChildAt(i11);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i10, top)) {
                                        nVar.S = RecyclerView.S(childAt);
                                        nVar.T = childAt.getTop();
                                    }
                                }
                                nVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) nVar.getParent()).getY()) - nVar.getY() > 0.0f) {
                                    nVar.L = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (nVar.K || nVar.M)) {
                            int i12 = -1;
                            int i13 = -1;
                            for (int i14 = 0; i14 < motionEvent.getPointerCount(); i14++) {
                                if (nVar.N == motionEvent.getPointerId(i14)) {
                                    i12 = i14;
                                }
                                if (nVar.O == motionEvent.getPointerId(i14)) {
                                    i13 = i14;
                                }
                            }
                            if (i12 == -1 || i13 == -1) {
                                nVar.L = false;
                                nVar.M = false;
                                nVar.K = false;
                                nVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i13) - motionEvent.getX(i12), motionEvent.getY(i13) - motionEvent.getY(i12))) / nVar.P;
                            nVar.Q = hypot;
                            if (!nVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                nVar.K = true;
                                boolean z9 = hypot > 1.0f;
                                nVar.R = z9;
                                nVar.b(z9);
                            }
                            if (nVar.K) {
                                boolean z10 = nVar.R;
                                if ((!z10 || nVar.Q >= 1.0f) && (z10 || nVar.Q <= 1.0f)) {
                                    nVar.c = Math.max(0.0f, Math.min(1.0f, z10 ? org.telegram.messenger.k5.y(2.0f, nVar.Q, 1.0f, 1.0f) : (1.0f - nVar.Q) / 0.5f));
                                } else {
                                    nVar.c = 0.0f;
                                }
                                float f10 = nVar.c;
                                if (f10 == 1.0f || f10 == 0.0f) {
                                    if (f10 == 1.0f) {
                                        int i15 = nVar.e;
                                        int ceil = (((int) Math.ceil(nVar.S / nVar.e)) * i15) + ((int) ((nVar.W.G.B1 / (fVar.getMeasuredWidth() - ((int) (fVar.getMeasuredWidth() / nVar.e)))) * (i15 - 1)));
                                        if (ceil >= iVar.b()) {
                                            ceil = iVar.b() - 1;
                                        }
                                        nVar.S = ceil;
                                    }
                                    nVar.a();
                                    if (nVar.c == 0.0f) {
                                        nVar.R = !nVar.R;
                                    }
                                    nVar.b(nVar.R);
                                    nVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                fVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((nVar.N == motionEvent.getPointerId(0) && nVar.O == motionEvent.getPointerId(1)) || (nVar.N == motionEvent.getPointerId(1) && nVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && nVar.K) {
                            nVar.M = false;
                            nVar.L = false;
                            nVar.K = false;
                            nVar.a();
                        }
                        return nVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i7 == 0 || z0(i7)) && getParent() != null) {
            if (!this.q1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        ur0VarArr[0].h.I0(false);
                        ur0VarArr[0].h.cancelLongPress();
                        ur0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - ur0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - ur0VarArr[0].getY());
                        int i16 = this.x;
                        this.s = -1;
                        int top2 = y11 - ur0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.E == 1) {
                            top2 = 0;
                        }
                        for (int i17 = 0; i17 < ur0VarArr[0].h.getChildCount(); i17++) {
                            View childAt2 = ur0VarArr[0].h.getChildAt(i17);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i16, top2)) {
                                ur0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.F1.X() && this.s == -1) {
                            this.s = (int) (((this.o1[z0(ur0VarArr[0].E) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i16 / ur0VarArr[0].h.getMeasuredWidth(), 0.0f))) + ur0VarArr[0].x.L0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - ur0VarArr[0].getY() > this.c2) {
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
                        boolean z11 = hypot2 > 1.0f;
                        this.r = z11;
                        t1(z11);
                    }
                    if (this.a) {
                        boolean z12 = this.r;
                        if ((!z12 || this.n >= 1.0f) && (z12 || this.n <= 1.0f)) {
                            this.p1 = Math.max(0.0f, Math.min(1.0f, z12 ? org.telegram.messenger.k5.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.p1 = 0.0f;
                        }
                        float f11 = this.p1;
                        if (f11 == 1.0f || f11 == 0.0f) {
                            v4.g0 z13 = z0(this.r1) ? z1(this.r1) : this.J;
                            if (this.p1 == 1.0f) {
                                int i21 = this.s1;
                                int ceil2 = (((int) Math.ceil(this.s / this.s1)) * i21) + ((int) ((this.B1 / (ur0VarArr[0].h.getMeasuredWidth() - ((int) (ur0VarArr[0].h.getMeasuredWidth() / this.s1)))) * (i21 - 1)));
                                if (ceil2 >= z13.b()) {
                                    ceil2 = z13.b() - 1;
                                }
                                this.s = ceil2;
                            }
                            d0();
                            if (this.p1 == 0.0f) {
                                this.r = !this.r;
                            }
                            t1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        ur0VarArr[0].h.invalidate();
                        ur0 ur0Var = ur0VarArr[0];
                        if (ur0Var.F != null) {
                            ur0Var.invalidate();
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
    public void P1(boolean z9) {
        int i7;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i10;
        boolean I0;
        boolean z10;
        boolean z11;
        boolean z12;
        int selectedTab;
        int[] iArr;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        mr0 mr0Var;
        int i11;
        boolean z16;
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
        char c10;
        int i14;
        int i15;
        ArrayList arrayList;
        int i16;
        Object obj;
        boolean z17;
        int i17;
        int i18;
        boolean z18;
        int i19;
        int i20;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        rs0 rs0Var;
        vq0 vq0Var = this.K0;
        if (vq0Var == null) {
            return;
        }
        boolean z19 = !this.F1.t() ? false : z9;
        boolean z20 = (this.V == null || (rs0Var = this.w1) == null || !rs0Var.f) ? false : true;
        long j3 = this.l1;
        int i21 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.f2 f2Var = this.x1;
        if (i21 <= 0 || f2Var == null) {
            i7 = 1;
            user = null;
        } else {
            i7 = 1;
            user = f2Var.getMessagesController().a2(Long.valueOf(j3));
        }
        boolean z21 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i7 : false;
        int i22 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.g1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z21) ? 0 : i7;
        int i23 = ((org.telegram.messenger.m5.E(j3) || org.telegram.messenger.m5.z(j3)) && !org.telegram.messenger.m5.C(j3) && (((userFull = this.g1) != null && userFull.stories_pinned_available) || (((chatFull = this.f1) != null && chatFull.stories_pinned_available) || I0())) && y0()) ? i7 : 0;
        vp0 vp0Var2 = this.a0;
        int i24 = i22;
        boolean z22 = (vp0Var2 == null || (((userFull3 = this.g1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.f1) == null || chatFull3.stargifts_count <= 0))) ? false : i7;
        int i25 = i23;
        TLRPC.ChatFull chatFull4 = this.f1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.g1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z23 = z19;
                int i26 = this.T1 == vq0Var.n0 ? i7 : 0;
                boolean z24 = (i25 == 0 || i24 != 0) ? i7 : false;
                int i27 = i26;
                i10 = z24 == vq0Var.d(8) ? i27 + 1 : i27;
                if (z21 != vq0Var.d(13)) {
                    i10++;
                }
                if (G0() != vq0Var.d(8)) {
                    i10++;
                }
                if (z22 == vq0Var.d(14) || (vp0Var2 != null && z22 && this.S1 != vp0Var2.getLastEmojisHash())) {
                    i10++;
                }
                I0 = I0();
                int i28 = 14;
                mr0 mr0Var2 = this.c0;
                int[] iArr2 = this.Z0;
                if (I0) {
                    z10 = z22;
                    int i29 = i10;
                    int i30 = (mr0Var2.d == null ? i7 : false) == vq0Var.d(7) ? i29 + 1 : i29;
                    if (iArr2[0] <= 0) {
                        z17 = i7;
                        i17 = 0;
                    } else {
                        z17 = false;
                        i17 = 0;
                    }
                    int i31 = i30;
                    int i32 = z17 == vq0Var.d(i17) ? i31 + 1 : i31;
                    if (iArr2[i7] <= 0) {
                        z18 = i7;
                        i18 = z18;
                    } else {
                        i18 = i7;
                        z18 = false;
                    }
                    int i33 = i32;
                    int i34 = z18 == vq0Var.d(i18) ? i33 + 1 : i33;
                    if (org.telegram.messenger.m5.C(j3)) {
                        i19 = i34;
                    } else {
                        int i35 = i34;
                        int i36 = (iArr2[3] <= 0) == vq0Var.d(3) ? i35 + 1 : i35;
                        i19 = (iArr2[4] <= 0) == vq0Var.d(4) ? i36 + 1 : i36;
                    }
                    int i37 = i20;
                    int i38 = (iArr2[2] <= 0) == vq0Var.d(2) ? i37 + 1 : i37;
                    int i39 = (iArr2[5] <= 0) == vq0Var.d(5) ? i38 + 1 : i38;
                    int i40 = (iArr2[6] <= 0) == vq0Var.d(6) ? i39 + 1 : i39;
                    boolean z25 = !this.S.d.isEmpty();
                    int i41 = i40;
                    i10 = z25 != vq0Var.d(10) ? i41 + 1 : i41;
                    z11 = x0() && !f2Var.getMessagesController().G1().b && f2Var.getMessagesController().G1().e();
                    z12 = z25;
                    if (z11 != vq0Var.d(11)) {
                        i10++;
                    }
                    if (z20 != vq0Var.d(12)) {
                        i10++;
                    }
                } else {
                    z10 = z22;
                    z11 = false;
                    z12 = false;
                }
                if (i10 > 0) {
                    if (z23) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        iArr = iArr2;
                        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(2));
                        z13 = z20;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(vq0Var.getTabsContainer(), transitionSet);
                        vq0Var.U = vq0Var.w;
                        vq0Var.V = vq0Var.x;
                    } else {
                        iArr = iArr2;
                        z13 = z20;
                    }
                    SparseArray f10 = vq0Var.f();
                    if (i10 > 3) {
                        f10 = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (G0()) {
                        z14 = z21;
                        z15 = z11;
                        str = null;
                        arrayList2.add(new Pair(8, org.telegram.messenger.id.M0(2131746635, null)));
                        vq0Var.b0 = 420L;
                    } else {
                        z14 = z21;
                        z15 = z11;
                        str = null;
                    }
                    if (i24 != 0) {
                        arrayList2.add(new Pair(8, org.telegram.messenger.id.M0(2131746692, str)));
                    } else if ((org.telegram.messenger.m5.E(j3) || org.telegram.messenger.m5.z(j3)) && !org.telegram.messenger.m5.C(j3) && ((((userFull2 = this.g1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.f1) != null && chatFull2.stories_pinned_available) || I0())) && y0())) {
                        if (A0()) {
                            arrayList2.add(new Pair(9, org.telegram.messenger.id.M0(2131746725, null)));
                            mr0Var = mr0Var2;
                            vq0Var.b0 = 420L;
                        } else {
                            mr0Var = mr0Var2;
                            arrayList2.add(new Pair(8, org.telegram.messenger.id.M0(2131746635, null)));
                            if (I0()) {
                                arrayList2.add(new Pair(9, org.telegram.messenger.id.M0(2131746725, null)));
                            }
                        }
                        if (z10) {
                            i11 = i21;
                            z16 = z13;
                        } else {
                            String M03 = org.telegram.messenger.id.M0(2131746676, null);
                            HashMap hashMap = zh.d2.U;
                            bi.v9 v9Var = vp0Var2.d;
                            Object obj2 = "";
                            if (v9Var == null) {
                                vp0Var = vp0Var2;
                                str6 = M03;
                                i11 = i21;
                                z16 = z13;
                            } else {
                                ArrayList arrayList3 = v9Var.l;
                                str6 = M03;
                                i11 = i21;
                                z16 = z13;
                                Pair pair = new Pair(Integer.valueOf(org.telegram.messenger.p10.s0), Long.valueOf(vp0Var2.c));
                                if (arrayList3.isEmpty()) {
                                    if (v9Var.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
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
                                            spannableStringBuilder2.setSpan(new r5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                            i43 = i15 + 1;
                                            arrayList4 = arrayList;
                                        }
                                        c10 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj2 = spannableStringBuilder;
                                        i14 = 2;
                                        CharSequence[] charSequenceArr = new CharSequence[i14];
                                        charSequenceArr[c10] = str6;
                                        charSequenceArr[1] = obj2;
                                        arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                        this.S1 = vp0Var.getLastEmojisHash();
                                    }
                                }
                            }
                            i14 = 2;
                            c10 = 0;
                            CharSequence[] charSequenceArr2 = new CharSequence[i14];
                            charSequenceArr2[c10] = str6;
                            charSequenceArr2[1] = obj2;
                            arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                            this.S1 = vp0Var.getLastEmojisHash();
                        }
                        if (z14) {
                            arrayList2.add(new Pair(13, org.telegram.messenger.id.M0(2131746692, null)));
                        }
                        int i44 = 2131745402;
                        if (!I0()) {
                            if (z15) {
                                str3 = null;
                                arrayList2.add(new Pair(11, org.telegram.messenger.id.M0(2131745907, null)));
                            } else {
                                str3 = null;
                            }
                            mr0 mr0Var3 = mr0Var;
                            if (mr0Var3.d != null) {
                                arrayList2.add(new Pair(7, org.telegram.messenger.id.M0(2131749429, str3)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && mr0Var3.d == null) {
                                    arrayList2.add(new Pair(0, org.telegram.messenger.id.M0(2131745406, null)));
                                } else {
                                    str4 = null;
                                    arrayList2.add(new Pair(0, org.telegram.messenger.id.M0(2131745407, null)));
                                    if (z16) {
                                        arrayList2.add(new Pair(12, org.telegram.messenger.id.M0(2131745893, str4)));
                                        org.telegram.messenger.qp.e1().edit().putInt("savedhint", 3).apply();
                                    }
                                    if (iArr[1] <= 0) {
                                        str5 = null;
                                        arrayList2.add(new Pair(1, org.telegram.messenger.id.M0(2131745414, null)));
                                    } else {
                                        str5 = null;
                                    }
                                    if (org.telegram.messenger.m5.C(j3)) {
                                        if (iArr[3] > 0) {
                                            arrayList2.add(new Pair(3, org.telegram.messenger.id.M0(2131745410, str5)));
                                        }
                                        if (iArr[4] > 0) {
                                            arrayList2.add(new Pair(4, org.telegram.messenger.id.M0(2131745405, str5)));
                                        }
                                        if (iArr[8] > 0) {
                                            arrayList2.add(new Pair(15, org.telegram.messenger.id.M0(2131745403, str5)));
                                        }
                                    } else if (iArr[4] > 0) {
                                        arrayList2.add(new Pair(4, org.telegram.messenger.id.M0(2131745405, str5)));
                                    }
                                    if (iArr[2] > 0) {
                                        arrayList2.add(new Pair(2, org.telegram.messenger.id.M0(2131745402, str5)));
                                    }
                                    if (iArr[5] > 0) {
                                        arrayList2.add(new Pair(5, org.telegram.messenger.id.M0(2131745413, str5)));
                                    }
                                    if (iArr[6] > 0) {
                                        arrayList2.add(new Pair(6, org.telegram.messenger.id.M0(2131745412, str5)));
                                    }
                                    if (z12) {
                                        arrayList2.add(new Pair(10, org.telegram.messenger.id.M0(i11 > 0 ? 2131745318 : 2131745314, null)));
                                    }
                                }
                            }
                            str4 = null;
                            if (z16) {
                            }
                            if (iArr[1] <= 0) {
                            }
                            if (org.telegram.messenger.m5.C(j3)) {
                            }
                            if (iArr[2] > 0) {
                            }
                            if (iArr[5] > 0) {
                            }
                            if (iArr[6] > 0) {
                            }
                            if (z12) {
                            }
                        }
                        if (vq0Var.n0) {
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
                                            M0 = org.telegram.messenger.id.M0(2131745406, null);
                                        } else if (i45 == 1) {
                                            M0 = org.telegram.messenger.id.M0(2131745414, null);
                                        } else if (i45 == 2) {
                                            M0 = org.telegram.messenger.id.M0(i44, null);
                                        } else if (i45 == 3) {
                                            M0 = org.telegram.messenger.id.M0(2131745410, null);
                                        } else if (i45 == 4) {
                                            M0 = org.telegram.messenger.id.M0(2131745405, null);
                                        } else if (i45 != 5) {
                                            if (i45 == 8) {
                                                M02 = org.telegram.messenger.id.M0(2131746635, null);
                                            } else if (i45 != i28) {
                                                str2 = null;
                                                arrayList2.add(new Pair(valueOf2, str2));
                                                i45++;
                                                i44 = 2131745402;
                                                i28 = 14;
                                            } else {
                                                M02 = org.telegram.messenger.id.M0(2131746676, null);
                                            }
                                            str2 = M02;
                                            arrayList2.add(new Pair(valueOf2, str2));
                                            i45++;
                                            i44 = 2131745402;
                                            i28 = 14;
                                        } else {
                                            M0 = org.telegram.messenger.id.M0(2131745413, null);
                                        }
                                        str2 = M0;
                                        arrayList2.add(new Pair(valueOf2, str2));
                                        i45++;
                                        i44 = 2131745402;
                                        i28 = 14;
                                    }
                                }
                                i45++;
                                i44 = 2131745402;
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
                                    this.U1 = ((Integer) ((Pair) arrayList2.get(i12)).first).intValue();
                                }
                                size = arrayList2.size();
                                i13 = 0;
                                while (i13 < size) {
                                    Object obj3 = arrayList2.get(i13);
                                    i13++;
                                    Pair pair2 = (Pair) obj3;
                                    if (!vq0Var.d(((Integer) pair2.first).intValue())) {
                                        vq0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, f10);
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
                    mr0Var = mr0Var2;
                    if (z10) {
                    }
                    if (z14) {
                    }
                    int i442 = 2131745402;
                    if (!I0()) {
                    }
                    if (vq0Var.n0) {
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
                    this.m0[0].E = selectedTab;
                }
                this.T1 = vq0Var.n0;
                vq0Var.c();
                Y0();
                S();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z232 = z19;
        if (this.T1 == vq0Var.n0) {
        }
        if (i25 == 0) {
        }
        int i272 = i26;
        if (z24 == vq0Var.d(8)) {
        }
        if (z21 != vq0Var.d(13)) {
        }
        if (G0() != vq0Var.d(8)) {
        }
        if (z22 == vq0Var.d(14)) {
        }
        i10++;
        I0 = I0();
        int i282 = 14;
        mr0 mr0Var22 = this.c0;
        int[] iArr22 = this.Z0;
        if (I0) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.T1 = vq0Var.n0;
        vq0Var.c();
        Y0();
        S();
    }

    public final void Q() {
        R(false, false);
    }

    public final Boolean Q1(View view, View view2) {
        if (this.q1) {
            return null;
        }
        ur0[] ur0VarArr = this.m0;
        ur0 ur0Var = ur0VarArr[0];
        if (ur0Var == null) {
            return null;
        }
        int i7 = ur0Var.E;
        this.r1 = i7;
        boolean z02 = z0(i7);
        int[] iArr = this.o1;
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
                org.telegram.messenger.iz.B(h02);
            } else if (m0(ur0VarArr[0].E) >= 5 || J0(ur0VarArr[0].E)) {
                org.telegram.messenger.iz.F(h02);
            }
            F(h02);
        }
        return Boolean.valueOf(h02 != h0(z02 ? 1 : 0, h02, true));
    }

    public final void R(boolean z9, boolean z10) {
        if (this.H == null) {
            return;
        }
        int closestTab = getClosestTab();
        boolean z11 = false;
        boolean z12 = this.p2 && !E0();
        org.telegram.ui.ActionBar.r0 r0Var = this.p0;
        if (r0Var != null) {
            ((org.telegram.ui.ActionBar.f5) r0Var).Y(z12 && I() && (F0(closestTab) || (closestTab == 11 && x0())), z9);
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.I;
        if (f5Var != null) {
            if (z12 && I() && !A0() && v0(closestTab)) {
                z11 = true;
            }
            f5Var.Y(z11, z10);
        }
    }

    public final void R0() {
        di.r6 r6Var;
        di.r6 r6Var2;
        this.J1.b();
        ir0 ir0Var = this.e0;
        if (ir0Var != null && (r6Var2 = ir0Var.s) != null && r6Var2 != null) {
            r6Var2.z(ir0Var.w);
        }
        sp0 sp0Var = this.g0;
        if (sp0Var != null && (r6Var = sp0Var.s) != null && r6Var != null) {
            r6Var.z(sp0Var.w);
        }
        Iterator it = this.l2.values().iterator();
        while (it.hasNext()) {
            xs0 xs0Var = ((ys0) it.next()).c;
            di.r6 r6Var3 = xs0Var.s;
            if (r6Var3 != null && r6Var3 != null) {
                r6Var3.z(xs0Var.w);
            }
        }
    }

    public final Boolean R1(View view, View view2) {
        if (this.q1) {
            return null;
        }
        ur0[] ur0VarArr = this.m0;
        ur0 ur0Var = ur0VarArr[0];
        if (ur0Var == null) {
            return null;
        }
        if (this.m1 && z0(ur0Var.E)) {
            return null;
        }
        int i7 = ur0VarArr[0].E;
        this.r1 = i7;
        boolean z02 = z0(i7);
        int[] iArr = this.o1;
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
                org.telegram.messenger.iz.B(h02);
            } else if (m0(ur0VarArr[0].E) >= 5 || J0(ur0VarArr[0].E)) {
                org.telegram.messenger.iz.F(h02);
            }
            F(h02);
        }
        return Boolean.valueOf(h02 != h0(z02 ? 1 : 0, h02, false));
    }

    public final void S() {
        float abs;
        ur0[] ur0VarArr = this.m0;
        ur0 ur0Var = ur0VarArr[0];
        if (ur0Var == null || ur0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        zp0 zp0Var = this.b0;
        if (zp0Var != null) {
            char c10 = (!z0(ur0Var.E) || ur0VarArr[0].E == 9) ? (char) 0 : (char) 1;
            if (c10 == (ur0VarArr[1].getVisibility() == 0 ? (!z0(ur0VarArr[1].E) || ur0VarArr[1].E == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                zp0Var.setTranslationX(c10 != 0 ? 0.0f : ur0VarArr[0].getMeasuredWidth());
            } else {
                zp0Var.setTranslationX(ur0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(zp0Var.getTranslationX()) / zp0Var.getMeasuredWidth());
            }
            float f11 = 0.0f;
            for (int i7 = 0; i7 < ur0VarArr.length; i7++) {
                if (ur0VarArr[i7].getVisibility() == 0) {
                    dq0 dq0Var = ur0VarArr[i7].h;
                    View childAt = dq0Var.getChildCount() == 0 ? null : dq0Var.getChildAt(0);
                    f11 += Utilities.l(1.0f - (ur0VarArr[i7].getTranslationX() / ur0VarArr[i7].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - dq0Var.getPaddingTop() : dq0Var.getChildCount() == 0 ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
            }
            float l10 = Utilities.l(1.0f - ((-f11) / org.telegram.messenger.g0.N(48.0f)));
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
            zp0Var.setAlpha(l10);
            zp0Var.setScaleX(T1);
            zp0Var.setScaleY(T1);
            zp0Var.setTranslationY(this.N1 + f11);
            f10 = abs;
        }
        U();
        if (this.X1 != f10) {
            this.X1 = f10;
            invalidate();
        }
    }

    public final void S0(int i7, View view, org.telegram.messenger.ij ijVar, int i10) {
        String str;
        if (ijVar == null || this.q1) {
            return;
        }
        zp0 zp0Var = this.b0;
        if (zp0Var == null || !zp0Var.f) {
            int i11 = 0;
            i11 = 0;
            String str2 = null;
            if (this.E1) {
                int i12 = 8;
                if (i10 == 8 && !H()) {
                    return;
                }
                char c10 = org.telegram.messenger.ij.B0(ijVar.k) == this.l1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.b1;
                if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
                    sparseArrayArr[c10].remove(ijVar.e1());
                    if (!ijVar.s(null, false)) {
                        this.c1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(ijVar.e1(), ijVar);
                    if (!ijVar.s(null, false)) {
                        this.c1++;
                    }
                }
                P0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    q1(false);
                } else {
                    o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.n0.setVisibility(this.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.r0 r0Var = this.w0;
                    if (r0Var != null) {
                        r0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.v0;
                    if (r0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        r0Var2.setVisibility(i12);
                    }
                    O1();
                }
                this.d1 = false;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).b(sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.p7) {
                    ((org.telegram.ui.Cells.p7) view).b(0, sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).f(sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).e(sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    ((org.telegram.ui.Cells.h2) view).c(sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) view).i(sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0, true);
                }
            } else {
                fq0 fq0Var = this.t1;
                os0[] os0VarArr = this.v1;
                org.telegram.ui.ActionBar.f2 f2Var = this.x1;
                if (i10 == 0) {
                    os0 os0Var = os0VarArr[i10];
                    int i13 = i7 - os0Var.m;
                    if (i13 >= 0 && i13 < os0Var.a.size()) {
                        PhotoViewer.p1().H2(null, f2Var, null);
                        PhotoViewer.p1().Z1(os0VarArr[i10].a, i13, this.l1, this.e1, this.F, fq0Var);
                    }
                } else if (i10 == 2 || i10 == 4) {
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).a();
                    }
                } else if (i10 == 5) {
                    PhotoViewer.p1().H2(null, f2Var, null);
                    int indexOf = os0VarArr[i10].a.indexOf(ijVar);
                    if (indexOf < 0) {
                        PhotoViewer.p1().Z1(org.telegram.messenger.k5.k(ijVar), 0, 0L, 0L, 0L, fq0Var);
                    } else {
                        PhotoViewer.p1().Z1(os0VarArr[i10].a, indexOf, this.l1, this.e1, this.F, fq0Var);
                    }
                } else if (i10 == 1) {
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        TLRPC.Document F0 = ijVar.F0();
                        if (h7Var.G) {
                            if (ijVar.x()) {
                                PhotoViewer.p1().H2(null, f2Var, null);
                                int indexOf2 = os0VarArr[i10].a.indexOf(ijVar);
                                if (indexOf2 < 0) {
                                    PhotoViewer.p1().Z1(org.telegram.messenger.k5.k(ijVar), 0, 0L, 0L, 0L, fq0Var);
                                    return;
                                } else {
                                    PhotoViewer.p1().Z1(os0VarArr[i10].a, indexOf2, this.l1, this.e1, this.F, fq0Var);
                                    return;
                                }
                            }
                            org.telegram.messenger.g0.s2(ijVar, f2Var.getParentActivity(), f2Var);
                        } else if (h7Var.F) {
                            f2Var.getFileLoader().f(F0);
                            h7Var.f(true);
                        } else {
                            org.telegram.messenger.ij message = h7Var.getMessage();
                            message.P = true;
                            f2Var.getFileLoader().W(F0, message, 0, 0);
                            h7Var.f(true);
                        }
                    }
                } else if (i10 == 3) {
                    try {
                        TLRPC.WebPage webPage = org.telegram.messenger.ij.n1(ijVar.k) != null ? org.telegram.messenger.ij.n1(ijVar.k).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.G1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                                    f2Var.createArticleViewer(false).L(ijVar, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                wt.N0(f2Var, ijVar, this.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.k7) view).E;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            d1(str);
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (z0(i10)) {
                    ws0 z12 = z1(i10);
                    di.r6 r6Var = z12 != null ? z12.s : null;
                    if (r6Var == null) {
                        return;
                    }
                    di.q9 orCreateStoryViewer = f2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int e12 = ijVar.e1();
                    di.i7 a10 = di.i7.a(this.m0[0].h);
                    a10.e = new bx(r6Var, 19);
                    if ((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).r1) {
                        i11 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a10.s += i11;
                    orCreateStoryViewer.I(context, e12, r6Var, a10);
                }
            }
            G1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T() {
        AnimatorSet animatorSet;
        if (!this.i1) {
            return false;
        }
        boolean z9 = this.k1;
        ur0[] ur0VarArr = this.m0;
        if (!z9) {
            if (Math.abs(ur0VarArr[1].getTranslationX()) < 1.0f) {
                ur0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.j1 ? -1 : 1));
                ur0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.h1;
                if (animatorSet != null) {
                }
                this.i1 = false;
            }
            Z0(getTabProgress());
            return this.i1;
        }
        if (Math.abs(ur0VarArr[0].getTranslationX()) < 1.0f) {
            ur0VarArr[0].setTranslationX(0.0f);
            ur0VarArr[1].setTranslationX(ur0VarArr[0].getMeasuredWidth() * (this.j1 ? 1 : -1));
            animatorSet = this.h1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.h1 = null;
            }
            this.i1 = false;
        }
        Z0(getTabProgress());
        return this.i1;
    }

    public final boolean T0(org.telegram.messenger.ij ijVar, View view, int i7, boolean z9) {
        zp0 zp0Var;
        final TL_stories.StoryItem storyItem;
        ir0 ir0Var;
        di.r6 r6Var;
        final int i10 = 0;
        if (!this.E1) {
            org.telegram.ui.ActionBar.f2 f2Var = this.x1;
            if (f2Var.getParentActivity() != null && ijVar != null && ((zp0Var = this.b0) == null || !zp0Var.f)) {
                org.telegram.messenger.g0.v1(f2Var.getParentActivity().getCurrentFocus());
                long j3 = this.l1;
                int i11 = 8;
                final int i12 = 1;
                if (!z9 || (!(J0(getClosestTab()) || getClosestTab() == 8) || this.E1)) {
                    char c10 = org.telegram.messenger.ij.B0(ijVar.k) == j3 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.b1;
                    sparseArrayArr[c10].put(ijVar.e1(), ijVar);
                    if (!ijVar.s(null, false)) {
                        this.c1++;
                    }
                    this.n0.setVisibility(this.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.r0 r0Var = this.w0;
                    if (r0Var != null) {
                        r0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.v0;
                    if (r0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i11 = 0;
                        }
                        r0Var2.setVisibility(i11);
                    }
                    o1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.P0;
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
                    this.d1 = false;
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) view).b(i7, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).i(true, true);
                    }
                    if (!this.E1) {
                        q1(true);
                    }
                    P0(sparseArrayArr[0]);
                    G1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                    o7Var.k(o7Var.n, o7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = ijVar.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean J0 = J0(getClosestTab());
                    l60 I = l60.I(f2Var, view);
                    l60 J = I.J();
                    J.c(R.drawable.ic_ab_back, org.telegram.messenger.id.M0(2131753756, null), new org.telegram.ui.iq0(I, 27), false);
                    J.k();
                    l60.f(J, getStoriesController().B(j3, true), hashSet, true, new ng(this, storyItem2, I, 19), new di.s2(this, hashSet, storyItem2, I, 10));
                    I.c(R.drawable.menu_album_add, org.telegram.messenger.id.M0(2131744805, null), new hi.h2(I, J, 9), false);
                    I.k();
                    I.c(R.drawable.msg_select, org.telegram.messenger.id.M0(2131744789, null), new ai.a1(this, ijVar, view, i7, 28), false);
                    final int i14 = 3;
                    if (J0) {
                        int w12 = w1(getClosestTab());
                        String w10 = getStoriesController().w(w12, j3);
                        I.c(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131744790, null), new xo0(this, w12, i10), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, org.telegram.messenger.id.M0(2131744791, null), new ai.a1((Object) this, w12, (Object) storyItem, w10, 29), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (ir0Var = this.e0) != null && (r6Var = ir0Var.s) != null) {
                            if (r6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, org.telegram.messenger.id.M0(2131744787, null), new Runnable() { // from class: org.telegram.ui.Components.wo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        zs0 zs0Var = this;
                                        switch (i15) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zs0Var.getContext(), zs0Var.H1);
                                                String M0 = org.telegram.messenger.id.M0(2131751487, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.R = M0;
                                                u1Var.T = org.telegram.messenger.id.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new gp0(zs0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(7));
                                                u1Var.show();
                                                u1Var.i();
                                                break;
                                            case 1:
                                                zs0Var.getClass();
                                                zs0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                zs0Var.getClass();
                                                zs0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                zs0.h(zs0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i15 = 2;
                                I.c(R.drawable.chats_pin, org.telegram.messenger.id.M0(2131744792, null), new Runnable() { // from class: org.telegram.ui.Components.wo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i152 = i15;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        zs0 zs0Var = this;
                                        switch (i152) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zs0Var.getContext(), zs0Var.H1);
                                                String M0 = org.telegram.messenger.id.M0(2131751487, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.R = M0;
                                                u1Var.T = org.telegram.messenger.id.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new gp0(zs0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(7));
                                                u1Var.show();
                                                u1Var.i();
                                                break;
                                            case 1:
                                                zs0Var.getClass();
                                                zs0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                zs0Var.getClass();
                                                zs0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                zs0.h(zs0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, org.telegram.messenger.id.M0(2131744797, null), new Runnable() { // from class: org.telegram.ui.Components.wo0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i152 = i14;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                zs0 zs0Var = this;
                                switch (i152) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zs0Var.getContext(), zs0Var.H1);
                                        String M0 = org.telegram.messenger.id.M0(2131751487, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.R = M0;
                                        u1Var.T = org.telegram.messenger.id.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new gp0(zs0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(7));
                                        u1Var.show();
                                        u1Var.i();
                                        break;
                                    case 1:
                                        zs0Var.getClass();
                                        zs0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        zs0Var.getClass();
                                        zs0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        zs0.h(zs0Var, storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751598, null), new Runnable() { // from class: org.telegram.ui.Components.wo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i152 = i10;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            zs0 zs0Var = this;
                            switch (i152) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zs0Var.getContext(), zs0Var.H1);
                                    String M0 = org.telegram.messenger.id.M0(2131751487, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new gp0(zs0Var, storyItem3));
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(7));
                                    u1Var.show();
                                    u1Var.i();
                                    break;
                                case 1:
                                    zs0Var.getClass();
                                    zs0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    zs0Var.getClass();
                                    zs0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    zs0.h(zs0Var, storyItem3);
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

    public final void U() {
        pr prVar = this.R0;
        if (prVar != null) {
            prVar.setTranslationY(this.N1);
        }
    }

    public boolean U0(TLRPC.ChatParticipant chatParticipant, boolean z9, View view) {
        return false;
    }

    public final boolean V(boolean z9) {
        SparseArray[] sparseArrayArr;
        if (!this.E1) {
            return false;
        }
        int i7 = 1;
        while (true) {
            sparseArrayArr = this.b1;
            if (i7 < 0) {
                break;
            }
            sparseArrayArr[i7].clear();
            i7--;
        }
        this.c1 = 0;
        P0(sparseArrayArr[0]);
        tp0 tp0Var = this.W;
        if (tp0Var != null) {
            tp0Var.h();
            tp0Var.j();
        }
        q1(false);
        L1(z9);
        ks0 ks0Var = this.T;
        if (ks0Var != null) {
            ks0Var.x.clear();
        }
        return true;
    }

    public final void V0(float f10) {
        ur0[] ur0VarArr = this.m0;
        if (f10 != 1.0f || ur0VarArr[1].getVisibility() == 0) {
            if (this.j1) {
                ur0VarArr[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                ur0VarArr[1].setTranslationX(ur0VarArr[0].getMeasuredWidth() - (ur0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ur0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f10);
                ur0VarArr[1].setTranslationX((ur0VarArr[0].getMeasuredWidth() * f10) - ur0VarArr[0].getMeasuredWidth());
            }
            Z0(getTabProgress());
            float k02 = k0(f10);
            this.r0 = k02;
            this.t0.setVisibility((k02 == 0.0f || !I() || A0()) ? 4 : 0);
            org.telegram.ui.ActionBar.r0 r0Var = this.p0;
            if (r0Var == null || I()) {
                this.q0 = l0(f10);
                N1();
            } else {
                setSearchItemVisibility(I0() ? 8 : 4);
                this.q0 = 0.0f;
            }
            I1(false);
            if (f10 == 1.0f) {
                ur0 ur0Var = ur0VarArr[0];
                ur0VarArr[0] = ur0VarArr[1];
                ur0VarArr[1] = ur0Var;
                ur0Var.setVisibility(8);
                if (r0Var != null && this.z0 == 2) {
                    setSearchItemVisibility(I0() ? 8 : 4);
                }
                this.z0 = 0;
                u1();
            }
        }
    }

    public final org.telegram.ui.ActionBar.r0 W(Context context, int i7, int i10, String str) {
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        if (y4Var != null) {
            r0Var = y4Var.m().b(i7, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.l6.z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.l6.y8;
            org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, s02, s0(i12), false, null);
            r0Var2.setIcon(i10);
            r0Var2.setDuplicateParentStateEnabled(false);
            this.D0.addView(r0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.P0.add(r0Var2);
            dh0 iconView = r0Var2.getIconView();
            org.telegram.ui.ActionBar.g6 g6Var = this.H1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.s6.s(r0Var2.getIconView(), i12, g6Var, PorterDuff.Mode.SRC_IN);
            }
            if (r0Var2.getBackground() != null) {
                Drawable background = r0Var2.getBackground();
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
                r0Var2.setBackground(background);
                org.telegram.ui.ActionBar.s6.j(r0Var2, background, null, M, g6Var);
            }
            r0Var = r0Var2;
        }
        r0Var.setContentDescription(str);
        r0Var.setOnClickListener(new ai.v(this, i7, 18));
        return r0Var;
    }

    public boolean Y() {
        return this instanceof p20;
    }

    public void Y0() {
        boolean z9 = I0() || A0();
        us0 us0Var = this.g0.x;
        if (us0Var != null) {
            us0Var.b(z9 && getClosestTab() == 9);
        }
        us0 us0Var2 = this.e0.x;
        if (us0Var2 != null) {
            us0Var2.b(z9 && getClosestTab() == 8);
        }
        for (ys0 ys0Var : this.l2.values()) {
            xs0 xs0Var = ys0Var.c;
            if (xs0Var.s != null) {
                xs0Var.x.b(z9 && getClosestTab() == ys0Var.a);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.p0;
        if (r0Var != null) {
            sq0 sq0Var = this.L0;
            r0Var.setSearchFieldHint(org.telegram.messenger.id.M0((sq0Var != null && sq0Var.a() && getSelectedTab() == 11) ? 2131745868 : 2131745836, null));
        }
        S();
        R(true, true);
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        ur0[] ur0VarArr = this.m0;
        motionEvent.offsetLocation(x10 - ur0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - ur0VarArr[0].getY()) - ur0VarArr[0].h.getFastScroll().getY());
        return ur0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void Z0(float f10) {
        Q0();
    }

    public final boolean a0(int i7) {
        os0[] os0VarArr = this.w1.n;
        if (os0VarArr == null) {
            return false;
        }
        os0[] os0VarArr2 = this.v1;
        if (i7 == 0) {
            os0 os0Var = os0VarArr2[i7];
            if (!os0Var.h) {
                int[] iArr = os0Var.f;
                int[] iArr2 = os0VarArr[i7].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = os0VarArr2[i7].f;
            int[] iArr4 = os0VarArr[i7].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        os0VarArr2[i7].a.addAll(os0VarArr[i7].a);
        os0VarArr2[i7].c.addAll(os0VarArr[i7].c);
        for (Map.Entry entry : os0VarArr[i7].d.entrySet()) {
            os0VarArr2[i7].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            os0VarArr2[i7].b[i10] = os0VarArr[i7].b[i10].clone();
            os0 os0Var2 = os0VarArr2[i7];
            int[] iArr5 = os0Var2.j;
            os0 os0Var3 = os0VarArr[i7];
            iArr5[i10] = os0Var3.j[i10];
            os0Var2.i[i10] = os0Var3.i[i10];
        }
        os0VarArr2[i7].e.addAll(os0VarArr[i7].e);
        return !os0VarArr[i7].a.isEmpty();
    }

    public final void a1(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7) {
        new org.telegram.ui.e21(f2Var, j3, this.o1[1], new bi.f4(this, j3, i7)).show();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.kd));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(int i7, yr0 yr0Var) {
        String str;
        yr0 yr0Var2;
        yr0 yr0Var3;
        boolean z9;
        di.r6 r6Var;
        TLRPC.Chat M0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        tp0 tp0Var;
        tp0 tp0Var2;
        int i10;
        org.telegram.ui.ActionBar.z0 z0Var;
        boolean z10;
        yr0 yr0Var4;
        org.telegram.ui.ActionBar.z0 z0Var2;
        org.telegram.ui.ActionBar.z0 z0Var3;
        ys0 y12;
        boolean z02 = z0(i7);
        org.telegram.ui.ActionBar.f2 f2Var = this.x1;
        int currentAccount = f2Var.getCurrentAccount();
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(currentAccount);
        long j3 = this.l1;
        TLRPC.User a22 = s12.a2(Long.valueOf(j3));
        boolean i11 = getStoriesController().i(j3);
        int i12 = 3;
        int i13 = 4;
        final int i14 = 1;
        if (J0(i7) && i11 && (y12 = y1(i7)) != null) {
            int i15 = y12.b;
            yr0Var.b0(R.drawable.menu_add_stories, new xo0(this, i15, i14), org.telegram.messenger.id.M0(2131744798, null), false, true);
            B(yr0Var, f2Var, this.l1, i15);
            yr0Var.b0(R.drawable.tabs_reorder, new xo0(this, i15, i12), org.telegram.messenger.id.M0(2131744790, null), false, true);
            yr0Var.b0(R.drawable.msg_delete, new xo0(this, i15, i13), org.telegram.messenger.id.M0(2131744796, null), true, true);
            yr0Var.G();
            C(yr0Var);
            return true;
        }
        int i16 = 5;
        final int i17 = 0;
        if (i7 == 14) {
            vp0 vp0Var = this.a0;
            if (vp0Var != null) {
                zh.z1 currentPage = vp0Var.getCurrentPage();
                bi.v9 v9Var = currentPage == null ? null : currentPage.e;
                if (v9Var != null) {
                    long j10 = vp0Var.c;
                    int i18 = vp0Var.b;
                    boolean w10 = j10 == org.telegram.messenger.p10.i(i18).e() ? true : j10 >= 0 ? false : org.telegram.messenger.t3.w(5, org.telegram.messenger.qp.s1(i18).M0(Long.valueOf(-j10)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (v9Var.c) {
                        i10 = 11;
                        z0Var = null;
                        z10 = false;
                    } else {
                        i10 = 11;
                        z0Var = yr0Var.b0(R.drawable.menu_sort_value, new w80(15, v9Var, runnableArr), org.telegram.messenger.id.M0(2131750197, null), false, false);
                        z10 = true;
                    }
                    if (vp0Var.b()) {
                        yr0Var.b0(R.drawable.menu_folder_add, new to0(this, i10), org.telegram.messenger.id.M0(2131750098, null), false, true);
                        z10 = true;
                    }
                    if (vp0Var.e.h()) {
                        if (!v9Var.i().isEmpty() || currentPage.d) {
                            yr0Var.b0(R.drawable.tabs_reorder, new to0(this, 12), org.telegram.messenger.id.M0(2131750033, null), false, true);
                            yr0Var4 = yr0Var;
                        } else {
                            yr0Var4 = yr0Var;
                        }
                        z10 = true;
                    } else {
                        yr0Var4 = yr0Var;
                    }
                    if (z10) {
                        yr0Var4.G();
                    }
                    org.telegram.ui.ActionBar.z0 H = yr0Var4.H(org.telegram.messenger.id.M0(2131750195, null));
                    org.telegram.ui.ActionBar.z0 H2 = yr0Var4.H(org.telegram.messenger.id.M0(2131750199, null));
                    org.telegram.ui.ActionBar.z0 H3 = yr0Var4.H(org.telegram.messenger.id.M0(2131750194, null));
                    org.telegram.ui.ActionBar.z0 H4 = yr0Var4.H(org.telegram.messenger.id.M0(2131750196, null));
                    if (w10) {
                        yr0Var4.G();
                        org.telegram.ui.ActionBar.z0 H5 = yr0Var4.H(org.telegram.messenger.id.M0(2131750201, null));
                        z0Var3 = yr0Var4.H(org.telegram.messenger.id.M0(2131750200, null));
                        z0Var2 = H5;
                    } else {
                        z0Var2 = null;
                        z0Var3 = null;
                    }
                    bi.v9 v9Var2 = v9Var;
                    hp0 hp0Var = new hp0(z0Var, v9Var2, H, H2, H3, H4, w10, z0Var2, z0Var3);
                    org.telegram.ui.ActionBar.z0 z0Var4 = z0Var2;
                    org.telegram.ui.ActionBar.z0 z0Var5 = z0Var3;
                    runnableArr[0] = hp0Var;
                    hp0Var.run();
                    zh.d2.j(H, v9Var2, runnableArr[0], 1);
                    zh.d2.j(H2, v9Var2, runnableArr[0], 2);
                    zh.d2.j(H3, v9Var2, runnableArr[0], 4);
                    zh.d2.j(H4, v9Var2, runnableArr[0], 8);
                    if (w10) {
                        zh.d2.j(z0Var4, v9Var2, runnableArr[0], 256);
                        zh.d2.j(z0Var5, v9Var2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i7 == 13 && a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit && (tp0Var = this.W) != null) {
            int itemsCount = tp0Var.getItemsCount();
            if (itemsCount < f2Var.getMessagesController().T5) {
                tp0Var2 = tp0Var;
                yr0Var.b0(R.drawable.msg_addbot, new to0(this, 4), org.telegram.messenger.id.M0(2131746715, null), false, true);
            } else {
                tp0Var2 = tp0Var;
            }
            if (itemsCount > 1 && !tp0Var2.d()) {
                yr0Var.b0(R.drawable.tabs_reorder, new to0(this, i16), org.telegram.messenger.id.M0(2131746690, null), false, true);
            }
            if (itemsCount > 0) {
                yr0Var.b0(R.drawable.msg_select, new to0(this, 6), org.telegram.messenger.id.M0(tp0Var2.d() ? 2131746688 : 2131746689, null), false, true);
            }
            if (!TextUtils.isEmpty(tp0Var2.getCurrentLang())) {
                yr0Var.b0(R.drawable.msg_delete, new to0(this, 7), org.telegram.messenger.id.a0(null, null, 2131746691, l21.O0(tp0Var2.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i7 == 11) {
                yr0Var.b0(R.drawable.msg_discussion, new to0(this, 8), org.telegram.messenger.id.M0(2131745864, null), false, true);
                yr0Var.G();
                yr0Var.b0(R.drawable.msg_home, new to0(this, 9), org.telegram.messenger.id.M0(2131754390, null), false, true);
                yr0Var.b0(R.drawable.msg_delete, new to0(this, 10), org.telegram.messenger.id.M0(2131751590, null), false, true);
                return true;
            }
            if ((i7 == 8 || J0(i7)) && i11) {
                str = null;
                yr0Var2 = yr0Var;
                yr0Var2.b0(R.drawable.menu_album_add, new to0(this, 2), org.telegram.messenger.id.M0(2131744807, null), false, true);
                yr0Var2.G();
            } else {
                yr0Var2 = yr0Var;
                str = null;
            }
            C(yr0Var2);
            if (!org.telegram.messenger.m5.C(j3) && (a22 == null || !a22.bot)) {
                yr0Var2.b0(R.drawable.msg_calendar2, new xo0(this, i7, 2), org.telegram.messenger.id.M0(2131752642, str), false, true);
                if (this.f1 == null || I0() || (M0 = org.telegram.messenger.qp.s1(currentAccount).M0(Long.valueOf(this.f1.id))) == null || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    yr0Var3 = yr0Var;
                } else {
                    yr0Var3 = yr0Var;
                    yr0Var3.b0(R.drawable.msg_archive, new to0(this, 3), org.telegram.messenger.id.M0(2131747810, str), false, true);
                }
                os0[] os0VarArr = this.v1;
                if (!z02) {
                    os0 os0Var = os0VarArr[0];
                    if (!os0Var.w || !os0Var.v) {
                        boolean[] zArr = os0Var.i;
                        if (zArr[0] && zArr[1] && os0Var.l) {
                            z9 = false;
                            if (z9) {
                                yr0Var3.G();
                                final org.telegram.ui.ActionBar.z0 H6 = yr0Var3.H(org.telegram.messenger.id.M0(2131748653, str));
                                final org.telegram.ui.ActionBar.z0 H7 = yr0Var3.H(org.telegram.messenger.id.M0(2131748652, str));
                                if (!z02) {
                                    int i19 = os0VarArr[0].q;
                                    H6.setChecked(i19 == 0 || i19 == 1);
                                    int i20 = os0VarArr[0].q;
                                    H7.setChecked(i20 == 0 || i20 == 2);
                                    H6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ep0
                                        public final /* synthetic */ zs0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i17) {
                                                case 0:
                                                    final int i21 = 1;
                                                    final zs0 zs0Var = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var6 = H6;
                                                    final org.telegram.ui.ActionBar.z0 z0Var7 = H7;
                                                    zs0Var.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i21) {
                                                                case 0:
                                                                    zs0 zs0Var2 = zs0Var;
                                                                    zs0Var2.v1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    zs0Var2.M();
                                                                    break;
                                                                default:
                                                                    zs0 zs0Var3 = zs0Var;
                                                                    zs0Var3.v1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    zs0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i22 = 0;
                                                    final zs0 zs0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var8 = H7;
                                                    final org.telegram.ui.ActionBar.z0 z0Var9 = H6;
                                                    zs0Var2.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    zs0 zs0Var22 = zs0Var2;
                                                                    zs0Var22.v1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    zs0Var22.M();
                                                                    break;
                                                                default:
                                                                    zs0 zs0Var3 = zs0Var2;
                                                                    zs0Var3.v1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    zs0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    H7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ep0
                                        public final /* synthetic */ zs0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i14) {
                                                case 0:
                                                    final int i21 = 1;
                                                    final zs0 zs0Var = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var6 = H7;
                                                    final org.telegram.ui.ActionBar.z0 z0Var7 = H6;
                                                    zs0Var.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i21) {
                                                                case 0:
                                                                    zs0 zs0Var22 = zs0Var;
                                                                    zs0Var22.v1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    zs0Var22.M();
                                                                    break;
                                                                default:
                                                                    zs0 zs0Var3 = zs0Var;
                                                                    zs0Var3.v1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    zs0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i22 = 0;
                                                    final zs0 zs0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var8 = H6;
                                                    final org.telegram.ui.ActionBar.z0 z0Var9 = H7;
                                                    zs0Var2.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    zs0 zs0Var22 = zs0Var2;
                                                                    zs0Var22.v1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    zs0Var22.M();
                                                                    break;
                                                                default:
                                                                    zs0 zs0Var3 = zs0Var2;
                                                                    zs0Var3.v1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    zs0Var3.M();
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
                                final ws0 z12 = z1(i7);
                                if (z12 != null && (r6Var = z12.s) != null) {
                                    H6.setChecked(r6Var.n);
                                    H7.setChecked(z12.s.o);
                                }
                                final int i21 = 0;
                                H6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dp0
                                    public final /* synthetic */ zs0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i21) {
                                            case 0:
                                                final int i22 = 1;
                                                final ws0 ws0Var = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var6 = H6;
                                                final org.telegram.ui.ActionBar.z0 z0Var7 = H7;
                                                this.b.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.fp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        di.r6 r6Var2;
                                                        di.r6 r6Var3;
                                                        switch (i22) {
                                                            case 0:
                                                                ws0 ws0Var2 = ws0Var;
                                                                if (ws0Var2 != null && (r6Var2 = ws0Var2.s) != null) {
                                                                    boolean z11 = z0Var6.getCheckView().a.q;
                                                                    boolean z13 = z0Var7.getCheckView().a.q;
                                                                    r6Var2.n = z11;
                                                                    r6Var2.o = z13;
                                                                    r6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                ws0 ws0Var3 = ws0Var;
                                                                if (ws0Var3 != null && (r6Var3 = ws0Var3.s) != null) {
                                                                    boolean z14 = z0Var6.getCheckView().a.q;
                                                                    boolean z15 = z0Var7.getCheckView().a.q;
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
                                                final ws0 ws0Var2 = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var8 = H7;
                                                final org.telegram.ui.ActionBar.z0 z0Var9 = H6;
                                                this.b.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.fp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        di.r6 r6Var2;
                                                        di.r6 r6Var3;
                                                        switch (i23) {
                                                            case 0:
                                                                ws0 ws0Var22 = ws0Var2;
                                                                if (ws0Var22 != null && (r6Var2 = ws0Var22.s) != null) {
                                                                    boolean z11 = z0Var8.getCheckView().a.q;
                                                                    boolean z13 = z0Var9.getCheckView().a.q;
                                                                    r6Var2.n = z11;
                                                                    r6Var2.o = z13;
                                                                    r6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                ws0 ws0Var3 = ws0Var2;
                                                                if (ws0Var3 != null && (r6Var3 = ws0Var3.s) != null) {
                                                                    boolean z14 = z0Var8.getCheckView().a.q;
                                                                    boolean z15 = z0Var9.getCheckView().a.q;
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
                                H7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dp0
                                    public final /* synthetic */ zs0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i22) {
                                            case 0:
                                                final int i222 = 1;
                                                final ws0 ws0Var = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var6 = H7;
                                                final org.telegram.ui.ActionBar.z0 z0Var7 = H6;
                                                this.b.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.fp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        di.r6 r6Var2;
                                                        di.r6 r6Var3;
                                                        switch (i222) {
                                                            case 0:
                                                                ws0 ws0Var22 = ws0Var;
                                                                if (ws0Var22 != null && (r6Var2 = ws0Var22.s) != null) {
                                                                    boolean z11 = z0Var6.getCheckView().a.q;
                                                                    boolean z13 = z0Var7.getCheckView().a.q;
                                                                    r6Var2.n = z11;
                                                                    r6Var2.o = z13;
                                                                    r6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                ws0 ws0Var3 = ws0Var;
                                                                if (ws0Var3 != null && (r6Var3 = ws0Var3.s) != null) {
                                                                    boolean z14 = z0Var6.getCheckView().a.q;
                                                                    boolean z15 = z0Var7.getCheckView().a.q;
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
                                                final ws0 ws0Var2 = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var8 = H6;
                                                final org.telegram.ui.ActionBar.z0 z0Var9 = H7;
                                                this.b.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.fp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        di.r6 r6Var2;
                                                        di.r6 r6Var3;
                                                        switch (i23) {
                                                            case 0:
                                                                ws0 ws0Var22 = ws0Var2;
                                                                if (ws0Var22 != null && (r6Var2 = ws0Var22.s) != null) {
                                                                    boolean z11 = z0Var8.getCheckView().a.q;
                                                                    boolean z13 = z0Var9.getCheckView().a.q;
                                                                    r6Var2.n = z11;
                                                                    r6Var2.o = z13;
                                                                    r6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                ws0 ws0Var3 = ws0Var2;
                                                                if (ws0Var3 != null && (r6Var3 = ws0Var3.s) != null) {
                                                                    boolean z14 = z0Var8.getCheckView().a.q;
                                                                    boolean z15 = z0Var9.getCheckView().a.q;
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
                z9 = true;
                if (z9) {
                }
            }
        }
        return true;
    }

    public final void b1(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7) {
        v4.s0(f2Var, org.telegram.messenger.id.M0(2131751598, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744795, getStoriesController().w(i7, j3))), org.telegram.messenger.id.M0(2131751598, null), true, new bi.ia(this, j3, i7, 8));
    }

    public final void c0(int i7, qj0 qj0Var, boolean z9) {
        ArrayList arrayList = this.v1[i7].e;
        int L0 = ((v4.b0) qj0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            zr0 zr0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((zr0) arrayList.get(i10)).b) {
                        zr0Var = (zr0) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (zr0Var == null) {
                    zr0Var = (zr0) jg.g.i(1, arrayList);
                }
            }
            if (zr0Var != null) {
                L0(i7, zr0Var.d, zr0Var.b + 1, z9);
            }
        }
    }

    public final void c1(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7) {
        String w10 = getStoriesController().w(i7, j3);
        Context context = f2Var.getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = f2Var.getResourceProvider();
        c4.n nVar = new c4.n(this, j3, i7, 5);
        Pattern pattern = v4.a;
        v4.O(context, f2Var, org.telegram.messenger.id.M0(2131744782, null), org.telegram.messenger.id.M0(2131744781, null), org.telegram.messenger.id.M0(2131744780, null), w10, 12, org.telegram.messenger.id.M0(2131746278, null), resourceProvider, nVar);
    }

    public final void d0() {
        ur0[] ur0VarArr;
        ur0 ur0Var;
        int i7;
        v4.g0 adapter;
        if (this.q1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ur0VarArr = this.m0;
                if (i11 >= ur0VarArr.length) {
                    ur0Var = null;
                    break;
                }
                ur0Var = ur0VarArr[i11];
                if (ur0Var.E == this.r1) {
                    break;
                } else {
                    i11++;
                }
            }
            if (ur0Var != null) {
                boolean z02 = z0(ur0Var.E);
                float f10 = this.p1;
                os0[] os0VarArr = this.v1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.q1 = false;
                        if (this.r1 == 0) {
                            os0VarArr[0].g(false);
                        }
                        ur0Var.n.setVisibility(8);
                        ur0Var.h.invalidate();
                        return;
                    }
                    boolean z9 = f10 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new uq0(this, ur0Var, i10));
                    ofFloat.addListener(new org.telegram.ui.li(this, z9, z02 ? 1 : 0, ur0Var));
                    ofFloat.setInterpolator(xq.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.q1 = false;
                int i12 = this.s1;
                int[] iArr = this.o1;
                iArr[z02 ? 1 : 0] = i12;
                if (!z02) {
                    org.telegram.messenger.iz.B(i12);
                } else if (m0(ur0Var.E) >= 5) {
                    org.telegram.messenger.iz.F(this.s1);
                }
                for (int i13 = 0; i13 < ur0VarArr.length; i13++) {
                    ur0 ur0Var2 = ur0VarArr[i13];
                    if (ur0Var2 != null && ur0Var2.h != null && (((i7 = ur0Var2.E) == 0 || z0(i7)) && (adapter = ur0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            os0VarArr[0].g(false);
                        }
                        ur0VarArr[i13].n.setVisibility(8);
                        ur0VarArr[i13].x.y1(iArr[z02 ? 1 : 0]);
                        ur0VarArr[i13].h.a0();
                        ur0VarArr[i13].h.invalidate();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.b4(ur0VarArr[i13].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    j1();
                    return;
                }
                while (i10 < ur0VarArr.length) {
                    ur0 ur0Var3 = ur0VarArr[i10];
                    if (ur0Var3.E == this.r1) {
                        View m10 = ur0Var3.r.m(this.s);
                        if (m10 != null) {
                            this.w = m10.getTop();
                        }
                        ur0 ur0Var4 = ur0VarArr[i10];
                        ur0Var4.x.h1(this.s, (-ur0Var4.h.getPaddingTop()) + this.w);
                    }
                    i10++;
                }
            }
        }
    }

    public final void d1(String str) {
        boolean J3 = org.telegram.messenger.g0.J3(str);
        org.telegram.ui.ActionBar.f2 f2Var = this.x1;
        if (J3) {
            v4.n0(f2Var, str, true, true);
        } else {
            vf.c.t(f2Var.getParentActivity(), str);
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
    @Override // org.telegram.messenger.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        dq0 dq0Var;
        org.telegram.messenger.ij ijVar;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i11;
        pj0 pj0Var;
        int i12;
        boolean z9;
        boolean z10;
        int i13;
        int size;
        int i14;
        boolean z11;
        dq0 dq0Var2;
        int i15;
        int i16;
        dq0 dq0Var3;
        int i17 = org.telegram.messenger.qs.V;
        pj0 pj0Var2 = this.Q;
        pj0 pj0Var3 = this.O;
        ns0 ns0Var = this.L;
        pj0 pj0Var4 = this.N;
        pj0 pj0Var5 = this.M;
        org.telegram.ui.ActionBar.f2 f2Var = this.x1;
        is0 is0Var = this.P;
        fr0 fr0Var = this.J;
        long j3 = this.l1;
        ur0[] ur0VarArr = this.m0;
        os0[] os0VarArr = this.v1;
        if (i7 == i17) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != f2Var.getClassGuid() || intValue2 != os0VarArr[intValue3].p) {
                if (this.w1 == null || !os0VarArr[intValue3].a.isEmpty() || os0VarArr[intValue3].o || !a0(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    pj0Var2 = fr0Var;
                } else if (intValue3 == 1) {
                    pj0Var2 = pj0Var5;
                } else if (intValue3 == 2) {
                    pj0Var2 = pj0Var4;
                } else if (intValue3 == 3) {
                    pj0Var2 = ns0Var;
                } else if (intValue3 == 4) {
                    pj0Var2 = pj0Var3;
                } else if (intValue3 != 5) {
                    pj0Var2 = intValue3 == 15 ? is0Var : null;
                }
                if (pj0Var2 != null) {
                    for (int i18 = 0; i18 < ur0VarArr.length; i18++) {
                        ur0 ur0Var = ur0VarArr[i18];
                        if (ur0Var != null && (dq0Var2 = ur0Var.h) != null && dq0Var2.getAdapter() == pj0Var2) {
                            ur0VarArr[i18].h.C0();
                        }
                    }
                    pj0Var2.f();
                }
                this.d1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean C = org.telegram.messenger.m5.C(j3);
            int i19 = longValue == j3 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                os0VarArr[intValue3].f[i19] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i15 = intValue3;
                pj0Var2 = fr0Var;
            } else if (intValue3 == 1) {
                i15 = intValue3;
                pj0Var2 = pj0Var5;
            } else if (intValue3 == 2) {
                i15 = intValue3;
                pj0Var2 = pj0Var4;
            } else if (intValue3 == 3) {
                i15 = intValue3;
                pj0Var2 = ns0Var;
            } else if (intValue3 == 4) {
                i15 = intValue3;
                pj0Var2 = pj0Var3;
            } else if (intValue3 == 5) {
                i15 = intValue3;
            } else if (intValue3 == 15) {
                pj0Var2 = is0Var;
                i15 = 8;
            } else {
                i15 = intValue3;
                pj0Var2 = null;
            }
            int size2 = os0VarArr[i15].a.size();
            if (pj0Var2 != null) {
                i16 = pj0Var2.b();
                if (pj0Var2 instanceof lj0) {
                    ((lj0) pj0Var2).L();
                }
            } else {
                i16 = 0;
            }
            os0VarArr[i15].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(size3);
                    if (os0VarArr[i15].a(ijVar2, i19, r13, C)) {
                        sparseBooleanArray.put(ijVar2.e1(), r13);
                        os0 os0Var = os0VarArr[i15];
                        int i20 = os0Var.m - r13;
                        os0Var.m = i20;
                        if (i20 < 0) {
                            os0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                os0VarArr[i15].l = ((Boolean) objArr[5]).booleanValue();
                os0 os0Var2 = os0VarArr[i15];
                if (os0Var2.l) {
                    os0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i21);
                    if (os0VarArr[i15].a(ijVar3, i19, r12, C)) {
                        sparseBooleanArray.put(ijVar3.e1(), true);
                        os0 os0Var3 = os0VarArr[i15];
                        int i22 = os0Var3.n - 1;
                        os0Var3.n = i22;
                        if (i22 < 0) {
                            os0Var3.n = r12;
                        }
                    }
                    i21++;
                    r12 = 0;
                }
                os0 os0Var4 = os0VarArr[i15];
                if (os0Var4.o && os0Var4.a.size() > 0) {
                    os0 os0Var5 = os0VarArr[i15];
                    os0Var5.k = ((org.telegram.messenger.ij) os0Var5.a.get(0)).e1();
                }
                os0VarArr[i15].i[i19] = ((Boolean) objArr[5]).booleanValue();
                os0 os0Var6 = os0VarArr[i15];
                if (os0Var6.i[i19]) {
                    int size4 = os0Var6.b[i19].size();
                    if (i19 == 0) {
                        size4 += os0VarArr[i15].m;
                    }
                    os0VarArr[i15].f[i19] = size4;
                }
            }
            if (!booleanValue && i19 == 0) {
                os0 os0Var7 = os0VarArr[i15];
                if (os0Var7.i[i19] && this.e1 != 0) {
                    os0Var7.g = true;
                    f2Var.getMediaDataController().N0(this.e1, 50, os0VarArr[i15].j[1], 0, i15, this.F, 1, f2Var.getClassGuid(), os0VarArr[i15].p, null, null);
                }
            }
            int i23 = i15;
            if (pj0Var2 != null) {
                tr0 tr0Var = null;
                for (int i24 = 0; i24 < ur0VarArr.length; i24++) {
                    ur0 ur0Var2 = ur0VarArr[i24];
                    if (ur0Var2 != null && (dq0Var3 = ur0Var2.h) != null && dq0Var3.getAdapter() == pj0Var2) {
                        tr0 tr0Var2 = ur0VarArr[i24].h;
                        tr0Var2.C0();
                        tr0Var = tr0Var2;
                    }
                }
                int b10 = pj0Var2.b();
                if (pj0Var2 != fr0Var) {
                    try {
                        pj0Var2.f();
                    } catch (Throwable unused) {
                    }
                } else if (fr0Var.b() == i16) {
                    org.telegram.messenger.g0.b4(tr0Var);
                } else {
                    fr0Var.f();
                }
                if (!os0VarArr[i23].a.isEmpty() || os0VarArr[i23].g) {
                    if (tr0Var != null && (pj0Var2 == fr0Var || b10 >= i16)) {
                        D(tr0Var, i16, sparseBooleanArray);
                    }
                } else if (tr0Var != null) {
                    D(tr0Var, i16, sparseBooleanArray);
                }
                if (tr0Var != null && !os0VarArr[i23].o) {
                    if (size2 == 0) {
                        for (int i25 = 0; i25 < 2; i25++) {
                            if (ur0VarArr[i25].E == 0) {
                                ((v4.b0) tr0Var.getLayoutManager()).h1(fr0Var.L(0), 0);
                            }
                        }
                    } else {
                        j1();
                    }
                }
            }
            os0 os0Var8 = os0VarArr[i23];
            if (os0Var8.o) {
                if (os0Var8.a.size() == 0) {
                    N0(i23);
                } else {
                    os0VarArr[i23].o = false;
                }
            }
            this.d1 = true;
            return;
        }
        if (i7 == org.telegram.messenger.qs.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat M0 = org.telegram.messenger.m5.z(j3) ? f2Var.getMessagesController().M0(Long.valueOf(-j3)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (org.telegram.messenger.t3.T(M0)) {
                if (longValue2 == 0 && this.e1 != 0) {
                    i13 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i26 = -1;
                    i14 = 0;
                    z11 = false;
                    while (i14 < size) {
                        fr0 fr0Var2 = fr0Var;
                        int i27 = 0;
                        while (i27 < os0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (os0VarArr[i27].b(((Integer) arrayList2.get(i14)).intValue(), i13) != null) {
                                i26 = i27;
                                z11 = true;
                            }
                            i27++;
                            arrayList2 = arrayList3;
                        }
                        i14++;
                        fr0Var = fr0Var2;
                    }
                    fr0 fr0Var3 = fr0Var;
                    if (z11) {
                        this.d1 = true;
                        if (fr0Var3 != null) {
                            fr0Var3.f();
                        }
                        if (pj0Var5 != null) {
                            pj0Var5.f();
                        }
                        if (pj0Var4 != null) {
                            pj0Var4.f();
                        }
                        if (ns0Var != null) {
                            ns0Var.X(false);
                        }
                        if (pj0Var3 != null) {
                            pj0Var3.f();
                        }
                        if (is0Var != null) {
                            is0Var.f();
                        }
                        if (pj0Var2 != null) {
                            pj0Var2.f();
                        }
                        if (i26 == 0 || i26 == 1 || i26 == 2 || i26 == 4) {
                            M0(true);
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
            z11 = false;
            while (i14 < size) {
            }
            fr0 fr0Var32 = fr0Var;
            if (z11) {
            }
            g0(i262);
            return;
        }
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j3) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean C2 = org.telegram.messenger.m5.C(j3);
                int i28 = 0;
                boolean z12 = false;
                while (i28 < arrayList4.size()) {
                    org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) arrayList4.get(i28);
                    ArrayList arrayList5 = arrayList4;
                    if (org.telegram.messenger.ij.n1(ijVar4.k) == null || ijVar4.m5()) {
                        i12 = i28;
                    } else {
                        int f02 = org.telegram.messenger.ui.f0(ijVar4.k);
                        i12 = i28;
                        if (f02 == -1) {
                            return;
                        }
                        os0 os0Var9 = os0VarArr[f02];
                        if (os0Var9.l) {
                            z10 = z12;
                            if (os0Var9.a(ijVar4, org.telegram.messenger.ij.B0(ijVar4.k) == j3 ? 0 : 1, true, C2)) {
                                this.Z0[f02] = 1;
                                z9 = true;
                                i28 = i12 + 1;
                                z12 = z9;
                                arrayList4 = arrayList5;
                            }
                            z9 = z10;
                            i28 = i12 + 1;
                            z12 = z9;
                            arrayList4 = arrayList5;
                        }
                    }
                    z10 = z12;
                    z9 = z10;
                    i28 = i12 + 1;
                    z12 = z9;
                    arrayList4 = arrayList5;
                }
                boolean z13 = z12;
                boolean z14 = true;
                if (z13) {
                    this.d1 = true;
                    int i29 = 0;
                    while (i29 < ur0VarArr.length) {
                        int i30 = ur0VarArr[i29].E;
                        if (i30 == 0) {
                            pj0Var = fr0Var;
                        } else if (i30 == z14) {
                            pj0Var = pj0Var5;
                        } else if (i30 == 2) {
                            pj0Var = pj0Var4;
                        } else if (i30 == 3) {
                            pj0Var = ns0Var;
                        } else {
                            if (i30 == 4) {
                                pj0Var = pj0Var3;
                            } else if (i30 == 5) {
                                pj0Var = pj0Var2;
                            } else {
                                pj0Var = i30 == 15 ? is0Var : null;
                                if (pj0Var != null) {
                                    pj0Var.b();
                                    fr0Var.f();
                                    pj0Var5.f();
                                    pj0Var4.f();
                                    ns0Var.X(false);
                                    pj0Var3.f();
                                    is0Var.f();
                                    pj0Var2.f();
                                }
                                i29++;
                                z14 = true;
                            }
                            if (pj0Var != null) {
                            }
                            i29++;
                            z14 = true;
                        }
                        if (pj0Var != null) {
                        }
                        i29++;
                        z14 = true;
                    }
                    P1(z14);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.K) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l10 = (Long) objArr[3];
            if (l10.longValue() == j3 || l10.longValue() == this.e1) {
                int i31 = l10.longValue() == j3 ? 0 : 1;
                for (os0 os0Var10 : os0VarArr) {
                    os0Var10.f(i31, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i32 = org.telegram.messenger.qs.h2;
        int i33 = org.telegram.messenger.qs.f2;
        int i34 = org.telegram.messenger.qs.g2;
        if (i7 == i32 || i7 == i34 || i7 == i33) {
            if (i7 != i33 && i7 != i34) {
                if (((org.telegram.messenger.ij) objArr[0]).T != 0) {
                    return;
                }
                for (int i35 = 0; i35 < ur0VarArr.length; i35++) {
                    int childCount = ur0VarArr[i35].h.getChildCount();
                    for (int i36 = 0; i36 < childCount; i36++) {
                        View childAt = ur0VarArr[i35].h.getChildAt(i36);
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                            if (g7Var.getMessage() != null) {
                                g7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i37 = 0; i37 < ur0VarArr.length; i37++) {
                ur0 ur0Var3 = ur0VarArr[i37];
                if (ur0Var3 != null && (dq0Var = ur0Var3.h) != null) {
                    int childCount2 = dq0Var.getChildCount();
                    for (int i38 = 0; i38 < childCount2; i38++) {
                        View childAt2 = ur0VarArr[i37].h.getChildAt(i38);
                        if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                            if (g7Var2.getMessage() != null) {
                                g7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.x5) {
            di.r6 r6Var = (di.r6) objArr[0];
            ir0 ir0Var = this.e0;
            if (ir0Var == null || r6Var != ir0Var.s) {
                sp0 sp0Var = this.g0;
                if (sp0Var == null || r6Var != sp0Var.s) {
                    Iterator it = this.l2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        ys0 ys0Var = (ys0) it.next();
                        if (ys0Var.c.s == r6Var) {
                            i11 = ys0Var.a;
                            break;
                        }
                    }
                } else {
                    i11 = 9;
                }
            } else {
                i11 = 8;
            }
            ur0 g02 = g0(i11);
            if (g02 != null) {
                if (g02.b != (r6Var.g() > 0)) {
                    g02.b = r6Var.g() > 0;
                    F1(g02, true);
                }
            }
            if (g02 != null) {
                org.telegram.messenger.g0.r2(g02.h);
                if (g02.h.getLayoutManager() instanceof v4.b0) {
                    qj0 qj0Var = g02.h;
                    O(g02, qj0Var, (v4.b0) qj0Var.getLayoutManager());
                }
            }
            or0 or0Var = this.F1;
            if (or0Var != null) {
                or0Var.V();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.v5) {
            for (ur0 ur0Var4 : ur0VarArr) {
                if (ur0Var4 != null && ur0Var4.h != null && z0(ur0Var4.E)) {
                    if (!B0() || ur0Var4.h.getAdapter() == null) {
                        for (int i39 = 0; i39 < ur0Var4.h.getChildCount(); i39++) {
                            View childAt3 = ur0Var4.h.getChildAt(i39);
                            if (childAt3 instanceof org.telegram.ui.Cells.o7) {
                                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt3;
                                i6 i6Var = o7Var.N;
                                if (!o7Var.d0 || (ijVar = o7Var.n) == null || (storyItem = ijVar.l) == null || (storyViews = storyItem.views) == null) {
                                    o7Var.L = false;
                                    i6Var.t("", false, true);
                                } else {
                                    int i40 = storyViews.views_count;
                                    o7Var.L = i40 > 0;
                                    i6Var.t(org.telegram.messenger.g0.o0(i40, 0), true, true);
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.r2(ur0Var4.h);
                    }
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.f3) {
            if (((Long) objArr[0]).longValue() == j3) {
                this.S.E(true);
                P1(true);
                N();
                return;
            }
            return;
        }
        int i41 = org.telegram.messenger.qs.g3;
        ks0 ks0Var = this.T;
        if (i7 == i41) {
            if (j3 == 0 || j3 == f2Var.getUserConfig().e()) {
                ks0Var.F(true);
                P1(true);
                N();
                Y0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.s) {
            ks0Var.F(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.G3) {
            if (((Long) objArr[0]).longValue() == j3) {
                P1(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.W3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j3 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            mr0 mr0Var = this.c0;
            if (mr0Var != null) {
                TLRPC.ChatFull chatFull = mr0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i42 = 0; i42 < mr0Var.d.participants.participants.size(); i42++) {
                        mr0Var.d.participants.participants.get(i42).setRank(longValue4, str);
                    }
                }
                for (ur0 ur0Var5 : ur0VarArr) {
                    if (ur0Var5.E == 7) {
                        org.telegram.messenger.g0.b4(ur0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.f1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i43 = 0; i43 < ur0VarArr.length; i43++) {
                if (ur0VarArr[i43].h.getAdapter() == is0Var) {
                    dq0 dq0Var4 = ur0VarArr[i43].h;
                    ArrayList arrayList6 = is0Var.n;
                    for (int i44 = 0; i44 < arrayList6.size(); i44++) {
                        org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) arrayList6.get(i44);
                        if (ijVar5 != null && ijVar5.D1() == longValue5) {
                            TLRPC.MessageMedia messageMedia = ijVar5.k.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                org.telegram.messenger.ij.d6(tL_messageMediaPoll, pollResults);
                                is0Var.g(i44);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vq0 vq0Var = this.K0;
        if (vq0Var != null) {
            canvas.save();
            canvas.translate(vq0Var.getX(), vq0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        rq0 rq0Var = this.T0;
        if (rq0Var != null) {
            int i7 = rq0Var.U;
            if ((i7 == 3 || i7 == 1) && this.R0 == null) {
                canvas.save();
                canvas.translate(rq0Var.getX(), rq0Var.getY());
                rq0Var.setDrawOverlay(true);
                rq0Var.draw(canvas);
                rq0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        if (this.b2 && (view instanceof ur0) && this.f2 < this.d2) {
            canvas.save();
            canvas.clipRect(0, -this.f2, getWidth(), getHeight() + this.e2);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        if (view != this.T0 || this.R0 != null) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        ur0[] ur0VarArr = this.m0;
        float top = ur0VarArr[0].getTop();
        zp0 zp0Var = this.b0;
        if (zp0Var != null && ((i7 = ur0VarArr[0].E) == 8 || J0(i7))) {
            top -= zp0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + org.telegram.messenger.g0.L(12.0f));
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    public final void e0(int i7) {
        ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i7 == 0) {
            if (org.telegram.messenger.g0.Q1() || org.telegram.messenger.t0.b.getResources().getConfiguration().orientation != 2) {
                this.C0.setTextSize(20);
            } else {
                this.C0.setTextSize(18);
            }
        }
        if (i7 == 0) {
            this.J.f();
        }
    }

    public int e1() {
        return -1;
    }

    public final String f0(boolean z9) {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        tp0 tp0Var;
        if (!B0()) {
            return org.telegram.messenger.id.M0(2131753014, null);
        }
        if (z9 && (tp0Var = this.W) != null) {
            return tp0Var.getBotPreviewsSubtitle();
        }
        ir0 ir0Var = this.e0;
        if (ir0Var == null || ir0Var.s == null) {
            i7 = 0;
            i10 = 0;
        } else {
            i7 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < ir0Var.s.i.size(); i11++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) ir0Var.s.i.get(i11);
                TL_stories.StoryItem storyItem = ijVar.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.ij.K4(messageMedia.document)) {
                        i10++;
                    } else if (ijVar.l.media.photo != null) {
                        i7++;
                    }
                }
            }
        }
        if (i7 == 0 && i10 == 0) {
            return org.telegram.messenger.id.M0(2131753014, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i7 > 0) {
            sb2.append(org.telegram.messenger.id.G(i7, "Images", new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.id.G(i10, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final void f1(ArrayList arrayList, boolean z9) {
        ir0 ir0Var = this.e0;
        if (ir0Var == null || ir0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.x1;
        if (z9 && arrayList.size() > f2Var.getMessagesController().N5) {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.id.G(f2Var.getMessagesController().N5, "StoriesPinLimit", new Object[0]), hc.a0(f2Var), R.raw.chats_infotip, 36);
            return;
        }
        di.r6 r6Var = ir0Var.s;
        int i7 = r6Var.c;
        ArrayList arrayList2 = r6Var.g;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        boolean z10 = true;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            num.getClass();
            if (z9 && !arrayList3.contains(num)) {
                arrayList3.add(0, num);
            } else if (!z9 && arrayList3.contains(num)) {
                arrayList3.remove(num);
            }
        }
        boolean z11 = arrayList3.size() > org.telegram.messenger.qp.s1(i7).N5;
        if (!z11) {
            boolean z12 = arrayList2.size() != arrayList3.size();
            if (!z12) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i10) != arrayList3.get(i10)) {
                        z12 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (z12) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                r6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = org.telegram.messenger.qp.s1(i7).j1(r6Var.d);
                ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new di.v5(2));
            }
            z10 = z11;
        }
        if (z10) {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.id.G(f2Var.getMessagesController().N5, "StoriesPinLimit", new Object[0]), hc.a0(f2Var), R.raw.chats_infotip, 36);
        } else if (z9) {
            hc.a0(f2Var).I(R.raw.ic_pin, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.id.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.id.G(arrayList.size(), "StoriesUnpinned", new Object[0]), hc.a0(f2Var), R.raw.ic_unpin, 36);
        }
    }

    public final ur0 g0(int i7) {
        int i10 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i10 >= ur0VarArr.length) {
                return null;
            }
            ur0 ur0Var = ur0VarArr[i10];
            if (ur0Var != null && ur0Var.E == i7) {
                return ur0Var;
            }
            i10++;
        }
    }

    public final boolean g1(MotionEvent motionEvent, boolean z9) {
        ur0 ur0Var;
        tp0 tp0Var;
        int closestTab = getClosestTab();
        vq0 vq0Var = this.K0;
        int i7 = -1;
        int i10 = vq0Var.O.get(vq0Var.n + (z9 ? 1 : -1), -1);
        zp0 zp0Var = this.b0;
        if (zp0Var != null) {
            if (J0(closestTab) || closestTab == 8) {
                v61 v61Var = zp0Var.b;
                i7 = v61Var.b0.get(v61Var.F + (z9 ? 1 : -1), -1);
            } else if (J0(i10) || i10 == 8) {
                i7 = zp0Var.getCurrentAlbumId();
            }
            if (i7 == 0) {
                i10 = 8;
            } else if (i7 > 0) {
                i10 = x1(i7).a;
            }
        }
        if (i10 >= 0) {
            if (this.p0 == null || I()) {
                this.q0 = l0(0.0f);
                M1(0.0f);
            } else {
                setSearchItemVisibility(I0() ? 8 : 4);
                this.q0 = 0.0f;
            }
            if ((!this.X0 || getSelectedTab() != 11) && (!H() || !this.E1 || (getClosestTab() != 8 && !J0(getClosestTab())))) {
                ur0[] ur0VarArr = this.m0;
                ur0 ur0Var2 = ur0VarArr[0];
                if (ur0Var2 != null && ur0Var2.E == 13 && (tp0Var = this.W) != null) {
                    ei.a aVar = tp0Var.n;
                    if (!z9) {
                    }
                }
                ur0 ur0Var3 = ur0VarArr[0];
                vp0 vp0Var = this.a0;
                if (ur0Var3 != null && ur0Var3.E == 14 && vp0Var != null) {
                    ei.a aVar2 = vp0Var.h;
                    if (!z9) {
                    }
                }
                if ((!this.E1 || (ur0Var = ur0VarArr[0]) == null || ur0Var.E != 13) && ((vp0Var == null || !vp0Var.g()) && (zp0Var == null || !zp0Var.f))) {
                    I1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.A1 = false;
                    this.z1 = true;
                    this.B1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    vq0Var.setEnabled(false);
                    ur0 ur0Var4 = ur0VarArr[1];
                    ur0Var4.E = i10;
                    ur0Var4.setVisibility(0);
                    this.j1 = z9;
                    B1(true);
                    if (z9) {
                        ur0VarArr[1].setTranslationX(ur0VarArr[0].getMeasuredWidth());
                    } else {
                        ur0VarArr[1].setTranslationX(-ur0VarArr[0].getMeasuredWidth());
                    }
                    Z0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public SparseArray<org.telegram.messenger.ij> getActionModeSelected() {
        return this.b1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        ur0 ur0Var;
        ur0 ur0Var2;
        di.r6 r6Var;
        di.r6 r6Var2;
        float f10 = 1.0f;
        ur0[] ur0VarArr = this.m0;
        if (ur0VarArr == null || (ur0Var = ur0VarArr[0]) == null || (ur0Var2 = ur0VarArr[1]) == null || ur0Var.w == null || ur0Var2.w == null) {
            return 1.0f;
        }
        int i7 = ur0Var.E;
        int i10 = ur0Var2.E;
        boolean z9 = J0(i7) || i7 == 8;
        boolean z10 = J0(i10) || i10 == 8;
        if (!z9 && !z10) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - ur0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - ur0VarArr[1].w.getVisibilityFactor();
        ws0 z12 = z1(ur0VarArr[0].E);
        if (i7 == 8 || (z12 != null && (r6Var2 = z12.s) != null && r6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        ws0 z13 = z1(i10);
        if (i10 != 8 && (z13 == null || (r6Var = z13.s) == null || r6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z9) {
            visibilityFactor = f10;
        }
        if (!z10) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(ur0VarArr[0].getTranslationX() / ur0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        ur0[] ur0VarArr = this.m0;
        ur0 ur0Var = ur0VarArr[1];
        if (ur0Var != null && ur0Var.getVisibility() == 0) {
            if (this.i1 && !this.k1) {
                return ur0VarArr[1].E;
            }
            if (Math.abs(ur0VarArr[1].getTranslationX()) < ur0VarArr[1].getMeasuredWidth() / 2.0f) {
                return ur0VarArr[1].E;
            }
        }
        return getSelectedTab();
    }

    public qj0 getCurrentListView() {
        gr0 gr0Var;
        ur0 ur0Var = this.m0[0];
        int i7 = ur0Var.E;
        return i7 == 13 ? this.W.getCurrentListView() : i7 == 14 ? this.a0.getCurrentListView() : (i7 != 12 || (gr0Var = this.V) == null) ? ur0Var.h : gr0Var.a.z0;
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

    public org.telegram.ui.ActionBar.r0 getSearchItem() {
        return this.p0;
    }

    public dh0 getSearchOptionsItem() {
        return this.u0;
    }

    public int getSelectedTab() {
        int currentTabId = this.K0.getCurrentTabId();
        zp0 zp0Var = this.b0;
        if (zp0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = zp0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? x1(currentAlbumId).a : currentTabId;
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
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i7 >= ur0VarArr.length) {
                return f10;
            }
            ur0 ur0Var = ur0VarArr[i7];
            if (ur0Var != null) {
                f10 = ((1.0f - Math.abs(ur0Var.getTranslationX() / getWidth())) * ur0Var.E) + f10;
            }
            i7++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.u6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.u6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.C0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.z6));
        int i7 = org.telegram.ui.ActionBar.l6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.n0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        org.telegram.ui.ActionBar.r0 r0Var = this.w0;
        if (r0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.u6(r0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.v0;
        if (r0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.u6(r0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        }
        Drawable[] drawableArr = {this.F0};
        int i10 = org.telegram.ui.ActionBar.l6.y8;
        ImageView imageView = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.u6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.D0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.K0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.ui));
        vq0 vq0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.u6(vq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.u6(vq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.si));
        arrayList.add(new org.telegram.ui.ActionBar.u6(vq0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.vi));
        rq0 rq0Var = this.T0;
        if (rq0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.u6(rq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.u6(rq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.u6(rq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.u6(rq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.A7));
        }
        final int i11 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i11 >= ur0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.t6 t6Var = new org.telegram.ui.ActionBar.t6() { // from class: org.telegram.ui.Components.kp0
                @Override // org.telegram.ui.ActionBar.t6
                public final void b() {
                    ur0[] ur0VarArr2 = zs0.this.m0;
                    int i12 = i11;
                    dq0 dq0Var = ur0VarArr2[i12].h;
                    if (dq0Var != null) {
                        int childCount = dq0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = ur0VarArr2[i12].h.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.p7) {
                                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                                for (int i14 = 0; i14 < 6; i14++) {
                                    p7Var.a[i14].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                                ((org.telegram.ui.Cells.g6) childAt).y(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.t6
                public final /* synthetic */ void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.c7));
            int i12 = org.telegram.ui.ActionBar.l6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.n6));
            arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, org.telegram.ui.ActionBar.l6.U7));
            int i13 = org.telegram.ui.ActionBar.l6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i13));
            int i14 = org.telegram.ui.ActionBar.l6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.nj));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.p7.class}, (Paint) null, (Drawable[]) null, t6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.p7.class}, (Paint) null, (Drawable[]) null, t6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, t6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, t6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.A0}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.u6(ur0VarArr[i11].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.y6));
            i11++;
        }
    }

    public int getTopPanelShift() {
        return this.o2;
    }

    public final int h0(int i7, int i10, boolean z9) {
        int i11 = i10 + (!z9 ? 1 : -1);
        if (i11 > 6) {
            i11 = !z9 ? 9 : 6;
        }
        return Utilities.j(i11, 9, (this.m1 && i7 == 1) ? 1 : 2);
    }

    public final int i0(boolean z9) {
        return this.a2 + this.e2 + (z9 ? org.telegram.messenger.g0.L(52.0f) : 0);
    }

    public final void i1(v4.g0 g0Var) {
        if (g0Var instanceof ts0) {
            ArrayList arrayList = this.G0;
            ArrayList arrayList2 = this.H0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (g0Var == this.O) {
            ArrayList arrayList3 = this.I0;
            ArrayList arrayList4 = this.J0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        is0 is0Var = this.P;
        if (g0Var == is0Var) {
            is0Var.r = null;
        }
    }

    public final int j0(int i7) {
        return n0(i7) + org.telegram.messenger.g0.L(54.0f) + this.c2 + this.d2 + this.o2 + (i7 == 9 ? org.telegram.messenger.g0.L(64.0f) : 0);
    }

    public final void j1() {
        int i7;
        int i10 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i10 >= ur0VarArr.length) {
                return;
            }
            dq0 dq0Var = ur0VarArr[i10].h;
            if (dq0Var != null) {
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < dq0Var.getChildCount(); i13++) {
                    View childAt = dq0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.o7) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                        int messageId = o7Var.getMessageId();
                        i12 = o7Var.getTop();
                        i11 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        int e12 = h7Var.getMessage().e1();
                        i12 = h7Var.getTop();
                        i11 = e12;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        i11 = g7Var.getMessage().e1();
                        i12 = g7Var.getTop();
                    }
                    if (i11 != 0) {
                        break;
                    }
                }
                if (i11 != 0) {
                    int i14 = ur0VarArr[i10].E;
                    int i15 = -1;
                    if (z0(i14)) {
                        ws0 z12 = z1(i14);
                        if (z12 != null && z12.s != null) {
                            int i16 = 0;
                            while (true) {
                                if (i16 >= z12.s.i.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.ij) z12.s.i.get(i16)).e1()) {
                                    i15 = i16;
                                    break;
                                }
                                i16++;
                            }
                        }
                        i7 = i15;
                    } else if (i14 >= 0) {
                        os0[] os0VarArr = this.v1;
                        if (i14 < os0VarArr.length) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= os0VarArr[i14].a.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.ij) os0VarArr[i14].a.get(i17)).e1()) {
                                    i15 = i17;
                                    break;
                                }
                                i17++;
                            }
                            i7 = os0VarArr[i14].m + i15;
                        }
                    }
                    if (i15 >= 0) {
                        ((v4.b0) dq0Var.getLayoutManager()).h1(i7, (-ur0VarArr[i10].h.getPaddingTop()) + i12);
                        if (this.q1) {
                            ur0 ur0Var = ur0VarArr[i10];
                            ur0Var.r.h1(i7, (-ur0Var.h.getPaddingTop()) + i12);
                        }
                    }
                }
            }
            i10++;
        }
    }

    public final float k0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        ur0[] ur0VarArr = this.m0;
        ur0 ur0Var = ur0VarArr[1];
        if (ur0Var != null && v0(ur0Var.E)) {
            f11 = 0.0f + f10;
        }
        ur0 ur0Var2 = ur0VarArr[0];
        return (ur0Var2 == null || !v0(ur0Var2.E)) ? f11 : (1.0f - f10) + f11;
    }

    public final void k1(int i7) {
        vq0 vq0Var;
        if (this.O1 || (vq0Var = this.K0) == null) {
            return;
        }
        vq0Var.g(null, i7, vq0Var.P.get(i7));
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        ur0[] ur0VarArr = this.m0;
        ur0 ur0Var = ur0VarArr[1];
        if (ur0Var != null && F0(ur0Var.E) && ur0VarArr[1].E != 11) {
            f11 = 0.0f + f10;
        }
        ur0 ur0Var2 = ur0VarArr[0];
        return (ur0Var2 == null || !F0(ur0Var2.E) || ur0VarArr[0].E == 11) ? f11 : (1.0f - f10) + f11;
    }

    public final void l1(float f10, int i7) {
        vq0 vq0Var = this.K0;
        if (vq0Var != null) {
            vq0Var.i(f10, J0(i7) ? 8 : i7);
        }
        zp0 zp0Var = this.b0;
        if (zp0Var != null) {
            v61 v61Var = zp0Var.b;
            if (J0(i7)) {
                v61Var.f(f10, w1(i7));
            } else if (i7 == 8) {
                v61Var.f(f10, 0);
            }
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return false;
    }

    public final int m0(int i7) {
        ws0 z12;
        di.r6 r6Var;
        if (!z0(i7) || (z12 = z1(i7)) == null || (r6Var = z12.s) == null) {
            return 0;
        }
        return r6Var.g();
    }

    public final void m1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i7 >= ur0VarArr.length) {
                if (this.F == 0) {
                    mr0 mr0Var = this.c0;
                    mr0Var.d = chatFull;
                    mr0Var.e = arrayList;
                }
                P1(true);
                for (int i10 = 0; i10 < ur0VarArr.length; i10++) {
                    ur0 ur0Var = ur0VarArr[i10];
                    if (ur0Var.E == 7 && ur0Var.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(ur0VarArr[i10].h);
                    }
                }
                return;
            }
            ur0 ur0Var2 = ur0VarArr[i7];
            if (ur0Var2.E == 7 && ur0Var2.h.getAdapter() != null && ur0VarArr[i7].h.getAdapter().b() != 0 && this.x1.getMessagesController().P1().j.size() > 0) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final int n0(int i7) {
        zp0 zp0Var = this.b0;
        return (int) ((zp0Var == null || !(J0(i7) || i7 == 8)) ? 0.0f : zp0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f));
    }

    public final void n1(int i7, int i10, int i11, int i12) {
        this.b2 = true;
        this.c2 = i7;
        this.d2 = i10;
        this.e2 = i11;
        this.a2 = i12;
        G();
        vp0 vp0Var = this.a0;
        if (vp0Var != null) {
            if (vp0Var.L != i10 || vp0Var.M != i11) {
                vp0Var.L = i10;
                vp0Var.M = i11;
                vp0Var.setClipChildren(i10 == 0 && i11 == 0);
                vp0Var.h.setClipChildren(i10 == 0 && i11 == 0);
                vp0Var.n();
            }
            H1();
        }
        for (ur0 ur0Var : this.m0) {
            if (ur0Var != null) {
                ur0Var.setClipChildren(false);
                J1(ur0Var);
                setPageOverscan(ur0Var.h);
                setPageOverscan(ur0Var.n);
                int paddingTop = ur0Var.h.getPaddingTop();
                dq0 dq0Var = ur0Var.h;
                int paddingLeft = dq0Var.getPaddingLeft();
                dq0 dq0Var2 = ur0Var.h;
                int j02 = j0(ur0Var.E);
                dq0Var2.g3 = j02;
                int paddingRight = ur0Var.h.getPaddingRight();
                dq0 dq0Var3 = ur0Var.h;
                int i02 = i0(I0());
                dq0Var3.h3 = i02;
                dq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - ur0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(ur0Var.h, new cp0(ur0Var, paddingTop2, 1));
                }
                ur0Var.w.setPadding(0, i7, 0, i12);
                gr0 gr0Var = this.V;
                if (gr0Var != null && gr0Var.getParent() == ur0Var) {
                    p1(org.telegram.messenger.g0.L(56.0f) + i7, gr0Var);
                }
                tp0 tp0Var = this.W;
                if (tp0Var != null && tp0Var.getParent() == ur0Var) {
                    p1(i7, tp0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void o1(int i7, boolean z9) {
        this.C0.a(i7, z9);
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        if (y4Var != null) {
            y4Var.y(i7, z9);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i7 >= ur0VarArr.length) {
                return;
            }
            dq0 dq0Var = ur0VarArr[i7].h;
            if (dq0Var != null) {
                dq0Var.getViewTreeObserver().addOnPreDrawListener(new br0(this, i7, 0));
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return T() || this.K0.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        or0 or0Var = this.F1;
        int height = or0Var.f() != null ? or0Var.f().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i7;
            } else if (childAt instanceof ur0) {
                i11 = i7;
                measureChildWithMargins(childAt, i11, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                dq0 dq0Var = ((ur0) childAt).h;
                dq0Var.setPadding(0, dq0Var.e3, 0, dq0Var.f3);
            } else {
                i11 = i7;
                i12 = i10;
                measureChildWithMargins(childAt, i11, 0, i12, 0);
                i13++;
                i7 = i11;
                i10 = i12;
            }
            i12 = i10;
            i13++;
            i7 = i11;
            i10 = i12;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (!this.O1) {
            org.telegram.ui.ActionBar.f2 f2Var = this.x1;
            if (f2Var.getParentLayout() != null && !((ActionBarLayout) f2Var.getParentLayout()).i() && !T() && !this.a) {
                if (motionEvent != null) {
                    if (this.D1 == null) {
                        this.D1 = VelocityTracker.obtain();
                    }
                    this.D1.addMovement(motionEvent);
                    fi.m3 m3Var = this.G1;
                    if (m3Var != null) {
                        m3Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.z1 && !this.A1) {
                    if (motionEvent.getY() >= org.telegram.messenger.g0.L(90.0f) + this.c2) {
                        this.y1 = motionEvent.getPointerId(0);
                        this.A1 = true;
                        this.B1 = (int) motionEvent.getX();
                        this.C1 = (int) motionEvent.getY();
                        this.D1.clear();
                        return this.z1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.y1) {
                    int x10 = (int) (motionEvent.getX() - this.B1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.C1);
                    boolean z10 = this.z1;
                    ur0[] ur0VarArr = this.m0;
                    if (z10 && (((z9 = this.j1) && x10 > 0) || (!z9 && x10 < 0))) {
                        if (!g1(motionEvent, x10 < 0)) {
                            this.A1 = true;
                            this.z1 = false;
                            ur0VarArr[0].setTranslationX(0.0f);
                            ur0VarArr[1].setTranslationX(this.j1 ? ur0VarArr[0].getMeasuredWidth() : -ur0VarArr[0].getMeasuredWidth());
                            l1(0.0f, ur0VarArr[1].E);
                            Z0(getTabProgress());
                        }
                    }
                    if (!this.A1 || this.z1) {
                        if (this.z1) {
                            ur0VarArr[0].setTranslationX(x10);
                            if (this.j1) {
                                ur0VarArr[1].setTranslationX(ur0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                ur0VarArr[1].setTranslationX(x10 - ur0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / ur0VarArr[0].getMeasuredWidth();
                            if (I()) {
                                this.q0 = l0(abs2);
                                M1(abs2);
                                float k02 = k0(abs2);
                                this.r0 = k02;
                                this.t0.setVisibility((k02 == 0.0f || !I() || A0()) ? 4 : 0);
                            } else {
                                this.q0 = 0.0f;
                            }
                            I1(false);
                            l1(abs2, ur0VarArr[1].E);
                            Z0(getTabProgress());
                            Y0();
                        }
                    } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                        g1(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.y1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    v1(motionEvent);
                }
                return this.z1;
            }
        }
        return false;
    }

    public final float q0(int i7, boolean z9) {
        float width = getWidth();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i10 >= ur0VarArr.length) {
                break;
            }
            ur0 ur0Var = ur0VarArr[i10];
            if (ur0Var != null) {
                int i12 = ur0Var.E;
                if ((z9 && i7 == 8 && J0(i12)) || i12 == i7) {
                    i11++;
                    width = ur0VarArr[i10].getTranslationX();
                }
            }
            i10++;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        return width;
    }

    public void q1(boolean z9) {
        if (this.E1 == z9) {
            return;
        }
        this.E1 = z9;
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        if (y4Var != null) {
            if (z9) {
                O1();
                y4Var.C();
            } else {
                y4Var.s();
            }
            R(true, true);
            return;
        }
        AnimatorSet animatorSet = this.Q1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        LinearLayout linearLayout = this.D0;
        if (z9) {
            linearLayout.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        this.Q1.setDuration(180L);
        this.Q1.addListener(new t9(19, this, z9));
        this.Q1.start();
        if (z9) {
            O1();
        }
    }

    public final float r0(int i7, boolean z9) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i10 >= ur0VarArr.length) {
                return f10;
            }
            ur0 ur0Var = ur0VarArr[i10];
            if (ur0Var != null) {
                int i11 = ur0Var.E;
                if ((z9 && i7 == 8 && J0(i11)) || i11 == i7) {
                    f10 = (1.0f - Math.abs(ur0VarArr[i10].getTranslationX() / getWidth())) + f10;
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1(int i7, boolean z9) {
        int i10;
        ur0 g02;
        if (z9 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z9 && z0(i7) && m0(i7) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.l1);
        bundle.putLong("topic_id", this.F);
        os0[] os0VarArr = this.v1;
        if (z9 && (g02 = g0(0)) != null) {
            ArrayList arrayList = os0VarArr[0].e;
            int L0 = g02.x.L0();
            if (L0 >= 0) {
                zr0 zr0Var = null;
                if (arrayList != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((zr0) arrayList.get(i11)).b) {
                            zr0Var = (zr0) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (zr0Var == null) {
                        zr0Var = (zr0) jg.g.i(1, arrayList);
                    }
                }
                if (zr0Var != null) {
                    i10 = zr0Var.c;
                    if (i7 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i7 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.h8 h8Var = new org.telegram.ui.h8(os0VarArr[0].q, i10, bundle);
                    h8Var.M = new vy(this, 4);
                    this.x1.presentFragment(h8Var);
                }
            }
        }
        i10 = 0;
        if (i7 != 9) {
        }
        org.telegram.ui.h8 h8Var2 = new org.telegram.ui.h8(os0VarArr[0].q, i10, bundle);
        h8Var2.M = new vy(this, 4);
        this.x1.presentFragment(h8Var2);
    }

    public final int s0(int i7) {
        org.telegram.ui.ActionBar.g6 g6Var = this.H1;
        return g6Var != null ? g6Var.h(i7) : org.telegram.ui.ActionBar.l6.x0(null, i7, false);
    }

    public final void s1(int i7) {
        int w12 = w1(getClosestTab());
        zp0 zp0Var = this.b0;
        if (w12 != i7) {
            if (zp0Var != null) {
                zp0Var.b.d(i7, zp0Var.d.i(i7));
                return;
            }
            return;
        }
        zp0Var.setReorderingAlbums(true);
        ys0 x12 = x1(i7);
        ur0 g02 = g0(x12.a);
        if (g02 == null) {
            return;
        }
        dq0 dq0Var = g02.h;
        for (int i10 = 0; i10 < dq0Var.getChildCount(); i10++) {
            View childAt = dq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.o7) {
                ((org.telegram.ui.Cells.o7) childAt).l(true, true);
            }
        }
        xs0 xs0Var = x12.c;
        if (xs0Var != null && !xs0Var.y) {
            xs0Var.y = true;
        }
        I1(true);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.f1;
        boolean z9 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.f1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.e1 == 0) {
                this.e1 = -j3;
                int i7 = 0;
                while (true) {
                    os0[] os0VarArr = this.v1;
                    if (i7 >= os0VarArr.length) {
                        break;
                    }
                    if (os0VarArr[i7].b[1].size() == 0) {
                        os0 os0Var = os0VarArr[i7];
                        os0Var.j[1] = this.f1.migrated_from_max_id;
                        os0Var.i[1] = false;
                    }
                    i7++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f1;
        if (chatFull3 == null || z9 == chatFull3.stories_pinned_available) {
            return;
        }
        vq0 vq0Var = this.K0;
        if (vq0Var != null) {
            vq0Var.setInitialTabId(A0() ? 9 : 8);
        }
        P1(true);
        B1(false);
    }

    public void setCommonGroupsCount(int i7) {
        if (this.F == 0) {
            this.Z0[6] = i7;
        }
        P1(true);
        N();
    }

    public void setForwardRestrictedHint(fi.m3 m3Var) {
        this.G1 = m3Var;
    }

    public void setMergeDialogId(long j3) {
        this.e1 = j3;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i7 = 0;
        while (true) {
            iArr2 = this.Z0;
            if (i7 > 6 || iArr2[i7] >= 0) {
                break;
            } else {
                i7++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        P1(true);
        N();
        if (iArr2[0] >= 0) {
            M0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.j2 = runnable;
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.N1 = i10;
        int i13 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i13 >= ur0VarArr.length) {
                break;
            }
            ur0VarArr[i13].setTranslationY(this.N1);
            i13++;
        }
        if (this.R0 != null) {
            U();
        } else {
            rq0 rq0Var = this.T0;
            if (rq0Var != null) {
                rq0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.Q0 = i10;
        org.telegram.ui.Cells.t0 t0Var = this.M0;
        t0Var.setTranslationY((t0Var.getTag() == null ? -org.telegram.messenger.g0.L(48.0f) : 0) + this.Q0);
    }

    public void setPagesGlassEngine(oi.q qVar) {
        this.g2 = qVar;
        vp0 vp0Var = this.a0;
        if (vp0Var != null) {
            vp0Var.setGlassEngine(qVar);
        }
        for (ur0 ur0Var : this.m0) {
            if (ur0Var != null) {
                ur0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(ur0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i7) {
        if (this.a2 != i7) {
            this.a2 = i7;
            ur0[] ur0VarArr = this.m0;
            if (ur0VarArr != null) {
                for (ur0 ur0Var : ur0VarArr) {
                    if (ur0Var != null) {
                        dq0 dq0Var = ur0Var.h;
                        int paddingLeft = dq0Var.getPaddingLeft();
                        dq0 dq0Var2 = ur0Var.h;
                        int i10 = dq0Var2.e3;
                        int paddingRight = dq0Var2.getPaddingRight();
                        dq0 dq0Var3 = ur0Var.h;
                        int i02 = i0(I0());
                        dq0Var3.h3 = i02;
                        dq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i7) {
        if (this.f2 != i7) {
            this.f2 = i7;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z9) {
        if (this.d == z9) {
            return;
        }
        this.d = z9;
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i7 >= ur0VarArr.length) {
                return;
            }
            F1(ur0VarArr[i7], true);
            i7++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.g1;
        boolean z9 = userFull2 != null && userFull2.stories_pinned_available;
        this.g1 = userFull;
        P1(true);
        if (userFull == null || z9 == userFull.stories_pinned_available) {
            return;
        }
        k1(8);
    }

    public void setVisibleHeight(int i7) {
        this.P1 = i7;
        int i10 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i10 >= ur0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i7, org.telegram.messenger.g0.L(ur0VarArr[i10].E == 8 ? 280.0f : 120.0f)))) / 2.0f;
            ur0VarArr[i10].w.setTranslationY(f10);
            ur0VarArr[i10].s.setTranslationY(-f10);
            i10++;
        }
        tp0 tp0Var = this.W;
        if (tp0Var != null) {
            tp0Var.setVisibleHeight(i7);
        }
        vp0 vp0Var = this.a0;
        if (vp0Var != null) {
            vp0Var.setVisibleHeight(i7);
        }
    }

    public final boolean t0() {
        return this.x1.getConnectionsManager().getConnectionState() == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t1(boolean z9) {
        ur0[] ur0VarArr;
        ur0 ur0Var;
        if (this.q1) {
            return;
        }
        int i7 = 0;
        while (true) {
            ur0VarArr = this.m0;
            if (i7 >= ur0VarArr.length) {
                ur0Var = null;
                break;
            }
            int i10 = ur0VarArr[i7].E;
            if (i10 == 0 || z0(i10)) {
                break;
            } else {
                i7++;
            }
        }
        if (ur0Var != null) {
            int i11 = ur0Var.E;
            this.r1 = i11;
            boolean z02 = z0(i11);
            int[] iArr = this.o1;
            int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], z9);
            this.s1 = h02;
            if (h02 != iArr[z02 ? 1 : 0]) {
                if (this.m1 && z0(this.r1)) {
                    return;
                }
                ur0Var.n.setVisibility(0);
                if (z0(this.r1)) {
                    ur0Var.n.setAdapter(A1(this.r1));
                } else {
                    ur0Var.n.setAdapter(this.K);
                }
                tr0 tr0Var = ur0Var.n;
                tr0Var.setPadding(tr0Var.getPaddingLeft(), j0(this.r1), ur0Var.n.getPaddingRight(), i0(I0()));
                ur0Var.r.y1(h02);
                ur0Var.n.a0();
                ur0Var.r.O = new tq0(this, ur0Var, 0);
                org.telegram.messenger.g0.b4(ur0Var.h);
                this.q1 = true;
                if (this.r1 == 0) {
                    this.v1[0].g(true);
                }
                this.p1 = 0.0f;
                if (this.s < 0) {
                    j1();
                    return;
                }
                for (ur0 ur0Var2 : ur0VarArr) {
                    if (ur0Var2.E == this.r1) {
                        ur0Var2.r.h1(this.s, this.w - ur0Var2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.ui.ActionBar.f2 f2Var = this.x1;
        if (f2Var != null && f2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            f2Var.getOrCreateStoryViewer().getClass();
            di.q9 orCreateStoryViewer = f2Var.getOrCreateStoryViewer();
            Context context = f2Var.getContext();
            long dialogId = t2Var.getDialogId();
            di.i7 a10 = di.i7.a((qj0) t2Var.getParent());
            a10.s += ((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).r1) ? org.telegram.messenger.g0.L(68.0f) : 0;
            orCreateStoryViewer.J(context, dialogId, a10);
        }
    }

    public final boolean u0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        boolean z9 = false;
        for (int i7 = 1; i7 >= 0; i7--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.b1;
                if (i10 >= sparseArrayArr[i7].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i7].keyAt(i10)));
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
                if (num.intValue() > 0 && (ijVar = (org.telegram.messenger.ij) sparseArrayArr[i7].get(num.intValue())) != null && (message = ijVar.k) != null && message.noforwards) {
                    z9 = true;
                    break;
                }
            }
            if (z9) {
                return z9;
            }
        }
        return z9;
    }

    public final void u1() {
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = this.m0;
            if (i7 >= ur0VarArr.length) {
                return;
            }
            int childCount = ur0VarArr[i7].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ur0VarArr[i7].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                    if (i7 == 0) {
                        photoImage.t0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.t0 = false;
                        photoImage.Q0();
                    }
                }
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.I1.a(s0(org.telegram.ui.ActionBar.l6.d6));
            org.telegram.ui.ActionBar.y1 y1Var = this.F0;
            if (y1Var != null) {
                y1Var.a(s0(org.telegram.ui.ActionBar.l6.y8));
            }
            NumberTextView numberTextView = this.C0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.l6.y8));
            }
            D1();
            invalidate();
            for (ur0 ur0Var : this.m0) {
                if (ur0Var != null && ur0Var.L) {
                    ur0Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean v0(int i7) {
        if (i7 == 0) {
            return true;
        }
        if (((i7 == 8 || J0(i7)) && TextUtils.isEmpty(getStoriesHashtag())) || i7 == 9 || i7 == 11 || i7 == 13) {
            return true;
        }
        return i7 == 14 && this.a0 != null;
    }

    public final void v1(MotionEvent motionEvent) {
        float f10;
        float f11;
        float measuredWidth;
        VelocityTracker velocityTracker = this.D1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(1000, this.U0);
        int i7 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            f10 = this.D1.getXVelocity();
            f11 = this.D1.getYVelocity();
            if (!this.z1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                g1(motionEvent, f10 < 0.0f);
            }
        }
        if (this.z1) {
            ur0[] ur0VarArr = this.m0;
            float x10 = ur0VarArr[0].getX();
            this.h1 = new AnimatorSet();
            this.k1 = Math.abs(x10) < ((float) ur0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new d60(this, 18));
            boolean z9 = this.k1;
            Property property = View.TRANSLATION_X;
            if (z9) {
                measuredWidth = Math.abs(x10);
                if (this.j1) {
                    this.h1.playTogether(ObjectAnimator.ofFloat(ur0VarArr[0], (Property<ur0, Float>) property, 0.0f), ObjectAnimator.ofFloat(ur0VarArr[1], (Property<ur0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.h1.playTogether(ObjectAnimator.ofFloat(ur0VarArr[0], (Property<ur0, Float>) property, 0.0f), ObjectAnimator.ofFloat(ur0VarArr[1], (Property<ur0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = ur0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.j1) {
                    this.h1.playTogether(ObjectAnimator.ofFloat(ur0VarArr[0], (Property<ur0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(ur0VarArr[1], (Property<ur0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.h1.playTogether(ObjectAnimator.ofFloat(ur0VarArr[0], (Property<ur0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(ur0VarArr[1], (Property<ur0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.h1.setInterpolator(t2);
            int measuredWidth2 = getMeasuredWidth();
            float f12 = measuredWidth2 / 2;
            float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
            this.h1.setDuration(Math.max(org.telegram.messenger.qs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.h1.addListener(new yq0(this, i7));
            this.h1.start();
            this.i1 = true;
            this.z1 = false;
            Y0();
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

    public final void w0() {
        org.telegram.messenger.g0.r(this.O0);
        org.telegram.ui.Cells.t0 t0Var = this.M0;
        if (t0Var.getTag() == null) {
            return;
        }
        t0Var.setTag(null);
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.N0.playTogether(ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.Cells.t0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.Cells.t0, Float>) View.TRANSLATION_Y, (-org.telegram.messenger.g0.L(48.0f)) + this.Q0));
        this.N0.setInterpolator(xq.g);
        this.N0.addListener(new yq0(this, 0));
        this.N0.start();
    }

    public final int w1(int i7) {
        ys0 y12 = y1(i7);
        if (y12 == null) {
            return -1;
        }
        return y12.b;
    }

    public boolean x0() {
        return false;
    }

    public final ys0 x1(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.l2;
        ys0 ys0Var = (ys0) hashMap.get(valueOf);
        if (ys0Var != null) {
            return ys0Var;
        }
        ys0 ys0Var2 = new ys0(this, getContext(), i7);
        hashMap.put(Integer.valueOf(i7), ys0Var2);
        this.m2.put(Integer.valueOf(ys0Var2.a), Integer.valueOf(i7));
        return ys0Var2;
    }

    public boolean y0() {
        return !(this instanceof p20);
    }

    public final ys0 y1(int i7) {
        Integer num = (Integer) this.m2.get(Integer.valueOf(i7));
        if (num == null) {
            return null;
        }
        return (ys0) this.l2.get(num);
    }

    public final void z(View view) {
        ur0[] ur0VarArr = this.m0;
        addView(view, Math.max(indexOfChild(ur0VarArr[0]), indexOfChild(ur0VarArr[1])) + 1, c8.ha.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final ws0 z1(int i7) {
        ys0 y12;
        if (i7 == 8) {
            return this.e0;
        }
        if (i7 == 9) {
            return this.g0;
        }
        if (!J0(i7) || (y12 = y1(i7)) == null) {
            return null;
        }
        return y12.c;
    }

    public void P0(SparseArray sparseArray) {
    }

    public void X0(boolean z9) {
    }

    public int h1(int i7) {
        return i7;
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

    public void Q0() {
    }

    public void W0() {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
    }
}
