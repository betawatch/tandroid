package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d7(m7 m7Var, int i10, int i11) {
        this.a = i11;
        this.b = m7Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.F0.add(Integer.valueOf(this.c));
                break;
            case 1:
                this.b.F0.remove(Integer.valueOf(this.c));
                break;
            case 2:
                this.b.F0.remove(Integer.valueOf(this.c));
                break;
            default:
                m7 m7Var = this.b;
                z7 z7Var = m7Var.g0;
                if (z7Var != null) {
                    z7Var.b(m7Var, this.c);
                }
                m7Var.i();
                break;
        }
    }
}
