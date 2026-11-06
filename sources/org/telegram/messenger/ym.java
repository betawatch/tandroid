package org.telegram.messenger;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class ym implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;
    public final /* synthetic */ int c;

    public /* synthetic */ ym(q0.a aVar, int i7, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.accept(Integer.valueOf(this.c));
                break;
            default:
                this.b.accept(Integer.valueOf(this.c));
                break;
        }
    }
}
