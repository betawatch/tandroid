package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ h70(i70 i70Var, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.b = i70Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new h70(this.b, this.c, this.d, 1));
                break;
            default:
                i70 i70Var = this.b;
                i70Var.setJoinRequest(this.c);
                i70Var.setJoinToSend(this.d);
                break;
        }
    }
}
