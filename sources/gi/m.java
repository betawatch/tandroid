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
import bi.d7;
import bi.h8;
import bi.s;
import c8.ma;
import di.c7;
import fi.d4;
import fi.z5;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.y21;
import org.telegram.ui.d61;
import v4.z;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m extends FrameLayout {
    public static final /* synthetic */ int b0 = 0;
    public final kv0 E;
    public final j F;
    public final hi.d G;
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
    public z5 a;
    public final /* synthetic */ dq0 a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final e f;
    public final c51 h;
    public final v4.k n;
    public final as0 r;
    public final g s;
    public final h w;
    public final l x;
    public final i y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dq0 dq0Var, Context context) {
        super(context);
        this.a0 = dq0Var;
        this.d = Utilities.j(bz.u1, 6, 2);
        this.e = Utilities.j(bz.u1, 6, 2);
        int i7 = 0;
        this.I = false;
        this.J = false;
        this.W = new Rect();
        c51 c51Var = new c51();
        this.h = c51Var;
        int i10 = 1;
        c51Var.O = new d(this, i10);
        c51Var.y1(this.d);
        v4.k kVar = new v4.k();
        this.n = kVar;
        kVar.n(280L);
        kVar.o(lr.h);
        kVar.m = false;
        e eVar = new e(this, context);
        this.f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(c51Var);
        addView(eVar, ma.c(-1.0f, -1));
        eVar.i(new f(this, i7));
        eVar.setOnItemClickListener(new h8(this, 7));
        eVar.setOnItemLongClickListener(new c7(this, 14));
        as0 as0Var = new as0(context, null);
        this.r = as0Var;
        g gVar = new g(i7, this);
        this.s = gVar;
        as0Var.setLayoutManager(gVar);
        as0Var.i(new f(this, i10));
        gVar.y1(this.e);
        as0Var.setVisibility(8);
        addView(as0Var, ma.c(-1.0f, -1));
        h hVar = new h(this, context);
        this.w = hVar;
        eVar.setAdapter(hVar);
        l lVar = new l(this, getContext());
        hVar.f = lVar;
        this.x = lVar;
        as0Var.setAdapter(lVar);
        i iVar = new i(this, context);
        this.y = iVar;
        iVar.x = false;
        kv0 kv0Var = new kv0(context, iVar, 1, null);
        this.E = kv0Var;
        kv0Var.setVisibility(8);
        kv0Var.setAnimateLayoutChange(true);
        addView(kv0Var, ma.c(-1.0f, -1));
        kv0Var.setOnTouchListener(new a(i7));
        kv0Var.e(true, false);
        kv0Var.b.setVisibility(8);
        kv0Var.d.setText(gd.M0(2131746503, null));
        kv0Var.e.setText(gd.G(mp.u1(dq0Var.b).W5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = gd.M0(2131746507, null);
        hi.d dVar = kv0Var.f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new b(this, i7));
        j jVar = new j(this, context);
        this.F = jVar;
        int i11 = n6.y6;
        i6 i6Var = dq0Var.c;
        u6.U(jVar, i11, i6Var);
        jVar.setText(gd.M0(2131746508, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ma.t(ks.v2, -2, 17, 0, 17, 0, 12);
        d61 d61Var = kv0Var.a;
        d61Var.addView(jVar, t6);
        hi.d dVar2 = new hi.d(context, i6Var, false);
        this.G = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        d61Var.addView(dVar2, ma.r(-2, 44, 17));
        kv0Var.addView(iVar, 0, ma.c(-1.0f, -1));
        eVar.setEmptyView(kv0Var);
        eVar.X1 = true;
        eVar.Y1 = 0;
        new SparseArray();
        new HashMap();
        z zVar = new z(new c(this, i7));
        this.H = zVar;
        zVar.h(eVar);
        ah.a aVar = new ah.a(context, i6Var);
        this.K = aVar;
        addView(aVar, ma.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            as0 as0Var = this.r;
            e eVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    as0Var.setVisibility(8);
                    eVar.invalidate();
                    return;
                }
                int i7 = 1;
                boolean z10 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new d4(this, i7));
                ofFloat.addListener(new d7(6, this, z10));
                ofFloat.setInterpolator(lr.f);
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
            as0Var.setVisibility(8);
            int i11 = this.d;
            c51 c51Var = this.h;
            c51Var.y1(i11);
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
                c51Var.h1(this.T, (-eVar.getPaddingTop()) + this.U);
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
        as0 as0Var = this.r;
        as0Var.setVisibility(0);
        as0Var.setAdapter(this.x);
        as0Var.setPadding(as0Var.getPaddingLeft(), 0, as0Var.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
        g gVar = this.s;
        gVar.y1(j3);
        as0Var.a0();
        gVar.O = new d(this, 0);
        g0.Z3(this.f);
        this.b = true;
        this.c = 0.0f;
        int i10 = this.T;
        if (i10 >= 0) {
            gVar.h1(i10, this.U - as0Var.getPaddingTop());
        }
    }

    public final void c() {
        String M0;
        int i7 = this.a0.b;
        z5 z5Var = this.a;
        int size = z5Var == null ? 0 : z5Var.i.size();
        z5 z5Var2 = this.a;
        int i10 = 1;
        boolean z10 = z5Var2 == null || TextUtils.isEmpty(z5Var2.E);
        int i11 = size > 0 ? 0 : 8;
        ah.a aVar = this.K;
        aVar.setVisibility(i11);
        String M02 = z10 ? gd.M0(2131746500, null) : gd.a0(null, null, 2131746499, y21.P0(this.a.E, null, null));
        String M03 = gd.M0(2131746522, null);
        f2.a aVar2 = new f2.a(this, 26);
        if (z10 || size <= 0) {
            M0 = gd.M0(z10 ? 2131746502 : 2131746501, null);
        } else {
            M0 = null;
        }
        ch.k kVar = (z10 || size <= 0) ? new ch.k(4, this, z10) : null;
        j jVar = (j) aVar.d;
        hi.d dVar = (hi.d) aVar.e;
        ((TextView) aVar.b).setText(M02);
        s sVar = (s) aVar.c;
        sVar.i(M03, false, true);
        sVar.setOnClickListener(new ah.d(aVar2, 27));
        if (M0 == null) {
            jVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(M0, false, true);
            dVar.setOnClickListener(new d0(2, kVar));
        }
        j jVar2 = this.F;
        hi.d dVar2 = this.G;
        kv0 kv0Var = this.E;
        if (z10) {
            kv0Var.d.setVisibility(0);
            kv0Var.d.setText(gd.M0(2131746503, null));
            kv0Var.e.setText(gd.G(mp.u1(i7).W5, "ProfileBotPreviewEmptyText", new Object[0]));
            kv0Var.f.i(gd.M0(2131746507, null), false, true);
            jVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            kv0Var.d.setVisibility(8);
            kv0Var.e.setText(gd.a0(null, null, 2131746499, y21.P0(this.a.E, null, null)));
            kv0Var.f.i(gd.M0(2131746507, null), false, true);
            jVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(gd.M0(2131746501, null), false, true);
            dVar2.setOnClickListener(new b(this, i10));
        }
        kv0Var.f.setVisibility(this.w.b() >= mp.u1(i7).W5 ? 8 : 0);
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

    public void setList(z5 z5Var) {
        if (this.a != z5Var) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = z5Var;
        h hVar = this.w;
        hVar.e = z5Var;
        if (hVar != hVar.s.x) {
            hVar.M();
        }
        hVar.f();
        l lVar = this.x;
        lVar.e = z5Var;
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
