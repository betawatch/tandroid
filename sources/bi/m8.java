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
import c8.na;
import c8.sa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class m8 extends org.telegram.ui.ActionBar.g2 implements te.b {
    public static final ArrayList U = new ArrayList();
    public LinearLayout E;
    public r7 F;
    public r7 G;
    public r7 H;
    public r7 I;
    public tz J;
    public int K;
    public int L;
    public float M;
    public gh.e N;
    public final s7 O;
    public lp P;
    public boolean Q;
    public ValueAnimator R;
    public int S;
    public LinearLayout T;
    public final te.a a;
    public final long b;
    public final String c;
    public final a8 d;
    public w10 e;
    public l7 f;
    public View h;
    public FrameLayout n;
    public FrameLayout r;
    public TextView s;
    public v2 w;
    public boolean x;
    public HorizontalScrollView y;

    public m8(long j3, String str, long j10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null);
        this.a = new te.a(0, this, kr.h, 380L, false);
        s7 s7Var = new s7();
        s7Var.e = this;
        this.O = s7Var;
        this.Q = true;
        this.b = j3;
        this.c = str;
        this.resourceProvider = i6Var;
        a8 a8Var = new a8(this.currentAccount, j10, new w6(this, 0));
        boolean z10 = (j3 == 0 || j3 == i10.i(a8Var.a).e()) ? false : true;
        a8Var.v = z10;
        if (z10) {
            a8Var.j();
        }
        this.d = a8Var;
        a8Var.l(false);
    }

    public static void Z(m8 m8Var, Context context) {
        a8 a8Var = m8Var.d;
        if (m8Var.Q && !a8Var.f.isEmpty()) {
            x60 x60Var = new x60(m8Var, m8Var.G, false, false);
            x60Var.t = false;
            x60Var.b0 = true;
            x60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            x60Var.U = true;
            x60Var.p = new h6(x60Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(a8Var.f);
            int i7 = 2;
            Collections.sort(arrayList, new a7(m8Var, i7));
            l7 l7Var = new l7(m8Var, new b7(m8Var, strArr, arrayList, i7), new c7(m8Var, r14, i7), null, 1);
            l7Var.g3.r = false;
            g51[] g51VarArr = {l7Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, m8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            mt mtVar = new mt(context, m8Var.resourceProvider);
            mtVar.setTextSize(1, 16.0f);
            mtVar.setInputType(573441);
            mtVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, m8Var.resourceProvider);
            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, m8Var.resourceProvider);
            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            mtVar.setCursorWidth(1.5f);
            mtVar.setHint(gd.N0(2131749992, null));
            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, m8Var.resourceProvider);
            mtVar.setBackground(null);
            frameLayout.addView(mtVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            mtVar.addTextChangedListener(new v(strArr, l7Var, false, 1));
            if (arrayList.size() > 8) {
                x60Var.r(frameLayout, na.o(-1, 44));
                x60Var.k();
            }
            if (!a8Var.j.isEmpty()) {
                x60Var.c(R.drawable.msg_select, gd.N0(2131745474, null), new d7(m8Var, g51VarArr, x60Var, 2), false);
            }
            x60Var.q(l7Var);
            m8Var.i0(m8Var.G, x60Var);
        }
    }

    public static void a0(m8 m8Var, Context context) {
        a8 a8Var = m8Var.d;
        if (m8Var.Q && !a8Var.g.isEmpty()) {
            x60 x60Var = new x60(m8Var, m8Var.H, false, false);
            x60Var.t = false;
            int i7 = 1;
            x60Var.b0 = true;
            x60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            x60Var.U = true;
            int i10 = 2;
            x60Var.p = new h6(x60Var, i10);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(a8Var.g);
            Collections.sort(arrayList, new a7(m8Var, i7));
            l7 l7Var = new l7(m8Var, new b7(m8Var, strArr, arrayList, i7), new c7(m8Var, r14, i7), null, 2);
            l7Var.g3.r = false;
            g51[] g51VarArr = {l7Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, m8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            mt mtVar = new mt(context, m8Var.resourceProvider);
            mtVar.setTextSize(1, 16.0f);
            mtVar.setInputType(573441);
            mtVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, m8Var.resourceProvider);
            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, m8Var.resourceProvider);
            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            mtVar.setCursorWidth(1.5f);
            mtVar.setHint(gd.N0(2131749992, null));
            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, m8Var.resourceProvider);
            mtVar.setBackground(null);
            frameLayout.addView(mtVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            mtVar.addTextChangedListener(new v(strArr, l7Var, false, i10));
            if (arrayList.size() > 8) {
                x60Var.r(frameLayout, na.o(-1, 44));
                x60Var.k();
            }
            if (!a8Var.k.isEmpty()) {
                x60Var.c(R.drawable.msg_select, gd.N0(2131745474, null), new d7(m8Var, g51VarArr, x60Var, i7), false);
            }
            x60Var.q(l7Var);
            m8Var.i0(m8Var.H, x60Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b0(m8 m8Var, Context context) {
        a8 a8Var = m8Var.d;
        if (m8Var.Q && !a8Var.h.isEmpty()) {
            Object[] objArr = 0;
            x60 x60Var = new x60(m8Var, m8Var.I, false, false);
            x60Var.t = false;
            x60Var.b0 = true;
            x60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            x60Var.U = true;
            x60Var.p = new h6(x60Var, 1);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(a8Var.h);
            Collections.sort(arrayList, new a7(m8Var, 0));
            l7 l7Var = new l7(m8Var, new b7(m8Var, strArr, arrayList, 0 == true ? 1 : 0), new c7(m8Var, r13, 0 == true ? 1 : 0), null, 3);
            l7Var.g3.r = false;
            g51[] g51VarArr = {l7Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, m8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            mt mtVar = new mt(context, m8Var.resourceProvider);
            mtVar.setTextSize(1, 16.0f);
            mtVar.setInputType(573441);
            mtVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, m8Var.resourceProvider);
            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, m8Var.resourceProvider);
            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            mtVar.setCursorWidth(1.5f);
            mtVar.setHint(gd.N0(2131749992, null));
            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, m8Var.resourceProvider);
            mtVar.setBackground(null);
            frameLayout.addView(mtVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            mtVar.addTextChangedListener(new v(strArr, l7Var, 0 == true ? 1 : 0, 3));
            if (arrayList.size() > 8) {
                x60Var.r(frameLayout, na.o(-1, 44));
                x60Var.k();
            }
            if (!a8Var.l.isEmpty()) {
                x60Var.c(R.drawable.msg_select, gd.N0(2131745474, null), new d7(m8Var, g51VarArr, x60Var, objArr == true ? 1 : 0), false);
            }
            x60Var.q(l7Var);
            m8Var.i0(m8Var.I, x60Var);
        }
    }

    public static void c0(m8 m8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == i10.i(m8Var.currentAccount).e()) {
            m8Var.d.n(tL_starGiftUnique);
            if (j3 == i10.i(m8Var.currentAccount).e()) {
                kc b02 = kc.b0(m8Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String N0 = gd.N0(2131752875, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                fc O = b02.O(document, N0, gd.a0(null, null, 2131752876, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                fc O2 = kc.b0(m8Var).O(tL_starGiftUnique.getDocument(), gd.N0(2131752873, null), gd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(m8Var.currentAccount, j3)));
                O2.r = false;
                O2.j();
            }
            m8Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        k7 k7Var = new k7(bundle, tL_starGiftUnique, j3);
        org.telegram.ui.ActionBar.r4 r4Var = m8Var.parentLayout;
        if (r4Var == null || !((ActionBarLayout) r4Var).b) {
            m8Var.presentFragment(k7Var, true, z10);
        } else {
            Dialog dialog = m8Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.w2) && z10) {
                ((org.telegram.ui.ActionBar.w2) dialog).O0 = true;
            }
            m8Var.finishFragment();
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(k7Var, false, z10);
            }
        }
        w10 w10Var = m8Var.e;
        if (w10Var != null) {
            w10Var.a(Boolean.valueOf(z10));
        }
    }

    public static void e0(m8 m8Var, n41 n41Var) {
        Object obj = n41Var.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            di.f6 f6Var = new di.f6(m8Var.getParentActivity(), m8Var.currentAccount, m8Var.b, m8Var.resourceProvider, null);
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, m8Var.d);
            f6Var.N2 = new g7(m8Var);
            m8Var.showDialog(f6Var);
        }
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            a10.d(this.n, f10);
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [bi.x6] */
    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w1(this, 2));
        this.simpleActionBar.setTitle(this.c);
        l0();
        cu0 cu0Var = new cu0(context, null);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, cu0Var, getResourceProvider());
        this.fragmentView = cu0Var;
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        l7 l7Var = new l7(this, new b(this, 9), new g7(this), new a3.l(this, 22), 0);
        this.f = l7Var;
        final int i7 = 0;
        l7Var.g3.r = false;
        l7Var.setSpanCount(3);
        final int i10 = 1;
        this.f.j(new v1(this, i10));
        cu0Var.addView(this.f, na.e(-1, -1, ks.E1));
        v2 v2Var = new v2(context, new View.OnClickListener(this) { // from class: bi.x6
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        a8 a8Var = this.b.d;
                        a8Var.k.clear();
                        a8Var.j.clear();
                        a8Var.l.clear();
                        a8Var.m();
                        break;
                    default:
                        m8 m8Var = this.b;
                        a8 a8Var2 = m8Var.d;
                        HashSet hashSet = a8Var2.k;
                        HashSet hashSet2 = a8Var2.l;
                        HashSet hashSet3 = a8Var2.j;
                        boolean z10 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z11 = a8Var2.r;
                            boolean z12 = a8Var2.s;
                            boolean z13 = a8Var2.t;
                            a8Var2.j();
                            boolean z14 = (z11 == a8Var2.r && z12 == a8Var2.s && z13 == a8Var2.t) ? false : true;
                            a8Var2.r = z11;
                            a8Var2.s = z12;
                            a8Var2.t = z13;
                            if (!z14) {
                                z10 = true;
                            }
                        }
                        a8Var2.k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z10) {
                            a8Var2.r = a8Var2.g();
                            a8Var2.s = a8Var2.h();
                            a8Var2.t = a8Var2.f();
                        } else {
                            a8Var2.j();
                        }
                        lp lpVar = m8Var.P;
                        if (lpVar != null) {
                            lpVar.a(a8Var2.k(), true);
                        }
                        a8Var2.m();
                        break;
                }
            }
        }, this.resourceProvider);
        this.w = v2Var;
        this.x = false;
        v2Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        cu0Var.addView(this.w, na.e(-1, -1, ks.E1));
        a8 a8Var = this.d;
        if (a8Var.d.isEmpty() && !a8Var.y && a8Var.z) {
            j0(true);
        }
        View view = new View(context);
        this.h = view;
        cu0Var.addView(view, na.e(-1, 0, 48));
        baseSimpleGlass.f(cu0Var, this.f, this.simpleActionBar, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.c;
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        o7 o7Var = new o7(this.currentAccount, context, this.resourceProvider);
        fh.g c10 = cVar.c(o7Var, null, false);
        c10.p(c8.j0.m(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        o7Var.setBackground(c10);
        sa.a(o7Var);
        o7Var.setOnClickListener(new ai.p2(5, this, o7Var));
        o7Var.setOnWidthChanged(new w6(this, i10));
        this.simpleActionBar.addView(o7Var, na.e(-2, 58, 5));
        this.N = c8.j0.m(this.resourceProvider);
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
        cu0Var.addView(this.y, na.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final lp lpVar = new lp(24, context, this.resourceProvider);
        this.P = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.j7, org.telegram.ui.ActionBar.n6.k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(a8Var.k(), false);
        lpVar.setDrawBackgroundAsArc(10);
        lpVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        lpVar.setScaleX(0.8f);
        lpVar.setScaleY(0.8f);
        linearLayout2.addView(lpVar, na.r(26, 26, 16));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, this.resourceProvider);
        i5.c.r(14.0f, 1, 2131749437, textView, null);
        linearLayout2.addView(textView, na.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(i11));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, r12, r12));
        this.T = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.j0.m(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: bi.y6
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                final int i12 = 1;
                final int i13 = 0;
                switch (i10) {
                    case 0:
                        final m8 m8Var = this.b;
                        a8 a8Var2 = m8Var.d;
                        if (m8Var.Q) {
                            x60 I = x60.I(m8Var, m8Var.F);
                            I.c(R.drawable.menu_sort_value, gd.N0(2131745943, null), new Runnable() { // from class: bi.e7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            m8Var.d.p(z7.a);
                                            break;
                                        case 1:
                                            m8Var.d.p(z7.b);
                                            break;
                                        default:
                                            m8Var.d.p(z7.c);
                                            break;
                                    }
                                }
                            }, false);
                            I.c(R.drawable.menu_sort_date, gd.N0(2131745947, null), new Runnable() { // from class: bi.e7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            m8Var.d.p(z7.a);
                                            break;
                                        case 1:
                                            m8Var.d.p(z7.b);
                                            break;
                                        default:
                                            m8Var.d.p(z7.c);
                                            break;
                                    }
                                }
                            }, false);
                            final int i14 = 2;
                            I.c(R.drawable.menu_sort_number, gd.N0(2131745945, null), new Runnable() { // from class: bi.e7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            m8Var.d.p(z7.a);
                                            break;
                                        case 1:
                                            m8Var.d.p(z7.b);
                                            break;
                                        default:
                                            m8Var.d.p(z7.c);
                                            break;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.j jVar = new ai.j(m8Var, I, lpVar, y0VarArr, 4);
                            if (a8Var2.h()) {
                                I.i(new Runnable() { // from class: bi.f7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.r, !a8Var3.s, a8Var3.t);
                                                jVar.run();
                                                break;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.r, a8Var4.s, a8Var4.t);
                                                jVar.run();
                                                break;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.r, a8Var5.s, !a8Var5.t);
                                                jVar.run();
                                                break;
                                        }
                                    }
                                }, gd.N0(2131749439, null), a8Var2.s);
                                y0VarArr[2] = I.z();
                            }
                            if (a8Var2.g()) {
                                I.i(new Runnable() { // from class: bi.f7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.r, !a8Var3.s, a8Var3.t);
                                                jVar.run();
                                                break;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.r, a8Var4.s, a8Var4.t);
                                                jVar.run();
                                                break;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.r, a8Var5.s, !a8Var5.t);
                                                jVar.run();
                                                break;
                                        }
                                    }
                                }, gd.N0(2131749441, null), a8Var2.r);
                                y0VarArr[1] = I.z();
                            }
                            if (a8Var2.f()) {
                                I.i(new Runnable() { // from class: bi.f7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.r, !a8Var3.s, a8Var3.t);
                                                jVar.run();
                                                break;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.r, a8Var4.s, a8Var4.t);
                                                jVar.run();
                                                break;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.r, a8Var5.s, !a8Var5.t);
                                                jVar.run();
                                                break;
                                        }
                                    }
                                }, gd.N0(2131749438, null), a8Var2.t);
                                y0VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m8Var.i0(m8Var.F, I);
                            break;
                        }
                        break;
                    default:
                        a8 a8Var3 = this.b.d;
                        if (a8Var3 != null) {
                            if (a8Var3.k()) {
                                a8Var3.o(true, true, true);
                            } else {
                                a8Var3.o(true, false, false);
                            }
                            lpVar.a(a8Var3.k(), true);
                            break;
                        }
                        break;
                }
            }
        });
        this.r.addView(linearLayout2, na.c(-1.0f, -2));
        sa.b(this.r, 0.04f, 1.5f);
        cu0Var.addView(this.r, na.e(-2, 56, 81));
        if (!a8Var.g() || (!a8Var.h() && !a8Var.f())) {
            this.r.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.j0.m(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        cu0Var.addView(this.n, na.e(-2, 60, 81));
        this.s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new kq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131749997, null));
        this.s.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.u6.U(this.s, i11, getResourceProvider());
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(i11));
        textView2.setBackground(org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.s.setGravity(17);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: bi.x6
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i7) {
                    case 0:
                        a8 a8Var2 = this.b.d;
                        a8Var2.k.clear();
                        a8Var2.j.clear();
                        a8Var2.l.clear();
                        a8Var2.m();
                        break;
                    default:
                        m8 m8Var = this.b;
                        a8 a8Var22 = m8Var.d;
                        HashSet hashSet = a8Var22.k;
                        HashSet hashSet2 = a8Var22.l;
                        HashSet hashSet3 = a8Var22.j;
                        boolean z10 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z11 = a8Var22.r;
                            boolean z12 = a8Var22.s;
                            boolean z13 = a8Var22.t;
                            a8Var22.j();
                            boolean z14 = (z11 == a8Var22.r && z12 == a8Var22.s && z13 == a8Var22.t) ? false : true;
                            a8Var22.r = z11;
                            a8Var22.s = z12;
                            a8Var22.t = z13;
                            if (!z14) {
                                z10 = true;
                            }
                        }
                        a8Var22.k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z10) {
                            a8Var22.r = a8Var22.g();
                            a8Var22.s = a8Var22.h();
                            a8Var22.t = a8Var22.f();
                        } else {
                            a8Var22.j();
                        }
                        lp lpVar2 = m8Var.P;
                        if (lpVar2 != null) {
                            lpVar2.a(a8Var22.k(), true);
                        }
                        a8Var22.m();
                        break;
                }
            }
        });
        this.n.addView(this.s, na.c(-1.0f, -2));
        this.n.setVisibility(8);
        sa.b(this.n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        r7 r7Var = new r7(context, this.resourceProvider, true);
        this.F = r7Var;
        r7Var.setSorting(a8Var.p);
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: bi.y6
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view42) {
                final int i12 = 1;
                final int i13 = 0;
                switch (i7) {
                    case 0:
                        final m8 m8Var = this.b;
                        a8 a8Var2 = m8Var.d;
                        if (m8Var.Q) {
                            x60 I = x60.I(m8Var, m8Var.F);
                            I.c(R.drawable.menu_sort_value, gd.N0(2131745943, null), new Runnable() { // from class: bi.e7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            m8Var.d.p(z7.a);
                                            break;
                                        case 1:
                                            m8Var.d.p(z7.b);
                                            break;
                                        default:
                                            m8Var.d.p(z7.c);
                                            break;
                                    }
                                }
                            }, false);
                            I.c(R.drawable.menu_sort_date, gd.N0(2131745947, null), new Runnable() { // from class: bi.e7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            m8Var.d.p(z7.a);
                                            break;
                                        case 1:
                                            m8Var.d.p(z7.b);
                                            break;
                                        default:
                                            m8Var.d.p(z7.c);
                                            break;
                                    }
                                }
                            }, false);
                            final int i14 = 2;
                            I.c(R.drawable.menu_sort_number, gd.N0(2131745945, null), new Runnable() { // from class: bi.e7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            m8Var.d.p(z7.a);
                                            break;
                                        case 1:
                                            m8Var.d.p(z7.b);
                                            break;
                                        default:
                                            m8Var.d.p(z7.c);
                                            break;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.j jVar = new ai.j(m8Var, I, lpVar, y0VarArr, 4);
                            if (a8Var2.h()) {
                                I.i(new Runnable() { // from class: bi.f7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.r, !a8Var3.s, a8Var3.t);
                                                jVar.run();
                                                break;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.r, a8Var4.s, a8Var4.t);
                                                jVar.run();
                                                break;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.r, a8Var5.s, !a8Var5.t);
                                                jVar.run();
                                                break;
                                        }
                                    }
                                }, gd.N0(2131749439, null), a8Var2.s);
                                y0VarArr[2] = I.z();
                            }
                            if (a8Var2.g()) {
                                I.i(new Runnable() { // from class: bi.f7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.r, !a8Var3.s, a8Var3.t);
                                                jVar.run();
                                                break;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.r, a8Var4.s, a8Var4.t);
                                                jVar.run();
                                                break;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.r, a8Var5.s, !a8Var5.t);
                                                jVar.run();
                                                break;
                                        }
                                    }
                                }, gd.N0(2131749441, null), a8Var2.r);
                                y0VarArr[1] = I.z();
                            }
                            if (a8Var2.f()) {
                                I.i(new Runnable() { // from class: bi.f7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.r, !a8Var3.s, a8Var3.t);
                                                jVar.run();
                                                break;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.r, a8Var4.s, a8Var4.t);
                                                jVar.run();
                                                break;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.r, a8Var5.s, !a8Var5.t);
                                                jVar.run();
                                                break;
                                        }
                                    }
                                }, gd.N0(2131749438, null), a8Var2.t);
                                y0VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m8Var.i0(m8Var.F, I);
                            break;
                        }
                        break;
                    default:
                        a8 a8Var3 = this.b.d;
                        if (a8Var3 != null) {
                            if (a8Var3.k()) {
                                a8Var3.o(true, true, true);
                            } else {
                                a8Var3.o(true, false, false);
                            }
                            lpVar.a(a8Var3.k(), true);
                            break;
                        }
                        break;
                }
            }
        });
        r7 r7Var2 = new r7(context, this.resourceProvider, true);
        this.G = r7Var2;
        r7Var2.setValue(gd.N0(2131750370, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z6
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i7) {
                    case 0:
                        m8.Z(this.b, context);
                        break;
                    case 1:
                        m8.a0(this.b, context);
                        break;
                    default:
                        m8.b0(this.b, context);
                        break;
                }
            }
        });
        r7 r7Var3 = new r7(context, this.resourceProvider, true);
        this.H = r7Var3;
        r7Var3.setValue(gd.N0(2131750371, null));
        g0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z6
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i10) {
                    case 0:
                        m8.Z(this.b, context);
                        break;
                    case 1:
                        m8.a0(this.b, context);
                        break;
                    default:
                        m8.b0(this.b, context);
                        break;
                }
            }
        });
        r7 r7Var4 = new r7(context, this.resourceProvider, true);
        this.I = r7Var4;
        r7Var4.setValue(gd.N0(2131750363, null));
        g0(this.I, true);
        final int i12 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z6
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i12) {
                    case 0:
                        m8.Z(this.b, context);
                        break;
                    case 1:
                        m8.a0(this.b, context);
                        break;
                    default:
                        m8.b0(this.b, context);
                        break;
                }
            }
        });
        tz tzVar = new tz(getParentActivity());
        this.J = tzVar;
        cu0Var.addView(tzVar, na.c(-1.0f, -1));
        h0(false, false);
        return cu0Var;
    }

    public final void g0(r7 r7Var, boolean z10) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        fh.g c10 = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c10.p(this.N);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(r7Var, na.c(40.0f, -2));
        frameLayout.setOnClickListener(new ah.d(r7Var, 7));
        sa.a(frameLayout);
        this.E.addView(frameLayout, na.t(-2, -2, 16, 0, 0, z10 ? 0 : -4, 0));
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
        this.R.setInterpolator(kr.h);
        this.R.setDuration(420L);
        this.R.start();
    }

    public final void i0(r7 r7Var, x60 x60Var) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.k5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay == null || !(x60Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) || !(r7Var.getParent() instanceof FrameLayout)) {
            x60Var.a0();
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) x60Var.A;
        FrameLayout frameLayout2 = (FrameLayout) r7Var.getParent();
        s7 s7Var = this.O;
        if (s7Var.a && (frameLayout = (FrameLayout) s7Var.b) != null && frameLayout != frameLayout2) {
            frameLayout.setVisibility(0);
        }
        s7Var.b = frameLayout2;
        s7Var.c = r7Var;
        s7Var.d = simpleMenuOverlay;
        x60Var.p = new h7(simpleMenuOverlay, 0);
        simpleMenuOverlay.setOnClosed(new i7(actionBarPopupWindow$ActionBarPopupWindowLayout, 0));
        simpleMenuOverlay.d(s7Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return (getLastStoryViewer() == null || getLastStoryViewer().H0) && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.n6.a7)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        v2 v2Var = this.w;
        if (v2Var == null || this.x == z10) {
            return;
        }
        this.x = z10;
        v2Var.setVisibility(0);
        this.w.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.95f).scaleY(z10 ? 1.0f : 0.95f).setInterpolator(kr.h).setDuration(320L).setListener(new j7(0, this, z10)).start();
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
        z4Var.setSubtitle(i7 <= 0 ? gd.N0(2131749990, null) : gd.H(',', "Gift2ListingsCount", i7));
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
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
            if (r12 != this.S) {
                this.S = r12;
                TextView textView = this.s;
                if (textView != null) {
                    org.telegram.ui.ActionBar.n6.H1(textView.getBackground(), r12, true);
                }
                LinearLayout linearLayout = this.T;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.n6.H1(linearLayout.getBackground(), r12, true);
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
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
