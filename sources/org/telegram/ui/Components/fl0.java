package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fl0 extends f2.u0 implements og.a {
    public final Utilities.CallbackReturn a;
    public final rl0 b;
    public final int c;
    public final boolean d;

    public fl0(rl0 rl0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z4) {
        this.b = rl0Var;
        this.a = callbackReturn;
        this.c = i10;
        this.d = z4;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int b10;
        if (((Boolean) this.a.run(view)).booleanValue()) {
            int i10 = this.c;
            rect.right = i10;
            rect.left = i10;
            f2.l1 T = recyclerView.T(view);
            f2.o0 adapter = recyclerView.getAdapter();
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

    @Override // f2.u0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof rl0) {
            ((rl0) recyclerView).P0(canvas);
        }
    }

    @Override // og.a
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.P0(canvas);
        canvas.restore();
    }

    @Override // og.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }
}
