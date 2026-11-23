package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mv extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ cx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(cx cxVar, int i7) {
        super("animationValue", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = cxVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = cxVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((cx) obj).W4(f10);
                break;
            default:
                cx cxVar = this.c;
                cxVar.J0 = f10;
                ((View) obj).setTranslationY(cxVar.K0 + f10);
                cxVar.R3();
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
