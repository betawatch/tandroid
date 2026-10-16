package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gx extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ yy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(yy yyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = yyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = yyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((yy) obj).A4(f7);
                break;
            default:
                yy yyVar = this.c;
                yyVar.I0 = f7;
                ((View) obj).setTranslationY(yyVar.J0 + f7);
                yyVar.D3();
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
