// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f88 extends si4 {
    public final /* synthetic */ pj4 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f88(PhotoViewer photoViewer, pj4 pj4Var) {
        super(false);
        this.f = photoViewer;
        this.e = pj4Var;
    }

    @Override // yu9
    public final CharSequence d() {
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        String str = k96.G(iArr[0], "Minutes", new Object[0]) + ' ' + k96.G(iArr[1], "Seconds", new Object[0]);
        int[] iArr2 = photoViewer.n3;
        return k96.a0("AccDescrPlayerDuration", null, 2131754805, str, k96.G(iArr2[0], "Minutes", new Object[0]) + ' ' + k96.G(iArr2[1], "Seconds", new Object[0]));
    }

    @Override // si4
    public final float k() {
        return this.f.q3.c();
    }

    @Override // si4
    public final void l(float f) {
        this.e.f(f);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f);
        photoViewer.r3.invalidate();
    }
}
