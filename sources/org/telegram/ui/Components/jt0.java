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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class jt0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.gs, org.telegram.ui.Cells.q2, yj0 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final dq0 u2 = new dq0(0);
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
    public final yz E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final int F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final org.telegram.ui.ActionBar.x1 G0;
    public final xr0 G1;
    public final org.telegram.ui.ActionBar.k H;
    public final ArrayList H0;
    public hi.l3 H1;
    public final org.telegram.ui.ActionBar.z4 I;
    public final ArrayList I0;
    public final org.telegram.ui.ActionBar.h6 I1;
    public final org.telegram.ui.ActionBar.g5 J;
    public final ArrayList J0;
    public final ui.c J1;
    public final pr0 K;
    public final ArrayList K0;
    public final xi.e K1;
    public final dt0 L;
    public final fr0 L0;
    public boolean L1;
    public final xs0 M;
    public final cr0 M0;
    public final h2.f M1;
    public final ws0 N;
    public final org.telegram.ui.Cells.v0 N0;
    public org.telegram.ui.f0 N1;
    public final ws0 O;
    public AnimatorSet O0;
    public int O1;
    public final ws0 P;
    public final hp0 P0;
    public boolean P1;
    public final ss0 Q;
    public final ArrayList Q0;
    public int Q1;
    public final yr0 R;
    public float R0;
    public AnimatorSet R1;
    public final wr0 S;
    public final es S0;
    public final SparseArray S1;
    public final ur0 T;
    public final FrameLayout T0;
    public long T1;
    public final us0 U;
    public final br0 U0;
    public boolean U1;
    public final vs0 V;
    public final int V0;
    public int V1;
    public final qr0 W;
    public final Paint W0;
    public final mr0 W1;
    public boolean X0;
    public fi.h6 X1;
    public boolean Y0;
    public float Y1;
    public ch.p0 Z0;
    public boolean Z1;
    public boolean a;
    public final fq0 a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final gq0 b0;
    public int b1;
    public int b2;
    public boolean c;
    public final jq0 c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final vr0 d0;
    public int d1;
    public int d2;
    public int e;
    public final v4.z e0;
    public boolean e1;
    public int e2;
    public int f;
    public final sr0 f0;
    public long f1;
    public int f2;
    public final gt0 g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final eq0 h0;
    public TLRPC.UserFull h1;
    public ri.q h2;
    public final gt0 i0;
    public AnimatorSet i1;
    public float i2;
    public final gs0 j0;
    public boolean j1;
    public final RectF j2;
    public final gs0 k0;
    public boolean k1;
    public Runnable k2;
    public final gs0 l0;
    public boolean l1;
    public int l2;
    public final bs0 m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final ds0[] n0;
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
    public final pq0 u1;
    public final rh0 v0;
    public float v1;
    public int w;
    public final org.telegram.ui.ActionBar.q0 w0;
    public final ys0[] w1;
    public int x;
    public final org.telegram.ui.ActionBar.q0 x0;
    public final bt0 x1;
    public final Rect y;
    public final org.telegram.ui.ActionBar.q0 y0;
    public final org.telegram.ui.ActionBar.g2 y1;
    public final org.telegram.ui.ActionBar.q0 z0;
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
    public jt0(Context context, long j3, bt0 bt0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, org.telegram.ui.ActionBar.g2 g2Var, xr0 xr0Var, int i12, org.telegram.ui.ActionBar.h6 h6Var, dh.c cVar) {
        super(context);
        int i13;
        TLRPC.ProfileTab profileTab;
        long j10;
        int i14;
        ys0[] ys0VarArr;
        int i15;
        cr0 cr0Var;
        int i16;
        int i17;
        us0 us0Var;
        float f10;
        org.telegram.ui.ActionBar.h6 h6Var2;
        float f11;
        org.telegram.ui.ActionBar.g5 g5Var;
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.h6 h6Var3;
        dh.c cVar2;
        boolean z10;
        dh.c cVar3;
        int i18;
        int i19;
        int i20;
        ds0[] ds0VarArr;
        View view;
        ?? r92;
        jt0 jt0Var;
        jq0 jq0Var;
        boolean z11;
        cs0 cs0Var;
        int i21;
        int i22;
        lq0 lq0Var;
        cs0 cs0Var2;
        cs0 cs0Var3;
        cs0 cs0Var4;
        cs0 cs0Var5;
        cs0 cs0Var6;
        cs0 cs0Var7;
        cs0 cs0Var8;
        cs0 cs0Var9;
        cs0 cs0Var10;
        cs0 cs0Var11;
        cs0 cs0Var12;
        cs0 cs0Var13;
        cs0 cs0Var14;
        cs0 cs0Var15;
        cs0 cs0Var16;
        nv0 nv0Var;
        nv0 nv0Var2;
        nv0 nv0Var3;
        nv0 nv0Var4;
        nv0 nv0Var5;
        nv0 nv0Var6;
        nv0 nv0Var7;
        nv0 nv0Var8;
        nv0 nv0Var9;
        nv0 nv0Var10;
        cs0 cs0Var17;
        nv0 nv0Var11;
        cs0 cs0Var18;
        cs0 cs0Var19;
        ds0 ds0Var;
        lq0 lq0Var2;
        cs0 cs0Var20;
        org.telegram.ui.ActionBar.q0 a10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        jt0 jt0Var2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        jt0Var2.y = new Rect();
        jt0Var2.n0 = new ds0[2];
        jt0Var2.H0 = new ArrayList(10);
        jt0Var2.I0 = new ArrayList(10);
        jt0Var2.J0 = new ArrayList(10);
        jt0Var2.K0 = new ArrayList(10);
        jt0Var2.P0 = new hp0(jt0Var2, 0);
        jt0Var2.Q0 = new ArrayList();
        jt0Var2.W0 = new Paint();
        jt0Var2.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        jt0Var2.n1 = false;
        jt0Var2.o1 = false;
        jt0Var2.p1 = new int[]{3, 3};
        jt0Var2.u1 = new pq0(jt0Var2);
        jt0Var2.v1 = -5.0f;
        jt0Var2.w1 = new ys0[9];
        jt0Var2.M1 = new h2.f(1);
        jt0Var2.S1 = new SparseArray();
        jt0Var2.V1 = -1;
        jt0Var2.W1 = new mr0(jt0Var2);
        jt0Var2.Y1 = 0.0f;
        jt0Var2.g2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        jt0Var2.j2 = new RectF();
        jt0Var2.l2 = -1;
        jt0Var2.m2 = new HashMap();
        jt0Var2.n2 = new HashMap();
        jt0Var2.q2 = true;
        ui.c cVar4 = new ui.c();
        jt0Var2.J1 = cVar4;
        cVar4.a(jt0Var2.s0(org.telegram.ui.ActionBar.m6.d6));
        dh.c cVar5 = cVar == null ? new dh.c(cVar4) : cVar;
        jt0Var2.F = i12;
        jt0Var2.I1 = h6Var;
        yz yzVar = new yz(context);
        jt0Var2.E = yzVar;
        yzVar.setIsSingleCell(true);
        TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(j3));
        jt0Var2.x1 = bt0Var;
        jt0Var2.G1 = xr0Var;
        int[] iArr = bt0Var.c;
        long j11 = bt0Var.s;
        jt0Var2.G = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i7 : 0, iArr[7], iArr[8]};
        jt0Var2.a1 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i13 = 1;
                profileTab = null;
                if (i10 != 14 || i10 == 10 || i10 == 11 || i10 == 6) {
                    jt0Var2.b1 = i10;
                } else if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    jt0Var2.b1 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    jt0Var2.b1 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || jt0Var2.I0()))) {
                    jt0Var2.b1 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[i13];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            jt0Var2.b1 = i13;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[5]) == i23 || i27 > 0)) {
                        jt0Var2.b1 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        jt0Var2.b1 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        jt0Var2.b1 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        jt0Var2.b1 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || jt0Var2.I0())) {
                        jt0Var2.b1 = jt0Var2.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i10 == -1 || j11 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = jt0Var2.a1;
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
                            jt0Var2.b1 = i10;
                        }
                    } else {
                        jt0Var2.b1 = 14;
                    }
                } else {
                    jt0Var2.b1 = 14;
                }
                jt0Var2.Z0(i10);
                jt0Var2.g1 = chatFull2;
                jt0Var2.h1 = userFull;
                if (chatFull2 != null) {
                    jt0Var2.f1 = -chatFull2.migrated_from_chat_id;
                }
                j10 = j3;
                jt0Var2.m1 = j10;
                i14 = 0;
                while (true) {
                    ys0VarArr = jt0Var2.w1;
                    if (i14 < ys0VarArr.length) {
                        break;
                    }
                    ys0VarArr[i14] = new ys0();
                    jt0Var2.w1[i14].j[0] = org.telegram.messenger.n5.C(jt0Var2.m1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    jt0Var2.w1[i14].j[1] = Integer.MAX_VALUE;
                    jt0Var2.a0(i14);
                    if (jt0Var2.f1 != 0 && jt0Var2.g1 != null && jt0Var2.w1[i14].b[1].size() == 0) {
                        ys0 ys0Var = jt0Var2.w1[i14];
                        ys0Var.j[1] = jt0Var2.g1.migrated_from_max_id;
                        ys0Var.i[1] = false;
                    }
                    i14++;
                }
                jt0Var2.y1 = g2Var;
                jt0Var2.H = g2Var.getActionBar();
                jt0Var2.I = g2Var.getSimpleActionBar();
                jt0Var2.p1[0] = jt0Var2.e1() > 0 ? org.telegram.messenger.cz.t1 : jt0Var2.e1();
                jt0Var2.p1[1] = jt0Var2.e1() > 0 ? org.telegram.messenger.cz.u1 : jt0Var2.e1();
                org.telegram.messenger.ls notificationCenter = g2Var.getNotificationCenter();
                notificationCenter.getClass();
                xi.e eVar = new xi.e(notificationCenter, jt0Var2);
                eVar.c(org.telegram.messenger.ls.V);
                eVar.c(org.telegram.messenger.ls.w);
                eVar.c(1);
                eVar.c(org.telegram.messenger.ls.K);
                eVar.c(org.telegram.messenger.ls.f2);
                eVar.c(org.telegram.messenger.ls.g2);
                eVar.c(org.telegram.messenger.ls.h2);
                eVar.c(org.telegram.messenger.ls.A5);
                eVar.c(org.telegram.messenger.ls.y5);
                eVar.c(org.telegram.messenger.ls.h3);
                eVar.c(org.telegram.messenger.ls.i3);
                eVar.c(org.telegram.messenger.ls.s);
                eVar.c(org.telegram.messenger.ls.I3);
                eVar.c(org.telegram.messenger.ls.Z3);
                eVar.c(org.telegram.messenger.ls.f1);
                jt0Var2.K1 = eVar;
                for (i15 = 0; i15 < 10; i15++) {
                    if (i10 == 4) {
                        ar0 ar0Var = new ar0(jt0Var2, context);
                        ar0Var.U.c();
                        jt0Var2.J0.add(ar0Var);
                    }
                }
                jt0Var2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                jt0Var2.Y0 = false;
                jt0Var2.Z0 = null;
                cr0Var = jt0Var2.M0;
                if (cr0Var != null) {
                    cr0Var.g(false);
                }
                jt0Var2.X0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                jt0Var2.B0 = drawable;
                org.telegram.ui.ActionBar.t6.x(jt0Var2, drawable, org.telegram.ui.ActionBar.m6.b7, h6Var, PorterDuff.Mode.MULTIPLY);
                fr0 fr0Var = jt0Var2.L0;
                int currentTabId = fr0Var == null ? fr0Var.getCurrentTabId() : i10;
                fr0 fr0Var2 = new fr0(jt0Var2, context, jt0Var2.I1);
                i16 = jt0Var2.b1;
                if (i16 != -1) {
                    fr0Var2.setInitialTabId(i16);
                    jt0Var2.b1 = -1;
                }
                fr0Var2.c0 = 320L;
                int i32 = org.telegram.ui.ActionBar.m6.a;
                int i33 = org.telegram.ui.ActionBar.m6.wi;
                int i34 = org.telegram.ui.ActionBar.m6.vi;
                int i35 = org.telegram.ui.ActionBar.m6.a;
                fr0Var2.M = i33;
                fr0Var2.N = i34;
                fr0Var2.updateColors();
                fr0Var2.setUseMinimalWidth(true);
                fr0Var2.setDelegate(new hr0(jt0Var2));
                jt0Var2.L0 = fr0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    jt0Var2.c1[i17].clear();
                }
                jt0Var2.d1 = 0;
                jt0Var2.Q0.clear();
                us0Var = jt0Var2.U;
                if (us0Var != null) {
                    us0Var.x.clear();
                }
                if (jt0Var2 instanceof c30) {
                    org.telegram.ui.ActionBar.z4 z4Var = jt0Var2.I;
                    if (z4Var != null) {
                        org.telegram.ui.ActionBar.f5 t6 = z4Var.t();
                        a10 = t6.b(0, R.drawable.outline_header_search);
                        if (!jt0Var2.A0() && !jt0Var2.G0()) {
                            org.telegram.ui.ActionBar.g5 b10 = t6.b(0, R.drawable.ic_ab_other);
                            jt0Var2.J = b10;
                            b10.setContentDescription(org.telegram.messenger.hd.M0(2131754838));
                            b10.Z(false, false);
                        }
                        f10 = 10.0f;
                    } else {
                        org.telegram.ui.ActionBar.y s5 = jt0Var2.H.s();
                        s5.addOnLayoutChangeListener(new gr0(jt0Var2));
                        f10 = 10.0f;
                        if (jt0Var2.m1 == jt0Var2.y1.getUserConfig().e() && (jt0Var2.y1 instanceof k90) && jt0Var2.I()) {
                            jt0Var2.p0 = s5.a(11, R.drawable.outline_header_search);
                        }
                        a10 = s5.a(0, 0);
                    }
                    org.telegram.ui.ActionBar.q0 K = a10.N().K(new nr0(jt0Var2));
                    jt0Var2.q0 = K;
                    cr0 cr0Var2 = jt0Var2.M0;
                    K.setSearchFieldHint(org.telegram.messenger.hd.M0((cr0Var2 != null && cr0Var2.a() && jt0Var2.getSelectedTab() == 11) ? 2131745672 : 2131745640));
                    K.setContentDescription(org.telegram.messenger.hd.N0(2131745640, "Search"));
                    if (jt0Var2.I != null) {
                        ((org.telegram.ui.ActionBar.g5) K).Z(false, false);
                    } else {
                        K.setTranslationY(org.telegram.messenger.g0.L(f10));
                        jt0Var2.setSearchItemVisibility(jt0Var2.I0() ? 8 : 4);
                    }
                } else {
                    f10 = 10.0f;
                }
                ImageView imageView = new ImageView(context);
                jt0Var2.u0 = imageView;
                imageView.setContentDescription(org.telegram.messenger.hd.N0(2131754838, "AccDescrMoreOptions"));
                imageView.setTranslationY(org.telegram.messenger.g0.L(f10));
                imageView.setVisibility(4);
                if (jt0Var2.I == null || jt0Var2.A0() || jt0Var2.G0()) {
                    h6Var2 = h6Var;
                    f11 = 2.0f;
                } else {
                    jt0Var2.H.addView(imageView, c8.ma.e(48, 56, 85));
                    rh0 rh0Var = new rh0(context);
                    jt0Var2.v0 = rh0Var;
                    rh0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    rh0Var.e(R.raw.options_to_search, 24, 24);
                    f11 = 2.0f;
                    rh0Var.getAnimatedDrawable().G *= 2.0f;
                    rh0Var.getAnimatedDrawable().h = true;
                    h6Var2 = h6Var;
                    org.telegram.ui.ActionBar.t6.s(rh0Var, org.telegram.ui.ActionBar.m6.y8, h6Var2, PorterDuff.Mode.SRC_IN);
                    rh0Var.setVisibility(8);
                    jt0Var2.H.addView(rh0Var, c8.ma.e(48, 56, 85));
                }
                imageView.setOnClickListener(new ip0(jt0Var2, 0));
                g5Var = jt0Var2.J;
                if (g5Var != null) {
                    g5Var.setOnClickListener(new ip0(jt0Var2, 1));
                }
                q0Var = jt0Var2.q0;
                if (q0Var != null && jt0Var2.I == null) {
                    EditTextBoldCursor searchField = q0Var.getSearchField();
                    int i36 = org.telegram.ui.ActionBar.m6.G6;
                    org.telegram.ui.ActionBar.t6.U(searchField, i36, h6Var2);
                    org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Jj, h6Var2);
                    org.telegram.ui.ActionBar.t6.v(searchField, i36, h6Var2);
                }
                jt0Var2.A0 = 0;
                LinearLayout linearLayout = new LinearLayout(context);
                jt0Var2.E0 = linearLayout;
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                linearLayout.setVisibility(4);
                ImageView imageView2 = new ImageView(context);
                jt0Var2.F0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(true);
                jt0Var2.G0 = x1Var;
                imageView2.setImageDrawable(x1Var);
                int i37 = org.telegram.ui.ActionBar.m6.y8;
                x1Var.a(jt0Var2.s0(i37));
                int i38 = org.telegram.ui.ActionBar.m6.z8;
                org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.g0(jt0Var2.s0(i38), 1), null, org.telegram.ui.ActionBar.t6.M(i38), h6Var2);
                imageView2.setContentDescription(org.telegram.messenger.hd.N0(2131752029, "Close"));
                linearLayout.addView(imageView2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
                jt0Var2.Q0.add(imageView2);
                imageView2.setOnClickListener(new ip0(jt0Var2, 2));
                NumberTextView numberTextView = new NumberTextView(context);
                jt0Var2.D0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(org.telegram.messenger.g0.o());
                numberTextView.setTextColor(jt0Var2.s0(i37));
                linearLayout.addView(numberTextView, c8.ma.m(1.0f, 0, -1, 18, 0, 0));
                jt0Var2.Q0.add(numberTextView);
                if (!org.telegram.messenger.n5.C(jt0Var2.m1)) {
                    if (!jt0Var2.I0()) {
                        jt0Var2.x0 = jt0Var2.W(context, org.telegram.messenger.ls.n1, R.drawable.msg_message, org.telegram.messenger.hd.M0(2131754877));
                        jt0Var2.w0 = jt0Var2.W(context, 100, R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750570));
                    }
                    org.telegram.ui.ActionBar.q0 W = jt0Var2.W(context, org.telegram.messenger.ls.o1, R.drawable.msg_pin, org.telegram.messenger.hd.M0(2131747051));
                    jt0Var2.y0 = W;
                    W.setVisibility(8);
                    org.telegram.ui.ActionBar.q0 W2 = jt0Var2.W(context, org.telegram.messenger.ls.p1, R.drawable.msg_unpin, org.telegram.messenger.hd.M0(2131743599));
                    jt0Var2.z0 = W2;
                    W2.setVisibility(8);
                    jt0Var2.G1();
                }
                jt0Var2.o0 = jt0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131751586, "Delete"));
                jt0Var2.K = new pr0(jt0Var2, context);
                jt0Var2.L = new dt0(jt0Var2, context);
                jt0Var2.N = new ws0(jt0Var2, context, 1);
                jt0Var2.O = new ws0(jt0Var2, context, 2);
                jt0Var2.P = new ws0(jt0Var2, context, 4);
                jt0Var2.Q = new ss0(jt0Var2, context, jt0Var2.y1.getCurrentAccount(), jt0Var2.y1.getResourceProvider());
                jt0Var2.R = new yr0(jt0Var2, context);
                jt0Var2.j0 = new gs0(jt0Var2, context, 1);
                jt0Var2.k0 = new gs0(jt0Var2, context, 4);
                jt0Var2.l0 = new gs0(jt0Var2, context, 3);
                jt0Var2.m0 = new bs0(jt0Var2, context);
                jt0Var2.S = new wr0(jt0Var2, context);
                jt0Var2.T = new ur0(jt0Var2, context);
                jt0Var2.U = new us0(jt0Var2, context);
                jt0Var2.V = new vs0(jt0Var2, context);
                if (!jt0Var2.I0() && !jt0Var2.x0() && jt0Var2.G == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", jt0Var2.y1.getUserConfig().e());
                    bundle.putInt("chatMode", 3);
                    qr0 qr0Var = new qr0(jt0Var2, context, jt0Var2.y1.getParentLayout(), bundle);
                    jt0Var2.W = qr0Var;
                    long j12 = jt0Var2.m1;
                    org.telegram.ui.cn cnVar = qr0Var.a;
                    cnVar.s4 = j12;
                    cnVar.nb = true;
                    qr0Var.setClipToOutline(true);
                    qr0Var.setOutlineProvider(new rr0());
                }
                vr0 vr0Var = new vr0(jt0Var2, context);
                jt0Var2.d0 = vr0Var;
                if (jt0Var2.G == 0) {
                    vr0Var.e = arrayList;
                    vr0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                jt0Var2.f0 = new sr0(jt0Var2, context);
                jt0Var2.e0 = new v4.z(new tr0(jt0Var2));
                jt0Var2.g0 = new gt0(jt0Var2, context, false);
                jt0Var2.h0 = new eq0(jt0Var2, context);
                jt0Var2.i0 = new gt0(jt0Var2, context, true);
                jt0Var2.M = new xs0(jt0Var2, context);
                if (jt0Var2.B0()) {
                    if (jt0Var2.y1 instanceof ProfileActivity) {
                        TextView textView = new TextView(context);
                        jt0Var2.t0 = textView;
                        textView.setText(org.telegram.messenger.hd.M0(2131745750).toUpperCase());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        int i39 = org.telegram.ui.ActionBar.m6.Fi;
                        org.telegram.ui.ActionBar.t6.U(textView, i39, h6Var2);
                        textView.setTextSize(1, 15.0f);
                        textView.setGravity(17);
                        org.telegram.ui.ActionBar.t6.Q(textView, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.r1(0.15f, jt0Var2.s0(i39)), 3), null, org.telegram.ui.ActionBar.t6.K(0.15f, i39), h6Var2);
                        textView.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
                        ViewGroup viewGroup = jt0Var2.I;
                        (viewGroup == null ? jt0Var2.H : viewGroup).addView(textView, c8.ma.e(-2, 56, 85));
                        textView.setOnClickListener(new ip0(jt0Var2, 3));
                        textView.setVisibility(8);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(0.4f);
                        textView.setScaleY(0.4f);
                        org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.y1;
                        org.telegram.ui.ActionBar.h6 h6Var4 = h6Var2;
                        dh.c cVar6 = cVar5;
                        h6Var3 = h6Var4;
                        jt0Var2.b0 = new gq0(jt0Var2, g2Var2, context, g2Var2.getCurrentAccount(), ((ProfileActivity) jt0Var2.y1).a(), h6Var4, cVar6);
                        jt0Var2.H1();
                        jt0Var2.c0 = new jq0(jt0Var2, context, jt0Var2.getStoriesController().B(jt0Var2.m1, true), new iq0(jt0Var2, context, g2Var, h6Var3));
                        cVar2 = cVar6;
                    } else {
                        h6Var3 = h6Var2;
                        cVar2 = cVar5;
                    }
                    z10 = false;
                    cVar3 = cVar2;
                } else {
                    jt0Var2.a0 = new fq0(jt0Var2, context, jt0Var2.y1, jt0Var2.m1);
                    h6Var3 = h6Var2;
                    cVar3 = cVar5;
                    z10 = false;
                }
                jt0Var2.setWillNotDraw(z10);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    ds0VarArr = jt0Var2.n0;
                    if (i20 < ds0VarArr.length) {
                        break;
                    }
                    if (i20 == 0 && (ds0Var = ds0VarArr[i20]) != null && (lq0Var2 = ds0Var.x) != null) {
                        i19 = lq0Var2.L0();
                        if (i19 != jt0Var2.n0[i20].x.B() - 1) {
                            cs0Var20 = jt0Var2.n0[i20].h;
                            mj0 mj0Var = (mj0) cs0Var20.K(i19);
                            if (mj0Var != null) {
                                i18 = mj0Var.a.getTop();
                            } else {
                                i19 = -1;
                            }
                        } else {
                            i21 = i18;
                            i22 = -1;
                            kq0 kq0Var = new kq0(jt0Var2, context);
                            jt0Var2.addView(kq0Var, c8.ma.d(-1, -1.0f, 51, 0.0f, jt0Var2.O0(), 0.0f, 0.0f));
                            if (i20 == 1) {
                                kq0Var.setTranslationX(org.telegram.messenger.g0.q.x);
                            }
                            jt0Var2.n0[i20] = kq0Var;
                            kq0Var.O = h6Var3;
                            ds0 ds0Var2 = jt0Var2.n0[i20];
                            lq0Var = new lq0(jt0Var2, kq0Var);
                            ds0Var2.x = lq0Var;
                            lq0Var.z1(new mq0(jt0Var2, kq0Var));
                            jt0Var2.n0[i20].d = new v4.k();
                            jt0Var2.n0[i20].d.n(280L);
                            jt0Var2.n0[i20].d.o(nr.h);
                            ds0 ds0Var3 = jt0Var2.n0[i20];
                            ds0Var3.d.m = false;
                            ds0Var3.h = new nq0(jt0Var2, context, h6Var3, kq0Var, lq0Var);
                            cs0Var2 = jt0Var2.n0[i20].h;
                            cs0Var2.setFastScrollEnabled(1);
                            cs0Var3 = jt0Var2.n0[i20].h;
                            cs0Var3.setScrollingTouchSlop(1);
                            cs0Var4 = jt0Var2.n0[i20].h;
                            cs0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                            cs0Var5 = jt0Var2.n0[i20].h;
                            cs0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                            cs0Var6 = jt0Var2.n0[i20].h;
                            cs0Var6.setItemAnimator(null);
                            cs0Var7 = jt0Var2.n0[i20].h;
                            cs0Var7.setClipToPadding(false);
                            cs0Var8 = jt0Var2.n0[i20].h;
                            cs0Var8.setSectionsType(2);
                            cs0Var9 = jt0Var2.n0[i20].h;
                            cs0Var9.setLayoutManager(lq0Var);
                            ds0 ds0Var4 = jt0Var2.n0[i20];
                            cs0Var10 = ds0Var4.h;
                            ds0Var4.addView(cs0Var10, c8.ma.c(-1.0f, -1));
                            jt0Var2.n0[i20].n = new cs0(context, null);
                            ds0 ds0Var5 = jt0Var2.n0[i20];
                            cs0 cs0Var21 = ds0Var5.n;
                            oq0 oq0Var = new oq0(jt0Var2);
                            ds0Var5.r = oq0Var;
                            cs0Var21.setLayoutManager(oq0Var);
                            ds0 ds0Var6 = jt0Var2.n0[i20];
                            ds0Var6.addView(ds0Var6.n, c8.ma.c(-1.0f, -1));
                            jt0Var2.n0[i20].n.setVisibility(8);
                            jt0Var2.n0[i20].n.i(new qq0(kq0Var));
                            cs0Var11 = jt0Var2.n0[i20].h;
                            cs0Var11.i(new rq0(jt0Var2, kq0Var));
                            cs0Var12 = jt0Var2.n0[i20].h;
                            cs0Var12.setOnItemClickListener(new di.t1(jt0Var2, kq0Var, context, j10, h6Var, 3));
                            cs0Var13 = jt0Var2.n0[i20].h;
                            cs0Var13.setOnScrollListener(new uq0(jt0Var2, kq0Var, lq0Var));
                            cs0Var14 = jt0Var2.n0[i20].h;
                            cs0Var14.setOnItemLongClickListener(new vq0(jt0Var2, kq0Var));
                            if (i20 == 0 && i22 != -1) {
                                lq0Var.h1(i22, i21);
                            }
                            cs0Var15 = jt0Var2.n0[i20].h;
                            jt0Var2.n0[i20].y = new wq0(context, cs0Var15);
                            jt0Var2.n0[i20].y.setVisibility(8);
                            cs0Var16 = jt0Var2.n0[i20].h;
                            wq0 wq0Var = jt0Var2.n0[i20].y;
                            FrameLayout.LayoutParams c10 = c8.ma.c(-1.0f, -1);
                            if (cs0Var16.c1 == null) {
                                cs0Var16.c1 = new bi.e3(23, cs0Var16.getContext(), cs0Var16);
                            }
                            cs0Var16.c1.addView(wq0Var, c10);
                            jt0Var2.n0[i20].s = new xq0(jt0Var2, context, kq0Var);
                            jt0Var2.n0[i20].s.f();
                            jt0Var2.n0[i20].s.setClipToOutline(true);
                            jt0Var2.n0[i20].s.setOutlineProvider(new yq0());
                            if (i20 == 0) {
                                jt0Var2.n0[i20].setVisibility(8);
                            }
                            ds0 ds0Var7 = jt0Var2.n0[i20];
                            ds0Var7.w = new zq0(jt0Var2, context, ds0Var7.s);
                            nv0Var = jt0Var2.n0[i20].w;
                            nv0Var.d(8, false);
                            nv0Var2 = jt0Var2.n0[i20].w;
                            nv0Var2.setAnimateLayoutChange(true);
                            ds0 ds0Var8 = jt0Var2.n0[i20];
                            nv0Var3 = ds0Var8.w;
                            ds0Var8.addView(nv0Var3, c8.ma.c(-1.0f, -1));
                            nv0Var4 = jt0Var2.n0[i20].w;
                            nv0Var4.setOnTouchListener(new gi.a(24));
                            nv0Var5 = jt0Var2.n0[i20].w;
                            nv0Var5.e(true, false);
                            nv0Var6 = jt0Var2.n0[i20].w;
                            nv0Var6.d.setText(org.telegram.messenger.hd.N0(2131747974, "NoResult"));
                            nv0Var7 = jt0Var2.n0[i20].w;
                            nv0Var7.f.setVisibility(8);
                            nv0Var8 = jt0Var2.n0[i20].w;
                            nv0Var8.e.setText(org.telegram.messenger.hd.M0(2131745611));
                            nv0Var9 = jt0Var2.n0[i20].w;
                            nv0Var9.f.setVisibility(8);
                            nv0Var10 = jt0Var2.n0[i20].w;
                            nv0Var10.addView(jt0Var2.n0[i20].s, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                            cs0Var17 = jt0Var2.n0[i20].h;
                            nv0Var11 = jt0Var2.n0[i20].w;
                            cs0Var17.setEmptyView(nv0Var11);
                            cs0Var18 = jt0Var2.n0[i20].h;
                            cs0Var18.o1(0, true);
                            ds0[] ds0VarArr2 = jt0Var2.n0;
                            ds0 ds0Var9 = ds0VarArr2[i20];
                            cs0Var19 = ds0VarArr2[i20].h;
                            ds0Var9.E = new org.telegram.ui.ActionBar.k5(cs0Var19, jt0Var2.n0[i20].x);
                            i20++;
                            j10 = j3;
                            h6Var3 = h6Var;
                            i18 = i21;
                            i19 = i22;
                        }
                    }
                    i21 = i18;
                    i22 = i19;
                    kq0 kq0Var2 = new kq0(jt0Var2, context);
                    jt0Var2.addView(kq0Var2, c8.ma.d(-1, -1.0f, 51, 0.0f, jt0Var2.O0(), 0.0f, 0.0f));
                    if (i20 == 1) {
                    }
                    jt0Var2.n0[i20] = kq0Var2;
                    kq0Var2.O = h6Var3;
                    ds0 ds0Var22 = jt0Var2.n0[i20];
                    lq0Var = new lq0(jt0Var2, kq0Var2);
                    ds0Var22.x = lq0Var;
                    lq0Var.z1(new mq0(jt0Var2, kq0Var2));
                    jt0Var2.n0[i20].d = new v4.k();
                    jt0Var2.n0[i20].d.n(280L);
                    jt0Var2.n0[i20].d.o(nr.h);
                    ds0 ds0Var32 = jt0Var2.n0[i20];
                    ds0Var32.d.m = false;
                    ds0Var32.h = new nq0(jt0Var2, context, h6Var3, kq0Var2, lq0Var);
                    cs0Var2 = jt0Var2.n0[i20].h;
                    cs0Var2.setFastScrollEnabled(1);
                    cs0Var3 = jt0Var2.n0[i20].h;
                    cs0Var3.setScrollingTouchSlop(1);
                    cs0Var4 = jt0Var2.n0[i20].h;
                    cs0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                    cs0Var5 = jt0Var2.n0[i20].h;
                    cs0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                    cs0Var6 = jt0Var2.n0[i20].h;
                    cs0Var6.setItemAnimator(null);
                    cs0Var7 = jt0Var2.n0[i20].h;
                    cs0Var7.setClipToPadding(false);
                    cs0Var8 = jt0Var2.n0[i20].h;
                    cs0Var8.setSectionsType(2);
                    cs0Var9 = jt0Var2.n0[i20].h;
                    cs0Var9.setLayoutManager(lq0Var);
                    ds0 ds0Var42 = jt0Var2.n0[i20];
                    cs0Var10 = ds0Var42.h;
                    ds0Var42.addView(cs0Var10, c8.ma.c(-1.0f, -1));
                    jt0Var2.n0[i20].n = new cs0(context, null);
                    ds0 ds0Var52 = jt0Var2.n0[i20];
                    cs0 cs0Var212 = ds0Var52.n;
                    oq0 oq0Var2 = new oq0(jt0Var2);
                    ds0Var52.r = oq0Var2;
                    cs0Var212.setLayoutManager(oq0Var2);
                    ds0 ds0Var62 = jt0Var2.n0[i20];
                    ds0Var62.addView(ds0Var62.n, c8.ma.c(-1.0f, -1));
                    jt0Var2.n0[i20].n.setVisibility(8);
                    jt0Var2.n0[i20].n.i(new qq0(kq0Var2));
                    cs0Var11 = jt0Var2.n0[i20].h;
                    cs0Var11.i(new rq0(jt0Var2, kq0Var2));
                    cs0Var12 = jt0Var2.n0[i20].h;
                    cs0Var12.setOnItemClickListener(new di.t1(jt0Var2, kq0Var2, context, j10, h6Var, 3));
                    cs0Var13 = jt0Var2.n0[i20].h;
                    cs0Var13.setOnScrollListener(new uq0(jt0Var2, kq0Var2, lq0Var));
                    cs0Var14 = jt0Var2.n0[i20].h;
                    cs0Var14.setOnItemLongClickListener(new vq0(jt0Var2, kq0Var2));
                    if (i20 == 0) {
                        lq0Var.h1(i22, i21);
                    }
                    cs0Var15 = jt0Var2.n0[i20].h;
                    jt0Var2.n0[i20].y = new wq0(context, cs0Var15);
                    jt0Var2.n0[i20].y.setVisibility(8);
                    cs0Var16 = jt0Var2.n0[i20].h;
                    wq0 wq0Var2 = jt0Var2.n0[i20].y;
                    FrameLayout.LayoutParams c102 = c8.ma.c(-1.0f, -1);
                    if (cs0Var16.c1 == null) {
                    }
                    cs0Var16.c1.addView(wq0Var2, c102);
                    jt0Var2.n0[i20].s = new xq0(jt0Var2, context, kq0Var2);
                    jt0Var2.n0[i20].s.f();
                    jt0Var2.n0[i20].s.setClipToOutline(true);
                    jt0Var2.n0[i20].s.setOutlineProvider(new yq0());
                    if (i20 == 0) {
                    }
                    ds0 ds0Var72 = jt0Var2.n0[i20];
                    ds0Var72.w = new zq0(jt0Var2, context, ds0Var72.s);
                    nv0Var = jt0Var2.n0[i20].w;
                    nv0Var.d(8, false);
                    nv0Var2 = jt0Var2.n0[i20].w;
                    nv0Var2.setAnimateLayoutChange(true);
                    ds0 ds0Var82 = jt0Var2.n0[i20];
                    nv0Var3 = ds0Var82.w;
                    ds0Var82.addView(nv0Var3, c8.ma.c(-1.0f, -1));
                    nv0Var4 = jt0Var2.n0[i20].w;
                    nv0Var4.setOnTouchListener(new gi.a(24));
                    nv0Var5 = jt0Var2.n0[i20].w;
                    nv0Var5.e(true, false);
                    nv0Var6 = jt0Var2.n0[i20].w;
                    nv0Var6.d.setText(org.telegram.messenger.hd.N0(2131747974, "NoResult"));
                    nv0Var7 = jt0Var2.n0[i20].w;
                    nv0Var7.f.setVisibility(8);
                    nv0Var8 = jt0Var2.n0[i20].w;
                    nv0Var8.e.setText(org.telegram.messenger.hd.M0(2131745611));
                    nv0Var9 = jt0Var2.n0[i20].w;
                    nv0Var9.f.setVisibility(8);
                    nv0Var10 = jt0Var2.n0[i20].w;
                    nv0Var10.addView(jt0Var2.n0[i20].s, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                    cs0Var17 = jt0Var2.n0[i20].h;
                    nv0Var11 = jt0Var2.n0[i20].w;
                    cs0Var17.setEmptyView(nv0Var11);
                    cs0Var18 = jt0Var2.n0[i20].h;
                    cs0Var18.o1(0, true);
                    ds0[] ds0VarArr22 = jt0Var2.n0;
                    ds0 ds0Var92 = ds0VarArr22[i20];
                    cs0Var19 = ds0VarArr22[i20].h;
                    ds0Var92.E = new org.telegram.ui.ActionBar.k5(cs0Var19, jt0Var2.n0[i20].x);
                    i20++;
                    j10 = j3;
                    h6Var3 = h6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = jt0Var2.c0;
                if (view != null) {
                    jt0Var2.addView(view, c8.ma.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                }
                org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
                jt0Var2.N0 = v0Var;
                v0Var.h0((int) (System.currentTimeMillis() / 1000), false, false);
                v0Var.setAlpha(0.0f);
                v0Var.j0(org.telegram.ui.ActionBar.m6.nd, org.telegram.ui.ActionBar.m6.be);
                v0Var.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
                jt0Var2.addView(v0Var, c8.ma.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                for (ds0 ds0Var10 : jt0Var2.n0) {
                    cs0Var = ds0Var10.h;
                    jj0 fastScroll = cs0Var.getFastScroll();
                    if (fastScroll != null) {
                        fastScroll.a(cVar3, jt0Var2.I != null ? c8.i0.m(h6Var) : c8.i0.o(h6Var));
                    }
                }
                if (jt0Var2.Y()) {
                    gh.e m10 = jt0Var2.I != null ? c8.i0.m(h6Var) : c8.i0.o(h6Var);
                    es esVar = new es(context);
                    jt0Var2.S0 = esVar;
                    int L = org.telegram.messenger.g0.L(11.0f);
                    int i40 = w2;
                    esVar.setPadding(L, i40, org.telegram.messenger.g0.L(11.0f), i40);
                    fh.g b11 = cVar3.b(esVar, m10);
                    b11.r(org.telegram.messenger.g0.L(24.0f));
                    b11.q(org.telegram.messenger.g0.L(7.0f));
                    esVar.setBlurredBackground(b11);
                    FrameLayout frameLayout = new FrameLayout(context);
                    jt0Var2.T0 = frameLayout;
                    esVar.addView(frameLayout);
                    esVar.j(frameLayout, true, false);
                    esVar.setOnAnimatedHeightChangedListener(new hp0(jt0Var2, 1));
                    br0 br0Var = new br0(jt0Var2, context, g2Var, this, h6Var);
                    jt0Var2.U0 = br0Var;
                    frameLayout.addView(br0Var);
                    esVar.setCallFragmentContextView(br0Var);
                    jt0Var2.addView(esVar, c8.ma.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
                    br0Var.setDelegate(new jp0(jt0Var2));
                    fh.g b12 = cVar3.b(jt0Var2.L0, m10);
                    org.telegram.messenger.o10.s(b12, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    jt0Var2.L0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    jt0Var2.L0.setClipToPadding(false);
                    jt0Var2.L0.setBackground(null);
                    jt0Var2.L0.setBlurredBackground(b12);
                    jt0Var2.L0.setOpen(false);
                    jt0Var2.addView(jt0Var2.L0, c8.ma.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
                    Context context2 = jt0Var2.getContext();
                    org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var2.y1;
                    cr0 cr0Var3 = new cr0(jt0Var2, context2, g2Var3, g2Var3.getCurrentAccount(), jt0Var2.x0() ? 0L : jt0Var2.m1, h6Var);
                    jt0 jt0Var3 = jt0Var2;
                    jt0Var3.M0 = cr0Var3;
                    cr0Var3.d(cVar3, m10);
                    cr0Var3.setShown(0.0f);
                    jt0Var3.addView(cr0Var3, c8.ma.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                    if (jt0Var3.I == null) {
                        fh.g b13 = cVar3.b(jt0Var3.E0, m10);
                        org.telegram.messenger.o10.s(b13, org.telegram.messenger.g0.L(18.0f), 6.666f);
                        jt0Var3.E0.setBackground(b13);
                        z11 = false;
                        jt0Var3.E0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        jt0Var3.addView(jt0Var3.E0, c8.ma.e(-1, 50, 51));
                    } else {
                        z11 = false;
                    }
                    jt0Var3.G();
                    jt0Var = jt0Var3;
                    r92 = z11;
                } else {
                    r92 = 0;
                    jt0Var = jt0Var2;
                }
                jt0Var.P1(r92);
                jt0Var.B1(r92);
                jt0Var.Q();
                if (jt0Var.a1[r92] >= 0) {
                    jt0Var.M0(r92);
                }
                jq0Var = jt0Var.c0;
                if (jq0Var != null || i11 <= 0) {
                }
                jq0Var.setInitialTabId(i11);
                return;
            }
            profileTab = chatFull2.main_tab;
        }
        i13 = 1;
        if (i10 != 14) {
        }
        jt0Var2.b1 = i10;
        jt0Var2.Z0(i10);
        jt0Var2.g1 = chatFull2;
        jt0Var2.h1 = userFull;
        if (chatFull2 != null) {
        }
        j10 = j3;
        jt0Var2.m1 = j10;
        i14 = 0;
        while (true) {
            ys0VarArr = jt0Var2.w1;
            if (i14 < ys0VarArr.length) {
            }
            i14++;
        }
        jt0Var2.y1 = g2Var;
        jt0Var2.H = g2Var.getActionBar();
        jt0Var2.I = g2Var.getSimpleActionBar();
        jt0Var2.p1[0] = jt0Var2.e1() > 0 ? org.telegram.messenger.cz.t1 : jt0Var2.e1();
        jt0Var2.p1[1] = jt0Var2.e1() > 0 ? org.telegram.messenger.cz.u1 : jt0Var2.e1();
        org.telegram.messenger.ls notificationCenter2 = g2Var.getNotificationCenter();
        notificationCenter2.getClass();
        xi.e eVar2 = new xi.e(notificationCenter2, jt0Var2);
        eVar2.c(org.telegram.messenger.ls.V);
        eVar2.c(org.telegram.messenger.ls.w);
        eVar2.c(1);
        eVar2.c(org.telegram.messenger.ls.K);
        eVar2.c(org.telegram.messenger.ls.f2);
        eVar2.c(org.telegram.messenger.ls.g2);
        eVar2.c(org.telegram.messenger.ls.h2);
        eVar2.c(org.telegram.messenger.ls.A5);
        eVar2.c(org.telegram.messenger.ls.y5);
        eVar2.c(org.telegram.messenger.ls.h3);
        eVar2.c(org.telegram.messenger.ls.i3);
        eVar2.c(org.telegram.messenger.ls.s);
        eVar2.c(org.telegram.messenger.ls.I3);
        eVar2.c(org.telegram.messenger.ls.Z3);
        eVar2.c(org.telegram.messenger.ls.f1);
        jt0Var2.K1 = eVar2;
        while (i15 < 10) {
        }
        jt0Var2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        jt0Var2.Y0 = false;
        jt0Var2.Z0 = null;
        cr0Var = jt0Var2.M0;
        if (cr0Var != null) {
        }
        jt0Var2.X0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        jt0Var2.B0 = drawable2;
        org.telegram.ui.ActionBar.t6.x(jt0Var2, drawable2, org.telegram.ui.ActionBar.m6.b7, h6Var, PorterDuff.Mode.MULTIPLY);
        fr0 fr0Var3 = jt0Var2.L0;
        if (fr0Var3 == null) {
        }
        fr0 fr0Var22 = new fr0(jt0Var2, context, jt0Var2.I1);
        i16 = jt0Var2.b1;
        if (i16 != -1) {
        }
        fr0Var22.c0 = 320L;
        int i322 = org.telegram.ui.ActionBar.m6.a;
        int i332 = org.telegram.ui.ActionBar.m6.wi;
        int i342 = org.telegram.ui.ActionBar.m6.vi;
        int i352 = org.telegram.ui.ActionBar.m6.a;
        fr0Var22.M = i332;
        fr0Var22.N = i342;
        fr0Var22.updateColors();
        fr0Var22.setUseMinimalWidth(true);
        fr0Var22.setDelegate(new hr0(jt0Var2));
        jt0Var2.L0 = fr0Var22;
        while (i17 >= 0) {
        }
        jt0Var2.d1 = 0;
        jt0Var2.Q0.clear();
        us0Var = jt0Var2.U;
        if (us0Var != null) {
        }
        if (jt0Var2 instanceof c30) {
        }
        ImageView imageView3 = new ImageView(context);
        jt0Var2.u0 = imageView3;
        imageView3.setContentDescription(org.telegram.messenger.hd.N0(2131754838, "AccDescrMoreOptions"));
        imageView3.setTranslationY(org.telegram.messenger.g0.L(f10));
        imageView3.setVisibility(4);
        if (jt0Var2.I == null) {
        }
        h6Var2 = h6Var;
        f11 = 2.0f;
        imageView3.setOnClickListener(new ip0(jt0Var2, 0));
        g5Var = jt0Var2.J;
        if (g5Var != null) {
        }
        q0Var = jt0Var2.q0;
        if (q0Var != null) {
            EditTextBoldCursor searchField2 = q0Var.getSearchField();
            int i362 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(searchField2, i362, h6Var2);
            org.telegram.ui.ActionBar.t6.D(searchField2, org.telegram.ui.ActionBar.m6.Jj, h6Var2);
            org.telegram.ui.ActionBar.t6.v(searchField2, i362, h6Var2);
        }
        jt0Var2.A0 = 0;
        LinearLayout linearLayout2 = new LinearLayout(context);
        jt0Var2.E0 = linearLayout2;
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setClickable(true);
        linearLayout2.setVisibility(4);
        ImageView imageView22 = new ImageView(context);
        jt0Var2.F0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(true);
        jt0Var2.G0 = x1Var2;
        imageView22.setImageDrawable(x1Var2);
        int i372 = org.telegram.ui.ActionBar.m6.y8;
        x1Var2.a(jt0Var2.s0(i372));
        int i382 = org.telegram.ui.ActionBar.m6.z8;
        org.telegram.ui.ActionBar.t6.Q(imageView22, org.telegram.ui.ActionBar.m6.g0(jt0Var2.s0(i382), 1), null, org.telegram.ui.ActionBar.t6.M(i382), h6Var2);
        imageView22.setContentDescription(org.telegram.messenger.hd.N0(2131752029, "Close"));
        linearLayout2.addView(imageView22, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        jt0Var2.Q0.add(imageView22);
        imageView22.setOnClickListener(new ip0(jt0Var2, 2));
        NumberTextView numberTextView2 = new NumberTextView(context);
        jt0Var2.D0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(org.telegram.messenger.g0.o());
        numberTextView2.setTextColor(jt0Var2.s0(i372));
        linearLayout2.addView(numberTextView2, c8.ma.m(1.0f, 0, -1, 18, 0, 0));
        jt0Var2.Q0.add(numberTextView2);
        if (!org.telegram.messenger.n5.C(jt0Var2.m1)) {
        }
        jt0Var2.o0 = jt0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131751586, "Delete"));
        jt0Var2.K = new pr0(jt0Var2, context);
        jt0Var2.L = new dt0(jt0Var2, context);
        jt0Var2.N = new ws0(jt0Var2, context, 1);
        jt0Var2.O = new ws0(jt0Var2, context, 2);
        jt0Var2.P = new ws0(jt0Var2, context, 4);
        jt0Var2.Q = new ss0(jt0Var2, context, jt0Var2.y1.getCurrentAccount(), jt0Var2.y1.getResourceProvider());
        jt0Var2.R = new yr0(jt0Var2, context);
        jt0Var2.j0 = new gs0(jt0Var2, context, 1);
        jt0Var2.k0 = new gs0(jt0Var2, context, 4);
        jt0Var2.l0 = new gs0(jt0Var2, context, 3);
        jt0Var2.m0 = new bs0(jt0Var2, context);
        jt0Var2.S = new wr0(jt0Var2, context);
        jt0Var2.T = new ur0(jt0Var2, context);
        jt0Var2.U = new us0(jt0Var2, context);
        jt0Var2.V = new vs0(jt0Var2, context);
        if (!jt0Var2.I0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", jt0Var2.y1.getUserConfig().e());
            bundle2.putInt("chatMode", 3);
            qr0 qr0Var2 = new qr0(jt0Var2, context, jt0Var2.y1.getParentLayout(), bundle2);
            jt0Var2.W = qr0Var2;
            long j122 = jt0Var2.m1;
            org.telegram.ui.cn cnVar2 = qr0Var2.a;
            cnVar2.s4 = j122;
            cnVar2.nb = true;
            qr0Var2.setClipToOutline(true);
            qr0Var2.setOutlineProvider(new rr0());
        }
        vr0 vr0Var2 = new vr0(jt0Var2, context);
        jt0Var2.d0 = vr0Var2;
        if (jt0Var2.G == 0) {
        }
        jt0Var2.f0 = new sr0(jt0Var2, context);
        jt0Var2.e0 = new v4.z(new tr0(jt0Var2));
        jt0Var2.g0 = new gt0(jt0Var2, context, false);
        jt0Var2.h0 = new eq0(jt0Var2, context);
        jt0Var2.i0 = new gt0(jt0Var2, context, true);
        jt0Var2.M = new xs0(jt0Var2, context);
        if (jt0Var2.B0()) {
        }
        jt0Var2.setWillNotDraw(z10);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            ds0VarArr = jt0Var2.n0;
            if (i20 < ds0VarArr.length) {
            }
            ds0 ds0Var722 = jt0Var2.n0[i20];
            ds0Var722.w = new zq0(jt0Var2, context, ds0Var722.s);
            nv0Var = jt0Var2.n0[i20].w;
            nv0Var.d(8, false);
            nv0Var2 = jt0Var2.n0[i20].w;
            nv0Var2.setAnimateLayoutChange(true);
            ds0 ds0Var822 = jt0Var2.n0[i20];
            nv0Var3 = ds0Var822.w;
            ds0Var822.addView(nv0Var3, c8.ma.c(-1.0f, -1));
            nv0Var4 = jt0Var2.n0[i20].w;
            nv0Var4.setOnTouchListener(new gi.a(24));
            nv0Var5 = jt0Var2.n0[i20].w;
            nv0Var5.e(true, false);
            nv0Var6 = jt0Var2.n0[i20].w;
            nv0Var6.d.setText(org.telegram.messenger.hd.N0(2131747974, "NoResult"));
            nv0Var7 = jt0Var2.n0[i20].w;
            nv0Var7.f.setVisibility(8);
            nv0Var8 = jt0Var2.n0[i20].w;
            nv0Var8.e.setText(org.telegram.messenger.hd.M0(2131745611));
            nv0Var9 = jt0Var2.n0[i20].w;
            nv0Var9.f.setVisibility(8);
            nv0Var10 = jt0Var2.n0[i20].w;
            nv0Var10.addView(jt0Var2.n0[i20].s, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 12.0f, 60.0f, 12.0f, 12.0f));
            cs0Var17 = jt0Var2.n0[i20].h;
            nv0Var11 = jt0Var2.n0[i20].w;
            cs0Var17.setEmptyView(nv0Var11);
            cs0Var18 = jt0Var2.n0[i20].h;
            cs0Var18.o1(0, true);
            ds0[] ds0VarArr222 = jt0Var2.n0;
            ds0 ds0Var922 = ds0VarArr222[i20];
            cs0Var19 = ds0VarArr222[i20].h;
            ds0Var922.E = new org.telegram.ui.ActionBar.k5(cs0Var19, jt0Var2.n0[i20].x);
            i20++;
            j10 = j3;
            h6Var3 = h6Var;
            i18 = i21;
            i19 = i22;
        }
        view = jt0Var2.c0;
        if (view != null) {
        }
        org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(context);
        jt0Var2.N0 = v0Var2;
        v0Var2.h0((int) (System.currentTimeMillis() / 1000), false, false);
        v0Var2.setAlpha(0.0f);
        v0Var2.j0(org.telegram.ui.ActionBar.m6.nd, org.telegram.ui.ActionBar.m6.be);
        v0Var2.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
        jt0Var2.addView(v0Var2, c8.ma.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        while (r4 < r2) {
        }
        if (jt0Var2.Y()) {
        }
        jt0Var.P1(r92);
        jt0Var.B1(r92);
        jt0Var.Q();
        if (jt0Var.a1[r92] >= 0) {
        }
        jq0Var = jt0Var.c0;
        if (jq0Var != null) {
        }
    }

    public static boolean J0(int i7) {
        return (i7 & (-65536)) == 65536;
    }

    public static y3 X(int i7, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        y3 y3Var = new y3(context, h6Var);
        ImageView imageView = (ImageView) y3Var.d;
        TextView textView = (TextView) y3Var.c;
        if (i7 == 0) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131748003, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131748005, null));
            return y3Var;
        }
        if (i7 == 1) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747964, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131747965, null));
            return y3Var;
        }
        if (i7 == 2) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747959, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131747960, null));
            return y3Var;
        }
        if (i7 == 3) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747961, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131747962, null));
            return y3Var;
        }
        if (i7 == 4) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747966, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131747967, null));
            return y3Var;
        }
        if (i7 == 5) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747963, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131748015, null));
            return y3Var;
        }
        if (i7 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.hd.N0(2131748013, null));
            return y3Var;
        }
        if (i7 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return y3Var;
    }

    public static void a(jt0 jt0Var, TL_stories.StoryItem storyItem, fi.i6 i6Var) {
        jt0Var.getStoriesController().c(i6Var.a, jt0Var.m1, storyItem);
        org.telegram.messenger.g0.h3(new fm0(5, jt0Var, i6Var), 100L);
    }

    public static void d(jt0 jt0Var, int i7, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(jt0Var, i7, storyItem, 18);
        fi.p6 storiesController = jt0Var.getStoriesController();
        long j3 = jt0Var.m1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i7, j3, arrayList);
        lc.b0(jt0Var.y1).K(R.raw.chats_archived, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.hd.N0(2131743640, null), f0Var).j();
    }

    public static void e(jt0 jt0Var, long j3, int i7) {
        fi.d6 B = jt0Var.getStoriesController().B(j3, true);
        int i10 = B.a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        fi.i6 i6Var = (fi.i6) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.np.u1(i10).l1(B.b);
        tL_deleteAlbum.album_id = i6Var.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(jt0 jt0Var, long j3, int i7, String str) {
        fi.d6 B = jt0Var.getStoriesController().B(j3, true);
        int i10 = B.a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        ((fi.i6) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.np.u1(i10).l1(B.b);
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
        return org.telegram.messenger.np.u1(this.y1.getCurrentAccount()).R1();
    }

    public static /* synthetic */ void h(jt0 jt0Var, TL_stories.StoryItem storyItem) {
        jt0Var.getStoriesController().r0(jt0Var.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        lc.b0(jt0Var.y1).G(R.raw.chats_archived, 5000, org.telegram.messenger.hd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(jt0 jt0Var, HashSet hashSet, TL_stories.StoryItem storyItem, a70 a70Var, fi.i6 i6Var) {
        String a02;
        long j3 = jt0Var.m1;
        if (hashSet.contains(Integer.valueOf(i6Var.a))) {
            jt0Var.getStoriesController().c(i6Var.a, j3, storyItem);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744488, i6Var.b);
        } else {
            fi.p6 storiesController = jt0Var.getStoriesController();
            int i7 = i6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i7, j3, arrayList);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744251, i6Var.b);
        }
        lc.b0(jt0Var.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.W2(a02)).j();
        a70Var.v();
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

    public static void s(ds0 ds0Var, ys0[] ys0VarArr, boolean z10) {
        fm0 fm0Var;
        if (!z10) {
            if (ds0Var.G == null || (fm0Var = ds0Var.H) == null) {
                return;
            }
            org.telegram.messenger.g0.r(fm0Var);
            ds0Var.H.run();
            ds0Var.H = null;
            ds0Var.G = null;
            return;
        }
        if (org.telegram.messenger.cz.v1 <= 0 || ds0Var.G != null || ds0Var.I || ds0Var.h.getFastScroll() == null || !ds0Var.h.getFastScroll().b0 || ds0Var.h.getFastScroll().getVisibility() != 0 || ys0VarArr[0].e() < 50) {
            return;
        }
        int i7 = org.telegram.messenger.cz.v1;
        int i10 = i7 - 1;
        if (i7 != i10) {
            org.telegram.messenger.cz.v1 = i10;
            org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.cz.v1).apply();
        }
        ds0Var.I = true;
        Context context = ds0Var.getContext();
        bi.t2 t2Var = new bi.t2(context, 20);
        TextView textView = new TextView(context);
        org.telegram.messenger.o10.l(14.0f, 2131745212, 1, textView, null);
        textView.setMaxLines(3);
        int i11 = org.telegram.ui.ActionBar.m6.gg;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i12 = org.telegram.ui.ActionBar.m6.hg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        t2Var.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(t2Var, d02, M, null, null);
        t2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        fp0 fp0Var = new fp0(context);
        fp0Var.a = new Random();
        Paint paint = new Paint(1);
        fp0Var.b = paint;
        Paint paint2 = new Paint(1);
        fp0Var.c = paint2;
        fp0Var.f = 1.0f;
        fp0Var.h = 0.0f;
        paint.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        Paint paint3 = new Paint();
        fp0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        fp0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        t2Var.addView(fp0Var, c8.ma.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        ds0Var.G = t2Var;
        ds0Var.addView(t2Var, c8.ma.c(-2.0f, -2));
        ds0Var.G.setAlpha(0.0f);
        ds0Var.G.setScaleX(0.8f);
        ds0Var.G.setScaleY(0.8f);
        ds0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        ds0Var.invalidate();
        fm0 fm0Var2 = new fm0(6, ds0Var, t2Var);
        ds0Var.H = fm0Var2;
        org.telegram.messenger.g0.h3(fm0Var2, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        if (z4Var != null) {
            z4Var.setEnabled(z10);
        } else {
            this.H.setEnabled(z10);
        }
    }

    private void setPageOverscan(cs0 cs0Var) {
        if (!this.c2 || cs0Var == null) {
            return;
        }
        cs0Var.j3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cs0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            int i7 = marginLayoutParams.topMargin;
            int i10 = -this.e2;
            if (i7 == i10 && marginLayoutParams.bottomMargin == (-this.f2)) {
                return;
            }
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -this.f2;
            cs0Var.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchItemVisibility(int i7) {
        org.telegram.ui.ActionBar.q0 q0Var = this.q0;
        if (q0Var == null) {
            return;
        }
        if (this.I != null) {
            R(true, true);
        } else {
            q0Var.setVisibility(i7);
        }
    }

    public static void t(jt0 jt0Var, int i7, boolean z10) {
        ds0[] ds0VarArr = jt0Var.n0;
        if (ds0VarArr[0].F == i7) {
            return;
        }
        ds0 ds0Var = ds0VarArr[1];
        ds0Var.F = i7;
        ds0Var.setVisibility(0);
        jt0Var.w0();
        jt0Var.B1(true);
        jt0Var.k1 = z10;
        jt0Var.Y0();
        jt0Var.E(!jt0Var.F0(i7));
        jt0Var.I1(true);
    }

    public static int x(jt0 jt0Var, v4.i0 i0Var) {
        if (i0Var == jt0Var.f0) {
            return 8;
        }
        if (i0Var == jt0Var.h0) {
            return 9;
        }
        for (it0 it0Var : jt0Var.m2.values()) {
            if (it0Var.c == i0Var) {
                return it0Var.a;
            }
        }
        return -1;
    }

    public static int y(jt0 jt0Var, v4.i0 i0Var) {
        if (i0Var == jt0Var.g0) {
            return 8;
        }
        if (i0Var == jt0Var.i0) {
            return 9;
        }
        for (it0 it0Var : jt0Var.m2.values()) {
            if (it0Var.d == i0Var) {
                return it0Var.a;
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
                this.a2.append((CharSequence) org.telegram.messenger.hd.N0(2131746506, null));
            } else {
                this.a2.append((CharSequence) "c");
                this.a2.setSpan(new nq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.N0(2131744566, null));
            }
        }
        return this.a2;
    }

    public boolean A0() {
        return false;
    }

    public final gt0 A1(int i7) {
        it0 y12;
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

    public final void B(is0 is0Var, org.telegram.ui.ActionBar.g2 g2Var, long j3, int i7) {
        String o4 = j3 > 0 ? org.telegram.messenger.p10.o(org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).c2(Long.valueOf(j3))) : org.telegram.messenger.v3.K(org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).O0(Long.valueOf(-j3)), false);
        if (o4 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).X2, "/", o4, "/a/");
        sb2.append(i7);
        is0Var.i0(R.drawable.media_share, new g(this, sb2.toString(), g2Var, 26), org.telegram.messenger.hd.N0(2131744545, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User c22;
        long j3 = this.m1;
        return j3 > 0 && (c22 = org.telegram.messenger.np.u1(this.y1.getCurrentAccount()).c2(Long.valueOf(j3))) != null && c22.bot;
    }

    public final void B1(boolean z10) {
        ds0[] ds0VarArr;
        ds0[] ds0VarArr2;
        org.telegram.ui.ActionBar.q0 q0Var;
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
        gq0 gq0Var = this.b0;
        if (gq0Var != null) {
            gq0Var.i();
        }
        int i14 = 0;
        while (true) {
            ds0VarArr = this.n0;
            if (i14 >= ds0VarArr.length) {
                break;
            }
            ds0VarArr[i14].h.C0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ds0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        v4.i0 adapter = ds0VarArr[z10 ? 1 : 0].h.getAdapter();
        v4.i0 i0Var = this.f0;
        v4.z zVar = this.e0;
        if (adapter == i0Var) {
            zVar.h(null);
        }
        boolean z16 = this.Y0;
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        xr0 xr0Var = this.G1;
        org.telegram.ui.ActionBar.k kVar = this.H;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.q0;
        ss0 ss0Var = this.Q;
        int i15 = 100;
        if (z16 && this.X0) {
            ds0 ds0Var = ds0VarArr[z10 ? 1 : 0];
            if (ds0Var.f == null) {
                ds0Var.f = new v4.w0();
            }
            ds0 ds0Var2 = ds0VarArr[z10 ? 1 : 0];
            v4.w0 w0Var5 = ds0Var2.f;
            vs0 vs0Var = this.V;
            bs0 bs0Var = this.m0;
            gs0 gs0Var = this.k0;
            gs0 gs0Var2 = this.l0;
            gs0 gs0Var3 = this.j0;
            if (z10) {
                int i16 = ds0Var2.F;
                if (i16 != 0) {
                    w0Var4 = w0Var5;
                    if (i16 != 2 && i16 != 5 && i16 != 6 && (i16 != 7 || xr0Var.Y())) {
                        String obj = q0Var2 != null ? q0Var2.getSearchField().getText().toString() : "";
                        int i17 = ds0VarArr[z10 ? 1 : 0].F;
                        if (i17 == 1) {
                            if (gs0Var3 != null) {
                                gs0Var3.G(obj, false);
                                if (adapter != gs0Var3) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var3);
                                }
                            }
                        } else if (i17 == 3) {
                            if (gs0Var2 != null) {
                                gs0Var2.G(obj, false);
                                if (adapter != gs0Var2) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var2);
                                }
                            }
                        } else if (i17 == 4) {
                            if (gs0Var != null) {
                                gs0Var.G(obj, false);
                                if (adapter != gs0Var) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var);
                                }
                            }
                        } else if (i17 == 7) {
                            if (bs0Var != null) {
                                bs0Var.F(obj, false);
                                if (adapter != bs0Var) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(bs0Var);
                                }
                            }
                        } else if (i17 == 11) {
                            if (vs0Var != null) {
                                vs0Var.E(this.Z0, obj);
                                if (adapter != vs0Var) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                                }
                            }
                        } else if (i17 == 15 && ss0Var != null && adapter != ss0Var) {
                            i1(adapter);
                            nq0 nq0Var = ds0VarArr[z10 ? 1 : 0].h;
                            ss0Var.r = nq0Var;
                            nq0Var.setAdapter(ss0Var);
                        }
                    }
                }
                this.Y0 = false;
                cr0 cr0Var = this.M0;
                if (cr0Var != null) {
                    cr0Var.g(false);
                }
                this.X0 = false;
                B1(true);
                return;
            }
            w0Var4 = w0Var5;
            if (ds0Var2.h != null) {
                int i18 = ds0Var2.F;
                if (i18 == 1) {
                    if (adapter != gs0Var3) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var3);
                    }
                    gs0Var3.f();
                } else if (i18 == 3) {
                    if (adapter != gs0Var2) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var2);
                    }
                    gs0Var2.f();
                } else if (i18 == 4) {
                    if (adapter != gs0Var) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var);
                    }
                    gs0Var.f();
                } else if (i18 == 7) {
                    if (adapter != bs0Var) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(bs0Var);
                    }
                    bs0Var.f();
                } else if (i18 == 11) {
                    if (adapter != vs0Var) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                    }
                    vs0Var.f();
                }
            }
            ds0VarArr2 = ds0VarArr;
            q0Var = q0Var2;
            w0Var3 = w0Var4;
            i10 = 4;
            z13 = false;
            z14 = false;
            i11 = 8;
        } else {
            ds0 ds0Var3 = ds0VarArr[z10 ? 1 : 0];
            if (ds0Var3.e == null) {
                ds0Var3.e = new v4.w0();
            }
            ds0 ds0Var4 = ds0VarArr[z10 ? 1 : 0];
            v4.w0 w0Var6 = ds0Var4.e;
            ds0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = ds0VarArr[z10 ? 1 : 0].F;
            if (i19 == 8 || J0(i19)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
            }
            nq0 nq0Var2 = ds0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = nq0Var2.getPaddingLeft();
            ds0 ds0Var5 = ds0VarArr[z10 ? 1 : 0];
            ds0VarArr2 = ds0VarArr;
            nq0 nq0Var3 = ds0Var5.h;
            int j02 = j0(ds0Var5.F);
            nq0Var3.h3 = j02;
            int paddingRight = ds0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            nq0 nq0Var4 = ds0VarArr2[z10 ? 1 : 0].h;
            q0Var = q0Var2;
            int i02 = i0(I0());
            nq0Var4.i3 = i02;
            nq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i20 = ds0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.p1;
            v4.i0 i0Var2 = this.N;
            View view = this.a0;
            us0 us0Var = this.U;
            wr0 wr0Var = this.S;
            qr0 qr0Var = this.W;
            ys0[] ys0VarArr = this.w1;
            if (i20 == 0) {
                v4.i0 i0Var3 = this.K;
                if (adapter != i0Var3) {
                    i1(adapter);
                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var3);
                }
                int i21 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                ys0 ys0Var = ys0VarArr[0];
                boolean z17 = ys0Var.h && !ys0Var.e.isEmpty();
                i15 = iArr[0];
                ds0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                ys0 ys0Var2 = ys0VarArr[0];
                if (ys0Var2.x == null) {
                    ys0Var2.x = new v4.w0();
                }
                w0Var = ys0VarArr[0].x;
                z13 = z17;
                z11 = false;
            } else {
                if (i20 == 1) {
                    ys0 ys0Var3 = ys0VarArr[1];
                    z12 = ys0Var3.h && !ys0Var3.e.isEmpty();
                    if (adapter != i0Var2) {
                        i1(adapter);
                        ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var2);
                    }
                } else if (i20 == 2) {
                    ys0 ys0Var4 = ys0VarArr[2];
                    z12 = ys0Var4.h && !ys0Var4.e.isEmpty();
                    v4.i0 i0Var4 = this.O;
                    if (adapter != i0Var4) {
                        i1(adapter);
                        ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var4);
                    }
                } else {
                    if (i20 == 3) {
                        v4.i0 i0Var5 = this.M;
                        if (adapter != i0Var5) {
                            i1(adapter);
                            ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var5);
                        }
                    } else if (i20 == 4) {
                        ys0 ys0Var5 = ys0VarArr[4];
                        z12 = ys0Var5.h && !ys0Var5.e.isEmpty();
                        v4.i0 i0Var6 = this.P;
                        if (adapter != i0Var6) {
                            i1(adapter);
                            ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var6);
                        }
                    } else {
                        if (i20 == 5) {
                            v4.i0 i0Var7 = this.R;
                            if (adapter != i0Var7) {
                                i1(adapter);
                                ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var7);
                            }
                        } else if (i20 == 15) {
                            if (adapter != ss0Var) {
                                i1(adapter);
                                nq0 nq0Var5 = ds0VarArr2[z10 ? 1 : 0].h;
                                ss0Var.r = nq0Var5;
                                nq0Var5.setAdapter(ss0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != wr0Var) {
                                i1(adapter);
                                ds0VarArr2[z10 ? 1 : 0].h.setAdapter(wr0Var);
                            }
                        } else if (i20 == 7) {
                            v4.i0 i0Var8 = this.d0;
                            if (adapter != i0Var8) {
                                i1(adapter);
                                ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var8);
                            }
                        } else if (z0(i20)) {
                            v4.i0 z18 = z1(ds0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != z18) {
                                i1(adapter);
                                ds0VarArr2[z10 ? 1 : 0].h.setAdapter(z18);
                                ds0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            ds0 ds0Var6 = ds0VarArr2[z10 ? 1 : 0];
                            if (ds0Var6.F != 9) {
                                zVar.h(ds0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = ds0VarArr2[z10 ? 1 : 0].F;
                            if (i22 == 10) {
                                v4.i0 i0Var9 = this.T;
                                if (adapter != i0Var9) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var9);
                                }
                            } else if (i22 == 11) {
                                if (adapter != us0Var) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(us0Var);
                                    v4.z zVar2 = us0Var.w;
                                    nq0 nq0Var6 = ds0VarArr2[z10 ? 1 : 0].h;
                                    us0Var.s = nq0Var6;
                                    zVar2.h(nq0Var6);
                                }
                                w0Var = us0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (qr0Var.getParent() != ds0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(qr0Var);
                                    ds0VarArr2[z10 ? 1 : 0].addView(qr0Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    p1(org.telegram.messenger.g0.L(56.0f) + this.d2, qr0Var);
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != ds0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    ds0VarArr2[z10 ? 1 : 0].addView(view);
                                    p1(this.d2, view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gq0Var != null && gq0Var.getParent() != ds0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(gq0Var);
                                    ds0VarArr2[z10 ? 1 : 0].addView(gq0Var);
                                    ds0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
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
            K1(ds0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                ds0VarArr2[z10 ? 1 : 0].h.setSections(false);
                w0Var2 = w0Var;
            } else {
                nq0 nq0Var7 = ds0VarArr2[z10 ? 1 : 0].h;
                nq0Var7.getClass();
                w0Var2 = w0Var;
                org.telegram.ui.ActionBar.t6.l(nq0Var7, 20, org.telegram.ui.ActionBar.m6.i6, nq0Var7.o2);
                nq0Var7.U2 = false;
                nq0Var7.I2 = null;
                nq0Var7.J2 = null;
                nq0Var7.M2 = 0.0f;
                nq0Var7.N2 = null;
                nq0Var7.O2 = null;
                nq0Var7.K2 = null;
                oj0 oj0Var = nq0Var7.H2;
                if (oj0Var != null) {
                    nq0Var7.q0(oj0Var);
                    nq0Var7.H2 = null;
                }
                v9 v9Var = nq0Var7.S2;
                if (v9Var != null) {
                    nq0Var7.q0(v9Var);
                    nq0Var7.S2 = null;
                }
            }
            J1(ds0VarArr2[z10 ? 1 : 0]);
            ds0 ds0Var7 = ds0VarArr2[z10 ? 1 : 0];
            if (ds0Var7.F == 11) {
                ds0Var7.h.setItemAnimator(ds0Var7.d);
            } else {
                ds0Var7.h.setItemAnimator(null);
                if (us0Var != null && ds0VarArr2[z10 ? 1 : 0].h == us0Var.s) {
                    v4.z zVar3 = us0Var.w;
                    us0Var.s = null;
                    zVar3.h(null);
                }
            }
            if (qr0Var != null && ds0VarArr2[z10 ? 1 : 0].F != 12 && qr0Var.getParent() == ds0VarArr2[z10 ? 1 : 0]) {
                qr0Var.a.onRemoveFromParent();
                ds0VarArr2[z10 ? 1 : 0].removeView(qr0Var);
            }
            if (view != null && ds0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                ds0 ds0Var8 = ds0VarArr2[z10 ? 1 : 0];
                if (parent == ds0Var8) {
                    ds0Var8.removeView(view);
                }
            }
            if (gq0Var != null && ds0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = gq0Var.getParent();
                ds0 ds0Var9 = ds0VarArr2[z10 ? 1 : 0];
                if (parent2 == ds0Var9) {
                    ds0Var9.removeView(gq0Var);
                }
            }
            int i23 = ds0VarArr2[z10 ? 1 : 0].F;
            if (i23 != 0 && i23 != 11 && !z0(i23) && (i12 = ds0VarArr2[z10 ? 1 : 0].F) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || xr0Var.Y()) && (i13 = ds0VarArr2[z10 ? 1 : 0].F) != 10 && i13 != 13 && i13 != 14)) {
                if (z10) {
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (!(z4Var != null ? z4Var.G : kVar.o0)) {
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
                    if (q0Var != null && q0Var.getVisibility() == 4) {
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
                if (q0Var != null) {
                    setSearchItemVisibility((I0() || this.Y0) ? 8 : 4);
                }
            }
            int i24 = ds0VarArr2[z10 ? 1 : 0].F;
            if (i24 == 6) {
                if (!wr0Var.e && !wr0Var.h && wr0Var.d.isEmpty()) {
                    wr0Var.E(0L);
                }
            } else if (i24 != 7) {
                if (z0(i24)) {
                    gt0 z19 = z1(ds0VarArr2[z10 ? 1 : 0].F);
                    if (z19 != null) {
                        fi.h6 h6Var = z19.s;
                        z19.P();
                        ds0VarArr2[z10 ? 1 : 0].w.e(h6Var != null && (h6Var.k() || (t0() && h6Var.g() > 0)), z10);
                        z13 = (h6Var == null || h6Var.g() <= 0 || G0()) ? false : true;
                    }
                } else {
                    int i25 = ds0VarArr2[z10 ? 1 : 0].F;
                    if (i25 != 10 && i25 != 11 && i25 != 12 && i25 != 13 && i25 != 14) {
                        if (i25 == 15) {
                            i25 = 8;
                        }
                        ys0 ys0Var6 = ys0VarArr[i25];
                        if (!ys0Var6.g && !ys0Var6.i[0] && ys0Var6.a.isEmpty()) {
                            ys0VarArr[i25].g = true;
                            i0Var2.f();
                            if (i25 == 0) {
                                int i26 = ys0VarArr[0].q;
                                if (i26 == 1) {
                                    i7 = 6;
                                } else if (i26 == 2) {
                                    i7 = 7;
                                }
                                org.telegram.ui.ActionBar.g2 g2Var = this.y1;
                                g2Var.getMediaDataController().Q0(this.m1, 50, 0, 0, i7, this.G, 1, g2Var.getClassGuid(), ys0VarArr[i7].p, null, null);
                            }
                            i7 = i25;
                            org.telegram.ui.ActionBar.g2 g2Var2 = this.y1;
                            g2Var2.getMediaDataController().Q0(this.m1, 50, 0, 0, i7, this.G, 1, g2Var2.getClassGuid(), ys0VarArr[i7].p, null, null);
                        }
                    }
                }
            }
            int i27 = ds0VarArr2[z10 ? 1 : 0].F;
            if (i27 == 8 || J0(i27)) {
                i10 = 4;
                ds0 ds0Var10 = ds0VarArr2[z10 ? 1 : 0];
                zq0 zq0Var = ds0Var10.w;
                boolean J0 = J0(ds0Var10.F);
                int w12 = w1(ds0VarArr2[z10 ? 1 : 0].F);
                q9 q9Var = zq0Var.b;
                hi.e eVar = zq0Var.f;
                q9Var.setVisibility((J0 || H0() || B0()) ? 8 : 0);
                if (J0) {
                    eVar.setVisibility(0);
                    eVar.h(org.telegram.messenger.hd.N0(2131744562, null), false);
                    i11 = 8;
                } else if (H0()) {
                    i11 = 8;
                    eVar.setVisibility(8);
                } else {
                    i11 = 8;
                    zq0Var.setStickerType(11);
                    eVar.setVisibility(!G0() ? 0 : 8);
                    eVar.h(A(), false);
                }
                if (J0) {
                    zq0Var.d.setText(org.telegram.messenger.hd.N0(2131744540, null));
                    zq0Var.e.setText(org.telegram.messenger.hd.N0(2131744541, null));
                } else {
                    zq0Var.d.setText(org.telegram.messenger.hd.N0(!G0() ? I0() ? 2131747983 : 2131747954 : 2131748011, null));
                    zq0Var.e.setText(I0() ? org.telegram.messenger.hd.N0(2131747955, null) : "");
                }
                eVar.setOnClickListener(new bi.m5(this, J0, w12, 1));
            } else {
                ds0 ds0Var11 = ds0VarArr2[z10 ? 1 : 0];
                if (ds0Var11.F == 9) {
                    if (H0()) {
                        ds0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        ds0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        ds0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        ds0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        ds0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        ds0VarArr2[z10 ? 1 : 0].w.f.h(A(), false);
                    }
                    ds0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.hd.N0(2131748053, null));
                    ds0VarArr2[z10 ? 1 : 0].w.e.setText(I0() ? org.telegram.messenger.hd.N0(2131748054, null) : "");
                    i10 = 4;
                    ds0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new ip0(this, i10));
                    i11 = 8;
                } else {
                    i10 = 4;
                    ds0Var11.w.b.setVisibility(0);
                    ds0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    ds0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
                    ds0VarArr2[z10 ? 1 : 0].w.e.setText(org.telegram.messenger.hd.N0(2131745611, null));
                    i11 = 8;
                    ds0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z14 = false;
            ds0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            w0Var3 = w0Var2;
        }
        int i28 = i15;
        ds0 ds0Var12 = ds0VarArr2[z10 ? 1 : 0];
        ds0Var12.b = z13;
        F1(ds0Var12, z14);
        ds0VarArr2[z10 ? 1 : 0].x.y1(i28);
        ds0VarArr2[z10 ? 1 : 0].h.a0();
        if (w0Var3 != null) {
            ds0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(w0Var3);
            ds0VarArr2[z10 ? 1 : 0].n.setRecycledViewPool(w0Var3);
        }
        if (this.A0 == 2) {
            if (z4Var != null ? z4Var.G : kVar.o0) {
                this.C0 = true;
                if (z4Var != null) {
                    z4Var.o(true);
                } else {
                    kVar.n(true);
                }
                this.A0 = 0;
                this.r0 = 0.0f;
                if (q0Var != null) {
                    setSearchItemVisibility(I0() ? i11 : i10);
                }
                I1(false);
            }
        }
    }

    public final void C(is0 is0Var) {
        final View[] viewArr = new View[2];
        final int i7 = 0;
        viewArr[0] = is0Var.i0(R.drawable.msg_zoomin, new Runnable(this) { // from class: org.telegram.ui.Components.xp0
            public final /* synthetic */ jt0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        jt0 jt0Var = this.b;
                        jt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        jt0Var.Q1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        jt0 jt0Var2 = this.b;
                        jt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        jt0Var2.R1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.hd.N0(2131748457, null), false, false);
        final int i10 = 1;
        viewArr[1] = is0Var.i0(R.drawable.msg_zoomout, new Runnable(this) { // from class: org.telegram.ui.Components.xp0
            public final /* synthetic */ jt0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        jt0 jt0Var = this.b;
                        jt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        jt0Var.Q1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        jt0 jt0Var2 = this.b;
                        jt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        jt0Var2.R1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.hd.N0(2131748456, null), false, false);
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
        org.telegram.ui.ActionBar.g2 g2Var;
        if (this.g1 == null || (g2Var = this.y1) == null) {
            return false;
        }
        return org.telegram.messenger.v3.V(g2Var.getMessagesController().O0(Long.valueOf(this.g1.id)));
    }

    public final void C1(org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (y0Var2.getCheckView().a.q || !y0Var.getCheckView().a.q) {
            y0Var.setChecked(!y0Var.getCheckView().a.q);
            runnable.run();
        } else {
            float f10 = -this.v1;
            this.v1 = f10;
            org.telegram.messenger.g0.E3(f10, y0Var, null);
        }
    }

    public final void D(cs0 cs0Var, int i7, SparseBooleanArray sparseBooleanArray) {
        int childCount = cs0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cs0Var.getChildAt(i10);
            if (childAt instanceof yz) {
                view = childAt;
            }
        }
        if (view != null) {
            cs0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new kr0(this, cs0Var, sparseBooleanArray, (yz) view, i7));
    }

    public final boolean D0() {
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.n0;
            if (i7 >= ds0VarArr.length) {
                return false;
            }
            ds0 ds0Var = ds0VarArr[i7];
            if (ds0Var != null) {
                nq0 nq0Var = ds0Var.h;
                if (nq0Var != null && nq0Var.c0()) {
                    return true;
                }
                cs0 cs0Var = ds0VarArr[i7].n;
                if (cs0Var != null && cs0Var.c0()) {
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
            int s02 = s0(org.telegram.ui.ActionBar.m6.y8);
            int s03 = s0(org.telegram.ui.ActionBar.m6.z8);
            if (s02 == this.r2 && s03 == this.s2) {
                return;
            }
            this.r2 = s02;
            this.s2 = s03;
            org.telegram.ui.ActionBar.q0[] q0VarArr = {this.x0, this.w0, this.y0, this.z0, this.o0};
            for (int i7 = 0; i7 < 5; i7++) {
                org.telegram.ui.ActionBar.q0 q0Var = q0VarArr[i7];
                if (q0Var != null) {
                    q0Var.setIconColor(s02);
                    if (q0Var.getBackground() != null) {
                        org.telegram.ui.ActionBar.m6.H1(q0Var.getBackground(), s03, true);
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void E(boolean z10) {
        rh0 rh0Var = this.v0;
        if (rh0Var == null || this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z10 || rh0Var.getAnimatedDrawable().b0 >= 20) {
            rh0Var.getAnimatedDrawable().P(this.Z1 ? 50 : 100);
        } else {
            rh0Var.getAnimatedDrawable().P(0);
        }
        rh0Var.getAnimatedDrawable().start();
    }

    public final boolean E0() {
        gq0 gq0Var = this.b0;
        if (gq0Var != null && gq0Var.g()) {
            return true;
        }
        jq0 jq0Var = this.c0;
        return jq0Var != null && jq0Var.f;
    }

    public final void E1() {
        if (D0()) {
            post(new hp0(this, 13));
            return;
        }
        pr0 pr0Var = this.K;
        if (pr0Var != null) {
            pr0Var.f();
        }
        ws0 ws0Var = this.N;
        if (ws0Var != null) {
            ws0Var.f();
        }
        ws0 ws0Var2 = this.O;
        if (ws0Var2 != null) {
            ws0Var2.f();
        }
        xs0 xs0Var = this.M;
        if (xs0Var != null) {
            xs0Var.X(false);
        }
        ws0 ws0Var3 = this.P;
        if (ws0Var3 != null) {
            ws0Var3.f();
        }
        ss0 ss0Var = this.Q;
        if (ss0Var != null) {
            ss0Var.f();
        }
        yr0 yr0Var = this.R;
        if (yr0Var != null) {
            yr0Var.f();
        }
        sr0 sr0Var = this.f0;
        if (sr0Var != null) {
            sr0Var.f();
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ((it0) it.next()).c.f();
        }
    }

    public final void F(int i7) {
        int i10;
        ds0 g02 = g0(this.s1);
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
            cs0 cs0Var = g02.n;
            int paddingLeft = cs0Var.getPaddingLeft();
            cs0 cs0Var2 = g02.n;
            int j02 = j0(g02.F);
            cs0Var2.h3 = j02;
            int paddingRight = g02.n.getPaddingRight();
            cs0 cs0Var3 = g02.n;
            int i02 = i0(I0());
            cs0Var3.i3 = i02;
            cs0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.r.y1(i7);
            g02.n.a0();
            int i11 = 0;
            while (true) {
                ds0[] ds0VarArr = this.n0;
                if (i11 >= ds0VarArr.length) {
                    break;
                }
                ds0 ds0Var = ds0VarArr[i11];
                if (ds0Var != null && ((i10 = ds0Var.F) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.Z3(ds0VarArr[i11].h);
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
            ofFloat.addUpdateListener(new er0(this, g02, i12));
            ofFloat.addListener(new ki.h2(this, z0(g02.F) ? 1 : 0, i7, 2));
            ofFloat.setInterpolator(nr.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean F0(int i7) {
        return i7 == 7 ? this.G1.Y() : (G0() || i7 == 0 || z0(i7) || i7 == 2 || i7 == 5 || i7 == 6 || i7 == 11 || i7 == 10 || i7 == 13 || i7 == 14 || i7 == 15) ? false : true;
    }

    public final void F1(ds0 ds0Var, boolean z10) {
        boolean z11 = ds0Var.b && this.d;
        jj0 fastScroll = ds0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = ds0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ds0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<jj0, Float>) property, fastScroll.getAlpha(), 1.0f);
            ds0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<jj0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new org.telegram.ui.on(fastScroll));
        ds0Var.c = ofFloat2;
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
        org.telegram.ui.ActionBar.q0 q0Var = this.w0;
        if (q0Var == null) {
            return;
        }
        boolean z10 = this.y1.getMessagesController().G2(this.m1) || u0();
        q0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && q0Var.getBackground() != null) {
            q0Var.setBackground(null);
            return;
        }
        if (z10 || q0Var.getBackground() != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(s0(i7), 5, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        q0Var.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(q0Var, h02, null, M, this.I1);
    }

    public final boolean H() {
        boolean B0 = B0();
        long j3 = this.m1;
        org.telegram.ui.ActionBar.g2 g2Var = this.y1;
        if (B0) {
            TLRPC.User c22 = org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).c2(Long.valueOf(j3));
            return c22 != null && c22.bot && c22.bot_can_edit;
        }
        if (I0()) {
            return true;
        }
        return g2Var != null && g2Var.getMessagesController().R1().h(j3);
    }

    public boolean H0() {
        return false;
    }

    public final void H1() {
        gq0 gq0Var = this.b0;
        if (gq0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.d2;
            es esVar = this.S0;
            gq0Var.setPaddingTop(L + (esVar != null ? (int) esVar.d(org.telegram.messenger.g0.L(7.0f)) : 0));
        }
    }

    public boolean I() {
        return !(this instanceof c30);
    }

    public boolean I0() {
        return false;
    }

    public final void I1(boolean z10) {
        gq0 gq0Var;
        jq0 jq0Var;
        R(true, true);
        rh0 rh0Var = this.v0;
        if (rh0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.Y0 && (((gq0Var = this.b0) == null || !gq0Var.g()) && ((jq0Var = this.c0) == null || !jq0Var.f))) {
            f10 = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        rh0Var.setAlpha(f10);
        if (z10) {
            E(k0(1.0f) > 0.5f);
        } else if (this.A0 == 2) {
            E(this.s0 > 0.1f);
        } else {
            E(this.r0 < 0.1f);
        }
    }

    public final boolean J() {
        ds0 ds0Var;
        ds0[] ds0VarArr = this.n0;
        if (ds0VarArr != null && (ds0Var = ds0VarArr[0]) != null) {
            boolean z02 = z0(ds0Var.F);
            int i7 = this.p1[z02 ? 1 : 0];
            if (i7 != h0(z02 ? 1 : 0, i7, true)) {
                return true;
            }
        }
        return false;
    }

    public final void J1(ds0 ds0Var) {
        boolean b12 = ds0Var.h.b1();
        if (b12) {
            ds0Var.h.setSectionsDrawBackground(this.c2);
        }
        ds0Var.setDrawPageBackground((!this.c2 || b12 || ds0Var.F == 15) ? false : true);
        if (ds0Var.F != 15) {
            ds0Var.setClipToOutline(false);
            ds0Var.setBackground(null);
            ds0Var.setWallpaper(null);
            return;
        }
        Drawable drawable = ds0Var.P;
        if (drawable == null) {
            drawable = ds0Var.getBackground();
        }
        Drawable e10 = hi.v5.e(drawable, this.y1.getCurrentAccount(), this.m1, org.telegram.ui.ActionBar.m6.I.q());
        if (this.c2) {
            ds0Var.setBackground(null);
            ds0Var.setClipToOutline(false);
            ds0Var.setWallpaper(e10);
        } else {
            ds0Var.setWallpaper(null);
            ds0Var.setBackground(e10);
            ds0Var.setOutlineProvider(new bg.q0(15));
            ds0Var.setClipToOutline(true);
        }
    }

    public final boolean K() {
        ds0 ds0Var;
        ds0[] ds0VarArr = this.n0;
        if (ds0VarArr == null || (ds0Var = ds0VarArr[0]) == null) {
            return false;
        }
        if (this.n1 && z0(ds0Var.F)) {
            return false;
        }
        boolean z02 = z0(ds0VarArr[0].F);
        int i7 = this.p1[z02 ? 1 : 0];
        return i7 != h0(z02 ? 1 : 0, i7, false);
    }

    public final boolean K0() {
        if (H() && ((getClosestTab() == 8 || getClosestTab() == 13 || J0(getClosestTab())) && this.F1)) {
            return false;
        }
        gq0 gq0Var = this.b0;
        if (gq0Var != null && gq0Var.g()) {
            return false;
        }
        jq0 jq0Var = this.c0;
        return ((jq0Var != null && jq0Var.f) || this.r1 || this.j1) ? false : true;
    }

    public final void K1(ds0 ds0Var) {
        int i7 = ds0Var.F;
        boolean z10 = i7 == 0 || z0(i7);
        FrameLayout.LayoutParams d = c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, z10 ? 0.0f : 12.0f, (z10 ? 8 : 12) + 48, z10 ? 0.0f : 12.0f, z10 ? 0.0f : 12.0f);
        d.topMargin = n0(ds0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = ds0Var.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        ds0Var.s.setLayoutParams(d);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        fq0 fq0Var;
        qr0 qr0Var;
        gq0 gq0Var;
        ds0[] ds0VarArr = this.n0;
        int length = ds0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            ds0 ds0Var = ds0VarArr[i7];
            if (ds0Var != null && ds0Var.getVisibility() == 0) {
                if (ds0Var.P != null) {
                    RectF rectF2 = this.j2;
                    if (jh.k.c(ds0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        ds0Var.h(canvas);
                        canvas.restore();
                    }
                }
                if (ds0Var.F == 14 && (gq0Var = this.b0) != null && gq0Var.getParent() == ds0Var) {
                    for (View view : gq0Var.h.getViewPages()) {
                        if ((view instanceof bi.m6) && view.getVisibility() == 0) {
                            bi.f6 f6Var = ((bi.m6) view).f;
                            ih.d.a(f6Var, canvas, rectF, f6Var, viewGroup);
                        }
                    }
                } else {
                    ek0 currentListView = (ds0Var.F == 12 && (qr0Var = this.W) != null && qr0Var.getParent() == ds0Var) ? qr0Var.a.A0 : (ds0Var.F == 13 && (fq0Var = this.a0) != null && fq0Var.getParent() == ds0Var) ? fq0Var.getCurrentListView() : ds0Var.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        ih.d.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(int i7, int i10, int i11, boolean z10) {
        ys0[] ys0VarArr = this.w1;
        ys0VarArr[i7].a.clear();
        ys0VarArr[i7].b[0].clear();
        ys0VarArr[i7].b[1].clear();
        ys0 ys0Var = ys0VarArr[i7];
        ys0Var.j[0] = i10;
        ys0Var.i[0] = false;
        ys0Var.l = false;
        ys0Var.m = i11;
        ys0Var.n = (ys0Var.e() - i11) - 1;
        ys0 ys0Var2 = ys0VarArr[i7];
        if (ys0Var2.n < 0) {
            ys0Var2.n = 0;
        }
        ys0Var2.k = i10;
        ys0Var2.o = true;
        ys0Var2.g = false;
        ys0Var2.p++;
        ds0 g02 = g0(i7);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (!z10) {
            return;
        }
        int i12 = 0;
        while (true) {
            ds0[] ds0VarArr = this.n0;
            if (i12 >= ds0VarArr.length) {
                return;
            }
            ds0 ds0Var = ds0VarArr[i12];
            if (ds0Var.F == i7) {
                ds0Var.x.h1(Math.min(ys0VarArr[i7].e() - 1, ys0VarArr[i7].m), 0);
            }
            i12++;
        }
    }

    public final void L1(boolean z10) {
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.n0;
            if (i7 >= ds0VarArr.length) {
                return;
            }
            int childCount = ds0VarArr[i7].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ds0VarArr[i7].h.getChildAt(i10);
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
        jt0 jt0Var;
        ArrayList arrayList;
        int i7;
        int i10;
        Bitmap bitmap;
        ds0 g02 = g0(0);
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
                jt0Var = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new jg.j0((FrameLayout) jt0Var, view, (View) g02, (Object) bitmap2, 2)).start();
                g02.h.setAlpha(0.0f);
                g02.h.animate().alpha(1.0f).setUpdateListener(new h60(g02, 21)).setDuration(200L).start();
                bt0 bt0Var = jt0Var.x1;
                int[] iArr = bt0Var.c;
                arrayList = bt0Var.n[0].a;
                ys0[] ys0VarArr = jt0Var.w1;
                ys0 ys0Var = ys0VarArr[0];
                int[] iArr2 = ys0Var.f;
                iArr2[1] = 0;
                i7 = ys0Var.q;
                if (i7 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i7 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                ys0Var.h = false;
                long j3 = jt0Var.m1;
                L0(0, !org.telegram.messenger.n5.C(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                M0(false);
                jt0Var.G1.W();
                boolean C = org.telegram.messenger.n5.C(j3);
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
                    ys0 ys0Var2 = ys0VarArr[0];
                    int i11 = ys0Var2.q;
                    if (i11 == 0) {
                        ys0Var2.a(gjVar, 0, false, C);
                    } else if (i11 == 1) {
                        if (org.telegram.messenger.gj.S3(gjVar.k)) {
                            ys0VarArr[0].a(gjVar, 0, false, C);
                        }
                    } else if (!org.telegram.messenger.gj.S3(gjVar.k)) {
                        ys0VarArr[0].a(gjVar, 0, false, C);
                    }
                }
            }
        }
        jt0Var = this;
        bt0 bt0Var2 = jt0Var.x1;
        int[] iArr3 = bt0Var2.c;
        arrayList = bt0Var2.n[0].a;
        ys0[] ys0VarArr2 = jt0Var.w1;
        ys0 ys0Var3 = ys0VarArr2[0];
        int[] iArr22 = ys0Var3.f;
        iArr22[1] = 0;
        i7 = ys0Var3.q;
        if (i7 != 0) {
        }
        ys0Var3.h = false;
        long j32 = jt0Var.m1;
        L0(0, !org.telegram.messenger.n5.C(j32) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        M0(false);
        jt0Var.G1.W();
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
            ys0[] ys0VarArr = this.w1;
            if (ys0VarArr[i10].h && !z10) {
                return;
            }
            long j10 = this.m1;
            if (org.telegram.messenger.n5.C(j10)) {
                return;
            }
            ys0VarArr[i10].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i10 == 0) {
                int i11 = ys0VarArr[i10].q;
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
            org.telegram.ui.ActionBar.g2 g2Var = this.y1;
            tL_messages_getSearchResultsPositions.peer = g2Var.getMessagesController().l1(j10);
            if (j3 != 0 && g2Var.getUserConfig().e() == j10) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = g2Var.getMessagesController().l1(j3);
            }
            ConnectionsManager.getInstance(g2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(g2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.ee(this, ys0VarArr[i10].p, i10, 2)), g2Var.getClassGuid());
        }
    }

    public final void M1(float f10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.p0;
        if (q0Var == null) {
            return;
        }
        ds0[] ds0VarArr = this.n0;
        ds0 ds0Var = ds0VarArr[1];
        float f11 = 0.0f;
        if (ds0Var != null && ds0Var.F == 11) {
            f11 = 0.0f + f10;
        }
        ds0 ds0Var2 = ds0VarArr[0];
        if (ds0Var2 != null && ds0Var2.F == 11) {
            f11 += 1.0f - f10;
        }
        q0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        q0Var.setScaleX(f12);
        q0Var.setScaleY(f12);
        q0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
    }

    public final void N() {
        fr0 fr0Var = this.L0;
        if (fr0Var.d(fr0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = fr0Var.getFirstTabId();
        fr0Var.setInitialTabId(firstTabId);
        this.n0[0].F = firstTabId;
        B1(false);
    }

    public final void N0(int i7) {
        int i10;
        int i11 = 2;
        ys0[] ys0VarArr = this.w1;
        if (i7 == 0) {
            int i12 = ys0VarArr[0].q;
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
        ys0VarArr[i7].g = true;
        org.telegram.ui.ActionBar.g2 g2Var = this.y1;
        g2Var.getMediaDataController().Q0(this.m1, 50, 0, ys0VarArr[i7].k, i10, this.G, 1, g2Var.getClassGuid(), ys0VarArr[i7].p, null, null);
    }

    public final void N1() {
        org.telegram.ui.ActionBar.q0 q0Var = this.p0;
        if (q0Var == null) {
            return;
        }
        ds0 ds0Var = this.n0[1];
        boolean z10 = ds0Var != null && ds0Var.F == 11;
        if (z10) {
            q0Var.setVisibility(0);
        }
        q0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new rp0(0, this, z10)).setDuration(420L).setInterpolator(nr.h).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(ds0 ds0Var, ek0 ek0Var, v4.c0 c0Var) {
        int i7;
        int i10;
        boolean[] zArr;
        v4.f1 K;
        fi.h6 h6Var;
        if (this.r1 || this.N1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (ek0Var.getFastScroll() == null || !ek0Var.getFastScroll().n || currentTimeMillis - ds0Var.a >= 300) {
            ds0Var.a = currentTimeMillis;
            if (this.Y0 && this.X0 && ds0Var.F != 11) {
                return;
            }
            int i11 = 7;
            if (ds0Var.F == 7) {
                return;
            }
            int L0 = c0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(c0Var.N0() - L0) + 1;
            int b10 = ek0Var.getAdapter() == null ? 0 : ek0Var.getAdapter().b();
            int i12 = ds0Var.F;
            int[] iArr = this.p1;
            ys0[] ys0VarArr = this.w1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                b10 = ys0VarArr[i12].d() + ys0VarArr[i12].a.size();
                ys0 ys0Var = ys0VarArr[i12];
                if (ys0Var.h && ys0Var.e.size() > 2 && ds0Var.F == 0 && ys0VarArr[i12].a.size() != 0) {
                    float f10 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((ek0Var.getMeasuredHeight() / (ek0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((js0) ys0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((js0) ys0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > b10 && L0 - b10 > measuredHeight) || ((i7 = L0 + abs) < ys0VarArr[i12].m && ys0VarArr[0].m - i7 > measuredHeight)) {
                        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(this, i12, ek0Var, 19);
                        this.N1 = f0Var;
                        org.telegram.messenger.g0.g3(f0Var);
                        return;
                    }
                }
            }
            int i13 = ds0Var.F;
            if (i13 == 7) {
                return;
            }
            if (z0(i13)) {
                gt0 z12 = z1(ds0Var.F);
                if (z12 == null || (h6Var = z12.s) == null || L0 + abs <= h6Var.i() - iArr[1]) {
                    return;
                }
                z12.P();
                return;
            }
            int i14 = ds0Var.F;
            if (i14 == 6) {
                if (abs > 0) {
                    wr0 wr0Var = this.S;
                    boolean z10 = wr0Var.h;
                    ArrayList arrayList = wr0Var.d;
                    if (z10 || wr0Var.e || arrayList.isEmpty() || L0 + abs < b10 - 5) {
                        return;
                    }
                    wr0Var.E(((TLRPC.Chat) i5.c.h(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.y1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < ds0Var.h.getChildCount(); i16++) {
                    View childAt = ds0Var.h.getChildAt(i16);
                    ds0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                v4.i0 adapter = ds0Var.h.getAdapter();
                vs0 vs0Var = this.V;
                if (adapter != vs0Var) {
                    if (i15 + 1 >= g2Var.getMessagesController().I1().i.size()) {
                        g2Var.getMessagesController().I1().g(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < vs0Var.h.size() + vs0Var.e.size() || vs0Var.s || vs0Var.r) {
                        return;
                    }
                    vs0Var.r = true;
                    vs0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > b10 - i17 || ys0VarArr[i18].o) {
                ys0 ys0Var2 = ys0VarArr[i18];
                if (!ys0Var2.g) {
                    if (i14 == 0) {
                        int i19 = ys0VarArr[0].q;
                        if (i19 == 1) {
                            i10 = 6;
                        } else {
                            if (i19 != 2) {
                                i10 = 0;
                            }
                            i10 = i11;
                        }
                        zArr = ys0Var2.i;
                        if (zArr[0]) {
                            ys0Var2.g = true;
                            g2Var.getMediaDataController().Q0(this.m1, 50, ys0VarArr[i18].j[0], 0, i10, this.G, 1, g2Var.getClassGuid(), ys0VarArr[i18].p, null, null);
                        } else if (this.f1 != 0 && !zArr[1]) {
                            ys0Var2.g = true;
                            g2Var.getMediaDataController().Q0(this.f1, 50, ys0VarArr[i18].j[1], 0, i10, this.G, 1, g2Var.getClassGuid(), ys0VarArr[i18].p, null, null);
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
                        zArr = ys0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i20 = ys0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.K.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                ys0 ys0Var3 = ys0VarArr[i18];
                if (!ys0Var3.g && !ys0Var3.l && !ys0Var3.o) {
                    N0(ds0Var.F);
                }
            }
            ds0 ds0Var2 = this.n0[0];
            if (ds0Var2.h == ek0Var) {
                int i21 = ds0Var2.F;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = ek0Var.K(L0)) == null) {
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
                        org.telegram.messenger.gj gjVar = q7Var.e <= 0 ? null : q7Var.b[0];
                        if (gjVar != null) {
                            v0Var.h0(gjVar.k.date, false, true);
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
            if (J0(getClosestTab())) {
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
        int i7 = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.c1;
            if (i7 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[0].valueAt(i7);
            sr0 sr0Var = this.f0;
            if (sr0Var != null && (h6Var = sr0Var.s) != null && !h6Var.m(gjVar.e1())) {
                z10 = true;
                break;
            }
            i7++;
        }
        if (q0Var2 != null) {
            q0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (q0Var != null) {
            q0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean P(MotionEvent motionEvent) {
        fq0 fq0Var;
        ds0[] ds0VarArr = this.n0;
        int i7 = ds0VarArr[0].F;
        if (i7 == 13 && (fq0Var = this.a0) != null) {
            View currentView = fq0Var.n.getCurrentView();
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
                        ds0VarArr[0].h.I0(false);
                        ds0VarArr[0].h.cancelLongPress();
                        ds0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - ds0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - ds0VarArr[0].getY());
                        int i16 = this.x;
                        this.s = -1;
                        int top2 = y11 - ds0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F == 1) {
                            top2 = 0;
                        }
                        for (int i17 = 0; i17 < ds0VarArr[0].h.getChildCount(); i17++) {
                            View childAt2 = ds0VarArr[0].h.getChildAt(i17);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i16, top2)) {
                                ds0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.G1.Y() && this.s == -1) {
                            this.s = (int) (((this.p1[z0(ds0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i16 / ds0VarArr[0].h.getMeasuredWidth(), 0.0f))) + ds0VarArr[0].x.L0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - ds0VarArr[0].getY() > this.d2) {
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
                                int ceil2 = (((int) Math.ceil(this.s / this.t1)) * i21) + ((int) ((this.C1 / (ds0VarArr[0].h.getMeasuredWidth() - ((int) (ds0VarArr[0].h.getMeasuredWidth() / this.t1)))) * (i21 - 1)));
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
                        ds0VarArr[0].h.invalidate();
                        ds0 ds0Var = ds0VarArr[0];
                        if (ds0Var.G != null) {
                            ds0Var.invalidate();
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
        vr0 vr0Var;
        int i11;
        boolean z17;
        int i12;
        int size;
        int i13;
        Boolean bool;
        String N0;
        String str2;
        String N02;
        String str3;
        String str4;
        String str5;
        String str6;
        gq0 gq0Var;
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
        bt0 bt0Var;
        fr0 fr0Var = this.L0;
        if (fr0Var == null) {
            return;
        }
        boolean z20 = !this.G1.t() ? false : z10;
        boolean z21 = (this.W == null || (bt0Var = this.x1) == null || !bt0Var.f) ? false : true;
        long j3 = this.m1;
        int i21 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.g2 g2Var = this.y1;
        if (i21 <= 0 || g2Var == null) {
            i7 = 1;
            user = null;
        } else {
            i7 = 1;
            user = g2Var.getMessagesController().c2(Long.valueOf(j3));
        }
        boolean z22 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i7 : false;
        int i22 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.h1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z22) ? 0 : i7;
        int i23 = ((org.telegram.messenger.n5.E(j3) || org.telegram.messenger.n5.z(j3)) && !org.telegram.messenger.n5.C(j3) && (((userFull = this.h1) != null && userFull.stories_pinned_available) || (((chatFull = this.g1) != null && chatFull.stories_pinned_available) || I0())) && y0()) ? i7 : 0;
        gq0 gq0Var2 = this.b0;
        int i24 = i22;
        boolean z23 = (gq0Var2 == null || (((userFull3 = this.h1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.g1) == null || chatFull3.stargifts_count <= 0))) ? false : i7;
        int i25 = i23;
        TLRPC.ChatFull chatFull4 = this.g1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.h1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z20;
                int i26 = this.U1 == fr0Var.o0 ? i7 : 0;
                boolean z25 = (i25 == 0 || i24 != 0) ? i7 : false;
                int i27 = i26;
                i10 = z25 == fr0Var.d(8) ? i27 + 1 : i27;
                if (z22 != fr0Var.d(13)) {
                    i10++;
                }
                if (G0() != fr0Var.d(8)) {
                    i10++;
                }
                if (z23 == fr0Var.d(14) || (gq0Var2 != null && z23 && this.T1 != gq0Var2.getLastEmojisHash())) {
                    i10++;
                }
                I0 = I0();
                int i28 = 14;
                vr0 vr0Var2 = this.d0;
                int[] iArr2 = this.a1;
                if (I0) {
                    z11 = z23;
                    int i29 = i10;
                    int i30 = (vr0Var2.d == null ? i7 : false) == fr0Var.d(7) ? i29 + 1 : i29;
                    if (iArr2[0] <= 0) {
                        z18 = i7;
                        i17 = 0;
                    } else {
                        z18 = false;
                        i17 = 0;
                    }
                    int i31 = i30;
                    int i32 = z18 == fr0Var.d(i17) ? i31 + 1 : i31;
                    if (iArr2[i7] <= 0) {
                        z19 = i7;
                        i18 = z19;
                    } else {
                        i18 = i7;
                        z19 = false;
                    }
                    int i33 = i32;
                    int i34 = z19 == fr0Var.d(i18) ? i33 + 1 : i33;
                    if (org.telegram.messenger.n5.C(j3)) {
                        i19 = i34;
                    } else {
                        int i35 = i34;
                        int i36 = (iArr2[3] <= 0) == fr0Var.d(3) ? i35 + 1 : i35;
                        i19 = (iArr2[4] <= 0) == fr0Var.d(4) ? i36 + 1 : i36;
                    }
                    int i37 = i20;
                    int i38 = (iArr2[2] <= 0) == fr0Var.d(2) ? i37 + 1 : i37;
                    int i39 = (iArr2[5] <= 0) == fr0Var.d(5) ? i38 + 1 : i38;
                    int i40 = (iArr2[6] <= 0) == fr0Var.d(6) ? i39 + 1 : i39;
                    boolean z26 = !this.T.d.isEmpty();
                    int i41 = i40;
                    i10 = z26 != fr0Var.d(10) ? i41 + 1 : i41;
                    z12 = x0() && !g2Var.getMessagesController().I1().b && g2Var.getMessagesController().I1().e();
                    z13 = z26;
                    if (z12 != fr0Var.d(11)) {
                        i10++;
                    }
                    if (z21 != fr0Var.d(12)) {
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
                        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(2));
                        z14 = z21;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(fr0Var.getTabsContainer(), transitionSet);
                        fr0Var.V = fr0Var.w;
                        fr0Var.W = fr0Var.x;
                    } else {
                        iArr = iArr2;
                        z14 = z21;
                    }
                    SparseArray f10 = fr0Var.f();
                    if (i10 > 3) {
                        f10 = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (G0()) {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                        arrayList2.add(new Pair(8, org.telegram.messenger.hd.N0(2131746439, null)));
                        fr0Var.c0 = 420L;
                    } else {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                    }
                    if (i24 != 0) {
                        arrayList2.add(new Pair(8, org.telegram.messenger.hd.N0(2131746496, str)));
                    } else if ((org.telegram.messenger.n5.E(j3) || org.telegram.messenger.n5.z(j3)) && !org.telegram.messenger.n5.C(j3) && ((((userFull2 = this.h1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.g1) != null && chatFull2.stories_pinned_available) || I0())) && y0())) {
                        if (A0()) {
                            arrayList2.add(new Pair(9, org.telegram.messenger.hd.N0(2131746531, null)));
                            vr0Var = vr0Var2;
                            fr0Var.c0 = 420L;
                        } else {
                            vr0Var = vr0Var2;
                            arrayList2.add(new Pair(8, org.telegram.messenger.hd.N0(2131746439, null)));
                            if (I0()) {
                                arrayList2.add(new Pair(9, org.telegram.messenger.hd.N0(2131746531, null)));
                            }
                        }
                        if (z11) {
                            i11 = i21;
                            z17 = z14;
                        } else {
                            String N03 = org.telegram.messenger.hd.N0(2131746480, null);
                            HashMap hashMap = bi.s6.V;
                            di.p8 p8Var = gq0Var2.d;
                            Object obj2 = "";
                            if (p8Var == null) {
                                gq0Var = gq0Var2;
                                str6 = N03;
                                i11 = i21;
                                z17 = z14;
                            } else {
                                ArrayList arrayList3 = p8Var.l;
                                str6 = N03;
                                i11 = i21;
                                z17 = z14;
                                Pair pair = new Pair(Integer.valueOf(org.telegram.messenger.k10.t0), Long.valueOf(gq0Var2.c));
                                if (arrayList3.isEmpty()) {
                                    if (p8Var.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
                                        obj2 = obj;
                                    }
                                    gq0Var = gq0Var2;
                                } else {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList4 = new ArrayList();
                                    int i42 = 0;
                                    while (true) {
                                        gq0Var = gq0Var2;
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
                                        gq0Var2 = gq0Var;
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
                                            spannableStringBuilder2.setSpan(new y5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
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
                                        this.T1 = gq0Var.getLastEmojisHash();
                                    }
                                }
                            }
                            i14 = 2;
                            c10 = 0;
                            CharSequence[] charSequenceArr2 = new CharSequence[i14];
                            charSequenceArr2[c10] = str6;
                            charSequenceArr2[1] = obj2;
                            arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                            this.T1 = gq0Var.getLastEmojisHash();
                        }
                        if (z15) {
                            arrayList2.add(new Pair(13, org.telegram.messenger.hd.N0(2131746496, null)));
                        }
                        int i44 = 2131745206;
                        if (!I0()) {
                            if (z16) {
                                str3 = null;
                                arrayList2.add(new Pair(11, org.telegram.messenger.hd.N0(2131745711, null)));
                            } else {
                                str3 = null;
                            }
                            vr0 vr0Var3 = vr0Var;
                            if (vr0Var3.d != null) {
                                arrayList2.add(new Pair(7, org.telegram.messenger.hd.N0(2131749236, str3)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && vr0Var3.d == null) {
                                    arrayList2.add(new Pair(0, org.telegram.messenger.hd.N0(2131745210, null)));
                                } else {
                                    str4 = null;
                                    arrayList2.add(new Pair(0, org.telegram.messenger.hd.N0(2131745211, null)));
                                    if (z17) {
                                        arrayList2.add(new Pair(12, org.telegram.messenger.hd.N0(2131745697, str4)));
                                        org.telegram.messenger.np.g1().edit().putInt("savedhint", 3).apply();
                                    }
                                    if (iArr[1] <= 0) {
                                        str5 = null;
                                        arrayList2.add(new Pair(1, org.telegram.messenger.hd.N0(2131745218, null)));
                                    } else {
                                        str5 = null;
                                    }
                                    if (org.telegram.messenger.n5.C(j3)) {
                                        if (iArr[3] > 0) {
                                            arrayList2.add(new Pair(3, org.telegram.messenger.hd.N0(2131745214, str5)));
                                        }
                                        if (iArr[4] > 0) {
                                            arrayList2.add(new Pair(4, org.telegram.messenger.hd.N0(2131745209, str5)));
                                        }
                                        if (iArr[8] > 0) {
                                            arrayList2.add(new Pair(15, org.telegram.messenger.hd.N0(2131745207, str5)));
                                        }
                                    } else if (iArr[4] > 0) {
                                        arrayList2.add(new Pair(4, org.telegram.messenger.hd.N0(2131745209, str5)));
                                    }
                                    if (iArr[2] > 0) {
                                        arrayList2.add(new Pair(2, org.telegram.messenger.hd.N0(2131745206, str5)));
                                    }
                                    if (iArr[5] > 0) {
                                        arrayList2.add(new Pair(5, org.telegram.messenger.hd.N0(2131745217, str5)));
                                    }
                                    if (iArr[6] > 0) {
                                        arrayList2.add(new Pair(6, org.telegram.messenger.hd.N0(2131745216, str5)));
                                    }
                                    if (z13) {
                                        arrayList2.add(new Pair(10, org.telegram.messenger.hd.N0(i11 > 0 ? 2131745122 : 2131745118, null)));
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
                        if (fr0Var.o0) {
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
                                            N0 = org.telegram.messenger.hd.N0(2131745210, null);
                                        } else if (i45 == 1) {
                                            N0 = org.telegram.messenger.hd.N0(2131745218, null);
                                        } else if (i45 == 2) {
                                            N0 = org.telegram.messenger.hd.N0(i44, null);
                                        } else if (i45 == 3) {
                                            N0 = org.telegram.messenger.hd.N0(2131745214, null);
                                        } else if (i45 == 4) {
                                            N0 = org.telegram.messenger.hd.N0(2131745209, null);
                                        } else if (i45 != 5) {
                                            if (i45 == 8) {
                                                N02 = org.telegram.messenger.hd.N0(2131746439, null);
                                            } else if (i45 != i28) {
                                                str2 = null;
                                                arrayList2.add(new Pair(valueOf2, str2));
                                                i45++;
                                                i44 = 2131745206;
                                                i28 = 14;
                                            } else {
                                                N02 = org.telegram.messenger.hd.N0(2131746480, null);
                                            }
                                            str2 = N02;
                                            arrayList2.add(new Pair(valueOf2, str2));
                                            i45++;
                                            i44 = 2131745206;
                                            i28 = 14;
                                        } else {
                                            N0 = org.telegram.messenger.hd.N0(2131745217, null);
                                        }
                                        str2 = N0;
                                        arrayList2.add(new Pair(valueOf2, str2));
                                        i45++;
                                        i44 = 2131745206;
                                        i28 = 14;
                                    }
                                }
                                i45++;
                                i44 = 2131745206;
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
                                    if (!fr0Var.d(((Integer) pair2.first).intValue())) {
                                        fr0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, f10);
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
                    vr0Var = vr0Var2;
                    if (z11) {
                    }
                    if (z15) {
                    }
                    int i442 = 2131745206;
                    if (!I0()) {
                    }
                    if (fr0Var.o0) {
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
                this.U1 = fr0Var.o0;
                fr0Var.c();
                Y0();
                S();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z20;
        if (this.U1 == fr0Var.o0) {
        }
        if (i25 == 0) {
        }
        int i272 = i26;
        if (z25 == fr0Var.d(8)) {
        }
        if (z22 != fr0Var.d(13)) {
        }
        if (G0() != fr0Var.d(8)) {
        }
        if (z23 == fr0Var.d(14)) {
        }
        i10++;
        I0 = I0();
        int i282 = 14;
        vr0 vr0Var22 = this.d0;
        int[] iArr22 = this.a1;
        if (I0) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.U1 = fr0Var.o0;
        fr0Var.c();
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
        ds0[] ds0VarArr = this.n0;
        ds0 ds0Var = ds0VarArr[0];
        if (ds0Var == null) {
            return null;
        }
        int i7 = ds0Var.F;
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
                org.telegram.messenger.cz.B(h02);
            } else if (m0(ds0VarArr[0].F) >= 5 || J0(ds0VarArr[0].F)) {
                org.telegram.messenger.cz.F(h02);
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
        org.telegram.ui.ActionBar.q0 q0Var = this.q0;
        if (q0Var != null) {
            ((org.telegram.ui.ActionBar.g5) q0Var).Z(z13 && I() && (F0(closestTab) || (closestTab == 11 && x0())), z10);
        }
        org.telegram.ui.ActionBar.g5 g5Var = this.J;
        if (g5Var != null) {
            if (z13 && I() && !A0() && v0(closestTab)) {
                z12 = true;
            }
            g5Var.Z(z12, z11);
        }
    }

    public final void R0() {
        fi.h6 h6Var;
        fi.h6 h6Var2;
        this.K1.b();
        sr0 sr0Var = this.f0;
        if (sr0Var != null && (h6Var2 = sr0Var.s) != null && h6Var2 != null) {
            h6Var2.z(sr0Var.w);
        }
        eq0 eq0Var = this.h0;
        if (eq0Var != null && (h6Var = eq0Var.s) != null && h6Var != null) {
            h6Var.z(eq0Var.w);
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ht0 ht0Var = ((it0) it.next()).c;
            fi.h6 h6Var3 = ht0Var.s;
            if (h6Var3 != null && h6Var3 != null) {
                h6Var3.z(ht0Var.w);
            }
        }
    }

    public final Boolean R1(View view, View view2) {
        if (this.r1) {
            return null;
        }
        ds0[] ds0VarArr = this.n0;
        ds0 ds0Var = ds0VarArr[0];
        if (ds0Var == null) {
            return null;
        }
        if (this.n1 && z0(ds0Var.F)) {
            return null;
        }
        int i7 = ds0VarArr[0].F;
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
                org.telegram.messenger.cz.B(h02);
            } else if (m0(ds0VarArr[0].F) >= 5 || J0(ds0VarArr[0].F)) {
                org.telegram.messenger.cz.F(h02);
            }
            F(h02);
        }
        return Boolean.valueOf(h02 != h0(z02 ? 1 : 0, h02, false));
    }

    public final void S() {
        float abs;
        ds0[] ds0VarArr = this.n0;
        ds0 ds0Var = ds0VarArr[0];
        if (ds0Var == null || ds0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        jq0 jq0Var = this.c0;
        if (jq0Var != null) {
            char c10 = (!z0(ds0Var.F) || ds0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (ds0VarArr[1].getVisibility() == 0 ? (!z0(ds0VarArr[1].F) || ds0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                jq0Var.setTranslationX(c10 != 0 ? 0.0f : ds0VarArr[0].getMeasuredWidth());
            } else {
                jq0Var.setTranslationX(ds0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(jq0Var.getTranslationX()) / jq0Var.getMeasuredWidth());
            }
            float f11 = 0.0f;
            for (int i7 = 0; i7 < ds0VarArr.length; i7++) {
                if (ds0VarArr[i7].getVisibility() == 0) {
                    nq0 nq0Var = ds0VarArr[i7].h;
                    View childAt = nq0Var.getChildCount() == 0 ? null : nq0Var.getChildAt(0);
                    f11 += Utilities.l(1.0f - (ds0VarArr[i7].getTranslationX() / ds0VarArr[i7].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - nq0Var.getPaddingTop() : nq0Var.getChildCount() == 0 ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
            }
            float l10 = Utilities.l(1.0f - ((-f11) / org.telegram.messenger.g0.N(48.0f)));
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
            jq0Var.setAlpha(l10);
            jq0Var.setScaleX(T1);
            jq0Var.setScaleY(T1);
            jq0Var.setTranslationY(this.O1 + f11);
            f10 = abs;
        }
        U();
        if (this.Y1 != f10) {
            this.Y1 = f10;
            invalidate();
        }
    }

    public final void S0(int i7, View view, org.telegram.messenger.gj gjVar, int i10) {
        String str;
        if (gjVar == null || this.r1) {
            return;
        }
        jq0 jq0Var = this.c0;
        if (jq0Var == null || !jq0Var.f) {
            int i11 = 0;
            i11 = 0;
            String str2 = null;
            if (this.F1) {
                int i12 = 8;
                if (i10 == 8 && !H()) {
                    return;
                }
                char c10 = org.telegram.messenger.gj.B0(gjVar.k) == this.m1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.c1;
                if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                    sparseArrayArr[c10].remove(gjVar.e1());
                    if (!gjVar.s(null, false)) {
                        this.d1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(gjVar.e1(), gjVar);
                    if (!gjVar.s(null, false)) {
                        this.d1++;
                    }
                }
                P0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    q1(false);
                } else {
                    o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
                    O1();
                }
                this.e1 = false;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.q7) {
                    ((org.telegram.ui.Cells.q7) view).b(0, sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) view).f(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).e(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.i2) {
                    ((org.telegram.ui.Cells.i2) view).c(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.p7) {
                    ((org.telegram.ui.Cells.p7) view).i(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                }
            } else {
                pq0 pq0Var = this.u1;
                ys0[] ys0VarArr = this.w1;
                org.telegram.ui.ActionBar.g2 g2Var = this.y1;
                if (i10 == 0) {
                    ys0 ys0Var = ys0VarArr[i10];
                    int i13 = i7 - ys0Var.m;
                    if (i13 >= 0 && i13 < ys0Var.a.size()) {
                        PhotoViewer.p1().I2(null, g2Var, null);
                        PhotoViewer.p1().a2(ys0VarArr[i10].a, i13, this.m1, this.f1, this.G, pq0Var);
                    }
                } else if (i10 == 2 || i10 == 4) {
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                    }
                } else if (i10 == 5) {
                    PhotoViewer.p1().I2(null, g2Var, null);
                    int indexOf = ys0VarArr[i10].a.indexOf(gjVar);
                    if (indexOf < 0) {
                        PhotoViewer.p1().a2(org.telegram.messenger.f3.i(gjVar), 0, 0L, 0L, 0L, pq0Var);
                    } else {
                        PhotoViewer.p1().a2(ys0VarArr[i10].a, indexOf, this.m1, this.f1, this.G, pq0Var);
                    }
                } else if (i10 == 1) {
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        TLRPC.Document F0 = gjVar.F0();
                        if (i7Var.H) {
                            if (gjVar.x()) {
                                PhotoViewer.p1().I2(null, g2Var, null);
                                int indexOf2 = ys0VarArr[i10].a.indexOf(gjVar);
                                if (indexOf2 < 0) {
                                    PhotoViewer.p1().a2(org.telegram.messenger.f3.i(gjVar), 0, 0L, 0L, 0L, pq0Var);
                                    return;
                                } else {
                                    PhotoViewer.p1().a2(ys0VarArr[i10].a, indexOf2, this.m1, this.f1, this.G, pq0Var);
                                    return;
                                }
                            }
                            org.telegram.messenger.g0.s2(gjVar, g2Var.getParentActivity(), g2Var);
                        } else if (i7Var.G) {
                            g2Var.getFileLoader().f(F0);
                            i7Var.f(true);
                        } else {
                            org.telegram.messenger.gj message = i7Var.getMessage();
                            message.P = true;
                            g2Var.getFileLoader().W(F0, message, 0, 0);
                            i7Var.f(true);
                        }
                    }
                } else if (i10 == 3) {
                    try {
                        TLRPC.WebPage webPage = org.telegram.messenger.gj.n1(gjVar.k) != null ? org.telegram.messenger.gj.n1(gjVar.k).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                                    g2Var.createArticleViewer(false).L(gjVar, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                iu.O0(g2Var, gjVar, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                    gt0 z12 = z1(i10);
                    fi.h6 h6Var = z12 != null ? z12.s : null;
                    if (h6Var == null) {
                        return;
                    }
                    fi.f9 orCreateStoryViewer = g2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int e12 = gjVar.e1();
                    fi.y6 a10 = fi.y6.a(this.n0[0].h);
                    a10.e = new ky(h6Var, 18);
                    if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).s1) {
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
        ds0[] ds0VarArr = this.n0;
        if (!z10) {
            if (Math.abs(ds0VarArr[1].getTranslationX()) < 1.0f) {
                ds0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.k1 ? -1 : 1));
                ds0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.i1;
                if (animatorSet != null) {
                }
                this.j1 = false;
            }
            Z0(getTabProgress());
            return this.j1;
        }
        if (Math.abs(ds0VarArr[0].getTranslationX()) < 1.0f) {
            ds0VarArr[0].setTranslationX(0.0f);
            ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() * (this.k1 ? 1 : -1));
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

    public final boolean T0(org.telegram.messenger.gj gjVar, View view, int i7, boolean z10) {
        jq0 jq0Var;
        final TL_stories.StoryItem storyItem;
        sr0 sr0Var;
        fi.h6 h6Var;
        final int i10 = 0;
        if (!this.F1) {
            org.telegram.ui.ActionBar.g2 g2Var = this.y1;
            if (g2Var.getParentActivity() != null && gjVar != null && ((jq0Var = this.c0) == null || !jq0Var.f)) {
                org.telegram.messenger.g0.v1(g2Var.getParentActivity().getCurrentFocus());
                long j3 = this.m1;
                int i11 = 8;
                final int i12 = 1;
                if (!z10 || (!(J0(getClosestTab()) || getClosestTab() == 8) || this.F1)) {
                    char c10 = org.telegram.messenger.gj.B0(gjVar.k) == j3 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c10].put(gjVar.e1(), gjVar);
                    if (!gjVar.s(null, false)) {
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
                TL_stories.StoryItem storyItem2 = gjVar.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean J0 = J0(getClosestTab());
                    a70 J = a70.J(g2Var, view);
                    a70 K = J.K();
                    K.c(R.drawable.ic_ab_back, org.telegram.messenger.hd.N0(2131753753, null), new org.telegram.ui.hq0(J, 27), false);
                    K.k();
                    a70.f(K, getStoriesController().B(j3, true), hashSet, true, new g(this, storyItem2, J, 25), new bi.m2(this, hashSet, storyItem2, J, 11));
                    J.c(R.drawable.menu_album_add, org.telegram.messenger.hd.N0(2131744562, null), new bi.x5(J, K, 10), false);
                    J.k();
                    J.c(R.drawable.msg_select, org.telegram.messenger.hd.N0(2131744546, null), new lp0(this, gjVar, view, i7, 0), false);
                    final int i14 = 3;
                    if (J0) {
                        int w12 = w1(getClosestTab());
                        String w10 = getStoriesController().w(w12, j3);
                        J.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.N0(2131744547, null), new mp0(this, w12, i10), false);
                        storyItem = storyItem2;
                        J.c(R.drawable.msg_removefolder, org.telegram.messenger.hd.N0(2131744548, null), new lp0(this, w12, storyItem, w10, 1), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (sr0Var = this.f0) != null && (h6Var = sr0Var.s) != null) {
                            if (h6Var.m(storyItem.id)) {
                                J.c(R.drawable.chats_unpin, org.telegram.messenger.hd.N0(2131744544, null), new Runnable() { // from class: org.telegram.ui.Components.kp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        jt0 jt0Var = this;
                                        switch (i15) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), jt0Var.I1);
                                                String N0 = org.telegram.messenger.hd.N0(2131751475, null);
                                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                                t1Var.S = N0;
                                                t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new vp0(jt0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(12));
                                                t1Var.show();
                                                t1Var.i();
                                                break;
                                            case 1:
                                                jt0Var.getClass();
                                                jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                jt0Var.getClass();
                                                jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                jt0.h(jt0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i15 = 2;
                                J.c(R.drawable.chats_pin, org.telegram.messenger.hd.N0(2131744549, null), new Runnable() { // from class: org.telegram.ui.Components.kp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i152 = i15;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        jt0 jt0Var = this;
                                        switch (i152) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), jt0Var.I1);
                                                String N0 = org.telegram.messenger.hd.N0(2131751475, null);
                                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                                t1Var.S = N0;
                                                t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new vp0(jt0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(12));
                                                t1Var.show();
                                                t1Var.i();
                                                break;
                                            case 1:
                                                jt0Var.getClass();
                                                jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                jt0Var.getClass();
                                                jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                jt0.h(jt0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        J.c(R.drawable.msg_archive, org.telegram.messenger.hd.N0(2131744554, null), new Runnable() { // from class: org.telegram.ui.Components.kp0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i152 = i14;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                jt0 jt0Var = this;
                                switch (i152) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), jt0Var.I1);
                                        String N0 = org.telegram.messenger.hd.N0(2131751475, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                        t1Var.S = N0;
                                        t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new vp0(jt0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(12));
                                        t1Var.show();
                                        t1Var.i();
                                        break;
                                    case 1:
                                        jt0Var.getClass();
                                        jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        jt0Var.getClass();
                                        jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        jt0.h(jt0Var, storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    J.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131751586, null), new Runnable() { // from class: org.telegram.ui.Components.kp0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i152 = i10;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            jt0 jt0Var = this;
                            switch (i152) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), jt0Var.I1);
                                    String N0 = org.telegram.messenger.hd.N0(2131751475, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = N0;
                                    t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new vp0(jt0Var, storyItem3));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(12));
                                    t1Var.show();
                                    t1Var.i();
                                    break;
                                case 1:
                                    jt0Var.getClass();
                                    jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    jt0Var.getClass();
                                    jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    jt0.h(jt0Var, storyItem3);
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
        es esVar = this.S0;
        if (esVar != null) {
            esVar.setTranslationY(this.O1);
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
        fq0 fq0Var = this.a0;
        if (fq0Var != null) {
            fq0Var.h();
            fq0Var.j();
        }
        q1(false);
        L1(z10);
        us0 us0Var = this.U;
        if (us0Var != null) {
            us0Var.x.clear();
        }
        return true;
    }

    public final void V0(float f10) {
        ds0[] ds0VarArr = this.n0;
        if (f10 != 1.0f || ds0VarArr[1].getVisibility() == 0) {
            if (this.k1) {
                ds0VarArr[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() - (ds0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ds0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f10);
                ds0VarArr[1].setTranslationX((ds0VarArr[0].getMeasuredWidth() * f10) - ds0VarArr[0].getMeasuredWidth());
            }
            Z0(getTabProgress());
            float k02 = k0(f10);
            this.s0 = k02;
            this.u0.setVisibility((k02 == 0.0f || !I() || A0()) ? 4 : 0);
            org.telegram.ui.ActionBar.q0 q0Var = this.q0;
            if (q0Var == null || I()) {
                this.r0 = l0(f10);
                N1();
            } else {
                setSearchItemVisibility(I0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            I1(false);
            if (f10 == 1.0f) {
                ds0 ds0Var = ds0VarArr[0];
                ds0VarArr[0] = ds0VarArr[1];
                ds0VarArr[1] = ds0Var;
                ds0Var.setVisibility(8);
                if (q0Var != null && this.A0 == 2) {
                    setSearchItemVisibility(I0() ? 8 : 4);
                }
                this.A0 = 0;
                u1();
            }
        }
    }

    public final org.telegram.ui.ActionBar.q0 W(Context context, int i7, int i10, String str) {
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        if (z4Var != null) {
            q0Var = z4Var.q().b(i7, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.m6.y8;
            org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, s02, s0(i12), false, null);
            q0Var2.setIcon(i10);
            q0Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(q0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.Q0.add(q0Var2);
            rh0 iconView = q0Var2.getIconView();
            org.telegram.ui.ActionBar.h6 h6Var = this.I1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.t6.s(q0Var2.getIconView(), i12, h6Var, PorterDuff.Mode.SRC_IN);
            }
            if (q0Var2.getBackground() != null) {
                Drawable background = q0Var2.getBackground();
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                q0Var2.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(q0Var2, background, null, M, h6Var);
            }
            q0Var = q0Var2;
        }
        q0Var.setContentDescription(str);
        q0Var.setOnClickListener(new ci.q(this, i7, 20));
        return q0Var;
    }

    public boolean Y() {
        return this instanceof c30;
    }

    public void Y0() {
        boolean z10 = I0() || A0();
        et0 et0Var = this.h0.x;
        if (et0Var != null) {
            et0Var.b(z10 && getClosestTab() == 9);
        }
        et0 et0Var2 = this.f0.x;
        if (et0Var2 != null) {
            et0Var2.b(z10 && getClosestTab() == 8);
        }
        for (it0 it0Var : this.m2.values()) {
            ht0 ht0Var = it0Var.c;
            if (ht0Var.s != null) {
                ht0Var.x.b(z10 && getClosestTab() == it0Var.a);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.q0;
        if (q0Var != null) {
            cr0 cr0Var = this.M0;
            q0Var.setSearchFieldHint(org.telegram.messenger.hd.N0((cr0Var != null && cr0Var.a() && getSelectedTab() == 11) ? 2131745672 : 2131745640, null));
        }
        S();
        R(true, true);
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        ds0[] ds0VarArr = this.n0;
        motionEvent.offsetLocation(x10 - ds0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - ds0VarArr[0].getY()) - ds0VarArr[0].h.getFastScroll().getY());
        return ds0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void Z0(float f10) {
        Q0();
    }

    public final boolean a0(int i7) {
        ys0[] ys0VarArr = this.x1.n;
        if (ys0VarArr == null) {
            return false;
        }
        ys0[] ys0VarArr2 = this.w1;
        if (i7 == 0) {
            ys0 ys0Var = ys0VarArr2[i7];
            if (!ys0Var.h) {
                int[] iArr = ys0Var.f;
                int[] iArr2 = ys0VarArr[i7].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ys0VarArr2[i7].f;
            int[] iArr4 = ys0VarArr[i7].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ys0VarArr2[i7].a.addAll(ys0VarArr[i7].a);
        ys0VarArr2[i7].c.addAll(ys0VarArr[i7].c);
        for (Map.Entry entry : ys0VarArr[i7].d.entrySet()) {
            ys0VarArr2[i7].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            ys0VarArr2[i7].b[i10] = ys0VarArr[i7].b[i10].clone();
            ys0 ys0Var2 = ys0VarArr2[i7];
            int[] iArr5 = ys0Var2.j;
            ys0 ys0Var3 = ys0VarArr[i7];
            iArr5[i10] = ys0Var3.j[i10];
            ys0Var2.i[i10] = ys0Var3.i[i10];
        }
        ys0VarArr2[i7].e.addAll(ys0VarArr[i7].e);
        return !ys0VarArr[i7].a.isEmpty();
    }

    public final void a1(int i7, long j3, org.telegram.ui.ActionBar.g2 g2Var) {
        new org.telegram.ui.e21(g2Var, j3, this.p1[1], new bi.a5(this, j3, i7, 2)).show();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.nd));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(int i7, is0 is0Var) {
        String str;
        is0 is0Var2;
        is0 is0Var3;
        boolean z10;
        fi.h6 h6Var;
        TLRPC.Chat O0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        fq0 fq0Var;
        fq0 fq0Var2;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.y0 y0Var;
        boolean z11;
        is0 is0Var4;
        org.telegram.ui.ActionBar.y0 y0Var2;
        org.telegram.ui.ActionBar.y0 y0Var3;
        it0 y12;
        boolean z02 = z0(i7);
        org.telegram.ui.ActionBar.g2 g2Var = this.y1;
        int currentAccount = g2Var.getCurrentAccount();
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(currentAccount);
        long j3 = this.m1;
        TLRPC.User c22 = u12.c2(Long.valueOf(j3));
        boolean i12 = getStoriesController().i(j3);
        int i13 = 3;
        int i14 = 4;
        final int i15 = 1;
        if (J0(i7) && i12 && (y12 = y1(i7)) != null) {
            int i16 = y12.b;
            is0Var.i0(R.drawable.menu_add_stories, new mp0(this, i16, i15), org.telegram.messenger.hd.N0(2131744555, null), false, true);
            B(is0Var, g2Var, this.m1, i16);
            is0Var.i0(R.drawable.tabs_reorder, new mp0(this, i16, i13), org.telegram.messenger.hd.N0(2131744547, null), false, true);
            is0Var.i0(R.drawable.msg_delete, new mp0(this, i16, i14), org.telegram.messenger.hd.N0(2131744553, null), true, true);
            is0Var.I();
            C(is0Var);
            return true;
        }
        int i17 = 7;
        final int i18 = 0;
        if (i7 == 14) {
            gq0 gq0Var = this.b0;
            if (gq0Var != null) {
                bi.m6 currentPage = gq0Var.getCurrentPage();
                di.p8 p8Var = currentPage == null ? null : currentPage.e;
                if (p8Var != null) {
                    long j10 = gq0Var.c;
                    int i19 = gq0Var.b;
                    boolean w10 = j10 == org.telegram.messenger.k10.i(i19).e() ? true : j10 >= 0 ? false : org.telegram.messenger.v3.w(5, org.telegram.messenger.np.u1(i19).O0(Long.valueOf(-j10)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (p8Var.c) {
                        i11 = 11;
                        y0Var = null;
                        z11 = false;
                    } else {
                        i11 = 11;
                        y0Var = is0Var.i0(R.drawable.menu_sort_value, new fm0(i17, p8Var, runnableArr), org.telegram.messenger.hd.N0(2131750180, null), false, false);
                        z11 = true;
                    }
                    if (gq0Var.b()) {
                        is0Var.i0(R.drawable.menu_folder_add, new hp0(this, i11), org.telegram.messenger.hd.N0(2131750081, null), false, true);
                        z11 = true;
                    }
                    if (gq0Var.e.h()) {
                        if (!p8Var.i().isEmpty() || currentPage.d) {
                            is0Var.i0(R.drawable.tabs_reorder, new hp0(this, 12), org.telegram.messenger.hd.N0(2131750016, null), false, true);
                            is0Var4 = is0Var;
                        } else {
                            is0Var4 = is0Var;
                        }
                        z11 = true;
                    } else {
                        is0Var4 = is0Var;
                    }
                    if (z11) {
                        is0Var4.I();
                    }
                    org.telegram.ui.ActionBar.y0 K = is0Var4.K(org.telegram.messenger.hd.N0(2131750178, null));
                    org.telegram.ui.ActionBar.y0 K2 = is0Var4.K(org.telegram.messenger.hd.N0(2131750182, null));
                    org.telegram.ui.ActionBar.y0 K3 = is0Var4.K(org.telegram.messenger.hd.N0(2131750177, null));
                    org.telegram.ui.ActionBar.y0 K4 = is0Var4.K(org.telegram.messenger.hd.N0(2131750179, null));
                    if (w10) {
                        is0Var4.I();
                        y0Var2 = is0Var4.K(org.telegram.messenger.hd.N0(2131750184, null));
                        y0Var3 = is0Var4.K(org.telegram.messenger.hd.N0(2131750183, null));
                    } else {
                        y0Var2 = null;
                        y0Var3 = null;
                    }
                    di.p8 p8Var2 = p8Var;
                    bi.l8 l8Var = new bi.l8(y0Var, p8Var2, K, K2, K3, K4, w10, y0Var2, y0Var3);
                    org.telegram.ui.ActionBar.y0 y0Var4 = y0Var2;
                    org.telegram.ui.ActionBar.y0 y0Var5 = y0Var3;
                    runnableArr[0] = l8Var;
                    l8Var.run();
                    bi.s6.j(K, p8Var2, runnableArr[0], 1);
                    bi.s6.j(K2, p8Var2, runnableArr[0], 2);
                    bi.s6.j(K3, p8Var2, runnableArr[0], 4);
                    bi.s6.j(K4, p8Var2, runnableArr[0], 8);
                    if (w10) {
                        bi.s6.j(y0Var4, p8Var2, runnableArr[0], 256);
                        bi.s6.j(y0Var5, p8Var2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i7 == 13 && c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit && (fq0Var = this.a0) != null) {
            int itemsCount = fq0Var.getItemsCount();
            if (itemsCount < g2Var.getMessagesController().W5) {
                fq0Var2 = fq0Var;
                i10 = 5;
                is0Var.i0(R.drawable.msg_addbot, new hp0(this, 4), org.telegram.messenger.hd.N0(2131746521, null), false, true);
            } else {
                fq0Var2 = fq0Var;
                i10 = 5;
            }
            if (itemsCount > 1 && !fq0Var2.d()) {
                is0Var.i0(R.drawable.tabs_reorder, new hp0(this, i10), org.telegram.messenger.hd.N0(2131746494, null), false, true);
            }
            if (itemsCount > 0) {
                is0Var.i0(R.drawable.msg_select, new hp0(this, 6), org.telegram.messenger.hd.N0(fq0Var2.d() ? 2131746492 : 2131746493, null), false, true);
            }
            if (!TextUtils.isEmpty(fq0Var2.getCurrentLang())) {
                is0Var.i0(R.drawable.msg_delete, new hp0(this, i17), org.telegram.messenger.hd.a0(null, null, 2131746495, b31.P0(fq0Var2.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i7 == 11) {
                is0Var.i0(R.drawable.msg_discussion, new hp0(this, 8), org.telegram.messenger.hd.N0(2131745668, null), false, true);
                is0Var.I();
                is0Var.i0(R.drawable.msg_home, new hp0(this, 9), org.telegram.messenger.hd.N0(2131754387, null), false, true);
                is0Var.i0(R.drawable.msg_delete, new hp0(this, 10), org.telegram.messenger.hd.N0(2131751578, null), false, true);
                return true;
            }
            if ((i7 == 8 || J0(i7)) && i12) {
                str = null;
                is0Var2 = is0Var;
                is0Var2.i0(R.drawable.menu_album_add, new hp0(this, 2), org.telegram.messenger.hd.N0(2131744564, null), false, true);
                is0Var2.I();
            } else {
                is0Var2 = is0Var;
                str = null;
            }
            C(is0Var2);
            if (!org.telegram.messenger.n5.C(j3) && (c22 == null || !c22.bot)) {
                is0Var2.i0(R.drawable.msg_calendar2, new mp0(this, i7, 2), org.telegram.messenger.hd.N0(2131752630, str), false, true);
                if (this.g1 == null || I0() || (O0 = org.telegram.messenger.np.u1(currentAccount).O0(Long.valueOf(this.g1.id))) == null || (tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    is0Var3 = is0Var;
                } else {
                    is0Var3 = is0Var;
                    is0Var3.i0(R.drawable.msg_archive, new hp0(this, 3), org.telegram.messenger.hd.N0(2131747616, str), false, true);
                }
                ys0[] ys0VarArr = this.w1;
                if (!z02) {
                    ys0 ys0Var = ys0VarArr[0];
                    if (!ys0Var.w || !ys0Var.v) {
                        boolean[] zArr = ys0Var.i;
                        if (zArr[0] && zArr[1] && ys0Var.l) {
                            z10 = false;
                            if (z10) {
                                is0Var3.I();
                                final org.telegram.ui.ActionBar.y0 K5 = is0Var3.K(org.telegram.messenger.hd.N0(2131748460, str));
                                final org.telegram.ui.ActionBar.y0 K6 = is0Var3.K(org.telegram.messenger.hd.N0(2131748459, str));
                                if (!z02) {
                                    int i20 = ys0VarArr[0].q;
                                    K5.setChecked(i20 == 0 || i20 == 1);
                                    int i21 = ys0VarArr[0].q;
                                    K6.setChecked(i21 == 0 || i21 == 2);
                                    K5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tp0
                                        public final /* synthetic */ jt0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i18) {
                                                case 0:
                                                    final int i22 = 1;
                                                    final jt0 jt0Var = this.b;
                                                    final org.telegram.ui.ActionBar.y0 y0Var6 = K5;
                                                    final org.telegram.ui.ActionBar.y0 y0Var7 = K6;
                                                    jt0Var.C1(y0Var6, y0Var7, new Runnable() { // from class: org.telegram.ui.Components.wp0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    jt0 jt0Var2 = jt0Var;
                                                                    jt0Var2.w1[0].q = (y0Var6.getCheckView().a.q && y0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    jt0Var2.M();
                                                                    break;
                                                                default:
                                                                    jt0 jt0Var3 = jt0Var;
                                                                    jt0Var3.w1[0].q = (y0Var6.getCheckView().a.q && y0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    jt0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i23 = 0;
                                                    final jt0 jt0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.y0 y0Var8 = K6;
                                                    final org.telegram.ui.ActionBar.y0 y0Var9 = K5;
                                                    jt0Var2.C1(y0Var9, y0Var8, new Runnable() { // from class: org.telegram.ui.Components.wp0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i23) {
                                                                case 0:
                                                                    jt0 jt0Var22 = jt0Var2;
                                                                    jt0Var22.w1[0].q = (y0Var8.getCheckView().a.q && y0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    jt0Var22.M();
                                                                    break;
                                                                default:
                                                                    jt0 jt0Var3 = jt0Var2;
                                                                    jt0Var3.w1[0].q = (y0Var8.getCheckView().a.q && y0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    jt0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    K6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tp0
                                        public final /* synthetic */ jt0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i15) {
                                                case 0:
                                                    final int i22 = 1;
                                                    final jt0 jt0Var = this.b;
                                                    final org.telegram.ui.ActionBar.y0 y0Var6 = K6;
                                                    final org.telegram.ui.ActionBar.y0 y0Var7 = K5;
                                                    jt0Var.C1(y0Var6, y0Var7, new Runnable() { // from class: org.telegram.ui.Components.wp0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    jt0 jt0Var22 = jt0Var;
                                                                    jt0Var22.w1[0].q = (y0Var6.getCheckView().a.q && y0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    jt0Var22.M();
                                                                    break;
                                                                default:
                                                                    jt0 jt0Var3 = jt0Var;
                                                                    jt0Var3.w1[0].q = (y0Var6.getCheckView().a.q && y0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    jt0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i23 = 0;
                                                    final jt0 jt0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.y0 y0Var8 = K5;
                                                    final org.telegram.ui.ActionBar.y0 y0Var9 = K6;
                                                    jt0Var2.C1(y0Var9, y0Var8, new Runnable() { // from class: org.telegram.ui.Components.wp0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i23) {
                                                                case 0:
                                                                    jt0 jt0Var22 = jt0Var2;
                                                                    jt0Var22.w1[0].q = (y0Var8.getCheckView().a.q && y0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    jt0Var22.M();
                                                                    break;
                                                                default:
                                                                    jt0 jt0Var3 = jt0Var2;
                                                                    jt0Var3.w1[0].q = (y0Var8.getCheckView().a.q && y0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    jt0Var3.M();
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
                                final gt0 z12 = z1(i7);
                                if (z12 != null && (h6Var = z12.s) != null) {
                                    K5.setChecked(h6Var.n);
                                    K6.setChecked(z12.s.o);
                                }
                                final int i22 = 0;
                                K5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sp0
                                    public final /* synthetic */ jt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i22) {
                                            case 0:
                                                final int i23 = 1;
                                                final gt0 gt0Var = z12;
                                                final org.telegram.ui.ActionBar.y0 y0Var6 = K5;
                                                final org.telegram.ui.ActionBar.y0 y0Var7 = K6;
                                                this.b.C1(y0Var6, y0Var7, new Runnable() { // from class: org.telegram.ui.Components.up0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.h6 h6Var2;
                                                        fi.h6 h6Var3;
                                                        switch (i23) {
                                                            case 0:
                                                                gt0 gt0Var2 = gt0Var;
                                                                if (gt0Var2 != null && (h6Var2 = gt0Var2.s) != null) {
                                                                    boolean z13 = y0Var6.getCheckView().a.q;
                                                                    boolean z14 = y0Var7.getCheckView().a.q;
                                                                    h6Var2.n = z13;
                                                                    h6Var2.o = z14;
                                                                    h6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                gt0 gt0Var3 = gt0Var;
                                                                if (gt0Var3 != null && (h6Var3 = gt0Var3.s) != null) {
                                                                    boolean z15 = y0Var6.getCheckView().a.q;
                                                                    boolean z16 = y0Var7.getCheckView().a.q;
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
                                                final int i24 = 0;
                                                final gt0 gt0Var2 = z12;
                                                final org.telegram.ui.ActionBar.y0 y0Var8 = K6;
                                                final org.telegram.ui.ActionBar.y0 y0Var9 = K5;
                                                this.b.C1(y0Var9, y0Var8, new Runnable() { // from class: org.telegram.ui.Components.up0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.h6 h6Var2;
                                                        fi.h6 h6Var3;
                                                        switch (i24) {
                                                            case 0:
                                                                gt0 gt0Var22 = gt0Var2;
                                                                if (gt0Var22 != null && (h6Var2 = gt0Var22.s) != null) {
                                                                    boolean z13 = y0Var8.getCheckView().a.q;
                                                                    boolean z14 = y0Var9.getCheckView().a.q;
                                                                    h6Var2.n = z13;
                                                                    h6Var2.o = z14;
                                                                    h6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                gt0 gt0Var3 = gt0Var2;
                                                                if (gt0Var3 != null && (h6Var3 = gt0Var3.s) != null) {
                                                                    boolean z15 = y0Var8.getCheckView().a.q;
                                                                    boolean z16 = y0Var9.getCheckView().a.q;
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
                                final int i23 = 1;
                                K6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sp0
                                    public final /* synthetic */ jt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i23) {
                                            case 0:
                                                final int i232 = 1;
                                                final gt0 gt0Var = z12;
                                                final org.telegram.ui.ActionBar.y0 y0Var6 = K6;
                                                final org.telegram.ui.ActionBar.y0 y0Var7 = K5;
                                                this.b.C1(y0Var6, y0Var7, new Runnable() { // from class: org.telegram.ui.Components.up0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.h6 h6Var2;
                                                        fi.h6 h6Var3;
                                                        switch (i232) {
                                                            case 0:
                                                                gt0 gt0Var22 = gt0Var;
                                                                if (gt0Var22 != null && (h6Var2 = gt0Var22.s) != null) {
                                                                    boolean z13 = y0Var6.getCheckView().a.q;
                                                                    boolean z14 = y0Var7.getCheckView().a.q;
                                                                    h6Var2.n = z13;
                                                                    h6Var2.o = z14;
                                                                    h6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                gt0 gt0Var3 = gt0Var;
                                                                if (gt0Var3 != null && (h6Var3 = gt0Var3.s) != null) {
                                                                    boolean z15 = y0Var6.getCheckView().a.q;
                                                                    boolean z16 = y0Var7.getCheckView().a.q;
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
                                                final int i24 = 0;
                                                final gt0 gt0Var2 = z12;
                                                final org.telegram.ui.ActionBar.y0 y0Var8 = K5;
                                                final org.telegram.ui.ActionBar.y0 y0Var9 = K6;
                                                this.b.C1(y0Var9, y0Var8, new Runnable() { // from class: org.telegram.ui.Components.up0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.h6 h6Var2;
                                                        fi.h6 h6Var3;
                                                        switch (i24) {
                                                            case 0:
                                                                gt0 gt0Var22 = gt0Var2;
                                                                if (gt0Var22 != null && (h6Var2 = gt0Var22.s) != null) {
                                                                    boolean z13 = y0Var8.getCheckView().a.q;
                                                                    boolean z14 = y0Var9.getCheckView().a.q;
                                                                    h6Var2.n = z13;
                                                                    h6Var2.o = z14;
                                                                    h6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                gt0 gt0Var3 = gt0Var2;
                                                                if (gt0Var3 != null && (h6Var3 = gt0Var3.s) != null) {
                                                                    boolean z15 = y0Var8.getCheckView().a.q;
                                                                    boolean z16 = y0Var9.getCheckView().a.q;
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

    public final void b1(int i7, long j3, org.telegram.ui.ActionBar.g2 g2Var) {
        c5.s0(g2Var, org.telegram.messenger.hd.N0(2131751586, null), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744552, getStoriesController().w(i7, j3))), org.telegram.messenger.hd.N0(2131751586, null), true, new di.c9(this, j3, i7, 8));
    }

    public final void c0(int i7, ek0 ek0Var, boolean z10) {
        ArrayList arrayList = this.w1[i7].e;
        int L0 = ((v4.c0) ek0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            js0 js0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((js0) arrayList.get(i10)).b) {
                        js0Var = (js0) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (js0Var == null) {
                    js0Var = (js0) i5.c.h(1, arrayList);
                }
            }
            if (js0Var != null) {
                L0(i7, js0Var.d, js0Var.b + 1, z10);
            }
        }
    }

    public final void c1(int i7, long j3, org.telegram.ui.ActionBar.g2 g2Var) {
        String w10 = getStoriesController().w(i7, j3);
        Context context = g2Var.getContext();
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        c4.n nVar = new c4.n(this, j3, i7, 5);
        Pattern pattern = c5.a;
        c5.O(context, g2Var, org.telegram.messenger.hd.N0(2131744539, null), org.telegram.messenger.hd.N0(2131744538, null), org.telegram.messenger.hd.N0(2131744537, null), w10, 12, org.telegram.messenger.hd.N0(2131746082, null), resourceProvider, nVar);
    }

    public final void d0() {
        ds0[] ds0VarArr;
        ds0 ds0Var;
        int i7;
        v4.i0 adapter;
        if (this.r1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ds0VarArr = this.n0;
                if (i11 >= ds0VarArr.length) {
                    ds0Var = null;
                    break;
                }
                ds0Var = ds0VarArr[i11];
                if (ds0Var.F == this.s1) {
                    break;
                } else {
                    i11++;
                }
            }
            if (ds0Var != null) {
                boolean z02 = z0(ds0Var.F);
                float f10 = this.q1;
                ys0[] ys0VarArr = this.w1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.r1 = false;
                        if (this.s1 == 0) {
                            ys0VarArr[0].g(false);
                        }
                        ds0Var.n.setVisibility(8);
                        ds0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f10 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new er0(this, ds0Var, i10));
                    ofFloat.addListener(new org.telegram.ui.ki(this, z10, z02 ? 1 : 0, ds0Var));
                    ofFloat.setInterpolator(nr.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.r1 = false;
                int i12 = this.t1;
                int[] iArr = this.p1;
                iArr[z02 ? 1 : 0] = i12;
                if (!z02) {
                    org.telegram.messenger.cz.B(i12);
                } else if (m0(ds0Var.F) >= 5) {
                    org.telegram.messenger.cz.F(this.t1);
                }
                for (int i13 = 0; i13 < ds0VarArr.length; i13++) {
                    ds0 ds0Var2 = ds0VarArr[i13];
                    if (ds0Var2 != null && ds0Var2.h != null && (((i7 = ds0Var2.F) == 0 || z0(i7)) && (adapter = ds0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            ys0VarArr[0].g(false);
                        }
                        ds0VarArr[i13].n.setVisibility(8);
                        ds0VarArr[i13].x.y1(iArr[z02 ? 1 : 0]);
                        ds0VarArr[i13].h.a0();
                        ds0VarArr[i13].h.invalidate();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.Z3(ds0VarArr[i13].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    j1();
                    return;
                }
                while (i10 < ds0VarArr.length) {
                    ds0 ds0Var3 = ds0VarArr[i10];
                    if (ds0Var3.F == this.s1) {
                        View m10 = ds0Var3.r.m(this.s);
                        if (m10 != null) {
                            this.w = m10.getTop();
                        }
                        ds0 ds0Var4 = ds0VarArr[i10];
                        ds0Var4.x.h1(this.s, (-ds0Var4.h.getPaddingTop()) + this.w);
                    }
                    i10++;
                }
            }
        }
    }

    public final void d1(String str) {
        boolean H3 = org.telegram.messenger.g0.H3(str);
        org.telegram.ui.ActionBar.g2 g2Var = this.y1;
        if (H3) {
            c5.n0(g2Var, str, true, true);
        } else {
            vf.c.t(g2Var.getParentActivity(), str);
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
    @Override // org.telegram.messenger.gs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        nq0 nq0Var;
        org.telegram.messenger.gj gjVar;
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
        nq0 nq0Var2;
        int i15;
        int i16;
        nq0 nq0Var3;
        int i17 = org.telegram.messenger.ls.V;
        v4.i0 i0Var2 = this.R;
        v4.i0 i0Var3 = this.P;
        xs0 xs0Var = this.M;
        v4.i0 i0Var4 = this.O;
        v4.i0 i0Var5 = this.N;
        org.telegram.ui.ActionBar.g2 g2Var = this.y1;
        ss0 ss0Var = this.Q;
        pr0 pr0Var = this.K;
        long j3 = this.m1;
        ds0[] ds0VarArr = this.n0;
        ys0[] ys0VarArr = this.w1;
        if (i7 == i17) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != g2Var.getClassGuid() || intValue2 != ys0VarArr[intValue3].p) {
                if (this.x1 == null || !ys0VarArr[intValue3].a.isEmpty() || ys0VarArr[intValue3].o || !a0(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    i0Var2 = pr0Var;
                } else if (intValue3 == 1) {
                    i0Var2 = i0Var5;
                } else if (intValue3 == 2) {
                    i0Var2 = i0Var4;
                } else if (intValue3 == 3) {
                    i0Var2 = xs0Var;
                } else if (intValue3 == 4) {
                    i0Var2 = i0Var3;
                } else if (intValue3 != 5) {
                    i0Var2 = intValue3 == 15 ? ss0Var : null;
                }
                if (i0Var2 != null) {
                    for (int i18 = 0; i18 < ds0VarArr.length; i18++) {
                        ds0 ds0Var = ds0VarArr[i18];
                        if (ds0Var != null && (nq0Var2 = ds0Var.h) != null && nq0Var2.getAdapter() == i0Var2) {
                            ds0VarArr[i18].h.C0();
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
                ys0VarArr[intValue3].f[i19] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i15 = intValue3;
                i0Var2 = pr0Var;
            } else if (intValue3 == 1) {
                i15 = intValue3;
                i0Var2 = i0Var5;
            } else if (intValue3 == 2) {
                i15 = intValue3;
                i0Var2 = i0Var4;
            } else if (intValue3 == 3) {
                i15 = intValue3;
                i0Var2 = xs0Var;
            } else if (intValue3 == 4) {
                i15 = intValue3;
                i0Var2 = i0Var3;
            } else if (intValue3 == 5) {
                i15 = intValue3;
            } else if (intValue3 == 15) {
                i0Var2 = ss0Var;
                i15 = 8;
            } else {
                i15 = intValue3;
                i0Var2 = null;
            }
            int size2 = ys0VarArr[i15].a.size();
            if (i0Var2 != null) {
                i16 = i0Var2.b();
                if (i0Var2 instanceof zj0) {
                    ((zj0) i0Var2).L();
                }
            } else {
                i16 = 0;
            }
            ys0VarArr[i15].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(size3);
                    if (ys0VarArr[i15].a(gjVar2, i19, r13, C)) {
                        sparseBooleanArray.put(gjVar2.e1(), r13);
                        ys0 ys0Var = ys0VarArr[i15];
                        int i20 = ys0Var.m - r13;
                        ys0Var.m = i20;
                        if (i20 < 0) {
                            ys0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                ys0VarArr[i15].l = ((Boolean) objArr[5]).booleanValue();
                ys0 ys0Var2 = ys0VarArr[i15];
                if (ys0Var2.l) {
                    ys0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i21);
                    if (ys0VarArr[i15].a(gjVar3, i19, r12, C)) {
                        sparseBooleanArray.put(gjVar3.e1(), true);
                        ys0 ys0Var3 = ys0VarArr[i15];
                        int i22 = ys0Var3.n - 1;
                        ys0Var3.n = i22;
                        if (i22 < 0) {
                            ys0Var3.n = r12;
                        }
                    }
                    i21++;
                    r12 = 0;
                }
                ys0 ys0Var4 = ys0VarArr[i15];
                if (ys0Var4.o && ys0Var4.a.size() > 0) {
                    ys0 ys0Var5 = ys0VarArr[i15];
                    ys0Var5.k = ((org.telegram.messenger.gj) ys0Var5.a.get(0)).e1();
                }
                ys0VarArr[i15].i[i19] = ((Boolean) objArr[5]).booleanValue();
                ys0 ys0Var6 = ys0VarArr[i15];
                if (ys0Var6.i[i19]) {
                    int size4 = ys0Var6.b[i19].size();
                    if (i19 == 0) {
                        size4 += ys0VarArr[i15].m;
                    }
                    ys0VarArr[i15].f[i19] = size4;
                }
            }
            if (!booleanValue && i19 == 0) {
                ys0 ys0Var7 = ys0VarArr[i15];
                if (ys0Var7.i[i19] && this.f1 != 0) {
                    ys0Var7.g = true;
                    g2Var.getMediaDataController().Q0(this.f1, 50, ys0VarArr[i15].j[1], 0, i15, this.G, 1, g2Var.getClassGuid(), ys0VarArr[i15].p, null, null);
                }
            }
            int i23 = i15;
            if (i0Var2 != null) {
                cs0 cs0Var = null;
                for (int i24 = 0; i24 < ds0VarArr.length; i24++) {
                    ds0 ds0Var2 = ds0VarArr[i24];
                    if (ds0Var2 != null && (nq0Var3 = ds0Var2.h) != null && nq0Var3.getAdapter() == i0Var2) {
                        cs0 cs0Var2 = ds0VarArr[i24].h;
                        cs0Var2.C0();
                        cs0Var = cs0Var2;
                    }
                }
                int b10 = i0Var2.b();
                if (i0Var2 != pr0Var) {
                    try {
                        i0Var2.f();
                    } catch (Throwable unused) {
                    }
                } else if (pr0Var.b() == i16) {
                    org.telegram.messenger.g0.Z3(cs0Var);
                } else {
                    pr0Var.f();
                }
                if (!ys0VarArr[i23].a.isEmpty() || ys0VarArr[i23].g) {
                    if (cs0Var != null && (i0Var2 == pr0Var || b10 >= i16)) {
                        D(cs0Var, i16, sparseBooleanArray);
                    }
                } else if (cs0Var != null) {
                    D(cs0Var, i16, sparseBooleanArray);
                }
                if (cs0Var != null && !ys0VarArr[i23].o) {
                    if (size2 == 0) {
                        for (int i25 = 0; i25 < 2; i25++) {
                            if (ds0VarArr[i25].F == 0) {
                                ((v4.c0) cs0Var.getLayoutManager()).h1(pr0Var.L(0), 0);
                            }
                        }
                    } else {
                        j1();
                    }
                }
            }
            ys0 ys0Var8 = ys0VarArr[i23];
            if (ys0Var8.o) {
                if (ys0Var8.a.size() == 0) {
                    N0(i23);
                } else {
                    ys0VarArr[i23].o = false;
                }
            }
            this.e1 = true;
            return;
        }
        if (i7 == org.telegram.messenger.ls.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat O0 = org.telegram.messenger.n5.z(j3) ? g2Var.getMessagesController().O0(Long.valueOf(-j3)) : null;
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
                        pr0 pr0Var2 = pr0Var;
                        int i27 = 0;
                        while (i27 < ys0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (ys0VarArr[i27].b(((Integer) arrayList2.get(i14)).intValue(), i13) != null) {
                                i26 = i27;
                                z12 = true;
                            }
                            i27++;
                            arrayList2 = arrayList3;
                        }
                        i14++;
                        pr0Var = pr0Var2;
                    }
                    pr0 pr0Var3 = pr0Var;
                    if (z12) {
                        this.e1 = true;
                        if (pr0Var3 != null) {
                            pr0Var3.f();
                        }
                        if (i0Var5 != null) {
                            i0Var5.f();
                        }
                        if (i0Var4 != null) {
                            i0Var4.f();
                        }
                        if (xs0Var != null) {
                            xs0Var.X(false);
                        }
                        if (i0Var3 != null) {
                            i0Var3.f();
                        }
                        if (ss0Var != null) {
                            ss0Var.f();
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
            pr0 pr0Var32 = pr0Var;
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
                    org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) arrayList4.get(i28);
                    ArrayList arrayList5 = arrayList4;
                    if (org.telegram.messenger.gj.n1(gjVar4.k) == null || gjVar4.m5()) {
                        i12 = i28;
                    } else {
                        int h02 = org.telegram.messenger.si.h0(gjVar4.k);
                        i12 = i28;
                        if (h02 == -1) {
                            return;
                        }
                        ys0 ys0Var9 = ys0VarArr[h02];
                        if (ys0Var9.l) {
                            z11 = z13;
                            if (ys0Var9.a(gjVar4, org.telegram.messenger.gj.B0(gjVar4.k) == j3 ? 0 : 1, true, C2)) {
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
                    while (i29 < ds0VarArr.length) {
                        int i30 = ds0VarArr[i29].F;
                        if (i30 == 0) {
                            i0Var = pr0Var;
                        } else if (i30 == z15) {
                            i0Var = i0Var5;
                        } else if (i30 == 2) {
                            i0Var = i0Var4;
                        } else if (i30 == 3) {
                            i0Var = xs0Var;
                        } else {
                            if (i30 == 4) {
                                i0Var = i0Var3;
                            } else if (i30 == 5) {
                                i0Var = i0Var2;
                            } else {
                                i0Var = i30 == 15 ? ss0Var : null;
                                if (i0Var != null) {
                                    i0Var.b();
                                    pr0Var.f();
                                    i0Var5.f();
                                    i0Var4.f();
                                    xs0Var.X(false);
                                    i0Var3.f();
                                    ss0Var.f();
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
        if (i7 == org.telegram.messenger.ls.K) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l10 = (Long) objArr[3];
            if (l10.longValue() == j3 || l10.longValue() == this.f1) {
                int i31 = l10.longValue() == j3 ? 0 : 1;
                for (ys0 ys0Var10 : ys0VarArr) {
                    ys0Var10.f(i31, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i32 = org.telegram.messenger.ls.h2;
        int i33 = org.telegram.messenger.ls.f2;
        int i34 = org.telegram.messenger.ls.g2;
        if (i7 == i32 || i7 == i34 || i7 == i33) {
            if (i7 != i33 && i7 != i34) {
                if (((org.telegram.messenger.gj) objArr[0]).T != 0) {
                    return;
                }
                for (int i35 = 0; i35 < ds0VarArr.length; i35++) {
                    int childCount = ds0VarArr[i35].h.getChildCount();
                    for (int i36 = 0; i36 < childCount; i36++) {
                        View childAt = ds0VarArr[i35].h.getChildAt(i36);
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
            for (int i37 = 0; i37 < ds0VarArr.length; i37++) {
                ds0 ds0Var3 = ds0VarArr[i37];
                if (ds0Var3 != null && (nq0Var = ds0Var3.h) != null) {
                    int childCount2 = nq0Var.getChildCount();
                    for (int i38 = 0; i38 < childCount2; i38++) {
                        View childAt2 = ds0VarArr[i37].h.getChildAt(i38);
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
        if (i7 == org.telegram.messenger.ls.A5) {
            fi.h6 h6Var = (fi.h6) objArr[0];
            sr0 sr0Var = this.f0;
            if (sr0Var == null || h6Var != sr0Var.s) {
                eq0 eq0Var = this.h0;
                if (eq0Var == null || h6Var != eq0Var.s) {
                    Iterator it = this.m2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        it0 it0Var = (it0) it.next();
                        if (it0Var.c.s == h6Var) {
                            i11 = it0Var.a;
                            break;
                        }
                    }
                } else {
                    i11 = 9;
                }
            } else {
                i11 = 8;
            }
            ds0 g02 = g0(i11);
            if (g02 != null) {
                if (g02.b != (h6Var.g() > 0)) {
                    g02.b = h6Var.g() > 0;
                    F1(g02, true);
                }
            }
            if (g02 != null) {
                org.telegram.messenger.g0.r2(g02.h);
                if (g02.h.getLayoutManager() instanceof v4.c0) {
                    ek0 ek0Var = g02.h;
                    O(g02, ek0Var, (v4.c0) ek0Var.getLayoutManager());
                }
            }
            xr0 xr0Var = this.G1;
            if (xr0Var != null) {
                xr0Var.W();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.y5) {
            for (ds0 ds0Var4 : ds0VarArr) {
                if (ds0Var4 != null && ds0Var4.h != null && z0(ds0Var4.F)) {
                    if (!B0() || ds0Var4.h.getAdapter() == null) {
                        for (int i39 = 0; i39 < ds0Var4.h.getChildCount(); i39++) {
                            View childAt3 = ds0Var4.h.getChildAt(i39);
                            if (childAt3 instanceof org.telegram.ui.Cells.p7) {
                                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt3;
                                n6 n6Var = p7Var.O;
                                if (!p7Var.e0 || (gjVar = p7Var.n) == null || (storyItem = gjVar.l) == null || (storyViews = storyItem.views) == null) {
                                    p7Var.M = false;
                                    n6Var.t("", false, true);
                                } else {
                                    int i40 = storyViews.views_count;
                                    p7Var.M = i40 > 0;
                                    n6Var.t(org.telegram.messenger.g0.o0(i40, 0), true, true);
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.r2(ds0Var4.h);
                    }
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.h3) {
            if (((Long) objArr[0]).longValue() == j3) {
                this.T.E(true);
                P1(true);
                N();
                return;
            }
            return;
        }
        int i41 = org.telegram.messenger.ls.i3;
        us0 us0Var = this.U;
        if (i7 == i41) {
            if (j3 == 0 || j3 == g2Var.getUserConfig().e()) {
                us0Var.F(true);
                P1(true);
                N();
                Y0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.s) {
            us0Var.F(true);
            return;
        }
        if (i7 == org.telegram.messenger.ls.I3) {
            if (((Long) objArr[0]).longValue() == j3) {
                P1(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.Z3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j3 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            vr0 vr0Var = this.d0;
            if (vr0Var != null) {
                TLRPC.ChatFull chatFull = vr0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i42 = 0; i42 < vr0Var.d.participants.participants.size(); i42++) {
                        vr0Var.d.participants.participants.get(i42).setRank(longValue4, str);
                    }
                }
                for (ds0 ds0Var5 : ds0VarArr) {
                    if (ds0Var5.F == 7) {
                        org.telegram.messenger.g0.Z3(ds0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.f1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i43 = 0; i43 < ds0VarArr.length; i43++) {
                if (ds0VarArr[i43].h.getAdapter() == ss0Var) {
                    nq0 nq0Var4 = ds0VarArr[i43].h;
                    ArrayList arrayList6 = ss0Var.n;
                    for (int i44 = 0; i44 < arrayList6.size(); i44++) {
                        org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) arrayList6.get(i44);
                        if (gjVar5 != null && gjVar5.D1() == longValue5) {
                            TLRPC.MessageMedia messageMedia = gjVar5.k.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                org.telegram.messenger.gj.d6(tL_messageMediaPoll, pollResults);
                                ss0Var.g(i44);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fr0 fr0Var = this.L0;
        if (fr0Var != null) {
            canvas.save();
            canvas.translate(fr0Var.getX(), fr0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        br0 br0Var = this.U0;
        if (br0Var != null) {
            int i7 = br0Var.V;
            if ((i7 == 3 || i7 == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(br0Var.getX(), br0Var.getY());
                br0Var.setDrawOverlay(true);
                br0Var.draw(canvas);
                br0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        if (this.c2 && (view instanceof ds0) && this.g2 < this.e2) {
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
        ds0[] ds0VarArr = this.n0;
        float top = ds0VarArr[0].getTop();
        jq0 jq0Var = this.c0;
        if (jq0Var != null && ((i7 = ds0VarArr[0].F) == 8 || J0(i7))) {
            top -= jq0Var.getVisualHeight();
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
        fq0 fq0Var;
        if (!B0()) {
            return org.telegram.messenger.hd.N0(2131753002, null);
        }
        if (z10 && (fq0Var = this.a0) != null) {
            return fq0Var.getBotPreviewsSubtitle();
        }
        sr0 sr0Var = this.f0;
        if (sr0Var == null || sr0Var.s == null) {
            i7 = 0;
            i10 = 0;
        } else {
            i7 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < sr0Var.s.i.size(); i11++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sr0Var.s.i.get(i11);
                TL_stories.StoryItem storyItem = gjVar.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.gj.K4(messageMedia.document)) {
                        i10++;
                    } else if (gjVar.l.media.photo != null) {
                        i7++;
                    }
                }
            }
        }
        if (i7 == 0 && i10 == 0) {
            return org.telegram.messenger.hd.N0(2131753002, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i7 > 0) {
            sb2.append(org.telegram.messenger.hd.G(i7, "Images", new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.hd.G(i10, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final void f1(ArrayList arrayList, boolean z10) {
        sr0 sr0Var = this.f0;
        if (sr0Var == null || sr0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.y1;
        if (z10 && arrayList.size() > g2Var.getMessagesController().Q5) {
            org.telegram.messenger.o10.u(org.telegram.messenger.hd.G(g2Var.getMessagesController().Q5, "StoriesPinLimit", new Object[0]), lc.b0(g2Var), R.raw.chats_infotip, 36);
            return;
        }
        fi.h6 h6Var = sr0Var.s;
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
        boolean z12 = arrayList3.size() > org.telegram.messenger.np.u1(i7).Q5;
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
                tL_togglePinnedToTop.peer = org.telegram.messenger.np.u1(i7).l1(h6Var.d);
                ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new fi.l5(2));
            }
            z11 = z12;
        }
        if (z11) {
            org.telegram.messenger.o10.u(org.telegram.messenger.hd.G(g2Var.getMessagesController().Q5, "StoriesPinLimit", new Object[0]), lc.b0(g2Var), R.raw.chats_infotip, 36);
        } else if (z10) {
            lc.b0(g2Var).I(R.raw.ic_pin, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            org.telegram.messenger.o10.u(org.telegram.messenger.hd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), lc.b0(g2Var), R.raw.ic_unpin, 36);
        }
    }

    public final ds0 g0(int i7) {
        int i10 = 0;
        while (true) {
            ds0[] ds0VarArr = this.n0;
            if (i10 >= ds0VarArr.length) {
                return null;
            }
            ds0 ds0Var = ds0VarArr[i10];
            if (ds0Var != null && ds0Var.F == i7) {
                return ds0Var;
            }
            i10++;
        }
    }

    public final boolean g1(MotionEvent motionEvent, boolean z10) {
        ds0 ds0Var;
        fq0 fq0Var;
        int closestTab = getClosestTab();
        fr0 fr0Var = this.L0;
        int i7 = -1;
        int i10 = fr0Var.P.get(fr0Var.n + (z10 ? 1 : -1), -1);
        jq0 jq0Var = this.c0;
        if (jq0Var != null) {
            if (J0(closestTab) || closestTab == 8) {
                i71 i71Var = jq0Var.b;
                i7 = i71Var.c0.get(i71Var.G + (z10 ? 1 : -1), -1);
            } else if (J0(i10) || i10 == 8) {
                i7 = jq0Var.getCurrentAlbumId();
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
                ds0[] ds0VarArr = this.n0;
                ds0 ds0Var2 = ds0VarArr[0];
                if (ds0Var2 != null && ds0Var2.F == 13 && (fq0Var = this.a0) != null) {
                    bi.p5 p5Var = fq0Var.n;
                    if (!z10) {
                    }
                }
                ds0 ds0Var3 = ds0VarArr[0];
                gq0 gq0Var = this.b0;
                if (ds0Var3 != null && ds0Var3.F == 14 && gq0Var != null) {
                    bi.p5 p5Var2 = gq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.F1 || (ds0Var = ds0VarArr[0]) == null || ds0Var.F != 13) && ((gq0Var == null || !gq0Var.g()) && (jq0Var == null || !jq0Var.f))) {
                    I1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    fr0Var.setEnabled(false);
                    ds0 ds0Var4 = ds0VarArr[1];
                    ds0Var4.F = i10;
                    ds0Var4.setVisibility(0);
                    this.k1 = z10;
                    B1(true);
                    if (z10) {
                        ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth());
                    } else {
                        ds0VarArr[1].setTranslationX(-ds0VarArr[0].getMeasuredWidth());
                    }
                    Z0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public SparseArray<org.telegram.messenger.gj> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        ds0 ds0Var;
        ds0 ds0Var2;
        fi.h6 h6Var;
        fi.h6 h6Var2;
        float f10 = 1.0f;
        ds0[] ds0VarArr = this.n0;
        if (ds0VarArr == null || (ds0Var = ds0VarArr[0]) == null || (ds0Var2 = ds0VarArr[1]) == null || ds0Var.w == null || ds0Var2.w == null) {
            return 1.0f;
        }
        int i7 = ds0Var.F;
        int i10 = ds0Var2.F;
        boolean z10 = J0(i7) || i7 == 8;
        boolean z11 = J0(i10) || i10 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - ds0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - ds0VarArr[1].w.getVisibilityFactor();
        gt0 z12 = z1(ds0VarArr[0].F);
        if (i7 == 8 || (z12 != null && (h6Var2 = z12.s) != null && h6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        gt0 z13 = z1(i10);
        if (i10 != 8 && (z13 == null || (h6Var = z13.s) == null || h6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(ds0VarArr[0].getTranslationX() / ds0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        ds0[] ds0VarArr = this.n0;
        ds0 ds0Var = ds0VarArr[1];
        if (ds0Var != null && ds0Var.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return ds0VarArr[1].F;
            }
            if (Math.abs(ds0VarArr[1].getTranslationX()) < ds0VarArr[1].getMeasuredWidth() / 2.0f) {
                return ds0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public ek0 getCurrentListView() {
        qr0 qr0Var;
        ds0 ds0Var = this.n0[0];
        int i7 = ds0Var.F;
        return i7 == 13 ? this.a0.getCurrentListView() : i7 == 14 ? this.b0.getCurrentListView() : (i7 != 12 || (qr0Var = this.W) == null) ? ds0Var.h : qr0Var.a.A0;
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

    public rh0 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        jq0 jq0Var = this.c0;
        if (jq0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = jq0Var.getCurrentAlbumId();
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
            ds0[] ds0VarArr = this.n0;
            if (i7 >= ds0VarArr.length) {
                return f10;
            }
            ds0 ds0Var = ds0VarArr[i7];
            if (ds0Var != null) {
                f10 = ((1.0f - Math.abs(ds0Var.getTranslationX() / getWidth())) * ds0Var.F) + f10;
            }
            i7++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.z6));
        int i7 = org.telegram.ui.ActionBar.m6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.x0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.w0;
        if (q0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        Drawable[] drawableArr = {this.G0};
        int i10 = org.telegram.ui.ActionBar.m6.y8;
        ImageView imageView = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.xi));
        fr0 fr0Var = this.L0;
        arrayList.add(new org.telegram.ui.ActionBar.v6(fr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(fr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.vi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(fr0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.yi));
        br0 br0Var = this.U0;
        if (br0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(br0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.v6(br0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.v6(br0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.v6(br0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A7));
        }
        final int i11 = 0;
        while (true) {
            ds0[] ds0VarArr = this.n0;
            if (i11 >= ds0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.u6 u6Var = new org.telegram.ui.ActionBar.u6() { // from class: org.telegram.ui.Components.yp0
                @Override // org.telegram.ui.ActionBar.u6
                public final void b() {
                    ds0[] ds0VarArr2 = jt0.this.n0;
                    int i12 = i11;
                    nq0 nq0Var = ds0VarArr2[i12].h;
                    if (nq0Var != null) {
                        int childCount = nq0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = ds0VarArr2[i12].h.getChildAt(i13);
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

                @Override // org.telegram.ui.ActionBar.u6
                public final /* synthetic */ void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
            int i12 = org.telegram.ui.ActionBar.m6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.n6));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.U7));
            int i13 = org.telegram.ui.ActionBar.m6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
            int i14 = org.telegram.ui.ActionBar.m6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.qj));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.q7.class}, (Paint) null, (Drawable[]) null, u6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.q7.class}, (Paint) null, (Drawable[]) null, u6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ci));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.i2.class}, (Paint) null, (Drawable[]) null, u6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.i2.class}, (Paint) null, (Drawable[]) null, u6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.y6));
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
        if (i0Var instanceof dt0) {
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
        ss0 ss0Var = this.Q;
        if (i0Var == ss0Var) {
            ss0Var.r = null;
        }
    }

    public final int j0(int i7) {
        return n0(i7) + org.telegram.messenger.g0.L(54.0f) + this.d2 + this.e2 + this.p2 + (i7 == 9 ? org.telegram.messenger.g0.L(64.0f) : 0);
    }

    public final void j1() {
        int i7;
        int i10 = 0;
        while (true) {
            ds0[] ds0VarArr = this.n0;
            if (i10 >= ds0VarArr.length) {
                return;
            }
            nq0 nq0Var = ds0VarArr[i10].h;
            if (nq0Var != null) {
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < nq0Var.getChildCount(); i13++) {
                    View childAt = nq0Var.getChildAt(i13);
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
                    int i14 = ds0VarArr[i10].F;
                    int i15 = -1;
                    if (z0(i14)) {
                        gt0 z12 = z1(i14);
                        if (z12 != null && z12.s != null) {
                            int i16 = 0;
                            while (true) {
                                if (i16 >= z12.s.i.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.gj) z12.s.i.get(i16)).e1()) {
                                    i15 = i16;
                                    break;
                                }
                                i16++;
                            }
                        }
                        i7 = i15;
                    } else if (i14 >= 0) {
                        ys0[] ys0VarArr = this.w1;
                        if (i14 < ys0VarArr.length) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= ys0VarArr[i14].a.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.gj) ys0VarArr[i14].a.get(i17)).e1()) {
                                    i15 = i17;
                                    break;
                                }
                                i17++;
                            }
                            i7 = ys0VarArr[i14].m + i15;
                        }
                    }
                    if (i15 >= 0) {
                        ((v4.c0) nq0Var.getLayoutManager()).h1(i7, (-ds0VarArr[i10].h.getPaddingTop()) + i12);
                        if (this.r1) {
                            ds0 ds0Var = ds0VarArr[i10];
                            ds0Var.r.h1(i7, (-ds0Var.h.getPaddingTop()) + i12);
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
        ds0[] ds0VarArr = this.n0;
        ds0 ds0Var = ds0VarArr[1];
        if (ds0Var != null && v0(ds0Var.F)) {
            f11 = 0.0f + f10;
        }
        ds0 ds0Var2 = ds0VarArr[0];
        return (ds0Var2 == null || !v0(ds0Var2.F)) ? f11 : (1.0f - f10) + f11;
    }

    public final void k1(int i7) {
        fr0 fr0Var;
        if (this.P1 || (fr0Var = this.L0) == null) {
            return;
        }
        fr0Var.g(null, i7, fr0Var.Q.get(i7));
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        ds0[] ds0VarArr = this.n0;
        ds0 ds0Var = ds0VarArr[1];
        if (ds0Var != null && F0(ds0Var.F) && ds0VarArr[1].F != 11) {
            f11 = 0.0f + f10;
        }
        ds0 ds0Var2 = ds0VarArr[0];
        return (ds0Var2 == null || !F0(ds0Var2.F) || ds0VarArr[0].F == 11) ? f11 : (1.0f - f10) + f11;
    }

    public final void l1(float f10, int i7) {
        fr0 fr0Var = this.L0;
        if (fr0Var != null) {
            fr0Var.i(f10, J0(i7) ? 8 : i7);
        }
        jq0 jq0Var = this.c0;
        if (jq0Var != null) {
            i71 i71Var = jq0Var.b;
            if (J0(i7)) {
                i71Var.g(f10, w1(i7));
            } else if (i7 == 8) {
                i71Var.g(f10, 0);
            }
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean m() {
        return false;
    }

    public final int m0(int i7) {
        gt0 z12;
        fi.h6 h6Var;
        if (!z0(i7) || (z12 = z1(i7)) == null || (h6Var = z12.s) == null) {
            return 0;
        }
        return h6Var.g();
    }

    public final void m1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.n0;
            if (i7 >= ds0VarArr.length) {
                if (this.G == 0) {
                    vr0 vr0Var = this.d0;
                    vr0Var.d = chatFull;
                    vr0Var.e = arrayList;
                }
                P1(true);
                for (int i10 = 0; i10 < ds0VarArr.length; i10++) {
                    ds0 ds0Var = ds0VarArr[i10];
                    if (ds0Var.F == 7 && ds0Var.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(ds0VarArr[i10].h);
                    }
                }
                return;
            }
            ds0 ds0Var2 = ds0VarArr[i7];
            if (ds0Var2.F == 7 && ds0Var2.h.getAdapter() != null && ds0VarArr[i7].h.getAdapter().b() != 0 && this.y1.getMessagesController().R1().j.size() > 0) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final int n0(int i7) {
        jq0 jq0Var = this.c0;
        return (int) ((jq0Var == null || !(J0(i7) || i7 == 8)) ? 0.0f : jq0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f));
    }

    public final void n1(int i7, int i10, int i11, int i12) {
        this.c2 = true;
        this.d2 = i7;
        this.e2 = i10;
        this.f2 = i11;
        this.b2 = i12;
        G();
        gq0 gq0Var = this.b0;
        if (gq0Var != null) {
            if (gq0Var.M != i10 || gq0Var.N != i11) {
                gq0Var.M = i10;
                gq0Var.N = i11;
                gq0Var.setClipChildren(i10 == 0 && i11 == 0);
                gq0Var.h.setClipChildren(i10 == 0 && i11 == 0);
                gq0Var.n();
            }
            H1();
        }
        for (ds0 ds0Var : this.n0) {
            if (ds0Var != null) {
                ds0Var.setClipChildren(false);
                J1(ds0Var);
                setPageOverscan(ds0Var.h);
                setPageOverscan(ds0Var.n);
                int paddingTop = ds0Var.h.getPaddingTop();
                nq0 nq0Var = ds0Var.h;
                int paddingLeft = nq0Var.getPaddingLeft();
                nq0 nq0Var2 = ds0Var.h;
                int j02 = j0(ds0Var.F);
                nq0Var2.h3 = j02;
                int paddingRight = ds0Var.h.getPaddingRight();
                nq0 nq0Var3 = ds0Var.h;
                int i02 = i0(I0());
                nq0Var3.i3 = i02;
                nq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - ds0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(ds0Var.h, new qp0(ds0Var, paddingTop2, 1));
                }
                ds0Var.w.setPadding(0, i7, 0, i12);
                qr0 qr0Var = this.W;
                if (qr0Var != null && qr0Var.getParent() == ds0Var) {
                    p1(org.telegram.messenger.g0.L(56.0f) + i7, qr0Var);
                }
                fq0 fq0Var = this.a0;
                if (fq0Var != null && fq0Var.getParent() == ds0Var) {
                    p1(i7, fq0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void o1(int i7, boolean z10) {
        this.D0.a(i7, z10);
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        if (z4Var != null) {
            z4Var.E(i7, z10);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.n0;
            if (i7 >= ds0VarArr.length) {
                return;
            }
            nq0 nq0Var = ds0VarArr[i7].h;
            if (nq0Var != null) {
                nq0Var.getViewTreeObserver().addOnPreDrawListener(new lr0(this, i7, 0));
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
        xr0 xr0Var = this.G1;
        int height = xr0Var.f() != null ? xr0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof ds0) {
                i11 = i7;
                measureChildWithMargins(childAt, i11, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                nq0 nq0Var = ((ds0) childAt).h;
                nq0Var.setPadding(0, nq0Var.f3, 0, nq0Var.g3);
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
            org.telegram.ui.ActionBar.g2 g2Var = this.y1;
            if (g2Var.getParentLayout() != null && !((ActionBarLayout) g2Var.getParentLayout()).i() && !T() && !this.a) {
                if (motionEvent != null) {
                    if (this.E1 == null) {
                        this.E1 = VelocityTracker.obtain();
                    }
                    this.E1.addMovement(motionEvent);
                    hi.l3 l3Var = this.H1;
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
                    ds0[] ds0VarArr = this.n0;
                    if (z11 && (((z10 = this.k1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!g1(motionEvent, x10 < 0)) {
                            this.B1 = true;
                            this.A1 = false;
                            ds0VarArr[0].setTranslationX(0.0f);
                            ds0VarArr[1].setTranslationX(this.k1 ? ds0VarArr[0].getMeasuredWidth() : -ds0VarArr[0].getMeasuredWidth());
                            l1(0.0f, ds0VarArr[1].F);
                            Z0(getTabProgress());
                        }
                    }
                    if (!this.B1 || this.A1) {
                        if (this.A1) {
                            ds0VarArr[0].setTranslationX(x10);
                            if (this.k1) {
                                ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                ds0VarArr[1].setTranslationX(x10 - ds0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / ds0VarArr[0].getMeasuredWidth();
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
                            l1(abs2, ds0VarArr[1].F);
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
            ds0[] ds0VarArr = this.n0;
            if (i10 >= ds0VarArr.length) {
                break;
            }
            ds0 ds0Var = ds0VarArr[i10];
            if (ds0Var != null) {
                int i12 = ds0Var.F;
                if ((z10 && i7 == 8 && J0(i12)) || i12 == i7) {
                    i11++;
                    width = ds0VarArr[i10].getTranslationX();
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
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        if (z4Var != null) {
            if (z10) {
                O1();
                z4Var.J();
            } else {
                z4Var.w();
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
            ds0[] ds0VarArr = this.n0;
            if (i10 >= ds0VarArr.length) {
                return f10;
            }
            ds0 ds0Var = ds0VarArr[i10];
            if (ds0Var != null) {
                int i11 = ds0Var.F;
                if ((z10 && i7 == 8 && J0(i11)) || i11 == i7) {
                    f10 = (1.0f - Math.abs(ds0VarArr[i10].getTranslationX() / getWidth())) + f10;
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
        ds0 g02;
        if (z10 && getY() != 0.0f && this.F == 1) {
            return;
        }
        if (z10 && z0(i7) && m0(i7) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.m1);
        bundle.putLong("topic_id", this.G);
        ys0[] ys0VarArr = this.w1;
        if (z10 && (g02 = g0(0)) != null) {
            ArrayList arrayList = ys0VarArr[0].e;
            int L0 = g02.x.L0();
            if (L0 >= 0) {
                js0 js0Var = null;
                if (arrayList != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((js0) arrayList.get(i11)).b) {
                            js0Var = (js0) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (js0Var == null) {
                        js0Var = (js0) i5.c.h(1, arrayList);
                    }
                }
                if (js0Var != null) {
                    i10 = js0Var.c;
                    if (i7 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i7 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.i8 i8Var = new org.telegram.ui.i8(ys0VarArr[0].q, i10, bundle);
                    i8Var.N = new jn(this, 5);
                    this.y1.presentFragment(i8Var);
                }
            }
        }
        i10 = 0;
        if (i7 != 9) {
        }
        org.telegram.ui.i8 i8Var2 = new org.telegram.ui.i8(ys0VarArr[0].q, i10, bundle);
        i8Var2.N = new jn(this, 5);
        this.y1.presentFragment(i8Var2);
    }

    public final int s0(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.I1;
        return h6Var != null ? h6Var.k(i7) : org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final void s1(int i7) {
        int w12 = w1(getClosestTab());
        jq0 jq0Var = this.c0;
        if (w12 != i7) {
            if (jq0Var != null) {
                jq0Var.b.e(i7, jq0Var.d.i(i7));
                return;
            }
            return;
        }
        jq0Var.setReorderingAlbums(true);
        it0 x12 = x1(i7);
        ds0 g02 = g0(x12.a);
        if (g02 == null) {
            return;
        }
        nq0 nq0Var = g02.h;
        for (int i10 = 0; i10 < nq0Var.getChildCount(); i10++) {
            View childAt = nq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p7) {
                ((org.telegram.ui.Cells.p7) childAt).l(true, true);
            }
        }
        ht0 ht0Var = x12.c;
        if (ht0Var != null && !ht0Var.y) {
            ht0Var.y = true;
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
                    ys0[] ys0VarArr = this.w1;
                    if (i7 >= ys0VarArr.length) {
                        break;
                    }
                    if (ys0VarArr[i7].b[1].size() == 0) {
                        ys0 ys0Var = ys0VarArr[i7];
                        ys0Var.j[1] = this.g1.migrated_from_max_id;
                        ys0Var.i[1] = false;
                    }
                    i7++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        fr0 fr0Var = this.L0;
        if (fr0Var != null) {
            fr0Var.setInitialTabId(A0() ? 9 : 8);
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

    public void setForwardRestrictedHint(hi.l3 l3Var) {
        this.H1 = l3Var;
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
            ds0[] ds0VarArr = this.n0;
            if (i13 >= ds0VarArr.length) {
                break;
            }
            ds0VarArr[i13].setTranslationY(this.O1);
            i13++;
        }
        if (this.S0 != null) {
            U();
        } else {
            br0 br0Var = this.U0;
            if (br0Var != null) {
                br0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.R0 = i10;
        org.telegram.ui.Cells.v0 v0Var = this.N0;
        v0Var.setTranslationY((v0Var.getTag() == null ? -org.telegram.messenger.g0.L(48.0f) : 0) + this.R0);
    }

    public void setPagesGlassEngine(ri.q qVar) {
        this.h2 = qVar;
        gq0 gq0Var = this.b0;
        if (gq0Var != null) {
            gq0Var.setGlassEngine(qVar);
        }
        for (ds0 ds0Var : this.n0) {
            if (ds0Var != null) {
                ds0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(ds0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i7) {
        if (this.b2 != i7) {
            this.b2 = i7;
            ds0[] ds0VarArr = this.n0;
            if (ds0VarArr != null) {
                for (ds0 ds0Var : ds0VarArr) {
                    if (ds0Var != null) {
                        nq0 nq0Var = ds0Var.h;
                        int paddingLeft = nq0Var.getPaddingLeft();
                        nq0 nq0Var2 = ds0Var.h;
                        int i10 = nq0Var2.f3;
                        int paddingRight = nq0Var2.getPaddingRight();
                        nq0 nq0Var3 = ds0Var.h;
                        int i02 = i0(I0());
                        nq0Var3.i3 = i02;
                        nq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
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
            ds0[] ds0VarArr = this.n0;
            if (i7 >= ds0VarArr.length) {
                return;
            }
            F1(ds0VarArr[i7], true);
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
            ds0[] ds0VarArr = this.n0;
            if (i10 >= ds0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i7, org.telegram.messenger.g0.L(ds0VarArr[i10].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            ds0VarArr[i10].w.setTranslationY(f10);
            ds0VarArr[i10].s.setTranslationY(-f10);
            i10++;
        }
        fq0 fq0Var = this.a0;
        if (fq0Var != null) {
            fq0Var.setVisibleHeight(i7);
        }
        gq0 gq0Var = this.b0;
        if (gq0Var != null) {
            gq0Var.setVisibleHeight(i7);
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
        ds0[] ds0VarArr;
        ds0 ds0Var;
        if (this.r1) {
            return;
        }
        int i7 = 0;
        while (true) {
            ds0VarArr = this.n0;
            if (i7 >= ds0VarArr.length) {
                ds0Var = null;
                break;
            }
            int i10 = ds0VarArr[i7].F;
            if (i10 == 0 || z0(i10)) {
                break;
            } else {
                i7++;
            }
        }
        if (ds0Var != null) {
            int i11 = ds0Var.F;
            this.s1 = i11;
            boolean z02 = z0(i11);
            int[] iArr = this.p1;
            int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], z10);
            this.t1 = h02;
            if (h02 != iArr[z02 ? 1 : 0]) {
                if (this.n1 && z0(this.s1)) {
                    return;
                }
                ds0Var.n.setVisibility(0);
                if (z0(this.s1)) {
                    ds0Var.n.setAdapter(A1(this.s1));
                } else {
                    ds0Var.n.setAdapter(this.L);
                }
                cs0 cs0Var = ds0Var.n;
                cs0Var.setPadding(cs0Var.getPaddingLeft(), j0(this.s1), ds0Var.n.getPaddingRight(), i0(I0()));
                ds0Var.r.y1(h02);
                ds0Var.n.a0();
                ds0Var.r.O = new dr0(this, ds0Var, 0);
                org.telegram.messenger.g0.Z3(ds0Var.h);
                this.r1 = true;
                if (this.s1 == 0) {
                    this.w1[0].g(true);
                }
                this.q1 = 0.0f;
                if (this.s < 0) {
                    j1();
                    return;
                }
                for (ds0 ds0Var2 : ds0VarArr) {
                    if (ds0Var2.F == this.s1) {
                        ds0Var2.r.h1(this.s, this.w - ds0Var2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final void u(org.telegram.ui.Cells.u2 u2Var) {
        org.telegram.ui.ActionBar.g2 g2Var = this.y1;
        if (g2Var != null && g2Var.getMessagesController().R1().K(u2Var.getDialogId())) {
            g2Var.getOrCreateStoryViewer().getClass();
            fi.f9 orCreateStoryViewer = g2Var.getOrCreateStoryViewer();
            Context context = g2Var.getContext();
            long dialogId = u2Var.getDialogId();
            fi.y6 a10 = fi.y6.a((ek0) u2Var.getParent());
            a10.s += ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).s1) ? org.telegram.messenger.g0.L(68.0f) : 0;
            orCreateStoryViewer.J(context, dialogId, a10);
        }
    }

    public final boolean u0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.gj gjVar;
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
                if (num.intValue() > 0 && (gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].get(num.intValue())) != null && (message = gjVar.k) != null && message.noforwards) {
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
            ds0[] ds0VarArr = this.n0;
            if (i7 >= ds0VarArr.length) {
                return;
            }
            int childCount = ds0VarArr[i7].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ds0VarArr[i7].h.getChildAt(i10);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.J1.a(s0(org.telegram.ui.ActionBar.m6.d6));
            org.telegram.ui.ActionBar.x1 x1Var = this.G0;
            if (x1Var != null) {
                x1Var.a(s0(org.telegram.ui.ActionBar.m6.y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.m6.y8));
            }
            D1();
            invalidate();
            for (ds0 ds0Var : this.n0) {
                if (ds0Var != null && ds0Var.M) {
                    ds0Var.invalidate();
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
            ds0[] ds0VarArr = this.n0;
            float x10 = ds0VarArr[0].getX();
            this.i1 = new AnimatorSet();
            this.l1 = Math.abs(x10) < ((float) ds0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h60(this, 20));
            boolean z10 = this.l1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.k1) {
                    this.i1.playTogether(ObjectAnimator.ofFloat(ds0VarArr[0], (Property<ds0, Float>) property, 0.0f), ObjectAnimator.ofFloat(ds0VarArr[1], (Property<ds0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.i1.playTogether(ObjectAnimator.ofFloat(ds0VarArr[0], (Property<ds0, Float>) property, 0.0f), ObjectAnimator.ofFloat(ds0VarArr[1], (Property<ds0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = ds0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.k1) {
                    this.i1.playTogether(ObjectAnimator.ofFloat(ds0VarArr[0], (Property<ds0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(ds0VarArr[1], (Property<ds0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.i1.playTogether(ObjectAnimator.ofFloat(ds0VarArr[0], (Property<ds0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(ds0VarArr[1], (Property<ds0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.i1.setInterpolator(u2);
            int measuredWidth2 = getMeasuredWidth();
            float f12 = measuredWidth2 / 2;
            float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
            this.i1.setDuration(Math.max(org.telegram.messenger.ls.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.i1.addListener(new ir0(this, i7));
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
        this.O0.setInterpolator(nr.g);
        this.O0.addListener(new ir0(this, 0));
        this.O0.start();
    }

    public final int w1(int i7) {
        it0 y12 = y1(i7);
        if (y12 == null) {
            return -1;
        }
        return y12.b;
    }

    public boolean x0() {
        return false;
    }

    public final it0 x1(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.m2;
        it0 it0Var = (it0) hashMap.get(valueOf);
        if (it0Var != null) {
            return it0Var;
        }
        it0 it0Var2 = new it0(this, getContext(), i7);
        hashMap.put(Integer.valueOf(i7), it0Var2);
        this.n2.put(Integer.valueOf(it0Var2.a), Integer.valueOf(i7));
        return it0Var2;
    }

    public boolean y0() {
        return !(this instanceof c30);
    }

    public final it0 y1(int i7) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i7));
        if (num == null) {
            return null;
        }
        return (it0) this.m2.get(num);
    }

    public final void z(View view) {
        ds0[] ds0VarArr = this.n0;
        addView(view, Math.max(indexOfChild(ds0VarArr[0]), indexOfChild(ds0VarArr[1])) + 1, c8.ma.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final gt0 z1(int i7) {
        it0 y12;
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
