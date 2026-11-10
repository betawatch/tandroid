package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lp0 extends org.telegram.ui.Components.mz {
    public final /* synthetic */ uo0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(PhotoViewer photoViewer, uo0 uo0Var) {
        super(false);
        this.f = photoViewer;
        this.e = uo0Var;
    }

    @Override // org.telegram.ui.Components.km0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.l3;
        sb2.append(org.telegram.messenger.id.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.id.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.m3;
        sb4.append(org.telegram.messenger.id.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.id.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.id.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
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
