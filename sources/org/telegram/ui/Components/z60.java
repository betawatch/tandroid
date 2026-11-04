package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z60(b70 b70Var, boolean z10, int i3) {
        this.a = i3;
        this.b = b70Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new z60(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
