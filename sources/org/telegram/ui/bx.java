package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bx extends org.telegram.ui.Components.t6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ty c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(ty tyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = tyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = tyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.t6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ty) obj).z4(f7);
                break;
            default:
                ty tyVar = this.c;
                tyVar.I0 = f7;
                ((View) obj).setTranslationY(tyVar.J0 + f7);
                tyVar.C3();
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
