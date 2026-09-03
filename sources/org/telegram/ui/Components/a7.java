package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;
    public final /* synthetic */ p70 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ a7(c8 c8Var, MessageObject messageObject, p70 p70Var, int i10) {
        this.a = i10;
        this.b = c8Var;
        this.d = messageObject;
        this.c = p70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8 c8Var = this.b;
                c8Var.getClass();
                this.c.u();
                c8Var.q0(this.d);
                break;
            case 1:
                c8 c8Var2 = this.b;
                c8Var2.getClass();
                this.c.u();
                c8Var2.z0(this.d);
                break;
            case 2:
                c8 c8Var3 = this.b;
                MessageObject messageObject = this.d;
                c8Var3.v0(messageObject, false, new a7(c8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                c8 c8Var4 = this.b;
                c8Var4.getClass();
                this.c.u();
                c8Var4.q0(this.d);
                break;
            case 4:
                c8 c8Var5 = this.b;
                c8Var5.getClass();
                this.c.u();
                c8Var5.z0(this.d);
                break;
            case 5:
                c8.v(this.b, this.d, this.c);
                break;
            case 6:
                c8 c8Var6 = this.b;
                c8Var6.v0(this.d, true, new b7(c8Var6, this.c, 4), false);
                break;
            case 7:
                c8.K(this.b, this.d, this.c);
                break;
            default:
                this.b.u0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ a7(c8 c8Var, p70 p70Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = c8Var;
        this.c = p70Var;
        this.d = messageObject;
    }
}
