package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gp0 extends org.telegram.ui.Components.qz {
    public final /* synthetic */ po0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp0(PhotoViewer photoViewer, po0 po0Var) {
        super(false);
        this.f = photoViewer;
        this.e = po0Var;
    }

    @Override // org.telegram.ui.Components.om0
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
        return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override // org.telegram.ui.Components.qz
    public final float k() {
        return this.f.q3.c();
    }

    @Override // org.telegram.ui.Components.qz
    public final void l(float f10) {
        this.e.e(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f10);
        photoViewer.r3.invalidate();
    }
}
