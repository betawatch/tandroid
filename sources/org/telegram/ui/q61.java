package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r61 b;

    public /* synthetic */ q61(r61 r61Var, int i10) {
        this.a = i10;
        this.b = r61Var;
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
