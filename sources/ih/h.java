package ih;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fq;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h extends fq {
    public final /* synthetic */ Drawable A;
    public final /* synthetic */ Drawable B;
    public final /* synthetic */ vw C;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vw vwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.C = vwVar;
        this.A = drawable3;
        this.B = drawable4;
    }

    @Override // org.telegram.ui.Components.fq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        vw vwVar = this.C;
        int i9 = vwVar.b;
        int f10 = vwVar.f(i9 == 0 ? org.telegram.ui.ActionBar.f6.s8 : org.telegram.ui.ActionBar.f6.M8);
        if (this.y != f10) {
            this.y = f10;
            int d = i0.a.d(0.1f, vwVar.f(i9 == 0 ? org.telegram.ui.ActionBar.f6.A8 : org.telegram.ui.ActionBar.f6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.A.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.B.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
