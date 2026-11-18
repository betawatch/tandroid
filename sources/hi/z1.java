package hi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class z1 extends v1 {
    public final o1 b;
    public final y1 c;
    public final v4.t d;
    public final x1 e;
    public final e2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ j2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(j2 j2Var, Context context) {
        super(context);
        this.s = j2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        o1 o1Var = new o1(context);
        this.b = o1Var;
        y1 y1Var = new y1(this);
        this.c = y1Var;
        o1Var.setAdapter(y1Var);
        v4.t tVar = new v4.t(this.h);
        this.d = tVar;
        o1Var.setLayoutManager(tVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        tVar.O = new bi.s2(this, 6);
        o1Var.setOnItemClickListener(new bi.i8(this, 10));
        o1Var.setOnScrollListener(new bi.q1(this, 15));
        v4.k kVar = new v4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = lr.g;
        o1Var.setItemAnimator(kVar);
        addView(o1Var, c8.ma.c(-1.0f, -1));
        int i7 = j2.C1;
        e2 e2Var = new e2(context, j2Var.J0);
        this.f = e2Var;
        e2Var.x = new bi.b(this, 26);
        addView(e2Var, c8.ma.e(-1, -2, 48));
        x1 x1Var = new x1(this, context, j2Var.J0);
        this.e = x1Var;
        addView(x1Var, c8.ma.c(36.0f, -1));
    }

    @Override // hi.v1
    public final void a(int i7) {
        this.a = i7;
        this.b.g3 = i7 == 0;
        int i10 = i7 == 0 ? 8 : 5;
        this.h = i10;
        this.d.y1(i10);
        boolean z10 = this.r;
        y1 y1Var = this.c;
        if (!z10) {
            y1Var.D(null);
        }
        j2 j2Var = this.s;
        int i11 = j2Var.n1;
        e2 e2Var = this.f;
        if (i11 >= 0) {
            e2Var.s = true;
            e2Var.e.setText("");
            e2Var.s = false;
            d2 d2Var = e2Var.h;
            if (d2Var != null) {
                d2Var.H1(j2Var.n1);
                e2Var.h.F1();
                if (e2Var.h.getSelectedCategory() != null) {
                    y1Var.I = e2Var.h.getSelectedCategory().a;
                    k kVar = y1Var.N;
                    org.telegram.messenger.g0.r(kVar);
                    org.telegram.messenger.g0.g3(kVar);
                }
            }
        } else if (TextUtils.isEmpty(j2Var.m1)) {
            e2Var.b();
        } else {
            e2Var.e.setText(j2Var.m1);
            d2 d2Var2 = e2Var.h;
            if (d2Var2 != null) {
                d2Var2.I1(null);
                e2Var.h.G1();
            }
            org.telegram.messenger.g0.r(y1Var.N);
            org.telegram.messenger.g0.g3(y1Var.N);
        }
        e2Var.a(i7, j2Var.u1);
        ri.d0(j2Var.a).D(i7 == 0 ? 5 : 0);
    }

    @Override // hi.v1
    public final float b() {
        float f10 = this.n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            o1 o1Var = this.b;
            if (i7 >= o1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = o1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i5.c.d(102.0f, r3.getBottom(), 0);
            }
            i7++;
        }
    }

    @Override // hi.v1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        o1 o1Var = this.b;
        float height = o1Var.getHeight() - o1Var.getPaddingBottom();
        o1Var.h3 = max + o1Var.getPaddingTop();
        o1Var.i3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = j2.C1;
        j2 j2Var = this.s;
        int i12 = j2Var.u0;
        setPadding(i12, 0, i12, 0);
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        this.b.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(102.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(j2Var.t1 ? 0.0f : 40.0f) + org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
