package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class c10 implements x10 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ c10(int i7, Runnable runnable, boolean[] zArr) {
        this.a = zArr;
        this.b = i7;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        this.a[this.b] = ((Boolean) obj).booleanValue();
        this.c.run();
    }
}
