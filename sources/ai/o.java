package ai;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pq;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class o extends pq {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ lx G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lx lxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = lxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.pq, android.graphics.drawable.Drawable
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
