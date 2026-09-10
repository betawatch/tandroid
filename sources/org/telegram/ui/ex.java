package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ex extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ wy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(wy wyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = wyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = wyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((wy) obj).C4(f7);
                break;
            default:
                wy wyVar = this.c;
                wyVar.I0 = f7;
                ((View) obj).setTranslationY(wyVar.J0 + f7);
                wyVar.F3();
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
