package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a70(b70 b70Var, boolean z10, boolean z11, int i3) {
        this.a = i3;
        this.b = b70Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new a70(this.b, this.c, this.d, 1));
                break;
            default:
                b70 b70Var = this.b;
                b70Var.setJoinRequest(this.c);
                b70Var.setJoinToSend(this.d);
                break;
        }
    }
}
