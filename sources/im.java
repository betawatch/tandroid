// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class im extends FrameLayout {
    public boolean a;
    public int b;
    public io c;
    public io d;

    public io getSubtitleTextView() {
        return this.d;
    }

    public io getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        io ioVar = this.d;
        io ioVar2 = this.c;
        int D = wi8.D(42.0f, a.getCurrentActionBarHeight(), 2) + (this.a ? gm.m : 0);
        int i5 = this.b;
        if (ioVar.getVisibility() != 8) {
            ioVar2.layout(i5, (gm.L(1.0f) + D) - ioVar2.getPaddingTop(), ioVar2.getMeasuredWidth() + i5, ioVar2.getPaddingBottom() + ((gm.L(1.3f) + (ioVar2.getTextHeight() + D)) - ioVar2.getPaddingTop()));
        } else {
            ioVar2.layout(i5, (gm.L(11.0f) + D) - ioVar2.getPaddingTop(), ioVar2.getMeasuredWidth() + i5, ioVar2.getPaddingBottom() + ((gm.L(11.0f) + (ioVar2.getTextHeight() + D)) - ioVar2.getPaddingTop()));
        }
        ioVar.layout(i5, gm.L(20.0f) + D, ioVar.getMeasuredWidth() + i5, gm.L(24.0f) + ioVar.getTextHeight() + D);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        io ioVar = this.c;
        int paddingRight = ioVar.getPaddingRight() + size;
        int L = paddingRight - gm.L(16.0f);
        ioVar.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(ioVar.getPaddingRight() + gm.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i2));
    }
}
