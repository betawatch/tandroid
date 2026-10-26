package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class iw extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ cy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(cy cyVar, int i10) {
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

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((cy) obj).K4(f7);
                break;
            default:
                cy cyVar = this.c;
                cyVar.I0 = f7;
                ((View) obj).setTranslationY(cyVar.J0 + f7);
                cyVar.N3();
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
