package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
