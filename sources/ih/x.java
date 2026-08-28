package ih;

import android.view.TextureView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class x extends TextureView {
    @Override // android.view.View
    public void invalidate() {
        if (v.c) {
            v.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (v.c) {
            v.b.add(this);
        } else {
            super.invalidate(i9, i10, i11, i12);
        }
    }
}
