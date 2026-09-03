package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p0 extends pv0 {
    public final /* synthetic */ u0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u0 u0Var, Context context) {
        super(context, null);
        this.t0 = u0Var;
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void U(Drawable drawable) {
        if (drawable instanceof fc0) {
            ((fc0) drawable).p();
        }
        u0 u0Var = this.t0;
        u0Var.d.a = u0Var.c.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.I) {
            return super.drawChild(canvas, view, j10);
        }
        u0 u0Var = this.t0;
        tg.a aVar = u0Var.d.a;
        if (aVar instanceof tg.b) {
            ((tg.b) aVar).c(getWidth(), getHeight());
        }
        u0Var.d.I(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override // org.telegram.ui.Components.pv0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.t0.y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.t0.o();
    }
}
