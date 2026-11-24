// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i6c extends NestedScrollView {
    public boolean W;
    public final /* synthetic */ j6c a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6c(j6c j6cVar, Context context) {
        super(context);
        this.a0 = j6cVar;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a0.E0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r8 < (gl.L(90.0f) + (r0 / 2))) goto L6;
     */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        LinearLayout linearLayout = this.a0.p1;
        measureChildWithMargins(linearLayout, i, 0, i2, 0);
        int measuredHeight = linearLayout.getMeasuredHeight();
        int i3 = (size / 5) << 1;
        if (measuredHeight - (size - i3) >= gl.L(90.0f)) {
        }
        i3 = size - measuredHeight;
        if (i3 < 0) {
            i3 = 0;
        }
        if (getPaddingTop() != i3) {
            this.W = true;
            setPadding(0, i3, 0, 0);
            this.W = false;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.a0.E0();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }
}
