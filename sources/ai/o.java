package ai;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.sq;
import org.telegram.ui.jx;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class o extends sq {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ jx G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jx jxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = jxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.sq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        jx jxVar = this.G;
        int i10 = jxVar.b;
        int f7 = jxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.i6.s8 : org.telegram.ui.ActionBar.i6.M8);
        if (this.y != f7) {
            this.y = f7;
            int d = i0.a.d(0.1f, jxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.i6.A8 : org.telegram.ui.ActionBar.i6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
