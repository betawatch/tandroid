package bi;

import android.view.TextureView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
