package di;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;
import org.telegram.ui.pv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g extends xp {
    public int D;
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ pv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pv pvVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = pvVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.xp, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        pv pvVar = this.G;
        int i7 = pvVar.b;
        int f10 = pvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.k6.s8 : org.telegram.ui.ActionBar.k6.M8);
        if (this.D != f10) {
            this.D = f10;
            int f11 = i0.a.f(0.1f, pvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.k6.A8 : org.telegram.ui.ActionBar.k6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
