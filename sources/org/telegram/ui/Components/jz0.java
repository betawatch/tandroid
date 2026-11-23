package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz0 b;
    public final /* synthetic */ kz0 c;

    public /* synthetic */ jz0(lz0 lz0Var, kz0 kz0Var, int i7) {
        this.a = i7;
        this.b = lz0Var;
        this.c = kz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
