package bi;

import android.view.TextureView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class d0 extends TextureView {
    @Override // android.view.View
    public void invalidate() {
        if (b0.c) {
            b0.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (b0.c) {
            b0.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
