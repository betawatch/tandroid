package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ pg0(vg0 vg0Var, int i7) {
        this.a = i7;
        this.b = vg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.h1(true, false);
                break;
            default:
                this.b.h1(true, false);
                break;
        }
    }
}
