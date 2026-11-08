package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v81 b;

    public /* synthetic */ p81(v81 v81Var, int i7) {
        this.a = i7;
        this.b = v81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v81 v81Var = this.b;
                v81Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) v81Var, 11, false).show();
                break;
            default:
                v81 v81Var2 = this.b;
                v81Var2.e.requestFocus();
                org.telegram.messenger.g0.K3(v81Var2.e);
                break;
        }
    }
}
