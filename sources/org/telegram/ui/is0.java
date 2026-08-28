package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class is0 extends org.telegram.ui.Components.f00 {
    public final /* synthetic */ qr0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(PhotoViewer photoViewer, qr0 qr0Var) {
        super(false);
        this.f = photoViewer;
        this.e = qr0Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.i3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.j3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override // org.telegram.ui.Components.f00
    public final float k() {
        return this.f.m3.c();
    }

    @Override // org.telegram.ui.Components.f00
    public final void l(float f10) {
        this.e.b(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.m3.h(f10, false);
        photoViewer.n3.invalidate();
    }
}
