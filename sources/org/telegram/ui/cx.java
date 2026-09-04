package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class cx extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ uy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(uy uyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = uyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = uyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((uy) obj).C4(f7);
                break;
            default:
                uy uyVar = this.c;
                uyVar.I0 = f7;
                ((View) obj).setTranslationY(uyVar.J0 + f7);
                uyVar.F3();
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
