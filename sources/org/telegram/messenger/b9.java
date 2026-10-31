package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ b9(d9 d9Var, int[] iArr, int i10) {
        this.a = i10;
        this.b = d9Var;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q.add(Integer.valueOf(this.c[0]));
                break;
            default:
                this.b.q.remove(Integer.valueOf(this.c[0]));
                break;
        }
    }
}
