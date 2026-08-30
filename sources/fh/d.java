package fh;

import android.graphics.Canvas;
import android.graphics.Rect;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d extends c {
    public final j6 d;
    public final kj0 e;
    public final xd.a f;
    public float h;

    public d(t1 t1Var, f6 f6Var) {
        super(f6Var);
        kj0 kj0Var = new kj0(t1Var);
        this.e = kj0Var;
        kj0Var.d(null, true, false);
        kj0Var.v = 650.0f;
        kj0Var.e(0.69f, false);
        kj0Var.p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f = new xd.a(t1Var, nr.h, 260L);
        j6 j6Var = new j6(true, false, false, false);
        this.d = j6Var;
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(13.0f));
        j6Var.b = 17;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var);
        if (this.b != v02) {
            org.telegram.ui.ActionBar.j6.B1(this.a, v02, false);
            this.b = v02;
        }
    }

    @Override // fh.c
    public final void a(int i10) {
        this.a.setAlpha(i10);
        this.d.w = i10;
    }

    public final float b() {
        return this.f.e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.e.o = i10;
    }

    public final void d(float f10) {
        if (this.h != f10) {
            this.h = f10;
            Rect bounds = getBounds();
            int i10 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = this.f.e;
        if (f10 < 1.0f) {
            r.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.e.a(canvas);
            canvas.restore();
        }
    }

    @Override // fh.c, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i10 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        int dp = AndroidUtilities.dp(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
