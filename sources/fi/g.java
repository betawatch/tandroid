package fi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oq;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class g extends oq {
    public int E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ Drawable G;
    public final /* synthetic */ tv H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tv tvVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = tvVar;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override // org.telegram.ui.Components.oq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        tv tvVar = this.H;
        int i7 = tvVar.b;
        int f10 = tvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.m6.s8 : org.telegram.ui.ActionBar.m6.M8);
        if (this.E != f10) {
            this.E = f10;
            int f11 = i0.a.f(0.1f, tvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.m6.A8 : org.telegram.ui.ActionBar.m6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
