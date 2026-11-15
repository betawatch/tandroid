package hi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.si;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y1 extends u1 {
    public final o1 b;
    public final x1 c;
    public final v4.s d;
    public final w1 e;
    public final d2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ i2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(i2 i2Var, Context context) {
        super(context);
        this.s = i2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        o1 o1Var = new o1(context);
        this.b = o1Var;
        x1 x1Var = new x1(this);
        this.c = x1Var;
        o1Var.setAdapter(x1Var);
        v4.s sVar = new v4.s(this.h);
        this.d = sVar;
        o1Var.setLayoutManager(sVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new bi.y1(this, 6);
        o1Var.setOnItemClickListener(new bi.b6(this, 10));
        o1Var.setOnScrollListener(new bi.z4(this, 14));
        v4.k kVar = new v4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = er.g;
        o1Var.setItemAnimator(kVar);
        addView(o1Var, c8.ja.c(-1.0f, -1));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.f = d2Var;
        d2Var.x = new bi.b(this, 27);
        addView(d2Var, c8.ja.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, i2Var.J0);
        this.e = w1Var;
        addView(w1Var, c8.ja.c(36.0f, -1));
    }

    @Override // hi.u1
    public final void a(int i7) {
        this.a = i7;
        this.b.g3 = i7 == 0;
        int i10 = i7 == 0 ? 8 : 5;
        this.h = i10;
        this.d.y1(i10);
        boolean z10 = this.r;
        x1 x1Var = this.c;
        if (!z10) {
            x1Var.D(null);
        }
        i2 i2Var = this.s;
        int i11 = i2Var.n1;
        d2 d2Var = this.f;
        if (i11 >= 0) {
            d2Var.s = true;
            d2Var.e.setText("");
            d2Var.s = false;
            c2 c2Var = d2Var.h;
            if (c2Var != null) {
                c2Var.H1(i2Var.n1);
                d2Var.h.F1();
                if (d2Var.h.getSelectedCategory() != null) {
                    x1Var.I = d2Var.h.getSelectedCategory().a;
                    e1 e1Var = x1Var.N;
                    org.telegram.messenger.g0.r(e1Var);
                    org.telegram.messenger.g0.h3(e1Var);
                }
            }
        } else if (TextUtils.isEmpty(i2Var.m1)) {
            d2Var.b();
        } else {
            d2Var.e.setText(i2Var.m1);
            c2 c2Var2 = d2Var.h;
            if (c2Var2 != null) {
                c2Var2.I1(null);
                d2Var.h.G1();
            }
            org.telegram.messenger.g0.r(x1Var.N);
            org.telegram.messenger.g0.h3(x1Var.N);
        }
        d2Var.a(i7, i2Var.u1);
        si.b0(i2Var.a).B(i7 == 0 ? 5 : 0);
    }

    @Override // hi.u1
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

    @Override // hi.u1
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
        int i11 = i2.C1;
        i2 i2Var = this.s;
        int i12 = i2Var.u0;
        setPadding(i12, 0, i12, 0);
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        this.b.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(102.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(i2Var.t1 ? 0.0f : 40.0f) + org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
