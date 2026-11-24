// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b1a extends cja {
    public int m0;
    public final /* synthetic */ h1a n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1a(h1a h1aVar, Context context) {
        super(context, null);
        this.n0 = h1aVar;
        this.m0 = -1;
    }

    @Override // cja
    public final boolean O() {
        return false;
    }

    @Override // cja
    public final boolean P() {
        return false;
    }

    @Override // cja
    public final void S() {
        this.n0.n1.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.M) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h1a h1aVar = this.n0;
        LinearLayout linearLayout = h1aVar.d2;
        linearLayout.setTranslationY(((i4 - i2) - linearLayout.getMeasuredHeight()) / 2.0f);
        uk1 uk1Var = h1aVar.f2;
        uk1Var.k0(uk1Var.getY() + linearLayout.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.m0 != -1) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            int i3 = this.m0;
            if (measuredHeight < i3) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max(i3, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i, i2);
        int i4 = this.m0;
        if (i4 == -1) {
            this.m0 = Math.max(i4, getMeasuredHeight());
        }
    }
}
