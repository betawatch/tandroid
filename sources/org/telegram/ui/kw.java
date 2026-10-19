package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class kw extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ cy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(cy cyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = cyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = cyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((cy) obj).A4(f7);
                break;
            default:
                cy cyVar = this.c;
                cyVar.I0 = f7;
                ((View) obj).setTranslationY(cyVar.J0 + f7);
                cyVar.D3();
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
