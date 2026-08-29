package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hs0 extends org.telegram.ui.Components.q00 {
    public final /* synthetic */ pr0 e;
    public final /* synthetic */ PhotoViewer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(PhotoViewer photoViewer, pr0 pr0Var) {
        super(false);
        this.f = photoViewer;
        this.e = pr0Var;
    }

    @Override // org.telegram.ui.Components.xn0
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

    @Override // org.telegram.ui.Components.q00
    public final float k() {
        return this.f.m3.c();
    }

    @Override // org.telegram.ui.Components.q00
    public final void l(float f9) {
        this.e.c(f9);
        PhotoViewer photoViewer = this.f;
        photoViewer.m3.h(f9, false);
        photoViewer.n3.invalidate();
    }
}
