package lh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.jq;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f extends jq {
    public final /* synthetic */ Drawable A;
    public final /* synthetic */ Drawable B;
    public final /* synthetic */ xw C;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xw xwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.C = xwVar;
        this.A = drawable3;
        this.B = drawable4;
    }

    @Override // org.telegram.ui.Components.jq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        xw xwVar = this.C;
        int i10 = xwVar.b;
        int f9 = xwVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.s8 : org.telegram.ui.ActionBar.g6.M8);
        if (this.y != f9) {
            this.y = f9;
            int d = i0.a.d(0.1f, xwVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.A8 : org.telegram.ui.ActionBar.g6.P8), f9);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.A.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.B.setColorFilter(new PorterDuffColorFilter(f9, mode));
        }
        super.draw(canvas);
    }
}
