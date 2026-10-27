package di;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ar;
import org.telegram.ui.sw;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h extends ar {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ sw G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sw swVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = swVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.ar, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        sw swVar = this.G;
        int i10 = swVar.b;
        int f7 = swVar.f(i10 == 0 ? org.telegram.ui.ActionBar.y6.s8 : org.telegram.ui.ActionBar.y6.M8);
        if (this.y != f7) {
            this.y = f7;
            int f10 = i0.a.f(0.1f, swVar.f(i10 == 0 ? org.telegram.ui.ActionBar.y6.A8 : org.telegram.ui.ActionBar.y6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
