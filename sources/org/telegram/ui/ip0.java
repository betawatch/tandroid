package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ip0 extends org.telegram.ui.Components.wz {
    public final /* synthetic */ fo0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(PhotoViewer photoViewer, fo0 fo0Var) {
        super(false);
        this.f = photoViewer;
        this.e = fo0Var;
    }

    @Override // org.telegram.ui.Components.ym0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        sb2.append(org.telegram.messenger.gd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.gd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.n3;
        sb4.append(org.telegram.messenger.gd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.gd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.gd.a0("AccDescrPlayerDuration", null, 2131754805, sb3, sb4.toString());
    }

    @Override // org.telegram.ui.Components.wz
    public final float k() {
        return this.f.q3.c();
    }

    @Override // org.telegram.ui.Components.wz
    public final void l(float f10) {
        this.e.e(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f10);
        photoViewer.r3.invalidate();
    }
}
