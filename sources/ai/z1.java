package ai;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class z1 extends ph.c implements ne.d {
    public static final /* synthetic */ int v = 0;
    public final ne.e f;
    public final r0 h;
    public final ph.b[] n;
    public final org.telegram.ui.ActionBar.g6 r;
    public int s;

    public z1(Context context, org.telegram.ui.ActionBar.g6 g6Var, r0 r0Var) {
        super(context);
        this.f = new ne.e(0, this, bs.h, 1600L);
        this.h = r0Var;
        this.r = g6Var;
        int i10 = org.telegram.ui.ActionBar.k6.Wk;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.09411765f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        org.telegram.ui.ActionBar.k6.o1(0.1254902f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.e.setColor(o12);
        int i11 = 1;
        this.n = new ph.b[]{ph.b.c(context, g6Var, ph.a.G, R.string.GiftPreviewModels), ph.b.c(context, g6Var, ph.a.v, R.string.GiftPreviewBackdrops), ph.b.c(context, g6Var, ph.a.J, R.string.GiftPreviewSymbols)};
        int i12 = 0;
        while (true) {
            ph.b[] bVarArr = this.n;
            if (i12 >= bVarArr.length) {
                bVarArr[0].f(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i12], w7.z5.l(1.0f, 0, -1));
                this.n[i12].setOnClickListener(new n1(this, i12, i11));
                i12++;
            }
        }
    }

    public final void a(int i10) {
        int i11 = this.s;
        if (i11 != i10) {
            ph.b[] bVarArr = this.n;
            bVarArr[i11].f(false, true);
            bVarArr[i10].f(true, true);
            this.s = i10;
            this.f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.c;
        rect.set((int) lerp, AndroidUtilities.dp(8.0f), (int) lerp2, measuredHeight);
        int dp = AndroidUtilities.dp(this.b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f7 - 1.0f);
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        b();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
