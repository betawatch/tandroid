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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class ys0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.is, org.telegram.ui.Cells.p2, oj0 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final tp0 u2 = new tp0(0);
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
    public final pz E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final int F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final org.telegram.ui.ActionBar.x1 G0;
    public final nr0 G1;
    public final org.telegram.ui.ActionBar.k H;
    public final ArrayList H0;
    public hi.l3 H1;
    public final org.telegram.ui.ActionBar.w4 I;
    public final ArrayList I0;
    public final org.telegram.ui.ActionBar.e6 I1;
    public final org.telegram.ui.ActionBar.d5 J;
    public final ArrayList J0;
    public final ui.c J1;
    public final fr0 K;
    public final ArrayList K0;
    public final xi.e K1;
    public final ss0 L;
    public final vq0 L0;
    public boolean L1;
    public final ms0 M;
    public final sq0 M0;
    public final h2.f M1;
    public final ls0 N;
    public final org.telegram.ui.Cells.t0 N0;
    public org.telegram.ui.f0 N1;
    public final ls0 O;
    public AnimatorSet O0;
    public int O1;
    public final ls0 P;
    public final wo0 P0;
    public boolean P1;
    public final hs0 Q;
    public final ArrayList Q0;
    public int Q1;
    public final or0 R;
    public float R0;
    public AnimatorSet R1;
    public final mr0 S;
    public final vr S0;
    public final SparseArray S1;
    public final kr0 T;
    public final FrameLayout T0;
    public long T1;
    public final js0 U;
    public final rq0 U0;
    public boolean U1;
    public final ks0 V;
    public final int V0;
    public int V1;
    public final gr0 W;
    public final Paint W0;
    public final cr0 W1;
    public boolean X0;
    public fi.k6 X1;
    public boolean Y0;
    public float Y1;
    public ch.p0 Z0;
    public boolean Z1;
    public boolean a;
    public final vp0 a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final wp0 b0;
    public int b1;
    public int b2;
    public boolean c;
    public final zp0 c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final lr0 d0;
    public int d1;
    public int d2;
    public int e;
    public final v4.y e0;
    public boolean e1;
    public int e2;
    public int f;
    public final ir0 f0;
    public long f1;
    public int f2;
    public final vs0 g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final up0 h0;
    public TLRPC.UserFull h1;
    public ri.q h2;
    public final vs0 i0;
    public AnimatorSet i1;
    public float i2;
    public final vr0 j0;
    public boolean j1;
    public final RectF j2;
    public final vr0 k0;
    public boolean k1;
    public Runnable k2;
    public final vr0 l0;
    public boolean l1;
    public int l2;
    public final rr0 m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final tr0[] n0;
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
    public final fq0 u1;
    public final fh0 v0;
    public float v1;
    public int w;
    public final org.telegram.ui.ActionBar.q0 w0;
    public final ns0[] w1;
    public int x;
    public final org.telegram.ui.ActionBar.q0 x0;
    public final qs0 x1;
    public final Rect y;
    public final org.telegram.ui.ActionBar.q0 y0;
    public final org.telegram.ui.ActionBar.e2 y1;
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
    public ys0(Context context, long j3, qs0 qs0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, org.telegram.ui.ActionBar.e2 e2Var, nr0 nr0Var, int i12, org.telegram.ui.ActionBar.e6 e6Var, dh.c cVar) {
        super(context);
        int i13;
        TLRPC.ProfileTab profileTab;
        long j10;
        int i14;
        ns0[] ns0VarArr;
        int i15;
        sq0 sq0Var;
        int i16;
        int i17;
        js0 js0Var;
        float f10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        float f11;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.e6 e6Var3;
        dh.c cVar2;
        boolean z10;
        dh.c cVar3;
        int i18;
        int i19;
        int i20;
        tr0[] tr0VarArr;
        View view;
        ?? r92;
        ys0 ys0Var;
        zp0 zp0Var;
        boolean z11;
        sr0 sr0Var;
        int i21;
        int i22;
        bq0 bq0Var;
        sr0 sr0Var2;
        sr0 sr0Var3;
        sr0 sr0Var4;
        sr0 sr0Var5;
        sr0 sr0Var6;
        sr0 sr0Var7;
        sr0 sr0Var8;
        sr0 sr0Var9;
        sr0 sr0Var10;
        sr0 sr0Var11;
        sr0 sr0Var12;
        sr0 sr0Var13;
        sr0 sr0Var14;
        sr0 sr0Var15;
        sr0 sr0Var16;
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
        sr0 sr0Var17;
        cv0 cv0Var11;
        sr0 sr0Var18;
        sr0 sr0Var19;
        tr0 tr0Var;
        bq0 bq0Var2;
        sr0 sr0Var20;
        org.telegram.ui.ActionBar.q0 a10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        ys0 ys0Var2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        ys0Var2.y = new Rect();
        ys0Var2.n0 = new tr0[2];
        ys0Var2.H0 = new ArrayList(10);
        ys0Var2.I0 = new ArrayList(10);
        ys0Var2.J0 = new ArrayList(10);
        ys0Var2.K0 = new ArrayList(10);
        ys0Var2.P0 = new wo0(ys0Var2, 0);
        ys0Var2.Q0 = new ArrayList();
        ys0Var2.W0 = new Paint();
        ys0Var2.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        ys0Var2.n1 = false;
        ys0Var2.o1 = false;
        ys0Var2.p1 = new int[]{3, 3};
        ys0Var2.u1 = new fq0(ys0Var2);
        ys0Var2.v1 = -5.0f;
        ys0Var2.w1 = new ns0[9];
        ys0Var2.M1 = new h2.f(1);
        ys0Var2.S1 = new SparseArray();
        ys0Var2.V1 = -1;
        ys0Var2.W1 = new cr0(ys0Var2);
        ys0Var2.Y1 = 0.0f;
        ys0Var2.g2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ys0Var2.j2 = new RectF();
        ys0Var2.l2 = -1;
        ys0Var2.m2 = new HashMap();
        ys0Var2.n2 = new HashMap();
        ys0Var2.q2 = true;
        ui.c cVar4 = new ui.c();
        ys0Var2.J1 = cVar4;
        cVar4.a(ys0Var2.s0(org.telegram.ui.ActionBar.j6.d6));
        dh.c cVar5 = cVar == null ? new dh.c(cVar4) : cVar;
        ys0Var2.F = i12;
        ys0Var2.I1 = e6Var;
        pz pzVar = new pz(context);
        ys0Var2.E = pzVar;
        pzVar.setIsSingleCell(true);
        TLRPC.User a22 = e2Var.getMessagesController().a2(Long.valueOf(j3));
        ys0Var2.x1 = qs0Var;
        ys0Var2.G1 = nr0Var;
        int[] iArr = qs0Var.c;
        long j11 = qs0Var.s;
        ys0Var2.G = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i7 : 0, iArr[7], iArr[8]};
        ys0Var2.a1 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i13 = 1;
                profileTab = null;
                if (i10 != 14 || i10 == 10 || i10 == 11 || i10 == 6) {
                    ys0Var2.b1 = i10;
                } else if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    ys0Var2.b1 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    ys0Var2.b1 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || ys0Var2.I0()))) {
                    ys0Var2.b1 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[i13];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            ys0Var2.b1 = i13;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[5]) == i23 || i27 > 0)) {
                        ys0Var2.b1 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        ys0Var2.b1 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        ys0Var2.b1 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        ys0Var2.b1 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || ys0Var2.I0())) {
                        ys0Var2.b1 = ys0Var2.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i10 == -1 || j11 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = ys0Var2.a1;
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
                            ys0Var2.b1 = i10;
                        }
                    } else {
                        ys0Var2.b1 = 14;
                    }
                } else {
                    ys0Var2.b1 = 14;
                }
                ys0Var2.Z0(i10);
                ys0Var2.g1 = chatFull2;
                ys0Var2.h1 = userFull;
                if (chatFull2 != null) {
                    ys0Var2.f1 = -chatFull2.migrated_from_chat_id;
                }
                j10 = j3;
                ys0Var2.m1 = j10;
                i14 = 0;
                while (true) {
                    ns0VarArr = ys0Var2.w1;
                    if (i14 < ns0VarArr.length) {
                        break;
                    }
                    ns0VarArr[i14] = new ns0();
                    ys0Var2.w1[i14].j[0] = org.telegram.messenger.m5.C(ys0Var2.m1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    ys0Var2.w1[i14].j[1] = Integer.MAX_VALUE;
                    ys0Var2.a0(i14);
                    if (ys0Var2.f1 != 0 && ys0Var2.g1 != null && ys0Var2.w1[i14].b[1].size() == 0) {
                        ns0 ns0Var = ys0Var2.w1[i14];
                        ns0Var.j[1] = ys0Var2.g1.migrated_from_max_id;
                        ns0Var.i[1] = false;
                    }
                    i14++;
                }
                ys0Var2.y1 = e2Var;
                ys0Var2.H = e2Var.getActionBar();
                ys0Var2.I = e2Var.getSimpleActionBar();
                ys0Var2.p1[0] = ys0Var2.e1() > 0 ? org.telegram.messenger.gz.t1 : ys0Var2.e1();
                ys0Var2.p1[1] = ys0Var2.e1() > 0 ? org.telegram.messenger.gz.u1 : ys0Var2.e1();
                org.telegram.messenger.ns notificationCenter = e2Var.getNotificationCenter();
                notificationCenter.getClass();
                xi.e eVar = new xi.e(notificationCenter, ys0Var2);
                eVar.c(org.telegram.messenger.ns.V);
                eVar.c(org.telegram.messenger.ns.w);
                eVar.c(1);
                eVar.c(org.telegram.messenger.ns.K);
                eVar.c(org.telegram.messenger.ns.f2);
                eVar.c(org.telegram.messenger.ns.g2);
                eVar.c(org.telegram.messenger.ns.h2);
                eVar.c(org.telegram.messenger.ns.x5);
                eVar.c(org.telegram.messenger.ns.v5);
                eVar.c(org.telegram.messenger.ns.f3);
                eVar.c(org.telegram.messenger.ns.g3);
                eVar.c(org.telegram.messenger.ns.s);
                eVar.c(org.telegram.messenger.ns.G3);
                eVar.c(org.telegram.messenger.ns.W3);
                eVar.c(org.telegram.messenger.ns.f1);
                ys0Var2.K1 = eVar;
                for (i15 = 0; i15 < 10; i15++) {
                    if (i10 == 4) {
                        qq0 qq0Var = new qq0(ys0Var2, context);
                        qq0Var.U.c();
                        ys0Var2.J0.add(qq0Var);
                    }
                }
                ys0Var2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                ys0Var2.Y0 = false;
                ys0Var2.Z0 = null;
                sq0Var = ys0Var2.M0;
                if (sq0Var != null) {
                    sq0Var.g(false);
                }
                ys0Var2.X0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                ys0Var2.B0 = drawable;
                org.telegram.ui.ActionBar.q6.x(ys0Var2, drawable, org.telegram.ui.ActionBar.j6.b7, e6Var, PorterDuff.Mode.MULTIPLY);
                vq0 vq0Var = ys0Var2.L0;
                int currentTabId = vq0Var == null ? vq0Var.getCurrentTabId() : i10;
                vq0 vq0Var2 = new vq0(ys0Var2, context, ys0Var2.I1);
                i16 = ys0Var2.b1;
                if (i16 != -1) {
                    vq0Var2.setInitialTabId(i16);
                    ys0Var2.b1 = -1;
                }
                vq0Var2.c0 = 320L;
                int i32 = org.telegram.ui.ActionBar.j6.a;
                int i33 = org.telegram.ui.ActionBar.j6.wi;
                int i34 = org.telegram.ui.ActionBar.j6.vi;
                int i35 = org.telegram.ui.ActionBar.j6.a;
                vq0Var2.M = i33;
                vq0Var2.N = i34;
                vq0Var2.updateColors();
                vq0Var2.setUseMinimalWidth(true);
                vq0Var2.setDelegate(new xq0(ys0Var2));
                ys0Var2.L0 = vq0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    ys0Var2.c1[i17].clear();
                }
                ys0Var2.d1 = 0;
                ys0Var2.Q0.clear();
                js0Var = ys0Var2.U;
                if (js0Var != null) {
                    js0Var.x.clear();
                }
                if (ys0Var2 instanceof r20) {
                    org.telegram.ui.ActionBar.w4 w4Var = ys0Var2.I;
                    if (w4Var != null) {
                        org.telegram.ui.ActionBar.c5 r10 = w4Var.r();
                        a10 = r10.b(0, R.drawable.outline_header_search);
                        if (!ys0Var2.A0() && !ys0Var2.G0()) {
                            org.telegram.ui.ActionBar.d5 b10 = r10.b(0, R.drawable.ic_ab_other);
                            ys0Var2.J = b10;
                            b10.setContentDescription(org.telegram.messenger.hd.L0(2131754839));
                            b10.Z(false, false);
                        }
                        f10 = 10.0f;
                    } else {
                        org.telegram.ui.ActionBar.y s5 = ys0Var2.H.s();
                        s5.addOnLayoutChangeListener(new wq0(ys0Var2));
                        f10 = 10.0f;
                        if (ys0Var2.m1 == ys0Var2.y1.getUserConfig().e() && (ys0Var2.y1 instanceof y80) && ys0Var2.I()) {
                            ys0Var2.p0 = s5.a(11, R.drawable.outline_header_search);
                        }
                        a10 = s5.a(0, 0);
                    }
                    org.telegram.ui.ActionBar.q0 K = a10.N().K(new dr0(ys0Var2));
                    ys0Var2.q0 = K;
                    sq0 sq0Var2 = ys0Var2.M0;
                    K.setSearchFieldHint(org.telegram.messenger.hd.L0((sq0Var2 != null && sq0Var2.a() && ys0Var2.getSelectedTab() == 11) ? 2131745868 : 2131745836));
                    K.setContentDescription(org.telegram.messenger.hd.M0(2131745836, "Search"));
                    if (ys0Var2.I != null) {
                        ((org.telegram.ui.ActionBar.d5) K).Z(false, false);
                    } else {
                        K.setTranslationY(org.telegram.messenger.g0.L(f10));
                        ys0Var2.setSearchItemVisibility(ys0Var2.I0() ? 8 : 4);
                    }
                } else {
                    f10 = 10.0f;
                }
                ImageView imageView = new ImageView(context);
                ys0Var2.u0 = imageView;
                imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, "AccDescrMoreOptions"));
                imageView.setTranslationY(org.telegram.messenger.g0.L(f10));
                imageView.setVisibility(4);
                if (ys0Var2.I == null || ys0Var2.A0() || ys0Var2.G0()) {
                    e6Var2 = e6Var;
                    f11 = 2.0f;
                } else {
                    ys0Var2.H.addView(imageView, c8.ja.e(48, 56, 85));
                    fh0 fh0Var = new fh0(context);
                    ys0Var2.v0 = fh0Var;
                    fh0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    fh0Var.e(R.raw.options_to_search, 24, 24);
                    f11 = 2.0f;
                    fh0Var.getAnimatedDrawable().G *= 2.0f;
                    fh0Var.getAnimatedDrawable().h = true;
                    e6Var2 = e6Var;
                    org.telegram.ui.ActionBar.q6.s(fh0Var, org.telegram.ui.ActionBar.j6.y8, e6Var2, PorterDuff.Mode.SRC_IN);
                    fh0Var.setVisibility(8);
                    ys0Var2.H.addView(fh0Var, c8.ja.e(48, 56, 85));
                }
                imageView.setOnClickListener(new xo0(ys0Var2, 0));
                d5Var = ys0Var2.J;
                if (d5Var != null) {
                    d5Var.setOnClickListener(new xo0(ys0Var2, 1));
                }
                q0Var = ys0Var2.q0;
                if (q0Var != null && ys0Var2.I == null) {
                    EditTextBoldCursor searchField = q0Var.getSearchField();
                    int i36 = org.telegram.ui.ActionBar.j6.G6;
                    org.telegram.ui.ActionBar.q6.U(searchField, i36, e6Var2);
                    org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Jj, e6Var2);
                    org.telegram.ui.ActionBar.q6.v(searchField, i36, e6Var2);
                }
                ys0Var2.A0 = 0;
                LinearLayout linearLayout = new LinearLayout(context);
                ys0Var2.E0 = linearLayout;
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                linearLayout.setVisibility(4);
                ImageView imageView2 = new ImageView(context);
                ys0Var2.F0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(true);
                ys0Var2.G0 = x1Var;
                imageView2.setImageDrawable(x1Var);
                int i37 = org.telegram.ui.ActionBar.j6.y8;
                x1Var.a(ys0Var2.s0(i37));
                int i38 = org.telegram.ui.ActionBar.j6.z8;
                org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.g0(ys0Var2.s0(i38), 1), null, org.telegram.ui.ActionBar.q6.M(i38), e6Var2);
                imageView2.setContentDescription(org.telegram.messenger.hd.M0(2131752041, "Close"));
                linearLayout.addView(imageView2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
                ys0Var2.Q0.add(imageView2);
                imageView2.setOnClickListener(new xo0(ys0Var2, 2));
                NumberTextView numberTextView = new NumberTextView(context);
                ys0Var2.D0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(org.telegram.messenger.g0.o());
                numberTextView.setTextColor(ys0Var2.s0(i37));
                linearLayout.addView(numberTextView, c8.ja.m(1.0f, 0, -1, 18, 0, 0));
                ys0Var2.Q0.add(numberTextView);
                if (!org.telegram.messenger.m5.C(ys0Var2.m1)) {
                    if (!ys0Var2.I0()) {
                        ys0Var2.x0 = ys0Var2.W(context, org.telegram.messenger.ns.n1, R.drawable.msg_message, org.telegram.messenger.hd.L0(2131754877));
                        ys0Var2.w0 = ys0Var2.W(context, 100, R.drawable.msg_forward, org.telegram.messenger.hd.L0(2131750587));
                    }
                    org.telegram.ui.ActionBar.q0 W = ys0Var2.W(context, org.telegram.messenger.ns.o1, R.drawable.msg_pin, org.telegram.messenger.hd.L0(2131747245));
                    ys0Var2.y0 = W;
                    W.setVisibility(8);
                    org.telegram.ui.ActionBar.q0 W2 = ys0Var2.W(context, org.telegram.messenger.ns.p1, R.drawable.msg_unpin, org.telegram.messenger.hd.L0(2131743844));
                    ys0Var2.z0 = W2;
                    W2.setVisibility(8);
                    ys0Var2.G1();
                }
                ys0Var2.o0 = ys0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, "Delete"));
                ys0Var2.K = new fr0(ys0Var2, context);
                ys0Var2.L = new ss0(ys0Var2, context);
                ys0Var2.N = new ls0(ys0Var2, context, 1);
                ys0Var2.O = new ls0(ys0Var2, context, 2);
                ys0Var2.P = new ls0(ys0Var2, context, 4);
                ys0Var2.Q = new hs0(ys0Var2, context, ys0Var2.y1.getCurrentAccount(), ys0Var2.y1.getResourceProvider());
                ys0Var2.R = new or0(ys0Var2, context);
                ys0Var2.j0 = new vr0(ys0Var2, context, 1);
                ys0Var2.k0 = new vr0(ys0Var2, context, 4);
                ys0Var2.l0 = new vr0(ys0Var2, context, 3);
                ys0Var2.m0 = new rr0(ys0Var2, context);
                ys0Var2.S = new mr0(ys0Var2, context);
                ys0Var2.T = new kr0(ys0Var2, context);
                ys0Var2.U = new js0(ys0Var2, context);
                ys0Var2.V = new ks0(ys0Var2, context);
                if (!ys0Var2.I0() && !ys0Var2.x0() && ys0Var2.G == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", ys0Var2.y1.getUserConfig().e());
                    bundle.putInt("chatMode", 3);
                    gr0 gr0Var = new gr0(ys0Var2, context, ys0Var2.y1.getParentLayout(), bundle);
                    ys0Var2.W = gr0Var;
                    long j12 = ys0Var2.m1;
                    org.telegram.ui.bn bnVar = gr0Var.a;
                    bnVar.s4 = j12;
                    bnVar.mb = true;
                    gr0Var.setClipToOutline(true);
                    gr0Var.setOutlineProvider(new hr0());
                }
                lr0 lr0Var = new lr0(ys0Var2, context);
                ys0Var2.d0 = lr0Var;
                if (ys0Var2.G == 0) {
                    lr0Var.e = arrayList;
                    lr0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                ys0Var2.f0 = new ir0(ys0Var2, context);
                ys0Var2.e0 = new v4.y(new jr0(ys0Var2));
                ys0Var2.g0 = new vs0(ys0Var2, context, false);
                ys0Var2.h0 = new up0(ys0Var2, context);
                ys0Var2.i0 = new vs0(ys0Var2, context, true);
                ys0Var2.M = new ms0(ys0Var2, context);
                if (ys0Var2.B0()) {
                    if (ys0Var2.y1 instanceof ProfileActivity) {
                        TextView textView = new TextView(context);
                        ys0Var2.t0 = textView;
                        textView.setText(org.telegram.messenger.hd.L0(2131745946).toUpperCase());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        int i39 = org.telegram.ui.ActionBar.j6.Fi;
                        org.telegram.ui.ActionBar.q6.U(textView, i39, e6Var2);
                        textView.setTextSize(1, 15.0f);
                        textView.setGravity(17);
                        org.telegram.ui.ActionBar.q6.Q(textView, org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.r1(0.15f, ys0Var2.s0(i39)), 3), null, org.telegram.ui.ActionBar.q6.K(0.15f, i39), e6Var2);
                        textView.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
                        ViewGroup viewGroup = ys0Var2.I;
                        (viewGroup == null ? ys0Var2.H : viewGroup).addView(textView, c8.ja.e(-2, 56, 85));
                        textView.setOnClickListener(new xo0(ys0Var2, 3));
                        textView.setVisibility(8);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(0.4f);
                        textView.setScaleY(0.4f);
                        org.telegram.ui.ActionBar.e2 e2Var2 = ys0Var2.y1;
                        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
                        dh.c cVar6 = cVar5;
                        e6Var3 = e6Var4;
                        ys0Var2.b0 = new wp0(ys0Var2, e2Var2, context, e2Var2.getCurrentAccount(), ((ProfileActivity) ys0Var2.y1).a(), e6Var4, cVar6);
                        ys0Var2.H1();
                        ys0Var2.c0 = new zp0(ys0Var2, context, ys0Var2.getStoriesController().B(ys0Var2.m1, true), new yp0(ys0Var2, context, e2Var, e6Var3));
                        cVar2 = cVar6;
                    } else {
                        e6Var3 = e6Var2;
                        cVar2 = cVar5;
                    }
                    z10 = false;
                    cVar3 = cVar2;
                } else {
                    ys0Var2.a0 = new vp0(ys0Var2, context, ys0Var2.y1, ys0Var2.m1);
                    e6Var3 = e6Var2;
                    cVar3 = cVar5;
                    z10 = false;
                }
                ys0Var2.setWillNotDraw(z10);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    tr0VarArr = ys0Var2.n0;
                    if (i20 < tr0VarArr.length) {
                        break;
                    }
                    if (i20 == 0 && (tr0Var = tr0VarArr[i20]) != null && (bq0Var2 = tr0Var.x) != null) {
                        i19 = bq0Var2.L0();
                        if (i19 != ys0Var2.n0[i20].x.B() - 1) {
                            sr0Var20 = ys0Var2.n0[i20].h;
                            cj0 cj0Var = (cj0) sr0Var20.K(i19);
                            if (cj0Var != null) {
                                i18 = cj0Var.a.getTop();
                            } else {
                                i19 = -1;
                            }
                        } else {
                            i21 = i18;
                            i22 = -1;
                            aq0 aq0Var = new aq0(ys0Var2, context);
                            ys0Var2.addView(aq0Var, c8.ja.d(-1, -1.0f, 51, 0.0f, ys0Var2.O0(), 0.0f, 0.0f));
                            if (i20 == 1) {
                                aq0Var.setTranslationX(org.telegram.messenger.g0.q.x);
                            }
                            ys0Var2.n0[i20] = aq0Var;
                            aq0Var.O = e6Var3;
                            tr0 tr0Var2 = ys0Var2.n0[i20];
                            bq0Var = new bq0(ys0Var2, aq0Var);
                            tr0Var2.x = bq0Var;
                            bq0Var.z1(new cq0(ys0Var2, aq0Var));
                            ys0Var2.n0[i20].d = new v4.k();
                            ys0Var2.n0[i20].d.n(280L);
                            ys0Var2.n0[i20].d.o(er.h);
                            tr0 tr0Var3 = ys0Var2.n0[i20];
                            tr0Var3.d.m = false;
                            tr0Var3.h = new dq0(ys0Var2, context, e6Var3, aq0Var, bq0Var);
                            sr0Var2 = ys0Var2.n0[i20].h;
                            sr0Var2.setFastScrollEnabled(1);
                            sr0Var3 = ys0Var2.n0[i20].h;
                            sr0Var3.setScrollingTouchSlop(1);
                            sr0Var4 = ys0Var2.n0[i20].h;
                            sr0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                            sr0Var5 = ys0Var2.n0[i20].h;
                            sr0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                            sr0Var6 = ys0Var2.n0[i20].h;
                            sr0Var6.setItemAnimator(null);
                            sr0Var7 = ys0Var2.n0[i20].h;
                            sr0Var7.setClipToPadding(false);
                            sr0Var8 = ys0Var2.n0[i20].h;
                            sr0Var8.setSectionsType(2);
                            sr0Var9 = ys0Var2.n0[i20].h;
                            sr0Var9.setLayoutManager(bq0Var);
                            tr0 tr0Var4 = ys0Var2.n0[i20];
                            sr0Var10 = tr0Var4.h;
                            tr0Var4.addView(sr0Var10, c8.ja.c(-1.0f, -1));
                            ys0Var2.n0[i20].n = new sr0(context, null);
                            tr0 tr0Var5 = ys0Var2.n0[i20];
                            sr0 sr0Var21 = tr0Var5.n;
                            eq0 eq0Var = new eq0(ys0Var2);
                            tr0Var5.r = eq0Var;
                            sr0Var21.setLayoutManager(eq0Var);
                            tr0 tr0Var6 = ys0Var2.n0[i20];
                            tr0Var6.addView(tr0Var6.n, c8.ja.c(-1.0f, -1));
                            ys0Var2.n0[i20].n.setVisibility(8);
                            ys0Var2.n0[i20].n.i(new gq0(aq0Var));
                            sr0Var11 = ys0Var2.n0[i20].h;
                            sr0Var11.i(new hq0(ys0Var2, aq0Var));
                            sr0Var12 = ys0Var2.n0[i20].h;
                            sr0Var12.setOnItemClickListener(new di.o3(ys0Var2, aq0Var, context, j10, e6Var, 2));
                            sr0Var13 = ys0Var2.n0[i20].h;
                            sr0Var13.setOnScrollListener(new kq0(ys0Var2, aq0Var, bq0Var));
                            sr0Var14 = ys0Var2.n0[i20].h;
                            sr0Var14.setOnItemLongClickListener(new lq0(ys0Var2, aq0Var));
                            if (i20 == 0 && i22 != -1) {
                                bq0Var.h1(i22, i21);
                            }
                            sr0Var15 = ys0Var2.n0[i20].h;
                            ys0Var2.n0[i20].y = new mq0(context, sr0Var15);
                            ys0Var2.n0[i20].y.setVisibility(8);
                            sr0Var16 = ys0Var2.n0[i20].h;
                            mq0 mq0Var = ys0Var2.n0[i20].y;
                            FrameLayout.LayoutParams c10 = c8.ja.c(-1.0f, -1);
                            if (sr0Var16.c1 == null) {
                                sr0Var16.c1 = new bi.g2(23, sr0Var16.getContext(), sr0Var16);
                            }
                            sr0Var16.c1.addView(mq0Var, c10);
                            ys0Var2.n0[i20].s = new nq0(ys0Var2, context, aq0Var);
                            ys0Var2.n0[i20].s.f();
                            ys0Var2.n0[i20].s.setClipToOutline(true);
                            ys0Var2.n0[i20].s.setOutlineProvider(new oq0());
                            if (i20 == 0) {
                                ys0Var2.n0[i20].setVisibility(8);
                            }
                            tr0 tr0Var7 = ys0Var2.n0[i20];
                            tr0Var7.w = new pq0(ys0Var2, context, tr0Var7.s);
                            cv0Var = ys0Var2.n0[i20].w;
                            cv0Var.d(8, false);
                            cv0Var2 = ys0Var2.n0[i20].w;
                            cv0Var2.setAnimateLayoutChange(true);
                            tr0 tr0Var8 = ys0Var2.n0[i20];
                            cv0Var3 = tr0Var8.w;
                            tr0Var8.addView(cv0Var3, c8.ja.c(-1.0f, -1));
                            cv0Var4 = ys0Var2.n0[i20].w;
                            cv0Var4.setOnTouchListener(new gi.a(24));
                            cv0Var5 = ys0Var2.n0[i20].w;
                            cv0Var5.e(true, false);
                            cv0Var6 = ys0Var2.n0[i20].w;
                            cv0Var6.d.setText(org.telegram.messenger.hd.M0(2131748167, "NoResult"));
                            cv0Var7 = ys0Var2.n0[i20].w;
                            cv0Var7.f.setVisibility(8);
                            cv0Var8 = ys0Var2.n0[i20].w;
                            cv0Var8.e.setText(org.telegram.messenger.hd.L0(2131745807));
                            cv0Var9 = ys0Var2.n0[i20].w;
                            cv0Var9.f.setVisibility(8);
                            cv0Var10 = ys0Var2.n0[i20].w;
                            cv0Var10.addView(ys0Var2.n0[i20].s, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                            sr0Var17 = ys0Var2.n0[i20].h;
                            cv0Var11 = ys0Var2.n0[i20].w;
                            sr0Var17.setEmptyView(cv0Var11);
                            sr0Var18 = ys0Var2.n0[i20].h;
                            sr0Var18.o1(0, true);
                            tr0[] tr0VarArr2 = ys0Var2.n0;
                            tr0 tr0Var9 = tr0VarArr2[i20];
                            sr0Var19 = tr0VarArr2[i20].h;
                            tr0Var9.E = new wi0(sr0Var19, ys0Var2.n0[i20].x);
                            i20++;
                            j10 = j3;
                            e6Var3 = e6Var;
                            i18 = i21;
                            i19 = i22;
                        }
                    }
                    i21 = i18;
                    i22 = i19;
                    aq0 aq0Var2 = new aq0(ys0Var2, context);
                    ys0Var2.addView(aq0Var2, c8.ja.d(-1, -1.0f, 51, 0.0f, ys0Var2.O0(), 0.0f, 0.0f));
                    if (i20 == 1) {
                    }
                    ys0Var2.n0[i20] = aq0Var2;
                    aq0Var2.O = e6Var3;
                    tr0 tr0Var22 = ys0Var2.n0[i20];
                    bq0Var = new bq0(ys0Var2, aq0Var2);
                    tr0Var22.x = bq0Var;
                    bq0Var.z1(new cq0(ys0Var2, aq0Var2));
                    ys0Var2.n0[i20].d = new v4.k();
                    ys0Var2.n0[i20].d.n(280L);
                    ys0Var2.n0[i20].d.o(er.h);
                    tr0 tr0Var32 = ys0Var2.n0[i20];
                    tr0Var32.d.m = false;
                    tr0Var32.h = new dq0(ys0Var2, context, e6Var3, aq0Var2, bq0Var);
                    sr0Var2 = ys0Var2.n0[i20].h;
                    sr0Var2.setFastScrollEnabled(1);
                    sr0Var3 = ys0Var2.n0[i20].h;
                    sr0Var3.setScrollingTouchSlop(1);
                    sr0Var4 = ys0Var2.n0[i20].h;
                    sr0Var4.setPinnedSectionOffsetY(-org.telegram.messenger.g0.L(f11));
                    sr0Var5 = ys0Var2.n0[i20].h;
                    sr0Var5.setPadding(0, org.telegram.messenger.g0.L(54.0f), 0, 0);
                    sr0Var6 = ys0Var2.n0[i20].h;
                    sr0Var6.setItemAnimator(null);
                    sr0Var7 = ys0Var2.n0[i20].h;
                    sr0Var7.setClipToPadding(false);
                    sr0Var8 = ys0Var2.n0[i20].h;
                    sr0Var8.setSectionsType(2);
                    sr0Var9 = ys0Var2.n0[i20].h;
                    sr0Var9.setLayoutManager(bq0Var);
                    tr0 tr0Var42 = ys0Var2.n0[i20];
                    sr0Var10 = tr0Var42.h;
                    tr0Var42.addView(sr0Var10, c8.ja.c(-1.0f, -1));
                    ys0Var2.n0[i20].n = new sr0(context, null);
                    tr0 tr0Var52 = ys0Var2.n0[i20];
                    sr0 sr0Var212 = tr0Var52.n;
                    eq0 eq0Var2 = new eq0(ys0Var2);
                    tr0Var52.r = eq0Var2;
                    sr0Var212.setLayoutManager(eq0Var2);
                    tr0 tr0Var62 = ys0Var2.n0[i20];
                    tr0Var62.addView(tr0Var62.n, c8.ja.c(-1.0f, -1));
                    ys0Var2.n0[i20].n.setVisibility(8);
                    ys0Var2.n0[i20].n.i(new gq0(aq0Var2));
                    sr0Var11 = ys0Var2.n0[i20].h;
                    sr0Var11.i(new hq0(ys0Var2, aq0Var2));
                    sr0Var12 = ys0Var2.n0[i20].h;
                    sr0Var12.setOnItemClickListener(new di.o3(ys0Var2, aq0Var2, context, j10, e6Var, 2));
                    sr0Var13 = ys0Var2.n0[i20].h;
                    sr0Var13.setOnScrollListener(new kq0(ys0Var2, aq0Var2, bq0Var));
                    sr0Var14 = ys0Var2.n0[i20].h;
                    sr0Var14.setOnItemLongClickListener(new lq0(ys0Var2, aq0Var2));
                    if (i20 == 0) {
                        bq0Var.h1(i22, i21);
                    }
                    sr0Var15 = ys0Var2.n0[i20].h;
                    ys0Var2.n0[i20].y = new mq0(context, sr0Var15);
                    ys0Var2.n0[i20].y.setVisibility(8);
                    sr0Var16 = ys0Var2.n0[i20].h;
                    mq0 mq0Var2 = ys0Var2.n0[i20].y;
                    FrameLayout.LayoutParams c102 = c8.ja.c(-1.0f, -1);
                    if (sr0Var16.c1 == null) {
                    }
                    sr0Var16.c1.addView(mq0Var2, c102);
                    ys0Var2.n0[i20].s = new nq0(ys0Var2, context, aq0Var2);
                    ys0Var2.n0[i20].s.f();
                    ys0Var2.n0[i20].s.setClipToOutline(true);
                    ys0Var2.n0[i20].s.setOutlineProvider(new oq0());
                    if (i20 == 0) {
                    }
                    tr0 tr0Var72 = ys0Var2.n0[i20];
                    tr0Var72.w = new pq0(ys0Var2, context, tr0Var72.s);
                    cv0Var = ys0Var2.n0[i20].w;
                    cv0Var.d(8, false);
                    cv0Var2 = ys0Var2.n0[i20].w;
                    cv0Var2.setAnimateLayoutChange(true);
                    tr0 tr0Var82 = ys0Var2.n0[i20];
                    cv0Var3 = tr0Var82.w;
                    tr0Var82.addView(cv0Var3, c8.ja.c(-1.0f, -1));
                    cv0Var4 = ys0Var2.n0[i20].w;
                    cv0Var4.setOnTouchListener(new gi.a(24));
                    cv0Var5 = ys0Var2.n0[i20].w;
                    cv0Var5.e(true, false);
                    cv0Var6 = ys0Var2.n0[i20].w;
                    cv0Var6.d.setText(org.telegram.messenger.hd.M0(2131748167, "NoResult"));
                    cv0Var7 = ys0Var2.n0[i20].w;
                    cv0Var7.f.setVisibility(8);
                    cv0Var8 = ys0Var2.n0[i20].w;
                    cv0Var8.e.setText(org.telegram.messenger.hd.L0(2131745807));
                    cv0Var9 = ys0Var2.n0[i20].w;
                    cv0Var9.f.setVisibility(8);
                    cv0Var10 = ys0Var2.n0[i20].w;
                    cv0Var10.addView(ys0Var2.n0[i20].s, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                    sr0Var17 = ys0Var2.n0[i20].h;
                    cv0Var11 = ys0Var2.n0[i20].w;
                    sr0Var17.setEmptyView(cv0Var11);
                    sr0Var18 = ys0Var2.n0[i20].h;
                    sr0Var18.o1(0, true);
                    tr0[] tr0VarArr22 = ys0Var2.n0;
                    tr0 tr0Var92 = tr0VarArr22[i20];
                    sr0Var19 = tr0VarArr22[i20].h;
                    tr0Var92.E = new wi0(sr0Var19, ys0Var2.n0[i20].x);
                    i20++;
                    j10 = j3;
                    e6Var3 = e6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = ys0Var2.c0;
                if (view != null) {
                    ys0Var2.addView(view, c8.ja.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                }
                org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
                ys0Var2.N0 = t0Var;
                t0Var.g0((int) (System.currentTimeMillis() / 1000), false, false);
                t0Var.setAlpha(0.0f);
                t0Var.i0(org.telegram.ui.ActionBar.j6.nd, org.telegram.ui.ActionBar.j6.be);
                t0Var.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
                ys0Var2.addView(t0Var, c8.ja.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                for (tr0 tr0Var10 : ys0Var2.n0) {
                    sr0Var = tr0Var10.h;
                    zi0 fastScroll = sr0Var.getFastScroll();
                    if (fastScroll != null) {
                        fastScroll.a(cVar3, ys0Var2.I != null ? c8.g0.l(e6Var) : c8.g0.n(e6Var));
                    }
                }
                if (ys0Var2.Y()) {
                    gh.e l10 = ys0Var2.I != null ? c8.g0.l(e6Var) : c8.g0.n(e6Var);
                    vr vrVar = new vr(context);
                    ys0Var2.S0 = vrVar;
                    int L = org.telegram.messenger.g0.L(11.0f);
                    int i40 = w2;
                    vrVar.setPadding(L, i40, org.telegram.messenger.g0.L(11.0f), i40);
                    fh.g b11 = cVar3.b(vrVar, l10);
                    b11.r(org.telegram.messenger.g0.L(24.0f));
                    b11.q(org.telegram.messenger.g0.L(7.0f));
                    vrVar.setBlurredBackground(b11);
                    FrameLayout frameLayout = new FrameLayout(context);
                    ys0Var2.T0 = frameLayout;
                    vrVar.addView(frameLayout);
                    vrVar.i(frameLayout, true, false);
                    vrVar.setOnAnimatedHeightChangedListener(new wo0(ys0Var2, 1));
                    rq0 rq0Var = new rq0(ys0Var2, context, e2Var, this, e6Var);
                    ys0Var2.U0 = rq0Var;
                    frameLayout.addView(rq0Var);
                    vrVar.setCallFragmentContextView(rq0Var);
                    ys0Var2.addView(vrVar, c8.ja.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
                    rq0Var.setDelegate(new yo0(ys0Var2));
                    fh.g b12 = cVar3.b(ys0Var2.L0, l10);
                    org.telegram.messenger.i20.r(b12, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    ys0Var2.L0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    ys0Var2.L0.setClipToPadding(false);
                    ys0Var2.L0.setBackground(null);
                    ys0Var2.L0.setBlurredBackground(b12);
                    ys0Var2.L0.setOpen(false);
                    ys0Var2.addView(ys0Var2.L0, c8.ja.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
                    Context context2 = ys0Var2.getContext();
                    org.telegram.ui.ActionBar.e2 e2Var3 = ys0Var2.y1;
                    sq0 sq0Var3 = new sq0(ys0Var2, context2, e2Var3, e2Var3.getCurrentAccount(), ys0Var2.x0() ? 0L : ys0Var2.m1, e6Var);
                    ys0 ys0Var3 = ys0Var2;
                    ys0Var3.M0 = sq0Var3;
                    sq0Var3.d(cVar3, l10);
                    sq0Var3.setShown(0.0f);
                    ys0Var3.addView(sq0Var3, c8.ja.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                    if (ys0Var3.I == null) {
                        fh.g b13 = cVar3.b(ys0Var3.E0, l10);
                        org.telegram.messenger.i20.r(b13, org.telegram.messenger.g0.L(18.0f), 6.666f);
                        ys0Var3.E0.setBackground(b13);
                        z11 = false;
                        ys0Var3.E0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        ys0Var3.addView(ys0Var3.E0, c8.ja.e(-1, 50, 51));
                    } else {
                        z11 = false;
                    }
                    ys0Var3.G();
                    ys0Var = ys0Var3;
                    r92 = z11;
                } else {
                    r92 = 0;
                    ys0Var = ys0Var2;
                }
                ys0Var.P1(r92);
                ys0Var.B1(r92);
                ys0Var.Q();
                if (ys0Var.a1[r92] >= 0) {
                    ys0Var.M0(r92);
                }
                zp0Var = ys0Var.c0;
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
        ys0Var2.b1 = i10;
        ys0Var2.Z0(i10);
        ys0Var2.g1 = chatFull2;
        ys0Var2.h1 = userFull;
        if (chatFull2 != null) {
        }
        j10 = j3;
        ys0Var2.m1 = j10;
        i14 = 0;
        while (true) {
            ns0VarArr = ys0Var2.w1;
            if (i14 < ns0VarArr.length) {
            }
            i14++;
        }
        ys0Var2.y1 = e2Var;
        ys0Var2.H = e2Var.getActionBar();
        ys0Var2.I = e2Var.getSimpleActionBar();
        ys0Var2.p1[0] = ys0Var2.e1() > 0 ? org.telegram.messenger.gz.t1 : ys0Var2.e1();
        ys0Var2.p1[1] = ys0Var2.e1() > 0 ? org.telegram.messenger.gz.u1 : ys0Var2.e1();
        org.telegram.messenger.ns notificationCenter2 = e2Var.getNotificationCenter();
        notificationCenter2.getClass();
        xi.e eVar2 = new xi.e(notificationCenter2, ys0Var2);
        eVar2.c(org.telegram.messenger.ns.V);
        eVar2.c(org.telegram.messenger.ns.w);
        eVar2.c(1);
        eVar2.c(org.telegram.messenger.ns.K);
        eVar2.c(org.telegram.messenger.ns.f2);
        eVar2.c(org.telegram.messenger.ns.g2);
        eVar2.c(org.telegram.messenger.ns.h2);
        eVar2.c(org.telegram.messenger.ns.x5);
        eVar2.c(org.telegram.messenger.ns.v5);
        eVar2.c(org.telegram.messenger.ns.f3);
        eVar2.c(org.telegram.messenger.ns.g3);
        eVar2.c(org.telegram.messenger.ns.s);
        eVar2.c(org.telegram.messenger.ns.G3);
        eVar2.c(org.telegram.messenger.ns.W3);
        eVar2.c(org.telegram.messenger.ns.f1);
        ys0Var2.K1 = eVar2;
        while (i15 < 10) {
        }
        ys0Var2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        ys0Var2.Y0 = false;
        ys0Var2.Z0 = null;
        sq0Var = ys0Var2.M0;
        if (sq0Var != null) {
        }
        ys0Var2.X0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        ys0Var2.B0 = drawable2;
        org.telegram.ui.ActionBar.q6.x(ys0Var2, drawable2, org.telegram.ui.ActionBar.j6.b7, e6Var, PorterDuff.Mode.MULTIPLY);
        vq0 vq0Var3 = ys0Var2.L0;
        if (vq0Var3 == null) {
        }
        vq0 vq0Var22 = new vq0(ys0Var2, context, ys0Var2.I1);
        i16 = ys0Var2.b1;
        if (i16 != -1) {
        }
        vq0Var22.c0 = 320L;
        int i322 = org.telegram.ui.ActionBar.j6.a;
        int i332 = org.telegram.ui.ActionBar.j6.wi;
        int i342 = org.telegram.ui.ActionBar.j6.vi;
        int i352 = org.telegram.ui.ActionBar.j6.a;
        vq0Var22.M = i332;
        vq0Var22.N = i342;
        vq0Var22.updateColors();
        vq0Var22.setUseMinimalWidth(true);
        vq0Var22.setDelegate(new xq0(ys0Var2));
        ys0Var2.L0 = vq0Var22;
        while (i17 >= 0) {
        }
        ys0Var2.d1 = 0;
        ys0Var2.Q0.clear();
        js0Var = ys0Var2.U;
        if (js0Var != null) {
        }
        if (ys0Var2 instanceof r20) {
        }
        ImageView imageView3 = new ImageView(context);
        ys0Var2.u0 = imageView3;
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131754839, "AccDescrMoreOptions"));
        imageView3.setTranslationY(org.telegram.messenger.g0.L(f10));
        imageView3.setVisibility(4);
        if (ys0Var2.I == null) {
        }
        e6Var2 = e6Var;
        f11 = 2.0f;
        imageView3.setOnClickListener(new xo0(ys0Var2, 0));
        d5Var = ys0Var2.J;
        if (d5Var != null) {
        }
        q0Var = ys0Var2.q0;
        if (q0Var != null) {
            EditTextBoldCursor searchField2 = q0Var.getSearchField();
            int i362 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.U(searchField2, i362, e6Var2);
            org.telegram.ui.ActionBar.q6.D(searchField2, org.telegram.ui.ActionBar.j6.Jj, e6Var2);
            org.telegram.ui.ActionBar.q6.v(searchField2, i362, e6Var2);
        }
        ys0Var2.A0 = 0;
        LinearLayout linearLayout2 = new LinearLayout(context);
        ys0Var2.E0 = linearLayout2;
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setClickable(true);
        linearLayout2.setVisibility(4);
        ImageView imageView22 = new ImageView(context);
        ys0Var2.F0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(true);
        ys0Var2.G0 = x1Var2;
        imageView22.setImageDrawable(x1Var2);
        int i372 = org.telegram.ui.ActionBar.j6.y8;
        x1Var2.a(ys0Var2.s0(i372));
        int i382 = org.telegram.ui.ActionBar.j6.z8;
        org.telegram.ui.ActionBar.q6.Q(imageView22, org.telegram.ui.ActionBar.j6.g0(ys0Var2.s0(i382), 1), null, org.telegram.ui.ActionBar.q6.M(i382), e6Var2);
        imageView22.setContentDescription(org.telegram.messenger.hd.M0(2131752041, "Close"));
        linearLayout2.addView(imageView22, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        ys0Var2.Q0.add(imageView22);
        imageView22.setOnClickListener(new xo0(ys0Var2, 2));
        NumberTextView numberTextView2 = new NumberTextView(context);
        ys0Var2.D0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(org.telegram.messenger.g0.o());
        numberTextView2.setTextColor(ys0Var2.s0(i372));
        linearLayout2.addView(numberTextView2, c8.ja.m(1.0f, 0, -1, 18, 0, 0));
        ys0Var2.Q0.add(numberTextView2);
        if (!org.telegram.messenger.m5.C(ys0Var2.m1)) {
        }
        ys0Var2.o0 = ys0Var2.W(context, 101, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, "Delete"));
        ys0Var2.K = new fr0(ys0Var2, context);
        ys0Var2.L = new ss0(ys0Var2, context);
        ys0Var2.N = new ls0(ys0Var2, context, 1);
        ys0Var2.O = new ls0(ys0Var2, context, 2);
        ys0Var2.P = new ls0(ys0Var2, context, 4);
        ys0Var2.Q = new hs0(ys0Var2, context, ys0Var2.y1.getCurrentAccount(), ys0Var2.y1.getResourceProvider());
        ys0Var2.R = new or0(ys0Var2, context);
        ys0Var2.j0 = new vr0(ys0Var2, context, 1);
        ys0Var2.k0 = new vr0(ys0Var2, context, 4);
        ys0Var2.l0 = new vr0(ys0Var2, context, 3);
        ys0Var2.m0 = new rr0(ys0Var2, context);
        ys0Var2.S = new mr0(ys0Var2, context);
        ys0Var2.T = new kr0(ys0Var2, context);
        ys0Var2.U = new js0(ys0Var2, context);
        ys0Var2.V = new ks0(ys0Var2, context);
        if (!ys0Var2.I0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", ys0Var2.y1.getUserConfig().e());
            bundle2.putInt("chatMode", 3);
            gr0 gr0Var2 = new gr0(ys0Var2, context, ys0Var2.y1.getParentLayout(), bundle2);
            ys0Var2.W = gr0Var2;
            long j122 = ys0Var2.m1;
            org.telegram.ui.bn bnVar2 = gr0Var2.a;
            bnVar2.s4 = j122;
            bnVar2.mb = true;
            gr0Var2.setClipToOutline(true);
            gr0Var2.setOutlineProvider(new hr0());
        }
        lr0 lr0Var2 = new lr0(ys0Var2, context);
        ys0Var2.d0 = lr0Var2;
        if (ys0Var2.G == 0) {
        }
        ys0Var2.f0 = new ir0(ys0Var2, context);
        ys0Var2.e0 = new v4.y(new jr0(ys0Var2));
        ys0Var2.g0 = new vs0(ys0Var2, context, false);
        ys0Var2.h0 = new up0(ys0Var2, context);
        ys0Var2.i0 = new vs0(ys0Var2, context, true);
        ys0Var2.M = new ms0(ys0Var2, context);
        if (ys0Var2.B0()) {
        }
        ys0Var2.setWillNotDraw(z10);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            tr0VarArr = ys0Var2.n0;
            if (i20 < tr0VarArr.length) {
            }
            tr0 tr0Var722 = ys0Var2.n0[i20];
            tr0Var722.w = new pq0(ys0Var2, context, tr0Var722.s);
            cv0Var = ys0Var2.n0[i20].w;
            cv0Var.d(8, false);
            cv0Var2 = ys0Var2.n0[i20].w;
            cv0Var2.setAnimateLayoutChange(true);
            tr0 tr0Var822 = ys0Var2.n0[i20];
            cv0Var3 = tr0Var822.w;
            tr0Var822.addView(cv0Var3, c8.ja.c(-1.0f, -1));
            cv0Var4 = ys0Var2.n0[i20].w;
            cv0Var4.setOnTouchListener(new gi.a(24));
            cv0Var5 = ys0Var2.n0[i20].w;
            cv0Var5.e(true, false);
            cv0Var6 = ys0Var2.n0[i20].w;
            cv0Var6.d.setText(org.telegram.messenger.hd.M0(2131748167, "NoResult"));
            cv0Var7 = ys0Var2.n0[i20].w;
            cv0Var7.f.setVisibility(8);
            cv0Var8 = ys0Var2.n0[i20].w;
            cv0Var8.e.setText(org.telegram.messenger.hd.L0(2131745807));
            cv0Var9 = ys0Var2.n0[i20].w;
            cv0Var9.f.setVisibility(8);
            cv0Var10 = ys0Var2.n0[i20].w;
            cv0Var10.addView(ys0Var2.n0[i20].s, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 12.0f, 60.0f, 12.0f, 12.0f));
            sr0Var17 = ys0Var2.n0[i20].h;
            cv0Var11 = ys0Var2.n0[i20].w;
            sr0Var17.setEmptyView(cv0Var11);
            sr0Var18 = ys0Var2.n0[i20].h;
            sr0Var18.o1(0, true);
            tr0[] tr0VarArr222 = ys0Var2.n0;
            tr0 tr0Var922 = tr0VarArr222[i20];
            sr0Var19 = tr0VarArr222[i20].h;
            tr0Var922.E = new wi0(sr0Var19, ys0Var2.n0[i20].x);
            i20++;
            j10 = j3;
            e6Var3 = e6Var;
            i18 = i21;
            i19 = i22;
        }
        view = ys0Var2.c0;
        if (view != null) {
        }
        org.telegram.ui.Cells.t0 t0Var2 = new org.telegram.ui.Cells.t0(context);
        ys0Var2.N0 = t0Var2;
        t0Var2.g0((int) (System.currentTimeMillis() / 1000), false, false);
        t0Var2.setAlpha(0.0f);
        t0Var2.i0(org.telegram.ui.ActionBar.j6.nd, org.telegram.ui.ActionBar.j6.be);
        t0Var2.setTranslationY(-org.telegram.messenger.g0.L(48.0f));
        ys0Var2.addView(t0Var2, c8.ja.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        while (r4 < r2) {
        }
        if (ys0Var2.Y()) {
        }
        ys0Var.P1(r92);
        ys0Var.B1(r92);
        ys0Var.Q();
        if (ys0Var.a1[r92] >= 0) {
        }
        zp0Var = ys0Var.c0;
        if (zp0Var != null) {
        }
    }

    public static boolean J0(int i7) {
        return (i7 & (-65536)) == 65536;
    }

    public static p3 X(int i7, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        p3 p3Var = new p3(context, e6Var);
        ImageView imageView = (ImageView) p3Var.d;
        TextView textView = (TextView) p3Var.c;
        if (i7 == 0) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748196, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748198, null));
            return p3Var;
        }
        if (i7 == 1) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748157, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748158, null));
            return p3Var;
        }
        if (i7 == 2) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748152, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748153, null));
            return p3Var;
        }
        if (i7 == 3) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748154, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748155, null));
            return p3Var;
        }
        if (i7 == 4) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748159, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748160, null));
            return p3Var;
        }
        if (i7 == 5) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748156, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748208, null));
            return p3Var;
        }
        if (i7 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.hd.M0(2131748206, null));
            return p3Var;
        }
        if (i7 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return p3Var;
    }

    public static void a(ys0 ys0Var, TL_stories.StoryItem storyItem, fi.l6 l6Var) {
        ys0Var.getStoriesController().c(l6Var.a, ys0Var.m1, storyItem);
        org.telegram.messenger.g0.i3(new hh0(7, ys0Var, l6Var), 100L);
    }

    public static void d(ys0 ys0Var, int i7, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(ys0Var, i7, storyItem, 18);
        fi.s6 storiesController = ys0Var.getStoriesController();
        long j3 = ys0Var.m1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i7, j3, arrayList);
        cc.a0(ys0Var.y1).K(R.raw.chats_archived, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.hd.M0(2131743885, null), f0Var).j();
    }

    public static void e(ys0 ys0Var, long j3, int i7) {
        fi.g6 B = ys0Var.getStoriesController().B(j3, true);
        int i10 = B.a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        fi.l6 l6Var = (fi.l6) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.np.s1(i10).j1(B.b);
        tL_deleteAlbum.album_id = l6Var.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(ys0 ys0Var, long j3, int i7, String str) {
        fi.g6 B = ys0Var.getStoriesController().B(j3, true);
        int i10 = B.a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        ((fi.l6) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.np.s1(i10).j1(B.b);
        tL_updateAlbum.album_id = i7;
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
    public fi.s6 getStoriesController() {
        return org.telegram.messenger.np.s1(this.y1.getCurrentAccount()).P1();
    }

    public static /* synthetic */ void h(ys0 ys0Var, TL_stories.StoryItem storyItem) {
        ys0Var.getStoriesController().r0(ys0Var.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        cc.a0(ys0Var.y1).G(R.raw.chats_archived, 5000, org.telegram.messenger.hd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(ys0 ys0Var, HashSet hashSet, TL_stories.StoryItem storyItem, m60 m60Var, fi.l6 l6Var) {
        String a02;
        long j3 = ys0Var.m1;
        if (hashSet.contains(Integer.valueOf(l6Var.a))) {
            ys0Var.getStoriesController().c(l6Var.a, j3, storyItem);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744731, l6Var.b);
        } else {
            fi.s6 storiesController = ys0Var.getStoriesController();
            int i7 = l6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i7, j3, arrayList);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744494, l6Var.b);
        }
        cc.a0(ys0Var.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.g0.X2(a02)).j();
        m60Var.u();
    }

    public static int o(View view) {
        if (view instanceof org.telegram.ui.Cells.n7) {
            return ((org.telegram.ui.Cells.n7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            return ((org.telegram.ui.Cells.g7) view).getMessage().e1();
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            return ((org.telegram.ui.Cells.f7) view).getMessage().e1();
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

    public static void s(tr0 tr0Var, ns0[] ns0VarArr, boolean z10) {
        hh0 hh0Var;
        if (!z10) {
            if (tr0Var.G == null || (hh0Var = tr0Var.H) == null) {
                return;
            }
            org.telegram.messenger.g0.r(hh0Var);
            tr0Var.H.run();
            tr0Var.H = null;
            tr0Var.G = null;
            return;
        }
        if (org.telegram.messenger.gz.v1 <= 0 || tr0Var.G != null || tr0Var.I || tr0Var.h.getFastScroll() == null || !tr0Var.h.getFastScroll().b0 || tr0Var.h.getFastScroll().getVisibility() != 0 || ns0VarArr[0].e() < 50) {
            return;
        }
        int i7 = org.telegram.messenger.gz.v1;
        int i10 = i7 - 1;
        if (i7 != i10) {
            org.telegram.messenger.gz.v1 = i10;
            org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.gz.v1).apply();
        }
        tr0Var.I = true;
        Context context = tr0Var.getContext();
        bi.v1 v1Var = new bi.v1(context, 20);
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131745408, null));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i11 = org.telegram.ui.ActionBar.j6.gg;
        org.telegram.ui.ActionBar.q6.U(textView, i11, null);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i12 = org.telegram.ui.ActionBar.j6.hg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        v1Var.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(v1Var, d02, M, null, null);
        v1Var.addView(textView, c8.ja.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        uo0 uo0Var = new uo0(context);
        uo0Var.a = new Random();
        Paint paint = new Paint(1);
        uo0Var.b = paint;
        Paint paint2 = new Paint(1);
        uo0Var.c = paint2;
        uo0Var.f = 1.0f;
        uo0Var.h = 0.0f;
        paint.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, i11, false));
        Paint paint3 = new Paint();
        uo0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        uo0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        v1Var.addView(uo0Var, c8.ja.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        tr0Var.G = v1Var;
        tr0Var.addView(v1Var, c8.ja.c(-2.0f, -2));
        tr0Var.G.setAlpha(0.0f);
        tr0Var.G.setScaleX(0.8f);
        tr0Var.G.setScaleY(0.8f);
        tr0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        tr0Var.invalidate();
        hh0 hh0Var2 = new hh0(8, tr0Var, v1Var);
        tr0Var.H = hh0Var2;
        org.telegram.messenger.g0.i3(hh0Var2, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        if (w4Var != null) {
            w4Var.setEnabled(z10);
        } else {
            this.H.setEnabled(z10);
        }
    }

    private void setPageOverscan(sr0 sr0Var) {
        if (!this.c2 || sr0Var == null) {
            return;
        }
        sr0Var.j3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sr0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            int i7 = marginLayoutParams.topMargin;
            int i10 = -this.e2;
            if (i7 == i10 && marginLayoutParams.bottomMargin == (-this.f2)) {
                return;
            }
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -this.f2;
            sr0Var.setLayoutParams(marginLayoutParams);
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

    public static void t(ys0 ys0Var, int i7, boolean z10) {
        tr0[] tr0VarArr = ys0Var.n0;
        if (tr0VarArr[0].F == i7) {
            return;
        }
        tr0 tr0Var = tr0VarArr[1];
        tr0Var.F = i7;
        tr0Var.setVisibility(0);
        ys0Var.w0();
        ys0Var.B1(true);
        ys0Var.k1 = z10;
        ys0Var.Y0();
        ys0Var.E(!ys0Var.F0(i7));
        ys0Var.I1(true);
    }

    public static int x(ys0 ys0Var, v4.h0 h0Var) {
        if (h0Var == ys0Var.f0) {
            return 8;
        }
        if (h0Var == ys0Var.h0) {
            return 9;
        }
        for (xs0 xs0Var : ys0Var.m2.values()) {
            if (xs0Var.c == h0Var) {
                return xs0Var.a;
            }
        }
        return -1;
    }

    public static int y(ys0 ys0Var, v4.h0 h0Var) {
        if (h0Var == ys0Var.g0) {
            return 8;
        }
        if (h0Var == ys0Var.i0) {
            return 9;
        }
        for (xs0 xs0Var : ys0Var.m2.values()) {
            if (xs0Var.d == h0Var) {
                return xs0Var.a;
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
                this.a2.append((CharSequence) org.telegram.messenger.hd.M0(2131746702, null));
            } else {
                this.a2.append((CharSequence) "c");
                this.a2.setSpan(new eq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131744809, null));
            }
        }
        return this.a2;
    }

    public boolean A0() {
        return false;
    }

    public final vs0 A1(int i7) {
        xs0 y12;
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

    public final void B(xr0 xr0Var, org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7) {
        String n10 = j3 > 0 ? org.telegram.messenger.q10.n(org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).a2(Long.valueOf(j3))) : org.telegram.messenger.t3.K(org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).M0(Long.valueOf(-j3)), false);
        if (n10 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).V2, "/", n10, "/a/");
        sb2.append(i7);
        xr0Var.n0(R.drawable.media_share, new yf(this, sb2.toString(), e2Var, 22), org.telegram.messenger.hd.M0(2131744788, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User a22;
        long j3 = this.m1;
        return j3 > 0 && (a22 = org.telegram.messenger.np.s1(this.y1.getCurrentAccount()).a2(Long.valueOf(j3))) != null && a22.bot;
    }

    public final void B1(boolean z10) {
        tr0[] tr0VarArr;
        tr0[] tr0VarArr2;
        org.telegram.ui.ActionBar.q0 q0Var;
        v4.v0 v0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        v4.v0 v0Var2;
        int i7;
        int i10;
        int i11;
        boolean z14;
        v4.v0 v0Var3;
        int i12;
        int i13;
        boolean z15;
        v4.v0 v0Var4;
        wp0 wp0Var = this.b0;
        if (wp0Var != null) {
            wp0Var.i();
        }
        int i14 = 0;
        while (true) {
            tr0VarArr = this.n0;
            if (i14 >= tr0VarArr.length) {
                break;
            }
            tr0VarArr[i14].h.C0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tr0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        v4.h0 adapter = tr0VarArr[z10 ? 1 : 0].h.getAdapter();
        v4.h0 h0Var = this.f0;
        v4.y yVar = this.e0;
        if (adapter == h0Var) {
            yVar.h(null);
        }
        boolean z16 = this.Y0;
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        nr0 nr0Var = this.G1;
        org.telegram.ui.ActionBar.k kVar = this.H;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.q0;
        hs0 hs0Var = this.Q;
        int i15 = 100;
        if (z16 && this.X0) {
            tr0 tr0Var = tr0VarArr[z10 ? 1 : 0];
            if (tr0Var.f == null) {
                tr0Var.f = new v4.v0();
            }
            tr0 tr0Var2 = tr0VarArr[z10 ? 1 : 0];
            v4.v0 v0Var5 = tr0Var2.f;
            ks0 ks0Var = this.V;
            rr0 rr0Var = this.m0;
            vr0 vr0Var = this.k0;
            vr0 vr0Var2 = this.l0;
            vr0 vr0Var3 = this.j0;
            if (z10) {
                int i16 = tr0Var2.F;
                if (i16 != 0) {
                    v0Var4 = v0Var5;
                    if (i16 != 2 && i16 != 5 && i16 != 6 && (i16 != 7 || nr0Var.Y())) {
                        String obj = q0Var2 != null ? q0Var2.getSearchField().getText().toString() : "";
                        int i17 = tr0VarArr[z10 ? 1 : 0].F;
                        if (i17 == 1) {
                            if (vr0Var3 != null) {
                                vr0Var3.G(obj, false);
                                if (adapter != vr0Var3) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var3);
                                }
                            }
                        } else if (i17 == 3) {
                            if (vr0Var2 != null) {
                                vr0Var2.G(obj, false);
                                if (adapter != vr0Var2) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var2);
                                }
                            }
                        } else if (i17 == 4) {
                            if (vr0Var != null) {
                                vr0Var.G(obj, false);
                                if (adapter != vr0Var) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var);
                                }
                            }
                        } else if (i17 == 7) {
                            if (rr0Var != null) {
                                rr0Var.F(obj, false);
                                if (adapter != rr0Var) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(rr0Var);
                                }
                            }
                        } else if (i17 == 11) {
                            if (ks0Var != null) {
                                ks0Var.E(this.Z0, obj);
                                if (adapter != ks0Var) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(ks0Var);
                                }
                            }
                        } else if (i17 == 15 && hs0Var != null && adapter != hs0Var) {
                            i1(adapter);
                            dq0 dq0Var = tr0VarArr[z10 ? 1 : 0].h;
                            hs0Var.r = dq0Var;
                            dq0Var.setAdapter(hs0Var);
                        }
                    }
                }
                this.Y0 = false;
                sq0 sq0Var = this.M0;
                if (sq0Var != null) {
                    sq0Var.g(false);
                }
                this.X0 = false;
                B1(true);
                return;
            }
            v0Var4 = v0Var5;
            if (tr0Var2.h != null) {
                int i18 = tr0Var2.F;
                if (i18 == 1) {
                    if (adapter != vr0Var3) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var3);
                    }
                    vr0Var3.f();
                } else if (i18 == 3) {
                    if (adapter != vr0Var2) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var2);
                    }
                    vr0Var2.f();
                } else if (i18 == 4) {
                    if (adapter != vr0Var) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var);
                    }
                    vr0Var.f();
                } else if (i18 == 7) {
                    if (adapter != rr0Var) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(rr0Var);
                    }
                    rr0Var.f();
                } else if (i18 == 11) {
                    if (adapter != ks0Var) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(ks0Var);
                    }
                    ks0Var.f();
                }
            }
            tr0VarArr2 = tr0VarArr;
            q0Var = q0Var2;
            v0Var3 = v0Var4;
            i10 = 4;
            z13 = false;
            z14 = false;
            i11 = 8;
        } else {
            tr0 tr0Var3 = tr0VarArr[z10 ? 1 : 0];
            if (tr0Var3.e == null) {
                tr0Var3.e = new v4.v0();
            }
            tr0 tr0Var4 = tr0VarArr[z10 ? 1 : 0];
            v4.v0 v0Var6 = tr0Var4.e;
            tr0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = tr0VarArr[z10 ? 1 : 0].F;
            if (i19 == 8 || J0(i19)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
            }
            dq0 dq0Var2 = tr0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = dq0Var2.getPaddingLeft();
            tr0 tr0Var5 = tr0VarArr[z10 ? 1 : 0];
            tr0VarArr2 = tr0VarArr;
            dq0 dq0Var3 = tr0Var5.h;
            int j02 = j0(tr0Var5.F);
            dq0Var3.h3 = j02;
            int paddingRight = tr0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            dq0 dq0Var4 = tr0VarArr2[z10 ? 1 : 0].h;
            q0Var = q0Var2;
            int i02 = i0(I0());
            dq0Var4.i3 = i02;
            dq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i20 = tr0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.p1;
            v4.h0 h0Var2 = this.N;
            View view = this.a0;
            js0 js0Var = this.U;
            mr0 mr0Var = this.S;
            gr0 gr0Var = this.W;
            ns0[] ns0VarArr = this.w1;
            if (i20 == 0) {
                v4.h0 h0Var3 = this.K;
                if (adapter != h0Var3) {
                    i1(adapter);
                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i21 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                ns0 ns0Var = ns0VarArr[0];
                boolean z17 = ns0Var.h && !ns0Var.e.isEmpty();
                i15 = iArr[0];
                tr0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                ns0 ns0Var2 = ns0VarArr[0];
                if (ns0Var2.x == null) {
                    ns0Var2.x = new v4.v0();
                }
                v0Var = ns0VarArr[0].x;
                z13 = z17;
                z11 = false;
            } else {
                if (i20 == 1) {
                    ns0 ns0Var3 = ns0VarArr[1];
                    z12 = ns0Var3.h && !ns0Var3.e.isEmpty();
                    if (adapter != h0Var2) {
                        i1(adapter);
                        tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i20 == 2) {
                    ns0 ns0Var4 = ns0VarArr[2];
                    z12 = ns0Var4.h && !ns0Var4.e.isEmpty();
                    v4.h0 h0Var4 = this.O;
                    if (adapter != h0Var4) {
                        i1(adapter);
                        tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var4);
                    }
                } else {
                    if (i20 == 3) {
                        v4.h0 h0Var5 = this.M;
                        if (adapter != h0Var5) {
                            i1(adapter);
                            tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var5);
                        }
                    } else if (i20 == 4) {
                        ns0 ns0Var5 = ns0VarArr[4];
                        z12 = ns0Var5.h && !ns0Var5.e.isEmpty();
                        v4.h0 h0Var6 = this.P;
                        if (adapter != h0Var6) {
                            i1(adapter);
                            tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var6);
                        }
                    } else {
                        if (i20 == 5) {
                            v4.h0 h0Var7 = this.R;
                            if (adapter != h0Var7) {
                                i1(adapter);
                                tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var7);
                            }
                        } else if (i20 == 15) {
                            if (adapter != hs0Var) {
                                i1(adapter);
                                dq0 dq0Var5 = tr0VarArr2[z10 ? 1 : 0].h;
                                hs0Var.r = dq0Var5;
                                dq0Var5.setAdapter(hs0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != mr0Var) {
                                i1(adapter);
                                tr0VarArr2[z10 ? 1 : 0].h.setAdapter(mr0Var);
                            }
                        } else if (i20 == 7) {
                            v4.h0 h0Var8 = this.d0;
                            if (adapter != h0Var8) {
                                i1(adapter);
                                tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var8);
                            }
                        } else if (z0(i20)) {
                            v4.h0 z18 = z1(tr0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != z18) {
                                i1(adapter);
                                tr0VarArr2[z10 ? 1 : 0].h.setAdapter(z18);
                                tr0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            tr0 tr0Var6 = tr0VarArr2[z10 ? 1 : 0];
                            if (tr0Var6.F != 9) {
                                yVar.h(tr0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = tr0VarArr2[z10 ? 1 : 0].F;
                            if (i22 == 10) {
                                v4.h0 h0Var9 = this.T;
                                if (adapter != h0Var9) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var9);
                                }
                            } else if (i22 == 11) {
                                if (adapter != js0Var) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(js0Var);
                                    v4.y yVar2 = js0Var.w;
                                    dq0 dq0Var6 = tr0VarArr2[z10 ? 1 : 0].h;
                                    js0Var.s = dq0Var6;
                                    yVar2.h(dq0Var6);
                                }
                                v0Var = js0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gr0Var.getParent() != tr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(gr0Var);
                                    tr0VarArr2[z10 ? 1 : 0].addView(gr0Var, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    p1(org.telegram.messenger.g0.L(56.0f) + this.d2, gr0Var);
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != tr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    tr0VarArr2[z10 ? 1 : 0].addView(view);
                                    p1(this.d2, view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (wp0Var != null && wp0Var.getParent() != tr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(wp0Var);
                                    tr0VarArr2[z10 ? 1 : 0].addView(wp0Var);
                                    tr0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
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
            K1(tr0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                tr0VarArr2[z10 ? 1 : 0].h.setSections(false);
                v0Var2 = v0Var;
            } else {
                dq0 dq0Var7 = tr0VarArr2[z10 ? 1 : 0].h;
                dq0Var7.getClass();
                v0Var2 = v0Var;
                org.telegram.ui.ActionBar.q6.l(dq0Var7, 20, org.telegram.ui.ActionBar.j6.i6, dq0Var7.o2);
                dq0Var7.U2 = false;
                dq0Var7.I2 = null;
                dq0Var7.J2 = null;
                dq0Var7.M2 = 0.0f;
                dq0Var7.N2 = null;
                dq0Var7.O2 = null;
                dq0Var7.K2 = null;
                ej0 ej0Var = dq0Var7.H2;
                if (ej0Var != null) {
                    dq0Var7.q0(ej0Var);
                    dq0Var7.H2 = null;
                }
                n9 n9Var = dq0Var7.S2;
                if (n9Var != null) {
                    dq0Var7.q0(n9Var);
                    dq0Var7.S2 = null;
                }
            }
            J1(tr0VarArr2[z10 ? 1 : 0]);
            tr0 tr0Var7 = tr0VarArr2[z10 ? 1 : 0];
            if (tr0Var7.F == 11) {
                tr0Var7.h.setItemAnimator(tr0Var7.d);
            } else {
                tr0Var7.h.setItemAnimator(null);
                if (js0Var != null && tr0VarArr2[z10 ? 1 : 0].h == js0Var.s) {
                    v4.y yVar3 = js0Var.w;
                    js0Var.s = null;
                    yVar3.h(null);
                }
            }
            if (gr0Var != null && tr0VarArr2[z10 ? 1 : 0].F != 12 && gr0Var.getParent() == tr0VarArr2[z10 ? 1 : 0]) {
                gr0Var.a.onRemoveFromParent();
                tr0VarArr2[z10 ? 1 : 0].removeView(gr0Var);
            }
            if (view != null && tr0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                tr0 tr0Var8 = tr0VarArr2[z10 ? 1 : 0];
                if (parent == tr0Var8) {
                    tr0Var8.removeView(view);
                }
            }
            if (wp0Var != null && tr0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = wp0Var.getParent();
                tr0 tr0Var9 = tr0VarArr2[z10 ? 1 : 0];
                if (parent2 == tr0Var9) {
                    tr0Var9.removeView(wp0Var);
                }
            }
            int i23 = tr0VarArr2[z10 ? 1 : 0].F;
            if (i23 != 0 && i23 != 11 && !z0(i23) && (i12 = tr0VarArr2[z10 ? 1 : 0].F) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || nr0Var.Y()) && (i13 = tr0VarArr2[z10 ? 1 : 0].F) != 10 && i13 != 13 && i13 != 14)) {
                if (z10) {
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (!(w4Var != null ? w4Var.G : kVar.o0)) {
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
            int i24 = tr0VarArr2[z10 ? 1 : 0].F;
            if (i24 == 6) {
                if (!mr0Var.e && !mr0Var.h && mr0Var.d.isEmpty()) {
                    mr0Var.E(0L);
                }
            } else if (i24 != 7) {
                if (z0(i24)) {
                    vs0 z19 = z1(tr0VarArr2[z10 ? 1 : 0].F);
                    if (z19 != null) {
                        fi.k6 k6Var = z19.s;
                        z19.P();
                        tr0VarArr2[z10 ? 1 : 0].w.e(k6Var != null && (k6Var.k() || (t0() && k6Var.g() > 0)), z10);
                        z13 = (k6Var == null || k6Var.g() <= 0 || G0()) ? false : true;
                    }
                } else {
                    int i25 = tr0VarArr2[z10 ? 1 : 0].F;
                    if (i25 != 10 && i25 != 11 && i25 != 12 && i25 != 13 && i25 != 14) {
                        if (i25 == 15) {
                            i25 = 8;
                        }
                        ns0 ns0Var6 = ns0VarArr[i25];
                        if (!ns0Var6.g && !ns0Var6.i[0] && ns0Var6.a.isEmpty()) {
                            ns0VarArr[i25].g = true;
                            h0Var2.f();
                            if (i25 == 0) {
                                int i26 = ns0VarArr[0].q;
                                if (i26 == 1) {
                                    i7 = 6;
                                } else if (i26 == 2) {
                                    i7 = 7;
                                }
                                org.telegram.ui.ActionBar.e2 e2Var = this.y1;
                                e2Var.getMediaDataController().N0(this.m1, 50, 0, 0, i7, this.G, 1, e2Var.getClassGuid(), ns0VarArr[i7].p, null, null);
                            }
                            i7 = i25;
                            org.telegram.ui.ActionBar.e2 e2Var2 = this.y1;
                            e2Var2.getMediaDataController().N0(this.m1, 50, 0, 0, i7, this.G, 1, e2Var2.getClassGuid(), ns0VarArr[i7].p, null, null);
                        }
                    }
                }
            }
            int i27 = tr0VarArr2[z10 ? 1 : 0].F;
            if (i27 == 8 || J0(i27)) {
                i10 = 4;
                tr0 tr0Var10 = tr0VarArr2[z10 ? 1 : 0];
                pq0 pq0Var = tr0Var10.w;
                boolean J0 = J0(tr0Var10.F);
                int w12 = w1(tr0VarArr2[z10 ? 1 : 0].F);
                i9 i9Var = pq0Var.b;
                hi.d dVar = pq0Var.f;
                i9Var.setVisibility((J0 || H0() || B0()) ? 8 : 0);
                if (J0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.hd.M0(2131744805, null), false);
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
                    pq0Var.d.setText(org.telegram.messenger.hd.M0(2131744783, null));
                    pq0Var.e.setText(org.telegram.messenger.hd.M0(2131744784, null));
                } else {
                    pq0Var.d.setText(org.telegram.messenger.hd.M0(!G0() ? I0() ? 2131748176 : 2131748147 : 2131748204, null));
                    pq0Var.e.setText(I0() ? org.telegram.messenger.hd.M0(2131748148, null) : "");
                }
                dVar.setOnClickListener(new bi.c3(this, J0, w12, 1));
            } else {
                tr0 tr0Var11 = tr0VarArr2[z10 ? 1 : 0];
                if (tr0Var11.F == 9) {
                    if (H0()) {
                        tr0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        tr0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        tr0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        tr0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        tr0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        tr0VarArr2[z10 ? 1 : 0].w.f.h(A(), false);
                    }
                    tr0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.hd.M0(2131748246, null));
                    tr0VarArr2[z10 ? 1 : 0].w.e.setText(I0() ? org.telegram.messenger.hd.M0(2131748247, null) : "");
                    i10 = 4;
                    tr0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new xo0(this, i10));
                    i11 = 8;
                } else {
                    i10 = 4;
                    tr0Var11.w.b.setVisibility(0);
                    tr0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    tr0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
                    tr0VarArr2[z10 ? 1 : 0].w.e.setText(org.telegram.messenger.hd.M0(2131745807, null));
                    i11 = 8;
                    tr0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z14 = false;
            tr0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            v0Var3 = v0Var2;
        }
        int i28 = i15;
        tr0 tr0Var12 = tr0VarArr2[z10 ? 1 : 0];
        tr0Var12.b = z13;
        F1(tr0Var12, z14);
        tr0VarArr2[z10 ? 1 : 0].x.y1(i28);
        tr0VarArr2[z10 ? 1 : 0].h.a0();
        if (v0Var3 != null) {
            tr0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(v0Var3);
            tr0VarArr2[z10 ? 1 : 0].n.setRecycledViewPool(v0Var3);
        }
        if (this.A0 == 2) {
            if (w4Var != null ? w4Var.G : kVar.o0) {
                this.C0 = true;
                if (w4Var != null) {
                    w4Var.m(true);
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

    public final void C(xr0 xr0Var) {
        final View[] viewArr = new View[2];
        final int i7 = 0;
        viewArr[0] = xr0Var.n0(R.drawable.msg_zoomin, new Runnable(this) { // from class: org.telegram.ui.Components.lp0
            public final /* synthetic */ ys0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        ys0 ys0Var = this.b;
                        ys0Var.getClass();
                        View[] viewArr2 = viewArr;
                        ys0Var.Q1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        ys0 ys0Var2 = this.b;
                        ys0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        ys0Var2.R1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.hd.M0(2131748650, null), false, false);
        final int i10 = 1;
        viewArr[1] = xr0Var.n0(R.drawable.msg_zoomout, new Runnable(this) { // from class: org.telegram.ui.Components.lp0
            public final /* synthetic */ ys0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ys0 ys0Var = this.b;
                        ys0Var.getClass();
                        View[] viewArr2 = viewArr;
                        ys0Var.Q1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        ys0 ys0Var2 = this.b;
                        ys0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        ys0Var2.R1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.hd.M0(2131748649, null), false, false);
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
        org.telegram.ui.ActionBar.e2 e2Var;
        if (this.g1 == null || (e2Var = this.y1) == null) {
            return false;
        }
        return org.telegram.messenger.t3.V(e2Var.getMessagesController().M0(Long.valueOf(this.g1.id)));
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
            org.telegram.messenger.g0.F3(f10, z0Var, null);
        }
    }

    public final void D(sr0 sr0Var, int i7, SparseBooleanArray sparseBooleanArray) {
        int childCount = sr0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = sr0Var.getChildAt(i10);
            if (childAt instanceof pz) {
                view = childAt;
            }
        }
        if (view != null) {
            sr0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new ar0(this, sr0Var, sparseBooleanArray, (pz) view, i7));
    }

    public final boolean D0() {
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i7 >= tr0VarArr.length) {
                return false;
            }
            tr0 tr0Var = tr0VarArr[i7];
            if (tr0Var != null) {
                dq0 dq0Var = tr0Var.h;
                if (dq0Var != null && dq0Var.c0()) {
                    return true;
                }
                sr0 sr0Var = tr0VarArr[i7].n;
                if (sr0Var != null && sr0Var.c0()) {
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
            int s02 = s0(org.telegram.ui.ActionBar.j6.y8);
            int s03 = s0(org.telegram.ui.ActionBar.j6.z8);
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
                        org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), s03, true);
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
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

    public final boolean E0() {
        wp0 wp0Var = this.b0;
        if (wp0Var != null && wp0Var.g()) {
            return true;
        }
        zp0 zp0Var = this.c0;
        return zp0Var != null && zp0Var.f;
    }

    public final void E1() {
        if (D0()) {
            post(new wo0(this, 13));
            return;
        }
        fr0 fr0Var = this.K;
        if (fr0Var != null) {
            fr0Var.f();
        }
        ls0 ls0Var = this.N;
        if (ls0Var != null) {
            ls0Var.f();
        }
        ls0 ls0Var2 = this.O;
        if (ls0Var2 != null) {
            ls0Var2.f();
        }
        ms0 ms0Var = this.M;
        if (ms0Var != null) {
            ms0Var.X(false);
        }
        ls0 ls0Var3 = this.P;
        if (ls0Var3 != null) {
            ls0Var3.f();
        }
        hs0 hs0Var = this.Q;
        if (hs0Var != null) {
            hs0Var.f();
        }
        or0 or0Var = this.R;
        if (or0Var != null) {
            or0Var.f();
        }
        ir0 ir0Var = this.f0;
        if (ir0Var != null) {
            ir0Var.f();
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ((xs0) it.next()).c.f();
        }
    }

    public final void F(int i7) {
        int i10;
        tr0 g02 = g0(this.s1);
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
            sr0 sr0Var = g02.n;
            int paddingLeft = sr0Var.getPaddingLeft();
            sr0 sr0Var2 = g02.n;
            int j02 = j0(g02.F);
            sr0Var2.h3 = j02;
            int paddingRight = g02.n.getPaddingRight();
            sr0 sr0Var3 = g02.n;
            int i02 = i0(I0());
            sr0Var3.i3 = i02;
            sr0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.r.y1(i7);
            g02.n.a0();
            int i11 = 0;
            while (true) {
                tr0[] tr0VarArr = this.n0;
                if (i11 >= tr0VarArr.length) {
                    break;
                }
                tr0 tr0Var = tr0VarArr[i11];
                if (tr0Var != null && ((i10 = tr0Var.F) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.a4(tr0VarArr[i11].h);
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
            ofFloat.addUpdateListener(new uq0(this, g02, i12));
            ofFloat.addListener(new ki.m2(this, z0(g02.F) ? 1 : 0, i7, 2));
            ofFloat.setInterpolator(er.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean F0(int i7) {
        return i7 == 7 ? this.G1.Y() : (G0() || i7 == 0 || z0(i7) || i7 == 2 || i7 == 5 || i7 == 6 || i7 == 11 || i7 == 10 || i7 == 13 || i7 == 14 || i7 == 15) ? false : true;
    }

    public final void F1(tr0 tr0Var, boolean z10) {
        boolean z11 = tr0Var.b && this.d;
        zi0 fastScroll = tr0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = tr0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            tr0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<zi0, Float>) property, fastScroll.getAlpha(), 1.0f);
            tr0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<zi0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new org.telegram.ui.nn(fastScroll));
        tr0Var.c = ofFloat2;
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
        boolean z10 = this.y1.getMessagesController().A2(this.m1) || u0();
        q0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && q0Var.getBackground() != null) {
            q0Var.setBackground(null);
            return;
        }
        if (z10 || q0Var.getBackground() != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.j6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(s0(i7), 5, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        q0Var.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(q0Var, h02, null, M, this.I1);
    }

    public final boolean H() {
        boolean B0 = B0();
        long j3 = this.m1;
        org.telegram.ui.ActionBar.e2 e2Var = this.y1;
        if (B0) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).a2(Long.valueOf(j3));
            return a22 != null && a22.bot && a22.bot_can_edit;
        }
        if (I0()) {
            return true;
        }
        return e2Var != null && e2Var.getMessagesController().P1().h(j3);
    }

    public boolean H0() {
        return false;
    }

    public final void H1() {
        wp0 wp0Var = this.b0;
        if (wp0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.d2;
            vr vrVar = this.S0;
            wp0Var.setPaddingTop(L + (vrVar != null ? (int) vrVar.c(org.telegram.messenger.g0.L(7.0f)) : 0));
        }
    }

    public boolean I() {
        return !(this instanceof r20);
    }

    public boolean I0() {
        return false;
    }

    public final void I1(boolean z10) {
        wp0 wp0Var;
        zp0 zp0Var;
        R(true, true);
        fh0 fh0Var = this.v0;
        if (fh0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.Y0 && (((wp0Var = this.b0) == null || !wp0Var.g()) && ((zp0Var = this.c0) == null || !zp0Var.f))) {
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

    public final boolean J() {
        tr0 tr0Var;
        tr0[] tr0VarArr = this.n0;
        if (tr0VarArr != null && (tr0Var = tr0VarArr[0]) != null) {
            boolean z02 = z0(tr0Var.F);
            int i7 = this.p1[z02 ? 1 : 0];
            if (i7 != h0(z02 ? 1 : 0, i7, true)) {
                return true;
            }
        }
        return false;
    }

    public final void J1(tr0 tr0Var) {
        boolean b12 = tr0Var.h.b1();
        if (b12) {
            tr0Var.h.setSectionsDrawBackground(this.c2);
        }
        tr0Var.setDrawPageBackground((!this.c2 || b12 || tr0Var.F == 15) ? false : true);
        if (tr0Var.F != 15) {
            tr0Var.setClipToOutline(false);
            tr0Var.setBackground(null);
            tr0Var.setWallpaper(null);
            return;
        }
        Drawable drawable = tr0Var.P;
        if (drawable == null) {
            drawable = tr0Var.getBackground();
        }
        Drawable e10 = hi.x5.e(drawable, this.y1.getCurrentAccount(), this.m1, org.telegram.ui.ActionBar.j6.I.q());
        if (this.c2) {
            tr0Var.setBackground(null);
            tr0Var.setClipToOutline(false);
            tr0Var.setWallpaper(e10);
        } else {
            tr0Var.setWallpaper(null);
            tr0Var.setBackground(e10);
            tr0Var.setOutlineProvider(new bg.p0(15));
            tr0Var.setClipToOutline(true);
        }
    }

    public final boolean K() {
        tr0 tr0Var;
        tr0[] tr0VarArr = this.n0;
        if (tr0VarArr == null || (tr0Var = tr0VarArr[0]) == null) {
            return false;
        }
        if (this.n1 && z0(tr0Var.F)) {
            return false;
        }
        boolean z02 = z0(tr0VarArr[0].F);
        int i7 = this.p1[z02 ? 1 : 0];
        return i7 != h0(z02 ? 1 : 0, i7, false);
    }

    public final boolean K0() {
        if (H() && ((getClosestTab() == 8 || getClosestTab() == 13 || J0(getClosestTab())) && this.F1)) {
            return false;
        }
        wp0 wp0Var = this.b0;
        if (wp0Var != null && wp0Var.g()) {
            return false;
        }
        zp0 zp0Var = this.c0;
        return ((zp0Var != null && zp0Var.f) || this.r1 || this.j1) ? false : true;
    }

    public final void K1(tr0 tr0Var) {
        int i7 = tr0Var.F;
        boolean z10 = i7 == 0 || z0(i7);
        FrameLayout.LayoutParams d = c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, z10 ? 0.0f : 12.0f, (z10 ? 8 : 12) + 48, z10 ? 0.0f : 12.0f, z10 ? 0.0f : 12.0f);
        d.topMargin = n0(tr0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = tr0Var.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        tr0Var.s.setLayoutParams(d);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        vp0 vp0Var;
        gr0 gr0Var;
        wp0 wp0Var;
        tr0[] tr0VarArr = this.n0;
        int length = tr0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            tr0 tr0Var = tr0VarArr[i7];
            if (tr0Var != null && tr0Var.getVisibility() == 0) {
                if (tr0Var.P != null) {
                    RectF rectF2 = this.j2;
                    if (jh.k.c(tr0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        tr0Var.h(canvas);
                        canvas.restore();
                    }
                }
                if (tr0Var.F == 14 && (wp0Var = this.b0) != null && wp0Var.getParent() == tr0Var) {
                    for (View view : wp0Var.h.getViewPages()) {
                        if ((view instanceof bi.c4) && view.getVisibility() == 0) {
                            bi.v3 v3Var = ((bi.c4) view).f;
                            ih.d.a(v3Var, canvas, rectF, v3Var, viewGroup);
                        }
                    }
                } else {
                    uj0 currentListView = (tr0Var.F == 12 && (gr0Var = this.W) != null && gr0Var.getParent() == tr0Var) ? gr0Var.a.A0 : (tr0Var.F == 13 && (vp0Var = this.a0) != null && vp0Var.getParent() == tr0Var) ? vp0Var.getCurrentListView() : tr0Var.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        ih.d.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(int i7, int i10, int i11, boolean z10) {
        ns0[] ns0VarArr = this.w1;
        ns0VarArr[i7].a.clear();
        ns0VarArr[i7].b[0].clear();
        ns0VarArr[i7].b[1].clear();
        ns0 ns0Var = ns0VarArr[i7];
        ns0Var.j[0] = i10;
        ns0Var.i[0] = false;
        ns0Var.l = false;
        ns0Var.m = i11;
        ns0Var.n = (ns0Var.e() - i11) - 1;
        ns0 ns0Var2 = ns0VarArr[i7];
        if (ns0Var2.n < 0) {
            ns0Var2.n = 0;
        }
        ns0Var2.k = i10;
        ns0Var2.o = true;
        ns0Var2.g = false;
        ns0Var2.p++;
        tr0 g02 = g0(i7);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (!z10) {
            return;
        }
        int i12 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i12 >= tr0VarArr.length) {
                return;
            }
            tr0 tr0Var = tr0VarArr[i12];
            if (tr0Var.F == i7) {
                tr0Var.x.h1(Math.min(ns0VarArr[i7].e() - 1, ns0VarArr[i7].m), 0);
            }
            i12++;
        }
    }

    public final void L1(boolean z10) {
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i7 >= tr0VarArr.length) {
                return;
            }
            int childCount = tr0VarArr[i7].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = tr0VarArr[i7].h.getChildAt(i10);
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
                    ((org.telegram.ui.Cells.t2) childAt).e0(false, z10);
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
        ys0 ys0Var;
        ArrayList arrayList;
        int i7;
        int i10;
        Bitmap bitmap;
        tr0 g02 = g0(0);
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
                ys0Var = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new jg.j0((FrameLayout) ys0Var, view, (View) g02, (Object) bitmap2, 2)).start();
                g02.h.setAlpha(0.0f);
                g02.h.animate().alpha(1.0f).setUpdateListener(new f60(g02, 19)).setDuration(200L).start();
                qs0 qs0Var = ys0Var.x1;
                int[] iArr = qs0Var.c;
                arrayList = qs0Var.n[0].a;
                ns0[] ns0VarArr = ys0Var.w1;
                ns0 ns0Var = ns0VarArr[0];
                int[] iArr2 = ns0Var.f;
                iArr2[1] = 0;
                i7 = ns0Var.q;
                if (i7 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i7 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                ns0Var.h = false;
                long j3 = ys0Var.m1;
                L0(0, !org.telegram.messenger.m5.C(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                M0(false);
                ys0Var.G1.W();
                boolean C = org.telegram.messenger.m5.C(j3);
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
                    ns0 ns0Var2 = ns0VarArr[0];
                    int i11 = ns0Var2.q;
                    if (i11 == 0) {
                        ns0Var2.a(gjVar, 0, false, C);
                    } else if (i11 == 1) {
                        if (org.telegram.messenger.gj.S3(gjVar.k)) {
                            ns0VarArr[0].a(gjVar, 0, false, C);
                        }
                    } else if (!org.telegram.messenger.gj.S3(gjVar.k)) {
                        ns0VarArr[0].a(gjVar, 0, false, C);
                    }
                }
            }
        }
        ys0Var = this;
        qs0 qs0Var2 = ys0Var.x1;
        int[] iArr3 = qs0Var2.c;
        arrayList = qs0Var2.n[0].a;
        ns0[] ns0VarArr2 = ys0Var.w1;
        ns0 ns0Var3 = ns0VarArr2[0];
        int[] iArr22 = ns0Var3.f;
        iArr22[1] = 0;
        i7 = ns0Var3.q;
        if (i7 != 0) {
        }
        ns0Var3.h = false;
        long j32 = ys0Var.m1;
        L0(0, !org.telegram.messenger.m5.C(j32) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        M0(false);
        ys0Var.G1.W();
        boolean C2 = org.telegram.messenger.m5.C(j32);
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
            ns0[] ns0VarArr = this.w1;
            if (ns0VarArr[i10].h && !z10) {
                return;
            }
            long j10 = this.m1;
            if (org.telegram.messenger.m5.C(j10)) {
                return;
            }
            ns0VarArr[i10].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i10 == 0) {
                int i11 = ns0VarArr[i10].q;
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
            org.telegram.ui.ActionBar.e2 e2Var = this.y1;
            tL_messages_getSearchResultsPositions.peer = e2Var.getMessagesController().j1(j10);
            if (j3 != 0 && e2Var.getUserConfig().e() == j10) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = e2Var.getMessagesController().j1(j3);
            }
            ConnectionsManager.getInstance(e2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(e2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.ee(this, ns0VarArr[i10].p, i10, 2)), e2Var.getClassGuid());
        }
    }

    public final void M1(float f10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.p0;
        if (q0Var == null) {
            return;
        }
        tr0[] tr0VarArr = this.n0;
        tr0 tr0Var = tr0VarArr[1];
        float f11 = 0.0f;
        if (tr0Var != null && tr0Var.F == 11) {
            f11 = 0.0f + f10;
        }
        tr0 tr0Var2 = tr0VarArr[0];
        if (tr0Var2 != null && tr0Var2.F == 11) {
            f11 += 1.0f - f10;
        }
        q0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        q0Var.setScaleX(f12);
        q0Var.setScaleY(f12);
        q0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
    }

    public final void N() {
        vq0 vq0Var = this.L0;
        if (vq0Var.d(vq0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = vq0Var.getFirstTabId();
        vq0Var.setInitialTabId(firstTabId);
        this.n0[0].F = firstTabId;
        B1(false);
    }

    public final void N0(int i7) {
        int i10;
        int i11 = 2;
        ns0[] ns0VarArr = this.w1;
        if (i7 == 0) {
            int i12 = ns0VarArr[0].q;
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
        ns0VarArr[i7].g = true;
        org.telegram.ui.ActionBar.e2 e2Var = this.y1;
        e2Var.getMediaDataController().N0(this.m1, 50, 0, ns0VarArr[i7].k, i10, this.G, 1, e2Var.getClassGuid(), ns0VarArr[i7].p, null, null);
    }

    public final void N1() {
        org.telegram.ui.ActionBar.q0 q0Var = this.p0;
        if (q0Var == null) {
            return;
        }
        tr0 tr0Var = this.n0[1];
        boolean z10 = tr0Var != null && tr0Var.F == 11;
        if (z10) {
            q0Var.setVisibility(0);
        }
        q0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new fp0(0, this, z10)).setDuration(420L).setInterpolator(er.h).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(tr0 tr0Var, uj0 uj0Var, v4.b0 b0Var) {
        int i7;
        int i10;
        boolean[] zArr;
        v4.e1 K;
        fi.k6 k6Var;
        if (this.r1 || this.N1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (uj0Var.getFastScroll() == null || !uj0Var.getFastScroll().n || currentTimeMillis - tr0Var.a >= 300) {
            tr0Var.a = currentTimeMillis;
            if (this.Y0 && this.X0 && tr0Var.F != 11) {
                return;
            }
            int i11 = 7;
            if (tr0Var.F == 7) {
                return;
            }
            int L0 = b0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(b0Var.N0() - L0) + 1;
            int b10 = uj0Var.getAdapter() == null ? 0 : uj0Var.getAdapter().b();
            int i12 = tr0Var.F;
            int[] iArr = this.p1;
            ns0[] ns0VarArr = this.w1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                b10 = ns0VarArr[i12].d() + ns0VarArr[i12].a.size();
                ns0 ns0Var = ns0VarArr[i12];
                if (ns0Var.h && ns0Var.e.size() > 2 && tr0Var.F == 0 && ns0VarArr[i12].a.size() != 0) {
                    float f10 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((uj0Var.getMeasuredHeight() / (uj0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((yr0) ns0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((yr0) ns0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > b10 && L0 - b10 > measuredHeight) || ((i7 = L0 + abs) < ns0VarArr[i12].m && ns0VarArr[0].m - i7 > measuredHeight)) {
                        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(this, i12, uj0Var, 19);
                        this.N1 = f0Var;
                        org.telegram.messenger.g0.h3(f0Var);
                        return;
                    }
                }
            }
            int i13 = tr0Var.F;
            if (i13 == 7) {
                return;
            }
            if (z0(i13)) {
                vs0 z12 = z1(tr0Var.F);
                if (z12 == null || (k6Var = z12.s) == null || L0 + abs <= k6Var.i() - iArr[1]) {
                    return;
                }
                z12.P();
                return;
            }
            int i14 = tr0Var.F;
            if (i14 == 6) {
                if (abs > 0) {
                    mr0 mr0Var = this.S;
                    boolean z10 = mr0Var.h;
                    ArrayList arrayList = mr0Var.d;
                    if (z10 || mr0Var.e || arrayList.isEmpty() || L0 + abs < b10 - 5) {
                        return;
                    }
                    mr0Var.E(((TLRPC.Chat) i5.c.h(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.e2 e2Var = this.y1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < tr0Var.h.getChildCount(); i16++) {
                    View childAt = tr0Var.h.getChildAt(i16);
                    tr0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                v4.h0 adapter = tr0Var.h.getAdapter();
                ks0 ks0Var = this.V;
                if (adapter != ks0Var) {
                    if (i15 + 1 >= e2Var.getMessagesController().G1().i.size()) {
                        e2Var.getMessagesController().G1().g(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < ks0Var.h.size() + ks0Var.e.size() || ks0Var.s || ks0Var.r) {
                        return;
                    }
                    ks0Var.r = true;
                    ks0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > b10 - i17 || ns0VarArr[i18].o) {
                ns0 ns0Var2 = ns0VarArr[i18];
                if (!ns0Var2.g) {
                    if (i14 == 0) {
                        int i19 = ns0VarArr[0].q;
                        if (i19 == 1) {
                            i10 = 6;
                        } else {
                            if (i19 != 2) {
                                i10 = 0;
                            }
                            i10 = i11;
                        }
                        zArr = ns0Var2.i;
                        if (zArr[0]) {
                            ns0Var2.g = true;
                            e2Var.getMediaDataController().N0(this.m1, 50, ns0VarArr[i18].j[0], 0, i10, this.G, 1, e2Var.getClassGuid(), ns0VarArr[i18].p, null, null);
                        } else if (this.f1 != 0 && !zArr[1]) {
                            ns0Var2.g = true;
                            e2Var.getMediaDataController().N0(this.f1, 50, ns0VarArr[i18].j[1], 0, i10, this.G, 1, e2Var.getClassGuid(), ns0VarArr[i18].p, null, null);
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
                        zArr = ns0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i20 = ns0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.K.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                ns0 ns0Var3 = ns0VarArr[i18];
                if (!ns0Var3.g && !ns0Var3.l && !ns0Var3.o) {
                    N0(tr0Var.F);
                }
            }
            tr0 tr0Var2 = this.n0[0];
            if (tr0Var2.h == uj0Var) {
                int i21 = tr0Var2.F;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = uj0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.o7;
                    org.telegram.ui.Cells.t0 t0Var = this.N0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.h2) {
                            t0Var.g0(((org.telegram.ui.Cells.h2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        org.telegram.messenger.gj gjVar = o7Var.e <= 0 ? null : o7Var.b[0];
                        if (gjVar != null) {
                            t0Var.g0(gjVar.k.date, false, true);
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
        fi.k6 k6Var;
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
            ir0 ir0Var = this.f0;
            if (ir0Var != null && (k6Var = ir0Var.s) != null && !k6Var.m(gjVar.e1())) {
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
        vp0 vp0Var;
        tr0[] tr0VarArr = this.n0;
        int i7 = tr0VarArr[0].F;
        if (i7 == 13 && (vp0Var = this.a0) != null) {
            View currentView = vp0Var.n.getCurrentView();
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
        if ((i7 == 0 || z0(i7)) && getParent() != null) {
            if (!this.r1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        tr0VarArr[0].h.I0(false);
                        tr0VarArr[0].h.cancelLongPress();
                        tr0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - tr0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - tr0VarArr[0].getY());
                        int i16 = this.x;
                        this.s = -1;
                        int top2 = y11 - tr0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F == 1) {
                            top2 = 0;
                        }
                        for (int i17 = 0; i17 < tr0VarArr[0].h.getChildCount(); i17++) {
                            View childAt2 = tr0VarArr[0].h.getChildAt(i17);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i16, top2)) {
                                tr0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.G1.Y() && this.s == -1) {
                            this.s = (int) (((this.p1[z0(tr0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i16 / tr0VarArr[0].h.getMeasuredWidth(), 0.0f))) + tr0VarArr[0].x.L0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - tr0VarArr[0].getY() > this.d2) {
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
                            this.q1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.k5.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.q1 = 0.0f;
                        }
                        float f11 = this.q1;
                        if (f11 == 1.0f || f11 == 0.0f) {
                            v4.h0 z14 = z0(this.s1) ? z1(this.s1) : this.K;
                            if (this.q1 == 1.0f) {
                                int i21 = this.t1;
                                int ceil2 = (((int) Math.ceil(this.s / this.t1)) * i21) + ((int) ((this.C1 / (tr0VarArr[0].h.getMeasuredWidth() - ((int) (tr0VarArr[0].h.getMeasuredWidth() / this.t1)))) * (i21 - 1)));
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
                        tr0VarArr[0].h.invalidate();
                        tr0 tr0Var = tr0VarArr[0];
                        if (tr0Var.G != null) {
                            tr0Var.invalidate();
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
        lr0 lr0Var;
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
        wp0 wp0Var;
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
        qs0 qs0Var;
        vq0 vq0Var = this.L0;
        if (vq0Var == null) {
            return;
        }
        boolean z20 = !this.G1.t() ? false : z10;
        boolean z21 = (this.W == null || (qs0Var = this.x1) == null || !qs0Var.f) ? false : true;
        long j3 = this.m1;
        int i21 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.e2 e2Var = this.y1;
        if (i21 <= 0 || e2Var == null) {
            i7 = 1;
            user = null;
        } else {
            i7 = 1;
            user = e2Var.getMessagesController().a2(Long.valueOf(j3));
        }
        boolean z22 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i7 : false;
        int i22 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.h1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z22) ? 0 : i7;
        int i23 = ((org.telegram.messenger.m5.E(j3) || org.telegram.messenger.m5.z(j3)) && !org.telegram.messenger.m5.C(j3) && (((userFull = this.h1) != null && userFull.stories_pinned_available) || (((chatFull = this.g1) != null && chatFull.stories_pinned_available) || I0())) && y0()) ? i7 : 0;
        wp0 wp0Var2 = this.b0;
        int i24 = i22;
        boolean z23 = (wp0Var2 == null || (((userFull3 = this.h1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.g1) == null || chatFull3.stargifts_count <= 0))) ? false : i7;
        int i25 = i23;
        TLRPC.ChatFull chatFull4 = this.g1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.h1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z20;
                int i26 = this.U1 == vq0Var.o0 ? i7 : 0;
                boolean z25 = (i25 == 0 || i24 != 0) ? i7 : false;
                int i27 = i26;
                i10 = z25 == vq0Var.d(8) ? i27 + 1 : i27;
                if (z22 != vq0Var.d(13)) {
                    i10++;
                }
                if (G0() != vq0Var.d(8)) {
                    i10++;
                }
                if (z23 == vq0Var.d(14) || (wp0Var2 != null && z23 && this.T1 != wp0Var2.getLastEmojisHash())) {
                    i10++;
                }
                I0 = I0();
                int i28 = 14;
                lr0 lr0Var2 = this.d0;
                int[] iArr2 = this.a1;
                if (I0) {
                    z11 = z23;
                    int i29 = i10;
                    int i30 = (lr0Var2.d == null ? i7 : false) == vq0Var.d(7) ? i29 + 1 : i29;
                    if (iArr2[0] <= 0) {
                        z18 = i7;
                        i17 = 0;
                    } else {
                        z18 = false;
                        i17 = 0;
                    }
                    int i31 = i30;
                    int i32 = z18 == vq0Var.d(i17) ? i31 + 1 : i31;
                    if (iArr2[i7] <= 0) {
                        z19 = i7;
                        i18 = z19;
                    } else {
                        i18 = i7;
                        z19 = false;
                    }
                    int i33 = i32;
                    int i34 = z19 == vq0Var.d(i18) ? i33 + 1 : i33;
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
                    boolean z26 = !this.T.d.isEmpty();
                    int i41 = i40;
                    i10 = z26 != vq0Var.d(10) ? i41 + 1 : i41;
                    z12 = x0() && !e2Var.getMessagesController().G1().b && e2Var.getMessagesController().G1().e();
                    z13 = z26;
                    if (z12 != vq0Var.d(11)) {
                        i10++;
                    }
                    if (z21 != vq0Var.d(12)) {
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
                        TransitionManager.beginDelayedTransition(vq0Var.getTabsContainer(), transitionSet);
                        vq0Var.V = vq0Var.w;
                        vq0Var.W = vq0Var.x;
                    } else {
                        iArr = iArr2;
                        z14 = z21;
                    }
                    SparseArray f10 = vq0Var.f();
                    if (i10 > 3) {
                        f10 = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (G0()) {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                        arrayList2.add(new Pair(8, org.telegram.messenger.hd.M0(2131746635, null)));
                        vq0Var.c0 = 420L;
                    } else {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                    }
                    if (i24 != 0) {
                        arrayList2.add(new Pair(8, org.telegram.messenger.hd.M0(2131746692, str)));
                    } else if ((org.telegram.messenger.m5.E(j3) || org.telegram.messenger.m5.z(j3)) && !org.telegram.messenger.m5.C(j3) && ((((userFull2 = this.h1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.g1) != null && chatFull2.stories_pinned_available) || I0())) && y0())) {
                        if (A0()) {
                            arrayList2.add(new Pair(9, org.telegram.messenger.hd.M0(2131746725, null)));
                            lr0Var = lr0Var2;
                            vq0Var.c0 = 420L;
                        } else {
                            lr0Var = lr0Var2;
                            arrayList2.add(new Pair(8, org.telegram.messenger.hd.M0(2131746635, null)));
                            if (I0()) {
                                arrayList2.add(new Pair(9, org.telegram.messenger.hd.M0(2131746725, null)));
                            }
                        }
                        if (z11) {
                            i11 = i21;
                            z17 = z14;
                        } else {
                            String M03 = org.telegram.messenger.hd.M0(2131746676, null);
                            HashMap hashMap = bi.i4.V;
                            di.l8 l8Var = wp0Var2.d;
                            Object obj2 = "";
                            if (l8Var == null) {
                                wp0Var = wp0Var2;
                                str6 = M03;
                                i11 = i21;
                                z17 = z14;
                            } else {
                                ArrayList arrayList3 = l8Var.l;
                                str6 = M03;
                                i11 = i21;
                                z17 = z14;
                                Pair pair = new Pair(Integer.valueOf(org.telegram.messenger.m10.t0), Long.valueOf(wp0Var2.c));
                                if (arrayList3.isEmpty()) {
                                    if (l8Var.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
                                        obj2 = obj;
                                    }
                                    wp0Var = wp0Var2;
                                } else {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList4 = new ArrayList();
                                    int i42 = 0;
                                    while (true) {
                                        wp0Var = wp0Var2;
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
                                        wp0Var2 = wp0Var;
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
                                        c10 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj2 = spannableStringBuilder;
                                        i14 = 2;
                                        CharSequence[] charSequenceArr = new CharSequence[i14];
                                        charSequenceArr[c10] = str6;
                                        charSequenceArr[1] = obj2;
                                        arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                        this.T1 = wp0Var.getLastEmojisHash();
                                    }
                                }
                            }
                            i14 = 2;
                            c10 = 0;
                            CharSequence[] charSequenceArr2 = new CharSequence[i14];
                            charSequenceArr2[c10] = str6;
                            charSequenceArr2[1] = obj2;
                            arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                            this.T1 = wp0Var.getLastEmojisHash();
                        }
                        if (z15) {
                            arrayList2.add(new Pair(13, org.telegram.messenger.hd.M0(2131746692, null)));
                        }
                        int i44 = 2131745402;
                        if (!I0()) {
                            if (z16) {
                                str3 = null;
                                arrayList2.add(new Pair(11, org.telegram.messenger.hd.M0(2131745907, null)));
                            } else {
                                str3 = null;
                            }
                            lr0 lr0Var3 = lr0Var;
                            if (lr0Var3.d != null) {
                                arrayList2.add(new Pair(7, org.telegram.messenger.hd.M0(2131749429, str3)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && lr0Var3.d == null) {
                                    arrayList2.add(new Pair(0, org.telegram.messenger.hd.M0(2131745406, null)));
                                } else {
                                    str4 = null;
                                    arrayList2.add(new Pair(0, org.telegram.messenger.hd.M0(2131745407, null)));
                                    if (z17) {
                                        arrayList2.add(new Pair(12, org.telegram.messenger.hd.M0(2131745893, str4)));
                                        org.telegram.messenger.np.e1().edit().putInt("savedhint", 3).apply();
                                    }
                                    if (iArr[1] <= 0) {
                                        str5 = null;
                                        arrayList2.add(new Pair(1, org.telegram.messenger.hd.M0(2131745414, null)));
                                    } else {
                                        str5 = null;
                                    }
                                    if (org.telegram.messenger.m5.C(j3)) {
                                        if (iArr[3] > 0) {
                                            arrayList2.add(new Pair(3, org.telegram.messenger.hd.M0(2131745410, str5)));
                                        }
                                        if (iArr[4] > 0) {
                                            arrayList2.add(new Pair(4, org.telegram.messenger.hd.M0(2131745405, str5)));
                                        }
                                        if (iArr[8] > 0) {
                                            arrayList2.add(new Pair(15, org.telegram.messenger.hd.M0(2131745403, str5)));
                                        }
                                    } else if (iArr[4] > 0) {
                                        arrayList2.add(new Pair(4, org.telegram.messenger.hd.M0(2131745405, str5)));
                                    }
                                    if (iArr[2] > 0) {
                                        arrayList2.add(new Pair(2, org.telegram.messenger.hd.M0(2131745402, str5)));
                                    }
                                    if (iArr[5] > 0) {
                                        arrayList2.add(new Pair(5, org.telegram.messenger.hd.M0(2131745413, str5)));
                                    }
                                    if (iArr[6] > 0) {
                                        arrayList2.add(new Pair(6, org.telegram.messenger.hd.M0(2131745412, str5)));
                                    }
                                    if (z13) {
                                        arrayList2.add(new Pair(10, org.telegram.messenger.hd.M0(i11 > 0 ? 2131745318 : 2131745314, null)));
                                    }
                                }
                            }
                            str4 = null;
                            if (z17) {
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
                            if (z13) {
                            }
                        }
                        if (vq0Var.o0) {
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
                                            M0 = org.telegram.messenger.hd.M0(2131745406, null);
                                        } else if (i45 == 1) {
                                            M0 = org.telegram.messenger.hd.M0(2131745414, null);
                                        } else if (i45 == 2) {
                                            M0 = org.telegram.messenger.hd.M0(i44, null);
                                        } else if (i45 == 3) {
                                            M0 = org.telegram.messenger.hd.M0(2131745410, null);
                                        } else if (i45 == 4) {
                                            M0 = org.telegram.messenger.hd.M0(2131745405, null);
                                        } else if (i45 != 5) {
                                            if (i45 == 8) {
                                                M02 = org.telegram.messenger.hd.M0(2131746635, null);
                                            } else if (i45 != i28) {
                                                str2 = null;
                                                arrayList2.add(new Pair(valueOf2, str2));
                                                i45++;
                                                i44 = 2131745402;
                                                i28 = 14;
                                            } else {
                                                M02 = org.telegram.messenger.hd.M0(2131746676, null);
                                            }
                                            str2 = M02;
                                            arrayList2.add(new Pair(valueOf2, str2));
                                            i45++;
                                            i44 = 2131745402;
                                            i28 = 14;
                                        } else {
                                            M0 = org.telegram.messenger.hd.M0(2131745413, null);
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
                                    this.V1 = ((Integer) ((Pair) arrayList2.get(i12)).first).intValue();
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
                    lr0Var = lr0Var2;
                    if (z11) {
                    }
                    if (z15) {
                    }
                    int i442 = 2131745402;
                    if (!I0()) {
                    }
                    if (vq0Var.o0) {
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
                this.U1 = vq0Var.o0;
                vq0Var.c();
                Y0();
                S();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z20;
        if (this.U1 == vq0Var.o0) {
        }
        if (i25 == 0) {
        }
        int i272 = i26;
        if (z25 == vq0Var.d(8)) {
        }
        if (z22 != vq0Var.d(13)) {
        }
        if (G0() != vq0Var.d(8)) {
        }
        if (z23 == vq0Var.d(14)) {
        }
        i10++;
        I0 = I0();
        int i282 = 14;
        lr0 lr0Var22 = this.d0;
        int[] iArr22 = this.a1;
        if (I0) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.U1 = vq0Var.o0;
        vq0Var.c();
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
        tr0[] tr0VarArr = this.n0;
        tr0 tr0Var = tr0VarArr[0];
        if (tr0Var == null) {
            return null;
        }
        int i7 = tr0Var.F;
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
                org.telegram.messenger.gz.B(h02);
            } else if (m0(tr0VarArr[0].F) >= 5 || J0(tr0VarArr[0].F)) {
                org.telegram.messenger.gz.F(h02);
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
            ((org.telegram.ui.ActionBar.d5) q0Var).Z(z13 && I() && (F0(closestTab) || (closestTab == 11 && x0())), z10);
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.J;
        if (d5Var != null) {
            if (z13 && I() && !A0() && v0(closestTab)) {
                z12 = true;
            }
            d5Var.Z(z12, z11);
        }
    }

    public final void R0() {
        fi.k6 k6Var;
        fi.k6 k6Var2;
        this.K1.b();
        ir0 ir0Var = this.f0;
        if (ir0Var != null && (k6Var2 = ir0Var.s) != null && k6Var2 != null) {
            k6Var2.z(ir0Var.w);
        }
        up0 up0Var = this.h0;
        if (up0Var != null && (k6Var = up0Var.s) != null && k6Var != null) {
            k6Var.z(up0Var.w);
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ws0 ws0Var = ((xs0) it.next()).c;
            fi.k6 k6Var3 = ws0Var.s;
            if (k6Var3 != null && k6Var3 != null) {
                k6Var3.z(ws0Var.w);
            }
        }
    }

    public final Boolean R1(View view, View view2) {
        if (this.r1) {
            return null;
        }
        tr0[] tr0VarArr = this.n0;
        tr0 tr0Var = tr0VarArr[0];
        if (tr0Var == null) {
            return null;
        }
        if (this.n1 && z0(tr0Var.F)) {
            return null;
        }
        int i7 = tr0VarArr[0].F;
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
                org.telegram.messenger.gz.B(h02);
            } else if (m0(tr0VarArr[0].F) >= 5 || J0(tr0VarArr[0].F)) {
                org.telegram.messenger.gz.F(h02);
            }
            F(h02);
        }
        return Boolean.valueOf(h02 != h0(z02 ? 1 : 0, h02, false));
    }

    public final void S() {
        float abs;
        tr0[] tr0VarArr = this.n0;
        tr0 tr0Var = tr0VarArr[0];
        if (tr0Var == null || tr0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        zp0 zp0Var = this.c0;
        if (zp0Var != null) {
            char c10 = (!z0(tr0Var.F) || tr0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (tr0VarArr[1].getVisibility() == 0 ? (!z0(tr0VarArr[1].F) || tr0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                zp0Var.setTranslationX(c10 != 0 ? 0.0f : tr0VarArr[0].getMeasuredWidth());
            } else {
                zp0Var.setTranslationX(tr0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(zp0Var.getTranslationX()) / zp0Var.getMeasuredWidth());
            }
            float f11 = 0.0f;
            for (int i7 = 0; i7 < tr0VarArr.length; i7++) {
                if (tr0VarArr[i7].getVisibility() == 0) {
                    dq0 dq0Var = tr0VarArr[i7].h;
                    View childAt = dq0Var.getChildCount() == 0 ? null : dq0Var.getChildAt(0);
                    f11 += Utilities.l(1.0f - (tr0VarArr[i7].getTranslationX() / tr0VarArr[i7].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - dq0Var.getPaddingTop() : dq0Var.getChildCount() == 0 ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
            }
            float l10 = Utilities.l(1.0f - ((-f11) / org.telegram.messenger.g0.N(48.0f)));
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
            zp0Var.setAlpha(l10);
            zp0Var.setScaleX(T1);
            zp0Var.setScaleY(T1);
            zp0Var.setTranslationY(this.O1 + f11);
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
        zp0 zp0Var = this.c0;
        if (zp0Var == null || !zp0Var.f) {
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
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).b(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) view).b(0, sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).f(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).e(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    ((org.telegram.ui.Cells.h2) view).c(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) view).i(sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0, true);
                }
            } else {
                fq0 fq0Var = this.u1;
                ns0[] ns0VarArr = this.w1;
                org.telegram.ui.ActionBar.e2 e2Var = this.y1;
                if (i10 == 0) {
                    ns0 ns0Var = ns0VarArr[i10];
                    int i13 = i7 - ns0Var.m;
                    if (i13 >= 0 && i13 < ns0Var.a.size()) {
                        PhotoViewer.p1().I2(null, e2Var, null);
                        PhotoViewer.p1().a2(ns0VarArr[i10].a, i13, this.m1, this.f1, this.G, fq0Var);
                    }
                } else if (i10 == 2 || i10 == 4) {
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                    }
                } else if (i10 == 5) {
                    PhotoViewer.p1().I2(null, e2Var, null);
                    int indexOf = ns0VarArr[i10].a.indexOf(gjVar);
                    if (indexOf < 0) {
                        PhotoViewer.p1().a2(org.telegram.messenger.k5.j(gjVar), 0, 0L, 0L, 0L, fq0Var);
                    } else {
                        PhotoViewer.p1().a2(ns0VarArr[i10].a, indexOf, this.m1, this.f1, this.G, fq0Var);
                    }
                } else if (i10 == 1) {
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        TLRPC.Document F0 = gjVar.F0();
                        if (g7Var.H) {
                            if (gjVar.x()) {
                                PhotoViewer.p1().I2(null, e2Var, null);
                                int indexOf2 = ns0VarArr[i10].a.indexOf(gjVar);
                                if (indexOf2 < 0) {
                                    PhotoViewer.p1().a2(org.telegram.messenger.k5.j(gjVar), 0, 0L, 0L, 0L, fq0Var);
                                    return;
                                } else {
                                    PhotoViewer.p1().a2(ns0VarArr[i10].a, indexOf2, this.m1, this.f1, this.G, fq0Var);
                                    return;
                                }
                            }
                            org.telegram.messenger.g0.s2(gjVar, e2Var.getParentActivity(), e2Var);
                        } else if (g7Var.G) {
                            e2Var.getFileLoader().f(F0);
                            g7Var.f(true);
                        } else {
                            org.telegram.messenger.gj message = g7Var.getMessage();
                            message.P = true;
                            e2Var.getFileLoader().W(F0, message, 0, 0);
                            g7Var.f(true);
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
                                    e2Var.createArticleViewer(false).L(gjVar, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                bu.N0(e2Var, gjVar, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            d1(str);
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (z0(i10)) {
                    vs0 z12 = z1(i10);
                    fi.k6 k6Var = z12 != null ? z12.s : null;
                    if (k6Var == null) {
                        return;
                    }
                    fi.i9 orCreateStoryViewer = e2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int e12 = gjVar.e1();
                    fi.b7 a10 = fi.b7.a(this.n0[0].h);
                    a10.e = new gx(k6Var, 19);
                    if ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).s1) {
                        i11 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a10.s += i11;
                    orCreateStoryViewer.I(context, e12, k6Var, a10);
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
        tr0[] tr0VarArr = this.n0;
        if (!z10) {
            if (Math.abs(tr0VarArr[1].getTranslationX()) < 1.0f) {
                tr0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.k1 ? -1 : 1));
                tr0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.i1;
                if (animatorSet != null) {
                }
                this.j1 = false;
            }
            Z0(getTabProgress());
            return this.j1;
        }
        if (Math.abs(tr0VarArr[0].getTranslationX()) < 1.0f) {
            tr0VarArr[0].setTranslationX(0.0f);
            tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth() * (this.k1 ? 1 : -1));
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
        zp0 zp0Var;
        final TL_stories.StoryItem storyItem;
        ir0 ir0Var;
        fi.k6 k6Var;
        final int i10 = 0;
        if (!this.F1) {
            org.telegram.ui.ActionBar.e2 e2Var = this.y1;
            if (e2Var.getParentActivity() != null && gjVar != null && ((zp0Var = this.c0) == null || !zp0Var.f)) {
                org.telegram.messenger.g0.v1(e2Var.getParentActivity().getCurrentFocus());
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
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).b(i7, true, true);
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
                        q1(true);
                    }
                    P0(sparseArrayArr[0]);
                    G1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.n7) {
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                    n7Var.k(n7Var.n, n7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = gjVar.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean J0 = J0(getClosestTab());
                    m60 I = m60.I(e2Var, view);
                    m60 J = I.J();
                    J.c(R.drawable.ic_ab_back, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.fq0(I, 27), false);
                    J.k();
                    m60.f(J, getStoriesController().B(j3, true), hashSet, true, new yf(this, storyItem2, I, 21), new bi.o1(this, hashSet, storyItem2, I, 11));
                    I.c(R.drawable.menu_album_add, org.telegram.messenger.hd.M0(2131744805, null), new bi.n3(I, J, 10), false);
                    I.k();
                    I.c(R.drawable.msg_select, org.telegram.messenger.hd.M0(2131744789, null), new ci.p0(this, gjVar, view, i7, 28), false);
                    final int i14 = 3;
                    if (J0) {
                        int w12 = w1(getClosestTab());
                        String w10 = getStoriesController().w(w12, j3);
                        I.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131744790, null), new ap0(this, w12, i10), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, org.telegram.messenger.hd.M0(2131744791, null), new ci.p0((Object) this, w12, (Object) storyItem, w10, 29), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (ir0Var = this.f0) != null && (k6Var = ir0Var.s) != null) {
                            if (k6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, org.telegram.messenger.hd.M0(2131744787, null), new Runnable() { // from class: org.telegram.ui.Components.zo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        ys0 ys0Var = this;
                                        switch (i15) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), ys0Var.I1);
                                                String M0 = org.telegram.messenger.hd.M0(2131751487, null);
                                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                                t1Var.S = M0;
                                                t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new jp0(ys0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(11));
                                                t1Var.show();
                                                t1Var.i();
                                                break;
                                            case 1:
                                                ys0Var.getClass();
                                                ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                ys0Var.getClass();
                                                ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                ys0.h(ys0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i15 = 2;
                                I.c(R.drawable.chats_pin, org.telegram.messenger.hd.M0(2131744792, null), new Runnable() { // from class: org.telegram.ui.Components.zo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i152 = i15;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        ys0 ys0Var = this;
                                        switch (i152) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), ys0Var.I1);
                                                String M0 = org.telegram.messenger.hd.M0(2131751487, null);
                                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                                t1Var.S = M0;
                                                t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new jp0(ys0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(11));
                                                t1Var.show();
                                                t1Var.i();
                                                break;
                                            case 1:
                                                ys0Var.getClass();
                                                ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                ys0Var.getClass();
                                                ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                ys0.h(ys0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131744797, null), new Runnable() { // from class: org.telegram.ui.Components.zo0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i152 = i14;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                ys0 ys0Var = this;
                                switch (i152) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), ys0Var.I1);
                                        String M0 = org.telegram.messenger.hd.M0(2131751487, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                        t1Var.S = M0;
                                        t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new jp0(ys0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(11));
                                        t1Var.show();
                                        t1Var.i();
                                        break;
                                    case 1:
                                        ys0Var.getClass();
                                        ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        ys0Var.getClass();
                                        ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        ys0.h(ys0Var, storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, null), new Runnable() { // from class: org.telegram.ui.Components.zo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i152 = i10;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            ys0 ys0Var = this;
                            switch (i152) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), ys0Var.I1);
                                    String M0 = org.telegram.messenger.hd.M0(2131751487, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = M0;
                                    t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new jp0(ys0Var, storyItem3));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(11));
                                    t1Var.show();
                                    t1Var.i();
                                    break;
                                case 1:
                                    ys0Var.getClass();
                                    ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    ys0Var.getClass();
                                    ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    ys0.h(ys0Var, storyItem3);
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
        vr vrVar = this.S0;
        if (vrVar != null) {
            vrVar.setTranslationY(this.O1);
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
        vp0 vp0Var = this.a0;
        if (vp0Var != null) {
            vp0Var.h();
            vp0Var.j();
        }
        q1(false);
        L1(z10);
        js0 js0Var = this.U;
        if (js0Var != null) {
            js0Var.x.clear();
        }
        return true;
    }

    public final void V0(float f10) {
        tr0[] tr0VarArr = this.n0;
        if (f10 != 1.0f || tr0VarArr[1].getVisibility() == 0) {
            if (this.k1) {
                tr0VarArr[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth() - (tr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                tr0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f10);
                tr0VarArr[1].setTranslationX((tr0VarArr[0].getMeasuredWidth() * f10) - tr0VarArr[0].getMeasuredWidth());
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
                tr0 tr0Var = tr0VarArr[0];
                tr0VarArr[0] = tr0VarArr[1];
                tr0VarArr[1] = tr0Var;
                tr0Var.setVisibility(8);
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
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        if (w4Var != null) {
            q0Var = w4Var.o().b(i7, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.j6.y8;
            org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, s02, s0(i12), false, null);
            q0Var2.setIcon(i10);
            q0Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(q0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.Q0.add(q0Var2);
            fh0 iconView = q0Var2.getIconView();
            org.telegram.ui.ActionBar.e6 e6Var = this.I1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.q6.s(q0Var2.getIconView(), i12, e6Var, PorterDuff.Mode.SRC_IN);
            }
            if (q0Var2.getBackground() != null) {
                Drawable background = q0Var2.getBackground();
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
                q0Var2.setBackground(background);
                org.telegram.ui.ActionBar.q6.j(q0Var2, background, null, M, e6Var);
            }
            q0Var = q0Var2;
        }
        q0Var.setContentDescription(str);
        q0Var.setOnClickListener(new ci.q(this, i7, 18));
        return q0Var;
    }

    public boolean Y() {
        return this instanceof r20;
    }

    public void Y0() {
        boolean z10 = I0() || A0();
        ts0 ts0Var = this.h0.x;
        if (ts0Var != null) {
            ts0Var.b(z10 && getClosestTab() == 9);
        }
        ts0 ts0Var2 = this.f0.x;
        if (ts0Var2 != null) {
            ts0Var2.b(z10 && getClosestTab() == 8);
        }
        for (xs0 xs0Var : this.m2.values()) {
            ws0 ws0Var = xs0Var.c;
            if (ws0Var.s != null) {
                ws0Var.x.b(z10 && getClosestTab() == xs0Var.a);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.q0;
        if (q0Var != null) {
            sq0 sq0Var = this.M0;
            q0Var.setSearchFieldHint(org.telegram.messenger.hd.M0((sq0Var != null && sq0Var.a() && getSelectedTab() == 11) ? 2131745868 : 2131745836, null));
        }
        S();
        R(true, true);
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        tr0[] tr0VarArr = this.n0;
        motionEvent.offsetLocation(x10 - tr0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - tr0VarArr[0].getY()) - tr0VarArr[0].h.getFastScroll().getY());
        return tr0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void Z0(float f10) {
        Q0();
    }

    public final boolean a0(int i7) {
        ns0[] ns0VarArr = this.x1.n;
        if (ns0VarArr == null) {
            return false;
        }
        ns0[] ns0VarArr2 = this.w1;
        if (i7 == 0) {
            ns0 ns0Var = ns0VarArr2[i7];
            if (!ns0Var.h) {
                int[] iArr = ns0Var.f;
                int[] iArr2 = ns0VarArr[i7].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ns0VarArr2[i7].f;
            int[] iArr4 = ns0VarArr[i7].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ns0VarArr2[i7].a.addAll(ns0VarArr[i7].a);
        ns0VarArr2[i7].c.addAll(ns0VarArr[i7].c);
        for (Map.Entry entry : ns0VarArr[i7].d.entrySet()) {
            ns0VarArr2[i7].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            ns0VarArr2[i7].b[i10] = ns0VarArr[i7].b[i10].clone();
            ns0 ns0Var2 = ns0VarArr2[i7];
            int[] iArr5 = ns0Var2.j;
            ns0 ns0Var3 = ns0VarArr[i7];
            iArr5[i10] = ns0Var3.j[i10];
            ns0Var2.i[i10] = ns0Var3.i[i10];
        }
        ns0VarArr2[i7].e.addAll(ns0VarArr[i7].e);
        return !ns0VarArr[i7].a.isEmpty();
    }

    public final void a1(org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7) {
        new org.telegram.ui.z11(e2Var, j3, this.p1[1], new di.h3(this, j3, i7)).show();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.nd));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(int i7, xr0 xr0Var) {
        String str;
        xr0 xr0Var2;
        xr0 xr0Var3;
        boolean z10;
        fi.k6 k6Var;
        TLRPC.Chat M0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        vp0 vp0Var;
        vp0 vp0Var2;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.z0 z0Var;
        boolean z11;
        xr0 xr0Var4;
        org.telegram.ui.ActionBar.z0 z0Var2;
        org.telegram.ui.ActionBar.z0 z0Var3;
        xs0 y12;
        boolean z02 = z0(i7);
        org.telegram.ui.ActionBar.e2 e2Var = this.y1;
        int currentAccount = e2Var.getCurrentAccount();
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(currentAccount);
        long j3 = this.m1;
        TLRPC.User a22 = s12.a2(Long.valueOf(j3));
        boolean i12 = getStoriesController().i(j3);
        int i13 = 3;
        int i14 = 4;
        final int i15 = 1;
        if (J0(i7) && i12 && (y12 = y1(i7)) != null) {
            int i16 = y12.b;
            xr0Var.n0(R.drawable.menu_add_stories, new ap0(this, i16, i15), org.telegram.messenger.hd.M0(2131744798, null), false, true);
            B(xr0Var, e2Var, this.m1, i16);
            xr0Var.n0(R.drawable.tabs_reorder, new ap0(this, i16, i13), org.telegram.messenger.hd.M0(2131744790, null), false, true);
            xr0Var.n0(R.drawable.msg_delete, new ap0(this, i16, i14), org.telegram.messenger.hd.M0(2131744796, null), true, true);
            xr0Var.H();
            C(xr0Var);
            return true;
        }
        int i17 = 9;
        final int i18 = 0;
        if (i7 == 14) {
            wp0 wp0Var = this.b0;
            if (wp0Var != null) {
                bi.c4 currentPage = wp0Var.getCurrentPage();
                di.l8 l8Var = currentPage == null ? null : currentPage.e;
                if (l8Var != null) {
                    long j10 = wp0Var.c;
                    int i19 = wp0Var.b;
                    boolean w10 = j10 == org.telegram.messenger.m10.i(i19).e() ? true : j10 >= 0 ? false : org.telegram.messenger.t3.w(5, org.telegram.messenger.np.s1(i19).M0(Long.valueOf(-j10)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (l8Var.c) {
                        i11 = 11;
                        z0Var = null;
                        z11 = false;
                    } else {
                        i11 = 11;
                        z0Var = xr0Var.n0(R.drawable.menu_sort_value, new hh0(i17, l8Var, runnableArr), org.telegram.messenger.hd.M0(2131750197, null), false, false);
                        z11 = true;
                    }
                    if (wp0Var.b()) {
                        xr0Var.n0(R.drawable.menu_folder_add, new wo0(this, i11), org.telegram.messenger.hd.M0(2131750098, null), false, true);
                        z11 = true;
                    }
                    if (wp0Var.e.h()) {
                        if (!l8Var.i().isEmpty() || currentPage.d) {
                            xr0Var.n0(R.drawable.tabs_reorder, new wo0(this, 12), org.telegram.messenger.hd.M0(2131750033, null), false, true);
                            xr0Var4 = xr0Var;
                        } else {
                            xr0Var4 = xr0Var;
                        }
                        z11 = true;
                    } else {
                        xr0Var4 = xr0Var;
                    }
                    if (z11) {
                        xr0Var4.H();
                    }
                    org.telegram.ui.ActionBar.z0 J = xr0Var4.J(org.telegram.messenger.hd.M0(2131750195, null));
                    org.telegram.ui.ActionBar.z0 J2 = xr0Var4.J(org.telegram.messenger.hd.M0(2131750199, null));
                    org.telegram.ui.ActionBar.z0 J3 = xr0Var4.J(org.telegram.messenger.hd.M0(2131750194, null));
                    org.telegram.ui.ActionBar.z0 J4 = xr0Var4.J(org.telegram.messenger.hd.M0(2131750196, null));
                    if (w10) {
                        xr0Var4.H();
                        z0Var2 = xr0Var4.J(org.telegram.messenger.hd.M0(2131750201, null));
                        z0Var3 = xr0Var4.J(org.telegram.messenger.hd.M0(2131750200, null));
                    } else {
                        z0Var2 = null;
                        z0Var3 = null;
                    }
                    di.l8 l8Var2 = l8Var;
                    bi.c6 c6Var = new bi.c6(z0Var, l8Var2, J, J2, J3, J4, w10, z0Var2, z0Var3);
                    org.telegram.ui.ActionBar.z0 z0Var4 = z0Var2;
                    org.telegram.ui.ActionBar.z0 z0Var5 = z0Var3;
                    runnableArr[0] = c6Var;
                    c6Var.run();
                    bi.i4.j(J, l8Var2, runnableArr[0], 1);
                    bi.i4.j(J2, l8Var2, runnableArr[0], 2);
                    bi.i4.j(J3, l8Var2, runnableArr[0], 4);
                    bi.i4.j(J4, l8Var2, runnableArr[0], 8);
                    if (w10) {
                        bi.i4.j(z0Var4, l8Var2, runnableArr[0], 256);
                        bi.i4.j(z0Var5, l8Var2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i7 == 13 && a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit && (vp0Var = this.a0) != null) {
            int itemsCount = vp0Var.getItemsCount();
            if (itemsCount < e2Var.getMessagesController().U5) {
                vp0Var2 = vp0Var;
                i10 = 5;
                xr0Var.n0(R.drawable.msg_addbot, new wo0(this, 4), org.telegram.messenger.hd.M0(2131746715, null), false, true);
            } else {
                vp0Var2 = vp0Var;
                i10 = 5;
            }
            if (itemsCount > 1 && !vp0Var2.d()) {
                xr0Var.n0(R.drawable.tabs_reorder, new wo0(this, i10), org.telegram.messenger.hd.M0(2131746690, null), false, true);
            }
            if (itemsCount > 0) {
                xr0Var.n0(R.drawable.msg_select, new wo0(this, 6), org.telegram.messenger.hd.M0(vp0Var2.d() ? 2131746688 : 2131746689, null), false, true);
            }
            if (!TextUtils.isEmpty(vp0Var2.getCurrentLang())) {
                xr0Var.n0(R.drawable.msg_delete, new wo0(this, 7), org.telegram.messenger.hd.a0(null, null, 2131746691, p21.O0(vp0Var2.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i7 == 11) {
                xr0Var.n0(R.drawable.msg_discussion, new wo0(this, 8), org.telegram.messenger.hd.M0(2131745864, null), false, true);
                xr0Var.H();
                xr0Var.n0(R.drawable.msg_home, new wo0(this, i17), org.telegram.messenger.hd.M0(2131754390, null), false, true);
                xr0Var.n0(R.drawable.msg_delete, new wo0(this, 10), org.telegram.messenger.hd.M0(2131751590, null), false, true);
                return true;
            }
            if ((i7 == 8 || J0(i7)) && i12) {
                str = null;
                xr0Var2 = xr0Var;
                xr0Var2.n0(R.drawable.menu_album_add, new wo0(this, 2), org.telegram.messenger.hd.M0(2131744807, null), false, true);
                xr0Var2.H();
            } else {
                xr0Var2 = xr0Var;
                str = null;
            }
            C(xr0Var2);
            if (!org.telegram.messenger.m5.C(j3) && (a22 == null || !a22.bot)) {
                xr0Var2.n0(R.drawable.msg_calendar2, new ap0(this, i7, 2), org.telegram.messenger.hd.M0(2131752642, str), false, true);
                if (this.g1 == null || I0() || (M0 = org.telegram.messenger.np.s1(currentAccount).M0(Long.valueOf(this.g1.id))) == null || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    xr0Var3 = xr0Var;
                } else {
                    xr0Var3 = xr0Var;
                    xr0Var3.n0(R.drawable.msg_archive, new wo0(this, 3), org.telegram.messenger.hd.M0(2131747810, str), false, true);
                }
                ns0[] ns0VarArr = this.w1;
                if (!z02) {
                    ns0 ns0Var = ns0VarArr[0];
                    if (!ns0Var.w || !ns0Var.v) {
                        boolean[] zArr = ns0Var.i;
                        if (zArr[0] && zArr[1] && ns0Var.l) {
                            z10 = false;
                            if (z10) {
                                xr0Var3.H();
                                final org.telegram.ui.ActionBar.z0 J5 = xr0Var3.J(org.telegram.messenger.hd.M0(2131748653, str));
                                final org.telegram.ui.ActionBar.z0 J6 = xr0Var3.J(org.telegram.messenger.hd.M0(2131748652, str));
                                if (!z02) {
                                    int i20 = ns0VarArr[0].q;
                                    J5.setChecked(i20 == 0 || i20 == 1);
                                    int i21 = ns0VarArr[0].q;
                                    J6.setChecked(i21 == 0 || i21 == 2);
                                    J5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hp0
                                        public final /* synthetic */ ys0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i18) {
                                                case 0:
                                                    final int i22 = 1;
                                                    final ys0 ys0Var = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var6 = J5;
                                                    final org.telegram.ui.ActionBar.z0 z0Var7 = J6;
                                                    ys0Var.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.kp0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    ys0 ys0Var2 = ys0Var;
                                                                    ys0Var2.w1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    ys0Var2.M();
                                                                    break;
                                                                default:
                                                                    ys0 ys0Var3 = ys0Var;
                                                                    ys0Var3.w1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    ys0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i23 = 0;
                                                    final ys0 ys0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var8 = J6;
                                                    final org.telegram.ui.ActionBar.z0 z0Var9 = J5;
                                                    ys0Var2.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.kp0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i23) {
                                                                case 0:
                                                                    ys0 ys0Var22 = ys0Var2;
                                                                    ys0Var22.w1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    ys0Var22.M();
                                                                    break;
                                                                default:
                                                                    ys0 ys0Var3 = ys0Var2;
                                                                    ys0Var3.w1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    ys0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    J6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hp0
                                        public final /* synthetic */ ys0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i15) {
                                                case 0:
                                                    final int i22 = 1;
                                                    final ys0 ys0Var = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var6 = J6;
                                                    final org.telegram.ui.ActionBar.z0 z0Var7 = J5;
                                                    ys0Var.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.kp0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i22) {
                                                                case 0:
                                                                    ys0 ys0Var22 = ys0Var;
                                                                    ys0Var22.w1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 1;
                                                                    ys0Var22.M();
                                                                    break;
                                                                default:
                                                                    ys0 ys0Var3 = ys0Var;
                                                                    ys0Var3.w1[0].q = (z0Var6.getCheckView().a.q && z0Var7.getCheckView().a.q) ? 0 : 2;
                                                                    ys0Var3.M();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i23 = 0;
                                                    final ys0 ys0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.z0 z0Var8 = J5;
                                                    final org.telegram.ui.ActionBar.z0 z0Var9 = J6;
                                                    ys0Var2.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.kp0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i23) {
                                                                case 0:
                                                                    ys0 ys0Var22 = ys0Var2;
                                                                    ys0Var22.w1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 1;
                                                                    ys0Var22.M();
                                                                    break;
                                                                default:
                                                                    ys0 ys0Var3 = ys0Var2;
                                                                    ys0Var3.w1[0].q = (z0Var8.getCheckView().a.q && z0Var9.getCheckView().a.q) ? 0 : 2;
                                                                    ys0Var3.M();
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
                                final vs0 z12 = z1(i7);
                                if (z12 != null && (k6Var = z12.s) != null) {
                                    J5.setChecked(k6Var.n);
                                    J6.setChecked(z12.s.o);
                                }
                                final int i22 = 0;
                                J5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gp0
                                    public final /* synthetic */ ys0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i22) {
                                            case 0:
                                                final int i23 = 1;
                                                final vs0 vs0Var = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var6 = J5;
                                                final org.telegram.ui.ActionBar.z0 z0Var7 = J6;
                                                this.b.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.k6 k6Var2;
                                                        fi.k6 k6Var3;
                                                        switch (i23) {
                                                            case 0:
                                                                vs0 vs0Var2 = vs0Var;
                                                                if (vs0Var2 != null && (k6Var2 = vs0Var2.s) != null) {
                                                                    boolean z13 = z0Var6.getCheckView().a.q;
                                                                    boolean z14 = z0Var7.getCheckView().a.q;
                                                                    k6Var2.n = z13;
                                                                    k6Var2.o = z14;
                                                                    k6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                vs0 vs0Var3 = vs0Var;
                                                                if (vs0Var3 != null && (k6Var3 = vs0Var3.s) != null) {
                                                                    boolean z15 = z0Var6.getCheckView().a.q;
                                                                    boolean z16 = z0Var7.getCheckView().a.q;
                                                                    k6Var3.n = z15;
                                                                    k6Var3.o = z16;
                                                                    k6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i24 = 0;
                                                final vs0 vs0Var2 = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var8 = J6;
                                                final org.telegram.ui.ActionBar.z0 z0Var9 = J5;
                                                this.b.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.k6 k6Var2;
                                                        fi.k6 k6Var3;
                                                        switch (i24) {
                                                            case 0:
                                                                vs0 vs0Var22 = vs0Var2;
                                                                if (vs0Var22 != null && (k6Var2 = vs0Var22.s) != null) {
                                                                    boolean z13 = z0Var8.getCheckView().a.q;
                                                                    boolean z14 = z0Var9.getCheckView().a.q;
                                                                    k6Var2.n = z13;
                                                                    k6Var2.o = z14;
                                                                    k6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                vs0 vs0Var3 = vs0Var2;
                                                                if (vs0Var3 != null && (k6Var3 = vs0Var3.s) != null) {
                                                                    boolean z15 = z0Var8.getCheckView().a.q;
                                                                    boolean z16 = z0Var9.getCheckView().a.q;
                                                                    k6Var3.n = z15;
                                                                    k6Var3.o = z16;
                                                                    k6Var3.d(true);
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
                                J6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gp0
                                    public final /* synthetic */ ys0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i23) {
                                            case 0:
                                                final int i232 = 1;
                                                final vs0 vs0Var = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var6 = J6;
                                                final org.telegram.ui.ActionBar.z0 z0Var7 = J5;
                                                this.b.C1(z0Var6, z0Var7, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.k6 k6Var2;
                                                        fi.k6 k6Var3;
                                                        switch (i232) {
                                                            case 0:
                                                                vs0 vs0Var22 = vs0Var;
                                                                if (vs0Var22 != null && (k6Var2 = vs0Var22.s) != null) {
                                                                    boolean z13 = z0Var6.getCheckView().a.q;
                                                                    boolean z14 = z0Var7.getCheckView().a.q;
                                                                    k6Var2.n = z13;
                                                                    k6Var2.o = z14;
                                                                    k6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                vs0 vs0Var3 = vs0Var;
                                                                if (vs0Var3 != null && (k6Var3 = vs0Var3.s) != null) {
                                                                    boolean z15 = z0Var6.getCheckView().a.q;
                                                                    boolean z16 = z0Var7.getCheckView().a.q;
                                                                    k6Var3.n = z15;
                                                                    k6Var3.o = z16;
                                                                    k6Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i24 = 0;
                                                final vs0 vs0Var2 = z12;
                                                final org.telegram.ui.ActionBar.z0 z0Var8 = J5;
                                                final org.telegram.ui.ActionBar.z0 z0Var9 = J6;
                                                this.b.C1(z0Var9, z0Var8, new Runnable() { // from class: org.telegram.ui.Components.ip0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        fi.k6 k6Var2;
                                                        fi.k6 k6Var3;
                                                        switch (i24) {
                                                            case 0:
                                                                vs0 vs0Var22 = vs0Var2;
                                                                if (vs0Var22 != null && (k6Var2 = vs0Var22.s) != null) {
                                                                    boolean z13 = z0Var8.getCheckView().a.q;
                                                                    boolean z14 = z0Var9.getCheckView().a.q;
                                                                    k6Var2.n = z13;
                                                                    k6Var2.o = z14;
                                                                    k6Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                vs0 vs0Var3 = vs0Var2;
                                                                if (vs0Var3 != null && (k6Var3 = vs0Var3.s) != null) {
                                                                    boolean z15 = z0Var8.getCheckView().a.q;
                                                                    boolean z16 = z0Var9.getCheckView().a.q;
                                                                    k6Var3.n = z15;
                                                                    k6Var3.o = z16;
                                                                    k6Var3.d(true);
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

    public final void b1(org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7) {
        t4.s0(e2Var, org.telegram.messenger.hd.M0(2131751598, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744795, getStoriesController().w(i7, j3))), org.telegram.messenger.hd.M0(2131751598, null), true, new di.y8(this, j3, i7, 8));
    }

    public final void c0(int i7, uj0 uj0Var, boolean z10) {
        ArrayList arrayList = this.w1[i7].e;
        int L0 = ((v4.b0) uj0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            yr0 yr0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((yr0) arrayList.get(i10)).b) {
                        yr0Var = (yr0) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (yr0Var == null) {
                    yr0Var = (yr0) i5.c.h(1, arrayList);
                }
            }
            if (yr0Var != null) {
                L0(i7, yr0Var.d, yr0Var.b + 1, z10);
            }
        }
    }

    public final void c1(org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7) {
        String w10 = getStoriesController().w(i7, j3);
        Context context = e2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
        c4.n nVar = new c4.n(this, j3, i7, 5);
        Pattern pattern = t4.a;
        t4.O(context, e2Var, org.telegram.messenger.hd.M0(2131744782, null), org.telegram.messenger.hd.M0(2131744781, null), org.telegram.messenger.hd.M0(2131744780, null), w10, 12, org.telegram.messenger.hd.M0(2131746278, null), resourceProvider, nVar);
    }

    public final void d0() {
        tr0[] tr0VarArr;
        tr0 tr0Var;
        int i7;
        v4.h0 adapter;
        if (this.r1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                tr0VarArr = this.n0;
                if (i11 >= tr0VarArr.length) {
                    tr0Var = null;
                    break;
                }
                tr0Var = tr0VarArr[i11];
                if (tr0Var.F == this.s1) {
                    break;
                } else {
                    i11++;
                }
            }
            if (tr0Var != null) {
                boolean z02 = z0(tr0Var.F);
                float f10 = this.q1;
                ns0[] ns0VarArr = this.w1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.r1 = false;
                        if (this.s1 == 0) {
                            ns0VarArr[0].g(false);
                        }
                        tr0Var.n.setVisibility(8);
                        tr0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f10 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new uq0(this, tr0Var, i10));
                    ofFloat.addListener(new org.telegram.ui.ji(this, z10, z02 ? 1 : 0, tr0Var));
                    ofFloat.setInterpolator(er.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.r1 = false;
                int i12 = this.t1;
                int[] iArr = this.p1;
                iArr[z02 ? 1 : 0] = i12;
                if (!z02) {
                    org.telegram.messenger.gz.B(i12);
                } else if (m0(tr0Var.F) >= 5) {
                    org.telegram.messenger.gz.F(this.t1);
                }
                for (int i13 = 0; i13 < tr0VarArr.length; i13++) {
                    tr0 tr0Var2 = tr0VarArr[i13];
                    if (tr0Var2 != null && tr0Var2.h != null && (((i7 = tr0Var2.F) == 0 || z0(i7)) && (adapter = tr0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            ns0VarArr[0].g(false);
                        }
                        tr0VarArr[i13].n.setVisibility(8);
                        tr0VarArr[i13].x.y1(iArr[z02 ? 1 : 0]);
                        tr0VarArr[i13].h.a0();
                        tr0VarArr[i13].h.invalidate();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.a4(tr0VarArr[i13].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    j1();
                    return;
                }
                while (i10 < tr0VarArr.length) {
                    tr0 tr0Var3 = tr0VarArr[i10];
                    if (tr0Var3.F == this.s1) {
                        View m10 = tr0Var3.r.m(this.s);
                        if (m10 != null) {
                            this.w = m10.getTop();
                        }
                        tr0 tr0Var4 = tr0VarArr[i10];
                        tr0Var4.x.h1(this.s, (-tr0Var4.h.getPaddingTop()) + this.w);
                    }
                    i10++;
                }
            }
        }
    }

    public final void d1(String str) {
        boolean I3 = org.telegram.messenger.g0.I3(str);
        org.telegram.ui.ActionBar.e2 e2Var = this.y1;
        if (I3) {
            t4.n0(e2Var, str, true, true);
        } else {
            vf.c.t(e2Var.getParentActivity(), str);
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
    @Override // org.telegram.messenger.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        dq0 dq0Var;
        org.telegram.messenger.gj gjVar;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i11;
        tj0 tj0Var;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int size;
        int i14;
        boolean z12;
        dq0 dq0Var2;
        int i15;
        int i16;
        dq0 dq0Var3;
        int i17 = org.telegram.messenger.ns.V;
        tj0 tj0Var2 = this.R;
        tj0 tj0Var3 = this.P;
        ms0 ms0Var = this.M;
        tj0 tj0Var4 = this.O;
        tj0 tj0Var5 = this.N;
        org.telegram.ui.ActionBar.e2 e2Var = this.y1;
        hs0 hs0Var = this.Q;
        fr0 fr0Var = this.K;
        long j3 = this.m1;
        tr0[] tr0VarArr = this.n0;
        ns0[] ns0VarArr = this.w1;
        if (i7 == i17) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != e2Var.getClassGuid() || intValue2 != ns0VarArr[intValue3].p) {
                if (this.x1 == null || !ns0VarArr[intValue3].a.isEmpty() || ns0VarArr[intValue3].o || !a0(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    tj0Var2 = fr0Var;
                } else if (intValue3 == 1) {
                    tj0Var2 = tj0Var5;
                } else if (intValue3 == 2) {
                    tj0Var2 = tj0Var4;
                } else if (intValue3 == 3) {
                    tj0Var2 = ms0Var;
                } else if (intValue3 == 4) {
                    tj0Var2 = tj0Var3;
                } else if (intValue3 != 5) {
                    tj0Var2 = intValue3 == 15 ? hs0Var : null;
                }
                if (tj0Var2 != null) {
                    for (int i18 = 0; i18 < tr0VarArr.length; i18++) {
                        tr0 tr0Var = tr0VarArr[i18];
                        if (tr0Var != null && (dq0Var2 = tr0Var.h) != null && dq0Var2.getAdapter() == tj0Var2) {
                            tr0VarArr[i18].h.C0();
                        }
                    }
                    tj0Var2.f();
                }
                this.e1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean C = org.telegram.messenger.m5.C(j3);
            int i19 = longValue == j3 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                ns0VarArr[intValue3].f[i19] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i15 = intValue3;
                tj0Var2 = fr0Var;
            } else if (intValue3 == 1) {
                i15 = intValue3;
                tj0Var2 = tj0Var5;
            } else if (intValue3 == 2) {
                i15 = intValue3;
                tj0Var2 = tj0Var4;
            } else if (intValue3 == 3) {
                i15 = intValue3;
                tj0Var2 = ms0Var;
            } else if (intValue3 == 4) {
                i15 = intValue3;
                tj0Var2 = tj0Var3;
            } else if (intValue3 == 5) {
                i15 = intValue3;
            } else if (intValue3 == 15) {
                tj0Var2 = hs0Var;
                i15 = 8;
            } else {
                i15 = intValue3;
                tj0Var2 = null;
            }
            int size2 = ns0VarArr[i15].a.size();
            if (tj0Var2 != null) {
                i16 = tj0Var2.b();
                if (tj0Var2 instanceof pj0) {
                    ((pj0) tj0Var2).L();
                }
            } else {
                i16 = 0;
            }
            ns0VarArr[i15].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(size3);
                    if (ns0VarArr[i15].a(gjVar2, i19, r13, C)) {
                        sparseBooleanArray.put(gjVar2.e1(), r13);
                        ns0 ns0Var = ns0VarArr[i15];
                        int i20 = ns0Var.m - r13;
                        ns0Var.m = i20;
                        if (i20 < 0) {
                            ns0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                ns0VarArr[i15].l = ((Boolean) objArr[5]).booleanValue();
                ns0 ns0Var2 = ns0VarArr[i15];
                if (ns0Var2.l) {
                    ns0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i21);
                    if (ns0VarArr[i15].a(gjVar3, i19, r12, C)) {
                        sparseBooleanArray.put(gjVar3.e1(), true);
                        ns0 ns0Var3 = ns0VarArr[i15];
                        int i22 = ns0Var3.n - 1;
                        ns0Var3.n = i22;
                        if (i22 < 0) {
                            ns0Var3.n = r12;
                        }
                    }
                    i21++;
                    r12 = 0;
                }
                ns0 ns0Var4 = ns0VarArr[i15];
                if (ns0Var4.o && ns0Var4.a.size() > 0) {
                    ns0 ns0Var5 = ns0VarArr[i15];
                    ns0Var5.k = ((org.telegram.messenger.gj) ns0Var5.a.get(0)).e1();
                }
                ns0VarArr[i15].i[i19] = ((Boolean) objArr[5]).booleanValue();
                ns0 ns0Var6 = ns0VarArr[i15];
                if (ns0Var6.i[i19]) {
                    int size4 = ns0Var6.b[i19].size();
                    if (i19 == 0) {
                        size4 += ns0VarArr[i15].m;
                    }
                    ns0VarArr[i15].f[i19] = size4;
                }
            }
            if (!booleanValue && i19 == 0) {
                ns0 ns0Var7 = ns0VarArr[i15];
                if (ns0Var7.i[i19] && this.f1 != 0) {
                    ns0Var7.g = true;
                    e2Var.getMediaDataController().N0(this.f1, 50, ns0VarArr[i15].j[1], 0, i15, this.G, 1, e2Var.getClassGuid(), ns0VarArr[i15].p, null, null);
                }
            }
            int i23 = i15;
            if (tj0Var2 != null) {
                sr0 sr0Var = null;
                for (int i24 = 0; i24 < tr0VarArr.length; i24++) {
                    tr0 tr0Var2 = tr0VarArr[i24];
                    if (tr0Var2 != null && (dq0Var3 = tr0Var2.h) != null && dq0Var3.getAdapter() == tj0Var2) {
                        sr0 sr0Var2 = tr0VarArr[i24].h;
                        sr0Var2.C0();
                        sr0Var = sr0Var2;
                    }
                }
                int b10 = tj0Var2.b();
                if (tj0Var2 != fr0Var) {
                    try {
                        tj0Var2.f();
                    } catch (Throwable unused) {
                    }
                } else if (fr0Var.b() == i16) {
                    org.telegram.messenger.g0.a4(sr0Var);
                } else {
                    fr0Var.f();
                }
                if (!ns0VarArr[i23].a.isEmpty() || ns0VarArr[i23].g) {
                    if (sr0Var != null && (tj0Var2 == fr0Var || b10 >= i16)) {
                        D(sr0Var, i16, sparseBooleanArray);
                    }
                } else if (sr0Var != null) {
                    D(sr0Var, i16, sparseBooleanArray);
                }
                if (sr0Var != null && !ns0VarArr[i23].o) {
                    if (size2 == 0) {
                        for (int i25 = 0; i25 < 2; i25++) {
                            if (tr0VarArr[i25].F == 0) {
                                ((v4.b0) sr0Var.getLayoutManager()).h1(fr0Var.L(0), 0);
                            }
                        }
                    } else {
                        j1();
                    }
                }
            }
            ns0 ns0Var8 = ns0VarArr[i23];
            if (ns0Var8.o) {
                if (ns0Var8.a.size() == 0) {
                    N0(i23);
                } else {
                    ns0VarArr[i23].o = false;
                }
            }
            this.e1 = true;
            return;
        }
        if (i7 == org.telegram.messenger.ns.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat M0 = org.telegram.messenger.m5.z(j3) ? e2Var.getMessagesController().M0(Long.valueOf(-j3)) : null;
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
                        fr0 fr0Var2 = fr0Var;
                        int i27 = 0;
                        while (i27 < ns0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (ns0VarArr[i27].b(((Integer) arrayList2.get(i14)).intValue(), i13) != null) {
                                i26 = i27;
                                z12 = true;
                            }
                            i27++;
                            arrayList2 = arrayList3;
                        }
                        i14++;
                        fr0Var = fr0Var2;
                    }
                    fr0 fr0Var3 = fr0Var;
                    if (z12) {
                        this.e1 = true;
                        if (fr0Var3 != null) {
                            fr0Var3.f();
                        }
                        if (tj0Var5 != null) {
                            tj0Var5.f();
                        }
                        if (tj0Var4 != null) {
                            tj0Var4.f();
                        }
                        if (ms0Var != null) {
                            ms0Var.X(false);
                        }
                        if (tj0Var3 != null) {
                            tj0Var3.f();
                        }
                        if (hs0Var != null) {
                            hs0Var.f();
                        }
                        if (tj0Var2 != null) {
                            tj0Var2.f();
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
            z12 = false;
            while (i14 < size) {
            }
            fr0 fr0Var32 = fr0Var;
            if (z12) {
            }
            g0(i262);
            return;
        }
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j3) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean C2 = org.telegram.messenger.m5.C(j3);
                int i28 = 0;
                boolean z13 = false;
                while (i28 < arrayList4.size()) {
                    org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) arrayList4.get(i28);
                    ArrayList arrayList5 = arrayList4;
                    if (org.telegram.messenger.gj.n1(gjVar4.k) == null || gjVar4.m5()) {
                        i12 = i28;
                    } else {
                        int f02 = org.telegram.messenger.si.f0(gjVar4.k);
                        i12 = i28;
                        if (f02 == -1) {
                            return;
                        }
                        ns0 ns0Var9 = ns0VarArr[f02];
                        if (ns0Var9.l) {
                            z11 = z13;
                            if (ns0Var9.a(gjVar4, org.telegram.messenger.gj.B0(gjVar4.k) == j3 ? 0 : 1, true, C2)) {
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
                    while (i29 < tr0VarArr.length) {
                        int i30 = tr0VarArr[i29].F;
                        if (i30 == 0) {
                            tj0Var = fr0Var;
                        } else if (i30 == z15) {
                            tj0Var = tj0Var5;
                        } else if (i30 == 2) {
                            tj0Var = tj0Var4;
                        } else if (i30 == 3) {
                            tj0Var = ms0Var;
                        } else {
                            if (i30 == 4) {
                                tj0Var = tj0Var3;
                            } else if (i30 == 5) {
                                tj0Var = tj0Var2;
                            } else {
                                tj0Var = i30 == 15 ? hs0Var : null;
                                if (tj0Var != null) {
                                    tj0Var.b();
                                    fr0Var.f();
                                    tj0Var5.f();
                                    tj0Var4.f();
                                    ms0Var.X(false);
                                    tj0Var3.f();
                                    hs0Var.f();
                                    tj0Var2.f();
                                }
                                i29++;
                                z15 = true;
                            }
                            if (tj0Var != null) {
                            }
                            i29++;
                            z15 = true;
                        }
                        if (tj0Var != null) {
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
        if (i7 == org.telegram.messenger.ns.K) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l10 = (Long) objArr[3];
            if (l10.longValue() == j3 || l10.longValue() == this.f1) {
                int i31 = l10.longValue() == j3 ? 0 : 1;
                for (ns0 ns0Var10 : ns0VarArr) {
                    ns0Var10.f(i31, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i32 = org.telegram.messenger.ns.h2;
        int i33 = org.telegram.messenger.ns.f2;
        int i34 = org.telegram.messenger.ns.g2;
        if (i7 == i32 || i7 == i34 || i7 == i33) {
            if (i7 != i33 && i7 != i34) {
                if (((org.telegram.messenger.gj) objArr[0]).T != 0) {
                    return;
                }
                for (int i35 = 0; i35 < tr0VarArr.length; i35++) {
                    int childCount = tr0VarArr[i35].h.getChildCount();
                    for (int i36 = 0; i36 < childCount; i36++) {
                        View childAt = tr0VarArr[i35].h.getChildAt(i36);
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
            for (int i37 = 0; i37 < tr0VarArr.length; i37++) {
                tr0 tr0Var3 = tr0VarArr[i37];
                if (tr0Var3 != null && (dq0Var = tr0Var3.h) != null) {
                    int childCount2 = dq0Var.getChildCount();
                    for (int i38 = 0; i38 < childCount2; i38++) {
                        View childAt2 = tr0VarArr[i37].h.getChildAt(i38);
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
        if (i7 == org.telegram.messenger.ns.x5) {
            fi.k6 k6Var = (fi.k6) objArr[0];
            ir0 ir0Var = this.f0;
            if (ir0Var == null || k6Var != ir0Var.s) {
                up0 up0Var = this.h0;
                if (up0Var == null || k6Var != up0Var.s) {
                    Iterator it = this.m2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        xs0 xs0Var = (xs0) it.next();
                        if (xs0Var.c.s == k6Var) {
                            i11 = xs0Var.a;
                            break;
                        }
                    }
                } else {
                    i11 = 9;
                }
            } else {
                i11 = 8;
            }
            tr0 g02 = g0(i11);
            if (g02 != null) {
                if (g02.b != (k6Var.g() > 0)) {
                    g02.b = k6Var.g() > 0;
                    F1(g02, true);
                }
            }
            if (g02 != null) {
                org.telegram.messenger.g0.r2(g02.h);
                if (g02.h.getLayoutManager() instanceof v4.b0) {
                    uj0 uj0Var = g02.h;
                    O(g02, uj0Var, (v4.b0) uj0Var.getLayoutManager());
                }
            }
            nr0 nr0Var = this.G1;
            if (nr0Var != null) {
                nr0Var.W();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.v5) {
            for (tr0 tr0Var4 : tr0VarArr) {
                if (tr0Var4 != null && tr0Var4.h != null && z0(tr0Var4.F)) {
                    if (!B0() || tr0Var4.h.getAdapter() == null) {
                        for (int i39 = 0; i39 < tr0Var4.h.getChildCount(); i39++) {
                            View childAt3 = tr0Var4.h.getChildAt(i39);
                            if (childAt3 instanceof org.telegram.ui.Cells.n7) {
                                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt3;
                                g6 g6Var = n7Var.O;
                                if (!n7Var.e0 || (gjVar = n7Var.n) == null || (storyItem = gjVar.l) == null || (storyViews = storyItem.views) == null) {
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
                        org.telegram.messenger.g0.r2(tr0Var4.h);
                    }
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.f3) {
            if (((Long) objArr[0]).longValue() == j3) {
                this.T.E(true);
                P1(true);
                N();
                return;
            }
            return;
        }
        int i41 = org.telegram.messenger.ns.g3;
        js0 js0Var = this.U;
        if (i7 == i41) {
            if (j3 == 0 || j3 == e2Var.getUserConfig().e()) {
                js0Var.F(true);
                P1(true);
                N();
                Y0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.s) {
            js0Var.F(true);
            return;
        }
        if (i7 == org.telegram.messenger.ns.G3) {
            if (((Long) objArr[0]).longValue() == j3) {
                P1(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.W3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j3 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            lr0 lr0Var = this.d0;
            if (lr0Var != null) {
                TLRPC.ChatFull chatFull = lr0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i42 = 0; i42 < lr0Var.d.participants.participants.size(); i42++) {
                        lr0Var.d.participants.participants.get(i42).setRank(longValue4, str);
                    }
                }
                for (tr0 tr0Var5 : tr0VarArr) {
                    if (tr0Var5.F == 7) {
                        org.telegram.messenger.g0.a4(tr0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.f1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i43 = 0; i43 < tr0VarArr.length; i43++) {
                if (tr0VarArr[i43].h.getAdapter() == hs0Var) {
                    dq0 dq0Var4 = tr0VarArr[i43].h;
                    ArrayList arrayList6 = hs0Var.n;
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
                                hs0Var.g(i44);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vq0 vq0Var = this.L0;
        if (vq0Var != null) {
            canvas.save();
            canvas.translate(vq0Var.getX(), vq0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        rq0 rq0Var = this.U0;
        if (rq0Var != null) {
            int i7 = rq0Var.V;
            if ((i7 == 3 || i7 == 1) && this.S0 == null) {
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
        if (this.c2 && (view instanceof tr0) && this.g2 < this.e2) {
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
        tr0[] tr0VarArr = this.n0;
        float top = tr0VarArr[0].getTop();
        zp0 zp0Var = this.c0;
        if (zp0Var != null && ((i7 = tr0VarArr[0].F) == 8 || J0(i7))) {
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
        vp0 vp0Var;
        if (!B0()) {
            return org.telegram.messenger.hd.M0(2131753014, null);
        }
        if (z10 && (vp0Var = this.a0) != null) {
            return vp0Var.getBotPreviewsSubtitle();
        }
        ir0 ir0Var = this.f0;
        if (ir0Var == null || ir0Var.s == null) {
            i7 = 0;
            i10 = 0;
        } else {
            i7 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < ir0Var.s.i.size(); i11++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) ir0Var.s.i.get(i11);
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
            return org.telegram.messenger.hd.M0(2131753014, null);
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
        ir0 ir0Var = this.f0;
        if (ir0Var == null || ir0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.y1;
        if (z10 && arrayList.size() > e2Var.getMessagesController().O5) {
            org.telegram.messenger.i20.t(org.telegram.messenger.hd.G(e2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(e2Var), R.raw.chats_infotip, 36);
            return;
        }
        fi.k6 k6Var = ir0Var.s;
        int i7 = k6Var.c;
        ArrayList arrayList2 = k6Var.g;
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
        boolean z12 = arrayList3.size() > org.telegram.messenger.np.s1(i7).O5;
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
                k6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = org.telegram.messenger.np.s1(i7).j1(k6Var.d);
                ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new fi.m5(2));
            }
            z11 = z12;
        }
        if (z11) {
            org.telegram.messenger.i20.t(org.telegram.messenger.hd.G(e2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(e2Var), R.raw.chats_infotip, 36);
        } else if (z10) {
            cc.a0(e2Var).I(R.raw.ic_pin, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            org.telegram.messenger.i20.t(org.telegram.messenger.hd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), cc.a0(e2Var), R.raw.ic_unpin, 36);
        }
    }

    public final tr0 g0(int i7) {
        int i10 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i10 >= tr0VarArr.length) {
                return null;
            }
            tr0 tr0Var = tr0VarArr[i10];
            if (tr0Var != null && tr0Var.F == i7) {
                return tr0Var;
            }
            i10++;
        }
    }

    public final boolean g1(MotionEvent motionEvent, boolean z10) {
        tr0 tr0Var;
        vp0 vp0Var;
        int closestTab = getClosestTab();
        vq0 vq0Var = this.L0;
        int i7 = -1;
        int i10 = vq0Var.P.get(vq0Var.n + (z10 ? 1 : -1), -1);
        zp0 zp0Var = this.c0;
        if (zp0Var != null) {
            if (J0(closestTab) || closestTab == 8) {
                v61 v61Var = zp0Var.b;
                i7 = v61Var.c0.get(v61Var.G + (z10 ? 1 : -1), -1);
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
            if (this.q0 == null || I()) {
                this.r0 = l0(0.0f);
                M1(0.0f);
            } else {
                setSearchItemVisibility(I0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!H() || !this.F1 || (getClosestTab() != 8 && !J0(getClosestTab())))) {
                tr0[] tr0VarArr = this.n0;
                tr0 tr0Var2 = tr0VarArr[0];
                if (tr0Var2 != null && tr0Var2.F == 13 && (vp0Var = this.a0) != null) {
                    bi.f3 f3Var = vp0Var.n;
                    if (!z10) {
                    }
                }
                tr0 tr0Var3 = tr0VarArr[0];
                wp0 wp0Var = this.b0;
                if (tr0Var3 != null && tr0Var3.F == 14 && wp0Var != null) {
                    bi.f3 f3Var2 = wp0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.F1 || (tr0Var = tr0VarArr[0]) == null || tr0Var.F != 13) && ((wp0Var == null || !wp0Var.g()) && (zp0Var == null || !zp0Var.f))) {
                    I1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    vq0Var.setEnabled(false);
                    tr0 tr0Var4 = tr0VarArr[1];
                    tr0Var4.F = i10;
                    tr0Var4.setVisibility(0);
                    this.k1 = z10;
                    B1(true);
                    if (z10) {
                        tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth());
                    } else {
                        tr0VarArr[1].setTranslationX(-tr0VarArr[0].getMeasuredWidth());
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
        tr0 tr0Var;
        tr0 tr0Var2;
        fi.k6 k6Var;
        fi.k6 k6Var2;
        float f10 = 1.0f;
        tr0[] tr0VarArr = this.n0;
        if (tr0VarArr == null || (tr0Var = tr0VarArr[0]) == null || (tr0Var2 = tr0VarArr[1]) == null || tr0Var.w == null || tr0Var2.w == null) {
            return 1.0f;
        }
        int i7 = tr0Var.F;
        int i10 = tr0Var2.F;
        boolean z10 = J0(i7) || i7 == 8;
        boolean z11 = J0(i10) || i10 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - tr0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - tr0VarArr[1].w.getVisibilityFactor();
        vs0 z12 = z1(tr0VarArr[0].F);
        if (i7 == 8 || (z12 != null && (k6Var2 = z12.s) != null && k6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        vs0 z13 = z1(i10);
        if (i10 != 8 && (z13 == null || (k6Var = z13.s) == null || k6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(tr0VarArr[0].getTranslationX() / tr0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        tr0[] tr0VarArr = this.n0;
        tr0 tr0Var = tr0VarArr[1];
        if (tr0Var != null && tr0Var.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return tr0VarArr[1].F;
            }
            if (Math.abs(tr0VarArr[1].getTranslationX()) < tr0VarArr[1].getMeasuredWidth() / 2.0f) {
                return tr0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public uj0 getCurrentListView() {
        gr0 gr0Var;
        tr0 tr0Var = this.n0[0];
        int i7 = tr0Var.F;
        return i7 == 13 ? this.a0.getCurrentListView() : i7 == 14 ? this.b0.getCurrentListView() : (i7 != 12 || (gr0Var = this.W) == null) ? tr0Var.h : gr0Var.a.A0;
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
        zp0 zp0Var = this.c0;
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
            tr0[] tr0VarArr = this.n0;
            if (i7 >= tr0VarArr.length) {
                return f10;
            }
            tr0 tr0Var = tr0VarArr[i7];
            if (tr0Var != null) {
                f10 = ((1.0f - Math.abs(tr0Var.getTranslationX() / getWidth())) * tr0Var.F) + f10;
            }
            i7++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.z6));
        int i7 = org.telegram.ui.ActionBar.j6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.x0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.w0;
        if (q0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        }
        Drawable[] drawableArr = {this.G0};
        int i10 = org.telegram.ui.ActionBar.j6.y8;
        ImageView imageView = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.xi));
        vq0 vq0Var = this.L0;
        arrayList.add(new org.telegram.ui.ActionBar.s6(vq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.wi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(vq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.vi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(vq0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.yi));
        rq0 rq0Var = this.U0;
        if (rq0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(rq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.s6(rq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.s6(rq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.s6(rq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.A7));
        }
        final int i11 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i11 >= tr0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.r6 r6Var = new org.telegram.ui.ActionBar.r6() { // from class: org.telegram.ui.Components.mp0
                @Override // org.telegram.ui.ActionBar.r6
                public final void b() {
                    tr0[] tr0VarArr2 = ys0.this.n0;
                    int i12 = i11;
                    dq0 dq0Var = tr0VarArr2[i12].h;
                    if (dq0Var != null) {
                        int childCount = dq0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = tr0VarArr2[i12].h.getChildAt(i13);
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

                @Override // org.telegram.ui.ActionBar.r6
                public final /* synthetic */ void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.c7));
            int i12 = org.telegram.ui.ActionBar.j6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.n6));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.U7));
            int i13 = org.telegram.ui.ActionBar.j6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
            int i14 = org.telegram.ui.ActionBar.j6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.qj));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.o7.class}, (Paint) null, (Drawable[]) null, r6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.o7.class}, (Paint) null, (Drawable[]) null, r6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ci));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, r6Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, r6Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.y6));
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

    public final void i1(v4.h0 h0Var) {
        if (h0Var instanceof ss0) {
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
        hs0 hs0Var = this.Q;
        if (h0Var == hs0Var) {
            hs0Var.r = null;
        }
    }

    public final int j0(int i7) {
        return n0(i7) + org.telegram.messenger.g0.L(54.0f) + this.d2 + this.e2 + this.p2 + (i7 == 9 ? org.telegram.messenger.g0.L(64.0f) : 0);
    }

    public final void j1() {
        int i7;
        int i10 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i10 >= tr0VarArr.length) {
                return;
            }
            dq0 dq0Var = tr0VarArr[i10].h;
            if (dq0Var != null) {
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < dq0Var.getChildCount(); i13++) {
                    View childAt = dq0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.n7) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                        int messageId = n7Var.getMessageId();
                        i12 = n7Var.getTop();
                        i11 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        int e12 = g7Var.getMessage().e1();
                        i12 = g7Var.getTop();
                        i11 = e12;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        i11 = f7Var.getMessage().e1();
                        i12 = f7Var.getTop();
                    }
                    if (i11 != 0) {
                        break;
                    }
                }
                if (i11 != 0) {
                    int i14 = tr0VarArr[i10].F;
                    int i15 = -1;
                    if (z0(i14)) {
                        vs0 z12 = z1(i14);
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
                        ns0[] ns0VarArr = this.w1;
                        if (i14 < ns0VarArr.length) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= ns0VarArr[i14].a.size()) {
                                    break;
                                }
                                if (i11 == ((org.telegram.messenger.gj) ns0VarArr[i14].a.get(i17)).e1()) {
                                    i15 = i17;
                                    break;
                                }
                                i17++;
                            }
                            i7 = ns0VarArr[i14].m + i15;
                        }
                    }
                    if (i15 >= 0) {
                        ((v4.b0) dq0Var.getLayoutManager()).h1(i7, (-tr0VarArr[i10].h.getPaddingTop()) + i12);
                        if (this.r1) {
                            tr0 tr0Var = tr0VarArr[i10];
                            tr0Var.r.h1(i7, (-tr0Var.h.getPaddingTop()) + i12);
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
        tr0[] tr0VarArr = this.n0;
        tr0 tr0Var = tr0VarArr[1];
        if (tr0Var != null && v0(tr0Var.F)) {
            f11 = 0.0f + f10;
        }
        tr0 tr0Var2 = tr0VarArr[0];
        return (tr0Var2 == null || !v0(tr0Var2.F)) ? f11 : (1.0f - f10) + f11;
    }

    public final void k1(int i7) {
        vq0 vq0Var;
        if (this.P1 || (vq0Var = this.L0) == null) {
            return;
        }
        vq0Var.g(null, i7, vq0Var.Q.get(i7));
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        tr0[] tr0VarArr = this.n0;
        tr0 tr0Var = tr0VarArr[1];
        if (tr0Var != null && F0(tr0Var.F) && tr0VarArr[1].F != 11) {
            f11 = 0.0f + f10;
        }
        tr0 tr0Var2 = tr0VarArr[0];
        return (tr0Var2 == null || !F0(tr0Var2.F) || tr0VarArr[0].F == 11) ? f11 : (1.0f - f10) + f11;
    }

    public final void l1(float f10, int i7) {
        vq0 vq0Var = this.L0;
        if (vq0Var != null) {
            vq0Var.i(f10, J0(i7) ? 8 : i7);
        }
        zp0 zp0Var = this.c0;
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
        vs0 z12;
        fi.k6 k6Var;
        if (!z0(i7) || (z12 = z1(i7)) == null || (k6Var = z12.s) == null) {
            return 0;
        }
        return k6Var.g();
    }

    public final void m1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i7 >= tr0VarArr.length) {
                if (this.G == 0) {
                    lr0 lr0Var = this.d0;
                    lr0Var.d = chatFull;
                    lr0Var.e = arrayList;
                }
                P1(true);
                for (int i10 = 0; i10 < tr0VarArr.length; i10++) {
                    tr0 tr0Var = tr0VarArr[i10];
                    if (tr0Var.F == 7 && tr0Var.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(tr0VarArr[i10].h);
                    }
                }
                return;
            }
            tr0 tr0Var2 = tr0VarArr[i7];
            if (tr0Var2.F == 7 && tr0Var2.h.getAdapter() != null && tr0VarArr[i7].h.getAdapter().b() != 0 && this.y1.getMessagesController().P1().j.size() > 0) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final int n0(int i7) {
        zp0 zp0Var = this.c0;
        return (int) ((zp0Var == null || !(J0(i7) || i7 == 8)) ? 0.0f : zp0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f));
    }

    public final void n1(int i7, int i10, int i11, int i12) {
        this.c2 = true;
        this.d2 = i7;
        this.e2 = i10;
        this.f2 = i11;
        this.b2 = i12;
        G();
        wp0 wp0Var = this.b0;
        if (wp0Var != null) {
            if (wp0Var.M != i10 || wp0Var.N != i11) {
                wp0Var.M = i10;
                wp0Var.N = i11;
                wp0Var.setClipChildren(i10 == 0 && i11 == 0);
                wp0Var.h.setClipChildren(i10 == 0 && i11 == 0);
                wp0Var.n();
            }
            H1();
        }
        for (tr0 tr0Var : this.n0) {
            if (tr0Var != null) {
                tr0Var.setClipChildren(false);
                J1(tr0Var);
                setPageOverscan(tr0Var.h);
                setPageOverscan(tr0Var.n);
                int paddingTop = tr0Var.h.getPaddingTop();
                dq0 dq0Var = tr0Var.h;
                int paddingLeft = dq0Var.getPaddingLeft();
                dq0 dq0Var2 = tr0Var.h;
                int j02 = j0(tr0Var.F);
                dq0Var2.h3 = j02;
                int paddingRight = tr0Var.h.getPaddingRight();
                dq0 dq0Var3 = tr0Var.h;
                int i02 = i0(I0());
                dq0Var3.i3 = i02;
                dq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - tr0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(tr0Var.h, new ep0(tr0Var, paddingTop2, 1));
                }
                tr0Var.w.setPadding(0, i7, 0, i12);
                gr0 gr0Var = this.W;
                if (gr0Var != null && gr0Var.getParent() == tr0Var) {
                    p1(org.telegram.messenger.g0.L(56.0f) + i7, gr0Var);
                }
                vp0 vp0Var = this.a0;
                if (vp0Var != null && vp0Var.getParent() == tr0Var) {
                    p1(i7, vp0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void o1(int i7, boolean z10) {
        this.D0.a(i7, z10);
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        if (w4Var != null) {
            w4Var.A(i7, z10);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i7 >= tr0VarArr.length) {
                return;
            }
            dq0 dq0Var = tr0VarArr[i7].h;
            if (dq0Var != null) {
                dq0Var.getViewTreeObserver().addOnPreDrawListener(new br0(this, i7, 0));
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
        nr0 nr0Var = this.G1;
        int height = nr0Var.f() != null ? nr0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof tr0) {
                i11 = i7;
                measureChildWithMargins(childAt, i11, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                dq0 dq0Var = ((tr0) childAt).h;
                dq0Var.setPadding(0, dq0Var.f3, 0, dq0Var.g3);
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
            org.telegram.ui.ActionBar.e2 e2Var = this.y1;
            if (e2Var.getParentLayout() != null && !((ActionBarLayout) e2Var.getParentLayout()).i() && !T() && !this.a) {
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
                    tr0[] tr0VarArr = this.n0;
                    if (z11 && (((z10 = this.k1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!g1(motionEvent, x10 < 0)) {
                            this.B1 = true;
                            this.A1 = false;
                            tr0VarArr[0].setTranslationX(0.0f);
                            tr0VarArr[1].setTranslationX(this.k1 ? tr0VarArr[0].getMeasuredWidth() : -tr0VarArr[0].getMeasuredWidth());
                            l1(0.0f, tr0VarArr[1].F);
                            Z0(getTabProgress());
                        }
                    }
                    if (!this.B1 || this.A1) {
                        if (this.A1) {
                            tr0VarArr[0].setTranslationX(x10);
                            if (this.k1) {
                                tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                tr0VarArr[1].setTranslationX(x10 - tr0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / tr0VarArr[0].getMeasuredWidth();
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
                            l1(abs2, tr0VarArr[1].F);
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
            tr0[] tr0VarArr = this.n0;
            if (i10 >= tr0VarArr.length) {
                break;
            }
            tr0 tr0Var = tr0VarArr[i10];
            if (tr0Var != null) {
                int i12 = tr0Var.F;
                if ((z10 && i7 == 8 && J0(i12)) || i12 == i7) {
                    i11++;
                    width = tr0VarArr[i10].getTranslationX();
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
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        if (w4Var != null) {
            if (z10) {
                O1();
                w4Var.F();
            } else {
                w4Var.u();
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
        this.R1.addListener(new org.telegram.ui.nn(20, this, z10));
        this.R1.start();
        if (z10) {
            O1();
        }
    }

    public final float r0(int i7, boolean z10) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            tr0[] tr0VarArr = this.n0;
            if (i10 >= tr0VarArr.length) {
                return f10;
            }
            tr0 tr0Var = tr0VarArr[i10];
            if (tr0Var != null) {
                int i11 = tr0Var.F;
                if ((z10 && i7 == 8 && J0(i11)) || i11 == i7) {
                    f10 = (1.0f - Math.abs(tr0VarArr[i10].getTranslationX() / getWidth())) + f10;
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
        tr0 g02;
        if (z10 && getY() != 0.0f && this.F == 1) {
            return;
        }
        if (z10 && z0(i7) && m0(i7) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.m1);
        bundle.putLong("topic_id", this.G);
        ns0[] ns0VarArr = this.w1;
        if (z10 && (g02 = g0(0)) != null) {
            ArrayList arrayList = ns0VarArr[0].e;
            int L0 = g02.x.L0();
            if (L0 >= 0) {
                yr0 yr0Var = null;
                if (arrayList != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((yr0) arrayList.get(i11)).b) {
                            yr0Var = (yr0) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (yr0Var == null) {
                        yr0Var = (yr0) i5.c.h(1, arrayList);
                    }
                }
                if (yr0Var != null) {
                    i10 = yr0Var.c;
                    if (i7 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i7 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.i8 i8Var = new org.telegram.ui.i8(ns0VarArr[0].q, i10, bundle);
                    i8Var.N = new org.telegram.messenger.ou(this, 11);
                    this.y1.presentFragment(i8Var);
                }
            }
        }
        i10 = 0;
        if (i7 != 9) {
        }
        org.telegram.ui.i8 i8Var2 = new org.telegram.ui.i8(ns0VarArr[0].q, i10, bundle);
        i8Var2.N = new org.telegram.messenger.ou(this, 11);
        this.y1.presentFragment(i8Var2);
    }

    public final int s0(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.I1;
        return e6Var != null ? e6Var.h(i7) : org.telegram.ui.ActionBar.j6.x0(null, i7, false);
    }

    public final void s1(int i7) {
        int w12 = w1(getClosestTab());
        zp0 zp0Var = this.c0;
        if (w12 != i7) {
            if (zp0Var != null) {
                zp0Var.b.d(i7, zp0Var.d.i(i7));
                return;
            }
            return;
        }
        zp0Var.setReorderingAlbums(true);
        xs0 x12 = x1(i7);
        tr0 g02 = g0(x12.a);
        if (g02 == null) {
            return;
        }
        dq0 dq0Var = g02.h;
        for (int i10 = 0; i10 < dq0Var.getChildCount(); i10++) {
            View childAt = dq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.n7) {
                ((org.telegram.ui.Cells.n7) childAt).l(true, true);
            }
        }
        ws0 ws0Var = x12.c;
        if (ws0Var != null && !ws0Var.y) {
            ws0Var.y = true;
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
                    ns0[] ns0VarArr = this.w1;
                    if (i7 >= ns0VarArr.length) {
                        break;
                    }
                    if (ns0VarArr[i7].b[1].size() == 0) {
                        ns0 ns0Var = ns0VarArr[i7];
                        ns0Var.j[1] = this.g1.migrated_from_max_id;
                        ns0Var.i[1] = false;
                    }
                    i7++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        vq0 vq0Var = this.L0;
        if (vq0Var != null) {
            vq0Var.setInitialTabId(A0() ? 9 : 8);
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
            tr0[] tr0VarArr = this.n0;
            if (i13 >= tr0VarArr.length) {
                break;
            }
            tr0VarArr[i13].setTranslationY(this.O1);
            i13++;
        }
        if (this.S0 != null) {
            U();
        } else {
            rq0 rq0Var = this.U0;
            if (rq0Var != null) {
                rq0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.R0 = i10;
        org.telegram.ui.Cells.t0 t0Var = this.N0;
        t0Var.setTranslationY((t0Var.getTag() == null ? -org.telegram.messenger.g0.L(48.0f) : 0) + this.R0);
    }

    public void setPagesGlassEngine(ri.q qVar) {
        this.h2 = qVar;
        wp0 wp0Var = this.b0;
        if (wp0Var != null) {
            wp0Var.setGlassEngine(qVar);
        }
        for (tr0 tr0Var : this.n0) {
            if (tr0Var != null) {
                tr0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(tr0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i7) {
        if (this.b2 != i7) {
            this.b2 = i7;
            tr0[] tr0VarArr = this.n0;
            if (tr0VarArr != null) {
                for (tr0 tr0Var : tr0VarArr) {
                    if (tr0Var != null) {
                        dq0 dq0Var = tr0Var.h;
                        int paddingLeft = dq0Var.getPaddingLeft();
                        dq0 dq0Var2 = tr0Var.h;
                        int i10 = dq0Var2.f3;
                        int paddingRight = dq0Var2.getPaddingRight();
                        dq0 dq0Var3 = tr0Var.h;
                        int i02 = i0(I0());
                        dq0Var3.i3 = i02;
                        dq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
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
            tr0[] tr0VarArr = this.n0;
            if (i7 >= tr0VarArr.length) {
                return;
            }
            F1(tr0VarArr[i7], true);
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
            tr0[] tr0VarArr = this.n0;
            if (i10 >= tr0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i7, org.telegram.messenger.g0.L(tr0VarArr[i10].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            tr0VarArr[i10].w.setTranslationY(f10);
            tr0VarArr[i10].s.setTranslationY(-f10);
            i10++;
        }
        vp0 vp0Var = this.a0;
        if (vp0Var != null) {
            vp0Var.setVisibleHeight(i7);
        }
        wp0 wp0Var = this.b0;
        if (wp0Var != null) {
            wp0Var.setVisibleHeight(i7);
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
        tr0[] tr0VarArr;
        tr0 tr0Var;
        if (this.r1) {
            return;
        }
        int i7 = 0;
        while (true) {
            tr0VarArr = this.n0;
            if (i7 >= tr0VarArr.length) {
                tr0Var = null;
                break;
            }
            int i10 = tr0VarArr[i7].F;
            if (i10 == 0 || z0(i10)) {
                break;
            } else {
                i7++;
            }
        }
        if (tr0Var != null) {
            int i11 = tr0Var.F;
            this.s1 = i11;
            boolean z02 = z0(i11);
            int[] iArr = this.p1;
            int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], z10);
            this.t1 = h02;
            if (h02 != iArr[z02 ? 1 : 0]) {
                if (this.n1 && z0(this.s1)) {
                    return;
                }
                tr0Var.n.setVisibility(0);
                if (z0(this.s1)) {
                    tr0Var.n.setAdapter(A1(this.s1));
                } else {
                    tr0Var.n.setAdapter(this.L);
                }
                sr0 sr0Var = tr0Var.n;
                sr0Var.setPadding(sr0Var.getPaddingLeft(), j0(this.s1), tr0Var.n.getPaddingRight(), i0(I0()));
                tr0Var.r.y1(h02);
                tr0Var.n.a0();
                tr0Var.r.O = new tq0(this, tr0Var, 0);
                org.telegram.messenger.g0.a4(tr0Var.h);
                this.r1 = true;
                if (this.s1 == 0) {
                    this.w1[0].g(true);
                }
                this.q1 = 0.0f;
                if (this.s < 0) {
                    j1();
                    return;
                }
                for (tr0 tr0Var2 : tr0VarArr) {
                    if (tr0Var2.F == this.s1) {
                        tr0Var2.r.h1(this.s, this.w - tr0Var2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.ui.ActionBar.e2 e2Var = this.y1;
        if (e2Var != null && e2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            e2Var.getOrCreateStoryViewer().getClass();
            fi.i9 orCreateStoryViewer = e2Var.getOrCreateStoryViewer();
            Context context = e2Var.getContext();
            long dialogId = t2Var.getDialogId();
            fi.b7 a10 = fi.b7.a((uj0) t2Var.getParent());
            a10.s += ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).s1) ? org.telegram.messenger.g0.L(68.0f) : 0;
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
            tr0[] tr0VarArr = this.n0;
            if (i7 >= tr0VarArr.length) {
                return;
            }
            int childCount = tr0VarArr[i7].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = tr0VarArr[i7].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.J1.a(s0(org.telegram.ui.ActionBar.j6.d6));
            org.telegram.ui.ActionBar.x1 x1Var = this.G0;
            if (x1Var != null) {
                x1Var.a(s0(org.telegram.ui.ActionBar.j6.y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.j6.y8));
            }
            D1();
            invalidate();
            for (tr0 tr0Var : this.n0) {
                if (tr0Var != null && tr0Var.M) {
                    tr0Var.invalidate();
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
            tr0[] tr0VarArr = this.n0;
            float x10 = tr0VarArr[0].getX();
            this.i1 = new AnimatorSet();
            this.l1 = Math.abs(x10) < ((float) tr0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new f60(this, 18));
            boolean z10 = this.l1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.k1) {
                    this.i1.playTogether(ObjectAnimator.ofFloat(tr0VarArr[0], (Property<tr0, Float>) property, 0.0f), ObjectAnimator.ofFloat(tr0VarArr[1], (Property<tr0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.i1.playTogether(ObjectAnimator.ofFloat(tr0VarArr[0], (Property<tr0, Float>) property, 0.0f), ObjectAnimator.ofFloat(tr0VarArr[1], (Property<tr0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = tr0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.k1) {
                    this.i1.playTogether(ObjectAnimator.ofFloat(tr0VarArr[0], (Property<tr0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(tr0VarArr[1], (Property<tr0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.i1.playTogether(ObjectAnimator.ofFloat(tr0VarArr[0], (Property<tr0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(tr0VarArr[1], (Property<tr0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.i1.setInterpolator(u2);
            int measuredWidth2 = getMeasuredWidth();
            float f12 = measuredWidth2 / 2;
            float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
            this.i1.setDuration(Math.max(org.telegram.messenger.ns.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.i1.addListener(new yq0(this, i7));
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
        this.O0.setInterpolator(er.g);
        this.O0.addListener(new yq0(this, 0));
        this.O0.start();
    }

    public final int w1(int i7) {
        xs0 y12 = y1(i7);
        if (y12 == null) {
            return -1;
        }
        return y12.b;
    }

    public boolean x0() {
        return false;
    }

    public final xs0 x1(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.m2;
        xs0 xs0Var = (xs0) hashMap.get(valueOf);
        if (xs0Var != null) {
            return xs0Var;
        }
        xs0 xs0Var2 = new xs0(this, getContext(), i7);
        hashMap.put(Integer.valueOf(i7), xs0Var2);
        this.n2.put(Integer.valueOf(xs0Var2.a), Integer.valueOf(i7));
        return xs0Var2;
    }

    public boolean y0() {
        return !(this instanceof r20);
    }

    public final xs0 y1(int i7) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i7));
        if (num == null) {
            return null;
        }
        return (xs0) this.m2.get(num);
    }

    public final void z(View view) {
        tr0[] tr0VarArr = this.n0;
        addView(view, Math.max(indexOfChild(tr0VarArr[0]), indexOfChild(tr0VarArr[1])) + 1, c8.ja.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final vs0 z1(int i7) {
        xs0 y12;
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
