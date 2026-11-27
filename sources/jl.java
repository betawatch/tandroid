// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jl extends FrameLayout {
    public boolean a;
    public int b;
    public in c;
    public in d;

    public in getSubtitleTextView() {
        return this.d;
    }

    public in getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        in inVar = this.d;
        in inVar2 = this.c;
        int D = ik8.D(42.0f, a.getCurrentActionBarHeight(), 2) + (this.a ? hl.m : 0);
        int i5 = this.b;
        if (inVar.getVisibility() != 8) {
            inVar2.layout(i5, (hl.L(1.0f) + D) - inVar2.getPaddingTop(), inVar2.getMeasuredWidth() + i5, inVar2.getPaddingBottom() + ((hl.L(1.3f) + (inVar2.getTextHeight() + D)) - inVar2.getPaddingTop()));
        } else {
            inVar2.layout(i5, (hl.L(11.0f) + D) - inVar2.getPaddingTop(), inVar2.getMeasuredWidth() + i5, inVar2.getPaddingBottom() + ((hl.L(11.0f) + (inVar2.getTextHeight() + D)) - inVar2.getPaddingTop()));
        }
        inVar.layout(i5, hl.L(20.0f) + D, inVar.getMeasuredWidth() + i5, hl.L(24.0f) + inVar.getTextHeight() + D);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        in inVar = this.c;
        int paddingRight = inVar.getPaddingRight() + size;
        int L = paddingRight - hl.L(16.0f);
        inVar.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(inVar.getPaddingRight() + hl.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i2));
    }
}
