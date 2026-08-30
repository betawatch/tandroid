package nh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nq;
import org.telegram.ui.gx;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g extends nq {
    public final /* synthetic */ Drawable B;
    public final /* synthetic */ Drawable C;
    public final /* synthetic */ gx D;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gx gxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.D = gxVar;
        this.B = drawable3;
        this.C = drawable4;
    }

    @Override // org.telegram.ui.Components.nq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        gx gxVar = this.D;
        int i10 = gxVar.b;
        int f10 = gxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
        if (this.y != f10) {
            this.y = f10;
            int d = i0.a.d(0.1f, gxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.A8 : org.telegram.ui.ActionBar.j6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.B.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.C.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
