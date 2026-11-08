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
import di.j6;
import di.m4;
import di.q4;
import di.s7;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.c61;
import v4.y;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final av0 D;
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
    public final /* synthetic */ sp0 W;
    public j6 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final f f;
    public final o41 h;
    public final v4.k n;
    public final rr0 r;
    public final h s;
    public final i w;
    public final m x;
    public final j y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(sp0 sp0Var, Context context) {
        super(context);
        this.W = sp0Var;
        this.d = Utilities.j(iz.u1, 6, 2);
        this.e = Utilities.j(iz.u1, 6, 2);
        int i7 = 0;
        this.H = false;
        this.I = false;
        this.V = new Rect();
        o41 o41Var = new o41();
        this.h = o41Var;
        int i10 = 1;
        o41Var.O = new e(this, i10);
        o41Var.y1(this.d);
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
        fVar.setLayoutManager(o41Var);
        addView(fVar, ha.c(-1.0f, -1));
        fVar.i(new g(this, i7));
        fVar.setOnItemClickListener(new ai.k(this, 6));
        fVar.setOnItemLongClickListener(new q4(this, 7));
        rr0 rr0Var = new rr0(context, null);
        this.r = rr0Var;
        h hVar = new h(i7, this);
        this.s = hVar;
        rr0Var.setLayoutManager(hVar);
        rr0Var.i(new g(this, i10));
        hVar.y1(this.e);
        rr0Var.setVisibility(8);
        addView(rr0Var, ha.c(-1.0f, -1));
        i iVar = new i(this, context);
        this.w = iVar;
        fVar.setAdapter(iVar);
        m mVar = new m(this, getContext());
        iVar.f = mVar;
        this.x = mVar;
        rr0Var.setAdapter(mVar);
        j jVar = new j(this, context);
        this.y = jVar;
        jVar.x = false;
        av0 av0Var = new av0(context, jVar, 1, null);
        this.D = av0Var;
        av0Var.setVisibility(8);
        av0Var.setAnimateLayoutChange(true);
        addView(av0Var, ha.c(-1.0f, -1));
        av0Var.setOnTouchListener(new b(i7));
        av0Var.e(true, false);
        av0Var.b.setVisibility(8);
        av0Var.d.setText(id.M0(2131746699, null));
        av0Var.e.setText(id.G(qp.s1(sp0Var.b).T5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = id.M0(2131746703, null);
        fi.d dVar = av0Var.f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new c(this, i7));
        k kVar2 = new k(this, context);
        this.E = kVar2;
        int i11 = k6.y6;
        f6 f6Var = sp0Var.c;
        r6.V(kVar2, i11, f6Var);
        kVar2.setText(id.M0(2131746704, null));
        kVar2.setTextSize(1, 14.0f);
        kVar2.setTextAlignment(4);
        kVar2.setGravity(17);
        kVar2.setTypeface(g0.o());
        LinearLayout.LayoutParams t6 = ha.t(qs.v2, -2, 17, 0, 17, 0, 12);
        c61 c61Var = av0Var.a;
        c61Var.addView(kVar2, t6);
        fi.d dVar2 = new fi.d(context, f6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        c61Var.addView(dVar2, ha.r(-2, 44, 17));
        av0Var.addView(jVar, 0, ha.c(-1.0f, -1));
        fVar.setEmptyView(av0Var);
        fVar.W1 = true;
        fVar.X1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new d(this, i7));
        this.G = yVar;
        yVar.h(fVar);
        ah.a aVar = new ah.a(context, f6Var);
        this.J = aVar;
        addView(aVar, ha.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            rr0 rr0Var = this.r;
            f fVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    rr0Var.setVisibility(8);
                    fVar.invalidate();
                    return;
                }
                int i7 = 1;
                boolean z9 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new m4(this, i7));
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
            rr0Var.setVisibility(8);
            int i11 = this.d;
            o41 o41Var = this.h;
            o41Var.y1(i11);
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
                o41Var.h1(this.S, (-fVar.getPaddingTop()) + this.T);
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
        rr0 rr0Var = this.r;
        rr0Var.setVisibility(0);
        rr0Var.setAdapter(this.x);
        rr0Var.setPadding(rr0Var.getPaddingLeft(), 0, rr0Var.getPaddingRight(), this.J.getMeasuredHeight() + g0.L(42.0f));
        h hVar = this.s;
        hVar.y1(j3);
        rr0Var.a0();
        hVar.O = new e(this, 0);
        g0.b4(this.f);
        this.b = true;
        this.c = 0.0f;
        int i10 = this.S;
        if (i10 >= 0) {
            hVar.h1(i10, this.T - rr0Var.getPaddingTop());
        }
    }

    public final void c() {
        String M0;
        int i7 = this.W.b;
        j6 j6Var = this.a;
        int size = j6Var == null ? 0 : j6Var.i.size();
        j6 j6Var2 = this.a;
        int i10 = 1;
        boolean z9 = j6Var2 == null || TextUtils.isEmpty(j6Var2.E);
        int i11 = size > 0 ? 0 : 8;
        ah.a aVar = this.J;
        aVar.setVisibility(i11);
        String M02 = z9 ? id.M0(2131746696, null) : id.a0(null, null, 2131746695, k21.O0(this.a.E, null, null));
        String M03 = id.M0(2131746716, null);
        s7 s7Var = new s7(this, 9);
        if (z9 || size <= 0) {
            M0 = id.M0(z9 ? 2131746698 : 2131746697, null);
        } else {
            M0 = null;
        }
        k1 k1Var = (z9 || size <= 0) ? new k1(4, this, z9) : null;
        k kVar = (k) aVar.d;
        fi.d dVar = (fi.d) aVar.e;
        ((TextView) aVar.b).setText(M02);
        w wVar = (w) aVar.c;
        wVar.i(M03, false, true);
        wVar.setOnClickListener(new ah.d(s7Var, 19));
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
        av0 av0Var = this.D;
        if (z9) {
            av0Var.d.setVisibility(0);
            av0Var.d.setText(id.M0(2131746699, null));
            av0Var.e.setText(id.G(qp.s1(i7).T5, "ProfileBotPreviewEmptyText", new Object[0]));
            av0Var.f.i(id.M0(2131746703, null), false, true);
            kVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            av0Var.d.setVisibility(8);
            av0Var.e.setText(id.a0(null, null, 2131746695, k21.O0(this.a.E, null, null)));
            av0Var.f.i(id.M0(2131746703, null), false, true);
            kVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(id.M0(2131746697, null), false, true);
            dVar2.setOnClickListener(new c(this, i10));
        }
        av0Var.f.setVisibility(this.w.b() >= qp.s1(i7).T5 ? 8 : 0);
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

    public void setList(j6 j6Var) {
        if (this.a != j6Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.D;
        }
        this.a = j6Var;
        i iVar = this.w;
        iVar.e = j6Var;
        if (iVar != iVar.s.x) {
            iVar.M();
        }
        iVar.f();
        m mVar = this.x;
        mVar.e = j6Var;
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
