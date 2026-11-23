package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p30 b;

    public /* synthetic */ o30(p30 p30Var, int i7) {
        this.a = i7;
        this.b = p30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p30 p30Var = this.b;
                tv tvVar = p30Var.b;
                if (tvVar != null) {
                    tvVar.setVisibility(0);
                }
                org.telegram.messenger.g0.h3(new o30(p30Var, 2), 16L);
                break;
            case 1:
                tv tvVar2 = this.b.b;
                if (tvVar2 != null) {
                    tvVar2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
