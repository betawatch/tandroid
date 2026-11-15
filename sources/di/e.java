package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements ht0, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ e(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.c f10 = h1Var.f(527);
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
                uj0 uj0Var = (uj0) recyclerView;
                ih.d.a(uj0Var, canvas, rectF, uj0Var, this.b);
                break;
            case 1:
                uj0 uj0Var2 = (uj0) recyclerView;
                ih.d.a(uj0Var2, canvas, rectF, uj0Var2, this.b);
                break;
            default:
                uj0 uj0Var3 = (uj0) recyclerView;
                ih.d.a(uj0Var3, canvas, rectF, uj0Var3, this.b);
                break;
        }
    }
}
