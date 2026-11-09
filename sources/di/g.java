package di;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g extends xp {
    public int D;
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ rv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(rv rvVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = rvVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.xp, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        rv rvVar = this.G;
        int i7 = rvVar.b;
        int f10 = rvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.l6.s8 : org.telegram.ui.ActionBar.l6.M8);
        if (this.D != f10) {
            this.D = f10;
            int f11 = i0.a.f(0.1f, rvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.l6.A8 : org.telegram.ui.ActionBar.l6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
