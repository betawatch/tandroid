package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kv extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ yw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(yw ywVar, int i7) {
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

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((yw) obj).O4(f10);
                break;
            default:
                yw ywVar = this.c;
                ywVar.I0 = f10;
                ((View) obj).setTranslationY(ywVar.J0 + f10);
                ywVar.R3();
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
