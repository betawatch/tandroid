package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.u b;

    public /* synthetic */ g11(bi.u uVar, int i7) {
        this.a = i7;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.I3(((k01) this.b.f2).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
