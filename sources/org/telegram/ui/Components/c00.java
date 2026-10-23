package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e00 e00Var = (e00) this.e;
                if (this.b) {
                    i00 i00Var = e00Var.J;
                    i00Var.a = true;
                    i00Var.b = true;
                }
                if (this.c) {
                    e00Var.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(e00Var.a0 - currentTimeMillis) > 30) {
                    e00Var.a0 = currentTimeMillis;
                    e00Var.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.dg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
