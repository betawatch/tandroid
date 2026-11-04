package ci;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ft0, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ f(int i3, FrameLayout frameLayout) {
        this.a = i3;
        this.b = frameLayout;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = h1Var.f(527);
            rect.set(f10.a, f10.b, f10.c, f10.d);
        } else {
            rect.set(h1Var.i().a, h1Var.i().b, h1Var.i().c, h1Var.i().d);
        }
        int i3 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.n;
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(i3, i10, i11, i12);
        frameLayout.requestLayout();
        return k1Var;
    }

    @Override // org.telegram.ui.Components.ft0
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                tj0 tj0Var = (tj0) recyclerView;
                jh.d.a(tj0Var, canvas, rectF, tj0Var, this.b);
                break;
            case 1:
                tj0 tj0Var2 = (tj0) recyclerView;
                jh.d.a(tj0Var2, canvas, rectF, tj0Var2, this.b);
                break;
            default:
                tj0 tj0Var3 = (tj0) recyclerView;
                jh.d.a(tj0Var3, canvas, rectF, tj0Var3, this.b);
                break;
        }
    }
}
