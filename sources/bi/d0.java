package bi;

import android.view.TextureView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
