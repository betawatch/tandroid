// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hg3 extends zm2 {
    public int E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ Drawable G;
    public final /* synthetic */ ii3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg3(ii3 ii3Var, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = ii3Var;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override // zm2, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ii3 ii3Var = this.H;
        int i = ii3Var.b;
        int f = ii3Var.f(i == 0 ? aob.s8 : aob.M8);
        if (this.E != f) {
            this.E = f;
            int f2 = vm2.f(0.1f, ii3Var.f(i == 0 ? aob.A8 : aob.P8), f);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f2, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f, mode));
        }
        super.draw(canvas);
    }
}
