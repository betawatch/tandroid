package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ow extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ fy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(fy fyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = fyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = fyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f9) {
        switch (this.b) {
            case 0:
                ((fy) obj).C4(f9);
                break;
            default:
                fy fyVar = this.c;
                fyVar.E0 = f9;
                ((View) obj).setTranslationY(fyVar.F0 + f9);
                fyVar.F3();
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
