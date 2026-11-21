package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z2(e3 e3Var, int i7, int i10) {
        this.a = i10;
        this.b = e3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
