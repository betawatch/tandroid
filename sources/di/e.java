package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements rt0, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ e(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.rt0
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                ek0 ek0Var = (ek0) recyclerView;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, this.b);
                break;
            case 1:
                ek0 ek0Var2 = (ek0) recyclerView;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, this.b);
                break;
            default:
                ek0 ek0Var3 = (ek0) recyclerView;
                ih.d.a(ek0Var3, canvas, rectF, ek0Var3, this.b);
                break;
        }
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = i1Var.f(527);
            rect.set(f10.a, f10.b, f10.c, f10.d);
        } else {
            rect.set(i1Var.i().a, i1Var.i().b, i1Var.i().c, i1Var.i().d);
        }
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.n;
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(i7, i10, i11, i12);
        frameLayout.requestLayout();
        return l1Var;
    }
}
