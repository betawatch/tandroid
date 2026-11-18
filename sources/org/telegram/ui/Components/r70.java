package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r70(t70 t70Var, boolean z10, int i7) {
        this.a = i7;
        this.b = t70Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new r70(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
