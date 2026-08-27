package hh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k1 extends xg.c implements ud.b {
    public static final /* synthetic */ int s = 0;
    public final ud.c f;
    public final ag.n0 h;
    public final xg.b[] n;
    public int r;

    public k1(Context context, org.telegram.ui.ActionBar.c6 c6Var, ag.n0 n0Var) {
        super(context);
        this.f = new ud.c(0, this, er.h, 1600L);
        this.h = n0Var;
        int i10 = org.telegram.ui.ActionBar.g6.Wk;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.09411765f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        org.telegram.ui.ActionBar.g6.l1(0.1254902f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.e.setColor(l1);
        int i11 = 1;
        this.n = new xg.b[]{xg.b.b(context, c6Var, xg.a.C, R.string.GiftPreviewModels), xg.b.b(context, c6Var, xg.a.v, R.string.GiftPreviewBackdrops), xg.b.b(context, c6Var, xg.a.F, R.string.GiftPreviewSymbols)};
        int i12 = 0;
        while (true) {
            xg.b[] bVarArr = this.n;
            if (i12 >= bVarArr.length) {
                bVarArr[0].e(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i12], h7.z5.l(1.0f, 0, -1));
                this.n[i12].setOnClickListener(new z0(this, i12, i11));
                i12++;
            }
        }
    }

    public final void a(int i10) {
        int i11 = this.r;
        if (i11 != i10) {
            xg.b[] bVarArr = this.n;
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

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        b();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
