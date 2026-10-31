package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.j20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ b31(String str, int i10, org.telegram.messenger.j20 j20Var) {
        this.a = i10;
        this.b = j20Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.j20 j20Var = this.b;
                if (j20Var != null) {
                    j20Var.a(this.c, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                this.b.a(null, this.c);
                break;
            default:
                this.b.a(null, this.c);
                break;
        }
    }
}
