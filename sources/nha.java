// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class nha extends FrameLayout implements vlb, jm7, dg3, l59 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final rg3 u2 = new rg3((byte) 3);
    public static final int v2 = gm.L(7.0f);
    public static final int w2 = gm.L(7.0f) + gm.L(14.0f);
    public byte A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final tk4 E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final boolean F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final ee0 G0;
    public final cga G1;
    public final a H;
    public final ArrayList H0;
    public hg5 H1;
    public final rja I;
    public final ArrayList I0;
    public final ylb I1;
    public final zja J;
    public final ArrayList J0;
    public final kz4 J1;
    public final ufa K;
    public final ArrayList K0;
    public final e7a K1;
    public final hha L;
    public final kfa L0;
    public boolean L1;
    public final bha M;
    public final hfa M0;
    public final po M1;
    public final aha N;
    public final cm1 N0;
    public v99 N1;
    public final aha O;
    public AnimatorSet O0;
    public int O1;
    public final aha P;
    public final oda P0;
    public boolean P1;
    public final wga Q;
    public final ArrayList Q0;
    public int Q1;
    public final dga R;
    public float R0;
    public AnimatorSet R1;
    public final bga S;
    public final qk3 S0;
    public final SparseArray S1;
    public final zfa T;
    public final FrameLayout T0;
    public long T1;
    public final yga U;
    public final gfa U0;
    public boolean U1;
    public final zga V;
    public final int V0;
    public int V1;
    public final vfa W;
    public final Paint W0;
    public final rfa W1;
    public boolean X0;
    public z3b X1;
    public boolean Y0;
    public float Y1;
    public k39 Z0;
    public boolean Z1;
    public boolean a;
    public final kea a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final lea b0;
    public int b1;
    public int b2;
    public boolean c;
    public final oea c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final aga d0;
    public int d1;
    public int d2;
    public int e;
    public final hu5 e0;
    public boolean e1;
    public int e2;
    public int f;
    public final xfa f0;
    public long f1;
    public int f2;
    public final kha g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final jea h0;
    public TLRPC.UserFull h1;
    public sy4 h2;
    public final kha i0;
    public AnimatorSet i1;
    public float i2;
    public final kga j0;
    public boolean j1;
    public final RectF j2;
    public final kga k0;
    public boolean k1;
    public Runnable k2;
    public final kga l0;
    public boolean l1;
    public int l2;
    public final gga m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final iga[] n0;
    public boolean n1;
    public final HashMap n2;
    public final r7 o0;
    public boolean o1;
    public int o2;
    public final r7 p0;
    public final int[] p1;
    public int p2;
    public final r7 q0;
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
    public final uea u1;
    public final s09 v0;
    public float v1;
    public int w;
    public final r7 w0;
    public final cha[] w1;
    public int x;
    public final r7 x0;
    public final fha x1;
    public final Rect y;
    public final r7 y0;
    public final d y1;
    public final r7 z0;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0a79 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b53 A[EDGE_INSN: B:173:0x0b53->B:174:0x0b53 BREAK  A[LOOP:3: B:141:0x0858->B:170:0x0a79], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0d81 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a9 A[EDGE_INSN: B:48:0x02a9->B:49:0x02a9 BREAK  A[LOOP:0: B:30:0x0250->B:43:0x02a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03b4 A[LOOP:2: B:75:0x03b2->B:76:0x03b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03d6  */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nha(Context context, long j, fha fhaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, d dVar, cga cgaVar, int i4, ylb ylbVar, km0 km0Var) {
        super(context);
        int i5;
        TLRPC.ProfileTab profileTab;
        long j2;
        int i6;
        cha[] chaVarArr;
        int i7;
        hfa hfaVar;
        int i8;
        int i9;
        yga ygaVar;
        float f;
        float f2;
        zja zjaVar;
        r7 r7Var;
        boolean l0;
        km0 km0Var2;
        int i10;
        int i11;
        int i12;
        iga[] igaVarArr;
        View view;
        ?? r14;
        nha nhaVar;
        oea oeaVar;
        boolean z;
        int i13;
        int i14;
        qea qeaVar;
        ne6 ne6Var;
        iga igaVar;
        qea qeaVar2;
        r7 a;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        TL_bots.BotInfo botInfo;
        nha nhaVar2 = this;
        Context context2 = context;
        TLRPC.ChatFull chatFull2 = chatFull;
        ylb ylbVar2 = ylbVar;
        nhaVar2.y = new Rect();
        nhaVar2.n0 = new iga[2];
        nhaVar2.H0 = new ArrayList(10);
        nhaVar2.I0 = new ArrayList(10);
        nhaVar2.J0 = new ArrayList(10);
        nhaVar2.K0 = new ArrayList(10);
        nhaVar2.P0 = new oda(nhaVar2, (byte) 0);
        nhaVar2.Q0 = new ArrayList();
        nhaVar2.W0 = new Paint();
        nhaVar2.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        nhaVar2.n1 = false;
        nhaVar2.o1 = false;
        nhaVar2.p1 = new int[]{3, 3};
        nhaVar2.u1 = new uea(nhaVar2);
        nhaVar2.v1 = -5.0f;
        nhaVar2.w1 = new cha[9];
        nhaVar2.M1 = new po(null);
        nhaVar2.S1 = new SparseArray();
        nhaVar2.V1 = -1;
        nhaVar2.W1 = new rfa(nhaVar2);
        nhaVar2.Y1 = 0.0f;
        nhaVar2.g2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        nhaVar2.j2 = new RectF();
        nhaVar2.l2 = -1;
        nhaVar2.m2 = new HashMap();
        nhaVar2.n2 = new HashMap();
        nhaVar2.q2 = true;
        kz4 kz4Var = new kz4();
        nhaVar2.J1 = kz4Var;
        kz4Var.a(nhaVar2.c0(cmb.c6));
        km0 km0Var3 = km0Var == null ? new km0(kz4Var, kz4Var, kz4Var) : km0Var;
        nhaVar2.F = i4;
        nhaVar2.I1 = ylbVar2;
        tk4 tk4Var = new tk4(context2, null);
        nhaVar2.E = tk4Var;
        tk4Var.setIsSingleCell(true);
        TLRPC.User W1 = dVar.getMessagesController().W1(Long.valueOf(j));
        nhaVar2.x1 = fhaVar;
        nhaVar2.G1 = cgaVar;
        int[] iArr = fhaVar.c;
        long j3 = fhaVar.s;
        nhaVar2.G = j3;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j3 == 0 ? i : 0, iArr[7], iArr[8]};
        nhaVar2.a1 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i5 = 1;
                profileTab = null;
                if (i2 != 14 || i2 == 10 || i2 == 11 || i2 == 6) {
                    nhaVar2.b1 = i2;
                } else if (W1 != null && W1.bot && W1.bot_has_main_app && W1.bot_can_edit) {
                    nhaVar2.b1 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    nhaVar2.b1 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || nhaVar2.s0()))) {
                    nhaVar2.b1 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i20 = iArr2[i5];
                        i15 = -1;
                        if (i20 == -1 || i20 > 0) {
                            nhaVar2.b1 = i5;
                        }
                    } else {
                        i15 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i19 = iArr2[5]) == i15 || i19 > 0)) {
                        nhaVar2.b1 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i18 = iArr2[3]) == i15 || i18 > 0)) {
                        nhaVar2.b1 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i17 = iArr2[4]) == i15 || i17 > 0)) {
                        nhaVar2.b1 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i16 = iArr2[2]) == i15 || i16 > 0)) {
                        nhaVar2.b1 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || nhaVar2.s0())) {
                        nhaVar2.b1 = nhaVar2.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i21 = -1;
                        if (i2 == -1 || j3 != 0) {
                            int i22 = 0;
                            while (true) {
                                int[] iArr3 = nhaVar2.a1;
                                if (i22 >= iArr3.length) {
                                    break;
                                }
                                int i23 = iArr3[i22];
                                if (i23 == i21 || i23 > 0) {
                                    break;
                                }
                                i22++;
                                i21 = -1;
                            }
                            nhaVar2.b1 = i22;
                        } else {
                            nhaVar2.b1 = i2;
                        }
                    } else {
                        nhaVar2.b1 = 14;
                    }
                } else {
                    nhaVar2.b1 = 14;
                }
                nhaVar2.T0(i2);
                nhaVar2.g1 = chatFull2;
                nhaVar2.h1 = userFull;
                if (chatFull2 != null) {
                    nhaVar2.f1 = -chatFull2.migrated_from_chat_id;
                }
                j2 = j;
                nhaVar2.m1 = j2;
                i6 = 0;
                while (true) {
                    chaVarArr = nhaVar2.w1;
                    if (i6 < chaVarArr.length) {
                        break;
                    }
                    chaVarArr[i6] = new cha();
                    nhaVar2.w1[i6].j[0] = pg3.B(nhaVar2.m1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    nhaVar2.w1[i6].j[1] = Integer.MAX_VALUE;
                    nhaVar2.J(i6);
                    if (nhaVar2.f1 != 0 && nhaVar2.g1 != null && nhaVar2.w1[i6].b[1].size() == 0) {
                        cha chaVar = nhaVar2.w1[i6];
                        chaVar.j[1] = nhaVar2.g1.migrated_from_max_id;
                        chaVar.i[1] = false;
                    }
                    i6++;
                }
                nhaVar2.y1 = dVar;
                nhaVar2.H = dVar.getActionBar();
                nhaVar2.I = dVar.getSimpleActionBar();
                nhaVar2.p1[0] = nhaVar2.Z0() > 0 ? gda.p1 : nhaVar2.Z0();
                nhaVar2.p1[1] = nhaVar2.Z0() > 0 ? gda.q1 : nhaVar2.Z0();
                nm7 notificationCenter = dVar.getNotificationCenter();
                notificationCenter.getClass();
                e7a e7aVar = new e7a(notificationCenter, nhaVar2);
                e7aVar.b(nm7.V);
                e7aVar.b(nm7.v);
                e7aVar.b(1);
                e7aVar.b(nm7.J);
                e7aVar.b(nm7.f2);
                e7aVar.b(nm7.g2);
                e7aVar.b(nm7.h2);
                e7aVar.b(nm7.B5);
                e7aVar.b(nm7.z5);
                e7aVar.b(nm7.h3);
                e7aVar.b(nm7.i3);
                e7aVar.b(nm7.r);
                e7aVar.b(nm7.I3);
                e7aVar.b(nm7.Z3);
                e7aVar.b(nm7.f1);
                nhaVar2.K1 = e7aVar;
                for (i7 = 0; i7 < 10; i7++) {
                    if (i2 == 4) {
                        ffa ffaVar = new ffa(nhaVar2, context2);
                        ffaVar.U.c();
                        nhaVar2.J0.add(ffaVar);
                    }
                }
                nhaVar2.V0 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
                nhaVar2.Y0 = false;
                nhaVar2.Z0 = null;
                hfaVar = nhaVar2.M0;
                if (hfaVar != null) {
                    hfaVar.g(false);
                }
                nhaVar2.X0 = false;
                Drawable drawable = context2.getResources().getDrawable(R.drawable.photos_header_shadow);
                nhaVar2.B0 = drawable;
                anb.x(nhaVar2, drawable, cmb.a7, ylbVar2, PorterDuff.Mode.MULTIPLY);
                kfa kfaVar = nhaVar2.L0;
                int currentTabId = kfaVar == null ? kfaVar.getCurrentTabId() : i2;
                kfa kfaVar2 = new kfa(nhaVar2, context2, nhaVar2.I1);
                i8 = nhaVar2.b1;
                if (i8 != -1) {
                    kfaVar2.setInitialTabId(i8);
                    nhaVar2.b1 = -1;
                }
                kfaVar2.c0 = (short) 320;
                int i24 = cmb.vi;
                int i25 = cmb.ui;
                kfaVar2.M = i24;
                kfaVar2.N = i25;
                kfaVar2.updateColors();
                kfaVar2.setUseMinimalWidth(true);
                kfaVar2.setDelegate(new mfa(nhaVar2));
                nhaVar2.L0 = kfaVar2;
                for (i9 = 1; i9 >= 0; i9--) {
                    nhaVar2.c1[i9].clear();
                }
                nhaVar2.d1 = 0;
                nhaVar2.Q0.clear();
                ygaVar = nhaVar2.U;
                if (ygaVar != null) {
                    ygaVar.x.clear();
                }
                if (nhaVar2 instanceof oe5) {
                    rja rjaVar = nhaVar2.I;
                    if (rjaVar != null) {
                        yja t = rjaVar.t();
                        a = t.a(0, R.drawable.outline_header_search);
                        if (nhaVar2.k0() || nhaVar2.q0()) {
                            f = 10.0f;
                        } else {
                            zja a2 = t.a(0, R.drawable.ic_ab_other);
                            nhaVar2.J = a2;
                            f = 10.0f;
                            a2.setContentDescription(jb6.M0(2131754838, null));
                            a2.Y(false, false);
                        }
                    } else {
                        f = 10.0f;
                        r6 t3 = nhaVar2.H.t();
                        t3.addOnLayoutChangeListener(new lfa(nhaVar2));
                        if (nhaVar2.m1 == nhaVar2.y1.getUserConfig().e() && (nhaVar2.y1 instanceof cm6) && nhaVar2.q()) {
                            nhaVar2.p0 = t3.a(11, R.drawable.outline_header_search);
                        }
                        a = t3.a(0, 0);
                    }
                    r7 K = a.M().K(new sfa(nhaVar2));
                    nhaVar2.q0 = K;
                    hfa hfaVar2 = nhaVar2.M0;
                    K.setSearchFieldHint(jb6.M0((hfaVar2 != null && hfaVar2.a() && nhaVar2.getSelectedTab() == 11) ? 2131745602 : 2131745570, null));
                    K.setContentDescription(jb6.M0(2131745570, "Search"));
                    if (nhaVar2.I != null) {
                        ((zja) K).Y(false, false);
                    } else {
                        K.setTranslationY(gm.L(f));
                        nhaVar2.setSearchItemVisibility(nhaVar2.s0() ? 8 : 4);
                    }
                } else {
                    f = 10.0f;
                }
                ImageView imageView = new ImageView(context2);
                nhaVar2.u0 = imageView;
                imageView.setContentDescription(jb6.M0(2131754838, "AccDescrMoreOptions"));
                imageView.setTranslationY(gm.L(f));
                imageView.setVisibility(4);
                if (nhaVar2.I == null || nhaVar2.k0() || nhaVar2.q0()) {
                    f2 = 2.0f;
                } else {
                    f2 = 2.0f;
                    nhaVar2.H.addView(imageView, qoe.e(48, 56, 85));
                    s09 s09Var = new s09(context2);
                    nhaVar2.v0 = s09Var;
                    s09Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    s09Var.e(R.raw.options_to_search, 24, 24);
                    s09Var.getAnimatedDrawable().G *= 2.0f;
                    s09Var.getAnimatedDrawable().h = true;
                    anb.s(s09Var, cmb.x8, ylbVar2, PorterDuff.Mode.SRC_IN);
                    s09Var.setVisibility(8);
                    nhaVar2.H.addView(s09Var, qoe.e(48, 56, 85));
                }
                imageView.setOnClickListener(new pda(nhaVar2, (byte) 0));
                zjaVar = nhaVar2.J;
                if (zjaVar != null) {
                    zjaVar.setOnClickListener(new pda(nhaVar2, (byte) 1));
                }
                r7Var = nhaVar2.q0;
                if (r7Var != null && nhaVar2.I == null) {
                    EditTextBoldCursor searchField = r7Var.getSearchField();
                    int i26 = cmb.F6;
                    anb.X(searchField, i26, ylbVar2);
                    anb.D(searchField, cmb.Ij, ylbVar2);
                    anb.v(searchField, i26, ylbVar2);
                }
                nhaVar2.A0 = (byte) 0;
                LinearLayout linearLayout = new LinearLayout(context2);
                nhaVar2.E0 = linearLayout;
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                linearLayout.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                nhaVar2.F0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ee0 ee0Var = new ee0(true);
                nhaVar2.G0 = ee0Var;
                imageView2.setImageDrawable(ee0Var);
                int i27 = cmb.x8;
                ee0Var.a(nhaVar2.c0(i27));
                int i28 = cmb.y8;
                anb.R(imageView2, cmb.e0(nhaVar2.c0(i28), 1), null, anb.M(i28), ylbVar2);
                imageView2.setContentDescription(jb6.M0(2131751978, "Close"));
                linearLayout.addView(imageView2, new LinearLayout.LayoutParams(gm.L(54.0f), -1));
                nhaVar2.Q0.add(imageView2);
                imageView2.setOnClickListener(new pda(nhaVar2, (byte) 2));
                NumberTextView numberTextView = new NumberTextView(context2);
                nhaVar2.D0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(gm.o());
                numberTextView.setTextColor(nhaVar2.c0(i27));
                linearLayout.addView(numberTextView, qoe.m(1.0f, 0, -1, 18, 0, 0));
                nhaVar2.Q0.add(numberTextView);
                if (!pg3.B(nhaVar2.m1)) {
                    if (!nhaVar2.s0()) {
                        nhaVar2.x0 = nhaVar2.F(context2, nm7.m1, R.drawable.msg_message, jb6.L0(2131754877));
                        nhaVar2.w0 = nhaVar2.F(context2, 100, R.drawable.msg_forward, jb6.L0(2131750519));
                    }
                    r7 F = nhaVar2.F(context2, nm7.n1, R.drawable.msg_pin, jb6.L0(2131746978));
                    nhaVar2.y0 = F;
                    F.setVisibility(8);
                    r7 F2 = nhaVar2.F(context2, nm7.o1, R.drawable.msg_unpin, jb6.L0(2131743531));
                    nhaVar2.z0 = F2;
                    F2.setVisibility(8);
                    nhaVar2.E1();
                }
                nhaVar2.o0 = nhaVar2.F(context2, 101, R.drawable.msg_delete, jb6.M0(2131751535, "Delete"));
                nhaVar2.K = new ufa(nhaVar2, context2);
                nhaVar2.L = new hha(nhaVar2, context2);
                nhaVar2.N = new aha(nhaVar2, context2, 1);
                nhaVar2.O = new aha(nhaVar2, context2, 2);
                nhaVar2.P = new aha(nhaVar2, context2, 4);
                nhaVar2.Q = new wga(nhaVar2, context2, nhaVar2.y1.getCurrentAccount(), nhaVar2.y1.getResourceProvider());
                nhaVar2.R = new dga(nhaVar2, context2);
                nhaVar2.j0 = new kga(nhaVar2, context2, 1);
                nhaVar2.k0 = new kga(nhaVar2, context2, 4);
                nhaVar2.l0 = new kga(nhaVar2, context2, 3);
                nhaVar2.m0 = new gga(nhaVar2, context2);
                nhaVar2.S = new bga(nhaVar2, context2);
                nhaVar2.T = new zfa(nhaVar2, context2);
                nhaVar2.U = new yga(nhaVar2, context2);
                nhaVar2.V = new zga(nhaVar2, context2);
                if (!nhaVar2.s0() && !nhaVar2.h0() && nhaVar2.G == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", nhaVar2.y1.getUserConfig().e());
                    bundle.putInt("chatMode", 3);
                    vfa vfaVar = new vfa(nhaVar2, context2, nhaVar2.y1.getParentLayout(), bundle);
                    nhaVar2.W = vfaVar;
                    long j4 = nhaVar2.m1;
                    fw1 fw1Var = vfaVar.a;
                    fw1Var.s4 = j4;
                    fw1Var.nb = true;
                    vfaVar.setClipToOutline(true);
                    vfaVar.setOutlineProvider(new wfa());
                }
                aga agaVar = new aga(nhaVar2, context2);
                nhaVar2.d0 = agaVar;
                if (nhaVar2.G == 0) {
                    agaVar.e = arrayList;
                    agaVar.d = currentTabId != 7 ? null : chatFull2;
                }
                nhaVar2.f0 = new xfa(nhaVar2, context2);
                nhaVar2.e0 = new hu5(new yfa(nhaVar2));
                nhaVar2.g0 = new kha(nhaVar2, context2, false);
                nhaVar2.h0 = new jea(nhaVar2, context2);
                nhaVar2.i0 = new kha(nhaVar2, context2, true);
                nhaVar2.M = new bha(nhaVar2, context2);
                l0 = nhaVar2.l0();
                d dVar2 = nhaVar2.y1;
                if (!l0) {
                    nhaVar2.a0 = new kea(nhaVar2, context2, dVar2, nhaVar2.m1);
                } else if (dVar2 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    nhaVar2.t0 = textView;
                    textView.setText(jb6.L0(2131745680).toUpperCase());
                    textView.setTypeface(gm.o());
                    int i29 = cmb.Ei;
                    anb.X(textView, i29, ylbVar2);
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    anb.R(textView, cmb.e0(cmb.p1(0.15f, nhaVar2.c0(i29)), 3), null, anb.K(0.15f, i29), ylbVar2);
                    textView.setPadding(gm.L(19.0f), 0, gm.L(19.0f), 0);
                    ViewGroup viewGroup = nhaVar2.I;
                    (viewGroup == null ? nhaVar2.H : viewGroup).addView(textView, qoe.e(-2, 56, 85));
                    textView.setOnClickListener(new pda(nhaVar2, (byte) 3));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    d dVar3 = nhaVar2.y1;
                    km0 km0Var4 = km0Var3;
                    lea leaVar = new lea(nhaVar2, dVar3, context2, dVar3.getCurrentAccount(), ((ProfileActivity) nhaVar2.y1).a(), ylbVar2, km0Var4);
                    ylbVar2 = ylbVar2;
                    nhaVar2.b0 = leaVar;
                    nhaVar2.F1();
                    nhaVar2.c0 = new oea(nhaVar2, context2, nhaVar2.getStoriesController().A(nhaVar2.m1, true), new nea(nhaVar2, context2, dVar, ylbVar2));
                    km0Var2 = km0Var4;
                    nhaVar2.setWillNotDraw(false);
                    i10 = 0;
                    i11 = -1;
                    i12 = 0;
                    while (true) {
                        igaVarArr = nhaVar2.n0;
                        if (i12 >= igaVarArr.length) {
                            break;
                        }
                        if (i12 == 0 && (igaVar = igaVarArr[i12]) != null && (qeaVar2 = igaVar.x) != null) {
                            i11 = qeaVar2.K0();
                            if (i11 != nhaVar2.n0[i12].x.A() - 1) {
                                b59 b59Var = (b59) nhaVar2.n0[i12].h.K(i11);
                                if (b59Var != null) {
                                    i10 = b59Var.a.getTop();
                                } else {
                                    i11 = -1;
                                }
                            } else {
                                i13 = i10;
                                i14 = -1;
                                pea peaVar = new pea(nhaVar2, context2);
                                nhaVar2.addView(peaVar, qoe.d(-1, -1.0f, 51, 0.0f, nhaVar2.I0(), 0.0f, 0.0f));
                                if (i12 == 1) {
                                    peaVar.setTranslationX(gm.q.x);
                                }
                                nhaVar2.n0[i12] = peaVar;
                                peaVar.O = ylbVar2;
                                qeaVar = new qea(nhaVar2, peaVar);
                                peaVar.x = qeaVar;
                                qeaVar.O = new rea(nhaVar2, peaVar);
                                nhaVar2.n0[i12].d = new sc3();
                                nhaVar2.n0[i12].d.n(280L);
                                nhaVar2.n0[i12].d.o(d53.h);
                                iga igaVar2 = nhaVar2.n0[i12];
                                igaVar2.d.m = false;
                                context2 = context;
                                igaVar2.h = new sea(nhaVar2, context, ylbVar2, peaVar, qeaVar);
                                nhaVar2.n0[i12].h.setFastScrollEnabled(1);
                                nhaVar2.n0[i12].h.setScrollingTouchSlop(1);
                                nhaVar2.n0[i12].h.setPinnedSectionOffsetY(-gm.L(f2));
                                nhaVar2.n0[i12].h.setPadding(0, gm.L(54.0f), 0, 0);
                                nhaVar2.n0[i12].h.setItemAnimator(null);
                                nhaVar2.n0[i12].h.setClipToPadding(false);
                                nhaVar2.n0[i12].h.setSectionsType(2);
                                nhaVar2.n0[i12].h.setLayoutManager(qeaVar);
                                iga igaVar3 = nhaVar2.n0[i12];
                                igaVar3.addView(igaVar3.h, qoe.c(-1.0f, -1));
                                nhaVar2.n0[i12].n = new hga(context2);
                                iga igaVar4 = nhaVar2.n0[i12];
                                hga hgaVar = igaVar4.n;
                                tea teaVar = new tea(nhaVar2);
                                igaVar4.r = teaVar;
                                hgaVar.setLayoutManager(teaVar);
                                iga igaVar5 = nhaVar2.n0[i12];
                                igaVar5.addView(igaVar5.n, qoe.c(-1.0f, -1));
                                nhaVar2.n0[i12].n.setVisibility(8);
                                nhaVar2.n0[i12].n.i(new vea(peaVar));
                                nhaVar2.n0[i12].h.i(new wea(nhaVar2, peaVar));
                                nhaVar2.n0[i12].h.setOnItemClickListener(new jp1(nhaVar2, peaVar, context2, j2, ylbVar, (byte) 1));
                                nhaVar2.n0[i12].h.setOnScrollListener(new zea(nhaVar2, peaVar, qeaVar));
                                nhaVar2.n0[i12].h.setOnItemLongClickListener(new afa(nhaVar2, peaVar));
                                if (i12 == 0 && i14 != -1) {
                                    qeaVar.g1(i14, i13);
                                }
                                iga igaVar6 = nhaVar2.n0[i12];
                                igaVar6.y = new bfa(context2, igaVar6.h);
                                nhaVar2.n0[i12].y.setVisibility(8);
                                iga igaVar7 = nhaVar2.n0[i12];
                                sea seaVar = igaVar7.h;
                                bfa bfaVar = igaVar7.y;
                                FrameLayout.LayoutParams c = qoe.c(-1.0f, -1);
                                ne6Var = seaVar.c1;
                                if (ne6Var == null) {
                                    ne6Var = new ne6((byte) 15, seaVar.getContext(), seaVar);
                                    seaVar.c1 = ne6Var;
                                }
                                ne6Var.addView(bfaVar, c);
                                nhaVar2.n0[i12].s = new cfa(nhaVar2, context2, peaVar);
                                cfa cfaVar = nhaVar2.n0[i12].s;
                                cfaVar.x = false;
                                cfaVar.setClipToOutline(true);
                                nhaVar2.n0[i12].s.setOutlineProvider(new dfa());
                                if (i12 == 0) {
                                    nhaVar2.n0[i12].setVisibility(8);
                                }
                                iga igaVar8 = nhaVar2.n0[i12];
                                igaVar8.w = new efa(nhaVar2, context2, igaVar8.s);
                                nhaVar2.n0[i12].w.d(8, false);
                                nhaVar2.n0[i12].w.setAnimateLayoutChange(true);
                                iga igaVar9 = nhaVar2.n0[i12];
                                igaVar9.addView(igaVar9.w, qoe.c(-1.0f, -1));
                                nhaVar2.n0[i12].w.setOnTouchListener(new w02((byte) 25));
                                nhaVar2.n0[i12].w.e(true, false);
                                nhaVar2.n0[i12].w.d.setText(jb6.M0(2131747901, "NoResult"));
                                nhaVar2.n0[i12].w.f.setVisibility(8);
                                nhaVar2.n0[i12].w.e.setText(jb6.L0(2131745541));
                                nhaVar2.n0[i12].w.f.setVisibility(8);
                                iga igaVar10 = nhaVar2.n0[i12];
                                igaVar10.w.addView(igaVar10.s, qoe.d(-1, -1.0f, nm7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
                                iga igaVar11 = nhaVar2.n0[i12];
                                igaVar11.h.setEmptyView(igaVar11.w);
                                nhaVar2.n0[i12].h.p1(0, true);
                                iga[] igaVarArr2 = nhaVar2.n0;
                                iga igaVar12 = igaVarArr2[i12];
                                igaVar12.E = new cw6(igaVar12.h, igaVarArr2[i12].x);
                                i12++;
                                j2 = j;
                                ylbVar2 = ylbVar;
                                i10 = i13;
                                i11 = i14;
                            }
                        }
                        i13 = i10;
                        i14 = i11;
                        pea peaVar2 = new pea(nhaVar2, context2);
                        nhaVar2.addView(peaVar2, qoe.d(-1, -1.0f, 51, 0.0f, nhaVar2.I0(), 0.0f, 0.0f));
                        if (i12 == 1) {
                        }
                        nhaVar2.n0[i12] = peaVar2;
                        peaVar2.O = ylbVar2;
                        qeaVar = new qea(nhaVar2, peaVar2);
                        peaVar2.x = qeaVar;
                        qeaVar.O = new rea(nhaVar2, peaVar2);
                        nhaVar2.n0[i12].d = new sc3();
                        nhaVar2.n0[i12].d.n(280L);
                        nhaVar2.n0[i12].d.o(d53.h);
                        iga igaVar22 = nhaVar2.n0[i12];
                        igaVar22.d.m = false;
                        context2 = context;
                        igaVar22.h = new sea(nhaVar2, context, ylbVar2, peaVar2, qeaVar);
                        nhaVar2.n0[i12].h.setFastScrollEnabled(1);
                        nhaVar2.n0[i12].h.setScrollingTouchSlop(1);
                        nhaVar2.n0[i12].h.setPinnedSectionOffsetY(-gm.L(f2));
                        nhaVar2.n0[i12].h.setPadding(0, gm.L(54.0f), 0, 0);
                        nhaVar2.n0[i12].h.setItemAnimator(null);
                        nhaVar2.n0[i12].h.setClipToPadding(false);
                        nhaVar2.n0[i12].h.setSectionsType(2);
                        nhaVar2.n0[i12].h.setLayoutManager(qeaVar);
                        iga igaVar32 = nhaVar2.n0[i12];
                        igaVar32.addView(igaVar32.h, qoe.c(-1.0f, -1));
                        nhaVar2.n0[i12].n = new hga(context2);
                        iga igaVar42 = nhaVar2.n0[i12];
                        hga hgaVar2 = igaVar42.n;
                        tea teaVar2 = new tea(nhaVar2);
                        igaVar42.r = teaVar2;
                        hgaVar2.setLayoutManager(teaVar2);
                        iga igaVar52 = nhaVar2.n0[i12];
                        igaVar52.addView(igaVar52.n, qoe.c(-1.0f, -1));
                        nhaVar2.n0[i12].n.setVisibility(8);
                        nhaVar2.n0[i12].n.i(new vea(peaVar2));
                        nhaVar2.n0[i12].h.i(new wea(nhaVar2, peaVar2));
                        nhaVar2.n0[i12].h.setOnItemClickListener(new jp1(nhaVar2, peaVar2, context2, j2, ylbVar, (byte) 1));
                        nhaVar2.n0[i12].h.setOnScrollListener(new zea(nhaVar2, peaVar2, qeaVar));
                        nhaVar2.n0[i12].h.setOnItemLongClickListener(new afa(nhaVar2, peaVar2));
                        if (i12 == 0) {
                            qeaVar.g1(i14, i13);
                        }
                        iga igaVar62 = nhaVar2.n0[i12];
                        igaVar62.y = new bfa(context2, igaVar62.h);
                        nhaVar2.n0[i12].y.setVisibility(8);
                        iga igaVar72 = nhaVar2.n0[i12];
                        sea seaVar2 = igaVar72.h;
                        bfa bfaVar2 = igaVar72.y;
                        FrameLayout.LayoutParams c2 = qoe.c(-1.0f, -1);
                        ne6Var = seaVar2.c1;
                        if (ne6Var == null) {
                        }
                        ne6Var.addView(bfaVar2, c2);
                        nhaVar2.n0[i12].s = new cfa(nhaVar2, context2, peaVar2);
                        cfa cfaVar2 = nhaVar2.n0[i12].s;
                        cfaVar2.x = false;
                        cfaVar2.setClipToOutline(true);
                        nhaVar2.n0[i12].s.setOutlineProvider(new dfa());
                        if (i12 == 0) {
                        }
                        iga igaVar82 = nhaVar2.n0[i12];
                        igaVar82.w = new efa(nhaVar2, context2, igaVar82.s);
                        nhaVar2.n0[i12].w.d(8, false);
                        nhaVar2.n0[i12].w.setAnimateLayoutChange(true);
                        iga igaVar92 = nhaVar2.n0[i12];
                        igaVar92.addView(igaVar92.w, qoe.c(-1.0f, -1));
                        nhaVar2.n0[i12].w.setOnTouchListener(new w02((byte) 25));
                        nhaVar2.n0[i12].w.e(true, false);
                        nhaVar2.n0[i12].w.d.setText(jb6.M0(2131747901, "NoResult"));
                        nhaVar2.n0[i12].w.f.setVisibility(8);
                        nhaVar2.n0[i12].w.e.setText(jb6.L0(2131745541));
                        nhaVar2.n0[i12].w.f.setVisibility(8);
                        iga igaVar102 = nhaVar2.n0[i12];
                        igaVar102.w.addView(igaVar102.s, qoe.d(-1, -1.0f, nm7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
                        iga igaVar112 = nhaVar2.n0[i12];
                        igaVar112.h.setEmptyView(igaVar112.w);
                        nhaVar2.n0[i12].h.p1(0, true);
                        iga[] igaVarArr22 = nhaVar2.n0;
                        iga igaVar122 = igaVarArr22[i12];
                        igaVar122.E = new cw6(igaVar122.h, igaVarArr22[i12].x);
                        i12++;
                        j2 = j;
                        ylbVar2 = ylbVar;
                        i10 = i13;
                        i11 = i14;
                    }
                    view = nhaVar2.c0;
                    if (view != null) {
                        nhaVar2.addView(view, qoe.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    cm1 cm1Var = new cm1(context2);
                    nhaVar2.N0 = cm1Var;
                    cm1Var.h0((int) (System.currentTimeMillis() / 1000), false, false);
                    cm1Var.setAlpha(0.0f);
                    int i30 = cmb.md;
                    int i31 = cmb.ae;
                    cm1Var.U0 = i30;
                    cm1Var.V0 = i31;
                    cm1Var.setTranslationY(-gm.L(48.0f));
                    nhaVar2.addView(cm1Var, qoe.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    for (iga igaVar13 : nhaVar2.n0) {
                        y49 fastScroll = igaVar13.h.getFastScroll();
                        if (fastScroll != null) {
                            fastScroll.a(km0Var2, nhaVar2.I != null ? qqd.l(ylbVar) : qqd.n(ylbVar));
                        }
                    }
                    if (nhaVar2.H()) {
                        r14 = 0;
                        nhaVar = nhaVar2;
                    } else {
                        nm0 l = nhaVar2.I != null ? qqd.l(ylbVar) : qqd.n(ylbVar);
                        qk3 qk3Var = new qk3(context2);
                        nhaVar2.S0 = qk3Var;
                        int L = gm.L(11.0f);
                        int i32 = w2;
                        qk3Var.setPadding(L, i32, gm.L(11.0f), i32);
                        im0 b = km0Var2.b(qk3Var, l);
                        b.r(gm.L(24.0f));
                        b.q(gm.L(7.0f));
                        qk3Var.setBlurredBackground(b);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        nhaVar2.T0 = frameLayout;
                        qk3Var.addView(frameLayout);
                        qk3Var.j(frameLayout, true, false);
                        qk3Var.setOnAnimatedHeightChangedListener(new oda(nhaVar2, (byte) 1));
                        gfa gfaVar = new gfa(nhaVar2, context2, dVar, this, ylbVar);
                        nhaVar2.U0 = gfaVar;
                        frameLayout.addView(gfaVar);
                        qk3Var.setCallFragmentContextView(gfaVar);
                        nhaVar2.addView(qk3Var, qoe.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
                        gfaVar.setDelegate(new qda(nhaVar2));
                        im0 b2 = km0Var2.b(nhaVar2.L0, l);
                        wi8.r(b2, gm.L(18.0f), 6.666f);
                        nhaVar2.L0.setPadding(0, gm.L(7.0f), 0, gm.L(7.0f));
                        nhaVar2.L0.setClipToPadding(false);
                        nhaVar2.L0.setBackground(null);
                        nhaVar2.L0.setBlurredBackground(b2);
                        nhaVar2.L0.setOpen(false);
                        nhaVar2.addView(nhaVar2.L0, qoe.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
                        Context context3 = nhaVar2.getContext();
                        d dVar4 = nhaVar2.y1;
                        hfa hfaVar3 = new hfa(nhaVar2, context3, dVar4, dVar4.getCurrentAccount(), nhaVar2.h0() ? 0L : nhaVar2.m1, ylbVar);
                        nha nhaVar3 = nhaVar2;
                        nhaVar3.M0 = hfaVar3;
                        hfaVar3.d(km0Var2, l);
                        hfaVar3.setShown(0.0f);
                        nhaVar3.addView(hfaVar3, qoe.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        if (nhaVar3.I == null) {
                            im0 b3 = km0Var2.b(nhaVar3.E0, l);
                            wi8.r(b3, gm.L(18.0f), 6.666f);
                            nhaVar3.E0.setBackground(b3);
                            z = false;
                            nhaVar3.E0.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            nhaVar3.addView(nhaVar3.E0, qoe.e(-1, 50, 51));
                        } else {
                            z = false;
                        }
                        nhaVar3.n();
                        nhaVar = nhaVar3;
                        r14 = z;
                    }
                    nhaVar.N1(r14);
                    nhaVar.z1(r14);
                    nhaVar.B(r14, r14);
                    if (nhaVar.a1[r14] >= 0) {
                        nhaVar.G0(r14);
                    }
                    oeaVar = nhaVar.c0;
                    if (oeaVar == null || i3 <= 0) {
                        return;
                    }
                    oeaVar.setInitialTabId(i3);
                    return;
                }
                km0Var2 = km0Var3;
                nhaVar2.setWillNotDraw(false);
                i10 = 0;
                i11 = -1;
                i12 = 0;
                while (true) {
                    igaVarArr = nhaVar2.n0;
                    if (i12 >= igaVarArr.length) {
                    }
                    iga igaVar822 = nhaVar2.n0[i12];
                    igaVar822.w = new efa(nhaVar2, context2, igaVar822.s);
                    nhaVar2.n0[i12].w.d(8, false);
                    nhaVar2.n0[i12].w.setAnimateLayoutChange(true);
                    iga igaVar922 = nhaVar2.n0[i12];
                    igaVar922.addView(igaVar922.w, qoe.c(-1.0f, -1));
                    nhaVar2.n0[i12].w.setOnTouchListener(new w02((byte) 25));
                    nhaVar2.n0[i12].w.e(true, false);
                    nhaVar2.n0[i12].w.d.setText(jb6.M0(2131747901, "NoResult"));
                    nhaVar2.n0[i12].w.f.setVisibility(8);
                    nhaVar2.n0[i12].w.e.setText(jb6.L0(2131745541));
                    nhaVar2.n0[i12].w.f.setVisibility(8);
                    iga igaVar1022 = nhaVar2.n0[i12];
                    igaVar1022.w.addView(igaVar1022.s, qoe.d(-1, -1.0f, nm7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
                    iga igaVar1122 = nhaVar2.n0[i12];
                    igaVar1122.h.setEmptyView(igaVar1122.w);
                    nhaVar2.n0[i12].h.p1(0, true);
                    iga[] igaVarArr222 = nhaVar2.n0;
                    iga igaVar1222 = igaVarArr222[i12];
                    igaVar1222.E = new cw6(igaVar1222.h, igaVarArr222[i12].x);
                    i12++;
                    j2 = j;
                    ylbVar2 = ylbVar;
                    i10 = i13;
                    i11 = i14;
                }
                view = nhaVar2.c0;
                if (view != null) {
                }
                cm1 cm1Var2 = new cm1(context2);
                nhaVar2.N0 = cm1Var2;
                cm1Var2.h0((int) (System.currentTimeMillis() / 1000), false, false);
                cm1Var2.setAlpha(0.0f);
                int i302 = cmb.md;
                int i312 = cmb.ae;
                cm1Var2.U0 = i302;
                cm1Var2.V0 = i312;
                cm1Var2.setTranslationY(-gm.L(48.0f));
                nhaVar2.addView(cm1Var2, qoe.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                while (r4 < r2) {
                }
                if (nhaVar2.H()) {
                }
                nhaVar.N1(r14);
                nhaVar.z1(r14);
                nhaVar.B(r14, r14);
                if (nhaVar.a1[r14] >= 0) {
                }
                oeaVar = nhaVar.c0;
                if (oeaVar == null) {
                    return;
                } else {
                    return;
                }
            }
            profileTab = chatFull2.main_tab;
        }
        i5 = 1;
        if (i2 != 14) {
        }
        nhaVar2.b1 = i2;
        nhaVar2.T0(i2);
        nhaVar2.g1 = chatFull2;
        nhaVar2.h1 = userFull;
        if (chatFull2 != null) {
        }
        j2 = j;
        nhaVar2.m1 = j2;
        i6 = 0;
        while (true) {
            chaVarArr = nhaVar2.w1;
            if (i6 < chaVarArr.length) {
            }
            i6++;
        }
        nhaVar2.y1 = dVar;
        nhaVar2.H = dVar.getActionBar();
        nhaVar2.I = dVar.getSimpleActionBar();
        nhaVar2.p1[0] = nhaVar2.Z0() > 0 ? gda.p1 : nhaVar2.Z0();
        nhaVar2.p1[1] = nhaVar2.Z0() > 0 ? gda.q1 : nhaVar2.Z0();
        nm7 notificationCenter2 = dVar.getNotificationCenter();
        notificationCenter2.getClass();
        e7a e7aVar2 = new e7a(notificationCenter2, nhaVar2);
        e7aVar2.b(nm7.V);
        e7aVar2.b(nm7.v);
        e7aVar2.b(1);
        e7aVar2.b(nm7.J);
        e7aVar2.b(nm7.f2);
        e7aVar2.b(nm7.g2);
        e7aVar2.b(nm7.h2);
        e7aVar2.b(nm7.B5);
        e7aVar2.b(nm7.z5);
        e7aVar2.b(nm7.h3);
        e7aVar2.b(nm7.i3);
        e7aVar2.b(nm7.r);
        e7aVar2.b(nm7.I3);
        e7aVar2.b(nm7.Z3);
        e7aVar2.b(nm7.f1);
        nhaVar2.K1 = e7aVar2;
        while (i7 < 10) {
        }
        nhaVar2.V0 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        nhaVar2.Y0 = false;
        nhaVar2.Z0 = null;
        hfaVar = nhaVar2.M0;
        if (hfaVar != null) {
        }
        nhaVar2.X0 = false;
        Drawable drawable2 = context2.getResources().getDrawable(R.drawable.photos_header_shadow);
        nhaVar2.B0 = drawable2;
        anb.x(nhaVar2, drawable2, cmb.a7, ylbVar2, PorterDuff.Mode.MULTIPLY);
        kfa kfaVar3 = nhaVar2.L0;
        if (kfaVar3 == null) {
        }
        kfa kfaVar22 = new kfa(nhaVar2, context2, nhaVar2.I1);
        i8 = nhaVar2.b1;
        if (i8 != -1) {
        }
        kfaVar22.c0 = (short) 320;
        int i242 = cmb.vi;
        int i252 = cmb.ui;
        kfaVar22.M = i242;
        kfaVar22.N = i252;
        kfaVar22.updateColors();
        kfaVar22.setUseMinimalWidth(true);
        kfaVar22.setDelegate(new mfa(nhaVar2));
        nhaVar2.L0 = kfaVar22;
        while (i9 >= 0) {
        }
        nhaVar2.d1 = 0;
        nhaVar2.Q0.clear();
        ygaVar = nhaVar2.U;
        if (ygaVar != null) {
        }
        if (nhaVar2 instanceof oe5) {
        }
        ImageView imageView3 = new ImageView(context2);
        nhaVar2.u0 = imageView3;
        imageView3.setContentDescription(jb6.M0(2131754838, "AccDescrMoreOptions"));
        imageView3.setTranslationY(gm.L(f));
        imageView3.setVisibility(4);
        if (nhaVar2.I == null) {
        }
        f2 = 2.0f;
        imageView3.setOnClickListener(new pda(nhaVar2, (byte) 0));
        zjaVar = nhaVar2.J;
        if (zjaVar != null) {
        }
        r7Var = nhaVar2.q0;
        if (r7Var != null) {
            EditTextBoldCursor searchField2 = r7Var.getSearchField();
            int i262 = cmb.F6;
            anb.X(searchField2, i262, ylbVar2);
            anb.D(searchField2, cmb.Ij, ylbVar2);
            anb.v(searchField2, i262, ylbVar2);
        }
        nhaVar2.A0 = (byte) 0;
        LinearLayout linearLayout2 = new LinearLayout(context2);
        nhaVar2.E0 = linearLayout2;
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setClickable(true);
        linearLayout2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        nhaVar2.F0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        ee0 ee0Var2 = new ee0(true);
        nhaVar2.G0 = ee0Var2;
        imageView22.setImageDrawable(ee0Var2);
        int i272 = cmb.x8;
        ee0Var2.a(nhaVar2.c0(i272));
        int i282 = cmb.y8;
        anb.R(imageView22, cmb.e0(nhaVar2.c0(i282), 1), null, anb.M(i282), ylbVar2);
        imageView22.setContentDescription(jb6.M0(2131751978, "Close"));
        linearLayout2.addView(imageView22, new LinearLayout.LayoutParams(gm.L(54.0f), -1));
        nhaVar2.Q0.add(imageView22);
        imageView22.setOnClickListener(new pda(nhaVar2, (byte) 2));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        nhaVar2.D0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(gm.o());
        numberTextView2.setTextColor(nhaVar2.c0(i272));
        linearLayout2.addView(numberTextView2, qoe.m(1.0f, 0, -1, 18, 0, 0));
        nhaVar2.Q0.add(numberTextView2);
        if (!pg3.B(nhaVar2.m1)) {
        }
        nhaVar2.o0 = nhaVar2.F(context2, 101, R.drawable.msg_delete, jb6.M0(2131751535, "Delete"));
        nhaVar2.K = new ufa(nhaVar2, context2);
        nhaVar2.L = new hha(nhaVar2, context2);
        nhaVar2.N = new aha(nhaVar2, context2, 1);
        nhaVar2.O = new aha(nhaVar2, context2, 2);
        nhaVar2.P = new aha(nhaVar2, context2, 4);
        nhaVar2.Q = new wga(nhaVar2, context2, nhaVar2.y1.getCurrentAccount(), nhaVar2.y1.getResourceProvider());
        nhaVar2.R = new dga(nhaVar2, context2);
        nhaVar2.j0 = new kga(nhaVar2, context2, 1);
        nhaVar2.k0 = new kga(nhaVar2, context2, 4);
        nhaVar2.l0 = new kga(nhaVar2, context2, 3);
        nhaVar2.m0 = new gga(nhaVar2, context2);
        nhaVar2.S = new bga(nhaVar2, context2);
        nhaVar2.T = new zfa(nhaVar2, context2);
        nhaVar2.U = new yga(nhaVar2, context2);
        nhaVar2.V = new zga(nhaVar2, context2);
        if (!nhaVar2.s0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", nhaVar2.y1.getUserConfig().e());
            bundle2.putInt("chatMode", 3);
            vfa vfaVar2 = new vfa(nhaVar2, context2, nhaVar2.y1.getParentLayout(), bundle2);
            nhaVar2.W = vfaVar2;
            long j42 = nhaVar2.m1;
            fw1 fw1Var2 = vfaVar2.a;
            fw1Var2.s4 = j42;
            fw1Var2.nb = true;
            vfaVar2.setClipToOutline(true);
            vfaVar2.setOutlineProvider(new wfa());
        }
        aga agaVar2 = new aga(nhaVar2, context2);
        nhaVar2.d0 = agaVar2;
        if (nhaVar2.G == 0) {
        }
        nhaVar2.f0 = new xfa(nhaVar2, context2);
        nhaVar2.e0 = new hu5(new yfa(nhaVar2));
        nhaVar2.g0 = new kha(nhaVar2, context2, false);
        nhaVar2.h0 = new jea(nhaVar2, context2);
        nhaVar2.i0 = new kha(nhaVar2, context2, true);
        nhaVar2.M = new bha(nhaVar2, context2);
        l0 = nhaVar2.l0();
        d dVar22 = nhaVar2.y1;
        if (!l0) {
        }
        km0Var2 = km0Var3;
        nhaVar2.setWillNotDraw(false);
        i10 = 0;
        i11 = -1;
        i12 = 0;
        while (true) {
            igaVarArr = nhaVar2.n0;
            if (i12 >= igaVarArr.length) {
            }
            iga igaVar8222 = nhaVar2.n0[i12];
            igaVar8222.w = new efa(nhaVar2, context2, igaVar8222.s);
            nhaVar2.n0[i12].w.d(8, false);
            nhaVar2.n0[i12].w.setAnimateLayoutChange(true);
            iga igaVar9222 = nhaVar2.n0[i12];
            igaVar9222.addView(igaVar9222.w, qoe.c(-1.0f, -1));
            nhaVar2.n0[i12].w.setOnTouchListener(new w02((byte) 25));
            nhaVar2.n0[i12].w.e(true, false);
            nhaVar2.n0[i12].w.d.setText(jb6.M0(2131747901, "NoResult"));
            nhaVar2.n0[i12].w.f.setVisibility(8);
            nhaVar2.n0[i12].w.e.setText(jb6.L0(2131745541));
            nhaVar2.n0[i12].w.f.setVisibility(8);
            iga igaVar10222 = nhaVar2.n0[i12];
            igaVar10222.w.addView(igaVar10222.s, qoe.d(-1, -1.0f, nm7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
            iga igaVar11222 = nhaVar2.n0[i12];
            igaVar11222.h.setEmptyView(igaVar11222.w);
            nhaVar2.n0[i12].h.p1(0, true);
            iga[] igaVarArr2222 = nhaVar2.n0;
            iga igaVar12222 = igaVarArr2222[i12];
            igaVar12222.E = new cw6(igaVar12222.h, igaVarArr2222[i12].x);
            i12++;
            j2 = j;
            ylbVar2 = ylbVar;
            i10 = i13;
            i11 = i14;
        }
        view = nhaVar2.c0;
        if (view != null) {
        }
        cm1 cm1Var22 = new cm1(context2);
        nhaVar2.N0 = cm1Var22;
        cm1Var22.h0((int) (System.currentTimeMillis() / 1000), false, false);
        cm1Var22.setAlpha(0.0f);
        int i3022 = cmb.md;
        int i3122 = cmb.ae;
        cm1Var22.U0 = i3022;
        cm1Var22.V0 = i3122;
        cm1Var22.setTranslationY(-gm.L(48.0f));
        nhaVar2.addView(cm1Var22, qoe.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        while (r4 < r2) {
        }
        if (nhaVar2.H()) {
        }
        nhaVar.N1(r14);
        nhaVar.z1(r14);
        nhaVar.B(r14, r14);
        if (nhaVar.a1[r14] >= 0) {
        }
        oeaVar = nhaVar.c0;
        if (oeaVar == null) {
        }
    }

    public static bj G(int i, long j, ylb ylbVar, Context context) {
        bj bjVar = new bj(context, ylbVar);
        ImageView imageView = (ImageView) bjVar.d;
        TextView textView = (TextView) bjVar.c;
        if (i == 0) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747930, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747932, null));
            return bjVar;
        }
        if (i == 1) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747891, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747892, null));
            return bjVar;
        }
        if (i == 2) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747886, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747887, null));
            return bjVar;
        }
        if (i == 3) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747888, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747889, null));
            return bjVar;
        }
        if (i == 4) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747893, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747894, null));
            return bjVar;
        }
        if (i == 5) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747890, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747942, null));
            return bjVar;
        }
        if (i == 6) {
            imageView.setImageDrawable(null);
            textView.setText(jb6.M0(2131747940, null));
            return bjVar;
        }
        if (i == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return bjVar;
    }

    public static int Q(View view) {
        if (view instanceof sha) {
            return ((sha) view).getMessageId();
        }
        if (view instanceof ida) {
            return ((ida) view).getMessage().e1();
        }
        if (view instanceof eda) {
            return ((eda) view).getMessage().e1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab Y(int i, boolean z) {
        if (i != 8 && i != 14 && !z) {
            return null;
        }
        if (i == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i == 5) {
            return new TLRPC.TL_profileTabGifs();
        }
        if (i == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i != 14) {
            return null;
        }
        return new TLRPC.TL_profileTabGifts();
    }

    public static int Z(TLRPC.ProfileTab profileTab) {
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
    public long getPlaylistTopicId() {
        if (sd2.b0(this.y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h4b getStoriesController() {
        return oc7.r1(this.y1.getCurrentAccount()).N1();
    }

    public static boolean j0(int i) {
        return i == 8 || i == 9 || t0(i);
    }

    public static void k1(int i, View view) {
        if (view == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void m1(iga igaVar, cha[] chaVarArr, boolean z) {
        e6a e6aVar;
        if (!z) {
            if (igaVar.G == null || (e6aVar = igaVar.H) == null) {
                return;
            }
            gm.r(e6aVar);
            igaVar.H.run();
            igaVar.H = null;
            igaVar.G = null;
            return;
        }
        if (gda.r1 <= 0 || igaVar.G != null || igaVar.I || igaVar.h.getFastScroll() == null || !igaVar.h.getFastScroll().b0 || igaVar.h.getFastScroll().getVisibility() != 0 || chaVarArr[0].e() < 50) {
            return;
        }
        int i = gda.r1;
        int i2 = i - 1;
        if (i != i2) {
            gda.r1 = i2;
            org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", gda.r1).apply();
        }
        igaVar.I = true;
        Context context = igaVar.getContext();
        ct8 ct8Var = new ct8(context, (byte) 6);
        TextView textView = new TextView(context);
        td4.v(14.0f, 2131745142, 1, textView, null);
        textView.setMaxLines(3);
        int i3 = cmb.fg;
        anb.X(textView, i3, null);
        int L = gm.L(6.0f);
        int i4 = cmb.gg;
        ShapeDrawable b0 = cmb.b0(L, cmb.w0(null, i4, false));
        wmb M = anb.M(i4);
        ct8Var.setBackground(b0);
        anb.j(ct8Var, b0, M, null, null);
        ct8Var.addView(textView, qoe.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        mda mdaVar = new mda(context);
        mdaVar.a = new Random();
        Paint paint = new Paint(1);
        mdaVar.b = paint;
        Paint paint2 = new Paint(1);
        mdaVar.c = paint2;
        mdaVar.f = 1.0f;
        mdaVar.h = 0.0f;
        paint.setColor(on2.p(cmb.w0(null, i3, false), 76));
        paint2.setColor(cmb.w0(null, i3, false));
        Paint paint3 = new Paint();
        mdaVar.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, gm.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        mdaVar.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        ct8Var.addView(mdaVar, qoe.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        igaVar.G = ct8Var;
        igaVar.addView(ct8Var, qoe.c(-2.0f, -2));
        igaVar.G.setAlpha(0.0f);
        igaVar.G.setScaleX(0.8f);
        igaVar.G.setScaleY(0.8f);
        igaVar.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        igaVar.invalidate();
        e6a e6aVar2 = new e6a((Object) igaVar, (Object) ct8Var, (byte) 5);
        igaVar.H = e6aVar2;
        gm.d3(e6aVar2, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z) {
        rja rjaVar = this.I;
        if (rjaVar != null) {
            rjaVar.setEnabled(z);
        } else {
            this.H.setEnabled(z);
        }
    }

    private void setPageOverscan(hga hgaVar) {
        if (!this.c2 || hgaVar == null) {
            return;
        }
        hgaVar.j3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hgaVar.getLayoutParams();
        if (marginLayoutParams != null) {
            int i = marginLayoutParams.topMargin;
            int i2 = -this.e2;
            if (i == i2 && marginLayoutParams.bottomMargin == (-this.f2)) {
                return;
            }
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.bottomMargin = -this.f2;
            hgaVar.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchItemVisibility(int i) {
        r7 r7Var = this.q0;
        if (r7Var == null) {
            return;
        }
        if (this.I != null) {
            B(true, true);
        } else {
            r7Var.setVisibility(i);
        }
    }

    public static boolean t0(int i) {
        return (i & (-65536)) == 65536;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        if (r5 == 0.0f) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(MotionEvent motionEvent) {
        float max;
        kea keaVar;
        float f;
        float f2;
        iga[] igaVarArr = this.n0;
        int i = igaVarArr[0].F;
        if (i == 13 && (keaVar = this.a0) != null) {
            View currentView = keaVar.n.getCurrentView();
            if (currentView instanceof gs0) {
                gs0 gs0Var = (gs0) currentView;
                bs0 bs0Var = gs0Var.w;
                yr0 yr0Var = gs0Var.f;
                if (gs0Var.a != null && gs0Var.getParent() != null) {
                    if (!gs0Var.b || gs0Var.L) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (gs0Var.M && !gs0Var.L && motionEvent.getPointerCount() == 2) {
                                gs0Var.Q = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                gs0Var.R = 1.0f;
                                gs0Var.O = motionEvent.getPointerId(0);
                                gs0Var.P = motionEvent.getPointerId(1);
                                yr0Var.J0(false);
                                yr0Var.cancelLongPress();
                                yr0Var.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) gs0Var.getParent();
                                gs0Var.V = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - gs0Var.getX());
                                int y = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - gs0Var.getY());
                                int i2 = gs0Var.V;
                                Rect rect = gs0Var.W;
                                gs0Var.T = -1;
                                int top = y - yr0Var.getTop();
                                for (int i3 = 0; i3 < yr0Var.getChildCount(); i3++) {
                                    View childAt = yr0Var.getChildAt(i3);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i2, top)) {
                                        gs0Var.T = RecyclerView.S(childAt);
                                        gs0Var.U = childAt.getTop();
                                    }
                                }
                                gs0Var.N = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) gs0Var.getParent()).getY()) - gs0Var.getY() > 0.0f) {
                                    gs0Var.M = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (gs0Var.L || gs0Var.N)) {
                            int i4 = -1;
                            int i5 = -1;
                            for (int i6 = 0; i6 < motionEvent.getPointerCount(); i6++) {
                                if (gs0Var.O == motionEvent.getPointerId(i6)) {
                                    i4 = i6;
                                }
                                if (gs0Var.P == motionEvent.getPointerId(i6)) {
                                    i5 = i6;
                                }
                            }
                            if (i4 == -1 || i5 == -1) {
                                gs0Var.M = false;
                                gs0Var.N = false;
                                gs0Var.L = false;
                                gs0Var.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i5) - motionEvent.getX(i4), motionEvent.getY(i5) - motionEvent.getY(i4))) / gs0Var.Q;
                            gs0Var.R = hypot;
                            if (!gs0Var.L && (hypot > 1.01f || hypot < 0.99f)) {
                                gs0Var.L = true;
                                boolean z = hypot > 1.0f;
                                gs0Var.S = z;
                                gs0Var.b(z);
                            }
                            if (gs0Var.L) {
                                boolean z2 = gs0Var.S;
                                float f3 = gs0Var.R;
                                if (z2) {
                                    if (f3 >= 1.0f) {
                                        f = td4.y(2.0f, f3, 1.0f, 1.0f);
                                        f2 = Math.max(0.0f, Math.min(1.0f, f));
                                        gs0Var.c = f2;
                                    }
                                    gs0Var.c = 0.0f;
                                    f2 = 0.0f;
                                } else {
                                    if (f3 <= 1.0f) {
                                        f = (1.0f - f3) / 0.5f;
                                        f2 = Math.max(0.0f, Math.min(1.0f, f));
                                        gs0Var.c = f2;
                                    }
                                    gs0Var.c = 0.0f;
                                    f2 = 0.0f;
                                }
                                if (f2 == 1.0f) {
                                    int i7 = gs0Var.e;
                                    int ceil = (((int) Math.ceil(gs0Var.T / gs0Var.e)) * i7) + ((int) ((gs0Var.a0.H.C1 / (yr0Var.getMeasuredWidth() - ((int) (yr0Var.getMeasuredWidth() / gs0Var.e)))) * (i7 - 1)));
                                    if (ceil >= bs0Var.b()) {
                                        ceil = bs0Var.b() - 1;
                                    }
                                    gs0Var.T = ceil;
                                }
                                gs0Var.a();
                                if (gs0Var.c == 0.0f) {
                                    gs0Var.S = !gs0Var.S;
                                }
                                gs0Var.b(gs0Var.S);
                                gs0Var.Q = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                yr0Var.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((gs0Var.O == motionEvent.getPointerId(0) && gs0Var.P == motionEvent.getPointerId(1)) || (gs0Var.O == motionEvent.getPointerId(1) && gs0Var.P == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && gs0Var.L) {
                            gs0Var.N = false;
                            gs0Var.M = false;
                            gs0Var.L = false;
                            gs0Var.a();
                        }
                        return gs0Var.L;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i == 0 || j0(i)) && getParent() != null) {
            if (!this.r1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        igaVarArr[0].h.J0(false);
                        igaVarArr[0].h.cancelLongPress();
                        igaVarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - igaVarArr[0].getX());
                        int y2 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - igaVarArr[0].getY());
                        int i8 = this.x;
                        this.s = -1;
                        int top2 = y2 - igaVarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F) {
                            top2 = 0;
                        }
                        for (int i9 = 0; i9 < igaVarArr[0].h.getChildCount(); i9++) {
                            View childAt2 = igaVarArr[0].h.getChildAt(i9);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i8, top2)) {
                                igaVarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.G1.Y() && this.s == -1) {
                            this.s = (int) (((this.p1[j0(igaVarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i8 / igaVarArr[0].h.getMeasuredWidth(), 0.0f))) + igaVarArr[0].x.K0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - igaVarArr[0].getY() > this.d2) {
                            this.b = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.a || this.c)) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                        if (this.e == motionEvent.getPointerId(i12)) {
                            i10 = i12;
                        }
                        if (this.f == motionEvent.getPointerId(i12)) {
                            i11 = i12;
                        }
                    }
                    if (i10 == -1 || i11 == -1) {
                        this.b = false;
                        this.c = false;
                        this.a = false;
                        M();
                        return false;
                    }
                    float hypot2 = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.h;
                    this.n = hypot2;
                    if (!this.a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                        this.a = true;
                        boolean z3 = hypot2 > 1.0f;
                        this.r = z3;
                        p1(z3);
                    }
                    if (this.a) {
                        boolean z4 = this.r;
                        float f4 = this.n;
                        if (!z4 ? f4 <= 1.0f : f4 >= 1.0f) {
                            max = Math.max(0.0f, Math.min(1.0f, z4 ? td4.y(2.0f, f4, 1.0f, 1.0f) : (1.0f - f4) / 0.5f));
                            this.q1 = max;
                        } else {
                            this.q1 = 0.0f;
                            max = 0.0f;
                        }
                        if (max == 1.0f || max == 0.0f) {
                            y59 v1 = j0(this.s1) ? v1(this.s1) : this.K;
                            if (this.q1 == 1.0f) {
                                int i13 = this.t1;
                                int ceil2 = (((int) Math.ceil(this.s / this.t1)) * i13) + ((int) ((this.C1 / (igaVarArr[0].h.getMeasuredWidth() - ((int) (igaVarArr[0].h.getMeasuredWidth() / this.t1)))) * (i13 - 1)));
                                if (ceil2 >= v1.b()) {
                                    ceil2 = v1.b() - 1;
                                }
                                this.s = ceil2;
                            }
                            M();
                            if (this.q1 == 0.0f) {
                                this.r = !this.r;
                            }
                            p1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        igaVarArr[0].h.invalidate();
                        iga igaVar = igaVarArr[0];
                        if (igaVar.G != null) {
                            igaVar.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.a) {
                    this.c = false;
                    this.b = false;
                    this.a = false;
                    M();
                }
                return this.a;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ void A0(int i, TL_stories.StoryItem storyItem) {
        getStoriesController().b(i, this.m1, storyItem);
    }

    public final void A1(a8 a8Var, a8 a8Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (a8Var2.getCheckView().a.q || !a8Var.getCheckView().a.q) {
            a8Var.setChecked(!a8Var.getCheckView().a.q);
            runnable.run();
        } else {
            float f = -this.v1;
            this.v1 = f;
            gm.A3(f, a8Var, null);
        }
    }

    public final void B(boolean z, boolean z2) {
        if (this.I != null) {
            int closestTab = getClosestTab();
            boolean z3 = false;
            boolean z4 = this.q2 && !o0();
            r7 r7Var = this.q0;
            if (r7Var != null) {
                ((zja) r7Var).Y(z4 && q() && (p0(closestTab) || (closestTab == 11 && h0())), z);
            }
            zja zjaVar = this.J;
            if (zjaVar != null) {
                if (z4 && q() && !k0() && f0(closestTab)) {
                    z3 = true;
                }
                zjaVar.Y(z3, z2);
            }
        }
    }

    public final void B0(int i, TL_stories.StoryItem storyItem, String str) {
        v99 v99Var = new v99((Object) this, i, (Object) storyItem, (byte) 5);
        h4b storiesController = getStoriesController();
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.e0(i, this.m1, arrayList);
        c41.b0(this.y1).K(R.raw.chats_archived, gm.S2(jb6.G(1, "StoryRemovedFromAlbumTitle", str)), jb6.M0(2131743572, null), v99Var).j();
    }

    public final void B1() {
        if (this.I == null) {
            try {
                int c0 = c0(cmb.x8);
                int c02 = c0(cmb.y8);
                if (c0 == this.r2 && c02 == this.s2) {
                    return;
                }
                this.r2 = c0;
                this.s2 = c02;
                r7[] r7VarArr = {this.x0, this.w0, this.y0, this.z0, this.o0};
                for (int i = 0; i < 5; i++) {
                    r7 r7Var = r7VarArr[i];
                    if (r7Var != null) {
                        r7Var.setIconColor(c0);
                        if (r7Var.getBackground() != null) {
                            cmb.F1(r7Var.getBackground(), c02, true);
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void C() {
        float abs;
        float measuredWidth;
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[0];
        if (igaVar == null || igaVarArr[1] == null) {
            return;
        }
        float f = 0.0f;
        oea oeaVar = this.c0;
        if (oeaVar != null) {
            char c = (!j0(igaVar.F) || igaVarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c == (igaVarArr[1].getVisibility() == 0 ? (!j0(igaVarArr[1].F) || igaVarArr[1].F == 9) ? (char) 0 : (char) 1 : c)) {
                if (c != 0) {
                    measuredWidth = 0.0f;
                    abs = 1.0f;
                } else {
                    measuredWidth = igaVarArr[0].getMeasuredWidth();
                    abs = 0.0f;
                }
                oeaVar.setTranslationX(measuredWidth);
            } else {
                oeaVar.setTranslationX(igaVarArr[c ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(oeaVar.getTranslationX()) / oeaVar.getMeasuredWidth());
            }
            float f2 = 0.0f;
            for (int i = 0; i < igaVarArr.length; i++) {
                if (igaVarArr[i].getVisibility() == 0) {
                    sea seaVar = igaVarArr[i].h;
                    View childAt = seaVar.getChildCount() == 0 ? null : seaVar.getChildAt(0);
                    f2 += Utilities.l(1.0f - (igaVarArr[i].getTranslationX() / igaVarArr[i].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - seaVar.getPaddingTop() : seaVar.getChildCount() == 0 ? 0.0f : -gm.L(48.0f));
                }
            }
            float l = Utilities.l(1.0f - ((-f2) / gm.N(48.0f)));
            float R1 = gm.R1(0.9f, 1.0f, l);
            oeaVar.setAlpha(l);
            oeaVar.setScaleX(R1);
            oeaVar.setScaleY(R1);
            oeaVar.setTranslationY(this.O1 + f2);
            f = abs;
        }
        qk3 qk3Var = this.S0;
        if (qk3Var != null) {
            qk3Var.setTranslationY(this.O1);
        }
        if (this.Y1 != f) {
            this.Y1 = f;
            invalidate();
        }
    }

    public final /* synthetic */ void C0(TL_stories.StoryItem storyItem) {
        getStoriesController().r0(this.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        c41.b0(this.y1).G(R.raw.chats_archived, 5000, jb6.G(1, "StoryArchived", new Object[0])).j();
    }

    public final void C1() {
        if (n0()) {
            post(new oda(this, (byte) 13));
            return;
        }
        ufa ufaVar = this.K;
        if (ufaVar != null) {
            ufaVar.f();
        }
        aha ahaVar = this.N;
        if (ahaVar != null) {
            ahaVar.f();
        }
        aha ahaVar2 = this.O;
        if (ahaVar2 != null) {
            ahaVar2.f();
        }
        bha bhaVar = this.M;
        if (bhaVar != null) {
            bhaVar.X(false);
        }
        aha ahaVar3 = this.P;
        if (ahaVar3 != null) {
            ahaVar3.f();
        }
        wga wgaVar = this.Q;
        if (wgaVar != null) {
            wgaVar.f();
        }
        dga dgaVar = this.R;
        if (dgaVar != null) {
            dgaVar.f();
        }
        xfa xfaVar = this.f0;
        if (xfaVar != null) {
            xfaVar.f();
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ((mha) it.next()).c.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D() {
        AnimatorSet animatorSet;
        if (!this.j1) {
            return false;
        }
        boolean z = this.l1;
        iga[] igaVarArr = this.n0;
        if (!z) {
            if (Math.abs(igaVarArr[1].getTranslationX()) < 1.0f) {
                igaVarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.k1 ? -1 : 1));
                igaVarArr[1].setTranslationX(0.0f);
                animatorSet = this.i1;
                if (animatorSet != null) {
                }
                this.j1 = false;
            }
            T0(getTabProgress());
            return this.j1;
        }
        if (Math.abs(igaVarArr[0].getTranslationX()) < 1.0f) {
            igaVarArr[0].setTranslationX(0.0f);
            igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth() * (this.k1 ? 1 : -1));
            animatorSet = this.i1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.i1 = null;
            }
            this.j1 = false;
        }
        T0(getTabProgress());
        return this.j1;
    }

    public final /* synthetic */ void D0(int i, long j, ArrayList arrayList) {
        getStoriesController().a(i, j, arrayList);
    }

    public final void D1(iga igaVar, boolean z) {
        boolean z2 = igaVar.b && this.d;
        y49 fastScroll = igaVar.h.getFastScroll();
        ObjectAnimator objectAnimator = igaVar.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            igaVar.c.cancel();
        }
        if (!z) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z2 ? 0 : 8);
            fastScroll.setTag(z2 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (!z2) {
            if (fastScroll.getTag() != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<y49, Float>) property, fastScroll.getAlpha(), 0.0f);
                ofFloat.addListener(new jf4(fastScroll));
                igaVar.c = ofFloat;
                ofFloat.setDuration(150L).start();
                fastScroll.animate().setListener(null).cancel();
                fastScroll.setTag(null);
                return;
            }
            return;
        }
        if (fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<y49, Float>) property, fastScroll.getAlpha(), 1.0f);
            igaVar.c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.setTag(r1);
        }
    }

    public final boolean E(boolean z) {
        SparseArray[] sparseArrayArr;
        if (!this.F1) {
            return false;
        }
        int i = 1;
        while (true) {
            sparseArrayArr = this.c1;
            if (i < 0) {
                break;
            }
            sparseArrayArr[i].clear();
            i--;
        }
        this.d1 = 0;
        J0(sparseArrayArr[0]);
        kea keaVar = this.a0;
        if (keaVar != null) {
            keaVar.h();
            keaVar.j();
        }
        l1(false);
        J1(z);
        yga ygaVar = this.U;
        if (ygaVar != null) {
            ygaVar.x.clear();
        }
        return true;
    }

    public final void E0(int i, long j) {
        v3b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        a4b a4bVar = (a4b) A.h.remove(c);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = oc7.r1(i2).i1(A.b);
        tL_deleteAlbum.album_id = a4bVar.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_deleteAlbum, null);
        A.f(true);
    }

    public final void E1() {
        r7 r7Var = this.w0;
        if (r7Var != null) {
            boolean z = this.y1.getMessagesController().B2(this.m1) || e0();
            r7Var.setAlpha(z ? 0.5f : 1.0f);
            if (z) {
                if (r7Var.getBackground() != null) {
                    r7Var.setBackground(null);
                }
            } else if (r7Var.getBackground() == null) {
                int i = cmb.y8;
                fg0 f0 = cmb.f0(c0(i), 5, -1);
                wmb M = anb.M(i);
                r7Var.setBackground(f0);
                anb.j(r7Var, f0, null, M, this.I1);
            }
        }
    }

    public final r7 F(Context context, int i, int i2, String str) {
        r7 r7Var;
        rja rjaVar = this.I;
        if (rjaVar != null) {
            r7Var = rjaVar.q().a(i, i2);
        } else {
            int i3 = cmb.y8;
            int c0 = c0(i3);
            int i4 = cmb.x8;
            r7 r7Var2 = new r7(context, null, c0, c0(i4), false, null);
            r7Var2.setIcon(i2);
            r7Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(r7Var2, new LinearLayout.LayoutParams(gm.L(54.0f), -1));
            this.Q0.add(r7Var2);
            s09 iconView = r7Var2.getIconView();
            ylb ylbVar = this.I1;
            if (iconView != null) {
                anb.s(r7Var2.getIconView(), i4, ylbVar, PorterDuff.Mode.SRC_IN);
            }
            if (r7Var2.getBackground() != null) {
                Drawable background = r7Var2.getBackground();
                wmb M = anb.M(i3);
                r7Var2.setBackground(background);
                anb.j(r7Var2, background, null, M, ylbVar);
            }
            r7Var = r7Var2;
        }
        r7Var.setContentDescription(str);
        r7Var.setOnClickListener(new hb(this, i, (byte) 7));
        return r7Var;
    }

    public final void F0(int i, String str, long j) {
        v3b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        ((a4b) A.h.get(c)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = oc7.r1(i2).i1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        A.f(true);
    }

    public final void F1() {
        lea leaVar = this.b0;
        if (leaVar != null) {
            int L = gm.L(48.0f) + this.d2;
            qk3 qk3Var = this.S0;
            leaVar.setPaddingTop(L + (qk3Var != null ? (int) qk3Var.c(gm.L(7.0f)) : 0));
        }
    }

    public final void G0(boolean z) {
        long j = this.G;
        if (j != 0 || q0()) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            int i2 = t2[i];
            cha[] chaVarArr = this.w1;
            if (chaVarArr[i2].h && !z) {
                return;
            }
            long j2 = this.m1;
            if (pg3.B(j2)) {
                return;
            }
            chaVarArr[i2].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            byte b = 2;
            if (i2 == 0) {
                byte b2 = chaVarArr[i2].q;
                if (b2 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (b2 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i2 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i2 == 2) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_getSearchResultsPositions.limit = 100;
            d dVar = this.y1;
            tL_messages_getSearchResultsPositions.peer = dVar.getMessagesController().i1(j2);
            if (j != 0 && dVar.getUserConfig().e() == j2) {
                tL_messages_getSearchResultsPositions.flags |= 4;
                tL_messages_getSearchResultsPositions.saved_peer_id = dVar.getMessagesController().i1(j);
            }
            ConnectionsManager.getInstance(dVar.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(dVar.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new hn6(this, chaVarArr[i2].p, i2, b)), dVar.getClassGuid());
        }
    }

    public final void G1(boolean z) {
        lea leaVar;
        oea oeaVar;
        B(true, true);
        s09 s09Var = this.v0;
        if (s09Var == null) {
            return;
        }
        float f = 0.0f;
        if (!this.Y0 && (((leaVar = this.b0) == null || !leaVar.g()) && ((oeaVar = this.c0) == null || !oeaVar.f))) {
            f = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        s09Var.setAlpha(f);
        if (z) {
            j(U(1.0f) > 0.5f);
        } else if (this.A0 == 2) {
            j(this.s0 > 0.1f);
        } else {
            j(this.r0 < 0.1f);
        }
    }

    public boolean H() {
        return this instanceof oe5;
    }

    public final void H0(int i) {
        int i2;
        int i3 = 2;
        cha[] chaVarArr = this.w1;
        if (i == 0) {
            byte b = chaVarArr[0].q;
            if (b == 1) {
                i3 = 6;
            } else if (b == 2) {
                i3 = 7;
            } else {
                i2 = 0;
            }
            i2 = i3;
        } else if (i == 1) {
            i2 = 1;
        } else {
            if (i != 2) {
                i3 = 4;
                if (i != 4) {
                    i3 = 5;
                    if (i != 5) {
                        i3 = 3;
                    }
                }
            }
            i2 = i3;
        }
        chaVarArr[i].g = true;
        d dVar = this.y1;
        dVar.getMediaDataController().P0(this.m1, 50, 0, chaVarArr[i].k, i2, this.G, 1, dVar.getClassGuid(), chaVarArr[i].p, null, null);
    }

    public final void H1(iga igaVar) {
        boolean c1 = igaVar.h.c1();
        if (c1) {
            igaVar.h.setSectionsDrawBackground(this.c2);
        }
        igaVar.setDrawPageBackground((!this.c2 || c1 || igaVar.F == 15) ? false : true);
        if (igaVar.F != 15) {
            igaVar.setClipToOutline(false);
            igaVar.setBackground(null);
            igaVar.setWallpaper(null);
            return;
        }
        Drawable drawable = igaVar.P;
        if (drawable == null) {
            drawable = igaVar.getBackground();
        }
        Drawable d = cl8.d(drawable, this.y1.getCurrentAccount(), this.m1, cmb.I.o());
        if (this.c2) {
            igaVar.setBackground(null);
            igaVar.setClipToOutline(false);
            igaVar.setWallpaper(d);
        } else {
            igaVar.setWallpaper(null);
            igaVar.setBackground(d);
            igaVar.setOutlineProvider(new xj((byte) 18));
            igaVar.setClipToOutline(true);
        }
    }

    public final boolean I(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x = (-view.getX()) - getX();
        iga[] igaVarArr = this.n0;
        motionEvent.offsetLocation(x - igaVarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - igaVarArr[0].getY()) - igaVarArr[0].h.getFastScroll().getY());
        return igaVarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public int I0() {
        return 0;
    }

    public final void I1(iga igaVar) {
        int i = igaVar.F;
        boolean z = i == 0 || j0(i);
        float f = z ? 0.0f : 12.0f;
        float f2 = (z ? 8 : 12) + 48;
        float f3 = z ? 0.0f : 12.0f;
        FrameLayout.LayoutParams d = qoe.d(-1, -1.0f, nm7.D1, f, f2, f3, f3);
        d.topMargin = X(igaVar.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = igaVar.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        igaVar.s.setLayoutParams(d);
    }

    public final boolean J(int i) {
        cha[] chaVarArr = this.x1.n;
        if (chaVarArr == null) {
            return false;
        }
        cha[] chaVarArr2 = this.w1;
        if (i == 0) {
            cha chaVar = chaVarArr2[i];
            if (!chaVar.h) {
                int[] iArr = chaVar.f;
                int[] iArr2 = chaVarArr[i].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = chaVarArr2[i].f;
            int[] iArr4 = chaVarArr[i].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        chaVarArr2[i].a.addAll(chaVarArr[i].a);
        chaVarArr2[i].c.addAll(chaVarArr[i].c);
        for (Map.Entry entry : chaVarArr[i].d.entrySet()) {
            chaVarArr2[i].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            chaVarArr2[i].b[i2] = chaVarArr[i].b[i2].clone();
            cha chaVar2 = chaVarArr2[i];
            int[] iArr5 = chaVar2.j;
            cha chaVar3 = chaVarArr[i];
            iArr5[i2] = chaVar3.j[i2];
            chaVar2.i[i2] = chaVar3.i[i2];
        }
        chaVarArr2[i].e.addAll(chaVarArr[i].e);
        return !chaVarArr[i].a.isEmpty();
    }

    public final void J1(boolean z) {
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                return;
            }
            int childCount = igaVarArr[i].h.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = igaVarArr[i].h.getChildAt(i2);
                if (childAt instanceof ida) {
                    ((ida) childAt).b(false, z);
                } else if (childAt instanceof sha) {
                    ((sha) childAt).i(false, z);
                } else if (childAt instanceof lda) {
                    ((lda) childAt).f(false, z);
                } else if (childAt instanceof eda) {
                    ((eda) childAt).e(false, z);
                } else if (childAt instanceof lx2) {
                    ((lx2) childAt).c(false, z);
                } else if (childAt instanceof hg3) {
                    ((hg3) childAt).d0(false, z);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0393, code lost:
    
        if (r3.l != false) goto L142;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(int i, mga mgaVar) {
        String str;
        mga mgaVar2;
        mga mgaVar3;
        z3b z3bVar;
        TLRPC.Chat L0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        kea keaVar;
        kea keaVar2;
        byte b;
        byte b2;
        a8 a8Var;
        boolean z;
        mga mgaVar4;
        a8 a8Var2;
        a8 a8Var3;
        mha u1;
        boolean j0 = j0(i);
        d dVar = this.y1;
        int currentAccount = dVar.getCurrentAccount();
        oc7 r1 = oc7.r1(currentAccount);
        long j = this.m1;
        TLRPC.User W1 = r1.W1(Long.valueOf(j));
        boolean h = getStoriesController().h(j);
        byte b3 = 3;
        byte b4 = 4;
        final byte b5 = 1;
        if (t0(i) && h && (u1 = u1(i)) != null) {
            int i2 = u1.b;
            mgaVar.c0(R.drawable.menu_add_stories, new sda(this, i2, b5), jb6.M0(2131744487, null), false, true);
            g(mgaVar, dVar, this.m1, i2);
            mgaVar.c0(R.drawable.tabs_reorder, new sda(this, i2, b3), jb6.M0(2131744479, null), false, true);
            mgaVar.c0(R.drawable.msg_delete, new sda(this, i2, b4), jb6.M0(2131744485, null), true, true);
            mgaVar.I();
            h(mgaVar);
            return true;
        }
        byte b6 = 6;
        final byte b7 = 0;
        if (i == 14) {
            lea leaVar = this.b0;
            if (leaVar != null) {
                rs8 currentPage = leaVar.getCurrentPage();
                ava avaVar = currentPage == null ? null : currentPage.e;
                if (avaVar != null) {
                    long j2 = leaVar.c;
                    int i3 = leaVar.b;
                    boolean w = j2 == z8c.h(i3).e() ? true : j2 >= 0 ? false : sd2.w(5, oc7.r1(i3).L0(Long.valueOf(-j2)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (avaVar.c) {
                        b2 = 11;
                        a8Var = null;
                        z = false;
                    } else {
                        b2 = 11;
                        a8Var = mgaVar.c0(R.drawable.menu_sort_value, new e6a(avaVar, runnableArr, b6), jb6.M0(2131750130, null), false, false);
                        z = true;
                    }
                    if (leaVar.b()) {
                        mgaVar.c0(R.drawable.menu_folder_add, new oda(this, b2), jb6.M0(2131750031, null), false, true);
                        z = true;
                    }
                    if (leaVar.e.h()) {
                        if (!avaVar.i().isEmpty() || currentPage.d) {
                            mgaVar.c0(R.drawable.tabs_reorder, new oda(this, (byte) 12), jb6.M0(2131749966, null), false, true);
                            mgaVar4 = mgaVar;
                        } else {
                            mgaVar4 = mgaVar;
                        }
                        z = true;
                    } else {
                        mgaVar4 = mgaVar;
                    }
                    if (z) {
                        mgaVar4.I();
                    }
                    a8 K = mgaVar4.K(jb6.M0(2131750128, null));
                    a8 K2 = mgaVar4.K(jb6.M0(2131750132, null));
                    a8 K3 = mgaVar4.K(jb6.M0(2131750127, null));
                    a8 K4 = mgaVar4.K(jb6.M0(2131750129, null));
                    if (w) {
                        mgaVar4.I();
                        a8Var2 = mgaVar4.K(jb6.M0(2131750134, null));
                        a8Var3 = mgaVar4.K(jb6.M0(2131750133, null));
                    } else {
                        a8Var2 = null;
                        a8Var3 = null;
                    }
                    ava avaVar2 = avaVar;
                    n0a n0aVar = new n0a(a8Var, avaVar2, K, K2, K3, K4, w, a8Var2, a8Var3);
                    a8 a8Var4 = a8Var2;
                    a8 a8Var5 = a8Var3;
                    runnableArr[0] = n0aVar;
                    n0aVar.run();
                    vs8.j(K, avaVar2, runnableArr[0], 1);
                    vs8.j(K2, avaVar2, runnableArr[0], 2);
                    vs8.j(K3, avaVar2, runnableArr[0], 4);
                    vs8.j(K4, avaVar2, runnableArr[0], 8);
                    if (w) {
                        vs8.j(a8Var4, avaVar2, runnableArr[0], 256);
                        vs8.j(a8Var5, avaVar2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i == 13 && W1 != null && W1.bot && W1.bot_has_main_app && W1.bot_can_edit && (keaVar = this.a0) != null) {
            int itemsCount = keaVar.getItemsCount();
            if (itemsCount < dVar.getMessagesController().l4.s2.f()) {
                keaVar2 = keaVar;
                b = 5;
                mgaVar.c0(R.drawable.msg_addbot, new oda(this, (byte) 4), jb6.M0(2131746450, null), false, true);
            } else {
                keaVar2 = keaVar;
                b = 5;
            }
            if (itemsCount > 1 && !keaVar2.d()) {
                mgaVar.c0(R.drawable.tabs_reorder, new oda(this, b), jb6.M0(2131746423, null), false, true);
            }
            if (itemsCount > 0) {
                mgaVar.c0(R.drawable.msg_select, new oda(this, b6), jb6.M0(keaVar2.d() ? 2131746421 : 2131746422, null), false, true);
            }
            if (!TextUtils.isEmpty(keaVar2.getCurrentLang())) {
                mgaVar.c0(R.drawable.msg_delete, new oda(this, (byte) 7), jb6.a0(null, null, 2131746424, s1c.J0(keaVar2.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i == 11) {
                mgaVar.c0(R.drawable.msg_discussion, new oda(this, (byte) 8), jb6.M0(2131745598, null), false, true);
                mgaVar.I();
                mgaVar.c0(R.drawable.msg_home, new oda(this, (byte) 9), jb6.M0(2131754387, null), false, true);
                mgaVar.c0(R.drawable.msg_delete, new oda(this, (byte) 10), jb6.M0(2131751527, null), false, true);
                return true;
            }
            if ((i == 8 || t0(i)) && h) {
                str = null;
                mgaVar2 = mgaVar;
                mgaVar2.c0(R.drawable.menu_album_add, new oda(this, (byte) 2), jb6.M0(2131744496, null), false, true);
                mgaVar2.I();
            } else {
                mgaVar2 = mgaVar;
                str = null;
            }
            h(mgaVar2);
            if (!pg3.B(j) && (W1 == null || !W1.bot)) {
                mgaVar2.c0(R.drawable.msg_calendar2, new sda(this, i, (byte) 2), jb6.M0(2131752595, str), false, true);
                if (this.g1 == null || s0() || (L0 = oc7.r1(currentAccount).L0(Long.valueOf(this.g1.id))) == null || (tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    mgaVar3 = mgaVar;
                } else {
                    mgaVar3 = mgaVar;
                    mgaVar3.c0(R.drawable.msg_archive, new oda(this, (byte) 3), jb6.M0(2131747543, str), false, true);
                }
                cha[] chaVarArr = this.w1;
                if (!j0) {
                    cha chaVar = chaVarArr[0];
                    if (!chaVar.w || !chaVar.v) {
                        boolean[] zArr = chaVar.i;
                        if (zArr[0]) {
                            if (zArr[1]) {
                            }
                        }
                    }
                }
                mgaVar3.I();
                final a8 K5 = mgaVar3.K(jb6.M0(2131748410, str));
                final a8 K6 = mgaVar3.K(jb6.M0(2131748409, str));
                if (j0) {
                    final kha v1 = v1(i);
                    if (v1 != null && (z3bVar = v1.s) != null) {
                        K5.setChecked(z3bVar.n);
                        K6.setChecked(v1.s.o);
                    }
                    final byte b8 = 0;
                    K5.setOnClickListener(new View.OnClickListener(this) { // from class: yda
                        public final /* synthetic */ nha b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b9 = b8;
                            final kha khaVar = v1;
                            final a8 a8Var6 = K6;
                            final a8 a8Var7 = K5;
                            nha nhaVar = this.b;
                            switch (b9) {
                                case 0:
                                    final byte b10 = 1;
                                    nhaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: aea
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            z3b z3bVar2;
                                            z3b z3bVar3;
                                            byte b11 = b10;
                                            a8 a8Var8 = a8Var6;
                                            a8 a8Var9 = a8Var7;
                                            kha khaVar2 = khaVar;
                                            switch (b11) {
                                                case 0:
                                                    if (khaVar2 != null && (z3bVar2 = khaVar2.s) != null) {
                                                        boolean z2 = a8Var9.getCheckView().a.q;
                                                        boolean z3 = a8Var8.getCheckView().a.q;
                                                        z3bVar2.n = z2;
                                                        z3bVar2.o = z3;
                                                        z3bVar2.d(true);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (khaVar2 != null && (z3bVar3 = khaVar2.s) != null) {
                                                        boolean z4 = a8Var9.getCheckView().a.q;
                                                        boolean z5 = a8Var8.getCheckView().a.q;
                                                        z3bVar3.n = z4;
                                                        z3bVar3.o = z5;
                                                        z3bVar3.d(true);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b11 = 0;
                                    nhaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: aea
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            z3b z3bVar2;
                                            z3b z3bVar3;
                                            byte b112 = b11;
                                            a8 a8Var8 = a8Var7;
                                            a8 a8Var9 = a8Var6;
                                            kha khaVar2 = khaVar;
                                            switch (b112) {
                                                case 0:
                                                    if (khaVar2 != null && (z3bVar2 = khaVar2.s) != null) {
                                                        boolean z2 = a8Var9.getCheckView().a.q;
                                                        boolean z3 = a8Var8.getCheckView().a.q;
                                                        z3bVar2.n = z2;
                                                        z3bVar2.o = z3;
                                                        z3bVar2.d(true);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (khaVar2 != null && (z3bVar3 = khaVar2.s) != null) {
                                                        boolean z4 = a8Var9.getCheckView().a.q;
                                                        boolean z5 = a8Var8.getCheckView().a.q;
                                                        z3bVar3.n = z4;
                                                        z3bVar3.o = z5;
                                                        z3bVar3.d(true);
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
                    final byte b9 = 1;
                    K6.setOnClickListener(new View.OnClickListener(this) { // from class: yda
                        public final /* synthetic */ nha b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b92 = b9;
                            final kha khaVar = v1;
                            final a8 a8Var6 = K5;
                            final a8 a8Var7 = K6;
                            nha nhaVar = this.b;
                            switch (b92) {
                                case 0:
                                    final byte b10 = 1;
                                    nhaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: aea
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            z3b z3bVar2;
                                            z3b z3bVar3;
                                            byte b112 = b10;
                                            a8 a8Var8 = a8Var6;
                                            a8 a8Var9 = a8Var7;
                                            kha khaVar2 = khaVar;
                                            switch (b112) {
                                                case 0:
                                                    if (khaVar2 != null && (z3bVar2 = khaVar2.s) != null) {
                                                        boolean z2 = a8Var9.getCheckView().a.q;
                                                        boolean z3 = a8Var8.getCheckView().a.q;
                                                        z3bVar2.n = z2;
                                                        z3bVar2.o = z3;
                                                        z3bVar2.d(true);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (khaVar2 != null && (z3bVar3 = khaVar2.s) != null) {
                                                        boolean z4 = a8Var9.getCheckView().a.q;
                                                        boolean z5 = a8Var8.getCheckView().a.q;
                                                        z3bVar3.n = z4;
                                                        z3bVar3.o = z5;
                                                        z3bVar3.d(true);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b11 = 0;
                                    nhaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: aea
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            z3b z3bVar2;
                                            z3b z3bVar3;
                                            byte b112 = b11;
                                            a8 a8Var8 = a8Var7;
                                            a8 a8Var9 = a8Var6;
                                            kha khaVar2 = khaVar;
                                            switch (b112) {
                                                case 0:
                                                    if (khaVar2 != null && (z3bVar2 = khaVar2.s) != null) {
                                                        boolean z2 = a8Var9.getCheckView().a.q;
                                                        boolean z3 = a8Var8.getCheckView().a.q;
                                                        z3bVar2.n = z2;
                                                        z3bVar2.o = z3;
                                                        z3bVar2.d(true);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (khaVar2 != null && (z3bVar3 = khaVar2.s) != null) {
                                                        boolean z4 = a8Var9.getCheckView().a.q;
                                                        boolean z5 = a8Var8.getCheckView().a.q;
                                                        z3bVar3.n = z4;
                                                        z3bVar3.o = z5;
                                                        z3bVar3.d(true);
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
                byte b10 = chaVarArr[0].q;
                K5.setChecked(b10 == 0 || b10 == 1);
                byte b11 = chaVarArr[0].q;
                K6.setChecked(b11 == 0 || b11 == 2);
                K5.setOnClickListener(new View.OnClickListener(this) { // from class: zda
                    public final /* synthetic */ nha b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b12 = b7;
                        final a8 a8Var6 = K6;
                        final a8 a8Var7 = K5;
                        final nha nhaVar = this.b;
                        switch (b12) {
                            case 0:
                                final byte b13 = 1;
                                nhaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: cea
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b14 = b13;
                                        a8 a8Var8 = a8Var6;
                                        a8 a8Var9 = a8Var7;
                                        nha nhaVar2 = nhaVar;
                                        switch (b14) {
                                            case 0:
                                                nhaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                nhaVar2.x();
                                                break;
                                            default:
                                                nhaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                nhaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b14 = 0;
                                nhaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: cea
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b142 = b14;
                                        a8 a8Var8 = a8Var7;
                                        a8 a8Var9 = a8Var6;
                                        nha nhaVar2 = nhaVar;
                                        switch (b142) {
                                            case 0:
                                                nhaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                nhaVar2.x();
                                                break;
                                            default:
                                                nhaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                nhaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                K6.setOnClickListener(new View.OnClickListener(this) { // from class: zda
                    public final /* synthetic */ nha b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b12 = b5;
                        final a8 a8Var6 = K5;
                        final a8 a8Var7 = K6;
                        final nha nhaVar = this.b;
                        switch (b12) {
                            case 0:
                                final byte b13 = 1;
                                nhaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: cea
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b142 = b13;
                                        a8 a8Var8 = a8Var6;
                                        a8 a8Var9 = a8Var7;
                                        nha nhaVar2 = nhaVar;
                                        switch (b142) {
                                            case 0:
                                                nhaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                nhaVar2.x();
                                                break;
                                            default:
                                                nhaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                nhaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b14 = 0;
                                nhaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: cea
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b142 = b14;
                                        a8 a8Var8 = a8Var7;
                                        a8 a8Var9 = a8Var6;
                                        nha nhaVar2 = nhaVar;
                                        switch (b142) {
                                            case 0:
                                                nhaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                nhaVar2.x();
                                                break;
                                            default:
                                                nhaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                nhaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
            }
        }
        return true;
    }

    public final void K1(float f) {
        r7 r7Var = this.p0;
        if (r7Var == null) {
            return;
        }
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[1];
        float f2 = 0.0f;
        if (igaVar != null && igaVar.F == 11) {
            f2 = 0.0f + f;
        }
        iga igaVar2 = igaVarArr[0];
        if (igaVar2 != null && igaVar2.F == 11) {
            f2 += 1.0f - f;
        }
        r7Var.setAlpha(f2);
        float f3 = (0.15f * f2) + 0.85f;
        r7Var.setScaleX(f3);
        r7Var.setScaleY(f3);
        r7Var.setVisibility(f2 <= 0.01f ? 8 : 0);
    }

    public final void L(int i, r59 r59Var, boolean z) {
        nga ngaVar;
        ArrayList arrayList = this.w1[i].e;
        int K0 = ((u46) r59Var.getLayoutManager()).K0();
        if (K0 >= 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    ngaVar = null;
                    break;
                } else {
                    if (K0 <= ((nga) arrayList.get(i2)).b) {
                        ngaVar = (nga) arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (ngaVar == null) {
                ngaVar = (nga) b10.f(1, arrayList);
            }
            if (ngaVar != null) {
                v0(i, ngaVar.d, ngaVar.b + 1, z);
            }
        }
    }

    public final void L0() {
        z3b z3bVar;
        z3b z3bVar2;
        this.K1.a();
        xfa xfaVar = this.f0;
        if (xfaVar != null && (z3bVar2 = xfaVar.s) != null && z3bVar2 != null) {
            z3bVar2.z(xfaVar.w);
        }
        jea jeaVar = this.h0;
        if (jeaVar != null && (z3bVar = jeaVar.s) != null && z3bVar != null) {
            z3bVar.z(jeaVar.w);
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            lha lhaVar = ((mha) it.next()).c;
            z3b z3bVar3 = lhaVar.s;
            if (z3bVar3 != null && z3bVar3 != null) {
                z3bVar3.z(lhaVar.w);
            }
        }
    }

    public final void L1() {
        r7 r7Var = this.p0;
        if (r7Var == null) {
            return;
        }
        iga igaVar = this.n0[1];
        boolean z = igaVar != null && igaVar.F == 11;
        if (z) {
            r7Var.setVisibility(0);
        }
        r7Var.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.85f).scaleY(z ? 1.0f : 0.85f).withEndAction(new n28((byte) 12, (Object) this, z)).setDuration(420L).setInterpolator(d53.h).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M() {
        iga[] igaVarArr;
        iga igaVar;
        int i;
        y59 adapter;
        if (this.r1) {
            Object[] objArr = 0;
            int i2 = 0;
            while (true) {
                igaVarArr = this.n0;
                if (i2 >= igaVarArr.length) {
                    igaVar = null;
                    break;
                }
                igaVar = igaVarArr[i2];
                if (igaVar.F == this.s1) {
                    break;
                } else {
                    i2++;
                }
            }
            if (igaVar != null) {
                boolean j0 = j0(igaVar.F);
                float f = this.q1;
                cha[] chaVarArr = this.w1;
                if (f != 1.0f) {
                    if (f == 0.0f) {
                        this.r1 = false;
                        if (this.s1 == 0) {
                            chaVarArr[0].g(false);
                        }
                        igaVar.n.setVisibility(8);
                        igaVar.h.invalidate();
                        return;
                    }
                    boolean z = f > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new jfa(this, igaVar, objArr == true ? 1 : 0));
                    ofFloat.addListener(new er1(this, z, j0 ? 1 : 0, igaVar));
                    ofFloat.setInterpolator(d53.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.r1 = false;
                int i3 = this.t1;
                int[] iArr = this.p1;
                iArr[j0 ? 1 : 0] = i3;
                if (!j0) {
                    gda.A(i3);
                } else if (W(igaVar.F) >= 5) {
                    gda.E(this.t1);
                }
                for (int i4 = 0; i4 < igaVarArr.length; i4++) {
                    iga igaVar2 = igaVarArr[i4];
                    if (igaVar2 != null && igaVar2.h != null && (((i = igaVar2.F) == 0 || j0(i)) && (adapter = igaVarArr[i4].h.getAdapter()) != null)) {
                        int b = adapter.b();
                        if (i4 == 0) {
                            chaVarArr[0].g(false);
                        }
                        igaVarArr[i4].n.setVisibility(8);
                        igaVarArr[i4].x.x1(iArr[j0 ? 1 : 0]);
                        igaVarArr[i4].h.b0();
                        igaVarArr[i4].h.invalidate();
                        if (adapter.b() == b) {
                            gm.V3(igaVarArr[i4].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    e1();
                    return;
                }
                for (int i5 = 0; i5 < igaVarArr.length; i5++) {
                    iga igaVar3 = igaVarArr[i5];
                    if (igaVar3.F == this.s1) {
                        View m = igaVar3.r.m(this.s);
                        if (m != null) {
                            this.w = m.getTop();
                        }
                        iga igaVar4 = igaVarArr[i5];
                        igaVar4.x.g1(this.s, (-igaVar4.h.getPaddingTop()) + this.w);
                    }
                }
            }
        }
    }

    public final void M0(int i, View view, k47 k47Var, int i2) {
        String str;
        if (k47Var == null || this.r1) {
            return;
        }
        oea oeaVar = this.c0;
        if (oeaVar == null || !oeaVar.f) {
            int i3 = 0;
            i3 = 0;
            if (this.F1) {
                int i4 = 8;
                if (i2 == 8 && !p()) {
                    return;
                }
                char c = k47.B0(k47Var.k) == this.m1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.c1;
                if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                    sparseArrayArr[c].remove(k47Var.e1());
                    if (!k47Var.s(null, false)) {
                        this.d1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c].put(k47Var.e1(), k47Var);
                    if (!k47Var.s(null, false)) {
                        this.d1++;
                    }
                }
                J0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    l1(false);
                } else {
                    j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.o0.setVisibility(this.d1 == 0 ? 0 : 8);
                    r7 r7Var = this.x0;
                    if (r7Var != null) {
                        r7Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    r7 r7Var2 = this.w0;
                    if (r7Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i4 = 0;
                        }
                        r7Var2.setVisibility(i4);
                    }
                    M1();
                }
                this.e1 = false;
                if (view instanceof ida) {
                    ((ida) view).b(sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0, true);
                } else if (view instanceof tha) {
                    ((tha) view).b(0, sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0, true);
                } else if (view instanceof lda) {
                    ((lda) view).f(sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0, true);
                } else if (view instanceof eda) {
                    ((eda) view).e(sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0, true);
                } else if (view instanceof lx2) {
                    ((lx2) view).c(sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0, true);
                } else if (view instanceof sha) {
                    ((sha) view).i(sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0, true);
                }
            } else {
                uea ueaVar = this.u1;
                cha[] chaVarArr = this.w1;
                d dVar = this.y1;
                if (i2 == 0) {
                    cha chaVar = chaVarArr[i2];
                    int i5 = i - chaVar.m;
                    if (i5 >= 0 && i5 < chaVar.a.size()) {
                        PhotoViewer.r0().T1(null, dVar, null);
                        PhotoViewer.r0().n1(chaVarArr[i2].a, i5, this.m1, this.f1, this.G, ueaVar);
                    }
                } else if (i2 == 2 || i2 == 4) {
                    if (view instanceof eda) {
                        ((eda) view).a();
                    }
                } else if (i2 == 5) {
                    PhotoViewer.r0().T1(null, dVar, null);
                    int indexOf = chaVarArr[i2].a.indexOf(k47Var);
                    if (indexOf < 0) {
                        PhotoViewer.r0().n1(td4.u(k47Var), 0, 0L, 0L, 0L, ueaVar);
                    } else {
                        PhotoViewer.r0().n1(chaVarArr[i2].a, indexOf, this.m1, this.f1, this.G, ueaVar);
                    }
                } else if (i2 == 1) {
                    if (view instanceof ida) {
                        ida idaVar = (ida) view;
                        TLRPC.Document F0 = k47Var.F0();
                        if (idaVar.H) {
                            if (k47Var.x()) {
                                PhotoViewer.r0().T1(null, dVar, null);
                                int indexOf2 = chaVarArr[i2].a.indexOf(k47Var);
                                if (indexOf2 < 0) {
                                    PhotoViewer.r0().n1(td4.u(k47Var), 0, 0L, 0L, 0L, ueaVar);
                                    return;
                                } else {
                                    PhotoViewer.r0().n1(chaVarArr[i2].a, indexOf2, this.m1, this.f1, this.G, ueaVar);
                                    return;
                                }
                            }
                            gm.q2(k47Var, dVar.getParentActivity(), dVar);
                        } else if (idaVar.G) {
                            dVar.getFileLoader().f(F0);
                            idaVar.f(true);
                        } else {
                            k47 message = idaVar.getMessage();
                            message.P = true;
                            dVar.getFileLoader().X(F0, message, 0, 0);
                            idaVar.f(true);
                        }
                    }
                } else if (i2 == 3) {
                    try {
                        TLRPC.WebPage webPage = k47.n1(k47Var.k) != null ? k47.n1(k47Var.k).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k47Var) == null) {
                                    dVar.createArticleViewer(false).L(k47Var, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str2 = webPage.embed_url;
                            if (str2 != null && str2.length() != 0) {
                                zv3.I0(dVar, k47Var, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((lda) view).F;
                            str = arrayList.size() > 0 ? ((CharSequence) arrayList.get(0)).toString() : null;
                        }
                        if (str != null) {
                            Y0(str);
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                } else if (j0(i2)) {
                    kha v1 = v1(i2);
                    z3b z3bVar = v1 != null ? v1.s : null;
                    if (z3bVar == null) {
                        return;
                    }
                    oab orCreateStoryViewer = dVar.getOrCreateStoryViewer();
                    Context context = getContext();
                    int e1 = k47Var.e1();
                    q4b a = q4b.a(this.n0[0].h);
                    a.e = new yf9(z3bVar, (byte) 19);
                    if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) {
                        i3 = gm.L(68.0f);
                    }
                    a.s += i3;
                    orCreateStoryViewer.G(context, e1, z3bVar, a);
                }
            }
            E1();
        }
    }

    public final void M1() {
        boolean z;
        z3b z3bVar;
        boolean l0 = l0();
        r7 r7Var = this.z0;
        r7 r7Var2 = this.y0;
        if (l0) {
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            if (r7Var != null) {
                r7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            if (r7Var != null) {
                r7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (t0(getClosestTab())) {
                if (r7Var2 != null) {
                    r7Var2.setVisibility(8);
                }
                if (r7Var != null) {
                    r7Var.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.c1;
            if (i >= sparseArrayArr[0].size()) {
                z = false;
                break;
            }
            k47 k47Var = (k47) sparseArrayArr[0].valueAt(i);
            xfa xfaVar = this.f0;
            if (xfaVar != null && (z3bVar = xfaVar.s) != null && !z3bVar.m(k47Var.e1())) {
                z = true;
                break;
            }
            i++;
        }
        if (r7Var2 != null) {
            r7Var2.setVisibility(z ? 0 : 8);
        }
        if (r7Var != null) {
            r7Var.setVisibility(z ? 8 : 0);
        }
    }

    public final void N(int i) {
        ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 0) {
            if (gm.O1() || org.telegram.messenger.a.b.getResources().getConfiguration().orientation != 2) {
                this.D0.setTextSize(20);
            } else {
                this.D0.setTextSize(18);
            }
        }
        if (i == 0) {
            this.K.f();
        }
    }

    public final boolean N0(k47 k47Var, View view, int i, boolean z) {
        oea oeaVar;
        final TL_stories.StoryItem storyItem;
        xfa xfaVar;
        z3b z3bVar;
        final byte b = 0;
        if (!this.F1) {
            d dVar = this.y1;
            if (dVar.getParentActivity() != null && k47Var != null && ((oeaVar = this.c0) == null || !oeaVar.f)) {
                gm.t1(dVar.getParentActivity().getCurrentFocus());
                long j = this.m1;
                int i2 = 8;
                final byte b2 = 1;
                if (!z || (!(t0(getClosestTab()) || getClosestTab() == 8) || this.F1)) {
                    char c = k47.B0(k47Var.k) == j ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c].put(k47Var.e1(), k47Var);
                    if (!k47Var.s(null, false)) {
                        this.d1++;
                    }
                    this.o0.setVisibility(this.d1 == 0 ? 0 : 8);
                    r7 r7Var = this.x0;
                    if (r7Var != null) {
                        r7Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    r7 r7Var2 = this.w0;
                    if (r7Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i2 = 0;
                        }
                        r7Var2.setVisibility(i2);
                    }
                    j1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.Q0;
                        if (i3 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i3);
                        gm.y(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i3++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.e1 = false;
                    if (view instanceof ida) {
                        ((ida) view).b(true, true);
                    } else if (view instanceof tha) {
                        ((tha) view).b(i, true, true);
                    } else if (view instanceof lda) {
                        ((lda) view).f(true, true);
                    } else if (view instanceof eda) {
                        ((eda) view).e(true, true);
                    } else if (view instanceof lx2) {
                        ((lx2) view).c(true, true);
                    } else if (view instanceof sha) {
                        ((sha) view).i(true, true);
                    }
                    if (!this.F1) {
                        l1(true);
                    }
                    J0(sparseArrayArr[0]);
                    E1();
                    return true;
                }
                if (view instanceof sha) {
                    sha shaVar = (sha) view;
                    shaVar.k(shaVar.n, shaVar.r, true);
                }
                TL_stories.StoryItem storyItem2 = k47Var.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean t0 = t0(getClosestTab());
                    bu5 J = bu5.J(dVar, view);
                    bu5 K = J.K();
                    K.b(R.drawable.ic_ab_back, jb6.M0(2131753721, null), new bo1(J, b), false);
                    K.j();
                    bu5.e(K, getStoriesController().A(j, true), hashSet, true, new hw9((Object) this, (Object) storyItem2, (Object) J, (byte) 7), new jv0((Object) this, (Object) hashSet, (Object) storyItem2, (Object) J, (byte) 21));
                    J.b(R.drawable.menu_album_add, jb6.M0(2131744494, null), new c20(J, K, (byte) 10), false);
                    J.j();
                    J.b(R.drawable.msg_select, jb6.M0(2131744478, null), new v36((Object) this, (Object) k47Var, (Object) view, i, (byte) 29), false);
                    final byte b3 = 3;
                    if (t0) {
                        int s1 = s1(getClosestTab());
                        String v = getStoriesController().v(s1, j);
                        J.b(R.drawable.tabs_reorder, jb6.M0(2131744479, null), new sda(this, s1, b), false);
                        storyItem = storyItem2;
                        J.b(R.drawable.msg_removefolder, jb6.M0(2131744480, null), new tda((Object) this, s1, (Object) storyItem, (Object) v, (byte) 0), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (xfaVar = this.f0) != null && (z3bVar = xfaVar.s) != null) {
                            if (z3bVar.m(storyItem.id)) {
                                J.b(R.drawable.chats_unpin, jb6.M0(2131744476, null), new Runnable(this) { // from class: rda
                                    public final /* synthetic */ nha b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b2;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        nha nhaVar = this.b;
                                        switch (b4) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nhaVar.I1, nhaVar.getContext());
                                                String M0 = jb6.M0(2131751424, null);
                                                he heVar = alertDialog$Builder.a;
                                                heVar.S = M0;
                                                heVar.U = jb6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.j(jb6.M0(2131751535, null), new bea(nhaVar, storyItem3));
                                                alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 15));
                                                heVar.show();
                                                heVar.h();
                                                break;
                                            case 1:
                                                nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                nhaVar.C0(storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final byte b4 = 2;
                                J.b(R.drawable.chats_pin, jb6.M0(2131744481, null), new Runnable(this) { // from class: rda
                                    public final /* synthetic */ nha b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b4;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        nha nhaVar = this.b;
                                        switch (b42) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nhaVar.I1, nhaVar.getContext());
                                                String M0 = jb6.M0(2131751424, null);
                                                he heVar = alertDialog$Builder.a;
                                                heVar.S = M0;
                                                heVar.U = jb6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.j(jb6.M0(2131751535, null), new bea(nhaVar, storyItem3));
                                                alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 15));
                                                heVar.show();
                                                heVar.h();
                                                break;
                                            case 1:
                                                nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                nhaVar.C0(storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        J.b(R.drawable.msg_archive, jb6.M0(2131744486, null), new Runnable(this) { // from class: rda
                            public final /* synthetic */ nha b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b42 = b3;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                nha nhaVar = this.b;
                                switch (b42) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nhaVar.I1, nhaVar.getContext());
                                        String M0 = jb6.M0(2131751424, null);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.S = M0;
                                        heVar.U = jb6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.j(jb6.M0(2131751535, null), new bea(nhaVar, storyItem3));
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 15));
                                        heVar.show();
                                        heVar.h();
                                        break;
                                    case 1:
                                        nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        nhaVar.C0(storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    J.b(R.drawable.msg_delete, jb6.M0(2131751535, null), new Runnable(this) { // from class: rda
                        public final /* synthetic */ nha b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b42 = b;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            nha nhaVar = this.b;
                            switch (b42) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nhaVar.I1, nhaVar.getContext());
                                    String M0 = jb6.M0(2131751424, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M0;
                                    heVar.U = jb6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.j(jb6.M0(2131751535, null), new bea(nhaVar, storyItem3));
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 15));
                                    heVar.show();
                                    heVar.h();
                                    break;
                                case 1:
                                    nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    nhaVar.C0(storyItem3);
                                    break;
                            }
                        }
                    }, true);
                    J.i = (byte) 3;
                    J.u = true;
                    J.v = true;
                    J.L = true;
                    J.M = (byte) 3;
                    Point point = gm.q;
                    int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                    J.N = min;
                    J.O = (min << 2) / 3;
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

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ee, code lost:
    
        if ((r9[8] <= 0) == r8.d(15)) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0205, code lost:
    
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0202, code lost:
    
        r6 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0200, code lost:
    
        if ((r9[4] <= 0) == r8.d(4)) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N1(boolean z) {
        int i;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i2;
        boolean s0;
        boolean z2;
        boolean z3;
        boolean z4;
        int selectedTab;
        int[] iArr;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        SparseArray sparseArray;
        Integer num;
        int i3;
        boolean z8;
        int i4;
        int size;
        int i5;
        SparseArray sparseArray2;
        Boolean bool;
        String M0;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        lea leaVar;
        char c;
        int i6;
        int i7;
        Object obj;
        boolean z9;
        int i8;
        int i9;
        boolean z10;
        int i10;
        int i11;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        fha fhaVar;
        kfa kfaVar = this.L0;
        if (kfaVar == null) {
            return;
        }
        boolean z11 = !this.G1.t() ? false : z;
        boolean z12 = (this.W == null || (fhaVar = this.x1) == null || !fhaVar.f) ? false : true;
        long j = this.m1;
        int i12 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        d dVar = this.y1;
        if (i12 <= 0 || dVar == null) {
            i = 1;
            user = null;
        } else {
            i = 1;
            user = dVar.getMessagesController().W1(Long.valueOf(j));
        }
        boolean z13 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i : false;
        int i13 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.h1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z13) ? 0 : i;
        int i14 = ((pg3.D(j) || pg3.y(j)) && !pg3.B(j) && (((userFull = this.h1) != null && userFull.stories_pinned_available) || (((chatFull = this.g1) != null && chatFull.stories_pinned_available) || s0())) && i0()) ? i : 0;
        lea leaVar2 = this.b0;
        int i15 = i13;
        boolean z14 = (leaVar2 == null || (((userFull3 = this.h1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.g1) == null || chatFull3.stargifts_count <= 0))) ? false : i;
        int i16 = i14;
        TLRPC.ChatFull chatFull4 = this.g1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.h1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z15 = z11;
                int i17 = this.U1 == kfaVar.o0 ? i : 0;
                boolean z16 = (i16 == 0 || i15 != 0) ? i : false;
                int i18 = i17;
                i2 = z16 == kfaVar.d(8) ? i18 + 1 : i18;
                if (z13 != kfaVar.d(13)) {
                    i2++;
                }
                if (q0() != kfaVar.d(8)) {
                    i2++;
                }
                if (z14 == kfaVar.d(14) || (leaVar2 != null && z14 && this.T1 != leaVar2.getLastEmojisHash())) {
                    i2++;
                }
                s0 = s0();
                int i19 = 14;
                aga agaVar = this.d0;
                int[] iArr2 = this.a1;
                if (s0) {
                    z2 = z14;
                    int i20 = i2;
                    int i21 = (agaVar.d == null ? i : false) == kfaVar.d(7) ? i20 + 1 : i20;
                    if (iArr2[0] <= 0) {
                        z9 = i;
                        i8 = 0;
                    } else {
                        z9 = false;
                        i8 = 0;
                    }
                    int i22 = i21;
                    int i23 = z9 == kfaVar.d(i8) ? i22 + 1 : i22;
                    if (iArr2[i] <= 0) {
                        z10 = i;
                        i9 = z10;
                    } else {
                        i9 = i;
                        z10 = false;
                    }
                    int i24 = i23;
                    int i25 = z10 == kfaVar.d(i9) ? i24 + 1 : i24;
                    if (pg3.B(j)) {
                        i10 = i25;
                    } else {
                        int i26 = i25;
                        int i27 = (iArr2[3] <= 0) == kfaVar.d(3) ? i26 + 1 : i26;
                        i10 = (iArr2[4] <= 0) == kfaVar.d(4) ? i27 + 1 : i27;
                    }
                    int i28 = i11;
                    int i29 = (iArr2[2] <= 0) == kfaVar.d(2) ? i28 + 1 : i28;
                    int i30 = (iArr2[5] <= 0) == kfaVar.d(5) ? i29 + 1 : i29;
                    int i31 = (iArr2[6] <= 0) == kfaVar.d(6) ? i30 + 1 : i30;
                    boolean z17 = !this.T.d.isEmpty();
                    int i32 = i31;
                    i2 = z17 != kfaVar.d(10) ? i32 + 1 : i32;
                    z3 = h0() && !dVar.getMessagesController().E1().b && dVar.getMessagesController().E1().e();
                    z4 = z17;
                    if (z3 != kfaVar.d(11)) {
                        i2++;
                    }
                    if (z12 != kfaVar.d(12)) {
                        i2++;
                    }
                } else {
                    z2 = z14;
                    z3 = false;
                    z4 = false;
                }
                if (i2 > 0) {
                    if (z15) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        iArr = iArr2;
                        transitionSet.addTransition(new h7((byte) 3));
                        z5 = z12;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(kfaVar.getTabsContainer(), transitionSet);
                        kfaVar.V = kfaVar.w;
                        kfaVar.W = kfaVar.x;
                    } else {
                        iArr = iArr2;
                        z5 = z12;
                    }
                    SparseArray f = kfaVar.f();
                    if (i2 > 3) {
                        f = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (q0()) {
                        z6 = z13;
                        z7 = z3;
                        str = null;
                        arrayList.add(new Pair(8, jb6.M0(2131746368, null)));
                        kfaVar.c0 = (short) 420;
                    } else {
                        z6 = z13;
                        z7 = z3;
                        str = null;
                    }
                    if (i15 != 0) {
                        arrayList.add(new Pair(8, jb6.M0(2131746425, str)));
                    } else if ((pg3.D(j) || pg3.y(j)) && !pg3.B(j) && ((((userFull2 = this.h1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.g1) != null && chatFull2.stories_pinned_available) || s0())) && i0())) {
                        if (k0()) {
                            arrayList.add(new Pair(9, jb6.M0(2131746460, null)));
                            kfaVar.c0 = (short) 420;
                        } else {
                            arrayList.add(new Pair(8, jb6.M0(2131746368, null)));
                            if (s0()) {
                                arrayList.add(new Pair(9, jb6.M0(2131746460, null)));
                            }
                        }
                    }
                    if (z2) {
                        String M02 = jb6.M0(2131746409, null);
                        HashMap hashMap = vs8.V;
                        ava avaVar = leaVar2.d;
                        Object obj2 = "";
                        if (avaVar == null) {
                            leaVar = leaVar2;
                            sparseArray = f;
                            num = 4;
                            str6 = M02;
                            i3 = i12;
                        } else {
                            ArrayList arrayList2 = avaVar.l;
                            str6 = M02;
                            i3 = i12;
                            sparseArray = f;
                            num = 4;
                            Pair pair = new Pair(Integer.valueOf(z8c.t0), Long.valueOf(leaVar2.c));
                            if (arrayList2.isEmpty()) {
                                if (avaVar.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
                                    obj2 = obj;
                                }
                                leaVar = leaVar2;
                            } else {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                int i33 = 0;
                                while (true) {
                                    leaVar = leaVar2;
                                    if (arrayList3.size() >= 3 || i33 >= arrayList2.size()) {
                                        break;
                                    }
                                    TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList2.get(i33)).gift.getDocument();
                                    boolean z18 = z5;
                                    if (document != null && !hashSet.contains(Long.valueOf(document.id))) {
                                        hashSet.add(Long.valueOf(document.id));
                                        arrayList3.add(document);
                                    }
                                    i33++;
                                    leaVar2 = leaVar;
                                    z5 = z18;
                                }
                                z8 = z5;
                                if (!arrayList3.isEmpty()) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                    int i34 = 0;
                                    while (i34 < arrayList3.size()) {
                                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i34);
                                        String str7 = "😀";
                                        if (document2 == null) {
                                            i7 = i34;
                                        } else {
                                            i7 = i34;
                                            TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) gm.V(TLRPC.TL_documentAttributeCustomEmoji.class, document2.attributes);
                                            if (tL_documentAttributeCustomEmoji == null || TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt)) {
                                                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = (TLRPC.TL_documentAttributeSticker) gm.V(TLRPC.TL_documentAttributeSticker.class, document2.attributes);
                                                if (tL_documentAttributeSticker != null && !TextUtils.isEmpty(tL_documentAttributeSticker.alt)) {
                                                    str7 = tL_documentAttributeSticker.alt;
                                                }
                                            } else {
                                                str7 = tL_documentAttributeCustomEmoji.alt;
                                            }
                                        }
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                                        spannableStringBuilder2.setSpan(new gn(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                        i34 = i7 + 1;
                                    }
                                    c = 0;
                                    hashMap.put(pair, spannableStringBuilder);
                                    obj2 = spannableStringBuilder;
                                    i6 = 2;
                                    CharSequence[] charSequenceArr = new CharSequence[i6];
                                    charSequenceArr[c] = str6;
                                    charSequenceArr[1] = obj2;
                                    arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                    this.T1 = leaVar.getLastEmojisHash();
                                }
                                i6 = 2;
                                c = 0;
                                CharSequence[] charSequenceArr2 = new CharSequence[i6];
                                charSequenceArr2[c] = str6;
                                charSequenceArr2[1] = obj2;
                                arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                                this.T1 = leaVar.getLastEmojisHash();
                            }
                        }
                        z8 = z5;
                        i6 = 2;
                        c = 0;
                        CharSequence[] charSequenceArr22 = new CharSequence[i6];
                        charSequenceArr22[c] = str6;
                        charSequenceArr22[1] = obj2;
                        arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr22)));
                        this.T1 = leaVar.getLastEmojisHash();
                    } else {
                        sparseArray = f;
                        num = 4;
                        i3 = i12;
                        z8 = z5;
                    }
                    if (z6) {
                        arrayList.add(new Pair(13, jb6.M0(2131746425, null)));
                    }
                    int i35 = 2131745147;
                    if (!s0()) {
                        if (z7) {
                            str3 = null;
                            arrayList.add(new Pair(11, jb6.M0(2131745641, null)));
                        } else {
                            str3 = null;
                        }
                        if (agaVar.d != null) {
                            arrayList.add(new Pair(7, jb6.M0(2131749186, str3)));
                        }
                        if (iArr[0] > 0) {
                            if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && agaVar.d == null) {
                                arrayList.add(new Pair(0, jb6.M0(2131745140, null)));
                            } else {
                                str4 = null;
                                arrayList.add(new Pair(0, jb6.M0(2131745141, null)));
                                if (z8) {
                                    arrayList.add(new Pair(12, jb6.M0(2131745627, str4)));
                                    oc7.d1().edit().putInt("savedhint", 3).apply();
                                }
                                if (iArr[1] <= 0) {
                                    str5 = null;
                                    arrayList.add(new Pair(1, jb6.M0(2131745148, null)));
                                } else {
                                    str5 = null;
                                }
                                if (pg3.B(j)) {
                                    if (iArr[3] > 0) {
                                        arrayList.add(new Pair(3, jb6.M0(2131745144, str5)));
                                    }
                                    if (iArr[4] > 0) {
                                        arrayList.add(new Pair(num, jb6.M0(2131745139, str5)));
                                    }
                                    if (iArr[8] > 0) {
                                        arrayList.add(new Pair(15, jb6.M0(2131745137, str5)));
                                    }
                                } else {
                                    Integer num2 = num;
                                    if (iArr[4] > 0) {
                                        arrayList.add(new Pair(num2, jb6.M0(2131745139, str5)));
                                    }
                                }
                                if (iArr[2] > 0) {
                                    arrayList.add(new Pair(2, jb6.M0(2131745136, str5)));
                                }
                                if (iArr[5] > 0) {
                                    arrayList.add(new Pair(5, jb6.M0(2131745147, str5)));
                                }
                                if (iArr[6] > 0) {
                                    arrayList.add(new Pair(6, jb6.M0(2131745146, str5)));
                                }
                                if (z4) {
                                    arrayList.add(new Pair(10, jb6.M0(i3 > 0 ? 2131745052 : 2131745048, null)));
                                }
                            }
                        }
                        str4 = null;
                        if (z8) {
                        }
                        if (iArr[1] <= 0) {
                        }
                        if (pg3.B(j)) {
                        }
                        if (iArr[2] > 0) {
                        }
                        if (iArr[5] > 0) {
                        }
                        if (iArr[6] > 0) {
                        }
                        if (z4) {
                        }
                    }
                    if (kfaVar.o0) {
                        boolean m0 = m0();
                        int i36 = 0;
                        while (i36 < 15) {
                            if (Y(i36, m0) != null) {
                                Integer valueOf = Integer.valueOf(i36);
                                int i37 = 0;
                                while (true) {
                                    if (i37 >= arrayList.size()) {
                                        bool = Boolean.FALSE;
                                        break;
                                    } else {
                                        if (((Pair) arrayList.get(i37)).first == valueOf) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        i37++;
                                    }
                                }
                                if (!bool.booleanValue()) {
                                    Integer valueOf2 = Integer.valueOf(i36);
                                    if (i36 == 0) {
                                        M0 = jb6.M0(2131745140, null);
                                    } else if (i36 == 1) {
                                        M0 = jb6.M0(2131745148, null);
                                    } else if (i36 == 2) {
                                        M0 = jb6.M0(2131745136, null);
                                    } else if (i36 == 3) {
                                        M0 = jb6.M0(2131745144, null);
                                    } else if (i36 == 4) {
                                        M0 = jb6.M0(2131745139, null);
                                    } else if (i36 == 5) {
                                        M0 = jb6.M0(i35, null);
                                    } else if (i36 == 8) {
                                        M0 = jb6.M0(2131746368, null);
                                    } else if (i36 != i19) {
                                        str2 = null;
                                        arrayList.add(new Pair(valueOf2, str2));
                                    } else {
                                        M0 = jb6.M0(2131746409, null);
                                    }
                                    str2 = M0;
                                    arrayList.add(new Pair(valueOf2, str2));
                                }
                            }
                            i36++;
                            i35 = 2131745147;
                            i19 = 14;
                        }
                    }
                    if (profileTab != null) {
                        int Z = Z(profileTab);
                        int i38 = 0;
                        while (true) {
                            if (i38 >= arrayList.size()) {
                                i38 = -1;
                                break;
                            } else if (((Integer) ((Pair) arrayList.get(i38)).first).intValue() == Z) {
                                break;
                            } else {
                                i38++;
                            }
                        }
                        if (i38 >= 0) {
                            i4 = 0;
                            arrayList.add(0, (Pair) arrayList.remove(i38));
                            if (!arrayList.isEmpty()) {
                                this.V1 = ((Integer) ((Pair) arrayList.get(i4)).first).intValue();
                            }
                            size = arrayList.size();
                            i5 = 0;
                            while (i5 < size) {
                                Object obj3 = arrayList.get(i5);
                                i5++;
                                Pair pair2 = (Pair) obj3;
                                if (kfaVar.d(((Integer) pair2.first).intValue())) {
                                    sparseArray2 = sparseArray;
                                } else {
                                    sparseArray2 = sparseArray;
                                    kfaVar.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, sparseArray2);
                                }
                                sparseArray = sparseArray2;
                            }
                        }
                    }
                    i4 = 0;
                    if (!arrayList.isEmpty()) {
                    }
                    size = arrayList.size();
                    i5 = 0;
                    while (i5 < size) {
                    }
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                    this.n0[0].F = selectedTab;
                }
                this.U1 = kfaVar.o0;
                kfaVar.c();
                S0();
                C();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z152 = z11;
        if (this.U1 == kfaVar.o0) {
        }
        if (i16 == 0) {
        }
        int i182 = i17;
        if (z16 == kfaVar.d(8)) {
        }
        if (z13 != kfaVar.d(13)) {
        }
        if (q0() != kfaVar.d(8)) {
        }
        if (z14 == kfaVar.d(14)) {
        }
        i2++;
        s0 = s0();
        int i192 = 14;
        aga agaVar2 = this.d0;
        int[] iArr22 = this.a1;
        if (s0) {
        }
        if (i2 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.U1 = kfaVar.o0;
        kfaVar.c();
        S0();
        C();
    }

    public final String O(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        kea keaVar;
        if (!l0()) {
            return jb6.M0(2131752970, null);
        }
        if (z && (keaVar = this.a0) != null) {
            return keaVar.getBotPreviewsSubtitle();
        }
        xfa xfaVar = this.f0;
        if (xfaVar == null || xfaVar.s == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < xfaVar.s.i.size(); i3++) {
                k47 k47Var = (k47) xfaVar.s.i.get(i3);
                TL_stories.StoryItem storyItem = k47Var.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (k47.J4(messageMedia.document)) {
                        i2++;
                    } else if (k47Var.l.media.photo != null) {
                        i++;
                    }
                }
            }
        }
        if (i == 0 && i2 == 0) {
            return jb6.M0(2131752970, null);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(jb6.G(i, "Images", new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(jb6.G(i2, "Videos", new Object[0]));
        }
        return sb.toString();
    }

    public boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return false;
    }

    public final Boolean O1(View view, View view2) {
        if (this.r1) {
            return null;
        }
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[0];
        if (igaVar == null) {
            return null;
        }
        int i = igaVar.F;
        this.s1 = i;
        boolean j0 = j0(i);
        int[] iArr = this.p1;
        int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], true);
        if (view != null && R == R(j0 ? 1 : 0, R, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[j0 ? 1 : 0] != R) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!j0) {
                gda.A(R);
            } else if (W(igaVarArr[0].F) >= 5 || t0(igaVarArr[0].F)) {
                gda.E(R);
            }
            l(R);
        }
        return Boolean.valueOf(R != R(j0 ? 1 : 0, R, true));
    }

    public final iga P(int i) {
        int i2 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 >= igaVarArr.length) {
                return null;
            }
            iga igaVar = igaVarArr[i2];
            if (igaVar != null && igaVar.F == i) {
                return igaVar;
            }
            i2++;
        }
    }

    public final void P0(float f) {
        iga[] igaVarArr = this.n0;
        if (f != 1.0f || igaVarArr[1].getVisibility() == 0) {
            if (this.k1) {
                igaVarArr[0].setTranslationX((-f) * r3.getMeasuredWidth());
                igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth() - (igaVarArr[0].getMeasuredWidth() * f));
            } else {
                igaVarArr[0].setTranslationX(r3.getMeasuredWidth() * f);
                igaVarArr[1].setTranslationX((igaVarArr[0].getMeasuredWidth() * f) - igaVarArr[0].getMeasuredWidth());
            }
            T0(getTabProgress());
            float U = U(f);
            this.s0 = U;
            this.u0.setVisibility((U == 0.0f || !q() || k0()) ? 4 : 0);
            r7 r7Var = this.q0;
            if (r7Var == null || q()) {
                this.r0 = V(f);
                L1();
            } else {
                setSearchItemVisibility(s0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            G1(false);
            if (f == 1.0f) {
                iga igaVar = igaVarArr[0];
                igaVarArr[0] = igaVarArr[1];
                igaVarArr[1] = igaVar;
                igaVar.setVisibility(8);
                if (r7Var != null && this.A0 == 2) {
                    setSearchItemVisibility(s0() ? 8 : 4);
                }
                this.A0 = (byte) 0;
                q1();
            }
        }
    }

    public final Boolean P1(View view, View view2) {
        if (this.r1) {
            return null;
        }
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[0];
        if (igaVar == null) {
            return null;
        }
        if (this.n1 && j0(igaVar.F)) {
            return null;
        }
        int i = igaVarArr[0].F;
        this.s1 = i;
        boolean j0 = j0(i);
        int[] iArr = this.p1;
        int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], false);
        if (view2 != null && R == R(j0 ? 1 : 0, R, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[j0 ? 1 : 0] != R) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!j0) {
                gda.A(R);
            } else if (W(igaVarArr[0].F) >= 5 || t0(igaVarArr[0].F)) {
                gda.E(R);
            }
            l(R);
        }
        return Boolean.valueOf(R != R(j0 ? 1 : 0, R, false));
    }

    public final int R(int i, int i2, boolean z) {
        int i3 = i2 + (!z ? 1 : -1);
        if (i3 > 6) {
            i3 = !z ? 9 : 6;
        }
        return Utilities.j(i3, 9, (this.n1 && i == 1) ? 1 : 2);
    }

    public final int S(boolean z) {
        return this.b2 + this.f2 + (z ? gm.L(52.0f) : 0);
    }

    public void S0() {
        boolean z = s0() || k0();
        iha ihaVar = this.h0.x;
        if (ihaVar != null) {
            ihaVar.b(z && getClosestTab() == 9);
        }
        iha ihaVar2 = this.f0.x;
        if (ihaVar2 != null) {
            ihaVar2.b(z && getClosestTab() == 8);
        }
        for (mha mhaVar : this.m2.values()) {
            lha lhaVar = mhaVar.c;
            if (lhaVar.s != null) {
                lhaVar.x.b(z && getClosestTab() == mhaVar.a);
            }
        }
        r7 r7Var = this.q0;
        if (r7Var != null) {
            hfa hfaVar = this.M0;
            r7Var.setSearchFieldHint(jb6.M0((hfaVar != null && hfaVar.a() && getSelectedTab() == 11) ? 2131745602 : 2131745570, null));
        }
        C();
        B(true, true);
    }

    public final int T(int i) {
        return X(i) + gm.L(54.0f) + this.d2 + this.e2 + this.p2 + (i == 9 ? gm.L(64.0f) : 0);
    }

    public void T0(float f) {
        K0();
    }

    public final float U(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[1];
        if (igaVar != null && f0(igaVar.F)) {
            f2 = 0.0f + f;
        }
        iga igaVar2 = igaVarArr[0];
        return (igaVar2 == null || !f0(igaVar2.F)) ? f2 : (1.0f - f) + f2;
    }

    public final void U0(int i, long j, d dVar) {
        new s0a(dVar, j, this.p1[1], new js7(this, j, i, (byte) 1)).show();
    }

    public final float V(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[1];
        if (igaVar != null && p0(igaVar.F) && igaVarArr[1].F != 11) {
            f2 = 0.0f + f;
        }
        iga igaVar2 = igaVarArr[0];
        return (igaVar2 == null || !p0(igaVar2.F) || igaVarArr[0].F == 11) ? f2 : (1.0f - f) + f2;
    }

    public final void V0(int i, long j, d dVar) {
        ik.s0(dVar, jb6.M0(2131751535, null), gm.S2(jb6.a0(null, null, 2131744484, getStoriesController().v(i, j))), jb6.M0(2131751535, null), true, new gc2((Object) this, j, i, (byte) 5));
    }

    public final int W(int i) {
        kha v1;
        z3b z3bVar;
        if (!j0(i) || (v1 = v1(i)) == null || (z3bVar = v1.s) == null) {
            return 0;
        }
        return z3bVar.g();
    }

    public final void W0(int i, long j, d dVar) {
        String v = getStoriesController().v(i, j);
        Context context = dVar.getContext();
        ylb resourceProvider = dVar.getResourceProvider();
        hg hgVar = new hg((Object) this, j, i, (byte) 6);
        Pattern pattern = ik.a;
        ik.O(context, dVar, jb6.M0(2131744471, null), jb6.M0(2131744470, null), jb6.M0(2131744469, null), v, 12, jb6.M0(2131746011, null), resourceProvider, hgVar);
    }

    public final int X(int i) {
        oea oeaVar = this.c0;
        return (int) ((oeaVar == null || !(t0(i) || i == 8)) ? 0.0f : oeaVar.getVisibilityFactor() * gm.L(40.0f));
    }

    public final void X0(int i, boolean z) {
        iga[] igaVarArr = this.n0;
        if (igaVarArr[0].F == i) {
            return;
        }
        iga igaVar = igaVarArr[1];
        igaVar.F = i;
        igaVar.setVisibility(0);
        g0();
        z1(true);
        this.k1 = z;
        S0();
        j(!p0(i));
        G1(true);
    }

    public final void Y0(String str) {
        boolean D3 = gm.D3(str);
        d dVar = this.y1;
        if (D3) {
            ik.n0(dVar, str, true, true);
        } else {
            l11.u(dVar.getParentActivity(), str);
        }
    }

    public int Z0() {
        return -1;
    }

    public final float a0(int i, boolean z) {
        float width = getWidth();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 >= igaVarArr.length) {
                break;
            }
            iga igaVar = igaVarArr[i2];
            if (igaVar != null) {
                int i4 = igaVar.F;
                if ((z && i == 8 && t0(i4)) || i4 == i) {
                    i3++;
                    width = igaVarArr[i2].getTranslationX();
                }
            }
            i2++;
        }
        if (i3 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void a1(ArrayList arrayList, boolean z) {
        xfa xfaVar = this.f0;
        if (xfaVar == null || xfaVar.s == null) {
            return;
        }
        d dVar = this.y1;
        if (z && arrayList.size() > dVar.getMessagesController().l4.p2.f()) {
            b10.u(jb6.G(dVar.getMessagesController().l4.p2.f(), "StoriesPinLimit", new Object[0]), c41.b0(dVar), R.raw.chats_infotip, 36);
            return;
        }
        z3b z3bVar = xfaVar.s;
        int i = z3bVar.c;
        ArrayList arrayList2 = z3bVar.g;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        boolean z2 = true;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            num.getClass();
            if (z) {
                if (!arrayList3.contains(num)) {
                    arrayList3.add(0, num);
                }
            } else if (arrayList3.contains(num)) {
                arrayList3.remove(num);
            }
        }
        boolean z3 = arrayList3.size() > oc7.r1(i).l4.p2.f();
        if (!z3) {
            boolean z4 = arrayList2.size() != arrayList3.size();
            if (!z4) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i2) != arrayList3.get(i2)) {
                        z4 = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z4) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                z3bVar.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = oc7.r1(i).i1(z3bVar.d);
                ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new nf2((byte) 10));
            }
            z2 = z3;
        }
        if (z2) {
            b10.u(jb6.G(dVar.getMessagesController().l4.p2.f(), "StoriesPinLimit", new Object[0]), c41.b0(dVar), R.raw.chats_infotip, 36);
        } else if (z) {
            c41.b0(dVar).I(R.raw.ic_pin, gm.S2(jb6.G(arrayList.size(), "StoriesPinned", new Object[0])), jb6.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            b10.u(jb6.G(arrayList.size(), "StoriesUnpinned", new Object[0]), c41.b0(dVar), R.raw.ic_unpin, 36);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Bi));
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.zi));
        hashSet.add(Integer.valueOf(cmb.Ai));
        hashSet.add(Integer.valueOf(cmb.J6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.rj));
        hashSet.add(Integer.valueOf(cmb.yi));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.ki));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.w7));
        hashSet.add(Integer.valueOf(cmb.s7));
        hashSet.add(Integer.valueOf(cmb.v7));
        hashSet.add(Integer.valueOf(cmb.ae));
        hashSet.add(Integer.valueOf(cmb.md));
    }

    public final float b0(int i, boolean z) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 >= igaVarArr.length) {
                return f;
            }
            iga igaVar = igaVarArr[i2];
            if (igaVar != null) {
                int i3 = igaVar.F;
                if ((z && i == 8 && t0(i3)) || i3 == i) {
                    f = (1.0f - Math.abs(igaVarArr[i2].getTranslationX() / getWidth())) + f;
                }
            }
            i2++;
        }
    }

    public final boolean b1(MotionEvent motionEvent, boolean z) {
        iga igaVar;
        kea keaVar;
        int closestTab = getClosestTab();
        kfa kfaVar = this.L0;
        int i = -1;
        int i2 = kfaVar.P.get(kfaVar.n + (z ? 1 : -1), -1);
        oea oeaVar = this.c0;
        if (oeaVar != null) {
            if (t0(closestTab) || closestTab == 8) {
                vgc vgcVar = oeaVar.b;
                i = vgcVar.c0.get(vgcVar.G + (z ? 1 : -1), -1);
            } else if (t0(i2) || i2 == 8) {
                i = oeaVar.getCurrentAlbumId();
            }
            if (i == 0) {
                i2 = 8;
            } else if (i > 0) {
                i2 = t1(i).a;
            }
        }
        if (i2 >= 0) {
            if (this.q0 == null || q()) {
                this.r0 = V(0.0f);
                K1(0.0f);
            } else {
                setSearchItemVisibility(s0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!p() || !this.F1 || (getClosestTab() != 8 && !t0(getClosestTab())))) {
                iga[] igaVarArr = this.n0;
                iga igaVar2 = igaVarArr[0];
                if (igaVar2 != null && igaVar2.F == 13 && (keaVar = this.a0) != null) {
                    ur0 ur0Var = keaVar.n;
                    if (!z) {
                    }
                }
                iga igaVar3 = igaVarArr[0];
                lea leaVar = this.b0;
                if (igaVar3 != null && igaVar3.F == 14 && leaVar != null) {
                    ur0 ur0Var2 = leaVar.h;
                    if (!z) {
                    }
                }
                if ((!this.F1 || (igaVar = igaVarArr[0]) == null || igaVar.F != 13) && ((leaVar == null || !leaVar.g()) && (oeaVar == null || !oeaVar.f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    g0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    kfaVar.setEnabled(false);
                    iga igaVar4 = igaVarArr[1];
                    igaVar4.F = i2;
                    igaVar4.setVisibility(0);
                    this.k1 = z;
                    z1(true);
                    if (z) {
                        igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth());
                    } else {
                        igaVarArr[1].setTranslationX(-igaVarArr[0].getMeasuredWidth());
                    }
                    T0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int c0(int i) {
        ylb ylbVar = this.I1;
        return ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false);
    }

    public final boolean d0() {
        return this.y1.getConnectionsManager().getConnectionState() == 3;
    }

    public final void d1(y59 y59Var) {
        if (y59Var instanceof hha) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (y59Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        wga wgaVar = this.Q;
        if (y59Var == wgaVar) {
            wgaVar.r = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0375 A[EDGE_INSN: B:244:0x0375->B:245:0x0375 BREAK  A[LOOP:5: B:231:0x034d->B:243:0x0370], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0377  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v31 */
    @Override // jm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        sea seaVar;
        k47 k47Var;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        int size;
        int i6;
        boolean z3;
        ufa ufaVar;
        sea seaVar2;
        int i7;
        int i8;
        sea seaVar3;
        int i9 = nm7.V;
        q59 q59Var = this.R;
        q59 q59Var2 = this.P;
        bha bhaVar = this.M;
        q59 q59Var3 = this.O;
        q59 q59Var4 = this.N;
        d dVar = this.y1;
        wga wgaVar = this.Q;
        ufa ufaVar2 = this.K;
        long j = this.m1;
        iga[] igaVarArr = this.n0;
        cha[] chaVarArr = this.w1;
        if (i == i9) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != dVar.getClassGuid() || intValue2 != chaVarArr[intValue3].p) {
                if (this.x1 == null || !chaVarArr[intValue3].a.isEmpty() || chaVarArr[intValue3].o || !J(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    q59Var = ufaVar2;
                } else if (intValue3 == 1) {
                    q59Var = q59Var4;
                } else if (intValue3 == 2) {
                    q59Var = q59Var3;
                } else if (intValue3 == 3) {
                    q59Var = bhaVar;
                } else if (intValue3 == 4) {
                    q59Var = q59Var2;
                } else if (intValue3 != 5) {
                    q59Var = intValue3 == 15 ? wgaVar : null;
                }
                if (q59Var != null) {
                    for (int i10 = 0; i10 < igaVarArr.length; i10++) {
                        iga igaVar = igaVarArr[i10];
                        if (igaVar != null && (seaVar2 = igaVar.h) != null && seaVar2.getAdapter() == q59Var) {
                            igaVarArr[i10].h.D0();
                        }
                    }
                    q59Var.f();
                }
                this.e1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean B = pg3.B(j);
            int i11 = longValue == j ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                chaVarArr[intValue3].f[i11] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i7 = intValue3;
                q59Var = ufaVar2;
            } else if (intValue3 == 1) {
                i7 = intValue3;
                q59Var = q59Var4;
            } else if (intValue3 == 2) {
                i7 = intValue3;
                q59Var = q59Var3;
            } else if (intValue3 == 3) {
                i7 = intValue3;
                q59Var = bhaVar;
            } else if (intValue3 == 4) {
                i7 = intValue3;
                q59Var = q59Var2;
            } else if (intValue3 == 5) {
                i7 = intValue3;
            } else if (intValue3 == 15) {
                q59Var = wgaVar;
                i7 = 8;
            } else {
                i7 = intValue3;
                q59Var = null;
            }
            int size2 = chaVarArr[i7].a.size();
            if (q59Var != null) {
                i8 = q59Var.b();
                if (q59Var instanceof m59) {
                    ((m59) q59Var).L();
                }
            } else {
                i8 = 0;
            }
            chaVarArr[i7].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    k47 k47Var2 = (k47) arrayList.get(size3);
                    if (chaVarArr[i7].a(k47Var2, i11, r13, B)) {
                        sparseBooleanArray.put(k47Var2.e1(), r13);
                        cha chaVar = chaVarArr[i7];
                        int i12 = chaVar.m - r13;
                        chaVar.m = i12;
                        if (i12 < 0) {
                            chaVar.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                chaVarArr[i7].l = ((Boolean) objArr[5]).booleanValue();
                cha chaVar2 = chaVarArr[i7];
                if (chaVar2.l) {
                    chaVar2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    k47 k47Var3 = (k47) arrayList.get(i13);
                    if (chaVarArr[i7].a(k47Var3, i11, r12, B)) {
                        sparseBooleanArray.put(k47Var3.e1(), true);
                        cha chaVar3 = chaVarArr[i7];
                        int i14 = chaVar3.n - 1;
                        chaVar3.n = i14;
                        if (i14 < 0) {
                            chaVar3.n = r12;
                        }
                    }
                    i13++;
                    r12 = 0;
                }
                cha chaVar4 = chaVarArr[i7];
                if (chaVar4.o && chaVar4.a.size() > 0) {
                    cha chaVar5 = chaVarArr[i7];
                    chaVar5.k = ((k47) chaVar5.a.get(0)).e1();
                }
                chaVarArr[i7].i[i11] = ((Boolean) objArr[5]).booleanValue();
                cha chaVar6 = chaVarArr[i7];
                if (chaVar6.i[i11]) {
                    int size4 = chaVar6.b[i11].size();
                    if (i11 == 0) {
                        size4 += chaVarArr[i7].m;
                    }
                    chaVarArr[i7].f[i11] = size4;
                }
            }
            if (!booleanValue && i11 == 0) {
                cha chaVar7 = chaVarArr[i7];
                if (chaVar7.i[i11] && this.f1 != 0) {
                    chaVar7.g = true;
                    dVar.getMediaDataController().P0(this.f1, 50, chaVarArr[i7].j[1], 0, i7, this.G, 1, dVar.getClassGuid(), chaVarArr[i7].p, null, null);
                }
            }
            int i15 = i7;
            if (q59Var != null) {
                sea seaVar4 = null;
                for (int i16 = 0; i16 < igaVarArr.length; i16++) {
                    iga igaVar2 = igaVarArr[i16];
                    if (igaVar2 != null && (seaVar3 = igaVar2.h) != null && seaVar3.getAdapter() == q59Var) {
                        sea seaVar5 = igaVarArr[i16].h;
                        seaVar5.D0();
                        seaVar4 = seaVar5;
                    }
                }
                int b = q59Var.b();
                if (q59Var != ufaVar2) {
                    try {
                        q59Var.f();
                    } catch (Throwable unused) {
                    }
                } else if (ufaVar2.b() == i8) {
                    gm.V3(seaVar4);
                } else {
                    ufaVar2.f();
                }
                if (!chaVarArr[i15].a.isEmpty() || chaVarArr[i15].g) {
                    if (seaVar4 != null && (q59Var == ufaVar2 || b >= i8)) {
                        i(seaVar4, i8, sparseBooleanArray);
                    }
                } else if (seaVar4 != null) {
                    i(seaVar4, i8, sparseBooleanArray);
                }
                if (seaVar4 != null && !chaVarArr[i15].o) {
                    if (size2 == 0) {
                        for (int i17 = 0; i17 < 2; i17++) {
                            if (igaVarArr[i17].F == 0) {
                                ((u46) seaVar4.getLayoutManager()).g1(ufaVar2.L(0), 0);
                            }
                        }
                    } else {
                        e1();
                    }
                }
            }
            cha chaVar8 = chaVarArr[i15];
            if (chaVar8.o) {
                if (chaVar8.a.size() == 0) {
                    H0(i15);
                } else {
                    chaVarArr[i15].o = false;
                }
            }
            this.e1 = true;
            return;
        }
        if (i == nm7.v) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat L0 = pg3.y(j) ? dVar.getMessagesController().L0(Long.valueOf(-j)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (sd2.T(L0)) {
                if (longValue2 == 0 && this.f1 != 0) {
                    i5 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i18 = -1;
                    i6 = 0;
                    z3 = false;
                    while (true) {
                        ufaVar = ufaVar2;
                        if (i6 < size) {
                            break;
                        }
                        int i19 = 0;
                        while (i19 < chaVarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (chaVarArr[i19].b(((Integer) arrayList2.get(i6)).intValue(), i5) != null) {
                                i18 = i19;
                                z3 = true;
                            }
                            i19++;
                            arrayList2 = arrayList3;
                        }
                        i6++;
                        ufaVar2 = ufaVar;
                    }
                    if (z3) {
                        this.e1 = true;
                        if (ufaVar != null) {
                            ufaVar.f();
                        }
                        if (q59Var4 != null) {
                            q59Var4.f();
                        }
                        if (q59Var3 != null) {
                            q59Var3.f();
                        }
                        if (bhaVar != null) {
                            bhaVar.X(false);
                        }
                        if (q59Var2 != null) {
                            q59Var2.f();
                        }
                        if (wgaVar != null) {
                            wgaVar.f();
                        }
                        if (q59Var != null) {
                            q59Var.f();
                        }
                        if (i18 == 0 || i18 == 1 || i18 == 2 || i18 == 4) {
                            G0(true);
                        }
                    }
                    P(i18);
                    return;
                }
                if (longValue2 != L0.id) {
                    return;
                }
            } else if (longValue2 != 0) {
                return;
            }
            i5 = 0;
            ArrayList arrayList22 = (ArrayList) objArr[0];
            size = arrayList22.size();
            int i182 = -1;
            i6 = 0;
            z3 = false;
            while (true) {
                ufaVar = ufaVar2;
                if (i6 < size) {
                }
                i6++;
                ufaVar2 = ufaVar;
            }
            if (z3) {
            }
            P(i182);
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != j) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[1];
            boolean B2 = pg3.B(j);
            int i20 = 0;
            boolean z4 = false;
            while (i20 < arrayList4.size()) {
                k47 k47Var4 = (k47) arrayList4.get(i20);
                ArrayList arrayList5 = arrayList4;
                if (k47.n1(k47Var4.k) == null || k47Var4.l5()) {
                    i4 = i20;
                } else {
                    int h0 = hs6.h0(k47Var4.k);
                    i4 = i20;
                    if (h0 == -1) {
                        return;
                    }
                    cha chaVar9 = chaVarArr[h0];
                    if (chaVar9.l) {
                        z = z4;
                        if (chaVar9.a(k47Var4, k47.B0(k47Var4.k) == j ? 0 : 1, true, B2)) {
                            this.a1[h0] = 1;
                            z2 = true;
                            i20 = i4 + 1;
                            z4 = z2;
                            arrayList4 = arrayList5;
                        }
                        z2 = z;
                        i20 = i4 + 1;
                        z4 = z2;
                        arrayList4 = arrayList5;
                    }
                }
                z = z4;
                z2 = z;
                i20 = i4 + 1;
                z4 = z2;
                arrayList4 = arrayList5;
            }
            boolean z5 = z4;
            boolean z6 = true;
            if (z5) {
                this.e1 = true;
                int i21 = 0;
                while (i21 < igaVarArr.length) {
                    int i22 = igaVarArr[i21].F;
                    q59 q59Var5 = i22 == 0 ? ufaVar2 : i22 == z6 ? q59Var4 : i22 == 2 ? q59Var3 : i22 == 3 ? bhaVar : i22 == 4 ? q59Var2 : i22 == 5 ? q59Var : i22 == 15 ? wgaVar : null;
                    if (q59Var5 != null) {
                        q59Var5.b();
                        ufaVar2.f();
                        q59Var4.f();
                        q59Var3.f();
                        bhaVar.X(false);
                        q59Var2.f();
                        wgaVar.f();
                        q59Var.f();
                    }
                    i21++;
                    z6 = true;
                }
                N1(z6);
                return;
            }
            return;
        }
        if (i == nm7.J) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            if (l.longValue() == j || l.longValue() == this.f1) {
                int i23 = l.longValue() == j ? 0 : 1;
                for (cha chaVar10 : chaVarArr) {
                    chaVar10.f(i23, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i24 = nm7.h2;
        int i25 = nm7.f2;
        int i26 = nm7.g2;
        if (i == i24 || i == i26 || i == i25) {
            if (i != i25 && i != i26) {
                if (((k47) objArr[0]).T == 0) {
                    for (int i27 = 0; i27 < igaVarArr.length; i27++) {
                        int childCount = igaVarArr[i27].h.getChildCount();
                        for (int i28 = 0; i28 < childCount; i28++) {
                            View childAt = igaVarArr[i27].h.getChildAt(i28);
                            if (childAt instanceof eda) {
                                eda edaVar = (eda) childAt;
                                if (edaVar.getMessage() != null) {
                                    edaVar.g(false, true);
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            for (int i29 = 0; i29 < igaVarArr.length; i29++) {
                iga igaVar3 = igaVarArr[i29];
                if (igaVar3 != null && (seaVar = igaVar3.h) != null) {
                    int childCount2 = seaVar.getChildCount();
                    for (int i30 = 0; i30 < childCount2; i30++) {
                        View childAt2 = igaVarArr[i29].h.getChildAt(i30);
                        if (childAt2 instanceof eda) {
                            eda edaVar2 = (eda) childAt2;
                            if (edaVar2.getMessage() != null) {
                                edaVar2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i == nm7.B5) {
            z3b z3bVar = (z3b) objArr[0];
            xfa xfaVar = this.f0;
            if (xfaVar == null || z3bVar != xfaVar.s) {
                jea jeaVar = this.h0;
                if (jeaVar == null || z3bVar != jeaVar.s) {
                    Iterator it = this.m2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        mha mhaVar = (mha) it.next();
                        if (mhaVar.c.s == z3bVar) {
                            i3 = mhaVar.a;
                            break;
                        }
                    }
                } else {
                    i3 = 9;
                }
            } else {
                i3 = 8;
            }
            iga P = P(i3);
            if (P != null) {
                if (P.b != (z3bVar.g() > 0)) {
                    P.b = z3bVar.g() > 0;
                    D1(P, true);
                }
            }
            if (P != null) {
                gm.p2(P.h);
                if (P.h.getLayoutManager() instanceof u46) {
                    r59 r59Var = P.h;
                    z(P, r59Var, (u46) r59Var.getLayoutManager());
                }
            }
            cga cgaVar = this.G1;
            if (cgaVar != null) {
                cgaVar.W();
                return;
            }
            return;
        }
        if (i == nm7.z5) {
            for (iga igaVar4 : igaVarArr) {
                if (igaVar4 != null && igaVar4.h != null && j0(igaVar4.F)) {
                    if (!l0() || igaVar4.h.getAdapter() == null) {
                        for (int i31 = 0; i31 < igaVar4.h.getChildCount(); i31++) {
                            View childAt3 = igaVar4.h.getChildAt(i31);
                            if (childAt3 instanceof sha) {
                                sha shaVar = (sha) childAt3;
                                ho hoVar = shaVar.O;
                                if (!shaVar.e0 || (k47Var = shaVar.n) == null || (storyItem = k47Var.l) == null || (storyViews = storyItem.views) == null) {
                                    shaVar.M = false;
                                    hoVar.t("", false, true);
                                } else {
                                    int i32 = storyViews.views_count;
                                    shaVar.M = i32 > 0;
                                    hoVar.t(gm.o0(i32, 0), true, true);
                                }
                            }
                        }
                    } else {
                        gm.p2(igaVar4.h);
                    }
                }
            }
            return;
        }
        if (i == nm7.h3) {
            if (((Long) objArr[0]).longValue() == j) {
                this.T.E(true);
                N1(true);
                y();
                return;
            }
            return;
        }
        int i33 = nm7.i3;
        yga ygaVar = this.U;
        if (i == i33) {
            if (j == 0 || j == dVar.getUserConfig().e()) {
                ygaVar.F(true);
                N1(true);
                y();
                S0();
                return;
            }
            return;
        }
        if (i == nm7.r) {
            ygaVar.F(true);
            return;
        }
        if (i == nm7.I3) {
            if (((Long) objArr[0]).longValue() == j) {
                N1(true);
                return;
            }
            return;
        }
        if (i == nm7.Z3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j == (-longValue3)) {
                String str = (String) objArr[2];
                aga agaVar = this.d0;
                if (agaVar != null) {
                    TLRPC.ChatFull chatFull = agaVar.d;
                    if (chatFull != null && chatFull.participants != null) {
                        for (int i34 = 0; i34 < agaVar.d.participants.participants.size(); i34++) {
                            agaVar.d.participants.participants.get(i34).setRank(longValue4, str);
                        }
                    }
                    for (iga igaVar5 : igaVarArr) {
                        if (igaVar5.F == 7) {
                            gm.V3(igaVar5.h);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.f1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i35 = 0; i35 < igaVarArr.length; i35++) {
                if (igaVarArr[i35].h.getAdapter() == wgaVar) {
                    sea seaVar6 = igaVarArr[i35].h;
                    ArrayList arrayList6 = wgaVar.n;
                    for (int i36 = 0; i36 < arrayList6.size(); i36++) {
                        k47 k47Var5 = (k47) arrayList6.get(i36);
                        if (k47Var5 != null && k47Var5.D1() == longValue5) {
                            TLRPC.MessageMedia messageMedia = k47Var5.k.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                k47.c6(tL_messageMediaPoll, pollResults);
                                wgaVar.g(i36);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kfa kfaVar = this.L0;
        if (kfaVar != null) {
            canvas.save();
            canvas.translate(kfaVar.getX(), kfaVar.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        gfa gfaVar = this.U0;
        if (gfaVar != null) {
            int i = gfaVar.U;
            if ((i == 3 || i == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(gfaVar.getX(), gfaVar.getY());
                gfaVar.setDrawOverlay(true);
                gfaVar.draw(canvas);
                gfaVar.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (this.c2 && (view instanceof iga) && this.g2 < this.e2) {
            canvas.save();
            canvas.clipRect(0, -this.g2, getWidth(), getHeight() + this.f2);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        if (view != this.U0 || this.S0 != null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        iga[] igaVarArr = this.n0;
        float top = igaVarArr[0].getTop();
        oea oeaVar = this.c0;
        if (oeaVar != null && ((i = igaVarArr[0].F) == 8 || t0(i))) {
            top -= oeaVar.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + gm.L(12.0f));
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    public final void e(View view) {
        iga[] igaVarArr = this.n0;
        addView(view, Math.max(indexOfChild(igaVarArr[0]), indexOfChild(igaVarArr[1])) + 1, qoe.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean e0() {
        SparseArray[] sparseArrayArr;
        k47 k47Var;
        TLRPC.Message message;
        boolean z = false;
        for (int i = 1; i >= 0; i--) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                sparseArrayArr = this.c1;
                if (i2 >= sparseArrayArr[i].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i].keyAt(i2)));
                i2++;
            }
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (k47Var = (k47) sparseArrayArr[i].get(num.intValue())) != null && (message = k47Var.k) != null && message.noforwards) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return z;
            }
        }
        return z;
    }

    public final void e1() {
        int i;
        int i2 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 >= igaVarArr.length) {
                return;
            }
            sea seaVar = igaVarArr[i2].h;
            if (seaVar != null) {
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < seaVar.getChildCount(); i5++) {
                    View childAt = seaVar.getChildAt(i5);
                    if (childAt instanceof sha) {
                        sha shaVar = (sha) childAt;
                        int messageId = shaVar.getMessageId();
                        i4 = shaVar.getTop();
                        i3 = messageId;
                    }
                    if (childAt instanceof ida) {
                        ida idaVar = (ida) childAt;
                        int e1 = idaVar.getMessage().e1();
                        i4 = idaVar.getTop();
                        i3 = e1;
                    }
                    if (childAt instanceof eda) {
                        eda edaVar = (eda) childAt;
                        i3 = edaVar.getMessage().e1();
                        i4 = edaVar.getTop();
                    }
                    if (i3 != 0) {
                        break;
                    }
                }
                if (i3 != 0) {
                    int i6 = igaVarArr[i2].F;
                    int i7 = -1;
                    if (j0(i6)) {
                        kha v1 = v1(i6);
                        if (v1 != null && v1.s != null) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= v1.s.i.size()) {
                                    break;
                                }
                                if (i3 == ((k47) v1.s.i.get(i8)).e1()) {
                                    i7 = i8;
                                    break;
                                }
                                i8++;
                            }
                        }
                        i = i7;
                    } else if (i6 >= 0) {
                        cha[] chaVarArr = this.w1;
                        if (i6 < chaVarArr.length) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= chaVarArr[i6].a.size()) {
                                    break;
                                }
                                if (i3 == ((k47) chaVarArr[i6].a.get(i9)).e1()) {
                                    i7 = i9;
                                    break;
                                }
                                i9++;
                            }
                            i = chaVarArr[i6].m + i7;
                        }
                    }
                    if (i7 >= 0) {
                        ((u46) seaVar.getLayoutManager()).g1(i, (-igaVarArr[i2].h.getPaddingTop()) + i4);
                        if (this.r1) {
                            iga igaVar = igaVarArr[i2];
                            igaVar.r.g1(i, (-igaVar.h.getPaddingTop()) + i4);
                        }
                    }
                }
            }
            i2++;
        }
    }

    public final SpannableStringBuilder f() {
        if (this.a2 == null) {
            this.a2 = new SpannableStringBuilder();
            boolean l0 = l0();
            SpannableStringBuilder spannableStringBuilder = this.a2;
            if (l0) {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131746435, null));
            } else {
                spannableStringBuilder.append((CharSequence) "c");
                this.a2.setSpan(new pn2(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) jb6.M0(2131744498, null));
            }
        }
        return this.a2;
    }

    public final boolean f0(int i) {
        if (i == 0) {
            return true;
        }
        if (((i == 8 || t0(i)) && TextUtils.isEmpty(getStoriesHashtag())) || i == 9 || i == 11 || i == 13) {
            return true;
        }
        return i == 14 && this.b0 != null;
    }

    public final void f1(int i) {
        kfa kfaVar;
        if (this.P1 || (kfaVar = this.L0) == null) {
            return;
        }
        kfaVar.g(null, i, kfaVar.Q.get(i));
    }

    public final void g(mga mgaVar, d dVar, long j, int i) {
        String p = j > 0 ? m9c.p(oc7.r1(dVar.getCurrentAccount()).W1(Long.valueOf(j))) : sd2.K(oc7.r1(dVar.getCurrentAccount()).L0(Long.valueOf(-j)), false);
        if (p == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        kt6.v(sb, oc7.r1(dVar.getCurrentAccount()).N2, "/", p, "/a/");
        sb.append(i);
        mgaVar.c0(R.drawable.media_share, new hw9((Object) this, (Object) sb.toString(), (Object) dVar, (byte) 8), jb6.M0(2131744477, null), false, true);
    }

    public final void g0() {
        gm.r(this.P0);
        cm1 cm1Var = this.N0;
        if (cm1Var.getTag() == null) {
            return;
        }
        cm1Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(cm1Var, (Property<cm1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(cm1Var, (Property<cm1, Float>) View.TRANSLATION_Y, (-gm.L(48.0f)) + this.R0));
        this.O0.setInterpolator(d53.g);
        this.O0.addListener(new nfa(this, (byte) 0));
        this.O0.start();
    }

    public final void g1(float f, int i) {
        kfa kfaVar = this.L0;
        if (kfaVar != null) {
            kfaVar.i(f, t0(i) ? 8 : i);
        }
        oea oeaVar = this.c0;
        if (oeaVar != null) {
            vgc vgcVar = oeaVar.b;
            if (t0(i)) {
                vgcVar.g(f, s1(i));
            } else if (i == 8) {
                vgcVar.g(f, 0);
            }
        }
    }

    public SparseArray<k47> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        iga igaVar;
        iga igaVar2;
        z3b z3bVar;
        z3b z3bVar2;
        float f = 1.0f;
        iga[] igaVarArr = this.n0;
        if (igaVarArr != null && (igaVar = igaVarArr[0]) != null && (igaVar2 = igaVarArr[1]) != null && igaVar.w != null && igaVar2.w != null) {
            int i = igaVar.F;
            int i2 = igaVar2.F;
            boolean z = t0(i) || i == 8;
            boolean z2 = t0(i2) || i2 == 8;
            if (z || z2) {
                float visibilityFactor = 1.0f - igaVarArr[0].w.getVisibilityFactor();
                float visibilityFactor2 = 1.0f - igaVarArr[1].w.getVisibilityFactor();
                kha v1 = v1(igaVarArr[0].F);
                if (i == 8 || (v1 != null && (z3bVar2 = v1.s) != null && z3bVar2.g() > 0)) {
                    visibilityFactor = 1.0f;
                }
                kha v12 = v1(i2);
                if (i2 != 8 && (v12 == null || (z3bVar = v12.s) == null || z3bVar.g() <= 0)) {
                    f = visibilityFactor2;
                }
                if (!z) {
                    visibilityFactor = f;
                }
                if (!z2) {
                    f = visibilityFactor;
                }
                return gm.R1(visibilityFactor, f, Math.abs(igaVarArr[0].getTranslationX() / igaVarArr[0].getMeasuredWidth()));
            }
        }
        return 1.0f;
    }

    public int getClosestTab() {
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[1];
        if (igaVar != null && igaVar.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return igaVarArr[1].F;
            }
            if (Math.abs(igaVarArr[1].getTranslationX()) < igaVarArr[1].getMeasuredWidth() / 2.0f) {
                return igaVarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public r59 getCurrentListView() {
        vfa vfaVar;
        iga igaVar = this.n0[0];
        int i = igaVar.F;
        return i == 13 ? this.a0.getCurrentListView() : i == 14 ? this.b0.getCurrentListView() : (i != 12 || (vfaVar = this.W) == null) ? igaVar.h : vfaVar.a.A0;
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

    public r7 getSearchItem() {
        return this.q0;
    }

    public s09 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        oea oeaVar = this.c0;
        if (oeaVar != null && currentTabId == 8) {
            int currentAlbumId = oeaVar.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return t1(currentAlbumId).a;
            }
        }
        return currentTabId;
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
        float f = 0.0f;
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                return f;
            }
            iga igaVar = igaVarArr[i];
            if (igaVar != null) {
                f = ((1.0f - Math.abs(igaVar.getTranslationX() / getWidth())) * igaVar.F) + f;
            }
            i++;
        }
    }

    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.y6));
        int i = cmb.y8;
        arrayList.add(new cnb(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        r7 r7Var = this.x0;
        if (r7Var != null) {
            arrayList.add(new cnb(r7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        r7 r7Var2 = this.w0;
        if (r7Var2 != null) {
            arrayList.add(new cnb(r7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        Drawable[] drawableArr = {this.G0};
        int i2 = cmb.x8;
        ImageView imageView = this.F0;
        arrayList.add(new cnb(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (bnb) null, i2));
        arrayList.add(new cnb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (bnb) null, cmb.wi));
        kfa kfaVar = this.L0;
        arrayList.add(new cnb(kfaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.vi));
        arrayList.add(new cnb(kfaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ui));
        arrayList.add(new cnb(kfaVar.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.xi));
        gfa gfaVar = this.U0;
        if (gfaVar != null) {
            arrayList.add(new cnb(gfaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.u7));
            arrayList.add(new cnb(gfaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (bnb) null, cmb.t7));
            arrayList.add(new cnb(gfaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.x7));
            arrayList.add(new cnb(gfaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (bnb) null, cmb.z7));
        }
        final int i3 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i3 >= igaVarArr.length) {
                return arrayList;
            }
            bnb bnbVar = new bnb() { // from class: eea
                @Override // bnb
                public final void b() {
                    iga[] igaVarArr2 = nha.this.n0;
                    int i4 = i3;
                    sea seaVar = igaVarArr2[i4].h;
                    if (seaVar != null) {
                        int childCount = seaVar.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = igaVarArr2[i4].h.getChildAt(i5);
                            if (childAt instanceof tha) {
                                tha thaVar = (tha) childAt;
                                for (int i6 = 0; i6 < 6; i6++) {
                                    thaVar.a[i6].e.invalidate();
                                }
                            } else if (childAt instanceof ut8) {
                                ((ut8) childAt).y(0);
                            } else if (childAt instanceof w8c) {
                                ((w8c) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // bnb
                public final void a(float f) {
                }
            };
            arrayList.add(new cnb(igaVarArr[i3].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h6));
            arrayList.add(new cnb(igaVarArr[i3].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
            int i4 = cmb.g6;
            arrayList.add(new cnb(igaVarArr[i3].h, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, i4));
            arrayList.add(new cnb(igaVarArr[i3].h, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, bnbVar, cmb.m6));
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.N7));
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.O7));
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.P7));
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Q7));
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.R7));
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.S7));
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.T7));
            int i5 = cmb.h7;
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_13, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i5));
            int i6 = cmb.j7;
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_14, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i6));
            arrayList.add(new cnb(igaVarArr[i3].h, 8, new Class[]{ida.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (bnb) null, cmb.pj));
            arrayList.add(new cnb(igaVarArr[i3].h, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, i4));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_13, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i5));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_14, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i6));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_13, new Class[]{lda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i5));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_14, new Class[]{lda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i6));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_13, new Class[]{tha.class}, (Paint) null, (Drawable[]) null, bnbVar, i5));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_14, new Class[]{tha.class}, (Paint) null, (Drawable[]) null, bnbVar, i6));
            arrayList.add(new cnb(igaVarArr[i3].h, 0, new Class[]{lx2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (bnb) null, cmb.Bi));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_13, new Class[]{lx2.class}, (Paint) null, (Drawable[]) null, bnbVar, i5));
            arrayList.add(new cnb(igaVarArr[i3].h, TLObject.FLAG_14, new Class[]{lx2.class}, (Paint) null, (Drawable[]) null, bnbVar, i6));
            arrayList.add(new cnb(igaVarArr[i3].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (bnb) null, cmb.a7));
            arrayList.add(new cnb(igaVarArr[i3].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
            arrayList.add(new cnb(igaVarArr[i3].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.x6));
            i3++;
        }
    }

    public int getTopPanelShift() {
        return this.p2;
    }

    public final void h(mga mgaVar) {
        final View[] viewArr = new View[2];
        final byte b = 0;
        viewArr[0] = mgaVar.c0(R.drawable.msg_zoomin, new Runnable(this) { // from class: dea
            public final /* synthetic */ nha b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                View[] viewArr2 = viewArr;
                nha nhaVar = this.b;
                switch (b2) {
                    case 0:
                        nhaVar.O1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        nhaVar.P1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, jb6.M0(2131748407, null), false, false);
        final byte b2 = 1;
        viewArr[1] = mgaVar.c0(R.drawable.msg_zoomout, new Runnable(this) { // from class: dea
            public final /* synthetic */ nha b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                View[] viewArr2 = viewArr;
                nha nhaVar = this.b;
                switch (b22) {
                    case 0:
                        nhaVar.O1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        nhaVar.P1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, jb6.M0(2131748406, null), false, false);
        View view = viewArr[0];
        if (view != null) {
            view.setEnabled(s());
            viewArr[0].setAlpha(s() ? 1.0f : 0.5f);
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            view2.setEnabled(t());
            viewArr[1].setAlpha(t() ? 1.0f : 0.5f);
        }
    }

    public boolean h0() {
        return false;
    }

    public final void h1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                if (this.G == 0) {
                    aga agaVar = this.d0;
                    agaVar.d = chatFull;
                    agaVar.e = arrayList;
                }
                N1(true);
                for (int i2 = 0; i2 < igaVarArr.length; i2++) {
                    iga igaVar = igaVarArr[i2];
                    if (igaVar.F == 7 && igaVar.h.getAdapter() != null) {
                        gm.p2(igaVarArr[i2].h);
                    }
                }
                return;
            }
            iga igaVar2 = igaVarArr[i];
            if (igaVar2.F == 7 && igaVar2.h.getAdapter() != null && igaVarArr[i].h.getAdapter().b() != 0 && this.y1.getMessagesController().N1().j.size() > 0) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i(sea seaVar, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = seaVar.getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = seaVar.getChildAt(i2);
            if (childAt instanceof tk4) {
                view = childAt;
            }
        }
        if (view != null) {
            seaVar.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new pfa(this, seaVar, sparseBooleanArray, (tk4) view, i));
    }

    public boolean i0() {
        return !(this instanceof oe5);
    }

    public final void i1(int i, int i2, int i3, int i4) {
        byte b = 1;
        this.c2 = true;
        this.d2 = i;
        this.e2 = i2;
        this.f2 = i3;
        this.b2 = i4;
        n();
        lea leaVar = this.b0;
        if (leaVar != null) {
            if (leaVar.M != i2 || leaVar.N != i3) {
                leaVar.M = i2;
                leaVar.N = i3;
                leaVar.setClipChildren(i2 == 0 && i3 == 0);
                leaVar.h.setClipChildren(i2 == 0 && i3 == 0);
                leaVar.n();
            }
            F1();
        }
        for (iga igaVar : this.n0) {
            if (igaVar != null) {
                igaVar.setClipChildren(false);
                H1(igaVar);
                setPageOverscan(igaVar.h);
                setPageOverscan(igaVar.n);
                int paddingTop = igaVar.h.getPaddingTop();
                sea seaVar = igaVar.h;
                int paddingLeft = seaVar.getPaddingLeft();
                sea seaVar2 = igaVar.h;
                int T = T(igaVar.F);
                seaVar2.h3 = T;
                int paddingRight = igaVar.h.getPaddingRight();
                sea seaVar3 = igaVar.h;
                int S = S(s0());
                seaVar3.i3 = S;
                seaVar.setPadding(paddingLeft, T, paddingRight, S);
                int paddingTop2 = paddingTop - igaVar.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    gm.J(igaVar.h, new xda(igaVar, paddingTop2, b));
                }
                igaVar.w.setPadding(0, i, 0, i4);
                vfa vfaVar = this.W;
                if (vfaVar != null && vfaVar.getParent() == igaVar) {
                    k1(gm.L(56.0f) + i, vfaVar);
                }
                kea keaVar = this.a0;
                if (keaVar != null && keaVar.getParent() == igaVar) {
                    k1(i, keaVar);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void j(boolean z) {
        s09 s09Var = this.v0;
        if (s09Var == null || this.Z1 == z) {
            return;
        }
        this.Z1 = z;
        if (z || s09Var.getAnimatedDrawable().b0 >= 20) {
            s09Var.getAnimatedDrawable().K(this.Z1 ? 50 : 100);
        } else {
            s09Var.getAnimatedDrawable().K(0);
        }
        s09Var.getAnimatedDrawable().start();
    }

    public final void j1(int i, boolean z) {
        this.D0.a(i, z);
        rja rjaVar = this.I;
        if (rjaVar != null) {
            rjaVar.F(i, z);
        }
    }

    @Override // dg3
    public final void k(hg3 hg3Var) {
        d dVar = this.y1;
        if (dVar == null || !dVar.getMessagesController().N1().J(hg3Var.getDialogId())) {
            return;
        }
        dVar.getOrCreateStoryViewer().getClass();
        oab orCreateStoryViewer = dVar.getOrCreateStoryViewer();
        Context context = dVar.getContext();
        long dialogId = hg3Var.getDialogId();
        q4b a = q4b.a((r59) hg3Var.getParent());
        a.s += ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) ? gm.L(68.0f) : 0;
        orCreateStoryViewer.H(context, dialogId, a);
    }

    public boolean k0() {
        return false;
    }

    public final void l(int i) {
        int i2;
        iga P = P(this.s1);
        this.s = -1;
        if (P != null) {
            P.h.D0();
            this.t1 = i;
            P.n.setVisibility(0);
            boolean j0 = j0(this.s1);
            hga hgaVar = P.n;
            if (j0) {
                hgaVar.setAdapter(w1(this.s1));
            } else {
                hgaVar.setAdapter(this.L);
            }
            hga hgaVar2 = P.n;
            int paddingLeft = hgaVar2.getPaddingLeft();
            hga hgaVar3 = P.n;
            int T = T(P.F);
            hgaVar3.h3 = T;
            int paddingRight = P.n.getPaddingRight();
            hga hgaVar4 = P.n;
            int S = S(s0());
            hgaVar4.i3 = S;
            hgaVar2.setPadding(paddingLeft, T, paddingRight, S);
            P.r.x1(i);
            P.n.b0();
            int i3 = 0;
            while (true) {
                iga[] igaVarArr = this.n0;
                if (i3 >= igaVarArr.length) {
                    break;
                }
                iga igaVar = igaVarArr[i3];
                if (igaVar != null && ((i2 = igaVar.F) == 0 || j0(i2))) {
                    gm.V3(igaVarArr[i3].h);
                }
                i3++;
            }
            byte b = 1;
            this.r1 = true;
            if (this.s1 == 0) {
                this.w1[0].g(true);
            }
            this.q1 = 0.0f;
            e1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new jfa(this, P, b));
            ofFloat.addListener(new lx0(this, j0(P.F) ? 1 : 0, i, (byte) 3));
            ofFloat.setInterpolator(d53.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean l0() {
        TLRPC.User W1;
        long j = this.m1;
        return j > 0 && (W1 = oc7.r1(this.y1.getCurrentAccount()).W1(Long.valueOf(j))) != null && W1.bot;
    }

    public void l1(boolean z) {
        if (this.F1 != z) {
            this.F1 = z;
            rja rjaVar = this.I;
            if (rjaVar != null) {
                if (z) {
                    M1();
                    rjaVar.J();
                } else {
                    rjaVar.w();
                }
                B(true, true);
                return;
            }
            AnimatorSet animatorSet = this.R1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LinearLayout linearLayout = this.E0;
            if (z) {
                linearLayout.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R1 = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            this.R1.setDuration(180L);
            this.R1.addListener(new sw9((byte) 3, this, z));
            this.R1.start();
            if (z) {
                M1();
            }
        }
    }

    @Override // dg3
    public final boolean m() {
        return false;
    }

    public final boolean m0() {
        d dVar;
        if (this.g1 == null || (dVar = this.y1) == null) {
            return false;
        }
        return sd2.V(dVar.getMessagesController().L0(Long.valueOf(this.g1.id)));
    }

    public final void n() {
        int i = this.d2;
        int i2 = this.p2;
        k1((gm.L(6.666f) + i) - w2, this.S0);
        int i3 = i + i2;
        k1(i3, this.L0);
        k1(i3, this.E0);
        k1(gm.L(52.0f) + i + i2, this.N0);
        k1(gm.L(4.0f) + i + i2, this.M0);
        k1(gm.L(48.0f) + i + i2, this.c0);
        if (this.l2 != i2) {
            this.l2 = i2;
            Runnable runnable = this.k2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final boolean n0() {
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                return false;
            }
            iga igaVar = igaVarArr[i];
            if (igaVar != null) {
                sea seaVar = igaVar.h;
                if (seaVar != null && seaVar.d0()) {
                    return true;
                }
                hga hgaVar = igaVarArr[i].n;
                if (hgaVar != null && hgaVar.d0()) {
                    return true;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n1(int i, boolean z) {
        int i2;
        iga P;
        nga ngaVar;
        if (z && getY() != 0.0f && this.F) {
            return;
        }
        if (z && j0(i) && W(i) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.m1);
        bundle.putLong("topic_id", this.G);
        cha[] chaVarArr = this.w1;
        if (z && (P = P(0)) != null) {
            ArrayList arrayList = chaVarArr[0].e;
            int K0 = P.x.K0();
            if (K0 >= 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        ngaVar = null;
                        break;
                    } else {
                        if (K0 <= ((nga) arrayList.get(i3)).b) {
                            ngaVar = (nga) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                }
                if (ngaVar == null) {
                    ngaVar = (nga) b10.f(1, arrayList);
                }
                if (ngaVar != null) {
                    i2 = ngaVar.c;
                    if (i != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    k91 k91Var = new k91(chaVarArr[0].q, i2, bundle);
                    k91Var.N = new oo8(this, (byte) 12);
                    this.y1.presentFragment(k91Var);
                }
            }
        }
        i2 = 0;
        if (i != 9) {
        }
        k91 k91Var2 = new k91(chaVarArr[0].q, i2, bundle);
        k91Var2.N = new oo8(this, (byte) 12);
        this.y1.presentFragment(k91Var2);
    }

    public final boolean o0() {
        lea leaVar = this.b0;
        if (leaVar != null && leaVar.g()) {
            return true;
        }
        oea oeaVar = this.c0;
        return oeaVar != null && oeaVar.f;
    }

    public final void o1(int i) {
        int s1 = s1(getClosestTab());
        oea oeaVar = this.c0;
        if (s1 != i) {
            if (oeaVar != null) {
                oeaVar.b.e(i, oeaVar.d.i(i));
                return;
            }
            return;
        }
        oeaVar.setReorderingAlbums(true);
        mha t1 = t1(i);
        iga P = P(t1.a);
        if (P == null) {
            return;
        }
        sea seaVar = P.h;
        for (int i2 = 0; i2 < seaVar.getChildCount(); i2++) {
            View childAt = seaVar.getChildAt(i2);
            if (childAt instanceof sha) {
                ((sha) childAt).l(true, true);
            }
        }
        lha lhaVar = t1.c;
        if (lhaVar != null && !lhaVar.y) {
            lhaVar.y = true;
        }
        G1(true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        byte b = 0;
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                return;
            }
            sea seaVar = igaVarArr[i].h;
            if (seaVar != null) {
                seaVar.getViewTreeObserver().addOnPreDrawListener(new qfa(this, i, b));
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return D() || this.L0.I || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        nha nhaVar;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        cga cgaVar = this.G1;
        int height = cgaVar.e() != null ? cgaVar.e().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt == null || childAt.getVisibility() == 8) {
                nhaVar = this;
                i3 = i;
            } else if (childAt instanceof iga) {
                nhaVar = this;
                i3 = i;
                nhaVar.measureChildWithMargins(childAt, i3, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                sea seaVar = ((iga) childAt).h;
                seaVar.setPadding(0, seaVar.f3, 0, seaVar.g3);
            } else {
                nhaVar = this;
                i3 = i;
                i4 = i2;
                nhaVar.measureChildWithMargins(childAt, i3, 0, i4, 0);
                i5++;
                this = nhaVar;
                i = i3;
                i2 = i4;
            }
            i4 = i2;
            i5++;
            this = nhaVar;
            i = i3;
            i2 = i4;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.P1) {
            d dVar = this.y1;
            if (dVar.getParentLayout() != null && !((ActionBarLayout) dVar.getParentLayout()).h() && !D() && !this.a) {
                if (motionEvent != null) {
                    VelocityTracker velocityTracker = this.E1;
                    if (velocityTracker == null) {
                        velocityTracker = VelocityTracker.obtain();
                        this.E1 = velocityTracker;
                    }
                    velocityTracker.addMovement(motionEvent);
                    hg5 hg5Var = this.H1;
                    if (hg5Var != null) {
                        hg5Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= gm.L(90.0f) + this.d2) {
                        this.z1 = motionEvent.getPointerId(0);
                        this.B1 = true;
                        this.C1 = (int) motionEvent.getX();
                        this.D1 = (int) motionEvent.getY();
                        this.E1.clear();
                        return this.A1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.z1) {
                    int x = (int) (motionEvent.getX() - this.C1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.D1);
                    boolean z = this.A1;
                    iga[] igaVarArr = this.n0;
                    if (z && (!this.k1 ? x < 0 : x > 0)) {
                        if (!b1(motionEvent, x < 0)) {
                            this.B1 = true;
                            this.A1 = false;
                            igaVarArr[0].setTranslationX(0.0f);
                            igaVarArr[1].setTranslationX(this.k1 ? igaVarArr[0].getMeasuredWidth() : -igaVarArr[0].getMeasuredWidth());
                            g1(0.0f, igaVarArr[1].F);
                            T0(getTabProgress());
                        }
                    }
                    if (this.B1 && !this.A1) {
                        if (Math.abs(x) >= gm.Z0(true, 0.3f) && Math.abs(x) > abs) {
                            b1(motionEvent, x < 0);
                        }
                    } else if (this.A1) {
                        igaVarArr[0].setTranslationX(x);
                        if (this.k1) {
                            igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth() + x);
                        } else {
                            igaVarArr[1].setTranslationX(x - igaVarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x) / igaVarArr[0].getMeasuredWidth();
                        if (q()) {
                            this.r0 = V(abs2);
                            K1(abs2);
                            float U = U(abs2);
                            this.s0 = U;
                            this.u0.setVisibility((U == 0.0f || !q() || k0()) ? 4 : 0);
                        } else {
                            this.r0 = 0.0f;
                        }
                        G1(false);
                        g1(abs2, igaVarArr[1].F);
                        T0(getTabProgress());
                        S0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    r1(motionEvent);
                }
                return this.A1;
            }
        }
        return false;
    }

    public final boolean p() {
        boolean l0 = l0();
        long j = this.m1;
        d dVar = this.y1;
        if (l0) {
            TLRPC.User W1 = oc7.r1(dVar.getCurrentAccount()).W1(Long.valueOf(j));
            return W1 != null && W1.bot && W1.bot_can_edit;
        }
        if (s0()) {
            return true;
        }
        return dVar != null && dVar.getMessagesController().N1().g(j);
    }

    public final boolean p0(int i) {
        return i == 7 ? this.G1.Y() : (q0() || i == 0 || j0(i) || i == 2 || i == 5 || i == 6 || i == 11 || i == 10 || i == 13 || i == 14 || i == 15) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p1(boolean z) {
        iga[] igaVarArr;
        iga igaVar;
        if (this.r1) {
            return;
        }
        Object[] objArr = 0;
        int i = 0;
        while (true) {
            igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                igaVar = null;
                break;
            }
            int i2 = igaVarArr[i].F;
            if (i2 == 0 || j0(i2)) {
                break;
            } else {
                i++;
            }
        }
        igaVar = igaVarArr[i];
        if (igaVar != null) {
            int i3 = igaVar.F;
            this.s1 = i3;
            boolean j0 = j0(i3);
            int[] iArr = this.p1;
            int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], z);
            this.t1 = R;
            if (R != iArr[j0 ? 1 : 0]) {
                if (this.n1 && j0(this.s1)) {
                    return;
                }
                igaVar.n.setVisibility(0);
                boolean j02 = j0(this.s1);
                hga hgaVar = igaVar.n;
                if (j02) {
                    hgaVar.setAdapter(w1(this.s1));
                } else {
                    hgaVar.setAdapter(this.L);
                }
                hga hgaVar2 = igaVar.n;
                hgaVar2.setPadding(hgaVar2.getPaddingLeft(), T(this.s1), igaVar.n.getPaddingRight(), S(s0()));
                igaVar.r.x1(R);
                igaVar.n.b0();
                igaVar.r.O = new ifa(this, igaVar, objArr == true ? 1 : 0);
                gm.V3(igaVar.h);
                this.r1 = true;
                if (this.s1 == 0) {
                    this.w1[0].g(true);
                }
                this.q1 = 0.0f;
                if (this.s < 0) {
                    e1();
                    return;
                }
                for (iga igaVar2 : igaVarArr) {
                    if (igaVar2.F == this.s1) {
                        igaVar2.r.g1(this.s, this.w - igaVar2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    public boolean q() {
        return !(this instanceof oe5);
    }

    public boolean q0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void q1() {
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                return;
            }
            int childCount = igaVarArr[i].h.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = igaVarArr[i].h.getChildAt(i2);
                if (childAt instanceof lx2) {
                    ImageReceiver photoImage = ((lx2) childAt).getPhotoImage();
                    if (i == 0) {
                        photoImage.u0 = true;
                        photoImage.w0(false);
                    } else {
                        photoImage.u0 = false;
                        photoImage.x0();
                    }
                }
            }
            i++;
        }
    }

    public boolean r0() {
        return false;
    }

    public final void r1(MotionEvent motionEvent) {
        float f;
        float f2;
        float measuredWidth;
        VelocityTracker velocityTracker = this.E1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.V0);
            byte b = 1;
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = this.E1.getXVelocity();
                f2 = this.E1.getYVelocity();
                if (!this.A1 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    b1(motionEvent, f < 0.0f);
                }
            }
            if (this.A1) {
                iga[] igaVarArr = this.n0;
                float x = igaVarArr[0].getX();
                this.i1 = new AnimatorSet();
                this.l1 = Math.abs(x) < ((float) igaVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new p29(this, (byte) 28));
                boolean z = this.l1;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x);
                    boolean z2 = this.k1;
                    AnimatorSet animatorSet = this.i1;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(igaVarArr[0], (Property<iga, Float>) property, 0.0f), ObjectAnimator.ofFloat(igaVarArr[1], (Property<iga, Float>) property, r14.getMeasuredWidth()), ofFloat);
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(igaVarArr[0], (Property<iga, Float>) property, 0.0f), ObjectAnimator.ofFloat(igaVarArr[1], (Property<iga, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = igaVarArr[0].getMeasuredWidth() - Math.abs(x);
                    boolean z3 = this.k1;
                    AnimatorSet animatorSet2 = this.i1;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(igaVarArr[0], (Property<iga, Float>) property, -r8.getMeasuredWidth()), ObjectAnimator.ofFloat(igaVarArr[1], (Property<iga, Float>) property, 0.0f), ofFloat);
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(igaVarArr[0], (Property<iga, Float>) property, r8.getMeasuredWidth()), ObjectAnimator.ofFloat(igaVarArr[1], (Property<iga, Float>) property, 0.0f), ofFloat);
                    }
                }
                this.i1.setInterpolator(u2);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (gm.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                this.i1.setDuration(Math.max(nm7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                this.i1.addListener(new nfa(this, b));
                this.i1.start();
                this.j1 = true;
                this.A1 = false;
                S0();
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
    }

    public final boolean s() {
        iga igaVar;
        iga[] igaVarArr = this.n0;
        if (igaVarArr != null && (igaVar = igaVarArr[0]) != null) {
            boolean j0 = j0(igaVar.F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, true)) {
                return true;
            }
        }
        return false;
    }

    public boolean s0() {
        return false;
    }

    public final int s1(int i) {
        mha u1 = u1(i);
        if (u1 == null) {
            return -1;
        }
        return u1.b;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.g1;
        boolean z = chatFull2 != null && chatFull2.stories_pinned_available;
        this.g1 = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.f1 == 0) {
                this.f1 = -j;
                int i = 0;
                while (true) {
                    cha[] chaVarArr = this.w1;
                    if (i >= chaVarArr.length) {
                        break;
                    }
                    if (chaVarArr[i].b[1].size() == 0) {
                        cha chaVar = chaVarArr[i];
                        chaVar.j[1] = this.g1.migrated_from_max_id;
                        chaVar.i[1] = false;
                    }
                    i++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 == null || z == chatFull3.stories_pinned_available) {
            return;
        }
        kfa kfaVar = this.L0;
        if (kfaVar != null) {
            kfaVar.setInitialTabId(k0() ? 9 : 8);
        }
        N1(true);
        z1(false);
    }

    public void setCommonGroupsCount(int i) {
        if (this.G == 0) {
            this.a1[6] = i;
        }
        N1(true);
        y();
    }

    public void setForwardRestrictedHint(hg5 hg5Var) {
        this.H1 = hg5Var;
    }

    public void setMergeDialogId(long j) {
        this.f1 = j;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i = 0;
        while (true) {
            iArr2 = this.a1;
            if (i > 6 || iArr2[i] >= 0) {
                break;
            } else {
                i++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        N1(true);
        y();
        if (iArr2[0] >= 0) {
            G0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.k2 = runnable;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.O1 = i2;
        int i5 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i5 >= igaVarArr.length) {
                break;
            }
            igaVarArr[i5].setTranslationY(this.O1);
            i5++;
        }
        qk3 qk3Var = this.S0;
        if (qk3Var == null) {
            gfa gfaVar = this.U0;
            if (gfaVar != null) {
                gfaVar.setTranslationY(gm.L(48.0f) + i2);
            }
        } else if (qk3Var != null) {
            qk3Var.setTranslationY(this.O1);
        }
        this.R0 = i2;
        cm1 cm1Var = this.N0;
        cm1Var.setTranslationY((cm1Var.getTag() == null ? -gm.L(48.0f) : 0) + this.R0);
    }

    public void setPagesGlassEngine(sy4 sy4Var) {
        this.h2 = sy4Var;
        lea leaVar = this.b0;
        if (leaVar != null) {
            leaVar.setGlassEngine(sy4Var);
        }
        for (iga igaVar : this.n0) {
            if (igaVar != null) {
                igaVar.h.setCaptureSectionsDecoratorAllowed(true);
                sy4Var.b(igaVar.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i) {
        if (this.b2 != i) {
            this.b2 = i;
            iga[] igaVarArr = this.n0;
            if (igaVarArr != null) {
                for (iga igaVar : igaVarArr) {
                    if (igaVar != null) {
                        sea seaVar = igaVar.h;
                        int paddingLeft = seaVar.getPaddingLeft();
                        sea seaVar2 = igaVar.h;
                        int i2 = seaVar2.f3;
                        int paddingRight = seaVar2.getPaddingRight();
                        sea seaVar3 = igaVar.h;
                        int S = S(s0());
                        seaVar3.i3 = S;
                        seaVar.setPadding(paddingLeft, i2, paddingRight, S);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i) {
        if (this.g2 != i) {
            this.g2 = i;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                return;
            }
            D1(igaVarArr[i], true);
            i++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.h1;
        boolean z = userFull2 != null && userFull2.stories_pinned_available;
        this.h1 = userFull;
        N1(true);
        if (userFull == null || z == userFull.stories_pinned_available) {
            return;
        }
        f1(8);
    }

    public void setVisibleHeight(int i) {
        this.Q1 = i;
        int i2 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 >= igaVarArr.length) {
                break;
            }
            float f = (-(getMeasuredHeight() - Math.max(i, gm.L(igaVarArr[i2].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            igaVarArr[i2].w.setTranslationY(f);
            igaVarArr[i2].s.setTranslationY(-f);
            i2++;
        }
        kea keaVar = this.a0;
        if (keaVar != null) {
            keaVar.setVisibleHeight(i);
        }
        lea leaVar = this.b0;
        if (leaVar != null) {
            leaVar.setVisibleHeight(i);
        }
    }

    public final boolean t() {
        iga igaVar;
        iga[] igaVarArr = this.n0;
        if (igaVarArr != null && (igaVar = igaVarArr[0]) != null && (!this.n1 || !j0(igaVar.F))) {
            boolean j0 = j0(igaVarArr[0].F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, false)) {
                return true;
            }
        }
        return false;
    }

    public final mha t1(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.m2;
        mha mhaVar = (mha) hashMap.get(valueOf);
        if (mhaVar != null) {
            return mhaVar;
        }
        mha mhaVar2 = new mha(this, getContext(), i);
        hashMap.put(Integer.valueOf(i), mhaVar2);
        this.n2.put(Integer.valueOf(mhaVar2.a), Integer.valueOf(i));
        return mhaVar2;
    }

    public final boolean u0() {
        if (p() && ((getClosestTab() == 8 || getClosestTab() == 13 || t0(getClosestTab())) && this.F1)) {
            return false;
        }
        lea leaVar = this.b0;
        if (leaVar != null && leaVar.g()) {
            return false;
        }
        oea oeaVar = this.c0;
        return ((oeaVar != null && oeaVar.f) || this.r1 || this.j1) ? false : true;
    }

    public final mha u1(int i) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return (mha) this.m2.get(num);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.J1.a(c0(cmb.c6));
            ee0 ee0Var = this.G0;
            if (ee0Var != null) {
                ee0Var.a(c0(cmb.x8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(c0(cmb.x8));
            }
            B1();
            invalidate();
            for (iga igaVar : this.n0) {
                if (igaVar != null && igaVar.M) {
                    igaVar.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v0(int i, int i2, int i3, boolean z) {
        cha[] chaVarArr = this.w1;
        chaVarArr[i].a.clear();
        chaVarArr[i].b[0].clear();
        chaVarArr[i].b[1].clear();
        cha chaVar = chaVarArr[i];
        chaVar.j[0] = i2;
        chaVar.i[0] = false;
        chaVar.l = false;
        chaVar.m = i3;
        chaVar.n = (chaVar.e() - i3) - 1;
        cha chaVar2 = chaVarArr[i];
        if (chaVar2.n < 0) {
            chaVar2.n = 0;
        }
        chaVar2.k = i2;
        chaVar2.o = true;
        chaVar2.g = false;
        chaVar2.p++;
        iga P = P(i);
        if (P != null && P.h.getAdapter() != null) {
            P.h.getAdapter().f();
        }
        if (!z) {
            return;
        }
        int i4 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i4 >= igaVarArr.length) {
                return;
            }
            iga igaVar = igaVarArr[i4];
            if (igaVar.F == i) {
                igaVar.x.g1(Math.min(chaVarArr[i].e() - 1, chaVarArr[i].m), 0);
            }
            i4++;
        }
    }

    public final kha v1(int i) {
        mha u1;
        if (i == 8) {
            return this.f0;
        }
        if (i == 9) {
            return this.h0;
        }
        if (!t0(i) || (u1 = u1(i)) == null) {
            return null;
        }
        return u1.c;
    }

    public final void w(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        kea keaVar;
        vfa vfaVar;
        lea leaVar;
        iga[] igaVarArr = this.n0;
        int length = igaVarArr.length;
        for (int i = 0; i < length; i++) {
            iga igaVar = igaVarArr[i];
            if (igaVar != null && igaVar.getVisibility() == 0) {
                if (igaVar.P != null) {
                    RectF rectF2 = this.j2;
                    if (zgc.c(igaVar, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        igaVar.c(canvas);
                        canvas.restore();
                    }
                }
                if (igaVar.F == 14 && (leaVar = this.b0) != null && leaVar.getParent() == igaVar) {
                    for (View view : leaVar.h.getViewPages()) {
                        if ((view instanceof rs8) && view.getVisibility() == 0) {
                            va vaVar = ((rs8) view).f;
                            tl0.a(vaVar, canvas, rectF, vaVar, viewGroup);
                        }
                    }
                } else {
                    r59 currentListView = (igaVar.F == 12 && (vfaVar = this.W) != null && vfaVar.getParent() == igaVar) ? vfaVar.a.A0 : (igaVar.F == 13 && (keaVar = this.a0) != null && keaVar.getParent() == igaVar) ? keaVar.getCurrentListView() : igaVar.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        tl0.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void w0(String str) {
        getStoriesController().q(this.m1, str, new nda(this, (byte) 0));
    }

    public final kha w1(int i) {
        mha u1;
        if (i == 8) {
            return this.g0;
        }
        if (i == 9) {
            return this.i0;
        }
        if (!t0(i) || (u1 = u1(i)) == null) {
            return null;
        }
        return u1.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        nha nhaVar;
        ArrayList arrayList;
        byte b;
        int i;
        Bitmap bitmap;
        iga P = P(0);
        if (P != null && P.getMeasuredHeight() > 0 && P.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(P.getMeasuredWidth(), P.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                fc4.g(e, true);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.L1 = true;
                P.h.draw(new Canvas(bitmap2));
                View view = new View(P.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                P.addView(view);
                nhaVar = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new rb2((Object) nhaVar, (Object) view, (Object) P, (Object) bitmap2, (byte) 4)).start();
                P.h.setAlpha(0.0f);
                P.h.animate().alpha(1.0f).setUpdateListener(new p29(P, (byte) 29)).setDuration(200L).start();
                fha fhaVar = nhaVar.x1;
                int[] iArr = fhaVar.c;
                arrayList = fhaVar.n[0].a;
                cha[] chaVarArr = nhaVar.w1;
                cha chaVar = chaVarArr[0];
                int[] iArr2 = chaVar.f;
                iArr2[1] = 0;
                b = chaVar.q;
                if (b != 0) {
                    iArr2[0] = iArr[0];
                } else if (b == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                chaVar.h = false;
                long j = nhaVar.m1;
                nhaVar.v0(0, !pg3.B(j) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                nhaVar.G0(false);
                nhaVar.G1.W();
                boolean B = pg3.B(j);
                for (i = 0; i < arrayList.size(); i++) {
                    k47 k47Var = (k47) arrayList.get(i);
                    cha chaVar2 = chaVarArr[0];
                    byte b2 = chaVar2.q;
                    if (b2 == 0) {
                        chaVar2.a(k47Var, 0, false, B);
                    } else if (b2 == 1) {
                        if (k47.R3(k47Var.k)) {
                            chaVarArr[0].a(k47Var, 0, false, B);
                        }
                    } else if (!k47.R3(k47Var.k)) {
                        chaVarArr[0].a(k47Var, 0, false, B);
                    }
                }
            }
        }
        nhaVar = this;
        fha fhaVar2 = nhaVar.x1;
        int[] iArr3 = fhaVar2.c;
        arrayList = fhaVar2.n[0].a;
        cha[] chaVarArr2 = nhaVar.w1;
        cha chaVar3 = chaVarArr2[0];
        int[] iArr22 = chaVar3.f;
        iArr22[1] = 0;
        b = chaVar3.q;
        if (b != 0) {
        }
        chaVar3.h = false;
        long j2 = nhaVar.m1;
        nhaVar.v0(0, !pg3.B(j2) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        nhaVar.G0(false);
        nhaVar.G1.W();
        boolean B2 = pg3.B(j2);
        while (i < arrayList.size()) {
        }
    }

    public final void x0(TL_stories.StoryItem storyItem, a4b a4bVar) {
        getStoriesController().b(a4bVar.a, this.m1, storyItem);
        gm.d3(new e6a((Object) this, (Object) a4bVar, (byte) 4), 100L);
    }

    public final int x1(y59 y59Var) {
        if (y59Var == this.f0) {
            return 8;
        }
        if (y59Var == this.h0) {
            return 9;
        }
        for (mha mhaVar : this.m2.values()) {
            if (mhaVar.c == y59Var) {
                return mhaVar.a;
            }
        }
        return -1;
    }

    public final void y() {
        kfa kfaVar = this.L0;
        if (kfaVar.d(kfaVar.getCurrentTabId())) {
            return;
        }
        int firstTabId = kfaVar.getFirstTabId();
        kfaVar.setInitialTabId(firstTabId);
        this.n0[0].F = firstTabId;
        z1(false);
    }

    public final /* synthetic */ void y0(TL_stories.StoryItem storyItem, String str) {
        getStoriesController().q(this.m1, str, new ts9(this, storyItem, (byte) 6));
    }

    public final int y1(y59 y59Var) {
        if (y59Var == this.g0) {
            return 8;
        }
        if (y59Var == this.i0) {
            return 9;
        }
        for (mha mhaVar : this.m2.values()) {
            if (mhaVar.d == y59Var) {
                return mhaVar.a;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, sea] */
    public final void z(iga igaVar, r59 r59Var, u46 u46Var) {
        boolean z;
        int i;
        int i2;
        u69 K;
        boolean z2;
        k47 k47Var;
        ?? r4;
        z3b z3bVar;
        if (this.r1 || this.N1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (r59Var.getFastScroll() == null || !r59Var.getFastScroll().n || currentTimeMillis - igaVar.a >= 300) {
            igaVar.a = currentTimeMillis;
            if ((this.Y0 && this.X0 && igaVar.F != 11) || igaVar.F == 7) {
                return;
            }
            int K0 = u46Var.K0();
            int abs = K0 == -1 ? 0 : Math.abs(u46Var.M0() - K0) + 1;
            int b = r59Var.getAdapter() == null ? 0 : r59Var.getAdapter().b();
            int i3 = igaVar.F;
            int[] iArr = this.p1;
            byte b2 = 6;
            cha[] chaVarArr = this.w1;
            if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4) {
                b = chaVarArr[i3].d() + chaVarArr[i3].a.size();
                cha chaVar = chaVarArr[i3];
                z = false;
                if (chaVar.h && chaVar.e.size() > 2 && igaVar.F == 0 && chaVarArr[i3].a.size() != 0) {
                    float f = i3 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((r59Var.getMeasuredHeight() / (r59Var.getMeasuredWidth() / f)) * f * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((nga) chaVarArr[i3].e.get(1)).b) {
                        measuredHeight = ((nga) chaVarArr[i3].e.get(1)).b;
                    }
                    if ((K0 > b && K0 - b > measuredHeight) || ((i = K0 + abs) < chaVarArr[i3].m && chaVarArr[0].m - i > measuredHeight)) {
                        v99 v99Var = new v99(this, i3, r59Var, b2);
                        this.N1 = v99Var;
                        gm.c3(v99Var);
                        return;
                    }
                }
            } else {
                z = false;
            }
            int i4 = igaVar.F;
            if (i4 != 7) {
                boolean j0 = j0(i4);
                int i5 = igaVar.F;
                if (j0) {
                    kha v1 = v1(i5);
                    if (v1 == null || (z3bVar = v1.s) == null || K0 + abs <= z3bVar.i() - iArr[1]) {
                        return;
                    }
                    v1.P();
                    return;
                }
                if (i5 == 6) {
                    if (abs > 0) {
                        bga bgaVar = this.S;
                        boolean z3 = bgaVar.h;
                        ArrayList arrayList = bgaVar.d;
                        if (z3 || bgaVar.e || arrayList.isEmpty() || K0 + abs < b - 5) {
                            return;
                        }
                        bgaVar.E(((TLRPC.Chat) b10.f(1, arrayList)).id);
                        return;
                    }
                    return;
                }
                d dVar = this.y1;
                if (i5 == 11) {
                    ?? r2 = z;
                    int i6 = -1;
                    while (true) {
                        int childCount = igaVar.h.getChildCount();
                        r4 = igaVar.h;
                        if (r2 >= childCount) {
                            break;
                        }
                        View childAt = r4.getChildAt(r2);
                        igaVar.h.getClass();
                        i6 = Math.max(RecyclerView.R(childAt), i6);
                        r2++;
                    }
                    y59 adapter = r4.getAdapter();
                    zga zgaVar = this.V;
                    int i7 = i6 + 1;
                    if (adapter != zgaVar) {
                        if (i7 >= dVar.getMessagesController().E1().i.size()) {
                            dVar.getMessagesController().E1().g(z);
                            return;
                        }
                        return;
                    } else {
                        if (i7 < zgaVar.h.size() + zgaVar.e.size() || zgaVar.s || zgaVar.r) {
                            return;
                        }
                        zgaVar.r = true;
                        zgaVar.F();
                        return;
                    }
                }
                int i8 = 10;
                if (i5 == 10 || i5 == 12 || i5 == 13 || i5 == 14) {
                    return;
                }
                if (i5 == 0) {
                    i8 = 3;
                } else if (i5 != 5) {
                    i8 = 6;
                }
                int i9 = i5 == 15 ? 8 : i5;
                if (abs + K0 > b - i8 || chaVarArr[i9].o) {
                    cha chaVar2 = chaVarArr[i9];
                    if (!chaVar2.g) {
                        if (i5 == 0) {
                            byte b3 = chaVarArr[0].q;
                            i2 = b3 == 1 ? 6 : b3 == 2 ? 7 : 0;
                        } else {
                            int i10 = 2;
                            if (i5 == 1) {
                                i2 = 1;
                            } else {
                                if (i5 != 2) {
                                    i10 = 4;
                                    if (i5 != 4) {
                                        i2 = i5 == 5 ? 5 : i5 == 15 ? 8 : 3;
                                    }
                                }
                                i2 = i10;
                            }
                        }
                        boolean[] zArr = chaVar2.i;
                        if (!zArr[0]) {
                            chaVar2.g = true;
                            dVar.getMediaDataController().P0(this.m1, 50, chaVarArr[i9].j[0], 0, i2, this.G, 1, dVar.getClassGuid(), chaVarArr[i9].p, null, null);
                        } else if (this.f1 != 0 && !zArr[1]) {
                            chaVar2.g = true;
                            dVar.getMediaDataController().P0(this.f1, 50, chaVarArr[i9].j[1], 0, i2, this.G, 1, dVar.getClassGuid(), chaVarArr[i9].p, null, null);
                        }
                    }
                }
                int i11 = chaVarArr[i9].m;
                if (i9 == 0) {
                    i11 = this.K.L(0);
                }
                if (K0 - i11 < i8 + 1) {
                    cha chaVar3 = chaVarArr[i9];
                    if (!chaVar3.g && !chaVar3.l && !chaVar3.o) {
                        H0(igaVar.F);
                    }
                }
                iga igaVar2 = this.n0[0];
                if (igaVar2.h == r59Var) {
                    int i12 = igaVar2.F;
                    if ((i12 != 0 && i12 != 5) || K0 == -1 || (K = r59Var.K(K0)) == null) {
                        return;
                    }
                    int i13 = K.f;
                    if (i13 == 0 || i13 == 12) {
                        View view = K.a;
                        boolean z4 = view instanceof tha;
                        cm1 cm1Var = this.N0;
                        if (!z4) {
                            if (view instanceof lx2) {
                                cm1Var.h0(((lx2) view).getDate(), false, true);
                                return;
                            }
                            return;
                        }
                        tha thaVar = (tha) view;
                        if (thaVar.e <= 0) {
                            k47Var = null;
                            z2 = false;
                        } else {
                            z2 = false;
                            k47Var = thaVar.b[0];
                        }
                        if (k47Var != null) {
                            cm1Var.h0(k47Var.k.date, z2, true);
                        }
                    }
                }
            }
        }
    }

    public final void z0(HashSet hashSet, TL_stories.StoryItem storyItem, bu5 bu5Var, a4b a4bVar) {
        String a0;
        boolean contains = hashSet.contains(Integer.valueOf(a4bVar.a));
        long j = this.m1;
        if (contains) {
            getStoriesController().b(a4bVar.a, j, storyItem);
            a0 = jb6.a0(null, null, 2131744420, a4bVar.b);
        } else {
            h4b storiesController = getStoriesController();
            int i = a4bVar.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.e0(i, j, arrayList);
            a0 = jb6.a0(null, null, 2131744180, a4bVar.b);
        }
        c41.b0(this.y1).Q(R.raw.contact_check, 36, gm.S2(a0)).j();
        bu5Var.u();
    }

    public final void z1(boolean z) {
        iga[] igaVarArr;
        iga[] igaVarArr2;
        r7 r7Var;
        m69 m69Var;
        boolean z2;
        boolean z3;
        boolean z4;
        m69 m69Var2;
        int i;
        byte b;
        int i2;
        boolean z5;
        m69 m69Var3;
        int i3;
        int i4;
        boolean z6;
        m69 m69Var4;
        lea leaVar = this.b0;
        if (leaVar != null) {
            leaVar.i();
        }
        int i5 = 0;
        while (true) {
            igaVarArr = this.n0;
            if (i5 >= igaVarArr.length) {
                break;
            }
            igaVarArr[i5].h.D0();
            i5++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) igaVarArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = gm.L(I0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        y59 adapter = igaVarArr[z ? 1 : 0].h.getAdapter();
        y59 y59Var = this.f0;
        hu5 hu5Var = this.e0;
        if (adapter == y59Var) {
            hu5Var.h(null);
        }
        boolean z7 = this.Y0;
        rja rjaVar = this.I;
        cga cgaVar = this.G1;
        a aVar = this.H;
        wga wgaVar = this.Q;
        r7 r7Var2 = this.q0;
        int i6 = 100;
        if (z7 && this.X0) {
            iga igaVar = igaVarArr[z ? 1 : 0];
            if (igaVar.f == null) {
                igaVar.f = new m69();
            }
            iga igaVar2 = igaVarArr[z ? 1 : 0];
            m69 m69Var5 = igaVar2.f;
            zga zgaVar = this.V;
            gga ggaVar = this.m0;
            kga kgaVar = this.k0;
            kga kgaVar2 = this.l0;
            kga kgaVar3 = this.j0;
            if (z) {
                int i7 = igaVar2.F;
                if (i7 != 0) {
                    m69Var4 = m69Var5;
                    if (i7 != 2 && i7 != 5 && i7 != 6 && (i7 != 7 || cgaVar.Y())) {
                        String obj = r7Var2 != null ? r7Var2.getSearchField().getText().toString() : "";
                        int i8 = igaVarArr[z ? 1 : 0].F;
                        if (i8 == 1) {
                            if (kgaVar3 != null) {
                                kgaVar3.G(obj, false);
                                if (adapter != kgaVar3) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar3);
                                }
                            }
                        } else if (i8 == 3) {
                            if (kgaVar2 != null) {
                                kgaVar2.G(obj, false);
                                if (adapter != kgaVar2) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar2);
                                }
                            }
                        } else if (i8 == 4) {
                            if (kgaVar != null) {
                                kgaVar.G(obj, false);
                                if (adapter != kgaVar) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar);
                                }
                            }
                        } else if (i8 == 7) {
                            if (ggaVar != null) {
                                ggaVar.F(obj, false);
                                if (adapter != ggaVar) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(ggaVar);
                                }
                            }
                        } else if (i8 == 11) {
                            if (zgaVar != null) {
                                zgaVar.E(this.Z0, obj);
                                if (adapter != zgaVar) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(zgaVar);
                                }
                            }
                        } else if (i8 == 15 && wgaVar != null && adapter != wgaVar) {
                            d1(adapter);
                            sea seaVar = igaVarArr[z ? 1 : 0].h;
                            wgaVar.r = seaVar;
                            seaVar.setAdapter(wgaVar);
                        }
                    }
                }
                this.Y0 = false;
                hfa hfaVar = this.M0;
                if (hfaVar != null) {
                    hfaVar.g(false);
                }
                this.X0 = false;
                z1(true);
                return;
            }
            m69Var4 = m69Var5;
            if (igaVar2.h != null) {
                int i9 = igaVar2.F;
                if (i9 == 1) {
                    if (adapter != kgaVar3) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar3);
                    }
                    kgaVar3.f();
                } else if (i9 == 3) {
                    if (adapter != kgaVar2) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar2);
                    }
                    kgaVar2.f();
                } else if (i9 == 4) {
                    if (adapter != kgaVar) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar);
                    }
                    kgaVar.f();
                } else if (i9 == 7) {
                    if (adapter != ggaVar) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(ggaVar);
                    }
                    ggaVar.f();
                } else if (i9 == 11) {
                    if (adapter != zgaVar) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(zgaVar);
                    }
                    zgaVar.f();
                }
            }
            igaVarArr2 = igaVarArr;
            r7Var = r7Var2;
            m69Var3 = m69Var4;
            b = 4;
            z4 = false;
            z5 = false;
            i2 = 8;
        } else {
            iga igaVar3 = igaVarArr[z ? 1 : 0];
            if (igaVar3.e == null) {
                igaVar3.e = new m69();
            }
            iga igaVar4 = igaVarArr[z ? 1 : 0];
            m69 m69Var6 = igaVar4.e;
            igaVar4.h.setPinnedHeaderShadowDrawable(null);
            int i10 = igaVarArr[z ? 1 : 0].F;
            if (i10 == 8 || t0(i10)) {
                layoutParams.topMargin = gm.L(I0());
            }
            sea seaVar2 = igaVarArr[z ? 1 : 0].h;
            int paddingLeft = seaVar2.getPaddingLeft();
            iga igaVar5 = igaVarArr[z ? 1 : 0];
            igaVarArr2 = igaVarArr;
            sea seaVar3 = igaVar5.h;
            int T = T(igaVar5.F);
            seaVar3.h3 = T;
            int paddingRight = igaVarArr2[z ? 1 : 0].h.getPaddingRight();
            sea seaVar4 = igaVarArr2[z ? 1 : 0].h;
            int S = S(s0());
            seaVar4.i3 = S;
            seaVar2.setPadding(paddingLeft, T, paddingRight, S);
            int i11 = igaVarArr2[z ? 1 : 0].F;
            int[] iArr = this.p1;
            y59 y59Var2 = this.N;
            bga bgaVar = this.S;
            yga ygaVar = this.U;
            View view = this.a0;
            vfa vfaVar = this.W;
            r7Var = r7Var2;
            cha[] chaVarArr = this.w1;
            if (i11 == 0) {
                y59 y59Var3 = this.K;
                if (adapter != y59Var3) {
                    d1(adapter);
                    igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var3);
                }
                int i12 = -gm.L(1.0f);
                layoutParams.rightMargin = i12;
                layoutParams.leftMargin = i12;
                cha chaVar = chaVarArr[0];
                boolean z8 = chaVar.h && !chaVar.e.isEmpty();
                i6 = iArr[0];
                igaVarArr2[z ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                m69Var = chaVarArr[0].x;
                z4 = z8;
                z2 = false;
            } else {
                if (i11 == 1) {
                    cha chaVar2 = chaVarArr[1];
                    z3 = chaVar2.h && !chaVar2.e.isEmpty();
                    if (adapter != y59Var2) {
                        d1(adapter);
                        igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var2);
                    }
                } else if (i11 == 2) {
                    cha chaVar3 = chaVarArr[2];
                    z3 = chaVar3.h && !chaVar3.e.isEmpty();
                    y59 y59Var4 = this.O;
                    if (adapter != y59Var4) {
                        d1(adapter);
                        igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var4);
                    }
                } else {
                    if (i11 == 3) {
                        y59 y59Var5 = this.M;
                        if (adapter != y59Var5) {
                            d1(adapter);
                            igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var5);
                        }
                    } else if (i11 == 4) {
                        cha chaVar4 = chaVarArr[4];
                        z3 = chaVar4.h && !chaVar4.e.isEmpty();
                        y59 y59Var6 = this.P;
                        if (adapter != y59Var6) {
                            d1(adapter);
                            igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var6);
                        }
                    } else {
                        if (i11 == 5) {
                            y59 y59Var7 = this.R;
                            if (adapter != y59Var7) {
                                d1(adapter);
                                igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var7);
                            }
                        } else if (i11 == 15) {
                            if (adapter != wgaVar) {
                                d1(adapter);
                                sea seaVar5 = igaVarArr2[z ? 1 : 0].h;
                                wgaVar.r = seaVar5;
                                seaVar5.setAdapter(wgaVar);
                            }
                        } else if (i11 == 6) {
                            if (adapter != bgaVar) {
                                d1(adapter);
                                igaVarArr2[z ? 1 : 0].h.setAdapter(bgaVar);
                            }
                        } else if (i11 == 7) {
                            y59 y59Var8 = this.d0;
                            if (adapter != y59Var8) {
                                d1(adapter);
                                igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var8);
                            }
                        } else if (j0(i11)) {
                            y59 v1 = v1(igaVarArr2[z ? 1 : 0].F);
                            if (adapter != v1) {
                                d1(adapter);
                                igaVarArr2[z ? 1 : 0].h.setAdapter(v1);
                                igaVarArr2[z ? 1 : 0].h.getClass();
                            }
                            iga igaVar6 = igaVarArr2[z ? 1 : 0];
                            if (igaVar6.F != 9) {
                                hu5Var.h(igaVar6.h);
                            }
                            i6 = iArr[1];
                        } else {
                            int i13 = igaVarArr2[z ? 1 : 0].F;
                            if (i13 == 10) {
                                y59 y59Var9 = this.T;
                                if (adapter != y59Var9) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var9);
                                }
                            } else if (i13 == 11) {
                                if (adapter != ygaVar) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(ygaVar);
                                    hu5 hu5Var2 = ygaVar.w;
                                    sea seaVar6 = igaVarArr2[z ? 1 : 0].h;
                                    ygaVar.s = seaVar6;
                                    hu5Var2.h(seaVar6);
                                }
                                m69Var = ygaVar.r;
                                z2 = true;
                                z4 = false;
                            } else if (i13 == 12) {
                                if (adapter != null) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (vfaVar.getParent() != igaVarArr2[z ? 1 : 0]) {
                                    gm.B2(vfaVar);
                                    igaVarArr2[z ? 1 : 0].addView(vfaVar, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    k1(gm.L(56.0f) + this.d2, vfaVar);
                                }
                            } else if (i13 == 13) {
                                if (adapter != null) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != igaVarArr2[z ? 1 : 0]) {
                                    gm.B2(view);
                                    igaVarArr2[z ? 1 : 0].addView(view);
                                    k1(this.d2, view);
                                }
                            } else if (i13 == 14) {
                                if (adapter != null) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (leaVar != null && leaVar.getParent() != igaVarArr2[z ? 1 : 0]) {
                                    gm.B2(leaVar);
                                    igaVarArr2[z ? 1 : 0].addView(leaVar);
                                    igaVarArr2[z ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        m69Var = m69Var6;
                        z2 = false;
                        z4 = false;
                    }
                    m69Var = m69Var6;
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                m69Var = m69Var6;
                z2 = true;
            }
            I1(igaVarArr2[z ? 1 : 0]);
            if (z2) {
                igaVarArr2[z ? 1 : 0].h.setSections(false);
                m69Var2 = m69Var;
            } else {
                sea seaVar7 = igaVarArr2[z ? 1 : 0].h;
                seaVar7.getClass();
                m69Var2 = m69Var;
                anb.l(seaVar7, 20, cmb.h6, seaVar7.o2);
                seaVar7.U2 = false;
                seaVar7.I2 = null;
                seaVar7.J2 = null;
                seaVar7.M2 = 0.0f;
                seaVar7.N2 = null;
                seaVar7.O2 = null;
                seaVar7.K2 = null;
                d59 d59Var = seaVar7.H2;
                if (d59Var != null) {
                    seaVar7.r0(d59Var);
                    seaVar7.H2 = null;
                }
                yk0 yk0Var = seaVar7.S2;
                if (yk0Var != null) {
                    seaVar7.r0(yk0Var);
                    seaVar7.S2 = null;
                }
            }
            H1(igaVarArr2[z ? 1 : 0]);
            iga igaVar7 = igaVarArr2[z ? 1 : 0];
            int i14 = igaVar7.F;
            sea seaVar8 = igaVar7.h;
            if (i14 == 11) {
                seaVar8.setItemAnimator(igaVar7.d);
            } else {
                seaVar8.setItemAnimator(null);
                if (ygaVar != null && igaVarArr2[z ? 1 : 0].h == ygaVar.s) {
                    hu5 hu5Var3 = ygaVar.w;
                    ygaVar.s = null;
                    hu5Var3.h(null);
                }
            }
            if (vfaVar != null && igaVarArr2[z ? 1 : 0].F != 12 && vfaVar.getParent() == igaVarArr2[z ? 1 : 0]) {
                vfaVar.a.onRemoveFromParent();
                igaVarArr2[z ? 1 : 0].removeView(vfaVar);
            }
            if (view != null && igaVarArr2[z ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                iga igaVar8 = igaVarArr2[z ? 1 : 0];
                if (parent == igaVar8) {
                    igaVar8.removeView(view);
                }
            }
            if (leaVar != null && igaVarArr2[z ? 1 : 0].F != 14) {
                ViewParent parent2 = leaVar.getParent();
                iga igaVar9 = igaVarArr2[z ? 1 : 0];
                if (parent2 == igaVar9) {
                    igaVar9.removeView(leaVar);
                }
            }
            int i15 = igaVarArr2[z ? 1 : 0].F;
            if (i15 != 0 && i15 != 11 && !j0(i15) && (i3 = igaVarArr2[z ? 1 : 0].F) != 2 && i3 != 5 && i3 != 6 && ((i3 != 7 || cgaVar.Y()) && (i4 = igaVarArr2[z ? 1 : 0].F) != 10 && i4 != 13 && i4 != 14)) {
                if (z) {
                    if (r7Var != null && r7Var.getVisibility() == 4) {
                        if (!(rjaVar != null ? rjaVar.G : aVar.o0)) {
                            if (q()) {
                                this.A0 = (byte) 1;
                                setSearchItemVisibility(0);
                            } else {
                                setSearchItemVisibility(s0() ? 8 : 4);
                            }
                            float f = z ? 1.0f : 0.0f;
                            this.r0 = V(f);
                            K1(1.0f - f);
                            z6 = false;
                        }
                    }
                    z6 = false;
                    this.A0 = (byte) 0;
                    this.r0 = 1.0f;
                } else {
                    z6 = false;
                    if (r7Var != null && r7Var.getVisibility() == 4) {
                        if (q()) {
                            this.A0 = (byte) 0;
                            this.r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            setSearchItemVisibility(s0() ? 8 : 4);
                            this.r0 = 0.0f;
                        }
                    }
                }
                G1(z6);
            } else if (z) {
                this.A0 = (byte) 2;
            } else {
                this.A0 = (byte) 0;
                if (r7Var != null) {
                    setSearchItemVisibility((s0() || this.Y0) ? 8 : 4);
                }
            }
            int i16 = igaVarArr2[z ? 1 : 0].F;
            if (i16 == 6) {
                if (!bgaVar.e && !bgaVar.h && bgaVar.d.isEmpty()) {
                    bgaVar.E(0L);
                }
            } else if (i16 != 7) {
                if (j0(i16)) {
                    kha v12 = v1(igaVarArr2[z ? 1 : 0].F);
                    if (v12 != null) {
                        z3b z3bVar = v12.s;
                        v12.P();
                        igaVarArr2[z ? 1 : 0].w.e(z3bVar != null && (z3bVar.k() || (d0() && z3bVar.g() > 0)), z);
                        z4 = (z3bVar == null || z3bVar.g() <= 0 || q0()) ? false : true;
                    }
                } else {
                    int i17 = igaVarArr2[z ? 1 : 0].F;
                    if (i17 != 10 && i17 != 11 && i17 != 12 && i17 != 13 && i17 != 14) {
                        if (i17 == 15) {
                            i17 = 8;
                        }
                        cha chaVar5 = chaVarArr[i17];
                        if (!chaVar5.g && !chaVar5.i[0] && chaVar5.a.isEmpty()) {
                            chaVarArr[i17].g = true;
                            y59Var2.f();
                            if (i17 == 0) {
                                byte b2 = chaVarArr[0].q;
                                if (b2 == 1) {
                                    i = 6;
                                } else if (b2 == 2) {
                                    i = 7;
                                }
                                d dVar = this.y1;
                                dVar.getMediaDataController().P0(this.m1, 50, 0, 0, i, this.G, 1, dVar.getClassGuid(), chaVarArr[i].p, null, null);
                            }
                            i = i17;
                            d dVar2 = this.y1;
                            dVar2.getMediaDataController().P0(this.m1, 50, 0, 0, i, this.G, 1, dVar2.getClassGuid(), chaVarArr[i].p, null, null);
                        }
                    }
                }
            }
            int i18 = igaVarArr2[z ? 1 : 0].F;
            if (i18 == 8 || t0(i18)) {
                b = 4;
                iga igaVar10 = igaVarArr2[z ? 1 : 0];
                efa efaVar = igaVar10.w;
                boolean t0 = t0(igaVar10.F);
                int s1 = s1(igaVarArr2[z ? 1 : 0].F);
                bf0 bf0Var = efaVar.b;
                b61 b61Var = efaVar.f;
                bf0Var.setVisibility((t0 || r0() || l0()) ? 8 : 0);
                if (t0) {
                    b61Var.setVisibility(0);
                    b61Var.h(jb6.M0(2131744494, null), false);
                    i2 = 8;
                } else if (r0()) {
                    i2 = 8;
                    b61Var.setVisibility(8);
                } else {
                    i2 = 8;
                    efaVar.setStickerType(11);
                    b61Var.setVisibility(!q0() ? 0 : 8);
                    b61Var.h(f(), false);
                }
                xna xnaVar = efaVar.d;
                if (t0) {
                    xnaVar.setText(jb6.M0(2131744472, null));
                    efaVar.e.setText(jb6.M0(2131744473, null));
                } else {
                    xnaVar.setText(jb6.M0(!q0() ? s0() ? 2131747910 : 2131747881 : 2131747938, null));
                    efaVar.e.setText(s0() ? jb6.M0(2131747882, null) : "");
                }
                b61Var.setOnClickListener(new as8(this, t0, s1, (byte) 1));
            } else {
                iga igaVar11 = igaVarArr2[z ? 1 : 0];
                if (igaVar11.F == 9) {
                    if (r0()) {
                        igaVarArr2[z ? 1 : 0].w.b.setVisibility(8);
                        igaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        igaVarArr2[z ? 1 : 0].w.b.setVisibility(0);
                        igaVarArr2[z ? 1 : 0].w.setStickerType(11);
                        igaVarArr2[z ? 1 : 0].w.f.setVisibility(0);
                        igaVarArr2[z ? 1 : 0].w.f.h(f(), false);
                    }
                    igaVarArr2[z ? 1 : 0].w.d.setText(jb6.M0(2131747980, null));
                    igaVarArr2[z ? 1 : 0].w.e.setText(s0() ? jb6.M0(2131747981, null) : "");
                    b = 4;
                    igaVarArr2[z ? 1 : 0].w.f.setOnClickListener(new pda(this, b));
                    i2 = 8;
                } else {
                    b = 4;
                    igaVar11.w.b.setVisibility(0);
                    igaVarArr2[z ? 1 : 0].w.setStickerType(1);
                    igaVarArr2[z ? 1 : 0].w.d.setText(jb6.M0(2131747901, null));
                    igaVarArr2[z ? 1 : 0].w.e.setText(jb6.M0(2131745541, null));
                    i2 = 8;
                    igaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z5 = false;
            igaVarArr2[z ? 1 : 0].h.setVisibility(0);
            m69Var3 = m69Var2;
        }
        int i19 = i6;
        iga igaVar12 = igaVarArr2[z ? 1 : 0];
        igaVar12.b = z4;
        D1(igaVar12, z5);
        igaVarArr2[z ? 1 : 0].x.x1(i19);
        igaVarArr2[z ? 1 : 0].h.b0();
        if (m69Var3 != null) {
            igaVarArr2[z ? 1 : 0].h.setRecycledViewPool(m69Var3);
            igaVarArr2[z ? 1 : 0].n.setRecycledViewPool(m69Var3);
        }
        if (this.A0 == 2) {
            if (rjaVar != null ? rjaVar.G : aVar.o0) {
                this.C0 = true;
                if (rjaVar != null) {
                    rjaVar.o(true);
                } else {
                    aVar.o(true);
                }
                this.A0 = (byte) 0;
                this.r0 = 0.0f;
                if (r7Var != null) {
                    setSearchItemVisibility(s0() ? i2 : b);
                }
                G1(false);
            }
        }
    }

    public void J0(SparseArray sparseArray) {
    }

    public void K0() {
    }

    public void Q0() {
    }

    public void R0(boolean z) {
    }

    public int c1(int i) {
        return i;
    }

    @Override // dg3
    public final void o(hg3 hg3Var) {
    }

    @Override // dg3
    public final void r() {
    }

    @Override // dg3
    public final void u(hg3 hg3Var) {
    }

    @Override // dg3
    public final void v(hg3 hg3Var) {
    }
}
