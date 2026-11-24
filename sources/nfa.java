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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class nfa extends FrameLayout implements tjb, gk7, qe3, i39 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final ef3 u2 = new ef3((byte) 3);
    public static final int v2 = gl.L(7.0f);
    public static final int w2 = gl.L(7.0f) + gl.L(14.0f);
    public byte A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final pi4 E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final boolean F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final ed0 G0;
    public final cea G1;
    public final a H;
    public final ArrayList H0;
    public je5 H1;
    public final pha I;
    public final ArrayList I0;
    public final wjb I1;
    public final xha J;
    public final ArrayList J0;
    public final ix4 J1;
    public final uda K;
    public final ArrayList K0;
    public final wtc K1;
    public final hfa L;
    public final kda L0;
    public boolean L1;
    public final bfa M;
    public final hda M0;
    public final on M1;
    public final afa N;
    public final uk1 N0;
    public t79 N1;
    public final afa O;
    public AnimatorSet O0;
    public int O1;
    public final afa P;
    public final oba P0;
    public boolean P1;
    public final wea Q;
    public final ArrayList Q0;
    public int Q1;
    public final dea R;
    public float R0;
    public AnimatorSet R1;
    public final bea S;
    public final fj3 S0;
    public final SparseArray S1;
    public final zda T;
    public final FrameLayout T0;
    public long T1;
    public final yea U;
    public final gda U0;
    public boolean U1;
    public final zea V;
    public final int V0;
    public int V1;
    public final vda W;
    public final Paint W0;
    public final rda W1;
    public boolean X0;
    public y1b X1;
    public boolean Y0;
    public float Y1;
    public h19 Z0;
    public boolean Z1;
    public boolean a;
    public final kca a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final lca b0;
    public int b1;
    public int b2;
    public boolean c;
    public final oca c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final aea d0;
    public int d1;
    public int d2;
    public int e;
    public final is5 e0;
    public boolean e1;
    public int e2;
    public int f;
    public final xda f0;
    public long f1;
    public int f2;
    public final kfa g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final jca h0;
    public TLRPC.UserFull h1;
    public qw4 h2;
    public final kfa i0;
    public AnimatorSet i1;
    public float i2;
    public final kea j0;
    public boolean j1;
    public final RectF j2;
    public final kea k0;
    public boolean k1;
    public Runnable k2;
    public final kea l0;
    public boolean l1;
    public int l2;
    public final gea m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final iea[] n0;
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
    public final uca u1;
    public final ry8 v0;
    public float v1;
    public int w;
    public final r7 w0;
    public final cfa[] w1;
    public int x;
    public final r7 x0;
    public final ffa x1;
    public final Rect y;
    public final r7 y0;
    public final d y1;
    public final r7 z0;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0a77 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0b51 A[EDGE_INSN: B:172:0x0b51->B:173:0x0b51 BREAK  A[LOOP:3: B:140:0x0856->B:169:0x0a77], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0d7f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02c2  */
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
    public nfa(Context context, long j, ffa ffaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, d dVar, cea ceaVar, int i4, wjb wjbVar, kl0 kl0Var) {
        super(context);
        int i5;
        TLRPC.ProfileTab profileTab;
        long j2;
        int i6;
        cfa[] cfaVarArr;
        int i7;
        hda hdaVar;
        int i8;
        int i9;
        yea yeaVar;
        float f;
        float f2;
        xha xhaVar;
        r7 r7Var;
        boolean l0;
        kl0 kl0Var2;
        int i10;
        int i11;
        int i12;
        iea[] ieaVarArr;
        View view;
        ?? r14;
        nfa nfaVar;
        oca ocaVar;
        boolean z;
        int i13;
        int i14;
        qca qcaVar;
        oc6 oc6Var;
        iea ieaVar;
        qca qcaVar2;
        r7 a;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        TL_bots.BotInfo botInfo;
        nfa nfaVar2 = this;
        Context context2 = context;
        TLRPC.ChatFull chatFull2 = chatFull;
        wjb wjbVar2 = wjbVar;
        nfaVar2.y = new Rect();
        nfaVar2.n0 = new iea[2];
        nfaVar2.H0 = new ArrayList(10);
        nfaVar2.I0 = new ArrayList(10);
        nfaVar2.J0 = new ArrayList(10);
        nfaVar2.K0 = new ArrayList(10);
        nfaVar2.P0 = new oba(nfaVar2, (byte) 0);
        nfaVar2.Q0 = new ArrayList();
        nfaVar2.W0 = new Paint();
        nfaVar2.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        nfaVar2.n1 = false;
        nfaVar2.o1 = false;
        nfaVar2.p1 = new int[]{3, 3};
        nfaVar2.u1 = new uca(nfaVar2);
        nfaVar2.v1 = -5.0f;
        nfaVar2.w1 = new cfa[9];
        nfaVar2.M1 = new on(null);
        nfaVar2.S1 = new SparseArray();
        nfaVar2.V1 = -1;
        nfaVar2.W1 = new rda(nfaVar2);
        nfaVar2.Y1 = 0.0f;
        nfaVar2.g2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        nfaVar2.j2 = new RectF();
        nfaVar2.l2 = -1;
        nfaVar2.m2 = new HashMap();
        nfaVar2.n2 = new HashMap();
        nfaVar2.q2 = true;
        ix4 ix4Var = new ix4();
        nfaVar2.J1 = ix4Var;
        ix4Var.a(nfaVar2.c0(bkb.c6));
        kl0 kl0Var3 = kl0Var == null ? new kl0(ix4Var, ix4Var, ix4Var) : kl0Var;
        nfaVar2.F = i4;
        nfaVar2.I1 = wjbVar2;
        pi4 pi4Var = new pi4(context2, null);
        nfaVar2.E = pi4Var;
        pi4Var.setIsSingleCell(true);
        TLRPC.User V1 = dVar.getMessagesController().V1(Long.valueOf(j));
        nfaVar2.x1 = ffaVar;
        nfaVar2.G1 = ceaVar;
        int[] iArr = ffaVar.c;
        long j3 = ffaVar.s;
        nfaVar2.G = j3;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j3 == 0 ? i : 0, iArr[7], iArr[8]};
        nfaVar2.a1 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i5 = 1;
                profileTab = null;
                if (i2 != 14 || i2 == 10 || i2 == 11 || i2 == 6) {
                    nfaVar2.b1 = i2;
                } else if (V1 != null && V1.bot && V1.bot_has_main_app && V1.bot_can_edit) {
                    nfaVar2.b1 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    nfaVar2.b1 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || nfaVar2.s0()))) {
                    nfaVar2.b1 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i20 = iArr2[i5];
                        i15 = -1;
                        if (i20 == -1 || i20 > 0) {
                            nfaVar2.b1 = i5;
                        }
                    } else {
                        i15 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i19 = iArr2[5]) == i15 || i19 > 0)) {
                        nfaVar2.b1 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i18 = iArr2[3]) == i15 || i18 > 0)) {
                        nfaVar2.b1 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i17 = iArr2[4]) == i15 || i17 > 0)) {
                        nfaVar2.b1 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i16 = iArr2[2]) == i15 || i16 > 0)) {
                        nfaVar2.b1 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || nfaVar2.s0())) {
                        nfaVar2.b1 = nfaVar2.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i21 = -1;
                        if (i2 == -1 || j3 != 0) {
                            int i22 = 0;
                            while (true) {
                                int[] iArr3 = nfaVar2.a1;
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
                            nfaVar2.b1 = i22;
                        } else {
                            nfaVar2.b1 = i2;
                        }
                    } else {
                        nfaVar2.b1 = 14;
                    }
                } else {
                    nfaVar2.b1 = 14;
                }
                nfaVar2.T0(i2);
                nfaVar2.g1 = chatFull2;
                nfaVar2.h1 = userFull;
                if (chatFull2 != null) {
                    nfaVar2.f1 = -chatFull2.migrated_from_chat_id;
                }
                j2 = j;
                nfaVar2.m1 = j2;
                i6 = 0;
                while (true) {
                    cfaVarArr = nfaVar2.w1;
                    if (i6 < cfaVarArr.length) {
                        break;
                    }
                    cfaVarArr[i6] = new cfa();
                    nfaVar2.w1[i6].j[0] = cf3.B(nfaVar2.m1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    nfaVar2.w1[i6].j[1] = Integer.MAX_VALUE;
                    nfaVar2.J(i6);
                    if (nfaVar2.f1 != 0 && nfaVar2.g1 != null && nfaVar2.w1[i6].b[1].size() == 0) {
                        cfa cfaVar = nfaVar2.w1[i6];
                        cfaVar.j[1] = nfaVar2.g1.migrated_from_max_id;
                        cfaVar.i[1] = false;
                    }
                    i6++;
                }
                nfaVar2.y1 = dVar;
                nfaVar2.H = dVar.getActionBar();
                nfaVar2.I = dVar.getSimpleActionBar();
                nfaVar2.p1[0] = nfaVar2.Z0() > 0 ? gba.p1 : nfaVar2.Z0();
                nfaVar2.p1[1] = nfaVar2.Z0() > 0 ? gba.q1 : nfaVar2.Z0();
                kk7 notificationCenter = dVar.getNotificationCenter();
                notificationCenter.getClass();
                wtc wtcVar = new wtc(notificationCenter, nfaVar2);
                wtcVar.b(kk7.U);
                wtcVar.b(kk7.v);
                wtcVar.b(1);
                wtcVar.b(kk7.J);
                wtcVar.b(kk7.e2);
                wtcVar.b(kk7.f2);
                wtcVar.b(kk7.g2);
                wtcVar.b(kk7.z5);
                wtcVar.b(kk7.x5);
                wtcVar.b(kk7.g3);
                wtcVar.b(kk7.h3);
                wtcVar.b(kk7.r);
                wtcVar.b(kk7.H3);
                wtcVar.b(kk7.Y3);
                wtcVar.b(kk7.e1);
                nfaVar2.K1 = wtcVar;
                for (i7 = 0; i7 < 10; i7++) {
                    if (i2 == 4) {
                        fda fdaVar = new fda(nfaVar2, context2);
                        fdaVar.U.c();
                        nfaVar2.J0.add(fdaVar);
                    }
                }
                nfaVar2.V0 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
                nfaVar2.Y0 = false;
                nfaVar2.Z0 = null;
                hdaVar = nfaVar2.M0;
                if (hdaVar != null) {
                    hdaVar.g(false);
                }
                nfaVar2.X0 = false;
                Drawable drawable = context2.getResources().getDrawable(R.drawable.photos_header_shadow);
                nfaVar2.B0 = drawable;
                zkb.x(nfaVar2, drawable, bkb.a7, wjbVar2, PorterDuff.Mode.MULTIPLY);
                kda kdaVar = nfaVar2.L0;
                int currentTabId = kdaVar == null ? kdaVar.getCurrentTabId() : i2;
                kda kdaVar2 = new kda(nfaVar2, context2, nfaVar2.I1);
                i8 = nfaVar2.b1;
                if (i8 != -1) {
                    kdaVar2.setInitialTabId(i8);
                    nfaVar2.b1 = -1;
                }
                kdaVar2.c0 = (short) 320;
                int i24 = bkb.vi;
                int i25 = bkb.ui;
                kdaVar2.M = i24;
                kdaVar2.N = i25;
                kdaVar2.updateColors();
                kdaVar2.setUseMinimalWidth(true);
                kdaVar2.setDelegate(new mda(nfaVar2));
                nfaVar2.L0 = kdaVar2;
                for (i9 = 1; i9 >= 0; i9--) {
                    nfaVar2.c1[i9].clear();
                }
                nfaVar2.d1 = 0;
                nfaVar2.Q0.clear();
                yeaVar = nfaVar2.U;
                if (yeaVar != null) {
                    yeaVar.x.clear();
                }
                if (nfaVar2 instanceof qc5) {
                    pha phaVar = nfaVar2.I;
                    if (phaVar != null) {
                        wha t = phaVar.t();
                        a = t.a(0, R.drawable.outline_header_search);
                        if (nfaVar2.k0() || nfaVar2.q0()) {
                            f = 10.0f;
                        } else {
                            xha a2 = t.a(0, R.drawable.ic_ab_other);
                            nfaVar2.J = a2;
                            f = 10.0f;
                            a2.setContentDescription(k96.M0(2131754838, null));
                            a2.Y(false, false);
                        }
                    } else {
                        f = 10.0f;
                        r6 t3 = nfaVar2.H.t();
                        t3.addOnLayoutChangeListener(new lda(nfaVar2));
                        if (nfaVar2.m1 == nfaVar2.y1.getUserConfig().e() && (nfaVar2.y1 instanceof zj6) && nfaVar2.q()) {
                            nfaVar2.p0 = t3.a(11, R.drawable.outline_header_search);
                        }
                        a = t3.a(0, 0);
                    }
                    r7 K = a.M().K(new sda(nfaVar2));
                    nfaVar2.q0 = K;
                    hda hdaVar2 = nfaVar2.M0;
                    K.setSearchFieldHint(k96.L0((hdaVar2 != null && hdaVar2.a() && nfaVar2.getSelectedTab() == 11) ? 2131745676 : 2131745644));
                    K.setContentDescription(k96.M0(2131745644, "Search"));
                    if (nfaVar2.I != null) {
                        ((xha) K).Y(false, false);
                    } else {
                        K.setTranslationY(gl.L(f));
                        nfaVar2.setSearchItemVisibility(nfaVar2.s0() ? 8 : 4);
                    }
                } else {
                    f = 10.0f;
                }
                ImageView imageView = new ImageView(context2);
                nfaVar2.u0 = imageView;
                imageView.setContentDescription(k96.M0(2131754838, "AccDescrMoreOptions"));
                imageView.setTranslationY(gl.L(f));
                imageView.setVisibility(4);
                if (nfaVar2.I == null || nfaVar2.k0() || nfaVar2.q0()) {
                    f2 = 2.0f;
                } else {
                    f2 = 2.0f;
                    nfaVar2.H.addView(imageView, nme.e(48, 56, 85));
                    ry8 ry8Var = new ry8(context2);
                    nfaVar2.v0 = ry8Var;
                    ry8Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    ry8Var.e(R.raw.options_to_search, 24, 24);
                    ry8Var.getAnimatedDrawable().G *= 2.0f;
                    ry8Var.getAnimatedDrawable().h = true;
                    zkb.s(ry8Var, bkb.x8, wjbVar2, PorterDuff.Mode.SRC_IN);
                    ry8Var.setVisibility(8);
                    nfaVar2.H.addView(ry8Var, nme.e(48, 56, 85));
                }
                imageView.setOnClickListener(new pba(nfaVar2, (byte) 0));
                xhaVar = nfaVar2.J;
                if (xhaVar != null) {
                    xhaVar.setOnClickListener(new pba(nfaVar2, (byte) 1));
                }
                r7Var = nfaVar2.q0;
                if (r7Var != null && nfaVar2.I == null) {
                    EditTextBoldCursor searchField = r7Var.getSearchField();
                    int i26 = bkb.F6;
                    zkb.X(searchField, i26, wjbVar2);
                    zkb.D(searchField, bkb.Ij, wjbVar2);
                    zkb.v(searchField, i26, wjbVar2);
                }
                nfaVar2.A0 = (byte) 0;
                LinearLayout linearLayout = new LinearLayout(context2);
                nfaVar2.E0 = linearLayout;
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                linearLayout.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                nfaVar2.F0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ed0 ed0Var = new ed0(true);
                nfaVar2.G0 = ed0Var;
                imageView2.setImageDrawable(ed0Var);
                int i27 = bkb.x8;
                ed0Var.a(nfaVar2.c0(i27));
                int i28 = bkb.y8;
                zkb.R(imageView2, bkb.e0(nfaVar2.c0(i28), 1), null, zkb.M(i28), wjbVar2);
                imageView2.setContentDescription(k96.M0(2131752029, "Close"));
                linearLayout.addView(imageView2, new LinearLayout.LayoutParams(gl.L(54.0f), -1));
                nfaVar2.Q0.add(imageView2);
                imageView2.setOnClickListener(new pba(nfaVar2, (byte) 2));
                NumberTextView numberTextView = new NumberTextView(context2);
                nfaVar2.D0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(gl.o());
                numberTextView.setTextColor(nfaVar2.c0(i27));
                linearLayout.addView(numberTextView, nme.m(1.0f, 0, -1, 18, 0, 0));
                nfaVar2.Q0.add(numberTextView);
                if (!cf3.B(nfaVar2.m1)) {
                    if (!nfaVar2.s0()) {
                        nfaVar2.x0 = nfaVar2.F(context2, kk7.m1, R.drawable.msg_message, k96.L0(2131754877));
                        nfaVar2.w0 = nfaVar2.F(context2, 100, R.drawable.msg_forward, k96.L0(2131750570));
                    }
                    r7 F = nfaVar2.F(context2, kk7.n1, R.drawable.msg_pin, k96.L0(2131747052));
                    nfaVar2.y0 = F;
                    F.setVisibility(8);
                    r7 F2 = nfaVar2.F(context2, kk7.o1, R.drawable.msg_unpin, k96.L0(2131743605));
                    nfaVar2.z0 = F2;
                    F2.setVisibility(8);
                    nfaVar2.E1();
                }
                nfaVar2.o0 = nfaVar2.F(context2, 101, R.drawable.msg_delete, k96.M0(2131751586, "Delete"));
                nfaVar2.K = new uda(nfaVar2, context2);
                nfaVar2.L = new hfa(nfaVar2, context2);
                nfaVar2.N = new afa(nfaVar2, context2, 1);
                nfaVar2.O = new afa(nfaVar2, context2, 2);
                nfaVar2.P = new afa(nfaVar2, context2, 4);
                nfaVar2.Q = new wea(nfaVar2, context2, nfaVar2.y1.getCurrentAccount(), nfaVar2.y1.getResourceProvider());
                nfaVar2.R = new dea(nfaVar2, context2);
                nfaVar2.j0 = new kea(nfaVar2, context2, 1);
                nfaVar2.k0 = new kea(nfaVar2, context2, 4);
                nfaVar2.l0 = new kea(nfaVar2, context2, 3);
                nfaVar2.m0 = new gea(nfaVar2, context2);
                nfaVar2.S = new bea(nfaVar2, context2);
                nfaVar2.T = new zda(nfaVar2, context2);
                nfaVar2.U = new yea(nfaVar2, context2);
                nfaVar2.V = new zea(nfaVar2, context2);
                if (!nfaVar2.s0() && !nfaVar2.h0() && nfaVar2.G == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", nfaVar2.y1.getUserConfig().e());
                    bundle.putInt("chatMode", 3);
                    vda vdaVar = new vda(nfaVar2, context2, nfaVar2.y1.getParentLayout(), bundle);
                    nfaVar2.W = vdaVar;
                    long j4 = nfaVar2.m1;
                    tu1 tu1Var = vdaVar.a;
                    tu1Var.s4 = j4;
                    tu1Var.nb = true;
                    vdaVar.setClipToOutline(true);
                    vdaVar.setOutlineProvider(new wda());
                }
                aea aeaVar = new aea(nfaVar2, context2);
                nfaVar2.d0 = aeaVar;
                if (nfaVar2.G == 0) {
                    aeaVar.e = arrayList;
                    aeaVar.d = currentTabId != 7 ? null : chatFull2;
                }
                nfaVar2.f0 = new xda(nfaVar2, context2);
                nfaVar2.e0 = new is5(new yda(nfaVar2));
                nfaVar2.g0 = new kfa(nfaVar2, context2, false);
                nfaVar2.h0 = new jca(nfaVar2, context2);
                nfaVar2.i0 = new kfa(nfaVar2, context2, true);
                nfaVar2.M = new bfa(nfaVar2, context2);
                l0 = nfaVar2.l0();
                d dVar2 = nfaVar2.y1;
                if (!l0) {
                    nfaVar2.a0 = new kca(nfaVar2, context2, dVar2, nfaVar2.m1);
                } else if (dVar2 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    nfaVar2.t0 = textView;
                    textView.setText(k96.L0(2131745754).toUpperCase());
                    textView.setTypeface(gl.o());
                    int i29 = bkb.Ei;
                    zkb.X(textView, i29, wjbVar2);
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    zkb.R(textView, bkb.e0(bkb.p1(0.15f, nfaVar2.c0(i29)), 3), null, zkb.K(0.15f, i29), wjbVar2);
                    textView.setPadding(gl.L(19.0f), 0, gl.L(19.0f), 0);
                    ViewGroup viewGroup = nfaVar2.I;
                    (viewGroup == null ? nfaVar2.H : viewGroup).addView(textView, nme.e(-2, 56, 85));
                    textView.setOnClickListener(new pba(nfaVar2, (byte) 3));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    d dVar3 = nfaVar2.y1;
                    kl0 kl0Var4 = kl0Var3;
                    lca lcaVar = new lca(nfaVar2, dVar3, context2, dVar3.getCurrentAccount(), ((ProfileActivity) nfaVar2.y1).a(), wjbVar2, kl0Var4);
                    wjbVar2 = wjbVar2;
                    nfaVar2.b0 = lcaVar;
                    nfaVar2.F1();
                    nfaVar2.c0 = new oca(nfaVar2, context2, nfaVar2.getStoriesController().A(nfaVar2.m1, true), new nca(nfaVar2, context2, dVar, wjbVar2));
                    kl0Var2 = kl0Var4;
                    nfaVar2.setWillNotDraw(false);
                    i10 = 0;
                    i11 = -1;
                    i12 = 0;
                    while (true) {
                        ieaVarArr = nfaVar2.n0;
                        if (i12 >= ieaVarArr.length) {
                            break;
                        }
                        if (i12 == 0 && (ieaVar = ieaVarArr[i12]) != null && (qcaVar2 = ieaVar.x) != null) {
                            i11 = qcaVar2.K0();
                            if (i11 != nfaVar2.n0[i12].x.A() - 1) {
                                y29 y29Var = (y29) nfaVar2.n0[i12].h.K(i11);
                                if (y29Var != null) {
                                    i10 = y29Var.a.getTop();
                                } else {
                                    i11 = -1;
                                }
                            } else {
                                i13 = i10;
                                i14 = -1;
                                pca pcaVar = new pca(nfaVar2, context2);
                                nfaVar2.addView(pcaVar, nme.d(-1, -1.0f, 51, 0.0f, nfaVar2.I0(), 0.0f, 0.0f));
                                if (i12 == 1) {
                                    pcaVar.setTranslationX(gl.q.x);
                                }
                                nfaVar2.n0[i12] = pcaVar;
                                pcaVar.O = wjbVar2;
                                qcaVar = new qca(nfaVar2, pcaVar);
                                pcaVar.x = qcaVar;
                                qcaVar.O = new rca(nfaVar2, pcaVar);
                                nfaVar2.n0[i12].d = new gb3();
                                nfaVar2.n0[i12].d.n(280L);
                                nfaVar2.n0[i12].d.o(s33.h);
                                iea ieaVar2 = nfaVar2.n0[i12];
                                ieaVar2.d.m = false;
                                context2 = context;
                                ieaVar2.h = new sca(nfaVar2, context, wjbVar2, pcaVar, qcaVar);
                                nfaVar2.n0[i12].h.setFastScrollEnabled(1);
                                nfaVar2.n0[i12].h.setScrollingTouchSlop(1);
                                nfaVar2.n0[i12].h.setPinnedSectionOffsetY(-gl.L(f2));
                                nfaVar2.n0[i12].h.setPadding(0, gl.L(54.0f), 0, 0);
                                nfaVar2.n0[i12].h.setItemAnimator(null);
                                nfaVar2.n0[i12].h.setClipToPadding(false);
                                nfaVar2.n0[i12].h.setSectionsType(2);
                                nfaVar2.n0[i12].h.setLayoutManager(qcaVar);
                                iea ieaVar3 = nfaVar2.n0[i12];
                                ieaVar3.addView(ieaVar3.h, nme.c(-1.0f, -1));
                                nfaVar2.n0[i12].n = new hea(context2);
                                iea ieaVar4 = nfaVar2.n0[i12];
                                hea heaVar = ieaVar4.n;
                                tca tcaVar = new tca(nfaVar2);
                                ieaVar4.r = tcaVar;
                                heaVar.setLayoutManager(tcaVar);
                                iea ieaVar5 = nfaVar2.n0[i12];
                                ieaVar5.addView(ieaVar5.n, nme.c(-1.0f, -1));
                                nfaVar2.n0[i12].n.setVisibility(8);
                                nfaVar2.n0[i12].n.i(new vca(pcaVar));
                                nfaVar2.n0[i12].h.i(new wca(nfaVar2, pcaVar));
                                nfaVar2.n0[i12].h.setOnItemClickListener(new xn1(nfaVar2, pcaVar, context2, j2, wjbVar, (byte) 1));
                                nfaVar2.n0[i12].h.setOnScrollListener(new zca(nfaVar2, pcaVar, qcaVar));
                                nfaVar2.n0[i12].h.setOnItemLongClickListener(new ada(nfaVar2, pcaVar));
                                if (i12 == 0 && i14 != -1) {
                                    qcaVar.g1(i14, i13);
                                }
                                iea ieaVar6 = nfaVar2.n0[i12];
                                ieaVar6.y = new bda(context2, ieaVar6.h);
                                nfaVar2.n0[i12].y.setVisibility(8);
                                iea ieaVar7 = nfaVar2.n0[i12];
                                sca scaVar = ieaVar7.h;
                                bda bdaVar = ieaVar7.y;
                                FrameLayout.LayoutParams c = nme.c(-1.0f, -1);
                                oc6Var = scaVar.c1;
                                if (oc6Var == null) {
                                    oc6Var = new oc6((byte) 15, scaVar.getContext(), scaVar);
                                    scaVar.c1 = oc6Var;
                                }
                                oc6Var.addView(bdaVar, c);
                                nfaVar2.n0[i12].s = new cda(nfaVar2, context2, pcaVar);
                                cda cdaVar = nfaVar2.n0[i12].s;
                                cdaVar.x = false;
                                cdaVar.setClipToOutline(true);
                                nfaVar2.n0[i12].s.setOutlineProvider(new dda());
                                if (i12 == 0) {
                                    nfaVar2.n0[i12].setVisibility(8);
                                }
                                iea ieaVar8 = nfaVar2.n0[i12];
                                ieaVar8.w = new eda(nfaVar2, context2, ieaVar8.s);
                                nfaVar2.n0[i12].w.d(8, false);
                                nfaVar2.n0[i12].w.setAnimateLayoutChange(true);
                                iea ieaVar9 = nfaVar2.n0[i12];
                                ieaVar9.addView(ieaVar9.w, nme.c(-1.0f, -1));
                                nfaVar2.n0[i12].w.setOnTouchListener(new jz1((byte) 25));
                                nfaVar2.n0[i12].w.e(true, false);
                                nfaVar2.n0[i12].w.d.setText(k96.M0(2131747975, "NoResult"));
                                nfaVar2.n0[i12].w.f.setVisibility(8);
                                nfaVar2.n0[i12].w.e.setText(k96.L0(2131745615));
                                nfaVar2.n0[i12].w.f.setVisibility(8);
                                iea ieaVar10 = nfaVar2.n0[i12];
                                ieaVar10.w.addView(ieaVar10.s, nme.d(-1, -1.0f, kk7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
                                iea ieaVar11 = nfaVar2.n0[i12];
                                ieaVar11.h.setEmptyView(ieaVar11.w);
                                nfaVar2.n0[i12].h.p1(0, true);
                                iea[] ieaVarArr2 = nfaVar2.n0;
                                iea ieaVar12 = ieaVarArr2[i12];
                                ieaVar12.E = new cu6(ieaVar12.h, ieaVarArr2[i12].x);
                                i12++;
                                j2 = j;
                                wjbVar2 = wjbVar;
                                i10 = i13;
                                i11 = i14;
                            }
                        }
                        i13 = i10;
                        i14 = i11;
                        pca pcaVar2 = new pca(nfaVar2, context2);
                        nfaVar2.addView(pcaVar2, nme.d(-1, -1.0f, 51, 0.0f, nfaVar2.I0(), 0.0f, 0.0f));
                        if (i12 == 1) {
                        }
                        nfaVar2.n0[i12] = pcaVar2;
                        pcaVar2.O = wjbVar2;
                        qcaVar = new qca(nfaVar2, pcaVar2);
                        pcaVar2.x = qcaVar;
                        qcaVar.O = new rca(nfaVar2, pcaVar2);
                        nfaVar2.n0[i12].d = new gb3();
                        nfaVar2.n0[i12].d.n(280L);
                        nfaVar2.n0[i12].d.o(s33.h);
                        iea ieaVar22 = nfaVar2.n0[i12];
                        ieaVar22.d.m = false;
                        context2 = context;
                        ieaVar22.h = new sca(nfaVar2, context, wjbVar2, pcaVar2, qcaVar);
                        nfaVar2.n0[i12].h.setFastScrollEnabled(1);
                        nfaVar2.n0[i12].h.setScrollingTouchSlop(1);
                        nfaVar2.n0[i12].h.setPinnedSectionOffsetY(-gl.L(f2));
                        nfaVar2.n0[i12].h.setPadding(0, gl.L(54.0f), 0, 0);
                        nfaVar2.n0[i12].h.setItemAnimator(null);
                        nfaVar2.n0[i12].h.setClipToPadding(false);
                        nfaVar2.n0[i12].h.setSectionsType(2);
                        nfaVar2.n0[i12].h.setLayoutManager(qcaVar);
                        iea ieaVar32 = nfaVar2.n0[i12];
                        ieaVar32.addView(ieaVar32.h, nme.c(-1.0f, -1));
                        nfaVar2.n0[i12].n = new hea(context2);
                        iea ieaVar42 = nfaVar2.n0[i12];
                        hea heaVar2 = ieaVar42.n;
                        tca tcaVar2 = new tca(nfaVar2);
                        ieaVar42.r = tcaVar2;
                        heaVar2.setLayoutManager(tcaVar2);
                        iea ieaVar52 = nfaVar2.n0[i12];
                        ieaVar52.addView(ieaVar52.n, nme.c(-1.0f, -1));
                        nfaVar2.n0[i12].n.setVisibility(8);
                        nfaVar2.n0[i12].n.i(new vca(pcaVar2));
                        nfaVar2.n0[i12].h.i(new wca(nfaVar2, pcaVar2));
                        nfaVar2.n0[i12].h.setOnItemClickListener(new xn1(nfaVar2, pcaVar2, context2, j2, wjbVar, (byte) 1));
                        nfaVar2.n0[i12].h.setOnScrollListener(new zca(nfaVar2, pcaVar2, qcaVar));
                        nfaVar2.n0[i12].h.setOnItemLongClickListener(new ada(nfaVar2, pcaVar2));
                        if (i12 == 0) {
                            qcaVar.g1(i14, i13);
                        }
                        iea ieaVar62 = nfaVar2.n0[i12];
                        ieaVar62.y = new bda(context2, ieaVar62.h);
                        nfaVar2.n0[i12].y.setVisibility(8);
                        iea ieaVar72 = nfaVar2.n0[i12];
                        sca scaVar2 = ieaVar72.h;
                        bda bdaVar2 = ieaVar72.y;
                        FrameLayout.LayoutParams c2 = nme.c(-1.0f, -1);
                        oc6Var = scaVar2.c1;
                        if (oc6Var == null) {
                        }
                        oc6Var.addView(bdaVar2, c2);
                        nfaVar2.n0[i12].s = new cda(nfaVar2, context2, pcaVar2);
                        cda cdaVar2 = nfaVar2.n0[i12].s;
                        cdaVar2.x = false;
                        cdaVar2.setClipToOutline(true);
                        nfaVar2.n0[i12].s.setOutlineProvider(new dda());
                        if (i12 == 0) {
                        }
                        iea ieaVar82 = nfaVar2.n0[i12];
                        ieaVar82.w = new eda(nfaVar2, context2, ieaVar82.s);
                        nfaVar2.n0[i12].w.d(8, false);
                        nfaVar2.n0[i12].w.setAnimateLayoutChange(true);
                        iea ieaVar92 = nfaVar2.n0[i12];
                        ieaVar92.addView(ieaVar92.w, nme.c(-1.0f, -1));
                        nfaVar2.n0[i12].w.setOnTouchListener(new jz1((byte) 25));
                        nfaVar2.n0[i12].w.e(true, false);
                        nfaVar2.n0[i12].w.d.setText(k96.M0(2131747975, "NoResult"));
                        nfaVar2.n0[i12].w.f.setVisibility(8);
                        nfaVar2.n0[i12].w.e.setText(k96.L0(2131745615));
                        nfaVar2.n0[i12].w.f.setVisibility(8);
                        iea ieaVar102 = nfaVar2.n0[i12];
                        ieaVar102.w.addView(ieaVar102.s, nme.d(-1, -1.0f, kk7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
                        iea ieaVar112 = nfaVar2.n0[i12];
                        ieaVar112.h.setEmptyView(ieaVar112.w);
                        nfaVar2.n0[i12].h.p1(0, true);
                        iea[] ieaVarArr22 = nfaVar2.n0;
                        iea ieaVar122 = ieaVarArr22[i12];
                        ieaVar122.E = new cu6(ieaVar122.h, ieaVarArr22[i12].x);
                        i12++;
                        j2 = j;
                        wjbVar2 = wjbVar;
                        i10 = i13;
                        i11 = i14;
                    }
                    view = nfaVar2.c0;
                    if (view != null) {
                        nfaVar2.addView(view, nme.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    uk1 uk1Var = new uk1(context2);
                    nfaVar2.N0 = uk1Var;
                    uk1Var.i0((int) (System.currentTimeMillis() / 1000), false, false);
                    uk1Var.setAlpha(0.0f);
                    int i30 = bkb.md;
                    int i31 = bkb.ae;
                    uk1Var.U0 = i30;
                    uk1Var.V0 = i31;
                    uk1Var.setTranslationY(-gl.L(48.0f));
                    nfaVar2.addView(uk1Var, nme.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    for (iea ieaVar13 : nfaVar2.n0) {
                        v29 fastScroll = ieaVar13.h.getFastScroll();
                        if (fastScroll != null) {
                            fastScroll.a(kl0Var2, nfaVar2.I != null ? nod.l(wjbVar) : nod.n(wjbVar));
                        }
                    }
                    if (nfaVar2.H()) {
                        r14 = 0;
                        nfaVar = nfaVar2;
                    } else {
                        nl0 l = nfaVar2.I != null ? nod.l(wjbVar) : nod.n(wjbVar);
                        fj3 fj3Var = new fj3(context2);
                        nfaVar2.S0 = fj3Var;
                        int L = gl.L(11.0f);
                        int i32 = w2;
                        fj3Var.setPadding(L, i32, gl.L(11.0f), i32);
                        il0 b = kl0Var2.b(fj3Var, l);
                        b.r(gl.L(24.0f));
                        b.q(gl.L(7.0f));
                        fj3Var.setBlurredBackground(b);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        nfaVar2.T0 = frameLayout;
                        fj3Var.addView(frameLayout);
                        fj3Var.j(frameLayout, true, false);
                        fj3Var.setOnAnimatedHeightChangedListener(new oba(nfaVar2, (byte) 1));
                        gda gdaVar = new gda(nfaVar2, context2, dVar, this, wjbVar);
                        nfaVar2.U0 = gdaVar;
                        frameLayout.addView(gdaVar);
                        fj3Var.setCallFragmentContextView(gdaVar);
                        nfaVar2.addView(fj3Var, nme.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
                        gdaVar.setDelegate(new qba(nfaVar2));
                        il0 b2 = kl0Var2.b(nfaVar2.L0, l);
                        ug8.r(b2, gl.L(18.0f), 6.666f);
                        nfaVar2.L0.setPadding(0, gl.L(7.0f), 0, gl.L(7.0f));
                        nfaVar2.L0.setClipToPadding(false);
                        nfaVar2.L0.setBackground(null);
                        nfaVar2.L0.setBlurredBackground(b2);
                        nfaVar2.L0.setOpen(false);
                        nfaVar2.addView(nfaVar2.L0, nme.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
                        Context context3 = nfaVar2.getContext();
                        d dVar4 = nfaVar2.y1;
                        hda hdaVar3 = new hda(nfaVar2, context3, dVar4, dVar4.getCurrentAccount(), nfaVar2.h0() ? 0L : nfaVar2.m1, wjbVar);
                        nfa nfaVar3 = nfaVar2;
                        nfaVar3.M0 = hdaVar3;
                        hdaVar3.d(kl0Var2, l);
                        hdaVar3.setShown(0.0f);
                        nfaVar3.addView(hdaVar3, nme.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        if (nfaVar3.I == null) {
                            il0 b3 = kl0Var2.b(nfaVar3.E0, l);
                            ug8.r(b3, gl.L(18.0f), 6.666f);
                            nfaVar3.E0.setBackground(b3);
                            z = false;
                            nfaVar3.E0.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            nfaVar3.addView(nfaVar3.E0, nme.e(-1, 50, 51));
                        } else {
                            z = false;
                        }
                        nfaVar3.n();
                        nfaVar = nfaVar3;
                        r14 = z;
                    }
                    nfaVar.N1(r14);
                    nfaVar.z1(r14);
                    nfaVar.B(r14, r14);
                    if (nfaVar.a1[r14] >= 0) {
                        nfaVar.G0(r14);
                    }
                    ocaVar = nfaVar.c0;
                    if (ocaVar == null || i3 <= 0) {
                        return;
                    }
                    ocaVar.setInitialTabId(i3);
                    return;
                }
                kl0Var2 = kl0Var3;
                nfaVar2.setWillNotDraw(false);
                i10 = 0;
                i11 = -1;
                i12 = 0;
                while (true) {
                    ieaVarArr = nfaVar2.n0;
                    if (i12 >= ieaVarArr.length) {
                    }
                    iea ieaVar822 = nfaVar2.n0[i12];
                    ieaVar822.w = new eda(nfaVar2, context2, ieaVar822.s);
                    nfaVar2.n0[i12].w.d(8, false);
                    nfaVar2.n0[i12].w.setAnimateLayoutChange(true);
                    iea ieaVar922 = nfaVar2.n0[i12];
                    ieaVar922.addView(ieaVar922.w, nme.c(-1.0f, -1));
                    nfaVar2.n0[i12].w.setOnTouchListener(new jz1((byte) 25));
                    nfaVar2.n0[i12].w.e(true, false);
                    nfaVar2.n0[i12].w.d.setText(k96.M0(2131747975, "NoResult"));
                    nfaVar2.n0[i12].w.f.setVisibility(8);
                    nfaVar2.n0[i12].w.e.setText(k96.L0(2131745615));
                    nfaVar2.n0[i12].w.f.setVisibility(8);
                    iea ieaVar1022 = nfaVar2.n0[i12];
                    ieaVar1022.w.addView(ieaVar1022.s, nme.d(-1, -1.0f, kk7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
                    iea ieaVar1122 = nfaVar2.n0[i12];
                    ieaVar1122.h.setEmptyView(ieaVar1122.w);
                    nfaVar2.n0[i12].h.p1(0, true);
                    iea[] ieaVarArr222 = nfaVar2.n0;
                    iea ieaVar1222 = ieaVarArr222[i12];
                    ieaVar1222.E = new cu6(ieaVar1222.h, ieaVarArr222[i12].x);
                    i12++;
                    j2 = j;
                    wjbVar2 = wjbVar;
                    i10 = i13;
                    i11 = i14;
                }
                view = nfaVar2.c0;
                if (view != null) {
                }
                uk1 uk1Var2 = new uk1(context2);
                nfaVar2.N0 = uk1Var2;
                uk1Var2.i0((int) (System.currentTimeMillis() / 1000), false, false);
                uk1Var2.setAlpha(0.0f);
                int i302 = bkb.md;
                int i312 = bkb.ae;
                uk1Var2.U0 = i302;
                uk1Var2.V0 = i312;
                uk1Var2.setTranslationY(-gl.L(48.0f));
                nfaVar2.addView(uk1Var2, nme.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                while (r4 < r2) {
                }
                if (nfaVar2.H()) {
                }
                nfaVar.N1(r14);
                nfaVar.z1(r14);
                nfaVar.B(r14, r14);
                if (nfaVar.a1[r14] >= 0) {
                }
                ocaVar = nfaVar.c0;
                if (ocaVar == null) {
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
        nfaVar2.b1 = i2;
        nfaVar2.T0(i2);
        nfaVar2.g1 = chatFull2;
        nfaVar2.h1 = userFull;
        if (chatFull2 != null) {
        }
        j2 = j;
        nfaVar2.m1 = j2;
        i6 = 0;
        while (true) {
            cfaVarArr = nfaVar2.w1;
            if (i6 < cfaVarArr.length) {
            }
            i6++;
        }
        nfaVar2.y1 = dVar;
        nfaVar2.H = dVar.getActionBar();
        nfaVar2.I = dVar.getSimpleActionBar();
        nfaVar2.p1[0] = nfaVar2.Z0() > 0 ? gba.p1 : nfaVar2.Z0();
        nfaVar2.p1[1] = nfaVar2.Z0() > 0 ? gba.q1 : nfaVar2.Z0();
        kk7 notificationCenter2 = dVar.getNotificationCenter();
        notificationCenter2.getClass();
        wtc wtcVar2 = new wtc(notificationCenter2, nfaVar2);
        wtcVar2.b(kk7.U);
        wtcVar2.b(kk7.v);
        wtcVar2.b(1);
        wtcVar2.b(kk7.J);
        wtcVar2.b(kk7.e2);
        wtcVar2.b(kk7.f2);
        wtcVar2.b(kk7.g2);
        wtcVar2.b(kk7.z5);
        wtcVar2.b(kk7.x5);
        wtcVar2.b(kk7.g3);
        wtcVar2.b(kk7.h3);
        wtcVar2.b(kk7.r);
        wtcVar2.b(kk7.H3);
        wtcVar2.b(kk7.Y3);
        wtcVar2.b(kk7.e1);
        nfaVar2.K1 = wtcVar2;
        while (i7 < 10) {
        }
        nfaVar2.V0 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        nfaVar2.Y0 = false;
        nfaVar2.Z0 = null;
        hdaVar = nfaVar2.M0;
        if (hdaVar != null) {
        }
        nfaVar2.X0 = false;
        Drawable drawable2 = context2.getResources().getDrawable(R.drawable.photos_header_shadow);
        nfaVar2.B0 = drawable2;
        zkb.x(nfaVar2, drawable2, bkb.a7, wjbVar2, PorterDuff.Mode.MULTIPLY);
        kda kdaVar3 = nfaVar2.L0;
        if (kdaVar3 == null) {
        }
        kda kdaVar22 = new kda(nfaVar2, context2, nfaVar2.I1);
        i8 = nfaVar2.b1;
        if (i8 != -1) {
        }
        kdaVar22.c0 = (short) 320;
        int i242 = bkb.vi;
        int i252 = bkb.ui;
        kdaVar22.M = i242;
        kdaVar22.N = i252;
        kdaVar22.updateColors();
        kdaVar22.setUseMinimalWidth(true);
        kdaVar22.setDelegate(new mda(nfaVar2));
        nfaVar2.L0 = kdaVar22;
        while (i9 >= 0) {
        }
        nfaVar2.d1 = 0;
        nfaVar2.Q0.clear();
        yeaVar = nfaVar2.U;
        if (yeaVar != null) {
        }
        if (nfaVar2 instanceof qc5) {
        }
        ImageView imageView3 = new ImageView(context2);
        nfaVar2.u0 = imageView3;
        imageView3.setContentDescription(k96.M0(2131754838, "AccDescrMoreOptions"));
        imageView3.setTranslationY(gl.L(f));
        imageView3.setVisibility(4);
        if (nfaVar2.I == null) {
        }
        f2 = 2.0f;
        imageView3.setOnClickListener(new pba(nfaVar2, (byte) 0));
        xhaVar = nfaVar2.J;
        if (xhaVar != null) {
        }
        r7Var = nfaVar2.q0;
        if (r7Var != null) {
            EditTextBoldCursor searchField2 = r7Var.getSearchField();
            int i262 = bkb.F6;
            zkb.X(searchField2, i262, wjbVar2);
            zkb.D(searchField2, bkb.Ij, wjbVar2);
            zkb.v(searchField2, i262, wjbVar2);
        }
        nfaVar2.A0 = (byte) 0;
        LinearLayout linearLayout2 = new LinearLayout(context2);
        nfaVar2.E0 = linearLayout2;
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setClickable(true);
        linearLayout2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        nfaVar2.F0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        ed0 ed0Var2 = new ed0(true);
        nfaVar2.G0 = ed0Var2;
        imageView22.setImageDrawable(ed0Var2);
        int i272 = bkb.x8;
        ed0Var2.a(nfaVar2.c0(i272));
        int i282 = bkb.y8;
        zkb.R(imageView22, bkb.e0(nfaVar2.c0(i282), 1), null, zkb.M(i282), wjbVar2);
        imageView22.setContentDescription(k96.M0(2131752029, "Close"));
        linearLayout2.addView(imageView22, new LinearLayout.LayoutParams(gl.L(54.0f), -1));
        nfaVar2.Q0.add(imageView22);
        imageView22.setOnClickListener(new pba(nfaVar2, (byte) 2));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        nfaVar2.D0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(gl.o());
        numberTextView2.setTextColor(nfaVar2.c0(i272));
        linearLayout2.addView(numberTextView2, nme.m(1.0f, 0, -1, 18, 0, 0));
        nfaVar2.Q0.add(numberTextView2);
        if (!cf3.B(nfaVar2.m1)) {
        }
        nfaVar2.o0 = nfaVar2.F(context2, 101, R.drawable.msg_delete, k96.M0(2131751586, "Delete"));
        nfaVar2.K = new uda(nfaVar2, context2);
        nfaVar2.L = new hfa(nfaVar2, context2);
        nfaVar2.N = new afa(nfaVar2, context2, 1);
        nfaVar2.O = new afa(nfaVar2, context2, 2);
        nfaVar2.P = new afa(nfaVar2, context2, 4);
        nfaVar2.Q = new wea(nfaVar2, context2, nfaVar2.y1.getCurrentAccount(), nfaVar2.y1.getResourceProvider());
        nfaVar2.R = new dea(nfaVar2, context2);
        nfaVar2.j0 = new kea(nfaVar2, context2, 1);
        nfaVar2.k0 = new kea(nfaVar2, context2, 4);
        nfaVar2.l0 = new kea(nfaVar2, context2, 3);
        nfaVar2.m0 = new gea(nfaVar2, context2);
        nfaVar2.S = new bea(nfaVar2, context2);
        nfaVar2.T = new zda(nfaVar2, context2);
        nfaVar2.U = new yea(nfaVar2, context2);
        nfaVar2.V = new zea(nfaVar2, context2);
        if (!nfaVar2.s0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", nfaVar2.y1.getUserConfig().e());
            bundle2.putInt("chatMode", 3);
            vda vdaVar2 = new vda(nfaVar2, context2, nfaVar2.y1.getParentLayout(), bundle2);
            nfaVar2.W = vdaVar2;
            long j42 = nfaVar2.m1;
            tu1 tu1Var2 = vdaVar2.a;
            tu1Var2.s4 = j42;
            tu1Var2.nb = true;
            vdaVar2.setClipToOutline(true);
            vdaVar2.setOutlineProvider(new wda());
        }
        aea aeaVar2 = new aea(nfaVar2, context2);
        nfaVar2.d0 = aeaVar2;
        if (nfaVar2.G == 0) {
        }
        nfaVar2.f0 = new xda(nfaVar2, context2);
        nfaVar2.e0 = new is5(new yda(nfaVar2));
        nfaVar2.g0 = new kfa(nfaVar2, context2, false);
        nfaVar2.h0 = new jca(nfaVar2, context2);
        nfaVar2.i0 = new kfa(nfaVar2, context2, true);
        nfaVar2.M = new bfa(nfaVar2, context2);
        l0 = nfaVar2.l0();
        d dVar22 = nfaVar2.y1;
        if (!l0) {
        }
        kl0Var2 = kl0Var3;
        nfaVar2.setWillNotDraw(false);
        i10 = 0;
        i11 = -1;
        i12 = 0;
        while (true) {
            ieaVarArr = nfaVar2.n0;
            if (i12 >= ieaVarArr.length) {
            }
            iea ieaVar8222 = nfaVar2.n0[i12];
            ieaVar8222.w = new eda(nfaVar2, context2, ieaVar8222.s);
            nfaVar2.n0[i12].w.d(8, false);
            nfaVar2.n0[i12].w.setAnimateLayoutChange(true);
            iea ieaVar9222 = nfaVar2.n0[i12];
            ieaVar9222.addView(ieaVar9222.w, nme.c(-1.0f, -1));
            nfaVar2.n0[i12].w.setOnTouchListener(new jz1((byte) 25));
            nfaVar2.n0[i12].w.e(true, false);
            nfaVar2.n0[i12].w.d.setText(k96.M0(2131747975, "NoResult"));
            nfaVar2.n0[i12].w.f.setVisibility(8);
            nfaVar2.n0[i12].w.e.setText(k96.L0(2131745615));
            nfaVar2.n0[i12].w.f.setVisibility(8);
            iea ieaVar10222 = nfaVar2.n0[i12];
            ieaVar10222.w.addView(ieaVar10222.s, nme.d(-1, -1.0f, kk7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
            iea ieaVar11222 = nfaVar2.n0[i12];
            ieaVar11222.h.setEmptyView(ieaVar11222.w);
            nfaVar2.n0[i12].h.p1(0, true);
            iea[] ieaVarArr2222 = nfaVar2.n0;
            iea ieaVar12222 = ieaVarArr2222[i12];
            ieaVar12222.E = new cu6(ieaVar12222.h, ieaVarArr2222[i12].x);
            i12++;
            j2 = j;
            wjbVar2 = wjbVar;
            i10 = i13;
            i11 = i14;
        }
        view = nfaVar2.c0;
        if (view != null) {
        }
        uk1 uk1Var22 = new uk1(context2);
        nfaVar2.N0 = uk1Var22;
        uk1Var22.i0((int) (System.currentTimeMillis() / 1000), false, false);
        uk1Var22.setAlpha(0.0f);
        int i3022 = bkb.md;
        int i3122 = bkb.ae;
        uk1Var22.U0 = i3022;
        uk1Var22.V0 = i3122;
        uk1Var22.setTranslationY(-gl.L(48.0f));
        nfaVar2.addView(uk1Var22, nme.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        while (r4 < r2) {
        }
        if (nfaVar2.H()) {
        }
        nfaVar.N1(r14);
        nfaVar.z1(r14);
        nfaVar.B(r14, r14);
        if (nfaVar.a1[r14] >= 0) {
        }
        ocaVar = nfaVar.c0;
        if (ocaVar == null) {
        }
    }

    public static bi G(int i, long j, wjb wjbVar, Context context) {
        bi biVar = new bi(context, wjbVar);
        ImageView imageView = (ImageView) biVar.d;
        TextView textView = (TextView) biVar.c;
        if (i == 0) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131748004, null));
                return biVar;
            }
            textView.setText(k96.M0(2131748006, null));
            return biVar;
        }
        if (i == 1) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747965, null));
                return biVar;
            }
            textView.setText(k96.M0(2131747966, null));
            return biVar;
        }
        if (i == 2) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747960, null));
                return biVar;
            }
            textView.setText(k96.M0(2131747961, null));
            return biVar;
        }
        if (i == 3) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747962, null));
                return biVar;
            }
            textView.setText(k96.M0(2131747963, null));
            return biVar;
        }
        if (i == 4) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747967, null));
                return biVar;
            }
            textView.setText(k96.M0(2131747968, null));
            return biVar;
        }
        if (i == 5) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747964, null));
                return biVar;
            }
            textView.setText(k96.M0(2131748016, null));
            return biVar;
        }
        if (i == 6) {
            imageView.setImageDrawable(null);
            textView.setText(k96.M0(2131748014, null));
            return biVar;
        }
        if (i == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return biVar;
    }

    public static int Q(View view) {
        if (view instanceof qfa) {
            return ((qfa) view).getMessageId();
        }
        if (view instanceof iba) {
            return ((iba) view).getMessage().e1();
        }
        if (view instanceof eba) {
            return ((eba) view).getMessage().e1();
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
        if (hc2.b0(this.y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g2b getStoriesController() {
        return na7.q1(this.y1.getCurrentAccount()).M1();
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

    public static void m1(iea ieaVar, cfa[] cfaVarArr, boolean z) {
        t7a t7aVar;
        if (!z) {
            if (ieaVar.G == null || (t7aVar = ieaVar.H) == null) {
                return;
            }
            gl.r(t7aVar);
            ieaVar.H.run();
            ieaVar.H = null;
            ieaVar.G = null;
            return;
        }
        if (gba.r1 <= 0 || ieaVar.G != null || ieaVar.I || ieaVar.h.getFastScroll() == null || !ieaVar.h.getFastScroll().b0 || ieaVar.h.getFastScroll().getVisibility() != 0 || cfaVarArr[0].e() < 50) {
            return;
        }
        int i = gba.r1;
        int i2 = i - 1;
        if (i != i2) {
            gba.r1 = i2;
            org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", gba.r1).apply();
        }
        ieaVar.I = true;
        Context context = ieaVar.getContext();
        ar8 ar8Var = new ar8(context, (byte) 6);
        TextView textView = new TextView(context);
        tb4.u(14.0f, 2131745216, 1, textView, null);
        textView.setMaxLines(3);
        int i3 = bkb.fg;
        zkb.X(textView, i3, null);
        int L = gl.L(6.0f);
        int i4 = bkb.gg;
        ShapeDrawable b0 = bkb.b0(L, bkb.w0(null, i4, false));
        vkb M = zkb.M(i4);
        ar8Var.setBackground(b0);
        zkb.j(ar8Var, b0, M, null, null);
        ar8Var.addView(textView, nme.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        mba mbaVar = new mba(context);
        mbaVar.a = new Random();
        Paint paint = new Paint(1);
        mbaVar.b = paint;
        Paint paint2 = new Paint(1);
        mbaVar.c = paint2;
        mbaVar.f = 1.0f;
        mbaVar.h = 0.0f;
        paint.setColor(bm2.o(bkb.w0(null, i3, false), 76));
        paint2.setColor(bkb.w0(null, i3, false));
        Paint paint3 = new Paint();
        mbaVar.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, gl.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        mbaVar.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        ar8Var.addView(mbaVar, nme.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        ieaVar.G = ar8Var;
        ieaVar.addView(ar8Var, nme.c(-2.0f, -2));
        ieaVar.G.setAlpha(0.0f);
        ieaVar.G.setScaleX(0.8f);
        ieaVar.G.setScaleY(0.8f);
        ieaVar.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        ieaVar.invalidate();
        t7a t7aVar2 = new t7a((Object) ieaVar, (Object) ar8Var, (byte) 3);
        ieaVar.H = t7aVar2;
        gl.d3(t7aVar2, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z) {
        pha phaVar = this.I;
        if (phaVar != null) {
            phaVar.setEnabled(z);
        } else {
            this.H.setEnabled(z);
        }
    }

    private void setPageOverscan(hea heaVar) {
        if (!this.c2 || heaVar == null) {
            return;
        }
        heaVar.j3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) heaVar.getLayoutParams();
        if (marginLayoutParams != null) {
            int i = marginLayoutParams.topMargin;
            int i2 = -this.e2;
            if (i == i2 && marginLayoutParams.bottomMargin == (-this.f2)) {
                return;
            }
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.bottomMargin = -this.f2;
            heaVar.setLayoutParams(marginLayoutParams);
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
        kca kcaVar;
        float f;
        float f2;
        iea[] ieaVarArr = this.n0;
        int i = ieaVarArr[0].F;
        if (i == 13 && (kcaVar = this.a0) != null) {
            View currentView = kcaVar.n.getCurrentView();
            if (currentView instanceof gr0) {
                gr0 gr0Var = (gr0) currentView;
                br0 br0Var = gr0Var.w;
                yq0 yq0Var = gr0Var.f;
                if (gr0Var.a != null && gr0Var.getParent() != null) {
                    if (!gr0Var.b || gr0Var.L) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (gr0Var.M && !gr0Var.L && motionEvent.getPointerCount() == 2) {
                                gr0Var.Q = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                gr0Var.R = 1.0f;
                                gr0Var.O = motionEvent.getPointerId(0);
                                gr0Var.P = motionEvent.getPointerId(1);
                                yq0Var.J0(false);
                                yq0Var.cancelLongPress();
                                yq0Var.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) gr0Var.getParent();
                                gr0Var.V = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - gr0Var.getX());
                                int y = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - gr0Var.getY());
                                int i2 = gr0Var.V;
                                Rect rect = gr0Var.W;
                                gr0Var.T = -1;
                                int top = y - yq0Var.getTop();
                                for (int i3 = 0; i3 < yq0Var.getChildCount(); i3++) {
                                    View childAt = yq0Var.getChildAt(i3);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i2, top)) {
                                        gr0Var.T = RecyclerView.S(childAt);
                                        gr0Var.U = childAt.getTop();
                                    }
                                }
                                gr0Var.N = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) gr0Var.getParent()).getY()) - gr0Var.getY() > 0.0f) {
                                    gr0Var.M = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (gr0Var.L || gr0Var.N)) {
                            int i4 = -1;
                            int i5 = -1;
                            for (int i6 = 0; i6 < motionEvent.getPointerCount(); i6++) {
                                if (gr0Var.O == motionEvent.getPointerId(i6)) {
                                    i4 = i6;
                                }
                                if (gr0Var.P == motionEvent.getPointerId(i6)) {
                                    i5 = i6;
                                }
                            }
                            if (i4 == -1 || i5 == -1) {
                                gr0Var.M = false;
                                gr0Var.N = false;
                                gr0Var.L = false;
                                gr0Var.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i5) - motionEvent.getX(i4), motionEvent.getY(i5) - motionEvent.getY(i4))) / gr0Var.Q;
                            gr0Var.R = hypot;
                            if (!gr0Var.L && (hypot > 1.01f || hypot < 0.99f)) {
                                gr0Var.L = true;
                                boolean z = hypot > 1.0f;
                                gr0Var.S = z;
                                gr0Var.b(z);
                            }
                            if (gr0Var.L) {
                                boolean z2 = gr0Var.S;
                                float f3 = gr0Var.R;
                                if (z2) {
                                    if (f3 >= 1.0f) {
                                        f = tb4.x(2.0f, f3, 1.0f, 1.0f);
                                        f2 = Math.max(0.0f, Math.min(1.0f, f));
                                        gr0Var.c = f2;
                                    }
                                    gr0Var.c = 0.0f;
                                    f2 = 0.0f;
                                } else {
                                    if (f3 <= 1.0f) {
                                        f = (1.0f - f3) / 0.5f;
                                        f2 = Math.max(0.0f, Math.min(1.0f, f));
                                        gr0Var.c = f2;
                                    }
                                    gr0Var.c = 0.0f;
                                    f2 = 0.0f;
                                }
                                if (f2 == 1.0f) {
                                    int i7 = gr0Var.e;
                                    int ceil = (((int) Math.ceil(gr0Var.T / gr0Var.e)) * i7) + ((int) ((gr0Var.a0.H.C1 / (yq0Var.getMeasuredWidth() - ((int) (yq0Var.getMeasuredWidth() / gr0Var.e)))) * (i7 - 1)));
                                    if (ceil >= br0Var.b()) {
                                        ceil = br0Var.b() - 1;
                                    }
                                    gr0Var.T = ceil;
                                }
                                gr0Var.a();
                                if (gr0Var.c == 0.0f) {
                                    gr0Var.S = !gr0Var.S;
                                }
                                gr0Var.b(gr0Var.S);
                                gr0Var.Q = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                yq0Var.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((gr0Var.O == motionEvent.getPointerId(0) && gr0Var.P == motionEvent.getPointerId(1)) || (gr0Var.O == motionEvent.getPointerId(1) && gr0Var.P == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && gr0Var.L) {
                            gr0Var.N = false;
                            gr0Var.M = false;
                            gr0Var.L = false;
                            gr0Var.a();
                        }
                        return gr0Var.L;
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
                        ieaVarArr[0].h.J0(false);
                        ieaVarArr[0].h.cancelLongPress();
                        ieaVarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - ieaVarArr[0].getX());
                        int y2 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - ieaVarArr[0].getY());
                        int i8 = this.x;
                        this.s = -1;
                        int top2 = y2 - ieaVarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F) {
                            top2 = 0;
                        }
                        for (int i9 = 0; i9 < ieaVarArr[0].h.getChildCount(); i9++) {
                            View childAt2 = ieaVarArr[0].h.getChildAt(i9);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i8, top2)) {
                                ieaVarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.G1.X() && this.s == -1) {
                            this.s = (int) (((this.p1[j0(ieaVarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i8 / ieaVarArr[0].h.getMeasuredWidth(), 0.0f))) + ieaVarArr[0].x.K0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - ieaVarArr[0].getY() > this.d2) {
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
                            max = Math.max(0.0f, Math.min(1.0f, z4 ? tb4.x(2.0f, f4, 1.0f, 1.0f) : (1.0f - f4) / 0.5f));
                            this.q1 = max;
                        } else {
                            this.q1 = 0.0f;
                            max = 0.0f;
                        }
                        if (max == 1.0f || max == 0.0f) {
                            w39 v1 = j0(this.s1) ? v1(this.s1) : this.K;
                            if (this.q1 == 1.0f) {
                                int i13 = this.t1;
                                int ceil2 = (((int) Math.ceil(this.s / this.t1)) * i13) + ((int) ((this.C1 / (ieaVarArr[0].h.getMeasuredWidth() - ((int) (ieaVarArr[0].h.getMeasuredWidth() / this.t1)))) * (i13 - 1)));
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
                        ieaVarArr[0].h.invalidate();
                        iea ieaVar = ieaVarArr[0];
                        if (ieaVar.G != null) {
                            ieaVar.invalidate();
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
            gl.A3(f, a8Var, null);
        }
    }

    public final void B(boolean z, boolean z2) {
        if (this.I != null) {
            int closestTab = getClosestTab();
            boolean z3 = false;
            boolean z4 = this.q2 && !o0();
            r7 r7Var = this.q0;
            if (r7Var != null) {
                ((xha) r7Var).Y(z4 && q() && (p0(closestTab) || (closestTab == 11 && h0())), z);
            }
            xha xhaVar = this.J;
            if (xhaVar != null) {
                if (z4 && q() && !k0() && f0(closestTab)) {
                    z3 = true;
                }
                xhaVar.Y(z3, z2);
            }
        }
    }

    public final void B0(int i, TL_stories.StoryItem storyItem, String str) {
        t79 t79Var = new t79((Object) this, i, (Object) storyItem, (byte) 5);
        g2b storiesController = getStoriesController();
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.e0(i, this.m1, arrayList);
        u21.b0(this.y1).K(R.raw.chats_archived, gl.S2(k96.G(1, "StoryRemovedFromAlbumTitle", str)), k96.M0(2131743646, null), t79Var).j();
    }

    public final void B1() {
        if (this.I == null) {
            try {
                int c0 = c0(bkb.x8);
                int c02 = c0(bkb.y8);
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
                            bkb.F1(r7Var.getBackground(), c02, true);
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void C() {
        float abs;
        float measuredWidth;
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[0];
        if (ieaVar == null || ieaVarArr[1] == null) {
            return;
        }
        float f = 0.0f;
        oca ocaVar = this.c0;
        if (ocaVar != null) {
            char c = (!j0(ieaVar.F) || ieaVarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c == (ieaVarArr[1].getVisibility() == 0 ? (!j0(ieaVarArr[1].F) || ieaVarArr[1].F == 9) ? (char) 0 : (char) 1 : c)) {
                if (c != 0) {
                    measuredWidth = 0.0f;
                    abs = 1.0f;
                } else {
                    measuredWidth = ieaVarArr[0].getMeasuredWidth();
                    abs = 0.0f;
                }
                ocaVar.setTranslationX(measuredWidth);
            } else {
                ocaVar.setTranslationX(ieaVarArr[c ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(ocaVar.getTranslationX()) / ocaVar.getMeasuredWidth());
            }
            float f2 = 0.0f;
            for (int i = 0; i < ieaVarArr.length; i++) {
                if (ieaVarArr[i].getVisibility() == 0) {
                    sca scaVar = ieaVarArr[i].h;
                    View childAt = scaVar.getChildCount() == 0 ? null : scaVar.getChildAt(0);
                    f2 += Utilities.l(1.0f - (ieaVarArr[i].getTranslationX() / ieaVarArr[i].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - scaVar.getPaddingTop() : scaVar.getChildCount() == 0 ? 0.0f : -gl.L(48.0f));
                }
            }
            float l = Utilities.l(1.0f - ((-f2) / gl.N(48.0f)));
            float R1 = gl.R1(0.9f, 1.0f, l);
            ocaVar.setAlpha(l);
            ocaVar.setScaleX(R1);
            ocaVar.setScaleY(R1);
            ocaVar.setTranslationY(this.O1 + f2);
            f = abs;
        }
        fj3 fj3Var = this.S0;
        if (fj3Var != null) {
            fj3Var.setTranslationY(this.O1);
        }
        if (this.Y1 != f) {
            this.Y1 = f;
            invalidate();
        }
    }

    public final /* synthetic */ void C0(TL_stories.StoryItem storyItem) {
        getStoriesController().r0(this.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        u21.b0(this.y1).G(R.raw.chats_archived, 5000, k96.G(1, "StoryArchived", new Object[0])).j();
    }

    public final void C1() {
        if (n0()) {
            post(new oba(this, (byte) 13));
            return;
        }
        uda udaVar = this.K;
        if (udaVar != null) {
            udaVar.f();
        }
        afa afaVar = this.N;
        if (afaVar != null) {
            afaVar.f();
        }
        afa afaVar2 = this.O;
        if (afaVar2 != null) {
            afaVar2.f();
        }
        bfa bfaVar = this.M;
        if (bfaVar != null) {
            bfaVar.X(false);
        }
        afa afaVar3 = this.P;
        if (afaVar3 != null) {
            afaVar3.f();
        }
        wea weaVar = this.Q;
        if (weaVar != null) {
            weaVar.f();
        }
        dea deaVar = this.R;
        if (deaVar != null) {
            deaVar.f();
        }
        xda xdaVar = this.f0;
        if (xdaVar != null) {
            xdaVar.f();
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ((mfa) it.next()).c.f();
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
        iea[] ieaVarArr = this.n0;
        if (!z) {
            if (Math.abs(ieaVarArr[1].getTranslationX()) < 1.0f) {
                ieaVarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.k1 ? -1 : 1));
                ieaVarArr[1].setTranslationX(0.0f);
                animatorSet = this.i1;
                if (animatorSet != null) {
                }
                this.j1 = false;
            }
            T0(getTabProgress());
            return this.j1;
        }
        if (Math.abs(ieaVarArr[0].getTranslationX()) < 1.0f) {
            ieaVarArr[0].setTranslationX(0.0f);
            ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth() * (this.k1 ? 1 : -1));
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

    public final void D1(iea ieaVar, boolean z) {
        boolean z2 = ieaVar.b && this.d;
        v29 fastScroll = ieaVar.h.getFastScroll();
        ObjectAnimator objectAnimator = ieaVar.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ieaVar.c.cancel();
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<v29, Float>) property, fastScroll.getAlpha(), 0.0f);
                ofFloat.addListener(new id4(fastScroll));
                ieaVar.c = ofFloat;
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
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<v29, Float>) property, fastScroll.getAlpha(), 1.0f);
            ieaVar.c = ofFloat2;
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
        kca kcaVar = this.a0;
        if (kcaVar != null) {
            kcaVar.h();
            kcaVar.j();
        }
        l1(false);
        J1(z);
        yea yeaVar = this.U;
        if (yeaVar != null) {
            yeaVar.x.clear();
        }
        return true;
    }

    public final void E0(int i, long j) {
        u1b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        z1b z1bVar = (z1b) A.h.remove(c);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = na7.q1(i2).h1(A.b);
        tL_deleteAlbum.album_id = z1bVar.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_deleteAlbum, null);
        A.f(true);
    }

    public final void E1() {
        r7 r7Var = this.w0;
        if (r7Var != null) {
            boolean z = this.y1.getMessagesController().z2(this.m1) || e0();
            r7Var.setAlpha(z ? 0.5f : 1.0f);
            if (z) {
                if (r7Var.getBackground() != null) {
                    r7Var.setBackground(null);
                }
            } else if (r7Var.getBackground() == null) {
                int i = bkb.y8;
                ff0 f0 = bkb.f0(c0(i), 5, -1);
                vkb M = zkb.M(i);
                r7Var.setBackground(f0);
                zkb.j(r7Var, f0, null, M, this.I1);
            }
        }
    }

    public final r7 F(Context context, int i, int i2, String str) {
        r7 r7Var;
        pha phaVar = this.I;
        if (phaVar != null) {
            r7Var = phaVar.q().a(i, i2);
        } else {
            int i3 = bkb.y8;
            int c0 = c0(i3);
            int i4 = bkb.x8;
            r7 r7Var2 = new r7(context, null, c0, c0(i4), false, null);
            r7Var2.setIcon(i2);
            r7Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(r7Var2, new LinearLayout.LayoutParams(gl.L(54.0f), -1));
            this.Q0.add(r7Var2);
            ry8 iconView = r7Var2.getIconView();
            wjb wjbVar = this.I1;
            if (iconView != null) {
                zkb.s(r7Var2.getIconView(), i4, wjbVar, PorterDuff.Mode.SRC_IN);
            }
            if (r7Var2.getBackground() != null) {
                Drawable background = r7Var2.getBackground();
                vkb M = zkb.M(i3);
                r7Var2.setBackground(background);
                zkb.j(r7Var2, background, null, M, wjbVar);
            }
            r7Var = r7Var2;
        }
        r7Var.setContentDescription(str);
        r7Var.setOnClickListener(new hb(this, i, (byte) 7));
        return r7Var;
    }

    public final void F0(int i, String str, long j) {
        u1b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        ((z1b) A.h.get(c)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = na7.q1(i2).h1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        A.f(true);
    }

    public final void F1() {
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            int L = gl.L(48.0f) + this.d2;
            fj3 fj3Var = this.S0;
            lcaVar.setPaddingTop(L + (fj3Var != null ? (int) fj3Var.c(gl.L(7.0f)) : 0));
        }
    }

    public final void G0(boolean z) {
        long j = this.G;
        if (j != 0 || q0()) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            int i2 = t2[i];
            cfa[] cfaVarArr = this.w1;
            if (cfaVarArr[i2].h && !z) {
                return;
            }
            long j2 = this.m1;
            if (cf3.B(j2)) {
                return;
            }
            cfaVarArr[i2].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            byte b = 2;
            if (i2 == 0) {
                byte b2 = cfaVarArr[i2].q;
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
            tL_messages_getSearchResultsPositions.peer = dVar.getMessagesController().h1(j2);
            if (j != 0 && dVar.getUserConfig().e() == j2) {
                tL_messages_getSearchResultsPositions.flags |= 4;
                tL_messages_getSearchResultsPositions.saved_peer_id = dVar.getMessagesController().h1(j);
            }
            ConnectionsManager.getInstance(dVar.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(dVar.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new fl6(this, cfaVarArr[i2].p, i2, b)), dVar.getClassGuid());
        }
    }

    public final void G1(boolean z) {
        lca lcaVar;
        oca ocaVar;
        B(true, true);
        ry8 ry8Var = this.v0;
        if (ry8Var == null) {
            return;
        }
        float f = 0.0f;
        if (!this.Y0 && (((lcaVar = this.b0) == null || !lcaVar.g()) && ((ocaVar = this.c0) == null || !ocaVar.f))) {
            f = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        ry8Var.setAlpha(f);
        if (z) {
            j(U(1.0f) > 0.5f);
        } else if (this.A0 == 2) {
            j(this.s0 > 0.1f);
        } else {
            j(this.r0 < 0.1f);
        }
    }

    public boolean H() {
        return this instanceof qc5;
    }

    public final void H0(int i) {
        int i2;
        int i3 = 2;
        cfa[] cfaVarArr = this.w1;
        if (i == 0) {
            byte b = cfaVarArr[0].q;
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
        cfaVarArr[i].g = true;
        d dVar = this.y1;
        dVar.getMediaDataController().P0(this.m1, 50, 0, cfaVarArr[i].k, i2, this.G, 1, dVar.getClassGuid(), cfaVarArr[i].p, null, null);
    }

    public final void H1(iea ieaVar) {
        boolean c1 = ieaVar.h.c1();
        if (c1) {
            ieaVar.h.setSectionsDrawBackground(this.c2);
        }
        ieaVar.setDrawPageBackground((!this.c2 || c1 || ieaVar.F == 15) ? false : true);
        if (ieaVar.F != 15) {
            ieaVar.setClipToOutline(false);
            ieaVar.setBackground(null);
            ieaVar.setWallpaper(null);
            return;
        }
        Drawable drawable = ieaVar.P;
        if (drawable == null) {
            drawable = ieaVar.getBackground();
        }
        Drawable d = zi8.d(drawable, this.y1.getCurrentAccount(), this.m1, bkb.I.o());
        if (this.c2) {
            ieaVar.setBackground(null);
            ieaVar.setClipToOutline(false);
            ieaVar.setWallpaper(d);
        } else {
            ieaVar.setWallpaper(null);
            ieaVar.setBackground(d);
            ieaVar.setOutlineProvider(new xi((byte) 18));
            ieaVar.setClipToOutline(true);
        }
    }

    public final boolean I(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x = (-view.getX()) - getX();
        iea[] ieaVarArr = this.n0;
        motionEvent.offsetLocation(x - ieaVarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - ieaVarArr[0].getY()) - ieaVarArr[0].h.getFastScroll().getY());
        return ieaVarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public int I0() {
        return 0;
    }

    public final void I1(iea ieaVar) {
        int i = ieaVar.F;
        boolean z = i == 0 || j0(i);
        float f = z ? 0.0f : 12.0f;
        float f2 = (z ? 8 : 12) + 48;
        float f3 = z ? 0.0f : 12.0f;
        FrameLayout.LayoutParams d = nme.d(-1, -1.0f, kk7.D1, f, f2, f3, f3);
        d.topMargin = X(ieaVar.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = ieaVar.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        ieaVar.s.setLayoutParams(d);
    }

    public final boolean J(int i) {
        cfa[] cfaVarArr = this.x1.n;
        if (cfaVarArr == null) {
            return false;
        }
        cfa[] cfaVarArr2 = this.w1;
        if (i == 0) {
            cfa cfaVar = cfaVarArr2[i];
            if (!cfaVar.h) {
                int[] iArr = cfaVar.f;
                int[] iArr2 = cfaVarArr[i].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = cfaVarArr2[i].f;
            int[] iArr4 = cfaVarArr[i].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        cfaVarArr2[i].a.addAll(cfaVarArr[i].a);
        cfaVarArr2[i].c.addAll(cfaVarArr[i].c);
        for (Map.Entry entry : cfaVarArr[i].d.entrySet()) {
            cfaVarArr2[i].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            cfaVarArr2[i].b[i2] = cfaVarArr[i].b[i2].clone();
            cfa cfaVar2 = cfaVarArr2[i];
            int[] iArr5 = cfaVar2.j;
            cfa cfaVar3 = cfaVarArr[i];
            iArr5[i2] = cfaVar3.j[i2];
            cfaVar2.i[i2] = cfaVar3.i[i2];
        }
        cfaVarArr2[i].e.addAll(cfaVarArr[i].e);
        return !cfaVarArr[i].a.isEmpty();
    }

    public final void J1(boolean z) {
        int i = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                return;
            }
            int childCount = ieaVarArr[i].h.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ieaVarArr[i].h.getChildAt(i2);
                if (childAt instanceof iba) {
                    ((iba) childAt).b(false, z);
                } else if (childAt instanceof qfa) {
                    ((qfa) childAt).i(false, z);
                } else if (childAt instanceof lba) {
                    ((lba) childAt).f(false, z);
                } else if (childAt instanceof eba) {
                    ((eba) childAt).e(false, z);
                } else if (childAt instanceof bw2) {
                    ((bw2) childAt).c(false, z);
                } else if (childAt instanceof ue3) {
                    ((ue3) childAt).e0(false, z);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0390, code lost:
    
        if (r3.l != false) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(int i, mea meaVar) {
        String str;
        mea meaVar2;
        mea meaVar3;
        y1b y1bVar;
        TLRPC.Chat K0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        kca kcaVar;
        char c;
        byte b;
        int i2;
        a8 a8Var;
        mea meaVar4;
        a8 a8Var2;
        a8 a8Var3;
        mfa u1;
        boolean j0 = j0(i);
        d dVar = this.y1;
        int currentAccount = dVar.getCurrentAccount();
        na7 q1 = na7.q1(currentAccount);
        long j = this.m1;
        TLRPC.User V1 = q1.V1(Long.valueOf(j));
        boolean h = getStoriesController().h(j);
        byte b2 = 3;
        byte b3 = 4;
        final byte b4 = 1;
        if (t0(i) && h && (u1 = u1(i)) != null) {
            int i3 = u1.b;
            meaVar.g0(R.drawable.menu_add_stories, new sba(this, i3, b4), k96.M0(2131744561, null), false, true);
            g(meaVar, dVar, this.m1, i3);
            meaVar.g0(R.drawable.tabs_reorder, new sba(this, i3, b2), k96.M0(2131744553, null), false, true);
            meaVar.g0(R.drawable.msg_delete, new sba(this, i3, b3), k96.M0(2131744559, null), true, true);
            meaVar.J();
            h(meaVar);
            return true;
        }
        byte b5 = 5;
        final byte b6 = 0;
        if (i == 14) {
            lca lcaVar = this.b0;
            if (lcaVar != null) {
                pq8 currentPage = lcaVar.getCurrentPage();
                xsa xsaVar = currentPage == null ? null : currentPage.e;
                if (xsaVar != null) {
                    long j2 = lcaVar.c;
                    int i4 = lcaVar.b;
                    boolean w = j2 == y6c.h(i4).e() ? true : j2 >= 0 ? false : hc2.w(5, na7.q1(i4).K0(Long.valueOf(-j2)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (xsaVar.c) {
                        c = 0;
                        b = 11;
                        i2 = 2;
                        a8Var = null;
                    } else {
                        String M0 = k96.M0(2131750181, null);
                        t7a t7aVar = new t7a(xsaVar, runnableArr, b3);
                        b = 11;
                        i2 = 2;
                        c = 0;
                        a8Var = meaVar.g0(R.drawable.menu_sort_value, t7aVar, M0, false, false);
                        b6 = 1;
                    }
                    if (lcaVar.b()) {
                        meaVar.g0(R.drawable.menu_folder_add, new oba(this, b), k96.M0(2131750082, null), false, true);
                        b6 = 1;
                    }
                    if (lcaVar.e.h()) {
                        if (!xsaVar.i().isEmpty() || currentPage.d) {
                            meaVar.g0(R.drawable.tabs_reorder, new oba(this, (byte) 12), k96.M0(2131750017, null), false, true);
                            meaVar4 = meaVar;
                        } else {
                            meaVar4 = meaVar;
                        }
                        b6 = 1;
                    } else {
                        meaVar4 = meaVar;
                    }
                    if (b6 != 0) {
                        meaVar4.J();
                    }
                    a8 L = meaVar4.L(k96.M0(2131750179, null));
                    a8 L2 = meaVar4.L(k96.M0(2131750183, null));
                    a8 L3 = meaVar4.L(k96.M0(2131750178, null));
                    a8 L4 = meaVar4.L(k96.M0(2131750180, null));
                    if (w) {
                        meaVar4.J();
                        a8Var2 = meaVar4.L(k96.M0(2131750185, null));
                        a8Var3 = meaVar4.L(k96.M0(2131750184, null));
                    } else {
                        a8Var2 = null;
                        a8Var3 = null;
                    }
                    xsa xsaVar2 = xsaVar;
                    ly9 ly9Var = new ly9(a8Var, xsaVar2, L, L2, L3, L4, w, a8Var2, a8Var3);
                    a8 a8Var4 = a8Var2;
                    a8 a8Var5 = a8Var3;
                    runnableArr[c] = ly9Var;
                    ly9Var.run();
                    tq8.j(L, xsaVar2, runnableArr[c], 1);
                    tq8.j(L2, xsaVar2, runnableArr[c], i2);
                    tq8.j(L3, xsaVar2, runnableArr[c], 4);
                    tq8.j(L4, xsaVar2, runnableArr[c], 8);
                    if (w) {
                        tq8.j(a8Var4, xsaVar2, runnableArr[c], 256);
                        tq8.j(a8Var5, xsaVar2, runnableArr[c], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        byte b7 = 8;
        if (i == 13 && V1 != null && V1.bot && V1.bot_has_main_app && V1.bot_can_edit && (kcaVar = this.a0) != null) {
            int itemsCount = kcaVar.getItemsCount();
            if (itemsCount < dVar.getMessagesController().k4.s2.f()) {
                meaVar.g0(R.drawable.msg_addbot, new oba(this, (byte) 4), k96.M0(2131746524, null), false, true);
            }
            if (itemsCount > 1 && !kcaVar.d()) {
                meaVar.g0(R.drawable.tabs_reorder, new oba(this, b5), k96.M0(2131746497, null), false, true);
            }
            if (itemsCount > 0) {
                meaVar.g0(R.drawable.msg_select, new oba(this, (byte) 6), k96.M0(kcaVar.d() ? 2131746495 : 2131746496, null), false, true);
            }
            if (!TextUtils.isEmpty(kcaVar.getCurrentLang())) {
                meaVar.g0(R.drawable.msg_delete, new oba(this, (byte) 7), k96.a0(null, null, 2131746498, rzb.J0(kcaVar.getCurrentLang(), null, null)), true, true);
                return true;
            }
        } else {
            if (i == 11) {
                meaVar.g0(R.drawable.msg_discussion, new oba(this, b7), k96.M0(2131745672, null), false, true);
                meaVar.J();
                meaVar.g0(R.drawable.msg_home, new oba(this, (byte) 9), k96.M0(2131754387, null), false, true);
                meaVar.g0(R.drawable.msg_delete, new oba(this, (byte) 10), k96.M0(2131751578, null), false, true);
                return true;
            }
            if ((i == 8 || t0(i)) && h) {
                str = null;
                meaVar2 = meaVar;
                meaVar2.g0(R.drawable.menu_album_add, new oba(this, (byte) 2), k96.M0(2131744570, null), false, true);
                meaVar2.J();
            } else {
                meaVar2 = meaVar;
                str = null;
            }
            h(meaVar2);
            if (!cf3.B(j) && (V1 == null || !V1.bot)) {
                meaVar2.g0(R.drawable.msg_calendar2, new sba(this, i, (byte) 2), k96.M0(2131752630, str), false, true);
                if (this.g1 == null || s0() || (K0 = na7.q1(currentAccount).K0(Long.valueOf(this.g1.id))) == null || (tL_chatAdminRights = K0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                    meaVar3 = meaVar;
                } else {
                    meaVar3 = meaVar;
                    meaVar3.g0(R.drawable.msg_archive, new oba(this, (byte) 3), k96.M0(2131747617, str), false, true);
                }
                cfa[] cfaVarArr = this.w1;
                if (!j0) {
                    cfa cfaVar = cfaVarArr[0];
                    if (!cfaVar.w || !cfaVar.v) {
                        boolean[] zArr = cfaVar.i;
                        if (zArr[0]) {
                            if (zArr[1]) {
                            }
                        }
                    }
                }
                meaVar3.J();
                final a8 L5 = meaVar3.L(k96.M0(2131748461, str));
                final a8 L6 = meaVar3.L(k96.M0(2131748460, str));
                if (j0) {
                    final kfa v1 = v1(i);
                    if (v1 != null && (y1bVar = v1.s) != null) {
                        L5.setChecked(y1bVar.n);
                        L6.setChecked(v1.s.o);
                    }
                    final byte b8 = 0;
                    L5.setOnClickListener(new View.OnClickListener(this) { // from class: xba
                        public final /* synthetic */ nfa b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b9 = b8;
                            final kfa kfaVar = v1;
                            final a8 a8Var6 = L6;
                            final a8 a8Var7 = L5;
                            nfa nfaVar = this.b;
                            switch (b9) {
                                case 0:
                                    final byte b10 = 1;
                                    nfaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: zba
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            y1b y1bVar2;
                                            y1b y1bVar3;
                                            byte b11 = b10;
                                            a8 a8Var8 = a8Var6;
                                            a8 a8Var9 = a8Var7;
                                            kfa kfaVar2 = kfaVar;
                                            switch (b11) {
                                                case 0:
                                                    if (kfaVar2 != null && (y1bVar2 = kfaVar2.s) != null) {
                                                        boolean z = a8Var9.getCheckView().a.q;
                                                        boolean z2 = a8Var8.getCheckView().a.q;
                                                        y1bVar2.n = z;
                                                        y1bVar2.o = z2;
                                                        y1bVar2.d(true);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (kfaVar2 != null && (y1bVar3 = kfaVar2.s) != null) {
                                                        boolean z3 = a8Var9.getCheckView().a.q;
                                                        boolean z4 = a8Var8.getCheckView().a.q;
                                                        y1bVar3.n = z3;
                                                        y1bVar3.o = z4;
                                                        y1bVar3.d(true);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b11 = 0;
                                    nfaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: zba
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            y1b y1bVar2;
                                            y1b y1bVar3;
                                            byte b112 = b11;
                                            a8 a8Var8 = a8Var7;
                                            a8 a8Var9 = a8Var6;
                                            kfa kfaVar2 = kfaVar;
                                            switch (b112) {
                                                case 0:
                                                    if (kfaVar2 != null && (y1bVar2 = kfaVar2.s) != null) {
                                                        boolean z = a8Var9.getCheckView().a.q;
                                                        boolean z2 = a8Var8.getCheckView().a.q;
                                                        y1bVar2.n = z;
                                                        y1bVar2.o = z2;
                                                        y1bVar2.d(true);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (kfaVar2 != null && (y1bVar3 = kfaVar2.s) != null) {
                                                        boolean z3 = a8Var9.getCheckView().a.q;
                                                        boolean z4 = a8Var8.getCheckView().a.q;
                                                        y1bVar3.n = z3;
                                                        y1bVar3.o = z4;
                                                        y1bVar3.d(true);
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
                    L6.setOnClickListener(new View.OnClickListener(this) { // from class: xba
                        public final /* synthetic */ nfa b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b92 = b9;
                            final kfa kfaVar = v1;
                            final a8 a8Var6 = L5;
                            final a8 a8Var7 = L6;
                            nfa nfaVar = this.b;
                            switch (b92) {
                                case 0:
                                    final byte b10 = 1;
                                    nfaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: zba
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            y1b y1bVar2;
                                            y1b y1bVar3;
                                            byte b112 = b10;
                                            a8 a8Var8 = a8Var6;
                                            a8 a8Var9 = a8Var7;
                                            kfa kfaVar2 = kfaVar;
                                            switch (b112) {
                                                case 0:
                                                    if (kfaVar2 != null && (y1bVar2 = kfaVar2.s) != null) {
                                                        boolean z = a8Var9.getCheckView().a.q;
                                                        boolean z2 = a8Var8.getCheckView().a.q;
                                                        y1bVar2.n = z;
                                                        y1bVar2.o = z2;
                                                        y1bVar2.d(true);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (kfaVar2 != null && (y1bVar3 = kfaVar2.s) != null) {
                                                        boolean z3 = a8Var9.getCheckView().a.q;
                                                        boolean z4 = a8Var8.getCheckView().a.q;
                                                        y1bVar3.n = z3;
                                                        y1bVar3.o = z4;
                                                        y1bVar3.d(true);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b11 = 0;
                                    nfaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: zba
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            y1b y1bVar2;
                                            y1b y1bVar3;
                                            byte b112 = b11;
                                            a8 a8Var8 = a8Var7;
                                            a8 a8Var9 = a8Var6;
                                            kfa kfaVar2 = kfaVar;
                                            switch (b112) {
                                                case 0:
                                                    if (kfaVar2 != null && (y1bVar2 = kfaVar2.s) != null) {
                                                        boolean z = a8Var9.getCheckView().a.q;
                                                        boolean z2 = a8Var8.getCheckView().a.q;
                                                        y1bVar2.n = z;
                                                        y1bVar2.o = z2;
                                                        y1bVar2.d(true);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (kfaVar2 != null && (y1bVar3 = kfaVar2.s) != null) {
                                                        boolean z3 = a8Var9.getCheckView().a.q;
                                                        boolean z4 = a8Var8.getCheckView().a.q;
                                                        y1bVar3.n = z3;
                                                        y1bVar3.o = z4;
                                                        y1bVar3.d(true);
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
                byte b10 = cfaVarArr[0].q;
                L5.setChecked(b10 == 0 || b10 == 1);
                byte b11 = cfaVarArr[0].q;
                L6.setChecked(b11 == 0 || b11 == 2);
                L5.setOnClickListener(new View.OnClickListener(this) { // from class: yba
                    public final /* synthetic */ nfa b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b12 = b6;
                        final a8 a8Var6 = L6;
                        final a8 a8Var7 = L5;
                        final nfa nfaVar = this.b;
                        switch (b12) {
                            case 0:
                                final byte b13 = 1;
                                nfaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: bca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b14 = b13;
                                        a8 a8Var8 = a8Var6;
                                        a8 a8Var9 = a8Var7;
                                        nfa nfaVar2 = nfaVar;
                                        switch (b14) {
                                            case 0:
                                                nfaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                nfaVar2.x();
                                                break;
                                            default:
                                                nfaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                nfaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b14 = 0;
                                nfaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: bca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b142 = b14;
                                        a8 a8Var8 = a8Var7;
                                        a8 a8Var9 = a8Var6;
                                        nfa nfaVar2 = nfaVar;
                                        switch (b142) {
                                            case 0:
                                                nfaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                nfaVar2.x();
                                                break;
                                            default:
                                                nfaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                nfaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                L6.setOnClickListener(new View.OnClickListener(this) { // from class: yba
                    public final /* synthetic */ nfa b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b12 = b4;
                        final a8 a8Var6 = L5;
                        final a8 a8Var7 = L6;
                        final nfa nfaVar = this.b;
                        switch (b12) {
                            case 0:
                                final byte b13 = 1;
                                nfaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: bca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b142 = b13;
                                        a8 a8Var8 = a8Var6;
                                        a8 a8Var9 = a8Var7;
                                        nfa nfaVar2 = nfaVar;
                                        switch (b142) {
                                            case 0:
                                                nfaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                nfaVar2.x();
                                                break;
                                            default:
                                                nfaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                nfaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b14 = 0;
                                nfaVar.A1(a8Var7, a8Var6, new Runnable() { // from class: bca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b142 = b14;
                                        a8 a8Var8 = a8Var7;
                                        a8 a8Var9 = a8Var6;
                                        nfa nfaVar2 = nfaVar;
                                        switch (b142) {
                                            case 0:
                                                nfaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                nfaVar2.x();
                                                break;
                                            default:
                                                nfaVar2.w1[0].q = (a8Var9.getCheckView().a.q && a8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                nfaVar2.x();
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
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[1];
        float f2 = 0.0f;
        if (ieaVar != null && ieaVar.F == 11) {
            f2 = 0.0f + f;
        }
        iea ieaVar2 = ieaVarArr[0];
        if (ieaVar2 != null && ieaVar2.F == 11) {
            f2 += 1.0f - f;
        }
        r7Var.setAlpha(f2);
        float f3 = (0.15f * f2) + 0.85f;
        r7Var.setScaleX(f3);
        r7Var.setScaleY(f3);
        r7Var.setVisibility(f2 <= 0.01f ? 8 : 0);
    }

    public final void L(int i, o39 o39Var, boolean z) {
        nea neaVar;
        ArrayList arrayList = this.w1[i].e;
        int K0 = ((t26) o39Var.getLayoutManager()).K0();
        if (K0 >= 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    neaVar = null;
                    break;
                } else {
                    if (K0 <= ((nea) arrayList.get(i2)).b) {
                        neaVar = (nea) arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (neaVar == null) {
                neaVar = (nea) b00.f(1, arrayList);
            }
            if (neaVar != null) {
                v0(i, neaVar.d, neaVar.b + 1, z);
            }
        }
    }

    public final void L0() {
        y1b y1bVar;
        y1b y1bVar2;
        this.K1.a();
        xda xdaVar = this.f0;
        if (xdaVar != null && (y1bVar2 = xdaVar.s) != null && y1bVar2 != null) {
            y1bVar2.z(xdaVar.w);
        }
        jca jcaVar = this.h0;
        if (jcaVar != null && (y1bVar = jcaVar.s) != null && y1bVar != null) {
            y1bVar.z(jcaVar.w);
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            lfa lfaVar = ((mfa) it.next()).c;
            y1b y1bVar3 = lfaVar.s;
            if (y1bVar3 != null && y1bVar3 != null) {
                y1bVar3.z(lfaVar.w);
            }
        }
    }

    public final void L1() {
        r7 r7Var = this.p0;
        if (r7Var == null) {
            return;
        }
        iea ieaVar = this.n0[1];
        boolean z = ieaVar != null && ieaVar.F == 11;
        if (z) {
            r7Var.setVisibility(0);
        }
        r7Var.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.85f).scaleY(z ? 1.0f : 0.85f).withEndAction(new k08((byte) 12, (Object) this, z)).setDuration(420L).setInterpolator(s33.h).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M() {
        iea[] ieaVarArr;
        iea ieaVar;
        int i;
        w39 adapter;
        if (this.r1) {
            Object[] objArr = 0;
            int i2 = 0;
            while (true) {
                ieaVarArr = this.n0;
                if (i2 >= ieaVarArr.length) {
                    ieaVar = null;
                    break;
                }
                ieaVar = ieaVarArr[i2];
                if (ieaVar.F == this.s1) {
                    break;
                } else {
                    i2++;
                }
            }
            if (ieaVar != null) {
                boolean j0 = j0(ieaVar.F);
                float f = this.q1;
                cfa[] cfaVarArr = this.w1;
                if (f != 1.0f) {
                    if (f == 0.0f) {
                        this.r1 = false;
                        if (this.s1 == 0) {
                            cfaVarArr[0].g(false);
                        }
                        ieaVar.n.setVisibility(8);
                        ieaVar.h.invalidate();
                        return;
                    }
                    boolean z = f > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new jda(this, ieaVar, objArr == true ? 1 : 0));
                    ofFloat.addListener(new rp1(this, z, j0 ? 1 : 0, ieaVar));
                    ofFloat.setInterpolator(s33.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.r1 = false;
                int i3 = this.t1;
                int[] iArr = this.p1;
                iArr[j0 ? 1 : 0] = i3;
                if (!j0) {
                    gba.A(i3);
                } else if (W(ieaVar.F) >= 5) {
                    gba.E(this.t1);
                }
                for (int i4 = 0; i4 < ieaVarArr.length; i4++) {
                    iea ieaVar2 = ieaVarArr[i4];
                    if (ieaVar2 != null && ieaVar2.h != null && (((i = ieaVar2.F) == 0 || j0(i)) && (adapter = ieaVarArr[i4].h.getAdapter()) != null)) {
                        int b = adapter.b();
                        if (i4 == 0) {
                            cfaVarArr[0].g(false);
                        }
                        ieaVarArr[i4].n.setVisibility(8);
                        ieaVarArr[i4].x.x1(iArr[j0 ? 1 : 0]);
                        ieaVarArr[i4].h.b0();
                        ieaVarArr[i4].h.invalidate();
                        if (adapter.b() == b) {
                            gl.V3(ieaVarArr[i4].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    e1();
                    return;
                }
                for (int i5 = 0; i5 < ieaVarArr.length; i5++) {
                    iea ieaVar3 = ieaVarArr[i5];
                    if (ieaVar3.F == this.s1) {
                        View m = ieaVar3.r.m(this.s);
                        if (m != null) {
                            this.w = m.getTop();
                        }
                        iea ieaVar4 = ieaVarArr[i5];
                        ieaVar4.x.g1(this.s, (-ieaVar4.h.getPaddingTop()) + this.w);
                    }
                }
            }
        }
    }

    public final void M0(int i, View view, k27 k27Var, int i2) {
        String str;
        if (k27Var == null || this.r1) {
            return;
        }
        oca ocaVar = this.c0;
        if (ocaVar == null || !ocaVar.f) {
            int i3 = 0;
            i3 = 0;
            if (this.F1) {
                int i4 = 8;
                if (i2 == 8 && !p()) {
                    return;
                }
                char c = k27.B0(k27Var.k) == this.m1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.c1;
                if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                    sparseArrayArr[c].remove(k27Var.e1());
                    if (!k27Var.s(null, false)) {
                        this.d1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c].put(k27Var.e1(), k27Var);
                    if (!k27Var.s(null, false)) {
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
                if (view instanceof iba) {
                    ((iba) view).b(sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0, true);
                } else if (view instanceof rfa) {
                    ((rfa) view).b(0, sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0, true);
                } else if (view instanceof lba) {
                    ((lba) view).f(sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0, true);
                } else if (view instanceof eba) {
                    ((eba) view).e(sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0, true);
                } else if (view instanceof bw2) {
                    ((bw2) view).c(sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0, true);
                } else if (view instanceof qfa) {
                    ((qfa) view).i(sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0, true);
                }
            } else {
                uca ucaVar = this.u1;
                cfa[] cfaVarArr = this.w1;
                d dVar = this.y1;
                if (i2 == 0) {
                    cfa cfaVar = cfaVarArr[i2];
                    int i5 = i - cfaVar.m;
                    if (i5 >= 0 && i5 < cfaVar.a.size()) {
                        PhotoViewer.r0().T1(null, dVar, null);
                        PhotoViewer.r0().j1(cfaVarArr[i2].a, i5, this.m1, this.f1, this.G, ucaVar);
                    }
                } else if (i2 == 2 || i2 == 4) {
                    if (view instanceof eba) {
                        ((eba) view).a();
                    }
                } else if (i2 == 5) {
                    PhotoViewer.r0().T1(null, dVar, null);
                    int indexOf = cfaVarArr[i2].a.indexOf(k27Var);
                    if (indexOf < 0) {
                        PhotoViewer.r0().j1(tb4.t(k27Var), 0, 0L, 0L, 0L, ucaVar);
                    } else {
                        PhotoViewer.r0().j1(cfaVarArr[i2].a, indexOf, this.m1, this.f1, this.G, ucaVar);
                    }
                } else if (i2 == 1) {
                    if (view instanceof iba) {
                        iba ibaVar = (iba) view;
                        TLRPC.Document F0 = k27Var.F0();
                        if (ibaVar.H) {
                            if (k27Var.x()) {
                                PhotoViewer.r0().T1(null, dVar, null);
                                int indexOf2 = cfaVarArr[i2].a.indexOf(k27Var);
                                if (indexOf2 < 0) {
                                    PhotoViewer.r0().j1(tb4.t(k27Var), 0, 0L, 0L, 0L, ucaVar);
                                    return;
                                } else {
                                    PhotoViewer.r0().j1(cfaVarArr[i2].a, indexOf2, this.m1, this.f1, this.G, ucaVar);
                                    return;
                                }
                            }
                            gl.q2(k27Var, dVar.getParentActivity(), dVar);
                        } else if (ibaVar.G) {
                            dVar.getFileLoader().f(F0);
                            ibaVar.f(true);
                        } else {
                            k27 message = ibaVar.getMessage();
                            message.P = true;
                            dVar.getFileLoader().X(F0, message, 0, 0);
                            ibaVar.f(true);
                        }
                    }
                } else if (i2 == 3) {
                    try {
                        TLRPC.WebPage webPage = k27.n1(k27Var.k) != null ? k27.n1(k27Var.k).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k27Var) == null) {
                                    dVar.createArticleViewer(false).L(k27Var, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str2 = webPage.embed_url;
                            if (str2 != null && str2.length() != 0) {
                                ou3.I0(dVar, k27Var, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((lba) view).F;
                            str = arrayList.size() > 0 ? ((CharSequence) arrayList.get(0)).toString() : null;
                        }
                        if (str != null) {
                            Y0(str);
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                } else if (j0(i2)) {
                    kfa v1 = v1(i2);
                    y1b y1bVar = v1 != null ? v1.s : null;
                    if (y1bVar == null) {
                        return;
                    }
                    m8b orCreateStoryViewer = dVar.getOrCreateStoryViewer();
                    Context context = getContext();
                    int e1 = k27Var.e1();
                    p2b a = p2b.a(this.n0[0].h);
                    a.e = new wh9(y1bVar, (byte) 15);
                    if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) {
                        i3 = gl.L(68.0f);
                    }
                    a.s += i3;
                    orCreateStoryViewer.G(context, e1, y1bVar, a);
                }
            }
            E1();
        }
    }

    public final void M1() {
        boolean z;
        y1b y1bVar;
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
            k27 k27Var = (k27) sparseArrayArr[0].valueAt(i);
            xda xdaVar = this.f0;
            if (xdaVar != null && (y1bVar = xdaVar.s) != null && !y1bVar.m(k27Var.e1())) {
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
            if (gl.O1() || org.telegram.messenger.a.b.getResources().getConfiguration().orientation != 2) {
                this.D0.setTextSize(20);
            } else {
                this.D0.setTextSize(18);
            }
        }
        if (i == 0) {
            this.K.f();
        }
    }

    public final boolean N0(k27 k27Var, View view, int i, boolean z) {
        oca ocaVar;
        final TL_stories.StoryItem storyItem;
        xda xdaVar;
        y1b y1bVar;
        final byte b = 0;
        if (!this.F1) {
            d dVar = this.y1;
            if (dVar.getParentActivity() != null && k27Var != null && ((ocaVar = this.c0) == null || !ocaVar.f)) {
                gl.t1(dVar.getParentActivity().getCurrentFocus());
                long j = this.m1;
                int i2 = 8;
                final byte b2 = 1;
                if (!z || (!(t0(getClosestTab()) || getClosestTab() == 8) || this.F1)) {
                    char c = k27.B0(k27Var.k) == j ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c].put(k27Var.e1(), k27Var);
                    if (!k27Var.s(null, false)) {
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
                        gl.y(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i3++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.e1 = false;
                    if (view instanceof iba) {
                        ((iba) view).b(true, true);
                    } else if (view instanceof rfa) {
                        ((rfa) view).b(i, true, true);
                    } else if (view instanceof lba) {
                        ((lba) view).f(true, true);
                    } else if (view instanceof eba) {
                        ((eba) view).e(true, true);
                    } else if (view instanceof bw2) {
                        ((bw2) view).c(true, true);
                    } else if (view instanceof qfa) {
                        ((qfa) view).i(true, true);
                    }
                    if (!this.F1) {
                        l1(true);
                    }
                    J0(sparseArrayArr[0]);
                    E1();
                    return true;
                }
                if (view instanceof qfa) {
                    qfa qfaVar = (qfa) view;
                    qfaVar.k(qfaVar.n, qfaVar.r, true);
                }
                TL_stories.StoryItem storyItem2 = k27Var.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean t0 = t0(getClosestTab());
                    cs5 J = cs5.J(dVar, view);
                    cs5 K = J.K();
                    K.b(R.drawable.ic_ab_back, k96.M0(2131753753, null), new en1(J, b), false);
                    K.j();
                    cs5.e(K, getStoriesController().A(j, true), hashSet, true, new q3a((Object) this, (Object) storyItem2, (Object) J, (byte) 4), new au0((Object) this, (Object) hashSet, (Object) storyItem2, (Object) J, (byte) 21));
                    J.b(R.drawable.menu_album_add, k96.M0(2131744568, null), new c10(J, K, (byte) 10), false);
                    J.j();
                    J.b(R.drawable.msg_select, k96.M0(2131744552, null), new q76((Object) this, (Object) k27Var, (Object) view, i, (byte) 28), false);
                    final byte b3 = 3;
                    if (t0) {
                        int s1 = s1(getClosestTab());
                        String v = getStoriesController().v(s1, j);
                        J.b(R.drawable.tabs_reorder, k96.M0(2131744553, null), new sba(this, s1, b), false);
                        storyItem = storyItem2;
                        J.b(R.drawable.msg_removefolder, k96.M0(2131744554, null), new q76((Object) this, s1, (Object) storyItem, (Object) v, (byte) 29), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (xdaVar = this.f0) != null && (y1bVar = xdaVar.s) != null) {
                            if (y1bVar.m(storyItem.id)) {
                                J.b(R.drawable.chats_unpin, k96.M0(2131744550, null), new Runnable(this) { // from class: rba
                                    public final /* synthetic */ nfa b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b2;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        nfa nfaVar = this.b;
                                        switch (b4) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nfaVar.I1, nfaVar.getContext());
                                                String M0 = k96.M0(2131751475, null);
                                                hd hdVar = alertDialog$Builder.a;
                                                hdVar.S = M0;
                                                hdVar.U = k96.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.j(k96.M0(2131751586, null), new aca(nfaVar, storyItem3));
                                                alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 14));
                                                hdVar.show();
                                                hdVar.h();
                                                break;
                                            case 1:
                                                nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                nfaVar.C0(storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final byte b4 = 2;
                                J.b(R.drawable.chats_pin, k96.M0(2131744555, null), new Runnable(this) { // from class: rba
                                    public final /* synthetic */ nfa b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b4;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        nfa nfaVar = this.b;
                                        switch (b42) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nfaVar.I1, nfaVar.getContext());
                                                String M0 = k96.M0(2131751475, null);
                                                hd hdVar = alertDialog$Builder.a;
                                                hdVar.S = M0;
                                                hdVar.U = k96.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.j(k96.M0(2131751586, null), new aca(nfaVar, storyItem3));
                                                alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 14));
                                                hdVar.show();
                                                hdVar.h();
                                                break;
                                            case 1:
                                                nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                nfaVar.C0(storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        J.b(R.drawable.msg_archive, k96.M0(2131744560, null), new Runnable(this) { // from class: rba
                            public final /* synthetic */ nfa b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b42 = b3;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                nfa nfaVar = this.b;
                                switch (b42) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nfaVar.I1, nfaVar.getContext());
                                        String M0 = k96.M0(2131751475, null);
                                        hd hdVar = alertDialog$Builder.a;
                                        hdVar.S = M0;
                                        hdVar.U = k96.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.j(k96.M0(2131751586, null), new aca(nfaVar, storyItem3));
                                        alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 14));
                                        hdVar.show();
                                        hdVar.h();
                                        break;
                                    case 1:
                                        nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        nfaVar.C0(storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    J.b(R.drawable.msg_delete, k96.M0(2131751586, null), new Runnable(this) { // from class: rba
                        public final /* synthetic */ nfa b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b42 = b;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            nfa nfaVar = this.b;
                            switch (b42) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nfaVar.I1, nfaVar.getContext());
                                    String M0 = k96.M0(2131751475, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    hdVar.U = k96.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.j(k96.M0(2131751586, null), new aca(nfaVar, storyItem3));
                                    alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 14));
                                    hdVar.show();
                                    hdVar.h();
                                    break;
                                case 1:
                                    nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    nfaVar.C0(storyItem3);
                                    break;
                            }
                        }
                    }, true);
                    J.i = (byte) 3;
                    J.u = true;
                    J.v = true;
                    J.L = true;
                    J.M = (byte) 3;
                    Point point = gl.q;
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
        lca lcaVar;
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
        ffa ffaVar;
        kda kdaVar = this.L0;
        if (kdaVar == null) {
            return;
        }
        boolean z11 = !this.G1.u() ? false : z;
        boolean z12 = (this.W == null || (ffaVar = this.x1) == null || !ffaVar.f) ? false : true;
        long j = this.m1;
        int i12 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        d dVar = this.y1;
        if (i12 <= 0 || dVar == null) {
            i = 1;
            user = null;
        } else {
            i = 1;
            user = dVar.getMessagesController().V1(Long.valueOf(j));
        }
        boolean z13 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i : false;
        int i13 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.h1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z13) ? 0 : i;
        int i14 = ((cf3.D(j) || cf3.y(j)) && !cf3.B(j) && (((userFull = this.h1) != null && userFull.stories_pinned_available) || (((chatFull = this.g1) != null && chatFull.stories_pinned_available) || s0())) && i0()) ? i : 0;
        lca lcaVar2 = this.b0;
        int i15 = i13;
        boolean z14 = (lcaVar2 == null || (((userFull3 = this.h1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.g1) == null || chatFull3.stargifts_count <= 0))) ? false : i;
        int i16 = i14;
        TLRPC.ChatFull chatFull4 = this.g1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.h1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z15 = z11;
                int i17 = this.U1 == kdaVar.o0 ? i : 0;
                boolean z16 = (i16 == 0 || i15 != 0) ? i : false;
                int i18 = i17;
                i2 = z16 == kdaVar.d(8) ? i18 + 1 : i18;
                if (z13 != kdaVar.d(13)) {
                    i2++;
                }
                if (q0() != kdaVar.d(8)) {
                    i2++;
                }
                if (z14 == kdaVar.d(14) || (lcaVar2 != null && z14 && this.T1 != lcaVar2.getLastEmojisHash())) {
                    i2++;
                }
                s0 = s0();
                int i19 = 14;
                aea aeaVar = this.d0;
                int[] iArr2 = this.a1;
                if (s0) {
                    z2 = z14;
                    int i20 = i2;
                    int i21 = (aeaVar.d == null ? i : false) == kdaVar.d(7) ? i20 + 1 : i20;
                    if (iArr2[0] <= 0) {
                        z9 = i;
                        i8 = 0;
                    } else {
                        z9 = false;
                        i8 = 0;
                    }
                    int i22 = i21;
                    int i23 = z9 == kdaVar.d(i8) ? i22 + 1 : i22;
                    if (iArr2[i] <= 0) {
                        z10 = i;
                        i9 = z10;
                    } else {
                        i9 = i;
                        z10 = false;
                    }
                    int i24 = i23;
                    int i25 = z10 == kdaVar.d(i9) ? i24 + 1 : i24;
                    if (cf3.B(j)) {
                        i10 = i25;
                    } else {
                        int i26 = i25;
                        int i27 = (iArr2[3] <= 0) == kdaVar.d(3) ? i26 + 1 : i26;
                        i10 = (iArr2[4] <= 0) == kdaVar.d(4) ? i27 + 1 : i27;
                    }
                    int i28 = i11;
                    int i29 = (iArr2[2] <= 0) == kdaVar.d(2) ? i28 + 1 : i28;
                    int i30 = (iArr2[5] <= 0) == kdaVar.d(5) ? i29 + 1 : i29;
                    int i31 = (iArr2[6] <= 0) == kdaVar.d(6) ? i30 + 1 : i30;
                    boolean z17 = !this.T.d.isEmpty();
                    int i32 = i31;
                    i2 = z17 != kdaVar.d(10) ? i32 + 1 : i32;
                    z3 = h0() && !dVar.getMessagesController().D1().b && dVar.getMessagesController().D1().e();
                    z4 = z17;
                    if (z3 != kdaVar.d(11)) {
                        i2++;
                    }
                    if (z12 != kdaVar.d(12)) {
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
                        TransitionManager.beginDelayedTransition(kdaVar.getTabsContainer(), transitionSet);
                        kdaVar.V = kdaVar.w;
                        kdaVar.W = kdaVar.x;
                    } else {
                        iArr = iArr2;
                        z5 = z12;
                    }
                    SparseArray f = kdaVar.f();
                    if (i2 > 3) {
                        f = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (q0()) {
                        z6 = z13;
                        z7 = z3;
                        str = null;
                        arrayList.add(new Pair(8, k96.M0(2131746442, null)));
                        kdaVar.c0 = (short) 420;
                    } else {
                        z6 = z13;
                        z7 = z3;
                        str = null;
                    }
                    if (i15 != 0) {
                        arrayList.add(new Pair(8, k96.M0(2131746499, str)));
                    } else if ((cf3.D(j) || cf3.y(j)) && !cf3.B(j) && ((((userFull2 = this.h1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.g1) != null && chatFull2.stories_pinned_available) || s0())) && i0())) {
                        if (k0()) {
                            arrayList.add(new Pair(9, k96.M0(2131746534, null)));
                            kdaVar.c0 = (short) 420;
                        } else {
                            arrayList.add(new Pair(8, k96.M0(2131746442, null)));
                            if (s0()) {
                                arrayList.add(new Pair(9, k96.M0(2131746534, null)));
                            }
                        }
                    }
                    if (z2) {
                        String M02 = k96.M0(2131746483, null);
                        HashMap hashMap = tq8.V;
                        xsa xsaVar = lcaVar2.d;
                        Object obj2 = "";
                        if (xsaVar == null) {
                            lcaVar = lcaVar2;
                            sparseArray = f;
                            num = 4;
                            str6 = M02;
                            i3 = i12;
                        } else {
                            ArrayList arrayList2 = xsaVar.l;
                            str6 = M02;
                            i3 = i12;
                            sparseArray = f;
                            num = 4;
                            Pair pair = new Pair(Integer.valueOf(y6c.t0), Long.valueOf(lcaVar2.c));
                            if (arrayList2.isEmpty()) {
                                if (xsaVar.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
                                    obj2 = obj;
                                }
                                lcaVar = lcaVar2;
                            } else {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                int i33 = 0;
                                while (true) {
                                    lcaVar = lcaVar2;
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
                                    lcaVar2 = lcaVar;
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
                                            TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) gl.V(TLRPC.TL_documentAttributeCustomEmoji.class, document2.attributes);
                                            if (tL_documentAttributeCustomEmoji == null || TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt)) {
                                                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = (TLRPC.TL_documentAttributeSticker) gl.V(TLRPC.TL_documentAttributeSticker.class, document2.attributes);
                                                if (tL_documentAttributeSticker != null && !TextUtils.isEmpty(tL_documentAttributeSticker.alt)) {
                                                    str7 = tL_documentAttributeSticker.alt;
                                                }
                                            } else {
                                                str7 = tL_documentAttributeCustomEmoji.alt;
                                            }
                                        }
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                                        spannableStringBuilder2.setSpan(new gm(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
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
                                    this.T1 = lcaVar.getLastEmojisHash();
                                }
                                i6 = 2;
                                c = 0;
                                CharSequence[] charSequenceArr2 = new CharSequence[i6];
                                charSequenceArr2[c] = str6;
                                charSequenceArr2[1] = obj2;
                                arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                                this.T1 = lcaVar.getLastEmojisHash();
                            }
                        }
                        z8 = z5;
                        i6 = 2;
                        c = 0;
                        CharSequence[] charSequenceArr22 = new CharSequence[i6];
                        charSequenceArr22[c] = str6;
                        charSequenceArr22[1] = obj2;
                        arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr22)));
                        this.T1 = lcaVar.getLastEmojisHash();
                    } else {
                        sparseArray = f;
                        num = 4;
                        i3 = i12;
                        z8 = z5;
                    }
                    if (z6) {
                        arrayList.add(new Pair(13, k96.M0(2131746499, null)));
                    }
                    int i35 = 2131745221;
                    if (!s0()) {
                        if (z7) {
                            str3 = null;
                            arrayList.add(new Pair(11, k96.M0(2131745715, null)));
                        } else {
                            str3 = null;
                        }
                        if (aeaVar.d != null) {
                            arrayList.add(new Pair(7, k96.M0(2131749237, str3)));
                        }
                        if (iArr[0] > 0) {
                            if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && aeaVar.d == null) {
                                arrayList.add(new Pair(0, k96.M0(2131745214, null)));
                            } else {
                                str4 = null;
                                arrayList.add(new Pair(0, k96.M0(2131745215, null)));
                                if (z8) {
                                    arrayList.add(new Pair(12, k96.M0(2131745701, str4)));
                                    na7.c1().edit().putInt("savedhint", 3).apply();
                                }
                                if (iArr[1] <= 0) {
                                    str5 = null;
                                    arrayList.add(new Pair(1, k96.M0(2131745222, null)));
                                } else {
                                    str5 = null;
                                }
                                if (cf3.B(j)) {
                                    if (iArr[3] > 0) {
                                        arrayList.add(new Pair(3, k96.M0(2131745218, str5)));
                                    }
                                    if (iArr[4] > 0) {
                                        arrayList.add(new Pair(num, k96.M0(2131745213, str5)));
                                    }
                                    if (iArr[8] > 0) {
                                        arrayList.add(new Pair(15, k96.M0(2131745211, str5)));
                                    }
                                } else {
                                    Integer num2 = num;
                                    if (iArr[4] > 0) {
                                        arrayList.add(new Pair(num2, k96.M0(2131745213, str5)));
                                    }
                                }
                                if (iArr[2] > 0) {
                                    arrayList.add(new Pair(2, k96.M0(2131745210, str5)));
                                }
                                if (iArr[5] > 0) {
                                    arrayList.add(new Pair(5, k96.M0(2131745221, str5)));
                                }
                                if (iArr[6] > 0) {
                                    arrayList.add(new Pair(6, k96.M0(2131745220, str5)));
                                }
                                if (z4) {
                                    arrayList.add(new Pair(10, k96.M0(i3 > 0 ? 2131745126 : 2131745122, null)));
                                }
                            }
                        }
                        str4 = null;
                        if (z8) {
                        }
                        if (iArr[1] <= 0) {
                        }
                        if (cf3.B(j)) {
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
                    if (kdaVar.o0) {
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
                                        M0 = k96.M0(2131745214, null);
                                    } else if (i36 == 1) {
                                        M0 = k96.M0(2131745222, null);
                                    } else if (i36 == 2) {
                                        M0 = k96.M0(2131745210, null);
                                    } else if (i36 == 3) {
                                        M0 = k96.M0(2131745218, null);
                                    } else if (i36 == 4) {
                                        M0 = k96.M0(2131745213, null);
                                    } else if (i36 == 5) {
                                        M0 = k96.M0(i35, null);
                                    } else if (i36 == 8) {
                                        M0 = k96.M0(2131746442, null);
                                    } else if (i36 != i19) {
                                        str2 = null;
                                        arrayList.add(new Pair(valueOf2, str2));
                                    } else {
                                        M0 = k96.M0(2131746483, null);
                                    }
                                    str2 = M0;
                                    arrayList.add(new Pair(valueOf2, str2));
                                }
                            }
                            i36++;
                            i35 = 2131745221;
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
                                if (kdaVar.d(((Integer) pair2.first).intValue())) {
                                    sparseArray2 = sparseArray;
                                } else {
                                    sparseArray2 = sparseArray;
                                    kdaVar.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, sparseArray2);
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
                this.U1 = kdaVar.o0;
                kdaVar.c();
                S0();
                C();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z152 = z11;
        if (this.U1 == kdaVar.o0) {
        }
        if (i16 == 0) {
        }
        int i182 = i17;
        if (z16 == kdaVar.d(8)) {
        }
        if (z13 != kdaVar.d(13)) {
        }
        if (q0() != kdaVar.d(8)) {
        }
        if (z14 == kdaVar.d(14)) {
        }
        i2++;
        s0 = s0();
        int i192 = 14;
        aea aeaVar2 = this.d0;
        int[] iArr22 = this.a1;
        if (s0) {
        }
        if (i2 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.U1 = kdaVar.o0;
        kdaVar.c();
        S0();
        C();
    }

    public final String O(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        kca kcaVar;
        if (!l0()) {
            return k96.M0(2131753002, null);
        }
        if (z && (kcaVar = this.a0) != null) {
            return kcaVar.getBotPreviewsSubtitle();
        }
        xda xdaVar = this.f0;
        if (xdaVar == null || xdaVar.s == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < xdaVar.s.i.size(); i3++) {
                k27 k27Var = (k27) xdaVar.s.i.get(i3);
                TL_stories.StoryItem storyItem = k27Var.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (k27.J4(messageMedia.document)) {
                        i2++;
                    } else if (k27Var.l.media.photo != null) {
                        i++;
                    }
                }
            }
        }
        if (i == 0 && i2 == 0) {
            return k96.M0(2131753002, null);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(k96.G(i, "Images", new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(k96.G(i2, "Videos", new Object[0]));
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
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[0];
        if (ieaVar == null) {
            return null;
        }
        int i = ieaVar.F;
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
                gba.A(R);
            } else if (W(ieaVarArr[0].F) >= 5 || t0(ieaVarArr[0].F)) {
                gba.E(R);
            }
            l(R);
        }
        return Boolean.valueOf(R != R(j0 ? 1 : 0, R, true));
    }

    public final iea P(int i) {
        int i2 = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i2 >= ieaVarArr.length) {
                return null;
            }
            iea ieaVar = ieaVarArr[i2];
            if (ieaVar != null && ieaVar.F == i) {
                return ieaVar;
            }
            i2++;
        }
    }

    public final void P0(float f) {
        iea[] ieaVarArr = this.n0;
        if (f != 1.0f || ieaVarArr[1].getVisibility() == 0) {
            if (this.k1) {
                ieaVarArr[0].setTranslationX((-f) * r3.getMeasuredWidth());
                ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth() - (ieaVarArr[0].getMeasuredWidth() * f));
            } else {
                ieaVarArr[0].setTranslationX(r3.getMeasuredWidth() * f);
                ieaVarArr[1].setTranslationX((ieaVarArr[0].getMeasuredWidth() * f) - ieaVarArr[0].getMeasuredWidth());
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
                iea ieaVar = ieaVarArr[0];
                ieaVarArr[0] = ieaVarArr[1];
                ieaVarArr[1] = ieaVar;
                ieaVar.setVisibility(8);
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
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[0];
        if (ieaVar == null) {
            return null;
        }
        if (this.n1 && j0(ieaVar.F)) {
            return null;
        }
        int i = ieaVarArr[0].F;
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
                gba.A(R);
            } else if (W(ieaVarArr[0].F) >= 5 || t0(ieaVarArr[0].F)) {
                gba.E(R);
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
        return this.b2 + this.f2 + (z ? gl.L(52.0f) : 0);
    }

    public void S0() {
        boolean z = s0() || k0();
        ifa ifaVar = this.h0.x;
        if (ifaVar != null) {
            ifaVar.b(z && getClosestTab() == 9);
        }
        ifa ifaVar2 = this.f0.x;
        if (ifaVar2 != null) {
            ifaVar2.b(z && getClosestTab() == 8);
        }
        for (mfa mfaVar : this.m2.values()) {
            lfa lfaVar = mfaVar.c;
            if (lfaVar.s != null) {
                lfaVar.x.b(z && getClosestTab() == mfaVar.a);
            }
        }
        r7 r7Var = this.q0;
        if (r7Var != null) {
            hda hdaVar = this.M0;
            r7Var.setSearchFieldHint(k96.M0((hdaVar != null && hdaVar.a() && getSelectedTab() == 11) ? 2131745676 : 2131745644, null));
        }
        C();
        B(true, true);
    }

    public final int T(int i) {
        return X(i) + gl.L(54.0f) + this.d2 + this.e2 + this.p2 + (i == 9 ? gl.L(64.0f) : 0);
    }

    public void T0(float f) {
        K0();
    }

    public final float U(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[1];
        if (ieaVar != null && f0(ieaVar.F)) {
            f2 = 0.0f + f;
        }
        iea ieaVar2 = ieaVarArr[0];
        return (ieaVar2 == null || !f0(ieaVar2.F)) ? f2 : (1.0f - f) + f2;
    }

    public final void U0(int i, long j, d dVar) {
        new qy9(dVar, j, this.p1[1], new gq7(this, j, i, (byte) 1)).show();
    }

    public final float V(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[1];
        if (ieaVar != null && p0(ieaVar.F) && ieaVarArr[1].F != 11) {
            f2 = 0.0f + f;
        }
        iea ieaVar2 = ieaVarArr[0];
        return (ieaVar2 == null || !p0(ieaVar2.F) || ieaVarArr[0].F == 11) ? f2 : (1.0f - f) + f2;
    }

    public final void V0(int i, long j, d dVar) {
        ij.s0(dVar, k96.M0(2131751586, null), gl.S2(k96.a0(null, null, 2131744558, getStoriesController().v(i, j))), k96.M0(2131751586, null), true, new va2((Object) this, j, i, (byte) 5));
    }

    public final int W(int i) {
        kfa v1;
        y1b y1bVar;
        if (!j0(i) || (v1 = v1(i)) == null || (y1bVar = v1.s) == null) {
            return 0;
        }
        return y1bVar.g();
    }

    public final void W0(int i, long j, d dVar) {
        String v = getStoriesController().v(i, j);
        Context context = dVar.getContext();
        wjb resourceProvider = dVar.getResourceProvider();
        gf gfVar = new gf((Object) this, j, i, (byte) 6);
        Pattern pattern = ij.a;
        ij.O(context, dVar, k96.M0(2131744545, null), k96.M0(2131744544, null), k96.M0(2131744543, null), v, 12, k96.M0(2131746085, null), resourceProvider, gfVar);
    }

    public final int X(int i) {
        oca ocaVar = this.c0;
        return (int) ((ocaVar == null || !(t0(i) || i == 8)) ? 0.0f : ocaVar.getVisibilityFactor() * gl.L(40.0f));
    }

    public final void X0(int i, boolean z) {
        iea[] ieaVarArr = this.n0;
        if (ieaVarArr[0].F == i) {
            return;
        }
        iea ieaVar = ieaVarArr[1];
        ieaVar.F = i;
        ieaVar.setVisibility(0);
        g0();
        z1(true);
        this.k1 = z;
        S0();
        j(!p0(i));
        G1(true);
    }

    public final void Y0(String str) {
        boolean D3 = gl.D3(str);
        d dVar = this.y1;
        if (D3) {
            ij.n0(dVar, str, true, true);
        } else {
            d01.t(dVar.getParentActivity(), str);
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
            iea[] ieaVarArr = this.n0;
            if (i2 >= ieaVarArr.length) {
                break;
            }
            iea ieaVar = ieaVarArr[i2];
            if (ieaVar != null) {
                int i4 = ieaVar.F;
                if ((z && i == 8 && t0(i4)) || i4 == i) {
                    i3++;
                    width = ieaVarArr[i2].getTranslationX();
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
        xda xdaVar = this.f0;
        if (xdaVar == null || xdaVar.s == null) {
            return;
        }
        d dVar = this.y1;
        if (z && arrayList.size() > dVar.getMessagesController().k4.p2.f()) {
            b00.u(k96.G(dVar.getMessagesController().k4.p2.f(), "StoriesPinLimit", new Object[0]), u21.b0(dVar), R.raw.chats_infotip, 36);
            return;
        }
        y1b y1bVar = xdaVar.s;
        int i = y1bVar.c;
        ArrayList arrayList2 = y1bVar.g;
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
        boolean z3 = arrayList3.size() > na7.q1(i).k4.p2.f();
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
                y1bVar.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = na7.q1(i).h1(y1bVar.d);
                ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new ce2((byte) 10));
            }
            z2 = z3;
        }
        if (z2) {
            b00.u(k96.G(dVar.getMessagesController().k4.p2.f(), "StoriesPinLimit", new Object[0]), u21.b0(dVar), R.raw.chats_infotip, 36);
        } else if (z) {
            u21.b0(dVar).I(R.raw.ic_pin, gl.S2(k96.G(arrayList.size(), "StoriesPinned", new Object[0])), k96.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            b00.u(k96.G(arrayList.size(), "StoriesUnpinned", new Object[0]), u21.b0(dVar), R.raw.ic_unpin, 36);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Bi));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.zi));
        hashSet.add(Integer.valueOf(bkb.Ai));
        hashSet.add(Integer.valueOf(bkb.J6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.rj));
        hashSet.add(Integer.valueOf(bkb.yi));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.ki));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.w7));
        hashSet.add(Integer.valueOf(bkb.s7));
        hashSet.add(Integer.valueOf(bkb.v7));
        hashSet.add(Integer.valueOf(bkb.ae));
        hashSet.add(Integer.valueOf(bkb.md));
    }

    public final float b0(int i, boolean z) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i2 >= ieaVarArr.length) {
                return f;
            }
            iea ieaVar = ieaVarArr[i2];
            if (ieaVar != null) {
                int i3 = ieaVar.F;
                if ((z && i == 8 && t0(i3)) || i3 == i) {
                    f = (1.0f - Math.abs(ieaVarArr[i2].getTranslationX() / getWidth())) + f;
                }
            }
            i2++;
        }
    }

    public final boolean b1(MotionEvent motionEvent, boolean z) {
        iea ieaVar;
        kca kcaVar;
        int closestTab = getClosestTab();
        kda kdaVar = this.L0;
        int i = -1;
        int i2 = kdaVar.P.get(kdaVar.n + (z ? 1 : -1), -1);
        oca ocaVar = this.c0;
        if (ocaVar != null) {
            if (t0(closestTab) || closestTab == 8) {
                vec vecVar = ocaVar.b;
                i = vecVar.c0.get(vecVar.G + (z ? 1 : -1), -1);
            } else if (t0(i2) || i2 == 8) {
                i = ocaVar.getCurrentAlbumId();
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
                iea[] ieaVarArr = this.n0;
                iea ieaVar2 = ieaVarArr[0];
                if (ieaVar2 != null && ieaVar2.F == 13 && (kcaVar = this.a0) != null) {
                    uq0 uq0Var = kcaVar.n;
                    if (!z) {
                    }
                }
                iea ieaVar3 = ieaVarArr[0];
                lca lcaVar = this.b0;
                if (ieaVar3 != null && ieaVar3.F == 14 && lcaVar != null) {
                    uq0 uq0Var2 = lcaVar.h;
                    if (!z) {
                    }
                }
                if ((!this.F1 || (ieaVar = ieaVarArr[0]) == null || ieaVar.F != 13) && ((lcaVar == null || !lcaVar.g()) && (ocaVar == null || !ocaVar.f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    g0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    kdaVar.setEnabled(false);
                    iea ieaVar4 = ieaVarArr[1];
                    ieaVar4.F = i2;
                    ieaVar4.setVisibility(0);
                    this.k1 = z;
                    z1(true);
                    if (z) {
                        ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth());
                    } else {
                        ieaVarArr[1].setTranslationX(-ieaVarArr[0].getMeasuredWidth());
                    }
                    T0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int c0(int i) {
        wjb wjbVar = this.I1;
        return wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false);
    }

    public final boolean d0() {
        return this.y1.getConnectionsManager().getConnectionState() == 3;
    }

    public final void d1(w39 w39Var) {
        if (w39Var instanceof hfa) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (w39Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        wea weaVar = this.Q;
        if (w39Var == weaVar) {
            weaVar.r = null;
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
    @Override // gk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        sca scaVar;
        k27 k27Var;
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
        uda udaVar;
        sca scaVar2;
        int i7;
        int i8;
        sca scaVar3;
        int i9 = kk7.U;
        n39 n39Var = this.R;
        n39 n39Var2 = this.P;
        bfa bfaVar = this.M;
        n39 n39Var3 = this.O;
        n39 n39Var4 = this.N;
        d dVar = this.y1;
        wea weaVar = this.Q;
        uda udaVar2 = this.K;
        long j = this.m1;
        iea[] ieaVarArr = this.n0;
        cfa[] cfaVarArr = this.w1;
        if (i == i9) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != dVar.getClassGuid() || intValue2 != cfaVarArr[intValue3].p) {
                if (this.x1 == null || !cfaVarArr[intValue3].a.isEmpty() || cfaVarArr[intValue3].o || !J(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    n39Var = udaVar2;
                } else if (intValue3 == 1) {
                    n39Var = n39Var4;
                } else if (intValue3 == 2) {
                    n39Var = n39Var3;
                } else if (intValue3 == 3) {
                    n39Var = bfaVar;
                } else if (intValue3 == 4) {
                    n39Var = n39Var2;
                } else if (intValue3 != 5) {
                    n39Var = intValue3 == 15 ? weaVar : null;
                }
                if (n39Var != null) {
                    for (int i10 = 0; i10 < ieaVarArr.length; i10++) {
                        iea ieaVar = ieaVarArr[i10];
                        if (ieaVar != null && (scaVar2 = ieaVar.h) != null && scaVar2.getAdapter() == n39Var) {
                            ieaVarArr[i10].h.D0();
                        }
                    }
                    n39Var.f();
                }
                this.e1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean B = cf3.B(j);
            int i11 = longValue == j ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                cfaVarArr[intValue3].f[i11] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i7 = intValue3;
                n39Var = udaVar2;
            } else if (intValue3 == 1) {
                i7 = intValue3;
                n39Var = n39Var4;
            } else if (intValue3 == 2) {
                i7 = intValue3;
                n39Var = n39Var3;
            } else if (intValue3 == 3) {
                i7 = intValue3;
                n39Var = bfaVar;
            } else if (intValue3 == 4) {
                i7 = intValue3;
                n39Var = n39Var2;
            } else if (intValue3 == 5) {
                i7 = intValue3;
            } else if (intValue3 == 15) {
                n39Var = weaVar;
                i7 = 8;
            } else {
                i7 = intValue3;
                n39Var = null;
            }
            int size2 = cfaVarArr[i7].a.size();
            if (n39Var != null) {
                i8 = n39Var.b();
                if (n39Var instanceof j39) {
                    ((j39) n39Var).L();
                }
            } else {
                i8 = 0;
            }
            cfaVarArr[i7].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    k27 k27Var2 = (k27) arrayList.get(size3);
                    if (cfaVarArr[i7].a(k27Var2, i11, r13, B)) {
                        sparseBooleanArray.put(k27Var2.e1(), r13);
                        cfa cfaVar = cfaVarArr[i7];
                        int i12 = cfaVar.m - r13;
                        cfaVar.m = i12;
                        if (i12 < 0) {
                            cfaVar.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                cfaVarArr[i7].l = ((Boolean) objArr[5]).booleanValue();
                cfa cfaVar2 = cfaVarArr[i7];
                if (cfaVar2.l) {
                    cfaVar2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    k27 k27Var3 = (k27) arrayList.get(i13);
                    if (cfaVarArr[i7].a(k27Var3, i11, r12, B)) {
                        sparseBooleanArray.put(k27Var3.e1(), true);
                        cfa cfaVar3 = cfaVarArr[i7];
                        int i14 = cfaVar3.n - 1;
                        cfaVar3.n = i14;
                        if (i14 < 0) {
                            cfaVar3.n = r12;
                        }
                    }
                    i13++;
                    r12 = 0;
                }
                cfa cfaVar4 = cfaVarArr[i7];
                if (cfaVar4.o && cfaVar4.a.size() > 0) {
                    cfa cfaVar5 = cfaVarArr[i7];
                    cfaVar5.k = ((k27) cfaVar5.a.get(0)).e1();
                }
                cfaVarArr[i7].i[i11] = ((Boolean) objArr[5]).booleanValue();
                cfa cfaVar6 = cfaVarArr[i7];
                if (cfaVar6.i[i11]) {
                    int size4 = cfaVar6.b[i11].size();
                    if (i11 == 0) {
                        size4 += cfaVarArr[i7].m;
                    }
                    cfaVarArr[i7].f[i11] = size4;
                }
            }
            if (!booleanValue && i11 == 0) {
                cfa cfaVar7 = cfaVarArr[i7];
                if (cfaVar7.i[i11] && this.f1 != 0) {
                    cfaVar7.g = true;
                    dVar.getMediaDataController().P0(this.f1, 50, cfaVarArr[i7].j[1], 0, i7, this.G, 1, dVar.getClassGuid(), cfaVarArr[i7].p, null, null);
                }
            }
            int i15 = i7;
            if (n39Var != null) {
                sca scaVar4 = null;
                for (int i16 = 0; i16 < ieaVarArr.length; i16++) {
                    iea ieaVar2 = ieaVarArr[i16];
                    if (ieaVar2 != null && (scaVar3 = ieaVar2.h) != null && scaVar3.getAdapter() == n39Var) {
                        sca scaVar5 = ieaVarArr[i16].h;
                        scaVar5.D0();
                        scaVar4 = scaVar5;
                    }
                }
                int b = n39Var.b();
                if (n39Var != udaVar2) {
                    try {
                        n39Var.f();
                    } catch (Throwable unused) {
                    }
                } else if (udaVar2.b() == i8) {
                    gl.V3(scaVar4);
                } else {
                    udaVar2.f();
                }
                if (!cfaVarArr[i15].a.isEmpty() || cfaVarArr[i15].g) {
                    if (scaVar4 != null && (n39Var == udaVar2 || b >= i8)) {
                        i(scaVar4, i8, sparseBooleanArray);
                    }
                } else if (scaVar4 != null) {
                    i(scaVar4, i8, sparseBooleanArray);
                }
                if (scaVar4 != null && !cfaVarArr[i15].o) {
                    if (size2 == 0) {
                        for (int i17 = 0; i17 < 2; i17++) {
                            if (ieaVarArr[i17].F == 0) {
                                ((t26) scaVar4.getLayoutManager()).g1(udaVar2.L(0), 0);
                            }
                        }
                    } else {
                        e1();
                    }
                }
            }
            cfa cfaVar8 = cfaVarArr[i15];
            if (cfaVar8.o) {
                if (cfaVar8.a.size() == 0) {
                    H0(i15);
                } else {
                    cfaVarArr[i15].o = false;
                }
            }
            this.e1 = true;
            return;
        }
        if (i == kk7.v) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat K0 = cf3.y(j) ? dVar.getMessagesController().K0(Long.valueOf(-j)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (hc2.T(K0)) {
                if (longValue2 == 0 && this.f1 != 0) {
                    i5 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i18 = -1;
                    i6 = 0;
                    z3 = false;
                    while (true) {
                        udaVar = udaVar2;
                        if (i6 < size) {
                            break;
                        }
                        int i19 = 0;
                        while (i19 < cfaVarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (cfaVarArr[i19].b(((Integer) arrayList2.get(i6)).intValue(), i5) != null) {
                                i18 = i19;
                                z3 = true;
                            }
                            i19++;
                            arrayList2 = arrayList3;
                        }
                        i6++;
                        udaVar2 = udaVar;
                    }
                    if (z3) {
                        this.e1 = true;
                        if (udaVar != null) {
                            udaVar.f();
                        }
                        if (n39Var4 != null) {
                            n39Var4.f();
                        }
                        if (n39Var3 != null) {
                            n39Var3.f();
                        }
                        if (bfaVar != null) {
                            bfaVar.X(false);
                        }
                        if (n39Var2 != null) {
                            n39Var2.f();
                        }
                        if (weaVar != null) {
                            weaVar.f();
                        }
                        if (n39Var != null) {
                            n39Var.f();
                        }
                        if (i18 == 0 || i18 == 1 || i18 == 2 || i18 == 4) {
                            G0(true);
                        }
                    }
                    P(i18);
                    return;
                }
                if (longValue2 != K0.id) {
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
                udaVar = udaVar2;
                if (i6 < size) {
                }
                i6++;
                udaVar2 = udaVar;
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
            boolean B2 = cf3.B(j);
            int i20 = 0;
            boolean z4 = false;
            while (i20 < arrayList4.size()) {
                k27 k27Var4 = (k27) arrayList4.get(i20);
                ArrayList arrayList5 = arrayList4;
                if (k27.n1(k27Var4.k) == null || k27Var4.l5()) {
                    i4 = i20;
                } else {
                    int h0 = hq6.h0(k27Var4.k);
                    i4 = i20;
                    if (h0 == -1) {
                        return;
                    }
                    cfa cfaVar9 = cfaVarArr[h0];
                    if (cfaVar9.l) {
                        z = z4;
                        if (cfaVar9.a(k27Var4, k27.B0(k27Var4.k) == j ? 0 : 1, true, B2)) {
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
                while (i21 < ieaVarArr.length) {
                    int i22 = ieaVarArr[i21].F;
                    n39 n39Var5 = i22 == 0 ? udaVar2 : i22 == z6 ? n39Var4 : i22 == 2 ? n39Var3 : i22 == 3 ? bfaVar : i22 == 4 ? n39Var2 : i22 == 5 ? n39Var : i22 == 15 ? weaVar : null;
                    if (n39Var5 != null) {
                        n39Var5.b();
                        udaVar2.f();
                        n39Var4.f();
                        n39Var3.f();
                        bfaVar.X(false);
                        n39Var2.f();
                        weaVar.f();
                        n39Var.f();
                    }
                    i21++;
                    z6 = true;
                }
                N1(z6);
                return;
            }
            return;
        }
        if (i == kk7.J) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            if (l.longValue() == j || l.longValue() == this.f1) {
                int i23 = l.longValue() == j ? 0 : 1;
                for (cfa cfaVar10 : cfaVarArr) {
                    cfaVar10.f(i23, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i24 = kk7.g2;
        int i25 = kk7.e2;
        int i26 = kk7.f2;
        if (i == i24 || i == i26 || i == i25) {
            if (i != i25 && i != i26) {
                if (((k27) objArr[0]).T == 0) {
                    for (int i27 = 0; i27 < ieaVarArr.length; i27++) {
                        int childCount = ieaVarArr[i27].h.getChildCount();
                        for (int i28 = 0; i28 < childCount; i28++) {
                            View childAt = ieaVarArr[i27].h.getChildAt(i28);
                            if (childAt instanceof eba) {
                                eba ebaVar = (eba) childAt;
                                if (ebaVar.getMessage() != null) {
                                    ebaVar.g(false, true);
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            for (int i29 = 0; i29 < ieaVarArr.length; i29++) {
                iea ieaVar3 = ieaVarArr[i29];
                if (ieaVar3 != null && (scaVar = ieaVar3.h) != null) {
                    int childCount2 = scaVar.getChildCount();
                    for (int i30 = 0; i30 < childCount2; i30++) {
                        View childAt2 = ieaVarArr[i29].h.getChildAt(i30);
                        if (childAt2 instanceof eba) {
                            eba ebaVar2 = (eba) childAt2;
                            if (ebaVar2.getMessage() != null) {
                                ebaVar2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i == kk7.z5) {
            y1b y1bVar = (y1b) objArr[0];
            xda xdaVar = this.f0;
            if (xdaVar == null || y1bVar != xdaVar.s) {
                jca jcaVar = this.h0;
                if (jcaVar == null || y1bVar != jcaVar.s) {
                    Iterator it = this.m2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        mfa mfaVar = (mfa) it.next();
                        if (mfaVar.c.s == y1bVar) {
                            i3 = mfaVar.a;
                            break;
                        }
                    }
                } else {
                    i3 = 9;
                }
            } else {
                i3 = 8;
            }
            iea P = P(i3);
            if (P != null) {
                if (P.b != (y1bVar.g() > 0)) {
                    P.b = y1bVar.g() > 0;
                    D1(P, true);
                }
            }
            if (P != null) {
                gl.p2(P.h);
                if (P.h.getLayoutManager() instanceof t26) {
                    o39 o39Var = P.h;
                    z(P, o39Var, (t26) o39Var.getLayoutManager());
                }
            }
            cea ceaVar = this.G1;
            if (ceaVar != null) {
                ceaVar.V();
                return;
            }
            return;
        }
        if (i == kk7.x5) {
            for (iea ieaVar4 : ieaVarArr) {
                if (ieaVar4 != null && ieaVar4.h != null && j0(ieaVar4.F)) {
                    if (!l0() || ieaVar4.h.getAdapter() == null) {
                        for (int i31 = 0; i31 < ieaVar4.h.getChildCount(); i31++) {
                            View childAt3 = ieaVar4.h.getChildAt(i31);
                            if (childAt3 instanceof qfa) {
                                qfa qfaVar = (qfa) childAt3;
                                gn gnVar = qfaVar.O;
                                if (!qfaVar.e0 || (k27Var = qfaVar.n) == null || (storyItem = k27Var.l) == null || (storyViews = storyItem.views) == null) {
                                    qfaVar.M = false;
                                    gnVar.t("", false, true);
                                } else {
                                    int i32 = storyViews.views_count;
                                    qfaVar.M = i32 > 0;
                                    gnVar.t(gl.o0(i32, 0), true, true);
                                }
                            }
                        }
                    } else {
                        gl.p2(ieaVar4.h);
                    }
                }
            }
            return;
        }
        if (i == kk7.g3) {
            if (((Long) objArr[0]).longValue() == j) {
                this.T.E(true);
                N1(true);
                y();
                return;
            }
            return;
        }
        int i33 = kk7.h3;
        yea yeaVar = this.U;
        if (i == i33) {
            if (j == 0 || j == dVar.getUserConfig().e()) {
                yeaVar.F(true);
                N1(true);
                y();
                S0();
                return;
            }
            return;
        }
        if (i == kk7.r) {
            yeaVar.F(true);
            return;
        }
        if (i == kk7.H3) {
            if (((Long) objArr[0]).longValue() == j) {
                N1(true);
                return;
            }
            return;
        }
        if (i == kk7.Y3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j == (-longValue3)) {
                String str = (String) objArr[2];
                aea aeaVar = this.d0;
                if (aeaVar != null) {
                    TLRPC.ChatFull chatFull = aeaVar.d;
                    if (chatFull != null && chatFull.participants != null) {
                        for (int i34 = 0; i34 < aeaVar.d.participants.participants.size(); i34++) {
                            aeaVar.d.participants.participants.get(i34).setRank(longValue4, str);
                        }
                    }
                    for (iea ieaVar5 : ieaVarArr) {
                        if (ieaVar5.F == 7) {
                            gl.V3(ieaVar5.h);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.e1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i35 = 0; i35 < ieaVarArr.length; i35++) {
                if (ieaVarArr[i35].h.getAdapter() == weaVar) {
                    sca scaVar6 = ieaVarArr[i35].h;
                    ArrayList arrayList6 = weaVar.n;
                    for (int i36 = 0; i36 < arrayList6.size(); i36++) {
                        k27 k27Var5 = (k27) arrayList6.get(i36);
                        if (k27Var5 != null && k27Var5.D1() == longValue5) {
                            TLRPC.MessageMedia messageMedia = k27Var5.k.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                k27.c6(tL_messageMediaPoll, pollResults);
                                weaVar.g(i36);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kda kdaVar = this.L0;
        if (kdaVar != null) {
            canvas.save();
            canvas.translate(kdaVar.getX(), kdaVar.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        gda gdaVar = this.U0;
        if (gdaVar != null) {
            int i = gdaVar.U;
            if ((i == 3 || i == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(gdaVar.getX(), gdaVar.getY());
                gdaVar.setDrawOverlay(true);
                gdaVar.draw(canvas);
                gdaVar.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (this.c2 && (view instanceof iea) && this.g2 < this.e2) {
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
        iea[] ieaVarArr = this.n0;
        float top = ieaVarArr[0].getTop();
        oca ocaVar = this.c0;
        if (ocaVar != null && ((i = ieaVarArr[0].F) == 8 || t0(i))) {
            top -= ocaVar.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + gl.L(12.0f));
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    public final void e(View view) {
        iea[] ieaVarArr = this.n0;
        addView(view, Math.max(indexOfChild(ieaVarArr[0]), indexOfChild(ieaVarArr[1])) + 1, nme.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean e0() {
        SparseArray[] sparseArrayArr;
        k27 k27Var;
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
                if (num.intValue() > 0 && (k27Var = (k27) sparseArrayArr[i].get(num.intValue())) != null && (message = k27Var.k) != null && message.noforwards) {
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
            iea[] ieaVarArr = this.n0;
            if (i2 >= ieaVarArr.length) {
                return;
            }
            sca scaVar = ieaVarArr[i2].h;
            if (scaVar != null) {
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < scaVar.getChildCount(); i5++) {
                    View childAt = scaVar.getChildAt(i5);
                    if (childAt instanceof qfa) {
                        qfa qfaVar = (qfa) childAt;
                        int messageId = qfaVar.getMessageId();
                        i4 = qfaVar.getTop();
                        i3 = messageId;
                    }
                    if (childAt instanceof iba) {
                        iba ibaVar = (iba) childAt;
                        int e1 = ibaVar.getMessage().e1();
                        i4 = ibaVar.getTop();
                        i3 = e1;
                    }
                    if (childAt instanceof eba) {
                        eba ebaVar = (eba) childAt;
                        i3 = ebaVar.getMessage().e1();
                        i4 = ebaVar.getTop();
                    }
                    if (i3 != 0) {
                        break;
                    }
                }
                if (i3 != 0) {
                    int i6 = ieaVarArr[i2].F;
                    int i7 = -1;
                    if (j0(i6)) {
                        kfa v1 = v1(i6);
                        if (v1 != null && v1.s != null) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= v1.s.i.size()) {
                                    break;
                                }
                                if (i3 == ((k27) v1.s.i.get(i8)).e1()) {
                                    i7 = i8;
                                    break;
                                }
                                i8++;
                            }
                        }
                        i = i7;
                    } else if (i6 >= 0) {
                        cfa[] cfaVarArr = this.w1;
                        if (i6 < cfaVarArr.length) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= cfaVarArr[i6].a.size()) {
                                    break;
                                }
                                if (i3 == ((k27) cfaVarArr[i6].a.get(i9)).e1()) {
                                    i7 = i9;
                                    break;
                                }
                                i9++;
                            }
                            i = cfaVarArr[i6].m + i7;
                        }
                    }
                    if (i7 >= 0) {
                        ((t26) scaVar.getLayoutManager()).g1(i, (-ieaVarArr[i2].h.getPaddingTop()) + i4);
                        if (this.r1) {
                            iea ieaVar = ieaVarArr[i2];
                            ieaVar.r.g1(i, (-ieaVar.h.getPaddingTop()) + i4);
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
                spannableStringBuilder.append((CharSequence) k96.M0(2131746509, null));
            } else {
                spannableStringBuilder.append((CharSequence) "c");
                this.a2.setSpan(new cm2(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) k96.M0(2131744572, null));
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
        kda kdaVar;
        if (this.P1 || (kdaVar = this.L0) == null) {
            return;
        }
        kdaVar.g(null, i, kdaVar.Q.get(i));
    }

    public final void g(mea meaVar, d dVar, long j, int i) {
        String p = j > 0 ? l7c.p(na7.q1(dVar.getCurrentAccount()).V1(Long.valueOf(j))) : hc2.K(na7.q1(dVar.getCurrentAccount()).K0(Long.valueOf(-j)), false);
        if (p == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        ls6.u(sb, na7.q1(dVar.getCurrentAccount()).N2, "/", p, "/a/");
        sb.append(i);
        meaVar.g0(R.drawable.media_share, new q3a((Object) this, (Object) sb.toString(), (Object) dVar, (byte) 5), k96.M0(2131744551, null), false, true);
    }

    public final void g0() {
        gl.r(this.P0);
        uk1 uk1Var = this.N0;
        if (uk1Var.getTag() == null) {
            return;
        }
        uk1Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(uk1Var, (Property<uk1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(uk1Var, (Property<uk1, Float>) View.TRANSLATION_Y, (-gl.L(48.0f)) + this.R0));
        this.O0.setInterpolator(s33.g);
        this.O0.addListener(new nda(this, (byte) 0));
        this.O0.start();
    }

    public final void g1(float f, int i) {
        kda kdaVar = this.L0;
        if (kdaVar != null) {
            kdaVar.i(f, t0(i) ? 8 : i);
        }
        oca ocaVar = this.c0;
        if (ocaVar != null) {
            vec vecVar = ocaVar.b;
            if (t0(i)) {
                vecVar.g(f, s1(i));
            } else if (i == 8) {
                vecVar.g(f, 0);
            }
        }
    }

    public SparseArray<k27> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        iea ieaVar;
        iea ieaVar2;
        y1b y1bVar;
        y1b y1bVar2;
        float f = 1.0f;
        iea[] ieaVarArr = this.n0;
        if (ieaVarArr != null && (ieaVar = ieaVarArr[0]) != null && (ieaVar2 = ieaVarArr[1]) != null && ieaVar.w != null && ieaVar2.w != null) {
            int i = ieaVar.F;
            int i2 = ieaVar2.F;
            boolean z = t0(i) || i == 8;
            boolean z2 = t0(i2) || i2 == 8;
            if (z || z2) {
                float visibilityFactor = 1.0f - ieaVarArr[0].w.getVisibilityFactor();
                float visibilityFactor2 = 1.0f - ieaVarArr[1].w.getVisibilityFactor();
                kfa v1 = v1(ieaVarArr[0].F);
                if (i == 8 || (v1 != null && (y1bVar2 = v1.s) != null && y1bVar2.g() > 0)) {
                    visibilityFactor = 1.0f;
                }
                kfa v12 = v1(i2);
                if (i2 != 8 && (v12 == null || (y1bVar = v12.s) == null || y1bVar.g() <= 0)) {
                    f = visibilityFactor2;
                }
                if (!z) {
                    visibilityFactor = f;
                }
                if (!z2) {
                    f = visibilityFactor;
                }
                return gl.R1(visibilityFactor, f, Math.abs(ieaVarArr[0].getTranslationX() / ieaVarArr[0].getMeasuredWidth()));
            }
        }
        return 1.0f;
    }

    public int getClosestTab() {
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[1];
        if (ieaVar != null && ieaVar.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return ieaVarArr[1].F;
            }
            if (Math.abs(ieaVarArr[1].getTranslationX()) < ieaVarArr[1].getMeasuredWidth() / 2.0f) {
                return ieaVarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public o39 getCurrentListView() {
        vda vdaVar;
        iea ieaVar = this.n0[0];
        int i = ieaVar.F;
        return i == 13 ? this.a0.getCurrentListView() : i == 14 ? this.b0.getCurrentListView() : (i != 12 || (vdaVar = this.W) == null) ? ieaVar.h : vdaVar.a.A0;
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

    public ry8 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        oca ocaVar = this.c0;
        if (ocaVar != null && currentTabId == 8) {
            int currentAlbumId = ocaVar.getCurrentAlbumId();
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
            iea[] ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                return f;
            }
            iea ieaVar = ieaVarArr[i];
            if (ieaVar != null) {
                f = ((1.0f - Math.abs(ieaVar.getTranslationX() / getWidth())) * ieaVar.F) + f;
            }
            i++;
        }
    }

    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.y6));
        int i = bkb.y8;
        arrayList.add(new blb(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        r7 r7Var = this.x0;
        if (r7Var != null) {
            arrayList.add(new blb(r7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        r7 r7Var2 = this.w0;
        if (r7Var2 != null) {
            arrayList.add(new blb(r7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        Drawable[] drawableArr = {this.G0};
        int i2 = bkb.x8;
        ImageView imageView = this.F0;
        arrayList.add(new blb(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (alb) null, i2));
        arrayList.add(new blb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (alb) null, bkb.wi));
        kda kdaVar = this.L0;
        arrayList.add(new blb(kdaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.vi));
        arrayList.add(new blb(kdaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ui));
        arrayList.add(new blb(kdaVar.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.xi));
        gda gdaVar = this.U0;
        if (gdaVar != null) {
            arrayList.add(new blb(gdaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.u7));
            arrayList.add(new blb(gdaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (alb) null, bkb.t7));
            arrayList.add(new blb(gdaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.x7));
            arrayList.add(new blb(gdaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (alb) null, bkb.z7));
        }
        final int i3 = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i3 >= ieaVarArr.length) {
                return arrayList;
            }
            alb albVar = new alb() { // from class: dca
                @Override // alb
                public final void b() {
                    iea[] ieaVarArr2 = nfa.this.n0;
                    int i4 = i3;
                    sca scaVar = ieaVarArr2[i4].h;
                    if (scaVar != null) {
                        int childCount = scaVar.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = ieaVarArr2[i4].h.getChildAt(i5);
                            if (childAt instanceof rfa) {
                                rfa rfaVar = (rfa) childAt;
                                for (int i6 = 0; i6 < 6; i6++) {
                                    rfaVar.a[i6].e.invalidate();
                                }
                            } else if (childAt instanceof rr8) {
                                ((rr8) childAt).A(0);
                            } else if (childAt instanceof v6c) {
                                ((v6c) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // alb
                public final void a(float f) {
                }
            };
            arrayList.add(new blb(ieaVarArr[i3].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h6));
            arrayList.add(new blb(ieaVarArr[i3].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
            int i4 = bkb.g6;
            arrayList.add(new blb(ieaVarArr[i3].h, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, i4));
            arrayList.add(new blb(ieaVarArr[i3].h, 0, new Class[]{v6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, albVar, bkb.m6));
            arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.N7));
            arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.O7));
            arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.P7));
            arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Q7));
            arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.R7));
            arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.S7));
            arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.T7));
            int i5 = bkb.h7;
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_13, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i5));
            int i6 = bkb.j7;
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_14, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i6));
            arrayList.add(new blb(ieaVarArr[i3].h, 8, new Class[]{iba.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (alb) null, bkb.pj));
            arrayList.add(new blb(ieaVarArr[i3].h, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, i4));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_13, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i5));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_14, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i6));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_13, new Class[]{lba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i5));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_14, new Class[]{lba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i6));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_13, new Class[]{rfa.class}, (Paint) null, (Drawable[]) null, albVar, i5));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_14, new Class[]{rfa.class}, (Paint) null, (Drawable[]) null, albVar, i6));
            arrayList.add(new blb(ieaVarArr[i3].h, 0, new Class[]{bw2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (alb) null, bkb.Bi));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_13, new Class[]{bw2.class}, (Paint) null, (Drawable[]) null, albVar, i5));
            arrayList.add(new blb(ieaVarArr[i3].h, TLObject.FLAG_14, new Class[]{bw2.class}, (Paint) null, (Drawable[]) null, albVar, i6));
            arrayList.add(new blb(ieaVarArr[i3].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (alb) null, bkb.a7));
            arrayList.add(new blb(ieaVarArr[i3].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
            arrayList.add(new blb(ieaVarArr[i3].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.x6));
            i3++;
        }
    }

    public int getTopPanelShift() {
        return this.p2;
    }

    public final void h(mea meaVar) {
        final View[] viewArr = new View[2];
        final byte b = 0;
        viewArr[0] = meaVar.g0(R.drawable.msg_zoomin, new Runnable(this) { // from class: cca
            public final /* synthetic */ nfa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                View[] viewArr2 = viewArr;
                nfa nfaVar = this.b;
                switch (b2) {
                    case 0:
                        nfaVar.O1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        nfaVar.P1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, k96.M0(2131748458, null), false, false);
        final byte b2 = 1;
        viewArr[1] = meaVar.g0(R.drawable.msg_zoomout, new Runnable(this) { // from class: cca
            public final /* synthetic */ nfa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                View[] viewArr2 = viewArr;
                nfa nfaVar = this.b;
                switch (b22) {
                    case 0:
                        nfaVar.O1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        nfaVar.P1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, k96.M0(2131748457, null), false, false);
        View view = viewArr[0];
        if (view != null) {
            view.setEnabled(r());
            viewArr[0].setAlpha(r() ? 1.0f : 0.5f);
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
            iea[] ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                if (this.G == 0) {
                    aea aeaVar = this.d0;
                    aeaVar.d = chatFull;
                    aeaVar.e = arrayList;
                }
                N1(true);
                for (int i2 = 0; i2 < ieaVarArr.length; i2++) {
                    iea ieaVar = ieaVarArr[i2];
                    if (ieaVar.F == 7 && ieaVar.h.getAdapter() != null) {
                        gl.p2(ieaVarArr[i2].h);
                    }
                }
                return;
            }
            iea ieaVar2 = ieaVarArr[i];
            if (ieaVar2.F == 7 && ieaVar2.h.getAdapter() != null && ieaVarArr[i].h.getAdapter().b() != 0 && this.y1.getMessagesController().M1().j.size() > 0) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i(sca scaVar, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = scaVar.getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = scaVar.getChildAt(i2);
            if (childAt instanceof pi4) {
                view = childAt;
            }
        }
        if (view != null) {
            scaVar.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new pda(this, scaVar, sparseBooleanArray, (pi4) view, i));
    }

    public boolean i0() {
        return !(this instanceof qc5);
    }

    public final void i1(int i, int i2, int i3, int i4) {
        byte b = 1;
        this.c2 = true;
        this.d2 = i;
        this.e2 = i2;
        this.f2 = i3;
        this.b2 = i4;
        n();
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            if (lcaVar.M != i2 || lcaVar.N != i3) {
                lcaVar.M = i2;
                lcaVar.N = i3;
                lcaVar.setClipChildren(i2 == 0 && i3 == 0);
                lcaVar.h.setClipChildren(i2 == 0 && i3 == 0);
                lcaVar.n();
            }
            F1();
        }
        for (iea ieaVar : this.n0) {
            if (ieaVar != null) {
                ieaVar.setClipChildren(false);
                H1(ieaVar);
                setPageOverscan(ieaVar.h);
                setPageOverscan(ieaVar.n);
                int paddingTop = ieaVar.h.getPaddingTop();
                sca scaVar = ieaVar.h;
                int paddingLeft = scaVar.getPaddingLeft();
                sca scaVar2 = ieaVar.h;
                int T = T(ieaVar.F);
                scaVar2.h3 = T;
                int paddingRight = ieaVar.h.getPaddingRight();
                sca scaVar3 = ieaVar.h;
                int S = S(s0());
                scaVar3.i3 = S;
                scaVar.setPadding(paddingLeft, T, paddingRight, S);
                int paddingTop2 = paddingTop - ieaVar.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    gl.J(ieaVar.h, new wba(ieaVar, paddingTop2, b));
                }
                ieaVar.w.setPadding(0, i, 0, i4);
                vda vdaVar = this.W;
                if (vdaVar != null && vdaVar.getParent() == ieaVar) {
                    k1(gl.L(56.0f) + i, vdaVar);
                }
                kca kcaVar = this.a0;
                if (kcaVar != null && kcaVar.getParent() == ieaVar) {
                    k1(i, kcaVar);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void j(boolean z) {
        ry8 ry8Var = this.v0;
        if (ry8Var == null || this.Z1 == z) {
            return;
        }
        this.Z1 = z;
        if (z || ry8Var.getAnimatedDrawable().b0 >= 20) {
            ry8Var.getAnimatedDrawable().K(this.Z1 ? 50 : 100);
        } else {
            ry8Var.getAnimatedDrawable().K(0);
        }
        ry8Var.getAnimatedDrawable().start();
    }

    public final void j1(int i, boolean z) {
        this.D0.a(i, z);
        pha phaVar = this.I;
        if (phaVar != null) {
            phaVar.E(i, z);
        }
    }

    @Override // qe3
    public final void k(ue3 ue3Var) {
        d dVar = this.y1;
        if (dVar == null || !dVar.getMessagesController().M1().J(ue3Var.getDialogId())) {
            return;
        }
        dVar.getOrCreateStoryViewer().getClass();
        m8b orCreateStoryViewer = dVar.getOrCreateStoryViewer();
        Context context = dVar.getContext();
        long dialogId = ue3Var.getDialogId();
        p2b a = p2b.a((o39) ue3Var.getParent());
        a.s += ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) ? gl.L(68.0f) : 0;
        orCreateStoryViewer.H(context, dialogId, a);
    }

    public boolean k0() {
        return false;
    }

    public final void l(int i) {
        int i2;
        iea P = P(this.s1);
        this.s = -1;
        if (P != null) {
            P.h.D0();
            this.t1 = i;
            P.n.setVisibility(0);
            boolean j0 = j0(this.s1);
            hea heaVar = P.n;
            if (j0) {
                heaVar.setAdapter(w1(this.s1));
            } else {
                heaVar.setAdapter(this.L);
            }
            hea heaVar2 = P.n;
            int paddingLeft = heaVar2.getPaddingLeft();
            hea heaVar3 = P.n;
            int T = T(P.F);
            heaVar3.h3 = T;
            int paddingRight = P.n.getPaddingRight();
            hea heaVar4 = P.n;
            int S = S(s0());
            heaVar4.i3 = S;
            heaVar2.setPadding(paddingLeft, T, paddingRight, S);
            P.r.x1(i);
            P.n.b0();
            int i3 = 0;
            while (true) {
                iea[] ieaVarArr = this.n0;
                if (i3 >= ieaVarArr.length) {
                    break;
                }
                iea ieaVar = ieaVarArr[i3];
                if (ieaVar != null && ((i2 = ieaVar.F) == 0 || j0(i2))) {
                    gl.V3(ieaVarArr[i3].h);
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
            ofFloat.addUpdateListener(new jda(this, P, b));
            ofFloat.addListener(new dw0(this, j0(P.F) ? 1 : 0, i, (byte) 3));
            ofFloat.setInterpolator(s33.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean l0() {
        TLRPC.User V1;
        long j = this.m1;
        return j > 0 && (V1 = na7.q1(this.y1.getCurrentAccount()).V1(Long.valueOf(j))) != null && V1.bot;
    }

    public void l1(boolean z) {
        if (this.F1 != z) {
            this.F1 = z;
            pha phaVar = this.I;
            if (phaVar != null) {
                if (z) {
                    M1();
                    phaVar.J();
                } else {
                    phaVar.w();
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
            this.R1.addListener(new pu9((byte) 3, this, z));
            this.R1.start();
            if (z) {
                M1();
            }
        }
    }

    @Override // qe3
    public final boolean m() {
        return false;
    }

    public final boolean m0() {
        d dVar;
        if (this.g1 == null || (dVar = this.y1) == null) {
            return false;
        }
        return hc2.V(dVar.getMessagesController().K0(Long.valueOf(this.g1.id)));
    }

    public final void n() {
        int i = this.d2;
        int i2 = this.p2;
        k1((gl.L(6.666f) + i) - w2, this.S0);
        int i3 = i + i2;
        k1(i3, this.L0);
        k1(i3, this.E0);
        k1(gl.L(52.0f) + i + i2, this.N0);
        k1(gl.L(4.0f) + i + i2, this.M0);
        k1(gl.L(48.0f) + i + i2, this.c0);
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
            iea[] ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                return false;
            }
            iea ieaVar = ieaVarArr[i];
            if (ieaVar != null) {
                sca scaVar = ieaVar.h;
                if (scaVar != null && scaVar.d0()) {
                    return true;
                }
                hea heaVar = ieaVarArr[i].n;
                if (heaVar != null && heaVar.d0()) {
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
        iea P;
        nea neaVar;
        if (z && getY() != 0.0f && this.F) {
            return;
        }
        if (z && j0(i) && W(i) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.m1);
        bundle.putLong("topic_id", this.G);
        cfa[] cfaVarArr = this.w1;
        if (z && (P = P(0)) != null) {
            ArrayList arrayList = cfaVarArr[0].e;
            int K0 = P.x.K0();
            if (K0 >= 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        neaVar = null;
                        break;
                    } else {
                        if (K0 <= ((nea) arrayList.get(i3)).b) {
                            neaVar = (nea) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                }
                if (neaVar == null) {
                    neaVar = (nea) b00.f(1, arrayList);
                }
                if (neaVar != null) {
                    i2 = neaVar.c;
                    byte b = 9;
                    if (i != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    b81 b81Var = new b81(cfaVarArr[0].q, i2, bundle);
                    b81Var.N = new v39(this, b);
                    this.y1.presentFragment(b81Var);
                }
            }
        }
        i2 = 0;
        byte b2 = 9;
        if (i != 9) {
        }
        b81 b81Var2 = new b81(cfaVarArr[0].q, i2, bundle);
        b81Var2.N = new v39(this, b2);
        this.y1.presentFragment(b81Var2);
    }

    public final boolean o0() {
        lca lcaVar = this.b0;
        if (lcaVar != null && lcaVar.g()) {
            return true;
        }
        oca ocaVar = this.c0;
        return ocaVar != null && ocaVar.f;
    }

    public final void o1(int i) {
        int s1 = s1(getClosestTab());
        oca ocaVar = this.c0;
        if (s1 != i) {
            if (ocaVar != null) {
                ocaVar.b.e(i, ocaVar.d.i(i));
                return;
            }
            return;
        }
        ocaVar.setReorderingAlbums(true);
        mfa t1 = t1(i);
        iea P = P(t1.a);
        if (P == null) {
            return;
        }
        sca scaVar = P.h;
        for (int i2 = 0; i2 < scaVar.getChildCount(); i2++) {
            View childAt = scaVar.getChildAt(i2);
            if (childAt instanceof qfa) {
                ((qfa) childAt).l(true, true);
            }
        }
        lfa lfaVar = t1.c;
        if (lfaVar != null && !lfaVar.y) {
            lfaVar.y = true;
        }
        G1(true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        byte b = 0;
        int i = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                return;
            }
            sca scaVar = ieaVarArr[i].h;
            if (scaVar != null) {
                scaVar.getViewTreeObserver().addOnPreDrawListener(new qda(this, i, b));
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
        nfa nfaVar;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        cea ceaVar = this.G1;
        int height = ceaVar.e() != null ? ceaVar.e().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt == null || childAt.getVisibility() == 8) {
                nfaVar = this;
                i3 = i;
            } else if (childAt instanceof iea) {
                nfaVar = this;
                i3 = i;
                nfaVar.measureChildWithMargins(childAt, i3, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                sca scaVar = ((iea) childAt).h;
                scaVar.setPadding(0, scaVar.f3, 0, scaVar.g3);
            } else {
                nfaVar = this;
                i3 = i;
                i4 = i2;
                nfaVar.measureChildWithMargins(childAt, i3, 0, i4, 0);
                i5++;
                this = nfaVar;
                i = i3;
                i2 = i4;
            }
            i4 = i2;
            i5++;
            this = nfaVar;
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
                    je5 je5Var = this.H1;
                    if (je5Var != null) {
                        je5Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= gl.L(90.0f) + this.d2) {
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
                    iea[] ieaVarArr = this.n0;
                    if (z && (!this.k1 ? x < 0 : x > 0)) {
                        if (!b1(motionEvent, x < 0)) {
                            this.B1 = true;
                            this.A1 = false;
                            ieaVarArr[0].setTranslationX(0.0f);
                            ieaVarArr[1].setTranslationX(this.k1 ? ieaVarArr[0].getMeasuredWidth() : -ieaVarArr[0].getMeasuredWidth());
                            g1(0.0f, ieaVarArr[1].F);
                            T0(getTabProgress());
                        }
                    }
                    if (this.B1 && !this.A1) {
                        if (Math.abs(x) >= gl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                            b1(motionEvent, x < 0);
                        }
                    } else if (this.A1) {
                        ieaVarArr[0].setTranslationX(x);
                        if (this.k1) {
                            ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth() + x);
                        } else {
                            ieaVarArr[1].setTranslationX(x - ieaVarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x) / ieaVarArr[0].getMeasuredWidth();
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
                        g1(abs2, ieaVarArr[1].F);
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
            TLRPC.User V1 = na7.q1(dVar.getCurrentAccount()).V1(Long.valueOf(j));
            return V1 != null && V1.bot && V1.bot_can_edit;
        }
        if (s0()) {
            return true;
        }
        return dVar != null && dVar.getMessagesController().M1().g(j);
    }

    public final boolean p0(int i) {
        return i == 7 ? this.G1.X() : (q0() || i == 0 || j0(i) || i == 2 || i == 5 || i == 6 || i == 11 || i == 10 || i == 13 || i == 14 || i == 15) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p1(boolean z) {
        iea[] ieaVarArr;
        iea ieaVar;
        if (this.r1) {
            return;
        }
        Object[] objArr = 0;
        int i = 0;
        while (true) {
            ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                ieaVar = null;
                break;
            }
            int i2 = ieaVarArr[i].F;
            if (i2 == 0 || j0(i2)) {
                break;
            } else {
                i++;
            }
        }
        ieaVar = ieaVarArr[i];
        if (ieaVar != null) {
            int i3 = ieaVar.F;
            this.s1 = i3;
            boolean j0 = j0(i3);
            int[] iArr = this.p1;
            int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], z);
            this.t1 = R;
            if (R != iArr[j0 ? 1 : 0]) {
                if (this.n1 && j0(this.s1)) {
                    return;
                }
                ieaVar.n.setVisibility(0);
                boolean j02 = j0(this.s1);
                hea heaVar = ieaVar.n;
                if (j02) {
                    heaVar.setAdapter(w1(this.s1));
                } else {
                    heaVar.setAdapter(this.L);
                }
                hea heaVar2 = ieaVar.n;
                heaVar2.setPadding(heaVar2.getPaddingLeft(), T(this.s1), ieaVar.n.getPaddingRight(), S(s0()));
                ieaVar.r.x1(R);
                ieaVar.n.b0();
                ieaVar.r.O = new ida(this, ieaVar, objArr == true ? 1 : 0);
                gl.V3(ieaVar.h);
                this.r1 = true;
                if (this.s1 == 0) {
                    this.w1[0].g(true);
                }
                this.q1 = 0.0f;
                if (this.s < 0) {
                    e1();
                    return;
                }
                for (iea ieaVar2 : ieaVarArr) {
                    if (ieaVar2.F == this.s1) {
                        ieaVar2.r.g1(this.s, this.w - ieaVar2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    public boolean q() {
        return !(this instanceof qc5);
    }

    public boolean q0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void q1() {
        int i = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                return;
            }
            int childCount = ieaVarArr[i].h.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ieaVarArr[i].h.getChildAt(i2);
                if (childAt instanceof bw2) {
                    ImageReceiver photoImage = ((bw2) childAt).getPhotoImage();
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

    public final boolean r() {
        iea ieaVar;
        iea[] ieaVarArr = this.n0;
        if (ieaVarArr != null && (ieaVar = ieaVarArr[0]) != null) {
            boolean j0 = j0(ieaVar.F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, true)) {
                return true;
            }
        }
        return false;
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
                iea[] ieaVarArr = this.n0;
                float x = ieaVarArr[0].getX();
                this.i1 = new AnimatorSet();
                this.l1 = Math.abs(x) < ((float) ieaVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new x89(this, (byte) 26));
                boolean z = this.l1;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x);
                    boolean z2 = this.k1;
                    AnimatorSet animatorSet = this.i1;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ieaVarArr[0], (Property<iea, Float>) property, 0.0f), ObjectAnimator.ofFloat(ieaVarArr[1], (Property<iea, Float>) property, r14.getMeasuredWidth()), ofFloat);
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ieaVarArr[0], (Property<iea, Float>) property, 0.0f), ObjectAnimator.ofFloat(ieaVarArr[1], (Property<iea, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = ieaVarArr[0].getMeasuredWidth() - Math.abs(x);
                    boolean z3 = this.k1;
                    AnimatorSet animatorSet2 = this.i1;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ieaVarArr[0], (Property<iea, Float>) property, -r8.getMeasuredWidth()), ObjectAnimator.ofFloat(ieaVarArr[1], (Property<iea, Float>) property, 0.0f), ofFloat);
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ieaVarArr[0], (Property<iea, Float>) property, r8.getMeasuredWidth()), ObjectAnimator.ofFloat(ieaVarArr[1], (Property<iea, Float>) property, 0.0f), ofFloat);
                    }
                }
                this.i1.setInterpolator(u2);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (gl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                this.i1.setDuration(Math.max(kk7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                this.i1.addListener(new nda(this, b));
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

    public boolean s0() {
        return false;
    }

    public final int s1(int i) {
        mfa u1 = u1(i);
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
                    cfa[] cfaVarArr = this.w1;
                    if (i >= cfaVarArr.length) {
                        break;
                    }
                    if (cfaVarArr[i].b[1].size() == 0) {
                        cfa cfaVar = cfaVarArr[i];
                        cfaVar.j[1] = this.g1.migrated_from_max_id;
                        cfaVar.i[1] = false;
                    }
                    i++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 == null || z == chatFull3.stories_pinned_available) {
            return;
        }
        kda kdaVar = this.L0;
        if (kdaVar != null) {
            kdaVar.setInitialTabId(k0() ? 9 : 8);
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

    public void setForwardRestrictedHint(je5 je5Var) {
        this.H1 = je5Var;
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
            iea[] ieaVarArr = this.n0;
            if (i5 >= ieaVarArr.length) {
                break;
            }
            ieaVarArr[i5].setTranslationY(this.O1);
            i5++;
        }
        fj3 fj3Var = this.S0;
        if (fj3Var == null) {
            gda gdaVar = this.U0;
            if (gdaVar != null) {
                gdaVar.setTranslationY(gl.L(48.0f) + i2);
            }
        } else if (fj3Var != null) {
            fj3Var.setTranslationY(this.O1);
        }
        this.R0 = i2;
        uk1 uk1Var = this.N0;
        uk1Var.setTranslationY((uk1Var.getTag() == null ? -gl.L(48.0f) : 0) + this.R0);
    }

    public void setPagesGlassEngine(qw4 qw4Var) {
        this.h2 = qw4Var;
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            lcaVar.setGlassEngine(qw4Var);
        }
        for (iea ieaVar : this.n0) {
            if (ieaVar != null) {
                ieaVar.h.setCaptureSectionsDecoratorAllowed(true);
                qw4Var.b(ieaVar.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i) {
        if (this.b2 != i) {
            this.b2 = i;
            iea[] ieaVarArr = this.n0;
            if (ieaVarArr != null) {
                for (iea ieaVar : ieaVarArr) {
                    if (ieaVar != null) {
                        sca scaVar = ieaVar.h;
                        int paddingLeft = scaVar.getPaddingLeft();
                        sca scaVar2 = ieaVar.h;
                        int i2 = scaVar2.f3;
                        int paddingRight = scaVar2.getPaddingRight();
                        sca scaVar3 = ieaVar.h;
                        int S = S(s0());
                        scaVar3.i3 = S;
                        scaVar.setPadding(paddingLeft, i2, paddingRight, S);
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
            iea[] ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                return;
            }
            D1(ieaVarArr[i], true);
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
            iea[] ieaVarArr = this.n0;
            if (i2 >= ieaVarArr.length) {
                break;
            }
            float f = (-(getMeasuredHeight() - Math.max(i, gl.L(ieaVarArr[i2].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            ieaVarArr[i2].w.setTranslationY(f);
            ieaVarArr[i2].s.setTranslationY(-f);
            i2++;
        }
        kca kcaVar = this.a0;
        if (kcaVar != null) {
            kcaVar.setVisibleHeight(i);
        }
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            lcaVar.setVisibleHeight(i);
        }
    }

    public final boolean t() {
        iea ieaVar;
        iea[] ieaVarArr = this.n0;
        if (ieaVarArr != null && (ieaVar = ieaVarArr[0]) != null && (!this.n1 || !j0(ieaVar.F))) {
            boolean j0 = j0(ieaVarArr[0].F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, false)) {
                return true;
            }
        }
        return false;
    }

    public final mfa t1(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.m2;
        mfa mfaVar = (mfa) hashMap.get(valueOf);
        if (mfaVar != null) {
            return mfaVar;
        }
        mfa mfaVar2 = new mfa(this, getContext(), i);
        hashMap.put(Integer.valueOf(i), mfaVar2);
        this.n2.put(Integer.valueOf(mfaVar2.a), Integer.valueOf(i));
        return mfaVar2;
    }

    public final void u(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        kca kcaVar;
        vda vdaVar;
        lca lcaVar;
        iea[] ieaVarArr = this.n0;
        int length = ieaVarArr.length;
        for (int i = 0; i < length; i++) {
            iea ieaVar = ieaVarArr[i];
            if (ieaVar != null && ieaVar.getVisibility() == 0) {
                if (ieaVar.P != null) {
                    RectF rectF2 = this.j2;
                    if (zec.c(ieaVar, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        ieaVar.c(canvas);
                        canvas.restore();
                    }
                }
                if (ieaVar.F == 14 && (lcaVar = this.b0) != null && lcaVar.getParent() == ieaVar) {
                    for (View view : lcaVar.h.getViewPages()) {
                        if ((view instanceof pq8) && view.getVisibility() == 0) {
                            va vaVar = ((pq8) view).f;
                            tk0.a(vaVar, canvas, rectF, vaVar, viewGroup);
                        }
                    }
                } else {
                    o39 currentListView = (ieaVar.F == 12 && (vdaVar = this.W) != null && vdaVar.getParent() == ieaVar) ? vdaVar.a.A0 : (ieaVar.F == 13 && (kcaVar = this.a0) != null && kcaVar.getParent() == ieaVar) ? kcaVar.getCurrentListView() : ieaVar.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        tk0.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public final boolean u0() {
        if (p() && ((getClosestTab() == 8 || getClosestTab() == 13 || t0(getClosestTab())) && this.F1)) {
            return false;
        }
        lca lcaVar = this.b0;
        if (lcaVar != null && lcaVar.g()) {
            return false;
        }
        oca ocaVar = this.c0;
        return ((ocaVar != null && ocaVar.f) || this.r1 || this.j1) ? false : true;
    }

    public final mfa u1(int i) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return (mfa) this.m2.get(num);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.J1.a(c0(bkb.c6));
            ed0 ed0Var = this.G0;
            if (ed0Var != null) {
                ed0Var.a(c0(bkb.x8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(c0(bkb.x8));
            }
            B1();
            invalidate();
            for (iea ieaVar : this.n0) {
                if (ieaVar != null && ieaVar.M) {
                    ieaVar.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void v0(int i, int i2, int i3, boolean z) {
        cfa[] cfaVarArr = this.w1;
        cfaVarArr[i].a.clear();
        cfaVarArr[i].b[0].clear();
        cfaVarArr[i].b[1].clear();
        cfa cfaVar = cfaVarArr[i];
        cfaVar.j[0] = i2;
        cfaVar.i[0] = false;
        cfaVar.l = false;
        cfaVar.m = i3;
        cfaVar.n = (cfaVar.e() - i3) - 1;
        cfa cfaVar2 = cfaVarArr[i];
        if (cfaVar2.n < 0) {
            cfaVar2.n = 0;
        }
        cfaVar2.k = i2;
        cfaVar2.o = true;
        cfaVar2.g = false;
        cfaVar2.p++;
        iea P = P(i);
        if (P != null && P.h.getAdapter() != null) {
            P.h.getAdapter().f();
        }
        if (!z) {
            return;
        }
        int i4 = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i4 >= ieaVarArr.length) {
                return;
            }
            iea ieaVar = ieaVarArr[i4];
            if (ieaVar.F == i) {
                ieaVar.x.g1(Math.min(cfaVarArr[i].e() - 1, cfaVarArr[i].m), 0);
            }
            i4++;
        }
    }

    public final kfa v1(int i) {
        mfa u1;
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

    public final /* synthetic */ void w0(String str) {
        getStoriesController().q(this.m1, str, new nba(this, (byte) 0));
    }

    public final kfa w1(int i) {
        mfa u1;
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
        nfa nfaVar;
        ArrayList arrayList;
        byte b;
        int i;
        Bitmap bitmap;
        iea P = P(0);
        if (P != null && P.getMeasuredHeight() > 0 && P.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(P.getMeasuredWidth(), P.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                fa4.g(e, true);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.L1 = true;
                P.h.draw(new Canvas(bitmap2));
                View view = new View(P.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                P.addView(view);
                nfaVar = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new ga2((Object) nfaVar, (Object) view, (Object) P, (Object) bitmap2, (byte) 4)).start();
                P.h.setAlpha(0.0f);
                P.h.animate().alpha(1.0f).setUpdateListener(new x89(P, (byte) 27)).setDuration(200L).start();
                ffa ffaVar = nfaVar.x1;
                int[] iArr = ffaVar.c;
                arrayList = ffaVar.n[0].a;
                cfa[] cfaVarArr = nfaVar.w1;
                cfa cfaVar = cfaVarArr[0];
                int[] iArr2 = cfaVar.f;
                iArr2[1] = 0;
                b = cfaVar.q;
                if (b != 0) {
                    iArr2[0] = iArr[0];
                } else if (b == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                cfaVar.h = false;
                long j = nfaVar.m1;
                nfaVar.v0(0, !cf3.B(j) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                nfaVar.G0(false);
                nfaVar.G1.V();
                boolean B = cf3.B(j);
                for (i = 0; i < arrayList.size(); i++) {
                    k27 k27Var = (k27) arrayList.get(i);
                    cfa cfaVar2 = cfaVarArr[0];
                    byte b2 = cfaVar2.q;
                    if (b2 == 0) {
                        cfaVar2.a(k27Var, 0, false, B);
                    } else if (b2 == 1) {
                        if (k27.R3(k27Var.k)) {
                            cfaVarArr[0].a(k27Var, 0, false, B);
                        }
                    } else if (!k27.R3(k27Var.k)) {
                        cfaVarArr[0].a(k27Var, 0, false, B);
                    }
                }
            }
        }
        nfaVar = this;
        ffa ffaVar2 = nfaVar.x1;
        int[] iArr3 = ffaVar2.c;
        arrayList = ffaVar2.n[0].a;
        cfa[] cfaVarArr2 = nfaVar.w1;
        cfa cfaVar3 = cfaVarArr2[0];
        int[] iArr22 = cfaVar3.f;
        iArr22[1] = 0;
        b = cfaVar3.q;
        if (b != 0) {
        }
        cfaVar3.h = false;
        long j2 = nfaVar.m1;
        nfaVar.v0(0, !cf3.B(j2) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        nfaVar.G0(false);
        nfaVar.G1.V();
        boolean B2 = cf3.B(j2);
        while (i < arrayList.size()) {
        }
    }

    public final void x0(TL_stories.StoryItem storyItem, z1b z1bVar) {
        getStoriesController().b(z1bVar.a, this.m1, storyItem);
        gl.d3(new t7a((Object) this, (Object) z1bVar, (byte) 2), 100L);
    }

    public final int x1(w39 w39Var) {
        if (w39Var == this.f0) {
            return 8;
        }
        if (w39Var == this.h0) {
            return 9;
        }
        for (mfa mfaVar : this.m2.values()) {
            if (mfaVar.c == w39Var) {
                return mfaVar.a;
            }
        }
        return -1;
    }

    public final void y() {
        kda kdaVar = this.L0;
        if (kdaVar.d(kdaVar.getCurrentTabId())) {
            return;
        }
        int firstTabId = kdaVar.getFirstTabId();
        kdaVar.setInitialTabId(firstTabId);
        this.n0[0].F = firstTabId;
        z1(false);
    }

    public final /* synthetic */ void y0(TL_stories.StoryItem storyItem, String str) {
        getStoriesController().q(this.m1, str, new nu9(this, storyItem, (byte) 5));
    }

    public final int y1(w39 w39Var) {
        if (w39Var == this.g0) {
            return 8;
        }
        if (w39Var == this.i0) {
            return 9;
        }
        for (mfa mfaVar : this.m2.values()) {
            if (mfaVar.d == w39Var) {
                return mfaVar.a;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, sca] */
    public final void z(iea ieaVar, o39 o39Var, t26 t26Var) {
        boolean z;
        int i;
        int i2;
        s49 K;
        boolean z2;
        k27 k27Var;
        ?? r4;
        y1b y1bVar;
        if (this.r1 || this.N1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (o39Var.getFastScroll() == null || !o39Var.getFastScroll().n || currentTimeMillis - ieaVar.a >= 300) {
            ieaVar.a = currentTimeMillis;
            if ((this.Y0 && this.X0 && ieaVar.F != 11) || ieaVar.F == 7) {
                return;
            }
            int K0 = t26Var.K0();
            int abs = K0 == -1 ? 0 : Math.abs(t26Var.M0() - K0) + 1;
            int b = o39Var.getAdapter() == null ? 0 : o39Var.getAdapter().b();
            int i3 = ieaVar.F;
            int[] iArr = this.p1;
            byte b2 = 6;
            cfa[] cfaVarArr = this.w1;
            if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4) {
                b = cfaVarArr[i3].d() + cfaVarArr[i3].a.size();
                cfa cfaVar = cfaVarArr[i3];
                z = false;
                if (cfaVar.h && cfaVar.e.size() > 2 && ieaVar.F == 0 && cfaVarArr[i3].a.size() != 0) {
                    float f = i3 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((o39Var.getMeasuredHeight() / (o39Var.getMeasuredWidth() / f)) * f * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((nea) cfaVarArr[i3].e.get(1)).b) {
                        measuredHeight = ((nea) cfaVarArr[i3].e.get(1)).b;
                    }
                    if ((K0 > b && K0 - b > measuredHeight) || ((i = K0 + abs) < cfaVarArr[i3].m && cfaVarArr[0].m - i > measuredHeight)) {
                        t79 t79Var = new t79(this, i3, o39Var, b2);
                        this.N1 = t79Var;
                        gl.c3(t79Var);
                        return;
                    }
                }
            } else {
                z = false;
            }
            int i4 = ieaVar.F;
            if (i4 != 7) {
                boolean j0 = j0(i4);
                int i5 = ieaVar.F;
                if (j0) {
                    kfa v1 = v1(i5);
                    if (v1 == null || (y1bVar = v1.s) == null || K0 + abs <= y1bVar.i() - iArr[1]) {
                        return;
                    }
                    v1.P();
                    return;
                }
                if (i5 == 6) {
                    if (abs > 0) {
                        bea beaVar = this.S;
                        boolean z3 = beaVar.h;
                        ArrayList arrayList = beaVar.d;
                        if (z3 || beaVar.e || arrayList.isEmpty() || K0 + abs < b - 5) {
                            return;
                        }
                        beaVar.E(((TLRPC.Chat) b00.f(1, arrayList)).id);
                        return;
                    }
                    return;
                }
                d dVar = this.y1;
                if (i5 == 11) {
                    ?? r2 = z;
                    int i6 = -1;
                    while (true) {
                        int childCount = ieaVar.h.getChildCount();
                        r4 = ieaVar.h;
                        if (r2 >= childCount) {
                            break;
                        }
                        View childAt = r4.getChildAt(r2);
                        ieaVar.h.getClass();
                        i6 = Math.max(RecyclerView.R(childAt), i6);
                        r2++;
                    }
                    w39 adapter = r4.getAdapter();
                    zea zeaVar = this.V;
                    int i7 = i6 + 1;
                    if (adapter != zeaVar) {
                        if (i7 >= dVar.getMessagesController().D1().i.size()) {
                            dVar.getMessagesController().D1().g(z);
                            return;
                        }
                        return;
                    } else {
                        if (i7 < zeaVar.h.size() + zeaVar.e.size() || zeaVar.s || zeaVar.r) {
                            return;
                        }
                        zeaVar.r = true;
                        zeaVar.F();
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
                if (abs + K0 > b - i8 || cfaVarArr[i9].o) {
                    cfa cfaVar2 = cfaVarArr[i9];
                    if (!cfaVar2.g) {
                        if (i5 == 0) {
                            byte b3 = cfaVarArr[0].q;
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
                        boolean[] zArr = cfaVar2.i;
                        if (!zArr[0]) {
                            cfaVar2.g = true;
                            dVar.getMediaDataController().P0(this.m1, 50, cfaVarArr[i9].j[0], 0, i2, this.G, 1, dVar.getClassGuid(), cfaVarArr[i9].p, null, null);
                        } else if (this.f1 != 0 && !zArr[1]) {
                            cfaVar2.g = true;
                            dVar.getMediaDataController().P0(this.f1, 50, cfaVarArr[i9].j[1], 0, i2, this.G, 1, dVar.getClassGuid(), cfaVarArr[i9].p, null, null);
                        }
                    }
                }
                int i11 = cfaVarArr[i9].m;
                if (i9 == 0) {
                    i11 = this.K.L(0);
                }
                if (K0 - i11 < i8 + 1) {
                    cfa cfaVar3 = cfaVarArr[i9];
                    if (!cfaVar3.g && !cfaVar3.l && !cfaVar3.o) {
                        H0(ieaVar.F);
                    }
                }
                iea ieaVar2 = this.n0[0];
                if (ieaVar2.h == o39Var) {
                    int i12 = ieaVar2.F;
                    if ((i12 != 0 && i12 != 5) || K0 == -1 || (K = o39Var.K(K0)) == null) {
                        return;
                    }
                    int i13 = K.f;
                    if (i13 == 0 || i13 == 12) {
                        View view = K.a;
                        boolean z4 = view instanceof rfa;
                        uk1 uk1Var = this.N0;
                        if (!z4) {
                            if (view instanceof bw2) {
                                uk1Var.i0(((bw2) view).getDate(), false, true);
                                return;
                            }
                            return;
                        }
                        rfa rfaVar = (rfa) view;
                        if (rfaVar.e <= 0) {
                            k27Var = null;
                            z2 = false;
                        } else {
                            z2 = false;
                            k27Var = rfaVar.b[0];
                        }
                        if (k27Var != null) {
                            uk1Var.i0(k27Var.k.date, z2, true);
                        }
                    }
                }
            }
        }
    }

    public final void z0(HashSet hashSet, TL_stories.StoryItem storyItem, cs5 cs5Var, z1b z1bVar) {
        String a0;
        boolean contains = hashSet.contains(Integer.valueOf(z1bVar.a));
        long j = this.m1;
        if (contains) {
            getStoriesController().b(z1bVar.a, j, storyItem);
            a0 = k96.a0(null, null, 2131744494, z1bVar.b);
        } else {
            g2b storiesController = getStoriesController();
            int i = z1bVar.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.e0(i, j, arrayList);
            a0 = k96.a0(null, null, 2131744254, z1bVar.b);
        }
        u21.b0(this.y1).Q(R.raw.contact_check, 36, gl.S2(a0)).j();
        cs5Var.u();
    }

    public final void z1(boolean z) {
        iea[] ieaVarArr;
        iea[] ieaVarArr2;
        r7 r7Var;
        k49 k49Var;
        boolean z2;
        boolean z3;
        boolean z4;
        k49 k49Var2;
        int i;
        byte b;
        int i2;
        boolean z5;
        k49 k49Var3;
        int i3;
        int i4;
        boolean z6;
        k49 k49Var4;
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            lcaVar.i();
        }
        int i5 = 0;
        while (true) {
            ieaVarArr = this.n0;
            if (i5 >= ieaVarArr.length) {
                break;
            }
            ieaVarArr[i5].h.D0();
            i5++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ieaVarArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = gl.L(I0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        w39 adapter = ieaVarArr[z ? 1 : 0].h.getAdapter();
        w39 w39Var = this.f0;
        is5 is5Var = this.e0;
        if (adapter == w39Var) {
            is5Var.h(null);
        }
        boolean z7 = this.Y0;
        pha phaVar = this.I;
        cea ceaVar = this.G1;
        a aVar = this.H;
        wea weaVar = this.Q;
        r7 r7Var2 = this.q0;
        int i6 = 100;
        if (z7 && this.X0) {
            iea ieaVar = ieaVarArr[z ? 1 : 0];
            if (ieaVar.f == null) {
                ieaVar.f = new k49();
            }
            iea ieaVar2 = ieaVarArr[z ? 1 : 0];
            k49 k49Var5 = ieaVar2.f;
            zea zeaVar = this.V;
            gea geaVar = this.m0;
            kea keaVar = this.k0;
            kea keaVar2 = this.l0;
            kea keaVar3 = this.j0;
            if (z) {
                int i7 = ieaVar2.F;
                if (i7 != 0) {
                    k49Var4 = k49Var5;
                    if (i7 != 2 && i7 != 5 && i7 != 6 && (i7 != 7 || ceaVar.X())) {
                        String obj = r7Var2 != null ? r7Var2.getSearchField().getText().toString() : "";
                        int i8 = ieaVarArr[z ? 1 : 0].F;
                        if (i8 == 1) {
                            if (keaVar3 != null) {
                                keaVar3.G(obj, false);
                                if (adapter != keaVar3) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar3);
                                }
                            }
                        } else if (i8 == 3) {
                            if (keaVar2 != null) {
                                keaVar2.G(obj, false);
                                if (adapter != keaVar2) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar2);
                                }
                            }
                        } else if (i8 == 4) {
                            if (keaVar != null) {
                                keaVar.G(obj, false);
                                if (adapter != keaVar) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar);
                                }
                            }
                        } else if (i8 == 7) {
                            if (geaVar != null) {
                                geaVar.F(obj, false);
                                if (adapter != geaVar) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(geaVar);
                                }
                            }
                        } else if (i8 == 11) {
                            if (zeaVar != null) {
                                zeaVar.E(this.Z0, obj);
                                if (adapter != zeaVar) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(zeaVar);
                                }
                            }
                        } else if (i8 == 15 && weaVar != null && adapter != weaVar) {
                            d1(adapter);
                            sca scaVar = ieaVarArr[z ? 1 : 0].h;
                            weaVar.r = scaVar;
                            scaVar.setAdapter(weaVar);
                        }
                    }
                }
                this.Y0 = false;
                hda hdaVar = this.M0;
                if (hdaVar != null) {
                    hdaVar.g(false);
                }
                this.X0 = false;
                z1(true);
                return;
            }
            k49Var4 = k49Var5;
            if (ieaVar2.h != null) {
                int i9 = ieaVar2.F;
                if (i9 == 1) {
                    if (adapter != keaVar3) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar3);
                    }
                    keaVar3.f();
                } else if (i9 == 3) {
                    if (adapter != keaVar2) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar2);
                    }
                    keaVar2.f();
                } else if (i9 == 4) {
                    if (adapter != keaVar) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar);
                    }
                    keaVar.f();
                } else if (i9 == 7) {
                    if (adapter != geaVar) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(geaVar);
                    }
                    geaVar.f();
                } else if (i9 == 11) {
                    if (adapter != zeaVar) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(zeaVar);
                    }
                    zeaVar.f();
                }
            }
            ieaVarArr2 = ieaVarArr;
            r7Var = r7Var2;
            k49Var3 = k49Var4;
            b = 4;
            z4 = false;
            z5 = false;
            i2 = 8;
        } else {
            iea ieaVar3 = ieaVarArr[z ? 1 : 0];
            if (ieaVar3.e == null) {
                ieaVar3.e = new k49();
            }
            iea ieaVar4 = ieaVarArr[z ? 1 : 0];
            k49 k49Var6 = ieaVar4.e;
            ieaVar4.h.setPinnedHeaderShadowDrawable(null);
            int i10 = ieaVarArr[z ? 1 : 0].F;
            if (i10 == 8 || t0(i10)) {
                layoutParams.topMargin = gl.L(I0());
            }
            sca scaVar2 = ieaVarArr[z ? 1 : 0].h;
            int paddingLeft = scaVar2.getPaddingLeft();
            iea ieaVar5 = ieaVarArr[z ? 1 : 0];
            ieaVarArr2 = ieaVarArr;
            sca scaVar3 = ieaVar5.h;
            int T = T(ieaVar5.F);
            scaVar3.h3 = T;
            int paddingRight = ieaVarArr2[z ? 1 : 0].h.getPaddingRight();
            sca scaVar4 = ieaVarArr2[z ? 1 : 0].h;
            int S = S(s0());
            scaVar4.i3 = S;
            scaVar2.setPadding(paddingLeft, T, paddingRight, S);
            int i11 = ieaVarArr2[z ? 1 : 0].F;
            int[] iArr = this.p1;
            w39 w39Var2 = this.N;
            bea beaVar = this.S;
            yea yeaVar = this.U;
            View view = this.a0;
            vda vdaVar = this.W;
            r7Var = r7Var2;
            cfa[] cfaVarArr = this.w1;
            if (i11 == 0) {
                w39 w39Var3 = this.K;
                if (adapter != w39Var3) {
                    d1(adapter);
                    ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var3);
                }
                int i12 = -gl.L(1.0f);
                layoutParams.rightMargin = i12;
                layoutParams.leftMargin = i12;
                cfa cfaVar = cfaVarArr[0];
                boolean z8 = cfaVar.h && !cfaVar.e.isEmpty();
                i6 = iArr[0];
                ieaVarArr2[z ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                k49Var = cfaVarArr[0].x;
                z4 = z8;
                z2 = false;
            } else {
                if (i11 == 1) {
                    cfa cfaVar2 = cfaVarArr[1];
                    z3 = cfaVar2.h && !cfaVar2.e.isEmpty();
                    if (adapter != w39Var2) {
                        d1(adapter);
                        ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var2);
                    }
                } else if (i11 == 2) {
                    cfa cfaVar3 = cfaVarArr[2];
                    z3 = cfaVar3.h && !cfaVar3.e.isEmpty();
                    w39 w39Var4 = this.O;
                    if (adapter != w39Var4) {
                        d1(adapter);
                        ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var4);
                    }
                } else {
                    if (i11 == 3) {
                        w39 w39Var5 = this.M;
                        if (adapter != w39Var5) {
                            d1(adapter);
                            ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var5);
                        }
                    } else if (i11 == 4) {
                        cfa cfaVar4 = cfaVarArr[4];
                        z3 = cfaVar4.h && !cfaVar4.e.isEmpty();
                        w39 w39Var6 = this.P;
                        if (adapter != w39Var6) {
                            d1(adapter);
                            ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var6);
                        }
                    } else {
                        if (i11 == 5) {
                            w39 w39Var7 = this.R;
                            if (adapter != w39Var7) {
                                d1(adapter);
                                ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var7);
                            }
                        } else if (i11 == 15) {
                            if (adapter != weaVar) {
                                d1(adapter);
                                sca scaVar5 = ieaVarArr2[z ? 1 : 0].h;
                                weaVar.r = scaVar5;
                                scaVar5.setAdapter(weaVar);
                            }
                        } else if (i11 == 6) {
                            if (adapter != beaVar) {
                                d1(adapter);
                                ieaVarArr2[z ? 1 : 0].h.setAdapter(beaVar);
                            }
                        } else if (i11 == 7) {
                            w39 w39Var8 = this.d0;
                            if (adapter != w39Var8) {
                                d1(adapter);
                                ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var8);
                            }
                        } else if (j0(i11)) {
                            w39 v1 = v1(ieaVarArr2[z ? 1 : 0].F);
                            if (adapter != v1) {
                                d1(adapter);
                                ieaVarArr2[z ? 1 : 0].h.setAdapter(v1);
                                ieaVarArr2[z ? 1 : 0].h.getClass();
                            }
                            iea ieaVar6 = ieaVarArr2[z ? 1 : 0];
                            if (ieaVar6.F != 9) {
                                is5Var.h(ieaVar6.h);
                            }
                            i6 = iArr[1];
                        } else {
                            int i13 = ieaVarArr2[z ? 1 : 0].F;
                            if (i13 == 10) {
                                w39 w39Var9 = this.T;
                                if (adapter != w39Var9) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var9);
                                }
                            } else if (i13 == 11) {
                                if (adapter != yeaVar) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(yeaVar);
                                    is5 is5Var2 = yeaVar.w;
                                    sca scaVar6 = ieaVarArr2[z ? 1 : 0].h;
                                    yeaVar.s = scaVar6;
                                    is5Var2.h(scaVar6);
                                }
                                k49Var = yeaVar.r;
                                z2 = true;
                                z4 = false;
                            } else if (i13 == 12) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (vdaVar.getParent() != ieaVarArr2[z ? 1 : 0]) {
                                    gl.B2(vdaVar);
                                    ieaVarArr2[z ? 1 : 0].addView(vdaVar, nme.d(-1, -1.0f, kk7.D1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    k1(gl.L(56.0f) + this.d2, vdaVar);
                                }
                            } else if (i13 == 13) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != ieaVarArr2[z ? 1 : 0]) {
                                    gl.B2(view);
                                    ieaVarArr2[z ? 1 : 0].addView(view);
                                    k1(this.d2, view);
                                }
                            } else if (i13 == 14) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (lcaVar != null && lcaVar.getParent() != ieaVarArr2[z ? 1 : 0]) {
                                    gl.B2(lcaVar);
                                    ieaVarArr2[z ? 1 : 0].addView(lcaVar);
                                    ieaVarArr2[z ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        k49Var = k49Var6;
                        z2 = false;
                        z4 = false;
                    }
                    k49Var = k49Var6;
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                k49Var = k49Var6;
                z2 = true;
            }
            I1(ieaVarArr2[z ? 1 : 0]);
            if (z2) {
                ieaVarArr2[z ? 1 : 0].h.setSections(false);
                k49Var2 = k49Var;
            } else {
                sca scaVar7 = ieaVarArr2[z ? 1 : 0].h;
                scaVar7.getClass();
                k49Var2 = k49Var;
                zkb.l(scaVar7, 20, bkb.h6, scaVar7.o2);
                scaVar7.U2 = false;
                scaVar7.I2 = null;
                scaVar7.J2 = null;
                scaVar7.M2 = 0.0f;
                scaVar7.N2 = null;
                scaVar7.O2 = null;
                scaVar7.K2 = null;
                a39 a39Var = scaVar7.H2;
                if (a39Var != null) {
                    scaVar7.r0(a39Var);
                    scaVar7.H2 = null;
                }
                yj0 yj0Var = scaVar7.S2;
                if (yj0Var != null) {
                    scaVar7.r0(yj0Var);
                    scaVar7.S2 = null;
                }
            }
            H1(ieaVarArr2[z ? 1 : 0]);
            iea ieaVar7 = ieaVarArr2[z ? 1 : 0];
            int i14 = ieaVar7.F;
            sca scaVar8 = ieaVar7.h;
            if (i14 == 11) {
                scaVar8.setItemAnimator(ieaVar7.d);
            } else {
                scaVar8.setItemAnimator(null);
                if (yeaVar != null && ieaVarArr2[z ? 1 : 0].h == yeaVar.s) {
                    is5 is5Var3 = yeaVar.w;
                    yeaVar.s = null;
                    is5Var3.h(null);
                }
            }
            if (vdaVar != null && ieaVarArr2[z ? 1 : 0].F != 12 && vdaVar.getParent() == ieaVarArr2[z ? 1 : 0]) {
                vdaVar.a.onRemoveFromParent();
                ieaVarArr2[z ? 1 : 0].removeView(vdaVar);
            }
            if (view != null && ieaVarArr2[z ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                iea ieaVar8 = ieaVarArr2[z ? 1 : 0];
                if (parent == ieaVar8) {
                    ieaVar8.removeView(view);
                }
            }
            if (lcaVar != null && ieaVarArr2[z ? 1 : 0].F != 14) {
                ViewParent parent2 = lcaVar.getParent();
                iea ieaVar9 = ieaVarArr2[z ? 1 : 0];
                if (parent2 == ieaVar9) {
                    ieaVar9.removeView(lcaVar);
                }
            }
            int i15 = ieaVarArr2[z ? 1 : 0].F;
            if (i15 != 0 && i15 != 11 && !j0(i15) && (i3 = ieaVarArr2[z ? 1 : 0].F) != 2 && i3 != 5 && i3 != 6 && ((i3 != 7 || ceaVar.X()) && (i4 = ieaVarArr2[z ? 1 : 0].F) != 10 && i4 != 13 && i4 != 14)) {
                if (z) {
                    if (r7Var != null && r7Var.getVisibility() == 4) {
                        if (!(phaVar != null ? phaVar.G : aVar.o0)) {
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
            int i16 = ieaVarArr2[z ? 1 : 0].F;
            if (i16 == 6) {
                if (!beaVar.e && !beaVar.h && beaVar.d.isEmpty()) {
                    beaVar.E(0L);
                }
            } else if (i16 != 7) {
                if (j0(i16)) {
                    kfa v12 = v1(ieaVarArr2[z ? 1 : 0].F);
                    if (v12 != null) {
                        y1b y1bVar = v12.s;
                        v12.P();
                        ieaVarArr2[z ? 1 : 0].w.e(y1bVar != null && (y1bVar.k() || (d0() && y1bVar.g() > 0)), z);
                        z4 = (y1bVar == null || y1bVar.g() <= 0 || q0()) ? false : true;
                    }
                } else {
                    int i17 = ieaVarArr2[z ? 1 : 0].F;
                    if (i17 != 10 && i17 != 11 && i17 != 12 && i17 != 13 && i17 != 14) {
                        if (i17 == 15) {
                            i17 = 8;
                        }
                        cfa cfaVar5 = cfaVarArr[i17];
                        if (!cfaVar5.g && !cfaVar5.i[0] && cfaVar5.a.isEmpty()) {
                            cfaVarArr[i17].g = true;
                            w39Var2.f();
                            if (i17 == 0) {
                                byte b2 = cfaVarArr[0].q;
                                if (b2 == 1) {
                                    i = 6;
                                } else if (b2 == 2) {
                                    i = 7;
                                }
                                d dVar = this.y1;
                                dVar.getMediaDataController().P0(this.m1, 50, 0, 0, i, this.G, 1, dVar.getClassGuid(), cfaVarArr[i].p, null, null);
                            }
                            i = i17;
                            d dVar2 = this.y1;
                            dVar2.getMediaDataController().P0(this.m1, 50, 0, 0, i, this.G, 1, dVar2.getClassGuid(), cfaVarArr[i].p, null, null);
                        }
                    }
                }
            }
            int i18 = ieaVarArr2[z ? 1 : 0].F;
            if (i18 == 8 || t0(i18)) {
                b = 4;
                iea ieaVar10 = ieaVarArr2[z ? 1 : 0];
                eda edaVar = ieaVar10.w;
                boolean t0 = t0(ieaVar10.F);
                int s1 = s1(ieaVarArr2[z ? 1 : 0].F);
                be0 be0Var = edaVar.b;
                u41 u41Var = edaVar.f;
                be0Var.setVisibility((t0 || r0() || l0()) ? 8 : 0);
                if (t0) {
                    u41Var.setVisibility(0);
                    u41Var.h(k96.M0(2131744568, null), false);
                    i2 = 8;
                } else if (r0()) {
                    i2 = 8;
                    u41Var.setVisibility(8);
                } else {
                    i2 = 8;
                    edaVar.setStickerType(11);
                    u41Var.setVisibility(!q0() ? 0 : 8);
                    u41Var.h(f(), false);
                }
                wla wlaVar = edaVar.d;
                if (t0) {
                    wlaVar.setText(k96.M0(2131744546, null));
                    edaVar.e.setText(k96.M0(2131744547, null));
                } else {
                    wlaVar.setText(k96.M0(!q0() ? s0() ? 2131747984 : 2131747955 : 2131748012, null));
                    edaVar.e.setText(s0() ? k96.M0(2131747956, null) : "");
                }
                u41Var.setOnClickListener(new yp8(this, t0, s1, (byte) 1));
            } else {
                iea ieaVar11 = ieaVarArr2[z ? 1 : 0];
                if (ieaVar11.F == 9) {
                    if (r0()) {
                        ieaVarArr2[z ? 1 : 0].w.b.setVisibility(8);
                        ieaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        ieaVarArr2[z ? 1 : 0].w.b.setVisibility(0);
                        ieaVarArr2[z ? 1 : 0].w.setStickerType(11);
                        ieaVarArr2[z ? 1 : 0].w.f.setVisibility(0);
                        ieaVarArr2[z ? 1 : 0].w.f.h(f(), false);
                    }
                    ieaVarArr2[z ? 1 : 0].w.d.setText(k96.M0(2131748054, null));
                    ieaVarArr2[z ? 1 : 0].w.e.setText(s0() ? k96.M0(2131748055, null) : "");
                    b = 4;
                    ieaVarArr2[z ? 1 : 0].w.f.setOnClickListener(new pba(this, b));
                    i2 = 8;
                } else {
                    b = 4;
                    ieaVar11.w.b.setVisibility(0);
                    ieaVarArr2[z ? 1 : 0].w.setStickerType(1);
                    ieaVarArr2[z ? 1 : 0].w.d.setText(k96.M0(2131747975, null));
                    ieaVarArr2[z ? 1 : 0].w.e.setText(k96.M0(2131745615, null));
                    i2 = 8;
                    ieaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z5 = false;
            ieaVarArr2[z ? 1 : 0].h.setVisibility(0);
            k49Var3 = k49Var2;
        }
        int i19 = i6;
        iea ieaVar12 = ieaVarArr2[z ? 1 : 0];
        ieaVar12.b = z4;
        D1(ieaVar12, z5);
        ieaVarArr2[z ? 1 : 0].x.x1(i19);
        ieaVarArr2[z ? 1 : 0].h.b0();
        if (k49Var3 != null) {
            ieaVarArr2[z ? 1 : 0].h.setRecycledViewPool(k49Var3);
            ieaVarArr2[z ? 1 : 0].n.setRecycledViewPool(k49Var3);
        }
        if (this.A0 == 2) {
            if (phaVar != null ? phaVar.G : aVar.o0) {
                this.C0 = true;
                if (phaVar != null) {
                    phaVar.n(true);
                } else {
                    aVar.n(true);
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

    public void K0() {
    }

    public void Q0() {
    }

    @Override // qe3
    public final void s() {
    }

    public void J0(SparseArray sparseArray) {
    }

    public void R0(boolean z) {
    }

    public int c1(int i) {
        return i;
    }

    @Override // qe3
    public final void o(ue3 ue3Var) {
    }

    @Override // qe3
    public final void v(ue3 ue3Var) {
    }

    @Override // qe3
    public final void w(ue3 ue3Var) {
    }
}
