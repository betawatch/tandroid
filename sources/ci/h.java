package ci;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zq;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class h extends zq {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ tw G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(tw twVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = twVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.zq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        tw twVar = this.G;
        int i10 = twVar.b;
        int f7 = twVar.f(i10 == 0 ? org.telegram.ui.ActionBar.h6.s8 : org.telegram.ui.ActionBar.h6.M8);
        if (this.y != f7) {
            this.y = f7;
            int f10 = i0.a.f(0.1f, twVar.f(i10 == 0 ? org.telegram.ui.ActionBar.h6.A8 : org.telegram.ui.ActionBar.h6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
