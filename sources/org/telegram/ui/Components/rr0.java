package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class rr0 extends pj0 implements di.f7 {
    public int e3;
    public int f3;
    public int g3;
    public int h3;
    public boolean i3;

    @Override // di.f7
    public final void a(int[] iArr) {
        if (this.i3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
        } else {
            iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.g3;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.h3;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.e3 = i10;
        this.f3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
