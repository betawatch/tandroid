package di;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ar;
import org.telegram.ui.qw;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h extends ar {
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ qw G;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qw qwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = qwVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.ar, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        qw qwVar = this.G;
        int i10 = qwVar.b;
        int f7 = qwVar.f(i10 == 0 ? org.telegram.ui.ActionBar.y6.s8 : org.telegram.ui.ActionBar.y6.M8);
        if (this.y != f7) {
            this.y = f7;
            int f10 = i0.a.f(0.1f, qwVar.f(i10 == 0 ? org.telegram.ui.ActionBar.y6.A8 : org.telegram.ui.ActionBar.y6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
