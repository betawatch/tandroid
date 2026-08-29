package dh;

import android.graphics.Canvas;
import android.graphics.Rect;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d extends c {
    public final n6 d;
    public final bj0 e;
    public final vd.a f;
    public float h;

    public d(s1 s1Var, c6 c6Var) {
        super(c6Var);
        bj0 bj0Var = new bj0(s1Var);
        this.e = bj0Var;
        bj0Var.d(null, true, false);
        bj0Var.v = 650.0f;
        bj0Var.e(0.69f, false);
        bj0Var.p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f = new vd.a(s1Var, jr.h, 260L);
        n6 n6Var = new n6(true, false, false, false);
        this.d = n6Var;
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.b = 17;
        int v02 = g6.v0(g6.i6, c6Var);
        if (this.b != v02) {
            g6.B1(this.a, v02, false);
            this.b = v02;
        }
    }

    @Override // dh.c
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

    public final void d(float f9) {
        if (this.h != f9) {
            this.h = f9;
            Rect bounds = getBounds();
            int i10 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f9 = this.f.e;
        if (f9 < 1.0f) {
            r.b(canvas, this.d, 1.0f - f9);
        }
        if (f9 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f9, f9, exactCenterX, exactCenterY);
            this.e.a(canvas);
            canvas.restore();
        }
    }

    @Override // dh.c, android.graphics.drawable.Drawable
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
