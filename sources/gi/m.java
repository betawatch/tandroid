package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.d0;
import bi.h7;
import bi.l8;
import bi.s;
import c8.ma;
import di.v6;
import fi.a6;
import fi.d4;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.d61;
import v4.z;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class m extends FrameLayout {
    public static final /* synthetic */ int b0 = 0;
    public final nv0 E;
    public final j F;
    public final hi.e G;
    public final z H;
    public boolean I;
    public boolean J;
    public final ah.a K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public final Rect W;
    public a6 a;
    public final /* synthetic */ fq0 a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final e f;
    public final f51 h;
    public final v4.k n;
    public final cs0 r;
    public final g s;
    public final h w;
    public final l x;
    public final i y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fq0 fq0Var, Context context) {
        super(context);
        this.a0 = fq0Var;
        this.d = Utilities.j(bz.u1, 6, 2);
        this.e = Utilities.j(bz.u1, 6, 2);
        int i7 = 0;
        this.I = false;
        this.J = false;
        this.W = new Rect();
        f51 f51Var = new f51();
        this.h = f51Var;
        int i10 = 1;
        f51Var.O = new d(this, i10);
        f51Var.y1(this.d);
        v4.k kVar = new v4.k();
        this.n = kVar;
        kVar.n(280L);
        kVar.o(nr.h);
        kVar.m = false;
        e eVar = new e(this, context);
        this.f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(f51Var);
        addView(eVar, ma.c(-1.0f, -1));
        eVar.i(new f(this, i7));
        eVar.setOnItemClickListener(new l8(this, 7));
        eVar.setOnItemLongClickListener(new v6(this, 15));
        cs0 cs0Var = new cs0(context, null);
        this.r = cs0Var;
        g gVar = new g(i7, this);
        this.s = gVar;
        cs0Var.setLayoutManager(gVar);
        cs0Var.i(new f(this, i10));
        gVar.y1(this.e);
        cs0Var.setVisibility(8);
        addView(cs0Var, ma.c(-1.0f, -1));
        h hVar = new h(this, context);
        this.w = hVar;
        eVar.setAdapter(hVar);
        l lVar = new l(this, getContext());
        hVar.f = lVar;
        this.x = lVar;
        cs0Var.setAdapter(lVar);
        i iVar = new i(this, context);
        this.y = iVar;
        iVar.x = false;
        nv0 nv0Var = new nv0(context, iVar, 1, null);
        this.E = nv0Var;
        nv0Var.setVisibility(8);
        nv0Var.setAnimateLayoutChange(true);
        addView(nv0Var, ma.c(-1.0f, -1));
        nv0Var.setOnTouchListener(new a(i7));
        nv0Var.e(true, false);
        nv0Var.b.setVisibility(8);
        nv0Var.d.setText(gd.N0(2131746502, null));
        nv0Var.e.setText(gd.G(mp.u1(fq0Var.b).W5, "ProfileBotPreviewEmptyText", new Object[0]));
        String N0 = gd.N0(2131746506, null);
        hi.e eVar2 = nv0Var.f;
        eVar2.i(N0, false, true);
        eVar2.setVisibility(0);
        eVar2.setOnClickListener(new b(this, i7));
        j jVar = new j(this, context);
        this.F = jVar;
        int i11 = m6.y6;
        h6 h6Var = fq0Var.c;
        t6.U(jVar, i11, h6Var);
        jVar.setText(gd.N0(2131746507, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ma.t(ks.v2, -2, 17, 0, 17, 0, 12);
        d61 d61Var = nv0Var.a;
        d61Var.addView(jVar, t6);
        hi.e eVar3 = new hi.e(context, h6Var, false);
        this.G = eVar3;
        eVar3.setMinWidth(g0.L(200.0f));
        d61Var.addView(eVar3, ma.r(-2, 44, 17));
        nv0Var.addView(iVar, 0, ma.c(-1.0f, -1));
        eVar.setEmptyView(nv0Var);
        eVar.X1 = true;
        eVar.Y1 = 0;
        new SparseArray();
        new HashMap();
        z zVar = new z(new c(this, i7));
        this.H = zVar;
        zVar.h(eVar);
        ah.a aVar = new ah.a(context, h6Var);
        this.K = aVar;
        addView(aVar, ma.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            cs0 cs0Var = this.r;
            e eVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    cs0Var.setVisibility(8);
                    eVar.invalidate();
                    return;
                }
                int i7 = 1;
                boolean z10 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new d4(this, i7));
                ofFloat.addListener(new h7(6, this, z10));
                ofFloat.setInterpolator(nr.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i10 = this.e;
            this.d = i10;
            this.a0.E = i10;
            bz.F(i10);
            h hVar = this.w;
            int b10 = hVar.b();
            cs0Var.setVisibility(8);
            int i11 = this.d;
            f51 f51Var = this.h;
            f51Var.y1(i11);
            eVar.a0();
            eVar.invalidate();
            if (hVar.b() == b10) {
                g0.Z3(eVar);
            } else {
                hVar.f();
            }
            int i12 = this.T;
            if (i12 >= 0) {
                View m10 = this.s.m(i12);
                if (m10 != null) {
                    this.U = m10.getTop();
                }
                f51Var.h1(this.T, (-eVar.getPaddingTop()) + this.U);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.b || this.a0.H.F1) {
            return;
        }
        int i7 = this.d + (!z10 ? 1 : -1);
        if (i7 > 6) {
            i7 = !z10 ? 9 : 6;
        }
        int j3 = Utilities.j(i7, 6, this.I ? 1 : 2);
        this.e = j3;
        if (j3 == this.d || this.I) {
            return;
        }
        cs0 cs0Var = this.r;
        cs0Var.setVisibility(0);
        cs0Var.setAdapter(this.x);
        cs0Var.setPadding(cs0Var.getPaddingLeft(), 0, cs0Var.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
        g gVar = this.s;
        gVar.y1(j3);
        cs0Var.a0();
        gVar.O = new d(this, 0);
        g0.Z3(this.f);
        this.b = true;
        this.c = 0.0f;
        int i10 = this.T;
        if (i10 >= 0) {
            gVar.h1(i10, this.U - cs0Var.getPaddingTop());
        }
    }

    public final void c() {
        String N0;
        int i7 = this.a0.b;
        a6 a6Var = this.a;
        int size = a6Var == null ? 0 : a6Var.i.size();
        a6 a6Var2 = this.a;
        int i10 = 1;
        boolean z10 = a6Var2 == null || TextUtils.isEmpty(a6Var2.E);
        int i11 = size > 0 ? 0 : 8;
        ah.a aVar = this.K;
        aVar.setVisibility(i11);
        String N02 = z10 ? gd.N0(2131746499, null) : gd.a0(null, null, 2131746498, b31.P0(this.a.E, null, null));
        String N03 = gd.N0(2131746521, null);
        int i12 = 26;
        f2.a aVar2 = new f2.a(this, i12);
        if (z10 || size <= 0) {
            N0 = gd.N0(z10 ? 2131746501 : 2131746500, null);
        } else {
            N0 = null;
        }
        ch.k kVar = (z10 || size <= 0) ? new ch.k(4, this, z10) : null;
        j jVar = (j) aVar.d;
        hi.e eVar = (hi.e) aVar.e;
        ((TextView) aVar.b).setText(N02);
        s sVar = (s) aVar.c;
        sVar.i(N03, false, true);
        sVar.setOnClickListener(new ah.d(aVar2, i12));
        if (N0 == null) {
            jVar.setVisibility(8);
            eVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            eVar.setVisibility(0);
            eVar.i(N0, false, true);
            eVar.setOnClickListener(new d0(2, kVar));
        }
        j jVar2 = this.F;
        hi.e eVar2 = this.G;
        nv0 nv0Var = this.E;
        if (z10) {
            nv0Var.d.setVisibility(0);
            nv0Var.d.setText(gd.N0(2131746502, null));
            nv0Var.e.setText(gd.G(mp.u1(i7).W5, "ProfileBotPreviewEmptyText", new Object[0]));
            nv0Var.f.i(gd.N0(2131746506, null), false, true);
            jVar2.setVisibility(8);
            eVar2.setVisibility(8);
        } else {
            nv0Var.d.setVisibility(8);
            nv0Var.e.setText(gd.a0(null, null, 2131746498, b31.P0(this.a.E, null, null)));
            nv0Var.f.i(gd.N0(2131746506, null), false, true);
            jVar2.setVisibility(0);
            eVar2.setVisibility(0);
            eVar2.i(gd.N0(2131746500, null), false, true);
            eVar2.setOnClickListener(new b(this, i10));
        }
        nv0Var.f.setVisibility(this.w.b() >= mp.u1(i7).W5 ? 8 : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        e eVar = this.f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.f3, eVar.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
    }

    public void setList(a6 a6Var) {
        if (this.a != a6Var) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = a6Var;
        h hVar = this.w;
        hVar.e = a6Var;
        if (hVar != hVar.s.x) {
            hVar.M();
        }
        hVar.f();
        l lVar = this.x;
        lVar.e = a6Var;
        if (lVar != lVar.s.x) {
            lVar.M();
        }
        lVar.f();
        c();
    }

    public void setVisibleHeight(int i7) {
        float f10 = (-(getMeasuredHeight() - Math.max(i7, g0.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f10);
        this.y.setTranslationY(-f10);
    }
}
