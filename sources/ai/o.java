package ai;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pq;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class o extends pq {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ nx G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nx nxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = nxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.pq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        nx nxVar = this.G;
        int i10 = nxVar.b;
        int f7 = nxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
        if (this.y != f7) {
            this.y = f7;
            int d = i0.a.d(0.1f, nxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.A8 : org.telegram.ui.ActionBar.j6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
