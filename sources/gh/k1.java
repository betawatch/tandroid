package gh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k1 extends wg.c implements td.b {
    public static final /* synthetic */ int s = 0;
    public final td.c f;
    public final bg.i h;
    public final wg.b[] n;
    public int r;

    public k1(Context context, org.telegram.ui.ActionBar.b6 b6Var, bg.i iVar) {
        super(context);
        this.f = new td.c(0, this, gr.h, 1600L);
        this.h = iVar;
        int i9 = org.telegram.ui.ActionBar.f6.Wk;
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.09411765f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        org.telegram.ui.ActionBar.f6.l1(0.1254902f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.e.setColor(l1);
        int i10 = 1;
        this.n = new wg.b[]{wg.b.b(context, b6Var, wg.a.C, R.string.GiftPreviewModels), wg.b.b(context, b6Var, wg.a.v, R.string.GiftPreviewBackdrops), wg.b.b(context, b6Var, wg.a.F, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            wg.b[] bVarArr = this.n;
            if (i11 >= bVarArr.length) {
                bVarArr[0].e(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i11], g7.e6.l(1.0f, 0, -1));
                this.n[i11].setOnClickListener(new z0(this, i11, i10));
                i11++;
            }
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i9) {
        int i10 = this.r;
        if (i10 != i9) {
            wg.b[] bVarArr = this.n;
            bVarArr[i10].e(false, true);
            bVarArr[i9].e(true, true);
            this.r = i9;
            this.f.a(i9);
            this.h.run(Integer.valueOf(i9));
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
        int i9 = -dp;
        rect2.inset(i9, i9);
        Math.abs(f10 - 1.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        b();
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
