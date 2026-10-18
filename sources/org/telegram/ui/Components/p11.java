package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r11 b;
    public final /* synthetic */ q11 c;

    public /* synthetic */ p11(r11 r11Var, q11 q11Var, int i10) {
        this.a = i10;
        this.b = r11Var;
        this.c = q11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
