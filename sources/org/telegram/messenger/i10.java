package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i10 implements c20 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ i10(int i7, Runnable runnable, boolean[] zArr) {
        this.a = zArr;
        this.b = i7;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        this.a[this.b] = ((Boolean) obj).booleanValue();
        this.c.run();
    }
}
