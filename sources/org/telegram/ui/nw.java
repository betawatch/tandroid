package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nw extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ay c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ay ayVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = ayVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = ayVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ay) obj).N4(f7);
                break;
            default:
                ay ayVar = this.c;
                ayVar.I0 = f7;
                ((View) obj).setTranslationY(ayVar.J0 + f7);
                ayVar.Q3();
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
