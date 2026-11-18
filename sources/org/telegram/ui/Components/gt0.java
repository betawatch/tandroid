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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class gt0 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs, org.telegram.ui.Cells.q2, wj0 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final bq0 u2 = new bq0(0);
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
    public final wz E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final int F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final org.telegram.ui.ActionBar.y1 G0;
    public final vr0 G1;
    public final org.telegram.ui.ActionBar.k H;
    public final ArrayList H0;
    public hi.m3 H1;
    public final org.telegram.ui.ActionBar.a5 I;
    public final ArrayList I0;
    public final org.telegram.ui.ActionBar.i6 I1;
    public final org.telegram.ui.ActionBar.h5 J;
    public final ArrayList J0;
    public final ui.c J1;
    public final nr0 K;
    public final ArrayList K0;
    public final xi.e K1;
    public final at0 L;
    public final dr0 L0;
    public boolean L1;
    public final us0 M;
    public final ar0 M0;
    public final h2.f M1;
    public final ts0 N;
    public final org.telegram.ui.Cells.v0 N0;
    public org.telegram.ui.b0 N1;
    public final ts0 O;
    public AnimatorSet O0;
    public int O1;
    public final ts0 P;
    public final fp0 P0;
    public boolean P1;
    public final ps0 Q;
    public final ArrayList Q0;
    public int Q1;
    public final wr0 R;
    public float R0;
    public AnimatorSet R1;
    public final ur0 S;
    public final cs S0;
    public final SparseArray S1;
    public final sr0 T;
    public final FrameLayout T0;
    public long T1;
    public final rs0 U;
    public final zq0 U0;
    public boolean U1;
    public final ss0 V;
    public final int V0;
    public int V1;
    public final or0 W;
    public final Paint W0;
    public final kr0 W1;
    public boolean X0;
    public fi.h6 X1;
    public boolean Y0;
    public float Y1;
    public ch.p0 Z0;
    public boolean Z1;
    public boolean a;
    public final dq0 a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final eq0 b0;
    public int b1;
    public int b2;
    public boolean c;
    public final hq0 c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final tr0 d0;
    public int d1;
    public int d2;
    public int e;
    public final v4.z e0;
    public boolean e1;
    public int e2;
    public int f;
    public final qr0 f0;
    public long f1;
    public int f2;
    public final dt0 g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final cq0 h0;
    public TLRPC.UserFull h1;
    public ri.q h2;
    public final dt0 i0;
    public AnimatorSet i1;
    public float i2;
    public final ds0 j0;
    public boolean j1;
    public final RectF j2;
    public final ds0 k0;
    public boolean k1;
    public Runnable k2;
    public final ds0 l0;
    public boolean l1;
    public int l2;
    public final zr0 m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final bs0[] n0;
    public boolean n1;
    public final HashMap n2;
    public final org.telegram.ui.ActionBar.r0 o0;
    public boolean o1;
    public int o2;
    public final org.telegram.ui.ActionBar.r0 p0;
    public final int[] p1;
    public int p2;
    public final org.telegram.ui.ActionBar.r0 q0;
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
    public final nq0 u1;
    public final ph0 v0;
    public float v1;
    public int w;
    public final org.telegram.ui.ActionBar.r0 w0;
    public final vs0[] w1;
    public int x;
    public final org.telegram.ui.ActionBar.r0 x0;
    public final ys0 x1;
    public final Rect y;
    public final org.telegram.ui.ActionBar.r0 y0;
    public final org.telegram.ui.ActionBar.h2 y1;
    public final org.telegram.ui.ActionBar.r0 z0;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0239, code lost:
    
        r1.b1 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0ab2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0bb9 A[EDGE_INSN: B:171:0x0bb9->B:172:0x0bb9 BREAK  A[LOOP:3: B:139:0x0863->B:168:0x0ab2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0bbd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0c2a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07a0  */
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
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gt0(Context context, long j3, ys0 ys0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, org.telegram.ui.ActionBar.h2 h2Var, vr0 vr0Var, int i12, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context);
        int i13;
        TLRPC.ProfileTab profileTab;
        long j10;
        int i14;
        vs0[] vs0VarArr;
        int i15;
        ar0 ar0Var;
        int i16;
        int i17;
        rs0 rs0Var;
        float f10;
        org.telegram.ui.ActionBar.i6 i6Var2;
        float f11;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.i6 i6Var3;
        dh.c cVar2;
        boolean z10;
        dh.c cVar3;
        int i18;
        int i19;
        int i20;
        bs0[] bs0VarArr;
        View view;
        ?? r92;
        gt0 gt0Var;
        hq0 hq0Var;
        boolean z11;
        as0 as0Var;
        int i21;
        int i22;
        jq0 jq0Var;
        as0 as0Var2;
        as0 as0Var3;
        as0 as0Var4;
        as0 as0Var5;
        as0 as0Var6;
        as0 as0Var7;
        as0 as0Var8;
        as0 as0Var9;
        as0 as0Var10;
        as0 as0Var11;
        as0 as0Var12;
        as0 as0Var13;
        as0 as0Var14;
        as0 as0Var15;
        as0 as0Var16;
        kv0 kv0Var;
        kv0 kv0Var2;
        kv0 kv0Var3;
        kv0 kv0Var4;
        kv0 kv0Var5;
        kv0 kv0Var6;
        kv0 kv0Var7;
        kv0 kv0Var8;
        kv0 kv0Var9;
        kv0 kv0Var10;
        as0 as0Var17;
        kv0 kv0Var11;
        as0 as0Var18;
        as0 as0Var19;
        bs0 bs0Var;
        jq0 jq0Var2;
        as0 as0Var20;
        org.telegram.ui.ActionBar.r0 a10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        gt0 gt0Var2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        gt0Var2.y = new Rect();
        gt0Var2.n0 = new bs0[2];
        gt0Var2.H0 = new ArrayList(10);
        gt0Var2.I0 = new ArrayList(10);
        gt0Var2.J0 = new ArrayList(10);
        gt0Var2.K0 = new ArrayList(10);
        gt0Var2.P0 = new fp0(gt0Var2, 0);
        gt0Var2.Q0 = new ArrayList();
        gt0Var2.W0 = new Paint();
        gt0Var2.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        gt0Var2.n1 = false;
        gt0Var2.o1 = false;
        gt0Var2.p1 = new int[]{3, 3};
        gt0Var2.u1 = new nq0(gt0Var2);
        gt0Var2.v1 = -5.0f;
        gt0Var2.w1 = new vs0[9];
        gt0Var2.M1 = new h2.f(1);
        gt0Var2.S1 = new SparseArray();
        gt0Var2.V1 = -1;
        gt0Var2.W1 = new kr0(gt0Var2);
        gt0Var2.Y1 = 0.0f;
        gt0Var2.g2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        gt0Var2.j2 = new RectF();
        gt0Var2.l2 = -1;
        gt0Var2.m2 = new HashMap();
        gt0Var2.n2 = new HashMap();
        gt0Var2.q2 = true;
        ui.c cVar4 = new ui.c();
        gt0Var2.J1 = cVar4;
        cVar4.a(gt0Var2.s0(org.telegram.ui.ActionBar.n6.d6));
        dh.c cVar5 = cVar == null ? new dh.c(cVar4) : cVar;
        gt0Var2.F = i12;
        gt0Var2.I1 = i6Var;
        wz wzVar = new wz(context);
        gt0Var2.E = wzVar;
        wzVar.setIsSingleCell(true);
        TLRPC.User c22 = h2Var.getMessagesController().c2(Long.valueOf(j3));
        gt0Var2.x1 = ys0Var;
        gt0Var2.G1 = vr0Var;
        int[] iArr = ys0Var.c;
        long j11 = ys0Var.s;
        gt0Var2.G = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i7 : 0, iArr[7], iArr[8]};
        gt0Var2.a1 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i13 = 1;
                profileTab = null;
                if (i10 != 14 || i10 == 10 || i10 == 11 || i10 == 6) {
                    gt0Var2.b1 = i10;
                } else if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    gt0Var2.b1 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    gt0Var2.b1 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || gt0Var2.I0()))) {
                    gt0Var2.b1 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[i13];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            gt0Var2.b1 = i13;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[5]) == i23 || i27 > 0)) {
                        gt0Var2.b1 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        gt0Var2.b1 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        gt0Var2.b1 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        gt0Var2.b1 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || gt0Var2.I0())) {
                        gt0Var2.b1 = gt0Var2.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i10 == -1 || j11 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = gt0Var2.a1;
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
                            gt0Var2.b1 = i10;
                        }
                    } else {
                        gt0Var2.b1 = 14;
                    }
                } else {
                    gt0Var2.b1 = 14;
                }
                gt0Var2.Z0(i10);
                gt0Var2.g1 = chatFull2;
                gt0Var2.h1 = userFull;
                if (chatFull2 != null) {
                    gt0Var2.f1 = -chatFull2.migrated_from_chat_id;
                }
                j10 = j3;
                gt0Var2.m1 = j10;
                i14 = 0;
                while (true) {
                    vs0VarArr = gt0Var2.w1;
                    if (i14 < vs0VarArr.length) {
                        break;
                    }
                    vs0VarArr[i14] = new vs0();
                    gt0Var2.w1[i14].j[0] = org.telegram.messenger.n5.C(gt0Var2.m1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    gt0Var2.w1[i14].j[1] = Integer.MAX_VALUE;
                    gt0Var2.a0(i14);
                    if (gt0Var2.f1 != 0 && gt0Var2.g1 != null && gt0Var2.w1[i14].b[1].size() == 0) {
                        vs0 vs0Var = gt0Var2.w1[i14];
                        vs0Var.j[1] = gt0Var2.g1.migrated_from_max_id;
                        vs0Var.i[1] = false;
                    }
                    i14++;
                }
                gt0Var2.y1 = h2Var;
                gt0Var2.H = h2Var.getActionBar();
                gt0Var2.I = h2Var.getSimpleActionBar();
                gt0Var2.p1[0] = gt0Var2.e1() > 0 ? org.telegram.messenger.bz.t1 : gt0Var2.e1();
                gt0Var2.p1[1] = gt0Var2.e1() > 0 ? org.telegram.messenger.bz.u1 : gt0Var2.e1();
                org.telegram.messenger.ks notificationCenter = h2Var.getNotificationCenter();
                notificationCenter.getClass();
                xi.e eVar = new xi.e(notificationCenter, gt0Var2);
                eVar.c(org.telegram.messenger.ks.V);
                eVar.c(org.telegram.messenger.ks.w);
                eVar.c(1);
                eVar.c(org.telegram.messenger.ks.K);
                eVar.c(org.telegram.messenger.ks.f2);
                eVar.c(org.telegram.messenger.ks.g2);
                eVar.c(org.telegram.messenger.ks.h2);
                eVar.c(org.telegram.messenger.ks.A5);
                eVar.c(org.telegram.messenger.ks.y5);
                eVar.c(org.telegram.messenger.ks.h3);
                eVar.c(org.telegram.messenger.ks.i3);
                eVar.c(org.telegram.messenger.ks.s);
                eVar.c(org.telegram.messenger.ks.I3);
                eVar.c(org.telegram.messenger.ks.Z3);
                eVar.c(org.telegram.messenger.ks.f1);
                gt0Var2.K1 = eVar;
                for (i15 = 0; i15 < 10; i15++) {
                    if (i10 == 4) {
                        yq0 yq0Var = new yq0(gt0Var2, context);
                        yq0Var.U.c();
                        gt0Var2.J0.add(yq0Var);
                    }
                }
                gt0Var2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                gt0Var2.Y0 = false;
                gt0Var2.Z0 = null;
                ar0Var = gt0Var2.M0;
                if (ar0Var != null) {
                    ar0Var.g(false);
                }
                gt0Var2.X0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                gt0Var2.B0 = drawable;
                org.telegram.ui.ActionBar.u6.x(gt0Var2, drawable, org.telegram.ui.ActionBar.n6.b7, i6Var, PorterDuff.Mode.MULTIPLY);
                dr0 dr0Var = gt0Var2.L0;
                int currentTabId = dr0Var == null ? dr0Var.getCurrentTabId() : i10;
                dr0 dr0Var2 = new dr0(gt0Var2, context, gt0Var2.I1);
                i16 = gt0Var2.b1;
                if (i16 != -1) {
                    dr0Var2.setInitialTabId(i16);
                    gt0Var2.b1 = -1;
                }
                dr0Var2.c0 = 320L;
                int i32 = org.telegram.ui.ActionBar.n6.a;
                int i33 = org.telegram.ui.ActionBar.n6.wi;
                int i34 = org.telegram.ui.ActionBar.n6.vi;
                int i35 = org.telegram.ui.ActionBar.n6.a;
                dr0Var2.M = i33;
                dr0Var2.N = i34;
                dr0Var2.updateColors();
                dr0Var2.setUseMinimalWidth(true);
                dr0Var2.setDelegate(new fr0(gt0Var2));
                gt0Var2.L0 = dr0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    gt0Var2.c1[i17].clear();
                }
                gt0Var2.d1 = 0;
                gt0Var2.Q0.clear();
                rs0Var = gt0Var2.U;
                if (rs0Var != null) {
                    rs0Var.x.clear();
                }
                if (gt0Var2 instanceof z20) {
                    org.telegram.ui.ActionBar.a5 a5Var = gt0Var2.I;
                    if (a5Var != null) {
                        org.telegram.ui.ActionBar.g5 t6 = a5Var.t();
                        a10 = t6.b(0, R.drawable.outline_header_search);
                        if (!gt0Var2.A0() && !gt0Var2.G0()) {
                            org.telegram.ui.ActionBar.h5 b10 = t6.b(0, R.drawable.ic_ab_other);
                            gt0Var2.J = b10;
                            b10.setContentDescription(org.telegram.messenger.gd.L0(2131754839));
                            b10.Z(false, false);
                        }
                        f10 = 10.0f;
                    } else {
                        org.telegram.ui.ActionBar.z t10 = gt0Var2.H.t();
                        t10.addOnLayoutChangeListener(new er0(gt0Var2));
                        f10 = 10.0f;
                        if (gt0Var2.m1 == gt0Var2.y1.getUserConfig().e() && (gt0Var2.y1 instanceof i90) && gt0Var2.I()) {
                            gt0Var2.p0 = t10.a(11, R.drawable.outline_header_search);
                        }
                        a10 = t10.a(0, 0);
                    }
                    org.telegram.ui.ActionBar.r0 K = a10.N().K(new lr0(gt0Var2));
                    gt0Var2.q0 = K;
                    ar0 ar0Var2 = gt0Var2.M0;
                    K.setSearchFieldHint(org.telegram.messenger.gd.L0((ar0Var2 != null && ar0Var2.a() && gt0Var2.getSelectedTab() == 11) ? 2131745673 : 2131745641));
                    K.setContentDescription(org.telegram.messenger.gd.M0(2131745641, "Search"));
                    if (gt0Var2.I != null) {
                        ((org.telegram.ui.ActionBar.h5) K).Z(false, false);
                    } else {
                        K.setTranslationY(org.telegram.messenger.g0.L(f10));
                        gt0Var2.setSearchItemVisibility(gt0Var2.I0() ? 8 : 4);
                    }
                } else {
                    f10 = 10.0f;
                }
                ImageView imageView = new ImageView(context);
                gt0Var2.u0 = imageView;
                imageView.setContentDescription(org.telegram.messenger.gd.M0(2131754839, "AccDescrMoreOptions"));
                imageView.setTranslationY(org.telegram.messenger.g0.L(f10));
                imageView.setVisibility(4);
                if (gt0Var2.I == null || gt0Var2.A0() || gt0Var2.G0()) {
                    i6Var2 = i6Var;
                    f11 = 2.0f;
                } else {
                    gt0Var2.H.addView(imageView, c8.ma.e(48, 56, 85));
                    ph0 ph0Var = new ph0(context);
                    gt0Var2.v0 = ph0Var;
                    ph0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    ph0Var.e(R.raw.options_to_search, 24, 24);
                    f11 = 2.0f;
                    ph0Var.getAnimatedDrawable().G *= 2.0f;
                    ph0Var.getAnimatedDrawable().h = true;
                    i6Var2 = i6Var;
                    org.telegram.ui.ActionBar.u6.s(ph0Var, org.telegram.ui.ActionBar.n6.y8, i6Var2, PorterDuff.Mode.SRC_IN);
                    ph0Var.setVisibility(8);
                    gt0Var2.H.addView(ph0Var, c8.ma.e(48, 56, 85));
                }
                imageView.setOnClickListener(new gp0(gt0Var2, 0));
                h5Var = gt0Var2.J;
                if (h5Var != null) {
                    h5Var.setOnClickListener(new gp0(gt0Var2, 1));
                }
                r0Var = gt0Var2.q0;
                if (r0Var != null && gt0Var2.I == null) {
                    EditTextBoldCursor searchField = r0Var.getSearchField();
                    int i36 = org.telegram.ui.ActionBar.n6.G6;
                    org.telegram.ui.ActionBar.u6.U(searchField, i36, i6Var2);
                    org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Jj, i6Var2);
                    org.telegram.ui.ActionBar.u6.v(searchField, i36, i6Var2);
                }
                gt0Var2.A0 = 0;
                LinearLayout linearLayout = new LinearLayout(context);
                gt0Var2.E0 = linearLayout;
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                linearLayout.setVisibility(4);
                ImageView imageView2 = new ImageView(context);
                gt0Var2.F0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(true);
                gt0Var2.G0 = y1Var;
                imageView2.setImageDrawable(y1Var);
                int i37 = org.telegram.ui.ActionBar.n6.y8;
                y1Var.a(gt0Var2.s0(i37));
                int i38 = org.telegram.ui.ActionBar.n6.z8;
                org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.g0(gt0Var2.s0(i38), 1), null, org.telegram.ui.ActionBar.u6.M(i38), i6Var2);
                imageView2.setContentDescription(org.telegram.messenger.gd.M0(2131752030, "Close"));
                linearLayout.addView(imageView2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
                gt0Var2.Q0.add(imageView2);
                imageView2.setOnClickListener(new gp0(gt0Var2, 2));
                NumberTextView numberTextView = new NumberTextView(context);
                gt0Var2.D0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(org.telegram.messenger.g0.o());
                numberTextView.setTextColor(gt0Var2.s0(i37));
                linearLayout.addView(numberTextView, c8.ma.m(1.0f, 0, -1, 18, 0, 0));
                gt0Var2.Q0.add(numberTextView);
                if (!org.telegram.messenger.n5.C(gt0Var2.m1)) {
                    if (!gt0Var2.I0()) {
                        gt0Var2.x0 = gt0Var2.W(context, org.telegram.messenger.ks.n1, R.drawable.msg_message, org.telegram.messenger.gd.L0(2131754877));
                        gt0Var2.w0 = gt0Var2.W(context, 100, R.drawable.msg_forward, org.telegram.messenger.gd.L0(2131750571));
                    }
                    org.telegram.ui.ActionBar.r0 W = gt0Var2.W(context, org.telegram.messenger.ks.o1, R.drawable.msg_pin, org.telegram.messenger.gd.L0(2131747052));
                    gt0Var2.y0 = W;
                    W.setVisibility(8);
                    org.telegram.ui.ActionBar.r0 W2 = gt0Var2.W(context, org.telegram.messenger.ks.p1, R.drawable.msg_unpin, org.telegram.messenger.gd.L0(2131743607));
                    gt0Var2.z0 = W2;
                    W2.setVisibility(8);
                    gt0Var2.G1();
                }
                gt0Var2.o0 = gt0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751587, "Delete"));
                gt0Var2.K = new nr0(gt0Var2, context);
                gt0Var2.L = new at0(gt0Var2, context);
                gt0Var2.N = new ts0(gt0Var2, context, 1);
                gt0Var2.O = new ts0(gt0Var2, context, 2);
                gt0Var2.P = new ts0(gt0Var2, context, 4);
                gt0Var2.Q = new ps0(gt0Var2, context, gt0Var2.y1.getCurrentAccount(), gt0Var2.y1.getResourceProvider());
                gt0Var2.R = new wr0(gt0Var2, context);
                gt0Var2.j0 = new ds0(gt0Var2, context, 1);
                gt0Var2.k0 = new ds0(gt0Var2, context, 4);
                gt0Var2.l0 = new ds0(gt0Var2, context, 3);
                gt0Var2.m0 = new zr0(gt0Var2, context);
                gt0Var2.S = new ur0(gt0Var2, context);
                gt0Var2.T = new sr0(gt0Var2, context);
                gt0Var2.U = new rs0(gt0Var2, context);
                gt0Var2.V = new ss0(gt0Var2, context);
                if (!gt0Var2.I0() && !gt0Var2.x0() && gt0Var2.G == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", gt0Var2.y1.getUserConfig().e());
                    bundle.putInt("chatMode", 3);
                    or0 or0Var = new or0(gt0Var2, context, gt0Var2.y1.getParentLayout(), bundle);
                    gt0Var2.W = or0Var;
                    long j12 = gt0Var2.m1;
                    org.telegram.ui.cn cnVar = or0Var.a;
                    cnVar.s4 = j12;
                    cnVar.nb = true;
                    or0Var.setClipToOutline(true);
                    or0Var.setOutlineProvider(new pr0());
                }
                tr0 tr0Var = new tr0(gt0Var2, context);
                gt0Var2.d0 = tr0Var;
                if (gt0Var2.G == 0) {
                    tr0Var.e = arrayList;
                    tr0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                gt0Var2.f0 = new qr0(gt0Var2, context);
                gt0Var2.e0 = new v4.z(new rr0(gt0Var2));
                gt0Var2.g0 = new dt0(gt0Var2, context, false);
                gt0Var2.h0 = new cq0(gt0Var2, context);
                gt0Var2.i0 = new dt0(gt0Var2, context, true);
                gt0Var2.M = new us0(gt0Var2, context);
                if (gt0Var2.B0()) {
                    if (gt0Var2.y1 instanceof ProfileActivity) {
                        TextView textView = new TextView(context);
                        gt0Var2.t0 = textView;
                        textView.setText(org.telegram.messenger.gd.L0(2131745751).toUpperCase());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        int i39 = org.telegram.ui.ActionBar.n6.Fi;
                        org.telegram.ui.ActionBar.u6.U(textView, i39, i6Var2);
                        textView.setTextSize(1, 15.0f);
                        textView.setGravity(17);
                        org.telegram.ui.ActionBar.u6.Q(textView, org.telegram.ui.ActionBar.n6.g0(org.telegram.ui.ActionBar.n6.r1(0.15f, gt0Var2.s0(i39)), 3), null, org.telegram.ui.ActionBar.u6.K(0.15f, i39), i6Var2);
                        textView.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
                        ViewGroup viewGroup = gt0Var2.I;
                        (viewGroup == null ? gt0Var2.H : viewGroup).addView(textView, c8.ma.e(-2, 56, 85));
                        textView.setOnClickListener(new gp0(gt0Var2, 3));
                        textView.setVisibility(8);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(0.4f);
                        textView.setScaleY(0.4f);
                        org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                        org.telegram.ui.ActionBar.i6 i6Var4 = i6Var2;
                        dh.c cVar6 = cVar5;
                        i6Var3 = i6Var4;
                        gt0Var2.b0 = new eq0(gt0Var2, h2Var2, context, h2Var2.getCurrentAccount(), ((ProfileActivity) gt0Var2.y1).a(), i6Var4, cVar6);
                        gt0Var2.H1();
                        gt0Var2.c0 = new hq0(gt0Var2, context, gt0Var2.getStoriesController().B(gt0Var2.m1, true), new gq0(gt0Var2, context, h2Var, i6Var3));
                        cVar2 = cVar6;
                    } else {
                        i6Var3 = i6Var2;
                        cVar2 = cVar5;
                    }
                    z10 = false;
                    cVar3 = cVar2;
                } else {
                    gt0Var2.a0 = new dq0(gt0Var2, context, gt0Var2.y1, gt0Var2.m1);
                    i6Var3 = i6Var2;
                    cVar3 = cVar5;
                    z10 = false;
                }
                gt0Var2.setWillNotDraw(z10);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    bs0VarArr = gt0Var2.n0;
                    if (i20 < bs0VarArr.length) {
                        break;
                    }
                    if (i20 == 0 && (bs0Var = bs0VarArr[i20]) != null && (jq0Var2 = bs0Var.x) != null) {
                        i19 = jq0Var2.L0();
                        if (i19 != gt0Var2.n0[i20].x.B() - 1) {
                            as0Var20 = gt0Var2.n0[i20].h;
                            kj0 kj0Var = (kj0) as0Var20.K(i19);
                            if (kj0Var != null) {
                                i18 = kj0Var.a.getTop();
                            } else {
                                i19 = -1;
                            }
                        } else {
                            i21 = i18;
                            i22 = -1;
                            iq0 iq0Var = new iq0(gt0Var2, context);
                            gt0Var2.addView(iq0Var, c8.ma.d(-1, -1.0f, 51, 0.0f, gt0Var2.O0(), 0.0f, 0.0f));
                            if (i20 == 1) {
                                iq0Var.setTranslationX(org.telegram.messenger.g0.q.x);
                            }
                            gt0Var2.n0[i20] = iq0Var;
                            iq0Var.O = i6Var3;
                            bs0 bs0Var2 = gt0Var2.n0[i20];
                            jq0Var = new jq0(gt0Var2, iq0Var);
                            bs0Var2.x = jq0Var;
                            jq0Var.z1(new kq0(gt0Var2, iq0Var));
                            gt0Var2.n0[i20].d = new v4.k();
                            gt0Var2.n0[i20].d.n(280L);
                            gt0Var2.n0[i20].d.o(lr.h);
                            bs0 bs0Var3 = gt0Var2.n0[i20];
                            bs0Var3.d.m = false;
                            bs0Var3.h = new lq0(gt0Var2, context, i6Var3, iq0Var, jq0Var);
                            as0Var2 = gt0Var2.n0[i20].h;
                            as0Var2.setFastScrollEnabled(1);
                            as0Var3 = gt0Var2.n0[i20].h;
                            as0Var3.setScrollingTouchSlop(1);
                            as0Var4 = gt0Var2.n0[i20].h;
                            as0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                            as0Var5 = gt0Var2.n0[i20].h;
                            as0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                            as0Var6 = gt0Var2.n0[i20].h;
                            as0Var6.setItemAnimator(null);
                            as0Var7 = gt0Var2.n0[i20].h;
                            as0Var7.setClipToPadding(false);
                            as0Var8 = gt0Var2.n0[i20].h;
                            as0Var8.setSectionsType(2);
                            as0Var9 = gt0Var2.n0[i20].h;
                            as0Var9.setLayoutManager(jq0Var);
                            bs0 bs0Var4 = gt0Var2.n0[i20];
                            as0Var10 = bs0Var4.h;
                            bs0Var4.addView(as0Var10, c8.ma.c(-1.0f, -1));
                            gt0Var2.n0[i20].n = new as0(context, null);
                            bs0 bs0Var5 = gt0Var2.n0[i20];
                            as0 as0Var21 = bs0Var5.n;
                            mq0 mq0Var = new mq0(gt0Var2);
                            bs0Var5.r = mq0Var;
                            as0Var21.setLayoutManager(mq0Var);
                            bs0 bs0Var6 = gt0Var2.n0[i20];
                            bs0Var6.addView(bs0Var6.n, c8.ma.c(-1.0f, -1));
                            gt0Var2.n0[i20].n.setVisibility(8);
                            gt0Var2.n0[i20].n.i(new oq0(iq0Var));
                            as0Var11 = gt0Var2.n0[i20].h;
                            as0Var11.i(new pq0(gt0Var2, iq0Var));
                            as0Var12 = gt0Var2.n0[i20].h;
                            as0Var12.setOnItemClickListener(new di.t1(gt0Var2, iq0Var, context, j10, i6Var, 3));
                            as0Var13 = gt0Var2.n0[i20].h;
                            as0Var13.setOnScrollListener(new sq0(gt0Var2, iq0Var, jq0Var));
                            as0Var14 = gt0Var2.n0[i20].h;
                            as0Var14.setOnItemLongClickListener(new tq0(gt0Var2, iq0Var));
                            if (i20 == 0 && i22 != -1) {
                                jq0Var.h1(i22, i21);
                            }
                            as0Var15 = gt0Var2.n0[i20].h;
                            gt0Var2.n0[i20].y = new uq0(context, as0Var15);
                            gt0Var2.n0[i20].y.setVisibility(8);
                            as0Var16 = gt0Var2.n0[i20].h;
                            uq0 uq0Var = gt0Var2.n0[i20].y;
                            FrameLayout.LayoutParams c10 = c8.ma.c(-1.0f, -1);
                            if (as0Var16.c1 == null) {
                                as0Var16.c1 = new bi.a3(23, as0Var16.getContext(), as0Var16);
                            }
                            as0Var16.c1.addView(uq0Var, c10);
                            gt0Var2.n0[i20].s = new vq0(gt0Var2, context, iq0Var);
                            gt0Var2.n0[i20].s.f();
                            gt0Var2.n0[i20].s.setClipToOutline(true);
                            gt0Var2.n0[i20].s.setOutlineProvider(new wq0());
                            if (i20 == 0) {
                                gt0Var2.n0[i20].setVisibility(8);
                            }
                            bs0 bs0Var7 = gt0Var2.n0[i20];
                            bs0Var7.w = new xq0(gt0Var2, context, bs0Var7.s);
                            kv0Var = gt0Var2.n0[i20].w;
                            kv0Var.d(8, false);
                            kv0Var2 = gt0Var2.n0[i20].w;
                            kv0Var2.setAnimateLayoutChange(true);
                            bs0 bs0Var8 = gt0Var2.n0[i20];
                            kv0Var3 = bs0Var8.w;
                            bs0Var8.addView(kv0Var3, c8.ma.c(-1.0f, -1));
                            kv0Var4 = gt0Var2.n0[i20].w;
                            kv0Var4.setOnTouchListener(new gi.a(24));
                            kv0Var5 = gt0Var2.n0[i20].w;
                            kv0Var5.e(true, false);
                            kv0Var6 = gt0Var2.n0[i20].w;
                            kv0Var6.d.setText(org.telegram.messenger.gd.M0(2131747975, "NoResult"));
                            kv0Var7 = gt0Var2.n0[i20].w;
                            kv0Var7.f.setVisibility(8);
                            kv0Var8 = gt0Var2.n0[i20].w;
                            kv0Var8.e.setText(org.telegram.messenger.gd.L0(2131745612));
                            kv0Var9 = gt0Var2.n0[i20].w;
                            kv0Var9.f.setVisibility(8);
                            kv0Var10 = gt0Var2.n0[i20].w;
                            kv0Var10.addView(gt0Var2.n0[i20].s, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                            as0Var17 = gt0Var2.n0[i20].h;
                            kv0Var11 = gt0Var2.n0[i20].w;
                            as0Var17.setEmptyView(kv0Var11);
                            as0Var18 = gt0Var2.n0[i20].h;
                            as0Var18.o1(0, true);
                            bs0[] bs0VarArr2 = gt0Var2.n0;
                            bs0 bs0Var9 = bs0VarArr2[i20];
                            as0Var19 = bs0VarArr2[i20].h;
                            bs0Var9.E = new org.telegram.ui.ActionBar.l5(as0Var19, gt0Var2.n0[i20].x);
                            i20++;
                            j10 = j3;
                            i6Var3 = i6Var;
                            i18 = i21;
                            i19 = i22;
                        }
                    }
                    i21 = i18;
                    i22 = i19;
                    iq0 iq0Var2 = new iq0(gt0Var2, context);
                    gt0Var2.addView(iq0Var2, c8.ma.d(-1, -1.0f, 51, 0.0f, gt0Var2.O0(), 0.0f, 0.0f));
                    if (i20 == 1) {
                    }
                    gt0Var2.n0[i20] = iq0Var2;
                    iq0Var2.O = i6Var3;
                    bs0 bs0Var22 = gt0Var2.n0[i20];
                    jq0Var = new jq0(gt0Var2, iq0Var2);
                    bs0Var22.x = jq0Var;
                    jq0Var.z1(new kq0(gt0Var2, iq0Var2));
                    gt0Var2.n0[i20].d = new v4.k();
                    gt0Var2.n0[i20].d.n(280L);
                    gt0Var2.n0[i20].d.o(lr.h);
                    bs0 bs0Var32 = gt0Var2.n0[i20];
                    bs0Var32.d.m = false;
                    bs0Var32.h = new lq0(gt0Var2, context, i6Var3, iq0Var2, jq0Var);
                    as0Var2 = gt0Var2.n0[i20].h;
                    as0Var2.setFastScrollEnabled(1);
                    as0Var3 = gt0Var2.n0[i20].h;
                    as0Var3.setScrollingTouchSlop(1);
                    as0Var4 = gt0Var2.n0[i20].h;
                    as0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                    as0Var5 = gt0Var2.n0[i20].h;
                    as0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                    as0Var6 = gt0Var2.n0[i20].h;
                    as0Var6.setItemAnimator(null);
                    as0Var7 = gt0Var2.n0[i20].h;
                    as0Var7.setClipToPadding(false);
                    as0Var8 = gt0Var2.n0[i20].h;
                    as0Var8.setSectionsType(2);
                    as0Var9 = gt0Var2.n0[i20].h;
                    as0Var9.setLayoutManager(jq0Var);
                    bs0 bs0Var42 = gt0Var2.n0[i20];
                    as0Var10 = bs0Var42.h;
                    bs0Var42.addView(as0Var10, c8.ma.c(-1.0f, -1));
                    gt0Var2.n0[i20].n = new as0(context, null);
                    bs0 bs0Var52 = gt0Var2.n0[i20];
                    as0 as0Var212 = bs0Var52.n;
                    mq0 mq0Var2 = new mq0(gt0Var2);
                    bs0Var52.r = mq0Var2;
                    as0Var212.setLayoutManager(mq0Var2);
                    bs0 bs0Var62 = gt0Var2.n0[i20];
                    bs0Var62.addView(bs0Var62.n, c8.ma.c(-1.0f, -1));
                    gt0Var2.n0[i20].n.setVisibility(8);
                    gt0Var2.n0[i20].n.i(new oq0(iq0Var2));
                    as0Var11 = gt0Var2.n0[i20].h;
                    as0Var11.i(new pq0(gt0Var2, iq0Var2));
                    as0Var12 = gt0Var2.n0[i20].h;
                    as0Var12.setOnItemClickListener(new di.t1(gt0Var2, iq0Var2, context, j10, i6Var, 3));
                    as0Var13 = gt0Var2.n0[i20].h;
                    as0Var13.setOnScrollListener(new sq0(gt0Var2, iq0Var2, jq0Var));
                    as0Var14 = gt0Var2.n0[i20].h;
                    as0Var14.setOnItemLongClickListener(new tq0(gt0Var2, iq0Var2));
                    if (i20 == 0) {
                        jq0Var.h1(i22, i21);
                    }
                    as0Var15 = gt0Var2.n0[i20].h;
                    gt0Var2.n0[i20].y = new uq0(context, as0Var15);
                    gt0Var2.n0[i20].y.setVisibility(8);
                    as0Var16 = gt0Var2.n0[i20].h;
                    uq0 uq0Var2 = gt0Var2.n0[i20].y;
                    FrameLayout.LayoutParams c102 = c8.ma.c(-1.0f, -1);
                    if (as0Var16.c1 == null) {
                    }
                    as0Var16.c1.addView(uq0Var2, c102);
                    gt0Var2.n0[i20].s = new vq0(gt0Var2, context, iq0Var2);
                    gt0Var2.n0[i20].s.f();
                    gt0Var2.n0[i20].s.setClipToOutline(true);
                    gt0Var2.n0[i20].s.setOutlineProvider(new wq0());
                    if (i20 == 0) {
                    }
                    bs0 bs0Var72 = gt0Var2.n0[i20];
                    bs0Var72.w = new xq0(gt0Var2, context, bs0Var72.s);
                    kv0Var = gt0Var2.n0[i20].w;
                    kv0Var.d(8, false);
                    kv0Var2 = gt0Var2.n0[i20].w;
                    kv0Var2.setAnimateLayoutChange(true);
                    bs0 bs0Var82 = gt0Var2.n0[i20];
                    kv0Var3 = bs0Var82.w;
                    bs0Var82.addView(kv0Var3, c8.ma.c(-1.0f, -1));
                    kv0Var4 = gt0Var2.n0[i20].w;
                    kv0Var4.setOnTouchListener(new gi.a(24));
                    kv0Var5 = gt0Var2.n0[i20].w;
                    kv0Var5.e(true, false);
                    kv0Var6 = gt0Var2.n0[i20].w;
                    kv0Var6.d.setText(org.telegram.messenger.gd.M0(2131747975, "NoResult"));
                    kv0Var7 = gt0Var2.n0[i20].w;
                    kv0Var7.f.setVisibility(8);
                    kv0Var8 = gt0Var2.n0[i20].w;
                    kv0Var8.e.setText(org.telegram.messenger.gd.L0(2131745612));
                    kv0Var9 = gt0Var2.n0[i20].w;
                    kv0Var9.f.setVisibility(8);
                    kv0Var10 = gt0Var2.n0[i20].w;
                    kv0Var10.addView(gt0Var2.n0[i20].s, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                    as0Var17 = gt0Var2.n0[i20].h;
                    kv0Var11 = gt0Var2.n0[i20].w;
                    as0Var17.setEmptyView(kv0Var11);
                    as0Var18 = gt0Var2.n0[i20].h;
                    as0Var18.o1(0, true);
                    bs0[] bs0VarArr22 = gt0Var2.n0;
                    bs0 bs0Var92 = bs0VarArr22[i20];
                    as0Var19 = bs0VarArr22[i20].h;
                    bs0Var92.E = new org.telegram.ui.ActionBar.l5(as0Var19, gt0Var2.n0[i20].x);
                    i20++;
                    j10 = j3;
                    i6Var3 = i6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = gt0Var2.c0;
                if (view != null) {
                    gt0Var2.addView(view, c8.ma.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                }
                org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
                gt0Var2.N0 = v0Var;
                v0Var.h0((int) (System.currentTimeMillis() / 1000), false, false);
                v0Var.setAlpha(0.0f);
                v0Var.j0(org.telegram.ui.ActionBar.n6.nd, org.telegram.ui.ActionBar.n6.be);
                v0Var.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
                gt0Var2.addView(v0Var, c8.ma.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                for (bs0 bs0Var10 : gt0Var2.n0) {
                    as0Var = bs0Var10.h;
                    hj0 fastScroll = as0Var.getFastScroll();
                    if (fastScroll != null) {
                        fastScroll.a(cVar3, gt0Var2.I != null ? c8.i0.m(i6Var) : c8.i0.o(i6Var));
                    }
                }
                if (gt0Var2.Y()) {
                    gh.e m10 = gt0Var2.I != null ? c8.i0.m(i6Var) : c8.i0.o(i6Var);
                    cs csVar = new cs(context);
                    gt0Var2.S0 = csVar;
                    int L = org.telegram.messenger.g0.L(11.0f);
                    int i40 = w2;
                    csVar.setPadding(L, i40, org.telegram.messenger.g0.L(11.0f), i40);
                    fh.g b11 = cVar3.b(csVar, m10);
                    b11.r(org.telegram.messenger.g0.L(24.0f));
                    b11.q(org.telegram.messenger.g0.L(7.0f));
                    csVar.setBlurredBackground(b11);
                    FrameLayout frameLayout = new FrameLayout(context);
                    gt0Var2.T0 = frameLayout;
                    csVar.addView(frameLayout);
                    csVar.j(frameLayout, true, false);
                    csVar.setOnAnimatedHeightChangedListener(new fp0(gt0Var2, 1));
                    zq0 zq0Var = new zq0(gt0Var2, context, h2Var, this, i6Var);
                    gt0Var2.U0 = zq0Var;
                    frameLayout.addView(zq0Var);
                    csVar.setCallFragmentContextView(zq0Var);
                    gt0Var2.addView(csVar, c8.ma.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
                    zq0Var.setDelegate(new hp0(gt0Var2));
                    fh.g b12 = cVar3.b(gt0Var2.L0, m10);
                    org.telegram.messenger.n10.s(b12, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    gt0Var2.L0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    gt0Var2.L0.setClipToPadding(false);
                    gt0Var2.L0.setBackground(null);
                    gt0Var2.L0.setBlurredBackground(b12);
                    gt0Var2.L0.setOpen(false);
                    gt0Var2.addView(gt0Var2.L0, c8.ma.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
                    Context context2 = gt0Var2.getContext();
                    org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var2.y1;
                    ar0 ar0Var3 = new ar0(gt0Var2, context2, h2Var3, h2Var3.getCurrentAccount(), gt0Var2.x0() ? 0L : gt0Var2.m1, i6Var);
                    gt0 gt0Var3 = gt0Var2;
                    gt0Var3.M0 = ar0Var3;
                    ar0Var3.d(cVar3, m10);
                    ar0Var3.setShown(0.0f);
                    gt0Var3.addView(ar0Var3, c8.ma.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                    if (gt0Var3.I == null) {
                        fh.g b13 = cVar3.b(gt0Var3.E0, m10);
                        org.telegram.messenger.n10.s(b13, org.telegram.messenger.g0.L(18.0f), 6.666f);
                        gt0Var3.E0.setBackground(b13);
                        z11 = false;
                        gt0Var3.E0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        gt0Var3.addView(gt0Var3.E0, c8.ma.e(-1, 50, 51));
                    } else {
                        z11 = false;
                    }
                    gt0Var3.G();
                    gt0Var = gt0Var3;
                    r92 = z11;
                } else {
                    r92 = 0;
                    gt0Var = gt0Var2;
                }
                gt0Var.P1(r92);
                gt0Var.B1(r92);
                gt0Var.Q();
                if (gt0Var.a1[r92] >= 0) {
                    gt0Var.M0(r92);
                }
                hq0Var = gt0Var.c0;
                if (hq0Var != null || i11 <= 0) {
                }
                hq0Var.setInitialTabId(i11);
                return;
            }
            profileTab = chatFull2.main_tab;
        }
        i13 = 1;
        if (i10 != 14) {
        }
        gt0Var2.b1 = i10;
        gt0Var2.Z0(i10);
        gt0Var2.g1 = chatFull2;
        gt0Var2.h1 = userFull;
        if (chatFull2 != null) {
        }
        j10 = j3;
        gt0Var2.m1 = j10;
        i14 = 0;
        while (true) {
            vs0VarArr = gt0Var2.w1;
            if (i14 < vs0VarArr.length) {
            }
            i14++;
        }
        gt0Var2.y1 = h2Var;
        gt0Var2.H = h2Var.getActionBar();
        gt0Var2.I = h2Var.getSimpleActionBar();
        gt0Var2.p1[0] = gt0Var2.e1() > 0 ? org.telegram.messenger.bz.t1 : gt0Var2.e1();
        gt0Var2.p1[1] = gt0Var2.e1() > 0 ? org.telegram.messenger.bz.u1 : gt0Var2.e1();
        org.telegram.messenger.ks notificationCenter2 = h2Var.getNotificationCenter();
        notificationCenter2.getClass();
        xi.e eVar2 = new xi.e(notificationCenter2, gt0Var2);
        eVar2.c(org.telegram.messenger.ks.V);
        eVar2.c(org.telegram.messenger.ks.w);
        eVar2.c(1);
        eVar2.c(org.telegram.messenger.ks.K);
        eVar2.c(org.telegram.messenger.ks.f2);
        eVar2.c(org.telegram.messenger.ks.g2);
        eVar2.c(org.telegram.messenger.ks.h2);
        eVar2.c(org.telegram.messenger.ks.A5);
        eVar2.c(org.telegram.messenger.ks.y5);
        eVar2.c(org.telegram.messenger.ks.h3);
        eVar2.c(org.telegram.messenger.ks.i3);
        eVar2.c(org.telegram.messenger.ks.s);
        eVar2.c(org.telegram.messenger.ks.I3);
        eVar2.c(org.telegram.messenger.ks.Z3);
        eVar2.c(org.telegram.messenger.ks.f1);
        gt0Var2.K1 = eVar2;
        while (i15 < 10) {
        }
        gt0Var2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        gt0Var2.Y0 = false;
        gt0Var2.Z0 = null;
        ar0Var = gt0Var2.M0;
        if (ar0Var != null) {
        }
        gt0Var2.X0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        gt0Var2.B0 = drawable2;
        org.telegram.ui.ActionBar.u6.x(gt0Var2, drawable2, org.telegram.ui.ActionBar.n6.b7, i6Var, PorterDuff.Mode.MULTIPLY);
        dr0 dr0Var3 = gt0Var2.L0;
        if (dr0Var3 == null) {
        }
        dr0 dr0Var22 = new dr0(gt0Var2, context, gt0Var2.I1);
        i16 = gt0Var2.b1;
        if (i16 != -1) {
        }
        dr0Var22.c0 = 320L;
        int i322 = org.telegram.ui.ActionBar.n6.a;
        int i332 = org.telegram.ui.ActionBar.n6.wi;
        int i342 = org.telegram.ui.ActionBar.n6.vi;
        int i352 = org.telegram.ui.ActionBar.n6.a;
        dr0Var22.M = i332;
        dr0Var22.N = i342;
        dr0Var22.updateColors();
        dr0Var22.setUseMinimalWidth(true);
        dr0Var22.setDelegate(new fr0(gt0Var2));
        gt0Var2.L0 = dr0Var22;
        while (i17 >= 0) {
        }
        gt0Var2.d1 = 0;
        gt0Var2.Q0.clear();
        rs0Var = gt0Var2.U;
        if (rs0Var != null) {
        }
        if (gt0Var2 instanceof z20) {
        }
        ImageView imageView3 = new ImageView(context);
        gt0Var2.u0 = imageView3;
        imageView3.setContentDescription(org.telegram.messenger.gd.M0(2131754839, "AccDescrMoreOptions"));
        imageView3.setTranslationY(org.telegram.messenger.g0.L(f10));
        imageView3.setVisibility(4);
        if (gt0Var2.I == null) {
        }
        i6Var2 = i6Var;
        f11 = 2.0f;
        imageView3.setOnClickListener(new gp0(gt0Var2, 0));
        h5Var = gt0Var2.J;
        if (h5Var != null) {
        }
        r0Var = gt0Var2.q0;
        if (r0Var != null) {
            EditTextBoldCursor searchField2 = r0Var.getSearchField();
            int i362 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(searchField2, i362, i6Var2);
            org.telegram.ui.ActionBar.u6.D(searchField2, org.telegram.ui.ActionBar.n6.Jj, i6Var2);
            org.telegram.ui.ActionBar.u6.v(searchField2, i362, i6Var2);
        }
        gt0Var2.A0 = 0;
        LinearLayout linearLayout2 = new LinearLayout(context);
        gt0Var2.E0 = linearLayout2;
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setClickable(true);
        linearLayout2.setVisibility(4);
        ImageView imageView22 = new ImageView(context);
        gt0Var2.F0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.y1 y1Var2 = new org.telegram.ui.ActionBar.y1(true);
        gt0Var2.G0 = y1Var2;
        imageView22.setImageDrawable(y1Var2);
        int i372 = org.telegram.ui.ActionBar.n6.y8;
        y1Var2.a(gt0Var2.s0(i372));
        int i382 = org.telegram.ui.ActionBar.n6.z8;
        org.telegram.ui.ActionBar.u6.Q(imageView22, org.telegram.ui.ActionBar.n6.g0(gt0Var2.s0(i382), 1), null, org.telegram.ui.ActionBar.u6.M(i382), i6Var2);
        imageView22.setContentDescription(org.telegram.messenger.gd.M0(2131752030, "Close"));
        linearLayout2.addView(imageView22, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        gt0Var2.Q0.add(imageView22);
        imageView22.setOnClickListener(new gp0(gt0Var2, 2));
        NumberTextView numberTextView2 = new NumberTextView(context);
        gt0Var2.D0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(org.telegram.messenger.g0.o());
        numberTextView2.setTextColor(gt0Var2.s0(i372));
        linearLayout2.addView(numberTextView2, c8.ma.m(1.0f, 0, -1, 18, 0, 0));
        gt0Var2.Q0.add(numberTextView2);
        if (!org.telegram.messenger.n5.C(gt0Var2.m1)) {
        }
        gt0Var2.o0 = gt0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751587, "Delete"));
        gt0Var2.K = new nr0(gt0Var2, context);
        gt0Var2.L = new at0(gt0Var2, context);
        gt0Var2.N = new ts0(gt0Var2, context, 1);
        gt0Var2.O = new ts0(gt0Var2, context, 2);
        gt0Var2.P = new ts0(gt0Var2, context, 4);
        gt0Var2.Q = new ps0(gt0Var2, context, gt0Var2.y1.getCurrentAccount(), gt0Var2.y1.getResourceProvider());
        gt0Var2.R = new wr0(gt0Var2, context);
        gt0Var2.j0 = new ds0(gt0Var2, context, 1);
        gt0Var2.k0 = new ds0(gt0Var2, context, 4);
        gt0Var2.l0 = new ds0(gt0Var2, context, 3);
        gt0Var2.m0 = new zr0(gt0Var2, context);
        gt0Var2.S = new ur0(gt0Var2, context);
        gt0Var2.T = new sr0(gt0Var2, context);
        gt0Var2.U = new rs0(gt0Var2, context);
        gt0Var2.V = new ss0(gt0Var2, context);
        if (!gt0Var2.I0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", gt0Var2.y1.getUserConfig().e());
            bundle2.putInt("chatMode", 3);
            or0 or0Var2 = new or0(gt0Var2, context, gt0Var2.y1.getParentLayout(), bundle2);
            gt0Var2.W = or0Var2;
            long j122 = gt0Var2.m1;
            org.telegram.ui.cn cnVar2 = or0Var2.a;
            cnVar2.s4 = j122;
            cnVar2.nb = true;
            or0Var2.setClipToOutline(true);
            or0Var2.setOutlineProvider(new pr0());
        }
        tr0 tr0Var2 = new tr0(gt0Var2, context);
        gt0Var2.d0 = tr0Var2;
        if (gt0Var2.G == 0) {
        }
        gt0Var2.f0 = new qr0(gt0Var2, context);
        gt0Var2.e0 = new v4.z(new rr0(gt0Var2));
        gt0Var2.g0 = new dt0(gt0Var2, context, false);
        gt0Var2.h0 = new cq0(gt0Var2, context);
        gt0Var2.i0 = new dt0(gt0Var2, context, true);
        gt0Var2.M = new us0(gt0Var2, context);
        if (gt0Var2.B0()) {
        }
        gt0Var2.setWillNotDraw(z10);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            bs0VarArr = gt0Var2.n0;
            if (i20 < bs0VarArr.length) {
            }
            bs0 bs0Var722 = gt0Var2.n0[i20];
            bs0Var722.w = new xq0(gt0Var2, context, bs0Var722.s);
            kv0Var = gt0Var2.n0[i20].w;
            kv0Var.d(8, false);
            kv0Var2 = gt0Var2.n0[i20].w;
            kv0Var2.setAnimateLayoutChange(true);
            bs0 bs0Var822 = gt0Var2.n0[i20];
            kv0Var3 = bs0Var822.w;
            bs0Var822.addView(kv0Var3, c8.ma.c(-1.0f, -1));
            kv0Var4 = gt0Var2.n0[i20].w;
            kv0Var4.setOnTouchListener(new gi.a(24));
            kv0Var5 = gt0Var2.n0[i20].w;
            kv0Var5.e(true, false);
            kv0Var6 = gt0Var2.n0[i20].w;
            kv0Var6.d.setText(org.telegram.messenger.gd.M0(2131747975, "NoResult"));
            kv0Var7 = gt0Var2.n0[i20].w;
            kv0Var7.f.setVisibility(8);
            kv0Var8 = gt0Var2.n0[i20].w;
            kv0Var8.e.setText(org.telegram.messenger.gd.L0(2131745612));
            kv0Var9 = gt0Var2.n0[i20].w;
            kv0Var9.f.setVisibility(8);
            kv0Var10 = gt0Var2.n0[i20].w;
            kv0Var10.addView(gt0Var2.n0[i20].s, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 12.0f, 60.0f, 12.0f, 12.0f));
            as0Var17 = gt0Var2.n0[i20].h;
            kv0Var11 = gt0Var2.n0[i20].w;
            as0Var17.setEmptyView(kv0Var11);
            as0Var18 = gt0Var2.n0[i20].h;
            as0Var18.o1(0, true);
            bs0[] bs0VarArr222 = gt0Var2.n0;
            bs0 bs0Var922 = bs0VarArr222[i20];
            as0Var19 = bs0VarArr222[i20].h;
            bs0Var922.E = new org.telegram.ui.ActionBar.l5(as0Var19, gt0Var2.n0[i20].x);
            i20++;
            j10 = j3;
            i6Var3 = i6Var;
            i18 = i21;
            i19 = i22;
        }
        view = gt0Var2.c0;
        if (view != null) {
        }
        org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(context);
        gt0Var2.N0 = v0Var2;
        v0Var2.h0((int) (System.currentTimeMillis() / 1000), false, false);
        v0Var2.setAlpha(0.0f);
        v0Var2.j0(org.telegram.ui.ActionBar.n6.nd, org.telegram.ui.ActionBar.n6.be);
        v0Var2.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
        gt0Var2.addView(v0Var2, c8.ma.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        while (r4 < r2) {
        }
        if (gt0Var2.Y()) {
        }
        gt0Var.P1(r92);
        gt0Var.B1(r92);
        gt0Var.Q();
        if (gt0Var.a1[r92] >= 0) {
        }
        hq0Var = gt0Var.c0;
        if (hq0Var != null) {
        }
    }

    public static boolean J0(int i7) {
        return (i7 & (-65536)) == 65536;
    }

    public static x3 X(int i7, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        x3 x3Var = new x3(context, i6Var);
        ImageView imageView = (ImageView) x3Var.d;
        TextView textView = (TextView) x3Var.c;
        if (i7 == 0) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131748004, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131748006, null));
            return x3Var;
        }
        if (i7 == 1) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747965, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131747966, null));
            return x3Var;
        }
        if (i7 == 2) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747960, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131747961, null));
            return x3Var;
        }
        if (i7 == 3) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747962, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131747963, null));
            return x3Var;
        }
        if (i7 == 4) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747967, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131747968, null));
            return x3Var;
        }
        if (i7 == 5) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747964, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131748016, null));
            return x3Var;
        }
        if (i7 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.gd.M0(2131748014, null));
            return x3Var;
        }
        if (i7 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return x3Var;
    }

    public static void a(gt0 gt0Var, TL_stories.StoryItem storyItem, fi.i6 i6Var) {
        gt0Var.getStoriesController().c(i6Var.a, gt0Var.m1, storyItem);
        org.telegram.messenger.g0.h3(new hn0(3, gt0Var, i6Var), 100L);
    }

    public static void d(gt0 gt0Var, int i7, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(gt0Var, i7, storyItem, 19);
        fi.p6 storiesController = gt0Var.getStoriesController();
        long j3 = gt0Var.m1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i7, j3, arrayList);
        lc.b0(gt0Var.y1).K(R.raw.chats_archived, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.gd.M0(2131743648, null), b0Var).j();
    }

    public static void e(gt0 gt0Var, long j3, int i7) {
        fi.d6 B = gt0Var.getStoriesController().B(j3, true);
        int i10 = B.a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        fi.i6 i6Var = (fi.i6) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.mp.u1(i10).l1(B.b);
        tL_deleteAlbum.album_id = i6Var.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(gt0 gt0Var, long j3, int i7, String str) {
        fi.d6 B = gt0Var.getStoriesController().B(j3, true);
        int i10 = B.a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        ((fi.i6) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.mp.u1(i10).l1(B.b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getPlaylistTopicId() {
        if (org.telegram.messenger.v3.b0(this.y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fi.p6 getStoriesController() {
        return org.telegram.messenger.mp.u1(this.y1.getCurrentAccount()).R1();
    }

    public static /* synthetic */ void h(gt0 gt0Var, TL_stories.StoryItem storyItem) {
        gt0Var.getStoriesController().r0(gt0Var.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        lc.b0(gt0Var.y1).G(R.raw.chats_archived, 5000, org.telegram.messenger.gd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(gt0 gt0Var, HashSet hashSet, TL_stories.StoryItem storyItem, y60 y60Var, fi.i6 i6Var) {
        String a02;
        long j3 = gt0Var.m1;
        if (hashSet.contains(Integer.valueOf(i6Var.a))) {
            gt0Var.getStoriesController().c(i6Var.a, j3, storyItem);
            a02 = org.telegram.messenger.gd.a0(null, null, 2131744496, i6Var.b);
        } else {
            fi.p6 storiesController = gt0Var.getStoriesController();
            int i7 = i6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i7, j3, arrayList);
            a02 = org.telegram.messenger.gd.a0(null, null, 2131744259, i6Var.b);
        }
        lc.b0(gt0Var.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.W2(a02)).j();
        y60Var.v();
    }

    public static int o(View view) {
        if (view instanceof org.telegram.ui.Cells.p7) {
            return ((org.telegram.ui.Cells.p7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().e1();
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            return ((org.telegram.ui.Cells.h7) view).getMessage().e1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab o0(int i7, boolean z10) {
        if (i7 != 8 && i7 != 14 && !z10) {
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

    public static void s(bs0 bs0Var, vs0[] vs0VarArr, boolean z10) {
        hn0 hn0Var;
        if (!z10) {
            if (bs0Var.G == null || (hn0Var = bs0Var.H) == null) {
                return;
            }
            org.telegram.messenger.g0.r(hn0Var);
            bs0Var.H.run();
            bs0Var.H = null;
            bs0Var.G = null;
            return;
        }
        if (org.telegram.messenger.bz.v1 <= 0 || bs0Var.G != null || bs0Var.I || bs0Var.h.getFastScroll() == null || !bs0Var.h.getFastScroll().b0 || bs0Var.h.getFastScroll().getVisibility() != 0 || vs0VarArr[0].e() < 50) {
            return;
        }
        int i7 = org.telegram.messenger.bz.v1;
        int i10 = i7 - 1;
        if (i7 != i10) {
            org.telegram.messenger.bz.v1 = i10;
            org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.bz.v1).apply();
        }
        bs0Var.I = true;
        Context context = bs0Var.getContext();
        bi.p2 p2Var = new bi.p2(context, 20);
        TextView textView = new TextView(context);
        org.telegram.messenger.n10.l(14.0f, 2131745213, 1, textView, null);
        textView.setMaxLines(3);
        int i11 = org.telegram.ui.ActionBar.n6.gg;
        org.telegram.ui.ActionBar.u6.U(textView, i11, null);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i12 = org.telegram.ui.ActionBar.n6.hg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        p2Var.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(p2Var, d02, M, null, null);
        p2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        dp0 dp0Var = new dp0(context);
        dp0Var.a = new Random();
        Paint paint = new Paint(1);
        dp0Var.b = paint;
        Paint paint2 = new Paint(1);
        dp0Var.c = paint2;
        dp0Var.f = 1.0f;
        dp0Var.h = 0.0f;
        paint.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        Paint paint3 = new Paint();
        dp0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        dp0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        p2Var.addView(dp0Var, c8.ma.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        bs0Var.G = p2Var;
        bs0Var.addView(p2Var, c8.ma.c(-2.0f, -2));
        bs0Var.G.setAlpha(0.0f);
        bs0Var.G.setScaleX(0.8f);
        bs0Var.G.setScaleY(0.8f);
        bs0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        bs0Var.invalidate();
        hn0 hn0Var2 = new hn0(4, bs0Var, p2Var);
        bs0Var.H = hn0Var2;
        org.telegram.messenger.g0.h3(hn0Var2, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        if (a5Var != null) {
            a5Var.setEnabled(z10);
        } else {
            this.H.setEnabled(z10);
        }
    }

    private void setPageOverscan(as0 as0Var) {
        if (!this.c2 || as0Var == null) {
            return;
        }
        as0Var.j3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) as0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            int i7 = marginLayoutParams.topMargin;
            int i10 = -this.e2;
            if (i7 == i10 && marginLayoutParams.bottomMargin == (-this.f2)) {
                return;
            }
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -this.f2;
            as0Var.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchItemVisibility(int i7) {
        org.telegram.ui.ActionBar.r0 r0Var = this.q0;
        if (r0Var == null) {
            return;
        }
        if (this.I != null) {
            R(true, true);
        } else {
            r0Var.setVisibility(i7);
        }
    }

    public static void t(gt0 gt0Var, int i7, boolean z10) {
        bs0[] bs0VarArr = gt0Var.n0;
        if (bs0VarArr[0].F == i7) {
            return;
        }
        bs0 bs0Var = bs0VarArr[1];
        bs0Var.F = i7;
        bs0Var.setVisibility(0);
        gt0Var.w0();
        gt0Var.B1(true);
        gt0Var.k1 = z10;
        gt0Var.Y0();
        gt0Var.E(!gt0Var.F0(i7));
        gt0Var.I1(true);
    }

    public static int x(gt0 gt0Var, v4.i0 i0Var) {
        if (i0Var == gt0Var.f0) {
            return 8;
        }
        if (i0Var == gt0Var.h0) {
            return 9;
        }
        for (ft0 ft0Var : gt0Var.m2.values()) {
            if (ft0Var.c == i0Var) {
                return ft0Var.a;
            }
        }
        return -1;
    }

    public static int y(gt0 gt0Var, v4.i0 i0Var) {
        if (i0Var == gt0Var.g0) {
            return 8;
        }
        if (i0Var == gt0Var.i0) {
            return 9;
        }
        for (ft0 ft0Var : gt0Var.m2.values()) {
            if (ft0Var.d == i0Var) {
                return ft0Var.a;
            }
        }
        return -1;
    }

    public static boolean z0(int i7) {
        return i7 == 8 || i7 == 9 || J0(i7);
    }

    public final SpannableStringBuilder A() {
        if (this.a2 == null) {
            this.a2 = new SpannableStringBuilder();
            if (B0()) {
                this.a2.append((CharSequence) org.telegram.messenger.gd.M0(2131746507, null));
            } else {
                this.a2.append((CharSequence) "c");
                this.a2.setSpan(new lq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.gd.M0(2131744574, null));
            }
        }
        return this.a2;
    }

    public boolean A0() {
        return false;
    }

    public final dt0 A1(int i7) {
        ft0 y12;
        if (i7 == 8) {
            return this.g0;
        }
        if (i7 == 9) {
            return this.i0;
        }
        if (!J0(i7) || (y12 = y1(i7)) == null) {
            return null;
        }
        return y12.d;
    }

    public final void B(fs0 fs0Var, org.telegram.ui.ActionBar.h2 h2Var, long j3, int i7) {
        String o4 = j3 > 0 ? org.telegram.messenger.o10.o(org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).c2(Long.valueOf(j3))) : org.telegram.messenger.v3.K(org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).O0(Long.valueOf(-j3)), false);
        if (o4 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).X2, "/", o4, "/a/");
        sb2.append(i7);
        fs0Var.i0(R.drawable.media_share, new k7(this, sb2.toString(), h2Var, 25), org.telegram.messenger.gd.M0(2131744553, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User c22;
        long j3 = this.m1;
        return j3 > 0 && (c22 = org.telegram.messenger.mp.u1(this.y1.getCurrentAccount()).c2(Long.valueOf(j3))) != null && c22.bot;
    }

    public final void B1(boolean z10) {
        bs0[] bs0VarArr;
        bs0[] bs0VarArr2;
        org.telegram.ui.ActionBar.r0 r0Var;
        v4.w0 w0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        v4.w0 w0Var2;
        int i7;
        int i10;
        int i11;
        boolean z14;
        v4.w0 w0Var3;
        int i12;
        int i13;
        boolean z15;
        v4.w0 w0Var4;
        eq0 eq0Var = this.b0;
        if (eq0Var != null) {
            eq0Var.i();
        }
        int i14 = 0;
        while (true) {
            bs0VarArr = this.n0;
            if (i14 >= bs0VarArr.length) {
                break;
            }
            bs0VarArr[i14].h.C0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bs0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        v4.i0 adapter = bs0VarArr[z10 ? 1 : 0].h.getAdapter();
        v4.i0 i0Var = this.f0;
        v4.z zVar = this.e0;
        if (adapter == i0Var) {
            zVar.h(null);
        }
        boolean z16 = this.Y0;
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        vr0 vr0Var = this.G1;
        org.telegram.ui.ActionBar.k kVar = this.H;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.q0;
        ps0 ps0Var = this.Q;
        int i15 = 100;
        if (z16 && this.X0) {
            bs0 bs0Var = bs0VarArr[z10 ? 1 : 0];
            if (bs0Var.f == null) {
                bs0Var.f = new v4.w0();
            }
            bs0 bs0Var2 = bs0VarArr[z10 ? 1 : 0];
            v4.w0 w0Var5 = bs0Var2.f;
            ss0 ss0Var = this.V;
            zr0 zr0Var = this.m0;
            ds0 ds0Var = this.k0;
            ds0 ds0Var2 = this.l0;
            ds0 ds0Var3 = this.j0;
            if (z10) {
                int i16 = bs0Var2.F;
                if (i16 != 0) {
                    w0Var4 = w0Var5;
                    if (i16 != 2 && i16 != 5 && i16 != 6 && (i16 != 7 || vr0Var.Y())) {
                        String obj = r0Var2 != null ? r0Var2.getSearchField().getText().toString() : "";
                        int i17 = bs0VarArr[z10 ? 1 : 0].F;
                        if (i17 == 1) {
                            if (ds0Var3 != null) {
                                ds0Var3.G(obj, false);
                                if (adapter != ds0Var3) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var3);
                                }
                            }
                        } else if (i17 == 3) {
                            if (ds0Var2 != null) {
                                ds0Var2.G(obj, false);
                                if (adapter != ds0Var2) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var2);
                                }
                            }
                        } else if (i17 == 4) {
                            if (ds0Var != null) {
                                ds0Var.G(obj, false);
                                if (adapter != ds0Var) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var);
                                }
                            }
                        } else if (i17 == 7) {
                            if (zr0Var != null) {
                                zr0Var.F(obj, false);
                                if (adapter != zr0Var) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(zr0Var);
                                }
                            }
                        } else if (i17 == 11) {
                            if (ss0Var != null) {
                                ss0Var.E(this.Z0, obj);
                                if (adapter != ss0Var) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(ss0Var);
                                }
                            }
                        } else if (i17 == 15 && ps0Var != null && adapter != ps0Var) {
                            i1(adapter);
                            lq0 lq0Var = bs0VarArr[z10 ? 1 : 0].h;
                            ps0Var.r = lq0Var;
                            lq0Var.setAdapter(ps0Var);
                        }
                    }
                }
                this.Y0 = false;
                ar0 ar0Var = this.M0;
                if (ar0Var != null) {
                    ar0Var.g(false);
                }
                this.X0 = false;
                B1(true);
                return;
            }
            w0Var4 = w0Var5;
            if (bs0Var2.h != null) {
                int i18 = bs0Var2.F;
                if (i18 == 1) {
                    if (adapter != ds0Var3) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var3);
                    }
                    ds0Var3.f();
                } else if (i18 == 3) {
                    if (adapter != ds0Var2) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var2);
                    }
                    ds0Var2.f();
                } else if (i18 == 4) {
                    if (adapter != ds0Var) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var);
                    }
                    ds0Var.f();
                } else if (i18 == 7) {
                    if (adapter != zr0Var) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(zr0Var);
                    }
                    zr0Var.f();
                } else if (i18 == 11) {
                    if (adapter != ss0Var) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(ss0Var);
                    }
                    ss0Var.f();
                }
            }
            bs0VarArr2 = bs0VarArr;
            r0Var = r0Var2;
            w0Var3 = w0Var4;
            i10 = 4;
            z13 = false;
            z14 = false;
            i11 = 8;
        } else {
            bs0 bs0Var3 = bs0VarArr[z10 ? 1 : 0];
            if (bs0Var3.e == null) {
                bs0Var3.e = new v4.w0();
            }
            bs0 bs0Var4 = bs0VarArr[z10 ? 1 : 0];
            v4.w0 w0Var6 = bs0Var4.e;
            bs0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = bs0VarArr[z10 ? 1 : 0].F;
            if (i19 == 8 || J0(i19)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
            }
            lq0 lq0Var2 = bs0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = lq0Var2.getPaddingLeft();
            bs0 bs0Var5 = bs0VarArr[z10 ? 1 : 0];
            bs0VarArr2 = bs0VarArr;
            lq0 lq0Var3 = bs0Var5.h;
            int j02 = j0(bs0Var5.F);
            lq0Var3.h3 = j02;
            int paddingRight = bs0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            lq0 lq0Var4 = bs0VarArr2[z10 ? 1 : 0].h;
            r0Var = r0Var2;
            int i02 = i0(I0());
            lq0Var4.i3 = i02;
            lq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i20 = bs0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.p1;
            v4.i0 i0Var2 = this.N;
            View view = this.a0;
            rs0 rs0Var = this.U;
            ur0 ur0Var = this.S;
            or0 or0Var = this.W;
            vs0[] vs0VarArr = this.w1;
            if (i20 == 0) {
                v4.i0 i0Var3 = this.K;
                if (adapter != i0Var3) {
                    i1(adapter);
                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var3);
                }
                int i21 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                vs0 vs0Var = vs0VarArr[0];
                boolean z17 = vs0Var.h && !vs0Var.e.isEmpty();
                i15 = iArr[0];
                bs0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                vs0 vs0Var2 = vs0VarArr[0];
                if (vs0Var2.x == null) {
                    vs0Var2.x = new v4.w0();
                }
                w0Var = vs0VarArr[0].x;
                z13 = z17;
                z11 = false;
            } else {
                if (i20 == 1) {
                    vs0 vs0Var3 = vs0VarArr[1];
                    z12 = vs0Var3.h && !vs0Var3.e.isEmpty();
                    if (adapter != i0Var2) {
                        i1(adapter);
                        bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var2);
                    }
                } else if (i20 == 2) {
                    vs0 vs0Var4 = vs0VarArr[2];
                    z12 = vs0Var4.h && !vs0Var4.e.isEmpty();
                    v4.i0 i0Var4 = this.O;
                    if (adapter != i0Var4) {
                        i1(adapter);
                        bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var4);
                    }
                } else {
                    if (i20 == 3) {
                        v4.i0 i0Var5 = this.M;
                        if (adapter != i0Var5) {
                            i1(adapter);
                            bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var5);
                        }
                    } else if (i20 == 4) {
                        vs0 vs0Var5 = vs0VarArr[4];
                        z12 = vs0Var5.h && !vs0Var5.e.isEmpty();
                        v4.i0 i0Var6 = this.P;
                        if (adapter != i0Var6) {
                            i1(adapter);
                            bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var6);
                        }
                    } else {
                        if (i20 == 5) {
                            v4.i0 i0Var7 = this.R;
                            if (adapter != i0Var7) {
                                i1(adapter);
                                bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var7);
                            }
                        } else if (i20 == 15) {
                            if (adapter != ps0Var) {
                                i1(adapter);
                                lq0 lq0Var5 = bs0VarArr2[z10 ? 1 : 0].h;
                                ps0Var.r = lq0Var5;
                                lq0Var5.setAdapter(ps0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != ur0Var) {
                                i1(adapter);
                                bs0VarArr2[z10 ? 1 : 0].h.setAdapter(ur0Var);
                            }
                        } else if (i20 == 7) {
                            v4.i0 i0Var8 = this.d0;
                            if (adapter != i0Var8) {
                                i1(adapter);
                                bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var8);
                            }
                        } else if (z0(i20)) {
                            v4.i0 z18 = z1(bs0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != z18) {
                                i1(adapter);
                                bs0VarArr2[z10 ? 1 : 0].h.setAdapter(z18);
                                bs0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            bs0 bs0Var6 = bs0VarArr2[z10 ? 1 : 0];
                            if (bs0Var6.F != 9) {
                                zVar.h(bs0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = bs0VarArr2[z10 ? 1 : 0].F;
                            if (i22 == 10) {
                                v4.i0 i0Var9 = this.T;
                                if (adapter != i0Var9) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var9);
                                }
                            } else if (i22 == 11) {
                                if (adapter != rs0Var) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(rs0Var);
                                    v4.z zVar2 = rs0Var.w;
                                    lq0 lq0Var6 = bs0VarArr2[z10 ? 1 : 0].h;
                                    rs0Var.s = lq0Var6;
                                    zVar2.h(lq0Var6);
                                }
                                w0Var = rs0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (or0Var.getParent() != bs0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(or0Var);
                                    bs0VarArr2[z10 ? 1 : 0].addView(or0Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    p1(org.telegram.messenger.g0.L(56.0f) + this.d2, or0Var);
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != bs0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    bs0VarArr2[z10 ? 1 : 0].addView(view);
                                    p1(this.d2, view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (eq0Var != null && eq0Var.getParent() != bs0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(eq0Var);
                                    bs0VarArr2[z10 ? 1 : 0].addView(eq0Var);
                                    bs0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        w0Var = w0Var6;
                        z11 = false;
                        z13 = false;
                    }
                    w0Var = w0Var6;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                w0Var = w0Var6;
                z11 = true;
            }
            K1(bs0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                bs0VarArr2[z10 ? 1 : 0].h.setSections(false);
                w0Var2 = w0Var;
            } else {
                lq0 lq0Var7 = bs0VarArr2[z10 ? 1 : 0].h;
                lq0Var7.getClass();
                w0Var2 = w0Var;
                org.telegram.ui.ActionBar.u6.l(lq0Var7, 20, org.telegram.ui.ActionBar.n6.i6, lq0Var7.o2);
                lq0Var7.U2 = false;
                lq0Var7.I2 = null;
                lq0Var7.J2 = null;
                lq0Var7.M2 = 0.0f;
                lq0Var7.N2 = null;
                lq0Var7.O2 = null;
                lq0Var7.K2 = null;
                mj0 mj0Var = lq0Var7.H2;
                if (mj0Var != null) {
                    lq0Var7.q0(mj0Var);
                    lq0Var7.H2 = null;
                }
                v9 v9Var = lq0Var7.S2;
                if (v9Var != null) {
                    lq0Var7.q0(v9Var);
                    lq0Var7.S2 = null;
                }
            }
            J1(bs0VarArr2[z10 ? 1 : 0]);
            bs0 bs0Var7 = bs0VarArr2[z10 ? 1 : 0];
            if (bs0Var7.F == 11) {
                bs0Var7.h.setItemAnimator(bs0Var7.d);
            } else {
                bs0Var7.h.setItemAnimator(null);
                if (rs0Var != null && bs0VarArr2[z10 ? 1 : 0].h == rs0Var.s) {
                    v4.z zVar3 = rs0Var.w;
                    rs0Var.s = null;
                    zVar3.h(null);
                }
            }
            if (or0Var != null && bs0VarArr2[z10 ? 1 : 0].F != 12 && or0Var.getParent() == bs0VarArr2[z10 ? 1 : 0]) {
                or0Var.a.onRemoveFromParent();
                bs0VarArr2[z10 ? 1 : 0].removeView(or0Var);
            }
            if (view != null && bs0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                bs0 bs0Var8 = bs0VarArr2[z10 ? 1 : 0];
                if (parent == bs0Var8) {
                    bs0Var8.removeView(view);
                }
            }
            if (eq0Var != null && bs0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = eq0Var.getParent();
                bs0 bs0Var9 = bs0VarArr2[z10 ? 1 : 0];
                if (parent2 == bs0Var9) {
                    bs0Var9.removeView(eq0Var);
                }
            }
            int i23 = bs0VarArr2[z10 ? 1 : 0].F;
            if (i23 != 0 && i23 != 11 && !z0(i23) && (i12 = bs0VarArr2[z10 ? 1 : 0].F) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || vr0Var.Y()) && (i13 = bs0VarArr2[z10 ? 1 : 0].F) != 10 && i13 != 13 && i13 != 14)) {
                if (z10) {
                    if (r0Var != null && r0Var.getVisibility() == 4) {
                        if (!(a5Var != null ? a5Var.G : kVar.o0)) {
                            if (I()) {
                                this.A0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                setSearchItemVisibility(I0() ? 8 : 4);
                            }
                            float f10 = z10 ? 1.0f : 0.0f;
                            this.r0 = l0(f10);
                            M1(1.0f - f10);
                            z15 = false;
                        }
                    }
                    z15 = false;
                    this.A0 = 0;
                    this.r0 = 1.0f;
                } else {
                    z15 = false;
                    if (r0Var != null && r0Var.getVisibility() == 4) {
                        if (I()) {
                            this.A0 = 0;
                            this.r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            setSearchItemVisibility(I0() ? 8 : 4);
                            this.r0 = 0.0f;
                        }
                    }
                }
                I1(z15);
            } else if (z10) {
                this.A0 = 2;
            } else {
                this.A0 = 0;
                if (r0Var != null) {
                    setSearchItemVisibility((I0() || this.Y0) ? 8 : 4);
                }
            }
            int i24 = bs0VarArr2[z10 ? 1 : 0].F;
            if (i24 == 6) {
                if (!ur0Var.e && !ur0Var.h && ur0Var.d.isEmpty()) {
                    ur0Var.E(0L);
                }
            } else if (i24 != 7) {
                if (z0(i24)) {
                    dt0 z19 = z1(bs0VarArr2[z10 ? 1 : 0].F);
                    if (z19 != null) {
                        fi.h6 h6Var = z19.s;
                        z19.P();
                        bs0VarArr2[z10 ? 1 : 0].w.e(h6Var != null && (h6Var.k() || (t0() && h6Var.g() > 0)), z10);
                        z13 = (h6Var == null || h6Var.g() <= 0 || G0()) ? false : true;
                    }
                } else {
                    int i25 = bs0VarArr2[z10 ? 1 : 0].F;
                    if (i25 != 10 && i25 != 11 && i25 != 12 && i25 != 13 && i25 != 14) {
                        if (i25 == 15) {
                            i25 = 8;
                        }
                        vs0 vs0Var6 = vs0VarArr[i25];
                        if (!vs0Var6.g && !vs0Var6.i[0] && vs0Var6.a.isEmpty()) {
                            vs0VarArr[i25].g = true;
                            i0Var2.f();
                            if (i25 == 0) {
                                int i26 = vs0VarArr[0].q;
                                if (i26 == 1) {
                                    i7 = 6;
                                } else if (i26 == 2) {
                                    i7 = 7;
                                }
                                org.telegram.ui.ActionBar.h2 h2Var = this.y1;
                                h2Var.getMediaDataController().Q0(this.m1, 50, 0, 0, i7, this.G, 1, h2Var.getClassGuid(), vs0VarArr[i7].p, null, null);
                            }
                            i7 = i25;
                            org.telegram.ui.ActionBar.h2 h2Var2 = this.y1;
                            h2Var2.getMediaDataController().Q0(this.m1, 50, 0, 0, i7, this.G, 1, h2Var2.getClassGuid(), vs0VarArr[i7].p, null, null);
                        }
                    }
                }
            }
            int i27 = bs0VarArr2[z10 ? 1 : 0].F;
            if (i27 == 8 || J0(i27)) {
                i10 = 4;
                bs0 bs0Var10 = bs0VarArr2[z10 ? 1 : 0];
                xq0 xq0Var = bs0Var10.w;
                boolean J0 = J0(bs0Var10.F);
                int w12 = w1(bs0VarArr2[z10 ? 1 : 0].F);
                q9 q9Var = xq0Var.b;
                hi.d dVar = xq0Var.f;
                q9Var.setVisibility((J0 || H0() || B0()) ? 8 : 0);
                if (J0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.gd.M0(2131744570, null), false);
                    i11 = 8;
                } else if (H0()) {
                    i11 = 8;
                    dVar.setVisibility(8);
                } else {
                    i11 = 8;
                    xq0Var.setStickerType(11);
                    dVar.setVisibility(!G0() ? 0 : 8);
                    dVar.h(A(), false);
                }
                if (J0) {
                    xq0Var.d.setText(org.telegram.messenger.gd.M0(2131744548, null));
                    xq0Var.e.setText(org.telegram.messenger.gd.M0(2131744549, null));
                } else {
                    xq0Var.d.setText(org.telegram.messenger.gd.M0(!G0() ? I0() ? 2131747984 : 2131747955 : 2131748012, null));
                    xq0Var.e.setText(I0() ? org.telegram.messenger.gd.M0(2131747956, null) : "");
                }
                dVar.setOnClickListener(new bi.j5(this, J0, w12, 1));
            } else {
                bs0 bs0Var11 = bs0VarArr2[z10 ? 1 : 0];
                if (bs0Var11.F == 9) {
                    if (H0()) {
                        bs0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        bs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        bs0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        bs0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        bs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        bs0VarArr2[z10 ? 1 : 0].w.f.h(A(), false);
                    }
                    bs0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.gd.M0(2131748054, null));
                    bs0VarArr2[z10 ? 1 : 0].w.e.setText(I0() ? org.telegram.messenger.gd.M0(2131748055, null) : "");
                    i10 = 4;
                    bs0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new gp0(this, i10));
                    i11 = 8;
                } else {
                    i10 = 4;
                    bs0Var11.w.b.setVisibility(0);
                    bs0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    bs0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
                    bs0VarArr2[z10 ? 1 : 0].w.e.setText(org.telegram.messenger.gd.M0(2131745612, null));
                    i11 = 8;
                    bs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z14 = false;
            bs0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            w0Var3 = w0Var2;
        }
        int i28 = i15;
        bs0 bs0Var12 = bs0VarArr2[z10 ? 1 : 0];
        bs0Var12.b = z13;
        F1(bs0Var12, z14);
        bs0VarArr2[z10 ? 1 : 0].x.y1(i28);
        bs0VarArr2[z10 ? 1 : 0].h.a0();
        if (w0Var3 != null) {
            bs0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(w0Var3);
            bs0VarArr2[z10 ? 1 : 0].n.setRecycledViewPool(w0Var3);
        }
        if (this.A0 == 2) {
            if (a5Var != null ? a5Var.G : kVar.o0) {
                this.C0 = true;
                if (a5Var != null) {
                    a5Var.o(true);
                } else {
                    kVar.o(true);
                }
                this.A0 = 0;
                this.r0 = 0.0f;
                if (r0Var != null) {
                    setSearchItemVisibility(I0() ? i11 : i10);
                }
                I1(false);
            }
        }
    }

    public final void C(fs0 fs0Var) {
        final View[] viewArr = new View[2];
        final int i7 = 0;
        viewArr[0] = fs0Var.i0(R.drawable.msg_zoomin, new Runnable(this) { // from class: org.telegram.ui.Components.vp0
            public final /* synthetic */ gt0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        gt0 gt0Var = this.b;
                        gt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        gt0Var.Q1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        gt0 gt0Var2 = this.b;
                        gt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        gt0Var2.R1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.gd.M0(2131748458, null), false, false);
        final int i10 = 1;
        viewArr[1] = fs0Var.i0(R.drawable.msg_zoomout, new Runnable(this) { // from class: org.telegram.ui.Components.vp0
            public final /* synthetic */ gt0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        gt0 gt0Var = this.b;
                        gt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        gt0Var.Q1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        gt0 gt0Var2 = this.b;
                        gt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        gt0Var2.R1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.gd.M0(2131748457, null), false, false);
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
        org.telegram.ui.ActionBar.h2 h2Var;
        if (this.g1 == null || (h2Var = this.y1) == null) {
            return false;
        }
        return org.telegram.messenger.v3.V(h2Var.getMessagesController().O0(Long.valueOf(this.g1.id)));
    }

    public final void C1(org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (z0Var2.getCheckView().a.q || !z0Var.getCheckView().a.q) {
            z0Var.setChecked(!z0Var.getCheckView().a.q);
            runnable.run();
        } else {
            float f10 = -this.v1;
            this.v1 = f10;
            org.telegram.messenger.g0.E3(f10, z0Var, null);
        }
    }

    public final void D(as0 as0Var, int i7, SparseBooleanArray sparseBooleanArray) {
        int childCount = as0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = as0Var.getChildAt(i10);
            if (childAt instanceof wz) {
                view = childAt;
            }
        }
        if (view != null) {
            as0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new ir0(this, as0Var, sparseBooleanArray, (wz) view, i7));
    }

    public final boolean D0() {
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i7 >= bs0VarArr.length) {
                return false;
            }
            bs0 bs0Var = bs0VarArr[i7];
            if (bs0Var != null) {
                lq0 lq0Var = bs0Var.h;
                if (lq0Var != null && lq0Var.c0()) {
                    return true;
                }
                as0 as0Var = bs0VarArr[i7].n;
                if (as0Var != null && as0Var.c0()) {
                    return true;
                }
            }
            i7++;
        }
    }

    public final void D1() {
        if (this.I != null) {
            return;
        }
        try {
            int s02 = s0(org.telegram.ui.ActionBar.n6.y8);
            int s03 = s0(org.telegram.ui.ActionBar.n6.z8);
            if (s02 == this.r2 && s03 == this.s2) {
                return;
            }
            this.r2 = s02;
            this.s2 = s03;
            org.telegram.ui.ActionBar.r0[] r0VarArr = {this.x0, this.w0, this.y0, this.z0, this.o0};
            for (int i7 = 0; i7 < 5; i7++) {
                org.telegram.ui.ActionBar.r0 r0Var = r0VarArr[i7];
                if (r0Var != null) {
                    r0Var.setIconColor(s02);
                    if (r0Var.getBackground() != null) {
                        org.telegram.ui.ActionBar.n6.H1(r0Var.getBackground(), s03, true);
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void E(boolean z10) {
        ph0 ph0Var = this.v0;
        if (ph0Var == null || this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z10 || ph0Var.getAnimatedDrawable().b0 >= 20) {
            ph0Var.getAnimatedDrawable().P(this.Z1 ? 50 : 100);
        } else {
            ph0Var.getAnimatedDrawable().P(0);
        }
        ph0Var.getAnimatedDrawable().start();
    }

    public final boolean E0() {
        eq0 eq0Var = this.b0;
        if (eq0Var != null && eq0Var.g()) {
            return true;
        }
        hq0 hq0Var = this.c0;
        return hq0Var != null && hq0Var.f;
    }

    public final void E1() {
        if (D0()) {
            post(new fp0(this, 13));
            return;
        }
        nr0 nr0Var = this.K;
        if (nr0Var != null) {
            nr0Var.f();
        }
        ts0 ts0Var = this.N;
        if (ts0Var != null) {
            ts0Var.f();
        }
        ts0 ts0Var2 = this.O;
        if (ts0Var2 != null) {
            ts0Var2.f();
        }
        us0 us0Var = this.M;
        if (us0Var != null) {
            us0Var.X(false);
        }
        ts0 ts0Var3 = this.P;
        if (ts0Var3 != null) {
            ts0Var3.f();
        }
        ps0 ps0Var = this.Q;
        if (ps0Var != null) {
            ps0Var.f();
        }
        wr0 wr0Var = this.R;
        if (wr0Var != null) {
            wr0Var.f();
        }
        qr0 qr0Var = this.f0;
        if (qr0Var != null) {
            qr0Var.f();
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ((ft0) it.next()).c.f();
        }
    }

    public final void F(int i7) {
        int i10;
        bs0 g02 = g0(this.s1);
        this.s = -1;
        if (g02 != null) {
            g02.h.C0();
            this.t1 = i7;
            g02.n.setVisibility(0);
            if (z0(this.s1)) {
                g02.n.setAdapter(A1(this.s1));
            } else {
                g02.n.setAdapter(this.L);
            }
            as0 as0Var = g02.n;
            int paddingLeft = as0Var.getPaddingLeft();
            as0 as0Var2 = g02.n;
            int j02 = j0(g02.F);
            as0Var2.h3 = j02;
            int paddingRight = g02.n.getPaddingRight();
            as0 as0Var3 = g02.n;
            int i02 = i0(I0());
            as0Var3.i3 = i02;
            as0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.r.y1(i7);
            g02.n.a0();
            int i11 = 0;
            while (true) {
                bs0[] bs0VarArr = this.n0;
                if (i11 >= bs0VarArr.length) {
                    break;
                }
                bs0 bs0Var = bs0VarArr[i11];
                if (bs0Var != null && ((i10 = bs0Var.F) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.Z3(bs0VarArr[i11].h);
                }
                i11++;
            }
            int i12 = 1;
            this.r1 = true;
            if (this.s1 == 0) {
                this.w1[0].g(true);
            }
            this.q1 = 0.0f;
            j1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new cr0(this, g02, i12));
            ofFloat.addListener(new ki.i2(this, z0(g02.F) ? 1 : 0, i7, 2));
            ofFloat.setInterpolator(lr.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean F0(int i7) {
        return i7 == 7 ? this.G1.Y() : (G0() || i7 == 0 || z0(i7) || i7 == 2 || i7 == 5 || i7 == 6 || i7 == 11 || i7 == 10 || i7 == 13 || i7 == 14 || i7 == 15) ? false : true;
    }

    public final void F1(bs0 bs0Var, boolean z10) {
        boolean z11 = bs0Var.b && this.d;
        hj0 fastScroll = bs0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = bs0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            bs0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<hj0, Float>) property, fastScroll.getAlpha(), 1.0f);
            bs0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<hj0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new org.telegram.ui.on(fastScroll));
        bs0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public final void G() {
        int i7 = this.d2;
        int i10 = this.p2;
        p1((org.telegram.messenger.g0.L(6.666f) + i7) - w2, this.S0);
        int i11 = i7 + i10;
        p1(i11, this.L0);
        p1(i11, this.E0);
        p1(org.telegram.messenger.g0.L(52.0f) + i7 + i10, this.N0);
        p1(org.telegram.messenger.g0.L(4.0f) + i7 + i10, this.M0);
        p1(org.telegram.messenger.g0.L(48.0f) + i7 + i10, this.c0);
        if (this.l2 != i10) {
            this.l2 = i10;
            Runnable runnable = this.k2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean G0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void G1() {
        org.telegram.ui.ActionBar.r0 r0Var = this.w0;
        if (r0Var == null) {
            return;
        }
        boolean z10 = this.y1.getMessagesController().G2(this.m1) || u0();
        r0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && r0Var.getBackground() != null) {
            r0Var.setBackground(null);
            return;
        }
        if (z10 || r0Var.getBackground() != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(s0(i7), 5, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        r0Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(r0Var, h02, null, M, this.I1);
    }

    public final boolean H() {
        boolean B0 = B0();
        long j3 = this.m1;
        org.telegram.ui.ActionBar.h2 h2Var = this.y1;
        if (B0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).c2(Long.valueOf(j3));
            return c22 != null && c22.bot && c22.bot_can_edit;
        }
        if (I0()) {
            return true;
        }
        return h2Var != null && h2Var.getMessagesController().R1().h(j3);
    }

    public boolean H0() {
        return false;
    }

    public final void H1() {
        eq0 eq0Var = this.b0;
        if (eq0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.d2;
            cs csVar = this.S0;
            eq0Var.setPaddingTop(L + (csVar != null ? (int) csVar.d(org.telegram.messenger.g0.L(7.0f)) : 0));
        }
    }

    public boolean I() {
        return !(this instanceof z20);
    }

    public boolean I0() {
        return false;
    }

    public final void I1(boolean z10) {
        eq0 eq0Var;
        hq0 hq0Var;
        R(true, true);
        ph0 ph0Var = this.v0;
        if (ph0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.Y0 && (((eq0Var = this.b0) == null || !eq0Var.g()) && ((hq0Var = this.c0) == null || !hq0Var.f))) {
            f10 = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        ph0Var.setAlpha(f10);
        if (z10) {
            E(k0(1.0f) > 0.5f);
        } else if (this.A0 == 2) {
            E(this.s0 > 0.1f);
        } else {
            E(this.r0 < 0.1f);
        }
    }

    public final boolean J() {
        bs0 bs0Var;
        bs0[] bs0VarArr = this.n0;
        if (bs0VarArr != null && (bs0Var = bs0VarArr[0]) != null) {
            boolean z02 = z0(bs0Var.F);
            int i7 = this.p1[z02 ? 1 : 0];
            if (i7 != h0(z02 ? 1 : 0, i7, true)) {
                return true;
            }
        }
        return false;
    }

    public final void J1(bs0 bs0Var) {
        boolean b12 = bs0Var.h.b1();
        if (b12) {
            bs0Var.h.setSectionsDrawBackground(this.c2);
        }
        bs0Var.setDrawPageBackground((!this.c2 || b12 || bs0Var.F == 15) ? false : true);
        if (bs0Var.F != 15) {
            bs0Var.setClipToOutline(false);
            bs0Var.setBackground(null);
            bs0Var.setWallpaper(null);
            return;
        }
        Drawable drawable = bs0Var.P;
        if (drawable == null) {
            drawable = bs0Var.getBackground();
        }
        Drawable e10 = hi.w5.e(drawable, this.y1.getCurrentAccount(), this.m1, org.telegram.ui.ActionBar.n6.I.q());
        if (this.c2) {
            bs0Var.setBackground(null);
            bs0Var.setClipToOutline(false);
            bs0Var.setWallpaper(e10);
        } else {
            bs0Var.setWallpaper(null);
            bs0Var.setBackground(e10);
            bs0Var.setOutlineProvider(new bg.q0(15));
            bs0Var.setClipToOutline(true);
        }
    }

    public final boolean K() {
        bs0 bs0Var;
        bs0[] bs0VarArr = this.n0;
        if (bs0VarArr == null || (bs0Var = bs0VarArr[0]) == null) {
            return false;
        }
        if (this.n1 && z0(bs0Var.F)) {
            return false;
        }
        boolean z02 = z0(bs0VarArr[0].F);
        int i7 = this.p1[z02 ? 1 : 0];
        return i7 != h0(z02 ? 1 : 0, i7, false);
    }

    public final boolean K0() {
        if (H() && ((getClosestTab() == 8 || getClosestTab() == 13 || J0(getClosestTab())) && this.F1)) {
            return false;
        }
        eq0 eq0Var = this.b0;
        if (eq0Var != null && eq0Var.g()) {
            return false;
        }
        hq0 hq0Var = this.c0;
        return ((hq0Var != null && hq0Var.f) || this.r1 || this.j1) ? false : true;
    }

    public final void K1(bs0 bs0Var) {
        int i7 = bs0Var.F;
        boolean z10 = i7 == 0 || z0(i7);
        FrameLayout.LayoutParams d = c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, z10 ? 0.0f : 12.0f, (z10 ? 8 : 12) + 48, z10 ? 0.0f : 12.0f, z10 ? 0.0f : 12.0f);
        d.topMargin = n0(bs0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = bs0Var.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        bs0Var.s.setLayoutParams(d);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        dq0 dq0Var;
        or0 or0Var;
        eq0 eq0Var;
        bs0[] bs0VarArr = this.n0;
        int length = bs0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            bs0 bs0Var = bs0VarArr[i7];
            if (bs0Var != null && bs0Var.getVisibility() == 0) {
                if (bs0Var.P != null) {
                    RectF rectF2 = this.j2;
                    if (jh.k.c(bs0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        bs0Var.h(canvas);
                        canvas.restore();
                    }
                }
                if (bs0Var.F == 14 && (eq0Var = this.b0) != null && eq0Var.getParent() == bs0Var) {
                    for (View view : eq0Var.h.getViewPages()) {
                        if ((view instanceof bi.j6) && view.getVisibility() == 0) {
                            bi.c6 c6Var = ((bi.j6) view).f;
                            ih.d.a(c6Var, canvas, rectF, c6Var, viewGroup);
                        }
                    }
                } else {
                    ck0 currentListView = (bs0Var.F == 12 && (or0Var = this.W) != null && or0Var.getParent() == bs0Var) ? or0Var.a.A0 : (bs0Var.F == 13 && (dq0Var = this.a0) != null && dq0Var.getParent() == bs0Var) ? dq0Var.getCurrentListView() : bs0Var.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        ih.d.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(int i7, int i10, int i11, boolean z10) {
        vs0[] vs0VarArr = this.w1;
        vs0VarArr[i7].a.clear();
        vs0VarArr[i7].b[0].clear();
        vs0VarArr[i7].b[1].clear();
        vs0 vs0Var = vs0VarArr[i7];
        vs0Var.j[0] = i10;
        vs0Var.i[0] = false;
        vs0Var.l = false;
        vs0Var.m = i11;
        vs0Var.n = (vs0Var.e() - i11) - 1;
        vs0 vs0Var2 = vs0VarArr[i7];
        if (vs0Var2.n < 0) {
            vs0Var2.n = 0;
        }
        vs0Var2.k = i10;
        vs0Var2.o = true;
        vs0Var2.g = false;
        vs0Var2.p++;
        bs0 g02 = g0(i7);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (!z10) {
            return;
        }
        int i12 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i12 >= bs0VarArr.length) {
                return;
            }
            bs0 bs0Var = bs0VarArr[i12];
            if (bs0Var.F == i7) {
                bs0Var.x.h1(Math.min(vs0VarArr[i7].e() - 1, vs0VarArr[i7].m), 0);
            }
            i12++;
        }
    }

    public final void L1(boolean z10) {
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i7 >= bs0VarArr.length) {
                return;
            }
            int childCount = bs0VarArr[i7].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = bs0VarArr[i7].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.p7) {
                    ((org.telegram.ui.Cells.p7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.i2) {
                    ((org.telegram.ui.Cells.i2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) childAt).c0(false, z10);
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
        gt0 gt0Var;
        ArrayList arrayList;
        int i7;
        int i10;
        Bitmap bitmap;
        bs0 g02 = g0(0);
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
                gt0Var = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new jg.j0((FrameLayout) gt0Var, view, (View) g02, (Object) bitmap2, 2)).start();
                g02.h.setAlpha(0.0f);
                g02.h.animate().alpha(1.0f).setUpdateListener(new e60(g02, 21)).setDuration(200L).start();
                ys0 ys0Var = gt0Var.x1;
                int[] iArr = ys0Var.c;
                arrayList = ys0Var.n[0].a;
                vs0[] vs0VarArr = gt0Var.w1;
                vs0 vs0Var = vs0VarArr[0];
                int[] iArr2 = vs0Var.f;
                iArr2[1] = 0;
                i7 = vs0Var.q;
                if (i7 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i7 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                vs0Var.h = false;
                long j3 = gt0Var.m1;
                L0(0, !org.telegram.messenger.n5.C(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                M0(false);
                gt0Var.G1.W();
                boolean C = org.telegram.messenger.n5.C(j3);
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
                    vs0 vs0Var2 = vs0VarArr[0];
                    int i11 = vs0Var2.q;
                    if (i11 == 0) {
                        vs0Var2.a(fjVar, 0, false, C);
                    } else if (i11 == 1) {
                        if (org.telegram.messenger.fj.S3(fjVar.k)) {
                            vs0VarArr[0].a(fjVar, 0, false, C);
                        }
                    } else if (!org.telegram.messenger.fj.S3(fjVar.k)) {
                        vs0VarArr[0].a(fjVar, 0, false, C);
                    }
                }
            }
        }
        gt0Var = this;
        ys0 ys0Var2 = gt0Var.x1;
        int[] iArr3 = ys0Var2.c;
        arrayList = ys0Var2.n[0].a;
        vs0[] vs0VarArr2 = gt0Var.w1;
        vs0 vs0Var3 = vs0VarArr2[0];
        int[] iArr22 = vs0Var3.f;
        iArr22[1] = 0;
        i7 = vs0Var3.q;
        if (i7 != 0) {
        }
        vs0Var3.h = false;
        long j32 = gt0Var.m1;
        L0(0, !org.telegram.messenger.n5.C(j32) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        M0(false);
        gt0Var.G1.W();
        boolean C2 = org.telegram.messenger.n5.C(j32);
        while (i10 < arrayList.size()) {
        }
    }

    public final void M0(boolean z10) {
        long j3 = this.G;
        if (j3 != 0 || G0()) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            int i10 = t2[i7];
            vs0[] vs0VarArr = this.w1;
            if (vs0VarArr[i10].h && !z10) {
                return;
            }
            long j10 = this.m1;
            if (org.telegram.messenger.n5.C(j10)) {
                return;
            }
            vs0VarArr[i10].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i10 == 0) {
                int i11 = vs0VarArr[i10].q;
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
            org.telegram.ui.ActionBar.h2 h2Var = this.y1;
            tL_messages_getSearchResultsPositions.peer = h2Var.getMessagesController().l1(j10);
            if (j3 != 0 && h2Var.getUserConfig().e() == j10) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = h2Var.getMessagesController().l1(j3);
            }
            ConnectionsManager.getInstance(h2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(h2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.de(this, vs0VarArr[i10].p, i10, 2)), h2Var.getClassGuid());
        }
    }

    public final void M1(float f10) {
        org.telegram.ui.ActionBar.r0 r0Var = this.p0;
        if (r0Var == null) {
            return;
        }
        bs0[] bs0VarArr = this.n0;
        bs0 bs0Var = bs0VarArr[1];
        float f11 = 0.0f;
        if (bs0Var != null && bs0Var.F == 11) {
            f11 = 0.0f + f10;
        }
        bs0 bs0Var2 = bs0VarArr[0];
        if (bs0Var2 != null && bs0Var2.F == 11) {
            f11 += 1.0f - f10;
        }
        r0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        r0Var.setScaleX(f12);
        r0Var.setScaleY(f12);
        r0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
    }

    public final void N() {
        dr0 dr0Var = this.L0;
        if (dr0Var.d(dr0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = dr0Var.getFirstTabId();
        dr0Var.setInitialTabId(firstTabId);
        this.n0[0].F = firstTabId;
        B1(false);
    }

    public final void N0(int i7) {
        int i10;
        int i11 = 2;
        vs0[] vs0VarArr = this.w1;
        if (i7 == 0) {
            int i12 = vs0VarArr[0].q;
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
        vs0VarArr[i7].g = true;
        org.telegram.ui.ActionBar.h2 h2Var = this.y1;
        h2Var.getMediaDataController().Q0(this.m1, 50, 0, vs0VarArr[i7].k, i10, this.G, 1, h2Var.getClassGuid(), vs0VarArr[i7].p, null, null);
    }

    public final void N1() {
        org.telegram.ui.ActionBar.r0 r0Var = this.p0;
        if (r0Var == null) {
            return;
        }
        bs0 bs0Var = this.n0[1];
        boolean z10 = bs0Var != null && bs0Var.F == 11;
        if (z10) {
            r0Var.setVisibility(0);
        }
        r0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new pp0(0, this, z10)).setDuration(420L).setInterpolator(lr.h).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(bs0 bs0Var, ck0 ck0Var, v4.c0 c0Var) {
        int i7;
        int i10;
        boolean[] zArr;
        v4.f1 K;
        fi.h6 h6Var;
        if (this.r1 || this.N1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (ck0Var.getFastScroll() == null || !ck0Var.getFastScroll().n || currentTimeMillis - bs0Var.a >= 300) {
            bs0Var.a = currentTimeMillis;
            if (this.Y0 && this.X0 && bs0Var.F != 11) {
                return;
            }
            int i11 = 7;
            if (bs0Var.F == 7) {
                return;
            }
            int L0 = c0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(c0Var.N0() - L0) + 1;
            int b10 = ck0Var.getAdapter() == null ? 0 : ck0Var.getAdapter().b();
            int i12 = bs0Var.F;
            int[] iArr = this.p1;
            vs0[] vs0VarArr = this.w1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                b10 = vs0VarArr[i12].d() + vs0VarArr[i12].a.size();
                vs0 vs0Var = vs0VarArr[i12];
                if (vs0Var.h && vs0Var.e.size() > 2 && bs0Var.F == 0 && vs0VarArr[i12].a.size() != 0) {
                    float f10 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((ck0Var.getMeasuredHeight() / (ck0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((gs0) vs0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((gs0) vs0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > b10 && L0 - b10 > measuredHeight) || ((i7 = L0 + abs) < vs0VarArr[i12].m && vs0VarArr[0].m - i7 > measuredHeight)) {
                        org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, i12, ck0Var, 20);
                        this.N1 = b0Var;
                        org.telegram.messenger.g0.g3(b0Var);
                        return;
                    }
                }
            }
            int i13 = bs0Var.F;
            if (i13 == 7) {
                return;
            }
            if (z0(i13)) {
                dt0 z12 = z1(bs0Var.F);
                if (z12 == null || (h6Var = z12.s) == null || L0 + abs <= h6Var.i() - iArr[1]) {
                    return;
                }
                z12.P();
                return;
            }
            int i14 = bs0Var.F;
            if (i14 == 6) {
                if (abs > 0) {
                    ur0 ur0Var = this.S;
                    boolean z10 = ur0Var.h;
                    ArrayList arrayList = ur0Var.d;
                    if (z10 || ur0Var.e || arrayList.isEmpty() || L0 + abs < b10 - 5) {
                        return;
                    }
                    ur0Var.E(((TLRPC.Chat) i5.c.h(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.y1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < bs0Var.h.getChildCount(); i16++) {
                    View childAt = bs0Var.h.getChildAt(i16);
                    bs0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                v4.i0 adapter = bs0Var.h.getAdapter();
                ss0 ss0Var = this.V;
                if (adapter != ss0Var) {
                    if (i15 + 1 >= h2Var.getMessagesController().I1().i.size()) {
                        h2Var.getMessagesController().I1().g(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < ss0Var.h.size() + ss0Var.e.size() || ss0Var.s || ss0Var.r) {
                        return;
                    }
                    ss0Var.r = true;
                    ss0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > b10 - i17 || vs0VarArr[i18].o) {
                vs0 vs0Var2 = vs0VarArr[i18];
                if (!vs0Var2.g) {
                    if (i14 == 0) {
                        int i19 = vs0VarArr[0].q;
                        if (i19 == 1) {
                            i10 = 6;
                        } else {
                            if (i19 != 2) {
                                i10 = 0;
                            }
                            i10 = i11;
                        }
                        zArr = vs0Var2.i;
                        if (zArr[0]) {
                            vs0Var2.g = true;
                            h2Var.getMediaDataController().Q0(this.m1, 50, vs0VarArr[i18].j[0], 0, i10, this.G, 1, h2Var.getClassGuid(), vs0VarArr[i18].p, null, null);
                        } else if (this.f1 != 0 && !zArr[1]) {
                            vs0Var2.g = true;
                            h2Var.getMediaDataController().Q0(this.f1, 50, vs0VarArr[i18].j[1], 0, i10, this.G, 1, h2Var.getClassGuid(), vs0VarArr[i18].p, null, null);
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
                        zArr = vs0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i20 = vs0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.K.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                vs0 vs0Var3 = vs0VarArr[i18];
                if (!vs0Var3.g && !vs0Var3.l && !vs0Var3.o) {
                    N0(bs0Var.F);
                }
            }
            bs0 bs0Var2 = this.n0[0];
            if (bs0Var2.h == ck0Var) {
                int i21 = bs0Var2.F;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = ck0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.q7;
                    org.telegram.ui.Cells.v0 v0Var = this.N0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.i2) {
                            v0Var.h0(((org.telegram.ui.Cells.i2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                        org.telegram.messenger.fj fjVar = q7Var.e <= 0 ? null : q7Var.b[0];
                        if (fjVar != null) {
                            v0Var.h0(fjVar.k.date, false, true);
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
        boolean z10;
        fi.h6 h6Var;
        boolean B0 = B0();
        org.telegram.ui.ActionBar.r0 r0Var = this.z0;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.y0;
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
            SparseArray[] sparseArrayArr = this.c1;
            if (i7 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[0].valueAt(i7);
            qr0 qr0Var = this.f0;
            if (qr0Var != null && (h6Var = qr0Var.s) != null && !h6Var.m(fjVar.e1())) {
                z10 = true;
                break;
            }
            i7++;
        }
        if (r0Var2 != null) {
            r0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (r0Var != null) {
            r0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean P(MotionEvent motionEvent) {
        dq0 dq0Var;
        bs0[] bs0VarArr = this.n0;
        int i7 = bs0VarArr[0].F;
        if (i7 == 13 && (dq0Var = this.a0) != null) {
            View currentView = dq0Var.n.getCurrentView();
            if (currentView instanceof gi.m) {
                gi.m mVar = (gi.m) currentView;
                gi.h hVar = mVar.w;
                gi.e eVar = mVar.f;
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
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - mVar.getY());
                                int i10 = mVar.V;
                                Rect rect = mVar.W;
                                mVar.T = -1;
                                int top = y10 - eVar.getTop();
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
                                    mVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.f3.y(2.0f, mVar.R, 1.0f, 1.0f) : (1.0f - mVar.R) / 0.5f));
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
        if ((i7 == 0 || z0(i7)) && getParent() != null) {
            if (!this.r1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        bs0VarArr[0].h.I0(false);
                        bs0VarArr[0].h.cancelLongPress();
                        bs0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - bs0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - bs0VarArr[0].getY());
                        int i16 = this.x;
                        this.s = -1;
                        int top2 = y11 - bs0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F == 1) {
                            top2 = 0;
                        }
                        for (int i17 = 0; i17 < bs0VarArr[0].h.getChildCount(); i17++) {
                            View childAt2 = bs0VarArr[0].h.getChildAt(i17);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i16, top2)) {
                                bs0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.G1.Y() && this.s == -1) {
                            this.s = (int) (((this.p1[z0(bs0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i16 / bs0VarArr[0].h.getMeasuredWidth(), 0.0f))) + bs0VarArr[0].x.L0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - bs0VarArr[0].getY() > this.d2) {
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
                        t1(z12);
                    }
                    if (this.a) {
                        boolean z13 = this.r;
                        if ((!z13 || this.n >= 1.0f) && (z13 || this.n <= 1.0f)) {
                            this.q1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.f3.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.q1 = 0.0f;
                        }
                        float f11 = this.q1;
                        if (f11 == 1.0f || f11 == 0.0f) {
                            v4.i0 z14 = z0(this.s1) ? z1(this.s1) : this.K;
                            if (this.q1 == 1.0f) {
                                int i21 = this.t1;
                                int ceil2 = (((int) Math.ceil(this.s / this.t1)) * i21) + ((int) ((this.C1 / (bs0VarArr[0].h.getMeasuredWidth() - ((int) (bs0VarArr[0].h.getMeasuredWidth() / this.t1)))) * (i21 - 1)));
                                if (ceil2 >= z14.b()) {
                                    ceil2 = z14.b() - 1;
                                }
                                this.s = ceil2;
                            }
                            d0();
                            if (this.q1 == 0.0f) {
                                this.r = !this.r;
                            }
                            t1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        bs0VarArr[0].h.invalidate();
                        bs0 bs0Var = bs0VarArr[0];
                        if (bs0Var.G != null) {
                            bs0Var.invalidate();
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
    public void P1(boolean z10) {
        int i7;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i10;
        boolean I0;
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
        tr0 tr0Var;
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
        eq0 eq0Var;
        char c10;
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
        ys0 ys0Var;
        dr0 dr0Var = this.L0;
        if (dr0Var == null) {
            return;
        }
        boolean z20 = !this.G1.t() ? false : z10;
        boolean z21 = (this.W == null || (ys0Var = this.x1) == null || !ys0Var.f) ? false : true;
        long j3 = this.m1;
        int i21 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.h2 h2Var = this.y1;
        if (i21 <= 0 || h2Var == null) {
            i7 = 1;
            user = null;
        } else {
            i7 = 1;
            user = h2Var.getMessagesController().c2(Long.valueOf(j3));
        }
        boolean z22 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i7 : false;
        int i22 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.h1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z22) ? 0 : i7;
        int i23 = ((org.telegram.messenger.n5.E(j3) || org.telegram.messenger.n5.z(j3)) && !org.telegram.messenger.n5.C(j3) && (((userFull = this.h1) != null && userFull.stories_pinned_available) || (((chatFull = this.g1) != null && chatFull.stories_pinned_available) || I0())) && y0()) ? i7 : 0;
        eq0 eq0Var2 = this.b0;
        int i24 = i22;
        boolean z23 = (eq0Var2 == null || (((userFull3 = this.h1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.g1) == null || chatFull3.stargifts_count <= 0))) ? false : i7;
        int i25 = i23;
        TLRPC.ChatFull chatFull4 = this.g1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.h1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z20;
                int i26 = this.U1 == dr0Var.o0 ? i7 : 0;
                boolean z25 = (i25 == 0 || i24 != 0) ? i7 : false;
                int i27 = i26;
                i10 = z25 == dr0Var.d(8) ? i27 + 1 : i27;
                if (z22 != dr0Var.d(13)) {
                    i10++;
                }
                if (G0() != dr0Var.d(8)) {
                    i10++;
                }
                if (z23 == dr0Var.d(14) || (eq0Var2 != null && z23 && this.T1 != eq0Var2.getLastEmojisHash())) {
                    i10++;
                }
                I0 = I0();
                int i28 = 14;
                tr0 tr0Var2 = this.d0;
                int[] iArr2 = this.a1;
                if (I0) {
                    z11 = z23;
                    int i29 = i10;
                    int i30 = (tr0Var2.d == null ? i7 : false) == dr0Var.d(7) ? i29 + 1 : i29;
                    if (iArr2[0] <= 0) {
                        z18 = i7;
                        i17 = 0;
                    } else {
                        z18 = false;
                        i17 = 0;
                    }
                    int i31 = i30;
                    int i32 = z18 == dr0Var.d(i17) ? i31 + 1 : i31;
                    if (iArr2[i7] <= 0) {
                        z19 = i7;
                        i18 = z19;
                    } else {
                        i18 = i7;
                        z19 = false;
                    }
                    int i33 = i32;
                    int i34 = z19 == dr0Var.d(i18) ? i33 + 1 : i33;
                    if (org.telegram.messenger.n5.C(j3)) {
                        i19 = i34;
                    } else {
                        int i35 = i34;
                        int i36 = (iArr2[3] <= 0) == dr0Var.d(3) ? i35 + 1 : i35;
                        i19 = (iArr2[4] <= 0) == dr0Var.d(4) ? i36 + 1 : i36;
                    }
                    int i37 = i20;
                    int i38 = (iArr2[2] <= 0) == dr0Var.d(2) ? i37 + 1 : i37;
                    int i39 = (iArr2[5] <= 0) == dr0Var.d(5) ? i38 + 1 : i38;
                    int i40 = (iArr2[6] <= 0) == dr0Var.d(6) ? i39 + 1 : i39;
                    boolean z26 = !this.T.d.isEmpty();
                    int i41 = i40;
                    i10 = z26 != dr0Var.d(10) ? i41 + 1 : i41;
                    z12 = x0() && !h2Var.getMessagesController().I1().b && h2Var.getMessagesController().I1().e();
                    z13 = z26;
                    if (z12 != dr0Var.d(11)) {
                        i10++;
                    }
                    if (z21 != dr0Var.d(12)) {
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
                        transitionSet.addTransition(new org.telegram.ui.ActionBar.j0(2));
                        z14 = z21;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(dr0Var.getTabsContainer(), transitionSet);
                        dr0Var.V = dr0Var.w;
                        dr0Var.W = dr0Var.x;
                    } else {
                        iArr = iArr2;
                        z14 = z21;
                    }
                    SparseArray f10 = dr0Var.f();
                    if (i10 > 3) {
                        f10 = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (G0()) {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                        arrayList2.add(new Pair(8, org.telegram.messenger.gd.M0(2131746440, null)));
                        dr0Var.c0 = 420L;
                    } else {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                    }
                    if (i24 != 0) {
                        arrayList2.add(new Pair(8, org.telegram.messenger.gd.M0(2131746497, str)));
                    } else if ((org.telegram.messenger.n5.E(j3) || org.telegram.messenger.n5.z(j3)) && !org.telegram.messenger.n5.C(j3) && ((((userFull2 = this.h1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.g1) != null && chatFull2.stories_pinned_available) || I0())) && y0())) {
                        if (A0()) {
                            arrayList2.add(new Pair(9, org.telegram.messenger.gd.M0(2131746532, null)));
                            tr0Var = tr0Var2;
                            dr0Var.c0 = 420L;
                        } else {
                            tr0Var = tr0Var2;
                            arrayList2.add(new Pair(8, org.telegram.messenger.gd.M0(2131746440, null)));
                            if (I0()) {
                                arrayList2.add(new Pair(9, org.telegram.messenger.gd.M0(2131746532, null)));
                            }
                        }
                        if (z11) {
                            i11 = i21;
                            z17 = z14;
                        } else {
                            String M03 = org.telegram.messenger.gd.M0(2131746481, null);
                            HashMap hashMap = bi.p6.V;
                            di.o8 o8Var = eq0Var2.d;
                            Object obj2 = "";
                            if (o8Var == null) {
                                eq0Var = eq0Var2;
                                str6 = M03;
                                i11 = i21;
                                z17 = z14;
                            } else {
                                ArrayList arrayList3 = o8Var.l;
                                str6 = M03;
                                i11 = i21;
                                z17 = z14;
                                Pair pair = new Pair(Integer.valueOf(org.telegram.messenger.j10.t0), Long.valueOf(eq0Var2.c));
                                if (arrayList3.isEmpty()) {
                                    if (o8Var.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
                                        obj2 = obj;
                                    }
                                    eq0Var = eq0Var2;
                                } else {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList4 = new ArrayList();
                                    int i42 = 0;
                                    while (true) {
                                        eq0Var = eq0Var2;
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
                                        eq0Var2 = eq0Var;
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
                                            spannableStringBuilder2.setSpan(new x5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
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
                                        this.T1 = eq0Var.getLastEmojisHash();
                                    }
                                }
                            }
                            i14 = 2;
                            c10 = 0;
                            CharSequence[] charSequenceArr2 = new CharSequence[i14];
                            charSequenceArr2[c10] = str6;
                            charSequenceArr2[1] = obj2;
                            arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                            this.T1 = eq0Var.getLastEmojisHash();
                        }
                        if (z15) {
                            arrayList2.add(new Pair(13, org.telegram.messenger.gd.M0(2131746497, null)));
                        }
                        int i44 = 2131745207;
                        if (!I0()) {
                            if (z16) {
                                str3 = null;
                                arrayList2.add(new Pair(11, org.telegram.messenger.gd.M0(2131745712, null)));
                            } else {
                                str3 = null;
                            }
                            tr0 tr0Var3 = tr0Var;
                            if (tr0Var3.d != null) {
                                arrayList2.add(new Pair(7, org.telegram.messenger.gd.M0(2131749237, str3)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && tr0Var3.d == null) {
                                    arrayList2.add(new Pair(0, org.telegram.messenger.gd.M0(2131745211, null)));
                                } else {
                                    str4 = null;
                                    arrayList2.add(new Pair(0, org.telegram.messenger.gd.M0(2131745212, null)));
                                    if (z17) {
                                        arrayList2.add(new Pair(12, org.telegram.messenger.gd.M0(2131745698, str4)));
                                        org.telegram.messenger.mp.g1().edit().putInt("savedhint", 3).apply();
                                    }
                                    if (iArr[1] <= 0) {
                                        str5 = null;
                                        arrayList2.add(new Pair(1, org.telegram.messenger.gd.M0(2131745219, null)));
                                    } else {
                                        str5 = null;
                                    }
                                    if (org.telegram.messenger.n5.C(j3)) {
                                        if (iArr[3] > 0) {
                                            arrayList2.add(new Pair(3, org.telegram.messenger.gd.M0(2131745215, str5)));
                                        }
                                        if (iArr[4] > 0) {
                                            arrayList2.add(new Pair(4, org.telegram.messenger.gd.M0(2131745210, str5)));
                                        }
                                        if (iArr[8] > 0) {
                                            arrayList2.add(new Pair(15, org.telegram.messenger.gd.M0(2131745208, str5)));
                                        }
                                    } else if (iArr[4] > 0) {
                                        arrayList2.add(new Pair(4, org.telegram.messenger.gd.M0(2131745210, str5)));
                                    }
                                    if (iArr[2] > 0) {
                                        arrayList2.add(new Pair(2, org.telegram.messenger.gd.M0(2131745207, str5)));
                                    }
                                    if (iArr[5] > 0) {
                                        arrayList2.add(new Pair(5, org.telegram.messenger.gd.M0(2131745218, str5)));
                                    }
                                    if (iArr[6] > 0) {
                                        arrayList2.add(new Pair(6, org.telegram.messenger.gd.M0(2131745217, str5)));
                                    }
                                    if (z13) {
                                        arrayList2.add(new Pair(10, org.telegram.messenger.gd.M0(i11 > 0 ? 2131745123 : 2131745119, null)));
                                    }
                                }
                            }
                            str4 = null;
                            if (z17) {
                            }
                            if (iArr[1] <= 0) {
                            }
                            if (org.telegram.messenger.n5.C(j3)) {
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
                        if (dr0Var.o0) {
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
                                            M0 = org.telegram.messenger.gd.M0(2131745211, null);
                                        } else if (i45 == 1) {
                                            M0 = org.telegram.messenger.gd.M0(2131745219, null);
                                        } else if (i45 == 2) {
                                            M0 = org.telegram.messenger.gd.M0(i44, null);
                                        } else if (i45 == 3) {
                                            M0 = org.telegram.messenger.gd.M0(2131745215, null);
                                        } else if (i45 == 4) {
                                            M0 = org.telegram.messenger.gd.M0(2131745210, null);
                                        } else if (i45 != 5) {
                                            if (i45 == 8) {
                                                M02 = org.telegram.messenger.gd.M0(2131746440, null);
                                            } else if (i45 != i28) {
                                                str2 = null;
                                                arrayList2.add(new Pair(valueOf2, str2));
                                                i45++;
                                                i44 = 2131745207;
                                                i28 = 14;
                                            } else {
                                                M02 = org.telegram.messenger.gd.M0(2131746481, null);
                                            }
                                            str2 = M02;
                                            arrayList2.add(new Pair(valueOf2, str2));
                                            i45++;
                                            i44 = 2131745207;
                                            i28 = 14;
                                        } else {
                                            M0 = org.telegram.messenger.gd.M0(2131745218, null);
                                        }
                                        str2 = M0;
                                        arrayList2.add(new Pair(valueOf2, str2));
                                        i45++;
                                        i44 = 2131745207;
                                        i28 = 14;
                                    }
                                }
                                i45++;
                                i44 = 2131745207;
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
                                    if (!dr0Var.d(((Integer) pair2.first).intValue())) {
                                        dr0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, f10);
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
                    tr0Var = tr0Var2;
                    if (z11) {
                    }
                    if (z15) {
                    }
                    int i442 = 2131745207;
                    if (!I0()) {
                    }
                    if (dr0Var.o0) {
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
                this.U1 = dr0Var.o0;
                dr0Var.c();
                Y0();
                S();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z20;
        if (this.U1 == dr0Var.o0) {
        }
        if (i25 == 0) {
        }
        int i272 = i26;
        if (z25 == dr0Var.d(8)) {
        }
        if (z22 != dr0Var.d(13)) {
        }
        if (G0() != dr0Var.d(8)) {
        }
        if (z23 == dr0Var.d(14)) {
        }
        i10++;
        I0 = I0();
        int i282 = 14;
        tr0 tr0Var22 = this.d0;
        int[] iArr22 = this.a1;
        if (I0) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.U1 = dr0Var.o0;
        dr0Var.c();
        Y0();
        S();
    }

    public final void Q() {
        R(false, false);
    }

    public final Boolean Q1(View view, View view2) {
        if (this.r1) {
            return null;
        }
        bs0[] bs0VarArr = this.n0;
        bs0 bs0Var = bs0VarArr[0];
        if (bs0Var == null) {
            return null;
        }
        int i7 = bs0Var.F;
        this.s1 = i7;
        boolean z02 = z0(i7);
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
                org.telegram.messenger.bz.B(h02);
            } else if (m0(bs0VarArr[0].F) >= 5 || J0(bs0VarArr[0].F)) {
                org.telegram.messenger.bz.F(h02);
            }
            F(h02);
        }
        return Boolean.valueOf(h02 != h0(z02 ? 1 : 0, h02, true));
    }

    public final void R(boolean z10, boolean z11) {
        if (this.I == null) {
            return;
        }
        int closestTab = getClosestTab();
        boolean z12 = false;
        boolean z13 = this.q2 && !E0();
        org.telegram.ui.ActionBar.r0 r0Var = this.q0;
        if (r0Var != null) {
            ((org.telegram.ui.ActionBar.h5) r0Var).Z(z13 && I() && (F0(closestTab) || (closestTab == 11 && x0())), z10);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.J;
        if (h5Var != null) {
            if (z13 && I() && !A0() && v0(closestTab)) {
                z12 = true;
            }
            h5Var.Z(z12, z11);
        }
    }

    public final void R0() {
        fi.h6 h6Var;
        fi.h6 h6Var2;
        this.K1.b();
        qr0 qr0Var = this.f0;
        if (qr0Var != null && (h6Var2 = qr0Var.s) != null && h6Var2 != null) {
            h6Var2.z(qr0Var.w);
        }
        cq0 cq0Var = this.h0;
        if (cq0Var != null && (h6Var = cq0Var.s) != null && h6Var != null) {
            h6Var.z(cq0Var.w);
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            et0 et0Var = ((ft0) it.next()).c;
            fi.h6 h6Var3 = et0Var.s;
            if (h6Var3 != null && h6Var3 != null) {
                h6Var3.z(et0Var.w);
            }
        }
    }

    public final Boolean R1(View view, View view2) {
        if (this.r1) {
            return null;
        }
        bs0[] bs0VarArr = this.n0;
        bs0 bs0Var = bs0VarArr[0];
        if (bs0Var == null) {
            return null;
        }
        if (this.n1 && z0(bs0Var.F)) {
            return null;
        }
        int i7 = bs0VarArr[0].F;
        this.s1 = i7;
        boolean z02 = z0(i7);
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
                org.telegram.messenger.bz.B(h02);
            } else if (m0(bs0VarArr[0].F) >= 5 || J0(bs0VarArr[0].F)) {
                org.telegram.messenger.bz.F(h02);
            }
            F(h02);
        }
        return Boolean.valueOf(h02 != h0(z02 ? 1 : 0, h02, false));
    }

    public final void S() {
        float abs;
        bs0[] bs0VarArr = this.n0;
        bs0 bs0Var = bs0VarArr[0];
        if (bs0Var == null || bs0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        hq0 hq0Var = this.c0;
        if (hq0Var != null) {
            char c10 = (!z0(bs0Var.F) || bs0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (bs0VarArr[1].getVisibility() == 0 ? (!z0(bs0VarArr[1].F) || bs0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                hq0Var.setTranslationX(c10 != 0 ? 0.0f : bs0VarArr[0].getMeasuredWidth());
            } else {
                hq0Var.setTranslationX(bs0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(hq0Var.getTranslationX()) / hq0Var.getMeasuredWidth());
            }
            float f11 = 0.0f;
            for (int i7 = 0; i7 < bs0VarArr.length; i7++) {
                if (bs0VarArr[i7].getVisibility() == 0) {
                    lq0 lq0Var = bs0VarArr[i7].h;
                    View childAt = lq0Var.getChildCount() == 0 ? null : lq0Var.getChildAt(0);
                    f11 += Utilities.l(1.0f - (bs0VarArr[i7].getTranslationX() / bs0VarArr[i7].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - lq0Var.getPaddingTop() : lq0Var.getChildCount() == 0 ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
            }
            float l10 = Utilities.l(1.0f - ((-f11) / org.telegram.messenger.g0.N(48.0f)));
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
            hq0Var.setAlpha(l10);
            hq0Var.setScaleX(T1);
            hq0Var.setScaleY(T1);
            hq0Var.setTranslationY(this.O1 + f11);
            f10 = abs;
        }
        U();
        if (this.Y1 != f10) {
            this.Y1 = f10;
            invalidate();
        }
    }

    public final void S0(int i7, View view, org.telegram.messenger.fj fjVar, int i10) {
        String str;
        if (fjVar == null || this.r1) {
            return;
        }
        hq0 hq0Var = this.c0;
        if (hq0Var == null || !hq0Var.f) {
            int i11 = 0;
            i11 = 0;
            String str2 = null;
            if (this.F1) {
                int i12 = 8;
                if (i10 == 8 && !H()) {
                    return;
                }
                char c10 = org.telegram.messenger.fj.B0(fjVar.k) == this.m1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.c1;
                if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                    sparseArrayArr[c10].remove(fjVar.e1());
                    if (!fjVar.s(null, false)) {
                        this.d1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                    if (!fjVar.s(null, false)) {
                        this.d1++;
                    }
                }
                P0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    q1(false);
                } else {
                    o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.o0.setVisibility(this.d1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.r0 r0Var = this.x0;
                    if (r0Var != null) {
                        r0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.w0;
                    if (r0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        r0Var2.setVisibility(i12);
                    }
                    O1();
                }
                this.e1 = false;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.q7) {
                    ((org.telegram.ui.Cells.q7) view).b(0, sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) view).f(sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).e(sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.i2) {
                    ((org.telegram.ui.Cells.i2) view).c(sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.p7) {
                    ((org.telegram.ui.Cells.p7) view).i(sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0, true);
                }
            } else {
                nq0 nq0Var = this.u1;
                vs0[] vs0VarArr = this.w1;
                org.telegram.ui.ActionBar.h2 h2Var = this.y1;
                if (i10 == 0) {
                    vs0 vs0Var = vs0VarArr[i10];
                    int i13 = i7 - vs0Var.m;
                    if (i13 >= 0 && i13 < vs0Var.a.size()) {
                        PhotoViewer.p1().I2(null, h2Var, null);
                        PhotoViewer.p1().a2(vs0VarArr[i10].a, i13, this.m1, this.f1, this.G, nq0Var);
                    }
                } else if (i10 == 2 || i10 == 4) {
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                    }
                } else if (i10 == 5) {
                    PhotoViewer.p1().I2(null, h2Var, null);
                    int indexOf = vs0VarArr[i10].a.indexOf(fjVar);
                    if (indexOf < 0) {
                        PhotoViewer.p1().a2(org.telegram.messenger.f3.i(fjVar), 0, 0L, 0L, 0L, nq0Var);
                    } else {
                        PhotoViewer.p1().a2(vs0VarArr[i10].a, indexOf, this.m1, this.f1, this.G, nq0Var);
                    }
                } else if (i10 == 1) {
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        TLRPC.Document F0 = fjVar.F0();
                        if (i7Var.H) {
                            if (fjVar.x()) {
                                PhotoViewer.p1().I2(null, h2Var, null);
                                int indexOf2 = vs0VarArr[i10].a.indexOf(fjVar);
                                if (indexOf2 < 0) {
                                    PhotoViewer.p1().a2(org.telegram.messenger.f3.i(fjVar), 0, 0L, 0L, 0L, nq0Var);
                                    return;
                                } else {
                                    PhotoViewer.p1().a2(vs0VarArr[i10].a, indexOf2, this.m1, this.f1, this.G, nq0Var);
                                    return;
                                }
                            }
                            org.telegram.messenger.g0.s2(fjVar, h2Var.getParentActivity(), h2Var);
                        } else if (i7Var.G) {
                            h2Var.getFileLoader().f(F0);
                            i7Var.f(true);
                        } else {
                            org.telegram.messenger.fj message = i7Var.getMessage();
                            message.P = true;
                            h2Var.getFileLoader().W(F0, message, 0, 0);
                            i7Var.f(true);
                        }
                    }
                } else if (i10 == 3) {
                    try {
                        TLRPC.WebPage webPage = org.telegram.messenger.fj.n1(fjVar.k) != null ? org.telegram.messenger.fj.n1(fjVar.k).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(fjVar) == null) {
                                    h2Var.createArticleViewer(false).L(fjVar, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                gu.O0(h2Var, fjVar, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.l7) view).F;
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
                    dt0 z12 = z1(i10);
                    fi.h6 h6Var = z12 != null ? z12.s : null;
                    if (h6Var == null) {
                        return;
                    }
                    fi.f9 orCreateStoryViewer = h2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int e12 = fjVar.e1();
                    fi.y6 a10 = fi.y6.a(this.n0[0].h);
                    a10.e = new iy(h6Var, 18);
                    if ((h2Var instanceof ProfileActivity) && ((ProfileActivity) h2Var).s1) {
                        i11 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a10.s += i11;
                    orCreateStoryViewer.I(context, e12, h6Var, a10);
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
        if (!this.j1) {
            return false;
        }
        boolean z10 = this.l1;
        bs0[] bs0VarArr = this.n0;
        if (!z10) {
            if (Math.abs(bs0VarArr[1].getTranslationX()) < 1.0f) {
                bs0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.k1 ? -1 : 1));
                bs0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.i1;
                if (animatorSet != null) {
                }
                this.j1 = false;
            }
            Z0(getTabProgress());
            return this.j1;
        }
        if (Math.abs(bs0VarArr[0].getTranslationX()) < 1.0f) {
            bs0VarArr[0].setTranslationX(0.0f);
            bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth() * (this.k1 ? 1 : -1));
            animatorSet = this.i1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.i1 = null;
            }
            this.j1 = false;
        }
        Z0(getTabProgress());
        return this.j1;
    }

    public final boolean T0(org.telegram.messenger.fj fjVar, View view, int i7, boolean z10) {
        hq0 hq0Var;
        final TL_stories.StoryItem storyItem;
        qr0 qr0Var;
        fi.h6 h6Var;
        final int i10 = 0;
        if (!this.F1) {
            org.telegram.ui.ActionBar.h2 h2Var = this.y1;
            if (h2Var.getParentActivity() != null && fjVar != null && ((hq0Var = this.c0) == null || !hq0Var.f)) {
                org.telegram.messenger.g0.v1(h2Var.getParentActivity().getCurrentFocus());
                long j3 = this.m1;
                int i11 = 8;
                final int i12 = 1;
                if (!z10 || (!(J0(getClosestTab()) || getClosestTab() == 8) || this.F1)) {
                    char c10 = org.telegram.messenger.fj.B0(fjVar.k) == j3 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                    if (!fjVar.s(null, false)) {
                        this.d1++;
                    }
                    this.o0.setVisibility(this.d1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.r0 r0Var = this.x0;
                    if (r0Var != null) {
                        r0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.w0;
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
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.q7) {
                        ((org.telegram.ui.Cells.q7) view).b(i7, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.i2) {
                        ((org.telegram.ui.Cells.i2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) view).i(true, true);
                    }
                    if (!this.F1) {
                        q1(true);
                    }
                    P0(sparseArrayArr[0]);
                    G1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                    p7Var.k(p7Var.n, p7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = fjVar.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean J0 = J0(getClosestTab());
                    y60 J = y60.J(h2Var, view);
                    y60 K = J.K();
                    K.c(R.drawable.ic_ab_back, org.telegram.messenger.gd.M0(2131753754, null), new org.telegram.ui.hq0(J, 27), false);
                    K.k();
                    y60.f(K, getStoriesController().B(j3, true), hashSet, true, new k7((Object) this, (Object) storyItem2, (Object) J, 24), new bi.i2(this, hashSet, storyItem2, J, 11));
                    J.c(R.drawable.menu_album_add, org.telegram.messenger.gd.M0(2131744570, null), new bi.u5(J, K, 10), false);
                    J.k();
                    J.c(R.drawable.msg_select, org.telegram.messenger.gd.M0(2131744554, null), new bi.t4(this, fjVar, view, i7, 29), false);
                    final int i14 = 3;
                    if (J0) {
                        int w12 = w1(getClosestTab());
                        String w10 = getStoriesController().w(w12, j3);
                        J.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.M0(2131744555, null), new jp0(this, w12, i10), false);
                        storyItem = storyItem2;
                        J.c(R.drawable.msg_removefolder, org.telegram.messenger.gd.M0(2131744556, null), new kp0(this, w12, storyItem, w10, 0), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (qr0Var = this.f0) != null && (h6Var = qr0Var.s) != null) {
                            if (h6Var.m(storyItem.id)) {
                                J.c(R.drawable.chats_unpin, org.telegram.messenger.gd.M0(2131744552, null), new Runnable() { // from class: org.telegram.ui.Components.ip0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        gt0 gt0Var = this;
                                        switch (i15) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), gt0Var.I1);
                                                String M0 = org.telegram.messenger.gd.M0(2131751476, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.S = M0;
                                                u1Var.U = org.telegram.messenger.gd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new tp0(gt0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(12));
                                                u1Var.show();
                                                u1Var.i();
                                                break;
                                            case 1:
                                                gt0Var.getClass();
                                                gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                gt0Var.getClass();
                                                gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                gt0.h(gt0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i15 = 2;
                                J.c(R.drawable.chats_pin, org.telegram.messenger.gd.M0(2131744557, null), new Runnable() { // from class: org.telegram.ui.Components.ip0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i152 = i15;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        gt0 gt0Var = this;
                                        switch (i152) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), gt0Var.I1);
                                                String M0 = org.telegram.messenger.gd.M0(2131751476, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.S = M0;
                                                u1Var.U = org.telegram.messenger.gd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new tp0(gt0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(12));
                                                u1Var.show();
                                                u1Var.i();
                                                break;
                                            case 1:
                                                gt0Var.getClass();
                                                gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                gt0Var.getClass();
                                                gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                gt0.h(gt0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        J.c(R.drawable.msg_archive, org.telegram.messenger.gd.M0(2131744562, null), new Runnable() { // from class: org.telegram.ui.Components.ip0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i152 = i14;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                gt0 gt0Var = this;
                                switch (i152) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), gt0Var.I1);
                                        String M0 = org.telegram.messenger.gd.M0(2131751476, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.S = M0;
                                        u1Var.U = org.telegram.messenger.gd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new tp0(gt0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(12));
                                        u1Var.show();
                                        u1Var.i();
                                        break;
                                    case 1:
                                        gt0Var.getClass();
                                        gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        gt0Var.getClass();
                                        gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        gt0.h(gt0Var, storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    J.c(R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751587, null), new Runnable() { // from class: org.telegram.ui.Components.ip0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i152 = i10;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            gt0 gt0Var = this;
                            switch (i152) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), gt0Var.I1);
                                    String M0 = org.telegram.messenger.gd.M0(2131751476, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.S = M0;
                                    u1Var.U = org.telegram.messenger.gd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new tp0(gt0Var, storyItem3));
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(12));
                                    u1Var.show();
                                    u1Var.i();
                                    break;
                                case 1:
                                    gt0Var.getClass();
                                    gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    gt0Var.getClass();
                                    gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    gt0.h(gt0Var, storyItem3);
                                    break;
                            }
                        }
                    }, true);
                    J.i = 3;
                    J.u = true;
                    J.v = true;
                    J.L = true;
                    J.M = 3;
                    Point point = org.telegram.messenger.g0.q;
                    int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                    J.N = min;
                    J.O = (min * 4) / 3;
                    J.t = true;
                    J.S = true;
                    J.Z = true;
                    J.a0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void U() {
        cs csVar = this.S0;
        if (csVar != null) {
            csVar.setTranslationY(this.O1);
        }
    }

    public boolean U0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean V(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.F1) {
            return false;
        }
        int i7 = 1;
        while (true) {
            sparseArrayArr = this.c1;
            if (i7 < 0) {
                break;
            }
            sparseArrayArr[i7].clear();
            i7--;
        }
        this.d1 = 0;
        P0(sparseArrayArr[0]);
        dq0 dq0Var = this.a0;
        if (dq0Var != null) {
            dq0Var.h();
            dq0Var.j();
        }
        q1(false);
        L1(z10);
        rs0 rs0Var = this.U;
        if (rs0Var != null) {
            rs0Var.x.clear();
        }
        return true;
    }

    public final void V0(float f10) {
        bs0[] bs0VarArr = this.n0;
        if (f10 != 1.0f || bs0VarArr[1].getVisibility() == 0) {
            if (this.k1) {
                bs0VarArr[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth() - (bs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                bs0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f10);
                bs0VarArr[1].setTranslationX((bs0VarArr[0].getMeasuredWidth() * f10) - bs0VarArr[0].getMeasuredWidth());
            }
            Z0(getTabProgress());
            float k02 = k0(f10);
            this.s0 = k02;
            this.u0.setVisibility((k02 == 0.0f || !I() || A0()) ? 4 : 0);
            org.telegram.ui.ActionBar.r0 r0Var = this.q0;
            if (r0Var == null || I()) {
                this.r0 = l0(f10);
                N1();
            } else {
                setSearchItemVisibility(I0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            I1(false);
            if (f10 == 1.0f) {
                bs0 bs0Var = bs0VarArr[0];
                bs0VarArr[0] = bs0VarArr[1];
                bs0VarArr[1] = bs0Var;
                bs0Var.setVisibility(8);
                if (r0Var != null && this.A0 == 2) {
                    setSearchItemVisibility(I0() ? 8 : 4);
                }
                this.A0 = 0;
                u1();
            }
        }
    }

    public final org.telegram.ui.ActionBar.r0 W(Context context, int i7, int i10, String str) {
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        if (a5Var != null) {
            r0Var = a5Var.q().b(i7, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.n6.z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.n6.y8;
            org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, s02, s0(i12), false, null);
            r0Var2.setIcon(i10);
            r0Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(r0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.Q0.add(r0Var2);
            ph0 iconView = r0Var2.getIconView();
            org.telegram.ui.ActionBar.i6 i6Var = this.I1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.u6.s(r0Var2.getIconView(), i12, i6Var, PorterDuff.Mode.SRC_IN);
            }
            if (r0Var2.getBackground() != null) {
                Drawable background = r0Var2.getBackground();
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                r0Var2.setBackground(background);
                org.telegram.ui.ActionBar.u6.j(r0Var2, background, null, M, i6Var);
            }
            r0Var = r0Var2;
        }
        r0Var.setContentDescription(str);
        r0Var.setOnClickListener(new ci.q(this, i7, 20));
        return r0Var;
    }

    public boolean Y() {
        return this instanceof z20;
    }

    public void Y0() {
        boolean z10 = I0() || A0();
        bt0 bt0Var = this.h0.x;
        if (bt0Var != null) {
            bt0Var.b(z10 && getClosestTab() == 9);
        }
        bt0 bt0Var2 = this.f0.x;
        if (bt0Var2 != null) {
            bt0Var2.b(z10 && getClosestTab() == 8);
        }
        for (ft0 ft0Var : this.m2.values()) {
            et0 et0Var = ft0Var.c;
            if (et0Var.s != null) {
                et0Var.x.b(z10 && getClosestTab() == ft0Var.a);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.q0;
        if (r0Var != null) {
            ar0 ar0Var = this.M0;
            r0Var.setSearchFieldHint(org.telegram.messenger.gd.M0((ar0Var != null && ar0Var.a() && getSelectedTab() == 11) ? 2131745673 : 2131745641, null));
        }
        S();
        R(true, true);
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        bs0[] bs0VarArr = this.n0;
        motionEvent.offsetLocation(x10 - bs0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - bs0VarArr[0].getY()) - bs0VarArr[0].h.getFastScroll().getY());
        return bs0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void Z0(float f10) {
        Q0();
    }

    public final boolean a0(int i7) {
        vs0[] vs0VarArr = this.x1.n;
        if (vs0VarArr == null) {
            return false;
        }
        vs0[] vs0VarArr2 = this.w1;
        if (i7 == 0) {
            vs0 vs0Var = vs0VarArr2[i7];
            if (!vs0Var.h) {
                int[] iArr = vs0Var.f;
                int[] iArr2 = vs0VarArr[i7].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = vs0VarArr2[i7].f;
            int[] iArr4 = vs0VarArr[i7].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        vs0VarArr2[i7].a.addAll(vs0VarArr[i7].a);
        vs0VarArr2[i7].c.addAll(vs0VarArr[i7].c);
        for (Map.Entry entry : vs0VarArr[i7].d.entrySet()) {
            vs0VarArr2[i7].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            vs0VarArr2[i7].b[i10] = vs0VarArr[i7].b[i10].clone();
            vs0 vs0Var2 = vs0VarArr2[i7];
            int[] iArr5 = vs0Var2.j;
            vs0 vs0Var3 = vs0VarArr[i7];
            iArr5[i10] = vs0Var3.j[i10];
            vs0Var2.i[i10] = vs0Var3.i[i10];
        }
        vs0VarArr2[i7].e.addAll(vs0VarArr[i7].e);
        return !vs0VarArr[i7].a.isEmpty();
    }

    public final void a1(int i7, long j3, org.telegram.ui.ActionBar.h2 h2Var) {
        new org.telegram.ui.d21(h2Var, j3, this.p1[1], new bi.x4(this, j3, i7, 2)).show();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.nd));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(int i7, fs0 fs0Var) {
        String str;
        fs0 fs0Var2;
        fs0 fs0Var3;
        boolean z10;
        fi.h6 h6Var;
        TLRPC.Chat O0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        dq0 dq0Var;
        dq0 dq0Var2;
        int i10;
        org.telegram.ui.ActionBar.z0 z0Var;
        boolean z11;
        fs0 fs0Var4;
        org.telegram.ui.ActionBar.z0 z0Var2;
        org.telegram.ui.ActionBar.z0 z0Var3;
        ft0 y12;
        boolean z02 = z0(i7);
        org.telegram.ui.ActionBar.h2 h2Var = this.y1;
        int currentAccount = h2Var.getCurrentAccount();
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(currentAccount);
        long j3 = this.m1;
        TLRPC.User c22 = u12.c2(Long.valueOf(j3));
        boolean i11 = getStoriesController().i(j3);
        int i12 = 3;
        int i13 = 4;
        final int i14 = 1;
        if (J0(i7) && i11 && (y12 = y1(i7)) != null) {
            int i15 = y12.b;
            fs0Var.i0(R.drawable.menu_add_stories, new jp0(this, i15, i14), org.telegram.messenger.gd.M0(2131744563, null), false, true);
            B(fs0Var, h2Var, this.m1, i15);
            fs0Var.i0(R.drawable.tabs_reorder, new jp0(this, i15, i12), org.telegram.messenger.gd.M0(2131744555, null), false, true);
            fs0Var.i0(R.drawable.msg_delete, new jp0(this, i15, i13), org.telegram.messenger.gd.M0(2131744561, null), true, true);
            fs0Var.I();
            C(fs0Var);
            return true;
        }
        int i16 = 5;
        final int i17 = 0;
        if (i7 == 14) {
            eq0 eq0Var = this.b0;
            if (eq0Var != null) {
                bi.j6 currentPage = eq0Var.getCurrentPage();
                di.o8 o8Var = currentPage == null ? null : currentPage.e;
                if (o8Var != null) {
                    long j10 = eq0Var.c;
                    int i18 = eq0Var.b;
                    boolean w10 = j10 == org.telegram.messenger.j10.i(i18).e() ? true : j10 >= 0 ? false : org.telegram.messenger.v3.w(5, org.telegram.messenger.mp.u1(i18).O0(Long.valueOf(-j10)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (o8Var.c) {
                        i10 = 11;
                        z0Var = null;
                        z11 = false;
                    } else {
                        i10 = 11;
                        z0Var = fs0Var.i0(R.drawable.menu_sort_value, new hn0(i16, o8Var, runnableArr), org.telegram.messenger.gd.M0(2131750181, null), false, false);
                        z11 = true;
                    }
                    if (eq0Var.b()) {
                        fs0Var.i0(R.drawable.menu_folder_add, new fp0(this, i10), org.telegram.messenger.gd.M0(2131750082, null), false, true);
                        z11 = true;
                    }
                    if (eq0Var.e.h()) {
                        if (!o8Var.i().isEmpty() || currentPage.d) {
                            fs0Var.i0(R.drawable.tabs_reorder, new fp0(this, 12), org.telegram.messenger.gd.M0(2131750017, null), false, true);
                            fs0Var4 = fs0Var;
                        } else {
                            fs0Var4 = fs0Var;
                        }
                        z11 = true;
                    } else {
                        fs0Var4 = fs0Var;
                    }
                    if (z11) {
                        fs0Var4.I();
                    }
                    org.telegram.ui.ActionBar.z0 K = fs0Var4.K(org.telegram.messenger.gd.M0(2131750179, null));
                    org.telegram.ui.ActionBar.z0 K2 = fs0Var4.K(org.telegram.messenger.gd.M0(2131750183, null));
                    org.telegram.ui.ActionBar.z0 K3 = fs0Var4.K(org.telegram.messenger.gd.M0(2131750178, null));
                    org.telegram.ui.ActionBar.z0 K4 = fs0Var4.K(org.telegram.messenger.gd.M0(2131750180, null));
                    if (w10) {
                        fs0Var4.I();
                        org.telegram.ui.ActionBar.z0 K5 = fs0Var4.K(org.telegram.messenger.gd.M0(2131750185, null));
                        z0Var3 = fs0Var4.K(org.telegram.messenger.gd.M0(2131750184, null));
                        z0Var2 = K5;
                    } else {
                        z0Var2 = null;
                        z0Var3 = null;
                    }
                    di.o8 o8Var2 = o8Var;
                    bi.i8 i8Var = new bi.i8(z0Var, o8Var2, K, K2, K3, K4, w10, z0Var2, z0Var3);
                    org.telegram.ui.ActionBar.z0 z0Var4 = z0Var2;
                    org.telegram.ui.ActionBar.z0 z0Var5 = z0Var3;
                    runnableArr[0] = i8Var;
                    i8Var.run();
                    bi.p6.j(K, o8Var2, runnableArr[0], 1);
                    bi.p6.j(K2, o8Var2, runnableArr[0], 2);
                    bi.p6.j(K3, o8Var2, runnableArr[0], 4);
                    bi.p6.j(K4, o8Var2, runnableArr[0], 8);
                    if (w10) {
                        bi.p6.j(z0Var4, o8Var2, runnableArr[0], 256);
                        bi.p6.j(z0Var5, o8Var2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i7 == 13 && c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit && (dq0Var = this.a0) != null) {
            int itemsCount = dq0Var.getItemsCount();
            if (itemsCount < h2Var.getMessagesController().W5) {
                dq0Var2 = dq0Var;
                fs0Var.i0(R.drawable.msg_addbot, new fp0(this, 4), org.telegram.messenger.gd.M0(2131746522, null), false, true);
            } else {
                dq0Var2 = dq0Var;
            }
            if (itemsCount > 1 && !dq0Var2.d()) {
                fs0Var.i0(R.drawable.tabs_reorder, new fp0(this, i16), org.telegram.messenger.gd.M0(2131746495, null), false, true);
            }
            if (itemsCount > 0) {
                fs0Var.i0(R.drawable.msg_select, new fp0(this, 6), org.telegram.messenger.gd.M0(dq0Var2.d() ? 2131746493 : 2131746494, null), false, true);
            }
            if (!TextUtils.isEmpty(dq0Var2.getCurrentLang())) {
                fs0Var.i0(R.drawable.msg_delete, new fp0(this, 7), org.telegram.messenger.gd.a0(null, null, 2131746496, y21.P0(dq0Var2.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i7 == 11) {
                fs0Var.i0(R.drawable.msg_discussion, new fp0(this, 8), org.telegram.messenger.gd.M0(2131745669, null), false, true);
                fs0Var.I();
                fs0Var.i0(R.drawable.msg_home, new fp0(this, 9), org.telegram.messenger.gd.M0(2131754388, null), false, true);
                fs0Var.i0(R.drawable.msg_delete, new fp0(this, 10), org.telegram.messenger.gd.M0(2131751579, null), false, true);
                return true;
            }
            if ((i7 == 8 || J0(i7)) && i11) {
                str = null;
                fs0Var2 = fs0Var;
                fs0Var2.i0(R.drawable.menu_album_add, new fp0(this, 2), org.telegram.messenger.gd.M0(2131744572, null), false, true);
                fs0Var2.I();
            } else {
                fs0Var2 = fs0Var;
                str = null;
            }
            C(fs0Var2);
            if (!org.telegram.messenger.n5.C(j3) && (c22 == null || !c22.bot)) {
                fs0Var2.i0(R.drawable.msg_calendar2, new jp0(this, i7, 2), org.telegram.messenger.gd.M0(2131752631, str), false, true);
                if (this.g1 == null || I0() || (O0 = org.telegram.messenger.mp.u1(currentAccount).O0(Long.valueOf(this.g1.id))) == null || (tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    fs0Var3 = fs0Var;
                } else {
                    fs0Var3 = fs0Var;
                    fs0Var3.i0(R.drawable.msg_archive, new fp0(this, 3), org.telegram.messenger.gd.M0(2131747617, str), false, true);
                }
                vs0[] vs0VarArr = this.w1;
                if (!z02) {
                    vs0 vs0Var = vs0VarArr[0];
                    if (!vs0Var.w || !vs0Var.v) {
                        boolean[] zArr = vs0Var.i;
                        if (zArr[0] && zArr[1] && vs0Var.l) {
                            z10 = false;
                            if (z10) {
                                fs0Var3.I();
                                final org.telegram.ui.ActionBar.z0 K6 = fs0Var3.K(org.telegram.messenger.gd.M0(2131748461, str));
                                final org.telegram.ui.ActionBar.z0 K7 = fs0Var3.K(org.telegram.messenger.gd.M0(2131748460, str));
                                if (!z02) {
                                    int i19 = vs0VarArr[0].q;
                                    K6.setChecked(i19 == 0 || i19 == 1);
                                    int i20 = vs0VarArr[0].q;
                                    K7.setChecked(i20 == 0 || i20 == 2);
                                    K6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rp0
                                        public final /* synthetic */ gt0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i17) {
                                                case 0:
                                                    final int i21 = 1;
                                                    final gt0 gt0Var = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var6 = K6;
                                                    final org.telegram.ui.ActionBar.z0 z0Var7 = K7;
                                                    gt0Var.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.up0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i21) {
                                                                case 0:
                                                                    gt0 gt0Var2 = gt0Var;
                                                                    gt0Var2.w1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    gt0Var2.M();
                                                                    break;
                                                                default:
                                                                    gt0 gt0Var3 = gt0Var;
                                                                    gt0Var3.w1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    gt0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i22 = 0;
                                                    final gt0 gt0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var8 = K7;
                                                    final org.telegram.ui.ActionBar.z0 z0Var9 = K6;
                                                    gt0Var2.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.up0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    gt0 gt0Var22 = gt0Var2;
                                                                    gt0Var22.w1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    gt0Var22.M();
                                                                    break;
                                                                default:
                                                                    gt0 gt0Var3 = gt0Var2;
                                                                    gt0Var3.w1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    gt0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    K7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rp0
                                        public final /* synthetic */ gt0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i14) {
                                                case 0:
                                                    final int i21 = 1;
                                                    final gt0 gt0Var = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var6 = K7;
                                                    final org.telegram.ui.ActionBar.z0 z0Var7 = K6;
                                                    gt0Var.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.up0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i21) {
                                                                case 0:
                                                                    gt0 gt0Var22 = gt0Var;
                                                                    gt0Var22.w1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    gt0Var22.M();
                                                                    break;
                                                                default:
                                                                    gt0 gt0Var3 = gt0Var;
                                                                    gt0Var3.w1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    gt0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i22 = 0;
                                                    final gt0 gt0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var8 = K6;
                                                    final org.telegram.ui.ActionBar.z0 z0Var9 = K7;
                                                    gt0Var2.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.up0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    gt0 gt0Var22 = gt0Var2;
                                                                    gt0Var22.w1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    gt0Var22.M();
                                                                    break;
                                                                default:
                                                                    gt0 gt0Var3 = gt0Var2;
                                                                    gt0Var3.w1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    gt0Var3.M();
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
                                final dt0 z12 = z1(i7);
                                if (z12 != null && (h6Var = z12.s) != null) {
                                    K6.setChecked(h6Var.n);
                                    K7.setChecked(z12.s.o);
                                }
                                final int i21 = 0;
                                K6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qp0
                                    public final /* synthetic */ gt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i21) {
                                            case 0:
                                                final int i22 = 1;
                                                final dt0 dt0Var = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var6 = K6;
                                                final org.telegram.ui.ActionBar.z0 z0Var7 = K7;
                                                this.b.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.sp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.h6 h6Var2;
                                                        fi.h6 h6Var3;
                                                        switch (i22) {
                                                            case 0:
                                                                dt0 dt0Var2 = dt0Var;
                                                                if (dt0Var2 != null && (h6Var2 = dt0Var2.s) != null) {
                                                                    boolean z13 = z0Var6.getCheckView().a.q;
                                                                    boolean z14 = z0Var7.getCheckView().a.q;
                                                                    h6Var2.n = z13;
                                                                    h6Var2.o = z14;
                                                                    h6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                dt0 dt0Var3 = dt0Var;
                                                                if (dt0Var3 != null && (h6Var3 = dt0Var3.s) != null) {
                                                                    boolean z15 = z0Var6.getCheckView().a.q;
                                                                    boolean z16 = z0Var7.getCheckView().a.q;
                                                                    h6Var3.n = z15;
                                                                    h6Var3.o = z16;
                                                                    h6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i23 = 0;
                                                final dt0 dt0Var2 = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var8 = K7;
                                                final org.telegram.ui.ActionBar.z0 z0Var9 = K6;
                                                this.b.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.sp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.h6 h6Var2;
                                                        fi.h6 h6Var3;
                                                        switch (i23) {
                                                            case 0:
                                                                dt0 dt0Var22 = dt0Var2;
                                                                if (dt0Var22 != null && (h6Var2 = dt0Var22.s) != null) {
                                                                    boolean z13 = z0Var8.getCheckView().a.q;
                                                                    boolean z14 = z0Var9.getCheckView().a.q;
                                                                    h6Var2.n = z13;
                                                                    h6Var2.o = z14;
                                                                    h6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                dt0 dt0Var3 = dt0Var2;
                                                                if (dt0Var3 != null && (h6Var3 = dt0Var3.s) != null) {
                                                                    boolean z15 = z0Var8.getCheckView().a.q;
                                                                    boolean z16 = z0Var9.getCheckView().a.q;
                                                                    h6Var3.n = z15;
                                                                    h6Var3.o = z16;
                                                                    h6Var3.d(true);
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
                                K7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qp0
                                    public final /* synthetic */ gt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i22) {
                                            case 0:
                                                final int i222 = 1;
                                                final dt0 dt0Var = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var6 = K7;
                                                final org.telegram.ui.ActionBar.z0 z0Var7 = K6;
                                                this.b.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.sp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.h6 h6Var2;
                                                        fi.h6 h6Var3;
                                                        switch (i222) {
                                                            case 0:
                                                                dt0 dt0Var22 = dt0Var;
                                                                if (dt0Var22 != null && (h6Var2 = dt0Var22.s) != null) {
                                                                    boolean z13 = z0Var6.getCheckView().a.q;
                                                                    boolean z14 = z0Var7.getCheckView().a.q;
                                                                    h6Var2.n = z13;
                                                                    h6Var2.o = z14;
                                                                    h6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                dt0 dt0Var3 = dt0Var;
                                                                if (dt0Var3 != null && (h6Var3 = dt0Var3.s) != null) {
                                                                    boolean z15 = z0Var6.getCheckView().a.q;
                                                                    boolean z16 = z0Var7.getCheckView().a.q;
                                                                    h6Var3.n = z15;
                                                                    h6Var3.o = z16;
                                                                    h6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i23 = 0;
                                                final dt0 dt0Var2 = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var8 = K6;
                                                final org.telegram.ui.ActionBar.z0 z0Var9 = K7;
                                                this.b.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.sp0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.h6 h6Var2;
                                                        fi.h6 h6Var3;
                                                        switch (i23) {
                                                            case 0:
                                                                dt0 dt0Var22 = dt0Var2;
                                                                if (dt0Var22 != null && (h6Var2 = dt0Var22.s) != null) {
                                                                    boolean z13 = z0Var8.getCheckView().a.q;
                                                                    boolean z14 = z0Var9.getCheckView().a.q;
                                                                    h6Var2.n = z13;
                                                                    h6Var2.o = z14;
                                                                    h6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                dt0 dt0Var3 = dt0Var2;
                                                                if (dt0Var3 != null && (h6Var3 = dt0Var3.s) != null) {
                                                                    boolean z15 = z0Var8.getCheckView().a.q;
                                                                    boolean z16 = z0Var9.getCheckView().a.q;
                                                                    h6Var3.n = z15;
                                                                    h6Var3.o = z16;
                                                                    h6Var3.d(true);
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

    public final void b1(int i7, long j3, org.telegram.ui.ActionBar.h2 h2Var) {
        b5.s0(h2Var, org.telegram.messenger.gd.M0(2131751587, null), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744560, getStoriesController().w(i7, j3))), org.telegram.messenger.gd.M0(2131751587, null), true, new di.b9(this, j3, i7, 8));
    }

    public final void c0(int i7, ck0 ck0Var, boolean z10) {
        ArrayList arrayList = this.w1[i7].e;
        int L0 = ((v4.c0) ck0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            gs0 gs0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((gs0) arrayList.get(i10)).b) {
                        gs0Var = (gs0) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (gs0Var == null) {
                    gs0Var = (gs0) i5.c.h(1, arrayList);
                }
            }
            if (gs0Var != null) {
                L0(i7, gs0Var.d, gs0Var.b + 1, z10);
            }
        }
    }

    public final void c1(int i7, long j3, org.telegram.ui.ActionBar.h2 h2Var) {
        String w10 = getStoriesController().w(i7, j3);
        Context context = h2Var.getContext();
        org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
        c4.n nVar = new c4.n(this, j3, i7, 5);
        Pattern pattern = b5.a;
        b5.O(context, h2Var, org.telegram.messenger.gd.M0(2131744547, null), org.telegram.messenger.gd.M0(2131744546, null), org.telegram.messenger.gd.M0(2131744545, null), w10, 12, org.telegram.messenger.gd.M0(2131746083, null), resourceProvider, nVar);
    }

    public final void d0() {
        bs0[] bs0VarArr;
        bs0 bs0Var;
        int i7;
        v4.i0 adapter;
        if (this.r1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                bs0VarArr = this.n0;
                if (i11 >= bs0VarArr.length) {
                    bs0Var = null;
                    break;
                }
                bs0Var = bs0VarArr[i11];
                if (bs0Var.F == this.s1) {
                    break;
                } else {
                    i11++;
                }
            }
            if (bs0Var != null) {
                boolean z02 = z0(bs0Var.F);
                float f10 = this.q1;
                vs0[] vs0VarArr = this.w1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.r1 = false;
                        if (this.s1 == 0) {
                            vs0VarArr[0].g(false);
                        }
                        bs0Var.n.setVisibility(8);
                        bs0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f10 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new cr0(this, bs0Var, i10));
                    ofFloat.addListener(new org.telegram.ui.ki(this, z10, z02 ? 1 : 0, bs0Var));
                    ofFloat.setInterpolator(lr.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.r1 = false;
                int i12 = this.t1;
                int[] iArr = this.p1;
                iArr[z02 ? 1 : 0] = i12;
                if (!z02) {
                    org.telegram.messenger.bz.B(i12);
                } else if (m0(bs0Var.F) >= 5) {
                    org.telegram.messenger.bz.F(this.t1);
                }
                for (int i13 = 0; i13 < bs0VarArr.length; i13++) {
                    bs0 bs0Var2 = bs0VarArr[i13];
                    if (bs0Var2 != null && bs0Var2.h != null && (((i7 = bs0Var2.F) == 0 || z0(i7)) && (adapter = bs0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            vs0VarArr[0].g(false);
                        }
                        bs0VarArr[i13].n.setVisibility(8);
                        bs0VarArr[i13].x.y1(iArr[z02 ? 1 : 0]);
                        bs0VarArr[i13].h.a0();
                        bs0VarArr[i13].h.invalidate();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.Z3(bs0VarArr[i13].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    j1();
                    return;
                }
                while (i10 < bs0VarArr.length) {
                    bs0 bs0Var3 = bs0VarArr[i10];
                    if (bs0Var3.F == this.s1) {
                        View m10 = bs0Var3.r.m(this.s);
                        if (m10 != null) {
                            this.w = m10.getTop();
                        }
                        bs0 bs0Var4 = bs0VarArr[i10];
                        bs0Var4.x.h1(this.s, (-bs0Var4.h.getPaddingTop()) + this.w);
                    }
                    i10++;
                }
            }
        }
    }

    public final void d1(String str) {
        boolean H3 = org.telegram.messenger.g0.H3(str);
        org.telegram.ui.ActionBar.h2 h2Var = this.y1;
        if (H3) {
            b5.n0(h2Var, str, true, true);
        } else {
            vf.c.t(h2Var.getParentActivity(), str);
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
    @Override // org.telegram.messenger.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        lq0 lq0Var;
        org.telegram.messenger.fj fjVar;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i11;
        v4.i0 i0Var;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int size;
        int i14;
        boolean z12;
        lq0 lq0Var2;
        int i15;
        int i16;
        lq0 lq0Var3;
        int i17 = org.telegram.messenger.ks.V;
        v4.i0 i0Var2 = this.R;
        v4.i0 i0Var3 = this.P;
        us0 us0Var = this.M;
        v4.i0 i0Var4 = this.O;
        v4.i0 i0Var5 = this.N;
        org.telegram.ui.ActionBar.h2 h2Var = this.y1;
        ps0 ps0Var = this.Q;
        nr0 nr0Var = this.K;
        long j3 = this.m1;
        bs0[] bs0VarArr = this.n0;
        vs0[] vs0VarArr = this.w1;
        if (i7 == i17) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != h2Var.getClassGuid() || intValue2 != vs0VarArr[intValue3].p) {
                if (this.x1 == null || !vs0VarArr[intValue3].a.isEmpty() || vs0VarArr[intValue3].o || !a0(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    i0Var2 = nr0Var;
                } else if (intValue3 == 1) {
                    i0Var2 = i0Var5;
                } else if (intValue3 == 2) {
                    i0Var2 = i0Var4;
                } else if (intValue3 == 3) {
                    i0Var2 = us0Var;
                } else if (intValue3 == 4) {
                    i0Var2 = i0Var3;
                } else if (intValue3 != 5) {
                    i0Var2 = intValue3 == 15 ? ps0Var : null;
                }
                if (i0Var2 != null) {
                    for (int i18 = 0; i18 < bs0VarArr.length; i18++) {
                        bs0 bs0Var = bs0VarArr[i18];
                        if (bs0Var != null && (lq0Var2 = bs0Var.h) != null && lq0Var2.getAdapter() == i0Var2) {
                            bs0VarArr[i18].h.C0();
                        }
                    }
                    i0Var2.f();
                }
                this.e1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean C = org.telegram.messenger.n5.C(j3);
            int i19 = longValue == j3 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                vs0VarArr[intValue3].f[i19] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i15 = intValue3;
                i0Var2 = nr0Var;
            } else if (intValue3 == 1) {
                i15 = intValue3;
                i0Var2 = i0Var5;
            } else if (intValue3 == 2) {
                i15 = intValue3;
                i0Var2 = i0Var4;
            } else if (intValue3 == 3) {
                i15 = intValue3;
                i0Var2 = us0Var;
            } else if (intValue3 == 4) {
                i15 = intValue3;
                i0Var2 = i0Var3;
            } else if (intValue3 == 5) {
                i15 = intValue3;
            } else if (intValue3 == 15) {
                i0Var2 = ps0Var;
                i15 = 8;
            } else {
                i15 = intValue3;
                i0Var2 = null;
            }
            int size2 = vs0VarArr[i15].a.size();
            if (i0Var2 != null) {
                i16 = i0Var2.b();
                if (i0Var2 instanceof xj0) {
                    ((xj0) i0Var2).L();
                }
            } else {
                i16 = 0;
            }
            vs0VarArr[i15].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(size3);
                    if (vs0VarArr[i15].a(fjVar2, i19, r13, C)) {
                        sparseBooleanArray.put(fjVar2.e1(), r13);
                        vs0 vs0Var = vs0VarArr[i15];
                        int i20 = vs0Var.m - r13;
                        vs0Var.m = i20;
                        if (i20 < 0) {
                            vs0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                vs0VarArr[i15].l = ((Boolean) objArr[5]).booleanValue();
                vs0 vs0Var2 = vs0VarArr[i15];
                if (vs0Var2.l) {
                    vs0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i21);
                    if (vs0VarArr[i15].a(fjVar3, i19, r12, C)) {
                        sparseBooleanArray.put(fjVar3.e1(), true);
                        vs0 vs0Var3 = vs0VarArr[i15];
                        int i22 = vs0Var3.n - 1;
                        vs0Var3.n = i22;
                        if (i22 < 0) {
                            vs0Var3.n = r12;
                        }
                    }
                    i21++;
                    r12 = 0;
                }
                vs0 vs0Var4 = vs0VarArr[i15];
                if (vs0Var4.o && vs0Var4.a.size() > 0) {
                    vs0 vs0Var5 = vs0VarArr[i15];
                    vs0Var5.k = ((org.telegram.messenger.fj) vs0Var5.a.get(0)).e1();
                }
                vs0VarArr[i15].i[i19] = ((Boolean) objArr[5]).booleanValue();
                vs0 vs0Var6 = vs0VarArr[i15];
                if (vs0Var6.i[i19]) {
                    int size4 = vs0Var6.b[i19].size();
                    if (i19 == 0) {
                        size4 += vs0VarArr[i15].m;
                    }
                    vs0VarArr[i15].f[i19] = size4;
                }
            }
            if (!booleanValue && i19 == 0) {
                vs0 vs0Var7 = vs0VarArr[i15];
                if (vs0Var7.i[i19] && this.f1 != 0) {
                    vs0Var7.g = true;
                    h2Var.getMediaDataController().Q0(this.f1, 50, vs0VarArr[i15].j[1], 0, i15, this.G, 1, h2Var.getClassGuid(), vs0VarArr[i15].p, null, null);
                }
            }
            int i23 = i15;
            if (i0Var2 != null) {
                as0 as0Var = null;
                for (int i24 = 0; i24 < bs0VarArr.length; i24++) {
                    bs0 bs0Var2 = bs0VarArr[i24];
                    if (bs0Var2 != null && (lq0Var3 = bs0Var2.h) != null && lq0Var3.getAdapter() == i0Var2) {
                        as0 as0Var2 = bs0VarArr[i24].h;
                        as0Var2.C0();
                        as0Var = as0Var2;
                    }
                }
                int b10 = i0Var2.b();
                if (i0Var2 != nr0Var) {
                    try {
                        i0Var2.f();
                    } catch (Throwable unused) {
                    }
                } else if (nr0Var.b() == i16) {
                    org.telegram.messenger.g0.Z3(as0Var);
                } else {
                    nr0Var.f();
                }
                if (!vs0VarArr[i23].a.isEmpty() || vs0VarArr[i23].g) {
                    if (as0Var != null && (i0Var2 == nr0Var || b10 >= i16)) {
                        D(as0Var, i16, sparseBooleanArray);
                    }
                } else if (as0Var != null) {
                    D(as0Var, i16, sparseBooleanArray);
                }
                if (as0Var != null && !vs0VarArr[i23].o) {
                    if (size2 == 0) {
                        for (int i25 = 0; i25 < 2; i25++) {
                            if (bs0VarArr[i25].F == 0) {
                                ((v4.c0) as0Var.getLayoutManager()).h1(nr0Var.L(0), 0);
                            }
                        }
                    } else {
                        j1();
                    }
                }
            }
            vs0 vs0Var8 = vs0VarArr[i23];
            if (vs0Var8.o) {
                if (vs0Var8.a.size() == 0) {
                    N0(i23);
                } else {
                    vs0VarArr[i23].o = false;
                }
            }
            this.e1 = true;
            return;
        }
        if (i7 == org.telegram.messenger.ks.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat O0 = org.telegram.messenger.n5.z(j3) ? h2Var.getMessagesController().O0(Long.valueOf(-j3)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (org.telegram.messenger.v3.T(O0)) {
                if (longValue2 == 0 && this.f1 != 0) {
                    i13 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i26 = -1;
                    i14 = 0;
                    z12 = false;
                    while (i14 < size) {
                        nr0 nr0Var2 = nr0Var;
                        int i27 = 0;
                        while (i27 < vs0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (vs0VarArr[i27].b(((Integer) arrayList2.get(i14)).intValue(), i13) != null) {
                                i26 = i27;
                                z12 = true;
                            }
                            i27++;
                            arrayList2 = arrayList3;
                        }
                        i14++;
                        nr0Var = nr0Var2;
                    }
                    nr0 nr0Var3 = nr0Var;
                    if (z12) {
                        this.e1 = true;
                        if (nr0Var3 != null) {
                            nr0Var3.f();
                        }
                        if (i0Var5 != null) {
                            i0Var5.f();
                        }
                        if (i0Var4 != null) {
                            i0Var4.f();
                        }
                        if (us0Var != null) {
                            us0Var.X(false);
                        }
                        if (i0Var3 != null) {
                            i0Var3.f();
                        }
                        if (ps0Var != null) {
                            ps0Var.f();
                        }
                        if (i0Var2 != null) {
                            i0Var2.f();
                        }
                        if (i26 == 0 || i26 == 1 || i26 == 2 || i26 == 4) {
                            M0(true);
                        }
                    }
                    g0(i26);
                    return;
                }
                if (longValue2 != O0.id) {
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
            nr0 nr0Var32 = nr0Var;
            if (z12) {
            }
            g0(i262);
            return;
        }
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j3) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean C2 = org.telegram.messenger.n5.C(j3);
                int i28 = 0;
                boolean z13 = false;
                while (i28 < arrayList4.size()) {
                    org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) arrayList4.get(i28);
                    ArrayList arrayList5 = arrayList4;
                    if (org.telegram.messenger.fj.n1(fjVar4.k) == null || fjVar4.m5()) {
                        i12 = i28;
                    } else {
                        int h02 = org.telegram.messenger.ri.h0(fjVar4.k);
                        i12 = i28;
                        if (h02 == -1) {
                            return;
                        }
                        vs0 vs0Var9 = vs0VarArr[h02];
                        if (vs0Var9.l) {
                            z11 = z13;
                            if (vs0Var9.a(fjVar4, org.telegram.messenger.fj.B0(fjVar4.k) == j3 ? 0 : 1, true, C2)) {
                                this.a1[h02] = 1;
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
                    while (i29 < bs0VarArr.length) {
                        int i30 = bs0VarArr[i29].F;
                        if (i30 == 0) {
                            i0Var = nr0Var;
                        } else if (i30 == z15) {
                            i0Var = i0Var5;
                        } else if (i30 == 2) {
                            i0Var = i0Var4;
                        } else if (i30 == 3) {
                            i0Var = us0Var;
                        } else {
                            if (i30 == 4) {
                                i0Var = i0Var3;
                            } else if (i30 == 5) {
                                i0Var = i0Var2;
                            } else {
                                i0Var = i30 == 15 ? ps0Var : null;
                                if (i0Var != null) {
                                    i0Var.b();
                                    nr0Var.f();
                                    i0Var5.f();
                                    i0Var4.f();
                                    us0Var.X(false);
                                    i0Var3.f();
                                    ps0Var.f();
                                    i0Var2.f();
                                }
                                i29++;
                                z15 = true;
                            }
                            if (i0Var != null) {
                            }
                            i29++;
                            z15 = true;
                        }
                        if (i0Var != null) {
                        }
                        i29++;
                        z15 = true;
                    }
                    P1(z15);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.K) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l10 = (Long) objArr[3];
            if (l10.longValue() == j3 || l10.longValue() == this.f1) {
                int i31 = l10.longValue() == j3 ? 0 : 1;
                for (vs0 vs0Var10 : vs0VarArr) {
                    vs0Var10.f(i31, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i32 = org.telegram.messenger.ks.h2;
        int i33 = org.telegram.messenger.ks.f2;
        int i34 = org.telegram.messenger.ks.g2;
        if (i7 == i32 || i7 == i34 || i7 == i33) {
            if (i7 != i33 && i7 != i34) {
                if (((org.telegram.messenger.fj) objArr[0]).T != 0) {
                    return;
                }
                for (int i35 = 0; i35 < bs0VarArr.length; i35++) {
                    int childCount = bs0VarArr[i35].h.getChildCount();
                    for (int i36 = 0; i36 < childCount; i36++) {
                        View childAt = bs0VarArr[i35].h.getChildAt(i36);
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                            if (h7Var.getMessage() != null) {
                                h7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i37 = 0; i37 < bs0VarArr.length; i37++) {
                bs0 bs0Var3 = bs0VarArr[i37];
                if (bs0Var3 != null && (lq0Var = bs0Var3.h) != null) {
                    int childCount2 = lq0Var.getChildCount();
                    for (int i38 = 0; i38 < childCount2; i38++) {
                        View childAt2 = bs0VarArr[i37].h.getChildAt(i38);
                        if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                            if (h7Var2.getMessage() != null) {
                                h7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.A5) {
            fi.h6 h6Var = (fi.h6) objArr[0];
            qr0 qr0Var = this.f0;
            if (qr0Var == null || h6Var != qr0Var.s) {
                cq0 cq0Var = this.h0;
                if (cq0Var == null || h6Var != cq0Var.s) {
                    Iterator it = this.m2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        ft0 ft0Var = (ft0) it.next();
                        if (ft0Var.c.s == h6Var) {
                            i11 = ft0Var.a;
                            break;
                        }
                    }
                } else {
                    i11 = 9;
                }
            } else {
                i11 = 8;
            }
            bs0 g02 = g0(i11);
            if (g02 != null) {
                if (g02.b != (h6Var.g() > 0)) {
                    g02.b = h6Var.g() > 0;
                    F1(g02, true);
                }
            }
            if (g02 != null) {
                org.telegram.messenger.g0.r2(g02.h);
                if (g02.h.getLayoutManager() instanceof v4.c0) {
                    ck0 ck0Var = g02.h;
                    O(g02, ck0Var, (v4.c0) ck0Var.getLayoutManager());
                }
            }
            vr0 vr0Var = this.G1;
            if (vr0Var != null) {
                vr0Var.W();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.y5) {
            for (bs0 bs0Var4 : bs0VarArr) {
                if (bs0Var4 != null && bs0Var4.h != null && z0(bs0Var4.F)) {
                    if (!B0() || bs0Var4.h.getAdapter() == null) {
                        for (int i39 = 0; i39 < bs0Var4.h.getChildCount(); i39++) {
                            View childAt3 = bs0Var4.h.getChildAt(i39);
                            if (childAt3 instanceof org.telegram.ui.Cells.p7) {
                                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt3;
                                m6 m6Var = p7Var.O;
                                if (!p7Var.e0 || (fjVar = p7Var.n) == null || (storyItem = fjVar.l) == null || (storyViews = storyItem.views) == null) {
                                    p7Var.M = false;
                                    m6Var.t("", false, true);
                                } else {
                                    int i40 = storyViews.views_count;
                                    p7Var.M = i40 > 0;
                                    m6Var.t(org.telegram.messenger.g0.o0(i40, 0), true, true);
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.r2(bs0Var4.h);
                    }
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.h3) {
            if (((Long) objArr[0]).longValue() == j3) {
                this.T.E(true);
                P1(true);
                N();
                return;
            }
            return;
        }
        int i41 = org.telegram.messenger.ks.i3;
        rs0 rs0Var = this.U;
        if (i7 == i41) {
            if (j3 == 0 || j3 == h2Var.getUserConfig().e()) {
                rs0Var.F(true);
                P1(true);
                N();
                Y0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.s) {
            rs0Var.F(true);
            return;
        }
        if (i7 == org.telegram.messenger.ks.I3) {
            if (((Long) objArr[0]).longValue() == j3) {
                P1(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.Z3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j3 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            tr0 tr0Var = this.d0;
            if (tr0Var != null) {
                TLRPC.ChatFull chatFull = tr0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i42 = 0; i42 < tr0Var.d.participants.participants.size(); i42++) {
                        tr0Var.d.participants.participants.get(i42).setRank(longValue4, str);
                    }
                }
                for (bs0 bs0Var5 : bs0VarArr) {
                    if (bs0Var5.F == 7) {
                        org.telegram.messenger.g0.Z3(bs0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.f1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i43 = 0; i43 < bs0VarArr.length; i43++) {
                if (bs0VarArr[i43].h.getAdapter() == ps0Var) {
                    lq0 lq0Var4 = bs0VarArr[i43].h;
                    ArrayList arrayList6 = ps0Var.n;
                    for (int i44 = 0; i44 < arrayList6.size(); i44++) {
                        org.telegram.messenger.fj fjVar5 = (org.telegram.messenger.fj) arrayList6.get(i44);
                        if (fjVar5 != null && fjVar5.D1() == longValue5) {
                            TLRPC.MessageMedia messageMedia = fjVar5.k.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                org.telegram.messenger.fj.d6(tL_messageMediaPoll, pollResults);
                                ps0Var.g(i44);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        dr0 dr0Var = this.L0;
        if (dr0Var != null) {
            canvas.save();
            canvas.translate(dr0Var.getX(), dr0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        zq0 zq0Var = this.U0;
        if (zq0Var != null) {
            int i7 = zq0Var.V;
            if ((i7 == 3 || i7 == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(zq0Var.getX(), zq0Var.getY());
                zq0Var.setDrawOverlay(true);
                zq0Var.draw(canvas);
                zq0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        if (this.c2 && (view instanceof bs0) && this.g2 < this.e2) {
            canvas.save();
            canvas.clipRect(0, -this.g2, getWidth(), getHeight() + this.f2);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        if (view != this.U0 || this.S0 != null) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        bs0[] bs0VarArr = this.n0;
        float top = bs0VarArr[0].getTop();
        hq0 hq0Var = this.c0;
        if (hq0Var != null && ((i7 = bs0VarArr[0].F) == 8 || J0(i7))) {
            top -= hq0Var.getVisualHeight();
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
                this.D0.setTextSize(20);
            } else {
                this.D0.setTextSize(18);
            }
        }
        if (i7 == 0) {
            this.K.f();
        }
    }

    public int e1() {
        return -1;
    }

    public final String f0(boolean z10) {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        dq0 dq0Var;
        if (!B0()) {
            return org.telegram.messenger.gd.M0(2131753003, null);
        }
        if (z10 && (dq0Var = this.a0) != null) {
            return dq0Var.getBotPreviewsSubtitle();
        }
        qr0 qr0Var = this.f0;
        if (qr0Var == null || qr0Var.s == null) {
            i7 = 0;
            i10 = 0;
        } else {
            i7 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < qr0Var.s.i.size(); i11++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) qr0Var.s.i.get(i11);
                TL_stories.StoryItem storyItem = fjVar.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.fj.K4(messageMedia.document)) {
                        i10++;
                    } else if (fjVar.l.media.photo != null) {
                        i7++;
                    }
                }
            }
        }
        if (i7 == 0 && i10 == 0) {
            return org.telegram.messenger.gd.M0(2131753003, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i7 > 0) {
            sb2.append(org.telegram.messenger.gd.G(i7, "Images", new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.gd.G(i10, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final void f1(ArrayList arrayList, boolean z10) {
        qr0 qr0Var = this.f0;
        if (qr0Var == null || qr0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.y1;
        if (z10 && arrayList.size() > h2Var.getMessagesController().Q5) {
            org.telegram.messenger.n10.u(org.telegram.messenger.gd.G(h2Var.getMessagesController().Q5, "StoriesPinLimit", new Object[0]), lc.b0(h2Var), R.raw.chats_infotip, 36);
            return;
        }
        fi.h6 h6Var = qr0Var.s;
        int i7 = h6Var.c;
        ArrayList arrayList2 = h6Var.g;
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
        boolean z12 = arrayList3.size() > org.telegram.messenger.mp.u1(i7).Q5;
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
                h6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = org.telegram.messenger.mp.u1(i7).l1(h6Var.d);
                ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new fi.k5(2));
            }
            z11 = z12;
        }
        if (z11) {
            org.telegram.messenger.n10.u(org.telegram.messenger.gd.G(h2Var.getMessagesController().Q5, "StoriesPinLimit", new Object[0]), lc.b0(h2Var), R.raw.chats_infotip, 36);
        } else if (z10) {
            lc.b0(h2Var).I(R.raw.ic_pin, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.gd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            org.telegram.messenger.n10.u(org.telegram.messenger.gd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), lc.b0(h2Var), R.raw.ic_unpin, 36);
        }
    }

    public final bs0 g0(int i7) {
        int i10 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i10 >= bs0VarArr.length) {
                return null;
            }
            bs0 bs0Var = bs0VarArr[i10];
            if (bs0Var != null && bs0Var.F == i7) {
                return bs0Var;
            }
            i10++;
        }
    }

    public final boolean g1(MotionEvent motionEvent, boolean z10) {
        bs0 bs0Var;
        dq0 dq0Var;
        int closestTab = getClosestTab();
        dr0 dr0Var = this.L0;
        int i7 = -1;
        int i10 = dr0Var.P.get(dr0Var.n + (z10 ? 1 : -1), -1);
        hq0 hq0Var = this.c0;
        if (hq0Var != null) {
            if (J0(closestTab) || closestTab == 8) {
                f71 f71Var = hq0Var.b;
                i7 = f71Var.c0.get(f71Var.G + (z10 ? 1 : -1), -1);
            } else if (J0(i10) || i10 == 8) {
                i7 = hq0Var.getCurrentAlbumId();
            }
            if (i7 == 0) {
                i10 = 8;
            } else if (i7 > 0) {
                i10 = x1(i7).a;
            }
        }
        if (i10 >= 0) {
            if (this.q0 == null || I()) {
                this.r0 = l0(0.0f);
                M1(0.0f);
            } else {
                setSearchItemVisibility(I0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!H() || !this.F1 || (getClosestTab() != 8 && !J0(getClosestTab())))) {
                bs0[] bs0VarArr = this.n0;
                bs0 bs0Var2 = bs0VarArr[0];
                if (bs0Var2 != null && bs0Var2.F == 13 && (dq0Var = this.a0) != null) {
                    bi.m5 m5Var = dq0Var.n;
                    if (!z10) {
                    }
                }
                bs0 bs0Var3 = bs0VarArr[0];
                eq0 eq0Var = this.b0;
                if (bs0Var3 != null && bs0Var3.F == 14 && eq0Var != null) {
                    bi.m5 m5Var2 = eq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.F1 || (bs0Var = bs0VarArr[0]) == null || bs0Var.F != 13) && ((eq0Var == null || !eq0Var.g()) && (hq0Var == null || !hq0Var.f))) {
                    I1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    dr0Var.setEnabled(false);
                    bs0 bs0Var4 = bs0VarArr[1];
                    bs0Var4.F = i10;
                    bs0Var4.setVisibility(0);
                    this.k1 = z10;
                    B1(true);
                    if (z10) {
                        bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth());
                    } else {
                        bs0VarArr[1].setTranslationX(-bs0VarArr[0].getMeasuredWidth());
                    }
                    Z0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public SparseArray<org.telegram.messenger.fj> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        bs0 bs0Var;
        bs0 bs0Var2;
        fi.h6 h6Var;
        fi.h6 h6Var2;
        float f10 = 1.0f;
        bs0[] bs0VarArr = this.n0;
        if (bs0VarArr == null || (bs0Var = bs0VarArr[0]) == null || (bs0Var2 = bs0VarArr[1]) == null || bs0Var.w == null || bs0Var2.w == null) {
            return 1.0f;
        }
        int i7 = bs0Var.F;
        int i10 = bs0Var2.F;
        boolean z10 = J0(i7) || i7 == 8;
        boolean z11 = J0(i10) || i10 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - bs0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - bs0VarArr[1].w.getVisibilityFactor();
        dt0 z12 = z1(bs0VarArr[0].F);
        if (i7 == 8 || (z12 != null && (h6Var2 = z12.s) != null && h6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        dt0 z13 = z1(i10);
        if (i10 != 8 && (z13 == null || (h6Var = z13.s) == null || h6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(bs0VarArr[0].getTranslationX() / bs0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        bs0[] bs0VarArr = this.n0;
        bs0 bs0Var = bs0VarArr[1];
        if (bs0Var != null && bs0Var.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return bs0VarArr[1].F;
            }
            if (Math.abs(bs0VarArr[1].getTranslationX()) < bs0VarArr[1].getMeasuredWidth() / 2.0f) {
                return bs0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public ck0 getCurrentListView() {
        or0 or0Var;
        bs0 bs0Var = this.n0[0];
        int i7 = bs0Var.F;
        return i7 == 13 ? this.a0.getCurrentListView() : i7 == 14 ? this.b0.getCurrentListView() : (i7 != 12 || (or0Var = this.W) == null) ? bs0Var.h : or0Var.a.A0;
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

    public org.telegram.ui.ActionBar.r0 getSearchItem() {
        return this.q0;
    }

    public ph0 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        hq0 hq0Var = this.c0;
        if (hq0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = hq0Var.getCurrentAlbumId();
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
            bs0[] bs0VarArr = this.n0;
            if (i7 >= bs0VarArr.length) {
                return f10;
            }
            bs0 bs0Var = bs0VarArr[i7];
            if (bs0Var != null) {
                f10 = ((1.0f - Math.abs(bs0Var.getTranslationX() / getWidth())) * bs0Var.F) + f10;
            }
            i7++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.z6));
        int i7 = org.telegram.ui.ActionBar.n6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        org.telegram.ui.ActionBar.r0 r0Var = this.x0;
        if (r0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(r0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.w0;
        if (r0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(r0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        }
        Drawable[] drawableArr = {this.G0};
        int i10 = org.telegram.ui.ActionBar.n6.y8;
        ImageView imageView = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.xi));
        dr0 dr0Var = this.L0;
        arrayList.add(new org.telegram.ui.ActionBar.w6(dr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.wi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.vi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dr0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.yi));
        zq0 zq0Var = this.U0;
        if (zq0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(zq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.w6(zq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.w6(zq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.w6(zq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A7));
        }
        final int i11 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i11 >= bs0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.v6 v6Var = new org.telegram.ui.ActionBar.v6() { // from class: org.telegram.ui.Components.wp0
                @Override // org.telegram.ui.ActionBar.v6
                public final void b() {
                    bs0[] bs0VarArr2 = gt0.this.n0;
                    int i12 = i11;
                    lq0 lq0Var = bs0VarArr2[i12].h;
                    if (lq0Var != null) {
                        int childCount = lq0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = bs0VarArr2[i12].h.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.q7) {
                                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                                for (int i14 = 0; i14 < 6; i14++) {
                                    q7Var.a[i14].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                ((org.telegram.ui.Cells.h6) childAt).y(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                                ((org.telegram.ui.Cells.ra) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.v6
                public final /* synthetic */ void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.c7));
            int i12 = org.telegram.ui.ActionBar.n6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.n6));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.U7));
            int i13 = org.telegram.ui.ActionBar.n6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
            int i14 = org.telegram.ui.ActionBar.n6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.qj));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.q7.class}, (Paint) null, (Drawable[]) null, v6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.q7.class}, (Paint) null, (Drawable[]) null, v6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ci));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.i2.class}, (Paint) null, (Drawable[]) null, v6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.i2.class}, (Paint) null, (Drawable[]) null, v6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.y6));
            i11++;
        }
    }

    public int getTopPanelShift() {
        return this.p2;
    }

    public final int h0(int i7, int i10, boolean z10) {
        int i11 = i10 + (!z10 ? 1 : -1);
        if (i11 > 6) {
            i11 = !z10 ? 9 : 6;
        }
        return Utilities.j(i11, 9, (this.n1 && i7 == 1) ? 1 : 2);
    }

    public final int i0(boolean z10) {
        return this.b2 + this.f2 + (z10 ? org.telegram.messenger.g0.L(52.0f) : 0);
    }

    public final void i1(v4.i0 i0Var) {
        if (i0Var instanceof at0) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (i0Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        ps0 ps0Var = this.Q;
        if (i0Var == ps0Var) {
            ps0Var.r = null;
        }
    }

    public final int j0(int i7) {
        return n0(i7) + org.telegram.messenger.g0.L(54.0f) + this.d2 + this.e2 + this.p2 + (i7 == 9 ? org.telegram.messenger.g0.L(64.0f) : 0);
    }

    public final void j1() {
        int i7;
        int i10 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i10 >= bs0VarArr.length) {
                return;
            }
            lq0 lq0Var = bs0VarArr[i10].h;
            if (lq0Var != null) {
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < lq0Var.getChildCount(); i13++) {
                    View childAt = lq0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                        int messageId = p7Var.getMessageId();
                        i12 = p7Var.getTop();
                        i11 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                        int e12 = i7Var.getMessage().e1();
                        i12 = i7Var.getTop();
                        i11 = e12;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        i11 = h7Var.getMessage().e1();
                        i12 = h7Var.getTop();
                    }
                    if (i11 != 0) {
                        break;
                    }
                }
                if (i11 != 0) {
                    int i14 = bs0VarArr[i10].F;
                    int i15 = -1;
                    if (z0(i14)) {
                        dt0 z12 = z1(i14);
                        if (z12 != null && z12.s != null) {
                            int i16 = 0;
                            while (true) {
                                if (i16 >= z12.s.i.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.fj) z12.s.i.get(i16)).e1()) {
                                    i15 = i16;
                                    break;
                                }
                                i16++;
                            }
                        }
                        i7 = i15;
                    } else if (i14 >= 0) {
                        vs0[] vs0VarArr = this.w1;
                        if (i14 < vs0VarArr.length) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= vs0VarArr[i14].a.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.fj) vs0VarArr[i14].a.get(i17)).e1()) {
                                    i15 = i17;
                                    break;
                                }
                                i17++;
                            }
                            i7 = vs0VarArr[i14].m + i15;
                        }
                    }
                    if (i15 >= 0) {
                        ((v4.c0) lq0Var.getLayoutManager()).h1(i7, (-bs0VarArr[i10].h.getPaddingTop()) + i12);
                        if (this.r1) {
                            bs0 bs0Var = bs0VarArr[i10];
                            bs0Var.r.h1(i7, (-bs0Var.h.getPaddingTop()) + i12);
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
        bs0[] bs0VarArr = this.n0;
        bs0 bs0Var = bs0VarArr[1];
        if (bs0Var != null && v0(bs0Var.F)) {
            f11 = 0.0f + f10;
        }
        bs0 bs0Var2 = bs0VarArr[0];
        return (bs0Var2 == null || !v0(bs0Var2.F)) ? f11 : (1.0f - f10) + f11;
    }

    public final void k1(int i7) {
        dr0 dr0Var;
        if (this.P1 || (dr0Var = this.L0) == null) {
            return;
        }
        dr0Var.g(null, i7, dr0Var.Q.get(i7));
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        bs0[] bs0VarArr = this.n0;
        bs0 bs0Var = bs0VarArr[1];
        if (bs0Var != null && F0(bs0Var.F) && bs0VarArr[1].F != 11) {
            f11 = 0.0f + f10;
        }
        bs0 bs0Var2 = bs0VarArr[0];
        return (bs0Var2 == null || !F0(bs0Var2.F) || bs0VarArr[0].F == 11) ? f11 : (1.0f - f10) + f11;
    }

    public final void l1(float f10, int i7) {
        dr0 dr0Var = this.L0;
        if (dr0Var != null) {
            dr0Var.i(f10, J0(i7) ? 8 : i7);
        }
        hq0 hq0Var = this.c0;
        if (hq0Var != null) {
            f71 f71Var = hq0Var.b;
            if (J0(i7)) {
                f71Var.g(f10, w1(i7));
            } else if (i7 == 8) {
                f71Var.g(f10, 0);
            }
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean m() {
        return false;
    }

    public final int m0(int i7) {
        dt0 z12;
        fi.h6 h6Var;
        if (!z0(i7) || (z12 = z1(i7)) == null || (h6Var = z12.s) == null) {
            return 0;
        }
        return h6Var.g();
    }

    public final void m1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i7 >= bs0VarArr.length) {
                if (this.G == 0) {
                    tr0 tr0Var = this.d0;
                    tr0Var.d = chatFull;
                    tr0Var.e = arrayList;
                }
                P1(true);
                for (int i10 = 0; i10 < bs0VarArr.length; i10++) {
                    bs0 bs0Var = bs0VarArr[i10];
                    if (bs0Var.F == 7 && bs0Var.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(bs0VarArr[i10].h);
                    }
                }
                return;
            }
            bs0 bs0Var2 = bs0VarArr[i7];
            if (bs0Var2.F == 7 && bs0Var2.h.getAdapter() != null && bs0VarArr[i7].h.getAdapter().b() != 0 && this.y1.getMessagesController().R1().j.size() > 0) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final int n0(int i7) {
        hq0 hq0Var = this.c0;
        return (int) ((hq0Var == null || !(J0(i7) || i7 == 8)) ? 0.0f : hq0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f));
    }

    public final void n1(int i7, int i10, int i11, int i12) {
        this.c2 = true;
        this.d2 = i7;
        this.e2 = i10;
        this.f2 = i11;
        this.b2 = i12;
        G();
        eq0 eq0Var = this.b0;
        if (eq0Var != null) {
            if (eq0Var.M != i10 || eq0Var.N != i11) {
                eq0Var.M = i10;
                eq0Var.N = i11;
                eq0Var.setClipChildren(i10 == 0 && i11 == 0);
                eq0Var.h.setClipChildren(i10 == 0 && i11 == 0);
                eq0Var.n();
            }
            H1();
        }
        for (bs0 bs0Var : this.n0) {
            if (bs0Var != null) {
                bs0Var.setClipChildren(false);
                J1(bs0Var);
                setPageOverscan(bs0Var.h);
                setPageOverscan(bs0Var.n);
                int paddingTop = bs0Var.h.getPaddingTop();
                lq0 lq0Var = bs0Var.h;
                int paddingLeft = lq0Var.getPaddingLeft();
                lq0 lq0Var2 = bs0Var.h;
                int j02 = j0(bs0Var.F);
                lq0Var2.h3 = j02;
                int paddingRight = bs0Var.h.getPaddingRight();
                lq0 lq0Var3 = bs0Var.h;
                int i02 = i0(I0());
                lq0Var3.i3 = i02;
                lq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - bs0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(bs0Var.h, new op0(bs0Var, paddingTop2, 1));
                }
                bs0Var.w.setPadding(0, i7, 0, i12);
                or0 or0Var = this.W;
                if (or0Var != null && or0Var.getParent() == bs0Var) {
                    p1(org.telegram.messenger.g0.L(56.0f) + i7, or0Var);
                }
                dq0 dq0Var = this.a0;
                if (dq0Var != null && dq0Var.getParent() == bs0Var) {
                    p1(i7, dq0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void o1(int i7, boolean z10) {
        this.D0.a(i7, z10);
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        if (a5Var != null) {
            a5Var.E(i7, z10);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i7 >= bs0VarArr.length) {
                return;
            }
            lq0 lq0Var = bs0VarArr[i7].h;
            if (lq0Var != null) {
                lq0Var.getViewTreeObserver().addOnPreDrawListener(new jr0(this, i7, 0));
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return T() || this.L0.I || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        vr0 vr0Var = this.G1;
        int height = vr0Var.f() != null ? vr0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof bs0) {
                i11 = i7;
                measureChildWithMargins(childAt, i11, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                lq0 lq0Var = ((bs0) childAt).h;
                lq0Var.setPadding(0, lq0Var.f3, 0, lq0Var.g3);
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
        boolean z10;
        if (!this.P1) {
            org.telegram.ui.ActionBar.h2 h2Var = this.y1;
            if (h2Var.getParentLayout() != null && !((ActionBarLayout) h2Var.getParentLayout()).i() && !T() && !this.a) {
                if (motionEvent != null) {
                    if (this.E1 == null) {
                        this.E1 = VelocityTracker.obtain();
                    }
                    this.E1.addMovement(motionEvent);
                    hi.m3 m3Var = this.H1;
                    if (m3Var != null) {
                        m3Var.f(true);
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
                    bs0[] bs0VarArr = this.n0;
                    if (z11 && (((z10 = this.k1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!g1(motionEvent, x10 < 0)) {
                            this.B1 = true;
                            this.A1 = false;
                            bs0VarArr[0].setTranslationX(0.0f);
                            bs0VarArr[1].setTranslationX(this.k1 ? bs0VarArr[0].getMeasuredWidth() : -bs0VarArr[0].getMeasuredWidth());
                            l1(0.0f, bs0VarArr[1].F);
                            Z0(getTabProgress());
                        }
                    }
                    if (!this.B1 || this.A1) {
                        if (this.A1) {
                            bs0VarArr[0].setTranslationX(x10);
                            if (this.k1) {
                                bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                bs0VarArr[1].setTranslationX(x10 - bs0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / bs0VarArr[0].getMeasuredWidth();
                            if (I()) {
                                this.r0 = l0(abs2);
                                M1(abs2);
                                float k02 = k0(abs2);
                                this.s0 = k02;
                                this.u0.setVisibility((k02 == 0.0f || !I() || A0()) ? 4 : 0);
                            } else {
                                this.r0 = 0.0f;
                            }
                            I1(false);
                            l1(abs2, bs0VarArr[1].F);
                            Z0(getTabProgress());
                            Y0();
                        }
                    } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                        g1(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    v1(motionEvent);
                }
                return this.A1;
            }
        }
        return false;
    }

    public final float q0(int i7, boolean z10) {
        float width = getWidth();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i10 >= bs0VarArr.length) {
                break;
            }
            bs0 bs0Var = bs0VarArr[i10];
            if (bs0Var != null) {
                int i12 = bs0Var.F;
                if ((z10 && i7 == 8 && J0(i12)) || i12 == i7) {
                    i11++;
                    width = bs0VarArr[i10].getTranslationX();
                }
            }
            i10++;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        return width;
    }

    public void q1(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        this.F1 = z10;
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        if (a5Var != null) {
            if (z10) {
                O1();
                a5Var.J();
            } else {
                a5Var.w();
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
        this.R1.addListener(new org.telegram.ui.on(20, this, z10));
        this.R1.start();
        if (z10) {
            O1();
        }
    }

    public final float r0(int i7, boolean z10) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i10 >= bs0VarArr.length) {
                return f10;
            }
            bs0 bs0Var = bs0VarArr[i10];
            if (bs0Var != null) {
                int i11 = bs0Var.F;
                if ((z10 && i7 == 8 && J0(i11)) || i11 == i7) {
                    f10 = (1.0f - Math.abs(bs0VarArr[i10].getTranslationX() / getWidth())) + f10;
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
    public final void r1(int i7, boolean z10) {
        int i10;
        bs0 g02;
        if (z10 && getY() != 0.0f && this.F == 1) {
            return;
        }
        if (z10 && z0(i7) && m0(i7) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.m1);
        bundle.putLong("topic_id", this.G);
        vs0[] vs0VarArr = this.w1;
        if (z10 && (g02 = g0(0)) != null) {
            ArrayList arrayList = vs0VarArr[0].e;
            int L0 = g02.x.L0();
            if (L0 >= 0) {
                gs0 gs0Var = null;
                if (arrayList != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((gs0) arrayList.get(i11)).b) {
                            gs0Var = (gs0) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (gs0Var == null) {
                        gs0Var = (gs0) i5.c.h(1, arrayList);
                    }
                }
                if (gs0Var != null) {
                    i10 = gs0Var.c;
                    if (i7 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i7 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.i8 i8Var = new org.telegram.ui.i8(vs0VarArr[0].q, i10, bundle);
                    i8Var.N = new hn(this, 5);
                    this.y1.presentFragment(i8Var);
                }
            }
        }
        i10 = 0;
        if (i7 != 9) {
        }
        org.telegram.ui.i8 i8Var2 = new org.telegram.ui.i8(vs0VarArr[0].q, i10, bundle);
        i8Var2.N = new hn(this, 5);
        this.y1.presentFragment(i8Var2);
    }

    public final int s0(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.I1;
        return i6Var != null ? i6Var.k(i7) : org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    public final void s1(int i7) {
        int w12 = w1(getClosestTab());
        hq0 hq0Var = this.c0;
        if (w12 != i7) {
            if (hq0Var != null) {
                hq0Var.b.e(i7, hq0Var.d.i(i7));
                return;
            }
            return;
        }
        hq0Var.setReorderingAlbums(true);
        ft0 x12 = x1(i7);
        bs0 g02 = g0(x12.a);
        if (g02 == null) {
            return;
        }
        lq0 lq0Var = g02.h;
        for (int i10 = 0; i10 < lq0Var.getChildCount(); i10++) {
            View childAt = lq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p7) {
                ((org.telegram.ui.Cells.p7) childAt).l(true, true);
            }
        }
        et0 et0Var = x12.c;
        if (et0Var != null && !et0Var.y) {
            et0Var.y = true;
        }
        I1(true);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.g1;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.g1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f1 == 0) {
                this.f1 = -j3;
                int i7 = 0;
                while (true) {
                    vs0[] vs0VarArr = this.w1;
                    if (i7 >= vs0VarArr.length) {
                        break;
                    }
                    if (vs0VarArr[i7].b[1].size() == 0) {
                        vs0 vs0Var = vs0VarArr[i7];
                        vs0Var.j[1] = this.g1.migrated_from_max_id;
                        vs0Var.i[1] = false;
                    }
                    i7++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        dr0 dr0Var = this.L0;
        if (dr0Var != null) {
            dr0Var.setInitialTabId(A0() ? 9 : 8);
        }
        P1(true);
        B1(false);
    }

    public void setCommonGroupsCount(int i7) {
        if (this.G == 0) {
            this.a1[6] = i7;
        }
        P1(true);
        N();
    }

    public void setForwardRestrictedHint(hi.m3 m3Var) {
        this.H1 = m3Var;
    }

    public void setMergeDialogId(long j3) {
        this.f1 = j3;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i7 = 0;
        while (true) {
            iArr2 = this.a1;
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
        this.k2 = runnable;
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.O1 = i10;
        int i13 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i13 >= bs0VarArr.length) {
                break;
            }
            bs0VarArr[i13].setTranslationY(this.O1);
            i13++;
        }
        if (this.S0 != null) {
            U();
        } else {
            zq0 zq0Var = this.U0;
            if (zq0Var != null) {
                zq0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.R0 = i10;
        org.telegram.ui.Cells.v0 v0Var = this.N0;
        v0Var.setTranslationY((v0Var.getTag() == null ? -org.telegram.messenger.g0.L(48.0f) : 0) + this.R0);
    }

    public void setPagesGlassEngine(ri.q qVar) {
        this.h2 = qVar;
        eq0 eq0Var = this.b0;
        if (eq0Var != null) {
            eq0Var.setGlassEngine(qVar);
        }
        for (bs0 bs0Var : this.n0) {
            if (bs0Var != null) {
                bs0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(bs0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i7) {
        if (this.b2 != i7) {
            this.b2 = i7;
            bs0[] bs0VarArr = this.n0;
            if (bs0VarArr != null) {
                for (bs0 bs0Var : bs0VarArr) {
                    if (bs0Var != null) {
                        lq0 lq0Var = bs0Var.h;
                        int paddingLeft = lq0Var.getPaddingLeft();
                        lq0 lq0Var2 = bs0Var.h;
                        int i10 = lq0Var2.f3;
                        int paddingRight = lq0Var2.getPaddingRight();
                        lq0 lq0Var3 = bs0Var.h;
                        int i02 = i0(I0());
                        lq0Var3.i3 = i02;
                        lq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i7) {
        if (this.g2 != i7) {
            this.g2 = i7;
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
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i7 >= bs0VarArr.length) {
                return;
            }
            F1(bs0VarArr[i7], true);
            i7++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.h1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.h1 = userFull;
        P1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        k1(8);
    }

    public void setVisibleHeight(int i7) {
        this.Q1 = i7;
        int i10 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i10 >= bs0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i7, org.telegram.messenger.g0.L(bs0VarArr[i10].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            bs0VarArr[i10].w.setTranslationY(f10);
            bs0VarArr[i10].s.setTranslationY(-f10);
            i10++;
        }
        dq0 dq0Var = this.a0;
        if (dq0Var != null) {
            dq0Var.setVisibleHeight(i7);
        }
        eq0 eq0Var = this.b0;
        if (eq0Var != null) {
            eq0Var.setVisibleHeight(i7);
        }
    }

    public final boolean t0() {
        return this.y1.getConnectionsManager().getConnectionState() == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t1(boolean z10) {
        bs0[] bs0VarArr;
        bs0 bs0Var;
        if (this.r1) {
            return;
        }
        int i7 = 0;
        while (true) {
            bs0VarArr = this.n0;
            if (i7 >= bs0VarArr.length) {
                bs0Var = null;
                break;
            }
            int i10 = bs0VarArr[i7].F;
            if (i10 == 0 || z0(i10)) {
                break;
            } else {
                i7++;
            }
        }
        if (bs0Var != null) {
            int i11 = bs0Var.F;
            this.s1 = i11;
            boolean z02 = z0(i11);
            int[] iArr = this.p1;
            int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], z10);
            this.t1 = h02;
            if (h02 != iArr[z02 ? 1 : 0]) {
                if (this.n1 && z0(this.s1)) {
                    return;
                }
                bs0Var.n.setVisibility(0);
                if (z0(this.s1)) {
                    bs0Var.n.setAdapter(A1(this.s1));
                } else {
                    bs0Var.n.setAdapter(this.L);
                }
                as0 as0Var = bs0Var.n;
                as0Var.setPadding(as0Var.getPaddingLeft(), j0(this.s1), bs0Var.n.getPaddingRight(), i0(I0()));
                bs0Var.r.y1(h02);
                bs0Var.n.a0();
                bs0Var.r.O = new br0(this, bs0Var, 0);
                org.telegram.messenger.g0.Z3(bs0Var.h);
                this.r1 = true;
                if (this.s1 == 0) {
                    this.w1[0].g(true);
                }
                this.q1 = 0.0f;
                if (this.s < 0) {
                    j1();
                    return;
                }
                for (bs0 bs0Var2 : bs0VarArr) {
                    if (bs0Var2.F == this.s1) {
                        bs0Var2.r.h1(this.s, this.w - bs0Var2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final void u(org.telegram.ui.Cells.u2 u2Var) {
        org.telegram.ui.ActionBar.h2 h2Var = this.y1;
        if (h2Var != null && h2Var.getMessagesController().R1().K(u2Var.getDialogId())) {
            h2Var.getOrCreateStoryViewer().getClass();
            fi.f9 orCreateStoryViewer = h2Var.getOrCreateStoryViewer();
            Context context = h2Var.getContext();
            long dialogId = u2Var.getDialogId();
            fi.y6 a10 = fi.y6.a((ck0) u2Var.getParent());
            a10.s += ((h2Var instanceof ProfileActivity) && ((ProfileActivity) h2Var).s1) ? org.telegram.messenger.g0.L(68.0f) : 0;
            orCreateStoryViewer.J(context, dialogId, a10);
        }
    }

    public final boolean u0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i7 = 1; i7 >= 0; i7--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.c1;
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
                if (num.intValue() > 0 && (fjVar = (org.telegram.messenger.fj) sparseArrayArr[i7].get(num.intValue())) != null && (message = fjVar.k) != null && message.noforwards) {
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

    public final void u1() {
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.n0;
            if (i7 >= bs0VarArr.length) {
                return;
            }
            int childCount = bs0VarArr[i7].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = bs0VarArr[i7].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.i2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) childAt).getPhotoImage();
                    if (i7 == 0) {
                        photoImage.u0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.u0 = false;
                        photoImage.Q0();
                    }
                }
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.J1.a(s0(org.telegram.ui.ActionBar.n6.d6));
            org.telegram.ui.ActionBar.y1 y1Var = this.G0;
            if (y1Var != null) {
                y1Var.a(s0(org.telegram.ui.ActionBar.n6.y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.n6.y8));
            }
            D1();
            invalidate();
            for (bs0 bs0Var : this.n0) {
                if (bs0Var != null && bs0Var.M) {
                    bs0Var.invalidate();
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
        return i7 == 14 && this.b0 != null;
    }

    public final void v1(MotionEvent motionEvent) {
        float f10;
        float f11;
        float measuredWidth;
        VelocityTracker velocityTracker = this.E1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(1000, this.V0);
        int i7 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            f10 = this.E1.getXVelocity();
            f11 = this.E1.getYVelocity();
            if (!this.A1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                g1(motionEvent, f10 < 0.0f);
            }
        }
        if (this.A1) {
            bs0[] bs0VarArr = this.n0;
            float x10 = bs0VarArr[0].getX();
            this.i1 = new AnimatorSet();
            this.l1 = Math.abs(x10) < ((float) bs0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new e60(this, 20));
            boolean z10 = this.l1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.k1) {
                    this.i1.playTogether(ObjectAnimator.ofFloat(bs0VarArr[0], (Property<bs0, Float>) property, 0.0f), ObjectAnimator.ofFloat(bs0VarArr[1], (Property<bs0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.i1.playTogether(ObjectAnimator.ofFloat(bs0VarArr[0], (Property<bs0, Float>) property, 0.0f), ObjectAnimator.ofFloat(bs0VarArr[1], (Property<bs0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = bs0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.k1) {
                    this.i1.playTogether(ObjectAnimator.ofFloat(bs0VarArr[0], (Property<bs0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(bs0VarArr[1], (Property<bs0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.i1.playTogether(ObjectAnimator.ofFloat(bs0VarArr[0], (Property<bs0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(bs0VarArr[1], (Property<bs0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.i1.setInterpolator(u2);
            int measuredWidth2 = getMeasuredWidth();
            float f12 = measuredWidth2 / 2;
            float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
            this.i1.setDuration(Math.max(org.telegram.messenger.ks.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.i1.addListener(new gr0(this, i7));
            this.i1.start();
            this.j1 = true;
            this.A1 = false;
            Y0();
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

    public final void w0() {
        org.telegram.messenger.g0.r(this.P0);
        org.telegram.ui.Cells.v0 v0Var = this.N0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.TRANSLATION_Y, (-org.telegram.messenger.g0.L(48.0f)) + this.R0));
        this.O0.setInterpolator(lr.g);
        this.O0.addListener(new gr0(this, 0));
        this.O0.start();
    }

    public final int w1(int i7) {
        ft0 y12 = y1(i7);
        if (y12 == null) {
            return -1;
        }
        return y12.b;
    }

    public boolean x0() {
        return false;
    }

    public final ft0 x1(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.m2;
        ft0 ft0Var = (ft0) hashMap.get(valueOf);
        if (ft0Var != null) {
            return ft0Var;
        }
        ft0 ft0Var2 = new ft0(this, getContext(), i7);
        hashMap.put(Integer.valueOf(i7), ft0Var2);
        this.n2.put(Integer.valueOf(ft0Var2.a), Integer.valueOf(i7));
        return ft0Var2;
    }

    public boolean y0() {
        return !(this instanceof z20);
    }

    public final ft0 y1(int i7) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i7));
        if (num == null) {
            return null;
        }
        return (ft0) this.m2.get(num);
    }

    public final void z(View view) {
        bs0[] bs0VarArr = this.n0;
        addView(view, Math.max(indexOfChild(bs0VarArr[0]), indexOfChild(bs0VarArr[1])) + 1, c8.ma.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final dt0 z1(int i7) {
        ft0 y12;
        if (i7 == 8) {
            return this.f0;
        }
        if (i7 == 9) {
            return this.h0;
        }
        if (!J0(i7) || (y12 = y1(i7)) == null) {
            return null;
        }
        return y12.c;
    }

    public void P0(SparseArray sparseArray) {
    }

    public void X0(boolean z10) {
    }

    public int h1(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.Cells.q2
    public final void l(org.telegram.ui.Cells.u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void r(org.telegram.ui.Cells.u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void w(org.telegram.ui.Cells.u2 u2Var) {
    }

    public void Q0() {
    }

    public void W0() {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void q() {
    }
}
