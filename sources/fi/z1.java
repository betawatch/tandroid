package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class z1 extends u1 {
    public final m1 b;
    public final y1 c;
    public final v4.s d;
    public final w1 e;
    public final e2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ k2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(k2 k2Var, Context context) {
        super(context);
        this.s = k2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        m1 m1Var = new m1(context);
        this.b = m1Var;
        y1 y1Var = new y1(this);
        this.c = y1Var;
        m1Var.setAdapter(y1Var);
        v4.s sVar = new v4.s(this.h);
        this.d = sVar;
        m1Var.setLayoutManager(sVar);
        m1Var.setClipToPadding(true);
        m1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new ai.l(this, 3);
        m1Var.setOnItemClickListener(new ai.k(this, 9));
        m1Var.setOnScrollListener(new ai.b(this, 11));
        v4.k kVar = new v4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = xq.g;
        m1Var.setItemAnimator(kVar);
        addView(m1Var, c8.ha.c(-1.0f, -1));
        int i7 = k2.y1;
        e2 e2Var = new e2(context, k2Var.I0);
        this.f = e2Var;
        e2Var.x = new ai.e(this, 17);
        addView(e2Var, c8.ha.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, k2Var.I0);
        this.e = w1Var;
        addView(w1Var, c8.ha.c(36.0f, -1));
    }

    @Override // fi.u1
    public final void a(int i7) {
        this.a = i7;
        this.b.f3 = i7 == 0;
        int i10 = i7 == 0 ? 8 : 5;
        this.h = i10;
        this.d.y1(i10);
        boolean z9 = this.r;
        y1 y1Var = this.c;
        if (!z9) {
            y1Var.D(null);
        }
        k2 k2Var = this.s;
        int i11 = k2Var.j1;
        e2 e2Var = this.f;
        if (i11 >= 0) {
            e2Var.s = true;
            e2Var.e.setText("");
            e2Var.s = false;
            d2 d2Var = e2Var.h;
            if (d2Var != null) {
                d2Var.H1(k2Var.j1);
                e2Var.h.F1();
                if (e2Var.h.getSelectedCategory() != null) {
                    y1Var.H = e2Var.h.getSelectedCategory().a;
                    di.s7 s7Var = y1Var.M;
                    org.telegram.messenger.g0.r(s7Var);
                    org.telegram.messenger.g0.h3(s7Var);
                }
            }
        } else if (TextUtils.isEmpty(k2Var.i1)) {
            e2Var.b();
        } else {
            e2Var.e.setText(k2Var.i1);
            d2 d2Var2 = e2Var.h;
            if (d2Var2 != null) {
                d2Var2.I1(null);
                e2Var.h.G1();
            }
            org.telegram.messenger.g0.r(y1Var.M);
            org.telegram.messenger.g0.h3(y1Var.M);
        }
        e2Var.a(i7, k2Var.q1);
        ui.b0(k2Var.a).B(i7 == 0 ? 5 : 0);
    }

    @Override // fi.u1
    public final float b() {
        float f10 = this.n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            m1 m1Var = this.b;
            if (i7 >= m1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = m1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return jg.g.e(102.0f, r3.getBottom(), 0);
            }
            i7++;
        }
    }

    @Override // fi.u1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        m1 m1Var = this.b;
        float height = m1Var.getHeight() - m1Var.getPaddingBottom();
        m1Var.g3 = max + m1Var.getPaddingTop();
        m1Var.h3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = k2.y1;
        k2 k2Var = this.s;
        int i12 = k2Var.t0;
        setPadding(i12, 0, i12, 0);
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        this.b.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(102.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(k2Var.p1 ? 0.0f : 40.0f) + org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
