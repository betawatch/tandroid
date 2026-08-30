package nh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class v extends r7 {
    @Override // android.view.View
    public final void invalidate() {
        if (u.c) {
            u.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (u.c) {
            u.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
