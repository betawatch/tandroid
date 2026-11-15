package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jv extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ yw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(yw ywVar, int i7) {
        super("animationValue", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = ywVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = ywVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((yw) obj).O4(f10);
                break;
            default:
                yw ywVar = this.c;
                ywVar.J0 = f10;
                ((View) obj).setTranslationY(ywVar.K0 + f10);
                ywVar.R3();
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
