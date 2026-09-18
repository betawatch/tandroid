package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ n70 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ d7(h8 h8Var, MessageObject messageObject, n70 n70Var, int i10) {
        this.a = i10;
        this.b = h8Var;
        this.d = messageObject;
        this.c = n70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8 h8Var = this.b;
                h8Var.getClass();
                this.c.u();
                h8Var.q0(this.d);
                break;
            case 1:
                h8 h8Var2 = this.b;
                h8Var2.getClass();
                this.c.u();
                h8Var2.z0(this.d);
                break;
            case 2:
                h8 h8Var3 = this.b;
                MessageObject messageObject = this.d;
                h8Var3.v0(messageObject, false, new d7(h8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                h8 h8Var4 = this.b;
                h8Var4.getClass();
                this.c.u();
                h8Var4.q0(this.d);
                break;
            case 4:
                h8 h8Var5 = this.b;
                h8Var5.getClass();
                this.c.u();
                h8Var5.z0(this.d);
                break;
            case 5:
                h8.v(this.b, this.d, this.c);
                break;
            case 6:
                h8 h8Var6 = this.b;
                h8Var6.v0(this.d, true, new e7(h8Var6, this.c, 4), false);
                break;
            case 7:
                h8.L(this.b, this.d, this.c);
                break;
            default:
                this.b.u0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ d7(h8 h8Var, n70 n70Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = h8Var;
        this.c = n70Var;
        this.d = messageObject;
    }
}
