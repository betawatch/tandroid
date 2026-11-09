package ei;

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
import bi.k1;
import bi.w;
import bi.z6;
import c8.ha;
import di.f8;
import di.k6;
import di.n4;
import di.r4;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.d61;
import v4.y;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final cv0 D;
    public final k E;
    public final fi.d F;
    public final y G;
    public boolean H;
    public boolean I;
    public final ah.a J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final /* synthetic */ tp0 W;
    public k6 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final f f;
    public final p41 h;
    public final v4.k n;
    public final tr0 r;
    public final h s;
    public final i w;
    public final m x;
    public final j y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tp0 tp0Var, Context context) {
        super(context);
        this.W = tp0Var;
        this.d = Utilities.j(iz.u1, 6, 2);
        this.e = Utilities.j(iz.u1, 6, 2);
        int i7 = 0;
        this.H = false;
        this.I = false;
        this.V = new Rect();
        p41 p41Var = new p41();
        this.h = p41Var;
        int i10 = 1;
        p41Var.O = new e(this, i10);
        p41Var.y1(this.d);
        v4.k kVar = new v4.k();
        this.n = kVar;
        kVar.n(280L);
        kVar.o(xq.h);
        kVar.m = false;
        f fVar = new f(this, context);
        this.f = fVar;
        fVar.setScrollingTouchSlop(1);
        fVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        fVar.setPadding(0, 0, 0, 0);
        fVar.setItemAnimator(null);
        fVar.setClipToPadding(false);
        fVar.setSectionsType(2);
        fVar.setLayoutManager(p41Var);
        addView(fVar, ha.c(-1.0f, -1));
        fVar.i(new g(this, i7));
        fVar.setOnItemClickListener(new ai.k(this, 6));
        fVar.setOnItemLongClickListener(new r4(this, 7));
        tr0 tr0Var = new tr0(context, null);
        this.r = tr0Var;
        h hVar = new h(i7, this);
        this.s = hVar;
        tr0Var.setLayoutManager(hVar);
        tr0Var.i(new g(this, i10));
        hVar.y1(this.e);
        tr0Var.setVisibility(8);
        addView(tr0Var, ha.c(-1.0f, -1));
        i iVar = new i(this, context);
        this.w = iVar;
        fVar.setAdapter(iVar);
        m mVar = new m(this, getContext());
        iVar.f = mVar;
        this.x = mVar;
        tr0Var.setAdapter(mVar);
        j jVar = new j(this, context);
        this.y = jVar;
        jVar.x = false;
        cv0 cv0Var = new cv0(context, jVar, 1, null);
        this.D = cv0Var;
        cv0Var.setVisibility(8);
        cv0Var.setAnimateLayoutChange(true);
        addView(cv0Var, ha.c(-1.0f, -1));
        cv0Var.setOnTouchListener(new b(i7));
        cv0Var.e(true, false);
        cv0Var.b.setVisibility(8);
        cv0Var.d.setText(id.M0(2131746698, null));
        cv0Var.e.setText(id.G(qp.s1(tp0Var.b).T5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = id.M0(2131746702, null);
        fi.d dVar = cv0Var.f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new c(this, i7));
        k kVar2 = new k(this, context);
        this.E = kVar2;
        int i11 = l6.y6;
        g6 g6Var = tp0Var.c;
        s6.U(kVar2, i11, g6Var);
        kVar2.setText(id.M0(2131746703, null));
        kVar2.setTextSize(1, 14.0f);
        kVar2.setTextAlignment(4);
        kVar2.setGravity(17);
        kVar2.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ha.t(qs.v2, -2, 17, 0, 17, 0, 12);
        d61 d61Var = cv0Var.a;
        d61Var.addView(kVar2, t6);
        fi.d dVar2 = new fi.d(context, g6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        d61Var.addView(dVar2, ha.r(-2, 44, 17));
        cv0Var.addView(jVar, 0, ha.c(-1.0f, -1));
        fVar.setEmptyView(cv0Var);
        fVar.W1 = true;
        fVar.X1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new d(this, i7));
        this.G = yVar;
        yVar.h(fVar);
        ah.a aVar = new ah.a(context, g6Var);
        this.J = aVar;
        addView(aVar, ha.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            tr0 tr0Var = this.r;
            f fVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    tr0Var.setVisibility(8);
                    fVar.invalidate();
                    return;
                }
                int i7 = 1;
                boolean z9 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new n4(this, i7));
                ofFloat.addListener(new ch.y(5, this, z9));
                ofFloat.setInterpolator(xq.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i10 = this.e;
            this.d = i10;
            this.W.D = i10;
            iz.F(i10);
            i iVar = this.w;
            int b10 = iVar.b();
            tr0Var.setVisibility(8);
            int i11 = this.d;
            p41 p41Var = this.h;
            p41Var.y1(i11);
            fVar.a0();
            fVar.invalidate();
            if (iVar.b() == b10) {
                g0.b4(fVar);
            } else {
                iVar.f();
            }
            int i12 = this.S;
            if (i12 >= 0) {
                View m10 = this.s.m(i12);
                if (m10 != null) {
                    this.T = m10.getTop();
                }
                p41Var.h1(this.S, (-fVar.getPaddingTop()) + this.T);
            }
        }
    }

    public final void b(boolean z9) {
        if (this.b || this.W.G.E1) {
            return;
        }
        int i7 = this.d + (!z9 ? 1 : -1);
        if (i7 > 6) {
            i7 = !z9 ? 9 : 6;
        }
        int j3 = Utilities.j(i7, 6, this.H ? 1 : 2);
        this.e = j3;
        if (j3 == this.d || this.H) {
            return;
        }
        tr0 tr0Var = this.r;
        tr0Var.setVisibility(0);
        tr0Var.setAdapter(this.x);
        tr0Var.setPadding(tr0Var.getPaddingLeft(), 0, tr0Var.getPaddingRight(), this.J.getMeasuredHeight() + g0.L(42.0f));
        h hVar = this.s;
        hVar.y1(j3);
        tr0Var.a0();
        hVar.O = new e(this, 0);
        g0.b4(this.f);
        this.b = true;
        this.c = 0.0f;
        int i10 = this.S;
        if (i10 >= 0) {
            hVar.h1(i10, this.T - tr0Var.getPaddingTop());
        }
    }

    public final void c() {
        String M0;
        int i7 = this.W.b;
        k6 k6Var = this.a;
        int size = k6Var == null ? 0 : k6Var.i.size();
        k6 k6Var2 = this.a;
        int i10 = 1;
        boolean z9 = k6Var2 == null || TextUtils.isEmpty(k6Var2.E);
        int i11 = 8;
        int i12 = size > 0 ? 0 : 8;
        ah.a aVar = this.J;
        aVar.setVisibility(i12);
        String M02 = z9 ? id.M0(2131746695, null) : id.a0(null, null, 2131746694, l21.O0(this.a.E, null, null));
        String M03 = id.M0(2131746715, null);
        f8 f8Var = new f8(this, i11);
        if (z9 || size <= 0) {
            M0 = id.M0(z9 ? 2131746697 : 2131746696, null);
        } else {
            M0 = null;
        }
        k1 k1Var = (z9 || size <= 0) ? new k1(4, this, z9) : null;
        k kVar = (k) aVar.d;
        fi.d dVar = (fi.d) aVar.e;
        ((TextView) aVar.b).setText(M02);
        w wVar = (w) aVar.c;
        wVar.i(M03, false, true);
        wVar.setOnClickListener(new ah.d(f8Var, 19));
        if (M0 == null) {
            kVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(M0, false, true);
            dVar.setOnClickListener(new z6(1, k1Var));
        }
        k kVar2 = this.E;
        fi.d dVar2 = this.F;
        cv0 cv0Var = this.D;
        if (z9) {
            cv0Var.d.setVisibility(0);
            cv0Var.d.setText(id.M0(2131746698, null));
            cv0Var.e.setText(id.G(qp.s1(i7).T5, "ProfileBotPreviewEmptyText", new Object[0]));
            cv0Var.f.i(id.M0(2131746702, null), false, true);
            kVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            cv0Var.d.setVisibility(8);
            cv0Var.e.setText(id.a0(null, null, 2131746694, l21.O0(this.a.E, null, null)));
            cv0Var.f.i(id.M0(2131746702, null), false, true);
            kVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(id.M0(2131746696, null), false, true);
            dVar2.setOnClickListener(new c(this, i10));
        }
        cv0Var.f.setVisibility(this.w.b() >= qp.s1(i7).T5 ? 8 : 0);
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
        f fVar = this.f;
        fVar.setPadding(fVar.getPaddingLeft(), fVar.e3, fVar.getPaddingRight(), this.J.getMeasuredHeight() + g0.L(42.0f));
    }

    public void setList(k6 k6Var) {
        if (this.a != k6Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.D;
        }
        this.a = k6Var;
        i iVar = this.w;
        iVar.e = k6Var;
        if (iVar != iVar.s.x) {
            iVar.M();
        }
        iVar.f();
        m mVar = this.x;
        mVar.e = k6Var;
        if (mVar != mVar.s.x) {
            mVar.M();
        }
        mVar.f();
        c();
    }

    public void setVisibleHeight(int i7) {
        float f10 = (-(getMeasuredHeight() - Math.max(i7, g0.L(280.0f)))) / 2.0f;
        this.D.setTranslationY(f10);
        this.y.setTranslationY(-f10);
    }
}
