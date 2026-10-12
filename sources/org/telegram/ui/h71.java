package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class h71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i71 b;

    public /* synthetic */ h71(i71 i71Var, int i10) {
        this.a = i10;
        this.b = i71Var;
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
