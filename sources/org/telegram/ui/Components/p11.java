package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
