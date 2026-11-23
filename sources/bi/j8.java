package bi;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.wz;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class j8 extends org.telegram.ui.ActionBar.g2 implements te.b {
    public static final ArrayList U = new ArrayList();
    public LinearLayout E;
    public o7 F;
    public o7 G;
    public o7 H;
    public o7 I;
    public wz J;
    public int K;
    public int L;
    public float M;
    public gh.e N;
    public final p7 O;
    public op P;
    public boolean Q;
    public ValueAnimator R;
    public int S;
    public LinearLayout T;
    public final te.a a;
    public final long b;
    public final String c;
    public final x7 d;
    public y10 e;
    public i7 f;
    public View h;
    public FrameLayout n;
    public FrameLayout r;
    public TextView s;
    public t2 w;
    public boolean x;
    public HorizontalScrollView y;

    public j8(long j3, String str, long j10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null);
        this.a = new te.a(0, this, nr.h, 380L, false);
        p7 p7Var = new p7();
        p7Var.e = this;
        this.O = p7Var;
        this.Q = true;
        this.b = j3;
        this.c = str;
        this.resourceProvider = h6Var;
        x7 x7Var = new x7(this.currentAccount, j10, new t6(this, 0));
        boolean z10 = (j3 == 0 || j3 == k10.i(x7Var.a).e()) ? false : true;
        x7Var.v = z10;
        if (z10) {
            x7Var.j();
        }
        this.d = x7Var;
        x7Var.l(false);
    }

    public static void Z(j8 j8Var, Context context) {
        x7 x7Var = j8Var.d;
        if (j8Var.Q && !x7Var.f.isEmpty()) {
            a70 a70Var = new a70(j8Var, j8Var.G, false, false);
            a70Var.t = false;
            a70Var.b0 = true;
            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            a70Var.U = true;
            a70Var.p = new e6(a70Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(x7Var.f);
            int i7 = 2;
            Collections.sort(arrayList, new x6(j8Var, i7));
            i7 i7Var = new i7(j8Var, new y6(j8Var, strArr, arrayList, i7), new z6(j8Var, r14, i7), null, 1);
            i7Var.g3.r = false;
            h51[] h51VarArr = {i7Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ot otVar = new ot(context, j8Var.resourceProvider);
            otVar.setTextSize(1, 16.0f);
            otVar.setInputType(573441);
            otVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.resourceProvider);
            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.resourceProvider);
            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            otVar.setCursorWidth(1.5f);
            otVar.setHint(hd.N0(2131749992, null));
            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.resourceProvider);
            otVar.setBackground(null);
            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            otVar.addTextChangedListener(new v(strArr, i7Var, false, 1));
            if (arrayList.size() > 8) {
                a70Var.r(frameLayout, ma.o(-1, 44));
                a70Var.k();
            }
            if (!x7Var.j.isEmpty()) {
                a70Var.c(R.drawable.msg_select, hd.N0(2131745474, null), new a7(j8Var, h51VarArr, a70Var, 2), false);
            }
            a70Var.q(i7Var);
            j8Var.i0(j8Var.G, a70Var);
        }
    }

    public static void a0(j8 j8Var, Context context) {
        x7 x7Var = j8Var.d;
        if (j8Var.Q && !x7Var.g.isEmpty()) {
            a70 a70Var = new a70(j8Var, j8Var.H, false, false);
            a70Var.t = false;
            int i7 = 1;
            a70Var.b0 = true;
            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            a70Var.U = true;
            int i10 = 2;
            a70Var.p = new e6(a70Var, i10);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(x7Var.g);
            Collections.sort(arrayList, new x6(j8Var, i7));
            i7 i7Var = new i7(j8Var, new y6(j8Var, strArr, arrayList, i7), new z6(j8Var, r14, i7), null, 2);
            i7Var.g3.r = false;
            h51[] h51VarArr = {i7Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ot otVar = new ot(context, j8Var.resourceProvider);
            otVar.setTextSize(1, 16.0f);
            otVar.setInputType(573441);
            otVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.resourceProvider);
            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.resourceProvider);
            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            otVar.setCursorWidth(1.5f);
            otVar.setHint(hd.N0(2131749992, null));
            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.resourceProvider);
            otVar.setBackground(null);
            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            otVar.addTextChangedListener(new v(strArr, i7Var, false, i10));
            if (arrayList.size() > 8) {
                a70Var.r(frameLayout, ma.o(-1, 44));
                a70Var.k();
            }
            if (!x7Var.k.isEmpty()) {
                a70Var.c(R.drawable.msg_select, hd.N0(2131745474, null), new a7(j8Var, h51VarArr, a70Var, i7), false);
            }
            a70Var.q(i7Var);
            j8Var.i0(j8Var.H, a70Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b0(j8 j8Var, Context context) {
        x7 x7Var = j8Var.d;
        if (j8Var.Q && !x7Var.h.isEmpty()) {
            Object[] objArr = 0;
            a70 a70Var = new a70(j8Var, j8Var.I, false, false);
            a70Var.t = false;
            a70Var.b0 = true;
            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            a70Var.U = true;
            a70Var.p = new e6(a70Var, 1);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(x7Var.h);
            Collections.sort(arrayList, new x6(j8Var, 0));
            i7 i7Var = new i7(j8Var, new y6(j8Var, strArr, arrayList, 0 == true ? 1 : 0), new z6(j8Var, r13, 0 == true ? 1 : 0), null, 3);
            i7Var.g3.r = false;
            h51[] h51VarArr = {i7Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ot otVar = new ot(context, j8Var.resourceProvider);
            otVar.setTextSize(1, 16.0f);
            otVar.setInputType(573441);
            otVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.resourceProvider);
            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.resourceProvider);
            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            otVar.setCursorWidth(1.5f);
            otVar.setHint(hd.N0(2131749992, null));
            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.resourceProvider);
            otVar.setBackground(null);
            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            otVar.addTextChangedListener(new v(strArr, i7Var, 0 == true ? 1 : 0, 3));
            if (arrayList.size() > 8) {
                a70Var.r(frameLayout, ma.o(-1, 44));
                a70Var.k();
            }
            if (!x7Var.l.isEmpty()) {
                a70Var.c(R.drawable.msg_select, hd.N0(2131745474, null), new a7(j8Var, h51VarArr, a70Var, objArr == true ? 1 : 0), false);
            }
            a70Var.q(i7Var);
            j8Var.i0(j8Var.I, a70Var);
        }
    }

    public static void c0(j8 j8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == k10.i(j8Var.currentAccount).e()) {
            j8Var.d.n(tL_starGiftUnique);
            if (j3 == k10.i(j8Var.currentAccount).e()) {
                lc b02 = lc.b0(j8Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String N0 = hd.N0(2131752875, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                gc O = b02.O(document, N0, hd.a0(null, null, 2131752876, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                gc O2 = lc.b0(j8Var).O(tL_starGiftUnique.getDocument(), hd.N0(2131752873, null), hd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(j8Var.currentAccount, j3)));
                O2.r = false;
                O2.j();
            }
            j8Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        h7 h7Var = new h7(bundle, tL_starGiftUnique, j3);
        org.telegram.ui.ActionBar.r4 r4Var = j8Var.parentLayout;
        if (r4Var == null || !((ActionBarLayout) r4Var).b) {
            j8Var.presentFragment(h7Var, true, z10);
        } else {
            Dialog dialog = j8Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.w2) && z10) {
                ((org.telegram.ui.ActionBar.w2) dialog).O0 = true;
            }
            j8Var.finishFragment();
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(h7Var, false, z10);
            }
        }
        y10 y10Var = j8Var.e;
        if (y10Var != null) {
            y10Var.a(Boolean.valueOf(z10));
        }
    }

    public static void e0(j8 j8Var, o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            di.f6 f6Var = new di.f6(j8Var.getParentActivity(), j8Var.currentAccount, j8Var.b, j8Var.resourceProvider, null);
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, j8Var.d);
            f6Var.N2 = new d7(j8Var);
            j8Var.showDialog(f6Var);
        }
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            c10.d(this.n, f10);
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [bi.u6] */
    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new v1(this, 2));
        this.simpleActionBar.setTitle(this.c);
        l0();
        du0 du0Var = new du0(context, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, du0Var, getResourceProvider());
        this.fragmentView = du0Var;
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        i7 i7Var = new i7(this, new b(this, 9), new d7(this), new a3.l(this, 22), 0);
        this.f = i7Var;
        final int i7 = 0;
        i7Var.g3.r = false;
        i7Var.setSpanCount(3);
        final int i10 = 1;
        this.f.j(new u1(this, i10));
        du0Var.addView(this.f, ma.e(-1, -1, ls.E1));
        t2 t2Var = new t2(context, new View.OnClickListener(this) { // from class: bi.u6
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        x7 x7Var = this.b.d;
                        x7Var.k.clear();
                        x7Var.j.clear();
                        x7Var.l.clear();
                        x7Var.m();
                        break;
                    default:
                        j8 j8Var = this.b;
                        x7 x7Var2 = j8Var.d;
                        HashSet hashSet = x7Var2.k;
                        HashSet hashSet2 = x7Var2.l;
                        HashSet hashSet3 = x7Var2.j;
                        boolean z10 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z11 = x7Var2.r;
                            boolean z12 = x7Var2.s;
                            boolean z13 = x7Var2.t;
                            x7Var2.j();
                            boolean z14 = (z11 == x7Var2.r && z12 == x7Var2.s && z13 == x7Var2.t) ? false : true;
                            x7Var2.r = z11;
                            x7Var2.s = z12;
                            x7Var2.t = z13;
                            if (!z14) {
                                z10 = true;
                            }
                        }
                        x7Var2.k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z10) {
                            x7Var2.r = x7Var2.g();
                            x7Var2.s = x7Var2.h();
                            x7Var2.t = x7Var2.f();
                        } else {
                            x7Var2.j();
                        }
                        op opVar = j8Var.P;
                        if (opVar != null) {
                            opVar.a(x7Var2.k(), true);
                        }
                        x7Var2.m();
                        break;
                }
            }
        }, this.resourceProvider);
        this.w = t2Var;
        this.x = false;
        t2Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        du0Var.addView(this.w, ma.e(-1, -1, ls.E1));
        x7 x7Var = this.d;
        if (x7Var.d.isEmpty() && !x7Var.y && x7Var.z) {
            j0(true);
        }
        View view = new View(context);
        this.h = view;
        du0Var.addView(view, ma.e(-1, 0, 48));
        baseSimpleGlass.f(du0Var, this.f, this.simpleActionBar, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.c;
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        l7 l7Var = new l7(this.currentAccount, context, this.resourceProvider);
        fh.g c10 = cVar.c(l7Var, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        l7Var.setBackground(c10);
        ra.a(l7Var);
        l7Var.setOnClickListener(new ai.y2(5, this, l7Var));
        l7Var.setOnWidthChanged(new t6(this, i10));
        this.simpleActionBar.addView(l7Var, ma.e(-2, 58, 5));
        this.N = c8.i0.m(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        this.E.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.y.setOverScrollMode(2);
        this.y.addView(this.E);
        this.y.setClipChildren(false);
        du0Var.addView(this.y, ma.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final op opVar = new op(24, context, this.resourceProvider);
        this.P = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.j7, org.telegram.ui.ActionBar.m6.k7);
        opVar.setDrawUnchecked(true);
        opVar.a(x7Var.k(), false);
        opVar.setDrawBackgroundAsArc(10);
        opVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        opVar.setScaleX(0.8f);
        opVar.setScaleY(0.8f);
        linearLayout2.addView(opVar, ma.r(26, 26, 16));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, this.resourceProvider);
        i5.c.r(14.0f, 1, 2131749437, textView, null);
        linearLayout2.addView(textView, ma.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i11));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, r12, r12));
        this.T = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.i0.m(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: bi.v6
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                final int i12 = 1;
                final int i13 = 0;
                switch (i10) {
                    case 0:
                        final j8 j8Var = this.b;
                        x7 x7Var2 = j8Var.d;
                        if (j8Var.Q) {
                            a70 I = a70.I(j8Var, j8Var.F);
                            I.c(R.drawable.menu_sort_value, hd.N0(2131745943, null), new Runnable() { // from class: bi.b7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            j8Var.d.p(w7.a);
                                            break;
                                        case 1:
                                            j8Var.d.p(w7.b);
                                            break;
                                        default:
                                            j8Var.d.p(w7.c);
                                            break;
                                    }
                                }
                            }, false);
                            I.c(R.drawable.menu_sort_date, hd.N0(2131745947, null), new Runnable() { // from class: bi.b7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            j8Var.d.p(w7.a);
                                            break;
                                        case 1:
                                            j8Var.d.p(w7.b);
                                            break;
                                        default:
                                            j8Var.d.p(w7.c);
                                            break;
                                    }
                                }
                            }, false);
                            final int i14 = 2;
                            I.c(R.drawable.menu_sort_number, hd.N0(2131745945, null), new Runnable() { // from class: bi.b7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            j8Var.d.p(w7.a);
                                            break;
                                        case 1:
                                            j8Var.d.p(w7.b);
                                            break;
                                        default:
                                            j8Var.d.p(w7.c);
                                            break;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.r rVar = new ai.r(j8Var, I, opVar, y0VarArr, 3);
                            if (x7Var2.h()) {
                                I.i(new Runnable() { // from class: bi.c7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.r, !x7Var3.s, x7Var3.t);
                                                rVar.run();
                                                break;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.r, x7Var4.s, x7Var4.t);
                                                rVar.run();
                                                break;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.r, x7Var5.s, !x7Var5.t);
                                                rVar.run();
                                                break;
                                        }
                                    }
                                }, hd.N0(2131749439, null), x7Var2.s);
                                y0VarArr[2] = I.z();
                            }
                            if (x7Var2.g()) {
                                I.i(new Runnable() { // from class: bi.c7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.r, !x7Var3.s, x7Var3.t);
                                                rVar.run();
                                                break;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.r, x7Var4.s, x7Var4.t);
                                                rVar.run();
                                                break;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.r, x7Var5.s, !x7Var5.t);
                                                rVar.run();
                                                break;
                                        }
                                    }
                                }, hd.N0(2131749441, null), x7Var2.r);
                                y0VarArr[1] = I.z();
                            }
                            if (x7Var2.f()) {
                                I.i(new Runnable() { // from class: bi.c7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.r, !x7Var3.s, x7Var3.t);
                                                rVar.run();
                                                break;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.r, x7Var4.s, x7Var4.t);
                                                rVar.run();
                                                break;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.r, x7Var5.s, !x7Var5.t);
                                                rVar.run();
                                                break;
                                        }
                                    }
                                }, hd.N0(2131749438, null), x7Var2.t);
                                y0VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            j8Var.i0(j8Var.F, I);
                            break;
                        }
                        break;
                    default:
                        x7 x7Var3 = this.b.d;
                        if (x7Var3 != null) {
                            if (x7Var3.k()) {
                                x7Var3.o(true, true, true);
                            } else {
                                x7Var3.o(true, false, false);
                            }
                            opVar.a(x7Var3.k(), true);
                            break;
                        }
                        break;
                }
            }
        });
        this.r.addView(linearLayout2, ma.c(-1.0f, -2));
        ra.b(this.r, 0.04f, 1.5f);
        du0Var.addView(this.r, ma.e(-2, 56, 81));
        if (!x7Var.g() || (!x7Var.h() && !x7Var.f())) {
            this.r.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.i0.m(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        du0Var.addView(this.n, ma.e(-2, 60, 81));
        this.s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new nq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131749997, null));
        this.s.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.t6.U(this.s, i11, getResourceProvider());
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i11));
        textView2.setBackground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.s.setGravity(17);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: bi.u6
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i7) {
                    case 0:
                        x7 x7Var2 = this.b.d;
                        x7Var2.k.clear();
                        x7Var2.j.clear();
                        x7Var2.l.clear();
                        x7Var2.m();
                        break;
                    default:
                        j8 j8Var = this.b;
                        x7 x7Var22 = j8Var.d;
                        HashSet hashSet = x7Var22.k;
                        HashSet hashSet2 = x7Var22.l;
                        HashSet hashSet3 = x7Var22.j;
                        boolean z10 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z11 = x7Var22.r;
                            boolean z12 = x7Var22.s;
                            boolean z13 = x7Var22.t;
                            x7Var22.j();
                            boolean z14 = (z11 == x7Var22.r && z12 == x7Var22.s && z13 == x7Var22.t) ? false : true;
                            x7Var22.r = z11;
                            x7Var22.s = z12;
                            x7Var22.t = z13;
                            if (!z14) {
                                z10 = true;
                            }
                        }
                        x7Var22.k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z10) {
                            x7Var22.r = x7Var22.g();
                            x7Var22.s = x7Var22.h();
                            x7Var22.t = x7Var22.f();
                        } else {
                            x7Var22.j();
                        }
                        op opVar2 = j8Var.P;
                        if (opVar2 != null) {
                            opVar2.a(x7Var22.k(), true);
                        }
                        x7Var22.m();
                        break;
                }
            }
        });
        this.n.addView(this.s, ma.c(-1.0f, -2));
        this.n.setVisibility(8);
        ra.b(this.n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        o7 o7Var = new o7(context, this.resourceProvider, true);
        this.F = o7Var;
        o7Var.setSorting(x7Var.p);
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: bi.v6
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view42) {
                final int i12 = 1;
                final int i13 = 0;
                switch (i7) {
                    case 0:
                        final j8 j8Var = this.b;
                        x7 x7Var2 = j8Var.d;
                        if (j8Var.Q) {
                            a70 I = a70.I(j8Var, j8Var.F);
                            I.c(R.drawable.menu_sort_value, hd.N0(2131745943, null), new Runnable() { // from class: bi.b7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            j8Var.d.p(w7.a);
                                            break;
                                        case 1:
                                            j8Var.d.p(w7.b);
                                            break;
                                        default:
                                            j8Var.d.p(w7.c);
                                            break;
                                    }
                                }
                            }, false);
                            I.c(R.drawable.menu_sort_date, hd.N0(2131745947, null), new Runnable() { // from class: bi.b7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            j8Var.d.p(w7.a);
                                            break;
                                        case 1:
                                            j8Var.d.p(w7.b);
                                            break;
                                        default:
                                            j8Var.d.p(w7.c);
                                            break;
                                    }
                                }
                            }, false);
                            final int i14 = 2;
                            I.c(R.drawable.menu_sort_number, hd.N0(2131745945, null), new Runnable() { // from class: bi.b7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            j8Var.d.p(w7.a);
                                            break;
                                        case 1:
                                            j8Var.d.p(w7.b);
                                            break;
                                        default:
                                            j8Var.d.p(w7.c);
                                            break;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.r rVar = new ai.r(j8Var, I, opVar, y0VarArr, 3);
                            if (x7Var2.h()) {
                                I.i(new Runnable() { // from class: bi.c7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.r, !x7Var3.s, x7Var3.t);
                                                rVar.run();
                                                break;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.r, x7Var4.s, x7Var4.t);
                                                rVar.run();
                                                break;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.r, x7Var5.s, !x7Var5.t);
                                                rVar.run();
                                                break;
                                        }
                                    }
                                }, hd.N0(2131749439, null), x7Var2.s);
                                y0VarArr[2] = I.z();
                            }
                            if (x7Var2.g()) {
                                I.i(new Runnable() { // from class: bi.c7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.r, !x7Var3.s, x7Var3.t);
                                                rVar.run();
                                                break;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.r, x7Var4.s, x7Var4.t);
                                                rVar.run();
                                                break;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.r, x7Var5.s, !x7Var5.t);
                                                rVar.run();
                                                break;
                                        }
                                    }
                                }, hd.N0(2131749441, null), x7Var2.r);
                                y0VarArr[1] = I.z();
                            }
                            if (x7Var2.f()) {
                                I.i(new Runnable() { // from class: bi.c7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.r, !x7Var3.s, x7Var3.t);
                                                rVar.run();
                                                break;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.r, x7Var4.s, x7Var4.t);
                                                rVar.run();
                                                break;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.r, x7Var5.s, !x7Var5.t);
                                                rVar.run();
                                                break;
                                        }
                                    }
                                }, hd.N0(2131749438, null), x7Var2.t);
                                y0VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            j8Var.i0(j8Var.F, I);
                            break;
                        }
                        break;
                    default:
                        x7 x7Var3 = this.b.d;
                        if (x7Var3 != null) {
                            if (x7Var3.k()) {
                                x7Var3.o(true, true, true);
                            } else {
                                x7Var3.o(true, false, false);
                            }
                            opVar.a(x7Var3.k(), true);
                            break;
                        }
                        break;
                }
            }
        });
        o7 o7Var2 = new o7(context, this.resourceProvider, true);
        this.G = o7Var2;
        o7Var2.setValue(hd.N0(2131750370, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: bi.w6
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i7) {
                    case 0:
                        j8.Z(this.b, context);
                        break;
                    case 1:
                        j8.a0(this.b, context);
                        break;
                    default:
                        j8.b0(this.b, context);
                        break;
                }
            }
        });
        o7 o7Var3 = new o7(context, this.resourceProvider, true);
        this.H = o7Var3;
        o7Var3.setValue(hd.N0(2131750371, null));
        g0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: bi.w6
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i10) {
                    case 0:
                        j8.Z(this.b, context);
                        break;
                    case 1:
                        j8.a0(this.b, context);
                        break;
                    default:
                        j8.b0(this.b, context);
                        break;
                }
            }
        });
        o7 o7Var4 = new o7(context, this.resourceProvider, true);
        this.I = o7Var4;
        o7Var4.setValue(hd.N0(2131750363, null));
        g0(this.I, true);
        final int i12 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: bi.w6
            public final /* synthetic */ j8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i12) {
                    case 0:
                        j8.Z(this.b, context);
                        break;
                    case 1:
                        j8.a0(this.b, context);
                        break;
                    default:
                        j8.b0(this.b, context);
                        break;
                }
            }
        });
        wz wzVar = new wz(getParentActivity());
        this.J = wzVar;
        du0Var.addView(wzVar, ma.c(-1.0f, -1));
        h0(false, false);
        return du0Var;
    }

    public final void g0(o7 o7Var, boolean z10) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        fh.g c10 = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c10.p(this.N);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(o7Var, ma.c(40.0f, -2));
        frameLayout.setOnClickListener(new ah.d(o7Var, 7));
        ra.a(frameLayout);
        this.E.addView(frameLayout, ma.t(-2, -2, 16, 0, 0, z10 ? 0 : -4, 0));
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.R = null;
        }
        float f10 = z10 ? 0.0f : 1.0f;
        if (!z11) {
            this.M = f10;
            k0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f10);
        this.R = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 1));
        this.R.setInterpolator(nr.h);
        this.R.setDuration(420L);
        this.R.start();
    }

    public final void i0(o7 o7Var, a70 a70Var) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.j5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay == null || !(a70Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) || !(o7Var.getParent() instanceof FrameLayout)) {
            a70Var.a0();
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) a70Var.A;
        FrameLayout frameLayout2 = (FrameLayout) o7Var.getParent();
        p7 p7Var = this.O;
        if (p7Var.a && (frameLayout = (FrameLayout) p7Var.b) != null && frameLayout != frameLayout2) {
            frameLayout.setVisibility(0);
        }
        p7Var.b = frameLayout2;
        p7Var.c = o7Var;
        p7Var.d = simpleMenuOverlay;
        a70Var.p = new e7(simpleMenuOverlay, 0);
        simpleMenuOverlay.setOnClosed(new f7(actionBarPopupWindow$ActionBarPopupWindowLayout, 0));
        simpleMenuOverlay.d(p7Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return (getLastStoryViewer() == null || getLastStoryViewer().H0) && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.m6.a7)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        t2 t2Var = this.w;
        if (t2Var == null || this.x == z10) {
            return;
        }
        this.x = z10;
        t2Var.setVisibility(0);
        this.w.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.95f).scaleY(z10 ? 1.0f : 0.95f).setInterpolator(nr.h).setDuration(320L).setListener(new g7(0, this, z10)).start();
    }

    public final void k0() {
        if (this.y == null) {
            return;
        }
        float f10 = this.M;
        float L = org.telegram.messenger.g0.L(47.0f) * f10;
        this.y.setTranslationY((ri.a.d(this.K) - org.telegram.messenger.g0.L(6.0f)) - L);
        this.y.setAlpha(1.0f - f10);
        this.y.setVisibility(f10 >= 1.0f ? 8 : 0);
        float f11 = -L;
        this.f.setTranslationY(f11);
        this.h.setTranslationY(f11);
    }

    public final void l0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var == null) {
            return;
        }
        int i7 = this.d.e;
        z4Var.setSubtitle(i7 <= 0 ? hd.N0(2131749990, null) : hd.H(',', "Gift2ListingsCount", i7));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null && z4Var.getOccupyStatusBar()) {
            i10 = Math.max(i10, org.telegram.messenger.g0.m);
        }
        this.K = i10;
        this.L = Math.max(i12, org.telegram.messenger.g0.n);
        if (this.f == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(40.0f) + ri.a.d(this.K);
        int L2 = org.telegram.messenger.g0.L(47.0f);
        int i13 = -ri.a.c(this.K);
        int i14 = (-ri.a.c(this.L)) - L2;
        org.telegram.messenger.g0.z3(this.f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.L) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.z3(this.w, 0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.n.getLayoutParams()).bottomMargin = this.L;
        this.r.requestLayout();
        this.n.requestLayout();
        k0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
            if (r12 != this.S) {
                this.S = r12;
                TextView textView = this.s;
                if (textView != null) {
                    org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), r12, true);
                }
                LinearLayout linearLayout = this.T;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.m6.H1(linearLayout.getBackground(), r12, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
