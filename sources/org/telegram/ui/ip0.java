package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ip0 extends org.telegram.ui.Components.mz {
    public final /* synthetic */ ro0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(PhotoViewer photoViewer, ro0 ro0Var) {
        super(false);
        this.f = photoViewer;
        this.e = ro0Var;
    }

    @Override // org.telegram.ui.Components.km0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.l3;
        sb2.append(org.telegram.messenger.hd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.hd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.m3;
        sb4.append(org.telegram.messenger.hd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.hd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override // org.telegram.ui.Components.mz
    public final float k() {
        return this.f.p3.c();
    }

    @Override // org.telegram.ui.Components.mz
    public final void l(float f10) {
        this.e.a(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.p3.h(false, f10);
        photoViewer.q3.invalidate();
    }
}
