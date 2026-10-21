package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
