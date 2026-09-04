package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ n70 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ g7(k8 k8Var, MessageObject messageObject, n70 n70Var, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.d = messageObject;
        this.c = n70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8 k8Var = this.b;
                k8Var.getClass();
                this.c.u();
                k8Var.q0(this.d);
                break;
            case 1:
                k8 k8Var2 = this.b;
                k8Var2.getClass();
                this.c.u();
                k8Var2.z0(this.d);
                break;
            case 2:
                k8 k8Var3 = this.b;
                MessageObject messageObject = this.d;
                k8Var3.v0(messageObject, false, new g7(k8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                k8 k8Var4 = this.b;
                k8Var4.getClass();
                this.c.u();
                k8Var4.q0(this.d);
                break;
            case 4:
                k8 k8Var5 = this.b;
                k8Var5.getClass();
                this.c.u();
                k8Var5.z0(this.d);
                break;
            case 5:
                k8.v(this.b, this.d, this.c);
                break;
            case 6:
                k8 k8Var6 = this.b;
                k8Var6.v0(this.d, true, new h7(k8Var6, this.c, 4), false);
                break;
            case 7:
                k8.L(this.b, this.d, this.c);
                break;
            default:
                this.b.u0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ g7(k8 k8Var, n70 n70Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = n70Var;
        this.d = messageObject;
    }
}
