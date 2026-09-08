package bi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oq;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class k extends oq {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ lx G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lx lxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = lxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.oq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        lx lxVar = this.G;
        int i10 = lxVar.b;
        int f7 = lxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
        if (this.y != f7) {
            this.y = f7;
            int d = i0.a.d(0.1f, lxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.A8 : org.telegram.ui.ActionBar.j6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
