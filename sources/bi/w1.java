package bi;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w1 extends qh.c implements oe.d {
    public static final /* synthetic */ int v = 0;
    public final oe.e f;
    public final ai.i h;
    public final qh.b[] n;
    public final org.telegram.ui.ActionBar.u6 r;
    public int s;

    public w1(Context context, org.telegram.ui.ActionBar.u6 u6Var, ai.i iVar) {
        super(context);
        this.f = new oe.e(0, this, ds.h, 1600L);
        this.h = iVar;
        this.r = u6Var;
        int i10 = org.telegram.ui.ActionBar.y6.Wk;
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.09411765f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.y6.o1(0.1254902f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.e.setColor(o12);
        int i11 = 2;
        this.n = new qh.b[]{qh.b.c(context, u6Var, qh.a.G, R.string.GiftPreviewModels), qh.b.c(context, u6Var, qh.a.v, R.string.GiftPreviewBackdrops), qh.b.c(context, u6Var, qh.a.J, R.string.GiftPreviewSymbols)};
        int i12 = 0;
        while (true) {
            qh.b[] bVarArr = this.n;
            if (i12 >= bVarArr.length) {
                bVarArr[0].f(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i12], kb1.p(1.0f, 0, -1));
                this.n[i12].setOnClickListener(new ai.w(this, i12, i11));
                i12++;
            }
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.s;
        if (i11 != i10) {
            qh.b[] bVarArr = this.n;
            bVarArr[i11].f(false, true);
            bVarArr[i10].f(true, true);
            this.s = i10;
            this.f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f.f;
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

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
