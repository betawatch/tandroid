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
import c8.ja;
import c8.na;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class a6 extends org.telegram.ui.ActionBar.e2 implements te.b {
    public LinearLayout E;
    public f5 F;
    public f5 G;
    public f5 H;
    public f5 I;
    public nz J;
    public int K;
    public int L;
    public float M;
    public gh.e N;
    public final g5 O;
    public boolean P;
    public ValueAnimator Q;
    public int R;
    public LinearLayout S;
    public final te.a a;
    public final long b;
    public final String c;
    public final o5 d;
    public z10 e;
    public y4 f;
    public View h;
    public FrameLayout n;
    public FrameLayout r;
    public TextView s;
    public v1 w;
    public boolean x;
    public HorizontalScrollView y;

    public a6(long j3, String str, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        this.a = new te.a(0, this, er.h, 380L, false);
        g5 g5Var = new g5();
        g5Var.e = this;
        this.O = g5Var;
        this.P = true;
        this.b = j3;
        this.c = str;
        this.resourceProvider = e6Var;
        o5 o5Var = new o5(this.currentAccount, j10, new j4(this, 0));
        this.d = o5Var;
        o5Var.g(false);
    }

    public static void Z(a6 a6Var, Context context) {
        o5 o5Var = a6Var.d;
        if (a6Var.P && !o5Var.g.isEmpty()) {
            m60 m60Var = new m60(a6Var, a6Var.H, false, false);
            m60Var.t = false;
            int i7 = 1;
            m60Var.Y = true;
            m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            m60Var.R = true;
            int i10 = 2;
            m60Var.p = new u3(m60Var, i10);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(o5Var.g);
            Collections.sort(arrayList, new n4(a6Var, i7));
            y4 y4Var = new y4(a6Var, new o4(a6Var, strArr, arrayList, i7), new p4(a6Var, m60Var, i7), null, 2);
            y4Var.g3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, a6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ft ftVar = new ft(context, a6Var.resourceProvider);
            ftVar.setTextSize(1, 16.0f);
            ftVar.setInputType(573441);
            ftVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, a6Var.resourceProvider);
            org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, a6Var.resourceProvider);
            ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            ftVar.setCursorWidth(1.5f);
            ftVar.setHint(hd.M0(2131750009, null));
            org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, a6Var.resourceProvider);
            ftVar.setBackground(null);
            frameLayout.addView(ftVar, ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ftVar.addTextChangedListener(new v(strArr, y4Var, false, i10));
            if (arrayList.size() > 8) {
                m60Var.r(frameLayout, ja.o(-1, 44));
                m60Var.k();
            }
            if (!o5Var.k.isEmpty()) {
                m60Var.c(R.drawable.msg_select, hd.M0(2131745670, null), new q4(a6Var, i7), false);
            }
            m60Var.q(y4Var);
            a6Var.i0(a6Var.H, m60Var);
        }
    }

    public static void a0(a6 a6Var, Context context) {
        o5 o5Var = a6Var.d;
        if (a6Var.P && !o5Var.h.isEmpty()) {
            m60 m60Var = new m60(a6Var, a6Var.I, false, false);
            m60Var.t = false;
            m60Var.Y = true;
            m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            m60Var.R = true;
            int i7 = 3;
            m60Var.p = new u3(m60Var, i7);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(o5Var.h);
            int i10 = 2;
            Collections.sort(arrayList, new n4(a6Var, i10));
            y4 y4Var = new y4(a6Var, new o4(a6Var, strArr, arrayList, i10), new p4(a6Var, m60Var, i10), null, 3);
            y4Var.g3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, a6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ft ftVar = new ft(context, a6Var.resourceProvider);
            ftVar.setTextSize(1, 16.0f);
            ftVar.setInputType(573441);
            ftVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, a6Var.resourceProvider);
            org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, a6Var.resourceProvider);
            ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            ftVar.setCursorWidth(1.5f);
            ftVar.setHint(hd.M0(2131750009, null));
            org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, a6Var.resourceProvider);
            ftVar.setBackground(null);
            frameLayout.addView(ftVar, ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ftVar.addTextChangedListener(new v(strArr, y4Var, false, i7));
            if (arrayList.size() > 8) {
                m60Var.r(frameLayout, ja.o(-1, 44));
                m60Var.k();
            }
            if (!o5Var.l.isEmpty()) {
                m60Var.c(R.drawable.msg_select, hd.M0(2131745670, null), new q4(a6Var, 5), false);
            }
            m60Var.q(y4Var);
            a6Var.i0(a6Var.I, m60Var);
        }
    }

    public static void b0(a6 a6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == m10.i(a6Var.currentAccount).e()) {
            a6Var.d.d.remove(tL_starGiftUnique);
            a6Var.k0(false);
            if (j3 == m10.i(a6Var.currentAccount).e()) {
                cc a02 = cc.a0(a6Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = hd.M0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                xb O = a02.O(document, M0, hd.a0(null, null, 2131752888, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                xb O2 = cc.a0(a6Var).O(tL_starGiftUnique.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(a6Var.currentAccount, j3)));
                O2.r = false;
                O2.j();
            }
            a6Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        w4 w4Var = new w4(bundle, tL_starGiftUnique, j3);
        org.telegram.ui.ActionBar.o4 o4Var = a6Var.parentLayout;
        if (o4Var == null || !((ActionBarLayout) o4Var).b) {
            a6Var.presentFragment(w4Var, true, z10);
        } else {
            Dialog dialog = a6Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.u2) && z10) {
                ((org.telegram.ui.ActionBar.u2) dialog).O0 = true;
            }
            a6Var.finishFragment();
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(w4Var, false, z10);
            }
        }
        z10 z10Var = a6Var.e;
        if (z10Var != null) {
            z10Var.a(Boolean.valueOf(z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d0(a6 a6Var, Context context) {
        o5 o5Var = a6Var.d;
        if (a6Var.P && !o5Var.f.isEmpty()) {
            Object[] objArr = 0;
            m60 m60Var = new m60(a6Var, a6Var.G, false, false);
            m60Var.t = false;
            int i7 = 1;
            m60Var.Y = true;
            m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            m60Var.R = true;
            m60Var.p = new u3(m60Var, i7);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(o5Var.f);
            Collections.sort(arrayList, new n4(a6Var, 0));
            y4 y4Var = new y4(a6Var, new o4(a6Var, strArr, arrayList, 0 == true ? 1 : 0), new p4(a6Var, m60Var, 0 == true ? 1 : 0), null, 1);
            y4Var.g3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, a6Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ft ftVar = new ft(context, a6Var.resourceProvider);
            ftVar.setTextSize(1, 16.0f);
            ftVar.setInputType(573441);
            ftVar.setRawInputType(573441);
            org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, a6Var.resourceProvider);
            org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, a6Var.resourceProvider);
            ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            ftVar.setCursorWidth(1.5f);
            ftVar.setHint(hd.M0(2131750009, null));
            org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, a6Var.resourceProvider);
            ftVar.setBackground(null);
            frameLayout.addView(ftVar, ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ftVar.addTextChangedListener(new v(strArr, y4Var, 0 == true ? 1 : 0, i7));
            if (arrayList.size() > 8) {
                m60Var.r(frameLayout, ja.o(-1, 44));
                m60Var.k();
            }
            if (!o5Var.j.isEmpty()) {
                m60Var.c(R.drawable.msg_select, hd.M0(2131745670, null), new q4(a6Var, objArr == true ? 1 : 0), false);
            }
            m60Var.q(y4Var);
            a6Var.i0(a6Var.G, m60Var);
        }
    }

    public static void e0(a6 a6Var, b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            di.c6 c6Var = new di.c6(a6Var.getParentActivity(), a6Var.currentAccount, a6Var.b, a6Var.resourceProvider, null);
            c6Var.i2(tL_starGiftUnique.slug, tL_starGiftUnique, a6Var.d);
            c6Var.N2 = new s4(a6Var);
            a6Var.showDialog(c6Var);
        }
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            t00.d(this.n, f10);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [bi.k4] */
    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i7 = 0;
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, i7));
        this.simpleActionBar.setTitle(this.c);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        o5 o5Var = this.d;
        if (w4Var != null) {
            int i10 = o5Var.e;
            w4Var.setSubtitle(i10 <= 0 ? hd.M0(2131750007, null) : hd.H(',', "Gift2ListingsCount", i10));
        }
        st0 st0Var = new st0(context, null);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, st0Var, getResourceProvider());
        this.fragmentView = st0Var;
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        y4 y4Var = new y4(this, new b(this, 7), new s4(this), new a3.l(this, 21), 0);
        this.f = y4Var;
        y4Var.g3.r = false;
        y4Var.setSpanCount(3);
        this.f.j(new z4(this, i7));
        st0Var.addView(this.f, ja.e(-1, -1, ns.E1));
        final int i11 = 1;
        v1 v1Var = new v1(context, new View.OnClickListener(this) { // from class: bi.k4
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o5 o5Var2 = this.b.d;
                        o5Var2.k.clear();
                        o5Var2.j.clear();
                        o5Var2.l.clear();
                        o5Var2.h();
                        break;
                    default:
                        o5 o5Var3 = this.b.d;
                        o5Var3.k.clear();
                        o5Var3.j.clear();
                        o5Var3.l.clear();
                        o5Var3.h();
                        break;
                }
            }
        }, this.resourceProvider);
        this.w = v1Var;
        this.x = false;
        v1Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        st0Var.addView(this.w, ja.e(-1, -1, ns.E1));
        View view = new View(context);
        this.h = view;
        st0Var.addView(view, ja.e(-1, 0, 48));
        baseSimpleGlass.f(st0Var, this.f, this.simpleActionBar, this.resourceProvider);
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        c5 c5Var = new c5(this.currentAccount, context, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.c;
        fh.g c10 = cVar.c(c5Var, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c5Var.setBackground(c10);
        na.a(c5Var);
        c5Var.setOnClickListener(new ai.t2(3, this, c5Var));
        c5Var.setOnWidthChanged(new j4(this, i11));
        this.simpleActionBar.addView(c5Var, ja.e(-2, 58, 5));
        this.N = c8.g0.l(this.resourceProvider);
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
        st0Var.addView(this.y, ja.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final fp fpVar = new fp(24, context, this.resourceProvider);
        fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        fpVar.setDrawUnchecked(true);
        fpVar.a(false, false);
        fpVar.setDrawBackgroundAsArc(10);
        fpVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        fpVar.setScaleX(0.8f);
        fpVar.setScaleY(0.8f);
        linearLayout2.addView(fpVar, ja.r(26, 26, 16));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, this.resourceProvider);
        i5.c.w(textView, 1, 14.0f, null, 2131749613);
        linearLayout2.addView(textView, ja.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(i12));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, r12, r12));
        this.S = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.g0.l(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: bi.l4
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i13 = i11;
                final fp fpVar2 = fpVar;
                final a6 a6Var = this.b;
                final int i14 = 1;
                switch (i13) {
                    case 0:
                        o5 o5Var2 = a6Var.d;
                        if (a6Var.P) {
                            m60 H = m60.H(a6Var, a6Var.F);
                            final int i15 = 0;
                            H.c(R.drawable.menu_sort_value, hd.M0(2131746139, null), new q4(a6Var, 2), false);
                            H.c(R.drawable.menu_sort_date, hd.M0(2131746143, null), new q4(a6Var, 3), false);
                            H.c(R.drawable.menu_sort_number, hd.M0(2131746141, null), new q4(a6Var, 4), false);
                            H.k();
                            H.i(new Runnable() { // from class: bi.r4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            o5 o5Var3 = a6Var.d;
                                            if (o5Var3.r) {
                                                o5Var3.r = false;
                                                fpVar2.a(false, true);
                                                o5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            o5 o5Var4 = a6Var.d;
                                            if (!o5Var4.r) {
                                                o5Var4.r = true;
                                                fpVar2.a(true, true);
                                                o5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, hd.M0(2131749615, null), !o5Var2.r);
                            H.i(new Runnable() { // from class: bi.r4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            o5 o5Var3 = a6Var.d;
                                            if (o5Var3.r) {
                                                o5Var3.r = false;
                                                fpVar2.a(false, true);
                                                o5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            o5 o5Var4 = a6Var.d;
                                            if (!o5Var4.r) {
                                                o5Var4.r = true;
                                                fpVar2.a(true, true);
                                                o5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, hd.M0(2131749614, null), o5Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a6Var.i0(a6Var.F, H);
                            break;
                        }
                        break;
                    default:
                        o5 o5Var3 = a6Var.d;
                        if (o5Var3 != null) {
                            boolean z10 = !o5Var3.r;
                            o5Var3.r = z10;
                            fpVar2.a(z10, true);
                            o5Var3.h();
                            break;
                        }
                        break;
                }
            }
        });
        this.r.addView(linearLayout2, ja.c(-1.0f, -2));
        na.b(this.r, 0.04f, 1.5f);
        st0Var.addView(this.r, ja.e(-2, 56, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.g0.l(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        st0Var.addView(this.n, ja.e(-2, 60, 81));
        this.s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new eq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131750014, null));
        this.s.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.q6.U(this.s, i12, getResourceProvider());
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(i12));
        textView2.setBackground(org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.s.setGravity(17);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: bi.k4
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i7) {
                    case 0:
                        o5 o5Var2 = this.b.d;
                        o5Var2.k.clear();
                        o5Var2.j.clear();
                        o5Var2.l.clear();
                        o5Var2.h();
                        break;
                    default:
                        o5 o5Var3 = this.b.d;
                        o5Var3.k.clear();
                        o5Var3.j.clear();
                        o5Var3.l.clear();
                        o5Var3.h();
                        break;
                }
            }
        });
        this.n.addView(this.s, ja.c(-1.0f, -2));
        this.n.setVisibility(8);
        na.b(this.n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        f5 f5Var = new f5(context, this.resourceProvider, true);
        this.F = f5Var;
        f5Var.setSorting(o5Var.p);
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: bi.l4
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view42) {
                int i13 = i7;
                final fp fpVar2 = fpVar;
                final a6 a6Var = this.b;
                final int i14 = 1;
                switch (i13) {
                    case 0:
                        o5 o5Var2 = a6Var.d;
                        if (a6Var.P) {
                            m60 H = m60.H(a6Var, a6Var.F);
                            final int i15 = 0;
                            H.c(R.drawable.menu_sort_value, hd.M0(2131746139, null), new q4(a6Var, 2), false);
                            H.c(R.drawable.menu_sort_date, hd.M0(2131746143, null), new q4(a6Var, 3), false);
                            H.c(R.drawable.menu_sort_number, hd.M0(2131746141, null), new q4(a6Var, 4), false);
                            H.k();
                            H.i(new Runnable() { // from class: bi.r4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            o5 o5Var3 = a6Var.d;
                                            if (o5Var3.r) {
                                                o5Var3.r = false;
                                                fpVar2.a(false, true);
                                                o5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            o5 o5Var4 = a6Var.d;
                                            if (!o5Var4.r) {
                                                o5Var4.r = true;
                                                fpVar2.a(true, true);
                                                o5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, hd.M0(2131749615, null), !o5Var2.r);
                            H.i(new Runnable() { // from class: bi.r4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            o5 o5Var3 = a6Var.d;
                                            if (o5Var3.r) {
                                                o5Var3.r = false;
                                                fpVar2.a(false, true);
                                                o5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            o5 o5Var4 = a6Var.d;
                                            if (!o5Var4.r) {
                                                o5Var4.r = true;
                                                fpVar2.a(true, true);
                                                o5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, hd.M0(2131749614, null), o5Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a6Var.i0(a6Var.F, H);
                            break;
                        }
                        break;
                    default:
                        o5 o5Var3 = a6Var.d;
                        if (o5Var3 != null) {
                            boolean z10 = !o5Var3.r;
                            o5Var3.r = z10;
                            fpVar2.a(z10, true);
                            o5Var3.h();
                            break;
                        }
                        break;
                }
            }
        });
        f5 f5Var2 = new f5(context, this.resourceProvider, true);
        this.G = f5Var2;
        f5Var2.setValue(hd.M0(2131750387, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: bi.m4
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i7) {
                    case 0:
                        a6.d0(this.b, context);
                        break;
                    case 1:
                        a6.Z(this.b, context);
                        break;
                    default:
                        a6.a0(this.b, context);
                        break;
                }
            }
        });
        f5 f5Var3 = new f5(context, this.resourceProvider, true);
        this.H = f5Var3;
        f5Var3.setValue(hd.M0(2131750388, null));
        g0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: bi.m4
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i11) {
                    case 0:
                        a6.d0(this.b, context);
                        break;
                    case 1:
                        a6.Z(this.b, context);
                        break;
                    default:
                        a6.a0(this.b, context);
                        break;
                }
            }
        });
        f5 f5Var4 = new f5(context, this.resourceProvider, true);
        this.I = f5Var4;
        f5Var4.setValue(hd.M0(2131750380, null));
        g0(this.I, true);
        final int i13 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: bi.m4
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i13) {
                    case 0:
                        a6.d0(this.b, context);
                        break;
                    case 1:
                        a6.Z(this.b, context);
                        break;
                    default:
                        a6.a0(this.b, context);
                        break;
                }
            }
        });
        nz nzVar = new nz(getParentActivity());
        this.J = nzVar;
        st0Var.addView(nzVar, ja.c(-1.0f, -1));
        h0(false, false);
        return st0Var;
    }

    public final void g0(f5 f5Var, boolean z10) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        fh.g c10 = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c10.p(this.N);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(f5Var, ja.c(40.0f, -2));
        frameLayout.setOnClickListener(new ah.d(f5Var, 7));
        na.a(frameLayout);
        this.E.addView(frameLayout, ja.t(-2, -2, 16, 0, 0, z10 ? 0 : -4, 0));
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        float f10 = z10 ? 0.0f : 1.0f;
        if (!z11) {
            this.M = f10;
            j0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f10);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 1));
        this.Q.setInterpolator(er.h);
        this.Q.setDuration(420L);
        this.Q.start();
    }

    public final void i0(f5 f5Var, m60 m60Var) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.g5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay == null || !(m60Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) || !(f5Var.getParent() instanceof FrameLayout)) {
            m60Var.Z();
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) m60Var.A;
        FrameLayout frameLayout2 = (FrameLayout) f5Var.getParent();
        g5 g5Var = this.O;
        if (g5Var.a && (frameLayout = (FrameLayout) g5Var.b) != null && frameLayout != frameLayout2) {
            frameLayout.setVisibility(0);
        }
        g5Var.b = frameLayout2;
        g5Var.c = f5Var;
        g5Var.d = simpleMenuOverlay;
        m60Var.p = new t4(simpleMenuOverlay, 0);
        simpleMenuOverlay.setOnClosed(new u4(actionBarPopupWindow$ActionBarPopupWindowLayout, 0));
        simpleMenuOverlay.d(g5Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return (getLastStoryViewer() == null || getLastStoryViewer().H0) && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.j6.a7)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
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

    public final void k0(boolean z10) {
        p41 p41Var;
        o5 o5Var = this.d;
        int i7 = o5Var.e;
        HashSet hashSet = o5Var.l;
        ArrayList arrayList = o5Var.h;
        HashSet hashSet2 = o5Var.k;
        ArrayList arrayList2 = o5Var.g;
        HashSet hashSet3 = o5Var.j;
        ArrayList arrayList3 = o5Var.f;
        if (i7 > 12) {
            h0(true, true);
        }
        y4 y4Var = this.f;
        boolean z11 = false;
        if (y4Var != null && (p41Var = y4Var.g3) != null) {
            p41Var.O(true);
            if (z10) {
                this.f.v0(0);
            }
        }
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            int i10 = o5Var.e;
            w4Var.setSubtitle(i10 <= 0 ? hd.M0(2131750007, null) : hd.H(',', "Gift2ListingsCount", i10));
        }
        f5 f5Var = this.F;
        if (f5Var != null) {
            f5Var.setSorting(o5Var.p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            this.G.setValue((size <= 0 || size == arrayList3.size()) ? hd.M0(2131750023, null) : hd.H(',', "Gift2ResaleFilterModels", size));
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            this.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? hd.M0(2131750027, null) : hd.H(',', "Gift2ResaleFilterBackdrops", size2));
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            this.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? hd.M0(2131750019, null) : hd.H(',', "Gift2ResaleFilterSymbols", size3));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f.getChildCount()) {
                break;
            }
            if (this.f.getChildAt(i11) instanceof pz) {
                o5Var.g(false);
                break;
            }
            i11++;
        }
        if ((o5Var.t || o5Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.a.a(z11, true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null && w4Var.getOccupyStatusBar()) {
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
        org.telegram.messenger.g0.A3(this.f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.L) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.A3(this.w, 0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.n.getLayoutParams()).bottomMargin = this.L;
        this.r.requestLayout();
        this.n.requestLayout();
        j0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
            if (r12 != this.R) {
                this.R = r12;
                TextView textView = this.s;
                if (textView != null) {
                    org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), r12, true);
                }
                LinearLayout linearLayout = this.S;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.j6.H1(linearLayout.getBackground(), r12, true);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
