package ei;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;
import org.telegram.ui.mv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends xp {
    public int E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ Drawable G;
    public final /* synthetic */ mv H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mv mvVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = mvVar;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override // org.telegram.ui.Components.xp, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        mv mvVar = this.H;
        int i3 = mvVar.b;
        int f10 = mvVar.f(i3 == 0 ? org.telegram.ui.ActionBar.k6.s8 : org.telegram.ui.ActionBar.k6.M8);
        if (this.E != f10) {
            this.E = f10;
            int f11 = i0.a.f(0.1f, mvVar.f(i3 == 0 ? org.telegram.ui.ActionBar.k6.A8 : org.telegram.ui.ActionBar.k6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
