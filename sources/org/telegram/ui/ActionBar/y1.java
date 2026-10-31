package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements r0.m, ju0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ y1(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        r0.g1 g1Var = j1Var.a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.c f7 = g1Var.f(527);
            rect.set(f7.a, f7.b, f7.c, f7.d);
        } else {
            rect.set(g1Var.i().a, g1Var.i().b, g1Var.i().c, g1Var.i().d);
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom + org.telegram.messenger.i0.n;
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(i10, i11, i12, i13);
        frameLayout.requestLayout();
        return j1Var;
    }

    @Override // org.telegram.ui.Components.ju0
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 1:
                tk0 tk0Var = (tk0) recyclerView;
                yg.d.a(tk0Var, canvas, rectF, tk0Var, this.b);
                break;
            case 2:
                tk0 tk0Var2 = (tk0) recyclerView;
                yg.d.a(tk0Var2, canvas, rectF, tk0Var2, this.b);
                break;
            default:
                tk0 tk0Var3 = (tk0) recyclerView;
                yg.d.a(tk0Var3, canvas, rectF, tk0Var3, this.b);
                break;
        }
    }
}
