package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g61 b;

    public /* synthetic */ f61(g61 g61Var, int i10) {
        this.a = i10;
        this.b = g61Var;
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
