package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i11 b;

    public /* synthetic */ h11(i11 i11Var, int i7) {
        this.a = i7;
        this.b = i11Var;
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
