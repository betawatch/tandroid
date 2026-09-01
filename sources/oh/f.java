package oh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pq;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class f extends pq {
    public final /* synthetic */ Drawable B;
    public final /* synthetic */ Drawable C;
    public final /* synthetic */ hx D;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hx hxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.D = hxVar;
        this.B = drawable3;
        this.C = drawable4;
    }

    @Override // org.telegram.ui.Components.pq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        hx hxVar = this.D;
        int i10 = hxVar.b;
        int f10 = hxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.k6.s8 : org.telegram.ui.ActionBar.k6.M8);
        if (this.y != f10) {
            this.y = f10;
            int d = i0.a.d(0.1f, hxVar.f(i10 == 0 ? org.telegram.ui.ActionBar.k6.A8 : org.telegram.ui.ActionBar.k6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.B.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.C.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
