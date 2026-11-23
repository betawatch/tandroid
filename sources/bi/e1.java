package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.za0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e1 extends cu0 {
    public final /* synthetic */ k1 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k1 k1Var, Context context) {
        super(context, null);
        this.g0 = k1Var;
    }

    @Override // org.telegram.ui.Components.cu0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.cu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.cu0
    public final void T(Drawable drawable) {
        if (drawable instanceof za0) {
            ((za0) drawable).p();
        }
        k1 k1Var = this.g0;
        k1Var.o1.a = k1Var.n1.c(drawable);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.M) {
            return super.drawChild(canvas, view, j3);
        }
        k1 k1Var = this.g0;
        ui.a aVar = k1Var.o1.a;
        if (aVar instanceof ui.b) {
            ((ui.b) aVar).b(getWidth(), getHeight());
        }
        k1Var.o1.z(0.0f, 0.0f, getWidth(), getHeight(), canvas);
        return false;
    }

    @Override // org.telegram.ui.Components.cu0
    public final Drawable getNewDrawable() {
        Drawable drawable = this.g0.y1;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.cu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.g0.J0();
    }
}
