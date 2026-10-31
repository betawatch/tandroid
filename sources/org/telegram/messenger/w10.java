package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class w10 implements q20 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ w10(int i10, Runnable runnable, boolean[] zArr) {
        this.a = zArr;
        this.b = i10;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        this.a[this.b] = ((Boolean) obj).booleanValue();
        this.c.run();
    }
}
