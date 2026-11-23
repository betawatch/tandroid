package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ za0 b;

    public /* synthetic */ ya0(za0 za0Var, int i7) {
        this.a = i7;
        this.b = za0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y();
                break;
            default:
                this.b.m(true);
                break;
        }
    }
}
