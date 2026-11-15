package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class f10 implements z10 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ f10(int i7, Runnable runnable, boolean[] zArr) {
        this.a = zArr;
        this.b = i7;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        this.a[this.b] = ((Boolean) obj).booleanValue();
        this.c.run();
    }
}
