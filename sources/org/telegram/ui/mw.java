package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mw extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ey c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(ey eyVar, int i10) {
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

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ey) obj).A4(f7);
                break;
            default:
                ey eyVar = this.c;
                eyVar.I0 = f7;
                ((View) obj).setTranslationY(eyVar.J0 + f7);
                eyVar.D3();
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
