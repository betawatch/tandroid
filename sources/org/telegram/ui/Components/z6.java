package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;
    public final /* synthetic */ x60 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ z6(c8 c8Var, MessageObject messageObject, x60 x60Var, int i9) {
        this.a = i9;
        this.b = c8Var;
        this.d = messageObject;
        this.c = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8 c8Var = this.b;
                c8Var.getClass();
                this.c.u();
                c8Var.p0(this.d);
                break;
            case 1:
                c8 c8Var2 = this.b;
                c8Var2.getClass();
                this.c.u();
                c8Var2.y0(this.d);
                break;
            case 2:
                c8 c8Var3 = this.b;
                MessageObject messageObject = this.d;
                c8Var3.u0(messageObject, false, new z6(c8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                c8 c8Var4 = this.b;
                c8Var4.getClass();
                this.c.u();
                c8Var4.p0(this.d);
                break;
            case 4:
                c8 c8Var5 = this.b;
                c8Var5.getClass();
                this.c.u();
                c8Var5.y0(this.d);
                break;
            case 5:
                c8.v(this.b, this.d, this.c);
                break;
            case 6:
                c8 c8Var6 = this.b;
                c8Var6.u0(this.d, true, new a7(c8Var6, this.c, 4), false);
                break;
            case 7:
                c8.K(this.b, this.d, this.c);
                break;
            default:
                this.b.t0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ z6(c8 c8Var, x60 x60Var, MessageObject messageObject, int i9) {
        this.a = i9;
        this.b = c8Var;
        this.c = x60Var;
        this.d = messageObject;
    }
}
