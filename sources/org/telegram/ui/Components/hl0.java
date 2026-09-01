package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hl0 extends f2.v0 implements pg.a {
    public final Utilities.CallbackReturn a;
    public final tl0 b;
    public final int c;
    public final boolean d;

    public hl0(tl0 tl0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z4) {
        this.b = tl0Var;
        this.a = callbackReturn;
        this.c = i10;
        this.d = z4;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        int b10;
        if (((Boolean) this.a.run(view)).booleanValue()) {
            int i10 = this.c;
            rect.right = i10;
            rect.left = i10;
            f2.m1 T = recyclerView.T(view);
            f2.p0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            boolean z4 = b10 == 0;
            boolean z10 = b10 == adapter.h() - 1;
            if (z4) {
                rect.top = this.d ? i10 : AndroidUtilities.dp(4.0f);
            }
            if (z10) {
                rect.bottom = i10;
            }
        }
    }

    @Override // f2.v0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof tl0) {
            ((tl0) recyclerView).Q0(canvas);
        }
    }

    @Override // pg.a
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.Q0(canvas);
        canvas.restore();
    }

    @Override // pg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }
}
