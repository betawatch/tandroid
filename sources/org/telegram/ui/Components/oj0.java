package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class oj0 extends v4.o0 implements eh.a {
    public final org.telegram.messenger.z10 a;
    public final ek0 b;
    public final int c;
    public final boolean d;

    public oj0(ek0 ek0Var, org.telegram.messenger.z10 z10Var, int i7, boolean z10) {
        this.b = ek0Var;
        this.a = z10Var;
        this.c = i7;
        this.d = z10;
    }

    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.P0(canvas);
        canvas.restore();
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int b10;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i7 = this.c;
            rect.right = i7;
            rect.left = i7;
            v4.f1 T = recyclerView.T(view);
            v4.i0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            boolean z10 = b10 == 0;
            boolean z11 = b10 == adapter.b() - 1;
            if (z10) {
                rect.top = this.d ? i7 : org.telegram.messenger.g0.L(4.0f);
            }
            if (z11) {
                rect.bottom = i7;
            }
        }
    }

    @Override // v4.o0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof ek0) {
            ((ek0) recyclerView).P0(canvas);
        }
    }
}
