package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class iv extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ww c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(ww wwVar, int i7) {
        super("animationValue", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = wwVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = wwVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ww) obj).O4(f10);
                break;
            default:
                ww wwVar = this.c;
                wwVar.I0 = f10;
                ((View) obj).setTranslationY(wwVar.J0 + f10);
                wwVar.R3();
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
