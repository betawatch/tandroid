package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yk0 b;

    public /* synthetic */ wk0(yk0 yk0Var, int i7) {
        this.a = i7;
        this.b = yk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yk0 yk0Var = this.b;
                yk0Var.getClass();
                org.telegram.messenger.g0.g3(new wk0(yk0Var, 2));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new wk0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
