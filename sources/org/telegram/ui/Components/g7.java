package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ i80 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ g7(k8 k8Var, MessageObject messageObject, i80 i80Var, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.d = messageObject;
        this.c = i80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8 k8Var = this.b;
                k8Var.getClass();
                this.c.u();
                k8Var.r0(this.d);
                break;
            case 1:
                k8 k8Var2 = this.b;
                k8Var2.getClass();
                this.c.u();
                k8Var2.A0(this.d);
                break;
            case 2:
                k8 k8Var3 = this.b;
                MessageObject messageObject = this.d;
                k8Var3.w0(messageObject, false, new g7(k8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                k8 k8Var4 = this.b;
                k8Var4.getClass();
                this.c.u();
                k8Var4.r0(this.d);
                break;
            case 4:
                k8 k8Var5 = this.b;
                k8Var5.getClass();
                this.c.u();
                k8Var5.A0(this.d);
                break;
            case 5:
                k8.x(this.b, this.d, this.c);
                break;
            case 6:
                k8 k8Var6 = this.b;
                k8Var6.w0(this.d, true, new h7(k8Var6, this.c, 4), false);
                break;
            case 7:
                k8.M(this.b, this.d, this.c);
                break;
            default:
                this.b.v0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ g7(k8 k8Var, i80 i80Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = i80Var;
        this.d = messageObject;
    }
}
