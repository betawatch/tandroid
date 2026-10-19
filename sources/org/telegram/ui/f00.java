package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g00 b;

    public /* synthetic */ f00(g00 g00Var, int i10) {
        this.a = i10;
        this.b = g00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                g00 g00Var = this.b;
                g00Var.b(g00Var.y);
                break;
        }
    }
}
