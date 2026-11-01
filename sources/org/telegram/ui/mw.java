package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mw extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ zx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(zx zxVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = zxVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = zxVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((zx) obj).O4(f7);
                break;
            default:
                zx zxVar = this.c;
                zxVar.I0 = f7;
                ((View) obj).setTranslationY(zxVar.J0 + f7);
                zxVar.R3();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.N);
            default:
                return Float.valueOf(this.c.I0);
        }
    }
}
