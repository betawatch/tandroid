package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                f3 f3Var = (f3) this.b;
                f3Var.G = f7;
                f3Var.c();
                break;
            case 1:
                i8 i8Var = (i8) this.b;
                i8Var.e = f7;
                i8Var.setScaleX(f7);
                i8Var.setScaleY(f7);
                break;
            case 2:
                i9 i9Var = (i9) this.b;
                i9Var.Y = f7;
                i9Var.A0();
                break;
            default:
                ((h9) this.b).c.setConversionWobble(f7);
                break;
        }
    }
}
