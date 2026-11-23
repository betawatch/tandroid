package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u81 b;

    public /* synthetic */ p81(u81 u81Var, int i7) {
        this.a = i7;
        this.b = u81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u81 u81Var = this.b;
                u81Var.getClass();
                new ug.y0((org.telegram.ui.ActionBar.g2) u81Var, 11, false).show();
                break;
            default:
                u81 u81Var2 = this.b;
                u81Var2.e.requestFocus();
                org.telegram.messenger.g0.I3(u81Var2.e);
                break;
        }
    }
}
