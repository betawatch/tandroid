package oh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class u extends r7 {
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
