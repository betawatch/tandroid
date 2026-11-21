package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.du0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class w8 extends du0 {
    public int g0;
    public final /* synthetic */ d9 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(d9 d9Var, Context context) {
        super(context, null);
        this.h0 = d9Var;
        this.g0 = -1;
    }

    @Override // org.telegram.ui.Components.du0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.du0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.du0
    public final void S() {
        this.h0.o1.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.M) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        d9 d9Var = this.h0;
        d9Var.e2.setTranslationY(((i12 - i10) - r4.getMeasuredHeight()) / 2.0f);
        d9Var.g2.k0(d9Var.g2.getY() + d9Var.e2.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.g0 != -1) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.g0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i7, i10);
        int i12 = this.g0;
        if (i12 == -1) {
            this.g0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
