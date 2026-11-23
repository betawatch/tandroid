package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h11 b;

    public /* synthetic */ g11(h11 h11Var, int i7) {
        this.a = i7;
        this.b = h11Var;
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
