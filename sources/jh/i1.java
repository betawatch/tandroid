package jh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i1 extends zg.c implements vd.b {
    public static final /* synthetic */ int s = 0;
    public final vd.c f;
    public final ag.i0 h;
    public final zg.b[] n;
    public int r;

    public i1(Context context, org.telegram.ui.ActionBar.c6 c6Var, ag.i0 i0Var) {
        super(context);
        this.f = new vd.c(0, this, jr.h, 1600L);
        this.h = i0Var;
        int i10 = org.telegram.ui.ActionBar.g6.Wk;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.09411765f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        org.telegram.ui.ActionBar.g6.l1(0.1254902f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.e.setColor(l1);
        int i11 = 1;
        this.n = new zg.b[]{zg.b.b(context, c6Var, zg.a.C, R.string.GiftPreviewModels), zg.b.b(context, c6Var, zg.a.v, R.string.GiftPreviewBackdrops), zg.b.b(context, c6Var, zg.a.F, R.string.GiftPreviewSymbols)};
        int i12 = 0;
        while (true) {
            zg.b[] bVarArr = this.n;
            if (i12 >= bVarArr.length) {
                bVarArr[0].e(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i12], i7.f6.l(1.0f, 0, -1));
                this.n[i12].setOnClickListener(new y0(this, i12, i11));
                i12++;
            }
        }
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.r;
        if (i11 != i10) {
            zg.b[] bVarArr = this.n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.r = i10;
            this.f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f9 = this.f.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f9 / 3.0f);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f9 + 1.0f) / 3.0f);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.c;
        rect.set((int) lerp, AndroidUtilities.dp(8.0f), (int) lerp2, measuredHeight);
        int dp = AndroidUtilities.dp(this.b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f9 - 1.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
