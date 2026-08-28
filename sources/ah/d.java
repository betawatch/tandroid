package ah;

import android.graphics.Canvas;
import android.graphics.Rect;
import ff.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.qi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d extends c {
    public final i6 d;
    public final qi0 e;
    public final td.a f;
    public float h;

    public d(t1 t1Var, b6 b6Var) {
        super(b6Var);
        qi0 qi0Var = new qi0(t1Var);
        this.e = qi0Var;
        qi0Var.d(null, true, false);
        qi0Var.v = 650.0f;
        qi0Var.e(0.69f, false);
        qi0Var.p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f = new td.a(t1Var, gr.h, 260L);
        i6 i6Var = new i6(true, false, false, false);
        this.d = i6Var;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.b = 17;
        int v02 = f6.v0(f6.i6, b6Var);
        if (this.b != v02) {
            f6.B1(this.a, v02, false);
            this.b = v02;
        }
    }

    @Override // ah.c
    public final void a(int i9) {
        this.a.setAlpha(i9);
        this.d.w = i9;
    }

    public final float b() {
        return this.f.e;
    }

    public final void c(int i9) {
        this.d.r(i9);
        this.e.o = i9;
    }

    public final void d(float f10) {
        if (this.h != f10) {
            this.h = f10;
            Rect bounds = getBounds();
            int i9 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i9, bounds.right, bounds.bottom + i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = this.f.e;
        if (f10 < 1.0f) {
            s.b(canvas, this.d, 1.0f - f10);
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

    @Override // ah.c, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i9 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i9, bounds.right, bounds.bottom + i9);
        int dp = AndroidUtilities.dp(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
