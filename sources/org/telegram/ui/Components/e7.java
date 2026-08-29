package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;
    public final /* synthetic */ j70 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ e7(g8 g8Var, MessageObject messageObject, j70 j70Var, int i10) {
        this.a = i10;
        this.b = g8Var;
        this.d = messageObject;
        this.c = j70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g8 g8Var = this.b;
                g8Var.getClass();
                this.c.u();
                g8Var.q0(this.d);
                break;
            case 1:
                g8 g8Var2 = this.b;
                g8Var2.getClass();
                this.c.u();
                g8Var2.z0(this.d);
                break;
            case 2:
                g8 g8Var3 = this.b;
                MessageObject messageObject = this.d;
                g8Var3.v0(messageObject, false, new e7(g8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                g8 g8Var4 = this.b;
                g8Var4.getClass();
                this.c.u();
                g8Var4.q0(this.d);
                break;
            case 4:
                g8 g8Var5 = this.b;
                g8Var5.getClass();
                this.c.u();
                g8Var5.z0(this.d);
                break;
            case 5:
                g8.v(this.b, this.d, this.c);
                break;
            case 6:
                g8 g8Var6 = this.b;
                g8Var6.v0(this.d, true, new f7(g8Var6, this.c, 4), false);
                break;
            case 7:
                g8.K(this.b, this.d, this.c);
                break;
            default:
                this.b.u0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ e7(g8 g8Var, j70 j70Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = g8Var;
        this.c = j70Var;
        this.d = messageObject;
    }
}
