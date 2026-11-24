// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ah3 extends sn2 {
    public int E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ Drawable G;
    public final /* synthetic */ aj3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah3(aj3 aj3Var, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = aj3Var;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override // sn2, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        aj3 aj3Var = this.H;
        int i = aj3Var.b;
        int f = aj3Var.f(i == 0 ? cmb.r8 : cmb.L8);
        if (this.E != f) {
            this.E = f;
            int f2 = on2.f(0.1f, aj3Var.f(i == 0 ? cmb.z8 : cmb.O8), f);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f2, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f, mode));
        }
        super.draw(canvas);
    }
}
