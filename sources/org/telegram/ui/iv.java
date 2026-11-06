package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class iv extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ww c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(ww wwVar, int i7) {
        super("animationValue", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = wwVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = wwVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ww) obj).O4(f10);
                break;
            default:
                ww wwVar = this.c;
                wwVar.I0 = f10;
                ((View) obj).setTranslationY(wwVar.J0 + f10);
                wwVar.R3();
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
