package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j11 b;

    public /* synthetic */ i11(j11 j11Var, int i7) {
        this.a = i7;
        this.b = j11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.widget.PopupWindow*/.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
