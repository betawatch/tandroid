package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
