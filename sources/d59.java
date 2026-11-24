// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d59 extends e69 implements vi5 {
    public final rac a;
    public final r59 b;
    public final int c;
    public final boolean d;

    public d59(r59 r59Var, rac racVar, int i, boolean z) {
        this.b = r59Var;
        this.a = racVar;
        this.c = i;
        this.d = z;
    }

    @Override // vi5
    public final void a(ucb ucbVar, RectF rectF) {
        ucbVar.b = true;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        int b;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i = this.c;
            rect.right = i;
            rect.left = i;
            u69 T = recyclerView.T(view);
            y59 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b = T.b()) == -1) {
                return;
            }
            boolean z = b == 0;
            boolean z2 = b == adapter.b() - 1;
            if (z) {
                rect.top = this.d ? i : gm.L(4.0f);
            }
            if (z2) {
                rect.bottom = i;
            }
        }
    }

    @Override // e69
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof r59) {
            ((r59) recyclerView).Q0(canvas);
        }
    }

    @Override // vi5
    public final void g(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.Q0(canvas);
        canvas.restore();
    }
}
