package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.lr b;

    public /* synthetic */ z1(org.telegram.messenger.lr lrVar, int i7) {
        this.a = i7;
        this.b = lrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.lr lrVar = this.b;
                if (lrVar != null) {
                    lrVar.q(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.lr lrVar2 = this.b;
                if (lrVar2 != null) {
                    lrVar2.q(false);
                    break;
                }
                break;
        }
    }
}
