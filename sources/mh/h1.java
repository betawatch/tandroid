package mh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h1 extends ch.c implements xd.b {
    public static final /* synthetic */ int s = 0;
    public final xd.c f;
    public final dg.h0 h;
    public final ch.b[] n;
    public int r;

    public h1(Context context, org.telegram.ui.ActionBar.g6 g6Var, dg.h0 h0Var) {
        super(context);
        this.f = new xd.c(0, this, pr.h, 1600L);
        this.h = h0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Wk;
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.09411765f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        org.telegram.ui.ActionBar.k6.l1(0.1254902f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.e.setColor(l1);
        int i11 = 1;
        this.n = new ch.b[]{ch.b.b(context, g6Var, ch.a.D, R.string.GiftPreviewModels), ch.b.b(context, g6Var, ch.a.v, R.string.GiftPreviewBackdrops), ch.b.b(context, g6Var, ch.a.G, R.string.GiftPreviewSymbols)};
        int i12 = 0;
        while (true) {
            ch.b[] bVarArr = this.n;
            if (i12 >= bVarArr.length) {
                bVarArr[0].e(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i12], k7.c6.l(1.0f, 0, -1));
                this.n[i12].setOnClickListener(new x0(this, i12, i11));
                i12++;
            }
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.r;
        if (i11 != i10) {
            ch.b[] bVarArr = this.n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.r = i10;
            this.f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f10 = this.f.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f10 / 3.0f);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f10 + 1.0f) / 3.0f);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.c;
        rect.set((int) lerp, AndroidUtilities.dp(8.0f), (int) lerp2, measuredHeight);
        int dp = AndroidUtilities.dp(this.b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f10 - 1.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
