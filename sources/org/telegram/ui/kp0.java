package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kp0 extends org.telegram.ui.Components.nz {
    public final /* synthetic */ to0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(PhotoViewer photoViewer, to0 to0Var) {
        super(false);
        this.f = photoViewer;
        this.e = to0Var;
    }

    @Override // org.telegram.ui.Components.lm0
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

    @Override // org.telegram.ui.Components.nz
    public final float k() {
        return this.f.p3.c();
    }

    @Override // org.telegram.ui.Components.nz
    public final void l(float f10) {
        this.e.a(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.p3.h(false, f10);
        photoViewer.q3.invalidate();
    }
}
