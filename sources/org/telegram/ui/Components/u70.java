package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ u70(v70 v70Var, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.b = v70Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new u70(this.b, this.c, this.d, 1));
                break;
            default:
                v70 v70Var = this.b;
                v70Var.setJoinRequest(this.c);
                v70Var.setJoinToSend(this.d);
                break;
        }
    }
}
