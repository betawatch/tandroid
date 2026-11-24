// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ia8 extends wk4 {
    public final /* synthetic */ k44 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia8(PhotoViewer photoViewer, k44 k44Var) {
        super(false);
        this.f = photoViewer;
        this.e = k44Var;
    }

    @Override // bx9
    public final CharSequence d() {
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        String str = jb6.G(iArr[0], "Minutes", new Object[0]) + ' ' + jb6.G(iArr[1], "Seconds", new Object[0]);
        int[] iArr2 = photoViewer.n3;
        return jb6.a0("AccDescrPlayerDuration", null, 2131754805, str, jb6.G(iArr2[0], "Minutes", new Object[0]) + ' ' + jb6.G(iArr2[1], "Seconds", new Object[0]));
    }

    @Override // wk4
    public final float k() {
        return this.f.q3.c();
    }

    @Override // wk4
    public final void l(float f) {
        this.e.f(f);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f);
        photoViewer.r3.invalidate();
    }
}
