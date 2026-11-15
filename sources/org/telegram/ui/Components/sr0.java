package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class sr0 extends uj0 implements fi.z6 {
    public int f3;
    public int g3;
    public int h3;
    public int i3;
    public boolean j3;

    @Override // fi.z6
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
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f3 = i10;
        this.g3 = i12;
        super.setPadding(i7, i10, i11, i12);
    }
}
