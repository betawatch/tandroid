package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
