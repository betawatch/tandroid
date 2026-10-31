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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class zt0 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.us, org.telegram.ui.Cells.r2, nk0 {
    public static final int[] s2 = {0, 1, 2, 4};
    public static final qq0 t2 = new qq0(0);
    public static final int u2 = org.telegram.messenger.i0.L(7.0f);
    public static final int v2 = org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(14.0f);
    public final Drawable A0;
    public boolean A1;
    public boolean B0;
    public int B1;
    public final NumberTextView C0;
    public int C1;
    public final zz D;
    public final LinearLayout D0;
    public VelocityTracker D1;
    public final int E;
    public final ImageView E0;
    public boolean E1;
    public final long F;
    public final org.telegram.ui.ActionBar.c2 F0;
    public final ms0 F1;
    public final org.telegram.ui.ActionBar.l G;
    public final ArrayList G0;
    public q30 G1;
    public final org.telegram.ui.ActionBar.i5 H;
    public final ArrayList H0;
    public final org.telegram.ui.ActionBar.p6 H1;
    public final org.telegram.ui.ActionBar.p5 I;
    public final ArrayList I0;
    public final hi.c I1;
    public final es0 J;
    public final ArrayList J0;
    public final xa.n J1;
    public final tt0 K;
    public final ur0 K0;
    public boolean K1;
    public final nt0 L;
    public final rr0 L0;
    public final e2.f L1;
    public final mt0 M;
    public final org.telegram.ui.Cells.s0 M0;
    public ji0 M1;
    public final mt0 N;
    public AnimatorSet N0;
    public int N1;
    public final mt0 O;
    public final vp0 O0;
    public boolean O1;
    public final gt0 P;
    public final ArrayList P0;
    public int P1;
    public final ns0 Q;
    public float Q0;
    public AnimatorSet Q1;
    public final ls0 R;
    public final zr R0;
    public final SparseArray R1;
    public final js0 S;
    public final FrameLayout S0;
    public long S1;
    public final it0 T;
    public final pr0 T0;
    public boolean T1;
    public final lt0 U;
    public final int U0;
    public int U1;
    public final fs0 V;
    public final Paint V0;
    public final bs0 V1;
    public final uq0 W;
    public boolean W0;
    public th.x4 W1;
    public boolean X0;
    public float X1;
    public sg.o0 Y0;
    public boolean Y1;
    public final int[] Z0;
    public SpannableStringBuilder Z1;
    public boolean a;
    public final vq0 a0;
    public int a1;
    public int a2;
    public boolean b;
    public final zq0 b0;
    public final SparseArray[] b1;
    public boolean b2;
    public boolean c;
    public final ks0 c0;
    public int c1;
    public int c2;
    public boolean d;
    public final s4.x d0;
    public boolean d1;
    public int d2;
    public int e;
    public final hs0 e0;
    public long e1;
    public int e2;
    public int f;
    public final wt0 f0;
    public TLRPC.ChatFull f1;
    public int f2;
    public final tq0 g0;
    public TLRPC.UserFull g1;
    public ei.r g2;
    public float h;
    public final wt0 h0;
    public AnimatorSet h1;
    public float h2;
    public final us0 i0;
    public boolean i1;
    public final RectF i2;
    public final us0 j0;
    public boolean j1;
    public Runnable j2;
    public final us0 k0;
    public boolean k1;
    public int k2;
    public final qs0 l0;
    public final long l1;
    public final HashMap l2;
    public final ss0[] m0;
    public boolean m1;
    public final HashMap m2;
    public float n;
    public final org.telegram.ui.ActionBar.t0 n0;
    public boolean n1;
    public int n2;
    public final org.telegram.ui.ActionBar.t0 o0;
    public final int[] o1;
    public int o2;
    public final org.telegram.ui.ActionBar.t0 p0;
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
    public final fr0 t1;
    public final ei0 u0;
    public float u1;
    public final org.telegram.ui.ActionBar.t0 v0;
    public final ot0[] v1;
    public int w;
    public final org.telegram.ui.ActionBar.t0 w0;
    public final rt0 w1;
    public int x;
    public final org.telegram.ui.ActionBar.t0 x0;
    public final org.telegram.ui.ActionBar.k2 x1;
    public final Rect y;
    public final org.telegram.ui.ActionBar.t0 y0;
    public int y1;
    public int z0;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0aa5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zt0(Context context, long j10, rt0 rt0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.k2 k2Var, ms0 ms0Var, int i13, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(context);
        int i14;
        TLRPC.ProfileTab profileTab;
        float f7;
        float f10;
        tg.b bVar2;
        int i15;
        boolean z10;
        tg.b bVar3;
        ?? r14;
        zt0 zt0Var;
        boolean z11;
        int i16;
        int i17;
        rs0 rs0Var;
        rs0 rs0Var2;
        rs0 rs0Var3;
        rs0 rs0Var4;
        rs0 rs0Var5;
        rs0 rs0Var6;
        rs0 rs0Var7;
        rs0 rs0Var8;
        rs0 rs0Var9;
        rs0 rs0Var10;
        rs0 rs0Var11;
        rs0 rs0Var12;
        rs0 rs0Var13;
        rs0 rs0Var14;
        rs0 rs0Var15;
        dw0 dw0Var;
        dw0 dw0Var2;
        dw0 dw0Var3;
        dw0 dw0Var4;
        dw0 dw0Var5;
        dw0 dw0Var6;
        dw0 dw0Var7;
        dw0 dw0Var8;
        dw0 dw0Var9;
        dw0 dw0Var10;
        rs0 rs0Var16;
        dw0 dw0Var11;
        rs0 rs0Var17;
        rs0 rs0Var18;
        ss0 ss0Var;
        br0 br0Var;
        rs0 rs0Var19;
        org.telegram.ui.ActionBar.t0 a2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        TL_bots.BotInfo botInfo;
        zt0 zt0Var2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        zt0Var2.y = new Rect();
        zt0Var2.m0 = new ss0[2];
        zt0Var2.G0 = new ArrayList(10);
        zt0Var2.H0 = new ArrayList(10);
        zt0Var2.I0 = new ArrayList(10);
        zt0Var2.J0 = new ArrayList(10);
        zt0Var2.O0 = new vp0(zt0Var2, 13);
        zt0Var2.P0 = new ArrayList();
        zt0Var2.V0 = new Paint();
        zt0Var2.b1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        zt0Var2.m1 = false;
        zt0Var2.n1 = false;
        zt0Var2.o1 = new int[]{3, 3};
        zt0Var2.t1 = new fr0(zt0Var2);
        zt0Var2.u1 = -5.0f;
        zt0Var2.v1 = new ot0[9];
        zt0Var2.L1 = new e2.f(null);
        zt0Var2.R1 = new SparseArray();
        zt0Var2.U1 = -1;
        zt0Var2.V1 = new bs0(zt0Var2);
        zt0Var2.X1 = 0.0f;
        zt0Var2.f2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        zt0Var2.i2 = new RectF();
        zt0Var2.k2 = -1;
        zt0Var2.l2 = new HashMap();
        zt0Var2.m2 = new HashMap();
        zt0Var2.p2 = true;
        hi.c cVar = new hi.c();
        zt0Var2.I1 = cVar;
        cVar.a(zt0Var2.q0(org.telegram.ui.ActionBar.t6.d6));
        tg.b bVar4 = bVar == null ? new tg.b(cVar) : bVar;
        zt0Var2.E = i13;
        zt0Var2.H1 = p6Var2;
        zz zzVar = new zz(context, null);
        zt0Var2.D = zzVar;
        zzVar.setIsSingleCell(true);
        TLRPC.User Z1 = k2Var.getMessagesController().Z1(Long.valueOf(j10));
        zt0Var2.w1 = rt0Var;
        zt0Var2.F1 = ms0Var;
        int[] iArr = rt0Var.c;
        long j11 = rt0Var.s;
        zt0Var2.F = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i10 : 0, iArr[7], iArr[8]};
        zt0Var2.Z0 = iArr2;
        if (userFull != null) {
            i14 = 1;
            profileTab = userFull.main_tab;
        } else {
            i14 = 1;
            profileTab = chatFull2 != null ? chatFull2.main_tab : null;
        }
        if (i11 == 14 || i11 == 10 || i11 == 11 || i11 == 6) {
            zt0Var2.a1 = i11;
        } else if (Z1 != null && Z1.bot && Z1.bot_has_main_app && Z1.bot_can_edit) {
            zt0Var2.a1 = 13;
        } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
            zt0Var2.a1 = 8;
        } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || zt0Var2.E0()))) {
            zt0Var2.a1 = 8;
        } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
            if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                int i23 = iArr2[i14];
                i18 = -1;
                if (i23 == -1 || i23 > 0) {
                    zt0Var2.a1 = i14;
                }
            } else {
                i18 = -1;
            }
            if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i22 = iArr2[5]) == i18 || i22 > 0)) {
                zt0Var2.a1 = 5;
            } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i21 = iArr2[3]) == i18 || i21 > 0)) {
                zt0Var2.a1 = 3;
            } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i20 = iArr2[4]) == i18 || i20 > 0)) {
                zt0Var2.a1 = 4;
            } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i19 = iArr2[2]) == i18 || i19 > 0)) {
                zt0Var2.a1 = 2;
            } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || zt0Var2.E0())) {
                zt0Var2.a1 = zt0Var2.getInitialTab();
            } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                int i24 = -1;
                if (i11 == -1 || j11 != 0) {
                    int i25 = 0;
                    while (true) {
                        int[] iArr3 = zt0Var2.Z0;
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
                    zt0Var2.a1 = i25;
                } else {
                    zt0Var2.a1 = i11;
                }
            } else {
                zt0Var2.a1 = 14;
            }
        } else {
            zt0Var2.a1 = 14;
        }
        zt0Var2.U0(i11);
        zt0Var2.f1 = chatFull2;
        zt0Var2.g1 = userFull;
        if (chatFull2 != null) {
            zt0Var2.e1 = -chatFull2.migrated_from_chat_id;
        }
        long j12 = j10;
        zt0Var2.l1 = j12;
        int i27 = 0;
        while (true) {
            ot0[] ot0VarArr = zt0Var2.v1;
            if (i27 >= ot0VarArr.length) {
                break;
            }
            ot0VarArr[i27] = new ot0();
            zt0Var2.v1[i27].j[0] = org.telegram.messenger.o5.C(zt0Var2.l1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
            zt0Var2.v1[i27].j[1] = Integer.MAX_VALUE;
            zt0Var2.Y(i27);
            if (zt0Var2.e1 != 0 && zt0Var2.f1 != null && zt0Var2.v1[i27].b[1].size() == 0) {
                ot0 ot0Var = zt0Var2.v1[i27];
                ot0Var.j[1] = zt0Var2.f1.migrated_from_max_id;
                ot0Var.i[1] = false;
            }
            i27++;
        }
        zt0Var2.x1 = k2Var;
        zt0Var2.G = k2Var.getActionBar();
        zt0Var2.H = k2Var.getSimpleActionBar();
        zt0Var2.o1[0] = zt0Var2.Z0() <= 0 ? org.telegram.messenger.tz.t1 : zt0Var2.Z0();
        zt0Var2.o1[1] = zt0Var2.Z0() <= 0 ? org.telegram.messenger.tz.u1 : zt0Var2.Z0();
        org.telegram.messenger.zs notificationCenter = k2Var.getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar = new xa.n(notificationCenter, zt0Var2);
        nVar.e(org.telegram.messenger.zs.V);
        nVar.e(org.telegram.messenger.zs.w);
        nVar.e(1);
        nVar.e(org.telegram.messenger.zs.K);
        nVar.e(org.telegram.messenger.zs.f2);
        nVar.e(org.telegram.messenger.zs.g2);
        nVar.e(org.telegram.messenger.zs.h2);
        nVar.e(org.telegram.messenger.zs.x5);
        nVar.e(org.telegram.messenger.zs.v5);
        nVar.e(org.telegram.messenger.zs.f3);
        nVar.e(org.telegram.messenger.zs.g3);
        nVar.e(org.telegram.messenger.zs.s);
        nVar.e(org.telegram.messenger.zs.G3);
        nVar.e(org.telegram.messenger.zs.W3);
        nVar.e(org.telegram.messenger.zs.f1);
        zt0Var2.J1 = nVar;
        for (int i28 = 0; i28 < 10; i28++) {
            if (i11 == 4) {
                qr0 qr0Var = new qr0(zt0Var2, context);
                qr0Var.T.c();
                zt0Var2.I0.add(qr0Var);
            }
        }
        zt0Var2.U0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zt0Var2.X0 = false;
        zt0Var2.Y0 = null;
        rr0 rr0Var = zt0Var2.L0;
        if (rr0Var != null) {
            rr0Var.g(false);
        }
        zt0Var2.W0 = false;
        Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        zt0Var2.A0 = drawable;
        org.telegram.ui.ActionBar.a7.y(zt0Var2, drawable, org.telegram.ui.ActionBar.t6.b7, p6Var2, PorterDuff.Mode.MULTIPLY);
        ur0 ur0Var = zt0Var2.K0;
        int currentTabId = ur0Var != null ? ur0Var.getCurrentTabId() : i11;
        ur0 ur0Var2 = new ur0(zt0Var2, context, zt0Var2.H1);
        int i29 = zt0Var2.a1;
        if (i29 != -1) {
            ur0Var2.setInitialTabId(i29);
            zt0Var2.a1 = -1;
        }
        ur0Var2.b0 = 320L;
        int i30 = org.telegram.ui.ActionBar.t6.a;
        int i31 = org.telegram.ui.ActionBar.t6.ti;
        int i32 = org.telegram.ui.ActionBar.t6.si;
        int i33 = org.telegram.ui.ActionBar.t6.a;
        ur0Var2.L = i31;
        ur0Var2.M = i32;
        ur0Var2.updateColors();
        ur0Var2.setUseMinimalWidth(true);
        ur0Var2.setDelegate(new vr0(zt0Var2));
        zt0Var2.K0 = ur0Var2;
        for (int i34 = 1; i34 >= 0; i34--) {
            zt0Var2.b1[i34].clear();
        }
        zt0Var2.c1 = 0;
        zt0Var2.P0.clear();
        it0 it0Var = zt0Var2.T;
        if (it0Var != null) {
            it0Var.x.clear();
        }
        if (zt0Var2 instanceof g30) {
            f7 = 10.0f;
        } else {
            org.telegram.ui.ActionBar.i5 i5Var = zt0Var2.H;
            if (i5Var != null) {
                org.telegram.ui.ActionBar.o5 o10 = i5Var.o();
                a2 = o10.b(0, R.drawable.outline_header_search);
                if (zt0Var2.y0() || zt0Var2.C0()) {
                    f7 = 10.0f;
                } else {
                    org.telegram.ui.ActionBar.p5 b10 = o10.b(0, R.drawable.ic_ab_other);
                    zt0Var2.I = b10;
                    f7 = 10.0f;
                    b10.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
                    b10.Y(false, false);
                }
            } else {
                f7 = 10.0f;
                org.telegram.ui.ActionBar.y p5 = zt0Var2.G.p();
                p5.addOnLayoutChangeListener(new wr0(zt0Var2));
                if (zt0Var2.l1 == zt0Var2.x1.getUserConfig().e() && (zt0Var2.x1 instanceof n90) && zt0Var2.H()) {
                    zt0Var2.o0 = p5.a(11, R.drawable.outline_header_search);
                }
                a2 = p5.a(0, 0);
            }
            org.telegram.ui.ActionBar.t0 J = a2.M().J(new ds0(zt0Var2));
            zt0Var2.p0 = J;
            rr0 rr0Var2 = zt0Var2.L0;
            J.setSearchFieldHint(org.telegram.messenger.cd.L0((rr0Var2 != null && rr0Var2.a() && zt0Var2.getSelectedTab() == 11) ? 2131745885 : 2131745853, null));
            J.setContentDescription(org.telegram.messenger.cd.L0(2131745853, "Search"));
            if (zt0Var2.H != null) {
                ((org.telegram.ui.ActionBar.p5) J).Y(false, false);
            } else {
                J.setTranslationY(org.telegram.messenger.i0.L(f7));
                zt0Var2.setSearchItemVisibility(zt0Var2.E0() ? 8 : 4);
            }
        }
        ImageView imageView = new ImageView(context);
        zt0Var2.t0 = imageView;
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754839, "AccDescrMoreOptions"));
        imageView.setTranslationY(org.telegram.messenger.i0.L(f7));
        imageView.setVisibility(4);
        if (zt0Var2.H != null || zt0Var2.y0() || zt0Var2.C0()) {
            f10 = 2.0f;
        } else {
            f10 = 2.0f;
            zt0Var2.G.addView(imageView, w7.b6.e(48, 56, 85));
            ei0 ei0Var = new ei0(context);
            zt0Var2.u0 = ei0Var;
            ei0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ei0Var.e(R.raw.options_to_search, 24, 24);
            ei0Var.getAnimatedDrawable().F *= 2.0f;
            ei0Var.getAnimatedDrawable().h = true;
            org.telegram.ui.ActionBar.a7.t(ei0Var, org.telegram.ui.ActionBar.t6.y8, p6Var2, PorterDuff.Mode.SRC_IN);
            ei0Var.setVisibility(8);
            zt0Var2.G.addView(ei0Var, w7.b6.e(48, 56, 85));
        }
        imageView.setOnClickListener(new up0(zt0Var2, 0));
        org.telegram.ui.ActionBar.p5 p5Var = zt0Var2.I;
        if (p5Var != null) {
            p5Var.setOnClickListener(new up0(zt0Var2, 1));
        }
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var2.p0;
        if (t0Var != null && zt0Var2.H == null) {
            EditTextBoldCursor searchField = t0Var.getSearchField();
            int i35 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(searchField, i35, p6Var2);
            org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Gj, p6Var2);
            org.telegram.ui.ActionBar.a7.w(searchField, i35, p6Var2);
        }
        zt0Var2.z0 = 0;
        LinearLayout linearLayout = new LinearLayout(context);
        zt0Var2.D0 = linearLayout;
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        linearLayout.setVisibility(4);
        ImageView imageView2 = new ImageView(context);
        zt0Var2.E0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(true);
        zt0Var2.F0 = c2Var;
        imageView2.setImageDrawable(c2Var);
        int i36 = org.telegram.ui.ActionBar.t6.y8;
        c2Var.a(zt0Var2.q0(i36));
        int i37 = org.telegram.ui.ActionBar.t6.z8;
        org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.g0(zt0Var2.q0(i37), 1), null, org.telegram.ui.ActionBar.a7.N(i37), p6Var2);
        imageView2.setContentDescription(org.telegram.messenger.cd.L0(2131752041, "Close"));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
        zt0Var2.P0.add(imageView2);
        imageView2.setOnClickListener(new up0(zt0Var2, 2));
        NumberTextView numberTextView = new NumberTextView(context);
        zt0Var2.C0 = numberTextView;
        numberTextView.setTextSize(18);
        numberTextView.setTypeface(org.telegram.messenger.i0.o());
        numberTextView.setTextColor(zt0Var2.q0(i36));
        linearLayout.addView(numberTextView, w7.b6.m(1.0f, 0, -1, 18, 0, 0));
        zt0Var2.P0.add(numberTextView);
        if (!org.telegram.messenger.o5.C(zt0Var2.l1)) {
            if (!zt0Var2.E0()) {
                zt0Var2.w0 = zt0Var2.U(context, org.telegram.messenger.zs.n1, R.drawable.msg_message, org.telegram.messenger.cd.K0(2131754877));
                zt0Var2.v0 = zt0Var2.U(context, 100, R.drawable.msg_forward, org.telegram.messenger.cd.K0(2131750588));
            }
            org.telegram.ui.ActionBar.t0 U = zt0Var2.U(context, org.telegram.messenger.zs.o1, R.drawable.msg_pin, org.telegram.messenger.cd.K0(2131747261));
            zt0Var2.x0 = U;
            U.setVisibility(8);
            org.telegram.ui.ActionBar.t0 U2 = zt0Var2.U(context, org.telegram.messenger.zs.p1, R.drawable.msg_unpin, org.telegram.messenger.cd.K0(2131743869));
            zt0Var2.y0 = U2;
            U2.setVisibility(8);
            zt0Var2.B1();
        }
        zt0Var2.n0 = zt0Var2.U(context, 101, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, "Delete"));
        zt0Var2.J = new es0(zt0Var2, context);
        zt0Var2.K = new tt0(zt0Var2, context);
        zt0Var2.M = new mt0(zt0Var2, context, 1);
        zt0Var2.N = new mt0(zt0Var2, context, 2);
        zt0Var2.O = new mt0(zt0Var2, context, 4);
        zt0Var2.P = new gt0(zt0Var2, context, zt0Var2.x1.getCurrentAccount(), zt0Var2.x1.getResourceProvider());
        zt0Var2.Q = new ns0(zt0Var2, context);
        zt0Var2.i0 = new us0(zt0Var2, context, 1);
        zt0Var2.j0 = new us0(zt0Var2, context, 4);
        zt0Var2.k0 = new us0(zt0Var2, context, 3);
        zt0Var2.l0 = new qs0(zt0Var2, context);
        zt0Var2.R = new ls0(zt0Var2, context);
        zt0Var2.S = new js0(zt0Var2, context);
        zt0Var2.T = new it0(zt0Var2, context);
        zt0Var2.U = new lt0(zt0Var2, context);
        if (!zt0Var2.E0() && !zt0Var2.v0() && zt0Var2.F == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", zt0Var2.x1.getUserConfig().e());
            bundle.putInt("chatMode", 3);
            fs0 fs0Var = new fs0(zt0Var2, context, zt0Var2.x1.getParentLayout(), bundle);
            zt0Var2.V = fs0Var;
            long j13 = zt0Var2.l1;
            org.telegram.ui.vn vnVar = fs0Var.a;
            vnVar.r4 = j13;
            vnVar.jb = true;
            fs0Var.setClipToOutline(true);
            fs0Var.setOutlineProvider(new gs0());
        }
        ks0 ks0Var = new ks0(zt0Var2, context);
        zt0Var2.c0 = ks0Var;
        if (zt0Var2.F == 0) {
            ks0Var.e = arrayList;
            ks0Var.d = currentTabId != 7 ? null : chatFull2;
        }
        zt0Var2.e0 = new hs0(zt0Var2, context);
        zt0Var2.d0 = new s4.x(new is0(zt0Var2));
        zt0Var2.f0 = new wt0(zt0Var2, context, false);
        zt0Var2.g0 = new tq0(zt0Var2, context);
        zt0Var2.h0 = new wt0(zt0Var2, context, true);
        zt0Var2.L = new nt0(zt0Var2, context);
        if (zt0Var2.z0()) {
            zt0Var2.W = new uq0(zt0Var2, context, zt0Var2.x1, zt0Var2.l1);
            bVar3 = bVar4;
            z10 = false;
            i15 = 1;
        } else {
            if (zt0Var2.x1 instanceof ProfileActivity) {
                TextView textView = new TextView(context);
                zt0Var2.s0 = textView;
                textView.setText(org.telegram.messenger.cd.K0(2131745963).toUpperCase());
                textView.setTypeface(org.telegram.messenger.i0.o());
                int i38 = org.telegram.ui.ActionBar.t6.Ci;
                org.telegram.ui.ActionBar.a7.V(textView, i38, p6Var2);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(17);
                org.telegram.ui.ActionBar.a7.R(textView, org.telegram.ui.ActionBar.t6.g0(org.telegram.ui.ActionBar.t6.r1(0.15f, zt0Var2.q0(i38)), 3), null, org.telegram.ui.ActionBar.a7.L(0.15f, i38), p6Var2);
                textView.setPadding(org.telegram.messenger.i0.L(19.0f), 0, org.telegram.messenger.i0.L(19.0f), 0);
                zt0Var2.G.addView(textView, w7.b6.e(-2, 56, 85));
                textView.setOnClickListener(new up0(zt0Var2, 3));
                textView.setVisibility(8);
                textView.setAlpha(0.0f);
                textView.setScaleX(0.4f);
                textView.setScaleY(0.4f);
                org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var2.x1;
                i15 = 1;
                tg.b bVar5 = bVar4;
                vq0 vq0Var = new vq0(zt0Var2, k2Var2, context, k2Var2.getCurrentAccount(), ((ProfileActivity) zt0Var2.x1).a(), p6Var2, bVar5);
                p6Var2 = p6Var2;
                zt0Var2.a0 = vq0Var;
                zt0Var2.C1();
                zt0Var2.b0 = new zq0(zt0Var2, context, zt0Var2.getStoriesController().B(zt0Var2.l1, true), new yq0(zt0Var2, context, k2Var, p6Var2));
                bVar2 = bVar5;
            } else {
                bVar2 = bVar4;
                i15 = 1;
            }
            z10 = false;
            bVar3 = bVar2;
        }
        zt0Var2.setWillNotDraw(z10);
        int i39 = 0;
        int i40 = -1;
        int i41 = 0;
        while (true) {
            ss0[] ss0VarArr = zt0Var2.m0;
            if (i41 >= ss0VarArr.length) {
                break;
            }
            if (i41 == 0 && (ss0Var = ss0VarArr[i41]) != null && (br0Var = ss0Var.x) != null) {
                i40 = br0Var.L0();
                if (i40 != zt0Var2.m0[i41].x.B() - i15) {
                    rs0Var19 = zt0Var2.m0[i41].h;
                    ck0 ck0Var = (ck0) rs0Var19.K(i40);
                    if (ck0Var != null) {
                        i39 = ck0Var.a.getTop();
                    } else {
                        i40 = -1;
                    }
                } else {
                    i16 = i39;
                    i40 = -1;
                    ar0 ar0Var = new ar0(zt0Var2, context);
                    zt0Var2.addView(ar0Var, w7.b6.d(-1, -1.0f, 51, 0.0f, zt0Var2.K0(), 0.0f, 0.0f));
                    if (i41 == i15) {
                        ar0Var.setTranslationX(org.telegram.messenger.i0.q.x);
                    }
                    zt0Var2.m0[i41] = ar0Var;
                    ar0Var.N = p6Var2;
                    ss0 ss0Var2 = zt0Var2.m0[i41];
                    br0 br0Var2 = new br0(zt0Var2, ar0Var);
                    ss0Var2.x = br0Var2;
                    br0Var2.z1(new cr0(zt0Var2, ar0Var));
                    zt0Var2.m0[i41].d = new s4.j();
                    i17 = i16;
                    zt0Var2.m0[i41].d.n(280L);
                    zt0Var2.m0[i41].d.o(gr.h);
                    ss0 ss0Var3 = zt0Var2.m0[i41];
                    ss0Var3.d.m = false;
                    ss0Var3.h = new dr0(zt0Var2, context, ar0Var, br0Var2);
                    rs0Var = zt0Var2.m0[i41].h;
                    rs0Var.setFastScrollEnabled(1);
                    rs0Var2 = zt0Var2.m0[i41].h;
                    rs0Var2.setScrollingTouchSlop(1);
                    rs0Var3 = zt0Var2.m0[i41].h;
                    rs0Var3.setPinnedSectionOffsetY(-org.telegram.messenger.i0.L(f10));
                    rs0Var4 = zt0Var2.m0[i41].h;
                    rs0Var4.setPadding(0, org.telegram.messenger.i0.L(54.0f), 0, 0);
                    rs0Var5 = zt0Var2.m0[i41].h;
                    rs0Var5.setItemAnimator(null);
                    rs0Var6 = zt0Var2.m0[i41].h;
                    rs0Var6.setClipToPadding(false);
                    rs0Var7 = zt0Var2.m0[i41].h;
                    rs0Var7.setSectionsType(2);
                    rs0Var8 = zt0Var2.m0[i41].h;
                    rs0Var8.setLayoutManager(br0Var2);
                    ss0 ss0Var4 = zt0Var2.m0[i41];
                    rs0Var9 = ss0Var4.h;
                    int i42 = i40;
                    ss0Var4.addView(rs0Var9, w7.b6.c(-1.0f, -1));
                    zt0Var2.m0[i41].n = new rs0(context, null);
                    ss0 ss0Var5 = zt0Var2.m0[i41];
                    rs0 rs0Var20 = ss0Var5.n;
                    er0 er0Var = new er0(zt0Var2);
                    ss0Var5.r = er0Var;
                    rs0Var20.setLayoutManager(er0Var);
                    ss0 ss0Var6 = zt0Var2.m0[i41];
                    ss0Var6.addView(ss0Var6.n, w7.b6.c(-1.0f, -1));
                    zt0Var2.m0[i41].n.setVisibility(8);
                    zt0Var2.m0[i41].n.i(new gr0(ar0Var));
                    rs0Var10 = zt0Var2.m0[i41].h;
                    rs0Var10.i(new hr0(zt0Var2, ar0Var));
                    rs0Var11 = zt0Var2.m0[i41].h;
                    rs0Var11.setOnItemClickListener(new org.telegram.ui.lh(zt0Var2, ar0Var, context, j12, p6Var2, 1));
                    rs0Var12 = zt0Var2.m0[i41].h;
                    rs0Var12.setOnScrollListener(new jr0(zt0Var2, ar0Var, br0Var2));
                    rs0Var13 = zt0Var2.m0[i41].h;
                    rs0Var13.setOnItemLongClickListener(new kr0(zt0Var2, ar0Var));
                    if (i41 == 0 || i42 == -1) {
                        i39 = i17;
                    } else {
                        i39 = i17;
                        br0Var2.h1(i42, i39);
                    }
                    rs0Var14 = zt0Var2.m0[i41].h;
                    zt0Var2.m0[i41].y = new lr0(context, rs0Var14);
                    zt0Var2.m0[i41].y.setVisibility(8);
                    rs0Var15 = zt0Var2.m0[i41].h;
                    lr0 lr0Var = zt0Var2.m0[i41].y;
                    FrameLayout.LayoutParams c10 = w7.b6.c(-1.0f, -1);
                    if (rs0Var15.b1 == null) {
                        rs0Var15.b1 = new jg.l0(rs0Var15, rs0Var15.getContext(), 21);
                    }
                    rs0Var15.b1.addView(lr0Var, c10);
                    zt0Var2.m0[i41].s = new mr0(zt0Var2, context, ar0Var);
                    zt0Var2.m0[i41].s.x = false;
                    zt0Var2.m0[i41].s.setClipToOutline(true);
                    zt0Var2.m0[i41].s.setOutlineProvider(new nr0());
                    if (i41 == 0) {
                        zt0Var2.m0[i41].setVisibility(8);
                    }
                    ss0 ss0Var7 = zt0Var2.m0[i41];
                    ss0Var7.w = new or0(zt0Var2, context, ss0Var7.s);
                    dw0Var = zt0Var2.m0[i41].w;
                    dw0Var.d(8, false);
                    dw0Var2 = zt0Var2.m0[i41].w;
                    dw0Var2.setAnimateLayoutChange(true);
                    ss0 ss0Var8 = zt0Var2.m0[i41];
                    dw0Var3 = ss0Var8.w;
                    ss0Var8.addView(dw0Var3, w7.b6.c(-1.0f, -1));
                    dw0Var4 = zt0Var2.m0[i41].w;
                    dw0Var4.setOnTouchListener(new org.telegram.ui.ActionBar.n2(22));
                    dw0Var5 = zt0Var2.m0[i41].w;
                    dw0Var5.e(true, false);
                    dw0Var6 = zt0Var2.m0[i41].w;
                    dw0Var6.d.setText(org.telegram.messenger.cd.L0(2131748183, "NoResult"));
                    dw0Var7 = zt0Var2.m0[i41].w;
                    dw0Var7.f.setVisibility(8);
                    dw0Var8 = zt0Var2.m0[i41].w;
                    dw0Var8.e.setText(org.telegram.messenger.cd.K0(2131745824));
                    dw0Var9 = zt0Var2.m0[i41].w;
                    dw0Var9.f.setVisibility(8);
                    dw0Var10 = zt0Var2.m0[i41].w;
                    dw0Var10.addView(zt0Var2.m0[i41].s, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 12.0f, 60.0f, 12.0f, 12.0f));
                    rs0Var16 = zt0Var2.m0[i41].h;
                    dw0Var11 = zt0Var2.m0[i41].w;
                    rs0Var16.setEmptyView(dw0Var11);
                    rs0Var17 = zt0Var2.m0[i41].h;
                    rs0Var17.o1(0, true);
                    ss0[] ss0VarArr2 = zt0Var2.m0;
                    ss0 ss0Var9 = ss0VarArr2[i41];
                    rs0Var18 = ss0VarArr2[i41].h;
                    ss0Var9.D = new vj0(rs0Var18, zt0Var2.m0[i41].x);
                    i41++;
                    p6Var2 = p6Var;
                    i40 = i42;
                    i15 = 1;
                    j12 = j10;
                }
            }
            i16 = i39;
            ar0 ar0Var2 = new ar0(zt0Var2, context);
            zt0Var2.addView(ar0Var2, w7.b6.d(-1, -1.0f, 51, 0.0f, zt0Var2.K0(), 0.0f, 0.0f));
            if (i41 == i15) {
            }
            zt0Var2.m0[i41] = ar0Var2;
            ar0Var2.N = p6Var2;
            ss0 ss0Var22 = zt0Var2.m0[i41];
            br0 br0Var22 = new br0(zt0Var2, ar0Var2);
            ss0Var22.x = br0Var22;
            br0Var22.z1(new cr0(zt0Var2, ar0Var2));
            zt0Var2.m0[i41].d = new s4.j();
            i17 = i16;
            zt0Var2.m0[i41].d.n(280L);
            zt0Var2.m0[i41].d.o(gr.h);
            ss0 ss0Var32 = zt0Var2.m0[i41];
            ss0Var32.d.m = false;
            ss0Var32.h = new dr0(zt0Var2, context, ar0Var2, br0Var22);
            rs0Var = zt0Var2.m0[i41].h;
            rs0Var.setFastScrollEnabled(1);
            rs0Var2 = zt0Var2.m0[i41].h;
            rs0Var2.setScrollingTouchSlop(1);
            rs0Var3 = zt0Var2.m0[i41].h;
            rs0Var3.setPinnedSectionOffsetY(-org.telegram.messenger.i0.L(f10));
            rs0Var4 = zt0Var2.m0[i41].h;
            rs0Var4.setPadding(0, org.telegram.messenger.i0.L(54.0f), 0, 0);
            rs0Var5 = zt0Var2.m0[i41].h;
            rs0Var5.setItemAnimator(null);
            rs0Var6 = zt0Var2.m0[i41].h;
            rs0Var6.setClipToPadding(false);
            rs0Var7 = zt0Var2.m0[i41].h;
            rs0Var7.setSectionsType(2);
            rs0Var8 = zt0Var2.m0[i41].h;
            rs0Var8.setLayoutManager(br0Var22);
            ss0 ss0Var42 = zt0Var2.m0[i41];
            rs0Var9 = ss0Var42.h;
            int i422 = i40;
            ss0Var42.addView(rs0Var9, w7.b6.c(-1.0f, -1));
            zt0Var2.m0[i41].n = new rs0(context, null);
            ss0 ss0Var52 = zt0Var2.m0[i41];
            rs0 rs0Var202 = ss0Var52.n;
            er0 er0Var2 = new er0(zt0Var2);
            ss0Var52.r = er0Var2;
            rs0Var202.setLayoutManager(er0Var2);
            ss0 ss0Var62 = zt0Var2.m0[i41];
            ss0Var62.addView(ss0Var62.n, w7.b6.c(-1.0f, -1));
            zt0Var2.m0[i41].n.setVisibility(8);
            zt0Var2.m0[i41].n.i(new gr0(ar0Var2));
            rs0Var10 = zt0Var2.m0[i41].h;
            rs0Var10.i(new hr0(zt0Var2, ar0Var2));
            rs0Var11 = zt0Var2.m0[i41].h;
            rs0Var11.setOnItemClickListener(new org.telegram.ui.lh(zt0Var2, ar0Var2, context, j12, p6Var2, 1));
            rs0Var12 = zt0Var2.m0[i41].h;
            rs0Var12.setOnScrollListener(new jr0(zt0Var2, ar0Var2, br0Var22));
            rs0Var13 = zt0Var2.m0[i41].h;
            rs0Var13.setOnItemLongClickListener(new kr0(zt0Var2, ar0Var2));
            if (i41 == 0) {
            }
            i39 = i17;
            rs0Var14 = zt0Var2.m0[i41].h;
            zt0Var2.m0[i41].y = new lr0(context, rs0Var14);
            zt0Var2.m0[i41].y.setVisibility(8);
            rs0Var15 = zt0Var2.m0[i41].h;
            lr0 lr0Var2 = zt0Var2.m0[i41].y;
            FrameLayout.LayoutParams c102 = w7.b6.c(-1.0f, -1);
            if (rs0Var15.b1 == null) {
            }
            rs0Var15.b1.addView(lr0Var2, c102);
            zt0Var2.m0[i41].s = new mr0(zt0Var2, context, ar0Var2);
            zt0Var2.m0[i41].s.x = false;
            zt0Var2.m0[i41].s.setClipToOutline(true);
            zt0Var2.m0[i41].s.setOutlineProvider(new nr0());
            if (i41 == 0) {
            }
            ss0 ss0Var72 = zt0Var2.m0[i41];
            ss0Var72.w = new or0(zt0Var2, context, ss0Var72.s);
            dw0Var = zt0Var2.m0[i41].w;
            dw0Var.d(8, false);
            dw0Var2 = zt0Var2.m0[i41].w;
            dw0Var2.setAnimateLayoutChange(true);
            ss0 ss0Var82 = zt0Var2.m0[i41];
            dw0Var3 = ss0Var82.w;
            ss0Var82.addView(dw0Var3, w7.b6.c(-1.0f, -1));
            dw0Var4 = zt0Var2.m0[i41].w;
            dw0Var4.setOnTouchListener(new org.telegram.ui.ActionBar.n2(22));
            dw0Var5 = zt0Var2.m0[i41].w;
            dw0Var5.e(true, false);
            dw0Var6 = zt0Var2.m0[i41].w;
            dw0Var6.d.setText(org.telegram.messenger.cd.L0(2131748183, "NoResult"));
            dw0Var7 = zt0Var2.m0[i41].w;
            dw0Var7.f.setVisibility(8);
            dw0Var8 = zt0Var2.m0[i41].w;
            dw0Var8.e.setText(org.telegram.messenger.cd.K0(2131745824));
            dw0Var9 = zt0Var2.m0[i41].w;
            dw0Var9.f.setVisibility(8);
            dw0Var10 = zt0Var2.m0[i41].w;
            dw0Var10.addView(zt0Var2.m0[i41].s, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 12.0f, 60.0f, 12.0f, 12.0f));
            rs0Var16 = zt0Var2.m0[i41].h;
            dw0Var11 = zt0Var2.m0[i41].w;
            rs0Var16.setEmptyView(dw0Var11);
            rs0Var17 = zt0Var2.m0[i41].h;
            rs0Var17.o1(0, true);
            ss0[] ss0VarArr22 = zt0Var2.m0;
            ss0 ss0Var92 = ss0VarArr22[i41];
            rs0Var18 = ss0VarArr22[i41].h;
            ss0Var92.D = new vj0(rs0Var18, zt0Var2.m0[i41].x);
            i41++;
            p6Var2 = p6Var;
            i40 = i422;
            i15 = 1;
            j12 = j10;
        }
        View view = zt0Var2.b0;
        if (view != null) {
            zt0Var2.addView(view, w7.b6.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context);
        zt0Var2.M0 = s0Var;
        s0Var.e0((int) (System.currentTimeMillis() / 1000), false, false);
        s0Var.setAlpha(0.0f);
        int i43 = org.telegram.ui.ActionBar.t6.kd;
        int i44 = org.telegram.ui.ActionBar.t6.Yd;
        s0Var.T0 = i43;
        s0Var.U0 = i44;
        s0Var.setTranslationY(-org.telegram.messenger.i0.L(48.0f));
        zt0Var2.addView(s0Var, w7.b6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        if (zt0Var2.W()) {
            r14 = 0;
            zt0Var = zt0Var2;
        } else {
            wg.d m10 = zt0Var2.H != null ? w7.b9.m(p6Var) : w7.b9.o(p6Var);
            zr zrVar = new zr(context);
            zt0Var2.R0 = zrVar;
            int L = org.telegram.messenger.i0.L(11.0f);
            int i45 = v2;
            zrVar.setPadding(L, i45, org.telegram.messenger.i0.L(11.0f), i45);
            vg.f b11 = bVar3.b(zrVar, m10);
            b11.q(org.telegram.messenger.i0.L(24.0f));
            b11.p(org.telegram.messenger.i0.L(7.0f));
            zrVar.setBlurredBackground(b11);
            FrameLayout frameLayout = new FrameLayout(context);
            zt0Var2.S0 = frameLayout;
            zrVar.addView(frameLayout);
            zrVar.i(frameLayout, true, false);
            zrVar.setOnAnimatedHeightChangedListener(new vp0(zt0Var2, 0));
            pr0 pr0Var = new pr0(zt0Var2, context, k2Var, this, p6Var);
            zt0Var2.T0 = pr0Var;
            frameLayout.addView(pr0Var);
            zrVar.setCallFragmentContextView(pr0Var);
            zt0Var2.addView(zrVar, w7.b6.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
            pr0Var.setDelegate(new wp0(zt0Var2));
            vg.f b12 = bVar3.b(zt0Var2.K0, m10);
            org.telegram.messenger.z20.u(b12, org.telegram.messenger.i0.L(18.0f), 6.666f);
            zt0Var2.K0.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f));
            zt0Var2.K0.setClipToPadding(false);
            zt0Var2.K0.setBackground(null);
            zt0Var2.K0.setBlurredBackground(b12);
            zt0Var2.K0.setOpen(false);
            zt0Var2.addView(zt0Var2.K0, w7.b6.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
            Context context2 = zt0Var2.getContext();
            org.telegram.ui.ActionBar.k2 k2Var3 = zt0Var2.x1;
            rr0 rr0Var3 = new rr0(zt0Var2, context2, k2Var3, k2Var3.getCurrentAccount(), zt0Var2.v0() ? 0L : zt0Var2.l1, p6Var);
            zt0 zt0Var3 = zt0Var2;
            zt0Var3.L0 = rr0Var3;
            rr0Var3.d(bVar3, m10);
            rr0Var3.setShown(0.0f);
            zt0Var3.addView(rr0Var3, w7.b6.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
            if (zt0Var3.H == null) {
                vg.f b13 = bVar3.b(zt0Var3.D0, m10);
                org.telegram.messenger.z20.u(b13, org.telegram.messenger.i0.L(18.0f), 6.666f);
                zt0Var3.D0.setBackground(b13);
                z11 = false;
                zt0Var3.D0.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                zt0Var3.addView(zt0Var3.D0, w7.b6.e(-1, 50, 51));
            } else {
                z11 = false;
            }
            zt0Var3.F();
            zt0Var = zt0Var3;
            r14 = z11;
        }
        zt0Var.K1(r14);
        zt0Var.w1(r14);
        zt0Var.P(r14, r14);
        if (zt0Var.Z0[r14] >= 0) {
            zt0Var.I0(r14);
        }
        zq0 zq0Var = zt0Var.b0;
        if (zq0Var == null || i12 <= 0) {
            return;
        }
        zq0Var.setInitialTabId(i12);
    }

    public static boolean F0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public static p3 V(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        p3 p3Var = new p3(context, p6Var);
        ImageView imageView = (ImageView) p3Var.d;
        TextView textView = (TextView) p3Var.c;
        if (i10 == 0) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748213, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748215, null));
            return p3Var;
        }
        if (i10 == 1) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748173, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748174, null));
            return p3Var;
        }
        if (i10 == 2) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748168, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748169, null));
            return p3Var;
        }
        if (i10 == 3) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748170, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748171, null));
            return p3Var;
        }
        if (i10 == 4) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748175, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748176, null));
            return p3Var;
        }
        if (i10 == 5) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748172, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748225, null));
            return p3Var;
        }
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.cd.L0(2131748223, null));
            return p3Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return p3Var;
    }

    public static void a(zt0 zt0Var, TL_stories.StoryItem storyItem, th.y4 y4Var) {
        zt0Var.getStoriesController().c(y4Var.a, zt0Var.l1, storyItem);
        org.telegram.messenger.i0.h3(new gi0(7, zt0Var, y4Var), 100L);
    }

    public static void d(zt0 zt0Var, long j10, int i10, String str) {
        th.t4 B = zt0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((th.y4) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.vp.r1(i11).i1(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void e(zt0 zt0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        ji0 ji0Var = new ji0(zt0Var, i10, storyItem, 2);
        th.e5 storiesController = zt0Var.getStoriesController();
        long j10 = zt0Var.l1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i10, j10, arrayList);
        cc.a0(zt0Var.x1).K(R.raw.chats_archived, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.cd.L0(2131743910, null), ji0Var).j();
    }

    public static void g(zt0 zt0Var, long j10, int i10) {
        th.t4 B = zt0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        th.y4 y4Var = (th.y4) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.vp.r1(i11).i1(B.b);
        tL_deleteAlbum.album_id = y4Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public th.e5 getStoriesController() {
        return org.telegram.messenger.vp.r1(this.x1.getCurrentAccount()).O1();
    }

    public static /* synthetic */ void h(zt0 zt0Var, TL_stories.StoryItem storyItem) {
        zt0Var.getStoriesController().r0(zt0Var.l1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        cc.a0(zt0Var.x1).G(R.raw.chats_archived, 5000, org.telegram.messenger.cd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(zt0 zt0Var, HashSet hashSet, TL_stories.StoryItem storyItem, z60 z60Var, th.y4 y4Var) {
        String a02;
        long j10 = zt0Var.l1;
        if (hashSet.contains(Integer.valueOf(y4Var.a))) {
            zt0Var.getStoriesController().c(y4Var.a, j10, storyItem);
            a02 = org.telegram.messenger.cd.a0(null, null, 2131744749, y4Var.b);
        } else {
            th.e5 storiesController = zt0Var.getStoriesController();
            int i10 = y4Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i10, j10, arrayList);
            a02 = org.telegram.messenger.cd.a0(null, null, 2131744520, y4Var.b);
        }
        cc.a0(zt0Var.x1).Q(R.raw.contact_check, 36, org.telegram.messenger.i0.W2(a02)).j();
        z60Var.u();
    }

    public static void k1(int i10, View view) {
        if (view == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.topMargin != i10) {
            marginLayoutParams.topMargin = i10;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static TLRPC.ProfileTab m0(int i10, boolean z10) {
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

    public static int n(View view) {
        if (view instanceof org.telegram.ui.Cells.s7) {
            return ((org.telegram.ui.Cells.s7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            return ((org.telegram.ui.Cells.l7) view).getMessage().f1();
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            return ((org.telegram.ui.Cells.k7) view).getMessage().f1();
        }
        return 0;
    }

    public static int n0(TLRPC.ProfileTab profileTab) {
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

    public static void p(ss0 ss0Var, ot0[] ot0VarArr, boolean z10) {
        gi0 gi0Var;
        if (!z10) {
            if (ss0Var.F == null || (gi0Var = ss0Var.G) == null) {
                return;
            }
            org.telegram.messenger.i0.r(gi0Var);
            ss0Var.G.run();
            ss0Var.G = null;
            ss0Var.F = null;
            return;
        }
        if (org.telegram.messenger.tz.v1 <= 0 || ss0Var.F != null || ss0Var.H || ss0Var.h.getFastScroll() == null || !ss0Var.h.getFastScroll().a0 || ss0Var.h.getFastScroll().getVisibility() != 0 || ot0VarArr[0].e() < 50) {
            return;
        }
        int i10 = org.telegram.messenger.tz.v1;
        int i11 = i10 - 1;
        if (i10 != i11) {
            org.telegram.messenger.tz.v1 = i11;
            org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.tz.v1).apply();
        }
        ss0Var.H = true;
        Context context = ss0Var.getContext();
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 22);
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(2131745426, null));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i12 = org.telegram.ui.ActionBar.t6.dg;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        int L = org.telegram.messenger.i0.L(6.0f);
        int i13 = org.telegram.ui.ActionBar.t6.eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        a5Var.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(a5Var, d02, N, null, null);
        a5Var.addView(textView, w7.b6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        tp0 tp0Var = new tp0(context);
        tp0Var.a = new Random();
        Paint paint = new Paint(1);
        tp0Var.b = paint;
        Paint paint2 = new Paint(1);
        tp0Var.c = paint2;
        tp0Var.f = 1.0f;
        tp0Var.h = 0.0f;
        paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        Paint paint3 = new Paint();
        tp0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.i0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        tp0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        a5Var.addView(tp0Var, w7.b6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        ss0Var.F = a5Var;
        ss0Var.addView(a5Var, w7.b6.c(-2.0f, -2));
        ss0Var.F.setAlpha(0.0f);
        ss0Var.F.setScaleX(0.8f);
        ss0Var.F.setScaleY(0.8f);
        ss0Var.F.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        ss0Var.invalidate();
        gi0 gi0Var2 = new gi0(8, ss0Var, a5Var);
        ss0Var.G = gi0Var2;
        org.telegram.messenger.i0.h3(gi0Var2, 4000L);
    }

    public static void s(zt0 zt0Var, int i10, boolean z10) {
        ss0[] ss0VarArr = zt0Var.m0;
        if (ss0VarArr[0].E == i10) {
            return;
        }
        ss0 ss0Var = ss0VarArr[1];
        ss0Var.E = i10;
        ss0Var.setVisibility(0);
        zt0Var.u0();
        zt0Var.w1(true);
        zt0Var.j1 = z10;
        zt0Var.T0();
        zt0Var.D(!zt0Var.B0(i10));
        zt0Var.D1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.setEnabled(z10);
        } else {
            this.G.setEnabled(z10);
        }
    }

    private void setPageOverscan(rs0 rs0Var) {
        if (!this.b2 || rs0Var == null) {
            return;
        }
        rs0Var.i3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rs0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            int i10 = marginLayoutParams.topMargin;
            int i11 = -this.d2;
            if (i10 == i11 && marginLayoutParams.bottomMargin == (-this.e2)) {
                return;
            }
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = -this.e2;
            rs0Var.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchItemVisibility(int i10) {
        org.telegram.ui.ActionBar.t0 t0Var = this.p0;
        if (t0Var == null) {
            return;
        }
        if (this.H != null) {
            P(true, true);
        } else {
            t0Var.setVisibility(i10);
        }
    }

    public static int v(zt0 zt0Var, s4.g0 g0Var) {
        if (g0Var == zt0Var.e0) {
            return 8;
        }
        if (g0Var == zt0Var.g0) {
            return 9;
        }
        for (yt0 yt0Var : zt0Var.l2.values()) {
            if (yt0Var.c == g0Var) {
                return yt0Var.a;
            }
        }
        return -1;
    }

    public static int w(zt0 zt0Var, s4.g0 g0Var) {
        if (g0Var == zt0Var.f0) {
            return 8;
        }
        if (g0Var == zt0Var.h0) {
            return 9;
        }
        for (yt0 yt0Var : zt0Var.l2.values()) {
            if (yt0Var.d == g0Var) {
                return yt0Var.a;
            }
        }
        return -1;
    }

    public static boolean x0(int i10) {
        return i10 == 8 || i10 == 9 || F0(i10);
    }

    public final void A(ws0 ws0Var, org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        String n10 = j10 > 0 ? org.telegram.messenger.h20.n(org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).Z1(Long.valueOf(j10))) : org.telegram.messenger.w3.K(org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).L0(Long.valueOf(-j10)), false);
        if (n10 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        c3.i0.r(sb2, org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).U2, "/", n10, "/a/");
        sb2.append(i10);
        ws0Var.k0(R.drawable.media_share, new jg(this, sb2.toString(), k2Var, 20), org.telegram.messenger.cd.L0(2131744806, null), false, true);
    }

    public final boolean A0() {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (this.f1 == null || (k2Var = this.x1) == null) {
            return false;
        }
        return org.telegram.messenger.w3.V(k2Var.getMessagesController().L0(Long.valueOf(this.f1.id)));
    }

    public final void A1(ss0 ss0Var, boolean z10) {
        boolean z11 = ss0Var.b && this.d;
        zj0 fastScroll = ss0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = ss0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ss0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<zj0, Float>) property, fastScroll.getAlpha(), 1.0f);
            ss0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<zj0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new eg.m(fastScroll));
        ss0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public final void B(ws0 ws0Var) {
        final View[] viewArr = new View[2];
        final int i10 = 0;
        viewArr[0] = ws0Var.k0(R.drawable.msg_zoomin, new Runnable(this) { // from class: org.telegram.ui.Components.kq0
            public final /* synthetic */ zt0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        zt0 zt0Var = this.b;
                        zt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        zt0Var.L1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        zt0 zt0Var2 = this.b;
                        zt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        zt0Var2.M1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.cd.L0(2131748665, null), false, false);
        final int i11 = 1;
        viewArr[1] = ws0Var.k0(R.drawable.msg_zoomout, new Runnable(this) { // from class: org.telegram.ui.Components.kq0
            public final /* synthetic */ zt0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        zt0 zt0Var = this.b;
                        zt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        zt0Var.L1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        zt0 zt0Var2 = this.b;
                        zt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        zt0Var2.M1(viewArr3[0], viewArr3[1]);
                        break;
                }
            }
        }, org.telegram.messenger.cd.L0(2131748664, null), false, false);
        View view = viewArr[0];
        if (view != null) {
            view.setEnabled(I());
            viewArr[0].setAlpha(I() ? 1.0f : 0.5f);
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            view2.setEnabled(J());
            viewArr[1].setAlpha(J() ? 1.0f : 0.5f);
        }
    }

    public final boolean B0(int i10) {
        return i10 == 7 ? this.F1.X() : (C0() || i10 == 0 || x0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14 || i10 == 15) ? false : true;
    }

    public final void B1() {
        org.telegram.ui.ActionBar.t0 t0Var = this.v0;
        if (t0Var == null) {
            return;
        }
        boolean z10 = this.x1.getMessagesController().z2(this.l1) || s0();
        t0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && t0Var.getBackground() != null) {
            t0Var.setBackground(null);
            return;
        }
        if (z10 || t0Var.getBackground() != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(q0(i10), 5, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        t0Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(t0Var, h02, null, N, this.H1);
    }

    public final void C(rs0 rs0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = rs0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rs0Var.getChildAt(i11);
            if (childAt instanceof zz) {
                view = childAt;
            }
        }
        if (view != null) {
            rs0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new zr0(this, rs0Var, sparseBooleanArray, (zz) view, i10));
    }

    public boolean C0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void C1() {
        vq0 vq0Var = this.a0;
        if (vq0Var != null) {
            int L = org.telegram.messenger.i0.L(48.0f) + this.c2;
            zr zrVar = this.R0;
            vq0Var.setPaddingTop(L + (zrVar != null ? (int) zrVar.c(org.telegram.messenger.i0.L(7.0f)) : 0));
        }
    }

    public final void D(boolean z10) {
        ei0 ei0Var = this.u0;
        if (ei0Var == null || this.Y1 == z10) {
            return;
        }
        this.Y1 = z10;
        if (z10 || ei0Var.getAnimatedDrawable().a0 >= 20) {
            ei0Var.getAnimatedDrawable().P(this.Y1 ? 50 : 100);
        } else {
            ei0Var.getAnimatedDrawable().P(0);
        }
        ei0Var.getAnimatedDrawable().start();
    }

    public boolean D0() {
        return false;
    }

    public final void D1(boolean z10) {
        vq0 vq0Var;
        zq0 zq0Var;
        P(true, true);
        ei0 ei0Var = this.u0;
        if (ei0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.X0 && (((vq0Var = this.a0) == null || !vq0Var.g()) && ((zq0Var = this.b0) == null || !zq0Var.f))) {
            f7 = Utilities.i(this.q0 + this.r0, 1.0f, 0.0f);
        }
        ei0Var.setAlpha(f7);
        if (z10) {
            D(i0(1.0f) > 0.5f);
        } else if (this.z0 == 2) {
            D(this.r0 > 0.1f);
        } else {
            D(this.q0 < 0.1f);
        }
    }

    public final void E(int i10) {
        int i11;
        ss0 e02 = e0(this.r1);
        this.s = -1;
        if (e02 != null) {
            e02.h.C0();
            this.s1 = i10;
            e02.n.setVisibility(0);
            if (x0(this.r1)) {
                e02.n.setAdapter(v1(this.r1));
            } else {
                e02.n.setAdapter(this.K);
            }
            rs0 rs0Var = e02.n;
            int paddingLeft = rs0Var.getPaddingLeft();
            rs0 rs0Var2 = e02.n;
            int h02 = h0(e02.E);
            rs0Var2.g3 = h02;
            int paddingRight = e02.n.getPaddingRight();
            rs0 rs0Var3 = e02.n;
            int g02 = g0(E0());
            rs0Var3.h3 = g02;
            rs0Var.setPadding(paddingLeft, h02, paddingRight, g02);
            e02.r.y1(i10);
            e02.n.a0();
            int i12 = 0;
            while (true) {
                ss0[] ss0VarArr = this.m0;
                if (i12 >= ss0VarArr.length) {
                    break;
                }
                ss0 ss0Var = ss0VarArr[i12];
                if (ss0Var != null && ((i11 = ss0Var.E) == 0 || x0(i11))) {
                    org.telegram.messenger.i0.a4(ss0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.q1 = true;
            if (this.r1 == 0) {
                this.v1[0].g(true);
            }
            this.p1 = 0.0f;
            e1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L1.d();
            ofFloat.addUpdateListener(new tr0(this, e02, i13));
            ofFloat.addListener(new x10(this, x0(e02.E) ? 1 : 0, i10, i13));
            ofFloat.setInterpolator(gr.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public boolean E0() {
        return false;
    }

    public final void E1(ss0 ss0Var) {
        boolean b12 = ss0Var.h.b1();
        if (b12) {
            ss0Var.h.setSectionsDrawBackground(this.b2);
        }
        ss0Var.setDrawPageBackground((!this.b2 || b12 || ss0Var.E == 15) ? false : true);
        if (ss0Var.E != 15) {
            ss0Var.setClipToOutline(false);
            ss0Var.setBackground(null);
            ss0Var.setWallpaper(null);
            return;
        }
        Drawable drawable = ss0Var.O;
        if (drawable == null) {
            drawable = ss0Var.getBackground();
        }
        Drawable e = vh.k4.e(drawable, this.x1.getCurrentAccount(), this.l1, org.telegram.ui.ActionBar.t6.I.q());
        if (this.b2) {
            ss0Var.setBackground(null);
            ss0Var.setClipToOutline(false);
            ss0Var.setWallpaper(e);
        } else {
            ss0Var.setWallpaper(null);
            ss0Var.setBackground(e);
            ss0Var.setOutlineProvider(new bi.d2(15));
            ss0Var.setClipToOutline(true);
        }
    }

    public final void F() {
        int i10 = this.c2;
        int i11 = this.o2;
        k1((org.telegram.messenger.i0.L(6.666f) + i10) - v2, this.R0);
        int i12 = i10 + i11;
        k1(i12, this.K0);
        k1(i12, this.D0);
        k1(org.telegram.messenger.i0.L(52.0f) + i10 + i11, this.M0);
        k1(org.telegram.messenger.i0.L(4.0f) + i10 + i11, this.L0);
        k1(org.telegram.messenger.i0.L(48.0f) + i10 + i11, this.b0);
        if (this.k2 != i11) {
            this.k2 = i11;
            Runnable runnable = this.j2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void F1(ss0 ss0Var) {
        int i10 = ss0Var.E;
        boolean z10 = i10 == 0 || x0(i10);
        FrameLayout.LayoutParams d = w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, z10 ? 0.0f : 12.0f, (z10 ? 8 : 12) + 48, z10 ? 0.0f : 12.0f, z10 ? 0.0f : 12.0f);
        d.topMargin = l0(ss0Var.E) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = ss0Var.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        ss0Var.s.setLayoutParams(d);
    }

    public final boolean G() {
        boolean z02 = z0();
        long j10 = this.l1;
        org.telegram.ui.ActionBar.k2 k2Var = this.x1;
        if (z02) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).Z1(Long.valueOf(j10));
            return Z1 != null && Z1.bot && Z1.bot_can_edit;
        }
        if (E0()) {
            return true;
        }
        return k2Var != null && k2Var.getMessagesController().O1().h(j10);
    }

    public final boolean G0() {
        if (G() && ((getClosestTab() == 8 || getClosestTab() == 13 || F0(getClosestTab())) && this.E1)) {
            return false;
        }
        vq0 vq0Var = this.a0;
        if (vq0Var != null && vq0Var.g()) {
            return false;
        }
        zq0 zq0Var = this.b0;
        return ((zq0Var != null && zq0Var.f) || this.q1 || this.i1) ? false : true;
    }

    public final void G1(boolean z10) {
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 >= ss0VarArr.length) {
                return;
            }
            int childCount = ss0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ss0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.s7) {
                    ((org.telegram.ui.Cells.s7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ((org.telegram.ui.Cells.h2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) childAt).c0(false, z10);
                }
            }
            i10++;
        }
    }

    public boolean H() {
        return !(this instanceof g30);
    }

    public final void H0(int i10, int i11, int i12, boolean z10) {
        ot0[] ot0VarArr = this.v1;
        ot0VarArr[i10].a.clear();
        ot0VarArr[i10].b[0].clear();
        ot0VarArr[i10].b[1].clear();
        ot0 ot0Var = ot0VarArr[i10];
        ot0Var.j[0] = i11;
        ot0Var.i[0] = false;
        ot0Var.l = false;
        ot0Var.m = i12;
        ot0Var.n = (ot0Var.e() - i12) - 1;
        ot0 ot0Var2 = ot0VarArr[i10];
        if (ot0Var2.n < 0) {
            ot0Var2.n = 0;
        }
        ot0Var2.k = i11;
        ot0Var2.o = true;
        ot0Var2.g = false;
        ot0Var2.p++;
        ss0 e02 = e0(i10);
        if (e02 != null && e02.h.getAdapter() != null) {
            e02.h.getAdapter().f();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i13 >= ss0VarArr.length) {
                return;
            }
            ss0 ss0Var = ss0VarArr[i13];
            if (ss0Var.E == i10) {
                ss0Var.x.h1(Math.min(ot0VarArr[i10].e() - 1, ot0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void H1(float f7) {
        org.telegram.ui.ActionBar.t0 t0Var = this.o0;
        if (t0Var == null) {
            return;
        }
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[1];
        float f10 = 0.0f;
        if (ss0Var != null && ss0Var.E == 11) {
            f10 = 0.0f + f7;
        }
        ss0 ss0Var2 = ss0VarArr[0];
        if (ss0Var2 != null && ss0Var2.E == 11) {
            f10 += 1.0f - f7;
        }
        t0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        t0Var.setScaleX(f11);
        t0Var.setScaleY(f11);
        t0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
    }

    public final boolean I() {
        ss0 ss0Var;
        ss0[] ss0VarArr = this.m0;
        if (ss0VarArr != null && (ss0Var = ss0VarArr[0]) != null) {
            boolean x02 = x0(ss0Var.E);
            int i10 = this.o1[x02 ? 1 : 0];
            if (i10 != f0(x02 ? 1 : 0, i10, true)) {
                return true;
            }
        }
        return false;
    }

    public final void I0(boolean z10) {
        long j10 = this.F;
        if (j10 != 0 || C0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = s2[i10];
            ot0[] ot0VarArr = this.v1;
            if (ot0VarArr[i11].h && !z10) {
                return;
            }
            long j11 = this.l1;
            if (org.telegram.messenger.o5.C(j11)) {
                return;
            }
            ot0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = ot0VarArr[i11].q;
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
            org.telegram.ui.ActionBar.k2 k2Var = this.x1;
            tL_messages_getSearchResultsPositions.peer = k2Var.getMessagesController().i1(j11);
            if (j10 != 0 && k2Var.getUserConfig().e() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = k2Var.getMessagesController().i1(j10);
            }
            ConnectionsManager.getInstance(k2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(k2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.de(this, ot0VarArr[i11].p, i11, 2)), k2Var.getClassGuid());
        }
    }

    public final void I1() {
        org.telegram.ui.ActionBar.t0 t0Var = this.o0;
        if (t0Var == null) {
            return;
        }
        ss0 ss0Var = this.m0[1];
        boolean z10 = ss0Var != null && ss0Var.E == 11;
        if (z10) {
            t0Var.setVisibility(0);
        }
        t0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new k2.v(19, this, z10)).setDuration(420L).setInterpolator(gr.h).start();
    }

    public final boolean J() {
        ss0 ss0Var;
        ss0[] ss0VarArr = this.m0;
        if (ss0VarArr == null || (ss0Var = ss0VarArr[0]) == null) {
            return false;
        }
        if (this.m1 && x0(ss0Var.E)) {
            return false;
        }
        boolean x02 = x0(ss0VarArr[0].E);
        int i10 = this.o1[x02 ? 1 : 0];
        return i10 != f0(x02 ? 1 : 0, i10, false);
    }

    public final void J0(int i10) {
        int i11;
        int i12 = 2;
        ot0[] ot0VarArr = this.v1;
        if (i10 == 0) {
            int i13 = ot0VarArr[0].q;
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
        ot0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.k2 k2Var = this.x1;
        k2Var.getMediaDataController().N0(this.l1, 50, 0, ot0VarArr[i10].k, i11, this.F, 1, k2Var.getClassGuid(), ot0VarArr[i10].p, null, null);
    }

    public final void J1() {
        boolean z10;
        th.x4 x4Var;
        boolean z02 = z0();
        org.telegram.ui.ActionBar.t0 t0Var = this.y0;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.x0;
        if (z02) {
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            if (t0Var != null) {
                t0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            if (t0Var != null) {
                t0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (F0(getClosestTab())) {
                if (t0Var2 != null) {
                    t0Var2.setVisibility(8);
                }
                if (t0Var != null) {
                    t0Var.setVisibility(8);
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
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[0].valueAt(i10);
            hs0 hs0Var = this.e0;
            if (hs0Var != null && (x4Var = hs0Var.s) != null && !x4Var.m(jjVar.f1())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (t0Var2 != null) {
            t0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (t0Var != null) {
            t0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void K(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        uq0 uq0Var;
        fs0 fs0Var;
        vq0 vq0Var;
        ss0[] ss0VarArr = this.m0;
        int length = ss0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            ss0 ss0Var = ss0VarArr[i10];
            if (ss0Var != null && ss0Var.getVisibility() == 0) {
                if (ss0Var.O != null) {
                    RectF rectF2 = this.i2;
                    if (zg.h.c(ss0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        ss0Var.e(canvas);
                        canvas.restore();
                    }
                }
                if (ss0Var.E == 14 && (vq0Var = this.a0) != null && vq0Var.getParent() == ss0Var) {
                    for (View view : vq0Var.h.getViewPages()) {
                        if ((view instanceof ph.f2) && view.getVisibility() == 0) {
                            ii iiVar = ((ph.f2) view).f;
                            yg.d.a(iiVar, canvas, rectF, iiVar, viewGroup);
                        }
                    }
                } else {
                    tk0 currentListView = (ss0Var.E == 12 && (fs0Var = this.V) != null && fs0Var.getParent() == ss0Var) ? fs0Var.a.z0 : (ss0Var.E == 13 && (uq0Var = this.W) != null && uq0Var.getParent() == ss0Var) ? uq0Var.getCurrentListView() : ss0Var.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        yg.d.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public int K0() {
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
    public void K1(boolean z10) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i11;
        boolean E0;
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
        ks0 ks0Var;
        int i12;
        boolean z17;
        int i13;
        int size;
        int i14;
        Boolean bool;
        String L0;
        String str2;
        String L02;
        String str3;
        String str4;
        String str5;
        String str6;
        vq0 vq0Var;
        char c10;
        int i15;
        int i16;
        ArrayList arrayList;
        int i17;
        Object obj;
        boolean z18;
        int i18;
        int i19;
        boolean z19;
        int i20;
        int i21;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        rt0 rt0Var;
        ur0 ur0Var = this.K0;
        if (ur0Var == null) {
            return;
        }
        boolean z20 = !this.F1.s() ? false : z10;
        boolean z21 = (this.V == null || (rt0Var = this.w1) == null || !rt0Var.f) ? false : true;
        long j10 = this.l1;
        int i22 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.k2 k2Var = this.x1;
        if (i22 <= 0 || k2Var == null) {
            i10 = 1;
            user = null;
        } else {
            i10 = 1;
            user = k2Var.getMessagesController().Z1(Long.valueOf(j10));
        }
        boolean z22 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i10 : false;
        int i23 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.g1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z22) ? 0 : i10;
        int i24 = ((org.telegram.messenger.o5.E(j10) || org.telegram.messenger.o5.z(j10)) && !org.telegram.messenger.o5.C(j10) && (((userFull = this.g1) != null && userFull.stories_pinned_available) || (((chatFull = this.f1) != null && chatFull.stories_pinned_available) || E0())) && w0()) ? i10 : 0;
        vq0 vq0Var2 = this.a0;
        int i25 = i23;
        boolean z23 = (vq0Var2 == null || (((userFull3 = this.g1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.f1) == null || chatFull3.stargifts_count <= 0))) ? false : i10;
        int i26 = i24;
        TLRPC.ChatFull chatFull4 = this.f1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.g1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z20;
                int i27 = this.T1 == ur0Var.n0 ? i10 : 0;
                boolean z25 = (i26 == 0 || i25 != 0) ? i10 : false;
                int i28 = i27;
                i11 = z25 == ur0Var.d(8) ? i28 + 1 : i28;
                if (z22 != ur0Var.d(13)) {
                    i11++;
                }
                if (C0() != ur0Var.d(8)) {
                    i11++;
                }
                if (z23 == ur0Var.d(14) || (vq0Var2 != null && z23 && this.S1 != vq0Var2.getLastEmojisHash())) {
                    i11++;
                }
                E0 = E0();
                int i29 = 14;
                ks0 ks0Var2 = this.c0;
                int[] iArr2 = this.Z0;
                if (E0) {
                    z11 = z23;
                    int i30 = i11;
                    int i31 = (ks0Var2.d == null ? i10 : false) == ur0Var.d(7) ? i30 + 1 : i30;
                    if (iArr2[0] <= 0) {
                        z18 = i10;
                        i18 = 0;
                    } else {
                        z18 = false;
                        i18 = 0;
                    }
                    int i32 = i31;
                    int i33 = z18 == ur0Var.d(i18) ? i32 + 1 : i32;
                    if (iArr2[i10] <= 0) {
                        z19 = i10;
                        i19 = z19;
                    } else {
                        i19 = i10;
                        z19 = false;
                    }
                    int i34 = i33;
                    int i35 = z19 == ur0Var.d(i19) ? i34 + 1 : i34;
                    if (org.telegram.messenger.o5.C(j10)) {
                        i20 = i35;
                    } else {
                        int i36 = i35;
                        int i37 = (iArr2[3] <= 0) == ur0Var.d(3) ? i36 + 1 : i36;
                        i20 = (iArr2[4] <= 0) == ur0Var.d(4) ? i37 + 1 : i37;
                    }
                    int i38 = i21;
                    int i39 = (iArr2[2] <= 0) == ur0Var.d(2) ? i38 + 1 : i38;
                    int i40 = (iArr2[5] <= 0) == ur0Var.d(5) ? i39 + 1 : i39;
                    int i41 = (iArr2[6] <= 0) == ur0Var.d(6) ? i40 + 1 : i40;
                    boolean z26 = !this.S.d.isEmpty();
                    int i42 = i41;
                    i11 = z26 != ur0Var.d(10) ? i42 + 1 : i42;
                    z12 = v0() && !k2Var.getMessagesController().F1().b && k2Var.getMessagesController().F1().e();
                    z13 = z26;
                    if (z12 != ur0Var.d(11)) {
                        i11++;
                    }
                    if (z21 != ur0Var.d(12)) {
                        i11++;
                    }
                } else {
                    z11 = z23;
                    z12 = false;
                    z13 = false;
                }
                if (i11 > 0) {
                    if (z24) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        iArr = iArr2;
                        transitionSet.addTransition(new kg.g0(3));
                        z14 = z21;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(ur0Var.getTabsContainer(), transitionSet);
                        ur0Var.U = ur0Var.w;
                        ur0Var.V = ur0Var.x;
                    } else {
                        iArr = iArr2;
                        z14 = z21;
                    }
                    SparseArray f7 = ur0Var.f();
                    if (i11 > 3) {
                        f7 = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (C0()) {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                        arrayList2.add(new Pair(8, org.telegram.messenger.cd.L0(2131746650, null)));
                        ur0Var.b0 = 420L;
                    } else {
                        z15 = z22;
                        z16 = z12;
                        str = null;
                    }
                    if (i25 != 0) {
                        arrayList2.add(new Pair(8, org.telegram.messenger.cd.L0(2131746707, str)));
                    } else if ((org.telegram.messenger.o5.E(j10) || org.telegram.messenger.o5.z(j10)) && !org.telegram.messenger.o5.C(j10) && ((((userFull2 = this.g1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.f1) != null && chatFull2.stories_pinned_available) || E0())) && w0())) {
                        if (y0()) {
                            arrayList2.add(new Pair(9, org.telegram.messenger.cd.L0(2131746740, null)));
                            ks0Var = ks0Var2;
                            ur0Var.b0 = 420L;
                        } else {
                            ks0Var = ks0Var2;
                            arrayList2.add(new Pair(8, org.telegram.messenger.cd.L0(2131746650, null)));
                            if (E0()) {
                                arrayList2.add(new Pair(9, org.telegram.messenger.cd.L0(2131746740, null)));
                            }
                        }
                        if (z11) {
                            i12 = i22;
                            z17 = z14;
                        } else {
                            String L03 = org.telegram.messenger.cd.L0(2131746691, null);
                            HashMap hashMap = ph.j2.U;
                            rh.v5 v5Var = vq0Var2.d;
                            Object obj2 = "";
                            if (v5Var == null) {
                                vq0Var = vq0Var2;
                                str6 = L03;
                                i12 = i22;
                                z17 = z14;
                            } else {
                                ArrayList arrayList3 = v5Var.l;
                                str6 = L03;
                                i12 = i22;
                                z17 = z14;
                                Pair pair = new Pair(Integer.valueOf(org.telegram.messenger.d20.s0), Long.valueOf(vq0Var2.c));
                                if (arrayList3.isEmpty()) {
                                    if (v5Var.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
                                        obj2 = obj;
                                    }
                                    vq0Var = vq0Var2;
                                } else {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList4 = new ArrayList();
                                    int i43 = 0;
                                    while (true) {
                                        vq0Var = vq0Var2;
                                        if (arrayList4.size() >= 3 || i43 >= arrayList3.size()) {
                                            break;
                                        }
                                        TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList3.get(i43)).gift.getDocument();
                                        if (document == null) {
                                            i17 = i43;
                                        } else {
                                            i17 = i43;
                                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                                hashSet.add(Long.valueOf(document.id));
                                                arrayList4.add(document);
                                            }
                                        }
                                        i43 = i17 + 1;
                                        vq0Var2 = vq0Var;
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                        int i44 = 0;
                                        while (i44 < arrayList4.size()) {
                                            TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i44);
                                            String str7 = "😀";
                                            if (document2 == null) {
                                                i16 = i44;
                                                arrayList = arrayList4;
                                            } else {
                                                i16 = i44;
                                                arrayList = arrayList4;
                                                TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) org.telegram.messenger.i0.V(TLRPC.TL_documentAttributeCustomEmoji.class, document2.attributes);
                                                if (tL_documentAttributeCustomEmoji == null || TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt)) {
                                                    TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = (TLRPC.TL_documentAttributeSticker) org.telegram.messenger.i0.V(TLRPC.TL_documentAttributeSticker.class, document2.attributes);
                                                    if (tL_documentAttributeSticker != null && !TextUtils.isEmpty(tL_documentAttributeSticker.alt)) {
                                                        str7 = tL_documentAttributeSticker.alt;
                                                    }
                                                } else {
                                                    str7 = tL_documentAttributeCustomEmoji.alt;
                                                }
                                            }
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                                            spannableStringBuilder2.setSpan(new o5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                            i44 = i16 + 1;
                                            arrayList4 = arrayList;
                                        }
                                        c10 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj2 = spannableStringBuilder;
                                        i15 = 2;
                                        CharSequence[] charSequenceArr = new CharSequence[i15];
                                        charSequenceArr[c10] = str6;
                                        charSequenceArr[1] = obj2;
                                        arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                        this.S1 = vq0Var.getLastEmojisHash();
                                    }
                                }
                            }
                            i15 = 2;
                            c10 = 0;
                            CharSequence[] charSequenceArr2 = new CharSequence[i15];
                            charSequenceArr2[c10] = str6;
                            charSequenceArr2[1] = obj2;
                            arrayList2.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                            this.S1 = vq0Var.getLastEmojisHash();
                        }
                        if (z15) {
                            arrayList2.add(new Pair(13, org.telegram.messenger.cd.L0(2131746707, null)));
                        }
                        int i45 = 2131745420;
                        if (!E0()) {
                            if (z16) {
                                str3 = null;
                                arrayList2.add(new Pair(11, org.telegram.messenger.cd.L0(2131745924, null)));
                            } else {
                                str3 = null;
                            }
                            ks0 ks0Var3 = ks0Var;
                            if (ks0Var3.d != null) {
                                arrayList2.add(new Pair(7, org.telegram.messenger.cd.L0(2131749438, str3)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && ks0Var3.d == null) {
                                    arrayList2.add(new Pair(0, org.telegram.messenger.cd.L0(2131745424, null)));
                                } else {
                                    str4 = null;
                                    arrayList2.add(new Pair(0, org.telegram.messenger.cd.L0(2131745425, null)));
                                    if (z17) {
                                        arrayList2.add(new Pair(12, org.telegram.messenger.cd.L0(2131745910, str4)));
                                        org.telegram.messenger.vp.d1().edit().putInt("savedhint", 3).apply();
                                    }
                                    if (iArr[1] <= 0) {
                                        str5 = null;
                                        arrayList2.add(new Pair(1, org.telegram.messenger.cd.L0(2131745432, null)));
                                    } else {
                                        str5 = null;
                                    }
                                    if (org.telegram.messenger.o5.C(j10)) {
                                        if (iArr[3] > 0) {
                                            arrayList2.add(new Pair(3, org.telegram.messenger.cd.L0(2131745428, str5)));
                                        }
                                        if (iArr[4] > 0) {
                                            arrayList2.add(new Pair(4, org.telegram.messenger.cd.L0(2131745423, str5)));
                                        }
                                        if (iArr[8] > 0) {
                                            arrayList2.add(new Pair(15, org.telegram.messenger.cd.L0(2131745421, str5)));
                                        }
                                    } else if (iArr[4] > 0) {
                                        arrayList2.add(new Pair(4, org.telegram.messenger.cd.L0(2131745423, str5)));
                                    }
                                    if (iArr[2] > 0) {
                                        arrayList2.add(new Pair(2, org.telegram.messenger.cd.L0(2131745420, str5)));
                                    }
                                    if (iArr[5] > 0) {
                                        arrayList2.add(new Pair(5, org.telegram.messenger.cd.L0(2131745431, str5)));
                                    }
                                    if (iArr[6] > 0) {
                                        arrayList2.add(new Pair(6, org.telegram.messenger.cd.L0(2131745430, str5)));
                                    }
                                    if (z13) {
                                        arrayList2.add(new Pair(10, org.telegram.messenger.cd.L0(i12 > 0 ? 2131745336 : 2131745332, null)));
                                    }
                                }
                            }
                            str4 = null;
                            if (z17) {
                            }
                            if (iArr[1] <= 0) {
                            }
                            if (org.telegram.messenger.o5.C(j10)) {
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
                        if (ur0Var.n0) {
                            boolean A0 = A0();
                            int i46 = 0;
                            while (i46 < 15) {
                                if (m0(i46, A0) != null) {
                                    Integer valueOf = Integer.valueOf(i46);
                                    int i47 = 0;
                                    while (true) {
                                        if (i47 >= arrayList2.size()) {
                                            bool = Boolean.FALSE;
                                            break;
                                        } else {
                                            if (((Pair) arrayList2.get(i47)).first == valueOf) {
                                                bool = Boolean.TRUE;
                                                break;
                                            }
                                            i47++;
                                        }
                                    }
                                    if (!bool.booleanValue()) {
                                        Integer valueOf2 = Integer.valueOf(i46);
                                        if (i46 == 0) {
                                            L0 = org.telegram.messenger.cd.L0(2131745424, null);
                                        } else if (i46 == 1) {
                                            L0 = org.telegram.messenger.cd.L0(2131745432, null);
                                        } else if (i46 == 2) {
                                            L0 = org.telegram.messenger.cd.L0(i45, null);
                                        } else if (i46 == 3) {
                                            L0 = org.telegram.messenger.cd.L0(2131745428, null);
                                        } else if (i46 == 4) {
                                            L0 = org.telegram.messenger.cd.L0(2131745423, null);
                                        } else if (i46 != 5) {
                                            if (i46 == 8) {
                                                L02 = org.telegram.messenger.cd.L0(2131746650, null);
                                            } else if (i46 != i29) {
                                                str2 = null;
                                                arrayList2.add(new Pair(valueOf2, str2));
                                                i46++;
                                                i45 = 2131745420;
                                                i29 = 14;
                                            } else {
                                                L02 = org.telegram.messenger.cd.L0(2131746691, null);
                                            }
                                            str2 = L02;
                                            arrayList2.add(new Pair(valueOf2, str2));
                                            i46++;
                                            i45 = 2131745420;
                                            i29 = 14;
                                        } else {
                                            L0 = org.telegram.messenger.cd.L0(2131745431, null);
                                        }
                                        str2 = L0;
                                        arrayList2.add(new Pair(valueOf2, str2));
                                        i46++;
                                        i45 = 2131745420;
                                        i29 = 14;
                                    }
                                }
                                i46++;
                                i45 = 2131745420;
                                i29 = 14;
                            }
                        }
                        if (profileTab != null) {
                            int n02 = n0(profileTab);
                            int i48 = 0;
                            while (true) {
                                if (i48 >= arrayList2.size()) {
                                    i48 = -1;
                                    break;
                                } else if (((Integer) ((Pair) arrayList2.get(i48)).first).intValue() == n02) {
                                    break;
                                } else {
                                    i48++;
                                }
                            }
                            if (i48 >= 0) {
                                i13 = 0;
                                arrayList2.add(0, (Pair) arrayList2.remove(i48));
                                if (!arrayList2.isEmpty()) {
                                    this.U1 = ((Integer) ((Pair) arrayList2.get(i13)).first).intValue();
                                }
                                size = arrayList2.size();
                                i14 = 0;
                                while (i14 < size) {
                                    Object obj3 = arrayList2.get(i14);
                                    i14++;
                                    Pair pair2 = (Pair) obj3;
                                    if (!ur0Var.d(((Integer) pair2.first).intValue())) {
                                        ur0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, f7);
                                    }
                                }
                            }
                        }
                        i13 = 0;
                        if (!arrayList2.isEmpty()) {
                        }
                        size = arrayList2.size();
                        i14 = 0;
                        while (i14 < size) {
                        }
                    }
                    ks0Var = ks0Var2;
                    if (z11) {
                    }
                    if (z15) {
                    }
                    int i452 = 2131745420;
                    if (!E0()) {
                    }
                    if (ur0Var.n0) {
                    }
                    if (profileTab != null) {
                    }
                    i13 = 0;
                    if (!arrayList2.isEmpty()) {
                    }
                    size = arrayList2.size();
                    i14 = 0;
                    while (i14 < size) {
                    }
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                    this.m0[0].E = selectedTab;
                }
                this.T1 = ur0Var.n0;
                ur0Var.c();
                T0();
                Q();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z20;
        if (this.T1 == ur0Var.n0) {
        }
        if (i26 == 0) {
        }
        int i282 = i27;
        if (z25 == ur0Var.d(8)) {
        }
        if (z22 != ur0Var.d(13)) {
        }
        if (C0() != ur0Var.d(8)) {
        }
        if (z23 == ur0Var.d(14)) {
        }
        i11++;
        E0 = E0();
        int i292 = 14;
        ks0 ks0Var22 = this.c0;
        int[] iArr22 = this.Z0;
        if (E0) {
        }
        if (i11 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.T1 = ur0Var.n0;
        ur0Var.c();
        T0();
        Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        zt0 zt0Var;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        ss0 e02 = e0(0);
        if (e02 != null && e02.getMeasuredHeight() > 0 && e02.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(e02.getMeasuredWidth(), e02.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.K1 = true;
                e02.h.draw(new Canvas(bitmap2));
                View view = new View(e02.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                e02.addView(view);
                zt0Var = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new ci.i((Object) zt0Var, (Object) view, (Object) e02, (Object) bitmap2, 2)).start();
                e02.h.setAlpha(0.0f);
                e02.h.animate().alpha(1.0f).setUpdateListener(new r60(e02, 20)).setDuration(200L).start();
                rt0 rt0Var = zt0Var.w1;
                int[] iArr = rt0Var.c;
                arrayList = rt0Var.n[0].a;
                ot0[] ot0VarArr = zt0Var.v1;
                ot0 ot0Var = ot0VarArr[0];
                int[] iArr2 = ot0Var.f;
                iArr2[1] = 0;
                i10 = ot0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                ot0Var.h = false;
                long j10 = zt0Var.l1;
                H0(0, !org.telegram.messenger.o5.C(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                I0(false);
                zt0Var.F1.V();
                boolean C = org.telegram.messenger.o5.C(j10);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i11);
                    ot0 ot0Var2 = ot0VarArr[0];
                    int i12 = ot0Var2.q;
                    if (i12 == 0) {
                        ot0Var2.a(jjVar, 0, false, C);
                    } else if (i12 == 1) {
                        if (org.telegram.messenger.jj.S3(jjVar.k)) {
                            ot0VarArr[0].a(jjVar, 0, false, C);
                        }
                    } else if (!org.telegram.messenger.jj.S3(jjVar.k)) {
                        ot0VarArr[0].a(jjVar, 0, false, C);
                    }
                }
            }
        }
        zt0Var = this;
        rt0 rt0Var2 = zt0Var.w1;
        int[] iArr3 = rt0Var2.c;
        arrayList = rt0Var2.n[0].a;
        ot0[] ot0VarArr2 = zt0Var.v1;
        ot0 ot0Var3 = ot0VarArr2[0];
        int[] iArr22 = ot0Var3.f;
        iArr22[1] = 0;
        i10 = ot0Var3.q;
        if (i10 != 0) {
        }
        ot0Var3.h = false;
        long j102 = zt0Var.l1;
        H0(0, !org.telegram.messenger.o5.C(j102) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        I0(false);
        zt0Var.F1.V();
        boolean C2 = org.telegram.messenger.o5.C(j102);
        while (i11 < arrayList.size()) {
        }
    }

    public final Boolean L1(View view, View view2) {
        if (this.q1) {
            return null;
        }
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[0];
        if (ss0Var == null) {
            return null;
        }
        int i10 = ss0Var.E;
        this.r1 = i10;
        boolean x02 = x0(i10);
        int[] iArr = this.o1;
        int f02 = f0(x02 ? 1 : 0, iArr[x02 ? 1 : 0], true);
        if (view != null && f02 == f0(x02 ? 1 : 0, f02, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[x02 ? 1 : 0] != f02) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!x02) {
                org.telegram.messenger.tz.B(f02);
            } else if (k0(ss0VarArr[0].E) >= 5 || F0(ss0VarArr[0].E)) {
                org.telegram.messenger.tz.F(f02);
            }
            E(f02);
        }
        return Boolean.valueOf(f02 != f0(x02 ? 1 : 0, f02, true));
    }

    public final void M() {
        ur0 ur0Var = this.K0;
        if (ur0Var.d(ur0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = ur0Var.getFirstTabId();
        ur0Var.setInitialTabId(firstTabId);
        this.m0[0].E = firstTabId;
        w1(false);
    }

    public final Boolean M1(View view, View view2) {
        if (this.q1) {
            return null;
        }
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[0];
        if (ss0Var == null) {
            return null;
        }
        if (this.m1 && x0(ss0Var.E)) {
            return null;
        }
        int i10 = ss0VarArr[0].E;
        this.r1 = i10;
        boolean x02 = x0(i10);
        int[] iArr = this.o1;
        int f02 = f0(x02 ? 1 : 0, iArr[x02 ? 1 : 0], false);
        if (view2 != null && f02 == f0(x02 ? 1 : 0, f02, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[x02 ? 1 : 0] != f02) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!x02) {
                org.telegram.messenger.tz.B(f02);
            } else if (k0(ss0VarArr[0].E) >= 5 || F0(ss0VarArr[0].E)) {
                org.telegram.messenger.tz.F(f02);
            }
            E(f02);
        }
        return Boolean.valueOf(f02 != f0(x02 ? 1 : 0, f02, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(ss0 ss0Var, tk0 tk0Var, s4.a0 a0Var) {
        int i10;
        int i11;
        boolean[] zArr;
        s4.c1 K;
        th.x4 x4Var;
        if (this.q1 || this.M1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (tk0Var.getFastScroll() == null || !tk0Var.getFastScroll().n || currentTimeMillis - ss0Var.a >= 300) {
            ss0Var.a = currentTimeMillis;
            if (this.X0 && this.W0 && ss0Var.E != 11) {
                return;
            }
            int i12 = 7;
            if (ss0Var.E == 7) {
                return;
            }
            int L0 = a0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(a0Var.N0() - L0) + 1;
            int b10 = tk0Var.getAdapter() == null ? 0 : tk0Var.getAdapter().b();
            int i13 = ss0Var.E;
            int[] iArr = this.o1;
            ot0[] ot0VarArr = this.v1;
            if (i13 == 0 || i13 == 1 || i13 == 2 || i13 == 4) {
                b10 = ot0VarArr[i13].d() + ot0VarArr[i13].a.size();
                ot0 ot0Var = ot0VarArr[i13];
                if (ot0Var.h && ot0Var.e.size() > 2 && ss0Var.E == 0 && ot0VarArr[i13].a.size() != 0) {
                    float f7 = i13 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((tk0Var.getMeasuredHeight() / (tk0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((xs0) ot0VarArr[i13].e.get(1)).b) {
                        measuredHeight = ((xs0) ot0VarArr[i13].e.get(1)).b;
                    }
                    if ((L0 > b10 && L0 - b10 > measuredHeight) || ((i10 = L0 + abs) < ot0VarArr[i13].m && ot0VarArr[0].m - i10 > measuredHeight)) {
                        ji0 ji0Var = new ji0(this, i13, tk0Var, 3);
                        this.M1 = ji0Var;
                        org.telegram.messenger.i0.g3(ji0Var);
                        return;
                    }
                }
            }
            int i14 = ss0Var.E;
            if (i14 == 7) {
                return;
            }
            if (x0(i14)) {
                wt0 u12 = u1(ss0Var.E);
                if (u12 == null || (x4Var = u12.s) == null || L0 + abs <= x4Var.i() - iArr[1]) {
                    return;
                }
                u12.P();
                return;
            }
            int i15 = ss0Var.E;
            if (i15 == 6) {
                if (abs > 0) {
                    ls0 ls0Var = this.R;
                    boolean z10 = ls0Var.h;
                    ArrayList arrayList = ls0Var.d;
                    if (z10 || ls0Var.e || arrayList.isEmpty() || L0 + abs < b10 - 5) {
                        return;
                    }
                    ls0.E(ls0Var, ((TLRPC.Chat) i0.a.g(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.k2 k2Var = this.x1;
            if (i15 == 11) {
                int i16 = -1;
                for (int i17 = 0; i17 < ss0Var.h.getChildCount(); i17++) {
                    View childAt = ss0Var.h.getChildAt(i17);
                    ss0Var.h.getClass();
                    i16 = Math.max(RecyclerView.R(childAt), i16);
                }
                s4.g0 adapter = ss0Var.h.getAdapter();
                lt0 lt0Var = this.U;
                if (adapter != lt0Var) {
                    if (i16 + 1 >= k2Var.getMessagesController().F1().i.size()) {
                        k2Var.getMessagesController().F1().g(false);
                        return;
                    }
                    return;
                } else {
                    if (i16 + 1 < lt0Var.h.size() + lt0Var.e.size() || lt0Var.s || lt0Var.r) {
                        return;
                    }
                    lt0Var.r = true;
                    lt0Var.F();
                    return;
                }
            }
            if (i15 == 10 || i15 == 12 || i15 == 13 || i15 == 14) {
                return;
            }
            int i18 = i15 == 0 ? 3 : i15 == 5 ? 10 : 6;
            int i19 = i15 == 15 ? 8 : i15;
            if (abs + L0 > b10 - i18 || ot0VarArr[i19].o) {
                ot0 ot0Var2 = ot0VarArr[i19];
                if (!ot0Var2.g) {
                    if (i15 == 0) {
                        int i20 = ot0VarArr[0].q;
                        if (i20 == 1) {
                            i11 = 6;
                        } else {
                            if (i20 != 2) {
                                i11 = 0;
                            }
                            i11 = i12;
                        }
                        zArr = ot0Var2.i;
                        if (zArr[0]) {
                            ot0Var2.g = true;
                            k2Var.getMediaDataController().N0(this.l1, 50, ot0VarArr[i19].j[0], 0, i11, this.F, 1, k2Var.getClassGuid(), ot0VarArr[i19].p, null, null);
                        } else if (this.e1 != 0 && !zArr[1]) {
                            ot0Var2.g = true;
                            k2Var.getMediaDataController().N0(this.e1, 50, ot0VarArr[i19].j[1], 0, i11, this.F, 1, k2Var.getClassGuid(), ot0VarArr[i19].p, null, null);
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
                        zArr = ot0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i21 = ot0VarArr[i19].m;
            if (i19 == 0) {
                i21 = this.J.L(0);
            }
            if (L0 - i21 < i18 + 1) {
                ot0 ot0Var3 = ot0VarArr[i19];
                if (!ot0Var3.g && !ot0Var3.l && !ot0Var3.o) {
                    J0(ss0Var.E);
                }
            }
            ss0 ss0Var2 = this.m0[0];
            if (ss0Var2.h == tk0Var) {
                int i22 = ss0Var2.E;
                if ((i22 != 0 && i22 != 5) || L0 == -1 || (K = tk0Var.K(L0)) == null) {
                    return;
                }
                int i23 = K.f;
                if (i23 == 0 || i23 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.t7;
                    org.telegram.ui.Cells.s0 s0Var = this.M0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.h2) {
                            s0Var.e0(((org.telegram.ui.Cells.h2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        org.telegram.messenger.jj jjVar = t7Var.e <= 0 ? null : t7Var.b[0];
                        if (jjVar != null) {
                            s0Var.e0(jjVar.k.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public final void N0() {
        th.x4 x4Var;
        th.x4 x4Var2;
        this.J1.a();
        hs0 hs0Var = this.e0;
        if (hs0Var != null && (x4Var2 = hs0Var.s) != null && x4Var2 != null) {
            x4Var2.z(hs0Var.w);
        }
        tq0 tq0Var = this.g0;
        if (tq0Var != null && (x4Var = tq0Var.s) != null && x4Var != null) {
            x4Var.z(tq0Var.w);
        }
        Iterator it = this.l2.values().iterator();
        while (it.hasNext()) {
            xt0 xt0Var = ((yt0) it.next()).c;
            th.x4 x4Var3 = xt0Var.s;
            if (x4Var3 != null && x4Var3 != null) {
                x4Var3.z(xt0Var.w);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(MotionEvent motionEvent) {
        uq0 uq0Var;
        ss0[] ss0VarArr = this.m0;
        int i10 = ss0VarArr[0].E;
        if (i10 == 13 && (uq0Var = this.W) != null) {
            View currentView = uq0Var.n.getCurrentView();
            if (currentView instanceof uh.i) {
                uh.i iVar = (uh.i) currentView;
                uh.e eVar = iVar.w;
                uh.c cVar = iVar.f;
                if (iVar.a != null && iVar.getParent() != null) {
                    if (!iVar.b || iVar.K) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (iVar.L && !iVar.K && motionEvent.getPointerCount() == 2) {
                                iVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                iVar.Q = 1.0f;
                                iVar.N = motionEvent.getPointerId(0);
                                iVar.O = motionEvent.getPointerId(1);
                                cVar.I0(false);
                                cVar.cancelLongPress();
                                cVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) iVar.getParent();
                                iVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - iVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - iVar.getY());
                                int i11 = iVar.U;
                                Rect rect = iVar.V;
                                iVar.S = -1;
                                int top = y3 - cVar.getTop();
                                for (int i12 = 0; i12 < cVar.getChildCount(); i12++) {
                                    View childAt = cVar.getChildAt(i12);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, top)) {
                                        iVar.S = RecyclerView.S(childAt);
                                        iVar.T = childAt.getTop();
                                    }
                                }
                                iVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) iVar.getParent()).getY()) - iVar.getY() > 0.0f) {
                                    iVar.L = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (iVar.K || iVar.M)) {
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = 0; i15 < motionEvent.getPointerCount(); i15++) {
                                if (iVar.N == motionEvent.getPointerId(i15)) {
                                    i13 = i15;
                                }
                                if (iVar.O == motionEvent.getPointerId(i15)) {
                                    i14 = i15;
                                }
                            }
                            if (i13 == -1 || i14 == -1) {
                                iVar.L = false;
                                iVar.M = false;
                                iVar.K = false;
                                iVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i14) - motionEvent.getX(i13), motionEvent.getY(i14) - motionEvent.getY(i13))) / iVar.P;
                            iVar.Q = hypot;
                            if (!iVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                iVar.K = true;
                                boolean z10 = hypot > 1.0f;
                                iVar.R = z10;
                                iVar.b(z10);
                            }
                            if (iVar.K) {
                                boolean z11 = iVar.R;
                                if ((!z11 || iVar.Q >= 1.0f) && (z11 || iVar.Q <= 1.0f)) {
                                    iVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.m5.y(2.0f, iVar.Q, 1.0f, 1.0f) : (1.0f - iVar.Q) / 0.5f));
                                } else {
                                    iVar.c = 0.0f;
                                }
                                float f7 = iVar.c;
                                if (f7 == 1.0f || f7 == 0.0f) {
                                    if (f7 == 1.0f) {
                                        int i16 = iVar.e;
                                        int ceil = (((int) Math.ceil(iVar.S / iVar.e)) * i16) + ((int) ((iVar.W.G.B1 / (cVar.getMeasuredWidth() - ((int) (cVar.getMeasuredWidth() / iVar.e)))) * (i16 - 1)));
                                        if (ceil >= eVar.b()) {
                                            ceil = eVar.b() - 1;
                                        }
                                        iVar.S = ceil;
                                    }
                                    iVar.a();
                                    if (iVar.c == 0.0f) {
                                        iVar.R = !iVar.R;
                                    }
                                    iVar.b(iVar.R);
                                    iVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                cVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((iVar.N == motionEvent.getPointerId(0) && iVar.O == motionEvent.getPointerId(1)) || (iVar.N == motionEvent.getPointerId(1) && iVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && iVar.K) {
                            iVar.M = false;
                            iVar.L = false;
                            iVar.K = false;
                            iVar.a();
                        }
                        return iVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || x0(i10)) && getParent() != null) {
            if (!this.q1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        ss0VarArr[0].h.I0(false);
                        ss0VarArr[0].h.cancelLongPress();
                        ss0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - ss0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - ss0VarArr[0].getY());
                        int i17 = this.x;
                        this.s = -1;
                        int top2 = y10 - ss0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.E == 1) {
                            top2 = 0;
                        }
                        for (int i18 = 0; i18 < ss0VarArr[0].h.getChildCount(); i18++) {
                            View childAt2 = ss0VarArr[0].h.getChildAt(i18);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i17, top2)) {
                                ss0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.F1.X() && this.s == -1) {
                            this.s = (int) (((this.o1[x0(ss0VarArr[0].E) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i17 / ss0VarArr[0].h.getMeasuredWidth(), 0.0f))) + ss0VarArr[0].x.L0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - ss0VarArr[0].getY() > this.c2) {
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
                        b0();
                        return false;
                    }
                    float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                    this.n = hypot2;
                    if (!this.a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                        this.a = true;
                        boolean z12 = hypot2 > 1.0f;
                        this.r = z12;
                        o1(z12);
                    }
                    if (this.a) {
                        boolean z13 = this.r;
                        if ((!z13 || this.n >= 1.0f) && (z13 || this.n <= 1.0f)) {
                            this.p1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.m5.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.p1 = 0.0f;
                        }
                        float f10 = this.p1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            s4.g0 u12 = x0(this.r1) ? u1(this.r1) : this.J;
                            if (this.p1 == 1.0f) {
                                int i22 = this.s1;
                                int ceil2 = (((int) Math.ceil(this.s / this.s1)) * i22) + ((int) ((this.B1 / (ss0VarArr[0].h.getMeasuredWidth() - ((int) (ss0VarArr[0].h.getMeasuredWidth() / this.s1)))) * (i22 - 1)));
                                if (ceil2 >= u12.b()) {
                                    ceil2 = u12.b() - 1;
                                }
                                this.s = ceil2;
                            }
                            b0();
                            if (this.p1 == 0.0f) {
                                this.r = !this.r;
                            }
                            o1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        ss0VarArr[0].h.invalidate();
                        ss0 ss0Var = ss0VarArr[0];
                        if (ss0Var.F != null) {
                            ss0Var.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.a) {
                    this.c = false;
                    this.b = false;
                    this.a = false;
                    b0();
                }
                return this.a;
            }
            return true;
        }
        return false;
    }

    public final void O0(int i10, View view, org.telegram.messenger.jj jjVar, int i11) {
        String str;
        if (jjVar == null || this.q1) {
            return;
        }
        zq0 zq0Var = this.b0;
        if (zq0Var == null || !zq0Var.f) {
            int i12 = 0;
            i12 = 0;
            String str2 = null;
            if (this.E1) {
                int i13 = 8;
                if (i11 == 8 && !G()) {
                    return;
                }
                char c10 = org.telegram.messenger.jj.B0(jjVar.k) == this.l1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.b1;
                if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                    sparseArrayArr[c10].remove(jjVar.f1());
                    if (!jjVar.s(null, false)) {
                        this.c1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(jjVar.f1(), jjVar);
                    if (!jjVar.s(null, false)) {
                        this.c1++;
                    }
                }
                L0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    l1(false);
                } else {
                    j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.n0.setVisibility(this.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.t0 t0Var = this.w0;
                    if (t0Var != null) {
                        t0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = this.v0;
                    if (t0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        t0Var2.setVisibility(i13);
                    }
                    J1();
                }
                this.d1 = false;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) view).b(sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) view).b(0, sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) view).f(sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).e(sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    ((org.telegram.ui.Cells.h2) view).c(sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.s7) {
                    ((org.telegram.ui.Cells.s7) view).i(sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0, true);
                }
            } else {
                fr0 fr0Var = this.t1;
                ot0[] ot0VarArr = this.v1;
                org.telegram.ui.ActionBar.k2 k2Var = this.x1;
                if (i11 == 0) {
                    ot0 ot0Var = ot0VarArr[i11];
                    int i14 = i10 - ot0Var.m;
                    if (i14 >= 0 && i14 < ot0Var.a.size()) {
                        PhotoViewer.v1().N2(null, k2Var, null);
                        PhotoViewer.v1().e2(ot0VarArr[i11].a, i14, this.l1, this.e1, this.F, fr0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.v1().N2(null, k2Var, null);
                    int indexOf = ot0VarArr[i11].a.indexOf(jjVar);
                    if (indexOf < 0) {
                        PhotoViewer.v1().e2(org.telegram.messenger.m5.j(jjVar), 0, 0L, 0L, 0L, fr0Var);
                    } else {
                        PhotoViewer.v1().e2(ot0VarArr[i11].a, indexOf, this.l1, this.e1, this.F, fr0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.l7) {
                        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                        TLRPC.Document F0 = jjVar.F0();
                        if (l7Var.G) {
                            if (jjVar.x()) {
                                PhotoViewer.v1().N2(null, k2Var, null);
                                int indexOf2 = ot0VarArr[i11].a.indexOf(jjVar);
                                if (indexOf2 < 0) {
                                    PhotoViewer.v1().e2(org.telegram.messenger.m5.j(jjVar), 0, 0L, 0L, 0L, fr0Var);
                                    return;
                                } else {
                                    PhotoViewer.v1().e2(ot0VarArr[i11].a, indexOf2, this.l1, this.e1, this.F, fr0Var);
                                    return;
                                }
                            }
                            org.telegram.messenger.i0.s2(jjVar, k2Var.getParentActivity(), k2Var);
                        } else if (l7Var.F) {
                            k2Var.getFileLoader().f(F0);
                            l7Var.f(true);
                        } else {
                            org.telegram.messenger.jj message = l7Var.getMessage();
                            message.P = true;
                            k2Var.getFileLoader().X(F0, message, 0, 0);
                            l7Var.f(true);
                        }
                    }
                } else if (i11 == 3) {
                    try {
                        TLRPC.WebPage webPage = org.telegram.messenger.jj.o1(jjVar.k) != null ? org.telegram.messenger.jj.o1(jjVar.k).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.I1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(jjVar) == null) {
                                    k2Var.createArticleViewer(false).L(jjVar, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                hu.K0(k2Var, jjVar, this.t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            Y0(str);
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                } else if (x0(i11)) {
                    wt0 u12 = u1(i11);
                    th.x4 x4Var = u12 != null ? u12.s : null;
                    if (x4Var == null) {
                        return;
                    }
                    th.o7 orCreateStoryViewer = k2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int f12 = jjVar.f1();
                    th.n5 a2 = th.n5.a(this.m0[0].h);
                    a2.e = new px(x4Var, 19);
                    if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).r1) {
                        i12 = org.telegram.messenger.i0.L(68.0f);
                    }
                    a2.s += i12;
                    orCreateStoryViewer.Q(context, f12, x4Var, a2);
                }
            }
            B1();
        }
    }

    public final void P(boolean z10, boolean z11) {
        if (this.H == null) {
            return;
        }
        int closestTab = getClosestTab();
        boolean z12 = false;
        org.telegram.ui.ActionBar.t0 t0Var = this.p0;
        if (t0Var != null) {
            ((org.telegram.ui.ActionBar.p5) t0Var).Y(this.p2 && H() && (B0(closestTab) || (closestTab == 11 && v0())), z10);
        }
        org.telegram.ui.ActionBar.p5 p5Var = this.I;
        if (p5Var != null) {
            if (this.p2 && H() && !y0() && t0(closestTab)) {
                z12 = true;
            }
            p5Var.Y(z12, z11);
        }
    }

    public final boolean P0(org.telegram.messenger.jj jjVar, View view, int i10, boolean z10) {
        zq0 zq0Var;
        final TL_stories.StoryItem storyItem;
        hs0 hs0Var;
        th.x4 x4Var;
        final int i11 = 0;
        if (!this.E1) {
            org.telegram.ui.ActionBar.k2 k2Var = this.x1;
            if (k2Var.getParentActivity() != null && jjVar != null && ((zq0Var = this.b0) == null || !zq0Var.f)) {
                org.telegram.messenger.i0.v1(k2Var.getParentActivity().getCurrentFocus());
                long j10 = this.l1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(F0(getClosestTab()) || getClosestTab() == 8) || this.E1)) {
                    char c10 = org.telegram.messenger.jj.B0(jjVar.k) == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.b1;
                    sparseArrayArr[c10].put(jjVar.f1(), jjVar);
                    if (!jjVar.s(null, false)) {
                        this.c1++;
                    }
                    this.n0.setVisibility(this.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.t0 t0Var = this.w0;
                    if (t0Var != null) {
                        t0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = this.v0;
                    if (t0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        t0Var2.setVisibility(i12);
                    }
                    j1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.P0;
                        if (i14 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i14);
                        org.telegram.messenger.i0.y(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i14++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.d1 = false;
                    if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).b(i10, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).i(true, true);
                    }
                    if (!this.E1) {
                        l1(true);
                    }
                    L0(sparseArrayArr[0]);
                    B1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.s7) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                    s7Var.k(s7Var.n, s7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = jjVar.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean F0 = F0(getClosestTab());
                    z60 I = z60.I(k2Var, view);
                    z60 J = I.J();
                    J.c(R.drawable.ic_ab_back, org.telegram.messenger.cd.L0(2131753756, null), new org.telegram.ui.rr0(I, 27), false);
                    J.k();
                    z60.f(J, getStoriesController().B(j10, true), hashSet, true, new jg(this, storyItem2, I, 19), new ag.m2(this, hashSet, storyItem2, I, 10));
                    I.c(R.drawable.menu_album_add, org.telegram.messenger.cd.L0(2131744823, null), new bi.k(I, J, i12), false);
                    I.k();
                    I.c(R.drawable.msg_select, org.telegram.messenger.cd.L0(2131744807, null), new ag.g3(this, jjVar, view, i10, 23), false);
                    final int i15 = 3;
                    if (F0) {
                        int r12 = r1(getClosestTab());
                        String w9 = getStoriesController().w(r12, j10);
                        I.c(R.drawable.tabs_reorder, org.telegram.messenger.cd.L0(2131744808, null), new yp0(this, r12, i11), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, org.telegram.messenger.cd.L0(2131744809, null), new ag.g3(this, r12, storyItem, w9, 24), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (hs0Var = this.e0) != null && (x4Var = hs0Var.s) != null) {
                            if (x4Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, org.telegram.messenger.cd.L0(2131744805, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i16 = i13;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        zt0 zt0Var = this;
                                        switch (i16) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), zt0Var.H1);
                                                String L0 = org.telegram.messenger.cd.L0(2131751488, null);
                                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                                x1Var.R = L0;
                                                x1Var.T = org.telegram.messenger.cd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new jq0(zt0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new au(24));
                                                x1Var.show();
                                                x1Var.i();
                                                break;
                                            case 1:
                                                zt0Var.getClass();
                                                zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                zt0Var.getClass();
                                                zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                zt0.h(zt0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, org.telegram.messenger.cd.L0(2131744810, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i162 = i16;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        zt0 zt0Var = this;
                                        switch (i162) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), zt0Var.H1);
                                                String L0 = org.telegram.messenger.cd.L0(2131751488, null);
                                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                                x1Var.R = L0;
                                                x1Var.T = org.telegram.messenger.cd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new jq0(zt0Var, storyItem3));
                                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new au(24));
                                                x1Var.show();
                                                x1Var.i();
                                                break;
                                            case 1:
                                                zt0Var.getClass();
                                                zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                zt0Var.getClass();
                                                zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                zt0.h(zt0Var, storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, org.telegram.messenger.cd.L0(2131744815, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i162 = i15;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                zt0 zt0Var = this;
                                switch (i162) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), zt0Var.H1);
                                        String L0 = org.telegram.messenger.cd.L0(2131751488, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.R = L0;
                                        x1Var.T = org.telegram.messenger.cd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new jq0(zt0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new au(24));
                                        x1Var.show();
                                        x1Var.i();
                                        break;
                                    case 1:
                                        zt0Var.getClass();
                                        zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        zt0Var.getClass();
                                        zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        zt0.h(zt0Var, storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i162 = i11;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            zt0 zt0Var = this;
                            switch (i162) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), zt0Var.H1);
                                    String L0 = org.telegram.messenger.cd.L0(2131751488, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L0;
                                    x1Var.T = org.telegram.messenger.cd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new jq0(zt0Var, storyItem3));
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new au(24));
                                    x1Var.show();
                                    x1Var.i();
                                    break;
                                case 1:
                                    zt0Var.getClass();
                                    zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    zt0Var.getClass();
                                    zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    zt0.h(zt0Var, storyItem3);
                                    break;
                            }
                        }
                    }, true);
                    I.i = 3;
                    I.u = true;
                    I.v = true;
                    I.L = true;
                    I.M = 3;
                    Point point = org.telegram.messenger.i0.q;
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

    public final void Q() {
        float abs;
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[0];
        if (ss0Var == null || ss0VarArr[1] == null) {
            return;
        }
        float f7 = 0.0f;
        zq0 zq0Var = this.b0;
        if (zq0Var != null) {
            char c10 = (!x0(ss0Var.E) || ss0VarArr[0].E == 9) ? (char) 0 : (char) 1;
            if (c10 == (ss0VarArr[1].getVisibility() == 0 ? (!x0(ss0VarArr[1].E) || ss0VarArr[1].E == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                zq0Var.setTranslationX(c10 != 0 ? 0.0f : ss0VarArr[0].getMeasuredWidth());
            } else {
                zq0Var.setTranslationX(ss0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(zq0Var.getTranslationX()) / zq0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < ss0VarArr.length; i10++) {
                if (ss0VarArr[i10].getVisibility() == 0) {
                    dr0 dr0Var = ss0VarArr[i10].h;
                    View childAt = dr0Var.getChildCount() == 0 ? null : dr0Var.getChildAt(0);
                    f10 += Utilities.l(1.0f - (ss0VarArr[i10].getTranslationX() / ss0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - dr0Var.getPaddingTop() : dr0Var.getChildCount() == 0 ? 0.0f : -org.telegram.messenger.i0.L(48.0f));
                }
            }
            float l4 = Utilities.l(1.0f - ((-f10) / org.telegram.messenger.i0.N(48.0f)));
            float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, l4);
            zq0Var.setAlpha(l4);
            zq0Var.setScaleX(T1);
            zq0Var.setScaleY(T1);
            zq0Var.setTranslationY(this.N1 + f10);
            f7 = abs;
        }
        S();
        if (this.X1 != f7) {
            this.X1 = f7;
            invalidate();
        }
    }

    public boolean Q0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R() {
        AnimatorSet animatorSet;
        if (!this.i1) {
            return false;
        }
        boolean z10 = this.k1;
        ss0[] ss0VarArr = this.m0;
        if (!z10) {
            if (Math.abs(ss0VarArr[1].getTranslationX()) < 1.0f) {
                ss0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.j1 ? -1 : 1));
                ss0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.h1;
                if (animatorSet != null) {
                }
                this.i1 = false;
            }
            U0(getTabProgress());
            return this.i1;
        }
        if (Math.abs(ss0VarArr[0].getTranslationX()) < 1.0f) {
            ss0VarArr[0].setTranslationX(0.0f);
            ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth() * (this.j1 ? 1 : -1));
            animatorSet = this.h1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.h1 = null;
            }
            this.i1 = false;
        }
        U0(getTabProgress());
        return this.i1;
    }

    public final void R0(float f7) {
        ss0[] ss0VarArr = this.m0;
        if (f7 != 1.0f || ss0VarArr[1].getVisibility() == 0) {
            if (this.j1) {
                ss0VarArr[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth() - (ss0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ss0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f7);
                ss0VarArr[1].setTranslationX((ss0VarArr[0].getMeasuredWidth() * f7) - ss0VarArr[0].getMeasuredWidth());
            }
            U0(getTabProgress());
            float i02 = i0(f7);
            this.r0 = i02;
            this.t0.setVisibility((i02 == 0.0f || !H() || y0()) ? 4 : 0);
            org.telegram.ui.ActionBar.t0 t0Var = this.p0;
            if (t0Var == null || H()) {
                this.q0 = j0(f7);
                I1();
            } else {
                setSearchItemVisibility(E0() ? 8 : 4);
                this.q0 = 0.0f;
            }
            D1(false);
            if (f7 == 1.0f) {
                ss0 ss0Var = ss0VarArr[0];
                ss0VarArr[0] = ss0VarArr[1];
                ss0VarArr[1] = ss0Var;
                ss0Var.setVisibility(8);
                if (t0Var != null && this.z0 == 2) {
                    setSearchItemVisibility(E0() ? 8 : 4);
                }
                this.z0 = 0;
                p1();
            }
        }
    }

    public final void S() {
        zr zrVar = this.R0;
        if (zrVar != null) {
            zrVar.setTranslationY(this.N1);
        }
    }

    public final boolean T(boolean z10) {
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
        L0(sparseArrayArr[0]);
        uq0 uq0Var = this.W;
        if (uq0Var != null) {
            uq0Var.h();
            uq0Var.j();
        }
        l1(false);
        G1(z10);
        it0 it0Var = this.T;
        if (it0Var != null) {
            it0Var.x.clear();
        }
        return true;
    }

    public void T0() {
        boolean z10 = E0() || y0();
        ut0 ut0Var = this.g0.x;
        if (ut0Var != null) {
            ut0Var.b(z10 && getClosestTab() == 9);
        }
        ut0 ut0Var2 = this.e0.x;
        if (ut0Var2 != null) {
            ut0Var2.b(z10 && getClosestTab() == 8);
        }
        for (yt0 yt0Var : this.l2.values()) {
            xt0 xt0Var = yt0Var.c;
            if (xt0Var.s != null) {
                xt0Var.x.b(z10 && getClosestTab() == yt0Var.a);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.p0;
        if (t0Var != null) {
            rr0 rr0Var = this.L0;
            t0Var.setSearchFieldHint(org.telegram.messenger.cd.L0((rr0Var != null && rr0Var.a() && getSelectedTab() == 11) ? 2131745885 : 2131745853, null));
        }
        Q();
        P(true, true);
    }

    public final org.telegram.ui.ActionBar.t0 U(Context context, int i10, int i11, String str) {
        org.telegram.ui.ActionBar.t0 t0Var;
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            t0Var = i5Var.l().b(i10, i11);
        } else {
            int i12 = org.telegram.ui.ActionBar.t6.z8;
            int q02 = q0(i12);
            int i13 = org.telegram.ui.ActionBar.t6.y8;
            org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(context, null, q02, q0(i13), false, null);
            t0Var2.setIcon(i11);
            t0Var2.setDuplicateParentStateEnabled(false);
            this.D0.addView(t0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
            this.P0.add(t0Var2);
            ei0 iconView = t0Var2.getIconView();
            org.telegram.ui.ActionBar.p6 p6Var = this.H1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.a7.t(t0Var2.getIconView(), i13, p6Var, PorterDuff.Mode.SRC_IN);
            }
            if (t0Var2.getBackground() != null) {
                Drawable background = t0Var2.getBackground();
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                t0Var2.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(t0Var2, background, null, N, p6Var);
            }
            t0Var = t0Var2;
        }
        t0Var.setContentDescription(str);
        t0Var.setOnClickListener(new bh.f(this, i10, 13));
        return t0Var;
    }

    public void U0(float f7) {
        M0();
    }

    public final void V0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        new org.telegram.ui.t31(k2Var, j10, this.o1[1], new zb(this, j10, i10)).show();
    }

    public boolean W() {
        return this instanceof g30;
    }

    public final void W0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        s4.u0(k2Var, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744813, getStoriesController().w(i10, j10))), org.telegram.messenger.cd.L0(2131751599, null), true, new org.telegram.messenger.dd(this, j10, i10, 6));
    }

    public final boolean X(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        ss0[] ss0VarArr = this.m0;
        motionEvent.offsetLocation(x10 - ss0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - ss0VarArr[0].getY()) - ss0VarArr[0].h.getFastScroll().getY());
        return ss0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void X0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        String w9 = getStoriesController().w(i10, j10);
        Context context = k2Var.getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j10, i10, 6);
        Pattern pattern = s4.a;
        s4.Q(context, k2Var, org.telegram.messenger.cd.L0(2131744800, null), org.telegram.messenger.cd.L0(2131744799, null), org.telegram.messenger.cd.L0(2131744798, null), w9, 12, org.telegram.messenger.cd.L0(2131746293, null), resourceProvider, dVar);
    }

    public final boolean Y(int i10) {
        ot0[] ot0VarArr = this.w1.n;
        if (ot0VarArr == null) {
            return false;
        }
        ot0[] ot0VarArr2 = this.v1;
        if (i10 == 0) {
            ot0 ot0Var = ot0VarArr2[i10];
            if (!ot0Var.h) {
                int[] iArr = ot0Var.f;
                int[] iArr2 = ot0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ot0VarArr2[i10].f;
            int[] iArr4 = ot0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ot0VarArr2[i10].a.addAll(ot0VarArr[i10].a);
        ot0VarArr2[i10].c.addAll(ot0VarArr[i10].c);
        for (Map.Entry entry : ot0VarArr[i10].d.entrySet()) {
            ot0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            ot0VarArr2[i10].b[i11] = ot0VarArr[i10].b[i11].clone();
            ot0 ot0Var2 = ot0VarArr2[i10];
            int[] iArr5 = ot0Var2.j;
            ot0 ot0Var3 = ot0VarArr[i10];
            iArr5[i11] = ot0Var3.j[i11];
            ot0Var2.i[i11] = ot0Var3.i[i11];
        }
        ot0VarArr2[i10].e.addAll(ot0VarArr[i10].e);
        return !ot0VarArr[i10].a.isEmpty();
    }

    public final void Y0(String str) {
        boolean I3 = org.telegram.messenger.i0.I3(str);
        org.telegram.ui.ActionBar.k2 k2Var = this.x1;
        if (I3) {
            s4.p0(k2Var, str, true, true);
        } else {
            gf.f.r(k2Var.getParentActivity(), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a7  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(int i10, ws0 ws0Var) {
        ?? r16;
        String str;
        ws0 ws0Var2;
        ws0 ws0Var3;
        boolean z10;
        th.x4 x4Var;
        TLRPC.Chat L0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        uq0 uq0Var;
        uq0 uq0Var2;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.b1 b1Var;
        boolean z11;
        ws0 ws0Var4;
        org.telegram.ui.ActionBar.b1 b1Var2;
        org.telegram.ui.ActionBar.b1 b1Var3;
        yt0 t12;
        boolean x02 = x0(i10);
        org.telegram.ui.ActionBar.k2 k2Var = this.x1;
        int currentAccount = k2Var.getCurrentAccount();
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(currentAccount);
        long j10 = this.l1;
        TLRPC.User Z1 = r12.Z1(Long.valueOf(j10));
        boolean i13 = getStoriesController().i(j10);
        int i14 = 3;
        int i15 = 4;
        final int i16 = 1;
        if (F0(i10) && i13 && (t12 = t1(i10)) != null) {
            int i17 = t12.b;
            ws0Var.k0(R.drawable.menu_add_stories, new yp0(this, i17, i16), org.telegram.messenger.cd.L0(2131744816, null), false, true);
            A(ws0Var, k2Var, this.l1, i17);
            ws0Var.k0(R.drawable.tabs_reorder, new yp0(this, i17, i14), org.telegram.messenger.cd.L0(2131744808, null), false, true);
            ws0Var.k0(R.drawable.msg_delete, new yp0(this, i17, i15), org.telegram.messenger.cd.L0(2131744814, null), true, true);
            ws0Var.y();
            B(ws0Var);
            return true;
        }
        int i18 = 9;
        int i19 = 2;
        if (i10 == 14) {
            vq0 vq0Var = this.a0;
            if (vq0Var != null) {
                ph.f2 currentPage = vq0Var.getCurrentPage();
                rh.v5 v5Var = currentPage == null ? null : currentPage.e;
                if (v5Var != null) {
                    long j11 = vq0Var.c;
                    int i20 = vq0Var.b;
                    boolean w9 = j11 == org.telegram.messenger.d20.i(i20).e() ? true : j11 >= 0 ? false : org.telegram.messenger.w3.w(5, org.telegram.messenger.vp.r1(i20).L0(Long.valueOf(-j11)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (v5Var.c) {
                        i12 = 11;
                        b1Var = null;
                        z11 = false;
                    } else {
                        i12 = 11;
                        b1Var = ws0Var.k0(R.drawable.menu_sort_value, new gi0(i18, v5Var, runnableArr), org.telegram.messenger.cd.L0(2131750206, null), false, false);
                        z11 = true;
                    }
                    if (vq0Var.b()) {
                        ws0Var.k0(R.drawable.menu_folder_add, new vp0(this, 10), org.telegram.messenger.cd.L0(2131750107, null), false, true);
                        z11 = true;
                    }
                    if (vq0Var.e.h()) {
                        if (!v5Var.i().isEmpty() || currentPage.d) {
                            ws0Var.k0(R.drawable.tabs_reorder, new vp0(this, i12), org.telegram.messenger.cd.L0(2131750042, null), false, true);
                            ws0Var4 = ws0Var;
                        } else {
                            ws0Var4 = ws0Var;
                        }
                        z11 = true;
                    } else {
                        ws0Var4 = ws0Var;
                    }
                    if (z11) {
                        ws0Var4.y();
                    }
                    org.telegram.ui.ActionBar.b1 D = ws0Var4.D(org.telegram.messenger.cd.L0(2131750204, null));
                    org.telegram.ui.ActionBar.b1 D2 = ws0Var4.D(org.telegram.messenger.cd.L0(2131750208, null));
                    org.telegram.ui.ActionBar.b1 D3 = ws0Var4.D(org.telegram.messenger.cd.L0(2131750203, null));
                    org.telegram.ui.ActionBar.b1 D4 = ws0Var4.D(org.telegram.messenger.cd.L0(2131750205, null));
                    if (w9) {
                        ws0Var4.y();
                        b1Var2 = ws0Var4.D(org.telegram.messenger.cd.L0(2131750210, null));
                        b1Var3 = ws0Var4.D(org.telegram.messenger.cd.L0(2131750209, null));
                    } else {
                        b1Var2 = null;
                        b1Var3 = null;
                    }
                    rh.v5 v5Var2 = v5Var;
                    hq0 hq0Var = new hq0(b1Var, v5Var2, D, D2, D3, D4, w9, b1Var2, b1Var3);
                    org.telegram.ui.ActionBar.b1 b1Var4 = b1Var2;
                    org.telegram.ui.ActionBar.b1 b1Var5 = b1Var3;
                    runnableArr[0] = hq0Var;
                    hq0Var.run();
                    ph.j2.j(D, v5Var2, runnableArr[0], 1);
                    ph.j2.j(D2, v5Var2, runnableArr[0], 2);
                    ph.j2.j(D3, v5Var2, runnableArr[0], 4);
                    ph.j2.j(D4, v5Var2, runnableArr[0], 8);
                    if (w9) {
                        ph.j2.j(b1Var4, v5Var2, runnableArr[0], 256);
                        ph.j2.j(b1Var5, v5Var2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i10 == 13 && Z1 != null && Z1.bot && Z1.bot_has_main_app && Z1.bot_can_edit && (uq0Var = this.W) != null) {
            int itemsCount = uq0Var.getItemsCount();
            if (itemsCount < k2Var.getMessagesController().U5) {
                uq0Var2 = uq0Var;
                i11 = 5;
                ws0Var.k0(R.drawable.msg_addbot, new vp0(this, 3), org.telegram.messenger.cd.L0(2131746730, null), false, true);
            } else {
                uq0Var2 = uq0Var;
                i11 = 5;
            }
            if (itemsCount > 1 && !uq0Var2.d()) {
                ws0Var.k0(R.drawable.tabs_reorder, new vp0(this, 4), org.telegram.messenger.cd.L0(2131746705, null), false, true);
            }
            if (itemsCount > 0) {
                ws0Var.k0(R.drawable.msg_select, new vp0(this, i11), org.telegram.messenger.cd.L0(uq0Var2.d() ? 2131746703 : 2131746704, null), false, true);
            }
            if (!TextUtils.isEmpty(uq0Var2.getCurrentLang())) {
                ws0Var.k0(R.drawable.msg_delete, new vp0(this, 6), org.telegram.messenger.cd.a0(null, null, 2131746706, m31.O0(uq0Var2.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i10 == 11) {
                ws0Var.k0(R.drawable.msg_discussion, new vp0(this, 7), org.telegram.messenger.cd.L0(2131745881, null), false, true);
                ws0Var.y();
                ws0Var.k0(R.drawable.msg_home, new vp0(this, 8), org.telegram.messenger.cd.L0(2131754390, null), false, true);
                ws0Var.k0(R.drawable.msg_delete, new vp0(this, 9), org.telegram.messenger.cd.L0(2131751591, null), false, true);
                return true;
            }
            if ((i10 == 8 || F0(i10)) && i13) {
                r16 = 0;
                str = null;
                ws0Var2 = ws0Var;
                ws0Var2.k0(R.drawable.menu_album_add, new vp0(this, i16), org.telegram.messenger.cd.L0(2131744825, null), false, true);
                ws0Var2.y();
            } else {
                ws0Var2 = ws0Var;
                r16 = 0;
                str = null;
            }
            B(ws0Var2);
            if (!org.telegram.messenger.o5.C(j10) && (Z1 == null || !Z1.bot)) {
                ws0Var2.k0(R.drawable.msg_calendar2, new yp0(this, i10, i19), org.telegram.messenger.cd.L0(2131752642, str), false, true);
                if (this.f1 == null || E0() || (L0 = org.telegram.messenger.vp.r1(currentAccount).L0(Long.valueOf(this.f1.id))) == null || (tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    ws0Var3 = ws0Var;
                } else {
                    ws0Var3 = ws0Var;
                    ws0Var3.k0(R.drawable.msg_archive, new vp0(this, i19), org.telegram.messenger.cd.L0(2131747826, str), false, true);
                }
                ot0[] ot0VarArr = this.v1;
                if (!x02) {
                    ot0 ot0Var = ot0VarArr[r16];
                    if (!ot0Var.w || !ot0Var.v) {
                        boolean[] zArr = ot0Var.i;
                        if (zArr[r16] && zArr[1] && ot0Var.l) {
                            z10 = r16;
                            if (z10) {
                                ws0Var3.y();
                                final org.telegram.ui.ActionBar.b1 D5 = ws0Var3.D(org.telegram.messenger.cd.L0(2131748668, str));
                                final org.telegram.ui.ActionBar.b1 D6 = ws0Var3.D(org.telegram.messenger.cd.L0(2131748667, str));
                                if (!x02) {
                                    int i21 = ot0VarArr[r16].q;
                                    D5.setChecked((i21 == 0 || i21 == 1) ? true : r16);
                                    int i22 = ot0VarArr[r16].q;
                                    D6.setChecked((i22 == 0 || i22 == 2) ? true : r16);
                                    final int i23 = r16;
                                    D5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fq0
                                        public final /* synthetic */ zt0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i23) {
                                                case 0:
                                                    final int i24 = 1;
                                                    final zt0 zt0Var = this.b;
                                                    final org.telegram.ui.ActionBar.b1 b1Var6 = D5;
                                                    final org.telegram.ui.ActionBar.b1 b1Var7 = D6;
                                                    zt0Var.x1(b1Var6, b1Var7, new Runnable() { // from class: org.telegram.ui.Components.lq0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i24) {
                                                                case 0:
                                                                    zt0 zt0Var2 = zt0Var;
                                                                    zt0Var2.v1[0].q = (b1Var6.getCheckView().a.q && b1Var7.getCheckView().a.q) ? 0 : 1;
                                                                    zt0Var2.L();
                                                                    break;
                                                                default:
                                                                    zt0 zt0Var3 = zt0Var;
                                                                    zt0Var3.v1[0].q = (b1Var6.getCheckView().a.q && b1Var7.getCheckView().a.q) ? 0 : 2;
                                                                    zt0Var3.L();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i25 = 0;
                                                    final zt0 zt0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.b1 b1Var8 = D6;
                                                    final org.telegram.ui.ActionBar.b1 b1Var9 = D5;
                                                    zt0Var2.x1(b1Var9, b1Var8, new Runnable() { // from class: org.telegram.ui.Components.lq0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i25) {
                                                                case 0:
                                                                    zt0 zt0Var22 = zt0Var2;
                                                                    zt0Var22.v1[0].q = (b1Var8.getCheckView().a.q && b1Var9.getCheckView().a.q) ? 0 : 1;
                                                                    zt0Var22.L();
                                                                    break;
                                                                default:
                                                                    zt0 zt0Var3 = zt0Var2;
                                                                    zt0Var3.v1[0].q = (b1Var8.getCheckView().a.q && b1Var9.getCheckView().a.q) ? 0 : 2;
                                                                    zt0Var3.L();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    D6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fq0
                                        public final /* synthetic */ zt0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i16) {
                                                case 0:
                                                    final int i24 = 1;
                                                    final zt0 zt0Var = this.b;
                                                    final org.telegram.ui.ActionBar.b1 b1Var6 = D6;
                                                    final org.telegram.ui.ActionBar.b1 b1Var7 = D5;
                                                    zt0Var.x1(b1Var6, b1Var7, new Runnable() { // from class: org.telegram.ui.Components.lq0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i24) {
                                                                case 0:
                                                                    zt0 zt0Var22 = zt0Var;
                                                                    zt0Var22.v1[0].q = (b1Var6.getCheckView().a.q && b1Var7.getCheckView().a.q) ? 0 : 1;
                                                                    zt0Var22.L();
                                                                    break;
                                                                default:
                                                                    zt0 zt0Var3 = zt0Var;
                                                                    zt0Var3.v1[0].q = (b1Var6.getCheckView().a.q && b1Var7.getCheckView().a.q) ? 0 : 2;
                                                                    zt0Var3.L();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i25 = 0;
                                                    final zt0 zt0Var2 = this.b;
                                                    final org.telegram.ui.ActionBar.b1 b1Var8 = D5;
                                                    final org.telegram.ui.ActionBar.b1 b1Var9 = D6;
                                                    zt0Var2.x1(b1Var9, b1Var8, new Runnable() { // from class: org.telegram.ui.Components.lq0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i25) {
                                                                case 0:
                                                                    zt0 zt0Var22 = zt0Var2;
                                                                    zt0Var22.v1[0].q = (b1Var8.getCheckView().a.q && b1Var9.getCheckView().a.q) ? 0 : 1;
                                                                    zt0Var22.L();
                                                                    break;
                                                                default:
                                                                    zt0 zt0Var3 = zt0Var2;
                                                                    zt0Var3.v1[0].q = (b1Var8.getCheckView().a.q && b1Var9.getCheckView().a.q) ? 0 : 2;
                                                                    zt0Var3.L();
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
                                final wt0 u12 = u1(i10);
                                if (u12 != null && (x4Var = u12.s) != null) {
                                    D5.setChecked(x4Var.n);
                                    D6.setChecked(u12.s.o);
                                }
                                final int i24 = 0;
                                D5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.eq0
                                    public final /* synthetic */ zt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i24) {
                                            case 0:
                                                final int i25 = 1;
                                                final wt0 wt0Var = u12;
                                                final org.telegram.ui.ActionBar.b1 b1Var6 = D5;
                                                final org.telegram.ui.ActionBar.b1 b1Var7 = D6;
                                                this.b.x1(b1Var6, b1Var7, new Runnable() { // from class: org.telegram.ui.Components.gq0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        th.x4 x4Var2;
                                                        th.x4 x4Var3;
                                                        switch (i25) {
                                                            case 0:
                                                                wt0 wt0Var2 = wt0Var;
                                                                if (wt0Var2 != null && (x4Var2 = wt0Var2.s) != null) {
                                                                    boolean z12 = b1Var6.getCheckView().a.q;
                                                                    boolean z13 = b1Var7.getCheckView().a.q;
                                                                    x4Var2.n = z12;
                                                                    x4Var2.o = z13;
                                                                    x4Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                wt0 wt0Var3 = wt0Var;
                                                                if (wt0Var3 != null && (x4Var3 = wt0Var3.s) != null) {
                                                                    boolean z14 = b1Var6.getCheckView().a.q;
                                                                    boolean z15 = b1Var7.getCheckView().a.q;
                                                                    x4Var3.n = z14;
                                                                    x4Var3.o = z15;
                                                                    x4Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i26 = 0;
                                                final wt0 wt0Var2 = u12;
                                                final org.telegram.ui.ActionBar.b1 b1Var8 = D6;
                                                final org.telegram.ui.ActionBar.b1 b1Var9 = D5;
                                                this.b.x1(b1Var9, b1Var8, new Runnable() { // from class: org.telegram.ui.Components.gq0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        th.x4 x4Var2;
                                                        th.x4 x4Var3;
                                                        switch (i26) {
                                                            case 0:
                                                                wt0 wt0Var22 = wt0Var2;
                                                                if (wt0Var22 != null && (x4Var2 = wt0Var22.s) != null) {
                                                                    boolean z12 = b1Var8.getCheckView().a.q;
                                                                    boolean z13 = b1Var9.getCheckView().a.q;
                                                                    x4Var2.n = z12;
                                                                    x4Var2.o = z13;
                                                                    x4Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                wt0 wt0Var3 = wt0Var2;
                                                                if (wt0Var3 != null && (x4Var3 = wt0Var3.s) != null) {
                                                                    boolean z14 = b1Var8.getCheckView().a.q;
                                                                    boolean z15 = b1Var9.getCheckView().a.q;
                                                                    x4Var3.n = z14;
                                                                    x4Var3.o = z15;
                                                                    x4Var3.d(true);
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
                                final int i25 = 1;
                                D6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.eq0
                                    public final /* synthetic */ zt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i25) {
                                            case 0:
                                                final int i252 = 1;
                                                final wt0 wt0Var = u12;
                                                final org.telegram.ui.ActionBar.b1 b1Var6 = D6;
                                                final org.telegram.ui.ActionBar.b1 b1Var7 = D5;
                                                this.b.x1(b1Var6, b1Var7, new Runnable() { // from class: org.telegram.ui.Components.gq0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        th.x4 x4Var2;
                                                        th.x4 x4Var3;
                                                        switch (i252) {
                                                            case 0:
                                                                wt0 wt0Var22 = wt0Var;
                                                                if (wt0Var22 != null && (x4Var2 = wt0Var22.s) != null) {
                                                                    boolean z12 = b1Var6.getCheckView().a.q;
                                                                    boolean z13 = b1Var7.getCheckView().a.q;
                                                                    x4Var2.n = z12;
                                                                    x4Var2.o = z13;
                                                                    x4Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                wt0 wt0Var3 = wt0Var;
                                                                if (wt0Var3 != null && (x4Var3 = wt0Var3.s) != null) {
                                                                    boolean z14 = b1Var6.getCheckView().a.q;
                                                                    boolean z15 = b1Var7.getCheckView().a.q;
                                                                    x4Var3.n = z14;
                                                                    x4Var3.o = z15;
                                                                    x4Var3.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            default:
                                                final int i26 = 0;
                                                final wt0 wt0Var2 = u12;
                                                final org.telegram.ui.ActionBar.b1 b1Var8 = D5;
                                                final org.telegram.ui.ActionBar.b1 b1Var9 = D6;
                                                this.b.x1(b1Var9, b1Var8, new Runnable() { // from class: org.telegram.ui.Components.gq0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        th.x4 x4Var2;
                                                        th.x4 x4Var3;
                                                        switch (i26) {
                                                            case 0:
                                                                wt0 wt0Var22 = wt0Var2;
                                                                if (wt0Var22 != null && (x4Var2 = wt0Var22.s) != null) {
                                                                    boolean z12 = b1Var8.getCheckView().a.q;
                                                                    boolean z13 = b1Var9.getCheckView().a.q;
                                                                    x4Var2.n = z12;
                                                                    x4Var2.o = z13;
                                                                    x4Var2.d(true);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                wt0 wt0Var3 = wt0Var2;
                                                                if (wt0Var3 != null && (x4Var3 = wt0Var3.s) != null) {
                                                                    boolean z14 = b1Var8.getCheckView().a.q;
                                                                    boolean z15 = b1Var9.getCheckView().a.q;
                                                                    x4Var3.n = z14;
                                                                    x4Var3.o = z15;
                                                                    x4Var3.d(true);
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

    public int Z0() {
        return -1;
    }

    public final void a0(int i10, tk0 tk0Var, boolean z10) {
        ArrayList arrayList = this.v1[i10].e;
        int L0 = ((s4.a0) tk0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            xs0 xs0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((xs0) arrayList.get(i11)).b) {
                        xs0Var = (xs0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (xs0Var == null) {
                    xs0Var = (xs0) i0.a.g(1, arrayList);
                }
            }
            if (xs0Var != null) {
                H0(i10, xs0Var.d, xs0Var.b + 1, z10);
            }
        }
    }

    public final void a1(ArrayList arrayList, boolean z10) {
        hs0 hs0Var = this.e0;
        if (hs0Var == null || hs0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.x1;
        if (z10 && arrayList.size() > k2Var.getMessagesController().O5) {
            org.telegram.messenger.z20.s(org.telegram.messenger.cd.G(k2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(k2Var), R.raw.chats_infotip, 36);
            return;
        }
        th.x4 x4Var = hs0Var.s;
        int i10 = x4Var.c;
        ArrayList arrayList2 = x4Var.g;
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
        boolean z12 = arrayList3.size() > org.telegram.messenger.vp.r1(i10).O5;
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
                x4Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = org.telegram.messenger.vp.r1(i10).i1(x4Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ag.c3(26));
            }
            z11 = z12;
        }
        if (z11) {
            org.telegram.messenger.z20.s(org.telegram.messenger.cd.G(k2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(k2Var), R.raw.chats_infotip, 36);
        } else if (z10) {
            cc.a0(k2Var).I(R.raw.ic_pin, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.cd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            org.telegram.messenger.z20.s(org.telegram.messenger.cd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), cc.a0(k2Var), R.raw.ic_unpin, 36);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.kd));
    }

    public final void b0() {
        ss0[] ss0VarArr;
        ss0 ss0Var;
        int i10;
        s4.g0 adapter;
        if (this.q1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ss0VarArr = this.m0;
                if (i12 >= ss0VarArr.length) {
                    ss0Var = null;
                    break;
                }
                ss0Var = ss0VarArr[i12];
                if (ss0Var.E == this.r1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (ss0Var != null) {
                boolean x02 = x0(ss0Var.E);
                float f7 = this.p1;
                ot0[] ot0VarArr = this.v1;
                if (f7 != 1.0f) {
                    if (f7 == 0.0f) {
                        this.q1 = false;
                        if (this.r1 == 0) {
                            ot0VarArr[0].g(false);
                        }
                        ss0Var.n.setVisibility(8);
                        ss0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f7 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new tr0(this, ss0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.dj(this, z10, x02 ? 1 : 0, ss0Var));
                    ofFloat.setInterpolator(gr.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.q1 = false;
                int i13 = this.s1;
                int[] iArr = this.o1;
                iArr[x02 ? 1 : 0] = i13;
                if (!x02) {
                    org.telegram.messenger.tz.B(i13);
                } else if (k0(ss0Var.E) >= 5) {
                    org.telegram.messenger.tz.F(this.s1);
                }
                for (int i14 = 0; i14 < ss0VarArr.length; i14++) {
                    ss0 ss0Var2 = ss0VarArr[i14];
                    if (ss0Var2 != null && ss0Var2.h != null && (((i10 = ss0Var2.E) == 0 || x0(i10)) && (adapter = ss0VarArr[i14].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i14 == 0) {
                            ot0VarArr[0].g(false);
                        }
                        ss0VarArr[i14].n.setVisibility(8);
                        ss0VarArr[i14].x.y1(iArr[x02 ? 1 : 0]);
                        ss0VarArr[i14].h.a0();
                        ss0VarArr[i14].h.invalidate();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.i0.a4(ss0VarArr[i14].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    e1();
                    return;
                }
                while (i11 < ss0VarArr.length) {
                    ss0 ss0Var3 = ss0VarArr[i11];
                    if (ss0Var3.E == this.r1) {
                        View m10 = ss0Var3.r.m(this.s);
                        if (m10 != null) {
                            this.w = m10.getTop();
                        }
                        ss0 ss0Var4 = ss0VarArr[i11];
                        ss0Var4.x.h1(this.s, (-ss0Var4.h.getPaddingTop()) + this.w);
                    }
                    i11++;
                }
            }
        }
    }

    public final boolean b1(MotionEvent motionEvent, boolean z10) {
        ss0 ss0Var;
        uq0 uq0Var;
        int closestTab = getClosestTab();
        ur0 ur0Var = this.K0;
        int i10 = -1;
        int i11 = ur0Var.O.get(ur0Var.n + (z10 ? 1 : -1), -1);
        zq0 zq0Var = this.b0;
        if (zq0Var != null) {
            if (F0(closestTab) || closestTab == 8) {
                v71 v71Var = zq0Var.b;
                i10 = v71Var.b0.get(v71Var.F + (z10 ? 1 : -1), -1);
            } else if (F0(i11) || i11 == 8) {
                i10 = zq0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = s1(i10).a;
            }
        }
        if (i11 >= 0) {
            if (this.p0 == null || H()) {
                this.q0 = j0(0.0f);
                H1(0.0f);
            } else {
                setSearchItemVisibility(E0() ? 8 : 4);
                this.q0 = 0.0f;
            }
            if ((!this.X0 || getSelectedTab() != 11) && (!G() || !this.E1 || (getClosestTab() != 8 && !F0(getClosestTab())))) {
                ss0[] ss0VarArr = this.m0;
                ss0 ss0Var2 = ss0VarArr[0];
                if (ss0Var2 != null && ss0Var2.E == 13 && (uq0Var = this.W) != null) {
                    org.telegram.ui.xy0 xy0Var = uq0Var.n;
                    if (!z10) {
                    }
                }
                ss0 ss0Var3 = ss0VarArr[0];
                vq0 vq0Var = this.a0;
                if (ss0Var3 != null && ss0Var3.E == 14 && vq0Var != null) {
                    org.telegram.ui.xy0 xy0Var2 = vq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.E1 || (ss0Var = ss0VarArr[0]) == null || ss0Var.E != 13) && ((vq0Var == null || !vq0Var.g()) && (zq0Var == null || !zq0Var.f))) {
                    D1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    u0();
                    this.A1 = false;
                    this.z1 = true;
                    this.B1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    ur0Var.setEnabled(false);
                    ss0 ss0Var4 = ss0VarArr[1];
                    ss0Var4.E = i11;
                    ss0Var4.setVisibility(0);
                    this.j1 = z10;
                    w1(true);
                    if (z10) {
                        ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth());
                    } else {
                        ss0VarArr[1].setTranslationX(-ss0VarArr[0].getMeasuredWidth());
                    }
                    U0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final void c0(int i10) {
        ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (org.telegram.messenger.i0.Q1() || org.telegram.messenger.w0.b.getResources().getConfiguration().orientation != 2) {
                this.C0.setTextSize(20);
            } else {
                this.C0.setTextSize(18);
            }
        }
        if (i10 == 0) {
            this.J.f();
        }
    }

    public final String d0(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        uq0 uq0Var;
        if (!z0()) {
            return org.telegram.messenger.cd.L0(2131753014, null);
        }
        if (z10 && (uq0Var = this.W) != null) {
            return uq0Var.getBotPreviewsSubtitle();
        }
        hs0 hs0Var = this.e0;
        if (hs0Var == null || hs0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < hs0Var.s.i.size(); i12++) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) hs0Var.s.i.get(i12);
                TL_stories.StoryItem storyItem = jjVar.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.jj.K4(messageMedia.document)) {
                        i11++;
                    } else if (jjVar.l.media.photo != null) {
                        i10++;
                    }
                }
            }
        }
        if (i10 == 0 && i11 == 0) {
            return org.telegram.messenger.cd.L0(2131753014, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            sb2.append(org.telegram.messenger.cd.G(i10, "Images", new Object[0]));
        }
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.cd.G(i11, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final void d1(s4.g0 g0Var) {
        if (g0Var instanceof tt0) {
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
        gt0 gt0Var = this.P;
        if (g0Var == gt0Var) {
            gt0Var.r = null;
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
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        dr0 dr0Var;
        org.telegram.messenger.jj jjVar;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        sk0 sk0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        dr0 dr0Var2;
        int i16;
        int i17;
        dr0 dr0Var3;
        int i18 = org.telegram.messenger.zs.V;
        sk0 sk0Var2 = this.Q;
        sk0 sk0Var3 = this.O;
        nt0 nt0Var = this.L;
        sk0 sk0Var4 = this.N;
        sk0 sk0Var5 = this.M;
        org.telegram.ui.ActionBar.k2 k2Var = this.x1;
        gt0 gt0Var = this.P;
        es0 es0Var = this.J;
        long j10 = this.l1;
        ss0[] ss0VarArr = this.m0;
        ot0[] ot0VarArr = this.v1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != k2Var.getClassGuid() || intValue2 != ot0VarArr[intValue3].p) {
                if (this.w1 == null || !ot0VarArr[intValue3].a.isEmpty() || ot0VarArr[intValue3].o || !Y(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    sk0Var2 = es0Var;
                } else if (intValue3 == 1) {
                    sk0Var2 = sk0Var5;
                } else if (intValue3 == 2) {
                    sk0Var2 = sk0Var4;
                } else if (intValue3 == 3) {
                    sk0Var2 = nt0Var;
                } else if (intValue3 == 4) {
                    sk0Var2 = sk0Var3;
                } else if (intValue3 != 5) {
                    sk0Var2 = intValue3 == 15 ? gt0Var : null;
                }
                if (sk0Var2 != null) {
                    for (int i19 = 0; i19 < ss0VarArr.length; i19++) {
                        ss0 ss0Var = ss0VarArr[i19];
                        if (ss0Var != null && (dr0Var2 = ss0Var.h) != null && dr0Var2.getAdapter() == sk0Var2) {
                            ss0VarArr[i19].h.C0();
                        }
                    }
                    sk0Var2.f();
                }
                this.d1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean C = org.telegram.messenger.o5.C(j10);
            int i20 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                ot0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                sk0Var2 = es0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                sk0Var2 = sk0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                sk0Var2 = sk0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                sk0Var2 = nt0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                sk0Var2 = sk0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                sk0Var2 = gt0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                sk0Var2 = null;
            }
            int size2 = ot0VarArr[i16].a.size();
            if (sk0Var2 != null) {
                i17 = sk0Var2.b();
                if (sk0Var2 instanceof ok0) {
                    ((ok0) sk0Var2).L();
                }
            } else {
                i17 = 0;
            }
            ot0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(size3);
                    if (ot0VarArr[i16].a(jjVar2, i20, r13, C)) {
                        sparseBooleanArray.put(jjVar2.f1(), r13);
                        ot0 ot0Var = ot0VarArr[i16];
                        int i21 = ot0Var.m - r13;
                        ot0Var.m = i21;
                        if (i21 < 0) {
                            ot0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                ot0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                ot0 ot0Var2 = ot0VarArr[i16];
                if (ot0Var2.l) {
                    ot0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList.get(i22);
                    if (ot0VarArr[i16].a(jjVar3, i20, r12, C)) {
                        sparseBooleanArray.put(jjVar3.f1(), true);
                        ot0 ot0Var3 = ot0VarArr[i16];
                        int i23 = ot0Var3.n - 1;
                        ot0Var3.n = i23;
                        if (i23 < 0) {
                            ot0Var3.n = r12;
                        }
                    }
                    i22++;
                    r12 = 0;
                }
                ot0 ot0Var4 = ot0VarArr[i16];
                if (ot0Var4.o && ot0Var4.a.size() > 0) {
                    ot0 ot0Var5 = ot0VarArr[i16];
                    ot0Var5.k = ((org.telegram.messenger.jj) ot0Var5.a.get(0)).f1();
                }
                ot0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                ot0 ot0Var6 = ot0VarArr[i16];
                if (ot0Var6.i[i20]) {
                    int size4 = ot0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += ot0VarArr[i16].m;
                    }
                    ot0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                ot0 ot0Var7 = ot0VarArr[i16];
                if (ot0Var7.i[i20] && this.e1 != 0) {
                    ot0Var7.g = true;
                    k2Var.getMediaDataController().N0(this.e1, 50, ot0VarArr[i16].j[1], 0, i16, this.F, 1, k2Var.getClassGuid(), ot0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (sk0Var2 != null) {
                rs0 rs0Var = null;
                for (int i25 = 0; i25 < ss0VarArr.length; i25++) {
                    ss0 ss0Var2 = ss0VarArr[i25];
                    if (ss0Var2 != null && (dr0Var3 = ss0Var2.h) != null && dr0Var3.getAdapter() == sk0Var2) {
                        rs0 rs0Var2 = ss0VarArr[i25].h;
                        rs0Var2.C0();
                        rs0Var = rs0Var2;
                    }
                }
                int b10 = sk0Var2.b();
                if (sk0Var2 != es0Var) {
                    try {
                        sk0Var2.f();
                    } catch (Throwable unused) {
                    }
                } else if (es0Var.b() == i17) {
                    org.telegram.messenger.i0.a4(rs0Var);
                } else {
                    es0Var.f();
                }
                if (!ot0VarArr[i24].a.isEmpty() || ot0VarArr[i24].g) {
                    if (rs0Var != null && (sk0Var2 == es0Var || b10 >= i17)) {
                        C(rs0Var, i17, sparseBooleanArray);
                    }
                } else if (rs0Var != null) {
                    C(rs0Var, i17, sparseBooleanArray);
                }
                if (rs0Var != null && !ot0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (ss0VarArr[i26].E == 0) {
                                ((s4.a0) rs0Var.getLayoutManager()).h1(es0Var.L(0), 0);
                            }
                        }
                    } else {
                        e1();
                    }
                }
            }
            ot0 ot0Var8 = ot0VarArr[i24];
            if (ot0Var8.o) {
                if (ot0Var8.a.size() == 0) {
                    J0(i24);
                } else {
                    ot0VarArr[i24].o = false;
                }
            }
            this.d1 = true;
            return;
        }
        if (i10 == org.telegram.messenger.zs.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat L0 = org.telegram.messenger.o5.z(j10) ? k2Var.getMessagesController().L0(Long.valueOf(-j10)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (org.telegram.messenger.w3.T(L0)) {
                if (longValue2 == 0 && this.e1 != 0) {
                    i14 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i27 = -1;
                    i15 = 0;
                    z12 = false;
                    while (i15 < size) {
                        es0 es0Var2 = es0Var;
                        int i28 = 0;
                        while (i28 < ot0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (ot0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        es0Var = es0Var2;
                    }
                    es0 es0Var3 = es0Var;
                    if (z12) {
                        this.d1 = true;
                        if (es0Var3 != null) {
                            es0Var3.f();
                        }
                        if (sk0Var5 != null) {
                            sk0Var5.f();
                        }
                        if (sk0Var4 != null) {
                            sk0Var4.f();
                        }
                        if (nt0Var != null) {
                            nt0Var.X(false);
                        }
                        if (sk0Var3 != null) {
                            sk0Var3.f();
                        }
                        if (gt0Var != null) {
                            gt0Var.f();
                        }
                        if (sk0Var2 != null) {
                            sk0Var2.f();
                        }
                        if (i27 == 0 || i27 == 1 || i27 == 2 || i27 == 4) {
                            I0(true);
                        }
                    }
                    e0(i27);
                    return;
                }
                if (longValue2 != L0.id) {
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
            es0 es0Var32 = es0Var;
            if (z12) {
            }
            e0(i272);
            return;
        }
        if (i10 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j10) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean C2 = org.telegram.messenger.o5.C(j10);
                int i29 = 0;
                boolean z13 = false;
                while (i29 < arrayList4.size()) {
                    org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) arrayList4.get(i29);
                    ArrayList arrayList5 = arrayList4;
                    if (org.telegram.messenger.jj.o1(jjVar4.k) == null || jjVar4.m5()) {
                        i13 = i29;
                    } else {
                        int f02 = org.telegram.messenger.ui.f0(jjVar4.k);
                        i13 = i29;
                        if (f02 == -1) {
                            return;
                        }
                        ot0 ot0Var9 = ot0VarArr[f02];
                        if (ot0Var9.l) {
                            z11 = z13;
                            if (ot0Var9.a(jjVar4, org.telegram.messenger.jj.B0(jjVar4.k) == j10 ? 0 : 1, true, C2)) {
                                this.Z0[f02] = 1;
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
                    while (i30 < ss0VarArr.length) {
                        int i31 = ss0VarArr[i30].E;
                        if (i31 == 0) {
                            sk0Var = es0Var;
                        } else if (i31 == z15) {
                            sk0Var = sk0Var5;
                        } else if (i31 == 2) {
                            sk0Var = sk0Var4;
                        } else if (i31 == 3) {
                            sk0Var = nt0Var;
                        } else {
                            if (i31 == 4) {
                                sk0Var = sk0Var3;
                            } else if (i31 == 5) {
                                sk0Var = sk0Var2;
                            } else {
                                sk0Var = i31 == 15 ? gt0Var : null;
                                if (sk0Var != null) {
                                    sk0Var.b();
                                    es0Var.f();
                                    sk0Var5.f();
                                    sk0Var4.f();
                                    nt0Var.X(false);
                                    sk0Var3.f();
                                    gt0Var.f();
                                    sk0Var2.f();
                                }
                                i30++;
                                z15 = true;
                            }
                            if (sk0Var != null) {
                            }
                            i30++;
                            z15 = true;
                        }
                        if (sk0Var != null) {
                        }
                        i30++;
                        z15 = true;
                    }
                    K1(z15);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.K) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l4 = (Long) objArr[3];
            if (l4.longValue() == j10 || l4.longValue() == this.e1) {
                int i32 = l4.longValue() == j10 ? 0 : 1;
                for (ot0 ot0Var10 : ot0VarArr) {
                    ot0Var10.f(i32, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i33 = org.telegram.messenger.zs.h2;
        int i34 = org.telegram.messenger.zs.f2;
        int i35 = org.telegram.messenger.zs.g2;
        if (i10 == i33 || i10 == i35 || i10 == i34) {
            if (i10 != i34 && i10 != i35) {
                if (((org.telegram.messenger.jj) objArr[0]).T != 0) {
                    return;
                }
                for (int i36 = 0; i36 < ss0VarArr.length; i36++) {
                    int childCount = ss0VarArr[i36].h.getChildCount();
                    for (int i37 = 0; i37 < childCount; i37++) {
                        View childAt = ss0VarArr[i36].h.getChildAt(i37);
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
            for (int i38 = 0; i38 < ss0VarArr.length; i38++) {
                ss0 ss0Var3 = ss0VarArr[i38];
                if (ss0Var3 != null && (dr0Var = ss0Var3.h) != null) {
                    int childCount2 = dr0Var.getChildCount();
                    for (int i39 = 0; i39 < childCount2; i39++) {
                        View childAt2 = ss0VarArr[i38].h.getChildAt(i39);
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
        if (i10 == org.telegram.messenger.zs.x5) {
            th.x4 x4Var = (th.x4) objArr[0];
            hs0 hs0Var = this.e0;
            if (hs0Var == null || x4Var != hs0Var.s) {
                tq0 tq0Var = this.g0;
                if (tq0Var == null || x4Var != tq0Var.s) {
                    Iterator it = this.l2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        yt0 yt0Var = (yt0) it.next();
                        if (yt0Var.c.s == x4Var) {
                            i12 = yt0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            ss0 e02 = e0(i12);
            if (e02 != null) {
                if (e02.b != (x4Var.g() > 0)) {
                    e02.b = x4Var.g() > 0;
                    A1(e02, true);
                }
            }
            if (e02 != null) {
                org.telegram.messenger.i0.r2(e02.h);
                if (e02.h.getLayoutManager() instanceof s4.a0) {
                    tk0 tk0Var = e02.h;
                    N(e02, tk0Var, (s4.a0) tk0Var.getLayoutManager());
                }
            }
            ms0 ms0Var = this.F1;
            if (ms0Var != null) {
                ms0Var.V();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.v5) {
            for (ss0 ss0Var4 : ss0VarArr) {
                if (ss0Var4 != null && ss0Var4.h != null && x0(ss0Var4.E)) {
                    if (!z0() || ss0Var4.h.getAdapter() == null) {
                        for (int i40 = 0; i40 < ss0Var4.h.getChildCount(); i40++) {
                            View childAt3 = ss0Var4.h.getChildAt(i40);
                            if (childAt3 instanceof org.telegram.ui.Cells.s7) {
                                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt3;
                                e6 e6Var = s7Var.N;
                                if (!s7Var.d0 || (jjVar = s7Var.n) == null || (storyItem = jjVar.l) == null || (storyViews = storyItem.views) == null) {
                                    s7Var.L = false;
                                    e6Var.t("", false, true);
                                } else {
                                    int i41 = storyViews.views_count;
                                    s7Var.L = i41 > 0;
                                    e6Var.t(org.telegram.messenger.i0.o0(i41, 0), true, true);
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.i0.r2(ss0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.f3) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.S.E(true);
                K1(true);
                M();
                return;
            }
            return;
        }
        int i42 = org.telegram.messenger.zs.g3;
        it0 it0Var = this.T;
        if (i10 == i42) {
            if (j10 == 0 || j10 == k2Var.getUserConfig().e()) {
                it0Var.F(true);
                K1(true);
                M();
                T0();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.s) {
            it0Var.F(true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.G3) {
            if (((Long) objArr[0]).longValue() == j10) {
                K1(true);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.W3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j10 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            ks0 ks0Var = this.c0;
            if (ks0Var != null) {
                TLRPC.ChatFull chatFull = ks0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i43 = 0; i43 < ks0Var.d.participants.participants.size(); i43++) {
                        ks0Var.d.participants.participants.get(i43).setRank(longValue4, str);
                    }
                }
                for (ss0 ss0Var5 : ss0VarArr) {
                    if (ss0Var5.E == 7) {
                        org.telegram.messenger.i0.a4(ss0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.f1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i44 = 0; i44 < ss0VarArr.length; i44++) {
                if (ss0VarArr[i44].h.getAdapter() == gt0Var) {
                    dr0 dr0Var4 = ss0VarArr[i44].h;
                    ArrayList arrayList6 = gt0Var.n;
                    for (int i45 = 0; i45 < arrayList6.size(); i45++) {
                        org.telegram.messenger.jj jjVar5 = (org.telegram.messenger.jj) arrayList6.get(i45);
                        if (jjVar5 != null && jjVar5.E1() == longValue5) {
                            TLRPC.MessageMedia messageMedia = jjVar5.k.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                org.telegram.messenger.jj.b6(tL_messageMediaPoll, pollResults);
                                gt0Var.g(i45);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ur0 ur0Var = this.K0;
        if (ur0Var != null) {
            canvas.save();
            canvas.translate(ur0Var.getX(), ur0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        pr0 pr0Var = this.T0;
        if (pr0Var != null) {
            int i10 = pr0Var.U;
            if ((i10 == 3 || i10 == 1) && this.R0 == null) {
                canvas.save();
                canvas.translate(pr0Var.getX(), pr0Var.getY());
                pr0Var.setDrawOverlay(true);
                pr0Var.draw(canvas);
                pr0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (this.b2 && (view instanceof ss0) && this.f2 < this.d2) {
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
        ss0[] ss0VarArr = this.m0;
        float top = ss0VarArr[0].getTop();
        zq0 zq0Var = this.b0;
        if (zq0Var != null && ((i10 = ss0VarArr[0].E) == 8 || F0(i10))) {
            top -= zq0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + org.telegram.messenger.i0.L(12.0f));
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    public final ss0 e0(int i10) {
        int i11 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 >= ss0VarArr.length) {
                return null;
            }
            ss0 ss0Var = ss0VarArr[i11];
            if (ss0Var != null && ss0Var.E == i10) {
                return ss0Var;
            }
            i11++;
        }
    }

    public final void e1() {
        int i10;
        int i11 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 >= ss0VarArr.length) {
                return;
            }
            dr0 dr0Var = ss0VarArr[i11].h;
            if (dr0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < dr0Var.getChildCount(); i14++) {
                    View childAt = dr0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                        int messageId = s7Var.getMessageId();
                        i13 = s7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.l7) {
                        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                        int f12 = l7Var.getMessage().f1();
                        i13 = l7Var.getTop();
                        i12 = f12;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                        i12 = k7Var.getMessage().f1();
                        i13 = k7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = ss0VarArr[i11].E;
                    int i16 = -1;
                    if (x0(i15)) {
                        wt0 u12 = u1(i15);
                        if (u12 != null && u12.s != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= u12.s.i.size()) {
                                    break;
                                }
                                if (i12 == ((org.telegram.messenger.jj) u12.s.i.get(i17)).f1()) {
                                    i16 = i17;
                                    break;
                                }
                                i17++;
                            }
                        }
                        i10 = i16;
                    } else if (i15 >= 0) {
                        ot0[] ot0VarArr = this.v1;
                        if (i15 < ot0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= ot0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((org.telegram.messenger.jj) ot0VarArr[i15].a.get(i18)).f1()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = ot0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((s4.a0) dr0Var.getLayoutManager()).h1(i10, (-ss0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.q1) {
                            ss0 ss0Var = ss0VarArr[i11];
                            ss0Var.r.h1(i10, (-ss0Var.h.getPaddingTop()) + i13);
                        }
                    }
                }
            }
            i11++;
        }
    }

    public final int f0(int i10, int i11, boolean z10) {
        int i12 = i11 + (!z10 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z10 ? 9 : 6;
        }
        return Utilities.j(i12, 9, (this.m1 && i10 == 1) ? 1 : 2);
    }

    public final void f1(int i10) {
        ur0 ur0Var;
        if (this.O1 || (ur0Var = this.K0) == null) {
            return;
        }
        ur0Var.g(null, i10, ur0Var.P.get(i10));
    }

    public final int g0(boolean z10) {
        return this.a2 + this.e2 + (z10 ? org.telegram.messenger.i0.L(52.0f) : 0);
    }

    public final void g1(float f7, int i10) {
        ur0 ur0Var = this.K0;
        if (ur0Var != null) {
            ur0Var.i(f7, F0(i10) ? 8 : i10);
        }
        zq0 zq0Var = this.b0;
        if (zq0Var != null) {
            v71 v71Var = zq0Var.b;
            if (F0(i10)) {
                v71Var.f(f7, r1(i10));
            } else if (i10 == 8) {
                v71Var.f(f7, 0);
            }
        }
    }

    public SparseArray<org.telegram.messenger.jj> getActionModeSelected() {
        return this.b1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        ss0 ss0Var;
        ss0 ss0Var2;
        th.x4 x4Var;
        th.x4 x4Var2;
        float f7 = 1.0f;
        ss0[] ss0VarArr = this.m0;
        if (ss0VarArr == null || (ss0Var = ss0VarArr[0]) == null || (ss0Var2 = ss0VarArr[1]) == null || ss0Var.w == null || ss0Var2.w == null) {
            return 1.0f;
        }
        int i10 = ss0Var.E;
        int i11 = ss0Var2.E;
        boolean z10 = F0(i10) || i10 == 8;
        boolean z11 = F0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - ss0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - ss0VarArr[1].w.getVisibilityFactor();
        wt0 u12 = u1(ss0VarArr[0].E);
        if (i10 == 8 || (u12 != null && (x4Var2 = u12.s) != null && x4Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        wt0 u13 = u1(i11);
        if (i11 != 8 && (u13 == null || (x4Var = u13.s) == null || x4Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return org.telegram.messenger.i0.T1(visibilityFactor, f7, Math.abs(ss0VarArr[0].getTranslationX() / ss0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[1];
        if (ss0Var != null && ss0Var.getVisibility() == 0) {
            if (this.i1 && !this.k1) {
                return ss0VarArr[1].E;
            }
            if (Math.abs(ss0VarArr[1].getTranslationX()) < ss0VarArr[1].getMeasuredWidth() / 2.0f) {
                return ss0VarArr[1].E;
            }
        }
        return getSelectedTab();
    }

    public tk0 getCurrentListView() {
        fs0 fs0Var;
        ss0 ss0Var = this.m0[0];
        int i10 = ss0Var.E;
        return i10 == 13 ? this.W.getCurrentListView() : i10 == 14 ? this.a0.getCurrentListView() : (i10 != 12 || (fs0Var = this.V) == null) ? ss0Var.h : fs0Var.a.z0;
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

    public org.telegram.ui.ActionBar.t0 getSearchItem() {
        return this.p0;
    }

    public ei0 getSearchOptionsItem() {
        return this.u0;
    }

    public int getSelectedTab() {
        int currentTabId = this.K0.getCurrentTabId();
        zq0 zq0Var = this.b0;
        if (zq0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = zq0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? s1(currentAlbumId).a : currentTabId;
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
            ss0[] ss0VarArr = this.m0;
            if (i10 >= ss0VarArr.length) {
                return f7;
            }
            ss0 ss0Var = ss0VarArr[i10];
            if (ss0Var != null) {
                f7 = ((1.0f - Math.abs(ss0Var.getTranslationX() / getWidth())) * ss0Var.E) + f7;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.C0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.z6));
        int i10 = org.telegram.ui.ActionBar.t6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.ActionBar.t0 t0Var = this.w0;
        if (t0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = this.v0;
        if (t0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        Drawable[] drawableArr = {this.F0};
        int i11 = org.telegram.ui.ActionBar.t6.y8;
        ImageView imageView = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.D0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ui));
        ur0 ur0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(ur0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ur0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.si));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ur0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.vi));
        pr0 pr0Var = this.T0;
        if (pr0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(pr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(pr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(pr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(pr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A7));
        }
        final int i12 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i12 >= ss0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.b7 b7Var = new org.telegram.ui.ActionBar.b7() { // from class: org.telegram.ui.Components.iq0
                @Override // org.telegram.ui.ActionBar.b7
                public final void b() {
                    ss0[] ss0VarArr2 = zt0.this.m0;
                    int i13 = i12;
                    dr0 dr0Var = ss0VarArr2[i13].h;
                    if (dr0Var != null) {
                        int childCount = dr0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = ss0VarArr2[i13].h.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.t7) {
                                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                                for (int i15 = 0; i15 < 6; i15++) {
                                    t7Var.a[i15].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                                ((org.telegram.ui.Cells.k6) childAt).A(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.b7
                public final /* synthetic */ void a(float f7) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
            int i13 = org.telegram.ui.ActionBar.t6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.n6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.U7));
            int i14 = org.telegram.ui.ActionBar.t6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
            int i15 = org.telegram.ui.ActionBar.t6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.nj));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, b7Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, b7Var, i15));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, b7Var, i14));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, b7Var, i15));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.A0}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.y6));
            i12++;
        }
    }

    public int getTopPanelShift() {
        return this.o2;
    }

    public final int h0(int i10) {
        return l0(i10) + org.telegram.messenger.i0.L(54.0f) + this.c2 + this.d2 + this.o2 + (i10 == 9 ? org.telegram.messenger.i0.L(64.0f) : 0);
    }

    public final void h1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 >= ss0VarArr.length) {
                if (this.F == 0) {
                    ks0 ks0Var = this.c0;
                    ks0Var.d = chatFull;
                    ks0Var.e = arrayList;
                }
                K1(true);
                for (int i11 = 0; i11 < ss0VarArr.length; i11++) {
                    ss0 ss0Var = ss0VarArr[i11];
                    if (ss0Var.E == 7 && ss0Var.h.getAdapter() != null) {
                        org.telegram.messenger.i0.r2(ss0VarArr[i11].h);
                    }
                }
                return;
            }
            ss0 ss0Var2 = ss0VarArr[i10];
            if (ss0Var2.E == 7 && ss0Var2.h.getAdapter() != null && ss0VarArr[i10].h.getAdapter().b() != 0 && this.x1.getMessagesController().O1().j.size() > 0) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final float i0(float f7) {
        float f10 = 0.0f;
        if (y0()) {
            return 0.0f;
        }
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[1];
        if (ss0Var != null && t0(ss0Var.E)) {
            f10 = 0.0f + f7;
        }
        ss0 ss0Var2 = ss0VarArr[0];
        return (ss0Var2 == null || !t0(ss0Var2.E)) ? f10 : (1.0f - f7) + f10;
    }

    public final void i1(int i10, int i11, int i12, int i13) {
        this.b2 = true;
        this.c2 = i10;
        this.d2 = i11;
        this.e2 = i12;
        this.a2 = i13;
        F();
        vq0 vq0Var = this.a0;
        if (vq0Var != null) {
            if (vq0Var.L != i11 || vq0Var.M != i12) {
                vq0Var.L = i11;
                vq0Var.M = i12;
                vq0Var.setClipChildren(i11 == 0 && i12 == 0);
                vq0Var.h.setClipChildren(i11 == 0 && i12 == 0);
                vq0Var.n();
            }
            C1();
        }
        for (ss0 ss0Var : this.m0) {
            if (ss0Var != null) {
                ss0Var.setClipChildren(false);
                E1(ss0Var);
                setPageOverscan(ss0Var.h);
                setPageOverscan(ss0Var.n);
                int paddingTop = ss0Var.h.getPaddingTop();
                dr0 dr0Var = ss0Var.h;
                int paddingLeft = dr0Var.getPaddingLeft();
                dr0 dr0Var2 = ss0Var.h;
                int h02 = h0(ss0Var.E);
                dr0Var2.g3 = h02;
                int paddingRight = ss0Var.h.getPaddingRight();
                dr0 dr0Var3 = ss0Var.h;
                int g02 = g0(E0());
                dr0Var3.h3 = g02;
                dr0Var.setPadding(paddingLeft, h02, paddingRight, g02);
                int paddingTop2 = paddingTop - ss0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.i0.J(ss0Var.h, new dq0(ss0Var, paddingTop2, 1));
                }
                ss0Var.w.setPadding(0, i10, 0, i13);
                fs0 fs0Var = this.V;
                if (fs0Var != null && fs0Var.getParent() == ss0Var) {
                    k1(org.telegram.messenger.i0.L(56.0f) + i10, fs0Var);
                }
                uq0 uq0Var = this.W;
                if (uq0Var != null && uq0Var.getParent() == ss0Var) {
                    k1(i10, uq0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final float j0(float f7) {
        float f10 = 0.0f;
        if (y0()) {
            return 0.0f;
        }
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[1];
        if (ss0Var != null && B0(ss0Var.E) && ss0VarArr[1].E != 11) {
            f10 = 0.0f + f7;
        }
        ss0 ss0Var2 = ss0VarArr[0];
        return (ss0Var2 == null || !B0(ss0Var2.E) || ss0VarArr[0].E == 11) ? f10 : (1.0f - f7) + f10;
    }

    public final void j1(int i10, boolean z10) {
        this.C0.a(i10, z10);
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.y(i10, z10);
        }
    }

    public final int k0(int i10) {
        wt0 u12;
        th.x4 x4Var;
        if (!x0(i10) || (u12 = u1(i10)) == null || (x4Var = u12.s) == null) {
            return 0;
        }
        return x4Var.g();
    }

    public final int l0(int i10) {
        zq0 zq0Var = this.b0;
        return (int) ((zq0Var == null || !(F0(i10) || i10 == 8)) ? 0.0f : zq0Var.getVisibilityFactor() * org.telegram.messenger.i0.L(40.0f));
    }

    public void l1(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        this.E1 = z10;
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            if (z10) {
                J1();
                i5Var.C();
            } else {
                i5Var.r();
            }
            P(true, true);
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
        this.Q1.addListener(new ha0(5, this, z10));
        this.Q1.start();
        if (z10) {
            J1();
        }
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean m() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(int i10, boolean z10) {
        int i11;
        ss0 e02;
        if (z10 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z10 && x0(i10) && k0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.l1);
        bundle.putLong("topic_id", this.F);
        ot0[] ot0VarArr = this.v1;
        if (z10 && (e02 = e0(0)) != null) {
            ArrayList arrayList = ot0VarArr[0].e;
            int L0 = e02.x.L0();
            if (L0 >= 0) {
                xs0 xs0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((xs0) arrayList.get(i12)).b) {
                            xs0Var = (xs0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (xs0Var == null) {
                        xs0Var = (xs0) i0.a.g(1, arrayList);
                    }
                }
                if (xs0Var != null) {
                    i11 = xs0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.h8 h8Var = new org.telegram.ui.h8(ot0VarArr[0].q, i11, bundle);
                    h8Var.M = new l2.f(this, 19);
                    this.x1.presentFragment(h8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.h8 h8Var2 = new org.telegram.ui.h8(ot0VarArr[0].q, i11, bundle);
        h8Var2.M = new l2.f(this, 19);
        this.x1.presentFragment(h8Var2);
    }

    public final void n1(int i10) {
        int r12 = r1(getClosestTab());
        zq0 zq0Var = this.b0;
        if (r12 != i10) {
            if (zq0Var != null) {
                zq0Var.b.d(i10, zq0Var.d.i(i10));
                return;
            }
            return;
        }
        zq0Var.setReorderingAlbums(true);
        yt0 s12 = s1(i10);
        ss0 e02 = e0(s12.a);
        if (e02 == null) {
            return;
        }
        dr0 dr0Var = e02.h;
        for (int i11 = 0; i11 < dr0Var.getChildCount(); i11++) {
            View childAt = dr0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s7) {
                ((org.telegram.ui.Cells.s7) childAt).l(true, true);
            }
        }
        xt0 xt0Var = s12.c;
        if (xt0Var != null && !xt0Var.y) {
            xt0Var.y = true;
        }
        D1(true);
    }

    public final float o0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 >= ss0VarArr.length) {
                break;
            }
            ss0 ss0Var = ss0VarArr[i11];
            if (ss0Var != null) {
                int i13 = ss0Var.E;
                if ((z10 && i10 == 8 && F0(i13)) || i13 == i10) {
                    i12++;
                    width = ss0VarArr[i11].getTranslationX();
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
    public final void o1(boolean z10) {
        ss0[] ss0VarArr;
        ss0 ss0Var;
        if (this.q1) {
            return;
        }
        int i10 = 0;
        while (true) {
            ss0VarArr = this.m0;
            if (i10 >= ss0VarArr.length) {
                ss0Var = null;
                break;
            }
            int i11 = ss0VarArr[i10].E;
            if (i11 == 0 || x0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (ss0Var != null) {
            int i12 = ss0Var.E;
            this.r1 = i12;
            boolean x02 = x0(i12);
            int[] iArr = this.o1;
            int f02 = f0(x02 ? 1 : 0, iArr[x02 ? 1 : 0], z10);
            this.s1 = f02;
            if (f02 != iArr[x02 ? 1 : 0]) {
                if (this.m1 && x0(this.r1)) {
                    return;
                }
                ss0Var.n.setVisibility(0);
                if (x0(this.r1)) {
                    ss0Var.n.setAdapter(v1(this.r1));
                } else {
                    ss0Var.n.setAdapter(this.K);
                }
                rs0 rs0Var = ss0Var.n;
                rs0Var.setPadding(rs0Var.getPaddingLeft(), h0(this.r1), ss0Var.n.getPaddingRight(), g0(E0()));
                ss0Var.r.y1(f02);
                ss0Var.n.a0();
                ss0Var.r.O = new sr0(this, ss0Var, 0);
                org.telegram.messenger.i0.a4(ss0Var.h);
                this.q1 = true;
                if (this.r1 == 0) {
                    this.v1[0].g(true);
                }
                this.p1 = 0.0f;
                if (this.s < 0) {
                    e1();
                    return;
                }
                for (ss0 ss0Var2 : ss0VarArr) {
                    if (ss0Var2.E == this.r1) {
                        ss0Var2.r.h1(this.s, this.w - ss0Var2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 >= ss0VarArr.length) {
                return;
            }
            dr0 dr0Var = ss0VarArr[i10].h;
            if (dr0Var != null) {
                dr0Var.getViewTreeObserver().addOnPreDrawListener(new as0(this, i10, 0));
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return R() || this.K0.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        ms0 ms0Var = this.F1;
        int height = ms0Var.f() != null ? ms0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof ss0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                dr0 dr0Var = ((ss0) childAt).h;
                dr0Var.setPadding(0, dr0Var.e3, 0, dr0Var.f3);
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
            org.telegram.ui.ActionBar.k2 k2Var = this.x1;
            if (k2Var.getParentLayout() != null && !((ActionBarLayout) k2Var.getParentLayout()).i() && !R() && !this.a) {
                if (motionEvent != null) {
                    if (this.D1 == null) {
                        this.D1 = VelocityTracker.obtain();
                    }
                    this.D1.addMovement(motionEvent);
                    q30 q30Var = this.G1;
                    if (q30Var != null) {
                        q30Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.z1 && !this.A1) {
                    if (motionEvent.getY() >= org.telegram.messenger.i0.L(90.0f) + this.c2) {
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
                    boolean z11 = this.z1;
                    ss0[] ss0VarArr = this.m0;
                    if (z11 && (((z10 = this.j1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!b1(motionEvent, x10 < 0)) {
                            this.A1 = true;
                            this.z1 = false;
                            ss0VarArr[0].setTranslationX(0.0f);
                            ss0VarArr[1].setTranslationX(this.j1 ? ss0VarArr[0].getMeasuredWidth() : -ss0VarArr[0].getMeasuredWidth());
                            g1(0.0f, ss0VarArr[1].E);
                            U0(getTabProgress());
                        }
                    }
                    if (!this.A1 || this.z1) {
                        if (this.z1) {
                            ss0VarArr[0].setTranslationX(x10);
                            if (this.j1) {
                                ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                ss0VarArr[1].setTranslationX(x10 - ss0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / ss0VarArr[0].getMeasuredWidth();
                            if (H()) {
                                this.q0 = j0(abs2);
                                H1(abs2);
                                float i02 = i0(abs2);
                                this.r0 = i02;
                                this.t0.setVisibility((i02 == 0.0f || !H() || y0()) ? 4 : 0);
                            } else {
                                this.q0 = 0.0f;
                            }
                            D1(false);
                            g1(abs2, ss0VarArr[1].E);
                            U0(getTabProgress());
                            T0();
                        }
                    } else if (Math.abs(x10) >= org.telegram.messenger.i0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                        b1(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.y1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    q1(motionEvent);
                }
                return this.z1;
            }
        }
        return false;
    }

    public final float p0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 >= ss0VarArr.length) {
                return f7;
            }
            ss0 ss0Var = ss0VarArr[i11];
            if (ss0Var != null) {
                int i12 = ss0Var.E;
                if ((z10 && i10 == 8 && F0(i12)) || i12 == i10) {
                    f7 = (1.0f - Math.abs(ss0VarArr[i11].getTranslationX() / getWidth())) + f7;
                }
            }
            i11++;
        }
    }

    public final void p1() {
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 >= ss0VarArr.length) {
                return;
            }
            int childCount = ss0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ss0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                    if (i10 == 0) {
                        photoImage.t0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.t0 = false;
                        photoImage.Q0();
                    }
                }
            }
            i10++;
        }
    }

    public final int q0(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.H1;
        return p6Var != null ? p6Var.h(i10) : org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final void q1(MotionEvent motionEvent) {
        float f7;
        float f10;
        float measuredWidth;
        VelocityTracker velocityTracker = this.D1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(1000, this.U0);
        int i10 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f7 = 0.0f;
            f10 = 0.0f;
        } else {
            f7 = this.D1.getXVelocity();
            f10 = this.D1.getYVelocity();
            if (!this.z1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                b1(motionEvent, f7 < 0.0f);
            }
        }
        if (this.z1) {
            ss0[] ss0VarArr = this.m0;
            float x10 = ss0VarArr[0].getX();
            this.h1 = new AnimatorSet();
            this.k1 = Math.abs(x10) < ((float) ss0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new r60(this, 19));
            boolean z10 = this.k1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.j1) {
                    this.h1.playTogether(ObjectAnimator.ofFloat(ss0VarArr[0], (Property<ss0, Float>) property, 0.0f), ObjectAnimator.ofFloat(ss0VarArr[1], (Property<ss0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.h1.playTogether(ObjectAnimator.ofFloat(ss0VarArr[0], (Property<ss0, Float>) property, 0.0f), ObjectAnimator.ofFloat(ss0VarArr[1], (Property<ss0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = ss0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.j1) {
                    this.h1.playTogether(ObjectAnimator.ofFloat(ss0VarArr[0], (Property<ss0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(ss0VarArr[1], (Property<ss0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.h1.playTogether(ObjectAnimator.ofFloat(ss0VarArr[0], (Property<ss0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(ss0VarArr[1], (Property<ss0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.h1.setInterpolator(t2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.h1.setDuration(Math.max(org.telegram.messenger.zs.g2, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.h1.addListener(new xr0(this, i10));
            this.h1.start();
            this.i1 = true;
            this.z1 = false;
            T0();
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

    public final boolean r0() {
        return this.x1.getConnectionsManager().getConnectionState() == 3;
    }

    public final int r1(int i10) {
        yt0 t12 = t1(i10);
        if (t12 == null) {
            return -1;
        }
        return t12.b;
    }

    public final boolean s0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.jj jjVar;
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
                if (num.intValue() > 0 && (jjVar = (org.telegram.messenger.jj) sparseArrayArr[i10].get(num.intValue())) != null && (message = jjVar.k) != null && message.noforwards) {
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

    public final yt0 s1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.l2;
        yt0 yt0Var = (yt0) hashMap.get(valueOf);
        if (yt0Var != null) {
            return yt0Var;
        }
        yt0 yt0Var2 = new yt0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), yt0Var2);
        this.m2.put(Integer.valueOf(yt0Var2.a), Integer.valueOf(i10));
        return yt0Var2;
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
                    ot0[] ot0VarArr = this.v1;
                    if (i10 >= ot0VarArr.length) {
                        break;
                    }
                    if (ot0VarArr[i10].b[1].size() == 0) {
                        ot0 ot0Var = ot0VarArr[i10];
                        ot0Var.j[1] = this.f1.migrated_from_max_id;
                        ot0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        ur0 ur0Var = this.K0;
        if (ur0Var != null) {
            ur0Var.setInitialTabId(y0() ? 9 : 8);
        }
        K1(true);
        w1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.Z0[6] = i10;
        }
        K1(true);
        M();
    }

    public void setForwardRestrictedHint(q30 q30Var) {
        this.G1 = q30Var;
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
        K1(true);
        M();
        if (iArr2[0] >= 0) {
            I0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.j2 = runnable;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.N1 = i11;
        int i14 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i14 >= ss0VarArr.length) {
                break;
            }
            ss0VarArr[i14].setTranslationY(this.N1);
            i14++;
        }
        if (this.R0 != null) {
            S();
        } else {
            pr0 pr0Var = this.T0;
            if (pr0Var != null) {
                pr0Var.setTranslationY(org.telegram.messenger.i0.L(48.0f) + i11);
            }
        }
        this.Q0 = i11;
        org.telegram.ui.Cells.s0 s0Var = this.M0;
        s0Var.setTranslationY((s0Var.getTag() == null ? -org.telegram.messenger.i0.L(48.0f) : 0) + this.Q0);
    }

    public void setPagesGlassEngine(ei.r rVar) {
        this.g2 = rVar;
        vq0 vq0Var = this.a0;
        if (vq0Var != null) {
            vq0Var.setGlassEngine(rVar);
        }
        for (ss0 ss0Var : this.m0) {
            if (ss0Var != null) {
                ss0Var.h.setCaptureSectionsDecoratorAllowed(true);
                rVar.b(ss0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.a2 != i10) {
            this.a2 = i10;
            ss0[] ss0VarArr = this.m0;
            if (ss0VarArr != null) {
                for (ss0 ss0Var : ss0VarArr) {
                    if (ss0Var != null) {
                        dr0 dr0Var = ss0Var.h;
                        int paddingLeft = dr0Var.getPaddingLeft();
                        dr0 dr0Var2 = ss0Var.h;
                        int i11 = dr0Var2.e3;
                        int paddingRight = dr0Var2.getPaddingRight();
                        dr0 dr0Var3 = ss0Var.h;
                        int g02 = g0(E0());
                        dr0Var3.h3 = g02;
                        dr0Var.setPadding(paddingLeft, i11, paddingRight, g02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i10) {
        if (this.f2 != i10) {
            this.f2 = i10;
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
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 >= ss0VarArr.length) {
                return;
            }
            A1(ss0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.g1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.g1 = userFull;
        K1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        f1(8);
    }

    public void setVisibleHeight(int i10) {
        this.P1 = i10;
        int i11 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 >= ss0VarArr.length) {
                break;
            }
            float f7 = (-(getMeasuredHeight() - Math.max(i10, org.telegram.messenger.i0.L(ss0VarArr[i11].E == 8 ? 280.0f : 120.0f)))) / 2.0f;
            ss0VarArr[i11].w.setTranslationY(f7);
            ss0VarArr[i11].s.setTranslationY(-f7);
            i11++;
        }
        uq0 uq0Var = this.W;
        if (uq0Var != null) {
            uq0Var.setVisibleHeight(i10);
        }
        vq0 vq0Var = this.a0;
        if (vq0Var != null) {
            vq0Var.setVisibleHeight(i10);
        }
    }

    public final boolean t0(int i10) {
        if (i10 == 0) {
            return true;
        }
        if (((i10 == 8 || F0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || i10 == 9 || i10 == 11 || i10 == 13) {
            return true;
        }
        return i10 == 14 && this.a0 != null;
    }

    public final yt0 t1(int i10) {
        Integer num = (Integer) this.m2.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (yt0) this.l2.get(num);
    }

    @Override // org.telegram.ui.Cells.r2
    public final void u(org.telegram.ui.Cells.v2 v2Var) {
        org.telegram.ui.ActionBar.k2 k2Var = this.x1;
        if (k2Var != null && k2Var.getMessagesController().O1().K(v2Var.getDialogId())) {
            k2Var.getOrCreateStoryViewer().getClass();
            th.o7 orCreateStoryViewer = k2Var.getOrCreateStoryViewer();
            Context context = k2Var.getContext();
            long dialogId = v2Var.getDialogId();
            th.n5 a2 = th.n5.a((tk0) v2Var.getParent());
            a2.s += ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).r1) ? org.telegram.messenger.i0.L(68.0f) : 0;
            orCreateStoryViewer.R(context, dialogId, a2);
        }
    }

    public final void u0() {
        org.telegram.messenger.i0.r(this.O0);
        org.telegram.ui.Cells.s0 s0Var = this.M0;
        if (s0Var.getTag() == null) {
            return;
        }
        s0Var.setTag(null);
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.N0.playTogether(ObjectAnimator.ofFloat(s0Var, (Property<org.telegram.ui.Cells.s0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s0Var, (Property<org.telegram.ui.Cells.s0, Float>) View.TRANSLATION_Y, (-org.telegram.messenger.i0.L(48.0f)) + this.Q0));
        this.N0.setInterpolator(gr.g);
        this.N0.addListener(new xr0(this, 0));
        this.N0.start();
    }

    public final wt0 u1(int i10) {
        yt0 t12;
        if (i10 == 8) {
            return this.e0;
        }
        if (i10 == 9) {
            return this.g0;
        }
        if (!F0(i10) || (t12 = t1(i10)) == null) {
            return null;
        }
        return t12.c;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.I1.a(q0(org.telegram.ui.ActionBar.t6.d6));
            org.telegram.ui.ActionBar.c2 c2Var = this.F0;
            if (c2Var != null) {
                c2Var.a(q0(org.telegram.ui.ActionBar.t6.y8));
            }
            NumberTextView numberTextView = this.C0;
            if (numberTextView != null) {
                numberTextView.setTextColor(q0(org.telegram.ui.ActionBar.t6.y8));
            }
            y1();
            invalidate();
            for (ss0 ss0Var : this.m0) {
                if (ss0Var != null && ss0Var.L) {
                    ss0Var.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public boolean v0() {
        return false;
    }

    public final wt0 v1(int i10) {
        yt0 t12;
        if (i10 == 8) {
            return this.f0;
        }
        if (i10 == 9) {
            return this.h0;
        }
        if (!F0(i10) || (t12 = t1(i10)) == null) {
            return null;
        }
        return t12.d;
    }

    public boolean w0() {
        return !(this instanceof g30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1(boolean z10) {
        ss0[] ss0VarArr;
        ss0[] ss0VarArr2;
        org.telegram.ui.ActionBar.t0 t0Var;
        s4.u0 u0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        s4.u0 u0Var2;
        int i10;
        int i11;
        int i12;
        boolean z14;
        s4.u0 u0Var3;
        int i13;
        int i14;
        boolean z15;
        s4.u0 u0Var4;
        vq0 vq0Var = this.a0;
        if (vq0Var != null) {
            vq0Var.i();
        }
        int i15 = 0;
        while (true) {
            ss0VarArr = this.m0;
            if (i15 >= ss0VarArr.length) {
                break;
            }
            ss0VarArr[i15].h.C0();
            i15++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ss0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.i0.L(K0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        s4.g0 adapter = ss0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.g0 g0Var = this.e0;
        s4.x xVar = this.d0;
        if (adapter == g0Var) {
            xVar.h(null);
        }
        boolean z16 = this.X0;
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        ms0 ms0Var = this.F1;
        org.telegram.ui.ActionBar.l lVar = this.G;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.p0;
        gt0 gt0Var = this.P;
        int i16 = 100;
        if (z16 && this.W0) {
            ss0 ss0Var = ss0VarArr[z10 ? 1 : 0];
            if (ss0Var.f == null) {
                ss0Var.f = new s4.u0();
            }
            ss0 ss0Var2 = ss0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var5 = ss0Var2.f;
            lt0 lt0Var = this.U;
            qs0 qs0Var = this.l0;
            us0 us0Var = this.j0;
            us0 us0Var2 = this.k0;
            us0 us0Var3 = this.i0;
            if (z10) {
                int i17 = ss0Var2.E;
                if (i17 != 0) {
                    u0Var4 = u0Var5;
                    if (i17 != 2 && i17 != 5 && i17 != 6 && (i17 != 7 || ms0Var.X())) {
                        String obj = t0Var2 != null ? t0Var2.getSearchField().getText().toString() : "";
                        int i18 = ss0VarArr[z10 ? 1 : 0].E;
                        if (i18 == 1) {
                            if (us0Var3 != null) {
                                us0Var3.G(obj, false);
                                if (adapter != us0Var3) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var3);
                                }
                            }
                        } else if (i18 == 3) {
                            if (us0Var2 != null) {
                                us0Var2.G(obj, false);
                                if (adapter != us0Var2) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var2);
                                }
                            }
                        } else if (i18 == 4) {
                            if (us0Var != null) {
                                us0Var.G(obj, false);
                                if (adapter != us0Var) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var);
                                }
                            }
                        } else if (i18 == 7) {
                            if (qs0Var != null) {
                                qs0Var.F(obj, false);
                                if (adapter != qs0Var) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(qs0Var);
                                }
                            }
                        } else if (i18 == 11) {
                            if (lt0Var != null) {
                                lt0Var.E(obj, this.Y0);
                                if (adapter != lt0Var) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var);
                                }
                            }
                        } else if (i18 == 15 && gt0Var != null && adapter != gt0Var) {
                            d1(adapter);
                            dr0 dr0Var = ss0VarArr[z10 ? 1 : 0].h;
                            gt0Var.r = dr0Var;
                            dr0Var.setAdapter(gt0Var);
                        }
                    }
                }
                this.X0 = false;
                rr0 rr0Var = this.L0;
                if (rr0Var != null) {
                    rr0Var.g(false);
                }
                this.W0 = false;
                w1(true);
                return;
            }
            u0Var4 = u0Var5;
            if (ss0Var2.h != null) {
                int i19 = ss0Var2.E;
                if (i19 == 1) {
                    if (adapter != us0Var3) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var3);
                    }
                    us0Var3.f();
                } else if (i19 == 3) {
                    if (adapter != us0Var2) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var2);
                    }
                    us0Var2.f();
                } else if (i19 == 4) {
                    if (adapter != us0Var) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var);
                    }
                    us0Var.f();
                } else if (i19 == 7) {
                    if (adapter != qs0Var) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(qs0Var);
                    }
                    qs0Var.f();
                } else if (i19 == 11) {
                    if (adapter != lt0Var) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var);
                    }
                    lt0Var.f();
                }
            }
            ss0VarArr2 = ss0VarArr;
            t0Var = t0Var2;
            u0Var3 = u0Var4;
            i11 = 4;
            z13 = false;
            z14 = false;
            i12 = 8;
        } else {
            ss0 ss0Var3 = ss0VarArr[z10 ? 1 : 0];
            if (ss0Var3.e == null) {
                ss0Var3.e = new s4.u0();
            }
            ss0 ss0Var4 = ss0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var6 = ss0Var4.e;
            ss0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i20 = ss0VarArr[z10 ? 1 : 0].E;
            if (i20 == 8 || F0(i20)) {
                layoutParams.topMargin = org.telegram.messenger.i0.L(K0());
            }
            dr0 dr0Var2 = ss0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = dr0Var2.getPaddingLeft();
            ss0 ss0Var5 = ss0VarArr[z10 ? 1 : 0];
            ss0VarArr2 = ss0VarArr;
            dr0 dr0Var3 = ss0Var5.h;
            int h02 = h0(ss0Var5.E);
            dr0Var3.g3 = h02;
            int paddingRight = ss0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            dr0 dr0Var4 = ss0VarArr2[z10 ? 1 : 0].h;
            t0Var = t0Var2;
            int g02 = g0(E0());
            dr0Var4.h3 = g02;
            dr0Var2.setPadding(paddingLeft, h02, paddingRight, g02);
            int i21 = ss0VarArr2[z10 ? 1 : 0].E;
            int[] iArr = this.o1;
            s4.g0 g0Var2 = this.M;
            View view = this.W;
            it0 it0Var = this.T;
            ls0 ls0Var = this.R;
            fs0 fs0Var = this.V;
            ot0[] ot0VarArr = this.v1;
            if (i21 == 0) {
                s4.g0 g0Var3 = this.J;
                if (adapter != g0Var3) {
                    d1(adapter);
                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var3);
                }
                int i22 = -org.telegram.messenger.i0.L(1.0f);
                layoutParams.rightMargin = i22;
                layoutParams.leftMargin = i22;
                ot0 ot0Var = ot0VarArr[0];
                boolean z17 = ot0Var.h && !ot0Var.e.isEmpty();
                i16 = iArr[0];
                ss0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.A0);
                ot0 ot0Var2 = ot0VarArr[0];
                if (ot0Var2.x == null) {
                    ot0Var2.x = new s4.u0();
                }
                u0Var = ot0VarArr[0].x;
                z13 = z17;
                z11 = false;
            } else {
                if (i21 == 1) {
                    ot0 ot0Var3 = ot0VarArr[1];
                    z12 = ot0Var3.h && !ot0Var3.e.isEmpty();
                    if (adapter != g0Var2) {
                        d1(adapter);
                        ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var2);
                    }
                } else if (i21 == 2) {
                    ot0 ot0Var4 = ot0VarArr[2];
                    z12 = ot0Var4.h && !ot0Var4.e.isEmpty();
                    s4.g0 g0Var4 = this.N;
                    if (adapter != g0Var4) {
                        d1(adapter);
                        ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var4);
                    }
                } else {
                    if (i21 == 3) {
                        s4.g0 g0Var5 = this.L;
                        if (adapter != g0Var5) {
                            d1(adapter);
                            ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var5);
                        }
                    } else if (i21 == 4) {
                        ot0 ot0Var5 = ot0VarArr[4];
                        z12 = ot0Var5.h && !ot0Var5.e.isEmpty();
                        s4.g0 g0Var6 = this.O;
                        if (adapter != g0Var6) {
                            d1(adapter);
                            ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var6);
                        }
                    } else {
                        if (i21 == 5) {
                            s4.g0 g0Var7 = this.Q;
                            if (adapter != g0Var7) {
                                d1(adapter);
                                ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var7);
                            }
                        } else if (i21 == 15) {
                            if (adapter != gt0Var) {
                                d1(adapter);
                                dr0 dr0Var5 = ss0VarArr2[z10 ? 1 : 0].h;
                                gt0Var.r = dr0Var5;
                                dr0Var5.setAdapter(gt0Var);
                            }
                        } else if (i21 == 6) {
                            if (adapter != ls0Var) {
                                d1(adapter);
                                ss0VarArr2[z10 ? 1 : 0].h.setAdapter(ls0Var);
                            }
                        } else if (i21 == 7) {
                            s4.g0 g0Var8 = this.c0;
                            if (adapter != g0Var8) {
                                d1(adapter);
                                ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var8);
                            }
                        } else if (x0(i21)) {
                            s4.g0 u12 = u1(ss0VarArr2[z10 ? 1 : 0].E);
                            if (adapter != u12) {
                                d1(adapter);
                                ss0VarArr2[z10 ? 1 : 0].h.setAdapter(u12);
                                ss0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            ss0 ss0Var6 = ss0VarArr2[z10 ? 1 : 0];
                            if (ss0Var6.E != 9) {
                                xVar.h(ss0Var6.h);
                            }
                            i16 = iArr[1];
                        } else {
                            int i23 = ss0VarArr2[z10 ? 1 : 0].E;
                            if (i23 == 10) {
                                s4.g0 g0Var9 = this.S;
                                if (adapter != g0Var9) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var9);
                                }
                            } else if (i23 == 11) {
                                if (adapter != it0Var) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(it0Var);
                                    s4.x xVar2 = it0Var.w;
                                    dr0 dr0Var6 = ss0VarArr2[z10 ? 1 : 0].h;
                                    it0Var.s = dr0Var6;
                                    xVar2.h(dr0Var6);
                                }
                                u0Var = it0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i23 == 12) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (fs0Var.getParent() != ss0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(fs0Var);
                                    ss0VarArr2[z10 ? 1 : 0].addView(fs0Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    k1(org.telegram.messenger.i0.L(56.0f) + this.c2, fs0Var);
                                }
                            } else if (i23 == 13) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != ss0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(view);
                                    ss0VarArr2[z10 ? 1 : 0].addView(view);
                                    k1(this.c2, view);
                                }
                            } else if (i23 == 14) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vq0Var != null && vq0Var.getParent() != ss0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(vq0Var);
                                    ss0VarArr2[z10 ? 1 : 0].addView(vq0Var);
                                    ss0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        u0Var = u0Var6;
                        z11 = false;
                        z13 = false;
                    }
                    u0Var = u0Var6;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                u0Var = u0Var6;
                z11 = true;
            }
            F1(ss0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                ss0VarArr2[z10 ? 1 : 0].h.setSections(false);
                u0Var2 = u0Var;
            } else {
                dr0 dr0Var7 = ss0VarArr2[z10 ? 1 : 0].h;
                dr0Var7.getClass();
                u0Var2 = u0Var;
                org.telegram.ui.ActionBar.a7.m(dr0Var7, 20, org.telegram.ui.ActionBar.t6.i6, dr0Var7.n2);
                dr0Var7.T2 = false;
                dr0Var7.H2 = null;
                dr0Var7.I2 = null;
                dr0Var7.L2 = 0.0f;
                dr0Var7.M2 = null;
                dr0Var7.N2 = null;
                dr0Var7.J2 = null;
                ek0 ek0Var = dr0Var7.G2;
                if (ek0Var != null) {
                    dr0Var7.q0(ek0Var);
                    dr0Var7.G2 = null;
                }
                l9 l9Var = dr0Var7.R2;
                if (l9Var != null) {
                    dr0Var7.q0(l9Var);
                    dr0Var7.R2 = null;
                }
            }
            E1(ss0VarArr2[z10 ? 1 : 0]);
            ss0 ss0Var7 = ss0VarArr2[z10 ? 1 : 0];
            if (ss0Var7.E == 11) {
                ss0Var7.h.setItemAnimator(ss0Var7.d);
            } else {
                ss0Var7.h.setItemAnimator(null);
                if (it0Var != null && ss0VarArr2[z10 ? 1 : 0].h == it0Var.s) {
                    s4.x xVar3 = it0Var.w;
                    it0Var.s = null;
                    xVar3.h(null);
                }
            }
            if (fs0Var != null && ss0VarArr2[z10 ? 1 : 0].E != 12 && fs0Var.getParent() == ss0VarArr2[z10 ? 1 : 0]) {
                fs0Var.a.onRemoveFromParent();
                ss0VarArr2[z10 ? 1 : 0].removeView(fs0Var);
            }
            if (view != null && ss0VarArr2[z10 ? 1 : 0].E != 13) {
                ViewParent parent = view.getParent();
                ss0 ss0Var8 = ss0VarArr2[z10 ? 1 : 0];
                if (parent == ss0Var8) {
                    ss0Var8.removeView(view);
                }
            }
            if (vq0Var != null && ss0VarArr2[z10 ? 1 : 0].E != 14) {
                ViewParent parent2 = vq0Var.getParent();
                ss0 ss0Var9 = ss0VarArr2[z10 ? 1 : 0];
                if (parent2 == ss0Var9) {
                    ss0Var9.removeView(vq0Var);
                }
            }
            int i24 = ss0VarArr2[z10 ? 1 : 0].E;
            if (i24 != 0 && i24 != 11 && !x0(i24) && (i13 = ss0VarArr2[z10 ? 1 : 0].E) != 2 && i13 != 5 && i13 != 6 && ((i13 != 7 || ms0Var.X()) && (i14 = ss0VarArr2[z10 ? 1 : 0].E) != 10 && i14 != 13 && i14 != 14)) {
                if (z10) {
                    if (t0Var != null && t0Var.getVisibility() == 4) {
                        if (!(i5Var != null ? i5Var.F : lVar.n0)) {
                            if (H()) {
                                this.z0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                setSearchItemVisibility(E0() ? 8 : 4);
                            }
                            float f7 = z10 ? 1.0f : 0.0f;
                            this.q0 = j0(f7);
                            H1(1.0f - f7);
                            z15 = false;
                        }
                    }
                    z15 = false;
                    this.z0 = 0;
                    this.q0 = 1.0f;
                } else {
                    z15 = false;
                    if (t0Var != null && t0Var.getVisibility() == 4) {
                        if (H()) {
                            this.z0 = 0;
                            this.q0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            setSearchItemVisibility(E0() ? 8 : 4);
                            this.q0 = 0.0f;
                        }
                    }
                }
                D1(z15);
            } else if (z10) {
                this.z0 = 2;
            } else {
                this.z0 = 0;
                if (t0Var != null) {
                    setSearchItemVisibility((E0() || this.X0) ? 8 : 4);
                }
            }
            int i25 = ss0VarArr2[z10 ? 1 : 0].E;
            if (i25 == 6) {
                if (!ls0Var.e && !ls0Var.h && ls0Var.d.isEmpty()) {
                    ls0.E(ls0Var, 0L);
                }
            } else if (i25 != 7) {
                if (x0(i25)) {
                    wt0 u13 = u1(ss0VarArr2[z10 ? 1 : 0].E);
                    if (u13 != null) {
                        th.x4 x4Var = u13.s;
                        u13.P();
                        ss0VarArr2[z10 ? 1 : 0].w.e(x4Var != null && (x4Var.k() || (r0() && x4Var.g() > 0)), z10);
                        z13 = (x4Var == null || x4Var.g() <= 0 || C0()) ? false : true;
                    }
                } else {
                    int i26 = ss0VarArr2[z10 ? 1 : 0].E;
                    if (i26 != 10 && i26 != 11 && i26 != 12 && i26 != 13 && i26 != 14) {
                        if (i26 == 15) {
                            i26 = 8;
                        }
                        ot0 ot0Var6 = ot0VarArr[i26];
                        if (!ot0Var6.g && !ot0Var6.i[0] && ot0Var6.a.isEmpty()) {
                            ot0VarArr[i26].g = true;
                            g0Var2.f();
                            if (i26 == 0) {
                                int i27 = ot0VarArr[0].q;
                                if (i27 == 1) {
                                    i10 = 6;
                                } else if (i27 == 2) {
                                    i10 = 7;
                                }
                                org.telegram.ui.ActionBar.k2 k2Var = this.x1;
                                k2Var.getMediaDataController().N0(this.l1, 50, 0, 0, i10, this.F, 1, k2Var.getClassGuid(), ot0VarArr[i10].p, null, null);
                            }
                            i10 = i26;
                            org.telegram.ui.ActionBar.k2 k2Var2 = this.x1;
                            k2Var2.getMediaDataController().N0(this.l1, 50, 0, 0, i10, this.F, 1, k2Var2.getClassGuid(), ot0VarArr[i10].p, null, null);
                        }
                    }
                }
            }
            int i28 = ss0VarArr2[z10 ? 1 : 0].E;
            if (i28 == 8 || F0(i28)) {
                i11 = 4;
                ss0 ss0Var10 = ss0VarArr2[z10 ? 1 : 0];
                or0 or0Var = ss0Var10.w;
                boolean F0 = F0(ss0Var10.E);
                int r12 = r1(ss0VarArr2[z10 ? 1 : 0].E);
                g9 g9Var = or0Var.b;
                vh.d dVar = or0Var.f;
                g9Var.setVisibility((F0 || D0() || z0()) ? 8 : 0);
                if (F0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.cd.L0(2131744823, null), false);
                    i12 = 8;
                } else if (D0()) {
                    i12 = 8;
                    dVar.setVisibility(8);
                } else {
                    i12 = 8;
                    or0Var.setStickerType(11);
                    dVar.setVisibility(!C0() ? 0 : 8);
                    dVar.h(z(), false);
                }
                if (F0) {
                    or0Var.d.setText(org.telegram.messenger.cd.L0(2131744801, null));
                    or0Var.e.setText(org.telegram.messenger.cd.L0(2131744802, null));
                } else {
                    or0Var.d.setText(org.telegram.messenger.cd.L0(!C0() ? E0() ? 2131748192 : 2131748163 : 2131748221, null));
                    or0Var.e.setText(E0() ? org.telegram.messenger.cd.L0(2131748164, null) : "");
                }
                z14 = false;
                dVar.setOnClickListener(new aq0(this, F0, r12, 0 == true ? 1 : 0));
            } else {
                ss0 ss0Var11 = ss0VarArr2[z10 ? 1 : 0];
                if (ss0Var11.E == 9) {
                    if (D0()) {
                        ss0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        ss0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        ss0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        ss0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        ss0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        ss0VarArr2[z10 ? 1 : 0].w.f.h(z(), false);
                    }
                    ss0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.cd.L0(2131748263, null));
                    ss0VarArr2[z10 ? 1 : 0].w.e.setText(E0() ? org.telegram.messenger.cd.L0(2131748264, null) : "");
                    i11 = 4;
                    ss0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new up0(this, i11));
                    z14 = false;
                    i12 = 8;
                } else {
                    i11 = 4;
                    ss0Var11.w.b.setVisibility(0);
                    ss0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    ss0VarArr2[z10 ? 1 : 0].w.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
                    ss0VarArr2[z10 ? 1 : 0].w.e.setText(org.telegram.messenger.cd.L0(2131745824, null));
                    i12 = 8;
                    ss0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    z14 = false;
                }
            }
            ss0VarArr2[z10 ? 1 : 0].h.setVisibility(z14 ? 1 : 0);
            u0Var3 = u0Var2;
        }
        int i29 = i16;
        ss0 ss0Var12 = ss0VarArr2[z10 ? 1 : 0];
        ss0Var12.b = z13;
        A1(ss0Var12, z14);
        ss0VarArr2[z10 ? 1 : 0].x.y1(i29);
        ss0VarArr2[z10 ? 1 : 0].h.a0();
        if (u0Var3 != null) {
            ss0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var3);
            ss0VarArr2[z10 ? 1 : 0].n.setRecycledViewPool(u0Var3);
        }
        if (this.z0 == 2) {
            if (i5Var != null ? i5Var.F : lVar.n0) {
                this.B0 = true;
                if (i5Var != null) {
                    i5Var.j(true);
                } else {
                    lVar.k(true);
                }
                this.z0 = 0;
                this.q0 = 0.0f;
                if (t0Var != null) {
                    setSearchItemVisibility(E0() ? i12 : i11);
                }
                D1(false);
            }
        }
    }

    public final void x1(org.telegram.ui.ActionBar.b1 b1Var, org.telegram.ui.ActionBar.b1 b1Var2, Runnable runnable) {
        if (this.K1) {
            return;
        }
        if (b1Var2.getCheckView().a.q || !b1Var.getCheckView().a.q) {
            b1Var.setChecked(!b1Var.getCheckView().a.q);
            runnable.run();
        } else {
            float f7 = -this.u1;
            this.u1 = f7;
            org.telegram.messenger.i0.F3(f7, b1Var, null);
        }
    }

    public final void y(View view) {
        ss0[] ss0VarArr = this.m0;
        addView(view, Math.max(indexOfChild(ss0VarArr[0]), indexOfChild(ss0VarArr[1])) + 1, w7.b6.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public boolean y0() {
        return false;
    }

    public final void y1() {
        if (this.H != null) {
            return;
        }
        try {
            int q02 = q0(org.telegram.ui.ActionBar.t6.y8);
            int q03 = q0(org.telegram.ui.ActionBar.t6.z8);
            if (q02 == this.q2 && q03 == this.r2) {
                return;
            }
            this.q2 = q02;
            this.r2 = q03;
            org.telegram.ui.ActionBar.t0[] t0VarArr = {this.w0, this.v0, this.x0, this.y0, this.n0};
            for (int i10 = 0; i10 < 5; i10++) {
                org.telegram.ui.ActionBar.t0 t0Var = t0VarArr[i10];
                if (t0Var != null) {
                    t0Var.setIconColor(q02);
                    if (t0Var.getBackground() != null) {
                        org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), q03, true);
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final SpannableStringBuilder z() {
        if (this.Z1 == null) {
            this.Z1 = new SpannableStringBuilder();
            if (z0()) {
                this.Z1.append((CharSequence) org.telegram.messenger.cd.L0(2131746717, null));
            } else {
                this.Z1.append((CharSequence) "c");
                this.Z1.setSpan(new dq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.Z1.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.cd.L0(2131744827, null));
            }
        }
        return this.Z1;
    }

    public final boolean z0() {
        TLRPC.User Z1;
        long j10 = this.l1;
        return j10 > 0 && (Z1 = org.telegram.messenger.vp.r1(this.x1.getCurrentAccount()).Z1(Long.valueOf(j10))) != null && Z1.bot;
    }

    public final void z1() {
        es0 es0Var = this.J;
        if (es0Var != null) {
            es0Var.f();
        }
        mt0 mt0Var = this.M;
        if (mt0Var != null) {
            mt0Var.f();
        }
        mt0 mt0Var2 = this.N;
        if (mt0Var2 != null) {
            mt0Var2.f();
        }
        nt0 nt0Var = this.L;
        if (nt0Var != null) {
            nt0Var.X(false);
        }
        mt0 mt0Var3 = this.O;
        if (mt0Var3 != null) {
            mt0Var3.f();
        }
        gt0 gt0Var = this.P;
        if (gt0Var != null) {
            gt0Var.f();
        }
        ns0 ns0Var = this.Q;
        if (ns0Var != null) {
            ns0Var.f();
        }
        hs0 hs0Var = this.e0;
        if (hs0Var != null) {
            hs0Var.f();
        }
        Iterator it = this.l2.values().iterator();
        while (it.hasNext()) {
            ((yt0) it.next()).c.f();
        }
    }

    public void L0(SparseArray sparseArray) {
    }

    public void S0(boolean z10) {
    }

    public int c1(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.r2
    public final void l(org.telegram.ui.Cells.v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void r(org.telegram.ui.Cells.v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void x(org.telegram.ui.Cells.v2 v2Var) {
    }

    public void M0() {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void q() {
    }
}
