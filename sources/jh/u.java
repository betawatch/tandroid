package jh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class u extends q7 {
    @Override // android.view.View
    public final void invalidate() {
        if (t.c) {
            t.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (t.c) {
            t.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
