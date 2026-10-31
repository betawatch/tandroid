package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;
    public final /* synthetic */ l7 c;

    public /* synthetic */ e7(m7 m7Var, l7 l7Var, int i10) {
        this.a = i10;
        this.b = m7Var;
        this.c = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7 m7Var = this.b;
                m7Var.getClass();
                l7 l7Var = this.c;
                l7Var.l = null;
                m7Var.H0.remove(l7Var);
                l7Var.k = true;
                break;
            default:
                m7 m7Var2 = this.b;
                l7 l7Var2 = this.c;
                m7Var2.m(l7Var2, null);
                l7Var2.f.freeResources();
                break;
        }
    }
}
