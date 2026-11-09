package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ f70(g70 g70Var, boolean z9, boolean z10, int i7) {
        this.a = i7;
        this.b = g70Var;
        this.c = z9;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new f70(this.b, this.c, this.d, 1));
                break;
            default:
                g70 g70Var = this.b;
                g70Var.setJoinRequest(this.c);
                g70Var.setJoinToSend(this.d);
                break;
        }
    }
}
