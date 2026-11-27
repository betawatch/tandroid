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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class eja extends FrameLayout implements snb, fn7, kf3, x69 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final yf3 u2 = new yf3((byte) 3);
    public static final int v2 = hl.L(7.0f);
    public static final int w2 = hl.L(7.0f) + hl.L(14.0f);
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
    public final gd0 G0;
    public final tha G1;
    public final a H;
    public final ArrayList H0;
    public kg5 H1;
    public final jla I;
    public final ArrayList I0;
    public final vnb I1;
    public final sla J;
    public final ArrayList J0;
    public final oz4 J1;
    public final lha K;
    public final ArrayList K0;
    public final u8a K1;
    public final yia L;
    public final bha L0;
    public boolean L1;
    public final sia M;
    public final yga M0;
    public final pn M1;
    public final ria N;
    public final dl1 N0;
    public a39 N1;
    public final ria O;
    public AnimatorSet O0;
    public int O1;
    public final ria P;
    public final gfa P0;
    public boolean P1;
    public final nia Q;
    public final ArrayList Q0;
    public int Q1;
    public final uha R;
    public float R0;
    public AnimatorSet R1;
    public final sha S;
    public final xj3 S0;
    public final SparseArray S1;
    public final qha T;
    public final FrameLayout T0;
    public long T1;
    public final pia U;
    public final xga U0;
    public boolean U1;
    public final qia V;
    public final int V0;
    public int V1;
    public final mha W;
    public final Paint W0;
    public final iha W1;
    public boolean X0;
    public u5b X1;
    public boolean Y0;
    public float Y1;
    public w49 Z0;
    public boolean Z1;
    public boolean a;
    public final bga a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final cga b0;
    public int b1;
    public int b2;
    public boolean c;
    public final fga c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final rha d0;
    public int d1;
    public int d2;
    public int e;
    public final lu5 e0;
    public boolean e1;
    public int e2;
    public int f;
    public final oha f0;
    public long f1;
    public int f2;
    public final bja g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final aga h0;
    public TLRPC.UserFull h1;
    public vy4 h2;
    public final bja i0;
    public AnimatorSet i1;
    public float i2;
    public final bia j0;
    public boolean j1;
    public final RectF j2;
    public final bia k0;
    public boolean k1;
    public Runnable k2;
    public final bia l0;
    public boolean l1;
    public int l2;
    public final xha m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final zha[] n0;
    public boolean n1;
    public final HashMap n2;
    public final s7 o0;
    public boolean o1;
    public int o2;
    public final s7 p0;
    public final int[] p1;
    public int p2;
    public final s7 q0;
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
    public final lga u1;
    public final e29 v0;
    public float v1;
    public int w;
    public final s7 w0;
    public final tia[] w1;
    public int x;
    public final s7 x0;
    public final wia x1;
    public final Rect y;
    public final s7 y0;
    public final e y1;
    public final s7 z0;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v61 */
    public eja(Context context, long j, wia wiaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, e eVar, tha thaVar, int i4, vnb vnbVar, ll0 ll0Var) {
        super(context);
        float f;
        float f2;
        ll0 ll0Var2;
        int i5;
        boolean z;
        ll0 ll0Var3;
        ?? r14;
        eja ejaVar;
        boolean z2;
        zha zhaVar;
        hga hgaVar;
        n69 n69Var;
        s7 a;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        TL_bots.BotInfo botInfo;
        eja ejaVar2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        vnb vnbVar2 = vnbVar;
        ejaVar2.y = new Rect();
        ejaVar2.n0 = new zha[2];
        ejaVar2.H0 = new ArrayList(10);
        ejaVar2.I0 = new ArrayList(10);
        ejaVar2.J0 = new ArrayList(10);
        ejaVar2.K0 = new ArrayList(10);
        ejaVar2.P0 = new gfa(ejaVar2, (byte) 14);
        ejaVar2.Q0 = new ArrayList();
        ejaVar2.W0 = new Paint();
        ejaVar2.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        ejaVar2.n1 = false;
        ejaVar2.o1 = false;
        ejaVar2.p1 = new int[]{3, 3};
        ejaVar2.u1 = new lga(ejaVar2);
        ejaVar2.v1 = -5.0f;
        ejaVar2.w1 = new tia[9];
        ejaVar2.M1 = new pn(null);
        ejaVar2.S1 = new SparseArray();
        ejaVar2.V1 = -1;
        ejaVar2.W1 = new iha(ejaVar2);
        ejaVar2.Y1 = 0.0f;
        ejaVar2.g2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ejaVar2.j2 = new RectF();
        ejaVar2.l2 = -1;
        ejaVar2.m2 = new HashMap();
        ejaVar2.n2 = new HashMap();
        ejaVar2.q2 = true;
        oz4 oz4Var = new oz4();
        ejaVar2.J1 = oz4Var;
        oz4Var.a(ejaVar2.c0(aob.d6));
        ll0 ll0Var4 = ll0Var == null ? new ll0(oz4Var, oz4Var, oz4Var) : ll0Var;
        ejaVar2.F = i4;
        ejaVar2.I1 = vnbVar2;
        tk4 tk4Var = new tk4(context, null);
        ejaVar2.E = tk4Var;
        tk4Var.setIsSingleCell(true);
        TLRPC.User X1 = eVar.getMessagesController().X1(Long.valueOf(j));
        ejaVar2.x1 = wiaVar;
        ejaVar2.G1 = thaVar;
        int[] iArr = wiaVar.c;
        long j2 = wiaVar.s;
        ejaVar2.G = j2;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j2 == 0 ? i : 0, iArr[7], iArr[8]};
        ejaVar2.a1 = iArr2;
        TLRPC.ProfileTab profileTab = userFull != null ? userFull.main_tab : chatFull2 != null ? chatFull2.main_tab : null;
        if (i2 == 14 || i2 == 10 || i2 == 11 || i2 == 6) {
            ejaVar2.b1 = i2;
        } else if (X1 != null && X1.bot && X1.bot_has_main_app && X1.bot_can_edit) {
            ejaVar2.b1 = 13;
        } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
            ejaVar2.b1 = 8;
        } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || ejaVar2.s0()))) {
            ejaVar2.b1 = 8;
        } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
            if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                int i11 = iArr2[1];
                i6 = -1;
                if (i11 == -1 || i11 > 0) {
                    ejaVar2.b1 = 1;
                }
            } else {
                i6 = -1;
            }
            if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i10 = iArr2[5]) == i6 || i10 > 0)) {
                ejaVar2.b1 = 5;
            } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i9 = iArr2[3]) == i6 || i9 > 0)) {
                ejaVar2.b1 = 3;
            } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i8 = iArr2[4]) == i6 || i8 > 0)) {
                ejaVar2.b1 = 4;
            } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i7 = iArr2[2]) == i6 || i7 > 0)) {
                ejaVar2.b1 = 2;
            } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || ejaVar2.s0())) {
                ejaVar2.b1 = ejaVar2.getInitialTab();
            } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                int i12 = -1;
                if (i2 == -1 || j2 != 0) {
                    int i13 = 0;
                    while (true) {
                        int[] iArr3 = ejaVar2.a1;
                        if (i13 >= iArr3.length) {
                            break;
                        }
                        int i14 = iArr3[i13];
                        if (i14 == i12 || i14 > 0) {
                            break;
                        }
                        i13++;
                        i12 = -1;
                    }
                    ejaVar2.b1 = i13;
                } else {
                    ejaVar2.b1 = i2;
                }
            } else {
                ejaVar2.b1 = 14;
            }
        } else {
            ejaVar2.b1 = 14;
        }
        ejaVar2.T0(i2);
        ejaVar2.g1 = chatFull2;
        ejaVar2.h1 = userFull;
        if (chatFull2 != null) {
            ejaVar2.f1 = -chatFull2.migrated_from_chat_id;
        }
        long j3 = j;
        ejaVar2.m1 = j3;
        int i15 = 0;
        while (true) {
            tia[] tiaVarArr = ejaVar2.w1;
            if (i15 >= tiaVarArr.length) {
                break;
            }
            tiaVarArr[i15] = new tia();
            ejaVar2.w1[i15].j[0] = wf3.B(ejaVar2.m1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
            ejaVar2.w1[i15].j[1] = Integer.MAX_VALUE;
            ejaVar2.J(i15);
            if (ejaVar2.f1 != 0 && ejaVar2.g1 != null && ejaVar2.w1[i15].b[1].size() == 0) {
                tia tiaVar = ejaVar2.w1[i15];
                tiaVar.j[1] = ejaVar2.g1.migrated_from_max_id;
                tiaVar.i[1] = false;
            }
            i15++;
        }
        ejaVar2.y1 = eVar;
        ejaVar2.H = eVar.getActionBar();
        ejaVar2.I = eVar.getSimpleActionBar();
        ejaVar2.p1[0] = ejaVar2.Z0() <= 0 ? xea.p1 : ejaVar2.Z0();
        ejaVar2.p1[1] = ejaVar2.Z0() <= 0 ? xea.q1 : ejaVar2.Z0();
        jn7 notificationCenter = eVar.getNotificationCenter();
        notificationCenter.getClass();
        u8a u8aVar = new u8a(notificationCenter, ejaVar2);
        u8aVar.b(jn7.V);
        u8aVar.b(jn7.v);
        u8aVar.b(1);
        u8aVar.b(jn7.J);
        u8aVar.b(jn7.f2);
        u8aVar.b(jn7.g2);
        u8aVar.b(jn7.h2);
        u8aVar.b(jn7.A5);
        u8aVar.b(jn7.y5);
        u8aVar.b(jn7.h3);
        u8aVar.b(jn7.i3);
        u8aVar.b(jn7.r);
        u8aVar.b(jn7.I3);
        u8aVar.b(jn7.Z3);
        u8aVar.b(jn7.f1);
        ejaVar2.K1 = u8aVar;
        for (int i16 = 0; i16 < 10; i16++) {
            if (i2 == 4) {
                wga wgaVar = new wga(ejaVar2, context);
                wgaVar.U.c();
                ejaVar2.J0.add(wgaVar);
            }
        }
        ejaVar2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        ejaVar2.Y0 = false;
        ejaVar2.Z0 = null;
        yga ygaVar = ejaVar2.M0;
        if (ygaVar != null) {
            ygaVar.g(false);
        }
        ejaVar2.X0 = false;
        Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        ejaVar2.B0 = drawable;
        yob.x(ejaVar2, drawable, aob.b7, vnbVar2, PorterDuff.Mode.MULTIPLY);
        bha bhaVar = ejaVar2.L0;
        int currentTabId = bhaVar != null ? bhaVar.getCurrentTabId() : i2;
        bha bhaVar2 = new bha(ejaVar2, context, ejaVar2.I1);
        int i17 = ejaVar2.b1;
        if (i17 != -1) {
            bhaVar2.setInitialTabId(i17);
            ejaVar2.b1 = -1;
        }
        bhaVar2.c0 = (short) 320;
        int i18 = aob.wi;
        int i19 = aob.vi;
        bhaVar2.M = i18;
        bhaVar2.N = i19;
        bhaVar2.updateColors();
        bhaVar2.setUseMinimalWidth(true);
        bhaVar2.setDelegate(new dha(ejaVar2));
        ejaVar2.L0 = bhaVar2;
        for (int i20 = 1; i20 >= 0; i20--) {
            ejaVar2.c1[i20].clear();
        }
        ejaVar2.d1 = 0;
        ejaVar2.Q0.clear();
        pia piaVar = ejaVar2.U;
        if (piaVar != null) {
            piaVar.x.clear();
        }
        if (ejaVar2 instanceof re5) {
            f = 10.0f;
        } else {
            jla jlaVar = ejaVar2.I;
            if (jlaVar != null) {
                rla v = jlaVar.v();
                a = v.a(0, R.drawable.outline_header_search);
                if (ejaVar2.k0() || ejaVar2.q0()) {
                    f = 10.0f;
                } else {
                    sla a2 = v.a(0, R.drawable.ic_ab_other);
                    ejaVar2.J = a2;
                    f = 10.0f;
                    a2.setContentDescription(ob6.M0(2131754834, null));
                    a2.Y(false, false);
                }
            } else {
                f = 10.0f;
                s6 u = ejaVar2.H.u();
                u.addOnLayoutChangeListener(new cha(ejaVar2));
                if (ejaVar2.m1 == ejaVar2.y1.getUserConfig().e() && (ejaVar2.y1 instanceof em6) && ejaVar2.q()) {
                    ejaVar2.p0 = u.a(11, R.drawable.outline_header_search);
                }
                a = u.a(0, 0);
            }
            s7 K = a.M().K(new jha(ejaVar2));
            ejaVar2.q0 = K;
            yga ygaVar2 = ejaVar2.M0;
            K.setSearchFieldHint(ob6.M0((ygaVar2 != null && ygaVar2.a() && ejaVar2.getSelectedTab() == 11) ? 2131745596 : 2131745564, null));
            K.setContentDescription(ob6.M0(2131745564, "Search"));
            if (ejaVar2.I != null) {
                ((sla) K).Y(false, false);
            } else {
                K.setTranslationY(hl.L(f));
                ejaVar2.setSearchItemVisibility(ejaVar2.s0() ? 8 : 4);
            }
        }
        ImageView imageView = new ImageView(context);
        ejaVar2.u0 = imageView;
        imageView.setContentDescription(ob6.M0(2131754834, "AccDescrMoreOptions"));
        imageView.setTranslationY(hl.L(f));
        imageView.setVisibility(4);
        if (ejaVar2.I != null || ejaVar2.k0() || ejaVar2.q0()) {
            f2 = 2.0f;
        } else {
            f2 = 2.0f;
            ejaVar2.H.addView(imageView, tre.e(48, 56, 85));
            e29 e29Var = new e29(context);
            ejaVar2.v0 = e29Var;
            e29Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            e29Var.e(R.raw.options_to_search, 24, 24);
            e29Var.getAnimatedDrawable().G *= 2.0f;
            e29Var.getAnimatedDrawable().h = true;
            yob.s(e29Var, aob.y8, vnbVar2, PorterDuff.Mode.SRC_IN);
            e29Var.setVisibility(8);
            ejaVar2.H.addView(e29Var, tre.e(48, 56, 85));
        }
        imageView.setOnClickListener(new ffa(ejaVar2, (byte) 4));
        sla slaVar = ejaVar2.J;
        if (slaVar != null) {
            slaVar.setOnClickListener(new ffa(ejaVar2, (byte) 0));
        }
        s7 s7Var = ejaVar2.q0;
        if (s7Var != null && ejaVar2.I == null) {
            EditTextBoldCursor searchField = s7Var.getSearchField();
            int i21 = aob.G6;
            yob.X(searchField, i21, vnbVar2);
            yob.D(searchField, aob.Jj, vnbVar2);
            yob.v(searchField, i21, vnbVar2);
        }
        ejaVar2.A0 = (byte) 0;
        LinearLayout linearLayout = new LinearLayout(context);
        ejaVar2.E0 = linearLayout;
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        linearLayout.setVisibility(4);
        ImageView imageView2 = new ImageView(context);
        ejaVar2.F0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        gd0 gd0Var = new gd0(true);
        ejaVar2.G0 = gd0Var;
        imageView2.setImageDrawable(gd0Var);
        int i22 = aob.y8;
        gd0Var.a(ejaVar2.c0(i22));
        int i23 = aob.z8;
        yob.R(imageView2, aob.e0(ejaVar2.c0(i23), 1), null, yob.M(i23), vnbVar2);
        imageView2.setContentDescription(ob6.M0(2131752006, "Close"));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(hl.L(54.0f), -1));
        ejaVar2.Q0.add(imageView2);
        imageView2.setOnClickListener(new ffa(ejaVar2, (byte) 1));
        NumberTextView numberTextView = new NumberTextView(context);
        ejaVar2.D0 = numberTextView;
        numberTextView.setTextSize(18);
        numberTextView.setTypeface(hl.o());
        numberTextView.setTextColor(ejaVar2.c0(i22));
        linearLayout.addView(numberTextView, tre.m(1.0f, 0, -1, 18, 0, 0));
        ejaVar2.Q0.add(numberTextView);
        if (!wf3.B(ejaVar2.m1)) {
            if (!ejaVar2.s0()) {
                ejaVar2.x0 = ejaVar2.F(context, jn7.m1, R.drawable.msg_message, ob6.L0(2131754873));
                ejaVar2.w0 = ejaVar2.F(context, 100, R.drawable.msg_forward, ob6.L0(2131750547));
            }
            s7 F = ejaVar2.F(context, jn7.n1, R.drawable.msg_pin, ob6.L0(2131746972));
            ejaVar2.y0 = F;
            F.setVisibility(8);
            s7 F2 = ejaVar2.F(context, jn7.o1, R.drawable.msg_unpin, ob6.L0(2131743499));
            ejaVar2.z0 = F2;
            F2.setVisibility(8);
            ejaVar2.E1();
        }
        ejaVar2.o0 = ejaVar2.F(context, 101, R.drawable.msg_delete, ob6.M0(2131751563, "Delete"));
        ejaVar2.K = new lha(ejaVar2, context);
        ejaVar2.L = new yia(ejaVar2, context);
        ejaVar2.N = new ria(ejaVar2, context, 1);
        ejaVar2.O = new ria(ejaVar2, context, 2);
        ejaVar2.P = new ria(ejaVar2, context, 4);
        ejaVar2.Q = new nia(ejaVar2, context, ejaVar2.y1.getCurrentAccount(), ejaVar2.y1.getResourceProvider());
        ejaVar2.R = new uha(ejaVar2, context);
        ejaVar2.j0 = new bia(ejaVar2, context, 1);
        ejaVar2.k0 = new bia(ejaVar2, context, 4);
        ejaVar2.l0 = new bia(ejaVar2, context, 3);
        ejaVar2.m0 = new xha(ejaVar2, context);
        ejaVar2.S = new sha(ejaVar2, context);
        ejaVar2.T = new qha(ejaVar2, context);
        ejaVar2.U = new pia(ejaVar2, context);
        ejaVar2.V = new qia(ejaVar2, context);
        if (!ejaVar2.s0() && !ejaVar2.h0() && ejaVar2.G == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", ejaVar2.y1.getUserConfig().e());
            bundle.putInt("chatMode", 3);
            mha mhaVar = new mha(ejaVar2, context, ejaVar2.y1.getParentLayout(), bundle);
            ejaVar2.W = mhaVar;
            long j4 = ejaVar2.m1;
            gv1 gv1Var = mhaVar.a;
            gv1Var.s4 = j4;
            gv1Var.nb = true;
            mhaVar.setClipToOutline(true);
            mhaVar.setOutlineProvider(new nha());
        }
        rha rhaVar = new rha(ejaVar2, context);
        ejaVar2.d0 = rhaVar;
        if (ejaVar2.G == 0) {
            rhaVar.e = arrayList;
            rhaVar.d = currentTabId != 7 ? null : chatFull2;
        }
        ejaVar2.f0 = new oha(ejaVar2, context);
        ejaVar2.e0 = new lu5(new pha(ejaVar2));
        ejaVar2.g0 = new bja(ejaVar2, context, false);
        ejaVar2.h0 = new aga(ejaVar2, context);
        ejaVar2.i0 = new bja(ejaVar2, context, true);
        ejaVar2.M = new sia(ejaVar2, context);
        boolean l0 = ejaVar2.l0();
        e eVar2 = ejaVar2.y1;
        if (l0) {
            ejaVar2.a0 = new bga(ejaVar2, context, eVar2, ejaVar2.m1);
            ll0Var3 = ll0Var4;
            z = false;
            i5 = 1;
        } else {
            if (eVar2 instanceof ProfileActivity) {
                TextView textView = new TextView(context);
                ejaVar2.t0 = textView;
                textView.setText(ob6.L0(2131745674).toUpperCase());
                textView.setTypeface(hl.o());
                int i24 = aob.Fi;
                yob.X(textView, i24, vnbVar2);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(17);
                yob.R(textView, aob.e0(aob.p1(0.15f, ejaVar2.c0(i24)), 3), null, yob.K(0.15f, i24), vnbVar2);
                textView.setPadding(hl.L(19.0f), 0, hl.L(19.0f), 0);
                ViewGroup viewGroup = ejaVar2.I;
                (viewGroup == null ? ejaVar2.H : viewGroup).addView(textView, tre.e(-2, 56, 85));
                textView.setOnClickListener(new ffa(ejaVar2, (byte) 2));
                textView.setVisibility(8);
                textView.setAlpha(0.0f);
                textView.setScaleX(0.4f);
                textView.setScaleY(0.4f);
                e eVar3 = ejaVar2.y1;
                ll0 ll0Var5 = ll0Var4;
                i5 = 1;
                cga cgaVar = new cga(ejaVar2, eVar3, context, eVar3.getCurrentAccount(), ((ProfileActivity) ejaVar2.y1).a(), vnbVar2, ll0Var5);
                vnbVar2 = vnbVar2;
                ejaVar2.b0 = cgaVar;
                ejaVar2.F1();
                ejaVar2.c0 = new fga(ejaVar2, context, ejaVar2.getStoriesController().A(ejaVar2.m1, true), new ega(ejaVar2, context, eVar, vnbVar2));
                ll0Var2 = ll0Var5;
            } else {
                ll0Var2 = ll0Var4;
                i5 = 1;
            }
            z = false;
            ll0Var3 = ll0Var2;
        }
        ejaVar2.setWillNotDraw(z);
        int i25 = 0;
        int i26 = -1;
        int i27 = 0;
        while (true) {
            zha[] zhaVarArr = ejaVar2.n0;
            if (i27 >= zhaVarArr.length) {
                break;
            }
            if (i27 == 0 && (zhaVar = zhaVarArr[i27]) != null && (hgaVar = zhaVar.x) != null) {
                i26 = hgaVar.K0();
                if (i26 == ejaVar2.n0[i27].x.A() - i5 || (n69Var = (n69) ejaVar2.n0[i27].h.L(i26)) == null) {
                    i26 = -1;
                } else {
                    i25 = n69Var.a.getTop();
                }
            }
            gga ggaVar = new gga(ejaVar2, context);
            ejaVar2.addView(ggaVar, tre.d(-1, -1.0f, 51, 0.0f, ejaVar2.I0(), 0.0f, 0.0f));
            if (i27 == i5) {
                ggaVar.setTranslationX(hl.q.x);
            }
            ejaVar2.n0[i27] = ggaVar;
            ggaVar.O = vnbVar2;
            hga hgaVar2 = new hga(ejaVar2, ggaVar);
            ggaVar.x = hgaVar2;
            hgaVar2.O = new iga(ejaVar2, ggaVar);
            ejaVar2.n0[i27].d = new zb3();
            ejaVar2.n0[i27].d.n(280L);
            ejaVar2.n0[i27].d.o(k43.h);
            zha zhaVar2 = ejaVar2.n0[i27];
            zhaVar2.d.m = false;
            jga jgaVar = new jga(ejaVar2, context, vnbVar2, ggaVar, hgaVar2);
            int i28 = i26;
            zhaVar2.h = jgaVar;
            ejaVar2.n0[i27].h.setFastScrollEnabled(1);
            ejaVar2.n0[i27].h.setScrollingTouchSlop(1);
            ejaVar2.n0[i27].h.setPinnedSectionOffsetY(-hl.L(f2));
            ejaVar2.n0[i27].h.setPadding(0, hl.L(54.0f), 0, 0);
            ejaVar2.n0[i27].h.setItemAnimator(null);
            ejaVar2.n0[i27].h.setClipToPadding(false);
            ejaVar2.n0[i27].h.setSectionsType(2);
            ejaVar2.n0[i27].h.setLayoutManager(hgaVar2);
            zha zhaVar3 = ejaVar2.n0[i27];
            int i29 = i25;
            zhaVar3.addView(zhaVar3.h, tre.c(-1.0f, -1));
            ejaVar2.n0[i27].n = new yha(context);
            zha zhaVar4 = ejaVar2.n0[i27];
            yha yhaVar = zhaVar4.n;
            kga kgaVar = new kga(ejaVar2);
            zhaVar4.r = kgaVar;
            yhaVar.setLayoutManager(kgaVar);
            zha zhaVar5 = ejaVar2.n0[i27];
            zhaVar5.addView(zhaVar5.n, tre.c(-1.0f, -1));
            ejaVar2.n0[i27].n.setVisibility(8);
            ejaVar2.n0[i27].n.i(new mga(ggaVar));
            ejaVar2.n0[i27].h.i(new nga(ejaVar2, ggaVar));
            ejaVar2.n0[i27].h.setOnItemClickListener(new oo1(ejaVar2, ggaVar, context, j3, vnbVar, (byte) 1));
            ejaVar2.n0[i27].h.setOnScrollListener(new qga(ejaVar2, ggaVar, hgaVar2));
            ejaVar2.n0[i27].h.setOnItemLongClickListener(new rga(ejaVar2, ggaVar));
            if (i27 == 0 && i28 != -1) {
                hgaVar2.g1(i28, i29);
            }
            zha zhaVar6 = ejaVar2.n0[i27];
            zhaVar6.y = new sga(context, zhaVar6.h);
            ejaVar2.n0[i27].y.setVisibility(8);
            zha zhaVar7 = ejaVar2.n0[i27];
            jga jgaVar2 = zhaVar7.h;
            sga sgaVar = zhaVar7.y;
            FrameLayout.LayoutParams c = tre.c(-1.0f, -1);
            d26 d26Var = jgaVar2.c1;
            if (d26Var == null) {
                d26Var = new d26((byte) 17, jgaVar2.getContext(), jgaVar2);
                jgaVar2.c1 = d26Var;
            }
            d26Var.addView(sgaVar, c);
            ejaVar2.n0[i27].s = new tga(ejaVar2, context, ggaVar);
            tga tgaVar = ejaVar2.n0[i27].s;
            tgaVar.x = false;
            tgaVar.setClipToOutline(true);
            ejaVar2.n0[i27].s.setOutlineProvider(new uga());
            if (i27 != 0) {
                ejaVar2.n0[i27].setVisibility(8);
            }
            zha zhaVar8 = ejaVar2.n0[i27];
            zhaVar8.w = new vga(ejaVar2, context, zhaVar8.s);
            ejaVar2.n0[i27].w.d(8, false);
            ejaVar2.n0[i27].w.setAnimateLayoutChange(true);
            zha zhaVar9 = ejaVar2.n0[i27];
            zhaVar9.addView(zhaVar9.w, tre.c(-1.0f, -1));
            ejaVar2.n0[i27].w.setOnTouchListener(new b02((byte) 25));
            ejaVar2.n0[i27].w.e(true, false);
            ejaVar2.n0[i27].w.d.setText(ob6.M0(2131747898, "NoResult"));
            ejaVar2.n0[i27].w.f.setVisibility(8);
            ejaVar2.n0[i27].w.e.setText(ob6.L0(2131745535));
            ejaVar2.n0[i27].w.f.setVisibility(8);
            zha zhaVar10 = ejaVar2.n0[i27];
            zhaVar10.w.addView(zhaVar10.s, tre.d(-1, -1.0f, jn7.D1, 12.0f, 60.0f, 12.0f, 12.0f));
            zha zhaVar11 = ejaVar2.n0[i27];
            zhaVar11.h.setEmptyView(zhaVar11.w);
            ejaVar2.n0[i27].h.q1(0, true);
            zha[] zhaVarArr2 = ejaVar2.n0;
            zha zhaVar12 = zhaVarArr2[i27];
            zhaVar12.E = new hw6(zhaVar12.h, zhaVarArr2[i27].x);
            i27++;
            vnbVar2 = vnbVar;
            i26 = i28;
            i25 = i29;
            i5 = 1;
            j3 = j;
        }
        View view = ejaVar2.c0;
        if (view != null) {
            ejaVar2.addView(view, tre.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
        }
        dl1 dl1Var = new dl1(context);
        ejaVar2.N0 = dl1Var;
        dl1Var.h0((int) (System.currentTimeMillis() / 1000), false, false);
        dl1Var.setAlpha(0.0f);
        int i30 = aob.nd;
        int i31 = aob.be;
        dl1Var.U0 = i30;
        dl1Var.V0 = i31;
        dl1Var.setTranslationY(-hl.L(48.0f));
        ejaVar2.addView(dl1Var, tre.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        for (zha zhaVar13 : ejaVar2.n0) {
            k69 fastScroll = zhaVar13.h.getFastScroll();
            if (fastScroll != null) {
                fastScroll.a(ll0Var3, ejaVar2.I != null ? dtd.l(vnbVar) : dtd.n(vnbVar));
            }
        }
        if (ejaVar2.H()) {
            r14 = 0;
            ejaVar = ejaVar2;
        } else {
            ol0 l = ejaVar2.I != null ? dtd.l(vnbVar) : dtd.n(vnbVar);
            xj3 xj3Var = new xj3(context);
            ejaVar2.S0 = xj3Var;
            int L = hl.L(11.0f);
            int i32 = w2;
            xj3Var.setPadding(L, i32, hl.L(11.0f), i32);
            jl0 b = ll0Var3.b(xj3Var, l);
            b.r(hl.L(24.0f));
            b.q(hl.L(7.0f));
            xj3Var.setBlurredBackground(b);
            FrameLayout frameLayout = new FrameLayout(context);
            ejaVar2.T0 = frameLayout;
            xj3Var.addView(frameLayout);
            xj3Var.j(frameLayout, true, false);
            xj3Var.setOnAnimatedHeightChangedListener(new gfa(ejaVar2, (byte) 0));
            xga xgaVar = new xga(ejaVar2, context, eVar, this, vnbVar);
            ejaVar2.U0 = xgaVar;
            frameLayout.addView(xgaVar);
            xj3Var.setCallFragmentContextView(xgaVar);
            ejaVar2.addView(xj3Var, tre.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
            xgaVar.setDelegate(new hfa(ejaVar2));
            jl0 b2 = ll0Var3.b(ejaVar2.L0, l);
            ik8.r(b2, hl.L(18.0f), 6.666f);
            ejaVar2.L0.setPadding(0, hl.L(7.0f), 0, hl.L(7.0f));
            ejaVar2.L0.setClipToPadding(false);
            ejaVar2.L0.setBackground(null);
            ejaVar2.L0.setBlurredBackground(b2);
            ejaVar2.L0.setOpen(false);
            ejaVar2.addView(ejaVar2.L0, tre.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
            Context context2 = ejaVar2.getContext();
            e eVar4 = ejaVar2.y1;
            yga ygaVar3 = new yga(ejaVar2, context2, eVar4, eVar4.getCurrentAccount(), ejaVar2.h0() ? 0L : ejaVar2.m1, vnbVar);
            eja ejaVar3 = ejaVar2;
            ejaVar3.M0 = ygaVar3;
            ygaVar3.d(ll0Var3, l);
            ygaVar3.setShown(0.0f);
            ejaVar3.addView(ygaVar3, tre.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
            if (ejaVar3.I == null) {
                jl0 b3 = ll0Var3.b(ejaVar3.E0, l);
                ik8.r(b3, hl.L(18.0f), 6.666f);
                ejaVar3.E0.setBackground(b3);
                z2 = false;
                ejaVar3.E0.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                ejaVar3.addView(ejaVar3.E0, tre.e(-1, 50, 51));
            } else {
                z2 = false;
            }
            ejaVar3.n();
            ejaVar = ejaVar3;
            r14 = z2;
        }
        ejaVar.N1(r14);
        ejaVar.z1(r14);
        ejaVar.B(r14, r14);
        if (ejaVar.a1[r14] >= 0) {
            ejaVar.G0(r14);
        }
        fga fgaVar = ejaVar.c0;
        if (fgaVar == null || i3 <= 0) {
            return;
        }
        fgaVar.setInitialTabId(i3);
    }

    public static ci G(int i, long j, vnb vnbVar, Context context) {
        ci ciVar = new ci(context, vnbVar);
        ImageView imageView = (ImageView) ciVar.d;
        TextView textView = (TextView) ciVar.c;
        if (i == 0) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747927, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747929, null));
            return ciVar;
        }
        if (i == 1) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747888, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747889, null));
            return ciVar;
        }
        if (i == 2) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747883, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747884, null));
            return ciVar;
        }
        if (i == 3) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747885, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747886, null));
            return ciVar;
        }
        if (i == 4) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747890, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747891, null));
            return ciVar;
        }
        if (i == 5) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747887, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747939, null));
            return ciVar;
        }
        if (i == 6) {
            imageView.setImageDrawable(null);
            textView.setText(ob6.M0(2131747937, null));
            return ciVar;
        }
        if (i == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return ciVar;
    }

    public static int Q(View view) {
        if (view instanceof jja) {
            return ((jja) view).getMessageId();
        }
        if (view instanceof zea) {
            return ((zea) view).getMessage().e1();
        }
        if (view instanceof vea) {
            return ((vea) view).getMessage().e1();
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
        if (xc2.b0(this.y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c6b getStoriesController() {
        return uc7.s1(this.y1.getCurrentAccount()).O1();
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

    public static void m1(zha zhaVar, tia[] tiaVarArr, boolean z) {
        ida idaVar;
        if (!z) {
            if (zhaVar.G == null || (idaVar = zhaVar.H) == null) {
                return;
            }
            hl.r(idaVar);
            zhaVar.H.run();
            zhaVar.H = null;
            zhaVar.G = null;
            return;
        }
        if (xea.r1 <= 0 || zhaVar.G != null || zhaVar.I || zhaVar.h.getFastScroll() == null || !zhaVar.h.getFastScroll().b0 || zhaVar.h.getFastScroll().getVisibility() != 0 || tiaVarArr[0].e() < 50) {
            return;
        }
        int i = xea.r1;
        int i2 = i - 1;
        if (i != i2) {
            xea.r1 = i2;
            org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", xea.r1).apply();
        }
        zhaVar.I = true;
        Context context = zhaVar.getContext();
        ir8 ir8Var = new ir8(context, (byte) 7);
        TextView textView = new TextView(context);
        qd4.u(14.0f, 2131745136, 1, textView, null);
        textView.setMaxLines(3);
        int i3 = aob.gg;
        yob.X(textView, i3, null);
        int L = hl.L(6.0f);
        int i4 = aob.hg;
        ShapeDrawable b0 = aob.b0(L, aob.w0(null, i4, false));
        uob M = yob.M(i4);
        ir8Var.setBackground(b0);
        yob.j(ir8Var, b0, M, null, null);
        ir8Var.addView(textView, tre.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        dfa dfaVar = new dfa(context);
        dfaVar.a = new Random();
        Paint paint = new Paint(1);
        dfaVar.b = paint;
        Paint paint2 = new Paint(1);
        dfaVar.c = paint2;
        dfaVar.f = 1.0f;
        dfaVar.h = 0.0f;
        paint.setColor(vm2.o(aob.w0(null, i3, false), 76));
        paint2.setColor(aob.w0(null, i3, false));
        Paint paint3 = new Paint();
        dfaVar.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, hl.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        dfaVar.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        ir8Var.addView(dfaVar, tre.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        zhaVar.G = ir8Var;
        zhaVar.addView(ir8Var, tre.c(-2.0f, -2));
        zhaVar.G.setAlpha(0.0f);
        zhaVar.G.setScaleX(0.8f);
        zhaVar.G.setScaleY(0.8f);
        zhaVar.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        zhaVar.invalidate();
        ida idaVar2 = new ida((Object) zhaVar, (Object) ir8Var, (byte) 1);
        zhaVar.H = idaVar2;
        hl.d3(idaVar2, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderEnabled(boolean z) {
        jla jlaVar = this.I;
        if (jlaVar != null) {
            jlaVar.setEnabled(z);
        } else {
            this.H.setEnabled(z);
        }
    }

    private void setPageOverscan(yha yhaVar) {
        if (!this.c2 || yhaVar == null) {
            return;
        }
        yhaVar.j3 = true;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yhaVar.getLayoutParams();
        if (marginLayoutParams != null) {
            int i = marginLayoutParams.topMargin;
            int i2 = -this.e2;
            if (i == i2 && marginLayoutParams.bottomMargin == (-this.f2)) {
                return;
            }
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.bottomMargin = -this.f2;
            yhaVar.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchItemVisibility(int i) {
        s7 s7Var = this.q0;
        if (s7Var == null) {
            return;
        }
        if (this.I != null) {
            B(true, true);
        } else {
            s7Var.setVisibility(i);
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
        bga bgaVar;
        float f;
        float f2;
        zha[] zhaVarArr = this.n0;
        int i = zhaVarArr[0].F;
        if (i == 13 && (bgaVar = this.a0) != null) {
            View currentView = bgaVar.n.getCurrentView();
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
                                yq0Var.K0(false);
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
                                        gr0Var.T = RecyclerView.T(childAt);
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
                                        f = qd4.x(2.0f, f3, 1.0f, 1.0f);
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
                        zhaVarArr[0].h.K0(false);
                        zhaVarArr[0].h.cancelLongPress();
                        zhaVarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - zhaVarArr[0].getX());
                        int y2 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - zhaVarArr[0].getY());
                        int i8 = this.x;
                        this.s = -1;
                        int top2 = y2 - zhaVarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F) {
                            top2 = 0;
                        }
                        for (int i9 = 0; i9 < zhaVarArr[0].h.getChildCount(); i9++) {
                            View childAt2 = zhaVarArr[0].h.getChildAt(i9);
                            Rect rect2 = this.y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i8, top2)) {
                                zhaVarArr[0].h.getClass();
                                this.s = RecyclerView.T(childAt2);
                                this.w = childAt2.getTop();
                            }
                        }
                        if (this.G1.X() && this.s == -1) {
                            this.s = (int) (((this.p1[j0(zhaVarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i8 / zhaVarArr[0].h.getMeasuredWidth(), 0.0f))) + zhaVarArr[0].x.K0());
                            this.w = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - zhaVarArr[0].getY() > this.d2) {
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
                            max = Math.max(0.0f, Math.min(1.0f, z4 ? qd4.x(2.0f, f4, 1.0f, 1.0f) : (1.0f - f4) / 0.5f));
                            this.q1 = max;
                        } else {
                            this.q1 = 0.0f;
                            max = 0.0f;
                        }
                        if (max == 1.0f || max == 0.0f) {
                            j79 v1 = j0(this.s1) ? v1(this.s1) : this.K;
                            if (this.q1 == 1.0f) {
                                int i13 = this.t1;
                                int ceil2 = (((int) Math.ceil(this.s / this.t1)) * i13) + ((int) ((this.C1 / (zhaVarArr[0].h.getMeasuredWidth() - ((int) (zhaVarArr[0].h.getMeasuredWidth() / this.t1)))) * (i13 - 1)));
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
                        zhaVarArr[0].h.invalidate();
                        zha zhaVar = zhaVarArr[0];
                        if (zhaVar.G != null) {
                            zhaVar.invalidate();
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

    public final void A1(b8 b8Var, b8 b8Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (b8Var2.getCheckView().a.q || !b8Var.getCheckView().a.q) {
            b8Var.setChecked(!b8Var.getCheckView().a.q);
            runnable.run();
        } else {
            float f = -this.v1;
            this.v1 = f;
            hl.A3(f, b8Var, null);
        }
    }

    public final void B(boolean z, boolean z2) {
        if (this.I != null) {
            int closestTab = getClosestTab();
            boolean z3 = false;
            boolean z4 = this.q2 && !o0();
            s7 s7Var = this.q0;
            if (s7Var != null) {
                ((sla) s7Var).Y(z4 && q() && (p0(closestTab) || (closestTab == 11 && h0())), z);
            }
            sla slaVar = this.J;
            if (slaVar != null) {
                if (z4 && q() && !k0() && f0(closestTab)) {
                    z3 = true;
                }
                slaVar.Y(z3, z2);
            }
        }
    }

    public final void B0(int i, TL_stories.StoryItem storyItem, String str) {
        a39 a39Var = new a39((Object) this, i, (Object) storyItem, (byte) 7);
        c6b storiesController = getStoriesController();
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.e0(i, this.m1, arrayList);
        d31.b0(this.y1).K(R.raw.chats_archived, hl.S2(ob6.G(1, "StoryRemovedFromAlbumTitle", str)), ob6.M0(2131743540, null), a39Var).j();
    }

    public final void B1() {
        if (this.I == null) {
            try {
                int c0 = c0(aob.y8);
                int c02 = c0(aob.z8);
                if (c0 == this.r2 && c02 == this.s2) {
                    return;
                }
                this.r2 = c0;
                this.s2 = c02;
                s7[] s7VarArr = {this.x0, this.w0, this.y0, this.z0, this.o0};
                for (int i = 0; i < 5; i++) {
                    s7 s7Var = s7VarArr[i];
                    if (s7Var != null) {
                        s7Var.setIconColor(c0);
                        if (s7Var.getBackground() != null) {
                            aob.F1(s7Var.getBackground(), c02, true);
                        }
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void C() {
        float abs;
        float measuredWidth;
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[0];
        if (zhaVar == null || zhaVarArr[1] == null) {
            return;
        }
        float f = 0.0f;
        fga fgaVar = this.c0;
        if (fgaVar != null) {
            char c = (!j0(zhaVar.F) || zhaVarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c == (zhaVarArr[1].getVisibility() == 0 ? (!j0(zhaVarArr[1].F) || zhaVarArr[1].F == 9) ? (char) 0 : (char) 1 : c)) {
                if (c != 0) {
                    measuredWidth = 0.0f;
                    abs = 1.0f;
                } else {
                    measuredWidth = zhaVarArr[0].getMeasuredWidth();
                    abs = 0.0f;
                }
                fgaVar.setTranslationX(measuredWidth);
            } else {
                fgaVar.setTranslationX(zhaVarArr[c ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(fgaVar.getTranslationX()) / fgaVar.getMeasuredWidth());
            }
            float f2 = 0.0f;
            for (int i = 0; i < zhaVarArr.length; i++) {
                if (zhaVarArr[i].getVisibility() == 0) {
                    jga jgaVar = zhaVarArr[i].h;
                    View childAt = jgaVar.getChildCount() == 0 ? null : jgaVar.getChildAt(0);
                    f2 += Utilities.l(1.0f - (zhaVarArr[i].getTranslationX() / zhaVarArr[i].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.S(childAt)) == 0 ? childAt.getY() - jgaVar.getPaddingTop() : jgaVar.getChildCount() == 0 ? 0.0f : -hl.L(48.0f));
                }
            }
            float l = Utilities.l(1.0f - ((-f2) / hl.N(48.0f)));
            float R1 = hl.R1(0.9f, 1.0f, l);
            fgaVar.setAlpha(l);
            fgaVar.setScaleX(R1);
            fgaVar.setScaleY(R1);
            fgaVar.setTranslationY(this.O1 + f2);
            f = abs;
        }
        xj3 xj3Var = this.S0;
        if (xj3Var != null) {
            xj3Var.setTranslationY(this.O1);
        }
        if (this.Y1 != f) {
            this.Y1 = f;
            invalidate();
        }
    }

    public final /* synthetic */ void C0(TL_stories.StoryItem storyItem) {
        getStoriesController().r0(this.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        d31.b0(this.y1).G(R.raw.chats_archived, 5000, ob6.G(1, "StoryArchived", new Object[0])).j();
    }

    public final void C1() {
        if (n0()) {
            post(new gfa(this, (byte) 12));
            return;
        }
        lha lhaVar = this.K;
        if (lhaVar != null) {
            lhaVar.f();
        }
        ria riaVar = this.N;
        if (riaVar != null) {
            riaVar.f();
        }
        ria riaVar2 = this.O;
        if (riaVar2 != null) {
            riaVar2.f();
        }
        sia siaVar = this.M;
        if (siaVar != null) {
            siaVar.X(false);
        }
        ria riaVar3 = this.P;
        if (riaVar3 != null) {
            riaVar3.f();
        }
        nia niaVar = this.Q;
        if (niaVar != null) {
            niaVar.f();
        }
        uha uhaVar = this.R;
        if (uhaVar != null) {
            uhaVar.f();
        }
        oha ohaVar = this.f0;
        if (ohaVar != null) {
            ohaVar.f();
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            ((dja) it.next()).c.f();
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
        zha[] zhaVarArr = this.n0;
        if (!z) {
            if (Math.abs(zhaVarArr[1].getTranslationX()) < 1.0f) {
                zhaVarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.k1 ? -1 : 1));
                zhaVarArr[1].setTranslationX(0.0f);
                animatorSet = this.i1;
                if (animatorSet != null) {
                }
                this.j1 = false;
            }
            T0(getTabProgress());
            return this.j1;
        }
        if (Math.abs(zhaVarArr[0].getTranslationX()) < 1.0f) {
            zhaVarArr[0].setTranslationX(0.0f);
            zhaVarArr[1].setTranslationX(zhaVarArr[0].getMeasuredWidth() * (this.k1 ? 1 : -1));
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

    public final void D1(zha zhaVar, boolean z) {
        boolean z2 = zhaVar.b && this.d;
        k69 fastScroll = zhaVar.h.getFastScroll();
        ObjectAnimator objectAnimator = zhaVar.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            zhaVar.c.cancel();
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<k69, Float>) property, fastScroll.getAlpha(), 0.0f);
                ofFloat.addListener(new gf4(fastScroll));
                zhaVar.c = ofFloat;
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
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<k69, Float>) property, fastScroll.getAlpha(), 1.0f);
            zhaVar.c = ofFloat2;
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
        bga bgaVar = this.a0;
        if (bgaVar != null) {
            bgaVar.h();
            bgaVar.j();
        }
        l1(false);
        J1(z);
        pia piaVar = this.U;
        if (piaVar != null) {
            piaVar.x.clear();
        }
        return true;
    }

    public final void E0(int i, long j) {
        q5b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        v5b v5bVar = (v5b) A.h.remove(c);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = uc7.s1(i2).j1(A.b);
        tL_deleteAlbum.album_id = v5bVar.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_deleteAlbum, null);
        A.f(true);
    }

    public final void E1() {
        s7 s7Var = this.w0;
        if (s7Var != null) {
            boolean z = this.y1.getMessagesController().E2(this.m1) || e0();
            s7Var.setAlpha(z ? 0.5f : 1.0f);
            if (z) {
                if (s7Var.getBackground() != null) {
                    s7Var.setBackground(null);
                }
            } else if (s7Var.getBackground() == null) {
                int i = aob.z8;
                hf0 f0 = aob.f0(c0(i), 5, -1);
                uob M = yob.M(i);
                s7Var.setBackground(f0);
                yob.j(s7Var, f0, null, M, this.I1);
            }
        }
    }

    public final s7 F(Context context, int i, int i2, String str) {
        s7 s7Var;
        jla jlaVar = this.I;
        if (jlaVar != null) {
            s7Var = jlaVar.r().a(i, i2);
        } else {
            int i3 = aob.z8;
            int c0 = c0(i3);
            int i4 = aob.y8;
            s7 s7Var2 = new s7(context, null, c0, c0(i4), false, null);
            s7Var2.setIcon(i2);
            s7Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(s7Var2, new LinearLayout.LayoutParams(hl.L(54.0f), -1));
            this.Q0.add(s7Var2);
            e29 iconView = s7Var2.getIconView();
            vnb vnbVar = this.I1;
            if (iconView != null) {
                yob.s(s7Var2.getIconView(), i4, vnbVar, PorterDuff.Mode.SRC_IN);
            }
            if (s7Var2.getBackground() != null) {
                Drawable background = s7Var2.getBackground();
                uob M = yob.M(i3);
                s7Var2.setBackground(background);
                yob.j(s7Var2, background, null, M, vnbVar);
            }
            s7Var = s7Var2;
        }
        s7Var.setContentDescription(str);
        s7Var.setOnClickListener(new ib(this, i, (byte) 7));
        return s7Var;
    }

    public final void F0(int i, String str, long j) {
        q5b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        ((v5b) A.h.get(c)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = uc7.s1(i2).j1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        A.f(true);
    }

    public final void F1() {
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            int L = hl.L(48.0f) + this.d2;
            xj3 xj3Var = this.S0;
            cgaVar.setPaddingTop(L + (xj3Var != null ? (int) xj3Var.c(hl.L(7.0f)) : 0));
        }
    }

    public final void G0(boolean z) {
        long j = this.G;
        if (j != 0 || q0()) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            int i2 = t2[i];
            tia[] tiaVarArr = this.w1;
            if (tiaVarArr[i2].h && !z) {
                return;
            }
            long j2 = this.m1;
            if (wf3.B(j2)) {
                return;
            }
            tiaVarArr[i2].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            byte b = 2;
            if (i2 == 0) {
                byte b2 = tiaVarArr[i2].q;
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
            e eVar = this.y1;
            tL_messages_getSearchResultsPositions.peer = eVar.getMessagesController().j1(j2);
            if (j != 0 && eVar.getUserConfig().e() == j2) {
                tL_messages_getSearchResultsPositions.flags |= 4;
                tL_messages_getSearchResultsPositions.saved_peer_id = eVar.getMessagesController().j1(j);
            }
            ConnectionsManager.getInstance(eVar.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(eVar.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new ln6(this, tiaVarArr[i2].p, i2, b)), eVar.getClassGuid());
        }
    }

    public final void G1(boolean z) {
        cga cgaVar;
        fga fgaVar;
        B(true, true);
        e29 e29Var = this.v0;
        if (e29Var == null) {
            return;
        }
        float f = 0.0f;
        if (!this.Y0 && (((cgaVar = this.b0) == null || !cgaVar.g()) && ((fgaVar = this.c0) == null || !fgaVar.f))) {
            f = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        e29Var.setAlpha(f);
        if (z) {
            j(U(1.0f) > 0.5f);
        } else if (this.A0 == 2) {
            j(this.s0 > 0.1f);
        } else {
            j(this.r0 < 0.1f);
        }
    }

    public boolean H() {
        return this instanceof re5;
    }

    public final void H0(int i) {
        int i2;
        int i3 = 2;
        tia[] tiaVarArr = this.w1;
        if (i == 0) {
            byte b = tiaVarArr[0].q;
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
        tiaVarArr[i].g = true;
        e eVar = this.y1;
        eVar.getMediaDataController().P0(this.m1, 50, 0, tiaVarArr[i].k, i2, this.G, 1, eVar.getClassGuid(), tiaVarArr[i].p, null, null);
    }

    public final void H1(zha zhaVar) {
        boolean d1 = zhaVar.h.d1();
        if (d1) {
            zhaVar.h.setSectionsDrawBackground(this.c2);
        }
        zhaVar.setDrawPageBackground((!this.c2 || d1 || zhaVar.F == 15) ? false : true);
        if (zhaVar.F != 15) {
            zhaVar.setClipToOutline(false);
            zhaVar.setBackground(null);
            zhaVar.setWallpaper(null);
            return;
        }
        Drawable drawable = zhaVar.P;
        if (drawable == null) {
            drawable = zhaVar.getBackground();
        }
        Drawable d = mm8.d(drawable, this.y1.getCurrentAccount(), this.m1, aob.I.o());
        if (this.c2) {
            zhaVar.setBackground(null);
            zhaVar.setClipToOutline(false);
            zhaVar.setWallpaper(d);
        } else {
            zhaVar.setWallpaper(null);
            zhaVar.setBackground(d);
            zhaVar.setOutlineProvider(new yi((byte) 17));
            zhaVar.setClipToOutline(true);
        }
    }

    public final boolean I(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x = (-view.getX()) - getX();
        zha[] zhaVarArr = this.n0;
        motionEvent.offsetLocation(x - zhaVarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - zhaVarArr[0].getY()) - zhaVarArr[0].h.getFastScroll().getY());
        return zhaVarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public int I0() {
        return 0;
    }

    public final void I1(zha zhaVar) {
        int i = zhaVar.F;
        boolean z = i == 0 || j0(i);
        float f = z ? 0.0f : 12.0f;
        float f2 = (z ? 8 : 12) + 48;
        float f3 = z ? 0.0f : 12.0f;
        FrameLayout.LayoutParams d = tre.d(-1, -1.0f, jn7.D1, f, f2, f3, f3);
        d.topMargin = X(zhaVar.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = zhaVar.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        zhaVar.s.setLayoutParams(d);
    }

    public final boolean J(int i) {
        tia[] tiaVarArr = this.x1.n;
        if (tiaVarArr == null) {
            return false;
        }
        tia[] tiaVarArr2 = this.w1;
        if (i == 0) {
            tia tiaVar = tiaVarArr2[i];
            if (!tiaVar.h) {
                int[] iArr = tiaVar.f;
                int[] iArr2 = tiaVarArr[i].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = tiaVarArr2[i].f;
            int[] iArr4 = tiaVarArr[i].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        tiaVarArr2[i].a.addAll(tiaVarArr[i].a);
        tiaVarArr2[i].c.addAll(tiaVarArr[i].c);
        for (Map.Entry entry : tiaVarArr[i].d.entrySet()) {
            tiaVarArr2[i].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            tiaVarArr2[i].b[i2] = tiaVarArr[i].b[i2].clone();
            tia tiaVar2 = tiaVarArr2[i];
            int[] iArr5 = tiaVar2.j;
            tia tiaVar3 = tiaVarArr[i];
            iArr5[i2] = tiaVar3.j[i2];
            tiaVar2.i[i2] = tiaVar3.i[i2];
        }
        tiaVarArr2[i].e.addAll(tiaVarArr[i].e);
        return !tiaVarArr[i].a.isEmpty();
    }

    public final void J1(boolean z) {
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                return;
            }
            int childCount = zhaVarArr[i].h.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = zhaVarArr[i].h.getChildAt(i2);
                if (childAt instanceof zea) {
                    ((zea) childAt).b(false, z);
                } else if (childAt instanceof jja) {
                    ((jja) childAt).i(false, z);
                } else if (childAt instanceof cfa) {
                    ((cfa) childAt).f(false, z);
                } else if (childAt instanceof vea) {
                    ((vea) childAt).e(false, z);
                } else if (childAt instanceof vw2) {
                    ((vw2) childAt).c(false, z);
                } else if (childAt instanceof of3) {
                    ((of3) childAt).d0(false, z);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean K(int i, dia diaVar) {
        final ?? r15;
        dia diaVar2;
        dia diaVar3;
        u5b u5bVar;
        TLRPC.Chat M0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        bga bgaVar;
        bga bgaVar2;
        ?? r11;
        byte b;
        String str;
        b8 b8Var;
        boolean z;
        dia diaVar4;
        b8 b8Var2;
        b8 b8Var3;
        dja u1;
        boolean j0 = j0(i);
        e eVar = this.y1;
        int currentAccount = eVar.getCurrentAccount();
        uc7 s1 = uc7.s1(currentAccount);
        long j = this.m1;
        TLRPC.User X1 = s1.X1(Long.valueOf(j));
        boolean h = getStoriesController().h(j);
        byte b2 = 3;
        byte b3 = 2;
        final byte b4 = 0;
        byte b5 = 1;
        if (t0(i) && h && (u1 = u1(i)) != null) {
            int i2 = u1.b;
            diaVar.Z(R.drawable.menu_add_stories, new kfa(this, i2, b4), ob6.M0(2131744455, null), false, true);
            g(diaVar, eVar, this.m1, i2);
            diaVar.Z(R.drawable.tabs_reorder, new kfa(this, i2, b3), ob6.M0(2131744447, null), false, true);
            diaVar.Z(R.drawable.msg_delete, new kfa(this, i2, b2), ob6.M0(2131744453, null), true, true);
            diaVar.H();
            h(diaVar);
            return true;
        }
        byte b6 = 11;
        byte b7 = 8;
        if (i == 14) {
            cga cgaVar = this.b0;
            if (cgaVar != null) {
                au8 currentPage = cgaVar.getCurrentPage();
                axa axaVar = currentPage == null ? null : currentPage.e;
                if (axaVar != null) {
                    long j2 = cgaVar.c;
                    int i3 = cgaVar.b;
                    boolean w = j2 == yac.h(i3).e() ? true : j2 >= 0 ? false : xc2.w(5, uc7.s1(i3).M0(Long.valueOf(-j2)));
                    Runnable[] runnableArr = new Runnable[1];
                    if (axaVar.c) {
                        str = 0;
                        b8Var = null;
                        z = false;
                    } else {
                        str = 0;
                        b8Var = diaVar.Z(R.drawable.menu_sort_value, new ida(axaVar, runnableArr, b3), ob6.M0(2131750156, null), false, false);
                        z = true;
                    }
                    if (cgaVar.b()) {
                        diaVar.Z(R.drawable.menu_folder_add, new gfa(this, (byte) 10), ob6.M0(2131750057, str), false, true);
                        z = true;
                    }
                    if (cgaVar.e.h()) {
                        if (!axaVar.i().isEmpty() || currentPage.d) {
                            diaVar.Z(R.drawable.tabs_reorder, new gfa(this, b6), ob6.M0(2131749991, str), false, true);
                            diaVar4 = diaVar;
                        } else {
                            diaVar4 = diaVar;
                        }
                        z = true;
                    } else {
                        diaVar4 = diaVar;
                    }
                    if (z) {
                        diaVar4.H();
                    }
                    b8 K = diaVar4.K(ob6.M0(2131750154, str));
                    b8 K2 = diaVar4.K(ob6.M0(2131750158, str));
                    b8 K3 = diaVar4.K(ob6.M0(2131750153, str));
                    b8 K4 = diaVar4.K(ob6.M0(2131750155, str));
                    if (w) {
                        diaVar4.H();
                        b8 K5 = diaVar4.K(ob6.M0(2131750160, str));
                        b8Var3 = diaVar4.K(ob6.M0(2131750159, str));
                        b8Var2 = K5;
                    } else {
                        b8Var2 = str;
                        b8Var3 = b8Var2;
                    }
                    axa axaVar2 = axaVar;
                    f2a f2aVar = new f2a(b8Var, axaVar2, K, K2, K3, K4, w, b8Var2, b8Var3);
                    b8 b8Var4 = b8Var2;
                    b8 b8Var5 = b8Var3;
                    runnableArr[0] = f2aVar;
                    f2aVar.run();
                    eu8.j(K, axaVar2, runnableArr[0], 1);
                    eu8.j(K2, axaVar2, runnableArr[0], 2);
                    eu8.j(K3, axaVar2, runnableArr[0], 4);
                    eu8.j(K4, axaVar2, runnableArr[0], 8);
                    if (w) {
                        eu8.j(b8Var4, axaVar2, runnableArr[0], 256);
                        eu8.j(b8Var5, axaVar2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        }
        if (i != 13 || X1 == null || !X1.bot || !X1.bot_has_main_app || !X1.bot_can_edit || (bgaVar = this.a0) == null) {
            if (i == 11) {
                diaVar.Z(R.drawable.msg_discussion, new gfa(this, (byte) 7), ob6.M0(2131745592, null), false, true);
                diaVar.H();
                diaVar.Z(R.drawable.msg_home, new gfa(this, b7), ob6.M0(2131754383, null), false, true);
                diaVar.Z(R.drawable.msg_delete, new gfa(this, (byte) 9), ob6.M0(2131751555, null), false, true);
                return true;
            }
            if ((i == 8 || t0(i)) && h) {
                r15 = 1;
                diaVar2 = diaVar;
                diaVar2.Z(R.drawable.menu_album_add, new gfa(this, b5), ob6.M0(2131744464, null), false, true);
                diaVar2.H();
            } else {
                diaVar2 = diaVar;
                r15 = 1;
            }
            h(diaVar2);
            if (wf3.B(j)) {
                return r15;
            }
            if (X1 != null && X1.bot) {
                return r15;
            }
            diaVar2.Z(R.drawable.msg_calendar2, new kfa(this, i, r15), ob6.M0(2131752623, null), false, true);
            if (this.g1 == null || s0() || (M0 = uc7.s1(currentAccount).M0(Long.valueOf(this.g1.id))) == null || (tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.edit_stories) {
                diaVar3 = diaVar;
            } else {
                diaVar3 = diaVar;
                diaVar3.Z(R.drawable.msg_archive, new gfa(this, b3), ob6.M0(2131747537, null), false, true);
            }
            tia[] tiaVarArr = this.w1;
            if (!j0) {
                tia tiaVar = tiaVarArr[0];
                if (!tiaVar.w || !tiaVar.v) {
                    boolean[] zArr = tiaVar.i;
                    if (zArr[0] && zArr[r15] && tiaVar.l) {
                        return r15;
                    }
                }
            }
            diaVar3.H();
            final b8 K6 = diaVar3.K(ob6.M0(2131748407, null));
            final b8 K7 = diaVar3.K(ob6.M0(2131748406, null));
            if (!j0) {
                byte b8 = tiaVarArr[0].q;
                K6.setChecked((b8 == 0 || b8 == r15) ? r15 : false);
                byte b9 = tiaVarArr[0].q;
                K7.setChecked((b9 == 0 || b9 == 2) ? r15 : false);
                K6.setOnClickListener(new View.OnClickListener(this) { // from class: mfa
                    public final /* synthetic */ eja b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b10 = b4;
                        final b8 b8Var6 = K7;
                        final b8 b8Var7 = K6;
                        final eja ejaVar = this.b;
                        switch (b10) {
                            case 0:
                                final byte b11 = 1;
                                ejaVar.A1(b8Var7, b8Var6, new Runnable() { // from class: ofa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b12 = b11;
                                        b8 b8Var8 = b8Var6;
                                        b8 b8Var9 = b8Var7;
                                        eja ejaVar2 = ejaVar;
                                        switch (b12) {
                                            case 0:
                                                ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                ejaVar2.x();
                                                break;
                                            default:
                                                ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                ejaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b12 = 0;
                                ejaVar.A1(b8Var7, b8Var6, new Runnable() { // from class: ofa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b122 = b12;
                                        b8 b8Var8 = b8Var7;
                                        b8 b8Var9 = b8Var6;
                                        eja ejaVar2 = ejaVar;
                                        switch (b122) {
                                            case 0:
                                                ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                ejaVar2.x();
                                                break;
                                            default:
                                                ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                ejaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                K7.setOnClickListener(new View.OnClickListener(this) { // from class: mfa
                    public final /* synthetic */ eja b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b10 = r15;
                        final b8 b8Var6 = K6;
                        final b8 b8Var7 = K7;
                        final eja ejaVar = this.b;
                        switch (b10) {
                            case 0:
                                final byte b11 = 1;
                                ejaVar.A1(b8Var7, b8Var6, new Runnable() { // from class: ofa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b122 = b11;
                                        b8 b8Var8 = b8Var6;
                                        b8 b8Var9 = b8Var7;
                                        eja ejaVar2 = ejaVar;
                                        switch (b122) {
                                            case 0:
                                                ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                ejaVar2.x();
                                                break;
                                            default:
                                                ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                ejaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b12 = 0;
                                ejaVar.A1(b8Var7, b8Var6, new Runnable() { // from class: ofa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b122 = b12;
                                        b8 b8Var8 = b8Var7;
                                        b8 b8Var9 = b8Var6;
                                        eja ejaVar2 = ejaVar;
                                        switch (b122) {
                                            case 0:
                                                ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 1;
                                                ejaVar2.x();
                                                break;
                                            default:
                                                ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 0 : (byte) 2;
                                                ejaVar2.x();
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                return r15;
            }
            final bja v1 = v1(i);
            if (v1 != null && (u5bVar = v1.s) != null) {
                K6.setChecked(u5bVar.n);
                K7.setChecked(v1.s.o);
            }
            final byte b10 = 0;
            K6.setOnClickListener(new View.OnClickListener(this) { // from class: lfa
                public final /* synthetic */ eja b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b11 = b10;
                    final bja bjaVar = v1;
                    final b8 b8Var6 = K7;
                    final b8 b8Var7 = K6;
                    eja ejaVar = this.b;
                    switch (b11) {
                        case 0:
                            final byte b12 = 1;
                            ejaVar.A1(b8Var7, b8Var6, new Runnable() { // from class: nfa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    u5b u5bVar2;
                                    u5b u5bVar3;
                                    byte b13 = b12;
                                    b8 b8Var8 = b8Var6;
                                    b8 b8Var9 = b8Var7;
                                    bja bjaVar2 = bjaVar;
                                    switch (b13) {
                                        case 0:
                                            if (bjaVar2 != null && (u5bVar2 = bjaVar2.s) != null) {
                                                boolean z2 = b8Var9.getCheckView().a.q;
                                                boolean z3 = b8Var8.getCheckView().a.q;
                                                u5bVar2.n = z2;
                                                u5bVar2.o = z3;
                                                u5bVar2.d(true);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (bjaVar2 != null && (u5bVar3 = bjaVar2.s) != null) {
                                                boolean z4 = b8Var9.getCheckView().a.q;
                                                boolean z5 = b8Var8.getCheckView().a.q;
                                                u5bVar3.n = z4;
                                                u5bVar3.o = z5;
                                                u5bVar3.d(true);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b13 = 0;
                            ejaVar.A1(b8Var7, b8Var6, new Runnable() { // from class: nfa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    u5b u5bVar2;
                                    u5b u5bVar3;
                                    byte b132 = b13;
                                    b8 b8Var8 = b8Var7;
                                    b8 b8Var9 = b8Var6;
                                    bja bjaVar2 = bjaVar;
                                    switch (b132) {
                                        case 0:
                                            if (bjaVar2 != null && (u5bVar2 = bjaVar2.s) != null) {
                                                boolean z2 = b8Var9.getCheckView().a.q;
                                                boolean z3 = b8Var8.getCheckView().a.q;
                                                u5bVar2.n = z2;
                                                u5bVar2.o = z3;
                                                u5bVar2.d(true);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (bjaVar2 != null && (u5bVar3 = bjaVar2.s) != null) {
                                                boolean z4 = b8Var9.getCheckView().a.q;
                                                boolean z5 = b8Var8.getCheckView().a.q;
                                                u5bVar3.n = z4;
                                                u5bVar3.o = z5;
                                                u5bVar3.d(true);
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
            final byte b11 = 1;
            K7.setOnClickListener(new View.OnClickListener(this) { // from class: lfa
                public final /* synthetic */ eja b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b112 = b11;
                    final bja bjaVar = v1;
                    final b8 b8Var6 = K6;
                    final b8 b8Var7 = K7;
                    eja ejaVar = this.b;
                    switch (b112) {
                        case 0:
                            final byte b12 = 1;
                            ejaVar.A1(b8Var7, b8Var6, new Runnable() { // from class: nfa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    u5b u5bVar2;
                                    u5b u5bVar3;
                                    byte b132 = b12;
                                    b8 b8Var8 = b8Var6;
                                    b8 b8Var9 = b8Var7;
                                    bja bjaVar2 = bjaVar;
                                    switch (b132) {
                                        case 0:
                                            if (bjaVar2 != null && (u5bVar2 = bjaVar2.s) != null) {
                                                boolean z2 = b8Var9.getCheckView().a.q;
                                                boolean z3 = b8Var8.getCheckView().a.q;
                                                u5bVar2.n = z2;
                                                u5bVar2.o = z3;
                                                u5bVar2.d(true);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (bjaVar2 != null && (u5bVar3 = bjaVar2.s) != null) {
                                                boolean z4 = b8Var9.getCheckView().a.q;
                                                boolean z5 = b8Var8.getCheckView().a.q;
                                                u5bVar3.n = z4;
                                                u5bVar3.o = z5;
                                                u5bVar3.d(true);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b13 = 0;
                            ejaVar.A1(b8Var7, b8Var6, new Runnable() { // from class: nfa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    u5b u5bVar2;
                                    u5b u5bVar3;
                                    byte b132 = b13;
                                    b8 b8Var8 = b8Var7;
                                    b8 b8Var9 = b8Var6;
                                    bja bjaVar2 = bjaVar;
                                    switch (b132) {
                                        case 0:
                                            if (bjaVar2 != null && (u5bVar2 = bjaVar2.s) != null) {
                                                boolean z2 = b8Var9.getCheckView().a.q;
                                                boolean z3 = b8Var8.getCheckView().a.q;
                                                u5bVar2.n = z2;
                                                u5bVar2.o = z3;
                                                u5bVar2.d(true);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (bjaVar2 != null && (u5bVar3 = bjaVar2.s) != null) {
                                                boolean z4 = b8Var9.getCheckView().a.q;
                                                boolean z5 = b8Var8.getCheckView().a.q;
                                                u5bVar3.n = z4;
                                                u5bVar3.o = z5;
                                                u5bVar3.d(true);
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
            return r15;
        }
        int itemsCount = bgaVar.getItemsCount();
        if (itemsCount < eVar.getMessagesController().k4.A2.f()) {
            r11 = 0;
            bgaVar2 = bgaVar;
            b = 5;
            diaVar.Z(R.drawable.msg_addbot, new gfa(this, (byte) 3), ob6.M0(2131746444, null), false, true);
        } else {
            bgaVar2 = bgaVar;
            r11 = 0;
            b = 5;
        }
        if (itemsCount > 1 && !bgaVar2.d()) {
            diaVar.Z(R.drawable.tabs_reorder, new gfa(this, (byte) 4), ob6.M0(2131746417, r11), false, true);
        }
        if (itemsCount > 0) {
            diaVar.Z(R.drawable.msg_select, new gfa(this, b), ob6.M0(bgaVar2.d() ? 2131746415 : 2131746416, r11), false, true);
        }
        if (!TextUtils.isEmpty(bgaVar2.getCurrentLang())) {
            diaVar.Z(R.drawable.msg_delete, new gfa(this, (byte) 6), ob6.a0(r11, r11, 2131746418, r3c.K0(bgaVar2.getCurrentLang(), r11, r11)), true, true);
            return true;
        }
        return true;
    }

    public final void K1(float f) {
        s7 s7Var = this.p0;
        if (s7Var == null) {
            return;
        }
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[1];
        float f2 = 0.0f;
        if (zhaVar != null && zhaVar.F == 11) {
            f2 = 0.0f + f;
        }
        zha zhaVar2 = zhaVarArr[0];
        if (zhaVar2 != null && zhaVar2.F == 11) {
            f2 += 1.0f - f;
        }
        s7Var.setAlpha(f2);
        float f3 = (0.15f * f2) + 0.85f;
        s7Var.setScaleX(f3);
        s7Var.setScaleY(f3);
        s7Var.setVisibility(f2 <= 0.01f ? 8 : 0);
    }

    public final void L(int i, d79 d79Var, boolean z) {
        eia eiaVar;
        ArrayList arrayList = this.w1[i].e;
        int K0 = ((x46) d79Var.getLayoutManager()).K0();
        if (K0 >= 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    eiaVar = null;
                    break;
                } else {
                    if (K0 <= ((eia) arrayList.get(i2)).b) {
                        eiaVar = (eia) arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (eiaVar == null) {
                eiaVar = (eia) c00.g(1, arrayList);
            }
            if (eiaVar != null) {
                v0(i, eiaVar.d, eiaVar.b + 1, z);
            }
        }
    }

    public final void L0() {
        u5b u5bVar;
        u5b u5bVar2;
        this.K1.a();
        oha ohaVar = this.f0;
        if (ohaVar != null && (u5bVar2 = ohaVar.s) != null && u5bVar2 != null) {
            u5bVar2.z(ohaVar.w);
        }
        aga agaVar = this.h0;
        if (agaVar != null && (u5bVar = agaVar.s) != null && u5bVar != null) {
            u5bVar.z(agaVar.w);
        }
        Iterator it = this.m2.values().iterator();
        while (it.hasNext()) {
            cja cjaVar = ((dja) it.next()).c;
            u5b u5bVar3 = cjaVar.s;
            if (u5bVar3 != null && u5bVar3 != null) {
                u5bVar3.z(cjaVar.w);
            }
        }
    }

    public final void L1() {
        s7 s7Var = this.p0;
        if (s7Var == null) {
            return;
        }
        zha zhaVar = this.n0[1];
        boolean z = zhaVar != null && zhaVar.F == 11;
        if (z) {
            s7Var.setVisibility(0);
        }
        s7Var.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.85f).scaleY(z ? 1.0f : 0.85f).withEndAction(new q38((byte) 12, (Object) this, z)).setDuration(420L).setInterpolator(k43.h).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M() {
        zha[] zhaVarArr;
        zha zhaVar;
        int i;
        j79 adapter;
        if (this.r1) {
            Object[] objArr = 0;
            int i2 = 0;
            while (true) {
                zhaVarArr = this.n0;
                if (i2 >= zhaVarArr.length) {
                    zhaVar = null;
                    break;
                }
                zhaVar = zhaVarArr[i2];
                if (zhaVar.F == this.s1) {
                    break;
                } else {
                    i2++;
                }
            }
            if (zhaVar != null) {
                boolean j0 = j0(zhaVar.F);
                float f = this.q1;
                tia[] tiaVarArr = this.w1;
                if (f != 1.0f) {
                    if (f == 0.0f) {
                        this.r1 = false;
                        if (this.s1 == 0) {
                            tiaVarArr[0].g(false);
                        }
                        zhaVar.n.setVisibility(8);
                        zhaVar.h.invalidate();
                        return;
                    }
                    boolean z = f > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new aha(this, zhaVar, objArr == true ? 1 : 0));
                    ofFloat.addListener(new fq1(this, z, j0 ? 1 : 0, zhaVar));
                    ofFloat.setInterpolator(k43.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.r1 = false;
                int i3 = this.t1;
                int[] iArr = this.p1;
                iArr[j0 ? 1 : 0] = i3;
                if (!j0) {
                    xea.A(i3);
                } else if (W(zhaVar.F) >= 5) {
                    xea.E(this.t1);
                }
                for (int i4 = 0; i4 < zhaVarArr.length; i4++) {
                    zha zhaVar2 = zhaVarArr[i4];
                    if (zhaVar2 != null && zhaVar2.h != null && (((i = zhaVar2.F) == 0 || j0(i)) && (adapter = zhaVarArr[i4].h.getAdapter()) != null)) {
                        int b = adapter.b();
                        if (i4 == 0) {
                            tiaVarArr[0].g(false);
                        }
                        zhaVarArr[i4].n.setVisibility(8);
                        zhaVarArr[i4].x.x1(iArr[j0 ? 1 : 0]);
                        zhaVarArr[i4].h.c0();
                        zhaVarArr[i4].h.invalidate();
                        if (adapter.b() == b) {
                            hl.V3(zhaVarArr[i4].h);
                        } else {
                            adapter.f();
                        }
                    }
                }
                if (this.s < 0) {
                    e1();
                    return;
                }
                for (int i5 = 0; i5 < zhaVarArr.length; i5++) {
                    zha zhaVar3 = zhaVarArr[i5];
                    if (zhaVar3.F == this.s1) {
                        View m = zhaVar3.r.m(this.s);
                        if (m != null) {
                            this.w = m.getTop();
                        }
                        zha zhaVar4 = zhaVarArr[i5];
                        zhaVar4.x.g1(this.s, (-zhaVar4.h.getPaddingTop()) + this.w);
                    }
                }
            }
        }
    }

    public final void M0(int i, View view, r47 r47Var, int i2) {
        String str;
        if (r47Var == null || this.r1) {
            return;
        }
        fga fgaVar = this.c0;
        if (fgaVar == null || !fgaVar.f) {
            int i3 = 0;
            i3 = 0;
            if (this.F1) {
                int i4 = 8;
                if (i2 == 8 && !p()) {
                    return;
                }
                char c = r47.B0(r47Var.k) == this.m1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.c1;
                if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                    sparseArrayArr[c].remove(r47Var.e1());
                    if (!r47Var.s(null, false)) {
                        this.d1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c].put(r47Var.e1(), r47Var);
                    if (!r47Var.s(null, false)) {
                        this.d1++;
                    }
                }
                J0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    l1(false);
                } else {
                    j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.o0.setVisibility(this.d1 == 0 ? 0 : 8);
                    s7 s7Var = this.x0;
                    if (s7Var != null) {
                        s7Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    s7 s7Var2 = this.w0;
                    if (s7Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i4 = 0;
                        }
                        s7Var2.setVisibility(i4);
                    }
                    M1();
                }
                this.e1 = false;
                if (view instanceof zea) {
                    ((zea) view).b(sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0, true);
                } else if (view instanceof kja) {
                    ((kja) view).b(0, sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0, true);
                } else if (view instanceof cfa) {
                    ((cfa) view).f(sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0, true);
                } else if (view instanceof vea) {
                    ((vea) view).e(sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0, true);
                } else if (view instanceof vw2) {
                    ((vw2) view).c(sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0, true);
                } else if (view instanceof jja) {
                    ((jja) view).i(sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0, true);
                }
            } else {
                lga lgaVar = this.u1;
                tia[] tiaVarArr = this.w1;
                e eVar = this.y1;
                if (i2 == 0) {
                    tia tiaVar = tiaVarArr[i2];
                    int i5 = i - tiaVar.m;
                    if (i5 >= 0 && i5 < tiaVar.a.size()) {
                        PhotoViewer.q0().T1(null, eVar, null);
                        PhotoViewer.q0().n1(tiaVarArr[i2].a, i5, this.m1, this.f1, this.G, lgaVar);
                    }
                } else if (i2 == 2 || i2 == 4) {
                    if (view instanceof vea) {
                        ((vea) view).a();
                    }
                } else if (i2 == 5) {
                    PhotoViewer.q0().T1(null, eVar, null);
                    int indexOf = tiaVarArr[i2].a.indexOf(r47Var);
                    if (indexOf < 0) {
                        PhotoViewer.q0().n1(qd4.t(r47Var), 0, 0L, 0L, 0L, lgaVar);
                    } else {
                        PhotoViewer.q0().n1(tiaVarArr[i2].a, indexOf, this.m1, this.f1, this.G, lgaVar);
                    }
                } else if (i2 == 1) {
                    if (view instanceof zea) {
                        zea zeaVar = (zea) view;
                        TLRPC.Document F0 = r47Var.F0();
                        if (zeaVar.H) {
                            if (r47Var.x()) {
                                PhotoViewer.q0().T1(null, eVar, null);
                                int indexOf2 = tiaVarArr[i2].a.indexOf(r47Var);
                                if (indexOf2 < 0) {
                                    PhotoViewer.q0().n1(qd4.t(r47Var), 0, 0L, 0L, 0L, lgaVar);
                                    return;
                                } else {
                                    PhotoViewer.q0().n1(tiaVarArr[i2].a, indexOf2, this.m1, this.f1, this.G, lgaVar);
                                    return;
                                }
                            }
                            hl.q2(r47Var, eVar.getParentActivity(), eVar);
                        } else if (zeaVar.G) {
                            eVar.getFileLoader().f(F0);
                            zeaVar.f(true);
                        } else {
                            r47 message = zeaVar.getMessage();
                            message.P = true;
                            eVar.getFileLoader().X(F0, message, 0, 0);
                            zeaVar.f(true);
                        }
                    }
                } else if (i2 == 3) {
                    try {
                        TLRPC.WebPage webPage = r47.n1(r47Var.k) != null ? r47.n1(r47Var.k).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(r47Var) == null) {
                                    eVar.createArticleViewer(false).L(r47Var, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str2 = webPage.embed_url;
                            if (str2 != null && str2.length() != 0) {
                                iv3.J0(eVar, r47Var, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((cfa) view).F;
                            str = arrayList.size() > 0 ? ((CharSequence) arrayList.get(0)).toString() : null;
                        }
                        if (str != null) {
                            Y0(str);
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                } else if (j0(i2)) {
                    bja v1 = v1(i2);
                    u5b u5bVar = v1 != null ? v1.s : null;
                    if (u5bVar == null) {
                        return;
                    }
                    lcb orCreateStoryViewer = eVar.getOrCreateStoryViewer();
                    Context context = getContext();
                    int e1 = r47Var.e1();
                    l6b a = l6b.a(this.n0[0].h);
                    a.e = new ye9(u5bVar, (byte) 28);
                    if ((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).s1) {
                        i3 = hl.L(68.0f);
                    }
                    a.s += i3;
                    orCreateStoryViewer.G(context, e1, u5bVar, a);
                }
            }
            E1();
        }
    }

    public final void M1() {
        boolean z;
        u5b u5bVar;
        boolean l0 = l0();
        s7 s7Var = this.z0;
        s7 s7Var2 = this.y0;
        if (l0) {
            if (s7Var2 != null) {
                s7Var2.setVisibility(8);
            }
            if (s7Var != null) {
                s7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (s7Var2 != null) {
                s7Var2.setVisibility(8);
            }
            if (s7Var != null) {
                s7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (t0(getClosestTab())) {
                if (s7Var2 != null) {
                    s7Var2.setVisibility(8);
                }
                if (s7Var != null) {
                    s7Var.setVisibility(8);
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
            r47 r47Var = (r47) sparseArrayArr[0].valueAt(i);
            oha ohaVar = this.f0;
            if (ohaVar != null && (u5bVar = ohaVar.s) != null && !u5bVar.m(r47Var.e1())) {
                z = true;
                break;
            }
            i++;
        }
        if (s7Var2 != null) {
            s7Var2.setVisibility(z ? 0 : 8);
        }
        if (s7Var != null) {
            s7Var.setVisibility(z ? 8 : 0);
        }
    }

    public final void N(int i) {
        ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 0) {
            if (hl.O1() || org.telegram.messenger.a.b.getResources().getConfiguration().orientation != 2) {
                this.D0.setTextSize(20);
            } else {
                this.D0.setTextSize(18);
            }
        }
        if (i == 0) {
            this.K.f();
        }
    }

    public final boolean N0(r47 r47Var, View view, int i, boolean z) {
        fga fgaVar;
        final TL_stories.StoryItem storyItem;
        oha ohaVar;
        u5b u5bVar;
        final byte b = 0;
        if (!this.F1) {
            e eVar = this.y1;
            if (eVar.getParentActivity() != null && r47Var != null && ((fgaVar = this.c0) == null || !fgaVar.f)) {
                hl.t1(eVar.getParentActivity().getCurrentFocus());
                byte b2 = 14;
                long j = this.m1;
                final byte b3 = 1;
                if (!z || (!(t0(getClosestTab()) || getClosestTab() == 8) || this.F1)) {
                    char c = r47.B0(r47Var.k) == j ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c].put(r47Var.e1(), r47Var);
                    if (!r47Var.s(null, false)) {
                        this.d1++;
                    }
                    this.o0.setVisibility(this.d1 == 0 ? 0 : 8);
                    s7 s7Var = this.x0;
                    if (s7Var != null) {
                        s7Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    s7 s7Var2 = this.w0;
                    if (s7Var2 != null) {
                        s7Var2.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    j1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.Q0;
                        if (i2 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i2);
                        hl.y(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i2++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.e1 = false;
                    if (view instanceof zea) {
                        ((zea) view).b(true, true);
                    } else if (view instanceof kja) {
                        ((kja) view).b(i, true, true);
                    } else if (view instanceof cfa) {
                        ((cfa) view).f(true, true);
                    } else if (view instanceof vea) {
                        ((vea) view).e(true, true);
                    } else if (view instanceof vw2) {
                        ((vw2) view).c(true, true);
                    } else if (view instanceof jja) {
                        ((jja) view).i(true, true);
                    }
                    if (!this.F1) {
                        l1(true);
                    }
                    J0(sparseArrayArr[0]);
                    E1();
                    return true;
                }
                if (view instanceof jja) {
                    jja jjaVar = (jja) view;
                    jjaVar.k(jjaVar.r, jjaVar.n, true);
                }
                TL_stories.StoryItem storyItem2 = r47Var.l;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean t0 = t0(getClosestTab());
                    fu5 J = fu5.J(eVar, view);
                    fu5 K = J.K();
                    K.b(R.drawable.ic_ab_back, ob6.M0(2131753749, null), new vn1(J, b), false);
                    K.j();
                    fu5.e(K, getStoriesController().A(j, true), hashSet, true, new jr9(this, storyItem2, J, b2), new ku0((Object) this, (Object) hashSet, (Object) storyItem2, (Object) J, (byte) 21));
                    J.b(R.drawable.menu_album_add, ob6.M0(2131744462, null), new c10(J, K, (byte) 10), false);
                    J.j();
                    J.b(R.drawable.msg_select, ob6.M0(2131744446, null), new efa((Object) this, (Object) r47Var, (Object) view, i, (byte) 1), false);
                    final byte b4 = 3;
                    if (t0) {
                        int s1 = s1(getClosestTab());
                        String v = getStoriesController().v(s1, j);
                        J.b(R.drawable.tabs_reorder, ob6.M0(2131744447, null), new kfa(this, s1, (byte) 4), false);
                        storyItem = storyItem2;
                        J.b(R.drawable.msg_removefolder, ob6.M0(2131744448, null), new efa((Object) this, s1, (Object) storyItem, (Object) v, (byte) 2), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (ohaVar = this.f0) != null && (u5bVar = ohaVar.s) != null) {
                            if (u5bVar.m(storyItem.id)) {
                                J.b(R.drawable.chats_unpin, ob6.M0(2131744444, null), new Runnable(this) { // from class: sfa
                                    public final /* synthetic */ eja b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = b3;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        eja ejaVar = this.b;
                                        switch (b5) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ejaVar.I1, ejaVar.getContext());
                                                String M0 = ob6.M0(2131751452, null);
                                                id idVar = alertDialog$Builder.a;
                                                idVar.S = M0;
                                                idVar.U = ob6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.j(ob6.M0(2131751563, null), new vfa(ejaVar, storyItem3));
                                                alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 19));
                                                idVar.show();
                                                idVar.h();
                                                break;
                                            case 1:
                                                ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                ejaVar.C0(storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final byte b5 = 2;
                                J.b(R.drawable.chats_pin, ob6.M0(2131744449, null), new Runnable(this) { // from class: sfa
                                    public final /* synthetic */ eja b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b5;
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        eja ejaVar = this.b;
                                        switch (b52) {
                                            case 0:
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ejaVar.I1, ejaVar.getContext());
                                                String M0 = ob6.M0(2131751452, null);
                                                id idVar = alertDialog$Builder.a;
                                                idVar.S = M0;
                                                idVar.U = ob6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                alertDialog$Builder.j(ob6.M0(2131751563, null), new vfa(ejaVar, storyItem3));
                                                alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 19));
                                                idVar.show();
                                                idVar.h();
                                                break;
                                            case 1:
                                                ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                break;
                                            case 2:
                                                ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                break;
                                            default:
                                                ejaVar.C0(storyItem3);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        J.b(R.drawable.msg_archive, ob6.M0(2131744454, null), new Runnable(this) { // from class: sfa
                            public final /* synthetic */ eja b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b4;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                eja ejaVar = this.b;
                                switch (b52) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ejaVar.I1, ejaVar.getContext());
                                        String M0 = ob6.M0(2131751452, null);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.S = M0;
                                        idVar.U = ob6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.j(ob6.M0(2131751563, null), new vfa(ejaVar, storyItem3));
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 19));
                                        idVar.show();
                                        idVar.h();
                                        break;
                                    case 1:
                                        ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        break;
                                    case 2:
                                        ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        break;
                                    default:
                                        ejaVar.C0(storyItem3);
                                        break;
                                }
                            }
                        }, false);
                    }
                    J.b(R.drawable.msg_delete, ob6.M0(2131751563, null), new Runnable(this) { // from class: sfa
                        public final /* synthetic */ eja b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b52 = b;
                            TL_stories.StoryItem storyItem3 = storyItem;
                            eja ejaVar = this.b;
                            switch (b52) {
                                case 0:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ejaVar.I1, ejaVar.getContext());
                                    String M0 = ob6.M0(2131751452, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    idVar.U = ob6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                    alertDialog$Builder.j(ob6.M0(2131751563, null), new vfa(ejaVar, storyItem3));
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 19));
                                    idVar.show();
                                    idVar.h();
                                    break;
                                case 1:
                                    ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                    break;
                                case 2:
                                    ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                    break;
                                default:
                                    ejaVar.C0(storyItem3);
                                    break;
                            }
                        }
                    }, true);
                    J.i = (byte) 3;
                    J.u = true;
                    J.v = true;
                    J.L = true;
                    J.M = (byte) 3;
                    Point point = hl.q;
                    int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                    J.N = min;
                    J.O = (min << 2) / 3;
                    J.t = true;
                    J.V = true;
                    J.c0 = true;
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
        cga cgaVar;
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
        wia wiaVar;
        bha bhaVar = this.L0;
        if (bhaVar == null) {
            return;
        }
        boolean z11 = !this.G1.u() ? false : z;
        boolean z12 = (this.W == null || (wiaVar = this.x1) == null || !wiaVar.f) ? false : true;
        long j = this.m1;
        int i12 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        e eVar = this.y1;
        if (i12 <= 0 || eVar == null) {
            i = 1;
            user = null;
        } else {
            i = 1;
            user = eVar.getMessagesController().X1(Long.valueOf(j));
        }
        boolean z13 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i : false;
        int i13 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.h1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z13) ? 0 : i;
        int i14 = ((wf3.D(j) || wf3.y(j)) && !wf3.B(j) && (((userFull = this.h1) != null && userFull.stories_pinned_available) || (((chatFull = this.g1) != null && chatFull.stories_pinned_available) || s0())) && i0()) ? i : 0;
        cga cgaVar2 = this.b0;
        int i15 = i13;
        boolean z14 = (cgaVar2 == null || (((userFull3 = this.h1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.g1) == null || chatFull3.stargifts_count <= 0))) ? false : i;
        int i16 = i14;
        TLRPC.ChatFull chatFull4 = this.g1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.h1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z15 = z11;
                int i17 = this.U1 == bhaVar.o0 ? i : 0;
                boolean z16 = (i16 == 0 || i15 != 0) ? i : false;
                int i18 = i17;
                i2 = z16 == bhaVar.d(8) ? i18 + 1 : i18;
                if (z13 != bhaVar.d(13)) {
                    i2++;
                }
                if (q0() != bhaVar.d(8)) {
                    i2++;
                }
                if (z14 == bhaVar.d(14) || (cgaVar2 != null && z14 && this.T1 != cgaVar2.getLastEmojisHash())) {
                    i2++;
                }
                s0 = s0();
                int i19 = 14;
                rha rhaVar = this.d0;
                int[] iArr2 = this.a1;
                if (s0) {
                    z2 = z14;
                    int i20 = i2;
                    int i21 = (rhaVar.d == null ? i : false) == bhaVar.d(7) ? i20 + 1 : i20;
                    if (iArr2[0] <= 0) {
                        z9 = i;
                        i8 = 0;
                    } else {
                        z9 = false;
                        i8 = 0;
                    }
                    int i22 = i21;
                    int i23 = z9 == bhaVar.d(i8) ? i22 + 1 : i22;
                    if (iArr2[i] <= 0) {
                        z10 = i;
                        i9 = z10;
                    } else {
                        i9 = i;
                        z10 = false;
                    }
                    int i24 = i23;
                    int i25 = z10 == bhaVar.d(i9) ? i24 + 1 : i24;
                    if (wf3.B(j)) {
                        i10 = i25;
                    } else {
                        int i26 = i25;
                        int i27 = (iArr2[3] <= 0) == bhaVar.d(3) ? i26 + 1 : i26;
                        i10 = (iArr2[4] <= 0) == bhaVar.d(4) ? i27 + 1 : i27;
                    }
                    int i28 = i11;
                    int i29 = (iArr2[2] <= 0) == bhaVar.d(2) ? i28 + 1 : i28;
                    int i30 = (iArr2[5] <= 0) == bhaVar.d(5) ? i29 + 1 : i29;
                    int i31 = (iArr2[6] <= 0) == bhaVar.d(6) ? i30 + 1 : i30;
                    boolean z17 = !this.T.d.isEmpty();
                    int i32 = i31;
                    i2 = z17 != bhaVar.d(10) ? i32 + 1 : i32;
                    z3 = h0() && !eVar.getMessagesController().F1().b && eVar.getMessagesController().F1().e();
                    z4 = z17;
                    if (z3 != bhaVar.d(11)) {
                        i2++;
                    }
                    if (z12 != bhaVar.d(12)) {
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
                        transitionSet.addTransition(new i7((byte) 3));
                        z5 = z12;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(bhaVar.getTabsContainer(), transitionSet);
                        bhaVar.V = bhaVar.w;
                        bhaVar.W = bhaVar.x;
                    } else {
                        iArr = iArr2;
                        z5 = z12;
                    }
                    SparseArray f = bhaVar.f();
                    if (i2 > 3) {
                        f = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (q0()) {
                        z6 = z13;
                        z7 = z3;
                        str = null;
                        arrayList.add(new Pair(8, ob6.M0(2131746362, null)));
                        bhaVar.c0 = (short) 420;
                    } else {
                        z6 = z13;
                        z7 = z3;
                        str = null;
                    }
                    if (i15 != 0) {
                        arrayList.add(new Pair(8, ob6.M0(2131746419, str)));
                    } else if ((wf3.D(j) || wf3.y(j)) && !wf3.B(j) && ((((userFull2 = this.h1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.g1) != null && chatFull2.stories_pinned_available) || s0())) && i0())) {
                        if (k0()) {
                            arrayList.add(new Pair(9, ob6.M0(2131746454, null)));
                            bhaVar.c0 = (short) 420;
                        } else {
                            arrayList.add(new Pair(8, ob6.M0(2131746362, null)));
                            if (s0()) {
                                arrayList.add(new Pair(9, ob6.M0(2131746454, null)));
                            }
                        }
                    }
                    if (z2) {
                        String M02 = ob6.M0(2131746403, null);
                        HashMap hashMap = eu8.V;
                        axa axaVar = cgaVar2.d;
                        Object obj2 = "";
                        if (axaVar == null) {
                            cgaVar = cgaVar2;
                            sparseArray = f;
                            num = 4;
                            str6 = M02;
                            i3 = i12;
                        } else {
                            ArrayList arrayList2 = axaVar.l;
                            str6 = M02;
                            i3 = i12;
                            sparseArray = f;
                            num = 4;
                            Pair pair = new Pair(Integer.valueOf(yac.t0), Long.valueOf(cgaVar2.c));
                            if (arrayList2.isEmpty()) {
                                if (axaVar.i && (obj = (CharSequence) hashMap.get(pair)) != null) {
                                    obj2 = obj;
                                }
                                cgaVar = cgaVar2;
                            } else {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                int i33 = 0;
                                while (true) {
                                    cgaVar = cgaVar2;
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
                                    cgaVar2 = cgaVar;
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
                                            TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) hl.V(TLRPC.TL_documentAttributeCustomEmoji.class, document2.attributes);
                                            if (tL_documentAttributeCustomEmoji == null || TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt)) {
                                                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = (TLRPC.TL_documentAttributeSticker) hl.V(TLRPC.TL_documentAttributeSticker.class, document2.attributes);
                                                if (tL_documentAttributeSticker != null && !TextUtils.isEmpty(tL_documentAttributeSticker.alt)) {
                                                    str7 = tL_documentAttributeSticker.alt;
                                                }
                                            } else {
                                                str7 = tL_documentAttributeCustomEmoji.alt;
                                            }
                                        }
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                                        spannableStringBuilder2.setSpan(new hm(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
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
                                    this.T1 = cgaVar.getLastEmojisHash();
                                }
                                i6 = 2;
                                c = 0;
                                CharSequence[] charSequenceArr2 = new CharSequence[i6];
                                charSequenceArr2[c] = str6;
                                charSequenceArr2[1] = obj2;
                                arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                                this.T1 = cgaVar.getLastEmojisHash();
                            }
                        }
                        z8 = z5;
                        i6 = 2;
                        c = 0;
                        CharSequence[] charSequenceArr22 = new CharSequence[i6];
                        charSequenceArr22[c] = str6;
                        charSequenceArr22[1] = obj2;
                        arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr22)));
                        this.T1 = cgaVar.getLastEmojisHash();
                    } else {
                        sparseArray = f;
                        num = 4;
                        i3 = i12;
                        z8 = z5;
                    }
                    if (z6) {
                        arrayList.add(new Pair(13, ob6.M0(2131746419, null)));
                    }
                    int i35 = 2131745141;
                    if (!s0()) {
                        if (z7) {
                            str3 = null;
                            arrayList.add(new Pair(11, ob6.M0(2131745635, null)));
                        } else {
                            str3 = null;
                        }
                        if (rhaVar.d != null) {
                            arrayList.add(new Pair(7, ob6.M0(2131749183, str3)));
                        }
                        if (iArr[0] > 0) {
                            if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && rhaVar.d == null) {
                                arrayList.add(new Pair(0, ob6.M0(2131745134, null)));
                            } else {
                                str4 = null;
                                arrayList.add(new Pair(0, ob6.M0(2131745135, null)));
                                if (z8) {
                                    arrayList.add(new Pair(12, ob6.M0(2131745621, str4)));
                                    uc7.e1().edit().putInt("savedhint", 3).apply();
                                }
                                if (iArr[1] <= 0) {
                                    str5 = null;
                                    arrayList.add(new Pair(1, ob6.M0(2131745142, null)));
                                } else {
                                    str5 = null;
                                }
                                if (wf3.B(j)) {
                                    if (iArr[3] > 0) {
                                        arrayList.add(new Pair(3, ob6.M0(2131745138, str5)));
                                    }
                                    if (iArr[4] > 0) {
                                        arrayList.add(new Pair(num, ob6.M0(2131745133, str5)));
                                    }
                                    if (iArr[8] > 0) {
                                        arrayList.add(new Pair(15, ob6.M0(2131745131, str5)));
                                    }
                                } else {
                                    Integer num2 = num;
                                    if (iArr[4] > 0) {
                                        arrayList.add(new Pair(num2, ob6.M0(2131745133, str5)));
                                    }
                                }
                                if (iArr[2] > 0) {
                                    arrayList.add(new Pair(2, ob6.M0(2131745130, str5)));
                                }
                                if (iArr[5] > 0) {
                                    arrayList.add(new Pair(5, ob6.M0(2131745141, str5)));
                                }
                                if (iArr[6] > 0) {
                                    arrayList.add(new Pair(6, ob6.M0(2131745140, str5)));
                                }
                                if (z4) {
                                    arrayList.add(new Pair(10, ob6.M0(i3 > 0 ? 2131745046 : 2131745042, null)));
                                }
                            }
                        }
                        str4 = null;
                        if (z8) {
                        }
                        if (iArr[1] <= 0) {
                        }
                        if (wf3.B(j)) {
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
                    if (bhaVar.o0) {
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
                                        M0 = ob6.M0(2131745134, null);
                                    } else if (i36 == 1) {
                                        M0 = ob6.M0(2131745142, null);
                                    } else if (i36 == 2) {
                                        M0 = ob6.M0(2131745130, null);
                                    } else if (i36 == 3) {
                                        M0 = ob6.M0(2131745138, null);
                                    } else if (i36 == 4) {
                                        M0 = ob6.M0(2131745133, null);
                                    } else if (i36 == 5) {
                                        M0 = ob6.M0(i35, null);
                                    } else if (i36 == 8) {
                                        M0 = ob6.M0(2131746362, null);
                                    } else if (i36 != i19) {
                                        str2 = null;
                                        arrayList.add(new Pair(valueOf2, str2));
                                    } else {
                                        M0 = ob6.M0(2131746403, null);
                                    }
                                    str2 = M0;
                                    arrayList.add(new Pair(valueOf2, str2));
                                }
                            }
                            i36++;
                            i35 = 2131745141;
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
                                if (bhaVar.d(((Integer) pair2.first).intValue())) {
                                    sparseArray2 = sparseArray;
                                } else {
                                    sparseArray2 = sparseArray;
                                    bhaVar.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, sparseArray2);
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
                this.U1 = bhaVar.o0;
                bhaVar.c();
                S0();
                C();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z152 = z11;
        if (this.U1 == bhaVar.o0) {
        }
        if (i16 == 0) {
        }
        int i182 = i17;
        if (z16 == bhaVar.d(8)) {
        }
        if (z13 != bhaVar.d(13)) {
        }
        if (q0() != bhaVar.d(8)) {
        }
        if (z14 == bhaVar.d(14)) {
        }
        i2++;
        s0 = s0();
        int i192 = 14;
        rha rhaVar2 = this.d0;
        int[] iArr22 = this.a1;
        if (s0) {
        }
        if (i2 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.U1 = bhaVar.o0;
        bhaVar.c();
        S0();
        C();
    }

    public final String O(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        bga bgaVar;
        if (!l0()) {
            return ob6.M0(2131752998, null);
        }
        if (z && (bgaVar = this.a0) != null) {
            return bgaVar.getBotPreviewsSubtitle();
        }
        oha ohaVar = this.f0;
        if (ohaVar == null || ohaVar.s == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < ohaVar.s.i.size(); i3++) {
                r47 r47Var = (r47) ohaVar.s.i.get(i3);
                TL_stories.StoryItem storyItem = r47Var.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (r47.J4(messageMedia.document)) {
                        i2++;
                    } else if (r47Var.l.media.photo != null) {
                        i++;
                    }
                }
            }
        }
        if (i == 0 && i2 == 0) {
            return ob6.M0(2131752998, null);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(ob6.G(i, "Images", new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(ob6.G(i2, "Videos", new Object[0]));
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
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[0];
        if (zhaVar == null) {
            return null;
        }
        int i = zhaVar.F;
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
                xea.A(R);
            } else if (W(zhaVarArr[0].F) >= 5 || t0(zhaVarArr[0].F)) {
                xea.E(R);
            }
            l(R);
        }
        return Boolean.valueOf(R != R(j0 ? 1 : 0, R, true));
    }

    public final zha P(int i) {
        int i2 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i2 >= zhaVarArr.length) {
                return null;
            }
            zha zhaVar = zhaVarArr[i2];
            if (zhaVar != null && zhaVar.F == i) {
                return zhaVar;
            }
            i2++;
        }
    }

    public final void P0(float f) {
        zha[] zhaVarArr = this.n0;
        if (f != 1.0f || zhaVarArr[1].getVisibility() == 0) {
            if (this.k1) {
                zhaVarArr[0].setTranslationX((-f) * r3.getMeasuredWidth());
                zhaVarArr[1].setTranslationX(zhaVarArr[0].getMeasuredWidth() - (zhaVarArr[0].getMeasuredWidth() * f));
            } else {
                zhaVarArr[0].setTranslationX(r3.getMeasuredWidth() * f);
                zhaVarArr[1].setTranslationX((zhaVarArr[0].getMeasuredWidth() * f) - zhaVarArr[0].getMeasuredWidth());
            }
            T0(getTabProgress());
            float U = U(f);
            this.s0 = U;
            this.u0.setVisibility((U == 0.0f || !q() || k0()) ? 4 : 0);
            s7 s7Var = this.q0;
            if (s7Var == null || q()) {
                this.r0 = V(f);
                L1();
            } else {
                setSearchItemVisibility(s0() ? 8 : 4);
                this.r0 = 0.0f;
            }
            G1(false);
            if (f == 1.0f) {
                zha zhaVar = zhaVarArr[0];
                zhaVarArr[0] = zhaVarArr[1];
                zhaVarArr[1] = zhaVar;
                zhaVar.setVisibility(8);
                if (s7Var != null && this.A0 == 2) {
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
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[0];
        if (zhaVar == null) {
            return null;
        }
        if (this.n1 && j0(zhaVar.F)) {
            return null;
        }
        int i = zhaVarArr[0].F;
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
                xea.A(R);
            } else if (W(zhaVarArr[0].F) >= 5 || t0(zhaVarArr[0].F)) {
                xea.E(R);
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
        return this.b2 + this.f2 + (z ? hl.L(52.0f) : 0);
    }

    public void S0() {
        boolean z = s0() || k0();
        zia ziaVar = this.h0.x;
        if (ziaVar != null) {
            ziaVar.b(z && getClosestTab() == 9);
        }
        zia ziaVar2 = this.f0.x;
        if (ziaVar2 != null) {
            ziaVar2.b(z && getClosestTab() == 8);
        }
        for (dja djaVar : this.m2.values()) {
            cja cjaVar = djaVar.c;
            if (cjaVar.s != null) {
                cjaVar.x.b(z && getClosestTab() == djaVar.a);
            }
        }
        s7 s7Var = this.q0;
        if (s7Var != null) {
            yga ygaVar = this.M0;
            s7Var.setSearchFieldHint(ob6.M0((ygaVar != null && ygaVar.a() && getSelectedTab() == 11) ? 2131745596 : 2131745564, null));
        }
        C();
        B(true, true);
    }

    public final int T(int i) {
        return X(i) + hl.L(54.0f) + this.d2 + this.e2 + this.p2 + (i == 9 ? hl.L(64.0f) : 0);
    }

    public void T0(float f) {
        K0();
    }

    public final float U(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[1];
        if (zhaVar != null && f0(zhaVar.F)) {
            f2 = 0.0f + f;
        }
        zha zhaVar2 = zhaVarArr[0];
        return (zhaVar2 == null || !f0(zhaVar2.F)) ? f2 : (1.0f - f) + f2;
    }

    public final void U0(int i, long j, e eVar) {
        new k2a(eVar, j, this.p1[1], new mt7(this, j, i, (byte) 1)).show();
    }

    public final float V(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[1];
        if (zhaVar != null && p0(zhaVar.F) && zhaVarArr[1].F != 11) {
            f2 = 0.0f + f;
        }
        zha zhaVar2 = zhaVarArr[0];
        return (zhaVar2 == null || !p0(zhaVar2.F) || zhaVarArr[0].F == 11) ? f2 : (1.0f - f) + f2;
    }

    public final void V0(int i, long j, e eVar) {
        jj.s0(eVar, ob6.M0(2131751563, null), hl.S2(ob6.a0(null, null, 2131744452, getStoriesController().v(i, j))), ob6.M0(2131751563, null), true, new lb2((Object) this, j, i, (byte) 5));
    }

    public final int W(int i) {
        bja v1;
        u5b u5bVar;
        if (!j0(i) || (v1 = v1(i)) == null || (u5bVar = v1.s) == null) {
            return 0;
        }
        return u5bVar.g();
    }

    public final void W0(int i, long j, e eVar) {
        String v = getStoriesController().v(i, j);
        Context context = eVar.getContext();
        vnb resourceProvider = eVar.getResourceProvider();
        lf lfVar = new lf((Object) this, j, i, (byte) 6);
        Pattern pattern = jj.a;
        jj.O(context, eVar, ob6.M0(2131744439, null), ob6.M0(2131744438, null), ob6.M0(2131744437, null), v, 12, ob6.M0(2131746005, null), resourceProvider, lfVar);
    }

    public final int X(int i) {
        fga fgaVar = this.c0;
        return (int) ((fgaVar == null || !(t0(i) || i == 8)) ? 0.0f : fgaVar.getVisibilityFactor() * hl.L(40.0f));
    }

    public final void X0(int i, boolean z) {
        zha[] zhaVarArr = this.n0;
        if (zhaVarArr[0].F == i) {
            return;
        }
        zha zhaVar = zhaVarArr[1];
        zhaVar.F = i;
        zhaVar.setVisibility(0);
        g0();
        z1(true);
        this.k1 = z;
        S0();
        j(!p0(i));
        G1(true);
    }

    public final void Y0(String str) {
        boolean D3 = hl.D3(str);
        e eVar = this.y1;
        if (D3) {
            jj.n0(eVar, str, true, true);
        } else {
            m01.u(eVar.getParentActivity(), str);
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
            zha[] zhaVarArr = this.n0;
            if (i2 >= zhaVarArr.length) {
                break;
            }
            zha zhaVar = zhaVarArr[i2];
            if (zhaVar != null) {
                int i4 = zhaVar.F;
                if ((z && i == 8 && t0(i4)) || i4 == i) {
                    i3++;
                    width = zhaVarArr[i2].getTranslationX();
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
        oha ohaVar = this.f0;
        if (ohaVar == null || ohaVar.s == null) {
            return;
        }
        e eVar = this.y1;
        if (z && arrayList.size() > eVar.getMessagesController().k4.x2.f()) {
            c00.v(ob6.G(eVar.getMessagesController().k4.x2.f(), "StoriesPinLimit", new Object[0]), d31.b0(eVar), R.raw.chats_infotip, 36);
            return;
        }
        u5b u5bVar = ohaVar.s;
        int i = u5bVar.c;
        ArrayList arrayList2 = u5bVar.g;
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
        boolean z3 = arrayList3.size() > uc7.s1(i).k4.x2.f();
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
                u5bVar.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = uc7.s1(i).j1(u5bVar.d);
                ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new xe2((byte) 11));
            }
            z2 = z3;
        }
        if (z2) {
            c00.v(ob6.G(eVar.getMessagesController().k4.x2.f(), "StoriesPinLimit", new Object[0]), d31.b0(eVar), R.raw.chats_infotip, 36);
        } else if (z) {
            d31.b0(eVar).I(R.raw.ic_pin, hl.S2(ob6.G(arrayList.size(), "StoriesPinned", new Object[0])), ob6.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
        } else {
            c00.v(ob6.G(arrayList.size(), "StoriesUnpinned", new Object[0]), d31.b0(eVar), R.raw.ic_unpin, 36);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Ci));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.Ai));
        hashSet.add(Integer.valueOf(aob.Bi));
        hashSet.add(Integer.valueOf(aob.K6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.sj));
        hashSet.add(Integer.valueOf(aob.zi));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.li));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.x7));
        hashSet.add(Integer.valueOf(aob.t7));
        hashSet.add(Integer.valueOf(aob.w7));
        hashSet.add(Integer.valueOf(aob.be));
        hashSet.add(Integer.valueOf(aob.nd));
    }

    public final float b0(int i, boolean z) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i2 >= zhaVarArr.length) {
                return f;
            }
            zha zhaVar = zhaVarArr[i2];
            if (zhaVar != null) {
                int i3 = zhaVar.F;
                if ((z && i == 8 && t0(i3)) || i3 == i) {
                    f = (1.0f - Math.abs(zhaVarArr[i2].getTranslationX() / getWidth())) + f;
                }
            }
            i2++;
        }
    }

    public final boolean b1(MotionEvent motionEvent, boolean z) {
        zha zhaVar;
        bga bgaVar;
        int closestTab = getClosestTab();
        bha bhaVar = this.L0;
        int i = -1;
        int i2 = bhaVar.P.get(bhaVar.n + (z ? 1 : -1), -1);
        fga fgaVar = this.c0;
        if (fgaVar != null) {
            if (t0(closestTab) || closestTab == 8) {
                uic uicVar = fgaVar.b;
                i = uicVar.c0.get(uicVar.G + (z ? 1 : -1), -1);
            } else if (t0(i2) || i2 == 8) {
                i = fgaVar.getCurrentAlbumId();
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
                zha[] zhaVarArr = this.n0;
                zha zhaVar2 = zhaVarArr[0];
                if (zhaVar2 != null && zhaVar2.F == 13 && (bgaVar = this.a0) != null) {
                    uq0 uq0Var = bgaVar.n;
                    if (!z) {
                    }
                }
                zha zhaVar3 = zhaVarArr[0];
                cga cgaVar = this.b0;
                if (zhaVar3 != null && zhaVar3.F == 14 && cgaVar != null) {
                    uq0 uq0Var2 = cgaVar.h;
                    if (!z) {
                    }
                }
                if ((!this.F1 || (zhaVar = zhaVarArr[0]) == null || zhaVar.F != 13) && ((cgaVar == null || !cgaVar.g()) && (fgaVar == null || !fgaVar.f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    g0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    bhaVar.setEnabled(false);
                    zha zhaVar4 = zhaVarArr[1];
                    zhaVar4.F = i2;
                    zhaVar4.setVisibility(0);
                    this.k1 = z;
                    z1(true);
                    if (z) {
                        zhaVarArr[1].setTranslationX(zhaVarArr[0].getMeasuredWidth());
                    } else {
                        zhaVarArr[1].setTranslationX(-zhaVarArr[0].getMeasuredWidth());
                    }
                    T0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int c0(int i) {
        vnb vnbVar = this.I1;
        return vnbVar != null ? vnbVar.h(i) : aob.w0(null, i, false);
    }

    public final boolean d0() {
        return this.y1.getConnectionsManager().getConnectionState() == 3;
    }

    public final void d1(j79 j79Var) {
        if (j79Var instanceof yia) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (j79Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        nia niaVar = this.Q;
        if (j79Var == niaVar) {
            niaVar.r = null;
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
    @Override // fn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        jga jgaVar;
        r47 r47Var;
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
        lha lhaVar;
        jga jgaVar2;
        int i7;
        int i8;
        jga jgaVar3;
        int i9 = jn7.V;
        c79 c79Var = this.R;
        c79 c79Var2 = this.P;
        sia siaVar = this.M;
        c79 c79Var3 = this.O;
        c79 c79Var4 = this.N;
        e eVar = this.y1;
        nia niaVar = this.Q;
        lha lhaVar2 = this.K;
        long j = this.m1;
        zha[] zhaVarArr = this.n0;
        tia[] tiaVarArr = this.w1;
        if (i == i9) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != eVar.getClassGuid() || intValue2 != tiaVarArr[intValue3].p) {
                if (this.x1 == null || !tiaVarArr[intValue3].a.isEmpty() || tiaVarArr[intValue3].o || !J(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    c79Var = lhaVar2;
                } else if (intValue3 == 1) {
                    c79Var = c79Var4;
                } else if (intValue3 == 2) {
                    c79Var = c79Var3;
                } else if (intValue3 == 3) {
                    c79Var = siaVar;
                } else if (intValue3 == 4) {
                    c79Var = c79Var2;
                } else if (intValue3 != 5) {
                    c79Var = intValue3 == 15 ? niaVar : null;
                }
                if (c79Var != null) {
                    for (int i10 = 0; i10 < zhaVarArr.length; i10++) {
                        zha zhaVar = zhaVarArr[i10];
                        if (zhaVar != null && (jgaVar2 = zhaVar.h) != null && jgaVar2.getAdapter() == c79Var) {
                            zhaVarArr[i10].h.E0();
                        }
                    }
                    c79Var.f();
                }
                this.e1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean B = wf3.B(j);
            int i11 = longValue == j ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                tiaVarArr[intValue3].f[i11] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i7 = intValue3;
                c79Var = lhaVar2;
            } else if (intValue3 == 1) {
                i7 = intValue3;
                c79Var = c79Var4;
            } else if (intValue3 == 2) {
                i7 = intValue3;
                c79Var = c79Var3;
            } else if (intValue3 == 3) {
                i7 = intValue3;
                c79Var = siaVar;
            } else if (intValue3 == 4) {
                i7 = intValue3;
                c79Var = c79Var2;
            } else if (intValue3 == 5) {
                i7 = intValue3;
            } else if (intValue3 == 15) {
                c79Var = niaVar;
                i7 = 8;
            } else {
                i7 = intValue3;
                c79Var = null;
            }
            int size2 = tiaVarArr[i7].a.size();
            if (c79Var != null) {
                i8 = c79Var.b();
                if (c79Var instanceof y69) {
                    ((y69) c79Var).L();
                }
            } else {
                i8 = 0;
            }
            tiaVarArr[i7].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    r47 r47Var2 = (r47) arrayList.get(size3);
                    if (tiaVarArr[i7].a(r47Var2, i11, r13, B)) {
                        sparseBooleanArray.put(r47Var2.e1(), r13);
                        tia tiaVar = tiaVarArr[i7];
                        int i12 = tiaVar.m - r13;
                        tiaVar.m = i12;
                        if (i12 < 0) {
                            tiaVar.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                tiaVarArr[i7].l = ((Boolean) objArr[5]).booleanValue();
                tia tiaVar2 = tiaVarArr[i7];
                if (tiaVar2.l) {
                    tiaVar2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    r47 r47Var3 = (r47) arrayList.get(i13);
                    if (tiaVarArr[i7].a(r47Var3, i11, r12, B)) {
                        sparseBooleanArray.put(r47Var3.e1(), true);
                        tia tiaVar3 = tiaVarArr[i7];
                        int i14 = tiaVar3.n - 1;
                        tiaVar3.n = i14;
                        if (i14 < 0) {
                            tiaVar3.n = r12;
                        }
                    }
                    i13++;
                    r12 = 0;
                }
                tia tiaVar4 = tiaVarArr[i7];
                if (tiaVar4.o && tiaVar4.a.size() > 0) {
                    tia tiaVar5 = tiaVarArr[i7];
                    tiaVar5.k = ((r47) tiaVar5.a.get(0)).e1();
                }
                tiaVarArr[i7].i[i11] = ((Boolean) objArr[5]).booleanValue();
                tia tiaVar6 = tiaVarArr[i7];
                if (tiaVar6.i[i11]) {
                    int size4 = tiaVar6.b[i11].size();
                    if (i11 == 0) {
                        size4 += tiaVarArr[i7].m;
                    }
                    tiaVarArr[i7].f[i11] = size4;
                }
            }
            if (!booleanValue && i11 == 0) {
                tia tiaVar7 = tiaVarArr[i7];
                if (tiaVar7.i[i11] && this.f1 != 0) {
                    tiaVar7.g = true;
                    eVar.getMediaDataController().P0(this.f1, 50, tiaVarArr[i7].j[1], 0, i7, this.G, 1, eVar.getClassGuid(), tiaVarArr[i7].p, null, null);
                }
            }
            int i15 = i7;
            if (c79Var != null) {
                jga jgaVar4 = null;
                for (int i16 = 0; i16 < zhaVarArr.length; i16++) {
                    zha zhaVar2 = zhaVarArr[i16];
                    if (zhaVar2 != null && (jgaVar3 = zhaVar2.h) != null && jgaVar3.getAdapter() == c79Var) {
                        jga jgaVar5 = zhaVarArr[i16].h;
                        jgaVar5.E0();
                        jgaVar4 = jgaVar5;
                    }
                }
                int b = c79Var.b();
                if (c79Var != lhaVar2) {
                    try {
                        c79Var.f();
                    } catch (Throwable unused) {
                    }
                } else if (lhaVar2.b() == i8) {
                    hl.V3(jgaVar4);
                } else {
                    lhaVar2.f();
                }
                if (!tiaVarArr[i15].a.isEmpty() || tiaVarArr[i15].g) {
                    if (jgaVar4 != null && (c79Var == lhaVar2 || b >= i8)) {
                        i(jgaVar4, i8, sparseBooleanArray);
                    }
                } else if (jgaVar4 != null) {
                    i(jgaVar4, i8, sparseBooleanArray);
                }
                if (jgaVar4 != null && !tiaVarArr[i15].o) {
                    if (size2 == 0) {
                        for (int i17 = 0; i17 < 2; i17++) {
                            if (zhaVarArr[i17].F == 0) {
                                ((x46) jgaVar4.getLayoutManager()).g1(lhaVar2.L(0), 0);
                            }
                        }
                    } else {
                        e1();
                    }
                }
            }
            tia tiaVar8 = tiaVarArr[i15];
            if (tiaVar8.o) {
                if (tiaVar8.a.size() == 0) {
                    H0(i15);
                } else {
                    tiaVarArr[i15].o = false;
                }
            }
            this.e1 = true;
            return;
        }
        if (i == jn7.v) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat M0 = wf3.y(j) ? eVar.getMessagesController().M0(Long.valueOf(-j)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (xc2.T(M0)) {
                if (longValue2 == 0 && this.f1 != 0) {
                    i5 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i18 = -1;
                    i6 = 0;
                    z3 = false;
                    while (true) {
                        lhaVar = lhaVar2;
                        if (i6 < size) {
                            break;
                        }
                        int i19 = 0;
                        while (i19 < tiaVarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (tiaVarArr[i19].b(((Integer) arrayList2.get(i6)).intValue(), i5) != null) {
                                i18 = i19;
                                z3 = true;
                            }
                            i19++;
                            arrayList2 = arrayList3;
                        }
                        i6++;
                        lhaVar2 = lhaVar;
                    }
                    if (z3) {
                        this.e1 = true;
                        if (lhaVar != null) {
                            lhaVar.f();
                        }
                        if (c79Var4 != null) {
                            c79Var4.f();
                        }
                        if (c79Var3 != null) {
                            c79Var3.f();
                        }
                        if (siaVar != null) {
                            siaVar.X(false);
                        }
                        if (c79Var2 != null) {
                            c79Var2.f();
                        }
                        if (niaVar != null) {
                            niaVar.f();
                        }
                        if (c79Var != null) {
                            c79Var.f();
                        }
                        if (i18 == 0 || i18 == 1 || i18 == 2 || i18 == 4) {
                            G0(true);
                        }
                    }
                    P(i18);
                    return;
                }
                if (longValue2 != M0.id) {
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
                lhaVar = lhaVar2;
                if (i6 < size) {
                }
                i6++;
                lhaVar2 = lhaVar;
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
            boolean B2 = wf3.B(j);
            int i20 = 0;
            boolean z4 = false;
            while (i20 < arrayList4.size()) {
                r47 r47Var4 = (r47) arrayList4.get(i20);
                ArrayList arrayList5 = arrayList4;
                if (r47.n1(r47Var4.k) == null || r47Var4.l5()) {
                    i4 = i20;
                } else {
                    int h0 = ls6.h0(r47Var4.k);
                    i4 = i20;
                    if (h0 == -1) {
                        return;
                    }
                    tia tiaVar9 = tiaVarArr[h0];
                    if (tiaVar9.l) {
                        z = z4;
                        if (tiaVar9.a(r47Var4, r47.B0(r47Var4.k) == j ? 0 : 1, true, B2)) {
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
                while (i21 < zhaVarArr.length) {
                    int i22 = zhaVarArr[i21].F;
                    c79 c79Var5 = i22 == 0 ? lhaVar2 : i22 == z6 ? c79Var4 : i22 == 2 ? c79Var3 : i22 == 3 ? siaVar : i22 == 4 ? c79Var2 : i22 == 5 ? c79Var : i22 == 15 ? niaVar : null;
                    if (c79Var5 != null) {
                        c79Var5.b();
                        lhaVar2.f();
                        c79Var4.f();
                        c79Var3.f();
                        siaVar.X(false);
                        c79Var2.f();
                        niaVar.f();
                        c79Var.f();
                    }
                    i21++;
                    z6 = true;
                }
                N1(z6);
                return;
            }
            return;
        }
        if (i == jn7.J) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            if (l.longValue() == j || l.longValue() == this.f1) {
                int i23 = l.longValue() == j ? 0 : 1;
                for (tia tiaVar10 : tiaVarArr) {
                    tiaVar10.f(i23, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        int i24 = jn7.h2;
        int i25 = jn7.f2;
        int i26 = jn7.g2;
        if (i == i24 || i == i26 || i == i25) {
            if (i != i25 && i != i26) {
                if (((r47) objArr[0]).T == 0) {
                    for (int i27 = 0; i27 < zhaVarArr.length; i27++) {
                        int childCount = zhaVarArr[i27].h.getChildCount();
                        for (int i28 = 0; i28 < childCount; i28++) {
                            View childAt = zhaVarArr[i27].h.getChildAt(i28);
                            if (childAt instanceof vea) {
                                vea veaVar = (vea) childAt;
                                if (veaVar.getMessage() != null) {
                                    veaVar.g(false, true);
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            for (int i29 = 0; i29 < zhaVarArr.length; i29++) {
                zha zhaVar3 = zhaVarArr[i29];
                if (zhaVar3 != null && (jgaVar = zhaVar3.h) != null) {
                    int childCount2 = jgaVar.getChildCount();
                    for (int i30 = 0; i30 < childCount2; i30++) {
                        View childAt2 = zhaVarArr[i29].h.getChildAt(i30);
                        if (childAt2 instanceof vea) {
                            vea veaVar2 = (vea) childAt2;
                            if (veaVar2.getMessage() != null) {
                                veaVar2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i == jn7.A5) {
            u5b u5bVar = (u5b) objArr[0];
            oha ohaVar = this.f0;
            if (ohaVar == null || u5bVar != ohaVar.s) {
                aga agaVar = this.h0;
                if (agaVar == null || u5bVar != agaVar.s) {
                    Iterator it = this.m2.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        dja djaVar = (dja) it.next();
                        if (djaVar.c.s == u5bVar) {
                            i3 = djaVar.a;
                            break;
                        }
                    }
                } else {
                    i3 = 9;
                }
            } else {
                i3 = 8;
            }
            zha P = P(i3);
            if (P != null) {
                if (P.b != (u5bVar.g() > 0)) {
                    P.b = u5bVar.g() > 0;
                    D1(P, true);
                }
            }
            if (P != null) {
                hl.p2(P.h);
                if (P.h.getLayoutManager() instanceof x46) {
                    d79 d79Var = P.h;
                    z(P, d79Var, (x46) d79Var.getLayoutManager());
                }
            }
            tha thaVar = this.G1;
            if (thaVar != null) {
                thaVar.V();
                return;
            }
            return;
        }
        if (i == jn7.y5) {
            for (zha zhaVar4 : zhaVarArr) {
                if (zhaVar4 != null && zhaVar4.h != null && j0(zhaVar4.F)) {
                    if (!l0() || zhaVar4.h.getAdapter() == null) {
                        for (int i31 = 0; i31 < zhaVar4.h.getChildCount(); i31++) {
                            View childAt3 = zhaVar4.h.getChildAt(i31);
                            if (childAt3 instanceof jja) {
                                jja jjaVar = (jja) childAt3;
                                hn hnVar = jjaVar.O;
                                if (!jjaVar.e0 || (r47Var = jjaVar.n) == null || (storyItem = r47Var.l) == null || (storyViews = storyItem.views) == null) {
                                    jjaVar.M = false;
                                    hnVar.t("", false, true);
                                } else {
                                    int i32 = storyViews.views_count;
                                    jjaVar.M = i32 > 0;
                                    hnVar.t(hl.o0(i32, 0), true, true);
                                }
                            }
                        }
                    } else {
                        hl.p2(zhaVar4.h);
                    }
                }
            }
            return;
        }
        if (i == jn7.h3) {
            if (((Long) objArr[0]).longValue() == j) {
                this.T.E(true);
                N1(true);
                y();
                return;
            }
            return;
        }
        int i33 = jn7.i3;
        pia piaVar = this.U;
        if (i == i33) {
            if (j == 0 || j == eVar.getUserConfig().e()) {
                piaVar.F(true);
                N1(true);
                y();
                S0();
                return;
            }
            return;
        }
        if (i == jn7.r) {
            piaVar.F(true);
            return;
        }
        if (i == jn7.I3) {
            if (((Long) objArr[0]).longValue() == j) {
                N1(true);
                return;
            }
            return;
        }
        if (i == jn7.Z3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j == (-longValue3)) {
                String str = (String) objArr[2];
                rha rhaVar = this.d0;
                if (rhaVar != null) {
                    TLRPC.ChatFull chatFull = rhaVar.d;
                    if (chatFull != null && chatFull.participants != null) {
                        for (int i34 = 0; i34 < rhaVar.d.participants.participants.size(); i34++) {
                            rhaVar.d.participants.participants.get(i34).setRank(longValue4, str);
                        }
                    }
                    for (zha zhaVar5 : zhaVarArr) {
                        if (zhaVar5.F == 7) {
                            hl.V3(zhaVar5.h);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.f1) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i35 = 0; i35 < zhaVarArr.length; i35++) {
                if (zhaVarArr[i35].h.getAdapter() == niaVar) {
                    jga jgaVar6 = zhaVarArr[i35].h;
                    ArrayList arrayList6 = niaVar.n;
                    for (int i36 = 0; i36 < arrayList6.size(); i36++) {
                        r47 r47Var5 = (r47) arrayList6.get(i36);
                        if (r47Var5 != null && r47Var5.D1() == longValue5) {
                            TLRPC.MessageMedia messageMedia = r47Var5.k.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                r47.c6(tL_messageMediaPoll, pollResults);
                                niaVar.g(i36);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        bha bhaVar = this.L0;
        if (bhaVar != null) {
            canvas.save();
            canvas.translate(bhaVar.getX(), bhaVar.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        xga xgaVar = this.U0;
        if (xgaVar != null) {
            int i = xgaVar.U;
            if ((i == 3 || i == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(xgaVar.getX(), xgaVar.getY());
                xgaVar.setDrawOverlay(true);
                xgaVar.draw(canvas);
                xgaVar.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (this.c2 && (view instanceof zha) && this.g2 < this.e2) {
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
        zha[] zhaVarArr = this.n0;
        float top = zhaVarArr[0].getTop();
        fga fgaVar = this.c0;
        if (fgaVar != null && ((i = zhaVarArr[0].F) == 8 || t0(i))) {
            top -= fgaVar.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + hl.L(12.0f));
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    public final void e(View view) {
        zha[] zhaVarArr = this.n0;
        addView(view, Math.max(indexOfChild(zhaVarArr[0]), indexOfChild(zhaVarArr[1])) + 1, tre.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean e0() {
        SparseArray[] sparseArrayArr;
        r47 r47Var;
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
                if (num.intValue() > 0 && (r47Var = (r47) sparseArrayArr[i].get(num.intValue())) != null && (message = r47Var.k) != null && message.noforwards) {
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
            zha[] zhaVarArr = this.n0;
            if (i2 >= zhaVarArr.length) {
                return;
            }
            jga jgaVar = zhaVarArr[i2].h;
            if (jgaVar != null) {
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < jgaVar.getChildCount(); i5++) {
                    View childAt = jgaVar.getChildAt(i5);
                    if (childAt instanceof jja) {
                        jja jjaVar = (jja) childAt;
                        int messageId = jjaVar.getMessageId();
                        i4 = jjaVar.getTop();
                        i3 = messageId;
                    }
                    if (childAt instanceof zea) {
                        zea zeaVar = (zea) childAt;
                        int e1 = zeaVar.getMessage().e1();
                        i4 = zeaVar.getTop();
                        i3 = e1;
                    }
                    if (childAt instanceof vea) {
                        vea veaVar = (vea) childAt;
                        i3 = veaVar.getMessage().e1();
                        i4 = veaVar.getTop();
                    }
                    if (i3 != 0) {
                        break;
                    }
                }
                if (i3 != 0) {
                    int i6 = zhaVarArr[i2].F;
                    int i7 = -1;
                    if (j0(i6)) {
                        bja v1 = v1(i6);
                        if (v1 != null && v1.s != null) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= v1.s.i.size()) {
                                    break;
                                }
                                if (i3 == ((r47) v1.s.i.get(i8)).e1()) {
                                    i7 = i8;
                                    break;
                                }
                                i8++;
                            }
                        }
                        i = i7;
                    } else if (i6 >= 0) {
                        tia[] tiaVarArr = this.w1;
                        if (i6 < tiaVarArr.length) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= tiaVarArr[i6].a.size()) {
                                    break;
                                }
                                if (i3 == ((r47) tiaVarArr[i6].a.get(i9)).e1()) {
                                    i7 = i9;
                                    break;
                                }
                                i9++;
                            }
                            i = tiaVarArr[i6].m + i7;
                        }
                    }
                    if (i7 >= 0) {
                        ((x46) jgaVar.getLayoutManager()).g1(i, (-zhaVarArr[i2].h.getPaddingTop()) + i4);
                        if (this.r1) {
                            zha zhaVar = zhaVarArr[i2];
                            zhaVar.r.g1(i, (-zhaVar.h.getPaddingTop()) + i4);
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
                spannableStringBuilder.append((CharSequence) ob6.M0(2131746429, null));
            } else {
                spannableStringBuilder.append((CharSequence) "c");
                this.a2.setSpan(new wm2(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) ob6.M0(2131744466, null));
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
        bha bhaVar;
        if (this.P1 || (bhaVar = this.L0) == null) {
            return;
        }
        bhaVar.g(null, i, bhaVar.Q.get(i));
    }

    public final void g(dia diaVar, e eVar, long j, int i) {
        String p = j > 0 ? lbc.p(uc7.s1(eVar.getCurrentAccount()).X1(Long.valueOf(j))) : xc2.K(uc7.s1(eVar.getCurrentAccount()).M0(Long.valueOf(-j)), false);
        if (p == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        qu6.u(sb, uc7.s1(eVar.getCurrentAccount()).N2, "/", p, "/a/");
        sb.append(i);
        diaVar.Z(R.drawable.media_share, new jr9((Object) this, (Object) sb.toString(), (Object) eVar, (byte) 13), ob6.M0(2131744445, null), false, true);
    }

    public final void g0() {
        hl.r(this.P0);
        dl1 dl1Var = this.N0;
        if (dl1Var.getTag() == null) {
            return;
        }
        dl1Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(dl1Var, (Property<dl1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(dl1Var, (Property<dl1, Float>) View.TRANSLATION_Y, (-hl.L(48.0f)) + this.R0));
        this.O0.setInterpolator(k43.g);
        this.O0.addListener(new eha(this, (byte) 0));
        this.O0.start();
    }

    public final void g1(float f, int i) {
        bha bhaVar = this.L0;
        if (bhaVar != null) {
            bhaVar.i(f, t0(i) ? 8 : i);
        }
        fga fgaVar = this.c0;
        if (fgaVar != null) {
            uic uicVar = fgaVar.b;
            if (t0(i)) {
                uicVar.g(f, s1(i));
            } else if (i == 8) {
                uicVar.g(f, 0);
            }
        }
    }

    public SparseArray<r47> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        zha zhaVar;
        zha zhaVar2;
        u5b u5bVar;
        u5b u5bVar2;
        float f = 1.0f;
        zha[] zhaVarArr = this.n0;
        if (zhaVarArr != null && (zhaVar = zhaVarArr[0]) != null && (zhaVar2 = zhaVarArr[1]) != null && zhaVar.w != null && zhaVar2.w != null) {
            int i = zhaVar.F;
            int i2 = zhaVar2.F;
            boolean z = t0(i) || i == 8;
            boolean z2 = t0(i2) || i2 == 8;
            if (z || z2) {
                float visibilityFactor = 1.0f - zhaVarArr[0].w.getVisibilityFactor();
                float visibilityFactor2 = 1.0f - zhaVarArr[1].w.getVisibilityFactor();
                bja v1 = v1(zhaVarArr[0].F);
                if (i == 8 || (v1 != null && (u5bVar2 = v1.s) != null && u5bVar2.g() > 0)) {
                    visibilityFactor = 1.0f;
                }
                bja v12 = v1(i2);
                if (i2 != 8 && (v12 == null || (u5bVar = v12.s) == null || u5bVar.g() <= 0)) {
                    f = visibilityFactor2;
                }
                if (!z) {
                    visibilityFactor = f;
                }
                if (!z2) {
                    f = visibilityFactor;
                }
                return hl.R1(visibilityFactor, f, Math.abs(zhaVarArr[0].getTranslationX() / zhaVarArr[0].getMeasuredWidth()));
            }
        }
        return 1.0f;
    }

    public int getClosestTab() {
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[1];
        if (zhaVar != null && zhaVar.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return zhaVarArr[1].F;
            }
            if (Math.abs(zhaVarArr[1].getTranslationX()) < zhaVarArr[1].getMeasuredWidth() / 2.0f) {
                return zhaVarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public d79 getCurrentListView() {
        mha mhaVar;
        zha zhaVar = this.n0[0];
        int i = zhaVar.F;
        return i == 13 ? this.a0.getCurrentListView() : i == 14 ? this.b0.getCurrentListView() : (i != 12 || (mhaVar = this.W) == null) ? zhaVar.h : mhaVar.a.A0;
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

    public s7 getSearchItem() {
        return this.q0;
    }

    public e29 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        fga fgaVar = this.c0;
        if (fgaVar != null && currentTabId == 8) {
            int currentAlbumId = fgaVar.getCurrentAlbumId();
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
            zha[] zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                return f;
            }
            zha zhaVar = zhaVarArr[i];
            if (zhaVar != null) {
                f = ((1.0f - Math.abs(zhaVar.getTranslationX() / getWidth())) * zhaVar.F) + f;
            }
            i++;
        }
    }

    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.z6));
        int i = aob.z8;
        arrayList.add(new apb(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        s7 s7Var = this.x0;
        if (s7Var != null) {
            arrayList.add(new apb(s7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        s7 s7Var2 = this.w0;
        if (s7Var2 != null) {
            arrayList.add(new apb(s7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        Drawable[] drawableArr = {this.G0};
        int i2 = aob.y8;
        ImageView imageView = this.F0;
        arrayList.add(new apb(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (zob) null, i2));
        arrayList.add(new apb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (zob) null, aob.xi));
        bha bhaVar = this.L0;
        arrayList.add(new apb(bhaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.wi));
        arrayList.add(new apb(bhaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.vi));
        arrayList.add(new apb(bhaVar.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.yi));
        xga xgaVar = this.U0;
        if (xgaVar != null) {
            arrayList.add(new apb(xgaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.v7));
            arrayList.add(new apb(xgaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (zob) null, aob.u7));
            arrayList.add(new apb(xgaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.y7));
            arrayList.add(new apb(xgaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (zob) null, aob.A7));
        }
        final int i3 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i3 >= zhaVarArr.length) {
                return arrayList;
            }
            zob zobVar = new zob() { // from class: rfa
                @Override // zob
                public final void b() {
                    zha[] zhaVarArr2 = eja.this.n0;
                    int i4 = i3;
                    jga jgaVar = zhaVarArr2[i4].h;
                    if (jgaVar != null) {
                        int childCount = jgaVar.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = zhaVarArr2[i4].h.getChildAt(i5);
                            if (childAt instanceof kja) {
                                kja kjaVar = (kja) childAt;
                                for (int i6 = 0; i6 < 6; i6++) {
                                    kjaVar.a[i6].e.invalidate();
                                }
                            } else if (childAt instanceof bv8) {
                                ((bv8) childAt).D(0);
                            } else if (childAt instanceof vac) {
                                ((vac) childAt).i(0);
                            }
                        }
                    }
                }

                @Override // zob
                public final void a(float f) {
                }
            };
            arrayList.add(new apb(zhaVarArr[i3].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i6));
            arrayList.add(new apb(zhaVarArr[i3].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
            int i4 = aob.h6;
            arrayList.add(new apb(zhaVarArr[i3].h, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, i4));
            arrayList.add(new apb(zhaVarArr[i3].h, 0, new Class[]{vac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, zobVar, aob.n6));
            arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.O7));
            arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.P7));
            arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.Q7));
            arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.R7));
            arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.S7));
            arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.T7));
            arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.U7));
            int i5 = aob.i7;
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_13, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i5));
            int i6 = aob.k7;
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_14, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i6));
            arrayList.add(new apb(zhaVarArr[i3].h, 8, new Class[]{zea.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (zob) null, aob.qj));
            arrayList.add(new apb(zhaVarArr[i3].h, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, i4));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_13, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i5));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_14, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i6));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_13, new Class[]{cfa.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i5));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_14, new Class[]{cfa.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i6));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_13, new Class[]{kja.class}, (Paint) null, (Drawable[]) null, zobVar, i5));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_14, new Class[]{kja.class}, (Paint) null, (Drawable[]) null, zobVar, i6));
            arrayList.add(new apb(zhaVarArr[i3].h, 0, new Class[]{vw2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (zob) null, aob.Ci));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_13, new Class[]{vw2.class}, (Paint) null, (Drawable[]) null, zobVar, i5));
            arrayList.add(new apb(zhaVarArr[i3].h, TLObject.FLAG_14, new Class[]{vw2.class}, (Paint) null, (Drawable[]) null, zobVar, i6));
            arrayList.add(new apb(zhaVarArr[i3].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (zob) null, aob.b7));
            arrayList.add(new apb(zhaVarArr[i3].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
            arrayList.add(new apb(zhaVarArr[i3].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.y6));
            i3++;
        }
    }

    public int getTopPanelShift() {
        return this.p2;
    }

    public final void h(dia diaVar) {
        final View[] viewArr = new View[2];
        final byte b = 0;
        viewArr[0] = diaVar.Z(R.drawable.msg_zoomin, new Runnable(this) { // from class: pfa
            public final /* synthetic */ eja b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                View[] viewArr2 = viewArr;
                eja ejaVar = this.b;
                switch (b2) {
                    case 0:
                        ejaVar.O1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        ejaVar.P1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, ob6.M0(2131748404, null), false, false);
        final byte b2 = 1;
        viewArr[1] = diaVar.Z(R.drawable.msg_zoomout, new Runnable(this) { // from class: pfa
            public final /* synthetic */ eja b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                View[] viewArr2 = viewArr;
                eja ejaVar = this.b;
                switch (b22) {
                    case 0:
                        ejaVar.O1(viewArr2[0], viewArr2[1]);
                        break;
                    default:
                        ejaVar.P1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, ob6.M0(2131748403, null), false, false);
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
            zha[] zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                if (this.G == 0) {
                    rha rhaVar = this.d0;
                    rhaVar.d = chatFull;
                    rhaVar.e = arrayList;
                }
                N1(true);
                for (int i2 = 0; i2 < zhaVarArr.length; i2++) {
                    zha zhaVar = zhaVarArr[i2];
                    if (zhaVar.F == 7 && zhaVar.h.getAdapter() != null) {
                        hl.p2(zhaVarArr[i2].h);
                    }
                }
                return;
            }
            zha zhaVar2 = zhaVarArr[i];
            if (zhaVar2.F == 7 && zhaVar2.h.getAdapter() != null && zhaVarArr[i].h.getAdapter().b() != 0 && this.y1.getMessagesController().O1().j.size() > 0) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i(jga jgaVar, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = jgaVar.getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = jgaVar.getChildAt(i2);
            if (childAt instanceof tk4) {
                view = childAt;
            }
        }
        if (view != null) {
            jgaVar.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new gha(this, jgaVar, sparseBooleanArray, (tk4) view, i));
    }

    public boolean i0() {
        return !(this instanceof re5);
    }

    public final void i1(int i, int i2, int i3, int i4) {
        byte b = 1;
        this.c2 = true;
        this.d2 = i;
        this.e2 = i2;
        this.f2 = i3;
        this.b2 = i4;
        n();
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            if (cgaVar.M != i2 || cgaVar.N != i3) {
                cgaVar.M = i2;
                cgaVar.N = i3;
                cgaVar.setClipChildren(i2 == 0 && i3 == 0);
                cgaVar.h.setClipChildren(i2 == 0 && i3 == 0);
                cgaVar.n();
            }
            F1();
        }
        for (zha zhaVar : this.n0) {
            if (zhaVar != null) {
                zhaVar.setClipChildren(false);
                H1(zhaVar);
                setPageOverscan(zhaVar.h);
                setPageOverscan(zhaVar.n);
                int paddingTop = zhaVar.h.getPaddingTop();
                jga jgaVar = zhaVar.h;
                int paddingLeft = jgaVar.getPaddingLeft();
                jga jgaVar2 = zhaVar.h;
                int T = T(zhaVar.F);
                jgaVar2.h3 = T;
                int paddingRight = zhaVar.h.getPaddingRight();
                jga jgaVar3 = zhaVar.h;
                int S = S(s0());
                jgaVar3.i3 = S;
                jgaVar.setPadding(paddingLeft, T, paddingRight, S);
                int paddingTop2 = paddingTop - zhaVar.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    hl.J(zhaVar.h, new jfa(zhaVar, paddingTop2, b));
                }
                zhaVar.w.setPadding(0, i, 0, i4);
                mha mhaVar = this.W;
                if (mhaVar != null && mhaVar.getParent() == zhaVar) {
                    k1(hl.L(56.0f) + i, mhaVar);
                }
                bga bgaVar = this.a0;
                if (bgaVar != null && bgaVar.getParent() == zhaVar) {
                    k1(i, bgaVar);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void j(boolean z) {
        e29 e29Var = this.v0;
        if (e29Var == null || this.Z1 == z) {
            return;
        }
        this.Z1 = z;
        if (z || e29Var.getAnimatedDrawable().b0 >= 20) {
            e29Var.getAnimatedDrawable().K(this.Z1 ? 50 : 100);
        } else {
            e29Var.getAnimatedDrawable().K(0);
        }
        e29Var.getAnimatedDrawable().start();
    }

    public final void j1(int i, boolean z) {
        this.D0.a(i, z);
        jla jlaVar = this.I;
        if (jlaVar != null) {
            jlaVar.H(i, z);
        }
    }

    @Override // kf3
    public final void k(of3 of3Var) {
        e eVar = this.y1;
        if (eVar == null || !eVar.getMessagesController().O1().J(of3Var.getDialogId())) {
            return;
        }
        eVar.getOrCreateStoryViewer().getClass();
        lcb orCreateStoryViewer = eVar.getOrCreateStoryViewer();
        Context context = eVar.getContext();
        long dialogId = of3Var.getDialogId();
        l6b a = l6b.a((d79) of3Var.getParent());
        a.s += ((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).s1) ? hl.L(68.0f) : 0;
        orCreateStoryViewer.H(context, dialogId, a);
    }

    public boolean k0() {
        return false;
    }

    public final void l(int i) {
        int i2;
        zha P = P(this.s1);
        this.s = -1;
        if (P != null) {
            P.h.E0();
            this.t1 = i;
            P.n.setVisibility(0);
            boolean j0 = j0(this.s1);
            yha yhaVar = P.n;
            if (j0) {
                yhaVar.setAdapter(w1(this.s1));
            } else {
                yhaVar.setAdapter(this.L);
            }
            yha yhaVar2 = P.n;
            int paddingLeft = yhaVar2.getPaddingLeft();
            yha yhaVar3 = P.n;
            int T = T(P.F);
            yhaVar3.h3 = T;
            int paddingRight = P.n.getPaddingRight();
            yha yhaVar4 = P.n;
            int S = S(s0());
            yhaVar4.i3 = S;
            yhaVar2.setPadding(paddingLeft, T, paddingRight, S);
            P.r.x1(i);
            P.n.c0();
            int i3 = 0;
            while (true) {
                zha[] zhaVarArr = this.n0;
                if (i3 >= zhaVarArr.length) {
                    break;
                }
                zha zhaVar = zhaVarArr[i3];
                if (zhaVar != null && ((i2 = zhaVar.F) == 0 || j0(i2))) {
                    hl.V3(zhaVarArr[i3].h);
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
            ofFloat.addUpdateListener(new aha(this, P, b));
            ofFloat.addListener(new mw0(this, j0(P.F) ? 1 : 0, i, (byte) 3));
            ofFloat.setInterpolator(k43.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean l0() {
        TLRPC.User X1;
        long j = this.m1;
        return j > 0 && (X1 = uc7.s1(this.y1.getCurrentAccount()).X1(Long.valueOf(j))) != null && X1.bot;
    }

    public void l1(boolean z) {
        if (this.F1 != z) {
            this.F1 = z;
            jla jlaVar = this.I;
            if (jlaVar != null) {
                if (z) {
                    M1();
                    jlaVar.L();
                } else {
                    jlaVar.y();
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
            this.R1.addListener(new i1a((byte) 2, this, z));
            this.R1.start();
            if (z) {
                M1();
            }
        }
    }

    @Override // kf3
    public final boolean m() {
        return false;
    }

    public final boolean m0() {
        e eVar;
        if (this.g1 == null || (eVar = this.y1) == null) {
            return false;
        }
        return xc2.V(eVar.getMessagesController().M0(Long.valueOf(this.g1.id)));
    }

    public final void n() {
        int i = this.d2;
        int i2 = this.p2;
        k1((hl.L(6.666f) + i) - w2, this.S0);
        int i3 = i + i2;
        k1(i3, this.L0);
        k1(i3, this.E0);
        k1(hl.L(52.0f) + i + i2, this.N0);
        k1(hl.L(4.0f) + i + i2, this.M0);
        k1(hl.L(48.0f) + i + i2, this.c0);
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
            zha[] zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                return false;
            }
            zha zhaVar = zhaVarArr[i];
            if (zhaVar != null) {
                jga jgaVar = zhaVar.h;
                if (jgaVar != null && jgaVar.e0()) {
                    return true;
                }
                yha yhaVar = zhaVarArr[i].n;
                if (yhaVar != null && yhaVar.e0()) {
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
        zha P;
        eia eiaVar;
        if (z && getY() != 0.0f && this.F) {
            return;
        }
        if (z && j0(i) && W(i) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.m1);
        bundle.putLong("topic_id", this.G);
        tia[] tiaVarArr = this.w1;
        if (z && (P = P(0)) != null) {
            ArrayList arrayList = tiaVarArr[0].e;
            int K0 = P.x.K0();
            if (K0 >= 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        eiaVar = null;
                        break;
                    } else {
                        if (K0 <= ((eia) arrayList.get(i3)).b) {
                            eiaVar = (eia) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                }
                if (eiaVar == null) {
                    eiaVar = (eia) c00.g(1, arrayList);
                }
                if (eiaVar != null) {
                    i2 = eiaVar.c;
                    byte b = 9;
                    if (i != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    j81 j81Var = new j81(tiaVarArr[0].q, i2, bundle);
                    j81Var.N = new k09(this, b);
                    this.y1.presentFragment(j81Var);
                }
            }
        }
        i2 = 0;
        byte b2 = 9;
        if (i != 9) {
        }
        j81 j81Var2 = new j81(tiaVarArr[0].q, i2, bundle);
        j81Var2.N = new k09(this, b2);
        this.y1.presentFragment(j81Var2);
    }

    public final boolean o0() {
        cga cgaVar = this.b0;
        if (cgaVar != null && cgaVar.g()) {
            return true;
        }
        fga fgaVar = this.c0;
        return fgaVar != null && fgaVar.f;
    }

    public final void o1(int i) {
        int s1 = s1(getClosestTab());
        fga fgaVar = this.c0;
        if (s1 != i) {
            if (fgaVar != null) {
                fgaVar.b.e(i, fgaVar.d.i(i));
                return;
            }
            return;
        }
        fgaVar.setReorderingAlbums(true);
        dja t1 = t1(i);
        zha P = P(t1.a);
        if (P == null) {
            return;
        }
        jga jgaVar = P.h;
        for (int i2 = 0; i2 < jgaVar.getChildCount(); i2++) {
            View childAt = jgaVar.getChildAt(i2);
            if (childAt instanceof jja) {
                ((jja) childAt).l(true, true);
            }
        }
        cja cjaVar = t1.c;
        if (cjaVar != null && !cjaVar.y) {
            cjaVar.y = true;
        }
        G1(true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        byte b = 0;
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                return;
            }
            jga jgaVar = zhaVarArr[i].h;
            if (jgaVar != null) {
                jgaVar.getViewTreeObserver().addOnPreDrawListener(new hha(this, i, b));
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
        eja ejaVar;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        tha thaVar = this.G1;
        int height = thaVar.d() != null ? thaVar.d().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt == null || childAt.getVisibility() == 8) {
                ejaVar = this;
                i3 = i;
            } else if (childAt instanceof zha) {
                ejaVar = this;
                i3 = i;
                ejaVar.measureChildWithMargins(childAt, i3, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                jga jgaVar = ((zha) childAt).h;
                jgaVar.setPadding(0, jgaVar.f3, 0, jgaVar.g3);
            } else {
                ejaVar = this;
                i3 = i;
                i4 = i2;
                ejaVar.measureChildWithMargins(childAt, i3, 0, i4, 0);
                i5++;
                this = ejaVar;
                i = i3;
                i2 = i4;
            }
            i4 = i2;
            i5++;
            this = ejaVar;
            i = i3;
            i2 = i4;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.P1) {
            e eVar = this.y1;
            if (eVar.getParentLayout() != null && !((ActionBarLayout) eVar.getParentLayout()).h() && !D() && !this.a) {
                if (motionEvent != null) {
                    VelocityTracker velocityTracker = this.E1;
                    if (velocityTracker == null) {
                        velocityTracker = VelocityTracker.obtain();
                        this.E1 = velocityTracker;
                    }
                    velocityTracker.addMovement(motionEvent);
                    kg5 kg5Var = this.H1;
                    if (kg5Var != null) {
                        kg5Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= hl.L(90.0f) + this.d2) {
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
                    zha[] zhaVarArr = this.n0;
                    if (z && (!this.k1 ? x < 0 : x > 0)) {
                        if (!b1(motionEvent, x < 0)) {
                            this.B1 = true;
                            this.A1 = false;
                            zhaVarArr[0].setTranslationX(0.0f);
                            zhaVarArr[1].setTranslationX(this.k1 ? zhaVarArr[0].getMeasuredWidth() : -zhaVarArr[0].getMeasuredWidth());
                            g1(0.0f, zhaVarArr[1].F);
                            T0(getTabProgress());
                        }
                    }
                    if (this.B1 && !this.A1) {
                        if (Math.abs(x) >= hl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                            b1(motionEvent, x < 0);
                        }
                    } else if (this.A1) {
                        zhaVarArr[0].setTranslationX(x);
                        if (this.k1) {
                            zhaVarArr[1].setTranslationX(zhaVarArr[0].getMeasuredWidth() + x);
                        } else {
                            zhaVarArr[1].setTranslationX(x - zhaVarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x) / zhaVarArr[0].getMeasuredWidth();
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
                        g1(abs2, zhaVarArr[1].F);
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
        e eVar = this.y1;
        if (l0) {
            TLRPC.User X1 = uc7.s1(eVar.getCurrentAccount()).X1(Long.valueOf(j));
            return X1 != null && X1.bot && X1.bot_can_edit;
        }
        if (s0()) {
            return true;
        }
        return eVar != null && eVar.getMessagesController().O1().g(j);
    }

    public final boolean p0(int i) {
        return i == 7 ? this.G1.X() : (q0() || i == 0 || j0(i) || i == 2 || i == 5 || i == 6 || i == 11 || i == 10 || i == 13 || i == 14 || i == 15) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p1(boolean z) {
        zha[] zhaVarArr;
        zha zhaVar;
        if (this.r1) {
            return;
        }
        Object[] objArr = 0;
        int i = 0;
        while (true) {
            zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                zhaVar = null;
                break;
            }
            int i2 = zhaVarArr[i].F;
            if (i2 == 0 || j0(i2)) {
                break;
            } else {
                i++;
            }
        }
        zhaVar = zhaVarArr[i];
        if (zhaVar != null) {
            int i3 = zhaVar.F;
            this.s1 = i3;
            boolean j0 = j0(i3);
            int[] iArr = this.p1;
            int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], z);
            this.t1 = R;
            if (R != iArr[j0 ? 1 : 0]) {
                if (this.n1 && j0(this.s1)) {
                    return;
                }
                zhaVar.n.setVisibility(0);
                boolean j02 = j0(this.s1);
                yha yhaVar = zhaVar.n;
                if (j02) {
                    yhaVar.setAdapter(w1(this.s1));
                } else {
                    yhaVar.setAdapter(this.L);
                }
                yha yhaVar2 = zhaVar.n;
                yhaVar2.setPadding(yhaVar2.getPaddingLeft(), T(this.s1), zhaVar.n.getPaddingRight(), S(s0()));
                zhaVar.r.x1(R);
                zhaVar.n.c0();
                zhaVar.r.O = new zga(this, zhaVar, objArr == true ? 1 : 0);
                hl.V3(zhaVar.h);
                this.r1 = true;
                if (this.s1 == 0) {
                    this.w1[0].g(true);
                }
                this.q1 = 0.0f;
                if (this.s < 0) {
                    e1();
                    return;
                }
                for (zha zhaVar2 : zhaVarArr) {
                    if (zhaVar2.F == this.s1) {
                        zhaVar2.r.g1(this.s, this.w - zhaVar2.n.getPaddingTop());
                    }
                }
            }
        }
    }

    public boolean q() {
        return !(this instanceof re5);
    }

    public boolean q0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void q1() {
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                return;
            }
            int childCount = zhaVarArr[i].h.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = zhaVarArr[i].h.getChildAt(i2);
                if (childAt instanceof vw2) {
                    ImageReceiver photoImage = ((vw2) childAt).getPhotoImage();
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
                zha[] zhaVarArr = this.n0;
                float x = zhaVarArr[0].getX();
                this.i1 = new AnimatorSet();
                this.l1 = Math.abs(x) < ((float) zhaVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b49(this, (byte) 28));
                boolean z = this.l1;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x);
                    boolean z2 = this.k1;
                    AnimatorSet animatorSet = this.i1;
                    if (z2) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(zhaVarArr[0], (Property<zha, Float>) property, 0.0f), ObjectAnimator.ofFloat(zhaVarArr[1], (Property<zha, Float>) property, r14.getMeasuredWidth()), ofFloat);
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(zhaVarArr[0], (Property<zha, Float>) property, 0.0f), ObjectAnimator.ofFloat(zhaVarArr[1], (Property<zha, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = zhaVarArr[0].getMeasuredWidth() - Math.abs(x);
                    boolean z3 = this.k1;
                    AnimatorSet animatorSet2 = this.i1;
                    if (z3) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(zhaVarArr[0], (Property<zha, Float>) property, -r8.getMeasuredWidth()), ObjectAnimator.ofFloat(zhaVarArr[1], (Property<zha, Float>) property, 0.0f), ofFloat);
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(zhaVarArr[0], (Property<zha, Float>) property, r8.getMeasuredWidth()), ObjectAnimator.ofFloat(zhaVarArr[1], (Property<zha, Float>) property, 0.0f), ofFloat);
                    }
                }
                this.i1.setInterpolator(u2);
                int measuredWidth2 = getMeasuredWidth();
                float f3 = measuredWidth2 / 2;
                float I = (hl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f3) + f3;
                this.i1.setDuration(Math.max(jn7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r0) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                this.i1.addListener(new eha(this, b));
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
        zha zhaVar;
        zha[] zhaVarArr = this.n0;
        if (zhaVarArr != null && (zhaVar = zhaVarArr[0]) != null) {
            boolean j0 = j0(zhaVar.F);
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
        dja u1 = u1(i);
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
                    tia[] tiaVarArr = this.w1;
                    if (i >= tiaVarArr.length) {
                        break;
                    }
                    if (tiaVarArr[i].b[1].size() == 0) {
                        tia tiaVar = tiaVarArr[i];
                        tiaVar.j[1] = this.g1.migrated_from_max_id;
                        tiaVar.i[1] = false;
                    }
                    i++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 == null || z == chatFull3.stories_pinned_available) {
            return;
        }
        bha bhaVar = this.L0;
        if (bhaVar != null) {
            bhaVar.setInitialTabId(k0() ? 9 : 8);
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

    public void setForwardRestrictedHint(kg5 kg5Var) {
        this.H1 = kg5Var;
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
            zha[] zhaVarArr = this.n0;
            if (i5 >= zhaVarArr.length) {
                break;
            }
            zhaVarArr[i5].setTranslationY(this.O1);
            i5++;
        }
        xj3 xj3Var = this.S0;
        if (xj3Var == null) {
            xga xgaVar = this.U0;
            if (xgaVar != null) {
                xgaVar.setTranslationY(hl.L(48.0f) + i2);
            }
        } else if (xj3Var != null) {
            xj3Var.setTranslationY(this.O1);
        }
        this.R0 = i2;
        dl1 dl1Var = this.N0;
        dl1Var.setTranslationY((dl1Var.getTag() == null ? -hl.L(48.0f) : 0) + this.R0);
    }

    public void setPagesGlassEngine(vy4 vy4Var) {
        this.h2 = vy4Var;
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            cgaVar.setGlassEngine(vy4Var);
        }
        for (zha zhaVar : this.n0) {
            if (zhaVar != null) {
                zhaVar.h.setCaptureSectionsDecoratorAllowed(true);
                vy4Var.b(zhaVar.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i) {
        if (this.b2 != i) {
            this.b2 = i;
            zha[] zhaVarArr = this.n0;
            if (zhaVarArr != null) {
                for (zha zhaVar : zhaVarArr) {
                    if (zhaVar != null) {
                        jga jgaVar = zhaVar.h;
                        int paddingLeft = jgaVar.getPaddingLeft();
                        jga jgaVar2 = zhaVar.h;
                        int i2 = jgaVar2.f3;
                        int paddingRight = jgaVar2.getPaddingRight();
                        jga jgaVar3 = zhaVar.h;
                        int S = S(s0());
                        jgaVar3.i3 = S;
                        jgaVar.setPadding(paddingLeft, i2, paddingRight, S);
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
            zha[] zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                return;
            }
            D1(zhaVarArr[i], true);
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
            zha[] zhaVarArr = this.n0;
            if (i2 >= zhaVarArr.length) {
                break;
            }
            float f = (-(getMeasuredHeight() - Math.max(i, hl.L(zhaVarArr[i2].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            zhaVarArr[i2].w.setTranslationY(f);
            zhaVarArr[i2].s.setTranslationY(-f);
            i2++;
        }
        bga bgaVar = this.a0;
        if (bgaVar != null) {
            bgaVar.setVisibleHeight(i);
        }
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            cgaVar.setVisibleHeight(i);
        }
    }

    public final boolean t() {
        zha zhaVar;
        zha[] zhaVarArr = this.n0;
        if (zhaVarArr != null && (zhaVar = zhaVarArr[0]) != null && (!this.n1 || !j0(zhaVar.F))) {
            boolean j0 = j0(zhaVarArr[0].F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, false)) {
                return true;
            }
        }
        return false;
    }

    public final dja t1(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.m2;
        dja djaVar = (dja) hashMap.get(valueOf);
        if (djaVar != null) {
            return djaVar;
        }
        dja djaVar2 = new dja(this, getContext(), i);
        hashMap.put(Integer.valueOf(i), djaVar2);
        this.n2.put(Integer.valueOf(djaVar2.a), Integer.valueOf(i));
        return djaVar2;
    }

    public final void u(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        bga bgaVar;
        mha mhaVar;
        cga cgaVar;
        zha[] zhaVarArr = this.n0;
        int length = zhaVarArr.length;
        for (int i = 0; i < length; i++) {
            zha zhaVar = zhaVarArr[i];
            if (zhaVar != null && zhaVar.getVisibility() == 0) {
                if (zhaVar.P != null) {
                    RectF rectF2 = this.j2;
                    if (yic.c(zhaVar, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        zhaVar.c(canvas);
                        canvas.restore();
                    }
                }
                if (zhaVar.F == 14 && (cgaVar = this.b0) != null && cgaVar.getParent() == zhaVar) {
                    for (View view : cgaVar.h.getViewPages()) {
                        if ((view instanceof au8) && view.getVisibility() == 0) {
                            wa waVar = ((au8) view).f;
                            uk0.a(waVar, canvas, rectF, waVar, viewGroup);
                        }
                    }
                } else {
                    d79 currentListView = (zhaVar.F == 12 && (mhaVar = this.W) != null && mhaVar.getParent() == zhaVar) ? mhaVar.a.A0 : (zhaVar.F == 13 && (bgaVar = this.a0) != null && bgaVar.getParent() == zhaVar) ? bgaVar.getCurrentListView() : zhaVar.h;
                    if (currentListView != null && currentListView.getVisibility() == 0) {
                        uk0.a(currentListView, canvas, rectF, currentListView, viewGroup);
                    }
                }
            }
        }
    }

    public final boolean u0() {
        if (p() && ((getClosestTab() == 8 || getClosestTab() == 13 || t0(getClosestTab())) && this.F1)) {
            return false;
        }
        cga cgaVar = this.b0;
        if (cgaVar != null && cgaVar.g()) {
            return false;
        }
        fga fgaVar = this.c0;
        return ((fgaVar != null && fgaVar.f) || this.r1 || this.j1) ? false : true;
    }

    public final dja u1(int i) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return (dja) this.m2.get(num);
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.J1.a(c0(aob.d6));
            gd0 gd0Var = this.G0;
            if (gd0Var != null) {
                gd0Var.a(c0(aob.y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(c0(aob.y8));
            }
            B1();
            invalidate();
            for (zha zhaVar : this.n0) {
                if (zhaVar != null && zhaVar.M) {
                    zhaVar.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void v0(int i, int i2, int i3, boolean z) {
        tia[] tiaVarArr = this.w1;
        tiaVarArr[i].a.clear();
        tiaVarArr[i].b[0].clear();
        tiaVarArr[i].b[1].clear();
        tia tiaVar = tiaVarArr[i];
        tiaVar.j[0] = i2;
        tiaVar.i[0] = false;
        tiaVar.l = false;
        tiaVar.m = i3;
        tiaVar.n = (tiaVar.e() - i3) - 1;
        tia tiaVar2 = tiaVarArr[i];
        if (tiaVar2.n < 0) {
            tiaVar2.n = 0;
        }
        tiaVar2.k = i2;
        tiaVar2.o = true;
        tiaVar2.g = false;
        tiaVar2.p++;
        zha P = P(i);
        if (P != null && P.h.getAdapter() != null) {
            P.h.getAdapter().f();
        }
        if (!z) {
            return;
        }
        int i4 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i4 >= zhaVarArr.length) {
                return;
            }
            zha zhaVar = zhaVarArr[i4];
            if (zhaVar.F == i) {
                zhaVar.x.g1(Math.min(tiaVarArr[i].e() - 1, tiaVarArr[i].m), 0);
            }
            i4++;
        }
    }

    public final bja v1(int i) {
        dja u1;
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
        getStoriesController().q(this.m1, str, new yfa(this, (byte) 0));
    }

    public final bja w1(int i) {
        dja u1;
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
        eja ejaVar;
        ArrayList arrayList;
        byte b;
        int i;
        Bitmap bitmap;
        zha P = P(0);
        if (P != null && P.getMeasuredHeight() > 0 && P.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(P.getMeasuredWidth(), P.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                cc4.g(e, true);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.L1 = true;
                P.h.draw(new Canvas(bitmap2));
                View view = new View(P.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                P.addView(view);
                ejaVar = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new wa2((Object) ejaVar, (Object) view, (Object) P, (Object) bitmap2, (byte) 4)).start();
                P.h.setAlpha(0.0f);
                P.h.animate().alpha(1.0f).setUpdateListener(new b49(P, (byte) 29)).setDuration(200L).start();
                wia wiaVar = ejaVar.x1;
                int[] iArr = wiaVar.c;
                arrayList = wiaVar.n[0].a;
                tia[] tiaVarArr = ejaVar.w1;
                tia tiaVar = tiaVarArr[0];
                int[] iArr2 = tiaVar.f;
                iArr2[1] = 0;
                b = tiaVar.q;
                if (b != 0) {
                    iArr2[0] = iArr[0];
                } else if (b == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                tiaVar.h = false;
                long j = ejaVar.m1;
                ejaVar.v0(0, !wf3.B(j) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                ejaVar.G0(false);
                ejaVar.G1.V();
                boolean B = wf3.B(j);
                for (i = 0; i < arrayList.size(); i++) {
                    r47 r47Var = (r47) arrayList.get(i);
                    tia tiaVar2 = tiaVarArr[0];
                    byte b2 = tiaVar2.q;
                    if (b2 == 0) {
                        tiaVar2.a(r47Var, 0, false, B);
                    } else if (b2 == 1) {
                        if (r47.R3(r47Var.k)) {
                            tiaVarArr[0].a(r47Var, 0, false, B);
                        }
                    } else if (!r47.R3(r47Var.k)) {
                        tiaVarArr[0].a(r47Var, 0, false, B);
                    }
                }
            }
        }
        ejaVar = this;
        wia wiaVar2 = ejaVar.x1;
        int[] iArr3 = wiaVar2.c;
        arrayList = wiaVar2.n[0].a;
        tia[] tiaVarArr2 = ejaVar.w1;
        tia tiaVar3 = tiaVarArr2[0];
        int[] iArr22 = tiaVar3.f;
        iArr22[1] = 0;
        b = tiaVar3.q;
        if (b != 0) {
        }
        tiaVar3.h = false;
        long j2 = ejaVar.m1;
        ejaVar.v0(0, !wf3.B(j2) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        ejaVar.G0(false);
        ejaVar.G1.V();
        boolean B2 = wf3.B(j2);
        while (i < arrayList.size()) {
        }
    }

    public final void x0(TL_stories.StoryItem storyItem, v5b v5bVar) {
        getStoriesController().b(v5bVar.a, this.m1, storyItem);
        hl.d3(new ida((Object) this, (Object) v5bVar, (byte) 3), 100L);
    }

    public final int x1(j79 j79Var) {
        if (j79Var == this.f0) {
            return 8;
        }
        if (j79Var == this.h0) {
            return 9;
        }
        for (dja djaVar : this.m2.values()) {
            if (djaVar.c == j79Var) {
                return djaVar.a;
            }
        }
        return -1;
    }

    public final void y() {
        bha bhaVar = this.L0;
        if (bhaVar.d(bhaVar.getCurrentTabId())) {
            return;
        }
        int firstTabId = bhaVar.getFirstTabId();
        bhaVar.setInitialTabId(firstTabId);
        this.n0[0].F = firstTabId;
        z1(false);
    }

    public final /* synthetic */ void y0(TL_stories.StoryItem storyItem, String str) {
        getStoriesController().q(this.m1, str, new ku9(this, storyItem, (byte) 6));
    }

    public final int y1(j79 j79Var) {
        if (j79Var == this.g0) {
            return 8;
        }
        if (j79Var == this.i0) {
            return 9;
        }
        for (dja djaVar : this.m2.values()) {
            if (djaVar.d == j79Var) {
                return djaVar.a;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, jga] */
    public final void z(zha zhaVar, d79 d79Var, x46 x46Var) {
        boolean z;
        int i;
        int i2;
        f89 L;
        boolean z2;
        r47 r47Var;
        ?? r4;
        u5b u5bVar;
        if (this.r1 || this.N1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (d79Var.getFastScroll() == null || !d79Var.getFastScroll().n || currentTimeMillis - zhaVar.a >= 300) {
            zhaVar.a = currentTimeMillis;
            if ((this.Y0 && this.X0 && zhaVar.F != 11) || zhaVar.F == 7) {
                return;
            }
            int K0 = x46Var.K0();
            int abs = K0 == -1 ? 0 : Math.abs(x46Var.M0() - K0) + 1;
            int b = d79Var.getAdapter() == null ? 0 : d79Var.getAdapter().b();
            int i3 = zhaVar.F;
            int[] iArr = this.p1;
            byte b2 = 6;
            tia[] tiaVarArr = this.w1;
            if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4) {
                b = tiaVarArr[i3].d() + tiaVarArr[i3].a.size();
                tia tiaVar = tiaVarArr[i3];
                z = false;
                if (tiaVar.h && tiaVar.e.size() > 2 && zhaVar.F == 0 && tiaVarArr[i3].a.size() != 0) {
                    float f = i3 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((d79Var.getMeasuredHeight() / (d79Var.getMeasuredWidth() / f)) * f * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((eia) tiaVarArr[i3].e.get(1)).b) {
                        measuredHeight = ((eia) tiaVarArr[i3].e.get(1)).b;
                    }
                    if ((K0 > b && K0 - b > measuredHeight) || ((i = K0 + abs) < tiaVarArr[i3].m && tiaVarArr[0].m - i > measuredHeight)) {
                        a39 a39Var = new a39(this, i3, d79Var, b2);
                        this.N1 = a39Var;
                        hl.c3(a39Var);
                        return;
                    }
                }
            } else {
                z = false;
            }
            int i4 = zhaVar.F;
            if (i4 != 7) {
                boolean j0 = j0(i4);
                int i5 = zhaVar.F;
                if (j0) {
                    bja v1 = v1(i5);
                    if (v1 == null || (u5bVar = v1.s) == null || K0 + abs <= u5bVar.i() - iArr[1]) {
                        return;
                    }
                    v1.P();
                    return;
                }
                if (i5 == 6) {
                    if (abs > 0) {
                        sha shaVar = this.S;
                        boolean z3 = shaVar.h;
                        ArrayList arrayList = shaVar.d;
                        if (z3 || shaVar.e || arrayList.isEmpty() || K0 + abs < b - 5) {
                            return;
                        }
                        shaVar.E(((TLRPC.Chat) c00.g(1, arrayList)).id);
                        return;
                    }
                    return;
                }
                e eVar = this.y1;
                if (i5 == 11) {
                    ?? r2 = z;
                    int i6 = -1;
                    while (true) {
                        int childCount = zhaVar.h.getChildCount();
                        r4 = zhaVar.h;
                        if (r2 >= childCount) {
                            break;
                        }
                        View childAt = r4.getChildAt(r2);
                        zhaVar.h.getClass();
                        i6 = Math.max(RecyclerView.S(childAt), i6);
                        r2++;
                    }
                    j79 adapter = r4.getAdapter();
                    qia qiaVar = this.V;
                    int i7 = i6 + 1;
                    if (adapter != qiaVar) {
                        if (i7 >= eVar.getMessagesController().F1().i.size()) {
                            eVar.getMessagesController().F1().g(z);
                            return;
                        }
                        return;
                    } else {
                        if (i7 < qiaVar.h.size() + qiaVar.e.size() || qiaVar.s || qiaVar.r) {
                            return;
                        }
                        qiaVar.r = true;
                        qiaVar.F();
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
                if (abs + K0 > b - i8 || tiaVarArr[i9].o) {
                    tia tiaVar2 = tiaVarArr[i9];
                    if (!tiaVar2.g) {
                        if (i5 == 0) {
                            byte b3 = tiaVarArr[0].q;
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
                        boolean[] zArr = tiaVar2.i;
                        if (!zArr[0]) {
                            tiaVar2.g = true;
                            eVar.getMediaDataController().P0(this.m1, 50, tiaVarArr[i9].j[0], 0, i2, this.G, 1, eVar.getClassGuid(), tiaVarArr[i9].p, null, null);
                        } else if (this.f1 != 0 && !zArr[1]) {
                            tiaVar2.g = true;
                            eVar.getMediaDataController().P0(this.f1, 50, tiaVarArr[i9].j[1], 0, i2, this.G, 1, eVar.getClassGuid(), tiaVarArr[i9].p, null, null);
                        }
                    }
                }
                int i11 = tiaVarArr[i9].m;
                if (i9 == 0) {
                    i11 = this.K.L(0);
                }
                if (K0 - i11 < i8 + 1) {
                    tia tiaVar3 = tiaVarArr[i9];
                    if (!tiaVar3.g && !tiaVar3.l && !tiaVar3.o) {
                        H0(zhaVar.F);
                    }
                }
                zha zhaVar2 = this.n0[0];
                if (zhaVar2.h == d79Var) {
                    int i12 = zhaVar2.F;
                    if ((i12 != 0 && i12 != 5) || K0 == -1 || (L = d79Var.L(K0)) == null) {
                        return;
                    }
                    int i13 = L.f;
                    if (i13 == 0 || i13 == 12) {
                        View view = L.a;
                        boolean z4 = view instanceof kja;
                        dl1 dl1Var = this.N0;
                        if (!z4) {
                            if (view instanceof vw2) {
                                dl1Var.h0(((vw2) view).getDate(), false, true);
                                return;
                            }
                            return;
                        }
                        kja kjaVar = (kja) view;
                        if (kjaVar.e <= 0) {
                            r47Var = null;
                            z2 = false;
                        } else {
                            z2 = false;
                            r47Var = kjaVar.b[0];
                        }
                        if (r47Var != null) {
                            dl1Var.h0(r47Var.k.date, z2, true);
                        }
                    }
                }
            }
        }
    }

    public final void z0(HashSet hashSet, TL_stories.StoryItem storyItem, fu5 fu5Var, v5b v5bVar) {
        String a0;
        boolean contains = hashSet.contains(Integer.valueOf(v5bVar.a));
        long j = this.m1;
        if (contains) {
            getStoriesController().b(v5bVar.a, j, storyItem);
            a0 = ob6.a0(null, null, 2131744388, v5bVar.b);
        } else {
            c6b storiesController = getStoriesController();
            int i = v5bVar.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.e0(i, j, arrayList);
            a0 = ob6.a0(null, null, 2131744148, v5bVar.b);
        }
        d31.b0(this.y1).Q(R.raw.contact_check, 36, hl.S2(a0)).j();
        fu5Var.u();
    }

    public final void z1(boolean z) {
        zha[] zhaVarArr;
        zha[] zhaVarArr2;
        s7 s7Var;
        x79 x79Var;
        boolean z2;
        boolean z3;
        boolean z4;
        x79 x79Var2;
        int i;
        int i2;
        int i3;
        boolean z5;
        x79 x79Var3;
        int i4;
        int i5;
        boolean z6;
        x79 x79Var4;
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            cgaVar.i();
        }
        int i6 = 0;
        while (true) {
            zhaVarArr = this.n0;
            if (i6 >= zhaVarArr.length) {
                break;
            }
            zhaVarArr[i6].h.E0();
            i6++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zhaVarArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = hl.L(I0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        j79 adapter = zhaVarArr[z ? 1 : 0].h.getAdapter();
        j79 j79Var = this.f0;
        lu5 lu5Var = this.e0;
        if (adapter == j79Var) {
            lu5Var.h(null);
        }
        boolean z7 = this.Y0;
        jla jlaVar = this.I;
        tha thaVar = this.G1;
        a aVar = this.H;
        nia niaVar = this.Q;
        s7 s7Var2 = this.q0;
        int i7 = 100;
        if (z7 && this.X0) {
            zha zhaVar = zhaVarArr[z ? 1 : 0];
            if (zhaVar.f == null) {
                zhaVar.f = new x79();
            }
            zha zhaVar2 = zhaVarArr[z ? 1 : 0];
            x79 x79Var5 = zhaVar2.f;
            qia qiaVar = this.V;
            xha xhaVar = this.m0;
            bia biaVar = this.k0;
            bia biaVar2 = this.l0;
            bia biaVar3 = this.j0;
            if (z) {
                int i8 = zhaVar2.F;
                if (i8 != 0) {
                    x79Var4 = x79Var5;
                    if (i8 != 2 && i8 != 5 && i8 != 6 && (i8 != 7 || thaVar.X())) {
                        String obj = s7Var2 != null ? s7Var2.getSearchField().getText().toString() : "";
                        int i9 = zhaVarArr[z ? 1 : 0].F;
                        if (i9 == 1) {
                            if (biaVar3 != null) {
                                biaVar3.G(obj, false);
                                if (adapter != biaVar3) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar3);
                                }
                            }
                        } else if (i9 == 3) {
                            if (biaVar2 != null) {
                                biaVar2.G(obj, false);
                                if (adapter != biaVar2) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar2);
                                }
                            }
                        } else if (i9 == 4) {
                            if (biaVar != null) {
                                biaVar.G(obj, false);
                                if (adapter != biaVar) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar);
                                }
                            }
                        } else if (i9 == 7) {
                            if (xhaVar != null) {
                                xhaVar.F(obj, false);
                                if (adapter != xhaVar) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(xhaVar);
                                }
                            }
                        } else if (i9 == 11) {
                            if (qiaVar != null) {
                                qiaVar.E(this.Z0, obj);
                                if (adapter != qiaVar) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(qiaVar);
                                }
                            }
                        } else if (i9 == 15 && niaVar != null && adapter != niaVar) {
                            d1(adapter);
                            jga jgaVar = zhaVarArr[z ? 1 : 0].h;
                            niaVar.r = jgaVar;
                            jgaVar.setAdapter(niaVar);
                        }
                    }
                }
                this.Y0 = false;
                yga ygaVar = this.M0;
                if (ygaVar != null) {
                    ygaVar.g(false);
                }
                this.X0 = false;
                z1(true);
                return;
            }
            x79Var4 = x79Var5;
            if (zhaVar2.h != null) {
                int i10 = zhaVar2.F;
                if (i10 == 1) {
                    if (adapter != biaVar3) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar3);
                    }
                    biaVar3.f();
                } else if (i10 == 3) {
                    if (adapter != biaVar2) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar2);
                    }
                    biaVar2.f();
                } else if (i10 == 4) {
                    if (adapter != biaVar) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar);
                    }
                    biaVar.f();
                } else if (i10 == 7) {
                    if (adapter != xhaVar) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(xhaVar);
                    }
                    xhaVar.f();
                } else if (i10 == 11) {
                    if (adapter != qiaVar) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(qiaVar);
                    }
                    qiaVar.f();
                }
            }
            zhaVarArr2 = zhaVarArr;
            s7Var = s7Var2;
            x79Var3 = x79Var4;
            i = 4;
            z4 = false;
            z5 = false;
            i3 = 8;
        } else {
            zha zhaVar3 = zhaVarArr[z ? 1 : 0];
            if (zhaVar3.e == null) {
                zhaVar3.e = new x79();
            }
            zha zhaVar4 = zhaVarArr[z ? 1 : 0];
            x79 x79Var6 = zhaVar4.e;
            zhaVar4.h.setPinnedHeaderShadowDrawable(null);
            int i11 = zhaVarArr[z ? 1 : 0].F;
            if (i11 == 8 || t0(i11)) {
                layoutParams.topMargin = hl.L(I0());
            }
            jga jgaVar2 = zhaVarArr[z ? 1 : 0].h;
            int paddingLeft = jgaVar2.getPaddingLeft();
            zha zhaVar5 = zhaVarArr[z ? 1 : 0];
            zhaVarArr2 = zhaVarArr;
            jga jgaVar3 = zhaVar5.h;
            int T = T(zhaVar5.F);
            jgaVar3.h3 = T;
            int paddingRight = zhaVarArr2[z ? 1 : 0].h.getPaddingRight();
            jga jgaVar4 = zhaVarArr2[z ? 1 : 0].h;
            int S = S(s0());
            jgaVar4.i3 = S;
            jgaVar2.setPadding(paddingLeft, T, paddingRight, S);
            int i12 = zhaVarArr2[z ? 1 : 0].F;
            int[] iArr = this.p1;
            j79 j79Var2 = this.N;
            sha shaVar = this.S;
            pia piaVar = this.U;
            View view = this.a0;
            mha mhaVar = this.W;
            s7Var = s7Var2;
            tia[] tiaVarArr = this.w1;
            if (i12 == 0) {
                j79 j79Var3 = this.K;
                if (adapter != j79Var3) {
                    d1(adapter);
                    zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var3);
                }
                int i13 = -hl.L(1.0f);
                layoutParams.rightMargin = i13;
                layoutParams.leftMargin = i13;
                tia tiaVar = tiaVarArr[0];
                boolean z8 = tiaVar.h && !tiaVar.e.isEmpty();
                i7 = iArr[0];
                zhaVarArr2[z ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                x79Var = tiaVarArr[0].x;
                z4 = z8;
                z2 = false;
            } else {
                if (i12 == 1) {
                    tia tiaVar2 = tiaVarArr[1];
                    z3 = tiaVar2.h && !tiaVar2.e.isEmpty();
                    if (adapter != j79Var2) {
                        d1(adapter);
                        zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var2);
                    }
                } else if (i12 == 2) {
                    tia tiaVar3 = tiaVarArr[2];
                    z3 = tiaVar3.h && !tiaVar3.e.isEmpty();
                    j79 j79Var4 = this.O;
                    if (adapter != j79Var4) {
                        d1(adapter);
                        zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var4);
                    }
                } else {
                    if (i12 == 3) {
                        j79 j79Var5 = this.M;
                        if (adapter != j79Var5) {
                            d1(adapter);
                            zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var5);
                        }
                    } else if (i12 == 4) {
                        tia tiaVar4 = tiaVarArr[4];
                        z3 = tiaVar4.h && !tiaVar4.e.isEmpty();
                        j79 j79Var6 = this.P;
                        if (adapter != j79Var6) {
                            d1(adapter);
                            zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var6);
                        }
                    } else {
                        if (i12 == 5) {
                            j79 j79Var7 = this.R;
                            if (adapter != j79Var7) {
                                d1(adapter);
                                zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var7);
                            }
                        } else if (i12 == 15) {
                            if (adapter != niaVar) {
                                d1(adapter);
                                jga jgaVar5 = zhaVarArr2[z ? 1 : 0].h;
                                niaVar.r = jgaVar5;
                                jgaVar5.setAdapter(niaVar);
                            }
                        } else if (i12 == 6) {
                            if (adapter != shaVar) {
                                d1(adapter);
                                zhaVarArr2[z ? 1 : 0].h.setAdapter(shaVar);
                            }
                        } else if (i12 == 7) {
                            j79 j79Var8 = this.d0;
                            if (adapter != j79Var8) {
                                d1(adapter);
                                zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var8);
                            }
                        } else if (j0(i12)) {
                            j79 v1 = v1(zhaVarArr2[z ? 1 : 0].F);
                            if (adapter != v1) {
                                d1(adapter);
                                zhaVarArr2[z ? 1 : 0].h.setAdapter(v1);
                                zhaVarArr2[z ? 1 : 0].h.getClass();
                            }
                            zha zhaVar6 = zhaVarArr2[z ? 1 : 0];
                            if (zhaVar6.F != 9) {
                                lu5Var.h(zhaVar6.h);
                            }
                            i7 = iArr[1];
                        } else {
                            int i14 = zhaVarArr2[z ? 1 : 0].F;
                            if (i14 == 10) {
                                j79 j79Var9 = this.T;
                                if (adapter != j79Var9) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var9);
                                }
                            } else if (i14 == 11) {
                                if (adapter != piaVar) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(piaVar);
                                    lu5 lu5Var2 = piaVar.w;
                                    jga jgaVar6 = zhaVarArr2[z ? 1 : 0].h;
                                    piaVar.s = jgaVar6;
                                    lu5Var2.h(jgaVar6);
                                }
                                x79Var = piaVar.r;
                                z2 = true;
                                z4 = false;
                            } else if (i14 == 12) {
                                if (adapter != null) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (mhaVar.getParent() != zhaVarArr2[z ? 1 : 0]) {
                                    hl.B2(mhaVar);
                                    zhaVarArr2[z ? 1 : 0].addView(mhaVar, tre.d(-1, -1.0f, jn7.D1, 0.0f, 56.0f, 0.0f, 0.0f));
                                    k1(hl.L(56.0f) + this.d2, mhaVar);
                                }
                            } else if (i14 == 13) {
                                if (adapter != null) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != zhaVarArr2[z ? 1 : 0]) {
                                    hl.B2(view);
                                    zhaVarArr2[z ? 1 : 0].addView(view);
                                    k1(this.d2, view);
                                }
                            } else if (i14 == 14) {
                                if (adapter != null) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (cgaVar != null && cgaVar.getParent() != zhaVarArr2[z ? 1 : 0]) {
                                    hl.B2(cgaVar);
                                    zhaVarArr2[z ? 1 : 0].addView(cgaVar);
                                    zhaVarArr2[z ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        x79Var = x79Var6;
                        z2 = false;
                        z4 = false;
                    }
                    x79Var = x79Var6;
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                x79Var = x79Var6;
                z2 = true;
            }
            I1(zhaVarArr2[z ? 1 : 0]);
            if (z2) {
                zhaVarArr2[z ? 1 : 0].h.setSections(false);
                x79Var2 = x79Var;
            } else {
                jga jgaVar7 = zhaVarArr2[z ? 1 : 0].h;
                jgaVar7.getClass();
                x79Var2 = x79Var;
                yob.l(jgaVar7, 20, aob.i6, jgaVar7.o2);
                jgaVar7.U2 = false;
                jgaVar7.I2 = null;
                jgaVar7.J2 = null;
                jgaVar7.M2 = 0.0f;
                jgaVar7.N2 = null;
                jgaVar7.O2 = null;
                jgaVar7.K2 = null;
                p69 p69Var = jgaVar7.H2;
                if (p69Var != null) {
                    jgaVar7.s0(p69Var);
                    jgaVar7.H2 = null;
                }
                zj0 zj0Var = jgaVar7.S2;
                if (zj0Var != null) {
                    jgaVar7.s0(zj0Var);
                    jgaVar7.S2 = null;
                }
            }
            H1(zhaVarArr2[z ? 1 : 0]);
            zha zhaVar7 = zhaVarArr2[z ? 1 : 0];
            int i15 = zhaVar7.F;
            jga jgaVar8 = zhaVar7.h;
            if (i15 == 11) {
                jgaVar8.setItemAnimator(zhaVar7.d);
            } else {
                jgaVar8.setItemAnimator(null);
                if (piaVar != null && zhaVarArr2[z ? 1 : 0].h == piaVar.s) {
                    lu5 lu5Var3 = piaVar.w;
                    piaVar.s = null;
                    lu5Var3.h(null);
                }
            }
            if (mhaVar != null && zhaVarArr2[z ? 1 : 0].F != 12 && mhaVar.getParent() == zhaVarArr2[z ? 1 : 0]) {
                mhaVar.a.onRemoveFromParent();
                zhaVarArr2[z ? 1 : 0].removeView(mhaVar);
            }
            if (view != null && zhaVarArr2[z ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                zha zhaVar8 = zhaVarArr2[z ? 1 : 0];
                if (parent == zhaVar8) {
                    zhaVar8.removeView(view);
                }
            }
            if (cgaVar != null && zhaVarArr2[z ? 1 : 0].F != 14) {
                ViewParent parent2 = cgaVar.getParent();
                zha zhaVar9 = zhaVarArr2[z ? 1 : 0];
                if (parent2 == zhaVar9) {
                    zhaVar9.removeView(cgaVar);
                }
            }
            int i16 = zhaVarArr2[z ? 1 : 0].F;
            if (i16 == 0 || i16 == 11 || j0(i16) || (i4 = zhaVarArr2[z ? 1 : 0].F) == 2 || i4 == 5 || i4 == 6 || ((i4 == 7 && !thaVar.X()) || (i5 = zhaVarArr2[z ? 1 : 0].F) == 10 || i5 == 13 || i5 == 14)) {
                i = 4;
                if (z) {
                    this.A0 = (byte) 2;
                } else {
                    this.A0 = (byte) 0;
                    if (s7Var != null) {
                        setSearchItemVisibility((s0() || this.Y0) ? 8 : 4);
                    }
                }
            } else if (z) {
                if (s7Var != null && s7Var.getVisibility() == 4) {
                    if (!(jlaVar != null ? jlaVar.L : aVar.o0)) {
                        if (q()) {
                            this.A0 = (byte) 1;
                            setSearchItemVisibility(0);
                        } else {
                            setSearchItemVisibility(s0() ? 8 : 4);
                        }
                        float f = z ? 1.0f : 0.0f;
                        this.r0 = V(f);
                        K1(1.0f - f);
                        i = 4;
                        z6 = false;
                        G1(z6);
                    }
                }
                z6 = false;
                this.A0 = (byte) 0;
                this.r0 = 1.0f;
                i = 4;
                G1(z6);
            } else {
                z6 = false;
                if (s7Var != null) {
                    i = 4;
                    if (s7Var.getVisibility() == 4) {
                        if (q()) {
                            this.A0 = (byte) 0;
                            this.r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            setSearchItemVisibility(s0() ? 8 : 4);
                            this.r0 = 0.0f;
                        }
                    }
                    G1(z6);
                }
                i = 4;
                G1(z6);
            }
            int i17 = zhaVarArr2[z ? 1 : 0].F;
            if (i17 == 6) {
                if (!shaVar.e && !shaVar.h && shaVar.d.isEmpty()) {
                    shaVar.E(0L);
                }
            } else if (i17 != 7) {
                if (j0(i17)) {
                    bja v12 = v1(zhaVarArr2[z ? 1 : 0].F);
                    if (v12 != null) {
                        u5b u5bVar = v12.s;
                        v12.P();
                        zhaVarArr2[z ? 1 : 0].w.e(u5bVar != null && (u5bVar.k() || (d0() && u5bVar.g() > 0)), z);
                        z4 = (u5bVar == null || u5bVar.g() <= 0 || q0()) ? false : true;
                    }
                } else {
                    int i18 = zhaVarArr2[z ? 1 : 0].F;
                    if (i18 != 10 && i18 != 11 && i18 != 12 && i18 != 13 && i18 != 14) {
                        if (i18 == 15) {
                            i18 = 8;
                        }
                        tia tiaVar5 = tiaVarArr[i18];
                        if (!tiaVar5.g && !tiaVar5.i[0] && tiaVar5.a.isEmpty()) {
                            tiaVarArr[i18].g = true;
                            j79Var2.f();
                            if (i18 == 0) {
                                byte b = tiaVarArr[0].q;
                                if (b == 1) {
                                    i2 = 6;
                                } else if (b == 2) {
                                    i2 = 7;
                                }
                                e eVar = this.y1;
                                eVar.getMediaDataController().P0(this.m1, 50, 0, 0, i2, this.G, 1, eVar.getClassGuid(), tiaVarArr[i2].p, null, null);
                            }
                            i2 = i18;
                            e eVar2 = this.y1;
                            eVar2.getMediaDataController().P0(this.m1, 50, 0, 0, i2, this.G, 1, eVar2.getClassGuid(), tiaVarArr[i2].p, null, null);
                        }
                    }
                }
            }
            int i19 = zhaVarArr2[z ? 1 : 0].F;
            if (i19 == 8 || t0(i19)) {
                zha zhaVar10 = zhaVarArr2[z ? 1 : 0];
                vga vgaVar = zhaVar10.w;
                boolean t0 = t0(zhaVar10.F);
                int s1 = s1(zhaVarArr2[z ? 1 : 0].F);
                de0 de0Var = vgaVar.b;
                c51 c51Var = vgaVar.f;
                de0Var.setVisibility((t0 || r0() || l0()) ? 8 : 0);
                if (t0) {
                    c51Var.setVisibility(0);
                    c51Var.h(ob6.M0(2131744462, null), false);
                    i3 = 8;
                } else if (r0()) {
                    i3 = 8;
                    c51Var.setVisibility(8);
                } else {
                    i3 = 8;
                    vgaVar.setStickerType(11);
                    c51Var.setVisibility(!q0() ? 0 : 8);
                    c51Var.h(f(), false);
                }
                tpa tpaVar = vgaVar.d;
                if (t0) {
                    tpaVar.setText(ob6.M0(2131744440, null));
                    vgaVar.e.setText(ob6.M0(2131744441, null));
                } else {
                    tpaVar.setText(ob6.M0(!q0() ? s0() ? 2131747907 : 2131747878 : 2131747935, null));
                    vgaVar.e.setText(s0() ? ob6.M0(2131747879, null) : "");
                }
                c51Var.setOnClickListener(new kt8(this, t0, s1, (byte) 1));
            } else {
                zha zhaVar11 = zhaVarArr2[z ? 1 : 0];
                if (zhaVar11.F == 9) {
                    if (r0()) {
                        zhaVarArr2[z ? 1 : 0].w.b.setVisibility(8);
                        zhaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        zhaVarArr2[z ? 1 : 0].w.b.setVisibility(0);
                        zhaVarArr2[z ? 1 : 0].w.setStickerType(11);
                        zhaVarArr2[z ? 1 : 0].w.f.setVisibility(0);
                        zhaVarArr2[z ? 1 : 0].w.f.h(f(), false);
                    }
                    zhaVarArr2[z ? 1 : 0].w.d.setText(ob6.M0(2131747977, null));
                    zhaVarArr2[z ? 1 : 0].w.e.setText(s0() ? ob6.M0(2131747978, null) : "");
                    zhaVarArr2[z ? 1 : 0].w.f.setOnClickListener(new ffa(this, (byte) 3));
                    i3 = 8;
                } else {
                    zhaVar11.w.b.setVisibility(0);
                    zhaVarArr2[z ? 1 : 0].w.setStickerType(1);
                    zhaVarArr2[z ? 1 : 0].w.d.setText(ob6.M0(2131747898, null));
                    zhaVarArr2[z ? 1 : 0].w.e.setText(ob6.M0(2131745535, null));
                    i3 = 8;
                    zhaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z5 = false;
            zhaVarArr2[z ? 1 : 0].h.setVisibility(0);
            x79Var3 = x79Var2;
        }
        int i20 = i7;
        zha zhaVar12 = zhaVarArr2[z ? 1 : 0];
        zhaVar12.b = z4;
        D1(zhaVar12, z5);
        zhaVarArr2[z ? 1 : 0].x.x1(i20);
        zhaVarArr2[z ? 1 : 0].h.c0();
        if (x79Var3 != null) {
            zhaVarArr2[z ? 1 : 0].h.setRecycledViewPool(x79Var3);
            zhaVarArr2[z ? 1 : 0].n.setRecycledViewPool(x79Var3);
        }
        if (this.A0 == 2) {
            if (jlaVar != null ? jlaVar.L : aVar.o0) {
                this.C0 = true;
                if (jlaVar != null) {
                    jlaVar.o(true);
                } else {
                    aVar.o(true);
                }
                this.A0 = (byte) 0;
                this.r0 = 0.0f;
                if (s7Var != null) {
                    setSearchItemVisibility(s0() ? i3 : i);
                }
                G1(false);
            }
        }
    }

    public void K0() {
    }

    public void Q0() {
    }

    @Override // kf3
    public final void r() {
    }

    public void J0(SparseArray sparseArray) {
    }

    public void R0(boolean z) {
    }

    public int c1(int i) {
        return i;
    }

    @Override // kf3
    public final void o(of3 of3Var) {
    }

    @Override // kf3
    public final void v(of3 of3Var) {
    }

    @Override // kf3
    public final void w(of3 of3Var) {
    }
}
