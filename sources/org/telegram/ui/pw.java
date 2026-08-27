package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pw extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ gy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(gy gyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = gyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = gyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((gy) obj).C4(f10);
                break;
            default:
                gy gyVar = this.c;
                gyVar.E0 = f10;
                ((View) obj).setTranslationY(gyVar.F0 + f10);
                gyVar.F3();
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
