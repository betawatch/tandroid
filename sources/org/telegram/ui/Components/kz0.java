package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz0 b;
    public final /* synthetic */ lz0 c;

    public /* synthetic */ kz0(mz0 mz0Var, lz0 lz0Var, int i7) {
        this.a = i7;
        this.b = mz0Var;
        this.c = lz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
