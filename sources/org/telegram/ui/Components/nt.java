package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;

    public /* synthetic */ nt(pt ptVar, int i7) {
        this.a = i7;
        this.b = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pt ptVar = this.b;
                ptVar.post(new nt(ptVar, 1));
                break;
            default:
                pt ptVar2 = this.b;
                ptVar2.h();
                ptVar2.d();
                break;
        }
    }
}
