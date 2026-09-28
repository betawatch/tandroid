package ai;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.rq;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class o extends rq {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ hx G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hx hxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = hxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.rq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        hx hxVar = this.G;
        int i10 = hxVar.b;
        int f7 = hxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.h6.s8 : org.telegram.ui.ActionBar.h6.M8);
        if (this.y != f7) {
            this.y = f7;
            int d = i0.a.d(0.1f, hxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.h6.A8 : org.telegram.ui.ActionBar.h6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
