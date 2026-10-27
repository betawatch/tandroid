package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kw extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ey c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(ey eyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = eyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = eyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ey) obj).K4(f7);
                break;
            default:
                ey eyVar = this.c;
                eyVar.I0 = f7;
                ((View) obj).setTranslationY(eyVar.J0 + f7);
                eyVar.N3();
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
