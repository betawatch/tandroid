package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lv extends org.telegram.ui.Components.p6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ bx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(bx bxVar, int i7) {
        super("animationValue", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = bxVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = bxVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((bx) obj).W4(f10);
                break;
            default:
                bx bxVar = this.c;
                bxVar.J0 = f10;
                ((View) obj).setTranslationY(bxVar.K0 + f10);
                bxVar.R3();
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
