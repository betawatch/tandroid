package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class js0 extends org.telegram.ui.Components.i00 {
    public final /* synthetic */ rr0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(PhotoViewer photoViewer, rr0 rr0Var) {
        super(false);
        this.f = photoViewer;
        this.e = rr0Var;
    }

    @Override // org.telegram.ui.Components.nn0
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

    @Override // org.telegram.ui.Components.i00
    public final float k() {
        return this.f.m3.c();
    }

    @Override // org.telegram.ui.Components.i00
    public final void l(float f10) {
        this.e.b(f10);
        PhotoViewer photoViewer = this.f;
        photoViewer.m3.h(f10, false);
        photoViewer.n3.invalidate();
    }
}
