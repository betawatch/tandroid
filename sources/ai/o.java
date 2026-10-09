package ai;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fr;
import org.telegram.ui.kx;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class o extends fr {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ kx G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kx kxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = kxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.fr, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        kx kxVar = this.G;
        int i10 = kxVar.b;
        int f7 = kxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.i6.s8 : org.telegram.ui.ActionBar.i6.M8);
        if (this.y != f7) {
            this.y = f7;
            int d = i0.a.d(0.1f, kxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.i6.A8 : org.telegram.ui.ActionBar.i6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
