package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s90 b;

    public /* synthetic */ o90(s90 s90Var, int i7) {
        this.a = i7;
        this.b = s90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
