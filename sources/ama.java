// default package

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ama extends v46 {
    public final /* synthetic */ coc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ama(coc cocVar, Context context) {
        super(context);
        this.r = cocVar;
    }

    @Override // v46, q69
    public final void g(View view, p69 p69Var) {
        va vaVar = this.r.a;
        if (vaVar != null) {
            f69 layoutManager = vaVar.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, f69.y(view) - layoutManager.E()};
            int i = iArr[0];
            int i2 = iArr[1];
            int m = m(Math.max(Math.abs(i), Math.abs(i2)));
            if (m > 0) {
                p69Var.b(i, i2, m, this.j);
            }
        }
    }

    @Override // v46
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
