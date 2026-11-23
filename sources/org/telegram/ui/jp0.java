package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class jp0 extends org.telegram.ui.Components.zz {
    public final /* synthetic */ so0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(PhotoViewer photoViewer, so0 so0Var) {
        super(false);
        this.f = photoViewer;
        this.e = so0Var;
    }

    @Override // org.telegram.ui.Components.zm0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        sb2.append(org.telegram.messenger.hd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.hd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.n3;
        sb4.append(org.telegram.messenger.hd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.hd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754805, sb3, sb4.toString());
    }

    @Override // org.telegram.ui.Components.zz
    public final float k() {
        return this.f.q3.c();
    }

    @Override // org.telegram.ui.Components.zz
    public final void l(float f10) {
        this.e.a(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f10);
        photoViewer.r3.invalidate();
    }
}
