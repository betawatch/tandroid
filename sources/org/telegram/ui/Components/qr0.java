package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class qr0 extends tj0 implements ei.g7 {
    public int f3;
    public int g3;
    public int h3;
    public int i3;
    public boolean j3;

    @Override // ei.g7
    public final void a(int[] iArr) {
        if (this.j3) {
            iArr[0] = getPaddingTop() - org.telegram.messenger.g0.L(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
        } else {
            iArr[0] = (getPaddingTop() - org.telegram.messenger.g0.L(2.0f)) - this.h3;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.i3;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.f3 = i10;
        this.g3 = i12;
        super.setPadding(i3, i10, i11, i12);
    }
}
