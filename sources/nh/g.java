package nh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mq;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class g extends mq {
    public final /* synthetic */ Drawable B;
    public final /* synthetic */ Drawable C;
    public final /* synthetic */ ix D;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ix ixVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.D = ixVar;
        this.B = drawable3;
        this.C = drawable4;
    }

    @Override // org.telegram.ui.Components.mq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ix ixVar = this.D;
        int i10 = ixVar.b;
        int f10 = ixVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
        if (this.y != f10) {
            this.y = f10;
            int d = i0.a.d(0.1f, ixVar.f(i10 == 0 ? org.telegram.ui.ActionBar.j6.A8 : org.telegram.ui.ActionBar.j6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.B.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.C.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
