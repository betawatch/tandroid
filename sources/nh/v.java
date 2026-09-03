package nh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
