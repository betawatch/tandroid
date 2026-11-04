package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fv extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ uw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(uw uwVar, int i3) {
        super("animationValue", 0);
        this.b = i3;
        switch (i3) {
            case 1:
                this.c = uwVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = uwVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((uw) obj).O4(f10);
                break;
            default:
                uw uwVar = this.c;
                uwVar.J0 = f10;
                ((View) obj).setTranslationY(uwVar.K0 + f10);
                uwVar.R3();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.O);
            default:
                return Float.valueOf(this.c.J0);
        }
    }
}
