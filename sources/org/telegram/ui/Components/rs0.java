package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class rs0 extends tk0 implements th.l5 {
    public int e3;
    public int f3;
    public int g3;
    public int h3;
    public boolean i3;

    @Override // th.l5
    public final void a(int[] iArr) {
        if (this.i3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.i0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
        } else {
            iArr[0] = (getPaddingTop() - org.telegram.messenger.i0.L(2.0f)) - this.g3;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.h3;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.e3 = i11;
        this.f3 = i13;
        super.setPadding(i10, i11, i12, i13);
    }
}
