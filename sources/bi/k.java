package bi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.cr;
import org.telegram.ui.px;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k extends cr {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ px G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(px pxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = pxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.cr, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        px pxVar = this.G;
        int i10 = pxVar.b;
        int f7 = pxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.s8 : org.telegram.ui.ActionBar.g6.M8);
        if (this.y != f7) {
            this.y = f7;
            int d = i0.a.d(0.1f, pxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.A8 : org.telegram.ui.ActionBar.g6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
