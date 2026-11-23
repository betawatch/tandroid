package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;

    public /* synthetic */ n90(r90 r90Var, int i7) {
        this.a = i7;
        this.b = r90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
