package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mu0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vr0(mu0 mu0Var, int i10, int i11) {
        this.a = i11;
        this.b = mu0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.scrollBy(0, this.c);
                break;
            default:
                this.b.h.scrollBy(0, this.c);
                break;
        }
    }
}
