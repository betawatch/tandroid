package di;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class x extends f8 {
    @Override // android.view.View
    public final void invalidate() {
        if (w.c) {
            w.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (w.c) {
            w.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
