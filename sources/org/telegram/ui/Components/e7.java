package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ v70 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ e7(i8 i8Var, MessageObject messageObject, v70 v70Var, int i10) {
        this.a = i10;
        this.b = i8Var;
        this.d = messageObject;
        this.c = v70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i8 i8Var = this.b;
                i8Var.getClass();
                this.c.u();
                i8Var.q0(this.d);
                break;
            case 1:
                i8 i8Var2 = this.b;
                i8Var2.getClass();
                this.c.u();
                i8Var2.z0(this.d);
                break;
            case 2:
                i8 i8Var3 = this.b;
                MessageObject messageObject = this.d;
                i8Var3.v0(messageObject, false, new e7(i8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                i8 i8Var4 = this.b;
                i8Var4.getClass();
                this.c.u();
                i8Var4.q0(this.d);
                break;
            case 4:
                i8 i8Var5 = this.b;
                i8Var5.getClass();
                this.c.u();
                i8Var5.z0(this.d);
                break;
            case 5:
                i8.v(this.b, this.d, this.c);
                break;
            case 6:
                i8 i8Var6 = this.b;
                i8Var6.v0(this.d, true, new f7(i8Var6, this.c, 4), false);
                break;
            case 7:
                i8.L(this.b, this.d, this.c);
                break;
            default:
                this.b.u0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ e7(i8 i8Var, v70 v70Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = i8Var;
        this.c = v70Var;
        this.d = messageObject;
    }
}
