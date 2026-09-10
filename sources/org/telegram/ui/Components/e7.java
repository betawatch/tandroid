package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ w70 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ e7(j8 j8Var, MessageObject messageObject, w70 w70Var, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.d = messageObject;
        this.c = w70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8 j8Var = this.b;
                j8Var.getClass();
                this.c.u();
                j8Var.q0(this.d);
                break;
            case 1:
                j8 j8Var2 = this.b;
                j8Var2.getClass();
                this.c.u();
                j8Var2.z0(this.d);
                break;
            case 2:
                j8 j8Var3 = this.b;
                MessageObject messageObject = this.d;
                j8Var3.v0(messageObject, false, new e7(j8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                j8 j8Var4 = this.b;
                j8Var4.getClass();
                this.c.u();
                j8Var4.q0(this.d);
                break;
            case 4:
                j8 j8Var5 = this.b;
                j8Var5.getClass();
                this.c.u();
                j8Var5.z0(this.d);
                break;
            case 5:
                j8.v(this.b, this.d, this.c);
                break;
            case 6:
                j8 j8Var6 = this.b;
                j8Var6.v0(this.d, true, new f7(j8Var6, this.c, 4), false);
                break;
            case 7:
                j8.L(this.b, this.d, this.c);
                break;
            default:
                this.b.u0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ e7(j8 j8Var, w70 w70Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.c = w70Var;
        this.d = messageObject;
    }
}
