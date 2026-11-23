package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i81 b;

    public /* synthetic */ b81(i81 i81Var, int i7) {
        this.a = i7;
        this.b = i81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(false);
                break;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                this.b.c(false);
                break;
        }
    }
}
