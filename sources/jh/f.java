package jh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.dq;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f extends dq {
    public final /* synthetic */ Drawable A;
    public final /* synthetic */ Drawable B;
    public final /* synthetic */ yw C;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yw ywVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.C = ywVar;
        this.A = drawable3;
        this.B = drawable4;
    }

    @Override // org.telegram.ui.Components.dq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        yw ywVar = this.C;
        int i10 = ywVar.b;
        int f10 = ywVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.s8 : org.telegram.ui.ActionBar.g6.M8);
        if (this.y != f10) {
            this.y = f10;
            int d = i0.b.d(0.1f, ywVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.A8 : org.telegram.ui.ActionBar.g6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.A.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.B.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
