// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class il extends FrameLayout {
    public boolean a;
    public int b;
    public hn c;
    public hn d;

    public hn getSubtitleTextView() {
        return this.d;
    }

    public hn getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        hn hnVar = this.d;
        hn hnVar2 = this.c;
        int D = ug8.D(42.0f, a.getCurrentActionBarHeight(), 2) + (this.a ? gl.m : 0);
        int i5 = this.b;
        if (hnVar.getVisibility() != 8) {
            hnVar2.layout(i5, (gl.L(1.0f) + D) - hnVar2.getPaddingTop(), hnVar2.getMeasuredWidth() + i5, hnVar2.getPaddingBottom() + ((gl.L(1.3f) + (hnVar2.getTextHeight() + D)) - hnVar2.getPaddingTop()));
        } else {
            hnVar2.layout(i5, (gl.L(11.0f) + D) - hnVar2.getPaddingTop(), hnVar2.getMeasuredWidth() + i5, hnVar2.getPaddingBottom() + ((gl.L(11.0f) + (hnVar2.getTextHeight() + D)) - hnVar2.getPaddingTop()));
        }
        hnVar.layout(i5, gl.L(20.0f) + D, hnVar.getMeasuredWidth() + i5, gl.L(24.0f) + hnVar.getTextHeight() + D);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        hn hnVar = this.c;
        int paddingRight = hnVar.getPaddingRight() + size;
        int L = paddingRight - gl.L(16.0f);
        hnVar.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hnVar.getPaddingRight() + gl.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i2));
    }
}
