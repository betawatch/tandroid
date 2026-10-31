package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ut implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j20 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ ut(j20 j20Var, Exception exc, int i10) {
        this.a = i10;
        this.b = j20Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(null, this.c.getMessage());
                break;
            default:
                this.b.a(null, this.c.getMessage());
                break;
        }
    }
}
