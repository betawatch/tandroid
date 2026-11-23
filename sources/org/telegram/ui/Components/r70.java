package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ r70(s70 s70Var, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.b = s70Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new r70(this.b, this.c, this.d, 1));
                break;
            default:
                s70 s70Var = this.b;
                s70Var.setJoinRequest(this.c);
                s70Var.setJoinToSend(this.d);
                break;
        }
    }
}
