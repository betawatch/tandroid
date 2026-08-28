package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mw extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ dy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(dy dyVar, int i9) {
        super("animationValue", 0);
        this.b = i9;
        switch (i9) {
            case 1:
                this.c = dyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = dyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((dy) obj).C4(f10);
                break;
            default:
                dy dyVar = this.c;
                dyVar.E0 = f10;
                ((View) obj).setTranslationY(dyVar.F0 + f10);
                dyVar.F3();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.J);
            default:
                return Float.valueOf(this.c.E0);
        }
    }
}
