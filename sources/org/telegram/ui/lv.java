package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lv extends org.telegram.ui.Components.k6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ zw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(zw zwVar, int i7) {
        super("animationValue", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = zwVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = zwVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.k6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((zw) obj).O4(f10);
                break;
            default:
                zw zwVar = this.c;
                zwVar.I0 = f10;
                ((View) obj).setTranslationY(zwVar.J0 + f10);
                zwVar.R3();
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
