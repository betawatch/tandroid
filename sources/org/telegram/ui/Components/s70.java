package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s70(t70 t70Var, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.b = t70Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new s70(this.b, this.c, this.d, 1));
                break;
            default:
                t70 t70Var = this.b;
                t70Var.setJoinRequest(this.c);
                t70Var.setJoinToSend(this.d);
                break;
        }
    }
}
