package bi;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v1 extends qh.c implements te.b {
    public static final /* synthetic */ int w = 0;
    public final te.c f;
    public final ai.i h;
    public final qh.b[] n;
    public final org.telegram.ui.ActionBar.f6 r;
    public int s;

    public v1(Context context, org.telegram.ui.ActionBar.f6 f6Var, ai.i iVar) {
        super(context);
        this.f = new te.c(0, this, xq.h, 1600L);
        this.h = iVar;
        this.r = f6Var;
        int i7 = org.telegram.ui.ActionBar.k6.Kl;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.09411765f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.k6.r1(0.1254902f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.e.setColor(r12);
        int i10 = 2;
        this.n = new qh.b[]{qh.b.c(context, f6Var, qh.a.G, 2131749626), qh.b.c(context, f6Var, qh.a.w, 2131749643), qh.b.c(context, f6Var, qh.a.J, 2131749624)};
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = this.n;
            if (i11 >= bVarArr.length) {
                bVarArr[0].f(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i11], c8.ha.l(1.0f, 0, -1));
                this.n[i11].setOnClickListener(new ai.v(this, i11, i10));
                i11++;
            }
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i7) {
        int i10 = this.s;
        if (i10 != i7) {
            qh.b[] bVarArr = this.n;
            bVarArr[i10].f(false, true);
            bVarArr[i7].f(true, true);
            this.s = i7;
            this.f.a(i7);
            this.h.a(Integer.valueOf(i7));
        }
    }

    public final void b() {
        float f10 = this.f.f;
        float W1 = org.telegram.messenger.g0.W1(f10 / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f));
        float W12 = org.telegram.messenger.g0.W1((f10 + 1.0f) / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f));
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        Rect rect = this.c;
        rect.set((int) W1, org.telegram.messenger.g0.L(8.0f), (int) W12, measuredHeight);
        int L = org.telegram.messenger.g0.L(this.b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i7 = -L;
        rect2.inset(i7, i7);
        Math.abs(f10 - 1.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        b();
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
