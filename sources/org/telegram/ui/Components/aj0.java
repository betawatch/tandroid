package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class aj0 extends v4.m0 implements eh.a {
    public final org.telegram.messenger.d20 a;
    public final qj0 b;
    public final int c;
    public final boolean d;

    public aj0(qj0 qj0Var, org.telegram.messenger.d20 d20Var, int i7, boolean z9) {
        this.b = qj0Var;
        this.a = d20Var;
        this.c = i7;
        this.d = z9;
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

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int b10;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i7 = this.c;
            rect.right = i7;
            rect.left = i7;
            v4.d1 T = recyclerView.T(view);
            v4.g0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            boolean z9 = b10 == 0;
            boolean z10 = b10 == adapter.b() - 1;
            if (z9) {
                rect.top = this.d ? i7 : org.telegram.messenger.g0.L(4.0f);
            }
            if (z10) {
                rect.bottom = i7;
            }
        }
    }

    @Override // v4.m0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof qj0) {
            ((qj0) recyclerView).P0(canvas);
        }
    }
}
