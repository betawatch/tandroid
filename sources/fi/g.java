package fi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fq;
import org.telegram.ui.qv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g extends fq {
    public int E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ Drawable G;
    public final /* synthetic */ qv H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qv qvVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = qvVar;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override // org.telegram.ui.Components.fq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        qv qvVar = this.H;
        int i7 = qvVar.b;
        int f10 = qvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
        if (this.E != f10) {
            this.E = f10;
            int f11 = i0.a.f(0.1f, qvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.j6.A8 : org.telegram.ui.ActionBar.j6.P8), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
