package ai;

import android.view.TextureView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public abstract class k0 extends TextureView {
    @Override // android.view.View
    public void invalidate() {
        if (i0.c) {
            i0.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (i0.c) {
            i0.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
