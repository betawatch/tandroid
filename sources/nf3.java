// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class nf3 extends fm2 {
    public int E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ Drawable G;
    public final /* synthetic */ oh3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf3(oh3 oh3Var, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = oh3Var;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override // fm2, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        oh3 oh3Var = this.H;
        int i = oh3Var.b;
        int f = oh3Var.f(i == 0 ? bkb.r8 : bkb.L8);
        if (this.E != f) {
            this.E = f;
            int f2 = bm2.f(0.1f, oh3Var.f(i == 0 ? bkb.z8 : bkb.O8), f);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f2, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f, mode));
        }
        super.draw(canvas);
    }
}
