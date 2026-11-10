package di;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g extends xp {
    public int D;
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ sv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sv svVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = svVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.xp, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        sv svVar = this.G;
        int i7 = svVar.b;
        int f10 = svVar.f(i7 == 0 ? org.telegram.ui.ActionBar.m6.s8 : org.telegram.ui.ActionBar.m6.M8);
        if (this.D != f10) {
            this.D = f10;
            int f11 = i0.a.f(0.1f, svVar.f(i7 == 0 ? org.telegram.ui.ActionBar.m6.A8 : org.telegram.ui.ActionBar.m6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
