package gi;

import android.content.Context;
import android.text.TextUtils;
import b8.mf;
import org.telegram.messenger.li;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y1 extends u1 {
    public final m1 b;
    public final x1 c;
    public final u4.s d;
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
        m1 m1Var = new m1(context);
        this.b = m1Var;
        x1 x1Var = new x1(this);
        this.c = x1Var;
        m1Var.setAdapter(x1Var);
        u4.s sVar = new u4.s(this.h);
        this.d = sVar;
        m1Var.setLayoutManager(sVar);
        m1Var.setClipToPadding(true);
        m1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new ai.g2(this, 6);
        m1Var.setOnItemClickListener(new ai.j6(this, 10));
        m1Var.setOnScrollListener(new ai.j5(this, 14));
        u4.k kVar = new u4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = xq.g;
        m1Var.setItemAnimator(kVar);
        addView(m1Var, mf.c(-1.0f, -1));
        int i3 = i2.z1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.f = d2Var;
        d2Var.x = new ai.c(this, 27);
        addView(d2Var, mf.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, i2Var.J0);
        this.e = w1Var;
        addView(w1Var, mf.c(36.0f, -1));
    }

    @Override // gi.u1
    public final void a(int i3) {
        this.a = i3;
        this.b.g3 = i3 == 0;
        int i10 = i3 == 0 ? 8 : 5;
        this.h = i10;
        this.d.y1(i10);
        boolean z10 = this.r;
        x1 x1Var = this.c;
        if (!z10) {
            x1Var.D(null);
        }
        i2 i2Var = this.s;
        int i11 = i2Var.k1;
        d2 d2Var = this.f;
        if (i11 >= 0) {
            d2Var.s = true;
            d2Var.e.setText("");
            d2Var.s = false;
            c2 c2Var = d2Var.h;
            if (c2Var != null) {
                c2Var.H1(i2Var.k1);
                d2Var.h.F1();
                if (d2Var.h.getSelectedCategory() != null) {
                    x1Var.I = d2Var.h.getSelectedCategory().a;
                    ei.z5 z5Var = x1Var.N;
                    org.telegram.messenger.g0.r(z5Var);
                    org.telegram.messenger.g0.h3(z5Var);
                }
            }
        } else if (TextUtils.isEmpty(i2Var.j1)) {
            d2Var.b();
        } else {
            d2Var.e.setText(i2Var.j1);
            c2 c2Var2 = d2Var.h;
            if (c2Var2 != null) {
                c2Var2.I1(null);
                d2Var.h.G1();
            }
            org.telegram.messenger.g0.r(x1Var.N);
            org.telegram.messenger.g0.h3(x1Var.N);
        }
        d2Var.a(i3, i2Var.r1);
        li.b0(i2Var.a).B(i3 == 0 ? 5 : 0);
    }

    @Override // gi.u1
    public final float b() {
        float f10 = this.n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i3 = 0;
        while (true) {
            m1 m1Var = this.b;
            if (i3 >= m1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = m1Var.getChildAt(i3).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return k2.p1.d(102.0f, r3.getBottom(), 0);
            }
            i3++;
        }
    }

    @Override // gi.u1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        m1 m1Var = this.b;
        float height = m1Var.getHeight() - m1Var.getPaddingBottom();
        m1Var.h3 = max + m1Var.getPaddingTop();
        m1Var.i3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = i2.z1;
        i2 i2Var = this.s;
        int i12 = i2Var.u0;
        setPadding(i12, 0, i12, 0);
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        this.b.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(102.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(i2Var.q1 ? 0.0f : 40.0f) + org.telegram.messenger.g0.n);
        super.onMeasure(i3, i10);
    }
}
