package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ b70 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ z6(b8 b8Var, MessageObject messageObject, b70 b70Var, int i10) {
        this.a = i10;
        this.b = b8Var;
        this.d = messageObject;
        this.c = b70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                b8Var.getClass();
                this.c.u();
                b8Var.q0(this.d);
                break;
            case 1:
                b8 b8Var2 = this.b;
                b8Var2.getClass();
                this.c.u();
                b8Var2.z0(this.d);
                break;
            case 2:
                b8 b8Var3 = this.b;
                MessageObject messageObject = this.d;
                b8Var3.v0(messageObject, false, new z6(b8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                b8 b8Var4 = this.b;
                b8Var4.getClass();
                this.c.u();
                b8Var4.q0(this.d);
                break;
            case 4:
                b8 b8Var5 = this.b;
                b8Var5.getClass();
                this.c.u();
                b8Var5.z0(this.d);
                break;
            case 5:
                b8.w(this.b, this.d, this.c);
                break;
            case 6:
                b8 b8Var6 = this.b;
                b8Var6.v0(this.d, true, new a7(b8Var6, this.c, 4), false);
                break;
            case 7:
                b8.L(this.b, this.d, this.c);
                break;
            default:
                this.b.u0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ z6(b8 b8Var, b70 b70Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = b8Var;
        this.c = b70Var;
        this.d = messageObject;
    }
}
