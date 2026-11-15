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
import bi.b6;
import bi.d0;
import bi.s;
import bi.v4;
import c8.ja;
import di.z6;
import fi.c1;
import fi.c6;
import fi.f4;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.z51;
import v4.y;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m extends FrameLayout {
    public static final /* synthetic */ int b0 = 0;
    public final cv0 E;
    public final j F;
    public final hi.d G;
    public final y H;
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
    public c6 a;
    public final /* synthetic */ vp0 a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final e f;
    public final s41 h;
    public final v4.k n;
    public final sr0 r;
    public final g s;
    public final h w;
    public final l x;
    public final i y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vp0 vp0Var, Context context) {
        super(context);
        this.a0 = vp0Var;
        this.d = Utilities.j(gz.u1, 6, 2);
        this.e = Utilities.j(gz.u1, 6, 2);
        int i7 = 0;
        this.I = false;
        this.J = false;
        this.W = new Rect();
        s41 s41Var = new s41();
        this.h = s41Var;
        int i10 = 1;
        s41Var.O = new d(this, i10);
        s41Var.y1(this.d);
        v4.k kVar = new v4.k();
        this.n = kVar;
        kVar.n(280L);
        kVar.o(er.h);
        kVar.m = false;
        e eVar = new e(this, context);
        this.f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(s41Var);
        addView(eVar, ja.c(-1.0f, -1));
        eVar.i(new f(this, i7));
        eVar.setOnItemClickListener(new b6(this, 7));
        eVar.setOnItemLongClickListener(new z6(this, 14));
        sr0 sr0Var = new sr0(context, null);
        this.r = sr0Var;
        g gVar = new g(i7, this);
        this.s = gVar;
        sr0Var.setLayoutManager(gVar);
        sr0Var.i(new f(this, i10));
        gVar.y1(this.e);
        sr0Var.setVisibility(8);
        addView(sr0Var, ja.c(-1.0f, -1));
        h hVar = new h(this, context);
        this.w = hVar;
        eVar.setAdapter(hVar);
        l lVar = new l(this, getContext());
        hVar.f = lVar;
        this.x = lVar;
        sr0Var.setAdapter(lVar);
        i iVar = new i(this, context);
        this.y = iVar;
        iVar.x = false;
        cv0 cv0Var = new cv0(context, iVar, 1, null);
        this.E = cv0Var;
        cv0Var.setVisibility(8);
        cv0Var.setAnimateLayoutChange(true);
        addView(cv0Var, ja.c(-1.0f, -1));
        cv0Var.setOnTouchListener(new a(i7));
        cv0Var.e(true, false);
        cv0Var.b.setVisibility(8);
        cv0Var.d.setText(hd.M0(2131746698, null));
        cv0Var.e.setText(hd.G(np.s1(vp0Var.b).U5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = hd.M0(2131746702, null);
        hi.d dVar = cv0Var.f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new b(this, i7));
        j jVar = new j(this, context);
        this.F = jVar;
        int i11 = j6.y6;
        e6 e6Var = vp0Var.c;
        q6.U(jVar, i11, e6Var);
        jVar.setText(hd.M0(2131746703, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ja.t(ns.v2, -2, 17, 0, 17, 0, 12);
        z51 z51Var = cv0Var.a;
        z51Var.addView(jVar, t6);
        hi.d dVar2 = new hi.d(context, e6Var, false);
        this.G = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        z51Var.addView(dVar2, ja.r(-2, 44, 17));
        cv0Var.addView(iVar, 0, ja.c(-1.0f, -1));
        eVar.setEmptyView(cv0Var);
        eVar.X1 = true;
        eVar.Y1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new c(this, i7));
        this.H = yVar;
        yVar.h(eVar);
        ah.a aVar = new ah.a(context, e6Var);
        this.K = aVar;
        addView(aVar, ja.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            sr0 sr0Var = this.r;
            e eVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    sr0Var.setVisibility(8);
                    eVar.invalidate();
                    return;
                }
                int i7 = 1;
                boolean z10 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new f4(this, i7));
                ofFloat.addListener(new v4(6, this, z10));
                ofFloat.setInterpolator(er.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i10 = this.e;
            this.d = i10;
            this.a0.E = i10;
            gz.F(i10);
            h hVar = this.w;
            int b10 = hVar.b();
            sr0Var.setVisibility(8);
            int i11 = this.d;
            s41 s41Var = this.h;
            s41Var.y1(i11);
            eVar.a0();
            eVar.invalidate();
            if (hVar.b() == b10) {
                g0.a4(eVar);
            } else {
                hVar.f();
            }
            int i12 = this.T;
            if (i12 >= 0) {
                View m10 = this.s.m(i12);
                if (m10 != null) {
                    this.U = m10.getTop();
                }
                s41Var.h1(this.T, (-eVar.getPaddingTop()) + this.U);
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
        sr0 sr0Var = this.r;
        sr0Var.setVisibility(0);
        sr0Var.setAdapter(this.x);
        sr0Var.setPadding(sr0Var.getPaddingLeft(), 0, sr0Var.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
        g gVar = this.s;
        gVar.y1(j3);
        sr0Var.a0();
        gVar.O = new d(this, 0);
        g0.a4(this.f);
        this.b = true;
        this.c = 0.0f;
        int i10 = this.T;
        if (i10 >= 0) {
            gVar.h1(i10, this.U - sr0Var.getPaddingTop());
        }
    }

    public final void c() {
        String M0;
        int i7 = this.a0.b;
        c6 c6Var = this.a;
        int size = c6Var == null ? 0 : c6Var.i.size();
        c6 c6Var2 = this.a;
        int i10 = 1;
        boolean z10 = c6Var2 == null || TextUtils.isEmpty(c6Var2.E);
        int i11 = size > 0 ? 0 : 8;
        ah.a aVar = this.K;
        aVar.setVisibility(i11);
        String M02 = z10 ? hd.M0(2131746695, null) : hd.a0(null, null, 2131746694, p21.O0(this.a.E, null, null));
        String M03 = hd.M0(2131746715, null);
        c1 c1Var = new c1(this, 22);
        if (z10 || size <= 0) {
            M0 = hd.M0(z10 ? 2131746697 : 2131746696, null);
        } else {
            M0 = null;
        }
        ai.q qVar = (z10 || size <= 0) ? new ai.q(5, this, z10) : null;
        j jVar = (j) aVar.d;
        hi.d dVar = (hi.d) aVar.e;
        ((TextView) aVar.b).setText(M02);
        s sVar = (s) aVar.c;
        sVar.i(M03, false, true);
        sVar.setOnClickListener(new ah.d(c1Var, 25));
        if (M0 == null) {
            jVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(M0, false, true);
            dVar.setOnClickListener(new d0(2, qVar));
        }
        j jVar2 = this.F;
        hi.d dVar2 = this.G;
        cv0 cv0Var = this.E;
        if (z10) {
            cv0Var.d.setVisibility(0);
            cv0Var.d.setText(hd.M0(2131746698, null));
            cv0Var.e.setText(hd.G(np.s1(i7).U5, "ProfileBotPreviewEmptyText", new Object[0]));
            cv0Var.f.i(hd.M0(2131746702, null), false, true);
            jVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            cv0Var.d.setVisibility(8);
            cv0Var.e.setText(hd.a0(null, null, 2131746694, p21.O0(this.a.E, null, null)));
            cv0Var.f.i(hd.M0(2131746702, null), false, true);
            jVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(hd.M0(2131746696, null), false, true);
            dVar2.setOnClickListener(new b(this, i10));
        }
        cv0Var.f.setVisibility(this.w.b() >= np.s1(i7).U5 ? 8 : 0);
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

    public void setList(c6 c6Var) {
        if (this.a != c6Var) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = c6Var;
        h hVar = this.w;
        hVar.e = c6Var;
        if (hVar != hVar.s.x) {
            hVar.M();
        }
        hVar.f();
        l lVar = this.x;
        lVar.e = c6Var;
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
