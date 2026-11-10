package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ht0, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ f(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = h1Var.f(527);
            rect.set(f10.a, f10.b, f10.c, f10.d);
        } else {
            rect.set(h1Var.i().a, h1Var.i().b, h1Var.i().c, h1Var.i().d);
        }
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.n;
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(i7, i10, i11, i12);
        frameLayout.requestLayout();
        return k1Var;
    }

    @Override // org.telegram.ui.Components.ht0
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                pj0 pj0Var = (pj0) recyclerView;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, this.b);
                break;
            case 1:
                pj0 pj0Var2 = (pj0) recyclerView;
                ih.d.a(pj0Var2, canvas, rectF, pj0Var2, this.b);
                break;
            default:
                pj0 pj0Var3 = (pj0) recyclerView;
                ih.d.a(pj0Var3, canvas, rectF, pj0Var3, this.b);
                break;
        }
    }
}
