package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;

    public /* synthetic */ oy(jz jzVar, int i7) {
        this.a = i7;
        this.b = jzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jz.a0(this.b);
                break;
            default:
                jz.b0(this.b);
                break;
        }
    }
}
