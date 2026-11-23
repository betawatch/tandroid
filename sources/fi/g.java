package fi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.lq;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g extends lq {
    public int E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ Drawable G;
    public final /* synthetic */ sv H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sv svVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = svVar;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override // org.telegram.ui.Components.lq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        sv svVar = this.H;
        int i7 = svVar.b;
        int f10 = svVar.f(i7 == 0 ? org.telegram.ui.ActionBar.n6.s8 : org.telegram.ui.ActionBar.n6.M8);
        if (this.E != f10) {
            this.E = f10;
            int f11 = i0.a.f(0.1f, svVar.f(i7 == 0 ? org.telegram.ui.ActionBar.n6.A8 : org.telegram.ui.ActionBar.n6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
