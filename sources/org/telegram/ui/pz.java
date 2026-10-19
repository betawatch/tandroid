package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;

    public /* synthetic */ pz(n00 n00Var, int i10) {
        this.a = i10;
        this.b = n00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n00.V(this.b);
                break;
            default:
                n00.W(this.b);
                break;
        }
    }
}
