package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class py implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ py(kz kzVar, int i7) {
        this.a = i7;
        this.b = kzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kz.a0(this.b);
                break;
            default:
                kz.b0(this.b);
                break;
        }
    }
}
