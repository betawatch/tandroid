package hi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g2 extends c2 {
    public final w1 b;
    public final f2 c;
    public final v4.t d;
    public final e2 e;
    public final l2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ r2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(r2 r2Var, Context context) {
        super(context);
        this.s = r2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        w1 w1Var = new w1(context);
        this.b = w1Var;
        f2 f2Var = new f2(this);
        this.c = f2Var;
        w1Var.setAdapter(f2Var);
        v4.t tVar = new v4.t(this.h);
        this.d = tVar;
        w1Var.setLayoutManager(tVar);
        w1Var.setClipToPadding(true);
        w1Var.setVerticalScrollBarEnabled(false);
        tVar.O = new bi.y2(this, 6);
        w1Var.setOnItemClickListener(new bi.n8(this, 10));
        w1Var.setOnScrollListener(new bi.v1(this, 15));
        v4.l lVar = new v4.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = kr.g;
        w1Var.setItemAnimator(lVar);
        addView(w1Var, c8.na.c(-1.0f, -1));
        int i7 = r2.D1;
        l2 l2Var = new l2(context, r2Var.J0);
        this.f = l2Var;
        l2Var.x = new bi.b(this, 26);
        addView(l2Var, c8.na.e(-1, -2, 48));
        e2 e2Var = new e2(this, context, r2Var.J0);
        this.e = e2Var;
        addView(e2Var, c8.na.c(36.0f, -1));
    }

    @Override // hi.c2
    public final void a(int i7) {
        this.a = i7;
        this.b.g3 = i7 == 0;
        int i10 = i7 == 0 ? 8 : 5;
        this.h = i10;
        this.d.y1(i10);
        boolean z10 = this.r;
        f2 f2Var = this.c;
        if (!z10) {
            f2Var.D(null);
        }
        r2 r2Var = this.s;
        int i11 = r2Var.n1;
        l2 l2Var = this.f;
        if (i11 >= 0) {
            l2Var.s = true;
            l2Var.e.setText("");
            l2Var.s = false;
            k2 k2Var = l2Var.h;
            if (k2Var != null) {
                k2Var.H1(r2Var.n1);
                l2Var.h.F1();
                if (l2Var.h.getSelectedCategory() != null) {
                    f2Var.I = l2Var.h.getSelectedCategory().a;
                    w wVar = f2Var.N;
                    org.telegram.messenger.g0.r(wVar);
                    org.telegram.messenger.g0.g3(wVar);
                }
            }
        } else if (TextUtils.isEmpty(r2Var.m1)) {
            l2Var.b();
        } else {
            l2Var.e.setText(r2Var.m1);
            k2 k2Var2 = l2Var.h;
            if (k2Var2 != null) {
                k2Var2.I1(null);
                l2Var.h.G1();
            }
            org.telegram.messenger.g0.r(f2Var.N);
            org.telegram.messenger.g0.g3(f2Var.N);
        }
        l2Var.a(i7, r2Var.u1);
        ri.d0(r2Var.a).D(i7 == 0 ? 5 : 0);
    }

    @Override // hi.c2
    public final float b() {
        float f10 = this.n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            w1 w1Var = this.b;
            if (i7 >= w1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = w1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i5.c.d(102.0f, r3.getBottom(), 0);
            }
            i7++;
        }
    }

    @Override // hi.c2
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        w1 w1Var = this.b;
        float height = w1Var.getHeight() - w1Var.getPaddingBottom();
        w1Var.h3 = max + w1Var.getPaddingTop();
        w1Var.i3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = r2.D1;
        r2 r2Var = this.s;
        int i12 = r2Var.u0;
        setPadding(i12, 0, i12, 0);
        this.e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        this.b.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(102.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(r2Var.t1 ? 0.0f : 40.0f) + org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
