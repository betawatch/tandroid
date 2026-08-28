package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ int c;

    public /* synthetic */ jm(jn jnVar, int i9, int i10) {
        this.a = i10;
        this.b = jnVar;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d0(this.c, null);
                break;
            case 1:
                this.b.a0(this.c);
                break;
            default:
                this.b.d0(this.c, null);
                break;
        }
    }
}
