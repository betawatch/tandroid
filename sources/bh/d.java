package bh;

import android.graphics.Canvas;
import android.graphics.Rect;
import gf.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.si0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d extends c {
    public final i6 d;
    public final si0 e;
    public final ud.a f;
    public float h;

    public d(s1 s1Var, c6 c6Var) {
        super(c6Var);
        si0 si0Var = new si0(s1Var);
        this.e = si0Var;
        si0Var.d(null, true, false);
        si0Var.v = 650.0f;
        si0Var.e(0.69f, false);
        si0Var.p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f = new ud.a(s1Var, er.h, 260L);
        i6 i6Var = new i6(true, false, false, false);
        this.d = i6Var;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.b = 17;
        int v02 = g6.v0(g6.i6, c6Var);
        if (this.b != v02) {
            g6.B1(this.a, v02, false);
            this.b = v02;
        }
    }

    @Override // bh.c
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

    @Override // bh.c, android.graphics.drawable.Drawable
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
